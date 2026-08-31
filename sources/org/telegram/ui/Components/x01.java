package org.telegram.ui.Components;
public final class x01 implements Runnable {
    public final int f32879a;
    public final z01 f32880b;
    public final y01 f32881c;

    public x01(z01 z01Var, y01 y01Var, int i10) {
        this.f32879a = i10;
        this.f32880b = z01Var;
        this.f32881c = y01Var;
    }

    @Override
    public final void run() {
        switch (this.f32879a) {
            case 0:
                this.f32880b.b(this.f32881c);
                return;
            case 1:
                this.f32880b.b(this.f32881c);
                return;
            default:
                this.f32880b.b(this.f32881c);
                return;
        }
    }
}
