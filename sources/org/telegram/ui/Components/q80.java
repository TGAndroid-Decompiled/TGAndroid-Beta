package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q80 extends LinearLayout {
    public boolean f28548a;
    public final w80 f28549b;

    public q80(w80 w80Var, Context context) {
        super(context);
        this.f28549b = w80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        w80 w80Var = this.f28549b;
        ArrayList arrayList = w80Var.h;
        if (w80Var.f30821s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) w80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f28548a) {
                    TLRPC.Peer peer = w80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, w80Var.v);
                    }
                    this.f28548a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f28548a) {
                    if (w80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(w80Var.v);
                        arrayList.add(size, w80Var.v);
                    }
                    this.f28548a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
