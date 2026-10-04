package org.telegram.ui;
public final class ox extends t61 {
    public final uy f39292e;

    public ox(uy uyVar, nx nxVar) {
        super(nxVar);
        this.f39292e = uyVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f39292e.M0 = null;
    }
}
