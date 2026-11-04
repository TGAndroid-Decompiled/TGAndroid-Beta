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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
import org.telegram.ui.k41;
import org.telegram.ui.o41;
public abstract class v7 extends FrameLayout {
    public final t7 f30738a;
    public final u7 f30739b;
    public final TextView f30740c;
    public final TextView d;
    public final TextView f30741e;
    public final TextView f30742f;
    public final Paint h;
    public final org.telegram.ui.Components.u8 f30743n;
    public final ei.o7 f30744r;
    public final org.telegram.ui.ActionBar.e6 f30745s;
    public o41 f30746w;
    public final TLRPC.ChatFull f30747x;
    public boolean f30748y;

    public v7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        this.h = new Paint(1);
        this.f30743n = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f30744r = new ei.o7(null, false);
        this.f30747x = chatFull;
        this.f30745s = e6Var;
        t7 t7Var = new t7(this, context, e6Var);
        this.f30738a = t7Var;
        setClipChildren(false);
        boolean z10 = bd.f21784a0;
        if (!z10) {
            i3 = 8388611;
        } else {
            i3 = 8388613;
        }
        int i11 = i3 | 16;
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
        addView(t7Var, mf.d(46, 46.0f, i11, f10, 0.0f, f11, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f14 = org.telegram.messenger.k5.f(context, 0);
        ?? k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f30739b = k5Var;
        hs.i(k5Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setMaxLines(1);
        k5Var.setTextColor(-16777216);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k5Var.setGravity(i10);
        TextView textView = new TextView(context);
        this.f30740c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!bd.f21784a0) {
            f14.addView((View) k5Var, mf.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f14.addView(textView, mf.r(-2, -2, 80));
        } else {
            f14.addView(textView, mf.r(-2, -2, 80));
            f14.addView((View) k5Var, mf.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f14, mf.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30741e = textView2;
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
        this.f30742f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f15 = org.telegram.messenger.k5.f(context, 0);
        if (!bd.f21784a0) {
            f15.addView(textView2, mf.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f15.addView(textView4, mf.r(-2, -2, 16));
            f15.addView(textView3, mf.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f15.addView(textView3, mf.t(-2, -2, 16, 0, 0, 10, 0));
            f15.addView(textView4, mf.r(-2, -2, 16));
            f15.addView(textView2, mf.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f15, mf.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = bd.f21784a0;
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
        addView(linearLayout, mf.d(-1, -2.0f, 0, f12, 0.0f, f13, 0.0f));
        int i12 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i12, null);
        org.telegram.ui.ActionBar.r6.V(textView, i12, null);
        int i13 = org.telegram.ui.ActionBar.k6.A6;
        org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
        org.telegram.ui.ActionBar.r6.V(textView3, i13, null);
        org.telegram.ui.ActionBar.r6.V(textView4, i13, null);
        Drawable mutate = context.getDrawable(2131231974).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.y(textView4, mutate, i13, null, mode);
        Drawable mutate2 = context.getDrawable(2131231975).mutate();
        org.telegram.ui.ActionBar.r6.y(textView3, mutate2, i13, null, mode);
        xp xpVar = new xp(null, mutate, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        xpVar.h = intrinsicWidth;
        xpVar.f40443n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(xpVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        xp xpVar2 = new xp(null, mutate2, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        xpVar2.h = intrinsicWidth2;
        xpVar2.f40443n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(xpVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f30748y) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27879d7, this.f30745s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (bd.f21784a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.f30738a;
    }

    public o41 getPostInfo() {
        return this.f30746w;
    }

    public ei.o7 getStoryAvatarParams() {
        return this.f30744r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30744r.g();
    }

    public void setData(k41 k41Var) {
        TLRPC.User user = k41Var.f46766a;
        org.telegram.ui.Components.u8 u8Var = this.f30743n;
        u8Var.r(user);
        TLRPC.User user2 = k41Var.f46766a;
        t7 t7Var = this.f30738a;
        t7Var.e(user2, u8Var);
        t7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
        this.f30739b.k(k41Var.f46766a.first_name);
        this.f30741e.setText(k41Var.f46767b);
        this.f30740c.setVisibility(8);
        this.d.setVisibility(8);
        this.f30742f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f30738a.setOnClickListener(onClickListener);
    }
}
