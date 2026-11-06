package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.xq;
import org.telegram.ui.dr0;
import org.telegram.ui.er0;
public final class t5 extends FrameLayout {
    public final int f30517a = 0;
    public final org.telegram.ui.Components.l9 f30518b;
    public final View f30519c;
    public final View d;
    public final View f30520e;
    public final Object f30521f;

    public t5(v5 v5Var, Context context) {
        super(context);
        this.f30521f = v5Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f30518b = l9Var;
        addView(l9Var, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230867);
        addView(linearLayout, c8.ha.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f30519c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f10;
        f10.setTextSize(1, 13.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setMaxLines(1);
        f10.setGravity(80);
        linearLayout.addView(f10, c8.ha.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.f30520e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, c8.ha.c(-1.0f, -1));
    }

    public void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t5.a(android.graphics.Canvas):void");
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        dr0 dr0Var;
        switch (this.f30517a) {
            case 1:
                er0 er0Var = (er0) this.f30521f;
                float[] fArr = er0Var.Q;
                if (er0Var.C == null) {
                    float f11 = er0Var.P;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.07272727f;
                        er0Var.P = f12;
                        if (f12 > 1.0f) {
                            er0Var.P = 1.0f;
                        } else {
                            er0Var.e();
                        }
                    }
                }
                float interpolation = xq.f40310f.getInterpolation(er0Var.P) * er0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f13 = 0.0f;
                if (interpolation != 1.0f && (dr0Var = er0Var.F) != null) {
                    dr0Var.a(fArr);
                    canvas.save();
                    float f14 = 1.0f - interpolation;
                    float f15 = fArr[0] * f14;
                    float measuredHeight2 = (fArr[1] * f14) + (getMeasuredHeight() * interpolation);
                    canvas.clipRect(0.0f, f15, getMeasuredWidth(), measuredHeight2);
                    a(canvas);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    f10 = measuredHeight2;
                    f13 = f15;
                } else {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f10 = measuredHeight;
                }
                er0Var.c(canvas, 1.0f - interpolation, er0Var.f45390o - getLeft(), er0Var.f45391p - getTop(), f13, f10);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30517a) {
            case 0:
                v5 v5Var = (v5) this.f30521f;
                org.telegram.ui.Components.l9 l9Var = this.f30518b;
                if (!l9Var.getImageReceiver().L() || l9Var.getImageReceiver().f21194h1 != 1.0f) {
                    v5Var.f30636e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, l9Var.getMeasuredWidth(), l9Var.getMeasuredHeight(), v5Var.f30636e);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30517a) {
            case 0:
                this.f30520e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public t5(er0 er0Var, Context context) {
        super(context);
        this.f30521f = er0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30519c = frameLayout;
        frameLayout.setOutlineProvider(new bg.q0(21));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f30518b = l9Var;
        frameLayout.addView(l9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.j4 j4Var = new org.telegram.ui.j4(context);
        this.f30520e = j4Var;
        j4Var.setBackgroundColor(0);
        frameLayout.addView(j4Var, c8.ha.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        j4Var.addView(textureView, c8.ha.c(-1.0f, -1));
        addView(frameLayout, c8.ha.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
