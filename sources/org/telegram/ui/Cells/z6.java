package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class z6 extends View {
    public int f22659a;
    public final int f22660b;
    public boolean f22661c;
    public boolean d;

    public z6(Context context) {
        this(context, (org.telegram.ui.b) null);
    }

    private int getBackgroundResId() {
        boolean z4 = this.f22661c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f22659a), 1073741824));
    }

    public void setSize(int i10) {
        this.f22659a = i10;
    }

    public z6(Context context, Object obj) {
        this(context, (org.telegram.ui.b) null);
    }

    public z6(Context context, org.telegram.ui.b bVar) {
        super(context);
        this.f22661c = true;
        this.d = true;
        this.f22659a = 12;
        int i10 = this.f22660b;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }

    public z6(Context context, int i10, int i11) {
        super(context);
        this.f22661c = true;
        this.d = true;
        this.f22660b = i10;
        this.f22659a = 12;
        if (i10 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i10);
        }
    }
}
