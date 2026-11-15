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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.qo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.ui;
public final class ra extends View implements is {
    public static final int Q = 0;
    public final RectF E;
    public final y F;
    public final dc G;
    public final org.telegram.ui.Components.v8 H;
    public final Drawable I;
    public int J;
    public qo K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int f31367a;
    public final org.telegram.ui.ActionBar.e6 f31368b;
    public long f31369c;
    public oy0 d;
    public oy0 f31370e;
    public oy0 f31371f;
    public final ArrayList h;
    public qa f31372n;
    public float f31373r;
    public float f31374s;
    public float f31375w;
    public final RectF f31376x;
    public final dc f31377y;

    public ra(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = new ArrayList();
        this.f31376x = new RectF();
        this.f31377y = new dc(this);
        this.E = new RectF();
        this.G = new dc(this);
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8(this, false);
        this.H = v8Var;
        this.J = -1;
        this.f31367a = i7;
        this.f31368b = e6Var;
        y a02 = org.telegram.ui.ActionBar.j6.a0(822083583, 8, 8);
        this.F = a02;
        a02.setCallback(this);
        v8Var.f40336p = org.telegram.messenger.g0.L(50.0f);
        v8Var.f40335o = org.telegram.messenger.g0.L(13.0f);
        v8Var.f40343x = false;
        v8Var.f40339s = org.telegram.messenger.g0.L(13.0f);
        v8Var.h(org.telegram.messenger.g0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(2131232242).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final qa a(CharSequence charSequence, String str, boolean z10) {
        int i7;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += org.telegram.messenger.g0.L(7.0f);
        }
        qa qaVar = new qa(str, charSequence, z10);
        arrayList.add(qaVar);
        this.L += org.telegram.messenger.g0.L(14.0f);
        this.f31374s = Math.max(this.f31374s, qaVar.f31318a.f38105c);
        float f10 = this.f31375w;
        float f11 = qaVar.f31319b.f38105c;
        if (z10) {
            i7 = org.telegram.messenger.g0.L(38.0f);
        } else {
            i7 = 0;
        }
        this.f31375w = Math.max(f10, f11 + i7);
        return qaVar;
    }

    public final void b(long j3, TLRPC.PeerSettings peerSettings) {
        int i7;
        TLRPC.User a22;
        TLRPC.UserFull b22;
        TL_bots.BotVerification botVerification;
        this.f31369c = j3;
        this.M = 0.0f;
        this.L = 0.0f;
        this.f31374s = 0.0f;
        this.f31375w = 0.0f;
        this.h.clear();
        int i10 = (int) (org.telegram.messenger.g0.f23609q.x * 0.95f);
        this.L += org.telegram.messenger.g0.L(14.0f);
        oy0 oy0Var = new oy0(org.telegram.messenger.m5.l(m10.f24934t0, j3), 14.0f, org.telegram.messenger.g0.o());
        this.d = oy0Var;
        this.L = oy0Var.i() + org.telegram.messenger.g0.L(3.0f) + this.L;
        int i11 = this.f31367a;
        if (org.telegram.messenger.g5.r(i11).x(j3)) {
            i7 = 2131751801;
        } else {
            i7 = 2131751800;
        }
        oy0 oy0Var2 = new oy0(hd.M0(i7, null), 14.0f, null);
        this.f31370e = oy0Var2;
        this.L = oy0Var2.i() + org.telegram.messenger.g0.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = hd.M0(2131751797, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String F0 = hd.F0(str);
            if (!TextUtils.isEmpty(F0)) {
                spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            }
            String i02 = hd.i0(2131751796, str);
            if (!TextUtils.isEmpty(i02)) {
                spannableStringBuilder.append((CharSequence) i02);
            } else {
                spannableStringBuilder.append((CharSequence) str);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(12));
            a(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), M0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String M02 = hd.M0(2131751795, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = hd.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, M02, false);
        }
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i12 < 0) {
            a22 = null;
        } else {
            a22 = np.s1(i11).a2(Long.valueOf(j3));
        }
        if (i12 < 0) {
            b22 = null;
        } else {
            b22 = np.s1(i11).b2(j3);
        }
        if (b22 == null && i12 > 0) {
            np.s1(i11).g3(np.s1(i11).a2(Long.valueOf(j3)), true, 0);
        }
        if (b22 != null) {
            qo P0 = np.s1(i11).P0(j3);
            this.K = P0;
            int max = Math.max(b22.common_chats_count, P0.f26119g);
            if (max > 0) {
                this.f31372n = a(hd.G(max, "Groups", new Object[0]), hd.M0(2131751802, null), true);
                int min = Math.min(3, this.K.f26117e.size());
                org.telegram.ui.Components.v8 v8Var = this.H;
                v8Var.i(min);
                for (int i13 = 0; i13 < Math.min(3, this.K.f26117e.size()); i13++) {
                    v8Var.j(i13, i11, (TLObject) this.K.f26117e.get(i13));
                }
                v8Var.a(true, true);
            } else {
                this.K = null;
                this.f31372n = null;
            }
        } else {
            this.K = null;
            this.f31372n = null;
        }
        this.f31373r = this.f31374s + org.telegram.messenger.g0.L(7.66f) + this.f31375w;
        if (a22 != null && !a22.verified && !q10.A(a22.f28200id)) {
            if (a22.bot_verification_icon != 0) {
                if (b22 != null && (botVerification = b22.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                    this.f31371f = new oy0(spannableStringBuilder2, 12.0f, null);
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(botVerification.icon, this.f31371f.f38103a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.append(gj.h0(botVerification.description, false));
                    oy0 oy0Var3 = new oy0(spannableStringBuilder2, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    oy0Var3.a();
                    oy0Var3.m(5);
                    Point point = org.telegram.messenger.g0.f23609q;
                    oy0Var3.p(Math.min(point.x, point.y) * 0.5f);
                    oy0Var3.r(this);
                    this.f31371f = oy0Var3;
                    this.L = this.f31371f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
                } else {
                    this.f31371f = null;
                    this.L += org.telegram.messenger.g0.L(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
                eq eqVar = new eq(2131231126, 0);
                eqVar.I = 0.55f;
                eqVar.J = -0.55f;
                eqVar.f34415r = org.telegram.messenger.g0.L(1.0f);
                eqVar.f34416s = org.telegram.messenger.g0.L(-1.0f);
                spannableStringBuilder3.setSpan(eqVar, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) hd.M0(2131751798, null));
                this.f31371f = new oy0(spannableStringBuilder3, 12.0f, null);
                this.L = this.f31371f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
            }
        } else {
            this.f31371f = null;
            this.L += org.telegram.messenger.g0.L(14.0f);
        }
        float max2 = Math.max(this.M, this.d.k());
        this.M = max2;
        float max3 = Math.max(max2, this.f31370e.k());
        this.M = max3;
        float max4 = Math.max(max3, this.f31373r);
        this.M = max4;
        this.M = Math.min(max4 + org.telegram.messenger.g0.L(32.0f), i10);
    }

    public final void c(float f10, int i7) {
        if (Math.abs(this.N - f10) > 0.01f || i7 != this.O) {
            invalidate();
        }
        this.O = i7;
        this.N = f10;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.E0;
        int i12 = this.f31367a;
        if (i7 == i11) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.f31369c;
            if (longValue == j3) {
                b(j3, np.s1(i12).C1(this.f31369c));
            }
        } else if (i7 == ns.O3 && ((Long) objArr[0]).longValue() == this.f31369c) {
            qo P0 = np.s1(i12).P0(this.f31369c);
            this.K = P0;
            int i13 = P0.f26119g;
            qa qaVar = this.f31372n;
            if (qaVar != null && i13 > 0) {
                qaVar.f31319b = new oy0(hd.G(i13, "Groups", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
                int min = Math.min(3, this.K.f26117e.size());
                org.telegram.ui.Components.v8 v8Var = this.H;
                v8Var.i(min);
                for (int i14 = 0; i14 < Math.min(3, this.K.f26117e.size()); i14++) {
                    v8Var.j(i14, i12, (TLObject) this.K.f26117e.get(i14));
                }
                v8Var.a(true, true);
            } else {
                b(this.f31369c, np.s1(i12).C1(this.f31369c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f31367a;
        ns.f(i7).c(this, ns.E0);
        ns.f(i7).c(this, ns.O3);
        this.H.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f31367a;
        ns.f(i7).n(this, ns.E0);
        ns.f(i7).n(this, ns.O3);
        this.H.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        boolean d12;
        boolean z10;
        float f10;
        float f11;
        super.onDraw(canvas);
        org.telegram.ui.ActionBar.e6 e6Var = this.f31368b;
        if (org.telegram.ui.ActionBar.j6.i1(e6Var)) {
            i7 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fa, e6Var);
        } else {
            i7 = -1;
        }
        int i10 = i7;
        int i11 = this.J;
        Drawable drawable = this.I;
        if (i11 != i10) {
            this.J = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        canvas.save();
        float f12 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.f31376x;
        rectF.set((getWidth() - this.M) / 2.0f, (getHeight() - this.L) / 2.0f, (getWidth() + this.M) / 2.0f, (getHeight() + this.L) / 2.0f);
        float a10 = this.f31377y.a(0.025f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i12 = this.O;
        float x10 = getX();
        float f13 = this.N;
        if (e6Var != null) {
            e6Var.b(x10, f13, measuredWidth, i12);
        } else {
            org.telegram.ui.ActionBar.j6.r(x10, f13, measuredWidth, i12);
        }
        float f14 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.j6.W0("paintChatActionBackground", e6Var));
        if (e6Var != null) {
            d12 = e6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.j6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.j6.W0("paintChatActionBackgroundDarken", e6Var));
        }
        float f15 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float A = com.google.android.gms.internal.vision.e2.A(getHeight(), this.L, 2.0f, 0.0f);
        float f16 = 14.0f;
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float L = A + org.telegram.messenger.g0.L(14.0f);
        oy0 oy0Var = this.d;
        float f17 = 32.0f;
        oy0Var.f38116p = this.M - org.telegram.messenger.g0.L(32.0f);
        oy0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, i10, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.g0.L(3.0f));
        float i13 = L + this.d.i() + org.telegram.messenger.g0.L(3.0f);
        oy0 oy0Var2 = this.f31370e;
        oy0Var2.f38116p = this.M - org.telegram.messenger.g0.L(32.0f);
        oy0Var2.c(width - (this.f31370e.k() / 2.0f), this.f31370e.i() / 2.0f, 0.7f, i10, canvas);
        canvas.translate(0.0f, this.f31370e.i() + org.telegram.messenger.g0.L(11.0f));
        float i14 = this.f31370e.i() + org.telegram.messenger.g0.L(11.0f) + i13;
        int i15 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i15 >= arrayList.size()) {
                break;
            }
            if (i15 > 0) {
                canvas.translate(f15, org.telegram.messenger.g0.L(7.0f));
                i14 += org.telegram.messenger.g0.L(7.0f);
            }
            canvas.save();
            qa qaVar = (qa) arrayList.get(i15);
            float f18 = f12;
            float L2 = (width - (this.M / f12)) + org.telegram.messenger.g0.L(f14) + this.f31374s;
            float f19 = i14;
            oy0 oy0Var3 = qaVar.f31318a;
            float f20 = f14;
            boolean z11 = qaVar.f31320c;
            float f21 = f16;
            RectF rectF2 = qaVar.d;
            float f22 = f17;
            float f23 = L2 - oy0Var3.f38105c;
            float L3 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f31374s + org.telegram.messenger.g0.L(7.66f);
            oy0Var3.f38116p = (L3 - f23) - org.telegram.messenger.g0.L(7.66f);
            int i16 = i15;
            oy0Var3.c(f23, oy0Var3.i() / f18, 0.7f, i10, canvas);
            float L4 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f31374s + org.telegram.messenger.g0.L(7.66f);
            float L5 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f31374s + org.telegram.messenger.g0.L(7.66f) + qaVar.f31319b.f38105c;
            org.telegram.ui.Components.v8 v8Var = this.H;
            if (z11) {
                f10 = v8Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = 0.0f;
            }
            rectF2.set(L4, f19, L5 + f10, qaVar.f31319b.i() + f19);
            if (this.f31372n == qaVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(f18));
                float a11 = this.G.a(0.025f);
                f11 = 4.0f;
                canvas.scale(a11, a11, rectF3.centerX(), qaVar.f31319b.i() / f18);
                y yVar = this.F;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f19), (int) rectF3.right, (int) (rectF3.bottom - f19));
                    yVar.draw(canvas);
                }
            } else {
                f11 = 4.0f;
            }
            oy0 oy0Var4 = qaVar.f31319b;
            oy0Var4.f38116p = (((this.M / f18) + width) - org.telegram.messenger.g0.L(8.0f)) - L3;
            oy0Var4.c(L3, qaVar.f31319b.i() / f18, 1.0f, i10, canvas);
            if (z11) {
                canvas.save();
                canvas.translate((width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f31374s + org.telegram.messenger.g0.L(7.66f) + qaVar.f31319b.f38105c + org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(1.0f));
                v8Var.g(canvas);
                canvas.translate(v8Var.A + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(13.0f) / f18);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f18), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f18));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, org.telegram.messenger.g0.L(f21));
            i14 = org.telegram.messenger.g0.L(f21) + f19;
            i15 = i16 + 1;
            f12 = f18;
            f14 = f20;
            f16 = f21;
            f17 = f22;
            f15 = 0.0f;
        }
        float f24 = f12;
        float f25 = f17;
        if (this.f31371f != null) {
            canvas.translate(0.0f, org.telegram.messenger.g0.L(12.0f));
            oy0 oy0Var5 = this.f31371f;
            if (oy0Var5.f38107f > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                oy0Var5.c(width - (oy0Var5.k() / f24), 0.0f, 0.7f, i10, canvas);
            } else {
                oy0Var5.f38116p = this.M - org.telegram.messenger.g0.L(f25);
                oy0Var5.c(width - (this.f31371f.k() / f24), this.f31371f.i() / f24, 0.7f, i10, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.k5.b(16.0f, (int) this.L, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        ui uiVar;
        if (this.f31372n != null && this.E.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f31376x.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        y yVar = this.F;
        dc dcVar = this.G;
        dc dcVar2 = this.f31377y;
        if (action == 0) {
            dcVar2.c(z11);
            dcVar.c(z10);
            yVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (dcVar2.f33917i) {
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if ((T instanceof an) && (uiVar = ((an) T).f45314p1) != null) {
                    uiVar.e(true, false);
                }
            } else if (dcVar.f33917i) {
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    Bundle bundle = new Bundle();
                    long j3 = this.f31369c;
                    if (j3 >= 0) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
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
        if (dcVar.f33917i || dcVar2.f33917i) {
            return true;
        }
        return false;
    }

    public void setAnimating(boolean z10) {
        this.P = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.F && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
