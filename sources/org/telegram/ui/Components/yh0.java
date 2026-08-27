package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
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

public class yh0 extends org.telegram.ui.ActionBar.e3 {

    public final Bitmap f34904b;

    public final TextView f34905c;
    public final TextView d;

    public final TextView f34906e;

    public final int f34907f;
    public final ri0 h;

    public yh0(Context context, String str, String str2, String str3, boolean z10) {
        super(context, null, false, false);
        Bitmap bitmap = null;
        fixNavigationBar();
        setTitle(str, true);
        ce ceVar = new ce(context, 2);
        ceVar.setScaleType(ImageView.ScaleType.FIT_XY);
        ceVar.setOutlineProvider(new cg.l1(13));
        ceVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        Bitmap bitmap2 = this.f34904b;
        try {
            HashMap map = new HashMap();
            map.put(lb.b.f15507a, qb.b.M);
            map.put(lb.b.f15509c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            Bitmap bitmapEncode = telegramQRCodeWriter.encode(str2, 768, 768, map, bitmap2);
            this.f34907f = telegramQRCodeWriter.getImageSize();
            bitmap = bitmapEncode;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.f34904b = bitmap;
        ceVar.setImageBitmap(bitmap);
        ri0 ri0Var = new ri0(context);
        this.h = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ri0Var.setBackgroundColor(-1);
        org.telegram.ui.sl0 sl0Var = new org.telegram.ui.sl0(this, context, ceVar);
        sl0Var.addView(ceVar, h7.z5.c(-1.0f, -1));
        sl0Var.addView(ri0Var, h7.z5.e(60, 60, 17));
        linearLayout.addView(sl0Var, h7.z5.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.f34905c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, h7.z5.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setOnClickListener(new xh0(0, this, context));
        linearLayout.addView(textView2, h7.z5.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.f34906e = textView3;
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.ShareLink));
            textView3.setOnClickListener(new xh0(1, str2, context));
            linearLayout.addView(textView3, h7.z5.t(-1, 48, 80, 16, 3, 16, 16));
        }
        n();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public final void m(int i10) {
        ri0 ri0Var = this.h;
        ri0Var.setAutoRepeat(true);
        ri0Var.f(i10, 60, 60, null);
        ri0Var.d();
    }

    public final void n() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Sh);
        TextView textView = this.d;
        textView.setTextColor(themedColor);
        int iDp = AndroidUtilities.dp(24.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor2 = getThemedColor(i10);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, themedColor2, themedColor3, themedColor3));
        TextView textView2 = this.f34906e;
        if (textView2 != null) {
            textView2.setTextColor(getThemedColor(i10));
            textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(getThemedColor(i10), Math.min(255, Color.alpha(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6)) * 2)), 7, -1));
        }
        int i11 = org.telegram.ui.ActionBar.g6.f23423y6;
        int themedColor4 = getThemedColor(i11);
        TextView textView3 = this.f34905c;
        textView3.setTextColor(themedColor4);
        textView3.setTextColor(getThemedColor(i11));
        if (getTitleView() != null) {
            getTitleView().setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        }
        setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
    }
}
