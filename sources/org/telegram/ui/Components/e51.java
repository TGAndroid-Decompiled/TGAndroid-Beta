package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e51 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f25964a;
    public final LinearLayout f25965b;
    public final TextView f25966c;
    public final TextView d;
    public final TextView e;
    public final ImageView f25967f;
    public final LinearLayout h;
    public final vp f25968n;
    public final LinearLayout f25969r;
    public final ImageView f25970s;
    public final TextView v;

    public e51(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f25964a = g6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
        LinearLayout e = org.telegram.messenger.tl.e(context, 0);
        addView(e, w7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f25966c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        e.addView(textView, w7.z5.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f25965b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        w7.b6.a(linearLayout);
        e.addView(linearLayout, w7.z5.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f25967f = imageView;
        imageView.setImageResource(R.drawable.arrows_select);
        linearLayout.addView(imageView, w7.z5.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(AndroidUtilities.dp(1.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        e.addView(textView3, w7.z5.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        vp vpVar = new vp(context, 20, g6Var);
        this.f25968n = vpVar;
        vpVar.b(org.telegram.ui.ActionBar.k6.f21257h7, org.telegram.ui.ActionBar.k6.f21292j7, org.telegram.ui.ActionBar.k6.f21312k7);
        vpVar.setDrawUnchecked(true);
        vpVar.a(false, false);
        vpVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(vpVar, w7.z5.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.messenger.v0.q(textView4, org.telegram.ui.ActionBar.k6.f21290j5, g6Var, 1, 14.0f);
        textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
        linearLayout2.addView(textView4, w7.z5.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, w7.z5.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        w7.b6.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f25969r = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        w7.b6.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f25970s = imageView2;
        imageView2.setImageResource(R.drawable.mini_replace2);
        linearLayout3.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.v = textView5;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView5);
        textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
        linearLayout3.addView(textView5, w7.z5.q(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.y yVar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f25964a;
        this.f25966c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.f25967f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f25965b;
        if (linearLayout.isClickable()) {
            yVar = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i11, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        } else {
            yVar = null;
        }
        linearLayout.setBackground(yVar);
        if (linearLayout.isClickable()) {
            w7.b6.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        this.f25970s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        this.f25969r.setBackground(org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i12, g6Var)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
    }
}
