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
public class wh0 extends org.telegram.ui.ActionBar.f3 {
    public final Bitmap f34228b;
    public final TextView f34229c;
    public final TextView d;
    public final TextView f34230e;
    public final int f34231f;
    public final pi0 h;

    public wh0(Context context, String str, String str2, String str3, boolean z10) {
        super(context, null, false, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        ge geVar = new ge(context, 2);
        geVar.setScaleType(ImageView.ScaleType.FIT_XY);
        geVar.setOutlineProvider(new bg.q1(13));
        geVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap bitmap2 = this.f34228b;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(kb.b.f14726a, pb.b.M);
            hashMap.put(kb.b.f14728c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            Bitmap encode = telegramQRCodeWriter.encode(str2, 768, 768, hashMap, bitmap2);
            this.f34231f = telegramQRCodeWriter.getImageSize();
            bitmap = encode;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f34228b = bitmap;
        geVar.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        org.telegram.ui.rl0 rl0Var = new org.telegram.ui.rl0(this, context, geVar);
        rl0Var.addView(geVar, g7.e6.c(-1.0f, -1));
        rl0Var.addView((View) imageView, g7.e6.e(60, 60, 17));
        linearLayout.addView(rl0Var, g7.e6.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.f34229c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, g7.e6.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setOnClickListener(new s2(29, this, context));
        linearLayout.addView(textView2, g7.e6.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.f34230e = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new vh0(0, str2, context));
            linearLayout.addView(textView3, g7.e6.t(-1, 48, 80, 16, 3, 16, 16));
        }
        n();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public final void m(int i9) {
        pi0 pi0Var = this.h;
        pi0Var.setAutoRepeat(true);
        pi0Var.f(i9, 60, 60, null);
        pi0Var.d();
    }

    public final void n() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.Sh);
        TextView textView = this.d;
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(24.0f);
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        int themedColor2 = getThemedColor(i9);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.f6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.f34230e;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i9));
            textView2.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(getThemedColor(i9), Math.min(255, Color.alpha(getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6)) * 2)), 7, -1));
        }
        int i10 = org.telegram.ui.ActionBar.f6.f23369y6;
        int themedColor4 = getThemedColor(i10);
        TextView textView3 = this.f34229c;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i10));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.G6));
        }
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
    }
}
