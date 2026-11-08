package org.telegram.ui.Components;
public final class pw implements Runnable {
    public final int f37109a;
    public final float f37110b;
    public final int f37111c;
    public final Object d;

    public pw(Object obj, float f10, int i7, int i10) {
        this.f37109a = i10;
        this.d = obj;
        this.f37110b = f10;
        this.f37111c = i7;
    }

    @Override
    public final void run() {
        switch (this.f37109a) {
            case 0:
                float f10 = this.f37110b;
                int i7 = this.f37111c;
                hy hyVar = ((qw) this.d).F;
                try {
                    mi.m mVar = new mi.m(hyVar.P.getContext(), 0, f10);
                    mVar.f57213a = i7;
                    hyVar.Q.w0(mVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) this.d;
                float f11 = this.f37110b;
                int i10 = this.f37111c;
                try {
                    mi.m mVar2 = new mi.m(q11Var.f49037h0.getContext(), 0, f11);
                    mVar2.f57213a = i10;
                    q11Var.f49056r0.w0(mVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
