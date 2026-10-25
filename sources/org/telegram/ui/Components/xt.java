package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class xt extends EdgeEffect {
    public final int f34813a;
    public final vt f34814b;
    public final RecyclerView f34815c;
    public final bq d;
    public boolean e;

    public xt(RecyclerView recyclerView, int i10, vt vtVar) {
        super(recyclerView.getContext());
        this.d = new bq(this, 8);
        this.f34815c = recyclerView;
        this.f34813a = i10;
        this.f34814b = vtVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.e != b10) {
            this.e = b10;
            vt vtVar = this.f34814b;
            if (vtVar != null) {
                vtVar.a(this.f34813a, b10);
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
        this.f34815c.postOnAnimation(this.d);
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
