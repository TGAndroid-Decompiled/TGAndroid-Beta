package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramQRCodeWriter;
public class gi0 extends org.telegram.ui.ActionBar.f3 {
    public final Bitmap f28891b;
    public final TextView f28892c;
    public final TextView d;
    public final TextView f28893e;
    public final int f28894f;
    public final aj0 h;

    public gi0(Context context, String str, String str2, String str3, boolean z10) {
        super(context, null, false, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        je jeVar = new je(context, 2);
        jeVar.setScaleType(ImageView.ScaleType.FIT_XY);
        jeVar.setOutlineProvider(new eg.k1(13));
        jeVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap bitmap2 = this.f28891b;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(mb.b.f16947a, rb.b.M);
            hashMap.put(mb.b.f16949c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            Bitmap encode = telegramQRCodeWriter.encode(str2, 768, 768, hashMap, bitmap2);
            this.f28894f = telegramQRCodeWriter.getImageSize();
            bitmap = encode;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f28891b = bitmap;
        jeVar.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        org.telegram.ui.pl0 pl0Var = new org.telegram.ui.pl0(this, context, jeVar);
        pl0Var.addView(jeVar, i7.f6.c(-1.0f, -1));
        pl0Var.addView((View) imageView, i7.f6.e(60, 60, 17));
        linearLayout.addView(pl0Var, i7.f6.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.f28892c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, i7.f6.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setOnClickListener(new fi0(0, this, context));
        linearLayout.addView(textView2, i7.f6.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.f28893e = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new fi0(1, str2, context));
            linearLayout.addView(textView3, i7.f6.t(-1, 48, 80, 16, 3, 16, 16));
        }
        n();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public final void m(int i10) {
        aj0 aj0Var = this.h;
        aj0Var.setAutoRepeat(true);
        aj0Var.f(i10, 60, 60, null);
        aj0Var.d();
    }

    public final void n() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Sh);
        TextView textView = this.d;
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(24.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor2 = getThemedColor(i10);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.f28893e;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i10));
            textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(getThemedColor(i10), Math.min(255, Color.alpha(getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6)) * 2)), 7, -1));
        }
        int i11 = org.telegram.ui.ActionBar.g6.f23433y6;
        int themedColor4 = getThemedColor(i11);
        TextView textView3 = this.f28892c;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i11));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        }
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
    }
}
