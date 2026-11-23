package org.telegram.ui.Components;
public final class jb implements r1.d {
    public final int f36453a;
    public final lb f36454b;
    public final q0.a f36455c;

    public jb(q0.a aVar, lb lbVar, int i7) {
        this.f36453a = i7;
        this.f36455c = aVar;
        this.f36454b = lbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36453a) {
            case 0:
                ((xa) this.f36455c).accept(Float.valueOf(this.f36454b.getTranslationY()));
                return;
            default:
                ((rl) this.f36455c).accept(Float.valueOf(this.f36454b.getTranslationY()));
                return;
        }
    }
}
