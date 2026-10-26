package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class n80 extends LinearLayout {
    public boolean f30921a;
    public final t80 f30922b;

    public n80(t80 t80Var, Context context) {
        super(context);
        this.f30922b = t80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        t80 t80Var = this.f30922b;
        ArrayList arrayList = t80Var.f32910r;
        if (t80Var.f32912w == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t80Var.f32908f.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f30921a) {
                    TLRPC.Peer peer = t80Var.f32913x;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, t80Var.f32913x);
                    }
                    this.f30921a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f30921a) {
                    if (t80Var.f32913x != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(t80Var.f32913x);
                        arrayList.add(size, t80Var.f32913x);
                    }
                    this.f30921a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
