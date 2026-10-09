package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class du extends EdgeEffect {
    public final int f25811a;
    public final bu f25812b;
    public final RecyclerView f25813c;
    public final nq d;
    public boolean f25814e;

    public du(RecyclerView recyclerView, int i10, bu buVar) {
        super(recyclerView.getContext());
        this.d = new nq(this, 7);
        this.f25813c = recyclerView;
        this.f25811a = i10;
        this.f25812b = buVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f25814e != b10) {
            this.f25814e = b10;
            bu buVar = this.f25812b;
            if (buVar != null) {
                buVar.a(this.f25811a, b10);
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
        this.f25813c.postOnAnimation(this.d);
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
    public final void onPull(float f7) {
        super.onPull(f7);
        a();
    }

    @Override
    public final float onPullDistance(float f7, float f10) {
        float onPullDistance = super.onPullDistance(f7, f10);
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
    public final void onPull(float f7, float f10) {
        super.onPull(f7, f10);
        a();
    }
}
