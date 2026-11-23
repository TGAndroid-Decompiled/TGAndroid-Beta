package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.m10;
public final class h6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f44436a;
    public final ImageView f44437b;
    public final TextView f44438c;
    public final TextView d;

    public h6(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f44436a = i6Var;
        setPadding(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.f44437b = imageView;
        addView(imageView, c8.na.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44438c = textView;
        i5.c.x(textView, 1, 14.0f);
        TextView f10 = m10.f(linearLayout, textView, c8.na.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = f10;
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.na.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f44437b.setImageResource(i7);
        this.f44438c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f44436a;
        this.f44437b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), PorterDuff.Mode.SRC_IN));
        this.f44438c.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29862z6, i6Var));
    }
}
