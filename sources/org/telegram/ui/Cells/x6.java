package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class x6 extends View {
    public int f30963a;
    public final int f30964b;
    public boolean f30965c;
    public boolean d;

    public x6(Context context) {
        this(context, (f1) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f30965c;
        if (z10 && this.d) {
            return 2131231229;
        }
        if (z10) {
            return 2131231230;
        }
        if (this.d) {
            return 2131231231;
        }
        return 2131232786;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30963a), 1073741824));
    }

    public void setSize(int i3) {
        this.f30963a = i3;
    }

    public x6(Context context, Object obj) {
        this(context, (f1) null);
    }

    public x6(Context context, f1 f1Var) {
        super(context);
        this.f30965c = true;
        this.d = true;
        this.f30963a = 12;
        int i3 = this.f30964b;
        if (i3 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i3);
        }
    }

    public x6(Context context, int i3, int i10) {
        super(context);
        this.f30965c = true;
        this.d = true;
        this.f30964b = i3;
        this.f30963a = 12;
        if (i3 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i3);
        }
    }
}
