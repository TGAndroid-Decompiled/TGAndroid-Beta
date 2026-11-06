package org.telegram.ui.Components;
public final class o11 implements org.telegram.messenger.pc, org.telegram.messenger.oc {
    public final String f36567a;
    public final String f36568b;
    public final org.telegram.messenger.v10 f36569c;

    public o11(String str, String str2, org.telegram.messenger.v10 v10Var) {
        this.f36567a = str;
        this.f36568b = str2;
        this.f36569c = v10Var;
    }

    @Override
    public void a(String str) {
        e21.J0(this.f36567a, str, this.f36568b, this.f36569c);
    }

    @Override
    public void r(Exception exc) {
        e21.J0(this.f36567a, "en", this.f36568b, this.f36569c);
    }
}
