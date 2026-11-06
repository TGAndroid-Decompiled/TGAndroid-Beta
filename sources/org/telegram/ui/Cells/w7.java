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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
import org.telegram.ui.v41;
import org.telegram.ui.z41;
public abstract class w7 extends FrameLayout {
    public final u7 f30731a;
    public final v7 f30732b;
    public final TextView f30733c;
    public final TextView d;
    public final TextView f30734e;
    public final TextView f30735f;
    public final Paint h;
    public final org.telegram.ui.Components.w8 f30736n;
    public final di.n7 f30737r;
    public final org.telegram.ui.ActionBar.f6 f30738s;
    public z41 f30739w;
    public final TLRPC.ChatFull f30740x;
    public boolean f30741y;

    public w7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        this.h = new Paint(1);
        this.f30736n = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f30737r = new di.n7(null, false);
        this.f30740x = chatFull;
        this.f30738s = f6Var;
        u7 u7Var = new u7(this, context, f6Var);
        this.f30731a = u7Var;
        setClipChildren(false);
        boolean z9 = hd.f22878a0;
        if (!z9) {
            i7 = 8388611;
        } else {
            i7 = 8388613;
        }
        int i11 = i7 | 16;
        if (!z9) {
            f10 = 12.0f;
        } else {
            f10 = 16.0f;
        }
        if (!z9) {
            f11 = 16.0f;
        } else {
            f11 = 12.0f;
        }
        addView(u7Var, c8.ha.d(46, 46.0f, i11, f10, 0.0f, f11, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f14 = org.telegram.messenger.k5.f(context, 0);
        ?? k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f30732b = k5Var;
        qs.i(k5Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setMaxLines(1);
        k5Var.setTextColor(-16777216);
        if (hd.f22878a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k5Var.setGravity(i10);
        TextView textView = new TextView(context);
        this.f30733c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!hd.f22878a0) {
            f14.addView((View) k5Var, c8.ha.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f14.addView(textView, c8.ha.r(-2, -2, 80));
        } else {
            f14.addView(textView, c8.ha.r(-2, -2, 80));
            f14.addView((View) k5Var, c8.ha.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f14, c8.ha.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30734e = textView2;
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
        this.f30735f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f15 = org.telegram.messenger.k5.f(context, 0);
        if (!hd.f22878a0) {
            f15.addView(textView2, c8.ha.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f15.addView(textView4, c8.ha.r(-2, -2, 16));
            f15.addView(textView3, c8.ha.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f15.addView(textView3, c8.ha.t(-2, -2, 16, 0, 0, 10, 0));
            f15.addView(textView4, c8.ha.r(-2, -2, 16));
            f15.addView(textView2, c8.ha.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f15, c8.ha.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z10 = hd.f22878a0;
        if (!z10) {
            f12 = 72.0f;
        } else {
            f12 = 18.0f;
        }
        if (!z10) {
            f13 = 18.0f;
        } else {
            f13 = 72.0f;
        }
        addView(linearLayout, c8.ha.d(-1, -2.0f, 0, f12, 0.0f, f13, 0.0f));
        int i12 = org.telegram.ui.ActionBar.k6.f27957j5;
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
        xpVar.f40336n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(xpVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        xp xpVar2 = new xp(null, mutate2, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        xpVar2.h = intrinsicWidth2;
        xpVar2.f40336n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(xpVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f30741y) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27850d7, this.f30738s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (hd.f22878a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.f30731a;
    }

    public z41 getPostInfo() {
        return this.f30739w;
    }

    public di.n7 getStoryAvatarParams() {
        return this.f30737r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30737r.g();
    }

    public void setData(v41 v41Var) {
        TLRPC.User user = v41Var.f50573a;
        org.telegram.ui.Components.w8 w8Var = this.f30736n;
        w8Var.r(user);
        TLRPC.User user2 = v41Var.f50573a;
        u7 u7Var = this.f30731a;
        u7Var.e(user2, w8Var);
        u7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
        this.f30732b.k(v41Var.f50573a.first_name);
        this.f30734e.setText(v41Var.f50574b);
        this.f30733c.setVisibility(8);
        this.d.setVisibility(8);
        this.f30735f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f30731a.setOnClickListener(onClickListener);
    }
}
