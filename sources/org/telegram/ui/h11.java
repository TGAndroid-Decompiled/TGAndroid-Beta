package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class h11 {
    public final String f38188a;
    public final Runnable f38189b;
    public final String f38190c;
    public final String[] d;
    public final int f38191e;
    public final int f38192f;
    public int f38193g;
    public String h;

    public h11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof h11) && this.f38192f == ((h11) obj).f38192f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f38193g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f38192f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public h11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public h11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public h11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f38192f = i10;
        this.f38188a = str;
        this.f38190c = str2;
        this.f38189b = runnable;
        this.f38191e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
