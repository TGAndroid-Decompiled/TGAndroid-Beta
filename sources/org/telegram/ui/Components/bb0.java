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
public abstract class bb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final aq J;
    public o1.k K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final xa0 Q;
    public ch.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.d6 f24926a;
    public final ab0 f24927b;
    public final gg.j0 f24928c;
    public final ua0 d;
    public final gg.q1 f24929e;
    public final gg.k1 f24930f;
    public final org.telegram.ui.ActionBar.n2 h;
    public float f24931n;
    public float f24932r;
    public float f24933s;
    public float v;
    public ai.n6 f24934w;
    public ya0 f24935x;
    public final Rect f24936y;

    public bb0(Context context, long j3, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24936y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new aq(this, 28);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new xa0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = n2Var;
        this.f24926a = d6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ab0 ab0Var = new ab0(this, context, d6Var);
        this.f24927b = ab0Var;
        gg.j0 j0Var = new gg.j0((Object) this, 3);
        this.f24928c = j0Var;
        j0Var.j1(1);
        ua0 ua0Var = new ua0(this);
        this.d = ua0Var;
        ua0Var.O = new va0(this);
        s4.j jVar = new s4.j();
        jVar.f46628c = 150L;
        jVar.f46629e = 150L;
        jVar.f46630f = 150L;
        jVar.f46631g = 150L;
        jVar.d = 150L;
        jVar.f46603o = tr.f31215f;
        jVar.C = false;
        ab0Var.setItemAnimator(jVar);
        ab0Var.setClipToPadding(false);
        ab0Var.setLayoutManager(j0Var);
        gg.k1 k1Var = new gg.k1(context, j3, j10, new wa0(this, n2Var), d6Var, h());
        this.f24930f = k1Var;
        ?? h0Var = new s4.h0();
        h0Var.d = null;
        h0Var.f10763f = false;
        gg.p1 p1Var = new gg.p1(h0Var, 0);
        h0Var.f10761c = k1Var;
        k1Var.B(p1Var);
        this.f24929e = h0Var;
        ab0Var.setAdapter(h0Var);
        ab0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(ab0Var, w7.z5.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        ua0 ua0Var;
        gg.k1 k1Var;
        int height;
        ab0 ab0Var = this.f24927b;
        if (ab0Var != null && this.f24928c != null) {
            boolean g10 = g();
            this.f24933s = 0.0f;
            gg.q1 q1Var = this.f24929e;
            if (g10) {
                if (q1Var.f10763f) {
                    height = q1Var.f10762e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, ab0Var.getTranslationY() + height) + this.f24933s, (1.0f - this.M) * getHeight());
                this.f24931n = 0.0f;
                this.f24932r = min;
            } else {
                if (q1Var.f10763f) {
                    i10 = q1Var.f10762e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f24931n = Math.max(Math.max(0.0f, ab0Var.getTranslationY() + i10) - this.f24933s, this.M * getHeight());
                this.f24932r = getMeasuredHeight();
            }
            ch.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f24931n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f24932r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.f4633l.f4624m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (ab0Var != null && (ua0Var = this.d) != null && ab0Var.getLayoutManager() == ua0Var && (k1Var = this.f24930f) != null && k1Var.R != null) {
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
        ua0 ua0Var;
        gg.k1 k1Var;
        ab0 ab0Var = this.f24927b;
        if (ab0Var != null && this.f24928c != null) {
            int i11 = 0;
            if (ab0Var != null && (ua0Var = this.d) != null && ab0Var.getLayoutManager() == ua0Var && (k1Var = this.f24930f) != null && k1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                ab0Var.setPadding(0, 0, 0, 0);
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
            ab0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f24931n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f24927b, (Utilities.Callback<View>) new ai.i(13));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int v02;
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
        gg.k1 k1Var = this.f24930f;
        if ((k1Var.N() || k1Var.R != null) && ((k1Var.f10698x0 || k1Var.A0 != null) && k1Var.I() == null && k1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f24933s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f24931n;
        gg.q1 q1Var = this.f24929e;
        ab0 ab0Var = this.f24927b;
        Rect rect = this.f24936y;
        if (g10) {
            if (q1Var.f10763f) {
                height = q1Var.f10762e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, ab0Var.getTranslationY() + height) + this.f24933s, (1.0f - this.M) * getHeight());
            this.f24931n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f24932r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f24932r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (ab0Var.getLayoutManager() == this.d) {
                this.f24933s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (q1Var.f10763f) {
                i11 = q1Var.f10762e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, ab0Var.getTranslationY() + i11) - this.f24933s;
            this.f24931n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f24931n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f24932r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f24931n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f24931n) > 0.1f) {
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
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sd, this.f24926a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f24932r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.o0 layoutManager = this.f24927b.getLayoutManager();
        gg.j0 j0Var = this.f24928c;
        if (layoutManager == j0Var && j0Var.f46531t) {
            return true;
        }
        return false;
    }

    public gg.k1 getAdapter() {
        return this.f24930f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.o0 layoutManager = this.f24927b.getLayoutManager();
        gg.j0 j0Var = this.f24928c;
        if (layoutManager == j0Var) {
            return j0Var;
        }
        return this.d;
    }

    public ab0 getListView() {
        return this.f24927b;
    }

    public s4.c0 getNeededLayoutManager() {
        gg.k1 k1Var = this.f24930f;
        if ((!k1Var.N() && k1Var.R == null) || (!k1Var.f10698x0 && k1Var.A0 == null)) {
            return this.f24928c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof ai.c4;
    }

    public final void o(boolean z10) {
        long j3;
        float computeVerticalScrollOffset;
        int i10;
        if (z10) {
            boolean g10 = g();
            if (!this.I) {
                this.H = true;
                ab0 ab0Var = this.f24927b;
                s4.o0 layoutManager = ab0Var.getLayoutManager();
                gg.j0 j0Var = this.f24928c;
                if (layoutManager == j0Var) {
                    if (g10) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    j0Var.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = ab0Var.computeVerticalScrollOffset() + this.v;
                    }
                    ab0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        aq aqVar = this.J;
        AndroidUtilities.cancelRunOnUIThread(aqVar);
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
        AndroidUtilities.runOnUIThread(aqVar, j3);
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

    public final void p(ya0 ya0Var) {
        this.f24935x = ya0Var;
        ab0 listView = getListView();
        ai.n6 n6Var = new ai.n6(12, this, ya0Var);
        this.f24934w = n6Var;
        listView.setOnItemClickListener(n6Var);
        getListView().setOnTouchListener(new yr(this, 3));
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
        dVar.y(AndroidUtilities.dp(22.0f));
        this.R.x(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j3) {
        gg.k1 k1Var = this.f24930f;
        if (k1Var.f10683n != j3) {
            k1Var.f10683n = j3;
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
            this.f24928c.k1(z10);
            gg.k1 k1Var = this.f24930f;
            if (k1Var.L0 != z10) {
                k1Var.L0 = z10;
                int i10 = k1Var.M0;
                if (i10 > 0) {
                    k1Var.m(0);
                }
                if (i10 > 1) {
                    k1Var.m(i10 - 1);
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
