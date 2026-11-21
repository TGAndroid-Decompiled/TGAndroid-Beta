package org.telegram.ui.Components;
public final class l21 implements org.telegram.messenger.nc, org.telegram.messenger.mc {
    public final String f37072a;
    public final String f37073b;
    public final org.telegram.messenger.q10 f37074c;

    public l21(String str, String str2, org.telegram.messenger.q10 q10Var) {
        this.f37072a = str;
        this.f37073b = str2;
        this.f37074c = q10Var;
    }

    @Override
    public void a(String str) {
        b31.K0(this.f37072a, str, this.f37073b, this.f37074c);
    }

    @Override
    public void q(Exception exc) {
        b31.K0(this.f37072a, "en", this.f37073b, this.f37074c);
    }
}
