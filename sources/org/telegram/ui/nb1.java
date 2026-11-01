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
public class nb1 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, org.telegram.ui.Components.gg, nf0 {
    public static final HashSet f39796q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public int D;
    public org.telegram.ui.Components.kj D0;
    public boolean E;
    public db1 E0;
    public qa1 F;
    public FrameLayout F0;
    public boolean G;
    public y8 G0;
    public boolean H;
    public org.telegram.messenger.u3 H0;
    public boolean I;
    public cb1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.xj0 K0;
    public org.telegram.ui.Components.x51 L;
    public zx L0;
    public int M;
    public zx M0;
    public ab1 N;
    public boolean N0;
    public sa1 O;
    public final e2.f O0;
    public mb1 P;
    public bo0 P0;
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
    public final long f39797a;
    public final HashSet f39798a0;
    public org.telegram.ui.Components.w71 f39799a1;
    public final ArrayList f39800b;
    public boolean f39801b0;
    public boolean f39802b1;
    public int f39803c;
    public NumberTextView f39804c0;
    public View f39805c1;
    public va1 d;
    public org.telegram.ui.ActionBar.t0 f39806d0;
    public int f39807d1;
    public l0 e;
    public org.telegram.ui.ActionBar.t0 f39808e0;
    public int f39809e1;
    public org.telegram.ui.Components.sn f39810f;
    public org.telegram.ui.ActionBar.t0 f39811f0;
    public int f39812f1;
    public org.telegram.ui.ActionBar.t0 f39813g0;
    public final tg.f f39814g1;
    public org.telegram.ui.Components.f10 h;
    public org.telegram.ui.ActionBar.t0 f39815h0;
    public final hi.f f39816h1;
    public org.telegram.ui.ActionBar.t0 f39817i0;
    public final hi.f f39818i1;
    public org.telegram.ui.ActionBar.b1 f39819j0;
    public final hi.c f39820j1;
    public org.telegram.ui.ActionBar.b1 f39821k0;
    public final tg.b f39822k1;
    public org.telegram.ui.ActionBar.b1 f39823l0;
    public tg.j l1;
    public org.telegram.ui.ActionBar.t0 m0;
    public final ArrayList f39824m1;
    public ha1 f39825n;
    public RadialProgressView f39826n0;
    public final RectF f39827n1;
    public bg0 f39828o0;
    public final RectF f39829o1;
    public org.telegram.ui.ActionBar.t0 f39830p0;
    public int f39831p1;
    public org.telegram.ui.ActionBar.t0 f39832q0;
    public final eb1 f39833r;
    public jb1 f39834r0;
    public final org.telegram.messenger.y00 f39835s;
    public boolean f39836s0;
    public final boolean f39837t0;
    public final boolean f39838u0;
    public final boolean f39839v0;
    public ob1 f39840w;
    public final boolean f39841w0;
    public jw f39842x;
    public final boolean f39843x0;
    public int f39844y;
    public String f39845y0;
    public boolean f39846z0;

    public nb1(Bundle bundle) {
        super(bundle);
        this.f39800b = new ArrayList();
        new ArrayList();
        this.f39833r = new eb1(this);
        this.f39844y = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f39798a0 = new HashSet();
        this.B0 = false;
        this.O0 = new e2.f(new int[]{org.telegram.messenger.at.f14771q5});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f39824m1 = arrayList;
        RectF rectF = new RectF();
        this.f39827n1 = rectF;
        RectF rectF2 = new RectF();
        this.f39829o1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f39797a = j10;
        this.f39837t0 = this.arguments.getBoolean("for_select", false);
        this.f39838u0 = this.arguments.getBoolean("forward_to", false);
        this.f39843x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f39839v0 = this.arguments.getBoolean("quote", false);
        this.f39841w0 = this.arguments.getBoolean("reply_to", false);
        this.f39845y0 = this.arguments.getString("voicechat", null);
        this.f39846z0 = this.arguments.getBoolean("videochat", false);
        this.f39835s = getMessagesController().f19234r7;
        this.V0 = !org.telegram.messenger.m5.w("topics_end_reached_", j10, getUserConfig().k(), false);
        hi.c cVar = new hi.c();
        this.f39820j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f39814g1 = new tg.f(false);
            this.f39816h1 = new hi.f(null);
            hi.f fVar = new hi.f(null);
            this.f39818i1 = fVar;
            tg.b bVar = new tg.b(fVar, fVar, fVar);
            this.f39822k1 = bVar;
            bVar.f48715k = true;
            return;
        }
        this.f39814g1 = null;
        this.f39816h1 = null;
        this.f39818i1 = null;
        this.f39822k1 = new tg.b(cVar, cVar, cVar);
    }

    public static org.telegram.ui.ActionBar.k2 I0(org.telegram.messenger.wp wpVar, org.telegram.messenger.is isVar, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog R0 = wpVar.R0(-j10);
            if (R0 != null && R0.view_forum_as_messages) {
                return new un(bundle);
            }
            TLRPC.ChatFull M0 = wpVar.M0(j10);
            if (M0 == null) {
                M0 = isVar.F0(j10, true, new CountDownLatch(1), false, false, 0);
            }
            if (M0 != null && M0.view_forum_as_messages) {
                return new un(bundle);
            }
        }
        return new nb1(bundle);
    }

    public static org.telegram.ui.ActionBar.k2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.wp.r1(launchActivity.O), org.telegram.messenger.is.a0(launchActivity.O), bundle);
    }

    public static void M0(org.telegram.ui.un r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb1.M0(org.telegram.ui.un):void");
    }

    public static boolean Z(nb1 nb1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(nb1Var.currentAccount).e7.edit();
        edit.putLong("dialog_join_requested_time_" + (-nb1Var.f39797a), System.currentTimeMillis()).commit();
        Activity parentActivity = nb1Var.getParentActivity();
        boolean V = org.telegram.messenger.w3.V(nb1Var.g());
        int i10 = org.telegram.ui.Components.u70.f30883q1;
        org.telegram.ui.Components.u70.J0(parentActivity, nb1Var, org.telegram.ui.Components.cc.a0(nb1Var), V);
        nb1Var.S0(true);
        return false;
    }

    public static void a0(nb1 nb1Var, View view) {
        long j10;
        long j11 = nb1Var.f39797a;
        if (nb1Var.getParentLayout() != null && !((ActionBarLayout) nb1Var.getParentLayout()).x() && (view instanceof kb1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((kb1) view).N;
            long j12 = -j11;
            boolean x22 = nb1Var.getMessagesController().x2(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (x22) {
                j10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f19846id;
            }
            long j13 = j10;
            if (nb1Var.f39837t0) {
                ob1 ob1Var = nb1Var.f39840w;
                if (ob1Var != null) {
                    qb1 qb1Var = ob1Var.f40127a;
                    Bundle bundle = new Bundle();
                    tb1 tb1Var = qb1Var.f40741a;
                    bundle.putLong("dialog_id", tb1Var.f41613c);
                    bundle.putLong("topic_id", tL_forumTopic.f19846id);
                    bundle.putBoolean("exception", true);
                    ty0 ty0Var = new ty0(bundle, null);
                    ty0Var.f41749s = new cp0(20, qb1Var, tL_forumTopic);
                    tb1Var.presentFragment(ty0Var);
                }
                zx zxVar = nb1Var.L0;
                if (zxVar != null) {
                    zxVar.a4(j12, j13, true, nb1Var);
                }
            } else if (nb1Var.f39798a0.size() > 0) {
                nb1Var.R0(view);
            } else {
                if (nb1Var.inPreviewMode && org.telegram.messenger.i0.Q1()) {
                    for (org.telegram.ui.ActionBar.k2 k2Var : nb1Var.getParentLayout().getFragmentStack()) {
                        if (k2Var instanceof zx) {
                            zx zxVar2 = (zx) k2Var;
                            if (zxVar2.t4()) {
                                org.telegram.messenger.hs hsVar = zxVar2.f44193p2;
                                if (hsVar.f16109a == j12 && hsVar.f16110b == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    nb1Var.Q0 = j13;
                    nb1Var.Z0(false, false);
                }
                gg.e.m(nb1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean b0(nb1 nb1Var, View view, float f7) {
        if (nb1Var.f39837t0 || nb1Var.getParentLayout() == null || ((ActionBarLayout) nb1Var.getParentLayout()).x()) {
            return false;
        }
        if (!nb1Var.actionBar.u() && !org.telegram.messenger.i0.Q1() && (view instanceof kb1)) {
            kb1 kb1Var = (kb1) view;
            if (kb1Var.Z(f7)) {
                nb1Var.Q0(kb1Var);
                nb1Var.N.I0(true);
                nb1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        nb1Var.R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void f0(nb1 nb1Var, boolean z10) {
        float f7;
        boolean z11;
        ww wwVar;
        nb1Var.f39836s0 = z10;
        ValueAnimator valueAnimator = nb1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            nb1Var.Y0.cancel();
        }
        if (nb1Var.f39799a1 == null) {
            org.telegram.ui.Components.w71 n10 = nb1Var.f39834r0.n(8, false);
            nb1Var.f39799a1 = n10;
            if (nb1Var.M0 != null) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, n10, nb1Var.getResourceProvider());
            }
            nb1Var.e.addView(nb1Var.f39799a1, w7.b6.c(44.0f, -1));
        }
        float f10 = nb1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        nb1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        org.telegram.messenger.i0.Y3(nb1Var.f39834r0, false, 1.0f, true, true);
        zx zxVar = nb1Var.M0;
        if (zxVar != null && (wwVar = zxVar.F3) != null) {
            wwVar.M = !z10;
        }
        if (!z10 && nb1Var.f39834r0.getVisibility() == 0 && nb1Var.f39834r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        nb1Var.Z0 = z11;
        nb1Var.Y0.addUpdateListener(new u01(nb1Var, 13));
        nb1Var.f39834r0.setVisibility(0);
        if (!z10) {
            nb1Var.f39832q0.setVisibility(0);
        } else {
            org.telegram.messenger.i0.Z2(nb1Var.getParentActivity(), nb1Var.classGuid);
            nb1Var.U0(false);
        }
        nb1Var.Y0.addListener(new ya1(nb1Var, z10, 0));
        nb1Var.Y0.setDuration(200L);
        nb1Var.Y0.setInterpolator(org.telegram.ui.Components.gr.f26523f);
        nb1Var.Y0.start();
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14777r4, Boolean.TRUE);
    }

    public static int r0(nb1 nb1Var) {
        return nb1Var.currentAccount;
    }

    public final void B0() {
        tg.f fVar;
        View view;
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f39814g1) != null) {
            int L = org.telegram.messenger.i0.L(48.0f);
            int L2 = org.telegram.messenger.i0.L(48.0f) + ((int) this.U0.c(org.telegram.messenger.i0.L(14.0f)));
            zx zxVar = this.M0;
            if (zxVar != null) {
                view = zxVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (zxVar != null) {
                lVar = zxVar.getActionBar();
            } else {
                lVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f39812f1) - org.telegram.messenger.i0.L(8.0f);
            this.f39827n1.set(0.0f, -L, view.getMeasuredWidth(), lVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.f39829o1;
            rectF.set(0.0f, measuredHeight - org.telegram.messenger.i0.L(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (org.telegram.messenger.tc.e(262144)) {
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
            fVar.g(i10, this.f39824m1);
            fVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final hi.f C() {
        return this.f39818i1;
    }

    public final void C0() {
        qa1 qa1Var;
        org.telegram.messenger.y00 y00Var = this.f39835s;
        long j10 = this.f39797a;
        if (!y00Var.e(j10) && (qa1Var = this.F) != null) {
            int N0 = qa1Var.N0();
            if (this.f39800b.isEmpty() || N0 >= this.f39833r.b() - 5) {
                y00Var.o(j10);
            }
            E0();
        }
    }

    public final void D0(boolean z10) {
        String str;
        org.telegram.messenger.wp messagesController = getMessagesController();
        long j10 = this.f39797a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        TLRPC.ChatFull M0 = getMessagesController().M0(j10);
        org.telegram.messenger.u3 u3Var = this.H0;
        if (u3Var != null && ((str = this.f39845y0) != null || this.f39846z0)) {
            org.telegram.ui.Components.voip.n1.l(L0, str, false, Boolean.valueOf(!u3Var.f18361b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f39845y0 = null;
            this.f39846z0 = false;
        } else if (this.f39845y0 != null && z10 && M0 != null && M0.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.m5.n(null, 2131748923, org.telegram.ui.Components.cc.a0(this), 2131624078, 36);
            this.f39845y0 = null;
        }
    }

    public final void E0() {
        boolean z10;
        org.telegram.messenger.y00 y00Var = this.f39835s;
        a0.h hVar = y00Var.f19511a;
        LongSparseIntArray longSparseIntArray = y00Var.f19513c;
        long j10 = this.f39797a;
        if (longSparseIntArray.get(j10, 0) == 1 && (hVar.f(j10) == null || ((ArrayList) hVar.f(j10)).isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J0 = z10;
        if (this.D0 != null) {
            ArrayList arrayList = this.f39800b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((fb1) arrayList.get(0)).f37097c != null && ((fb1) arrayList.get(0)).f37097c.f19846id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        ab1 ab1Var = this.N;
        if (ab1Var != null) {
            ab1Var.K0(ab1Var.w1());
        }
        U0(true);
    }

    @Override
    public final org.telegram.ui.Components.vu0 F() {
        return this.d;
    }

    public final void F0() {
        int i10;
        float f7;
        float f10;
        zx zxVar = this.M0;
        float f11 = 0.0f;
        if (zxVar != null) {
            int L = org.telegram.messenger.i0.L(14.0f);
            org.telegram.ui.Components.zr zrVar = zxVar.J1;
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
                    f10 = zrVar3.getMetadata().f7041c.f7049a;
                } else {
                    f10 = 0.0f;
                }
                zrVar2.setTranslationY(f12 - (f10 * L2));
                org.telegram.ui.Components.zr zrVar4 = this.U0;
                int L3 = org.telegram.messenger.i0.L(14.0f);
                int L4 = org.telegram.messenger.i0.L(7.0f);
                org.telegram.ui.Components.zr zrVar5 = this.M0.J1;
                if (zrVar5 != null) {
                    f11 = zrVar5.getMetadata().f7041c.f7049a;
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
        int i11 = this.f39812f1 + this.f39807d1;
        if (this.V) {
            i10 = org.telegram.messenger.i0.L(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void G0() {
        this.f39798a0.clear();
        this.actionBar.t();
        org.telegram.messenger.i0.a4(this.N);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String J0 = org.telegram.messenger.dd.J0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = J0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131751499, this.f39835s.f(this.f39797a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            x1Var.T = org.telegram.messenger.dd.L0(2131751498, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new a1.d(this, hashSet, arrayList, runnable, 18));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new pa1(0));
        x1Var.show();
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, getResourceProvider());
        }
    }

    @Override
    public final boolean K() {
        return false;
    }

    public final void K0(boolean z10, boolean z11) {
        boolean z12 = true;
        this.h.e(!z10, (this.fragmentBeginToShow && z11) ? false : false);
    }

    public final void L0(boolean z10) {
        int i10;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f39797a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f39810f.getSharedMediaPreloader());
        profileActivity.a5(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f39810f.getAvatarImageView().getImageReceiver().J() && z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        profileActivity.g5(i10);
        presentFragment(profileActivity);
    }

    @Override
    public final long M() {
        return 0L;
    }

    public final void N0(int i10) {
        int i11;
        int i12;
        if (this.M != i10) {
            this.M = i10;
            org.telegram.ui.Components.x51 x51Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.t6.f21161pf;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21171q7;
            }
            x51Var.setTextColorKey(i11);
            ImageView imageView = this.W0;
            if (i10 == 1) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            S0(false);
        }
    }

    public final void O0(boolean z10) {
        if (org.telegram.messenger.uz.o() == 0) {
            return;
        }
        va1 va1Var = this.d;
        if (va1Var != null) {
            if (z10) {
                va1Var.setLayerType(2, null);
                va1Var.setClipChildren(false);
                va1Var.setClipToPadding(false);
            } else {
                va1Var.setLayerType(0, null);
                va1Var.setClipChildren(true);
                va1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f7) {
        if (org.telegram.messenger.uz.o() != 0) {
            this.S0 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            ab1 ab1Var = this.N;
            if (ab1Var != null) {
                float z10 = sc.e.z(1.0f, this.S0, 0.05f, 1.0f);
                ab1Var.setPivotX(0.0f);
                ab1Var.setPivotY(0.0f);
                ab1Var.setScaleX(z10);
                ab1Var.setScaleY(z10);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(z10);
                this.actionBar.setScaleY(z10);
            }
        }
    }

    public final void Q0(org.telegram.ui.Cells.v2 v2Var) {
        boolean z10;
        long j10;
        try {
            v2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232561, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = v2Var.N;
        org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new ua1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(goVar.f26504f);
        goVar.f26512o = 1;
        long j11 = this.f39797a;
        long j12 = -j11;
        goVar.e(j12, tL_forumTopic.f19846id, null);
        if (org.telegram.messenger.w3.y(15, g())) {
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                b1Var.j(org.telegram.messenger.dd.L0(2131751453, null), 2131232412, null);
            } else {
                b1Var.j(org.telegram.messenger.dd.L0(2131751454, null), 2131232292, null);
            }
            b1Var.setMinimumWidth(160);
            z10 = false;
            b1Var.setOnClickListener(new View.OnClickListener(this) {
                public final nb1 f39792b;

                {
                    this.f39792b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            nb1 nb1Var = this.f39792b;
                            nb1Var.C0 = true;
                            nb1Var.N0 = true;
                            org.telegram.messenger.y00 y00Var = nb1Var.f39835s;
                            long j13 = nb1Var.f39797a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            y00Var.t(j13, tL_forumTopic2.f19846id, !tL_forumTopic2.pinned, nb1Var);
                            nb1Var.finishPreviewFragment();
                            return;
                        case 1:
                            nb1 nb1Var2 = this.f39792b;
                            nb1Var2.N0 = true;
                            org.telegram.messenger.y00 y00Var2 = nb1Var2.f39835s;
                            long j14 = nb1Var2.f39797a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            y00Var2.z(tL_forumTopic3.f19846id, j14, true ^ tL_forumTopic3.closed);
                            nb1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19846id));
                            nb1 nb1Var3 = this.f39792b;
                            nb1Var3.H0(hashSet, new la1(nb1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(b1Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(getParentActivity(), z10, z10);
        if (getMessagesController().q2(j12, tL_forumTopic.f19846id, null)) {
            b1Var2.j(org.telegram.messenger.dd.L0(2131743874, null), 2131232255, null);
        } else {
            b1Var2.j(org.telegram.messenger.dd.L0(2131748329, null), 2131232411, null);
        }
        b1Var2.setMinimumWidth(160);
        b1Var2.setOnClickListener(new ya(this, tL_forumTopic, (Serializable) r32, b10, 5));
        boolean z11 = false;
        r32[0].addView(b1Var2);
        if (org.telegram.messenger.w3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                b1Var3.j(org.telegram.messenger.dd.L0(2131746101, null), 2131232405, null);
            } else {
                b1Var3.j(org.telegram.messenger.dd.L0(2131752039, null), 2131232403, null);
            }
            b1Var3.setMinimumWidth(160);
            b1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final nb1 f39792b;

                {
                    this.f39792b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            nb1 nb1Var = this.f39792b;
                            nb1Var.C0 = true;
                            nb1Var.N0 = true;
                            org.telegram.messenger.y00 y00Var = nb1Var.f39835s;
                            long j13 = nb1Var.f39797a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            y00Var.t(j13, tL_forumTopic2.f19846id, !tL_forumTopic2.pinned, nb1Var);
                            nb1Var.finishPreviewFragment();
                            return;
                        case 1:
                            nb1 nb1Var2 = this.f39792b;
                            nb1Var2.N0 = true;
                            org.telegram.messenger.y00 y00Var2 = nb1Var2.f39835s;
                            long j14 = nb1Var2.f39797a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            y00Var2.z(tL_forumTopic3.f19846id, j14, true ^ tL_forumTopic3.closed);
                            nb1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19846id));
                            nb1 nb1Var3 = this.f39792b;
                            nb1Var3.H0(hashSet, new la1(nb1Var3, 3));
                            return;
                    }
                }
            });
            z11 = false;
            r32[0].addView(b1Var3);
        }
        if (org.telegram.messenger.w3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.b1 b1Var4 = new org.telegram.ui.ActionBar.b1(getParentActivity(), z11, true);
            b1Var4.j(org.telegram.messenger.dd.J0(1, "DeleteTopics"), 2131232107, null);
            b1Var4.c(org.telegram.ui.ActionBar.t6.f21171q7, org.telegram.ui.ActionBar.t6.f21154p7);
            b1Var4.setMinimumWidth(160);
            b1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final nb1 f39792b;

                {
                    this.f39792b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            nb1 nb1Var = this.f39792b;
                            nb1Var.C0 = true;
                            nb1Var.N0 = true;
                            org.telegram.messenger.y00 y00Var = nb1Var.f39835s;
                            long j13 = nb1Var.f39797a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            y00Var.t(j13, tL_forumTopic2.f19846id, !tL_forumTopic2.pinned, nb1Var);
                            nb1Var.finishPreviewFragment();
                            return;
                        case 1:
                            nb1 nb1Var2 = this.f39792b;
                            nb1Var2.N0 = true;
                            org.telegram.messenger.y00 y00Var2 = nb1Var2.f39835s;
                            long j14 = nb1Var2.f39797a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            y00Var2.z(tL_forumTopic3.f19846id, j14, true ^ tL_forumTopic3.closed);
                            nb1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19846id));
                            nb1 nb1Var3 = this.f39792b;
                            nb1Var3.H0(hashSet, new la1(nb1Var3, 3));
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
            j10 = v2Var.N.f19846id;
        }
        gg.e.a(unVar, org.telegram.messenger.hs.a(j12, j10));
        presentFragmentAsPreviewWithMenu(unVar, r32[0]);
    }

    public final void R0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb1.R0(android.view.View):void");
    }

    public final void S0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nb1.S0(boolean):void");
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.f39826n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21161pf));
        this.h.updateColors();
        bg0 bg0Var = this.f39828o0;
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        bg0Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21207s8));
        }
        this.f39834r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void U0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        org.telegram.messenger.wp messagesController = getMessagesController();
        long j10 = this.f39797a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        int i10 = 0;
        if (!org.telegram.messenger.w3.r0(getMessagesController().L0(Long.valueOf(j10))) && org.telegram.messenger.w3.w(15, L0) && !this.f39836s0 && !this.f39837t0 && !this.J0) {
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
        K0(!this.K, z10);
    }

    public final void V0() {
        boolean z10;
        if (org.telegram.messenger.w3.y(15, g()) && !this.f39798a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f39801b0 != z10) {
            this.f39801b0 = z10;
            eb1 eb1Var = this.f39833r;
            eb1Var.k(0, eb1Var.b());
        }
    }

    public final void W0(float f7) {
        this.W = f7;
        X0();
        this.f39802b1 = true;
        float f10 = 1.0f - f7;
        this.f39810f.getTitleTextView().setAlpha(f10);
        this.f39810f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.w71 w71Var = this.f39799a1;
        if (w71Var != null) {
            w71Var.setTranslationY((-org.telegram.messenger.i0.L(16.0f)) * f10);
            this.f39799a1.setAlpha(f7);
        }
        this.f39834r0.setTranslationY((-org.telegram.messenger.i0.L(16.0f)) * f10);
        this.f39834r0.setAlpha(f7);
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
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void X0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f21262v8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.f21314y8;
        lVar.D(i0.b.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.D(i0.b.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.C(i0.b.f(this.W, getThemedColor(org.telegram.ui.ActionBar.t6.f21226t8), getThemedColor(org.telegram.ui.ActionBar.t6.f21333z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.b.f(this.W, getThemedColor(org.telegram.ui.ActionBar.t6.f21207s8), getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6)));
        }
    }

    public final void Y0() {
        org.telegram.ui.Components.kj kjVar = this.D0;
        if (kjVar != null && kjVar.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231245, 0);
            dqVar.c(org.telegram.messenger.i0.L(16.0f));
            spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
            if (org.telegram.messenger.w3.y(15, g())) {
                this.D0.e.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131748152, null)), spannableStringBuilder, "%s"));
                return;
            }
            String L0 = org.telegram.messenger.dd.L0(2131750483, null);
            TLRPC.TL_forumTopic f7 = getMessagesController().f19234r7.f(this.f39797a, 1L);
            if (f7 != null) {
                L0 = f7.title;
            }
            this.D0.e.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("NoTopicsDescriptionUser", null, 2131748151, L0)));
        }
    }

    public final void Z0(boolean z10, boolean z11) {
        qa1 qa1Var;
        cb1 cb1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        org.telegram.messenger.y00 y00Var = this.f39835s;
        long j10 = this.f39797a;
        ArrayList l4 = y00Var.l(j10);
        if (l4 != null) {
            ArrayList arrayList = this.f39800b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            cb1 cb1Var2 = null;
            if (org.telegram.messenger.i20.u(org.telegram.messenger.wp.r1(this.currentAccount).Z1(Long.valueOf(-j10))) && this.f39838u0) {
                arrayList.add(new fb1(3, null));
            }
            for (int i10 = 0; i10 < l4.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l4.get(i10)).f19846id))) {
                    arrayList.add(new fb1(0, (TLRPC.TL_forumTopic) l4.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !y00Var.e(j10) && this.V0) {
                arrayList.add(new fb1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f39844y = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                fb1 fb1Var = (fb1) arrayList.get(i11);
                if (fb1Var != null && (tL_forumTopic = fb1Var.f37097c) != null && tL_forumTopic.hidden) {
                    this.f39844y++;
                }
            }
            ab1 ab1Var = this.N;
            if (ab1Var != null) {
                s4.l0 itemAnimator = ab1Var.getItemAnimator();
                if (z10) {
                    cb1Var = this.I0;
                } else {
                    cb1Var = null;
                }
                if (itemAnimator != cb1Var) {
                    ab1 ab1Var2 = this.N;
                    if (z10) {
                        cb1Var2 = this.I0;
                    }
                    ab1Var2.setItemAnimator(cb1Var2);
                }
            }
            eb1 eb1Var = this.f39833r;
            if (eb1Var != null) {
                eb1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (qa1Var = this.F) != null) {
                qa1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override
    public final long a() {
        return -this.f39797a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
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
        zx zxVar = this.M0;
        if (zxVar != null && zxVar.W) {
            i10 = org.telegram.messenger.i0.L(72.0f);
        } else {
            i10 = 0;
        }
        this.f39807d1 = i10;
        zx zxVar2 = this.M0;
        if (zxVar2 != null && zxVar2.W) {
            i11 = org.telegram.messenger.i0.L(64.0f);
        } else {
            i11 = 0;
        }
        this.f39809e1 = i11;
        va1 va1Var = new va1(this, context);
        this.d = va1Var;
        this.fragmentView = va1Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, va1Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if ((!org.telegram.messenger.i0.Q1() || ((z4Var2 = this.parentLayout) != null && ((ActionBarLayout) z4Var2).f20073b)) && !this.inPreviewMode) {
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
        this.actionBar.setActionBarMenuOnItemClick(new za1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final nb1 f38785b;

            {
                this.f38785b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var;
                switch (r2) {
                    case 0:
                        nb1 nb1Var = this.f38785b;
                        if (!nb1Var.f39836s0) {
                            nb1Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        nb1 nb1Var2 = this.f38785b;
                        nb1Var2.getMessagesController().h2(-nb1Var2.f39797a, null, nb1Var2.g());
                        nb1Var2.S0(false);
                        return;
                    case 2:
                        this.f38785b.finishPreviewFragment();
                        return;
                    case 3:
                        zx zxVar3 = this.f38785b.M0;
                        if (zxVar3 != null && (t0Var = zxVar3.f44163j0) != null) {
                            t0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        nb1 nb1Var3 = this.f38785b;
                        nb1Var3.presentFragment(ja1.f0(nb1Var3.f39797a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.t0 a2 = p5.a(0, 2131232485);
            this.f39830p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final nb1 f38785b;

                {
                    this.f38785b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.t0 t0Var;
                    switch (r2) {
                        case 0:
                            nb1 nb1Var = this.f38785b;
                            if (!nb1Var.f39836s0) {
                                nb1Var.L0(false);
                                return;
                            }
                            return;
                        case 1:
                            nb1 nb1Var2 = this.f38785b;
                            nb1Var2.getMessagesController().h2(-nb1Var2.f39797a, null, nb1Var2.g());
                            nb1Var2.S0(false);
                            return;
                        case 2:
                            this.f38785b.finishPreviewFragment();
                            return;
                        case 3:
                            zx zxVar3 = this.f38785b.M0;
                            if (zxVar3 != null && (t0Var = zxVar3.f44163j0) != null) {
                                t0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            nb1 nb1Var3 = this.f38785b;
                            nb1Var3.presentFragment(ja1.f0(nb1Var3.f39797a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.t0 a10 = p5.a(0, 2131232485);
            this.f39830p0 = a10;
            a10.N();
            a10.J(new ag.l3(this, 22));
            this.f39830p0.setSearchPaddingStart(56);
            this.f39830p0.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
            EditTextBoldCursor searchField = this.f39830p0.getSearchField();
            org.telegram.ui.ActionBar.a7.V(searchField, org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Gj, getResourceProvider());
            org.telegram.ui.ActionBar.a7.w(searchField, org.telegram.ui.ActionBar.t6.Ke, getResourceProvider());
        }
        org.telegram.ui.ActionBar.t0 c10 = p5.c(0, 2131231245, null);
        this.f39832q0 = c10;
        c10.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        this.f39832q0.e(1, 2131232112, org.telegram.messenger.dd.L0(2131744027, null));
        this.R = this.f39832q0.e(2, 2131232044, org.telegram.messenger.dd.L0(2131754401, null));
        org.telegram.ui.ActionBar.t0 t0Var = this.f39832q0;
        this.T = t0Var.d(14, 0, new org.telegram.ui.Components.ci0(2131623944, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f)), org.telegram.messenger.dd.L0(2131753585, null), true, false, t0Var.m0);
        this.Q = this.f39832q0.e(3, 2131232404, org.telegram.messenger.dd.L0(2131751703, null));
        this.U = this.f39832q0.e(15, 2131232332, org.telegram.messenger.dd.L0(2131746247, null));
        this.S = this.f39832q0.d(11, 2131232194, null, org.telegram.messenger.dd.L0(2131749000, null), true, false, null);
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, this, false, this.resourceProvider);
        this.f39810f = snVar;
        snVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.Components.sn snVar2 = this.f39810f;
        if ((!org.telegram.messenger.i0.Q1() || ((z4Var = this.parentLayout) != null && ((ActionBarLayout) z4Var).f20073b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        snVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.sn snVar3 = this.f39810f;
        long j10 = -this.f39797a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        snVar3.f30347b = z12;
        snVar3.setClipChildren(false);
        this.actionBar.addView(this.f39810f, 0, w7.b6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f39837t0) {
            this.f39810f.getAvatarImageView().setOnClickListener(new z7(this, 4));
        }
        this.N = new ab1(this, context);
        zg.h hVar = new zg.h(this.d);
        ViewGroup viewGroup = this.d;
        tg.b bVar = this.f39822k1;
        bVar.h = hVar;
        bVar.f48713i = viewGroup;
        ab1 ab1Var = this.N;
        zx zxVar3 = this.M0;
        if (zxVar3 != null) {
            viewGroup = (ViewGroup) zxVar3.getFragmentView();
        }
        ab1 ab1Var2 = this.N;
        Objects.requireNonNull(ab1Var2);
        this.l1 = new tg.j(ab1Var, viewGroup, new l50(ab1Var2, 2));
        this.N.D0(new la1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        gg.d c11 = gg.e.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        jw jwVar = new jw(this, org.telegram.messenger.i0.J2(org.telegram.messenger.dd.L0(2131754719, null), spannableString, "#"), org.telegram.messenger.i0.J2(org.telegram.messenger.dd.L0(2131754721, null), spannableString, "#"));
        this.f39842x = jwVar;
        jwVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.D = i12;
        jw jwVar2 = this.f39842x;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        jwVar2.X = z13;
        cb1 cb1Var = new cb1(this);
        this.N.setHideIfEmpty(false);
        cb1Var.f47938m = false;
        cb1Var.C = false;
        ab1 ab1Var3 = this.N;
        this.I0 = cb1Var;
        ab1Var3.setItemAnimator(cb1Var);
        this.N.setOnScrollListener(new ra1(this, 1));
        ab1 ab1Var4 = this.N;
        ab1Var4.W1 = true;
        ab1Var4.X1 = 0;
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(ab1Var4, true);
        this.K0 = xj0Var;
        this.N.setItemsEnterAnimator(xj0Var);
        this.N.setOnItemClickListener(new jz0(this, 9));
        this.N.setOnItemLongClickListener(new ma1(this));
        this.N.setOnScrollListener(new ra1(this, 2));
        ab1 ab1Var5 = this.N;
        qa1 qa1Var = new qa1(this);
        this.F = qa1Var;
        ab1Var5.setLayoutManager(qa1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f39833r);
        this.N.setClipToPadding(false);
        this.N.j(new ra1(this, 0));
        mb1 mb1Var = new mb1(this);
        this.P = mb1Var;
        sa1 sa1Var = new sa1(this, mb1Var);
        this.O = sa1Var;
        sa1Var.h(this.N);
        this.d.addView(this.N, w7.b6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -org.telegram.messenger.i0.L(100.0f);
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(getParentActivity(), this.resourceProvider, false);
        this.h = f10Var;
        this.d.addView(f10Var, org.telegram.ui.Components.f10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final nb1 f38785b;

            {
                this.f38785b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var2;
                switch (r2) {
                    case 0:
                        nb1 nb1Var = this.f38785b;
                        if (!nb1Var.f39836s0) {
                            nb1Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        nb1 nb1Var2 = this.f38785b;
                        nb1Var2.getMessagesController().h2(-nb1Var2.f39797a, null, nb1Var2.g());
                        nb1Var2.S0(false);
                        return;
                    case 2:
                        this.f38785b.finishPreviewFragment();
                        return;
                    case 3:
                        zx zxVar32 = this.f38785b.M0;
                        if (zxVar32 != null && (t0Var2 = zxVar32.f44163j0) != null) {
                            t0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        nb1 nb1Var3 = this.f38785b;
                        nb1Var3.presentFragment(ja1.f0(nb1Var3.f39797a, 0L));
                        return;
                }
            }
        });
        this.h.f26022c.setImageResource(2131231267);
        this.h.f26022c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f26022c.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.dd.L0(2131751703, null));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(24);
        zzVar.setVisibility(8);
        zzVar.f33280x = true;
        ha1 ha1Var = new ha1(context, 1);
        TextView textView = new TextView(context);
        ha1Var.d = textView;
        if (org.telegram.messenger.dd.X) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131230874, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131744285, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.dd.L0(2131744285, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(2131230872, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21312y6, getResourceProvider());
        boolean z14 = org.telegram.messenger.dd.X;
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
        ha1Var.addView(textView, w7.b6.d(-2, -2.0f, 81, f7, 0.0f, f10, 32.0f));
        this.f39825n = ha1Var;
        textView.setAlpha(0.0f);
        org.telegram.ui.Components.kj kjVar = new org.telegram.ui.Components.kj(this, context, zzVar);
        this.D0 = kjVar;
        try {
            kjVar.f25947b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(org.telegram.messenger.dd.L0(2131748154, null));
        Y0();
        this.f39825n.addView(zzVar);
        this.f39825n.addView(this.D0);
        this.d.addView(this.f39825n);
        this.N.setEmptyView(this.f39825n);
        this.f39828o0 = new bg0(context, 15);
        org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(context);
        this.L = x51Var;
        this.f39828o0.addView(x51Var);
        this.d.addView(this.f39828o0, w7.b6.e(-1, 51, 80));
        this.L.setOnClickListener(new ta1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39826n0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(22.0f));
        this.f39826n0.setVisibility(4);
        this.f39828o0.addView(this.f39826n0, w7.b6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(2131231982);
        this.W0.setContentDescription(org.telegram.messenger.dd.L0(2131752041, null));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.t6.Re;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.c(null, org.telegram.ui.ActionBar.j6.b(getThemedColor(i13))));
        org.telegram.ui.ActionBar.a7.t(this.W0, i13, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f39828o0.addView(this.W0, w7.b6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final nb1 f38785b;

            {
                this.f38785b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var2;
                switch (r2) {
                    case 0:
                        nb1 nb1Var = this.f38785b;
                        if (!nb1Var.f39836s0) {
                            nb1Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        nb1 nb1Var2 = this.f38785b;
                        nb1Var2.getMessagesController().h2(-nb1Var2.f39797a, null, nb1Var2.g());
                        nb1Var2.S0(false);
                        return;
                    case 2:
                        this.f38785b.finishPreviewFragment();
                        return;
                    case 3:
                        zx zxVar32 = this.f38785b.M0;
                        if (zxVar32 != null && (t0Var2 = zxVar32.f44163j0) != null) {
                            t0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        nb1 nb1Var3 = this.f38785b;
                        nb1Var3.presentFragment(ja1.f0(nb1Var3.f39797a, 0L));
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        S0(false);
        l0 l0Var = new l0(this, context, 28);
        this.e = l0Var;
        if (this.M0 == null) {
            this.d.addView(l0Var, w7.b6.e(-1, -1, 119));
        }
        jb1 jb1Var = new jb1(this, context);
        this.f39834r0 = jb1Var;
        jb1Var.setVisibility(8);
        this.e.addView(this.f39834r0, w7.b6.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        jb1 jb1Var2 = this.f39834r0;
        int i14 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.a7.i(i14, jb1Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.f39797a, true, null, true, false, 0);
        org.telegram.ui.Components.zr zrVar = new org.telegram.ui.Components.zr(context);
        this.U0 = zrVar;
        zrVar.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f));
        vg.f c12 = bVar.c(this.U0, w7.b9.o(this.resourceProvider), false);
        org.telegram.messenger.a30.u(c12, org.telegram.messenger.i0.L(24.0f), 7.0f);
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new la1(this, 0));
        this.d.addView(this.U0, w7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            oh.e eVar = new oh.e(g10, this);
            this.R0 = eVar;
            this.U0.addView(eVar.b(), w7.b6.o(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            oh.e eVar2 = this.R0;
            eVar2.f14257m = new ma1(this);
            TLRPC.ChatFull chatFull = this.J;
            eVar2.f14254j = chatFull;
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
            c13.topMargin = org.telegram.messenger.i0.f16166m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        C0();
        bo0 bo0Var = new bo0(this, context, 6);
        this.P0 = bo0Var;
        bo0Var.setForeground(new ColorDrawable(i0.b.o(getThemedColor(i14), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final nb1 f38785b;

            {
                this.f38785b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.t0 t0Var2;
                switch (r2) {
                    case 0:
                        nb1 nb1Var = this.f38785b;
                        if (!nb1Var.f39836s0) {
                            nb1Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        nb1 nb1Var2 = this.f38785b;
                        nb1Var2.getMessagesController().h2(-nb1Var2.f39797a, null, nb1Var2.g());
                        nb1Var2.S0(false);
                        return;
                    case 2:
                        this.f38785b.finishPreviewFragment();
                        return;
                    case 3:
                        zx zxVar32 = this.f38785b.M0;
                        if (zxVar32 != null && (t0Var2 = zxVar32.f44163j0) != null) {
                            t0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        nb1 nb1Var3 = this.f38785b;
                        nb1Var3.presentFragment(ja1.f0(nb1Var3.f39797a, 0L));
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
                if (k2Var instanceof zx) {
                    zx zxVar4 = (zx) k2Var;
                    if (zxVar4.t4()) {
                        org.telegram.messenger.hs hsVar = zxVar4.f44193p2;
                        if (hsVar.f16109a == j10) {
                            this.Q0 = hsVar.f16110b;
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
        if (org.telegram.messenger.w3.R(g())) {
            getMessagesController().G0().a(j10, new s3(this, 25));
        }
        View view = this.fragmentView;
        ma1 ma1Var = new ma1(this);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(view, ma1Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = org.telegram.messenger.at.T;
        long j10 = this.f39797a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f19795id == j10) {
                S0(false);
                oh.e eVar = this.R0;
                if (eVar != null) {
                    eVar.f14254j = chatFull2;
                    eVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                D0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == org.telegram.messenger.at.f14805v5) {
            S0(false);
        } else if (i10 == org.telegram.messenger.at.f14764p3) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == org.telegram.messenger.at.f14771q5) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i10 == org.telegram.messenger.at.f14772r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.wp.D8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().f19234r7.y(j10, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14779s) {
            Z0(false, false);
        } else if (i10 == org.telegram.messenger.at.f14809w2) {
            Long l4 = (Long) objArr[0];
            if (j10 == l4.longValue()) {
                this.H0 = getMessagesController().f1(l4.longValue(), false, null);
                y8 y8Var = this.G0;
                if (y8Var != null) {
                    y8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i10 == org.telegram.messenger.at.f14704f0) {
            Z0(false, false);
            S0(true);
        } else if (i10 != org.telegram.messenger.at.f14778r5 && i10 == org.telegram.messenger.at.f14786t) {
            removeSelfFromStack(true);
        }
        if (i10 == org.telegram.messenger.at.f14716h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.i0.Q1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j10) && !booleanValue) {
                if (this.Q0 != longValue2) {
                    this.Q0 = longValue2;
                    Z0(false, false);
                }
            } else if (this.Q0 != 0) {
                this.Q0 = 0L;
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
        return getMessagesController().L0(Long.valueOf(this.f39797a));
    }

    @Override
    public final org.telegram.messenger.u3 getGroupCall() {
        org.telegram.messenger.u3 u3Var = this.H0;
        if (u3Var != null && (u3Var.f18361b instanceof TLRPC.TL_groupCall)) {
            return u3Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        jb1 jb1Var = this.f39834r0;
        if (jb1Var != null && jb1Var.W != null) {
            int i10 = org.telegram.ui.Cells.z3.h;
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i10;
        if (this.f39836s0) {
            i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21207s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.u()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f21280w8);
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
    public final hi.f k() {
        return this.f39816h1;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f39798a0.isEmpty()) {
            if (z10) {
                G0();
                return false;
            }
        } else if (this.f39836s0) {
            if (z10) {
                this.actionBar.y(this.f39830p0.T(false));
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
        org.telegram.messenger.wp messagesController = getMessagesController();
        long j10 = this.f39797a;
        messagesController.T2(0, j10, true);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14805v5);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14764p3);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.T);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14771q5);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14779s);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14809w2);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14704f0);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14778r5);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14786t);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14716h0);
        Z0(false, false);
        g31.t(this.currentAccount);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j10));
        if (org.telegram.messenger.w3.T(L0)) {
            getMessagesController().S4(L0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f39796q1;
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
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14805v5);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14764p3);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.T);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14771q5);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14779s);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14809w2);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14704f0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14778r5);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14786t);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14716h0);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f39797a));
        if (org.telegram.messenger.w3.T(L0)) {
            getMessagesController().S4(L0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        zx zxVar = this.M0;
        if (zxVar != null && zxVar.F3 != null) {
            zxVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.F3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().f19234r7.f19514f;
        long j10 = this.f39797a;
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
        org.telegram.messenger.y00 y00Var = getMessagesController().f19234r7;
        LongSparseIntArray longSparseIntArray = y00Var.f19514f;
        long j10 = this.f39797a;
        longSparseIntArray.put(j10, longSparseIntArray.get(j10, 0) + 1);
        y00Var.y(j10, true);
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
        if (org.telegram.messenger.uz.o() != 0 && this.T0) {
            P0(f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        hi.c cVar = this.f39820j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.j6.b(getThemedColor(org.telegram.ui.ActionBar.t6.Re))) != this.f39831p1) {
            this.f39831p1 = b10;
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
        bo0 bo0Var = this.P0;
        if (bo0Var != null && (bo0Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.b.o(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
            }
            jw jwVar = this.f39842x;
            if (jwVar != null) {
                jwVar.i();
            }
            if (this.actionBar != null && this.f39802b1) {
                X0();
            }
            NumberTextView numberTextView = this.f39804c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21314y8));
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.f39830p0;
            if (t0Var != null && t0Var.getSearchField() != null) {
                this.f39830p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.Ke));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ww wwVar;
        bo0 bo0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (bo0Var = this.P0) != null) {
            if (bo0Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            D0(false);
        }
        this.O0.e();
        if (!z10) {
            if (this.f39837t0 && this.H) {
                removeSelfFromStack();
                zx zxVar = this.L0;
                if (zxVar != null) {
                    zxVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                zx zxVar2 = this.M0;
                if (zxVar2 != null && (wwVar = zxVar2.F3) != null && wwVar.c()) {
                    this.M0.F3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        bo0 bo0Var = this.P0;
        if (bo0Var != null && bo0Var.getVisibility() == 0) {
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
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            O0(true);
            return;
        }
        this.T0 = false;
        O0(false);
        P0(1.0f);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.sn r() {
        return this.f39810f;
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.sn snVar = this.f39810f;
        if (snVar != null) {
            snVar.setAlpha(f7);
            this.f39832q0.setAlpha(f7);
            org.telegram.ui.ActionBar.t0 t0Var = this.f39830p0;
            if (t0Var != null) {
                t0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.sn snVar = this.f39810f;
        if (snVar != null) {
            snVar.setAlpha(f7);
            this.f39810f.setTranslationX((1.0f - f7) * org.telegram.messenger.i0.L(40.0f));
        }
    }

    @Override
    public final void w() {
        this.N.y0(0);
    }

    @Override
    public final void s() {
    }

    @Override
    public final void l(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
