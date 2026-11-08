package org.telegram.ui.Components;
public final class u11 implements org.telegram.messenger.pc, org.telegram.messenger.oc {
    public final String f38491a;
    public final String f38492b;
    public final org.telegram.messenger.v10 f38493c;

    public u11(String str, String str2, org.telegram.messenger.v10 v10Var) {
        this.f38491a = str;
        this.f38492b = str2;
        this.f38493c = v10Var;
    }

    @Override
    public void a(String str) {
        k21.J0(this.f38491a, str, this.f38492b, this.f38493c);
    }

    @Override
    public void r(Exception exc) {
        k21.J0(this.f38491a, "en", this.f38492b, this.f38493c);
    }
}
