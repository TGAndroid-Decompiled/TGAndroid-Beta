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
public class ri0 extends org.telegram.ui.ActionBar.g3 {
    public final Bitmap f28475b;
    public final TextView f28476c;
    public final TextView d;
    public final TextView e;
    public final int f28477f;
    public final jj0 h;

    public ri0(Context context, String str, String str2, String str3, boolean z4) {
        super(context, null, false, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        ge geVar = new ge(context, 2);
        geVar.setScaleType(ImageView.ScaleType.FIT_XY);
        geVar.setOutlineProvider(new gg.j1(11));
        geVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap bitmap2 = this.f28475b;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(ob.b.f16499a, tb.b.M);
            hashMap.put(ob.b.f16501c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            Bitmap encode = telegramQRCodeWriter.encode(str2, 768, 768, hashMap, bitmap2);
            this.f28477f = telegramQRCodeWriter.getImageSize();
            bitmap = encode;
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f28475b = bitmap;
        geVar.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        org.telegram.ui.zl0 zl0Var = new org.telegram.ui.zl0(this, context, geVar);
        zl0Var.addView(geVar, k7.b6.c(-1.0f, -1));
        zl0Var.addView((View) imageView, k7.b6.e(60, 60, 17));
        linearLayout.addView(zl0Var, k7.b6.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.f28476c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, k7.b6.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setOnClickListener(new w2(27, this, context));
        linearLayout.addView(textView2, k7.b6.t(-1, 48, 80, 16, 15, 16, 3));
        if (z4) {
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new w2(28, str2, context));
            linearLayout.addView(textView3, k7.b6.t(-1, 48, 80, 16, 3, 16, 16));
        }
        n();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public final void m(int i10) {
        jj0 jj0Var = this.h;
        jj0Var.setAutoRepeat(true);
        jj0Var.f(i10, 60, 60, null);
        jj0Var.d();
    }

    public final void n() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Sh);
        TextView textView = this.d;
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(24.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor2 = getThemedColor(i10);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i10));
            textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i10), Math.min(255, Color.alpha(getThemedColor(org.telegram.ui.ActionBar.j6.f19971i6)) * 2)), 7, -1));
        }
        int i11 = org.telegram.ui.ActionBar.j6.f20256y6;
        int themedColor4 = getThemedColor(i11);
        TextView textView3 = this.f28476c;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i11));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        }
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5));
    }
}
