package org.telegram.ui.Components;
public final class ib implements r1.d {
    public final int f35971a;
    public final kb f35972b;
    public final q0.a f35973c;

    public ib(q0.a aVar, kb kbVar, int i7) {
        this.f35971a = i7;
        this.f35973c = aVar;
        this.f35972b = kbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f35971a) {
            case 0:
                ((wa) this.f35973c).accept(Float.valueOf(this.f35972b.getTranslationY()));
                return;
            default:
                ((pl) this.f35973c).accept(Float.valueOf(this.f35972b.getTranslationY()));
                return;
        }
    }
}
