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
public final class d51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f23985a;
    public final LinearLayout f23986b;
    public final TextView f23987c;
    public final TextView d;
    public final TextView e;
    public final ImageView f23988f;
    public final LinearLayout h;
    public final aq f23989n;
    public final LinearLayout f23990r;
    public final ImageView f23991s;
    public final TextView v;

    public d51(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f23985a = c6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
        LinearLayout e = org.telegram.messenger.sk.e(context, 0);
        addView(e, w7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f23987c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        e.addView(textView, w7.z5.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f23986b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        w7.b6.a(linearLayout);
        e.addView(linearLayout, w7.z5.a(-2.0f, -6.0f, 0.0f, 0.0f, 0.0f, -2, 19));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f23988f = imageView;
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
        aq aqVar = new aq(context, 20, c6Var);
        this.f23989n = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.g6.f19674h7, org.telegram.ui.ActionBar.g6.f19709j7, org.telegram.ui.ActionBar.g6.f19729k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(false, false);
        aqVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(aqVar, w7.z5.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.g6.f19707j5, c6Var, textView4, 1, 14.0f);
        textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
        linearLayout2.addView(textView4, w7.z5.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, w7.z5.a(-2.0f, 0.0f, -3.0f, -6.0f, -3.0f, -2, 21));
        w7.b6.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f23990r = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, w7.z5.a(-2.0f, 0.0f, 0.0f, -6.0f, 0.0f, -2, 53));
        w7.b6.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f23991s = imageView2;
        imageView2.setImageResource(R.drawable.mini_replace2);
        linearLayout3.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.v = textView5;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView5);
        textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
        linearLayout3.addView(textView5, w7.z5.q(-2, -2, 16));
        d();
    }

    @Override
    public final void d() {
        org.telegram.ui.Cells.z zVar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f23985a;
        this.f23987c.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.f23988f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f23986b;
        if (linearLayout.isClickable()) {
            zVar = org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.x0(null, i11, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        } else {
            zVar = null;
        }
        linearLayout.setBackground(zVar);
        if (linearLayout.isClickable()) {
            w7.b6.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        this.f23991s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        this.f23990r.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(i12, c6Var)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
