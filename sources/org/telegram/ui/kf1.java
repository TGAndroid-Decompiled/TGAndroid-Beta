package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
public class kf1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.rg, ug0 {
    public static final HashSet f35667k1 = new HashSet();
    public nh.y4 A0;
    public boolean B;
    public ye1 B0;
    public le1 C;
    public FrameLayout C0;
    public boolean D;
    public z8 D0;
    public boolean E;
    public ChatObject.Call E0;
    public boolean F;
    public xe1 F0;
    public TLRPC.ChatFull G;
    public boolean G0;
    public boolean H;
    public org.telegram.ui.Components.zk0 H0;
    public org.telegram.ui.Components.i61 I;
    public oy I0;
    public int J;
    public oy J0;
    public ve1 K;
    public boolean K0;
    public ne1 L;
    public final AnimationNotificationsLocker L0;
    public jf1 M;
    public gw0 M0;
    public org.telegram.ui.ActionBar.g1 N;
    public long N0;
    public org.telegram.ui.ActionBar.g1 O;
    public jh.e O0;
    public org.telegram.ui.ActionBar.g1 P;
    public float P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public boolean Q0;
    public org.telegram.ui.ActionBar.g1 R;
    public org.telegram.ui.Components.js R0;
    public boolean S;
    public final boolean S0;
    public float T;
    public ImageView T0;
    public TL_stories.TL_premium_boostsStatus U;
    public float U0;
    public long V;
    public ValueAnimator V0;
    public boolean W;
    public boolean W0;
    public final HashSet X;
    public org.telegram.ui.Components.k81 X0;
    public boolean Y;
    public View Y0;
    public NumberTextView Z;
    public int Z0;
    public final long f35668a;
    public org.telegram.ui.ActionBar.w0 f35669a0;
    public int f35670a1;
    public final ArrayList f35671b;
    public org.telegram.ui.ActionBar.w0 f35672b0;
    public int f35673b1;
    public int f35674c;
    public org.telegram.ui.ActionBar.w0 f35675c0;
    public final ng.e f35676c1;
    public qe1 d;
    public org.telegram.ui.ActionBar.w0 f35677d0;
    public final sg.d f35678d1;
    public l0 e;
    public org.telegram.ui.ActionBar.w0 f35679e0;
    public final sg.d f35680e1;
    public org.telegram.ui.Components.zn f35681f;
    public org.telegram.ui.ActionBar.w0 f35682f0;
    public final ng.a f35683f1;
    public org.telegram.ui.ActionBar.g1 f35684g0;
    public ng.k f35685g1;
    public org.telegram.ui.Components.z10 h;
    public org.telegram.ui.ActionBar.g1 f35686h0;
    public final ArrayList f35687h1;
    public org.telegram.ui.ActionBar.g1 f35688i0;
    public final RectF f35689i1;
    public org.telegram.ui.ActionBar.w0 f35690j0;
    public final RectF f35691j1;
    public RadialProgressView f35692k0;
    public a51 f35693l0;
    public org.telegram.ui.ActionBar.w0 m0;
    public af1 f35694n;
    public org.telegram.ui.ActionBar.w0 f35695n0;
    public gf1 f35696o0;
    public boolean f35697p0;
    public final boolean f35698q0;
    public final ze1 f35699r;
    public final boolean f35700r0;
    public final TopicsController f35701s;
    public final boolean f35702s0;
    public final boolean f35703t0;
    public final boolean f35704u0;
    public lf1 v;
    public String f35705v0;
    public vw f35706w;
    public boolean f35707w0;
    public int f35708x;
    public HashSet f35709x0;
    public int f35710y;
    public boolean f35711y0;
    public boolean f35712z0;

    public kf1(Bundle bundle) {
        super(bundle);
        this.f35671b = new ArrayList();
        new ArrayList();
        this.f35699r = new ze1(this);
        this.f35708x = 0;
        this.B = true;
        this.D = true;
        this.S = true;
        this.T = 0.0f;
        this.X = new HashSet();
        this.f35711y0 = false;
        this.L0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.P0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f35687h1 = arrayList;
        RectF rectF = new RectF();
        this.f35689i1 = rectF;
        RectF rectF2 = new RectF();
        this.f35691j1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f35668a = j10;
        this.f35698q0 = this.arguments.getBoolean("for_select", false);
        this.f35700r0 = this.arguments.getBoolean("forward_to", false);
        this.f35704u0 = this.arguments.getBoolean("bot_share_to", false);
        this.f35702s0 = this.arguments.getBoolean("quote", false);
        this.f35703t0 = this.arguments.getBoolean("reply_to", false);
        this.f35705v0 = this.arguments.getString("voicechat", null);
        this.f35707w0 = this.arguments.getBoolean("videochat", false);
        this.f35701s = getMessagesController().getTopicsController();
        this.S0 = true ^ org.telegram.messenger.y3.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f35676c1 = new ng.e(false);
            this.f35678d1 = new sg.d(null);
            sg.d dVar = new sg.d(null);
            this.f35680e1 = dVar;
            ng.a aVar = new ng.a(dVar);
            this.f35683f1 = aVar;
            aVar.f14972f = LiteMode.isEnabled(262144);
            return;
        }
        this.f35676c1 = null;
        this.f35678d1 = null;
        this.f35680e1 = null;
        this.f35683f1 = new ng.a(cVar);
    }

    public static org.telegram.ui.ActionBar.p2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new xn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new xn(bundle);
            }
        }
        return new kf1(bundle);
    }

    public static org.telegram.ui.ActionBar.p2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.L), MessagesStorage.getInstance(launchActivity.L), bundle);
    }

    public static void I0(org.telegram.ui.xn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kf1.I0(org.telegram.ui.xn):void");
    }

    public static boolean U(kf1 kf1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(kf1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-kf1Var.f35668a), System.currentTimeMillis()).commit();
        Activity parentActivity = kf1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(kf1Var.g());
        int i10 = org.telegram.ui.Components.h80.f25349r;
        org.telegram.ui.Components.h80.w(parentActivity, kf1Var, org.telegram.ui.Components.qc.a0(kf1Var), isChannelAndNotMegaGroup);
        kf1Var.O0(true);
        return false;
    }

    public static void V(kf1 kf1Var, View view) {
        long j10;
        long j11 = kf1Var.f35668a;
        if (kf1Var.getParentLayout() != null && !((ActionBarLayout) kf1Var.getParentLayout()).y() && (view instanceof hf1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((hf1) view).K;
            long j12 = -j11;
            boolean isMonoForum = kf1Var.getMessagesController().isMonoForum(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (isMonoForum) {
                j10 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f19236id;
            }
            long j13 = j10;
            if (kf1Var.f35698q0) {
                lf1 lf1Var = kf1Var.v;
                if (lf1Var != null) {
                    nf1 nf1Var = lf1Var.f36077a;
                    Bundle bundle = new Bundle();
                    qf1 qf1Var = nf1Var.f36618a;
                    bundle.putLong("dialog_id", qf1Var.f37749c);
                    bundle.putLong("topic_id", tL_forumTopic.f19236id);
                    bundle.putBoolean("exception", true);
                    e11 e11Var = new e11(bundle, null);
                    e11Var.f33856r = new tl0(25, nf1Var, tL_forumTopic);
                    qf1Var.presentFragment(e11Var);
                }
                oy oyVar = kf1Var.I0;
                if (oyVar != null) {
                    oyVar.O3(j12, j13, true, kf1Var);
                }
            } else if (kf1Var.X.size() > 0) {
                kf1Var.N0(view);
            } else {
                if (kf1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.p2 p2Var : kf1Var.getParentLayout().getFragmentStack()) {
                        if (p2Var instanceof oy) {
                            oy oyVar2 = (oy) p2Var;
                            if (oyVar2.h4()) {
                                MessagesStorage.TopicKey topicKey = oyVar2.f37065m2;
                                if (topicKey.dialogId == j12 && topicKey.topicId == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    kf1Var.N0 = j13;
                    kf1Var.U0(false, false);
                }
                ag.f.m(kf1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(kf1 kf1Var, View view, float f10) {
        if (kf1Var.f35698q0 || kf1Var.getParentLayout() == null || ((ActionBarLayout) kf1Var.getParentLayout()).y()) {
            return false;
        }
        if (!kf1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof hf1)) {
            hf1 hf1Var = (hf1) view;
            if (hf1Var.S(f10)) {
                kf1Var.M0(hf1Var);
                kf1Var.K.I0(true);
                kf1Var.K.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        kf1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(kf1 kf1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = kf1Var.K;
            } else {
                gf1 gf1Var = kf1Var.f35696o0;
                if (gf1Var != null) {
                    viewGroup = gf1Var.R;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = kf1Var.actionBar;
        if (kVar != null) {
            kVar.D(kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            kf1Var.actionBar.E(kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            kf1Var.actionBar.E(kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            kf1Var.actionBar.F(kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
        }
        gw0 gw0Var = kf1Var.M0;
        if (gw0Var != null && Build.VERSION.SDK_INT >= 23) {
            gw0Var.setForeground(new ColorDrawable(i0.a.k(kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6), 100)));
        }
        kf1Var.P0();
    }

    public static void b0(kf1 kf1Var, boolean z4) {
        float f10;
        boolean z10;
        jx jxVar;
        kf1Var.f35697p0 = z4;
        ValueAnimator valueAnimator = kf1Var.V0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            kf1Var.V0.cancel();
        }
        if (kf1Var.X0 == null) {
            org.telegram.ui.Components.k81 n10 = kf1Var.f35696o0.n(8, false);
            kf1Var.X0 = n10;
            if (kf1Var.J0 != null) {
                n10.setBackgroundColor(kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
            }
            kf1Var.e.addView(kf1Var.X0, k7.b6.c(44.0f, -1));
        }
        float f11 = kf1Var.T;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        kf1Var.V0 = ValueAnimator.ofFloat(f11, f10);
        AndroidUtilities.updateViewVisibilityAnimated(kf1Var.f35696o0, false, 1.0f, true);
        oy oyVar = kf1Var.J0;
        if (oyVar != null && (jxVar = oyVar.C3) != null) {
            jxVar.J = !z4;
        }
        if (!z4 && kf1Var.f35696o0.getVisibility() == 0 && kf1Var.f35696o0.getAlpha() == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        kf1Var.W0 = z10;
        kf1Var.V0.addUpdateListener(new h11(kf1Var, 17));
        kf1Var.f35696o0.setVisibility(0);
        if (!z4) {
            kf1Var.f35695n0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(kf1Var.getParentActivity(), kf1Var.classGuid);
            kf1Var.Q0(false);
        }
        kf1Var.V0.addListener(new te1(kf1Var, z4, 0));
        kf1Var.V0.setDuration(200L);
        kf1Var.V0.setInterpolator(org.telegram.ui.Components.nr.f27346f);
        kf1Var.V0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override
    public final org.telegram.ui.Components.qv0 A() {
        return this.d;
    }

    public final void A0() {
        this.G0 = this.f35701s.isLoading(this.f35668a);
        if (this.A0 != null) {
            ArrayList arrayList = this.f35671b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((bf1) arrayList.get(0)).f32951c != null && ((bf1) arrayList.get(0)).f32951c.f19236id == 1)) {
                this.A0.e(this.G0, this.fragmentBeginToShow);
            }
        }
        ve1 ve1Var = this.K;
        if (ve1Var != null) {
            ve1Var.J0(ve1Var.u1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f10;
        float f11;
        oy oyVar = this.J0;
        float f12 = 0.0f;
        if (oyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.js jsVar = oyVar.G1;
            if (jsVar != null) {
                f10 = jsVar.c(dp);
            } else {
                f10 = 0.0f;
            }
            float f13 = f10 + 0.0f;
            org.telegram.ui.Components.js jsVar2 = this.R0;
            if (jsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.js jsVar3 = this.J0.G1;
                if (jsVar3 != null) {
                    f11 = jsVar3.getMetadata().f46905c.f46913a;
                } else {
                    f11 = 0.0f;
                }
                jsVar2.setTranslationY(f13 - (f11 * dp2));
                org.telegram.ui.Components.js jsVar4 = this.R0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.js jsVar5 = this.J0.G1;
                if (jsVar5 != null) {
                    f12 = jsVar5.getMetadata().f46905c.f46913a;
                }
                f12 = jsVar4.c(AndroidUtilities.lerp(dp3, dp4, f12)) + f13;
            } else {
                f12 = f13;
            }
        } else {
            org.telegram.ui.Components.js jsVar6 = this.R0;
            if (jsVar6 != null) {
                f12 = 0.0f + jsVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f35673b1 + this.Z0;
        if (this.S) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.K.setPadding(0, (int) f12, 0, i11 + i10);
    }

    public final void C0() {
        this.X.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.K);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.O = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            d2Var.Q = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f35701s.findTopic(this.f35668a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            d2Var.Q = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new al0(8));
        d2Var.show();
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
        }
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void G0(boolean z4, boolean z10) {
        boolean z11 = true;
        this.h.e(!z4, (this.fragmentBeginToShow && z10) ? false : false);
    }

    @Override
    public final long H() {
        return 0L;
    }

    public final void H0(boolean z4) {
        int i10;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z4 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z4 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f35668a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f35681f.getSharedMediaPreloader());
        profileActivity.K4(this.G);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f35681f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z4) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        profileActivity.N4(i10);
        presentFragment(profileActivity);
    }

    public final void J0(int i10) {
        int i11;
        int i12;
        if (this.J != i10) {
            this.J = i10;
            org.telegram.ui.Components.i61 i61Var = this.I;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f20141q7;
            }
            i61Var.setTextColorKey(i11);
            ImageView imageView = this.T0;
            if (i10 == 1) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            O0(false);
        }
    }

    public final void K0(boolean z4) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        qe1 qe1Var = this.d;
        if (qe1Var != null) {
            if (z4) {
                qe1Var.setLayerType(2, null);
                qe1Var.setClipChildren(false);
                qe1Var.setClipToPadding(false);
            } else {
                qe1Var.setLayerType(0, null);
                qe1Var.setClipChildren(true);
                qe1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f10) {
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            this.P0 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            ve1 ve1Var = this.K;
            if (ve1Var != null) {
                float c3 = yh.c(1.0f, this.P0, 0.05f, 1.0f);
                ve1Var.setPivotX(0.0f);
                ve1Var.setPivotY(0.0f);
                ve1Var.setScaleX(c3);
                ve1Var.setScaleY(c3);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(c3);
                this.actionBar.setScaleY(c3);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.r2 r2Var) {
        long j10;
        try {
            r2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = r2Var.K;
        org.telegram.ui.Components.lo loVar = new org.telegram.ui.Components.lo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new pe1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(loVar.f26823f);
        loVar.f26831o = 1;
        long j11 = this.f35668a;
        long j12 = -j11;
        loVar.d(j12, tL_forumTopic.f19236id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final kf1 f35335b;

                {
                    this.f35335b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            kf1 kf1Var = this.f35335b;
                            kf1Var.f35712z0 = true;
                            kf1Var.K0 = true;
                            TopicsController topicsController = kf1Var.f35701s;
                            long j13 = kf1Var.f35668a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f19236id, !tL_forumTopic2.pinned, kf1Var);
                            kf1Var.finishPreviewFragment();
                            return;
                        case 1:
                            kf1 kf1Var2 = this.f35335b;
                            kf1Var2.K0 = true;
                            TopicsController topicsController2 = kf1Var2.f35701s;
                            long j14 = kf1Var2.f35668a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f19236id, true ^ tL_forumTopic3.closed);
                            kf1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19236id));
                            kf1 kf1Var3 = this.f35335b;
                            kf1Var3.D0(hashSet, new he1(kf1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j12, tL_forumTopic.f19236id)) {
            g1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new nh.o5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(g1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                g1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                g1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            g1Var3.setMinimumWidth(160);
            g1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final kf1 f35335b;

                {
                    this.f35335b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            kf1 kf1Var = this.f35335b;
                            kf1Var.f35712z0 = true;
                            kf1Var.K0 = true;
                            TopicsController topicsController = kf1Var.f35701s;
                            long j13 = kf1Var.f35668a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f19236id, !tL_forumTopic2.pinned, kf1Var);
                            kf1Var.finishPreviewFragment();
                            return;
                        case 1:
                            kf1 kf1Var2 = this.f35335b;
                            kf1Var2.K0 = true;
                            TopicsController topicsController2 = kf1Var2.f35701s;
                            long j14 = kf1Var2.f35668a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f19236id, true ^ tL_forumTopic3.closed);
                            kf1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19236id));
                            kf1 kf1Var3 = this.f35335b;
                            kf1Var3.D0(hashSet, new he1(kf1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20122p7));
            g1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
            g1Var4.setMinimumWidth(160);
            g1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final kf1 f35335b;

                {
                    this.f35335b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            kf1 kf1Var = this.f35335b;
                            kf1Var.f35712z0 = true;
                            kf1Var.K0 = true;
                            TopicsController topicsController = kf1Var.f35701s;
                            long j13 = kf1Var.f35668a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f19236id, !tL_forumTopic2.pinned, kf1Var);
                            kf1Var.finishPreviewFragment();
                            return;
                        case 1:
                            kf1 kf1Var2 = this.f35335b;
                            kf1Var2.K0 = true;
                            TopicsController topicsController2 = kf1Var2.f35701s;
                            long j14 = kf1Var2.f35668a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f19236id, true ^ tL_forumTopic3.closed);
                            kf1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19236id));
                            kf1 kf1Var3 = this.f35335b;
                            kf1Var3.D0(hashSet, new he1(kf1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j12);
        if (this.M0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.M0.setBackground(new BitmapDrawable(createBitmap));
            this.M0.setAlpha(0.0f);
            if (this.M0.getParent() != null) {
                ((ViewGroup) this.M0.getParent()).removeView(this.M0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.M0, k7.b6.c(-1.0f, -1));
        }
        xn xnVar = new xn(kh.a2.g(j11, "chat_id"));
        if (isMonoForum) {
            j10 = DialogObject.getPeerDialogId(r2Var.K.from_id);
        } else {
            j10 = r2Var.K.f19236id;
        }
        ag.f.a(xnVar, MessagesStorage.TopicKey.of(j12, j10));
        presentFragmentAsPreviewWithMenu(xnVar, r32[0]);
    }

    public final void N0(View view) {
        hf1 hf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((view instanceof hf1) && (tL_forumTopic = (hf1Var = (hf1) view).K) != null) {
            int i19 = tL_forumTopic.f19236id;
            Integer valueOf = Integer.valueOf(i19);
            HashSet hashSet = this.X;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i19));
            }
            hf1Var.V(hashSet.contains(Integer.valueOf(i19)), true);
            MessagesController messagesController = getMessagesController();
            long j10 = this.f35668a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.z j11 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j11.setBackgroundColor(0);
                        j11.f20772a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j11.getContext());
                    this.Z = numberTextView;
                    numberTextView.setTextSize(18);
                    this.Z.setTypeface(AndroidUtilities.bold());
                    this.Z.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20283y8));
                    j11.addView(this.Z, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
                    this.Z.setOnTouchListener(new ke1(0));
                    this.f35669a0 = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f35672b0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f35675c0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f35677d0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.w0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f35679e0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h9 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f35682f0 = h9;
                    h9.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h10 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.f35690j0 = h10;
                    this.f35684g0 = h10.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f35686h0 = this.f35690j0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f35688i0 = this.f35690j0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.O(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f35701s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, intValue);
                    if (findTopic != null) {
                        if (findTopic.unread_count != 0) {
                            i20++;
                        }
                        if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                            if (findTopic.pinned) {
                                i23++;
                            } else {
                                i22++;
                            }
                        }
                    }
                    if (getMessagesController().isDialogMuted(-j10, intValue)) {
                        i21++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i20 > 0) {
                    this.f35684g0.setVisibility(0);
                    this.f35684g0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                } else {
                    this.f35684g0.setVisibility(8);
                }
                if (i21 != 0) {
                    this.f35711y0 = false;
                    this.f35675c0.setIcon(R.drawable.msg_unmute);
                    this.f35675c0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z4 = true;
                } else {
                    z4 = true;
                    this.f35711y0 = true;
                    this.f35675c0.setIcon(R.drawable.msg_mute);
                    this.f35675c0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.w0 w0Var = this.f35669a0;
                if (i22 == z4 && i23 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w0Var.setVisibility(i10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f35672b0;
                if (i23 == z4 && i22 == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                w0Var2.setVisibility(i11);
                this.Z.a(hashSet3.size(), z4);
                Iterator it2 = hashSet3.iterator();
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i26++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f19236id == 1) {
                                if (findTopic2.hidden) {
                                    i28++;
                                } else {
                                    i27++;
                                }
                            }
                            if (!findTopic2.hidden) {
                                if (findTopic2.closed) {
                                    i24++;
                                } else {
                                    i25++;
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.f35686h0;
                if (i24 == 0 && i25 > 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                g1Var.setVisibility(i12);
                org.telegram.ui.ActionBar.g1 g1Var2 = this.f35686h0;
                if (i25 > 1) {
                    i13 = R.string.CloseTopics;
                } else {
                    i13 = R.string.CloseTopic;
                }
                g1Var2.setText(LocaleController.getString(i13));
                org.telegram.ui.ActionBar.g1 g1Var3 = this.f35688i0;
                if (i25 == 0 && i24 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                g1Var3.setVisibility(i14);
                org.telegram.ui.ActionBar.g1 g1Var4 = this.f35688i0;
                if (i24 > 1) {
                    i15 = R.string.RestartTopics;
                } else {
                    i15 = R.string.RestartTopic;
                }
                g1Var4.setText(LocaleController.getString(i15));
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f35677d0;
                if (i26 == hashSet3.size()) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                w0Var3.setVisibility(i16);
                org.telegram.ui.ActionBar.w0 w0Var4 = this.f35679e0;
                if (i27 == 1 && hashSet3.size() == 1) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                w0Var4.setVisibility(i17);
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f35682f0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                w0Var5.setVisibility(i18);
                this.f35690j0.l();
                R0();
                return;
            }
            this.actionBar.r();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kf1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f35692k0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ae));
        this.h.g();
        a51 a51Var = this.f35693l0;
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        a51Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20176s8));
        }
        this.f35696o0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z4) {
        boolean z10;
        if (this.N == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f35668a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) && ChatObject.canCreateTopic(chat) && !this.f35697p0 && !this.f35698q0 && !this.G0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        org.telegram.ui.ActionBar.g1 g1Var = this.N;
        if (!z10) {
            i10 = 8;
        }
        g1Var.setVisibility(i10);
        G0(!this.H, z4);
    }

    public final void R0() {
        boolean z4;
        if (ChatObject.canManageTopics(g()) && !this.X.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.Y != z4) {
            this.Y = z4;
            ze1 ze1Var = this.f35699r;
            ze1Var.q(0, ze1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z4) {
        return false;
    }

    public final void S0(float f10) {
        this.T = f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20227v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20283y8;
        kVar.C(i0.a.d(this.T, themedColor, getThemedColor(i10)), false);
        this.actionBar.C(i0.a.d(this.T, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.d(this.T, getThemedColor(org.telegram.ui.ActionBar.j6.f20192t8), getThemedColor(org.telegram.ui.ActionBar.j6.f20300z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.T, getThemedColor(org.telegram.ui.ActionBar.j6.f20176s8), getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6)));
        }
        float f11 = 1.0f - f10;
        this.f35681f.getTitleTextView().setAlpha(f11);
        this.f35681f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.k81 k81Var = this.X0;
        if (k81Var != null) {
            k81Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
            this.X0.setAlpha(f10);
        }
        this.f35696o0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        this.f35696o0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.K.setAlpha(f11);
        if (this.W0) {
            float w10 = e2.c.w(1.0f, this.T, 0.02f, 0.98f);
            this.K.setScaleX(w10);
            this.K.setScaleY(w10);
        }
    }

    public final void T0() {
        nh.y4 y4Var = this.A0;
        if (y4Var != null && y4Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.ic_ab_other, 0);
            mqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(mqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.A0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f35668a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.A0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z4, boolean z10) {
        le1 le1Var;
        xe1 xe1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z4 && this.K0) {
            z4 = true;
        }
        this.K0 = false;
        TopicsController topicsController = this.f35701s;
        long j10 = this.f35668a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f35671b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            xe1 xe1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f35700r0) {
                arrayList.add(new bf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.f35709x0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f19236id))) {
                    arrayList.add(new bf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.S0) {
                arrayList.add(new bf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z10 && size2 > size) {
                this.H0.b(size + 4);
                z4 = false;
            }
            this.f35708x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                bf1 bf1Var = (bf1) arrayList.get(i11);
                if (bf1Var != null && (tL_forumTopic = bf1Var.f32951c) != null && tL_forumTopic.hidden) {
                    this.f35708x++;
                }
            }
            ve1 ve1Var = this.K;
            if (ve1Var != null) {
                f2.t0 itemAnimator = ve1Var.getItemAnimator();
                if (z4) {
                    xe1Var = this.F0;
                } else {
                    xe1Var = null;
                }
                if (itemAnimator != xe1Var) {
                    ve1 ve1Var2 = this.K;
                    if (z4) {
                        xe1Var2 = this.F0;
                    }
                    ve1Var2.setItemAnimator(xe1Var2);
                }
            }
            ze1 ze1Var = this.f35699r;
            if (ze1Var != null) {
                ze1Var.E(arrayList2, arrayList);
            }
            if ((this.f35712z0 || size == 0) && (le1Var = this.C) != null) {
                le1Var.h1(0, 0);
                this.f35712z0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f35668a;
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
        boolean z4;
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        SpannableStringBuilder spannableStringBuilder;
        float f10;
        float f11;
        oy oyVar = this.J0;
        if (oyVar != null && oyVar.T) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.Z0 = i10;
        oy oyVar2 = this.J0;
        if (oyVar2 != null && oyVar2.T) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f35670a1 = i11;
        qe1 qe1Var = new qe1(this, context);
        this.d = qe1Var;
        this.fragmentView = qe1Var;
        qe1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z4 = true;
        } else {
            z4 = false;
        }
        kVar.setOccupyStatusBar(z4);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ue1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final kf1 f34590b;

            {
                this.f34590b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        kf1 kf1Var = this.f34590b;
                        kf1Var.presentFragment(fe1.a0(kf1Var.f35668a, 0L));
                        return;
                    case 1:
                        kf1 kf1Var2 = this.f34590b;
                        kf1Var2.getMessagesController().hidePeerSettingsBar(-kf1Var2.f35668a, null, kf1Var2.g());
                        kf1Var2.O0(false);
                        return;
                    case 2:
                        kf1 kf1Var3 = this.f34590b;
                        if (!kf1Var3.f35697p0) {
                            kf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f34590b.finishPreviewFragment();
                        return;
                    default:
                        oy oyVar3 = this.f34590b.J0;
                        if (oyVar3 != null && (w0Var = oyVar3.f37035g0) != null) {
                            w0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.J0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.m0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final kf1 f34590b;

                {
                    this.f34590b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            kf1 kf1Var = this.f34590b;
                            kf1Var.presentFragment(fe1.a0(kf1Var.f35668a, 0L));
                            return;
                        case 1:
                            kf1 kf1Var2 = this.f34590b;
                            kf1Var2.getMessagesController().hidePeerSettingsBar(-kf1Var2.f35668a, null, kf1Var2.g());
                            kf1Var2.O0(false);
                            return;
                        case 2:
                            kf1 kf1Var3 = this.f34590b;
                            if (!kf1Var3.f35697p0) {
                                kf1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f34590b.finishPreviewFragment();
                            return;
                        default:
                            oy oyVar3 = this.f34590b.J0;
                            if (oyVar3 != null && (w0Var = oyVar3.f37035g0) != null) {
                                w0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.m0 = a10;
            a10.F();
            a10.E = new fb(this, 17);
            this.m0.setSearchPaddingStart(56);
            this.m0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.m0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Wd));
        }
        org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.ic_ab_other, null);
        this.f35695n0 = c3;
        c3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f35695n0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.O = this.f35695n0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.f35695n0;
        int i13 = R.raw.boosts;
        this.Q = w0Var.d(14, 0, new org.telegram.ui.Components.gj0(i13, AndroidUtilities.dp(24.0f), "" + R.raw.boosts, AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.f20660j0);
        this.N = this.f35695n0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.R = this.f35695n0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.P = this.f35695n0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.zn znVar = new org.telegram.ui.Components.zn(context, this, false, this.resourceProvider);
        this.f35681f = znVar;
        znVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.zn znVar2 = this.f35681f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        znVar2.setOccupyStatusBar(z10);
        org.telegram.ui.Components.zn znVar3 = this.f35681f;
        long j10 = -this.f35668a;
        if (j10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        znVar3.f31386b = z11;
        znVar3.setClipChildren(false);
        this.actionBar.addView(this.f35681f, 0, k7.b6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f35698q0) {
            this.f35681f.getAvatarImageView().setOnClickListener(new a8(this, 3));
        }
        this.K = new ve1(this, context);
        ug.i iVar = new ug.i(this.d);
        ViewGroup viewGroup = this.d;
        ng.a aVar = this.f35683f1;
        aVar.d = iVar;
        aVar.e = viewGroup;
        ve1 ve1Var = this.K;
        oy oyVar3 = this.J0;
        if (oyVar3 != null) {
            viewGroup = (ViewGroup) oyVar3.getFragmentView();
        }
        ve1 ve1Var2 = this.K;
        Objects.requireNonNull(ve1Var2);
        this.f35685g1 = new ng.k(ve1Var, viewGroup, new x8(ve1Var2, 2));
        this.K.C0(new he1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        ag.e c10 = ag.f.c(getParentActivity(), 0.85f, -1, false);
        c10.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
        vw vwVar = new vw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f35706w = vwVar;
        vwVar.b();
        if (this.B) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f35710y = i12;
        vw vwVar2 = this.f35706w;
        if (i12 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        vwVar2.X = z12;
        xe1 xe1Var = new xe1(this);
        this.K.setHideIfEmpty(false);
        xe1Var.f5818m = false;
        xe1Var.C = false;
        ve1 ve1Var3 = this.K;
        this.F0 = xe1Var;
        ve1Var3.setItemAnimator(xe1Var);
        this.K.setOnScrollListener(new me1(this, 1));
        ve1 ve1Var4 = this.K;
        ve1Var4.V1 = true;
        ve1Var4.W1 = 0;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(ve1Var4, true);
        this.H0 = zk0Var;
        this.K.setItemsEnterAnimator(zk0Var);
        this.K.setOnItemClickListener(new p21(this, 8));
        this.K.setOnItemLongClickListener(new ie1(this));
        this.K.setOnScrollListener(new me1(this, 2));
        ve1 ve1Var5 = this.K;
        le1 le1Var = new le1(this);
        this.C = le1Var;
        ve1Var5.setLayoutManager(le1Var);
        new SparseArray();
        new HashMap();
        this.K.setAdapter(this.f35699r);
        this.K.setClipToPadding(false);
        this.K.j(new me1(this, 0));
        jf1 jf1Var = new jf1(this);
        this.M = jf1Var;
        ne1 ne1Var = new ne1(this, jf1Var);
        this.L = ne1Var;
        ne1Var.d(this.K);
        this.d.addView(this.K, k7.b6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.K.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(getParentActivity(), this.resourceProvider, false);
        this.h = z10Var;
        this.d.addView(z10Var, org.telegram.ui.Components.z10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final kf1 f34590b;

            {
                this.f34590b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        kf1 kf1Var = this.f34590b;
                        kf1Var.presentFragment(fe1.a0(kf1Var.f35668a, 0L));
                        return;
                    case 1:
                        kf1 kf1Var2 = this.f34590b;
                        kf1Var2.getMessagesController().hidePeerSettingsBar(-kf1Var2.f35668a, null, kf1Var2.g());
                        kf1Var2.O0(false);
                        return;
                    case 2:
                        kf1 kf1Var3 = this.f34590b;
                        if (!kf1Var3.f35697p0) {
                            kf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f34590b.finishPreviewFragment();
                        return;
                    default:
                        oy oyVar32 = this.f34590b.J0;
                        if (oyVar32 != null && (w0Var2 = oyVar32.f37035g0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f31207c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f31207c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f31207c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(24);
        t00Var.setVisibility(8);
        t00Var.f28855w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f32575a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.mq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.mq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20281y6));
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            f10 = 72.0f;
        } else {
            f10 = 32.0f;
        }
        if (z13) {
            f11 = 32.0f;
        } else {
            f11 = 72.0f;
        }
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 81, f10, 0.0f, f11, 32.0f));
        this.f35694n = frameLayout;
        textView.setAlpha(0.0f);
        nh.y4 y4Var = new nh.y4(this, context, t00Var);
        this.A0 = y4Var;
        try {
            y4Var.f31455b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.A0.e(this.G0, this.fragmentBeginToShow);
        this.A0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f35694n.addView(t00Var);
        this.f35694n.addView(this.A0);
        this.d.addView(this.f35694n);
        this.K.setEmptyView(this.f35694n);
        this.f35693l0 = new a51(context, 6);
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(context);
        this.I = i61Var;
        this.f35693l0.addView(i61Var);
        this.d.addView(this.f35693l0, k7.b6.e(-1, 51, 80));
        this.I.setOnClickListener(new oe1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f35692k0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f35692k0.setVisibility(4);
        this.f35693l0.addView(this.f35692k0, k7.b6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.T0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.T0;
        int i14 = org.telegram.ui.ActionBar.j6.f19914de;
        imageView2.setBackground(org.telegram.ui.ActionBar.z5.c(null, org.telegram.ui.ActionBar.z5.b(getThemedColor(i14))));
        this.T0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
        this.T0.setScaleType(ImageView.ScaleType.CENTER);
        this.f35693l0.addView(this.T0, k7.b6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.T0.setOnClickListener(new View.OnClickListener(this) {
            public final kf1 f34590b;

            {
                this.f34590b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        kf1 kf1Var = this.f34590b;
                        kf1Var.presentFragment(fe1.a0(kf1Var.f35668a, 0L));
                        return;
                    case 1:
                        kf1 kf1Var2 = this.f34590b;
                        kf1Var2.getMessagesController().hidePeerSettingsBar(-kf1Var2.f35668a, null, kf1Var2.g());
                        kf1Var2.O0(false);
                        return;
                    case 2:
                        kf1 kf1Var3 = this.f34590b;
                        if (!kf1Var3.f35697p0) {
                            kf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f34590b.finishPreviewFragment();
                        return;
                    default:
                        oy oyVar32 = this.f34590b.J0;
                        if (oyVar32 != null && (w0Var2 = oyVar32.f37035g0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.T0.setVisibility(8);
        O0(false);
        l0 l0Var = new l0(this, context, 25);
        this.e = l0Var;
        if (this.J0 == null) {
            this.d.addView(l0Var, k7.b6.e(-1, -1, 119));
        }
        gf1 gf1Var = new gf1(this, context);
        this.f35696o0 = gf1Var;
        gf1Var.setVisibility(8);
        this.e.addView(this.f35696o0, k7.b6.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        gf1 gf1Var2 = this.f35696o0;
        int i15 = org.telegram.ui.ActionBar.j6.f19906d6;
        gf1Var2.setBackgroundColor(getThemedColor(i15));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f35668a, true, null, true, false, 0);
        org.telegram.ui.Components.js jsVar = new org.telegram.ui.Components.js(context);
        this.R0 = jsVar;
        jsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        pg.b c11 = aVar.c(this.R0, rg.b.m(this.resourceProvider), false);
        c11.p(AndroidUtilities.dp(24.0f));
        c11.o(AndroidUtilities.dp(7.0f));
        this.R0.setBlurredBackground(c11);
        this.R0.setOnAnimatedHeightChangedListener(new he1(this, 0));
        this.d.addView(this.R0, k7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            jh.e eVar = new jh.e(g10, this);
            this.O0 = eVar;
            this.R0.addView(eVar.c(), k7.b6.n(-1, 40));
            this.R0.h(3, this.O0.c());
            this.R0.g(this.O0.c());
            jh.e eVar2 = this.O0;
            eVar2.f9428m = new ie1(this);
            TLRPC.ChatFull chatFull = this.G;
            eVar2.f9425j = chatFull;
            if (chatFull != null) {
                eVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.C0 = frameLayout2;
            this.R0.addView(frameLayout2);
            this.R0.h(4, this.C0);
            this.R0.g(this.C0);
            this.R0.i(this.C0, true, false);
            z8 z8Var = new z8(this, context, this);
            this.D0 = z8Var;
            this.C0.addView(z8Var);
            this.R0.setCallFragmentContextView(this.D0);
        }
        FrameLayout.LayoutParams c12 = k7.b6.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c12.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c12);
        }
        y0();
        gw0 gw0Var = new gw0(this, context, 5);
        this.M0 = gw0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            gw0Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i15), 100)));
        }
        this.M0.setFocusable(false);
        this.M0.setImportantForAccessibility(2);
        this.M0.setOnClickListener(new View.OnClickListener(this) {
            public final kf1 f34590b;

            {
                this.f34590b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        kf1 kf1Var = this.f34590b;
                        kf1Var.presentFragment(fe1.a0(kf1Var.f35668a, 0L));
                        return;
                    case 1:
                        kf1 kf1Var2 = this.f34590b;
                        kf1Var2.getMessagesController().hidePeerSettingsBar(-kf1Var2.f35668a, null, kf1Var2.g());
                        kf1Var2.O0(false);
                        return;
                    case 2:
                        kf1 kf1Var3 = this.f34590b;
                        if (!kf1Var3.f35697p0) {
                            kf1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f34590b.finishPreviewFragment();
                        return;
                    default:
                        oy oyVar32 = this.f34590b.J0;
                        if (oyVar32 != null && (w0Var2 = oyVar32.f37035g0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.M0.setFitsSystemWindows(true);
        this.S = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) it.next();
                if (p2Var instanceof oy) {
                    oy oyVar4 = (oy) p2Var;
                    if (oyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = oyVar4.f37065m2;
                        if (topicKey.dialogId == j10) {
                            this.N0 = topicKey.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            U0(false, false);
        }
        O0(false);
        P0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j10, new vb(this, 5));
        }
        View view = this.fragmentView;
        ie1 ie1Var = new ie1(this);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(view, ie1Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f35668a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.G) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f19185id == j10) {
                O0(false);
                jh.e eVar = this.O0;
                if (eVar != null) {
                    eVar.f9425j = chatFull2;
                    eVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.U = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                U0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    y0();
                }
                A0();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == MessagesController.UPDATE_MASK_CHAT) {
                O0(false);
            }
            if ((intValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(j10, false);
                boolean canScrollVertically = this.K.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.C.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l10 = (Long) objArr[0];
            if (j10 == l10.longValue()) {
                this.E0 = getMessagesController().getGroupCall(l10.longValue(), false);
                z8 z8Var = this.D0;
                if (z8Var != null) {
                    z8Var.a(!this.fragmentBeginToShow);
                }
                z0(false);
            }
        } else if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            U0(false, false);
            O0(true);
        } else if (i10 != NotificationCenter.chatSwitchedForum && i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i10 == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j10) && !booleanValue) {
                if (this.N0 != longValue2) {
                    this.N0 = longValue2;
                    U0(false, false);
                }
            } else if (this.N0 != 0) {
                this.N0 = 0L;
                U0(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat g() {
        return getMessagesController().getChat(Long.valueOf(this.f35668a));
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.E0;
        if (call != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.sl0 sl0Var;
        cy0 cy0Var = new cy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        gf1 gf1Var = this.f35696o0;
        if (gf1Var != null && (sl0Var = gf1Var.R) != null) {
            org.telegram.ui.Cells.u3.a(arrayList, sl0Var);
        }
        return arrayList;
    }

    @Override
    public final TLRPC.User i() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i10;
        if (this.f35697p0) {
            i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20176s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20246w8);
        }
        if (i0.a.f(themedColor) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.zn o() {
        return this.f35681f;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (!this.X.isEmpty()) {
            if (z4) {
                C0();
                return false;
            }
        } else if (this.f35697p0) {
            if (z4) {
                this.actionBar.v(this.m0.L(false));
            }
        } else {
            return super.onBackPressed(z4);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.f35668a;
        messagesController.loadFullChat(j10, 0, true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.openedChatChanged);
        U0(false, false);
        q61.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f35667k1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j10));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.L0.unlock();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.openedChatChanged);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f35668a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        oy oyVar = this.J0;
        if (oyVar != null && oyVar.C3 != null) {
            oyVar.getActionBar().setSearchAvatarImageView(null);
            this.J0.C3.J = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f35668a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f35668a;
        topicsController.onTopicFragmentResume(j10);
        this.D = false;
        AndroidUtilities.updateVisibleRows(this.K);
        this.D = true;
        setBulletinDelegate(new a9(this, 9));
        if (this.inPreviewMode && !getMessagesController().isForum(-j10)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z4, float f10) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.Q0) {
            L0(f10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        jx jxVar;
        gw0 gw0Var;
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && (gw0Var = this.M0) != null) {
            if (gw0Var.getParent() != null) {
                ((ViewGroup) this.M0.getParent()).removeView(this.M0);
            }
            this.M0.setBackground(null);
        }
        if (z4) {
            z0(false);
        }
        this.L0.unlock();
        if (!z4) {
            if (this.f35698q0 && this.E) {
                removeSelfFromStack();
                oy oyVar = this.I0;
                if (oyVar != null) {
                    oyVar.removeSelfFromStack();
                }
            } else if (this.F) {
                removeSelfFromStack();
                oy oyVar2 = this.J0;
                if (oyVar2 != null && (jxVar = oyVar2.C3) != null && jxVar.c()) {
                    this.J0.C3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        gw0 gw0Var = this.M0;
        if (gw0Var != null && gw0Var.getVisibility() == 0) {
            if (z4) {
                this.M0.setAlpha(1.0f - f10);
            } else {
                this.M0.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        this.L0.lock();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z4, boolean z10) {
        if (!z4 && z10) {
            this.Q0 = true;
            K0(true);
            return;
        }
        this.Q0 = false;
        K0(false);
        L0(1.0f);
    }

    @Override
    public final void s() {
        this.K.x0(0);
    }

    @Override
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.zn znVar = this.f35681f;
        if (znVar != null) {
            znVar.setAlpha(f10);
            this.f35695n0.setAlpha(f10);
            org.telegram.ui.ActionBar.w0 w0Var = this.m0;
            if (w0Var != null) {
                w0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.zn znVar = this.f35681f;
        if (znVar != null) {
            znVar.setAlpha(f10);
            this.f35681f.setTranslationX((1.0f - f10) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void x0() {
        ng.e eVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f35676c1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.R0.c(AndroidUtilities.dp(14.0f)));
            oy oyVar = this.J0;
            if (oyVar != null) {
                view = oyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (oyVar != null) {
                kVar = oyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f35673b1) - AndroidUtilities.dp(8.0f);
            this.f35689i1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f35691j1;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.J0 != null) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.f35687h1);
            eVar.e(this.f35685g1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final sg.d y() {
        return this.f35680e1;
    }

    public final void y0() {
        le1 le1Var;
        TopicsController topicsController = this.f35701s;
        long j10 = this.f35668a;
        if (!topicsController.endIsReached(j10) && (le1Var = this.C) != null) {
            int N0 = le1Var.N0();
            if (this.f35671b.isEmpty() || N0 >= this.f35699r.h() - 5) {
                topicsController.loadTopics(j10);
            }
            A0();
        }
    }

    public final void z0(boolean z4) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f35668a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.E0;
        if (call != null && ((str = this.f35705v0) != null || this.f35707w0)) {
            org.telegram.ui.Components.voip.f2.m(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f35705v0 = null;
            this.f35707w0 = false;
        } else if (this.f35705v0 != null && z4 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            kh.a2.v(R.string.LinkHashExpired, org.telegram.ui.Components.qc.a0(this), R.raw.linkbroken, 36);
            this.f35705v0 = null;
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void j(int i10, int i11, boolean z4, int i12, boolean z10, int i13) {
    }
}
