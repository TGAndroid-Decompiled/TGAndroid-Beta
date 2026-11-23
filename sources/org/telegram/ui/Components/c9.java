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
public final class c9 {
    public float A;
    public boolean B;
    public boolean f33949a;
    public boolean d;
    public ValueAnimator f33953f;
    public boolean f33954g;
    public Runnable f33956j;
    public int f33957k;
    public boolean f33958l;
    public final boolean f33959m;
    public int f33960n;
    public int f33961o;
    public int f33962p;
    public final View f33964r;
    public int f33965s;
    public boolean f33968w;
    public boolean f33969x;
    public fi.q6 f33970y;
    public final Random f33971z;
    public final b9[] f33950b = new b9[3];
    public final b9[] f33951c = new b9[3];
    public float f33952e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f33955i = new Paint(1);
    public int f33963q = org.telegram.messenger.g0.L(1.67f);
    public float f33966t = 0.8f;
    public float f33967u = 1.0f;
    public long v = 220;

    public c9(View view, boolean z10) {
        kr krVar = kr.f36858f;
        this.f33971z = new Random();
        this.f33964r = view;
        for (int i7 = 0; i7 < 3; i7++) {
            b9[] b9VarArr = this.f33950b;
            ?? obj = new Object();
            b9VarArr[i7] = obj;
            obj.f33694e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.f33950b[i7].f33694e;
            imageReceiver.K0 = true;
            imageReceiver.K0(org.telegram.messenger.g0.L(12.0f));
            this.f33950b[i7].f33691a = new a9((org.telegram.ui.ActionBar.i6) null);
            this.f33950b[i7].f33691a.u(org.telegram.messenger.g0.L(12.0f));
            b9[] b9VarArr2 = this.f33951c;
            ?? obj2 = new Object();
            b9VarArr2[i7] = obj2;
            obj2.f33694e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.f33951c[i7].f33694e;
            imageReceiver2.K0 = true;
            imageReceiver2.K0(org.telegram.messenger.g0.L(12.0f));
            this.f33951c[i7].f33691a = new a9((org.telegram.ui.ActionBar.i6) null);
            this.f33951c[i7].f33691a.u(org.telegram.messenger.g0.L(12.0f));
        }
        this.f33959m = z10;
        this.f33955i.setColor(0);
        this.f33955i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10, boolean z11) {
        b9[] b9VarArr;
        b9[] b9VarArr2;
        if (this.d && z10) {
            b9[] b9VarArr3 = new b9[3];
            int i7 = 0;
            boolean z12 = false;
            while (true) {
                b9VarArr = this.f33950b;
                b9VarArr2 = this.f33951c;
                if (i7 >= 3) {
                    break;
                }
                b9VarArr3[i7] = b9VarArr[i7];
                b9 b9Var = b9VarArr[i7];
                long j3 = b9Var.f33696g;
                b9 b9Var2 = b9VarArr2[i7];
                if (j3 != b9Var2.f33696g) {
                    z12 = true;
                } else {
                    b9Var.d = b9Var2.d;
                }
                i7++;
            }
            if (!z12) {
                this.f33952e = 1.0f;
                return;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = 0;
                while (true) {
                    if (i11 < 3) {
                        if (b9VarArr[i11].f33696g == b9VarArr2[i10].f33696g) {
                            b9VarArr3[i11] = null;
                            if (i10 == i11) {
                                b9 b9Var3 = b9VarArr2[i10];
                                b9Var3.f33697i = -1;
                                org.telegram.ui.Cells.f4 f4Var = b9Var3.f33692b;
                                b9 b9Var4 = b9VarArr[i10];
                                b9Var3.f33692b = b9Var4.f33692b;
                                b9Var4.f33692b = f4Var;
                            } else {
                                b9 b9Var5 = b9VarArr2[i10];
                                b9Var5.f33697i = 2;
                                b9Var5.f33698j = i11;
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        b9VarArr2[i10].f33697i = 0;
                        break;
                    }
                }
            }
            for (int i12 = 0; i12 < 3; i12++) {
                b9 b9Var6 = b9VarArr3[i12];
                if (b9Var6 != null) {
                    b9Var6.f33697i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f33953f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f33953f.cancel();
                if (this.f33968w) {
                    k();
                    this.f33968w = false;
                }
            }
            this.f33952e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f33953f = ofFloat;
                ofFloat.addUpdateListener(new w(this, 5));
                this.f33953f.addListener(new x(this, 6));
                this.f33953f.setDuration(this.v);
                this.f33953f.setInterpolator(kr.f36858f);
                this.f33953f.start();
            } else {
                this.f33968w = true;
            }
            d();
            return;
        }
        this.f33952e = 1.0f;
        k();
    }

    public final int b() {
        float f10;
        int i7 = this.f33965s;
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f33957k;
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
        int i7 = this.f33957k;
        int i10 = 0;
        if (i7 != 4 && i7 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i7 == 11) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            int i11 = this.f33965s;
            if (i11 != 0) {
                L = (int) (i11 * this.f33966t);
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
            if (this.f33950b[i13].f33696g != 0) {
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
        View view = this.f33964r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (!this.B) {
            this.B = true;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f33950b[i7].f33694e.Q();
                this.f33951c[i7].f33694e.Q();
            }
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i7 = 0; i7 < 3; i7++) {
                this.f33950b[i7].f33694e.S();
                this.f33951c[i7].f33694e.S();
            }
            if (this.f33957k == 3) {
                org.telegram.ui.ActionBar.n6.G0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.g(android.graphics.Canvas):void");
    }

    public final void h(int i7) {
        a9 a9Var;
        a9 a9Var2;
        for (int i10 = 0; i10 < 3; i10++) {
            b9 b9Var = this.f33950b[i10];
            if (b9Var != null && (a9Var2 = b9Var.f33691a) != null) {
                a9Var2.u(i7);
            }
            b9 b9Var2 = this.f33951c[i10];
            if (b9Var2 != null && (a9Var = b9Var2.f33691a) != null) {
                a9Var.u(i7);
            }
        }
    }

    public final void i(int i7) {
        this.f33960n = i7;
        View view = this.f33964r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i7, int i10, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        b9[] b9VarArr = this.f33951c;
        b9 b9Var = b9VarArr[i7];
        b9Var.f33696g = 0L;
        b9Var.f33695f = null;
        if (tLObject == null) {
            b9Var.f33694e.x0(null);
            d();
            return;
        }
        b9Var.d = -1L;
        b9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            b9Var.f33695f = groupCallParticipant;
            long B1 = org.telegram.messenger.fj.B1(groupCallParticipant.peer);
            if (org.telegram.messenger.n5.E(B1)) {
                user = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(B1));
                b9VarArr[i7].f33691a.r(user);
                chat = null;
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-B1));
                b9VarArr[i7].f33691a.q(O0);
                chat = O0;
                user = null;
            }
            if (this.f33957k == 4) {
                if (B1 == org.telegram.messenger.i10.i(org.telegram.messenger.c.a(i10).f23343a).e()) {
                    b9VarArr[i7].d = 0L;
                } else if (this.f33959m) {
                    b9VarArr[i7].d = groupCallParticipant.lastActiveDate;
                } else {
                    b9VarArr[i7].d = groupCallParticipant.active_date;
                }
            } else {
                b9VarArr[i7].d = groupCallParticipant.active_date;
            }
            b9VarArr[i7].f33696g = B1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f33949a) {
                b9Var.f33691a.g(1);
                b9VarArr[i7].f33691a.f33433p = 0.6f;
            } else {
                b9Var.f33691a.g(0);
                a9 a9Var = b9VarArr[i7].f33691a;
                a9Var.f33433p = 1.0f;
                a9Var.r(user2);
            }
            b9VarArr[i7].f33696g = user2.f28641id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            b9Var.f33691a.g(0);
            a9 a9Var2 = b9VarArr[i7].f33691a;
            a9Var2.f33433p = 1.0f;
            a9Var2.q(chat);
            b9VarArr[i7].f33696g = -chat.f28492id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            b9VarArr[i7].f33696g = storyItem.f28731id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 50, true, null, false);
                b9VarArr[i7].f33694e.s0(org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(storyItem.media.document.thumbs, 50, true, w10, true), storyItem.media.document), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), org.telegram.messenger.fc.c(w10, storyItem.media.document), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 50, true, null, false);
                    b9VarArr[i7].f33694e.s0(org.telegram.messenger.fc.i(org.telegram.messenger.w7.w(storyItem.media.photo.sizes, 50, true, w11, true), storyItem.media.photo), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), org.telegram.messenger.fc.i(w11, storyItem.media.photo), com.google.android.gms.internal.vision.e2.j(b10, "_", b10), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f33949a) {
                b9 b9Var2 = b9VarArr[i7];
                b9Var2.f33694e.x0(b9Var2.f33691a);
            } else {
                b9 b9Var3 = b9VarArr[i7];
                b9Var3.f33694e.j0(user, b9Var3.f33691a, null);
            }
        } else {
            b9 b9Var4 = b9VarArr[i7];
            b9Var4.f33694e.j0(chat, b9Var4.f33691a, null);
        }
        b9VarArr[i7].f33694e.K0(b10 / 2);
        float f10 = b10;
        b9VarArr[i7].f33694e.z0(0.0f, 0.0f, f10, f10);
        d();
    }

    public final void k() {
        for (int i7 = 0; i7 < 3; i7++) {
            b9[] b9VarArr = this.f33950b;
            b9 b9Var = b9VarArr[i7];
            b9[] b9VarArr2 = this.f33951c;
            b9VarArr[i7] = b9VarArr2[i7];
            b9VarArr2[i7] = b9Var;
        }
    }
}
