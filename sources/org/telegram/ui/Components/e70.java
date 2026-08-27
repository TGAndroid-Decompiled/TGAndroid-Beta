package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class e70 extends LinearLayout {

    public boolean f27963a;

    public final k70 f27964b;

    public e70(k70 k70Var, Context context) {
        super(context);
        this.f27964b = k70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        k70 k70Var = this.f27964b;
        ArrayList arrayList = k70Var.h;
        if (k70Var.f30029s == 0) {
            int size = View.MeasureSpec.getSize(i10);
            int iDp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k70Var.d.getLayoutParams();
            if (iDp > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f27963a) {
                    TLRPC.Peer peer = k70Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, k70Var.v);
                    }
                    this.f27963a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f27963a) {
                    if (k70Var.v != null) {
                        int iMax = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(k70Var.v);
                        arrayList.add(iMax, k70Var.v);
                    }
                    this.f27963a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
