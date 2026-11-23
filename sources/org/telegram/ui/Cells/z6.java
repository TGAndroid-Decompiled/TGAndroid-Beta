package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class z6 extends View {
    public int f32515a;
    public final int f32516b;
    public boolean f32517c;
    public boolean d;

    public z6(Context context) {
        this(context, (c0) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f32517c;
        if (z10 && this.d) {
            return 2131231229;
        }
        if (z10) {
            return 2131231230;
        }
        if (this.d) {
            return 2131231231;
        }
        return 2131232790;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f32515a), 1073741824));
    }

    public void setSize(int i7) {
        this.f32515a = i7;
    }

    public z6(Context context, Object obj) {
        this(context, (c0) null);
    }

    public z6(Context context, c0 c0Var) {
        super(context);
        this.f32517c = true;
        this.d = true;
        this.f32515a = 12;
        int i7 = this.f32516b;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }

    public z6(Context context, int i7, int i10) {
        super(context);
        this.f32517c = true;
        this.d = true;
        this.f32516b = i7;
        this.f32515a = 12;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }
}
