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
public class fd0 extends TextView implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Cells.y f39331a;
    public final org.telegram.ui.Components.ea0 f39332b;
    public int f39333c;
    public final ig0 d;

    public fd0(ig0 ig0Var, Context context) {
        super(context);
        this.d = ig0Var;
        int i10 = org.telegram.ui.ActionBar.y6.I6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, i10, false)), 7, -1);
        this.f39331a = g02;
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0();
        this.f39332b = ea0Var;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.f22628a;
        this.f39333c = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        g02.setCallback(this);
        ea0Var.D = true;
        ea0Var.f27803u = 0.8f;
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
        org.telegram.ui.Components.t90 t90Var = new org.telegram.ui.Components.t90(0);
        t90Var.f32916q = AndroidUtilities.dp(3.0f);
        t90Var.f32917r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        t90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, t90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(t90Var.f32918s, t90Var.f32920u, t90Var.f32919t, t90Var.v);
        this.f39331a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.ea0 ea0Var = this.f39332b;
        ea0Var.f27806y = t90Var;
        ea0Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.Ld);
        ea0Var.g(org.telegram.ui.ActionBar.y6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.y6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.y6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.y6.o1(6.0f, themedColor));
        ea0Var.l();
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
        this.f39331a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a2 = a();
        org.telegram.ui.Components.ea0 ea0Var = this.f39332b;
        if (!a2 && !ea0Var.d()) {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), paddingTop);
        ea0Var.draw(canvas);
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
        org.telegram.ui.Cells.y yVar = this.f39331a;
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
            org.telegram.ui.Cells.y yVar = this.f39331a;
            if (yVar != null && o12 != this.f39333c) {
                org.telegram.ui.ActionBar.y6.E1(yVar, o12, true);
            }
            this.f39333c = o12;
            org.telegram.ui.Components.ea0 ea0Var = this.f39332b;
            if (ea0Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.Ld);
                ea0Var.g(org.telegram.ui.ActionBar.y6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.y6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.y6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.y6.o1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f39331a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
