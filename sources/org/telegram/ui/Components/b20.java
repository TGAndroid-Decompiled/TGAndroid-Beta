package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public abstract class b20 extends org.telegram.ui.ActionBar.e3 {
    public b20(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        ri0 ri0Var = new ri0(context);
        ri0Var.setAutoRepeat(true);
        ri0Var.f(R.raw.utyan_gigagroup, 120, 120, null);
        ri0Var.d();
        linearLayout.addView(ri0Var, h7.z5.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.h(24.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, h7.z5.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, h7.z5.t(-2, -2, 1, 0, 12, 0, 0));
        for (int i10 = 0; i10 < 3; i10++) {
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
            linearLayout2.addView(linearLayoutG, h7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.g6.f23300r5;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setMaxWidth(AndroidUtilities.dp(260.0f));
            if (i10 == 0) {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo1));
            } else if (i10 == 1) {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo2));
            } else if (i10 == 2) {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo3));
            }
            if (LocaleController.isRTL) {
                linearLayoutG.addView(textView2, h7.z5.n(-2, -2));
                linearLayoutG.addView(imageView, h7.z5.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                linearLayoutG.addView(imageView, h7.z5.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                linearLayoutG.addView(textView2, h7.z5.n(-2, -2));
            }
        }
        a20 a20Var = new a20(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        a20Var.addView(view, h7.z5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView3 = new TextView(context);
        a20Var.f26600a = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        org.telegram.messenger.y1.s(textView3, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, 14.0f);
        a20Var.addView(textView3, h7.z5.e(-2, -2, 17));
        a20Var.setBackground(null);
        a20Var.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
        view.setOnClickListener(new gg.f(this, context, n2Var, 27));
        linearLayout.addView(a20Var, h7.z5.t(-1, 50, 51, 0, 29, 0, 0));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23233n5, false));
        org.telegram.messenger.rl.i(R.string.GigagroupConvertCancelButton, textView4, 17);
        linearLayout.addView(textView4, h7.z5.t(-2, 48, 49, 17, 0, 17, 16));
        textView4.setOnClickListener(new f0(this, 20));
    }

    public abstract void m();

    public abstract void n();
}
