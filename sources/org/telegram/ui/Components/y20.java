package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public abstract class y20 extends org.telegram.ui.ActionBar.k3 {
    public y20(Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, true);
        int i10;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.utyan_gigagroup, 120, 120, null);
        imageView.d();
        linearLayout.addView((View) imageView, gb1.x(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.vh.j(24.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, null);
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, gb1.x(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, gb1.x(-2, -2, 1, 0, 12, 0, 0));
        int i11 = 0;
        while (true) {
            if (i11 < 3) {
                LinearLayout d = org.telegram.messenger.vh.d(context, 0);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                linearLayout2.addView(d, gb1.x(-2, -2, i10, 0, 8, 0, 0));
                ImageView imageView2 = new ImageView(context);
                int i12 = org.telegram.ui.ActionBar.y6.f23612r5;
                org.telegram.ui.ActionBar.f7.t(imageView2, i12, null, PorterDuff.Mode.MULTIPLY);
                imageView2.setImageResource(R.drawable.list_circle);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.f7.V(textView2, i12, null);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView2.setMaxWidth(AndroidUtilities.dp(260.0f));
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo3));
                        }
                    } else {
                        textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo2));
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.GigagroupConvertInfo1));
                }
                if (LocaleController.isRTL) {
                    d.addView(textView2, gb1.r(-2, -2));
                    d.addView(imageView2, gb1.o(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    d.addView(imageView2, gb1.o(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                    d.addView(textView2, gb1.r(-2, -2));
                }
                i11++;
            } else {
                ?? frameLayout = new FrameLayout(context);
                View view = new View(context);
                frameLayout.f34594a = view;
                view.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                frameLayout.addView(view, gb1.h(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView3 = new TextView(context);
                frameLayout.f34595b = textView3;
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setGravity(17);
                org.telegram.messenger.t.r(textView3, org.telegram.ui.ActionBar.y6.Sh, null, 1, 14.0f);
                frameLayout.addView(textView3, gb1.i(-2, -2, 17));
                frameLayout.setBackground(null);
                frameLayout.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
                view.setOnClickListener(new bi.w0(this, context, r2Var, 25));
                linearLayout.addView((View) frameLayout, gb1.x(-1, 50, 51, 0, 29, 0, 0));
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.f23537n5, null);
                org.telegram.messenger.vh.k(R.string.GigagroupConvertCancelButton, textView4, 17);
                linearLayout.addView(textView4, gb1.x(-2, 48, 49, 17, 0, 17, 16));
                textView4.setOnClickListener(new f0(this, 19));
                return;
            }
        }
    }

    public abstract void m();

    public abstract void n();
}
