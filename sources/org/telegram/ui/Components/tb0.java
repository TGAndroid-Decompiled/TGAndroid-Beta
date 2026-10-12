package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class tb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final pq J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final pb0 Q;
    public ch.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.c6 f30838a;
    public final sb0 f30839b;
    public final gg.i0 f30840c;
    public final mb0 d;
    public final gg.p1 f30841e;
    public final gg.j1 f30842f;
    public final org.telegram.ui.ActionBar.m2 h;
    public float f30843n;
    public float f30844r;
    public float f30845s;
    public float v;
    public ai.o6 f30846w;
    public qb0 f30847x;
    public final Rect f30848y;

    public tb0(Context context, long j3, long j10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30848y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new pq(this, 28);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new pb0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = m2Var;
        this.f30838a = c6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        sb0 sb0Var = new sb0(this, context, c6Var);
        this.f30839b = sb0Var;
        gg.i0 i0Var = new gg.i0((Object) this, 3);
        this.f30840c = i0Var;
        i0Var.j1(1);
        mb0 mb0Var = new mb0(this);
        this.d = mb0Var;
        mb0Var.O = new nb0(this);
        s4.j jVar = new s4.j();
        jVar.f47981c = 150L;
        jVar.f47982e = 150L;
        jVar.f47983f = 150L;
        jVar.f47984g = 150L;
        jVar.d = 150L;
        jVar.f47949o = js.f27627f;
        jVar.C = false;
        sb0Var.setItemAnimator(jVar);
        sb0Var.setClipToPadding(false);
        sb0Var.setLayoutManager(i0Var);
        gg.j1 j1Var = new gg.j1(context, j3, j10, new ob0(this, m2Var), c6Var, h());
        this.f30842f = j1Var;
        ?? i0Var2 = new s4.i0();
        i0Var2.d = null;
        i0Var2.f10766f = false;
        gg.o1 o1Var = new gg.o1(i0Var2, 0);
        i0Var2.f10764c = j1Var;
        j1Var.B(o1Var);
        this.f30841e = i0Var2;
        sb0Var.setAdapter(i0Var2);
        sb0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(sb0Var, w7.w5.d(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        mb0 mb0Var;
        gg.j1 j1Var;
        int height;
        sb0 sb0Var = this.f30839b;
        if (sb0Var != null && this.f30840c != null) {
            boolean g10 = g();
            this.f30845s = 0.0f;
            gg.p1 p1Var = this.f30841e;
            if (g10) {
                if (p1Var.f10766f) {
                    height = p1Var.f10765e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, sb0Var.getTranslationY() + height) + this.f30845s, (1.0f - this.M) * getHeight());
                this.f30843n = 0.0f;
                this.f30844r = min;
            } else {
                if (p1Var.f10766f) {
                    i10 = p1Var.f10765e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f30843n = Math.max(Math.max(0.0f, sb0Var.getTranslationY() + i10) - this.f30845s, this.M * getHeight());
                this.f30844r = getMeasuredHeight();
            }
            ch.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f30843n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f30844r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.f4683j.f4673m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (sb0Var != null && (mb0Var = this.d) != null && sb0Var.getLayoutManager() == mb0Var && (j1Var = this.f30842f) != null && j1Var.R != null) {
                    rectF.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                    path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
                } else {
                    path.addRoundRect(rectF, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), Path.Direction.CW);
                }
                path.close();
                invalidate();
            }
        }
    }

    public final void c() {
        boolean z10;
        float f7;
        int i10;
        mb0 mb0Var;
        gg.j1 j1Var;
        sb0 sb0Var = this.f30839b;
        if (sb0Var != null && this.f30840c != null) {
            int i11 = 0;
            if (sb0Var != null && (mb0Var = this.d) != null && sb0Var.getLayoutManager() == mb0Var && (j1Var = this.f30842f) != null && j1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                sb0Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f10 = 5.0f;
            if (z10) {
                f7 = 7.0f;
            } else {
                f7 = 5.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (z10) {
                i10 = AndroidUtilities.dp(2.0f);
            } else {
                i10 = 0;
            }
            if (z10) {
                f10 = 7.0f;
            }
            int dp2 = AndroidUtilities.dp(f10);
            if (z10) {
                i11 = AndroidUtilities.dp(2.0f);
            }
            sb0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f30843n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f30839b, (Utilities.Callback<View>) new ai.i(13));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int w02;
        int height;
        ch.d dVar = this.R;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        gg.j1 j1Var = this.f30842f;
        if ((j1Var.N() || j1Var.R != null) && ((j1Var.f10694x0 || j1Var.A0 != null) && j1Var.I() == null && j1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f30845s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f30843n;
        gg.p1 p1Var = this.f30841e;
        sb0 sb0Var = this.f30839b;
        Rect rect = this.f30848y;
        if (g10) {
            if (p1Var.f10766f) {
                height = p1Var.f10765e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, sb0Var.getTranslationY() + height) + this.f30845s, (1.0f - this.M) * getHeight());
            this.f30843n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f30844r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f30844r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (sb0Var.getLayoutManager() == this.d) {
                this.f30845s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (p1Var.f10766f) {
                i11 = p1Var.f10765e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, sb0Var.getTranslationY() + i11) - this.f30845s;
            this.f30843n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f30843n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f30844r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f30843n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f30843n) > 0.1f) {
            i();
        }
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.E = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.E;
        Integer num = this.F;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sd, this.f30838a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f30844r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.p0 layoutManager = this.f30839b.getLayoutManager();
        gg.i0 i0Var = this.f30840c;
        if (layoutManager == i0Var && i0Var.f47882t) {
            return true;
        }
        return false;
    }

    public gg.j1 getAdapter() {
        return this.f30842f;
    }

    public s4.d0 getCurrentLayoutManager() {
        s4.p0 layoutManager = this.f30839b.getLayoutManager();
        gg.i0 i0Var = this.f30840c;
        if (layoutManager == i0Var) {
            return i0Var;
        }
        return this.d;
    }

    public sb0 getListView() {
        return this.f30839b;
    }

    public s4.d0 getNeededLayoutManager() {
        gg.j1 j1Var = this.f30842f;
        if ((!j1Var.N() && j1Var.R == null) || (!j1Var.f10694x0 && j1Var.A0 == null)) {
            return this.f30840c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof ai.d4;
    }

    public final void o(boolean z10) {
        long j3;
        float computeVerticalScrollOffset;
        int i10;
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                sb0 sb0Var = this.f30839b;
                s4.p0 layoutManager = sb0Var.getLayoutManager();
                gg.i0 i0Var = this.f30840c;
                if (layoutManager == i0Var) {
                    if (g10) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    i0Var.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = sb0Var.computeVerticalScrollOffset() + this.v;
                    }
                    sb0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        pq pqVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(pqVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.h;
        if (m2Var != null && m2Var.getFragmentBeginToShow()) {
            j3 = 0;
        } else {
            j3 = 100;
        }
        AndroidUtilities.runOnUIThread(pqVar, j3);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    public final void p(qb0 qb0Var) {
        this.f30847x = qb0Var;
        sb0 listView = getListView();
        ai.o6 o6Var = new ai.o6(12, this, qb0Var);
        this.f30846w = o6Var;
        listView.setOnItemClickListener(o6Var);
        getListView().setOnTouchListener(new yk(this, 4));
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(ch.d dVar) {
        this.R = dVar;
        dVar.q(AndroidUtilities.dp(22.0f));
        this.R.p(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        gg.j1 j1Var = this.f30842f;
        if (j1Var.f10679n != j3) {
            j1Var.f10679n = j3;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.G = z10;
    }

    public void setOverrideColor(int i10) {
        this.F = Integer.valueOf(i10);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.H = true;
            this.f30840c.k1(z10);
            gg.j1 j1Var = this.f30842f;
            if (j1Var.L0 != z10) {
                j1Var.L0 = z10;
                int i10 = j1Var.M0;
                if (i10 > 0) {
                    j1Var.m(0);
                }
                if (i10 > 1) {
                    j1Var.m(i10 - 1);
                }
            }
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z10) {
    }

    public void m() {
    }

    public void n(boolean z10) {
    }
}
