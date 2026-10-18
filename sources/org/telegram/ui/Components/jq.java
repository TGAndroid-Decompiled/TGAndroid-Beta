package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
public final class jq extends LinearLayout {
    public final mq f27570a;

    public jq(mq mqVar, Context context) {
        super(context);
        this.f27570a = mqVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        mq.n(this.f27570a);
    }
}
