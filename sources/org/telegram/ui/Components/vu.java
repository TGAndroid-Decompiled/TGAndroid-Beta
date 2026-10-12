package org.telegram.ui.Components;
public final class vu implements Runnable {
    public final int f32190a;
    public final wu f32191b;

    public vu(wu wuVar, int i10) {
        this.f32190a = i10;
        this.f32191b = wuVar;
    }

    @Override
    public final void run() {
        switch (this.f32190a) {
            case 0:
                wu wuVar = this.f32191b;
                wuVar.post(new vu(wuVar, 1));
                return;
            case 1:
                wu wuVar2 = this.f32191b;
                wuVar2.invalidateSpoilers();
                wuVar2.b();
                return;
            case 2:
                wu.a(this.f32191b);
                return;
            case 3:
                wu wuVar3 = this.f32191b;
                wuVar3.post(new vu(wuVar3, 4));
                return;
            default:
                this.f32191b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
