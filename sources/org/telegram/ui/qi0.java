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
public final class qi0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean f49050a;
    public int f49051b;
    public final int f49052c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final FrameLayout f49053e;
    public final org.telegram.ui.Components.k9 f49054f;
    public final TextView h;
    public final TextView f49055n;
    public final ImageView f49056r;
    public boolean f49057s;
    public String f49058w;

    public qi0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f49052c = i7;
        this.d = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49053e = frameLayout;
        addView(frameLayout, c8.ha.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f49054f = k9Var;
        k9Var.setImageResource(2131232033);
        a();
        frameLayout.addView(k9Var, c8.ha.e(36, 36, 17));
        TextView b10 = c8.qa.b(context, 15.0f, org.telegram.ui.ActionBar.m6.G6, true, null);
        this.h = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, c8.ha.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.m6.f28282y6;
        TextView b11 = c8.qa.b(context, 13.0f, i10, false, null);
        this.f49055n = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, c8.ha.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f49056r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, h6Var);
        addView(imageView, c8.ha.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.f49051b = org.telegram.ui.ActionBar.m6.r1(0.3f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.d));
        this.f49050a = true;
        this.f49054f.setColorFilter(new PorterDuffColorFilter(this.f49051b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f49057s) {
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.m6.f28013k0;
            }
            Paint paint = W0;
            float f11 = 72.0f;
            if (org.telegram.messenger.id.f23161a0) {
                f10 = 0.0f;
            } else {
                f10 = 72.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!org.telegram.messenger.id.f23161a0) {
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
        org.telegram.ui.Components.k9 k9Var;
        int r12;
        try {
            if (this.f49050a && (k9Var = this.f49054f) != null && (r12 = org.telegram.ui.ActionBar.m6.r1(0.3f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.d))) != this.f49051b) {
                this.f49051b = r12;
                k9Var.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
