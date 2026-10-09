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
public class fg1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.eh, eh0 {
    public static final HashSet f37555n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public ai.e7 D0;
    public boolean E;
    public tf1 E0;
    public hf1 F;
    public FrameLayout F0;
    public boolean G;
    public x8 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public sf1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.vl0 K0;
    public org.telegram.ui.Components.l71 L;
    public ty L0;
    public int M;
    public ty M0;
    public qf1 N;
    public boolean N0;
    public jf1 O;
    public final AnimationNotificationsLocker O0;
    public eg1 P;
    public q50 P0;
    public org.telegram.ui.ActionBar.f1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.f1 R;
    public wh.d R0;
    public org.telegram.ui.ActionBar.f1 S;
    public float S0;
    public org.telegram.ui.ActionBar.f1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.f1 U;
    public org.telegram.ui.Components.at U0;
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
    public final long f37556a;
    public final HashSet f37557a0;
    public org.telegram.ui.Components.n91 f37558a1;
    public final ArrayList f37559b;
    public boolean f37560b0;
    public View f37561b1;
    public int f37562c;
    public NumberTextView f37563c0;
    public int f37564c1;
    public mf1 d;
    public org.telegram.ui.ActionBar.v0 f37565d0;
    public int f37566d1;
    public k0 f37567e;
    public org.telegram.ui.ActionBar.v0 f37568e0;
    public int f37569e1;
    public org.telegram.ui.Components.uo f37570f;
    public org.telegram.ui.ActionBar.v0 f37571f0;
    public final ah.h f37572f1;
    public org.telegram.ui.ActionBar.v0 f37573g0;
    public final fh.d f37574g1;
    public org.telegram.ui.Components.p20 h;
    public org.telegram.ui.ActionBar.v0 f37575h0;
    public final fh.d f37576h1;
    public org.telegram.ui.ActionBar.v0 f37577i0;
    public final ah.c f37578i1;
    public org.telegram.ui.ActionBar.f1 f37579j0;
    public ah.n f37580j1;
    public org.telegram.ui.ActionBar.f1 f37581k0;
    public final ArrayList f37582k1;
    public org.telegram.ui.ActionBar.f1 f37583l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.v0 m0;
    public final RectF f37584m1;
    public vf1 f37585n;
    public RadialProgressView f37586n0;
    public w51 f37587o0;
    public org.telegram.ui.ActionBar.v0 f37588p0;
    public org.telegram.ui.ActionBar.v0 f37589q0;
    public final uf1 f37590r;
    public bg1 f37591r0;
    public final TopicsController f37592s;
    public boolean f37593s0;
    public final boolean f37594t0;
    public final boolean f37595u0;
    public gg1 v;
    public final boolean f37596v0;
    public zw f37597w;
    public final boolean f37598w0;
    public int f37599x;
    public final boolean f37600x0;
    public int f37601y;
    public String f37602y0;
    public boolean f37603z0;

    public fg1(Bundle bundle) {
        super(bundle);
        this.f37559b = new ArrayList();
        new ArrayList();
        this.f37590r = new uf1(this);
        this.f37599x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f37557a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f37582k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.f37584m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f37556a = j3;
        this.f37594t0 = this.arguments.getBoolean("for_select", false);
        this.f37595u0 = this.arguments.getBoolean("forward_to", false);
        this.f37600x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f37596v0 = this.arguments.getBoolean("quote", false);
        this.f37598w0 = this.arguments.getBoolean("reply_to", false);
        this.f37602y0 = this.arguments.getString("voicechat", null);
        this.f37603z0 = this.arguments.getBoolean("videochat", false);
        this.f37592s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.q.w("topics_end_reached_", j3, getUserConfig().getPreferences(), false);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f37572f1 = new ah.h(false);
            this.f37574g1 = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.f37576h1 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.f37578i1 = cVar2;
            cVar2.f547i = LiteMode.isEnabled(262144);
            return;
        }
        this.f37572f1 = null;
        this.f37574g1 = null;
        this.f37576h1 = null;
        this.f37578i1 = new ah.c(cVar);
    }

    public static org.telegram.ui.ActionBar.n2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j3);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new zn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j3, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new zn(bundle);
            }
        }
        return new fg1(bundle);
    }

    public static org.telegram.ui.ActionBar.n2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void I0(org.telegram.ui.zn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fg1.I0(org.telegram.ui.zn):void");
    }

    public static boolean U(fg1 fg1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(fg1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-fg1Var.f37556a), System.currentTimeMillis()).commit();
        Activity parentActivity = fg1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(fg1Var.g());
        int i10 = org.telegram.ui.Components.i90.f27290r;
        org.telegram.ui.Components.i90.y(parentActivity, fg1Var, org.telegram.ui.Components.ad.a0(fg1Var), isChannelAndNotMegaGroup);
        fg1Var.O0(true);
        return false;
    }

    public static void V(fg1 fg1Var, View view) {
        long j3;
        long j10 = fg1Var.f37556a;
        if (fg1Var.getParentLayout() != null && !((ActionBarLayout) fg1Var.getParentLayout()).y() && (view instanceof cg1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((cg1) view).N;
            long j11 = -j10;
            boolean isMonoForum = fg1Var.getMessagesController().isMonoForum(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (isMonoForum) {
                j3 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f20090id;
            }
            long j12 = j3;
            if (fg1Var.f37594t0) {
                gg1 gg1Var = fg1Var.v;
                if (gg1Var != null) {
                    ig1 ig1Var = gg1Var.f38015a;
                    Bundle bundle = new Bundle();
                    lg1 lg1Var = ig1Var.f38634a;
                    bundle.putLong("dialog_id", lg1Var.f39574c);
                    bundle.putLong("topic_id", tL_forumTopic.f20090id);
                    bundle.putBoolean("exception", true);
                    v11 v11Var = new v11(bundle, null);
                    v11Var.f42607r = new ls0(18, ig1Var, tL_forumTopic);
                    lg1Var.presentFragment(v11Var);
                }
                ty tyVar = fg1Var.L0;
                if (tyVar != null) {
                    tyVar.L3(j11, j12, true, fg1Var);
                }
            } else if (fg1Var.f37557a0.size() > 0) {
                fg1Var.N0(view);
            } else {
                if (fg1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.n2 n2Var : fg1Var.getParentLayout().getFragmentStack()) {
                        if (n2Var instanceof ty) {
                            ty tyVar2 = (ty) n2Var;
                            if (tyVar2.e4()) {
                                MessagesStorage.TopicKey topicKey = tyVar2.f42227p2;
                                if (topicKey.dialogId == j11 && topicKey.topicId == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    fg1Var.Q0 = j12;
                    fg1Var.U0(false, false);
                }
                ng.d.m(fg1Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(fg1 fg1Var, View view, float f7) {
        if (fg1Var.f37594t0 || fg1Var.getParentLayout() == null || ((ActionBarLayout) fg1Var.getParentLayout()).y()) {
            return false;
        }
        if (!fg1Var.actionBar.t() && !AndroidUtilities.isTablet() && (view instanceof cg1)) {
            cg1 cg1Var = (cg1) view;
            if (cg1Var.S(f7)) {
                fg1Var.M0(cg1Var);
                fg1Var.N.I0(true);
                fg1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        fg1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(fg1 fg1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = fg1Var.N;
            } else {
                bg1 bg1Var = fg1Var.f37591r0;
                if (bg1Var != null) {
                    viewGroup = bg1Var.U;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) childAt).v(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                        ((org.telegram.ui.Cells.xa) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = fg1Var.actionBar;
        if (kVar != null) {
            kVar.E(fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8), true);
            fg1Var.actionBar.F(fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false, true);
            fg1Var.actionBar.F(fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true, true);
            fg1Var.actionBar.G(fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5), true);
        }
        q50 q50Var = fg1Var.P0;
        if (q50Var != null) {
            q50Var.setForeground(new ColorDrawable(i0.a.k(fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6), 100)));
        }
        fg1Var.P0();
    }

    public static void b0(fg1 fg1Var, boolean z10) {
        float f7;
        boolean z11;
        nx nxVar;
        fg1Var.f37593s0 = z10;
        ValueAnimator valueAnimator = fg1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            fg1Var.Y0.cancel();
        }
        if (fg1Var.f37558a1 == null) {
            org.telegram.ui.Components.n91 n10 = fg1Var.f37591r0.n(8, false);
            fg1Var.f37558a1 = n10;
            if (fg1Var.M0 != null) {
                n10.setBackgroundColor(fg1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
            }
            fg1Var.f37567e.addView(fg1Var.f37558a1, w7.x5.d(44.0f, -1));
        }
        float f10 = fg1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        fg1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(fg1Var.f37591r0, false, 1.0f, true);
        ty tyVar = fg1Var.M0;
        if (tyVar != null && (nxVar = tyVar.F3) != null) {
            nxVar.M = !z10;
        }
        if (!z10 && fg1Var.f37591r0.getVisibility() == 0 && fg1Var.f37591r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        fg1Var.Z0 = z11;
        fg1Var.Y0.addUpdateListener(new y11(fg1Var, 17));
        fg1Var.f37591r0.setVisibility(0);
        if (!z10) {
            fg1Var.f37589q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(fg1Var.getParentActivity(), fg1Var.classGuid);
            fg1Var.Q0(false);
        }
        fg1Var.Y0.addListener(new of1(fg1Var, z10, 0));
        fg1Var.Y0.setDuration(200L);
        fg1Var.Y0.setInterpolator(org.telegram.ui.Components.hs.f27118f);
        fg1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        this.J0 = this.f37592s.isLoading(this.f37556a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f37559b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((wf1) arrayList.get(0)).f43568c != null && ((wf1) arrayList.get(0)).f43568c.f20090id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        qf1 qf1Var = this.N;
        if (qf1Var != null) {
            qf1Var.K0(qf1Var.v1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f7;
        float f10;
        ty tyVar = this.M0;
        float f11 = 0.0f;
        if (tyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.at atVar = tyVar.J1;
            if (atVar != null) {
                f7 = atVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.at atVar2 = this.U0;
            if (atVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.at atVar3 = this.M0.J1;
                if (atVar3 != null) {
                    f10 = atVar3.getMetadata().f16355c.f16365a;
                } else {
                    f10 = 0.0f;
                }
                atVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.at atVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.at atVar5 = this.M0.J1;
                if (atVar5 != null) {
                    f11 = atVar5.getMetadata().f16355c.f16365a;
                }
                f11 = atVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.at atVar6 = this.U0;
            if (atVar6 != null) {
                f11 = 0.0f + atVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f37569e1 + this.f37564c1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.f37557a0.clear();
        this.actionBar.s();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        b2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f37592s.findTopic(this.f37556a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a80(17));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21037q7));
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G0(boolean z10, boolean z11) {
        boolean z12 = true;
        this.h.e(!z10, (this.fragmentBeginToShow && z11) ? false : false);
    }

    public final void H0(boolean z10) {
        int i10;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f37556a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f37570f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f37570f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        profileActivity.N4(i10);
        presentFragment(profileActivity);
    }

    @Override
    public final long I() {
        return 0L;
    }

    public final void J0(int i10) {
        int i11;
        int i12;
        if (this.M != i10) {
            this.M = i10;
            org.telegram.ui.Components.l71 l71Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.i6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f21037q7;
            }
            l71Var.setTextColorKey(i11);
            ImageView imageView = this.W0;
            if (i10 == 1) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        mf1 mf1Var = this.d;
        if (mf1Var != null) {
            if (z10) {
                mf1Var.setLayerType(2, null);
                mf1Var.setClipChildren(false);
                mf1Var.setClipToPadding(false);
            } else {
                mf1Var.setLayerType(0, null);
                mf1Var.setClipChildren(true);
                mf1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            this.S0 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            qf1 qf1Var = this.N;
            if (qf1Var != null) {
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.S0, 0.05f, 1.0f);
                qf1Var.setPivotX(0.0f);
                qf1Var.setPivotY(0.0f);
                qf1Var.setScaleX(b10);
                qf1Var.setScaleY(b10);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(b10);
                this.actionBar.setScaleY(b10);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.s2 s2Var) {
        long j3;
        try {
            s2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = s2Var.N;
        org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new lf1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(fpVar.f26450f);
        fpVar.f26458o = 1;
        long j10 = this.f37556a;
        long j11 = -j10;
        fpVar.d(j11, tL_forumTopic.f20090id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                f1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                f1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            f1Var.setMinimumWidth(160);
            f1Var.setOnClickListener(new View.OnClickListener(this) {
                public final fg1 f37543b;

                {
                    this.f37543b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            fg1 fg1Var = this.f37543b;
                            fg1Var.C0 = true;
                            fg1Var.N0 = true;
                            TopicsController topicsController = fg1Var.f37592s;
                            long j12 = fg1Var.f37556a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f20090id, !tL_forumTopic2.pinned, fg1Var);
                            fg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            fg1 fg1Var2 = this.f37543b;
                            fg1Var2.N0 = true;
                            TopicsController topicsController2 = fg1Var2.f37592s;
                            long j13 = fg1Var2.f37556a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f20090id, true ^ tL_forumTopic3.closed);
                            fg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20090id));
                            fg1 fg1Var3 = this.f37543b;
                            fg1Var3.D0(hashSet, new df1(fg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(f1Var);
        }
        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.f20090id)) {
            f1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            f1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        f1Var2.setMinimumWidth(160);
        f1Var2.setOnClickListener(new ai.u7(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(f1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                f1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                f1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            f1Var3.setMinimumWidth(160);
            f1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final fg1 f37543b;

                {
                    this.f37543b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            fg1 fg1Var = this.f37543b;
                            fg1Var.C0 = true;
                            fg1Var.N0 = true;
                            TopicsController topicsController = fg1Var.f37592s;
                            long j12 = fg1Var.f37556a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f20090id, !tL_forumTopic2.pinned, fg1Var);
                            fg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            fg1 fg1Var2 = this.f37543b;
                            fg1Var2.N0 = true;
                            TopicsController topicsController2 = fg1Var2.f37592s;
                            long j13 = fg1Var2.f37556a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f20090id, true ^ tL_forumTopic3.closed);
                            fg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20090id));
                            fg1 fg1Var3 = this.f37543b;
                            fg1Var3.D0(hashSet, new df1(fg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(f1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, true);
            f1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            f1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21018p7));
            f1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21037q7));
            f1Var4.setMinimumWidth(160);
            f1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final fg1 f37543b;

                {
                    this.f37543b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            fg1 fg1Var = this.f37543b;
                            fg1Var.C0 = true;
                            fg1Var.N0 = true;
                            TopicsController topicsController = fg1Var.f37592s;
                            long j12 = fg1Var.f37556a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f20090id, !tL_forumTopic2.pinned, fg1Var);
                            fg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            fg1 fg1Var2 = this.f37543b;
                            fg1Var2.N0 = true;
                            TopicsController topicsController2 = fg1Var2.f37592s;
                            long j13 = fg1Var2.f37556a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f20090id, true ^ tL_forumTopic3.closed);
                            fg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f20090id));
                            fg1 fg1Var3 = this.f37543b;
                            fg1Var3.D0(hashSet, new df1(fg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(f1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j11);
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
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.x5.d(-1.0f, -1));
        }
        zn znVar = new zn(sc.v.f(j10, "chat_id"));
        if (isMonoForum) {
            j3 = DialogObject.getPeerDialogId(s2Var.N.from_id);
        } else {
            j3 = s2Var.N.f20090id;
        }
        ng.d.a(znVar, MessagesStorage.TopicKey.of(j11, j3));
        presentFragmentAsPreviewWithMenu(znVar, r32[0]);
    }

    public final void N0(View view) {
        cg1 cg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if ((view instanceof cg1) && (tL_forumTopic = (cg1Var = (cg1) view).N) != null) {
            int i20 = tL_forumTopic.f20090id;
            Integer valueOf = Integer.valueOf(i20);
            HashSet hashSet = this.f37557a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i20));
            }
            cg1Var.V(hashSet.contains(Integer.valueOf(i20)), true);
            MessagesController messagesController = getMessagesController();
            long j3 = this.f37556a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j10.setBackgroundColor(0);
                        j10.f21733a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j10.getContext());
                    this.f37563c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f37563c0.setTypeface(AndroidUtilities.bold());
                    this.f37563c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21183y8));
                    j10.addView(this.f37563c0, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
                    this.f37563c0.setOnTouchListener(new gf1(0));
                    this.f37565d0 = j10.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f37568e0 = j10.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f37571f0 = j10.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f37573g0 = j10.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.v0 h = j10.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f37575h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.v0 h10 = j10.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f37577i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.v0 h11 = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f37579j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f37581k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f37583l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.O(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f37592s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, intValue);
                    if (findTopic != null) {
                        if (findTopic.unread_count != 0) {
                            i21++;
                        }
                        if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                            if (findTopic.pinned) {
                                i24++;
                            } else {
                                i23++;
                            }
                        }
                    }
                    if (getMessagesController().isDialogMuted(-j3, intValue)) {
                        i22++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i21 > 0) {
                    this.f37579j0.setVisibility(0);
                    this.f37579j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    i10 = 8;
                } else {
                    i10 = 8;
                    this.f37579j0.setVisibility(8);
                }
                if (i22 != 0) {
                    this.B0 = false;
                    this.f37571f0.setIcon(R.drawable.msg_unmute);
                    this.f37571f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f37571f0.setIcon(R.drawable.msg_mute);
                    this.f37571f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.v0 v0Var = this.f37565d0;
                if (i23 == z10 && i24 == 0) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                v0Var.setVisibility(i11);
                org.telegram.ui.ActionBar.v0 v0Var2 = this.f37568e0;
                if (i24 == z10 && i23 == 0) {
                    i12 = 0;
                } else {
                    i12 = i10;
                }
                v0Var2.setVisibility(i12);
                this.f37563c0.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j3, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i27++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f20090id == 1) {
                                if (findTopic2.hidden) {
                                    i29++;
                                } else {
                                    i28++;
                                }
                            }
                            if (!findTopic2.hidden) {
                                if (findTopic2.closed) {
                                    i25++;
                                } else {
                                    i26++;
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.f1 f1Var = this.f37581k0;
                if (i25 == 0 && i26 > 0) {
                    i13 = 0;
                } else {
                    i13 = i10;
                }
                f1Var.setVisibility(i13);
                org.telegram.ui.ActionBar.f1 f1Var2 = this.f37581k0;
                if (i26 > 1) {
                    i14 = R.string.CloseTopics;
                } else {
                    i14 = R.string.CloseTopic;
                }
                f1Var2.setText(LocaleController.getString(i14));
                org.telegram.ui.ActionBar.f1 f1Var3 = this.f37583l0;
                if (i26 == 0 && i25 > 0) {
                    i15 = 0;
                } else {
                    i15 = i10;
                }
                f1Var3.setVisibility(i15);
                org.telegram.ui.ActionBar.f1 f1Var4 = this.f37583l0;
                if (i25 > 1) {
                    i16 = R.string.RestartTopics;
                } else {
                    i16 = R.string.RestartTopic;
                }
                f1Var4.setText(LocaleController.getString(i16));
                org.telegram.ui.ActionBar.v0 v0Var3 = this.f37573g0;
                if (i27 == hashSet3.size()) {
                    i17 = 0;
                } else {
                    i17 = i10;
                }
                v0Var3.setVisibility(i17);
                org.telegram.ui.ActionBar.v0 v0Var4 = this.f37575h0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = i10;
                }
                v0Var4.setVisibility(i18);
                org.telegram.ui.ActionBar.v0 v0Var5 = this.f37577i0;
                if (i29 == 1 && hashSet3.size() == 1) {
                    i19 = 0;
                } else {
                    i19 = i10;
                }
                v0Var5.setVisibility(i19);
                this.m0.l();
                R0();
                return;
            }
            this.actionBar.s();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fg1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f37586n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ae));
        this.h.g();
        w51 w51Var = this.f37587o0;
        int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        w51Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21075s8));
        }
        this.f37591r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.f37556a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j3))) && ChatObject.canCreateTopic(chat) && !this.f37593s0 && !this.f37594t0 && !this.J0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        org.telegram.ui.ActionBar.f1 f1Var = this.Q;
        if (!z11) {
            i10 = 8;
        }
        f1Var.setVisibility(i10);
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10;
        if (ChatObject.canManageTopics(g()) && !this.f37557a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37560b0 != z10) {
            this.f37560b0 = z10;
            uf1 uf1Var = this.f37590r;
            uf1Var.q(0, uf1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f21130v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21183y8;
        kVar.D(i0.a.d(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.D(i0.a.d(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.C(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.i6.f21094t8), getThemedColor(org.telegram.ui.ActionBar.i6.f21201z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.i6.f21075s8), getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6)));
        }
        float f10 = 1.0f - f7;
        this.f37570f.getTitleTextView().setAlpha(f10);
        this.f37570f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.n91 n91Var = this.f37558a1;
        if (n91Var != null) {
            n91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f37558a1.setAlpha(f7);
        }
        this.f37591r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f37591r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.f37567e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(y3);
            this.N.setScaleY(y3);
        }
    }

    public final void T0() {
        ai.e7 e7Var = this.D0;
        if (e7Var != null && e7Var.f24802e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.ic_ab_other, 0);
            erVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(erVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.f24802e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f37556a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.f24802e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        hf1 hf1Var;
        sf1 sf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f37592s;
        long j3 = this.f37556a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j3);
        if (topics != null) {
            ArrayList arrayList = this.f37559b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            sf1 sf1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j3) && this.f37595u0) {
                arrayList.add(new wf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f20090id))) {
                    arrayList.add(new wf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j3) && this.V0) {
                arrayList.add(new wf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f37599x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                wf1 wf1Var = (wf1) arrayList.get(i11);
                if (wf1Var != null && (tL_forumTopic = wf1Var.f43568c) != null && tL_forumTopic.hidden) {
                    this.f37599x++;
                }
            }
            qf1 qf1Var = this.N;
            if (qf1Var != null) {
                s4.n0 itemAnimator = qf1Var.getItemAnimator();
                if (z10) {
                    sf1Var = this.I0;
                } else {
                    sf1Var = null;
                }
                if (itemAnimator != sf1Var) {
                    qf1 qf1Var2 = this.N;
                    if (z10) {
                        sf1Var2 = this.I0;
                    }
                    qf1Var2.setItemAnimator(sf1Var2);
                }
            }
            uf1 uf1Var = this.f37590r;
            if (uf1Var != null) {
                uf1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (hf1Var = this.F) != null) {
                hf1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f37556a;
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
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
        ty tyVar = this.M0;
        if (tyVar != null && tyVar.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f37564c1 = i10;
        ty tyVar2 = this.M0;
        if (tyVar2 != null && tyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f37566d1 = i11;
        mf1 mf1Var = new mf1(this, context);
        this.d = mf1Var;
        this.fragmentView = mf1Var;
        mf1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        hg.c.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new pf1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final fg1 f36648b;

            {
                this.f36648b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        fg1 fg1Var = this.f36648b;
                        fg1Var.presentFragment(bf1.a0(fg1Var.f37556a, 0L));
                        return;
                    case 1:
                        fg1 fg1Var2 = this.f36648b;
                        fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f37556a, null, fg1Var2.g());
                        fg1Var2.O0(false);
                        return;
                    case 2:
                        fg1 fg1Var3 = this.f36648b;
                        if (!fg1Var3.f37593s0) {
                            fg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f36648b.finishPreviewFragment();
                        return;
                    default:
                        ty tyVar3 = this.f36648b.M0;
                        if (tyVar3 != null && (v0Var = tyVar3.f42198j0) != null) {
                            v0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z o9 = this.actionBar.o();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.v0 a2 = o9.a(0, R.drawable.outline_header_search);
            this.f37588p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final fg1 f36648b;

                {
                    this.f36648b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            fg1 fg1Var = this.f36648b;
                            fg1Var.presentFragment(bf1.a0(fg1Var.f37556a, 0L));
                            return;
                        case 1:
                            fg1 fg1Var2 = this.f36648b;
                            fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f37556a, null, fg1Var2.g());
                            fg1Var2.O0(false);
                            return;
                        case 2:
                            fg1 fg1Var3 = this.f36648b;
                            if (!fg1Var3.f37593s0) {
                                fg1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f36648b.finishPreviewFragment();
                            return;
                        default:
                            ty tyVar3 = this.f36648b.M0;
                            if (tyVar3 != null && (v0Var = tyVar3.f42198j0) != null) {
                                v0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.v0 a10 = o9.a(0, R.drawable.outline_header_search);
            this.f37588p0 = a10;
            a10.F();
            a10.H = new hg.e2(this, 18);
            this.f37588p0.setSearchPaddingStart(56);
            this.f37588p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f37588p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.i6.Wd));
        }
        org.telegram.ui.ActionBar.v0 c10 = o9.c(0, R.drawable.ic_ab_other, null);
        this.f37589q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f37589q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f37589q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.v0 v0Var = this.f37589q0;
        this.T = v0Var.d(14, 0, new org.telegram.ui.Components.ck0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, v0Var.m0);
        this.Q = this.f37589q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f37589q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f37589q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(context, this, false, this.resourceProvider);
        this.f37570f = uoVar;
        uoVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.uo uoVar2 = this.f37570f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        uoVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.uo uoVar3 = this.f37570f;
        long j3 = -this.f37556a;
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        uoVar3.f31556b = z12;
        uoVar3.setClipChildren(false);
        this.actionBar.addView(this.f37570f, 0, w7.x5.a(-1.0f, 56.0f, 0.0f, 86.0f, 0.0f, -2, 51));
        if (!this.f37594t0) {
            this.f37570f.getAvatarImageView().setOnClickListener(new x7(this, 3));
        }
        this.N = new qf1(this, context);
        hh.j jVar = new hh.j(this.d);
        ViewGroup viewGroup = this.d;
        ah.c cVar = this.f37578i1;
        cVar.f545f = jVar;
        cVar.f546g = viewGroup;
        qf1 qf1Var = this.N;
        ty tyVar3 = this.M0;
        if (tyVar3 != null) {
            viewGroup = (ViewGroup) tyVar3.getFragmentView();
        }
        qf1 qf1Var2 = this.N;
        Objects.requireNonNull(qf1Var2);
        this.f37580j1 = new ah.n(qf1Var, viewGroup, new u8(qf1Var2, 2));
        this.N.C0(new df1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        ng.c c11 = ng.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        zw zwVar = new zw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f37597w = zwVar;
        zwVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f37601y = i12;
        zw zwVar2 = this.f37597w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        zwVar2.X = z13;
        sf1 sf1Var = new sf1(this);
        this.N.setHideIfEmpty(false);
        sf1Var.f47696m = false;
        sf1Var.C = false;
        qf1 qf1Var3 = this.N;
        this.I0 = sf1Var;
        qf1Var3.setItemAnimator(sf1Var);
        this.N.setOnScrollListener(new if1(this, 1));
        qf1 qf1Var4 = this.N;
        qf1Var4.W1 = true;
        qf1Var4.X1 = 0;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(qf1Var4, true);
        this.K0 = vl0Var;
        this.N.setItemsEnterAnimator(vl0Var);
        this.N.setOnItemClickListener(new z21(this, 10));
        this.N.setOnItemLongClickListener(new ef1(this));
        this.N.setOnScrollListener(new if1(this, 2));
        qf1 qf1Var5 = this.N;
        hf1 hf1Var = new hf1(this);
        this.F = hf1Var;
        qf1Var5.setLayoutManager(hf1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f37590r);
        this.N.setClipToPadding(false);
        this.N.j(new if1(this, 0));
        eg1 eg1Var = new eg1(this);
        this.P = eg1Var;
        jf1 jf1Var = new jf1(this, eg1Var);
        this.O = jf1Var;
        jf1Var.e(this.N);
        this.d.addView(this.N, w7.x5.d(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(getParentActivity(), this.resourceProvider, false);
        this.h = p20Var;
        this.d.addView(p20Var, org.telegram.ui.Components.p20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final fg1 f36648b;

            {
                this.f36648b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (r2) {
                    case 0:
                        fg1 fg1Var = this.f36648b;
                        fg1Var.presentFragment(bf1.a0(fg1Var.f37556a, 0L));
                        return;
                    case 1:
                        fg1 fg1Var2 = this.f36648b;
                        fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f37556a, null, fg1Var2.g());
                        fg1Var2.O0(false);
                        return;
                    case 2:
                        fg1 fg1Var3 = this.f36648b;
                        if (!fg1Var3.f37593s0) {
                            fg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f36648b.finishPreviewFragment();
                        return;
                    default:
                        ty tyVar32 = this.f36648b.M0;
                        if (tyVar32 != null && (v0Var2 = tyVar32.f42198j0) != null) {
                            v0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f29695c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f29695c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f29695c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, null);
        j10Var.setViewType(24);
        j10Var.setVisibility(8);
        j10Var.f27555w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f42843a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.er(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.er(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21181y6));
        boolean z14 = LocaleController.isRTL;
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
        frameLayout.addView(textView, w7.x5.a(-2.0f, f7, 0.0f, f10, 32.0f, -2, 81));
        this.f37585n = frameLayout;
        textView.setAlpha(0.0f);
        ai.e7 e7Var = new ai.e7(this, context, j10Var);
        this.D0 = e7Var;
        try {
            e7Var.f24800b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f37585n.addView(j10Var);
        this.f37585n.addView(this.D0);
        this.d.addView(this.f37585n);
        this.N.setEmptyView(this.f37585n);
        this.f37587o0 = new w51(context, 6);
        org.telegram.ui.Components.l71 l71Var = new org.telegram.ui.Components.l71(context);
        this.L = l71Var;
        this.f37587o0.addView(l71Var);
        this.d.addView(this.f37587o0, w7.x5.e(-1, 51, 80));
        this.L.setOnClickListener(new kf1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37586n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f37586n0.setVisibility(4);
        this.f37587o0.addView(this.f37586n0, w7.x5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.i6.f20805de;
        imageView2.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(getThemedColor(i13))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f37587o0.addView(this.W0, w7.x5.a(36.0f, 0.0f, 6.0f, 2.0f, 0.0f, 36, 53));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final fg1 f36648b;

            {
                this.f36648b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (r2) {
                    case 0:
                        fg1 fg1Var = this.f36648b;
                        fg1Var.presentFragment(bf1.a0(fg1Var.f37556a, 0L));
                        return;
                    case 1:
                        fg1 fg1Var2 = this.f36648b;
                        fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f37556a, null, fg1Var2.g());
                        fg1Var2.O0(false);
                        return;
                    case 2:
                        fg1 fg1Var3 = this.f36648b;
                        if (!fg1Var3.f37593s0) {
                            fg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f36648b.finishPreviewFragment();
                        return;
                    default:
                        ty tyVar32 = this.f36648b.M0;
                        if (tyVar32 != null && (v0Var2 = tyVar32.f42198j0) != null) {
                            v0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        k0 k0Var = new k0(this, context, 25);
        this.f37567e = k0Var;
        if (this.M0 == null) {
            this.d.addView(k0Var, w7.x5.e(-1, -1, 119));
        }
        bg1 bg1Var = new bg1(this, context);
        this.f37591r0 = bg1Var;
        bg1Var.setVisibility(8);
        this.f37567e.addView(this.f37591r0, w7.x5.a(-1.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 119));
        bg1 bg1Var2 = this.f37591r0;
        int i14 = org.telegram.ui.ActionBar.i6.f20797d6;
        bg1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f37556a, true, null, true, false, 0);
        org.telegram.ui.Components.at atVar = new org.telegram.ui.Components.at(context);
        this.U0 = atVar;
        atVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        ch.d c12 = cVar.c(this.U0, eh.b.n(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new df1(this, 0));
        this.d.addView(this.U0, w7.x5.a(-2.0f, 0.0f, -14.0f, 0.0f, 0.0f, -1, 48));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            wh.d dVar = new wh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.x5.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            wh.d dVar2 = this.R0;
            dVar2.f50400m = new ef1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f50397j = chatFull;
            if (chatFull != null) {
                dVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.F0 = frameLayout2;
            this.U0.addView(frameLayout2);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            x8 x8Var = new x8(this, context, this);
            this.G0 = x8Var;
            this.F0.addView(x8Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams d = w7.x5.d(-2.0f, -1);
        if (this.inPreviewMode) {
            d.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, d);
        }
        y0();
        q50 q50Var = new q50(this, context, 10);
        this.P0 = q50Var;
        q50Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i14), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final fg1 f36648b;

            {
                this.f36648b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (r2) {
                    case 0:
                        fg1 fg1Var = this.f36648b;
                        fg1Var.presentFragment(bf1.a0(fg1Var.f37556a, 0L));
                        return;
                    case 1:
                        fg1 fg1Var2 = this.f36648b;
                        fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f37556a, null, fg1Var2.g());
                        fg1Var2.O0(false);
                        return;
                    case 2:
                        fg1 fg1Var3 = this.f36648b;
                        if (!fg1Var3.f37593s0) {
                            fg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f36648b.finishPreviewFragment();
                        return;
                    default:
                        ty tyVar32 = this.f36648b.M0;
                        if (tyVar32 != null && (v0Var2 = tyVar32.f42198j0) != null) {
                            v0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.P0.setFitsSystemWindows(true);
        this.V = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) it.next();
                if (n2Var instanceof ty) {
                    ty tyVar4 = (ty) n2Var;
                    if (tyVar4.e4()) {
                        MessagesStorage.TopicKey topicKey = tyVar4.f42227p2;
                        if (topicKey.dialogId == j3) {
                            this.Q0 = topicKey.topicId;
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
            getMessagesController().getBoostsController().getBoostsStats(j3, new t3(this, 26));
        }
        View view = this.fragmentView;
        ef1 ef1Var = new ef1(this);
        WeakHashMap weakHashMap = r0.i0.f46764a;
        r0.a0.i(view, ef1Var);
        return this.fragmentView;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j3 = this.f37556a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f20039id == j3) {
                O0(false);
                wh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f50397j = chatFull2;
                    dVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j3 == ((Long) objArr[0]).longValue()) {
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
                getMessagesController().getTopicsController().sortTopics(j3, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l4 = (Long) objArr[0];
            if (j3 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                x8 x8Var = this.G0;
                if (x8Var != null) {
                    x8Var.a(!this.fragmentBeginToShow);
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
            if (longValue == (-j3) && !booleanValue) {
                if (this.Q0 != longValue2) {
                    this.Q0 = longValue2;
                    U0(false, false);
                }
            } else if (this.Q0 != 0) {
                this.Q0 = 0L;
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
        return getMessagesController().getChat(Long.valueOf(this.f37556a));
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.H0;
        if (call != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.qm0 qm0Var;
        wy0 wy0Var = new wy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21075s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        bg1 bg1Var = this.f37591r0;
        if (bg1Var != null && (qm0Var = bg1Var.U) != null) {
            org.telegram.ui.Cells.v3.a(arrayList, qm0Var);
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
        if (this.f37593s0) {
            i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21075s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.t()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f21148w8);
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
    public final boolean m() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.uo o() {
        return this.f37570f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f37557a0.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f37593s0) {
            if (z10) {
                this.actionBar.w(this.f37588p0.L(false));
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
            kVar.h(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.f37556a;
        messagesController.loadFullChat(j3, 0, true);
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
        k71.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f37555n1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j3));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.O0.unlock();
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f37556a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        ty tyVar = this.M0;
        if (tyVar != null && tyVar.F3 != null) {
            tyVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.F3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f37556a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j3 = this.f37556a;
        topicsController.onTopicFragmentResume(j3);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new y8(this, 9));
        if (this.inPreviewMode && !getMessagesController().isForum(-j3)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.T0) {
            L0(f7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        nx nxVar;
        q50 q50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (q50Var = this.P0) != null) {
            if (q50Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (!z10) {
            if (this.f37594t0 && this.H) {
                removeSelfFromStack();
                ty tyVar = this.L0;
                if (tyVar != null) {
                    tyVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                ty tyVar2 = this.M0;
                if (tyVar2 != null && (nxVar = tyVar2.F3) != null && nxVar.c()) {
                    this.M0.F3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        q50 q50Var = this.P0;
        if (q50Var != null && q50Var.getVisibility() == 0) {
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
        this.O0.lock();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            K0(true);
            return;
        }
        this.T0 = false;
        K0(false);
        L0(1.0f);
    }

    @Override
    public final void s() {
        this.N.x0(0);
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.uo uoVar = this.f37570f;
        if (uoVar != null) {
            uoVar.setAlpha(f7);
            this.f37589q0.setAlpha(f7);
            org.telegram.ui.ActionBar.v0 v0Var = this.f37588p0;
            if (v0Var != null) {
                v0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.uo uoVar = this.f37570f;
        if (uoVar != null) {
            uoVar.setAlpha(f7);
            this.f37570f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void x0() {
        ah.h hVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f37572f1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            ty tyVar = this.M0;
            if (tyVar != null) {
                view = tyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (tyVar != null) {
                kVar = tyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f37569e1) - AndroidUtilities.dp(8.0f);
            this.l1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f37584m1;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.M0 != null) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            hVar.g(i10, this.f37582k1);
            hVar.e(this.f37580j1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final fh.d y() {
        return this.f37576h1;
    }

    public final void y0() {
        hf1 hf1Var;
        TopicsController topicsController = this.f37592s;
        long j3 = this.f37556a;
        if (!topicsController.endIsReached(j3) && (hf1Var = this.F) != null) {
            int N0 = hf1Var.N0();
            if (this.f37559b.isEmpty() || N0 >= this.f37590r.h() - 5) {
                topicsController.loadTopics(j3);
            }
            A0();
        }
    }

    @Override
    public final org.telegram.ui.Components.sw0 z() {
        return this.d;
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j3 = this.f37556a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f37602y0) != null || this.f37603z0)) {
            org.telegram.ui.Components.voip.f2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f37602y0 = null;
            this.f37603z0 = false;
        } else if (this.f37602y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.q.q(R.string.LinkHashExpired, org.telegram.ui.Components.ad.a0(this), R.raw.linkbroken, 36);
            this.f37602y0 = null;
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void F(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
    }
}
