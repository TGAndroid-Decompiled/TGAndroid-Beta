package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z60 extends LinearLayout {
    public boolean f42722a;
    public final f70 f42723b;

    public z60(f70 f70Var, Context context) {
        super(context);
        this.f42723b = f70Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        f70 f70Var = this.f42723b;
        ArrayList arrayList = f70Var.f35033t1;
        if (f70Var.f35036w1 == 0) {
            int size2 = View.MeasureSpec.getSize(i7);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f70Var.f35030q1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f42722a) {
                    TLRPC.Peer peer = f70Var.f35037x1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, f70Var.f35037x1);
                    }
                    this.f42722a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f42722a) {
                    if (f70Var.f35037x1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(f70Var.f35037x1);
                        arrayList.add(size, f70Var.f35037x1);
                    }
                    this.f42722a = true;
                }
            }
        }
        super.onMeasure(i7, i10);
    }
}
