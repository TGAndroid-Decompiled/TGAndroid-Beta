package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class k11 {
    public final String f37888a;
    public final Runnable f37889b;
    public final String f37890c;
    public final String[] d;
    public final int f37891e;
    public final int f37892f;
    public int f37893g;
    public String h;

    public k11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof k11) && this.f37892f == ((k11) obj).f37892f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f37893g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f37892f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public k11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public k11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public k11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f37892f = i10;
        this.f37888a = str;
        this.f37890c = str2;
        this.f37889b = runnable;
        this.f37891e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
