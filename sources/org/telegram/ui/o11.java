package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class o11 {
    public final String f38517a;
    public final Runnable f38518b;
    public final String f38519c;
    public final String[] d;
    public final int e;
    public final int f38520f;
    public int f38521g;
    public String h;

    public o11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o11) && this.f38520f == ((o11) obj).f38520f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f38521g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f38520f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public o11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public o11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public o11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f38520f = i10;
        this.f38517a = str;
        this.f38519c = str2;
        this.f38518b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
