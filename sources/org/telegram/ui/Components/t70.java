package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class t70 extends LinearLayout {
    public boolean f28928a;
    public final z70 f28929b;

    public t70(z70 z70Var, Context context) {
        super(context);
        this.f28929b = z70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        z70 z70Var = this.f28929b;
        ArrayList arrayList = z70Var.h;
        if (z70Var.f31275s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z70Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f28928a) {
                    TLRPC.Peer peer = z70Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, z70Var.v);
                    }
                    this.f28928a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f28928a) {
                    if (z70Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(z70Var.v);
                        arrayList.add(size, z70Var.v);
                    }
                    this.f28928a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
