package org.telegram.ui.Components;
public final class u11 implements org.telegram.messenger.pc, org.telegram.messenger.oc {
    public final String f38484a;
    public final String f38485b;
    public final org.telegram.messenger.v10 f38486c;

    public u11(String str, String str2, org.telegram.messenger.v10 v10Var) {
        this.f38484a = str;
        this.f38485b = str2;
        this.f38486c = v10Var;
    }

    @Override
    public void a(String str) {
        k21.J0(this.f38484a, str, this.f38485b, this.f38486c);
    }

    @Override
    public void r(Exception exc) {
        k21.J0(this.f38484a, "en", this.f38485b, this.f38486c);
    }
}
