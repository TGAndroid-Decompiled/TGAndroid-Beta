package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;

public final class w6 extends View {

    public int f25851a;

    public final int f25852b;

    public boolean f25853c;
    public boolean d;

    public w6(Context context) {
        this(context, (rl) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f25853c;
        if (z10 && this.d) {
            return R.drawable.greydivider;
        }
        if (z10) {
            return R.drawable.greydivider_bottom;
        }
        return this.d ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25851a), 1073741824));
    }

    public void setSize(int i10) {
        this.f25851a = i10;
    }

    public w6(Context context, Object obj) {
        this(context, (rl) null);
    }

    public w6(Context context, rl rlVar) {
        super(context);
        this.f25853c = true;
        this.d = true;
        this.f25851a = 12;
        int i10 = this.f25852b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public w6(Context context, int i10, int i11) {
        super(context);
        this.f25853c = true;
        this.d = true;
        this.f25852b = i10;
        this.f25851a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
