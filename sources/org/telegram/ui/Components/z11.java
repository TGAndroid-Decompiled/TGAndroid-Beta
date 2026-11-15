package org.telegram.ui.Components;
public final class z11 implements org.telegram.messenger.oc, org.telegram.messenger.nc {
    public final String f42214a;
    public final String f42215b;
    public final org.telegram.messenger.s10 f42216c;

    public z11(String str, String str2, org.telegram.messenger.s10 s10Var) {
        this.f42214a = str;
        this.f42215b = str2;
        this.f42216c = s10Var;
    }

    @Override
    public void a(String str) {
        p21.J0(this.f42214a, str, this.f42215b, this.f42216c);
    }

    @Override
    public void r(Exception exc) {
        p21.J0(this.f42214a, "en", this.f42215b, this.f42216c);
    }
}
