package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f35545a;
    public final ImageView f35546b;
    public final TextView f35547c;
    public final TextView d;

    public s4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f35545a = e6Var;
        setPadding(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        this.f35546b = imageView;
        addView(imageView, w7.x5.a(28.0f, 0.0f, 2.0f, 0.0f, 0.0f, 28, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.a(-2.0f, 42.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        TextView textView = new TextView(context);
        this.f35547c = textView;
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = h;
        h.setTextSize(1, 14.0f);
        linearLayout.addView(h, w7.x5.t(-1, -2, 55, 0, 0, 0, 2));
        e();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f35546b.setImageResource(i10);
        this.f35547c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35545a;
        this.f35546b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.SRC_IN));
        this.f35547c.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var));
    }
}
