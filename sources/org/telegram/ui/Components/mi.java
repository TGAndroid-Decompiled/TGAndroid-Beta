package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class mi extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f36155a;
    public final TextView f36156b;
    public final TextView f36157c;

    public mi(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f36155a = e6Var;
        setPadding(0, org.telegram.messenger.g0.L(42.0f), 0, org.telegram.messenger.g0.L(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.r(-1, -2, 17));
        k9 k9Var = new k9(context);
        k9Var.setImageDrawable(new ch0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        linearLayout.addView(k9Var, b8.mf.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f36156b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.f36157c = f10;
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        linearLayout.addView(f10, b8.mf.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f36155a;
        this.f36156b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.f36157c.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var));
    }
}
