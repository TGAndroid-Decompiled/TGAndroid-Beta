package org.telegram.ui;
public final class ox extends t61 {
    public final uy f39297e;

    public ox(uy uyVar, nx nxVar) {
        super(nxVar);
        this.f39297e = uyVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f39297e.M0 = null;
    }
}
