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
import org.telegram.messenger.m10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.er0;
import org.telegram.ui.fr0;
public final class u5 extends FrameLayout {
    public final int f32105a = 0;
    public final org.telegram.ui.Components.p9 f32106b;
    public final View f32107c;
    public final View d;
    public final View f32108e;
    public final Object f32109f;

    public u5(w5 w5Var, Context context) {
        super(context);
        this.f32109f = w5Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f32106b = p9Var;
        addView(p9Var, c8.na.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230867);
        addView(linearLayout, c8.na.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f32107c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f10 = m10.f(linearLayout, textView, c8.na.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f10;
        f10.setTextSize(1, 13.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setMaxLines(1);
        f10.setGravity(80);
        linearLayout.addView(f10, c8.na.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.f32108e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
        addView(view, c8.na.c(-1.0f, -1));
    }

    public void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u5.a(android.graphics.Canvas):void");
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        er0 er0Var;
        switch (this.f32105a) {
            case 1:
                fr0 fr0Var = (fr0) this.f32109f;
                float[] fArr = fr0Var.Q;
                if (fr0Var.C == null) {
                    float f11 = fr0Var.P;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.07272727f;
                        fr0Var.P = f12;
                        if (f12 > 1.0f) {
                            fr0Var.P = 1.0f;
                        } else {
                            fr0Var.e();
                        }
                    }
                }
                float interpolation = kr.f36858f.getInterpolation(fr0Var.P) * fr0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f13 = 0.0f;
                if (interpolation != 1.0f && (er0Var = fr0Var.F) != null) {
                    er0Var.a(fArr);
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
                fr0Var.c(canvas, 1.0f - interpolation, fr0Var.f47965o - getLeft(), fr0Var.f47966p - getTop(), f13, f10);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32105a) {
            case 0:
                w5 w5Var = (w5) this.f32109f;
                org.telegram.ui.Components.p9 p9Var = this.f32106b;
                if (!p9Var.getImageReceiver().M() || p9Var.getImageReceiver().f22739i1 != 1.0f) {
                    w5Var.f32339e.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, p9Var.getMeasuredWidth(), p9Var.getMeasuredHeight(), w5Var.f32339e);
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
        switch (this.f32105a) {
            case 0:
                this.f32108e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public u5(fr0 fr0Var, Context context) {
        super(context);
        this.f32109f = fr0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32107c = frameLayout;
        frameLayout.setOutlineProvider(new bg.q0(21));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f32106b = p9Var;
        frameLayout.addView(p9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.j4 j4Var = new org.telegram.ui.j4(context);
        this.f32108e = j4Var;
        j4Var.setBackgroundColor(0);
        frameLayout.addView(j4Var, c8.na.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        j4Var.addView(textureView, c8.na.c(-1.0f, -1));
        addView(frameLayout, c8.na.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
