package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class l80 extends LinearLayout {
    public boolean f28115a;
    public final r80 f28116b;

    public l80(r80 r80Var, Context context) {
        super(context);
        this.f28116b = r80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        r80 r80Var = this.f28116b;
        ArrayList arrayList = r80Var.h;
        if (r80Var.f29877s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) r80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f28115a) {
                    TLRPC.Peer peer = r80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, r80Var.v);
                    }
                    this.f28115a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f28115a) {
                    if (r80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(r80Var.v);
                        arrayList.add(size, r80Var.v);
                    }
                    this.f28115a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
