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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.n61;
import org.telegram.ui.r61;
public abstract class a8 extends FrameLayout {
    public final y7 f21680a;
    public final z7 f21681b;
    public final TextView f21682c;
    public final TextView d;
    public final TextView e;
    public final TextView f21683f;
    public final Paint h;
    public final org.telegram.ui.Components.r8 f21684n;
    public final th.t5 f21685r;
    public final org.telegram.ui.ActionBar.p6 f21686s;
    public r61 f21687w;
    public final TLRPC.ChatFull f21688x;
    public boolean f21689y;

    public a8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        this.h = new Paint(1);
        this.f21684n = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f21685r = new th.t5(null, false);
        this.f21688x = chatFull;
        this.f21686s = p6Var;
        y7 y7Var = new y7(this, context, p6Var);
        this.f21680a = y7Var;
        setClipChildren(false);
        boolean z10 = cd.X;
        if (!z10) {
            i10 = 8388611;
        } else {
            i10 = 8388613;
        }
        int i12 = i10 | 16;
        if (!z10) {
            f7 = 12.0f;
        } else {
            f7 = 16.0f;
        }
        if (!z10) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        addView(y7Var, w7.b6.d(46, 46.0f, i12, f7, 0.0f, f10, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f13 = org.telegram.messenger.m5.f(context, 0);
        ?? u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f21681b = u5Var;
        zs.i(u5Var);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(16);
        u5Var.setMaxLines(1);
        u5Var.setTextColor(-16777216);
        if (cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        u5Var.setGravity(i11);
        TextView textView = new TextView(context);
        this.f21682c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (!cd.X) {
            f13.addView((View) u5Var, w7.b6.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f13.addView(textView, w7.b6.r(-2, -2, 80));
        } else {
            f13.addView(textView, w7.b6.r(-2, -2, 80));
            f13.addView((View) u5Var, w7.b6.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        }
        linearLayout.addView(f13, w7.b6.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
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
        this.f21683f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout f14 = org.telegram.messenger.m5.f(context, 0);
        if (!cd.X) {
            f14.addView(textView2, w7.b6.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f14.addView(textView4, w7.b6.r(-2, -2, 16));
            f14.addView(textView3, w7.b6.t(-2, -2, 16, 10, 0, 0, 0));
        } else {
            f14.addView(textView3, w7.b6.t(-2, -2, 16, 0, 0, 10, 0));
            f14.addView(textView4, w7.b6.r(-2, -2, 16));
            f14.addView(textView2, w7.b6.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        }
        linearLayout.addView(f14, w7.b6.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = cd.X;
        if (!z11) {
            f11 = 72.0f;
        } else {
            f11 = 18.0f;
        }
        if (!z11) {
            f12 = 18.0f;
        } else {
            f12 = 72.0f;
        }
        addView(linearLayout, w7.b6.d(-1, -2.0f, 0, f11, 0.0f, f12, 0.0f));
        int i13 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i13, null);
        org.telegram.ui.ActionBar.a7.V(textView, i13, null);
        int i14 = org.telegram.ui.ActionBar.t6.A6;
        org.telegram.ui.ActionBar.a7.V(textView2, i14, null);
        org.telegram.ui.ActionBar.a7.V(textView3, i14, null);
        org.telegram.ui.ActionBar.a7.V(textView4, i14, null);
        Drawable mutate = context.getDrawable(2131231973).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.y(textView4, mutate, i14, null, mode);
        Drawable mutate2 = context.getDrawable(2131231974).mutate();
        org.telegram.ui.ActionBar.a7.y(textView3, mutate2, i14, null, mode);
        eq eqVar = new eq(null, mutate, 0, org.telegram.messenger.i0.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        eqVar.h = intrinsicWidth;
        eqVar.f25843n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(eqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        eq eqVar2 = new eq(null, mutate2, 0, org.telegram.messenger.i0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        eqVar2.h = intrinsicWidth2;
        eqVar2.f25843n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(eqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f21689y) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d7, this.f21686s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (cd.X) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.i0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.f21680a;
    }

    public r61 getPostInfo() {
        return this.f21687w;
    }

    public th.t5 getStoryAvatarParams() {
        return this.f21685r;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21685r.g();
    }

    public void setData(n61 n61Var) {
        TLRPC.User user = n61Var.f39841a;
        org.telegram.ui.Components.r8 r8Var = this.f21684n;
        r8Var.r(user);
        TLRPC.User user2 = n61Var.f39841a;
        y7 y7Var = this.f21680a;
        y7Var.e(user2, r8Var);
        y7Var.setRoundRadius(org.telegram.messenger.i0.L(46.0f) >> 1);
        this.f21681b.k(n61Var.f39841a.first_name);
        this.e.setText(n61Var.f39842b);
        this.f21682c.setVisibility(8);
        this.d.setVisibility(8);
        this.f21683f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.f21680a.setOnClickListener(onClickListener);
    }
}
