package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class zs extends EdgeEffect {
    public final int f35369a;
    public final ys f35370b;
    public final RecyclerView f35371c;
    public final np d;
    public boolean f35372e;

    public zs(RecyclerView recyclerView, int i9, ys ysVar) {
        super(recyclerView.getContext());
        this.d = new np(this, 7);
        this.f35371c = recyclerView;
        this.f35369a = i9;
        this.f35370b = ysVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f35372e != b10) {
            this.f35372e = b10;
            ys ysVar = this.f35370b;
            if (ysVar != null) {
                ysVar.a(this.f35369a, b10);
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
        this.f35371c.postOnAnimation(this.d);
        return draw;
    }

    @Override
    public final void finish() {
        super.finish();
        a();
    }

    @Override
    public final void onAbsorb(int i9) {
        super.onAbsorb(i9);
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
    public final void setSize(int i9, int i10) {
        super.setSize(i9, i10);
        a();
    }

    @Override
    public final void onPull(float f10, float f11) {
        super.onPull(f10, f11);
        a();
    }
}
