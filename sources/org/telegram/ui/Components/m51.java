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
public final class m51 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f30399a;
    public final LinearLayout f30400b;
    public final TextView f30401c;
    public final TextView d;
    public final TextView e;
    public final ImageView f30402f;
    public final LinearLayout h;
    public final zp f30403n;
    public final LinearLayout f30404r;
    public final ImageView f30405s;
    public final TextView v;

    public m51(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f30399a = u6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
        LinearLayout d = org.telegram.messenger.vh.d(context, 0);
        addView(d, gb1.i(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f30401c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        d.addView(textView, gb1.x(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30400b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        gb1.b(linearLayout);
        d.addView(linearLayout, gb1.h(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, gb1.x(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f30402f = imageView;
        imageView.setImageResource(R.drawable.arrows_select);
        linearLayout.addView(imageView, gb1.x(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(AndroidUtilities.dp(1.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
        d.addView(textView3, gb1.x(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        zp zpVar = new zp(context, 20, u6Var);
        this.f30403n = zpVar;
        zpVar.b(org.telegram.ui.ActionBar.y6.f23429h7, org.telegram.ui.ActionBar.y6.f23466j7, org.telegram.ui.ActionBar.y6.f23485k7);
        zpVar.setDrawUnchecked(true);
        zpVar.a(false, false);
        zpVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(zpVar, gb1.x(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        org.telegram.messenger.t.r(textView4, org.telegram.ui.ActionBar.y6.f23464j5, u6Var, 1, 14.0f);
        textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
        linearLayout2.addView(textView4, gb1.x(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, gb1.h(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        gb1.c(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f30404r = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, gb1.h(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        gb1.c(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.f30405s = imageView2;
        imageView2.setImageResource(R.drawable.mini_replace2);
        linearLayout3.addView(imageView2, gb1.x(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.v = textView5;
        ic.a.o(14.0f, 1, textView5);
        textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
        linearLayout3.addView(textView5, gb1.u(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.y yVar;
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f30399a;
        this.f30401c.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        int i11 = org.telegram.ui.ActionBar.y6.L6;
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.f30402f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.f30400b;
        if (linearLayout.isClickable()) {
            yVar = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, i11, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        } else {
            yVar = null;
        }
        linearLayout.setBackground(yVar);
        if (linearLayout.isClickable()) {
            gb1.b(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i6, u6Var), 24, 24));
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        this.f30405s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        this.f30404r.setBackground(org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(i12, u6Var)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
    }
}
