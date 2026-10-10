package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y9;
public final class c9 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f34796a;
    public final y9 f34797b;
    public final TextView f34798c;
    public final TextView d;

    public c9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f34796a = e6Var;
        y9 y9Var = new y9(context);
        this.f34797b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
        addView(y9Var, w7.x5.a(28.0f, 18.0f, 0.0f, 0.0f, 0.0f, 28, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.a(-2.0f, 62.0f, 0.0f, 20.0f, 0.0f, -1, 23));
        TextView textView = new TextView(context);
        this.f34798c = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2), context);
        this.d = h;
        h.setTextSize(1, 14.0f);
        linearLayout.addView(h, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f34796a;
        this.f34798c.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
