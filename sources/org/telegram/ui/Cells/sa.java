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
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.po;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.vi;
public final class sa extends View implements fs {
    public static final int Q = 0;
    public final RectF E;
    public final y F;
    public final mc G;
    public final org.telegram.ui.Components.d9 H;
    public final Drawable I;
    public int J;
    public po K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int f31805a;
    public final org.telegram.ui.ActionBar.i6 f31806b;
    public long f31807c;
    public vy0 d;
    public vy0 f31808e;
    public vy0 f31809f;
    public final ArrayList h;
    public ra f31810n;
    public float f31811r;
    public float f31812s;
    public float f31813w;
    public final RectF f31814x;
    public final mc f31815y;

    public sa(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = new ArrayList();
        this.f31814x = new RectF();
        this.f31815y = new mc(this);
        this.E = new RectF();
        this.G = new mc(this);
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(this, false);
        this.H = d9Var;
        this.J = -1;
        this.f31805a = i7;
        this.f31806b = i6Var;
        y a02 = org.telegram.ui.ActionBar.n6.a0(822083583, 8, 8);
        this.F = a02;
        a02.setCallback(this);
        d9Var.f34316p = org.telegram.messenger.g0.L(50.0f);
        d9Var.f34315o = org.telegram.messenger.g0.L(13.0f);
        d9Var.f34323x = false;
        d9Var.f34319s = org.telegram.messenger.g0.L(13.0f);
        d9Var.h(org.telegram.messenger.g0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(2131232243).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final ra a(CharSequence charSequence, String str, boolean z10) {
        int i7;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += org.telegram.messenger.g0.L(7.0f);
        }
        ra raVar = new ra(str, charSequence, z10);
        arrayList.add(raVar);
        this.L += org.telegram.messenger.g0.L(14.0f);
        this.f31812s = Math.max(this.f31812s, raVar.f31738a.f41482c);
        float f10 = this.f31813w;
        float f11 = raVar.f31739b.f41482c;
        if (z10) {
            i7 = org.telegram.messenger.g0.L(38.0f);
        } else {
            i7 = 0;
        }
        this.f31813w = Math.max(f10, f11 + i7);
        return raVar;
    }

    public final void b(long j3, TLRPC.PeerSettings peerSettings) {
        int i7;
        TLRPC.User c22;
        TLRPC.UserFull d2;
        TL_bots.BotVerification botVerification;
        this.f31807c = j3;
        this.M = 0.0f;
        this.L = 0.0f;
        this.f31812s = 0.0f;
        this.f31813w = 0.0f;
        this.h.clear();
        int i10 = (int) (org.telegram.messenger.g0.f24121q.x * 0.95f);
        this.L += org.telegram.messenger.g0.L(14.0f);
        vy0 vy0Var = new vy0(org.telegram.messenger.n5.l(j10.f24773t0, j3), 14.0f, org.telegram.messenger.g0.o());
        this.d = vy0Var;
        this.L = vy0Var.i() + org.telegram.messenger.g0.L(3.0f) + this.L;
        int i11 = this.f31805a;
        if (org.telegram.messenger.i5.r(i11).x(j3)) {
            i7 = 2131751790;
        } else {
            i7 = 2131751789;
        }
        vy0 vy0Var2 = new vy0(gd.M0(i7, null), 14.0f, null);
        this.f31808e = vy0Var2;
        this.L = vy0Var2.i() + org.telegram.messenger.g0.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = gd.M0(2131751786, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String F0 = gd.F0(str);
            if (!TextUtils.isEmpty(F0)) {
                spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            }
            String i02 = gd.i0(2131751785, str);
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
            String M02 = gd.M0(2131751784, null);
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
            a(str2, M02, false);
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
            int max = Math.max(d2.common_chats_count, R0.f26285g);
            if (max > 0) {
                this.f31810n = a(gd.G(max, "Groups", new Object[0]), gd.M0(2131751791, null), true);
                int min = Math.min(3, this.K.f26283e.size());
                org.telegram.ui.Components.d9 d9Var = this.H;
                d9Var.i(min);
                for (int i13 = 0; i13 < Math.min(3, this.K.f26283e.size()); i13++) {
                    d9Var.j(i13, i11, (TLObject) this.K.f26283e.get(i13));
                }
                d9Var.a(true, true);
            } else {
                this.K = null;
                this.f31810n = null;
            }
        } else {
            this.K = null;
            this.f31810n = null;
        }
        this.f31811r = this.f31812s + org.telegram.messenger.g0.L(7.66f) + this.f31813w;
        if (c22 != null && !c22.verified && !o10.B(c22.f28554id)) {
            if (c22.bot_verification_icon != 0) {
                if (d2 != null && (botVerification = d2.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                    this.f31809f = new vy0(spannableStringBuilder2, 12.0f, null);
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(botVerification.icon, this.f31809f.f41480a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.append(fj.h0(botVerification.description, false));
                    vy0 vy0Var3 = new vy0(spannableStringBuilder2, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    vy0Var3.a();
                    vy0Var3.m(5);
                    Point point = org.telegram.messenger.g0.f24121q;
                    vy0Var3.p(Math.min(point.x, point.y) * 0.5f);
                    vy0Var3.r(this);
                    this.f31809f = vy0Var3;
                    this.L = this.f31809f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
                } else {
                    this.f31809f = null;
                    this.L += org.telegram.messenger.g0.L(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
                lq lqVar = new lq(2131231126, 0);
                lqVar.I = 0.55f;
                lqVar.J = -0.55f;
                lqVar.f37198r = org.telegram.messenger.g0.L(1.0f);
                lqVar.f37199s = org.telegram.messenger.g0.L(-1.0f);
                spannableStringBuilder3.setSpan(lqVar, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) gd.M0(2131751787, null));
                this.f31809f = new vy0(spannableStringBuilder3, 12.0f, null);
                this.L = this.f31809f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
            }
        } else {
            this.f31809f = null;
            this.L += org.telegram.messenger.g0.L(14.0f);
        }
        float max2 = Math.max(this.M, this.d.k());
        this.M = max2;
        float max3 = Math.max(max2, this.f31808e.k());
        this.M = max3;
        float max4 = Math.max(max3, this.f31811r);
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
        int i12 = this.f31805a;
        if (i7 == i11) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.f31807c;
            if (longValue == j3) {
                b(j3, mp.u1(i12).E1(this.f31807c));
            }
        } else if (i7 == ks.Q3 && ((Long) objArr[0]).longValue() == this.f31807c) {
            po R0 = mp.u1(i12).R0(this.f31807c);
            this.K = R0;
            int i13 = R0.f26285g;
            ra raVar = this.f31810n;
            if (raVar != null && i13 > 0) {
                raVar.f31739b = new vy0(gd.G(i13, "Groups", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
                int min = Math.min(3, this.K.f26283e.size());
                org.telegram.ui.Components.d9 d9Var = this.H;
                d9Var.i(min);
                for (int i14 = 0; i14 < Math.min(3, this.K.f26283e.size()); i14++) {
                    d9Var.j(i14, i12, (TLObject) this.K.f26283e.get(i14));
                }
                d9Var.a(true, true);
            } else {
                b(this.f31807c, mp.u1(i12).E1(this.f31807c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f31805a;
        ks.f(i7).c(this, ks.E0);
        ks.f(i7).c(this, ks.Q3);
        this.H.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f31805a;
        ks.f(i7).n(this, ks.E0);
        ks.f(i7).n(this, ks.Q3);
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f31806b;
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
        RectF rectF = this.f31814x;
        rectF.set((getWidth() - this.M) / 2.0f, (getHeight() - this.L) / 2.0f, (getWidth() + this.M) / 2.0f, (getHeight() + this.L) / 2.0f);
        float a10 = this.f31815y.a(0.025f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i12 = this.O;
        float x10 = getX();
        float f13 = this.N;
        if (i6Var != null) {
            i6Var.e(x10, f13, measuredWidth, i12);
        } else {
            org.telegram.ui.ActionBar.n6.r(x10, f13, measuredWidth, i12);
        }
        float f14 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var));
        if (i6Var != null) {
            d12 = i6Var.j();
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
        vy0 vy0Var = this.d;
        float f17 = 32.0f;
        vy0Var.f41493p = this.M - org.telegram.messenger.g0.L(32.0f);
        vy0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, i10, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.g0.L(3.0f));
        float i13 = L + this.d.i() + org.telegram.messenger.g0.L(3.0f);
        vy0 vy0Var2 = this.f31808e;
        vy0Var2.f41493p = this.M - org.telegram.messenger.g0.L(32.0f);
        vy0Var2.c(width - (this.f31808e.k() / 2.0f), this.f31808e.i() / 2.0f, 0.7f, i10, canvas);
        canvas.translate(0.0f, this.f31808e.i() + org.telegram.messenger.g0.L(11.0f));
        float i14 = this.f31808e.i() + org.telegram.messenger.g0.L(11.0f) + i13;
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
            ra raVar = (ra) arrayList.get(i15);
            float f18 = f12;
            float L2 = (width - (this.M / f12)) + org.telegram.messenger.g0.L(f14) + this.f31812s;
            float f19 = i14;
            vy0 vy0Var3 = raVar.f31738a;
            float f20 = f14;
            boolean z11 = raVar.f31740c;
            float f21 = f16;
            RectF rectF2 = raVar.d;
            float f22 = f17;
            float f23 = L2 - vy0Var3.f41482c;
            float L3 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f31812s + org.telegram.messenger.g0.L(7.66f);
            vy0Var3.f41493p = (L3 - f23) - org.telegram.messenger.g0.L(7.66f);
            int i16 = i15;
            vy0Var3.c(f23, vy0Var3.i() / f18, 0.7f, i10, canvas);
            float L4 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f31812s + org.telegram.messenger.g0.L(7.66f);
            float L5 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f31812s + org.telegram.messenger.g0.L(7.66f) + raVar.f31739b.f41482c;
            org.telegram.ui.Components.d9 d9Var = this.H;
            if (z11) {
                f10 = d9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = 0.0f;
            }
            rectF2.set(L4, f19, L5 + f10, raVar.f31739b.i() + f19);
            if (this.f31810n == raVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(f18));
                float a11 = this.G.a(0.025f);
                f11 = 4.0f;
                canvas.scale(a11, a11, rectF3.centerX(), raVar.f31739b.i() / f18);
                y yVar = this.F;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f19), (int) rectF3.right, (int) (rectF3.bottom - f19));
                    yVar.draw(canvas);
                }
            } else {
                f11 = 4.0f;
            }
            vy0 vy0Var4 = raVar.f31739b;
            vy0Var4.f41493p = (((this.M / f18) + width) - org.telegram.messenger.g0.L(8.0f)) - L3;
            vy0Var4.c(L3, raVar.f31739b.i() / f18, 1.0f, i10, canvas);
            if (z11) {
                canvas.save();
                canvas.translate((width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f31812s + org.telegram.messenger.g0.L(7.66f) + raVar.f31739b.f41482c + org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(1.0f));
                d9Var.g(canvas);
                canvas.translate(d9Var.A + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(13.0f) / f18);
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
        if (this.f31809f != null) {
            canvas.translate(0.0f, org.telegram.messenger.g0.L(12.0f));
            vy0 vy0Var5 = this.f31809f;
            if (vy0Var5.f41484f > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                vy0Var5.c(width - (vy0Var5.k() / f24), 0.0f, 0.7f, i10, canvas);
            } else {
                vy0Var5.f41493p = this.M - org.telegram.messenger.g0.L(f25);
                vy0Var5.c(width - (this.f31809f.k() / f24), this.f31809f.i() / f24, 0.7f, i10, canvas);
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
        if (this.f31810n != null && this.E.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f31814x.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        y yVar = this.F;
        mc mcVar = this.G;
        mc mcVar2 = this.f31815y;
        if (action == 0) {
            mcVar2.c(z11);
            mcVar.c(z10);
            yVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (mcVar2.f37434i) {
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if ((T instanceof bn) && (viVar = ((bn) T).f46129p1) != null) {
                    viVar.e(true, false);
                }
            } else if (mcVar.f37434i) {
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    Bundle bundle = new Bundle();
                    long j3 = this.f31807c;
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
            mcVar.c(false);
            mcVar2.c(false);
            yVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            mcVar.c(false);
            mcVar2.c(false);
            yVar.setState(new int[0]);
        }
        if (mcVar.f37434i || mcVar2.f37434i) {
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
