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
    public pg.b D;
    public pg.b E;
    public boolean F;
    public final Path G;
    public int H;
    public final np0 I;
    public final lh.e1 f36149a;
    public final f2.i0 f36150b;
    public final a8 f36151c;
    public int d;
    public final org.telegram.ui.Components.z5 e;
    public final ArrayList f36152f;
    public zo0 h;
    public final RectF f36153n;
    public final RectF f36154r;
    public final RectF f36155s;
    public final Paint v;
    public final Paint f36156w;
    public int f36157x;
    public int f36158y;

    public mp0(np0 np0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.I = np0Var;
        this.f36152f = new ArrayList();
        this.f36153n = new RectF();
        this.f36154r = new RectF();
        this.f36155s = new RectF();
        this.v = new Paint(1);
        this.f36156w = new Paint(1);
        this.G = new Path();
        this.H = Integer.MIN_VALUE;
        lh.e1 e1Var = new lh.e1(this, context, f6Var, 29);
        this.f36149a = e1Var;
        e1Var.setClipToPadding(false);
        e1Var.setClipChildren(false);
        e1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        e1Var.setOverScrollMode(2);
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setItemAnimator(null);
        f2.i0 i0Var = new f2.i0(0, false);
        this.f36150b = i0Var;
        e1Var.setLayoutManager(i0Var);
        a8 a8Var = new a8(this, 5);
        this.f36151c = a8Var;
        e1Var.setAdapter(a8Var);
        e1Var.setOnItemClickListener(new j(this, 20));
        addView(e1Var, k7.b6.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.z5(e1Var, 0L, 320L, org.telegram.ui.Components.mr.h);
    }

    public final void a(int i10, boolean z4) {
        int i11 = this.d;
        this.d = i10;
        if (!z4) {
            this.e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f36152f;
        boolean isEmpty = arrayList.isEmpty();
        lh.e1 e1Var = this.f36149a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z4) {
                e1Var.x0(clamp);
            } else {
                e1Var.u0(clamp);
            }
        }
        e1Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m9 = this.f36150b.m(i10);
        if (m9 instanceof TextView) {
            TextView textView = (TextView) m9;
            if (i10 == this.d) {
                i11 = this.B;
            } else {
                i11 = this.f36158y;
            }
            textView.setTextColor(i11);
            m9.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        pg.b bVar;
        kf.r.g(this.D, 0, 0, getWidth(), getHeight());
        kf.r.g(this.E, 0, 0, getWidth(), getHeight());
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
