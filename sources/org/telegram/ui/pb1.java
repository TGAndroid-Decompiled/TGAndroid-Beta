package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
public class pb1 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.gg, of0 {
    public static final HashSet f40565q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public int D;
    public org.telegram.ui.Components.kj D0;
    public boolean E;
    public fb1 E0;
    public sa1 F;
    public FrameLayout F0;
    public boolean G;
    public y8 G0;
    public boolean H;
    public org.telegram.messenger.u3 H0;
    public boolean I;
    public eb1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.wj0 K0;
    public org.telegram.ui.Components.w51 L;
    public ay L0;
    public int M;
    public ay M0;
    public cb1 N;
    public boolean N0;
    public ua1 O;
    public final e2.f O0;
    public ob1 P;
    public do0 P0;
    public org.telegram.ui.ActionBar.b1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.b1 R;
    public oh.e R0;
    public org.telegram.ui.ActionBar.b1 S;
    public float S0;
    public org.telegram.ui.ActionBar.b1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.b1 U;
    public org.telegram.ui.Components.zr U0;
    public boolean V;
    public final boolean V0;
    public float W;
    public ImageView W0;
    public TL_stories.TL_premium_boostsStatus X;
    public float X0;
    public long Y;
    public ValueAnimator Y0;
    public boolean Z;
    public boolean Z0;
    public final long f40566a;
    public final HashSet f40567a0;
    public org.telegram.ui.Components.v71 f40568a1;
    public final ArrayList f40569b;
    public boolean f40570b0;
    public boolean f40571b1;
    public int f40572c;
    public NumberTextView f40573c0;
    public View f40574c1;
    public xa1 d;
    public org.telegram.ui.ActionBar.t0 f40575d0;
    public int f40576d1;
    public l0 e;
    public org.telegram.ui.ActionBar.t0 f40577e0;
    public int f40578e1;
    public org.telegram.ui.Components.sn f40579f;
    public org.telegram.ui.ActionBar.t0 f40580f0;
    public int f40581f1;
    public org.telegram.ui.ActionBar.t0 f40582g0;
    public final tg.f f40583g1;
    public org.telegram.ui.Components.f10 h;
    public org.telegram.ui.ActionBar.t0 f40584h0;
    public final hi.f f40585h1;
    public org.telegram.ui.ActionBar.t0 f40586i0;
    public final hi.f f40587i1;
    public org.telegram.ui.ActionBar.b1 f40588j0;
    public final hi.c f40589j1;
    public org.telegram.ui.ActionBar.b1 f40590k0;
    public final tg.b f40591k1;
    public org.telegram.ui.ActionBar.b1 f40592l0;
    public tg.j l1;
    public org.telegram.ui.ActionBar.t0 m0;
    public final ArrayList f40593m1;
    public ja1 f40594n;
    public RadialProgressView f40595n0;
    public final RectF f40596n1;
    public dg0 f40597o0;
    public final RectF f40598o1;
    public org.telegram.ui.ActionBar.t0 f40599p0;
    public int f40600p1;
    public org.telegram.ui.ActionBar.t0 f40601q0;
    public final gb1 f40602r;
    public lb1 f40603r0;
    public final org.telegram.messenger.x00 f40604s;
    public boolean f40605s0;
    public final boolean f40606t0;
    public final boolean f40607u0;
    public final boolean f40608v0;
    public qb1 f40609w;
    public final boolean f40610w0;
    public kw f40611x;
    public final boolean f40612x0;
    public int f40613y;
    public String f40614y0;
    public boolean f40615z0;

    public pb1(Bundle bundle) {
        super(bundle);
        this.f40569b = new ArrayList();
        new ArrayList();
        this.f40602r = new gb1(this);
        this.f40613y = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f40567a0 = new HashSet();
        this.B0 = false;
        this.O0 = new e2.f(new int[]{org.telegram.messenger.zs.f19675q5});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f40593m1 = arrayList;
        RectF rectF = new RectF();
        this.f40596n1 = rectF;
        RectF rectF2 = new RectF();
        this.f40598o1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f40566a = j10;
        this.f40606t0 = this.arguments.getBoolean("for_select", false);
        this.f40607u0 = this.arguments.getBoolean("forward_to", false);
        this.f40612x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f40608v0 = this.arguments.getBoolean("quote", false);
        this.f40610w0 = this.arguments.getBoolean("reply_to", false);
        this.f40614y0 = this.arguments.getString("voicechat", null);
        this.f40615z0 = this.arguments.getBoolean("videochat", false);
        this.f40604s = getMessagesController().f18891r7;
        this.V0 = !org.telegram.messenger.m5.w("topics_end_reached_", j10, getUserConfig().k(), false);
        hi.c cVar = new hi.c();
        this.f40589j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f40583g1 = new tg.f(false);
            this.f40585h1 = new hi.f(null);
            hi.f fVar = new hi.f(null);
            this.f40587i1 = fVar;
            tg.b bVar = new tg.b(fVar);
            this.f40591k1 = bVar;
            bVar.f48702i = true;
            return;
        }
        this.f40583g1 = null;
        this.f40585h1 = null;
        this.f40587i1 = null;
        this.f40591k1 = new tg.b(cVar);
    }

    public static org.telegram.ui.ActionBar.k2 H0(org.telegram.messenger.vp vpVar, org.telegram.messenger.hs hsVar, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog R0 = vpVar.R0(-j10);
            if (R0 != null && R0.view_forum_as_messages) {
                return new un(bundle);
            }
            TLRPC.ChatFull M0 = vpVar.M0(j10);
            if (M0 == null) {
                M0 = hsVar.F0(j10, true, new CountDownLatch(1), false, false, 0);
            }
            if (M0 != null && M0.view_forum_as_messages) {
                return new un(bundle);
            }
        }
        return new pb1(bundle);
    }

    public static org.telegram.ui.ActionBar.k2 I0(LaunchActivity launchActivity, Bundle bundle) {
        return H0(org.telegram.messenger.vp.r1(launchActivity.O), org.telegram.messenger.hs.a0(launchActivity.O), bundle);
    }

    public static void L0(org.telegram.ui.un r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb1.L0(org.telegram.ui.un):void");
    }

    public static boolean Y(pb1 pb1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(pb1Var.currentAccount).e7.edit();
        edit.putLong("dialog_join_requested_time_" + (-pb1Var.f40566a), System.currentTimeMillis()).commit();
        Activity parentActivity = pb1Var.getParentActivity();
        boolean V = org.telegram.messenger.w3.V(pb1Var.g());
        int i10 = org.telegram.ui.Components.u70.f30855q1;
        org.telegram.ui.Components.u70.J0(parentActivity, pb1Var, org.telegram.ui.Components.cc.a0(pb1Var), V);
        pb1Var.R0(true);
        return false;
    }

    public static void Z(pb1 pb1Var, View view) {
        long j10;
        long j11 = pb1Var.f40566a;
        if (pb1Var.getParentLayout() != null && !((ActionBarLayout) pb1Var.getParentLayout()).x() && (view instanceof mb1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((mb1) view).N;
            long j12 = -j11;
            boolean x22 = pb1Var.getMessagesController().x2(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (x22) {
                j10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f19845id;
            }
            long j13 = j10;
            if (pb1Var.f40606t0) {
                qb1 qb1Var = pb1Var.f40609w;
                if (qb1Var != null) {
                    sb1 sb1Var = qb1Var.f40949a;
                    Bundle bundle = new Bundle();
                    vb1 vb1Var = sb1Var.f41465a;
                    bundle.putLong("dialog_id", vb1Var.f42699c);
                    bundle.putLong("topic_id", tL_forumTopic.f19845id);
                    bundle.putBoolean("exception", true);
                    uy0 uy0Var = new uy0(bundle, null);
                    uy0Var.f42549s = new ep0(20, sb1Var, tL_forumTopic);
                    vb1Var.presentFragment(uy0Var);
                }
                ay ayVar = pb1Var.L0;
                if (ayVar != null) {
                    ayVar.Z3(j12, j13, true, pb1Var);
                }
            } else if (pb1Var.f40567a0.size() > 0) {
                pb1Var.Q0(view);
            } else {
                if (pb1Var.inPreviewMode && org.telegram.messenger.i0.Q1()) {
                    for (org.telegram.ui.ActionBar.k2 k2Var : pb1Var.getParentLayout().getFragmentStack()) {
                        if (k2Var instanceof ay) {
                            ay ayVar2 = (ay) k2Var;
                            if (ayVar2.s4()) {
                                org.telegram.messenger.gs gsVar = ayVar2.f35850p2;
                                if (gsVar.f15760a == j12 && gsVar.f15761b == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    pb1Var.Q0 = j13;
                    pb1Var.Y0(false, false);
                }
                gg.e.m(pb1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean a0(pb1 pb1Var, View view, float f7) {
        if (pb1Var.f40606t0 || pb1Var.getParentLayout() == null || ((ActionBarLayout) pb1Var.getParentLayout()).x()) {
            return false;
        }
        if (!pb1Var.actionBar.u() && !org.telegram.messenger.i0.Q1() && (view instanceof mb1)) {
            mb1 mb1Var = (mb1) view;
            if (mb1Var.Z(f7)) {
                pb1Var.P0(mb1Var);
                pb1Var.N.I0(true);
                pb1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        pb1Var.Q0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void e0(pb1 pb1Var, boolean z10) {
        float f7;
        boolean z11;
        xw xwVar;
        pb1Var.f40605s0 = z10;
        ValueAnimator valueAnimator = pb1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            pb1Var.Y0.cancel();
        }
        if (pb1Var.f40568a1 == null) {
            org.telegram.ui.Components.v71 n10 = pb1Var.f40603r0.n(8, false);
            pb1Var.f40568a1 = n10;
            if (pb1Var.M0 != null) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, n10, pb1Var.getResourceProvider());
            }
            pb1Var.e.addView(pb1Var.f40568a1, w7.b6.c(44.0f, -1));
        }
        float f10 = pb1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        pb1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        org.telegram.messenger.i0.Y3(pb1Var.f40603r0, false, 1.0f, true, true);
        ay ayVar = pb1Var.M0;
        if (ayVar != null && (xwVar = ayVar.F3) != null) {
            xwVar.M = !z10;
        }
        if (!z10 && pb1Var.f40603r0.getVisibility() == 0 && pb1Var.f40603r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        pb1Var.Z0 = z11;
        pb1Var.Y0.addUpdateListener(new u01(pb1Var, 13));
        pb1Var.f40603r0.setVisibility(0);
        if (!z10) {
            pb1Var.f40601q0.setVisibility(0);
        } else {
            org.telegram.messenger.i0.Z2(pb1Var.getParentActivity(), pb1Var.classGuid);
            pb1Var.T0(false);
        }
        pb1Var.Y0.addListener(new ab1(pb1Var, z10, 0));
        pb1Var.Y0.setDuration(200L);
        pb1Var.Y0.setInterpolator(org.telegram.ui.Components.gr.f26495f);
        pb1Var.Y0.start();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19681r4, Boolean.TRUE);
    }

    public static int q0(pb1 pb1Var) {
        return pb1Var.currentAccount;
    }

    public final void A0() {
        tg.f fVar;
        View view;
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f40583g1) != null) {
            int L = org.telegram.messenger.i0.L(48.0f);
            int L2 = org.telegram.messenger.i0.L(48.0f) + ((int) this.U0.c(org.telegram.messenger.i0.L(14.0f)));
            ay ayVar = this.M0;
            if (ayVar != null) {
                view = ayVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (ayVar != null) {
                lVar = ayVar.getActionBar();
            } else {
                lVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f40581f1) - org.telegram.messenger.i0.L(8.0f);
            this.f40596n1.set(0.0f, -L, view.getMeasuredWidth(), lVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.f40598o1;
            rectF.set(0.0f, measuredHeight - org.telegram.messenger.i0.L(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (org.telegram.messenger.sc.e(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -org.telegram.messenger.i0.L(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.M0 != null) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f40593m1);
            fVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final hi.f B() {
        return this.f40587i1;
    }

    public final void B0() {
        sa1 sa1Var;
        org.telegram.messenger.x00 x00Var = this.f40604s;
        long j10 = this.f40566a;
        if (!x00Var.e(j10) && (sa1Var = this.F) != null) {
            int N0 = sa1Var.N0();
            if (this.f40569b.isEmpty() || N0 >= this.f40602r.b() - 5) {
                x00Var.o(j10);
            }
            D0();
        }
    }

    public final void C0(boolean z10) {
        String str;
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.f40566a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        TLRPC.ChatFull M0 = getMessagesController().M0(j10);
        org.telegram.messenger.u3 u3Var = this.H0;
        if (u3Var != null && ((str = this.f40614y0) != null || this.f40615z0)) {
            org.telegram.ui.Components.voip.m1.l(L0, str, false, Boolean.valueOf(!u3Var.f18228b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f40614y0 = null;
            this.f40615z0 = false;
        } else if (this.f40614y0 != null && z10 && M0 != null && M0.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.m5.n(null, 2131748923, org.telegram.ui.Components.cc.a0(this), 2131624078, 36);
            this.f40614y0 = null;
        }
    }

    @Override
    public final org.telegram.ui.Components.uu0 D() {
        return this.d;
    }

    public final void D0() {
        boolean z10;
        org.telegram.messenger.x00 x00Var = this.f40604s;
        a0.h hVar = x00Var.f19171a;
        LongSparseIntArray longSparseIntArray = x00Var.f19173c;
        long j10 = this.f40566a;
        if (longSparseIntArray.get(j10, 0) == 1 && (hVar.f(j10) == null || ((ArrayList) hVar.f(j10)).isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J0 = z10;
        if (this.D0 != null) {
            ArrayList arrayList = this.f40569b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((hb1) arrayList.get(0)).f37887c != null && ((hb1) arrayList.get(0)).f37887c.f19845id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        cb1 cb1Var = this.N;
        if (cb1Var != null) {
            cb1Var.K0(cb1Var.w1());
        }
        T0(true);
    }

    public final void E0() {
        int i10;
        float f7;
        float f10;
        ay ayVar = this.M0;
        float f11 = 0.0f;
        if (ayVar != null) {
            int L = org.telegram.messenger.i0.L(14.0f);
            org.telegram.ui.Components.zr zrVar = ayVar.J1;
            if (zrVar != null) {
                f7 = zrVar.c(L);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.zr zrVar2 = this.U0;
            if (zrVar2 != null) {
                float L2 = org.telegram.messenger.i0.L(7.0f);
                org.telegram.ui.Components.zr zrVar3 = this.M0.J1;
                if (zrVar3 != null) {
                    f10 = zrVar3.getMetadata().f7040c.f7048a;
                } else {
                    f10 = 0.0f;
                }
                zrVar2.setTranslationY(f12 - (f10 * L2));
                org.telegram.ui.Components.zr zrVar4 = this.U0;
                int L3 = org.telegram.messenger.i0.L(14.0f);
                int L4 = org.telegram.messenger.i0.L(7.0f);
                org.telegram.ui.Components.zr zrVar5 = this.M0.J1;
                if (zrVar5 != null) {
                    f11 = zrVar5.getMetadata().f7040c.f7048a;
                }
                f11 = zrVar4.c(org.telegram.messenger.i0.W1(f11, L3, L4)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.zr zrVar6 = this.U0;
            if (zrVar6 != null) {
                f11 = 0.0f + zrVar6.c(org.telegram.messenger.i0.L(14.0f));
            }
        }
        int i11 = this.f40581f1 + this.f40576d1;
        if (this.V) {
            i10 = org.telegram.messenger.i0.L(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void F0() {
        this.f40567a0.clear();
        this.actionBar.t();
        org.telegram.messenger.i0.a4(this.N);
        U0();
    }

    public final void G0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String J0 = org.telegram.messenger.cd.J0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = J0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131751499, this.f40604s.f(this.f40566a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            x1Var.T = org.telegram.messenger.cd.L0(2131751498, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new a1.d(this, hashSet, arrayList, runnable, 18));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new ra1(0));
        x1Var.show();
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, getResourceProvider());
        }
    }

    @Override
    public final boolean J() {
        return false;
    }

    public final void J0(boolean z10, boolean z11) {
        boolean z12 = true;
        this.h.e(!z10, (this.fragmentBeginToShow && z11) ? false : false);
    }

    public final void K0(boolean z10) {
        int i10;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f40566a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f40579f.getSharedMediaPreloader());
        profileActivity.Z4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f40579f.getAvatarImageView().getImageReceiver().J() && z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        profileActivity.f5(i10);
        presentFragment(profileActivity);
    }

    @Override
    public final long L() {
        return 0L;
    }

    public final void M0(int i10) {
        int i11;
        int i12;
        if (this.M != i10) {
            this.M = i10;
            org.telegram.ui.Components.w51 w51Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.t6.f21160pf;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21170q7;
            }
            w51Var.setTextColorKey(i11);
            ImageView imageView = this.W0;
            if (i10 == 1) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            R0(false);
        }
    }

    public final void N0(boolean z10) {
        if (org.telegram.messenger.tz.o() == 0) {
            return;
        }
        xa1 xa1Var = this.d;
        if (xa1Var != null) {
            if (z10) {
                xa1Var.setLayerType(2, null);
                xa1Var.setClipChildren(false);
                xa1Var.setClipToPadding(false);
            } else {
                xa1Var.setLayerType(0, null);
                xa1Var.setClipChildren(true);
                xa1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void O0(float f7) {
        if (org.telegram.messenger.tz.o() != 0) {
            this.S0 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            cb1 cb1Var = this.N;
            if (cb1Var != null) {
                float z10 = sc.e.z(1.0f, this.S0, 0.05f, 1.0f);
                cb1Var.setPivotX(0.0f);
                cb1Var.setPivotY(0.0f);
                cb1Var.setScaleX(z10);
                cb1Var.setScaleY(z10);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(z10);
                this.actionBar.setScaleY(z10);
            }
        }
    }

    public final void P0(org.telegram.ui.Cells.v2 v2Var) {
        boolean z10;
        long j10;
        try {
            v2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232561, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = v2Var.N;
        org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new wa1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(goVar.f26476f);
        goVar.f26484o = 1;
        long j11 = this.f40566a;
        long j12 = -j11;
        goVar.e(j12, tL_forumTopic.f19845id, null);
        if (org.telegram.messenger.w3.y(15, g())) {
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                b1Var.j(org.telegram.messenger.cd.L0(2131751453, null), 2131232412, null);
            } else {
                b1Var.j(org.telegram.messenger.cd.L0(2131751454, null), 2131232292, null);
            }
            b1Var.setMinimumWidth(160);
            z10 = false;
            b1Var.setOnClickListener(new View.OnClickListener(this) {
                public final pb1 f40559b;

                {
                    this.f40559b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            pb1 pb1Var = this.f40559b;
                            pb1Var.C0 = true;
                            pb1Var.N0 = true;
                            org.telegram.messenger.x00 x00Var = pb1Var.f40604s;
                            long j13 = pb1Var.f40566a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            x00Var.t(j13, tL_forumTopic2.f19845id, !tL_forumTopic2.pinned, pb1Var);
                            pb1Var.finishPreviewFragment();
                            return;
                        case 1:
                            pb1 pb1Var2 = this.f40559b;
                            pb1Var2.N0 = true;
                            org.telegram.messenger.x00 x00Var2 = pb1Var2.f40604s;
                            long j14 = pb1Var2.f40566a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            x00Var2.z(tL_forumTopic3.f19845id, j14, true ^ tL_forumTopic3.closed);
                            pb1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19845id));
                            pb1 pb1Var3 = this.f40559b;
                            pb1Var3.G0(hashSet, new na1(pb1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(b1Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(getParentActivity(), z10, z10);
        if (getMessagesController().q2(j12, tL_forumTopic.f19845id, null)) {
            b1Var2.j(org.telegram.messenger.cd.L0(2131743874, null), 2131232255, null);
        } else {
            b1Var2.j(org.telegram.messenger.cd.L0(2131748329, null), 2131232411, null);
        }
        b1Var2.setMinimumWidth(160);
        b1Var2.setOnClickListener(new ya(this, tL_forumTopic, (Serializable) r32, b10, 5));
        boolean z11 = false;
        r32[0].addView(b1Var2);
        if (org.telegram.messenger.w3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                b1Var3.j(org.telegram.messenger.cd.L0(2131746101, null), 2131232405, null);
            } else {
                b1Var3.j(org.telegram.messenger.cd.L0(2131752039, null), 2131232403, null);
            }
            b1Var3.setMinimumWidth(160);
            b1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final pb1 f40559b;

                {
                    this.f40559b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            pb1 pb1Var = this.f40559b;
                            pb1Var.C0 = true;
                            pb1Var.N0 = true;
                            org.telegram.messenger.x00 x00Var = pb1Var.f40604s;
                            long j13 = pb1Var.f40566a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            x00Var.t(j13, tL_forumTopic2.f19845id, !tL_forumTopic2.pinned, pb1Var);
                            pb1Var.finishPreviewFragment();
                            return;
                        case 1:
                            pb1 pb1Var2 = this.f40559b;
                            pb1Var2.N0 = true;
                            org.telegram.messenger.x00 x00Var2 = pb1Var2.f40604s;
                            long j14 = pb1Var2.f40566a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            x00Var2.z(tL_forumTopic3.f19845id, j14, true ^ tL_forumTopic3.closed);
                            pb1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19845id));
                            pb1 pb1Var3 = this.f40559b;
                            pb1Var3.G0(hashSet, new na1(pb1Var3, 3));
                            return;
                    }
                }
            });
            z11 = false;
            r32[0].addView(b1Var3);
        }
        if (org.telegram.messenger.w3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.b1 b1Var4 = new org.telegram.ui.ActionBar.b1(getParentActivity(), z11, true);
            b1Var4.j(org.telegram.messenger.cd.J0(1, "DeleteTopics"), 2131232107, null);
            b1Var4.c(org.telegram.ui.ActionBar.t6.f21170q7, org.telegram.ui.ActionBar.t6.f21153p7);
            b1Var4.setMinimumWidth(160);
            b1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final pb1 f40559b;

                {
                    this.f40559b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            pb1 pb1Var = this.f40559b;
                            pb1Var.C0 = true;
                            pb1Var.N0 = true;
                            org.telegram.messenger.x00 x00Var = pb1Var.f40604s;
                            long j13 = pb1Var.f40566a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            x00Var.t(j13, tL_forumTopic2.f19845id, !tL_forumTopic2.pinned, pb1Var);
                            pb1Var.finishPreviewFragment();
                            return;
                        case 1:
                            pb1 pb1Var2 = this.f40559b;
                            pb1Var2.N0 = true;
                            org.telegram.messenger.x00 x00Var2 = pb1Var2.f40604s;
                            long j14 = pb1Var2.f40566a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            x00Var2.z(tL_forumTopic3.f19845id, j14, true ^ tL_forumTopic3.closed);
                            pb1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19845id));
                            pb1 pb1Var3 = this.f40559b;
                            pb1Var3.G0(hashSet, new na1(pb1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(b1Var4);
        }
        boolean x22 = getMessagesController().x2(j12);
        if (this.P0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.P0.setBackground(new BitmapDrawable(createBitmap));
            this.P0.setAlpha(0.0f);
            if (this.P0.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.b6.c(-1.0f, -1));
        }
        un unVar = new un(org.telegram.ui.Cells.f1.k(j11, "chat_id"));
        if (x22) {
            j10 = org.telegram.messenger.o5.o(v2Var.N.from_id);
        } else {
            j10 = v2Var.N.f19845id;
        }
        gg.e.a(unVar, org.telegram.messenger.gs.a(j12, j10));
        presentFragmentAsPreviewWithMenu(unVar, r32[0]);
    }

    public final void Q0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb1.Q0(android.view.View):void");
    }

    public final void R0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb1.R0(boolean):void");
    }

    public final void S0() {
        RadialProgressView radialProgressView = this.f40595n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21160pf));
        this.h.updateColors();
        dg0 dg0Var = this.f40597o0;
        int i10 = org.telegram.ui.ActionBar.t6.f20929d6;
        dg0Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21206s8));
        }
        this.f40603r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void T0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.f40566a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        int i10 = 0;
        if (!org.telegram.messenger.w3.r0(getMessagesController().L0(Long.valueOf(j10))) && org.telegram.messenger.w3.w(15, L0) && !this.f40605s0 && !this.f40606t0 && !this.J0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        org.telegram.ui.ActionBar.b1 b1Var = this.Q;
        if (!z11) {
            i10 = 8;
        }
        b1Var.setVisibility(i10);
        J0(!this.K, z10);
    }

    public final void U0() {
        boolean z10;
        if (org.telegram.messenger.w3.y(15, g()) && !this.f40567a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f40570b0 != z10) {
            this.f40570b0 = z10;
            gb1 gb1Var = this.f40602r;
            gb1Var.k(0, gb1Var.b());
        }
    }

    public final void V0(float f7) {
        this.W = f7;
        W0();
        this.f40571b1 = true;
        float f10 = 1.0f - f7;
        this.f40579f.getTitleTextView().setAlpha(f10);
        this.f40579f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.v71 v71Var = this.f40568a1;
        if (v71Var != null) {
            v71Var.setTranslationY((-org.telegram.messenger.i0.L(16.0f)) * f10);
            this.f40568a1.setAlpha(f7);
        }
        this.f40603r0.setTranslationY((-org.telegram.messenger.i0.L(16.0f)) * f10);
        this.f40603r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float z10 = c3.i0.z(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(z10);
            this.N.setScaleY(z10);
        }
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void W0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f21261v8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.f21313y8;
        lVar.D(i0.b.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.D(i0.b.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.C(i0.b.f(this.W, getThemedColor(org.telegram.ui.ActionBar.t6.f21225t8), getThemedColor(org.telegram.ui.ActionBar.t6.f21332z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.b.f(this.W, getThemedColor(org.telegram.ui.ActionBar.t6.f21206s8), getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6)));
        }
    }

    public final void X0() {
        org.telegram.ui.Components.kj kjVar = this.D0;
        if (kjVar != null && kjVar.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231245, 0);
            dqVar.c(org.telegram.messenger.i0.L(16.0f));
            spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
            if (org.telegram.messenger.w3.y(15, g())) {
                this.D0.e.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748152, null)), spannableStringBuilder, "%s"));
                return;
            }
            String L0 = org.telegram.messenger.cd.L0(2131750483, null);
            TLRPC.TL_forumTopic f7 = getMessagesController().f18891r7.f(this.f40566a, 1L);
            if (f7 != null) {
                L0 = f7.title;
            }
            this.D0.e.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("NoTopicsDescriptionUser", null, 2131748151, L0)));
        }
    }

    public final void Y0(boolean z10, boolean z11) {
        sa1 sa1Var;
        eb1 eb1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        org.telegram.messenger.x00 x00Var = this.f40604s;
        long j10 = this.f40566a;
        ArrayList l4 = x00Var.l(j10);
        if (l4 != null) {
            ArrayList arrayList = this.f40569b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            eb1 eb1Var2 = null;
            if (org.telegram.messenger.h20.u(org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(-j10))) && this.f40607u0) {
                arrayList.add(new hb1(3, null));
            }
            for (int i10 = 0; i10 < l4.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l4.get(i10)).f19845id))) {
                    arrayList.add(new hb1(0, (TLRPC.TL_forumTopic) l4.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !x00Var.e(j10) && this.V0) {
                arrayList.add(new hb1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f40613y = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                hb1 hb1Var = (hb1) arrayList.get(i11);
                if (hb1Var != null && (tL_forumTopic = hb1Var.f37887c) != null && tL_forumTopic.hidden) {
                    this.f40613y++;
                }
            }
            cb1 cb1Var = this.N;
            if (cb1Var != null) {
                s4.l0 itemAnimator = cb1Var.getItemAnimator();
                if (z10) {
                    eb1Var = this.I0;
                } else {
                    eb1Var = null;
                }
                if (itemAnimator != eb1Var) {
                    cb1 cb1Var2 = this.N;
                    if (z10) {
                        eb1Var2 = this.I0;
                    }
                    cb1Var2.setItemAnimator(eb1Var2);
                }
            }
            gb1 gb1Var = this.f40602r;
            if (gb1Var != null) {
                gb1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (sa1Var = this.F) != null) {
                sa1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        D0();
        X0();
    }

    @Override
    public final long a() {
        return -this.f40566a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        SpannableStringBuilder spannableStringBuilder;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        ay ayVar = this.M0;
        if (ayVar != null && ayVar.W) {
            i10 = org.telegram.messenger.i0.L(72.0f);
        } else {
            i10 = 0;
        }
        this.f40576d1 = i10;
        ay ayVar2 = this.M0;
        if (ayVar2 != null && ayVar2.W) {
            i11 = org.telegram.messenger.i0.L(64.0f);
        } else {
            i11 = 0;
        }
        this.f40578e1 = i11;
        xa1 xa1Var = new xa1(this, context);
        this.d = xa1Var;
        this.fragmentView = xa1Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, xa1Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if ((!org.telegram.messenger.i0.Q1() || ((z4Var2 = this.parentLayout) != null && ((ActionBarLayout) z4Var2).f20072b)) && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        lVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.actionBar.setActionBarMenuOnItemClick(new bb1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final pb1 f39621b;

            {
                this.f39621b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var;
                switch (r2) {
                    case 0:
                        pb1 pb1Var = this.f39621b;
                        if (!pb1Var.f40605s0) {
                            pb1Var.K0(false);
                            return;
                        }
                        return;
                    case 1:
                        pb1 pb1Var2 = this.f39621b;
                        pb1Var2.getMessagesController().h2(-pb1Var2.f40566a, null, pb1Var2.g());
                        pb1Var2.R0(false);
                        return;
                    case 2:
                        this.f39621b.finishPreviewFragment();
                        return;
                    case 3:
                        ay ayVar3 = this.f39621b.M0;
                        if (ayVar3 != null && (t0Var = ayVar3.f35820j0) != null) {
                            t0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        pb1 pb1Var3 = this.f39621b;
                        pb1Var3.presentFragment(la1.e0(pb1Var3.f40566a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.t0 a2 = p5.a(0, 2131232485);
            this.f40599p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final pb1 f39621b;

                {
                    this.f39621b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.t0 t0Var;
                    switch (r2) {
                        case 0:
                            pb1 pb1Var = this.f39621b;
                            if (!pb1Var.f40605s0) {
                                pb1Var.K0(false);
                                return;
                            }
                            return;
                        case 1:
                            pb1 pb1Var2 = this.f39621b;
                            pb1Var2.getMessagesController().h2(-pb1Var2.f40566a, null, pb1Var2.g());
                            pb1Var2.R0(false);
                            return;
                        case 2:
                            this.f39621b.finishPreviewFragment();
                            return;
                        case 3:
                            ay ayVar3 = this.f39621b.M0;
                            if (ayVar3 != null && (t0Var = ayVar3.f35820j0) != null) {
                                t0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            pb1 pb1Var3 = this.f39621b;
                            pb1Var3.presentFragment(la1.e0(pb1Var3.f40566a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.t0 a10 = p5.a(0, 2131232485);
            this.f40599p0 = a10;
            a10.N();
            a10.J(new ag.l3(this, 22));
            this.f40599p0.setSearchPaddingStart(56);
            this.f40599p0.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
            EditTextBoldCursor searchField = this.f40599p0.getSearchField();
            org.telegram.ui.ActionBar.a7.V(searchField, org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Gj, getResourceProvider());
            org.telegram.ui.ActionBar.a7.w(searchField, org.telegram.ui.ActionBar.t6.Ke, getResourceProvider());
        }
        org.telegram.ui.ActionBar.t0 c10 = p5.c(0, 2131231245, null);
        this.f40601q0 = c10;
        c10.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        this.f40601q0.e(1, 2131232112, org.telegram.messenger.cd.L0(2131744027, null));
        this.R = this.f40601q0.e(2, 2131232044, org.telegram.messenger.cd.L0(2131754401, null));
        org.telegram.ui.ActionBar.t0 t0Var = this.f40601q0;
        this.T = t0Var.d(14, 0, new org.telegram.ui.Components.bi0(2131623944, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)), org.telegram.messenger.cd.L0(2131753585, null), true, false, t0Var.m0);
        this.Q = this.f40601q0.e(3, 2131232404, org.telegram.messenger.cd.L0(2131751703, null));
        this.U = this.f40601q0.e(15, 2131232332, org.telegram.messenger.cd.L0(2131746247, null));
        this.S = this.f40601q0.d(11, 2131232194, null, org.telegram.messenger.cd.L0(2131749000, null), true, false, null);
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, this, false, this.resourceProvider);
        this.f40579f = snVar;
        snVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.Components.sn snVar2 = this.f40579f;
        if ((!org.telegram.messenger.i0.Q1() || ((z4Var = this.parentLayout) != null && ((ActionBarLayout) z4Var).f20072b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        snVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.sn snVar3 = this.f40579f;
        long j10 = -this.f40566a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        snVar3.f30268b = z12;
        snVar3.setClipChildren(false);
        this.actionBar.addView(this.f40579f, 0, w7.b6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f40606t0) {
            this.f40579f.getAvatarImageView().setOnClickListener(new z7(this, 4));
        }
        this.N = new cb1(this, context);
        zg.h hVar = new zg.h(this.d);
        ViewGroup viewGroup = this.d;
        tg.b bVar = this.f40591k1;
        bVar.f48700f = hVar;
        bVar.f48701g = viewGroup;
        cb1 cb1Var = this.N;
        ay ayVar3 = this.M0;
        if (ayVar3 != null) {
            viewGroup = (ViewGroup) ayVar3.getFragmentView();
        }
        cb1 cb1Var2 = this.N;
        Objects.requireNonNull(cb1Var2);
        this.l1 = new tg.j(cb1Var, viewGroup, new m50(cb1Var2, 2));
        this.N.D0(new na1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        gg.d c11 = gg.e.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        kw kwVar = new kw(this, org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(2131754719, null), spannableString, "#"), org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(2131754721, null), spannableString, "#"));
        this.f40611x = kwVar;
        kwVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.D = i12;
        kw kwVar2 = this.f40611x;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        kwVar2.X = z13;
        eb1 eb1Var = new eb1(this);
        this.N.setHideIfEmpty(false);
        eb1Var.f47927m = false;
        eb1Var.C = false;
        cb1 cb1Var3 = this.N;
        this.I0 = eb1Var;
        cb1Var3.setItemAnimator(eb1Var);
        this.N.setOnScrollListener(new ta1(this, 1));
        cb1 cb1Var4 = this.N;
        cb1Var4.W1 = true;
        cb1Var4.X1 = 0;
        org.telegram.ui.Components.wj0 wj0Var = new org.telegram.ui.Components.wj0(cb1Var4, true);
        this.K0 = wj0Var;
        this.N.setItemsEnterAnimator(wj0Var);
        this.N.setOnItemClickListener(new kz0(this, 9));
        this.N.setOnItemLongClickListener(new oa1(this));
        this.N.setOnScrollListener(new ta1(this, 2));
        cb1 cb1Var5 = this.N;
        sa1 sa1Var = new sa1(this);
        this.F = sa1Var;
        cb1Var5.setLayoutManager(sa1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f40602r);
        this.N.setClipToPadding(false);
        this.N.j(new ta1(this, 0));
        ob1 ob1Var = new ob1(this);
        this.P = ob1Var;
        ua1 ua1Var = new ua1(this, ob1Var);
        this.O = ua1Var;
        ua1Var.h(this.N);
        this.d.addView(this.N, w7.b6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -org.telegram.messenger.i0.L(100.0f);
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(getParentActivity(), this.resourceProvider, false);
        this.h = f10Var;
        this.d.addView(f10Var, org.telegram.ui.Components.f10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final pb1 f39621b;

            {
                this.f39621b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var2;
                switch (r2) {
                    case 0:
                        pb1 pb1Var = this.f39621b;
                        if (!pb1Var.f40605s0) {
                            pb1Var.K0(false);
                            return;
                        }
                        return;
                    case 1:
                        pb1 pb1Var2 = this.f39621b;
                        pb1Var2.getMessagesController().h2(-pb1Var2.f40566a, null, pb1Var2.g());
                        pb1Var2.R0(false);
                        return;
                    case 2:
                        this.f39621b.finishPreviewFragment();
                        return;
                    case 3:
                        ay ayVar32 = this.f39621b.M0;
                        if (ayVar32 != null && (t0Var2 = ayVar32.f35820j0) != null) {
                            t0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        pb1 pb1Var3 = this.f39621b;
                        pb1Var3.presentFragment(la1.e0(pb1Var3.f40566a, 0L));
                        return;
                }
            }
        });
        this.h.f25929c.setImageResource(2131231267);
        this.h.f25929c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f25929c.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.cd.L0(2131751703, null));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(24);
        zzVar.setVisibility(8);
        zzVar.f33274x = true;
        ja1 ja1Var = new ja1(context, 1);
        TextView textView = new TextView(context);
        ja1Var.d = textView;
        if (org.telegram.messenger.cd.X) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131230874, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131744285, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131744285, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131230872, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21311y6, getResourceProvider());
        boolean z14 = org.telegram.messenger.cd.X;
        if (z14) {
            f7 = 72.0f;
        } else {
            f7 = 32.0f;
        }
        if (z14) {
            f10 = 32.0f;
        } else {
            f10 = 72.0f;
        }
        ja1Var.addView(textView, w7.b6.d(-2, -2.0f, 81, f7, 0.0f, f10, 32.0f));
        this.f40594n = ja1Var;
        textView.setAlpha(0.0f);
        org.telegram.ui.Components.kj kjVar = new org.telegram.ui.Components.kj(this, context, zzVar);
        this.D0 = kjVar;
        try {
            kjVar.f25550b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(org.telegram.messenger.cd.L0(2131748154, null));
        X0();
        this.f40594n.addView(zzVar);
        this.f40594n.addView(this.D0);
        this.d.addView(this.f40594n);
        this.N.setEmptyView(this.f40594n);
        this.f40597o0 = new dg0(context, 15);
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(context);
        this.L = w51Var;
        this.f40597o0.addView(w51Var);
        this.d.addView(this.f40597o0, w7.b6.e(-1, 51, 80));
        this.L.setOnClickListener(new va1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f40595n0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(22.0f));
        this.f40595n0.setVisibility(4);
        this.f40597o0.addView(this.f40595n0, w7.b6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(2131231982);
        this.W0.setContentDescription(org.telegram.messenger.cd.L0(2131752041, null));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.t6.Re;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.c(null, org.telegram.ui.ActionBar.j6.b(getThemedColor(i13))));
        org.telegram.ui.ActionBar.a7.t(this.W0, i13, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f40597o0.addView(this.W0, w7.b6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final pb1 f39621b;

            {
                this.f39621b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var2;
                switch (r2) {
                    case 0:
                        pb1 pb1Var = this.f39621b;
                        if (!pb1Var.f40605s0) {
                            pb1Var.K0(false);
                            return;
                        }
                        return;
                    case 1:
                        pb1 pb1Var2 = this.f39621b;
                        pb1Var2.getMessagesController().h2(-pb1Var2.f40566a, null, pb1Var2.g());
                        pb1Var2.R0(false);
                        return;
                    case 2:
                        this.f39621b.finishPreviewFragment();
                        return;
                    case 3:
                        ay ayVar32 = this.f39621b.M0;
                        if (ayVar32 != null && (t0Var2 = ayVar32.f35820j0) != null) {
                            t0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        pb1 pb1Var3 = this.f39621b;
                        pb1Var3.presentFragment(la1.e0(pb1Var3.f40566a, 0L));
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        R0(false);
        l0 l0Var = new l0(this, context, 28);
        this.e = l0Var;
        if (this.M0 == null) {
            this.d.addView(l0Var, w7.b6.e(-1, -1, 119));
        }
        lb1 lb1Var = new lb1(this, context);
        this.f40603r0 = lb1Var;
        lb1Var.setVisibility(8);
        this.e.addView(this.f40603r0, w7.b6.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        lb1 lb1Var2 = this.f40603r0;
        int i14 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.a7.i(i14, lb1Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.f40566a, true, null, true, false, 0);
        org.telegram.ui.Components.zr zrVar = new org.telegram.ui.Components.zr(context);
        this.U0 = zrVar;
        zrVar.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f));
        vg.f c12 = bVar.c(this.U0, w7.b9.o(this.resourceProvider), false);
        org.telegram.messenger.z20.u(c12, org.telegram.messenger.i0.L(24.0f), 7.0f);
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new na1(this, 0));
        this.d.addView(this.U0, w7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            oh.e eVar = new oh.e(g10, this);
            this.R0 = eVar;
            this.U0.addView(eVar.b(), w7.b6.o(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            oh.e eVar2 = this.R0;
            eVar2.f14256m = new oa1(this);
            TLRPC.ChatFull chatFull = this.J;
            eVar2.f14253j = chatFull;
            if (chatFull != null) {
                eVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.F0 = frameLayout;
            this.U0.addView(frameLayout);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            y8 y8Var = new y8(this, context, this);
            this.G0 = y8Var;
            this.F0.addView(y8Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams c13 = w7.b6.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = org.telegram.messenger.i0.f16020m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        B0();
        do0 do0Var = new do0(this, context, 6);
        this.P0 = do0Var;
        do0Var.setForeground(new ColorDrawable(i0.b.o(getThemedColor(i14), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final pb1 f39621b;

            {
                this.f39621b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var2;
                switch (r2) {
                    case 0:
                        pb1 pb1Var = this.f39621b;
                        if (!pb1Var.f40605s0) {
                            pb1Var.K0(false);
                            return;
                        }
                        return;
                    case 1:
                        pb1 pb1Var2 = this.f39621b;
                        pb1Var2.getMessagesController().h2(-pb1Var2.f40566a, null, pb1Var2.g());
                        pb1Var2.R0(false);
                        return;
                    case 2:
                        this.f39621b.finishPreviewFragment();
                        return;
                    case 3:
                        ay ayVar32 = this.f39621b.M0;
                        if (ayVar32 != null && (t0Var2 = ayVar32.f35820j0) != null) {
                            t0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        pb1 pb1Var3 = this.f39621b;
                        pb1Var3.presentFragment(la1.e0(pb1Var3.f40566a, 0L));
                        return;
                }
            }
        });
        this.P0.setFitsSystemWindows(true);
        this.V = true;
        if (this.inPreviewMode && org.telegram.messenger.i0.Q1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) it.next();
                if (k2Var instanceof ay) {
                    ay ayVar4 = (ay) k2Var;
                    if (ayVar4.s4()) {
                        org.telegram.messenger.gs gsVar = ayVar4.f35850p2;
                        if (gsVar.f15760a == j10) {
                            this.Q0 = gsVar.f15761b;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Y0(false, false);
        }
        R0(false);
        S0();
        if (org.telegram.messenger.w3.R(g())) {
            getMessagesController().G0().a(j10, new s3(this, 25));
        }
        View view = this.fragmentView;
        oa1 oa1Var = new oa1(this);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(view, oa1Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = org.telegram.messenger.zs.T;
        long j10 = this.f40566a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f19794id == j10) {
                R0(false);
                oh.e eVar = this.R0;
                if (eVar != null) {
                    eVar.f14253j = chatFull2;
                    eVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                C0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == org.telegram.messenger.zs.f19709v5) {
            R0(false);
        } else if (i10 == org.telegram.messenger.zs.f19668p3) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == org.telegram.messenger.zs.f19675q5) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                Y0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    B0();
                }
                D0();
            }
        } else if (i10 == org.telegram.messenger.zs.f19676r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.vp.D8;
            if (intValue == 8192) {
                R0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().f18891r7.y(j10, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                Y0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19683s) {
            Y0(false, false);
        } else if (i10 == org.telegram.messenger.zs.f19713w2) {
            Long l4 = (Long) objArr[0];
            if (j10 == l4.longValue()) {
                this.H0 = getMessagesController().f1(l4.longValue(), false, null);
                y8 y8Var = this.G0;
                if (y8Var != null) {
                    y8Var.a(!this.fragmentBeginToShow);
                }
                C0(false);
            }
        } else if (i10 == org.telegram.messenger.zs.f19608f0) {
            Y0(false, false);
            R0(true);
        } else if (i10 != org.telegram.messenger.zs.f19682r5 && i10 == org.telegram.messenger.zs.f19690t) {
            removeSelfFromStack(true);
        }
        if (i10 == org.telegram.messenger.zs.f19620h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.i0.Q1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j10) && !booleanValue) {
                if (this.Q0 != longValue2) {
                    this.Q0 = longValue2;
                    Y0(false, false);
                }
            } else if (this.Q0 != 0) {
                this.Q0 = 0L;
                Y0(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat g() {
        return getMessagesController().L0(Long.valueOf(this.f40566a));
    }

    @Override
    public final org.telegram.messenger.u3 getGroupCall() {
        org.telegram.messenger.u3 u3Var = this.H0;
        if (u3Var != null && (u3Var.f18228b instanceof TLRPC.TL_groupCall)) {
            return u3Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        lb1 lb1Var = this.f40603r0;
        if (lb1Var != null && lb1Var.W != null) {
            int i10 = org.telegram.ui.Cells.z3.h;
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i10;
        if (this.f40605s0) {
            i10 = org.telegram.ui.ActionBar.t6.f20929d6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21206s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.u()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f21279w8);
        }
        if (i0.b.h(themedColor) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final TLRPC.User j() {
        return null;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f40567a0.isEmpty()) {
            if (z10) {
                F0();
                return false;
            }
        } else if (this.f40605s0) {
            if (z10) {
                this.actionBar.y(this.f40599p0.T(false));
            }
        } else {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.k(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = this.f40566a;
        messagesController.T2(0, j10, true);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19709v5);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19668p3);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19675q5);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19676r);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19683s);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19713w2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19608f0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19682r5);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19690t);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19620h0);
        Y0(false, false);
        i31.t(this.currentAccount);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j10));
        if (org.telegram.messenger.w3.T(L0)) {
            getMessagesController().S4(L0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f40565q1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j10));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().i1(-j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.O0.e();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19709v5);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19668p3);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19675q5);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19676r);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19683s);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19713w2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19608f0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19682r5);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19690t);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19620h0);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f40566a));
        if (org.telegram.messenger.w3.T(L0)) {
            getMessagesController().S4(L0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        ay ayVar = this.M0;
        if (ayVar != null && ayVar.F3 != null) {
            ayVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.F3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().f18891r7.f19174f;
        long j10 = this.f40566a;
        int i10 = 0;
        int i11 = longSparseIntArray.get(j10, 0) - 1;
        if (i11 >= 0) {
            i10 = i11;
        }
        longSparseIntArray.put(j10, i10);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.x00 x00Var = getMessagesController().f18891r7;
        LongSparseIntArray longSparseIntArray = x00Var.f19174f;
        long j10 = this.f40566a;
        longSparseIntArray.put(j10, longSparseIntArray.get(j10, 0) + 1);
        x00Var.y(j10, true);
        this.G = false;
        org.telegram.messenger.i0.a4(this.N);
        this.G = true;
        setBulletinDelegate(new z8(this, 9));
        if (this.inPreviewMode && !getMessagesController().s2(-j10)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if (org.telegram.messenger.tz.o() != 0 && this.T0) {
            O0(f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        hi.c cVar = this.f40589j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.j6.b(getThemedColor(org.telegram.ui.ActionBar.t6.Re))) != this.f40600p1) {
            this.f40600p1 = b10;
            org.telegram.ui.ActionBar.t6.H1(this.W0.getBackground(), b10, true);
        }
        for (int i10 = 0; i10 < 2; i10++) {
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.F(getThemedColor(org.telegram.ui.ActionBar.t6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.t6.I5), true);
        }
        do0 do0Var = this.P0;
        if (do0Var != null && (do0Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.b.o(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6), 100));
        }
        S0();
        try {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
            }
            kw kwVar = this.f40611x;
            if (kwVar != null) {
                kwVar.i();
            }
            if (this.actionBar != null && this.f40571b1) {
                W0();
            }
            NumberTextView numberTextView = this.f40573c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21313y8));
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.f40599p0;
            if (t0Var != null && t0Var.getSearchField() != null) {
                this.f40599p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.Ke));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        xw xwVar;
        do0 do0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (do0Var = this.P0) != null) {
            if (do0Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            C0(false);
        }
        this.O0.e();
        if (!z10) {
            if (this.f40606t0 && this.H) {
                removeSelfFromStack();
                ay ayVar = this.L0;
                if (ayVar != null) {
                    ayVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                ay ayVar2 = this.M0;
                if (ayVar2 != null && (xwVar = ayVar2.F3) != null && xwVar.c()) {
                    this.M0.F3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        do0 do0Var = this.P0;
        if (do0Var != null && do0Var.getVisibility() == 0) {
            if (z10) {
                this.P0.setAlpha(1.0f - f7);
            } else {
                this.P0.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.O0.d();
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            N0(true);
            return;
        }
        this.T0 = false;
        N0(false);
        O0(1.0f);
    }

    @Override
    public final org.telegram.ui.Components.sn q() {
        return this.f40579f;
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.sn snVar = this.f40579f;
        if (snVar != null) {
            snVar.setAlpha(f7);
            this.f40601q0.setAlpha(f7);
            org.telegram.ui.ActionBar.t0 t0Var = this.f40599p0;
            if (t0Var != null) {
                t0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.sn snVar = this.f40579f;
        if (snVar != null) {
            snVar.setAlpha(f7);
            this.f40579f.setTranslationX((1.0f - f7) * org.telegram.messenger.i0.L(40.0f));
        }
    }

    @Override
    public final void u() {
        this.N.y0(0);
    }

    @Override
    public final void r() {
    }

    @Override
    public final void k(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
