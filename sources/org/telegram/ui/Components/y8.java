package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class y8 {
    public float A;
    public boolean B;
    public boolean f40602a;
    public boolean d;
    public ValueAnimator f40606f;
    public boolean f40607g;
    public Runnable f40609j;
    public int f40610k;
    public boolean f40611l;
    public final boolean f40612m;
    public int f40613n;
    public int f40614o;
    public int f40615p;
    public final View f40617r;
    public int f40618s;
    public boolean f40621w;
    public boolean f40622x;
    public di.z6 f40623y;
    public final Random f40624z;
    public final x8[] f40603b = new x8[3];
    public final x8[] f40604c = new x8[3];
    public float f40605e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f40608i = new Paint(1);
    public int f40616q = org.telegram.messenger.g0.L(1.67f);
    public float f40619t = 0.8f;
    public float f40620u = 1.0f;
    public long v = 220;

    public y8(View view, boolean z9) {
        xq xqVar = xq.f40366f;
        this.f40624z = new Random();
        this.f40617r = view;
        for (int i7 = 0; i7 < 3; i7++) {
            x8[] x8VarArr = this.f40603b;
            ?? obj = new Object();
            x8VarArr[i7] = obj;
            obj.f40259e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.f40603b[i7].f40259e;
            imageReceiver.J0 = true;
            imageReceiver.J0(org.telegram.messenger.g0.L(12.0f));
            this.f40603b[i7].f40256a = new w8((org.telegram.ui.ActionBar.f6) null);
            this.f40603b[i7].f40256a.u(org.telegram.messenger.g0.L(12.0f));
            x8[] x8VarArr2 = this.f40604c;
            ?? obj2 = new Object();
            x8VarArr2[i7] = obj2;
            obj2.f40259e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.f40604c[i7].f40259e;
            imageReceiver2.J0 = true;
            imageReceiver2.J0(org.telegram.messenger.g0.L(12.0f));
            this.f40604c[i7].f40256a = new w8((org.telegram.ui.ActionBar.f6) null);
            this.f40604c[i7].f40256a.u(org.telegram.messenger.g0.L(12.0f));
        }
        this.f40612m = z9;
        this.f40608i.setColor(0);
        this.f40608i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z9, boolean z10) {
        x8[] x8VarArr;
        x8[] x8VarArr2;
        if (this.d && z9) {
            x8[] x8VarArr3 = new x8[3];
            int i7 = 0;
            boolean z11 = false;
            while (true) {
                x8VarArr = this.f40603b;
                x8VarArr2 = this.f40604c;
                if (i7 >= 3) {
                    break;
                }
                x8VarArr3[i7] = x8VarArr[i7];
                x8 x8Var = x8VarArr[i7];
                long j3 = x8Var.f40261g;
                x8 x8Var2 = x8VarArr2[i7];
                if (j3 != x8Var2.f40261g) {
                    z11 = true;
                } else {
                    x8Var.d = x8Var2.d;
                }
                i7++;
            }
            if (!z11) {
                this.f40605e = 1.0f;
                return;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = 0;
                while (true) {
                    if (i11 < 3) {
                        if (x8VarArr[i11].f40261g == x8VarArr2[i10].f40261g) {
                            x8VarArr3[i11] = null;
                            if (i10 == i11) {
                                x8 x8Var3 = x8VarArr2[i10];
                                x8Var3.f40262i = -1;
                                org.telegram.ui.Cells.e4 e4Var = x8Var3.f40257b;
                                x8 x8Var4 = x8VarArr[i10];
                                x8Var3.f40257b = x8Var4.f40257b;
                                x8Var4.f40257b = e4Var;
                            } else {
                                x8 x8Var5 = x8VarArr2[i10];
                                x8Var5.f40262i = 2;
                                x8Var5.f40263j = i11;
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        x8VarArr2[i10].f40262i = 0;
                        break;
                    }
                }
            }
            for (int i12 = 0; i12 < 3; i12++) {
                x8 x8Var6 = x8VarArr3[i12];
                if (x8Var6 != null) {
                    x8Var6.f40262i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f40606f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f40606f.cancel();
                if (this.f40621w) {
                    k();
                    this.f40621w = false;
                }
            }
            this.f40605e = 0.0f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f40606f = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 4));
                this.f40606f.addListener(new z5(this, 5));
                this.f40606f.setDuration(this.v);
                this.f40606f.setInterpolator(xq.f40366f);
                this.f40606f.start();
            } else {
                this.f40621w = true;
            }
            d();
            return;
        }
        this.f40605e = 1.0f;
        k();
    }

    public final int b() {
        float f10;
        int i7 = this.f40618s;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f40610k;
        if (i10 != 4 && i10 != 10) {
            f10 = 24.0f;
        } else {
            f10 = 32.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final float c() {
        boolean z9;
        float f10;
        int L;
        int i7 = this.f40610k;
        int i10 = 0;
        if (i7 != 4 && i7 != 10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (i7 == 11) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            int i11 = this.f40618s;
            if (i11 != 0) {
                L = (int) (i11 * this.f40619t);
            } else {
                if (z9) {
                    f10 = 24.0f;
                } else {
                    f10 = 20.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (this.f40603b[i13].f40261g != 0) {
                i12++;
            }
        }
        int max = Math.max(0, i12 - 1) * L;
        if (i12 > 0) {
            i10 = b();
        }
        return max + i10;
    }

    public final void d() {
        View view = this.f40617r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (!this.B) {
            this.B = true;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f40603b[i7].f40259e.P();
                this.f40604c[i7].f40259e.P();
            }
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f40603b[i7].f40259e.R();
                this.f40604c[i7].f40259e.R();
            }
            if (this.f40610k == 3) {
                org.telegram.ui.ActionBar.k6.G0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y8.g(android.graphics.Canvas):void");
    }

    public final void h(int i7) {
        w8 w8Var;
        w8 w8Var2;
        for (int i10 = 0; i10 < 3; i10++) {
            x8 x8Var = this.f40603b[i10];
            if (x8Var != null && (w8Var2 = x8Var.f40256a) != null) {
                w8Var2.u(i7);
            }
            x8 x8Var2 = this.f40604c[i10];
            if (x8Var2 != null && (w8Var = x8Var2.f40256a) != null) {
                w8Var.u(i7);
            }
        }
    }

    public final void i(int i7) {
        this.f40613n = i7;
        View view = this.f40617r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i7, int i10, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        x8[] x8VarArr = this.f40604c;
        x8 x8Var = x8VarArr[i7];
        x8Var.f40261g = 0L;
        x8Var.f40260f = null;
        if (tLObject == null) {
            x8Var.f40259e.w0(null);
            d();
            return;
        }
        x8Var.d = -1L;
        x8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            x8Var.f40260f = groupCallParticipant;
            long C1 = org.telegram.messenger.ij.C1(groupCallParticipant.peer);
            if (org.telegram.messenger.m5.E(C1)) {
                user = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(C1));
                x8VarArr[i7].f40256a.r(user);
                chat = null;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-C1));
                x8VarArr[i7].f40256a.q(M0);
                chat = M0;
                user = null;
            }
            if (this.f40610k == 4) {
                if (C1 == org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i10).f21765a).e()) {
                    x8VarArr[i7].d = 0L;
                } else if (this.f40612m) {
                    x8VarArr[i7].d = groupCallParticipant.lastActiveDate;
                } else {
                    x8VarArr[i7].d = groupCallParticipant.active_date;
                }
            } else {
                x8VarArr[i7].d = groupCallParticipant.active_date;
            }
            x8VarArr[i7].f40261g = C1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f40602a) {
                x8Var.f40256a.g(1);
                x8VarArr[i7].f40256a.f39870p = 0.6f;
            } else {
                x8Var.f40256a.g(0);
                w8 w8Var = x8VarArr[i7].f40256a;
                w8Var.f39870p = 1.0f;
                w8Var.r(user2);
            }
            x8VarArr[i7].f40261g = user2.f27105id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            x8Var.f40256a.g(0);
            w8 w8Var2 = x8VarArr[i7].f40256a;
            w8Var2.f39870p = 1.0f;
            w8Var2.q(chat);
            x8VarArr[i7].f40261g = -chat.f26956id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            x8VarArr[i7].f40261g = storyItem.f27195id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 50, true, null, false);
                x8VarArr[i7].f40259e.r0(org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(storyItem.media.document.thumbs, 50, true, w10, true), storyItem.media.document), com.google.android.recaptcha.internal.a.j(b10, "_", b10), org.telegram.messenger.hc.c(w10, storyItem.media.document), com.google.android.recaptcha.internal.a.j(b10, "_", b10), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 50, true, null, false);
                    x8VarArr[i7].f40259e.r0(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(storyItem.media.photo.sizes, 50, true, w11, true), storyItem.media.photo), com.google.android.recaptcha.internal.a.j(b10, "_", b10), org.telegram.messenger.hc.i(w11, storyItem.media.photo), com.google.android.recaptcha.internal.a.j(b10, "_", b10), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f40602a) {
                x8 x8Var2 = x8VarArr[i7];
                x8Var2.f40259e.w0(x8Var2.f40256a);
            } else {
                x8 x8Var3 = x8VarArr[i7];
                x8Var3.f40259e.i0(user, x8Var3.f40256a, null);
            }
        } else {
            x8 x8Var4 = x8VarArr[i7];
            x8Var4.f40259e.i0(chat, x8Var4.f40256a, null);
        }
        x8VarArr[i7].f40259e.J0(b10 / 2);
        float f10 = b10;
        x8VarArr[i7].f40259e.y0(0.0f, 0.0f, f10, f10);
        d();
    }

    public final void k() {
        for (int i7 = 0; i7 < 3; i7++) {
            x8[] x8VarArr = this.f40603b;
            x8 x8Var = x8VarArr[i7];
            x8[] x8VarArr2 = this.f40604c;
            x8VarArr[i7] = x8VarArr2[i7];
            x8VarArr2[i7] = x8Var;
        }
    }
}
