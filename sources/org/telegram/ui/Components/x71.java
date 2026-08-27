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

public final class x71 extends FrameLayout {

    public static final int f34536f = 0;

    public final org.telegram.ui.ActionBar.c6 f34537a;

    public final gl0 f34538b;

    public final RectF f34539c;
    public final RectF d;

    public final Path f34540e;

    public x71(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        gl0 gl0Var = new gl0(this);
        this.f34538b = gl0Var;
        this.f34539c = new RectF();
        this.d = new RectF();
        this.f34540e = new Path();
        setWillNotDraw(false);
        this.f34537a = c6Var;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.il, c6Var);
        gl0Var.B = iV0;
        gl0Var.A = iV0;
        gl0Var.f28765z = iV0;
        gl0Var.f28763x = org.telegram.ui.ActionBar.g6.l1(0.1f, iV0);
        gl0Var.f28750j = false;
        gl0Var.f28749i = false;
        gl0Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f34539c;
        rectF.set(0.0f, 0.0f, width, height);
        gl0 gl0Var = this.f34538b;
        float[] fArr = gl0Var.f28746e;
        float fDp = AndroidUtilities.dp(10.0f);
        fArr[7] = fDp;
        fArr[6] = fDp;
        fArr[1] = fDp;
        fArr[0] = fDp;
        float[] fArr2 = gl0Var.f28746e;
        float fDp2 = AndroidUtilities.dp(10.0f);
        fArr2[5] = fDp2;
        fArr2[4] = fDp2;
        fArr2[3] = fDp2;
        fArr2[2] = fDp2;
        Path path = this.f34540e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.f34538b.d(canvas, rectF, 1.0f, false, false);
        float fDp3 = AndroidUtilities.dp(3.0f);
        float height2 = getHeight();
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, fDp3, height2);
        gl0Var.e(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        removeAllViews();
        boolean z10 = webPage.photo != null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.c6 c6Var = this.f34537a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.il, c6Var));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, h7.z5.n(-1, -2));
        }
        addView(linearLayout, h7.z5.d(-1, -2.0f, 51, 0.0f, 0.0f, z10 ? 56.0f : 0.0f, 0.0f));
        if (z10) {
            n9 n9Var = new n9(getContext());
            n9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            n9Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var))));
            addView(n9Var, h7.z5.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, 40);
            n9Var.k(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
        }
        setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
    }
}
