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
    public int E;
    public int F;
    public tl0 G;
    public fh.g H;
    public fh.g I;
    public boolean J;
    public final Path K;
    public int L;
    public final dt f48845a;
    public final v4.c0 f48846b;
    public final z7 f48847c;
    public int d;
    public final org.telegram.ui.Components.c6 f48848e;
    public final ArrayList f48849f;
    public vl0 h;
    public final RectF f48850n;
    public final RectF f48851r;
    public final RectF f48852s;
    public final Paint f48853w;
    public final Paint f48854x;
    public int f48855y;

    public im0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f48849f = new ArrayList();
        this.f48850n = new RectF();
        this.f48851r = new RectF();
        this.f48852s = new RectF();
        this.f48853w = new Paint(1);
        this.f48854x = new Paint(1);
        this.K = new Path();
        this.L = Integer.MIN_VALUE;
        dt dtVar = new dt(this, context, i6Var, 6);
        this.f48845a = dtVar;
        dtVar.setClipToPadding(false);
        dtVar.setClipChildren(false);
        dtVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        dtVar.setOverScrollMode(2);
        dtVar.setHorizontalScrollBarEnabled(false);
        dtVar.setItemAnimator(null);
        v4.c0 c0Var = new v4.c0(0, false);
        this.f48846b = c0Var;
        dtVar.setLayoutManager(c0Var);
        z7 z7Var = new z7(this, 6);
        this.f48847c = z7Var;
        dtVar.setAdapter(z7Var);
        dtVar.setOnItemClickListener(new h(this, 20));
        addView(dtVar, c8.na.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f48848e = new org.telegram.ui.Components.c6(dtVar, 0L, 320L, org.telegram.ui.Components.kr.h);
    }

    public final void a(int i7, boolean z10) {
        int i10 = this.d;
        this.d = i7;
        if (!z10) {
            this.f48848e.e(true, i7);
        }
        b(i10);
        if (i7 != i10) {
            b(i7);
        }
        ArrayList arrayList = this.f48849f;
        boolean isEmpty = arrayList.isEmpty();
        dt dtVar = this.f48845a;
        if (!isEmpty) {
            int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
            if (z10) {
                dtVar.y0(j3);
            } else {
                dtVar.v0(j3);
            }
        }
        dtVar.invalidate();
    }

    public final void b(int i7) {
        int i10;
        View m10 = this.f48846b.m(i7);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i7 == this.d) {
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
        fh.g gVar;
        bg.t.g(this.H, 0, 0, getWidth(), getHeight());
        bg.t.g(this.I, 0, 0, getWidth(), getHeight());
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(3.0f);
        Path path = this.K;
        path.rewind();
        float f10 = L;
        path.addRoundRect(f10, f10, i7 - L, i10 - L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L, Path.Direction.CW);
    }
}
