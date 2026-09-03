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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.z80;
import org.telegram.ui.og0;
public class o2 extends TextView {
    public final int f32243a = 0;
    public final Object f32244b;
    public final Object f32245c;
    public final Object d;

    public o2(q2 q2Var, Activity activity, o1 o1Var) {
        super(activity);
        this.d = q2Var;
        this.f32245c = o1Var;
        this.f32244b = new RectF();
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
        k90 k90Var = (k90) this.f32245c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        z80 z80Var = new z80(0);
        z80Var.f33867q = AndroidUtilities.dp(3.0f);
        z80Var.f33868r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        z80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, z80Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(z80Var.f33869s, z80Var.f33871u, z80Var.f33870t, z80Var.v);
        ((org.telegram.ui.Cells.z) this.f32244b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        k90Var.f28370x = z80Var;
        k90Var.j(4.0f);
        int themedColor = ((og0) this.d).getThemedColor(k6.Ld);
        k90Var.f(k6.l1(0.85f, themedColor), k6.l1(2.0f, themedColor), k6.l1(3.5f, themedColor), k6.l1(6.0f, themedColor));
        k90Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f32243a) {
            case 0:
                RectF rectF = (RectF) this.f32244b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                q2 q2Var = (q2) this.d;
                float x11 = ((View) q2Var.getParent()).getX() + q2Var.getX() + x10;
                float y10 = ((View) q2Var.getParent()).getY() + q2Var.getY() + ((View) getParent()).getY() + getY();
                o1 o1Var = (o1) this.f32245c;
                o1Var.d(x11, y10);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), o1Var.b());
                super.onDraw(canvas);
                return;
            default:
                k90 k90Var = (k90) this.f32245c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f32244b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || k90Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    k90Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f32243a) {
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
        switch (this.f32243a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f32244b;
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
        switch (this.f32243a) {
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
        switch (this.f32243a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f32244b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public o2(og0 og0Var, Context context) {
        super(context);
        this.d = og0Var;
        org.telegram.ui.Cells.z f02 = k6.f0(k6.l1(0.1f, k6.w0(null, k6.I6, false)), 7, -1);
        this.f32244b = f02;
        k90 k90Var = new k90();
        this.f32245c = k90Var;
        f02.setCallback(this);
        k90Var.C = true;
        k90Var.f28368u = 0.8f;
    }
}
