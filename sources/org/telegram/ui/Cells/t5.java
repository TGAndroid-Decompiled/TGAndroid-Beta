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
import b8.mf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.uq0;
import org.telegram.ui.vq0;
public final class t5 extends FrameLayout {
    public final int f30598a = 0;
    public final org.telegram.ui.Components.k9 f30599b;
    public final View f30600c;
    public final View d;
    public final View f30601e;
    public final Object f30602f;

    public t5(v5 v5Var, Context context) {
        super(context);
        this.f30602f = v5Var;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f30599b = k9Var;
        addView(k9Var, mf.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230867);
        addView(linearLayout, mf.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f30600c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f10;
        f10.setTextSize(1, 13.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setMaxLines(1);
        f10.setGravity(80);
        linearLayout.addView(f10, mf.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.f30601e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, mf.c(-1.0f, -1));
    }

    public void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t5.a(android.graphics.Canvas):void");
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        uq0 uq0Var;
        switch (this.f30598a) {
            case 1:
                vq0 vq0Var = (vq0) this.f30602f;
                float[] fArr = vq0Var.Q;
                if (vq0Var.C == null) {
                    float f11 = vq0Var.P;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.07272727f;
                        vq0Var.P = f12;
                        if (f12 > 1.0f) {
                            vq0Var.P = 1.0f;
                        } else {
                            vq0Var.e();
                        }
                    }
                }
                float interpolation = xq.f40452f.getInterpolation(vq0Var.P) * vq0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f13 = 0.0f;
                if (interpolation != 1.0f && (uq0Var = vq0Var.F) != null) {
                    uq0Var.a(fArr);
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
                vq0Var.c(canvas, 1.0f - interpolation, vq0Var.f50592o - getLeft(), vq0Var.f50593p - getTop(), f13, f10);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30598a) {
            case 0:
                v5 v5Var = (v5) this.f30602f;
                org.telegram.ui.Components.k9 k9Var = this.f30599b;
                if (!k9Var.getImageReceiver().L() || k9Var.getImageReceiver().f21249i1 != 1.0f) {
                    v5Var.f30735e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, k9Var.getMeasuredWidth(), k9Var.getMeasuredHeight(), v5Var.f30735e);
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
        switch (this.f30598a) {
            case 0:
                this.f30601e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public t5(vq0 vq0Var, Context context) {
        super(context);
        this.f30602f = vq0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30600c = frameLayout;
        frameLayout.setOutlineProvider(new cg.p0(24));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f30599b = k9Var;
        frameLayout.addView(k9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(context);
        this.f30601e = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, mf.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, mf.c(-1.0f, -1));
        addView(frameLayout, mf.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
