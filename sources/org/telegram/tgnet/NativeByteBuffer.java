package org.telegram.tgnet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public class NativeByteBuffer extends AbstractSerializedData {
    private static final ThreadLocal<LinkedList<NativeByteBuffer>> addressWrappers = new ThreadLocal() {
        @Override
        public LinkedList initialValue() {
            return new LinkedList();
        }
    };
    protected long address;
    public ByteBuffer buffer;
    private boolean justCalc;
    private int len;
    public boolean reused = true;

    public NativeByteBuffer(int i) {
        if (i < 0) {
            throw new Exception("invalid NativeByteBuffer size");
        }
        long native_getFreeBuffer = native_getFreeBuffer(i);
        this.address = native_getFreeBuffer;
        if (native_getFreeBuffer != 0) {
            ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(native_getFreeBuffer);
            this.buffer = native_getJavaByteBuffer;
            native_getJavaByteBuffer.position(0);
            this.buffer.limit(i);
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    private NativeByteBuffer(int i, boolean z) {
    }

    public NativeByteBuffer(boolean z) {
        this.justCalc = z;
    }

    public static native long native_getFreeBuffer(int i);

    public static native ByteBuffer native_getJavaByteBuffer(long j);

    public static native int native_limit(long j);

    public static native int native_position(long j);

    public static native void native_reuse(long j);

    public static NativeByteBuffer wrap(long j) {
        if (j == 0) {
            return null;
        }
        NativeByteBuffer poll = addressWrappers.get().poll();
        if (poll == null) {
            poll = new NativeByteBuffer(0, true);
        }
        poll.address = j;
        poll.reused = false;
        ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(j);
        poll.buffer = native_getJavaByteBuffer;
        native_getJavaByteBuffer.limit(native_limit(j));
        int native_position = native_position(j);
        if (native_position <= poll.buffer.limit()) {
            poll.buffer.position(native_position);
        }
        poll.buffer.order(ByteOrder.LITTLE_ENDIAN);
        return poll;
    }

    public int capacity() {
        return this.buffer.capacity();
    }

    public void compact() {
        this.buffer.compact();
    }

    protected void finalize() {
        if (!this.reused) {
            reuse();
        }
        super.finalize();
    }

    public int getIntFromByte(byte b) {
        return b >= 0 ? b : b + 256;
    }

    public int getPosition() {
        return this.buffer.position();
    }

    public boolean hasRemaining() {
        return this.buffer.hasRemaining();
    }

    public int length() {
        return !this.justCalc ? this.buffer.position() : this.len;
    }

    public int limit() {
        return this.buffer.limit();
    }

    public void limit(int i) {
        this.buffer.limit(i);
    }

    public int position() {
        return this.buffer.position();
    }

    public void position(int i) {
        this.buffer.position(i);
    }

    public void put(ByteBuffer byteBuffer) {
        this.buffer.put(byteBuffer);
    }

    @Override
    public boolean readBool(boolean z) {
        int readInt32 = readInt32(z);
        if (readInt32 == -1720552011) {
            return true;
        }
        if (readInt32 == -1132882121) {
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
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(intFromByte);
            int limit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.limit(byteBuffer.position() + intFromByte);
            nativeByteBuffer.buffer.put(this.buffer);
            this.buffer.limit(limit);
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

    public byte[] readData(int i, boolean z) {
        byte[] bArr = new byte[i];
        readBytes(bArr, z);
        return bArr;
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
    public int remaining() {
        return this.buffer.remaining();
    }

    public void reuse() {
        if (this.address != 0) {
            addressWrappers.get().add(this);
            this.reused = true;
            native_reuse(this.address);
        }
    }

    public void rewind() {
        if (this.justCalc) {
            this.len = 0;
        } else {
            this.buffer.rewind();
        }
    }

    public void skip(int i) {
        if (i == 0) {
            return;
        }
        if (this.justCalc) {
            this.len += i;
        } else {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    @Override
    public void writeBool(boolean z) {
        if (this.justCalc) {
            this.len += 4;
        } else {
            writeInt32(z ? -1720552011 : -1132882121);
        }
    }

    @Override
    public void writeByte(byte b) {
        try {
            if (this.justCalc) {
                this.len++;
            } else {
                this.buffer.put(b);
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte error");
                FileLog.e(e);
            }
        }
    }

    public void writeByte(int i) {
        writeByte((byte) i);
    }

    @Override
    public void writeByteArray(byte[] bArr) {
        int i;
        ByteBuffer byteBuffer;
        int length;
        try {
            if (bArr.length <= 253) {
                if (this.justCalc) {
                    i = this.len + 1;
                    this.len = i;
                } else {
                    byteBuffer = this.buffer;
                    length = bArr.length;
                    byteBuffer.put((byte) length);
                }
            } else if (this.justCalc) {
                i = this.len + 4;
                this.len = i;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) bArr.length);
                this.buffer.put((byte) (bArr.length >> 8));
                byteBuffer = this.buffer;
                length = bArr.length >> 16;
                byteBuffer.put((byte) length);
            }
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.buffer.put(bArr);
            }
            for (int i2 = bArr.length <= 253 ? 1 : 4; (bArr.length + i2) % 4 != 0; i2++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write byte array error");
                FileLog.e(e);
            }
        }
    }

    public void writeByteArray(byte[] bArr, int i, int i2) {
        int i3;
        ByteBuffer byteBuffer;
        byte b;
        try {
            if (i2 <= 253) {
                if (this.justCalc) {
                    i3 = this.len + 1;
                    this.len = i3;
                } else {
                    byteBuffer = this.buffer;
                    b = (byte) i2;
                    byteBuffer.put(b);
                }
            } else if (this.justCalc) {
                i3 = this.len + 4;
                this.len = i3;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) i2);
                this.buffer.put((byte) (i2 >> 8));
                byteBuffer = this.buffer;
                b = (byte) (i2 >> 16);
                byteBuffer.put(b);
            }
            if (this.justCalc) {
                this.len += i2;
            } else {
                this.buffer.put(bArr, i, i2);
            }
            for (int i4 = i2 <= 253 ? 1 : 4; (i2 + i4) % 4 != 0; i4++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
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
    public void writeByteBuffer(NativeByteBuffer nativeByteBuffer) {
        int i;
        ByteBuffer byteBuffer;
        byte b;
        try {
            int limit = nativeByteBuffer.limit();
            if (limit <= 253) {
                if (this.justCalc) {
                    i = this.len + 1;
                    this.len = i;
                } else {
                    byteBuffer = this.buffer;
                    b = (byte) limit;
                    byteBuffer.put(b);
                }
            } else if (this.justCalc) {
                i = this.len + 4;
                this.len = i;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) limit);
                this.buffer.put((byte) (limit >> 8));
                byteBuffer = this.buffer;
                b = (byte) (limit >> 16);
                byteBuffer.put(b);
            }
            if (this.justCalc) {
                this.len += limit;
            } else {
                nativeByteBuffer.rewind();
                this.buffer.put(nativeByteBuffer.buffer);
            }
            for (int i2 = limit <= 253 ? 1 : 4; (limit + i2) % 4 != 0; i2++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
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

    public void writeBytes(byte[] bArr) {
        try {
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.buffer.put(bArr);
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write raw error");
                FileLog.e(e);
            }
        }
    }

    public void writeBytes(byte[] bArr, int i, int i2) {
        try {
            if (this.justCalc) {
                this.len += i2;
            } else {
                this.buffer.put(bArr, i, i2);
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write raw error");
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
    public void writeFloat(float f) {
        try {
            if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.putInt(Float.floatToIntBits(f));
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write float error");
                FileLog.e(e);
            }
        }
    }

    @Override
    public void writeInt32(int i) {
        try {
            if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.putInt(i);
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
            if (this.justCalc) {
                this.len += 8;
            } else {
                this.buffer.putLong(j);
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write int64 error");
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
}
