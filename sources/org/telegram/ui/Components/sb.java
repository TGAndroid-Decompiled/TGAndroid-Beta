package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f32502a;
    public final ub f32503b;
    public final q0.a f32504c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f32502a = i10;
        this.f32504c = aVar;
        this.f32503b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f32502a) {
            case 0:
                ((gb) this.f32504c).accept(Float.valueOf(this.f32503b.getTranslationY()));
                return;
            default:
                ((yl) this.f32504c).accept(Float.valueOf(this.f32503b.getTranslationY()));
                return;
        }
    }
}
