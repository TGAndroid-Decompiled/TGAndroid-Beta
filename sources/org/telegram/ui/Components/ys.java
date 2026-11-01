package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class ys extends EdgeEffect {
    public final int f32898a;
    public final ws f32899b;
    public final RecyclerView f32900c;
    public final ho d;
    public boolean e;

    public ys(RecyclerView recyclerView, int i10, ws wsVar) {
        super(recyclerView.getContext());
        this.d = new ho(this, 9);
        this.f32900c = recyclerView;
        this.f32898a = i10;
        this.f32899b = wsVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.e != b10) {
            this.e = b10;
            ws wsVar = this.f32899b;
            if (wsVar != null) {
                wsVar.a(this.f32898a, b10);
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
        this.f32900c.postOnAnimation(this.d);
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
