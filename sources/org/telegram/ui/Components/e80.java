package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e80 extends LinearLayout {
    public boolean f26043a;
    public final k80 f26044b;

    public e80(k80 k80Var, Context context) {
        super(context);
        this.f26044b = k80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        k80 k80Var = this.f26044b;
        ArrayList arrayList = k80Var.h;
        if (k80Var.f28105s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f26043a) {
                    TLRPC.Peer peer = k80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, k80Var.v);
                    }
                    this.f26043a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f26043a) {
                    if (k80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(k80Var.v);
                        arrayList.add(size, k80Var.v);
                    }
                    this.f26043a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
