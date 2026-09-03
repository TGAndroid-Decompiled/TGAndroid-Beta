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
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.y80;
import org.telegram.ui.pg0;
public class n2 extends TextView {
    public final int f29778a = 0;
    public final Object f29779b;
    public final Object f29780c;
    public final Object d;

    public n2(p2 p2Var, Activity activity, n1 n1Var) {
        super(activity);
        this.d = p2Var;
        this.f29780c = n1Var;
        this.f29779b = new RectF();
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
        j90 j90Var = (j90) this.f29780c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        y80 y80Var = new y80(0);
        y80Var.f30954q = AndroidUtilities.dp(3.0f);
        y80Var.f30955r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        y80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, y80Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(y80Var.f30956s, y80Var.f30958u, y80Var.f30957t, y80Var.v);
        ((org.telegram.ui.Cells.z) this.f29779b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        j90Var.f25923x = y80Var;
        j90Var.j(4.0f);
        int themedColor = ((pg0) this.d).getThemedColor(j6.Ld);
        j90Var.f(j6.l1(0.85f, themedColor), j6.l1(2.0f, themedColor), j6.l1(3.5f, themedColor), j6.l1(6.0f, themedColor));
        j90Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f29778a) {
            case 0:
                RectF rectF = (RectF) this.f29779b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                p2 p2Var = (p2) this.d;
                float x11 = ((View) p2Var.getParent()).getX() + p2Var.getX() + x10;
                float y10 = ((View) p2Var.getParent()).getY() + p2Var.getY() + ((View) getParent()).getY() + getY();
                n1 n1Var = (n1) this.f29780c;
                n1Var.d(x11, y10);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), n1Var.b());
                super.onDraw(canvas);
                return;
            default:
                j90 j90Var = (j90) this.f29780c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f29779b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || j90Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    j90Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f29778a) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                c();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29778a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f29779b;
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
        switch (this.f29778a) {
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
        switch (this.f29778a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f29779b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n2(pg0 pg0Var, Context context) {
        super(context);
        this.d = pg0Var;
        org.telegram.ui.Cells.z f02 = j6.f0(j6.l1(0.1f, j6.w0(null, j6.I6, false)), 7, -1);
        this.f29779b = f02;
        j90 j90Var = new j90();
        this.f29780c = j90Var;
        f02.setCallback(this);
        j90Var.C = true;
        j90Var.f25921u = 0.8f;
    }
}
