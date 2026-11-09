package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class p5 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f42983a;
    public final ImageView f42984b;
    public final TextView f42985c;
    public final TextView d;

    public p5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f42983a = g6Var;
        setPadding(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.f42984b = imageView;
        addView(imageView, c8.ha.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42985c = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = f10;
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f42984b.setImageResource(i7);
        this.f42985c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f42983a;
        this.f42984b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i7, g6Var), PorterDuff.Mode.SRC_IN));
        this.f42985c.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28275z6, g6Var));
    }
}
