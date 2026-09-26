package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class b80 extends LinearLayout {
    public boolean f22923a;
    public final h80 f22924b;

    public b80(h80 h80Var, Context context) {
        super(context);
        this.f22924b = h80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        h80 h80Var = this.f22924b;
        ArrayList arrayList = h80Var.h;
        if (h80Var.f24667s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f22923a) {
                    TLRPC.Peer peer = h80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, h80Var.v);
                    }
                    this.f22923a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f22923a) {
                    if (h80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(h80Var.v);
                        arrayList.add(size, h80Var.v);
                    }
                    this.f22923a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
