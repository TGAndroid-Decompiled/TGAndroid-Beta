package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class y6 extends View {
    public int f30936a;
    public final int f30937b;
    public boolean f30938c;
    public boolean d;

    public y6(Context context) {
        this(context, (f1) null);
    }

    private int getBackgroundResId() {
        boolean z9 = this.f30938c;
        if (z9 && this.d) {
            return 2131231229;
        }
        if (z9) {
            return 2131231230;
        }
        if (this.d) {
            return 2131231231;
        }
        return 2131232788;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30936a), 1073741824));
    }

    public void setSize(int i7) {
        this.f30936a = i7;
    }

    public y6(Context context, Object obj) {
        this(context, (f1) null);
    }

    public y6(Context context, f1 f1Var) {
        super(context);
        this.f30938c = true;
        this.d = true;
        this.f30936a = 12;
        int i7 = this.f30937b;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }

    public y6(Context context, int i7, int i10) {
        super(context);
        this.f30938c = true;
        this.d = true;
        this.f30937b = i7;
        this.f30936a = 12;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }
}
