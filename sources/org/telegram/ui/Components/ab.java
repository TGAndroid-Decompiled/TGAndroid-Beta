package org.telegram.ui.Components;
public final class ab implements r1.d {
    public final int f32940a;
    public final cb f32941b;
    public final q0.a f32942c;

    public ab(q0.a aVar, cb cbVar, int i7) {
        this.f32940a = i7;
        this.f32942c = aVar;
        this.f32941b = cbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f32940a) {
            case 0:
                ((oa) this.f32942c).accept(Float.valueOf(this.f32941b.getTranslationY()));
                return;
            default:
                ((il) this.f32942c).accept(Float.valueOf(this.f32941b.getTranslationY()));
                return;
        }
    }
}
