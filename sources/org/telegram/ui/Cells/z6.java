package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class z6 extends View {
    public int f23872a;
    public final int f23873b;
    public boolean f23874c;
    public boolean d;

    public z6(Context context) {
        this(context, (t0) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f23874c;
        if (z10 && this.d) {
            return R.drawable.greydivider;
        }
        if (z10) {
            return R.drawable.greydivider_bottom;
        }
        if (this.d) {
            return R.drawable.greydivider_top;
        }
        return R.drawable.transparent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f23872a), 1073741824));
    }

    public void setSize(int i10) {
        this.f23872a = i10;
    }

    public z6(Context context, Object obj) {
        this(context, (t0) null);
    }

    public z6(Context context, t0 t0Var) {
        super(context);
        this.f23874c = true;
        this.d = true;
        this.f23872a = 12;
        int i10 = this.f23873b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public z6(Context context, int i10, int i11) {
        super(context);
        this.f23874c = true;
        this.d = true;
        this.f23873b = i10;
        this.f23872a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
