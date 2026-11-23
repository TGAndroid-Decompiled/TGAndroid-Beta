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
    public final f5 E;
    public final f5 F;
    public final f5 G;
    public final f5 H;
    public final f5 I;
    public final c6 J;
    public final c6 K;
    public final c6 L;
    public final c6 M;
    public final c6 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.i6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public nk0[] f38171a0;
    public float f38173b0;
    public boolean f38175c0;
    public n80 h;
    public boolean f38179i;
    public boolean f38180j;
    public Bitmap f38181k;
    public int f38182l;
    public int f38183m;
    public int f38184n;
    public int f38185o;
    public boolean f38186p;
    public boolean f38189s;
    public m5 f38190t;
    public m5 f38191u;
    public long v;
    public long f38192w;
    public int f38193x;
    public int f38194y;
    public int f38195z;
    public final RectF f38170a = new RectF();
    public final Paint f38172b = new Paint(1);
    public final Paint f38174c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] f38176e = new float[8];
    public final Path f38177f = new Path();
    public final Paint f38178g = new Paint();
    public int f38187q = 0;
    public float f38188r = 1.0f;

    public ok0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.x2(this, 14));
        }
        kr krVar = kr.h;
        this.E = new f5(view, 400L, krVar, 0);
        this.F = new f5(view, 400L, krVar, 0);
        this.G = new f5(view, 400L, krVar, 0);
        this.H = new f5(view, 400L, krVar, 0);
        this.I = new f5(view, 400L, krVar, 0);
        this.J = new c6(view, 0L, 400L, krVar);
        this.K = new c6(view, 0L, 400L, krVar);
        this.L = new c6(view, 0L, 440L, krVar);
        this.M = new c6(view, 0L, 320L, krVar);
        this.N = new c6(view, 0L, 320L, krVar);
    }

    public final int a(org.telegram.messenger.fj fjVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        boolean q10;
        boolean z10;
        f5 f5Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        org.telegram.messenger.fj fjVar2;
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
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        if (fjVar != null && !fjVar.P3() && i7 != 2 && (tL_peerColorCollectible = fjVar.f24057g1) != null) {
            return m(fjVar, tL_peerColorCollectible, i6Var);
        }
        this.V = false;
        this.v = 0L;
        this.f38192w = 0L;
        if (fjVar != null && fjVar.r4()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38189s = z10;
        f5 f5Var2 = this.I;
        float f11 = 0.1f;
        if (fjVar == null) {
            this.R = true;
            this.S = i7;
            this.T = i6Var;
            this.U = org.telegram.ui.ActionBar.u6.f30164b;
            this.f38180j = false;
            this.f38179i = false;
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ld, i6Var);
            this.B = w03;
            this.A = w03;
            this.f38195z = w03;
            if (q10) {
                f10 = 0.12f;
            } else {
                f10 = 0.1f;
            }
            this.f38193x = org.telegram.ui.ActionBar.n6.r1(f10, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nd, i6Var);
            this.f38194y = w04;
            return f5Var2.a(w04, false);
        }
        int i12 = fjVar.K1;
        if (i7 == 4 && (message4 = fjVar.f24073k) != null && org.telegram.messenger.fj.n1(message4) != null && (org.telegram.messenger.fj.n1(fjVar.f24073k) instanceof TLRPC.TL_messageMediaContact)) {
            long j3 = org.telegram.messenger.fj.n1(fjVar.f24073k).user_id;
            if (j3 != 0) {
                user3 = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(j3));
            } else {
                user3 = null;
            }
            if (!fjVar.P3() && i7 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(fjVar, (TLRPC.TL_peerColorCollectible) peerColor3, i6Var);
                }
            }
            if (user3 != null) {
                i11 = org.telegram.messenger.n10.f(user3);
                f5Var = f5Var2;
                this.v = org.telegram.messenger.n10.g(user3);
            } else {
                f5Var = f5Var2;
                i11 = 0;
            }
            n(fjVar, i11, i6Var);
            this.f38193x = org.telegram.ui.ActionBar.n6.r1(0.1f, this.f38195z);
            this.f38194y = this.f38195z;
        } else {
            f5Var = f5Var2;
            if (i7 != 0 && (fjVar.f24047e1 >= 0 || (fjVar.f24073k != null && (((fjVar.p3() || org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(fjVar.f24073k))) && user4 != null) || ((fjVar.n3() && chat != null) || (((message3 = fjVar.f24073k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (fjVar.r4() && (peerColor2 = fjVar.Z0) != null && peerColor2.color != -1))))))) {
                int i13 = fjVar.f24047e1;
                if (i13 < 0) {
                    if (fjVar.r4() && (peerColor = fjVar.Z0) != null && (i10 = peerColor.color) != -1) {
                        if (i7 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                    } else {
                        TLRPC.Message message5 = fjVar.f24073k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o4 = org.telegram.messenger.n5.o(peer);
                            i10 = 5;
                            if (o4 < 0) {
                                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(-o4));
                                if (!fjVar.P3() && i7 != 2 && O0 != null) {
                                    TLRPC.PeerColor peerColor4 = O0.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(fjVar, (TLRPC.TL_peerColorCollectible) peerColor4, i6Var);
                                    }
                                }
                                if (O0 != null) {
                                    i10 = org.telegram.messenger.v3.F(O0);
                                }
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.v3.G(O0);
                                }
                            } else {
                                TLRPC.User c22 = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(o4));
                                if (!fjVar.P3() && i7 != 2 && c22 != null) {
                                    TLRPC.PeerColor peerColor5 = c22.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(fjVar, (TLRPC.TL_peerColorCollectible) peerColor5, i6Var);
                                    }
                                }
                                if (c22 != null) {
                                    i10 = org.telegram.messenger.n10.f(c22);
                                }
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.n10.g(c22);
                                }
                            }
                        } else if (org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(message5)) && user4 != null) {
                            if (fjVar.P3()) {
                                user2 = org.telegram.messenger.i10.i(i12).f();
                            } else {
                                user2 = user4;
                            }
                            if (user2 != null) {
                                user4 = user2;
                            }
                            if (!fjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(fjVar, (TLRPC.TL_peerColorCollectible) peerColor6, i6Var);
                                }
                            }
                            i13 = org.telegram.messenger.n10.f(user4);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.n10.g(user4);
                            }
                        } else if (fjVar.p3() && user4 != null) {
                            if (!fjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(fjVar, (TLRPC.TL_peerColorCollectible) peerColor7, i6Var);
                                }
                            }
                            i13 = org.telegram.messenger.n10.f(user4);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.n10.g(user4);
                            }
                        } else if (fjVar.n3() && chat != null) {
                            if (!fjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(fjVar, (TLRPC.TL_peerColorCollectible) peerColor8, i6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = fjVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User c23 = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(Z0));
                                    F = org.telegram.messenger.n10.f(c23);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.n10.g(c23);
                                    }
                                } else {
                                    TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(-Z0));
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
                n(fjVar, i13, i6Var);
                this.f38193x = org.telegram.ui.ActionBar.n6.r1(0.1f, this.f38195z);
                this.f38194y = this.f38195z;
            } else if (i7 == 0 && (fjVar.f24047e1 >= 0 || ((message = fjVar.f24073k) != null && fjVar.C != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (fjVar2 = fjVar.C).f24073k) != null && message2.from_id != null && (fjVar2.p3() || org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(fjVar.f24073k)) || fjVar.C.n3()))))) {
                int i14 = fjVar.f24047e1;
                if (i14 < 0) {
                    if (org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(fjVar.C.f24073k))) {
                        if (fjVar.C.P3()) {
                            user4 = org.telegram.messenger.i10.i(fjVar.C.K1).f();
                        }
                        if (user4 != null) {
                            i14 = org.telegram.messenger.n10.f(user4);
                            this.v = org.telegram.messenger.n10.g(user4);
                        }
                        i14 = 0;
                    } else if (fjVar.C.p3()) {
                        TLRPC.User c24 = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(fjVar.C.f24073k.from_id.user_id));
                        if (!fjVar.P3() && i7 != 2 && c24 != null) {
                            TLRPC.PeerColor peerColor9 = c24.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(fjVar, (TLRPC.TL_peerColorCollectible) peerColor9, i6Var);
                            }
                        }
                        if (c24 != null) {
                            i14 = org.telegram.messenger.n10.f(c24);
                            this.v = org.telegram.messenger.n10.g(c24);
                        }
                        i14 = 0;
                    } else {
                        if (fjVar.C.n3()) {
                            TLRPC.Chat O03 = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(fjVar.C.f24073k.from_id.channel_id));
                            if (!fjVar.P3() && i7 != 2 && O03 != null) {
                                TLRPC.PeerColor peerColor10 = O03.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(fjVar, (TLRPC.TL_peerColorCollectible) peerColor10, i6Var);
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
                n(fjVar.C, i14, i6Var);
                this.f38193x = org.telegram.ui.ActionBar.n6.r1(0.1f, this.f38195z);
                this.f38194y = this.f38195z;
            } else {
                this.f38179i = false;
                this.f38180j = false;
                int w05 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ld, i6Var);
                this.B = w05;
                this.A = w05;
                this.f38195z = w05;
                this.f38193x = org.telegram.ui.ActionBar.n6.r1(0.1f, w05);
                this.f38194y = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nd, i6Var);
            }
        }
        if (fjVar.P5()) {
            this.f38179i = false;
            this.f38180j = false;
            this.B = -1;
            this.A = -1;
            this.f38195z = -1;
            this.f38193x = 0;
            this.f38194y = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Od, i6Var);
        } else if (fjVar.P3() || i7 == 2) {
            if (i7 == 2 && !fjVar.P3()) {
                int w06 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.gl, i6Var);
                this.B = w06;
                this.A = w06;
                this.f38195z = w06;
            } else {
                int i15 = org.telegram.ui.ActionBar.n6.Rb;
                Integer z02 = org.telegram.ui.ActionBar.n6.z0(i15, i6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.f38179i || this.f38180j) {
                        i15 = org.telegram.ui.ActionBar.n6.Sb;
                    }
                    w02 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
                }
                this.B = w02;
                this.A = w02;
                this.f38195z = w02;
            }
            if (this.f38180j) {
                this.V = true;
                this.f38195z = org.telegram.ui.ActionBar.n6.r1(0.2f, this.f38195z);
                this.A = org.telegram.ui.ActionBar.n6.r1(0.5f, this.A);
            } else if (this.f38179i) {
                this.V = true;
                this.f38195z = org.telegram.ui.ActionBar.n6.r1(0.35f, this.f38195z);
            }
            int i16 = this.B;
            if (q10) {
                f11 = 0.12f;
            }
            this.f38193x = org.telegram.ui.ActionBar.n6.r1(f11, i16);
            int i17 = org.telegram.ui.ActionBar.n6.Tb;
            this.f38194y = org.telegram.ui.ActionBar.n6.w0(i17, i6Var);
            if (fjVar.P2() && fjVar.P3()) {
                this.f38193x = i0.a.k(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Oa, i6Var), i0.a.k(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.La, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29771ua, i6Var)));
                this.f38194y = org.telegram.ui.ActionBar.n6.z0(i17, i6Var).intValue();
            }
        }
        if (i7 == 0 || i7 == 3 || i7 == 4) {
            long j10 = fjVar.f24052f1;
            if (j10 != -1) {
                this.v = j10;
            }
        }
        if (this.v != 0 && this.f38190t == null && (view = this.D) != null) {
            this.f38190t = new m5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.f38190t.a();
            }
        }
        m5 m5Var = this.f38190t;
        if (m5Var != null) {
            z11 = true;
            if (m5Var.j(this.v, true)) {
                this.f38175c0 = false;
            }
        } else {
            z11 = true;
        }
        m5 m5Var2 = this.f38191u;
        if (m5Var2 != null) {
            m5Var2.j(this.f38192w, z11);
        }
        this.C = i();
        return f5Var.a(this.f38194y, false);
    }

    public final void b() {
        ok0 ok0Var;
        if (this.R && this.U != org.telegram.ui.ActionBar.u6.f30164b) {
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
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.bz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f38176e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.bz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f13, z10, z11);
    }

    public final void e(Canvas canvas, RectF rectF, float f10, boolean z10, boolean z11) {
        boolean z12;
        fi.s2 s2Var;
        float d;
        int i7;
        m5 m5Var;
        float f11;
        b();
        if (!z11) {
            int r12 = org.telegram.ui.ActionBar.n6.r1(f10, this.E.a(this.f38193x, false));
            Paint paint = this.f38178g;
            paint.setColor(r12);
            float[] fArr = this.f38176e;
            if (a8.q7.a(fArr)) {
                float f12 = fArr[0];
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                Path path = this.f38177f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        m5 m5Var2 = this.f38190t;
        if (m5Var2 != null) {
            if (!this.f38175c0) {
                Drawable drawable = m5Var2.f37376f[0];
                if ((drawable instanceof o5) && (s2Var = ((o5) drawable).f38028k) != null && s2Var.K()) {
                    this.f38175c0 = true;
                } else {
                    z12 = false;
                    d = this.L.d(z12);
                    if (d <= 0.0f && this.f38188r > 0.0f) {
                        if (this.f38171a0 == null) {
                            i7 = 0;
                            this.f38171a0 = new nk0[]{new nk0(4.0f, -6.33f, 1.0f, 1.0f), new nk0(30.0f, 3.0f, 0.78f, 0.9f), new nk0(46.0f, -17.0f, 0.6f, 0.6f), new nk0(69.66f, -0.666f, 0.87f, 0.7f), new nk0(98.0f, -12.6f, 1.03f, 0.3f), new nk0(51.0f, 24.0f, 1.0f, 0.5f), new nk0(6.33f, 20.0f, 0.77f, 0.7f), new nk0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new nk0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i7 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.f38173b0);
                        float max = Math.max(rectF.right - org.telegram.messenger.g0.L(15.0f), rectF.centerX());
                        if (z10) {
                            max -= org.telegram.messenger.g0.L(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.g0.L(21.0f));
                        m5 m5Var3 = this.f38191u;
                        if (m5Var3 != null) {
                            m5Var3.f37380w = (int) (f10 * 255.0f);
                        }
                        this.f38190t.k(Integer.valueOf(this.C));
                        int i10 = i7;
                        while (true) {
                            nk0[] nk0VarArr = this.f38171a0;
                            if (i10 < nk0VarArr.length) {
                                if (i10 != 0 || (m5Var = this.f38191u) == null || this.f38192w == 0) {
                                    m5Var = this.f38190t;
                                }
                                nk0 nk0Var = nk0VarArr[i10];
                                if (!nk0Var.f37844e || z10) {
                                    if (m5Var == this.f38191u) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.3f;
                                    }
                                    m5Var.f37380w = (int) (f11 * 255.0f * nk0Var.d * this.f38188r);
                                    float L = max - org.telegram.messenger.g0.L(nk0Var.f37841a);
                                    float L2 = org.telegram.messenger.g0.L(nk0Var.f37842b) + min;
                                    float L3 = org.telegram.messenger.g0.L(10.0f) * nk0Var.f37843c * d;
                                    m5Var.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                                    m5Var.draw(canvas);
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
        n80 n80Var;
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.bz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f38176e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.bz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((n80Var = this.h) == null || !n80Var.d())) {
            n80 n80Var2 = this.h;
            if (n80Var2 != null) {
                n80Var2.f37710b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            n80 n80Var3 = new n80();
            this.h = n80Var3;
            n80Var3.D = true;
            n80Var3.f37726t = 3.5f;
            n80Var3.f37727u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.n6.r1(0.1f, this.f38195z), org.telegram.ui.ActionBar.n6.r1(0.3f, this.f38195z), org.telegram.ui.ActionBar.n6.r1(0.3f, this.f38195z), org.telegram.ui.ActionBar.n6.r1(1.25f, this.f38195z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f37729x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.f38193x;
    }

    public final int i() {
        if (this.V) {
            return this.A;
        }
        return this.f38195z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f10) {
        this.f38173b0 = f10;
    }

    public final void l() {
        this.F.a(this.f38195z, true);
        this.G.a(this.A, true);
        this.J.f(this.f38179i, true);
        this.I.a(this.f38194y, true);
        this.E.a(this.f38193x, true);
        m5 m5Var = this.f38190t;
        if (m5Var != null) {
            m5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.fj fjVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.i6 i6Var) {
        boolean q10;
        int i7;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i10;
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
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
            if (fjVar != null) {
                i10 = fjVar.e1();
            } else {
                i10 = 0;
            }
            if (i10 == this.O) {
                this.f38187q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i10;
        }
        this.V = false;
        this.f38195z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38179i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38180j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i11 = i7 | (-16777216);
        this.f38194y = i11;
        this.f38193x = org.telegram.ui.ActionBar.n6.r1(0.1f, i11);
        long j3 = tL_peerColorCollectible.background_emoji_id;
        this.v = j3;
        this.f38192w = tL_peerColorCollectible.gift_emoji_id;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        View view = this.D;
        if (i12 != 0 && this.f38190t == null && view != null) {
            this.f38190t = new m5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.f38190t.a();
            }
        }
        m5 m5Var = this.f38190t;
        if (m5Var != null && m5Var.j(this.v, true)) {
            this.f38175c0 = false;
        }
        this.C = this.f38194y;
        if (this.f38192w != 0 && this.f38191u == null && view != null) {
            this.f38191u = new m5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.f38191u.a();
            }
        }
        m5 m5Var2 = this.f38191u;
        if (m5Var2 != null) {
            m5Var2.j(this.f38192w, true);
        }
        return this.I.a(this.f38194y, false);
    }

    public final void n(org.telegram.messenger.fj fjVar, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        org.telegram.messenger.bp bpVar;
        boolean z10;
        int i11;
        int i12;
        if (i6Var != null) {
            i6Var.b();
        } else {
            org.telegram.ui.ActionBar.n6.j1();
        }
        boolean z11 = true;
        if (this.P != i7) {
            if (fjVar != null) {
                i12 = fjVar.e1();
            } else {
                i12 = 0;
            }
            if (i12 == this.O) {
                this.f38187q++;
            }
            this.Q = 0L;
            this.P = i7;
            this.O = i12;
        }
        if (i7 < 7) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29712r8[i7], i6Var);
            this.B = w02;
            this.A = w02;
            this.f38195z = w02;
            this.f38180j = false;
            this.f38179i = false;
            return;
        }
        if (fjVar != null) {
            i10 = fjVar.K1;
        } else {
            i10 = org.telegram.messenger.i10.f24637t0;
        }
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(i10).f25862t4;
        if (cpVar != null) {
            bpVar = cpVar.d(i7);
        } else {
            bpVar = null;
        }
        if (bpVar == null) {
            if (fjVar != null && fjVar.P3()) {
                i11 = org.telegram.ui.ActionBar.n6.Rb;
            } else {
                i11 = org.telegram.ui.ActionBar.n6.Ld;
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
            this.B = w03;
            this.A = w03;
            this.f38195z = w03;
            this.f38180j = false;
            this.f38179i = false;
            return;
        }
        this.f38195z = bpVar.e(0, i6Var);
        this.A = bpVar.e(1, i6Var);
        int e10 = bpVar.e(2, i6Var);
        this.B = e10;
        int i13 = this.A;
        int i14 = this.f38195z;
        if (i13 != i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38179i = z10;
        if (e10 == i14) {
            z11 = false;
        }
        this.f38180j = z11;
        if (z11) {
            this.B = i13;
            this.A = e10;
        }
    }

    public final void o(float f10) {
        this.f38188r = f10;
    }

    public final int p(org.telegram.ui.ActionBar.i6 i6Var) {
        View view;
        this.R = false;
        int i7 = org.telegram.ui.ActionBar.n6.f29692q7;
        this.f38194y = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        this.f38195z = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        this.f38179i = false;
        this.f38180j = false;
        this.f38193x = org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        if (this.v != 0 && this.f38190t == null && (view = this.D) != null) {
            this.f38190t = new m5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.r1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.r1) view).O0) {
                this.f38190t.a();
            }
        }
        m5 m5Var = this.f38190t;
        if (m5Var != null && m5Var.j(this.v, true)) {
            this.f38175c0 = false;
        }
        this.C = i();
        return this.I.a(this.f38194y, false);
    }

    public final void q(boolean z10) {
        n80 n80Var;
        if (!z10 && this.W) {
            this.X = 0.0f;
            n80 n80Var2 = this.h;
            if (n80Var2 != null) {
                n80Var2.a();
            }
        } else if (z10 && !this.W && (n80Var = this.h) != null) {
            n80Var.f37711c = -1L;
            n80Var.f37710b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i7, boolean z10) {
        float f10;
        this.R = false;
        this.V = false;
        this.f38180j = false;
        this.f38179i = false;
        this.B = i7;
        this.A = i7;
        this.f38195z = i7;
        if (z10) {
            f10 = 0.12f;
        } else {
            f10 = 0.1f;
        }
        this.f38193x = org.telegram.ui.ActionBar.n6.r1(f10, i7);
        this.C = i7;
    }
}
