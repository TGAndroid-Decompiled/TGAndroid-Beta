package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class a8 extends FrameLayout {
    public final int f37658a;
    public int f37659b;
    public final NotificationCenter.NotificationCenterDelegate f37660c;

    public a8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f37658a = i10;
        this.f37660c = notificationCenterDelegate;
        this.f37659b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37658a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f37659b != measuredWidth) {
                    this.f37659b = measuredWidth;
                    ((n8) this.f37660c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f37659b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    gq gqVar = (gq) this.f37660c;
                    gqVar.f39735b.y0(gqVar.V - 1);
                }
                this.f37659b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f37659b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.k30 k30Var = (org.telegram.ui.Components.k30) this.f37660c;
                    k30Var.f29796w = false;
                    k30Var.a();
                }
                this.f37659b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f37658a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f37659b = -1;
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
        this.f37658a = 0;
        this.f37660c = n8Var;
    }
}
