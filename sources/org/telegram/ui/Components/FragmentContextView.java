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
public class FragmentContextView extends FrameLayout implements org.telegram.messenger.ls, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.a6 {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public fi.m3 B0;
    public ViewGroup C0;
    public k00 D;
    public long D0;
    public zg0 E;
    public org.telegram.ui.Cells.y E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public org.telegram.ui.ActionBar.r0 G;
    public PorterDuffColorFilter G0;
    public du0 H;
    public int H0;
    public org.telegram.ui.ActionBar.v0 I;
    public int I0;
    public final org.telegram.ui.ActionBar.p0[] J;
    public int J0;
    public FrameLayout K;
    public final org.telegram.messenger.ms[] K0;
    public ImageView L;
    public ab.b0 L0;
    public org.telegram.ui.ActionBar.m2 M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.voip.n O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public org.telegram.messenger.ij R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final te.j U0;
    public String V;
    public int V0;
    public boolean W;
    public final sc f31372a;
    public boolean f31373a0;
    public ImageView f31374b;
    public z8 f31375b0;
    public he0 f31376c;
    public Paint f31377c0;
    public i00 d;
    public LinearGradient f31378d0;
    public i00 f31379e;
    public Matrix f31380e0;
    public AnimatorSet f31381f;
    public int f31382f0;
    public TextPaint f31383g0;
    public final org.telegram.ui.ActionBar.f2 h;
    public boolean f31384h0;
    public boolean f31385i0;
    public final i6 f31386j0;
    public ic f31387k0;
    public boolean f31388l0;
    public final g00 m0;
    public final kg f31389n;
    public final int f31390n0;
    public final boolean f31391o0;
    public m00 f31392p0;
    public final org.telegram.ui.ActionBar.f6 f31393q0;
    public final View f31394r;
    public boolean f31395r0;
    public h00 f31396s;
    public int f31397s0;
    public final dt f31398t0;
    public final h2.f f31399u0;
    public final h2.f f31400v0;
    public di.a4 f31401w;
    public boolean f31402w0;
    public View f31403x;
    public boolean f31404x0;
    public ch0 f31405y;
    public boolean f31406y0;
    public boolean f31407z0;

    public FragmentContextView(Context context, org.telegram.ui.ww wwVar, boolean z9) {
        this(context, wwVar, null, z9, null);
    }

    private int getTitleTextColor() {
        int i7 = this.U;
        org.telegram.ui.ActionBar.f6 f6Var = this.f31393q0;
        if (i7 == 4) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28145t7, f6Var);
        }
        if (i7 != 1 && i7 != 3) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28165u7, f6Var);
        }
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A7, f6Var);
    }

    public static boolean i(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.05f) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
        if (ijVar != null && org.telegram.messenger.ij.S4(ijVar.f23237k)) {
            return true;
        }
        return false;
    }

    public final void a(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.a(boolean):void");
    }

    public final void b() {
        if (this.f31396s != null) {
            return;
        }
        Context context = getContext();
        h00 h00Var = new h00(this, context);
        this.f31396s = h00Var;
        this.f31387k0 = new ic(h00Var);
        int i7 = org.telegram.messenger.g0.f22537q.x;
        i6 i6Var = this.f31386j0;
        i6Var.M = i7;
        i6Var.A = 0.4f;
        i6Var.setCallback(h00Var);
        i6Var.u(-1);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        addView(this.f31396s, c8.ha.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f31403x = view;
        this.f31396s.addView(view, c8.ha.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f31374b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f31374b;
        int i10 = org.telegram.ui.ActionBar.k6.f28203w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f6 f6Var = this.f31393q0;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, f6Var, mode);
        ImageView imageView3 = this.f31374b;
        he0 he0Var = new he0(16);
        this.f31376c = he0Var;
        imageView3.setImageDrawable(he0Var);
        this.f31374b.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, f6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        addView(this.f31374b, c8.ha.e(36, 36, 51));
        this.f31374b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f31969b;

            {
                this.f31969b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i11;
                long j3;
                TL_stories.StoryItem u10;
                int i12;
                int i13 = r2;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.f31969b;
                switch (i13) {
                    case 0:
                        kg kgVar = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744836, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.hd.M0(2131744838, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744837, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744835, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744842, null), new a00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, f6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        kg kgVar2 = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.U;
                        if (i14 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.f9023b;
                                int i15 = g1Var.f9025e;
                                if (i15 != org.telegram.messenger.p10.f24459s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i15).P1().u(g1Var.f9024c, j11)) != null) {
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
                            org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kgVar2 != null) {
                                    j12 = kgVar2.a();
                                }
                                if (org.telegram.messenger.ij.B0(ijVar.f23237k) == j12) {
                                    fragmentContextView.f31389n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ijVar.f1());
                                f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.p10.f24459s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i11 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.sd.f(i17).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i17).I.get(0);
                                            j3 = rdVar.f25265a;
                                            i11 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i11 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i11).h(j3));
                                return;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new a00(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.f25202c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25201b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z9 = true;
                                }
                                org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                            if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                l30Var.H0 = new p0(fragmentContextView, 7);
                                f2Var2.showDialog(l30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f21292u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21292u0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            zg0 zg0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i12 = 15;
                            } else {
                                i12 = 29;
                            }
                            if (zg0Var.P(i12)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31372a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
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
        this.f31405y = imageView4;
        imageView4.setScaleType(scaleType);
        this.f31405y.setAutoRepeat(true);
        this.f31405y.f(2131624064, 30, 30, null);
        org.telegram.ui.ActionBar.r6.C(this.f31405y, org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(i10, f6Var)), org.telegram.ui.ActionBar.r6.N(i10), f6Var);
        addView(this.f31405y, c8.ha.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        i00 i00Var = new i00(this, context, context, 0);
        this.d = i00Var;
        addView(i00Var, c8.ha.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        i00 i00Var2 = new i00(this, context, context, 1);
        this.f31379e = i00Var2;
        addView(i00Var2, c8.ha.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.O = nVar;
        nVar.f39319g = 1.0f;
        nVar.f39321j = false;
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(2, context, this);
        this.M = m2Var;
        m2Var.setText(org.telegram.messenger.hd.M0(2131743443, null));
        org.telegram.ui.ActionBar.r6.V(this.M, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        org.telegram.ui.ActionBar.m2 m2Var2 = this.M;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
        int i12 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i12, f6Var);
        org.telegram.ui.ActionBar.r6.R(m2Var2, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.r6.N(i11), org.telegram.ui.ActionBar.r6.N(i12), f6Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(org.telegram.messenger.g0.o());
        this.M.setGravity(17);
        this.M.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(this.M, c8.ha.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f31969b;

            {
                this.f31969b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i13 = r2;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.f31969b;
                switch (i13) {
                    case 0:
                        kg kgVar = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744836, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.hd.M0(2131744838, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744837, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744835, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744842, null), new a00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, f6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        kg kgVar2 = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.U;
                        if (i14 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.f9023b;
                                int i15 = g1Var.f9025e;
                                if (i15 != org.telegram.messenger.p10.f24459s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i15).P1().u(g1Var.f9024c, j11)) != null) {
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
                            org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kgVar2 != null) {
                                    j12 = kgVar2.a();
                                }
                                if (org.telegram.messenger.ij.B0(ijVar.f23237k) == j12) {
                                    fragmentContextView.f31389n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ijVar.f1());
                                f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.p10.f24459s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i112 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.sd.f(i17).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i17).I.get(0);
                                            j3 = rdVar.f25265a;
                                            i112 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i112).h(j3));
                                return;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new a00(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.f25202c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25201b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z9 = true;
                                }
                                org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                            if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                l30Var.H0 = new p0(fragmentContextView, 7);
                                f2Var2.showDialog(l30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f21292u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21292u0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            zg0 zg0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (zg0Var.P(i122)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31372a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        if (this.O0) {
            n();
        }
        this.K = new FrameLayout(context);
        ImageView imageView5 = new ImageView(context);
        this.L = imageView5;
        imageView5.setImageResource(2131232256);
        ImageView imageView6 = this.L;
        int i13 = org.telegram.ui.ActionBar.k6.f28222x7;
        org.telegram.ui.ActionBar.r6.t(imageView6, i13, f6Var, mode);
        this.K.addView(this.L, c8.ha.e(20, 20, 17));
        this.K.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, f6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.K.setContentDescription(org.telegram.messenger.hd.M0(2131743850, null));
        this.K.setOnClickListener(new bi.l1(12));
        this.K.setVisibility(8);
        addView(this.K, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f31391o0) {
            h();
        }
        z8 z8Var = new z8(context, false);
        this.f31375b0 = z8Var;
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(21.0f));
        this.f31375b0.setDelegate(new e00(this, 1));
        this.f31375b0.setVisibility(8);
        addView(this.f31375b0, c8.ha.e(108, 36, 51));
        this.E = new zg0(2131624332, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), true, null);
        k00 k00Var = new k00(this, context);
        this.D = k00Var;
        org.telegram.ui.ActionBar.r6.t(k00Var, org.telegram.ui.ActionBar.k6.A7, f6Var, PorterDuff.Mode.SRC_IN);
        this.D.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, f6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.D.setAnimation(this.E);
        this.D.setScaleType(scaleType);
        this.D.setVisibility(8);
        addView(this.D, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.D.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f31969b;

            {
                this.f31969b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.f31969b;
                switch (i132) {
                    case 0:
                        kg kgVar = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744836, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.hd.M0(2131744838, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744837, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744835, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744842, null), new a00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, f6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        kg kgVar2 = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.U;
                        if (i14 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.f9023b;
                                int i15 = g1Var.f9025e;
                                if (i15 != org.telegram.messenger.p10.f24459s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i15).P1().u(g1Var.f9024c, j11)) != null) {
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
                            org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kgVar2 != null) {
                                    j12 = kgVar2.a();
                                }
                                if (org.telegram.messenger.ij.B0(ijVar.f23237k) == j12) {
                                    fragmentContextView.f31389n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ijVar.f1());
                                f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.p10.f24459s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i112 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.sd.f(i17).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i17).I.get(0);
                                            j3 = rdVar.f25265a;
                                            i112 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i112).h(j3));
                                return;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new a00(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.f25202c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25201b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z9 = true;
                                }
                                org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                            if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                l30Var.H0 = new p0(fragmentContextView, 7);
                                f2Var2.showDialog(l30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f21292u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21292u0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            zg0 zg0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (zg0Var.P(i122)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31372a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
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
        this.F = imageView7;
        imageView7.setImageResource(2131231983);
        org.telegram.ui.ActionBar.r6.t(this.F, i13, f6Var, mode);
        this.F.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, f6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f31969b;

            {
                this.f31969b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.f31969b;
                switch (i132) {
                    case 0:
                        kg kgVar = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744836, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.hd.M0(2131744838, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744837, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744835, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744842, null), new a00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, f6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        kg kgVar2 = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.U;
                        if (i14 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.f9023b;
                                int i15 = g1Var.f9025e;
                                if (i15 != org.telegram.messenger.p10.f24459s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i15).P1().u(g1Var.f9024c, j11)) != null) {
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
                            org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kgVar2 != null) {
                                    j12 = kgVar2.a();
                                }
                                if (org.telegram.messenger.ij.B0(ijVar.f23237k) == j12) {
                                    fragmentContextView.f31389n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ijVar.f1());
                                f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.p10.f24459s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i112 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.sd.f(i17).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i17).I.get(0);
                                            j3 = rdVar.f25265a;
                                            i112 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i112).h(j3));
                                return;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new a00(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.f25202c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25201b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z9 = true;
                                }
                                org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                            if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                l30Var.H0 = new p0(fragmentContextView, 7);
                                f2Var2.showDialog(l30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f21292u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21292u0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            zg0 zg0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (zg0Var.P(i122)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31372a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        di.a4 a4Var = new di.a4(getContext(), 14);
        this.f31401w = a4Var;
        addView(a4Var, c8.ha.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f31969b;

            {
                this.f31969b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.f31969b;
                switch (i132) {
                    case 0:
                        kg kgVar = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744836, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.hd.M0(2131744838, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744837, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744835, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744842, null), new a00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, f6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        kg kgVar2 = fragmentContextView.f31389n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f31393q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.U;
                        if (i14 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.f9023b;
                                int i15 = g1Var.f9025e;
                                if (i15 != org.telegram.messenger.p10.f24459s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i15).P1().u(g1Var.f9024c, j11)) != null) {
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
                            org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kgVar2 != null) {
                                    j12 = kgVar2.a();
                                }
                                if (org.telegram.messenger.ij.B0(ijVar.f23237k) == j12) {
                                    fragmentContextView.f31389n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ijVar.f1());
                                f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.p10.f24459s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i112 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.sd.f(i17).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i17).I.get(0);
                                            j3 = rdVar.f25265a;
                                            i112 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i112).h(j3));
                                return;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new a00(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.f25202c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25201b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z9 = true;
                                }
                                org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                            if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                l30Var.H0 = new p0(fragmentContextView, 7);
                                f2Var2.showDialog(l30Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().f21292u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21292u0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            zg0 zg0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (zg0Var.P(i122)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31372a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        setLeftMargin(this.T0);
    }

    public final void c(boolean z9) {
        int i7;
        kg kgVar = this.f31389n;
        if (kgVar != null) {
            if (!this.T || ((i7 = this.U) != 1 && i7 != 3)) {
                b();
                org.telegram.ui.ActionBar.f2 f2Var = this.h;
                org.telegram.messenger.xy B = f2Var.getSendMessagesHelper().B(kgVar.a());
                View fragmentView = f2Var.getFragmentView();
                if (!z9 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z9 = true;
                }
                Dialog visibleDialog = f2Var.getVisibleDialog();
                if ((j() || kgVar.q() || ((visibleDialog instanceof l30) && !((l30) visibleDialog).I)) && B != null) {
                    B = null;
                }
                h2.f fVar = this.f31399u0;
                if (B == null) {
                    if (this.T && ((z9 && this.U == -1) || this.U == 5)) {
                        this.T = false;
                        if (z9) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                            return;
                        }
                        AnimatorSet animatorSet = this.f31381f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f31381f = null;
                        }
                        fVar.d();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f31381f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f31381f.setDuration(220L);
                        this.f31381f.setInterpolator(xq.f40329f);
                        this.f31381f.addListener(new f00(this, 3));
                        this.f31381f.start();
                        return;
                    }
                    int i10 = this.U;
                    if (i10 == -1 || i10 == 5) {
                        this.T = false;
                        setVisibility(8);
                    }
                } else if (this.U != 5 && this.f31381f != null && !z9) {
                    this.f31407z0 = true;
                } else {
                    r(5);
                    if (z9 && this.S == 0.0f) {
                        setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                        m00 m00Var = this.f31392p0;
                        if (m00Var != null) {
                            ((uo0) m00Var).b(true);
                            ((uo0) this.f31392p0).b(false);
                        }
                    }
                    if (!this.T) {
                        if (!z9) {
                            AnimatorSet animatorSet3 = this.f31381f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f31381f = null;
                            }
                            fVar.d();
                            this.f31381f = new AnimatorSet();
                            m00 m00Var2 = this.f31392p0;
                            if (m00Var2 != null) {
                                ((uo0) m00Var2).b(true);
                            }
                            this.f31381f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                            this.f31381f.setDuration(200L);
                            this.f31381f.addListener(new f00(this, 4));
                            this.f31381f.start();
                        }
                        this.T = true;
                        setVisibility(0);
                    }
                    int i11 = this.Q;
                    int i12 = B.f26538l;
                    if (i11 != i12) {
                        this.Q = i12;
                        this.d.b(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ImportUploading", null, 2131749221, Integer.valueOf(i12))), false);
                    }
                }
            }
        }
    }

    public final void d(boolean z9) {
        boolean i7;
        String G;
        String M0;
        TextView nextTextView;
        org.telegram.ui.ActionBar.f2 f2Var = this.h;
        View fragmentView = f2Var.getFragmentView();
        if (!z9 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z9 = true;
        }
        boolean z10 = f2Var instanceof org.telegram.ui.ww;
        if (z10) {
            if (org.telegram.messenger.sd.g() != 0) {
                i7 = true;
            } else {
                i7 = false;
            }
        } else {
            i7 = org.telegram.messenger.sd.f(f2Var.getCurrentAccount()).i(this.f31389n.a());
        }
        dt dtVar = this.f31398t0;
        if (!i7) {
            this.f31397s0 = -1;
            org.telegram.messenger.g0.r(dtVar);
            if (this.T) {
                this.T = false;
                if (z9) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f31381f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f31381f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31381f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f31381f.setDuration(200L);
                this.f31381f.addListener(new f00(this, 11));
                this.f31381f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f31374b.setImageDrawable(new no0(getContext(), 1));
        if (z9 && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        if (!this.T) {
            if (!z9) {
                AnimatorSet animatorSet3 = this.f31381f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f31381f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f31381f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                this.f31381f.setDuration(200L);
                this.f31381f.addListener(new f00(this, 0));
                this.f31381f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (z10) {
            String M02 = org.telegram.messenger.hd.M0(2131748839, null);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 4; i10++) {
                arrayList.addAll(org.telegram.messenger.sd.f(i10).I);
            }
            if (arrayList.size() == 1) {
                org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) arrayList.get(0);
                long B0 = org.telegram.messenger.ij.B0(rdVar.h.f23237k);
                if (org.telegram.messenger.m5.E(B0)) {
                    G = org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(rdVar.h.I1).a2(Long.valueOf(B0)), true);
                    M0 = org.telegram.messenger.hd.M0(2131753965, null);
                } else {
                    TLRPC.Chat M03 = org.telegram.messenger.qp.s1(rdVar.h.I1).M0(Long.valueOf(-B0));
                    if (M03 != null) {
                        G = M03.title;
                    } else {
                        G = "";
                    }
                    M0 = org.telegram.messenger.hd.M0(2131753964, null);
                }
            } else {
                G = org.telegram.messenger.hd.G(arrayList.size(), "Chats", new Object[0]);
                M0 = org.telegram.messenger.hd.M0(2131753963, null);
            }
            String format = String.format(M0, M02, G);
            int indexOf = format.indexOf(M02);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            for (int i11 = 0; i11 < 2; i11++) {
                i00 i00Var = this.d;
                if (i11 == 0) {
                    nextTextView = i00Var.getTextView();
                } else {
                    nextTextView = i00Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new t31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28145t7, this.f31393q0)), indexOf, M02.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        dtVar.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i11;
        if (i7 == org.telegram.messenger.qs.D4) {
            d(false);
        } else if (i7 == org.telegram.messenger.qs.G2) {
            e(false);
        } else {
            int i12 = org.telegram.messenger.qs.F4;
            kg kgVar = this.f31389n;
            if (i7 == i12) {
                if (kgVar != null) {
                    if (kgVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i7 != org.telegram.messenger.qs.f24993h2 && i7 != org.telegram.messenger.qs.f24987g2 && i7 != org.telegram.messenger.qs.f24981f2 && i7 != org.telegram.messenger.qs.D2) {
                int i13 = org.telegram.messenger.qs.f25075v2;
                if (i7 != i13 && i7 != org.telegram.messenger.qs.f25082w2 && i7 != org.telegram.messenger.qs.F2) {
                    if (i7 == org.telegram.messenger.qs.C2) {
                        b();
                        if (this.T && this.U == 4) {
                            org.telegram.messenger.r3 groupCall = kgVar.getGroupCall();
                            if (groupCall != null && this.f31379e != null) {
                                if (groupCall.j()) {
                                    this.f31379e.b(org.telegram.messenger.hd.W(4, groupCall.f25201b.schedule_date, true), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.f25201b;
                                    int i14 = groupCall2.participants_count;
                                    if (i14 == 0) {
                                        i00 i00Var = this.f31379e;
                                        if (groupCall2.rtmp_stream) {
                                            i11 = 2131743536;
                                        } else {
                                            i11 = 2131748613;
                                        }
                                        i00Var.b(org.telegram.messenger.hd.M0(i11, null), false);
                                    } else {
                                        i00 i00Var2 = this.f31379e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        i00Var2.b(org.telegram.messenger.hd.G(i14, str, new Object[0]), false);
                                    }
                                }
                            }
                            o(true);
                            return;
                        }
                        return;
                    } else if (i7 == org.telegram.messenger.qs.f25074v1) {
                        int i15 = this.U;
                        if (i15 == 1 || i15 == 3 || i15 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i7 == org.telegram.messenger.qs.J4) {
                        q(true);
                        return;
                    } else {
                        int i16 = org.telegram.messenger.qs.N4;
                        sc scVar = this.f31372a;
                        if (i7 == i16) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.k6.G0().a(Math.max(this.M0, this.N0));
                                scVar.f(Math.max(this.M0, this.N0));
                                return;
                            }
                            return;
                        } else if (i7 == org.telegram.messenger.qs.O4) {
                            b();
                            this.M0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.k6.G0().a(Math.max(this.M0, this.N0));
                                scVar.f(Math.max(this.M0, this.N0));
                            }
                            this.f31375b0.invalidate();
                            return;
                        } else if (i7 == org.telegram.messenger.qs.f24975e2 && this.U == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.U == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i7 == i13) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.D != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.D.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                    }
                }
            } else {
                int i17 = this.U;
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

    public final void e(boolean z9) {
        View fragmentView = this.h.getFragmentView();
        if (!z9 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z9 = true;
        }
        di.g1 g1Var = di.g1.W;
        h2.f fVar = this.f31399u0;
        int i7 = 0;
        if (g1Var != null) {
            b();
            int i10 = this.U;
            if (6 != i10 && this.f31381f != null && !z9) {
                this.f31404x0 = true;
                return;
            } else if (6 != i10 && this.T && !z9) {
                AnimatorSet animatorSet = this.f31381f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f31381f = null;
                }
                fVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31381f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f31381f.setDuration(220L);
                this.f31381f.setInterpolator(xq.f40329f);
                this.f31381f.addListener(new f00(this, 6));
                this.f31381f.start();
                return;
            } else {
                r(6);
                if (!this.T) {
                    if (!z9) {
                        AnimatorSet animatorSet3 = this.f31381f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f31381f = null;
                        }
                        this.f31381f = new AnimatorSet();
                        this.f31400v0.d();
                        this.f31381f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                        this.f31381f.setDuration(220L);
                        this.f31381f.setInterpolator(xq.f40329f);
                        this.f31381f.addListener(new f00(this, 7));
                        this.f31381f.start();
                    } else {
                        setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                        n();
                    }
                    this.T = true;
                    setVisibility(0);
                } else {
                    setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                    setVisibility(0);
                }
            }
        } else {
            boolean z10 = this.T;
            if (z10 && ((z9 && this.U == -1) || this.U == 6)) {
                this.T = false;
                if (z9) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f31381f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f31381f = null;
                    }
                    fVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f31381f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f31381f.setDuration(220L);
                    this.f31381f.setInterpolator(xq.f40329f);
                    this.f31381f.addListener(new f00(this, 5));
                    this.f31381f.start();
                }
            } else if (z10 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        di.g1 g1Var2 = di.g1.W;
        if (g1Var2 != null && this.U == 6) {
            i00 i00Var = this.d;
            TLRPC.GroupCall groupCall = g1Var2.f9030w;
            if (groupCall != null) {
                i7 = groupCall.participants_count;
            }
            i00Var.setText(org.telegram.messenger.hd.H(',', "LiveStoryTopPanelWatching", Math.max(1, i7)));
        }
    }

    public final void f() {
        int i7;
        TLRPC.User user;
        int i10;
        String format;
        TextView nextTextView;
        kg kgVar = this.f31389n;
        if (kgVar != null && this.d != null) {
            b();
            long a10 = kgVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) org.telegram.messenger.sd.f(currentAccount).f25443c.f(a10);
            if (!this.f31395r0) {
                org.telegram.messenger.sd f10 = org.telegram.messenger.sd.f(currentAccount);
                a0.h hVar = f10.G;
                if (hVar.h(a10) < 0) {
                    hVar.k(Boolean.TRUE, a10);
                    TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                    tL_messages_getRecentLocations.peer = f10.getMessagesController().j1(a10);
                    tL_messages_getRecentLocations.limit = 100;
                    f10.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.p4(f10, a10, 1));
                }
                this.f31395r0 = true;
            }
            if (arrayList != null) {
                long e10 = org.telegram.messenger.p10.i(currentAccount).e();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                user = null;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i11);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long C1 = org.telegram.messenger.ij.C1(message.from_id);
                        if (user == null && C1 != e10) {
                            user = org.telegram.messenger.qp.s1(currentAccount).a2(Long.valueOf(C1));
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
            if (this.f31397s0 != i10) {
                this.f31397s0 = i10;
                String M0 = org.telegram.messenger.hd.M0(2131748839, null);
                if (i10 == 0) {
                    format = M0;
                } else {
                    int i12 = i10 - 1;
                    if (org.telegram.messenger.sd.f(currentAccount).i(a10)) {
                        if (i12 != 0) {
                            if (i12 == 1 && user != null) {
                                Object[] objArr = new Object[1];
                                objArr[i7] = org.telegram.messenger.t10.j(user, true);
                                String a02 = org.telegram.messenger.hd.a0("SharingYouAndOtherName", null, 2131745369, objArr);
                                Object[] objArr2 = new Object[2];
                                objArr2[i7] = M0;
                                objArr2[1] = a02;
                                format = String.format("%1$s - %2$s", objArr2);
                            } else {
                                String M02 = org.telegram.messenger.hd.M0(2131752184, null);
                                int i13 = i7;
                                String G = org.telegram.messenger.hd.G(i12, "AndOther", new Object[i13]);
                                Object[] objArr3 = new Object[3];
                                objArr3[i13] = M0;
                                objArr3[1] = M02;
                                objArr3[2] = G;
                                format = String.format("%1$s - %2$s %3$s", objArr3);
                            }
                        } else {
                            String M03 = org.telegram.messenger.hd.M0(2131752184, null);
                            Object[] objArr4 = new Object[2];
                            objArr4[i7] = M0;
                            objArr4[1] = M03;
                            format = String.format("%1$s - %2$s", objArr4);
                        }
                    } else {
                        int i14 = i7;
                        if (i12 != 0) {
                            String j3 = org.telegram.messenger.t10.j(user, true);
                            String G2 = org.telegram.messenger.hd.G(i12, "AndOther", new Object[i14]);
                            Object[] objArr5 = new Object[3];
                            objArr5[i14] = M0;
                            objArr5[1] = j3;
                            objArr5[2] = G2;
                            format = String.format("%1$s - %2$s %3$s", objArr5);
                        } else {
                            String j10 = org.telegram.messenger.t10.j(user, true);
                            Object[] objArr6 = new Object[2];
                            objArr6[i14] = M0;
                            objArr6[1] = j10;
                            format = String.format("%1$s - %2$s", objArr6);
                        }
                    }
                }
                if (!format.equals(this.V)) {
                    this.V = format;
                    int indexOf = format.indexOf(M0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i15 = 0; i15 < 2; i15++) {
                        i00 i00Var = this.d;
                        if (i15 == 0) {
                            nextTextView = i00Var.getTextView();
                        } else {
                            nextTextView = i00Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new t31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28145t7, this.f31393q0)), indexOf, M0.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z9) {
        boolean z10;
        boolean z11;
        kg kgVar;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z12 = true;
        if (this.T) {
            int i7 = this.U;
            if (i7 != 1 && i7 != 3) {
                if ((i7 == 4 || i7 == 5) && !j()) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
        View fragmentView = this.h.getFragmentView();
        if (!z9 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        } else {
            z10 = z9;
        }
        boolean z13 = this.T;
        h2.f fVar = this.f31399u0;
        if (ijVar != null && ijVar.f1() != 0 && !org.telegram.messenger.ij.M4(ijVar.f23237k)) {
            b();
            int i10 = this.U;
            if (i10 != 0 && this.f31381f != null && !z10) {
                this.f31406y0 = true;
                return;
            }
            r(0);
            if (z10 && this.S == 0.0f) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                m00 m00Var = this.f31392p0;
                if (m00Var != null) {
                    ((uo0) m00Var).b(true);
                    ((uo0) this.f31392p0).b(false);
                }
            }
            if (!this.T) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f31381f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f31381f = null;
                    }
                    fVar.d();
                    this.f31381f = new AnimatorSet();
                    m00 m00Var2 = this.f31392p0;
                    if (m00Var2 != null) {
                        ((uo0) m00Var2).b(true);
                    }
                    this.f31381f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f31381f.setDuration(200L);
                    this.f31381f.addListener(new f00(this, 2));
                    this.f31381f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            if (MediaController.B().H()) {
                this.f31376c.a(false, !z10);
                this.f31374b.setContentDescription(org.telegram.messenger.hd.M0(2131754929, null));
            } else {
                this.f31376c.a(true, !z10);
                this.f31374b.setContentDescription(org.telegram.messenger.hd.M0(2131754930, null));
            }
            if (this.R == ijVar && i10 == 0) {
                return;
            }
            this.R = ijVar;
            if (!org.telegram.messenger.ij.S4(ijVar.f23237k) && !this.R.i4()) {
                this.W = true;
                if (this.G != null) {
                    if (ijVar.L0() >= 600.0d) {
                        this.G.setAlpha(1.0f);
                        this.G.setEnabled(true);
                        this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.N, 0);
                        q(false);
                    } else {
                        this.G.setAlpha(0.0f);
                        this.G.setEnabled(false);
                        this.d.setPadding(0, 0, this.N, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.N, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.D(ijVar.x1(true), " - ", ijVar.z1(true)));
                for (int i11 = 0; i11 < 2; i11++) {
                    i00 i00Var = this.d;
                    if (i11 == 0) {
                        nextTextView2 = i00Var.getTextView();
                    } else {
                        nextTextView2 = i00Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.W = false;
                org.telegram.ui.ActionBar.r0 r0Var = this.G;
                if (r0Var != null) {
                    r0Var.setAlpha(1.0f);
                    this.G.setEnabled(true);
                }
                this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.N, 0);
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.D(ijVar.x1(true), " ", ijVar.z1(true)));
                for (int i12 = 0; i12 < 2; i12++) {
                    i00 i00Var2 = this.d;
                    if (i12 == 0) {
                        nextTextView = i00Var2.getTextView();
                    } else {
                        nextTextView = i00Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new t31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28145t7, this.f31393q0)), 0, ijVar.x1(true).length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.W) ? false : false);
            return;
        }
        this.R = null;
        if (this.f31373a0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !p10.d()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (kgVar = this.f31389n) != null && !p10.d()) {
            org.telegram.messenger.r3 groupCall = kgVar.getGroupCall();
            if (groupCall != null && groupCall.y()) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            a(false);
        } else if (this.T) {
            org.telegram.ui.ActionBar.r0 r0Var2 = this.G;
            if (r0Var2 != null && r0Var2.x()) {
                this.G.U(null, null);
            }
            this.T = false;
            if (z10) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f31381f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f31381f = null;
            }
            fVar.d();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f31381f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f31381f.setDuration(200L);
            m00 m00Var3 = this.f31392p0;
            if (m00Var3 != null) {
                ((uo0) m00Var3).b(true);
            }
            this.f31381f.addListener(new f00(this, 1));
            this.f31381f.start();
        } else {
            setVisibility(8);
        }
    }

    public sc getCapsuleBlobDrawable() {
        return this.f31372a;
    }

    public int getCurrentStyle() {
        return this.U;
    }

    public int getStyleHeight() {
        if (this.U == 4) {
            return 48;
        }
        return 36;
    }

    public float getTopPadding() {
        return this.S;
    }

    public final void h() {
        if (this.G != null) {
            return;
        }
        Context context = getContext();
        int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f31393q0;
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), false, this.f31393q0);
        this.G = r0Var;
        if (r0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(this.G.getIconView(), i7, f6Var, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(org.telegram.messenger.g0.L(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(org.telegram.messenger.hd.M0(2131754805, null));
        this.G.setDelegate(new a00(this));
        org.telegram.ui.ActionBar.r0 r0Var2 = this.G;
        du0 du0Var = new du0();
        this.H = du0Var;
        r0Var2.setIcon(du0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), f6Var);
        this.I = v0Var;
        v0Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.p0 z9 = this.G.z(0, 2131232373, org.telegram.messenger.hd.M0(2131745267, null));
        org.telegram.ui.ActionBar.p0[] p0VarArr = this.J;
        p0VarArr[0] = z9;
        p0VarArr[1] = this.G.z(1, 2131232372, org.telegram.messenger.hd.M0(2131745268, null));
        p0VarArr[2] = this.G.z(2, 2131232371, org.telegram.messenger.hd.M0(2131745269, null));
        p0VarArr[3] = this.G.z(3, 2131232370, org.telegram.messenger.hd.M0(2131745271, null));
        p0VarArr[4] = this.G.z(4, 2131232375, org.telegram.messenger.hd.M0(2131745265, null));
        p0VarArr[5] = this.G.z(5, 2131232374, org.telegram.messenger.hd.M0(2131745266, null));
        if (org.telegram.messenger.g0.f22536p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        addView(this.G, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new lk(11, this, fArr));
        this.G.setOnLongClickListener(new d00(this, 0));
        q(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i7 = this.U;
        if ((i7 == 3 || i7 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(org.telegram.messenger.rd rdVar) {
        if (rdVar != null) {
            org.telegram.ui.ActionBar.f2 f2Var = this.h;
            if (f2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) f2Var.getParentActivity();
                launchActivity.O0(rdVar.h.I1);
                org.telegram.ui.pa0 pa0Var = new org.telegram.ui.pa0(2);
                pa0Var.G0(rdVar.h);
                pa0Var.G0 = new di.c1(rdVar, org.telegram.messenger.ij.B0(rdVar.h.f23237k), 4);
                launchActivity.t0(pa0Var);
            }
        }
    }

    public final void l(float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.l(float, float, boolean):void");
    }

    public final void m() {
        ab.b0 b0Var = this.L0;
        if (b0Var != null) {
            b0Var.b();
            this.L0 = null;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            org.telegram.messenger.ms[] msVarArr = this.K0;
            org.telegram.messenger.ms msVar = msVarArr[i7];
            if (msVar != null) {
                msVar.b();
                msVarArr[i7] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.n nVar = this.O;
        if (nVar != null && nVar.f39319g >= 1.0f) {
            this.O0 = false;
            org.telegram.messenger.g0.i3(new e00(this, 0), 150L);
            return;
        }
        this.O0 = true;
    }

    public final void o(boolean z9) {
        org.telegram.messenger.r3 r3Var;
        int i7;
        TLRPC.User user;
        int e10;
        int i10;
        float f10;
        ValueAnimator valueAnimator;
        b();
        if (!z9 && (valueAnimator = this.f31375b0.f40886a.f40568f) != null) {
            valueAnimator.cancel();
            this.f31375b0.f40886a.f40568f = null;
        }
        y8 y8Var = this.f31375b0.f40886a;
        if (y8Var.f40568f == null) {
            int i11 = this.U;
            int i12 = this.f31390n0;
            kg kgVar = this.f31389n;
            if (i11 == 4) {
                if (kgVar != null) {
                    r3Var = kgVar.getGroupCall();
                    i12 = this.h.getCurrentAccount();
                } else {
                    r3Var = null;
                }
                i7 = i12;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                r3Var = VoIPService.getSharedInstance().groupCall;
                if (kgVar != null) {
                    user = null;
                } else {
                    user = VoIPService.getSharedInstance().getUser();
                }
                i7 = VoIPService.getSharedInstance().getAccount();
            } else {
                r3Var = null;
                i7 = i12;
                user = null;
            }
            int i13 = 0;
            if (r3Var != null) {
                ArrayList arrayList = r3Var.f25203e;
                int size = arrayList.size();
                for (int i14 = 0; i14 < 3; i14++) {
                    if (i14 < size) {
                        this.f31375b0.b(i14, i7, (TLObject) arrayList.get(i14));
                    } else {
                        this.f31375b0.b(i14, i7, null);
                    }
                }
            } else if (user != null) {
                this.f31375b0.b(0, i7, user);
                for (int i15 = 1; i15 < 3; i15++) {
                    this.f31375b0.b(i15, i7, null);
                }
            } else {
                for (int i16 = 0; i16 < 3; i16++) {
                    this.f31375b0.b(i16, i7, null);
                }
            }
            this.f31375b0.a(z9);
            if (this.U == 4 && r3Var != null) {
                if (!r3Var.f25201b.rtmp_stream) {
                    i13 = Math.min(3, r3Var.f25203e.size());
                }
                if (i13 == 0) {
                    e10 = 10;
                } else {
                    e10 = com.google.android.recaptcha.internal.a.e(i13, 1, 24, 52);
                }
                int i17 = e10 + 3;
                if (z9) {
                    int i18 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (org.telegram.messenger.g0.L(i17) != i18) {
                        float translationX = (this.d.getTranslationX() + i18) - org.telegram.messenger.g0.L(f10);
                        this.d.setTranslationX(translationX);
                        this.f31379e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        xq xqVar = xq.f40329f;
                        duration.setInterpolator(xqVar);
                        this.f31379e.animate().translationX(0.0f).setDuration(220L).setInterpolator(xqVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.f31379e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.f31379e.setTranslationX(0.0f);
                }
                i00 i00Var = this.d;
                float f11 = i17;
                int i19 = 36;
                if (r3Var.j()) {
                    i10 = 90;
                } else {
                    i10 = 36;
                }
                i00Var.setLayoutParams(c8.ha.d(-1, 20.0f, 51, f11, 5.0f, i10, 0.0f));
                i00 i00Var2 = this.f31379e;
                if (r3Var.j()) {
                    i19 = 90;
                }
                i00Var2.setLayoutParams(c8.ha.d(-1, 20.0f, 51, f11, 25.0f, i19, 0.0f));
                return;
            }
            return;
        }
        y8Var.f40569g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z9;
        super.onAttachedToWindow();
        m();
        int i7 = 15;
        if (this.f31391o0) {
            ab.b0 b0Var = new ab.b0(org.telegram.messenger.qs.e(), this);
            b0Var.c(org.telegram.messenger.qs.D4);
            b0Var.c(org.telegram.messenger.qs.F4);
            this.L0 = b0Var;
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                ab.b0 b0Var2 = new ab.b0(org.telegram.messenger.qs.f(i10), this);
                b0Var2.c(org.telegram.messenger.qs.f24981f2);
                b0Var2.c(org.telegram.messenger.qs.f24987g2);
                b0Var2.c(org.telegram.messenger.qs.f24993h2);
                b0Var2.c(org.telegram.messenger.qs.f25082w2);
                b0Var2.c(org.telegram.messenger.qs.C2);
                b0Var2.c(org.telegram.messenger.qs.f25074v1);
                b0Var2.c(org.telegram.messenger.qs.G2);
                b0Var2.c(org.telegram.messenger.qs.f24975e2);
                this.K0[i10] = b0Var2;
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            ab.b0 b0Var3 = new ab.b0(org.telegram.messenger.qs.e(), this);
            b0Var3.c(org.telegram.messenger.qs.J4);
            b0Var3.c(org.telegram.messenger.qs.f25075v2);
            b0Var3.c(org.telegram.messenger.qs.D2);
            b0Var3.c(org.telegram.messenger.qs.O4);
            b0Var3.c(org.telegram.messenger.qs.N4);
            b0Var3.c(org.telegram.messenger.qs.F2);
            this.L0 = b0Var3;
            if (di.g1.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !p10.d()) {
                a(true);
            } else {
                kg kgVar = this.f31389n;
                if (kgVar != null && this.h.getSendMessagesHelper().B(kgVar.a()) != null && !j()) {
                    c(true);
                } else if (kgVar != null && kgVar.getGroupCall() != null && kgVar.getGroupCall().y() && !p10.d() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    q(false);
                }
            }
        }
        int i11 = this.U;
        if (i11 != 3 && i11 != 1) {
            if (i11 == 4 && !this.f31388l0) {
                this.f31388l0 = true;
                this.m0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.k6.G0().f36448l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            sc scVar = this.f31372a;
            if (!scVar.f37974u) {
                scVar.f37974u = true;
                scVar.f37973t = SystemClock.elapsedRealtime();
                bg.k.d().a(60, scVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.P != z9 && this.D != null) {
                this.P = z9;
                zg0 zg0Var = this.E;
                if (!z9) {
                    i7 = 29;
                }
                zg0Var.P(i7);
                zg0 zg0Var2 = this.E;
                zg0Var2.N(zg0Var2.f40958f - 1, false, true);
                this.D.invalidate();
            }
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z9;
        int i7;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = this.P;
        sc scVar = this.f31372a;
        if (z10 != z9) {
            this.P = z9;
            zg0 zg0Var = this.E;
            if (z9) {
                i7 = 15;
            } else {
                i7 = 29;
            }
            zg0Var.P(i7);
            zg0 zg0Var2 = this.E;
            zg0Var2.N(zg0Var2.f40958f - 1, false, true);
            this.D.invalidate();
            org.telegram.ui.ActionBar.k6.G0().c(this.T);
            scVar.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            org.telegram.ui.ActionBar.k6.G0().a(0.0f);
            scVar.f(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z9) {
        org.telegram.messenger.voip.s0.c(this, z9);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f31381f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31381f = null;
        }
        if (this.f31388l0) {
            org.telegram.messenger.g0.r(this.m0);
            this.f31388l0 = false;
        }
        this.T = false;
        this.f31399u0.e();
        this.S = 0.0f;
        m();
        if (!this.f31391o0) {
            for (int i7 = 0; i7 < 4; i7++) {
                GroupCallMessagesController.getInstance(i7).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i10 = this.U;
        if (i10 == 3 || i10 == 1) {
            o00 G0 = org.telegram.ui.ActionBar.k6.G0();
            ArrayList arrayList = G0.f36448l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.f36440b;
                G0.f36440b = null;
                G0.f36441c = null;
            }
            sc scVar = this.f31372a;
            if (scVar.f37974u) {
                scVar.f37974u = false;
                bg.k.d().f(scVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, org.telegram.messenger.g0.M(getStyleHeight()));
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f31401w != null) {
            int i7 = this.U;
            if ((i7 == 1 || i7 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
                this.V0++;
                if (!groupCallMessage.isOut()) {
                    this.U0.f(new l00(this.f31401w, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i7 = this.V0;
        if (i7 > 0) {
            int i10 = i7 - 1;
            this.V0 = i10;
            if (i10 == 0) {
                this.U0.f(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        p();
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public final void p() {
        org.telegram.messenger.r3 r3Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i7 = this.U;
            if (i7 == 1 || i7 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(org.telegram.messenger.hd.M0(2131743393, null), false);
                } else if (sharedInstance.isConference() && (r3Var = sharedInstance.groupCall) != null) {
                    if (r3Var.f25203e.size() <= 1) {
                        this.d.b(org.telegram.messenger.hd.M0(2131751823, null), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.f25203e.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.m5.s(sharedInstance.getAccount(), org.telegram.messenger.m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.f25203e.get(i10)).peer)));
                    }
                    if (sharedInstance.groupCall.f25203e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.hd.G(sharedInstance.groupCall.f25203e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    kg kgVar = this.f31389n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.f25201b.title)) {
                            this.d.b(sharedInstance.groupCall.f25201b.title, false);
                        } else if (kgVar != null && kgVar.g() != null && kgVar.g().f26952id == sharedInstance.getChat().f26952id) {
                            TLRPC.Chat g10 = kgVar.g();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(org.telegram.messenger.hd.M0(2131743449, null), false);
                            } else if (org.telegram.messenger.t3.W(g10)) {
                                this.d.b(org.telegram.messenger.hd.M0(2131743449, null), false);
                            } else {
                                this.d.b(org.telegram.messenger.hd.M0(2131743308, null), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (kgVar != null && kgVar.j() != null && kgVar.j().f27101id == user.f27101id) {
                            this.d.setText(org.telegram.messenger.hd.M0(2131746047, null));
                        } else {
                            this.d.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                        }
                    }
                }
            }
        }
    }

    public final void q(boolean z9) {
        if (this.H == null) {
            return;
        }
        float C = MediaController.B().C(this.W);
        this.H.b(z9, C);
        updateColors();
        boolean z10 = this.A0;
        int i7 = 0;
        this.A0 = false;
        while (true) {
            org.telegram.ui.ActionBar.p0[] p0VarArr = this.J;
            if (i7 < p0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f31393q0;
                if (!z10 && Math.abs(C - W0[i7]) < 0.05f) {
                    org.telegram.ui.ActionBar.p0 p0Var = p0VarArr[i7];
                    int i10 = org.telegram.ui.ActionBar.k6.Ei;
                    p0Var.a(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
                } else {
                    org.telegram.ui.ActionBar.p0 p0Var2 = p0VarArr[i7];
                    int i11 = org.telegram.ui.ActionBar.k6.E8;
                    p0Var2.a(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
                }
                i7++;
            } else {
                this.I.e(z9, C);
                return;
            }
        }
    }

    public final void r(int i7) {
        boolean z9;
        TextView nextTextView;
        int i10;
        int i11;
        boolean z10;
        int i12;
        TextView nextTextView2;
        int i13;
        TextView nextTextView3;
        TextView nextTextView4;
        TextView nextTextView5;
        if (this.U != i7) {
            b();
            int i14 = this.U;
            sc scVar = this.f31372a;
            boolean z11 = true;
            if (i14 == 3 || i14 == 1) {
                o00 G0 = org.telegram.ui.ActionBar.k6.G0();
                ArrayList arrayList = G0.f36448l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    G0.d = G0.f36440b;
                    G0.f36440b = null;
                    G0.f36441c = null;
                }
                if (scVar.f37974u) {
                    scVar.f37974u = false;
                    bg.k.d().f(scVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                te.j jVar = this.U0;
                if (jVar != null) {
                    jVar.f(null, true);
                }
            }
            this.U = i7;
            h00 h00Var = this.f31396s;
            if (i7 != 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            h00Var.setWillNotDraw(z9);
            if (i7 != 4) {
                this.f31384h0 = false;
            }
            z8 z8Var = this.f31375b0;
            if (z8Var != null) {
                z8Var.setStyle(this.U);
                this.f31375b0.setLayoutParams(c8.ha.e(108, getStyleHeight(), 51));
            }
            this.f31396s.setLayoutParams(c8.ha.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f10 = this.S;
            if (f10 > 0.0f && f10 != org.telegram.messenger.g0.M(getStyleHeight())) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f31393q0;
            if (i7 == 6) {
                this.f31403x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                this.f31396s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bl, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.cl, f6Var)}));
                this.f31396s.setTag(null);
                this.f31379e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f31374b.setVisibility(8);
                this.D.setVisibility(8);
                this.f31405y.setVisibility(8);
                this.f31405y.i();
                this.f31375b0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
                for (int i15 = 0; i15 < 2; i15++) {
                    i00 i00Var = this.d;
                    if (i15 == 0) {
                        nextTextView5 = i00Var.getTextView();
                    } else {
                        nextTextView5 = i00Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        org.telegram.ui.ActionBar.r6.V(nextTextView5, org.telegram.ui.ActionBar.k6.A7, f6Var);
                        nextTextView5.setTypeface(org.telegram.messenger.g0.o());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(c8.ha.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i7 == 5) {
                this.f31403x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                this.f31396s.setBackgroundColor(0);
                this.f31396s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28184v7));
                for (int i16 = 0; i16 < 2; i16++) {
                    i00 i00Var2 = this.d;
                    if (i16 == 0) {
                        nextTextView4 = i00Var2.getTextView();
                    } else {
                        nextTextView4 = i00Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        org.telegram.ui.ActionBar.r6.V(nextTextView4, org.telegram.ui.ActionBar.k6.f28165u7, f6Var);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28165u7));
                this.f31379e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f31374b.setVisibility(8);
                this.D.setVisibility(8);
                this.f31375b0.setVisibility(8);
                this.f31405y.setVisibility(0);
                this.f31405y.d();
                this.F.setContentDescription(org.telegram.messenger.hd.M0(2131754900, null));
                org.telegram.ui.ActionBar.r0 r0Var = this.G;
                if (r0Var != null) {
                    r0Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(c8.ha.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i7 != 0 && i7 != 2) {
                if (i7 == 4) {
                    this.f31403x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    this.f31396s.setBackgroundColor(0);
                    this.f31396s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28184v7));
                    this.D.setVisibility(8);
                    this.f31379e.setVisibility(0);
                    for (int i17 = 0; i17 < 2; i17++) {
                        i00 i00Var3 = this.d;
                        if (i17 == 0) {
                            nextTextView3 = i00Var3.getTextView();
                        } else {
                            nextTextView3 = i00Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            org.telegram.ui.ActionBar.r6.V(nextTextView3, org.telegram.ui.ActionBar.k6.f28145t7, f6Var);
                            nextTextView3.setTypeface(org.telegram.messenger.g0.o());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28145t7));
                    this.d.setPadding(0, 0, this.N, 0);
                    this.f31405y.setVisibility(8);
                    this.f31405y.i();
                    kg kgVar = this.f31389n;
                    z11 = (kgVar == null || kgVar.getGroupCall() == null || kgVar.getGroupCall().f25201b == null || !kgVar.getGroupCall().f25201b.rtmp_stream) ? false : false;
                    z8 z8Var2 = this.f31375b0;
                    if (!z11) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    z8Var2.setVisibility(i13);
                    if (this.f31375b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                        this.f31379e.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                    }
                    this.F.setVisibility(8);
                    this.f31374b.setVisibility(8);
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.G;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                        this.G.setTag(null);
                    }
                } else if (i7 == 1 || i7 == 3) {
                    this.f31403x.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    z8 z8Var3 = this.f31375b0;
                    if (!hasRtmpStream) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    z8Var3.setVisibility(i10);
                    if (i7 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f31375b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.f31379e.setTranslationX(0.0f);
                    }
                    k00 k00Var = this.D;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    k00Var.setVisibility(i11);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.P = z10;
                    zg0 zg0Var = this.E;
                    if (z10) {
                        i12 = 15;
                    } else {
                        i12 = 29;
                    }
                    zg0Var.P(i12);
                    zg0 zg0Var2 = this.E;
                    zg0Var2.N(zg0Var2.f40958f - 1, false, true);
                    this.D.invalidate();
                    this.f31396s.setBackground(null);
                    this.f31396s.setBackgroundColor(0);
                    this.f31405y.setVisibility(8);
                    this.f31405y.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.k6.G0().f36448l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!scVar.f37974u) {
                        scVar.f37974u = true;
                        scVar.f37973t = SystemClock.elapsedRealtime();
                        bg.k.d().a(60, scVar.F);
                    }
                    invalidate();
                    for (int i18 = 0; i18 < 2; i18++) {
                        i00 i00Var4 = this.d;
                        if (i18 == 0) {
                            nextTextView2 = i00Var4.getTextView();
                        } else {
                            nextTextView2 = i00Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            org.telegram.ui.ActionBar.r6.V(nextTextView2, org.telegram.ui.ActionBar.k6.A7, f6Var);
                            nextTextView2.setTypeface(org.telegram.messenger.g0.o());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
                    this.F.setVisibility(8);
                    this.f31374b.setVisibility(8);
                    this.f31379e.setVisibility(8);
                    this.M.setVisibility(8);
                    this.d.setLayoutParams(c8.ha.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(org.telegram.messenger.g0.L(88.0f), 0, org.telegram.messenger.g0.L(88.0f) + this.N, 0);
                    org.telegram.ui.ActionBar.r0 r0Var3 = this.G;
                    if (r0Var3 != null) {
                        r0Var3.setVisibility(8);
                        this.G.setTag(null);
                    }
                }
            } else {
                this.f31403x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                this.f31396s.setBackgroundColor(0);
                this.f31396s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28184v7));
                this.f31379e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(0);
                this.f31374b.setVisibility(0);
                this.D.setVisibility(8);
                this.f31405y.setVisibility(8);
                this.f31405y.i();
                this.f31375b0.setVisibility(8);
                for (int i19 = 0; i19 < 2; i19++) {
                    i00 i00Var5 = this.d;
                    if (i19 == 0) {
                        nextTextView = i00Var5.getTextView();
                    } else {
                        nextTextView = i00Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        org.telegram.ui.ActionBar.r6.V(nextTextView, org.telegram.ui.ActionBar.k6.f28165u7, f6Var);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28165u7));
                if (i7 == 6) {
                    this.f31374b.setLayoutParams(c8.ha.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.ha.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setVisibility(8);
                } else if (i7 == 0) {
                    this.f31374b.setLayoutParams(c8.ha.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.ha.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.r0 r0Var4 = this.G;
                    if (r0Var4 != null) {
                        r0Var4.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(org.telegram.messenger.hd.M0(2131754900, null));
                } else {
                    this.f31374b.setLayoutParams(c8.ha.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.ha.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setContentDescription(org.telegram.messenger.hd.M0(2131754755, null));
                }
            }
        }
    }

    public void setDelegate(m00 m00Var) {
        this.f31392p0 = m00Var;
    }

    public void setDrawOverlay(boolean z9) {
        this.R0 = z9;
    }

    public void setLeftMargin(float f10) {
        if (this.f31396s == null) {
            this.T0 = f10;
            return;
        }
        ImageView imageView = this.f31374b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        ch0 ch0Var = this.f31405y;
        if (ch0Var != null) {
            ch0Var.setTranslationX(f10);
        }
        i00 i00Var = this.d;
        if (i00Var != null) {
            i00Var.setTranslationX(f10);
        }
        i00 i00Var2 = this.f31379e;
        if (i00Var2 != null) {
            i00Var2.setTranslationX(f10);
        }
        z8 z8Var = this.f31375b0;
        if (z8Var != null) {
            z8Var.setTranslationX(f10);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z9) {
        this.f31373a0 = z9;
    }

    public void setTopPadding(float f10) {
        this.S = f10;
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        setTopPadding(this.S);
        if (i7 == 8) {
            this.P0 = false;
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        TextView nextTextView;
        t31[] t31VarArr;
        TextView nextTextView2;
        sc scVar = this.f31372a;
        int i10 = scVar.A;
        if (i10 >= 0) {
            scVar.E = 1.0f;
            scVar.a(sc.e(i10));
        }
        if (!i(MediaController.B().C(this.W), 1.0f)) {
            i7 = org.telegram.ui.ActionBar.k6.Ei;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f28222x7;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f31393q0;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        du0 du0Var = this.H;
        if (du0Var != null) {
            du0Var.f33045a.u(w02);
            Paint paint = du0Var.f33046b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.G;
        if (r0Var != null) {
            Drawable background = r0Var.getBackground();
            if (background != null && background == this.E0) {
                if (w02 != this.J0) {
                    this.J0 = w02;
                    org.telegram.ui.ActionBar.k6.H1(background, w02 & 436207615, true);
                }
            } else {
                org.telegram.ui.ActionBar.r0 r0Var2 = this.G;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(436207615 & w02, 1, org.telegram.messenger.g0.L(14.0f));
                this.E0 = h02;
                r0Var2.setBackground(h02);
                this.J0 = w02;
            }
        }
        if (this.f31374b != null) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28203w7, f6Var);
            if (this.F0 == null || w03 != this.H0) {
                ImageView imageView = this.f31374b;
                this.H0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28222x7, f6Var);
            if (this.G0 == null || w04 != this.I0) {
                ImageView imageView2 = this.F;
                this.I0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.f31379e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                i00 i00Var = this.f31379e;
                if (i11 == 0) {
                    nextTextView2 = i00Var.getTextView();
                } else {
                    nextTextView2 = i00Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28222x7, f6Var));
                }
            }
        }
        i00 i00Var2 = this.d;
        if (i00Var2 != null) {
            Object tag = i00Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    i00 i00Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = i00Var3.getTextView();
                    } else {
                        nextTextView = i00Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.k6.w0(intValue, f6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (t31VarArr = (t31[]) ((Spanned) text).getSpans(0, text.length(), t31.class)) != null) {
                            for (t31 t31Var : t31VarArr) {
                                t31Var.f38211b = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28145t7, f6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.f2 f2Var, View view, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f31372a = new sc();
        this.J = new org.telegram.ui.ActionBar.p0[6];
        this.Q = -1;
        this.U = -1;
        this.f31373a0 = true;
        this.f31386j0 = new i6(false, true, true);
        this.m0 = new g00(this);
        this.f31390n0 = org.telegram.messenger.p10.f24459s0;
        this.f31397s0 = -1;
        this.f31398t0 = new dt(this, 4);
        this.f31399u0 = new h2.f((int[]) null);
        this.f31400v0 = new h2.f(new int[]{org.telegram.messenger.qs.D});
        this.K0 = new org.telegram.messenger.ms[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new te.j(new a00(this), xq.h, 450L);
        this.V0 = 0;
        this.f31393q0 = f6Var;
        this.h = f2Var;
        if (f2Var instanceof kg) {
            this.f31389n = (kg) f2Var;
        }
        this.f31394r = view;
        this.T = true;
        this.f31391o0 = z9;
        if (view == null) {
            ((ViewGroup) f2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
