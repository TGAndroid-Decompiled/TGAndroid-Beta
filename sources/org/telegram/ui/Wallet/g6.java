package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.o10;
public final class g6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f44308a;
    public final ImageView f44309b;
    public final TextView f44310c;
    public final TextView d;

    public g6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f44308a = h6Var;
        setPadding(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.f44309b = imageView;
        addView(imageView, c8.ma.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44310c = textView;
        i5.c.x(textView, 1, 14.0f);
        TextView f10 = o10.f(linearLayout, textView, c8.ma.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = f10;
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ma.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f44309b.setImageResource(i7);
        this.f44310c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f44308a;
        this.f44309b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), PorterDuff.Mode.SRC_IN));
        this.f44310c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29792z6, h6Var));
    }
}
