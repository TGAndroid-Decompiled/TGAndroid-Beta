package org.telegram.ui.Components;
public final class ya implements o1.g {
    public final int f32674a;
    public final bb f32675b;
    public final q0.a f32676c;

    public ya(q0.a aVar, bb bbVar, int i10) {
        this.f32674a = i10;
        this.f32676c = aVar;
        this.f32675b = bbVar;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f32674a) {
            case 0:
                ((ma) this.f32676c).accept(Float.valueOf(this.f32675b.getTranslationY()));
                return;
            default:
                ((gl) this.f32676c).accept(Float.valueOf(this.f32675b.getTranslationY()));
                return;
        }
    }
}
