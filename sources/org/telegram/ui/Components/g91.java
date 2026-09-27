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
public final class g91 extends FrameLayout {
    public static final int f24514f = 0;
    public final org.telegram.ui.ActionBar.e6 f24515a;
    public final fm0 f24516b;
    public final RectF f24517c;
    public final RectF d;
    public final Path e;

    public g91(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        fm0 fm0Var = new fm0(this);
        this.f24516b = fm0Var;
        this.f24517c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.f24515a = e6Var;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.il, e6Var);
        fm0Var.B = v02;
        fm0Var.A = v02;
        fm0Var.f24356z = v02;
        fm0Var.f24354x = org.telegram.ui.ActionBar.i6.l1(0.1f, v02);
        fm0Var.f24341j = false;
        fm0Var.f24340i = false;
        fm0Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f24517c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        fm0 fm0Var = this.f24516b;
        float[] fArr = fm0Var.e;
        float dp = AndroidUtilities.dp(10.0f);
        fArr[7] = dp;
        fArr[6] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float[] fArr2 = fm0Var.e;
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
        this.f24516b.d(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(3.0f), getHeight());
        fm0Var.e(canvas, rectF2, 1.0f);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f24515a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.il, e6Var));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19164j5, e6Var));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19164j5, e6Var));
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, w7.y5.n(-1, -2));
        }
        if (z10) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        addView(linearLayout, w7.y5.d(-1, -2.0f, 51, 0.0f, 0.0f, f7, 0.0f));
        if (z10) {
            w9 w9Var = new w9(getContext());
            w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            w9Var.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.l1(0.08f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19164j5, e6Var))));
            addView(w9Var, w7.y5.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            w9Var.k(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
