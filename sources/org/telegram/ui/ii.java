package org.telegram.ui;
public final class ii extends org.telegram.ui.ActionBar.f1 {
    public final wm f46270o;

    public ii(wm wmVar, gi giVar) {
        super(giVar, -2, -2);
        this.f46270o = wmVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wm wmVar = this.f46270o;
        if (wmVar.f51316f9 == this) {
            wmVar.f51316f9 = null;
            wmVar.f51354i9 = null;
            wmVar.f51342h9 = null;
            wmVar.C0.R = true;
            if (wmVar.f51329g9) {
                wmVar.v8(false, true, 0.0f);
            } else {
                wmVar.f51329g9 = true;
            }
            mj mjVar = wmVar.f51237a0;
            if (mjVar != null && mjVar.getEditField() != null) {
                wmVar.f51237a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
