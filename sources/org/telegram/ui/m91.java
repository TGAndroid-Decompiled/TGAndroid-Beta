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
public class m91 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.ig, de0 {
    public static final HashSet f47574r1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public int E;
    public ei.f5 E0;
    public boolean F;
    public c91 F0;
    public q81 G;
    public FrameLayout G0;
    public boolean H;
    public w8 H0;
    public boolean I;
    public org.telegram.messenger.r3 I0;
    public boolean J;
    public b91 J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public org.telegram.ui.Components.wi0 L0;
    public org.telegram.ui.Components.n41 M;
    public uw M0;
    public int N;
    public uw N0;
    public z81 O;
    public boolean O0;
    public s81 P;
    public final g2.g P0;
    public l91 Q;
    public org.telegram.ui.Components.voip.r0 Q0;
    public org.telegram.ui.ActionBar.y0 R;
    public long R0;
    public org.telegram.ui.ActionBar.y0 S;
    public zh.d S0;
    public org.telegram.ui.ActionBar.y0 T;
    public float T0;
    public org.telegram.ui.ActionBar.y0 U;
    public boolean U0;
    public org.telegram.ui.ActionBar.y0 V;
    public org.telegram.ui.Components.pr V0;
    public boolean W;
    public final boolean W0;
    public float X;
    public ImageView X0;
    public TL_stories.TL_premium_boostsStatus Y;
    public float Y0;
    public long Z;
    public ValueAnimator Z0;
    public final long f47575a;
    public boolean f47576a0;
    public boolean f47577a1;
    public final ArrayList f47578b;
    public final HashSet f47579b0;
    public org.telegram.ui.Components.m61 f47580b1;
    public int f47581c;
    public boolean f47582c0;
    public boolean f47583c1;
    public v81 d;
    public NumberTextView f47584d0;
    public View f47585d1;
    public l0 f47586e;
    public org.telegram.ui.ActionBar.q0 f47587e0;
    public int f47588e1;
    public org.telegram.ui.Components.jn f47589f;
    public org.telegram.ui.ActionBar.q0 f47590f0;
    public int f47591f1;
    public org.telegram.ui.ActionBar.q0 f47592g0;
    public int f47593g1;
    public org.telegram.ui.Components.l00 h;
    public org.telegram.ui.ActionBar.q0 f47594h0;
    public final eh.g f47595h1;
    public org.telegram.ui.ActionBar.q0 f47596i0;
    public final si.f f47597i1;
    public org.telegram.ui.ActionBar.q0 f47598j0;
    public final si.f f47599j1;
    public org.telegram.ui.ActionBar.y0 f47600k0;
    public final si.c k1;
    public org.telegram.ui.ActionBar.y0 f47601l0;
    public final eh.c f47602l1;
    public org.telegram.ui.ActionBar.y0 m0;
    public eh.k m1;
    public j81 f47603n;
    public org.telegram.ui.ActionBar.q0 f47604n0;
    public final ArrayList f47605n1;
    public RadialProgressView f47606o0;
    public final RectF f47607o1;
    public yg0 f47608p0;
    public final RectF f47609p1;
    public org.telegram.ui.ActionBar.q0 f47610q0;
    public int f47611q1;
    public final d91 f47612r;
    public org.telegram.ui.ActionBar.q0 f47613r0;
    public final org.telegram.messenger.c00 f47614s;
    public i91 f47615s0;
    public boolean f47616t0;
    public final boolean f47617u0;
    public final boolean f47618v0;
    public n91 f47619w;
    public final boolean f47620w0;
    public cv f47621x;
    public final boolean f47622x0;
    public int f47623y;
    public final boolean f47624y0;
    public String f47625z0;

    public m91(Bundle bundle) {
        super(bundle);
        this.f47578b = new ArrayList();
        new ArrayList();
        this.f47612r = new d91(this);
        this.f47623y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.f47579b0 = new HashSet();
        this.C0 = false;
        this.P0 = new g2.g(new int[]{org.telegram.messenger.hs.f23291q5});
        this.T0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f47605n1 = arrayList;
        RectF rectF = new RectF();
        this.f47607o1 = rectF;
        RectF rectF2 = new RectF();
        this.f47609p1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f47575a = j10;
        this.f47617u0 = this.arguments.getBoolean("for_select", false);
        this.f47618v0 = this.arguments.getBoolean("forward_to", false);
        this.f47624y0 = this.arguments.getBoolean("bot_share_to", false);
        this.f47620w0 = this.arguments.getBoolean("quote", false);
        this.f47622x0 = this.arguments.getBoolean("reply_to", false);
        this.f47625z0 = this.arguments.getString("voicechat", null);
        this.A0 = this.arguments.getBoolean("videochat", false);
        this.f47614s = getMessagesController().f23102q7;
        this.W0 = !org.telegram.messenger.k5.w("topics_end_reached_", j10, getUserConfig().k(), false);
        si.c cVar = new si.c();
        this.k1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f47595h1 = new eh.g(false);
            this.f47597i1 = new si.f(null);
            si.f fVar = new si.f(null);
            this.f47599j1 = fVar;
            eh.c cVar2 = new eh.c(fVar, fVar, fVar);
            this.f47602l1 = cVar2;
            cVar2.f9988k = true;
            return;
        }
        this.f47595h1 = null;
        this.f47597i1 = null;
        this.f47599j1 = null;
        this.f47602l1 = new eh.c(cVar, cVar, cVar);
    }

    public static org.telegram.ui.ActionBar.d2 I0(org.telegram.messenger.hp hpVar, org.telegram.messenger.qr qrVar, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog S0 = hpVar.S0(-j10);
            if (S0 != null && S0.view_forum_as_messages) {
                return new wm(bundle);
            }
            TLRPC.ChatFull N0 = hpVar.N0(j10);
            if (N0 == null) {
                N0 = qrVar.F0(j10, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.view_forum_as_messages) {
                return new wm(bundle);
            }
        }
        return new m91(bundle);
    }

    public static org.telegram.ui.ActionBar.d2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.hp.s1(launchActivity.P), org.telegram.messenger.qr.a0(launchActivity.P), bundle);
    }

    public static void M0(org.telegram.ui.wm r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m91.M0(org.telegram.ui.wm):void");
    }

    public static boolean Z(m91 m91Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(m91Var.currentAccount).f22989d7.edit();
        edit.putLong("dialog_join_requested_time_" + (-m91Var.f47575a), System.currentTimeMillis()).commit();
        Activity parentActivity = m91Var.getParentActivity();
        boolean V = org.telegram.messenger.t3.V(m91Var.g());
        int i3 = org.telegram.ui.Components.x60.f40246r1;
        org.telegram.ui.Components.x60.J0(parentActivity, m91Var, org.telegram.ui.Components.fc.a0(m91Var), V);
        m91Var.S0(true);
        return false;
    }

    public static void a0(m91 m91Var, View view) {
        long j10;
        long j11 = m91Var.f47575a;
        if (m91Var.getParentLayout() != null && !((ActionBarLayout) m91Var.getParentLayout()).y() && (view instanceof j91)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((j91) view).O;
            long j12 = -j11;
            boolean y22 = m91Var.getMessagesController().y2(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (y22) {
                j10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f27053id;
            }
            long j13 = j10;
            if (m91Var.f47617u0) {
                n91 n91Var = m91Var.f47619w;
                if (n91Var != null) {
                    p91 p91Var = n91Var.f47921a;
                    Bundle bundle = new Bundle();
                    s91 s91Var = p91Var.f48498a;
                    bundle.putLong("dialog_id", s91Var.f49453c);
                    bundle.putLong("topic_id", tL_forumTopic.f27053id);
                    bundle.putBoolean("exception", true);
                    yw0 yw0Var = new yw0(bundle, null);
                    yw0Var.f52429s = new rb0(29, p91Var, tL_forumTopic);
                    s91Var.presentFragment(yw0Var);
                }
                uw uwVar = m91Var.M0;
                if (uwVar != null) {
                    uwVar.a4(j12, j13, true, m91Var);
                }
            } else if (m91Var.f47579b0.size() > 0) {
                m91Var.R0(view);
            } else {
                if (m91Var.inPreviewMode && org.telegram.messenger.g0.Q1()) {
                    for (org.telegram.ui.ActionBar.d2 d2Var : m91Var.getParentLayout().getFragmentStack()) {
                        if (d2Var instanceof uw) {
                            uw uwVar2 = (uw) d2Var;
                            if (uwVar2.t4()) {
                                org.telegram.messenger.pr prVar = uwVar2.f50283q2;
                                if (prVar.f24797a == j12 && prVar.f24798b == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    m91Var.R0 = j13;
                    m91Var.Z0(false, false);
                }
                rg.c.m(m91Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean b0(m91 m91Var, View view, float f10) {
        if (m91Var.f47617u0 || m91Var.getParentLayout() == null || ((ActionBarLayout) m91Var.getParentLayout()).y()) {
            return false;
        }
        if (!m91Var.actionBar.v() && !org.telegram.messenger.g0.Q1() && (view instanceof j91)) {
            j91 j91Var = (j91) view;
            if (j91Var.Z(f10)) {
                m91Var.Q0(j91Var);
                m91Var.O.I0(true);
                m91Var.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        m91Var.R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void f0(m91 m91Var, boolean z10) {
        float f10;
        boolean z11;
        pv pvVar;
        m91Var.f47616t0 = z10;
        ValueAnimator valueAnimator = m91Var.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            m91Var.Z0.cancel();
        }
        if (m91Var.f47580b1 == null) {
            org.telegram.ui.Components.m61 j10 = m91Var.f47615s0.j(8, false);
            m91Var.f47580b1 = j10;
            if (m91Var.N0 != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, j10, m91Var.getResourceProvider());
            }
            m91Var.f47586e.addView(m91Var.f47580b1, b8.mf.c(44.0f, -1));
        }
        float f11 = m91Var.X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        m91Var.Z0 = ValueAnimator.ofFloat(f11, f10);
        org.telegram.messenger.g0.Z3(m91Var.f47615s0, false, 1.0f, true, true);
        uw uwVar = m91Var.N0;
        if (uwVar != null && (pvVar = uwVar.G3) != null) {
            pvVar.N = !z10;
        }
        if (!z10 && m91Var.f47615s0.getVisibility() == 0 && m91Var.f47615s0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        m91Var.f47577a1 = z11;
        m91Var.Z0.addUpdateListener(new xy0(m91Var, 13));
        m91Var.f47615s0.setVisibility(0);
        if (!z10) {
            m91Var.f47613r0.setVisibility(0);
        } else {
            org.telegram.messenger.g0.a3(m91Var.getParentActivity(), m91Var.classGuid);
            m91Var.U0(false);
        }
        m91Var.Z0.addListener(new x81(m91Var, z10, 0));
        m91Var.Z0.setDuration(200L);
        m91Var.Z0.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        m91Var.Z0.start();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, Boolean.TRUE);
    }

    public static int r0(m91 m91Var) {
        return m91Var.currentAccount;
    }

    @Override
    public final si.f B() {
        return this.f47599j1;
    }

    public final void B0() {
        eh.g gVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        int i3;
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f47595h1) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int L2 = org.telegram.messenger.g0.L(48.0f) + ((int) this.V0.c(org.telegram.messenger.g0.L(14.0f)));
            uw uwVar = this.N0;
            if (uwVar != null) {
                view = uwVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (uwVar != null) {
                kVar = uwVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f47593g1) - org.telegram.messenger.g0.L(8.0f);
            this.f47607o1.set(0.0f, -L, view.getMeasuredWidth(), kVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.f47609p1;
            rectF.set(0.0f, measuredHeight - org.telegram.messenger.g0.L(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (org.telegram.messenger.lc.e(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -org.telegram.messenger.g0.L(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.N0 != null) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            gVar.g(i3, this.f47605n1);
            gVar.e(this.m1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void C0() {
        q81 q81Var;
        org.telegram.messenger.c00 c00Var = this.f47614s;
        long j10 = this.f47575a;
        if (!c00Var.e(j10) && (q81Var = this.G) != null) {
            int N0 = q81Var.N0();
            if (this.f47578b.isEmpty() || N0 >= this.f47612r.b() - 5) {
                c00Var.o(j10);
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.qt0 D() {
        return this.d;
    }

    public final void D0(boolean z10) {
        String str;
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.f47575a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        TLRPC.ChatFull N0 = getMessagesController().N0(j10);
        org.telegram.messenger.r3 r3Var = this.I0;
        if (r3Var != null && ((str = this.f47625z0) != null || this.A0)) {
            org.telegram.ui.Components.voip.n1.l(M0, str, false, Boolean.valueOf(!r3Var.f25049b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f47625z0 = null;
            this.A0 = false;
        } else if (this.f47625z0 != null && z10 && N0 != null && N0.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.k5.o(null, 2131748921, org.telegram.ui.Components.fc.a0(this), 2131624079, 36);
            this.f47625z0 = null;
        }
    }

    public final void E0() {
        boolean z10;
        org.telegram.messenger.c00 c00Var = this.f47614s;
        a0.h hVar = c00Var.f21922a;
        LongSparseIntArray longSparseIntArray = c00Var.f21924c;
        long j10 = this.f47575a;
        if (longSparseIntArray.get(j10, 0) == 1 && (hVar.f(j10) == null || ((ArrayList) hVar.f(j10)).isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K0 = z10;
        if (this.E0 != null) {
            ArrayList arrayList = this.f47578b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((e91) arrayList.get(0)).f44941c != null && ((e91) arrayList.get(0)).f44941c.f27053id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        z81 z81Var = this.O;
        if (z81Var != null) {
            z81Var.K0(z81Var.w1());
        }
        U0(true);
    }

    public final void F0() {
        int i3;
        float f10;
        float f11;
        uw uwVar = this.N0;
        float f12 = 0.0f;
        if (uwVar != null) {
            int L = org.telegram.messenger.g0.L(14.0f);
            org.telegram.ui.Components.pr prVar = uwVar.K1;
            if (prVar != null) {
                f10 = prVar.c(L);
            } else {
                f10 = 0.0f;
            }
            float f13 = f10 + 0.0f;
            org.telegram.ui.Components.pr prVar2 = this.V0;
            if (prVar2 != null) {
                float L2 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.pr prVar3 = this.N0.K1;
                if (prVar3 != null) {
                    f11 = prVar3.getMetadata().f53856c.f53866a;
                } else {
                    f11 = 0.0f;
                }
                prVar2.setTranslationY(f13 - (f11 * L2));
                org.telegram.ui.Components.pr prVar4 = this.V0;
                int L3 = org.telegram.messenger.g0.L(14.0f);
                int L4 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.pr prVar5 = this.N0.K1;
                if (prVar5 != null) {
                    f12 = prVar5.getMetadata().f53856c.f53866a;
                }
                f12 = prVar4.c(org.telegram.messenger.g0.W1(f12, L3, L4)) + f13;
            } else {
                f12 = f13;
            }
        } else {
            org.telegram.ui.Components.pr prVar6 = this.V0;
            if (prVar6 != null) {
                f12 = 0.0f + prVar6.c(org.telegram.messenger.g0.L(14.0f));
            }
        }
        int i10 = this.f47593g1 + this.f47588e1;
        if (this.W) {
            i3 = org.telegram.messenger.g0.L(51.0f);
        } else {
            i3 = 0;
        }
        this.O.setPadding(0, (int) f12, 0, i10 + i3);
    }

    public final void G0() {
        this.f47579b0.clear();
        this.actionBar.u();
        org.telegram.messenger.g0.b4(this.O);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String K0 = org.telegram.messenger.bd.K0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = K0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131751499, this.f47614s.f(this.f47575a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            s1Var.U = org.telegram.messenger.bd.M0(2131751498, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new u70(15));
        s1Var.show();
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, getResourceProvider());
        }
    }

    @Override
    public final boolean J() {
        return false;
    }

    public final void K0(boolean z10, boolean z11) {
        boolean z12 = true;
        this.h.e(!z10, (this.fragmentBeginToShow && z11) ? false : false);
    }

    @Override
    public final long L() {
        return 0L;
    }

    public final void L0(boolean z10) {
        int i3;
        TLRPC.Chat g7;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g7 = g()) != null && ((chatPhoto = g7.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f47575a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f47589f.getSharedMediaPreloader());
        profileActivity.a5(this.K);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f47589f.getAvatarImageView().getImageReceiver().J() && z10) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        profileActivity.g5(i3);
        presentFragment(profileActivity);
    }

    public final void N0(int i3) {
        int i10;
        int i11;
        if (this.N != i3) {
            this.N = i3;
            org.telegram.ui.Components.n41 n41Var = this.M;
            if (i3 == 0) {
                i10 = org.telegram.ui.ActionBar.k6.f28110pf;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28122q7;
            }
            n41Var.setTextColorKey(i10);
            ImageView imageView = this.X0;
            if (i3 == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            S0(false);
        }
    }

    public final void O0(boolean z10) {
        if (org.telegram.messenger.az.o() == 0) {
            return;
        }
        v81 v81Var = this.d;
        if (v81Var != null) {
            if (z10) {
                v81Var.setLayerType(2, null);
                v81Var.setClipChildren(false);
                v81Var.setClipToPadding(false);
            } else {
                v81Var.setLayerType(0, null);
                v81Var.setClipChildren(true);
                v81Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f10) {
        if (org.telegram.messenger.az.o() != 0) {
            this.T0 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            z81 z81Var = this.O;
            if (z81Var != null) {
                float D = a1.g.D(1.0f, this.T0, 0.05f, 1.0f);
                z81Var.setPivotX(0.0f);
                z81Var.setPivotY(0.0f);
                z81Var.setScaleX(D);
                z81Var.setScaleY(D);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(D);
                this.actionBar.setScaleY(D);
            }
        }
    }

    public final void Q0(org.telegram.ui.Cells.t2 t2Var) {
        boolean z10;
        long j10;
        try {
            t2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232562, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = t2Var.O;
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new u81(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(xnVar.f40423f);
        xnVar.f40431o = 1;
        long j11 = this.f47575a;
        long j12 = -j11;
        xnVar.e(j12, tL_forumTopic.f27053id, null);
        if (org.telegram.messenger.t3.y(15, g())) {
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                y0Var.j(org.telegram.messenger.bd.M0(2131751453, null), 2131232413, null);
            } else {
                y0Var.j(org.telegram.messenger.bd.M0(2131751454, null), 2131232293, null);
            }
            y0Var.setMinimumWidth(160);
            z10 = false;
            y0Var.setOnClickListener(new View.OnClickListener(this) {
                public final m91 f48491b;

                {
                    this.f48491b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            m91 m91Var = this.f48491b;
                            m91Var.D0 = true;
                            m91Var.O0 = true;
                            org.telegram.messenger.c00 c00Var = m91Var.f47614s;
                            long j13 = m91Var.f47575a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            c00Var.t(j13, tL_forumTopic2.f27053id, !tL_forumTopic2.pinned, m91Var);
                            m91Var.finishPreviewFragment();
                            return;
                        case 1:
                            m91 m91Var2 = this.f48491b;
                            m91Var2.O0 = true;
                            org.telegram.messenger.c00 c00Var2 = m91Var2.f47614s;
                            long j14 = m91Var2.f47575a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            c00Var2.z(tL_forumTopic3.f27053id, j14, true ^ tL_forumTopic3.closed);
                            m91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f27053id));
                            m91 m91Var3 = this.f48491b;
                            m91Var3.H0(hashSet, new n81(m91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(y0Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(getParentActivity(), z10, z10);
        if (getMessagesController().r2(j12, tL_forumTopic.f27053id, null)) {
            y0Var2.j(org.telegram.messenger.bd.M0(2131743859, null), 2131232256, null);
        } else {
            y0Var2.j(org.telegram.messenger.bd.M0(2131748322, null), 2131232412, null);
        }
        y0Var2.setMinimumWidth(160);
        y0Var2.setOnClickListener(new ei.t5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        boolean z11 = false;
        r32[0].addView(y0Var2);
        if (org.telegram.messenger.t3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                y0Var3.j(org.telegram.messenger.bd.M0(2131746094, null), 2131232406, null);
            } else {
                y0Var3.j(org.telegram.messenger.bd.M0(2131752039, null), 2131232404, null);
            }
            y0Var3.setMinimumWidth(160);
            y0Var3.setOnClickListener(new View.OnClickListener(this) {
                public final m91 f48491b;

                {
                    this.f48491b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            m91 m91Var = this.f48491b;
                            m91Var.D0 = true;
                            m91Var.O0 = true;
                            org.telegram.messenger.c00 c00Var = m91Var.f47614s;
                            long j13 = m91Var.f47575a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            c00Var.t(j13, tL_forumTopic2.f27053id, !tL_forumTopic2.pinned, m91Var);
                            m91Var.finishPreviewFragment();
                            return;
                        case 1:
                            m91 m91Var2 = this.f48491b;
                            m91Var2.O0 = true;
                            org.telegram.messenger.c00 c00Var2 = m91Var2.f47614s;
                            long j14 = m91Var2.f47575a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            c00Var2.z(tL_forumTopic3.f27053id, j14, true ^ tL_forumTopic3.closed);
                            m91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f27053id));
                            m91 m91Var3 = this.f48491b;
                            m91Var3.H0(hashSet, new n81(m91Var3, 3));
                            return;
                    }
                }
            });
            z11 = false;
            r32[0].addView(y0Var3);
        }
        if (org.telegram.messenger.t3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(getParentActivity(), z11, true);
            y0Var4.j(org.telegram.messenger.bd.K0(1, "DeleteTopics"), 2131232108, null);
            y0Var4.c(org.telegram.ui.ActionBar.k6.f28122q7, org.telegram.ui.ActionBar.k6.f28102p7);
            y0Var4.setMinimumWidth(160);
            y0Var4.setOnClickListener(new View.OnClickListener(this) {
                public final m91 f48491b;

                {
                    this.f48491b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            m91 m91Var = this.f48491b;
                            m91Var.D0 = true;
                            m91Var.O0 = true;
                            org.telegram.messenger.c00 c00Var = m91Var.f47614s;
                            long j13 = m91Var.f47575a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            c00Var.t(j13, tL_forumTopic2.f27053id, !tL_forumTopic2.pinned, m91Var);
                            m91Var.finishPreviewFragment();
                            return;
                        case 1:
                            m91 m91Var2 = this.f48491b;
                            m91Var2.O0 = true;
                            org.telegram.messenger.c00 c00Var2 = m91Var2.f47614s;
                            long j14 = m91Var2.f47575a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            c00Var2.z(tL_forumTopic3.f27053id, j14, true ^ tL_forumTopic3.closed);
                            m91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f27053id));
                            m91 m91Var3 = this.f48491b;
                            m91Var3.H0(hashSet, new n81(m91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(y0Var4);
        }
        boolean y22 = getMessagesController().y2(j12);
        if (this.Q0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.Q0.setBackground(new BitmapDrawable(createBitmap));
            this.Q0.setAlpha(0.0f);
            if (this.Q0.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.Q0, b8.mf.c(-1.0f, -1));
        }
        wm wmVar = new wm(a1.g.j(j11, "chat_id"));
        if (y22) {
            j10 = org.telegram.messenger.m5.o(t2Var.O.from_id);
        } else {
            j10 = t2Var.O.f27053id;
        }
        rg.c.a(wmVar, org.telegram.messenger.pr.a(j12, j10));
        presentFragmentAsPreviewWithMenu(wmVar, r32[0]);
    }

    public final void R0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m91.R0(android.view.View):void");
    }

    public final void S0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m91.S0(boolean):void");
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.f47606o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28110pf));
        this.h.updateColors();
        yg0 yg0Var = this.f47608p0;
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        yg0Var.setBackgroundColor(getThemedColor(i3));
        this.actionBar.setActionModeColor(getThemedColor(i3));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28160s8));
        }
        this.f47615s0.setBackgroundColor(getThemedColor(i3));
    }

    public final void U0(boolean z10) {
        boolean z11;
        if (this.R == null) {
            return;
        }
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.f47575a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        int i3 = 0;
        if (!org.telegram.messenger.t3.r0(getMessagesController().M0(Long.valueOf(j10))) && org.telegram.messenger.t3.w(15, M0) && !this.f47616t0 && !this.f47617u0 && !this.K0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.L = z11;
        org.telegram.ui.ActionBar.y0 y0Var = this.R;
        if (!z11) {
            i3 = 8;
        }
        y0Var.setVisibility(i3);
        K0(!this.L, z10);
    }

    public final void V0() {
        boolean z10;
        if (org.telegram.messenger.t3.y(15, g()) && !this.f47579b0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f47582c0 != z10) {
            this.f47582c0 = z10;
            d91 d91Var = this.f47612r;
            d91Var.k(0, d91Var.b());
        }
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void W0(float f10) {
        this.X = f10;
        X0();
        this.f47583c1 = true;
        float f11 = 1.0f - f10;
        this.f47589f.getTitleTextView().setAlpha(f11);
        this.f47589f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.m61 m61Var = this.f47580b1;
        if (m61Var != null) {
            m61Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
            this.f47580b1.setAlpha(f10);
        }
        this.f47615s0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        this.f47615s0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.f47586e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f11);
        if (this.f47577a1) {
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.X, 0.02f, 0.98f);
            this.O.setScaleX(y9);
            this.O.setScaleY(y9);
        }
    }

    public final void X0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f28216v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.f28275y8;
        kVar.D(i0.a.f(this.X, themedColor, getThemedColor(i3)), false);
        this.actionBar.D(i0.a.f(this.X, getThemedColor(i3), getThemedColor(i3)), true);
        this.actionBar.C(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.k6.f28179t8), getThemedColor(org.telegram.ui.ActionBar.k6.f28292z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.k6.f28160s8), getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)));
        }
    }

    public final void Y0() {
        ei.f5 f5Var = this.E0;
        if (f5Var != null && f5Var.f41128e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231244, 0);
            wpVar.c(org.telegram.messenger.g0.L(16.0f));
            spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
            if (org.telegram.messenger.t3.y(15, g())) {
                this.E0.f41128e.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748144, null)), spannableStringBuilder, "%s"));
                return;
            }
            String M0 = org.telegram.messenger.bd.M0(2131750482, null);
            TLRPC.TL_forumTopic f10 = getMessagesController().f23102q7.f(this.f47575a, 1L);
            if (f10 != null) {
                M0 = f10.title;
            }
            this.E0.f41128e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NoTopicsDescriptionUser", null, 2131748143, M0)));
        }
    }

    public final void Z0(boolean z10, boolean z11) {
        q81 q81Var;
        b91 b91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.O0) {
            z10 = true;
        }
        this.O0 = false;
        org.telegram.messenger.c00 c00Var = this.f47614s;
        long j10 = this.f47575a;
        ArrayList l10 = c00Var.l(j10);
        if (l10 != null) {
            ArrayList arrayList = this.f47578b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            b91 b91Var2 = null;
            if (org.telegram.messenger.l10.u(org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(-j10))) && this.f47618v0) {
                arrayList.add(new e91(3, null));
            }
            for (int i3 = 0; i3 < l10.size(); i3++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i3)).f27053id))) {
                    arrayList.add(new e91(0, (TLRPC.TL_forumTopic) l10.get(i3)));
                }
            }
            if (!arrayList.isEmpty() && !c00Var.e(j10) && this.W0) {
                arrayList.add(new e91(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.L0.b(size + 4);
                z10 = false;
            }
            this.f47623y = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e91 e91Var = (e91) arrayList.get(i10);
                if (e91Var != null && (tL_forumTopic = e91Var.f44941c) != null && tL_forumTopic.hidden) {
                    this.f47623y++;
                }
            }
            z81 z81Var = this.O;
            if (z81Var != null) {
                u4.m0 itemAnimator = z81Var.getItemAnimator();
                if (z10) {
                    b91Var = this.J0;
                } else {
                    b91Var = null;
                }
                if (itemAnimator != b91Var) {
                    z81 z81Var2 = this.O;
                    if (z10) {
                        b91Var2 = this.J0;
                    }
                    z81Var2.setItemAnimator(b91Var2);
                }
            }
            d91 d91Var = this.f47612r;
            if (d91Var != null) {
                d91Var.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (q81Var = this.G) != null) {
                q81Var.h1(0, 0);
                this.D0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override
    public final long a() {
        return -this.f47575a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
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
        int i3;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        SpannableStringBuilder spannableStringBuilder;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        uw uwVar = this.N0;
        if (uwVar != null && uwVar.X) {
            i3 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i3 = 0;
        }
        this.f47588e1 = i3;
        uw uwVar2 = this.N0;
        if (uwVar2 != null && uwVar2.X) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        } else {
            i10 = 0;
        }
        this.f47591f1 = i10;
        v81 v81Var = new v81(this, context);
        this.d = v81Var;
        this.fragmentView = v81Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, v81Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if ((!org.telegram.messenger.g0.Q1() || ((q4Var2 = this.parentLayout) != null && ((ActionBarLayout) q4Var2).f27279b)) && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.actionBar.setActionBarMenuOnItemClick(new y81(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final m91 f47563b;

            {
                this.f47563b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (r2) {
                    case 0:
                        m91 m91Var = this.f47563b;
                        if (!m91Var.f47616t0) {
                            m91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        m91 m91Var2 = this.f47563b;
                        m91Var2.getMessagesController().i2(-m91Var2.f47575a, null, m91Var2.g());
                        m91Var2.S0(false);
                        return;
                    case 2:
                        this.f47563b.finishPreviewFragment();
                        return;
                    case 3:
                        uw uwVar3 = this.f47563b.N0;
                        if (uwVar3 != null && (q0Var = uwVar3.f50254k0) != null) {
                            q0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        m91 m91Var3 = this.f47563b;
                        m91Var3.presentFragment(l81.f0(m91Var3.f47575a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        if (this.N0 != null) {
            org.telegram.ui.ActionBar.q0 a10 = q10.a(0, 2131232486);
            this.f47610q0 = a10;
            a10.setOnClickListener(new View.OnClickListener(this) {
                public final m91 f47563b;

                {
                    this.f47563b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (r2) {
                        case 0:
                            m91 m91Var = this.f47563b;
                            if (!m91Var.f47616t0) {
                                m91Var.L0(false);
                                return;
                            }
                            return;
                        case 1:
                            m91 m91Var2 = this.f47563b;
                            m91Var2.getMessagesController().i2(-m91Var2.f47575a, null, m91Var2.g());
                            m91Var2.S0(false);
                            return;
                        case 2:
                            this.f47563b.finishPreviewFragment();
                            return;
                        case 3:
                            uw uwVar3 = this.f47563b.N0;
                            if (uwVar3 != null && (q0Var = uwVar3.f50254k0) != null) {
                                q0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            m91 m91Var3 = this.f47563b;
                            m91Var3.presentFragment(l81.f0(m91Var3.f47575a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.q0 a11 = q10.a(0, 2131232486);
            this.f47610q0 = a11;
            a11.N();
            a11.J(new lg.w1(this, 22));
            this.f47610q0.setSearchPaddingStart(56);
            this.f47610q0.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
            EditTextBoldCursor searchField = this.f47610q0.getSearchField();
            org.telegram.ui.ActionBar.r6.V(searchField, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Gj, getResourceProvider());
            org.telegram.ui.ActionBar.r6.w(searchField, org.telegram.ui.ActionBar.k6.Ke, getResourceProvider());
        }
        org.telegram.ui.ActionBar.q0 c2 = q10.c(0, 2131231244, null);
        this.f47613r0 = c2;
        c2.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        this.f47613r0.e(1, 2131232113, org.telegram.messenger.bd.M0(2131744012, null));
        this.S = this.f47613r0.e(2, 2131232045, org.telegram.messenger.bd.M0(2131754401, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.f47613r0;
        this.U = q0Var.d(14, 0, new org.telegram.ui.Components.ch0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)), org.telegram.messenger.bd.M0(2131753585, null), true, false, q0Var.f28456n0);
        this.R = this.f47613r0.e(3, 2131232405, org.telegram.messenger.bd.M0(2131751703, null));
        this.V = this.f47613r0.e(15, 2131232333, org.telegram.messenger.bd.M0(2131746240, null));
        this.T = this.f47613r0.d(11, 2131232195, null, org.telegram.messenger.bd.M0(2131748998, null), true, false, null);
        org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, this, false, this.resourceProvider);
        this.f47589f = jnVar;
        jnVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.jn jnVar2 = this.f47589f;
        if ((!org.telegram.messenger.g0.Q1() || ((q4Var = this.parentLayout) != null && ((ActionBarLayout) q4Var).f27279b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        jnVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.jn jnVar3 = this.f47589f;
        long j10 = -this.f47575a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        jnVar3.f35122b = z12;
        jnVar3.setClipChildren(false);
        this.actionBar.addView(this.f47589f, 0, b8.mf.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f47617u0) {
            this.f47589f.getAvatarImageView().setOnClickListener(new a8(this, 4));
        }
        this.O = new z81(this, context);
        kh.k kVar2 = new kh.k(this.d);
        ViewGroup viewGroup = this.d;
        eh.c cVar = this.f47602l1;
        cVar.h = kVar2;
        cVar.f9986i = viewGroup;
        z81 z81Var = this.O;
        uw uwVar3 = this.N0;
        if (uwVar3 != null) {
            viewGroup = (ViewGroup) uwVar3.getFragmentView();
        }
        z81 z81Var2 = this.O;
        Objects.requireNonNull(z81Var2);
        this.m1 = new eh.k(z81Var, viewGroup, new i40(z81Var2, 2));
        this.O.D0(new n81(this, 5));
        SpannableString spannableString = new SpannableString("#");
        rg.b c10 = rg.c.c(getParentActivity(), 0.85f, -1, false);
        c10.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        spannableString.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
        cv cvVar = new cv(this, org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(2131754719, null), spannableString, "#"), org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(2131754721, null), spannableString, "#"));
        this.f47621x = cvVar;
        cvVar.b();
        if (this.F) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        this.E = i11;
        cv cvVar2 = this.f47621x;
        if (i11 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        cvVar2.X = z13;
        b91 b91Var = new b91(this);
        this.O.setHideIfEmpty(false);
        b91Var.f55567m = false;
        b91Var.C = false;
        z81 z81Var3 = this.O;
        this.J0 = b91Var;
        z81Var3.setItemAnimator(b91Var);
        this.O.setOnScrollListener(new r81(this, 1));
        z81 z81Var4 = this.O;
        z81Var4.X1 = true;
        z81Var4.Y1 = 0;
        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(z81Var4, true);
        this.L0 = wi0Var;
        this.O.setItemsEnterAnimator(wi0Var);
        this.O.setOnItemClickListener(new nx0(this, 9));
        this.O.setOnItemLongClickListener(new o81(this));
        this.O.setOnScrollListener(new r81(this, 2));
        z81 z81Var5 = this.O;
        q81 q81Var = new q81(this);
        this.G = q81Var;
        z81Var5.setLayoutManager(q81Var);
        new SparseArray();
        new HashMap();
        this.O.setAdapter(this.f47612r);
        this.O.setClipToPadding(false);
        this.O.j(new r81(this, 0));
        l91 l91Var = new l91(this);
        this.Q = l91Var;
        s81 s81Var = new s81(this, l91Var);
        this.P = s81Var;
        s81Var.h(this.O);
        this.d.addView(this.O, b8.mf.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(100.0f);
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(getParentActivity(), this.resourceProvider, false);
        this.h = l00Var;
        this.d.addView(l00Var, org.telegram.ui.Components.l00.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final m91 f47563b;

            {
                this.f47563b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (r2) {
                    case 0:
                        m91 m91Var = this.f47563b;
                        if (!m91Var.f47616t0) {
                            m91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        m91 m91Var2 = this.f47563b;
                        m91Var2.getMessagesController().i2(-m91Var2.f47575a, null, m91Var2.g());
                        m91Var2.S0(false);
                        return;
                    case 2:
                        this.f47563b.finishPreviewFragment();
                        return;
                    case 3:
                        uw uwVar32 = this.f47563b.N0;
                        if (uwVar32 != null && (q0Var2 = uwVar32.f50254k0) != null) {
                            q0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        m91 m91Var3 = this.f47563b;
                        m91Var3.presentFragment(l81.f0(m91Var3.f47575a, 0L));
                        return;
                }
            }
        });
        this.h.f35530c.setImageResource(2131231266);
        this.h.f35530c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f35530c.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.bd.M0(2131751703, null));
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        izVar.setViewType(24);
        izVar.setVisibility(8);
        izVar.f34869x = true;
        j81 j81Var = new j81(context, 1);
        TextView textView = new TextView(context);
        j81Var.d = textView;
        if (org.telegram.messenger.bd.f21784a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131230874, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131744269, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131744269, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131230872, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, getResourceProvider());
        boolean z14 = org.telegram.messenger.bd.f21784a0;
        if (z14) {
            f10 = 72.0f;
        } else {
            f10 = 32.0f;
        }
        if (z14) {
            f11 = 32.0f;
        } else {
            f11 = 72.0f;
        }
        j81Var.addView(textView, b8.mf.d(-2, -2.0f, 81, f10, 0.0f, f11, 32.0f));
        this.f47603n = j81Var;
        textView.setAlpha(0.0f);
        ei.f5 f5Var = new ei.f5(this, context, izVar);
        this.E0 = f5Var;
        try {
            f5Var.f41126b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(org.telegram.messenger.bd.M0(2131748146, null));
        Y0();
        this.f47603n.addView(izVar);
        this.f47603n.addView(this.E0);
        this.d.addView(this.f47603n);
        this.O.setEmptyView(this.f47603n);
        this.f47608p0 = new yg0(context, 14);
        org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(context);
        this.M = n41Var;
        this.f47608p0.addView(n41Var);
        this.d.addView(this.f47608p0, b8.mf.e(-1, 51, 80));
        this.M.setOnClickListener(new t81(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f47606o0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(22.0f));
        this.f47606o0.setVisibility(4);
        this.f47608p0.addView(this.f47606o0, b8.mf.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131231983);
        this.X0.setContentDescription(org.telegram.messenger.bd.M0(2131752041, null));
        ImageView imageView2 = this.X0;
        int i12 = org.telegram.ui.ActionBar.k6.Re;
        imageView2.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(getThemedColor(i12))));
        org.telegram.ui.ActionBar.r6.t(this.X0, i12, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.f47608p0.addView(this.X0, b8.mf.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) {
            public final m91 f47563b;

            {
                this.f47563b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (r2) {
                    case 0:
                        m91 m91Var = this.f47563b;
                        if (!m91Var.f47616t0) {
                            m91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        m91 m91Var2 = this.f47563b;
                        m91Var2.getMessagesController().i2(-m91Var2.f47575a, null, m91Var2.g());
                        m91Var2.S0(false);
                        return;
                    case 2:
                        this.f47563b.finishPreviewFragment();
                        return;
                    case 3:
                        uw uwVar32 = this.f47563b.N0;
                        if (uwVar32 != null && (q0Var2 = uwVar32.f50254k0) != null) {
                            q0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        m91 m91Var3 = this.f47563b;
                        m91Var3.presentFragment(l81.f0(m91Var3.f47575a, 0L));
                        return;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        l0 l0Var = new l0(27, context, this);
        this.f47586e = l0Var;
        if (this.N0 == null) {
            this.d.addView(l0Var, b8.mf.e(-1, -1, 119));
        }
        i91 i91Var = new i91(this, context);
        this.f47615s0 = i91Var;
        i91Var.setVisibility(8);
        this.f47586e.addView(this.f47615s0, b8.mf.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        i91 i91Var2 = this.f47615s0;
        int i13 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.i(i13, i91Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.f47575a, true, null, true, false, 0);
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(context);
        this.V0 = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        gh.g c11 = cVar.c(this.V0, b8.cd.o(this.resourceProvider), false);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c11);
        this.V0.setOnAnimatedHeightChangedListener(new n81(this, 0));
        this.d.addView(this.V0, b8.mf.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g7 = g();
        if (g7 != null) {
            zh.d dVar = new zh.d(g7, this);
            this.S0 = dVar;
            this.V0.addView(dVar.b(), b8.mf.o(-1, 40));
            this.V0.h(3, this.S0.b());
            this.V0.g(this.S0.b());
            zh.d dVar2 = this.S0;
            dVar2.f60559m = new o81(this);
            TLRPC.ChatFull chatFull = this.K;
            dVar2.f60556j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.h(4, this.G0);
            this.V0.g(this.G0);
            this.V0.i(this.G0, true, false);
            w8 w8Var = new w8(this, context, this);
            this.H0 = w8Var;
            this.G0.addView(w8Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c12 = b8.mf.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c12.topMargin = org.telegram.messenger.g0.f22602m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c12);
        }
        C0();
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(12, context, this);
        this.Q0 = r0Var;
        r0Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i13), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) {
            public final m91 f47563b;

            {
                this.f47563b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (r2) {
                    case 0:
                        m91 m91Var = this.f47563b;
                        if (!m91Var.f47616t0) {
                            m91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        m91 m91Var2 = this.f47563b;
                        m91Var2.getMessagesController().i2(-m91Var2.f47575a, null, m91Var2.g());
                        m91Var2.S0(false);
                        return;
                    case 2:
                        this.f47563b.finishPreviewFragment();
                        return;
                    case 3:
                        uw uwVar32 = this.f47563b.N0;
                        if (uwVar32 != null && (q0Var2 = uwVar32.f50254k0) != null) {
                            q0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        m91 m91Var3 = this.f47563b;
                        m91Var3.presentFragment(l81.f0(m91Var3.f47575a, 0L));
                        return;
                }
            }
        });
        this.Q0.setFitsSystemWindows(true);
        this.W = true;
        if (this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) it.next();
                if (d2Var instanceof uw) {
                    uw uwVar4 = (uw) d2Var;
                    if (uwVar4.t4()) {
                        org.telegram.messenger.pr prVar2 = uwVar4.f50283q2;
                        if (prVar2.f24797a == j10) {
                            this.R0 = prVar2.f24798b;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Z0(false, false);
        }
        S0(false);
        T0();
        if (org.telegram.messenger.t3.R(g())) {
            getMessagesController().G0().a(j10, new s3(this, 25));
        }
        View view = this.fragmentView;
        o81 o81Var = new o81(this);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(view, o81Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = org.telegram.messenger.hs.T;
        long j10 = this.f47575a;
        if (i3 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f27002id == j10) {
                S0(false);
                zh.d dVar = this.S0;
                if (dVar != null) {
                    dVar.f60556j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                D0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i3 == org.telegram.messenger.hs.f23324v5) {
            S0(false);
        } else if (i3 == org.telegram.messenger.hs.f23283p3) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i3 == org.telegram.messenger.hs.f23291q5) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.hp.C8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().f23102q7.y(j10, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.G.n0(0);
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23298s) {
            Z0(false, false);
        } else if (i3 == org.telegram.messenger.hs.f23328w2) {
            Long l10 = (Long) objArr[0];
            if (j10 == l10.longValue()) {
                this.I0 = getMessagesController().g1(l10.longValue(), false, null);
                w8 w8Var = this.H0;
                if (w8Var != null) {
                    w8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i3 == org.telegram.messenger.hs.f23225f0) {
            Z0(false, false);
            S0(true);
        } else if (i3 != org.telegram.messenger.hs.r5 && i3 == org.telegram.messenger.hs.f23305t) {
            removeSelfFromStack(true);
        }
        if (i3 == org.telegram.messenger.hs.f23237h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j10) && !booleanValue) {
                if (this.R0 != longValue2) {
                    this.R0 = longValue2;
                    Z0(false, false);
                }
            } else if (this.R0 != 0) {
                this.R0 = 0L;
                Z0(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat g() {
        return getMessagesController().M0(Long.valueOf(this.f47575a));
    }

    @Override
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var = this.I0;
        if (r3Var != null && (r3Var.f25049b instanceof TLRPC.TL_groupCall)) {
            return r3Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i91 i91Var = this.f47615s0;
        if (i91Var != null && i91Var.f46201a0 != null) {
            int i3 = org.telegram.ui.Cells.x3.h;
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i3;
        if (this.f47616t0) {
            i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28160s8;
        }
        int themedColor = getThemedColor(i3);
        if (this.actionBar.v()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f28236w8);
        }
        if (i0.a.h(themedColor) > 0.699999988079071d) {
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
    public final si.f k() {
        return this.f47597i1;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f47579b0.isEmpty()) {
            if (z10) {
                G0();
                return false;
            }
        } else if (this.f47616t0) {
            if (z10) {
                this.actionBar.y(this.f47610q0.T(false));
            }
        } else {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.k();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.f47575a;
        messagesController.V2(0, j10, true);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23324v5);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23283p3);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23291q5);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23298s);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23328w2);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23225f0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.r5);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23305t);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23237h0);
        Z0(false, false);
        g11.t(this.currentAccount);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().V4(M0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f47574r1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j10));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().j1(-j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.P0.e();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23324v5);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23283p3);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23291q5);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23298s);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23328w2);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23225f0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.r5);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23305t);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23237h0);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f47575a));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().V4(M0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        uw uwVar = this.N0;
        if (uwVar != null && uwVar.G3 != null) {
            uwVar.getActionBar().setSearchAvatarImageView(null);
            this.N0.G3.N = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().f23102q7.f21926f;
        long j10 = this.f47575a;
        int i3 = 0;
        int i10 = longSparseIntArray.get(j10, 0) - 1;
        if (i10 >= 0) {
            i3 = i10;
        }
        longSparseIntArray.put(j10, i3);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.c00 c00Var = getMessagesController().f23102q7;
        LongSparseIntArray longSparseIntArray = c00Var.f21926f;
        long j10 = this.f47575a;
        longSparseIntArray.put(j10, longSparseIntArray.get(j10, 0) + 1);
        c00Var.y(j10, true);
        this.H = false;
        org.telegram.messenger.g0.b4(this.O);
        this.H = true;
        setBulletinDelegate(new x8(this, 9));
        if (this.inPreviewMode && !getMessagesController().t2(-j10)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.az.o() != 0 && this.U0) {
            P0(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        si.c cVar = this.k1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
        }
        if (this.X0 != null && (b10 = org.telegram.ui.ActionBar.y5.b(getThemedColor(org.telegram.ui.ActionBar.k6.Re))) != this.f47611q1) {
            this.f47611q1 = b10;
            org.telegram.ui.ActionBar.k6.H1(this.X0.getBackground(), b10, true);
        }
        for (int i3 = 0; i3 < 2; i3++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E(getThemedColor(org.telegram.ui.ActionBar.k6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.k6.I5), true);
        }
        org.telegram.ui.Components.voip.r0 r0Var = this.Q0;
        if (r0Var != null && (r0Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
            }
            cv cvVar = this.f47621x;
            if (cvVar != null) {
                cvVar.i();
            }
            if (this.actionBar != null && this.f47583c1) {
                X0();
            }
            NumberTextView numberTextView = this.f47584d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28275y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f47610q0;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f47610q0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ke));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        pv pvVar;
        org.telegram.ui.Components.voip.r0 r0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (r0Var = this.Q0) != null) {
            if (r0Var.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z10) {
            D0(false);
        }
        this.P0.e();
        if (!z10) {
            if (this.f47617u0 && this.I) {
                removeSelfFromStack();
                uw uwVar = this.M0;
                if (uwVar != null) {
                    uwVar.removeSelfFromStack();
                }
            } else if (this.J) {
                removeSelfFromStack();
                uw uwVar2 = this.N0;
                if (uwVar2 != null && (pvVar = uwVar2.G3) != null && pvVar.c()) {
                    this.N0.G3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        org.telegram.ui.Components.voip.r0 r0Var = this.Q0;
        if (r0Var != null && r0Var.getVisibility() == 0) {
            if (z10) {
                this.Q0.setAlpha(1.0f - f10);
            } else {
                this.Q0.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.P0.d();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.U0 = true;
            O0(true);
            return;
        }
        this.U0 = false;
        O0(false);
        P0(1.0f);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.jn r() {
        return this.f47589f;
    }

    @Override
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.jn jnVar = this.f47589f;
        if (jnVar != null) {
            jnVar.setAlpha(f10);
            this.f47613r0.setAlpha(f10);
            org.telegram.ui.ActionBar.q0 q0Var = this.f47610q0;
            if (q0Var != null) {
                q0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.jn jnVar = this.f47589f;
        if (jnVar != null) {
            jnVar.setAlpha(f10);
            this.f47589f.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(40.0f));
        }
    }

    @Override
    public final void v() {
        this.O.y0(0);
    }

    @Override
    public final void s() {
    }

    @Override
    public final void l(int i3, int i10, boolean z10, int i11, boolean z11, int i12) {
    }
}
