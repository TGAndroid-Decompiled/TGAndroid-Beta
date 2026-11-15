package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class ts extends EdgeEffect {
    public final int f39801a;
    public final rs f39802b;
    public final RecyclerView f39803c;
    public final fo d;
    public boolean f39804e;

    public ts(RecyclerView recyclerView, int i7, rs rsVar) {
        super(recyclerView.getContext());
        this.d = new fo(this, 9);
        this.f39803c = recyclerView;
        this.f39801a = i7;
        this.f39802b = rsVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f39804e != b10) {
            this.f39804e = b10;
            rs rsVar = this.f39802b;
            if (rsVar != null) {
                rsVar.a(this.f39801a, b10);
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
        this.f39803c.postOnAnimation(this.d);
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
