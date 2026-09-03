package org.telegram.ui.Components;
public final class m0 implements wc0 {
    public final int f28909a;
    public final yc0 f28910b;
    public final yc0 f28911c;
    public final yc0 d;

    public m0(yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, int i10) {
        this.f28909a = i10;
        this.f28910b = yc0Var;
        this.f28911c = yc0Var2;
        this.d = yc0Var3;
    }

    @Override
    public final void q(yc0 yc0Var, int i10) {
        switch (this.f28909a) {
            case 0:
                z4.b(this.f28910b, this.f28911c, this.d);
                return;
            case 1:
                z4.y0(this.f28910b, this.f28911c, this.d);
                return;
            default:
                z4.y0(this.f28910b, this.f28911c, this.d);
                return;
        }
    }
}
