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
public class co extends FrameLayout implements te.b, org.telegram.messenger.gs, org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.k A0;
    public final ImageView E;
    public final ImageView F;
    public final l01 G;
    public final org.telegram.ui.bn H;
    public final bv0[] I;
    public final b9 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public bv0 O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final te.a f34227a;
    public CharSequence f34228a0;
    public boolean f34229b;
    public int f34230b0;
    public Integer f34231c;
    public Integer f34232c0;
    public final int d;
    public final bt0 f34233d0;
    public final yn f34234e;
    public final org.telegram.ui.ActionBar.h6 f34235e0;
    public final boolean f34236f;
    public boolean f34237f0;
    public final n5 f34238g0;
    public final org.telegram.ui.pk h;
    public final n5 f34239h0;
    public final mc f34240i0;
    public final vn f34241j0;
    public boolean f34242k0;
    public boolean f34243l0;
    public boolean m0;
    public final AtomicReference f34244n;
    public boolean f34245n0;
    public boolean f34246o0;
    public boolean f34247p0;
    public String f34248q0;
    public final org.telegram.ui.pk f34249r;
    public String f34250r0;
    public final o6 f34251s;
    public Drawable f34252s0;
    public Drawable f34253t0;
    public Drawable f34254u0;
    public boolean f34255v0;
    public final AtomicReference f34256w;
    public PorterDuffColorFilter f34257w0;
    public final ImageView f34258x;
    public PorterDuffColorFilter f34259x0;
    public final ImageView f34260y;
    public int f34261y0;
    public int f34262z0;

    public co(android.content.Context r22, org.telegram.ui.ActionBar.g2 r23, boolean r24, org.telegram.ui.ActionBar.h6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.co.<init>(android.content.Context, org.telegram.ui.ActionBar.g2, boolean, org.telegram.ui.ActionBar.h6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.bn bnVar = this.H;
        org.telegram.ui.pk pkVar = this.f34249r;
        if (pkVar != null) {
            int i7 = 0;
            bv0[] bv0VarArr = this.I;
            if (z10) {
                try {
                    int intValue = org.telegram.messenger.np.u1(this.K).G1(bnVar.a(), bnVar.f46191s4).intValue();
                    bv0 bv0Var = bv0VarArr[intValue];
                    if (bv0Var != null) {
                        org.telegram.ui.ActionBar.h6 h6Var = this.f34235e0;
                        if (intValue == 5) {
                            pkVar.g(bv0Var, "**oo**");
                            bv0VarArr[intValue].b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29605pa, h6Var));
                            pkVar.setLeftDrawable((Drawable) null);
                        } else {
                            pkVar.g(null, null);
                            bv0VarArr[intValue].b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29605pa, h6Var));
                            pkVar.setLeftDrawable(bv0VarArr[intValue]);
                        }
                        this.O = bv0VarArr[intValue];
                        while (i7 < bv0VarArr.length) {
                            bv0 bv0Var2 = bv0VarArr[i7];
                            if (bv0Var2 != null) {
                                if (i7 == intValue) {
                                    bv0Var2.d();
                                } else {
                                    bv0Var2.e();
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
            this.O = null;
            pkVar.setLeftDrawable((Drawable) null);
            pkVar.g(null, null);
            while (i7 < bv0VarArr.length) {
                bv0 bv0Var3 = bv0VarArr[i7];
                if (bv0Var3 != null) {
                    bv0Var3.e();
                }
                i7++;
            }
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        ImageView imageView;
        int i10;
        if (i7 == 0 && (imageView = this.f34258x) != null) {
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
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            TLRPC.User j3 = bnVar.j();
            TLRPC.Chat chat = bnVar.f46005e;
            if (bnVar.f46036g4 == 3) {
                long e92 = bnVar.e9();
                if (e92 >= 0) {
                    user = bnVar.getMessagesController().c2(Long.valueOf(e92));
                    chat = null;
                } else {
                    chat = bnVar.getMessagesController().O0(Long.valueOf(-e92));
                    user = null;
                }
            } else {
                user = j3;
            }
            b9 b9Var = this.J;
            yn ynVar = this.f34234e;
            if (user != null) {
                b9Var.r(user);
                if (org.telegram.messenger.p10.A(user)) {
                    b9Var.f33802p = 0.8f;
                    b9Var.g(12);
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.j(null, null, b9Var, user);
                    }
                } else if (org.telegram.messenger.p10.t(user)) {
                    b9Var.f33802p = 0.8f;
                    b9Var.g(21);
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.j(null, null, b9Var, user);
                    }
                } else if (org.telegram.messenger.p10.C(user) && bnVar.f46036g4 == 3) {
                    b9Var.f33802p = 0.8f;
                    b9Var.g(22);
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.j(null, null, b9Var, user);
                    }
                } else if (org.telegram.messenger.p10.C(user)) {
                    b9Var.f33802p = 0.8f;
                    b9Var.g(1);
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.j(null, null, b9Var, user);
                    }
                } else {
                    b9Var.f33802p = 1.0f;
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.f38836a.j0(user, b9Var, null, true, 3, false);
                    }
                }
            } else if (org.telegram.messenger.v3.p0(chat)) {
                long d = bnVar.d();
                int i10 = this.K;
                if (org.telegram.messenger.v3.A(i10, chat, 24) && d != 0) {
                    if (i7 > 0) {
                        TLRPC.User c22 = bnVar.getMessagesController().c2(Long.valueOf(d));
                        b9Var.r(c22);
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.f(c22, b9Var);
                    } else {
                        TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-d));
                        b9Var.q(O0);
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.f(O0, b9Var);
                    }
                } else {
                    ynVar.setAnimatedEmojiDrawable(null);
                    qg.c.p(i10, chat, b9Var, ynVar);
                }
                ynVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            } else if (chat != null) {
                b9Var.f33802p = 1.0f;
                b9Var.q(chat);
                if (ynVar != null) {
                    ynVar.setAnimatedEmojiDrawable(null);
                    ynVar.f(chat, b9Var);
                    if (chat.forum) {
                        if (org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).R1().K(-chat.f28434id)) {
                            f10 = 11.0f;
                        } else {
                            f10 = 16.0f;
                        }
                        L = org.telegram.messenger.g0.L(f10);
                    } else {
                        L = org.telegram.messenger.g0.L(21.0f);
                    }
                    ynVar.setRoundRadius(L);
                }
            }
        }
    }

    public final n5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        n5 n5Var = this.f34239h0;
        n5Var.j(j3, false);
        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29632qi, this.f34235e0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        n5Var.J = 0;
        n5Var.K = L;
        return n5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
            }
        } else if (i7 == org.telegram.messenger.ls.f25342l4) {
            org.telegram.ui.pk pkVar = this.h;
            if (pkVar != null) {
                pkVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i7 == org.telegram.messenger.ls.f25325i3) {
            n(true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f34240i0.a(0.02f);
        canvas.scale(a10, a10, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f34243l0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        if (view == this.f34234e) {
            boolean z11 = false;
            ImageView imageView = this.f34258x;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f34260y;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z11 = true;
            }
            if (z10 || z11) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (z10) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.m6.Fm);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.m6.Fm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.co.e(boolean, boolean):void");
    }

    public final void g(int i7, boolean z10) {
        l01 l01Var = this.G;
        if (l01Var != null) {
            boolean z11 = this.f34245n0;
            if (i7 == 0 && !this.U) {
                return;
            }
            te.a aVar = this.f34227a;
            if (!z11) {
                aVar.a(true, z10);
                l01Var.b(i7);
                return;
            }
            aVar.a(false, z10);
        }
    }

    public q9 getAvatarImageView() {
        return this.f34234e;
    }

    public int getLastSubtitleColorKey() {
        return this.f34230b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public bt0 getSharedMediaPreloader() {
        return this.f34233d0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.pk pkVar = this.f34249r;
        if (pkVar != null) {
            return pkVar.getTextPaint();
        }
        return this.f34251s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.pk pkVar = this.f34249r;
        if (pkVar != null) {
            return pkVar;
        }
        o6 o6Var = this.f34251s;
        if (o6Var != null) {
            return o6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f34258x;
    }

    public org.telegram.ui.ActionBar.m5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int L;
        float f10 = 0.0f;
        org.telegram.ui.pk pkVar = this.h;
        if (pkVar != null) {
            f10 = Math.max(0.0f, pkVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.pk pkVar2 = this.f34249r;
        if (pkVar2 != null) {
            f10 = Math.max(f10, pkVar2.getExactWidthIncludeDrawables());
        }
        yn ynVar = this.f34234e;
        if (ynVar != null && ynVar.getVisibility() == 0) {
            L = org.telegram.messenger.g0.L(70.0f);
        } else {
            L = org.telegram.messenger.g0.L(34.0f);
        }
        return (int) (f10 + L);
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.j6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.f34247p0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(2131232793).mutate();
                this.f34253t0 = mutate;
                int i7 = org.telegram.ui.ActionBar.m6.f29632qi;
                org.telegram.ui.ActionBar.h6 h6Var = this.f34235e0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.t6.x(this, mutate, i7, h6Var, mode);
                Drawable mutate2 = getResources().getDrawable(2131232794).mutate();
                this.f34254u0 = mutate2;
                org.telegram.ui.ActionBar.t6.x(this, mutate2, org.telegram.ui.ActionBar.m6.f29652ri, this.f34235e0, mode);
                this.h.j(new oq(this.f34253t0, this.f34254u0));
                this.f34246o0 = true;
                this.f34250r0 = org.telegram.messenger.hd.N0(2131754738, null);
            } else if (this.h.getRightDrawable() instanceof vk0) {
                this.h.j(null);
                this.f34246o0 = false;
                this.f34250r0 = null;
            }
        } else {
            this.f34247p0 = true;
            if (!(this.h.getRightDrawable() instanceof vk0)) {
                vk0 vk0Var = new vk0(!z10 ? 1 : 0);
                vk0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, this.f34235e0));
                this.h.j(vk0Var);
                this.f34250r0 = org.telegram.messenger.hd.N0(2131745666, null);
                this.f34246o0 = true;
            }
        }
        if (!z13 && org.telegram.messenger.n5.f(emojiStatus) == 0) {
            this.h.i(null);
            this.f34248q0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof o5) && (((o5) this.h.getRightDrawable()).f38105a instanceof p5)) {
                ((p5) ((o5) this.h.getRightDrawable()).f38105a).n(this.h);
            }
            if (org.telegram.messenger.n5.f(emojiStatus) != 0) {
                this.f34238g0.j(org.telegram.messenger.n5.f(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = org.telegram.messenger.t0.f26931b.getDrawable(2131232309).mutate();
                this.f34252s0 = mutate3;
                org.telegram.ui.ActionBar.t6.x(this, mutate3, org.telegram.ui.ActionBar.m6.f29632qi, this.f34235e0, PorterDuff.Mode.MULTIPLY);
                this.f34238g0.g(this.f34252s0, z14);
            } else {
                this.f34238g0.g(null, z14);
            }
            this.f34238g0.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29632qi, this.f34235e0)));
            this.h.i(this.f34238g0);
            this.f34246o0 = false;
            this.f34248q0 = org.telegram.messenger.hd.N0(2131754801, null);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(z14);
        }
    }

    public final void i(int i7, int i10) {
        org.telegram.ui.pk pkVar = this.h;
        org.telegram.ui.ActionBar.t6.q(pkVar);
        org.telegram.ui.pk pkVar2 = this.f34249r;
        org.telegram.ui.ActionBar.t6.q(pkVar2);
        pkVar.setTextColor(i7);
        pkVar2.setTextColor(i10);
        pkVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.pk pkVar = this.h;
        pkVar.setLeftDrawable(drawable);
        if (!this.f34246o0 && !this.f34247p0) {
            if (drawable2 != null) {
                this.f34250r0 = org.telegram.messenger.hd.N0(2131747707, null);
            } else {
                this.f34250r0 = null;
            }
            pkVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        b9 b9Var = this.J;
        b9Var.r(user);
        boolean A = org.telegram.messenger.p10.A(user);
        yn ynVar = this.f34234e;
        if (A) {
            b9Var.g(12);
            b9Var.f33802p = 0.8f;
            if (ynVar != null) {
                ynVar.j(null, null, b9Var, user);
            }
        } else if (org.telegram.messenger.p10.t(user)) {
            b9Var.g(21);
            b9Var.f33802p = 0.8f;
            if (ynVar != null) {
                ynVar.j(null, null, b9Var, user);
            }
        } else if (org.telegram.messenger.p10.C(user) && !z10) {
            b9Var.g(1);
            b9Var.f33802p = 0.8f;
            if (ynVar != null) {
                ynVar.j(null, null, b9Var, user);
            }
        } else {
            b9Var.f33802p = 1.0f;
            if (ynVar != null) {
                ynVar.f(user, b9Var);
            }
        }
    }

    public final void l() {
        String str;
        int i7 = this.W;
        if (i7 == 2) {
            str = org.telegram.messenger.hd.N0(2131742967, null);
        } else if (i7 == 1) {
            str = org.telegram.messenger.hd.N0(2131751797, null);
        } else if (i7 == 5) {
            str = org.telegram.messenger.hd.N0(2131743565, null);
        } else if (i7 == 4) {
            str = org.telegram.messenger.hd.N0(2131751795, null);
        } else {
            str = null;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f34235e0;
        o6 o6Var = this.f34251s;
        org.telegram.ui.pk pkVar = this.f34249r;
        if (str == null) {
            CharSequence charSequence = this.f34228a0;
            if (charSequence != null) {
                if (pkVar != null) {
                    pkVar.k(charSequence);
                    this.f34228a0 = null;
                    Integer num = this.f34232c0;
                    if (num != null) {
                        pkVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.f34230b0;
                        if (i10 >= 0) {
                            org.telegram.ui.ActionBar.t6.X(pkVar, i10, h6Var);
                            pkVar.setTag(Integer.valueOf(this.f34230b0));
                        }
                    }
                } else if (o6Var != null) {
                    o6Var.c(charSequence, !org.telegram.messenger.hd.f24444a0, true);
                    this.f34228a0 = null;
                    Integer num2 = this.f34232c0;
                    if (num2 != null) {
                        o6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.f34230b0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.t6.Y(o6Var, i11, h6Var);
                            o6Var.setTag(Integer.valueOf(this.f34230b0));
                        }
                    }
                }
            }
        } else if (pkVar != null) {
            if (this.f34228a0 == null) {
                this.f34228a0 = pkVar.getText();
            }
            pkVar.k(str);
            Integer num3 = this.f34232c0;
            if (num3 != null) {
                pkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.m6.B8;
                org.telegram.ui.ActionBar.t6.X(pkVar, i12, h6Var);
                pkVar.setTag(Integer.valueOf(i12));
            }
        } else if (o6Var != null) {
            if (this.f34228a0 == null) {
                this.f34228a0 = o6Var.getText();
            }
            o6Var.c(str, !org.telegram.messenger.hd.f24444a0, true);
            Integer num4 = this.f34232c0;
            if (num4 != null) {
                o6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.m6.B8;
                org.telegram.ui.ActionBar.t6.Y(o6Var, i13, h6Var);
                o6Var.setTag(Integer.valueOf(i13));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            this.V = 0;
            TLRPC.ChatFull chatFull = bnVar.f46181r8;
            if (chatFull != null) {
                int i7 = this.K;
                int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (z10 && chatFull.participants_count > 200) {
                        this.V = chatFull.online_count;
                        return;
                    }
                    return;
                }
                for (int i10 = 0; i10 < chatFull.participants.participants.size(); i10++) {
                    TLRPC.User c22 = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
                    if (c22 != null && (userStatus = c22.status) != null && ((userStatus.expires > currentTime || c22.f28583id == org.telegram.messenger.k10.i(i7).e()) && c22.status.expires > 10000)) {
                        this.V++;
                    }
                }
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        int i7;
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
        org.telegram.ui.ActionBar.h6 h6Var = this.f34235e0;
        boolean[] zArr2 = this.S;
        o6 o6Var = this.f34251s;
        org.telegram.ui.pk pkVar = this.f34249r;
        org.telegram.ui.pk pkVar2 = this.h;
        int i19 = this.K;
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            if (bnVar.f46036g4 == 6) {
                String str = bnVar.f46010e4.link;
                kg.z[] zVarArr = kg.z.f18576e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User j3 = bnVar.j();
            TLRPC.Chat chat = bnVar.f46005e;
            if (org.telegram.messenger.p10.C(j3) && bnVar.f46036g4 == 0 && bnVar.getMessagesController().I1().c() >= 3 && (this.f34255v0 || org.telegram.messenger.np.g1().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((org.telegram.messenger.p10.C(j3) && !z11) || org.telegram.messenger.p10.A(j3) || ((j3 != null && j3.f28583id == 489000) || ((i7 = bnVar.f46036g4) != 0 && i7 != 8))) && bnVar.f46036g4 != 3) {
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
                if (!this.f34255v0) {
                    org.telegram.messenger.np.g1().edit().putInt("savedmsgschatshint", org.telegram.messenger.np.g1().getInt("savedmsgschatshint", i18) + 1).apply();
                    this.f34255v0 = true;
                }
            }
            CharSequence F1 = org.telegram.messenger.np.u1(i19).F1(bnVar.a(), bnVar.f46191s4, false);
            CharSequence charSequence = "";
            if (F1 != null) {
                F1 = TextUtils.replace(F1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z14 = z11;
            if (F1 != null && F1.length() != 0 && (!org.telegram.messenger.v3.T(chat) || chat.megagroup)) {
                if (bnVar.fa() && pkVar2.getTag() != null) {
                    pkVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.R = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(pkVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.R.addListener(new bo(this, 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        pkVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer G1 = org.telegram.messenger.np.u1(i19).G1(bnVar.a(), bnVar.f46191s4);
                if (G1 != null && G1.intValue() == 5) {
                    charSequence = org.telegram.messenger.j6.m(F1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = F1;
                }
                setTypingAnimation(true);
                z13 = true;
            } else if (bnVar.fa() && !bnVar.f46254x4) {
                if (pkVar2.getTag() == null) {
                    pkVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.R;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.R = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.R = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(pkVar2, property2, org.telegram.messenger.g0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.R.addListener(new bo(this, 0));
                        this.R.setDuration(180L);
                        this.R.start();
                        return;
                    }
                    pkVar2.setTranslationY(org.telegram.messenger.g0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = bnVar.f46036g4;
                if (i20 == 8) {
                    if (bnVar.f46063i4) {
                        charSequence = org.telegram.messenger.hd.N0(2131752207, null);
                        z13 = false;
                    } else {
                        if (bnVar.d() == 0) {
                            org.telegram.messenger.f00 f00Var = bnVar.getMessagesController().f25968t7;
                            long j10 = -bnVar.a();
                            if (f00Var.e(j10) && (l10 = f00Var.l(j10)) != null) {
                                i16 = l10.size();
                            } else {
                                i16 = 0;
                            }
                            if (i16 > 0) {
                                G = org.telegram.messenger.hd.H(',', "Chats", i16);
                            } else {
                                G = org.telegram.messenger.hd.N0(2131752207, null);
                            }
                        } else {
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.np.u1(i19).f25968t7.f(chat.f28434id, bnVar.d());
                            if (f10 != null) {
                                i15 = f10.totalMessagesCount;
                            } else {
                                i15 = 0;
                            }
                            if (i15 > 0) {
                                G = org.telegram.messenger.hd.G(i15, "messages", Integer.valueOf(i15));
                            } else {
                                G = org.telegram.messenger.hd.a0(null, null, 2131743767, qg.c.j(i19, chat, false));
                            }
                        }
                        charSequence = G;
                        z13 = false;
                    }
                } else {
                    if (i20 == 3) {
                        org.telegram.messenger.qv I1 = bnVar.getMessagesController().I1();
                        long e92 = bnVar.e9();
                        ArrayList arrayList = I1.f26509j;
                        int i21 = 0;
                        while (true) {
                            if (i21 < arrayList.size()) {
                                org.telegram.messenger.pv pvVar = (org.telegram.messenger.pv) arrayList.get(i21);
                                if (pvVar.f26350a == e92) {
                                    i14 = pvVar.f26353e;
                                    break;
                                }
                                i21++;
                            } else {
                                i14 = 0;
                                break;
                            }
                        }
                        charSequence = org.telegram.messenger.hd.G(Math.max(1, i14), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (bnVar.f46254x4 && chat != null) {
                            TLRPC.TL_forumTopic f11 = org.telegram.messenger.np.u1(i19).f25968t7.f(chat.f28434id, bnVar.d());
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
                                G = org.telegram.messenger.hd.G(i13, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i12];
                                objArr2[0] = chat.title;
                                G = org.telegram.messenger.hd.a0(null, null, 2131743767, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = bnVar.f46181r8;
                            int i22 = this.V;
                            if (org.telegram.messenger.v3.T(chat)) {
                                if (chatFull != null && (i11 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i22 > 1) {
                                            G = a8.p0.E(org.telegram.messenger.hd.G(i11, "Members", new Object[0]), ", ", org.telegram.messenger.hd.G(Math.min(i22, chatFull.participants_count), "OnlineCount", new Object[0]));
                                        } else {
                                            G = org.telegram.messenger.hd.G(i11, "Members", new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean C1 = org.telegram.messenger.g0.C1();
                                        int i23 = chatFull.participants_count;
                                        if (C1) {
                                            iArr[0] = i23;
                                            S = String.valueOf(i23);
                                        } else {
                                            S = org.telegram.messenger.hd.S(iArr, i23);
                                        }
                                        if (chat.megagroup) {
                                            G = org.telegram.messenger.hd.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        } else {
                                            G = org.telegram.messenger.hd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        }
                                    }
                                } else if (chat.megagroup) {
                                    if (chatFull == null) {
                                        G = org.telegram.messenger.hd.N0(2131748586, null).toLowerCase();
                                    } else if (chat.has_geo) {
                                        G = org.telegram.messenger.hd.N0(2131748449, null).toLowerCase();
                                    } else if (org.telegram.messenger.v3.t0(chat)) {
                                        G = org.telegram.messenger.hd.N0(2131748445, null).toLowerCase();
                                    } else {
                                        G = org.telegram.messenger.hd.N0(2131748448, null).toLowerCase();
                                    }
                                } else if (org.telegram.messenger.v3.t0(chat)) {
                                    G = org.telegram.messenger.hd.N0(2131752306, null).toLowerCase();
                                } else {
                                    G = org.telegram.messenger.hd.N0(2131752317, null).toLowerCase();
                                }
                            } else if (org.telegram.messenger.v3.k0(chat)) {
                                G = org.telegram.messenger.hd.N0(2131742563, null);
                            } else if (org.telegram.messenger.v3.l0(chat)) {
                                G = org.telegram.messenger.hd.N0(2131742569, null);
                            } else {
                                int i24 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i24 = chatParticipants.participants.size();
                                }
                                if (i22 > 1 && i24 != 0) {
                                    G = a8.p0.E(org.telegram.messenger.hd.G(i24, "Members", new Object[0]), ", ", org.telegram.messenger.hd.G(i22, "OnlineCount", new Object[0]));
                                } else {
                                    G = org.telegram.messenger.hd.G(i24, "Members", new Object[0]);
                                }
                            }
                        } else {
                            if (j3 != null) {
                                TLRPC.User c22 = org.telegram.messenger.np.u1(i19).c2(Long.valueOf(j3.f28583id));
                                if (c22 != null) {
                                    j3 = c22;
                                }
                                if (!org.telegram.messenger.p10.A(j3)) {
                                    long j11 = j3.f28583id;
                                    if (j11 != 489000) {
                                        if (j11 == org.telegram.messenger.k10.i(i19).e()) {
                                            charSequence = z14 ? org.telegram.messenger.g0.H2(org.telegram.messenger.hd.N0(2131745696, null), false) : org.telegram.messenger.hd.N0(2131752177, null);
                                        } else {
                                            long j12 = j3.f28583id;
                                            if (j12 == 333000 || j12 == 777000 || j12 == 42777) {
                                                z12 = false;
                                                charSequence = org.telegram.messenger.hd.N0(2131745365, null);
                                            } else if (org.telegram.messenger.np.L2(j3)) {
                                                charSequence = org.telegram.messenger.hd.N0(2131744082, null);
                                            } else {
                                                boolean z15 = j3.bot;
                                                if (z15 && (i10 = j3.bot_active_users) != 0) {
                                                    charSequence = org.telegram.messenger.hd.H(',', "BotUsers", i10);
                                                } else if (z15) {
                                                    charSequence = org.telegram.messenger.p10.e(j3);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f34237f0) {
                                                        zArr = this.T;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    charSequence = org.telegram.messenger.hd.d0(i19, j3, zArr2, zArr);
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
                i17 = org.telegram.ui.ActionBar.m6.f29605pa;
            } else {
                i17 = org.telegram.ui.ActionBar.m6.B8;
            }
            this.f34230b0 = i17;
            if (this.f34228a0 == null) {
                if (pkVar != null) {
                    pkVar.k(charSequence);
                    Integer num = this.f34232c0;
                    if (num == null) {
                        org.telegram.ui.ActionBar.t6.X(pkVar, this.f34230b0, h6Var);
                        pkVar.setTag(Integer.valueOf(this.f34230b0));
                    } else {
                        pkVar.setTextColor(num.intValue());
                    }
                } else {
                    o6Var.c(charSequence, z10, true);
                    Integer num2 = this.f34232c0;
                    if (num2 == null) {
                        org.telegram.ui.ActionBar.t6.Y(o6Var, this.f34230b0, h6Var);
                        o6Var.setTag(Integer.valueOf(this.f34230b0));
                    } else {
                        o6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.f34228a0 = charSequence;
            }
            org.telegram.ui.ActionBar.k kVar = this.A0;
            if (kVar != null) {
                kVar.k(z10);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.T1);
            org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25342l4);
            if (bnVar.f46036g4 == 3) {
                org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.f25325i3);
            }
            this.W = ConnectionsManager.getInstance(i7).getConnectionState();
            l();
        }
        n5 n5Var = this.f34238g0;
        if (n5Var != null) {
            n5Var.a();
        }
        n5 n5Var2 = this.f34239h0;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.T1);
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25342l4);
            if (bnVar.f46036g4 == 3) {
                org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25325i3);
            }
        }
        n5 n5Var = this.f34238g0;
        if (n5Var != null) {
            n5Var.b();
        }
        n5 n5Var2 = this.f34239h0;
        if (n5Var2 != null) {
            n5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f34248q0 != null) {
            sb2.append(", ");
            sb2.append(this.f34248q0);
        }
        if (this.f34250r0 != null) {
            sb2.append(", ");
            sb2.append(this.f34250r0);
        }
        sb2.append("\n");
        org.telegram.ui.pk pkVar = this.f34249r;
        if (pkVar != null) {
            sb2.append(pkVar.getText());
        } else {
            o6 o6Var = this.f34251s;
            if (o6Var != null) {
                sb2.append(o6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.N0(2131747592, null)));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        yn ynVar = this.f34234e;
        int measuredHeight = ((currentActionBarHeight - ynVar.getMeasuredHeight()) - 2) / 2;
        if (this.L) {
            i13 = org.telegram.messenger.g0.f24040m;
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
        ynVar.layout(i15, i16, ynVar.getMeasuredWidth() + i15, ynVar.getMeasuredHeight() + i16);
        int i17 = this.M;
        if (ynVar.getVisibility() == 0) {
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
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.f34244n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.pk pkVar = this.h;
        if (visibility != 8) {
            pkVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + i14) - pkVar.getPaddingTop(), pkVar.getMeasuredWidth() + L2, pkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (pkVar.getTextHeight() + i14)) - pkVar.getPaddingTop()));
            if (m5Var != null) {
                m5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + i14, m5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + m5Var.getTextHeight() + i14);
            }
        } else {
            pkVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + i14) - pkVar.getPaddingTop(), pkVar.getMeasuredWidth() + L2, pkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (pkVar.getTextHeight() + i14)) - pkVar.getPaddingTop()));
            if (m5Var != null) {
                m5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + i14, m5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + m5Var.getTextHeight() + i14);
            }
        }
        ImageView imageView = this.f34260y;
        if (imageView != null) {
            imageView.layout(org.telegram.messenger.g0.L(29.0f) + this.M, org.telegram.messenger.g0.L(27.33f) + i14, imageView.getMeasuredWidth() + org.telegram.messenger.g0.L(29.0f) + this.M, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(27.33f) + i14);
        }
        ImageView imageView2 = this.f34258x;
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
        org.telegram.ui.pk pkVar2 = this.f34249r;
        if (pkVar2 != null) {
            pkVar2.layout(L2, L, pkVar2.getMeasuredWidth() + L2, pkVar2.getTextHeight() + L);
        } else {
            o6 o6Var = this.f34251s;
            if (o6Var != null) {
                o6Var.layout(L2, L, o6Var.getMeasuredWidth() + L2, o6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) this.f34256w.get();
        if (m5Var2 != null) {
            m5Var2.layout(L2, L, m5Var2.getMeasuredWidth() + L2, m5Var2.getTextHeight() + L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i7);
        yn ynVar = this.f34234e;
        int i12 = 0;
        if (ynVar.getVisibility() == 0) {
            i11 = 54;
        } else {
            i11 = 0;
        }
        int L = size - org.telegram.messenger.g0.L(i11 + 16);
        float f12 = this.d;
        ynVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.pk pkVar = this.h;
        pkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        o6 o6Var = this.f34251s;
        org.telegram.ui.pk pkVar2 = this.f34249r;
        if (pkVar2 != null) {
            pkVar2.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        } else if (o6Var != null) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f34260y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f34258x;
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
        AtomicReference atomicReference = this.f34244n;
        if (i13 != -1 && i13 != size && i13 > size) {
            this.Q = i13;
            View view = (org.telegram.ui.ActionBar.m5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
            atomicReference.set(m5Var);
            int i14 = org.telegram.ui.ActionBar.m6.A8;
            org.telegram.ui.ActionBar.h6 h6Var = this.f34235e0;
            org.telegram.ui.ActionBar.t6.X(m5Var, i14, h6Var);
            if (this.m0) {
                f10 = 17.5f;
            } else {
                f10 = 18.0f;
            }
            m5Var.setTextSizePx(org.telegram.messenger.g0.L(f10));
            m5Var.setGravity(3);
            m5Var.setTypeface(org.telegram.messenger.g0.o());
            m5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            m5Var.i(pkVar.getRightDrawable());
            m5Var.j(pkVar.getRightDrawable2());
            m5Var.setRightDrawableOutside(pkVar.getRightDrawableOutside());
            m5Var.setLeftDrawable(pkVar.getLeftDrawable());
            m5Var.l(pkVar.getText(), false);
            ViewPropertyAnimator duration = m5Var.animate().alpha(0.0f).setDuration(350L);
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).withEndAction(new vn(this, 0)).start();
            addView(m5Var);
            AtomicReference atomicReference2 = this.f34256w;
            View view2 = (org.telegram.ui.ActionBar.m5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(getContext());
            atomicReference2.set(m5Var2);
            int i15 = org.telegram.ui.ActionBar.m6.B8;
            org.telegram.ui.ActionBar.t6.X(m5Var2, i15, h6Var);
            m5Var2.setTag(Integer.valueOf(i15));
            if (this.m0) {
                f11 = 13.5f;
            } else {
                f11 = 14.0f;
            }
            m5Var2.setTextSizePx(org.telegram.messenger.g0.L(f11));
            m5Var2.setGravity(3);
            if (pkVar2 != null) {
                m5Var2.l(pkVar2.getText(), false);
            } else if (o6Var != null) {
                m5Var2.l(o6Var.getText(), false);
            }
            m5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(nrVar).withEndAction(new vn(this, 1)).start();
            addView(m5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.m5 m5Var3 = (org.telegram.ui.ActionBar.m5) atomicReference.get();
        if (m5Var3 != null) {
            int i16 = this.Q;
            if (ynVar.getVisibility() == 0) {
                i12 = 54;
            }
            m5Var3.measure(org.telegram.messenger.o10.c(i12 + 16, i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
        }
        this.P = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        mc mcVar = this.f34240i0;
        vn vnVar = this.f34241j0;
        if (action == 0 && a()) {
            this.f34242k0 = true;
            mcVar.c(true);
            org.telegram.messenger.g0.r(vnVar);
            org.telegram.messenger.g0.h3(vnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f34242k0) {
            mcVar.c(false);
            this.f34242k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(vnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29632qi, this.f34235e0);
        if (this.f34257w0 == null || w02 != this.f34261y0) {
            this.f34261y0 = w02;
            this.f34257w0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.f34257w0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.A0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f10;
        b9 b9Var = this.J;
        b9Var.q(chat);
        yn ynVar = this.f34234e;
        if (ynVar != null) {
            ynVar.f(chat, b9Var);
            if (org.telegram.messenger.v3.c0(chat)) {
                if (chat != null && org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).R1().K(-chat.f28434id)) {
                    f10 = 11.0f;
                } else {
                    f10 = 16.0f;
                }
            } else {
                f10 = 21.0f;
            }
            ynVar.setRoundRadius(org.telegram.messenger.g0.L(f10));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i7;
        ImageView imageView = this.f34260y;
        if (imageView != null) {
            if (z10 && !this.f34236f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    public void setLeftPadding(int i7) {
        this.M = i7;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.L = z10;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.f34232c0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f34240i0.c(z10);
    }

    public void setRightAvatarPadding(int i7) {
        this.N = i7;
    }

    public void setStoriesForceState(Integer num) {
        this.f34231c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.f34228a0 == null) {
            org.telegram.ui.pk pkVar = this.f34249r;
            if (pkVar != null) {
                pkVar.k(charSequence);
            } else {
                o6 o6Var = this.f34251s;
                if (o6Var != null) {
                    o6Var.setText(charSequence);
                }
            }
        } else {
            this.f34228a0 = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(true);
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
        bv0 bv0Var = this.O;
        org.telegram.ui.ActionBar.h6 h6Var = this.f34235e0;
        if (bv0Var != null) {
            bv0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29605pa, h6Var));
        }
        Drawable drawable = this.f34252s0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        n5 n5Var = this.f34239h0;
        if (n5Var != null) {
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29632qi, h6Var)));
        }
        n5 n5Var2 = this.f34238g0;
        if (n5Var2 != null) {
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29632qi, h6Var)));
        }
        Drawable drawable2 = this.f34253t0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.f34254u0 != null) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29652ri, h6Var);
            if (this.f34259x0 == null || w02 != this.f34262z0) {
                this.f34262z0 = w02;
                this.f34259x0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.f34254u0.setColorFilter(this.f34259x0);
        }
        org.telegram.ui.pk pkVar = this.h;
        if (pkVar != null) {
            try {
                if (pkVar.getRightDrawable2() instanceof vk0) {
                    ((vk0) pkVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
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
    public final void D(float f10, int i7) {
    }
}
