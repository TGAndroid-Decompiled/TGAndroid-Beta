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
public final class dk0 {
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
    public ck0[] f33128a0;
    public float f33130b0;
    public boolean f33132c0;
    public w70 h;
    public boolean f33136i;
    public boolean f33137j;
    public Bitmap f33138k;
    public int f33139l;
    public int f33140m;
    public int f33141n;
    public int f33142o;
    public boolean f33143p;
    public boolean f33146s;
    public e5 f33147t;
    public e5 f33148u;
    public long v;
    public long f33149w;
    public int f33150x;
    public int f33151y;
    public int f33152z;
    public final RectF f33127a = new RectF();
    public final Paint f33129b = new Paint(1);
    public final Paint f33131c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] f33133e = new float[8];
    public final Path f33134f = new Path();
    public final Paint f33135g = new Paint();
    public int f33144q = 0;
    public float f33145r = 1.0f;

    public dk0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new ai.f2(this, 14));
        }
        xq xqVar = xq.h;
        this.E = new x4(view, 400L, xqVar, 0);
        this.F = new x4(view, 400L, xqVar, 0);
        this.G = new x4(view, 400L, xqVar, 0);
        this.H = new x4(view, 400L, xqVar, 0);
        this.I = new x4(view, 400L, xqVar, 0);
        this.J = new u5(view, 0L, 400L, xqVar);
        this.K = new u5(view, 0L, 400L, xqVar);
        this.L = new u5(view, 0L, 440L, xqVar);
        this.M = new u5(view, 0L, 320L, xqVar);
        this.N = new u5(view, 0L, 320L, xqVar);
    }

    public final int a(org.telegram.messenger.zi ziVar, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        boolean q10;
        boolean z10;
        x4 x4Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        org.telegram.messenger.zi ziVar2;
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
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        if (ziVar != null && !ziVar.Q3() && i3 != 2 && (tL_peerColorCollectible = ziVar.f26842e1) != null) {
            return m(ziVar, tL_peerColorCollectible, e6Var);
        }
        this.V = false;
        this.v = 0L;
        this.f33149w = 0L;
        if (ziVar != null && ziVar.s4()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33146s = z10;
        x4 x4Var2 = this.I;
        float f11 = 0.1f;
        if (ziVar == null) {
            this.R = true;
            this.S = i3;
            this.T = e6Var;
            this.U = org.telegram.ui.ActionBar.r6.f28515b;
            this.f33137j = false;
            this.f33136i = false;
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Id, e6Var);
            this.B = w03;
            this.A = w03;
            this.f33152z = w03;
            if (q10) {
                f10 = 0.12f;
            } else {
                f10 = 0.1f;
            }
            this.f33150x = org.telegram.ui.ActionBar.k6.r1(f10, w03);
            this.C = i();
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kd, e6Var);
            this.f33151y = w04;
            return x4Var2.a(w04, false);
        }
        int i12 = ziVar.I1;
        if (i3 == 4 && (message4 = ziVar.f26868k) != null && org.telegram.messenger.zi.o1(message4) != null && (org.telegram.messenger.zi.o1(ziVar.f26868k) instanceof TLRPC.TL_messageMediaContact)) {
            long j10 = org.telegram.messenger.zi.o1(ziVar.f26868k).user_id;
            if (j10 != 0) {
                user3 = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(j10));
            } else {
                user3 = null;
            }
            if (!ziVar.Q3() && i3 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(ziVar, (TLRPC.TL_peerColorCollectible) peerColor3, e6Var);
                }
            }
            if (user3 != null) {
                i11 = org.telegram.messenger.l10.e(user3);
                x4Var = x4Var2;
                this.v = org.telegram.messenger.l10.f(user3);
            } else {
                x4Var = x4Var2;
                i11 = 0;
            }
            n(ziVar, i11, e6Var);
            this.f33150x = org.telegram.ui.ActionBar.k6.r1(0.1f, this.f33152z);
            this.f33151y = this.f33152z;
        } else {
            x4Var = x4Var2;
            if (i3 != 0 && (ziVar.f26834c1 >= 0 || (ziVar.f26868k != null && (((ziVar.q3() || org.telegram.messenger.m5.C(org.telegram.messenger.zi.B0(ziVar.f26868k))) && user4 != null) || ((ziVar.o3() && chat != null) || (((message3 = ziVar.f26868k) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (ziVar.s4() && (peerColor2 = ziVar.X0) != null && peerColor2.color != -1))))))) {
                int i13 = ziVar.f26834c1;
                if (i13 < 0) {
                    if (ziVar.s4() && (peerColor = ziVar.X0) != null && (i10 = peerColor.color) != -1) {
                        if (i3 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                    } else {
                        TLRPC.Message message5 = ziVar.f26868k;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long o10 = org.telegram.messenger.m5.o(peer);
                            i10 = 5;
                            if (o10 < 0) {
                                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(-o10));
                                if (!ziVar.Q3() && i3 != 2 && M0 != null) {
                                    TLRPC.PeerColor peerColor4 = M0.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(ziVar, (TLRPC.TL_peerColorCollectible) peerColor4, e6Var);
                                    }
                                }
                                if (M0 != null) {
                                    i10 = org.telegram.messenger.t3.F(M0);
                                }
                                if (i3 == 3) {
                                    this.v = org.telegram.messenger.t3.G(M0);
                                }
                            } else {
                                TLRPC.User a22 = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(o10));
                                if (!ziVar.Q3() && i3 != 2 && a22 != null) {
                                    TLRPC.PeerColor peerColor5 = a22.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(ziVar, (TLRPC.TL_peerColorCollectible) peerColor5, e6Var);
                                    }
                                }
                                if (a22 != null) {
                                    i10 = org.telegram.messenger.l10.e(a22);
                                }
                                if (i3 == 3) {
                                    this.v = org.telegram.messenger.l10.f(a22);
                                }
                            }
                        } else if (org.telegram.messenger.m5.C(org.telegram.messenger.zi.B0(message5)) && user4 != null) {
                            if (ziVar.Q3()) {
                                user2 = org.telegram.messenger.h10.i(i12).f();
                            } else {
                                user2 = user4;
                            }
                            if (user2 != null) {
                                user4 = user2;
                            }
                            if (!ziVar.Q3() && i3 != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ziVar, (TLRPC.TL_peerColorCollectible) peerColor6, e6Var);
                                }
                            }
                            i13 = org.telegram.messenger.l10.e(user4);
                            if (i3 == 3) {
                                this.v = org.telegram.messenger.l10.f(user4);
                            }
                        } else if (ziVar.q3() && user4 != null) {
                            if (!ziVar.Q3() && i3 != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ziVar, (TLRPC.TL_peerColorCollectible) peerColor7, e6Var);
                                }
                            }
                            i13 = org.telegram.messenger.l10.e(user4);
                            if (i3 == 3) {
                                this.v = org.telegram.messenger.l10.f(user4);
                            }
                        } else if (ziVar.o3() && chat != null) {
                            if (!ziVar.Q3() && i3 != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ziVar, (TLRPC.TL_peerColorCollectible) peerColor8, e6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long Z0 = ziVar.Z0();
                                if (Z0 >= 0) {
                                    TLRPC.User a23 = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(Z0));
                                    F = org.telegram.messenger.l10.e(a23);
                                    if (i3 == 3) {
                                        this.v = org.telegram.messenger.l10.f(a23);
                                    }
                                } else {
                                    TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(-Z0));
                                    F = org.telegram.messenger.t3.F(M02);
                                    if (i3 == 3) {
                                        this.v = org.telegram.messenger.t3.G(M02);
                                    }
                                }
                                i13 = F;
                            } else {
                                i13 = org.telegram.messenger.t3.F(chat);
                                if (i3 == 3) {
                                    this.v = org.telegram.messenger.t3.G(chat);
                                }
                            }
                        } else {
                            i13 = 0;
                        }
                    }
                    i13 = i10;
                }
                n(ziVar, i13, e6Var);
                this.f33150x = org.telegram.ui.ActionBar.k6.r1(0.1f, this.f33152z);
                this.f33151y = this.f33152z;
            } else if (i3 == 0 && (ziVar.f26834c1 >= 0 || ((message = ziVar.f26868k) != null && ziVar.C != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (ziVar2 = ziVar.C).f26868k) != null && message2.from_id != null && (ziVar2.q3() || org.telegram.messenger.m5.C(org.telegram.messenger.zi.B0(ziVar.f26868k)) || ziVar.C.o3()))))) {
                int i14 = ziVar.f26834c1;
                if (i14 < 0) {
                    if (org.telegram.messenger.m5.C(org.telegram.messenger.zi.B0(ziVar.C.f26868k))) {
                        if (ziVar.C.Q3()) {
                            user4 = org.telegram.messenger.h10.i(ziVar.C.I1).f();
                        }
                        if (user4 != null) {
                            i14 = org.telegram.messenger.l10.e(user4);
                            this.v = org.telegram.messenger.l10.f(user4);
                        }
                        i14 = 0;
                    } else if (ziVar.C.q3()) {
                        TLRPC.User a24 = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(ziVar.C.f26868k.from_id.user_id));
                        if (!ziVar.Q3() && i3 != 2 && a24 != null) {
                            TLRPC.PeerColor peerColor9 = a24.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(ziVar, (TLRPC.TL_peerColorCollectible) peerColor9, e6Var);
                            }
                        }
                        if (a24 != null) {
                            i14 = org.telegram.messenger.l10.e(a24);
                            this.v = org.telegram.messenger.l10.f(a24);
                        }
                        i14 = 0;
                    } else {
                        if (ziVar.C.o3()) {
                            TLRPC.Chat M03 = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(ziVar.C.f26868k.from_id.channel_id));
                            if (!ziVar.Q3() && i3 != 2 && M03 != null) {
                                TLRPC.PeerColor peerColor10 = M03.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(ziVar, (TLRPC.TL_peerColorCollectible) peerColor10, e6Var);
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
                n(ziVar.C, i14, e6Var);
                this.f33150x = org.telegram.ui.ActionBar.k6.r1(0.1f, this.f33152z);
                this.f33151y = this.f33152z;
            } else {
                this.f33136i = false;
                this.f33137j = false;
                int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Id, e6Var);
                this.B = w05;
                this.A = w05;
                this.f33152z = w05;
                this.f33150x = org.telegram.ui.ActionBar.k6.r1(0.1f, w05);
                this.f33151y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kd, e6Var);
            }
        }
        if (ziVar.Q5()) {
            this.f33136i = false;
            this.f33137j = false;
            this.B = -1;
            this.A = -1;
            this.f33152z = -1;
            this.f33150x = 0;
            this.f33151y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, e6Var);
        } else if (ziVar.Q3() || i3 == 2) {
            if (i3 == 2 && !ziVar.Q3()) {
                int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.dl, e6Var);
                this.B = w06;
                this.A = w06;
                this.f33152z = w06;
            } else {
                int i15 = org.telegram.ui.ActionBar.k6.Ob;
                Integer z02 = org.telegram.ui.ActionBar.k6.z0(i15, e6Var);
                if (z02 != null) {
                    w02 = z02.intValue();
                } else {
                    if (this.f33136i || this.f33137j) {
                        i15 = org.telegram.ui.ActionBar.k6.Pb;
                    }
                    w02 = org.telegram.ui.ActionBar.k6.w0(i15, e6Var);
                }
                this.B = w02;
                this.A = w02;
                this.f33152z = w02;
            }
            if (this.f33137j) {
                this.V = true;
                this.f33152z = org.telegram.ui.ActionBar.k6.r1(0.2f, this.f33152z);
                this.A = org.telegram.ui.ActionBar.k6.r1(0.5f, this.A);
            } else if (this.f33136i) {
                this.V = true;
                this.f33152z = org.telegram.ui.ActionBar.k6.r1(0.35f, this.f33152z);
            }
            int i16 = this.B;
            if (q10) {
                f11 = 0.12f;
            }
            this.f33150x = org.telegram.ui.ActionBar.k6.r1(f11, i16);
            int i17 = org.telegram.ui.ActionBar.k6.Qb;
            this.f33151y = org.telegram.ui.ActionBar.k6.w0(i17, e6Var);
            if (ziVar.Q2() && ziVar.Q3()) {
                this.f33150x = i0.a.k(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oa, e6Var), i0.a.k(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.La, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28200ua, e6Var)));
                this.f33151y = org.telegram.ui.ActionBar.k6.z0(i17, e6Var).intValue();
            }
        }
        if (i3 == 0 || i3 == 3 || i3 == 4) {
            long j11 = ziVar.f26837d1;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f33147t == null && (view = this.D) != null) {
            this.f33147t = new e5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).O0) {
                this.f33147t.a();
            }
        }
        e5 e5Var = this.f33147t;
        if (e5Var != null) {
            z11 = true;
            if (e5Var.j(this.v, true)) {
                this.f33132c0 = false;
            }
        } else {
            z11 = true;
        }
        e5 e5Var2 = this.f33148u;
        if (e5Var2 != null) {
            e5Var2.j(this.f33149w, z11);
        }
        this.C = i();
        return x4Var.a(this.f33151y, false);
    }

    public final void b() {
        dk0 dk0Var;
        if (this.R && this.U != org.telegram.ui.ActionBar.r6.f28515b) {
            try {
                dk0Var = this;
            } catch (Exception e10) {
                e = e10;
                dk0Var = this;
            }
            try {
                dk0Var.a(null, null, null, this.T, this.S);
            } catch (Exception e11) {
                e = e11;
                dk0Var.R = false;
                org.telegram.messenger.a8.g(e, true);
            }
        }
    }

    public final void c(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z10, boolean z11) {
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.az.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f33133e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.az.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f13, z10, z11);
    }

    public final void e(Canvas canvas, RectF rectF, float f10, boolean z10, boolean z11) {
        boolean z12;
        ei.c3 c3Var;
        float d;
        int i3;
        e5 e5Var;
        float f11;
        b();
        if (!z11) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(f10, this.E.a(this.f33150x, false));
            Paint paint = this.f33135g;
            paint.setColor(r12);
            float[] fArr = this.f33133e;
            if (b8.w9.a(fArr)) {
                float f12 = fArr[0];
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                Path path = this.f33134f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        e5 e5Var2 = this.f33147t;
        if (e5Var2 != null) {
            if (!this.f33132c0) {
                Drawable drawable = e5Var2.f33286f[0];
                if ((drawable instanceof g5) && (c3Var = ((g5) drawable).f33971k) != null && c3Var.J()) {
                    this.f33132c0 = true;
                } else {
                    z12 = false;
                    d = this.L.d(z12);
                    if (d <= 0.0f && this.f33145r > 0.0f) {
                        if (this.f33128a0 == null) {
                            i3 = 0;
                            this.f33128a0 = new ck0[]{new ck0(4.0f, -6.33f, 1.0f, 1.0f), new ck0(30.0f, 3.0f, 0.78f, 0.9f), new ck0(46.0f, -17.0f, 0.6f, 0.6f), new ck0(69.66f, -0.666f, 0.87f, 0.7f), new ck0(98.0f, -12.6f, 1.03f, 0.3f), new ck0(51.0f, 24.0f, 1.0f, 0.5f), new ck0(6.33f, 20.0f, 0.77f, 0.7f), new ck0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new ck0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i3 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.f33130b0);
                        float max = Math.max(rectF.right - org.telegram.messenger.g0.L(15.0f), rectF.centerX());
                        if (z10) {
                            max -= org.telegram.messenger.g0.L(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + org.telegram.messenger.g0.L(21.0f));
                        e5 e5Var3 = this.f33148u;
                        if (e5Var3 != null) {
                            e5Var3.f33290w = (int) (f10 * 255.0f);
                        }
                        this.f33147t.k(Integer.valueOf(this.C));
                        int i10 = i3;
                        while (true) {
                            ck0[] ck0VarArr = this.f33128a0;
                            if (i10 < ck0VarArr.length) {
                                if (i10 != 0 || (e5Var = this.f33148u) == null || this.f33149w == 0) {
                                    e5Var = this.f33147t;
                                }
                                ck0 ck0Var = ck0VarArr[i10];
                                if (!ck0Var.f32762e || z10) {
                                    if (e5Var == this.f33148u) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.3f;
                                    }
                                    e5Var.f33290w = (int) (f11 * 255.0f * ck0Var.d * this.f33145r);
                                    float L = max - org.telegram.messenger.g0.L(ck0Var.f32759a);
                                    float L2 = org.telegram.messenger.g0.L(ck0Var.f32760b) + min;
                                    float L3 = org.telegram.messenger.g0.L(10.0f) * ck0Var.f32761c * d;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dk0.f(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void g(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        w70 w70Var;
        float max = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.az.Y0 / 3.0f)), org.telegram.messenger.g0.L(f10));
        float[] fArr = this.f33133e;
        fArr[1] = max;
        fArr[0] = max;
        float L = org.telegram.messenger.g0.L(f11);
        fArr[3] = L;
        fArr[2] = L;
        float L2 = org.telegram.messenger.g0.L(f12);
        fArr[5] = L2;
        fArr[4] = L2;
        float max2 = Math.max(org.telegram.messenger.g0.L((int) Math.floor(org.telegram.messenger.az.Y0 / 3.0f)), org.telegram.messenger.g0.L(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((w70Var = this.h) == null || !w70Var.d())) {
            w70 w70Var2 = this.h;
            if (w70Var2 != null) {
                w70Var2.f39925b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            w70 w70Var3 = new w70();
            this.h = w70Var3;
            w70Var3.D = true;
            w70Var3.f39941t = 3.5f;
            w70Var3.f39942u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.k6.r1(0.1f, this.f33152z), org.telegram.ui.ActionBar.k6.r1(0.3f, this.f33152z), org.telegram.ui.ActionBar.k6.r1(0.3f, this.f33152z), org.telegram.ui.ActionBar.k6.r1(1.25f, this.f33152z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f39944x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.f33150x;
    }

    public final int i() {
        if (this.V) {
            return this.A;
        }
        return this.f33152z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float d = this.M.d(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * d) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f10) {
        this.f33130b0 = f10;
    }

    public final void l() {
        this.F.a(this.f33152z, true);
        this.G.a(this.A, true);
        this.J.f(this.f33136i, true);
        this.I.a(this.f33151y, true);
        this.E.a(this.f33150x, true);
        e5 e5Var = this.f33147t;
        if (e5Var != null) {
            e5Var.d.e(true, 1.0f);
        }
    }

    public final int m(org.telegram.messenger.zi ziVar, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean q10;
        int i3;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i10;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
            i3 = tL_peerColorCollectible.dark_accent_color;
        } else {
            i3 = tL_peerColorCollectible.accent_color;
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
            if (ziVar != null) {
                i10 = ziVar.f1();
            } else {
                i10 = 0;
            }
            if (i10 == this.O) {
                this.f33144q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i10;
        }
        this.V = false;
        this.f33152z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33136i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33137j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i11 = i3 | (-16777216);
        this.f33151y = i11;
        this.f33150x = org.telegram.ui.ActionBar.k6.r1(0.1f, i11);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f33149w = tL_peerColorCollectible.gift_emoji_id;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        View view = this.D;
        if (i12 != 0 && this.f33147t == null && view != null) {
            this.f33147t = new e5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).O0) {
                this.f33147t.a();
            }
        }
        e5 e5Var = this.f33147t;
        if (e5Var != null && e5Var.j(this.v, true)) {
            this.f33132c0 = false;
        }
        this.C = this.f33151y;
        if (this.f33149w != 0 && this.f33148u == null && view != null) {
            this.f33148u = new e5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).O0) {
                this.f33148u.a();
            }
        }
        e5 e5Var2 = this.f33148u;
        if (e5Var2 != null) {
            e5Var2.j(this.f33149w, true);
        }
        return this.I.a(this.f33151y, false);
    }

    public final void n(org.telegram.messenger.zi ziVar, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        org.telegram.messenger.wo woVar;
        boolean z10;
        int i11;
        int i12;
        if (e6Var != null) {
            e6Var.a();
        } else {
            org.telegram.ui.ActionBar.k6.j1();
        }
        boolean z11 = true;
        if (this.P != i3) {
            if (ziVar != null) {
                i12 = ziVar.f1();
            } else {
                i12 = 0;
            }
            if (i12 == this.O) {
                this.f33144q++;
            }
            this.Q = 0L;
            this.P = i3;
            this.O = i12;
        }
        if (i3 < 7) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28142r8[i3], e6Var);
            this.B = w02;
            this.A = w02;
            this.f33152z = w02;
            this.f33137j = false;
            this.f33136i = false;
            return;
        }
        if (ziVar != null) {
            i10 = ziVar.I1;
        } else {
            i10 = org.telegram.messenger.h10.f22829t0;
        }
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(i10).f23099q4;
        if (xoVar != null) {
            woVar = xoVar.d(i3);
        } else {
            woVar = null;
        }
        if (woVar == null) {
            if (ziVar != null && ziVar.Q3()) {
                i11 = org.telegram.ui.ActionBar.k6.Ob;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Id;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
            this.B = w03;
            this.A = w03;
            this.f33152z = w03;
            this.f33137j = false;
            this.f33136i = false;
            return;
        }
        this.f33152z = woVar.e(0, e6Var);
        this.A = woVar.e(1, e6Var);
        int e10 = woVar.e(2, e6Var);
        this.B = e10;
        int i13 = this.A;
        int i14 = this.f33152z;
        if (i13 != i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33136i = z10;
        if (e10 == i14) {
            z11 = false;
        }
        this.f33137j = z11;
        if (z11) {
            this.B = i13;
            this.A = e10;
        }
    }

    public final void o(float f10) {
        this.f33145r = f10;
    }

    public final int p(org.telegram.ui.ActionBar.e6 e6Var) {
        View view;
        this.R = false;
        int i3 = org.telegram.ui.ActionBar.k6.f28122q7;
        this.f33151y = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        this.f33152z = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        this.f33136i = false;
        this.f33137j = false;
        this.f33150x = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        if (this.v != 0 && this.f33147t == null && (view = this.D) != null) {
            this.f33147t = new e5(org.telegram.messenger.g0.L(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.q1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.q1) view).O0) {
                this.f33147t.a();
            }
        }
        e5 e5Var = this.f33147t;
        if (e5Var != null && e5Var.j(this.v, true)) {
            this.f33132c0 = false;
        }
        this.C = i();
        return this.I.a(this.f33151y, false);
    }

    public final void q(boolean z10) {
        w70 w70Var;
        if (!z10 && this.W) {
            this.X = 0.0f;
            w70 w70Var2 = this.h;
            if (w70Var2 != null) {
                w70Var2.a();
            }
        } else if (z10 && !this.W && (w70Var = this.h) != null) {
            w70Var.f39926c = -1L;
            w70Var.f39925b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i3, boolean z10) {
        float f10;
        this.R = false;
        this.V = false;
        this.f33137j = false;
        this.f33136i = false;
        this.B = i3;
        this.A = i3;
        this.f33152z = i3;
        if (z10) {
            f10 = 0.12f;
        } else {
            f10 = 0.1f;
        }
        this.f33150x = org.telegram.ui.ActionBar.k6.r1(f10, i3);
        this.C = i3;
    }
}
