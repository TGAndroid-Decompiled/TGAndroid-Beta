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
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.to;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.ui;
public final class ra extends View implements ls {
    public static final int P = 0;
    public final RectF D;
    public final y E;
    public final ic F;
    public final org.telegram.ui.Components.y8 G;
    public final Drawable H;
    public int I;
    public to J;
    public float K;
    public float L;
    public float M;
    public int N;
    public boolean O;
    public final int f30213a;
    public final org.telegram.ui.ActionBar.f6 f30214b;
    public long f30215c;
    public ly0 d;
    public ly0 f30216e;
    public ly0 f30217f;
    public final ArrayList h;
    public qa f30218n;
    public float f30219r;
    public float f30220s;
    public float f30221w;
    public final RectF f30222x;
    public final ic f30223y;

    public ra(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = new ArrayList();
        this.f30222x = new RectF();
        this.f30223y = new ic(this);
        this.D = new RectF();
        this.F = new ic(this);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(this, false);
        this.G = y8Var;
        this.I = -1;
        this.f30213a = i7;
        this.f30214b = f6Var;
        y a02 = org.telegram.ui.ActionBar.k6.a0(822083583, 8, 8);
        this.E = a02;
        a02.setCallback(this);
        y8Var.f40577p = org.telegram.messenger.g0.L(50.0f);
        y8Var.f40576o = org.telegram.messenger.g0.L(13.0f);
        y8Var.f40584x = false;
        y8Var.f40580s = org.telegram.messenger.g0.L(13.0f);
        y8Var.h(org.telegram.messenger.g0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(2131232241).mutate();
        this.H = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final qa a(CharSequence charSequence, String str, boolean z9) {
        int i7;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.K += org.telegram.messenger.g0.L(7.0f);
        }
        qa qaVar = new qa(str, charSequence, z9);
        arrayList.add(qaVar);
        this.K += org.telegram.messenger.g0.L(14.0f);
        this.f30220s = Math.max(this.f30220s, qaVar.f30160a.f35782c);
        float f10 = this.f30221w;
        float f11 = qaVar.f30161b.f35782c;
        if (z9) {
            i7 = org.telegram.messenger.g0.L(38.0f);
        } else {
            i7 = 0;
        }
        this.f30221w = Math.max(f10, f11 + i7);
        return qaVar;
    }

    public final void b(long j3, TLRPC.PeerSettings peerSettings) {
        int i7;
        TLRPC.User a22;
        TLRPC.UserFull b22;
        TL_bots.BotVerification botVerification;
        this.f30215c = j3;
        this.L = 0.0f;
        this.K = 0.0f;
        this.f30220s = 0.0f;
        this.f30221w = 0.0f;
        this.h.clear();
        int i10 = (int) (org.telegram.messenger.g0.f22537q.x * 0.95f);
        this.K += org.telegram.messenger.g0.L(14.0f);
        ly0 ly0Var = new ly0(org.telegram.messenger.m5.l(p10.f24459s0, j3), 14.0f, org.telegram.messenger.g0.o());
        this.d = ly0Var;
        this.K = ly0Var.i() + org.telegram.messenger.g0.L(3.0f) + this.K;
        int i11 = this.f30213a;
        if (org.telegram.messenger.g5.r(i11).x(j3)) {
            i7 = 2131751801;
        } else {
            i7 = 2131751800;
        }
        ly0 ly0Var2 = new ly0(hd.M0(i7, null), 14.0f, null);
        this.f30216e = ly0Var2;
        this.K = ly0Var2.i() + org.telegram.messenger.g0.L(11.0f) + this.K;
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
            a(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), M0, false);
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
            a22 = qp.s1(i11).a2(Long.valueOf(j3));
        }
        if (i12 < 0) {
            b22 = null;
        } else {
            b22 = qp.s1(i11).b2(j3);
        }
        if (b22 == null && i12 > 0) {
            qp.s1(i11).g3(qp.s1(i11).a2(Long.valueOf(j3)), true, 0);
        }
        if (b22 != null) {
            to P0 = qp.s1(i11).P0(j3);
            this.J = P0;
            int max = Math.max(b22.common_chats_count, P0.f25642g);
            if (max > 0) {
                this.f30218n = a(hd.G(max, "Groups", new Object[0]), hd.M0(2131751802, null), true);
                int min = Math.min(3, this.J.f25640e.size());
                org.telegram.ui.Components.y8 y8Var = this.G;
                y8Var.i(min);
                for (int i13 = 0; i13 < Math.min(3, this.J.f25640e.size()); i13++) {
                    y8Var.j(i13, i11, (TLObject) this.J.f25640e.get(i13));
                }
                y8Var.a(true, true);
            } else {
                this.J = null;
                this.f30218n = null;
            }
        } else {
            this.J = null;
            this.f30218n = null;
        }
        this.f30219r = this.f30220s + org.telegram.messenger.g0.L(7.66f) + this.f30221w;
        if (a22 != null && !a22.verified && !t10.A(a22.f27101id)) {
            if (a22.bot_verification_icon != 0) {
                if (b22 != null && (botVerification = b22.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                    this.f30217f = new ly0(spannableStringBuilder2, 12.0f, null);
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r5(botVerification.icon, this.f30217f.f35780a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.append(ij.h0(botVerification.description, false));
                    ly0 ly0Var3 = new ly0(spannableStringBuilder2, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    ly0Var3.a();
                    ly0Var3.m(5);
                    Point point = org.telegram.messenger.g0.f22537q;
                    ly0Var3.p(Math.min(point.x, point.y) * 0.5f);
                    ly0Var3.r(this);
                    this.f30217f = ly0Var3;
                    this.K = this.f30217f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.K;
                } else {
                    this.f30217f = null;
                    this.K += org.telegram.messenger.g0.L(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
                wp wpVar = new wp(2131231126, 0);
                wpVar.H = 0.55f;
                wpVar.I = -0.55f;
                wpVar.f40062r = org.telegram.messenger.g0.L(1.0f);
                wpVar.f40063s = org.telegram.messenger.g0.L(-1.0f);
                spannableStringBuilder3.setSpan(wpVar, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) hd.M0(2131751798, null));
                this.f30217f = new ly0(spannableStringBuilder3, 12.0f, null);
                this.K = this.f30217f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.K;
            }
        } else {
            this.f30217f = null;
            this.K += org.telegram.messenger.g0.L(14.0f);
        }
        float max2 = Math.max(this.L, this.d.k());
        this.L = max2;
        float max3 = Math.max(max2, this.f30216e.k());
        this.L = max3;
        float max4 = Math.max(max3, this.f30219r);
        this.L = max4;
        this.L = Math.min(max4 + org.telegram.messenger.g0.L(32.0f), i10);
    }

    public final void c(float f10, int i7) {
        if (Math.abs(this.M - f10) > 0.01f || i7 != this.N) {
            invalidate();
        }
        this.N = i7;
        this.M = f10;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.E0;
        int i12 = this.f30213a;
        if (i7 == i11) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.f30215c;
            if (longValue == j3) {
                b(j3, qp.s1(i12).C1(this.f30215c));
            }
        } else if (i7 == qs.O3 && ((Long) objArr[0]).longValue() == this.f30215c) {
            to P0 = qp.s1(i12).P0(this.f30215c);
            this.J = P0;
            int i13 = P0.f25642g;
            qa qaVar = this.f30218n;
            if (qaVar != null && i13 > 0) {
                qaVar.f30161b = new ly0(hd.G(i13, "Groups", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
                int min = Math.min(3, this.J.f25640e.size());
                org.telegram.ui.Components.y8 y8Var = this.G;
                y8Var.i(min);
                for (int i14 = 0; i14 < Math.min(3, this.J.f25640e.size()); i14++) {
                    y8Var.j(i14, i12, (TLObject) this.J.f25640e.get(i14));
                }
                y8Var.a(true, true);
            } else {
                b(this.f30215c, qp.s1(i12).C1(this.f30215c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f30213a;
        qs.f(i7).c(this, qs.E0);
        qs.f(i7).c(this, qs.O3);
        this.G.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f30213a;
        qs.f(i7).n(this, qs.E0);
        qs.f(i7).n(this, qs.O3);
        this.G.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        boolean d12;
        boolean z9;
        float f10;
        float f11;
        super.onDraw(canvas);
        org.telegram.ui.ActionBar.f6 f6Var = this.f30214b;
        if (org.telegram.ui.ActionBar.k6.i1(f6Var)) {
            i7 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Fa, f6Var);
        } else {
            i7 = -1;
        }
        int i10 = i7;
        int i11 = this.I;
        Drawable drawable = this.H;
        if (i11 != i10) {
            this.I = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        canvas.save();
        float f12 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.f30222x;
        rectF.set((getWidth() - this.L) / 2.0f, (getHeight() - this.K) / 2.0f, (getWidth() + this.L) / 2.0f, (getHeight() + this.K) / 2.0f);
        float a10 = this.f30223y.a(0.025f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i12 = this.N;
        float x10 = getX();
        float f13 = this.M;
        if (f6Var != null) {
            f6Var.b(x10, f13, measuredWidth, i12);
        } else {
            org.telegram.ui.ActionBar.k6.r(x10, f13, measuredWidth, i12);
        }
        float f14 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", f6Var));
        if (f6Var != null) {
            d12 = f6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.k6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackgroundDarken", f6Var));
        }
        float f15 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.K) / 2.0f);
        float A = com.google.android.recaptcha.internal.a.A(getHeight(), this.K, 2.0f, 0.0f);
        float f16 = 14.0f;
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float L = A + org.telegram.messenger.g0.L(14.0f);
        ly0 ly0Var = this.d;
        float f17 = 32.0f;
        ly0Var.f35793p = this.L - org.telegram.messenger.g0.L(32.0f);
        ly0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, i10, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.g0.L(3.0f));
        float i13 = L + this.d.i() + org.telegram.messenger.g0.L(3.0f);
        ly0 ly0Var2 = this.f30216e;
        ly0Var2.f35793p = this.L - org.telegram.messenger.g0.L(32.0f);
        ly0Var2.c(width - (this.f30216e.k() / 2.0f), this.f30216e.i() / 2.0f, 0.7f, i10, canvas);
        canvas.translate(0.0f, this.f30216e.i() + org.telegram.messenger.g0.L(11.0f));
        float i14 = this.f30216e.i() + org.telegram.messenger.g0.L(11.0f) + i13;
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
            float L2 = (width - (this.L / f12)) + org.telegram.messenger.g0.L(f14) + this.f30220s;
            float f19 = i14;
            ly0 ly0Var3 = qaVar.f30160a;
            float f20 = f14;
            boolean z10 = qaVar.f30162c;
            float f21 = f16;
            RectF rectF2 = qaVar.d;
            float f22 = f17;
            float f23 = L2 - ly0Var3.f35782c;
            float L3 = (width - (this.L / f18)) + org.telegram.messenger.g0.L(f20) + this.f30220s + org.telegram.messenger.g0.L(7.66f);
            ly0Var3.f35793p = (L3 - f23) - org.telegram.messenger.g0.L(7.66f);
            int i16 = i15;
            ly0Var3.c(f23, ly0Var3.i() / f18, 0.7f, i10, canvas);
            float L4 = (width - (this.L / f18)) + org.telegram.messenger.g0.L(f20) + this.f30220s + org.telegram.messenger.g0.L(7.66f);
            float L5 = (width - (this.L / f18)) + org.telegram.messenger.g0.L(f20) + this.f30220s + org.telegram.messenger.g0.L(7.66f) + qaVar.f30161b.f35782c;
            org.telegram.ui.Components.y8 y8Var = this.G;
            if (z10) {
                f10 = y8Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = 0.0f;
            }
            rectF2.set(L4, f19, L5 + f10, qaVar.f30161b.i() + f19);
            if (this.f30218n == qaVar) {
                RectF rectF3 = this.D;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(f18));
                float a11 = this.F.a(0.025f);
                f11 = 4.0f;
                canvas.scale(a11, a11, rectF3.centerX(), qaVar.f30161b.i() / f18);
                y yVar = this.E;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f19), (int) rectF3.right, (int) (rectF3.bottom - f19));
                    yVar.draw(canvas);
                }
            } else {
                f11 = 4.0f;
            }
            ly0 ly0Var4 = qaVar.f30161b;
            ly0Var4.f35793p = (((this.L / f18) + width) - org.telegram.messenger.g0.L(8.0f)) - L3;
            ly0Var4.c(L3, qaVar.f30161b.i() / f18, 1.0f, i10, canvas);
            if (z10) {
                canvas.save();
                canvas.translate((width - (this.L / f18)) + org.telegram.messenger.g0.L(f20) + this.f30220s + org.telegram.messenger.g0.L(7.66f) + qaVar.f30161b.f35782c + org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(1.0f));
                y8Var.g(canvas);
                canvas.translate(y8Var.A + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(13.0f) / f18);
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
        if (this.f30217f != null) {
            canvas.translate(0.0f, org.telegram.messenger.g0.L(12.0f));
            ly0 ly0Var5 = this.f30217f;
            if (ly0Var5.f35784f > 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                ly0Var5.c(width - (ly0Var5.k() / f24), 0.0f, 0.7f, i10, canvas);
            } else {
                ly0Var5.f35793p = this.L - org.telegram.messenger.g0.L(f25);
                ly0Var5.c(width - (this.f30217f.k() / f24), this.f30217f.i() / f24, 0.7f, i10, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.k5.b(16.0f, (int) this.K, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        ui uiVar;
        if (this.f30218n != null && this.D.contains(motionEvent.getX(), motionEvent.getY())) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && this.f30222x.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        y yVar = this.E;
        ic icVar = this.F;
        ic icVar2 = this.f30223y;
        if (action == 0) {
            icVar2.c(z10);
            icVar.c(z9);
            yVar.setState(z9 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (icVar2.f34555i) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if ((T instanceof an) && (uiVar = ((an) T).f43898o1) != null) {
                    uiVar.e(true, false);
                }
            } else if (icVar.f34555i) {
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    Bundle bundle = new Bundle();
                    long j3 = this.f30215c;
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
            icVar.c(false);
            icVar2.c(false);
            yVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
            icVar2.c(false);
            yVar.setState(new int[0]);
        }
        if (icVar.f34555i || icVar2.f34555i) {
            return true;
        }
        return false;
    }

    public void setAnimating(boolean z9) {
        this.O = z9;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
