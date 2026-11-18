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
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
public final class r0 extends ViewGroup {
    public int E;
    public boolean F;
    public final s0 G;
    public final long f41178a;
    public boolean f41179b;
    public long f41180c;
    public final ImageReceiver d;
    public final TextView f41181e;
    public final ai.h2 f41182f;
    public final Paint h;
    public final c6 f41183n;
    public final c6 f41184r;
    public final RectF f41185s;
    public final Path f41186w;
    public int f41187x;
    public int f41188y;

    public r0(s0 s0Var, Context context, long j3) {
        super(context);
        this.G = s0Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        Paint paint = new Paint(1);
        this.h = paint;
        lr lrVar = lr.h;
        this.f41183n = new c6(this, 0L, 320L, lrVar);
        this.f41184r = new c6(this, 0L, 320L, lrVar);
        this.f41185s = new RectF();
        this.f41186w = new Path();
        this.f41178a = j3;
        TextView textView = new TextView(context);
        this.f41181e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setIncludeFontPadding(false);
        addView(textView);
        ai.h2 h2Var = new ai.h2(textView);
        this.f41182f = h2Var;
        h2Var.c(-9717249, -1, true);
        imageReceiver.J0(org.telegram.messenger.g0.L(11.0f));
        paint.setColor(-13946053);
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float e10 = this.f41183n.e(false, this.f41188y);
        float e11 = this.f41184r.e(false, this.E);
        RectF rectF = this.f41185s;
        float f10 = 0.0f;
        rectF.set(0.0f, 0.0f, e10, e11);
        Path path = this.f41186w;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), Path.Direction.CW);
        canvas.drawPath(path, this.h);
        if (Build.VERSION.SDK_INT >= 29) {
            s0 s0Var = this.G;
            if (s0Var.f41200b != null && canvas.isHardwareAccelerated()) {
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
                    float f12 = s0Var.f41201c;
                    canvas.scale(f12, f12);
                    canvas.drawRenderNode(s0Var.f41200b);
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
        TextView textView = this.f41181e;
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
        TextView textView = this.f41181e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f41188y = org.telegram.messenger.g0.L(44.0f) + textView.getMeasuredWidth();
        int b10 = org.telegram.messenger.f3.b(8.0f, textView.getMeasuredHeight(), org.telegram.messenger.g0.L(28.0f));
        this.E = b10;
        setMeasuredDimension(size, b10);
        if (!this.F) {
            this.F = true;
            this.f41183n.e(true, this.f41188y);
            this.f41184r.e(true, this.E);
        }
        invalidate();
    }
}
