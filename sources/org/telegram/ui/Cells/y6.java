package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class y6 extends View {
    public int f32568a;
    public final int f32569b;
    public boolean f32570c;
    public boolean d;

    public y6(Context context) {
        this(context, (c0) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f32570c;
        if (z10 && this.d) {
            return 2131231232;
        }
        if (z10) {
            return 2131231233;
        }
        if (this.d) {
            return 2131231234;
        }
        return 2131232793;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f32568a), 1073741824));
    }

    public void setSize(int i7) {
        this.f32568a = i7;
    }

    public y6(Context context, Object obj) {
        this(context, (c0) null);
    }

    public y6(Context context, c0 c0Var) {
        super(context);
        this.f32570c = true;
        this.d = true;
        this.f32568a = 12;
        int i7 = this.f32569b;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }

    public y6(Context context, int i7, int i10) {
        super(context);
        this.f32570c = true;
        this.d = true;
        this.f32569b = i7;
        this.f32568a = 12;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }
}
