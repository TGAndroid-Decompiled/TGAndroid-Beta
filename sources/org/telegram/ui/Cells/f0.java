package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.az;
import org.telegram.ui.Components.t70;
public abstract class f0 extends View {
    public int E;
    public final ImageReceiver F;
    public boolean G;
    public boolean H;
    public final int I;
    public boolean J;
    public final y K;
    public int L;
    public StaticLayout f29141a;
    public String f29142b;
    public String f29143c;
    public String d;
    public int f29144e;
    public int f29145f;
    public int h;
    public int f29146n;
    public t70 f29147r;
    public final m2.p0 f29148s;
    public d0 f29149w;
    public final int f29150x;
    public final org.telegram.ui.ActionBar.e6 f29151y;

    public f0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29148s = new m2.p0(this);
        this.I = org.telegram.messenger.g0.L(4.0f);
        this.f29150x = i3;
        this.f29151y = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.K0 = true;
        imageReceiver.B0 = true;
        imageReceiver.f21271t1 = 300;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var);
        int i10 = az.Y0;
        this.L = i10;
        y a02 = org.telegram.ui.ActionBar.k6.a0(w02, i10, i10);
        this.K = a02;
        a02.setCallback(this);
    }

    public final void a() {
        if (this.f29147r != null) {
            this.f29147r = null;
        }
        this.f29148s.f(true);
        invalidate();
    }

    public final void b(boolean r30, long r31, java.lang.String r33, org.telegram.tgnet.TLObject r34, org.telegram.tgnet.tl.TL_bots.BotInfo r35, java.lang.String r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f29141a;
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
        int width = (getWidth() - this.f29144e) / 2;
        int L = org.telegram.messenger.g0.L(2.0f) + this.E;
        Drawable l10 = org.telegram.ui.ActionBar.k6.f28118q3.l();
        if (l10 != null) {
            l10.setBounds(width, L, this.f29144e + width, this.f29145f + L);
            l10.draw(canvas);
        }
        Point point = org.telegram.messenger.g0.f22608q;
        int i3 = point.x;
        int i10 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i3 = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f29151y;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) drawable;
        t4Var.p((int) getY(), i3, i10);
        t4Var.setBounds(width, 0, this.f29144e + width, this.f29145f);
        t4Var.draw(canvas);
        y yVar = this.K;
        if (yVar != null) {
            int i11 = this.L;
            int i12 = az.Y0;
            if (i11 != i12) {
                this.L = i12;
                org.telegram.ui.ActionBar.k6.G1(yVar, i12, i12);
            }
            yVar.setBounds(org.telegram.messenger.g0.L(2.0f) + width, org.telegram.messenger.g0.L(2.0f), (this.f29144e + width) - org.telegram.messenger.g0.L(2.0f), this.f29145f - org.telegram.messenger.g0.L(2.0f));
            yVar.draw(canvas);
        }
        int i13 = this.I;
        float f11 = this.E - i13;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.y0(width + i13, i13, this.f29144e - (i13 * 2), f11);
        imageReceiver.h(canvas, null);
        org.telegram.ui.ActionBar.k6.f28077o2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, e6Var));
        org.telegram.ui.ActionBar.k6.f28077o2.linkColor = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, e6Var);
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
        this.f29146n = L3;
        canvas.translate(f12, L3);
        if (this.f29148s.h(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f29141a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f29141a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), org.telegram.messenger.g0.L(8.0f) + this.f29145f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z10) {
        this.J = z10;
    }

    public void setDelegate(d0 d0Var) {
        this.f29149w = d0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
