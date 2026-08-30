package org.telegram.ui;
public final class bb extends org.telegram.ui.ActionBar.p1 {
    public final sb f32888o;

    public bb(sb sbVar, ab abVar) {
        super(abVar, -2, -2);
        this.f32888o = sbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        sb sbVar = this.f32888o;
        if (sbVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.ic.e();
        sbVar.G0 = null;
    }
}
