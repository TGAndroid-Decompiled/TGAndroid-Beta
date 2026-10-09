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
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.wg0;
public class n2 extends TextView {
    public final int f32111a = 0;
    public final Object f32112b;
    public final Object f32113c;
    public final Object d;

    public n2(p2 p2Var, Activity activity, q1 q1Var) {
        super(activity);
        this.d = p2Var;
        this.f32113c = q1Var;
        this.f32112b = new RectF();
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
        ia0 ia0Var = (ia0) this.f32113c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        y90 y90Var = new y90(0);
        y90Var.f33177q = AndroidUtilities.dp(3.0f);
        y90Var.f33178r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        y90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, y90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(y90Var.f33179s, y90Var.f33181u, y90Var.f33180t, y90Var.v);
        ((org.telegram.ui.Cells.z) this.f32112b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        ia0Var.f27341y = y90Var;
        ia0Var.k(4.0f);
        int themedColor = ((wg0) this.d).getThemedColor(i6.Ld);
        ia0Var.g(i6.m1(0.85f, themedColor), i6.m1(2.0f, themedColor), i6.m1(3.5f, themedColor), i6.m1(6.0f, themedColor));
        ia0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f32111a) {
            case 0:
                RectF rectF = (RectF) this.f32112b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                p2 p2Var = (p2) this.d;
                float x11 = ((View) p2Var.getParent()).getX() + p2Var.getX() + x10;
                float y3 = ((View) p2Var.getParent()).getY() + p2Var.getY() + ((View) getParent()).getY() + getY();
                q1 q1Var = (q1) this.f32113c;
                q1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), q1Var.b());
                super.onDraw(canvas);
                return;
            default:
                ia0 ia0Var = (ia0) this.f32113c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f32112b).draw(canvas);
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
        switch (this.f32111a) {
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
        switch (this.f32111a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f32112b;
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
        switch (this.f32111a) {
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
        switch (this.f32111a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f32112b) && !super.verifyDrawable(drawable)) {
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
        this.f32112b = g02;
        ia0 ia0Var = new ia0();
        this.f32113c = ia0Var;
        g02.setCallback(this);
        ia0Var.D = true;
        ia0Var.f27338u = 0.8f;
    }
}
