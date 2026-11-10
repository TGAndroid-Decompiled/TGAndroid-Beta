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
public final class b71 extends FrameLayout {
    public static final int f32138f = 0;
    public final org.telegram.ui.ActionBar.h6 f32139a;
    public final zj0 f32140b;
    public final RectF f32141c;
    public final RectF d;
    public final Path f32142e;

    public b71(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        zj0 zj0Var = new zj0(this);
        this.f32140b = zj0Var;
        this.f32141c = new RectF();
        this.d = new RectF();
        this.f32142e = new Path();
        setWillNotDraw(false);
        this.f32139a = h6Var;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wl, h6Var);
        zj0Var.B = w02;
        zj0Var.A = w02;
        zj0Var.f41041z = w02;
        zj0Var.f41039x = org.telegram.ui.ActionBar.m6.r1(0.1f, w02);
        zj0Var.f41026j = false;
        zj0Var.f41025i = false;
        zj0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f32141c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        zj0 zj0Var = this.f32140b;
        float[] fArr = zj0Var.f41022e;
        float L = org.telegram.messenger.g0.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = zj0Var.f41022e;
        float L2 = org.telegram.messenger.g0.L(10.0f);
        fArr2[5] = L2;
        fArr2[4] = L2;
        fArr2[3] = L2;
        fArr2[2] = L2;
        Path path = this.f32142e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.f32140b.e(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(3.0f), getHeight());
        zj0Var.f(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        boolean z9;
        float f10;
        removeAllViews();
        if (webPage.photo != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32139a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Wl, h6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, c8.ha.o(-1, -2));
        }
        if (z9) {
            f10 = 56.0f;
        } else {
            f10 = 0.0f;
        }
        addView(linearLayout, c8.ha.d(-1, -2.0f, 51, 0.0f, 0.0f, f10, 0.0f));
        if (z9) {
            k9 k9Var = new k9(getContext());
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.m6.f27998j5;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.08f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.08f, i7);
            k9Var.setBackground(d02);
            org.telegram.ui.ActionBar.t6.j(k9Var, d02, K, null, h6Var);
            addView(k9Var, c8.ha.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(webPage.photo.sizes, 40, false, null, false);
            k9Var.g(1, 0L, webPage, "48_48", "48_48_b", null, org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), org.telegram.messenger.hc.f(w10, webPage.photo));
        }
        setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f));
    }
}
