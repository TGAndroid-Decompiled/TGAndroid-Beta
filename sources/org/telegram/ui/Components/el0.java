package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class el0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final w4 E;
    public final w4 F;
    public final w4 G;
    public final w4 H;
    public final w4 I;
    public final t5 J;
    public final t5 K;
    public final t5 L;
    public final t5 M;
    public final t5 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.p6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public dl0[] f25858a0;
    public float f25860b0;
    public boolean f25862c0;
    public t80 h;
    public boolean f25865i;
    public boolean f25866j;
    public Bitmap f25867k;
    public int f25868l;
    public int f25869m;
    public int f25870n;
    public int f25871o;
    public boolean f25872p;
    public boolean f25875s;
    public d5 f25876t;
    public d5 f25877u;
    public long v;
    public long f25878w;
    public int f25879x;
    public int f25880y;
    public int f25881z;
    public final RectF f25857a = new RectF();
    public final Paint f25859b = new Paint(1);
    public final Paint f25861c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f25863f = new Path();
    public final Paint f25864g = new Paint();
    public int f25873q = 0;
    public float f25874r = 1.0f;

    public el0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new l.d(this, 8));
        }
        gr grVar = gr.h;
        this.E = new w4(view, 400L, grVar, 0);
        this.F = new w4(view, 400L, grVar, 0);
        this.G = new w4(view, 400L, grVar, 0);
        this.H = new w4(view, 400L, grVar, 0);
        this.I = new w4(view, 400L, grVar, 0);
        this.J = new t5(view, 0L, 400L, grVar);
        this.K = new t5(view, 0L, 400L, grVar);
        this.L = new t5(view, 0L, 440L, grVar);
        this.M = new t5(view, 0L, 320L, grVar);
        this.N = new t5(view, 0L, 320L, grVar);
    }

    public final int a(org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        boolean q6;
        boolean z10;
        w4 w4Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        org.telegram.messenger.kj kjVar2;
        TLRPC.Message message2;
        int F;
        TLRPC.User user2;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int i11;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int w02;
        boolean z11;
        View view;
        TLRPC.Message message4;
        TLRPC.User user3;
        int i12;
        float f7;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user4 = user;
        this.R = false;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        if (kjVar != null && !kjVar.P3() && i10 != 2 && (tL_peerColorCollectible = kjVar.f16666e1) != null) {
            return m(kjVar, tL_peerColorCollectible, p6Var);
        }
        this.V = false;
        this.v = 0L;
        this.f25878w = 0L;
        if (kjVar != null && kjVar.r4()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25875s = z10;
        w4 w4Var2 = this.I;
        float f10 = 0.1f;
        if (kjVar == null) {
            this.R = true;
            this.S = i10;
            this.T = p6Var;
            this.U = org.telegram.ui.ActionBar.a7.f20159b;
            this.f25866j = false;
            this.f25865i = false;
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Id, p6Var);
            this.B = w03;
            this.A = w03;
            this.f25881z = w03;
            if (q6) {
                f7 = 0.12f;
            } else {
                f7 = 0.1f;
            }
            this.f25879x = org.telegram.ui.ActionBar.t6.r1(f7, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kd, p6Var);
            this.f25880y = w04;
            return w4Var2.a(w04, false);
        }
        int i13 = kjVar.I1;
        if (i10 == 4 && (message4 = kjVar.f16690k) != null && org.telegram.messenger.kj.o1(message4) != null && (org.telegram.messenger.kj.o1(kjVar.f16690k) instanceof TLRPC.TL_messageMediaContact)) {
            long j10 = org.telegram.messenger.kj.o1(kjVar.f16690k).user_id;
            if (j10 != 0) {
                user3 = org.telegram.messenger.wp.r1(i13).Z1(Long.valueOf(j10));
            } else {
                user3 = null;
            }
            if (!kjVar.P3() && i10 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(kjVar, (TLRPC.TL_peerColorCollectible) peerColor3, p6Var);
                }
            }
            if (user3 != null) {
                i12 = org.telegram.messenger.i20.e(user3);
                w4Var = w4Var2;
                this.v = org.telegram.messenger.i20.f(user3);
            } else {
                w4Var = w4Var2;
                i12 = 0;
            }
            n(kjVar, i12, p6Var);
            this.f25879x = org.telegram.ui.ActionBar.t6.r1(0.1f, this.f25881z);
            this.f25880y = this.f25881z;
        } else {
            w4Var = w4Var2;
            if (i10 != 0 && (kjVar.f16658c1 >= 0 || (kjVar.f16690k != null && (((kjVar.p3() || org.telegram.messenger.o5.C(org.telegram.messenger.kj.B0(kjVar.f16690k))) && user4 != null) || ((kjVar.n3() && chat != null) || (((message3 = kjVar.f16690k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (kjVar.r4() && (peerColor2 = kjVar.X0) != null && peerColor2.color != -1))))))) {
                int i14 = kjVar.f16658c1;
                if (i14 < 0) {
                    if (kjVar.r4() && (peerColor = kjVar.X0) != null && (i11 = peerColor.color) != -1) {
                        if (i10 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                    } else {
                        TLRPC.Message message5 = kjVar.f16690k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o10 = org.telegram.messenger.o5.o(peer);
                            i11 = 5;
                            if (o10 < 0) {
                                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(-o10));
                                if (!kjVar.P3() && i10 != 2 && L0 != null) {
                                    TLRPC.PeerColor peerColor4 = L0.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(kjVar, (TLRPC.TL_peerColorCollectible) peerColor4, p6Var);
                                    }
                                }
                                if (L0 != null) {
                                    i11 = org.telegram.messenger.w3.F(L0);
                                }
                                if (i10 == 3) {
                                    this.v = org.telegram.messenger.w3.G(L0);
                                }
                            } else {
                                TLRPC.User Z1 = org.telegram.messenger.wp.r1(i13).Z1(Long.valueOf(o10));
                                if (!kjVar.P3() && i10 != 2 && Z1 != null) {
                                    TLRPC.PeerColor peerColor5 = Z1.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(kjVar, (TLRPC.TL_peerColorCollectible) peerColor5, p6Var);
                                    }
                                }
                                if (Z1 != null) {
                                    i11 = org.telegram.messenger.i20.e(Z1);
                                }
                                if (i10 == 3) {
                                    this.v = org.telegram.messenger.i20.f(Z1);
                                }
                            }
                        } else if (org.telegram.messenger.o5.C(org.telegram.messenger.kj.B0(message5)) && user4 != null) {
                            if (kjVar.P3()) {
                                user2 = org.telegram.messenger.e20.i(i13).f();
                            } else {
                                user2 = user4;
                            }
                            if (user2 != null) {
                                user4 = user2;
                            }
                            if (!kjVar.P3() && i10 != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(kjVar, (TLRPC.TL_peerColorCollectible) peerColor6, p6Var);
                                }
                            }
                            i14 = org.telegram.messenger.i20.e(user4);
                            if (i10 == 3) {
                                this.v = org.telegram.messenger.i20.f(user4);
                            }
                        } else if (kjVar.p3() && user4 != null) {
                            if (!kjVar.P3() && i10 != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(kjVar, (TLRPC.TL_peerColorCollectible) peerColor7, p6Var);
                                }
                            }
                            i14 = org.telegram.messenger.i20.e(user4);
                            if (i10 == 3) {
                                this.v = org.telegram.messenger.i20.f(user4);
                            }
                        } else if (kjVar.n3() && chat != null) {
                            if (!kjVar.P3() && i10 != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(kjVar, (TLRPC.TL_peerColorCollectible) peerColor8, p6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = kjVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User Z12 = org.telegram.messenger.wp.r1(i13).Z1(Long.valueOf(Z0));
                                    F = org.telegram.messenger.i20.e(Z12);
                                    if (i10 == 3) {
                                        this.v = org.telegram.messenger.i20.f(Z12);
                                    }
                                } else {
                                    TLRPC.Chat L02 = org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(-Z0));
                                    F = org.telegram.messenger.w3.F(L02);
                                    if (i10 == 3) {
                                        this.v = org.telegram.messenger.w3.G(L02);
                                    }
                                }
                                i14 = F;
                            } else {
                                i14 = org.telegram.messenger.w3.F(chat);
                                if (i10 == 3) {
                                    this.v = org.telegram.messenger.w3.G(chat);
                                }
                            }
                        } else {
                            i14 = 0;
                        }
                    }
                    i14 = i11;
                }
                n(kjVar, i14, p6Var);
                this.f25879x = org.telegram.ui.ActionBar.t6.r1(0.1f, this.f25881z);
                this.f25880y = this.f25881z;
            } else if (i10 == 0 && (kjVar.f16658c1 >= 0 || ((message = kjVar.f16690k) != null && kjVar.C != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (kjVar2 = kjVar.C).f16690k) != null && message2.from_id != null && (kjVar2.p3() || org.telegram.messenger.o5.C(org.telegram.messenger.kj.B0(kjVar.f16690k)) || kjVar.C.n3()))))) {
                int i15 = kjVar.f16658c1;
                if (i15 < 0) {
                    if (org.telegram.messenger.o5.C(org.telegram.messenger.kj.B0(kjVar.C.f16690k))) {
                        if (kjVar.C.P3()) {
                            user4 = org.telegram.messenger.e20.i(kjVar.C.I1).f();
                        }
                        if (user4 != null) {
                            i15 = org.telegram.messenger.i20.e(user4);
                            this.v = org.telegram.messenger.i20.f(user4);
                        }
                        i15 = 0;
                    } else if (kjVar.C.p3()) {
                        TLRPC.User Z13 = org.telegram.messenger.wp.r1(i13).Z1(Long.valueOf(kjVar.C.f16690k.from_id.user_id));
                        if (!kjVar.P3() && i10 != 2 && Z13 != null) {
                            TLRPC.PeerColor peerColor9 = Z13.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(kjVar, (TLRPC.TL_peerColorCollectible) peerColor9, p6Var);
                            }
                        }
                        if (Z13 != null) {
                            i15 = org.telegram.messenger.i20.e(Z13);
                            this.v = org.telegram.messenger.i20.f(Z13);
                        }
                        i15 = 0;
                    } else {
                        if (kjVar.C.n3()) {
                            TLRPC.Chat L03 = org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(kjVar.C.f16690k.from_id.channel_id));
                            if (!kjVar.P3() && i10 != 2 && L03 != null) {
                                TLRPC.PeerColor peerColor10 = L03.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(kjVar, (TLRPC.TL_peerColorCollectible) peerColor10, p6Var);
                                }
                            }
                            if (L03 != null) {
                                i15 = org.telegram.messenger.w3.F(L03);
                                this.v = org.telegram.messenger.w3.G(L03);
                            }
                        }
                        i15 = 0;
                    }
                }
                n(kjVar.C, i15, p6Var);
                this.f25879x = org.telegram.ui.ActionBar.t6.r1(0.1f, this.f25881z);
                this.f25880y = this.f25881z;
            } else {
                this.f25865i = false;
                this.f25866j = false;
                int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Id, p6Var);
                this.B = w05;
                this.A = w05;
                this.f25881z = w05;
                this.f25879x = org.telegram.ui.ActionBar.t6.r1(0.1f, w05);
                this.f25880y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kd, p6Var);
            }
        }
        if (kjVar.O5()) {
            this.f25865i = false;
            this.f25866j = false;
            this.B = -1;
            this.A = -1;
            this.f25881z = -1;
            this.f25879x = 0;
            this.f25880y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ld, p6Var);
        } else if (kjVar.P3() || i10 == 2) {
            if (i10 == 2 && !kjVar.P3()) {
                int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.dl, p6Var);
                this.B = w06;
                this.A = w06;
                this.f25881z = w06;
            } else {
                int i16 = org.telegram.ui.ActionBar.t6.Ob;
                Integer z02 = org.telegram.ui.ActionBar.t6.z0(i16, p6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.f25865i || this.f25866j) {
                        i16 = org.telegram.ui.ActionBar.t6.Pb;
                    }
                    w02 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
                }
                this.B = w02;
                this.A = w02;
                this.f25881z = w02;
            }
            if (this.f25866j) {
                this.V = true;
                this.f25881z = org.telegram.ui.ActionBar.t6.r1(0.2f, this.f25881z);
                this.A = org.telegram.ui.ActionBar.t6.r1(0.5f, this.A);
            } else if (this.f25865i) {
                this.V = true;
                this.f25881z = org.telegram.ui.ActionBar.t6.r1(0.35f, this.f25881z);
            }
            int i17 = this.B;
            if (q6) {
                f10 = 0.12f;
            }
            this.f25879x = org.telegram.ui.ActionBar.t6.r1(f10, i17);
            int i18 = org.telegram.ui.ActionBar.t6.Qb;
            this.f25880y = org.telegram.ui.ActionBar.t6.w0(i18, p6Var);
            if (kjVar.P2() && kjVar.P3()) {
                this.f25879x = i0.b.k(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Oa, p6Var), i0.b.k(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.La, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ua, p6Var)));
                this.f25880y = org.telegram.ui.ActionBar.t6.z0(i18, p6Var).intValue();
            }
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = kjVar.f16662d1;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f25876t == null && (view = this.D) != null) {
            this.f25876t = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f25876t.a();
            }
        }
        d5 d5Var = this.f25876t;
        if (d5Var != null) {
            z11 = true;
            if (d5Var.j(this.v, true)) {
                this.f25862c0 = false;
            }
        } else {
            z11 = true;
        }
        d5 d5Var2 = this.f25877u;
        if (d5Var2 != null) {
            d5Var2.j(this.f25878w, z11);
        }
        this.C = i();
        return w4Var.a(this.f25880y, false);
    }

    public final void b() {
        el0 el0Var;
        if (this.R && this.U != org.telegram.ui.ActionBar.a7.f20159b) {
            try {
                el0Var = this;
            } catch (Exception e) {
                e = e;
                el0Var = this;
            }
            try {
                el0Var.a(null, null, null, this.T, this.S);
            } catch (Exception e7) {
                e = e7;
                el0Var.R = false;
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void c(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f7, f10, f11, f12, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12, boolean z10, boolean z11) {
        float max = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.uz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.i0.L(f10);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.i0.L(f11);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.uz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f11));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f12, z10, z11);
    }

    public final void e(Canvas canvas, RectF rectF, float f7, boolean z10, boolean z11) {
        boolean z12;
        ag.c2 c2Var;
        float d;
        int i10;
        d5 d5Var;
        float f10;
        b();
        if (!z11) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(f7, this.E.a(this.f25879x, false));
            Paint paint = this.f25864g;
            paint.setColor(r12);
            float[] fArr = this.e;
            if (w7.o7.a(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f25863f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        d5 d5Var2 = this.f25876t;
        if (d5Var2 != null) {
            if (!this.f25862c0) {
                Drawable drawable = d5Var2.f25372f[0];
                if ((drawable instanceof f5) && (c2Var = ((f5) drawable).f26070k) != null && c2Var.J()) {
                    this.f25862c0 = true;
                } else {
                    z12 = false;
                    d = this.L.d(z12);
                    if (d <= 0.0f && this.f25874r > 0.0f) {
                        if (this.f25858a0 == null) {
                            i10 = 0;
                            this.f25858a0 = new dl0[]{new dl0(4.0f, -6.33f, 1.0f, 1.0f), new dl0(30.0f, 3.0f, 0.78f, 0.9f), new dl0(46.0f, -17.0f, 0.6f, 0.6f), new dl0(69.66f, -0.666f, 0.87f, 0.7f), new dl0(98.0f, -12.6f, 1.03f, 0.3f), new dl0(51.0f, 24.0f, 1.0f, 0.5f), new dl0(6.33f, 20.0f, 0.77f, 0.7f), new dl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new dl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i10 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.f25860b0);
                        float max = Math.max(rectF.right - org.telegram.messenger.i0.L(15.0f), rectF.centerX());
                        if (z10) {
                            max -= org.telegram.messenger.i0.L(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.i0.L(21.0f));
                        d5 d5Var3 = this.f25877u;
                        if (d5Var3 != null) {
                            d5Var3.f25376w = (int) (f7 * 255.0f);
                        }
                        this.f25876t.k(Integer.valueOf(this.C));
                        int i11 = i10;
                        while (true) {
                            dl0[] dl0VarArr = this.f25858a0;
                            if (i11 < dl0VarArr.length) {
                                if (i11 != 0 || (d5Var = this.f25877u) == null || this.f25878w == 0) {
                                    d5Var = this.f25876t;
                                }
                                dl0 dl0Var = dl0VarArr[i11];
                                if (!dl0Var.e || z10) {
                                    if (d5Var == this.f25877u) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.3f;
                                    }
                                    d5Var.f25376w = (int) (f10 * 255.0f * dl0Var.d * this.f25874r);
                                    float L = max - org.telegram.messenger.i0.L(dl0Var.f25509a);
                                    float L2 = org.telegram.messenger.i0.L(dl0Var.f25510b) + min;
                                    float L3 = org.telegram.messenger.i0.L(10.0f) * dl0Var.f25511c * d;
                                    d5Var.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                                    d5Var.draw(canvas);
                                }
                                i11++;
                            } else {
                                canvas.restore();
                                return;
                            }
                        }
                    }
                }
            }
            z12 = true;
            d = this.L.d(z12);
            if (d <= 0.0f) {
            }
        }
    }

    public final void f(android.graphics.Canvas r27, android.graphics.RectF r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.el0.f(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void g(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        t80 t80Var;
        float max = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.uz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.i0.L(f10);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.i0.L(f11);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.uz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f11));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((t80Var = this.h) == null || !t80Var.d())) {
            t80 t80Var2 = this.h;
            if (t80Var2 != null) {
                t80Var2.f30574b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            t80 t80Var3 = new t80();
            this.h = t80Var3;
            t80Var3.D = true;
            t80Var3.f30589t = 3.5f;
            t80Var3.f30590u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.t6.r1(0.1f, this.f25881z), org.telegram.ui.ActionBar.t6.r1(0.3f, this.f25881z), org.telegram.ui.ActionBar.t6.r1(0.3f, this.f25881z), org.telegram.ui.ActionBar.t6.r1(1.25f, this.f25881z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f30592x.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.f25879x;
    }

    public final int i() {
        if (this.V) {
            return this.A;
        }
        return this.f25881z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f7) {
        this.f25860b0 = f7;
    }

    public final void l() {
        this.F.a(this.f25881z, true);
        this.G.a(this.A, true);
        this.J.f(this.f25865i, true);
        this.I.a(this.f25880y, true);
        this.E.a(this.f25879x, true);
        d5 d5Var = this.f25876t;
        if (d5Var != null) {
            d5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.kj kjVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.p6 p6Var) {
        boolean q6;
        int i10;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i11;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        if (q6 && (tL_peerColorCollectible.flags & 1) != 0) {
            i10 = tL_peerColorCollectible.dark_accent_color;
        } else {
            i10 = tL_peerColorCollectible.accent_color;
        }
        if (q6 && (tL_peerColorCollectible.flags & 2) != 0) {
            arrayList = tL_peerColorCollectible.dark_colors;
        } else {
            arrayList = tL_peerColorCollectible.colors;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            if (kjVar != null) {
                i11 = kjVar.f1();
            } else {
                i11 = 0;
            }
            if (i11 == this.O) {
                this.f25873q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i11;
        }
        this.V = false;
        this.f25881z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25865i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25866j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i12 = i10 | (-16777216);
        this.f25880y = i12;
        this.f25879x = org.telegram.ui.ActionBar.t6.r1(0.1f, i12);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f25878w = tL_peerColorCollectible.gift_emoji_id;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        View view = this.D;
        if (i13 != 0 && this.f25876t == null && view != null) {
            this.f25876t = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f25876t.a();
            }
        }
        d5 d5Var = this.f25876t;
        if (d5Var != null && d5Var.j(this.v, true)) {
            this.f25862c0 = false;
        }
        this.C = this.f25880y;
        if (this.f25878w != 0 && this.f25877u == null && view != null) {
            this.f25877u = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f25877u.a();
            }
        }
        d5 d5Var2 = this.f25877u;
        if (d5Var2 != null) {
            d5Var2.j(this.f25878w, true);
        }
        return this.I.a(this.f25880y, false);
    }

    public final void n(org.telegram.messenger.kj kjVar, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        org.telegram.messenger.lp lpVar;
        boolean z10;
        int i12;
        int i13;
        if (p6Var != null) {
            p6Var.a();
        } else {
            org.telegram.ui.ActionBar.t6.j1();
        }
        boolean z11 = true;
        if (this.P != i10) {
            if (kjVar != null) {
                i13 = kjVar.f1();
            } else {
                i13 = 0;
            }
            if (i13 == this.O) {
                this.f25873q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = i13;
        }
        if (i10 < 7) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21189r8[i10], p6Var);
            this.B = w02;
            this.A = w02;
            this.f25881z = w02;
            this.f25866j = false;
            this.f25865i = false;
            return;
        }
        if (kjVar != null) {
            i11 = kjVar.I1;
        } else {
            i11 = org.telegram.messenger.e20.f15506s0;
        }
        org.telegram.messenger.mp mpVar = org.telegram.messenger.wp.r1(i11).f19231r4;
        if (mpVar != null) {
            lpVar = mpVar.d(i10);
        } else {
            lpVar = null;
        }
        if (lpVar == null) {
            if (kjVar != null && kjVar.P3()) {
                i12 = org.telegram.ui.ActionBar.t6.Ob;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.Id;
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            this.B = w03;
            this.A = w03;
            this.f25881z = w03;
            this.f25866j = false;
            this.f25865i = false;
            return;
        }
        this.f25881z = lpVar.e(0, p6Var);
        this.A = lpVar.e(1, p6Var);
        int e = lpVar.e(2, p6Var);
        this.B = e;
        int i14 = this.A;
        int i15 = this.f25881z;
        if (i14 != i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25865i = z10;
        if (e == i15) {
            z11 = false;
        }
        this.f25866j = z11;
        if (z11) {
            this.B = i14;
            this.A = e;
        }
    }

    public final void o(float f7) {
        this.f25874r = f7;
    }

    public final int p(org.telegram.ui.ActionBar.p6 p6Var) {
        View view;
        this.R = false;
        int i10 = org.telegram.ui.ActionBar.t6.f21171q7;
        this.f25880y = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.f25881z = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.f25865i = false;
        this.f25866j = false;
        this.f25879x = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        if (this.v != 0 && this.f25876t == null && (view = this.D) != null) {
            this.f25876t = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f25876t.a();
            }
        }
        d5 d5Var = this.f25876t;
        if (d5Var != null && d5Var.j(this.v, true)) {
            this.f25862c0 = false;
        }
        this.C = i();
        return this.I.a(this.f25880y, false);
    }

    public final void q(boolean z10) {
        t80 t80Var;
        if (!z10 && this.W) {
            this.X = 0.0f;
            t80 t80Var2 = this.h;
            if (t80Var2 != null) {
                t80Var2.a();
            }
        } else if (z10 && !this.W && (t80Var = this.h) != null) {
            t80Var.f30575c = -1L;
            t80Var.f30574b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i10, boolean z10) {
        float f7;
        this.R = false;
        this.V = false;
        this.f25866j = false;
        this.f25865i = false;
        this.B = i10;
        this.A = i10;
        this.f25881z = i10;
        if (z10) {
            f7 = 0.12f;
        } else {
            f7 = 0.1f;
        }
        this.f25879x = org.telegram.ui.ActionBar.t6.r1(f7, i10);
        this.C = i10;
    }
}
