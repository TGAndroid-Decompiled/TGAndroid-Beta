package org.telegram.ui.Components;
public final class dx implements Runnable {
    public final int f25606a;
    public final float f25607b;
    public final int f25608c;
    public final Object d;

    public dx(Object obj, float f7, int i10, int i11) {
        this.f25606a = i11;
        this.d = obj;
        this.f25607b = f7;
        this.f25608c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25606a) {
            case 0:
                float f7 = this.f25607b;
                int i10 = this.f25608c;
                vy vyVar = ((ex) this.d).F;
                try {
                    ci.p pVar = new ci.p(vyVar.P.getContext(), 0, f7);
                    pVar.f48056a = i10;
                    vyVar.Q.w0(pVar);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) this.d;
                float f10 = this.f25607b;
                int i11 = this.f25608c;
                try {
                    ci.p pVar2 = new ci.p(g31Var.f37305h0.getContext(), 0, f10);
                    pVar2.f48056a = i11;
                    g31Var.f37325r0.w0(pVar2);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
        }
    }
}
