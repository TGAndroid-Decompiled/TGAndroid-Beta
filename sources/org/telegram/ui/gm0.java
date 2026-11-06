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
public final class gm0 extends FrameLayout {
    public int D;
    public int E;
    public rl0 F;
    public fh.g G;
    public fh.g H;
    public boolean I;
    public final Path J;
    public int K;
    public final zs f46028a;
    public final v4.b0 f46029b;
    public final x7 f46030c;
    public int d;
    public final org.telegram.ui.Components.w5 f46031e;
    public final ArrayList f46032f;
    public tl0 h;
    public final RectF f46033n;
    public final RectF f46034r;
    public final RectF f46035s;
    public final Paint f46036w;
    public final Paint f46037x;
    public int f46038y;

    public gm0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f46032f = new ArrayList();
        this.f46033n = new RectF();
        this.f46034r = new RectF();
        this.f46035s = new RectF();
        this.f46036w = new Paint(1);
        this.f46037x = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        zs zsVar = new zs(this, context, f6Var, 6);
        this.f46028a = zsVar;
        zsVar.setClipToPadding(false);
        zsVar.setClipChildren(false);
        zsVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        zsVar.setOverScrollMode(2);
        zsVar.setHorizontalScrollBarEnabled(false);
        zsVar.setItemAnimator(null);
        v4.b0 b0Var = new v4.b0(0, false);
        this.f46029b = b0Var;
        zsVar.setLayoutManager(b0Var);
        x7 x7Var = new x7(this, 6);
        this.f46030c = x7Var;
        zsVar.setAdapter(x7Var);
        zsVar.setOnItemClickListener(new h(this, 20));
        addView(zsVar, c8.ha.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f46031e = new org.telegram.ui.Components.w5(zsVar, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(int i7, boolean z9) {
        int i10 = this.d;
        this.d = i7;
        if (!z9) {
            this.f46031e.e(true, i7);
        }
        b(i10);
        if (i7 != i10) {
            b(i7);
        }
        ArrayList arrayList = this.f46032f;
        boolean isEmpty = arrayList.isEmpty();
        zs zsVar = this.f46028a;
        if (!isEmpty) {
            int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
            if (z9) {
                zsVar.y0(j3);
            } else {
                zsVar.v0(j3);
            }
        }
        zsVar.invalidate();
    }

    public final void b(int i7) {
        int i10;
        View m10 = this.f46029b.m(i7);
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
