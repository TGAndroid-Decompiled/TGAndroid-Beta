package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class mi extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f36094a;
    public final TextView f36095b;
    public final TextView f36096c;

    public mi(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f36094a = g6Var;
        setPadding(0, org.telegram.messenger.g0.L(42.0f), 0, org.telegram.messenger.g0.L(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.r(-1, -2, 17));
        l9 l9Var = new l9(context);
        l9Var.setImageDrawable(new ah0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        linearLayout.addView(l9Var, c8.ha.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f36095b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f36096c = f10;
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f36094a;
        this.f36095b.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.f36096c.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, g6Var));
    }
}
