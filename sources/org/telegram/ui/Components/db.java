package org.telegram.ui.Components;
public final class db implements r1.d {
    public final int f32941a;
    public final fb f32942b;
    public final q0.a f32943c;

    public db(q0.a aVar, fb fbVar, int i7) {
        this.f32941a = i7;
        this.f32943c = aVar;
        this.f32942b = fbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f32941a) {
            case 0:
                ((ra) this.f32943c).accept(Float.valueOf(this.f32942b.getTranslationY()));
                return;
            default:
                ((al) this.f32943c).accept(Float.valueOf(this.f32942b.getTranslationY()));
                return;
        }
    }
}
