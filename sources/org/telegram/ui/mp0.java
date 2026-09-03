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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class mp0 extends FrameLayout {
    public int B;
    public xo0 C;
    public qg.b D;
    public qg.b E;
    public boolean F;
    public final Path G;
    public int H;
    public final np0 I;
    public final mh.d1 f39017a;
    public final f2.j0 f39018b;
    public final y7 f39019c;
    public int d;
    public final org.telegram.ui.Components.z5 f39020e;
    public final ArrayList f39021f;
    public zo0 h;
    public final RectF f39022n;
    public final RectF f39023r;
    public final RectF f39024s;
    public final Paint v;
    public final Paint f39025w;
    public int f39026x;
    public int f39027y;

    public mp0(np0 np0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.I = np0Var;
        this.f39021f = new ArrayList();
        this.f39022n = new RectF();
        this.f39023r = new RectF();
        this.f39024s = new RectF();
        this.v = new Paint(1);
        this.f39025w = new Paint(1);
        this.G = new Path();
        this.H = Integer.MIN_VALUE;
        mh.d1 d1Var = new mh.d1(this, context, g6Var, 29);
        this.f39017a = d1Var;
        d1Var.setClipToPadding(false);
        d1Var.setClipChildren(false);
        d1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        d1Var.setOverScrollMode(2);
        d1Var.setHorizontalScrollBarEnabled(false);
        d1Var.setItemAnimator(null);
        f2.j0 j0Var = new f2.j0(0, false);
        this.f39018b = j0Var;
        d1Var.setLayoutManager(j0Var);
        y7 y7Var = new y7(this, 5);
        this.f39019c = y7Var;
        d1Var.setAdapter(y7Var);
        d1Var.setOnItemClickListener(new j(this, 20));
        addView(d1Var, k7.c6.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f39020e = new org.telegram.ui.Components.z5(d1Var, 0L, 320L, org.telegram.ui.Components.pr.h);
    }

    public final void a(int i10, boolean z4) {
        int i11 = this.d;
        this.d = i10;
        if (!z4) {
            this.f39020e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f39021f;
        boolean isEmpty = arrayList.isEmpty();
        mh.d1 d1Var = this.f39017a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z4) {
                d1Var.x0(clamp);
            } else {
                d1Var.u0(clamp);
            }
        }
        d1Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m9 = this.f39018b.m(i10);
        if (m9 instanceof TextView) {
            TextView textView = (TextView) m9;
            if (i10 == this.d) {
                i11 = this.B;
            } else {
                i11 = this.f39027y;
            }
            textView.setTextColor(i11);
            m9.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        qg.b bVar;
        lf.r.g(this.D, 0, 0, getWidth(), getHeight());
        lf.r.g(this.E, 0, 0, getWidth(), getHeight());
        if (this.F) {
            bVar = this.E;
        } else {
            bVar = this.D;
        }
        bVar.draw(canvas);
        canvas.save();
        canvas.clipPath(this.G);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(3.0f);
        Path path = this.G;
        path.rewind();
        float f10 = dp;
        path.addRoundRect(f10, f10, i10 - dp, i11 - dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp, Path.Direction.CW);
    }
}
