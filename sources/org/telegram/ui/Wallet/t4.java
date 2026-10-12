package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t4 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f35385a;
    public final ImageView f35386b;
    public final TextView f35387c;
    public final TextView d;

    public t4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f35385a = c6Var;
        setPadding(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        this.f35386b = imageView;
        addView(imageView, w7.w5.a(28.0f, 0.0f, 2.0f, 0.0f, 0.0f, 28, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.w5.a(-2.0f, 42.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        TextView textView = new TextView(context);
        this.f35387c = textView;
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.w5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = h;
        h.setTextSize(1, 14.0f);
        linearLayout.addView(h, w7.w5.t(-1, -2, 55, 0, 0, 0, 2));
        e();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f35386b.setImageResource(i10);
        this.f35387c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35385a;
        this.f35386b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        this.f35387c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20963z6, c6Var));
    }
}
