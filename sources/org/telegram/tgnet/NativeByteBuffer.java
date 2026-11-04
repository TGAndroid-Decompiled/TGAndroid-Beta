package org.telegram.tgnet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
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

    private NativeByteBuffer(int i3, boolean z10) {
    }

    public static native long native_getFreeBuffer(int i3);

    public static native ByteBuffer native_getJavaByteBuffer(long j10);

    public static native int native_limit(long j10);

    public static native int native_position(long j10);

    public static native void native_reuse(long j10);

    public static NativeByteBuffer wrap(long j10) {
        if (j10 != 0) {
            NativeByteBuffer poll = addressWrappers.get().poll();
            if (poll == null) {
                poll = new NativeByteBuffer(0, true);
            }
            poll.address = j10;
            poll.reused = false;
            ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(j10);
            poll.buffer = native_getJavaByteBuffer;
            native_getJavaByteBuffer.limit(native_limit(j10));
            int native_position = native_position(j10);
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
            return Utilities.f(readData(Math.min(limit(), 1024), true));
        } catch (Exception e10) {
            a8.g(e10, true);
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
        if (readInt32 != -1132882121) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("Not bool value!");
                }
            } else {
                throw new RuntimeException("Not bool value!");
            }
        }
        return false;
    }

    @Override
    public byte readByte(boolean z10) {
        try {
            return this.buffer.get();
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read byte error");
                    a8.g(e10, true);
                    return (byte) 0;
                }
                return (byte) 0;
            }
            throw new RuntimeException("read byte error", e10);
        }
    }

    @Override
    public byte[] readByteArray(boolean z10) {
        int i3;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i3 = 4;
            } else {
                i3 = 1;
            }
            if (intFromByte <= remaining() && intFromByte >= 0) {
                byte[] bArr = new byte[intFromByte];
                this.buffer.get(bArr);
                while ((intFromByte + i3) % 4 != 0) {
                    this.buffer.get();
                    i3++;
                }
                return bArr;
            }
            throw new RuntimeException("byte array size too big");
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read byte array error");
                    a8.g(e10, true);
                }
                return new byte[0];
            }
            throw new RuntimeException("read byte array error", e10);
        }
    }

    @Override
    public NativeByteBuffer readByteBuffer(boolean z10) {
        int i3;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i3 = 4;
            } else {
                i3 = 1;
            }
            if (intFromByte <= remaining() && intFromByte >= 0) {
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(intFromByte);
                int limit = this.buffer.limit();
                ByteBuffer byteBuffer = this.buffer;
                byteBuffer.limit(byteBuffer.position() + intFromByte);
                nativeByteBuffer.buffer.put(this.buffer);
                this.buffer.limit(limit);
                nativeByteBuffer.buffer.position(0);
                while ((intFromByte + i3) % 4 != 0) {
                    this.buffer.get();
                    i3++;
                }
                return nativeByteBuffer;
            }
            throw new RuntimeException("byte array size too big");
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read byte array error");
                    a8.g(e10, true);
                    return null;
                }
                return null;
            }
            throw new RuntimeException("read byte array error", e10);
        }
    }

    @Override
    public void readBytes(byte[] bArr, boolean z10) {
        try {
            this.buffer.get(bArr);
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read raw error");
                    a8.g(e10, true);
                    return;
                }
                return;
            }
            throw new RuntimeException("read raw error", e10);
        }
    }

    @Override
    public byte[] readData(int i3, boolean z10) {
        byte[] bArr = new byte[i3];
        readBytes(bArr, z10);
        return bArr;
    }

    @Override
    public double readDouble(boolean z10) {
        try {
            return Double.longBitsToDouble(readInt64(z10));
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read double error");
                    a8.g(e10, true);
                    return 0.0d;
                }
                return 0.0d;
            }
            throw new RuntimeException("read double error", e10);
        }
    }

    @Override
    public float readFloat(boolean z10) {
        try {
            return Float.intBitsToFloat(this.buffer.getInt());
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read float error");
                    a8.g(e10, true);
                    return 0.0f;
                }
                return 0.0f;
            }
            throw new RuntimeException("read float error", e10);
        }
    }

    @Override
    public int readInt32(boolean z10) {
        try {
            return this.buffer.getInt();
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read int32 error");
                    a8.g(e10, true);
                    return 0;
                }
                return 0;
            }
            throw new RuntimeException("read int32 error", e10);
        }
    }

    @Override
    public long readInt64(boolean z10) {
        try {
            return this.buffer.getLong();
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read int64 error");
                    a8.g(e10, true);
                    return 0L;
                }
                return 0L;
            }
            throw new RuntimeException("read int64 error", e10);
        }
    }

    @Override
    public String readString(boolean z10) {
        int i3;
        int position = getPosition();
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i3 = 4;
            } else {
                i3 = 1;
            }
            if (intFromByte <= remaining() && intFromByte >= 0) {
                byte[] bArr = new byte[intFromByte];
                this.buffer.get(bArr);
                while ((intFromByte + i3) % 4 != 0) {
                    this.buffer.get();
                    i3++;
                }
                return new String(bArr, "UTF-8");
            }
            throw new RuntimeException("string size too big");
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read string error");
                    a8.g(e10, true);
                }
                position(position);
                return "";
            }
            throw new RuntimeException("read string error", e10);
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
    public void skip(int i3) {
        if (i3 == 0) {
            return;
        }
        if (!this.justCalc) {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + i3);
            return;
        }
        this.len += i3;
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
    public void writeByte(int i3) {
        writeByte((byte) i3);
    }

    @Override
    public void writeByteArray(byte[] bArr, int i3, int i10) {
        try {
            if (i10 <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) i10);
                }
            } else if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) i10);
                this.buffer.put((byte) (i10 >> 8));
                this.buffer.put((byte) (i10 >> 16));
            }
            if (this.justCalc) {
                this.len += i10;
            } else {
                this.buffer.put(bArr, i3, i10);
            }
            for (int i11 = i10 <= 253 ? 1 : 4; (i10 + i11) % 4 != 0; i11++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write byte array error");
                a8.g(e10, true);
            }
        }
    }

    @Override
    public void writeByteBuffer(NativeByteBuffer nativeByteBuffer) {
        int i3;
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
                i3 = 1;
            } else {
                i3 = 4;
            }
            while ((limit + i3) % 4 != 0) {
                if (!this.justCalc) {
                    this.buffer.put((byte) 0);
                } else {
                    this.len++;
                }
                i3++;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
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
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write raw error");
                a8.g(e10, true);
            }
        }
    }

    @Override
    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write double error");
                a8.g(e10, true);
            }
        }
    }

    @Override
    public void writeFloat(float f10) {
        try {
            if (!this.justCalc) {
                this.buffer.putInt(Float.floatToIntBits(f10));
            } else {
                this.len += 4;
            }
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write float error");
                a8.g(e10, true);
            }
        }
    }

    @Override
    public void writeInt32(int i3) {
        try {
            if (!this.justCalc) {
                this.buffer.putInt(i3);
            } else {
                this.len += 4;
            }
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write int32 error");
                a8.g(e10, true);
            }
        }
    }

    @Override
    public void writeInt64(long j10) {
        try {
            if (!this.justCalc) {
                this.buffer.putLong(j10);
            } else {
                this.len += 8;
            }
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write int64 error");
                a8.g(e10, true);
            }
        }
    }

    @Override
    public void writeString(String str) {
        if (str == null) {
            if (r2.f25040a) {
                a8.d("write string null");
                a8.g(new Throwable(), true);
            }
            str = "";
        }
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write string error");
                a8.g(e10, true);
            }
        }
    }

    public void limit(int i3) {
        this.buffer.limit(i3);
    }

    public void position(int i3) {
        this.buffer.position(i3);
    }

    @Override
    public void writeByte(byte b10) {
        try {
            if (!this.justCalc) {
                this.buffer.put(b10);
            } else {
                this.len++;
            }
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write byte error");
                a8.g(e10, true);
            }
        }
    }

    public NativeByteBuffer(int i3) {
        if (i3 >= 0) {
            long native_getFreeBuffer = native_getFreeBuffer(i3);
            this.address = native_getFreeBuffer;
            if (native_getFreeBuffer != 0) {
                ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(native_getFreeBuffer);
                this.buffer = native_getJavaByteBuffer;
                native_getJavaByteBuffer.position(0);
                this.buffer.limit(i3);
                this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                return;
            }
            return;
        }
        throw new Exception("invalid NativeByteBuffer size");
    }

    public void readBytes(byte[] bArr, int i3, int i10, boolean z10) {
        try {
            this.buffer.get(bArr, i3, i10);
        } catch (Exception e10) {
            if (!z10) {
                if (r2.f25040a) {
                    a8.d("read raw error");
                    a8.g(e10, true);
                    return;
                }
                return;
            }
            throw new RuntimeException("read raw error", e10);
        }
    }

    @Override
    public void writeBytes(byte[] bArr, int i3, int i10) {
        try {
            if (!this.justCalc) {
                this.buffer.put(bArr, i3, i10);
            } else {
                this.len += i10;
            }
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write raw error");
                a8.g(e10, true);
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
            for (int i3 = bArr.length <= 253 ? 1 : 4; (bArr.length + i3) % 4 != 0; i3++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e10) {
            if (r2.f25040a) {
                a8.d("write byte array error");
                a8.g(e10, true);
            }
        }
    }
}
