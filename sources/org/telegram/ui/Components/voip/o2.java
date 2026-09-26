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
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.s90;
import org.telegram.ui.qg0;
public class o2 extends TextView {
    public final int f29439a = 0;
    public final Object f29440b;
    public final Object f29441c;
    public final Object d;

    public o2(q2 q2Var, Activity activity, r1 r1Var) {
        super(activity);
        this.d = q2Var;
        this.f29441c = r1Var;
        this.f29440b = new RectF();
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
        s90 s90Var = (s90) this.f29441c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        i90 i90Var = new i90(0);
        i90Var.f25023q = AndroidUtilities.dp(3.0f);
        i90Var.f25024r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        i90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, i90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i90Var.f25025s, i90Var.f25027u, i90Var.f25026t, i90Var.v);
        ((org.telegram.ui.Cells.z) this.f29440b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        s90Var.f28221x = i90Var;
        s90Var.j(4.0f);
        int themedColor = ((qg0) this.d).getThemedColor(h6.Ld);
        s90Var.f(h6.l1(0.85f, themedColor), h6.l1(2.0f, themedColor), h6.l1(3.5f, themedColor), h6.l1(6.0f, themedColor));
        s90Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f29439a) {
            case 0:
                RectF rectF = (RectF) this.f29440b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                q2 q2Var = (q2) this.d;
                float x11 = ((View) q2Var.getParent()).getX() + q2Var.getX() + x10;
                float y3 = ((View) q2Var.getParent()).getY() + q2Var.getY() + ((View) getParent()).getY() + getY();
                r1 r1Var = (r1) this.f29441c;
                r1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), r1Var.b());
                super.onDraw(canvas);
                return;
            default:
                s90 s90Var = (s90) this.f29441c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f29440b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || s90Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    s90Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f29439a) {
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
        switch (this.f29439a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f29440b;
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
        switch (this.f29439a) {
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
        switch (this.f29439a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f29440b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public o2(qg0 qg0Var, Context context) {
        super(context);
        this.d = qg0Var;
        org.telegram.ui.Cells.z f02 = h6.f0(h6.l1(0.1f, h6.w0(null, h6.I6, false)), 7, -1);
        this.f29440b = f02;
        s90 s90Var = new s90();
        this.f29441c = s90Var;
        f02.setCallback(this);
        s90Var.C = true;
        s90Var.f28219u = 0.8f;
    }
}
