package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class fu extends EdgeEffect {
    public final int f26171a;
    public final du f26172b;
    public final RecyclerView f26173c;
    public final pq d;
    public boolean f26174e;

    public fu(RecyclerView recyclerView, int i10, du duVar) {
        super(recyclerView.getContext());
        this.d = new pq(this, 7);
        this.f26173c = recyclerView;
        this.f26171a = i10;
        this.f26172b = duVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f26174e != b10) {
            this.f26174e = b10;
            du duVar = this.f26172b;
            if (duVar != null) {
                duVar.a(this.f26171a, b10);
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
        this.f26173c.postOnAnimation(this.d);
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
