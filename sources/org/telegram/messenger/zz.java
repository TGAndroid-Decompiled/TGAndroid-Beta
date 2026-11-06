package org.telegram.messenger;
public class zz {
    public final String f26947c;
    public int d;
    public final a00 f26948e;
    public long f26946b = -1;
    public final long f26945a = System.currentTimeMillis();

    public zz(a00 a00Var, String str) {
        this.f26948e = a00Var;
        this.f26947c = str;
        a00Var.f21357a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26947c);
        sb2.append(": ");
        if (this.f26946b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f26946b - this.f26945a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
