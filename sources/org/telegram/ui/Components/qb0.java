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
public abstract class qb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final nq J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final mb0 Q;
    public ch.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.e6 f30163a;
    public final pb0 f30164b;
    public final gg.i0 f30165c;
    public final jb0 d;
    public final gg.p1 f30166e;
    public final gg.j1 f30167f;
    public final org.telegram.ui.ActionBar.n2 h;
    public float f30168n;
    public float f30169r;
    public float f30170s;
    public float v;
    public ai.o6 f30171w;
    public nb0 f30172x;
    public final Rect f30173y;

    public qb0(Context context, long j3, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30173y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new nq(this, 27);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new mb0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = n2Var;
        this.f30163a = e6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        pb0 pb0Var = new pb0(this, context, e6Var);
        this.f30164b = pb0Var;
        gg.i0 i0Var = new gg.i0((Object) this, 3);
        this.f30165c = i0Var;
        i0Var.j1(1);
        jb0 jb0Var = new jb0(this);
        this.d = jb0Var;
        jb0Var.O = new kb0(this);
        s4.j jVar = new s4.j();
        jVar.f47794c = 150L;
        jVar.f47795e = 150L;
        jVar.f47796f = 150L;
        jVar.f47797g = 150L;
        jVar.d = 150L;
        jVar.f47762o = is.f27443f;
        jVar.C = false;
        pb0Var.setItemAnimator(jVar);
        pb0Var.setClipToPadding(false);
        pb0Var.setLayoutManager(i0Var);
        gg.j1 j1Var = new gg.j1(context, j3, j10, new lb0(this, n2Var), e6Var, h());
        this.f30167f = j1Var;
        ?? i0Var2 = new s4.i0();
        i0Var2.d = null;
        i0Var2.f10768f = false;
        gg.o1 o1Var = new gg.o1(i0Var2, 0);
        i0Var2.f10766c = j1Var;
        j1Var.B(o1Var);
        this.f30166e = i0Var2;
        pb0Var.setAdapter(i0Var2);
        pb0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(pb0Var, w7.x5.d(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        jb0 jb0Var;
        gg.j1 j1Var;
        int height;
        pb0 pb0Var = this.f30164b;
        if (pb0Var != null && this.f30165c != null) {
            boolean g10 = g();
            this.f30170s = 0.0f;
            gg.p1 p1Var = this.f30166e;
            if (g10) {
                if (p1Var.f10768f) {
                    height = p1Var.f10767e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, pb0Var.getTranslationY() + height) + this.f30170s, (1.0f - this.M) * getHeight());
                this.f30168n = 0.0f;
                this.f30169r = min;
            } else {
                if (p1Var.f10768f) {
                    i10 = p1Var.f10767e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f30168n = Math.max(Math.max(0.0f, pb0Var.getTranslationY() + i10) - this.f30170s, this.M * getHeight());
                this.f30169r = getMeasuredHeight();
            }
            ch.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f30168n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f30169r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.f4685j.f4675m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (pb0Var != null && (jb0Var = this.d) != null && pb0Var.getLayoutManager() == jb0Var && (j1Var = this.f30167f) != null && j1Var.R != null) {
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
        jb0 jb0Var;
        gg.j1 j1Var;
        pb0 pb0Var = this.f30164b;
        if (pb0Var != null && this.f30165c != null) {
            int i11 = 0;
            if (pb0Var != null && (jb0Var = this.d) != null && pb0Var.getLayoutManager() == jb0Var && (j1Var = this.f30167f) != null && j1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                pb0Var.setPadding(0, 0, 0, 0);
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
            pb0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f30168n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f30164b, (Utilities.Callback<View>) new ai.i(13));
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
        gg.j1 j1Var = this.f30167f;
        if ((j1Var.N() || j1Var.R != null) && ((j1Var.f10696x0 || j1Var.A0 != null) && j1Var.I() == null && j1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f30170s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f30168n;
        gg.p1 p1Var = this.f30166e;
        pb0 pb0Var = this.f30164b;
        Rect rect = this.f30173y;
        if (g10) {
            if (p1Var.f10768f) {
                height = p1Var.f10767e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, pb0Var.getTranslationY() + height) + this.f30170s, (1.0f - this.M) * getHeight());
            this.f30168n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f30169r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f30169r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (pb0Var.getLayoutManager() == this.d) {
                this.f30170s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (p1Var.f10768f) {
                i11 = p1Var.f10767e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, pb0Var.getTranslationY() + i11) - this.f30170s;
            this.f30168n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f30168n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f30169r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f30168n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f30168n) > 0.1f) {
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
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sd, this.f30163a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f30169r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.p0 layoutManager = this.f30164b.getLayoutManager();
        gg.i0 i0Var = this.f30165c;
        if (layoutManager == i0Var && i0Var.f47695t) {
            return true;
        }
        return false;
    }

    public gg.j1 getAdapter() {
        return this.f30167f;
    }

    public s4.d0 getCurrentLayoutManager() {
        s4.p0 layoutManager = this.f30164b.getLayoutManager();
        gg.i0 i0Var = this.f30165c;
        if (layoutManager == i0Var) {
            return i0Var;
        }
        return this.d;
    }

    public pb0 getListView() {
        return this.f30164b;
    }

    public s4.d0 getNeededLayoutManager() {
        gg.j1 j1Var = this.f30167f;
        if ((!j1Var.N() && j1Var.R == null) || (!j1Var.f10696x0 && j1Var.A0 == null)) {
            return this.f30165c;
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
                pb0 pb0Var = this.f30164b;
                s4.p0 layoutManager = pb0Var.getLayoutManager();
                gg.i0 i0Var = this.f30165c;
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
                        computeVerticalScrollOffset = pb0Var.computeVerticalScrollOffset() + this.v;
                    }
                    pb0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        nq nqVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(nqVar);
        o1.k kVar = this.K;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        if (n2Var != null && n2Var.getFragmentBeginToShow()) {
            j3 = 0;
        } else {
            j3 = 100;
        }
        AndroidUtilities.runOnUIThread(nqVar, j3);
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

    public final void p(nb0 nb0Var) {
        this.f30172x = nb0Var;
        pb0 listView = getListView();
        ai.o6 o6Var = new ai.o6(12, this, nb0Var);
        this.f30171w = o6Var;
        listView.setOnItemClickListener(o6Var);
        getListView().setOnTouchListener(new wk(this, 4));
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
        gg.j1 j1Var = this.f30167f;
        if (j1Var.f10681n != j3) {
            j1Var.f10681n = j3;
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
            this.f30165c.k1(z10);
            gg.j1 j1Var = this.f30167f;
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
