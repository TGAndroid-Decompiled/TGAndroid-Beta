package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class b7 extends View {
    public int f20047a;
    public final int f20048b;
    public boolean f20049c;
    public boolean d;

    public b7(Context context) {
        this(context, (c1) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f20049c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f20047a), 1073741824));
    }

    public void setSize(int i10) {
        this.f20047a = i10;
    }

    public b7(Context context, Object obj) {
        this(context, (c1) null);
    }

    public b7(Context context, c1 c1Var) {
        super(context);
        this.f20049c = true;
        this.d = true;
        this.f20047a = 12;
        int i10 = this.f20048b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public b7(Context context, int i10, int i11) {
        super(context);
        this.f20049c = true;
        this.d = true;
        this.f20048b = i10;
        this.f20047a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
