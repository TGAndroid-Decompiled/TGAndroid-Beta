package org.telegram.messenger;
public class zz {
    public final String f26950c;
    public int d;
    public final a00 f26951e;
    public long f26949b = -1;
    public final long f26948a = System.currentTimeMillis();

    public zz(a00 a00Var, String str) {
        this.f26951e = a00Var;
        this.f26950c = str;
        a00Var.f21360a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26950c);
        sb2.append(": ");
        if (this.f26949b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f26949b - this.f26948a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
