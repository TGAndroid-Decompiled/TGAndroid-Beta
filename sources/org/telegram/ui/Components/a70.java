package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a70 extends LinearLayout {
    public boolean f33256a;
    public final g70 f33257b;

    public a70(g70 g70Var, Context context) {
        super(context);
        this.f33257b = g70Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        g70 g70Var = this.f33257b;
        ArrayList arrayList = g70Var.f35368t1;
        if (g70Var.f35371w1 == 0) {
            int size2 = View.MeasureSpec.getSize(i7);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g70Var.f35365q1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f33256a) {
                    TLRPC.Peer peer = g70Var.f35372x1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, g70Var.f35372x1);
                    }
                    this.f33256a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f33256a) {
                    if (g70Var.f35372x1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(g70Var.f35372x1);
                        arrayList.add(size, g70Var.f35372x1);
                    }
                    this.f33256a = true;
                }
            }
        }
        super.onMeasure(i7, i10);
    }
}
