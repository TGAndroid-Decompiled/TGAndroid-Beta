package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class jt extends EdgeEffect {
    public final int f26034a;
    public final ht f26035b;
    public final RecyclerView f26036c;
    public final vp d;
    public boolean e;

    public jt(RecyclerView recyclerView, int i10, ht htVar) {
        super(recyclerView.getContext());
        this.d = new vp(this, 7);
        this.f26036c = recyclerView;
        this.f26034a = i10;
        this.f26035b = htVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.e != b10) {
            this.e = b10;
            ht htVar = this.f26035b;
            if (htVar != null) {
                htVar.a(this.f26034a, b10);
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
        this.f26036c.postOnAnimation(this.d);
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
