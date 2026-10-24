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
public class fd0 extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.y f37305a;
    public final org.telegram.ui.Components.aa0 f37306b;
    public int f37307c;
    public final hg0 d;

    public fd0(hg0 hg0Var, Context context) {
        super(context);
        this.d = hg0Var;
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), 7, -1);
        this.f37305a = g02;
        org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0();
        this.f37306b = aa0Var;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f21817a;
        this.f37307c = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        g02.setCallback(this);
        aa0Var.D = true;
        aa0Var.f24701u = 0.8f;
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
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(0);
        q90Var.f29860q = AndroidUtilities.dp(3.0f);
        q90Var.f29861r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        q90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, q90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(q90Var.f29862s, q90Var.f29864u, q90Var.f29863t, q90Var.v);
        this.f37305a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Components.aa0 aa0Var = this.f37306b;
        aa0Var.f24704y = q90Var;
        aa0Var.k(4.0f);
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.Ld);
        aa0Var.g(org.telegram.ui.ActionBar.k6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.k6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.k6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.k6.o1(6.0f, themedColor));
        aa0Var.l();
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
        this.f37305a.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        boolean a2 = a();
        org.telegram.ui.Components.aa0 aa0Var = this.f37306b;
        if (!a2 && !aa0Var.d()) {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), paddingTop);
        aa0Var.draw(canvas);
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
        org.telegram.ui.Cells.y yVar = this.f37305a;
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
            org.telegram.ui.Cells.y yVar = this.f37305a;
            if (yVar != null && o12 != this.f37307c) {
                org.telegram.ui.ActionBar.k6.E1(yVar, o12, true);
            }
            this.f37307c = o12;
            org.telegram.ui.Components.aa0 aa0Var = this.f37306b;
            if (aa0Var != null) {
                int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.Ld);
                aa0Var.g(org.telegram.ui.ActionBar.k6.o1(0.85f, themedColor), org.telegram.ui.ActionBar.k6.o1(2.0f, themedColor), org.telegram.ui.ActionBar.k6.o1(3.5f, themedColor), org.telegram.ui.ActionBar.k6.o1(6.0f, themedColor));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f37305a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
