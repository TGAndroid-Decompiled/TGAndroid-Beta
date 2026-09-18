package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class z70 extends LinearLayout {
    public boolean f30749a;
    public final f80 f30750b;

    public z70(f80 f80Var, Context context) {
        super(context);
        this.f30750b = f80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        f80 f80Var = this.f30750b;
        ArrayList arrayList = f80Var.h;
        if (f80Var.f24053s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f30749a) {
                    TLRPC.Peer peer = f80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, f80Var.v);
                    }
                    this.f30749a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f30749a) {
                    if (f80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(f80Var.v);
                        arrayList.add(size, f80Var.v);
                    }
                    this.f30749a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
