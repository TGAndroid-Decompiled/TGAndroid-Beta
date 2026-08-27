package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.ig0;

public class m2 extends TextView {

    public final int f33719a = 0;

    public final Object f33720b;

    public final Object f33721c;
    public final Object d;

    public m2(o2 o2Var, Activity activity, n1 n1Var) {
        super(activity);
        this.d = o2Var;
        this.f33721c = n1Var;
        this.f33720b = new RectF();
        n1Var.a(this);
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public void c() {
        CharSequence text;
        t80 t80Var = (t80) this.f33721c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        j80 j80Var = new j80(0);
        float fDp = AndroidUtilities.dp(3.0f);
        float fDp2 = AndroidUtilities.dp(6.0f);
        j80Var.f29652q = fDp;
        j80Var.f29653r = fDp2;
        int length = text.length();
        j80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, j80Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(j80Var.f29654s, j80Var.f29656u, j80Var.f29655t, j80Var.v);
        ((org.telegram.ui.Cells.z) this.f33720b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        t80Var.f32711x = j80Var;
        t80Var.j(4.0f);
        int themedColor = ((ig0) this.d).getThemedColor(g6.Ld);
        t80Var.f(g6.l1(0.85f, themedColor), g6.l1(2.0f, themedColor), g6.l1(3.5f, themedColor), g6.l1(6.0f, themedColor));
        t80Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f33719a) {
            case 0:
                RectF rectF = (RectF) this.f33720b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x8 = ((View) getParent()).getX() + getX();
                o2 o2Var = (o2) this.d;
                float x10 = ((View) o2Var.getParent()).getX() + o2Var.getX() + x8;
                float y10 = ((View) o2Var.getParent()).getY() + o2Var.getY() + ((View) getParent()).getY() + getY();
                n1 n1Var = (n1) this.f33721c;
                n1Var.d(x10, y10);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), n1Var.b());
                super.onDraw(canvas);
                break;
            default:
                t80 t80Var = (t80) this.f33721c;
                canvas.save();
                float paddingTop = ((getGravity() & 16) == 0 || getLayout() == null) ? getPaddingTop() : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f33720b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || t80Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    t80Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                }
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f33719a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                c();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f33719a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f33720b;
                if (b() && motionEvent.getAction() == 0) {
                    zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                    zVar.setState(new int[]{16842910, 16842919});
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
                    zVar.setState(new int[0]);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f33719a) {
            case 1:
                super.setText(charSequence, bufferType);
                c();
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f33719a) {
            case 1:
                return drawable == ((org.telegram.ui.Cells.z) this.f33720b) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m2(ig0 ig0Var, Context context) {
        super(context);
        this.d = ig0Var;
        org.telegram.ui.Cells.z zVarF0 = g6.f0(g6.l1(0.1f, g6.w0(null, g6.I6, false)), 7, -1);
        this.f33720b = zVarF0;
        t80 t80Var = new t80();
        this.f33721c = t80Var;
        zVarF0.setCallback(this);
        t80Var.C = true;
        t80Var.f32709u = 0.8f;
    }
}
