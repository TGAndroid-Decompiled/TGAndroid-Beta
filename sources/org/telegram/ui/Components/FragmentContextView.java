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
public class FragmentContextView extends FrameLayout implements org.telegram.messenger.cs, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.z5 {
    public static final float[] X0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public boolean B0;
    public gi.l3 C0;
    public ViewGroup D0;
    public g00 E;
    public long E0;
    public ch0 F;
    public org.telegram.ui.Cells.y F0;
    public ImageView G;
    public PorterDuffColorFilter G0;
    public org.telegram.ui.ActionBar.q0 H;
    public PorterDuffColorFilter H0;
    public cu0 I;
    public int I0;
    public org.telegram.ui.ActionBar.u0 J;
    public int J0;
    public final org.telegram.ui.ActionBar.o0[] K;
    public int K0;
    public FrameLayout L;
    public final org.telegram.messenger.ds[] L0;
    public ImageView M;
    public za.p M0;
    public org.telegram.ui.ActionBar.k2 N;
    public float N0;
    public int O;
    public float O0;
    public org.telegram.ui.Components.voip.g P;
    public boolean P0;
    public boolean Q;
    public boolean Q0;
    public int R;
    public final Paint R0;
    public org.telegram.messenger.zi S;
    public boolean S0;
    public float T;
    public int T0;
    public boolean U;
    public float U0;
    public int V;
    public final qe.j V0;
    public String W;
    public int W0;
    public final qc f31448a;
    public boolean f31449a0;
    public ImageView f31450b;
    public boolean f31451b0;
    public je0 f31452c;
    public x8 f31453c0;
    public e00 d;
    public Paint f31454d0;
    public e00 f31455e;
    public LinearGradient f31456e0;
    public AnimatorSet f31457f;
    public Matrix f31458f0;
    public int f31459g0;
    public final org.telegram.ui.ActionBar.d2 h;
    public TextPaint f31460h0;
    public boolean f31461i0;
    public boolean f31462j0;
    public final g6 f31463k0;
    public gc f31464l0;
    public boolean m0;
    public final ig f31465n;
    public final c00 f31466n0;
    public final int f31467o0;
    public final boolean f31468p0;
    public i00 f31469q0;
    public final View f31470r;
    public final org.telegram.ui.ActionBar.e6 f31471r0;
    public d00 f31472s;
    public boolean f31473s0;
    public int f31474t0;
    public final lt f31475u0;
    public final g2.g f31476v0;
    public ai.d2 f31477w;
    public final g2.g f31478w0;
    public View f31479x;
    public boolean f31480x0;
    public fh0 f31481y;
    public boolean f31482y0;
    public boolean f31483z0;

    public FragmentContextView(Context context, org.telegram.ui.uw uwVar, boolean z10) {
        this(context, uwVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i3 = this.V;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31471r0;
        if (i3 == 4) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28178t7, e6Var);
        }
        if (i3 != 1 && i3 != 3) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28197u7, e6Var);
        }
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A7, e6Var);
    }

    public static boolean i(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.05f) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null && org.telegram.messenger.zi.S4(ziVar.f26868k)) {
            return true;
        }
        return false;
    }

    public final void a(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.a(boolean):void");
    }

    public final void b() {
        if (this.f31472s != null) {
            return;
        }
        Context context = getContext();
        d00 d00Var = new d00(this, context);
        this.f31472s = d00Var;
        this.f31464l0 = new gc(d00Var);
        int i3 = org.telegram.messenger.g0.f22608q.x;
        g6 g6Var = this.f31463k0;
        g6Var.M = i3;
        g6Var.A = 0.4f;
        g6Var.setCallback(d00Var);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        addView(this.f31472s, b8.mf.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f31479x = view;
        this.f31472s.addView(view, b8.mf.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f31450b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f31450b;
        int i10 = org.telegram.ui.ActionBar.k6.f28235w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31471r0;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, e6Var, mode);
        ImageView imageView3 = this.f31450b;
        je0 je0Var = new je0(16);
        this.f31452c = je0Var;
        imageView3.setImageDrawable(je0Var);
        this.f31450b.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        addView(this.f31450b, b8.mf.e(36, 36, 51));
        this.f31450b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f40552b;

            {
                this.f40552b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i11;
                long j10;
                TL_stories.StoryItem u10;
                int i12;
                int i13 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f40552b;
                switch (i13) {
                    case 0:
                        ig igVar = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            if (d2Var instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ig igVar2 = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.f10297b;
                                int i15 = g1Var.f10299e;
                                if (i15 != org.telegram.messenger.h10.f22829t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i15).P1().u(g1Var.f10298c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i15).O(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                            if (d2Var2 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (igVar2 != null) {
                                    j13 = igVar2.a();
                                }
                                if (org.telegram.messenger.zi.B0(ziVar.f26868k) == j13) {
                                    fragmentContextView.f31465n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ziVar.f1());
                                d2Var2.presentFragment(new org.telegram.ui.wm(bundle), d2Var2 instanceof org.telegram.ui.wm);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.h10.f22829t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i11 = d2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.ld.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i17).J.get(0);
                                            j10 = kdVar.f23810a;
                                            i11 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i11 = i16;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i11).h(j10));
                                return;
                            } else {
                                d2Var2.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (d2Var2.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = d2Var2.getMessagesController().M0(Long.valueOf(groupCall.f25050c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25049b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var2.getParentActivity(), d2Var2, d2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                            if (d2Var2.getSendMessagesHelper().B(wmVar.a()) != null) {
                                h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                h30Var.I0 = new p0(fragmentContextView, 7);
                                d2Var2.showDialog(h30Var);
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
                                MediaController.B().S(MediaController.B().f21348v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21348v0, true);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            ch0 ch0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i12 = 15;
                            } else {
                                i12 = 29;
                            }
                            if (ch0Var.P(i12)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31448a.h(true);
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
        this.f31481y = imageView4;
        imageView4.setScaleType(scaleType);
        this.f31481y.setAutoRepeat(true);
        this.f31481y.f(2131624064, 30, 30, null);
        org.telegram.ui.ActionBar.r6.C(this.f31481y, org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(i10, e6Var)), org.telegram.ui.ActionBar.r6.N(i10), e6Var);
        addView(this.f31481y, b8.mf.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        e00 e00Var = new e00(this, context, context, 0);
        this.d = e00Var;
        addView(e00Var, b8.mf.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        e00 e00Var2 = new e00(this, context, context, 1);
        this.f31455e = e00Var2;
        addView(e00Var2, b8.mf.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.P = gVar;
        gVar.f39350g = 1.0f;
        gVar.f39352j = false;
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(2, context, this);
        this.N = k2Var;
        k2Var.setText(org.telegram.messenger.bd.M0(2131743452, null));
        org.telegram.ui.ActionBar.r6.V(this.N, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        org.telegram.ui.ActionBar.k2 k2Var2 = this.N;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
        org.telegram.ui.ActionBar.r6.R(k2Var2, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.r6.N(i11), org.telegram.ui.ActionBar.r6.N(i12), e6Var);
        this.N.setTextSize(1, 14.0f);
        this.N.setTypeface(org.telegram.messenger.g0.o());
        this.N.setGravity(17);
        this.N.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(this.N, b8.mf.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.N.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f40552b;

            {
                this.f40552b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j10;
                TL_stories.StoryItem u10;
                int i122;
                int i13 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f40552b;
                switch (i13) {
                    case 0:
                        ig igVar = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            if (d2Var instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ig igVar2 = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.f10297b;
                                int i15 = g1Var.f10299e;
                                if (i15 != org.telegram.messenger.h10.f22829t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i15).P1().u(g1Var.f10298c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i15).O(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                            if (d2Var2 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (igVar2 != null) {
                                    j13 = igVar2.a();
                                }
                                if (org.telegram.messenger.zi.B0(ziVar.f26868k) == j13) {
                                    fragmentContextView.f31465n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ziVar.f1());
                                d2Var2.presentFragment(new org.telegram.ui.wm(bundle), d2Var2 instanceof org.telegram.ui.wm);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.h10.f22829t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i112 = d2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.ld.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i17).J.get(0);
                                            j10 = kdVar.f23810a;
                                            i112 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i112).h(j10));
                                return;
                            } else {
                                d2Var2.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (d2Var2.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = d2Var2.getMessagesController().M0(Long.valueOf(groupCall.f25050c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25049b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var2.getParentActivity(), d2Var2, d2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                            if (d2Var2.getSendMessagesHelper().B(wmVar.a()) != null) {
                                h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                h30Var.I0 = new p0(fragmentContextView, 7);
                                d2Var2.showDialog(h30Var);
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
                                MediaController.B().S(MediaController.B().f21348v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21348v0, true);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            ch0 ch0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (ch0Var.P(i122)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31448a.h(true);
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
        imageView5.setImageResource(2131232256);
        ImageView imageView6 = this.M;
        int i13 = org.telegram.ui.ActionBar.k6.f28255x7;
        org.telegram.ui.ActionBar.r6.t(imageView6, i13, e6Var, mode);
        this.L.addView(this.M, b8.mf.e(20, 20, 17));
        this.L.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.L.setContentDescription(org.telegram.messenger.bd.M0(2131743859, null));
        this.L.setOnClickListener(new ai.t(16));
        this.L.setVisibility(8);
        addView(this.L, b8.mf.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f31468p0) {
            h();
        }
        x8 x8Var = new x8(context, false);
        this.f31453c0 = x8Var;
        x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(21.0f));
        this.f31453c0.setDelegate(new a00(this, 1));
        this.f31453c0.setVisibility(8);
        addView(this.f31453c0, b8.mf.e(108, 36, 51));
        this.F = new ch0(2131624332, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), true, null);
        g00 g00Var = new g00(this, context);
        this.E = g00Var;
        org.telegram.ui.ActionBar.r6.t(g00Var, org.telegram.ui.ActionBar.k6.A7, e6Var, PorterDuff.Mode.SRC_IN);
        this.E.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.E.setAnimation(this.F);
        this.E.setScaleType(scaleType);
        this.E.setVisibility(8);
        addView(this.E, b8.mf.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f40552b;

            {
                this.f40552b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j10;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f40552b;
                switch (i132) {
                    case 0:
                        ig igVar = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            if (d2Var instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ig igVar2 = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.f10297b;
                                int i15 = g1Var.f10299e;
                                if (i15 != org.telegram.messenger.h10.f22829t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i15).P1().u(g1Var.f10298c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i15).O(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                            if (d2Var2 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (igVar2 != null) {
                                    j13 = igVar2.a();
                                }
                                if (org.telegram.messenger.zi.B0(ziVar.f26868k) == j13) {
                                    fragmentContextView.f31465n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ziVar.f1());
                                d2Var2.presentFragment(new org.telegram.ui.wm(bundle), d2Var2 instanceof org.telegram.ui.wm);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.h10.f22829t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i112 = d2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.ld.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i17).J.get(0);
                                            j10 = kdVar.f23810a;
                                            i112 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i112).h(j10));
                                return;
                            } else {
                                d2Var2.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (d2Var2.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = d2Var2.getMessagesController().M0(Long.valueOf(groupCall.f25050c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25049b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var2.getParentActivity(), d2Var2, d2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                            if (d2Var2.getSendMessagesHelper().B(wmVar.a()) != null) {
                                h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                h30Var.I0 = new p0(fragmentContextView, 7);
                                d2Var2.showDialog(h30Var);
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
                                MediaController.B().S(MediaController.B().f21348v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21348v0, true);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            ch0 ch0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (ch0Var.P(i122)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31448a.h(true);
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
        imageView7.setImageResource(2131231983);
        org.telegram.ui.ActionBar.r6.t(this.G, i13, e6Var, mode);
        this.G.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.G.setScaleType(scaleType);
        addView(this.G, b8.mf.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f40552b;

            {
                this.f40552b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j10;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f40552b;
                switch (i132) {
                    case 0:
                        ig igVar = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            if (d2Var instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ig igVar2 = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.f10297b;
                                int i15 = g1Var.f10299e;
                                if (i15 != org.telegram.messenger.h10.f22829t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i15).P1().u(g1Var.f10298c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i15).O(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                            if (d2Var2 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (igVar2 != null) {
                                    j13 = igVar2.a();
                                }
                                if (org.telegram.messenger.zi.B0(ziVar.f26868k) == j13) {
                                    fragmentContextView.f31465n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ziVar.f1());
                                d2Var2.presentFragment(new org.telegram.ui.wm(bundle), d2Var2 instanceof org.telegram.ui.wm);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.h10.f22829t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i112 = d2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.ld.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i17).J.get(0);
                                            j10 = kdVar.f23810a;
                                            i112 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i112).h(j10));
                                return;
                            } else {
                                d2Var2.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (d2Var2.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = d2Var2.getMessagesController().M0(Long.valueOf(groupCall.f25050c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25049b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var2.getParentActivity(), d2Var2, d2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                            if (d2Var2.getSendMessagesHelper().B(wmVar.a()) != null) {
                                h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                h30Var.I0 = new p0(fragmentContextView, 7);
                                d2Var2.showDialog(h30Var);
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
                                MediaController.B().S(MediaController.B().f21348v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21348v0, true);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            ch0 ch0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (ch0Var.P(i122)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31448a.h(true);
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
        ai.d2 d2Var = new ai.d2(getContext(), 16);
        this.f31477w = d2Var;
        addView(d2Var, b8.mf.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f40552b;

            {
                this.f40552b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j10;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f40552b;
                switch (i132) {
                    case 0:
                        ig igVar = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var2.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            if (d2Var2 instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        ig igVar2 = fragmentContextView.f31465n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f31471r0;
                        org.telegram.ui.ActionBar.d2 d2Var22 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.f10297b;
                                int i15 = g1Var.f10299e;
                                if (i15 != org.telegram.messenger.h10.f22829t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i15).P1().u(g1Var.f10298c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i15).O(i15, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i14 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                            if (d2Var22 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (igVar2 != null) {
                                    j13 = igVar2.a();
                                }
                                if (org.telegram.messenger.zi.B0(ziVar.f26868k) == j13) {
                                    fragmentContextView.f31465n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", ziVar.f1());
                                d2Var22.presentFragment(new org.telegram.ui.wm(bundle), d2Var22 instanceof org.telegram.ui.wm);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.h10.f22829t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i112 = d2Var22.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.ld.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i17).J.get(0);
                                            j10 = kdVar.f23810a;
                                            i112 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i112).h(j10));
                                return;
                            } else {
                                d2Var22.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (d2Var22.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = d2Var22.getMessagesController().M0(Long.valueOf(groupCall.f25050c));
                                TLRPC.GroupCall groupCall2 = groupCall.f25049b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var22.getParentActivity(), d2Var22, d2Var22.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var22;
                            if (d2Var22.getSendMessagesHelper().B(wmVar.a()) != null) {
                                h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                h30Var.I0 = new p0(fragmentContextView, 7);
                                d2Var22.showDialog(h30Var);
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
                                MediaController.B().S(MediaController.B().f21348v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f21348v0, true);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            ch0 ch0Var = fragmentContextView.F;
                            if (fragmentContextView.Q) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (ch0Var.P(i122)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView.f31448a.h(true);
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
        int i3;
        ig igVar = this.f31465n;
        if (igVar != null) {
            if (!this.U || ((i3 = this.V) != 1 && i3 != 3)) {
                b();
                org.telegram.ui.ActionBar.d2 d2Var = this.h;
                org.telegram.messenger.py B = d2Var.getSendMessagesHelper().B(igVar.a());
                View fragmentView = d2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = d2Var.getVisibleDialog();
                if ((j() || igVar.q() || ((visibleDialog instanceof h30) && !((h30) visibleDialog).J)) && B != null) {
                    B = null;
                }
                g2.g gVar = this.f31476v0;
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
                        AnimatorSet animatorSet = this.f31457f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f31457f = null;
                        }
                        gVar.d();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f31457f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f31457f.setDuration(220L);
                        this.f31457f.setInterpolator(xq.f40452f);
                        this.f31457f.addListener(new b00(this, 3));
                        this.f31457f.start();
                        return;
                    }
                    int i10 = this.V;
                    if (i10 == -1 || i10 == 5) {
                        this.U = false;
                        setVisibility(8);
                    }
                } else if (this.V != 5 && this.f31457f != null && !z10) {
                    this.A0 = true;
                } else {
                    r(5);
                    if (z10 && this.T == 0.0f) {
                        setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                        i00 i00Var = this.f31469q0;
                        if (i00Var != null) {
                            ((wo0) i00Var).b(true);
                            ((wo0) this.f31469q0).b(false);
                        }
                    }
                    if (!this.U) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f31457f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f31457f = null;
                            }
                            gVar.d();
                            this.f31457f = new AnimatorSet();
                            i00 i00Var2 = this.f31469q0;
                            if (i00Var2 != null) {
                                ((wo0) i00Var2).b(true);
                            }
                            this.f31457f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                            this.f31457f.setDuration(200L);
                            this.f31457f.addListener(new b00(this, 4));
                            this.f31457f.start();
                        }
                        this.U = true;
                        setVisibility(0);
                    }
                    int i11 = this.R;
                    int i12 = B.f24828l;
                    if (i11 != i12) {
                        this.R = i12;
                        this.d.b(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("ImportUploading", null, 2131749230, Integer.valueOf(i12))), false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        boolean i3;
        String G;
        String M0;
        TextView nextTextView;
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        View fragmentView = d2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = d2Var instanceof org.telegram.ui.uw;
        if (z11) {
            if (org.telegram.messenger.ld.g() != 0) {
                i3 = true;
            } else {
                i3 = false;
            }
        } else {
            i3 = org.telegram.messenger.ld.f(d2Var.getCurrentAccount()).i(this.f31465n.a());
        }
        lt ltVar = this.f31475u0;
        if (!i3) {
            this.f31474t0 = -1;
            org.telegram.messenger.g0.r(ltVar);
            if (this.U) {
                this.U = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f31457f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f31457f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31457f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f31457f.setDuration(200L);
                this.f31457f.addListener(new b00(this, 11));
                this.f31457f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f31450b.setImageDrawable(new po0(getContext(), 1));
        if (z10 && this.T == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        if (!this.U) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f31457f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f31457f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f31457f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                this.f31457f.setDuration(200L);
                this.f31457f.addListener(new b00(this, 0));
                this.f31457f.start();
            }
            this.U = true;
            setVisibility(0);
        }
        if (z11) {
            String M02 = org.telegram.messenger.bd.M0(2131748848, null);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 4; i10++) {
                arrayList.addAll(org.telegram.messenger.ld.f(i10).J);
            }
            if (arrayList.size() == 1) {
                org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) arrayList.get(0);
                long B0 = org.telegram.messenger.zi.B0(kdVar.h.f26868k);
                if (org.telegram.messenger.m5.E(B0)) {
                    G = org.telegram.messenger.l10.j(org.telegram.messenger.hp.s1(kdVar.h.I1).a2(Long.valueOf(B0)), true);
                    M0 = org.telegram.messenger.bd.M0(2131753965, null);
                } else {
                    TLRPC.Chat M03 = org.telegram.messenger.hp.s1(kdVar.h.I1).M0(Long.valueOf(-B0));
                    if (M03 != null) {
                        G = M03.title;
                    } else {
                        G = "";
                    }
                    M0 = org.telegram.messenger.bd.M0(2131753964, null);
                }
            } else {
                G = org.telegram.messenger.bd.G(arrayList.size(), "Chats", new Object[0]);
                M0 = org.telegram.messenger.bd.M0(2131753963, null);
            }
            String format = String.format(M0, M02, G);
            int indexOf = format.indexOf(M02);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            for (int i11 = 0; i11 < 2; i11++) {
                e00 e00Var = this.d;
                if (i11 == 0) {
                    nextTextView = e00Var.getTextView();
                } else {
                    nextTextView = e00Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28178t7, this.f31471r0)), indexOf, M02.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        ltVar.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i11;
        if (i3 == org.telegram.messenger.hs.D4) {
            d(false);
        } else if (i3 == org.telegram.messenger.hs.G2) {
            e(false);
        } else {
            int i12 = org.telegram.messenger.hs.F4;
            ig igVar = this.f31465n;
            if (i3 == i12) {
                if (igVar != null) {
                    if (igVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i3 != org.telegram.messenger.hs.f23239h2 && i3 != org.telegram.messenger.hs.f23233g2 && i3 != org.telegram.messenger.hs.f23227f2 && i3 != org.telegram.messenger.hs.D2) {
                int i13 = org.telegram.messenger.hs.f23321v2;
                if (i3 != i13 && i3 != org.telegram.messenger.hs.f23328w2 && i3 != org.telegram.messenger.hs.F2) {
                    if (i3 == org.telegram.messenger.hs.C2) {
                        b();
                        if (this.U && this.V == 4) {
                            org.telegram.messenger.r3 groupCall = igVar.getGroupCall();
                            if (groupCall != null && this.f31455e != null) {
                                if (groupCall.j()) {
                                    this.f31455e.b(org.telegram.messenger.bd.W(4, groupCall.f25049b.schedule_date, true), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.f25049b;
                                    int i14 = groupCall2.participants_count;
                                    if (i14 == 0) {
                                        e00 e00Var = this.f31455e;
                                        if (groupCall2.rtmp_stream) {
                                            i11 = 2131743545;
                                        } else {
                                            i11 = 2131748622;
                                        }
                                        e00Var.b(org.telegram.messenger.bd.M0(i11, null), false);
                                    } else {
                                        e00 e00Var2 = this.f31455e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        e00Var2.b(org.telegram.messenger.bd.G(i14, str, new Object[0]), false);
                                    }
                                }
                            }
                            o(true);
                            return;
                        }
                        return;
                    } else if (i3 == org.telegram.messenger.hs.f23320v1) {
                        int i15 = this.V;
                        if (i15 == 1 || i15 == 3 || i15 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i3 == org.telegram.messenger.hs.J4) {
                        q(true);
                        return;
                    } else {
                        int i16 = org.telegram.messenger.hs.N4;
                        qc qcVar = this.f31448a;
                        if (i3 == i16) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.O0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.O0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.k6.G0().a(Math.max(this.N0, this.O0));
                                qcVar.f(Math.max(this.N0, this.O0));
                                return;
                            }
                            return;
                        } else if (i3 == org.telegram.messenger.hs.O4) {
                            b();
                            this.N0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.O0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.k6.G0().a(Math.max(this.N0, this.O0));
                                qcVar.f(Math.max(this.N0, this.O0));
                            }
                            this.f31453c0.invalidate();
                            return;
                        } else if (i3 == org.telegram.messenger.hs.f23221e2 && this.V == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.V == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i3 == i13) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.E != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
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
        ei.g1 g1Var = ei.g1.X;
        g2.g gVar = this.f31476v0;
        int i3 = 0;
        if (g1Var != null) {
            b();
            int i10 = this.V;
            if (6 != i10 && this.f31457f != null && !z10) {
                this.f31482y0 = true;
                return;
            } else if (6 != i10 && this.U && !z10) {
                AnimatorSet animatorSet = this.f31457f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f31457f = null;
                }
                gVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31457f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f31457f.setDuration(220L);
                this.f31457f.setInterpolator(xq.f40452f);
                this.f31457f.addListener(new b00(this, 6));
                this.f31457f.start();
                return;
            } else {
                r(6);
                if (!this.U) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f31457f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f31457f = null;
                        }
                        this.f31457f = new AnimatorSet();
                        this.f31478w0.d();
                        this.f31457f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                        this.f31457f.setDuration(220L);
                        this.f31457f.setInterpolator(xq.f40452f);
                        this.f31457f.addListener(new b00(this, 7));
                        this.f31457f.start();
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
                    AnimatorSet animatorSet4 = this.f31457f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f31457f = null;
                    }
                    gVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f31457f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f31457f.setDuration(220L);
                    this.f31457f.setInterpolator(xq.f40452f);
                    this.f31457f.addListener(new b00(this, 5));
                    this.f31457f.start();
                }
            } else if (z11 && this.V == -1) {
                this.U = false;
                setVisibility(8);
            }
        }
        ei.g1 g1Var2 = ei.g1.X;
        if (g1Var2 != null && this.V == 6) {
            e00 e00Var = this.d;
            TLRPC.GroupCall groupCall = g1Var2.f10304w;
            if (groupCall != null) {
                i3 = groupCall.participants_count;
            }
            e00Var.setText(org.telegram.messenger.bd.H(',', "LiveStoryTopPanelWatching", Math.max(1, i3)));
        }
    }

    public final void f() {
        int i3;
        TLRPC.User user;
        int i10;
        String format;
        TextView nextTextView;
        ig igVar = this.f31465n;
        if (igVar != null && this.d != null) {
            b();
            long a10 = igVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) org.telegram.messenger.ld.f(currentAccount).f23976c.f(a10);
            if (!this.f31473s0) {
                org.telegram.messenger.ld f10 = org.telegram.messenger.ld.f(currentAccount);
                a0.h hVar = f10.H;
                if (hVar.h(a10) < 0) {
                    hVar.k(Boolean.TRUE, a10);
                    TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                    tL_messages_getRecentLocations.peer = f10.getMessagesController().j1(a10);
                    tL_messages_getRecentLocations.limit = 100;
                    f10.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.p4(f10, a10, 1));
                }
                this.f31473s0 = true;
            }
            if (arrayList != null) {
                long e10 = org.telegram.messenger.h10.i(currentAccount).e();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                user = null;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i11);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long C1 = org.telegram.messenger.zi.C1(message.from_id);
                        if (user == null && C1 != e10) {
                            user = org.telegram.messenger.hp.s1(currentAccount).a2(Long.valueOf(C1));
                        }
                        i10++;
                    }
                }
                i3 = 0;
            } else {
                i3 = 0;
                user = null;
                i10 = 0;
            }
            if (this.f31474t0 != i10) {
                this.f31474t0 = i10;
                String M0 = org.telegram.messenger.bd.M0(2131748848, null);
                if (i10 == 0) {
                    format = M0;
                } else {
                    int i12 = i10 - 1;
                    if (org.telegram.messenger.ld.f(currentAccount).i(a10)) {
                        if (i12 != 0) {
                            if (i12 == 1 && user != null) {
                                Object[] objArr = new Object[1];
                                objArr[i3] = org.telegram.messenger.l10.j(user, true);
                                String a02 = org.telegram.messenger.bd.a0("SharingYouAndOtherName", null, 2131745378, objArr);
                                Object[] objArr2 = new Object[2];
                                objArr2[i3] = M0;
                                objArr2[1] = a02;
                                format = String.format("%1$s - %2$s", objArr2);
                            } else {
                                String M02 = org.telegram.messenger.bd.M0(2131752184, null);
                                int i13 = i3;
                                String G = org.telegram.messenger.bd.G(i12, "AndOther", new Object[i13]);
                                Object[] objArr3 = new Object[3];
                                objArr3[i13] = M0;
                                objArr3[1] = M02;
                                objArr3[2] = G;
                                format = String.format("%1$s - %2$s %3$s", objArr3);
                            }
                        } else {
                            String M03 = org.telegram.messenger.bd.M0(2131752184, null);
                            Object[] objArr4 = new Object[2];
                            objArr4[i3] = M0;
                            objArr4[1] = M03;
                            format = String.format("%1$s - %2$s", objArr4);
                        }
                    } else {
                        int i14 = i3;
                        if (i12 != 0) {
                            String j10 = org.telegram.messenger.l10.j(user, true);
                            String G2 = org.telegram.messenger.bd.G(i12, "AndOther", new Object[i14]);
                            Object[] objArr5 = new Object[3];
                            objArr5[i14] = M0;
                            objArr5[1] = j10;
                            objArr5[2] = G2;
                            format = String.format("%1$s - %2$s %3$s", objArr5);
                        } else {
                            String j11 = org.telegram.messenger.l10.j(user, true);
                            Object[] objArr6 = new Object[2];
                            objArr6[i14] = M0;
                            objArr6[1] = j11;
                            format = String.format("%1$s - %2$s", objArr6);
                        }
                    }
                }
                if (!format.equals(this.W)) {
                    this.W = format;
                    int indexOf = format.indexOf(M0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i15 = 0; i15 < 2; i15++) {
                        e00 e00Var = this.d;
                        if (i15 == 0) {
                            nextTextView = e00Var.getTextView();
                        } else {
                            nextTextView = e00Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28178t7, this.f31471r0)), indexOf, M0.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        boolean z12;
        ig igVar;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z13 = true;
        if (this.U) {
            int i3 = this.V;
            if (i3 != 1 && i3 != 3) {
                if ((i3 == 4 || i3 == 5) && !j()) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        boolean z14 = this.U;
        g2.g gVar = this.f31476v0;
        if (ziVar != null && ziVar.f1() != 0 && !org.telegram.messenger.zi.M4(ziVar.f26868k)) {
            b();
            int i10 = this.V;
            if (i10 != 0 && this.f31457f != null && !z11) {
                this.f31483z0 = true;
                return;
            }
            r(0);
            if (z11 && this.T == 0.0f) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                i00 i00Var = this.f31469q0;
                if (i00Var != null) {
                    ((wo0) i00Var).b(true);
                    ((wo0) this.f31469q0).b(false);
                }
            }
            if (!this.U) {
                if (!z11) {
                    AnimatorSet animatorSet = this.f31457f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f31457f = null;
                    }
                    gVar.d();
                    this.f31457f = new AnimatorSet();
                    i00 i00Var2 = this.f31469q0;
                    if (i00Var2 != null) {
                        ((wo0) i00Var2).b(true);
                    }
                    this.f31457f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f31457f.setDuration(200L);
                    this.f31457f.addListener(new b00(this, 2));
                    this.f31457f.start();
                }
                this.U = true;
                setVisibility(0);
            }
            if (MediaController.B().H()) {
                this.f31452c.a(false, !z11);
                this.f31450b.setContentDescription(org.telegram.messenger.bd.M0(2131754929, null));
            } else {
                this.f31452c.a(true, !z11);
                this.f31450b.setContentDescription(org.telegram.messenger.bd.M0(2131754930, null));
            }
            if (this.S == ziVar && i10 == 0) {
                return;
            }
            this.S = ziVar;
            if (!org.telegram.messenger.zi.S4(ziVar.f26868k) && !this.S.i4()) {
                this.f31449a0 = true;
                if (this.H != null) {
                    if (ziVar.L0() >= 600.0d) {
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
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(ziVar.x1(true), " - ", ziVar.z1(true)));
                for (int i11 = 0; i11 < 2; i11++) {
                    e00 e00Var = this.d;
                    if (i11 == 0) {
                        nextTextView2 = e00Var.getTextView();
                    } else {
                        nextTextView2 = e00Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.f31449a0 = false;
                org.telegram.ui.ActionBar.q0 q0Var = this.H;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                    this.H.setEnabled(true);
                }
                this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.O, 0);
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(ziVar.x1(true), " ", ziVar.z1(true)));
                for (int i12 = 0; i12 < 2; i12++) {
                    e00 e00Var2 = this.d;
                    if (i12 == 0) {
                        nextTextView = e00Var2.getTextView();
                    } else {
                        nextTextView = e00Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28178t7, this.f31471r0)), 0, ziVar.x1(true).length(), 18);
            this.d.b(spannableStringBuilder, (!z11 && z14 && this.f31449a0) ? false : false);
            return;
        }
        this.S = null;
        if (this.f31451b0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !l10.c()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!j() && !z12 && (igVar = this.f31465n) != null && !l10.c()) {
            org.telegram.messenger.r3 groupCall = igVar.getGroupCall();
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
            if (q0Var2 != null && q0Var2.x()) {
                this.H.U(null, null);
            }
            this.U = false;
            if (z11) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f31457f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f31457f = null;
            }
            gVar.d();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f31457f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f31457f.setDuration(200L);
            i00 i00Var3 = this.f31469q0;
            if (i00Var3 != null) {
                ((wo0) i00Var3).b(true);
            }
            this.f31457f.addListener(new b00(this, 1));
            this.f31457f.start();
        } else {
            setVisibility(8);
        }
    }

    public qc getCapsuleBlobDrawable() {
        return this.f31448a;
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
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31471r0;
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), false, this.f31471r0);
        this.H = q0Var;
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(this.H.getIconView(), i3, e6Var, PorterDuff.Mode.SRC_IN);
        }
        this.H.setAdditionalYOffset(org.telegram.messenger.g0.L(30.0f));
        this.H.setLongClickEnabled(false);
        this.H.setVisibility(8);
        this.H.setTag(null);
        this.H.setShowSubmenuByMove(false);
        this.H.setContentDescription(org.telegram.messenger.bd.M0(2131754805, null));
        this.H.setDelegate(new wz(this));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
        cu0 cu0Var = new cu0();
        this.I = cu0Var;
        q0Var2.setIcon(cu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), e6Var);
        this.J = u0Var;
        u0Var.setRoundRadiusDp(6.0f);
        this.J.setDrawShadow(true);
        this.J.setOnValueChange(new e(this, 13));
        org.telegram.ui.ActionBar.o0 z10 = this.H.z(0, 2131232373, org.telegram.messenger.bd.M0(2131745276, null));
        org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
        o0VarArr[0] = z10;
        o0VarArr[1] = this.H.z(1, 2131232372, org.telegram.messenger.bd.M0(2131745277, null));
        o0VarArr[2] = this.H.z(2, 2131232371, org.telegram.messenger.bd.M0(2131745278, null));
        o0VarArr[3] = this.H.z(3, 2131232370, org.telegram.messenger.bd.M0(2131745280, null));
        o0VarArr[4] = this.H.z(4, 2131232375, org.telegram.messenger.bd.M0(2131745274, null));
        o0VarArr[5] = this.H.z(5, 2131232374, org.telegram.messenger.bd.M0(2131745275, null));
        if (org.telegram.messenger.g0.f22607p >= 3.0f) {
            this.H.setPadding(0, 1, 0, 0);
        }
        this.H.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        addView(this.H, b8.mf.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.H.setOnClickListener(new q2(17, this, fArr));
        this.H.setOnLongClickListener(new zz(this, 0));
        q(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i3 = this.V;
        if ((i3 == 3 || i3 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(org.telegram.messenger.kd kdVar) {
        if (kdVar != null) {
            org.telegram.ui.ActionBar.d2 d2Var = this.h;
            if (d2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) d2Var.getParentActivity();
                launchActivity.O0(kdVar.h.I1);
                org.telegram.ui.la0 la0Var = new org.telegram.ui.la0(2);
                la0Var.G0(kdVar.h);
                la0Var.H0 = new ei.c1(kdVar, org.telegram.messenger.zi.B0(kdVar.h.f26868k), 5);
                launchActivity.t0(la0Var);
            }
        }
    }

    public final void l(float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.l(float, float, boolean):void");
    }

    public final void m() {
        za.p pVar = this.M0;
        if (pVar != null) {
            pVar.a();
            this.M0 = null;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            org.telegram.messenger.ds[] dsVarArr = this.L0;
            org.telegram.messenger.ds dsVar = dsVarArr[i3];
            if (dsVar != null) {
                dsVar.a();
                dsVarArr[i3] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.g gVar = this.P;
        if (gVar != null && gVar.f39350g >= 1.0f) {
            this.P0 = false;
            org.telegram.messenger.g0.i3(new a00(this, 0), 150L);
            return;
        }
        this.P0 = true;
    }

    public final void o(boolean z10) {
        org.telegram.messenger.r3 r3Var;
        int i3;
        TLRPC.User user;
        int e10;
        int i10;
        float f10;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f31453c0.f40266a.f39951f) != null) {
            valueAnimator.cancel();
            this.f31453c0.f40266a.f39951f = null;
        }
        w8 w8Var = this.f31453c0.f40266a;
        if (w8Var.f39951f == null) {
            int i11 = this.V;
            int i12 = this.f31467o0;
            ig igVar = this.f31465n;
            if (i11 == 4) {
                if (igVar != null) {
                    r3Var = igVar.getGroupCall();
                    i12 = this.h.getCurrentAccount();
                } else {
                    r3Var = null;
                }
                i3 = i12;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                r3Var = VoIPService.getSharedInstance().groupCall;
                if (igVar != null) {
                    user = null;
                } else {
                    user = VoIPService.getSharedInstance().getUser();
                }
                i3 = VoIPService.getSharedInstance().getAccount();
            } else {
                r3Var = null;
                i3 = i12;
                user = null;
            }
            int i13 = 0;
            if (r3Var != null) {
                ArrayList arrayList = r3Var.f25051e;
                int size = arrayList.size();
                for (int i14 = 0; i14 < 3; i14++) {
                    if (i14 < size) {
                        this.f31453c0.b(i14, i3, (TLObject) arrayList.get(i14));
                    } else {
                        this.f31453c0.b(i14, i3, null);
                    }
                }
            } else if (user != null) {
                this.f31453c0.b(0, i3, user);
                for (int i15 = 1; i15 < 3; i15++) {
                    this.f31453c0.b(i15, i3, null);
                }
            } else {
                for (int i16 = 0; i16 < 3; i16++) {
                    this.f31453c0.b(i16, i3, null);
                }
            }
            this.f31453c0.a(z10);
            if (this.V == 4 && r3Var != null) {
                if (!r3Var.f25049b.rtmp_stream) {
                    i13 = Math.min(3, r3Var.f25051e.size());
                }
                if (i13 == 0) {
                    e10 = 10;
                } else {
                    e10 = com.google.android.recaptcha.internal.a.e(i13, 1, 24, 52);
                }
                int i17 = e10 + 3;
                if (z10) {
                    int i18 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (org.telegram.messenger.g0.L(i17) != i18) {
                        float translationX = (this.d.getTranslationX() + i18) - org.telegram.messenger.g0.L(f10);
                        this.d.setTranslationX(translationX);
                        this.f31455e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        xq xqVar = xq.f40452f;
                        duration.setInterpolator(xqVar);
                        this.f31455e.animate().translationX(0.0f).setDuration(220L).setInterpolator(xqVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.f31455e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.f31455e.setTranslationX(0.0f);
                }
                e00 e00Var = this.d;
                float f11 = i17;
                int i19 = 36;
                if (r3Var.j()) {
                    i10 = 90;
                } else {
                    i10 = 36;
                }
                e00Var.setLayoutParams(b8.mf.d(-1, 20.0f, 51, f11, 5.0f, i10, 0.0f));
                e00 e00Var2 = this.f31455e;
                if (r3Var.j()) {
                    i19 = 90;
                }
                e00Var2.setLayoutParams(b8.mf.d(-1, 20.0f, 51, f11, 25.0f, i19, 0.0f));
                return;
            }
            return;
        }
        w8Var.f39952g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i3 = 15;
        if (this.f31468p0) {
            za.p pVar = new za.p(org.telegram.messenger.hs.e(), this);
            pVar.b(org.telegram.messenger.hs.D4);
            pVar.b(org.telegram.messenger.hs.F4);
            this.M0 = pVar;
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                za.p pVar2 = new za.p(org.telegram.messenger.hs.f(i10), this);
                pVar2.b(org.telegram.messenger.hs.f23227f2);
                pVar2.b(org.telegram.messenger.hs.f23233g2);
                pVar2.b(org.telegram.messenger.hs.f23239h2);
                pVar2.b(org.telegram.messenger.hs.f23328w2);
                pVar2.b(org.telegram.messenger.hs.C2);
                pVar2.b(org.telegram.messenger.hs.f23320v1);
                pVar2.b(org.telegram.messenger.hs.G2);
                pVar2.b(org.telegram.messenger.hs.f23221e2);
                this.L0[i10] = pVar2;
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            za.p pVar3 = new za.p(org.telegram.messenger.hs.e(), this);
            pVar3.b(org.telegram.messenger.hs.J4);
            pVar3.b(org.telegram.messenger.hs.f23321v2);
            pVar3.b(org.telegram.messenger.hs.D2);
            pVar3.b(org.telegram.messenger.hs.O4);
            pVar3.b(org.telegram.messenger.hs.N4);
            pVar3.b(org.telegram.messenger.hs.F2);
            this.M0 = pVar3;
            if (ei.g1.X != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !l10.c()) {
                a(true);
            } else {
                ig igVar = this.f31465n;
                if (igVar != null && this.h.getSendMessagesHelper().B(igVar.a()) != null && !j()) {
                    c(true);
                } else if (igVar != null && igVar.getGroupCall() != null && igVar.getGroupCall().y() && !l10.c() && !j()) {
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
                this.f31466n0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.k6.G0().f35231l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            qc qcVar = this.f31448a;
            if (!qcVar.f37437u) {
                qcVar.f37437u = true;
                qcVar.f37436t = SystemClock.elapsedRealtime();
                cg.j.d().a(60, qcVar.F);
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
                ch0 ch0Var = this.F;
                if (!z10) {
                    i3 = 29;
                }
                ch0Var.P(i3);
                ch0 ch0Var2 = this.F;
                ch0Var2.N(ch0Var2.f32727f - 1, false, true);
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
        int i3;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.Q;
        qc qcVar = this.f31448a;
        if (z11 != z10) {
            this.Q = z10;
            ch0 ch0Var = this.F;
            if (z10) {
                i3 = 15;
            } else {
                i3 = 29;
            }
            ch0Var.P(i3);
            ch0 ch0Var2 = this.F;
            ch0Var2.N(ch0Var2.f32727f - 1, false, true);
            this.E.invalidate();
            org.telegram.ui.ActionBar.k6.G0().c(this.U);
            qcVar.h(this.U);
        }
        if (this.Q) {
            this.O0 = 0.0f;
            org.telegram.ui.ActionBar.k6.G0().a(0.0f);
            qcVar.f(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.s0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f31457f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31457f = null;
        }
        if (this.m0) {
            org.telegram.messenger.g0.r(this.f31466n0);
            this.m0 = false;
        }
        this.U = false;
        this.f31476v0.e();
        this.T = 0.0f;
        m();
        if (!this.f31468p0) {
            for (int i3 = 0; i3 < 4; i3++) {
                GroupCallMessagesController.getInstance(i3).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i10 = this.V;
        if (i10 == 3 || i10 == 1) {
            k00 G0 = org.telegram.ui.ActionBar.k6.G0();
            ArrayList arrayList = G0.f35231l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.f35223b;
                G0.f35223b = null;
                G0.f35224c = null;
            }
            qc qcVar = this.f31448a;
            if (qcVar.f37437u) {
                qcVar.f37437u = false;
                cg.j.d().f(qcVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.Q0 = false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, org.telegram.messenger.g0.M(getStyleHeight()));
    }

    @Override
    public final void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f31477w != null) {
            int i3 = this.V;
            if ((i3 == 1 || i3 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
                this.W0++;
                if (!groupCallMessage.isOut()) {
                    this.V0.h(new h00(this.f31477w, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i3 = this.W0;
        if (i3 > 0) {
            int i10 = i3 - 1;
            this.W0 = i10;
            if (i10 == 0) {
                this.V0.h(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override
    public final void onStateChanged(int i3) {
        p();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }

    public final void p() {
        org.telegram.messenger.r3 r3Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i3 = this.V;
            if (i3 == 1 || i3 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(org.telegram.messenger.bd.M0(2131743402, null), false);
                } else if (sharedInstance.isConference() && (r3Var = sharedInstance.groupCall) != null) {
                    if (r3Var.f25051e.size() <= 1) {
                        this.d.b(org.telegram.messenger.bd.M0(2131751823, null), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.f25051e.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.m5.s(sharedInstance.getAccount(), org.telegram.messenger.m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.f25051e.get(i10)).peer)));
                    }
                    if (sharedInstance.groupCall.f25051e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.bd.G(sharedInstance.groupCall.f25051e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    ig igVar = this.f31465n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.f25049b.title)) {
                            this.d.b(sharedInstance.groupCall.f25049b.title, false);
                        } else if (igVar != null && igVar.g() != null && igVar.g().f27001id == sharedInstance.getChat().f27001id) {
                            TLRPC.Chat g7 = igVar.g();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(org.telegram.messenger.bd.M0(2131743458, null), false);
                            } else if (org.telegram.messenger.t3.W(g7)) {
                                this.d.b(org.telegram.messenger.bd.M0(2131743458, null), false);
                            } else {
                                this.d.b(org.telegram.messenger.bd.M0(2131743317, null), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (igVar != null && igVar.j() != null && igVar.j().f27150id == user.f27150id) {
                            this.d.setText(org.telegram.messenger.bd.M0(2131746056, null));
                        } else {
                            this.d.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
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
        float C = MediaController.B().C(this.f31449a0);
        this.I.b(z10, C);
        updateColors();
        boolean z11 = this.B0;
        int i3 = 0;
        this.B0 = false;
        while (true) {
            org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
            if (i3 < o0VarArr.length) {
                org.telegram.ui.ActionBar.e6 e6Var = this.f31471r0;
                if (!z11 && Math.abs(C - X0[i3]) < 0.05f) {
                    org.telegram.ui.ActionBar.o0 o0Var = o0VarArr[i3];
                    int i10 = org.telegram.ui.ActionBar.k6.Ei;
                    o0Var.a(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
                } else {
                    org.telegram.ui.ActionBar.o0 o0Var2 = o0VarArr[i3];
                    int i11 = org.telegram.ui.ActionBar.k6.E8;
                    o0Var2.a(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
                }
                i3++;
            } else {
                this.J.e(z10, C);
                return;
            }
        }
    }

    public final void r(int i3) {
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
        if (this.V != i3) {
            b();
            int i14 = this.V;
            qc qcVar = this.f31448a;
            boolean z12 = true;
            if (i14 == 3 || i14 == 1) {
                k00 G0 = org.telegram.ui.ActionBar.k6.G0();
                ArrayList arrayList = G0.f35231l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    G0.d = G0.f35223b;
                    G0.f35223b = null;
                    G0.f35224c = null;
                }
                if (qcVar.f37437u) {
                    qcVar.f37437u = false;
                    cg.j.d().f(qcVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                qe.j jVar = this.V0;
                if (jVar != null) {
                    jVar.h(null, true);
                }
            }
            this.V = i3;
            d00 d00Var = this.f31472s;
            if (i3 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            d00Var.setWillNotDraw(z10);
            if (i3 != 4) {
                this.f31461i0 = false;
            }
            x8 x8Var = this.f31453c0;
            if (x8Var != null) {
                x8Var.setStyle(this.V);
                this.f31453c0.setLayoutParams(b8.mf.e(108, getStyleHeight(), 51));
            }
            this.f31472s.setLayoutParams(b8.mf.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f10 = this.T;
            if (f10 > 0.0f && f10 != org.telegram.messenger.g0.M(getStyleHeight())) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.f31471r0;
            if (i3 == 6) {
                this.f31479x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                this.f31472s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bl, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.cl, e6Var)}));
                this.f31472s.setTag(null);
                this.f31455e.setVisibility(8);
                this.N.setVisibility(8);
                this.G.setVisibility(8);
                this.f31450b.setVisibility(8);
                this.E.setVisibility(8);
                this.f31481y.setVisibility(8);
                this.f31481y.i();
                this.f31453c0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
                for (int i15 = 0; i15 < 2; i15++) {
                    e00 e00Var = this.d;
                    if (i15 == 0) {
                        nextTextView5 = e00Var.getTextView();
                    } else {
                        nextTextView5 = e00Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        org.telegram.ui.ActionBar.r6.V(nextTextView5, org.telegram.ui.ActionBar.k6.A7, e6Var);
                        nextTextView5.setTypeface(org.telegram.messenger.g0.o());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(b8.mf.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i3 == 5) {
                this.f31479x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                this.f31472s.setBackgroundColor(0);
                this.f31472s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28215v7));
                for (int i16 = 0; i16 < 2; i16++) {
                    e00 e00Var2 = this.d;
                    if (i16 == 0) {
                        nextTextView4 = e00Var2.getTextView();
                    } else {
                        nextTextView4 = e00Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        org.telegram.ui.ActionBar.r6.V(nextTextView4, org.telegram.ui.ActionBar.k6.f28197u7, e6Var);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28197u7));
                this.f31455e.setVisibility(8);
                this.N.setVisibility(8);
                this.G.setVisibility(8);
                this.f31450b.setVisibility(8);
                this.E.setVisibility(8);
                this.f31453c0.setVisibility(8);
                this.f31481y.setVisibility(0);
                this.f31481y.d();
                this.G.setContentDescription(org.telegram.messenger.bd.M0(2131754900, null));
                org.telegram.ui.ActionBar.q0 q0Var = this.H;
                if (q0Var != null) {
                    q0Var.setVisibility(8);
                    this.H.setTag(null);
                }
                this.d.setLayoutParams(b8.mf.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i3 != 0 && i3 != 2) {
                if (i3 == 4) {
                    this.f31479x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    this.f31472s.setBackgroundColor(0);
                    this.f31472s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28215v7));
                    this.E.setVisibility(8);
                    this.f31455e.setVisibility(0);
                    for (int i17 = 0; i17 < 2; i17++) {
                        e00 e00Var3 = this.d;
                        if (i17 == 0) {
                            nextTextView3 = e00Var3.getTextView();
                        } else {
                            nextTextView3 = e00Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            org.telegram.ui.ActionBar.r6.V(nextTextView3, org.telegram.ui.ActionBar.k6.f28178t7, e6Var);
                            nextTextView3.setTypeface(org.telegram.messenger.g0.o());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28178t7));
                    this.d.setPadding(0, 0, this.O, 0);
                    this.f31481y.setVisibility(8);
                    this.f31481y.i();
                    ig igVar = this.f31465n;
                    z12 = (igVar == null || igVar.getGroupCall() == null || igVar.getGroupCall().f25049b == null || !igVar.getGroupCall().f25049b.rtmp_stream) ? false : false;
                    x8 x8Var2 = this.f31453c0;
                    if (!z12) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    x8Var2.setVisibility(i13);
                    if (this.f31453c0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                        this.f31455e.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                    }
                    this.G.setVisibility(8);
                    this.f31450b.setVisibility(8);
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                        this.H.setTag(null);
                    }
                } else if (i3 == 1 || i3 == 3) {
                    this.f31479x.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    x8 x8Var3 = this.f31453c0;
                    if (!hasRtmpStream) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    x8Var3.setVisibility(i10);
                    if (i3 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f31453c0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.f31455e.setTranslationX(0.0f);
                    }
                    g00 g00Var = this.E;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    g00Var.setVisibility(i11);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.Q = z11;
                    ch0 ch0Var = this.F;
                    if (z11) {
                        i12 = 15;
                    } else {
                        i12 = 29;
                    }
                    ch0Var.P(i12);
                    ch0 ch0Var2 = this.F;
                    ch0Var2.N(ch0Var2.f32727f - 1, false, true);
                    this.E.invalidate();
                    this.f31472s.setBackground(null);
                    this.f31472s.setBackgroundColor(0);
                    this.f31481y.setVisibility(8);
                    this.f31481y.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.k6.G0().f35231l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!qcVar.f37437u) {
                        qcVar.f37437u = true;
                        qcVar.f37436t = SystemClock.elapsedRealtime();
                        cg.j.d().a(60, qcVar.F);
                    }
                    invalidate();
                    for (int i18 = 0; i18 < 2; i18++) {
                        e00 e00Var4 = this.d;
                        if (i18 == 0) {
                            nextTextView2 = e00Var4.getTextView();
                        } else {
                            nextTextView2 = e00Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            org.telegram.ui.ActionBar.r6.V(nextTextView2, org.telegram.ui.ActionBar.k6.A7, e6Var);
                            nextTextView2.setTypeface(org.telegram.messenger.g0.o());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
                    this.G.setVisibility(8);
                    this.f31450b.setVisibility(8);
                    this.f31455e.setVisibility(8);
                    this.N.setVisibility(8);
                    this.d.setLayoutParams(b8.mf.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(org.telegram.messenger.g0.L(88.0f), 0, org.telegram.messenger.g0.L(88.0f) + this.O, 0);
                    org.telegram.ui.ActionBar.q0 q0Var3 = this.H;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                        this.H.setTag(null);
                    }
                }
            } else {
                this.f31479x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                this.f31472s.setBackgroundColor(0);
                this.f31472s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28215v7));
                this.f31455e.setVisibility(8);
                this.N.setVisibility(8);
                this.G.setVisibility(0);
                this.f31450b.setVisibility(0);
                this.E.setVisibility(8);
                this.f31481y.setVisibility(8);
                this.f31481y.i();
                this.f31453c0.setVisibility(8);
                for (int i19 = 0; i19 < 2; i19++) {
                    e00 e00Var5 = this.d;
                    if (i19 == 0) {
                        nextTextView = e00Var5.getTextView();
                    } else {
                        nextTextView = e00Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        org.telegram.ui.ActionBar.r6.V(nextTextView, org.telegram.ui.ActionBar.k6.f28197u7, e6Var);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28197u7));
                if (i3 == 6) {
                    this.f31450b.setLayoutParams(b8.mf.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(b8.mf.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.G.setVisibility(8);
                } else if (i3 == 0) {
                    this.f31450b.setLayoutParams(b8.mf.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(b8.mf.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.q0 q0Var4 = this.H;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(0);
                        this.H.setTag(1);
                    }
                    this.G.setContentDescription(org.telegram.messenger.bd.M0(2131754900, null));
                } else {
                    this.f31450b.setLayoutParams(b8.mf.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(b8.mf.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.G.setContentDescription(org.telegram.messenger.bd.M0(2131754755, null));
                }
            }
        }
    }

    public void setDelegate(i00 i00Var) {
        this.f31469q0 = i00Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.S0 = z10;
    }

    public void setLeftMargin(float f10) {
        if (this.f31472s == null) {
            this.U0 = f10;
            return;
        }
        ImageView imageView = this.f31450b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        fh0 fh0Var = this.f31481y;
        if (fh0Var != null) {
            fh0Var.setTranslationX(f10);
        }
        e00 e00Var = this.d;
        if (e00Var != null) {
            e00Var.setTranslationX(f10);
        }
        e00 e00Var2 = this.f31455e;
        if (e00Var2 != null) {
            e00Var2.setTranslationX(f10);
        }
        x8 x8Var = this.f31453c0;
        if (x8Var != null) {
            x8Var.setTranslationX(f10);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.D0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.f31451b0 = z10;
    }

    public void setTopPadding(float f10) {
        this.T = f10;
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        setTopPadding(this.T);
        if (i3 == 8) {
            this.Q0 = false;
        }
    }

    @Override
    public final void updateColors() {
        int i3;
        TextView nextTextView;
        o31[] o31VarArr;
        TextView nextTextView2;
        qc qcVar = this.f31448a;
        int i10 = qcVar.A;
        if (i10 >= 0) {
            qcVar.E = 1.0f;
            qcVar.a(qc.e(i10));
        }
        if (!i(MediaController.B().C(this.f31449a0), 1.0f)) {
            i3 = org.telegram.ui.ActionBar.k6.Ei;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28255x7;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f31471r0;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        cu0 cu0Var = this.I;
        if (cu0Var != null) {
            cu0Var.f32835a.u(w02);
            Paint paint = cu0Var.f32836b;
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
                    org.telegram.ui.ActionBar.k6.H1(background, w02 & 436207615, true);
                }
            } else {
                org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(436207615 & w02, 1, org.telegram.messenger.g0.L(14.0f));
                this.F0 = h02;
                q0Var2.setBackground(h02);
                this.K0 = w02;
            }
        }
        if (this.f31450b != null) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28235w7, e6Var);
            if (this.G0 == null || w03 != this.I0) {
                ImageView imageView = this.f31450b;
                this.I0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.G != null) {
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28255x7, e6Var);
            if (this.H0 == null || w04 != this.J0) {
                ImageView imageView2 = this.G;
                this.J0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.H0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.f31455e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                e00 e00Var = this.f31455e;
                if (i11 == 0) {
                    nextTextView2 = e00Var.getTextView();
                } else {
                    nextTextView2 = e00Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28255x7, e6Var));
                }
            }
        }
        e00 e00Var2 = this.d;
        if (e00Var2 != null) {
            Object tag = e00Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    e00 e00Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = e00Var3.getTextView();
                    } else {
                        nextTextView = e00Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.k6.w0(intValue, e6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (o31VarArr = (o31[]) ((Spanned) text).getSpans(0, text.length(), o31.class)) != null) {
                            for (o31 o31Var : o31VarArr) {
                                o31Var.f36688b = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28178t7, e6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.d2 d2Var, View view, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f31448a = new qc();
        this.K = new org.telegram.ui.ActionBar.o0[6];
        this.R = -1;
        this.V = -1;
        this.f31451b0 = true;
        this.f31463k0 = new g6(false, true, true);
        this.f31466n0 = new c00(this);
        this.f31467o0 = org.telegram.messenger.h10.f22829t0;
        this.f31474t0 = -1;
        this.f31475u0 = new lt(this, 3);
        this.f31476v0 = new g2.g((int[]) null);
        this.f31478w0 = new g2.g(new int[]{org.telegram.messenger.hs.D});
        this.L0 = new org.telegram.messenger.ds[4];
        this.R0 = new Paint(1);
        this.T0 = 0;
        this.V0 = new qe.j(new wz(this), xq.h, 450L);
        this.W0 = 0;
        this.f31471r0 = e6Var;
        this.h = d2Var;
        if (d2Var instanceof ig) {
            this.f31465n = (ig) d2Var;
        }
        this.f31470r = view;
        this.U = true;
        this.f31468p0 = z10;
        if (view == null) {
            ((ViewGroup) d2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
