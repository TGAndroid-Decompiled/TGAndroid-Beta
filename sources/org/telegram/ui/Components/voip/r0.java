package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
public final class r0 extends ViewGroup {
    public int E;
    public boolean F;
    public final s0 G;
    public final long f41276a;
    public boolean f41277b;
    public long f41278c;
    public final ImageReceiver d;
    public final TextView f41279e;
    public final ai.a2 f41280f;
    public final Paint h;
    public final d6 f41281n;
    public final d6 f41282r;
    public final RectF f41283s;
    public final Path f41284w;
    public int f41285x;
    public int f41286y;

    public r0(s0 s0Var, Context context, long j3) {
        super(context);
        this.G = s0Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        Paint paint = new Paint(1);
        this.h = paint;
        nr nrVar = nr.h;
        this.f41281n = new d6(this, 0L, 320L, nrVar);
        this.f41282r = new d6(this, 0L, 320L, nrVar);
        this.f41283s = new RectF();
        this.f41284w = new Path();
        this.f41276a = j3;
        TextView textView = new TextView(context);
        this.f41279e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setIncludeFontPadding(false);
        addView(textView);
        ai.a2 a2Var = new ai.a2(textView);
        this.f41280f = a2Var;
        a2Var.c(-9717249, -1, true);
        imageReceiver.J0(org.telegram.messenger.g0.L(11.0f));
        paint.setColor(-13946053);
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float e10 = this.f41281n.e(false, this.f41286y);
        float e11 = this.f41282r.e(false, this.E);
        RectF rectF = this.f41283s;
        float f10 = 0.0f;
        rectF.set(0.0f, 0.0f, e10, e11);
        Path path = this.f41284w;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), Path.Direction.CW);
        canvas.drawPath(path, this.h);
        if (Build.VERSION.SDK_INT >= 29) {
            s0 s0Var = this.G;
            if (s0Var.f41298b != null && canvas.isHardwareAccelerated()) {
                View view = this;
                float f11 = 0.0f;
                while (true) {
                    if (view != s0Var.d) {
                        f10 += view.getX();
                        f11 += view.getY();
                        ViewParent parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(-f10, -f11);
                    float f12 = s0Var.f41299c;
                    canvas.scale(f12, f12);
                    canvas.drawRenderNode(s0Var.f41298b);
                    canvas.restore();
                }
            }
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        this.d.h(canvas, null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        TextView textView = this.f41279e;
        Layout layout = textView.getLayout();
        int L = org.telegram.messenger.g0.L(19.0f);
        int i13 = 0;
        if (layout != null && layout.getLineCount() > 0) {
            i13 = layout.getLineBaseline(0);
        }
        int i14 = L - i13;
        textView.layout(org.telegram.messenger.g0.L(32.0f), i14, textView.getMeasuredWidth() + org.telegram.messenger.g0.L(32.0f), textView.getMeasuredHeight() + i14);
        this.d.y0(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        setPivotX(0.0f);
        setPivotY(i12 - i10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(44.0f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.f41279e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f41286y = org.telegram.messenger.g0.L(44.0f) + textView.getMeasuredWidth();
        int b10 = org.telegram.messenger.f3.b(8.0f, textView.getMeasuredHeight(), org.telegram.messenger.g0.L(28.0f));
        this.E = b10;
        setMeasuredDimension(size, b10);
        if (!this.F) {
            this.F = true;
            this.f41281n.e(true, this.f41286y);
            this.f41282r.e(true, this.E);
        }
        invalidate();
    }
}
