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
public class qj0 extends org.telegram.ui.ActionBar.e3 {
    public final Bitmap f30166b;
    public final TextView f30167c;
    public final TextView d;
    public final TextView f30168e;
    public final int f30169f;
    public final hk0 h;

    public qj0(Context context, String str, String str2, String str3, boolean z10) {
        super(1, context, (org.telegram.ui.ActionBar.d6) null, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        hg.l lVar = new hg.l(context, 3);
        lVar.setScaleType(ImageView.ScaleType.FIT_XY);
        lVar.setOutlineProvider(new ai.l2(15));
        lVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap bitmap2 = this.f30166b;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(cc.b.f4581a, hc.c.M);
            hashMap.put(cc.b.f4583c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            Bitmap encode = telegramQRCodeWriter.encode(str2, 768, 768, hashMap, bitmap2);
            this.f30169f = telegramQRCodeWriter.getImageSize();
            bitmap = encode;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f30166b = bitmap;
        lVar.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        org.telegram.ui.gm0 gm0Var = new org.telegram.ui.gm0(this, context, lVar);
        gm0Var.addView(lVar, w7.x5.d(-1.0f, -1));
        gm0Var.addView((View) imageView, w7.x5.e(60, 60, 17));
        linearLayout.addView(gm0Var, w7.x5.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.f30167c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, w7.x5.a(-2.0f, 40.0f, 8.0f, 40.0f, 8.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setOnClickListener(new vt(12, this, context));
        linearLayout.addView(textView2, w7.x5.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.f30168e = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new vt(13, str2, context));
            linearLayout.addView(textView3, w7.x5.t(-1, 48, 80, 16, 3, 16, 16));
        }
        e();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public final void e() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
        TextView textView = this.d;
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(24.0f);
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor2 = getThemedColor(i10);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.h6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.f30168e;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i10));
            textView2.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.k(getThemedColor(i10), Math.min(255, Color.alpha(getThemedColor(org.telegram.ui.ActionBar.h6.f20877i6)) * 2)), 7, -1));
        }
        int i11 = org.telegram.ui.ActionBar.h6.f21171y6;
        int themedColor4 = getThemedColor(i11);
        TextView textView3 = this.f30167c;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i11));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        }
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20857h5));
    }

    public final void o(int i10) {
        hk0 hk0Var = this.h;
        hk0Var.setAutoRepeat(true);
        hk0Var.f(i10, 60, 60, null);
        hk0Var.d();
    }
}
