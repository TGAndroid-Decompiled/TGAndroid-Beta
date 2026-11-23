package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c70 extends LinearLayout {
    public boolean f34070a;
    public final i70 f34071b;

    public c70(i70 i70Var, Context context) {
        super(context);
        this.f34071b = i70Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        i70 i70Var = this.f34071b;
        ArrayList arrayList = i70Var.f36140t1;
        if (i70Var.f36143w1 == 0) {
            int size2 = View.MeasureSpec.getSize(i7);
            int L = org.telegram.messenger.g0.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i70Var.f36137q1.getLayoutParams();
            if (L > size2) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.f34070a) {
                    TLRPC.Peer peer = i70Var.f36144x1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, i70Var.f36144x1);
                    }
                    this.f34070a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.f34070a) {
                    if (i70Var.f36144x1 != null) {
                        if (arrayList.size() % 2 == 0) {
                            size = Math.max(0, (arrayList.size() / 2) - 1);
                        } else {
                            size = arrayList.size() / 2;
                        }
                        arrayList.remove(i70Var.f36144x1);
                        arrayList.add(size, i70Var.f36144x1);
                    }
                    this.f34070a = true;
                }
            }
        }
        super.onMeasure(i7, i10);
    }
}
