package org.telegram.ui.Components;
public final class jb implements r1.d {
    public final int f36458a;
    public final lb f36459b;
    public final q0.a f36460c;

    public jb(q0.a aVar, lb lbVar, int i7) {
        this.f36458a = i7;
        this.f36460c = aVar;
        this.f36459b = lbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36458a) {
            case 0:
                ((xa) this.f36460c).accept(Float.valueOf(this.f36459b.getTranslationY()));
                return;
            default:
                ((rl) this.f36460c).accept(Float.valueOf(this.f36459b.getTranslationY()));
                return;
        }
    }
}
