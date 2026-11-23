package org.telegram.ui.Components;
public final class jb implements r1.d {
    public final int f36452a;
    public final lb f36453b;
    public final q0.a f36454c;

    public jb(q0.a aVar, lb lbVar, int i7) {
        this.f36452a = i7;
        this.f36454c = aVar;
        this.f36453b = lbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36452a) {
            case 0:
                ((xa) this.f36454c).accept(Float.valueOf(this.f36453b.getTranslationY()));
                return;
            default:
                ((rl) this.f36454c).accept(Float.valueOf(this.f36453b.getTranslationY()));
                return;
        }
    }
}
