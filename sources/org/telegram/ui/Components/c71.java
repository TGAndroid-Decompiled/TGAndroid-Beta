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
    public static final int f32562f = 0;
    public final org.telegram.ui.ActionBar.g6 f32563a;
    public final ak0 f32564b;
    public final RectF f32565c;
    public final RectF d;
    public final Path f32566e;

    public c71(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        ak0 ak0Var = new ak0(this);
        this.f32564b = ak0Var;
        this.f32565c = new RectF();
        this.d = new RectF();
        this.f32566e = new Path();
        setWillNotDraw(false);
        this.f32563a = g6Var;
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wl, g6Var);
        ak0Var.B = w02;
        ak0Var.A = w02;
        ak0Var.f31899z = w02;
        ak0Var.f31897x = org.telegram.ui.ActionBar.l6.r1(0.1f, w02);
        ak0Var.f31884j = false;
        ak0Var.f31883i = false;
        ak0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f32565c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ak0 ak0Var = this.f32564b;
        float[] fArr = ak0Var.f31880e;
        float L = org.telegram.messenger.g0.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = ak0Var.f31880e;
        float L2 = org.telegram.messenger.g0.L(10.0f);
        fArr2[5] = L2;
        fArr2[4] = L2;
        fArr2[3] = L2;
        fArr2[2] = L2;
        Path path = this.f32566e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.f32564b.e(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(3.0f), getHeight());
        ak0Var.f(canvas, rectF2, 1.0f);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f32563a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Wl, g6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
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
            int i7 = org.telegram.ui.ActionBar.l6.f27973j5;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.r1(0.08f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)));
            org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.08f, i7);
            l9Var.setBackground(d02);
            org.telegram.ui.ActionBar.s6.j(l9Var, d02, K, null, g6Var);
            addView(l9Var, c8.ha.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(webPage.photo.sizes, 40, false, null, false);
            l9Var.g(1, 0L, webPage, "48_48", "48_48_b", null, org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), org.telegram.messenger.hc.f(w10, webPage.photo));
        }
        setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f));
    }
}
