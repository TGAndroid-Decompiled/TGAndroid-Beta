package org.telegram.tgnet;

import me.vkryl.core.BitwiseUtils;

public class TLObject {
    public static final int FLAG_0 = 1;
    public static final int FLAG_1 = 2;
    public static final int FLAG_10 = 1024;
    public static final int FLAG_11 = 2048;
    public static final int FLAG_12 = 4096;
    public static final int FLAG_13 = 8192;
    public static final int FLAG_14 = 16384;
    public static final int FLAG_15 = 32768;
    public static final int FLAG_16 = 65536;
    public static final int FLAG_17 = 131072;
    public static final int FLAG_18 = 262144;
    public static final int FLAG_19 = 524288;
    public static final int FLAG_2 = 4;
    public static final int FLAG_20 = 1048576;
    public static final int FLAG_21 = 2097152;
    public static final int FLAG_22 = 4194304;
    public static final int FLAG_23 = 8388608;
    public static final int FLAG_24 = 16777216;
    public static final int FLAG_25 = 33554432;
    public static final int FLAG_26 = 67108864;
    public static final int FLAG_27 = 134217728;
    public static final int FLAG_28 = 268435456;
    public static final int FLAG_29 = 536870912;
    public static final int FLAG_3 = 8;
    public static final int FLAG_30 = 1073741824;
    public static final int FLAG_31 = Integer.MIN_VALUE;
    public static final int FLAG_4 = 16;
    public static final int FLAG_5 = 32;
    public static final int FLAG_6 = 64;
    public static final int FLAG_7 = 128;
    public static final int FLAG_8 = 256;
    public static final int FLAG_9 = 512;
    private static final ThreadLocal<NativeByteBuffer> sizeCalculator = new ThreadLocal<NativeByteBuffer>() {
        @Override
        public NativeByteBuffer initialValue() {
            return new NativeByteBuffer(true);
        }
    };
    public boolean disableFree = false;
    public int networkType;

    public static <T extends TLObject> T TLdeserialize(Class<T> cls, T t, InputSerializedData inputSerializedData, int i, boolean z) {
        if (t == null) {
            TLParseException.doThrowOrLog(inputSerializedData, cls.getName(), i, z);
            return null;
        }
        t.readParams(inputSerializedData, z);
        return t;
    }

    public static <T extends TLObject> T deepCopy(T t, Vector.TLDeserializer<T> tLDeserializer) {
        if (t == null) {
            return null;
        }
        SerializedData serializedData = new SerializedData(t.getObjectSize());
        t.serializeToStream(serializedData);
        SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
        return (T) tLDeserializer.deserialize(serializedData2, serializedData2.readInt32(false), false);
    }

    public static boolean hasFlag(int i, int i2) {
        return BitwiseUtils.hasFlag(i, i2);
    }

    public static int setFlag(int i, int i2, boolean z) {
        return BitwiseUtils.setFlag(i, i2, z);
    }

    public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
        return null;
    }

    public void freeResources() {
    }

    public int getObjectSize() {
        ThreadLocal<NativeByteBuffer> threadLocal = sizeCalculator;
        NativeByteBuffer nativeByteBuffer = threadLocal.get();
        nativeByteBuffer.rewind();
        serializeToStream(threadLocal.get());
        return nativeByteBuffer.length();
    }

    public void readParams(InputSerializedData inputSerializedData, boolean z) {
    }

    public void serializeToStream(OutputSerializedData outputSerializedData) {
    }
}
