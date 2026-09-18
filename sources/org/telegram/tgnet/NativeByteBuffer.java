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

    private NativeByteBuffer(int i10, boolean z10) {
    }

    public static native long native_getFreeBuffer(int i10);

    public static native ByteBuffer native_getJavaByteBuffer(long j3);

    public static native int native_limit(long j3);

    public static native int native_position(long j3);

    public static native void native_reuse(long j3);

    public static NativeByteBuffer wrap(long j3) {
        if (j3 != 0) {
            NativeByteBuffer poll = addressWrappers.get().poll();
            if (poll == null) {
                poll = new NativeByteBuffer(0, true);
            }
            poll.address = j3;
            poll.reused = false;
            ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(j3);
            poll.buffer = native_getJavaByteBuffer;
            native_getJavaByteBuffer.limit(native_limit(j3));
            int native_position = native_position(j3);
            if (native_position <= poll.buffer.limit()) {
                poll.buffer.position(native_position);
            }
            poll.buffer.order(ByteOrder.LITTLE_ENDIAN);
            return poll;
        }
        return null;
    }

    public int capacity() {
        return this.buffer.capacity();
    }

    public void compact() {
        this.buffer.compact();
    }

    public void finalize() {
        if (!this.reused) {
            reuse();
        }
        super.finalize();
    }

    public int getIntFromByte(byte b10) {
        if (b10 >= 0) {
            return b10;
        }
        return b10 + 256;
    }

    @Override
    public int getPosition() {
        return this.buffer.position();
    }

    public boolean hasRemaining() {
        return this.buffer.hasRemaining();
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
    public int length() {
        if (!this.justCalc) {
            return this.buffer.position();
        }
        return this.len;
    }

    public int limit() {
        return this.buffer.limit();
    }

    public int position() {
        return this.buffer.position();
    }

    public void put(ByteBuffer byteBuffer) {
        this.buffer.put(byteBuffer);
    }

    @Override
    public boolean readBool(boolean z10) {
        int readInt32 = readInt32(z10);
        if (readInt32 == -1720552011) {
            return true;
        }
        if (readInt32 == -1132882121) {
            return false;
        }
        if (!z10) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Not bool value!");
            }
            return false;
        }
        throw new RuntimeException("Not bool value!");
    }

    @Override
    public byte readByte(boolean z10) {
        try {
            return this.buffer.get();
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read byte error");
                    FileLog.e(e);
                    return (byte) 0;
                }
                return (byte) 0;
            }
            throw new RuntimeException("read byte error", e);
        }
    }

    @Override
    public byte[] readByteArray(boolean z10) {
        int i10;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i10 = 4;
            } else {
                i10 = 1;
            }
            if (intFromByte <= remaining() && intFromByte >= 0) {
                byte[] bArr = new byte[intFromByte];
                this.buffer.get(bArr);
                while ((intFromByte + i10) % 4 != 0) {
                    this.buffer.get();
                    i10++;
                }
                return bArr;
            }
            throw new RuntimeException("byte array size too big");
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read byte array error");
                    FileLog.e(e);
                }
                return new byte[0];
            }
            throw new RuntimeException("read byte array error", e);
        }
    }

    @Override
    public NativeByteBuffer readByteBuffer(boolean z10) {
        int i10;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i10 = 4;
            } else {
                i10 = 1;
            }
            if (intFromByte <= remaining() && intFromByte >= 0) {
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(intFromByte);
                int limit = this.buffer.limit();
                ByteBuffer byteBuffer = this.buffer;
                byteBuffer.limit(byteBuffer.position() + intFromByte);
                nativeByteBuffer.buffer.put(this.buffer);
                this.buffer.limit(limit);
                nativeByteBuffer.buffer.position(0);
                while ((intFromByte + i10) % 4 != 0) {
                    this.buffer.get();
                    i10++;
                }
                return nativeByteBuffer;
            }
            throw new RuntimeException("byte array size too big");
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read byte array error");
                    FileLog.e(e);
                    return null;
                }
                return null;
            }
            throw new RuntimeException("read byte array error", e);
        }
    }

    @Override
    public void readBytes(byte[] bArr, boolean z10) {
        try {
            this.buffer.get(bArr);
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read raw error");
                    FileLog.e(e);
                    return;
                }
                return;
            }
            throw new RuntimeException("read raw error", e);
        }
    }

    @Override
    public byte[] readData(int i10, boolean z10) {
        byte[] bArr = new byte[i10];
        readBytes(bArr, z10);
        return bArr;
    }

    @Override
    public double readDouble(boolean z10) {
        try {
            return Double.longBitsToDouble(readInt64(z10));
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read double error");
                    FileLog.e(e);
                    return 0.0d;
                }
                return 0.0d;
            }
            throw new RuntimeException("read double error", e);
        }
    }

    @Override
    public float readFloat(boolean z10) {
        try {
            return Float.intBitsToFloat(this.buffer.getInt());
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read float error");
                    FileLog.e(e);
                    return 0.0f;
                }
                return 0.0f;
            }
            throw new RuntimeException("read float error", e);
        }
    }

    @Override
    public int readInt32(boolean z10) {
        try {
            return this.buffer.getInt();
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read int32 error");
                    FileLog.e(e);
                    return 0;
                }
                return 0;
            }
            throw new RuntimeException("read int32 error", e);
        }
    }

    @Override
    public long readInt64(boolean z10) {
        try {
            return this.buffer.getLong();
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read int64 error");
                    FileLog.e(e);
                    return 0L;
                }
                return 0L;
            }
            throw new RuntimeException("read int64 error", e);
        }
    }

    @Override
    public String readString(boolean z10) {
        int i10;
        int position = getPosition();
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i10 = 4;
            } else {
                i10 = 1;
            }
            if (intFromByte <= remaining() && intFromByte >= 0) {
                byte[] bArr = new byte[intFromByte];
                this.buffer.get(bArr);
                while ((intFromByte + i10) % 4 != 0) {
                    this.buffer.get();
                    i10++;
                }
                return new String(bArr, "UTF-8");
            }
            throw new RuntimeException("string size too big");
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read string error");
                    FileLog.e(e);
                }
                position(position);
                return "";
            }
            throw new RuntimeException("read string error", e);
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

    @Override
    public void skip(int i10) {
        if (i10 == 0) {
            return;
        }
        if (!this.justCalc) {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + i10);
            return;
        }
        this.len += i10;
    }

    @Override
    public void writeBool(boolean z10) {
        if (!this.justCalc) {
            if (z10) {
                writeInt32(-1720552011);
                return;
            } else {
                writeInt32(-1132882121);
                return;
            }
        }
        this.len += 4;
    }

    @Override
    public void writeByte(int i10) {
        writeByte((byte) i10);
    }

    @Override
    public void writeByteArray(byte[] bArr, int i10, int i11) {
        try {
            if (i11 <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) i11);
                }
            } else if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) i11);
                this.buffer.put((byte) (i11 >> 8));
                this.buffer.put((byte) (i11 >> 16));
            }
            if (this.justCalc) {
                this.len += i11;
            } else {
                this.buffer.put(bArr, i10, i11);
            }
            for (int i12 = i11 <= 253 ? 1 : 4; (i11 + i12) % 4 != 0; i12++) {
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
        int i10;
        try {
            int limit = nativeByteBuffer.limit();
            if (limit <= 253) {
                if (!this.justCalc) {
                    this.buffer.put((byte) limit);
                } else {
                    this.len++;
                }
            } else if (!this.justCalc) {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) limit);
                this.buffer.put((byte) (limit >> 8));
                this.buffer.put((byte) (limit >> 16));
            } else {
                this.len += 4;
            }
            if (!this.justCalc) {
                nativeByteBuffer.rewind();
                this.buffer.put(nativeByteBuffer.buffer);
            } else {
                this.len += limit;
            }
            if (limit <= 253) {
                i10 = 1;
            } else {
                i10 = 4;
            }
            while ((limit + i10) % 4 != 0) {
                if (!this.justCalc) {
                    this.buffer.put((byte) 0);
                } else {
                    this.len++;
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
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
    public void writeFloat(float f7) {
        try {
            if (!this.justCalc) {
                this.buffer.putInt(Float.floatToIntBits(f7));
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
    public void writeInt32(int i10) {
        try {
            if (!this.justCalc) {
                this.buffer.putInt(i10);
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
    public void writeInt64(long j3) {
        try {
            if (!this.justCalc) {
                this.buffer.putLong(j3);
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

    public void limit(int i10) {
        this.buffer.limit(i10);
    }

    public void position(int i10) {
        this.buffer.position(i10);
    }

    @Override
    public void writeByte(byte b10) {
        try {
            if (!this.justCalc) {
                this.buffer.put(b10);
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

    public NativeByteBuffer(int i10) {
        if (i10 >= 0) {
            long native_getFreeBuffer = native_getFreeBuffer(i10);
            this.address = native_getFreeBuffer;
            if (native_getFreeBuffer != 0) {
                ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(native_getFreeBuffer);
                this.buffer = native_getJavaByteBuffer;
                native_getJavaByteBuffer.position(0);
                this.buffer.limit(i10);
                this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                return;
            }
            return;
        }
        throw new Exception("invalid NativeByteBuffer size");
    }

    public void readBytes(byte[] bArr, int i10, int i11, boolean z10) {
        try {
            this.buffer.get(bArr, i10, i11);
        } catch (Exception e) {
            if (!z10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("read raw error");
                    FileLog.e(e);
                    return;
                }
                return;
            }
            throw new RuntimeException("read raw error", e);
        }
    }

    @Override
    public void writeBytes(byte[] bArr, int i10, int i11) {
        try {
            if (!this.justCalc) {
                this.buffer.put(bArr, i10, i11);
            } else {
                this.len += i11;
            }
        } catch (Exception e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("write raw error");
                FileLog.e(e);
            }
        }
    }

    public NativeByteBuffer(boolean z10) {
        this.justCalc = z10;
    }

    public void writeBytes(NativeByteBuffer nativeByteBuffer) {
        if (this.justCalc) {
            this.len = nativeByteBuffer.limit() + this.len;
            return;
        }
        nativeByteBuffer.rewind();
        this.buffer.put(nativeByteBuffer.buffer);
    }

    @Override
    public void writeByteArray(byte[] bArr) {
        try {
            if (bArr.length <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) bArr.length);
                }
            } else if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) bArr.length);
                this.buffer.put((byte) (bArr.length >> 8));
                this.buffer.put((byte) (bArr.length >> 16));
            }
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.buffer.put(bArr);
            }
            for (int i10 = bArr.length <= 253 ? 1 : 4; (bArr.length + i10) % 4 != 0; i10++) {
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
}
