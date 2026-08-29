package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class n70 extends LinearLayout {
    public boolean f30920a;
    public final t70 f30921b;

    public n70(t70 t70Var, Context context) {
        super(context);
        this.f30921b = t70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        t70 t70Var = this.f30921b;
        ArrayList arrayList = t70Var.h;
        if (t70Var.f32892s == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t70Var.d.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f30920a) {
                    TLRPC.Peer peer = t70Var.v;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, t70Var.v);
                    }
                    this.f30920a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f30920a) {
                    if (t70Var.v != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(t70Var.v);
                        arrayList.add(size, t70Var.v);
                    }
                    this.f30920a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
