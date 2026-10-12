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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.xg0;
public class o2 extends TextView {
    public final int f31855a = 0;
    public final Object f31856b;
    public final Object f31857c;
    public final Object d;

    public o2(q2 q2Var, Activity activity, r1 r1Var) {
        super(activity);
        this.d = q2Var;
        this.f31857c = r1Var;
        this.f31856b = new RectF();
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
        ma0 ma0Var = (ma0) this.f31857c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        ca0 ca0Var = new ca0(0);
        ca0Var.f24901q = AndroidUtilities.dp(3.0f);
        ca0Var.f24902r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        ca0Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, ca0Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(ca0Var.f24903s, ca0Var.f24905u, ca0Var.f24904t, ca0Var.v);
        ((org.telegram.ui.Cells.z) this.f31856b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        ma0Var.f28482y = ca0Var;
        ma0Var.k(4.0f);
        int themedColor = ((xg0) this.d).getThemedColor(h6.Ld);
        ma0Var.g(h6.m1(0.85f, themedColor), h6.m1(2.0f, themedColor), h6.m1(3.5f, themedColor), h6.m1(6.0f, themedColor));
        ma0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f31855a) {
            case 0:
                RectF rectF = (RectF) this.f31856b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                q2 q2Var = (q2) this.d;
                float x11 = ((View) q2Var.getParent()).getX() + q2Var.getX() + x10;
                float y3 = ((View) q2Var.getParent()).getY() + q2Var.getY() + ((View) getParent()).getY() + getY();
                r1 r1Var = (r1) this.f31857c;
                r1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), r1Var.b());
                super.onDraw(canvas);
                return;
            default:
                ma0 ma0Var = (ma0) this.f31857c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f31856b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || ma0Var.d()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    ma0Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f31855a) {
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
        switch (this.f31855a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f31856b;
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
        switch (this.f31855a) {
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
        switch (this.f31855a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f31856b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public o2(xg0 xg0Var, Context context) {
        super(context);
        this.d = xg0Var;
        org.telegram.ui.Cells.z g02 = h6.g0(h6.m1(0.1f, h6.x0(null, h6.I6, false)), 7, -1);
        this.f31856b = g02;
        ma0 ma0Var = new ma0();
        this.f31857c = ma0Var;
        g02.setCallback(this);
        ma0Var.D = true;
        ma0Var.f28479u = 0.8f;
    }
}
