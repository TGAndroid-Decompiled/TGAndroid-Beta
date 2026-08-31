package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class lt extends EdgeEffect {
    public final int f28817a;
    public final kt f28818b;
    public final RecyclerView f28819c;
    public final xp d;
    public boolean f28820e;

    public lt(RecyclerView recyclerView, int i10, kt ktVar) {
        super(recyclerView.getContext());
        this.d = new xp(this, 7);
        this.f28819c = recyclerView;
        this.f28817a = i10;
        this.f28818b = ktVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f28820e != b10) {
            this.f28820e = b10;
            kt ktVar = this.f28818b;
            if (ktVar != null) {
                ktVar.a(this.f28817a, b10);
            }
        }
    }

    public final boolean b() {
        if (!isFinished()) {
            if (Build.VERSION.SDK_INT < 31 || getDistance() != 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean draw(Canvas canvas) {
        boolean draw = super.draw(canvas);
        this.f28819c.postOnAnimation(this.d);
        return draw;
    }

    @Override
    public final void finish() {
        super.finish();
        a();
    }

    @Override
    public final void onAbsorb(int i10) {
        super.onAbsorb(i10);
        a();
    }

    @Override
    public final void onPull(float f10) {
        super.onPull(f10);
        a();
    }

    @Override
    public final float onPullDistance(float f10, float f11) {
        float onPullDistance = super.onPullDistance(f10, f11);
        a();
        return onPullDistance;
    }

    @Override
    public final void onRelease() {
        super.onRelease();
        a();
    }

    @Override
    public final void setSize(int i10, int i11) {
        super.setSize(i10, i11);
        a();
    }

    @Override
    public final void onPull(float f10, float f11) {
        super.onPull(f10, f11);
        a();
    }
}
