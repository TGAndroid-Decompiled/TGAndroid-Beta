package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class z6 extends View {
    public int f26032a;
    public final int f26033b;
    public boolean f26034c;
    public boolean d;

    public z6(Context context) {
        this(context, (j2) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f26034c;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f26032a), 1073741824));
    }

    public void setSize(int i9) {
        this.f26032a = i9;
    }

    public z6(Context context, Object obj) {
        this(context, (j2) null);
    }

    public z6(Context context, j2 j2Var) {
        super(context);
        this.f26034c = true;
        this.d = true;
        this.f26032a = 12;
        int i9 = this.f26033b;
        if (i9 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i9);
        }
    }

    public z6(Context context, int i9, int i10) {
        super(context);
        this.f26034c = true;
        this.d = true;
        this.f26033b = i9;
        this.f26032a = 12;
        if (i9 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i9);
        }
    }
}
