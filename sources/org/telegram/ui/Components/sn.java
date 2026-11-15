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
public class sn extends FrameLayout implements te.b, org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.k A0;
    public final ImageView E;
    public final ImageView F;
    public final c01 G;
    public final org.telegram.ui.an H;
    public final qu0[] I;
    public final t8 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public qu0 O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final te.a f39344a;
    public CharSequence f39345a0;
    public boolean f39346b;
    public int f39347b0;
    public Integer f39348c;
    public Integer f39349c0;
    public final int d;
    public final qs0 f39350d0;
    public final on f39351e;
    public final org.telegram.ui.ActionBar.e6 f39352e0;
    public final boolean f39353f;
    public boolean f39354f0;
    public final e5 f39355g0;
    public final org.telegram.ui.ok h;
    public final e5 f39356h0;
    public final dc f39357i0;
    public final ln f39358j0;
    public boolean f39359k0;
    public boolean f39360l0;
    public boolean m0;
    public final AtomicReference f39361n;
    public boolean f39362n0;
    public boolean f39363o0;
    public boolean f39364p0;
    public String f39365q0;
    public final org.telegram.ui.ok f39366r;
    public String f39367r0;
    public final h6 f39368s;
    public Drawable f39369s0;
    public Drawable f39370t0;
    public Drawable f39371u0;
    public boolean f39372v0;
    public final AtomicReference f39373w;
    public PorterDuffColorFilter f39374w0;
    public final ImageView f39375x;
    public PorterDuffColorFilter f39376x0;
    public final ImageView f39377y;
    public int f39378y0;
    public int f39379z0;

    public sn(android.content.Context r22, org.telegram.ui.ActionBar.e2 r23, boolean r24, org.telegram.ui.ActionBar.e6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sn.<init>(android.content.Context, org.telegram.ui.ActionBar.e2, boolean, org.telegram.ui.ActionBar.e6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.an anVar = this.H;
        org.telegram.ui.ok okVar = this.f39366r;
        if (okVar != null) {
            int i7 = 0;
            qu0[] qu0VarArr = this.I;
            if (z10) {
                try {
                    int intValue = org.telegram.messenger.np.s1(this.K).E1(anVar.a(), anVar.f45357s4).intValue();
                    qu0 qu0Var = qu0VarArr[intValue];
                    if (qu0Var != null) {
                        org.telegram.ui.ActionBar.e6 e6Var = this.f39352e0;
                        if (intValue == 5) {
                            okVar.g(qu0Var, "**oo**");
                            qu0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29073pa, e6Var));
                            okVar.setLeftDrawable((Drawable) null);
                        } else {
                            okVar.g(null, null);
                            qu0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29073pa, e6Var));
                            okVar.setLeftDrawable(qu0VarArr[intValue]);
                        }
                        this.O = qu0VarArr[intValue];
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
            this.O = null;
            okVar.setLeftDrawable((Drawable) null);
            okVar.g(null, null);
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
    public final void G(int i7, float f10, float f11, te.c cVar) {
        ImageView imageView;
        int i10;
        if (i7 == 0 && (imageView = this.f39375x) != null) {
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
        org.telegram.ui.an anVar = this.H;
        if (anVar != null) {
            TLRPC.User j3 = anVar.j();
            TLRPC.Chat chat = anVar.f45172e;
            if (anVar.f45203g4 == 3) {
                long e92 = anVar.e9();
                if (e92 >= 0) {
                    user = anVar.getMessagesController().a2(Long.valueOf(e92));
                    chat = null;
                } else {
                    chat = anVar.getMessagesController().M0(Long.valueOf(-e92));
                    user = null;
                }
            } else {
                user = j3;
            }
            t8 t8Var = this.J;
            on onVar = this.f39351e;
            if (user != null) {
                t8Var.r(user);
                if (org.telegram.messenger.q10.z(user)) {
                    t8Var.f39598p = 0.8f;
                    t8Var.g(12);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.j(null, null, t8Var, user);
                    }
                } else if (org.telegram.messenger.q10.s(user)) {
                    t8Var.f39598p = 0.8f;
                    t8Var.g(21);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.j(null, null, t8Var, user);
                    }
                } else if (org.telegram.messenger.q10.B(user) && anVar.f45203g4 == 3) {
                    t8Var.f39598p = 0.8f;
                    t8Var.g(22);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.j(null, null, t8Var, user);
                    }
                } else if (org.telegram.messenger.q10.B(user)) {
                    t8Var.f39598p = 0.8f;
                    t8Var.g(1);
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.j(null, null, t8Var, user);
                    }
                } else {
                    t8Var.f39598p = 1.0f;
                    if (onVar != null) {
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.f35499a.j0(user, t8Var, null, true, 3, false);
                    }
                }
            } else if (org.telegram.messenger.t3.p0(chat)) {
                long b10 = anVar.b();
                int i10 = this.K;
                if (org.telegram.messenger.t3.A(i10, chat, 24) && b10 != 0) {
                    if (i7 > 0) {
                        TLRPC.User a22 = anVar.getMessagesController().a2(Long.valueOf(b10));
                        t8Var.r(a22);
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.f(a22, t8Var);
                    } else {
                        TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-b10));
                        t8Var.q(M0);
                        onVar.setAnimatedEmojiDrawable(null);
                        onVar.f(M0, t8Var);
                    }
                } else {
                    onVar.setAnimatedEmojiDrawable(null);
                    qg.c.o(i10, chat, t8Var, onVar);
                }
                onVar.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
            } else if (chat != null) {
                t8Var.f39598p = 1.0f;
                t8Var.q(chat);
                if (onVar != null) {
                    onVar.setAnimatedEmojiDrawable(null);
                    onVar.f(chat, t8Var);
                    if (chat.forum) {
                        if (org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).P1().K(-chat.f28051id)) {
                            f10 = 11.0f;
                        } else {
                            f10 = 16.0f;
                        }
                        L = org.telegram.messenger.g0.L(f10);
                    } else {
                        L = org.telegram.messenger.g0.L(21.0f);
                    }
                    onVar.setRoundRadius(L);
                }
            }
        }
    }

    public final e5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        e5 e5Var = this.f39356h0;
        e5Var.j(j3, false);
        e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, this.f39352e0)));
        int L = org.telegram.messenger.g0.L(1.0f);
        e5Var.J = 0;
        e5Var.K = L;
        return e5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
            }
        } else if (i7 == org.telegram.messenger.ns.f25515i4) {
            org.telegram.ui.ok okVar = this.h;
            if (okVar != null) {
                okVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i7 == org.telegram.messenger.ns.f25502g3) {
            n(true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a10 = this.f39357i0.a(0.02f);
        canvas.scale(a10, a10, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f39360l0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        if (view == this.f39351e) {
            boolean z11 = false;
            ImageView imageView = this.f39375x;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f39377y;
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - org.telegram.messenger.g0.N(0.33f), imageView.getScaleX() * org.telegram.messenger.g0.N(12.0f), org.telegram.ui.ActionBar.j6.Fm);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * org.telegram.messenger.g0.N(7.66f), org.telegram.ui.ActionBar.j6.Fm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sn.e(boolean, boolean):void");
    }

    public final void g(int i7, boolean z10) {
        c01 c01Var = this.G;
        if (c01Var != null) {
            boolean z11 = this.f39362n0;
            if (i7 == 0 && !this.U) {
                return;
            }
            te.a aVar = this.f39344a;
            if (!z11) {
                aVar.a(true, z10);
                c01Var.b(i7);
                return;
            }
            aVar.a(false, z10);
        }
    }

    public i9 getAvatarImageView() {
        return this.f39351e;
    }

    public int getLastSubtitleColorKey() {
        return this.f39347b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public qs0 getSharedMediaPreloader() {
        return this.f39350d0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.ok okVar = this.f39366r;
        if (okVar != null) {
            return okVar.getTextPaint();
        }
        return this.f39368s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.ok okVar = this.f39366r;
        if (okVar != null) {
            return okVar;
        }
        h6 h6Var = this.f39368s;
        if (h6Var != null) {
            return h6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f39375x;
    }

    public org.telegram.ui.ActionBar.j5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int L;
        float f10 = 0.0f;
        org.telegram.ui.ok okVar = this.h;
        if (okVar != null) {
            f10 = Math.max(0.0f, okVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.ok okVar2 = this.f39366r;
        if (okVar2 != null) {
            f10 = Math.max(f10, okVar2.getExactWidthIncludeDrawables());
        }
        on onVar = this.f39351e;
        if (onVar != null && onVar.getVisibility() == 0) {
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
        this.f39364p0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(2131232792).mutate();
                this.f39370t0 = mutate;
                int i7 = org.telegram.ui.ActionBar.j6.f29100qi;
                org.telegram.ui.ActionBar.e6 e6Var = this.f39352e0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.q6.x(this, mutate, i7, e6Var, mode);
                Drawable mutate2 = getResources().getDrawable(2131232793).mutate();
                this.f39371u0 = mutate2;
                org.telegram.ui.ActionBar.q6.x(this, mutate2, org.telegram.ui.ActionBar.j6.f29120ri, this.f39352e0, mode);
                this.h.j(new fq(this.f39370t0, this.f39371u0));
                this.f39363o0 = true;
                this.f39367r0 = org.telegram.messenger.hd.M0(2131754739, null);
            } else if (this.h.getRightDrawable() instanceof lk0) {
                this.h.j(null);
                this.f39363o0 = false;
                this.f39367r0 = null;
            }
        } else {
            this.f39364p0 = true;
            if (!(this.h.getRightDrawable() instanceof lk0)) {
                lk0 lk0Var = new lk0(!z10 ? 1 : 0);
                lk0Var.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, this.f39352e0));
                this.h.j(lk0Var);
                this.f39367r0 = org.telegram.messenger.hd.M0(2131745862, null);
                this.f39363o0 = true;
            }
        }
        if (!z13 && org.telegram.messenger.m5.f(emojiStatus) == 0) {
            this.h.i(null);
            this.f39365q0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof f5) && (((f5) this.h.getRightDrawable()).f34519a instanceof g5)) {
                ((g5) ((f5) this.h.getRightDrawable()).f34519a).n(this.h);
            }
            if (org.telegram.messenger.m5.f(emojiStatus) != 0) {
                this.f39355g0.j(org.telegram.messenger.m5.f(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = org.telegram.messenger.t0.f26609b.getDrawable(2131232308).mutate();
                this.f39369s0 = mutate3;
                org.telegram.ui.ActionBar.q6.x(this, mutate3, org.telegram.ui.ActionBar.j6.f29100qi, this.f39352e0, PorterDuff.Mode.MULTIPLY);
                this.f39355g0.g(this.f39369s0, z14);
            } else {
                this.f39355g0.g(null, z14);
            }
            this.f39355g0.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, this.f39352e0)));
            this.h.i(this.f39355g0);
            this.f39363o0 = false;
            this.f39365q0 = org.telegram.messenger.hd.M0(2131754802, null);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(z14);
        }
    }

    public final void i(int i7, int i10) {
        org.telegram.ui.ok okVar = this.h;
        org.telegram.ui.ActionBar.q6.q(okVar);
        org.telegram.ui.ok okVar2 = this.f39366r;
        org.telegram.ui.ActionBar.q6.q(okVar2);
        okVar.setTextColor(i7);
        okVar2.setTextColor(i10);
        okVar2.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.ok okVar = this.h;
        okVar.setLeftDrawable(drawable);
        if (!this.f39363o0 && !this.f39364p0) {
            if (drawable2 != null) {
                this.f39367r0 = org.telegram.messenger.hd.M0(2131747901, null);
            } else {
                this.f39367r0 = null;
            }
            okVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.A0;
        if (kVar != null) {
            kVar.k(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        t8 t8Var = this.J;
        t8Var.r(user);
        boolean z11 = org.telegram.messenger.q10.z(user);
        on onVar = this.f39351e;
        if (z11) {
            t8Var.g(12);
            t8Var.f39598p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, t8Var, user);
            }
        } else if (org.telegram.messenger.q10.s(user)) {
            t8Var.g(21);
            t8Var.f39598p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, t8Var, user);
            }
        } else if (org.telegram.messenger.q10.B(user) && !z10) {
            t8Var.g(1);
            t8Var.f39598p = 0.8f;
            if (onVar != null) {
                onVar.j(null, null, t8Var, user);
            }
        } else {
            t8Var.f39598p = 1.0f;
            if (onVar != null) {
                onVar.f(user, t8Var);
            }
        }
    }

    public final void l() {
        String str;
        int i7 = this.W;
        if (i7 == 2) {
            str = org.telegram.messenger.hd.M0(2131743212, null);
        } else if (i7 == 1) {
            str = org.telegram.messenger.hd.M0(2131751809, null);
        } else if (i7 == 5) {
            str = org.telegram.messenger.hd.M0(2131743810, null);
        } else if (i7 == 4) {
            str = org.telegram.messenger.hd.M0(2131751807, null);
        } else {
            str = null;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f39352e0;
        h6 h6Var = this.f39368s;
        org.telegram.ui.ok okVar = this.f39366r;
        if (str == null) {
            CharSequence charSequence = this.f39345a0;
            if (charSequence != null) {
                if (okVar != null) {
                    okVar.k(charSequence);
                    this.f39345a0 = null;
                    Integer num = this.f39349c0;
                    if (num != null) {
                        okVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.f39347b0;
                        if (i10 >= 0) {
                            org.telegram.ui.ActionBar.q6.X(okVar, i10, e6Var);
                            okVar.setTag(Integer.valueOf(this.f39347b0));
                        }
                    }
                } else if (h6Var != null) {
                    h6Var.c(charSequence, !org.telegram.messenger.hd.f24104a0, true);
                    this.f39345a0 = null;
                    Integer num2 = this.f39349c0;
                    if (num2 != null) {
                        h6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.f39347b0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.q6.Y(h6Var, i11, e6Var);
                            h6Var.setTag(Integer.valueOf(this.f39347b0));
                        }
                    }
                }
            }
        } else if (okVar != null) {
            if (this.f39345a0 == null) {
                this.f39345a0 = okVar.getText();
            }
            okVar.k(str);
            Integer num3 = this.f39349c0;
            if (num3 != null) {
                okVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.j6.B8;
                org.telegram.ui.ActionBar.q6.X(okVar, i12, e6Var);
                okVar.setTag(Integer.valueOf(i12));
            }
        } else if (h6Var != null) {
            if (this.f39345a0 == null) {
                this.f39345a0 = h6Var.getText();
            }
            h6Var.c(str, !org.telegram.messenger.hd.f24104a0, true);
            Integer num4 = this.f39349c0;
            if (num4 != null) {
                h6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.B8;
                org.telegram.ui.ActionBar.q6.Y(h6Var, i13, e6Var);
                h6Var.setTag(Integer.valueOf(i13));
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
        org.telegram.ui.an anVar = this.H;
        if (anVar != null) {
            this.V = 0;
            TLRPC.ChatFull chatFull = anVar.f45333q8;
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
                    TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
                    if (a22 != null && (userStatus = a22.status) != null && ((userStatus.expires > currentTime || a22.f28200id == org.telegram.messenger.m10.i(i7).e()) && a22.status.expires > 10000)) {
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f39352e0;
        boolean[] zArr2 = this.S;
        h6 h6Var = this.f39368s;
        org.telegram.ui.ok okVar = this.f39366r;
        org.telegram.ui.ok okVar2 = this.h;
        int i19 = this.K;
        org.telegram.ui.an anVar = this.H;
        if (anVar != null) {
            if (anVar.f45203g4 == 6) {
                String str = anVar.f45177e4.link;
                kg.y[] yVarArr = kg.y.f18141e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User j3 = anVar.j();
            TLRPC.Chat chat = anVar.f45172e;
            if (org.telegram.messenger.q10.B(j3) && anVar.f45203g4 == 0 && anVar.getMessagesController().G1().c() >= 3 && (this.f39372v0 || org.telegram.messenger.np.e1().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((org.telegram.messenger.q10.B(j3) && !z11) || org.telegram.messenger.q10.z(j3) || ((j3 != null && j3.f28200id == 489000) || ((i7 = anVar.f45203g4) != 0 && i7 != 8))) && anVar.f45203g4 != 3) {
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
                if (!this.f39372v0) {
                    org.telegram.messenger.np.e1().edit().putInt("savedmsgschatshint", org.telegram.messenger.np.e1().getInt("savedmsgschatshint", i18) + 1).apply();
                    this.f39372v0 = true;
                }
            }
            CharSequence D1 = org.telegram.messenger.np.s1(i19).D1(anVar.a(), anVar.f45357s4, false);
            CharSequence charSequence = "";
            if (D1 != null) {
                D1 = TextUtils.replace(D1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z14 = z11;
            if (D1 != null && D1.length() != 0 && (!org.telegram.messenger.t3.T(chat) || chat.megagroup)) {
                if (anVar.fa() && okVar2.getTag() != null) {
                    okVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.R = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(okVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.R.addListener(new rn(this, 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        okVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer E1 = org.telegram.messenger.np.s1(i19).E1(anVar.a(), anVar.f45357s4);
                if (E1 != null && E1.intValue() == 5) {
                    charSequence = org.telegram.messenger.j6.m(D1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = D1;
                }
                setTypingAnimation(true);
                z13 = true;
            } else if (anVar.fa() && !anVar.f45407w4) {
                if (okVar2.getTag() == null) {
                    okVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.R;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.R = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.R = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(okVar2, property2, org.telegram.messenger.g0.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.R.addListener(new rn(this, 0));
                        this.R.setDuration(180L);
                        this.R.start();
                        return;
                    }
                    okVar2.setTranslationY(org.telegram.messenger.g0.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = anVar.f45203g4;
                if (i20 == 8) {
                    if (anVar.f45230i4) {
                        charSequence = org.telegram.messenger.hd.M0(2131752219, null);
                        z13 = false;
                    } else {
                        if (anVar.b() == 0) {
                            org.telegram.messenger.h00 h00Var = anVar.getMessagesController().f25386r7;
                            long j10 = -anVar.a();
                            if (h00Var.e(j10) && (l10 = h00Var.l(j10)) != null) {
                                i16 = l10.size();
                            } else {
                                i16 = 0;
                            }
                            if (i16 > 0) {
                                G = org.telegram.messenger.hd.H(',', "Chats", i16);
                            } else {
                                G = org.telegram.messenger.hd.M0(2131752219, null);
                            }
                        } else {
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.np.s1(i19).f25386r7.f(chat.f28051id, anVar.b());
                            if (f10 != null) {
                                i15 = f10.totalMessagesCount;
                            } else {
                                i15 = 0;
                            }
                            if (i15 > 0) {
                                G = org.telegram.messenger.hd.G(i15, "messages", Integer.valueOf(i15));
                            } else {
                                G = org.telegram.messenger.hd.a0(null, null, 2131744010, qg.c.i(i19, chat, false));
                            }
                        }
                        charSequence = G;
                        z13 = false;
                    }
                } else {
                    if (i20 == 3) {
                        org.telegram.messenger.tv G1 = anVar.getMessagesController().G1();
                        long e92 = anVar.e9();
                        ArrayList arrayList = G1.f26742j;
                        int i21 = 0;
                        while (true) {
                            if (i21 < arrayList.size()) {
                                org.telegram.messenger.sv svVar = (org.telegram.messenger.sv) arrayList.get(i21);
                                if (svVar.f26578a == e92) {
                                    i14 = svVar.f26581e;
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
                        if (anVar.f45407w4 && chat != null) {
                            TLRPC.TL_forumTopic f11 = org.telegram.messenger.np.s1(i19).f25386r7.f(chat.f28051id, anVar.b());
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
                                G = org.telegram.messenger.hd.a0(null, null, 2131744010, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = anVar.f45333q8;
                            int i22 = this.V;
                            if (org.telegram.messenger.t3.T(chat)) {
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
                                        G = org.telegram.messenger.hd.M0(2131748779, null).toLowerCase();
                                    } else if (chat.has_geo) {
                                        G = org.telegram.messenger.hd.M0(2131748642, null).toLowerCase();
                                    } else if (org.telegram.messenger.t3.t0(chat)) {
                                        G = org.telegram.messenger.hd.M0(2131748638, null).toLowerCase();
                                    } else {
                                        G = org.telegram.messenger.hd.M0(2131748641, null).toLowerCase();
                                    }
                                } else if (org.telegram.messenger.t3.t0(chat)) {
                                    G = org.telegram.messenger.hd.M0(2131752318, null).toLowerCase();
                                } else {
                                    G = org.telegram.messenger.hd.M0(2131752329, null).toLowerCase();
                                }
                            } else if (org.telegram.messenger.t3.k0(chat)) {
                                G = org.telegram.messenger.hd.M0(2131742829, null);
                            } else if (org.telegram.messenger.t3.l0(chat)) {
                                G = org.telegram.messenger.hd.M0(2131742835, null);
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
                                TLRPC.User a22 = org.telegram.messenger.np.s1(i19).a2(Long.valueOf(j3.f28200id));
                                if (a22 != null) {
                                    j3 = a22;
                                }
                                if (!org.telegram.messenger.q10.z(j3)) {
                                    long j11 = j3.f28200id;
                                    if (j11 != 489000) {
                                        if (j11 == org.telegram.messenger.m10.i(i19).e()) {
                                            charSequence = z14 ? org.telegram.messenger.g0.H2(org.telegram.messenger.hd.M0(2131745892, null), false) : org.telegram.messenger.hd.M0(2131752189, null);
                                        } else {
                                            long j12 = j3.f28200id;
                                            if (j12 == 333000 || j12 == 777000 || j12 == 42777) {
                                                z12 = false;
                                                charSequence = org.telegram.messenger.hd.M0(2131745561, null);
                                            } else if (org.telegram.messenger.np.F2(j3)) {
                                                charSequence = org.telegram.messenger.hd.M0(2131744325, null);
                                            } else {
                                                boolean z15 = j3.bot;
                                                if (z15 && (i10 = j3.bot_active_users) != 0) {
                                                    charSequence = org.telegram.messenger.hd.H(',', "BotUsers", i10);
                                                } else if (z15) {
                                                    charSequence = org.telegram.messenger.q10.d(j3);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f39354f0) {
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
                i17 = org.telegram.ui.ActionBar.j6.f29073pa;
            } else {
                i17 = org.telegram.ui.ActionBar.j6.B8;
            }
            this.f39347b0 = i17;
            if (this.f39345a0 == null) {
                if (okVar != null) {
                    okVar.k(charSequence);
                    Integer num = this.f39349c0;
                    if (num == null) {
                        org.telegram.ui.ActionBar.q6.X(okVar, this.f39347b0, e6Var);
                        okVar.setTag(Integer.valueOf(this.f39347b0));
                    } else {
                        okVar.setTextColor(num.intValue());
                    }
                } else {
                    h6Var.c(charSequence, z10, true);
                    Integer num2 = this.f39349c0;
                    if (num2 == null) {
                        org.telegram.ui.ActionBar.q6.Y(h6Var, this.f39347b0, e6Var);
                        h6Var.setTag(Integer.valueOf(this.f39347b0));
                    } else {
                        h6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.f39345a0 = charSequence;
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
        org.telegram.ui.an anVar = this.H;
        if (anVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.T1);
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25515i4);
            if (anVar.f45203g4 == 3) {
                org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.f25502g3);
            }
            this.W = ConnectionsManager.getInstance(i7).getConnectionState();
            l();
        }
        e5 e5Var = this.f39355g0;
        if (e5Var != null) {
            e5Var.a();
        }
        e5 e5Var2 = this.f39356h0;
        if (e5Var2 != null) {
            e5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.an anVar = this.H;
        if (anVar != null) {
            int i7 = this.K;
            org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.T1);
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25515i4);
            if (anVar.f45203g4 == 3) {
                org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25502g3);
            }
        }
        e5 e5Var = this.f39355g0;
        if (e5Var != null) {
            e5Var.b();
        }
        e5 e5Var2 = this.f39356h0;
        if (e5Var2 != null) {
            e5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f39365q0 != null) {
            sb2.append(", ");
            sb2.append(this.f39365q0);
        }
        if (this.f39367r0 != null) {
            sb2.append(", ");
            sb2.append(this.f39367r0);
        }
        sb2.append("\n");
        org.telegram.ui.ok okVar = this.f39366r;
        if (okVar != null) {
            sb2.append(okVar.getText());
        } else {
            h6 h6Var = this.f39368s;
            if (h6Var != null) {
                sb2.append(h6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(2131747786, null)));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        on onVar = this.f39351e;
        int measuredHeight = ((currentActionBarHeight - onVar.getMeasuredHeight()) - 2) / 2;
        if (this.L) {
            i13 = org.telegram.messenger.g0.f23605m;
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
        onVar.layout(i15, i16, onVar.getMeasuredWidth() + i15, onVar.getMeasuredHeight() + i16);
        int i17 = this.M;
        if (onVar.getVisibility() == 0) {
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
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f39361n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.ok okVar = this.h;
        if (visibility != 8) {
            okVar.layout(L2, (org.telegram.messenger.g0.L(1.66f) + i14) - okVar.getPaddingTop(), okVar.getMeasuredWidth() + L2, okVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.66f) + (okVar.getTextHeight() + i14)) - okVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(L2, org.telegram.messenger.g0.L(1.66f) + i14, j5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(1.66f) + j5Var.getTextHeight() + i14);
            }
        } else {
            okVar.layout(L2, (org.telegram.messenger.g0.L(11.0f) + i14) - okVar.getPaddingTop(), okVar.getMeasuredWidth() + L2, okVar.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (okVar.getTextHeight() + i14)) - okVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(L2, org.telegram.messenger.g0.L(10.0f) + i14, j5Var.getMeasuredWidth() + L2, org.telegram.messenger.g0.L(10.0f) + j5Var.getTextHeight() + i14);
            }
        }
        ImageView imageView = this.f39377y;
        if (imageView != null) {
            imageView.layout(org.telegram.messenger.g0.L(29.0f) + this.M, org.telegram.messenger.g0.L(27.33f) + i14, imageView.getMeasuredWidth() + org.telegram.messenger.g0.L(29.0f) + this.M, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(27.33f) + i14);
        }
        ImageView imageView2 = this.f39375x;
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
        org.telegram.ui.ok okVar2 = this.f39366r;
        if (okVar2 != null) {
            okVar2.layout(L2, L, okVar2.getMeasuredWidth() + L2, okVar2.getTextHeight() + L);
        } else {
            h6 h6Var = this.f39368s;
            if (h6Var != null) {
                h6Var.layout(L2, L, h6Var.getMeasuredWidth() + L2, h6Var.getTextHeight() + L);
            }
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) this.f39373w.get();
        if (j5Var2 != null) {
            j5Var2.layout(L2, L, j5Var2.getMeasuredWidth() + L2, j5Var2.getTextHeight() + L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i7);
        on onVar = this.f39351e;
        int i12 = 0;
        if (onVar.getVisibility() == 0) {
            i11 = 54;
        } else {
            i11 = 0;
        }
        int L = size - org.telegram.messenger.g0.L(i11 + 16);
        float f12 = this.d;
        onVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f12) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.ok okVar = this.h;
        okVar.measure(makeMeasureSpec, makeMeasureSpec2);
        h6 h6Var = this.f39368s;
        org.telegram.ui.ok okVar2 = this.f39366r;
        if (okVar2 != null) {
            okVar2.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        } else if (h6Var != null) {
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f39377y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f39375x;
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
        AtomicReference atomicReference = this.f39361n;
        if (i13 != -1 && i13 != size && i13 > size) {
            this.Q = i13;
            View view = (org.telegram.ui.ActionBar.j5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference.set(j5Var);
            int i14 = org.telegram.ui.ActionBar.j6.A8;
            org.telegram.ui.ActionBar.e6 e6Var = this.f39352e0;
            org.telegram.ui.ActionBar.q6.X(j5Var, i14, e6Var);
            if (this.m0) {
                f10 = 17.5f;
            } else {
                f10 = 18.0f;
            }
            j5Var.setTextSizePx(org.telegram.messenger.g0.L(f10));
            j5Var.setGravity(3);
            j5Var.setTypeface(org.telegram.messenger.g0.o());
            j5Var.setLeftDrawableTopPadding(-org.telegram.messenger.g0.L(1.3f));
            j5Var.i(okVar.getRightDrawable());
            j5Var.j(okVar.getRightDrawable2());
            j5Var.setRightDrawableOutside(okVar.getRightDrawableOutside());
            j5Var.setLeftDrawable(okVar.getLeftDrawable());
            j5Var.l(okVar.getText(), false);
            ViewPropertyAnimator duration = j5Var.animate().alpha(0.0f).setDuration(350L);
            er erVar = er.h;
            duration.setInterpolator(erVar).withEndAction(new ln(this, 0)).start();
            addView(j5Var);
            AtomicReference atomicReference2 = this.f39373w;
            View view2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference2.set(j5Var2);
            int i15 = org.telegram.ui.ActionBar.j6.B8;
            org.telegram.ui.ActionBar.q6.X(j5Var2, i15, e6Var);
            j5Var2.setTag(Integer.valueOf(i15));
            if (this.m0) {
                f11 = 13.5f;
            } else {
                f11 = 14.0f;
            }
            j5Var2.setTextSizePx(org.telegram.messenger.g0.L(f11));
            j5Var2.setGravity(3);
            if (okVar2 != null) {
                j5Var2.l(okVar2.getText(), false);
            } else if (h6Var != null) {
                j5Var2.l(h6Var.getText(), false);
            }
            j5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).withEndAction(new ln(this, 1)).start();
            addView(j5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.j5 j5Var3 = (org.telegram.ui.ActionBar.j5) atomicReference.get();
        if (j5Var3 != null) {
            int i16 = this.Q;
            if (onVar.getVisibility() == 0) {
                i12 = 54;
            }
            j5Var3.measure(org.telegram.messenger.i20.c(i12 + 16, i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
        }
        this.P = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        dc dcVar = this.f39357i0;
        ln lnVar = this.f39358j0;
        if (action == 0 && a()) {
            this.f39359k0 = true;
            dcVar.c(true);
            org.telegram.messenger.g0.r(lnVar);
            org.telegram.messenger.g0.i3(lnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f39359k0) {
            dcVar.c(false);
            this.f39359k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            org.telegram.messenger.g0.r(lnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, this.f39352e0);
        if (this.f39374w0 == null || w02 != this.f39378y0) {
            this.f39378y0 = w02;
            this.f39374w0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.f39374w0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.A0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f10;
        t8 t8Var = this.J;
        t8Var.q(chat);
        on onVar = this.f39351e;
        if (onVar != null) {
            onVar.f(chat, t8Var);
            if (org.telegram.messenger.t3.c0(chat)) {
                if (chat != null && org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).P1().K(-chat.f28051id)) {
                    f10 = 11.0f;
                } else {
                    f10 = 16.0f;
                }
            } else {
                f10 = 21.0f;
            }
            onVar.setRoundRadius(org.telegram.messenger.g0.L(f10));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i7;
        ImageView imageView = this.f39377y;
        if (imageView != null) {
            if (z10 && !this.f39353f) {
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
        this.f39349c0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f39357i0.c(z10);
    }

    public void setRightAvatarPadding(int i7) {
        this.N = i7;
    }

    public void setStoriesForceState(Integer num) {
        this.f39348c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.f39345a0 == null) {
            org.telegram.ui.ok okVar = this.f39366r;
            if (okVar != null) {
                okVar.k(charSequence);
            } else {
                h6 h6Var = this.f39368s;
                if (h6Var != null) {
                    h6Var.setText(charSequence);
                }
            }
        } else {
            this.f39345a0 = charSequence;
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
        qu0 qu0Var = this.O;
        org.telegram.ui.ActionBar.e6 e6Var = this.f39352e0;
        if (qu0Var != null) {
            qu0Var.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29073pa, e6Var));
        }
        Drawable drawable = this.f39369s0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        e5 e5Var = this.f39356h0;
        if (e5Var != null) {
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, e6Var)));
        }
        e5 e5Var2 = this.f39355g0;
        if (e5Var2 != null) {
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, e6Var)));
        }
        Drawable drawable2 = this.f39370t0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.f39371u0 != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29120ri, e6Var);
            if (this.f39376x0 == null || w02 != this.f39379z0) {
                this.f39379z0 = w02;
                this.f39376x0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.f39371u0.setColorFilter(this.f39376x0);
        }
        org.telegram.ui.ok okVar = this.h;
        if (okVar != null) {
            try {
                if (okVar.getRightDrawable2() instanceof lk0) {
                    ((lk0) okVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, e6Var));
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
    public final void E(float f10, int i7) {
    }
}
