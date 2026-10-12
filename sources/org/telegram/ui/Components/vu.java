package org.telegram.ui.Components;
public final class vu implements Runnable {
    public final int f32176a;
    public final wu f32177b;

    public vu(wu wuVar, int i10) {
        this.f32176a = i10;
        this.f32177b = wuVar;
    }

    @Override
    public final void run() {
        switch (this.f32176a) {
            case 0:
                wu wuVar = this.f32177b;
                wuVar.post(new vu(wuVar, 1));
                return;
            case 1:
                wu wuVar2 = this.f32177b;
                wuVar2.invalidateSpoilers();
                wuVar2.b();
                return;
            case 2:
                wu.a(this.f32177b);
                return;
            case 3:
                wu wuVar3 = this.f32177b;
                wuVar3.post(new vu(wuVar3, 4));
                return;
            default:
                this.f32177b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
