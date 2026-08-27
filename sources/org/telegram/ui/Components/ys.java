package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

public final class ys extends EdgeEffect {

    public final int f34957a;

    public final xs f34958b;

    public final RecyclerView f34959c;
    public final lp d;

    public boolean f34960e;

    public ys(RecyclerView recyclerView, int i10, xs xsVar) {
        super(recyclerView.getContext());
        this.d = new lp(this, 7);
        this.f34959c = recyclerView;
        this.f34957a = i10;
        this.f34958b = xsVar;
    }

    public final void a() {
        boolean zB = b();
        if (this.f34960e != zB) {
            this.f34960e = zB;
            xs xsVar = this.f34958b;
            if (xsVar != null) {
                xsVar.a(this.f34957a, zB);
            }
        }
    }

    public final boolean b() {
        if (isFinished()) {
            return false;
        }
        return Build.VERSION.SDK_INT < 31 || getDistance() != 0.0f;
    }

    @Override
    public final boolean draw(Canvas canvas) {
        boolean zDraw = super.draw(canvas);
        this.f34959c.postOnAnimation(this.d);
        return zDraw;
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
        float fOnPullDistance = super.onPullDistance(f10, f11);
        a();
        return fOnPullDistance;
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
