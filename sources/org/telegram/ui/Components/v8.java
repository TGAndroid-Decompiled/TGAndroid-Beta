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
public final class v8 {
    public float A;
    public boolean B;
    public boolean f40323a;
    public boolean d;
    public ValueAnimator f40327f;
    public boolean f40328g;
    public Runnable f40330j;
    public int f40331k;
    public boolean f40332l;
    public final boolean f40333m;
    public int f40334n;
    public int f40335o;
    public int f40336p;
    public final View f40338r;
    public int f40339s;
    public boolean f40342w;
    public boolean f40343x;
    public fi.t6 f40344y;
    public final Random f40345z;
    public final u8[] f40324b = new u8[3];
    public final u8[] f40325c = new u8[3];
    public float f40326e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f40329i = new Paint(1);
    public int f40337q = org.telegram.messenger.g0.L(1.67f);
    public float f40340t = 0.8f;
    public float f40341u = 1.0f;
    public long v = 220;

    public v8(View view, boolean z10) {
        er erVar = er.f34419f;
        this.f40345z = new Random();
        this.f40338r = view;
        for (int i7 = 0; i7 < 3; i7++) {
            u8[] u8VarArr = this.f40324b;
            ?? obj = new Object();
            u8VarArr[i7] = obj;
            obj.f39957e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.f40324b[i7].f39957e;
            imageReceiver.K0 = true;
            imageReceiver.J0(org.telegram.messenger.g0.L(12.0f));
            this.f40324b[i7].f39954a = new t8((org.telegram.ui.ActionBar.e6) null);
            this.f40324b[i7].f39954a.u(org.telegram.messenger.g0.L(12.0f));
            u8[] u8VarArr2 = this.f40325c;
            ?? obj2 = new Object();
            u8VarArr2[i7] = obj2;
            obj2.f39957e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.f40325c[i7].f39957e;
            imageReceiver2.K0 = true;
            imageReceiver2.J0(org.telegram.messenger.g0.L(12.0f));
            this.f40325c[i7].f39954a = new t8((org.telegram.ui.ActionBar.e6) null);
            this.f40325c[i7].f39954a.u(org.telegram.messenger.g0.L(12.0f));
        }
        this.f40333m = z10;
        this.f40329i.setColor(0);
        this.f40329i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10, boolean z11) {
        u8[] u8VarArr;
        u8[] u8VarArr2;
        if (this.d && z10) {
            u8[] u8VarArr3 = new u8[3];
            int i7 = 0;
            boolean z12 = false;
            while (true) {
                u8VarArr = this.f40324b;
                u8VarArr2 = this.f40325c;
                if (i7 >= 3) {
                    break;
                }
                u8VarArr3[i7] = u8VarArr[i7];
                u8 u8Var = u8VarArr[i7];
                long j3 = u8Var.f39959g;
                u8 u8Var2 = u8VarArr2[i7];
                if (j3 != u8Var2.f39959g) {
                    z12 = true;
                } else {
                    u8Var.d = u8Var2.d;
                }
                i7++;
            }
            if (!z12) {
                this.f40326e = 1.0f;
                return;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = 0;
                while (true) {
                    if (i11 < 3) {
                        if (u8VarArr[i11].f39959g == u8VarArr2[i10].f39959g) {
                            u8VarArr3[i11] = null;
                            if (i10 == i11) {
                                u8 u8Var3 = u8VarArr2[i10];
                                u8Var3.f39960i = -1;
                                org.telegram.ui.Cells.e4 e4Var = u8Var3.f39955b;
                                u8 u8Var4 = u8VarArr[i10];
                                u8Var3.f39955b = u8Var4.f39955b;
                                u8Var4.f39955b = e4Var;
                            } else {
                                u8 u8Var5 = u8VarArr2[i10];
                                u8Var5.f39960i = 2;
                                u8Var5.f39961j = i11;
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        u8VarArr2[i10].f39960i = 0;
                        break;
                    }
                }
            }
            for (int i12 = 0; i12 < 3; i12++) {
                u8 u8Var6 = u8VarArr3[i12];
                if (u8Var6 != null) {
                    u8Var6.f39960i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f40327f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f40327f.cancel();
                if (this.f40342w) {
                    k();
                    this.f40342w = false;
                }
            }
            this.f40326e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f40327f = ofFloat;
                ofFloat.addUpdateListener(new c6(this, 4));
                this.f40327f.addListener(new x5(this, 5));
                this.f40327f.setDuration(this.v);
                this.f40327f.setInterpolator(er.f34419f);
                this.f40327f.start();
            } else {
                this.f40342w = true;
            }
            d();
            return;
        }
        this.f40326e = 1.0f;
        k();
    }

    public final int b() {
        float f10;
        int i7 = this.f40339s;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f40331k;
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
        int i7 = this.f40331k;
        int i10 = 0;
        if (i7 != 4 && i7 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i7 == 11) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            int i11 = this.f40339s;
            if (i11 != 0) {
                L = (int) (i11 * this.f40340t);
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
            if (this.f40324b[i13].f39959g != 0) {
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
        View view = this.f40338r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (!this.B) {
            this.B = true;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f40324b[i7].f39957e.P();
                this.f40325c[i7].f39957e.P();
            }
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f40324b[i7].f39957e.R();
                this.f40325c[i7].f39957e.R();
            }
            if (this.f40331k == 3) {
                org.telegram.ui.ActionBar.j6.G0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v8.g(android.graphics.Canvas):void");
    }

    public final void h(int i7) {
        t8 t8Var;
        t8 t8Var2;
        for (int i10 = 0; i10 < 3; i10++) {
            u8 u8Var = this.f40324b[i10];
            if (u8Var != null && (t8Var2 = u8Var.f39954a) != null) {
                t8Var2.u(i7);
            }
            u8 u8Var2 = this.f40325c[i10];
            if (u8Var2 != null && (t8Var = u8Var2.f39954a) != null) {
                t8Var.u(i7);
            }
        }
    }

    public final void i(int i7) {
        this.f40334n = i7;
        View view = this.f40338r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i7, int i10, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        u8[] u8VarArr = this.f40325c;
        u8 u8Var = u8VarArr[i7];
        u8Var.f39959g = 0L;
        u8Var.f39958f = null;
        if (tLObject == null) {
            u8Var.f39957e.w0(null);
            d();
            return;
        }
        u8Var.d = -1L;
        u8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            u8Var.f39958f = groupCallParticipant;
            long B1 = org.telegram.messenger.gj.B1(groupCallParticipant.peer);
            if (org.telegram.messenger.m5.E(B1)) {
                user = org.telegram.messenger.np.s1(i10).a2(Long.valueOf(B1));
                u8VarArr[i7].f39954a.r(user);
                chat = null;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-B1));
                u8VarArr[i7].f39954a.q(M0);
                chat = M0;
                user = null;
            }
            if (this.f40331k == 4) {
                if (B1 == org.telegram.messenger.m10.i(org.telegram.messenger.c.a(i10).f22782a).e()) {
                    u8VarArr[i7].d = 0L;
                } else if (this.f40333m) {
                    u8VarArr[i7].d = groupCallParticipant.lastActiveDate;
                } else {
                    u8VarArr[i7].d = groupCallParticipant.active_date;
                }
            } else {
                u8VarArr[i7].d = groupCallParticipant.active_date;
            }
            u8VarArr[i7].f39959g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f40323a) {
                u8Var.f39954a.g(1);
                u8VarArr[i7].f39954a.f39598p = 0.6f;
            } else {
                u8Var.f39954a.g(0);
                t8 t8Var = u8VarArr[i7].f39954a;
                t8Var.f39598p = 1.0f;
                t8Var.r(user2);
            }
            u8VarArr[i7].f39959g = user2.f28200id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            u8Var.f39954a.g(0);
            t8 t8Var2 = u8VarArr[i7].f39954a;
            t8Var2.f39598p = 1.0f;
            t8Var2.q(chat);
            u8VarArr[i7].f39959g = -chat.f28051id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            u8VarArr[i7].f39959g = storyItem.f28290id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 50, true, null, false);
                u8VarArr[i7].f39957e.r0(org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(storyItem.media.document.thumbs, 50, true, w10, true), storyItem.media.document), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), org.telegram.messenger.gc.c(w10, storyItem.media.document), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 50, true, null, false);
                    u8VarArr[i7].f39957e.r0(org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(storyItem.media.photo.sizes, 50, true, w11, true), storyItem.media.photo), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), org.telegram.messenger.gc.i(w11, storyItem.media.photo), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f40323a) {
                u8 u8Var2 = u8VarArr[i7];
                u8Var2.f39957e.w0(u8Var2.f39954a);
            } else {
                u8 u8Var3 = u8VarArr[i7];
                u8Var3.f39957e.i0(user, u8Var3.f39954a, null);
            }
        } else {
            u8 u8Var4 = u8VarArr[i7];
            u8Var4.f39957e.i0(chat, u8Var4.f39954a, null);
        }
        u8VarArr[i7].f39957e.J0(b10 / 2);
        float f10 = b10;
        u8VarArr[i7].f39957e.y0(0.0f, 0.0f, f10, f10);
        d();
    }

    public final void k() {
        for (int i7 = 0; i7 < 3; i7++) {
            u8[] u8VarArr = this.f40324b;
            u8 u8Var = u8VarArr[i7];
            u8[] u8VarArr2 = this.f40325c;
            u8VarArr[i7] = u8VarArr2[i7];
            u8VarArr2[i7] = u8Var;
        }
    }
}
