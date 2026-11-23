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
public final class ok0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final g5 E;
    public final g5 F;
    public final g5 G;
    public final g5 H;
    public final g5 I;
    public final d6 J;
    public final d6 K;
    public final d6 L;
    public final d6 M;
    public final d6 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.h6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public nk0[] f38251a0;
    public float f38253b0;
    public boolean f38255c0;
    public q80 h;
    public boolean f38259i;
    public boolean f38260j;
    public Bitmap f38261k;
    public int f38262l;
    public int f38263m;
    public int f38264n;
    public int f38265o;
    public boolean f38266p;
    public boolean f38269s;
    public n5 f38270t;
    public n5 f38271u;
    public long v;
    public long f38272w;
    public int f38273x;
    public int f38274y;
    public int f38275z;
    public final RectF f38250a = new RectF();
    public final Paint f38252b = new Paint(1);
    public final Paint f38254c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] f38256e = new float[8];
    public final Path f38257f = new Path();
    public final Paint f38258g = new Paint();
    public int f38267q = 0;
    public float f38268r = 1.0f;

    public ok0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.v2(this, 14));
        }
        nr nrVar = nr.h;
        this.E = new g5(view, 400L, nrVar, 0);
        this.F = new g5(view, 400L, nrVar, 0);
        this.G = new g5(view, 400L, nrVar, 0);
        this.H = new g5(view, 400L, nrVar, 0);
        this.I = new g5(view, 400L, nrVar, 0);
        this.J = new d6(view, 0L, 400L, nrVar);
        this.K = new d6(view, 0L, 400L, nrVar);
        this.L = new d6(view, 0L, 440L, nrVar);
        this.M = new d6(view, 0L, 320L, nrVar);
        this.N = new d6(view, 0L, 320L, nrVar);
    }

    public final int a(org.telegram.messenger.gj gjVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        boolean q10;
        boolean z10;
        g5 g5Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        org.telegram.messenger.gj gjVar2;
        TLRPC.Message message2;
        int F;
        TLRPC.User user2;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int i10;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int w02;
        boolean z11;
        View view;
        TLRPC.Message message4;
        TLRPC.User user3;
        int i11;
        float f10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user4 = user;
        this.R = false;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        if (gjVar != null && !gjVar.P3() && i7 != 2 && (tL_peerColorCollectible = gjVar.f24197g1) != null) {
            return m(gjVar, tL_peerColorCollectible, h6Var);
        }
        this.V = false;
        this.v = 0L;
        this.f38272w = 0L;
        if (gjVar != null && gjVar.r4()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38269s = z10;
        g5 g5Var2 = this.I;
        float f11 = 0.1f;
        if (gjVar == null) {
            this.R = true;
            this.S = i7;
            this.T = h6Var;
            this.U = org.telegram.ui.ActionBar.t6.f30069b;
            this.f38260j = false;
            this.f38259i = false;
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ld, h6Var);
            this.B = w03;
            this.A = w03;
            this.f38275z = w03;
            if (q10) {
                f10 = 0.12f;
            } else {
                f10 = 0.1f;
            }
            this.f38273x = org.telegram.ui.ActionBar.m6.r1(f10, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nd, h6Var);
            this.f38274y = w04;
            return g5Var2.a(w04, false);
        }
        int i12 = gjVar.K1;
        if (i7 == 4 && (message4 = gjVar.f24213k) != null && org.telegram.messenger.gj.n1(message4) != null && (org.telegram.messenger.gj.n1(gjVar.f24213k) instanceof TLRPC.TL_messageMediaContact)) {
            long j3 = org.telegram.messenger.gj.n1(gjVar.f24213k).user_id;
            if (j3 != 0) {
                user3 = org.telegram.messenger.np.u1(i12).c2(Long.valueOf(j3));
            } else {
                user3 = null;
            }
            if (!gjVar.P3() && i7 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor3, h6Var);
                }
            }
            if (user3 != null) {
                i11 = org.telegram.messenger.p10.f(user3);
                g5Var = g5Var2;
                this.v = org.telegram.messenger.p10.g(user3);
            } else {
                g5Var = g5Var2;
                i11 = 0;
            }
            n(gjVar, i11, h6Var);
            this.f38273x = org.telegram.ui.ActionBar.m6.r1(0.1f, this.f38275z);
            this.f38274y = this.f38275z;
        } else {
            g5Var = g5Var2;
            if (i7 != 0 && (gjVar.f24187e1 >= 0 || (gjVar.f24213k != null && (((gjVar.p3() || org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(gjVar.f24213k))) && user4 != null) || ((gjVar.n3() && chat != null) || (((message3 = gjVar.f24213k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (gjVar.r4() && (peerColor2 = gjVar.Z0) != null && peerColor2.color != -1))))))) {
                int i13 = gjVar.f24187e1;
                if (i13 < 0) {
                    if (gjVar.r4() && (peerColor = gjVar.Z0) != null && (i10 = peerColor.color) != -1) {
                        if (i7 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                    } else {
                        TLRPC.Message message5 = gjVar.f24213k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o4 = org.telegram.messenger.n5.o(peer);
                            i10 = 5;
                            if (o4 < 0) {
                                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i12).O0(Long.valueOf(-o4));
                                if (!gjVar.P3() && i7 != 2 && O0 != null) {
                                    TLRPC.PeerColor peerColor4 = O0.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor4, h6Var);
                                    }
                                }
                                if (O0 != null) {
                                    i10 = org.telegram.messenger.v3.F(O0);
                                }
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.v3.G(O0);
                                }
                            } else {
                                TLRPC.User c22 = org.telegram.messenger.np.u1(i12).c2(Long.valueOf(o4));
                                if (!gjVar.P3() && i7 != 2 && c22 != null) {
                                    TLRPC.PeerColor peerColor5 = c22.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor5, h6Var);
                                    }
                                }
                                if (c22 != null) {
                                    i10 = org.telegram.messenger.p10.f(c22);
                                }
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.p10.g(c22);
                                }
                            }
                        } else if (org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(message5)) && user4 != null) {
                            if (gjVar.P3()) {
                                user2 = org.telegram.messenger.k10.i(i12).f();
                            } else {
                                user2 = user4;
                            }
                            if (user2 != null) {
                                user4 = user2;
                            }
                            if (!gjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor6, h6Var);
                                }
                            }
                            i13 = org.telegram.messenger.p10.f(user4);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.p10.g(user4);
                            }
                        } else if (gjVar.p3() && user4 != null) {
                            if (!gjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor7, h6Var);
                                }
                            }
                            i13 = org.telegram.messenger.p10.f(user4);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.p10.g(user4);
                            }
                        } else if (gjVar.n3() && chat != null) {
                            if (!gjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor8, h6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = gjVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User c23 = org.telegram.messenger.np.u1(i12).c2(Long.valueOf(Z0));
                                    F = org.telegram.messenger.p10.f(c23);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.p10.g(c23);
                                    }
                                } else {
                                    TLRPC.Chat O02 = org.telegram.messenger.np.u1(i12).O0(Long.valueOf(-Z0));
                                    F = org.telegram.messenger.v3.F(O02);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.v3.G(O02);
                                    }
                                }
                                i13 = F;
                            } else {
                                i13 = org.telegram.messenger.v3.F(chat);
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.v3.G(chat);
                                }
                            }
                        } else {
                            i13 = 0;
                        }
                    }
                    i13 = i10;
                }
                n(gjVar, i13, h6Var);
                this.f38273x = org.telegram.ui.ActionBar.m6.r1(0.1f, this.f38275z);
                this.f38274y = this.f38275z;
            } else if (i7 == 0 && (gjVar.f24187e1 >= 0 || ((message = gjVar.f24213k) != null && gjVar.C != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (gjVar2 = gjVar.C).f24213k) != null && message2.from_id != null && (gjVar2.p3() || org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(gjVar.f24213k)) || gjVar.C.n3()))))) {
                int i14 = gjVar.f24187e1;
                if (i14 < 0) {
                    if (org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(gjVar.C.f24213k))) {
                        if (gjVar.C.P3()) {
                            user4 = org.telegram.messenger.k10.i(gjVar.C.K1).f();
                        }
                        if (user4 != null) {
                            i14 = org.telegram.messenger.p10.f(user4);
                            this.v = org.telegram.messenger.p10.g(user4);
                        }
                        i14 = 0;
                    } else if (gjVar.C.p3()) {
                        TLRPC.User c24 = org.telegram.messenger.np.u1(i12).c2(Long.valueOf(gjVar.C.f24213k.from_id.user_id));
                        if (!gjVar.P3() && i7 != 2 && c24 != null) {
                            TLRPC.PeerColor peerColor9 = c24.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor9, h6Var);
                            }
                        }
                        if (c24 != null) {
                            i14 = org.telegram.messenger.p10.f(c24);
                            this.v = org.telegram.messenger.p10.g(c24);
                        }
                        i14 = 0;
                    } else {
                        if (gjVar.C.n3()) {
                            TLRPC.Chat O03 = org.telegram.messenger.np.u1(i12).O0(Long.valueOf(gjVar.C.f24213k.from_id.channel_id));
                            if (!gjVar.P3() && i7 != 2 && O03 != null) {
                                TLRPC.PeerColor peerColor10 = O03.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor10, h6Var);
                                }
                            }
                            if (O03 != null) {
                                i14 = org.telegram.messenger.v3.F(O03);
                                this.v = org.telegram.messenger.v3.G(O03);
                            }
                        }
                        i14 = 0;
                    }
                }
                n(gjVar.C, i14, h6Var);
                this.f38273x = org.telegram.ui.ActionBar.m6.r1(0.1f, this.f38275z);
                this.f38274y = this.f38275z;
            } else {
                this.f38259i = false;
                this.f38260j = false;
                int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ld, h6Var);
                this.B = w05;
                this.A = w05;
                this.f38275z = w05;
                this.f38273x = org.telegram.ui.ActionBar.m6.r1(0.1f, w05);
                this.f38274y = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nd, h6Var);
            }
        }
        if (gjVar.P5()) {
            this.f38259i = false;
            this.f38260j = false;
            this.B = -1;
            this.A = -1;
            this.f38275z = -1;
            this.f38273x = 0;
            this.f38274y = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Od, h6Var);
        } else if (gjVar.P3() || i7 == 2) {
            if (i7 == 2 && !gjVar.P3()) {
                int w06 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.gl, h6Var);
                this.B = w06;
                this.A = w06;
                this.f38275z = w06;
            } else {
                int i15 = org.telegram.ui.ActionBar.m6.Rb;
                Integer z02 = org.telegram.ui.ActionBar.m6.z0(i15, h6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.f38259i || this.f38260j) {
                        i15 = org.telegram.ui.ActionBar.m6.Sb;
                    }
                    w02 = org.telegram.ui.ActionBar.m6.w0(i15, h6Var);
                }
                this.B = w02;
                this.A = w02;
                this.f38275z = w02;
            }
            if (this.f38260j) {
                this.V = true;
                this.f38275z = org.telegram.ui.ActionBar.m6.r1(0.2f, this.f38275z);
                this.A = org.telegram.ui.ActionBar.m6.r1(0.5f, this.A);
            } else if (this.f38259i) {
                this.V = true;
                this.f38275z = org.telegram.ui.ActionBar.m6.r1(0.35f, this.f38275z);
            }
            int i16 = this.B;
            if (q10) {
                f11 = 0.12f;
            }
            this.f38273x = org.telegram.ui.ActionBar.m6.r1(f11, i16);
            int i17 = org.telegram.ui.ActionBar.m6.Tb;
            this.f38274y = org.telegram.ui.ActionBar.m6.w0(i17, h6Var);
            if (gjVar.P2() && gjVar.P3()) {
                this.f38273x = i0.a.k(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Oa, h6Var), i0.a.k(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.La, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29701ua, h6Var)));
                this.f38274y = org.telegram.ui.ActionBar.m6.z0(i17, h6Var).intValue();
            }
        }
        if (i7 == 0 || i7 == 3 || i7 == 4) {
            long j10 = gjVar.f24192f1;
            if (j10 != -1) {
                this.v = j10;
            }
        }
        if (this.v != 0 && this.f38270t == null && (view = this.D) != null) {
            this.f38270t = new n5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.f38270t.a();
            }
        }
        n5 n5Var = this.f38270t;
        if (n5Var != null) {
            z11 = true;
            if (n5Var.j(this.v, true)) {
                this.f38255c0 = false;
            }
        } else {
            z11 = true;
        }
        n5 n5Var2 = this.f38271u;
        if (n5Var2 != null) {
            n5Var2.j(this.f38272w, z11);
        }
        this.C = i();
        return g5Var.a(this.f38274y, false);
    }

    public final void b() {
        ok0 ok0Var;
        if (this.R && this.U != org.telegram.ui.ActionBar.t6.f30069b) {
            try {
                ok0Var = this;
            } catch (Exception e10) {
                e = e10;
                ok0Var = this;
            }
            try {
                ok0Var.a(null, null, null, this.T, this.S);
            } catch (Exception e11) {
                e = e11;
                ok0Var.R = false;
                org.telegram.messenger.a8.g(e, true);
            }
        }
    }

    public final void c(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z10, boolean z11) {
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.cz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f38256e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.cz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f13, z10, z11);
    }

    public final void e(Canvas canvas, RectF rectF, float f10, boolean z10, boolean z11) {
        boolean z12;
        fi.s2 s2Var;
        float d;
        int i7;
        n5 n5Var;
        float f11;
        b();
        if (!z11) {
            int r12 = org.telegram.ui.ActionBar.m6.r1(f10, this.E.a(this.f38273x, false));
            Paint paint = this.f38258g;
            paint.setColor(r12);
            float[] fArr = this.f38256e;
            if (a8.n7.a(fArr)) {
                float f12 = fArr[0];
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                Path path = this.f38257f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        n5 n5Var2 = this.f38270t;
        if (n5Var2 != null) {
            if (!this.f38255c0) {
                Drawable drawable = n5Var2.f37778f[0];
                if ((drawable instanceof p5) && (s2Var = ((p5) drawable).f38500k) != null && s2Var.J()) {
                    this.f38255c0 = true;
                } else {
                    z12 = false;
                    d = this.L.d(z12);
                    if (d <= 0.0f && this.f38268r > 0.0f) {
                        if (this.f38251a0 == null) {
                            i7 = 0;
                            this.f38251a0 = new nk0[]{new nk0(4.0f, -6.33f, 1.0f, 1.0f), new nk0(30.0f, 3.0f, 0.78f, 0.9f), new nk0(46.0f, -17.0f, 0.6f, 0.6f), new nk0(69.66f, -0.666f, 0.87f, 0.7f), new nk0(98.0f, -12.6f, 1.03f, 0.3f), new nk0(51.0f, 24.0f, 1.0f, 0.5f), new nk0(6.33f, 20.0f, 0.77f, 0.7f), new nk0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new nk0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i7 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.f38253b0);
                        float max = Math.max(rectF.right - org.telegram.messenger.g0.L(15.0f), rectF.centerX());
                        if (z10) {
                            max -= org.telegram.messenger.g0.L(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.g0.L(21.0f));
                        n5 n5Var3 = this.f38271u;
                        if (n5Var3 != null) {
                            n5Var3.f37782w = (int) (f10 * 255.0f);
                        }
                        this.f38270t.k(Integer.valueOf(this.C));
                        int i10 = i7;
                        while (true) {
                            nk0[] nk0VarArr = this.f38251a0;
                            if (i10 < nk0VarArr.length) {
                                if (i10 != 0 || (n5Var = this.f38271u) == null || this.f38272w == 0) {
                                    n5Var = this.f38270t;
                                }
                                nk0 nk0Var = nk0VarArr[i10];
                                if (!nk0Var.f37895e || z10) {
                                    if (n5Var == this.f38271u) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.3f;
                                    }
                                    n5Var.f37782w = (int) (f11 * 255.0f * nk0Var.d * this.f38268r);
                                    float L = max - org.telegram.messenger.g0.L(nk0Var.f37892a);
                                    float L2 = org.telegram.messenger.g0.L(nk0Var.f37893b) + min;
                                    float L3 = org.telegram.messenger.g0.L(10.0f) * nk0Var.f37894c * d;
                                    n5Var.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                                    n5Var.draw(canvas);
                                }
                                i10++;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ok0.f(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void g(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        q80 q80Var;
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.cz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f38256e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.cz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((q80Var = this.h) == null || !q80Var.d())) {
            q80 q80Var2 = this.h;
            if (q80Var2 != null) {
                q80Var2.f38814b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            q80 q80Var3 = new q80();
            this.h = q80Var3;
            q80Var3.D = true;
            q80Var3.f38830t = 3.5f;
            q80Var3.f38831u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.m6.r1(0.1f, this.f38275z), org.telegram.ui.ActionBar.m6.r1(0.3f, this.f38275z), org.telegram.ui.ActionBar.m6.r1(0.3f, this.f38275z), org.telegram.ui.ActionBar.m6.r1(1.25f, this.f38275z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f38833x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.f38273x;
    }

    public final int i() {
        if (this.V) {
            return this.A;
        }
        return this.f38275z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f10) {
        this.f38253b0 = f10;
    }

    public final void l() {
        this.F.a(this.f38275z, true);
        this.G.a(this.A, true);
        this.J.f(this.f38259i, true);
        this.I.a(this.f38274y, true);
        this.E.a(this.f38273x, true);
        n5 n5Var = this.f38270t;
        if (n5Var != null) {
            n5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.gj gjVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.h6 h6Var) {
        boolean q10;
        int i7;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i10;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
            i7 = tL_peerColorCollectible.dark_accent_color;
        } else {
            i7 = tL_peerColorCollectible.accent_color;
        }
        if (q10 && (tL_peerColorCollectible.flags & 2) != 0) {
            arrayList = tL_peerColorCollectible.dark_colors;
        } else {
            arrayList = tL_peerColorCollectible.colors;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            if (gjVar != null) {
                i10 = gjVar.e1();
            } else {
                i10 = 0;
            }
            if (i10 == this.O) {
                this.f38267q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i10;
        }
        this.V = false;
        this.f38275z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38259i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38260j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i11 = i7 | (-16777216);
        this.f38274y = i11;
        this.f38273x = org.telegram.ui.ActionBar.m6.r1(0.1f, i11);
        long j3 = tL_peerColorCollectible.background_emoji_id;
        this.v = j3;
        this.f38272w = tL_peerColorCollectible.gift_emoji_id;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        View view = this.D;
        if (i12 != 0 && this.f38270t == null && view != null) {
            this.f38270t = new n5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.f38270t.a();
            }
        }
        n5 n5Var = this.f38270t;
        if (n5Var != null && n5Var.j(this.v, true)) {
            this.f38255c0 = false;
        }
        this.C = this.f38274y;
        if (this.f38272w != 0 && this.f38271u == null && view != null) {
            this.f38271u = new n5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.f38271u.a();
            }
        }
        n5 n5Var2 = this.f38271u;
        if (n5Var2 != null) {
            n5Var2.j(this.f38272w, true);
        }
        return this.I.a(this.f38274y, false);
    }

    public final void n(org.telegram.messenger.gj gjVar, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10;
        org.telegram.messenger.cp cpVar;
        boolean z10;
        int i11;
        int i12;
        if (h6Var != null) {
            h6Var.d();
        } else {
            org.telegram.ui.ActionBar.m6.j1();
        }
        boolean z11 = true;
        if (this.P != i7) {
            if (gjVar != null) {
                i12 = gjVar.e1();
            } else {
                i12 = 0;
            }
            if (i12 == this.O) {
                this.f38267q++;
            }
            this.Q = 0L;
            this.P = i7;
            this.O = i12;
        }
        if (i7 < 7) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29642r8[i7], h6Var);
            this.B = w02;
            this.A = w02;
            this.f38275z = w02;
            this.f38260j = false;
            this.f38259i = false;
            return;
        }
        if (gjVar != null) {
            i10 = gjVar.K1;
        } else {
            i10 = org.telegram.messenger.k10.f24968t0;
        }
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(i10).f25966t4;
        if (dpVar != null) {
            cpVar = dpVar.d(i7);
        } else {
            cpVar = null;
        }
        if (cpVar == null) {
            if (gjVar != null && gjVar.P3()) {
                i11 = org.telegram.ui.ActionBar.m6.Rb;
            } else {
                i11 = org.telegram.ui.ActionBar.m6.Ld;
            }
            int w03 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
            this.B = w03;
            this.A = w03;
            this.f38275z = w03;
            this.f38260j = false;
            this.f38259i = false;
            return;
        }
        this.f38275z = cpVar.e(0, h6Var);
        this.A = cpVar.e(1, h6Var);
        int e10 = cpVar.e(2, h6Var);
        this.B = e10;
        int i13 = this.A;
        int i14 = this.f38275z;
        if (i13 != i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38259i = z10;
        if (e10 == i14) {
            z11 = false;
        }
        this.f38260j = z11;
        if (z11) {
            this.B = i13;
            this.A = e10;
        }
    }

    public final void o(float f10) {
        this.f38268r = f10;
    }

    public final int p(org.telegram.ui.ActionBar.h6 h6Var) {
        View view;
        this.R = false;
        int i7 = org.telegram.ui.ActionBar.m6.f29622q7;
        this.f38274y = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.f38275z = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.f38259i = false;
        this.f38260j = false;
        this.f38273x = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        if (this.v != 0 && this.f38270t == null && (view = this.D) != null) {
            this.f38270t = new n5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.f38270t.a();
            }
        }
        n5 n5Var = this.f38270t;
        if (n5Var != null && n5Var.j(this.v, true)) {
            this.f38255c0 = false;
        }
        this.C = i();
        return this.I.a(this.f38274y, false);
    }

    public final void q(boolean z10) {
        q80 q80Var;
        if (!z10 && this.W) {
            this.X = 0.0f;
            q80 q80Var2 = this.h;
            if (q80Var2 != null) {
                q80Var2.a();
            }
        } else if (z10 && !this.W && (q80Var = this.h) != null) {
            q80Var.f38815c = -1L;
            q80Var.f38814b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i7, boolean z10) {
        float f10;
        this.R = false;
        this.V = false;
        this.f38260j = false;
        this.f38259i = false;
        this.B = i7;
        this.A = i7;
        this.f38275z = i7;
        if (z10) {
            f10 = 0.12f;
        } else {
            f10 = 0.1f;
        }
        this.f38273x = org.telegram.ui.ActionBar.m6.r1(f10, i7);
        this.C = i7;
    }
}
