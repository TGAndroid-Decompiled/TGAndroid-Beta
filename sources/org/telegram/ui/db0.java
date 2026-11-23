package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.HashSet;
public class db0 extends TextView implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.y f47024a;
    public final org.telegram.ui.Components.n80 f47025b;
    public int f47026c;
    public final de0 d;

    public db0(de0 de0Var, Context context) {
        super(context);
        this.d = de0Var;
        int i7 = org.telegram.ui.ActionBar.n6.I6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.x0(null, i7, false)), 7, -1);
        this.f47024a = h02;
        org.telegram.ui.Components.n80 n80Var = new org.telegram.ui.Components.n80();
        this.f47025b = n80Var;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30163a;
        this.f47026c = org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        h02.setCallback(this);
        n80Var.D = true;
        n80Var.f37727u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ce));
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
        org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(0);
        e80Var.f34640q = org.telegram.messenger.g0.L(3.0f);
        e80Var.f34641r = org.telegram.messenger.g0.L(6.0f);
        int length = text.length();
        e80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, e80Var);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(e80Var.f34642s, e80Var.f34644u, e80Var.f34643t, e80Var.v);
        this.f47024a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.n80 n80Var = this.f47025b;
        n80Var.f37730y = e80Var;
        n80Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.n6.Ce);
        n80Var.g(org.telegram.ui.ActionBar.n6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.n6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.n6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.n6.r1(6.0f, themedColor));
        n80Var.l();
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
        this.f47024a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a10 = a();
        org.telegram.ui.Components.n80 n80Var = this.f47025b;
        if (!a10 && !n80Var.d()) {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), paddingTop);
        n80Var.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean b10 = b();
        org.telegram.ui.Cells.y yVar = this.f47024a;
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
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I6, false));
            org.telegram.ui.Cells.y yVar = this.f47024a;
            if (yVar != null && r12 != this.f47026c) {
                org.telegram.ui.ActionBar.n6.H1(yVar, r12, true);
            }
            this.f47026c = r12;
            org.telegram.ui.Components.n80 n80Var = this.f47025b;
            if (n80Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.n6.Ce);
                n80Var.g(org.telegram.ui.ActionBar.n6.r1(0.85f, themedColor), org.telegram.ui.ActionBar.n6.r1(2.0f, themedColor), org.telegram.ui.ActionBar.n6.r1(3.5f, themedColor), org.telegram.ui.ActionBar.n6.r1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f47024a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
