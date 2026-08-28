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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.fg0;
public class m2 extends TextView {
    public final int f33669a = 0;
    public final Object f33670b;
    public final Object f33671c;
    public final Object d;

    public m2(o2 o2Var, Activity activity, n1 n1Var) {
        super(activity);
        this.d = o2Var;
        this.f33671c = n1Var;
        this.f33670b = new RectF();
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
        p80 p80Var = (p80) this.f33671c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        f80 f80Var = new f80(0);
        f80Var.f28336q = AndroidUtilities.dp(3.0f);
        f80Var.f28337r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        f80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, f80Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f80Var.f28338s, f80Var.f28340u, f80Var.f28339t, f80Var.v);
        ((org.telegram.ui.Cells.z) this.f33670b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        p80Var.f31591x = f80Var;
        p80Var.j(4.0f);
        int themedColor = ((fg0) this.d).getThemedColor(f6.Ld);
        p80Var.f(f6.l1(0.85f, themedColor), f6.l1(2.0f, themedColor), f6.l1(3.5f, themedColor), f6.l1(6.0f, themedColor));
        p80Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f33669a) {
            case 0:
                RectF rectF = (RectF) this.f33670b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                o2 o2Var = (o2) this.d;
                float x11 = ((View) o2Var.getParent()).getX() + o2Var.getX() + x10;
                float y10 = ((View) o2Var.getParent()).getY() + o2Var.getY() + ((View) getParent()).getY() + getY();
                n1 n1Var = (n1) this.f33671c;
                n1Var.d(x11, y10);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), n1Var.b());
                super.onDraw(canvas);
                return;
            default:
                p80 p80Var = (p80) this.f33671c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f33670b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || p80Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    p80Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f33669a) {
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                c();
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f33669a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f33670b;
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
        switch (this.f33669a) {
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
        switch (this.f33669a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f33670b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m2(fg0 fg0Var, Context context) {
        super(context);
        this.d = fg0Var;
        org.telegram.ui.Cells.z f02 = f6.f0(f6.l1(0.1f, f6.w0(null, f6.I6, false)), 7, -1);
        this.f33670b = f02;
        p80 p80Var = new p80();
        this.f33671c = p80Var;
        f02.setCallback(this);
        p80Var.C = true;
        p80Var.f31589u = 0.8f;
    }
}
