package org.telegram.ui.Components;
public final class ya implements o1.g {
    public final int f32790a;
    public final bb f32791b;
    public final q0.a f32792c;

    public ya(q0.a aVar, bb bbVar, int i10) {
        this.f32790a = i10;
        this.f32792c = aVar;
        this.f32791b = bbVar;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f32790a) {
            case 0:
                ((ma) this.f32792c).accept(Float.valueOf(this.f32791b.getTranslationY()));
                return;
            default:
                ((gl) this.f32792c).accept(Float.valueOf(this.f32791b.getTranslationY()));
                return;
        }
    }
}
