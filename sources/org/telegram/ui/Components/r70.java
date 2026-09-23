package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class r70 extends LinearLayout {
    public boolean f27575a;
    public final x70 f27576b;

    public r70(x70 x70Var, Context context) {
        super(context);
        this.f27576b = x70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        x70 x70Var = this.f27576b;
        ArrayList arrayList = x70Var.h;
        if (x70Var.f29938s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) x70Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f27575a) {
                    TLRPC.Peer peer = x70Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, x70Var.v);
                    }
                    this.f27575a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f27575a) {
                    if (x70Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(x70Var.v);
                        arrayList.add(size, x70Var.v);
                    }
                    this.f27575a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
