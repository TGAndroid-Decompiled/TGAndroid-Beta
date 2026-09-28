package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class pt extends EdgeEffect {
    public final int f27413a;
    public final nt f27414b;
    public final RecyclerView f27415c;
    public final zp d;
    public boolean e;

    public pt(RecyclerView recyclerView, int i10, nt ntVar) {
        super(recyclerView.getContext());
        this.d = new zp(this, 7);
        this.f27415c = recyclerView;
        this.f27413a = i10;
        this.f27414b = ntVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.e != b10) {
            this.e = b10;
            nt ntVar = this.f27414b;
            if (ntVar != null) {
                ntVar.a(this.f27413a, b10);
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
        this.f27415c.postOnAnimation(this.d);
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
