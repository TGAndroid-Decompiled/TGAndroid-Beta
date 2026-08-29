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
public final class h81 extends FrameLayout {
    public static final int f29136f = 0;
    public final org.telegram.ui.ActionBar.c6 f29137a;
    public final ql0 f29138b;
    public final RectF f29139c;
    public final RectF d;
    public final Path f29140e;

    public h81(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        ql0 ql0Var = new ql0(this);
        this.f29138b = ql0Var;
        this.f29139c = new RectF();
        this.d = new RectF();
        this.f29140e = new Path();
        setWillNotDraw(false);
        this.f29137a = c6Var;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.il, c6Var);
        ql0Var.B = v02;
        ql0Var.A = v02;
        ql0Var.f32006z = v02;
        ql0Var.f32004x = org.telegram.ui.ActionBar.g6.l1(0.1f, v02);
        ql0Var.f31991j = false;
        ql0Var.f31990i = false;
        ql0Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f29139c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ql0 ql0Var = this.f29138b;
        float[] fArr = ql0Var.f31987e;
        float dp = AndroidUtilities.dp(10.0f);
        fArr[7] = dp;
        fArr[6] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float[] fArr2 = ql0Var.f31987e;
        float dp2 = AndroidUtilities.dp(10.0f);
        fArr2[5] = dp2;
        fArr2[4] = dp2;
        fArr2[3] = dp2;
        fArr2[2] = dp2;
        Path path = this.f29140e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.f29138b.d(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(3.0f), getHeight());
        ql0Var.e(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        boolean z10;
        float f9;
        removeAllViews();
        if (webPage.photo != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.c6 c6Var = this.f29137a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.il, c6Var));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, i7.f6.n(-1, -2));
        }
        if (z10) {
            f9 = 56.0f;
        } else {
            f9 = 0.0f;
        }
        addView(linearLayout, i7.f6.d(-1, -2.0f, 51, 0.0f, 0.0f, f9, 0.0f));
        if (z10) {
            t9 t9Var = new t9(getContext());
            t9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            t9Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var))));
            addView(t9Var, i7.f6.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            t9Var.k(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
