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
public final class im0 extends FrameLayout {
    public int D;
    public int E;
    public tl0 F;
    public fh.g G;
    public fh.g H;
    public boolean I;
    public final Path J;
    public int K;
    public final bt f46691a;
    public final v4.b0 f46692b;
    public final x7 f46693c;
    public int d;
    public final org.telegram.ui.Components.w5 f46694e;
    public final ArrayList f46695f;
    public vl0 h;
    public final RectF f46696n;
    public final RectF f46697r;
    public final RectF f46698s;
    public final Paint f46699w;
    public final Paint f46700x;
    public int f46701y;

    public im0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f46695f = new ArrayList();
        this.f46696n = new RectF();
        this.f46697r = new RectF();
        this.f46698s = new RectF();
        this.f46699w = new Paint(1);
        this.f46700x = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        bt btVar = new bt(this, context, g6Var, 6);
        this.f46691a = btVar;
        btVar.setClipToPadding(false);
        btVar.setClipChildren(false);
        btVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        btVar.setOverScrollMode(2);
        btVar.setHorizontalScrollBarEnabled(false);
        btVar.setItemAnimator(null);
        v4.b0 b0Var = new v4.b0(0, false);
        this.f46692b = b0Var;
        btVar.setLayoutManager(b0Var);
        x7 x7Var = new x7(this, 6);
        this.f46693c = x7Var;
        btVar.setAdapter(x7Var);
        btVar.setOnItemClickListener(new h(this, 20));
        addView(btVar, c8.ha.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f46694e = new org.telegram.ui.Components.w5(btVar, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(int i7, boolean z9) {
        int i10 = this.d;
        this.d = i7;
        if (!z9) {
            this.f46694e.e(true, i7);
        }
        b(i10);
        if (i7 != i10) {
            b(i7);
        }
        ArrayList arrayList = this.f46695f;
        boolean isEmpty = arrayList.isEmpty();
        bt btVar = this.f46691a;
        if (!isEmpty) {
            int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
            if (z9) {
                btVar.y0(j3);
            } else {
                btVar.v0(j3);
            }
        }
        btVar.invalidate();
    }

    public final void b(int i7) {
        int i10;
        View m10 = this.f46692b.m(i7);
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
