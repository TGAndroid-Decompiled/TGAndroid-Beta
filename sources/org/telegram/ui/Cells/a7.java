package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class a7 extends View {
    public int f21569a;
    public final int f21570b;
    public boolean f21571c;
    public boolean d;

    public a7(Context context) {
        this(context, (c1) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f21571c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f21569a), 1073741824));
    }

    public void setSize(int i10) {
        this.f21569a = i10;
    }

    public a7(Context context, Object obj) {
        this(context, (c1) null);
    }

    public a7(Context context, c1 c1Var) {
        super(context);
        this.f21571c = true;
        this.d = true;
        this.f21569a = 12;
        int i10 = this.f21570b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public a7(Context context, int i10, int i11) {
        super(context);
        this.f21571c = true;
        this.d = true;
        this.f21570b = i10;
        this.f21569a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
