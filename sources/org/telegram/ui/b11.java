package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class b11 {
    public final String f34951a;
    public final Runnable f34952b;
    public final String f34953c;
    public final String[] d;
    public final int f34954e;
    public final int f34955f;
    public int f34956g;
    public String h;

    public b11(String str, int i10, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b11) && this.f34955f == ((b11) obj).f34955f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f34956g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f34955f);
        return Utilities.bytesToHex(serializedData.toByteArray());
    }

    public b11(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public b11(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public b11(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f34955f = i10;
        this.f34951a = str;
        this.f34953c = str2;
        this.f34952b = runnable;
        this.f34954e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
