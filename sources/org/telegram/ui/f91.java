package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class f91 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 f33552a;
    public final org.telegram.ui.Components.yb0 f33553b;
    public final FrameLayout f33554c;
    public final ImageView d;
    public final TextView e;
    public final TextView f33555f;
    public final TextView h;
    public boolean f33556n;

    public f91(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33552a = f6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33554c = frameLayout;
        org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0(1);
        this.f33553b = yb0Var;
        frameLayout.setBackground(yb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.y5.e(24, 24, 17));
        LinearLayout f7 = org.telegram.messenger.rk.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f33555f = h;
        h.setTextSize(1, 13.0f);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(f7, h, w7.y5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = h10;
        h10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h10, w7.y5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f7, w7.y5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.y5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.y5.t(28, 28, 19, 18, 0, 0, 0));
            addView(f7, w7.y5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(h10, w7.y5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override
    public final void e() {
        boolean q6;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f33552a;
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f33555f.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19477y6, f6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19279n6, f6Var));
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        this.f33553b.f30494b = q6;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f33556n) {
            f7 = 60.0f;
        } else {
            f7 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i10;
        if (!TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
