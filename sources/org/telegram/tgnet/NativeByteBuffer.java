package org.telegram.tgnet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public class NativeByteBuffer extends AbstractSerializedData {
    private static final ThreadLocal<LinkedList<NativeByteBuffer>> addressWrappers = new ThreadLocal<LinkedList<NativeByteBuffer>>() {
        @Override
        public LinkedList<NativeByteBuffer> initialValue() {
            return new LinkedList<>();
        }
    };
    protected long address;
    public ByteBuffer buffer;
    private boolean justCalc;
    private int len;
    public boolean reused = true;

    public static native long native_getFreeBuffer(int i);

    public static native ByteBuffer native_getJavaByteBuffer(long j);

    public static native int native_limit(long j);

    public static native int native_position(long j);

    public static native void native_reuse(long j);

    public int getIntFromByte(byte b) {
        return b >= 0 ? b : b + 256;
    }

    public static NativeByteBuffer wrap(long j) {
        if (j == 0) {
            return null;
        }
        NativeByteBuffer nativeByteBufferPoll = addressWrappers.get().poll();
        if (nativeByteBufferPoll == null) {
            nativeByteBufferPoll = new NativeByteBuffer(0, true);
        }
        nativeByteBufferPoll.address = j;
        nativeByteBufferPoll.reused = false;
        ByteBuffer byteBufferNative_getJavaByteBuffer = native_getJavaByteBuffer(j);
        nativeByteBufferPoll.buffer = byteBufferNative_getJavaByteBuffer;
        byteBufferNative_getJavaByteBuffer.limit(native_limit(j));
        int iNative_position = native_position(j);
        if (iNative_position <= nativeByteBufferPoll.buffer.limit()) {
            nativeByteBufferPoll.buffer.position(iNative_position);
        }
        nativeByteBufferPoll.buffer.order(ByteOrder.LITTLE_ENDIAN);
        return nativeByteBufferPoll;
    }

    private NativeByteBuffer(int i, boolean z) {
    }

    public NativeByteBuffer(int i) throws Exception {
        if (i >= 0) {
            long jNative_getFreeBuffer = native_getFreeBuffer(i);
            this.address = jNative_getFreeBuffer;
            if (jNative_getFreeBuffer != 0) {
                ByteBuffer byteBufferNative_getJavaByteBuffer = native_getJavaByteBuffer(jNative_getFreeBuffer);
                this.buffer = byteBufferNative_getJavaByteBuffer;
                byteBufferNative_getJavaByteBuffer.position(0);
                this.buffer.limit(i);
                this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                return;
            }
            return;
        }
        throw new Exception("invalid NativeByteBuffer size");
    }

    public NativeByteBuffer(boolean z) {
        this.justCalc = z;
    }

    public int position() {
        return this.buffer.position();
    }

    public void position(int i) {
        this.buffer.position(i);
    }

    public int capacity() {
        return this.buffer.capacity();
    }

    public int limit() {
        return this.buffer.limit();
    }

    public void limit(int i) {
        this.buffer.limit(i);
    }

    public void put(ByteBuffer byteBuffer) {
        this.buffer.put(byteBuffer);
    }

    public void rewind() {
        if (this.justCalc) {
            this.len = 0;
        } else {
            this.buffer.rewind();
        }
    }

    public void compact() {
        this.buffer.compact();
    }

    public boolean hasRemaining() {
        return this.buffer.hasRemaining();
    }

    @Override
    public void writeInt32(int i) {
        try {
            if (!this.justCalc) {
                this.buffer.putInt(i);
            } else {
                this.len += 4;
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write int32 error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeInt64(long j) {
        try {
            if (!this.justCalc) {
                this.buffer.putLong(j);
            } else {
                this.len += 8;
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write int64 error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeFloat(float f) {
        try {
            if (!this.justCalc) {
                this.buffer.putInt(Float.floatToIntBits(f));
            } else {
                this.len += 4;
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write float error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeBool(boolean z) {
        if (this.justCalc) {
            this.len += 4;
        } else if (z) {
            writeInt32(-1720552011);
        } else {
            writeInt32(-1132882121);
        }
    }

    @Override
    public void writeBytes(byte[] bArr) {
        try {
            if (!this.justCalc) {
                this.buffer.put(bArr);
            } else {
                this.len += bArr.length;
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write raw error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeBytes(byte[] bArr, int i, int i2) {
        try {
            if (!this.justCalc) {
                this.buffer.put(bArr, i, i2);
            } else {
                this.len += i2;
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write raw error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeByte(int i) {
        writeByte((byte) i);
    }

    @Override
    public void writeByte(byte b) {
        try {
            if (!this.justCalc) {
                this.buffer.put(b);
            } else {
                this.len++;
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeString(String str) {
        if (str == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write string null");
                FileLog.e(new Throwable());
            }
            str = "";
        }
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write string error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeByteArray(byte[] bArr, int i, int i2) {
        try {
            if (i2 <= 253) {
                if (!this.justCalc) {
                    this.buffer.put((byte) i2);
                } else {
                    this.len++;
                }
            } else if (!this.justCalc) {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) i2);
                this.buffer.put((byte) (i2 >> 8));
                this.buffer.put((byte) (i2 >> 16));
            } else {
                this.len += 4;
            }
            if (!this.justCalc) {
                this.buffer.put(bArr, i, i2);
            } else {
                this.len += i2;
            }
            for (int i3 = i2 <= 253 ? 1 : 4; (i2 + i3) % 4 != 0; i3++) {
                if (!this.justCalc) {
                    this.buffer.put((byte) 0);
                } else {
                    this.len++;
                }
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte array error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeByteArray(byte[] bArr) {
        try {
            if (bArr.length <= 253) {
                if (!this.justCalc) {
                    this.buffer.put((byte) bArr.length);
                } else {
                    this.len++;
                }
            } else if (!this.justCalc) {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) bArr.length);
                this.buffer.put((byte) (bArr.length >> 8));
                this.buffer.put((byte) (bArr.length >> 16));
            } else {
                this.len += 4;
            }
            if (!this.justCalc) {
                this.buffer.put(bArr);
            } else {
                this.len += bArr.length;
            }
            for (int i = bArr.length <= 253 ? 1 : 4; (bArr.length + i) % 4 != 0; i++) {
                if (!this.justCalc) {
                    this.buffer.put((byte) 0);
                } else {
                    this.len++;
                }
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte array error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write double error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeByteBuffer(NativeByteBuffer nativeByteBuffer) {
        try {
            int iLimit = nativeByteBuffer.limit();
            if (iLimit <= 253) {
                if (!this.justCalc) {
                    this.buffer.put((byte) iLimit);
                } else {
                    this.len++;
                }
            } else if (!this.justCalc) {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) iLimit);
                this.buffer.put((byte) (iLimit >> 8));
                this.buffer.put((byte) (iLimit >> 16));
            } else {
                this.len += 4;
            }
            if (!this.justCalc) {
                nativeByteBuffer.rewind();
                this.buffer.put(nativeByteBuffer.buffer);
            } else {
                this.len += iLimit;
            }
            for (int i = iLimit <= 253 ? 1 : 4; (iLimit + i) % 4 != 0; i++) {
                if (!this.justCalc) {
                    this.buffer.put((byte) 0);
                } else {
                    this.len++;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void writeBytes(NativeByteBuffer nativeByteBuffer) {
        if (this.justCalc) {
            this.len += nativeByteBuffer.limit();
        } else {
            nativeByteBuffer.rewind();
            this.buffer.put(nativeByteBuffer.buffer);
        }
    }

    @Override
    public int length() {
        if (!this.justCalc) {
            return this.buffer.position();
        }
        return this.len;
    }

    @Override
    public void skip(int i) {
        if (i == 0) {
            return;
        }
        if (!this.justCalc) {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            this.len += i;
        }
    }

    @Override
    public int getPosition() {
        return this.buffer.position();
    }

    @Override
    public byte readByte(boolean z) {
        try {
            return this.buffer.get();
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read byte error", e);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return (byte) 0;
            }
            FileLog.e("read byte error");
            FileLog.e(e);
            return (byte) 0;
        }
    }

    @Override
    public int readInt32(boolean z) {
        try {
            return this.buffer.getInt();
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read int32 error", e);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return 0;
            }
            FileLog.e("read int32 error");
            FileLog.e(e);
            return 0;
        }
    }

    @Override
    public float readFloat(boolean z) {
        try {
            return Float.intBitsToFloat(this.buffer.getInt());
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read float error", e);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return 0.0f;
            }
            FileLog.e("read float error");
            FileLog.e(e);
            return 0.0f;
        }
    }

    @Override
    public boolean readBool(boolean z) {
        int int32 = readInt32(z);
        if (int32 == -1720552011) {
            return true;
        }
        if (int32 == -1132882121) {
            return false;
        }
        if (z) {
            throw new RuntimeException("Not bool value!");
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("Not bool value!");
        }
        return false;
    }

    @Override
    public long readInt64(boolean z) {
        try {
            return this.buffer.getLong();
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read int64 error", e);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return 0L;
            }
            FileLog.e("read int64 error");
            FileLog.e(e);
            return 0L;
        }
    }

    @Override
    public void readBytes(byte[] bArr, boolean z) {
        try {
            this.buffer.get(bArr);
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read raw error", e);
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("read raw error");
                FileLog.e(e);
            }
        }
    }

    public void readBytes(byte[] bArr, int i, int i2, boolean z) {
        try {
            this.buffer.get(bArr, i, i2);
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read raw error", e);
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("read raw error");
                FileLog.e(e);
            }
        }
    }

    public String hex() {
        try {
            return Utilities.bytesToHex(readData(Math.min(limit(), 1024), true));
        } catch (Exception e) {
            FileLog.e(e);
            return "<err>";
        }
    }

    @Override
    public byte[] readData(int i, boolean z) {
        byte[] bArr = new byte[i];
        readBytes(bArr, z);
        return bArr;
    }

    @Override
    public String readString(boolean z) {
        int i;
        int position = getPosition();
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i = 4;
            } else {
                i = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("string size too big");
            }
            byte[] bArr = new byte[intFromByte];
            this.buffer.get(bArr);
            while ((intFromByte + i) % 4 != 0) {
                this.buffer.get();
                i++;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read string error", e);
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("read string error");
                FileLog.e(e);
            }
            position(position);
            return "";
        }
    }

    @Override
    public byte[] readByteArray(boolean z) {
        int i;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i = 4;
            } else {
                i = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("byte array size too big");
            }
            byte[] bArr = new byte[intFromByte];
            this.buffer.get(bArr);
            while ((intFromByte + i) % 4 != 0) {
                this.buffer.get();
                i++;
            }
            return bArr;
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read byte array error", e);
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("read byte array error");
                FileLog.e(e);
            }
            return new byte[0];
        }
    }

    @Override
    public NativeByteBuffer readByteBuffer(boolean z) {
        int i;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i = 4;
            } else {
                i = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("byte array size too big");
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(intFromByte);
            int iLimit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.limit(byteBuffer.position() + intFromByte);
            nativeByteBuffer.buffer.put(this.buffer);
            this.buffer.limit(iLimit);
            nativeByteBuffer.buffer.position(0);
            while ((intFromByte + i) % 4 != 0) {
                this.buffer.get();
                i++;
            }
            return nativeByteBuffer;
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read byte array error", e);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return null;
            }
            FileLog.e("read byte array error");
            FileLog.e(e);
            return null;
        }
    }

    @Override
    public double readDouble(boolean z) {
        try {
            return Double.longBitsToDouble(readInt64(z));
        } catch (Exception e) {
            if (z) {
                throw new RuntimeException("read double error", e);
            }
            if (!BuildVars.LOGS_ENABLED) {
                return 0.0d;
            }
            FileLog.e("read double error");
            FileLog.e(e);
            return 0.0d;
        }
    }

    public void reuse() {
        if (this.address != 0) {
            addressWrappers.get().add(this);
            this.reused = true;
            native_reuse(this.address);
        }
    }

    @Override
    public int remaining() {
        return this.buffer.remaining();
    }

    protected void finalize() throws Throwable {
        if (!this.reused) {
            reuse();
        }
        super.finalize();
    }
}
