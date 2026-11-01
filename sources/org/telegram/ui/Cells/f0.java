package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.q80;
public abstract class f0 extends View {
    public int D;
    public final ImageReceiver E;
    public boolean F;
    public boolean G;
    public final int H;
    public boolean I;
    public final y J;
    public int K;
    public StaticLayout f21880a;
    public String f21881b;
    public String f21882c;
    public String d;
    public int e;
    public int f21883f;
    public int h;
    public int f21884n;
    public q80 f21885r;
    public final ji.a f21886s;
    public d0 f21887w;
    public final int f21888x;
    public final org.telegram.ui.ActionBar.p6 f21889y;

    public f0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f21886s = new ji.a(this);
        this.H = org.telegram.messenger.i0.L(4.0f);
        this.f21888x = i10;
        this.f21889y = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.J0 = true;
        imageReceiver.A0 = true;
        imageReceiver.f14408s1 = 300;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var);
        int i11 = uz.Y0;
        this.K = i11;
        y a02 = org.telegram.ui.ActionBar.t6.a0(w02, i11, i11);
        this.J = a02;
        a02.setCallback(this);
    }

    public final void a() {
        if (this.f21885r != null) {
            this.f21885r = null;
        }
        this.f21886s.f(true);
        invalidate();
    }

    public final void b(boolean r30, long r31, java.lang.String r33, org.telegram.tgnet.TLObject r34, org.telegram.tgnet.tl.TL_bots.BotInfo r35, java.lang.String r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f21880a;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        float f7;
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.e) / 2;
        int L = org.telegram.messenger.i0.L(2.0f) + this.D;
        Drawable l4 = org.telegram.ui.ActionBar.t6.f21168q3.l();
        if (l4 != null) {
            l4.setBounds(width, L, this.e + width, this.f21883f + L);
            l4.draw(canvas);
        }
        Point point = org.telegram.messenger.i0.f16172q;
        int i10 = point.x;
        int i11 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i10 = view.getMeasuredWidth();
            i11 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.f21889y;
        if (p6Var != null) {
            drawable = p6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.t6.R0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) drawable;
        c5Var.p((int) getY(), i10, i11);
        c5Var.setBounds(width, 0, this.e + width, this.f21883f);
        c5Var.draw(canvas);
        y yVar = this.J;
        if (yVar != null) {
            int i12 = this.K;
            int i13 = uz.Y0;
            if (i12 != i13) {
                this.K = i13;
                org.telegram.ui.ActionBar.t6.G1(yVar, i13, i13);
            }
            yVar.setBounds(org.telegram.messenger.i0.L(2.0f) + width, org.telegram.messenger.i0.L(2.0f), (this.e + width) - org.telegram.messenger.i0.L(2.0f), this.f21883f - org.telegram.messenger.i0.L(2.0f));
            yVar.draw(canvas);
        }
        int i14 = this.H;
        float f10 = this.D - i14;
        ImageReceiver imageReceiver = this.E;
        imageReceiver.y0(width + i14, i14, this.e - (i14 * 2), f10);
        imageReceiver.h(canvas, null);
        org.telegram.ui.ActionBar.t6.f21131o2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, p6Var));
        org.telegram.ui.ActionBar.t6.f21131o2.linkColor = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, p6Var);
        canvas.save();
        if (this.F) {
            f7 = 14.0f;
        } else {
            f7 = 11.0f;
        }
        int L2 = org.telegram.messenger.i0.L(f7) + width;
        this.h = L2;
        float f11 = L2;
        int L3 = org.telegram.messenger.i0.L(11.0f) + L;
        this.f21884n = L3;
        canvas.translate(f11, L3);
        if (this.f21886s.h(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f21880a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f21880a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.messenger.i0.L(8.0f) + this.f21883f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z10) {
        this.I = z10;
    }

    public void setDelegate(d0 d0Var) {
        this.f21887w = d0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
