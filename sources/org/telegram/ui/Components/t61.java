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
public final class t61 extends FrameLayout {
    public static final int f38313f = 0;
    public final org.telegram.ui.ActionBar.e6 f38314a;
    public final dk0 f38315b;
    public final RectF f38316c;
    public final RectF d;
    public final Path f38317e;

    public t61(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        dk0 dk0Var = new dk0(this);
        this.f38315b = dk0Var;
        this.f38316c = new RectF();
        this.d = new RectF();
        this.f38317e = new Path();
        setWillNotDraw(false);
        this.f38314a = e6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wl, e6Var);
        dk0Var.B = w02;
        dk0Var.A = w02;
        dk0Var.f33152z = w02;
        dk0Var.f33150x = org.telegram.ui.ActionBar.k6.r1(0.1f, w02);
        dk0Var.f33137j = false;
        dk0Var.f33136i = false;
        dk0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f38316c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        dk0 dk0Var = this.f38315b;
        float[] fArr = dk0Var.f33133e;
        float L = org.telegram.messenger.g0.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = dk0Var.f33133e;
        float L2 = org.telegram.messenger.g0.L(10.0f);
        fArr2[5] = L2;
        fArr2[4] = L2;
        fArr2[3] = L2;
        fArr2[2] = L2;
        Path path = this.f38317e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.f38315b.e(canvas, rectF, 1.0f, false, false);
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.g0.L(3.0f), getHeight());
        dk0Var.f(canvas, rectF2, 1.0f);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f38314a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Wl, e6Var);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, b8.mf.o(-1, -2));
        }
        if (z10) {
            f10 = 56.0f;
        } else {
            f10 = 0.0f;
        }
        addView(linearLayout, b8.mf.d(-1, -2.0f, 51, 0.0f, 0.0f, f10, 0.0f));
        if (z10) {
            k9 k9Var = new k9(getContext());
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            int L = org.telegram.messenger.g0.L(6.0f);
            int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.08f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.08f, i3);
            k9Var.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(k9Var, d02, L2, null, e6Var);
            addView(k9Var, b8.mf.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(webPage.photo.sizes, 40, false, null, false);
            k9Var.g(1, 0L, webPage, "48_48", "48_48_b", null, org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), org.telegram.messenger.ac.f(w10, webPage.photo));
        }
        setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f));
    }
}
