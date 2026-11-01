package org.telegram.ui.Components;
public final class x21 implements org.telegram.messenger.rc, org.telegram.messenger.qc {
    public final String f32363a;
    public final String f32364b;
    public final org.telegram.messenger.k20 f32365c;

    public x21(String str, String str2, org.telegram.messenger.k20 k20Var) {
        this.f32363a = str;
        this.f32364b = str2;
        this.f32365c = k20Var;
    }

    @Override
    public void a(String str) {
        n31.J0(this.f32363a, str, this.f32364b, this.f32365c);
    }

    @Override
    public void p(Exception exc) {
        n31.J0(this.f32363a, "en", this.f32364b, this.f32365c);
    }
}
