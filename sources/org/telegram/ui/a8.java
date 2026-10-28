package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class a8 extends FrameLayout {
    public final int f37707a;
    public int f37708b;
    public final NotificationCenter.NotificationCenterDelegate f37709c;

    public a8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f37707a = i10;
        this.f37709c = notificationCenterDelegate;
        this.f37708b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37707a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f37708b != measuredWidth) {
                    this.f37708b = measuredWidth;
                    ((n8) this.f37709c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f37708b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    iq iqVar = (iq) this.f37709c;
                    iqVar.f40228b.y0(iqVar.V - 1);
                }
                this.f37708b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f37708b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.k30 k30Var = (org.telegram.ui.Components.k30) this.f37709c;
                    k30Var.f29847w = false;
                    k30Var.a();
                }
                this.f37708b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f37707a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f37708b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public a8(n8 n8Var, Context context) {
        super(context);
        this.f37707a = 0;
        this.f37709c = n8Var;
    }
}
