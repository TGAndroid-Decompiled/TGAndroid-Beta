package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.HashSet;
public class gb0 extends TextView implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.y f46062a;
    public final org.telegram.ui.Components.a80 f46063b;
    public int f46064c;
    public final fe0 d;

    public gb0(fe0 fe0Var, Context context) {
        super(context);
        this.d = fe0Var;
        int i7 = org.telegram.ui.ActionBar.m6.I6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.x0(null, i7, false)), 7, -1);
        this.f46062a = h02;
        org.telegram.ui.Components.a80 a80Var = new org.telegram.ui.Components.a80();
        this.f46063b = a80Var;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.f28530a;
        this.f46064c = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        h02.setCallback(this);
        a80Var.D = true;
        a80Var.f31790u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28307ze));
    }

    public boolean b() {
        return true;
    }

    public final void c() {
        CharSequence text;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(0);
        r70Var.f37540q = org.telegram.messenger.g0.L(3.0f);
        r70Var.f37541r = org.telegram.messenger.g0.L(6.0f);
        int length = text.length();
        r70Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, r70Var);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(r70Var.f37542s, r70Var.f37544u, r70Var.f37543t, r70Var.v);
        this.f46062a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.a80 a80Var = this.f46063b;
        a80Var.f31793y = r70Var;
        a80Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.m6.f28307ze);
        a80Var.g(org.telegram.ui.ActionBar.m6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.m6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.m6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.m6.r1(6.0f, themedColor));
        a80Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        canvas.save();
        if ((getGravity() & 16) != 0 && getLayout() != null) {
            paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        } else {
            paddingTop = getPaddingTop();
        }
        canvas.translate(getPaddingLeft(), paddingTop);
        this.f46062a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a10 = a();
        org.telegram.ui.Components.a80 a80Var = this.f46063b;
        if (!a10 && !a80Var.d()) {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), paddingTop);
        a80Var.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean b10 = b();
        org.telegram.ui.Cells.y yVar = this.f46062a;
        if (b10 && motionEvent.getAction() == 0) {
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{16842910, 16842919});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
            yVar.setState(new int[0]);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        c();
    }

    @Override
    public final void updateColors() {
        try {
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I6, false));
            org.telegram.ui.Cells.y yVar = this.f46062a;
            if (yVar != null && r12 != this.f46064c) {
                org.telegram.ui.ActionBar.m6.H1(yVar, r12, true);
            }
            this.f46064c = r12;
            org.telegram.ui.Components.a80 a80Var = this.f46063b;
            if (a80Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.m6.f28307ze);
                a80Var.g(org.telegram.ui.ActionBar.m6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.m6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.m6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.m6.r1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f46062a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
