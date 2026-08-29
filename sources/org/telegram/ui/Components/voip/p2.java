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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.s80;
import org.telegram.ui.fg0;
public class p2 extends TextView {
    public final int f33925a = 0;
    public final Object f33926b;
    public final Object f33927c;
    public final Object d;

    public p2(r2 r2Var, Activity activity, o1 o1Var) {
        super(activity);
        this.d = r2Var;
        this.f33927c = o1Var;
        this.f33926b = new RectF();
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
        c90 c90Var = (c90) this.f33927c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        s80 s80Var = new s80(0);
        s80Var.f32549q = AndroidUtilities.dp(3.0f);
        s80Var.f32550r = AndroidUtilities.dp(6.0f);
        int length = text.length();
        s80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, s80Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(s80Var.f32551s, s80Var.f32553u, s80Var.f32552t, s80Var.v);
        ((org.telegram.ui.Cells.z) this.f33926b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        c90Var.f27400x = s80Var;
        c90Var.j(4.0f);
        int themedColor = ((fg0) this.d).getThemedColor(g6.Ld);
        c90Var.f(g6.l1(0.85f, themedColor), g6.l1(2.0f, themedColor), g6.l1(3.5f, themedColor), g6.l1(6.0f, themedColor));
        c90Var.k();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.f33925a) {
            case 0:
                RectF rectF = (RectF) this.f33926b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x4 = ((View) getParent()).getX() + getX();
                r2 r2Var = (r2) this.d;
                float x10 = ((View) r2Var.getParent()).getX() + r2Var.getX() + x4;
                float y8 = ((View) r2Var.getParent()).getY() + r2Var.getY() + ((View) getParent()).getY() + getY();
                o1 o1Var = (o1) this.f33927c;
                o1Var.d(x10, y8);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), o1Var.b());
                super.onDraw(canvas);
                return;
            default:
                c90 c90Var = (c90) this.f33927c;
                canvas.save();
                if ((getGravity() & 16) != 0 && getLayout() != null) {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                } else {
                    paddingTop = getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.f33926b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || c90Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    c90Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f33925a) {
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
        switch (this.f33925a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f33926b;
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
        switch (this.f33925a) {
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
        switch (this.f33925a) {
            case 1:
                if (drawable != ((org.telegram.ui.Cells.z) this.f33926b) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public p2(fg0 fg0Var, Context context) {
        super(context);
        this.d = fg0Var;
        org.telegram.ui.Cells.z f02 = g6.f0(g6.l1(0.1f, g6.w0(null, g6.I6, false)), 7, -1);
        this.f33926b = f02;
        c90 c90Var = new c90();
        this.f33927c = c90Var;
        f02.setCallback(this);
        c90Var.C = true;
        c90Var.f27398u = 0.8f;
    }
}
