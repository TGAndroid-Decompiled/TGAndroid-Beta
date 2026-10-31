package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class c7 extends View {
    public int f21793a;
    public final int f21794b;
    public boolean f21795c;
    public boolean d;

    public c7(Context context) {
        this(context, (f1) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f21795c;
        if (z10 && this.d) {
            return 2131231230;
        }
        if (z10) {
            return 2131231231;
        }
        if (this.d) {
            return 2131231232;
        }
        return 2131232785;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.f21793a), 1073741824));
    }

    public void setSize(int i10) {
        this.f21793a = i10;
    }

    public c7(Context context, Object obj) {
        this(context, (f1) null);
    }

    public c7(Context context, f1 f1Var) {
        super(context);
        this.f21795c = true;
        this.d = true;
        this.f21793a = 12;
        int i10 = this.f21794b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public c7(Context context, int i10, int i11) {
        super(context);
        this.f21795c = true;
        this.d = true;
        this.f21794b = i10;
        this.f21793a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
