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
public final class t91 extends FrameLayout {
    public static final int f29000f = 0;
    public final org.telegram.ui.ActionBar.c6 f29001a;
    public final tm0 f29002b;
    public final RectF f29003c;
    public final RectF d;
    public final Path e;

    public t91(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        tm0 tm0Var = new tm0(this);
        this.f29002b = tm0Var;
        this.f29003c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.f29001a = c6Var;
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.il, c6Var);
        tm0Var.B = w02;
        tm0Var.A = w02;
        tm0Var.f29168z = w02;
        tm0Var.f29166x = org.telegram.ui.ActionBar.g6.m1(0.1f, w02);
        tm0Var.f29153j = false;
        tm0Var.f29152i = false;
        tm0Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f29003c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        tm0 tm0Var = this.f29002b;
        float[] fArr = tm0Var.e;
        float dp = AndroidUtilities.dp(10.0f);
        fArr[7] = dp;
        fArr[6] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float[] fArr2 = tm0Var.e;
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
        this.f29002b.d(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(3.0f), getHeight());
        tm0Var.e(canvas, rectF2, 1.0f);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f29001a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.il, c6Var));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var));
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, w7.z5.n(-1, -2));
        }
        if (z10) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        addView(linearLayout, w7.z5.a(-2.0f, 0.0f, 0.0f, f7, 0.0f, -1, 51));
        if (z10) {
            z9 z9Var = new z9(getContext());
            z9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            z9Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.m1(0.08f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var))));
            addView(z9Var, w7.z5.a(48.0f, 0.0f, 5.0f, 0.0f, 1.0f, 48, 53));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            z9Var.k(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
