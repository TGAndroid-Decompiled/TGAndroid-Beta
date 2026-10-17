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
public final class ip0 extends FrameLayout {
    public int E;
    public to0 F;
    public dh.d G;
    public dh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final jp0 L;
    public final i10 f37944a;
    public final s4.b0 f37945b;
    public final z7 f37946c;
    public int d;
    public final org.telegram.ui.Components.f6 e;
    public final ArrayList f37947f;
    public vo0 h;
    public final RectF f37948n;
    public final RectF f37949r;
    public final RectF f37950s;
    public final Paint v;
    public final Paint f37951w;
    public int f37952x;
    public int f37953y;

    public ip0(jp0 jp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.L = jp0Var;
        this.f37947f = new ArrayList();
        this.f37948n = new RectF();
        this.f37949r = new RectF();
        this.f37950s = new RectF();
        this.v = new Paint(1);
        this.f37951w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        i10 i10Var = new i10(this, context, d6Var, 2);
        this.f37944a = i10Var;
        i10Var.setClipToPadding(false);
        i10Var.setClipChildren(false);
        i10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        i10Var.setOverScrollMode(2);
        i10Var.setHorizontalScrollBarEnabled(false);
        i10Var.setItemAnimator(null);
        s4.b0 b0Var = new s4.b0(0, false);
        this.f37945b = b0Var;
        i10Var.setLayoutManager(b0Var);
        z7 z7Var = new z7(this, 5);
        this.f37946c = z7Var;
        i10Var.setAdapter(z7Var);
        i10Var.setOnItemClickListener(new i(this, 21));
        addView(i10Var, w7.z5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.f6(i10Var, 0L, 320L, org.telegram.ui.Components.bs.h);
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
        ArrayList arrayList = this.f37947f;
        boolean isEmpty = arrayList.isEmpty();
        i10 i10Var = this.f37944a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                i10Var.x0(clamp);
            } else {
                i10Var.u0(clamp);
            }
        }
        i10Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f37945b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f37953y;
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
