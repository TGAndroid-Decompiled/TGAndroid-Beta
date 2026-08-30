package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class q01 {
    public final String f37565a;
    public final Runnable f37566b;
    public final String f37567c;
    public final String[] d;
    public final int e;
    public final int f37568f;
    public int f37569g;
    public String h;

    public q01(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof q01) && this.f37568f == ((q01) obj).f37568f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f37569g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f37568f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public q01(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public q01(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public q01(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f37568f = i10;
        this.f37565a = str;
        this.f37567c = str2;
        this.f37566b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
