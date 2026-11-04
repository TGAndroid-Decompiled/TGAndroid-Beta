package org.telegram.tgnet;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
public class Vector<T extends TLObject> extends TLObject {
    public static final int constructor = 481674261;
    private final TLDeserializer<T> itemDeserializer;
    public final ArrayList<T> objects = new ArrayList<>();

    public static class Int extends TLObject {
        public int value;

        public Int(int i3) {
            this.value = i3;
        }

        public static Int TLDeserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
            return new Int(i3);
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

        public Long(int i3, int i10) {
            this.value = (i10 & 4294967295L) | (i3 << 32);
        }

        public static Long TLDeserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
            return new Long(i3, inputSerializedData.readInt32(z10));
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
        T deserialize(InputSerializedData inputSerializedData, int i3, boolean z10);
    }

    public Vector(TLDeserializer<T> tLDeserializer) {
        this.itemDeserializer = tLDeserializer;
    }

    public static <T extends TLObject> Vector<T> TLDeserialize(InputSerializedData inputSerializedData, int i3, boolean z10, TLDeserializer<T> tLDeserializer) {
        if (i3 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", i3, z10);
            return null;
        }
        Vector<T> vector = new Vector<>(tLDeserializer);
        vector.readParams(inputSerializedData, z10);
        return vector;
    }

    public static Vector<Int> TLDeserializeInt(InputSerializedData inputSerializedData, int i3, boolean z10) {
        if (i3 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "StarGift", i3, z10);
            return null;
        }
        Vector<Int> vector = new Vector<>(new s(18));
        vector.readParams(inputSerializedData, z10);
        return vector;
    }

    public static Vector<Int> TLDeserializeLong(InputSerializedData inputSerializedData, int i3, boolean z10) {
        if (i3 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", i3, z10);
            return null;
        }
        Vector<Int> vector = new Vector<>(new s(18));
        vector.readParams(inputSerializedData, z10);
        return vector;
    }

    private static <T> ArrayList<T> deserialize(InputSerializedData inputSerializedData, v10 v10Var, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        if (readInt32 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", readInt32, z10);
            return new ArrayList<>();
        }
        int readInt322 = inputSerializedData.readInt32(z10);
        if (!validateSize(readInt322, 1, inputSerializedData.remaining())) {
            TLParseException.doThrowOrLog(inputSerializedData, "VectorWrongSize", readInt32, z10);
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(readInt322);
        for (int i3 = 0; i3 < readInt322; i3++) {
            arrayList.add(v10Var.a(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    public static ArrayList<byte[]> deserializeByteArray(InputSerializedData inputSerializedData, boolean z10) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new u(inputSerializedData, 3), z10);
    }

    public static ArrayList<Integer> deserializeInt(InputSerializedData inputSerializedData, boolean z10) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new u(inputSerializedData, 1), z10);
    }

    public static ArrayList<java.lang.Long> deserializeLong(InputSerializedData inputSerializedData, boolean z10) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new u(inputSerializedData, 0), z10);
    }

    public static ArrayList<String> deserializeString(InputSerializedData inputSerializedData, boolean z10) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new u(inputSerializedData, 2), z10);
    }

    public static <T extends TLObject> void serialize(OutputSerializedData outputSerializedData, ArrayList<T> arrayList) {
        outputSerializedData.writeInt32(481674261);
        outputSerializedData.writeInt32(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).serializeToStream(outputSerializedData);
        }
    }

    public static void serializeByteArray(OutputSerializedData outputSerializedData, ArrayList<byte[]> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new v(outputSerializedData, 2), arrayList);
    }

    public static void serializeInt(OutputSerializedData outputSerializedData, ArrayList<Integer> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new v(outputSerializedData, 1), arrayList);
    }

    public static void serializeLong(OutputSerializedData outputSerializedData, ArrayList<java.lang.Long> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new v(outputSerializedData, 0), arrayList);
    }

    public static void serializeString(OutputSerializedData outputSerializedData, ArrayList<String> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new v(outputSerializedData, 3), arrayList);
    }

    private static boolean validateSize(int i3, int i10, int i11) {
        if (i3 >= 0 && i10 > 0 && i3 * i10 <= i11) {
            return true;
        }
        return false;
    }

    @Override
    public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        for (int i3 = 0; i3 < readInt32; i3++) {
            this.objects.add(this.itemDeserializer.deserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10));
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
        int i3 = 0;
        while (i3 < size) {
            T t10 = arrayList2.get(i3);
            i3++;
            T t11 = t10;
            if (t11 instanceof Int) {
                arrayList.add(Integer.valueOf(((Int) t11).value));
            }
        }
        return arrayList;
    }

    public static <T> void serialize(OutputSerializedData outputSerializedData, u10 u10Var, ArrayList<T> arrayList) {
        outputSerializedData.writeInt32(481674261);
        outputSerializedData.writeInt32(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            u10Var.a(arrayList.get(i3));
        }
    }

    public static <T extends TLObject> ArrayList<T> deserialize(InputSerializedData inputSerializedData, TLDeserializer<T> tLDeserializer, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        if (readInt32 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", readInt32, z10);
            return new ArrayList<>();
        }
        int readInt322 = inputSerializedData.readInt32(z10);
        if (!validateSize(readInt322, 4, inputSerializedData.remaining())) {
            TLParseException.doThrowOrLog(inputSerializedData, "VectorWrongSize", readInt32, z10);
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(readInt322);
        for (int i3 = 0; i3 < readInt322; i3++) {
            T deserialize = tLDeserializer.deserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (deserialize != null) {
                arrayList.add(deserialize);
            }
        }
        return arrayList;
    }
}
