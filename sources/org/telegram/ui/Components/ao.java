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
public class ao extends FrameLayout implements te.b, org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.k A0;
    public final ImageView E;
    public final ImageView F;
    public final k01 G;
    public final org.telegram.ui.bn H;
    public final yu0[] I;
    public final b9 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public yu0 O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final te.a f33374a;
    public CharSequence f33375a0;
    public boolean f33376b;
    public int f33377b0;
    public Integer f33378c;
    public Integer f33379c0;
    public final int d;
    public final ys0 f33380d0;
    public final wn f33381e;
    public final org.telegram.ui.ActionBar.i6 f33382e0;
    public final boolean f33383f;
    public boolean f33384f0;
    public final m5 f33385g0;
    public final org.telegram.ui.pk h;
    public final m5 f33386h0;
    public final mc f33387i0;
    public final tn f33388j0;
    public boolean f33389k0;
    public boolean f33390l0;
    public boolean m0;
    public final AtomicReference f33391n;
    public boolean f33392n0;
    public boolean f33393o0;
    public boolean f33394p0;
    public String f33395q0;
    public final org.telegram.ui.pk f33396r;
    public String f33397r0;
    public final n6 f33398s;
    public Drawable f33399s0;
    public Drawable f33400t0;
    public Drawable f33401u0;
    public boolean f33402v0;
    public final AtomicReference f33403w;
    public PorterDuffColorFilter f33404w0;
    public final ImageView f33405x;
    public PorterDuffColorFilter f33406x0;
    public final ImageView f33407y;
    public int f33408y0;
    public int f33409z0;

    public ao(android.content.Context r22, org.telegram.ui.ActionBar.h2 r23, boolean r24, org.telegram.ui.ActionBar.i6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ao.<init>(android.content.Context, org.telegram.ui.ActionBar.h2, boolean, org.telegram.ui.ActionBar.i6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.bn bnVar = this.H;
        org.telegram.ui.pk pkVar = this.f33396r;
        if (pkVar != null) {
            int i7 = 0;
            yu0[] yu0VarArr = this.I;
            if (z10) {
                try {
                    int intValue = org.telegram.messenger.mp.u1(this.K).G1(bnVar.a(), bnVar.f46164s4).intValue();
                    yu0 yu0Var = yu0VarArr[intValue];
                    if (yu0Var != null) {
                        org.telegram.ui.ActionBar.i6 i6Var = this.f33382e0;
                        if (intValue == 5) {
                            pkVar.g(yu0Var, "**oo**");
                            yu0VarArr[intValue].b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29618pa, i6Var));
                            pkVar.setLeftDrawable((Drawable) null);
                        } else {
                            pkVar.g(null, null);
                            yu0VarArr[intValue].b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29618pa, i6Var));
                            pkVar.setLeftDrawable(yu0VarArr[intValue]);
                        }
                        this.O = yu0VarArr[intValue];
                        while (i7 < yu0VarArr.length) {
                            yu0 yu0Var2 = yu0VarArr[i7];
                            if (yu0Var2 != null) {
                                if (i7 == intValue) {
                                    yu0Var2.d();
                                } else {
                                    yu0Var2.e();
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
            while (i7 < yu0VarArr.length) {
                yu0 yu0Var3 = yu0VarArr[i7];
                if (yu0Var3 != null) {
                    yu0Var3.e();
                }
                i7++;
            }
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        ImageView imageView;
        int i10;
        if (i7 == 0 && (imageView = this.f33405x) != null) {
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
            TLRPC.Chat chat = bnVar.f45978e;
            if (bnVar.f46009g4 == 3) {
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
            wn wnVar = this.f33381e;
            if (user != null) {
                b9Var.r(user);
                if (org.telegram.messenger.o10.A(user)) {
                    b9Var.f33601p = 0.8f;
                    b9Var.g(12);
                    if (wnVar != null) {
                        wnVar.setAnimatedEmojiDrawable(null);
                        wnVar.j(null, null, b9Var, user);
                    }
                } else if (org.telegram.messenger.o10.t(user)) {
                    b9Var.f33601p = 0.8f;
                    b9Var.g(21);
                    if (wnVar != null) {
                        wnVar.setAnimatedEmojiDrawable(null);
                        wnVar.j(null, null, b9Var, user);
                    }
                } else if (org.telegram.messenger.o10.C(user) && bnVar.f46009g4 == 3) {
                    b9Var.f33601p = 0.8f;
                    b9Var.g(22);
                    if (wnVar != null) {
                        wnVar.setAnimatedEmojiDrawable(null);
                        wnVar.j(null, null, b9Var, user);
                    }
                } else if (org.telegram.messenger.o10.C(user)) {
                    b9Var.f33601p = 0.8f;
                    b9Var.g(1);
                    if (wnVar != null) {
                        wnVar.setAnimatedEmojiDrawable(null);
                        wnVar.j(null, null, b9Var, user);
                    }
                } else {
                    b9Var.f33601p = 1.0f;
                    if (wnVar != null) {
                        wnVar.setAnimatedEmojiDrawable(null);
                        wnVar.f38742a.j0(user, b9Var, null, true, 3, false);
                    }
                }
            } else if (org.telegram.messenger.v3.p0(chat)) {
                long d = bnVar.d();
                int i10 = this.K;
                if (org.telegram.messenger.v3.A(i10, chat, 24) && d != 0) {
                    if (i7 > 0) {
                        TLRPC.User c22 = bnVar.getMessagesController().c2(Long.valueOf(d));
                        b9Var.r(c22);
                        wnVar.setAnimatedEmojiDrawable(null);
                        wnVar.f(c22, b9Var);
                    } else {
                        TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-d));
                        b9Var.q(O0);
                        wnVar.setAnimatedEmojiDrawable(null);
                        wnVar.f(O0, b9Var);
                    }
                } else {
                    wnVar.setAnimatedEmojiDrawable(null);
                    qg.c.p(i10, chat, b9Var, wnVar);
                }
                wnVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            } else if (chat != null) {
                b9Var.f33601p = 1.0f;
                b9Var.q(chat);
                if (wnVar != null) {
                    wnVar.setAnimatedEmojiDrawable(null);
                    wnVar.f(chat, b9Var);
                    if (chat.forum) {
                        if (org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).R1().K(-chat.f28403id)) {
                            f10 = 11.0f;
                        } else {
                            f10 = 16.0f;
                        }
                        L = org.telegram.messenger.g0.L(f10);
                    } else {
                        L = org.telegram.messenger.g0.L(21.0f);
                    }
                    wnVar.setRoundRadius(L);
                }
            }
        }
    }

    public final m5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        m5 m5Var = this.f33386h0;
        m5Var.j(j3, false);
        m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29645qi, this.f33382e0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        m5Var.J = 0;
        m5Var.K = L;
        return m5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
            }
        } else if (i7 == org.telegram.messenger.ks.f25148l4) {
            org.telegram.ui.pk pkVar = this.h;
            if (pkVar != null) {
                pkVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i7 == org.telegram.messenger.ks.f25131i3) {
            n(true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f33387i0.a(0.02f);
        canvas.scale(a10, a10, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f33390l0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        if (view == this.f33381e) {
            boolean z11 = false;
            ImageView imageView = this.f33405x;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f33407y;
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.n6.Fm);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.n6.Fm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ao.e(boolean, boolean):void");
    }

    public final void g(int i7, boolean z10) {
        k01 k01Var = this.G;
        if (k01Var != null) {
            boolean z11 = this.f33392n0;
            if (i7 == 0 && !this.U) {
                return;
            }
            te.a aVar = this.f33374a;
            if (!z11) {
                aVar.a(true, z10);
                k01Var.b(i7);
                return;
            }
            aVar.a(false, z10);
        }
    }

    public q9 getAvatarImageView() {
        return this.f33381e;
    }

    public int getLastSubtitleColorKey() {
        return this.f33377b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public ys0 getSharedMediaPreloader() {
        return this.f33380d0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.pk pkVar = this.f33396r;
        if (pkVar != null) {
            return pkVar.getTextPaint();
        }
        return this.f33398s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.pk pkVar = this.f33396r;
        if (pkVar != null) {
            return pkVar;
        }
        n6 n6Var = this.f33398s;
        if (n6Var != null) {
            return n6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f33405x;
    }

    public org.telegram.ui.ActionBar.n5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int L;
        float f10 = 0.0f;
        org.telegram.ui.pk pkVar = this.h;
        if (pkVar != null) {
            f10 = Math.max(0.0f, pkVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.pk pkVar2 = this.f33396r;
        if (pkVar2 != null) {
            f10 = Math.max(f10, pkVar2.getExactWidthIncludeDrawables());
        }
        wn wnVar = this.f33381e;
        if (wnVar != null && wnVar.getVisibility() == 0) {
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
        this.f33394p0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(2131232793).mutate();
                this.f33400t0 = mutate;
                int i7 = org.telegram.ui.ActionBar.n6.f29645qi;
                org.telegram.ui.ActionBar.i6 i6Var = this.f33382e0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.u6.x(this, mutate, i7, i6Var, mode);
                Drawable mutate2 = getResources().getDrawable(2131232794).mutate();
                this.f33401u0 = mutate2;
                org.telegram.ui.ActionBar.u6.x(this, mutate2, org.telegram.ui.ActionBar.n6.f29665ri, this.f33382e0, mode);
                this.h.j(new mq(this.f33400t0, this.f33401u0));
                this.f33393o0 = true;
                this.f33397r0 = org.telegram.messenger.gd.M0(2131754739, null);
            } else if (this.h.getRightDrawable() instanceof tk0) {
                this.h.j(null);
                this.f33393o0 = false;
                this.f33397r0 = null;
            }
        } else {
            this.f33394p0 = true;
            if (!(this.h.getRightDrawable() instanceof tk0)) {
                tk0 tk0Var = new tk0(!z10 ? 1 : 0);
                tk0Var.b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B8, this.f33382e0));
                this.h.j(tk0Var);
                this.f33397r0 = org.telegram.messenger.gd.M0(2131745667, null);
                this.f33393o0 = true;
            }
        }
        if (!z13 && org.telegram.messenger.n5.f(emojiStatus) == 0) {
            this.h.i(null);
            this.f33395q0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof n5) && (((n5) this.h.getRightDrawable()).f37727a instanceof o5)) {
                ((o5) ((n5) this.h.getRightDrawable()).f37727a).n(this.h);
            }
            if (org.telegram.messenger.n5.f(emojiStatus) != 0) {
                this.f33385g0.j(org.telegram.messenger.n5.f(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = org.telegram.messenger.t0.f26913b.getDrawable(2131232309).mutate();
                this.f33399s0 = mutate3;
                org.telegram.ui.ActionBar.u6.x(this, mutate3, org.telegram.ui.ActionBar.n6.f29645qi, this.f33382e0, PorterDuff.Mode.MULTIPLY);
                this.f33385g0.g(this.f33399s0, z14);
            } else {
                this.f33385g0.g(null, z14);
            }
            this.f33385g0.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29645qi, this.f33382e0)));
            this.h.i(this.f33385g0);
            this.f33393o0 = false;
            this.f33395q0 = org.telegram.messenger.gd.M0(2131754802, null);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(z14);
        }
    }

    public final void i(int i7, int i10) {
        org.telegram.ui.pk pkVar = this.h;
        org.telegram.ui.ActionBar.u6.q(pkVar);
        org.telegram.ui.pk pkVar2 = this.f33396r;
        org.telegram.ui.ActionBar.u6.q(pkVar2);
        pkVar.setTextColor(i7);
        pkVar2.setTextColor(i10);
        pkVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.pk pkVar = this.h;
        pkVar.setLeftDrawable(drawable);
        if (!this.f33393o0 && !this.f33394p0) {
            if (drawable2 != null) {
                this.f33397r0 = org.telegram.messenger.gd.M0(2131747708, null);
            } else {
                this.f33397r0 = null;
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
        boolean A = org.telegram.messenger.o10.A(user);
        wn wnVar = this.f33381e;
        if (A) {
            b9Var.g(12);
            b9Var.f33601p = 0.8f;
            if (wnVar != null) {
                wnVar.j(null, null, b9Var, user);
            }
        } else if (org.telegram.messenger.o10.t(user)) {
            b9Var.g(21);
            b9Var.f33601p = 0.8f;
            if (wnVar != null) {
                wnVar.j(null, null, b9Var, user);
            }
        } else if (org.telegram.messenger.o10.C(user) && !z10) {
            b9Var.g(1);
            b9Var.f33601p = 0.8f;
            if (wnVar != null) {
                wnVar.j(null, null, b9Var, user);
            }
        } else {
            b9Var.f33601p = 1.0f;
            if (wnVar != null) {
                wnVar.f(user, b9Var);
            }
        }
    }

    public final void l() {
        String str;
        int i7 = this.W;
        if (i7 == 2) {
            str = org.telegram.messenger.gd.M0(2131742975, null);
        } else if (i7 == 1) {
            str = org.telegram.messenger.gd.M0(2131751798, null);
        } else if (i7 == 5) {
            str = org.telegram.messenger.gd.M0(2131743573, null);
        } else if (i7 == 4) {
            str = org.telegram.messenger.gd.M0(2131751796, null);
        } else {
            str = null;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f33382e0;
        n6 n6Var = this.f33398s;
        org.telegram.ui.pk pkVar = this.f33396r;
        if (str == null) {
            CharSequence charSequence = this.f33375a0;
            if (charSequence != null) {
                if (pkVar != null) {
                    pkVar.k(charSequence);
                    this.f33375a0 = null;
                    Integer num = this.f33379c0;
                    if (num != null) {
                        pkVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.f33377b0;
                        if (i10 >= 0) {
                            org.telegram.ui.ActionBar.u6.X(pkVar, i10, i6Var);
                            pkVar.setTag(Integer.valueOf(this.f33377b0));
                        }
                    }
                } else if (n6Var != null) {
                    n6Var.c(charSequence, !org.telegram.messenger.gd.f24213a0, true);
                    this.f33375a0 = null;
                    Integer num2 = this.f33379c0;
                    if (num2 != null) {
                        n6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.f33377b0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.u6.Y(n6Var, i11, i6Var);
                            n6Var.setTag(Integer.valueOf(this.f33377b0));
                        }
                    }
                }
            }
        } else if (pkVar != null) {
            if (this.f33375a0 == null) {
                this.f33375a0 = pkVar.getText();
            }
            pkVar.k(str);
            Integer num3 = this.f33379c0;
            if (num3 != null) {
                pkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.n6.B8;
                org.telegram.ui.ActionBar.u6.X(pkVar, i12, i6Var);
                pkVar.setTag(Integer.valueOf(i12));
            }
        } else if (n6Var != null) {
            if (this.f33375a0 == null) {
                this.f33375a0 = n6Var.getText();
            }
            n6Var.c(str, !org.telegram.messenger.gd.f24213a0, true);
            Integer num4 = this.f33379c0;
            if (num4 != null) {
                n6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.n6.B8;
                org.telegram.ui.ActionBar.u6.Y(n6Var, i13, i6Var);
                n6Var.setTag(Integer.valueOf(i13));
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
            TLRPC.ChatFull chatFull = bnVar.f46154r8;
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
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
                    if (c22 != null && (userStatus = c22.status) != null && ((userStatus.expires > currentTime || c22.f28552id == org.telegram.messenger.j10.i(i7).e()) && c22.status.expires > 10000)) {
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f33382e0;
        boolean[] zArr2 = this.S;
        n6 n6Var = this.f33398s;
        org.telegram.ui.pk pkVar = this.f33396r;
        org.telegram.ui.pk pkVar2 = this.h;
        int i19 = this.K;
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            if (bnVar.f46009g4 == 6) {
                String str = bnVar.f45983e4.link;
                kg.y[] yVarArr = kg.y.f18533e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User j3 = bnVar.j();
            TLRPC.Chat chat = bnVar.f45978e;
            if (org.telegram.messenger.o10.C(j3) && bnVar.f46009g4 == 0 && bnVar.getMessagesController().I1().c() >= 3 && (this.f33402v0 || org.telegram.messenger.mp.g1().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((org.telegram.messenger.o10.C(j3) && !z11) || org.telegram.messenger.o10.A(j3) || ((j3 != null && j3.f28552id == 489000) || ((i7 = bnVar.f46009g4) != 0 && i7 != 8))) && bnVar.f46009g4 != 3) {
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
                if (!this.f33402v0) {
                    org.telegram.messenger.mp.g1().edit().putInt("savedmsgschatshint", org.telegram.messenger.mp.g1().getInt("savedmsgschatshint", i18) + 1).apply();
                    this.f33402v0 = true;
                }
            }
            CharSequence F1 = org.telegram.messenger.mp.u1(i19).F1(bnVar.a(), bnVar.f46164s4, false);
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
                        this.R.addListener(new zn(this, 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        pkVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer G1 = org.telegram.messenger.mp.u1(i19).G1(bnVar.a(), bnVar.f46164s4);
                if (G1 != null && G1.intValue() == 5) {
                    charSequence = org.telegram.messenger.j6.m(F1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = F1;
                }
                setTypingAnimation(true);
                z13 = true;
            } else if (bnVar.fa() && !bnVar.f46227x4) {
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
                        this.R.addListener(new zn(this, 0));
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
                int i20 = bnVar.f46009g4;
                if (i20 == 8) {
                    if (bnVar.f46036i4) {
                        charSequence = org.telegram.messenger.gd.M0(2131752208, null);
                        z13 = false;
                    } else {
                        if (bnVar.d() == 0) {
                            org.telegram.messenger.e00 e00Var = bnVar.getMessagesController().f25769t7;
                            long j10 = -bnVar.a();
                            if (e00Var.e(j10) && (l10 = e00Var.l(j10)) != null) {
                                i16 = l10.size();
                            } else {
                                i16 = 0;
                            }
                            if (i16 > 0) {
                                G = org.telegram.messenger.gd.H(',', "Chats", i16);
                            } else {
                                G = org.telegram.messenger.gd.M0(2131752208, null);
                            }
                        } else {
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.mp.u1(i19).f25769t7.f(chat.f28403id, bnVar.d());
                            if (f10 != null) {
                                i15 = f10.totalMessagesCount;
                            } else {
                                i15 = 0;
                            }
                            if (i15 > 0) {
                                G = org.telegram.messenger.gd.G(i15, "messages", Integer.valueOf(i15));
                            } else {
                                G = org.telegram.messenger.gd.a0(null, null, 2131743775, qg.c.j(i19, chat, false));
                            }
                        }
                        charSequence = G;
                        z13 = false;
                    }
                } else {
                    if (i20 == 3) {
                        org.telegram.messenger.pv I1 = bnVar.getMessagesController().I1();
                        long e92 = bnVar.e9();
                        ArrayList arrayList = I1.f26300j;
                        int i21 = 0;
                        while (true) {
                            if (i21 < arrayList.size()) {
                                org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) arrayList.get(i21);
                                if (ovVar.f26104a == e92) {
                                    i14 = ovVar.f26107e;
                                    break;
                                }
                                i21++;
                            } else {
                                i14 = 0;
                                break;
                            }
                        }
                        charSequence = org.telegram.messenger.gd.G(Math.max(1, i14), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (bnVar.f46227x4 && chat != null) {
                            TLRPC.TL_forumTopic f11 = org.telegram.messenger.mp.u1(i19).f25769t7.f(chat.f28403id, bnVar.d());
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
                                G = org.telegram.messenger.gd.G(i13, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i12];
                                objArr2[0] = chat.title;
                                G = org.telegram.messenger.gd.a0(null, null, 2131743775, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = bnVar.f46154r8;
                            int i22 = this.V;
                            if (org.telegram.messenger.v3.T(chat)) {
                                if (chatFull != null && (i11 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i22 > 1) {
                                            G = a8.p0.E(org.telegram.messenger.gd.G(i11, "Members", new Object[0]), ", ", org.telegram.messenger.gd.G(Math.min(i22, chatFull.participants_count), "OnlineCount", new Object[0]));
                                        } else {
                                            G = org.telegram.messenger.gd.G(i11, "Members", new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean C1 = org.telegram.messenger.g0.C1();
                                        int i23 = chatFull.participants_count;
                                        if (C1) {
                                            iArr[0] = i23;
                                            S = String.valueOf(i23);
                                        } else {
                                            S = org.telegram.messenger.gd.S(iArr, i23);
                                        }
                                        if (chat.megagroup) {
                                            G = org.telegram.messenger.gd.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        } else {
                                            G = org.telegram.messenger.gd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        }
                                    }
                                } else if (chat.megagroup) {
                                    if (chatFull == null) {
                                        G = org.telegram.messenger.gd.M0(2131748587, null).toLowerCase();
                                    } else if (chat.has_geo) {
                                        G = org.telegram.messenger.gd.M0(2131748450, null).toLowerCase();
                                    } else if (org.telegram.messenger.v3.t0(chat)) {
                                        G = org.telegram.messenger.gd.M0(2131748446, null).toLowerCase();
                                    } else {
                                        G = org.telegram.messenger.gd.M0(2131748449, null).toLowerCase();
                                    }
                                } else if (org.telegram.messenger.v3.t0(chat)) {
                                    G = org.telegram.messenger.gd.M0(2131752307, null).toLowerCase();
                                } else {
                                    G = org.telegram.messenger.gd.M0(2131752318, null).toLowerCase();
                                }
                            } else if (org.telegram.messenger.v3.k0(chat)) {
                                G = org.telegram.messenger.gd.M0(2131742571, null);
                            } else if (org.telegram.messenger.v3.l0(chat)) {
                                G = org.telegram.messenger.gd.M0(2131742577, null);
                            } else {
                                int i24 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i24 = chatParticipants.participants.size();
                                }
                                if (i22 > 1 && i24 != 0) {
                                    G = a8.p0.E(org.telegram.messenger.gd.G(i24, "Members", new Object[0]), ", ", org.telegram.messenger.gd.G(i22, "OnlineCount", new Object[0]));
                                } else {
                                    G = org.telegram.messenger.gd.G(i24, "Members", new Object[0]);
                                }
                            }
                        } else {
                            if (j3 != null) {
                                TLRPC.User c22 = org.telegram.messenger.mp.u1(i19).c2(Long.valueOf(j3.f28552id));
                                if (c22 != null) {
                                    j3 = c22;
                                }
                                if (!org.telegram.messenger.o10.A(j3)) {
                                    long j11 = j3.f28552id;
                                    if (j11 != 489000) {
                                        if (j11 == org.telegram.messenger.j10.i(i19).e()) {
                                            charSequence = z14 ? org.telegram.messenger.g0.H2(org.telegram.messenger.gd.M0(2131745697, null), false) : org.telegram.messenger.gd.M0(2131752178, null);
                                        } else {
                                            long j12 = j3.f28552id;
                                            if (j12 == 333000 || j12 == 777000 || j12 == 42777) {
                                                z12 = false;
                                                charSequence = org.telegram.messenger.gd.M0(2131745366, null);
                                            } else if (org.telegram.messenger.mp.L2(j3)) {
                                                charSequence = org.telegram.messenger.gd.M0(2131744090, null);
                                            } else {
                                                boolean z15 = j3.bot;
                                                if (z15 && (i10 = j3.bot_active_users) != 0) {
                                                    charSequence = org.telegram.messenger.gd.H(',', "BotUsers", i10);
                                                } else if (z15) {
                                                    charSequence = org.telegram.messenger.o10.e(j3);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f33384f0) {
                                                        zArr = this.T;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    charSequence = org.telegram.messenger.gd.d0(i19, j3, zArr2, zArr);
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
                i17 = org.telegram.ui.ActionBar.n6.f29618pa;
            } else {
                i17 = org.telegram.ui.ActionBar.n6.B8;
            }
            this.f33377b0 = i17;
            if (this.f33375a0 == null) {
                if (pkVar != null) {
                    pkVar.k(charSequence);
                    Integer num = this.f33379c0;
                    if (num == null) {
                        org.telegram.ui.ActionBar.u6.X(pkVar, this.f33377b0, i6Var);
                        pkVar.setTag(Integer.valueOf(this.f33377b0));
                    } else {
                        pkVar.setTextColor(num.intValue());
                    }
                } else {
                    n6Var.c(charSequence, z10, true);
                    Integer num2 = this.f33379c0;
                    if (num2 == null) {
                        org.telegram.ui.ActionBar.u6.Y(n6Var, this.f33377b0, i6Var);
                        n6Var.setTag(Integer.valueOf(this.f33377b0));
                    } else {
                        n6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.f33375a0 = charSequence;
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
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.T1);
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25148l4);
            if (bnVar.f46009g4 == 3) {
                org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25131i3);
            }
            this.W = ConnectionsManager.getInstance(i7).getConnectionState();
            l();
        }
        m5 m5Var = this.f33385g0;
        if (m5Var != null) {
            m5Var.a();
        }
        m5 m5Var2 = this.f33386h0;
        if (m5Var2 != null) {
            m5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.bn bnVar = this.H;
        if (bnVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.T1);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25148l4);
            if (bnVar.f46009g4 == 3) {
                org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25131i3);
            }
        }
        m5 m5Var = this.f33385g0;
        if (m5Var != null) {
            m5Var.b();
        }
        m5 m5Var2 = this.f33386h0;
        if (m5Var2 != null) {
            m5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f33395q0 != null) {
            sb2.append(", ");
            sb2.append(this.f33395q0);
        }
        if (this.f33397r0 != null) {
            sb2.append(", ");
            sb2.append(this.f33397r0);
        }
        sb2.append("\n");
        org.telegram.ui.pk pkVar = this.f33396r;
        if (pkVar != null) {
            sb2.append(pkVar.getText());
        } else {
            n6 n6Var = this.f33398s;
            if (n6Var != null) {
                sb2.append(n6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.M0(2131747593, null)));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        wn wnVar = this.f33381e;
        int measuredHeight = ((currentActionBarHeight - wnVar.getMeasuredHeight()) - 2) / 2;
        if (this.L) {
            i13 = org.telegram.messenger.g0.f24112m;
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
        wnVar.layout(i15, i16, wnVar.getMeasuredWidth() + i15, wnVar.getMeasuredHeight() + i16);
        int i17 = this.M;
        if (wnVar.getVisibility() == 0) {
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
        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.f33391n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.pk pkVar = this.h;
        if (visibility != 8) {
            pkVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + i14) - pkVar.getPaddingTop(), pkVar.getMeasuredWidth() + L2, pkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (pkVar.getTextHeight() + i14)) - pkVar.getPaddingTop()));
            if (n5Var != null) {
                n5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + i14, n5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + n5Var.getTextHeight() + i14);
            }
        } else {
            pkVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + i14) - pkVar.getPaddingTop(), pkVar.getMeasuredWidth() + L2, pkVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (pkVar.getTextHeight() + i14)) - pkVar.getPaddingTop()));
            if (n5Var != null) {
                n5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + i14, n5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + n5Var.getTextHeight() + i14);
            }
        }
        ImageView imageView = this.f33407y;
        if (imageView != null) {
            imageView.layout(org.telegram.messenger.g0.L(29.0f) + this.M, org.telegram.messenger.g0.L(27.33f) + i14, imageView.getMeasuredWidth() + org.telegram.messenger.g0.L(29.0f) + this.M, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(27.33f) + i14);
        }
        ImageView imageView2 = this.f33405x;
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
        org.telegram.ui.pk pkVar2 = this.f33396r;
        if (pkVar2 != null) {
            pkVar2.layout(L2, L, pkVar2.getMeasuredWidth() + L2, pkVar2.getTextHeight() + L);
        } else {
            n6 n6Var = this.f33398s;
            if (n6Var != null) {
                n6Var.layout(L2, L, n6Var.getMeasuredWidth() + L2, n6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) this.f33403w.get();
        if (n5Var2 != null) {
            n5Var2.layout(L2, L, n5Var2.getMeasuredWidth() + L2, n5Var2.getTextHeight() + L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i7);
        wn wnVar = this.f33381e;
        int i12 = 0;
        if (wnVar.getVisibility() == 0) {
            i11 = 54;
        } else {
            i11 = 0;
        }
        int L = size - org.telegram.messenger.g0.L(i11 + 16);
        float f12 = this.d;
        wnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.pk pkVar = this.h;
        pkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        n6 n6Var = this.f33398s;
        org.telegram.ui.pk pkVar2 = this.f33396r;
        if (pkVar2 != null) {
            pkVar2.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        } else if (n6Var != null) {
            n6Var.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f33407y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f33405x;
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
        AtomicReference atomicReference = this.f33391n;
        if (i13 != -1 && i13 != size && i13 > size) {
            this.Q = i13;
            View view = (org.telegram.ui.ActionBar.n5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
            atomicReference.set(n5Var);
            int i14 = org.telegram.ui.ActionBar.n6.A8;
            org.telegram.ui.ActionBar.i6 i6Var = this.f33382e0;
            org.telegram.ui.ActionBar.u6.X(n5Var, i14, i6Var);
            if (this.m0) {
                f10 = 17.5f;
            } else {
                f10 = 18.0f;
            }
            n5Var.setTextSizePx(org.telegram.messenger.g0.L(f10));
            n5Var.setGravity(3);
            n5Var.setTypeface(org.telegram.messenger.g0.o());
            n5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            n5Var.i(pkVar.getRightDrawable());
            n5Var.j(pkVar.getRightDrawable2());
            n5Var.setRightDrawableOutside(pkVar.getRightDrawableOutside());
            n5Var.setLeftDrawable(pkVar.getLeftDrawable());
            n5Var.l(pkVar.getText(), false);
            ViewPropertyAnimator duration = n5Var.animate().alpha(0.0f).setDuration(350L);
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).withEndAction(new tn(this, 0)).start();
            addView(n5Var);
            AtomicReference atomicReference2 = this.f33403w;
            View view2 = (org.telegram.ui.ActionBar.n5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(getContext());
            atomicReference2.set(n5Var2);
            int i15 = org.telegram.ui.ActionBar.n6.B8;
            org.telegram.ui.ActionBar.u6.X(n5Var2, i15, i6Var);
            n5Var2.setTag(Integer.valueOf(i15));
            if (this.m0) {
                f11 = 13.5f;
            } else {
                f11 = 14.0f;
            }
            n5Var2.setTextSizePx(org.telegram.messenger.g0.L(f11));
            n5Var2.setGravity(3);
            if (pkVar2 != null) {
                n5Var2.l(pkVar2.getText(), false);
            } else if (n6Var != null) {
                n5Var2.l(n6Var.getText(), false);
            }
            n5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(lrVar).withEndAction(new tn(this, 1)).start();
            addView(n5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.n5 n5Var3 = (org.telegram.ui.ActionBar.n5) atomicReference.get();
        if (n5Var3 != null) {
            int i16 = this.Q;
            if (wnVar.getVisibility() == 0) {
                i12 = 54;
            }
            n5Var3.measure(org.telegram.messenger.n10.c(i12 + 16, i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
        }
        this.P = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        mc mcVar = this.f33387i0;
        tn tnVar = this.f33388j0;
        if (action == 0 && a()) {
            this.f33389k0 = true;
            mcVar.c(true);
            org.telegram.messenger.g0.r(tnVar);
            org.telegram.messenger.g0.h3(tnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f33389k0) {
            mcVar.c(false);
            this.f33389k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(tnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29645qi, this.f33382e0);
        if (this.f33404w0 == null || w02 != this.f33408y0) {
            this.f33408y0 = w02;
            this.f33404w0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.f33404w0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.A0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f10;
        b9 b9Var = this.J;
        b9Var.q(chat);
        wn wnVar = this.f33381e;
        if (wnVar != null) {
            wnVar.f(chat, b9Var);
            if (org.telegram.messenger.v3.c0(chat)) {
                if (chat != null && org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).R1().K(-chat.f28403id)) {
                    f10 = 11.0f;
                } else {
                    f10 = 16.0f;
                }
            } else {
                f10 = 21.0f;
            }
            wnVar.setRoundRadius(org.telegram.messenger.g0.L(f10));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i7;
        ImageView imageView = this.f33407y;
        if (imageView != null) {
            if (z10 && !this.f33383f) {
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
        this.f33379c0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f33387i0.c(z10);
    }

    public void setRightAvatarPadding(int i7) {
        this.N = i7;
    }

    public void setStoriesForceState(Integer num) {
        this.f33378c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.f33375a0 == null) {
            org.telegram.ui.pk pkVar = this.f33396r;
            if (pkVar != null) {
                pkVar.k(charSequence);
            } else {
                n6 n6Var = this.f33398s;
                if (n6Var != null) {
                    n6Var.setText(charSequence);
                }
            }
        } else {
            this.f33375a0 = charSequence;
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
        yu0 yu0Var = this.O;
        org.telegram.ui.ActionBar.i6 i6Var = this.f33382e0;
        if (yu0Var != null) {
            yu0Var.b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29618pa, i6Var));
        }
        Drawable drawable = this.f33399s0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        m5 m5Var = this.f33386h0;
        if (m5Var != null) {
            m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29645qi, i6Var)));
        }
        m5 m5Var2 = this.f33385g0;
        if (m5Var2 != null) {
            m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29645qi, i6Var)));
        }
        Drawable drawable2 = this.f33400t0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.f33401u0 != null) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29665ri, i6Var);
            if (this.f33406x0 == null || w02 != this.f33409z0) {
                this.f33409z0 = w02;
                this.f33406x0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.f33401u0.setColorFilter(this.f33406x0);
        }
        org.telegram.ui.pk pkVar = this.h;
        if (pkVar != null) {
            try {
                if (pkVar.getRightDrawable2() instanceof tk0) {
                    ((tk0) pkVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B8, i6Var));
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
