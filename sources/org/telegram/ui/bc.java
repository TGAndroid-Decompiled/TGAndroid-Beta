package org.telegram.ui;
public final class bc extends h11 {
    public final rc f44230e;

    public bc(rc rcVar, ac acVar) {
        super(acVar);
        this.f44230e = rcVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f44230e.Q = null;
    }
}
