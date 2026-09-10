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
public final class d91 extends FrameLayout {
    public static final int f22337f = 0;
    public final org.telegram.ui.ActionBar.f6 f22338a;
    public final cm0 f22339b;
    public final RectF f22340c;
    public final RectF d;
    public final Path e;

    public d91(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        cm0 cm0Var = new cm0(this);
        this.f22339b = cm0Var;
        this.f22340c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.f22338a = f6Var;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.il, f6Var);
        cm0Var.B = v02;
        cm0Var.A = v02;
        cm0Var.f22201z = v02;
        cm0Var.f22199x = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
        cm0Var.f22186j = false;
        cm0Var.f22185i = false;
        cm0Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f22340c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        cm0 cm0Var = this.f22339b;
        float[] fArr = cm0Var.e;
        float dp = AndroidUtilities.dp(10.0f);
        fArr[7] = dp;
        fArr[6] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float[] fArr2 = cm0Var.e;
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
        this.f22339b.d(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(3.0f), getHeight());
        cm0Var.e(canvas, rectF2, 1.0f);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f22338a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.il, f6Var));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, w7.a6.n(-1, -2));
        }
        if (z10) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        addView(linearLayout, w7.a6.d(-1, -2.0f, 51, 0.0f, 0.0f, f7, 0.0f));
        if (z10) {
            w9 w9Var = new w9(getContext());
            w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            w9Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.08f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var))));
            addView(w9Var, w7.a6.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            w9Var.k(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
