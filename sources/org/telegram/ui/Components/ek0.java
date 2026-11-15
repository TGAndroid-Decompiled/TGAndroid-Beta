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
public final class ek0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final x4 E;
    public final x4 F;
    public final x4 G;
    public final x4 H;
    public final x4 I;
    public final u5 J;
    public final u5 K;
    public final u5 L;
    public final u5 M;
    public final u5 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.e6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public dk0[] f34337a0;
    public float f34339b0;
    public boolean f34341c0;
    public d80 h;
    public boolean f34345i;
    public boolean f34346j;
    public Bitmap f34347k;
    public int f34348l;
    public int f34349m;
    public int f34350n;
    public int f34351o;
    public boolean f34352p;
    public boolean f34355s;
    public e5 f34356t;
    public e5 f34357u;
    public long v;
    public long f34358w;
    public int f34359x;
    public int f34360y;
    public int f34361z;
    public final RectF f34336a = new RectF();
    public final Paint f34338b = new Paint(1);
    public final Paint f34340c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] f34342e = new float[8];
    public final Path f34343f = new Path();
    public final Paint f34344g = new Paint();
    public int f34353q = 0;
    public float f34354r = 1.0f;

    public ek0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.x1(this, 14));
        }
        er erVar = er.h;
        this.E = new x4(view, 400L, erVar, 0);
        this.F = new x4(view, 400L, erVar, 0);
        this.G = new x4(view, 400L, erVar, 0);
        this.H = new x4(view, 400L, erVar, 0);
        this.I = new x4(view, 400L, erVar, 0);
        this.J = new u5(view, 0L, 400L, erVar);
        this.K = new u5(view, 0L, 400L, erVar);
        this.L = new u5(view, 0L, 440L, erVar);
        this.M = new u5(view, 0L, 320L, erVar);
        this.N = new u5(view, 0L, 320L, erVar);
    }

    public final int a(org.telegram.messenger.gj gjVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        boolean q10;
        boolean z10;
        x4 x4Var;
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
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        if (gjVar != null && !gjVar.P3() && i7 != 2 && (tL_peerColorCollectible = gjVar.f23801g1) != null) {
            return m(gjVar, tL_peerColorCollectible, e6Var);
        }
        this.V = false;
        this.v = 0L;
        this.f34358w = 0L;
        if (gjVar != null && gjVar.r4()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34355s = z10;
        x4 x4Var2 = this.I;
        float f11 = 0.1f;
        if (gjVar == null) {
            this.R = true;
            this.S = i7;
            this.T = e6Var;
            this.U = org.telegram.ui.ActionBar.q6.f29535b;
            this.f34346j = false;
            this.f34345i = false;
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ld, e6Var);
            this.B = w03;
            this.A = w03;
            this.f34361z = w03;
            if (q10) {
                f10 = 0.12f;
            } else {
                f10 = 0.1f;
            }
            this.f34359x = org.telegram.ui.ActionBar.j6.r1(f10, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nd, e6Var);
            this.f34360y = w04;
            return x4Var2.a(w04, false);
        }
        int i12 = gjVar.K1;
        if (i7 == 4 && (message4 = gjVar.f23817k) != null && org.telegram.messenger.gj.n1(message4) != null && (org.telegram.messenger.gj.n1(gjVar.f23817k) instanceof TLRPC.TL_messageMediaContact)) {
            long j3 = org.telegram.messenger.gj.n1(gjVar.f23817k).user_id;
            if (j3 != 0) {
                user3 = org.telegram.messenger.np.s1(i12).a2(Long.valueOf(j3));
            } else {
                user3 = null;
            }
            if (!gjVar.P3() && i7 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor3, e6Var);
                }
            }
            if (user3 != null) {
                i11 = org.telegram.messenger.q10.e(user3);
                x4Var = x4Var2;
                this.v = org.telegram.messenger.q10.f(user3);
            } else {
                x4Var = x4Var2;
                i11 = 0;
            }
            n(gjVar, i11, e6Var);
            this.f34359x = org.telegram.ui.ActionBar.j6.r1(0.1f, this.f34361z);
            this.f34360y = this.f34361z;
        } else {
            x4Var = x4Var2;
            if (i7 != 0 && (gjVar.f23791e1 >= 0 || (gjVar.f23817k != null && (((gjVar.p3() || org.telegram.messenger.m5.C(org.telegram.messenger.gj.B0(gjVar.f23817k))) && user4 != null) || ((gjVar.n3() && chat != null) || (((message3 = gjVar.f23817k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (gjVar.r4() && (peerColor2 = gjVar.Z0) != null && peerColor2.color != -1))))))) {
                int i13 = gjVar.f23791e1;
                if (i13 < 0) {
                    if (gjVar.r4() && (peerColor = gjVar.Z0) != null && (i10 = peerColor.color) != -1) {
                        if (i7 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                    } else {
                        TLRPC.Message message5 = gjVar.f23817k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o4 = org.telegram.messenger.m5.o(peer);
                            i10 = 5;
                            if (o4 < 0) {
                                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i12).M0(Long.valueOf(-o4));
                                if (!gjVar.P3() && i7 != 2 && M0 != null) {
                                    TLRPC.PeerColor peerColor4 = M0.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor4, e6Var);
                                    }
                                }
                                if (M0 != null) {
                                    i10 = org.telegram.messenger.t3.F(M0);
                                }
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.t3.G(M0);
                                }
                            } else {
                                TLRPC.User a22 = org.telegram.messenger.np.s1(i12).a2(Long.valueOf(o4));
                                if (!gjVar.P3() && i7 != 2 && a22 != null) {
                                    TLRPC.PeerColor peerColor5 = a22.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor5, e6Var);
                                    }
                                }
                                if (a22 != null) {
                                    i10 = org.telegram.messenger.q10.e(a22);
                                }
                                if (i7 == 3) {
                                    this.v = org.telegram.messenger.q10.f(a22);
                                }
                            }
                        } else if (org.telegram.messenger.m5.C(org.telegram.messenger.gj.B0(message5)) && user4 != null) {
                            if (gjVar.P3()) {
                                user2 = org.telegram.messenger.m10.i(i12).f();
                            } else {
                                user2 = user4;
                            }
                            if (user2 != null) {
                                user4 = user2;
                            }
                            if (!gjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor6, e6Var);
                                }
                            }
                            i13 = org.telegram.messenger.q10.e(user4);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.q10.f(user4);
                            }
                        } else if (gjVar.p3() && user4 != null) {
                            if (!gjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor7, e6Var);
                                }
                            }
                            i13 = org.telegram.messenger.q10.e(user4);
                            if (i7 == 3) {
                                this.v = org.telegram.messenger.q10.f(user4);
                            }
                        } else if (gjVar.n3() && chat != null) {
                            if (!gjVar.P3() && i7 != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor8, e6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = gjVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User a23 = org.telegram.messenger.np.s1(i12).a2(Long.valueOf(Z0));
                                    F = org.telegram.messenger.q10.e(a23);
                                    if (i7 == 3) {
                                        this.v = org.telegram.messenger.q10.f(a23);
                                    }
                                } else {
                                    TLRPC.Chat M02 = org.telegram.messenger.np.s1(i12).M0(Long.valueOf(-Z0));
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
                n(gjVar, i13, e6Var);
                this.f34359x = org.telegram.ui.ActionBar.j6.r1(0.1f, this.f34361z);
                this.f34360y = this.f34361z;
            } else if (i7 == 0 && (gjVar.f23791e1 >= 0 || ((message = gjVar.f23817k) != null && gjVar.C != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (gjVar2 = gjVar.C).f23817k) != null && message2.from_id != null && (gjVar2.p3() || org.telegram.messenger.m5.C(org.telegram.messenger.gj.B0(gjVar.f23817k)) || gjVar.C.n3()))))) {
                int i14 = gjVar.f23791e1;
                if (i14 < 0) {
                    if (org.telegram.messenger.m5.C(org.telegram.messenger.gj.B0(gjVar.C.f23817k))) {
                        if (gjVar.C.P3()) {
                            user4 = org.telegram.messenger.m10.i(gjVar.C.K1).f();
                        }
                        if (user4 != null) {
                            i14 = org.telegram.messenger.q10.e(user4);
                            this.v = org.telegram.messenger.q10.f(user4);
                        }
                        i14 = 0;
                    } else if (gjVar.C.p3()) {
                        TLRPC.User a24 = org.telegram.messenger.np.s1(i12).a2(Long.valueOf(gjVar.C.f23817k.from_id.user_id));
                        if (!gjVar.P3() && i7 != 2 && a24 != null) {
                            TLRPC.PeerColor peerColor9 = a24.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor9, e6Var);
                            }
                        }
                        if (a24 != null) {
                            i14 = org.telegram.messenger.q10.e(a24);
                            this.v = org.telegram.messenger.q10.f(a24);
                        }
                        i14 = 0;
                    } else {
                        if (gjVar.C.n3()) {
                            TLRPC.Chat M03 = org.telegram.messenger.np.s1(i12).M0(Long.valueOf(gjVar.C.f23817k.from_id.channel_id));
                            if (!gjVar.P3() && i7 != 2 && M03 != null) {
                                TLRPC.PeerColor peerColor10 = M03.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(gjVar, (TLRPC.TL_peerColorCollectible) peerColor10, e6Var);
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
                n(gjVar.C, i14, e6Var);
                this.f34359x = org.telegram.ui.ActionBar.j6.r1(0.1f, this.f34361z);
                this.f34360y = this.f34361z;
            } else {
                this.f34345i = false;
                this.f34346j = false;
                int w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ld, e6Var);
                this.B = w05;
                this.A = w05;
                this.f34361z = w05;
                this.f34359x = org.telegram.ui.ActionBar.j6.r1(0.1f, w05);
                this.f34360y = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nd, e6Var);
            }
        }
        if (gjVar.P5()) {
            this.f34345i = false;
            this.f34346j = false;
            this.B = -1;
            this.A = -1;
            this.f34361z = -1;
            this.f34359x = 0;
            this.f34360y = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Od, e6Var);
        } else if (gjVar.P3() || i7 == 2) {
            if (i7 == 2 && !gjVar.P3()) {
                int w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.gl, e6Var);
                this.B = w06;
                this.A = w06;
                this.f34361z = w06;
            } else {
                int i15 = org.telegram.ui.ActionBar.j6.Rb;
                Integer z02 = org.telegram.ui.ActionBar.j6.z0(i15, e6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.f34345i || this.f34346j) {
                        i15 = org.telegram.ui.ActionBar.j6.Sb;
                    }
                    w02 = org.telegram.ui.ActionBar.j6.w0(i15, e6Var);
                }
                this.B = w02;
                this.A = w02;
                this.f34361z = w02;
            }
            if (this.f34346j) {
                this.V = true;
                this.f34361z = org.telegram.ui.ActionBar.j6.r1(0.2f, this.f34361z);
                this.A = org.telegram.ui.ActionBar.j6.r1(0.5f, this.A);
            } else if (this.f34345i) {
                this.V = true;
                this.f34361z = org.telegram.ui.ActionBar.j6.r1(0.35f, this.f34361z);
            }
            int i16 = this.B;
            if (q10) {
                f11 = 0.12f;
            }
            this.f34359x = org.telegram.ui.ActionBar.j6.r1(f11, i16);
            int i17 = org.telegram.ui.ActionBar.j6.Tb;
            this.f34360y = org.telegram.ui.ActionBar.j6.w0(i17, e6Var);
            if (gjVar.P2() && gjVar.P3()) {
                this.f34359x = i0.a.k(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Oa, e6Var), i0.a.k(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.La, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29169ua, e6Var)));
                this.f34360y = org.telegram.ui.ActionBar.j6.z0(i17, e6Var).intValue();
            }
        }
        if (i7 == 0 || i7 == 3 || i7 == 4) {
            long j10 = gjVar.f23796f1;
            if (j10 != -1) {
                this.v = j10;
            }
        }
        if (this.v != 0 && this.f34356t == null && (view = this.D) != null) {
            this.f34356t = new e5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).O0) {
                this.f34356t.a();
            }
        }
        e5 e5Var = this.f34356t;
        if (e5Var != null) {
            z11 = true;
            if (e5Var.j(this.v, true)) {
                this.f34341c0 = false;
            }
        } else {
            z11 = true;
        }
        e5 e5Var2 = this.f34357u;
        if (e5Var2 != null) {
            e5Var2.j(this.f34358w, z11);
        }
        this.C = i();
        return x4Var.a(this.f34360y, false);
    }

    public final void b() {
        ek0 ek0Var;
        if (this.R && this.U != org.telegram.ui.ActionBar.q6.f29535b) {
            try {
                ek0Var = this;
            } catch (Exception e10) {
                e = e10;
                ek0Var = this;
            }
            try {
                ek0Var.a(null, null, null, this.T, this.S);
            } catch (Exception e11) {
                e = e11;
                ek0Var.R = false;
                org.telegram.messenger.a8.g(e, true);
            }
        }
    }

    public final void c(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z10, boolean z11) {
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.gz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f34342e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.gz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f13, z10, z11);
    }

    public final void e(Canvas canvas, RectF rectF, float f10, boolean z10, boolean z11) {
        boolean z12;
        fi.u2 u2Var;
        float d;
        int i7;
        e5 e5Var;
        float f11;
        b();
        if (!z11) {
            int r12 = org.telegram.ui.ActionBar.j6.r1(f10, this.E.a(this.f34359x, false));
            Paint paint = this.f34344g;
            paint.setColor(r12);
            float[] fArr = this.f34342e;
            if (a8.n7.a(fArr)) {
                float f12 = fArr[0];
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                Path path = this.f34343f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        e5 e5Var2 = this.f34356t;
        if (e5Var2 != null) {
            if (!this.f34341c0) {
                Drawable drawable = e5Var2.f34194f[0];
                if ((drawable instanceof g5) && (u2Var = ((g5) drawable).f34809k) != null && u2Var.J()) {
                    this.f34341c0 = true;
                } else {
                    z12 = false;
                    d = this.L.d(z12);
                    if (d <= 0.0f && this.f34354r > 0.0f) {
                        if (this.f34337a0 == null) {
                            i7 = 0;
                            this.f34337a0 = new dk0[]{new dk0(4.0f, -6.33f, 1.0f, 1.0f), new dk0(30.0f, 3.0f, 0.78f, 0.9f), new dk0(46.0f, -17.0f, 0.6f, 0.6f), new dk0(69.66f, -0.666f, 0.87f, 0.7f), new dk0(98.0f, -12.6f, 1.03f, 0.3f), new dk0(51.0f, 24.0f, 1.0f, 0.5f), new dk0(6.33f, 20.0f, 0.77f, 0.7f), new dk0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new dk0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i7 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.f34339b0);
                        float max = Math.max(rectF.right - org.telegram.messenger.g0.L(15.0f), rectF.centerX());
                        if (z10) {
                            max -= org.telegram.messenger.g0.L(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.g0.L(21.0f));
                        e5 e5Var3 = this.f34357u;
                        if (e5Var3 != null) {
                            e5Var3.f34198w = (int) (f10 * 255.0f);
                        }
                        this.f34356t.k(Integer.valueOf(this.C));
                        int i10 = i7;
                        while (true) {
                            dk0[] dk0VarArr = this.f34337a0;
                            if (i10 < dk0VarArr.length) {
                                if (i10 != 0 || (e5Var = this.f34357u) == null || this.f34358w == 0) {
                                    e5Var = this.f34356t;
                                }
                                dk0 dk0Var = dk0VarArr[i10];
                                if (!dk0Var.f33973e || z10) {
                                    if (e5Var == this.f34357u) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.3f;
                                    }
                                    e5Var.f34198w = (int) (f11 * 255.0f * dk0Var.d * this.f34354r);
                                    float L = max - org.telegram.messenger.g0.L(dk0Var.f33970a);
                                    float L2 = org.telegram.messenger.g0.L(dk0Var.f33971b) + min;
                                    float L3 = org.telegram.messenger.g0.L(10.0f) * dk0Var.f33972c * d;
                                    e5Var.setBounds((int) (L - L3), (int) (L2 - L3), (int) (L + L3), (int) (L2 + L3));
                                    e5Var.draw(canvas);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ek0.f(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void g(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        d80 d80Var;
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.gz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f34342e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.gz.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((d80Var = this.h) == null || !d80Var.d())) {
            d80 d80Var2 = this.h;
            if (d80Var2 != null) {
                d80Var2.f33865b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            d80 d80Var3 = new d80();
            this.h = d80Var3;
            d80Var3.D = true;
            d80Var3.f33881t = 3.5f;
            d80Var3.f33882u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.j6.r1(0.1f, this.f34361z), org.telegram.ui.ActionBar.j6.r1(0.3f, this.f34361z), org.telegram.ui.ActionBar.j6.r1(0.3f, this.f34361z), org.telegram.ui.ActionBar.j6.r1(1.25f, this.f34361z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f33884x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.f34359x;
    }

    public final int i() {
        if (this.V) {
            return this.A;
        }
        return this.f34361z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f10) {
        this.f34339b0 = f10;
    }

    public final void l() {
        this.F.a(this.f34361z, true);
        this.G.a(this.A, true);
        this.J.f(this.f34345i, true);
        this.I.a(this.f34360y, true);
        this.E.a(this.f34359x, true);
        e5 e5Var = this.f34356t;
        if (e5Var != null) {
            e5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.gj gjVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean q10;
        int i7;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i10;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
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
                this.f34353q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i10;
        }
        this.V = false;
        this.f34361z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34345i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34346j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i11 = i7 | (-16777216);
        this.f34360y = i11;
        this.f34359x = org.telegram.ui.ActionBar.j6.r1(0.1f, i11);
        long j3 = tL_peerColorCollectible.background_emoji_id;
        this.v = j3;
        this.f34358w = tL_peerColorCollectible.gift_emoji_id;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        View view = this.D;
        if (i12 != 0 && this.f34356t == null && view != null) {
            this.f34356t = new e5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).O0) {
                this.f34356t.a();
            }
        }
        e5 e5Var = this.f34356t;
        if (e5Var != null && e5Var.j(this.v, true)) {
            this.f34341c0 = false;
        }
        this.C = this.f34360y;
        if (this.f34358w != 0 && this.f34357u == null && view != null) {
            this.f34357u = new e5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).O0) {
                this.f34357u.a();
            }
        }
        e5 e5Var2 = this.f34357u;
        if (e5Var2 != null) {
            e5Var2.j(this.f34358w, true);
        }
        return this.I.a(this.f34360y, false);
    }

    public final void n(org.telegram.messenger.gj gjVar, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        org.telegram.messenger.cp cpVar;
        boolean z10;
        int i11;
        int i12;
        if (e6Var != null) {
            e6Var.a();
        } else {
            org.telegram.ui.ActionBar.j6.j1();
        }
        boolean z11 = true;
        if (this.P != i7) {
            if (gjVar != null) {
                i12 = gjVar.e1();
            } else {
                i12 = 0;
            }
            if (i12 == this.O) {
                this.f34353q++;
            }
            this.Q = 0L;
            this.P = i7;
            this.O = i12;
        }
        if (i7 < 7) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29110r8[i7], e6Var);
            this.B = w02;
            this.A = w02;
            this.f34361z = w02;
            this.f34346j = false;
            this.f34345i = false;
            return;
        }
        if (gjVar != null) {
            i10 = gjVar.K1;
        } else {
            i10 = org.telegram.messenger.m10.f24934t0;
        }
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(i10).f25380r4;
        if (dpVar != null) {
            cpVar = dpVar.d(i7);
        } else {
            cpVar = null;
        }
        if (cpVar == null) {
            if (gjVar != null && gjVar.P3()) {
                i11 = org.telegram.ui.ActionBar.j6.Rb;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Ld;
            }
            int w03 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
            this.B = w03;
            this.A = w03;
            this.f34361z = w03;
            this.f34346j = false;
            this.f34345i = false;
            return;
        }
        this.f34361z = cpVar.e(0, e6Var);
        this.A = cpVar.e(1, e6Var);
        int e10 = cpVar.e(2, e6Var);
        this.B = e10;
        int i13 = this.A;
        int i14 = this.f34361z;
        if (i13 != i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34345i = z10;
        if (e10 == i14) {
            z11 = false;
        }
        this.f34346j = z11;
        if (z11) {
            this.B = i13;
            this.A = e10;
        }
    }

    public final void o(float f10) {
        this.f34354r = f10;
    }

    public final int p(org.telegram.ui.ActionBar.e6 e6Var) {
        View view;
        this.R = false;
        int i7 = org.telegram.ui.ActionBar.j6.f29090q7;
        this.f34360y = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        this.f34361z = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        this.f34345i = false;
        this.f34346j = false;
        this.f34359x = org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        if (this.v != 0 && this.f34356t == null && (view = this.D) != null) {
            this.f34356t = new e5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).O0) {
                this.f34356t.a();
            }
        }
        e5 e5Var = this.f34356t;
        if (e5Var != null && e5Var.j(this.v, true)) {
            this.f34341c0 = false;
        }
        this.C = i();
        return this.I.a(this.f34360y, false);
    }

    public final void q(boolean z10) {
        d80 d80Var;
        if (!z10 && this.W) {
            this.X = 0.0f;
            d80 d80Var2 = this.h;
            if (d80Var2 != null) {
                d80Var2.a();
            }
        } else if (z10 && !this.W && (d80Var = this.h) != null) {
            d80Var.f33866c = -1L;
            d80Var.f33865b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i7, boolean z10) {
        float f10;
        this.R = false;
        this.V = false;
        this.f34346j = false;
        this.f34345i = false;
        this.B = i7;
        this.A = i7;
        this.f34361z = i7;
        if (z10) {
            f10 = 0.12f;
        } else {
            f10 = 0.1f;
        }
        this.f34359x = org.telegram.ui.ActionBar.j6.r1(f10, i7);
        this.C = i7;
    }
}
