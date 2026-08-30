package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b41 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f23558a;
    public final LinearLayout f23559b;
    public final TextView f23560c;
    public final TextView d;
    public final TextView e;
    public final ImageView f23561f;
    public final LinearLayout h;
    public final lp f23562n;
    public final LinearLayout f23563r;
    public final ImageView f23564s;
    public final TextView v;

    public b41(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23558a = f6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        addView(f10, k7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f23560c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        f10.addView(textView, k7.b6.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f23559b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        k7.d6.a(linearLayout);
        f10.addView(linearLayout, k7.b6.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, k7.b6.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f23561f = imageView;
        imageView.setImageResource(R.drawable.arrows_select);
        linearLayout.addView(imageView, k7.b6.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(AndroidUtilities.dp(1.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        f10.addView(textView3, k7.b6.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        lp lpVar = new lp(context, 20, f6Var);
        this.f23562n = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.j6.f19979h7, org.telegram.ui.ActionBar.j6.f20014j7, org.telegram.ui.ActionBar.j6.f20032k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(false, false);
        lpVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(lpVar, k7.b6.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.f20012j5, f6Var, textView4, 1, 14.0f);
        textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
        linearLayout2.addView(textView4, k7.b6.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, k7.b6.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        k7.d6.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f23563r = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, k7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        k7.d6.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f23564s = imageView2;
        imageView2.setImageResource(R.drawable.mini_replace2);
        linearLayout3.addView(imageView2, k7.b6.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.v = textView5;
        org.telegram.ui.yh.p(14.0f, 1, textView5);
        textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
        linearLayout3.addView(textView5, k7.b6.q(-2, -2, 16));
        e();
    }

    @Override
    public final void e() {
        org.telegram.ui.Cells.z zVar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23558a;
        this.f23560c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f23561f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f23559b;
        if (linearLayout.isClickable()) {
            zVar = org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        } else {
            zVar = null;
        }
        linearLayout.setBackground(zVar);
        if (linearLayout.isClickable()) {
            k7.d6.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        this.f23564s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        this.f23563r.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
