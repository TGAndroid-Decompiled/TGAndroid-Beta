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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
public final class d5 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f36458a;
    public final ImageView f36459b;
    public final TextView f36460c;
    public final TextView d;

    public d5(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f36458a = u6Var;
        setPadding(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        this.f36459b = imageView;
        addView(imageView, gb1.h(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, gb1.h(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f36460c = textView;
        ic.a.o(14.0f, 1, textView);
        TextView e = vh.e(linearLayout, textView, gb1.x(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = e;
        e.setTextSize(1, 14.0f);
        linearLayout.addView(e, gb1.x(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f36459b.setImageResource(i10);
        this.f36460c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f36458a;
        this.f36459b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), PorterDuff.Mode.SRC_IN));
        this.f36460c.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23765z6, u6Var));
    }
}
