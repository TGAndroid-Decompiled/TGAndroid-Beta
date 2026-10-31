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
public class FragmentContextView extends FrameLayout implements org.telegram.messenger.us, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.k6 {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public z00 B0;
    public ViewGroup C0;
    public y00 D;
    public long D0;
    public bi0 E;
    public org.telegram.ui.Cells.y E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public org.telegram.ui.ActionBar.t0 G;
    public PorterDuffColorFilter G0;
    public jh.g H;
    public int H0;
    public org.telegram.ui.ActionBar.x0 I;
    public int I0;
    public final org.telegram.ui.ActionBar.r0[] J;
    public int J0;
    public FrameLayout K;
    public final org.telegram.messenger.vs[] K0;
    public ImageView L;
    public xa.n L0;
    public org.telegram.ui.ActionBar.q2 M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.voip.g O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public org.telegram.messenger.jj R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final fe.m U0;
    public String V;
    public int V0;
    public boolean W;
    public final lc f24030a;
    public boolean f24031a0;
    public ImageView f24032b;
    public u8 f24033b0;
    public kf0 f24034c;
    public Paint f24035c0;
    public w00 d;
    public LinearGradient f24036d0;
    public w00 e;
    public Matrix f24037e0;
    public AnimatorSet f24038f;
    public int f24039f0;
    public TextPaint f24040g0;
    public final org.telegram.ui.ActionBar.k2 h;
    public boolean f24041h0;
    public boolean f24042i0;
    public final e6 f24043j0;
    public dc f24044k0;
    public boolean f24045l0;
    public final u00 m0;
    public final gg f24046n;
    public final int f24047n0;
    public final boolean f24048o0;
    public b10 f24049p0;
    public final org.telegram.ui.ActionBar.p6 f24050q0;
    public final View f24051r;
    public boolean f24052r0;
    public v00 f24053s;
    public int f24054s0;
    public final ew f24055t0;
    public final e2.f f24056u0;
    public final e2.f f24057v0;
    public org.telegram.ui.Cells.a5 f24058w;
    public boolean f24059w0;
    public View f24060x;
    public boolean f24061x0;
    public ei0 f24062y;
    public boolean f24063y0;
    public boolean f24064z0;

    public FragmentContextView(Context context, org.telegram.ui.ay ayVar, boolean z10) {
        this(context, ayVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.U;
        org.telegram.ui.ActionBar.p6 p6Var = this.f24050q0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21224t7, p6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21243u7, p6Var);
        }
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A7, p6Var);
    }

    public static boolean i(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.05f) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
        if (jjVar != null && org.telegram.messenger.jj.R4(jjVar.f16337k)) {
            return true;
        }
        return false;
    }

    public final void a(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.a(boolean):void");
    }

    public final void b() {
        if (this.f24053s != null) {
            return;
        }
        Context context = getContext();
        v00 v00Var = new v00(this, context);
        this.f24053s = v00Var;
        this.f24044k0 = new dc(v00Var);
        int i10 = org.telegram.messenger.i0.f16026q.x;
        e6 e6Var = this.f24043j0;
        e6Var.M = i10;
        e6Var.A = 0.4f;
        e6Var.setCallback(v00Var);
        e6Var.u(-1);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        addView(this.f24053s, w7.b6.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f24060x = view;
        this.f24053s.addView(view, w7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f24032b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f24032b;
        int i11 = org.telegram.ui.ActionBar.t6.f21278w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.p6 p6Var = this.f24050q0;
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, p6Var, mode);
        ImageView imageView3 = this.f24032b;
        kf0 kf0Var = new kf0(16);
        this.f24034c = kf0Var;
        imageView3.setImageDrawable(kf0Var);
        this.f24032b.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var) & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        addView(this.f24032b, w7.b6.e(36, 36, 51));
        this.f24032b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f29229b;

            {
                this.f29229b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i12;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f29229b;
                switch (i14) {
                    case 0:
                        gg ggVar = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, p6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        gg ggVar2 = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.U;
                        if (i15 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.f49420b;
                                int i16 = s0Var.e;
                                if (i16 != org.telegram.messenger.d20.f15147s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i16).O1().u(s0Var.f49421c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i16).P(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i15 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ggVar2 != null) {
                                    j13 = ggVar2.a();
                                }
                                if (org.telegram.messenger.jj.B0(jjVar.f16337k) == j13) {
                                    fragmentContextView.f24046n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.o5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.o5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", jjVar.f1());
                                k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = org.telegram.messenger.d20.f15147s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i12 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!org.telegram.messenger.nd.f(i18).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i18).I.get(0);
                                            j10 = mdVar.f16940a;
                                            i12 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i12 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i12).h(j10));
                                return;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.f18229c));
                                TLRPC.GroupCall groupCall2 = groupCall.f18228b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                            if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                d40Var.H0 = new r0(fragmentContextView, 7);
                                k2Var2.showDialog(d40Var);
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
                                MediaController.B().S(MediaController.B().f14482u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f14482u0, true);
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
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            bi0 bi0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (bi0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.f24030a.h(true);
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
        this.f24062y = imageView4;
        imageView4.setScaleType(scaleType);
        this.f24062y.setAutoRepeat(true);
        this.f24062y.f(2131624063, 30, 30, null);
        org.telegram.ui.ActionBar.a7.C(this.f24062y, org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var)), org.telegram.ui.ActionBar.a7.N(i11), p6Var);
        addView(this.f24062y, w7.b6.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        w00 w00Var = new w00(this, context, context, 0);
        this.d = w00Var;
        addView(w00Var, w7.b6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        w00 w00Var2 = new w00(this, context, context, 1);
        this.e = w00Var2;
        addView(w00Var2, w7.b6.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.O = gVar;
        gVar.f31437g = 1.0f;
        gVar.f31439j = false;
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, context, 2);
        this.M = q2Var;
        q2Var.setText(org.telegram.messenger.cd.L0(2131743468, null));
        org.telegram.ui.ActionBar.a7.V(this.M, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        org.telegram.ui.ActionBar.q2 q2Var2 = this.M;
        int L = org.telegram.messenger.i0.L(16.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        int i13 = org.telegram.ui.ActionBar.t6.Ei;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
        org.telegram.ui.ActionBar.a7.R(q2Var2, org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.a7.N(i12), org.telegram.ui.ActionBar.a7.N(i13), p6Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(org.telegram.messenger.i0.o());
        this.M.setGravity(17);
        this.M.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        addView(this.M, w7.b6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f29229b;

            {
                this.f29229b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i132;
                int i14 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f29229b;
                switch (i14) {
                    case 0:
                        gg ggVar = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, p6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        gg ggVar2 = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.U;
                        if (i15 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.f49420b;
                                int i16 = s0Var.e;
                                if (i16 != org.telegram.messenger.d20.f15147s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i16).O1().u(s0Var.f49421c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i16).P(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i15 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ggVar2 != null) {
                                    j13 = ggVar2.a();
                                }
                                if (org.telegram.messenger.jj.B0(jjVar.f16337k) == j13) {
                                    fragmentContextView.f24046n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.o5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.o5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", jjVar.f1());
                                k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = org.telegram.messenger.d20.f15147s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i122 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!org.telegram.messenger.nd.f(i18).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i18).I.get(0);
                                            j10 = mdVar.f16940a;
                                            i122 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i122 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i122).h(j10));
                                return;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.f18229c));
                                TLRPC.GroupCall groupCall2 = groupCall.f18228b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                            if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                d40Var.H0 = new r0(fragmentContextView, 7);
                                k2Var2.showDialog(d40Var);
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
                                MediaController.B().S(MediaController.B().f14482u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f14482u0, true);
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
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            bi0 bi0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (bi0Var.P(i132)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.f24030a.h(true);
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
        imageView5.setImageResource(2131232255);
        ImageView imageView6 = this.L;
        int i14 = org.telegram.ui.ActionBar.t6.f21296x7;
        org.telegram.ui.ActionBar.a7.t(imageView6, i14, p6Var, mode);
        this.K.addView(this.L, w7.b6.e(20, 20, 17));
        this.K.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var) & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        this.K.setContentDescription(org.telegram.messenger.cd.L0(2131743874, null));
        this.K.setOnClickListener(new bh.c(8));
        this.K.setVisibility(8);
        addView(this.K, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f24048o0) {
            h();
        }
        u8 u8Var = new u8(context, false);
        this.f24033b0 = u8Var;
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(21.0f));
        this.f24033b0.setDelegate(new s00(this, 1));
        this.f24033b0.setVisibility(8);
        addView(this.f24033b0, w7.b6.e(108, 36, 51));
        this.E = new bi0(2131624330, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), true, null);
        y00 y00Var = new y00(this, context);
        this.D = y00Var;
        org.telegram.ui.ActionBar.a7.t(y00Var, org.telegram.ui.ActionBar.t6.A7, p6Var, PorterDuff.Mode.SRC_IN);
        this.D.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var) & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        this.D.setAnimation(this.E);
        this.D.setScaleType(scaleType);
        this.D.setVisibility(8);
        addView(this.D, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.D.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f29229b;

            {
                this.f29229b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i132;
                int i142 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f29229b;
                switch (i142) {
                    case 0:
                        gg ggVar = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, p6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        gg ggVar2 = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.U;
                        if (i15 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.f49420b;
                                int i16 = s0Var.e;
                                if (i16 != org.telegram.messenger.d20.f15147s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i16).O1().u(s0Var.f49421c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i16).P(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i15 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ggVar2 != null) {
                                    j13 = ggVar2.a();
                                }
                                if (org.telegram.messenger.jj.B0(jjVar.f16337k) == j13) {
                                    fragmentContextView.f24046n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.o5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.o5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", jjVar.f1());
                                k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = org.telegram.messenger.d20.f15147s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i122 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!org.telegram.messenger.nd.f(i18).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i18).I.get(0);
                                            j10 = mdVar.f16940a;
                                            i122 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i122 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i122).h(j10));
                                return;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.f18229c));
                                TLRPC.GroupCall groupCall2 = groupCall.f18228b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                            if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                d40Var.H0 = new r0(fragmentContextView, 7);
                                k2Var2.showDialog(d40Var);
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
                                MediaController.B().S(MediaController.B().f14482u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f14482u0, true);
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
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            bi0 bi0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (bi0Var.P(i132)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.f24030a.h(true);
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
        imageView7.setImageResource(2131231982);
        org.telegram.ui.ActionBar.a7.t(this.F, i14, p6Var, mode);
        this.F.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var) & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f29229b;

            {
                this.f29229b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i132;
                int i142 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f29229b;
                switch (i142) {
                    case 0:
                        gg ggVar = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, p6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        gg ggVar2 = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.U;
                        if (i15 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.f49420b;
                                int i16 = s0Var.e;
                                if (i16 != org.telegram.messenger.d20.f15147s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i16).O1().u(s0Var.f49421c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i16).P(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i15 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ggVar2 != null) {
                                    j13 = ggVar2.a();
                                }
                                if (org.telegram.messenger.jj.B0(jjVar.f16337k) == j13) {
                                    fragmentContextView.f24046n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.o5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.o5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", jjVar.f1());
                                k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = org.telegram.messenger.d20.f15147s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i122 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!org.telegram.messenger.nd.f(i18).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i18).I.get(0);
                                            j10 = mdVar.f16940a;
                                            i122 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i122 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i122).h(j10));
                                return;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.f18229c));
                                TLRPC.GroupCall groupCall2 = groupCall.f18228b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                            if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                d40Var.H0 = new r0(fragmentContextView, 7);
                                k2Var2.showDialog(d40Var);
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
                                MediaController.B().S(MediaController.B().f14482u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f14482u0, true);
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
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            bi0 bi0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (bi0Var.P(i132)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.f24030a.h(true);
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
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(getContext(), 18);
        this.f24058w = a5Var;
        addView(a5Var, w7.b6.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f29229b;

            {
                this.f29229b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i132;
                int i142 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f29229b;
                switch (i142) {
                    case 0:
                        gg ggVar = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, p6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        gg ggVar2 = fragmentContextView.f24046n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.f24050q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.U;
                        if (i15 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.f49420b;
                                int i16 = s0Var.e;
                                if (i16 != org.telegram.messenger.d20.f15147s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i16).O1().u(s0Var.f49421c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i16).P(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j13 = 0;
                        if (i15 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ggVar2 != null) {
                                    j13 = ggVar2.a();
                                }
                                if (org.telegram.messenger.jj.B0(jjVar.f16337k) == j13) {
                                    fragmentContextView.f24046n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.o5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.o5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", jjVar.f1());
                                k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = org.telegram.messenger.d20.f15147s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i122 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!org.telegram.messenger.nd.f(i18).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i18).I.get(0);
                                            j10 = mdVar.f16940a;
                                            i122 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i122 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i122).h(j10));
                                return;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.f18229c));
                                TLRPC.GroupCall groupCall2 = groupCall.f18228b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                            if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                d40Var.H0 = new r0(fragmentContextView, 7);
                                k2Var2.showDialog(d40Var);
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
                                MediaController.B().S(MediaController.B().f14482u0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f14482u0, true);
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
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            bi0 bi0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (bi0Var.P(i132)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.f24030a.h(true);
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

    public final void c(boolean z10) {
        int i10;
        gg ggVar = this.f24046n;
        if (ggVar != null) {
            if (!this.T || ((i10 = this.U) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.k2 k2Var = this.h;
                org.telegram.messenger.hz B = k2Var.getSendMessagesHelper().B(ggVar.a());
                View fragmentView = k2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = k2Var.getVisibleDialog();
                if ((j() || ggVar.p() || ((visibleDialog instanceof d40) && !((d40) visibleDialog).I)) && B != null) {
                    B = null;
                }
                e2.f fVar = this.f24056u0;
                if (B == null) {
                    if (this.T && ((z10 && this.U == -1) || this.U == 5)) {
                        this.T = false;
                        if (z10) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                            return;
                        }
                        AnimatorSet animatorSet = this.f24038f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f24038f = null;
                        }
                        fVar.d();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f24038f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f24038f.setDuration(220L);
                        this.f24038f.setInterpolator(gr.f26495f);
                        this.f24038f.addListener(new t00(this, 4));
                        this.f24038f.start();
                        return;
                    }
                    int i11 = this.U;
                    if (i11 == -1 || i11 == 5) {
                        this.T = false;
                        setVisibility(8);
                    }
                } else if (this.U != 5 && this.f24038f != null && !z10) {
                    this.f24064z0 = true;
                } else {
                    r(5);
                    if (z10 && this.S == 0.0f) {
                        setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
                        b10 b10Var = this.f24049p0;
                        if (b10Var != null) {
                            ((wp0) b10Var).b(true);
                            ((wp0) this.f24049p0).b(false);
                        }
                    }
                    if (!this.T) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f24038f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f24038f = null;
                            }
                            fVar.d();
                            this.f24038f = new AnimatorSet();
                            b10 b10Var2 = this.f24049p0;
                            if (b10Var2 != null) {
                                ((wp0) b10Var2).b(true);
                            }
                            this.f24038f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.i0.M(getStyleHeight())));
                            this.f24038f.setDuration(200L);
                            this.f24038f.addListener(new t00(this, 5));
                            this.f24038f.start();
                        }
                        this.T = true;
                        setVisibility(0);
                    }
                    int i12 = this.Q;
                    int i13 = B.f15990l;
                    if (i12 != i13) {
                        this.Q = i13;
                        this.d.b(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("ImportUploading", null, 2131749231, Integer.valueOf(i13))), false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        boolean i10;
        String G;
        String L0;
        TextView nextTextView;
        org.telegram.ui.ActionBar.k2 k2Var = this.h;
        View fragmentView = k2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = k2Var instanceof org.telegram.ui.ay;
        if (z11) {
            if (org.telegram.messenger.nd.g() != 0) {
                i10 = true;
            } else {
                i10 = false;
            }
        } else {
            i10 = org.telegram.messenger.nd.f(k2Var.getCurrentAccount()).i(this.f24046n.a());
        }
        ew ewVar = this.f24055t0;
        if (!i10) {
            this.f24054s0 = -1;
            org.telegram.messenger.i0.r(ewVar);
            if (this.T) {
                this.T = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f24038f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24038f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24038f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f24038f.setDuration(200L);
                this.f24038f.addListener(new t00(this, 0));
                this.f24038f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f24032b.setImageDrawable(new pp0(getContext(), 1));
        if (z10 && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
        }
        if (!this.T) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f24038f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f24038f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f24038f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.i0.M(getStyleHeight())));
                this.f24038f.setDuration(200L);
                this.f24038f.addListener(new t00(this, 1));
                this.f24038f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (z11) {
            String L02 = org.telegram.messenger.cd.L0(2131748850, null);
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < 4; i11++) {
                arrayList.addAll(org.telegram.messenger.nd.f(i11).I);
            }
            if (arrayList.size() == 1) {
                org.telegram.messenger.md mdVar = (org.telegram.messenger.md) arrayList.get(0);
                long B0 = org.telegram.messenger.jj.B0(mdVar.h.f16337k);
                if (org.telegram.messenger.o5.E(B0)) {
                    G = org.telegram.messenger.h20.j(org.telegram.messenger.vp.r1(mdVar.h.I1).Z1(Long.valueOf(B0)), true);
                    L0 = org.telegram.messenger.cd.L0(2131753965, null);
                } else {
                    TLRPC.Chat L03 = org.telegram.messenger.vp.r1(mdVar.h.I1).L0(Long.valueOf(-B0));
                    if (L03 != null) {
                        G = L03.title;
                    } else {
                        G = "";
                    }
                    L0 = org.telegram.messenger.cd.L0(2131753964, null);
                }
            } else {
                G = org.telegram.messenger.cd.G(arrayList.size(), "Chats", new Object[0]);
                L0 = org.telegram.messenger.cd.L0(2131753963, null);
            }
            String format = String.format(L0, L02, G);
            int indexOf = format.indexOf(L02);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            for (int i12 = 0; i12 < 2; i12++) {
                w00 w00Var = this.d;
                if (i12 == 0) {
                    nextTextView = w00Var.getTextView();
                } else {
                    nextTextView = w00Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21224t7, this.f24050q0)), indexOf, L02.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        ewVar.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i12;
        if (i10 == org.telegram.messenger.zs.D4) {
            d(false);
        } else if (i10 == org.telegram.messenger.zs.G2) {
            e(false);
        } else {
            int i13 = org.telegram.messenger.zs.F4;
            gg ggVar = this.f24046n;
            if (i10 == i13) {
                if (ggVar != null) {
                    if (ggVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i10 != org.telegram.messenger.zs.f19622h2 && i10 != org.telegram.messenger.zs.f19616g2 && i10 != org.telegram.messenger.zs.f19610f2 && i10 != org.telegram.messenger.zs.D2) {
                int i14 = org.telegram.messenger.zs.f19706v2;
                if (i10 != i14 && i10 != org.telegram.messenger.zs.f19713w2 && i10 != org.telegram.messenger.zs.F2) {
                    if (i10 == org.telegram.messenger.zs.C2) {
                        b();
                        if (this.T && this.U == 4) {
                            org.telegram.messenger.u3 groupCall = ggVar.getGroupCall();
                            if (groupCall != null && this.e != null) {
                                if (groupCall.j()) {
                                    this.e.b(org.telegram.messenger.cd.W(4, groupCall.f18228b.schedule_date, true), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.f18228b;
                                    int i15 = groupCall2.participants_count;
                                    if (i15 == 0) {
                                        w00 w00Var = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            i12 = 2131743561;
                                        } else {
                                            i12 = 2131748629;
                                        }
                                        w00Var.b(org.telegram.messenger.cd.L0(i12, null), false);
                                    } else {
                                        w00 w00Var2 = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        w00Var2.b(org.telegram.messenger.cd.G(i15, str, new Object[0]), false);
                                    }
                                }
                            }
                            o(true);
                            return;
                        }
                        return;
                    } else if (i10 == org.telegram.messenger.zs.f19705v1) {
                        int i16 = this.U;
                        if (i16 == 1 || i16 == 3 || i16 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i10 == org.telegram.messenger.zs.J4) {
                        q(true);
                        return;
                    } else {
                        int i17 = org.telegram.messenger.zs.N4;
                        lc lcVar = this.f24030a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.t6.G0().a(Math.max(this.M0, this.N0));
                                lcVar.f(Math.max(this.M0, this.N0));
                                return;
                            }
                            return;
                        } else if (i10 == org.telegram.messenger.zs.O4) {
                            b();
                            this.M0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.t6.G0().a(Math.max(this.M0, this.N0));
                                lcVar.f(Math.max(this.M0, this.N0));
                            }
                            this.f24033b0.invalidate();
                            return;
                        } else if (i10 == org.telegram.messenger.zs.f19604e2 && this.U == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.U == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i10 == i14) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.D != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.D.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                    }
                }
            } else {
                int i18 = this.U;
                if (i18 == 1 || i18 == 3 || i18 == 4) {
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
        th.s0 s0Var = th.s0.W;
        e2.f fVar = this.f24056u0;
        int i10 = 0;
        if (s0Var != null) {
            b();
            int i11 = this.U;
            if (6 != i11 && this.f24038f != null && !z10) {
                this.f24061x0 = true;
                return;
            } else if (6 != i11 && this.T && !z10) {
                AnimatorSet animatorSet = this.f24038f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24038f = null;
                }
                fVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24038f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f24038f.setDuration(220L);
                this.f24038f.setInterpolator(gr.f26495f);
                this.f24038f.addListener(new t00(this, 7));
                this.f24038f.start();
                return;
            } else {
                r(6);
                if (!this.T) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f24038f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f24038f = null;
                        }
                        this.f24038f = new AnimatorSet();
                        this.f24057v0.d();
                        this.f24038f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.i0.M(getStyleHeight())));
                        this.f24038f.setDuration(220L);
                        this.f24038f.setInterpolator(gr.f26495f);
                        this.f24038f.addListener(new t00(this, 8));
                        this.f24038f.start();
                    } else {
                        setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
                        n();
                    }
                    this.T = true;
                    setVisibility(0);
                } else {
                    setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
                    setVisibility(0);
                }
            }
        } else {
            boolean z11 = this.T;
            if (z11 && ((z10 && this.U == -1) || this.U == 6)) {
                this.T = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f24038f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f24038f = null;
                    }
                    fVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f24038f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f24038f.setDuration(220L);
                    this.f24038f.setInterpolator(gr.f26495f);
                    this.f24038f.addListener(new t00(this, 6));
                    this.f24038f.start();
                }
            } else if (z11 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        th.s0 s0Var2 = th.s0.W;
        if (s0Var2 != null && this.U == 6) {
            w00 w00Var = this.d;
            TLRPC.GroupCall groupCall = s0Var2.f49426w;
            if (groupCall != null) {
                i10 = groupCall.participants_count;
            }
            w00Var.setText(org.telegram.messenger.cd.H(',', "LiveStoryTopPanelWatching", Math.max(1, i10)));
        }
    }

    public final void f() {
        int i10;
        TLRPC.User user;
        int i11;
        String format;
        TextView nextTextView;
        gg ggVar = this.f24046n;
        if (ggVar != null && this.d != null) {
            b();
            long a2 = ggVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) org.telegram.messenger.nd.f(currentAccount).f17084c.f(a2);
            if (!this.f24052r0) {
                org.telegram.messenger.nd f7 = org.telegram.messenger.nd.f(currentAccount);
                a0.h hVar = f7.G;
                if (hVar.h(a2) < 0) {
                    hVar.k(Boolean.TRUE, a2);
                    TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                    tL_messages_getRecentLocations.peer = f7.getMessagesController().i1(a2);
                    tL_messages_getRecentLocations.limit = 100;
                    f7.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.s4(f7, a2, 1));
                }
                this.f24052r0 = true;
            }
            if (arrayList != null) {
                long e = org.telegram.messenger.d20.i(currentAccount).e();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                user = null;
                i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long C1 = org.telegram.messenger.jj.C1(message.from_id);
                        if (user == null && C1 != e) {
                            user = org.telegram.messenger.vp.r1(currentAccount).Z1(Long.valueOf(C1));
                        }
                        i11++;
                    }
                }
                i10 = 0;
            } else {
                i10 = 0;
                user = null;
                i11 = 0;
            }
            if (this.f24054s0 != i11) {
                this.f24054s0 = i11;
                String L0 = org.telegram.messenger.cd.L0(2131748850, null);
                if (i11 == 0) {
                    format = L0;
                } else {
                    int i13 = i11 - 1;
                    if (org.telegram.messenger.nd.f(currentAccount).i(a2)) {
                        if (i13 != 0) {
                            if (i13 == 1 && user != null) {
                                Object[] objArr = new Object[1];
                                objArr[i10] = org.telegram.messenger.h20.j(user, true);
                                String a02 = org.telegram.messenger.cd.a0("SharingYouAndOtherName", null, 2131745386, objArr);
                                Object[] objArr2 = new Object[2];
                                objArr2[i10] = L0;
                                objArr2[1] = a02;
                                format = String.format("%1$s - %2$s", objArr2);
                            } else {
                                String L02 = org.telegram.messenger.cd.L0(2131752184, null);
                                int i14 = i10;
                                String G = org.telegram.messenger.cd.G(i13, "AndOther", new Object[i14]);
                                Object[] objArr3 = new Object[3];
                                objArr3[i14] = L0;
                                objArr3[1] = L02;
                                objArr3[2] = G;
                                format = String.format("%1$s - %2$s %3$s", objArr3);
                            }
                        } else {
                            String L03 = org.telegram.messenger.cd.L0(2131752184, null);
                            Object[] objArr4 = new Object[2];
                            objArr4[i10] = L0;
                            objArr4[1] = L03;
                            format = String.format("%1$s - %2$s", objArr4);
                        }
                    } else {
                        int i15 = i10;
                        if (i13 != 0) {
                            String j10 = org.telegram.messenger.h20.j(user, true);
                            String G2 = org.telegram.messenger.cd.G(i13, "AndOther", new Object[i15]);
                            Object[] objArr5 = new Object[3];
                            objArr5[i15] = L0;
                            objArr5[1] = j10;
                            objArr5[2] = G2;
                            format = String.format("%1$s - %2$s %3$s", objArr5);
                        } else {
                            String j11 = org.telegram.messenger.h20.j(user, true);
                            Object[] objArr6 = new Object[2];
                            objArr6[i15] = L0;
                            objArr6[1] = j11;
                            format = String.format("%1$s - %2$s", objArr6);
                        }
                    }
                }
                if (!format.equals(this.V)) {
                    this.V = format;
                    int indexOf = format.indexOf(L0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i16 = 0; i16 < 2; i16++) {
                        w00 w00Var = this.d;
                        if (i16 == 0) {
                            nextTextView = w00Var.getTextView();
                        } else {
                            nextTextView = w00Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21224t7, this.f24050q0)), indexOf, L0.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        boolean z12;
        gg ggVar;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z13 = true;
        if (this.T) {
            int i10 = this.U;
            if (i10 != 1 && i10 != 3) {
                if ((i10 == 4 || i10 == 5) && !j()) {
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        boolean z14 = this.T;
        e2.f fVar = this.f24056u0;
        if (jjVar != null && jjVar.f1() != 0 && !org.telegram.messenger.jj.L4(jjVar.f16337k)) {
            b();
            int i11 = this.U;
            if (i11 != 0 && this.f24038f != null && !z11) {
                this.f24063y0 = true;
                return;
            }
            r(0);
            if (z11 && this.S == 0.0f) {
                setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
                b10 b10Var = this.f24049p0;
                if (b10Var != null) {
                    ((wp0) b10Var).b(true);
                    ((wp0) this.f24049p0).b(false);
                }
            }
            if (!this.T) {
                if (!z11) {
                    AnimatorSet animatorSet = this.f24038f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f24038f = null;
                    }
                    fVar.d();
                    this.f24038f = new AnimatorSet();
                    b10 b10Var2 = this.f24049p0;
                    if (b10Var2 != null) {
                        ((wp0) b10Var2).b(true);
                    }
                    this.f24038f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.i0.M(getStyleHeight())));
                    this.f24038f.setDuration(200L);
                    this.f24038f.addListener(new t00(this, 3));
                    this.f24038f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            if (MediaController.B().H()) {
                this.f24034c.a(false, !z11);
                this.f24032b.setContentDescription(org.telegram.messenger.cd.L0(2131754929, null));
            } else {
                this.f24034c.a(true, !z11);
                this.f24032b.setContentDescription(org.telegram.messenger.cd.L0(2131754930, null));
            }
            if (this.R == jjVar && i11 == 0) {
                return;
            }
            this.R = jjVar;
            if (!org.telegram.messenger.jj.R4(jjVar.f16337k) && !this.R.h4()) {
                this.W = true;
                if (this.G != null) {
                    if (jjVar.L0() >= 600.0d) {
                        this.G.setAlpha(1.0f);
                        this.G.setEnabled(true);
                        this.d.setPadding(0, 0, org.telegram.messenger.i0.L(44.0f) + this.N, 0);
                        q(false);
                    } else {
                        this.G.setAlpha(0.0f);
                        this.G.setEnabled(false);
                        this.d.setPadding(0, 0, this.N, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.N, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(jjVar.x1(true), " - ", jjVar.z1(true)));
                for (int i12 = 0; i12 < 2; i12++) {
                    w00 w00Var = this.d;
                    if (i12 == 0) {
                        nextTextView2 = w00Var.getTextView();
                    } else {
                        nextTextView2 = w00Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.W = false;
                org.telegram.ui.ActionBar.t0 t0Var = this.G;
                if (t0Var != null) {
                    t0Var.setAlpha(1.0f);
                    this.G.setEnabled(true);
                }
                this.d.setPadding(0, 0, org.telegram.messenger.i0.L(44.0f) + this.N, 0);
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(jjVar.x1(true), " ", jjVar.z1(true)));
                for (int i13 = 0; i13 < 2; i13++) {
                    w00 w00Var2 = this.d;
                    if (i13 == 0) {
                        nextTextView = w00Var2.getTextView();
                    } else {
                        nextTextView = w00Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21224t7, this.f24050q0)), 0, jjVar.x1(true).length(), 18);
            this.d.b(spannableStringBuilder, (!z11 && z14 && this.W) ? false : false);
            return;
        }
        this.R = null;
        if (this.f24031a0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !g20.c()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!j() && !z12 && (ggVar = this.f24046n) != null && !g20.c()) {
            org.telegram.messenger.u3 groupCall = ggVar.getGroupCall();
            if (groupCall != null && groupCall.y()) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        if (z12) {
            a(false);
        } else if (this.T) {
            org.telegram.ui.ActionBar.t0 t0Var2 = this.G;
            if (t0Var2 != null && t0Var2.x()) {
                this.G.U(null, null);
            }
            this.T = false;
            if (z11) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f24038f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f24038f = null;
            }
            fVar.d();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f24038f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f24038f.setDuration(200L);
            b10 b10Var3 = this.f24049p0;
            if (b10Var3 != null) {
                ((wp0) b10Var3).b(true);
            }
            this.f24038f.addListener(new t00(this, 2));
            this.f24038f.start();
        } else {
            setVisibility(8);
        }
    }

    public lc getCapsuleBlobDrawable() {
        return this.f24030a;
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
        int i10 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.p6 p6Var = this.f24050q0;
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), false, this.f24050q0);
        this.G = t0Var;
        if (t0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.a7.t(this.G.getIconView(), i10, p6Var, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(org.telegram.messenger.i0.L(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(org.telegram.messenger.cd.L0(2131754805, null));
        this.G.setDelegate(new o00(this));
        org.telegram.ui.ActionBar.t0 t0Var2 = this.G;
        jh.g gVar = new jh.g();
        this.H = gVar;
        t0Var2.setIcon(gVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.x0 x0Var = new org.telegram.ui.ActionBar.x0(getContext(), p6Var);
        this.I = x0Var;
        x0Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.r0 z10 = this.G.z(0, 2131232372, org.telegram.messenger.cd.L0(2131745284, null));
        org.telegram.ui.ActionBar.r0[] r0VarArr = this.J;
        r0VarArr[0] = z10;
        r0VarArr[1] = this.G.z(1, 2131232371, org.telegram.messenger.cd.L0(2131745285, null));
        r0VarArr[2] = this.G.z(2, 2131232370, org.telegram.messenger.cd.L0(2131745286, null));
        r0VarArr[3] = this.G.z(3, 2131232369, org.telegram.messenger.cd.L0(2131745288, null));
        r0VarArr[4] = this.G.z(4, 2131232374, org.telegram.messenger.cd.L0(2131745282, null));
        r0VarArr[5] = this.G.z(5, 2131232373, org.telegram.messenger.cd.L0(2131745283, null));
        if (org.telegram.messenger.i0.f16025p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(org.telegram.messenger.i0.L(8.0f));
        addView(this.G, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new sr(4, this, fArr));
        this.G.setOnLongClickListener(new r00(this, 0));
        q(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = this.U;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(org.telegram.messenger.md mdVar) {
        if (mdVar != null) {
            org.telegram.ui.ActionBar.k2 k2Var = this.h;
            if (k2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) k2Var.getParentActivity();
                launchActivity.O0(mdVar.h.I1);
                org.telegram.ui.yb0 yb0Var = new org.telegram.ui.yb0(2);
                yb0Var.H0(mdVar.h);
                yb0Var.N0 = new m4.x0(mdVar, org.telegram.messenger.jj.B0(mdVar.h.f16337k), 3);
                launchActivity.t0(yb0Var);
            }
        }
    }

    public final void l(float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.l(float, float, boolean):void");
    }

    public final void m() {
        xa.n nVar = this.L0;
        if (nVar != null) {
            nVar.a();
            this.L0 = null;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            org.telegram.messenger.vs[] vsVarArr = this.K0;
            org.telegram.messenger.vs vsVar = vsVarArr[i10];
            if (vsVar != null) {
                vsVar.a();
                vsVarArr[i10] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.g gVar = this.O;
        if (gVar != null && gVar.f31437g >= 1.0f) {
            this.O0 = false;
            org.telegram.messenger.i0.h3(new s00(this, 0), 150L);
            return;
        }
        this.O0 = true;
    }

    public final void o(boolean z10) {
        org.telegram.messenger.u3 u3Var;
        int i10;
        TLRPC.User user;
        int e;
        int i11;
        float f7;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f24033b0.f30863a.f30482f) != null) {
            valueAnimator.cancel();
            this.f24033b0.f30863a.f30482f = null;
        }
        t8 t8Var = this.f24033b0.f30863a;
        if (t8Var.f30482f == null) {
            int i12 = this.U;
            int i13 = this.f24047n0;
            gg ggVar = this.f24046n;
            if (i12 == 4) {
                if (ggVar != null) {
                    u3Var = ggVar.getGroupCall();
                    i13 = this.h.getCurrentAccount();
                } else {
                    u3Var = null;
                }
                i10 = i13;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                u3Var = VoIPService.getSharedInstance().groupCall;
                if (ggVar != null) {
                    user = null;
                } else {
                    user = VoIPService.getSharedInstance().getUser();
                }
                i10 = VoIPService.getSharedInstance().getAccount();
            } else {
                u3Var = null;
                i10 = i13;
                user = null;
            }
            int i14 = 0;
            if (u3Var != null) {
                ArrayList arrayList = u3Var.e;
                int size = arrayList.size();
                for (int i15 = 0; i15 < 3; i15++) {
                    if (i15 < size) {
                        this.f24033b0.b(i15, i10, (TLObject) arrayList.get(i15));
                    } else {
                        this.f24033b0.b(i15, i10, null);
                    }
                }
            } else if (user != null) {
                this.f24033b0.b(0, i10, user);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.f24033b0.b(i16, i10, null);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.f24033b0.b(i17, i10, null);
                }
            }
            this.f24033b0.a(z10);
            if (this.U == 4 && u3Var != null) {
                if (!u3Var.f18228b.rtmp_stream) {
                    i14 = Math.min(3, u3Var.e.size());
                }
                if (i14 == 0) {
                    e = 10;
                } else {
                    e = i0.a.e(i14, 1, 24, 52);
                }
                int i18 = e + 3;
                if (z10) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (org.telegram.messenger.i0.L(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - org.telegram.messenger.i0.L(f7);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        gr grVar = gr.f26495f;
                        duration.setInterpolator(grVar);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(grVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                w00 w00Var = this.d;
                float f10 = i18;
                int i20 = 36;
                if (u3Var.j()) {
                    i11 = 90;
                } else {
                    i11 = 36;
                }
                w00Var.setLayoutParams(w7.b6.d(-1, 20.0f, 51, f10, 5.0f, i11, 0.0f));
                w00 w00Var2 = this.e;
                if (u3Var.j()) {
                    i20 = 90;
                }
                w00Var2.setLayoutParams(w7.b6.d(-1, 20.0f, 51, f10, 25.0f, i20, 0.0f));
                return;
            }
            return;
        }
        t8Var.f30483g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i10 = 15;
        if (this.f24048o0) {
            xa.n nVar = new xa.n(org.telegram.messenger.zs.e(), this);
            nVar.e(org.telegram.messenger.zs.D4);
            nVar.e(org.telegram.messenger.zs.F4);
            this.L0 = nVar;
            d(true);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                xa.n nVar2 = new xa.n(org.telegram.messenger.zs.f(i11), this);
                nVar2.e(org.telegram.messenger.zs.f19610f2);
                nVar2.e(org.telegram.messenger.zs.f19616g2);
                nVar2.e(org.telegram.messenger.zs.f19622h2);
                nVar2.e(org.telegram.messenger.zs.f19713w2);
                nVar2.e(org.telegram.messenger.zs.C2);
                nVar2.e(org.telegram.messenger.zs.f19705v1);
                nVar2.e(org.telegram.messenger.zs.G2);
                nVar2.e(org.telegram.messenger.zs.f19604e2);
                this.K0[i11] = nVar2;
                GroupCallMessagesController.getInstance(i11).subscribeToCallMessages(0L, this);
            }
            xa.n nVar3 = new xa.n(org.telegram.messenger.zs.e(), this);
            nVar3.e(org.telegram.messenger.zs.J4);
            nVar3.e(org.telegram.messenger.zs.f19706v2);
            nVar3.e(org.telegram.messenger.zs.D2);
            nVar3.e(org.telegram.messenger.zs.O4);
            nVar3.e(org.telegram.messenger.zs.N4);
            nVar3.e(org.telegram.messenger.zs.F2);
            this.L0 = nVar3;
            if (th.s0.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !g20.c()) {
                a(true);
            } else {
                gg ggVar = this.f24046n;
                if (ggVar != null && this.h.getSendMessagesHelper().B(ggVar.a()) != null && !j()) {
                    c(true);
                } else if (ggVar != null && ggVar.getGroupCall() != null && ggVar.getGroupCall().y() && !g20.c() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    q(false);
                }
            }
        }
        int i12 = this.U;
        if (i12 != 3 && i12 != 1) {
            if (i12 == 4 && !this.f24045l0) {
                this.f24045l0 = true;
                this.m0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.t6.G0().f25254l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            lc lcVar = this.f24030a;
            if (!lcVar.f28083u) {
                lcVar.f28083u = true;
                lcVar.f28082t = SystemClock.elapsedRealtime();
                rf.g.d().a(60, lcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.P != z10 && this.D != null) {
                this.P = z10;
                bi0 bi0Var = this.E;
                if (!z10) {
                    i10 = 29;
                }
                bi0Var.P(i10);
                bi0 bi0Var2 = this.E;
                bi0Var2.N(bi0Var2.f24759f - 1, false, true);
                this.D.invalidate();
            }
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10;
        int i10;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.P;
        lc lcVar = this.f24030a;
        if (z11 != z10) {
            this.P = z10;
            bi0 bi0Var = this.E;
            if (z10) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            bi0Var.P(i10);
            bi0 bi0Var2 = this.E;
            bi0Var2.N(bi0Var2.f24759f - 1, false, true);
            this.D.invalidate();
            org.telegram.ui.ActionBar.t6.G0().c(this.T);
            lcVar.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            org.telegram.ui.ActionBar.t6.G0().a(0.0f);
            lcVar.f(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.y0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f24038f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24038f = null;
        }
        if (this.f24045l0) {
            org.telegram.messenger.i0.r(this.m0);
            this.f24045l0 = false;
        }
        this.T = false;
        this.f24056u0.e();
        this.S = 0.0f;
        m();
        if (!this.f24048o0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.U;
        if (i11 == 3 || i11 == 1) {
            d10 G0 = org.telegram.ui.ActionBar.t6.G0();
            ArrayList arrayList = G0.f25254l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.f25247b;
                G0.f25247b = null;
                G0.f25248c = null;
            }
            lc lcVar = this.f24030a;
            if (lcVar.f28083u) {
                lcVar.f28083u = false;
                rf.g.d().f(lcVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, org.telegram.messenger.i0.M(getStyleHeight()));
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f24058w != null) {
            int i10 = this.U;
            if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
                this.V0++;
                if (!groupCallMessage.isOut()) {
                    this.U0.l(new a10(this.f24058w, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i10 = this.V0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.V0 = i11;
            if (i11 == 0) {
                this.U0.l(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        p();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public final void p() {
        org.telegram.messenger.u3 u3Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.U;
            if (i10 == 1 || i10 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(org.telegram.messenger.cd.L0(2131743418, null), false);
                } else if (sharedInstance.isConference() && (u3Var = sharedInstance.groupCall) != null) {
                    if (u3Var.e.size() <= 1) {
                        this.d.b(org.telegram.messenger.cd.L0(2131751823, null), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.e.size()); i11++) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.o5.s(sharedInstance.getAccount(), org.telegram.messenger.o5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i11)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.cd.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    gg ggVar = this.f24046n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.f18228b.title)) {
                            this.d.b(sharedInstance.groupCall.f18228b.title, false);
                        } else if (ggVar != null && ggVar.g() != null && ggVar.g().f19793id == sharedInstance.getChat().f19793id) {
                            TLRPC.Chat g10 = ggVar.g();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(org.telegram.messenger.cd.L0(2131743474, null), false);
                            } else if (org.telegram.messenger.w3.W(g10)) {
                                this.d.b(org.telegram.messenger.cd.L0(2131743474, null), false);
                            } else {
                                this.d.b(org.telegram.messenger.cd.L0(2131743333, null), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (ggVar != null && ggVar.j() != null && ggVar.j().f19942id == user.f19942id) {
                            this.d.setText(org.telegram.messenger.cd.L0(2131746063, null));
                        } else {
                            this.d.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                        }
                    }
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.H == null) {
            return;
        }
        float C = MediaController.B().C(this.W);
        this.H.n(z10, C);
        updateColors();
        boolean z11 = this.A0;
        int i10 = 0;
        this.A0 = false;
        while (true) {
            org.telegram.ui.ActionBar.r0[] r0VarArr = this.J;
            if (i10 < r0VarArr.length) {
                org.telegram.ui.ActionBar.p6 p6Var = this.f24050q0;
                if (!z11 && Math.abs(C - W0[i10]) < 0.05f) {
                    org.telegram.ui.ActionBar.r0 r0Var = r0VarArr[i10];
                    int i11 = org.telegram.ui.ActionBar.t6.Ei;
                    r0Var.a(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var2 = r0VarArr[i10];
                    int i12 = org.telegram.ui.ActionBar.t6.E8;
                    r0Var2.a(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
                }
                i10++;
            } else {
                this.I.e(z10, C);
                return;
            }
        }
    }

    public final void r(int i10) {
        boolean z10;
        TextView nextTextView;
        int i11;
        int i12;
        boolean z11;
        int i13;
        TextView nextTextView2;
        int i14;
        TextView nextTextView3;
        TextView nextTextView4;
        TextView nextTextView5;
        if (this.U != i10) {
            b();
            int i15 = this.U;
            lc lcVar = this.f24030a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                d10 G0 = org.telegram.ui.ActionBar.t6.G0();
                ArrayList arrayList = G0.f25254l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    G0.d = G0.f25247b;
                    G0.f25247b = null;
                    G0.f25248c = null;
                }
                if (lcVar.f28083u) {
                    lcVar.f28083u = false;
                    rf.g.d().f(lcVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                fe.m mVar = this.U0;
                if (mVar != null) {
                    mVar.l(null, true);
                }
            }
            this.U = i10;
            v00 v00Var = this.f24053s;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            v00Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f24041h0 = false;
            }
            u8 u8Var = this.f24033b0;
            if (u8Var != null) {
                u8Var.setStyle(this.U);
                this.f24033b0.setLayoutParams(w7.b6.e(108, getStyleHeight(), 51));
            }
            this.f24053s.setLayoutParams(w7.b6.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f7 = this.S;
            if (f7 > 0.0f && f7 != org.telegram.messenger.i0.M(getStyleHeight())) {
                setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.f24050q0;
            if (i10 == 6) {
                this.f24060x.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                this.f24053s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.bl, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.cl, p6Var)}));
                this.f24053s.setTag(null);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f24032b.setVisibility(8);
                this.D.setVisibility(8);
                this.f24062y.setVisibility(8);
                this.f24062y.i();
                this.f24033b0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    w00 w00Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = w00Var.getTextView();
                    } else {
                        nextTextView5 = w00Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        org.telegram.ui.ActionBar.a7.V(nextTextView5, org.telegram.ui.ActionBar.t6.A7, p6Var);
                        nextTextView5.setTypeface(org.telegram.messenger.i0.o());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(w7.b6.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i10 == 5) {
                this.f24060x.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                this.f24053s.setBackgroundColor(0);
                this.f24053s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21260v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    w00 w00Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = w00Var2.getTextView();
                    } else {
                        nextTextView4 = w00Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        org.telegram.ui.ActionBar.a7.V(nextTextView4, org.telegram.ui.ActionBar.t6.f21243u7, p6Var);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21243u7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f24032b.setVisibility(8);
                this.D.setVisibility(8);
                this.f24033b0.setVisibility(8);
                this.f24062y.setVisibility(0);
                this.f24062y.d();
                this.F.setContentDescription(org.telegram.messenger.cd.L0(2131754900, null));
                org.telegram.ui.ActionBar.t0 t0Var = this.G;
                if (t0Var != null) {
                    t0Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(w7.b6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.f24060x.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                    this.f24053s.setBackgroundColor(0);
                    this.f24053s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21260v7));
                    this.D.setVisibility(8);
                    this.e.setVisibility(0);
                    for (int i18 = 0; i18 < 2; i18++) {
                        w00 w00Var3 = this.d;
                        if (i18 == 0) {
                            nextTextView3 = w00Var3.getTextView();
                        } else {
                            nextTextView3 = w00Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            org.telegram.ui.ActionBar.a7.V(nextTextView3, org.telegram.ui.ActionBar.t6.f21224t7, p6Var);
                            nextTextView3.setTypeface(org.telegram.messenger.i0.o());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21224t7));
                    this.d.setPadding(0, 0, this.N, 0);
                    this.f24062y.setVisibility(8);
                    this.f24062y.i();
                    gg ggVar = this.f24046n;
                    z12 = (ggVar == null || ggVar.getGroupCall() == null || ggVar.getGroupCall().f18228b == null || !ggVar.getGroupCall().f18228b.rtmp_stream) ? false : false;
                    u8 u8Var2 = this.f24033b0;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    u8Var2.setVisibility(i14);
                    if (this.f24033b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-org.telegram.messenger.i0.L(36.0f));
                        this.e.setTranslationX(-org.telegram.messenger.i0.L(36.0f));
                    }
                    this.F.setVisibility(8);
                    this.f24032b.setVisibility(8);
                    org.telegram.ui.ActionBar.t0 t0Var2 = this.G;
                    if (t0Var2 != null) {
                        t0Var2.setVisibility(8);
                        this.G.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.f24060x.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    u8 u8Var3 = this.f24033b0;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    u8Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f24033b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    y00 y00Var = this.D;
                    if (!hasRtmpStream) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    y00Var.setVisibility(i12);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.P = z11;
                    bi0 bi0Var = this.E;
                    if (z11) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    bi0Var.P(i13);
                    bi0 bi0Var2 = this.E;
                    bi0Var2.N(bi0Var2.f24759f - 1, false, true);
                    this.D.invalidate();
                    this.f24053s.setBackground(null);
                    this.f24053s.setBackgroundColor(0);
                    this.f24062y.setVisibility(8);
                    this.f24062y.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.t6.G0().f25254l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!lcVar.f28083u) {
                        lcVar.f28083u = true;
                        lcVar.f28082t = SystemClock.elapsedRealtime();
                        rf.g.d().a(60, lcVar.F);
                    }
                    invalidate();
                    for (int i19 = 0; i19 < 2; i19++) {
                        w00 w00Var4 = this.d;
                        if (i19 == 0) {
                            nextTextView2 = w00Var4.getTextView();
                        } else {
                            nextTextView2 = w00Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            org.telegram.ui.ActionBar.a7.V(nextTextView2, org.telegram.ui.ActionBar.t6.A7, p6Var);
                            nextTextView2.setTypeface(org.telegram.messenger.i0.o());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.A7));
                    this.F.setVisibility(8);
                    this.f24032b.setVisibility(8);
                    this.e.setVisibility(8);
                    this.M.setVisibility(8);
                    this.d.setLayoutParams(w7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(org.telegram.messenger.i0.L(88.0f), 0, org.telegram.messenger.i0.L(88.0f) + this.N, 0);
                    org.telegram.ui.ActionBar.t0 t0Var3 = this.G;
                    if (t0Var3 != null) {
                        t0Var3.setVisibility(8);
                        this.G.setTag(null);
                    }
                }
            } else {
                this.f24060x.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                this.f24053s.setBackgroundColor(0);
                this.f24053s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21260v7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(0);
                this.f24032b.setVisibility(0);
                this.D.setVisibility(8);
                this.f24062y.setVisibility(8);
                this.f24062y.i();
                this.f24033b0.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    w00 w00Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = w00Var5.getTextView();
                    } else {
                        nextTextView = w00Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        org.telegram.ui.ActionBar.a7.V(nextTextView, org.telegram.ui.ActionBar.t6.f21243u7, p6Var);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21243u7));
                if (i10 == 6) {
                    this.f24032b.setLayoutParams(w7.b6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.b6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setVisibility(8);
                } else if (i10 == 0) {
                    this.f24032b.setLayoutParams(w7.b6.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.b6.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.t0 t0Var4 = this.G;
                    if (t0Var4 != null) {
                        t0Var4.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(org.telegram.messenger.cd.L0(2131754900, null));
                } else {
                    this.f24032b.setLayoutParams(w7.b6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.b6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setContentDescription(org.telegram.messenger.cd.L0(2131754755, null));
                }
            }
        }
    }

    public void setDelegate(b10 b10Var) {
        this.f24049p0 = b10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.R0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.f24053s == null) {
            this.T0 = f7;
            return;
        }
        ImageView imageView = this.f24032b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        ei0 ei0Var = this.f24062y;
        if (ei0Var != null) {
            ei0Var.setTranslationX(f7);
        }
        w00 w00Var = this.d;
        if (w00Var != null) {
            w00Var.setTranslationX(f7);
        }
        w00 w00Var2 = this.e;
        if (w00Var2 != null) {
            w00Var2.setTranslationX(f7);
        }
        u8 u8Var = this.f24033b0;
        if (u8Var != null) {
            u8Var.setTranslationX(f7);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.f24031a0 = z10;
    }

    public void setTopPadding(float f7) {
        this.S = f7;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.S);
        if (i10 == 8) {
            this.P0 = false;
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        TextView nextTextView;
        x41[] x41VarArr;
        TextView nextTextView2;
        lc lcVar = this.f24030a;
        int i11 = lcVar.A;
        if (i11 >= 0) {
            lcVar.E = 1.0f;
            lcVar.a(lc.e(i11));
        }
        if (!i(MediaController.B().C(this.W), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.t6.Ei;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21296x7;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.f24050q0;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        jh.g gVar = this.H;
        if (gVar != null) {
            ((e6) gVar.f10414b).u(w02);
            Paint paint = (Paint) gVar.f10415c;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.G;
        if (t0Var != null) {
            Drawable background = t0Var.getBackground();
            if (background != null && background == this.E0) {
                if (w02 != this.J0) {
                    this.J0 = w02;
                    org.telegram.ui.ActionBar.t6.H1(background, w02 & 436207615, true);
                }
            } else {
                org.telegram.ui.ActionBar.t0 t0Var2 = this.G;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(436207615 & w02, 1, org.telegram.messenger.i0.L(14.0f));
                this.E0 = h02;
                t0Var2.setBackground(h02);
                this.J0 = w02;
            }
        }
        if (this.f24032b != null) {
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21278w7, p6Var);
            if (this.F0 == null || w03 != this.H0) {
                ImageView imageView = this.f24032b;
                this.H0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21296x7, p6Var);
            if (this.G0 == null || w04 != this.I0) {
                ImageView imageView2 = this.F;
                this.I0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.e != null) {
            for (int i12 = 0; i12 < 2; i12++) {
                w00 w00Var = this.e;
                if (i12 == 0) {
                    nextTextView2 = w00Var.getTextView();
                } else {
                    nextTextView2 = w00Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21296x7, p6Var));
                }
            }
        }
        w00 w00Var2 = this.d;
        if (w00Var2 != null) {
            Object tag = w00Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i13 = 0; i13 < 2; i13++) {
                    w00 w00Var3 = this.d;
                    if (i13 == 0) {
                        nextTextView = w00Var3.getTextView();
                    } else {
                        nextTextView = w00Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.t6.w0(intValue, p6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (x41VarArr = (x41[]) ((Spanned) text).getSpans(0, text.length(), x41.class)) != null) {
                            for (x41 x41Var : x41VarArr) {
                                x41Var.f32349b = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21224t7, p6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.k2 k2Var, View view, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f24030a = new lc();
        this.J = new org.telegram.ui.ActionBar.r0[6];
        this.Q = -1;
        this.U = -1;
        this.f24031a0 = true;
        this.f24043j0 = new e6(false, true, true);
        this.m0 = new u00(this);
        this.f24047n0 = org.telegram.messenger.d20.f15147s0;
        this.f24054s0 = -1;
        this.f24055t0 = new ew(this, 2);
        this.f24056u0 = new e2.f(null);
        this.f24057v0 = new e2.f(new int[]{org.telegram.messenger.zs.D});
        this.K0 = new org.telegram.messenger.vs[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new fe.m(new o00(this), gr.h, 450L);
        this.V0 = 0;
        this.f24050q0 = p6Var;
        this.h = k2Var;
        if (k2Var instanceof gg) {
            this.f24046n = (gg) k2Var;
        }
        this.f24051r = view;
        this.T = true;
        this.f24048o0 = z10;
        if (view == null) {
            ((ViewGroup) k2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
