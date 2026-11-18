package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.l80;
public abstract class g0 extends View {
    public int E;
    public final ImageReceiver F;
    public boolean G;
    public boolean H;
    public final int I;
    public boolean J;
    public final y K;
    public int L;
    public StaticLayout f30632a;
    public String f30633b;
    public String f30634c;
    public String d;
    public int f30635e;
    public int f30636f;
    public int h;
    public int f30637n;
    public l80 f30638r;
    public final n2.o0 f30639s;
    public e0 f30640w;
    public final int f30641x;
    public final org.telegram.ui.ActionBar.i6 f30642y;

    public g0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30639s = new n2.o0(this);
        this.I = org.telegram.messenger.g0.L(4.0f);
        this.f30641x = i7;
        this.f30642y = i6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.K0 = true;
        imageReceiver.B0 = true;
        imageReceiver.f22663t1 = 300;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29486i6, i6Var);
        int i10 = bz.Y0;
        this.L = i10;
        y a02 = org.telegram.ui.ActionBar.n6.a0(w02, i10, i10);
        this.K = a02;
        a02.setCallback(this);
    }

    public final void a() {
        if (this.f30638r != null) {
            this.f30638r = null;
        }
        this.f30639s.f(true);
        invalidate();
    }

    public final void b(boolean r30, long r31, java.lang.String r33, org.telegram.tgnet.TLObject r34, org.telegram.tgnet.tl.TL_bots.BotInfo r35, java.lang.String r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f30632a;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        float f10;
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.f30635e) / 2;
        int L = org.telegram.messenger.g0.L(2.0f) + this.E;
        Drawable k10 = org.telegram.ui.ActionBar.n6.f29631q3.k();
        if (k10 != null) {
            k10.setBounds(width, L, this.f30635e + width, this.f30636f + L);
            k10.draw(canvas);
        }
        Point point = org.telegram.messenger.g0.f24118q;
        int i7 = point.x;
        int i10 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i7 = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f30642y;
        if (i6Var != null) {
            drawable = i6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.n6.R0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.v4 v4Var = (org.telegram.ui.ActionBar.v4) drawable;
        v4Var.o((int) getY(), i7, i10);
        v4Var.setBounds(width, 0, this.f30635e + width, this.f30636f);
        v4Var.draw(canvas);
        y yVar = this.K;
        if (yVar != null) {
            int i11 = this.L;
            int i12 = bz.Y0;
            if (i11 != i12) {
                this.L = i12;
                org.telegram.ui.ActionBar.n6.G1(yVar, i12, i12);
            }
            yVar.setBounds(org.telegram.messenger.g0.L(2.0f) + width, org.telegram.messenger.g0.L(2.0f), (this.f30635e + width) - org.telegram.messenger.g0.L(2.0f), this.f30636f - org.telegram.messenger.g0.L(2.0f));
            yVar.draw(canvas);
        }
        int i13 = this.I;
        float f11 = this.E - i13;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.y0(width + i13, i13, this.f30635e - (i13 * 2), f11);
        imageReceiver.h(canvas, null);
        org.telegram.ui.ActionBar.n6.f29591o2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Vc, i6Var));
        org.telegram.ui.ActionBar.n6.f29591o2.linkColor = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xc, i6Var);
        canvas.save();
        if (this.G) {
            f10 = 14.0f;
        } else {
            f10 = 11.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f10) + width;
        this.h = L2;
        float f12 = L2;
        int L3 = org.telegram.messenger.g0.L(11.0f) + L;
        this.f30637n = L3;
        canvas.translate(f12, L3);
        if (this.f30639s.h(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f30632a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f30632a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.g0.L(8.0f) + this.f30636f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z10) {
        this.J = z10;
    }

    public void setDelegate(e0 e0Var) {
        this.f30640w = e0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
