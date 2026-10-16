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
public final class l91 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f37665a;
    public final org.telegram.ui.Components.qc0 f37666b;
    public final FrameLayout f37667c;
    public final ImageView d;
    public final TextView e;
    public final TextView f37668f;
    public final TextView h;
    public boolean f37669n;
    public boolean f37670r;

    public l91(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37669n = true;
        this.f37665a = c6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37667c = frameLayout;
        org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(1);
        this.f37666b = qc0Var;
        frameLayout.setBackground(qc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.z5.e(24, 24, 17));
        LinearLayout e = org.telegram.messenger.sk.e(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f37668f = i10;
        i10.setTextSize(1, 13.0f);
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(e, i10, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = i11;
        i11.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i11, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(e, w7.z5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.z5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.z5.t(28, 28, 19, 18, 0, 0, 0));
            addView(e, w7.z5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(i11, w7.z5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        d();
    }

    @Override
    public final void d() {
        boolean z10;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f37665a;
        this.e.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.f37668f.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19988y6, c6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19784n6, c6Var));
        if (this.f37669n && (c6Var == null ? org.telegram.ui.ActionBar.g6.I.q() : c6Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37666b.f28270b = z10;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f37670r) {
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
