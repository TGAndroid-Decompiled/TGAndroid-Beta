package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class j20 extends org.telegram.ui.ActionBar.f3 {
    public j20(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, true);
        int i10;
        int i11;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.utyan_gigagroup, 120, 120, null);
        imageView.d();
        linearLayout.addView((View) imageView, i7.f6.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, i7.f6.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, i7.f6.t(-2, -2, 1, 0, 12, 0, 0));
        for (int i12 = 0; i12 < 3; i12++) {
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            linearLayout2.addView(g10, i7.f6.t(-2, -2, i10, 0, 8, 0, 0));
            ImageView imageView2 = new ImageView(context);
            int i13 = org.telegram.ui.ActionBar.g6.f23310r5;
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
            imageView2.setImageResource(R.drawable.list_circle);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 16);
            textView2.setMaxWidth(AndroidUtilities.dp(260.0f));
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo3));
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo2));
                }
            } else {
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo1));
            }
            if (LocaleController.isRTL) {
                g10.addView(textView2, i7.f6.n(-2, -2));
                g10.addView(imageView2, i7.f6.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                g10.addView(imageView2, i7.f6.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                g10.addView(textView2, i7.f6.n(-2, -2));
            }
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        frameLayout.addView(view, i7.f6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView3 = new TextView(context);
        frameLayout.f29302a = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        org.telegram.messenger.x3.t(textView3, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, 14.0f);
        frameLayout.addView(textView3, i7.f6.e(-2, -2, 17));
        frameLayout.setBackground(null);
        frameLayout.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
        view.setOnClickListener(new bg.q(this, context, o2Var, 28));
        linearLayout.addView((View) frameLayout, i7.f6.t(-1, 50, 51, 0, 29, 0, 0));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23240n5, false));
        org.telegram.ui.b.i(R.string.GigagroupConvertCancelButton, textView4, 17);
        linearLayout.addView(textView4, i7.f6.t(-2, 48, 49, 17, 0, 17, 16));
        textView4.setOnClickListener(new h0(this, 20));
    }

    public abstract void m();

    public abstract void n();
}
