package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class FragmentContextView extends FrameLayout implements org.telegram.messenger.fs, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.c6 {
    public static final float[] X0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public boolean B0;
    public hi.u3 C0;
    public ViewGroup D0;
    public v00 E;
    public long E0;
    public nh0 F;
    public org.telegram.ui.Cells.y F0;
    public ImageView G;
    public PorterDuffColorFilter G0;
    public org.telegram.ui.ActionBar.q0 H;
    public PorterDuffColorFilter H0;
    public ou0 I;
    public int I0;
    public org.telegram.ui.ActionBar.u0 J;
    public int J0;
    public final org.telegram.ui.ActionBar.o0[] K;
    public int K0;
    public FrameLayout L;
    public final org.telegram.messenger.gs[] L0;
    public ImageView M;
    public xi.e M0;
    public org.telegram.ui.ActionBar.n2 N;
    public float N0;
    public int O;
    public float O0;
    public org.telegram.ui.Components.voip.n P;
    public boolean P0;
    public boolean Q;
    public boolean Q0;
    public int R;
    public final Paint R0;
    public org.telegram.messenger.fj S;
    public boolean S0;
    public float T;
    public int T0;
    public boolean U;
    public float U0;
    public int V;
    public final te.j V0;
    public String W;
    public int W0;
    public final wc f33052a;
    public boolean f33053a0;
    public ImageView f33054b;
    public boolean f33055b0;
    public ve0 f33056c;
    public d9 f33057c0;
    public t00 d;
    public Paint f33058d0;
    public t00 f33059e;
    public LinearGradient f33060e0;
    public AnimatorSet f33061f;
    public Matrix f33062f0;
    public int f33063g0;
    public final org.telegram.ui.ActionBar.g2 h;
    public TextPaint f33064h0;
    public boolean f33065i0;
    public boolean f33066j0;
    public final m6 f33067k0;
    public lc f33068l0;
    public boolean m0;
    public final ah f33069n;
    public final r00 f33070n0;
    public final int f33071o0;
    public final boolean f33072p0;
    public x00 f33073q0;
    public final View f33074r;
    public final org.telegram.ui.ActionBar.i6 f33075r0;
    public s00 f33076s;
    public boolean f33077s0;
    public int f33078t0;
    public final rc f33079u0;
    public final h2.f f33080v0;
    public bi.v2 f33081w;
    public final h2.f f33082w0;
    public View f33083x;
    public boolean f33084x0;
    public qh0 f33085y;
    public boolean f33086y0;
    public boolean f33087z0;

    public FragmentContextView(Context context, org.telegram.ui.bx bxVar, boolean z10) {
        this(context, bxVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i7 = this.V;
        org.telegram.ui.ActionBar.i6 i6Var = this.f33075r0;
        if (i7 == 4) {
            return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29748t7, i6Var);
        }
        if (i7 != 1 && i7 != 3) {
            return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29768u7, i6Var);
        }
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A7, i6Var);
    }

    public static boolean i(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.05f) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
        if (fjVar != null && org.telegram.messenger.fj.R4(fjVar.f24073k)) {
            return true;
        }
        return false;
    }

    public final void a(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.a(boolean):void");
    }

    public final void b() {
        if (this.f33076s != null) {
            return;
        }
        Context context = getContext();
        s00 s00Var = new s00(this, context);
        this.f33076s = s00Var;
        this.f33068l0 = new lc(s00Var);
        int i7 = org.telegram.messenger.g0.f24226q.x;
        m6 m6Var = this.f33067k0;
        m6Var.N = i7;
        m6Var.B = 0.4f;
        m6Var.setCallback(s00Var);
        m6Var.u(-1);
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        addView(this.f33076s, c8.na.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f33083x = view;
        this.f33076s.addView(view, c8.na.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f33054b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f33054b;
        int i10 = org.telegram.ui.ActionBar.n6.f29806w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.i6 i6Var = this.f33075r0;
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, i6Var, mode);
        ImageView imageView3 = this.f33054b;
        ve0 ve0Var = new ve0(16);
        this.f33056c = ve0Var;
        imageView3.setImageDrawable(ve0Var);
        this.f33054b.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, i6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        addView(this.f33054b, c8.na.e(36, 36, 51));
        this.f33054b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f37307b;

            {
                this.f37307b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i11;
                long j3;
                TL_stories.StoryItem u10;
                int i12;
                int i13 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f37307b;
                switch (i13) {
                    case 0:
                        ah ahVar = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var2 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), i6Var2);
                            String N0 = org.telegram.messenger.gd.N0(2131744594, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.bx) {
                                t1Var.U = org.telegram.messenger.gd.N0(2131744596, null);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User j10 = ahVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToGroupText", null, 2131744595, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToUserText", null, 2131744593, org.telegram.messenger.n10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.gd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744600, null), new l00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, i6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var3 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.f11799b;
                                int i15 = c1Var.f11801e;
                                if (i15 != org.telegram.messenger.i10.f24637t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.mp.u1(i15).R1().u(c1Var.f11800c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i15).G(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                            if (g2Var2 != null && fjVar != null) {
                                if (fjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new e8(W, i6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new e8(LaunchActivity.H1, i6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j12 = ahVar2.a();
                                }
                                if (org.telegram.messenger.fj.B0(fjVar.f24073k) == j12) {
                                    fragmentContextView.f33069n.l(fjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.n5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.n5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", fjVar.e1());
                                g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.i10.f24637t0;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i11 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.qd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.qd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.pd pdVar = (org.telegram.messenger.pd) org.telegram.messenger.qd.f(i17).J.get(0);
                                            j3 = pdVar.f26319a;
                                            i11 = pdVar.h.K1;
                                        }
                                    }
                                }
                                i11 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.qd.f(i11).h(j3));
                                return;
                            } else {
                                g2Var2.showDialog(new lt0(fragmentContextView.getContext(), new l00(fragmentContextView), i6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (g2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.f27035c));
                                TLRPC.GroupCall groupCall2 = groupCall.f27034b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                            if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                w30 w30Var = new w30(fragmentContextView.getContext(), null, bnVar, i6Var3);
                                w30Var.I0 = new y0(fragmentContextView, 6);
                                g2Var2.showDialog(w30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f22838v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22838v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            nh0 nh0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i12 = 15;
                            } else {
                                i12 = 29;
                            }
                            if (nh0Var.P(i12)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.n6.G0().c(true);
                            fragmentContextView.f33052a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        ?? imageView4 = new ImageView(context);
        this.f33085y = imageView4;
        imageView4.setScaleType(scaleType);
        this.f33085y.setAutoRepeat(true);
        this.f33085y.f(2131624065, 30, 30, null);
        org.telegram.ui.ActionBar.u6.B(this.f33085y, org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.w0(i10, i6Var)), org.telegram.ui.ActionBar.u6.M(i10), i6Var);
        addView(this.f33085y, c8.na.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        t00 t00Var = new t00(this, context, context, 0);
        this.d = t00Var;
        addView(t00Var, c8.na.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        t00 t00Var2 = new t00(this, context, context, 1);
        this.f33059e = t00Var2;
        addView(t00Var2, c8.na.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.P = nVar;
        nVar.f41075g = 1.0f;
        nVar.f41077j = false;
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(2, context, this);
        this.N = n2Var;
        n2Var.setText(org.telegram.messenger.gd.N0(2131743192, null));
        org.telegram.ui.ActionBar.u6.U(this.N, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        org.telegram.ui.ActionBar.n2 n2Var2 = this.N;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.Hi;
        int w03 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
        org.telegram.ui.ActionBar.u6.Q(n2Var2, org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.u6.M(i11), org.telegram.ui.ActionBar.u6.M(i12), i6Var);
        this.N.setTextSize(1, 14.0f);
        this.N.setTypeface(org.telegram.messenger.g0.o());
        this.N.setGravity(17);
        this.N.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(this.N, c8.na.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.N.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f37307b;

            {
                this.f37307b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i13 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f37307b;
                switch (i13) {
                    case 0:
                        ah ahVar = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var2 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), i6Var2);
                            String N0 = org.telegram.messenger.gd.N0(2131744594, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.bx) {
                                t1Var.U = org.telegram.messenger.gd.N0(2131744596, null);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User j10 = ahVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToGroupText", null, 2131744595, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToUserText", null, 2131744593, org.telegram.messenger.n10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.gd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744600, null), new l00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, i6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var3 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.f11799b;
                                int i15 = c1Var.f11801e;
                                if (i15 != org.telegram.messenger.i10.f24637t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.mp.u1(i15).R1().u(c1Var.f11800c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i15).G(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                            if (g2Var2 != null && fjVar != null) {
                                if (fjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new e8(W, i6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new e8(LaunchActivity.H1, i6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j12 = ahVar2.a();
                                }
                                if (org.telegram.messenger.fj.B0(fjVar.f24073k) == j12) {
                                    fragmentContextView.f33069n.l(fjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.n5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.n5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", fjVar.e1());
                                g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.i10.f24637t0;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i112 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.qd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.qd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.pd pdVar = (org.telegram.messenger.pd) org.telegram.messenger.qd.f(i17).J.get(0);
                                            j3 = pdVar.f26319a;
                                            i112 = pdVar.h.K1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.qd.f(i112).h(j3));
                                return;
                            } else {
                                g2Var2.showDialog(new lt0(fragmentContextView.getContext(), new l00(fragmentContextView), i6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (g2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.f27035c));
                                TLRPC.GroupCall groupCall2 = groupCall.f27034b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                            if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                w30 w30Var = new w30(fragmentContextView.getContext(), null, bnVar, i6Var3);
                                w30Var.I0 = new y0(fragmentContextView, 6);
                                g2Var2.showDialog(w30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f22838v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22838v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            nh0 nh0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (nh0Var.P(i122)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.n6.G0().c(true);
                            fragmentContextView.f33052a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        if (this.P0) {
            n();
        }
        this.L = new FrameLayout(context);
        ImageView imageView5 = new ImageView(context);
        this.M = imageView5;
        imageView5.setImageResource(2131232261);
        ImageView imageView6 = this.M;
        int i13 = org.telegram.ui.ActionBar.n6.f29825x7;
        org.telegram.ui.ActionBar.u6.s(imageView6, i13, i6Var, mode);
        this.L.addView(this.M, c8.na.e(20, 20, 17));
        this.L.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.L.setContentDescription(org.telegram.messenger.gd.N0(2131743602, null));
        this.L.setOnClickListener(new bi.o(17));
        this.L.setVisibility(8);
        addView(this.L, c8.na.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f33072p0) {
            h();
        }
        d9 d9Var = new d9(context, false);
        this.f33057c0 = d9Var;
        d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(21.0f));
        this.f33057c0.setDelegate(new p00(this, 1));
        this.f33057c0.setVisibility(8);
        addView(this.f33057c0, c8.na.e(108, 36, 51));
        this.F = new nh0(2131624333, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), true, null);
        v00 v00Var = new v00(this, context);
        this.E = v00Var;
        org.telegram.ui.ActionBar.u6.s(v00Var, org.telegram.ui.ActionBar.n6.A7, i6Var, PorterDuff.Mode.SRC_IN);
        this.E.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.E.setAnimation(this.F);
        this.E.setScaleType(scaleType);
        this.E.setVisibility(8);
        addView(this.E, c8.na.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f37307b;

            {
                this.f37307b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f37307b;
                switch (i132) {
                    case 0:
                        ah ahVar = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var2 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), i6Var2);
                            String N0 = org.telegram.messenger.gd.N0(2131744594, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.bx) {
                                t1Var.U = org.telegram.messenger.gd.N0(2131744596, null);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User j10 = ahVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToGroupText", null, 2131744595, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToUserText", null, 2131744593, org.telegram.messenger.n10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.gd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744600, null), new l00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, i6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var3 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.f11799b;
                                int i15 = c1Var.f11801e;
                                if (i15 != org.telegram.messenger.i10.f24637t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.mp.u1(i15).R1().u(c1Var.f11800c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i15).G(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                            if (g2Var2 != null && fjVar != null) {
                                if (fjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new e8(W, i6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new e8(LaunchActivity.H1, i6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j12 = ahVar2.a();
                                }
                                if (org.telegram.messenger.fj.B0(fjVar.f24073k) == j12) {
                                    fragmentContextView.f33069n.l(fjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.n5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.n5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", fjVar.e1());
                                g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.i10.f24637t0;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i112 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.qd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.qd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.pd pdVar = (org.telegram.messenger.pd) org.telegram.messenger.qd.f(i17).J.get(0);
                                            j3 = pdVar.f26319a;
                                            i112 = pdVar.h.K1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.qd.f(i112).h(j3));
                                return;
                            } else {
                                g2Var2.showDialog(new lt0(fragmentContextView.getContext(), new l00(fragmentContextView), i6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (g2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.f27035c));
                                TLRPC.GroupCall groupCall2 = groupCall.f27034b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                            if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                w30 w30Var = new w30(fragmentContextView.getContext(), null, bnVar, i6Var3);
                                w30Var.I0 = new y0(fragmentContextView, 6);
                                g2Var2.showDialog(w30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f22838v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22838v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            nh0 nh0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (nh0Var.P(i122)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.n6.G0().c(true);
                            fragmentContextView.f33052a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        ImageView imageView7 = new ImageView(context);
        this.G = imageView7;
        imageView7.setImageResource(2131231987);
        org.telegram.ui.ActionBar.u6.s(this.G, i13, i6Var, mode);
        this.G.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.G.setScaleType(scaleType);
        addView(this.G, c8.na.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f37307b;

            {
                this.f37307b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f37307b;
                switch (i132) {
                    case 0:
                        ah ahVar = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var2 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), i6Var2);
                            String N0 = org.telegram.messenger.gd.N0(2131744594, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.bx) {
                                t1Var.U = org.telegram.messenger.gd.N0(2131744596, null);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User j10 = ahVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToGroupText", null, 2131744595, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToUserText", null, 2131744593, org.telegram.messenger.n10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.gd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744600, null), new l00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, i6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var3 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.f11799b;
                                int i15 = c1Var.f11801e;
                                if (i15 != org.telegram.messenger.i10.f24637t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.mp.u1(i15).R1().u(c1Var.f11800c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i15).G(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                            if (g2Var2 != null && fjVar != null) {
                                if (fjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new e8(W, i6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new e8(LaunchActivity.H1, i6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j12 = ahVar2.a();
                                }
                                if (org.telegram.messenger.fj.B0(fjVar.f24073k) == j12) {
                                    fragmentContextView.f33069n.l(fjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.n5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.n5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", fjVar.e1());
                                g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.i10.f24637t0;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i112 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.qd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.qd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.pd pdVar = (org.telegram.messenger.pd) org.telegram.messenger.qd.f(i17).J.get(0);
                                            j3 = pdVar.f26319a;
                                            i112 = pdVar.h.K1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.qd.f(i112).h(j3));
                                return;
                            } else {
                                g2Var2.showDialog(new lt0(fragmentContextView.getContext(), new l00(fragmentContextView), i6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (g2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.f27035c));
                                TLRPC.GroupCall groupCall2 = groupCall.f27034b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                            if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                w30 w30Var = new w30(fragmentContextView.getContext(), null, bnVar, i6Var3);
                                w30Var.I0 = new y0(fragmentContextView, 6);
                                g2Var2.showDialog(w30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f22838v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22838v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            nh0 nh0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (nh0Var.P(i122)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.n6.G0().c(true);
                            fragmentContextView.f33052a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        bi.v2 v2Var = new bi.v2(getContext(), 16);
        this.f33081w = v2Var;
        addView(v2Var, c8.na.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f37307b;

            {
                this.f37307b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f37307b;
                switch (i132) {
                    case 0:
                        ah ahVar = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var2 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), i6Var2);
                            String N0 = org.telegram.messenger.gd.N0(2131744594, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.bx) {
                                t1Var.U = org.telegram.messenger.gd.N0(2131744596, null);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User j10 = ahVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToGroupText", null, 2131744595, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StopLiveLocationAlertToUserText", null, 2131744593, org.telegram.messenger.n10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.gd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744600, null), new l00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, i6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f33069n;
                        org.telegram.ui.ActionBar.i6 i6Var3 = fragmentContextView.f33075r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.f11799b;
                                int i15 = c1Var.f11801e;
                                if (i15 != org.telegram.messenger.i10.f24637t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.mp.u1(i15).R1().u(c1Var.f11800c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i15).G(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                            if (g2Var2 != null && fjVar != null) {
                                if (fjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new e8(W, i6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new e8(LaunchActivity.H1, i6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j12 = ahVar2.a();
                                }
                                if (org.telegram.messenger.fj.B0(fjVar.f24073k) == j12) {
                                    fragmentContextView.f33069n.l(fjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.n5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.n5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", fjVar.e1());
                                g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.i10.f24637t0;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i112 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.qd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.qd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.pd pdVar = (org.telegram.messenger.pd) org.telegram.messenger.qd.f(i17).J.get(0);
                                            j3 = pdVar.f26319a;
                                            i112 = pdVar.h.K1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.qd.f(i112).h(j3));
                                return;
                            } else {
                                g2Var2.showDialog(new lt0(fragmentContextView.getContext(), new l00(fragmentContextView), i6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (g2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.f27035c));
                                TLRPC.GroupCall groupCall2 = groupCall.f27034b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                            if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                w30 w30Var = new w30(fragmentContextView.getContext(), null, bnVar, i6Var3);
                                w30Var.I0 = new y0(fragmentContextView, 6);
                                g2Var2.showDialog(w30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f22838v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22838v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            nh0 nh0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (nh0Var.P(i122)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.n6.G0().c(true);
                            fragmentContextView.f33052a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        setLeftMargin(this.U0);
    }

    public final void c(boolean z10) {
        int i7;
        ah ahVar = this.f33069n;
        if (ahVar != null) {
            if (!this.U || ((i7 = this.V) != 1 && i7 != 3)) {
                b();
                org.telegram.ui.ActionBar.g2 g2Var = this.h;
                org.telegram.messenger.qy B = g2Var.getSendMessagesHelper().B(ahVar.a());
                View fragmentView = g2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = g2Var.getVisibleDialog();
                if ((j() || ahVar.q() || ((visibleDialog instanceof w30) && !((w30) visibleDialog).J)) && B != null) {
                    B = null;
                }
                h2.f fVar = this.f33080v0;
                if (B == null) {
                    if (this.U && ((z10 && this.V == -1) || this.V == 5)) {
                        this.U = false;
                        if (z10) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                            return;
                        }
                        AnimatorSet animatorSet = this.f33061f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f33061f = null;
                        }
                        fVar.d();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f33061f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f33061f.setDuration(220L);
                        this.f33061f.setInterpolator(kr.f36858f);
                        this.f33061f.addListener(new q00(this, 3));
                        this.f33061f.start();
                        return;
                    }
                    int i10 = this.V;
                    if (i10 == -1 || i10 == 5) {
                        this.U = false;
                        setVisibility(8);
                    }
                } else if (this.V != 5 && this.f33061f != null && !z10) {
                    this.A0 = true;
                } else {
                    r(5);
                    if (z10 && this.T == 0.0f) {
                        setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                        x00 x00Var = this.f33073q0;
                        if (x00Var != null) {
                            ((ip0) x00Var).b(true);
                            ((ip0) this.f33073q0).b(false);
                        }
                    }
                    if (!this.U) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f33061f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f33061f = null;
                            }
                            fVar.d();
                            this.f33061f = new AnimatorSet();
                            x00 x00Var2 = this.f33073q0;
                            if (x00Var2 != null) {
                                ((ip0) x00Var2).b(true);
                            }
                            this.f33061f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                            this.f33061f.setDuration(200L);
                            this.f33061f.addListener(new q00(this, 4));
                            this.f33061f.start();
                        }
                        this.U = true;
                        setVisibility(0);
                    }
                    int i11 = this.R;
                    int i12 = B.f26604l;
                    if (i11 != i12) {
                        this.R = i12;
                        this.d.b(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("ImportUploading", null, 2131749029, Integer.valueOf(i12))), false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        boolean i7;
        String G;
        String N0;
        TextView nextTextView;
        org.telegram.ui.ActionBar.g2 g2Var = this.h;
        View fragmentView = g2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = g2Var instanceof org.telegram.ui.bx;
        if (z11) {
            if (org.telegram.messenger.qd.g() != 0) {
                i7 = true;
            } else {
                i7 = false;
            }
        } else {
            i7 = org.telegram.messenger.qd.f(g2Var.getCurrentAccount()).i(this.f33069n.a());
        }
        rc rcVar = this.f33079u0;
        if (!i7) {
            this.f33078t0 = -1;
            org.telegram.messenger.g0.r(rcVar);
            if (!this.U && !z10) {
                return;
            }
            this.U = false;
            if (z10) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet = this.f33061f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f33061f = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33061f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f33061f.setDuration(200L);
            this.f33061f.addListener(new q00(this, 11));
            this.f33061f.start();
            return;
        }
        b();
        r(2);
        this.f33054b.setImageDrawable(new ap0(getContext(), 1));
        if (z10 && this.T == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        if (!this.U) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f33061f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f33061f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f33061f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                this.f33061f.setDuration(200L);
                this.f33061f.addListener(new q00(this, 0));
                this.f33061f.start();
            }
            this.U = true;
            setVisibility(0);
        }
        if (z11) {
            String N02 = org.telegram.messenger.gd.N0(2131748647, null);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 4; i10++) {
                arrayList.addAll(org.telegram.messenger.qd.f(i10).J);
            }
            if (arrayList.size() == 1) {
                org.telegram.messenger.pd pdVar = (org.telegram.messenger.pd) arrayList.get(0);
                long B0 = org.telegram.messenger.fj.B0(pdVar.h.f24073k);
                if (org.telegram.messenger.n5.E(B0)) {
                    G = org.telegram.messenger.n10.k(org.telegram.messenger.mp.u1(pdVar.h.K1).c2(Long.valueOf(B0)), true);
                    N0 = org.telegram.messenger.gd.N0(2131753962, null);
                } else {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(pdVar.h.K1).O0(Long.valueOf(-B0));
                    if (O0 != null) {
                        G = O0.title;
                    } else {
                        G = "";
                    }
                    N0 = org.telegram.messenger.gd.N0(2131753961, null);
                }
            } else {
                G = org.telegram.messenger.gd.G(arrayList.size(), "Chats", new Object[0]);
                N0 = org.telegram.messenger.gd.N0(2131753960, null);
            }
            String format = String.format(N0, N02, G);
            int indexOf = format.indexOf(N02);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            for (int i11 = 0; i11 < 2; i11++) {
                t00 t00Var = this.d;
                if (i11 == 0) {
                    nextTextView = t00Var.getTextView();
                } else {
                    nextTextView = t00Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29748t7, this.f33075r0)), indexOf, N02.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        rcVar.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i11;
        if (i7 == org.telegram.messenger.ks.G4) {
            d(false);
        } else if (i7 == org.telegram.messenger.ks.G2) {
            e(false);
        } else {
            int i12 = org.telegram.messenger.ks.I4;
            ah ahVar = this.f33069n;
            if (i7 == i12) {
                if (ahVar != null) {
                    if (ahVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i7 != org.telegram.messenger.ks.f25223h2 && i7 != org.telegram.messenger.ks.f25217g2 && i7 != org.telegram.messenger.ks.f25211f2 && i7 != org.telegram.messenger.ks.D2) {
                int i13 = org.telegram.messenger.ks.f25305v2;
                if (i7 != i13 && i7 != org.telegram.messenger.ks.f25312w2 && i7 != org.telegram.messenger.ks.F2) {
                    if (i7 == org.telegram.messenger.ks.C2) {
                        b();
                        if (this.U && this.V == 4) {
                            org.telegram.messenger.t3 groupCall = ahVar.getGroupCall();
                            if (groupCall != null && this.f33059e != null) {
                                if (groupCall.j()) {
                                    this.f33059e.b(org.telegram.messenger.gd.W(4, groupCall.f27034b.schedule_date, true), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.f27034b;
                                    int i14 = groupCall2.participants_count;
                                    if (i14 == 0) {
                                        t00 t00Var = this.f33059e;
                                        if (groupCall2.rtmp_stream) {
                                            i11 = 2131743285;
                                        } else {
                                            i11 = 2131748421;
                                        }
                                        t00Var.b(org.telegram.messenger.gd.N0(i11, null), false);
                                    } else {
                                        t00 t00Var2 = this.f33059e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        t00Var2.b(org.telegram.messenger.gd.G(i14, str, new Object[0]), false);
                                    }
                                }
                            }
                            o(true);
                            return;
                        }
                        return;
                    } else if (i7 == org.telegram.messenger.ks.f25304v1) {
                        int i15 = this.V;
                        if (i15 == 1 || i15 == 3 || i15 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i7 == org.telegram.messenger.ks.M4) {
                        q(true);
                        return;
                    } else {
                        int i16 = org.telegram.messenger.ks.Q4;
                        wc wcVar = this.f33052a;
                        if (i7 == i16) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.O0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.O0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.n6.G0().a(Math.max(this.N0, this.O0));
                                wcVar.f(Math.max(this.N0, this.O0));
                                return;
                            }
                            return;
                        } else if (i7 == org.telegram.messenger.ks.R4) {
                            b();
                            this.N0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.O0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.n6.G0().a(Math.max(this.N0, this.O0));
                                wcVar.f(Math.max(this.N0, this.O0));
                            }
                            this.f33057c0.invalidate();
                            return;
                        } else if (i7 == org.telegram.messenger.ks.f25205e2 && this.V == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.V == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i7 == i13) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.E != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.E.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                    }
                }
            } else {
                int i17 = this.V;
                if (i17 == 1 || i17 == 3 || i17 == 4) {
                    a(false);
                }
                g(false);
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        fi.c1 c1Var = fi.c1.X;
        h2.f fVar = this.f33080v0;
        int i7 = 0;
        if (c1Var != null) {
            b();
            int i10 = this.V;
            if (6 != i10 && this.f33061f != null && !z10) {
                this.f33086y0 = true;
                return;
            } else if (6 != i10 && this.U && !z10) {
                AnimatorSet animatorSet = this.f33061f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f33061f = null;
                }
                fVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f33061f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f33061f.setDuration(220L);
                this.f33061f.setInterpolator(kr.f36858f);
                this.f33061f.addListener(new q00(this, 6));
                this.f33061f.start();
                return;
            } else {
                r(6);
                if (!this.U) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f33061f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f33061f = null;
                        }
                        this.f33061f = new AnimatorSet();
                        this.f33082w0.d();
                        this.f33061f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                        this.f33061f.setDuration(220L);
                        this.f33061f.setInterpolator(kr.f36858f);
                        this.f33061f.addListener(new q00(this, 7));
                        this.f33061f.start();
                    } else {
                        setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                        n();
                    }
                    this.U = true;
                    setVisibility(0);
                } else {
                    setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                    setVisibility(0);
                }
            }
        } else {
            boolean z11 = this.U;
            if (z11 && ((z10 && this.V == -1) || this.V == 6)) {
                this.U = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f33061f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f33061f = null;
                    }
                    fVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f33061f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f33061f.setDuration(220L);
                    this.f33061f.setInterpolator(kr.f36858f);
                    this.f33061f.addListener(new q00(this, 5));
                    this.f33061f.start();
                }
            } else if (z11 && this.V == -1) {
                this.U = false;
                setVisibility(8);
            }
        }
        fi.c1 c1Var2 = fi.c1.X;
        if (c1Var2 != null && this.V == 6) {
            t00 t00Var = this.d;
            TLRPC.GroupCall groupCall = c1Var2.f11806w;
            if (groupCall != null) {
                i7 = groupCall.participants_count;
            }
            t00Var.setText(org.telegram.messenger.gd.H(',', "LiveStoryTopPanelWatching", Math.max(1, i7)));
        }
    }

    public final void f() {
        int i7;
        TLRPC.User user;
        int i10;
        String format;
        TextView nextTextView;
        ah ahVar = this.f33069n;
        if (ahVar != null && this.d != null) {
            b();
            long a10 = ahVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) org.telegram.messenger.qd.f(currentAccount).f26493c.f(a10);
            if (!this.f33077s0) {
                org.telegram.messenger.qd f10 = org.telegram.messenger.qd.f(currentAccount);
                a0.h hVar = f10.H;
                if (hVar.h(a10) < 0) {
                    hVar.k(Boolean.TRUE, a10);
                    TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                    tL_messages_getRecentLocations.peer = f10.getMessagesController().l1(a10);
                    tL_messages_getRecentLocations.limit = 100;
                    f10.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.x4(f10, a10, 1));
                }
                this.f33077s0 = true;
            }
            if (arrayList != null) {
                long e10 = org.telegram.messenger.i10.i(currentAccount).e();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                user = null;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i11);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long B1 = org.telegram.messenger.fj.B1(message.from_id);
                        if (user == null && B1 != e10) {
                            user = org.telegram.messenger.mp.u1(currentAccount).c2(Long.valueOf(B1));
                        }
                        i10++;
                    }
                }
                i7 = 0;
            } else {
                i7 = 0;
                user = null;
                i10 = 0;
            }
            if (this.f33078t0 != i10) {
                this.f33078t0 = i10;
                String N0 = org.telegram.messenger.gd.N0(2131748647, null);
                if (i10 == 0) {
                    format = N0;
                } else {
                    int i12 = i10 - 1;
                    if (org.telegram.messenger.qd.f(currentAccount).i(a10)) {
                        if (i12 != 0) {
                            if (i12 == 1 && user != null) {
                                Object[] objArr = new Object[1];
                                objArr[i7] = org.telegram.messenger.n10.k(user, true);
                                String a02 = org.telegram.messenger.gd.a0("SharingYouAndOtherName", null, 2131745172, objArr);
                                Object[] objArr2 = new Object[2];
                                objArr2[i7] = N0;
                                objArr2[1] = a02;
                                format = String.format("%1$s - %2$s", objArr2);
                            } else {
                                String N02 = org.telegram.messenger.gd.N0(2131752172, null);
                                int i13 = i7;
                                String G = org.telegram.messenger.gd.G(i12, "AndOther", new Object[i13]);
                                Object[] objArr3 = new Object[3];
                                objArr3[i13] = N0;
                                objArr3[1] = N02;
                                objArr3[2] = G;
                                format = String.format("%1$s - %2$s %3$s", objArr3);
                            }
                        } else {
                            String N03 = org.telegram.messenger.gd.N0(2131752172, null);
                            Object[] objArr4 = new Object[2];
                            objArr4[i7] = N0;
                            objArr4[1] = N03;
                            format = String.format("%1$s - %2$s", objArr4);
                        }
                    } else {
                        int i14 = i7;
                        if (i12 != 0) {
                            String k10 = org.telegram.messenger.n10.k(user, true);
                            String G2 = org.telegram.messenger.gd.G(i12, "AndOther", new Object[i14]);
                            Object[] objArr5 = new Object[3];
                            objArr5[i14] = N0;
                            objArr5[1] = k10;
                            objArr5[2] = G2;
                            format = String.format("%1$s - %2$s %3$s", objArr5);
                        } else {
                            String k11 = org.telegram.messenger.n10.k(user, true);
                            Object[] objArr6 = new Object[2];
                            objArr6[i14] = N0;
                            objArr6[1] = k11;
                            format = String.format("%1$s - %2$s", objArr6);
                        }
                    }
                }
                if (!format.equals(this.W)) {
                    this.W = format;
                    int indexOf = format.indexOf(N0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i15 = 0; i15 < 2; i15++) {
                        t00 t00Var = this.d;
                        if (i15 == 0) {
                            nextTextView = t00Var.getTextView();
                        } else {
                            nextTextView = t00Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29748t7, this.f33075r0)), indexOf, N0.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        boolean z12;
        ah ahVar;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z13 = true;
        if (this.U) {
            int i7 = this.V;
            if (i7 != 1 && i7 != 3) {
                if ((i7 == 4 || i7 == 5) && !j()) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        boolean z14 = this.U;
        h2.f fVar = this.f33080v0;
        if (fjVar != null && fjVar.e1() != 0 && !org.telegram.messenger.fj.L4(fjVar.f24073k)) {
            b();
            int i10 = this.V;
            if (i10 != 0 && this.f33061f != null && !z11) {
                this.f33087z0 = true;
                return;
            }
            r(0);
            if (z11 && this.T == 0.0f) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                x00 x00Var = this.f33073q0;
                if (x00Var != null) {
                    ((ip0) x00Var).b(true);
                    ((ip0) this.f33073q0).b(false);
                }
            }
            if (!this.U) {
                if (!z11) {
                    AnimatorSet animatorSet = this.f33061f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f33061f = null;
                    }
                    fVar.d();
                    this.f33061f = new AnimatorSet();
                    x00 x00Var2 = this.f33073q0;
                    if (x00Var2 != null) {
                        ((ip0) x00Var2).b(true);
                    }
                    this.f33061f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f33061f.setDuration(200L);
                    this.f33061f.addListener(new q00(this, 2));
                    this.f33061f.start();
                }
                this.U = true;
                setVisibility(0);
            }
            if (MediaController.B().H()) {
                this.f33056c.a(false, !z11);
                this.f33054b.setContentDescription(org.telegram.messenger.gd.N0(2131754929, null));
            } else {
                this.f33056c.a(true, !z11);
                this.f33054b.setContentDescription(org.telegram.messenger.gd.N0(2131754930, null));
            }
            if (this.S == fjVar && i10 == 0) {
                return;
            }
            this.S = fjVar;
            if (!org.telegram.messenger.fj.R4(fjVar.f24073k) && !this.S.h4()) {
                this.f33053a0 = true;
                if (this.H != null) {
                    if (fjVar.L0() >= 600.0d) {
                        this.H.setAlpha(1.0f);
                        this.H.setEnabled(true);
                        this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.O, 0);
                        q(false);
                    } else {
                        this.H.setAlpha(0.0f);
                        this.H.setEnabled(false);
                        this.d.setPadding(0, 0, this.O, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.O, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(fjVar.w1(true), " - ", fjVar.y1(true)));
                for (int i11 = 0; i11 < 2; i11++) {
                    t00 t00Var = this.d;
                    if (i11 == 0) {
                        nextTextView2 = t00Var.getTextView();
                    } else {
                        nextTextView2 = t00Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.f33053a0 = false;
                org.telegram.ui.ActionBar.q0 q0Var = this.H;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                    this.H.setEnabled(true);
                }
                this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.O, 0);
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(fjVar.w1(true), " ", fjVar.y1(true)));
                for (int i12 = 0; i12 < 2; i12++) {
                    t00 t00Var2 = this.d;
                    if (i12 == 0) {
                        nextTextView = t00Var2.getTextView();
                    } else {
                        nextTextView = t00Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29748t7, this.f33075r0)), 0, fjVar.w1(true).length(), 18);
            this.d.b(spannableStringBuilder, (!z11 && z14 && this.f33053a0) ? false : false);
            return;
        }
        this.S = null;
        if (this.f33055b0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !a20.d()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!j() && !z12 && (ahVar = this.f33069n) != null && !a20.d()) {
            org.telegram.messenger.t3 groupCall = ahVar.getGroupCall();
            if (groupCall != null && groupCall.y()) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        if (z12) {
            a(false);
        } else if (this.U) {
            org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
            if (q0Var2 != null && q0Var2.y()) {
                this.H.V(null, null);
            }
            this.U = false;
            if (z11) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f33061f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f33061f = null;
            }
            fVar.d();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f33061f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f33061f.setDuration(200L);
            x00 x00Var3 = this.f33073q0;
            if (x00Var3 != null) {
                ((ip0) x00Var3).b(true);
            }
            this.f33061f.addListener(new q00(this, 1));
            this.f33061f.start();
        } else {
            setVisibility(8);
        }
    }

    public wc getCapsuleBlobDrawable() {
        return this.f33052a;
    }

    public int getCurrentStyle() {
        return this.V;
    }

    public int getStyleHeight() {
        if (this.V == 4) {
            return 48;
        }
        return 36;
    }

    public float getTopPadding() {
        return this.T;
    }

    public final void h() {
        if (this.H != null) {
            return;
        }
        Context context = getContext();
        int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.i6 i6Var = this.f33075r0;
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), false, this.f33075r0);
        this.H = q0Var;
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.u6.s(this.H.getIconView(), i7, i6Var, PorterDuff.Mode.SRC_IN);
        }
        this.H.setAdditionalYOffset(org.telegram.messenger.g0.L(30.0f));
        this.H.setLongClickEnabled(false);
        this.H.setVisibility(8);
        this.H.setTag(null);
        this.H.setShowSubmenuByMove(false);
        this.H.setContentDescription(org.telegram.messenger.gd.N0(2131754804, null));
        this.H.setDelegate(new l00(this));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
        ou0 ou0Var = new ou0();
        this.I = ou0Var;
        q0Var2.setIcon(ou0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), i6Var);
        this.J = u0Var;
        u0Var.setRoundRadiusDp(6.0f);
        this.J.setDrawShadow(true);
        this.J.setOnValueChange(new d(this, 14));
        org.telegram.ui.ActionBar.o0 A = this.H.A(0, 2131232378, org.telegram.messenger.gd.N0(2131745025, null));
        org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
        o0VarArr[0] = A;
        o0VarArr[1] = this.H.A(1, 2131232377, org.telegram.messenger.gd.N0(2131745026, null));
        o0VarArr[2] = this.H.A(2, 2131232376, org.telegram.messenger.gd.N0(2131745027, null));
        o0VarArr[3] = this.H.A(3, 2131232375, org.telegram.messenger.gd.N0(2131745029, null));
        o0VarArr[4] = this.H.A(4, 2131232380, org.telegram.messenger.gd.N0(2131745023, null));
        o0VarArr[5] = this.H.A(5, 2131232379, org.telegram.messenger.gd.N0(2131745024, null));
        if (org.telegram.messenger.g0.f24225p >= 3.0f) {
            this.H.setPadding(0, 1, 0, 0);
        }
        this.H.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        addView(this.H, c8.na.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.H.setOnClickListener(new l8(13, this, fArr));
        this.H.setOnLongClickListener(new o00(this, 0));
        q(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i7 = this.V;
        if ((i7 == 3 || i7 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(org.telegram.messenger.pd pdVar) {
        if (pdVar != null) {
            org.telegram.ui.ActionBar.g2 g2Var = this.h;
            if (g2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) g2Var.getParentActivity();
                launchActivity.O0(pdVar.h.K1);
                org.telegram.ui.pa0 pa0Var = new org.telegram.ui.pa0(2);
                pa0Var.G0(pdVar.h);
                pa0Var.M0 = new ai.z(pdVar, org.telegram.messenger.fj.B0(pdVar.h.f24073k), 5);
                launchActivity.t0(pa0Var);
            }
        }
    }

    public final void l(float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.l(float, float, boolean):void");
    }

    public final void m() {
        xi.e eVar = this.M0;
        if (eVar != null) {
            eVar.b();
            this.M0 = null;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            org.telegram.messenger.gs[] gsVarArr = this.L0;
            org.telegram.messenger.gs gsVar = gsVarArr[i7];
            if (gsVar != null) {
                gsVar.b();
                gsVarArr[i7] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.n nVar = this.P;
        if (nVar != null && nVar.f41075g >= 1.0f) {
            this.P0 = false;
            org.telegram.messenger.g0.h3(new p00(this, 0), 150L);
            return;
        }
        this.P0 = true;
    }

    public final void o(boolean z10) {
        org.telegram.messenger.t3 t3Var;
        int i7;
        TLRPC.User user;
        int v;
        int i10;
        float f10;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f33057c0.f34245a.f33953f) != null) {
            valueAnimator.cancel();
            this.f33057c0.f34245a.f33953f = null;
        }
        c9 c9Var = this.f33057c0.f34245a;
        if (c9Var.f33953f == null) {
            int i11 = this.V;
            int i12 = this.f33071o0;
            ah ahVar = this.f33069n;
            if (i11 == 4) {
                if (ahVar != null) {
                    t3Var = ahVar.getGroupCall();
                    i12 = this.h.getCurrentAccount();
                } else {
                    t3Var = null;
                }
                i7 = i12;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                t3Var = VoIPService.getSharedInstance().groupCall;
                if (ahVar != null) {
                    user = null;
                } else {
                    user = VoIPService.getSharedInstance().getUser();
                }
                i7 = VoIPService.getSharedInstance().getAccount();
            } else {
                t3Var = null;
                i7 = i12;
                user = null;
            }
            int i13 = 0;
            if (t3Var != null) {
                ArrayList arrayList = t3Var.f27036e;
                int size = arrayList.size();
                for (int i14 = 0; i14 < 3; i14++) {
                    if (i14 < size) {
                        this.f33057c0.b(i14, i7, (TLObject) arrayList.get(i14));
                    } else {
                        this.f33057c0.b(i14, i7, null);
                    }
                }
            } else if (user != null) {
                this.f33057c0.b(0, i7, user);
                for (int i15 = 1; i15 < 3; i15++) {
                    this.f33057c0.b(i15, i7, null);
                }
            } else {
                for (int i16 = 0; i16 < 3; i16++) {
                    this.f33057c0.b(i16, i7, null);
                }
            }
            this.f33057c0.a(z10);
            if (this.V == 4 && t3Var != null) {
                if (!t3Var.f27034b.rtmp_stream) {
                    i13 = Math.min(3, t3Var.f27036e.size());
                }
                if (i13 == 0) {
                    v = 10;
                } else {
                    v = com.google.android.gms.internal.vision.e2.v(i13, 1, 24, 52);
                }
                int i17 = v + 3;
                if (z10) {
                    int i18 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (org.telegram.messenger.g0.L(i17) != i18) {
                        float translationX = (this.d.getTranslationX() + i18) - org.telegram.messenger.g0.L(f10);
                        this.d.setTranslationX(translationX);
                        this.f33059e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        kr krVar = kr.f36858f;
                        duration.setInterpolator(krVar);
                        this.f33059e.animate().translationX(0.0f).setDuration(220L).setInterpolator(krVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.f33059e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.f33059e.setTranslationX(0.0f);
                }
                t00 t00Var = this.d;
                float f11 = i17;
                int i19 = 36;
                if (t3Var.j()) {
                    i10 = 90;
                } else {
                    i10 = 36;
                }
                t00Var.setLayoutParams(c8.na.d(-1, 20.0f, 51, f11, 5.0f, i10, 0.0f));
                t00 t00Var2 = this.f33059e;
                if (t3Var.j()) {
                    i19 = 90;
                }
                t00Var2.setLayoutParams(c8.na.d(-1, 20.0f, 51, f11, 25.0f, i19, 0.0f));
                return;
            }
            return;
        }
        c9Var.f33954g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i7 = 15;
        if (this.f33072p0) {
            xi.e eVar = new xi.e(org.telegram.messenger.ks.e(), this);
            eVar.c(org.telegram.messenger.ks.G4);
            eVar.c(org.telegram.messenger.ks.I4);
            this.M0 = eVar;
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                xi.e eVar2 = new xi.e(org.telegram.messenger.ks.f(i10), this);
                eVar2.c(org.telegram.messenger.ks.f25211f2);
                eVar2.c(org.telegram.messenger.ks.f25217g2);
                eVar2.c(org.telegram.messenger.ks.f25223h2);
                eVar2.c(org.telegram.messenger.ks.f25312w2);
                eVar2.c(org.telegram.messenger.ks.C2);
                eVar2.c(org.telegram.messenger.ks.f25304v1);
                eVar2.c(org.telegram.messenger.ks.G2);
                eVar2.c(org.telegram.messenger.ks.f25205e2);
                this.L0[i10] = eVar2;
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            xi.e eVar3 = new xi.e(org.telegram.messenger.ks.e(), this);
            eVar3.c(org.telegram.messenger.ks.M4);
            eVar3.c(org.telegram.messenger.ks.f25305v2);
            eVar3.c(org.telegram.messenger.ks.D2);
            eVar3.c(org.telegram.messenger.ks.R4);
            eVar3.c(org.telegram.messenger.ks.Q4);
            eVar3.c(org.telegram.messenger.ks.F2);
            this.M0 = eVar3;
            if (fi.c1.X != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !a20.d()) {
                a(true);
            } else {
                ah ahVar = this.f33069n;
                if (ahVar != null && this.h.getSendMessagesHelper().B(ahVar.a()) != null && !j()) {
                    c(true);
                } else if (ahVar != null && ahVar.getGroupCall() != null && ahVar.getGroupCall().y() && !a20.d() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    q(false);
                }
            }
        }
        int i11 = this.V;
        if (i11 != 3 && i11 != 1) {
            if (i11 == 4 && !this.m0) {
                this.m0 = true;
                this.f33070n0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.n6.G0().f42611l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            wc wcVar = this.f33052a;
            if (!wcVar.f41592u) {
                wcVar.f41592u = true;
                wcVar.f41591t = SystemClock.elapsedRealtime();
                bg.k.d().a(60, wcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.Q != z10 && this.E != null) {
                this.Q = z10;
                nh0 nh0Var = this.F;
                if (!z10) {
                    i7 = 29;
                }
                nh0Var.P(i7);
                nh0 nh0Var2 = this.F;
                nh0Var2.N(nh0Var2.f37807f - 1, false, true);
                this.E.invalidate();
            }
        }
        if (this.U && this.T == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        this.N0 = 0.0f;
        this.O0 = 0.0f;
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10;
        int i7;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.Q;
        wc wcVar = this.f33052a;
        if (z11 != z10) {
            this.Q = z10;
            nh0 nh0Var = this.F;
            if (z10) {
                i7 = 15;
            } else {
                i7 = 29;
            }
            nh0Var.P(i7);
            nh0 nh0Var2 = this.F;
            nh0Var2.N(nh0Var2.f37807f - 1, false, true);
            this.E.invalidate();
            org.telegram.ui.ActionBar.n6.G0().c(this.U);
            wcVar.h(this.U);
        }
        if (this.Q) {
            this.O0 = 0.0f;
            org.telegram.ui.ActionBar.n6.G0().a(0.0f);
            wcVar.f(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.t0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f33061f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f33061f = null;
        }
        if (this.m0) {
            org.telegram.messenger.g0.r(this.f33070n0);
            this.m0 = false;
        }
        this.U = false;
        this.f33080v0.e();
        this.T = 0.0f;
        m();
        if (!this.f33072p0) {
            for (int i7 = 0; i7 < 4; i7++) {
                GroupCallMessagesController.getInstance(i7).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i10 = this.V;
        if (i10 == 3 || i10 == 1) {
            z00 G0 = org.telegram.ui.ActionBar.n6.G0();
            ArrayList arrayList = G0.f42611l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.f42603b;
                G0.f42603b = null;
                G0.f42604c = null;
            }
            wc wcVar = this.f33052a;
            if (wcVar.f41592u) {
                wcVar.f41592u = false;
                bg.k.d().f(wcVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.Q0 = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, org.telegram.messenger.g0.M(getStyleHeight()));
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f33081w != null) {
            int i7 = this.V;
            if ((i7 == 1 || i7 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
                this.W0++;
                if (!groupCallMessage.isOut()) {
                    this.V0.f(new w00(this.f33081w, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i7 = this.W0;
        if (i7 > 0) {
            int i10 = i7 - 1;
            this.W0 = i10;
            if (i10 == 0) {
                this.V0.f(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        p();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final void p() {
        org.telegram.messenger.t3 t3Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i7 = this.V;
            if (i7 == 1 || i7 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(org.telegram.messenger.gd.N0(2131743142, null), false);
                } else if (sharedInstance.isConference() && (t3Var = sharedInstance.groupCall) != null) {
                    if (t3Var.f27036e.size() <= 1) {
                        this.d.b(org.telegram.messenger.gd.N0(2131751811, null), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.f27036e.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.n5.s(sharedInstance.getAccount(), org.telegram.messenger.n5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.f27036e.get(i10)).peer)));
                    }
                    if (sharedInstance.groupCall.f27036e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.gd.G(sharedInstance.groupCall.f27036e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    ah ahVar = this.f33069n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.f27034b.title)) {
                            this.d.b(sharedInstance.groupCall.f27034b.title, false);
                        } else if (ahVar != null && ahVar.g() != null && ahVar.g().f28492id == sharedInstance.getChat().f28492id) {
                            TLRPC.Chat g10 = ahVar.g();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(org.telegram.messenger.gd.N0(2131743198, null), false);
                            } else if (org.telegram.messenger.v3.W(g10)) {
                                this.d.b(org.telegram.messenger.gd.N0(2131743198, null), false);
                            } else {
                                this.d.b(org.telegram.messenger.gd.N0(2131743057, null), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (ahVar != null && ahVar.j() != null && ahVar.j().f28641id == user.f28641id) {
                            this.d.setText(org.telegram.messenger.gd.N0(2131745850, null));
                        } else {
                            this.d.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                        }
                    }
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.I == null) {
            return;
        }
        float C = MediaController.B().C(this.f33053a0);
        this.I.b(z10, C);
        updateColors();
        boolean z11 = this.B0;
        int i7 = 0;
        this.B0 = false;
        while (true) {
            org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
            if (i7 < o0VarArr.length) {
                org.telegram.ui.ActionBar.i6 i6Var = this.f33075r0;
                if (!z11 && Math.abs(C - X0[i7]) < 0.05f) {
                    org.telegram.ui.ActionBar.o0 o0Var = o0VarArr[i7];
                    int i10 = org.telegram.ui.ActionBar.n6.Hi;
                    o0Var.a(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
                } else {
                    org.telegram.ui.ActionBar.o0 o0Var2 = o0VarArr[i7];
                    int i11 = org.telegram.ui.ActionBar.n6.E8;
                    o0Var2.a(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
                }
                i7++;
            } else {
                this.J.e(z10, C);
                return;
            }
        }
    }

    public final void r(int i7) {
        boolean z10;
        TextView nextTextView;
        int i10;
        int i11;
        boolean z11;
        int i12;
        TextView nextTextView2;
        int i13;
        TextView nextTextView3;
        TextView nextTextView4;
        TextView nextTextView5;
        if (this.V != i7) {
            b();
            int i14 = this.V;
            wc wcVar = this.f33052a;
            boolean z12 = true;
            if (i14 == 3 || i14 == 1) {
                z00 G0 = org.telegram.ui.ActionBar.n6.G0();
                ArrayList arrayList = G0.f42611l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    G0.d = G0.f42603b;
                    G0.f42603b = null;
                    G0.f42604c = null;
                }
                if (wcVar.f41592u) {
                    wcVar.f41592u = false;
                    bg.k.d().f(wcVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                te.j jVar = this.V0;
                if (jVar != null) {
                    jVar.f(null, true);
                }
            }
            this.V = i7;
            s00 s00Var = this.f33076s;
            if (i7 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            s00Var.setWillNotDraw(z10);
            if (i7 != 4) {
                this.f33065i0 = false;
            }
            d9 d9Var = this.f33057c0;
            if (d9Var != null) {
                d9Var.setStyle(this.V);
                this.f33057c0.setLayoutParams(c8.na.e(108, getStyleHeight(), 51));
            }
            this.f33076s.setLayoutParams(c8.na.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f10 = this.T;
            if (f10 > 0.0f && f10 != org.telegram.messenger.g0.M(getStyleHeight())) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.i6 i6Var = this.f33075r0;
            if (i7 == 6) {
                this.f33083x.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                this.f33076s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.el, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.fl, i6Var)}));
                this.f33076s.setTag(null);
                this.f33059e.setVisibility(8);
                this.N.setVisibility(8);
                this.G.setVisibility(8);
                this.f33054b.setVisibility(8);
                this.E.setVisibility(8);
                this.f33085y.setVisibility(8);
                this.f33085y.i();
                this.f33057c0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.A7));
                for (int i15 = 0; i15 < 2; i15++) {
                    t00 t00Var = this.d;
                    if (i15 == 0) {
                        nextTextView5 = t00Var.getTextView();
                    } else {
                        nextTextView5 = t00Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        org.telegram.ui.ActionBar.u6.U(nextTextView5, org.telegram.ui.ActionBar.n6.A7, i6Var);
                        nextTextView5.setTypeface(org.telegram.messenger.g0.o());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(c8.na.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i7 == 5) {
                this.f33083x.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                this.f33076s.setBackgroundColor(0);
                this.f33076s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29787v7));
                for (int i16 = 0; i16 < 2; i16++) {
                    t00 t00Var2 = this.d;
                    if (i16 == 0) {
                        nextTextView4 = t00Var2.getTextView();
                    } else {
                        nextTextView4 = t00Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        org.telegram.ui.ActionBar.u6.U(nextTextView4, org.telegram.ui.ActionBar.n6.f29768u7, i6Var);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29768u7));
                this.f33059e.setVisibility(8);
                this.N.setVisibility(8);
                this.G.setVisibility(8);
                this.f33054b.setVisibility(8);
                this.E.setVisibility(8);
                this.f33057c0.setVisibility(8);
                this.f33085y.setVisibility(0);
                this.f33085y.d();
                this.G.setContentDescription(org.telegram.messenger.gd.N0(2131754900, null));
                org.telegram.ui.ActionBar.q0 q0Var = this.H;
                if (q0Var != null) {
                    q0Var.setVisibility(8);
                    this.H.setTag(null);
                }
                this.d.setLayoutParams(c8.na.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i7 != 0 && i7 != 2) {
                if (i7 == 4) {
                    this.f33083x.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                    this.f33076s.setBackgroundColor(0);
                    this.f33076s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29787v7));
                    this.E.setVisibility(8);
                    this.f33059e.setVisibility(0);
                    for (int i17 = 0; i17 < 2; i17++) {
                        t00 t00Var3 = this.d;
                        if (i17 == 0) {
                            nextTextView3 = t00Var3.getTextView();
                        } else {
                            nextTextView3 = t00Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            org.telegram.ui.ActionBar.u6.U(nextTextView3, org.telegram.ui.ActionBar.n6.f29748t7, i6Var);
                            nextTextView3.setTypeface(org.telegram.messenger.g0.o());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29748t7));
                    this.d.setPadding(0, 0, this.O, 0);
                    this.f33085y.setVisibility(8);
                    this.f33085y.i();
                    ah ahVar = this.f33069n;
                    z12 = (ahVar == null || ahVar.getGroupCall() == null || ahVar.getGroupCall().f27034b == null || !ahVar.getGroupCall().f27034b.rtmp_stream) ? false : false;
                    d9 d9Var2 = this.f33057c0;
                    if (!z12) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    d9Var2.setVisibility(i13);
                    if (this.f33057c0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                        this.f33059e.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                    }
                    this.G.setVisibility(8);
                    this.f33054b.setVisibility(8);
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                        this.H.setTag(null);
                    }
                } else if (i7 == 1 || i7 == 3) {
                    this.f33083x.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    d9 d9Var3 = this.f33057c0;
                    if (!hasRtmpStream) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    d9Var3.setVisibility(i10);
                    if (i7 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f33057c0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.f33059e.setTranslationX(0.0f);
                    }
                    v00 v00Var = this.E;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    v00Var.setVisibility(i11);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.Q = z11;
                    nh0 nh0Var = this.F;
                    if (z11) {
                        i12 = 15;
                    } else {
                        i12 = 29;
                    }
                    nh0Var.P(i12);
                    nh0 nh0Var2 = this.F;
                    nh0Var2.N(nh0Var2.f37807f - 1, false, true);
                    this.E.invalidate();
                    this.f33076s.setBackground(null);
                    this.f33076s.setBackgroundColor(0);
                    this.f33085y.setVisibility(8);
                    this.f33085y.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.n6.G0().f42611l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!wcVar.f41592u) {
                        wcVar.f41592u = true;
                        wcVar.f41591t = SystemClock.elapsedRealtime();
                        bg.k.d().a(60, wcVar.F);
                    }
                    invalidate();
                    for (int i18 = 0; i18 < 2; i18++) {
                        t00 t00Var4 = this.d;
                        if (i18 == 0) {
                            nextTextView2 = t00Var4.getTextView();
                        } else {
                            nextTextView2 = t00Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            org.telegram.ui.ActionBar.u6.U(nextTextView2, org.telegram.ui.ActionBar.n6.A7, i6Var);
                            nextTextView2.setTypeface(org.telegram.messenger.g0.o());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.A7));
                    this.G.setVisibility(8);
                    this.f33054b.setVisibility(8);
                    this.f33059e.setVisibility(8);
                    this.N.setVisibility(8);
                    this.d.setLayoutParams(c8.na.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(org.telegram.messenger.g0.L(88.0f), 0, org.telegram.messenger.g0.L(88.0f) + this.O, 0);
                    org.telegram.ui.ActionBar.q0 q0Var3 = this.H;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                        this.H.setTag(null);
                    }
                }
            } else {
                this.f33083x.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                this.f33076s.setBackgroundColor(0);
                this.f33076s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29787v7));
                this.f33059e.setVisibility(8);
                this.N.setVisibility(8);
                this.G.setVisibility(0);
                this.f33054b.setVisibility(0);
                this.E.setVisibility(8);
                this.f33085y.setVisibility(8);
                this.f33085y.i();
                this.f33057c0.setVisibility(8);
                for (int i19 = 0; i19 < 2; i19++) {
                    t00 t00Var5 = this.d;
                    if (i19 == 0) {
                        nextTextView = t00Var5.getTextView();
                    } else {
                        nextTextView = t00Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        org.telegram.ui.ActionBar.u6.U(nextTextView, org.telegram.ui.ActionBar.n6.f29768u7, i6Var);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29768u7));
                if (i7 == 6) {
                    this.f33054b.setLayoutParams(c8.na.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.na.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.G.setVisibility(8);
                } else if (i7 == 0) {
                    this.f33054b.setLayoutParams(c8.na.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.na.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.q0 q0Var4 = this.H;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(0);
                        this.H.setTag(1);
                    }
                    this.G.setContentDescription(org.telegram.messenger.gd.N0(2131754900, null));
                } else {
                    this.f33054b.setLayoutParams(c8.na.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.na.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.G.setContentDescription(org.telegram.messenger.gd.N0(2131754754, null));
                }
            }
        }
    }

    public void setDelegate(x00 x00Var) {
        this.f33073q0 = x00Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.S0 = z10;
    }

    public void setLeftMargin(float f10) {
        if (this.f33076s == null) {
            this.U0 = f10;
            return;
        }
        ImageView imageView = this.f33054b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        qh0 qh0Var = this.f33085y;
        if (qh0Var != null) {
            qh0Var.setTranslationX(f10);
        }
        t00 t00Var = this.d;
        if (t00Var != null) {
            t00Var.setTranslationX(f10);
        }
        t00 t00Var2 = this.f33059e;
        if (t00Var2 != null) {
            t00Var2.setTranslationX(f10);
        }
        d9 d9Var = this.f33057c0;
        if (d9Var != null) {
            d9Var.setTranslationX(f10);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.D0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.f33055b0 = z10;
    }

    public void setTopPadding(float f10) {
        this.T = f10;
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        setTopPadding(this.T);
        if (i7 == 8) {
            this.Q0 = false;
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        TextView nextTextView;
        k41[] k41VarArr;
        TextView nextTextView2;
        wc wcVar = this.f33052a;
        int i10 = wcVar.A;
        if (i10 >= 0) {
            wcVar.E = 1.0f;
            wcVar.a(wc.e(i10));
        }
        if (!i(MediaController.B().C(this.f33053a0), 1.0f)) {
            i7 = org.telegram.ui.ActionBar.n6.Hi;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29825x7;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f33075r0;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        ou0 ou0Var = this.I;
        if (ou0Var != null) {
            ou0Var.f38267a.u(w02);
            Paint paint = ou0Var.f38268b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.H;
        if (q0Var != null) {
            Drawable background = q0Var.getBackground();
            if (background != null && background == this.F0) {
                if (w02 != this.K0) {
                    this.K0 = w02;
                    org.telegram.ui.ActionBar.n6.H1(background, w02 & 436207615, true);
                }
            } else {
                org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(436207615 & w02, 1, org.telegram.messenger.g0.L(14.0f));
                this.F0 = h02;
                q0Var2.setBackground(h02);
                this.K0 = w02;
            }
        }
        if (this.f33054b != null) {
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29806w7, i6Var);
            if (this.G0 == null || w03 != this.I0) {
                ImageView imageView = this.f33054b;
                this.I0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.G != null) {
            int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29825x7, i6Var);
            if (this.H0 == null || w04 != this.J0) {
                ImageView imageView2 = this.G;
                this.J0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.H0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.f33059e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                t00 t00Var = this.f33059e;
                if (i11 == 0) {
                    nextTextView2 = t00Var.getTextView();
                } else {
                    nextTextView2 = t00Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29825x7, i6Var));
                }
            }
        }
        t00 t00Var2 = this.d;
        if (t00Var2 != null) {
            Object tag = t00Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    t00 t00Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = t00Var3.getTextView();
                    } else {
                        nextTextView = t00Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.n6.w0(intValue, i6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (k41VarArr = (k41[]) ((Spanned) text).getSpans(0, text.length(), k41.class)) != null) {
                            for (k41 k41Var : k41VarArr) {
                                k41Var.f36645b = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29748t7, i6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.g2 g2Var, View view, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f33052a = new wc();
        this.K = new org.telegram.ui.ActionBar.o0[6];
        this.R = -1;
        this.V = -1;
        this.f33055b0 = true;
        this.f33067k0 = new m6(false, true, true);
        this.f33070n0 = new r00(this);
        this.f33071o0 = org.telegram.messenger.i10.f24637t0;
        this.f33078t0 = -1;
        this.f33079u0 = new rc(this, 8);
        this.f33080v0 = new h2.f((int[]) null);
        this.f33082w0 = new h2.f(new int[]{org.telegram.messenger.ks.D});
        this.L0 = new org.telegram.messenger.gs[4];
        this.R0 = new Paint(1);
        this.T0 = 0;
        this.V0 = new te.j(new l00(this), kr.h, 450L);
        this.W0 = 0;
        this.f33075r0 = i6Var;
        this.h = g2Var;
        if (g2Var instanceof ah) {
            this.f33069n = (ah) g2Var;
        }
        this.f33074r = view;
        this.U = true;
        this.f33072p0 = z10;
        if (view == null) {
            ((ViewGroup) g2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
