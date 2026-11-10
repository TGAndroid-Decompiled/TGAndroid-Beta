package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class jm0 extends FrameLayout {
    public int D;
    public int E;
    public ul0 F;
    public fh.g G;
    public fh.g H;
    public boolean I;
    public final Path J;
    public int K;
    public final ct f47036a;
    public final v4.b0 f47037b;
    public final x7 f47038c;
    public int d;
    public final org.telegram.ui.Components.v5 f47039e;
    public final ArrayList f47040f;
    public wl0 h;
    public final RectF f47041n;
    public final RectF f47042r;
    public final RectF f47043s;
    public final Paint f47044w;
    public final Paint f47045x;
    public int f47046y;

    public jm0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f47040f = new ArrayList();
        this.f47041n = new RectF();
        this.f47042r = new RectF();
        this.f47043s = new RectF();
        this.f47044w = new Paint(1);
        this.f47045x = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        ct ctVar = new ct(this, context, h6Var, 6);
        this.f47036a = ctVar;
        ctVar.setClipToPadding(false);
        ctVar.setClipChildren(false);
        ctVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ctVar.setOverScrollMode(2);
        ctVar.setHorizontalScrollBarEnabled(false);
        ctVar.setItemAnimator(null);
        v4.b0 b0Var = new v4.b0(0, false);
        this.f47037b = b0Var;
        ctVar.setLayoutManager(b0Var);
        x7 x7Var = new x7(this, 6);
        this.f47038c = x7Var;
        ctVar.setAdapter(x7Var);
        ctVar.setOnItemClickListener(new h(this, 20));
        addView(ctVar, c8.ha.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f47039e = new org.telegram.ui.Components.v5(ctVar, 0L, 320L, org.telegram.ui.Components.wq.h);
    }

    public final void a(int i7, boolean z9) {
        int i10 = this.d;
        this.d = i7;
        if (!z9) {
            this.f47039e.e(true, i7);
        }
        b(i10);
        if (i7 != i10) {
            b(i7);
        }
        ArrayList arrayList = this.f47040f;
        boolean isEmpty = arrayList.isEmpty();
        ct ctVar = this.f47036a;
        if (!isEmpty) {
            int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
            if (z9) {
                ctVar.y0(j3);
            } else {
                ctVar.v0(j3);
            }
        }
        ctVar.invalidate();
    }

    public final void b(int i7) {
        int i10;
        View m10 = this.f47037b.m(i7);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i7 == this.d) {
                i10 = this.E;
            } else {
                i10 = this.D;
            }
            textView.setTextColor(i10);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fh.g gVar;
        bg.s.g(this.G, 0, 0, getWidth(), getHeight());
        bg.s.g(this.H, 0, 0, getWidth(), getHeight());
        if (this.I) {
            gVar = this.H;
        } else {
            gVar = this.G;
        }
        gVar.draw(canvas);
        canvas.save();
        canvas.clipPath(this.J);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(3.0f);
        Path path = this.J;
        path.rewind();
        float f10 = L;
        path.addRoundRect(f10, f10, i7 - L, i10 - L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L, Path.Direction.CW);
    }
}
