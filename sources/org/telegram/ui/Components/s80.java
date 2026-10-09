package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class s80 extends LinearLayout {
    public boolean f30715a;
    public final y80 f30716b;

    public s80(y80 y80Var, Context context) {
        super(context);
        this.f30716b = y80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        y80 y80Var = this.f30716b;
        ArrayList arrayList = y80Var.h;
        if (y80Var.f33146s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f30715a) {
                    TLRPC.Peer peer = y80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, y80Var.v);
                    }
                    this.f30715a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f30715a) {
                    if (y80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(y80Var.v);
                        arrayList.add(size, y80Var.v);
                    }
                    this.f30715a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
