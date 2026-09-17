package org.telegram.ui.Components;
public final class a1 implements org.telegram.ui.ActionBar.a2 {
    public final int f24213a;
    public final Runnable f24214b;

    public a1(int i10, Runnable runnable) {
        this.f24213a = i10;
        this.f24214b = runnable;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24213a) {
            case 0:
                Runnable runnable = this.f24214b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f24214b.run();
                return;
            case 2:
                this.f24214b.run();
                return;
            case 3:
                this.f24214b.run();
                return;
            case 4:
                this.f24214b.run();
                b2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f24214b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                b2Var.dismiss();
                Runnable runnable3 = this.f24214b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
