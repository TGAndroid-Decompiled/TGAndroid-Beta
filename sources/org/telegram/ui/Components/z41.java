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
public final class z41 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f33386a;
    public final LinearLayout f33387b;
    public final TextView f33388c;
    public final TextView d;
    public final TextView f33389e;
    public final ImageView f33390f;
    public final LinearLayout h;
    public final qp f33391n;
    public final LinearLayout f33392r;
    public final ImageView f33393s;
    public final TextView v;

    public z41(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f33386a = d6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 0);
        addView(e7, w7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f33388c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        e7.addView(textView, w7.z5.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33387b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        w7.b6.a(linearLayout);
        e7.addView(linearLayout, w7.z5.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f33390f = imageView;
        imageView.setImageResource(R.drawable.arrows_select);
        linearLayout.addView(imageView, w7.z5.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(AndroidUtilities.dp(1.0f));
        TextView textView3 = new TextView(context);
        this.f33389e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        e7.addView(textView3, w7.z5.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        qp qpVar = new qp(context, 20, d6Var);
        this.f33391n = qpVar;
        qpVar.b(org.telegram.ui.ActionBar.i6.f20896h7, org.telegram.ui.ActionBar.i6.f20932j7, org.telegram.ui.ActionBar.i6.f20952k7);
        qpVar.setDrawUnchecked(true);
        qpVar.a(false, false);
        qpVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(qpVar, w7.z5.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.Cells.c1.p(org.telegram.ui.ActionBar.i6.f20930j5, d6Var, textView4, 1, 14.0f);
        textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
        linearLayout2.addView(textView4, w7.z5.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, w7.z5.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        w7.b6.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f33392r = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        w7.b6.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f33393s = imageView2;
        imageView2.setImageResource(R.drawable.mini_replace2);
        linearLayout3.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.v = textView5;
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView5);
        textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
        linearLayout3.addView(textView5, w7.z5.q(-2, -2, 16));
        e();
    }

    @Override
    public final void e() {
        org.telegram.ui.Cells.z zVar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f33386a;
        this.f33388c.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.i6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        this.f33389e.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.f33390f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f33387b;
        if (linearLayout.isClickable()) {
            zVar = org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.w0(null, i11, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        } else {
            zVar = null;
        }
        linearLayout.setBackground(zVar);
        if (linearLayout.isClickable()) {
            w7.b6.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20913i6, d6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        this.f33393s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
        this.f33392r.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i12, d6Var)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
