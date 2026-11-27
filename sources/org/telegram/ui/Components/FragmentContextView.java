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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.LaunchActivity;
public class FragmentContextView extends FrameLayout implements fn7, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, snb {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public kg5 B0;
    public ViewGroup C0;
    public long D0;
    public b29 E;
    public hf0 E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public s7 G;
    public PorterDuffColorFilter G0;
    public zoa H;
    public int H0;
    public w7 I;
    public int I0;
    public final q7[] J;
    public int J0;
    public FrameLayout K;
    public final gn7[] K0;
    public ImageView L;
    public u8a L0;
    public fx0 M;
    public float M0;
    public int N;
    public float N0;
    public fe1 O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public r47 R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final xa9 U0;
    public String V;
    public int V0;
    public boolean W;
    public final cb1 a;
    public boolean a0;
    public ImageView b;
    public jc0 b0;
    public mf8 c;
    public Paint c0;
    public sp4 d;
    public LinearGradient d0;
    public sp4 e;
    public Matrix e0;
    public AnimatorSet f;
    public int f0;
    public TextPaint g0;
    public final org.telegram.ui.ActionBar.e h;
    public boolean h0;
    public boolean i0;
    public final hn j0;
    public v41 k0;
    public boolean l0;
    public final qp4 m0;
    public final kz1 n;
    public final int n0;
    public final boolean o0;
    public wp4 p0;
    public final vnb q0;
    public rp4 r;
    public boolean r0;
    public b6 s;
    public int s0;
    public final zz3 t0;
    public final pn u0;
    public final pn v0;
    public View w;
    public boolean w0;
    public e29 x;
    public boolean x0;
    public up4 y;
    public boolean y0;
    public boolean z0;

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.e eVar, FrameLayout frameLayout, boolean z, vnb vnbVar) {
        super(context);
        this.a = new cb1();
        this.J = new q7[6];
        this.Q = -1;
        this.U = -1;
        this.a0 = true;
        this.j0 = new hn(false, true, true);
        this.m0 = new qp4(this);
        this.n0 = yac.t0;
        this.s0 = -1;
        this.t0 = new zz3(this, (byte) 7);
        this.u0 = new pn(null);
        this.v0 = new pn(new int[]{jn7.C});
        this.K0 = new gn7[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new xa9(new lp4(this), k43.h, 450L);
        this.V0 = 0;
        this.q0 = vnbVar;
        this.h = eVar;
        if (eVar instanceof kz1) {
            this.n = (kz1) eVar;
        }
        this.T = true;
        this.o0 = z;
        if (frameLayout == null) {
            ((ViewGroup) eVar.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    private int getTitleTextColor() {
        int i = this.U;
        vnb vnbVar = this.q0;
        if (i == 4) {
            return aob.v0(aob.t7, vnbVar);
        }
        if (i != 1 && i != 3) {
            return aob.v0(aob.u7, vnbVar);
        }
        return aob.v0(aob.A7, vnbVar);
    }

    public static boolean i(float f, float f2) {
        if (Math.abs(f - f2) < 0.05f) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && r47.Q4(r47Var.k)) {
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
        rp4 rp4Var = new rp4(this, context);
        this.r = rp4Var;
        this.k0 = new v41(rp4Var);
        int i = hl.q.x;
        hn hnVar = this.j0;
        hnVar.N = i;
        hnVar.B = 0.4f;
        hnVar.setCallback(rp4Var);
        hnVar.u(-1);
        hnVar.w(hl.L(14.0f));
        hnVar.x(hl.o());
        addView(this.r, tre.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w = view;
        this.r.addView(view, tre.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i2 = aob.w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        vnb vnbVar = this.q0;
        yob.s(imageView2, i2, vnbVar, mode);
        ImageView imageView3 = this.b;
        mf8 mf8Var = new mf8(16);
        this.c = mf8Var;
        imageView3.setImageDrawable(mf8Var);
        this.b.setBackground(aob.f0(aob.v0(i2, vnbVar) & 436207615, 1, hl.L(14.0f)));
        addView(this.b, tre.e(36, 36, 51));
        this.b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                vc2 groupCall;
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
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.z().m(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i5 = fragmentContextView.U;
                        if (i5 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i6 = w96Var.e;
                                if (i6 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i6).O1().t(w96Var.c, j2)) != null) {
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
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        return;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kz1Var2 != null) {
                                    j3 = kz1Var2.a();
                                }
                                if (r47.B0(r47Var.k) == j3) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = r47.B0(r47Var.k);
                                Bundle bundle = new Bundle();
                                if (wf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (wf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", r47Var.e1());
                                eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                return;
                            }
                            return;
                        } else if (i5 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i5 == 2) {
                            int i7 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i3 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!id6.f(i8).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i8).J.get(0);
                                            j = hd6Var.a;
                                            i3 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i3 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i3).h(j));
                                return;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                return;
                            }
                        } else if (i5 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i5 == 4) {
                            if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i5 == 5) {
                            zu1 zu1Var = (zu1) eVar2;
                            if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                eVar2.showDialog(ep5Var);
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
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                return;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            b29 b29Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i4 = 15;
                            } else {
                                i4 = 29;
                            }
                            if (b29Var.K(i4)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var2 = fragmentContextView.E;
                                if (z3) {
                                    b29Var2.H(0);
                                } else {
                                    b29Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        yob.B(this.x, aob.K(hl.L(22.0f), aob.v0(i2, vnbVar)), yob.M(i2), vnbVar);
        addView(this.x, tre.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        sp4 sp4Var = new sp4(this, context, context, (byte) 0);
        this.d = sp4Var;
        addView(sp4Var, tre.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
        sp4 sp4Var2 = new sp4(this, context, context, (byte) 1);
        this.e = sp4Var2;
        addView(sp4Var2, tre.d(-1, 36.0f, 51, 35.0f, 10.0f, 36.0f, 0.0f));
        fe1 fe1Var = new fe1();
        this.O = fe1Var;
        fe1Var.g = 1.0f;
        fe1Var.j = false;
        fx0 fx0Var = new fx0((byte) 2, context, this);
        this.M = fx0Var;
        fx0Var.setText(ob6.M0(2131743094, null));
        yob.X(this.M, aob.Ji, vnbVar);
        fx0 fx0Var2 = this.M;
        int L = hl.L(16.0f);
        int i3 = aob.Fi;
        int v0 = aob.v0(i3, vnbVar);
        int i4 = aob.Hi;
        int v02 = aob.v0(i4, vnbVar);
        yob.R(fx0Var2, aob.i0(L, L, L, L, v0, v02, v02), yob.M(i3), yob.M(i4), vnbVar);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(hl.o());
        this.M.setGravity(17);
        this.M.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        addView(this.M, tre.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                vc2 groupCall;
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
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.z().m(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i5 = fragmentContextView.U;
                        if (i5 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i6 = w96Var.e;
                                if (i6 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i6).O1().t(w96Var.c, j2)) != null) {
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
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        return;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kz1Var2 != null) {
                                    j3 = kz1Var2.a();
                                }
                                if (r47.B0(r47Var.k) == j3) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = r47.B0(r47Var.k);
                                Bundle bundle = new Bundle();
                                if (wf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (wf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", r47Var.e1());
                                eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                return;
                            }
                            return;
                        } else if (i5 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i5 == 2) {
                            int i7 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i32 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!id6.f(i8).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i8).J.get(0);
                                            j = hd6Var.a;
                                            i32 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i32).h(j));
                                return;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                return;
                            }
                        } else if (i5 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i5 == 4) {
                            if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i5 == 5) {
                            zu1 zu1Var = (zu1) eVar2;
                            if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                eVar2.showDialog(ep5Var);
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
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                return;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            b29 b29Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (b29Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var2 = fragmentContextView.E;
                                if (z3) {
                                    b29Var2.H(0);
                                } else {
                                    b29Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        imageView5.setImageResource(2131232261);
        ImageView imageView6 = this.L;
        int i5 = aob.x7;
        yob.s(imageView6, i5, vnbVar, mode);
        this.K.addView(this.L, tre.e(20, 20, 17));
        this.K.setBackground(aob.f0(aob.v0(i5, vnbVar) & 436207615, 1, hl.L(14.0f)));
        this.K.setContentDescription(ob6.M0(2131743504, null));
        this.K.setOnClickListener(new y00((byte) 7));
        this.K.setVisibility(8);
        addView(this.K, tre.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.o0) {
            h();
        }
        jc0 jc0Var = new jc0(context, false);
        this.b0 = jc0Var;
        jc0Var.setAvatarsTextSize(hl.L(21.0f));
        this.b0.setDelegate(new op4(this, (byte) 1));
        this.b0.setVisibility(8);
        addView(this.b0, tre.e(108, 36, 51));
        this.E = new b29(2131624328, hl.L(16.0f), hl.L(20.0f), true, null);
        up4 up4Var = new up4(this, context);
        this.y = up4Var;
        yob.s(up4Var, aob.A7, vnbVar, PorterDuff.Mode.SRC_IN);
        this.y.setBackground(aob.f0(aob.v0(i5, vnbVar) & 436207615, 1, hl.L(14.0f)));
        this.y.setAnimation(this.E);
        this.y.setScaleType(scaleType);
        this.y.setVisibility(8);
        addView(this.y, tre.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.y.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                vc2 groupCall;
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
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.z().m(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i52 = fragmentContextView.U;
                        if (i52 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i6 = w96Var.e;
                                if (i6 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i6).O1().t(w96Var.c, j2)) != null) {
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
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        return;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kz1Var2 != null) {
                                    j3 = kz1Var2.a();
                                }
                                if (r47.B0(r47Var.k) == j3) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = r47.B0(r47Var.k);
                                Bundle bundle = new Bundle();
                                if (wf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (wf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", r47Var.e1());
                                eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                return;
                            }
                            return;
                        } else if (i52 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i52 == 2) {
                            int i7 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i32 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!id6.f(i8).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i8).J.get(0);
                                            j = hd6Var.a;
                                            i32 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i32).h(j));
                                return;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                return;
                            }
                        } else if (i52 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i52 == 4) {
                            if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i52 == 5) {
                            zu1 zu1Var = (zu1) eVar2;
                            if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                eVar2.showDialog(ep5Var);
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
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                return;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            b29 b29Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (b29Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var2 = fragmentContextView.E;
                                if (z3) {
                                    b29Var2.H(0);
                                } else {
                                    b29Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        imageView7.setImageResource(2131231987);
        yob.s(this.F, i5, vnbVar, mode);
        this.F.setBackground(aob.f0(aob.v0(i5, vnbVar) & 436207615, 1, hl.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, tre.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                vc2 groupCall;
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
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.z().m(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i52 = fragmentContextView.U;
                        if (i52 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i6 = w96Var.e;
                                if (i6 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i6).O1().t(w96Var.c, j2)) != null) {
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
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        return;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kz1Var2 != null) {
                                    j3 = kz1Var2.a();
                                }
                                if (r47.B0(r47Var.k) == j3) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = r47.B0(r47Var.k);
                                Bundle bundle = new Bundle();
                                if (wf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (wf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", r47Var.e1());
                                eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                return;
                            }
                            return;
                        } else if (i52 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i52 == 2) {
                            int i7 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i32 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!id6.f(i8).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i8).J.get(0);
                                            j = hd6Var.a;
                                            i32 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i32).h(j));
                                return;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                return;
                            }
                        } else if (i52 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i52 == 4) {
                            if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i52 == 5) {
                            zu1 zu1Var = (zu1) eVar2;
                            if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                eVar2.showDialog(ep5Var);
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
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                return;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            b29 b29Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (b29Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var2 = fragmentContextView.E;
                                if (z3) {
                                    b29Var2.H(0);
                                } else {
                                    b29Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        b6 b6Var = new b6(getContext(), (byte) 14);
        this.s = b6Var;
        addView(b6Var, tre.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                vc2 groupCall;
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
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.z().m(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i52 = fragmentContextView.U;
                        if (i52 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i6 = w96Var.e;
                                if (i6 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i6).O1().t(w96Var.c, j2)) != null) {
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
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        return;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (kz1Var2 != null) {
                                    j3 = kz1Var2.a();
                                }
                                if (r47.B0(r47Var.k) == j3) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = r47.B0(r47Var.k);
                                Bundle bundle = new Bundle();
                                if (wf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (wf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", r47Var.e1());
                                eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                return;
                            }
                            return;
                        } else if (i52 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i52 == 2) {
                            int i7 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i32 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!id6.f(i8).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i8).J.get(0);
                                            j = hd6Var.a;
                                            i32 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i32).h(j));
                                return;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                return;
                            }
                        } else if (i52 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i52 == 4) {
                            if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i52 == 5) {
                            zu1 zu1Var = (zu1) eVar2;
                            if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                eVar2.showDialog(ep5Var);
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
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                return;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            b29 b29Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (b29Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var2 = fragmentContextView.E;
                                if (z3) {
                                    b29Var2.H(0);
                                } else {
                                    b29Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        kz1 kz1Var = this.n;
        if (kz1Var != null) {
            if (!this.T || ((i = this.U) != 1 && i != 3)) {
                b();
                org.telegram.ui.ActionBar.e eVar = this.h;
                i7a A = eVar.getSendMessagesHelper().A(kz1Var.a());
                View fragmentView = eVar.getFragmentView();
                if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z = true;
                }
                Dialog visibleDialog = eVar.getVisibleDialog();
                if ((j() || kz1Var.n() || ((visibleDialog instanceof ep5) && !((ep5) visibleDialog).J)) && A != null) {
                    A = null;
                }
                pn pnVar = this.u0;
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
                        pnVar.d();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f.setDuration(220L);
                        this.f.setInterpolator(k43.f);
                        this.f.addListener(new pp4(this, (byte) 3));
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
                        setTopPadding(hl.M(getStyleHeight()));
                        wp4 wp4Var = this.p0;
                        if (wp4Var != null) {
                            ((hfa) wp4Var).b(true);
                            ((hfa) this.p0).b(false);
                        }
                    }
                    if (!this.T) {
                        if (!z) {
                            AnimatorSet animatorSet3 = this.f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f = null;
                            }
                            pnVar.d();
                            this.f = new AnimatorSet();
                            wp4 wp4Var2 = this.p0;
                            if (wp4Var2 != null) {
                                ((hfa) wp4Var2).b(true);
                            }
                            this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", hl.M(getStyleHeight())));
                            this.f.setDuration(200L);
                            this.f.addListener(new pp4(this, (byte) 4));
                            this.f.start();
                        }
                        this.T = true;
                        setVisibility(0);
                    }
                    int i3 = this.Q;
                    int i4 = A.l;
                    if (i3 != i4) {
                        this.Q = i4;
                        this.d.b(hl.S2(ob6.a0("ImportUploading", null, 2131748976, Integer.valueOf(i4))), false);
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
        org.telegram.ui.ActionBar.e eVar = this.h;
        View fragmentView = eVar.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        boolean z2 = eVar instanceof uj3;
        if (z2) {
            if (id6.g() != 0) {
                i = true;
            } else {
                i = false;
            }
        } else {
            i = id6.f(eVar.getCurrentAccount()).i(this.n.a());
        }
        zz3 zz3Var = this.t0;
        if (!i) {
            this.s0 = -1;
            hl.r(zz3Var);
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
            this.f.addListener(new pp4(this, (byte) 11));
            this.f.start();
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new oea(getContext(), 1));
        if (z && this.S == 0.0f) {
            setTopPadding(hl.M(getStyleHeight()));
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
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", hl.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new pp4(this, (byte) 0));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (z2) {
            String M02 = ob6.M0(2131748594, null);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 4; i2++) {
                arrayList.addAll(id6.f(i2).J);
            }
            if (arrayList.size() == 1) {
                hd6 hd6Var = (hd6) arrayList.get(0);
                long B0 = r47.B0(hd6Var.h.k);
                boolean D = wf3.D(B0);
                r47 r47Var = hd6Var.h;
                if (D) {
                    G = lbc.k(uc7.s1(r47Var.K1).X1(Long.valueOf(B0)), true);
                    M0 = ob6.M0(2131753958, null);
                } else {
                    TLRPC.Chat M03 = uc7.s1(r47Var.K1).M0(Long.valueOf(-B0));
                    if (M03 != null) {
                        G = M03.title;
                    } else {
                        G = "";
                    }
                    M0 = ob6.M0(2131753957, null);
                }
            } else {
                G = ob6.G(arrayList.size(), "Chats", new Object[0]);
                M0 = ob6.M0(2131753956, null);
            }
            String format = String.format(M0, M02, G);
            int indexOf = format.indexOf(M02);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            for (int i3 = 0; i3 < 2; i3++) {
                sp4 sp4Var = this.d;
                if (i3 == 0) {
                    nextTextView = sp4Var.getTextView();
                } else {
                    nextTextView = sp4Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new y7c(hl.o(), aob.v0(aob.t7, this.q0)), indexOf, M02.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        zz3Var.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i3;
        if (i == jn7.G4) {
            d(false);
        } else if (i == jn7.G2) {
            e(false);
        } else {
            int i4 = jn7.I4;
            kz1 kz1Var = this.n;
            if (i == i4) {
                if (kz1Var != null) {
                    if (kz1Var.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i != jn7.h2 && i != jn7.g2 && i != jn7.f2 && i != jn7.D2) {
                int i5 = jn7.v2;
                if (i != i5 && i != jn7.w2 && i != jn7.F2) {
                    if (i == jn7.C2) {
                        b();
                        if (this.T && this.U == 4) {
                            vc2 groupCall = kz1Var.getGroupCall();
                            if (groupCall != null && this.e != null) {
                                if (groupCall.k()) {
                                    this.e.b(ob6.W(4, groupCall.b.schedule_date, true), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    int i6 = groupCall2.participants_count;
                                    sp4 sp4Var = this.e;
                                    boolean z = groupCall2.rtmp_stream;
                                    if (i6 == 0) {
                                        if (z) {
                                            i3 = 2131743187;
                                        } else {
                                            i3 = 2131748368;
                                        }
                                        sp4Var.b(ob6.M0(i3, null), false);
                                    } else {
                                        if (z) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        sp4Var.b(ob6.G(i6, str, new Object[0]), false);
                                    }
                                }
                            }
                            o(true);
                            return;
                        }
                        return;
                    } else if (i == jn7.v1) {
                        int i7 = this.U;
                        if (i7 == 1 || i7 == 3 || i7 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i == jn7.M4) {
                        q(true);
                        return;
                    } else {
                        int i8 = jn7.Q4;
                        cb1 cb1Var = this.a;
                        if (i == i8) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                aob.E0().a(Math.max(this.M0, this.N0));
                                cb1Var.f(Math.max(this.M0, this.N0));
                                return;
                            }
                            return;
                        } else if (i == jn7.R4) {
                            b();
                            this.M0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                aob.E0().a(Math.max(this.M0, this.N0));
                                cb1Var.f(Math.max(this.M0, this.N0));
                            }
                            this.b0.invalidate();
                            return;
                        } else if (i == jn7.e2 && this.U == 0) {
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
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.y != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, sharedInstance.getChat())) {
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
        w96 w96Var = w96.N;
        pn pnVar = this.u0;
        int i = 0;
        if (w96Var != null) {
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
                pnVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(k43.f);
                this.f.addListener(new pp4(this, (byte) 6));
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
                        this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", hl.M(getStyleHeight())));
                        this.f.setDuration(220L);
                        this.f.setInterpolator(k43.f);
                        this.f.addListener(new pp4(this, (byte) 7));
                        this.f.start();
                    } else {
                        setTopPadding(hl.M(getStyleHeight()));
                        n();
                    }
                    this.T = true;
                    setVisibility(0);
                } else {
                    setTopPadding(hl.M(getStyleHeight()));
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
                    pnVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(k43.f);
                    this.f.addListener(new pp4(this, (byte) 5));
                    this.f.start();
                }
            } else if (z2 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        w96 w96Var2 = w96.N;
        if (w96Var2 != null && this.U == 6) {
            sp4 sp4Var = this.d;
            TLRPC.GroupCall groupCall = w96Var2.s;
            if (groupCall != null) {
                i = groupCall.participants_count;
            }
            sp4Var.setText(ob6.H(',', "LiveStoryTopPanelWatching", Math.max(1, i)));
        }
    }

    public final void f() {
        int i;
        TLRPC.User user;
        int i2;
        String format;
        TextView nextTextView;
        kz1 kz1Var = this.n;
        if (kz1Var != null && this.d != null) {
            b();
            long a = kz1Var.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) id6.f(currentAccount).c.f(a);
            if (!this.r0) {
                id6 f = id6.f(currentAccount);
                zh6 zh6Var = f.H;
                if (zh6Var.h(a) < 0) {
                    zh6Var.k(a, Boolean.TRUE);
                    TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                    tL_messages_getRecentLocations.peer = f.getMessagesController().j1(a);
                    tL_messages_getRecentLocations.limit = 100;
                    f.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new yu2(f, a, (byte) 2));
                }
                this.r0 = true;
            }
            if (arrayList != null) {
                long e = yac.h(currentAccount).e();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                user = null;
                i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long B1 = r47.B1(message.from_id);
                        if (user == null && B1 != e) {
                            user = uc7.s1(currentAccount).X1(Long.valueOf(B1));
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
                String M0 = ob6.M0(2131748594, null);
                if (i2 == 0) {
                    format = M0;
                } else {
                    int i4 = i2 - 1;
                    if (id6.f(currentAccount).i(a)) {
                        if (i4 != 0) {
                            if (i4 == 1 && user != null) {
                                Object[] objArr = new Object[1];
                                objArr[i] = lbc.k(user, true);
                                String a0 = ob6.a0("SharingYouAndOtherName", null, 2131745096, objArr);
                                Object[] objArr2 = new Object[2];
                                objArr2[i] = M0;
                                objArr2[1] = a0;
                                format = String.format("%1$s - %2$s", objArr2);
                            } else {
                                String M02 = ob6.M0(2131752149, null);
                                int i5 = i;
                                String G = ob6.G(i4, "AndOther", new Object[i5]);
                                Object[] objArr3 = new Object[3];
                                objArr3[i5] = M0;
                                objArr3[1] = M02;
                                objArr3[2] = G;
                                format = String.format("%1$s - %2$s %3$s", objArr3);
                            }
                        } else {
                            String M03 = ob6.M0(2131752149, null);
                            Object[] objArr4 = new Object[2];
                            objArr4[i] = M0;
                            objArr4[1] = M03;
                            format = String.format("%1$s - %2$s", objArr4);
                        }
                    } else {
                        int i6 = i;
                        if (i4 != 0) {
                            String k = lbc.k(user, true);
                            String G2 = ob6.G(i4, "AndOther", new Object[i6]);
                            Object[] objArr5 = new Object[3];
                            objArr5[i6] = M0;
                            objArr5[1] = k;
                            objArr5[2] = G2;
                            format = String.format("%1$s - %2$s %3$s", objArr5);
                        } else {
                            String k2 = lbc.k(user, true);
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
                        sp4 sp4Var = this.d;
                        if (i7 == 0) {
                            nextTextView = sp4Var.getTextView();
                        } else {
                            nextTextView = sp4Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new y7c(hl.o(), aob.v0(aob.t7, this.q0)), indexOf, M0.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z) {
        boolean z2;
        boolean z3;
        kz1 kz1Var;
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
        r47 r47Var = MediaController.z().v0;
        View fragmentView = this.h.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z2 = true;
        } else {
            z2 = z;
        }
        boolean z5 = this.T;
        pn pnVar = this.u0;
        if (r47Var != null && r47Var.e1() != 0 && !r47.K4(r47Var.k)) {
            b();
            int i2 = this.U;
            if (i2 != 0 && this.f != null && !z2) {
                this.y0 = true;
                return;
            }
            r(0);
            if (z2 && this.S == 0.0f) {
                setTopPadding(hl.M(getStyleHeight()));
                wp4 wp4Var = this.p0;
                if (wp4Var != null) {
                    ((hfa) wp4Var).b(true);
                    ((hfa) this.p0).b(false);
                }
            }
            if (!this.T) {
                if (!z2) {
                    AnimatorSet animatorSet = this.f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f = null;
                    }
                    pnVar.d();
                    this.f = new AnimatorSet();
                    wp4 wp4Var2 = this.p0;
                    if (wp4Var2 != null) {
                        ((hfa) wp4Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", hl.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new pp4(this, (byte) 2));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            boolean G = MediaController.z().G();
            mf8 mf8Var = this.c;
            if (G) {
                mf8Var.a(false, !z2);
                this.b.setContentDescription(ob6.M0(2131754925, null));
            } else {
                mf8Var.a(true, !z2);
                this.b.setContentDescription(ob6.M0(2131754926, null));
            }
            if (this.R == r47Var && i2 == 0) {
                return;
            }
            this.R = r47Var;
            if (!r47.Q4(r47Var.k) && !this.R.g4()) {
                this.W = true;
                if (this.G != null) {
                    int i3 = (r47Var.L0() > 600.0d ? 1 : (r47Var.L0() == 600.0d ? 0 : -1));
                    s7 s7Var = this.G;
                    if (i3 >= 0) {
                        s7Var.setAlpha(1.0f);
                        this.G.setEnabled(true);
                        this.d.setPadding(0, 0, hl.L(44.0f) + this.N, 0);
                        q(false);
                    } else {
                        s7Var.setAlpha(0.0f);
                        this.G.setEnabled(false);
                        this.d.setPadding(0, 0, this.N, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.N, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(qd4.p(r47Var.w1(true), " - ", r47Var.y1(true)));
                for (int i4 = 0; i4 < 2; i4++) {
                    sp4 sp4Var = this.d;
                    if (i4 == 0) {
                        nextTextView2 = sp4Var.getTextView();
                    } else {
                        nextTextView2 = sp4Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.W = false;
                s7 s7Var2 = this.G;
                if (s7Var2 != null) {
                    s7Var2.setAlpha(1.0f);
                    this.G.setEnabled(true);
                }
                this.d.setPadding(0, 0, hl.L(44.0f) + this.N, 0);
                spannableStringBuilder = new SpannableStringBuilder(qd4.p(r47Var.w1(true), " ", r47Var.y1(true)));
                for (int i5 = 0; i5 < 2; i5++) {
                    sp4 sp4Var2 = this.d;
                    if (i5 == 0) {
                        nextTextView = sp4Var2.getTextView();
                    } else {
                        nextTextView = sp4Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new y7c(hl.o(), aob.v0(aob.t7, this.q0)), 0, r47Var.w1(true).length(), 18);
            this.d.b(spannableStringBuilder, (!z2 && z5 && this.W) ? false : false);
            return;
        }
        this.R = null;
        if (this.a0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !ra5.d()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!j() && !z3 && (kz1Var = this.n) != null && !ra5.d()) {
            vc2 groupCall = kz1Var.getGroupCall();
            if (groupCall != null && groupCall.A()) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z3) {
            a(false);
        } else if (this.T) {
            s7 s7Var3 = this.G;
            if (s7Var3 != null && s7Var3.y()) {
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
            pnVar.d();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            wp4 wp4Var3 = this.p0;
            if (wp4Var3 != null) {
                ((hfa) wp4Var3).b(true);
            }
            this.f.addListener(new pp4(this, (byte) 1));
            this.f.start();
        } else {
            setVisibility(8);
        }
    }

    public cb1 getCapsuleBlobDrawable() {
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
        int i = aob.j5;
        vnb vnbVar = this.q0;
        s7 s7Var = new s7(context, null, 0, aob.v0(i, vnbVar), false, this.q0);
        this.G = s7Var;
        if (s7Var.getIconView() != null) {
            yob.s(this.G.getIconView(), i, vnbVar, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(hl.L(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(ob6.M0(2131754800, null));
        this.G.setDelegate(new lp4(this));
        s7 s7Var2 = this.G;
        zoa zoaVar = new zoa();
        this.H = zoaVar;
        s7Var2.setIcon(zoaVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        w7 w7Var = new w7(getContext(), vnbVar);
        this.I = w7Var;
        w7Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new n82(this, (byte) 29));
        q7 A = this.G.A(0, 2131232378, ob6.M0(2131744923, null));
        q7[] q7VarArr = this.J;
        q7VarArr[0] = A;
        q7VarArr[1] = this.G.A(1, 2131232377, ob6.M0(2131744924, null));
        q7VarArr[2] = this.G.A(2, 2131232376, ob6.M0(2131744925, null));
        q7VarArr[3] = this.G.A(3, 2131232375, ob6.M0(2131744927, null));
        q7VarArr[4] = this.G.A(4, 2131232380, ob6.M0(2131744921, null));
        q7VarArr[5] = this.G.A(5, 2131232379, ob6.M0(2131744922, null));
        if (hl.p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(hl.L(8.0f));
        addView(this.G, tre.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new je3(this, fArr, (byte) 13));
        this.G.setOnLongClickListener(new zs(this, (byte) 4));
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

    public final void k(hd6 hd6Var) {
        if (hd6Var != null) {
            org.telegram.ui.ActionBar.e eVar = this.h;
            if (eVar.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) eVar.getParentActivity();
                launchActivity.N0(hd6Var.h.K1);
                uc6 uc6Var = new uc6(2);
                uc6Var.G0(hd6Var.h);
                uc6Var.M0 = new i02(hd6Var, r47.B0(hd6Var.h.k), (byte) 6);
                launchActivity.t0(uc6Var);
            }
        }
    }

    public final void l(float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.l(float, float, boolean):void");
    }

    public final void m() {
        u8a u8aVar = this.L0;
        if (u8aVar != null) {
            u8aVar.a();
            this.L0 = null;
        }
        for (int i = 0; i < 4; i++) {
            gn7[] gn7VarArr = this.K0;
            gn7 gn7Var = gn7VarArr[i];
            if (gn7Var != null) {
                gn7Var.a();
                gn7VarArr[i] = null;
            }
        }
    }

    public final void n() {
        fe1 fe1Var = this.O;
        if (fe1Var != null && fe1Var.g >= 1.0f) {
            this.O0 = false;
            hl.d3(new op4(this, (byte) 0), 150L);
            return;
        }
        this.O0 = true;
    }

    public final void o(boolean z) {
        vc2 vc2Var;
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
        ic0 ic0Var = this.b0.a;
        if (ic0Var.f == null) {
            int i3 = this.U;
            int i4 = this.n0;
            kz1 kz1Var = this.n;
            if (i3 == 4) {
                if (kz1Var != null) {
                    vc2Var = kz1Var.getGroupCall();
                    i4 = this.h.getCurrentAccount();
                } else {
                    vc2Var = null;
                }
                i = i4;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                vc2Var = VoIPService.getSharedInstance().groupCall;
                if (kz1Var != null) {
                    user = null;
                } else {
                    user = VoIPService.getSharedInstance().getUser();
                }
                i = VoIPService.getSharedInstance().getAccount();
            } else {
                vc2Var = null;
                i = i4;
                user = null;
            }
            int i5 = 0;
            if (vc2Var != null) {
                ArrayList arrayList = vc2Var.e;
                int size = arrayList.size();
                for (int i6 = 0; i6 < 3; i6++) {
                    jc0 jc0Var = this.b0;
                    if (i6 < size) {
                        jc0Var.b(i6, i, (TLObject) arrayList.get(i6));
                    } else {
                        jc0Var.b(i6, i, null);
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
            if (this.U == 4 && vc2Var != null) {
                if (!vc2Var.b.rtmp_stream) {
                    i5 = Math.min(3, vc2Var.e.size());
                }
                if (i5 == 0) {
                    h = 10;
                } else {
                    h = bp1.h(i5, 1, 24, 52);
                }
                int i9 = h + 3;
                sp4 sp4Var = this.d;
                if (z) {
                    int i10 = ((FrameLayout.LayoutParams) sp4Var.getLayoutParams()).leftMargin;
                    if (hl.L(i9) != i10) {
                        float translationX = (this.d.getTranslationX() + i10) - hl.L(f);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        k43 k43Var = k43.f;
                        duration.setInterpolator(k43Var);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(k43Var);
                    }
                } else {
                    sp4Var.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                sp4 sp4Var2 = this.d;
                float f2 = i9;
                int i11 = 36;
                if (vc2Var.k()) {
                    i2 = 90;
                } else {
                    i2 = 36;
                }
                sp4Var2.setLayoutParams(tre.d(-1, 20.0f, 51, f2, 5.0f, i2, 0.0f));
                sp4 sp4Var3 = this.e;
                if (vc2Var.k()) {
                    i11 = 90;
                }
                sp4Var3.setLayoutParams(tre.d(-1, 20.0f, 51, f2, 25.0f, i11, 0.0f));
                return;
            }
            return;
        }
        ic0Var.g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        m();
        int i = 15;
        if (this.o0) {
            u8a u8aVar = new u8a(jn7.e(), this);
            u8aVar.b(jn7.G4);
            u8aVar.b(jn7.I4);
            this.L0 = u8aVar;
            d(true);
        } else {
            for (int i2 = 0; i2 < 4; i2++) {
                u8a u8aVar2 = new u8a(jn7.f(i2), this);
                u8aVar2.b(jn7.f2);
                u8aVar2.b(jn7.g2);
                u8aVar2.b(jn7.h2);
                u8aVar2.b(jn7.w2);
                u8aVar2.b(jn7.C2);
                u8aVar2.b(jn7.v1);
                u8aVar2.b(jn7.G2);
                u8aVar2.b(jn7.e2);
                this.K0[i2] = u8aVar2;
                GroupCallMessagesController.getInstance(i2).subscribeToCallMessages(0L, this);
            }
            u8a u8aVar3 = new u8a(jn7.e(), this);
            u8aVar3.b(jn7.M4);
            u8aVar3.b(jn7.v2);
            u8aVar3.b(jn7.D2);
            u8aVar3.b(jn7.R4);
            u8aVar3.b(jn7.Q4);
            u8aVar3.b(jn7.F2);
            this.L0 = u8aVar3;
            if (w96.N != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !ra5.d()) {
                a(true);
            } else {
                kz1 kz1Var = this.n;
                if (kz1Var != null && this.h.getSendMessagesHelper().A(kz1Var.a()) != null && !j()) {
                    c(true);
                } else if (kz1Var != null && kz1Var.getGroupCall() != null && kz1Var.getGroupCall().A() && !ra5.d() && !j()) {
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
            ArrayList arrayList = aob.E0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            cb1 cb1Var = this.a;
            if (!cb1Var.u) {
                cb1Var.u = true;
                cb1Var.t = SystemClock.elapsedRealtime();
                jh2.d().a(60, cb1Var.F);
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
                b29 b29Var = this.E;
                if (!z) {
                    i = 29;
                }
                b29Var.K(i);
                b29 b29Var2 = this.E;
                b29Var2.I(b29Var2.f - 1, false, true);
                this.y.invalidate();
            }
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(hl.M(getStyleHeight()));
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
        cb1 cb1Var = this.a;
        if (z2 != z) {
            this.P = z;
            b29 b29Var = this.E;
            if (z) {
                i = 15;
            } else {
                i = 29;
            }
            b29Var.K(i);
            b29 b29Var2 = this.E;
            b29Var2.I(b29Var2.f - 1, false, true);
            this.y.invalidate();
            aob.E0().c(this.T);
            cb1Var.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            aob.E0().a(0.0f);
            cb1Var.f(0.0f);
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
            hl.r(this.m0);
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
            yp4 E0 = aob.E0();
            ArrayList arrayList = E0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.b;
                E0.b = null;
                E0.c = null;
            }
            cb1 cb1Var = this.a;
            if (cb1Var.u) {
                cb1Var.u = false;
                jh2.d().g(cb1Var.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, hl.M(getStyleHeight()));
    }

    @Override
    public final void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage) {
        if (this.s != null) {
            int i = this.U;
            if ((i == 1 || i == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j) {
                this.V0++;
                if (!groupCallMessage.isOut()) {
                    this.U0.h(new vp4(this.s, groupCallMessage), true);
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
        vc2 vc2Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i = this.U;
            if (i == 1 || i == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(ob6.M0(2131743044, null), false);
                } else if (sharedInstance.isConference() && (vc2Var = sharedInstance.groupCall) != null) {
                    if (vc2Var.e.size() <= 1) {
                        this.d.b(ob6.M0(2131751788, null), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.e.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(wf3.r(sharedInstance.getAccount(), wf3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i2)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb.append(" ");
                        sb.append(ob6.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    kz1 kz1Var = this.n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                            this.d.b(sharedInstance.groupCall.b.title, false);
                        } else if (kz1Var != null && kz1Var.e() != null && kz1Var.e().id == sharedInstance.getChat().id) {
                            TLRPC.Chat e = kz1Var.e();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(ob6.M0(2131743100, null), false);
                                return;
                            }
                            boolean W = xc2.W(e);
                            sp4 sp4Var = this.d;
                            if (W) {
                                sp4Var.b(ob6.M0(2131743100, null), false);
                            } else {
                                sp4Var.b(ob6.M0(2131742959, null), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (kz1Var != null && kz1Var.h() != null && kz1Var.h().id == user.id) {
                            this.d.setText(ob6.M0(2131745773, null));
                        } else {
                            this.d.setText(lv2.m(0, user.first_name, user.last_name));
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
        float A = MediaController.z().A(this.W);
        this.H.b(z, A);
        updateColors();
        boolean z2 = this.A0;
        int i = 0;
        this.A0 = false;
        while (true) {
            q7[] q7VarArr = this.J;
            if (i < q7VarArr.length) {
                vnb vnbVar = this.q0;
                if (!z2 && Math.abs(A - W0[i]) < 0.05f) {
                    q7 q7Var = q7VarArr[i];
                    int i2 = aob.Hi;
                    q7Var.a(aob.v0(i2, vnbVar), aob.v0(i2, vnbVar));
                } else {
                    q7 q7Var2 = q7VarArr[i];
                    int i3 = aob.E8;
                    q7Var2.a(aob.v0(i3, vnbVar), aob.v0(i3, vnbVar));
                }
                i++;
            } else {
                this.I.e(z, A);
                return;
            }
        }
    }

    public final void r(int i) {
        boolean z;
        sp4 sp4Var;
        TextView nextTextView;
        int i2;
        int i3;
        boolean z2;
        int i4;
        sp4 sp4Var2;
        TextView nextTextView2;
        sp4 sp4Var3;
        int i5;
        TextView nextTextView3;
        sp4 sp4Var4;
        TextView nextTextView4;
        TextView nextTextView5;
        if (this.U != i) {
            b();
            int i6 = this.U;
            cb1 cb1Var = this.a;
            boolean z3 = true;
            int i7 = 0;
            if (i6 == 3 || i6 == 1) {
                yp4 E0 = aob.E0();
                ArrayList arrayList = E0.l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    E0.d = E0.b;
                    E0.b = null;
                    E0.c = null;
                }
                if (cb1Var.u) {
                    cb1Var.u = false;
                    jh2.d().g(cb1Var.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                xa9 xa9Var = this.U0;
                if (xa9Var != null) {
                    xa9Var.h(null, true);
                }
            }
            this.U = i;
            rp4 rp4Var = this.r;
            if (i != 4) {
                z = true;
            } else {
                z = false;
            }
            rp4Var.setWillNotDraw(z);
            if (i != 4) {
                this.h0 = false;
            }
            jc0 jc0Var = this.b0;
            if (jc0Var != null) {
                jc0Var.setStyle(this.U);
                this.b0.setLayoutParams(tre.e(108, getStyleHeight(), 51));
            }
            this.r.setLayoutParams(tre.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f = this.S;
            if (f > 0.0f && f != hl.M(getStyleHeight())) {
                setTopPadding(hl.M(getStyleHeight()));
            }
            vnb vnbVar = this.q0;
            if (i == 6) {
                this.w.setBackground(aob.L0(false));
                this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.v0(aob.el, vnbVar), aob.v0(aob.fl, vnbVar)}));
                this.r.setTag(null);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.y.setVisibility(8);
                this.x.setVisibility(8);
                this.x.i();
                this.b0.setVisibility(8);
                this.d.setTag(Integer.valueOf(aob.A7));
                while (true) {
                    sp4 sp4Var5 = this.d;
                    if (i7 < 2) {
                        if (i7 == 0) {
                            nextTextView5 = sp4Var5.getTextView();
                        } else {
                            nextTextView5 = sp4Var5.getNextTextView();
                        }
                        if (nextTextView5 != null) {
                            nextTextView5.setGravity(19);
                            yob.X(nextTextView5, aob.A7, vnbVar);
                            nextTextView5.setTypeface(hl.o());
                            nextTextView5.setTextSize(1, 15.0f);
                        }
                        i7++;
                    } else {
                        sp4Var5.setLayoutParams(tre.d(-2, -2.0f, 17, 0.0f, -1.0f, 0.0f, 0.0f));
                        return;
                    }
                }
            } else if (i == 5) {
                this.w.setBackground(aob.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(aob.v7));
                int i8 = 0;
                while (true) {
                    sp4Var4 = this.d;
                    if (i8 >= 2) {
                        break;
                    }
                    if (i8 == 0) {
                        nextTextView4 = sp4Var4.getTextView();
                    } else {
                        nextTextView4 = sp4Var4.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        yob.X(nextTextView4, aob.u7, vnbVar);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                    i8++;
                }
                sp4Var4.setTag(Integer.valueOf(aob.u7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.y.setVisibility(8);
                this.b0.setVisibility(8);
                this.x.setVisibility(0);
                this.x.d();
                this.F.setContentDescription(ob6.M0(2131754896, null));
                s7 s7Var = this.G;
                if (s7Var != null) {
                    s7Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(tre.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
            } else if (i != 0 && i != 2) {
                if (i == 4) {
                    this.w.setBackground(aob.L0(false));
                    this.r.setBackgroundColor(0);
                    this.r.setTag(Integer.valueOf(aob.v7));
                    this.y.setVisibility(8);
                    this.e.setVisibility(0);
                    int i9 = 0;
                    while (true) {
                        sp4Var3 = this.d;
                        if (i9 >= 2) {
                            break;
                        }
                        if (i9 == 0) {
                            nextTextView3 = sp4Var3.getTextView();
                        } else {
                            nextTextView3 = sp4Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            yob.X(nextTextView3, aob.t7, vnbVar);
                            nextTextView3.setTypeface(hl.o());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                        i9++;
                    }
                    sp4Var3.setTag(Integer.valueOf(aob.t7));
                    this.d.setPadding(0, 0, this.N, 0);
                    this.x.setVisibility(8);
                    this.x.i();
                    kz1 kz1Var = this.n;
                    if (kz1Var == null || kz1Var.getGroupCall() == null || kz1Var.getGroupCall().b == null || !kz1Var.getGroupCall().b.rtmp_stream) {
                        z3 = false;
                    }
                    jc0 jc0Var2 = this.b0;
                    if (!z3) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    jc0Var2.setVisibility(i5);
                    if (this.b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-hl.L(36.0f));
                        this.e.setTranslationX(-hl.L(36.0f));
                    }
                    this.F.setVisibility(8);
                    this.b.setVisibility(8);
                    s7 s7Var2 = this.G;
                    if (s7Var2 != null) {
                        s7Var2.setVisibility(8);
                        this.G.setTag(null);
                    }
                } else if (i == 1 || i == 3) {
                    this.w.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    jc0 jc0Var3 = this.b0;
                    if (!hasRtmpStream) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    jc0Var3.setVisibility(i2);
                    if (i == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    up4 up4Var = this.y;
                    if (!hasRtmpStream) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    up4Var.setVisibility(i3);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.P = z2;
                    b29 b29Var = this.E;
                    if (z2) {
                        i4 = 15;
                    } else {
                        i4 = 29;
                    }
                    b29Var.K(i4);
                    b29 b29Var2 = this.E;
                    b29Var2.I(b29Var2.f - 1, false, true);
                    this.y.invalidate();
                    this.r.setBackground(null);
                    this.r.setBackgroundColor(0);
                    this.x.setVisibility(8);
                    this.x.i();
                    ArrayList arrayList2 = aob.E0().l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!cb1Var.u) {
                        cb1Var.u = true;
                        cb1Var.t = SystemClock.elapsedRealtime();
                        jh2.d().a(60, cb1Var.F);
                    }
                    invalidate();
                    int i10 = 0;
                    while (true) {
                        sp4Var2 = this.d;
                        if (i10 >= 2) {
                            break;
                        }
                        if (i10 == 0) {
                            nextTextView2 = sp4Var2.getTextView();
                        } else {
                            nextTextView2 = sp4Var2.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            yob.X(nextTextView2, aob.A7, vnbVar);
                            nextTextView2.setTypeface(hl.o());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                        i10++;
                    }
                    sp4Var2.setTag(Integer.valueOf(aob.A7));
                    this.F.setVisibility(8);
                    this.b.setVisibility(8);
                    this.e.setVisibility(8);
                    this.M.setVisibility(8);
                    this.d.setLayoutParams(tre.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setPadding(hl.L(88.0f), 0, hl.L(88.0f) + this.N, 0);
                    s7 s7Var3 = this.G;
                    if (s7Var3 != null) {
                        s7Var3.setVisibility(8);
                        this.G.setTag(null);
                    }
                }
            } else {
                this.w.setBackground(aob.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(aob.v7));
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
                    sp4Var = this.d;
                    if (i11 >= 2) {
                        break;
                    }
                    if (i11 == 0) {
                        nextTextView = sp4Var.getTextView();
                    } else {
                        nextTextView = sp4Var.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        yob.X(nextTextView, aob.u7, vnbVar);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                    i11++;
                }
                sp4Var.setTag(Integer.valueOf(aob.u7));
                ImageView imageView = this.b;
                if (i == 6) {
                    imageView.setLayoutParams(tre.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(tre.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                    this.F.setVisibility(8);
                } else if (i == 0) {
                    imageView.setLayoutParams(tre.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(tre.d(-1, 36.0f, 51, 37.0f, 0.0f, 36.0f, 0.0f));
                    h();
                    s7 s7Var4 = this.G;
                    if (s7Var4 != null) {
                        s7Var4.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(ob6.M0(2131754896, null));
                } else {
                    imageView.setLayoutParams(tre.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(tre.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                    this.F.setContentDescription(ob6.M0(2131754750, null));
                }
            }
        }
    }

    public void setDelegate(wp4 wp4Var) {
        this.p0 = wp4Var;
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
        e29 e29Var = this.x;
        if (e29Var != null) {
            e29Var.setTranslationX(f);
        }
        sp4 sp4Var = this.d;
        if (sp4Var != null) {
            sp4Var.setTranslationX(f);
        }
        sp4 sp4Var2 = this.e;
        if (sp4Var2 != null) {
            sp4Var2.setTranslationX(f);
        }
        jc0 jc0Var = this.b0;
        if (jc0Var != null) {
            jc0Var.setTranslationX(f);
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
        y7c[] y7cVarArr;
        TextView nextTextView2;
        cb1 cb1Var = this.a;
        int i2 = cb1Var.A;
        if (i2 >= 0) {
            cb1Var.E = 1.0f;
            cb1Var.a(cb1.e(i2));
        }
        if (!i(MediaController.z().A(this.W), 1.0f)) {
            i = aob.Hi;
        } else {
            i = aob.x7;
        }
        vnb vnbVar = this.q0;
        int v0 = aob.v0(i, vnbVar);
        zoa zoaVar = this.H;
        if (zoaVar != null) {
            zoaVar.a.u(v0);
            Paint paint = zoaVar.b;
            if (paint != null) {
                paint.setColor(v0);
            }
        }
        s7 s7Var = this.G;
        if (s7Var != null) {
            Drawable background = s7Var.getBackground();
            if (background != null && background == this.E0) {
                if (v0 != this.J0) {
                    this.J0 = v0;
                    aob.F1(background, v0 & 436207615, true);
                }
            } else {
                s7 s7Var2 = this.G;
                hf0 f0 = aob.f0(436207615 & v0, 1, hl.L(14.0f));
                this.E0 = f0;
                s7Var2.setBackground(f0);
                this.J0 = v0;
            }
        }
        if (this.b != null) {
            int v02 = aob.v0(aob.w7, vnbVar);
            if (this.F0 == null || v02 != this.H0) {
                ImageView imageView = this.b;
                this.H0 = v02;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int v03 = aob.v0(aob.x7, vnbVar);
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
                sp4 sp4Var = this.e;
                if (i3 == 0) {
                    nextTextView2 = sp4Var.getTextView();
                } else {
                    nextTextView2 = sp4Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(aob.v0(aob.x7, vnbVar));
                }
            }
        }
        sp4 sp4Var2 = this.d;
        if (sp4Var2 != null) {
            Object tag = sp4Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i4 = 0; i4 < 2; i4++) {
                    sp4 sp4Var3 = this.d;
                    if (i4 == 0) {
                        nextTextView = sp4Var3.getTextView();
                    } else {
                        nextTextView = sp4Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(aob.v0(intValue, vnbVar));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (y7cVarArr = (y7c[]) ((Spanned) text).getSpans(0, text.length(), y7c.class)) != null) {
                            for (y7c y7cVar : y7cVarArr) {
                                y7cVar.b = aob.v0(aob.t7, vnbVar);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
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

    public FragmentContextView(Context context, uj3 uj3Var, boolean z) {
        this(context, uj3Var, null, z, null);
    }
}
