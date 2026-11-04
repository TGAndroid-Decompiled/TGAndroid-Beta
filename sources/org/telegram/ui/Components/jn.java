package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class jn extends FrameLayout implements qe.b, org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.k A0;
    public final ImageView E;
    public final ImageView F;
    public final zz0 G;
    public final org.telegram.ui.wm H;
    public final nu0[] I;
    public final u8 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public nu0 O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final qe.a f35120a;
    public CharSequence f35121a0;
    public boolean f35122b;
    public int f35123b0;
    public Integer f35124c;
    public Integer f35125c0;
    public final int d;
    public final os0 f35126d0;
    public final fn f35127e;
    public final org.telegram.ui.ActionBar.e6 f35128e0;
    public final boolean f35129f;
    public boolean f35130f0;
    public final e5 f35131g0;
    public final org.telegram.ui.kk h;
    public final e5 f35132h0;
    public final gc f35133i0;
    public final cn f35134j0;
    public boolean f35135k0;
    public boolean f35136l0;
    public boolean m0;
    public final AtomicReference f35137n;
    public boolean f35138n0;
    public boolean f35139o0;
    public boolean f35140p0;
    public String f35141q0;
    public final org.telegram.ui.kk f35142r;
    public String f35143r0;
    public final h6 f35144s;
    public Drawable f35145s0;
    public Drawable f35146t0;
    public Drawable f35147u0;
    public boolean f35148v0;
    public final AtomicReference f35149w;
    public PorterDuffColorFilter f35150w0;
    public final ImageView f35151x;
    public PorterDuffColorFilter f35152x0;
    public final ImageView f35153y;
    public int f35154y0;
    public int f35155z0;

    public jn(android.content.Context r22, org.telegram.ui.ActionBar.d2 r23, boolean r24, org.telegram.ui.ActionBar.e6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.<init>(android.content.Context, org.telegram.ui.ActionBar.d2, boolean, org.telegram.ui.ActionBar.e6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.wm wmVar = this.H;
        org.telegram.ui.kk kkVar = this.f35142r;
        if (kkVar != null) {
            int i3 = 0;
            nu0[] nu0VarArr = this.I;
            if (z10) {
                try {
                    int intValue = org.telegram.messenger.hp.s1(this.K).E1(wmVar.a(), wmVar.f51475s4).intValue();
                    nu0 nu0Var = nu0VarArr[intValue];
                    if (nu0Var != null) {
                        org.telegram.ui.ActionBar.e6 e6Var = this.f35128e0;
                        if (intValue == 5) {
                            kkVar.g(nu0Var, "**oo**");
                            nu0VarArr[intValue].b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28105pa, e6Var));
                            kkVar.setLeftDrawable((Drawable) null);
                        } else {
                            kkVar.g(null, null);
                            nu0VarArr[intValue].b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28105pa, e6Var));
                            kkVar.setLeftDrawable(nu0VarArr[intValue]);
                        }
                        this.O = nu0VarArr[intValue];
                        while (i3 < nu0VarArr.length) {
                            nu0 nu0Var2 = nu0VarArr[i3];
                            if (nu0Var2 != null) {
                                if (i3 == intValue) {
                                    nu0Var2.d();
                                } else {
                                    nu0Var2.e();
                                }
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            this.O = null;
            kkVar.setLeftDrawable((Drawable) null);
            kkVar.g(null, null);
            while (i3 < nu0VarArr.length) {
                nu0 nu0Var3 = nu0VarArr[i3];
                if (nu0Var3 != null) {
                    nu0Var3.e();
                }
                i3++;
            }
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        ImageView imageView;
        int i10;
        if (i3 == 0 && (imageView = this.f35151x) != null) {
            imageView.setAlpha(f10);
            float f12 = 0.85f * f10;
            imageView.setScaleX(f12);
            imageView.setScaleY(f12);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int L;
        float f10;
        int i3;
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar != null) {
            TLRPC.User j10 = wmVar.j();
            TLRPC.Chat chat = wmVar.f51292e;
            if (wmVar.f51325g4 == 3) {
                long c92 = wmVar.c9();
                if (c92 >= 0) {
                    user = wmVar.getMessagesController().a2(Long.valueOf(c92));
                    chat = null;
                } else {
                    chat = wmVar.getMessagesController().M0(Long.valueOf(-c92));
                    user = null;
                }
            } else {
                user = j10;
            }
            u8 u8Var = this.J;
            fn fnVar = this.f35127e;
            if (user != null) {
                u8Var.r(user);
                if (org.telegram.messenger.l10.z(user)) {
                    u8Var.f38691p = 0.8f;
                    u8Var.g(12);
                    if (fnVar != null) {
                        fnVar.setAnimatedEmojiDrawable(null);
                        fnVar.j(null, null, u8Var, user);
                    }
                } else if (org.telegram.messenger.l10.s(user)) {
                    u8Var.f38691p = 0.8f;
                    u8Var.g(21);
                    if (fnVar != null) {
                        fnVar.setAnimatedEmojiDrawable(null);
                        fnVar.j(null, null, u8Var, user);
                    }
                } else if (org.telegram.messenger.l10.B(user) && wmVar.f51325g4 == 3) {
                    u8Var.f38691p = 0.8f;
                    u8Var.g(22);
                    if (fnVar != null) {
                        fnVar.setAnimatedEmojiDrawable(null);
                        fnVar.j(null, null, u8Var, user);
                    }
                } else if (org.telegram.messenger.l10.B(user)) {
                    u8Var.f38691p = 0.8f;
                    u8Var.g(1);
                    if (fnVar != null) {
                        fnVar.setAnimatedEmojiDrawable(null);
                        fnVar.j(null, null, u8Var, user);
                    }
                } else {
                    u8Var.f38691p = 1.0f;
                    if (fnVar != null) {
                        fnVar.setAnimatedEmojiDrawable(null);
                        fnVar.f35342a.j0(user, u8Var, null, true, 3, false);
                    }
                }
            } else if (org.telegram.messenger.t3.p0(chat)) {
                long b10 = wmVar.b();
                int i10 = this.K;
                if (org.telegram.messenger.t3.A(i10, chat, 24) && b10 != 0) {
                    if (i3 > 0) {
                        TLRPC.User a22 = wmVar.getMessagesController().a2(Long.valueOf(b10));
                        u8Var.r(a22);
                        fnVar.setAnimatedEmojiDrawable(null);
                        fnVar.e(a22, u8Var);
                    } else {
                        TLRPC.Chat M0 = wmVar.getMessagesController().M0(Long.valueOf(-b10));
                        u8Var.q(M0);
                        fnVar.setAnimatedEmojiDrawable(null);
                        fnVar.e(M0, u8Var);
                    }
                } else {
                    fnVar.setAnimatedEmojiDrawable(null);
                    rg.c.o(i10, chat, u8Var, fnVar);
                }
                fnVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            } else if (chat != null) {
                u8Var.f38691p = 1.0f;
                u8Var.q(chat);
                if (fnVar != null) {
                    fnVar.setAnimatedEmojiDrawable(null);
                    fnVar.e(chat, u8Var);
                    if (chat.forum) {
                        if (org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).P1().K(-chat.f27001id)) {
                            f10 = 11.0f;
                        } else {
                            f10 = 16.0f;
                        }
                        L = org.telegram.messenger.g0.L(f10);
                    } else {
                        L = org.telegram.messenger.g0.L(21.0f);
                    }
                    fnVar.setRoundRadius(L);
                }
            }
        }
    }

    public final e5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        e5 e5Var = this.f35132h0;
        e5Var.j(j10, false);
        e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, this.f35128e0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        e5Var.J = 0;
        e5Var.K = L;
        return e5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
            }
        } else if (i3 == org.telegram.messenger.hs.f23246i4) {
            org.telegram.ui.kk kkVar = this.h;
            if (kkVar != null) {
                kkVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i3 == org.telegram.messenger.hs.f23234g3) {
            n(true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f35133i0.a(0.02f);
        canvas.scale(a10, a10, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f35136l0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.f35127e) {
            boolean z11 = false;
            ImageView imageView = this.f35151x;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f35153y;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z11 = true;
            }
            if (z10 || z11) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (z10) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.k6.Cm);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.k6.Cm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jn.e(boolean, boolean):void");
    }

    public final void g(int i3, boolean z10) {
        zz0 zz0Var = this.G;
        if (zz0Var != null) {
            boolean z11 = this.f35138n0;
            if (i3 == 0 && !this.U) {
                return;
            }
            qe.a aVar = this.f35120a;
            if (!z11) {
                aVar.a(true, z10);
                zz0Var.b(i3);
                return;
            }
            aVar.a(false, z10);
        }
    }

    public k9 getAvatarImageView() {
        return this.f35127e;
    }

    public int getLastSubtitleColorKey() {
        return this.f35123b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public os0 getSharedMediaPreloader() {
        return this.f35126d0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.kk kkVar = this.f35142r;
        if (kkVar != null) {
            return kkVar.getTextPaint();
        }
        return this.f35144s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.kk kkVar = this.f35142r;
        if (kkVar != null) {
            return kkVar;
        }
        h6 h6Var = this.f35144s;
        if (h6Var != null) {
            return h6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f35151x;
    }

    public org.telegram.ui.ActionBar.k5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int L;
        float f10 = 0.0f;
        org.telegram.ui.kk kkVar = this.h;
        if (kkVar != null) {
            f10 = Math.max(0.0f, kkVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.kk kkVar2 = this.f35142r;
        if (kkVar2 != null) {
            f10 = Math.max(f10, kkVar2.getExactWidthIncludeDrawables());
        }
        fn fnVar = this.f35127e;
        if (fnVar != null && fnVar.getVisibility() == 0) {
            L = org.telegram.messenger.g0.L(70.0f);
        } else {
            L = org.telegram.messenger.g0.L(34.0f);
        }
        return (int) (f10 + L);
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.i6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.f35140p0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(2131232789).mutate();
                this.f35146t0 = mutate;
                int i3 = org.telegram.ui.ActionBar.k6.f28073ni;
                org.telegram.ui.ActionBar.e6 e6Var = this.f35128e0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.y(this, mutate, i3, e6Var, mode);
                Drawable mutate2 = getResources().getDrawable(2131232790).mutate();
                this.f35147u0 = mutate2;
                org.telegram.ui.ActionBar.r6.y(this, mutate2, org.telegram.ui.ActionBar.k6.f28093oi, this.f35128e0, mode);
                this.h.j(new xp(this.f35146t0, this.f35147u0));
                this.f35139o0 = true;
                this.f35143r0 = org.telegram.messenger.bd.M0(2131754739, null);
            } else if (this.h.getRightDrawable() instanceof kk0) {
                this.h.j(null);
                this.f35139o0 = false;
                this.f35143r0 = null;
            }
        } else {
            this.f35140p0 = true;
            if (!(this.h.getRightDrawable() instanceof kk0)) {
                kk0 kk0Var = new kk0(!z10 ? 1 : 0);
                kk0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.f35128e0));
                this.h.j(kk0Var);
                this.f35143r0 = org.telegram.messenger.bd.M0(2131745872, null);
                this.f35139o0 = true;
            }
        }
        if (!z13 && org.telegram.messenger.m5.f(emojiStatus) == 0) {
            this.h.i(null);
            this.f35141q0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof f5) && (((f5) this.h.getRightDrawable()).f33703a instanceof g5)) {
                ((g5) ((f5) this.h.getRightDrawable()).f33703a).n(this.h);
            }
            if (org.telegram.messenger.m5.f(emojiStatus) != 0) {
                this.f35131g0.j(org.telegram.messenger.m5.f(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = org.telegram.messenger.t0.f25457b.getDrawable(2131232307).mutate();
                this.f35145s0 = mutate3;
                org.telegram.ui.ActionBar.r6.y(this, mutate3, org.telegram.ui.ActionBar.k6.f28073ni, this.f35128e0, PorterDuff.Mode.MULTIPLY);
                this.f35131g0.g(this.f35145s0, z14);
            } else {
                this.f35131g0.g(null, z14);
            }
            this.f35131g0.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, this.f35128e0)));
            this.h.i(this.f35131g0);
            this.f35139o0 = false;
            this.f35141q0 = org.telegram.messenger.bd.M0(2131754802, null);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.h(z14);
        }
    }

    public final void i(int i3, int i10) {
        org.telegram.ui.kk kkVar = this.h;
        org.telegram.ui.ActionBar.r6.r(kkVar);
        org.telegram.ui.kk kkVar2 = this.f35142r;
        org.telegram.ui.ActionBar.r6.r(kkVar2);
        kkVar.setTextColor(i3);
        kkVar2.setTextColor(i10);
        kkVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.kk kkVar = this.h;
        kkVar.setLeftDrawable(drawable);
        if (!this.f35139o0 && !this.f35140p0) {
            if (drawable2 != null) {
                this.f35143r0 = org.telegram.messenger.bd.M0(2131747909, null);
            } else {
                this.f35143r0 = null;
            }
            kkVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        u8 u8Var = this.J;
        u8Var.r(user);
        boolean z11 = org.telegram.messenger.l10.z(user);
        fn fnVar = this.f35127e;
        if (z11) {
            u8Var.g(12);
            u8Var.f38691p = 0.8f;
            if (fnVar != null) {
                fnVar.j(null, null, u8Var, user);
            }
        } else if (org.telegram.messenger.l10.s(user)) {
            u8Var.g(21);
            u8Var.f38691p = 0.8f;
            if (fnVar != null) {
                fnVar.j(null, null, u8Var, user);
            }
        } else if (org.telegram.messenger.l10.B(user) && !z10) {
            u8Var.g(1);
            u8Var.f38691p = 0.8f;
            if (fnVar != null) {
                fnVar.j(null, null, u8Var, user);
            }
        } else {
            u8Var.f38691p = 1.0f;
            if (fnVar != null) {
                fnVar.e(user, u8Var);
            }
        }
    }

    public final void l() {
        String str;
        int i3 = this.W;
        if (i3 == 2) {
            str = org.telegram.messenger.bd.M0(2131743222, null);
        } else if (i3 == 1) {
            str = org.telegram.messenger.bd.M0(2131751809, null);
        } else if (i3 == 5) {
            str = org.telegram.messenger.bd.M0(2131743820, null);
        } else if (i3 == 4) {
            str = org.telegram.messenger.bd.M0(2131751807, null);
        } else {
            str = null;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f35128e0;
        h6 h6Var = this.f35144s;
        org.telegram.ui.kk kkVar = this.f35142r;
        if (str == null) {
            CharSequence charSequence = this.f35121a0;
            if (charSequence != null) {
                if (kkVar != null) {
                    kkVar.k(charSequence);
                    this.f35121a0 = null;
                    Integer num = this.f35125c0;
                    if (num != null) {
                        kkVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.f35123b0;
                        if (i10 >= 0) {
                            org.telegram.ui.ActionBar.r6.Y(kkVar, i10, e6Var);
                            kkVar.setTag(Integer.valueOf(this.f35123b0));
                        }
                    }
                } else if (h6Var != null) {
                    h6Var.c(charSequence, !org.telegram.messenger.bd.f21784a0, true);
                    this.f35121a0 = null;
                    Integer num2 = this.f35125c0;
                    if (num2 != null) {
                        h6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.f35123b0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.r6.Z(h6Var, i11, e6Var);
                            h6Var.setTag(Integer.valueOf(this.f35123b0));
                        }
                    }
                }
            }
        } else if (kkVar != null) {
            if (this.f35121a0 == null) {
                this.f35121a0 = kkVar.getText();
            }
            kkVar.k(str);
            Integer num3 = this.f35125c0;
            if (num3 != null) {
                kkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.k6.B8;
                org.telegram.ui.ActionBar.r6.Y(kkVar, i12, e6Var);
                kkVar.setTag(Integer.valueOf(i12));
            }
        } else if (h6Var != null) {
            if (this.f35121a0 == null) {
                this.f35121a0 = h6Var.getText();
            }
            h6Var.c(str, !org.telegram.messenger.bd.f21784a0, true);
            Integer num4 = this.f35125c0;
            if (num4 != null) {
                h6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.k6.B8;
                org.telegram.ui.ActionBar.r6.Z(h6Var, i13, e6Var);
                h6Var.setTag(Integer.valueOf(i13));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar != null) {
            this.V = 0;
            TLRPC.ChatFull chatFull = wmVar.f51453q8;
            if (chatFull != null) {
                int i3 = this.K;
                int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (z10 && chatFull.participants_count > 200) {
                        this.V = chatFull.online_count;
                        return;
                    }
                    return;
                }
                for (int i10 = 0; i10 < chatFull.participants.participants.size(); i10++) {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
                    if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.f27150id == org.telegram.messenger.h10.i(i3).e()) && a22.status.expires > 10000)) {
                        this.V++;
                    }
                }
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        int i3;
        boolean z12;
        boolean z13;
        boolean[] zArr;
        int i10;
        String G;
        TLRPC.ChatParticipants chatParticipants;
        int i11;
        String S;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList l10;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35128e0;
        boolean[] zArr2 = this.S;
        h6 h6Var = this.f35144s;
        org.telegram.ui.kk kkVar = this.f35142r;
        org.telegram.ui.kk kkVar2 = this.h;
        int i19 = this.K;
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar != null) {
            if (wmVar.f51325g4 == 6) {
                String str = wmVar.f51297e4.link;
                lg.z[] zVarArr = lg.z.f18522e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User j10 = wmVar.j();
            TLRPC.Chat chat = wmVar.f51292e;
            if (org.telegram.messenger.l10.B(j10) && wmVar.f51325g4 == 0 && wmVar.getMessagesController().G1().c() >= 3 && (this.f35148v0 || org.telegram.messenger.hp.e1().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((org.telegram.messenger.l10.B(j10) && !z11) || org.telegram.messenger.l10.z(j10) || ((j10 != null && j10.f27150id == 489000) || ((i3 = wmVar.f51325g4) != 0 && i3 != 8))) && wmVar.f51325g4 != 3) {
                if (getSubtitleTextView().getVisibility() != 8) {
                    getSubtitleTextView().setVisibility(8);
                    return;
                }
                return;
            }
            if (z11) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    i18 = 0;
                    getSubtitleTextView().setVisibility(0);
                } else {
                    i18 = 0;
                }
                if (!this.f35148v0) {
                    org.telegram.messenger.hp.e1().edit().putInt("savedmsgschatshint", org.telegram.messenger.hp.e1().getInt("savedmsgschatshint", i18) + 1).apply();
                    this.f35148v0 = true;
                }
            }
            CharSequence D1 = org.telegram.messenger.hp.s1(i19).D1(wmVar.a(), wmVar.f51475s4, false);
            CharSequence charSequence = "";
            if (D1 != null) {
                D1 = TextUtils.replace(D1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z14 = z11;
            if (D1 != null && D1.length() != 0 && (!org.telegram.messenger.t3.T(chat) || chat.megagroup)) {
                if (wmVar.da() && kkVar2.getTag() != null) {
                    kkVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.R = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(kkVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.R.addListener(new in(this, 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        kkVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer E1 = org.telegram.messenger.hp.s1(i19).E1(wmVar.a(), wmVar.f51475s4);
                if (E1 != null && E1.intValue() == 5) {
                    charSequence = org.telegram.messenger.i6.m(D1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = D1;
                }
                setTypingAnimation(true);
                z13 = true;
            } else if (wmVar.da() && !wmVar.f51525w4) {
                if (kkVar2.getTag() == null) {
                    kkVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.R;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.R = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.R = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(kkVar2, property2, org.telegram.messenger.g0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.R.addListener(new in(this, 0));
                        this.R.setDuration(180L);
                        this.R.start();
                        return;
                    }
                    kkVar2.setTranslationY(org.telegram.messenger.g0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = wmVar.f51325g4;
                if (i20 == 8) {
                    if (wmVar.f51349i4) {
                        charSequence = org.telegram.messenger.bd.M0(2131752219, null);
                        z13 = false;
                    } else {
                        if (wmVar.b() == 0) {
                            org.telegram.messenger.c00 c00Var = wmVar.getMessagesController().f23102q7;
                            long j11 = -wmVar.a();
                            if (c00Var.e(j11) && (l10 = c00Var.l(j11)) != null) {
                                i16 = l10.size();
                            } else {
                                i16 = 0;
                            }
                            if (i16 > 0) {
                                G = org.telegram.messenger.bd.H(',', "Chats", i16);
                            } else {
                                G = org.telegram.messenger.bd.M0(2131752219, null);
                            }
                        } else {
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.hp.s1(i19).f23102q7.f(chat.f27001id, wmVar.b());
                            if (f10 != null) {
                                i15 = f10.totalMessagesCount;
                            } else {
                                i15 = 0;
                            }
                            if (i15 > 0) {
                                G = org.telegram.messenger.bd.G(i15, "messages", Integer.valueOf(i15));
                            } else {
                                G = org.telegram.messenger.bd.a0(null, null, 2131744020, rg.c.i(i19, chat, false));
                            }
                        }
                        charSequence = G;
                        z13 = false;
                    }
                } else {
                    if (i20 == 3) {
                        org.telegram.messenger.nv G1 = wmVar.getMessagesController().G1();
                        long c92 = wmVar.c9();
                        ArrayList arrayList = G1.f24441j;
                        int i21 = 0;
                        while (true) {
                            if (i21 < arrayList.size()) {
                                org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList.get(i21);
                                if (mvVar.f24264a == c92) {
                                    i14 = mvVar.f24267e;
                                    break;
                                }
                                i21++;
                            } else {
                                i14 = 0;
                                break;
                            }
                        }
                        charSequence = org.telegram.messenger.bd.G(Math.max(1, i14), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (wmVar.f51525w4 && chat != null) {
                            TLRPC.TL_forumTopic f11 = org.telegram.messenger.hp.s1(i19).f23102q7.f(chat.f27001id, wmVar.b());
                            if (f11 != null) {
                                i12 = 1;
                                i13 = f11.totalMessagesCount - 1;
                            } else {
                                i12 = 1;
                                i13 = 0;
                            }
                            if (i13 > 0) {
                                Object[] objArr = new Object[i12];
                                objArr[0] = Integer.valueOf(i13);
                                G = org.telegram.messenger.bd.G(i13, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i12];
                                objArr2[0] = chat.title;
                                G = org.telegram.messenger.bd.a0(null, null, 2131744020, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = wmVar.f51453q8;
                            int i22 = this.V;
                            if (org.telegram.messenger.t3.T(chat)) {
                                if (chatFull != null && (i11 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i22 > 1) {
                                            G = a1.g.C(org.telegram.messenger.bd.G(i11, "Members", new Object[0]), ", ", org.telegram.messenger.bd.G(Math.min(i22, chatFull.participants_count), "OnlineCount", new Object[0]));
                                        } else {
                                            G = org.telegram.messenger.bd.G(i11, "Members", new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean C1 = org.telegram.messenger.g0.C1();
                                        int i23 = chatFull.participants_count;
                                        if (C1) {
                                            iArr[0] = i23;
                                            S = String.valueOf(i23);
                                        } else {
                                            S = org.telegram.messenger.bd.S(iArr, i23);
                                        }
                                        if (chat.megagroup) {
                                            G = org.telegram.messenger.bd.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        } else {
                                            G = org.telegram.messenger.bd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        }
                                    }
                                } else if (chat.megagroup) {
                                    if (chatFull == null) {
                                        G = org.telegram.messenger.bd.M0(2131748787, null).toLowerCase();
                                    } else if (chat.has_geo) {
                                        G = org.telegram.messenger.bd.M0(2131748650, null).toLowerCase();
                                    } else if (org.telegram.messenger.t3.t0(chat)) {
                                        G = org.telegram.messenger.bd.M0(2131748646, null).toLowerCase();
                                    } else {
                                        G = org.telegram.messenger.bd.M0(2131748649, null).toLowerCase();
                                    }
                                } else if (org.telegram.messenger.t3.t0(chat)) {
                                    G = org.telegram.messenger.bd.M0(2131752318, null).toLowerCase();
                                } else {
                                    G = org.telegram.messenger.bd.M0(2131752329, null).toLowerCase();
                                }
                            } else if (org.telegram.messenger.t3.k0(chat)) {
                                G = org.telegram.messenger.bd.M0(2131742839, null);
                            } else if (org.telegram.messenger.t3.l0(chat)) {
                                G = org.telegram.messenger.bd.M0(2131742845, null);
                            } else {
                                int i24 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i24 = chatParticipants.participants.size();
                                }
                                if (i22 > 1 && i24 != 0) {
                                    G = a1.g.C(org.telegram.messenger.bd.G(i24, "Members", new Object[0]), ", ", org.telegram.messenger.bd.G(i22, "OnlineCount", new Object[0]));
                                } else {
                                    G = org.telegram.messenger.bd.G(i24, "Members", new Object[0]);
                                }
                            }
                        } else {
                            if (j10 != null) {
                                TLRPC.User a22 = org.telegram.messenger.hp.s1(i19).a2(Long.valueOf(j10.f27150id));
                                if (a22 != null) {
                                    j10 = a22;
                                }
                                if (!org.telegram.messenger.l10.z(j10)) {
                                    long j12 = j10.f27150id;
                                    if (j12 != 489000) {
                                        if (j12 == org.telegram.messenger.h10.i(i19).e()) {
                                            charSequence = z14 ? org.telegram.messenger.g0.H2(org.telegram.messenger.bd.M0(2131745902, null), false) : org.telegram.messenger.bd.M0(2131752189, null);
                                        } else {
                                            long j13 = j10.f27150id;
                                            if (j13 == 333000 || j13 == 777000 || j13 == 42777) {
                                                z12 = false;
                                                charSequence = org.telegram.messenger.bd.M0(2131745571, null);
                                            } else if (org.telegram.messenger.hp.F2(j10)) {
                                                charSequence = org.telegram.messenger.bd.M0(2131744335, null);
                                            } else {
                                                boolean z15 = j10.bot;
                                                if (z15 && (i10 = j10.bot_active_users) != 0) {
                                                    charSequence = org.telegram.messenger.bd.H(',', "BotUsers", i10);
                                                } else if (z15) {
                                                    charSequence = org.telegram.messenger.l10.d(j10);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f35130f0) {
                                                        zArr = this.T;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    charSequence = org.telegram.messenger.bd.d0(i19, j10, zArr2, zArr);
                                                    z13 = zArr2[0];
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                z12 = false;
                            }
                            z13 = z12;
                        }
                        charSequence = G;
                    }
                    z13 = false;
                }
            }
            if (z13) {
                i17 = org.telegram.ui.ActionBar.k6.f28105pa;
            } else {
                i17 = org.telegram.ui.ActionBar.k6.B8;
            }
            this.f35123b0 = i17;
            if (this.f35121a0 == null) {
                if (kkVar != null) {
                    kkVar.k(charSequence);
                    Integer num = this.f35125c0;
                    if (num == null) {
                        org.telegram.ui.ActionBar.r6.Y(kkVar, this.f35123b0, e6Var);
                        kkVar.setTag(Integer.valueOf(this.f35123b0));
                    } else {
                        kkVar.setTextColor(num.intValue());
                    }
                } else {
                    h6Var.c(charSequence, z10, true);
                    Integer num2 = this.f35125c0;
                    if (num2 == null) {
                        org.telegram.ui.ActionBar.r6.Z(h6Var, this.f35123b0, e6Var);
                        h6Var.setTag(Integer.valueOf(this.f35123b0));
                    } else {
                        h6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.f35121a0 = charSequence;
            }
            org.telegram.ui.ActionBar.k kVar = this.A0;
            if (kVar != null) {
                kVar.h(z10);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar != null) {
            int i3 = this.K;
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.T1);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
            if (wmVar.f51325g4 == 3) {
                org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23234g3);
            }
            this.W = ConnectionsManager.getInstance(i3).getConnectionState();
            l();
        }
        e5 e5Var = this.f35131g0;
        if (e5Var != null) {
            e5Var.a();
        }
        e5 e5Var2 = this.f35132h0;
        if (e5Var2 != null) {
            e5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.wm wmVar = this.H;
        if (wmVar != null) {
            int i3 = this.K;
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.T1);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
            if (wmVar.f51325g4 == 3) {
                org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23234g3);
            }
        }
        e5 e5Var = this.f35131g0;
        if (e5Var != null) {
            e5Var.b();
        }
        e5 e5Var2 = this.f35132h0;
        if (e5Var2 != null) {
            e5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f35141q0 != null) {
            sb2.append(", ");
            sb2.append(this.f35141q0);
        }
        if (this.f35143r0 != null) {
            sb2.append(", ");
            sb2.append(this.f35143r0);
        }
        sb2.append("\n");
        org.telegram.ui.kk kkVar = this.f35142r;
        if (kkVar != null) {
            sb2.append(kkVar.getText());
        } else {
            h6 h6Var = this.f35144s;
            if (h6Var != null) {
                sb2.append(h6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.bd.M0(2131747794, null)));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        fn fnVar = this.f35127e;
        int measuredHeight = ((currentActionBarHeight - fnVar.getMeasuredHeight()) - 2) / 2;
        if (this.L) {
            i13 = org.telegram.messenger.g0.f22602m;
        } else {
            i13 = 0;
        }
        int i14 = measuredHeight + i13;
        if (this.m0) {
            f10 = 23.66f;
        } else {
            f10 = 24.0f;
        }
        int L = org.telegram.messenger.g0.L(f10) + i14;
        int i15 = this.M + 1;
        int i16 = i14 + 1;
        fnVar.layout(i15, i16, fnVar.getMeasuredWidth() + i15, fnVar.getMeasuredHeight() + i16);
        int i17 = this.M;
        if (fnVar.getVisibility() == 0) {
            if (this.m0) {
                f11 = 49.66f;
            } else {
                f11 = 55.0f;
            }
        } else if (this.m0) {
            f11 = 13.0f;
        } else {
            f11 = 1.0f;
        }
        int L2 = i17 + org.telegram.messenger.g0.L(f11) + this.N;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.f35137n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.kk kkVar = this.h;
        if (visibility != 8) {
            kkVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + i14) - kkVar.getPaddingTop(), kkVar.getMeasuredWidth() + L2, kkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (kkVar.getTextHeight() + i14)) - kkVar.getPaddingTop()));
            if (k5Var != null) {
                k5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + i14, k5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + k5Var.getTextHeight() + i14);
            }
        } else {
            kkVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + i14) - kkVar.getPaddingTop(), kkVar.getMeasuredWidth() + L2, kkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (kkVar.getTextHeight() + i14)) - kkVar.getPaddingTop()));
            if (k5Var != null) {
                k5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + i14, k5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + k5Var.getTextHeight() + i14);
            }
        }
        ImageView imageView = this.f35153y;
        if (imageView != null) {
            imageView.layout(org.telegram.messenger.g0.L(29.0f) + this.M, org.telegram.messenger.g0.L(27.33f) + i14, imageView.getMeasuredWidth() + org.telegram.messenger.g0.L(29.0f) + this.M, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(27.33f) + i14);
        }
        ImageView imageView2 = this.f35151x;
        if (imageView2 != null) {
            imageView2.layout(org.telegram.messenger.g0.L(19.333f) + this.M, i14 - org.telegram.messenger.g0.L(8.0f), imageView2.getMeasuredWidth() + org.telegram.messenger.g0.L(19.333f) + this.M, imageView2.getMeasuredHeight() + (i14 - org.telegram.messenger.g0.L(8.0f)));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.layout(org.telegram.messenger.g0.L(28.0f) + this.M, org.telegram.messenger.g0.L(24.0f) + i14, imageView3.getMeasuredWidth() + org.telegram.messenger.g0.L(28.0f) + this.M, imageView3.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f) + i14);
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.layout(org.telegram.messenger.g0.L(28.0f) + this.M, org.telegram.messenger.g0.L(24.0f) + i14, imageView4.getMeasuredWidth() + org.telegram.messenger.g0.L(28.0f) + this.M, imageView4.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f) + i14);
        }
        org.telegram.ui.kk kkVar2 = this.f35142r;
        if (kkVar2 != null) {
            kkVar2.layout(L2, L, kkVar2.getMeasuredWidth() + L2, kkVar2.getTextHeight() + L);
        } else {
            h6 h6Var = this.f35144s;
            if (h6Var != null) {
                h6Var.layout(L2, L, h6Var.getMeasuredWidth() + L2, h6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) this.f35149w.get();
        if (k5Var2 != null) {
            k5Var2.layout(L2, L, k5Var2.getMeasuredWidth() + L2, k5Var2.getTextHeight() + L);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i3);
        fn fnVar = this.f35127e;
        int i12 = 0;
        if (fnVar.getVisibility() == 0) {
            i11 = 54;
        } else {
            i11 = 0;
        }
        int L = size - org.telegram.messenger.g0.L(i11 + 16);
        float f12 = this.d;
        fnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.kk kkVar = this.h;
        kkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        h6 h6Var = this.f35144s;
        org.telegram.ui.kk kkVar2 = this.f35142r;
        if (kkVar2 != null) {
            kkVar2.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        } else if (h6Var != null) {
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f35153y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f35151x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i10));
        int i13 = this.P;
        AtomicReference atomicReference = this.f35137n;
        if (i13 != -1 && i13 != size && i13 > size) {
            this.Q = i13;
            View view = (org.telegram.ui.ActionBar.k5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            atomicReference.set(k5Var);
            int i14 = org.telegram.ui.ActionBar.k6.A8;
            org.telegram.ui.ActionBar.e6 e6Var = this.f35128e0;
            org.telegram.ui.ActionBar.r6.Y(k5Var, i14, e6Var);
            if (this.m0) {
                f10 = 17.5f;
            } else {
                f10 = 18.0f;
            }
            k5Var.setTextSizePx(org.telegram.messenger.g0.L(f10));
            k5Var.setGravity(3);
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            k5Var.i(kkVar.getRightDrawable());
            k5Var.j(kkVar.getRightDrawable2());
            k5Var.setRightDrawableOutside(kkVar.getRightDrawableOutside());
            k5Var.setLeftDrawable(kkVar.getLeftDrawable());
            k5Var.l(kkVar.getText(), false);
            ViewPropertyAnimator duration = k5Var.animate().alpha(0.0f).setDuration(350L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new cn(this, 0)).start();
            addView(k5Var);
            AtomicReference atomicReference2 = this.f35149w;
            View view2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(getContext());
            atomicReference2.set(k5Var2);
            int i15 = org.telegram.ui.ActionBar.k6.B8;
            org.telegram.ui.ActionBar.r6.Y(k5Var2, i15, e6Var);
            k5Var2.setTag(Integer.valueOf(i15));
            if (this.m0) {
                f11 = 13.5f;
            } else {
                f11 = 14.0f;
            }
            k5Var2.setTextSizePx(org.telegram.messenger.g0.L(f11));
            k5Var2.setGravity(3);
            if (kkVar2 != null) {
                k5Var2.l(kkVar2.getText(), false);
            } else if (h6Var != null) {
                k5Var2.l(h6Var.getText(), false);
            }
            k5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).withEndAction(new cn(this, 1)).start();
            addView(k5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.k5 k5Var3 = (org.telegram.ui.ActionBar.k5) atomicReference.get();
        if (k5Var3 != null) {
            int i16 = this.Q;
            if (fnVar.getVisibility() == 0) {
                i12 = 54;
            }
            k5Var3.measure(org.telegram.messenger.camera.q.c(i12 + 16, i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
        }
        this.P = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        gc gcVar = this.f35133i0;
        cn cnVar = this.f35134j0;
        if (action == 0 && a()) {
            this.f35135k0 = true;
            gcVar.c(true);
            org.telegram.messenger.g0.r(cnVar);
            org.telegram.messenger.g0.i3(cnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f35135k0) {
            gcVar.c(false);
            this.f35135k0 = false;
            if (isClickable()) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(cnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, this.f35128e0);
        if (this.f35150w0 == null || w02 != this.f35154y0) {
            this.f35154y0 = w02;
            this.f35150w0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.f35150w0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.A0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f10;
        u8 u8Var = this.J;
        u8Var.q(chat);
        fn fnVar = this.f35127e;
        if (fnVar != null) {
            fnVar.e(chat, u8Var);
            if (org.telegram.messenger.t3.c0(chat)) {
                if (chat != null && org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).P1().K(-chat.f27001id)) {
                    f10 = 11.0f;
                } else {
                    f10 = 16.0f;
                }
            } else {
                f10 = 21.0f;
            }
            fnVar.setRoundRadius(org.telegram.messenger.g0.L(f10));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i3;
        ImageView imageView = this.f35153y;
        if (imageView != null) {
            if (z10 && !this.f35129f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
    }

    public void setLeftPadding(int i3) {
        this.M = i3;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.L = z10;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.f35125c0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f35133i0.c(z10);
    }

    public void setRightAvatarPadding(int i3) {
        this.N = i3;
    }

    public void setStoriesForceState(Integer num) {
        this.f35124c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.f35121a0 == null) {
            org.telegram.ui.kk kkVar = this.f35142r;
            if (kkVar != null) {
                kkVar.k(charSequence);
            } else {
                h6 h6Var = this.f35144s;
                if (h6Var != null) {
                    h6Var.setText(charSequence);
                }
            }
        } else {
            this.f35121a0 = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override
    public final void updateColors() {
        nu0 nu0Var = this.O;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35128e0;
        if (nu0Var != null) {
            nu0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28105pa, e6Var));
        }
        Drawable drawable = this.f35145s0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        e5 e5Var = this.f35132h0;
        if (e5Var != null) {
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, e6Var)));
        }
        e5 e5Var2 = this.f35131g0;
        if (e5Var2 != null) {
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, e6Var)));
        }
        Drawable drawable2 = this.f35146t0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.f35147u0 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28093oi, e6Var);
            if (this.f35152x0 == null || w02 != this.f35155z0) {
                this.f35155z0 = w02;
                this.f35152x0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.f35147u0.setColorFilter(this.f35152x0);
        }
        org.telegram.ui.kk kkVar = this.h;
        if (kkVar != null) {
            try {
                if (kkVar.getRightDrawable2() instanceof kk0) {
                    ((kk0) kkVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, e6Var));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void f() {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
