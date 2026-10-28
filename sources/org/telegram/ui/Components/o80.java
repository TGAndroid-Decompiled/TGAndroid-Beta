package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class o80 extends LinearLayout {
    public boolean f31231a;
    public final u80 f31232b;

    public o80(u80 u80Var, Context context) {
        super(context);
        this.f31232b = u80Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        u80 u80Var = this.f31232b;
        ArrayList arrayList = u80Var.f33286r;
        if (u80Var.f33288w == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int dp = AndroidUtilities.dp(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) u80Var.f33284f.getLayoutParams();
            if (dp > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f31231a) {
                    TLRPC.Peer peer = u80Var.f33289x;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, u80Var.f33289x);
                    }
                    this.f31231a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f31231a) {
                    if (u80Var.f33289x != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(u80Var.f33289x);
                        arrayList.add(size, u80Var.f33289x);
                    }
                    this.f31231a = true;
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}
