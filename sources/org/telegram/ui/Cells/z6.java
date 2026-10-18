package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class z6 extends View {
    public int f23879a;
    public final int f23880b;
    public boolean f23881c;
    public boolean d;

    public z6(Context context) {
        this(context, (c1) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f23881c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f23879a), 1073741824));
    }

    public void setSize(int i10) {
        this.f23879a = i10;
    }

    public z6(Context context, Object obj) {
        this(context, (c1) null);
    }

    public z6(Context context, c1 c1Var) {
        super(context);
        this.f23881c = true;
        this.d = true;
        this.f23879a = 12;
        int i10 = this.f23880b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public z6(Context context, int i10, int i11) {
        super(context);
        this.f23881c = true;
        this.d = true;
        this.f23880b = i10;
        this.f23879a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
