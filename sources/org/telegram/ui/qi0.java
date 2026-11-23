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
    public boolean f51464a;
    public int f51465b;
    public final int f51466c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final FrameLayout f51467e;
    public final org.telegram.ui.Components.p9 f51468f;
    public final TextView h;
    public final TextView f51469n;
    public final ImageView f51470r;
    public boolean f51471s;
    public String f51472w;

    public qi0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f51466c = i7;
        this.d = i6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51467e = frameLayout;
        addView(frameLayout, c8.na.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f51468f = p9Var;
        p9Var.setImageResource(2131232037);
        a();
        frameLayout.addView(p9Var, c8.na.e(36, 36, 17));
        TextView b10 = c8.wa.b(context, 15.0f, org.telegram.ui.ActionBar.n6.G6, true, null);
        this.h = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, c8.na.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.n6.f29843y6;
        TextView b11 = c8.wa.b(context, 13.0f, i10, false, null);
        this.f51469n = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, c8.na.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f51470r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231247);
        org.telegram.ui.ActionBar.u6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var);
        addView(imageView, c8.na.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.f51465b = org.telegram.ui.ActionBar.n6.r1(0.3f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.d));
        this.f51464a = true;
        this.f51468f.setColorFilter(new PorterDuffColorFilter(this.f51465b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f51471s) {
            Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.n6.f29574k0;
            }
            Paint paint = W0;
            float f11 = 72.0f;
            if (org.telegram.messenger.gd.f24314a0) {
                f10 = 0.0f;
            } else {
                f10 = 72.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!org.telegram.messenger.gd.f24314a0) {
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
        org.telegram.ui.Components.p9 p9Var;
        int r12;
        try {
            if (this.f51464a && (p9Var = this.f51468f) != null && (r12 = org.telegram.ui.ActionBar.n6.r1(0.3f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.d))) != this.f51465b) {
                this.f51465b = r12;
                p9Var.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
