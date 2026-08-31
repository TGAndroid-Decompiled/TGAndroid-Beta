package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class z6 extends View {
    public int f24493a;
    public final int f24494b;
    public boolean f24495c;
    public boolean d;

    public z6(Context context) {
        this(context, (org.telegram.ui.b) null);
    }

    private int getBackgroundResId() {
        boolean z4 = this.f24495c;
        if (z4 && this.d) {
            return R.drawable.greydivider;
        }
        if (z4) {
            return R.drawable.greydivider_bottom;
        }
        if (this.d) {
            return R.drawable.greydivider_top;
        }
        return R.drawable.transparent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24493a), 1073741824));
    }

    public void setSize(int i10) {
        this.f24493a = i10;
    }

    public z6(Context context, Object obj) {
        this(context, (org.telegram.ui.b) null);
    }

    public z6(Context context, org.telegram.ui.b bVar) {
        super(context);
        this.f24495c = true;
        this.d = true;
        this.f24493a = 12;
        int i10 = this.f24494b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public z6(Context context, int i10, int i11) {
        super(context);
        this.f24495c = true;
        this.d = true;
        this.f24494b = i10;
        this.f24493a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
