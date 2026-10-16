package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class p80 extends LinearLayout {
    public boolean f27924a;
    public final v80 f27925b;

    public p80(v80 v80Var, Context context) {
        super(context);
        this.f27925b = v80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        v80 v80Var = this.f27925b;
        ArrayList arrayList = v80Var.h;
        if (v80Var.f29601s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) v80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f27924a) {
                    TLRPC.Peer peer = v80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, v80Var.v);
                    }
                    this.f27924a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f27924a) {
                    if (v80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(v80Var.v);
                        arrayList.add(size, v80Var.v);
                    }
                    this.f27924a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
