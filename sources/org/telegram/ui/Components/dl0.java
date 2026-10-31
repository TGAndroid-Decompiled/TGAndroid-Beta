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
public final class dl0 {
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
    public cl0[] f25439a0;
    public float f25441b0;
    public boolean f25443c0;
    public t80 h;
    public boolean f25446i;
    public boolean f25447j;
    public Bitmap f25448k;
    public int f25449l;
    public int f25450m;
    public int f25451n;
    public int f25452o;
    public boolean f25453p;
    public boolean f25456s;
    public d5 f25457t;
    public d5 f25458u;
    public long v;
    public long f25459w;
    public int f25460x;
    public int f25461y;
    public int f25462z;
    public final RectF f25438a = new RectF();
    public final Paint f25440b = new Paint(1);
    public final Paint f25442c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f25444f = new Path();
    public final Paint f25445g = new Paint();
    public int f25454q = 0;
    public float f25455r = 1.0f;

    public dl0(View view) {
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

    public final int a(org.telegram.messenger.jj jjVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        boolean q6;
        boolean z10;
        w4 w4Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        org.telegram.messenger.jj jjVar2;
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
        if (jjVar != null && !jjVar.P3() && i10 != 2 && (tL_peerColorCollectible = jjVar.f16313e1) != null) {
            return m(jjVar, tL_peerColorCollectible, p6Var);
        }
        this.V = false;
        this.v = 0L;
        this.f25459w = 0L;
        if (jjVar != null && jjVar.r4()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25456s = z10;
        w4 w4Var2 = this.I;
        float f10 = 0.1f;
        if (jjVar == null) {
            this.R = true;
            this.S = i10;
            this.T = p6Var;
            this.U = org.telegram.ui.ActionBar.a7.f20158b;
            this.f25447j = false;
            this.f25446i = false;
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Id, p6Var);
            this.B = w03;
            this.A = w03;
            this.f25462z = w03;
            if (q6) {
                f7 = 0.12f;
            } else {
                f7 = 0.1f;
            }
            this.f25460x = org.telegram.ui.ActionBar.t6.r1(f7, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kd, p6Var);
            this.f25461y = w04;
            return w4Var2.a(w04, false);
        }
        int i13 = jjVar.I1;
        if (i10 == 4 && (message4 = jjVar.f16337k) != null && org.telegram.messenger.jj.o1(message4) != null && (org.telegram.messenger.jj.o1(jjVar.f16337k) instanceof TLRPC.TL_messageMediaContact)) {
            long j10 = org.telegram.messenger.jj.o1(jjVar.f16337k).user_id;
            if (j10 != 0) {
                user3 = org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(j10));
            } else {
                user3 = null;
            }
            if (!jjVar.P3() && i10 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor3, p6Var);
                }
            }
            if (user3 != null) {
                i12 = org.telegram.messenger.h20.e(user3);
                w4Var = w4Var2;
                this.v = org.telegram.messenger.h20.f(user3);
            } else {
                w4Var = w4Var2;
                i12 = 0;
            }
            n(jjVar, i12, p6Var);
            this.f25460x = org.telegram.ui.ActionBar.t6.r1(0.1f, this.f25462z);
            this.f25461y = this.f25462z;
        } else {
            w4Var = w4Var2;
            if (i10 != 0 && (jjVar.f16305c1 >= 0 || (jjVar.f16337k != null && (((jjVar.p3() || org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(jjVar.f16337k))) && user4 != null) || ((jjVar.n3() && chat != null) || (((message3 = jjVar.f16337k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (jjVar.r4() && (peerColor2 = jjVar.X0) != null && peerColor2.color != -1))))))) {
                int i14 = jjVar.f16305c1;
                if (i14 < 0) {
                    if (jjVar.r4() && (peerColor = jjVar.X0) != null && (i11 = peerColor.color) != -1) {
                        if (i10 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                    } else {
                        TLRPC.Message message5 = jjVar.f16337k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o10 = org.telegram.messenger.o5.o(peer);
                            i11 = 5;
                            if (o10 < 0) {
                                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i13).L0(Long.valueOf(-o10));
                                if (!jjVar.P3() && i10 != 2 && L0 != null) {
                                    TLRPC.PeerColor peerColor4 = L0.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor4, p6Var);
                                    }
                                }
                                if (L0 != null) {
                                    i11 = org.telegram.messenger.w3.F(L0);
                                }
                                if (i10 == 3) {
                                    this.v = org.telegram.messenger.w3.G(L0);
                                }
                            } else {
                                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(o10));
                                if (!jjVar.P3() && i10 != 2 && Z1 != null) {
                                    TLRPC.PeerColor peerColor5 = Z1.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor5, p6Var);
                                    }
                                }
                                if (Z1 != null) {
                                    i11 = org.telegram.messenger.h20.e(Z1);
                                }
                                if (i10 == 3) {
                                    this.v = org.telegram.messenger.h20.f(Z1);
                                }
                            }
                        } else if (org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(message5)) && user4 != null) {
                            if (jjVar.P3()) {
                                user2 = org.telegram.messenger.d20.i(i13).f();
                            } else {
                                user2 = user4;
                            }
                            if (user2 != null) {
                                user4 = user2;
                            }
                            if (!jjVar.P3() && i10 != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor6, p6Var);
                                }
                            }
                            i14 = org.telegram.messenger.h20.e(user4);
                            if (i10 == 3) {
                                this.v = org.telegram.messenger.h20.f(user4);
                            }
                        } else if (jjVar.p3() && user4 != null) {
                            if (!jjVar.P3() && i10 != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor7, p6Var);
                                }
                            }
                            i14 = org.telegram.messenger.h20.e(user4);
                            if (i10 == 3) {
                                this.v = org.telegram.messenger.h20.f(user4);
                            }
                        } else if (jjVar.n3() && chat != null) {
                            if (!jjVar.P3() && i10 != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor8, p6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = jjVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User Z12 = org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(Z0));
                                    F = org.telegram.messenger.h20.e(Z12);
                                    if (i10 == 3) {
                                        this.v = org.telegram.messenger.h20.f(Z12);
                                    }
                                } else {
                                    TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i13).L0(Long.valueOf(-Z0));
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
                n(jjVar, i14, p6Var);
                this.f25460x = org.telegram.ui.ActionBar.t6.r1(0.1f, this.f25462z);
                this.f25461y = this.f25462z;
            } else if (i10 == 0 && (jjVar.f16305c1 >= 0 || ((message = jjVar.f16337k) != null && jjVar.C != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (jjVar2 = jjVar.C).f16337k) != null && message2.from_id != null && (jjVar2.p3() || org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(jjVar.f16337k)) || jjVar.C.n3()))))) {
                int i15 = jjVar.f16305c1;
                if (i15 < 0) {
                    if (org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(jjVar.C.f16337k))) {
                        if (jjVar.C.P3()) {
                            user4 = org.telegram.messenger.d20.i(jjVar.C.I1).f();
                        }
                        if (user4 != null) {
                            i15 = org.telegram.messenger.h20.e(user4);
                            this.v = org.telegram.messenger.h20.f(user4);
                        }
                        i15 = 0;
                    } else if (jjVar.C.p3()) {
                        TLRPC.User Z13 = org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(jjVar.C.f16337k.from_id.user_id));
                        if (!jjVar.P3() && i10 != 2 && Z13 != null) {
                            TLRPC.PeerColor peerColor9 = Z13.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor9, p6Var);
                            }
                        }
                        if (Z13 != null) {
                            i15 = org.telegram.messenger.h20.e(Z13);
                            this.v = org.telegram.messenger.h20.f(Z13);
                        }
                        i15 = 0;
                    } else {
                        if (jjVar.C.n3()) {
                            TLRPC.Chat L03 = org.telegram.messenger.vp.r1(i13).L0(Long.valueOf(jjVar.C.f16337k.from_id.channel_id));
                            if (!jjVar.P3() && i10 != 2 && L03 != null) {
                                TLRPC.PeerColor peerColor10 = L03.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(jjVar, (TLRPC.TL_peerColorCollectible) peerColor10, p6Var);
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
                n(jjVar.C, i15, p6Var);
                this.f25460x = org.telegram.ui.ActionBar.t6.r1(0.1f, this.f25462z);
                this.f25461y = this.f25462z;
            } else {
                this.f25446i = false;
                this.f25447j = false;
                int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Id, p6Var);
                this.B = w05;
                this.A = w05;
                this.f25462z = w05;
                this.f25460x = org.telegram.ui.ActionBar.t6.r1(0.1f, w05);
                this.f25461y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kd, p6Var);
            }
        }
        if (jjVar.O5()) {
            this.f25446i = false;
            this.f25447j = false;
            this.B = -1;
            this.A = -1;
            this.f25462z = -1;
            this.f25460x = 0;
            this.f25461y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ld, p6Var);
        } else if (jjVar.P3() || i10 == 2) {
            if (i10 == 2 && !jjVar.P3()) {
                int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.dl, p6Var);
                this.B = w06;
                this.A = w06;
                this.f25462z = w06;
            } else {
                int i16 = org.telegram.ui.ActionBar.t6.Ob;
                Integer z02 = org.telegram.ui.ActionBar.t6.z0(i16, p6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.f25446i || this.f25447j) {
                        i16 = org.telegram.ui.ActionBar.t6.Pb;
                    }
                    w02 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
                }
                this.B = w02;
                this.A = w02;
                this.f25462z = w02;
            }
            if (this.f25447j) {
                this.V = true;
                this.f25462z = org.telegram.ui.ActionBar.t6.r1(0.2f, this.f25462z);
                this.A = org.telegram.ui.ActionBar.t6.r1(0.5f, this.A);
            } else if (this.f25446i) {
                this.V = true;
                this.f25462z = org.telegram.ui.ActionBar.t6.r1(0.35f, this.f25462z);
            }
            int i17 = this.B;
            if (q6) {
                f10 = 0.12f;
            }
            this.f25460x = org.telegram.ui.ActionBar.t6.r1(f10, i17);
            int i18 = org.telegram.ui.ActionBar.t6.Qb;
            this.f25461y = org.telegram.ui.ActionBar.t6.w0(i18, p6Var);
            if (jjVar.P2() && jjVar.P3()) {
                this.f25460x = i0.b.k(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Oa, p6Var), i0.b.k(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.La, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ua, p6Var)));
                this.f25461y = org.telegram.ui.ActionBar.t6.z0(i18, p6Var).intValue();
            }
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = jjVar.f16309d1;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f25457t == null && (view = this.D) != null) {
            this.f25457t = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f25457t.a();
            }
        }
        d5 d5Var = this.f25457t;
        if (d5Var != null) {
            z11 = true;
            if (d5Var.j(this.v, true)) {
                this.f25443c0 = false;
            }
        } else {
            z11 = true;
        }
        d5 d5Var2 = this.f25458u;
        if (d5Var2 != null) {
            d5Var2.j(this.f25459w, z11);
        }
        this.C = i();
        return w4Var.a(this.f25461y, false);
    }

    public final void b() {
        dl0 dl0Var;
        if (this.R && this.U != org.telegram.ui.ActionBar.a7.f20158b) {
            try {
                dl0Var = this;
            } catch (Exception e) {
                e = e;
                dl0Var = this;
            }
            try {
                dl0Var.a(null, null, null, this.T, this.S);
            } catch (Exception e7) {
                e = e7;
                dl0Var.R = false;
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void c(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f7, f10, f11, f12, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12, boolean z10, boolean z11) {
        float max = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.tz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.i0.L(f10);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.i0.L(f11);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.tz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f11));
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
            int r12 = org.telegram.ui.ActionBar.t6.r1(f7, this.E.a(this.f25460x, false));
            Paint paint = this.f25445g;
            paint.setColor(r12);
            float[] fArr = this.e;
            if (w7.o7.a(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f25444f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        d5 d5Var2 = this.f25457t;
        if (d5Var2 != null) {
            if (!this.f25443c0) {
                Drawable drawable = d5Var2.f25301f[0];
                if ((drawable instanceof f5) && (c2Var = ((f5) drawable).f25975k) != null && c2Var.J()) {
                    this.f25443c0 = true;
                } else {
                    z12 = false;
                    d = this.L.d(z12);
                    if (d <= 0.0f && this.f25455r > 0.0f) {
                        if (this.f25439a0 == null) {
                            i10 = 0;
                            this.f25439a0 = new cl0[]{new cl0(4.0f, -6.33f, 1.0f, 1.0f), new cl0(30.0f, 3.0f, 0.78f, 0.9f), new cl0(46.0f, -17.0f, 0.6f, 0.6f), new cl0(69.66f, -0.666f, 0.87f, 0.7f), new cl0(98.0f, -12.6f, 1.03f, 0.3f), new cl0(51.0f, 24.0f, 1.0f, 0.5f), new cl0(6.33f, 20.0f, 0.77f, 0.7f), new cl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new cl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i10 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.f25441b0);
                        float max = Math.max(rectF.right - org.telegram.messenger.i0.L(15.0f), rectF.centerX());
                        if (z10) {
                            max -= org.telegram.messenger.i0.L(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.i0.L(21.0f));
                        d5 d5Var3 = this.f25458u;
                        if (d5Var3 != null) {
                            d5Var3.f25305w = (int) (f7 * 255.0f);
                        }
                        this.f25457t.k(Integer.valueOf(this.C));
                        int i11 = i10;
                        while (true) {
                            cl0[] cl0VarArr = this.f25439a0;
                            if (i11 < cl0VarArr.length) {
                                if (i11 != 0 || (d5Var = this.f25458u) == null || this.f25459w == 0) {
                                    d5Var = this.f25457t;
                                }
                                cl0 cl0Var = cl0VarArr[i11];
                                if (!cl0Var.e || z10) {
                                    if (d5Var == this.f25458u) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.3f;
                                    }
                                    d5Var.f25305w = (int) (f10 * 255.0f * cl0Var.d * this.f25455r);
                                    float L = max - org.telegram.messenger.i0.L(cl0Var.f25094a);
                                    float L2 = org.telegram.messenger.i0.L(cl0Var.f25095b) + min;
                                    float L3 = org.telegram.messenger.i0.L(10.0f) * cl0Var.f25096c * d;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dl0.f(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void g(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        t80 t80Var;
        float max = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.tz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.i0.L(f10);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.i0.L(f11);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.i0.L((int) Math.floor(org.telegram.messenger.tz.Y0 / 3.0f)), org.telegram.messenger.i0.L(f11));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((t80Var = this.h) == null || !t80Var.d())) {
            t80 t80Var2 = this.h;
            if (t80Var2 != null) {
                t80Var2.f30502b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            t80 t80Var3 = new t80();
            this.h = t80Var3;
            t80Var3.D = true;
            t80Var3.f30517t = 3.5f;
            t80Var3.f30518u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.t6.r1(0.1f, this.f25462z), org.telegram.ui.ActionBar.t6.r1(0.3f, this.f25462z), org.telegram.ui.ActionBar.t6.r1(0.3f, this.f25462z), org.telegram.ui.ActionBar.t6.r1(1.25f, this.f25462z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f30520x.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.f25460x;
    }

    public final int i() {
        if (this.V) {
            return this.A;
        }
        return this.f25462z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f7) {
        this.f25441b0 = f7;
    }

    public final void l() {
        this.F.a(this.f25462z, true);
        this.G.a(this.A, true);
        this.J.f(this.f25446i, true);
        this.I.a(this.f25461y, true);
        this.E.a(this.f25460x, true);
        d5 d5Var = this.f25457t;
        if (d5Var != null) {
            d5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.jj jjVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.p6 p6Var) {
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
            if (jjVar != null) {
                i11 = jjVar.f1();
            } else {
                i11 = 0;
            }
            if (i11 == this.O) {
                this.f25454q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i11;
        }
        this.V = false;
        this.f25462z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25446i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25447j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i12 = i10 | (-16777216);
        this.f25461y = i12;
        this.f25460x = org.telegram.ui.ActionBar.t6.r1(0.1f, i12);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f25459w = tL_peerColorCollectible.gift_emoji_id;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        View view = this.D;
        if (i13 != 0 && this.f25457t == null && view != null) {
            this.f25457t = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f25457t.a();
            }
        }
        d5 d5Var = this.f25457t;
        if (d5Var != null && d5Var.j(this.v, true)) {
            this.f25443c0 = false;
        }
        this.C = this.f25461y;
        if (this.f25459w != 0 && this.f25458u == null && view != null) {
            this.f25458u = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f25458u.a();
            }
        }
        d5 d5Var2 = this.f25458u;
        if (d5Var2 != null) {
            d5Var2.j(this.f25459w, true);
        }
        return this.I.a(this.f25461y, false);
    }

    public final void n(org.telegram.messenger.jj jjVar, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        org.telegram.messenger.kp kpVar;
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
            if (jjVar != null) {
                i13 = jjVar.f1();
            } else {
                i13 = 0;
            }
            if (i13 == this.O) {
                this.f25454q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = i13;
        }
        if (i10 < 7) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21188r8[i10], p6Var);
            this.B = w02;
            this.A = w02;
            this.f25462z = w02;
            this.f25447j = false;
            this.f25446i = false;
            return;
        }
        if (jjVar != null) {
            i11 = jjVar.I1;
        } else {
            i11 = org.telegram.messenger.d20.f15147s0;
        }
        org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(i11).f18888r4;
        if (lpVar != null) {
            kpVar = lpVar.d(i10);
        } else {
            kpVar = null;
        }
        if (kpVar == null) {
            if (jjVar != null && jjVar.P3()) {
                i12 = org.telegram.ui.ActionBar.t6.Ob;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.Id;
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            this.B = w03;
            this.A = w03;
            this.f25462z = w03;
            this.f25447j = false;
            this.f25446i = false;
            return;
        }
        this.f25462z = kpVar.e(0, p6Var);
        this.A = kpVar.e(1, p6Var);
        int e = kpVar.e(2, p6Var);
        this.B = e;
        int i14 = this.A;
        int i15 = this.f25462z;
        if (i14 != i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25446i = z10;
        if (e == i15) {
            z11 = false;
        }
        this.f25447j = z11;
        if (z11) {
            this.B = i14;
            this.A = e;
        }
    }

    public final void o(float f7) {
        this.f25455r = f7;
    }

    public final int p(org.telegram.ui.ActionBar.p6 p6Var) {
        View view;
        this.R = false;
        int i10 = org.telegram.ui.ActionBar.t6.f21170q7;
        this.f25461y = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.f25462z = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.f25446i = false;
        this.f25447j = false;
        this.f25460x = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        if (this.v != 0 && this.f25457t == null && (view = this.D) != null) {
            this.f25457t = new d5(org.telegram.messenger.i0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f25457t.a();
            }
        }
        d5 d5Var = this.f25457t;
        if (d5Var != null && d5Var.j(this.v, true)) {
            this.f25443c0 = false;
        }
        this.C = i();
        return this.I.a(this.f25461y, false);
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
            t80Var.f30503c = -1L;
            t80Var.f30502b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i10, boolean z10) {
        float f7;
        this.R = false;
        this.V = false;
        this.f25447j = false;
        this.f25446i = false;
        this.B = i10;
        this.A = i10;
        this.f25462z = i10;
        if (z10) {
            f7 = 0.12f;
        } else {
            f7 = 0.1f;
        }
        this.f25460x = org.telegram.ui.ActionBar.t6.r1(f7, i10);
        this.C = i10;
    }
}
