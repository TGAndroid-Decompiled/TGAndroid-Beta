package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class x6 extends View {
    public int f32040a;
    public final int f32041b;
    public boolean f32042c;
    public boolean d;

    public x6(Context context) {
        this(context, (y0) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f32042c;
        if (z10 && this.d) {
            return 2131231229;
        }
        if (z10) {
            return 2131231230;
        }
        if (this.d) {
            return 2131231231;
        }
        return 2131232789;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f32040a), 1073741824));
    }

    public void setSize(int i7) {
        this.f32040a = i7;
    }

    public x6(Context context, Object obj) {
        this(context, (y0) null);
    }

    public x6(Context context, y0 y0Var) {
        super(context);
        this.f32042c = true;
        this.d = true;
        this.f32040a = 12;
        int i7 = this.f32041b;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }

    public x6(Context context, int i7, int i10) {
        super(context);
        this.f32042c = true;
        this.d = true;
        this.f32041b = i7;
        this.f32040a = 12;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }
}
