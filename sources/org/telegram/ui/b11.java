package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class b11 {
    public final String f32210a;
    public final Runnable f32211b;
    public final String f32212c;
    public final String[] d;
    public final int e;
    public final int f32213f;
    public int f32214g;
    public String h;

    public b11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b11) && this.f32213f == ((b11) obj).f32213f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f32214g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f32213f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public b11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public b11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public b11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f32213f = i10;
        this.f32210a = str;
        this.f32212c = str2;
        this.f32211b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
