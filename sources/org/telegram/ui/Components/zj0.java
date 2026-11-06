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
public final class zj0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final z4 E;
    public final z4 F;
    public final z4 G;
    public final z4 H;
    public final z4 I;
    public final w5 J;
    public final w5 K;
    public final w5 L;
    public final w5 M;
    public final w5 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.f6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public yj0[] f40995a0;
    public float f40997b0;
    public boolean f40999c0;
    public a80 h;
    public boolean f41003i;
    public boolean f41004j;
    public Bitmap f41005k;
    public int f41006l;
    public int f41007m;
    public int f41008n;
    public int f41009o;
    public boolean f41010p;
    public boolean f41013s;
    public g5 f41014t;
    public g5 f41015u;
    public long v;
    public long f41016w;
    public int f41017x;
    public int f41018y;
    public int f41019z;
    public final RectF f40994a = new RectF();
    public final Paint f40996b = new Paint(1);
    public final Paint f40998c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] f41000e = new float[8];
    public final Path f41001f = new Path();
    public final Paint f41002g = new Paint();
    public int f41011q = 0;
    public float f41012r = 1.0f;

    public zj0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.m6(this, 10));
        }
        xq xqVar = xq.h;
        this.E = new z4(view, 400L, xqVar, 0);
        this.F = new z4(view, 400L, xqVar, 0);
        this.G = new z4(view, 400L, xqVar, 0);
        this.H = new z4(view, 400L, xqVar, 0);
        this.I = new z4(view, 400L, xqVar, 0);
        this.J = new w5(view, 0L, 400L, xqVar);
        this.K = new w5(view, 0L, 400L, xqVar);
        this.L = new w5(view, 0L, 440L, xqVar);
        this.M = new w5(view, 0L, 320L, xqVar);
        this.N = new w5(view, 0L, 320L, xqVar);
    }

    public final int a(org.telegram.messenger.ij ijVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        boolean q10;
        boolean z9;
        z4 z4Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        org.telegram.messenger.ij ijVar2;
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
        boolean z10;
        View view;
        TLRPC.Message message4;
        TLRPC.User user3;
        int i11;
        float f10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user4 = user;
        this.R = false;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        if (ijVar != null && !ijVar.Q3() && i7 != 2 && (tL_peerColorCollectible = ijVar.f23211e1) != null) {
            return m(ijVar, tL_peerColorCollectible, f6Var);
        }
        this.V = false;
        this.v = 0L;
        this.f41016w = 0L;
        if (ijVar != null && ijVar.s4()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f41013s = z9;
        z4 z4Var2 = this.I;
        float f11 = 0.1f;
        if (ijVar == null) {
            this.R = true;
            this.S = i7;
            this.T = f6Var;
            this.U = org.telegram.ui.ActionBar.r6.f28475b;
            this.f41004j = false;
            this.f41003i = false;
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Id, f6Var);
            this.B = w03;
            this.A = w03;
            this.f41019z = w03;
            if (q10) {
                f10 = 0.12f;
            } else {
                f10 = 0.1f;
            }
            this.f41017x = org.telegram.ui.ActionBar.k6.r1(f10, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kd, f6Var);
            this.f41018y = w04;
            return z4Var2.a(w04, false);
        }
        int i12 = ijVar.I1;
        if (i7 == 4 && (message4 = ijVar.f23237k) != null && org.telegram.messenger.ij.o1(message4) != null && (org.telegram.messenger.ij.o1(ijVar.f23237k) instanceof TLRPC.TL_messageMediaContact)) {
            long j3 = org.telegram.messenger.ij.o1(ijVar.f23237k).user_id;
            if (j3 != 0) {
                user3 = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(j3));
            } else {
                user3 = null;
            }
            if (!ijVar.Q3() && i7 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor3, f6Var);
                }
            }
            if (user3 != null) {
                i11 = org.telegram.messenger.t10.e(user3);
                z4Var = z4Var2;
                this.v = org.telegram.messenger.t10.f(user3);
            } else {
                z4Var = z4Var2;
                i11 = 0;
            }
            n(ijVar, i11, f6Var);
            this.f41017x = org.telegram.ui.ActionBar.k6.r1(0.1f, this.f41019z);
            this.f41018y = this.f41019z;
        } else {
            z4Var = z4Var2;
            if (i7 != 0 && (ijVar.f23203c1 >= 0 || (ijVar.f23237k != null && (((ijVar.q3() || org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.f23237k))) && user4 != null) || ((ijVar.o3() && chat != null) || (((message3 = ijVar.f23237k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (ijVar.s4() && (peerColor2 = ijVar.X0) != null && peerColor2.color != -1))))))) {
                int i13 = ijVar.f23203c1;
                if (i13 < 0) {
                    if (ijVar.s4() && (peerColor = ijVar.X0) != null && (i10 = peerColor.color) != -1) {
                        if (i7 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                    } else {
                        TLRPC.Message message5 = ijVar.f23237k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o4 = org.telegram.messenger.m5.o(peer);
                            i10 = 5;
                            if (o4 < 0) {
                                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-o4));
                                if (!ijVar.Q3() && i7 != 2 && M0 != null) {
                                    TLRPC.PeerColor peerColor4 = M0.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor4, f6Var);
                                    }
                                }
                                if (M0 != null) {
                                    i10 = org.telegram.messenger.t3.F(M0);
                                }
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.t3.G(M0);
                                }
                            } else {
                                TLRPC.User a22 = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(o4));
                                if (!ijVar.Q3() && i7 != 2 && a22 != null) {
                                    TLRPC.PeerColor peerColor5 = a22.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor5, f6Var);
                                    }
                                }
                                if (a22 != null) {
                                    i10 = org.telegram.messenger.t10.e(a22);
                                }
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.t10.f(a22);
                                }
                            }
                        } else if (org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(message5)) && user4 != null) {
                            if (ijVar.Q3()) {
                                user2 = org.telegram.messenger.p10.i(i12).f();
                            } else {
                                user2 = user4;
                            }
                            if (user2 != null) {
                                user4 = user2;
                            }
                            if (!ijVar.Q3() && i7 != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor6, f6Var);
                                }
                            }
                            i13 = org.telegram.messenger.t10.e(user4);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.t10.f(user4);
                            }
                        } else if (ijVar.q3() && user4 != null) {
                            if (!ijVar.Q3() && i7 != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor7, f6Var);
                                }
                            }
                            i13 = org.telegram.messenger.t10.e(user4);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.t10.f(user4);
                            }
                        } else if (ijVar.o3() && chat != null) {
                            if (!ijVar.Q3() && i7 != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor8, f6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = ijVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User a23 = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(Z0));
                                    F = org.telegram.messenger.t10.e(a23);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.t10.f(a23);
                                    }
                                } else {
                                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-Z0));
                                    F = org.telegram.messenger.t3.F(M02);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.t3.G(M02);
                                    }
                                }
                                i13 = F;
                            } else {
                                i13 = org.telegram.messenger.t3.F(chat);
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.t3.G(chat);
                                }
                            }
                        } else {
                            i13 = 0;
                        }
                    }
                    i13 = i10;
                }
                n(ijVar, i13, f6Var);
                this.f41017x = org.telegram.ui.ActionBar.k6.r1(0.1f, this.f41019z);
                this.f41018y = this.f41019z;
            } else if (i7 == 0 && (ijVar.f23203c1 >= 0 || ((message = ijVar.f23237k) != null && ijVar.C != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (ijVar2 = ijVar.C).f23237k) != null && message2.from_id != null && (ijVar2.q3() || org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.f23237k)) || ijVar.C.o3()))))) {
                int i14 = ijVar.f23203c1;
                if (i14 < 0) {
                    if (org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.C.f23237k))) {
                        if (ijVar.C.Q3()) {
                            user4 = org.telegram.messenger.p10.i(ijVar.C.I1).f();
                        }
                        if (user4 != null) {
                            i14 = org.telegram.messenger.t10.e(user4);
                            this.v = org.telegram.messenger.t10.f(user4);
                        }
                        i14 = 0;
                    } else if (ijVar.C.q3()) {
                        TLRPC.User a24 = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(ijVar.C.f23237k.from_id.user_id));
                        if (!ijVar.Q3() && i7 != 2 && a24 != null) {
                            TLRPC.PeerColor peerColor9 = a24.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor9, f6Var);
                            }
                        }
                        if (a24 != null) {
                            i14 = org.telegram.messenger.t10.e(a24);
                            this.v = org.telegram.messenger.t10.f(a24);
                        }
                        i14 = 0;
                    } else {
                        if (ijVar.C.o3()) {
                            TLRPC.Chat M03 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(ijVar.C.f23237k.from_id.channel_id));
                            if (!ijVar.Q3() && i7 != 2 && M03 != null) {
                                TLRPC.PeerColor peerColor10 = M03.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ijVar, (TLRPC.TL_peerColorCollectible) peerColor10, f6Var);
                                }
                            }
                            if (M03 != null) {
                                i14 = org.telegram.messenger.t3.F(M03);
                                this.v = org.telegram.messenger.t3.G(M03);
                            }
                        }
                        i14 = 0;
                    }
                }
                n(ijVar.C, i14, f6Var);
                this.f41017x = org.telegram.ui.ActionBar.k6.r1(0.1f, this.f41019z);
                this.f41018y = this.f41019z;
            } else {
                this.f41003i = false;
                this.f41004j = false;
                int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Id, f6Var);
                this.B = w05;
                this.A = w05;
                this.f41019z = w05;
                this.f41017x = org.telegram.ui.ActionBar.k6.r1(0.1f, w05);
                this.f41018y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kd, f6Var);
            }
        }
        if (ijVar.Q5()) {
            this.f41003i = false;
            this.f41004j = false;
            this.B = -1;
            this.A = -1;
            this.f41019z = -1;
            this.f41017x = 0;
            this.f41018y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, f6Var);
        } else if (ijVar.Q3() || i7 == 2) {
            if (i7 == 2 && !ijVar.Q3()) {
                int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dl, f6Var);
                this.B = w06;
                this.A = w06;
                this.f41019z = w06;
            } else {
                int i15 = org.telegram.ui.ActionBar.k6.Ob;
                Integer z02 = org.telegram.ui.ActionBar.k6.z0(i15, f6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.f41003i || this.f41004j) {
                        i15 = org.telegram.ui.ActionBar.k6.Pb;
                    }
                    w02 = org.telegram.ui.ActionBar.k6.w0(i15, f6Var);
                }
                this.B = w02;
                this.A = w02;
                this.f41019z = w02;
            }
            if (this.f41004j) {
                this.V = true;
                this.f41019z = org.telegram.ui.ActionBar.k6.r1(0.2f, this.f41019z);
                this.A = org.telegram.ui.ActionBar.k6.r1(0.5f, this.A);
            } else if (this.f41003i) {
                this.V = true;
                this.f41019z = org.telegram.ui.ActionBar.k6.r1(0.35f, this.f41019z);
            }
            int i16 = this.B;
            if (q10) {
                f11 = 0.12f;
            }
            this.f41017x = org.telegram.ui.ActionBar.k6.r1(f11, i16);
            int i17 = org.telegram.ui.ActionBar.k6.Qb;
            this.f41018y = org.telegram.ui.ActionBar.k6.w0(i17, f6Var);
            if (ijVar.Q2() && ijVar.Q3()) {
                this.f41017x = i0.a.k(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oa, f6Var), i0.a.k(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.La, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28168ua, f6Var)));
                this.f41018y = org.telegram.ui.ActionBar.k6.z0(i17, f6Var).intValue();
            }
        }
        if (i7 == 0 || i7 == 3 || i7 == 4) {
            long j10 = ijVar.f23207d1;
            if (j10 != -1) {
                this.v = j10;
            }
        }
        if (this.v != 0 && this.f41014t == null && (view = this.D) != null) {
            this.f41014t = new g5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f41014t.a();
            }
        }
        g5 g5Var = this.f41014t;
        if (g5Var != null) {
            z10 = true;
            if (g5Var.j(this.v, true)) {
                this.f40999c0 = false;
            }
        } else {
            z10 = true;
        }
        g5 g5Var2 = this.f41015u;
        if (g5Var2 != null) {
            g5Var2.j(this.f41016w, z10);
        }
        this.C = i();
        return z4Var.a(this.f41018y, false);
    }

    public final void b() {
        zj0 zj0Var;
        if (this.R && this.U != org.telegram.ui.ActionBar.r6.f28475b) {
            try {
                zj0Var = this;
            } catch (Exception e10) {
                e = e10;
                zj0Var = this;
            }
            try {
                zj0Var.a(null, null, null, this.T, this.S);
            } catch (Exception e11) {
                e = e11;
                zj0Var.R = false;
                org.telegram.messenger.a8.g(e, true);
            }
        }
    }

    public final void c(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z9, boolean z10) {
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.iz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f41000e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.iz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f13, z9, z10);
    }

    public final void e(Canvas canvas, RectF rectF, float f10, boolean z9, boolean z10) {
        boolean z11;
        di.z2 z2Var;
        float d;
        int i7;
        g5 g5Var;
        float f11;
        b();
        if (!z10) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(f10, this.E.a(this.f41017x, false));
            Paint paint = this.f41002g;
            paint.setColor(r12);
            float[] fArr = this.f41000e;
            if (a8.m7.a(fArr)) {
                float f12 = fArr[0];
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                Path path = this.f41001f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        g5 g5Var2 = this.f41014t;
        if (g5Var2 != null) {
            if (!this.f40999c0) {
                Drawable drawable = g5Var2.f33789f[0];
                if ((drawable instanceof i5) && (z2Var = ((i5) drawable).f34450k) != null && z2Var.J()) {
                    this.f40999c0 = true;
                } else {
                    z11 = false;
                    d = this.L.d(z11);
                    if (d <= 0.0f && this.f41012r > 0.0f) {
                        if (this.f40995a0 == null) {
                            i7 = 0;
                            this.f40995a0 = new yj0[]{new yj0(4.0f, -6.33f, 1.0f, 1.0f), new yj0(30.0f, 3.0f, 0.78f, 0.9f), new yj0(46.0f, -17.0f, 0.6f, 0.6f), new yj0(69.66f, -0.666f, 0.87f, 0.7f), new yj0(98.0f, -12.6f, 1.03f, 0.3f), new yj0(51.0f, 24.0f, 1.0f, 0.5f), new yj0(6.33f, 20.0f, 0.77f, 0.7f), new yj0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new yj0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i7 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.f40997b0);
                        float max = Math.max(rectF.right - org.telegram.messenger.g0.L(15.0f), rectF.centerX());
                        if (z9) {
                            max -= org.telegram.messenger.g0.L(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.g0.L(21.0f));
                        g5 g5Var3 = this.f41015u;
                        if (g5Var3 != null) {
                            g5Var3.f33793w = (int) (f10 * 255.0f);
                        }
                        this.f41014t.k(Integer.valueOf(this.C));
                        int i10 = i7;
                        while (true) {
                            yj0[] yj0VarArr = this.f40995a0;
                            if (i10 < yj0VarArr.length) {
                                if (i10 != 0 || (g5Var = this.f41015u) == null || this.f41016w == 0) {
                                    g5Var = this.f41014t;
                                }
                                yj0 yj0Var = yj0VarArr[i10];
                                if (!yj0Var.f40643e || z9) {
                                    if (g5Var == this.f41015u) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.3f;
                                    }
                                    g5Var.f33793w = (int) (f11 * 255.0f * yj0Var.d * this.f41012r);
                                    float L = max - org.telegram.messenger.g0.L(yj0Var.f40640a);
                                    float L2 = org.telegram.messenger.g0.L(yj0Var.f40641b) + min;
                                    float L3 = org.telegram.messenger.g0.L(10.0f) * yj0Var.f40642c * d;
                                    g5Var.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                                    g5Var.draw(canvas);
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
            z11 = true;
            d = this.L.d(z11);
            if (d <= 0.0f) {
            }
        }
    }

    public final void f(android.graphics.Canvas r27, android.graphics.RectF r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zj0.f(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void g(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        a80 a80Var;
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.iz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f41000e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.iz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((a80Var = this.h) == null || !a80Var.d())) {
            a80 a80Var2 = this.h;
            if (a80Var2 != null) {
                a80Var2.f31727b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            a80 a80Var3 = new a80();
            this.h = a80Var3;
            a80Var3.D = true;
            a80Var3.f31743t = 3.5f;
            a80Var3.f31744u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.k6.r1(0.1f, this.f41019z), org.telegram.ui.ActionBar.k6.r1(0.3f, this.f41019z), org.telegram.ui.ActionBar.k6.r1(0.3f, this.f41019z), org.telegram.ui.ActionBar.k6.r1(1.25f, this.f41019z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f31746x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.f41017x;
    }

    public final int i() {
        if (this.V) {
            return this.A;
        }
        return this.f41019z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f10) {
        this.f40997b0 = f10;
    }

    public final void l() {
        this.F.a(this.f41019z, true);
        this.G.a(this.A, true);
        this.J.f(this.f41003i, true);
        this.I.a(this.f41018y, true);
        this.E.a(this.f41017x, true);
        g5 g5Var = this.f41014t;
        if (g5Var != null) {
            g5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.ij ijVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean q10;
        int i7;
        ArrayList<Integer> arrayList;
        boolean z9;
        boolean z10;
        int i10;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
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
            if (ijVar != null) {
                i10 = ijVar.f1();
            } else {
                i10 = 0;
            }
            if (i10 == this.O) {
                this.f41011q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i10;
        }
        this.V = false;
        this.f41019z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f41003i = z9;
        if (z9) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41004j = z10;
        if (z10) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i11 = i7 | (-16777216);
        this.f41018y = i11;
        this.f41017x = org.telegram.ui.ActionBar.k6.r1(0.1f, i11);
        long j3 = tL_peerColorCollectible.background_emoji_id;
        this.v = j3;
        this.f41016w = tL_peerColorCollectible.gift_emoji_id;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        View view = this.D;
        if (i12 != 0 && this.f41014t == null && view != null) {
            this.f41014t = new g5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f41014t.a();
            }
        }
        g5 g5Var = this.f41014t;
        if (g5Var != null && g5Var.j(this.v, true)) {
            this.f40999c0 = false;
        }
        this.C = this.f41018y;
        if (this.f41016w != 0 && this.f41015u == null && view != null) {
            this.f41015u = new g5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f41015u.a();
            }
        }
        g5 g5Var2 = this.f41015u;
        if (g5Var2 != null) {
            g5Var2.j(this.f41016w, true);
        }
        return this.I.a(this.f41018y, false);
    }

    public final void n(org.telegram.messenger.ij ijVar, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        org.telegram.messenger.fp fpVar;
        boolean z9;
        int i11;
        int i12;
        if (f6Var != null) {
            f6Var.a();
        } else {
            org.telegram.ui.ActionBar.k6.j1();
        }
        boolean z10 = true;
        if (this.P != i7) {
            if (ijVar != null) {
                i12 = ijVar.f1();
            } else {
                i12 = 0;
            }
            if (i12 == this.O) {
                this.f41011q++;
            }
            this.Q = 0L;
            this.P = i7;
            this.O = i12;
        }
        if (i7 < 7) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28109r8[i7], f6Var);
            this.B = w02;
            this.A = w02;
            this.f41019z = w02;
            this.f41004j = false;
            this.f41003i = false;
            return;
        }
        if (ijVar != null) {
            i10 = ijVar.I1;
        } else {
            i10 = org.telegram.messenger.p10.f24459s0;
        }
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(i10).f24859q4;
        if (gpVar != null) {
            fpVar = gpVar.d(i7);
        } else {
            fpVar = null;
        }
        if (fpVar == null) {
            if (ijVar != null && ijVar.Q3()) {
                i11 = org.telegram.ui.ActionBar.k6.Ob;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Id;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
            this.B = w03;
            this.A = w03;
            this.f41019z = w03;
            this.f41004j = false;
            this.f41003i = false;
            return;
        }
        this.f41019z = fpVar.e(0, f6Var);
        this.A = fpVar.e(1, f6Var);
        int e10 = fpVar.e(2, f6Var);
        this.B = e10;
        int i13 = this.A;
        int i14 = this.f41019z;
        if (i13 != i14) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f41003i = z9;
        if (e10 == i14) {
            z10 = false;
        }
        this.f41004j = z10;
        if (z10) {
            this.B = i13;
            this.A = e10;
        }
    }

    public final void o(float f10) {
        this.f41012r = f10;
    }

    public final int p(org.telegram.ui.ActionBar.f6 f6Var) {
        View view;
        this.R = false;
        int i7 = org.telegram.ui.ActionBar.k6.f28089q7;
        this.f41018y = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        this.f41019z = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        this.f41003i = false;
        this.f41004j = false;
        this.f41017x = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        if (this.v != 0 && this.f41014t == null && (view = this.D) != null) {
            this.f41014t = new g5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).N0) {
                this.f41014t.a();
            }
        }
        g5 g5Var = this.f41014t;
        if (g5Var != null && g5Var.j(this.v, true)) {
            this.f40999c0 = false;
        }
        this.C = i();
        return this.I.a(this.f41018y, false);
    }

    public final void q(boolean z9) {
        a80 a80Var;
        if (!z9 && this.W) {
            this.X = 0.0f;
            a80 a80Var2 = this.h;
            if (a80Var2 != null) {
                a80Var2.a();
            }
        } else if (z9 && !this.W && (a80Var = this.h) != null) {
            a80Var.f31728c = -1L;
            a80Var.f31727b = -1L;
        }
        this.W = z9;
    }

    public final void r(int i7, boolean z9) {
        float f10;
        this.R = false;
        this.V = false;
        this.f41004j = false;
        this.f41003i = false;
        this.B = i7;
        this.A = i7;
        this.f41019z = i7;
        if (z9) {
            f10 = 0.12f;
        } else {
            f10 = 0.1f;
        }
        this.f41017x = org.telegram.ui.ActionBar.k6.r1(f10, i7);
        this.C = i7;
    }
}
