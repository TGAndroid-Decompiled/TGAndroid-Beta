package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class m80 extends LinearLayout {
    public boolean f28600a;
    public final s80 f28601b;

    public m80(s80 s80Var, Context context) {
        super(context);
        this.f28601b = s80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        s80 s80Var = this.f28601b;
        ArrayList arrayList = s80Var.f30416r;
        if (s80Var.f30418w == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) s80Var.f30414f.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f28600a) {
                    TLRPC.Peer peer = s80Var.f30419x;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, s80Var.f30419x);
                    }
                    this.f28600a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f28600a) {
                    if (s80Var.f30419x != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(s80Var.f30419x);
                        arrayList.add(size, s80Var.f30419x);
                    }
                    this.f28600a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
