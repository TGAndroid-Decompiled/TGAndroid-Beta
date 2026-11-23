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
import org.telegram.messenger.o10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.er0;
import org.telegram.ui.fr0;
public final class v5 extends FrameLayout {
    public final int f32202a = 0;
    public final org.telegram.ui.Components.q9 f32203b;
    public final View f32204c;
    public final View d;
    public final View f32205e;
    public final Object f32206f;

    public v5(x5 x5Var, Context context) {
        super(context);
        this.f32206f = x5Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f32203b = q9Var;
        addView(q9Var, c8.ma.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230867);
        addView(linearLayout, c8.ma.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f32204c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f10 = o10.f(linearLayout, textView, c8.ma.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f10;
        f10.setTextSize(1, 13.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setMaxLines(1);
        f10.setGravity(80);
        linearLayout.addView(f10, c8.ma.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.f32205e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
        addView(view, c8.ma.c(-1.0f, -1));
    }

    public void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v5.a(android.graphics.Canvas):void");
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        er0 er0Var;
        switch (this.f32202a) {
            case 1:
                fr0 fr0Var = (fr0) this.f32206f;
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
                float interpolation = nr.f37961f.getInterpolation(fr0Var.P) * fr0Var.A;
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
                fr0Var.c(canvas, 1.0f - interpolation, fr0Var.f47833o - getLeft(), fr0Var.f47834p - getTop(), f13, f10);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32202a) {
            case 0:
                x5 x5Var = (x5) this.f32206f;
                org.telegram.ui.Components.q9 q9Var = this.f32203b;
                if (!q9Var.getImageReceiver().L() || q9Var.getImageReceiver().f22672i1 != 1.0f) {
                    x5Var.f32346e.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, q9Var.getMeasuredWidth(), q9Var.getMeasuredHeight(), x5Var.f32346e);
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
        switch (this.f32202a) {
            case 0:
                this.f32205e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public v5(fr0 fr0Var, Context context) {
        super(context);
        this.f32206f = fr0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32204c = frameLayout;
        frameLayout.setOutlineProvider(new bg.q0(21));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f32203b = q9Var;
        frameLayout.addView(q9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.j4 j4Var = new org.telegram.ui.j4(context);
        this.f32205e = j4Var;
        j4Var.setBackgroundColor(0);
        frameLayout.addView(j4Var, c8.ma.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        j4Var.addView(textureView, c8.ma.c(-1.0f, -1));
        addView(frameLayout, c8.ma.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
