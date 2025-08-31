package org.telegram.tgnet;

import android.graphics.ColorSpace;

public class TLEnum {

    public interface Constructor {
        int getConstructor();

        void serializeToStream(OutputSerializedData outputSerializedData);

        public abstract class CC {
        }
    }

    public static Enum TLdeserialize(Class cls, int i, boolean z) {
        Enum fromConstructor = fromConstructor(cls, i);
        if (fromConstructor != null) {
            return fromConstructor;
        }
        if (z) {
            throw new RuntimeException(String.format("can't parse magic %x in %s", Integer.valueOf(i), cls.getName()));
        }
        return null;
    }

    public static Enum fromConstructor(Class cls, int i) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == 0) {
            return null;
        }
        for (ColorSpace.Named named : enumArr) {
            if (((Constructor) named).getConstructor() == i) {
                return named;
            }
        }
        return null;
    }
}
