package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class y6 extends View {
    public int f30927a;
    public final int f30928b;
    public boolean f30929c;
    public boolean d;

    public y6(Context context) {
        this(context, (f1) null);
    }

    private int getBackgroundResId() {
        boolean z9 = this.f30929c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30927a), 1073741824));
    }

    public void setSize(int i7) {
        this.f30927a = i7;
    }

    public y6(Context context, Object obj) {
        this(context, (f1) null);
    }

    public y6(Context context, f1 f1Var) {
        super(context);
        this.f30929c = true;
        this.d = true;
        this.f30927a = 12;
        int i7 = this.f30928b;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }

    public y6(Context context, int i7, int i10) {
        super(context);
        this.f30929c = true;
        this.d = true;
        this.f30928b = i7;
        this.f30927a = 12;
        if (i7 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i7);
        }
    }
}
