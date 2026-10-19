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
public class fj0 extends org.telegram.ui.ActionBar.f3 {
    public final Bitmap f26244b;
    public final TextView f26245c;
    public final TextView d;
    public final TextView e;
    public final int f26246f;
    public final xj0 h;

    public fj0(Context context, String str, String str2, String str3, boolean z10) {
        super(1, context, (org.telegram.ui.ActionBar.d6) null, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        ig.k kVar = new ig.k(context, 3);
        kVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kVar.setOutlineProvider(new ci.o1(15));
        kVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap bitmap2 = this.f26244b;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(dc.b.f7921a, ic.c.M);
            hashMap.put(dc.b.f7923c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            Bitmap encode = telegramQRCodeWriter.encode(str2, 768, 768, hashMap, bitmap2);
            this.f26246f = telegramQRCodeWriter.getImageSize();
            bitmap = encode;
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f26244b = bitmap;
        kVar.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        org.telegram.ui.ql0 ql0Var = new org.telegram.ui.ql0(this, context, kVar);
        ql0Var.addView(kVar, w7.z5.c(-1.0f, -1));
        ql0Var.addView((View) imageView, w7.z5.e(60, 60, 17));
        linearLayout.addView(ql0Var, w7.z5.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.f26245c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, w7.z5.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setOnClickListener(new ca(22, this, context));
        linearLayout.addView(textView2, w7.z5.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new ca(23, str2, context));
            linearLayout.addView(textView3, w7.z5.t(-1, 48, 80, 16, 3, 16, 16));
        }
        d();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public final void d() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
        TextView textView = this.d;
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(24.0f);
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor2 = getThemedColor(i10);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.h6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i10));
            textView2.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.o(getThemedColor(i10), Math.min(255, Color.alpha(getThemedColor(org.telegram.ui.ActionBar.h6.f21076i6)) * 2)), 7, -1));
        }
        int i11 = org.telegram.ui.ActionBar.h6.f21375y6;
        int themedColor4 = getThemedColor(i11);
        TextView textView3 = this.f26245c;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i11));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        }
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5));
    }

    public final void n(int i10) {
        xj0 xj0Var = this.h;
        xj0Var.setAutoRepeat(true);
        xj0Var.f(i10, 60, 60, null);
        xj0Var.d();
    }
}
