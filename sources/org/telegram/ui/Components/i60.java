package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i60 extends LinearLayout {
    public boolean f34621a;
    public final o60 f34622b;

    public i60(o60 o60Var, Context context) {
        super(context);
        this.f34622b = o60Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size;
        o60 o60Var = this.f34622b;
        ArrayList arrayList = o60Var.f36750q1;
        if (o60Var.f36753t1 == 0) {
            int size2 = View.MeasureSpec.getSize(i3);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) o60Var.f36747n1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f34621a) {
                    TLRPC.Peer peer = o60Var.f36754u1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, o60Var.f36754u1);
                    }
                    this.f34621a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f34621a) {
                    if (o60Var.f36754u1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(o60Var.f36754u1);
                        arrayList.add(size, o60Var.f36754u1);
                    }
                    this.f34621a = true;
                }
            }
        }
        super.onMeasure(i3, i10);
    }
}
