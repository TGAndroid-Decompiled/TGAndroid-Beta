package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class t81 extends FrameLayout {
    public static final int f28933f = 0;
    public final org.telegram.ui.ActionBar.f6 f28934a;
    public final am0 f28935b;
    public final RectF f28936c;
    public final RectF d;
    public final Path e;

    public t81(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        am0 am0Var = new am0(this);
        this.f28935b = am0Var;
        this.f28936c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.f28934a = f6Var;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.il, f6Var);
        am0Var.B = v02;
        am0Var.A = v02;
        am0Var.f23476z = v02;
        am0Var.f23474x = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
        am0Var.f23461j = false;
        am0Var.f23460i = false;
        am0Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f28936c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        am0 am0Var = this.f28935b;
        float[] fArr = am0Var.e;
        float dp = AndroidUtilities.dp(10.0f);
        fArr[7] = dp;
        fArr[6] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float[] fArr2 = am0Var.e;
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
        this.f28935b.d(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(3.0f), getHeight());
        am0Var.e(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        boolean z4;
        float f10;
        removeAllViews();
        if (webPage.photo != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28934a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.il, f6Var));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, f6Var));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, f6Var));
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, k7.b6.n(-1, -2));
        }
        if (z4) {
            f10 = 56.0f;
        } else {
            f10 = 0.0f;
        }
        addView(linearLayout, k7.b6.d(-1, -2.0f, 51, 0.0f, 0.0f, f10, 0.0f));
        if (z4) {
            p9 p9Var = new p9(getContext());
            p9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            p9Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, f6Var))));
            addView(p9Var, k7.b6.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            p9Var.k(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
