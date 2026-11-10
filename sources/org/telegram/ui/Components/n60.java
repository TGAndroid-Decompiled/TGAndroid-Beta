package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n60 extends LinearLayout {
    public boolean f36249a;
    public final t60 f36250b;

    public n60(t60 t60Var, Context context) {
        super(context);
        this.f36250b = t60Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        t60 t60Var = this.f36250b;
        ArrayList arrayList = t60Var.f38221s1;
        if (t60Var.f38224v1 == 0) {
            int size2 = View.MeasureSpec.getSize(i7);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t60Var.f38218p1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f36249a) {
                    TLRPC.Peer peer = t60Var.f38225w1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, t60Var.f38225w1);
                    }
                    this.f36249a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f36249a) {
                    if (t60Var.f38225w1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(t60Var.f38225w1);
                        arrayList.add(size, t60Var.f38225w1);
                    }
                    this.f36249a = true;
                }
            }
        }
        super.onMeasure(i7, i10);
    }
}
