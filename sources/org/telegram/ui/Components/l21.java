package org.telegram.ui.Components;
public final class l21 implements org.telegram.messenger.oc, org.telegram.messenger.nc {
    public final String f37077a;
    public final String f37078b;
    public final org.telegram.messenger.r10 f37079c;

    public l21(String str, String str2, org.telegram.messenger.r10 r10Var) {
        this.f37077a = str;
        this.f37078b = str2;
        this.f37079c = r10Var;
    }

    @Override
    public void a(String str) {
        b31.K0(this.f37077a, str, this.f37078b, this.f37079c);
    }

    @Override
    public void q(Exception exc) {
        b31.K0(this.f37077a, "en", this.f37078b, this.f37079c);
    }
}
