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
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ko;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qi;
import org.telegram.ui.wm;
public final class ra extends View implements cs {
    public static final int Q = 0;
    public final RectF E;
    public final y F;
    public final gc G;
    public final org.telegram.ui.Components.w8 H;
    public final Drawable I;
    public int J;
    public ko K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int f30291a;
    public final org.telegram.ui.ActionBar.e6 f30292b;
    public long f30293c;
    public ly0 d;
    public ly0 f30294e;
    public ly0 f30295f;
    public final ArrayList h;
    public qa f30296n;
    public float f30297r;
    public float f30298s;
    public float f30299w;
    public final RectF f30300x;
    public final gc f30301y;

    public ra(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = new ArrayList();
        this.f30300x = new RectF();
        this.f30301y = new gc(this);
        this.E = new RectF();
        this.G = new gc(this);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(this, false);
        this.H = w8Var;
        this.J = -1;
        this.f30291a = i3;
        this.f30292b = e6Var;
        y a02 = org.telegram.ui.ActionBar.k6.a0(822083583, 8, 8);
        this.F = a02;
        a02.setCallback(this);
        w8Var.f39960p = org.telegram.messenger.g0.L(50.0f);
        w8Var.f39959o = org.telegram.messenger.g0.L(13.0f);
        w8Var.f39967x = false;
        w8Var.f39963s = org.telegram.messenger.g0.L(13.0f);
        w8Var.h(org.telegram.messenger.g0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(2131232241).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final qa a(CharSequence charSequence, String str, boolean z10) {
        int i3;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += org.telegram.messenger.g0.L(7.0f);
        }
        qa qaVar = new qa(str, charSequence, z10);
        arrayList.add(qaVar);
        this.L += org.telegram.messenger.g0.L(14.0f);
        this.f30298s = Math.max(this.f30298s, qaVar.f30242a.f35918c);
        float f10 = this.f30299w;
        float f11 = qaVar.f30243b.f35918c;
        if (z10) {
            i3 = org.telegram.messenger.g0.L(38.0f);
        } else {
            i3 = 0;
        }
        this.f30299w = Math.max(f10, f11 + i3);
        return qaVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        int i3;
        TLRPC.User a22;
        TLRPC.UserFull b22;
        TL_bots.BotVerification botVerification;
        this.f30293c = j10;
        this.M = 0.0f;
        this.L = 0.0f;
        this.f30298s = 0.0f;
        this.f30299w = 0.0f;
        this.h.clear();
        int i10 = (int) (org.telegram.messenger.g0.f22608q.x * 0.95f);
        this.L += org.telegram.messenger.g0.L(14.0f);
        ly0 ly0Var = new ly0(org.telegram.messenger.m5.l(h10.f22829t0, j10), 14.0f, org.telegram.messenger.g0.o());
        this.d = ly0Var;
        this.L = ly0Var.i() + org.telegram.messenger.g0.L(3.0f) + this.L;
        int i11 = this.f30291a;
        if (org.telegram.messenger.g5.r(i11).x(j10)) {
            i3 = 2131751801;
        } else {
            i3 = 2131751800;
        }
        ly0 ly0Var2 = new ly0(bd.M0(i3, null), 14.0f, null);
        this.f30294e = ly0Var2;
        this.L = ly0Var2.i() + org.telegram.messenger.g0.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = bd.M0(2131751797, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String F0 = bd.F0(str);
            if (!TextUtils.isEmpty(F0)) {
                spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            }
            String i02 = bd.i0(2131751796, str);
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
            String M02 = bd.M0(2131751795, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = bd.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, M02, false);
        }
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 < 0) {
            a22 = null;
        } else {
            a22 = hp.s1(i11).a2(Long.valueOf(j10));
        }
        if (i12 < 0) {
            b22 = null;
        } else {
            b22 = hp.s1(i11).b2(j10);
        }
        if (b22 == null && i12 > 0) {
            hp.s1(i11).g3(hp.s1(i11).a2(Long.valueOf(j10)), true, 0);
        }
        if (b22 != null) {
            ko P0 = hp.s1(i11).P0(j10);
            this.K = P0;
            int max = Math.max(b22.common_chats_count, P0.f23859g);
            if (max > 0) {
                this.f30296n = a(bd.G(max, "Groups", new Object[0]), bd.M0(2131751802, null), true);
                int min = Math.min(3, this.K.f23857e.size());
                org.telegram.ui.Components.w8 w8Var = this.H;
                w8Var.i(min);
                for (int i13 = 0; i13 < Math.min(3, this.K.f23857e.size()); i13++) {
                    w8Var.j(i13, i11, (TLObject) this.K.f23857e.get(i13));
                }
                w8Var.a(true, true);
            } else {
                this.K = null;
                this.f30296n = null;
            }
        } else {
            this.K = null;
            this.f30296n = null;
        }
        this.f30297r = this.f30298s + org.telegram.messenger.g0.L(7.66f) + this.f30299w;
        if (a22 != null && !a22.verified && !l10.A(a22.f27150id)) {
            if (a22.bot_verification_icon != 0) {
                if (b22 != null && (botVerification = b22.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                    this.f30295f = new ly0(spannableStringBuilder2, 12.0f, null);
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(botVerification.icon, this.f30295f.f35916a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.append(zi.h0(botVerification.description, false));
                    ly0 ly0Var3 = new ly0(spannableStringBuilder2, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    ly0Var3.a();
                    ly0Var3.m(5);
                    Point point = org.telegram.messenger.g0.f22608q;
                    ly0Var3.p(Math.min(point.x, point.y) * 0.5f);
                    ly0Var3.r(this);
                    this.f30295f = ly0Var3;
                    this.L = this.f30295f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
                } else {
                    this.f30295f = null;
                    this.L += org.telegram.messenger.g0.L(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
                wp wpVar = new wp(2131231126, 0);
                wpVar.I = 0.55f;
                wpVar.J = -0.55f;
                wpVar.f40045r = org.telegram.messenger.g0.L(1.0f);
                wpVar.f40046s = org.telegram.messenger.g0.L(-1.0f);
                spannableStringBuilder3.setSpan(wpVar, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) bd.M0(2131751798, null));
                this.f30295f = new ly0(spannableStringBuilder3, 12.0f, null);
                this.L = this.f30295f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
            }
        } else {
            this.f30295f = null;
            this.L += org.telegram.messenger.g0.L(14.0f);
        }
        float max2 = Math.max(this.M, this.d.k());
        this.M = max2;
        float max3 = Math.max(max2, this.f30294e.k());
        this.M = max3;
        float max4 = Math.max(max3, this.f30297r);
        this.M = max4;
        this.M = Math.min(max4 + org.telegram.messenger.g0.L(32.0f), i10);
    }

    public final void c(float f10, int i3) {
        if (Math.abs(this.N - f10) > 0.01f || i3 != this.O) {
            invalidate();
        }
        this.O = i3;
        this.N = f10;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.E0;
        int i12 = this.f30291a;
        if (i3 == i11) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.f30293c;
            if (longValue == j10) {
                b(j10, hp.s1(i12).C1(this.f30293c));
            }
        } else if (i3 == hs.O3 && ((Long) objArr[0]).longValue() == this.f30293c) {
            ko P0 = hp.s1(i12).P0(this.f30293c);
            this.K = P0;
            int i13 = P0.f23859g;
            qa qaVar = this.f30296n;
            if (qaVar != null && i13 > 0) {
                qaVar.f30243b = new ly0(bd.G(i13, "Groups", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
                int min = Math.min(3, this.K.f23857e.size());
                org.telegram.ui.Components.w8 w8Var = this.H;
                w8Var.i(min);
                for (int i14 = 0; i14 < Math.min(3, this.K.f23857e.size()); i14++) {
                    w8Var.j(i14, i12, (TLObject) this.K.f23857e.get(i14));
                }
                w8Var.a(true, true);
            } else {
                b(this.f30293c, hp.s1(i12).C1(this.f30293c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.f30291a;
        hs.f(i3).c(this, hs.E0);
        hs.f(i3).c(this, hs.O3);
        this.H.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.f30291a;
        hs.f(i3).n(this, hs.E0);
        hs.f(i3).n(this, hs.O3);
        this.H.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        boolean d12;
        boolean z10;
        float f10;
        float f11;
        super.onDraw(canvas);
        org.telegram.ui.ActionBar.e6 e6Var = this.f30292b;
        if (org.telegram.ui.ActionBar.k6.i1(e6Var)) {
            i3 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Fa, e6Var);
        } else {
            i3 = -1;
        }
        int i10 = i3;
        int i11 = this.J;
        Drawable drawable = this.I;
        if (i11 != i10) {
            this.J = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        canvas.save();
        float f12 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.f30300x;
        rectF.set((getWidth() - this.M) / 2.0f, (getHeight() - this.L) / 2.0f, (getWidth() + this.M) / 2.0f, (getHeight() + this.L) / 2.0f);
        float a10 = this.f30301y.a(0.025f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i12 = this.O;
        float x10 = getX();
        float f13 = this.N;
        if (e6Var != null) {
            e6Var.b(x10, f13, measuredWidth, i12);
        } else {
            org.telegram.ui.ActionBar.k6.r(x10, f13, measuredWidth, i12);
        }
        float f14 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", e6Var));
        if (e6Var != null) {
            d12 = e6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.k6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackgroundDarken", e6Var));
        }
        float f15 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float z11 = com.google.android.recaptcha.internal.a.z(getHeight(), this.L, 2.0f, 0.0f);
        float f16 = 14.0f;
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float L = z11 + org.telegram.messenger.g0.L(14.0f);
        ly0 ly0Var = this.d;
        float f17 = 32.0f;
        ly0Var.f35929p = this.M - org.telegram.messenger.g0.L(32.0f);
        ly0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, i10, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.g0.L(3.0f));
        float i13 = L + this.d.i() + org.telegram.messenger.g0.L(3.0f);
        ly0 ly0Var2 = this.f30294e;
        ly0Var2.f35929p = this.M - org.telegram.messenger.g0.L(32.0f);
        ly0Var2.c(width - (this.f30294e.k() / 2.0f), this.f30294e.i() / 2.0f, 0.7f, i10, canvas);
        canvas.translate(0.0f, this.f30294e.i() + org.telegram.messenger.g0.L(11.0f));
        float i14 = this.f30294e.i() + org.telegram.messenger.g0.L(11.0f) + i13;
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
            float L2 = (width - (this.M / f12)) + org.telegram.messenger.g0.L(f14) + this.f30298s;
            float f19 = i14;
            ly0 ly0Var3 = qaVar.f30242a;
            float f20 = f14;
            boolean z12 = qaVar.f30244c;
            float f21 = f16;
            RectF rectF2 = qaVar.d;
            float f22 = f17;
            float f23 = L2 - ly0Var3.f35918c;
            float L3 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f30298s + org.telegram.messenger.g0.L(7.66f);
            ly0Var3.f35929p = (L3 - f23) - org.telegram.messenger.g0.L(7.66f);
            int i16 = i15;
            ly0Var3.c(f23, ly0Var3.i() / f18, 0.7f, i10, canvas);
            float L4 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f30298s + org.telegram.messenger.g0.L(7.66f);
            float L5 = (width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f30298s + org.telegram.messenger.g0.L(7.66f) + qaVar.f30243b.f35918c;
            org.telegram.ui.Components.w8 w8Var = this.H;
            if (z12) {
                f10 = w8Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = 0.0f;
            }
            rectF2.set(L4, f19, L5 + f10, qaVar.f30243b.i() + f19);
            if (this.f30296n == qaVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(f18));
                float a11 = this.G.a(0.025f);
                f11 = 4.0f;
                canvas.scale(a11, a11, rectF3.centerX(), qaVar.f30243b.i() / f18);
                y yVar = this.F;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f19), (int) rectF3.right, (int) (rectF3.bottom - f19));
                    yVar.draw(canvas);
                }
            } else {
                f11 = 4.0f;
            }
            ly0 ly0Var4 = qaVar.f30243b;
            ly0Var4.f35929p = (((this.M / f18) + width) - org.telegram.messenger.g0.L(8.0f)) - L3;
            ly0Var4.c(L3, qaVar.f30243b.i() / f18, 1.0f, i10, canvas);
            if (z12) {
                canvas.save();
                canvas.translate((width - (this.M / f18)) + org.telegram.messenger.g0.L(f20) + this.f30298s + org.telegram.messenger.g0.L(7.66f) + qaVar.f30243b.f35918c + org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(1.0f));
                w8Var.g(canvas);
                canvas.translate(w8Var.A + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(13.0f) / f18);
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
        if (this.f30295f != null) {
            canvas.translate(0.0f, org.telegram.messenger.g0.L(12.0f));
            ly0 ly0Var5 = this.f30295f;
            if (ly0Var5.f35920f > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ly0Var5.c(width - (ly0Var5.k() / f24), 0.0f, 0.7f, i10, canvas);
            } else {
                ly0Var5.f35929p = this.M - org.telegram.messenger.g0.L(f25);
                ly0Var5.c(width - (this.f30295f.k() / f24), this.f30295f.i() / f24, 0.7f, i10, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.k5.b(16.0f, (int) this.L, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        qi qiVar;
        if (this.f30296n != null && this.E.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f30300x.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        y yVar = this.F;
        gc gcVar = this.G;
        gc gcVar2 = this.f30301y;
        if (action == 0) {
            gcVar2.c(z11);
            gcVar.c(z10);
            yVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (gcVar2.f34049i) {
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if ((T instanceof wm) && (qiVar = ((wm) T).f51433p1) != null) {
                    qiVar.e(true, false);
                }
            } else if (gcVar.f34049i) {
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    Bundle bundle = new Bundle();
                    long j10 = this.f30293c;
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
            gcVar.c(false);
            gcVar2.c(false);
            yVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            gcVar.c(false);
            gcVar2.c(false);
            yVar.setState(new int[0]);
        }
        if (gcVar.f34049i || gcVar2.f34049i) {
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
