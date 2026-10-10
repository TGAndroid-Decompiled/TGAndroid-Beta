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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.z90;
import org.telegram.ui.wg0;
public class n2 extends TextView {
    public final int f32176a = 0;
    public final Object f32177b;
    public final Object f32178c;
    public final Object d;

    public n2(p2 p2Var, Activity activity, q1 q1Var) {
        super(activity);
        this.d = p2Var;
        this.f32178c = q1Var;
        this.f32177b = new RectF();
        q1Var.a(this);
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public void c() {
        CharSequence text;
        ja0 ja0Var = (ja0) this.f32178c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        z90 z90Var = new z90(0);
        z90Var.f33555q = AndroidUtilities.dp(3.0f);
        z90Var.f33556r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        z90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, z90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(z90Var.f33557s, z90Var.f33559u, z90Var.f33558t, z90Var.v);
        ((org.telegram.ui.Cells.z) this.f32177b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        ja0Var.f27652y = z90Var;
        ja0Var.k(4.0f);
        int themedColor = ((wg0) this.d).getThemedColor(i6.Ld);
        ja0Var.g(i6.m1(0.85f, themedColor), i6.m1(2.0f, themedColor), i6.m1(3.5f, themedColor), i6.m1(6.0f, themedColor));
        ja0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f32176a) {
            case 0:
                RectF rectF = (RectF) this.f32177b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                p2 p2Var = (p2) this.d;
                float x11 = ((View) p2Var.getParent()).getX() + p2Var.getX() + x10;
                float y3 = ((View) p2Var.getParent()).getY() + p2Var.getY() + ((View) getParent()).getY() + getY();
                q1 q1Var = (q1) this.f32178c;
                q1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), q1Var.b());
                super.onDraw(canvas);
                return;
            default:
                ja0 ja0Var = (ja0) this.f32178c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f32177b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || ja0Var.d()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    ja0Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f32176a) {
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
        switch (this.f32176a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f32177b;
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
        switch (this.f32176a) {
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
        switch (this.f32176a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f32177b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n2(wg0 wg0Var, Context context) {
        super(context);
        this.d = wg0Var;
        org.telegram.ui.Cells.z g02 = i6.g0(i6.m1(0.1f, i6.x0(null, i6.I6, false)), 7, -1);
        this.f32177b = g02;
        ja0 ja0Var = new ja0();
        this.f32178c = ja0Var;
        g02.setCallback(this);
        ja0Var.D = true;
        ja0Var.f27649u = 0.8f;
    }
}
