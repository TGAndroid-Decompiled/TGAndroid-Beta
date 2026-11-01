package org.telegram.messenger;
public final class zz {
    public char f19787a;
    public String f19788b;
    public int f19789c;
    public int d;

    public static void c(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
    }

    public final float a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zz.a():float");
    }

    public final char b() {
        int i10 = this.f19789c;
        int i11 = this.d;
        if (i10 < i11) {
            this.f19789c = i10 + 1;
        }
        int i12 = this.f19789c;
        if (i12 == i11) {
            return (char) 0;
        }
        return this.f19788b.charAt(i12);
    }

    public final void d() {
        while (true) {
            int i10 = this.f19789c;
            if (i10 < this.d && Character.isWhitespace(this.f19788b.charAt(i10))) {
                this.f19787a = b();
            } else {
                return;
            }
        }
    }
}
