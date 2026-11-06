package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.x70;
public abstract class f0 extends View {
    public int D;
    public final ImageReceiver E;
    public boolean F;
    public boolean G;
    public final int H;
    public boolean I;
    public final y J;
    public int K;
    public StaticLayout f29084a;
    public String f29085b;
    public String f29086c;
    public String d;
    public int f29087e;
    public int f29088f;
    public int h;
    public int f29089n;
    public x70 f29090r;
    public final n2.n0 f29091s;
    public d0 f29092w;
    public final int f29093x;
    public final org.telegram.ui.ActionBar.f6 f29094y;

    public f0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29091s = new n2.n0(this);
        this.H = org.telegram.messenger.g0.L(4.0f);
        this.f29093x = i7;
        this.f29094y = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.J0 = true;
        imageReceiver.A0 = true;
        imageReceiver.f21216s1 = 300;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27941i6, f6Var);
        int i10 = iz.Y0;
        this.K = i10;
        y a02 = org.telegram.ui.ActionBar.k6.a0(w02, i10, i10);
        this.J = a02;
        a02.setCallback(this);
    }

    public final void a() {
        if (this.f29090r != null) {
            this.f29090r = null;
        }
        this.f29091s.f(true);
        invalidate();
    }

    public final void b(boolean r30, long r31, java.lang.String r33, org.telegram.tgnet.TLObject r34, org.telegram.tgnet.tl.TL_bots.BotInfo r35, java.lang.String r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f29084a;
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
        float f10;
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.f29087e) / 2;
        int L = org.telegram.messenger.g0.L(2.0f) + this.D;
        Drawable l10 = org.telegram.ui.ActionBar.k6.f28086q3.l();
        if (l10 != null) {
            l10.setBounds(width, L, this.f29087e + width, this.f29088f + L);
            l10.draw(canvas);
        }
        Point point = org.telegram.messenger.g0.f22544q;
        int i7 = point.x;
        int i10 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i7 = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f29094y;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) drawable;
        t4Var.p((int) getY(), i7, i10);
        t4Var.setBounds(width, 0, this.f29087e + width, this.f29088f);
        t4Var.draw(canvas);
        y yVar = this.J;
        if (yVar != null) {
            int i11 = this.K;
            int i12 = iz.Y0;
            if (i11 != i12) {
                this.K = i12;
                org.telegram.ui.ActionBar.k6.G1(yVar, i12, i12);
            }
            yVar.setBounds(org.telegram.messenger.g0.L(2.0f) + width, org.telegram.messenger.g0.L(2.0f), (this.f29087e + width) - org.telegram.messenger.g0.L(2.0f), this.f29088f - org.telegram.messenger.g0.L(2.0f));
            yVar.draw(canvas);
        }
        int i13 = this.H;
        float f11 = this.D - i13;
        ImageReceiver imageReceiver = this.E;
        imageReceiver.y0(width + i13, i13, this.f29087e - (i13 * 2), f11);
        imageReceiver.h(canvas, null);
        org.telegram.ui.ActionBar.k6.f28046o2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, f6Var));
        org.telegram.ui.ActionBar.k6.f28046o2.linkColor = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, f6Var);
        canvas.save();
        if (this.F) {
            f10 = 14.0f;
        } else {
            f10 = 11.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f10) + width;
        this.h = L2;
        float f12 = L2;
        int L3 = org.telegram.messenger.g0.L(11.0f) + L;
        this.f29089n = L3;
        canvas.translate(f12, L3);
        if (this.f29091s.h(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f29084a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f29084a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.g0.L(8.0f) + this.f29088f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z9) {
        this.I = z9;
    }

    public void setDelegate(d0 d0Var) {
        this.f29092w = d0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
