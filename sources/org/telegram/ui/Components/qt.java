package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
public final class qt extends EdgeEffect {
    public final int f30198a;
    public final ot f30199b;
    public final RecyclerView f30200c;
    public final aq d;
    public boolean f30201e;

    public qt(RecyclerView recyclerView, int i10, ot otVar) {
        super(recyclerView.getContext());
        this.d = new aq(this, 7);
        this.f30200c = recyclerView;
        this.f30198a = i10;
        this.f30199b = otVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.f30201e != b10) {
            this.f30201e = b10;
            ot otVar = this.f30199b;
            if (otVar != null) {
                otVar.a(this.f30198a, b10);
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
        this.f30200c.postOnAnimation(this.d);
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
