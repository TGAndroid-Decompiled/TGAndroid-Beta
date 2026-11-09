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
public class kn extends FrameLayout implements te.b, org.telegram.messenger.ls, org.telegram.ui.ActionBar.b6 {
    public final ImageView D;
    public final ImageView E;
    public final b01 F;
    public final org.telegram.ui.cn G;
    public final qu0[] H;
    public final w8 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public qu0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final te.a f35399a;
    public int f35400a0;
    public boolean f35401b;
    public Integer f35402b0;
    public Integer f35403c;
    public final rs0 f35404c0;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 f35405d0;
    public final gn f35406e;
    public boolean f35407e0;
    public final boolean f35408f;
    public final g5 f35409f0;
    public final g5 f35410g0;
    public final org.telegram.ui.qk h;
    public final ic f35411h0;
    public final dn f35412i0;
    public boolean f35413j0;
    public boolean f35414k0;
    public boolean f35415l0;
    public boolean m0;
    public final AtomicReference f35416n;
    public boolean f35417n0;
    public boolean f35418o0;
    public String f35419p0;
    public String f35420q0;
    public final org.telegram.ui.qk f35421r;
    public Drawable f35422r0;
    public final j6 f35423s;
    public Drawable f35424s0;
    public Drawable f35425t0;
    public boolean f35426u0;
    public PorterDuffColorFilter f35427v0;
    public final AtomicReference f35428w;
    public PorterDuffColorFilter f35429w0;
    public final ImageView f35430x;
    public int f35431x0;
    public final ImageView f35432y;
    public int f35433y0;
    public org.telegram.ui.ActionBar.k f35434z0;

    public kn(android.content.Context r22, org.telegram.ui.ActionBar.f2 r23, boolean r24, org.telegram.ui.ActionBar.g6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kn.<init>(android.content.Context, org.telegram.ui.ActionBar.f2, boolean, org.telegram.ui.ActionBar.g6):void");
    }

    private void setTypingAnimation(boolean z9) {
        org.telegram.ui.cn cnVar = this.G;
        org.telegram.ui.qk qkVar = this.f35421r;
        if (qkVar != null) {
            int i7 = 0;
            qu0[] qu0VarArr = this.H;
            if (z9) {
                try {
                    int intValue = org.telegram.messenger.qp.s1(this.J).E1(cnVar.a(), cnVar.f44602r4).intValue();
                    qu0 qu0Var = qu0VarArr[intValue];
                    if (qu0Var != null) {
                        org.telegram.ui.ActionBar.g6 g6Var = this.f35405d0;
                        if (intValue == 5) {
                            qkVar.g(qu0Var, "**oo**");
                            qu0VarArr[intValue].b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28089pa, g6Var));
                            qkVar.setLeftDrawable((Drawable) null);
                        } else {
                            qkVar.g(null, null);
                            qu0VarArr[intValue].b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28089pa, g6Var));
                            qkVar.setLeftDrawable(qu0VarArr[intValue]);
                        }
                        this.N = qu0VarArr[intValue];
                        while (i7 < qu0VarArr.length) {
                            qu0 qu0Var2 = qu0VarArr[i7];
                            if (qu0Var2 != null) {
                                if (i7 == intValue) {
                                    qu0Var2.d();
                                } else {
                                    qu0Var2.e();
                                }
                            }
                            i7++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            this.N = null;
            qkVar.setLeftDrawable((Drawable) null);
            qkVar.g(null, null);
            while (i7 < qu0VarArr.length) {
                qu0 qu0Var3 = qu0VarArr[i7];
                if (qu0Var3 != null) {
                    qu0Var3.e();
                }
                i7++;
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        ImageView imageView;
        int i10;
        if (i7 == 0 && (imageView = this.f35430x) != null) {
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
        int i7;
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar != null) {
            TLRPC.User j3 = cnVar.j();
            TLRPC.Chat chat = cnVar.f44432e;
            if (cnVar.f44451f4 == 3) {
                long d92 = cnVar.d9();
                if (d92 >= 0) {
                    user = cnVar.getMessagesController().a2(Long.valueOf(d92));
                    chat = null;
                } else {
                    chat = cnVar.getMessagesController().M0(Long.valueOf(-d92));
                    user = null;
                }
            } else {
                user = j3;
            }
            w8 w8Var = this.I;
            gn gnVar = this.f35406e;
            if (user != null) {
                w8Var.r(user);
                if (org.telegram.messenger.t10.z(user)) {
                    w8Var.f39982p = 0.8f;
                    w8Var.g(12);
                    if (gnVar != null) {
                        gnVar.setAnimatedEmojiDrawable(null);
                        gnVar.j(null, null, w8Var, user);
                    }
                } else if (org.telegram.messenger.t10.s(user)) {
                    w8Var.f39982p = 0.8f;
                    w8Var.g(21);
                    if (gnVar != null) {
                        gnVar.setAnimatedEmojiDrawable(null);
                        gnVar.j(null, null, w8Var, user);
                    }
                } else if (org.telegram.messenger.t10.B(user) && cnVar.f44451f4 == 3) {
                    w8Var.f39982p = 0.8f;
                    w8Var.g(22);
                    if (gnVar != null) {
                        gnVar.setAnimatedEmojiDrawable(null);
                        gnVar.j(null, null, w8Var, user);
                    }
                } else if (org.telegram.messenger.t10.B(user)) {
                    w8Var.f39982p = 0.8f;
                    w8Var.g(1);
                    if (gnVar != null) {
                        gnVar.setAnimatedEmojiDrawable(null);
                        gnVar.j(null, null, w8Var, user);
                    }
                } else {
                    w8Var.f39982p = 1.0f;
                    if (gnVar != null) {
                        gnVar.setAnimatedEmojiDrawable(null);
                        gnVar.f35647a.j0(user, w8Var, null, true, 3, false);
                    }
                }
            } else if (org.telegram.messenger.t3.p0(chat)) {
                long b10 = cnVar.b();
                int i10 = this.J;
                if (org.telegram.messenger.t3.A(i10, chat, 24) && b10 != 0) {
                    if (i7 > 0) {
                        TLRPC.User a22 = cnVar.getMessagesController().a2(Long.valueOf(b10));
                        w8Var.r(a22);
                        gnVar.setAnimatedEmojiDrawable(null);
                        gnVar.e(a22, w8Var);
                    } else {
                        TLRPC.Chat M0 = cnVar.getMessagesController().M0(Long.valueOf(-b10));
                        w8Var.q(M0);
                        gnVar.setAnimatedEmojiDrawable(null);
                        gnVar.e(M0, w8Var);
                    }
                } else {
                    gnVar.setAnimatedEmojiDrawable(null);
                    qg.d.o(i10, chat, w8Var, gnVar);
                }
                gnVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            } else if (chat != null) {
                w8Var.f39982p = 1.0f;
                w8Var.q(chat);
                if (gnVar != null) {
                    gnVar.setAnimatedEmojiDrawable(null);
                    gnVar.e(chat, w8Var);
                    if (chat.forum) {
                        if (org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).P1().K(-chat.f26956id)) {
                            f10 = 11.0f;
                        } else {
                            f10 = 16.0f;
                        }
                        L = org.telegram.messenger.g0.L(f10);
                    } else {
                        L = org.telegram.messenger.g0.L(21.0f);
                    }
                    gnVar.setRoundRadius(L);
                }
            }
        }
    }

    public final g5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        g5 g5Var = this.f35410g0;
        g5Var.j(j3, false);
        g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, this.f35405d0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        g5Var.I = 0;
        g5Var.J = L;
        return g5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T1) {
            int connectionState = ConnectionsManager.getInstance(this.J).getConnectionState();
            if (this.V != connectionState) {
                this.V = connectionState;
                l();
            }
        } else if (i7 == org.telegram.messenger.qs.f25018i4) {
            org.telegram.ui.qk qkVar = this.h;
            if (qkVar != null) {
                qkVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i7 == org.telegram.messenger.qs.f25005g3) {
            n(true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f35411h0.a(0.02f);
        canvas.scale(a10, a10, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f35414k0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        if (view == this.f35406e) {
            boolean z10 = false;
            ImageView imageView = this.f35430x;
            if (imageView != null && imageView.getVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ImageView imageView2 = this.f35432y;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z10 = true;
            }
            if (z9 || z10) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (z9) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.l6.Cm);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.l6.Cm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kn.e(boolean, boolean):void");
    }

    public final void g(int i7, boolean z9) {
        b01 b01Var = this.F;
        if (b01Var != null) {
            boolean z10 = this.m0;
            if (i7 == 0 && !this.T) {
                return;
            }
            te.a aVar = this.f35399a;
            if (!z10) {
                aVar.a(true, z9);
                b01Var.b(i7);
                return;
            }
            aVar.a(false, z9);
        }
    }

    public l9 getAvatarImageView() {
        return this.f35406e;
    }

    public int getLastSubtitleColorKey() {
        return this.f35400a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public rs0 getSharedMediaPreloader() {
        return this.f35404c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.qk qkVar = this.f35421r;
        if (qkVar != null) {
            return qkVar.getTextPaint();
        }
        return this.f35423s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.qk qkVar = this.f35421r;
        if (qkVar != null) {
            return qkVar;
        }
        j6 j6Var = this.f35423s;
        if (j6Var != null) {
            return j6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f35430x;
    }

    public org.telegram.ui.ActionBar.l5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int L;
        float f10 = 0.0f;
        org.telegram.ui.qk qkVar = this.h;
        if (qkVar != null) {
            f10 = Math.max(0.0f, qkVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.qk qkVar2 = this.f35421r;
        if (qkVar2 != null) {
            f10 = Math.max(f10, qkVar2.getExactWidthIncludeDrawables());
        }
        gn gnVar = this.f35406e;
        if (gnVar != null && gnVar.getVisibility() == 0) {
            L = org.telegram.messenger.g0.L(70.0f);
        } else {
            L = org.telegram.messenger.g0.L(34.0f);
        }
        return (int) (f10 + L);
    }

    public final void h(CharSequence charSequence, boolean z9, boolean z10, boolean z11, boolean z12, TLRPC.EmojiStatus emojiStatus, boolean z13) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.i6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.f35418o0 = false;
        if (!z9 && !z10) {
            if (z11) {
                Drawable mutate = getResources().getDrawable(2131232791).mutate();
                this.f35424s0 = mutate;
                int i7 = org.telegram.ui.ActionBar.l6.f28058ni;
                org.telegram.ui.ActionBar.g6 g6Var = this.f35405d0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.s6.x(this, mutate, i7, g6Var, mode);
                Drawable mutate2 = getResources().getDrawable(2131232792).mutate();
                this.f35425t0 = mutate2;
                org.telegram.ui.ActionBar.s6.x(this, mutate2, org.telegram.ui.ActionBar.l6.f28077oi, this.f35405d0, mode);
                this.h.j(new xp(this.f35424s0, this.f35425t0));
                this.f35417n0 = true;
                this.f35420q0 = org.telegram.messenger.id.M0(2131754739, null);
            } else if (this.h.getRightDrawable() instanceof hk0) {
                this.h.j(null);
                this.f35417n0 = false;
                this.f35420q0 = null;
            }
        } else {
            this.f35418o0 = true;
            if (!(this.h.getRightDrawable() instanceof hk0)) {
                hk0 hk0Var = new hk0(!z9 ? 1 : 0);
                hk0Var.b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, this.f35405d0));
                this.h.j(hk0Var);
                this.f35420q0 = org.telegram.messenger.id.M0(2131745862, null);
                this.f35417n0 = true;
            }
        }
        if (!z12 && org.telegram.messenger.m5.f(emojiStatus) == 0) {
            this.h.i(null);
            this.f35419p0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof h5) && (((h5) this.h.getRightDrawable()).f34205a instanceof i5)) {
                ((i5) ((h5) this.h.getRightDrawable()).f34205a).n(this.h);
            }
            if (org.telegram.messenger.m5.f(emojiStatus) != 0) {
                this.f35409f0.j(org.telegram.messenger.m5.f(emojiStatus), z13);
            } else if (z12) {
                Drawable mutate3 = org.telegram.messenger.t0.f25566b.getDrawable(2131232307).mutate();
                this.f35422r0 = mutate3;
                org.telegram.ui.ActionBar.s6.x(this, mutate3, org.telegram.ui.ActionBar.l6.f28058ni, this.f35405d0, PorterDuff.Mode.MULTIPLY);
                this.f35409f0.g(this.f35422r0, z13);
            } else {
                this.f35409f0.g(null, z13);
            }
            this.f35409f0.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, this.f35405d0)));
            this.h.i(this.f35409f0);
            this.f35417n0 = false;
            this.f35419p0 = org.telegram.messenger.id.M0(2131754802, null);
        }
        org.telegram.ui.ActionBar.k kVar = this.f35434z0;
        if (kVar != null) {
            kVar.i(z13);
        }
    }

    public final void i(int i7, int i10) {
        org.telegram.ui.qk qkVar = this.h;
        org.telegram.ui.ActionBar.s6.q(qkVar);
        org.telegram.ui.qk qkVar2 = this.f35421r;
        org.telegram.ui.ActionBar.s6.q(qkVar2);
        qkVar.setTextColor(i7);
        qkVar2.setTextColor(i10);
        qkVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.qk qkVar = this.h;
        qkVar.setLeftDrawable(drawable);
        if (!this.f35417n0 && !this.f35418o0) {
            if (drawable2 != null) {
                this.f35420q0 = org.telegram.messenger.id.M0(2131747901, null);
            } else {
                this.f35420q0 = null;
            }
            qkVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.f35434z0;
        if (kVar != null) {
            kVar.i(true);
        }
    }

    public final void k(TLRPC.User user, boolean z9) {
        w8 w8Var = this.I;
        w8Var.r(user);
        boolean z10 = org.telegram.messenger.t10.z(user);
        gn gnVar = this.f35406e;
        if (z10) {
            w8Var.g(12);
            w8Var.f39982p = 0.8f;
            if (gnVar != null) {
                gnVar.j(null, null, w8Var, user);
            }
        } else if (org.telegram.messenger.t10.s(user)) {
            w8Var.g(21);
            w8Var.f39982p = 0.8f;
            if (gnVar != null) {
                gnVar.j(null, null, w8Var, user);
            }
        } else if (org.telegram.messenger.t10.B(user) && !z9) {
            w8Var.g(1);
            w8Var.f39982p = 0.8f;
            if (gnVar != null) {
                gnVar.j(null, null, w8Var, user);
            }
        } else {
            w8Var.f39982p = 1.0f;
            if (gnVar != null) {
                gnVar.e(user, w8Var);
            }
        }
    }

    public final void l() {
        String str;
        int i7 = this.V;
        if (i7 == 2) {
            str = org.telegram.messenger.id.M0(2131743212, null);
        } else if (i7 == 1) {
            str = org.telegram.messenger.id.M0(2131751809, null);
        } else if (i7 == 5) {
            str = org.telegram.messenger.id.M0(2131743810, null);
        } else if (i7 == 4) {
            str = org.telegram.messenger.id.M0(2131751807, null);
        } else {
            str = null;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f35405d0;
        j6 j6Var = this.f35423s;
        org.telegram.ui.qk qkVar = this.f35421r;
        if (str == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (qkVar != null) {
                    qkVar.k(charSequence);
                    this.W = null;
                    Integer num = this.f35402b0;
                    if (num != null) {
                        qkVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.f35400a0;
                        if (i10 >= 0) {
                            org.telegram.ui.ActionBar.s6.X(qkVar, i10, g6Var);
                            qkVar.setTag(Integer.valueOf(this.f35400a0));
                        }
                    }
                } else if (j6Var != null) {
                    j6Var.c(charSequence, !org.telegram.messenger.id.f23157a0, true);
                    this.W = null;
                    Integer num2 = this.f35402b0;
                    if (num2 != null) {
                        j6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.f35400a0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.s6.Y(j6Var, i11, g6Var);
                            j6Var.setTag(Integer.valueOf(this.f35400a0));
                        }
                    }
                }
            }
        } else if (qkVar != null) {
            if (this.W == null) {
                this.W = qkVar.getText();
            }
            qkVar.k(str);
            Integer num3 = this.f35402b0;
            if (num3 != null) {
                qkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.l6.B8;
                org.telegram.ui.ActionBar.s6.X(qkVar, i12, g6Var);
                qkVar.setTag(Integer.valueOf(i12));
            }
        } else if (j6Var != null) {
            if (this.W == null) {
                this.W = j6Var.getText();
            }
            j6Var.c(str, !org.telegram.messenger.id.f23157a0, true);
            Integer num4 = this.f35402b0;
            if (num4 != null) {
                j6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.l6.B8;
                org.telegram.ui.ActionBar.s6.Y(j6Var, i13, g6Var);
                j6Var.setTag(Integer.valueOf(i13));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f35434z0;
        if (kVar != null) {
            kVar.i(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z9;
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar != null) {
            this.U = 0;
            TLRPC.ChatFull chatFull = cnVar.f44579p8;
            if (chatFull != null) {
                int i7 = this.J;
                int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z9 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (z9 && chatFull.participants_count > 200) {
                        this.U = chatFull.online_count;
                        return;
                    }
                    return;
                }
                for (int i10 = 0; i10 < chatFull.participants.participants.size(); i10++) {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
                    if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.f27105id == org.telegram.messenger.p10.i(i7).e()) && a22.status.expires > 10000)) {
                        this.U++;
                    }
                }
            }
        }
    }

    public final void n(boolean z9) {
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f35405d0;
        boolean[] zArr2 = this.R;
        j6 j6Var = this.f35423s;
        org.telegram.ui.qk qkVar = this.f35421r;
        org.telegram.ui.qk qkVar2 = this.h;
        int i19 = this.J;
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar != null) {
            if (cnVar.f44451f4 == 6) {
                String str = cnVar.f44423d4.link;
                kg.y[] yVarArr = kg.y.f17583e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User j3 = cnVar.j();
            TLRPC.Chat chat = cnVar.f44432e;
            if (org.telegram.messenger.t10.B(j3) && cnVar.f44451f4 == 0 && cnVar.getMessagesController().G1().c() >= 3 && (this.f35426u0 || org.telegram.messenger.qp.e1().getInt("savedmsgschatshint", 0) < 3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((org.telegram.messenger.t10.B(j3) && !z10) || org.telegram.messenger.t10.z(j3) || ((j3 != null && j3.f27105id == 489000) || ((i7 = cnVar.f44451f4) != 0 && i7 != 8))) && cnVar.f44451f4 != 3) {
                if (getSubtitleTextView().getVisibility() != 8) {
                    getSubtitleTextView().setVisibility(8);
                    return;
                }
                return;
            }
            if (z10) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    i18 = 0;
                    getSubtitleTextView().setVisibility(0);
                } else {
                    i18 = 0;
                }
                if (!this.f35426u0) {
                    org.telegram.messenger.qp.e1().edit().putInt("savedmsgschatshint", org.telegram.messenger.qp.e1().getInt("savedmsgschatshint", i18) + 1).apply();
                    this.f35426u0 = true;
                }
            }
            CharSequence D1 = org.telegram.messenger.qp.s1(i19).D1(cnVar.a(), cnVar.f44602r4, false);
            CharSequence charSequence = "";
            if (D1 != null) {
                D1 = TextUtils.replace(D1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z13 = z10;
            if (D1 != null && D1.length() != 0 && (!org.telegram.messenger.t3.T(chat) || chat.megagroup)) {
                if (cnVar.ea() && qkVar2.getTag() != null) {
                    qkVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.Q;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.Q = null;
                    }
                    if (z9) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.Q = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(qkVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.Q.addListener(new jn(this, 1));
                        this.Q.setDuration(180L);
                        this.Q.start();
                    } else {
                        qkVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer E1 = org.telegram.messenger.qp.s1(i19).E1(cnVar.a(), cnVar.f44602r4);
                if (E1 != null && E1.intValue() == 5) {
                    charSequence = org.telegram.messenger.i6.m(D1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = D1;
                }
                setTypingAnimation(true);
                z12 = true;
            } else if (cnVar.ea() && !cnVar.f44652v4) {
                if (qkVar2.getTag() == null) {
                    qkVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.Q;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.Q = null;
                    }
                    if (z9) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.Q = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(qkVar2, property2, org.telegram.messenger.g0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.Q.addListener(new jn(this, 0));
                        this.Q.setDuration(180L);
                        this.Q.start();
                        return;
                    }
                    qkVar2.setTranslationY(org.telegram.messenger.g0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = cnVar.f44451f4;
                if (i20 == 8) {
                    if (cnVar.f44477h4) {
                        charSequence = org.telegram.messenger.id.M0(2131752219, null);
                        z12 = false;
                    } else {
                        if (cnVar.b() == 0) {
                            org.telegram.messenger.k00 k00Var = cnVar.getMessagesController().f24877q7;
                            long j10 = -cnVar.a();
                            if (k00Var.e(j10) && (l10 = k00Var.l(j10)) != null) {
                                i16 = l10.size();
                            } else {
                                i16 = 0;
                            }
                            if (i16 > 0) {
                                G = org.telegram.messenger.id.H(',', "Chats", i16);
                            } else {
                                G = org.telegram.messenger.id.M0(2131752219, null);
                            }
                        } else {
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.qp.s1(i19).f24877q7.f(chat.f26956id, cnVar.b());
                            if (f10 != null) {
                                i15 = f10.totalMessagesCount;
                            } else {
                                i15 = 0;
                            }
                            if (i15 > 0) {
                                G = org.telegram.messenger.id.G(i15, "messages", Integer.valueOf(i15));
                            } else {
                                G = org.telegram.messenger.id.a0(null, null, 2131744010, qg.d.i(i19, chat, false));
                            }
                        }
                        charSequence = G;
                        z12 = false;
                    }
                } else {
                    if (i20 == 3) {
                        org.telegram.messenger.vv G1 = cnVar.getMessagesController().G1();
                        long d92 = cnVar.d9();
                        ArrayList arrayList = G1.f26218j;
                        int i21 = 0;
                        while (true) {
                            if (i21 < arrayList.size()) {
                                org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i21);
                                if (uvVar.f25896a == d92) {
                                    i14 = uvVar.f25899e;
                                    break;
                                }
                                i21++;
                            } else {
                                i14 = 0;
                                break;
                            }
                        }
                        charSequence = org.telegram.messenger.id.G(Math.max(1, i14), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (cnVar.f44652v4 && chat != null) {
                            TLRPC.TL_forumTopic f11 = org.telegram.messenger.qp.s1(i19).f24877q7.f(chat.f26956id, cnVar.b());
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
                                G = org.telegram.messenger.id.G(i13, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i12];
                                objArr2[0] = chat.title;
                                G = org.telegram.messenger.id.a0(null, null, 2131744010, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = cnVar.f44579p8;
                            int i22 = this.U;
                            if (org.telegram.messenger.t3.T(chat)) {
                                if (chatFull != null && (i11 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i22 > 1) {
                                            G = a8.p0.D(org.telegram.messenger.id.G(i11, "Members", new Object[0]), ", ", org.telegram.messenger.id.G(Math.min(i22, chatFull.participants_count), "OnlineCount", new Object[0]));
                                        } else {
                                            G = org.telegram.messenger.id.G(i11, "Members", new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean C1 = org.telegram.messenger.g0.C1();
                                        int i23 = chatFull.participants_count;
                                        if (C1) {
                                            iArr[0] = i23;
                                            S = String.valueOf(i23);
                                        } else {
                                            S = org.telegram.messenger.id.S(iArr, i23);
                                        }
                                        if (chat.megagroup) {
                                            G = org.telegram.messenger.id.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        } else {
                                            G = org.telegram.messenger.id.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        }
                                    }
                                } else if (chat.megagroup) {
                                    if (chatFull == null) {
                                        G = org.telegram.messenger.id.M0(2131748779, null).toLowerCase();
                                    } else if (chat.has_geo) {
                                        G = org.telegram.messenger.id.M0(2131748642, null).toLowerCase();
                                    } else if (org.telegram.messenger.t3.t0(chat)) {
                                        G = org.telegram.messenger.id.M0(2131748638, null).toLowerCase();
                                    } else {
                                        G = org.telegram.messenger.id.M0(2131748641, null).toLowerCase();
                                    }
                                } else if (org.telegram.messenger.t3.t0(chat)) {
                                    G = org.telegram.messenger.id.M0(2131752318, null).toLowerCase();
                                } else {
                                    G = org.telegram.messenger.id.M0(2131752329, null).toLowerCase();
                                }
                            } else if (org.telegram.messenger.t3.k0(chat)) {
                                G = org.telegram.messenger.id.M0(2131742829, null);
                            } else if (org.telegram.messenger.t3.l0(chat)) {
                                G = org.telegram.messenger.id.M0(2131742835, null);
                            } else {
                                int i24 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i24 = chatParticipants.participants.size();
                                }
                                if (i22 > 1 && i24 != 0) {
                                    G = a8.p0.D(org.telegram.messenger.id.G(i24, "Members", new Object[0]), ", ", org.telegram.messenger.id.G(i22, "OnlineCount", new Object[0]));
                                } else {
                                    G = org.telegram.messenger.id.G(i24, "Members", new Object[0]);
                                }
                            }
                        } else {
                            if (j3 != null) {
                                TLRPC.User a22 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(j3.f27105id));
                                if (a22 != null) {
                                    j3 = a22;
                                }
                                if (!org.telegram.messenger.t10.z(j3)) {
                                    long j11 = j3.f27105id;
                                    if (j11 != 489000) {
                                        if (j11 == org.telegram.messenger.p10.i(i19).e()) {
                                            charSequence = z13 ? org.telegram.messenger.g0.H2(org.telegram.messenger.id.M0(2131745892, null), false) : org.telegram.messenger.id.M0(2131752189, null);
                                        } else {
                                            long j12 = j3.f27105id;
                                            if (j12 == 333000 || j12 == 777000 || j12 == 42777) {
                                                z11 = false;
                                                charSequence = org.telegram.messenger.id.M0(2131745561, null);
                                            } else if (org.telegram.messenger.qp.F2(j3)) {
                                                charSequence = org.telegram.messenger.id.M0(2131744325, null);
                                            } else {
                                                boolean z14 = j3.bot;
                                                if (z14 && (i10 = j3.bot_active_users) != 0) {
                                                    charSequence = org.telegram.messenger.id.H(',', "BotUsers", i10);
                                                } else if (z14) {
                                                    charSequence = org.telegram.messenger.t10.d(j3);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f35407e0) {
                                                        zArr = this.S;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    charSequence = org.telegram.messenger.id.d0(i19, j3, zArr2, zArr);
                                                    z12 = zArr2[0];
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        charSequence = G;
                    }
                    z12 = false;
                }
            }
            if (z12) {
                i17 = org.telegram.ui.ActionBar.l6.f28089pa;
            } else {
                i17 = org.telegram.ui.ActionBar.l6.B8;
            }
            this.f35400a0 = i17;
            if (this.W == null) {
                if (qkVar != null) {
                    qkVar.k(charSequence);
                    Integer num = this.f35402b0;
                    if (num == null) {
                        org.telegram.ui.ActionBar.s6.X(qkVar, this.f35400a0, g6Var);
                        qkVar.setTag(Integer.valueOf(this.f35400a0));
                    } else {
                        qkVar.setTextColor(num.intValue());
                    }
                } else {
                    j6Var.c(charSequence, z9, true);
                    Integer num2 = this.f35402b0;
                    if (num2 == null) {
                        org.telegram.ui.ActionBar.s6.Y(j6Var, this.f35400a0, g6Var);
                        j6Var.setTag(Integer.valueOf(this.f35400a0));
                    } else {
                        j6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.W = charSequence;
            }
            org.telegram.ui.ActionBar.k kVar = this.f35434z0;
            if (kVar != null) {
                kVar.i(z9);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar != null) {
            int i7 = this.J;
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.T1);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
            if (cnVar.f44451f4 == 3) {
                org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25005g3);
            }
            this.V = ConnectionsManager.getInstance(i7).getConnectionState();
            l();
        }
        g5 g5Var = this.f35409f0;
        if (g5Var != null) {
            g5Var.a();
        }
        g5 g5Var2 = this.f35410g0;
        if (g5Var2 != null) {
            g5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.cn cnVar = this.G;
        if (cnVar != null) {
            int i7 = this.J;
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T1);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
            if (cnVar.f44451f4 == 3) {
                org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25005g3);
            }
        }
        g5 g5Var = this.f35409f0;
        if (g5Var != null) {
            g5Var.b();
        }
        g5 g5Var2 = this.f35410g0;
        if (g5Var2 != null) {
            g5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f35419p0 != null) {
            sb2.append(", ");
            sb2.append(this.f35419p0);
        }
        if (this.f35420q0 != null) {
            sb2.append(", ");
            sb2.append(this.f35420q0);
        }
        sb2.append("\n");
        org.telegram.ui.qk qkVar = this.f35421r;
        if (qkVar != null) {
            sb2.append(qkVar.getText());
        } else {
            j6 j6Var = this.f35423s;
            if (j6Var != null) {
                sb2.append(j6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.id.M0(2131747786, null)));
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        gn gnVar = this.f35406e;
        int measuredHeight = ((currentActionBarHeight - gnVar.getMeasuredHeight()) - 2) / 2;
        if (this.K) {
            i13 = org.telegram.messenger.g0.f22557m;
        } else {
            i13 = 0;
        }
        int i14 = measuredHeight + i13;
        if (this.f35415l0) {
            f10 = 23.66f;
        } else {
            f10 = 24.0f;
        }
        int L = org.telegram.messenger.g0.L(f10) + i14;
        int i15 = this.L + 1;
        int i16 = i14 + 1;
        gnVar.layout(i15, i16, gnVar.getMeasuredWidth() + i15, gnVar.getMeasuredHeight() + i16);
        int i17 = this.L;
        if (gnVar.getVisibility() == 0) {
            if (this.f35415l0) {
                f11 = 49.66f;
            } else {
                f11 = 55.0f;
            }
        } else if (this.f35415l0) {
            f11 = 13.0f;
        } else {
            f11 = 1.0f;
        }
        int L2 = i17 + org.telegram.messenger.g0.L(f11) + this.M;
        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f35416n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.qk qkVar = this.h;
        if (visibility != 8) {
            qkVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + i14) - qkVar.getPaddingTop(), qkVar.getMeasuredWidth() + L2, qkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (qkVar.getTextHeight() + i14)) - qkVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + i14, l5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + l5Var.getTextHeight() + i14);
            }
        } else {
            qkVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + i14) - qkVar.getPaddingTop(), qkVar.getMeasuredWidth() + L2, qkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (qkVar.getTextHeight() + i14)) - qkVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + i14, l5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + l5Var.getTextHeight() + i14);
            }
        }
        ImageView imageView = this.f35432y;
        if (imageView != null) {
            imageView.layout(org.telegram.messenger.g0.L(29.0f) + this.L, org.telegram.messenger.g0.L(27.33f) + i14, imageView.getMeasuredWidth() + org.telegram.messenger.g0.L(29.0f) + this.L, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(27.33f) + i14);
        }
        ImageView imageView2 = this.f35430x;
        if (imageView2 != null) {
            imageView2.layout(org.telegram.messenger.g0.L(19.333f) + this.L, i14 - org.telegram.messenger.g0.L(8.0f), imageView2.getMeasuredWidth() + org.telegram.messenger.g0.L(19.333f) + this.L, imageView2.getMeasuredHeight() + (i14 - org.telegram.messenger.g0.L(8.0f)));
        }
        ImageView imageView3 = this.D;
        if (imageView3 != null) {
            imageView3.layout(org.telegram.messenger.g0.L(28.0f) + this.L, org.telegram.messenger.g0.L(24.0f) + i14, imageView3.getMeasuredWidth() + org.telegram.messenger.g0.L(28.0f) + this.L, imageView3.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f) + i14);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(org.telegram.messenger.g0.L(28.0f) + this.L, org.telegram.messenger.g0.L(24.0f) + i14, imageView4.getMeasuredWidth() + org.telegram.messenger.g0.L(28.0f) + this.L, imageView4.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f) + i14);
        }
        org.telegram.ui.qk qkVar2 = this.f35421r;
        if (qkVar2 != null) {
            qkVar2.layout(L2, L, qkVar2.getMeasuredWidth() + L2, qkVar2.getTextHeight() + L);
        } else {
            j6 j6Var = this.f35423s;
            if (j6Var != null) {
                j6Var.layout(L2, L, j6Var.getMeasuredWidth() + L2, j6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) this.f35428w.get();
        if (l5Var2 != null) {
            l5Var2.layout(L2, L, l5Var2.getMeasuredWidth() + L2, l5Var2.getTextHeight() + L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i7);
        gn gnVar = this.f35406e;
        int i12 = 0;
        if (gnVar.getVisibility() == 0) {
            i11 = 54;
        } else {
            i11 = 0;
        }
        int L = size - org.telegram.messenger.g0.L(i11 + 16);
        float f12 = this.d;
        gnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.qk qkVar = this.h;
        qkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        j6 j6Var = this.f35423s;
        org.telegram.ui.qk qkVar2 = this.f35421r;
        if (qkVar2 != null) {
            qkVar2.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        } else if (j6Var != null) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f35432y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f35430x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(34.0f), 1073741824));
        }
        ImageView imageView3 = this.D;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i10));
        int i13 = this.O;
        AtomicReference atomicReference = this.f35416n;
        if (i13 != -1 && i13 != size && i13 > size) {
            this.P = i13;
            View view = (org.telegram.ui.ActionBar.l5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference.set(l5Var);
            int i14 = org.telegram.ui.ActionBar.l6.A8;
            org.telegram.ui.ActionBar.g6 g6Var = this.f35405d0;
            org.telegram.ui.ActionBar.s6.X(l5Var, i14, g6Var);
            if (this.f35415l0) {
                f10 = 17.5f;
            } else {
                f10 = 18.0f;
            }
            l5Var.setTextSizePx(org.telegram.messenger.g0.L(f10));
            l5Var.setGravity(3);
            l5Var.setTypeface(org.telegram.messenger.g0.o());
            l5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            l5Var.i(qkVar.getRightDrawable());
            l5Var.j(qkVar.getRightDrawable2());
            l5Var.setRightDrawableOutside(qkVar.getRightDrawableOutside());
            l5Var.setLeftDrawable(qkVar.getLeftDrawable());
            l5Var.l(qkVar.getText(), false);
            ViewPropertyAnimator duration = l5Var.animate().alpha(0.0f).setDuration(350L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new dn(this, 0)).start();
            addView(l5Var);
            AtomicReference atomicReference2 = this.f35428w;
            View view2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference2.set(l5Var2);
            int i15 = org.telegram.ui.ActionBar.l6.B8;
            org.telegram.ui.ActionBar.s6.X(l5Var2, i15, g6Var);
            l5Var2.setTag(Integer.valueOf(i15));
            if (this.f35415l0) {
                f11 = 13.5f;
            } else {
                f11 = 14.0f;
            }
            l5Var2.setTextSizePx(org.telegram.messenger.g0.L(f11));
            l5Var2.setGravity(3);
            if (qkVar2 != null) {
                l5Var2.l(qkVar2.getText(), false);
            } else if (j6Var != null) {
                l5Var2.l(j6Var.getText(), false);
            }
            l5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).withEndAction(new dn(this, 1)).start();
            addView(l5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.l5 l5Var3 = (org.telegram.ui.ActionBar.l5) atomicReference.get();
        if (l5Var3 != null) {
            int i16 = this.P;
            if (gnVar.getVisibility() == 0) {
                i12 = 54;
            }
            l5Var3.measure(org.telegram.messenger.camera.q.c(i12 + 16, i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
        }
        this.O = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ic icVar = this.f35411h0;
        dn dnVar = this.f35412i0;
        if (action == 0 && a()) {
            this.f35413j0 = true;
            icVar.c(true);
            org.telegram.messenger.g0.r(dnVar);
            org.telegram.messenger.g0.i3(dnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f35413j0) {
            icVar.c(false);
            this.f35413j0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(dnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, this.f35405d0);
        if (this.f35427v0 == null || w02 != this.f35431x0) {
            this.f35431x0 = w02;
            this.f35427v0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.f35427v0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f35434z0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f10;
        w8 w8Var = this.I;
        w8Var.q(chat);
        gn gnVar = this.f35406e;
        if (gnVar != null) {
            gnVar.e(chat, w8Var);
            if (org.telegram.messenger.t3.c0(chat)) {
                if (chat != null && org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).P1().K(-chat.f26956id)) {
                    f10 = 11.0f;
                } else {
                    f10 = 16.0f;
                }
            } else {
                f10 = 21.0f;
            }
            gnVar.setRoundRadius(org.telegram.messenger.g0.L(f10));
        }
    }

    public void setCommunityItemVisible(boolean z9) {
        int i7;
        ImageView imageView = this.f35432y;
        if (imageView != null) {
            if (z9 && !this.f35408f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    public void setLeftPadding(int i7) {
        this.L = i7;
    }

    public void setOccupyStatusBar(boolean z9) {
        this.K = z9;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.f35402b0 = num;
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.f35411h0.c(z9);
    }

    public void setRightAvatarPadding(int i7) {
        this.M = i7;
    }

    public void setStoriesForceState(Integer num) {
        this.f35403c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.qk qkVar = this.f35421r;
            if (qkVar != null) {
                qkVar.k(charSequence);
            } else {
                j6 j6Var = this.f35423s;
                if (j6Var != null) {
                    j6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.f35434z0;
        if (kVar != null) {
            kVar.i(true);
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
        qu0 qu0Var = this.N;
        org.telegram.ui.ActionBar.g6 g6Var = this.f35405d0;
        if (qu0Var != null) {
            qu0Var.b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28089pa, g6Var));
        }
        Drawable drawable = this.f35422r0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        g5 g5Var = this.f35410g0;
        if (g5Var != null) {
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, g6Var)));
        }
        g5 g5Var2 = this.f35409f0;
        if (g5Var2 != null) {
            g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, g6Var)));
        }
        Drawable drawable2 = this.f35424s0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.f35425t0 != null) {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28077oi, g6Var);
            if (this.f35429w0 == null || w02 != this.f35433y0) {
                this.f35433y0 = w02;
                this.f35429w0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.f35425t0.setColorFilter(this.f35429w0);
        }
        org.telegram.ui.qk qkVar = this.h;
        if (qkVar != null) {
            try {
                if (qkVar.getRightDrawable2() instanceof hk0) {
                    ((hk0) qkVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, g6Var));
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
    public final void F(float f10, int i7) {
    }
}
