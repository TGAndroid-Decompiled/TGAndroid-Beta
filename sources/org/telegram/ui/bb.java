package org.telegram.ui;
public final class bb extends org.telegram.ui.ActionBar.p1 {
    public final sb f35422o;

    public bb(sb sbVar, ab abVar) {
        super(abVar, -2, -2);
        this.f35422o = sbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        sb sbVar = this.f35422o;
        if (sbVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.ic.e();
        sbVar.G0 = null;
    }
}
