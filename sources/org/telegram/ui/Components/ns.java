package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class ns extends EdgeEffect {
    public final int f36369a;
    public final ls f36370b;
    public final RecyclerView f36371c;
    public final gp d;
    public boolean f36372e;

    public ns(RecyclerView recyclerView, int i7, ls lsVar) {
        super(recyclerView.getContext());
        this.d = new gp(this, 7);
        this.f36371c = recyclerView;
        this.f36369a = i7;
        this.f36370b = lsVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f36372e != b10) {
            this.f36372e = b10;
            ls lsVar = this.f36370b;
            if (lsVar != null) {
                lsVar.a(this.f36369a, b10);
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
        this.f36371c.postOnAnimation(this.d);
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
