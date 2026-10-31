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
public final class t8 {
    public float A;
    public boolean B;
    public boolean f30479a;
    public boolean d;
    public ValueAnimator f30482f;
    public boolean f30483g;
    public Runnable f30485j;
    public int f30486k;
    public boolean f30487l;
    public final boolean f30488m;
    public int f30489n;
    public int f30490o;
    public int f30491p;
    public final View f30493r;
    public int f30494s;
    public boolean f30497w;
    public boolean f30498x;
    public th.f5 f30499y;
    public final Random f30500z;
    public final s8[] f30480b = new s8[3];
    public final s8[] f30481c = new s8[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f30484i = new Paint(1);
    public int f30492q = org.telegram.messenger.i0.L(1.67f);
    public float f30495t = 0.8f;
    public float f30496u = 1.0f;
    public long v = 220;

    public t8(View view, boolean z10) {
        gr grVar = gr.f26495f;
        this.f30500z = new Random();
        this.f30493r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            s8[] s8VarArr = this.f30480b;
            ?? obj = new Object();
            s8VarArr[i10] = obj;
            obj.e = new ImageReceiver(view);
            ImageReceiver imageReceiver = this.f30480b[i10].e;
            imageReceiver.J0 = true;
            imageReceiver.J0(org.telegram.messenger.i0.L(12.0f));
            this.f30480b[i10].f30176a = new r8((org.telegram.ui.ActionBar.p6) null);
            this.f30480b[i10].f30176a.u(org.telegram.messenger.i0.L(12.0f));
            s8[] s8VarArr2 = this.f30481c;
            ?? obj2 = new Object();
            s8VarArr2[i10] = obj2;
            obj2.e = new ImageReceiver(view);
            ImageReceiver imageReceiver2 = this.f30481c[i10].e;
            imageReceiver2.J0 = true;
            imageReceiver2.J0(org.telegram.messenger.i0.L(12.0f));
            this.f30481c[i10].f30176a = new r8((org.telegram.ui.ActionBar.p6) null);
            this.f30481c[i10].f30176a.u(org.telegram.messenger.i0.L(12.0f));
        }
        this.f30488m = z10;
        this.f30484i.setColor(0);
        this.f30484i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10, boolean z11) {
        s8[] s8VarArr;
        s8[] s8VarArr2;
        if (this.d && z10) {
            s8[] s8VarArr3 = new s8[3];
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                s8VarArr = this.f30480b;
                s8VarArr2 = this.f30481c;
                if (i10 >= 3) {
                    break;
                }
                s8VarArr3[i10] = s8VarArr[i10];
                s8 s8Var = s8VarArr[i10];
                long j10 = s8Var.f30180g;
                s8 s8Var2 = s8VarArr2[i10];
                if (j10 != s8Var2.f30180g) {
                    z12 = true;
                } else {
                    s8Var.d = s8Var2.d;
                }
                i10++;
            }
            if (!z12) {
                this.e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (s8VarArr[i12].f30180g == s8VarArr2[i11].f30180g) {
                            s8VarArr3[i12] = null;
                            if (i11 == i12) {
                                s8 s8Var3 = s8VarArr2[i11];
                                s8Var3.f30181i = -1;
                                org.telegram.ui.Cells.g4 g4Var = s8Var3.f30177b;
                                s8 s8Var4 = s8VarArr[i11];
                                s8Var3.f30177b = s8Var4.f30177b;
                                s8Var4.f30177b = g4Var;
                            } else {
                                s8 s8Var5 = s8VarArr2[i11];
                                s8Var5.f30181i = 2;
                                s8Var5.f30182j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        s8VarArr2[i11].f30181i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                s8 s8Var6 = s8VarArr3[i13];
                if (s8Var6 != null) {
                    s8Var6.f30181i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f30482f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f30482f.cancel();
                if (this.f30497w) {
                    k();
                    this.f30497w = false;
                }
            }
            this.e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f30482f = ofFloat;
                ofFloat.addUpdateListener(new a6(this, 4));
                this.f30482f.addListener(new w5(this, 5));
                this.f30482f.setDuration(this.v);
                this.f30482f.setInterpolator(gr.f26495f);
                this.f30482f.start();
            } else {
                this.f30497w = true;
            }
            d();
            return;
        }
        this.e = 1.0f;
        k();
    }

    public final int b() {
        float f7;
        int i10 = this.f30494s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f30486k;
        if (i11 != 4 && i11 != 10) {
            f7 = 24.0f;
        } else {
            f7 = 32.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    public final float c() {
        boolean z10;
        float f7;
        int L;
        int i10 = this.f30486k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            L = org.telegram.messenger.i0.L(12.0f);
        } else {
            int i12 = this.f30494s;
            if (i12 != 0) {
                L = (int) (i12 * this.f30495t);
            } else {
                if (z10) {
                    f7 = 24.0f;
                } else {
                    f7 = 20.0f;
                }
                L = org.telegram.messenger.i0.L(f7);
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 3; i14++) {
            if (this.f30480b[i14].f30180g != 0) {
                i13++;
            }
        }
        int max = Math.max(0, i13 - 1) * L;
        if (i13 > 0) {
            i11 = b();
        }
        return max + i11;
    }

    public final void d() {
        View view = this.f30493r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f30480b[i10].e.P();
                this.f30481c[i10].e.P();
            }
        }
    }

    public final void f() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f30480b[i10].e.R();
                this.f30481c[i10].e.R();
            }
            if (this.f30486k == 3) {
                org.telegram.ui.ActionBar.t6.G0().a(0.0f);
            }
        }
    }

    public final void g(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t8.g(android.graphics.Canvas):void");
    }

    public final void h(int i10) {
        r8 r8Var;
        r8 r8Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            s8 s8Var = this.f30480b[i11];
            if (s8Var != null && (r8Var2 = s8Var.f30176a) != null) {
                r8Var2.u(i10);
            }
            s8 s8Var2 = this.f30481c[i11];
            if (s8Var2 != null && (r8Var = s8Var2.f30176a) != null) {
                r8Var.u(i10);
            }
        }
    }

    public final void i(int i10) {
        this.f30489n = i10;
        View view = this.f30493r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void j(int i10, int i11, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat;
        s8[] s8VarArr = this.f30481c;
        s8 s8Var = s8VarArr[i10];
        s8Var.f30180g = 0L;
        s8Var.f30179f = null;
        if (tLObject == null) {
            s8Var.e.w0(null);
            d();
            return;
        }
        s8Var.d = -1L;
        s8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            s8Var.f30179f = groupCallParticipant;
            long C1 = org.telegram.messenger.jj.C1(groupCallParticipant.peer);
            if (org.telegram.messenger.o5.E(C1)) {
                user = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(C1));
                s8VarArr[i10].f30176a.r(user);
                chat = null;
            } else {
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-C1));
                s8VarArr[i10].f30176a.q(L0);
                chat = L0;
                user = null;
            }
            if (this.f30486k == 4) {
                if (C1 == org.telegram.messenger.d20.i(org.telegram.messenger.c.a(i11).f14863a).e()) {
                    s8VarArr[i10].d = 0L;
                } else if (this.f30488m) {
                    s8VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    s8VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                s8VarArr[i10].d = groupCallParticipant.active_date;
            }
            s8VarArr[i10].f30180g = C1;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f30479a) {
                s8Var.f30176a.g(1);
                s8VarArr[i10].f30176a.f29871p = 0.6f;
            } else {
                s8Var.f30176a.g(0);
                r8 r8Var = s8VarArr[i10].f30176a;
                r8Var.f29871p = 1.0f;
                r8Var.r(user2);
            }
            s8VarArr[i10].f30180g = user2.f19942id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            s8Var.f30176a.g(0);
            r8 r8Var2 = s8VarArr[i10].f30176a;
            r8Var2.f29871p = 1.0f;
            r8Var2.q(chat);
            s8VarArr[i10].f30180g = -chat.f19793id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int b10 = b();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            s8VarArr[i10].f30180g = storyItem.f20031id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 50, true, null, false);
                s8VarArr[i10].e.r0(org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(storyItem.media.document.thumbs, 50, true, w9, true), storyItem.media.document), a1.g.i(b10, b10, "_"), org.telegram.messenger.ic.c(w9, storyItem.media.document), a1.g.i(b10, b10, "_"), null, 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo.sizes, 50, true, null, false);
                    s8VarArr[i10].e.r0(org.telegram.messenger.ic.i(org.telegram.messenger.b8.w(storyItem.media.photo.sizes, 50, true, w10, true), storyItem.media.photo), a1.g.i(b10, b10, "_"), org.telegram.messenger.ic.i(w10, storyItem.media.photo), a1.g.i(b10, b10, "_"), null, 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f30479a) {
                s8 s8Var2 = s8VarArr[i10];
                s8Var2.e.w0(s8Var2.f30176a);
            } else {
                s8 s8Var3 = s8VarArr[i10];
                s8Var3.e.i0(user, s8Var3.f30176a, null);
            }
        } else {
            s8 s8Var4 = s8VarArr[i10];
            s8Var4.e.i0(chat, s8Var4.f30176a, null);
        }
        s8VarArr[i10].e.J0(b10 / 2);
        float f7 = b10;
        s8VarArr[i10].e.y0(0.0f, 0.0f, f7, f7);
        d();
    }

    public final void k() {
        for (int i10 = 0; i10 < 3; i10++) {
            s8[] s8VarArr = this.f30480b;
            s8 s8Var = s8VarArr[i10];
            s8[] s8VarArr2 = this.f30481c;
            s8VarArr[i10] = s8VarArr2[i10];
            s8VarArr2[i10] = s8Var;
        }
    }
}
