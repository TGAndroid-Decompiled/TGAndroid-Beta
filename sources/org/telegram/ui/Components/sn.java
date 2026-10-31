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
public class sn extends FrameLayout implements fe.e, org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public final ImageView D;
    public final ImageView E;
    public final f11 F;
    public final org.telegram.ui.un G;
    public final qv0[] H;
    public final r8 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public qv0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final fe.b f30266a;
    public int f30267a0;
    public boolean f30268b;
    public Integer f30269b0;
    public Integer f30270c;
    public final rt0 f30271c0;
    public final int d;
    public final org.telegram.ui.ActionBar.p6 f30272d0;
    public final on e;
    public boolean f30273e0;
    public final boolean f30274f;
    public final d5 f30275f0;
    public final d5 f30276g0;
    public final org.telegram.ui.kl h;
    public final dc f30277h0;
    public final ln f30278i0;
    public boolean f30279j0;
    public boolean f30280k0;
    public boolean f30281l0;
    public boolean m0;
    public final AtomicReference f30282n;
    public boolean f30283n0;
    public boolean f30284o0;
    public String f30285p0;
    public String f30286q0;
    public final org.telegram.ui.kl f30287r;
    public Drawable f30288r0;
    public final f6 f30289s;
    public Drawable f30290s0;
    public Drawable f30291t0;
    public boolean f30292u0;
    public PorterDuffColorFilter f30293v0;
    public final AtomicReference f30294w;
    public PorterDuffColorFilter f30295w0;
    public final ImageView f30296x;
    public int f30297x0;
    public final ImageView f30298y;
    public int f30299y0;
    public org.telegram.ui.ActionBar.l f30300z0;

    public sn(android.content.Context r22, org.telegram.ui.ActionBar.k2 r23, boolean r24, org.telegram.ui.ActionBar.p6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sn.<init>(android.content.Context, org.telegram.ui.ActionBar.k2, boolean, org.telegram.ui.ActionBar.p6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.un unVar = this.G;
        org.telegram.ui.kl klVar = this.f30287r;
        if (klVar != null) {
            int i10 = 0;
            qv0[] qv0VarArr = this.H;
            if (z10) {
                try {
                    int intValue = org.telegram.messenger.vp.r1(this.J).D1(unVar.a(), unVar.f42394r4).intValue();
                    qv0 qv0Var = qv0VarArr[intValue];
                    if (qv0Var != null) {
                        org.telegram.ui.ActionBar.p6 p6Var = this.f30272d0;
                        if (intValue == 5) {
                            klVar.g(qv0Var, "**oo**");
                            qv0VarArr[intValue].b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21155pa, p6Var));
                            klVar.setLeftDrawable((Drawable) null);
                        } else {
                            klVar.g(null, null);
                            qv0VarArr[intValue].b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21155pa, p6Var));
                            klVar.setLeftDrawable(qv0VarArr[intValue]);
                        }
                        this.N = qv0VarArr[intValue];
                        while (i10 < qv0VarArr.length) {
                            qv0 qv0Var2 = qv0VarArr[i10];
                            if (qv0Var2 != null) {
                                if (i10 == intValue) {
                                    qv0Var2.d();
                                } else {
                                    qv0Var2.e();
                                }
                            }
                            i10++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            }
            this.N = null;
            klVar.setLeftDrawable((Drawable) null);
            klVar.g(null, null);
            while (i10 < qv0VarArr.length) {
                qv0 qv0Var3 = qv0VarArr[i10];
                if (qv0Var3 != null) {
                    qv0Var3.e();
                }
                i10++;
            }
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int L;
        float f7;
        int i10;
        org.telegram.ui.un unVar = this.G;
        if (unVar != null) {
            TLRPC.User j10 = unVar.j();
            TLRPC.Chat chat = unVar.e;
            if (unVar.f42248f4 == 3) {
                long V8 = unVar.V8();
                if (V8 >= 0) {
                    user = unVar.getMessagesController().Z1(Long.valueOf(V8));
                    chat = null;
                } else {
                    chat = unVar.getMessagesController().L0(Long.valueOf(-V8));
                    user = null;
                }
            } else {
                user = j10;
            }
            r8 r8Var = this.I;
            on onVar = this.e;
            if (user != null) {
                r8Var.r(user);
                if (org.telegram.messenger.h20.z(user)) {
                    r8Var.f29871p = 0.8f;
                    r8Var.g(12);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.j(null, null, r8Var, user);
                    }
                } else if (org.telegram.messenger.h20.s(user)) {
                    r8Var.f29871p = 0.8f;
                    r8Var.g(21);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.j(null, null, r8Var, user);
                    }
                } else if (org.telegram.messenger.h20.B(user) && unVar.f42248f4 == 3) {
                    r8Var.f29871p = 0.8f;
                    r8Var.g(22);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.j(null, null, r8Var, user);
                    }
                } else if (org.telegram.messenger.h20.B(user)) {
                    r8Var.f29871p = 0.8f;
                    r8Var.g(1);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.j(null, null, r8Var, user);
                    }
                } else {
                    r8Var.f29871p = 1.0f;
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.f26292a.j0(user, r8Var, null, true, 3, false);
                    }
                }
            } else if (org.telegram.messenger.w3.p0(chat)) {
                long b10 = unVar.b();
                int i11 = this.J;
                if (org.telegram.messenger.w3.A(i11, chat, 24) && b10 != 0) {
                    if (i10 > 0) {
                        TLRPC.User Z1 = unVar.getMessagesController().Z1(Long.valueOf(b10));
                        r8Var.r(Z1);
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.e(Z1, r8Var);
                    } else {
                        TLRPC.Chat L0 = unVar.getMessagesController().L0(Long.valueOf(-b10));
                        r8Var.q(L0);
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.e(L0, r8Var);
                    }
                } else {
                    onVar.setAnimatedEmojiDrawable(null);
                    gg.e.o(i11, chat, r8Var, onVar);
                }
                onVar.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
            } else if (chat != null) {
                r8Var.f29871p = 1.0f;
                r8Var.q(chat);
                if (onVar != null) {
                    onVar.setAnimatedEmojiDrawable(null);
                    onVar.e(chat, r8Var);
                    if (chat.forum) {
                        if (org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).O1().K(-chat.f19793id)) {
                            f7 = 11.0f;
                        } else {
                            f7 = 16.0f;
                        }
                        L = org.telegram.messenger.i0.L(f7);
                    } else {
                        L = org.telegram.messenger.i0.L(21.0f);
                    }
                    onVar.setRoundRadius(L);
                }
            }
        }
    }

    public final d5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        d5 d5Var = this.f30276g0;
        d5Var.j(j10, false);
        d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f30272d0)));
        int L = org.telegram.messenger.i0.L(1.0f);
        d5Var.I = 0;
        d5Var.J = L;
        return d5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T1) {
            int connectionState = ConnectionsManager.getInstance(this.J).getConnectionState();
            if (this.V != connectionState) {
                this.V = connectionState;
                l();
            }
        } else if (i10 == org.telegram.messenger.zs.f19630i4) {
            org.telegram.ui.kl klVar = this.h;
            if (klVar != null) {
                klVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i10 == org.telegram.messenger.zs.f19617g3) {
            n(true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f30277h0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f30280k0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.e) {
            boolean z11 = false;
            ImageView imageView = this.f30296x;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f30298y;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z11 = true;
            }
            if (z10 || z11) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-org.telegram.messenger.i0.L(3.0f), -org.telegram.messenger.i0.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (z10) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.i0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.i0.N(12.0f), org.telegram.ui.ActionBar.t6.Cm);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.i0.N(7.66f), org.telegram.ui.ActionBar.t6.Cm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sn.e(boolean, boolean):void");
    }

    public final void g(int i10, boolean z10) {
        f11 f11Var = this.F;
        if (f11Var != null) {
            boolean z11 = this.m0;
            if (i10 == 0 && !this.T) {
                return;
            }
            fe.b bVar = this.f30266a;
            if (!z11) {
                bVar.a(true, z10);
                f11Var.b(i10);
                return;
            }
            bVar.a(false, z10);
        }
    }

    public g9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.f30267a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public rt0 getSharedMediaPreloader() {
        return this.f30271c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.kl klVar = this.f30287r;
        if (klVar != null) {
            return klVar.getTextPaint();
        }
        return this.f30289s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.kl klVar = this.f30287r;
        if (klVar != null) {
            return klVar;
        }
        f6 f6Var = this.f30289s;
        if (f6Var != null) {
            return f6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f30296x;
    }

    public org.telegram.ui.ActionBar.u5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int L;
        float f7 = 0.0f;
        org.telegram.ui.kl klVar = this.h;
        if (klVar != null) {
            f7 = Math.max(0.0f, klVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.kl klVar2 = this.f30287r;
        if (klVar2 != null) {
            f7 = Math.max(f7, klVar2.getExactWidthIncludeDrawables());
        }
        on onVar = this.e;
        if (onVar != null && onVar.getVisibility() == 0) {
            L = org.telegram.messenger.i0.L(70.0f);
        } else {
            L = org.telegram.messenger.i0.L(34.0f);
        }
        return (int) (f7 + L);
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = org.telegram.messenger.k6.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.f30284o0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(2131232789).mutate();
                this.f30290s0 = mutate;
                int i10 = org.telegram.ui.ActionBar.t6.ni;
                org.telegram.ui.ActionBar.p6 p6Var = this.f30272d0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.a7.y(this, mutate, i10, p6Var, mode);
                Drawable mutate2 = getResources().getDrawable(2131232790).mutate();
                this.f30291t0 = mutate2;
                org.telegram.ui.ActionBar.a7.y(this, mutate2, org.telegram.ui.ActionBar.t6.oi, this.f30272d0, mode);
                this.h.j(new eq(this.f30290s0, this.f30291t0));
                this.f30283n0 = true;
                this.f30286q0 = org.telegram.messenger.cd.L0(2131754739, null);
            } else if (this.h.getRightDrawable() instanceof kl0) {
                this.h.j(null);
                this.f30283n0 = false;
                this.f30286q0 = null;
            }
        } else {
            this.f30284o0 = true;
            if (!(this.h.getRightDrawable() instanceof kl0)) {
                kl0 kl0Var = new kl0(!z10 ? 1 : 0);
                kl0Var.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, this.f30272d0));
                this.h.j(kl0Var);
                this.f30286q0 = org.telegram.messenger.cd.L0(2131745879, null);
                this.f30283n0 = true;
            }
        }
        if (!z13 && org.telegram.messenger.o5.f(emojiStatus) == 0) {
            this.h.i(null);
            this.f30285p0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof e5) && (((e5) this.h.getRightDrawable()).f25643a instanceof f5)) {
                ((f5) ((e5) this.h.getRightDrawable()).f25643a).n(this.h);
            }
            if (org.telegram.messenger.o5.f(emojiStatus) != 0) {
                this.f30275f0.j(org.telegram.messenger.o5.f(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = org.telegram.messenger.w0.f19025b.getDrawable(2131232306).mutate();
                this.f30288r0 = mutate3;
                org.telegram.ui.ActionBar.a7.y(this, mutate3, org.telegram.ui.ActionBar.t6.ni, this.f30272d0, PorterDuff.Mode.MULTIPLY);
                this.f30275f0.g(this.f30288r0, z14);
            } else {
                this.f30275f0.g(null, z14);
            }
            this.f30275f0.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f30272d0)));
            this.h.i(this.f30275f0);
            this.f30283n0 = false;
            this.f30285p0 = org.telegram.messenger.cd.L0(2131754802, null);
        }
        org.telegram.ui.ActionBar.l lVar = this.f30300z0;
        if (lVar != null) {
            lVar.h(z14);
        }
    }

    public final void i(int i10, int i11) {
        org.telegram.ui.kl klVar = this.h;
        org.telegram.ui.ActionBar.a7.r(klVar);
        org.telegram.ui.kl klVar2 = this.f30287r;
        org.telegram.ui.ActionBar.a7.r(klVar2);
        klVar.setTextColor(i10);
        klVar2.setTextColor(i11);
        klVar2.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.kl klVar = this.h;
        klVar.setLeftDrawable(drawable);
        if (!this.f30283n0 && !this.f30284o0) {
            if (drawable2 != null) {
                this.f30286q0 = org.telegram.messenger.cd.L0(2131747917, null);
            } else {
                this.f30286q0 = null;
            }
            klVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.l lVar = this.f30300z0;
        if (lVar != null) {
            lVar.h(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        r8 r8Var = this.I;
        r8Var.r(user);
        boolean z11 = org.telegram.messenger.h20.z(user);
        on onVar = this.e;
        if (z11) {
            r8Var.g(12);
            r8Var.f29871p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, r8Var, user);
            }
        } else if (org.telegram.messenger.h20.s(user)) {
            r8Var.g(21);
            r8Var.f29871p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, r8Var, user);
            }
        } else if (org.telegram.messenger.h20.B(user) && !z10) {
            r8Var.g(1);
            r8Var.f29871p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, r8Var, user);
            }
        } else {
            r8Var.f29871p = 1.0f;
            if (onVar != null) {
                onVar.e(user, r8Var);
            }
        }
    }

    public final void l() {
        String str;
        int i10 = this.V;
        if (i10 == 2) {
            str = org.telegram.messenger.cd.L0(2131743238, null);
        } else if (i10 == 1) {
            str = org.telegram.messenger.cd.L0(2131751809, null);
        } else if (i10 == 5) {
            str = org.telegram.messenger.cd.L0(2131743836, null);
        } else if (i10 == 4) {
            str = org.telegram.messenger.cd.L0(2131751807, null);
        } else {
            str = null;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.f30272d0;
        f6 f6Var = this.f30289s;
        org.telegram.ui.kl klVar = this.f30287r;
        if (str == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (klVar != null) {
                    klVar.k(charSequence);
                    this.W = null;
                    Integer num = this.f30269b0;
                    if (num != null) {
                        klVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.f30267a0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.a7.Y(klVar, i11, p6Var);
                            klVar.setTag(Integer.valueOf(this.f30267a0));
                        }
                    }
                } else if (f6Var != null) {
                    f6Var.c(charSequence, !org.telegram.messenger.cd.X, true);
                    this.W = null;
                    Integer num2 = this.f30269b0;
                    if (num2 != null) {
                        f6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.f30267a0;
                        if (i12 >= 0) {
                            org.telegram.ui.ActionBar.a7.Z(f6Var, i12, p6Var);
                            f6Var.setTag(Integer.valueOf(this.f30267a0));
                        }
                    }
                }
            }
        } else if (klVar != null) {
            if (this.W == null) {
                this.W = klVar.getText();
            }
            klVar.k(str);
            Integer num3 = this.f30269b0;
            if (num3 != null) {
                klVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.t6.B8;
                org.telegram.ui.ActionBar.a7.Y(klVar, i13, p6Var);
                klVar.setTag(Integer.valueOf(i13));
            }
        } else if (f6Var != null) {
            if (this.W == null) {
                this.W = f6Var.getText();
            }
            f6Var.c(str, !org.telegram.messenger.cd.X, true);
            Integer num4 = this.f30269b0;
            if (num4 != null) {
                f6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.t6.B8;
                org.telegram.ui.ActionBar.a7.Z(f6Var, i14, p6Var);
                f6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.f30300z0;
        if (lVar != null) {
            lVar.h(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.un unVar = this.G;
        if (unVar != null) {
            this.U = 0;
            TLRPC.ChatFull chatFull = unVar.f42374p8;
            if (chatFull != null) {
                int i10 = this.J;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (z10 && chatFull.participants_count > 200) {
                        this.U = chatFull.online_count;
                        return;
                    }
                    return;
                }
                for (int i11 = 0; i11 < chatFull.participants.participants.size(); i11++) {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(chatFull.participants.participants.get(i11).user_id));
                    if (Z1 != null && (userStatus = Z1.status) != null && ((userStatus.expires > currentTime || Z1.f19942id == org.telegram.messenger.d20.i(i10).e()) && Z1.status.expires > 10000)) {
                        this.U++;
                    }
                }
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean[] zArr;
        int i11;
        String G;
        TLRPC.ChatParticipants chatParticipants;
        int i12;
        String S;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList l4;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.p6 p6Var = this.f30272d0;
        boolean[] zArr2 = this.R;
        f6 f6Var = this.f30289s;
        org.telegram.ui.kl klVar = this.f30287r;
        org.telegram.ui.kl klVar2 = this.h;
        int i20 = this.J;
        org.telegram.ui.un unVar = this.G;
        if (unVar != null) {
            if (unVar.f42248f4 == 6) {
                String str = unVar.f42223d4.link;
                ag.s0[] s0VarArr = ag.s0.e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User j10 = unVar.j();
            TLRPC.Chat chat = unVar.e;
            if (org.telegram.messenger.h20.B(j10) && unVar.f42248f4 == 0 && unVar.getMessagesController().F1().c() >= 3 && (this.f30292u0 || org.telegram.messenger.vp.d1().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((org.telegram.messenger.h20.B(j10) && !z11) || org.telegram.messenger.h20.z(j10) || ((j10 != null && j10.f19942id == 489000) || ((i10 = unVar.f42248f4) != 0 && i10 != 8))) && unVar.f42248f4 != 3) {
                if (getSubtitleTextView().getVisibility() != 8) {
                    getSubtitleTextView().setVisibility(8);
                    return;
                }
                return;
            }
            if (z11) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    i19 = 0;
                    getSubtitleTextView().setVisibility(0);
                } else {
                    i19 = 0;
                }
                if (!this.f30292u0) {
                    org.telegram.messenger.vp.d1().edit().putInt("savedmsgschatshint", org.telegram.messenger.vp.d1().getInt("savedmsgschatshint", i19) + 1).apply();
                    this.f30292u0 = true;
                }
            }
            CharSequence C1 = org.telegram.messenger.vp.r1(i20).C1(unVar.a(), unVar.f42394r4, false);
            CharSequence charSequence = "";
            if (C1 != null) {
                C1 = TextUtils.replace(C1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z14 = z11;
            if (C1 != null && C1.length() != 0 && (!org.telegram.messenger.w3.T(chat) || chat.megagroup)) {
                if (unVar.T9() && klVar2.getTag() != null) {
                    klVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.Q;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.Q = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(klVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.Q.addListener(new rn(this, 1));
                        this.Q.setDuration(180L);
                        this.Q.start();
                    } else {
                        klVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer D1 = org.telegram.messenger.vp.r1(i20).D1(unVar.a(), unVar.f42394r4);
                if (D1 != null && D1.intValue() == 5) {
                    charSequence = org.telegram.messenger.k6.m(C1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = C1;
                }
                setTypingAnimation(true);
                z13 = true;
            } else if (unVar.T9() && !unVar.f42445v4) {
                if (klVar2.getTag() == null) {
                    klVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.Q;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.Q = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(klVar2, property2, org.telegram.messenger.i0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.Q.addListener(new rn(this, 0));
                        this.Q.setDuration(180L);
                        this.Q.start();
                        return;
                    }
                    klVar2.setTranslationY(org.telegram.messenger.i0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i21 = unVar.f42248f4;
                if (i21 == 8) {
                    if (unVar.f42271h4) {
                        charSequence = org.telegram.messenger.cd.L0(2131752219, null);
                        z13 = false;
                    } else {
                        if (unVar.b() == 0) {
                            org.telegram.messenger.x00 x00Var = unVar.getMessagesController().f18891r7;
                            long j11 = -unVar.a();
                            if (x00Var.e(j11) && (l4 = x00Var.l(j11)) != null) {
                                i17 = l4.size();
                            } else {
                                i17 = 0;
                            }
                            if (i17 > 0) {
                                G = org.telegram.messenger.cd.H(',', "Chats", i17);
                            } else {
                                G = org.telegram.messenger.cd.L0(2131752219, null);
                            }
                        } else {
                            TLRPC.TL_forumTopic f7 = org.telegram.messenger.vp.r1(i20).f18891r7.f(chat.f19793id, unVar.b());
                            if (f7 != null) {
                                i16 = f7.totalMessagesCount;
                            } else {
                                i16 = 0;
                            }
                            if (i16 > 0) {
                                G = org.telegram.messenger.cd.G(i16, "messages", Integer.valueOf(i16));
                            } else {
                                G = org.telegram.messenger.cd.a0(null, null, 2131744035, gg.e.i(i20, chat, false));
                            }
                        }
                        charSequence = G;
                        z13 = false;
                    }
                } else {
                    if (i21 == 3) {
                        org.telegram.messenger.gw F1 = unVar.getMessagesController().F1();
                        long V8 = unVar.V8();
                        ArrayList arrayList = F1.f15772j;
                        int i22 = 0;
                        while (true) {
                            if (i22 < arrayList.size()) {
                                org.telegram.messenger.fw fwVar = (org.telegram.messenger.fw) arrayList.get(i22);
                                if (fwVar.f15624a == V8) {
                                    i15 = fwVar.e;
                                    break;
                                }
                                i22++;
                            } else {
                                i15 = 0;
                                break;
                            }
                        }
                        charSequence = org.telegram.messenger.cd.G(Math.max(1, i15), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (unVar.f42445v4 && chat != null) {
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.vp.r1(i20).f18891r7.f(chat.f19793id, unVar.b());
                            if (f10 != null) {
                                i13 = 1;
                                i14 = f10.totalMessagesCount - 1;
                            } else {
                                i13 = 1;
                                i14 = 0;
                            }
                            if (i14 > 0) {
                                Object[] objArr = new Object[i13];
                                objArr[0] = Integer.valueOf(i14);
                                G = org.telegram.messenger.cd.G(i14, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i13];
                                objArr2[0] = chat.title;
                                G = org.telegram.messenger.cd.a0(null, null, 2131744035, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = unVar.f42374p8;
                            int i23 = this.U;
                            if (org.telegram.messenger.w3.T(chat)) {
                                if (chatFull != null && (i12 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i23 > 1) {
                                            G = a1.g.C(org.telegram.messenger.cd.G(i12, "Members", new Object[0]), ", ", org.telegram.messenger.cd.G(Math.min(i23, chatFull.participants_count), "OnlineCount", new Object[0]));
                                        } else {
                                            G = org.telegram.messenger.cd.G(i12, "Members", new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean C12 = org.telegram.messenger.i0.C1();
                                        int i24 = chatFull.participants_count;
                                        if (C12) {
                                            iArr[0] = i24;
                                            S = String.valueOf(i24);
                                        } else {
                                            S = org.telegram.messenger.cd.S(iArr, i24);
                                        }
                                        if (chat.megagroup) {
                                            G = org.telegram.messenger.cd.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        } else {
                                            G = org.telegram.messenger.cd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        }
                                    }
                                } else if (chat.megagroup) {
                                    if (chatFull == null) {
                                        G = org.telegram.messenger.cd.L0(2131748789, null).toLowerCase();
                                    } else if (chat.has_geo) {
                                        G = org.telegram.messenger.cd.L0(2131748657, null).toLowerCase();
                                    } else if (org.telegram.messenger.w3.t0(chat)) {
                                        G = org.telegram.messenger.cd.L0(2131748653, null).toLowerCase();
                                    } else {
                                        G = org.telegram.messenger.cd.L0(2131748656, null).toLowerCase();
                                    }
                                } else if (org.telegram.messenger.w3.t0(chat)) {
                                    G = org.telegram.messenger.cd.L0(2131752318, null).toLowerCase();
                                } else {
                                    G = org.telegram.messenger.cd.L0(2131752329, null).toLowerCase();
                                }
                            } else if (org.telegram.messenger.w3.k0(chat)) {
                                G = org.telegram.messenger.cd.L0(2131742854, null);
                            } else if (org.telegram.messenger.w3.l0(chat)) {
                                G = org.telegram.messenger.cd.L0(2131742860, null);
                            } else {
                                int i25 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i25 = chatParticipants.participants.size();
                                }
                                if (i23 > 1 && i25 != 0) {
                                    G = a1.g.C(org.telegram.messenger.cd.G(i25, "Members", new Object[0]), ", ", org.telegram.messenger.cd.G(i23, "OnlineCount", new Object[0]));
                                } else {
                                    G = org.telegram.messenger.cd.G(i25, "Members", new Object[0]);
                                }
                            }
                        } else {
                            if (j10 != null) {
                                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i20).Z1(Long.valueOf(j10.f19942id));
                                if (Z1 != null) {
                                    j10 = Z1;
                                }
                                if (!org.telegram.messenger.h20.z(j10)) {
                                    long j12 = j10.f19942id;
                                    if (j12 != 489000) {
                                        if (j12 == org.telegram.messenger.d20.i(i20).e()) {
                                            charSequence = z14 ? org.telegram.messenger.i0.G2(org.telegram.messenger.cd.L0(2131745909, null), false) : org.telegram.messenger.cd.L0(2131752189, null);
                                        } else {
                                            long j13 = j10.f19942id;
                                            if (j13 == 333000 || j13 == 777000 || j13 == 42777) {
                                                z12 = false;
                                                charSequence = org.telegram.messenger.cd.L0(2131745578, null);
                                            } else if (org.telegram.messenger.vp.E2(j10)) {
                                                charSequence = org.telegram.messenger.cd.L0(2131744351, null);
                                            } else {
                                                boolean z15 = j10.bot;
                                                if (z15 && (i11 = j10.bot_active_users) != 0) {
                                                    charSequence = org.telegram.messenger.cd.H(',', "BotUsers", i11);
                                                } else if (z15) {
                                                    charSequence = org.telegram.messenger.h20.d(j10);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f30273e0) {
                                                        zArr = this.S;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    charSequence = org.telegram.messenger.cd.d0(i20, j10, zArr2, zArr);
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
                i18 = org.telegram.ui.ActionBar.t6.f21155pa;
            } else {
                i18 = org.telegram.ui.ActionBar.t6.B8;
            }
            this.f30267a0 = i18;
            if (this.W == null) {
                if (klVar != null) {
                    klVar.k(charSequence);
                    Integer num = this.f30269b0;
                    if (num == null) {
                        org.telegram.ui.ActionBar.a7.Y(klVar, this.f30267a0, p6Var);
                        klVar.setTag(Integer.valueOf(this.f30267a0));
                    } else {
                        klVar.setTextColor(num.intValue());
                    }
                } else {
                    f6Var.c(charSequence, z10, true);
                    Integer num2 = this.f30269b0;
                    if (num2 == null) {
                        org.telegram.ui.ActionBar.a7.Z(f6Var, this.f30267a0, p6Var);
                        f6Var.setTag(Integer.valueOf(this.f30267a0));
                    } else {
                        f6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.W = charSequence;
            }
            org.telegram.ui.ActionBar.l lVar = this.f30300z0;
            if (lVar != null) {
                lVar.h(z10);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.un unVar = this.G;
        if (unVar != null) {
            int i10 = this.J;
            org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.T1);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
            if (unVar.f42248f4 == 3) {
                org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19617g3);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        d5 d5Var = this.f30275f0;
        if (d5Var != null) {
            d5Var.a();
        }
        d5 d5Var2 = this.f30276g0;
        if (d5Var2 != null) {
            d5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.un unVar = this.G;
        if (unVar != null) {
            int i10 = this.J;
            org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.T1);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
            if (unVar.f42248f4 == 3) {
                org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19617g3);
            }
        }
        d5 d5Var = this.f30275f0;
        if (d5Var != null) {
            d5Var.b();
        }
        d5 d5Var2 = this.f30276g0;
        if (d5Var2 != null) {
            d5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f30285p0 != null) {
            sb2.append(", ");
            sb2.append(this.f30285p0);
        }
        if (this.f30286q0 != null) {
            sb2.append(", ");
            sb2.append(this.f30286q0);
        }
        sb2.append("\n");
        org.telegram.ui.kl klVar = this.f30287r;
        if (klVar != null) {
            sb2.append(klVar.getText());
        } else {
            f6 f6Var = this.f30289s;
            if (f6Var != null) {
                sb2.append(f6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.cd.L0(2131747802, null)));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        on onVar = this.e;
        int measuredHeight = ((currentActionBarHeight - onVar.getMeasuredHeight()) - 2) / 2;
        if (this.K) {
            i14 = org.telegram.messenger.i0.f16020m;
        } else {
            i14 = 0;
        }
        int i15 = measuredHeight + i14;
        if (this.f30281l0) {
            f7 = 23.66f;
        } else {
            f7 = 24.0f;
        }
        int L = org.telegram.messenger.i0.L(f7) + i15;
        int i16 = this.L + 1;
        int i17 = i15 + 1;
        onVar.layout(i16, i17, onVar.getMeasuredWidth() + i16, onVar.getMeasuredHeight() + i17);
        int i18 = this.L;
        if (onVar.getVisibility() == 0) {
            if (this.f30281l0) {
                f10 = 49.66f;
            } else {
                f10 = 55.0f;
            }
        } else if (this.f30281l0) {
            f10 = 13.0f;
        } else {
            f10 = 1.0f;
        }
        int L2 = i18 + org.telegram.messenger.i0.L(f10) + this.M;
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) this.f30282n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.kl klVar = this.h;
        if (visibility != 8) {
            klVar.layout(L2, (org.telegram.messenger.i0.L(1.66f) + i15) - klVar.getPaddingTop(), klVar.getMeasuredWidth() + L2, klVar.getPaddingBottom() + ((org.telegram.messenger.i0.L(1.66f) + (klVar.getTextHeight() + i15)) - klVar.getPaddingTop()));
            if (u5Var != null) {
                u5Var.layout(L2, org.telegram.messenger.i0.L(1.66f) + i15, u5Var.getMeasuredWidth() + L2, org.telegram.messenger.i0.L(1.66f) + u5Var.getTextHeight() + i15);
            }
        } else {
            klVar.layout(L2, (org.telegram.messenger.i0.L(11.0f) + i15) - klVar.getPaddingTop(), klVar.getMeasuredWidth() + L2, klVar.getPaddingBottom() + ((org.telegram.messenger.i0.L(11.0f) + (klVar.getTextHeight() + i15)) - klVar.getPaddingTop()));
            if (u5Var != null) {
                u5Var.layout(L2, org.telegram.messenger.i0.L(10.0f) + i15, u5Var.getMeasuredWidth() + L2, org.telegram.messenger.i0.L(10.0f) + u5Var.getTextHeight() + i15);
            }
        }
        ImageView imageView = this.f30298y;
        if (imageView != null) {
            imageView.layout(org.telegram.messenger.i0.L(29.0f) + this.L, org.telegram.messenger.i0.L(27.33f) + i15, imageView.getMeasuredWidth() + org.telegram.messenger.i0.L(29.0f) + this.L, imageView.getMeasuredHeight() + org.telegram.messenger.i0.L(27.33f) + i15);
        }
        ImageView imageView2 = this.f30296x;
        if (imageView2 != null) {
            imageView2.layout(org.telegram.messenger.i0.L(19.333f) + this.L, i15 - org.telegram.messenger.i0.L(8.0f), imageView2.getMeasuredWidth() + org.telegram.messenger.i0.L(19.333f) + this.L, imageView2.getMeasuredHeight() + (i15 - org.telegram.messenger.i0.L(8.0f)));
        }
        ImageView imageView3 = this.D;
        if (imageView3 != null) {
            imageView3.layout(org.telegram.messenger.i0.L(28.0f) + this.L, org.telegram.messenger.i0.L(24.0f) + i15, imageView3.getMeasuredWidth() + org.telegram.messenger.i0.L(28.0f) + this.L, imageView3.getMeasuredHeight() + org.telegram.messenger.i0.L(24.0f) + i15);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(org.telegram.messenger.i0.L(28.0f) + this.L, org.telegram.messenger.i0.L(24.0f) + i15, imageView4.getMeasuredWidth() + org.telegram.messenger.i0.L(28.0f) + this.L, imageView4.getMeasuredHeight() + org.telegram.messenger.i0.L(24.0f) + i15);
        }
        org.telegram.ui.kl klVar2 = this.f30287r;
        if (klVar2 != null) {
            klVar2.layout(L2, L, klVar2.getMeasuredWidth() + L2, klVar2.getTextHeight() + L);
        } else {
            f6 f6Var = this.f30289s;
            if (f6Var != null) {
                f6Var.layout(L2, L, f6Var.getMeasuredWidth() + L2, f6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) this.f30294w.get();
        if (u5Var2 != null) {
            u5Var2.layout(L2, L, u5Var2.getMeasuredWidth() + L2, u5Var2.getTextHeight() + L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        on onVar = this.e;
        int i13 = 0;
        if (onVar.getVisibility() == 0) {
            i12 = 54;
        } else {
            i12 = 0;
        }
        int L = size - org.telegram.messenger.i0.L(i12 + 16);
        float f11 = this.d;
        onVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f11) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f11) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.kl klVar = this.h;
        klVar.measure(makeMeasureSpec, makeMeasureSpec2);
        f6 f6Var = this.f30289s;
        org.telegram.ui.kl klVar2 = this.f30287r;
        if (klVar2 != null) {
            klVar2.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), Integer.MIN_VALUE));
        } else if (f6Var != null) {
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f30298y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f30296x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(34.0f), 1073741824));
        }
        ImageView imageView3 = this.D;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i14 = this.O;
        AtomicReference atomicReference = this.f30282n;
        if (i14 != -1 && i14 != size && i14 > size) {
            this.P = i14;
            View view = (org.telegram.ui.ActionBar.u5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
            atomicReference.set(u5Var);
            int i15 = org.telegram.ui.ActionBar.t6.A8;
            org.telegram.ui.ActionBar.p6 p6Var = this.f30272d0;
            org.telegram.ui.ActionBar.a7.Y(u5Var, i15, p6Var);
            if (this.f30281l0) {
                f7 = 17.5f;
            } else {
                f7 = 18.0f;
            }
            u5Var.setTextSizePx(org.telegram.messenger.i0.L(f7));
            u5Var.setGravity(3);
            u5Var.setTypeface(org.telegram.messenger.i0.o());
            u5Var.setLeftDrawableTopPadding(-org.telegram.messenger.i0.L(1.3f));
            u5Var.i(klVar.getRightDrawable());
            u5Var.j(klVar.getRightDrawable2());
            u5Var.setRightDrawableOutside(klVar.getRightDrawableOutside());
            u5Var.setLeftDrawable(klVar.getLeftDrawable());
            u5Var.l(klVar.getText(), false);
            ViewPropertyAnimator duration = u5Var.animate().alpha(0.0f).setDuration(350L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new ln(this, 0)).start();
            addView(u5Var);
            AtomicReference atomicReference2 = this.f30294w;
            View view2 = (org.telegram.ui.ActionBar.u5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(getContext());
            atomicReference2.set(u5Var2);
            int i16 = org.telegram.ui.ActionBar.t6.B8;
            org.telegram.ui.ActionBar.a7.Y(u5Var2, i16, p6Var);
            u5Var2.setTag(Integer.valueOf(i16));
            if (this.f30281l0) {
                f10 = 13.5f;
            } else {
                f10 = 14.0f;
            }
            u5Var2.setTextSizePx(org.telegram.messenger.i0.L(f10));
            u5Var2.setGravity(3);
            if (klVar2 != null) {
                u5Var2.l(klVar2.getText(), false);
            } else if (f6Var != null) {
                u5Var2.l(f6Var.getText(), false);
            }
            u5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).withEndAction(new ln(this, 1)).start();
            addView(u5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.u5 u5Var3 = (org.telegram.ui.ActionBar.u5) atomicReference.get();
        if (u5Var3 != null) {
            int i17 = this.P;
            if (onVar.getVisibility() == 0) {
                i13 = 54;
            }
            u5Var3.measure(org.telegram.messenger.z20.c(i13 + 16, i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), Integer.MIN_VALUE));
        }
        this.O = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        dc dcVar = this.f30277h0;
        ln lnVar = this.f30278i0;
        if (action == 0 && a()) {
            this.f30279j0 = true;
            dcVar.c(true);
            org.telegram.messenger.i0.r(lnVar);
            org.telegram.messenger.i0.h3(lnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f30279j0) {
            dcVar.c(false);
            this.f30279j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            org.telegram.messenger.i0.r(lnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, this.f30272d0);
        if (this.f30293v0 == null || w02 != this.f30297x0) {
            this.f30297x0 = w02;
            this.f30293v0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.f30293v0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.f30300z0 = lVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f7;
        r8 r8Var = this.I;
        r8Var.q(chat);
        on onVar = this.e;
        if (onVar != null) {
            onVar.e(chat, r8Var);
            if (org.telegram.messenger.w3.c0(chat)) {
                if (chat != null && org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).O1().K(-chat.f19793id)) {
                    f7 = 11.0f;
                } else {
                    f7 = 16.0f;
                }
            } else {
                f7 = 21.0f;
            }
            onVar.setRoundRadius(org.telegram.messenger.i0.L(f7));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f30298y;
        if (imageView != null) {
            if (z10 && !this.f30274f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setLeftPadding(int i10) {
        this.L = i10;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.K = z10;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.f30269b0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f30277h0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.M = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f30270c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.kl klVar = this.f30287r;
            if (klVar != null) {
                klVar.k(charSequence);
            } else {
                f6 f6Var = this.f30289s;
                if (f6Var != null) {
                    f6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.l lVar = this.f30300z0;
        if (lVar != null) {
            lVar.h(true);
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
        qv0 qv0Var = this.N;
        org.telegram.ui.ActionBar.p6 p6Var = this.f30272d0;
        if (qv0Var != null) {
            qv0Var.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21155pa, p6Var));
        }
        Drawable drawable = this.f30288r0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        d5 d5Var = this.f30276g0;
        if (d5Var != null) {
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, p6Var)));
        }
        d5 d5Var2 = this.f30275f0;
        if (d5Var2 != null) {
            d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, p6Var)));
        }
        Drawable drawable2 = this.f30290s0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.f30291t0 != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.oi, p6Var);
            if (this.f30295w0 == null || w02 != this.f30299y0) {
                this.f30299y0 = w02;
                this.f30295w0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.f30291t0.setColorFilter(this.f30295w0);
        }
        org.telegram.ui.kl klVar = this.h;
        if (klVar != null) {
            try {
                if (klVar.getRightDrawable2() instanceof kl0) {
                    ((kl0) klVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, p6Var));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        invalidate();
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        ImageView imageView;
        int i11;
        if (i10 == 0 && (imageView = this.f30296x) != null) {
            imageView.setAlpha(f7);
            float f11 = 0.85f * f7;
            imageView.setScaleX(f11);
            imageView.setScaleY(f11);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void f() {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
