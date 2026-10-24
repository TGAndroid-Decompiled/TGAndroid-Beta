package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.tl;
public final class f5 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f34501a;
    public final ImageView f34502b;
    public final TextView f34503c;
    public final TextView d;

    public f5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f34501a = g6Var;
        setPadding(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        this.f34502b = imageView;
        addView(imageView, w7.z5.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f34503c = textView;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        TextView f7 = tl.f(linearLayout, textView, w7.z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = f7;
        f7.setTextSize(1, 14.0f);
        linearLayout.addView(f7, w7.z5.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f34502b.setImageResource(i10);
        this.f34503c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f34501a;
        this.f34502b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), PorterDuff.Mode.SRC_IN));
        this.f34503c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21589z6, g6Var));
    }
}
