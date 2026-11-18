package org.telegram.ui.Components;
public final class i21 implements org.telegram.messenger.nc, org.telegram.messenger.mc {
    public final String f36031a;
    public final String f36032b;
    public final org.telegram.messenger.q10 f36033c;

    public i21(String str, String str2, org.telegram.messenger.q10 q10Var) {
        this.f36031a = str;
        this.f36032b = str2;
        this.f36033c = q10Var;
    }

    @Override
    public void a(String str) {
        y21.K0(this.f36031a, str, this.f36032b, this.f36033c);
    }

    @Override
    public void q(Exception exc) {
        y21.K0(this.f36031a, "en", this.f36032b, this.f36033c);
    }
}
