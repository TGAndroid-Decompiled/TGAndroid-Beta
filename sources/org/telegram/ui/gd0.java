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
public class gd0 extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.y f37576a;
    public final org.telegram.ui.Components.ca0 f37577b;
    public int f37578c;
    public final ig0 d;

    public gd0(ig0 ig0Var, Context context) {
        super(context);
        this.d = ig0Var;
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), 7, -1);
        this.f37576a = g02;
        org.telegram.ui.Components.ca0 ca0Var = new org.telegram.ui.Components.ca0();
        this.f37577b = ca0Var;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f21816a;
        this.f37578c = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        g02.setCallback(this);
        ca0Var.D = true;
        ca0Var.f25295u = 0.8f;
    }

    public boolean a() {
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ld));
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
        s90Var.f30435q = AndroidUtilities.dp(3.0f);
        s90Var.f30436r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        s90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, s90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(s90Var.f30437s, s90Var.f30439u, s90Var.f30438t, s90Var.v);
        this.f37576a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.ca0 ca0Var = this.f37577b;
        ca0Var.f25298y = s90Var;
        ca0Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.Ld);
        ca0Var.g(org.telegram.ui.ActionBar.k6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.k6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.k6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.k6.o1(6.0f, themedColor));
        ca0Var.l();
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
        this.f37576a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a2 = a();
        org.telegram.ui.Components.ca0 ca0Var = this.f37577b;
        if (!a2 && !ca0Var.d()) {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), paddingTop);
        ca0Var.draw(canvas);
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
        org.telegram.ui.Cells.y yVar = this.f37576a;
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
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I6, false));
            org.telegram.ui.Cells.y yVar = this.f37576a;
            if (yVar != null && o12 != this.f37578c) {
                org.telegram.ui.ActionBar.k6.E1(yVar, o12, true);
            }
            this.f37578c = o12;
            org.telegram.ui.Components.ca0 ca0Var = this.f37577b;
            if (ca0Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.Ld);
                ca0Var.g(org.telegram.ui.ActionBar.k6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.k6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.k6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.k6.o1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f37576a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
