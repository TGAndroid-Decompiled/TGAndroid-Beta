package org.telegram.messenger;
public class zz {
    public final String f26946c;
    public int d;
    public final a00 f26947e;
    public long f26945b = -1;
    public final long f26944a = System.currentTimeMillis();

    public zz(a00 a00Var, String str) {
        this.f26947e = a00Var;
        this.f26946c = str;
        a00Var.f21357a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26946c);
        sb2.append(": ");
        if (this.f26945b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f26945b - this.f26944a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
