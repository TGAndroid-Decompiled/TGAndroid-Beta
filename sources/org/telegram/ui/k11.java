package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class k11 {
    public final String f34971a;
    public final Runnable f34972b;
    public final String f34973c;
    public final String[] d;
    public final int e;
    public final int f34974f;
    public int f34975g;
    public String h;

    public k11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof k11) && this.f34974f == ((k11) obj).f34974f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f34975g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f34974f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public k11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public k11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public k11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f34974f = i10;
        this.f34971a = str;
        this.f34973c = str2;
        this.f34972b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
