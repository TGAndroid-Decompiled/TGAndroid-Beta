package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class kw0 {
    public final String f47037a;
    public final Runnable f47038b;
    public final String f47039c;
    public final String[] d;
    public final int f47040e;
    public final int f47041f;
    public int f47042g;
    public String h;

    public kw0(int i3, String str, int i10, Runnable runnable) {
        this(i3, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof kw0) && this.f47041f == ((kw0) obj).f47041f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f47042g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f47041f);
        return Utilities.f(serializedData.toByteArray());
    }

    public kw0(int i3, String str, String str2, int i10, Runnable runnable) {
        this(i3, str, null, str2, null, i10, runnable);
    }

    public kw0(int i3, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i3, str, str2, str3, null, i10, runnable);
    }

    public kw0(int i3, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f47041f = i3;
        this.f47037a = str;
        this.f47039c = str2;
        this.f47038b = runnable;
        this.f47040e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
