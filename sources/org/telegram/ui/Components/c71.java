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
public final class c71 extends FrameLayout {
    public static final int f33525f = 0;
    public final org.telegram.ui.ActionBar.e6 f33526a;
    public final ek0 f33527b;
    public final RectF f33528c;
    public final RectF d;
    public final Path f33529e;

    public c71(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        ek0 ek0Var = new ek0(this);
        this.f33527b = ek0Var;
        this.f33528c = new RectF();
        this.d = new RectF();
        this.f33529e = new Path();
        setWillNotDraw(false);
        this.f33526a = e6Var;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zl, e6Var);
        ek0Var.B = w02;
        ek0Var.A = w02;
        ek0Var.f34360z = w02;
        ek0Var.f34358x = org.telegram.ui.ActionBar.j6.r1(0.1f, w02);
        ek0Var.f34345j = false;
        ek0Var.f34344i = false;
        ek0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f33528c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ek0 ek0Var = this.f33527b;
        float[] fArr = ek0Var.f34341e;
        float L = org.telegram.messenger.g0.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = ek0Var.f34341e;
        float L2 = org.telegram.messenger.g0.L(10.0f);
        fArr2[5] = L2;
        fArr2[4] = L2;
        fArr2[3] = L2;
        fArr2[2] = L2;
        Path path = this.f33529e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.f33527b.e(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(3.0f), getHeight());
        ek0Var.f(canvas, rectF2, 1.0f);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f33526a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Zl, e6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, c8.ja.o(-1, -2));
        }
        if (z10) {
            f10 = 56.0f;
        } else {
            f10 = 0.0f;
        }
        addView(linearLayout, c8.ja.d(-1, -2.0f, 51, 0.0f, 0.0f, f10, 0.0f));
        if (z10) {
            i9 i9Var = new i9(getContext());
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.r1(0.08f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.08f, i7);
            i9Var.setBackground(d02);
            org.telegram.ui.ActionBar.q6.j(i9Var, d02, K, null, e6Var);
            addView(i9Var, c8.ja.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(webPage.photo.sizes, 40, false, null, false);
            i9Var.g(1, 0L, webPage, "48_48", "48_48_b", null, org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), org.telegram.messenger.gc.f(w10, webPage.photo));
        }
        setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f));
    }
}
