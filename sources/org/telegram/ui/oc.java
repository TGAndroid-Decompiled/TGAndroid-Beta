package org.telegram.ui;
public final class oc extends e71 {
    public final fd f40646e;

    public oc(fd fdVar, nc ncVar) {
        super(ncVar);
        this.f40646e = fdVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f40646e.Q = null;
    }
}
