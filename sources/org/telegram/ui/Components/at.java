package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class at extends EdgeEffect {
    public final int f33444a;
    public final ys f33445b;
    public final RecyclerView f33446c;
    public final mo d;
    public boolean f33447e;

    public at(RecyclerView recyclerView, int i7, ys ysVar) {
        super(recyclerView.getContext());
        this.d = new mo(this, 9);
        this.f33446c = recyclerView;
        this.f33444a = i7;
        this.f33445b = ysVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f33447e != b10) {
            this.f33447e = b10;
            ys ysVar = this.f33445b;
            if (ysVar != null) {
                ysVar.a(this.f33444a, b10);
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
        this.f33446c.postOnAnimation(this.d);
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
