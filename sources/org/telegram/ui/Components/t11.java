package org.telegram.ui.Components;
public final class t11 implements org.telegram.messenger.pc, org.telegram.messenger.oc {
    public final String f38188a;
    public final String f38189b;
    public final org.telegram.messenger.v10 f38190c;

    public t11(String str, String str2, org.telegram.messenger.v10 v10Var) {
        this.f38188a = str;
        this.f38189b = str2;
        this.f38190c = v10Var;
    }

    @Override
    public void a(String str) {
        j21.J0(this.f38188a, str, this.f38189b, this.f38190c);
    }

    @Override
    public void r(Exception exc) {
        j21.J0(this.f38188a, "en", this.f38189b, this.f38190c);
    }
}
