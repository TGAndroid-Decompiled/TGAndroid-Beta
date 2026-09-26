package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class c80 extends LinearLayout {
    public boolean f23269a;
    public final i80 f23270b;

    public c80(i80 i80Var, Context context) {
        super(context);
        this.f23270b = i80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        i80 i80Var = this.f23270b;
        ArrayList arrayList = i80Var.h;
        if (i80Var.f25002s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f23269a) {
                    TLRPC.Peer peer = i80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, i80Var.v);
                    }
                    this.f23269a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f23269a) {
                    if (i80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(i80Var.v);
                        arrayList.add(size, i80Var.v);
                    }
                    this.f23269a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
