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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.xg0;
public class m2 extends TextView {
    public final int f28278a = 0;
    public final Object f28279b;
    public final Object f28280c;
    public final Object d;

    public m2(o2 o2Var, Activity activity, p1 p1Var) {
        super(activity);
        this.d = o2Var;
        this.f28280c = p1Var;
        this.f28279b = new RectF();
        p1Var.a(this);
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public void c() {
        CharSequence text;
        q90 q90Var = (q90) this.f28280c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        g90 g90Var = new g90(0);
        g90Var.f23306q = AndroidUtilities.dp(3.0f);
        g90Var.f23307r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        g90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, g90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(g90Var.f23308s, g90Var.f23310u, g90Var.f23309t, g90Var.v);
        ((org.telegram.ui.Cells.z) this.f28279b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        q90Var.f26364x = g90Var;
        q90Var.j(4.0f);
        int themedColor = ((xg0) this.d).getThemedColor(j6.Ld);
        q90Var.f(j6.l1(0.85f, themedColor), j6.l1(2.0f, themedColor), j6.l1(3.5f, themedColor), j6.l1(6.0f, themedColor));
        q90Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f28278a) {
            case 0:
                RectF rectF = (RectF) this.f28279b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                o2 o2Var = (o2) this.d;
                float x11 = ((View) o2Var.getParent()).getX() + o2Var.getX() + x10;
                float y3 = ((View) o2Var.getParent()).getY() + o2Var.getY() + ((View) getParent()).getY() + getY();
                p1 p1Var = (p1) this.f28280c;
                p1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), p1Var.b());
                super.onDraw(canvas);
                return;
            default:
                q90 q90Var = (q90) this.f28280c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f28279b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || q90Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    q90Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f28278a) {
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
        switch (this.f28278a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f28279b;
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
        switch (this.f28278a) {
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
        switch (this.f28278a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f28279b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m2(xg0 xg0Var, Context context) {
        super(context);
        this.d = xg0Var;
        org.telegram.ui.Cells.z f02 = j6.f0(j6.l1(0.1f, j6.w0(null, j6.I6, false)), 7, -1);
        this.f28279b = f02;
        q90 q90Var = new q90();
        this.f28280c = q90Var;
        f02.setCallback(this);
        q90Var.C = true;
        q90Var.f26362u = 0.8f;
    }
}
