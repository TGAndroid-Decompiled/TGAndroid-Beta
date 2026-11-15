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
public class FragmentContextView extends FrameLayout implements org.telegram.messenger.is, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.z5 {
    public static final float[] X0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public boolean B0;
    public hi.l3 C0;
    public ViewGroup D0;
    public o00 E;
    public long E0;
    public ch0 F;
    public org.telegram.ui.Cells.y F0;
    public ImageView G;
    public PorterDuffColorFilter G0;
    public org.telegram.ui.ActionBar.q0 H;
    public PorterDuffColorFilter H0;
    public eu0 I;
    public int I0;
    public org.telegram.ui.ActionBar.v0 J;
    public int J0;
    public final org.telegram.ui.ActionBar.o0[] K;
    public int K0;
    public FrameLayout L;
    public final org.telegram.messenger.js[] L0;
    public ImageView M;
    public xi.e M0;
    public org.telegram.ui.ActionBar.l2 N;
    public float N0;
    public int O;
    public float O0;
    public org.telegram.ui.Components.voip.n P;
    public boolean P0;
    public boolean Q;
    public boolean Q0;
    public int R;
    public final Paint R0;
    public org.telegram.messenger.gj S;
    public boolean S0;
    public float T;
    public int T0;
    public boolean U;
    public float U0;
    public int V;
    public final te.j V0;
    public String W;
    public int W0;
    public final nc f32555a;
    public boolean f32556a0;
    public ImageView f32557b;
    public boolean f32558b0;
    public ke0 f32559c;
    public w8 f32560c0;
    public m00 d;
    public Paint f32561d0;
    public m00 f32562e;
    public LinearGradient f32563e0;
    public AnimatorSet f32564f;
    public Matrix f32565f0;
    public int f32566g0;
    public final org.telegram.ui.ActionBar.e2 h;
    public TextPaint f32567h0;
    public boolean f32568i0;
    public boolean f32569j0;
    public final g6 f32570k0;
    public dc f32571l0;
    public boolean m0;
    public final qg f32572n;
    public final k00 f32573n0;
    public final int f32574o0;
    public final boolean f32575p0;
    public q00 f32576q0;
    public final View f32577r;
    public final org.telegram.ui.ActionBar.e6 f32578r0;
    public l00 f32579s;
    public boolean f32580s0;
    public int f32581t0;
    public final zj f32582u0;
    public final h2.f f32583v0;
    public bi.v1 f32584w;
    public final h2.f f32585w0;
    public View f32586x;
    public boolean f32587x0;
    public fh0 f32588y;
    public boolean f32589y0;
    public boolean f32590z0;

    public FragmentContextView(Context context, org.telegram.ui.yw ywVar, boolean z10) {
        this(context, ywVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i7 = this.V;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32578r0;
        if (i7 == 4) {
            return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29146t7, e6Var);
        }
        if (i7 != 1 && i7 != 3) {
            return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29166u7, e6Var);
        }
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A7, e6Var);
    }

    public static boolean i(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.05f) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null && org.telegram.messenger.gj.R4(gjVar.f23817k)) {
            return true;
        }
        return false;
    }

    public final void a(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.a(boolean):void");
    }

    public final void b() {
        if (this.f32579s != null) {
            return;
        }
        Context context = getContext();
        l00 l00Var = new l00(this, context);
        this.f32579s = l00Var;
        this.f32571l0 = new dc(l00Var);
        int i7 = org.telegram.messenger.g0.f23609q.x;
        g6 g6Var = this.f32570k0;
        g6Var.N = i7;
        g6Var.B = 0.4f;
        g6Var.setCallback(l00Var);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        addView(this.f32579s, c8.ja.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f32586x = view;
        this.f32579s.addView(view, c8.ja.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f32557b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f32557b;
        int i10 = org.telegram.ui.ActionBar.j6.f29204w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32578r0;
        org.telegram.ui.ActionBar.q6.s(imageView2, i10, e6Var, mode);
        ImageView imageView3 = this.f32557b;
        ke0 ke0Var = new ke0(16);
        this.f32559c = ke0Var;
        imageView3.setImageDrawable(ke0Var);
        this.f32557b.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i10, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        addView(this.f32557b, c8.ja.e(36, 36, 51));
        this.f32557b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f34467b;

            {
                this.f34467b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i11;
                long j3;
                TL_stories.StoryItem u10;
                int i12;
                int i13 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f34467b;
                switch (i13) {
                    case 0:
                        qg qgVar = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744835, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            if (e2Var instanceof org.telegram.ui.yw) {
                                t1Var.U = org.telegram.messenger.hd.M0(2131744837, null);
                            } else {
                                TLRPC.Chat g10 = qgVar.g();
                                TLRPC.User j10 = qgVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744836, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744834, org.telegram.messenger.q10.j(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744841, null), new e00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        qg qgVar2 = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.e1 e1Var = fi.e1.X;
                            if (e1Var != null) {
                                long j11 = e1Var.f11654b;
                                int i15 = e1Var.f11656e;
                                if (i15 != org.telegram.messenger.m10.f24934t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.s1(i15).P1().u(e1Var.f11655c, j11)) != null) {
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
                            org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                            if (e2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new y7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new y7(LaunchActivity.H1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (qgVar2 != null) {
                                    j12 = qgVar2.a();
                                }
                                if (org.telegram.messenger.gj.B0(gjVar.f23817k) == j12) {
                                    fragmentContextView.f32572n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", gjVar.e1());
                                e2Var2.presentFragment(new org.telegram.ui.an(bundle), e2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.m10.f24934t0;
                            if (qgVar2 != null) {
                                j3 = qgVar2.a();
                                i11 = e2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.rd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i17).J.get(0);
                                            j3 = qdVar.f26078a;
                                            i11 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i11 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i11).h(j3));
                                return;
                            } else {
                                e2Var2.showDialog(new bt0(fragmentContextView.getContext(), new e00(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (e2Var2.getParentActivity() != null && (groupCall = qgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = e2Var2.getMessagesController().M0(Long.valueOf(groupCall.f26209c));
                                TLRPC.GroupCall groupCall2 = groupCall.f26208b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(M02, null, false, Boolean.valueOf(z10), e2Var2.getParentActivity(), e2Var2, e2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var2;
                            if (e2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                o30 o30Var = new o30(fragmentContextView.getContext(), null, anVar, e6Var3);
                                o30Var.I0 = new m0(fragmentContextView, 6);
                                e2Var2.showDialog(o30Var);
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
                                MediaController.B().S(MediaController.B().f22377v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22377v0, true);
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
                            org.telegram.ui.ActionBar.j6.G0().c(true);
                            fragmentContextView.f32555a.h(true);
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
        this.f32588y = imageView4;
        imageView4.setScaleType(scaleType);
        this.f32588y.setAutoRepeat(true);
        this.f32588y.f(2131624065, 30, 30, null);
        org.telegram.ui.ActionBar.q6.B(this.f32588y, org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.w0(i10, e6Var)), org.telegram.ui.ActionBar.q6.M(i10), e6Var);
        addView(this.f32588y, c8.ja.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        m00 m00Var = new m00(this, context, context, 0);
        this.d = m00Var;
        addView(m00Var, c8.ja.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        m00 m00Var2 = new m00(this, context, context, 1);
        this.f32562e = m00Var2;
        addView(m00Var2, c8.ja.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.P = nVar;
        nVar.f40796g = 1.0f;
        nVar.f40798j = false;
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(2, context, this);
        this.N = l2Var;
        l2Var.setText(org.telegram.messenger.hd.M0(2131743442, null));
        org.telegram.ui.ActionBar.q6.U(this.N, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        org.telegram.ui.ActionBar.l2 l2Var2 = this.N;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.j6.Hi;
        int w03 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
        org.telegram.ui.ActionBar.q6.Q(l2Var2, org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.q6.M(i11), org.telegram.ui.ActionBar.q6.M(i12), e6Var);
        this.N.setTextSize(1, 14.0f);
        this.N.setTypeface(org.telegram.messenger.g0.o());
        this.N.setGravity(17);
        this.N.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(this.N, c8.ja.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.N.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f34467b;

            {
                this.f34467b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i13 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f34467b;
                switch (i13) {
                    case 0:
                        qg qgVar = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744835, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            if (e2Var instanceof org.telegram.ui.yw) {
                                t1Var.U = org.telegram.messenger.hd.M0(2131744837, null);
                            } else {
                                TLRPC.Chat g10 = qgVar.g();
                                TLRPC.User j10 = qgVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744836, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744834, org.telegram.messenger.q10.j(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744841, null), new e00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        qg qgVar2 = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.e1 e1Var = fi.e1.X;
                            if (e1Var != null) {
                                long j11 = e1Var.f11654b;
                                int i15 = e1Var.f11656e;
                                if (i15 != org.telegram.messenger.m10.f24934t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.s1(i15).P1().u(e1Var.f11655c, j11)) != null) {
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
                            org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                            if (e2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new y7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new y7(LaunchActivity.H1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (qgVar2 != null) {
                                    j12 = qgVar2.a();
                                }
                                if (org.telegram.messenger.gj.B0(gjVar.f23817k) == j12) {
                                    fragmentContextView.f32572n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", gjVar.e1());
                                e2Var2.presentFragment(new org.telegram.ui.an(bundle), e2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.m10.f24934t0;
                            if (qgVar2 != null) {
                                j3 = qgVar2.a();
                                i112 = e2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.rd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i17).J.get(0);
                                            j3 = qdVar.f26078a;
                                            i112 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i112).h(j3));
                                return;
                            } else {
                                e2Var2.showDialog(new bt0(fragmentContextView.getContext(), new e00(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (e2Var2.getParentActivity() != null && (groupCall = qgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = e2Var2.getMessagesController().M0(Long.valueOf(groupCall.f26209c));
                                TLRPC.GroupCall groupCall2 = groupCall.f26208b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(M02, null, false, Boolean.valueOf(z10), e2Var2.getParentActivity(), e2Var2, e2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var2;
                            if (e2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                o30 o30Var = new o30(fragmentContextView.getContext(), null, anVar, e6Var3);
                                o30Var.I0 = new m0(fragmentContextView, 6);
                                e2Var2.showDialog(o30Var);
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
                                MediaController.B().S(MediaController.B().f22377v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22377v0, true);
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
                            org.telegram.ui.ActionBar.j6.G0().c(true);
                            fragmentContextView.f32555a.h(true);
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
        imageView5.setImageResource(2131232257);
        ImageView imageView6 = this.M;
        int i13 = org.telegram.ui.ActionBar.j6.f29223x7;
        org.telegram.ui.ActionBar.q6.s(imageView6, i13, e6Var, mode);
        this.L.addView(this.M, c8.ja.e(20, 20, 17));
        this.L.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.L.setContentDescription(org.telegram.messenger.hd.M0(2131743849, null));
        this.L.setOnClickListener(new bi.o(15));
        this.L.setVisibility(8);
        addView(this.L, c8.ja.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f32575p0) {
            h();
        }
        w8 w8Var = new w8(context, false);
        this.f32560c0 = w8Var;
        w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(21.0f));
        this.f32560c0.setDelegate(new i00(this, 1));
        this.f32560c0.setVisibility(8);
        addView(this.f32560c0, c8.ja.e(108, 36, 51));
        this.F = new ch0(2131624333, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), true, null);
        o00 o00Var = new o00(this, context);
        this.E = o00Var;
        org.telegram.ui.ActionBar.q6.s(o00Var, org.telegram.ui.ActionBar.j6.A7, e6Var, PorterDuff.Mode.SRC_IN);
        this.E.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.E.setAnimation(this.F);
        this.E.setScaleType(scaleType);
        this.E.setVisibility(8);
        addView(this.E, c8.ja.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f34467b;

            {
                this.f34467b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f34467b;
                switch (i132) {
                    case 0:
                        qg qgVar = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744835, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            if (e2Var instanceof org.telegram.ui.yw) {
                                t1Var.U = org.telegram.messenger.hd.M0(2131744837, null);
                            } else {
                                TLRPC.Chat g10 = qgVar.g();
                                TLRPC.User j10 = qgVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744836, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744834, org.telegram.messenger.q10.j(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744841, null), new e00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        qg qgVar2 = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.e1 e1Var = fi.e1.X;
                            if (e1Var != null) {
                                long j11 = e1Var.f11654b;
                                int i15 = e1Var.f11656e;
                                if (i15 != org.telegram.messenger.m10.f24934t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.s1(i15).P1().u(e1Var.f11655c, j11)) != null) {
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
                            org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                            if (e2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new y7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new y7(LaunchActivity.H1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (qgVar2 != null) {
                                    j12 = qgVar2.a();
                                }
                                if (org.telegram.messenger.gj.B0(gjVar.f23817k) == j12) {
                                    fragmentContextView.f32572n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", gjVar.e1());
                                e2Var2.presentFragment(new org.telegram.ui.an(bundle), e2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.m10.f24934t0;
                            if (qgVar2 != null) {
                                j3 = qgVar2.a();
                                i112 = e2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.rd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i17).J.get(0);
                                            j3 = qdVar.f26078a;
                                            i112 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i112).h(j3));
                                return;
                            } else {
                                e2Var2.showDialog(new bt0(fragmentContextView.getContext(), new e00(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (e2Var2.getParentActivity() != null && (groupCall = qgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = e2Var2.getMessagesController().M0(Long.valueOf(groupCall.f26209c));
                                TLRPC.GroupCall groupCall2 = groupCall.f26208b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(M02, null, false, Boolean.valueOf(z10), e2Var2.getParentActivity(), e2Var2, e2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var2;
                            if (e2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                o30 o30Var = new o30(fragmentContextView.getContext(), null, anVar, e6Var3);
                                o30Var.I0 = new m0(fragmentContextView, 6);
                                e2Var2.showDialog(o30Var);
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
                                MediaController.B().S(MediaController.B().f22377v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22377v0, true);
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
                            org.telegram.ui.ActionBar.j6.G0().c(true);
                            fragmentContextView.f32555a.h(true);
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
        org.telegram.ui.ActionBar.q6.s(this.G, i13, e6Var, mode);
        this.G.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.G.setScaleType(scaleType);
        addView(this.G, c8.ja.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f34467b;

            {
                this.f34467b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f34467b;
                switch (i132) {
                    case 0:
                        qg qgVar = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744835, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            if (e2Var instanceof org.telegram.ui.yw) {
                                t1Var.U = org.telegram.messenger.hd.M0(2131744837, null);
                            } else {
                                TLRPC.Chat g10 = qgVar.g();
                                TLRPC.User j10 = qgVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744836, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744834, org.telegram.messenger.q10.j(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744841, null), new e00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        qg qgVar2 = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.e1 e1Var = fi.e1.X;
                            if (e1Var != null) {
                                long j11 = e1Var.f11654b;
                                int i15 = e1Var.f11656e;
                                if (i15 != org.telegram.messenger.m10.f24934t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.s1(i15).P1().u(e1Var.f11655c, j11)) != null) {
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
                            org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                            if (e2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new y7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new y7(LaunchActivity.H1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (qgVar2 != null) {
                                    j12 = qgVar2.a();
                                }
                                if (org.telegram.messenger.gj.B0(gjVar.f23817k) == j12) {
                                    fragmentContextView.f32572n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", gjVar.e1());
                                e2Var2.presentFragment(new org.telegram.ui.an(bundle), e2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.m10.f24934t0;
                            if (qgVar2 != null) {
                                j3 = qgVar2.a();
                                i112 = e2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.rd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i17).J.get(0);
                                            j3 = qdVar.f26078a;
                                            i112 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i112).h(j3));
                                return;
                            } else {
                                e2Var2.showDialog(new bt0(fragmentContextView.getContext(), new e00(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (e2Var2.getParentActivity() != null && (groupCall = qgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = e2Var2.getMessagesController().M0(Long.valueOf(groupCall.f26209c));
                                TLRPC.GroupCall groupCall2 = groupCall.f26208b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(M02, null, false, Boolean.valueOf(z10), e2Var2.getParentActivity(), e2Var2, e2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var2;
                            if (e2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                o30 o30Var = new o30(fragmentContextView.getContext(), null, anVar, e6Var3);
                                o30Var.I0 = new m0(fragmentContextView, 6);
                                e2Var2.showDialog(o30Var);
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
                                MediaController.B().S(MediaController.B().f22377v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22377v0, true);
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
                            org.telegram.ui.ActionBar.j6.G0().c(true);
                            fragmentContextView.f32555a.h(true);
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
        bi.v1 v1Var = new bi.v1(getContext(), 16);
        this.f32584w = v1Var;
        addView(v1Var, c8.ja.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f34467b;

            {
                this.f34467b = this;
            }

            @Override
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i112;
                long j3;
                TL_stories.StoryItem u10;
                int i122;
                int i132 = r2;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.f34467b;
                switch (i132) {
                    case 0:
                        qg qgVar = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.hd.M0(2131744835, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            if (e2Var instanceof org.telegram.ui.yw) {
                                t1Var.U = org.telegram.messenger.hd.M0(2131744837, null);
                            } else {
                                TLRPC.Chat g10 = qgVar.g();
                                TLRPC.User j10 = qgVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744836, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744834, org.telegram.messenger.q10.j(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744841, null), new e00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, e6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.B().q(true, true, false, false);
                        return;
                    case 1:
                        qg qgVar2 = fragmentContextView.f32572n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.f32578r0;
                        org.telegram.ui.ActionBar.e2 e2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.V;
                        if (i14 == 6) {
                            fi.e1 e1Var = fi.e1.X;
                            if (e1Var != null) {
                                long j11 = e1Var.f11654b;
                                int i15 = e1Var.f11656e;
                                if (i15 != org.telegram.messenger.m10.f24934t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i15);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.s1(i15).P1().u(e1Var.f11655c, j11)) != null) {
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
                            org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                            if (e2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new y7(W, e6Var3).show();
                                        return;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new y7(LaunchActivity.H1, e6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (qgVar2 != null) {
                                    j12 = qgVar2.a();
                                }
                                if (org.telegram.messenger.gj.B0(gjVar.f23817k) == j12) {
                                    fragmentContextView.f32572n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    return;
                                }
                                long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
                                Bundle bundle = new Bundle();
                                if (org.telegram.messenger.m5.C(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (org.telegram.messenger.m5.E(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", gjVar.e1());
                                e2Var2.presentFragment(new org.telegram.ui.an(bundle), e2Var2 instanceof org.telegram.ui.an);
                                return;
                            }
                            return;
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i14 == 2) {
                            int i16 = org.telegram.messenger.m10.f24934t0;
                            if (qgVar2 != null) {
                                j3 = qgVar2.a();
                                i112 = e2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i17 = 0; i17 < 4; i17++) {
                                        if (!org.telegram.messenger.rd.f(i17).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i17).J.get(0);
                                            j3 = qdVar.f26078a;
                                            i112 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i112 = i16;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i112).h(j3));
                                return;
                            } else {
                                e2Var2.showDialog(new bt0(fragmentContextView.getContext(), new e00(fragmentContextView), e6Var3));
                                return;
                            }
                        } else if (i14 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i14 == 4) {
                            if (e2Var2.getParentActivity() != null && (groupCall = qgVar2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = e2Var2.getMessagesController().M0(Long.valueOf(groupCall.f26209c));
                                TLRPC.GroupCall groupCall2 = groupCall.f26208b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z10 = true;
                                }
                                org.telegram.ui.Components.voip.c2.l(M02, null, false, Boolean.valueOf(z10), e2Var2.getParentActivity(), e2Var2, e2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i14 == 5) {
                            org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var2;
                            if (e2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                o30 o30Var = new o30(fragmentContextView.getContext(), null, anVar, e6Var3);
                                o30Var.I0 = new m0(fragmentContextView, 6);
                                e2Var2.showDialog(o30Var);
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
                                MediaController.B().S(MediaController.B().f22377v0);
                                return;
                            } else {
                                MediaController.B().R(MediaController.B().f22377v0, true);
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
                            org.telegram.ui.ActionBar.j6.G0().c(true);
                            fragmentContextView.f32555a.h(true);
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
        qg qgVar = this.f32572n;
        if (qgVar != null) {
            if (!this.U || ((i7 = this.V) != 1 && i7 != 3)) {
                b();
                org.telegram.ui.ActionBar.e2 e2Var = this.h;
                org.telegram.messenger.vy B = e2Var.getSendMessagesHelper().B(qgVar.a());
                View fragmentView = e2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = e2Var.getVisibleDialog();
                if ((j() || qgVar.q() || ((visibleDialog instanceof o30) && !((o30) visibleDialog).J)) && B != null) {
                    B = null;
                }
                h2.f fVar = this.f32583v0;
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
                        AnimatorSet animatorSet = this.f32564f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f32564f = null;
                        }
                        fVar.d();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f32564f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f32564f.setDuration(220L);
                        this.f32564f.setInterpolator(er.f34420f);
                        this.f32564f.addListener(new j00(this, 3));
                        this.f32564f.start();
                        return;
                    }
                    int i10 = this.V;
                    if (i10 == -1 || i10 == 5) {
                        this.U = false;
                        setVisibility(8);
                    }
                } else if (this.V != 5 && this.f32564f != null && !z10) {
                    this.A0 = true;
                } else {
                    r(5);
                    if (z10 && this.T == 0.0f) {
                        setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                        q00 q00Var = this.f32576q0;
                        if (q00Var != null) {
                            ((yo0) q00Var).b(true);
                            ((yo0) this.f32576q0).b(false);
                        }
                    }
                    if (!this.U) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f32564f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f32564f = null;
                            }
                            fVar.d();
                            this.f32564f = new AnimatorSet();
                            q00 q00Var2 = this.f32576q0;
                            if (q00Var2 != null) {
                                ((yo0) q00Var2).b(true);
                            }
                            this.f32564f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                            this.f32564f.setDuration(200L);
                            this.f32564f.addListener(new j00(this, 4));
                            this.f32564f.start();
                        }
                        this.U = true;
                        setVisibility(0);
                    }
                    int i11 = this.R;
                    int i12 = B.f27275l;
                    if (i11 != i12) {
                        this.R = i12;
                        this.d.b(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ImportUploading", null, 2131749222, Integer.valueOf(i12))), false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        boolean i7;
        String G;
        String M0;
        TextView nextTextView;
        org.telegram.ui.ActionBar.e2 e2Var = this.h;
        View fragmentView = e2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = e2Var instanceof org.telegram.ui.yw;
        if (z11) {
            if (org.telegram.messenger.rd.g() != 0) {
                i7 = true;
            } else {
                i7 = false;
            }
        } else {
            i7 = org.telegram.messenger.rd.f(e2Var.getCurrentAccount()).i(this.f32572n.a());
        }
        zj zjVar = this.f32582u0;
        if (!i7) {
            this.f32581t0 = -1;
            org.telegram.messenger.g0.r(zjVar);
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
            AnimatorSet animatorSet = this.f32564f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f32564f = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32564f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f32564f.setDuration(200L);
            this.f32564f.addListener(new j00(this, 11));
            this.f32564f.start();
            return;
        }
        b();
        r(2);
        this.f32557b.setImageDrawable(new qo0(getContext(), 1));
        if (z10 && this.T == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        if (!this.U) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f32564f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f32564f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f32564f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                this.f32564f.setDuration(200L);
                this.f32564f.addListener(new j00(this, 0));
                this.f32564f.start();
            }
            this.U = true;
            setVisibility(0);
        }
        if (z11) {
            String M02 = org.telegram.messenger.hd.M0(2131748840, null);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 4; i10++) {
                arrayList.addAll(org.telegram.messenger.rd.f(i10).J);
            }
            if (arrayList.size() == 1) {
                org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) arrayList.get(0);
                long B0 = org.telegram.messenger.gj.B0(qdVar.h.f23817k);
                if (org.telegram.messenger.m5.E(B0)) {
                    G = org.telegram.messenger.q10.j(org.telegram.messenger.np.s1(qdVar.h.K1).a2(Long.valueOf(B0)), true);
                    M0 = org.telegram.messenger.hd.M0(2131753965, null);
                } else {
                    TLRPC.Chat M03 = org.telegram.messenger.np.s1(qdVar.h.K1).M0(Long.valueOf(-B0));
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
                m00 m00Var = this.d;
                if (i11 == 0) {
                    nextTextView = m00Var.getTextView();
                } else {
                    nextTextView = m00Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29146t7, this.f32578r0)), indexOf, M02.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        zjVar.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i11;
        if (i7 == org.telegram.messenger.ns.D4) {
            d(false);
        } else if (i7 == org.telegram.messenger.ns.G2) {
            e(false);
        } else {
            int i12 = org.telegram.messenger.ns.F4;
            qg qgVar = this.f32572n;
            if (i7 == i12) {
                if (qgVar != null) {
                    if (qgVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i7 != org.telegram.messenger.ns.f25506h2 && i7 != org.telegram.messenger.ns.f25500g2 && i7 != org.telegram.messenger.ns.f25494f2 && i7 != org.telegram.messenger.ns.D2) {
                int i13 = org.telegram.messenger.ns.f25588v2;
                if (i7 != i13 && i7 != org.telegram.messenger.ns.f25595w2 && i7 != org.telegram.messenger.ns.F2) {
                    if (i7 == org.telegram.messenger.ns.C2) {
                        b();
                        if (this.U && this.V == 4) {
                            org.telegram.messenger.r3 groupCall = qgVar.getGroupCall();
                            if (groupCall != null && this.f32562e != null) {
                                if (groupCall.j()) {
                                    this.f32562e.b(org.telegram.messenger.hd.W(4, groupCall.f26208b.schedule_date, true), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.f26208b;
                                    int i14 = groupCall2.participants_count;
                                    if (i14 == 0) {
                                        m00 m00Var = this.f32562e;
                                        if (groupCall2.rtmp_stream) {
                                            i11 = 2131743535;
                                        } else {
                                            i11 = 2131748614;
                                        }
                                        m00Var.b(org.telegram.messenger.hd.M0(i11, null), false);
                                    } else {
                                        m00 m00Var2 = this.f32562e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        m00Var2.b(org.telegram.messenger.hd.G(i14, str, new Object[0]), false);
                                    }
                                }
                            }
                            o(true);
                            return;
                        }
                        return;
                    } else if (i7 == org.telegram.messenger.ns.f25587v1) {
                        int i15 = this.V;
                        if (i15 == 1 || i15 == 3 || i15 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i7 == org.telegram.messenger.ns.J4) {
                        q(true);
                        return;
                    } else {
                        int i16 = org.telegram.messenger.ns.N4;
                        nc ncVar = this.f32555a;
                        if (i7 == i16) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.O0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.O0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.j6.G0().a(Math.max(this.N0, this.O0));
                                ncVar.f(Math.max(this.N0, this.O0));
                                return;
                            }
                            return;
                        } else if (i7 == org.telegram.messenger.ns.O4) {
                            b();
                            this.N0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.O0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.j6.G0().a(Math.max(this.N0, this.O0));
                                ncVar.f(Math.max(this.N0, this.O0));
                            }
                            this.f32560c0.invalidate();
                            return;
                        } else if (i7 == org.telegram.messenger.ns.f25488e2 && this.V == 0) {
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
        fi.e1 e1Var = fi.e1.X;
        h2.f fVar = this.f32583v0;
        int i7 = 0;
        if (e1Var != null) {
            b();
            int i10 = this.V;
            if (6 != i10 && this.f32564f != null && !z10) {
                this.f32589y0 = true;
                return;
            } else if (6 != i10 && this.U && !z10) {
                AnimatorSet animatorSet = this.f32564f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f32564f = null;
                }
                fVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f32564f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f32564f.setDuration(220L);
                this.f32564f.setInterpolator(er.f34420f);
                this.f32564f.addListener(new j00(this, 6));
                this.f32564f.start();
                return;
            } else {
                r(6);
                if (!this.U) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f32564f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f32564f = null;
                        }
                        this.f32564f = new AnimatorSet();
                        this.f32585w0.d();
                        this.f32564f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                        this.f32564f.setDuration(220L);
                        this.f32564f.setInterpolator(er.f34420f);
                        this.f32564f.addListener(new j00(this, 7));
                        this.f32564f.start();
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
                    AnimatorSet animatorSet4 = this.f32564f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f32564f = null;
                    }
                    fVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f32564f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f32564f.setDuration(220L);
                    this.f32564f.setInterpolator(er.f34420f);
                    this.f32564f.addListener(new j00(this, 5));
                    this.f32564f.start();
                }
            } else if (z11 && this.V == -1) {
                this.U = false;
                setVisibility(8);
            }
        }
        fi.e1 e1Var2 = fi.e1.X;
        if (e1Var2 != null && this.V == 6) {
            m00 m00Var = this.d;
            TLRPC.GroupCall groupCall = e1Var2.f11661w;
            if (groupCall != null) {
                i7 = groupCall.participants_count;
            }
            m00Var.setText(org.telegram.messenger.hd.H(',', "LiveStoryTopPanelWatching", Math.max(1, i7)));
        }
    }

    public final void f() {
        int i7;
        TLRPC.User user;
        int i10;
        String format;
        TextView nextTextView;
        qg qgVar = this.f32572n;
        if (qgVar != null && this.d != null) {
            b();
            long a10 = qgVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) org.telegram.messenger.rd.f(currentAccount).f26271c.f(a10);
            if (!this.f32580s0) {
                org.telegram.messenger.rd f10 = org.telegram.messenger.rd.f(currentAccount);
                a0.h hVar = f10.H;
                if (hVar.h(a10) < 0) {
                    hVar.k(Boolean.TRUE, a10);
                    TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                    tL_messages_getRecentLocations.peer = f10.getMessagesController().j1(a10);
                    tL_messages_getRecentLocations.limit = 100;
                    f10.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.v4(f10, a10, 1));
                }
                this.f32580s0 = true;
            }
            if (arrayList != null) {
                long e10 = org.telegram.messenger.m10.i(currentAccount).e();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                user = null;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i11);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long B1 = org.telegram.messenger.gj.B1(message.from_id);
                        if (user == null && B1 != e10) {
                            user = org.telegram.messenger.np.s1(currentAccount).a2(Long.valueOf(B1));
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
            if (this.f32581t0 != i10) {
                this.f32581t0 = i10;
                String M0 = org.telegram.messenger.hd.M0(2131748840, null);
                if (i10 == 0) {
                    format = M0;
                } else {
                    int i12 = i10 - 1;
                    if (org.telegram.messenger.rd.f(currentAccount).i(a10)) {
                        if (i12 != 0) {
                            if (i12 == 1 && user != null) {
                                Object[] objArr = new Object[1];
                                objArr[i7] = org.telegram.messenger.q10.j(user, true);
                                String a02 = org.telegram.messenger.hd.a0("SharingYouAndOtherName", null, 2131745368, objArr);
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
                            String j3 = org.telegram.messenger.q10.j(user, true);
                            String G2 = org.telegram.messenger.hd.G(i12, "AndOther", new Object[i14]);
                            Object[] objArr5 = new Object[3];
                            objArr5[i14] = M0;
                            objArr5[1] = j3;
                            objArr5[2] = G2;
                            format = String.format("%1$s - %2$s %3$s", objArr5);
                        } else {
                            String j10 = org.telegram.messenger.q10.j(user, true);
                            Object[] objArr6 = new Object[2];
                            objArr6[i14] = M0;
                            objArr6[1] = j10;
                            format = String.format("%1$s - %2$s", objArr6);
                        }
                    }
                }
                if (!format.equals(this.W)) {
                    this.W = format;
                    int indexOf = format.indexOf(M0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i15 = 0; i15 < 2; i15++) {
                        m00 m00Var = this.d;
                        if (i15 == 0) {
                            nextTextView = m00Var.getTextView();
                        } else {
                            nextTextView = m00Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29146t7, this.f32578r0)), indexOf, M0.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        boolean z12;
        qg qgVar;
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
        org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        boolean z14 = this.U;
        h2.f fVar = this.f32583v0;
        if (gjVar != null && gjVar.e1() != 0 && !org.telegram.messenger.gj.L4(gjVar.f23817k)) {
            b();
            int i10 = this.V;
            if (i10 != 0 && this.f32564f != null && !z11) {
                this.f32590z0 = true;
                return;
            }
            r(0);
            if (z11 && this.T == 0.0f) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                q00 q00Var = this.f32576q0;
                if (q00Var != null) {
                    ((yo0) q00Var).b(true);
                    ((yo0) this.f32576q0).b(false);
                }
            }
            if (!this.U) {
                if (!z11) {
                    AnimatorSet animatorSet = this.f32564f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f32564f = null;
                    }
                    fVar.d();
                    this.f32564f = new AnimatorSet();
                    q00 q00Var2 = this.f32576q0;
                    if (q00Var2 != null) {
                        ((yo0) q00Var2).b(true);
                    }
                    this.f32564f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f32564f.setDuration(200L);
                    this.f32564f.addListener(new j00(this, 2));
                    this.f32564f.start();
                }
                this.U = true;
                setVisibility(0);
            }
            if (MediaController.B().H()) {
                this.f32559c.a(false, !z11);
                this.f32557b.setContentDescription(org.telegram.messenger.hd.M0(2131754929, null));
            } else {
                this.f32559c.a(true, !z11);
                this.f32557b.setContentDescription(org.telegram.messenger.hd.M0(2131754930, null));
            }
            if (this.S == gjVar && i10 == 0) {
                return;
            }
            this.S = gjVar;
            if (!org.telegram.messenger.gj.R4(gjVar.f23817k) && !this.S.h4()) {
                this.f32556a0 = true;
                if (this.H != null) {
                    if (gjVar.L0() >= 600.0d) {
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
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(gjVar.w1(true), " - ", gjVar.y1(true)));
                for (int i11 = 0; i11 < 2; i11++) {
                    m00 m00Var = this.d;
                    if (i11 == 0) {
                        nextTextView2 = m00Var.getTextView();
                    } else {
                        nextTextView2 = m00Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.f32556a0 = false;
                org.telegram.ui.ActionBar.q0 q0Var = this.H;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                    this.H.setEnabled(true);
                }
                this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.O, 0);
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(gjVar.w1(true), " ", gjVar.y1(true)));
                for (int i12 = 0; i12 < 2; i12++) {
                    m00 m00Var2 = this.d;
                    if (i12 == 0) {
                        nextTextView = m00Var2.getTextView();
                    } else {
                        nextTextView = m00Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29146t7, this.f32578r0)), 0, gjVar.w1(true).length(), 18);
            this.d.b(spannableStringBuilder, (!z11 && z14 && this.f32556a0) ? false : false);
            return;
        }
        this.S = null;
        if (this.f32558b0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !s10.d()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!j() && !z12 && (qgVar = this.f32572n) != null && !s10.d()) {
            org.telegram.messenger.r3 groupCall = qgVar.getGroupCall();
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
            AnimatorSet animatorSet2 = this.f32564f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f32564f = null;
            }
            fVar.d();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f32564f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f32564f.setDuration(200L);
            q00 q00Var3 = this.f32576q0;
            if (q00Var3 != null) {
                ((yo0) q00Var3).b(true);
            }
            this.f32564f.addListener(new j00(this, 1));
            this.f32564f.start();
        } else {
            setVisibility(8);
        }
    }

    public nc getCapsuleBlobDrawable() {
        return this.f32555a;
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
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32578r0;
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), false, this.f32578r0);
        this.H = q0Var;
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.q6.s(this.H.getIconView(), i7, e6Var, PorterDuff.Mode.SRC_IN);
        }
        this.H.setAdditionalYOffset(org.telegram.messenger.g0.L(30.0f));
        this.H.setLongClickEnabled(false);
        this.H.setVisibility(8);
        this.H.setTag(null);
        this.H.setShowSubmenuByMove(false);
        this.H.setContentDescription(org.telegram.messenger.hd.M0(2131754805, null));
        this.H.setDelegate(new e00(this));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
        eu0 eu0Var = new eu0();
        this.I = eu0Var;
        q0Var2.setIcon(eu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), e6Var);
        this.J = v0Var;
        v0Var.setRoundRadiusDp(6.0f);
        this.J.setDrawShadow(true);
        this.J.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.o0 A = this.H.A(0, 2131232374, org.telegram.messenger.hd.M0(2131745266, null));
        org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
        o0VarArr[0] = A;
        o0VarArr[1] = this.H.A(1, 2131232373, org.telegram.messenger.hd.M0(2131745267, null));
        o0VarArr[2] = this.H.A(2, 2131232372, org.telegram.messenger.hd.M0(2131745268, null));
        o0VarArr[3] = this.H.A(3, 2131232371, org.telegram.messenger.hd.M0(2131745270, null));
        o0VarArr[4] = this.H.A(4, 2131232376, org.telegram.messenger.hd.M0(2131745264, null));
        o0VarArr[5] = this.H.A(5, 2131232375, org.telegram.messenger.hd.M0(2131745265, null));
        if (org.telegram.messenger.g0.f23608p >= 3.0f) {
            this.H.setPadding(0, 1, 0, 0);
        }
        this.H.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        addView(this.H, c8.ja.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.H.setOnClickListener(new n2(18, this, fArr));
        this.H.setOnLongClickListener(new h00(this, 0));
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

    public final void k(org.telegram.messenger.qd qdVar) {
        if (qdVar != null) {
            org.telegram.ui.ActionBar.e2 e2Var = this.h;
            if (e2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) e2Var.getParentActivity();
                launchActivity.O0(qdVar.h.K1);
                org.telegram.ui.pa0 pa0Var = new org.telegram.ui.pa0(2);
                pa0Var.G0(qdVar.h);
                pa0Var.H0 = new ai.c0(qdVar, org.telegram.messenger.gj.B0(qdVar.h.f23817k), 5);
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
            org.telegram.messenger.js[] jsVarArr = this.L0;
            org.telegram.messenger.js jsVar = jsVarArr[i7];
            if (jsVar != null) {
                jsVar.b();
                jsVarArr[i7] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.n nVar = this.P;
        if (nVar != null && nVar.f40796g >= 1.0f) {
            this.P0 = false;
            org.telegram.messenger.g0.i3(new i00(this, 0), 150L);
            return;
        }
        this.P0 = true;
    }

    public final void o(boolean z10) {
        org.telegram.messenger.r3 r3Var;
        int i7;
        TLRPC.User user;
        int v;
        int i10;
        float f10;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f32560c0.f41311a.f40327f) != null) {
            valueAnimator.cancel();
            this.f32560c0.f41311a.f40327f = null;
        }
        v8 v8Var = this.f32560c0.f41311a;
        if (v8Var.f40327f == null) {
            int i11 = this.V;
            int i12 = this.f32574o0;
            qg qgVar = this.f32572n;
            if (i11 == 4) {
                if (qgVar != null) {
                    r3Var = qgVar.getGroupCall();
                    i12 = this.h.getCurrentAccount();
                } else {
                    r3Var = null;
                }
                i7 = i12;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                r3Var = VoIPService.getSharedInstance().groupCall;
                if (qgVar != null) {
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
                ArrayList arrayList = r3Var.f26210e;
                int size = arrayList.size();
                for (int i14 = 0; i14 < 3; i14++) {
                    if (i14 < size) {
                        this.f32560c0.b(i14, i7, (TLObject) arrayList.get(i14));
                    } else {
                        this.f32560c0.b(i14, i7, null);
                    }
                }
            } else if (user != null) {
                this.f32560c0.b(0, i7, user);
                for (int i15 = 1; i15 < 3; i15++) {
                    this.f32560c0.b(i15, i7, null);
                }
            } else {
                for (int i16 = 0; i16 < 3; i16++) {
                    this.f32560c0.b(i16, i7, null);
                }
            }
            this.f32560c0.a(z10);
            if (this.V == 4 && r3Var != null) {
                if (!r3Var.f26208b.rtmp_stream) {
                    i13 = Math.min(3, r3Var.f26210e.size());
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
                        this.f32562e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        er erVar = er.f34420f;
                        duration.setInterpolator(erVar);
                        this.f32562e.animate().translationX(0.0f).setDuration(220L).setInterpolator(erVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.f32562e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.f32562e.setTranslationX(0.0f);
                }
                m00 m00Var = this.d;
                float f11 = i17;
                int i19 = 36;
                if (r3Var.j()) {
                    i10 = 90;
                } else {
                    i10 = 36;
                }
                m00Var.setLayoutParams(c8.ja.d(-1, 20.0f, 51, f11, 5.0f, i10, 0.0f));
                m00 m00Var2 = this.f32562e;
                if (r3Var.j()) {
                    i19 = 90;
                }
                m00Var2.setLayoutParams(c8.ja.d(-1, 20.0f, 51, f11, 25.0f, i19, 0.0f));
                return;
            }
            return;
        }
        v8Var.f40328g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i7 = 15;
        if (this.f32575p0) {
            xi.e eVar = new xi.e(org.telegram.messenger.ns.e(), this);
            eVar.c(org.telegram.messenger.ns.D4);
            eVar.c(org.telegram.messenger.ns.F4);
            this.M0 = eVar;
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                xi.e eVar2 = new xi.e(org.telegram.messenger.ns.f(i10), this);
                eVar2.c(org.telegram.messenger.ns.f25494f2);
                eVar2.c(org.telegram.messenger.ns.f25500g2);
                eVar2.c(org.telegram.messenger.ns.f25506h2);
                eVar2.c(org.telegram.messenger.ns.f25595w2);
                eVar2.c(org.telegram.messenger.ns.C2);
                eVar2.c(org.telegram.messenger.ns.f25587v1);
                eVar2.c(org.telegram.messenger.ns.G2);
                eVar2.c(org.telegram.messenger.ns.f25488e2);
                this.L0[i10] = eVar2;
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            xi.e eVar3 = new xi.e(org.telegram.messenger.ns.e(), this);
            eVar3.c(org.telegram.messenger.ns.J4);
            eVar3.c(org.telegram.messenger.ns.f25588v2);
            eVar3.c(org.telegram.messenger.ns.D2);
            eVar3.c(org.telegram.messenger.ns.O4);
            eVar3.c(org.telegram.messenger.ns.N4);
            eVar3.c(org.telegram.messenger.ns.F2);
            this.M0 = eVar3;
            if (fi.e1.X != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !s10.d()) {
                a(true);
            } else {
                qg qgVar = this.f32572n;
                if (qgVar != null && this.h.getSendMessagesHelper().B(qgVar.a()) != null && !j()) {
                    c(true);
                } else if (qgVar != null && qgVar.getGroupCall() != null && qgVar.getGroupCall().y() && !s10.d() && !j()) {
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
                this.f32573n0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.j6.G0().f39131l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            nc ncVar = this.f32555a;
            if (!ncVar.f37546u) {
                ncVar.f37546u = true;
                ncVar.f37545t = SystemClock.elapsedRealtime();
                bg.k.d().a(60, ncVar.F);
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
                    i7 = 29;
                }
                ch0Var.P(i7);
                ch0 ch0Var2 = this.F;
                ch0Var2.N(ch0Var2.f33579f - 1, false, true);
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
        nc ncVar = this.f32555a;
        if (z11 != z10) {
            this.Q = z10;
            ch0 ch0Var = this.F;
            if (z10) {
                i7 = 15;
            } else {
                i7 = 29;
            }
            ch0Var.P(i7);
            ch0 ch0Var2 = this.F;
            ch0Var2.N(ch0Var2.f33579f - 1, false, true);
            this.E.invalidate();
            org.telegram.ui.ActionBar.j6.G0().c(this.U);
            ncVar.h(this.U);
        }
        if (this.Q) {
            this.O0 = 0.0f;
            org.telegram.ui.ActionBar.j6.G0().a(0.0f);
            ncVar.f(0.0f);
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
        AnimatorSet animatorSet = this.f32564f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32564f = null;
        }
        if (this.m0) {
            org.telegram.messenger.g0.r(this.f32573n0);
            this.m0 = false;
        }
        this.U = false;
        this.f32583v0.e();
        this.T = 0.0f;
        m();
        if (!this.f32575p0) {
            for (int i7 = 0; i7 < 4; i7++) {
                GroupCallMessagesController.getInstance(i7).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i10 = this.V;
        if (i10 == 3 || i10 == 1) {
            s00 G0 = org.telegram.ui.ActionBar.j6.G0();
            ArrayList arrayList = G0.f39131l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.f39123b;
                G0.f39123b = null;
                G0.f39124c = null;
            }
            nc ncVar = this.f32555a;
            if (ncVar.f37546u) {
                ncVar.f37546u = false;
                bg.k.d().f(ncVar.F);
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
        if (this.f32584w != null) {
            int i7 = this.V;
            if ((i7 == 1 || i7 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
                this.W0++;
                if (!groupCallMessage.isOut()) {
                    this.V0.f(new p00(this.f32584w, groupCallMessage), true);
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
        org.telegram.messenger.r3 r3Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i7 = this.V;
            if (i7 == 1 || i7 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(org.telegram.messenger.hd.M0(2131743392, null), false);
                } else if (sharedInstance.isConference() && (r3Var = sharedInstance.groupCall) != null) {
                    if (r3Var.f26210e.size() <= 1) {
                        this.d.b(org.telegram.messenger.hd.M0(2131751823, null), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.f26210e.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.m5.s(sharedInstance.getAccount(), org.telegram.messenger.m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.f26210e.get(i10)).peer)));
                    }
                    if (sharedInstance.groupCall.f26210e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.hd.G(sharedInstance.groupCall.f26210e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    qg qgVar = this.f32572n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.f26208b.title)) {
                            this.d.b(sharedInstance.groupCall.f26208b.title, false);
                        } else if (qgVar != null && qgVar.g() != null && qgVar.g().f28051id == sharedInstance.getChat().f28051id) {
                            TLRPC.Chat g10 = qgVar.g();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(org.telegram.messenger.hd.M0(2131743448, null), false);
                            } else if (org.telegram.messenger.t3.W(g10)) {
                                this.d.b(org.telegram.messenger.hd.M0(2131743448, null), false);
                            } else {
                                this.d.b(org.telegram.messenger.hd.M0(2131743307, null), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (qgVar != null && qgVar.j() != null && qgVar.j().f28200id == user.f28200id) {
                            this.d.setText(org.telegram.messenger.hd.M0(2131746046, null));
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
        float C = MediaController.B().C(this.f32556a0);
        this.I.b(z10, C);
        updateColors();
        boolean z11 = this.B0;
        int i7 = 0;
        this.B0 = false;
        while (true) {
            org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
            if (i7 < o0VarArr.length) {
                org.telegram.ui.ActionBar.e6 e6Var = this.f32578r0;
                if (!z11 && Math.abs(C - X0[i7]) < 0.05f) {
                    org.telegram.ui.ActionBar.o0 o0Var = o0VarArr[i7];
                    int i10 = org.telegram.ui.ActionBar.j6.Hi;
                    o0Var.a(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
                } else {
                    org.telegram.ui.ActionBar.o0 o0Var2 = o0VarArr[i7];
                    int i11 = org.telegram.ui.ActionBar.j6.E8;
                    o0Var2.a(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
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
            nc ncVar = this.f32555a;
            boolean z12 = true;
            if (i14 == 3 || i14 == 1) {
                s00 G0 = org.telegram.ui.ActionBar.j6.G0();
                ArrayList arrayList = G0.f39131l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    G0.d = G0.f39123b;
                    G0.f39123b = null;
                    G0.f39124c = null;
                }
                if (ncVar.f37546u) {
                    ncVar.f37546u = false;
                    bg.k.d().f(ncVar.F);
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
            l00 l00Var = this.f32579s;
            if (i7 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            l00Var.setWillNotDraw(z10);
            if (i7 != 4) {
                this.f32568i0 = false;
            }
            w8 w8Var = this.f32560c0;
            if (w8Var != null) {
                w8Var.setStyle(this.V);
                this.f32560c0.setLayoutParams(c8.ja.e(108, getStyleHeight(), 51));
            }
            this.f32579s.setLayoutParams(c8.ja.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f10 = this.T;
            if (f10 > 0.0f && f10 != org.telegram.messenger.g0.M(getStyleHeight())) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.f32578r0;
            if (i7 == 6) {
                this.f32586x.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                this.f32579s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.el, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.fl, e6Var)}));
                this.f32579s.setTag(null);
                this.f32562e.setVisibility(8);
                this.N.setVisibility(8);
                this.G.setVisibility(8);
                this.f32557b.setVisibility(8);
                this.E.setVisibility(8);
                this.f32588y.setVisibility(8);
                this.f32588y.i();
                this.f32560c0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.A7));
                for (int i15 = 0; i15 < 2; i15++) {
                    m00 m00Var = this.d;
                    if (i15 == 0) {
                        nextTextView5 = m00Var.getTextView();
                    } else {
                        nextTextView5 = m00Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        org.telegram.ui.ActionBar.q6.U(nextTextView5, org.telegram.ui.ActionBar.j6.A7, e6Var);
                        nextTextView5.setTypeface(org.telegram.messenger.g0.o());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(c8.ja.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i7 == 5) {
                this.f32586x.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                this.f32579s.setBackgroundColor(0);
                this.f32579s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29185v7));
                for (int i16 = 0; i16 < 2; i16++) {
                    m00 m00Var2 = this.d;
                    if (i16 == 0) {
                        nextTextView4 = m00Var2.getTextView();
                    } else {
                        nextTextView4 = m00Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        org.telegram.ui.ActionBar.q6.U(nextTextView4, org.telegram.ui.ActionBar.j6.f29166u7, e6Var);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29166u7));
                this.f32562e.setVisibility(8);
                this.N.setVisibility(8);
                this.G.setVisibility(8);
                this.f32557b.setVisibility(8);
                this.E.setVisibility(8);
                this.f32560c0.setVisibility(8);
                this.f32588y.setVisibility(0);
                this.f32588y.d();
                this.G.setContentDescription(org.telegram.messenger.hd.M0(2131754900, null));
                org.telegram.ui.ActionBar.q0 q0Var = this.H;
                if (q0Var != null) {
                    q0Var.setVisibility(8);
                    this.H.setTag(null);
                }
                this.d.setLayoutParams(c8.ja.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i7 != 0 && i7 != 2) {
                if (i7 == 4) {
                    this.f32586x.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                    this.f32579s.setBackgroundColor(0);
                    this.f32579s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29185v7));
                    this.E.setVisibility(8);
                    this.f32562e.setVisibility(0);
                    for (int i17 = 0; i17 < 2; i17++) {
                        m00 m00Var3 = this.d;
                        if (i17 == 0) {
                            nextTextView3 = m00Var3.getTextView();
                        } else {
                            nextTextView3 = m00Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            org.telegram.ui.ActionBar.q6.U(nextTextView3, org.telegram.ui.ActionBar.j6.f29146t7, e6Var);
                            nextTextView3.setTypeface(org.telegram.messenger.g0.o());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29146t7));
                    this.d.setPadding(0, 0, this.O, 0);
                    this.f32588y.setVisibility(8);
                    this.f32588y.i();
                    qg qgVar = this.f32572n;
                    z12 = (qgVar == null || qgVar.getGroupCall() == null || qgVar.getGroupCall().f26208b == null || !qgVar.getGroupCall().f26208b.rtmp_stream) ? false : false;
                    w8 w8Var2 = this.f32560c0;
                    if (!z12) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    w8Var2.setVisibility(i13);
                    if (this.f32560c0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                        this.f32562e.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                    }
                    this.G.setVisibility(8);
                    this.f32557b.setVisibility(8);
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                        this.H.setTag(null);
                    }
                } else if (i7 == 1 || i7 == 3) {
                    this.f32586x.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    w8 w8Var3 = this.f32560c0;
                    if (!hasRtmpStream) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w8Var3.setVisibility(i10);
                    if (i7 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f32560c0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.f32562e.setTranslationX(0.0f);
                    }
                    o00 o00Var = this.E;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    o00Var.setVisibility(i11);
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
                    ch0Var2.N(ch0Var2.f33579f - 1, false, true);
                    this.E.invalidate();
                    this.f32579s.setBackground(null);
                    this.f32579s.setBackgroundColor(0);
                    this.f32588y.setVisibility(8);
                    this.f32588y.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.j6.G0().f39131l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!ncVar.f37546u) {
                        ncVar.f37546u = true;
                        ncVar.f37545t = SystemClock.elapsedRealtime();
                        bg.k.d().a(60, ncVar.F);
                    }
                    invalidate();
                    for (int i18 = 0; i18 < 2; i18++) {
                        m00 m00Var4 = this.d;
                        if (i18 == 0) {
                            nextTextView2 = m00Var4.getTextView();
                        } else {
                            nextTextView2 = m00Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            org.telegram.ui.ActionBar.q6.U(nextTextView2, org.telegram.ui.ActionBar.j6.A7, e6Var);
                            nextTextView2.setTypeface(org.telegram.messenger.g0.o());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.A7));
                    this.G.setVisibility(8);
                    this.f32557b.setVisibility(8);
                    this.f32562e.setVisibility(8);
                    this.N.setVisibility(8);
                    this.d.setLayoutParams(c8.ja.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(org.telegram.messenger.g0.L(88.0f), 0, org.telegram.messenger.g0.L(88.0f) + this.O, 0);
                    org.telegram.ui.ActionBar.q0 q0Var3 = this.H;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                        this.H.setTag(null);
                    }
                }
            } else {
                this.f32586x.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                this.f32579s.setBackgroundColor(0);
                this.f32579s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29185v7));
                this.f32562e.setVisibility(8);
                this.N.setVisibility(8);
                this.G.setVisibility(0);
                this.f32557b.setVisibility(0);
                this.E.setVisibility(8);
                this.f32588y.setVisibility(8);
                this.f32588y.i();
                this.f32560c0.setVisibility(8);
                for (int i19 = 0; i19 < 2; i19++) {
                    m00 m00Var5 = this.d;
                    if (i19 == 0) {
                        nextTextView = m00Var5.getTextView();
                    } else {
                        nextTextView = m00Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        org.telegram.ui.ActionBar.q6.U(nextTextView, org.telegram.ui.ActionBar.j6.f29166u7, e6Var);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29166u7));
                if (i7 == 6) {
                    this.f32557b.setLayoutParams(c8.ja.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.ja.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.G.setVisibility(8);
                } else if (i7 == 0) {
                    this.f32557b.setLayoutParams(c8.ja.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.ja.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.q0 q0Var4 = this.H;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(0);
                        this.H.setTag(1);
                    }
                    this.G.setContentDescription(org.telegram.messenger.hd.M0(2131754900, null));
                } else {
                    this.f32557b.setLayoutParams(c8.ja.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.ja.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.G.setContentDescription(org.telegram.messenger.hd.M0(2131754755, null));
                }
            }
        }
    }

    public void setDelegate(q00 q00Var) {
        this.f32576q0 = q00Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.S0 = z10;
    }

    public void setLeftMargin(float f10) {
        if (this.f32579s == null) {
            this.U0 = f10;
            return;
        }
        ImageView imageView = this.f32557b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        fh0 fh0Var = this.f32588y;
        if (fh0Var != null) {
            fh0Var.setTranslationX(f10);
        }
        m00 m00Var = this.d;
        if (m00Var != null) {
            m00Var.setTranslationX(f10);
        }
        m00 m00Var2 = this.f32562e;
        if (m00Var2 != null) {
            m00Var2.setTranslationX(f10);
        }
        w8 w8Var = this.f32560c0;
        if (w8Var != null) {
            w8Var.setTranslationX(f10);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.D0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.f32558b0 = z10;
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
        y31[] y31VarArr;
        TextView nextTextView2;
        nc ncVar = this.f32555a;
        int i10 = ncVar.A;
        if (i10 >= 0) {
            ncVar.E = 1.0f;
            ncVar.a(nc.e(i10));
        }
        if (!i(MediaController.B().C(this.f32556a0), 1.0f)) {
            i7 = org.telegram.ui.ActionBar.j6.Hi;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f29223x7;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f32578r0;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        eu0 eu0Var = this.I;
        if (eu0Var != null) {
            eu0Var.f34437a.u(w02);
            Paint paint = eu0Var.f34438b;
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
                    org.telegram.ui.ActionBar.j6.H1(background, w02 & 436207615, true);
                }
            } else {
                org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(436207615 & w02, 1, org.telegram.messenger.g0.L(14.0f));
                this.F0 = h02;
                q0Var2.setBackground(h02);
                this.K0 = w02;
            }
        }
        if (this.f32557b != null) {
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29204w7, e6Var);
            if (this.G0 == null || w03 != this.I0) {
                ImageView imageView = this.f32557b;
                this.I0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.G != null) {
            int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29223x7, e6Var);
            if (this.H0 == null || w04 != this.J0) {
                ImageView imageView2 = this.G;
                this.J0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.H0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.f32562e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                m00 m00Var = this.f32562e;
                if (i11 == 0) {
                    nextTextView2 = m00Var.getTextView();
                } else {
                    nextTextView2 = m00Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29223x7, e6Var));
                }
            }
        }
        m00 m00Var2 = this.d;
        if (m00Var2 != null) {
            Object tag = m00Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    m00 m00Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = m00Var3.getTextView();
                    } else {
                        nextTextView = m00Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(intValue, e6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (y31VarArr = (y31[]) ((Spanned) text).getSpans(0, text.length(), y31.class)) != null) {
                            for (y31 y31Var : y31VarArr) {
                                y31Var.f41865b = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29146t7, e6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.e2 e2Var, View view, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32555a = new nc();
        this.K = new org.telegram.ui.ActionBar.o0[6];
        this.R = -1;
        this.V = -1;
        this.f32558b0 = true;
        this.f32570k0 = new g6(false, true, true);
        this.f32573n0 = new k00(this);
        this.f32574o0 = org.telegram.messenger.m10.f24934t0;
        this.f32581t0 = -1;
        this.f32582u0 = new zj(this, 7);
        this.f32583v0 = new h2.f((int[]) null);
        this.f32585w0 = new h2.f(new int[]{org.telegram.messenger.ns.D});
        this.L0 = new org.telegram.messenger.js[4];
        this.R0 = new Paint(1);
        this.T0 = 0;
        this.V0 = new te.j(new e00(this), er.h, 450L);
        this.W0 = 0;
        this.f32578r0 = e6Var;
        this.h = e2Var;
        if (e2Var instanceof qg) {
            this.f32572n = (qg) e2Var;
        }
        this.f32577r = view;
        this.U = true;
        this.f32575p0 = z10;
        if (view == null) {
            ((ViewGroup) e2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
