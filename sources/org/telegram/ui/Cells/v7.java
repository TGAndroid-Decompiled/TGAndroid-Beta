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
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
import org.telegram.ui.s41;
import org.telegram.ui.w41;
public abstract class v7 extends FrameLayout {
    public final t7 f31814a;
    public final u7 f31815b;
    public final TextView f31816c;
    public final TextView d;
    public final TextView f31817e;
    public final TextView f31818f;
    public final Paint h;
    public final org.telegram.ui.Components.t8 f31819n;
    public final fi.h7 f31820r;
    public final org.telegram.ui.ActionBar.e6 f31821s;
    public w41 f31822w;
    public final TLRPC.ChatFull f31823x;
    public boolean f31824y;

    public v7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        this.h = new Paint(1);
        this.f31819n = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f31820r = new fi.h7(null, false);
        this.f31823x = chatFull;
        this.f31821s = e6Var;
        t7 t7Var = new t7(this, context, e6Var);
        this.f31814a = t7Var;
        setClipChildren(false);
        boolean z10 = hd.f24101a0;
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
        addView(t7Var, c8.ja.d(46, 46.0f, i11, f10, 0.0f, f11, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f14 = org.telegram.messenger.k5.f(context, 0);
        ?? j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f31815b = j5Var;
        ns.i(j5Var);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(16);
        j5Var.setMaxLines(1);
        j5Var.setTextColor(-16777216);
        if (hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        TextView textView = new TextView(context);
        this.f31816c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!hd.f24101a0) {
            f14.addView((View) j5Var, c8.ja.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f14.addView(textView, c8.ja.r(-2, -2, 80));
        } else {
            f14.addView(textView, c8.ja.r(-2, -2, 80));
            f14.addView((View) j5Var, c8.ja.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f14, c8.ja.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f31817e = textView2;
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
        this.f31818f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f15 = org.telegram.messenger.k5.f(context, 0);
        if (!hd.f24101a0) {
            f15.addView(textView2, c8.ja.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f15.addView(textView4, c8.ja.r(-2, -2, 16));
            f15.addView(textView3, c8.ja.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f15.addView(textView3, c8.ja.t(-2, -2, 16, 0, 0, 10, 0));
            f15.addView(textView4, c8.ja.r(-2, -2, 16));
            f15.addView(textView2, c8.ja.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f15, c8.ja.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = hd.f24101a0;
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
        addView(linearLayout, c8.ja.d(-1, -2.0f, 0, f12, 0.0f, f13, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.X(j5Var, i12, null);
        org.telegram.ui.ActionBar.q6.U(textView, i12, null);
        int i13 = org.telegram.ui.ActionBar.j6.A6;
        org.telegram.ui.ActionBar.q6.U(textView2, i13, null);
        org.telegram.ui.ActionBar.q6.U(textView3, i13, null);
        org.telegram.ui.ActionBar.q6.U(textView4, i13, null);
        Drawable mutate = context.getDrawable(2131231974).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.x(textView4, mutate, i13, null, mode);
        Drawable mutate2 = context.getDrawable(2131231975).mutate();
        org.telegram.ui.ActionBar.q6.x(textView3, mutate2, i13, null, mode);
        fq fqVar = new fq(null, mutate, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        fqVar.h = intrinsicWidth;
        fqVar.f34674n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(fqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        fq fqVar2 = new fq(null, mutate2, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        fqVar2.h = intrinsicWidth2;
        fqVar2.f34674n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(fqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f31824y) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28850d7, this.f31821s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (hd.f24101a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.i9 getImageView() {
        return this.f31814a;
    }

    public w41 getPostInfo() {
        return this.f31822w;
    }

    public fi.h7 getStoryAvatarParams() {
        return this.f31820r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31820r.g();
    }

    public void setData(s41 s41Var) {
        TLRPC.User user = s41Var.f51098a;
        org.telegram.ui.Components.t8 t8Var = this.f31819n;
        t8Var.r(user);
        TLRPC.User user2 = s41Var.f51098a;
        t7 t7Var = this.f31814a;
        t7Var.f(user2, t8Var);
        t7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
        this.f31815b.k(s41Var.f51098a.first_name);
        this.f31817e.setText(s41Var.f51099b);
        this.f31816c.setVisibility(8);
        this.d.setVisibility(8);
        this.f31818f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f31814a.setOnClickListener(onClickListener);
    }
}
