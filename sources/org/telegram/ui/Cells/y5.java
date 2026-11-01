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
import org.telegram.messenger.a30;
import org.telegram.ui.Components.gr;
import org.telegram.ui.os0;
import org.telegram.ui.ps0;
public final class y5 extends FrameLayout {
    public final int f23620a = 0;
    public final org.telegram.ui.Components.g9 f23621b;
    public final View f23622c;
    public final View d;
    public final View e;
    public final Object f23623f;

    public y5(a6 a6Var, Context context) {
        super(context);
        this.f23623f = a6Var;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f23621b = g9Var;
        addView(g9Var, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230867);
        addView(linearLayout, w7.b6.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f23622c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f7 = a30.f(linearLayout, textView, w7.b6.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f7;
        f7.setTextSize(1, 13.0f);
        f7.setTextColor(-1);
        f7.setSingleLine(true);
        f7.setEllipsize(truncateAt);
        f7.setMaxLines(1);
        f7.setGravity(80);
        linearLayout.addView(f7, w7.b6.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
        addView(view, w7.b6.c(-1.0f, -1));
    }

    public void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.y5.a(android.graphics.Canvas):void");
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f7;
        os0 os0Var;
        switch (this.f23620a) {
            case 1:
                ps0 ps0Var = (ps0) this.f23623f;
                float[] fArr = ps0Var.Q;
                if (ps0Var.C == null) {
                    float f10 = ps0Var.P;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.07272727f;
                        ps0Var.P = f11;
                        if (f11 > 1.0f) {
                            ps0Var.P = 1.0f;
                        } else {
                            ps0Var.e();
                        }
                    }
                }
                float interpolation = gr.f26523f.getInterpolation(ps0Var.P) * ps0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f12 = 0.0f;
                if (interpolation != 1.0f && (os0Var = ps0Var.F) != null) {
                    os0Var.a(fArr);
                    canvas.save();
                    float f13 = 1.0f - interpolation;
                    float f14 = fArr[0] * f13;
                    float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
                    canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
                    a(canvas);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    f7 = measuredHeight2;
                    f12 = f14;
                } else {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f7 = measuredHeight;
                }
                ps0Var.c(canvas, 1.0f - interpolation, ps0Var.f40601o - getLeft(), ps0Var.f40602p - getTop(), f12, f7);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f23620a) {
            case 0:
                a6 a6Var = (a6) this.f23623f;
                org.telegram.ui.Components.g9 g9Var = this.f23621b;
                if (!g9Var.getImageReceiver().L() || g9Var.getImageReceiver().f14385h1 != 1.0f) {
                    a6Var.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, g9Var.getMeasuredWidth(), g9Var.getMeasuredHeight(), a6Var.e);
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
        switch (this.f23620a) {
            case 0:
                this.e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public y5(ps0 ps0Var, Context context) {
        super(context);
        this.f23623f = ps0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23622c = frameLayout;
        frameLayout.setOutlineProvider(new bi.d2(21));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f23621b = g9Var;
        frameLayout.addView(g9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.k4 k4Var = new org.telegram.ui.k4(context);
        this.e = k4Var;
        k4Var.setBackgroundColor(0);
        frameLayout.addView(k4Var, w7.b6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        k4Var.addView(textureView, w7.b6.c(-1.0f, -1));
        addView(frameLayout, w7.b6.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
