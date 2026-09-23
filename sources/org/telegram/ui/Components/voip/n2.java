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
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.x80;
import org.telegram.ui.rg0;
public class n2 extends TextView {
    public final int f29082a = 0;
    public final Object f29083b;
    public final Object f29084c;
    public final Object d;

    public n2(p2 p2Var, Activity activity, q1 q1Var) {
        super(activity);
        this.d = p2Var;
        this.f29084c = q1Var;
        this.f29083b = new RectF();
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
        h90 h90Var = (h90) this.f29084c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        x80 x80Var = new x80(0);
        x80Var.f29953q = AndroidUtilities.dp(3.0f);
        x80Var.f29954r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        x80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, x80Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(x80Var.f29955s, x80Var.f29957u, x80Var.f29956t, x80Var.v);
        ((org.telegram.ui.Cells.z) this.f29083b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        h90Var.f24619x = x80Var;
        h90Var.j(4.0f);
        int themedColor = ((rg0) this.d).getThemedColor(h6.Ld);
        h90Var.f(h6.l1(0.85f, themedColor), h6.l1(2.0f, themedColor), h6.l1(3.5f, themedColor), h6.l1(6.0f, themedColor));
        h90Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f29082a) {
            case 0:
                RectF rectF = (RectF) this.f29083b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                p2 p2Var = (p2) this.d;
                float x11 = ((View) p2Var.getParent()).getX() + p2Var.getX() + x10;
                float y3 = ((View) p2Var.getParent()).getY() + p2Var.getY() + ((View) getParent()).getY() + getY();
                q1 q1Var = (q1) this.f29084c;
                q1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), q1Var.b());
                super.onDraw(canvas);
                return;
            default:
                h90 h90Var = (h90) this.f29084c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f29083b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || h90Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    h90Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f29082a) {
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
        switch (this.f29082a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f29083b;
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
        switch (this.f29082a) {
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
        switch (this.f29082a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f29083b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n2(rg0 rg0Var, Context context) {
        super(context);
        this.d = rg0Var;
        org.telegram.ui.Cells.z f02 = h6.f0(h6.l1(0.1f, h6.w0(null, h6.I6, false)), 7, -1);
        this.f29083b = f02;
        h90 h90Var = new h90();
        this.f29084c = h90Var;
        f02.setCallback(this);
        h90Var.C = true;
        h90Var.f24617u = 0.8f;
    }
}
