package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class w80 extends LinearLayout {
    public boolean f32358a;
    public final c90 f32359b;

    public w80(c90 c90Var, Context context) {
        super(context);
        this.f32359b = c90Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        c90 c90Var = this.f32359b;
        ArrayList arrayList = c90Var.h;
        if (c90Var.f24870s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c90Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f32358a) {
                    TLRPC.Peer peer = c90Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, c90Var.v);
                    }
                    this.f32358a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f32358a) {
                    if (c90Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(c90Var.v);
                        arrayList.add(size, c90Var.v);
                    }
                    this.f32358a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
