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
import org.telegram.messenger.i20;
import org.telegram.ui.Components.er;
import org.telegram.ui.cr0;
import org.telegram.ui.dr0;
public final class t5 extends FrameLayout {
    public final int f31674a = 0;
    public final org.telegram.ui.Components.i9 f31675b;
    public final View f31676c;
    public final View d;
    public final View f31677e;
    public final Object f31678f;

    public t5(v5 v5Var, Context context) {
        super(context);
        this.f31678f = v5Var;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f31675b = i9Var;
        addView(i9Var, c8.ja.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230867);
        addView(linearLayout, c8.ja.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.f31676c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView f10 = i20.f(linearLayout, textView, c8.ja.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = f10;
        f10.setTextSize(1, 13.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setMaxLines(1);
        f10.setGravity(80);
        linearLayout.addView(f10, c8.ja.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.f31677e = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
        addView(view, c8.ja.c(-1.0f, -1));
    }

    public void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t5.a(android.graphics.Canvas):void");
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        cr0 cr0Var;
        switch (this.f31674a) {
            case 1:
                dr0 dr0Var = (dr0) this.f31678f;
                float[] fArr = dr0Var.Q;
                if (dr0Var.C == null) {
                    float f11 = dr0Var.P;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.07272727f;
                        dr0Var.P = f12;
                        if (f12 > 1.0f) {
                            dr0Var.P = 1.0f;
                        } else {
                            dr0Var.e();
                        }
                    }
                }
                float interpolation = er.f34420f.getInterpolation(dr0Var.P) * dr0Var.A;
                float measuredHeight = getMeasuredHeight();
                float f13 = 0.0f;
                if (interpolation != 1.0f && (cr0Var = dr0Var.F) != null) {
                    cr0Var.a(fArr);
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
                dr0Var.c(canvas, 1.0f - interpolation, dr0Var.f46470o - getLeft(), dr0Var.f46471p - getTop(), f13, f10);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f31674a) {
            case 0:
                v5 v5Var = (v5) this.f31678f;
                org.telegram.ui.Components.i9 i9Var = this.f31675b;
                if (!i9Var.getImageReceiver().L() || i9Var.getImageReceiver().f22278i1 != 1.0f) {
                    v5Var.f31811e.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.X9, false));
                    canvas.drawRect(0.0f, 0.0f, i9Var.getMeasuredWidth(), i9Var.getMeasuredHeight(), v5Var.f31811e);
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
        switch (this.f31674a) {
            case 0:
                this.f31677e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public t5(dr0 dr0Var, Context context) {
        super(context);
        this.f31678f = dr0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31676c = frameLayout;
        frameLayout.setOutlineProvider(new bg.p0(21));
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f31675b = i9Var;
        frameLayout.addView(i9Var);
        frameLayout.setWillNotDraw(false);
        org.telegram.ui.j4 j4Var = new org.telegram.ui.j4(context);
        this.f31677e = j4Var;
        j4Var.setBackgroundColor(0);
        frameLayout.addView(j4Var, c8.ja.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        j4Var.addView(textureView, c8.ja.c(-1.0f, -1));
        addView(frameLayout, c8.ja.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
