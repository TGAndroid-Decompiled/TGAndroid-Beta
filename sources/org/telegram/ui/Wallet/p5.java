package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
public final class p5 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f43043a;
    public final ImageView f43044b;
    public final TextView f43045c;
    public final TextView d;

    public p5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f43043a = e6Var;
        setPadding(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.f43044b = imageView;
        addView(imageView, mf.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, mf.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f43045c = textView;
        k2.p1.t(textView, 1, 14.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = f10;
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, mf.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i3, CharSequence charSequence, CharSequence charSequence2) {
        this.f43044b.setImageResource(i3);
        this.f43045c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f43043a;
        this.f43044b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), PorterDuff.Mode.SRC_IN));
        this.f43045c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var));
    }
}
