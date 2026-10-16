package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s4 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f33426a;
    public final ImageView f33427b;
    public final TextView f33428c;
    public final TextView d;

    public s4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f33426a = c6Var;
        setPadding(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        this.f33427b = imageView;
        addView(imageView, w7.z5.a(28.0f, 0.0f, 2.0f, 0.0f, 0.0f, 28, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.a(-2.0f, 42.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        TextView textView = new TextView(context);
        this.f33428c = textView;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = i10;
        i10.setTextSize(1, 14.0f);
        linearLayout.addView(i10, w7.z5.t(-1, -2, 55, 0, 0, 0, 2));
        d();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f33427b.setImageResource(i10);
        this.f33428c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f33426a;
        this.f33427b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        this.f33428c.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
    }
}
