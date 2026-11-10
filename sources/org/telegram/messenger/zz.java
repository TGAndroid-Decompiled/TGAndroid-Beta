package org.telegram.messenger;
public class zz {
    public final String f26954c;
    public int d;
    public final a00 f26955e;
    public long f26953b = -1;
    public final long f26952a = System.currentTimeMillis();

    public zz(a00 a00Var, String str) {
        this.f26955e = a00Var;
        this.f26954c = str;
        a00Var.f21365a++;
    }

    public String toString() {
        String r10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26954c);
        sb2.append(": ");
        if (this.f26953b < 0) {
            r10 = "not done";
        } else {
            r10 = a8.p0.r(new StringBuilder(), this.f26953b - this.f26952a, "ms");
        }
        sb2.append(r10);
        return sb2.toString();
    }
}
