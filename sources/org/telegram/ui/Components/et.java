package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class et extends EdgeEffect {
    public final int f28174a;
    public final dt f28175b;
    public final RecyclerView f28176c;
    public final rp d;
    public boolean f28177e;

    public et(RecyclerView recyclerView, int i10, dt dtVar) {
        super(recyclerView.getContext());
        this.d = new rp(this, 7);
        this.f28176c = recyclerView;
        this.f28174a = i10;
        this.f28175b = dtVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f28177e != b10) {
            this.f28177e = b10;
            dt dtVar = this.f28175b;
            if (dtVar != null) {
                dtVar.a(this.f28174a, b10);
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
        this.f28176c.postOnAnimation(this.d);
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
    public final void onPull(float f9) {
        super.onPull(f9);
        a();
    }

    @Override
    public final float onPullDistance(float f9, float f10) {
        float onPullDistance = super.onPullDistance(f9, f10);
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
    public final void onPull(float f9, float f10) {
        super.onPull(f9, f10);
        a();
    }
}
