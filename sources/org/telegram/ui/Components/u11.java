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
public final class u11 extends FrameLayout implements org.telegram.messenger.vs {
    public static final int f30816e0 = 0;
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
    public hi0 O;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public float U;
    public VelocityTracker V;
    public final HashMap W;
    public final int f30817a;
    public final TextPaint f30818a0;
    public final long f30819b;
    public final TextPaint f30820b0;
    public final boolean f30821c;
    public final TextPaint f30822c0;
    public final boolean d;
    public final TextPaint f30823d0;
    public final org.telegram.ui.ActionBar.p6 e;
    public final org.telegram.ui.al f30824f;
    public final org.telegram.ui.Cells.a5 h;
    public final ImageView f30825n;
    public final uk0 f30826r;
    public final r11 f30827s;
    public final EditText f30828w;
    public final Paint f30829x;
    public float f30830y;

    public u11(android.app.Activity r40, int r41, long r42, org.telegram.ui.ActionBar.p6 r44, final org.telegram.ui.al r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u11.<init>(android.app.Activity, int, long, org.telegram.ui.ActionBar.p6, org.telegram.ui.al):void");
    }

    private int getPanelWidth() {
        return this.I + this.H;
    }

    public final void a(float f7, float f10) {
        long j10;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        float f11 = this.f30830y;
        if (f11 == f7) {
            setProgress(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f7);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 27));
        this.J.addListener(new q11(this, 0));
        float abs = Math.abs(f7 - this.f30830y) * getPanelWidth();
        if (Math.abs(f10) > org.telegram.messenger.i0.L(300.0f)) {
            j10 = Math.max(150.0f, Math.min(320.0f, (abs / Math.abs(f10)) * 1000.0f * 2.0f));
        } else {
            j10 = 320;
        }
        this.J.setDuration(j10);
        this.J.setInterpolator(gr.h);
        this.J.start();
    }

    public final void b() {
        hi0 hi0Var = this.O;
        if (hi0Var != null) {
            org.telegram.messenger.i0.r(hi0Var);
            this.O = null;
        }
        if (this.N != 0) {
            ConnectionsManager.getInstance(this.f30817a).cancelRequest(this.N, true);
            this.N = 0;
        }
    }

    public final void c() {
        a(0.0f, 0.0f);
        org.telegram.messenger.i0.v1(this.f30828w);
    }

    public final TLObject d(s11 s11Var) {
        long o10;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.f30817a);
        org.telegram.messenger.gw gwVar = s11Var.f30154b;
        if (gwVar != null) {
            o10 = gwVar.f15965a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = s11Var.f30153a;
            if (tL_forumTopic != null && this.f30821c) {
                o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
            } else {
                return null;
            }
        }
        if (o10 >= 0) {
            return r12.Z1(Long.valueOf(o10));
        }
        return r12.L0(Long.valueOf(-o10));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14771q5) {
            if (((Long) objArr[0]).longValue() == (-this.f30819b)) {
                g();
            }
        } else if (i10 == org.telegram.messenger.at.f14772r) {
            g();
        } else if (i10 == org.telegram.messenger.at.f14713g3) {
            if (this.d) {
                g();
            }
        } else if (i10 == org.telegram.messenger.at.f14726i4) {
            org.telegram.messenger.i0.d0(this.f30826r, new ag.z0(2));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.t6.r1(this.f30830y, 687865856);
        Paint paint = this.f30829x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.al alVar = this.f30824f;
        if (alVar != null && this.f30830y > 0.0f) {
            org.telegram.ui.un.L2(alVar.f35802a, canvas);
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
        int i10 = 0;
        this.P = false;
        if (this.f30830y <= 0.0f) {
            i10 = 8;
        }
        setVisibility(i10);
        return dispatchTouchEvent;
    }

    public final String e(long j10) {
        int i10 = this.f30817a;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        if (j10 == org.telegram.messenger.e20.i(i10).e()) {
            return org.telegram.messenger.dd.L0(2131748318, null);
        }
        if (j10 == 2666000) {
            return org.telegram.messenger.dd.L0(2131754252, null);
        }
        if (j10 >= 0) {
            return org.telegram.messenger.i20.p(r12.Z1(Long.valueOf(j10)));
        }
        TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
        if (L0 != null) {
            return L0.title;
        }
        return "";
    }

    public final boolean f(s11 s11Var) {
        String str;
        org.telegram.messenger.gw gwVar = s11Var.f30154b;
        String str2 = "";
        if (gwVar != null) {
            String e = e(gwVar.f15965a);
            if (e != null) {
                str2 = e.toString();
            }
        } else {
            TLObject d = d(s11Var);
            if (d instanceof TLRPC.User) {
                str2 = org.telegram.messenger.i20.p((TLRPC.User) d);
            } else if (d instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) d).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = s11Var.f30153a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.L);
    }

    public final void g() {
        boolean z10;
        String str;
        String str2;
        int visibility = getVisibility();
        r11 r11Var = this.f30827s;
        if (visibility != 0 && this.f30830y <= 0.0f && r11Var.f29856c.size() > 0) {
            return;
        }
        ArrayList arrayList = r11Var.f29856c;
        String str3 = r11Var.d;
        u11 u11Var = r11Var.e;
        String str4 = u11Var.L;
        int i10 = u11Var.f30817a;
        int i11 = 0;
        if (TextUtils.equals(str3, str4) && u11Var.f30830y > 0.0f && !arrayList.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        r11Var.d = u11Var.L;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(u11Var.L)) {
            arrayList.add(new s11(u11Var));
        }
        if (u11Var.d) {
            ArrayList arrayList3 = org.telegram.messenger.wp.r1(i10).F1().f16121j;
            int size = arrayList3.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                s11 s11Var = new s11(u11Var);
                s11Var.f30154b = (org.telegram.messenger.gw) obj;
                if (!TextUtils.isEmpty(u11Var.L) && !u11Var.f(s11Var)) {
                    TLObject d = u11Var.d(s11Var);
                    if (d instanceof TLRPC.User) {
                        str2 = org.telegram.messenger.i20.n((TLRPC.User) d);
                    } else if (d instanceof TLRPC.Chat) {
                        str2 = org.telegram.messenger.w3.K((TLRPC.Chat) d, false);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null && str2.toLowerCase().contains(u11Var.L)) {
                    }
                }
                arrayList.add(s11Var);
            }
            if (!z10) {
                r11Var.f();
                return;
            } else {
                s4.n.c(new hg.a(r11Var, arrayList2, 3), true).c(r11Var);
                return;
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList l4 = org.telegram.messenger.wp.r1(i10).f19234r7.l(-u11Var.f30819b);
        if (l4 != null) {
            int size2 = l4.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = l4.get(i13);
                i13++;
                s11 s11Var2 = new s11(u11Var);
                s11Var2.f30153a = (TLRPC.TL_forumTopic) obj2;
                if (!TextUtils.isEmpty(u11Var.L) && !u11Var.f(s11Var2)) {
                    TLObject d10 = u11Var.d(s11Var2);
                    if (d10 instanceof TLRPC.User) {
                        str = org.telegram.messenger.i20.n((TLRPC.User) d10);
                    } else if (d10 instanceof TLRPC.Chat) {
                        str = org.telegram.messenger.w3.K((TLRPC.Chat) d10, false);
                    } else {
                        str = null;
                    }
                    if (str != null && str.toLowerCase().contains(u11Var.L)) {
                    }
                }
                arrayList.add(s11Var2);
                hashSet.add(Long.valueOf(s11Var2.a()));
            }
        }
        if (!TextUtils.isEmpty(u11Var.L)) {
            ArrayList arrayList4 = u11Var.M;
            int size3 = arrayList4.size();
            while (i11 < size3) {
                Object obj3 = arrayList4.get(i11);
                i11++;
                s11 s11Var3 = new s11(u11Var);
                s11Var3.f30153a = (TLRPC.TL_forumTopic) obj3;
                if (hashSet.add(Long.valueOf(s11Var3.a()))) {
                    arrayList.add(s11Var3);
                }
            }
        }
        if (!z10) {
            r11Var.f();
        } else {
            s4.n.c(new hg.a(r11Var, arrayList2, 3), true).c(r11Var);
        }
    }

    public int getContentWidth() {
        return this.I;
    }

    public float getProgress() {
        return this.f30830y;
    }

    public final void h() {
        View view;
        View view2 = this.E;
        if (view2 != null && (view = this.F) != null) {
            uk0 uk0Var = this.f30826r;
            view2.setAlpha(Utilities.i(uk0Var.computeVerticalScrollOffset() / org.telegram.messenger.i0.L(16.0f), 1.0f, 0.0f));
            if (this.D != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((uk0Var.computeVerticalScrollRange() - uk0Var.computeVerticalScrollOffset()) - uk0Var.computeVerticalScrollExtent()) / org.telegram.messenger.i0.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f30817a;
        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.f14771q5);
        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.f14713g3);
        org.telegram.messenger.at.e().b(this, org.telegram.messenger.at.f14726i4);
        g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f30817a;
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14771q5);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14713g3);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
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
            this.U = this.f30830y;
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
            float y3 = motionEvent.getY() - this.R;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y3) * 1.5f) {
                this.S = true;
                this.Q = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.j1 a2 = r0.a0.a(this);
        if (a2 != null) {
            i14 = a2.f46143a.f(2).d;
        } else {
            i14 = 0;
        }
        if (i14 != this.G) {
            this.G = i14;
            uk0 uk0Var = this.f30826r;
            View view = this.F;
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(8.0f) + i14;
                view.getLayoutParams().height = org.telegram.messenger.i0.L(64.0f) + i14;
                uk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(66.0f) + i14);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.i0.L(24.0f) + i14;
                uk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.0f) + i14);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.un unVar;
        org.telegram.ui.ActionBar.t0 j92;
        org.telegram.ui.ActionBar.l lVar;
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.j1 a2 = r0.a0.a(this);
        int i13 = 0;
        if (a2 != null) {
            i12 = org.telegram.messenger.i0.I0(a2, false).f7768c;
        } else {
            i12 = 0;
        }
        int i14 = this.H;
        org.telegram.ui.Cells.a5 a5Var = this.h;
        if (i12 != i14) {
            this.H = i12;
            a5Var.getLayoutParams().width = getPanelWidth();
            a5Var.setPadding(0, 0, i12, 0);
            a5Var.setTranslationX((1.0f - this.f30830y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i10);
        org.telegram.ui.al alVar = this.f30824f;
        if (alVar != null && (j92 = (unVar = alVar.f35802a).j9()) != null) {
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            i13 = (int) ((lVar.getWidth() - ((j92.getWidth() / 2.0f) + (j92.getX() + ((View) j92.getParent()).getX()))) + org.telegram.messenger.i0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.i0.L(200.0f), Math.min(org.telegram.messenger.i0.L(288.0f), (size - this.H) - i13));
        if (max != this.I) {
            this.I = max;
            a5Var.getLayoutParams().width = getPanelWidth();
            a5Var.setTranslationX((1.0f - this.f30830y) * getPanelWidth());
            this.f30827s.f();
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u11.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentTopic(long j10) {
        this.K = j10;
        this.f30827s.f();
    }

    public void setMenuAvailable(boolean z10) {
        int i10;
        ImageView imageView = this.f30825n;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setProgress(float f7) {
        int i10;
        this.f30830y = Utilities.l(f7);
        this.h.setTranslationX((1.0f - this.f30830y) * getPanelWidth());
        if (this.f30830y <= 0.0f && !this.P) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        setVisibility(i10);
        invalidate();
        org.telegram.ui.al alVar = this.f30824f;
        if (alVar != null) {
            alVar.f35802a.l1.invalidate();
        }
    }

    public void settle(float f7) {
        boolean z10 = false;
        float f10 = 0.0f;
        if (Math.abs(f7) <= org.telegram.messenger.i0.L(300.0f) ? this.f30830y > 0.5f : f7 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            g();
        }
        if (z10) {
            f10 = 1.0f;
        }
        a(f10, f7);
        if (!z10) {
            org.telegram.messenger.i0.v1(this.f30828w);
        }
    }
}
