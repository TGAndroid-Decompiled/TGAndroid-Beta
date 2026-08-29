package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class ka0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int Q = 0;
    public Paint A;
    public Integer B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final rp F;
    public o1.k G;
    public boolean H;
    public float I;
    public boolean J;
    public int K;
    public ArrayList L;
    public final ga0 M;
    public ng.d N;
    public final Path O;
    public final RectF P;
    public final org.telegram.ui.ActionBar.c6 f29995a;
    public final ja0 f29996b;
    public final org.telegram.ui.vq f29997c;
    public final da0 d;
    public final rf.a1 f29998e;
    public final rf.v0 f29999f;
    public final org.telegram.ui.ActionBar.o2 h;
    public float f30000n;
    public float f30001r;
    public float f30002s;
    public float v;
    public eg.w0 f30003w;
    public ha0 f30004x;
    public final Rect f30005y;

    public ka0(Context context, long j10, long j11, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30005y = new Rect();
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = new rp(this, 27);
        this.H = false;
        this.I = 0.0f;
        this.J = false;
        this.M = new ga0(this);
        this.O = new Path();
        this.P = new RectF();
        this.h = o2Var;
        this.f29995a = c6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ja0 ja0Var = new ja0(this, context, c6Var);
        this.f29996b = ja0Var;
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((Object) this, 2);
        this.f29997c = vqVar;
        vqVar.j1(1);
        da0 da0Var = new da0(this);
        this.d = da0Var;
        da0Var.O = new ea0(this);
        f2.l lVar = new f2.l();
        lVar.f6486c = 150L;
        lVar.f6487e = 150L;
        lVar.f6488f = 150L;
        lVar.f6489g = 150L;
        lVar.d = 150L;
        lVar.f6404o = jr.f29800f;
        lVar.C = false;
        ja0Var.setItemAnimator(lVar);
        ja0Var.setClipToPadding(false);
        ja0Var.setLayoutManager(vqVar);
        rf.v0 v0Var = new rf.v0(context, j10, j11, new fa0(this, o2Var), c6Var, h());
        this.f29999f = v0Var;
        ?? p0Var = new f2.p0();
        p0Var.d = null;
        p0Var.f47174f = false;
        f2.f1 f1Var = new f2.f1(p0Var, 2);
        p0Var.f47172c = v0Var;
        v0Var.B(f1Var);
        this.f29998e = p0Var;
        ja0Var.setAdapter(p0Var);
        ja0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(ja0Var, i7.f6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        da0 da0Var;
        rf.v0 v0Var;
        int height;
        ja0 ja0Var = this.f29996b;
        if (ja0Var != null && this.f29997c != null) {
            boolean g10 = g();
            this.f30002s = 0.0f;
            rf.a1 a1Var = this.f29998e;
            if (g10) {
                if (a1Var.f47174f) {
                    height = a1Var.f47173e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, ja0Var.getTranslationY() + height) + this.f30002s, (1.0f - this.I) * getHeight());
                this.f30000n = 0.0f;
                this.f30001r = min;
            } else {
                if (a1Var.f47174f) {
                    i10 = a1Var.f47173e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f30000n = Math.max(Math.max(0.0f, ja0Var.getTranslationY() + i10) - this.f30002s, this.I * getHeight());
                this.f30001r = getMeasuredHeight();
            }
            ng.d dVar = this.N;
            if (dVar != null) {
                dVar.setBounds(0, ((int) this.f30000n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f30001r));
                Path path = this.O;
                path.rewind();
                Rect rect = this.N.h.f17336m;
                RectF rectF = this.P;
                rectF.set(rect);
                if (ja0Var != null && (da0Var = this.d) != null && ja0Var.getLayoutManager() == da0Var && (v0Var = this.f29999f) != null && v0Var.N != null) {
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
        float f9;
        int i10;
        da0 da0Var;
        rf.v0 v0Var;
        ja0 ja0Var = this.f29996b;
        if (ja0Var != null && this.f29997c != null) {
            int i11 = 0;
            if (ja0Var != null && (da0Var = this.d) != null && ja0Var.getLayoutManager() == da0Var && (v0Var = this.f29999f) != null && v0Var.N != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.N == null) {
                ja0Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f10 = 5.0f;
            if (z10) {
                f9 = 7.0f;
            } else {
                f9 = 5.0f;
            }
            int dp = AndroidUtilities.dp(f9);
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
            ja0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f30000n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f29996b, (f5.d) new l4.x0(8));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int v02;
        int height;
        ng.d dVar = this.N;
        if (dVar != null) {
            dVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.O);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        rf.v0 v0Var = this.f29999f;
        if ((v0Var.N() || v0Var.N != null) && ((v0Var.f47386t0 || v0Var.f47390w0 != null) && v0Var.I() == null && v0Var.Q == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f30002s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f9 = this.f30000n;
        rf.a1 a1Var = this.f29998e;
        ja0 ja0Var = this.f29996b;
        Rect rect = this.f30005y;
        if (g10) {
            if (a1Var.f47174f) {
                height = a1Var.f47173e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, ja0Var.getTranslationY() + height) + this.f30002s, (1.0f - this.I) * getHeight());
            this.f30000n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f30001r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f30001r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (ja0Var.getLayoutManager() == this.d) {
                this.f30002s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (a1Var.f47174f) {
                i11 = a1Var.f47173e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, ja0Var.getTranslationY() + i11) - this.f30002s;
            this.f30000n = max;
            float max2 = Math.max(max, this.I * getHeight());
            this.f30000n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f30001r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f30000n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f9 - this.f30000n) > 0.1f) {
            i();
        }
        if (this.A == null) {
            Paint paint = new Paint(1);
            this.A = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.A;
        Integer num = this.B;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, this.f29995a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f30001r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f9) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f9, f9, this.A);
    }

    public final boolean g() {
        f2.w0 layoutManager = this.f29996b.getLayoutManager();
        org.telegram.ui.vq vqVar = this.f29997c;
        if (layoutManager == vqVar && vqVar.f6367t) {
            return true;
        }
        return false;
    }

    public rf.v0 getAdapter() {
        return this.f29999f;
    }

    public f2.j0 getCurrentLayoutManager() {
        f2.w0 layoutManager = this.f29996b.getLayoutManager();
        org.telegram.ui.vq vqVar = this.f29997c;
        if (layoutManager == vqVar) {
            return vqVar;
        }
        return this.d;
    }

    public ja0 getListView() {
        return this.f29996b;
    }

    public f2.j0 getNeededLayoutManager() {
        rf.v0 v0Var = this.f29999f;
        if ((!v0Var.N() && v0Var.N == null) || (!v0Var.f47386t0 && v0Var.f47390w0 == null)) {
            return this.f29997c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof lh.p2;
    }

    public final void o(boolean z10) {
        long j10;
        float computeVerticalScrollOffset;
        int i10;
        if (z10) {
            boolean g10 = g();
            if (!this.E) {
                this.D = true;
                ja0 ja0Var = this.f29996b;
                f2.w0 layoutManager = ja0Var.getLayoutManager();
                org.telegram.ui.vq vqVar = this.f29997c;
                if (layoutManager == vqVar) {
                    if (g10) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    vqVar.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.I = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = ja0Var.computeVerticalScrollOffset() + this.v;
                    }
                    ja0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.D = false;
        }
        this.E = z10;
        rp rpVar = this.F;
        AndroidUtilities.cancelRunOnUIThread(rpVar);
        o1.k kVar = this.G;
        if (kVar != null) {
            kVar.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        if (o2Var != null && o2Var.getFragmentBeginToShow()) {
            j10 = 0;
        } else {
            j10 = 100;
        }
        AndroidUtilities.runOnUIThread(rpVar, j10);
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

    public final void p(ha0 ha0Var) {
        this.f30004x = ha0Var;
        ja0 listView = getListView();
        eg.w0 w0Var = new eg.w0(13, this, ha0Var);
        this.f30003w = w0Var;
        listView.setOnItemClickListener(w0Var);
        getListView().setOnTouchListener(new pr(this, 2));
    }

    @Override
    public final void requestLayout() {
        if (this.C) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(ng.d dVar) {
        this.N = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.N.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        rf.v0 v0Var = this.f29999f;
        if (v0Var.f47377n != j10) {
            v0Var.f47377n = j10;
        }
    }

    public void setIgnoreLayout(boolean z10) {
        this.C = z10;
    }

    public void setOverrideColor(int i10) {
        this.B = Integer.valueOf(i10);
        invalidate();
    }

    public void setReversed(boolean z10) {
        if (z10 != g()) {
            this.D = true;
            this.f29997c.k1(z10);
            rf.v0 v0Var = this.f29999f;
            if (v0Var.G0 != z10) {
                v0Var.G0 = z10;
                int i10 = v0Var.H0;
                if (i10 > 0) {
                    v0Var.m(0);
                }
                if (i10 > 1) {
                    v0Var.m(i10 - 1);
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
