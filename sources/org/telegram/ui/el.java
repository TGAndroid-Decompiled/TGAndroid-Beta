package org.telegram.ui;
public final class el implements Runnable {
    public final int f32966a;
    public final fl f32967b;

    public el(fl flVar, int i10) {
        this.f32966a = i10;
        this.f32967b = flVar;
    }

    @Override
    public final void run() {
        switch (this.f32966a) {
            case 0:
                jk jkVar = this.f32967b.H.Y;
                if (jkVar != null) {
                    jkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = jkVar.U0;
                    if (dgVar != null) {
                        dgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                jk jkVar2 = this.f32967b.H.Y;
                if (jkVar2 != null) {
                    jkVar2.I0();
                    return;
                }
                return;
        }
    }
}
