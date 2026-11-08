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
public final class ni0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean f48047a;
    public int f48048b;
    public final int f48049c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final FrameLayout f48050e;
    public final org.telegram.ui.Components.l9 f48051f;
    public final TextView h;
    public final TextView f48052n;
    public final ImageView f48053r;
    public boolean f48054s;
    public String f48055w;

    public ni0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f48049c = i7;
        this.d = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48050e = frameLayout;
        addView(frameLayout, c8.ha.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f48051f = l9Var;
        l9Var.setImageResource(2131232033);
        a();
        frameLayout.addView(l9Var, c8.ha.e(36, 36, 17));
        TextView b10 = c8.qa.b(context, 15.0f, org.telegram.ui.ActionBar.k6.G6, true, null);
        this.h = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, c8.ha.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.f28244y6;
        TextView b11 = c8.qa.b(context, 13.0f, i10, false, null);
        this.f48052n = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, c8.ha.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f48053r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        org.telegram.ui.ActionBar.r6.t(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, f6Var);
        addView(imageView, c8.ha.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.f48048b = org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d));
        this.f48047a = true;
        this.f48051f.setColorFilter(new PorterDuffColorFilter(this.f48048b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f48054s) {
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.k6.f27975k0;
            }
            Paint paint = W0;
            float f11 = 72.0f;
            if (org.telegram.messenger.id.f23157a0) {
                f10 = 0.0f;
            } else {
                f10 = 72.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!org.telegram.messenger.id.f23157a0) {
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
        org.telegram.ui.Components.l9 l9Var;
        int r12;
        try {
            if (this.f48047a && (l9Var = this.f48051f) != null && (r12 = org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d))) != this.f48048b) {
                this.f48048b = r12;
                l9Var.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
