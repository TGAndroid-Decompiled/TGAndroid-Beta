package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n01 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int f36185e0 = 0;
    public final FrameLayout D;
    public final View E;
    public final View F;
    public int G;
    public int H;
    public int I;
    public ValueAnimator J;
    public long K;
    public String L;
    public final ArrayList M;
    public int N;
    public v80 O;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public float U;
    public VelocityTracker V;
    public final HashMap W;
    public final int f36186a;
    public final TextPaint f36187a0;
    public final long f36188b;
    public final TextPaint f36189b0;
    public final boolean f36190c;
    public final TextPaint f36191c0;
    public final boolean d;
    public final TextPaint f36192d0;
    public final org.telegram.ui.ActionBar.f6 f36193e;
    public final org.telegram.ui.dk f36194f;
    public final di.a4 h;
    public final ImageView f36195n;
    public final pj0 f36196r;
    public final k01 f36197s;
    public final EditText f36198w;
    public final Paint f36199x;
    public float f36200y;

    public n01(android.app.Activity r40, int r41, long r42, org.telegram.ui.ActionBar.f6 r44, final org.telegram.ui.dk r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n01.<init>(android.app.Activity, int, long, org.telegram.ui.ActionBar.f6, org.telegram.ui.dk):void");
    }

    private int getPanelWidth() {
        return this.I + this.H;
    }

    public final void a(float f10, float f11) {
        long j3;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        float f12 = this.f36200y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new c60(this, 26));
        this.J.addListener(new j01(this, 0));
        float abs = Math.abs(f10 - this.f36200y) * getPanelWidth();
        if (Math.abs(f11) > org.telegram.messenger.g0.L(300.0f)) {
            j3 = Math.max(150.0f, Math.min(320.0f, (abs / Math.abs(f11)) * 1000.0f * 2.0f));
        } else {
            j3 = 320;
        }
        this.J.setDuration(j3);
        this.J.setInterpolator(xq.h);
        this.J.start();
    }

    public final void b() {
        v80 v80Var = this.O;
        if (v80Var != null) {
            org.telegram.messenger.g0.r(v80Var);
            this.O = null;
        }
        if (this.N != 0) {
            ConnectionsManager.getInstance(this.f36186a).cancelRequest(this.N, true);
            this.N = 0;
        }
    }

    public final void c() {
        a(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.f36198w);
    }

    public final TLObject d(l01 l01Var) {
        long o4;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.f36186a);
        org.telegram.messenger.uv uvVar = l01Var.f35467b;
        if (uvVar != null) {
            o4 = uvVar.f25886a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = l01Var.f35466a;
            if (tL_forumTopic != null && this.f36190c) {
                o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            } else {
                return null;
            }
        }
        if (o4 >= 0) {
            return s12.a2(Long.valueOf(o4));
        }
        return s12.M0(Long.valueOf(-o4));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25045q5) {
            if (((Long) objArr[0]).longValue() == (-this.f36188b)) {
                g();
            }
        } else if (i7 == org.telegram.messenger.qs.f25046r) {
            g();
        } else if (i7 == org.telegram.messenger.qs.f24988g3) {
            if (this.d) {
                g();
            }
        } else if (i7 == org.telegram.messenger.qs.f25001i4) {
            org.telegram.messenger.g0.d0(this.f36196r, new pg.c(0));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.k6.r1(this.f36200y, 687865856);
        Paint paint = this.f36199x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.dk dkVar = this.f36194f;
        if (dkVar != null && this.f36200y > 0.0f) {
            org.telegram.ui.an.M2(dkVar.f45061a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.P = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        int i7 = 0;
        this.P = false;
        if (this.f36200y <= 0.0f) {
            i7 = 8;
        }
        setVisibility(i7);
        return dispatchTouchEvent;
    }

    public final String e(long j3) {
        int i7 = this.f36186a;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        if (j3 == org.telegram.messenger.p10.i(i7).e()) {
            return org.telegram.messenger.hd.M0(2131748302, null);
        }
        if (j3 == 2666000) {
            return org.telegram.messenger.hd.M0(2131754252, null);
        }
        if (j3 >= 0) {
            return org.telegram.messenger.t10.p(s12.a2(Long.valueOf(j3)));
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        if (M0 != null) {
            return M0.title;
        }
        return "";
    }

    public final boolean f(l01 l01Var) {
        String str;
        org.telegram.messenger.uv uvVar = l01Var.f35467b;
        String str2 = "";
        if (uvVar != null) {
            String e10 = e(uvVar.f25886a);
            if (e10 != null) {
                str2 = e10.toString();
            }
        } else {
            TLObject d = d(l01Var);
            if (d instanceof TLRPC.User) {
                str2 = org.telegram.messenger.t10.p((TLRPC.User) d);
            } else if (d instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) d).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = l01Var.f35466a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.L);
    }

    public final void g() {
        boolean z9;
        String str;
        String str2;
        int visibility = getVisibility();
        k01 k01Var = this.f36197s;
        if (visibility != 0 && this.f36200y <= 0.0f && k01Var.f35137c.size() > 0) {
            return;
        }
        ArrayList arrayList = k01Var.f35137c;
        String str3 = k01Var.d;
        n01 n01Var = k01Var.f35138e;
        String str4 = n01Var.L;
        int i7 = n01Var.f36186a;
        int i10 = 0;
        if (TextUtils.equals(str3, str4) && n01Var.f36200y > 0.0f && !arrayList.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        k01Var.d = n01Var.L;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(n01Var.L)) {
            arrayList.add(new l01(n01Var));
        }
        if (n01Var.d) {
            ArrayList arrayList3 = org.telegram.messenger.qp.s1(i7).G1().f26204j;
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                l01 l01Var = new l01(n01Var);
                l01Var.f35467b = (org.telegram.messenger.uv) obj;
                if (!TextUtils.isEmpty(n01Var.L) && !n01Var.f(l01Var)) {
                    TLObject d = n01Var.d(l01Var);
                    if (d instanceof TLRPC.User) {
                        str2 = org.telegram.messenger.t10.n((TLRPC.User) d);
                    } else if (d instanceof TLRPC.Chat) {
                        str2 = org.telegram.messenger.t3.K((TLRPC.Chat) d, false);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null && str2.toLowerCase().contains(n01Var.L)) {
                    }
                }
                arrayList.add(l01Var);
            }
            if (!z9) {
                k01Var.f();
                return;
            } else {
                v4.o.c(new jg.h(k01Var, arrayList2, 3), true).c(k01Var);
                return;
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList l10 = org.telegram.messenger.qp.s1(i7).f24862q7.l(-n01Var.f36188b);
        if (l10 != null) {
            int size2 = l10.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = l10.get(i12);
                i12++;
                l01 l01Var2 = new l01(n01Var);
                l01Var2.f35466a = (TLRPC.TL_forumTopic) obj2;
                if (!TextUtils.isEmpty(n01Var.L) && !n01Var.f(l01Var2)) {
                    TLObject d2 = n01Var.d(l01Var2);
                    if (d2 instanceof TLRPC.User) {
                        str = org.telegram.messenger.t10.n((TLRPC.User) d2);
                    } else if (d2 instanceof TLRPC.Chat) {
                        str = org.telegram.messenger.t3.K((TLRPC.Chat) d2, false);
                    } else {
                        str = null;
                    }
                    if (str != null && str.toLowerCase().contains(n01Var.L)) {
                    }
                }
                arrayList.add(l01Var2);
                hashSet.add(Long.valueOf(l01Var2.a()));
            }
        }
        if (!TextUtils.isEmpty(n01Var.L)) {
            ArrayList arrayList4 = n01Var.M;
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj3 = arrayList4.get(i10);
                i10++;
                l01 l01Var3 = new l01(n01Var);
                l01Var3.f35466a = (TLRPC.TL_forumTopic) obj3;
                if (hashSet.add(Long.valueOf(l01Var3.a()))) {
                    arrayList.add(l01Var3);
                }
            }
        }
        if (!z9) {
            k01Var.f();
        } else {
            v4.o.c(new jg.h(k01Var, arrayList2, 3), true).c(k01Var);
        }
    }

    public int getContentWidth() {
        return this.I;
    }

    public float getProgress() {
        return this.f36200y;
    }

    public final void h() {
        View view;
        View view2 = this.E;
        if (view2 != null && (view = this.F) != null) {
            pj0 pj0Var = this.f36196r;
            view2.setAlpha(Utilities.i(pj0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            if (this.D != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((pj0Var.computeVerticalScrollRange() - pj0Var.computeVerticalScrollOffset()) - pj0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f36186a;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f25045q5);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f25046r);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f24988g3);
        org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.f25001i4);
        g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f36186a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25045q5);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25046r);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f24988g3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25001i4);
        b();
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            this.S = false;
            this.T = true;
            this.U = this.f36200y;
            VelocityTracker velocityTracker = this.V;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.V = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.T) {
            VelocityTracker velocityTracker2 = this.V;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.Q;
            float y10 = motionEvent.getY() - this.R;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y10) * 1.5f) {
                this.S = true;
                this.Q = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        WeakHashMap weakHashMap = r0.i0.f54073a;
        r0.k1 a10 = r0.b0.a(this);
        if (a10 != null) {
            i13 = a10.f54084a.f(2).d;
        } else {
            i13 = 0;
        }
        if (i13 != this.G) {
            this.G = i13;
            pj0 pj0Var = this.f36196r;
            View view = this.F;
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                pj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                pj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.an anVar;
        org.telegram.ui.ActionBar.r0 m92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.f54073a;
        r0.k1 a10 = r0.b0.a(this);
        int i12 = 0;
        if (a10 != null) {
            i11 = org.telegram.messenger.g0.I0(a10, false).f15119c;
        } else {
            i11 = 0;
        }
        int i13 = this.H;
        di.a4 a4Var = this.h;
        if (i11 != i13) {
            this.H = i11;
            a4Var.getLayoutParams().width = getPanelWidth();
            a4Var.setPadding(0, 0, i11, 0);
            a4Var.setTranslationX((1.0f - this.f36200y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.ui.dk dkVar = this.f36194f;
        if (dkVar != null && (m92 = (anVar = dkVar.f45061a).m9()) != null) {
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            i12 = (int) ((kVar.getWidth() - ((m92.getWidth() / 2.0f) + (m92.getX() + ((View) m92.getParent()).getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.H) - i12));
        if (max != this.I) {
            this.I = max;
            a4Var.getLayoutParams().width = getPanelWidth();
            a4Var.setTranslationX((1.0f - this.f36200y) * getPanelWidth());
            this.f36197s.f();
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n01.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentTopic(long j3) {
        this.K = j3;
        this.f36197s.f();
    }

    public void setMenuAvailable(boolean z9) {
        int i7;
        ImageView imageView = this.f36195n;
        if (imageView != null) {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    public void setProgress(float f10) {
        int i7;
        this.f36200y = Utilities.l(f10);
        this.h.setTranslationX((1.0f - this.f36200y) * getPanelWidth());
        if (this.f36200y <= 0.0f && !this.P) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        setVisibility(i7);
        invalidate();
        org.telegram.ui.dk dkVar = this.f36194f;
        if (dkVar != null) {
            dkVar.f45061a.l1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z9 = false;
        float f11 = 0.0f;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.f36200y > 0.5f : f10 < 0.0f) {
            z9 = true;
        }
        if (z9) {
            g();
        }
        if (z9) {
            f11 = 1.0f;
        }
        a(f11, f10);
        if (!z9) {
            org.telegram.messenger.g0.v1(this.f36198w);
        }
    }
}
