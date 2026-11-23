package org.telegram.ui.Components;
public final class l21 implements org.telegram.messenger.oc, org.telegram.messenger.nc {
    public final String f37078a;
    public final String f37079b;
    public final org.telegram.messenger.r10 f37080c;

    public l21(String str, String str2, org.telegram.messenger.r10 r10Var) {
        this.f37078a = str;
        this.f37079b = str2;
        this.f37080c = r10Var;
    }

    @Override
    public void a(String str) {
        b31.K0(this.f37078a, str, this.f37079b, this.f37080c);
    }

    @Override
    public void q(Exception exc) {
        b31.K0(this.f37078a, "en", this.f37079b, this.f37080c);
    }
}
