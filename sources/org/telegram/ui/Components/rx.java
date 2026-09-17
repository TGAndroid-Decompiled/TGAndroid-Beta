package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class rx implements Runnable {
    public final int f27710a;
    public final float f27711b;
    public final int f27712c;
    public final Object d;

    public rx(Object obj, float f7, int i10, int i11) {
        this.f27710a = i11;
        this.d = obj;
        this.f27711b = f7;
        this.f27712c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27710a) {
            case 0:
                float f7 = this.f27711b;
                int i10 = this.f27712c;
                kz kzVar = ((sx) this.d).F;
                try {
                    ji.o oVar = new ji.o(kzVar.P.getContext(), 0, f7);
                    oVar.f42847a = i10;
                    kzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.i71 i71Var = (org.telegram.ui.i71) this.d;
                float f10 = this.f27711b;
                int i11 = this.f27712c;
                try {
                    ji.o oVar2 = new ji.o(i71Var.f34461h0.getContext(), 0, f10);
                    oVar2.f42847a = i11;
                    i71Var.f34481r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
