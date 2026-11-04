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
public final class w8 {
    public float A;
    public boolean B;
    public boolean f39947a;
    public boolean d;
    public ValueAnimator f39951f;
    public boolean f39952g;
    public Runnable f39954j;
    public int f39955k;
    public boolean f39956l;
    public final boolean f39957m;
    public int f39958n;
    public int f39959o;
    public int f39960p;
    public final View f39962r;
    public int f39963s;
    public boolean f39966w;
    public boolean f39967x;
    public ei.a7 f39968y;
    public final Random f39969z;
    public final v8[] f39948b = new v8[3];
    public final v8[] f39949c = new v8[3];
    public float f39950e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f39953i = new Paint(1);
    public int f39961q = org.telegram.messenger.g0.L(1.67f);
    public float f39964t = 0.8f;
    public float f39965u = 1.0f;
    public long v = 220;

    public w8(View view, boolean z10) {
        xq xqVar = xq.f40452f;
        this.f39969z = new Random();
        this.f39962r = view;
        for (int i3 = 0; i3 < 3; i3++) {
            v8[] v8VarArr = this.f39948b;
            ?? obj = new Object();
            v8VarArr[i3] = obj;
            obj.f39028e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.f39948b[i3].f39028e;
            imageReceiver.K0 = true;
            imageReceiver.J0(org.telegram.messenger.g0.L(12.0f));
            this.f39948b[i3].f39025a = new u8((org.telegram.ui.ActionBar.e6) null);
            this.f39948b[i3].f39025a.u(org.telegram.messenger.g0.L(12.0f));
            v8[] v8VarArr2 = this.f39949c;
            ?? obj2 = new Object();
            v8VarArr2[i3] = obj2;
            obj2.f39028e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.f39949c[i3].f39028e;
            imageReceiver2.K0 = true;
            imageReceiver2.J0(org.telegram.messenger.g0.L(12.0f));
            this.f39949c[i3].f39025a = new u8((org.telegram.ui.ActionBar.e6) null);
            this.f39949c[i3].f39025a.u(org.telegram.messenger.g0.L(12.0f));
        }
        this.f39957m = z10;
        this.f39953i.setColor(0);
        this.f39953i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10, boolean z11) {
        v8[] v8VarArr;
        v8[] v8VarArr2;
        if (this.d && z10) {
            v8[] v8VarArr3 = new v8[3];
            int i3 = 0;
            boolean z12 = false;
            while (true) {
                v8VarArr = this.f39948b;
                v8VarArr2 = this.f39949c;
                if (i3 >= 3) {
                    break;
                }
                v8VarArr3[i3] = v8VarArr[i3];
                v8 v8Var = v8VarArr[i3];
                long j10 = v8Var.f39030g;
                v8 v8Var2 = v8VarArr2[i3];
                if (j10 != v8Var2.f39030g) {
                    z12 = true;
                } else {
                    v8Var.d = v8Var2.d;
                }
                i3++;
            }
            if (!z12) {
                this.f39950e = 1.0f;
                return;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = 0;
                while (true) {
                    if (i11 < 3) {
                        if (v8VarArr[i11].f39030g == v8VarArr2[i10].f39030g) {
                            v8VarArr3[i11] = null;
                            if (i10 == i11) {
                                v8 v8Var3 = v8VarArr2[i10];
                                v8Var3.f39031i = -1;
                                org.telegram.ui.Cells.e4 e4Var = v8Var3.f39026b;
                                v8 v8Var4 = v8VarArr[i10];
                                v8Var3.f39026b = v8Var4.f39026b;
                                v8Var4.f39026b = e4Var;
                            } else {
                                v8 v8Var5 = v8VarArr2[i10];
                                v8Var5.f39031i = 2;
                                v8Var5.f39032j = i11;
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        v8VarArr2[i10].f39031i = 0;
                        break;
                    }
                }
            }
            for (int i12 = 0; i12 < 3; i12++) {
                v8 v8Var6 = v8VarArr3[i12];
                if (v8Var6 != null) {
                    v8Var6.f39031i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f39951f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f39951f.cancel();
                if (this.f39966w) {
                    k();
                    this.f39966w = false;
                }
            }
            this.f39950e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f39951f = ofFloat;
                ofFloat.addUpdateListener(new c6(this, 4));
                this.f39951f.addListener(new x5(this, 5));
                this.f39951f.setDuration(this.v);
                this.f39951f.setInterpolator(xq.f40452f);
                this.f39951f.start();
            } else {
                this.f39966w = true;
            }
            d();
            return;
        }
        this.f39950e = 1.0f;
        k();
    }

    public final int b() {
        float f10;
        int i3 = this.f39963s;
        if (i3 != 0) {
            return i3;
        }
        int i10 = this.f39955k;
        if (i10 != 4 && i10 != 10) {
            f10 = 24.0f;
        } else {
            f10 = 32.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final float c() {
        boolean z10;
        float f10;
        int L;
        int i3 = this.f39955k;
        int i10 = 0;
        if (i3 != 4 && i3 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i3 == 11) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            int i11 = this.f39963s;
            if (i11 != 0) {
                L = (int) (i11 * this.f39964t);
            } else {
                if (z10) {
                    f10 = 24.0f;
                } else {
                    f10 = 20.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (this.f39948b[i13].f39030g != 0) {
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
        View view = this.f39962r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (!this.B) {
            this.B = true;
            for (int i3 = 0; i3 < 3; i3++) {
                this.f39948b[i3].f39028e.P();
                this.f39949c[i3].f39028e.P();
            }
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i3 = 0; i3 < 3; i3++) {
                this.f39948b[i3].f39028e.R();
                this.f39949c[i3].f39028e.R();
            }
            if (this.f39955k == 3) {
                org.telegram.ui.ActionBar.k6.G0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w8.g(android.graphics.Canvas):void");
    }

    public final void h(int i3) {
        u8 u8Var;
        u8 u8Var2;
        for (int i10 = 0; i10 < 3; i10++) {
            v8 v8Var = this.f39948b[i10];
            if (v8Var != null && (u8Var2 = v8Var.f39025a) != null) {
                u8Var2.u(i3);
            }
            v8 v8Var2 = this.f39949c[i10];
            if (v8Var2 != null && (u8Var = v8Var2.f39025a) != null) {
                u8Var.u(i3);
            }
        }
    }

    public final void i(int i3) {
        this.f39958n = i3;
        View view = this.f39962r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i3, int i10, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        v8[] v8VarArr = this.f39949c;
        v8 v8Var = v8VarArr[i3];
        v8Var.f39030g = 0L;
        v8Var.f39029f = null;
        if (tLObject == null) {
            v8Var.f39028e.w0(null);
            d();
            return;
        }
        v8Var.d = -1L;
        v8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            v8Var.f39029f = groupCallParticipant;
            long C1 = org.telegram.messenger.zi.C1(groupCallParticipant.peer);
            if (org.telegram.messenger.m5.E(C1)) {
                user = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(C1));
                v8VarArr[i3].f39025a.r(user);
                chat = null;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-C1));
                v8VarArr[i3].f39025a.q(M0);
                chat = M0;
                user = null;
            }
            if (this.f39955k == 4) {
                if (C1 == org.telegram.messenger.h10.i(org.telegram.messenger.c.a(i10).f21919a).e()) {
                    v8VarArr[i3].d = 0L;
                } else if (this.f39957m) {
                    v8VarArr[i3].d = groupCallParticipant.lastActiveDate;
                } else {
                    v8VarArr[i3].d = groupCallParticipant.active_date;
                }
            } else {
                v8VarArr[i3].d = groupCallParticipant.active_date;
            }
            v8VarArr[i3].f39030g = C1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f39947a) {
                v8Var.f39025a.g(1);
                v8VarArr[i3].f39025a.f38691p = 0.6f;
            } else {
                v8Var.f39025a.g(0);
                u8 u8Var = v8VarArr[i3].f39025a;
                u8Var.f38691p = 1.0f;
                u8Var.r(user2);
            }
            v8VarArr[i3].f39030g = user2.f27150id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            v8Var.f39025a.g(0);
            u8 u8Var2 = v8VarArr[i3].f39025a;
            u8Var2.f38691p = 1.0f;
            u8Var2.q(chat);
            v8VarArr[i3].f39030g = -chat.f27001id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            v8VarArr[i3].f39030g = storyItem.f27240id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 50, true, null, false);
                v8VarArr[i3].f39028e.r0(org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(storyItem.media.document.thumbs, 50, true, w10, true), storyItem.media.document), com.google.android.recaptcha.internal.a.i(b10, "_", b10), org.telegram.messenger.ac.c(w10, storyItem.media.document), com.google.android.recaptcha.internal.a.i(b10, "_", b10), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 50, true, null, false);
                    v8VarArr[i3].f39028e.r0(org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(storyItem.media.photo.sizes, 50, true, w11, true), storyItem.media.photo), com.google.android.recaptcha.internal.a.i(b10, "_", b10), org.telegram.messenger.ac.i(w11, storyItem.media.photo), com.google.android.recaptcha.internal.a.i(b10, "_", b10), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f39947a) {
                v8 v8Var2 = v8VarArr[i3];
                v8Var2.f39028e.w0(v8Var2.f39025a);
            } else {
                v8 v8Var3 = v8VarArr[i3];
                v8Var3.f39028e.i0(user, v8Var3.f39025a, null);
            }
        } else {
            v8 v8Var4 = v8VarArr[i3];
            v8Var4.f39028e.i0(chat, v8Var4.f39025a, null);
        }
        v8VarArr[i3].f39028e.J0(b10 / 2);
        float f10 = b10;
        v8VarArr[i3].f39028e.y0(0.0f, 0.0f, f10, f10);
        d();
    }

    public final void k() {
        for (int i3 = 0; i3 < 3; i3++) {
            v8[] v8VarArr = this.f39948b;
            v8 v8Var = v8VarArr[i3];
            v8[] v8VarArr2 = this.f39949c;
            v8VarArr[i3] = v8VarArr2[i3];
            v8VarArr2[i3] = v8Var;
        }
    }
}
