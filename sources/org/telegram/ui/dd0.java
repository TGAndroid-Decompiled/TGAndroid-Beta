package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public class dd0 extends TextView implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Cells.y f38840a;
    public final org.telegram.ui.Components.da0 f38841b;
    public int f38842c;
    public final gg0 d;

    public dd0(gg0 gg0Var, Context context) {
        super(context);
        this.d = gg0Var;
        int i10 = org.telegram.ui.ActionBar.y6.I6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, i10, false)), 7, -1);
        this.f38840a = g02;
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0();
        this.f38841b = da0Var;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.f22627a;
        this.f38842c = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        g02.setCallback(this);
        da0Var.D = true;
        da0Var.f27478u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ld));
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
        org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(0);
        s90Var.f32489q = AndroidUtilities.dp(3.0f);
        s90Var.f32490r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        s90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, s90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(s90Var.f32491s, s90Var.f32493u, s90Var.f32492t, s90Var.v);
        this.f38840a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.da0 da0Var = this.f38841b;
        da0Var.f27481y = s90Var;
        da0Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.Ld);
        da0Var.g(org.telegram.ui.ActionBar.y6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.y6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.y6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.y6.o1(6.0f, themedColor));
        da0Var.l();
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
        this.f38840a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a2 = a();
        org.telegram.ui.Components.da0 da0Var = this.f38841b;
        if (!a2 && !da0Var.d()) {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), paddingTop);
        da0Var.draw(canvas);
        canvas.restore();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean b10 = b();
        org.telegram.ui.Cells.y yVar = this.f38840a;
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
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I6, false));
            org.telegram.ui.Cells.y yVar = this.f38840a;
            if (yVar != null && o12 != this.f38842c) {
                org.telegram.ui.ActionBar.y6.E1(yVar, o12, true);
            }
            this.f38842c = o12;
            org.telegram.ui.Components.da0 da0Var = this.f38841b;
            if (da0Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.Ld);
                da0Var.g(org.telegram.ui.ActionBar.y6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.y6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.y6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.y6.o1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f38840a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
