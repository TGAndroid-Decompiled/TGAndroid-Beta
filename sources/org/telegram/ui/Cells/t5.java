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
import org.telegram.ui.Components.wq;
import org.telegram.ui.hr0;
import org.telegram.ui.ir0;
public final class t5 extends FrameLayout {
    public final int f30537a = 0;
    public final org.telegram.ui.Components.k9 f30538b;
    public final View f30539c;
    public final View d;
    public final View f30540e;
    public final Object f30541f;

    public t5(v5 v5Var, Context context) {
        super(context);
        this.f30541f = v5Var;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f30538b = k9Var;
        addView(k9Var, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230867);
        addView(linearLayout, c8.ha.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f30539c = textView;
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
        this.f30540e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
        addView(view, c8.ha.c(-1.0f, -1));
    }

    public void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t5.a(android.graphics.Canvas):void");
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        hr0 hr0Var;
        switch (this.f30537a) {
            case 1:
                ir0 ir0Var = (ir0) this.f30541f;
                float[] fArr = ir0Var.Q;
                if (ir0Var.C == null) {
                    float f11 = ir0Var.P;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.07272727f;
                        ir0Var.P = f12;
                        if (f12 > 1.0f) {
                            ir0Var.P = 1.0f;
                        } else {
                            ir0Var.e();
                        }
                    }
                }
                float interpolation = wq.f40046f.getInterpolation(ir0Var.P) * ir0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f13 = 0.0f;
                if (interpolation != 1.0f && (hr0Var = ir0Var.F) != null) {
                    hr0Var.a(fArr);
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
                ir0Var.c(canvas, 1.0f - interpolation, ir0Var.f46738o - getLeft(), ir0Var.f46739p - getTop(), f13, f10);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30537a) {
            case 0:
                v5 v5Var = (v5) this.f30541f;
                org.telegram.ui.Components.k9 k9Var = this.f30538b;
                if (!k9Var.getImageReceiver().L() || k9Var.getImageReceiver().f21202h1 != 1.0f) {
                    v5Var.f30656e.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, k9Var.getMeasuredWidth(), k9Var.getMeasuredHeight(), v5Var.f30656e);
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
        switch (this.f30537a) {
            case 0:
                this.f30540e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public t5(ir0 ir0Var, Context context) {
        super(context);
        this.f30541f = ir0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30539c = frameLayout;
        frameLayout.setOutlineProvider(new bg.q0(21));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f30538b = k9Var;
        frameLayout.addView(k9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.j4 j4Var = new org.telegram.ui.j4(context);
        this.f30540e = j4Var;
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
