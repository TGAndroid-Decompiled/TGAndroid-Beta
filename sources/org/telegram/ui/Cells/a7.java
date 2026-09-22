package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class a7 extends View {
    public int f19787a;
    public final int f19788b;
    public boolean f19789c;
    public boolean d;

    public a7(Context context) {
        this(context, (q3) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f19789c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f19787a), 1073741824));
    }

    public void setSize(int i10) {
        this.f19787a = i10;
    }

    public a7(Context context, Object obj) {
        this(context, (q3) null);
    }

    public a7(Context context, q3 q3Var) {
        super(context);
        this.f19789c = true;
        this.d = true;
        this.f19787a = 12;
        int i10 = this.f19788b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public a7(Context context, int i10, int i11) {
        super(context);
        this.f19789c = true;
        this.d = true;
        this.f19788b = i10;
        this.f19787a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
