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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.LaunchActivity;
public class FragmentContextView extends FrameLayout implements jm7, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, vlb {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public hg5 B0;
    public ViewGroup C0;
    public long D0;
    public p09 E;
    public fg0 E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public r7 G;
    public PorterDuffColorFilter G0;
    public dna H;
    public int H0;
    public v7 I;
    public int I0;
    public final p7[] J;
    public int J0;
    public FrameLayout K;
    public final km7[] K0;
    public ImageView L;
    public e7a L0;
    public ey0 M;
    public float M0;
    public int N;
    public float N0;
    public ef1 O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public k47 R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final m99 U0;
    public String V;
    public int V0;
    public boolean W;
    public final cc1 a;
    public boolean a0;
    public ImageView b;
    public hd0 b0;
    public ae8 c;
    public Paint c0;
    public pp4 d;
    public LinearGradient d0;
    public pp4 e;
    public Matrix e0;
    public AnimatorSet f;
    public int f0;
    public TextPaint g0;
    public final org.telegram.ui.ActionBar.d h;
    public boolean h0;
    public boolean i0;
    public final ho j0;
    public u51 k0;
    public boolean l0;
    public final np4 m0;
    public final f02 n;
    public final int n0;
    public final boolean o0;
    public tp4 p0;
    public final ylb q0;
    public op4 r;
    public boolean r0;
    public a6 s;
    public int s0;
    public final o04 t0;
    public final po u0;
    public final po v0;
    public View w;
    public boolean w0;
    public s09 x;
    public boolean x0;
    public rp4 y;
    public boolean y0;
    public boolean z0;

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.d dVar, FrameLayout frameLayout, boolean z, ylb ylbVar) {
        super(context);
        this.a = new cc1();
        this.J = new p7[6];
        this.Q = -1;
        this.U = -1;
        this.a0 = true;
        this.j0 = new ho(false, true, true);
        this.m0 = new np4(this);
        this.n0 = z8c.t0;
        this.s0 = -1;
        this.t0 = new o04(this, (byte) 7);
        this.u0 = new po(null);
        this.v0 = new po(new int[]{nm7.C});
        this.K0 = new km7[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new m99(new ip4(this), d53.h, 450L);
        this.V0 = 0;
        this.q0 = ylbVar;
        this.h = dVar;
        if (dVar instanceof f02) {
            this.n = (f02) dVar;
        }
        this.T = true;
        this.o0 = z;
        if (frameLayout == null) {
            ((ViewGroup) dVar.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    private int getTitleTextColor() {
        int i = this.U;
        ylb ylbVar = this.q0;
        if (i == 4) {
            return cmb.v0(cmb.s7, ylbVar);
        }
        if (i != 1 && i != 3) {
            return cmb.v0(cmb.t7, ylbVar);
        }
        return cmb.v0(cmb.z7, ylbVar);
    }

    public static boolean i(float f, float f2) {
        if (Math.abs(f - f2) < 0.05f) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null && k47.Q4(k47Var.k)) {
            return true;
        }
        return false;
    }

    public final void a(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.a(boolean):void");
    }

    public final void b() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        op4 op4Var = new op4(this, context);
        this.r = op4Var;
        this.k0 = new u51(op4Var);
        int i = gm.q.x;
        ho hoVar = this.j0;
        hoVar.N = i;
        hoVar.B = 0.4f;
        hoVar.setCallback(op4Var);
        hoVar.u(-1);
        hoVar.w(gm.L(14.0f));
        hoVar.x(gm.o());
        addView(this.r, qoe.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w = view;
        this.r.addView(view, qoe.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i2 = cmb.v7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ylb ylbVar = this.q0;
        anb.s(imageView2, i2, ylbVar, mode);
        ImageView imageView3 = this.b;
        ae8 ae8Var = new ae8(16);
        this.c = ae8Var;
        imageView3.setImageDrawable(ae8Var);
        this.b.setBackground(cmb.f0(cmb.v0(i2, ylbVar) & 436207615, 1, gm.L(14.0f)));
        addView(this.b, qoe.e(36, 36, 51));
        this.b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                qd2 groupCall;
                int i3;
                long j;
                TL_stories.StoryItem t;
                int i4;
                byte b = r2;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i5 = fragmentContextView.U;
                        if (i5 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i6 = s96Var.e;
                                if (i6 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i6).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i6).E(i6, fragmentContextView.getContext(), t, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j3 = 0;
                        if (i5 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        return;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (f02Var2 != null) {
                                    j3 = f02Var2.a();
                                }
                                if (k47.B0(k47Var.k) == j3) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k47.B0(k47Var.k);
                                Bundle bundle = new Bundle();
                                if (pg3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (pg3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k47Var.e1());
                                dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                return;
                            }
                            return;
                        } else if (i5 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i5 == 2) {
                            int i7 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i3 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!dd6.f(i8).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i8).J.get(0);
                                            j = cd6Var.a;
                                            i3 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i3 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i3).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                return;
                            }
                        } else if (i5 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i5 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i5 == 5) {
                            yv1 yv1Var = (yv1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bp5Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                return;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            p09 p09Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i4 = 15;
                            } else {
                                i4 = 29;
                            }
                            if (p09Var.K(i4)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var2 = fragmentContextView.E;
                                if (z3) {
                                    p09Var2.H(0);
                                } else {
                                    p09Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
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
        this.x = imageView4;
        imageView4.setScaleType(scaleType);
        this.x.setAutoRepeat(true);
        this.x.f(2131624065, 30, 30, null);
        anb.B(this.x, cmb.K(gm.L(22.0f), cmb.v0(i2, ylbVar)), anb.M(i2), ylbVar);
        addView(this.x, qoe.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        pp4 pp4Var = new pp4(this, context, context, (byte) 0);
        this.d = pp4Var;
        addView(pp4Var, qoe.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
        pp4 pp4Var2 = new pp4(this, context, context, (byte) 1);
        this.e = pp4Var2;
        addView(pp4Var2, qoe.d(-1, 36.0f, 51, 35.0f, 10.0f, 36.0f, 0.0f));
        ef1 ef1Var = new ef1();
        this.O = ef1Var;
        ef1Var.g = 1.0f;
        ef1Var.j = false;
        ey0 ey0Var = new ey0((byte) 2, context, this);
        this.M = ey0Var;
        ey0Var.setText(jb6.M0(2131743126, null));
        anb.X(this.M, cmb.Ii, ylbVar);
        ey0 ey0Var2 = this.M;
        int L = gm.L(16.0f);
        int i3 = cmb.Ei;
        int v0 = cmb.v0(i3, ylbVar);
        int i4 = cmb.Gi;
        int v02 = cmb.v0(i4, ylbVar);
        anb.R(ey0Var2, cmb.i0(L, L, L, L, v0, v02, v02), anb.M(i3), anb.M(i4), ylbVar);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(gm.o());
        this.M.setGravity(17);
        this.M.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        addView(this.M, qoe.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                qd2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                int i42;
                byte b = r2;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i5 = fragmentContextView.U;
                        if (i5 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i6 = s96Var.e;
                                if (i6 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i6).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i6).E(i6, fragmentContextView.getContext(), t, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j3 = 0;
                        if (i5 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        return;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (f02Var2 != null) {
                                    j3 = f02Var2.a();
                                }
                                if (k47.B0(k47Var.k) == j3) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k47.B0(k47Var.k);
                                Bundle bundle = new Bundle();
                                if (pg3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (pg3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k47Var.e1());
                                dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                return;
                            }
                            return;
                        } else if (i5 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i5 == 2) {
                            int i7 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!dd6.f(i8).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i8).J.get(0);
                                            j = cd6Var.a;
                                            i32 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i32).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                return;
                            }
                        } else if (i5 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i5 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i5 == 5) {
                            yv1 yv1Var = (yv1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bp5Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                return;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            p09 p09Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (p09Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var2 = fragmentContextView.E;
                                if (z3) {
                                    p09Var2.H(0);
                                } else {
                                    p09Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
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
        imageView5.setImageResource(2131232262);
        ImageView imageView6 = this.L;
        int i5 = cmb.w7;
        anb.s(imageView6, i5, ylbVar, mode);
        this.K.addView(this.L, qoe.e(20, 20, 17));
        this.K.setBackground(cmb.f0(cmb.v0(i5, ylbVar) & 436207615, 1, gm.L(14.0f)));
        this.K.setContentDescription(jb6.M0(2131743536, null));
        this.K.setOnClickListener(new x10((byte) 7));
        this.K.setVisibility(8);
        addView(this.K, qoe.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.o0) {
            h();
        }
        hd0 hd0Var = new hd0(context, false);
        this.b0 = hd0Var;
        hd0Var.setAvatarsTextSize(gm.L(21.0f));
        this.b0.setDelegate(new lp4(this, (byte) 1));
        this.b0.setVisibility(8);
        addView(this.b0, qoe.e(108, 36, 51));
        this.E = new p09(2131624328, gm.L(16.0f), gm.L(20.0f), true, null);
        rp4 rp4Var = new rp4(this, context);
        this.y = rp4Var;
        anb.s(rp4Var, cmb.z7, ylbVar, PorterDuff.Mode.SRC_IN);
        this.y.setBackground(cmb.f0(cmb.v0(i5, ylbVar) & 436207615, 1, gm.L(14.0f)));
        this.y.setAnimation(this.E);
        this.y.setScaleType(scaleType);
        this.y.setVisibility(8);
        addView(this.y, qoe.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.y.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                qd2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                int i42;
                byte b = r2;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i52 = fragmentContextView.U;
                        if (i52 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i6 = s96Var.e;
                                if (i6 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i6).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i6).E(i6, fragmentContextView.getContext(), t, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j3 = 0;
                        if (i52 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        return;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (f02Var2 != null) {
                                    j3 = f02Var2.a();
                                }
                                if (k47.B0(k47Var.k) == j3) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k47.B0(k47Var.k);
                                Bundle bundle = new Bundle();
                                if (pg3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (pg3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k47Var.e1());
                                dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                return;
                            }
                            return;
                        } else if (i52 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i52 == 2) {
                            int i7 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!dd6.f(i8).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i8).J.get(0);
                                            j = cd6Var.a;
                                            i32 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i32).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                return;
                            }
                        } else if (i52 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i52 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i52 == 5) {
                            yv1 yv1Var = (yv1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bp5Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                return;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            p09 p09Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (p09Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var2 = fragmentContextView.E;
                                if (z3) {
                                    p09Var2.H(0);
                                } else {
                                    p09Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
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
        imageView7.setImageResource(2131231988);
        anb.s(this.F, i5, ylbVar, mode);
        this.F.setBackground(cmb.f0(cmb.v0(i5, ylbVar) & 436207615, 1, gm.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, qoe.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                qd2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                int i42;
                byte b = r2;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i52 = fragmentContextView.U;
                        if (i52 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i6 = s96Var.e;
                                if (i6 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i6).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i6).E(i6, fragmentContextView.getContext(), t, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j3 = 0;
                        if (i52 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        return;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (f02Var2 != null) {
                                    j3 = f02Var2.a();
                                }
                                if (k47.B0(k47Var.k) == j3) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k47.B0(k47Var.k);
                                Bundle bundle = new Bundle();
                                if (pg3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (pg3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k47Var.e1());
                                dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                return;
                            }
                            return;
                        } else if (i52 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i52 == 2) {
                            int i7 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!dd6.f(i8).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i8).J.get(0);
                                            j = cd6Var.a;
                                            i32 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i32).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                return;
                            }
                        } else if (i52 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i52 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i52 == 5) {
                            yv1 yv1Var = (yv1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bp5Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                return;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            p09 p09Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (p09Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var2 = fragmentContextView.E;
                                if (z3) {
                                    p09Var2.H(0);
                                } else {
                                    p09Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        a6 a6Var = new a6(getContext(), (byte) 13);
        this.s = a6Var;
        addView(a6Var, qoe.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                qd2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                int i42;
                byte b = r2;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i52 = fragmentContextView.U;
                        if (i52 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i6 = s96Var.e;
                                if (i6 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i6).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i6).E(i6, fragmentContextView.getContext(), t, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j3 = 0;
                        if (i52 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        return;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (f02Var2 != null) {
                                    j3 = f02Var2.a();
                                }
                                if (k47.B0(k47Var.k) == j3) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k47.B0(k47Var.k);
                                Bundle bundle = new Bundle();
                                if (pg3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (pg3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k47Var.e1());
                                dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                return;
                            }
                            return;
                        } else if (i52 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i52 == 2) {
                            int i7 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!dd6.f(i8).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i8).J.get(0);
                                            j = cd6Var.a;
                                            i32 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i32).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                return;
                            }
                        } else if (i52 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i52 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i52 == 5) {
                            yv1 yv1Var = (yv1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bp5Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                return;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            p09 p09Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (p09Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var2 = fragmentContextView.E;
                                if (z3) {
                                    p09Var2.H(0);
                                } else {
                                    p09Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
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

    public final void c(boolean z) {
        int i;
        f02 f02Var = this.n;
        if (f02Var != null) {
            if (!this.T || ((i = this.U) != 1 && i != 3)) {
                b();
                org.telegram.ui.ActionBar.d dVar = this.h;
                r5a A = dVar.getSendMessagesHelper().A(f02Var.a());
                View fragmentView = dVar.getFragmentView();
                if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z = true;
                }
                Dialog visibleDialog = dVar.getVisibleDialog();
                if ((j() || f02Var.n() || ((visibleDialog instanceof bp5) && !((bp5) visibleDialog).J)) && A != null) {
                    A = null;
                }
                po poVar = this.u0;
                if (A == null) {
                    if (this.T && ((z && this.U == -1) || this.U == 5)) {
                        this.T = false;
                        if (z) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                            return;
                        }
                        AnimatorSet animatorSet = this.f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f = null;
                        }
                        poVar.d();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f.setDuration(220L);
                        this.f.setInterpolator(d53.f);
                        this.f.addListener(new mp4(this, (byte) 3));
                        this.f.start();
                        return;
                    }
                    int i2 = this.U;
                    if (i2 == -1 || i2 == 5) {
                        this.T = false;
                        setVisibility(8);
                    }
                } else if (this.U != 5 && this.f != null && !z) {
                    this.z0 = true;
                } else {
                    r(5);
                    if (z && this.S == 0.0f) {
                        setTopPadding(gm.M(getStyleHeight()));
                        tp4 tp4Var = this.p0;
                        if (tp4Var != null) {
                            ((qda) tp4Var).b(true);
                            ((qda) this.p0).b(false);
                        }
                    }
                    if (!this.T) {
                        if (!z) {
                            AnimatorSet animatorSet3 = this.f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f = null;
                            }
                            poVar.d();
                            this.f = new AnimatorSet();
                            tp4 tp4Var2 = this.p0;
                            if (tp4Var2 != null) {
                                ((qda) tp4Var2).b(true);
                            }
                            this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gm.M(getStyleHeight())));
                            this.f.setDuration(200L);
                            this.f.addListener(new mp4(this, (byte) 4));
                            this.f.start();
                        }
                        this.T = true;
                        setVisibility(0);
                    }
                    int i3 = this.Q;
                    int i4 = A.l;
                    if (i3 != i4) {
                        this.Q = i4;
                        this.d.b(gm.S2(jb6.a0("ImportUploading", null, 2131748979, Integer.valueOf(i4))), false);
                    }
                }
            }
        }
    }

    public final void d(boolean z) {
        boolean i;
        String G;
        String M0;
        TextView nextTextView;
        org.telegram.ui.ActionBar.d dVar = this.h;
        View fragmentView = dVar.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        boolean z2 = dVar instanceof nk3;
        if (z2) {
            if (dd6.g() != 0) {
                i = true;
            } else {
                i = false;
            }
        } else {
            i = dd6.f(dVar.getCurrentAccount()).i(this.n.a());
        }
        o04 o04Var = this.t0;
        if (!i) {
            this.s0 = -1;
            gm.r(o04Var);
            if (!this.T && !z) {
                return;
            }
            this.T = false;
            if (z) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            this.f.addListener(new mp4(this, (byte) 11));
            this.f.start();
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new xca(getContext(), 1));
        if (z && this.S == 0.0f) {
            setTopPadding(gm.M(getStyleHeight()));
        }
        if (!this.T) {
            if (!z) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gm.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new mp4(this, (byte) 0));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (z2) {
            String M02 = jb6.M0(2131748597, null);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 4; i2++) {
                arrayList.addAll(dd6.f(i2).J);
            }
            if (arrayList.size() == 1) {
                cd6 cd6Var = (cd6) arrayList.get(0);
                long B0 = k47.B0(cd6Var.h.k);
                boolean D = pg3.D(B0);
                k47 k47Var = cd6Var.h;
                if (D) {
                    G = m9c.k(oc7.r1(k47Var.K1).W1(Long.valueOf(B0)), true);
                    M0 = jb6.M0(2131753930, null);
                } else {
                    TLRPC.Chat L0 = oc7.r1(k47Var.K1).L0(Long.valueOf(-B0));
                    if (L0 != null) {
                        G = L0.title;
                    } else {
                        G = "";
                    }
                    M0 = jb6.M0(2131753929, null);
                }
            } else {
                G = jb6.G(arrayList.size(), "Chats", new Object[0]);
                M0 = jb6.M0(2131753928, null);
            }
            String format = String.format(M0, M02, G);
            int indexOf = format.indexOf(M02);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            for (int i3 = 0; i3 < 2; i3++) {
                pp4 pp4Var = this.d;
                if (i3 == 0) {
                    nextTextView = pp4Var.getTextView();
                } else {
                    nextTextView = pp4Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new z5c(gm.o(), cmb.v0(cmb.s7, this.q0)), indexOf, M02.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        o04Var.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i3;
        if (i == nm7.H4) {
            d(false);
        } else if (i == nm7.G2) {
            e(false);
        } else {
            int i4 = nm7.J4;
            f02 f02Var = this.n;
            if (i == i4) {
                if (f02Var != null) {
                    if (f02Var.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i != nm7.h2 && i != nm7.g2 && i != nm7.f2 && i != nm7.D2) {
                int i5 = nm7.v2;
                if (i != i5 && i != nm7.w2 && i != nm7.F2) {
                    if (i == nm7.C2) {
                        b();
                        if (this.T && this.U == 4) {
                            qd2 groupCall = f02Var.getGroupCall();
                            if (groupCall != null && this.e != null) {
                                if (groupCall.k()) {
                                    this.e.b(jb6.W(4, groupCall.b.schedule_date, true), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    int i6 = groupCall2.participants_count;
                                    pp4 pp4Var = this.e;
                                    boolean z = groupCall2.rtmp_stream;
                                    if (i6 == 0) {
                                        if (z) {
                                            i3 = 2131743219;
                                        } else {
                                            i3 = 2131748371;
                                        }
                                        pp4Var.b(jb6.M0(i3, null), false);
                                    } else {
                                        if (z) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        pp4Var.b(jb6.G(i6, str, new Object[0]), false);
                                    }
                                }
                            }
                            o(true);
                            return;
                        }
                        return;
                    } else if (i == nm7.v1) {
                        int i7 = this.U;
                        if (i7 == 1 || i7 == 3 || i7 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i == nm7.N4) {
                        q(true);
                        return;
                    } else {
                        int i8 = nm7.R4;
                        cc1 cc1Var = this.a;
                        if (i == i8) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                cmb.E0().a(Math.max(this.M0, this.N0));
                                cc1Var.f(Math.max(this.M0, this.N0));
                                return;
                            }
                            return;
                        } else if (i == nm7.S4) {
                            b();
                            this.M0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                cmb.E0().a(Math.max(this.M0, this.N0));
                                cc1Var.f(Math.max(this.M0, this.N0));
                            }
                            this.b0.invalidate();
                            return;
                        } else if (i == nm7.e2 && this.U == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.U == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i == i5) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.y != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.y.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                    }
                }
            } else {
                int i9 = this.U;
                if (i9 == 1 || i9 == 3 || i9 == 4) {
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

    public final void e(boolean z) {
        View fragmentView = this.h.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        s96 s96Var = s96.N;
        po poVar = this.u0;
        int i = 0;
        if (s96Var != null) {
            b();
            int i2 = this.U;
            if (6 != i2 && this.f != null && !z) {
                this.x0 = true;
                return;
            } else if (6 != i2 && this.T && !z) {
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                poVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(d53.f);
                this.f.addListener(new mp4(this, (byte) 6));
                this.f.start();
                return;
            } else {
                r(6);
                if (!this.T) {
                    if (!z) {
                        AnimatorSet animatorSet3 = this.f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f = null;
                        }
                        this.f = new AnimatorSet();
                        this.v0.d();
                        this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gm.M(getStyleHeight())));
                        this.f.setDuration(220L);
                        this.f.setInterpolator(d53.f);
                        this.f.addListener(new mp4(this, (byte) 7));
                        this.f.start();
                    } else {
                        setTopPadding(gm.M(getStyleHeight()));
                        n();
                    }
                    this.T = true;
                    setVisibility(0);
                } else {
                    setTopPadding(gm.M(getStyleHeight()));
                    setVisibility(0);
                }
            }
        } else {
            boolean z2 = this.T;
            if (z2 && ((z && this.U == -1) || this.U == 6)) {
                this.T = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f = null;
                    }
                    poVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(d53.f);
                    this.f.addListener(new mp4(this, (byte) 5));
                    this.f.start();
                }
            } else if (z2 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        s96 s96Var2 = s96.N;
        if (s96Var2 != null && this.U == 6) {
            pp4 pp4Var = this.d;
            TLRPC.GroupCall groupCall = s96Var2.s;
            if (groupCall != null) {
                i = groupCall.participants_count;
            }
            pp4Var.setText(jb6.H(',', "LiveStoryTopPanelWatching", Math.max(1, i)));
        }
    }

    public final void f() {
        int i;
        TLRPC.User user;
        int i2;
        String format;
        TextView nextTextView;
        f02 f02Var = this.n;
        if (f02Var != null && this.d != null) {
            b();
            long a = f02Var.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) dd6.f(currentAccount).c.f(a);
            if (!this.r0) {
                dd6 f = dd6.f(currentAccount);
                vh6 vh6Var = f.H;
                if (vh6Var.h(a) < 0) {
                    vh6Var.k(Boolean.TRUE, a);
                    TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                    tL_messages_getRecentLocations.peer = f.getMessagesController().i1(a);
                    tL_messages_getRecentLocations.limit = 100;
                    f.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new qv2(f, a, (byte) 2));
                }
                this.r0 = true;
            }
            if (arrayList != null) {
                long e = z8c.h(currentAccount).e();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                user = null;
                i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long B1 = k47.B1(message.from_id);
                        if (user == null && B1 != e) {
                            user = oc7.r1(currentAccount).W1(Long.valueOf(B1));
                        }
                        i2++;
                    }
                }
                i = 0;
            } else {
                i = 0;
                user = null;
                i2 = 0;
            }
            if (this.s0 != i2) {
                this.s0 = i2;
                String M0 = jb6.M0(2131748597, null);
                if (i2 == 0) {
                    format = M0;
                } else {
                    int i4 = i2 - 1;
                    if (dd6.f(currentAccount).i(a)) {
                        if (i4 != 0) {
                            if (i4 == 1 && user != null) {
                                Object[] objArr = new Object[1];
                                objArr[i] = m9c.k(user, true);
                                String a0 = jb6.a0("SharingYouAndOtherName", null, 2131745102, objArr);
                                Object[] objArr2 = new Object[2];
                                objArr2[i] = M0;
                                objArr2[1] = a0;
                                format = String.format("%1$s - %2$s", objArr2);
                            } else {
                                String M02 = jb6.M0(2131752121, null);
                                int i5 = i;
                                String G = jb6.G(i4, "AndOther", new Object[i5]);
                                Object[] objArr3 = new Object[3];
                                objArr3[i5] = M0;
                                objArr3[1] = M02;
                                objArr3[2] = G;
                                format = String.format("%1$s - %2$s %3$s", objArr3);
                            }
                        } else {
                            String M03 = jb6.M0(2131752121, null);
                            Object[] objArr4 = new Object[2];
                            objArr4[i] = M0;
                            objArr4[1] = M03;
                            format = String.format("%1$s - %2$s", objArr4);
                        }
                    } else {
                        int i6 = i;
                        if (i4 != 0) {
                            String k = m9c.k(user, true);
                            String G2 = jb6.G(i4, "AndOther", new Object[i6]);
                            Object[] objArr5 = new Object[3];
                            objArr5[i6] = M0;
                            objArr5[1] = k;
                            objArr5[2] = G2;
                            format = String.format("%1$s - %2$s %3$s", objArr5);
                        } else {
                            String k2 = m9c.k(user, true);
                            Object[] objArr6 = new Object[2];
                            objArr6[i6] = M0;
                            objArr6[1] = k2;
                            format = String.format("%1$s - %2$s", objArr6);
                        }
                    }
                }
                if (!format.equals(this.V)) {
                    this.V = format;
                    int indexOf = format.indexOf(M0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i7 = 0; i7 < 2; i7++) {
                        pp4 pp4Var = this.d;
                        if (i7 == 0) {
                            nextTextView = pp4Var.getTextView();
                        } else {
                            nextTextView = pp4Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new z5c(gm.o(), cmb.v0(cmb.s7, this.q0)), indexOf, M0.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z) {
        boolean z2;
        boolean z3;
        f02 f02Var;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z4 = true;
        if (this.T) {
            int i = this.U;
            if (i != 1 && i != 3) {
                if ((i == 4 || i == 5) && !j()) {
                    return;
                }
            } else {
                return;
            }
        }
        k47 k47Var = MediaController.w().v0;
        View fragmentView = this.h.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z2 = true;
        } else {
            z2 = z;
        }
        boolean z5 = this.T;
        po poVar = this.u0;
        if (k47Var != null && k47Var.e1() != 0 && !k47.K4(k47Var.k)) {
            b();
            int i2 = this.U;
            if (i2 != 0 && this.f != null && !z2) {
                this.y0 = true;
                return;
            }
            r(0);
            if (z2 && this.S == 0.0f) {
                setTopPadding(gm.M(getStyleHeight()));
                tp4 tp4Var = this.p0;
                if (tp4Var != null) {
                    ((qda) tp4Var).b(true);
                    ((qda) this.p0).b(false);
                }
            }
            if (!this.T) {
                if (!z2) {
                    AnimatorSet animatorSet = this.f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f = null;
                    }
                    poVar.d();
                    this.f = new AnimatorSet();
                    tp4 tp4Var2 = this.p0;
                    if (tp4Var2 != null) {
                        ((qda) tp4Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gm.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new mp4(this, (byte) 2));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            boolean C = MediaController.w().C();
            ae8 ae8Var = this.c;
            if (C) {
                ae8Var.a(false, !z2);
                this.b.setContentDescription(jb6.M0(2131754929, null));
            } else {
                ae8Var.a(true, !z2);
                this.b.setContentDescription(jb6.M0(2131754930, null));
            }
            if (this.R == k47Var && i2 == 0) {
                return;
            }
            this.R = k47Var;
            if (!k47.Q4(k47Var.k) && !this.R.g4()) {
                this.W = true;
                if (this.G != null) {
                    int i3 = (k47Var.L0() > 600.0d ? 1 : (k47Var.L0() == 600.0d ? 0 : -1));
                    r7 r7Var = this.G;
                    if (i3 >= 0) {
                        r7Var.setAlpha(1.0f);
                        this.G.setEnabled(true);
                        this.d.setPadding(0, 0, gm.L(44.0f) + this.N, 0);
                        q(false);
                    } else {
                        r7Var.setAlpha(0.0f);
                        this.G.setEnabled(false);
                        this.d.setPadding(0, 0, this.N, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.N, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(td4.q(k47Var.w1(true), " - ", k47Var.y1(true)));
                for (int i4 = 0; i4 < 2; i4++) {
                    pp4 pp4Var = this.d;
                    if (i4 == 0) {
                        nextTextView2 = pp4Var.getTextView();
                    } else {
                        nextTextView2 = pp4Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.W = false;
                r7 r7Var2 = this.G;
                if (r7Var2 != null) {
                    r7Var2.setAlpha(1.0f);
                    this.G.setEnabled(true);
                }
                this.d.setPadding(0, 0, gm.L(44.0f) + this.N, 0);
                spannableStringBuilder = new SpannableStringBuilder(td4.q(k47Var.w1(true), " ", k47Var.y1(true)));
                for (int i5 = 0; i5 < 2; i5++) {
                    pp4 pp4Var2 = this.d;
                    if (i5 == 0) {
                        nextTextView = pp4Var2.getTextView();
                    } else {
                        nextTextView = pp4Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new z5c(gm.o(), cmb.v0(cmb.s7, this.q0)), 0, k47Var.w1(true).length(), 18);
            this.d.b(spannableStringBuilder, (!z2 && z5 && this.W) ? false : false);
            return;
        }
        this.R = null;
        if (this.a0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !oa5.d()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!j() && !z3 && (f02Var = this.n) != null && !oa5.d()) {
            qd2 groupCall = f02Var.getGroupCall();
            if (groupCall != null && groupCall.A()) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z3) {
            a(false);
        } else if (this.T) {
            r7 r7Var3 = this.G;
            if (r7Var3 != null && r7Var3.y()) {
                this.G.U(null, null);
            }
            this.T = false;
            if (z2) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f = null;
            }
            poVar.d();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            tp4 tp4Var3 = this.p0;
            if (tp4Var3 != null) {
                ((qda) tp4Var3).b(true);
            }
            this.f.addListener(new mp4(this, (byte) 1));
            this.f.start();
        } else {
            setVisibility(8);
        }
    }

    public cc1 getCapsuleBlobDrawable() {
        return this.a;
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
        int i = cmb.i5;
        ylb ylbVar = this.q0;
        r7 r7Var = new r7(context, null, 0, cmb.v0(i, ylbVar), false, this.q0);
        this.G = r7Var;
        if (r7Var.getIconView() != null) {
            anb.s(this.G.getIconView(), i, ylbVar, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(gm.L(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(jb6.M0(2131754804, null));
        this.G.setDelegate(new ip4(this));
        r7 r7Var2 = this.G;
        dna dnaVar = new dna();
        this.H = dnaVar;
        r7Var2.setIcon(dnaVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        v7 v7Var = new v7(getContext(), ylbVar);
        this.I = v7Var;
        v7Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new h92(this, (byte) 29));
        p7 A = this.G.A(0, 2131232379, jb6.M0(2131744955, null));
        p7[] p7VarArr = this.J;
        p7VarArr[0] = A;
        p7VarArr[1] = this.G.A(1, 2131232378, jb6.M0(2131744956, null));
        p7VarArr[2] = this.G.A(2, 2131232377, jb6.M0(2131744957, null));
        p7VarArr[3] = this.G.A(3, 2131232376, jb6.M0(2131744959, null));
        p7VarArr[4] = this.G.A(4, 2131232381, jb6.M0(2131744953, null));
        p7VarArr[5] = this.G.A(5, 2131232380, jb6.M0(2131744954, null));
        if (gm.p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(gm.L(8.0f));
        addView(this.G, qoe.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new tf3(this, fArr, (byte) 11));
        this.G.setOnLongClickListener(new au(this, (byte) 4));
        q(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i = this.U;
        if ((i == 3 || i == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(cd6 cd6Var) {
        if (cd6Var != null) {
            org.telegram.ui.ActionBar.d dVar = this.h;
            if (dVar.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) dVar.getParentActivity();
                launchActivity.N0(cd6Var.h.K1);
                pc6 pc6Var = new pc6(2);
                pc6Var.G0(cd6Var.h);
                pc6Var.M0 = new d12(cd6Var, k47.B0(cd6Var.h.k), (byte) 6);
                launchActivity.t0(pc6Var);
            }
        }
    }

    public final void l(float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.l(float, float, boolean):void");
    }

    public final void m() {
        e7a e7aVar = this.L0;
        if (e7aVar != null) {
            e7aVar.a();
            this.L0 = null;
        }
        for (int i = 0; i < 4; i++) {
            km7[] km7VarArr = this.K0;
            km7 km7Var = km7VarArr[i];
            if (km7Var != null) {
                km7Var.a();
                km7VarArr[i] = null;
            }
        }
    }

    public final void n() {
        ef1 ef1Var = this.O;
        if (ef1Var != null && ef1Var.g >= 1.0f) {
            this.O0 = false;
            gm.d3(new lp4(this, (byte) 0), 150L);
            return;
        }
        this.O0 = true;
    }

    public final void o(boolean z) {
        qd2 qd2Var;
        int i;
        TLRPC.User user;
        int h;
        int i2;
        float f;
        ValueAnimator valueAnimator;
        b();
        if (!z && (valueAnimator = this.b0.a.f) != null) {
            valueAnimator.cancel();
            this.b0.a.f = null;
        }
        gd0 gd0Var = this.b0.a;
        if (gd0Var.f == null) {
            int i3 = this.U;
            int i4 = this.n0;
            f02 f02Var = this.n;
            if (i3 == 4) {
                if (f02Var != null) {
                    qd2Var = f02Var.getGroupCall();
                    i4 = this.h.getCurrentAccount();
                } else {
                    qd2Var = null;
                }
                i = i4;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                qd2Var = VoIPService.getSharedInstance().groupCall;
                if (f02Var != null) {
                    user = null;
                } else {
                    user = VoIPService.getSharedInstance().getUser();
                }
                i = VoIPService.getSharedInstance().getAccount();
            } else {
                qd2Var = null;
                i = i4;
                user = null;
            }
            int i5 = 0;
            if (qd2Var != null) {
                ArrayList arrayList = qd2Var.e;
                int size = arrayList.size();
                for (int i6 = 0; i6 < 3; i6++) {
                    hd0 hd0Var = this.b0;
                    if (i6 < size) {
                        hd0Var.b(i6, i, (TLObject) arrayList.get(i6));
                    } else {
                        hd0Var.b(i6, i, null);
                    }
                }
            } else if (user != null) {
                this.b0.b(0, i, user);
                for (int i7 = 1; i7 < 3; i7++) {
                    this.b0.b(i7, i, null);
                }
            } else {
                for (int i8 = 0; i8 < 3; i8++) {
                    this.b0.b(i8, i, null);
                }
            }
            this.b0.a(z);
            if (this.U == 4 && qd2Var != null) {
                if (!qd2Var.b.rtmp_stream) {
                    i5 = Math.min(3, qd2Var.e.size());
                }
                if (i5 == 0) {
                    h = 10;
                } else {
                    h = aq1.h(i5, 1, 24, 52);
                }
                int i9 = h + 3;
                pp4 pp4Var = this.d;
                if (z) {
                    int i10 = ((FrameLayout.LayoutParams) pp4Var.getLayoutParams()).leftMargin;
                    if (gm.L(i9) != i10) {
                        float translationX = (this.d.getTranslationX() + i10) - gm.L(f);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        d53 d53Var = d53.f;
                        duration.setInterpolator(d53Var);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(d53Var);
                    }
                } else {
                    pp4Var.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                pp4 pp4Var2 = this.d;
                float f2 = i9;
                int i11 = 36;
                if (qd2Var.k()) {
                    i2 = 90;
                } else {
                    i2 = 36;
                }
                pp4Var2.setLayoutParams(qoe.d(-1, 20.0f, 51, f2, 5.0f, i2, 0.0f));
                pp4 pp4Var3 = this.e;
                if (qd2Var.k()) {
                    i11 = 90;
                }
                pp4Var3.setLayoutParams(qoe.d(-1, 20.0f, 51, f2, 25.0f, i11, 0.0f));
                return;
            }
            return;
        }
        gd0Var.g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        m();
        int i = 15;
        if (this.o0) {
            e7a e7aVar = new e7a(nm7.e(), this);
            e7aVar.b(nm7.H4);
            e7aVar.b(nm7.J4);
            this.L0 = e7aVar;
            d(true);
        } else {
            for (int i2 = 0; i2 < 4; i2++) {
                e7a e7aVar2 = new e7a(nm7.f(i2), this);
                e7aVar2.b(nm7.f2);
                e7aVar2.b(nm7.g2);
                e7aVar2.b(nm7.h2);
                e7aVar2.b(nm7.w2);
                e7aVar2.b(nm7.C2);
                e7aVar2.b(nm7.v1);
                e7aVar2.b(nm7.G2);
                e7aVar2.b(nm7.e2);
                this.K0[i2] = e7aVar2;
                GroupCallMessagesController.getInstance(i2).subscribeToCallMessages(0L, this);
            }
            e7a e7aVar3 = new e7a(nm7.e(), this);
            e7aVar3.b(nm7.N4);
            e7aVar3.b(nm7.v2);
            e7aVar3.b(nm7.D2);
            e7aVar3.b(nm7.S4);
            e7aVar3.b(nm7.R4);
            e7aVar3.b(nm7.F2);
            this.L0 = e7aVar3;
            if (s96.N != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !oa5.d()) {
                a(true);
            } else {
                f02 f02Var = this.n;
                if (f02Var != null && this.h.getSendMessagesHelper().A(f02Var.a()) != null && !j()) {
                    c(true);
                } else if (f02Var != null && f02Var.getGroupCall() != null && f02Var.getGroupCall().A() && !oa5.d() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    q(false);
                }
            }
        }
        int i3 = this.U;
        if (i3 != 3 && i3 != 1) {
            if (i3 == 4 && !this.l0) {
                this.l0 = true;
                this.m0.run();
            }
        } else {
            ArrayList arrayList = cmb.E0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            cc1 cc1Var = this.a;
            if (!cc1Var.u) {
                cc1Var.u = true;
                cc1Var.t = SystemClock.elapsedRealtime();
                fi2.d().a(60, cc1Var.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z = true;
            } else {
                z = false;
            }
            if (this.P != z && this.y != null) {
                this.P = z;
                p09 p09Var = this.E;
                if (!z) {
                    i = 29;
                }
                p09Var.K(i);
                p09 p09Var2 = this.E;
                p09Var2.I(p09Var2.f - 1, false, true);
                this.y.invalidate();
            }
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(gm.M(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z;
        int i;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.P;
        cc1 cc1Var = this.a;
        if (z2 != z) {
            this.P = z;
            p09 p09Var = this.E;
            if (z) {
                i = 15;
            } else {
                i = 29;
            }
            p09Var.K(i);
            p09 p09Var2 = this.E;
            p09Var2.I(p09Var2.f - 1, false, true);
            this.y.invalidate();
            cmb.E0().c(this.T);
            cc1Var.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            cmb.E0().a(0.0f);
            cc1Var.f(0.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        if (this.l0) {
            gm.r(this.m0);
            this.l0 = false;
        }
        this.T = false;
        this.u0.e();
        this.S = 0.0f;
        m();
        if (!this.o0) {
            for (int i = 0; i < 4; i++) {
                GroupCallMessagesController.getInstance(i).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i2 = this.U;
        if (i2 == 3 || i2 == 1) {
            vp4 E0 = cmb.E0();
            ArrayList arrayList = E0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.b;
                E0.b = null;
                E0.c = null;
            }
            cc1 cc1Var = this.a;
            if (cc1Var.u) {
                cc1Var.u = false;
                fi2.d().g(cc1Var.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, gm.M(getStyleHeight()));
    }

    @Override
    public final void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage) {
        if (this.s != null) {
            int i = this.U;
            if ((i == 1 || i == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j) {
                this.V0++;
                if (!groupCallMessage.isOut()) {
                    this.U0.h(new sp4(this.s, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i = this.V0;
        if (i > 0) {
            int i2 = i - 1;
            this.V0 = i2;
            if (i2 == 0) {
                this.U0.h(null, true);
            }
        }
    }

    @Override
    public final void onStateChanged(int i) {
        p();
    }

    public final void p() {
        qd2 qd2Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i = this.U;
            if (i == 1 || i == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(jb6.M0(2131743076, null), false);
                } else if (sharedInstance.isConference() && (qd2Var = sharedInstance.groupCall) != null) {
                    if (qd2Var.e.size() <= 1) {
                        this.d.b(jb6.M0(2131751760, null), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.e.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(pg3.r(sharedInstance.getAccount(), pg3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i2)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb.append(" ");
                        sb.append(jb6.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    f02 f02Var = this.n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                            this.d.b(sharedInstance.groupCall.b.title, false);
                        } else if (f02Var != null && f02Var.f() != null && f02Var.f().id == sharedInstance.getChat().id) {
                            TLRPC.Chat f = f02Var.f();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(jb6.M0(2131743132, null), false);
                                return;
                            }
                            boolean W = sd2.W(f);
                            pp4 pp4Var = this.d;
                            if (W) {
                                pp4Var.b(jb6.M0(2131743132, null), false);
                            } else {
                                pp4Var.b(jb6.M0(2131742991, null), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (f02Var != null && f02Var.h() != null && f02Var.h().id == user.id) {
                            this.d.setText(jb6.M0(2131745779, null));
                        } else {
                            this.d.setText(bw2.m(0, user.first_name, user.last_name));
                        }
                    }
                }
            }
        }
    }

    public final void q(boolean z) {
        if (this.H == null) {
            return;
        }
        float x = MediaController.w().x(this.W);
        this.H.b(z, x);
        updateColors();
        boolean z2 = this.A0;
        int i = 0;
        this.A0 = false;
        while (true) {
            p7[] p7VarArr = this.J;
            if (i < p7VarArr.length) {
                ylb ylbVar = this.q0;
                if (!z2 && Math.abs(x - W0[i]) < 0.05f) {
                    p7 p7Var = p7VarArr[i];
                    int i2 = cmb.Gi;
                    p7Var.a(cmb.v0(i2, ylbVar), cmb.v0(i2, ylbVar));
                } else {
                    p7 p7Var2 = p7VarArr[i];
                    int i3 = cmb.D8;
                    p7Var2.a(cmb.v0(i3, ylbVar), cmb.v0(i3, ylbVar));
                }
                i++;
            } else {
                this.I.e(z, x);
                return;
            }
        }
    }

    public final void r(int i) {
        boolean z;
        pp4 pp4Var;
        TextView nextTextView;
        int i2;
        int i3;
        boolean z2;
        int i4;
        pp4 pp4Var2;
        TextView nextTextView2;
        pp4 pp4Var3;
        int i5;
        TextView nextTextView3;
        pp4 pp4Var4;
        TextView nextTextView4;
        TextView nextTextView5;
        if (this.U != i) {
            b();
            int i6 = this.U;
            cc1 cc1Var = this.a;
            boolean z3 = true;
            int i7 = 0;
            if (i6 == 3 || i6 == 1) {
                vp4 E0 = cmb.E0();
                ArrayList arrayList = E0.l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    E0.d = E0.b;
                    E0.b = null;
                    E0.c = null;
                }
                if (cc1Var.u) {
                    cc1Var.u = false;
                    fi2.d().g(cc1Var.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                m99 m99Var = this.U0;
                if (m99Var != null) {
                    m99Var.h(null, true);
                }
            }
            this.U = i;
            op4 op4Var = this.r;
            if (i != 4) {
                z = true;
            } else {
                z = false;
            }
            op4Var.setWillNotDraw(z);
            if (i != 4) {
                this.h0 = false;
            }
            hd0 hd0Var = this.b0;
            if (hd0Var != null) {
                hd0Var.setStyle(this.U);
                this.b0.setLayoutParams(qoe.e(108, getStyleHeight(), 51));
            }
            this.r.setLayoutParams(qoe.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f = this.S;
            if (f > 0.0f && f != gm.M(getStyleHeight())) {
                setTopPadding(gm.M(getStyleHeight()));
            }
            ylb ylbVar = this.q0;
            if (i == 6) {
                this.w.setBackground(cmb.L0(false));
                this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.v0(cmb.dl, ylbVar), cmb.v0(cmb.el, ylbVar)}));
                this.r.setTag(null);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.y.setVisibility(8);
                this.x.setVisibility(8);
                this.x.i();
                this.b0.setVisibility(8);
                this.d.setTag(Integer.valueOf(cmb.z7));
                while (true) {
                    pp4 pp4Var5 = this.d;
                    if (i7 < 2) {
                        if (i7 == 0) {
                            nextTextView5 = pp4Var5.getTextView();
                        } else {
                            nextTextView5 = pp4Var5.getNextTextView();
                        }
                        if (nextTextView5 != null) {
                            nextTextView5.setGravity(19);
                            anb.X(nextTextView5, cmb.z7, ylbVar);
                            nextTextView5.setTypeface(gm.o());
                            nextTextView5.setTextSize(1, 15.0f);
                        }
                        i7++;
                    } else {
                        pp4Var5.setLayoutParams(qoe.d(-2, -2.0f, 17, 0.0f, -1.0f, 0.0f, 0.0f));
                        return;
                    }
                }
            } else if (i == 5) {
                this.w.setBackground(cmb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(cmb.u7));
                int i8 = 0;
                while (true) {
                    pp4Var4 = this.d;
                    if (i8 >= 2) {
                        break;
                    }
                    if (i8 == 0) {
                        nextTextView4 = pp4Var4.getTextView();
                    } else {
                        nextTextView4 = pp4Var4.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        anb.X(nextTextView4, cmb.t7, ylbVar);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                    i8++;
                }
                pp4Var4.setTag(Integer.valueOf(cmb.t7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.y.setVisibility(8);
                this.b0.setVisibility(8);
                this.x.setVisibility(0);
                this.x.d();
                this.F.setContentDescription(jb6.M0(2131754900, null));
                r7 r7Var = this.G;
                if (r7Var != null) {
                    r7Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(qoe.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
            } else if (i != 0 && i != 2) {
                if (i == 4) {
                    this.w.setBackground(cmb.L0(false));
                    this.r.setBackgroundColor(0);
                    this.r.setTag(Integer.valueOf(cmb.u7));
                    this.y.setVisibility(8);
                    this.e.setVisibility(0);
                    int i9 = 0;
                    while (true) {
                        pp4Var3 = this.d;
                        if (i9 >= 2) {
                            break;
                        }
                        if (i9 == 0) {
                            nextTextView3 = pp4Var3.getTextView();
                        } else {
                            nextTextView3 = pp4Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            anb.X(nextTextView3, cmb.s7, ylbVar);
                            nextTextView3.setTypeface(gm.o());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                        i9++;
                    }
                    pp4Var3.setTag(Integer.valueOf(cmb.s7));
                    this.d.setPadding(0, 0, this.N, 0);
                    this.x.setVisibility(8);
                    this.x.i();
                    f02 f02Var = this.n;
                    if (f02Var == null || f02Var.getGroupCall() == null || f02Var.getGroupCall().b == null || !f02Var.getGroupCall().b.rtmp_stream) {
                        z3 = false;
                    }
                    hd0 hd0Var2 = this.b0;
                    if (!z3) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    hd0Var2.setVisibility(i5);
                    if (this.b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-gm.L(36.0f));
                        this.e.setTranslationX(-gm.L(36.0f));
                    }
                    this.F.setVisibility(8);
                    this.b.setVisibility(8);
                    r7 r7Var2 = this.G;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(8);
                        this.G.setTag(null);
                    }
                } else if (i == 1 || i == 3) {
                    this.w.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    hd0 hd0Var3 = this.b0;
                    if (!hasRtmpStream) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    hd0Var3.setVisibility(i2);
                    if (i == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    rp4 rp4Var = this.y;
                    if (!hasRtmpStream) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    rp4Var.setVisibility(i3);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.P = z2;
                    p09 p09Var = this.E;
                    if (z2) {
                        i4 = 15;
                    } else {
                        i4 = 29;
                    }
                    p09Var.K(i4);
                    p09 p09Var2 = this.E;
                    p09Var2.I(p09Var2.f - 1, false, true);
                    this.y.invalidate();
                    this.r.setBackground(null);
                    this.r.setBackgroundColor(0);
                    this.x.setVisibility(8);
                    this.x.i();
                    ArrayList arrayList2 = cmb.E0().l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!cc1Var.u) {
                        cc1Var.u = true;
                        cc1Var.t = SystemClock.elapsedRealtime();
                        fi2.d().a(60, cc1Var.F);
                    }
                    invalidate();
                    int i10 = 0;
                    while (true) {
                        pp4Var2 = this.d;
                        if (i10 >= 2) {
                            break;
                        }
                        if (i10 == 0) {
                            nextTextView2 = pp4Var2.getTextView();
                        } else {
                            nextTextView2 = pp4Var2.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            anb.X(nextTextView2, cmb.z7, ylbVar);
                            nextTextView2.setTypeface(gm.o());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                        i10++;
                    }
                    pp4Var2.setTag(Integer.valueOf(cmb.z7));
                    this.F.setVisibility(8);
                    this.b.setVisibility(8);
                    this.e.setVisibility(8);
                    this.M.setVisibility(8);
                    this.d.setLayoutParams(qoe.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setPadding(gm.L(88.0f), 0, gm.L(88.0f) + this.N, 0);
                    r7 r7Var3 = this.G;
                    if (r7Var3 != null) {
                        r7Var3.setVisibility(8);
                        this.G.setTag(null);
                    }
                }
            } else {
                this.w.setBackground(cmb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(cmb.u7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(0);
                this.b.setVisibility(0);
                this.y.setVisibility(8);
                this.x.setVisibility(8);
                this.x.i();
                this.b0.setVisibility(8);
                int i11 = 0;
                while (true) {
                    pp4Var = this.d;
                    if (i11 >= 2) {
                        break;
                    }
                    if (i11 == 0) {
                        nextTextView = pp4Var.getTextView();
                    } else {
                        nextTextView = pp4Var.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        anb.X(nextTextView, cmb.t7, ylbVar);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                    i11++;
                }
                pp4Var.setTag(Integer.valueOf(cmb.t7));
                ImageView imageView = this.b;
                if (i == 6) {
                    imageView.setLayoutParams(qoe.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(qoe.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                    this.F.setVisibility(8);
                } else if (i == 0) {
                    imageView.setLayoutParams(qoe.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(qoe.d(-1, 36.0f, 51, 37.0f, 0.0f, 36.0f, 0.0f));
                    h();
                    r7 r7Var4 = this.G;
                    if (r7Var4 != null) {
                        r7Var4.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(jb6.M0(2131754900, null));
                } else {
                    imageView.setLayoutParams(qoe.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(qoe.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                    this.F.setContentDescription(jb6.M0(2131754754, null));
                }
            }
        }
    }

    public void setDelegate(tp4 tp4Var) {
        this.p0 = tp4Var;
    }

    public void setDrawOverlay(boolean z) {
        this.R0 = z;
    }

    public void setLeftMargin(float f) {
        if (this.r == null) {
            this.T0 = f;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
        s09 s09Var = this.x;
        if (s09Var != null) {
            s09Var.setTranslationX(f);
        }
        pp4 pp4Var = this.d;
        if (pp4Var != null) {
            pp4Var.setTranslationX(f);
        }
        pp4 pp4Var2 = this.e;
        if (pp4Var2 != null) {
            pp4Var2.setTranslationX(f);
        }
        hd0 hd0Var = this.b0;
        if (hd0Var != null) {
            hd0Var.setTranslationX(f);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z) {
        this.a0 = z;
    }

    public void setTopPadding(float f) {
        this.S = f;
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        setTopPadding(this.S);
        if (i == 8) {
            this.P0 = false;
        }
    }

    @Override
    public final void updateColors() {
        int i;
        TextView nextTextView;
        z5c[] z5cVarArr;
        TextView nextTextView2;
        cc1 cc1Var = this.a;
        int i2 = cc1Var.A;
        if (i2 >= 0) {
            cc1Var.E = 1.0f;
            cc1Var.a(cc1.e(i2));
        }
        if (!i(MediaController.w().x(this.W), 1.0f)) {
            i = cmb.Gi;
        } else {
            i = cmb.w7;
        }
        ylb ylbVar = this.q0;
        int v0 = cmb.v0(i, ylbVar);
        dna dnaVar = this.H;
        if (dnaVar != null) {
            dnaVar.a.u(v0);
            Paint paint = dnaVar.b;
            if (paint != null) {
                paint.setColor(v0);
            }
        }
        r7 r7Var = this.G;
        if (r7Var != null) {
            Drawable background = r7Var.getBackground();
            if (background != null && background == this.E0) {
                if (v0 != this.J0) {
                    this.J0 = v0;
                    cmb.F1(background, v0 & 436207615, true);
                }
            } else {
                r7 r7Var2 = this.G;
                fg0 f0 = cmb.f0(436207615 & v0, 1, gm.L(14.0f));
                this.E0 = f0;
                r7Var2.setBackground(f0);
                this.J0 = v0;
            }
        }
        if (this.b != null) {
            int v02 = cmb.v0(cmb.v7, ylbVar);
            if (this.F0 == null || v02 != this.H0) {
                ImageView imageView = this.b;
                this.H0 = v02;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int v03 = cmb.v0(cmb.w7, ylbVar);
            if (this.G0 == null || v03 != this.I0) {
                ImageView imageView2 = this.F;
                this.I0 = v03;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.e != null) {
            for (int i3 = 0; i3 < 2; i3++) {
                pp4 pp4Var = this.e;
                if (i3 == 0) {
                    nextTextView2 = pp4Var.getTextView();
                } else {
                    nextTextView2 = pp4Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(cmb.v0(cmb.w7, ylbVar));
                }
            }
        }
        pp4 pp4Var2 = this.d;
        if (pp4Var2 != null) {
            Object tag = pp4Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i4 = 0; i4 < 2; i4++) {
                    pp4 pp4Var3 = this.d;
                    if (i4 == 0) {
                        nextTextView = pp4Var3.getTextView();
                    } else {
                        nextTextView = pp4Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(cmb.v0(intValue, ylbVar));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (z5cVarArr = (z5c[]) ((Spanned) text).getSpans(0, text.length(), z5c.class)) != null) {
                            for (z5c z5cVar : z5cVarArr) {
                                z5cVar.b = cmb.v0(cmb.s7, ylbVar);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void onCameraSwitch(boolean z) {
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
    }

    public FragmentContextView(Context context, nk3 nk3Var, boolean z) {
        this(context, nk3Var, null, z, null);
    }
}
