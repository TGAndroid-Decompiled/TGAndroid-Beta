package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class ms extends EdgeEffect {
    public final int f36082a;
    public final ks f36083b;
    public final RecyclerView f36084c;
    public final gp d;
    public boolean f36085e;

    public ms(RecyclerView recyclerView, int i7, ks ksVar) {
        super(recyclerView.getContext());
        this.d = new gp(this, 7);
        this.f36084c = recyclerView;
        this.f36082a = i7;
        this.f36083b = ksVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f36085e != b10) {
            this.f36085e = b10;
            ks ksVar = this.f36083b;
            if (ksVar != null) {
                ksVar.a(this.f36082a, b10);
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
        this.f36084c.postOnAnimation(this.d);
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
