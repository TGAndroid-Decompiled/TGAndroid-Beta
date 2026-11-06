package org.telegram.ui;
public final class bc extends h11 {
    public final rc f44245e;

    public bc(rc rcVar, ac acVar) {
        super(acVar);
        this.f44245e = rcVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f44245e.Q = null;
    }
}
