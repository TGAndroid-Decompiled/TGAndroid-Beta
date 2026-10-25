package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class n80 extends LinearLayout {
    public boolean f30919a;
    public final t80 f30920b;

    public n80(t80 t80Var, Context context) {
        super(context);
        this.f30920b = t80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        t80 t80Var = this.f30920b;
        ArrayList arrayList = t80Var.f32907r;
        if (t80Var.f32909w == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t80Var.f32905f.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f30919a) {
                    TLRPC.Peer peer = t80Var.f32910x;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, t80Var.f32910x);
                    }
                    this.f30919a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f30919a) {
                    if (t80Var.f32910x != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(t80Var.f32910x);
                        arrayList.add(size, t80Var.f32910x);
                    }
                    this.f30919a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
