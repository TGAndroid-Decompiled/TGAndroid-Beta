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
public final class x8 {
    public float A;
    public boolean B;
    public boolean f40231a;
    public boolean d;
    public ValueAnimator f40235f;
    public boolean f40236g;
    public Runnable f40238j;
    public int f40239k;
    public boolean f40240l;
    public final boolean f40241m;
    public int f40242n;
    public int f40243o;
    public int f40244p;
    public final View f40246r;
    public int f40247s;
    public boolean f40250w;
    public boolean f40251x;
    public di.a7 f40252y;
    public final Random f40253z;
    public final w8[] f40232b = new w8[3];
    public final w8[] f40233c = new w8[3];
    public float f40234e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f40237i = new Paint(1);
    public int f40245q = org.telegram.messenger.g0.L(1.67f);
    public float f40248t = 0.8f;
    public float f40249u = 1.0f;
    public long v = 220;

    public x8(View view, boolean z9) {
        wq wqVar = wq.f40046f;
        this.f40253z = new Random();
        this.f40246r = view;
        for (int i7 = 0; i7 < 3; i7++) {
            w8[] w8VarArr = this.f40232b;
            ?? obj = new Object();
            w8VarArr[i7] = obj;
            obj.f39924e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.f40232b[i7].f39924e;
            imageReceiver.J0 = true;
            imageReceiver.J0(org.telegram.messenger.g0.L(12.0f));
            this.f40232b[i7].f39921a = new v8((org.telegram.ui.ActionBar.h6) null);
            this.f40232b[i7].f39921a.u(org.telegram.messenger.g0.L(12.0f));
            w8[] w8VarArr2 = this.f40233c;
            ?? obj2 = new Object();
            w8VarArr2[i7] = obj2;
            obj2.f39924e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.f40233c[i7].f39924e;
            imageReceiver2.J0 = true;
            imageReceiver2.J0(org.telegram.messenger.g0.L(12.0f));
            this.f40233c[i7].f39921a = new v8((org.telegram.ui.ActionBar.h6) null);
            this.f40233c[i7].f39921a.u(org.telegram.messenger.g0.L(12.0f));
        }
        this.f40241m = z9;
        this.f40237i.setColor(0);
        this.f40237i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z9, boolean z10) {
        w8[] w8VarArr;
        w8[] w8VarArr2;
        if (this.d && z9) {
            w8[] w8VarArr3 = new w8[3];
            int i7 = 0;
            boolean z11 = false;
            while (true) {
                w8VarArr = this.f40232b;
                w8VarArr2 = this.f40233c;
                if (i7 >= 3) {
                    break;
                }
                w8VarArr3[i7] = w8VarArr[i7];
                w8 w8Var = w8VarArr[i7];
                long j3 = w8Var.f39926g;
                w8 w8Var2 = w8VarArr2[i7];
                if (j3 != w8Var2.f39926g) {
                    z11 = true;
                } else {
                    w8Var.d = w8Var2.d;
                }
                i7++;
            }
            if (!z11) {
                this.f40234e = 1.0f;
                return;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = 0;
                while (true) {
                    if (i11 < 3) {
                        if (w8VarArr[i11].f39926g == w8VarArr2[i10].f39926g) {
                            w8VarArr3[i11] = null;
                            if (i10 == i11) {
                                w8 w8Var3 = w8VarArr2[i10];
                                w8Var3.f39927i = -1;
                                org.telegram.ui.Cells.e4 e4Var = w8Var3.f39922b;
                                w8 w8Var4 = w8VarArr[i10];
                                w8Var3.f39922b = w8Var4.f39922b;
                                w8Var4.f39922b = e4Var;
                            } else {
                                w8 w8Var5 = w8VarArr2[i10];
                                w8Var5.f39927i = 2;
                                w8Var5.f39928j = i11;
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        w8VarArr2[i10].f39927i = 0;
                        break;
                    }
                }
            }
            for (int i12 = 0; i12 < 3; i12++) {
                w8 w8Var6 = w8VarArr3[i12];
                if (w8Var6 != null) {
                    w8Var6.f39927i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f40235f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f40235f.cancel();
                if (this.f40250w) {
                    k();
                    this.f40250w = false;
                }
            }
            this.f40234e = 0.0f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f40235f = ofFloat;
                ofFloat.addUpdateListener(new d6(this, 4));
                this.f40235f.addListener(new y5(this, 5));
                this.f40235f.setDuration(this.v);
                this.f40235f.setInterpolator(wq.f40046f);
                this.f40235f.start();
            } else {
                this.f40250w = true;
            }
            d();
            return;
        }
        this.f40234e = 1.0f;
        k();
    }

    public final int b() {
        float f10;
        int i7 = this.f40247s;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f40239k;
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
        int i7 = this.f40239k;
        int i10 = 0;
        if (i7 != 4 && i7 != 10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (i7 == 11) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            int i11 = this.f40247s;
            if (i11 != 0) {
                L = (int) (i11 * this.f40248t);
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
            if (this.f40232b[i13].f39926g != 0) {
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
        View view = this.f40246r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (!this.B) {
            this.B = true;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f40232b[i7].f39924e.P();
                this.f40233c[i7].f39924e.P();
            }
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f40232b[i7].f39924e.R();
                this.f40233c[i7].f39924e.R();
            }
            if (this.f40239k == 3) {
                org.telegram.ui.ActionBar.m6.G0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x8.g(android.graphics.Canvas):void");
    }

    public final void h(int i7) {
        v8 v8Var;
        v8 v8Var2;
        for (int i10 = 0; i10 < 3; i10++) {
            w8 w8Var = this.f40232b[i10];
            if (w8Var != null && (v8Var2 = w8Var.f39921a) != null) {
                v8Var2.u(i7);
            }
            w8 w8Var2 = this.f40233c[i10];
            if (w8Var2 != null && (v8Var = w8Var2.f39921a) != null) {
                v8Var.u(i7);
            }
        }
    }

    public final void i(int i7) {
        this.f40242n = i7;
        View view = this.f40246r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i7, int i10, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        w8[] w8VarArr = this.f40233c;
        w8 w8Var = w8VarArr[i7];
        w8Var.f39926g = 0L;
        w8Var.f39925f = null;
        if (tLObject == null) {
            w8Var.f39924e.w0(null);
            d();
            return;
        }
        w8Var.d = -1L;
        w8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            w8Var.f39925f = groupCallParticipant;
            long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
            if (org.telegram.messenger.m5.E(B1)) {
                user = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(B1));
                w8VarArr[i7].f39921a.r(user);
                chat = null;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-B1));
                w8VarArr[i7].f39921a.q(M0);
                chat = M0;
                user = null;
            }
            if (this.f40239k == 4) {
                if (B1 == org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i10).f21770a).e()) {
                    w8VarArr[i7].d = 0L;
                } else if (this.f40241m) {
                    w8VarArr[i7].d = groupCallParticipant.lastActiveDate;
                } else {
                    w8VarArr[i7].d = groupCallParticipant.active_date;
                }
            } else {
                w8VarArr[i7].d = groupCallParticipant.active_date;
            }
            w8VarArr[i7].f39926g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f40231a) {
                w8Var.f39921a.g(1);
                w8VarArr[i7].f39921a.f38925p = 0.6f;
            } else {
                w8Var.f39921a.g(0);
                v8 v8Var = w8VarArr[i7].f39921a;
                v8Var.f38925p = 1.0f;
                v8Var.r(user2);
            }
            w8VarArr[i7].f39926g = user2.f27109id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            w8Var.f39921a.g(0);
            v8 v8Var2 = w8VarArr[i7].f39921a;
            v8Var2.f38925p = 1.0f;
            v8Var2.q(chat);
            w8VarArr[i7].f39926g = -chat.f26960id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            w8VarArr[i7].f39926g = storyItem.f27199id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 50, true, null, false);
                w8VarArr[i7].f39924e.r0(org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(storyItem.media.document.thumbs, 50, true, w10, true), storyItem.media.document), com.google.android.recaptcha.internal.a.j(b10, "_", b10), org.telegram.messenger.hc.c(w10, storyItem.media.document), com.google.android.recaptcha.internal.a.j(b10, "_", b10), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 50, true, null, false);
                    w8VarArr[i7].f39924e.r0(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(storyItem.media.photo.sizes, 50, true, w11, true), storyItem.media.photo), com.google.android.recaptcha.internal.a.j(b10, "_", b10), org.telegram.messenger.hc.i(w11, storyItem.media.photo), com.google.android.recaptcha.internal.a.j(b10, "_", b10), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f40231a) {
                w8 w8Var2 = w8VarArr[i7];
                w8Var2.f39924e.w0(w8Var2.f39921a);
            } else {
                w8 w8Var3 = w8VarArr[i7];
                w8Var3.f39924e.i0(user, w8Var3.f39921a, null);
            }
        } else {
            w8 w8Var4 = w8VarArr[i7];
            w8Var4.f39924e.i0(chat, w8Var4.f39921a, null);
        }
        w8VarArr[i7].f39924e.J0(b10 / 2);
        float f10 = b10;
        w8VarArr[i7].f39924e.y0(0.0f, 0.0f, f10, f10);
        d();
    }

    public final void k() {
        for (int i7 = 0; i7 < 3; i7++) {
            w8[] w8VarArr = this.f40232b;
            w8 w8Var = w8VarArr[i7];
            w8[] w8VarArr2 = this.f40233c;
            w8VarArr[i7] = w8VarArr2[i7];
            w8VarArr2[i7] = w8Var;
        }
    }
}
