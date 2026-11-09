package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o60 extends LinearLayout {
    public boolean f36659a;
    public final u60 f36660b;

    public o60(u60 u60Var, Context context) {
        super(context);
        this.f36660b = u60Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        u60 u60Var = this.f36660b;
        ArrayList arrayList = u60Var.f38631p1;
        if (u60Var.f38634s1 == 0) {
            int size2 = View.MeasureSpec.getSize(i7);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) u60Var.f38629m1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f36659a) {
                    TLRPC.Peer peer = u60Var.f38635t1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, u60Var.f38635t1);
                    }
                    this.f36659a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f36659a) {
                    if (u60Var.f38635t1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(u60Var.f38635t1);
                        arrayList.add(size, u60Var.f38635t1);
                    }
                    this.f36659a = true;
                }
            }
        }
        super.onMeasure(i7, i10);
    }
}
