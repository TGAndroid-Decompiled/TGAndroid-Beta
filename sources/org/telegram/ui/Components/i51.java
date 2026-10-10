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
public final class i51 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f27237a;
    public final LinearLayout f27238b;
    public final TextView f27239c;
    public final TextView d;
    public final TextView f27240e;
    public final ImageView f27241f;
    public final LinearLayout h;
    public final dq f27242n;
    public final LinearLayout f27243r;
    public final ImageView f27244s;
    public final TextView v;

    public i51(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f27237a = e6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 0);
        addView(e7, w7.x5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f27239c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        e7.addView(textView, w7.x5.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f27238b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        w7.z5.a(linearLayout);
        e7.addView(linearLayout, w7.x5.a(-2.0f, -6.0f, 0.0f, 0.0f, 0.0f, -2, 19));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f27241f = imageView;
        imageView.setImageResource(R.drawable.arrows_select);
        linearLayout.addView(imageView, w7.x5.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(AndroidUtilities.dp(1.0f));
        TextView textView3 = new TextView(context);
        this.f27240e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        e7.addView(textView3, w7.x5.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        dq dqVar = new dq(context, 20, e6Var);
        this.f27242n = dqVar;
        dqVar.b(org.telegram.ui.ActionBar.i6.f20874h7, org.telegram.ui.ActionBar.i6.f20911j7, org.telegram.ui.ActionBar.i6.f20930k7);
        dqVar.setDrawUnchecked(true);
        dqVar.a(false, false);
        dqVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(dqVar, w7.x5.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.f20909j5, e6Var, textView4, 1, 14.0f);
        textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
        linearLayout2.addView(textView4, w7.x5.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, w7.x5.a(-2.0f, 0.0f, -3.0f, -6.0f, -3.0f, -2, 21));
        w7.z5.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f27243r = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, w7.x5.a(-2.0f, 0.0f, 0.0f, -6.0f, 0.0f, -2, 53));
        w7.z5.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f27244s = imageView2;
        imageView2.setImageResource(R.drawable.mini_replace2);
        linearLayout3.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.v = textView5;
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView5);
        textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
        linearLayout3.addView(textView5, w7.x5.q(-2, -2, 16));
        e();
    }

    @Override
    public final void e() {
        org.telegram.ui.Cells.z zVar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f27237a;
        this.f27239c.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.i6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        this.f27240e.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.f27241f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f27238b;
        if (linearLayout.isClickable()) {
            zVar = org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.x0(null, i11, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        } else {
            zVar = null;
        }
        linearLayout.setBackground(zVar);
        if (linearLayout.isClickable()) {
            w7.z5.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        this.f27244s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        this.f27243r.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.w0(i12, e6Var)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
