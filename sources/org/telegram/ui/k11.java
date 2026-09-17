package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class k11 {
    public final String f37916a;
    public final Runnable f37917b;
    public final String f37918c;
    public final String[] d;
    public final int f37919e;
    public final int f37920f;
    public int f37921g;
    public String h;

    public k11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof k11) && this.f37920f == ((k11) obj).f37920f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f37921g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f37920f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public k11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public k11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public k11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f37920f = i10;
        this.f37916a = str;
        this.f37918c = str2;
        this.f37917b = runnable;
        this.f37919e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
