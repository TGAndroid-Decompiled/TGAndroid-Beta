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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
import org.telegram.ui.a51;
import org.telegram.ui.w41;
public abstract class w7 extends FrameLayout {
    public final u7 f30739a;
    public final v7 f30740b;
    public final TextView f30741c;
    public final TextView d;
    public final TextView f30742e;
    public final TextView f30743f;
    public final Paint h;
    public final org.telegram.ui.Components.w8 f30744n;
    public final di.o7 f30745r;
    public final org.telegram.ui.ActionBar.g6 f30746s;
    public a51 f30747w;
    public final TLRPC.ChatFull f30748x;
    public boolean f30749y;

    public w7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        this.h = new Paint(1);
        this.f30744n = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.f30745r = new di.o7(null, false);
        this.f30748x = chatFull;
        this.f30746s = g6Var;
        u7 u7Var = new u7(this, context, g6Var);
        this.f30739a = u7Var;
        setClipChildren(false);
        boolean z9 = id.f23157a0;
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
        ?? l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f30740b = l5Var;
        qs.i(l5Var);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        l5Var.setTextSize(16);
        l5Var.setMaxLines(1);
        l5Var.setTextColor(-16777216);
        if (id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l5Var.setGravity(i10);
        TextView textView = new TextView(context);
        this.f30741c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!id.f23157a0) {
            f14.addView((View) l5Var, c8.ha.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f14.addView(textView, c8.ha.r(-2, -2, 80));
        } else {
            f14.addView(textView, c8.ha.r(-2, -2, 80));
            f14.addView((View) l5Var, c8.ha.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f14, c8.ha.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30742e = textView2;
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
        this.f30743f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f15 = org.telegram.messenger.k5.f(context, 0);
        if (!id.f23157a0) {
            f15.addView(textView2, c8.ha.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f15.addView(textView4, c8.ha.r(-2, -2, 16));
            f15.addView(textView3, c8.ha.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f15.addView(textView3, c8.ha.t(-2, -2, 16, 0, 0, 10, 0));
            f15.addView(textView4, c8.ha.r(-2, -2, 16));
            f15.addView(textView2, c8.ha.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f15, c8.ha.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z10 = id.f23157a0;
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
        int i12 = org.telegram.ui.ActionBar.l6.f27973j5;
        org.telegram.ui.ActionBar.s6.X(l5Var, i12, null);
        org.telegram.ui.ActionBar.s6.U(textView, i12, null);
        int i13 = org.telegram.ui.ActionBar.l6.A6;
        org.telegram.ui.ActionBar.s6.U(textView2, i13, null);
        org.telegram.ui.ActionBar.s6.U(textView3, i13, null);
        org.telegram.ui.ActionBar.s6.U(textView4, i13, null);
        Drawable mutate = context.getDrawable(2131231974).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.s6.x(textView4, mutate, i13, null, mode);
        Drawable mutate2 = context.getDrawable(2131231975).mutate();
        org.telegram.ui.ActionBar.s6.x(textView3, mutate2, i13, null, mode);
        xp xpVar = new xp(null, mutate, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        xpVar.h = intrinsicWidth;
        xpVar.f40449n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(xpVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        xp xpVar2 = new xp(null, mutate2, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        xpVar2.h = intrinsicWidth2;
        xpVar2.f40449n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(xpVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f30749y) {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27866d7, this.f30746s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (id.f23157a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.f30739a;
    }

    public a51 getPostInfo() {
        return this.f30747w;
    }

    public di.o7 getStoryAvatarParams() {
        return this.f30745r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30745r.g();
    }

    public void setData(w41 w41Var) {
        TLRPC.User user = w41Var.f50866a;
        org.telegram.ui.Components.w8 w8Var = this.f30744n;
        w8Var.r(user);
        TLRPC.User user2 = w41Var.f50866a;
        u7 u7Var = this.f30739a;
        u7Var.e(user2, w8Var);
        u7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
        this.f30740b.k(w41Var.f50866a.first_name);
        this.f30742e.setText(w41Var.f50867b);
        this.f30741c.setVisibility(8);
        this.d.setVisibility(8);
        this.f30743f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f30739a.setOnClickListener(onClickListener);
    }
}
