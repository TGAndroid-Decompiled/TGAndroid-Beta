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
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t11 extends FrameLayout implements org.telegram.messenger.us {
    public static final int f30409a0 = 0;
    public float D;
    public final FrameLayout E;
    public final View F;
    public final View G;
    public int H;
    public ValueAnimator I;
    public long J;
    public String K;
    public boolean L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public float Q;
    public VelocityTracker R;
    public final HashMap S;
    public final TextPaint T;
    public final TextPaint U;
    public final TextPaint V;
    public final TextPaint W;
    public final int f30410a;
    public final long f30411b;
    public final boolean f30412c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final org.telegram.ui.al f30413f;
    public final org.telegram.ui.Cells.a5 h;
    public final FrameLayout f30414n;
    public final ImageView f30415r;
    public final tk0 f30416s;
    public final q11 f30417w;
    public final EditText f30418x;
    public final Paint f30419y;

    public t11(android.app.Activity r40, int r41, long r42, boolean r44, org.telegram.ui.ActionBar.p6 r45, final org.telegram.ui.al r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t11.<init>(android.app.Activity, int, long, boolean, org.telegram.ui.ActionBar.p6, org.telegram.ui.al):void");
    }

    public final void a(float f7, float f10) {
        long j10;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
        }
        float f11 = this.D;
        if (f11 == f7) {
            setProgress(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f7);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 27));
        this.I.addListener(new p11(this, 0));
        float abs = Math.abs(f7 - this.D) * org.telegram.messenger.i0.L(288.0f);
        if (Math.abs(f10) > org.telegram.messenger.i0.L(300.0f)) {
            j10 = Math.max(150.0f, Math.min(320.0f, (abs / Math.abs(f10)) * 1000.0f * 2.0f));
        } else {
            j10 = 320;
        }
        this.I.setDuration(j10);
        this.I.setInterpolator(gr.h);
        this.I.start();
    }

    public final void b() {
        a(0.0f, 0.0f);
        org.telegram.messenger.i0.v1(this.f30418x);
    }

    public final TLObject c(r11 r11Var) {
        long o10;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.f30410a);
        org.telegram.messenger.fw fwVar = r11Var.f29799b;
        if (fwVar != null) {
            o10 = fwVar.f15624a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = r11Var.f29798a;
            if (tL_forumTopic != null && this.f30412c) {
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

    public final String d(long j10) {
        int i10 = this.f30410a;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        if (j10 == org.telegram.messenger.d20.i(i10).e()) {
            return org.telegram.messenger.cd.L0(2131748318, null);
        }
        if (j10 == 2666000) {
            return org.telegram.messenger.cd.L0(2131754252, null);
        }
        if (j10 >= 0) {
            return org.telegram.messenger.h20.p(r12.Z1(Long.valueOf(j10)));
        }
        TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
        if (L0 != null) {
            return L0.title;
        }
        return "";
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19675q5) {
            if (((Long) objArr[0]).longValue() == (-this.f30411b)) {
                f();
            }
        } else if (i10 == org.telegram.messenger.zs.f19676r) {
            f();
        } else if (i10 == org.telegram.messenger.zs.f19617g3) {
            if (this.d) {
                f();
            }
        } else if (i10 == org.telegram.messenger.zs.f19630i4) {
            org.telegram.messenger.i0.d0(this.f30416s, new ag.z0(2));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.t6.r1(this.D, 687865856);
        Paint paint = this.f30419y;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.L = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        int i10 = 0;
        this.L = false;
        if (this.D <= 0.0f) {
            i10 = 8;
        }
        setVisibility(i10);
        return dispatchTouchEvent;
    }

    public final boolean e(r11 r11Var) {
        String str;
        org.telegram.messenger.fw fwVar = r11Var.f29799b;
        String str2 = "";
        if (fwVar != null) {
            String d = d(fwVar.f15624a);
            if (d != null) {
                str2 = d.toString();
            }
        } else {
            TLObject c10 = c(r11Var);
            if (c10 instanceof TLRPC.User) {
                str2 = org.telegram.messenger.h20.p((TLRPC.User) c10);
            } else if (c10 instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) c10).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = r11Var.f29798a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.K);
    }

    public final void f() {
        String str;
        String str2;
        int visibility = getVisibility();
        q11 q11Var = this.f30417w;
        if (visibility != 0 && this.D <= 0.0f && q11Var.f29508c.size() > 0) {
            return;
        }
        ArrayList arrayList = q11Var.f29508c;
        arrayList.clear();
        t11 t11Var = q11Var.d;
        String str3 = t11Var.K;
        int i10 = t11Var.f30410a;
        if (TextUtils.isEmpty(str3)) {
            arrayList.add(new r11(t11Var));
        }
        if (t11Var.d) {
            ArrayList arrayList2 = org.telegram.messenger.vp.r1(i10).F1().f15772j;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                r11 r11Var = new r11(t11Var);
                r11Var.f29799b = (org.telegram.messenger.fw) obj;
                if (!TextUtils.isEmpty(t11Var.K) && !t11Var.e(r11Var)) {
                    TLObject c10 = t11Var.c(r11Var);
                    if (c10 instanceof TLRPC.User) {
                        str2 = org.telegram.messenger.h20.n((TLRPC.User) c10);
                    } else if (c10 instanceof TLRPC.Chat) {
                        str2 = org.telegram.messenger.w3.K((TLRPC.Chat) c10, false);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null && str2.toLowerCase().contains(t11Var.K)) {
                    }
                }
                arrayList.add(r11Var);
            }
            q11Var.f();
            return;
        }
        ArrayList l4 = org.telegram.messenger.vp.r1(i10).f18891r7.l(-t11Var.f30411b);
        if (l4 != null) {
            int size2 = l4.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = l4.get(i12);
                i12++;
                r11 r11Var2 = new r11(t11Var);
                r11Var2.f29798a = (TLRPC.TL_forumTopic) obj2;
                if (!TextUtils.isEmpty(t11Var.K) && !t11Var.e(r11Var2)) {
                    TLObject c11 = t11Var.c(r11Var2);
                    if (c11 instanceof TLRPC.User) {
                        str = org.telegram.messenger.h20.n((TLRPC.User) c11);
                    } else if (c11 instanceof TLRPC.Chat) {
                        str = org.telegram.messenger.w3.K((TLRPC.Chat) c11, false);
                    } else {
                        str = null;
                    }
                    if (str != null && str.toLowerCase().contains(t11Var.K)) {
                    }
                }
                arrayList.add(r11Var2);
            }
        }
        q11Var.f();
    }

    public final void g() {
        View view;
        View view2 = this.F;
        if (view2 != null && (view = this.G) != null) {
            tk0 tk0Var = this.f30416s;
            view2.setAlpha(Utilities.i(tk0Var.computeVerticalScrollOffset() / org.telegram.messenger.i0.L(16.0f), 1.0f, 0.0f));
            if (this.E != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((tk0Var.computeVerticalScrollRange() - tk0Var.computeVerticalScrollOffset()) - tk0Var.computeVerticalScrollExtent()) / org.telegram.messenger.i0.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    public float getProgress() {
        return this.D;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f30410a;
        org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.f19675q5);
        org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.f19676r);
        org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.f19617g3);
        org.telegram.messenger.zs.e().b(this, org.telegram.messenger.zs.f19630i4);
        f();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f30410a;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19675q5);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19676r);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19617g3);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.M = motionEvent.getX();
            this.N = motionEvent.getY();
            this.O = false;
            this.P = true;
            this.Q = this.D;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.R = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.P) {
            VelocityTracker velocityTracker2 = this.R;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.M;
            float y3 = motionEvent.getY() - this.N;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y3) * 1.5f) {
                this.O = true;
                this.M = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.j1 a2 = r0.a0.a(this);
        if (a2 != null) {
            i14 = a2.f46132a.f(2).d;
        } else {
            i14 = 0;
        }
        if (i14 != this.H) {
            this.H = i14;
            tk0 tk0Var = this.f30416s;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(8.0f) + i14;
                view.getLayoutParams().height = org.telegram.messenger.i0.L(64.0f) + i14;
                tk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(66.0f) + i14);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.i0.L(24.0f) + i14;
                tk0Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.0f) + i14);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t11.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentTopic(long j10) {
        this.J = j10;
        this.f30417w.f();
    }

    public void setMenuAvailable(boolean z10) {
        int i10;
        ImageView imageView = this.f30415r;
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
        this.D = Utilities.l(f7);
        this.h.setTranslationX((1.0f - this.D) * org.telegram.messenger.i0.L(288.0f));
        FrameLayout frameLayout = this.f30414n;
        if (frameLayout != null) {
            frameLayout.setAlpha(this.D);
            frameLayout.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, this.D));
            frameLayout.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, this.D));
        }
        if (this.D <= 0.0f && !this.L) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        setVisibility(i10);
        invalidate();
        org.telegram.ui.al alVar = this.f30413f;
        if (alVar != null) {
            alVar.f35669a.l1.invalidate();
        }
    }

    public void settle(float f7) {
        boolean z10 = false;
        float f10 = 0.0f;
        if (Math.abs(f7) <= org.telegram.messenger.i0.L(300.0f) ? this.D > 0.5f : f7 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            f();
        }
        if (z10) {
            f10 = 1.0f;
        }
        a(f10, f7);
        if (!z10) {
            org.telegram.messenger.i0.v1(this.f30418x);
        }
    }
}
