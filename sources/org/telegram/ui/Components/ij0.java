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
public class ij0 extends org.telegram.ui.ActionBar.h3 {
    public final Bitmap f27432b;
    public final TextView f27433c;
    public final TextView d;
    public final TextView e;
    public final int f27434f;
    public final ak0 h;
    public boolean f27435n;
    public int f27436r;

    public ij0(Context context, String str, String str2, String str3, boolean z10) {
        super(1, context, (org.telegram.ui.ActionBar.g6) null, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        ig.k kVar = new ig.k(context, 3);
        kVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kVar.setOutlineProvider(new ci.n1(15));
        kVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap bitmap2 = this.f27432b;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(dc.b.f7933a, ic.c.M);
            hashMap.put(dc.b.f7935c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            Bitmap encode = telegramQRCodeWriter.encode(str2, 768, 768, hashMap, bitmap2);
            this.f27434f = telegramQRCodeWriter.getImageSize();
            bitmap = encode;
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.f27432b = bitmap;
        kVar.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        org.telegram.ui.tl0 tl0Var = new org.telegram.ui.tl0(this, context, kVar);
        tl0Var.addView(kVar, w7.z5.c(-1.0f, -1));
        tl0Var.addView((View) imageView, w7.z5.e(60, 60, 17));
        linearLayout.addView(tl0Var, w7.z5.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.f27433c = textView;
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
        textView2.setOnClickListener(new aa(23, this, context));
        linearLayout.addView(textView2, w7.z5.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.e = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new aa(24, str2, context));
            linearLayout.addView(textView3, w7.z5.t(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public final void m(int i10) {
        ak0 ak0Var = this.h;
        ak0Var.setAutoRepeat(true);
        ak0Var.f(i10, 60, 60, null);
        ak0Var.d();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int i10 = org.telegram.ui.ActionBar.k6.Sh;
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            int themedColor = (getThemedColor(i11) * 17) + (getThemedColor(i10) * 31);
            int i12 = org.telegram.ui.ActionBar.k6.Qh;
            int themedColor2 = (getThemedColor(i12) * 13) + themedColor;
            int i13 = org.telegram.ui.ActionBar.k6.f21273i6;
            int themedColor3 = (getThemedColor(i13) * 7) + themedColor2;
            int i14 = org.telegram.ui.ActionBar.k6.f21572y6;
            int themedColor4 = (getThemedColor(i14) * 5) + themedColor3;
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            int themedColor5 = (getThemedColor(i15) * 3) + themedColor4;
            int i16 = org.telegram.ui.ActionBar.k6.f21255h5;
            int themedColor6 = themedColor5 + getThemedColor(i16);
            if (this.f27435n && themedColor6 == this.f27436r) {
                return;
            }
            this.f27435n = true;
            this.f27436r = themedColor6;
            TextView textView = this.d;
            if (textView != null) {
                textView.setTextColor(getThemedColor(i10));
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), getThemedColor(i11), false);
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), getThemedColor(i12), true);
            }
            TextView textView2 = this.e;
            if (textView2 != null) {
                textView2.setTextColor(getThemedColor(i11));
                org.telegram.ui.ActionBar.k6.E1(textView2.getBackground(), i0.a.o(getThemedColor(i11), Math.min(255, Color.alpha(getThemedColor(i13)) * 2)), true);
            }
            TextView textView3 = this.f27433c;
            if (textView3 != null) {
                textView3.setTextColor(getThemedColor(i14));
            }
            if (getTitleView() != null) {
                getTitleView().setTextColor(getThemedColor(i15));
            }
            setBackgroundColor(getThemedColor(i16));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void updateColors() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Sh);
        TextView textView = this.d;
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(24.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor2 = getThemedColor(i10);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i10));
            textView2.setBackground(org.telegram.ui.ActionBar.k6.g0(i0.a.o(getThemedColor(i10), Math.min(255, Color.alpha(getThemedColor(org.telegram.ui.ActionBar.k6.f21273i6)) * 2)), 7, -1));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f21572y6;
        int themedColor4 = getThemedColor(i11);
        TextView textView3 = this.f27433c;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i11));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        }
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
    }
}
