package org.telegram.ui.Components;
public final class v11 implements org.telegram.messenger.pc, org.telegram.messenger.oc {
    public final String f38890a;
    public final String f38891b;
    public final org.telegram.messenger.v10 f38892c;

    public v11(String str, String str2, org.telegram.messenger.v10 v10Var) {
        this.f38890a = str;
        this.f38891b = str2;
        this.f38892c = v10Var;
    }

    @Override
    public void a(String str) {
        l21.J0(this.f38890a, str, this.f38891b, this.f38892c);
    }

    @Override
    public void r(Exception exc) {
        l21.J0(this.f38890a, "en", this.f38891b, this.f38892c);
    }
}
