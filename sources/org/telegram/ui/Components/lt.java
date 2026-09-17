package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class lt extends EdgeEffect {
    public final int f28303a;
    public final kt f28304b;
    public final RecyclerView f28305c;
    public final wp d;
    public boolean f28306e;

    public lt(RecyclerView recyclerView, int i10, kt ktVar) {
        super(recyclerView.getContext());
        this.d = new wp(this, 7);
        this.f28305c = recyclerView;
        this.f28303a = i10;
        this.f28304b = ktVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f28306e != b10) {
            this.f28306e = b10;
            kt ktVar = this.f28304b;
            if (ktVar != null) {
                ktVar.a(this.f28303a, b10);
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
        this.f28305c.postOnAnimation(this.d);
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
