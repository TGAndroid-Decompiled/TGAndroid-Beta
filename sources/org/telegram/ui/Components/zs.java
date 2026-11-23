package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class zs extends EdgeEffect {
    public final int f43034a;
    public final xs f43035b;
    public final RecyclerView f43036c;
    public final lo d;
    public boolean f43037e;

    public zs(RecyclerView recyclerView, int i7, xs xsVar) {
        super(recyclerView.getContext());
        this.d = new lo(this, 9);
        this.f43036c = recyclerView;
        this.f43034a = i7;
        this.f43035b = xsVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f43037e != b10) {
            this.f43037e = b10;
            xs xsVar = this.f43035b;
            if (xsVar != null) {
                xsVar.a(this.f43034a, b10);
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
        this.f43036c.postOnAnimation(this.d);
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
