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
public final class bm0 extends FrameLayout {
    public int E;
    public int F;
    public ml0 G;
    public gh.g H;
    public gh.g I;
    public boolean J;
    public final Path K;
    public int L;
    public final xs f44071a;
    public final u4.b0 f44072b;
    public final y7 f44073c;
    public int d;
    public final org.telegram.ui.Components.u5 f44074e;
    public final ArrayList f44075f;
    public ol0 h;
    public final RectF f44076n;
    public final RectF f44077r;
    public final RectF f44078s;
    public final Paint f44079w;
    public final Paint f44080x;
    public int f44081y;

    public bm0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f44075f = new ArrayList();
        this.f44076n = new RectF();
        this.f44077r = new RectF();
        this.f44078s = new RectF();
        this.f44079w = new Paint(1);
        this.f44080x = new Paint(1);
        this.K = new Path();
        this.L = Integer.MIN_VALUE;
        xs xsVar = new xs(this, context, e6Var, 6);
        this.f44071a = xsVar;
        xsVar.setClipToPadding(false);
        xsVar.setClipChildren(false);
        xsVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        xsVar.setOverScrollMode(2);
        xsVar.setHorizontalScrollBarEnabled(false);
        xsVar.setItemAnimator(null);
        u4.b0 b0Var = new u4.b0(0, false);
        this.f44072b = b0Var;
        xsVar.setLayoutManager(b0Var);
        y7 y7Var = new y7(this, 6);
        this.f44073c = y7Var;
        xsVar.setAdapter(y7Var);
        xsVar.setOnItemClickListener(new h(this, 20));
        addView(xsVar, b8.mf.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f44074e = new org.telegram.ui.Components.u5(xsVar, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(int i3, boolean z10) {
        int i10 = this.d;
        this.d = i3;
        if (!z10) {
            this.f44074e.e(true, i3);
        }
        b(i10);
        if (i3 != i10) {
            b(i3);
        }
        ArrayList arrayList = this.f44075f;
        boolean isEmpty = arrayList.isEmpty();
        xs xsVar = this.f44071a;
        if (!isEmpty) {
            int j10 = Utilities.j(i3, arrayList.size() - 1, 0);
            if (z10) {
                xsVar.y0(j10);
            } else {
                xsVar.v0(j10);
            }
        }
        xsVar.invalidate();
    }

    public final void b(int i3) {
        int i10;
        View m10 = this.f44072b.m(i3);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i3 == this.d) {
                i10 = this.F;
            } else {
                i10 = this.E;
            }
            textView.setTextColor(i10);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gh.g gVar;
        cg.r.g(this.H, 0, 0, getWidth(), getHeight());
        cg.r.g(this.I, 0, 0, getWidth(), getHeight());
        if (this.J) {
            gVar = this.I;
        } else {
            gVar = this.H;
        }
        gVar.draw(canvas);
        canvas.save();
        canvas.clipPath(this.K);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(3.0f);
        Path path = this.K;
        path.rewind();
        float f10 = L;
        path.addRoundRect(f10, f10, i3 - L, i10 - L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L, Path.Direction.CW);
    }
}
