package org.telegram.ui.Components;
public final class jb implements r1.d {
    public final int f36411a;
    public final lb f36412b;
    public final q0.a f36413c;

    public jb(q0.a aVar, lb lbVar, int i7) {
        this.f36411a = i7;
        this.f36413c = aVar;
        this.f36412b = lbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36411a) {
            case 0:
                ((xa) this.f36413c).accept(Float.valueOf(this.f36412b.getTranslationY()));
                return;
            default:
                ((rl) this.f36413c).accept(Float.valueOf(this.f36412b.getTranslationY()));
                return;
        }
    }
}
