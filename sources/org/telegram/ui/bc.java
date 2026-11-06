package org.telegram.ui;
public final class bc extends h11 {
    public final rc f44246e;

    public bc(rc rcVar, ac acVar) {
        super(acVar);
        this.f44246e = rcVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f44246e.Q = null;
    }
}
