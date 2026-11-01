package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e70 extends LinearLayout {
    public boolean f25768a;
    public final k70 f25769b;

    public e70(k70 k70Var, Context context) {
        super(context);
        this.f25769b = k70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        k70 k70Var = this.f25769b;
        ArrayList arrayList = k70Var.f27748p1;
        if (k70Var.f27751s1 == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int L = org.telegram.messenger.i0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k70Var.f27745m1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f25768a) {
                    TLRPC.Peer peer = k70Var.f27752t1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, k70Var.f27752t1);
                    }
                    this.f25768a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f25768a) {
                    if (k70Var.f27752t1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(k70Var.f27752t1);
                        arrayList.add(size, k70Var.f27752t1);
                    }
                    this.f25768a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
