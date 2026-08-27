package org.telegram.tgnet;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.iy0;

public class Vector<T extends TLObject> extends TLObject {
    public static final int constructor = 481674261;
    private final TLDeserializer<T> itemDeserializer;
    public final ArrayList<T> objects = new ArrayList<>();

    public static class Int extends TLObject {
        public int value;

        public Int(int i10) {
            this.value = i10;
        }

        public static Int TLDeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return new Int(i10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.value = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(this.value);
        }
    }

    public static class Long extends TLObject {
        public long value;

        public Long(int i10, int i11) {
            this.value = (((long) i11) & 4294967295L) | (((long) i10) << 32);
        }

        public static Long TLDeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return new Long(i10, inputSerializedData.readInt32(z10));
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.value = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt64(this.value);
        }
    }

    @FunctionalInterface
    public interface TLDeserializer<T extends TLObject> {
        T deserialize(InputSerializedData inputSerializedData, int i10, boolean z10);
    }

    public Vector(TLDeserializer<T> tLDeserializer) {
        this.itemDeserializer = tLDeserializer;
    }

    public static <T extends TLObject> Vector<T> TLDeserialize(InputSerializedData inputSerializedData, int i10, boolean z10, TLDeserializer<T> tLDeserializer) {
        if (i10 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", i10, z10);
            return null;
        }
        Vector<T> vector = new Vector<>(tLDeserializer);
        vector.readParams(inputSerializedData, z10);
        return vector;
    }

    public static Vector<Int> TLDeserializeInt(InputSerializedData inputSerializedData, int i10, boolean z10) {
        if (i10 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "StarGift", i10, z10);
            return null;
        }
        Vector<Int> vector = new Vector<>(new r(17));
        vector.readParams(inputSerializedData, z10);
        return vector;
    }

    public static Vector<Int> TLDeserializeLong(InputSerializedData inputSerializedData, int i10, boolean z10) {
        if (i10 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", i10, z10);
            return null;
        }
        Vector<Int> vector = new Vector<>(new r(17));
        vector.readParams(inputSerializedData, z10);
        return vector;
    }

    private static <T> ArrayList<T> deserialize(InputSerializedData inputSerializedData, Utilities.CallbackReturn<Boolean, T> callbackReturn, boolean z10) {
        int int32 = inputSerializedData.readInt32(z10);
        if (int32 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", int32, z10);
            return new ArrayList<>();
        }
        int int33 = inputSerializedData.readInt32(z10);
        if (!validateSize(int33, 1, inputSerializedData.remaining())) {
            TLParseException.doThrowOrLog(inputSerializedData, "VectorWrongSize", int32, z10);
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(int33);
        for (int i10 = 0; i10 < int33; i10++) {
            arrayList.add(callbackReturn.run(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    public static ArrayList<byte[]> deserializeByteArray(InputSerializedData inputSerializedData, boolean z10) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new t(inputSerializedData, 3), z10);
    }

    public static ArrayList<Integer> deserializeInt(InputSerializedData inputSerializedData, boolean z10) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new t(inputSerializedData, 1), z10);
    }

    public static ArrayList<java.lang.Long> deserializeLong(InputSerializedData inputSerializedData, boolean z10) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new t(inputSerializedData, 0), z10);
    }

    public static ArrayList<String> deserializeString(InputSerializedData inputSerializedData, boolean z10) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new t(inputSerializedData, 2), z10);
    }

    public static <T extends TLObject> void serialize(OutputSerializedData outputSerializedData, ArrayList<T> arrayList) {
        outputSerializedData.writeInt32(481674261);
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).serializeToStream(outputSerializedData);
        }
    }

    public static void serializeByteArray(OutputSerializedData outputSerializedData, ArrayList<byte[]> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new u(outputSerializedData, 2), arrayList);
    }

    public static void serializeInt(OutputSerializedData outputSerializedData, ArrayList<Integer> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new u(outputSerializedData, 1), arrayList);
    }

    public static void serializeLong(OutputSerializedData outputSerializedData, ArrayList<java.lang.Long> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new u(outputSerializedData, 0), arrayList);
    }

    public static void serializeString(OutputSerializedData outputSerializedData, ArrayList<String> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new u(outputSerializedData, 3), arrayList);
    }

    private static boolean validateSize(int i10, int i11, int i12) {
        return i10 >= 0 && i11 > 0 && ((long) i10) * ((long) i11) <= ((long) i12);
    }

    @Override
    public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int int32 = inputSerializedData.readInt32(z10);
        for (int i10 = 0; i10 < int32; i10++) {
            this.objects.add((T) this.itemDeserializer.deserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10));
        }
    }

    @Override
    public void serializeToStream(OutputSerializedData outputSerializedData) {
        serialize(outputSerializedData, this.objects);
    }

    public ArrayList<Integer> toIntArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<T> arrayList2 = this.objects;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            T t10 = arrayList2.get(i10);
            i10++;
            T t11 = t10;
            if (t11 instanceof Int) {
                arrayList.add(Integer.valueOf(((Int) t11).value));
            }
        }
        return arrayList;
    }

    public static <T> void serialize(OutputSerializedData outputSerializedData, Utilities.Callback<T> callback, ArrayList<T> arrayList) {
        outputSerializedData.writeInt32(481674261);
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            callback.run(arrayList.get(i10));
        }
    }

    public static <T extends TLObject> ArrayList<T> deserialize(InputSerializedData inputSerializedData, TLDeserializer<T> tLDeserializer, boolean z10) {
        int int32 = inputSerializedData.readInt32(z10);
        if (int32 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", int32, z10);
            return new ArrayList<>();
        }
        int int33 = inputSerializedData.readInt32(z10);
        if (!validateSize(int33, 4, inputSerializedData.remaining())) {
            TLParseException.doThrowOrLog(inputSerializedData, "VectorWrongSize", int32, z10);
            return new ArrayList<>();
        }
        iy0 iy0Var = (ArrayList<T>) new ArrayList(int33);
        for (int i10 = 0; i10 < int33; i10++) {
            TLObject tLObjectDeserialize = tLDeserializer.deserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (tLObjectDeserialize != null) {
                iy0Var.add(tLObjectDeserialize);
            }
        }
        return iy0Var;
    }
}
