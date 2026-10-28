package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class m70 extends org.telegram.ui.Cells.ab {
    public final TextView f30426b0;
    public final TextView f30427c0;

    public m70(Context context) {
        super(context, 6, 0, true);
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        TextView textView = new TextView(context);
        this.f30426b0 = textView;
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.G6, null, 1, 16.0f);
        d.addView(textView, kb1.u(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f30427c0 = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23768z6, null);
        textView2.setTextSize(1, 13.0f);
        d.addView(textView2, kb1.x(-2, -2, 5, 0, 1, 0, 0));
        addView(d, kb1.h(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
