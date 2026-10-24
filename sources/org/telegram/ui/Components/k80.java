package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class k80 extends LinearLayout {
    public boolean f27953a;
    public final q80 f27954b;

    public k80(q80 q80Var, Context context) {
        super(context);
        this.f27954b = q80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        q80 q80Var = this.f27954b;
        ArrayList arrayList = q80Var.f29826r;
        if (q80Var.f29828w == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) q80Var.f29824f.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f27953a) {
                    TLRPC.Peer peer = q80Var.f29829x;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, q80Var.f29829x);
                    }
                    this.f27953a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f27953a) {
                    if (q80Var.f29829x != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(q80Var.f29829x);
                        arrayList.add(size, q80Var.f29829x);
                    }
                    this.f27953a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
