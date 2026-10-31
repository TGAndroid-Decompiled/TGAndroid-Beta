package org.telegram.ui.Components;
public final class dx implements Runnable {
    public final int f25559a;
    public final float f25560b;
    public final int f25561c;
    public final Object d;

    public dx(Object obj, float f7, int i10, int i11) {
        this.f25559a = i11;
        this.d = obj;
        this.f25560b = f7;
        this.f25561c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25559a) {
            case 0:
                float f7 = this.f25560b;
                int i10 = this.f25561c;
                vy vyVar = ((ex) this.d).F;
                try {
                    ci.p pVar = new ci.p(vyVar.P.getContext(), 0, f7);
                    pVar.f48045a = i10;
                    vyVar.Q.w0(pVar);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                org.telegram.ui.i31 i31Var = (org.telegram.ui.i31) this.d;
                float f10 = this.f25560b;
                int i11 = this.f25561c;
                try {
                    ci.p pVar2 = new ci.p(i31Var.f38129h0.getContext(), 0, f10);
                    pVar2.f48045a = i11;
                    i31Var.f38149r0.w0(pVar2);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
        }
    }
}
