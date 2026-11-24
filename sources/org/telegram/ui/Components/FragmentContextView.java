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
public class FragmentContextView extends FrameLayout implements gk7, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, tjb {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public je5 B0;
    public ViewGroup C0;
    public long D0;
    public oy8 E;
    public ff0 E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public r7 G;
    public PorterDuffColorFilter G0;
    public cla H;
    public int H0;
    public v7 I;
    public int I0;
    public final p7[] J;
    public int J0;
    public FrameLayout K;
    public final hk7[] K0;
    public ImageView L;
    public wtc L0;
    public xw0 M;
    public float M0;
    public int N;
    public float N0;
    public wd1 O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public k27 R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final k79 U0;
    public String V;
    public int V0;
    public boolean W;
    public final ua1 a;
    public boolean a0;
    public ImageView b;
    public hc0 b0;
    public xb8 c;
    public Paint c0;
    public nn4 d;
    public LinearGradient d0;
    public nn4 e;
    public Matrix e0;
    public AnimatorSet f;
    public int f0;
    public TextPaint g0;
    public final org.telegram.ui.ActionBar.d h;
    public boolean h0;
    public boolean i0;
    public final gn j0;
    public n41 k0;
    public boolean l0;
    public final ln4 m0;
    public final sy1 n;
    public final int n0;
    public final boolean o0;
    public rn4 p0;
    public final wjb q0;
    public mn4 r;
    public boolean r0;
    public a6 s;
    public int s0;
    public final ez3 t0;
    public final on u0;
    public final on v0;
    public View w;
    public boolean w0;
    public ry8 x;
    public boolean x0;
    public pn4 y;
    public boolean y0;
    public boolean z0;

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.d dVar, FrameLayout frameLayout, boolean z, wjb wjbVar) {
        super(context);
        this.a = new ua1();
        this.J = new p7[6];
        this.Q = -1;
        this.U = -1;
        this.a0 = true;
        this.j0 = new gn(false, true, true);
        this.m0 = new ln4(this);
        this.n0 = y6c.t0;
        this.s0 = -1;
        this.t0 = new ez3(this, (byte) 7);
        this.u0 = new on(null);
        this.v0 = new on(new int[]{kk7.C});
        this.K0 = new hk7[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new k79(new gn4(this), s33.h, 450L);
        this.V0 = 0;
        this.q0 = wjbVar;
        this.h = dVar;
        if (dVar instanceof sy1) {
            this.n = (sy1) dVar;
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
        wjb wjbVar = this.q0;
        if (i == 4) {
            return bkb.v0(bkb.s7, wjbVar);
        }
        if (i != 1 && i != 3) {
            return bkb.v0(bkb.t7, wjbVar);
        }
        return bkb.v0(bkb.z7, wjbVar);
    }

    public static boolean i(float f, float f2) {
        if (Math.abs(f - f2) < 0.05f) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && k27.Q4(k27Var.k)) {
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
        mn4 mn4Var = new mn4(this, context);
        this.r = mn4Var;
        this.k0 = new n41(mn4Var);
        int i = gl.q.x;
        gn gnVar = this.j0;
        gnVar.N = i;
        gnVar.B = 0.4f;
        gnVar.setCallback(mn4Var);
        gnVar.u(-1);
        gnVar.w(gl.L(14.0f));
        gnVar.x(gl.o());
        addView(this.r, nme.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w = view;
        this.r.addView(view, nme.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i2 = bkb.v7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        wjb wjbVar = this.q0;
        zkb.s(imageView2, i2, wjbVar, mode);
        ImageView imageView3 = this.b;
        xb8 xb8Var = new xb8(16);
        this.c = xb8Var;
        imageView3.setImageDrawable(xb8Var);
        this.b.setBackground(bkb.f0(bkb.v0(i2, wjbVar) & 436207615, 1, gl.L(14.0f)));
        addView(this.b, nme.e(36, 36, 51));
        this.b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                fc2 groupCall;
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
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i5 = fragmentContextView.U;
                        if (i5 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i6 = t76Var.e;
                                if (i6 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i6).M1().t(t76Var.c, j2)) != null) {
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
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        return;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (sy1Var2 != null) {
                                    j3 = sy1Var2.a();
                                }
                                if (k27.B0(k27Var.k) == j3) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k27.B0(k27Var.k);
                                Bundle bundle = new Bundle();
                                if (cf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (cf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k27Var.e1());
                                dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                return;
                            }
                            return;
                        } else if (i5 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i5 == 2) {
                            int i7 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i3 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!eb6.f(i8).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i8).J.get(0);
                                            j = db6Var.a;
                                            i3 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i3 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i3).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                return;
                            }
                        } else if (i5 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i5 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i5 == 5) {
                            mu1 mu1Var = (mu1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bn5Var);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            oy8 oy8Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i4 = 15;
                            } else {
                                i4 = 29;
                            }
                            if (oy8Var.K(i4)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var2 = fragmentContextView.E;
                                if (z3) {
                                    oy8Var2.H(0);
                                } else {
                                    oy8Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        zkb.B(this.x, bkb.K(gl.L(22.0f), bkb.v0(i2, wjbVar)), zkb.M(i2), wjbVar);
        addView(this.x, nme.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        nn4 nn4Var = new nn4(this, context, context, (byte) 0);
        this.d = nn4Var;
        addView(nn4Var, nme.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
        nn4 nn4Var2 = new nn4(this, context, context, (byte) 1);
        this.e = nn4Var2;
        addView(nn4Var2, nme.d(-1, 36.0f, 51, 35.0f, 10.0f, 36.0f, 0.0f));
        wd1 wd1Var = new wd1();
        this.O = wd1Var;
        wd1Var.g = 1.0f;
        wd1Var.j = false;
        xw0 xw0Var = new xw0((byte) 2, context, this);
        this.M = xw0Var;
        xw0Var.setText(k96.M0(2131743200, null));
        zkb.X(this.M, bkb.Ii, wjbVar);
        xw0 xw0Var2 = this.M;
        int L = gl.L(16.0f);
        int i3 = bkb.Ei;
        int v0 = bkb.v0(i3, wjbVar);
        int i4 = bkb.Gi;
        int v02 = bkb.v0(i4, wjbVar);
        zkb.R(xw0Var2, bkb.i0(L, L, L, L, v0, v02, v02), zkb.M(i3), zkb.M(i4), wjbVar);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(gl.o());
        this.M.setGravity(17);
        this.M.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        addView(this.M, nme.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                fc2 groupCall;
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
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i5 = fragmentContextView.U;
                        if (i5 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i6 = t76Var.e;
                                if (i6 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i6).M1().t(t76Var.c, j2)) != null) {
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
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        return;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (sy1Var2 != null) {
                                    j3 = sy1Var2.a();
                                }
                                if (k27.B0(k27Var.k) == j3) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k27.B0(k27Var.k);
                                Bundle bundle = new Bundle();
                                if (cf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (cf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k27Var.e1());
                                dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                return;
                            }
                            return;
                        } else if (i5 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i5 == 2) {
                            int i7 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!eb6.f(i8).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i8).J.get(0);
                                            j = db6Var.a;
                                            i32 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i32).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                return;
                            }
                        } else if (i5 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i5 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i5 == 5) {
                            mu1 mu1Var = (mu1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bn5Var);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            oy8 oy8Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (oy8Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var2 = fragmentContextView.E;
                                if (z3) {
                                    oy8Var2.H(0);
                                } else {
                                    oy8Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        int i5 = bkb.w7;
        zkb.s(imageView6, i5, wjbVar, mode);
        this.K.addView(this.L, nme.e(20, 20, 17));
        this.K.setBackground(bkb.f0(bkb.v0(i5, wjbVar) & 436207615, 1, gl.L(14.0f)));
        this.K.setContentDescription(k96.M0(2131743610, null));
        this.K.setOnClickListener(new x00((byte) 7));
        this.K.setVisibility(8);
        addView(this.K, nme.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.o0) {
            h();
        }
        hc0 hc0Var = new hc0(context, false);
        this.b0 = hc0Var;
        hc0Var.setAvatarsTextSize(gl.L(21.0f));
        this.b0.setDelegate(new jn4(this, (byte) 1));
        this.b0.setVisibility(8);
        addView(this.b0, nme.e(108, 36, 51));
        this.E = new oy8(2131624328, gl.L(16.0f), gl.L(20.0f), true, null);
        pn4 pn4Var = new pn4(this, context);
        this.y = pn4Var;
        zkb.s(pn4Var, bkb.z7, wjbVar, PorterDuff.Mode.SRC_IN);
        this.y.setBackground(bkb.f0(bkb.v0(i5, wjbVar) & 436207615, 1, gl.L(14.0f)));
        this.y.setAnimation(this.E);
        this.y.setScaleType(scaleType);
        this.y.setVisibility(8);
        addView(this.y, nme.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.y.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                fc2 groupCall;
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
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i52 = fragmentContextView.U;
                        if (i52 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i6 = t76Var.e;
                                if (i6 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i6).M1().t(t76Var.c, j2)) != null) {
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
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        return;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (sy1Var2 != null) {
                                    j3 = sy1Var2.a();
                                }
                                if (k27.B0(k27Var.k) == j3) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k27.B0(k27Var.k);
                                Bundle bundle = new Bundle();
                                if (cf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (cf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k27Var.e1());
                                dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                return;
                            }
                            return;
                        } else if (i52 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i52 == 2) {
                            int i7 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!eb6.f(i8).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i8).J.get(0);
                                            j = db6Var.a;
                                            i32 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i32).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                return;
                            }
                        } else if (i52 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i52 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i52 == 5) {
                            mu1 mu1Var = (mu1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bn5Var);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            oy8 oy8Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (oy8Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var2 = fragmentContextView.E;
                                if (z3) {
                                    oy8Var2.H(0);
                                } else {
                                    oy8Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        zkb.s(this.F, i5, wjbVar, mode);
        this.F.setBackground(bkb.f0(bkb.v0(i5, wjbVar) & 436207615, 1, gl.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, nme.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                fc2 groupCall;
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
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i52 = fragmentContextView.U;
                        if (i52 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i6 = t76Var.e;
                                if (i6 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i6).M1().t(t76Var.c, j2)) != null) {
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
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        return;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (sy1Var2 != null) {
                                    j3 = sy1Var2.a();
                                }
                                if (k27.B0(k27Var.k) == j3) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k27.B0(k27Var.k);
                                Bundle bundle = new Bundle();
                                if (cf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (cf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k27Var.e1());
                                dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                return;
                            }
                            return;
                        } else if (i52 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i52 == 2) {
                            int i7 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!eb6.f(i8).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i8).J.get(0);
                                            j = db6Var.a;
                                            i32 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i32).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                return;
                            }
                        } else if (i52 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i52 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i52 == 5) {
                            mu1 mu1Var = (mu1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bn5Var);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            oy8 oy8Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (oy8Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var2 = fragmentContextView.E;
                                if (z3) {
                                    oy8Var2.H(0);
                                } else {
                                    oy8Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        addView(a6Var, nme.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                fc2 groupCall;
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
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.T2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                return;
                            }
                            return;
                        }
                        MediaController.w().l(true, true, false, false);
                        return;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i52 = fragmentContextView.U;
                        if (i52 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i6 = t76Var.e;
                                if (i6 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i6);
                                    } else {
                                        return;
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i6).M1().t(t76Var.c, j2)) != null) {
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
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        return;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (sy1Var2 != null) {
                                    j3 = sy1Var2.a();
                                }
                                if (k27.B0(k27Var.k) == j3) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    return;
                                }
                                long B0 = k27.B0(k27Var.k);
                                Bundle bundle = new Bundle();
                                if (cf3.B(B0)) {
                                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                } else if (cf3.D(B0)) {
                                    bundle.putLong("user_id", B0);
                                } else {
                                    bundle.putLong("chat_id", -B0);
                                }
                                bundle.putInt("message_id", k27Var.e1());
                                dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                return;
                            }
                            return;
                        } else if (i52 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i52 == 2) {
                            int i7 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        if (!eb6.f(i8).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i8).J.get(0);
                                            j = db6Var.a;
                                            i32 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i7;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i32).h(j));
                                return;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                return;
                            }
                        } else if (i52 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i52 == 4) {
                            if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i52 == 5) {
                            mu1 mu1Var = (mu1) dVar2;
                            if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                dVar2.showDialog(bn5Var);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                    return;
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            oy8 oy8Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i42 = 15;
                            } else {
                                i42 = 29;
                            }
                            if (oy8Var.K(i42)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var2 = fragmentContextView.E;
                                if (z3) {
                                    oy8Var2.H(0);
                                } else {
                                    oy8Var2.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        sy1 sy1Var = this.n;
        if (sy1Var != null) {
            if (!this.T || ((i = this.U) != 1 && i != 3)) {
                b();
                org.telegram.ui.ActionBar.d dVar = this.h;
                p3a A = dVar.getSendMessagesHelper().A(sy1Var.a());
                View fragmentView = dVar.getFragmentView();
                if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z = true;
                }
                Dialog visibleDialog = dVar.getVisibleDialog();
                if ((j() || sy1Var.n() || ((visibleDialog instanceof bn5) && !((bn5) visibleDialog).J)) && A != null) {
                    A = null;
                }
                on onVar = this.u0;
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
                        onVar.d();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f.setDuration(220L);
                        this.f.setInterpolator(s33.f);
                        this.f.addListener(new kn4(this, (byte) 3));
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
                        setTopPadding(gl.M(getStyleHeight()));
                        rn4 rn4Var = this.p0;
                        if (rn4Var != null) {
                            ((qba) rn4Var).b(true);
                            ((qba) this.p0).b(false);
                        }
                    }
                    if (!this.T) {
                        if (!z) {
                            AnimatorSet animatorSet3 = this.f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f = null;
                            }
                            onVar.d();
                            this.f = new AnimatorSet();
                            rn4 rn4Var2 = this.p0;
                            if (rn4Var2 != null) {
                                ((qba) rn4Var2).b(true);
                            }
                            this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gl.M(getStyleHeight())));
                            this.f.setDuration(200L);
                            this.f.addListener(new kn4(this, (byte) 4));
                            this.f.start();
                        }
                        this.T = true;
                        setVisibility(0);
                    }
                    int i3 = this.Q;
                    int i4 = A.l;
                    if (i3 != i4) {
                        this.Q = i4;
                        this.d.b(gl.T2(k96.a0("ImportUploading", null, 2131749030, Integer.valueOf(i4))), false);
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
        boolean z2 = dVar instanceof cj3;
        if (z2) {
            if (eb6.g() != 0) {
                i = true;
            } else {
                i = false;
            }
        } else {
            i = eb6.f(dVar.getCurrentAccount()).i(this.n.a());
        }
        ez3 ez3Var = this.t0;
        if (!i) {
            this.s0 = -1;
            gl.r(ez3Var);
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
            this.f.addListener(new kn4(this, (byte) 11));
            this.f.start();
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new xaa(getContext(), 1));
        if (z && this.S == 0.0f) {
            setTopPadding(gl.M(getStyleHeight()));
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
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gl.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new kn4(this, (byte) 0));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (z2) {
            String M02 = k96.M0(2131748648, null);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 4; i2++) {
                arrayList.addAll(eb6.f(i2).J);
            }
            if (arrayList.size() == 1) {
                db6 db6Var = (db6) arrayList.get(0);
                long B0 = k27.B0(db6Var.h.k);
                boolean D = cf3.D(B0);
                k27 k27Var = db6Var.h;
                if (D) {
                    G = l7c.k(na7.q1(k27Var.K1).V1(Long.valueOf(B0)), true);
                    M0 = k96.M0(2131753962, null);
                } else {
                    TLRPC.Chat K0 = na7.q1(k27Var.K1).K0(Long.valueOf(-B0));
                    if (K0 != null) {
                        G = K0.title;
                    } else {
                        G = "";
                    }
                    M0 = k96.M0(2131753961, null);
                }
            } else {
                G = k96.G(arrayList.size(), "Chats", new Object[0]);
                M0 = k96.M0(2131753960, null);
            }
            String format = String.format(M0, M02, G);
            int indexOf = format.indexOf(M02);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            for (int i3 = 0; i3 < 2; i3++) {
                nn4 nn4Var = this.d;
                if (i3 == 0) {
                    nextTextView = nn4Var.getTextView();
                } else {
                    nextTextView = nn4Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new z3c(gl.o(), bkb.v0(bkb.s7, this.q0)), indexOf, M02.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        ez3Var.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i3;
        if (i == kk7.F4) {
            d(false);
        } else if (i == kk7.F2) {
            e(false);
        } else {
            int i4 = kk7.H4;
            sy1 sy1Var = this.n;
            if (i == i4) {
                if (sy1Var != null) {
                    if (sy1Var.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i != kk7.g2 && i != kk7.f2 && i != kk7.e2 && i != kk7.C2) {
                int i5 = kk7.u2;
                if (i != i5 && i != kk7.v2 && i != kk7.E2) {
                    if (i == kk7.B2) {
                        b();
                        if (this.T && this.U == 4) {
                            fc2 groupCall = sy1Var.getGroupCall();
                            if (groupCall != null && this.e != null) {
                                if (groupCall.k()) {
                                    this.e.b(k96.W(4, groupCall.b.schedule_date, true), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    int i6 = groupCall2.participants_count;
                                    nn4 nn4Var = this.e;
                                    boolean z = groupCall2.rtmp_stream;
                                    if (i6 == 0) {
                                        if (z) {
                                            i3 = 2131743293;
                                        } else {
                                            i3 = 2131748422;
                                        }
                                        nn4Var.b(k96.M0(i3, null), false);
                                    } else {
                                        if (z) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        nn4Var.b(k96.G(i6, str, new Object[0]), false);
                                    }
                                }
                            }
                            o(true);
                            return;
                        }
                        return;
                    } else if (i == kk7.u1) {
                        int i7 = this.U;
                        if (i7 == 1 || i7 == 3 || i7 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i == kk7.L4) {
                        q(true);
                        return;
                    } else {
                        int i8 = kk7.P4;
                        ua1 ua1Var = this.a;
                        if (i == i8) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                bkb.E0().a(Math.max(this.M0, this.N0));
                                ua1Var.f(Math.max(this.M0, this.N0));
                                return;
                            }
                            return;
                        } else if (i == kk7.Q4) {
                            b();
                            this.M0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                bkb.E0().a(Math.max(this.M0, this.N0));
                                ua1Var.f(Math.max(this.M0, this.N0));
                            }
                            this.b0.invalidate();
                            return;
                        } else if (i == kk7.d2 && this.U == 0) {
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
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.y != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, sharedInstance.getChat())) {
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
        t76 t76Var = t76.N;
        on onVar = this.u0;
        int i = 0;
        if (t76Var != null) {
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
                onVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(s33.f);
                this.f.addListener(new kn4(this, (byte) 6));
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
                        this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gl.M(getStyleHeight())));
                        this.f.setDuration(220L);
                        this.f.setInterpolator(s33.f);
                        this.f.addListener(new kn4(this, (byte) 7));
                        this.f.start();
                    } else {
                        setTopPadding(gl.M(getStyleHeight()));
                        n();
                    }
                    this.T = true;
                    setVisibility(0);
                } else {
                    setTopPadding(gl.M(getStyleHeight()));
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
                    onVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(s33.f);
                    this.f.addListener(new kn4(this, (byte) 5));
                    this.f.start();
                }
            } else if (z2 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        t76 t76Var2 = t76.N;
        if (t76Var2 != null && this.U == 6) {
            nn4 nn4Var = this.d;
            TLRPC.GroupCall groupCall = t76Var2.s;
            if (groupCall != null) {
                i = groupCall.participants_count;
            }
            nn4Var.setText(k96.H(',', "LiveStoryTopPanelWatching", Math.max(1, i)));
        }
    }

    public final void f() {
        int i;
        TLRPC.User user;
        int i2;
        String format;
        TextView nextTextView;
        sy1 sy1Var = this.n;
        if (sy1Var != null && this.d != null) {
            b();
            long a = sy1Var.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) eb6.f(currentAccount).c.f(a);
            if (!this.r0) {
                eb6 f = eb6.f(currentAccount);
                vf6 vf6Var = f.H;
                if (vf6Var.h(a) < 0) {
                    vf6Var.k(Boolean.TRUE, a);
                    TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                    tL_messages_getRecentLocations.peer = f.getMessagesController().h1(a);
                    tL_messages_getRecentLocations.limit = 100;
                    f.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new eu2(f, a, (byte) 2));
                }
                this.r0 = true;
            }
            if (arrayList != null) {
                long e = y6c.h(currentAccount).e();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                user = null;
                i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long B1 = k27.B1(message.from_id);
                        if (user == null && B1 != e) {
                            user = na7.q1(currentAccount).V1(Long.valueOf(B1));
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
                String M0 = k96.M0(2131748648, null);
                if (i2 == 0) {
                    format = M0;
                } else {
                    int i4 = i2 - 1;
                    if (eb6.f(currentAccount).i(a)) {
                        if (i4 != 0) {
                            if (i4 == 1 && user != null) {
                                Object[] objArr = new Object[1];
                                objArr[i] = l7c.k(user, true);
                                String a0 = k96.a0("SharingYouAndOtherName", null, 2131745176, objArr);
                                Object[] objArr2 = new Object[2];
                                objArr2[i] = M0;
                                objArr2[1] = a0;
                                format = String.format("%1$s - %2$s", objArr2);
                            } else {
                                String M02 = k96.M0(2131752172, null);
                                int i5 = i;
                                String G = k96.G(i4, "AndOther", new Object[i5]);
                                Object[] objArr3 = new Object[3];
                                objArr3[i5] = M0;
                                objArr3[1] = M02;
                                objArr3[2] = G;
                                format = String.format("%1$s - %2$s %3$s", objArr3);
                            }
                        } else {
                            String M03 = k96.M0(2131752172, null);
                            Object[] objArr4 = new Object[2];
                            objArr4[i] = M0;
                            objArr4[1] = M03;
                            format = String.format("%1$s - %2$s", objArr4);
                        }
                    } else {
                        int i6 = i;
                        if (i4 != 0) {
                            String k = l7c.k(user, true);
                            String G2 = k96.G(i4, "AndOther", new Object[i6]);
                            Object[] objArr5 = new Object[3];
                            objArr5[i6] = M0;
                            objArr5[1] = k;
                            objArr5[2] = G2;
                            format = String.format("%1$s - %2$s %3$s", objArr5);
                        } else {
                            String k2 = l7c.k(user, true);
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
                        nn4 nn4Var = this.d;
                        if (i7 == 0) {
                            nextTextView = nn4Var.getTextView();
                        } else {
                            nextTextView = nn4Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new z3c(gl.o(), bkb.v0(bkb.s7, this.q0)), indexOf, M0.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z) {
        boolean z2;
        boolean z3;
        sy1 sy1Var;
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
        k27 k27Var = MediaController.w().v0;
        View fragmentView = this.h.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z2 = true;
        } else {
            z2 = z;
        }
        boolean z5 = this.T;
        on onVar = this.u0;
        if (k27Var != null && k27Var.e1() != 0 && !k27.K4(k27Var.k)) {
            b();
            int i2 = this.U;
            if (i2 != 0 && this.f != null && !z2) {
                this.y0 = true;
                return;
            }
            r(0);
            if (z2 && this.S == 0.0f) {
                setTopPadding(gl.M(getStyleHeight()));
                rn4 rn4Var = this.p0;
                if (rn4Var != null) {
                    ((qba) rn4Var).b(true);
                    ((qba) this.p0).b(false);
                }
            }
            if (!this.T) {
                if (!z2) {
                    AnimatorSet animatorSet = this.f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f = null;
                    }
                    onVar.d();
                    this.f = new AnimatorSet();
                    rn4 rn4Var2 = this.p0;
                    if (rn4Var2 != null) {
                        ((qba) rn4Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gl.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new kn4(this, (byte) 2));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            boolean C = MediaController.w().C();
            xb8 xb8Var = this.c;
            if (C) {
                xb8Var.a(false, !z2);
                this.b.setContentDescription(k96.M0(2131754929, null));
            } else {
                xb8Var.a(true, !z2);
                this.b.setContentDescription(k96.M0(2131754930, null));
            }
            if (this.R == k27Var && i2 == 0) {
                return;
            }
            this.R = k27Var;
            if (!k27.Q4(k27Var.k) && !this.R.g4()) {
                this.W = true;
                if (this.G != null) {
                    int i3 = (k27Var.L0() > 600.0d ? 1 : (k27Var.L0() == 600.0d ? 0 : -1));
                    r7 r7Var = this.G;
                    if (i3 >= 0) {
                        r7Var.setAlpha(1.0f);
                        this.G.setEnabled(true);
                        this.d.setPadding(0, 0, gl.L(44.0f) + this.N, 0);
                        q(false);
                    } else {
                        r7Var.setAlpha(0.0f);
                        this.G.setEnabled(false);
                        this.d.setPadding(0, 0, this.N, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.N, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(tb4.p(k27Var.w1(true), " - ", k27Var.y1(true)));
                for (int i4 = 0; i4 < 2; i4++) {
                    nn4 nn4Var = this.d;
                    if (i4 == 0) {
                        nextTextView2 = nn4Var.getTextView();
                    } else {
                        nextTextView2 = nn4Var.getNextTextView();
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
                this.d.setPadding(0, 0, gl.L(44.0f) + this.N, 0);
                spannableStringBuilder = new SpannableStringBuilder(tb4.p(k27Var.w1(true), " ", k27Var.y1(true)));
                for (int i5 = 0; i5 < 2; i5++) {
                    nn4 nn4Var2 = this.d;
                    if (i5 == 0) {
                        nextTextView = nn4Var2.getTextView();
                    } else {
                        nextTextView = nn4Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new z3c(gl.o(), bkb.v0(bkb.s7, this.q0)), 0, k27Var.w1(true).length(), 18);
            this.d.b(spannableStringBuilder, (!z2 && z5 && this.W) ? false : false);
            return;
        }
        this.R = null;
        if (this.a0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !o85.d()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!j() && !z3 && (sy1Var = this.n) != null && !o85.d()) {
            fc2 groupCall = sy1Var.getGroupCall();
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
            onVar.d();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            rn4 rn4Var3 = this.p0;
            if (rn4Var3 != null) {
                ((qba) rn4Var3).b(true);
            }
            this.f.addListener(new kn4(this, (byte) 1));
            this.f.start();
        } else {
            setVisibility(8);
        }
    }

    public ua1 getCapsuleBlobDrawable() {
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
        int i = bkb.i5;
        wjb wjbVar = this.q0;
        r7 r7Var = new r7(context, null, 0, bkb.v0(i, wjbVar), false, this.q0);
        this.G = r7Var;
        if (r7Var.getIconView() != null) {
            zkb.s(this.G.getIconView(), i, wjbVar, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(gl.L(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(k96.M0(2131754804, null));
        this.G.setDelegate(new gn4(this));
        r7 r7Var2 = this.G;
        cla claVar = new cla();
        this.H = claVar;
        r7Var2.setIcon(claVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        v7 v7Var = new v7(getContext(), wjbVar);
        this.I = v7Var;
        v7Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new w72(this, (byte) 29));
        p7 A = this.G.A(0, 2131232378, k96.M0(2131745029, null));
        p7[] p7VarArr = this.J;
        p7VarArr[0] = A;
        p7VarArr[1] = this.G.A(1, 2131232377, k96.M0(2131745030, null));
        p7VarArr[2] = this.G.A(2, 2131232376, k96.M0(2131745031, null));
        p7VarArr[3] = this.G.A(3, 2131232375, k96.M0(2131745033, null));
        p7VarArr[4] = this.G.A(4, 2131232380, k96.M0(2131745027, null));
        p7VarArr[5] = this.G.A(5, 2131232379, k96.M0(2131745028, null));
        if (gl.p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(gl.L(8.0f));
        addView(this.G, nme.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new xf3(this, fArr, (byte) 10));
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

    public final void k(db6 db6Var) {
        if (db6Var != null) {
            org.telegram.ui.ActionBar.d dVar = this.h;
            if (dVar.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) dVar.getParentActivity();
                launchActivity.N0(db6Var.h.K1);
                qa6 qa6Var = new qa6(2);
                qa6Var.F0(db6Var.h);
                qa6Var.M0 = new rz1(db6Var, k27.B0(db6Var.h.k), (byte) 6);
                launchActivity.t0(qa6Var);
            }
        }
    }

    public final void l(float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.l(float, float, boolean):void");
    }

    public final void m() {
        wtc wtcVar = this.L0;
        if (wtcVar != null) {
            wtcVar.a();
            this.L0 = null;
        }
        for (int i = 0; i < 4; i++) {
            hk7[] hk7VarArr = this.K0;
            hk7 hk7Var = hk7VarArr[i];
            if (hk7Var != null) {
                hk7Var.a();
                hk7VarArr[i] = null;
            }
        }
    }

    public final void n() {
        wd1 wd1Var = this.O;
        if (wd1Var != null && wd1Var.g >= 1.0f) {
            this.O0 = false;
            gl.e3(new jn4(this, (byte) 0), 150L);
            return;
        }
        this.O0 = true;
    }

    public final void o(boolean z) {
        fc2 fc2Var;
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
        gc0 gc0Var = this.b0.a;
        if (gc0Var.f == null) {
            int i3 = this.U;
            int i4 = this.n0;
            sy1 sy1Var = this.n;
            if (i3 == 4) {
                if (sy1Var != null) {
                    fc2Var = sy1Var.getGroupCall();
                    i4 = this.h.getCurrentAccount();
                } else {
                    fc2Var = null;
                }
                i = i4;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                fc2Var = VoIPService.getSharedInstance().groupCall;
                if (sy1Var != null) {
                    user = null;
                } else {
                    user = VoIPService.getSharedInstance().getUser();
                }
                i = VoIPService.getSharedInstance().getAccount();
            } else {
                fc2Var = null;
                i = i4;
                user = null;
            }
            int i5 = 0;
            if (fc2Var != null) {
                ArrayList arrayList = fc2Var.e;
                int size = arrayList.size();
                for (int i6 = 0; i6 < 3; i6++) {
                    hc0 hc0Var = this.b0;
                    if (i6 < size) {
                        hc0Var.b(i6, i, (TLObject) arrayList.get(i6));
                    } else {
                        hc0Var.b(i6, i, null);
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
            if (this.U == 4 && fc2Var != null) {
                if (!fc2Var.b.rtmp_stream) {
                    i5 = Math.min(3, fc2Var.e.size());
                }
                if (i5 == 0) {
                    h = 10;
                } else {
                    h = oo1.h(i5, 1, 24, 52);
                }
                int i9 = h + 3;
                nn4 nn4Var = this.d;
                if (z) {
                    int i10 = ((FrameLayout.LayoutParams) nn4Var.getLayoutParams()).leftMargin;
                    if (gl.L(i9) != i10) {
                        float translationX = (this.d.getTranslationX() + i10) - gl.L(f);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        s33 s33Var = s33.f;
                        duration.setInterpolator(s33Var);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(s33Var);
                    }
                } else {
                    nn4Var.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                nn4 nn4Var2 = this.d;
                float f2 = i9;
                int i11 = 36;
                if (fc2Var.k()) {
                    i2 = 90;
                } else {
                    i2 = 36;
                }
                nn4Var2.setLayoutParams(nme.d(-1, 20.0f, 51, f2, 5.0f, i2, 0.0f));
                nn4 nn4Var3 = this.e;
                if (fc2Var.k()) {
                    i11 = 90;
                }
                nn4Var3.setLayoutParams(nme.d(-1, 20.0f, 51, f2, 25.0f, i11, 0.0f));
                return;
            }
            return;
        }
        gc0Var.g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        m();
        int i = 15;
        if (this.o0) {
            wtc wtcVar = new wtc(kk7.e(), this);
            wtcVar.b(kk7.F4);
            wtcVar.b(kk7.H4);
            this.L0 = wtcVar;
            d(true);
        } else {
            for (int i2 = 0; i2 < 4; i2++) {
                wtc wtcVar2 = new wtc(kk7.f(i2), this);
                wtcVar2.b(kk7.e2);
                wtcVar2.b(kk7.f2);
                wtcVar2.b(kk7.g2);
                wtcVar2.b(kk7.v2);
                wtcVar2.b(kk7.B2);
                wtcVar2.b(kk7.u1);
                wtcVar2.b(kk7.F2);
                wtcVar2.b(kk7.d2);
                this.K0[i2] = wtcVar2;
                GroupCallMessagesController.getInstance(i2).subscribeToCallMessages(0L, this);
            }
            wtc wtcVar3 = new wtc(kk7.e(), this);
            wtcVar3.b(kk7.L4);
            wtcVar3.b(kk7.u2);
            wtcVar3.b(kk7.C2);
            wtcVar3.b(kk7.Q4);
            wtcVar3.b(kk7.P4);
            wtcVar3.b(kk7.E2);
            this.L0 = wtcVar3;
            if (t76.N != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !o85.d()) {
                a(true);
            } else {
                sy1 sy1Var = this.n;
                if (sy1Var != null && this.h.getSendMessagesHelper().A(sy1Var.a()) != null && !j()) {
                    c(true);
                } else if (sy1Var != null && sy1Var.getGroupCall() != null && sy1Var.getGroupCall().A() && !o85.d() && !j()) {
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
            ArrayList arrayList = bkb.E0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            ua1 ua1Var = this.a;
            if (!ua1Var.u) {
                ua1Var.u = true;
                ua1Var.t = SystemClock.elapsedRealtime();
                rg2.d().a(60, ua1Var.F);
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
                oy8 oy8Var = this.E;
                if (!z) {
                    i = 29;
                }
                oy8Var.K(i);
                oy8 oy8Var2 = this.E;
                oy8Var2.I(oy8Var2.f - 1, false, true);
                this.y.invalidate();
            }
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(gl.M(getStyleHeight()));
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
        ua1 ua1Var = this.a;
        if (z2 != z) {
            this.P = z;
            oy8 oy8Var = this.E;
            if (z) {
                i = 15;
            } else {
                i = 29;
            }
            oy8Var.K(i);
            oy8 oy8Var2 = this.E;
            oy8Var2.I(oy8Var2.f - 1, false, true);
            this.y.invalidate();
            bkb.E0().c(this.T);
            ua1Var.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            bkb.E0().a(0.0f);
            ua1Var.f(0.0f);
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
            gl.r(this.m0);
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
            tn4 E0 = bkb.E0();
            ArrayList arrayList = E0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.b;
                E0.b = null;
                E0.c = null;
            }
            ua1 ua1Var = this.a;
            if (ua1Var.u) {
                ua1Var.u = false;
                rg2.d().g(ua1Var.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, gl.M(getStyleHeight()));
    }

    @Override
    public final void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage) {
        if (this.s != null) {
            int i = this.U;
            if ((i == 1 || i == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j) {
                this.V0++;
                if (!groupCallMessage.isOut()) {
                    this.U0.h(new qn4(this.s, groupCallMessage), true);
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
        fc2 fc2Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i = this.U;
            if (i == 1 || i == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(k96.M0(2131743150, null), false);
                } else if (sharedInstance.isConference() && (fc2Var = sharedInstance.groupCall) != null) {
                    if (fc2Var.e.size() <= 1) {
                        this.d.b(k96.M0(2131751811, null), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.e.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(cf3.r(sharedInstance.getAccount(), cf3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i2)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb.append(" ");
                        sb.append(k96.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    sy1 sy1Var = this.n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                            this.d.b(sharedInstance.groupCall.b.title, false);
                        } else if (sy1Var != null && sy1Var.f() != null && sy1Var.f().id == sharedInstance.getChat().id) {
                            TLRPC.Chat f = sy1Var.f();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(k96.M0(2131743206, null), false);
                                return;
                            }
                            boolean W = hc2.W(f);
                            nn4 nn4Var = this.d;
                            if (W) {
                                nn4Var.b(k96.M0(2131743206, null), false);
                            } else {
                                nn4Var.b(k96.M0(2131743065, null), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (sy1Var != null && sy1Var.h() != null && sy1Var.h().id == user.id) {
                            this.d.setText(k96.M0(2131745853, null));
                        } else {
                            this.d.setText(qu2.m(0, user.first_name, user.last_name));
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
                wjb wjbVar = this.q0;
                if (!z2 && Math.abs(x - W0[i]) < 0.05f) {
                    p7 p7Var = p7VarArr[i];
                    int i2 = bkb.Gi;
                    p7Var.a(bkb.v0(i2, wjbVar), bkb.v0(i2, wjbVar));
                } else {
                    p7 p7Var2 = p7VarArr[i];
                    int i3 = bkb.D8;
                    p7Var2.a(bkb.v0(i3, wjbVar), bkb.v0(i3, wjbVar));
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
        nn4 nn4Var;
        TextView nextTextView;
        int i2;
        int i3;
        boolean z2;
        int i4;
        nn4 nn4Var2;
        TextView nextTextView2;
        nn4 nn4Var3;
        int i5;
        TextView nextTextView3;
        nn4 nn4Var4;
        TextView nextTextView4;
        TextView nextTextView5;
        if (this.U != i) {
            b();
            int i6 = this.U;
            ua1 ua1Var = this.a;
            boolean z3 = true;
            int i7 = 0;
            if (i6 == 3 || i6 == 1) {
                tn4 E0 = bkb.E0();
                ArrayList arrayList = E0.l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    E0.d = E0.b;
                    E0.b = null;
                    E0.c = null;
                }
                if (ua1Var.u) {
                    ua1Var.u = false;
                    rg2.d().g(ua1Var.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                k79 k79Var = this.U0;
                if (k79Var != null) {
                    k79Var.h(null, true);
                }
            }
            this.U = i;
            mn4 mn4Var = this.r;
            if (i != 4) {
                z = true;
            } else {
                z = false;
            }
            mn4Var.setWillNotDraw(z);
            if (i != 4) {
                this.h0 = false;
            }
            hc0 hc0Var = this.b0;
            if (hc0Var != null) {
                hc0Var.setStyle(this.U);
                this.b0.setLayoutParams(nme.e(108, getStyleHeight(), 51));
            }
            this.r.setLayoutParams(nme.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f = this.S;
            if (f > 0.0f && f != gl.M(getStyleHeight())) {
                setTopPadding(gl.M(getStyleHeight()));
            }
            wjb wjbVar = this.q0;
            if (i == 6) {
                this.w.setBackground(bkb.L0(false));
                this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.v0(bkb.dl, wjbVar), bkb.v0(bkb.el, wjbVar)}));
                this.r.setTag(null);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.y.setVisibility(8);
                this.x.setVisibility(8);
                this.x.i();
                this.b0.setVisibility(8);
                this.d.setTag(Integer.valueOf(bkb.z7));
                while (true) {
                    nn4 nn4Var5 = this.d;
                    if (i7 < 2) {
                        if (i7 == 0) {
                            nextTextView5 = nn4Var5.getTextView();
                        } else {
                            nextTextView5 = nn4Var5.getNextTextView();
                        }
                        if (nextTextView5 != null) {
                            nextTextView5.setGravity(19);
                            zkb.X(nextTextView5, bkb.z7, wjbVar);
                            nextTextView5.setTypeface(gl.o());
                            nextTextView5.setTextSize(1, 15.0f);
                        }
                        i7++;
                    } else {
                        nn4Var5.setLayoutParams(nme.d(-2, -2.0f, 17, 0.0f, -1.0f, 0.0f, 0.0f));
                        return;
                    }
                }
            } else if (i == 5) {
                this.w.setBackground(bkb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(bkb.u7));
                int i8 = 0;
                while (true) {
                    nn4Var4 = this.d;
                    if (i8 >= 2) {
                        break;
                    }
                    if (i8 == 0) {
                        nextTextView4 = nn4Var4.getTextView();
                    } else {
                        nextTextView4 = nn4Var4.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        zkb.X(nextTextView4, bkb.t7, wjbVar);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                    i8++;
                }
                nn4Var4.setTag(Integer.valueOf(bkb.t7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.y.setVisibility(8);
                this.b0.setVisibility(8);
                this.x.setVisibility(0);
                this.x.d();
                this.F.setContentDescription(k96.M0(2131754900, null));
                r7 r7Var = this.G;
                if (r7Var != null) {
                    r7Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(nme.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
            } else if (i != 0 && i != 2) {
                if (i == 4) {
                    this.w.setBackground(bkb.L0(false));
                    this.r.setBackgroundColor(0);
                    this.r.setTag(Integer.valueOf(bkb.u7));
                    this.y.setVisibility(8);
                    this.e.setVisibility(0);
                    int i9 = 0;
                    while (true) {
                        nn4Var3 = this.d;
                        if (i9 >= 2) {
                            break;
                        }
                        if (i9 == 0) {
                            nextTextView3 = nn4Var3.getTextView();
                        } else {
                            nextTextView3 = nn4Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            zkb.X(nextTextView3, bkb.s7, wjbVar);
                            nextTextView3.setTypeface(gl.o());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                        i9++;
                    }
                    nn4Var3.setTag(Integer.valueOf(bkb.s7));
                    this.d.setPadding(0, 0, this.N, 0);
                    this.x.setVisibility(8);
                    this.x.i();
                    sy1 sy1Var = this.n;
                    if (sy1Var == null || sy1Var.getGroupCall() == null || sy1Var.getGroupCall().b == null || !sy1Var.getGroupCall().b.rtmp_stream) {
                        z3 = false;
                    }
                    hc0 hc0Var2 = this.b0;
                    if (!z3) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    hc0Var2.setVisibility(i5);
                    if (this.b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-gl.L(36.0f));
                        this.e.setTranslationX(-gl.L(36.0f));
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
                    hc0 hc0Var3 = this.b0;
                    if (!hasRtmpStream) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    hc0Var3.setVisibility(i2);
                    if (i == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    pn4 pn4Var = this.y;
                    if (!hasRtmpStream) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    pn4Var.setVisibility(i3);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.P = z2;
                    oy8 oy8Var = this.E;
                    if (z2) {
                        i4 = 15;
                    } else {
                        i4 = 29;
                    }
                    oy8Var.K(i4);
                    oy8 oy8Var2 = this.E;
                    oy8Var2.I(oy8Var2.f - 1, false, true);
                    this.y.invalidate();
                    this.r.setBackground(null);
                    this.r.setBackgroundColor(0);
                    this.x.setVisibility(8);
                    this.x.i();
                    ArrayList arrayList2 = bkb.E0().l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!ua1Var.u) {
                        ua1Var.u = true;
                        ua1Var.t = SystemClock.elapsedRealtime();
                        rg2.d().a(60, ua1Var.F);
                    }
                    invalidate();
                    int i10 = 0;
                    while (true) {
                        nn4Var2 = this.d;
                        if (i10 >= 2) {
                            break;
                        }
                        if (i10 == 0) {
                            nextTextView2 = nn4Var2.getTextView();
                        } else {
                            nextTextView2 = nn4Var2.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            zkb.X(nextTextView2, bkb.z7, wjbVar);
                            nextTextView2.setTypeface(gl.o());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                        i10++;
                    }
                    nn4Var2.setTag(Integer.valueOf(bkb.z7));
                    this.F.setVisibility(8);
                    this.b.setVisibility(8);
                    this.e.setVisibility(8);
                    this.M.setVisibility(8);
                    this.d.setLayoutParams(nme.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setPadding(gl.L(88.0f), 0, gl.L(88.0f) + this.N, 0);
                    r7 r7Var3 = this.G;
                    if (r7Var3 != null) {
                        r7Var3.setVisibility(8);
                        this.G.setTag(null);
                    }
                }
            } else {
                this.w.setBackground(bkb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(bkb.u7));
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
                    nn4Var = this.d;
                    if (i11 >= 2) {
                        break;
                    }
                    if (i11 == 0) {
                        nextTextView = nn4Var.getTextView();
                    } else {
                        nextTextView = nn4Var.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        zkb.X(nextTextView, bkb.t7, wjbVar);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                    i11++;
                }
                nn4Var.setTag(Integer.valueOf(bkb.t7));
                ImageView imageView = this.b;
                if (i == 6) {
                    imageView.setLayoutParams(nme.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(nme.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                    this.F.setVisibility(8);
                } else if (i == 0) {
                    imageView.setLayoutParams(nme.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(nme.d(-1, 36.0f, 51, 37.0f, 0.0f, 36.0f, 0.0f));
                    h();
                    r7 r7Var4 = this.G;
                    if (r7Var4 != null) {
                        r7Var4.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(k96.M0(2131754900, null));
                } else {
                    imageView.setLayoutParams(nme.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(nme.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                    this.F.setContentDescription(k96.M0(2131754754, null));
                }
            }
        }
    }

    public void setDelegate(rn4 rn4Var) {
        this.p0 = rn4Var;
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
        ry8 ry8Var = this.x;
        if (ry8Var != null) {
            ry8Var.setTranslationX(f);
        }
        nn4 nn4Var = this.d;
        if (nn4Var != null) {
            nn4Var.setTranslationX(f);
        }
        nn4 nn4Var2 = this.e;
        if (nn4Var2 != null) {
            nn4Var2.setTranslationX(f);
        }
        hc0 hc0Var = this.b0;
        if (hc0Var != null) {
            hc0Var.setTranslationX(f);
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
        z3c[] z3cVarArr;
        TextView nextTextView2;
        ua1 ua1Var = this.a;
        int i2 = ua1Var.A;
        if (i2 >= 0) {
            ua1Var.E = 1.0f;
            ua1Var.a(ua1.e(i2));
        }
        if (!i(MediaController.w().x(this.W), 1.0f)) {
            i = bkb.Gi;
        } else {
            i = bkb.w7;
        }
        wjb wjbVar = this.q0;
        int v0 = bkb.v0(i, wjbVar);
        cla claVar = this.H;
        if (claVar != null) {
            claVar.a.u(v0);
            Paint paint = claVar.b;
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
                    bkb.F1(background, v0 & 436207615, true);
                }
            } else {
                r7 r7Var2 = this.G;
                ff0 f0 = bkb.f0(436207615 & v0, 1, gl.L(14.0f));
                this.E0 = f0;
                r7Var2.setBackground(f0);
                this.J0 = v0;
            }
        }
        if (this.b != null) {
            int v02 = bkb.v0(bkb.v7, wjbVar);
            if (this.F0 == null || v02 != this.H0) {
                ImageView imageView = this.b;
                this.H0 = v02;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int v03 = bkb.v0(bkb.w7, wjbVar);
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
                nn4 nn4Var = this.e;
                if (i3 == 0) {
                    nextTextView2 = nn4Var.getTextView();
                } else {
                    nextTextView2 = nn4Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(bkb.v0(bkb.w7, wjbVar));
                }
            }
        }
        nn4 nn4Var2 = this.d;
        if (nn4Var2 != null) {
            Object tag = nn4Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i4 = 0; i4 < 2; i4++) {
                    nn4 nn4Var3 = this.d;
                    if (i4 == 0) {
                        nextTextView = nn4Var3.getTextView();
                    } else {
                        nextTextView = nn4Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(bkb.v0(intValue, wjbVar));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (z3cVarArr = (z3c[]) ((Spanned) text).getSpans(0, text.length(), z3c.class)) != null) {
                            for (z3c z3cVar : z3cVarArr) {
                                z3cVar.b = bkb.v0(bkb.s7, wjbVar);
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

    public FragmentContextView(Context context, cj3 cj3Var, boolean z) {
        this(context, cj3Var, null, z, null);
    }
}
