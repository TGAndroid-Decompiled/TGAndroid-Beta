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
public final class jp0 extends FrameLayout {
    public int E;
    public uo0 F;
    public dh.d G;
    public dh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final kp0 L;
    public final k10 f38601a;
    public final s4.b0 f38602b;
    public final z7 f38603c;
    public int d;
    public final org.telegram.ui.Components.d6 e;
    public final ArrayList f38604f;
    public wo0 h;
    public final RectF f38605n;
    public final RectF f38606r;
    public final RectF f38607s;
    public final Paint v;
    public final Paint f38608w;
    public int f38609x;
    public int f38610y;

    public jp0(kp0 kp0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.L = kp0Var;
        this.f38604f = new ArrayList();
        this.f38605n = new RectF();
        this.f38606r = new RectF();
        this.f38607s = new RectF();
        this.v = new Paint(1);
        this.f38608w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        k10 k10Var = new k10(this, context, g6Var, 2);
        this.f38601a = k10Var;
        k10Var.setClipToPadding(false);
        k10Var.setClipChildren(false);
        k10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        k10Var.setOverScrollMode(2);
        k10Var.setHorizontalScrollBarEnabled(false);
        k10Var.setItemAnimator(null);
        s4.b0 b0Var = new s4.b0(0, false);
        this.f38602b = b0Var;
        k10Var.setLayoutManager(b0Var);
        z7 z7Var = new z7(this, 5);
        this.f38603c = z7Var;
        k10Var.setAdapter(z7Var);
        k10Var.setOnItemClickListener(new h(this, 21));
        addView(k10Var, w7.z5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.d6(k10Var, 0L, 320L, org.telegram.ui.Components.zr.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f38604f;
        boolean isEmpty = arrayList.isEmpty();
        k10 k10Var = this.f38601a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                k10Var.x0(clamp);
            } else {
                k10Var.u0(clamp);
            }
        }
        k10Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f38602b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f38610y;
            }
            textView.setTextColor(i11);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dh.d dVar;
        zf.p.g(this.G, 0, 0, getWidth(), getHeight());
        zf.p.g(this.H, 0, 0, getWidth(), getHeight());
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
