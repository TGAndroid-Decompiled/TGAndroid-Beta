package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class d80 extends LinearLayout {
    public boolean f23591a;
    public final j80 f23592b;

    public d80(j80 j80Var, Context context) {
        super(context);
        this.f23592b = j80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        j80 j80Var = this.f23592b;
        ArrayList arrayList = j80Var.h;
        if (j80Var.f25369s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) j80Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f23591a) {
                    TLRPC.Peer peer = j80Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, j80Var.v);
                    }
                    this.f23591a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f23591a) {
                    if (j80Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(j80Var.v);
                        arrayList.add(size, j80Var.v);
                    }
                    this.f23591a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
