package org.telegram.ui.Components;
public final class o11 implements org.telegram.messenger.jc, org.telegram.messenger.ic {
    public final String f36678a;
    public final String f36679b;
    public final org.telegram.messenger.n10 f36680c;

    public o11(String str, String str2, org.telegram.messenger.n10 n10Var) {
        this.f36678a = str;
        this.f36679b = str2;
        this.f36680c = n10Var;
    }

    @Override
    public void a(String str) {
        f21.J0(this.f36678a, str, this.f36679b, this.f36680c);
    }

    @Override
    public void s(Exception exc) {
        f21.J0(this.f36678a, "en", this.f36679b, this.f36680c);
    }
}
