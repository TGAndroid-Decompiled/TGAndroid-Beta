package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cz;
import org.telegram.ui.Components.n80;
public abstract class g0 extends View {
    public int E;
    public final ImageReceiver F;
    public boolean G;
    public boolean H;
    public final int I;
    public boolean J;
    public final y K;
    public int L;
    public StaticLayout f30629a;
    public String f30630b;
    public String f30631c;
    public String d;
    public int f30632e;
    public int f30633f;
    public int h;
    public int f30634n;
    public n80 f30635r;
    public final n2.o0 f30636s;
    public e0 f30637w;
    public final int f30638x;
    public final org.telegram.ui.ActionBar.h6 f30639y;

    public g0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f30636s = new n2.o0(this);
        this.I = org.telegram.messenger.g0.L(4.0f);
        this.f30638x = i7;
        this.f30639y = h6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.K0 = true;
        imageReceiver.B0 = true;
        imageReceiver.f22658t1 = 300;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29439i6, h6Var);
        int i10 = cz.Y0;
        this.L = i10;
        y a02 = org.telegram.ui.ActionBar.m6.a0(w02, i10, i10);
        this.K = a02;
        a02.setCallback(this);
    }

    public final void a() {
        if (this.f30635r != null) {
            this.f30635r = null;
        }
        this.f30636s.f(true);
        invalidate();
    }

    public final void b(boolean r30, long r31, java.lang.String r33, org.telegram.tgnet.TLObject r34, org.telegram.tgnet.tl.TL_bots.BotInfo r35, java.lang.String r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f30629a;
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
        int width = (getWidth() - this.f30632e) / 2;
        int L = org.telegram.messenger.g0.L(2.0f) + this.E;
        Drawable k10 = org.telegram.ui.ActionBar.m6.f29584q3.k();
        if (k10 != null) {
            k10.setBounds(width, L, this.f30632e + width, this.f30633f + L);
            k10.draw(canvas);
        }
        Point point = org.telegram.messenger.g0.f24010q;
        int i7 = point.x;
        int i10 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i7 = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f30639y;
        if (h6Var != null) {
            drawable = h6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.m6.R0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.u4 u4Var = (org.telegram.ui.ActionBar.u4) drawable;
        u4Var.o((int) getY(), i7, i10);
        u4Var.setBounds(width, 0, this.f30632e + width, this.f30633f);
        u4Var.draw(canvas);
        y yVar = this.K;
        if (yVar != null) {
            int i11 = this.L;
            int i12 = cz.Y0;
            if (i11 != i12) {
                this.L = i12;
                org.telegram.ui.ActionBar.m6.G1(yVar, i12, i12);
            }
            yVar.setBounds(org.telegram.messenger.g0.L(2.0f) + width, org.telegram.messenger.g0.L(2.0f), (this.f30632e + width) - org.telegram.messenger.g0.L(2.0f), this.f30633f - org.telegram.messenger.g0.L(2.0f));
            yVar.draw(canvas);
        }
        int i13 = this.I;
        float f11 = this.E - i13;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.y0(width + i13, i13, this.f30632e - (i13 * 2), f11);
        imageReceiver.h(canvas, null);
        org.telegram.ui.ActionBar.m6.f29544o2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Vc, h6Var));
        org.telegram.ui.ActionBar.m6.f29544o2.linkColor = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Xc, h6Var);
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
        this.f30634n = L3;
        canvas.translate(f12, L3);
        if (this.f30636s.h(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f30629a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f30629a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.g0.L(8.0f) + this.f30633f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z10) {
        this.J = z10;
    }

    public void setDelegate(e0 e0Var) {
        this.f30637w = e0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
