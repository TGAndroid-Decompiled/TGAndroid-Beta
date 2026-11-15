package org.telegram.ui.Components;
public final class z11 implements org.telegram.messenger.oc, org.telegram.messenger.nc {
    public final String f42212a;
    public final String f42213b;
    public final org.telegram.messenger.s10 f42214c;

    public z11(String str, String str2, org.telegram.messenger.s10 s10Var) {
        this.f42212a = str;
        this.f42213b = str2;
        this.f42214c = s10Var;
    }

    @Override
    public void a(String str) {
        p21.J0(this.f42212a, str, this.f42213b, this.f42214c);
    }

    @Override
    public void r(Exception exc) {
        p21.J0(this.f42212a, "en", this.f42213b, this.f42214c);
    }
}
