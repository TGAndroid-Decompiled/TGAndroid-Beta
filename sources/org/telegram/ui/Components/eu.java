package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class eu extends EdgeEffect {
    public final int f26169a;
    public final cu f26170b;
    public final RecyclerView f26171c;
    public final nq d;
    public boolean f26172e;

    public eu(RecyclerView recyclerView, int i10, cu cuVar) {
        super(recyclerView.getContext());
        this.d = new nq(this, 7);
        this.f26171c = recyclerView;
        this.f26169a = i10;
        this.f26170b = cuVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f26172e != b10) {
            this.f26172e = b10;
            cu cuVar = this.f26170b;
            if (cuVar != null) {
                cuVar.a(this.f26169a, b10);
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
        this.f26171c.postOnAnimation(this.d);
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
