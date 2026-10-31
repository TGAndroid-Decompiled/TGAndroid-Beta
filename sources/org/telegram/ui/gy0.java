package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class gy0 {
    public final String f37669a;
    public final Runnable f37670b;
    public final String f37671c;
    public final String[] d;
    public final int e;
    public final int f37672f;
    public int f37673g;
    public String h;

    public gy0(int i10, String str, int i11, Runnable runnable) {
        this(i10, str, null, null, null, i11, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gy0) && this.f37672f == ((gy0) obj).f37672f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.f37673g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f37672f);
        return Utilities.f(serializedData.toByteArray());
    }

    public gy0(int i10, String str, String str2, int i11, Runnable runnable) {
        this(i10, str, null, str2, null, i11, runnable);
    }

    public gy0(int i10, String str, String str2, String str3, int i11, Runnable runnable) {
        this(i10, str, str2, str3, null, i11, runnable);
    }

    public gy0(int i10, String str, String str2, String str3, String str4, int i11, Runnable runnable) {
        this.f37672f = i10;
        this.f37669a = str;
        this.f37671c = str2;
        this.f37670b = runnable;
        this.e = i11;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
