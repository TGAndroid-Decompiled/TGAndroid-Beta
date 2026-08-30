package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class s70 extends LinearLayout {
    public boolean f28663a;
    public final y70 f28664b;

    public s70(y70 y70Var, Context context) {
        super(context);
        this.f28664b = y70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        y70 y70Var = this.f28664b;
        ArrayList arrayList = y70Var.h;
        if (y70Var.f30914s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y70Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f28663a) {
                    TLRPC.Peer peer = y70Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, y70Var.v);
                    }
                    this.f28663a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f28663a) {
                    if (y70Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(y70Var.v);
                        arrayList.add(size, y70Var.v);
                    }
                    this.f28663a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
