package org.telegram.ui.Components;
public final class u11 implements org.telegram.messenger.pc, org.telegram.messenger.oc {
    public final String f38476a;
    public final String f38477b;
    public final org.telegram.messenger.v10 f38478c;

    public u11(String str, String str2, org.telegram.messenger.v10 v10Var) {
        this.f38476a = str;
        this.f38477b = str2;
        this.f38478c = v10Var;
    }

    @Override
    public void a(String str) {
        k21.J0(this.f38476a, str, this.f38477b, this.f38478c);
    }

    @Override
    public void r(Exception exc) {
        k21.J0(this.f38476a, "en", this.f38477b, this.f38478c);
    }
}
