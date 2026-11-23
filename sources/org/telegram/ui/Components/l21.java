package org.telegram.ui.Components;
public final class l21 implements org.telegram.messenger.oc, org.telegram.messenger.nc {
    public final String f37034a;
    public final String f37035b;
    public final org.telegram.messenger.r10 f37036c;

    public l21(String str, String str2, org.telegram.messenger.r10 r10Var) {
        this.f37034a = str;
        this.f37035b = str2;
        this.f37036c = r10Var;
    }

    @Override
    public void a(String str) {
        b31.K0(this.f37034a, str, this.f37035b, this.f37036c);
    }

    @Override
    public void q(Exception exc) {
        b31.K0(this.f37034a, "en", this.f37035b, this.f37036c);
    }
}
