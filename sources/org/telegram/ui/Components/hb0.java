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
public abstract class hb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int U = 0;
    public Paint E;
    public Integer F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final xa0 J;
    public o1.j K;
    public boolean L;
    public float M;
    public boolean N;
    public int O;
    public ArrayList P;
    public final db0 Q;
    public eh.d R;
    public final Path S;
    public final RectF T;
    public final org.telegram.ui.ActionBar.u6 f28940a;
    public final gb0 f28941b;
    public final ig.j0 f28942c;
    public final ab0 d;
    public final ig.p1 e;
    public final ig.j1 f28943f;
    public final org.telegram.ui.ActionBar.r2 h;
    public float f28944n;
    public float f28945r;
    public float f28946s;
    public float v;
    public di.x4 f28947w;
    public eb0 f28948x;
    public final Rect f28949y;

    public hb0(Context context, long j10, long j11, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f28949y = new Rect();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = new xa0(this, 0);
        this.L = false;
        this.M = 0.0f;
        this.N = false;
        this.Q = new db0(this);
        this.S = new Path();
        this.T = new RectF();
        this.h = r2Var;
        this.f28940a = u6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        gb0 gb0Var = new gb0(this, context, u6Var);
        this.f28941b = gb0Var;
        ig.j0 j0Var = new ig.j0((Object) this, 3);
        this.f28942c = j0Var;
        j0Var.k1(1);
        ab0 ab0Var = new ab0(this);
        this.d = ab0Var;
        ab0Var.O = new bb0(this);
        s4.l lVar = new s4.l();
        lVar.f47838c = 150L;
        lVar.e = 150L;
        lVar.f47839f = 150L;
        lVar.f47840g = 150L;
        lVar.d = 150L;
        lVar.f47822o = ds.f27530f;
        lVar.C = false;
        gb0Var.setItemAnimator(lVar);
        gb0Var.setClipToPadding(false);
        gb0Var.setLayoutManager(j0Var);
        ig.j1 j1Var = new ig.j1(context, j10, j11, new cb0(this, r2Var), u6Var, h());
        this.f28943f = j1Var;
        ?? h0Var = new s4.h0();
        h0Var.d = null;
        h0Var.f14203f = false;
        ig.o1 o1Var = new ig.o1(h0Var, 0);
        h0Var.f14202c = j1Var;
        j1Var.B(o1Var);
        this.e = h0Var;
        gb0Var.setAdapter(h0Var);
        gb0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(gb0Var, kb1.g(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        ab0 ab0Var;
        ig.j1 j1Var;
        int height;
        gb0 gb0Var = this.f28941b;
        if (gb0Var != null && this.f28942c != null) {
            boolean g7 = g();
            this.f28946s = 0.0f;
            ig.p1 p1Var = this.e;
            if (g7) {
                if (p1Var.f14203f) {
                    height = p1Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, gb0Var.getTranslationY() + height) + this.f28946s, (1.0f - this.M) * getHeight());
                this.f28944n = 0.0f;
                this.f28945r = min;
            } else {
                if (p1Var.f14203f) {
                    i10 = p1Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f28944n = Math.max(Math.max(0.0f, gb0Var.getTranslationY() + i10) - this.f28946s, this.M * getHeight());
                this.f28945r = getMeasuredHeight();
            }
            eh.d dVar = this.R;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f28944n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f28945r));
                Path path = this.S;
                path.rewind();
                Rect rect = this.R.f9965x.f9957m;
                RectF rectF = this.T;
                rectF.set(rect);
                if (gb0Var != null && (ab0Var = this.d) != null && gb0Var.getLayoutManager() == ab0Var && (j1Var = this.f28943f) != null && j1Var.R != null) {
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
        ab0 ab0Var;
        ig.j1 j1Var;
        gb0 gb0Var = this.f28941b;
        if (gb0Var != null && this.f28942c != null) {
            int i11 = 0;
            if (gb0Var != null && (ab0Var = this.d) != null && gb0Var.getLayoutManager() == ab0Var && (j1Var = this.f28943f) != null && j1Var.R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.R == null) {
                gb0Var.setPadding(0, 0, 0, 0);
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
            gb0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f28944n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f28941b, (Utilities.Callback<View>) new di.e(13));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int w02;
        int height;
        eh.d dVar = this.R;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.S);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g7 = g();
        ig.j1 j1Var = this.f28943f;
        if ((j1Var.N() || j1Var.R != null) && ((j1Var.f14138x0 || j1Var.A0 != null) && j1Var.I() == null && j1Var.U == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f28946s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f7 = this.f28944n;
        ig.p1 p1Var = this.e;
        gb0 gb0Var = this.f28941b;
        Rect rect = this.f28949y;
        if (g7) {
            if (p1Var.f14203f) {
                height = p1Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, gb0Var.getTranslationY() + height) + this.f28946s, (1.0f - this.M) * getHeight());
            this.f28944n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f28945r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f28945r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (gb0Var.getLayoutManager() == this.d) {
                this.f28946s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (p1Var.f14203f) {
                i11 = p1Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, gb0Var.getTranslationY() + i11) - this.f28946s;
            this.f28944n = max;
            float max2 = Math.max(max, this.M * getHeight());
            this.f28944n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f28945r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f28944n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f7 - this.f28944n) > 0.1f) {
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
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sd, this.f28940a);
        }
        paint2.setColor(w02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f28945r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f7) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f7, f7, this.E);
    }

    public final boolean g() {
        s4.p0 layoutManager = this.f28941b.getLayoutManager();
        ig.j0 j0Var = this.f28942c;
        if (layoutManager == j0Var && j0Var.f47748t) {
            return true;
        }
        return false;
    }

    public ig.j1 getAdapter() {
        return this.f28943f;
    }

    public s4.c0 getCurrentLayoutManager() {
        s4.p0 layoutManager = this.f28941b.getLayoutManager();
        ig.j0 j0Var = this.f28942c;
        if (layoutManager == j0Var) {
            return j0Var;
        }
        return this.d;
    }

    public gb0 getListView() {
        return this.f28941b;
    }

    public s4.c0 getNeededLayoutManager() {
        ig.j1 j1Var = this.f28943f;
        if ((!j1Var.N() && j1Var.R == null) || (!j1Var.f14138x0 && j1Var.A0 == null)) {
            return this.f28942c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof di.w2;
    }

    public final void o(boolean z10) {
        long j10;
        float computeVerticalScrollOffset;
        int i10;
        if (z10) {
            boolean g7 = g();
            if (!this.I) {
                this.H = true;
                gb0 gb0Var = this.f28941b;
                s4.p0 layoutManager = gb0Var.getLayoutManager();
                ig.j0 j0Var = this.f28942c;
                if (layoutManager == j0Var) {
                    if (g7) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    j0Var.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.M = 1.0f;
                    if (g7) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = gb0Var.computeVerticalScrollOffset() + this.v;
                    }
                    gb0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.H = false;
        }
        this.I = z10;
        xa0 xa0Var = this.J;
        AndroidUtilities.cancelRunOnUIThread(xa0Var);
        o1.j jVar = this.K;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.h;
        if (r2Var != null && r2Var.getFragmentBeginToShow()) {
            j10 = 0;
        } else {
            j10 = 100;
        }
        AndroidUtilities.runOnUIThread(xa0Var, j10);
        if (z10) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
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

    public final void p(eb0 eb0Var) {
        this.f28948x = eb0Var;
        gb0 listView = getListView();
        di.x4 x4Var = new di.x4(12, this, eb0Var);
        this.f28947w = x4Var;
        listView.setOnItemClickListener(x4Var);
        getListView().setOnTouchListener(new rk(this, 4));
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(eh.d dVar) {
        this.R = dVar;
        dVar.x(AndroidUtilities.dp(22.0f));
        this.R.w(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        ig.j1 j1Var = this.f28943f;
        if (j1Var.f14123n != j10) {
            j1Var.f14123n = j10;
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
            this.f28942c.l1(z10);
            ig.j1 j1Var = this.f28943f;
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

    public void m() {
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z10) {
    }

    public void n(boolean z10) {
    }
}
