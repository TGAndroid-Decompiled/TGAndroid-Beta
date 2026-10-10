package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class t80 extends LinearLayout {
    public boolean f31046a;
    public final z80 f31047b;

    public t80(z80 z80Var, Context context) {
        super(context);
        this.f31047b = z80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        z80 z80Var = this.f31047b;
        ArrayList arrayList = z80Var.h;
        if (z80Var.f33527s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f31046a) {
                    TLRPC.Peer peer = z80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, z80Var.v);
                    }
                    this.f31046a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f31046a) {
                    if (z80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(z80Var.v);
                        arrayList.add(size, z80Var.v);
                    }
                    this.f31046a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
