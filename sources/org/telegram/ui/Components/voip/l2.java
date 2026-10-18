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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.fg0;
public class l2 extends TextView {
    public final int f31598a = 0;
    public final Object f31599b;
    public final Object f31600c;
    public final Object d;

    public l2(n2 n2Var, Activity activity, o1 o1Var) {
        super(activity);
        this.d = n2Var;
        this.f31600c = o1Var;
        this.f31599b = new RectF();
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
        ba0 ba0Var = (ba0) this.f31600c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        r90 r90Var = new r90(0);
        r90Var.f29909q = AndroidUtilities.dp(3.0f);
        r90Var.f29910r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        r90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, r90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(r90Var.f29911s, r90Var.f29913u, r90Var.f29912t, r90Var.v);
        ((org.telegram.ui.Cells.z) this.f31599b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        ba0Var.f24917y = r90Var;
        ba0Var.k(4.0f);
        int themedColor = ((fg0) this.d).getThemedColor(h6.Ld);
        ba0Var.g(h6.m1(0.85f, themedColor), h6.m1(2.0f, themedColor), h6.m1(3.5f, themedColor), h6.m1(6.0f, themedColor));
        ba0Var.l();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f31598a) {
            case 0:
                RectF rectF = (RectF) this.f31599b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                n2 n2Var = (n2) this.d;
                float x11 = ((View) n2Var.getParent()).getX() + n2Var.getX() + x10;
                float y3 = ((View) n2Var.getParent()).getY() + n2Var.getY() + ((View) getParent()).getY() + getY();
                o1 o1Var = (o1) this.f31600c;
                o1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), o1Var.b());
                super.onDraw(canvas);
                return;
            default:
                ba0 ba0Var = (ba0) this.f31600c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f31599b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || ba0Var.d()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    ba0Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f31598a) {
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
        switch (this.f31598a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f31599b;
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
        switch (this.f31598a) {
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
        switch (this.f31598a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f31599b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l2(fg0 fg0Var, Context context) {
        super(context);
        this.d = fg0Var;
        org.telegram.ui.Cells.z g02 = h6.g0(h6.m1(0.1f, h6.x0(null, h6.I6, false)), 7, -1);
        this.f31599b = g02;
        ba0 ba0Var = new ba0();
        this.f31600c = ba0Var;
        g02.setCallback(this);
        ba0Var.D = true;
        ba0Var.f24914u = 0.8f;
    }
}
