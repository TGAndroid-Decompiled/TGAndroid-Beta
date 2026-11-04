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
public final class ki0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean f46951a;
    public int f46952b;
    public final int f46953c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final FrameLayout f46954e;
    public final org.telegram.ui.Components.k9 f46955f;
    public final TextView h;
    public final TextView f46956n;
    public final ImageView f46957r;
    public boolean f46958s;
    public String f46959w;

    public ki0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f46953c = i3;
        this.d = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46954e = frameLayout;
        addView(frameLayout, b8.mf.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f46955f = k9Var;
        k9Var.setImageResource(2131232033);
        a();
        frameLayout.addView(k9Var, b8.mf.e(36, 36, 17));
        TextView b10 = b8.rf.b(context, 15.0f, org.telegram.ui.ActionBar.k6.G6, true, null);
        this.h = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, b8.mf.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.f28273y6;
        TextView b11 = b8.rf.b(context, 13.0f, i10, false, null);
        this.f46956n = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, b8.mf.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f46957r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        org.telegram.ui.ActionBar.r6.t(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
        addView(imageView, b8.mf.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.f46952b = org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d));
        this.f46951a = true;
        this.f46955f.setColorFilter(new PorterDuffColorFilter(this.f46952b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f46958s) {
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint = W0;
            float f11 = 72.0f;
            if (org.telegram.messenger.bd.f21784a0) {
                f10 = 0.0f;
            } else {
                f10 = 72.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!org.telegram.messenger.bd.f21784a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.k9 k9Var;
        int r12;
        try {
            if (this.f46951a && (k9Var = this.f46955f) != null && (r12 = org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d))) != this.f46952b) {
                this.f46952b = r12;
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
