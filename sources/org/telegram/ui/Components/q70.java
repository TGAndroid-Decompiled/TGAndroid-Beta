package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q70 extends LinearLayout {
    public boolean f29615a;
    public final w70 f29616b;

    public q70(w70 w70Var, Context context) {
        super(context);
        this.f29616b = w70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        w70 w70Var = this.f29616b;
        ArrayList arrayList = w70Var.h;
        if (w70Var.f32191s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) w70Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f29615a) {
                    TLRPC.Peer peer = w70Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, w70Var.v);
                    }
                    this.f29615a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f29615a) {
                    if (w70Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(w70Var.v);
                        arrayList.add(size, w70Var.v);
                    }
                    this.f29615a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
