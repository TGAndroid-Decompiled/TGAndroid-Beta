package org.telegram.ui.Components;
public final class db implements q1.d {
    public final int f33044a;
    public final fb f33045b;
    public final q0.a f33046c;

    public db(q0.a aVar, fb fbVar, int i3) {
        this.f33044a = i3;
        this.f33046c = aVar;
        this.f33045b = fbVar;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.f33044a) {
            case 0:
                ((ra) this.f33046c).accept(Float.valueOf(this.f33045b.getTranslationY()));
                return;
            default:
                ((zk) this.f33046c).accept(Float.valueOf(this.f33045b.getTranslationY()));
                return;
        }
    }
}
