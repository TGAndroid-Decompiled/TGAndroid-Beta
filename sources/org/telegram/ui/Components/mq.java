package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class mq extends LinearLayout {
    public final pq f27182a;

    public mq(pq pqVar, Context context) {
        super(context);
        this.f27182a = pqVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        pq.n(this.f27182a);
    }
}
