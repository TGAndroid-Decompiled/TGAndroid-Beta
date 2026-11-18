package org.telegram.ui.Components;
public final class jb implements r1.d {
    public final int f36395a;
    public final lb f36396b;
    public final q0.a f36397c;

    public jb(q0.a aVar, lb lbVar, int i7) {
        this.f36395a = i7;
        this.f36397c = aVar;
        this.f36396b = lbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36395a) {
            case 0:
                ((xa) this.f36397c).accept(Float.valueOf(this.f36396b.getTranslationY()));
                return;
            default:
                ((pl) this.f36397c).accept(Float.valueOf(this.f36396b.getTranslationY()));
                return;
        }
    }
}
