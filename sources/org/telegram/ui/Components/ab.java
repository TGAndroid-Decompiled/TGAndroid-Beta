package org.telegram.ui.Components;
public final class ab implements r1.d {
    public final int f32943a;
    public final cb f32944b;
    public final q0.a f32945c;

    public ab(q0.a aVar, cb cbVar, int i7) {
        this.f32943a = i7;
        this.f32945c = aVar;
        this.f32944b = cbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f32943a) {
            case 0:
                ((oa) this.f32945c).accept(Float.valueOf(this.f32944b.getTranslationY()));
                return;
            default:
                ((il) this.f32945c).accept(Float.valueOf(this.f32944b.getTranslationY()));
                return;
        }
    }
}
