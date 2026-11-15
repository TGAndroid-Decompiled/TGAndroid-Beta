package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p60 extends LinearLayout {
    public boolean f38225a;
    public final v60 f38226b;

    public p60(v60 v60Var, Context context) {
        super(context);
        this.f38226b = v60Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        v60 v60Var = this.f38226b;
        ArrayList arrayList = v60Var.f40283t1;
        if (v60Var.f40286w1 == 0) {
            int size2 = View.MeasureSpec.getSize(i7);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) v60Var.f40280q1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f38225a) {
                    TLRPC.Peer peer = v60Var.f40287x1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, v60Var.f40287x1);
                    }
                    this.f38225a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f38225a) {
                    if (v60Var.f40287x1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(v60Var.f40287x1);
                        arrayList.add(size, v60Var.f40287x1);
                    }
                    this.f38225a = true;
                }
            }
        }
        super.onMeasure(i7, i10);
    }
}
