package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class f7 extends View {
    public int f24073a;
    public final int f24074b;
    public boolean f24075c;
    public boolean d;

    public f7(Context context) {
        this(context, (org.telegram.ui.d3) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f24075c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24073a), 1073741824));
    }

    public void setSize(int i10) {
        this.f24073a = i10;
    }

    public f7(Context context, Object obj) {
        this(context, (org.telegram.ui.d3) null);
    }

    public f7(Context context, org.telegram.ui.d3 d3Var) {
        super(context);
        this.f24075c = true;
        this.d = true;
        this.f24073a = 12;
        int i10 = this.f24074b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public f7(Context context, int i10, int i11) {
        super(context);
        this.f24075c = true;
        this.d = true;
        this.f24074b = i10;
        this.f24073a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
