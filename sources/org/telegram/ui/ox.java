package org.telegram.ui;
public final class ox extends t61 {
    public final uy f39291e;

    public ox(uy uyVar, nx nxVar) {
        super(nxVar);
        this.f39291e = uyVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f39291e.M0 = null;
    }
}
