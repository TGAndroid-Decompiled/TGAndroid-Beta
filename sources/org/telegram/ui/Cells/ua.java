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
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.po;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.vi;
public final class ua extends View implements fs {
    public static final int Q = 0;
    public final RectF E;
    public final y F;
    public final lc G;
    public final org.telegram.ui.Components.c9 H;
    public final Drawable I;
    public int J;
    public po K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int f32122a;
    public final org.telegram.ui.ActionBar.i6 f32123b;
    public long f32124c;
    public wy0 d;
    public wy0 f32125e;
    public wy0 f32126f;
    public final ArrayList h;
    public ta f32127n;
    public float f32128r;
    public float f32129s;
    public float f32130w;
    public final RectF f32131x;
    public final lc f32132y;

    public ua(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = new ArrayList();
        this.f32131x = new RectF();
        this.f32132y = new lc(this);
        this.E = new RectF();
        this.G = new lc(this);
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(this, false);
        this.H = c9Var;
        this.J = -1;
        this.f32122a = i7;
        this.f32123b = i6Var;
        y a02 = org.telegram.ui.ActionBar.n6.a0(822083583, 8, 8);
        this.F = a02;
        a02.setCallback(this);
        c9Var.f33962p = org.telegram.messenger.g0.L(50.0f);
        c9Var.f33961o = org.telegram.messenger.g0.L(13.0f);
        c9Var.f33969x = false;
        c9Var.f33965s = org.telegram.messenger.g0.L(13.0f);
        c9Var.h(org.telegram.messenger.g0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(2131232246).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final ta a(CharSequence charSequence, String str, boolean z10) {
        int i7;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += org.telegram.messenger.g0.L(7.0f);
        }
        ta taVar = new ta(str, charSequence, z10);
        arrayList.add(taVar);
        this.L += org.telegram.messenger.g0.L(14.0f);
        this.f32129s = Math.max(this.f32129s, taVar.f31945a.f41763c);
        float f10 = this.f32130w;
        float f11 = taVar.f31946b.f41763c;
        if (z10) {
            i7 = org.telegram.messenger.g0.L(38.0f);
        } else {
            i7 = 0;
        }
        this.f32130w = Math.max(f10, f11 + i7);
        return taVar;
    }

    public final void b(long j3, TLRPC.PeerSettings peerSettings) {
        int i7;
        TLRPC.User c22;
        TLRPC.UserFull d2;
        TL_bots.BotVerification botVerification;
        this.f32124c = j3;
        this.M = 0.0f;
        this.L = 0.0f;
        this.f32129s = 0.0f;
        this.f32130w = 0.0f;
        this.h.clear();
        int i10 = (int) (org.telegram.messenger.g0.f24226q.x * 0.95f);
        this.L += org.telegram.messenger.g0.L(14.0f);
        wy0 wy0Var = new wy0(org.telegram.messenger.n5.l(i10.f24637t0, j3), 14.0f, org.telegram.messenger.g0.o());
        this.d = wy0Var;
        this.L = wy0Var.i() + org.telegram.messenger.g0.L(3.0f) + this.L;
        int i11 = this.f32122a;
        if (org.telegram.messenger.i5.r(i11).x(j3)) {
            i7 = 2131751789;
        } else {
            i7 = 2131751788;
        }
        wy0 wy0Var2 = new wy0(gd.N0(i7, null), 14.0f, null);
        this.f32125e = wy0Var2;
        this.L = wy0Var2.i() + org.telegram.messenger.g0.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String N0 = gd.N0(2131751785, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String F0 = gd.F0(str);
            if (!TextUtils.isEmpty(F0)) {
                spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            }
            String i02 = gd.i0(2131751784, str);
            if (!TextUtils.isEmpty(i02)) {
                spannableStringBuilder.append((CharSequence) i02);
            } else {
                spannableStringBuilder.append((CharSequence) str);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(12));
            a(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), N0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String N02 = gd.N0(2131751783, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = gd.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, N02, false);
        }
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i12 < 0) {
            c22 = null;
        } else {
            c22 = mp.u1(i11).c2(Long.valueOf(j3));
        }
        if (i12 < 0) {
            d2 = null;
        } else {
            d2 = mp.u1(i11).d2(j3);
        }
        if (d2 == null && i12 > 0) {
            mp.u1(i11).n3(mp.u1(i11).c2(Long.valueOf(j3)), true, 0);
        }
        if (d2 != null) {
            po R0 = mp.u1(i11).R0(j3);
            this.K = R0;
            int max = Math.max(d2.common_chats_count, R0.f26377g);
            if (max > 0) {
                this.f32127n = a(gd.G(max, "Groups", new Object[0]), gd.N0(2131751790, null), true);
                int min = Math.min(3, this.K.f26375e.size());
                org.telegram.ui.Components.c9 c9Var = this.H;
                c9Var.i(min);
                for (int i13 = 0; i13 < Math.min(3, this.K.f26375e.size()); i13++) {
                    c9Var.j(i13, i11, (TLObject) this.K.f26375e.get(i13));
                }
                c9Var.a(true, true);
            } else {
                this.K = null;
                this.f32127n = null;
            }
        } else {
            this.K = null;
            this.f32127n = null;
        }
        this.f32128r = this.f32129s + org.telegram.messenger.g0.L(7.66f) + this.f32130w;
        if (c22 != null && !c22.verified && !n10.B(c22.f28641id)) {
            if (c22.bot_verification_icon != 0) {
                if (d2 != null && (botVerification = d2.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                    this.f32126f = new wy0(spannableStringBuilder2, 12.0f, null);
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(botVerification.icon, this.f32126f.f41761a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.append(fj.h0(botVerification.description, false));
                    wy0 wy0Var3 = new wy0(spannableStringBuilder2, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    wy0Var3.a();
                    wy0Var3.m(5);
                    Point point = org.telegram.messenger.g0.f24226q;
                    wy0Var3.p(Math.min(point.x, point.y) * 0.5f);
                    wy0Var3.r(this);
                    this.f32126f = wy0Var3;
                    this.L = this.f32126f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
                } else {
                    this.f32126f = null;
                    this.L += org.telegram.messenger.g0.L(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
                kq kqVar = new kq(2131231128, 0);
                kqVar.I = 0.55f;
                kqVar.J = -0.55f;
                kqVar.f36853r = org.telegram.messenger.g0.L(1.0f);
                kqVar.f36854s = org.telegram.messenger.g0.L(-1.0f);
                spannableStringBuilder3.setSpan(kqVar, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) gd.N0(2131751786, null));
                this.f32126f = new wy0(spannableStringBuilder3, 12.0f, null);
                this.L = this.f32126f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
            }
        } else {
            this.f32126f = null;
            this.L += org.telegram.messenger.g0.L(14.0f);
        }
        float max2 = Math.max(this.M, this.d.k());
        this.M = max2;
        float max3 = Math.max(max2, this.f32125e.k());
        this.M = max3;
        float max4 = Math.max(max3, this.f32128r);
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
        int i11 = ks.E0;
        int i12 = this.f32122a;
        if (i7 == i11) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.f32124c;
            if (longValue == j3) {
                b(j3, mp.u1(i12).E1(this.f32124c));
            }
        } else if (i7 == ks.R3 && ((Long) objArr[0]).longValue() == this.f32124c) {
            po R0 = mp.u1(i12).R0(this.f32124c);
            this.K = R0;
            int i13 = R0.f26377g;
            ta taVar = this.f32127n;
            if (taVar != null && i13 > 0) {
                taVar.f31946b = new wy0(gd.G(i13, "Groups", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
                int min = Math.min(3, this.K.f26375e.size());
                org.telegram.ui.Components.c9 c9Var = this.H;
                c9Var.i(min);
                for (int i14 = 0; i14 < Math.min(3, this.K.f26375e.size()); i14++) {
                    c9Var.j(i14, i12, (TLObject) this.K.f26375e.get(i14));
                }
                c9Var.a(true, true);
            } else {
                b(this.f32124c, mp.u1(i12).E1(this.f32124c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f32122a;
        ks.f(i7).c(this, ks.E0);
        ks.f(i7).c(this, ks.R3);
        this.H.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f32122a;
        ks.f(i7).n(this, ks.E0);
        ks.f(i7).n(this, ks.R3);
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f32123b;
        if (org.telegram.ui.ActionBar.n6.i1(i6Var)) {
            i7 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fa, i6Var);
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
        RectF rectF = this.f32131x;
        rectF.set((getWidth() - this.M) / 2.0f, (getHeight() - this.L) / 2.0f, (getWidth() + this.M) / 2.0f, (getHeight() + this.L) / 2.0f);
        float a10 = this.f32132y.a(0.025f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i12 = this.O;
        float x10 = getX();
        float f13 = this.N;
        if (i6Var != null) {
            i6Var.c(x10, f13, measuredWidth, i12);
        } else {
            org.telegram.ui.ActionBar.n6.r(x10, f13, measuredWidth, i12);
        }
        float f14 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var));
        if (i6Var != null) {
            d12 = i6Var.h();
        } else {
            d12 = org.telegram.ui.ActionBar.n6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.W0("paintChatActionBackgroundDarken", i6Var));
        }
        float f15 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float A = com.google.android.gms.internal.vision.e2.A(getHeight(), this.L, 2.0f, 0.0f);
        float f16 = 14.0f;
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float L = A + org.telegram.messenger.g0.L(14.0f);
        wy0 wy0Var = this.d;
        float f17 = 32.0f;
        wy0Var.f41774p = this.M - org.telegram.messenger.g0.L(32.0f);
        wy0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, i10, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.g0.L(3.0f));
        float i13 = L + this.d.i() + org.telegram.messenger.g0.L(3.0f);
        wy0 wy0Var2 = this.f32125e;
        wy0Var2.f41774p = this.M - org.telegram.messenger.g0.L(32.0f);
        wy0Var2.c(width - (this.f32125e.k() / 2.0f), this.f32125e.i() / 2.0f, 0.7f, i10, canvas);
        canvas.translate(0.0f, this.f32125e.i() + org.telegram.messenger.g0.L(11.0f));
        float i14 = this.f32125e.i() + org.telegram.messenger.g0.L(11.0f) + i13;
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
            ta taVar = (ta) arrayList.get(i15);
            float f18 = f12;
            float L2 = (width - (this.M / f12)) + org.telegram.messenger.g0.L(f14) + this.f32129s;
            float f19 = i14;
            wy0 wy0Var3 = taVar.f31945a;
            float f20 = f14;
            boolean z11 = taVar.f31947c;
            float f21 = f16;
            RectF rectF2 = taVar.d;
            float f22 = f17;
            float f23 = L2 - wy0Var3.f41763c;
            float L3 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f32129s + org.telegram.messenger.g0.L(7.66f);
            wy0Var3.f41774p = (L3 - f23) - org.telegram.messenger.g0.L(7.66f);
            int i16 = i15;
            wy0Var3.c(f23, wy0Var3.i() / f18, 0.7f, i10, canvas);
            float L4 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f32129s + org.telegram.messenger.g0.L(7.66f);
            float L5 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f32129s + org.telegram.messenger.g0.L(7.66f) + taVar.f31946b.f41763c;
            org.telegram.ui.Components.c9 c9Var = this.H;
            if (z11) {
                f10 = c9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = 0.0f;
            }
            rectF2.set(L4, f19, L5 + f10, taVar.f31946b.i() + f19);
            if (this.f32127n == taVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(f18));
                float a11 = this.G.a(0.025f);
                f11 = 4.0f;
                canvas.scale(a11, a11, rectF3.centerX(), taVar.f31946b.i() / f18);
                y yVar = this.F;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f19), (int) rectF3.right, (int) (rectF3.bottom - f19));
                    yVar.draw(canvas);
                }
            } else {
                f11 = 4.0f;
            }
            wy0 wy0Var4 = taVar.f31946b;
            wy0Var4.f41774p = (((this.M / f18) + width) - org.telegram.messenger.g0.L(8.0f)) - L3;
            wy0Var4.c(L3, taVar.f31946b.i() / f18, 1.0f, i10, canvas);
            if (z11) {
                canvas.save();
                canvas.translate((width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f32129s + org.telegram.messenger.g0.L(7.66f) + taVar.f31946b.f41763c + org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(1.0f));
                c9Var.g(canvas);
                canvas.translate(c9Var.A + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(13.0f) / f18);
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
        if (this.f32126f != null) {
            canvas.translate(0.0f, org.telegram.messenger.g0.L(12.0f));
            wy0 wy0Var5 = this.f32126f;
            if (wy0Var5.f41765f > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                wy0Var5.c(width - (wy0Var5.k() / f24), 0.0f, 0.7f, i10, canvas);
            } else {
                wy0Var5.f41774p = this.M - org.telegram.messenger.g0.L(f25);
                wy0Var5.c(width - (this.f32126f.k() / f24), this.f32126f.i() / f24, 0.7f, i10, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.f3.b(16.0f, (int) this.L, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        vi viVar;
        if (this.f32127n != null && this.E.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f32131x.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        y yVar = this.F;
        lc lcVar = this.G;
        lc lcVar2 = this.f32132y;
        if (action == 0) {
            lcVar2.c(z11);
            lcVar.c(z10);
            yVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (lcVar2.f37109i) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if ((T instanceof bn) && (viVar = ((bn) T).f46315p1) != null) {
                    viVar.e(true, false);
                }
            } else if (lcVar.f37109i) {
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    Bundle bundle = new Bundle();
                    long j3 = this.f32124c;
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
            lcVar.c(false);
            lcVar2.c(false);
            yVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            lcVar.c(false);
            lcVar2.c(false);
            yVar.setState(new int[0]);
        }
        if (lcVar.f37109i || lcVar2.f37109i) {
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
