package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.v41;
import org.telegram.ui.z41;
public abstract class x7 extends FrameLayout {
    public final v7 f32315a;
    public final w7 f32316b;
    public final TextView f32317c;
    public final TextView d;
    public final TextView f32318e;
    public final TextView f32319f;
    public final Paint h;
    public final org.telegram.ui.Components.b9 f32320n;
    public final fi.e7 f32321r;
    public final org.telegram.ui.ActionBar.h6 f32322s;
    public z41 f32323w;
    public final TLRPC.ChatFull f32324x;
    public boolean f32325y;

    public x7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        this.h = new Paint(1);
        this.f32320n = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.f32321r = new fi.e7(null, false);
        this.f32324x = chatFull;
        this.f32322s = h6Var;
        v7 v7Var = new v7(this, context, h6Var);
        this.f32315a = v7Var;
        setClipChildren(false);
        boolean z10 = hd.f24408a0;
        if (!z10) {
            i7 = 8388611;
        } else {
            i7 = 8388613;
        }
        int i11 = i7 | 16;
        if (!z10) {
            f10 = 12.0f;
        } else {
            f10 = 16.0f;
        }
        if (!z10) {
            f11 = 16.0f;
        } else {
            f11 = 12.0f;
        }
        addView(v7Var, c8.na.d(46, 46.0f, i11, f10, 0.0f, f11, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        ?? m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f32316b = m5Var;
        ls.i(m5Var);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(16);
        m5Var.setMaxLines(1);
        m5Var.setTextColor(-16777216);
        if (hd.f24408a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        m5Var.setGravity(i10);
        TextView textView = new TextView(context);
        this.f32317c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!hd.f24408a0) {
            g10.addView((View) m5Var, c8.na.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            g10.addView(textView, c8.na.r(-2, -2, 80));
        } else {
            g10.addView(textView, c8.na.r(-2, -2, 80));
            g10.addView((View) m5Var, c8.na.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(g10, c8.na.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f32318e = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-16777216);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(-16777216);
        textView3.setGravity(16);
        TextView textView4 = new TextView(context);
        this.f32319f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
        if (!hd.f24408a0) {
            g11.addView(textView2, c8.na.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            g11.addView(textView4, c8.na.r(-2, -2, 16));
            g11.addView(textView3, c8.na.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            g11.addView(textView3, c8.na.t(-2, -2, 16, 0, 0, 10, 0));
            g11.addView(textView4, c8.na.r(-2, -2, 16));
            g11.addView(textView2, c8.na.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(g11, c8.na.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = hd.f24408a0;
        if (!z11) {
            f12 = 72.0f;
        } else {
            f12 = 18.0f;
        }
        if (!z11) {
            f13 = 18.0f;
        } else {
            f13 = 72.0f;
        }
        addView(linearLayout, c8.na.d(-1, -2.0f, 0, f12, 0.0f, f13, 0.0f));
        int i12 = org.telegram.ui.ActionBar.m6.f29455j5;
        org.telegram.ui.ActionBar.t6.X(m5Var, i12, null);
        org.telegram.ui.ActionBar.t6.U(textView, i12, null);
        int i13 = org.telegram.ui.ActionBar.m6.A6;
        org.telegram.ui.ActionBar.t6.U(textView2, i13, null);
        org.telegram.ui.ActionBar.t6.U(textView3, i13, null);
        org.telegram.ui.ActionBar.t6.U(textView4, i13, null);
        Drawable mutate = context.getDrawable(2131231975).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.x(textView4, mutate, i13, null, mode);
        Drawable mutate2 = context.getDrawable(2131231976).mutate();
        org.telegram.ui.ActionBar.t6.x(textView3, mutate2, i13, null, mode);
        oq oqVar = new oq(null, mutate, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        oqVar.h = intrinsicWidth;
        oqVar.f38305n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(oqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        oq oqVar2 = new oq(null, mutate2, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        oqVar2.h = intrinsicWidth2;
        oqVar2.f38305n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(oqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f32325y) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29348d7, this.f32322s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (hd.f24408a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.f32315a;
    }

    public z41 getPostInfo() {
        return this.f32323w;
    }

    public fi.e7 getStoryAvatarParams() {
        return this.f32321r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32321r.g();
    }

    public void setData(v41 v41Var) {
        TLRPC.User user = v41Var.f52698a;
        org.telegram.ui.Components.b9 b9Var = this.f32320n;
        b9Var.r(user);
        TLRPC.User user2 = v41Var.f52698a;
        v7 v7Var = this.f32315a;
        v7Var.f(user2, b9Var);
        v7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
        this.f32316b.k(v41Var.f52698a.first_name);
        this.f32318e.setText(v41Var.f52699b);
        this.f32317c.setVisibility(8);
        this.d.setVisibility(8);
        this.f32319f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f32315a.setOnClickListener(onClickListener);
    }
}
