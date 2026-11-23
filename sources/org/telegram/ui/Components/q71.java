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
import org.telegram.tgnet.TLRPC;
public final class q71 extends FrameLayout {
    public static final int f38726f = 0;
    public final org.telegram.ui.ActionBar.i6 f38727a;
    public final ok0 f38728b;
    public final RectF f38729c;
    public final RectF d;
    public final Path f38730e;

    public q71(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        ok0 ok0Var = new ok0(this);
        this.f38728b = ok0Var;
        this.f38729c = new RectF();
        this.d = new RectF();
        this.f38730e = new Path();
        setWillNotDraw(false);
        this.f38727a = i6Var;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zl, i6Var);
        ok0Var.B = w02;
        ok0Var.A = w02;
        ok0Var.f38195z = w02;
        ok0Var.f38193x = org.telegram.ui.ActionBar.n6.r1(0.1f, w02);
        ok0Var.f38180j = false;
        ok0Var.f38179i = false;
        ok0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f38729c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ok0 ok0Var = this.f38728b;
        float[] fArr = ok0Var.f38176e;
        float L = org.telegram.messenger.g0.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = ok0Var.f38176e;
        float L2 = org.telegram.messenger.g0.L(10.0f);
        fArr2[5] = L2;
        fArr2[4] = L2;
        fArr2[3] = L2;
        fArr2[2] = L2;
        Path path = this.f38730e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.f38728b.e(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(3.0f), getHeight());
        ok0Var.f(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        boolean z10;
        float f10;
        removeAllViews();
        if (webPage.photo != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.i6 i6Var = this.f38727a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Zl, i6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, c8.na.o(-1, -2));
        }
        if (z10) {
            f10 = 56.0f;
        } else {
            f10 = 0.0f;
        }
        addView(linearLayout, c8.na.d(-1, -2.0f, 51, 0.0f, 0.0f, f10, 0.0f));
        if (z10) {
            p9 p9Var = new p9(getContext());
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.08f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.08f, i7);
            p9Var.setBackground(d02);
            org.telegram.ui.ActionBar.u6.j(p9Var, d02, K, null, i6Var);
            addView(p9Var, c8.na.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(webPage.photo.sizes, 40, false, null, false);
            p9Var.g(1, 0L, webPage, "48_48", "48_48_b", null, org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), org.telegram.messenger.fc.f(w10, webPage.photo));
        }
        setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f));
    }
}
