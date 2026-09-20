package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class y70 extends LinearLayout {
    public boolean f30469a;
    public final e80 f30470b;

    public y70(e80 e80Var, Context context) {
        super(context);
        this.f30470b = e80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        e80 e80Var = this.f30470b;
        ArrayList arrayList = e80Var.h;
        if (e80Var.f23773s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) e80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f30469a) {
                    TLRPC.Peer peer = e80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, e80Var.v);
                    }
                    this.f30469a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f30469a) {
                    if (e80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(e80Var.v);
                        arrayList.add(size, e80Var.v);
                    }
                    this.f30469a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
