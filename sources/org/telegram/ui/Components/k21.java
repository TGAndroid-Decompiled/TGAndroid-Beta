package org.telegram.ui.Components;
public final class k21 implements org.telegram.messenger.nc, org.telegram.messenger.mc {
    public final String f36609a;
    public final String f36610b;
    public final org.telegram.messenger.p10 f36611c;

    public k21(String str, String str2, org.telegram.messenger.p10 p10Var) {
        this.f36609a = str;
        this.f36610b = str2;
        this.f36611c = p10Var;
    }

    @Override
    public void a(String str) {
        a31.K0(this.f36609a, str, this.f36610b, this.f36611c);
    }

    @Override
    public void s(Exception exc) {
        a31.K0(this.f36609a, "en", this.f36610b, this.f36611c);
    }
}
