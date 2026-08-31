package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class u70 extends LinearLayout {
    public boolean f31586a;
    public final a80 f31587b;

    public u70(a80 a80Var, Context context) {
        super(context);
        this.f31587b = a80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        a80 a80Var = this.f31587b;
        ArrayList arrayList = a80Var.h;
        if (a80Var.f25201s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f31586a) {
                    TLRPC.Peer peer = a80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, a80Var.v);
                    }
                    this.f31586a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f31586a) {
                    if (a80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(a80Var.v);
                        arrayList.add(size, a80Var.v);
                    }
                    this.f31586a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
