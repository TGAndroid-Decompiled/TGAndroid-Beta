package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class ct extends EdgeEffect {
    public final int f34265a;
    public final at f34266b;
    public final RecyclerView f34267c;
    public final oo d;
    public boolean f34268e;

    public ct(RecyclerView recyclerView, int i7, at atVar) {
        super(recyclerView.getContext());
        this.d = new oo(this, 9);
        this.f34267c = recyclerView;
        this.f34265a = i7;
        this.f34266b = atVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f34268e != b10) {
            this.f34268e = b10;
            at atVar = this.f34266b;
            if (atVar != null) {
                atVar.a(this.f34265a, b10);
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
        this.f34267c.postOnAnimation(this.d);
        return draw;
    }

    @Override
    public final void finish() {
        super.finish();
        a();
    }

    @Override
    public final void onAbsorb(int i7) {
        super.onAbsorb(i7);
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
    public final void setSize(int i7, int i10) {
        super.setSize(i7, i10);
        a();
    }

    @Override
    public final void onPull(float f10, float f11) {
        super.onPull(f10, f11);
        a();
    }
}
