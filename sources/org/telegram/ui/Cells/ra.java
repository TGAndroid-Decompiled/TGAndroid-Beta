package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.messenger.zo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qj;
import org.telegram.ui.un;
public final class ra extends View implements vs {
    public static final int P = 0;
    public final RectF D;
    public final y E;
    public final dc F;
    public final org.telegram.ui.Components.t8 G;
    public final Drawable H;
    public int I;
    public zo J;
    public float K;
    public float L;
    public float M;
    public int N;
    public boolean O;
    public final int f22877a;
    public final org.telegram.ui.ActionBar.p6 f22878b;
    public long f22879c;
    public rz0 d;
    public rz0 e;
    public rz0 f22880f;
    public final ArrayList h;
    public qa f22881n;
    public float f22882r;
    public float f22883s;
    public float f22884w;
    public final RectF f22885x;
    public final dc f22886y;

    public ra(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = new ArrayList();
        this.f22885x = new RectF();
        this.f22886y = new dc(this);
        this.D = new RectF();
        this.F = new dc(this);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(this, false);
        this.G = t8Var;
        this.I = -1;
        this.f22877a = i10;
        this.f22878b = p6Var;
        y a02 = org.telegram.ui.ActionBar.t6.a0(822083583, 8, 8);
        this.E = a02;
        a02.setCallback(this);
        t8Var.f30563p = org.telegram.messenger.i0.L(50.0f);
        t8Var.f30562o = org.telegram.messenger.i0.L(13.0f);
        t8Var.f30570x = false;
        t8Var.f30566s = org.telegram.messenger.i0.L(13.0f);
        t8Var.h(org.telegram.messenger.i0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(2131232240).mutate();
        this.H = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final qa a(CharSequence charSequence, String str, boolean z10) {
        int i10;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.K += org.telegram.messenger.i0.L(7.0f);
        }
        qa qaVar = new qa(str, charSequence, z10);
        arrayList.add(qaVar);
        this.K += org.telegram.messenger.i0.L(14.0f);
        this.f22883s = Math.max(this.f22883s, qaVar.f22857a.f30126c);
        float f7 = this.f22884w;
        float f10 = qaVar.f22858b.f30126c;
        if (z10) {
            i10 = org.telegram.messenger.i0.L(38.0f);
        } else {
            i10 = 0;
        }
        this.f22884w = Math.max(f7, f10 + i10);
        return qaVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        int i10;
        TLRPC.User Z1;
        TLRPC.UserFull a2;
        TL_bots.BotVerification botVerification;
        this.f22879c = j10;
        this.L = 0.0f;
        this.K = 0.0f;
        this.f22883s = 0.0f;
        this.f22884w = 0.0f;
        this.h.clear();
        int i11 = (int) (org.telegram.messenger.i0.f16172q.x * 0.95f);
        this.K += org.telegram.messenger.i0.L(14.0f);
        rz0 rz0Var = new rz0(org.telegram.messenger.o5.l(e20.f15506s0, j10), 14.0f, org.telegram.messenger.i0.o());
        this.d = rz0Var;
        this.K = rz0Var.i() + org.telegram.messenger.i0.L(3.0f) + this.K;
        int i12 = this.f22877a;
        if (org.telegram.messenger.i5.r(i12).x(j10)) {
            i10 = 2131751801;
        } else {
            i10 = 2131751800;
        }
        rz0 rz0Var2 = new rz0(dd.L0(i10, null), 14.0f, null);
        this.e = rz0Var2;
        this.K = rz0Var2.i() + org.telegram.messenger.i0.L(11.0f) + this.K;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String L0 = dd.L0(2131751797, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String E0 = dd.E0(str);
            if (!TextUtils.isEmpty(E0)) {
                spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            }
            String i02 = dd.i0(2131751796, str);
            if (!TextUtils.isEmpty(i02)) {
                spannableStringBuilder.append((CharSequence) i02);
            } else {
                spannableStringBuilder.append((CharSequence) str);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.i0.L(12));
            a(org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), L0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String L02 = dd.L0(2131751795, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = dd.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, L02, false);
        }
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 < 0) {
            Z1 = null;
        } else {
            Z1 = wp.r1(i12).Z1(Long.valueOf(j10));
        }
        if (i13 < 0) {
            a2 = null;
        } else {
            a2 = wp.r1(i12).a2(j10);
        }
        if (a2 == null && i13 > 0) {
            wp.r1(i12).e3(wp.r1(i12).Z1(Long.valueOf(j10)), true, 0);
        }
        if (a2 != null) {
            zo O0 = wp.r1(i12).O0(j10);
            this.J = O0;
            int max = Math.max(a2.common_chats_count, O0.f19746g);
            if (max > 0) {
                this.f22881n = a(dd.G(max, "Groups", new Object[0]), dd.L0(2131751802, null), true);
                int min = Math.min(3, this.J.e.size());
                org.telegram.ui.Components.t8 t8Var = this.G;
                t8Var.i(min);
                for (int i14 = 0; i14 < Math.min(3, this.J.e.size()); i14++) {
                    t8Var.j(i14, i12, (TLObject) this.J.e.get(i14));
                }
                t8Var.a(true, true);
            } else {
                this.J = null;
                this.f22881n = null;
            }
        } else {
            this.J = null;
            this.f22881n = null;
        }
        this.f22882r = this.f22883s + org.telegram.messenger.i0.L(7.66f) + this.f22884w;
        if (Z1 != null && !Z1.verified && !i20.A(Z1.f19943id)) {
            if (Z1.bot_verification_icon != 0) {
                if (a2 != null && (botVerification = a2.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                    this.f22880f = new rz0(spannableStringBuilder2, 12.0f, null);
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o5(botVerification.icon, this.f22880f.f30124a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.append((CharSequence) kj.h0(botVerification.description, false));
                    rz0 rz0Var3 = new rz0(spannableStringBuilder2, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    rz0Var3.a();
                    rz0Var3.m(5);
                    Point point = org.telegram.messenger.i0.f16172q;
                    rz0Var3.p(Math.min(point.x, point.y) * 0.5f);
                    rz0Var3.r(this);
                    this.f22880f = rz0Var3;
                    this.K = this.f22880f.i() + org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(15.33f) + this.K;
                } else {
                    this.f22880f = null;
                    this.K += org.telegram.messenger.i0.L(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
                dq dqVar = new dq(2131231126, 0);
                dqVar.H = 0.55f;
                dqVar.I = -0.55f;
                dqVar.f25568r = org.telegram.messenger.i0.L(1.0f);
                dqVar.f25569s = org.telegram.messenger.i0.L(-1.0f);
                spannableStringBuilder3.setSpan(dqVar, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) dd.L0(2131751798, null));
                this.f22880f = new rz0(spannableStringBuilder3, 12.0f, null);
                this.K = this.f22880f.i() + org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(15.33f) + this.K;
            }
        } else {
            this.f22880f = null;
            this.K += org.telegram.messenger.i0.L(14.0f);
        }
        float max2 = Math.max(this.L, this.d.k());
        this.L = max2;
        float max3 = Math.max(max2, this.e.k());
        this.L = max3;
        float max4 = Math.max(max3, this.f22882r);
        this.L = max4;
        this.L = Math.min(max4 + org.telegram.messenger.i0.L(32.0f), i11);
    }

    public final void c(float f7, int i10) {
        if (Math.abs(this.M - f7) > 0.01f || i10 != this.N) {
            invalidate();
        }
        this.N = i10;
        this.M = f7;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.E0;
        int i13 = this.f22877a;
        if (i10 == i12) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.f22879c;
            if (longValue == j10) {
                b(j10, wp.r1(i13).B1(this.f22879c));
            }
        } else if (i10 == at.O3 && ((Long) objArr[0]).longValue() == this.f22879c) {
            zo O0 = wp.r1(i13).O0(this.f22879c);
            this.J = O0;
            int i14 = O0.f19746g;
            qa qaVar = this.f22881n;
            if (qaVar != null && i14 > 0) {
                qaVar.f22858b = new rz0(dd.G(i14, "Groups", new Object[0]), 12.0f, org.telegram.messenger.i0.o());
                int min = Math.min(3, this.J.e.size());
                org.telegram.ui.Components.t8 t8Var = this.G;
                t8Var.i(min);
                for (int i15 = 0; i15 < Math.min(3, this.J.e.size()); i15++) {
                    t8Var.j(i15, i13, (TLObject) this.J.e.get(i15));
                }
                t8Var.a(true, true);
            } else {
                b(this.f22879c, wp.r1(i13).B1(this.f22879c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f22877a;
        at.f(i10).c(this, at.E0);
        at.f(i10).c(this, at.O3);
        this.G.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f22877a;
        at.f(i10).n(this, at.E0);
        at.f(i10).n(this, at.O3);
        this.G.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        boolean d12;
        boolean z10;
        float f7;
        float f10;
        super.onDraw(canvas);
        org.telegram.ui.ActionBar.p6 p6Var = this.f22878b;
        if (org.telegram.ui.ActionBar.t6.i1(p6Var)) {
            i10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Fa, p6Var);
        } else {
            i10 = -1;
        }
        int i11 = i10;
        int i12 = this.I;
        Drawable drawable = this.H;
        if (i12 != i11) {
            this.I = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        canvas.save();
        float f11 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.f22885x;
        rectF.set((getWidth() - this.L) / 2.0f, (getHeight() - this.K) / 2.0f, (getWidth() + this.L) / 2.0f, (getHeight() + this.K) / 2.0f);
        float a2 = this.f22886y.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i13 = this.N;
        float x10 = getX();
        float f12 = this.M;
        if (p6Var != null) {
            p6Var.b(x10, f12, measuredWidth, i13);
        } else {
            org.telegram.ui.ActionBar.t6.r(x10, f12, measuredWidth, i13);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var));
        if (p6Var != null) {
            d12 = p6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.t6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.W0("paintChatActionBackgroundDarken", p6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.K) / 2.0f);
        float B = c3.i0.B(getHeight(), this.K, 2.0f, 0.0f);
        float f15 = 14.0f;
        canvas.translate(0.0f, org.telegram.messenger.i0.L(14.0f));
        float L = B + org.telegram.messenger.i0.L(14.0f);
        rz0 rz0Var = this.d;
        float f16 = 32.0f;
        rz0Var.f30136p = this.L - org.telegram.messenger.i0.L(32.0f);
        rz0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, i11, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.i0.L(3.0f));
        float i14 = L + this.d.i() + org.telegram.messenger.i0.L(3.0f);
        rz0 rz0Var2 = this.e;
        rz0Var2.f30136p = this.L - org.telegram.messenger.i0.L(32.0f);
        rz0Var2.c(width - (this.e.k() / 2.0f), this.e.i() / 2.0f, 0.7f, i11, canvas);
        canvas.translate(0.0f, this.e.i() + org.telegram.messenger.i0.L(11.0f));
        float i15 = this.e.i() + org.telegram.messenger.i0.L(11.0f) + i14;
        int i16 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i16 >= arrayList.size()) {
                break;
            }
            if (i16 > 0) {
                canvas.translate(f14, org.telegram.messenger.i0.L(7.0f));
                i15 += org.telegram.messenger.i0.L(7.0f);
            }
            canvas.save();
            qa qaVar = (qa) arrayList.get(i16);
            float f17 = f11;
            float L2 = (width - (this.L / f11)) + org.telegram.messenger.i0.L(f13) + this.f22883s;
            float f18 = i15;
            rz0 rz0Var3 = qaVar.f22857a;
            float f19 = f13;
            boolean z11 = qaVar.f22859c;
            float f20 = f15;
            RectF rectF2 = qaVar.d;
            float f21 = f16;
            float f22 = L2 - rz0Var3.f30126c;
            float L3 = (width - (this.L / f17)) + org.telegram.messenger.i0.L(f19) + this.f22883s + org.telegram.messenger.i0.L(7.66f);
            rz0Var3.f30136p = (L3 - f22) - org.telegram.messenger.i0.L(7.66f);
            int i17 = i16;
            rz0Var3.c(f22, rz0Var3.i() / f17, 0.7f, i11, canvas);
            float L4 = (width - (this.L / f17)) + org.telegram.messenger.i0.L(f19) + this.f22883s + org.telegram.messenger.i0.L(7.66f);
            float L5 = (width - (this.L / f17)) + org.telegram.messenger.i0.L(f19) + this.f22883s + org.telegram.messenger.i0.L(7.66f) + qaVar.f22858b.f30126c;
            org.telegram.ui.Components.t8 t8Var = this.G;
            if (z11) {
                f7 = t8Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.i0.L(5.0f);
            } else {
                f7 = 0.0f;
            }
            rectF2.set(L4, f18, L5 + f7, qaVar.f22858b.i() + f18);
            if (this.f22881n == qaVar) {
                RectF rectF3 = this.D;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(f17));
                float a10 = this.F.a(0.025f);
                f10 = 4.0f;
                canvas.scale(a10, a10, rectF3.centerX(), qaVar.f22858b.i() / f17);
                y yVar = this.E;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f18), (int) rectF3.right, (int) (rectF3.bottom - f18));
                    yVar.draw(canvas);
                }
            } else {
                f10 = 4.0f;
            }
            rz0 rz0Var4 = qaVar.f22858b;
            rz0Var4.f30136p = (((this.L / f17) + width) - org.telegram.messenger.i0.L(8.0f)) - L3;
            rz0Var4.c(L3, qaVar.f22858b.i() / f17, 1.0f, i11, canvas);
            if (z11) {
                canvas.save();
                canvas.translate((width - (this.L / f17)) + org.telegram.messenger.i0.L(f19) + this.f22883s + org.telegram.messenger.i0.L(7.66f) + qaVar.f22858b.f30126c + org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(1.0f));
                t8Var.g(canvas);
                canvas.translate(t8Var.A + org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(13.0f) / f17);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f17), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f17));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, org.telegram.messenger.i0.L(f20));
            i15 = org.telegram.messenger.i0.L(f20) + f18;
            i16 = i17 + 1;
            f11 = f17;
            f13 = f19;
            f15 = f20;
            f16 = f21;
            f14 = 0.0f;
        }
        float f23 = f11;
        float f24 = f16;
        if (this.f22880f != null) {
            canvas.translate(0.0f, org.telegram.messenger.i0.L(12.0f));
            rz0 rz0Var5 = this.f22880f;
            if (rz0Var5.f30127f > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                rz0Var5.c(width - (rz0Var5.k() / f23), 0.0f, 0.7f, i11, canvas);
            } else {
                rz0Var5.f30136p = this.L - org.telegram.messenger.i0.L(f24);
                rz0Var5.c(width - (this.f22880f.k() / f23), this.f22880f.i() / f23, 0.7f, i11, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.m5.b(16.0f, (int) this.K, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        qj qjVar;
        if (this.f22881n != null && this.D.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f22885x.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        y yVar = this.E;
        dc dcVar = this.F;
        dc dcVar2 = this.f22886y;
        if (action == 0) {
            dcVar2.c(z11);
            dcVar.c(z10);
            yVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (dcVar2.f25465i) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if ((T instanceof un) && (qjVar = ((un) T).f42166o1) != null) {
                    qjVar.e(true, false);
                }
            } else if (dcVar.f25465i) {
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    Bundle bundle = new Bundle();
                    long j10 = this.f22879c;
                    if (j10 >= 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    bundle.putBoolean("open_common", true);
                    T2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            dcVar.c(false);
            dcVar2.c(false);
            yVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
            dcVar2.c(false);
            yVar.setState(new int[0]);
        }
        if (dcVar.f25465i || dcVar2.f25465i) {
            return true;
        }
        return false;
    }

    public void setAnimating(boolean z10) {
        this.O = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
