package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class ca1 extends FrameLayout {
    public static final int f27101f = 0;
    public final org.telegram.ui.ActionBar.u6 f27102a;
    public final wm0 f27103b;
    public final RectF f27104c;
    public final RectF d;
    public final Path e;

    public ca1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        wm0 wm0Var = new wm0(this);
        this.f27103b = wm0Var;
        this.f27104c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.f27102a = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.il, u6Var);
        wm0Var.B = w02;
        wm0Var.A = w02;
        wm0Var.f34501z = w02;
        wm0Var.f34499x = org.telegram.ui.ActionBar.y6.o1(0.1f, w02);
        wm0Var.f34486j = false;
        wm0Var.f34485i = false;
        wm0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f27104c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        wm0 wm0Var = this.f27103b;
        float[] fArr = wm0Var.e;
        float dp = AndroidUtilities.dp(10.0f);
        fArr[7] = dp;
        fArr[6] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float[] fArr2 = wm0Var.e;
        float dp2 = AndroidUtilities.dp(10.0f);
        fArr2[5] = dp2;
        fArr2[4] = dp2;
        fArr2[3] = dp2;
        fArr2[2] = dp2;
        Path path = this.e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.f27103b.e(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(3.0f), getHeight());
        wm0Var.f(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        boolean z10;
        float f7;
        removeAllViews();
        if (webPage.photo != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27102a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.il, u6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23462j5, u6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23462j5, u6Var);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, gb1.r(-1, -2));
        }
        if (z10) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        addView(linearLayout, gb1.h(-1, -2.0f, 51, 0.0f, 0.0f, f7, 0.0f));
        if (z10) {
            y9 y9Var = new y9(getContext());
            y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            int dp = AndroidUtilities.dp(6.0f);
            int i10 = org.telegram.ui.ActionBar.y6.f23462j5;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.08f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.08f, i10);
            y9Var.setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(y9Var, c02, L, null, u6Var);
            addView(y9Var, gb1.h(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            y9Var.k(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
