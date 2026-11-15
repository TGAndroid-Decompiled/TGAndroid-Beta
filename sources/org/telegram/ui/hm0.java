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
public final class hm0 extends FrameLayout {
    public int E;
    public int F;
    public sl0 G;
    public fh.g H;
    public fh.g I;
    public boolean J;
    public final Path K;
    public int L;
    public final ct f47740a;
    public final v4.b0 f47741b;
    public final y7 f47742c;
    public int d;
    public final org.telegram.ui.Components.u5 f47743e;
    public final ArrayList f47744f;
    public ul0 h;
    public final RectF f47745n;
    public final RectF f47746r;
    public final RectF f47747s;
    public final Paint f47748w;
    public final Paint f47749x;
    public int f47750y;

    public hm0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f47744f = new ArrayList();
        this.f47745n = new RectF();
        this.f47746r = new RectF();
        this.f47747s = new RectF();
        this.f47748w = new Paint(1);
        this.f47749x = new Paint(1);
        this.K = new Path();
        this.L = Integer.MIN_VALUE;
        ct ctVar = new ct(this, context, e6Var, 6);
        this.f47740a = ctVar;
        ctVar.setClipToPadding(false);
        ctVar.setClipChildren(false);
        ctVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ctVar.setOverScrollMode(2);
        ctVar.setHorizontalScrollBarEnabled(false);
        ctVar.setItemAnimator(null);
        v4.b0 b0Var = new v4.b0(0, false);
        this.f47741b = b0Var;
        ctVar.setLayoutManager(b0Var);
        y7 y7Var = new y7(this, 6);
        this.f47742c = y7Var;
        ctVar.setAdapter(y7Var);
        ctVar.setOnItemClickListener(new h(this, 20));
        addView(ctVar, c8.ja.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f47743e = new org.telegram.ui.Components.u5(ctVar, 0L, 320L, org.telegram.ui.Components.er.h);
    }

    public final void a(int i7, boolean z10) {
        int i10 = this.d;
        this.d = i7;
        if (!z10) {
            this.f47743e.e(true, i7);
        }
        b(i10);
        if (i7 != i10) {
            b(i7);
        }
        ArrayList arrayList = this.f47744f;
        boolean isEmpty = arrayList.isEmpty();
        ct ctVar = this.f47740a;
        if (!isEmpty) {
            int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
            if (z10) {
                ctVar.y0(j3);
            } else {
                ctVar.v0(j3);
            }
        }
        ctVar.invalidate();
    }

    public final void b(int i7) {
        int i10;
        View m10 = this.f47741b.m(i7);
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
        bg.s.g(this.H, 0, 0, getWidth(), getHeight());
        bg.s.g(this.I, 0, 0, getWidth(), getHeight());
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
