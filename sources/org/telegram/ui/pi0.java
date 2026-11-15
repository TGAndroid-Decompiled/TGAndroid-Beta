package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class pi0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean f50269a;
    public int f50270b;
    public final int f50271c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final FrameLayout f50272e;
    public final org.telegram.ui.Components.i9 f50273f;
    public final TextView h;
    public final TextView f50274n;
    public final ImageView f50275r;
    public boolean f50276s;
    public String f50277w;

    public pi0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f50271c = i7;
        this.d = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50272e = frameLayout;
        addView(frameLayout, c8.ja.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f50273f = i9Var;
        i9Var.setImageResource(2131232033);
        a();
        frameLayout.addView(i9Var, c8.ja.e(36, 36, 17));
        TextView b10 = c8.sa.b(context, 15.0f, org.telegram.ui.ActionBar.j6.G6, true, null);
        this.h = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, c8.ja.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.f29241y6;
        TextView b11 = c8.sa.b(context, 13.0f, i10, false, null);
        this.f50274n = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, c8.ja.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f50275r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        org.telegram.ui.ActionBar.q6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, e6Var);
        addView(imageView, c8.ja.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.f50270b = org.telegram.ui.ActionBar.j6.r1(0.3f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.d));
        this.f50269a = true;
        this.f50273f.setColorFilter(new PorterDuffColorFilter(this.f50270b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f50276s) {
            Paint W0 = org.telegram.ui.ActionBar.j6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint = W0;
            float f11 = 72.0f;
            if (org.telegram.messenger.hd.f24104a0) {
                f10 = 0.0f;
            } else {
                f10 = 72.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!org.telegram.messenger.hd.f24104a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.i9 i9Var;
        int r12;
        try {
            if (this.f50269a && (i9Var = this.f50273f) != null && (r12 = org.telegram.ui.ActionBar.j6.r1(0.3f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.d))) != this.f50270b) {
                this.f50270b = r12;
                i9Var.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
