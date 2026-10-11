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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.vg0;
public class o2 extends TextView {
    public final int f32234a = 0;
    public final Object f32235b;
    public final Object f32236c;
    public final Object d;

    public o2(q2 q2Var, Activity activity, r1 r1Var) {
        super(activity);
        this.d = q2Var;
        this.f32236c = r1Var;
        this.f32235b = new RectF();
        r1Var.a(this);
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public void c() {
        CharSequence text;
        ia0 ia0Var = (ia0) this.f32236c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        y90 y90Var = new y90(0);
        y90Var.f33209q = AndroidUtilities.dp(3.0f);
        y90Var.f33210r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        y90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, y90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(y90Var.f33211s, y90Var.f33213u, y90Var.f33212t, y90Var.v);
        ((org.telegram.ui.Cells.z) this.f32235b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        ia0Var.f27405y = y90Var;
        ia0Var.k(4.0f);
        int themedColor = ((vg0) this.d).getThemedColor(h6.Ld);
        ia0Var.g(h6.m1(0.85f, themedColor), h6.m1(2.0f, themedColor), h6.m1(3.5f, themedColor), h6.m1(6.0f, themedColor));
        ia0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f32234a) {
            case 0:
                RectF rectF = (RectF) this.f32235b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                q2 q2Var = (q2) this.d;
                float x11 = ((View) q2Var.getParent()).getX() + q2Var.getX() + x10;
                float y3 = ((View) q2Var.getParent()).getY() + q2Var.getY() + ((View) getParent()).getY() + getY();
                r1 r1Var = (r1) this.f32236c;
                r1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), r1Var.b());
                super.onDraw(canvas);
                return;
            default:
                ia0 ia0Var = (ia0) this.f32236c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f32235b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || ia0Var.d()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    ia0Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f32234a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                c();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32234a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f32235b;
                if (b() && motionEvent.getAction() == 0) {
                    zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                    zVar.setState(new int[]{16842910, 16842919});
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
                    zVar.setState(new int[0]);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f32234a) {
            case 1:
                super.setText(charSequence, bufferType);
                c();
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f32234a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f32235b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public o2(vg0 vg0Var, Context context) {
        super(context);
        this.d = vg0Var;
        org.telegram.ui.Cells.z g02 = h6.g0(h6.m1(0.1f, h6.x0(null, h6.I6, false)), 7, -1);
        this.f32235b = g02;
        ia0 ia0Var = new ia0();
        this.f32236c = ia0Var;
        g02.setCallback(this);
        ia0Var.D = true;
        ia0Var.f27402u = 0.8f;
    }
}
