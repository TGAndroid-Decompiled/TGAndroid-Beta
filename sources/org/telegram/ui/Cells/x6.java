package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class x6 extends View {
    public int f25925a;
    public final int f25926b;
    public boolean f25927c;
    public boolean d;

    public x6(Context context) {
        this(context, (org.telegram.ui.b) null);
    }

    private int getBackgroundResId() {
        boolean z10 = this.f25927c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25925a), 1073741824));
    }

    public void setSize(int i10) {
        this.f25925a = i10;
    }

    public x6(Context context, Object obj) {
        this(context, (org.telegram.ui.b) null);
    }

    public x6(Context context, org.telegram.ui.b bVar) {
        super(context);
        this.f25927c = true;
        this.d = true;
        this.f25925a = 12;
        int i10 = this.f25926b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public x6(Context context, int i10, int i11) {
        super(context);
        this.f25927c = true;
        this.d = true;
        this.f25926b = i10;
        this.f25925a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
