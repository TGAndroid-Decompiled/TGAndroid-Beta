package org.telegram.messenger;
public final class yz {
    public char f19459a;
    public String f19460b;
    public int f19461c;
    public int d;

    public static void c(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
    }

    public final float a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yz.a():float");
    }

    public final char b() {
        int i10 = this.f19461c;
        int i11 = this.d;
        if (i10 < i11) {
            this.f19461c = i10 + 1;
        }
        int i12 = this.f19461c;
        if (i12 == i11) {
            return (char) 0;
        }
        return this.f19460b.charAt(i12);
    }

    public final void d() {
        while (true) {
            int i10 = this.f19461c;
            if (i10 < this.d && Character.isWhitespace(this.f19460b.charAt(i10))) {
                this.f19459a = b();
            } else {
                return;
            }
        }
    }
}
