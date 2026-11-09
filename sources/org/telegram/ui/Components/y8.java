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
    public boolean f40644a;
    public boolean d;
    public ValueAnimator f40648f;
    public boolean f40649g;
    public Runnable f40651j;
    public int f40652k;
    public boolean f40653l;
    public final boolean f40654m;
    public int f40655n;
    public int f40656o;
    public int f40657p;
    public final View f40659r;
    public int f40660s;
    public boolean f40663w;
    public boolean f40664x;
    public di.a7 f40665y;
    public final Random f40666z;
    public final x8[] f40645b = new x8[3];
    public final x8[] f40646c = new x8[3];
    public float f40647e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f40650i = new Paint(1);
    public int f40658q = org.telegram.messenger.g0.L(1.67f);
    public float f40661t = 0.8f;
    public float f40662u = 1.0f;
    public long v = 220;

    public y8(View view, boolean z9) {
        xq xqVar = xq.f40458f;
        this.f40666z = new Random();
        this.f40659r = view;
        for (int i7 = 0; i7 < 3; i7++) {
            x8[] x8VarArr = this.f40645b;
            ?? obj = new Object();
            x8VarArr[i7] = obj;
            obj.f40339e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.f40645b[i7].f40339e;
            imageReceiver.J0 = true;
            imageReceiver.J0(org.telegram.messenger.g0.L(12.0f));
            this.f40645b[i7].f40336a = new w8((org.telegram.ui.ActionBar.g6) null);
            this.f40645b[i7].f40336a.u(org.telegram.messenger.g0.L(12.0f));
            x8[] x8VarArr2 = this.f40646c;
            ?? obj2 = new Object();
            x8VarArr2[i7] = obj2;
            obj2.f40339e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.f40646c[i7].f40339e;
            imageReceiver2.J0 = true;
            imageReceiver2.J0(org.telegram.messenger.g0.L(12.0f));
            this.f40646c[i7].f40336a = new w8((org.telegram.ui.ActionBar.g6) null);
            this.f40646c[i7].f40336a.u(org.telegram.messenger.g0.L(12.0f));
        }
        this.f40654m = z9;
        this.f40650i.setColor(0);
        this.f40650i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z9, boolean z10) {
        x8[] x8VarArr;
        x8[] x8VarArr2;
        if (this.d && z9) {
            x8[] x8VarArr3 = new x8[3];
            int i7 = 0;
            boolean z11 = false;
            while (true) {
                x8VarArr = this.f40645b;
                x8VarArr2 = this.f40646c;
                if (i7 >= 3) {
                    break;
                }
                x8VarArr3[i7] = x8VarArr[i7];
                x8 x8Var = x8VarArr[i7];
                long j3 = x8Var.f40341g;
                x8 x8Var2 = x8VarArr2[i7];
                if (j3 != x8Var2.f40341g) {
                    z11 = true;
                } else {
                    x8Var.d = x8Var2.d;
                }
                i7++;
            }
            if (!z11) {
                this.f40647e = 1.0f;
                return;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = 0;
                while (true) {
                    if (i11 < 3) {
                        if (x8VarArr[i11].f40341g == x8VarArr2[i10].f40341g) {
                            x8VarArr3[i11] = null;
                            if (i10 == i11) {
                                x8 x8Var3 = x8VarArr2[i10];
                                x8Var3.f40342i = -1;
                                org.telegram.ui.Cells.e4 e4Var = x8Var3.f40337b;
                                x8 x8Var4 = x8VarArr[i10];
                                x8Var3.f40337b = x8Var4.f40337b;
                                x8Var4.f40337b = e4Var;
                            } else {
                                x8 x8Var5 = x8VarArr2[i10];
                                x8Var5.f40342i = 2;
                                x8Var5.f40343j = i11;
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        x8VarArr2[i10].f40342i = 0;
                        break;
                    }
                }
            }
            for (int i12 = 0; i12 < 3; i12++) {
                x8 x8Var6 = x8VarArr3[i12];
                if (x8Var6 != null) {
                    x8Var6.f40342i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f40648f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f40648f.cancel();
                if (this.f40663w) {
                    k();
                    this.f40663w = false;
                }
            }
            this.f40647e = 0.0f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f40648f = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 4));
                this.f40648f.addListener(new z5(this, 5));
                this.f40648f.setDuration(this.v);
                this.f40648f.setInterpolator(xq.f40458f);
                this.f40648f.start();
            } else {
                this.f40663w = true;
            }
            d();
            return;
        }
        this.f40647e = 1.0f;
        k();
    }

    public final int b() {
        float f10;
        int i7 = this.f40660s;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f40652k;
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
        int i7 = this.f40652k;
        int i10 = 0;
        if (i7 != 4 && i7 != 10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (i7 == 11) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            int i11 = this.f40660s;
            if (i11 != 0) {
                L = (int) (i11 * this.f40661t);
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
            if (this.f40645b[i13].f40341g != 0) {
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
        View view = this.f40659r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (!this.B) {
            this.B = true;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f40645b[i7].f40339e.P();
                this.f40646c[i7].f40339e.P();
            }
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f40645b[i7].f40339e.R();
                this.f40646c[i7].f40339e.R();
            }
            if (this.f40652k == 3) {
                org.telegram.ui.ActionBar.l6.G0().a(0.0f);
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
            x8 x8Var = this.f40645b[i10];
            if (x8Var != null && (w8Var2 = x8Var.f40336a) != null) {
                w8Var2.u(i7);
            }
            x8 x8Var2 = this.f40646c[i10];
            if (x8Var2 != null && (w8Var = x8Var2.f40336a) != null) {
                w8Var.u(i7);
            }
        }
    }

    public final void i(int i7) {
        this.f40655n = i7;
        View view = this.f40659r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i7, int i10, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        x8[] x8VarArr = this.f40646c;
        x8 x8Var = x8VarArr[i7];
        x8Var.f40341g = 0L;
        x8Var.f40340f = null;
        if (tLObject == null) {
            x8Var.f40339e.w0(null);
            d();
            return;
        }
        x8Var.d = -1L;
        x8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            x8Var.f40340f = groupCallParticipant;
            long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
            if (org.telegram.messenger.m5.E(B1)) {
                user = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(B1));
                x8VarArr[i7].f40336a.r(user);
                chat = null;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-B1));
                x8VarArr[i7].f40336a.q(M0);
                chat = M0;
                user = null;
            }
            if (this.f40652k == 4) {
                if (B1 == org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i10).f21765a).e()) {
                    x8VarArr[i7].d = 0L;
                } else if (this.f40654m) {
                    x8VarArr[i7].d = groupCallParticipant.lastActiveDate;
                } else {
                    x8VarArr[i7].d = groupCallParticipant.active_date;
                }
            } else {
                x8VarArr[i7].d = groupCallParticipant.active_date;
            }
            x8VarArr[i7].f40341g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f40644a) {
                x8Var.f40336a.g(1);
                x8VarArr[i7].f40336a.f39982p = 0.6f;
            } else {
                x8Var.f40336a.g(0);
                w8 w8Var = x8VarArr[i7].f40336a;
                w8Var.f39982p = 1.0f;
                w8Var.r(user2);
            }
            x8VarArr[i7].f40341g = user2.f27105id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            x8Var.f40336a.g(0);
            w8 w8Var2 = x8VarArr[i7].f40336a;
            w8Var2.f39982p = 1.0f;
            w8Var2.q(chat);
            x8VarArr[i7].f40341g = -chat.f26956id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            x8VarArr[i7].f40341g = storyItem.f27195id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 50, true, null, false);
                x8VarArr[i7].f40339e.r0(org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(storyItem.media.document.thumbs, 50, true, w10, true), storyItem.media.document), com.google.android.recaptcha.internal.a.j(b10, "_", b10), org.telegram.messenger.hc.c(w10, storyItem.media.document), com.google.android.recaptcha.internal.a.j(b10, "_", b10), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 50, true, null, false);
                    x8VarArr[i7].f40339e.r0(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(storyItem.media.photo.sizes, 50, true, w11, true), storyItem.media.photo), com.google.android.recaptcha.internal.a.j(b10, "_", b10), org.telegram.messenger.hc.i(w11, storyItem.media.photo), com.google.android.recaptcha.internal.a.j(b10, "_", b10), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f40644a) {
                x8 x8Var2 = x8VarArr[i7];
                x8Var2.f40339e.w0(x8Var2.f40336a);
            } else {
                x8 x8Var3 = x8VarArr[i7];
                x8Var3.f40339e.i0(user, x8Var3.f40336a, null);
            }
        } else {
            x8 x8Var4 = x8VarArr[i7];
            x8Var4.f40339e.i0(chat, x8Var4.f40336a, null);
        }
        x8VarArr[i7].f40339e.J0(b10 / 2);
        float f10 = b10;
        x8VarArr[i7].f40339e.y0(0.0f, 0.0f, f10, f10);
        d();
    }

    public final void k() {
        for (int i7 = 0; i7 < 3; i7++) {
            x8[] x8VarArr = this.f40645b;
            x8 x8Var = x8VarArr[i7];
            x8[] x8VarArr2 = this.f40646c;
            x8VarArr[i7] = x8VarArr2[i7];
            x8VarArr2[i7] = x8Var;
        }
    }
}
