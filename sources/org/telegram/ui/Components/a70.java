package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class a70 extends LinearLayout {
    public boolean f26713a;
    public final g70 f26714b;

    public a70(g70 g70Var, Context context) {
        super(context);
        this.f26714b = g70Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size;
        g70 g70Var = this.f26714b;
        ArrayList arrayList = g70Var.h;
        if (g70Var.f28672s == 0) {
            int size2 = View.MeasureSpec.getSize(i9);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g70Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f26713a) {
                    TLRPC.Peer peer = g70Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, g70Var.v);
                    }
                    this.f26713a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f26713a) {
                    if (g70Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(g70Var.v);
                        arrayList.add(size, g70Var.v);
                    }
                    this.f26713a = true;
                }
            }
        }
        super.onMeasure(i9, i10);
    }
}
