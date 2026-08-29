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
public final class q31 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f31844a;
    public final LinearLayout f31845b;
    public final TextView f31846c;
    public final TextView d;
    public final TextView f31847e;
    public final ImageView f31848f;
    public final LinearLayout h;
    public final hp f31849n;
    public final LinearLayout f31850r;
    public final ImageView f31851s;
    public final TextView v;

    public q31(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31844a = c6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        addView(g10, i7.f6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f31846c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        g10.addView(textView, i7.f6.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31845b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        i7.h6.a(linearLayout);
        g10.addView(linearLayout, i7.f6.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f31848f = imageView;
        imageView.setImageResource(R.drawable.arrows_select);
        linearLayout.addView(imageView, i7.f6.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(AndroidUtilities.dp(1.0f));
        TextView textView3 = new TextView(context);
        this.f31847e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        g10.addView(textView3, i7.f6.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        hp hpVar = new hp(context, 20, c6Var);
        this.f31849n = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.f23135h7, org.telegram.ui.ActionBar.g6.f23171j7, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(false, false);
        hpVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(hpVar, i7.f6.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView4, 1, 14.0f);
        textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
        linearLayout2.addView(textView4, i7.f6.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, i7.f6.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        i7.h6.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f31850r = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, i7.f6.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        i7.h6.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f31851s = imageView2;
        imageView2.setImageResource(R.drawable.mini_replace2);
        linearLayout3.addView(imageView2, i7.f6.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.v = textView5;
        org.telegram.ui.th.n(14.0f, 1, textView5);
        textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
        linearLayout3.addView(textView5, i7.f6.q(-2, -2, 16));
        e();
    }

    @Override
    public final void e() {
        org.telegram.ui.Cells.z zVar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f31844a;
        this.f31846c.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.f31847e.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f31848f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f31845b;
        if (linearLayout.isClickable()) {
            zVar = org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.w0(null, i11, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        } else {
            zVar = null;
        }
        linearLayout.setBackground(zVar);
        if (linearLayout.isClickable()) {
            i7.h6.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        this.f31851s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        this.f31850r.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
