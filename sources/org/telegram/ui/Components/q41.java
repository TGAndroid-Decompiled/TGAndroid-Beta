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
public final class q41 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f27575a;
    public final LinearLayout f27576b;
    public final TextView f27577c;
    public final TextView d;
    public final TextView e;
    public final ImageView f27578f;
    public final LinearLayout h;
    public final pp f27579n;
    public final LinearLayout f27580r;
    public final ImageView f27581s;
    public final TextView v;

    public q41(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f27575a = e6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
        LinearLayout f7 = org.telegram.messenger.qk.f(context, 0);
        addView(f7, w7.y5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f27577c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        f7.addView(textView, w7.y5.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f27576b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        w7.a6.a(linearLayout);
        f7.addView(linearLayout, w7.y5.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, w7.y5.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f27578f = imageView;
        imageView.setImageResource(R.drawable.arrows_select);
        linearLayout.addView(imageView, w7.y5.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(AndroidUtilities.dp(1.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        f7.addView(textView3, w7.y5.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        pp ppVar = new pp(context, 20, e6Var);
        this.f27579n = ppVar;
        ppVar.b(org.telegram.ui.ActionBar.i6.f19130h7, org.telegram.ui.ActionBar.i6.f19166j7, org.telegram.ui.ActionBar.i6.f19186k7);
        ppVar.setDrawUnchecked(true);
        ppVar.a(false, false);
        ppVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(ppVar, w7.y5.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.Cells.c1.q(org.telegram.ui.ActionBar.i6.f19164j5, e6Var, textView4, 1, 14.0f);
        textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
        linearLayout2.addView(textView4, w7.y5.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, w7.y5.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        w7.a6.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f27580r = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, w7.y5.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        w7.a6.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f27581s = imageView2;
        imageView2.setImageResource(R.drawable.mini_replace2);
        linearLayout3.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.v = textView5;
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView5);
        textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
        linearLayout3.addView(textView5, w7.y5.q(-2, -2, 16));
        e();
    }

    @Override
    public final void e() {
        org.telegram.ui.Cells.z zVar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f27575a;
        this.f27577c.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.i6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        this.f27578f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f27576b;
        if (linearLayout.isClickable()) {
            zVar = org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.w0(null, i11, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        } else {
            zVar = null;
        }
        linearLayout.setBackground(zVar);
        if (linearLayout.isClickable()) {
            w7.a6.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, e6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        this.f27581s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, e6Var), PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
        this.f27580r.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i12, e6Var)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
