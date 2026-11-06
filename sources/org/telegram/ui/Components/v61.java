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
public final class v61 extends FrameLayout {
    public static final int f38875f = 0;
    public final org.telegram.ui.ActionBar.f6 f38876a;
    public final zj0 f38877b;
    public final RectF f38878c;
    public final RectF d;
    public final Path f38879e;

    public v61(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        zj0 zj0Var = new zj0(this);
        this.f38877b = zj0Var;
        this.f38878c = new RectF();
        this.d = new RectF();
        this.f38879e = new Path();
        setWillNotDraw(false);
        this.f38876a = f6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wl, f6Var);
        zj0Var.B = w02;
        zj0Var.A = w02;
        zj0Var.f40994z = w02;
        zj0Var.f40992x = org.telegram.ui.ActionBar.k6.r1(0.1f, w02);
        zj0Var.f40979j = false;
        zj0Var.f40978i = false;
        zj0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f38878c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        zj0 zj0Var = this.f38877b;
        float[] fArr = zj0Var.f40975e;
        float L = org.telegram.messenger.g0.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = zj0Var.f40975e;
        float L2 = org.telegram.messenger.g0.L(10.0f);
        fArr2[5] = L2;
        fArr2[4] = L2;
        fArr2[3] = L2;
        fArr2[2] = L2;
        Path path = this.f38879e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.f38877b.e(canvas, rectF, 1.0f, false, false);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f38876a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Wl, f6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
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
            l9 l9Var = new l9(getContext());
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            int L = org.telegram.messenger.g0.L(6.0f);
            int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.08f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.08f, i7);
            l9Var.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(l9Var, d02, L2, null, f6Var);
            addView(l9Var, c8.ha.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(webPage.photo.sizes, 40, false, null, false);
            l9Var.g(1, 0L, webPage, "48_48", "48_48_b", null, org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), org.telegram.messenger.hc.f(w10, webPage.photo));
        }
        setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f));
    }
}
