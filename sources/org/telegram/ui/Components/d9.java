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
public final class d9 {
    public float A;
    public boolean B;
    public boolean f34424a;
    public boolean d;
    public ValueAnimator f34428f;
    public boolean f34429g;
    public Runnable f34431j;
    public int f34432k;
    public boolean f34433l;
    public final boolean f34434m;
    public int f34435n;
    public int f34436o;
    public int f34437p;
    public final View f34439r;
    public int f34440s;
    public boolean f34443w;
    public boolean f34444x;
    public fi.q6 f34445y;
    public final Random f34446z;
    public final c9[] f34425b = new c9[3];
    public final c9[] f34426c = new c9[3];
    public float f34427e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f34430i = new Paint(1);
    public int f34438q = org.telegram.messenger.g0.L(1.67f);
    public float f34441t = 0.8f;
    public float f34442u = 1.0f;
    public long v = 220;

    public d9(View view, boolean z10) {
        nr nrVar = nr.f37960f;
        this.f34446z = new Random();
        this.f34439r = view;
        for (int i7 = 0; i7 < 3; i7++) {
            c9[] c9VarArr = this.f34425b;
            ?? obj = new Object();
            c9VarArr[i7] = obj;
            obj.f34119e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.f34425b[i7].f34119e;
            imageReceiver.K0 = true;
            imageReceiver.J0(org.telegram.messenger.g0.L(12.0f));
            this.f34425b[i7].f34116a = new b9((org.telegram.ui.ActionBar.h6) null);
            this.f34425b[i7].f34116a.u(org.telegram.messenger.g0.L(12.0f));
            c9[] c9VarArr2 = this.f34426c;
            ?? obj2 = new Object();
            c9VarArr2[i7] = obj2;
            obj2.f34119e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.f34426c[i7].f34119e;
            imageReceiver2.K0 = true;
            imageReceiver2.J0(org.telegram.messenger.g0.L(12.0f));
            this.f34426c[i7].f34116a = new b9((org.telegram.ui.ActionBar.h6) null);
            this.f34426c[i7].f34116a.u(org.telegram.messenger.g0.L(12.0f));
        }
        this.f34434m = z10;
        this.f34430i.setColor(0);
        this.f34430i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10, boolean z11) {
        c9[] c9VarArr;
        c9[] c9VarArr2;
        if (this.d && z10) {
            c9[] c9VarArr3 = new c9[3];
            int i7 = 0;
            boolean z12 = false;
            while (true) {
                c9VarArr = this.f34425b;
                c9VarArr2 = this.f34426c;
                if (i7 >= 3) {
                    break;
                }
                c9VarArr3[i7] = c9VarArr[i7];
                c9 c9Var = c9VarArr[i7];
                long j3 = c9Var.f34121g;
                c9 c9Var2 = c9VarArr2[i7];
                if (j3 != c9Var2.f34121g) {
                    z12 = true;
                } else {
                    c9Var.d = c9Var2.d;
                }
                i7++;
            }
            if (!z12) {
                this.f34427e = 1.0f;
                return;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = 0;
                while (true) {
                    if (i11 < 3) {
                        if (c9VarArr[i11].f34121g == c9VarArr2[i10].f34121g) {
                            c9VarArr3[i11] = null;
                            if (i10 == i11) {
                                c9 c9Var3 = c9VarArr2[i10];
                                c9Var3.f34122i = -1;
                                org.telegram.ui.Cells.f4 f4Var = c9Var3.f34117b;
                                c9 c9Var4 = c9VarArr[i10];
                                c9Var3.f34117b = c9Var4.f34117b;
                                c9Var4.f34117b = f4Var;
                            } else {
                                c9 c9Var5 = c9VarArr2[i10];
                                c9Var5.f34122i = 2;
                                c9Var5.f34123j = i11;
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        c9VarArr2[i10].f34122i = 0;
                        break;
                    }
                }
            }
            for (int i12 = 0; i12 < 3; i12++) {
                c9 c9Var6 = c9VarArr3[i12];
                if (c9Var6 != null) {
                    c9Var6.f34122i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f34428f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f34428f.cancel();
                if (this.f34443w) {
                    k();
                    this.f34443w = false;
                }
            }
            this.f34427e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f34428f = ofFloat;
                ofFloat.addUpdateListener(new x(this, 5));
                this.f34428f.addListener(new y(this, 6));
                this.f34428f.setDuration(this.v);
                this.f34428f.setInterpolator(nr.f37960f);
                this.f34428f.start();
            } else {
                this.f34443w = true;
            }
            d();
            return;
        }
        this.f34427e = 1.0f;
        k();
    }

    public final int b() {
        float f10;
        int i7 = this.f34440s;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f34432k;
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
        int i7 = this.f34432k;
        int i10 = 0;
        if (i7 != 4 && i7 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i7 == 11) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            int i11 = this.f34440s;
            if (i11 != 0) {
                L = (int) (i11 * this.f34441t);
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
            if (this.f34425b[i13].f34121g != 0) {
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
        View view = this.f34439r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (!this.B) {
            this.B = true;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f34425b[i7].f34119e.P();
                this.f34426c[i7].f34119e.P();
            }
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f34425b[i7].f34119e.R();
                this.f34426c[i7].f34119e.R();
            }
            if (this.f34432k == 3) {
                org.telegram.ui.ActionBar.m6.G0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d9.g(android.graphics.Canvas):void");
    }

    public final void h(int i7) {
        b9 b9Var;
        b9 b9Var2;
        for (int i10 = 0; i10 < 3; i10++) {
            c9 c9Var = this.f34425b[i10];
            if (c9Var != null && (b9Var2 = c9Var.f34116a) != null) {
                b9Var2.u(i7);
            }
            c9 c9Var2 = this.f34426c[i10];
            if (c9Var2 != null && (b9Var = c9Var2.f34116a) != null) {
                b9Var.u(i7);
            }
        }
    }

    public final void i(int i7) {
        this.f34435n = i7;
        View view = this.f34439r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i7, int i10, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        c9[] c9VarArr = this.f34426c;
        c9 c9Var = c9VarArr[i7];
        c9Var.f34121g = 0L;
        c9Var.f34120f = null;
        if (tLObject == null) {
            c9Var.f34119e.w0(null);
            d();
            return;
        }
        c9Var.d = -1L;
        c9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            c9Var.f34120f = groupCallParticipant;
            long B1 = org.telegram.messenger.gj.B1(groupCallParticipant.peer);
            if (org.telegram.messenger.n5.E(B1)) {
                user = org.telegram.messenger.np.u1(i10).c2(Long.valueOf(B1));
                c9VarArr[i7].f34116a.r(user);
                chat = null;
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i10).O0(Long.valueOf(-B1));
                c9VarArr[i7].f34116a.q(O0);
                chat = O0;
                user = null;
            }
            if (this.f34432k == 4) {
                if (B1 == org.telegram.messenger.k10.i(org.telegram.messenger.c.a(i10).f23202a).e()) {
                    c9VarArr[i7].d = 0L;
                } else if (this.f34434m) {
                    c9VarArr[i7].d = groupCallParticipant.lastActiveDate;
                } else {
                    c9VarArr[i7].d = groupCallParticipant.active_date;
                }
            } else {
                c9VarArr[i7].d = groupCallParticipant.active_date;
            }
            c9VarArr[i7].f34121g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f34424a) {
                c9Var.f34116a.g(1);
                c9VarArr[i7].f34116a.f33802p = 0.6f;
            } else {
                c9Var.f34116a.g(0);
                b9 b9Var = c9VarArr[i7].f34116a;
                b9Var.f33802p = 1.0f;
                b9Var.r(user2);
            }
            c9VarArr[i7].f34121g = user2.f28583id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            c9Var.f34116a.g(0);
            b9 b9Var2 = c9VarArr[i7].f34116a;
            b9Var2.f33802p = 1.0f;
            b9Var2.q(chat);
            c9VarArr[i7].f34121g = -chat.f28434id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            c9VarArr[i7].f34121g = storyItem.f28673id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 50, true, null, false);
                c9VarArr[i7].f34119e.r0(org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(storyItem.media.document.thumbs, 50, true, w10, true), storyItem.media.document), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), org.telegram.messenger.gc.c(w10, storyItem.media.document), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 50, true, null, false);
                    c9VarArr[i7].f34119e.r0(org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(storyItem.media.photo.sizes, 50, true, w11, true), storyItem.media.photo), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), org.telegram.messenger.gc.i(w11, storyItem.media.photo), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f34424a) {
                c9 c9Var2 = c9VarArr[i7];
                c9Var2.f34119e.w0(c9Var2.f34116a);
            } else {
                c9 c9Var3 = c9VarArr[i7];
                c9Var3.f34119e.i0(user, c9Var3.f34116a, null);
            }
        } else {
            c9 c9Var4 = c9VarArr[i7];
            c9Var4.f34119e.i0(chat, c9Var4.f34116a, null);
        }
        c9VarArr[i7].f34119e.J0(b10 / 2);
        float f10 = b10;
        c9VarArr[i7].f34119e.y0(0.0f, 0.0f, f10, f10);
        d();
    }

    public final void k() {
        for (int i7 = 0; i7 < 3; i7++) {
            c9[] c9VarArr = this.f34425b;
            c9 c9Var = c9VarArr[i7];
            c9[] c9VarArr2 = this.f34426c;
            c9VarArr[i7] = c9VarArr2[i7];
            c9VarArr2[i7] = c9Var;
        }
    }
}
