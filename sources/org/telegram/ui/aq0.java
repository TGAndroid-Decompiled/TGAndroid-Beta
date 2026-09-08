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
public final class aq0 extends FrameLayout {
    public int E;
    public lp0 F;
    public dh.d G;
    public dh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final bq0 L;
    public final r60 f34553a;
    public final s4.c0 f34554b;
    public final w7 f34555c;
    public int d;
    public final org.telegram.ui.Components.e6 f34556e;
    public final ArrayList f34557f;
    public np0 h;
    public final RectF f34558n;
    public final RectF f34559r;
    public final RectF f34560s;
    public final Paint v;
    public final Paint f34561w;
    public int f34562x;
    public int f34563y;

    public aq0(bq0 bq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.L = bq0Var;
        this.f34557f = new ArrayList();
        this.f34558n = new RectF();
        this.f34559r = new RectF();
        this.f34560s = new RectF();
        this.v = new Paint(1);
        this.f34561w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        r60 r60Var = new r60(this, context, f6Var, 1);
        this.f34553a = r60Var;
        r60Var.setClipToPadding(false);
        r60Var.setClipChildren(false);
        r60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        r60Var.setOverScrollMode(2);
        r60Var.setHorizontalScrollBarEnabled(false);
        r60Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f34554b = c0Var;
        r60Var.setLayoutManager(c0Var);
        w7 w7Var = new w7(this, 5);
        this.f34555c = w7Var;
        r60Var.setAdapter(w7Var);
        r60Var.setOnItemClickListener(new i(this, 20));
        addView(r60Var, w7.x5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f34556e = new org.telegram.ui.Components.e6(r60Var, 0L, 320L, org.telegram.ui.Components.pr.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.f34556e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f34557f;
        boolean isEmpty = arrayList.isEmpty();
        r60 r60Var = this.f34553a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                r60Var.x0(clamp);
            } else {
                r60Var.u0(clamp);
            }
        }
        r60Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f34554b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f34563y;
            }
            textView.setTextColor(i11);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dh.d dVar;
        yf.p.g(this.G, 0, 0, getWidth(), getHeight());
        yf.p.g(this.H, 0, 0, getWidth(), getHeight());
        if (this.I) {
            dVar = this.H;
        } else {
            dVar = this.G;
        }
        dVar.draw(canvas);
        canvas.save();
        canvas.clipPath(this.J);
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
        Path path = this.J;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(f7, f7, i10 - dp, i11 - dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp, Path.Direction.CW);
    }
}
