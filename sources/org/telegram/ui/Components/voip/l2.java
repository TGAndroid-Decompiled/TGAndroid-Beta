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
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.ah0;
public class l2 extends TextView {
    public final int f29987a = 0;
    public final Object f29988b;
    public final Object f29989c;
    public final Object d;

    public l2(n2 n2Var, Activity activity, o1 o1Var) {
        super(activity);
        this.d = n2Var;
        this.f29989c = o1Var;
        this.f29988b = new RectF();
        o1Var.a(this);
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public void c() {
        CharSequence text;
        ha0 ha0Var = (ha0) this.f29989c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        x90 x90Var = new x90(0);
        x90Var.f30901q = AndroidUtilities.dp(3.0f);
        x90Var.f30902r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        x90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, x90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(x90Var.f30903s, x90Var.f30905u, x90Var.f30904t, x90Var.v);
        ((org.telegram.ui.Cells.z) this.f29988b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        ha0Var.f25267y = x90Var;
        ha0Var.k(4.0f);
        int themedColor = ((ah0) this.d).getThemedColor(g6.Ld);
        ha0Var.g(g6.m1(0.85f, themedColor), g6.m1(2.0f, themedColor), g6.m1(3.5f, themedColor), g6.m1(6.0f, themedColor));
        ha0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f29987a) {
            case 0:
                RectF rectF = (RectF) this.f29988b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                n2 n2Var = (n2) this.d;
                float x11 = ((View) n2Var.getParent()).getX() + n2Var.getX() + x10;
                float y3 = ((View) n2Var.getParent()).getY() + n2Var.getY() + ((View) getParent()).getY() + getY();
                o1 o1Var = (o1) this.f29989c;
                o1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), o1Var.b());
                super.onDraw(canvas);
                return;
            default:
                ha0 ha0Var = (ha0) this.f29989c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f29988b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || ha0Var.d()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    ha0Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f29987a) {
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
        switch (this.f29987a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f29988b;
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
        switch (this.f29987a) {
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
        switch (this.f29987a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f29988b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l2(ah0 ah0Var, Context context) {
        super(context);
        this.d = ah0Var;
        org.telegram.ui.Cells.z g02 = g6.g0(g6.m1(0.1f, g6.x0(null, g6.I6, false)), 7, -1);
        this.f29988b = g02;
        ha0 ha0Var = new ha0();
        this.f29989c = ha0Var;
        g02.setCallback(this);
        ha0Var.D = true;
        ha0Var.f25264u = 0.8f;
    }
}
