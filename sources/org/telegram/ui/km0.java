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
public final class km0 extends FrameLayout {
    public int E;
    public int F;
    public vl0 G;
    public fh.g H;
    public fh.g I;
    public boolean J;
    public final Path K;
    public int L;
    public final et f49304a;
    public final v4.c0 f49305b;
    public final y7 f49306c;
    public int d;
    public final org.telegram.ui.Components.c6 f49307e;
    public final ArrayList f49308f;
    public xl0 h;
    public final RectF f49309n;
    public final RectF f49310r;
    public final RectF f49311s;
    public final Paint f49312w;
    public final Paint f49313x;
    public int f49314y;

    public km0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f49308f = new ArrayList();
        this.f49309n = new RectF();
        this.f49310r = new RectF();
        this.f49311s = new RectF();
        this.f49312w = new Paint(1);
        this.f49313x = new Paint(1);
        this.K = new Path();
        this.L = Integer.MIN_VALUE;
        et etVar = new et(this, context, i6Var, 6);
        this.f49304a = etVar;
        etVar.setClipToPadding(false);
        etVar.setClipChildren(false);
        etVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        etVar.setOverScrollMode(2);
        etVar.setHorizontalScrollBarEnabled(false);
        etVar.setItemAnimator(null);
        v4.c0 c0Var = new v4.c0(0, false);
        this.f49305b = c0Var;
        etVar.setLayoutManager(c0Var);
        y7 y7Var = new y7(this, 6);
        this.f49306c = y7Var;
        etVar.setAdapter(y7Var);
        etVar.setOnItemClickListener(new h(this, 20));
        addView(etVar, c8.ma.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f49307e = new org.telegram.ui.Components.c6(etVar, 0L, 320L, org.telegram.ui.Components.lr.h);
    }

    public final void a(int i7, boolean z10) {
        int i10 = this.d;
        this.d = i7;
        if (!z10) {
            this.f49307e.e(true, i7);
        }
        b(i10);
        if (i7 != i10) {
            b(i7);
        }
        ArrayList arrayList = this.f49308f;
        boolean isEmpty = arrayList.isEmpty();
        et etVar = this.f49304a;
        if (!isEmpty) {
            int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
            if (z10) {
                etVar.y0(j3);
            } else {
                etVar.v0(j3);
            }
        }
        etVar.invalidate();
    }

    public final void b(int i7) {
        int i10;
        View m10 = this.f49305b.m(i7);
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
