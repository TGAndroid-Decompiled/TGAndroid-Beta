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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
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
public class af1 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.bh, og0 {
    public static final HashSet f37733q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public di.n5 D0;
    public boolean E;
    public oe1 E0;
    public ce1 F;
    public FrameLayout F0;
    public boolean G;
    public c9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public ne1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.ql0 K0;
    public org.telegram.ui.Components.t71 L;
    public cy L0;
    public int M;
    public cy M0;
    public le1 N;
    public boolean N0;
    public ee1 O;
    public final AnimationNotificationsLocker O0;
    public ze1 P;
    public z10 P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.g1 R;
    public yh.d R0;
    public org.telegram.ui.ActionBar.g1 S;
    public float S0;
    public org.telegram.ui.ActionBar.g1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.g1 U;
    public org.telegram.ui.Components.ws U0;
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
    public final long f37734a;
    public final HashSet f37735a0;
    public org.telegram.ui.Components.t91 f37736a1;
    public final ArrayList f37737b;
    public boolean f37738b0;
    public boolean f37739b1;
    public int f37740c;
    public NumberTextView f37741c0;
    public View f37742c1;
    public he1 d;
    public org.telegram.ui.ActionBar.w0 f37743d0;
    public int f37744d1;
    public k0 e;
    public org.telegram.ui.ActionBar.w0 f37745e0;
    public int f37746e1;
    public org.telegram.ui.Components.po f37747f;
    public org.telegram.ui.ActionBar.w0 f37748f0;
    public int f37749f1;
    public org.telegram.ui.ActionBar.w0 f37750g0;
    public final ch.f f37751g1;
    public org.telegram.ui.Components.j20 h;
    public org.telegram.ui.ActionBar.w0 f37752h0;
    public final hh.d f37753h1;
    public org.telegram.ui.ActionBar.w0 f37754i0;
    public final hh.d f37755i1;
    public org.telegram.ui.ActionBar.g1 f37756j0;
    public final hh.c f37757j1;
    public org.telegram.ui.ActionBar.g1 f37758k0;
    public final ch.b f37759k1;
    public org.telegram.ui.ActionBar.g1 f37760l0;
    public ch.j l1;
    public org.telegram.ui.ActionBar.w0 m0;
    public final ArrayList f37761m1;
    public qe1 f37762n;
    public RadialProgressView f37763n0;
    public final RectF f37764n1;
    public o41 f37765o0;
    public final RectF f37766o1;
    public org.telegram.ui.ActionBar.w0 f37767p0;
    public int f37768p1;
    public org.telegram.ui.ActionBar.w0 f37769q0;
    public final pe1 f37770r;
    public we1 f37771r0;
    public final TopicsController f37772s;
    public boolean f37773s0;
    public final boolean f37774t0;
    public final boolean f37775u0;
    public bf1 v;
    public final boolean f37776v0;
    public fw f37777w;
    public final boolean f37778w0;
    public int f37779x;
    public final boolean f37780x0;
    public int f37781y;
    public String f37782y0;
    public boolean f37783z0;

    public af1(Bundle bundle) {
        super(bundle);
        this.f37737b = new ArrayList();
        new ArrayList();
        this.f37770r = new pe1(this);
        this.f37779x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f37735a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f37761m1 = arrayList;
        RectF rectF = new RectF();
        this.f37764n1 = rectF;
        RectF rectF2 = new RectF();
        this.f37766o1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f37734a = j10;
        this.f37774t0 = this.arguments.getBoolean("for_select", false);
        this.f37775u0 = this.arguments.getBoolean("forward_to", false);
        this.f37780x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f37776v0 = this.arguments.getBoolean("quote", false);
        this.f37778w0 = this.arguments.getBoolean("reply_to", false);
        this.f37782y0 = this.arguments.getString("voicechat", null);
        this.f37783z0 = this.arguments.getBoolean("videochat", false);
        this.f37772s = getMessagesController().getTopicsController();
        this.V0 = !org.telegram.messenger.t.x("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        hh.c cVar = new hh.c();
        this.f37757j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f37751g1 = new ch.f();
            this.f37753h1 = new hh.d(null);
            hh.d dVar = new hh.d(null);
            this.f37755i1 = dVar;
            ch.b bVar = new ch.b(dVar);
            this.f37759k1 = bVar;
            bVar.f6303i = LiteMode.isEnabled(262144);
            return;
        }
        this.f37751g1 = null;
        this.f37753h1 = null;
        this.f37755i1 = null;
        this.f37759k1 = new ch.b(cVar);
    }

    public static org.telegram.ui.ActionBar.r2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new un(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new un(bundle);
            }
        }
        return new af1(bundle);
    }

    public static org.telegram.ui.ActionBar.r2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void I0(org.telegram.ui.un r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.af1.I0(org.telegram.ui.un):void");
    }

    public static boolean V(af1 af1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(af1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-af1Var.f37734a), System.currentTimeMillis()).commit();
        Activity parentActivity = af1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(af1Var.g());
        int i10 = org.telegram.ui.Components.c90.f27097s;
        org.telegram.ui.Components.c90.w(parentActivity, af1Var, org.telegram.ui.Components.wc.b0(af1Var), isChannelAndNotMegaGroup);
        af1Var.O0(true);
        return false;
    }

    public static void W(af1 af1Var, View view) {
        long j10;
        long j11 = af1Var.f37734a;
        if (af1Var.getParentLayout() != null && !((ActionBarLayout) af1Var.getParentLayout()).x() && (view instanceof xe1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((xe1) view).N;
            long j12 = -j11;
            boolean isMonoForum = af1Var.getMessagesController().isMonoForum(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (isMonoForum) {
                j10 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f22079id;
            }
            long j13 = j10;
            if (af1Var.f37774t0) {
                bf1 bf1Var = af1Var.v;
                if (bf1Var != null) {
                    df1 df1Var = bf1Var.f38085a;
                    Bundle bundle = new Bundle();
                    gf1 gf1Var = df1Var.f38858a;
                    bundle.putLong("dialog_id", gf1Var.f39646c);
                    bundle.putLong("topic_id", tL_forumTopic.f22079id);
                    bundle.putBoolean("exception", true);
                    h11 h11Var = new h11(bundle, null);
                    h11Var.f39861s = new af0(28, df1Var, tL_forumTopic);
                    gf1Var.presentFragment(h11Var);
                }
                cy cyVar = af1Var.L0;
                if (cyVar != null) {
                    cyVar.W3(j12, j13, true, af1Var);
                }
            } else if (af1Var.f37735a0.size() > 0) {
                af1Var.N0(view);
            } else {
                if (af1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.r2 r2Var : af1Var.getParentLayout().getFragmentStack()) {
                        if (r2Var instanceof cy) {
                            cy cyVar2 = (cy) r2Var;
                            if (cyVar2.p4()) {
                                MessagesStorage.TopicKey topicKey = cyVar2.f38642p2;
                                if (topicKey.dialogId == j12 && topicKey.topicId == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    af1Var.Q0 = j13;
                    af1Var.V0(false, false);
                }
                pg.d.m(af1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean X(af1 af1Var, View view, float f7) {
        if (af1Var.f37774t0 || af1Var.getParentLayout() == null || ((ActionBarLayout) af1Var.getParentLayout()).x()) {
            return false;
        }
        if (!af1Var.actionBar.q() && !AndroidUtilities.isTablet() && (view instanceof xe1)) {
            xe1 xe1Var = (xe1) view;
            if (xe1Var.R(f7)) {
                af1Var.M0(xe1Var);
                af1Var.N.I0(true);
                af1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        af1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void b0(af1 af1Var, boolean z10) {
        float f7;
        boolean z11;
        tw twVar;
        af1Var.f37773s0 = z10;
        ValueAnimator valueAnimator = af1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            af1Var.Y0.cancel();
        }
        if (af1Var.f37736a1 == null) {
            org.telegram.ui.Components.t91 n10 = af1Var.f37771r0.n(8, false);
            af1Var.f37736a1 = n10;
            if (af1Var.M0 != null) {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, n10, af1Var.getResourceProvider());
            }
            af1Var.e.addView(af1Var.f37736a1, org.telegram.ui.Components.gb1.g(44.0f, -1));
        }
        float f10 = af1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        af1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(af1Var.f37771r0, false, 1.0f, true);
        cy cyVar = af1Var.M0;
        if (cyVar != null && (twVar = cyVar.G3) != null) {
            twVar.M = !z10;
        }
        if (!z10 && af1Var.f37771r0.getVisibility() == 0 && af1Var.f37771r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        af1Var.Z0 = z11;
        af1Var.Y0.addUpdateListener(new v11(af1Var, 14));
        af1Var.f37771r0.setVisibility(0);
        if (!z10) {
            af1Var.f37769q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(af1Var.getParentActivity(), af1Var.classGuid);
            af1Var.Q0(false);
        }
        af1Var.Y0.addListener(new je1(af1Var, z10, 0));
        af1Var.Y0.setDuration(200L);
        af1Var.Y0.setInterpolator(org.telegram.ui.Components.ds.f27586f);
        af1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override
    public final org.telegram.ui.Components.vw0 A() {
        return this.d;
    }

    public final void A0() {
        this.J0 = this.f37772s.isLoading(this.f37734a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f37737b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((re1) arrayList.get(0)).f43135c != null && ((re1) arrayList.get(0)).f43135c.f22079id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        le1 le1Var = this.N;
        if (le1Var != null) {
            le1Var.K0(le1Var.z1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f7;
        float f10;
        cy cyVar = this.M0;
        float f11 = 0.0f;
        if (cyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.ws wsVar = cyVar.J1;
            if (wsVar != null) {
                f7 = wsVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.ws wsVar2 = this.U0;
            if (wsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ws wsVar3 = this.M0.J1;
                if (wsVar3 != null) {
                    f10 = wsVar3.getMetadata().f19343c.f19351a;
                } else {
                    f10 = 0.0f;
                }
                wsVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.ws wsVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ws wsVar5 = this.M0.J1;
                if (wsVar5 != null) {
                    f11 = wsVar5.getMetadata().f19343c.f19351a;
                }
                f11 = wsVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.ws wsVar6 = this.U0;
            if (wsVar6 != null) {
                f11 = 0.0f + wsVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f37749f1 + this.f37744d1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.f37735a0.clear();
        this.actionBar.p();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        e2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            e2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f37772s.findTopic(this.f37734a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            e2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(26));
        e2Var.show();
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, getResourceProvider());
        }
    }

    public final void G0(boolean z10, boolean z11) {
        boolean z12 = true;
        this.h.e(!z10, (this.fragmentBeginToShow && z11) ? false : false);
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void H0(boolean z10) {
        int i10;
        TLRPC.Chat g7;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g7 = g()) != null && ((chatPhoto = g7.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f37734a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f37747f.getSharedMediaPreloader());
        profileActivity.T4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f37747f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        profileActivity.X4(i10);
        presentFragment(profileActivity);
    }

    @Override
    public final long J() {
        return 0L;
    }

    public final void J0(int i10) {
        int i11;
        int i12;
        if (this.M != i10) {
            this.M = i10;
            org.telegram.ui.Components.t71 t71Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.y6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.f23598q7;
            }
            t71Var.setTextColorKey(i11);
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
        he1 he1Var = this.d;
        if (he1Var != null) {
            if (z10) {
                he1Var.setLayerType(2, null);
                he1Var.setClipChildren(false);
                he1Var.setClipToPadding(false);
            } else {
                he1Var.setLayerType(0, null);
                he1Var.setClipChildren(true);
                he1Var.setClipToPadding(true);
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
            le1 le1Var = this.N;
            if (le1Var != null) {
                float d = ic.a.d(1.0f, this.S0, 0.05f, 1.0f);
                le1Var.setPivotX(0.0f);
                le1Var.setPivotY(0.0f);
                le1Var.setScaleX(d);
                le1Var.setScaleY(d);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(d);
                this.actionBar.setScaleY(d);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.p2 p2Var) {
        long j10;
        try {
            p2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = p2Var.N;
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new ge1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(bpVar.f26927f);
        bpVar.f26935o = 1;
        long j11 = this.f37734a;
        long j12 = -j11;
        bpVar.e(j12, tL_forumTopic.f22079id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.j(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.j(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final af1 f37725b;

                {
                    this.f37725b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            af1 af1Var = this.f37725b;
                            af1Var.C0 = true;
                            af1Var.N0 = true;
                            TopicsController topicsController = af1Var.f37772s;
                            long j13 = af1Var.f37734a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f22079id, !tL_forumTopic2.pinned, af1Var);
                            af1Var.finishPreviewFragment();
                            return;
                        case 1:
                            af1 af1Var2 = this.f37725b;
                            af1Var2.N0 = true;
                            TopicsController topicsController2 = af1Var2.f37772s;
                            long j14 = af1Var2.f37734a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f22079id, true ^ tL_forumTopic3.closed);
                            af1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22079id));
                            af1 af1Var3 = this.f37725b;
                            af1Var3.D0(hashSet, new yd1(af1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j12, tL_forumTopic.f22079id)) {
            g1Var2.j(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.j(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new di.c6(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(g1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                g1Var3.j(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                g1Var3.j(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            g1Var3.setMinimumWidth(160);
            g1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final af1 f37725b;

                {
                    this.f37725b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            af1 af1Var = this.f37725b;
                            af1Var.C0 = true;
                            af1Var.N0 = true;
                            TopicsController topicsController = af1Var.f37772s;
                            long j13 = af1Var.f37734a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f22079id, !tL_forumTopic2.pinned, af1Var);
                            af1Var.finishPreviewFragment();
                            return;
                        case 1:
                            af1 af1Var2 = this.f37725b;
                            af1Var2.N0 = true;
                            TopicsController topicsController2 = af1Var2.f37772s;
                            long j14 = af1Var2.f37734a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f22079id, true ^ tL_forumTopic3.closed);
                            af1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22079id));
                            af1 af1Var3 = this.f37725b;
                            af1Var3.D0(hashSet, new yd1(af1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.j(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.c(org.telegram.ui.ActionBar.y6.f23598q7, org.telegram.ui.ActionBar.y6.f23581p7);
            g1Var4.setMinimumWidth(160);
            g1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final af1 f37725b;

                {
                    this.f37725b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            af1 af1Var = this.f37725b;
                            af1Var.C0 = true;
                            af1Var.N0 = true;
                            TopicsController topicsController = af1Var.f37772s;
                            long j13 = af1Var.f37734a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f22079id, !tL_forumTopic2.pinned, af1Var);
                            af1Var.finishPreviewFragment();
                            return;
                        case 1:
                            af1 af1Var2 = this.f37725b;
                            af1Var2.N0 = true;
                            TopicsController topicsController2 = af1Var2.f37772s;
                            long j14 = af1Var2.f37734a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f22079id, true ^ tL_forumTopic3.closed);
                            af1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f22079id));
                            af1 af1Var3 = this.f37725b;
                            af1Var3.D0(hashSet, new yd1(af1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j12);
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
            this.parentLayout.getOverlayContainerView().addView(this.P0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        }
        un unVar = new un(a1.g.h(j11, "chat_id"));
        if (isMonoForum) {
            j10 = DialogObject.getPeerDialogId(p2Var.N.from_id);
        } else {
            j10 = p2Var.N.f22079id;
        }
        pg.d.a(unVar, MessagesStorage.TopicKey.of(j12, j10));
        presentFragmentAsPreviewWithMenu(unVar, r32[0]);
    }

    public final void N0(View view) {
        xe1 xe1Var;
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
        if ((view instanceof xe1) && (tL_forumTopic = (xe1Var = (xe1) view).N) != null) {
            int i20 = tL_forumTopic.f22079id;
            Integer valueOf = Integer.valueOf(i20);
            HashSet hashSet = this.f37735a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i20));
            }
            xe1Var.U(hashSet.contains(Integer.valueOf(i20)), true);
            MessagesController messagesController = getMessagesController();
            long j10 = this.f37734a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.z i21 = this.actionBar.i(null);
                    if (this.inPreviewMode) {
                        i21.setBackgroundColor(0);
                        i21.f23777a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(i21.getContext());
                    this.f37741c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f37741c0.setTypeface(AndroidUtilities.bold());
                    this.f37741c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23750y8));
                    i21.addView(this.f37741c0, org.telegram.ui.Components.gb1.q(1.0f, 0, -1, 72, 0, 0));
                    this.f37741c0.setOnTouchListener(new be1(0));
                    this.f37743d0 = i21.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f37745e0 = i21.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f37748f0 = i21.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f37750g0 = i21.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.w0 h = i21.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f37752h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h10 = i21.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f37754i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h11 = i21.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f37756j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f37758k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f37760l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.K(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f37772s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, intValue);
                    if (findTopic != null) {
                        if (findTopic.unread_count != 0) {
                            i22++;
                        }
                        if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                            if (findTopic.pinned) {
                                i25++;
                            } else {
                                i24++;
                            }
                        }
                    }
                    if (getMessagesController().isDialogMuted(-j10, intValue)) {
                        i23++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i22 > 0) {
                    this.f37756j0.setVisibility(0);
                    this.f37756j0.j(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    i10 = 8;
                } else {
                    i10 = 8;
                    this.f37756j0.setVisibility(8);
                }
                if (i23 != 0) {
                    this.B0 = false;
                    this.f37748f0.setIcon(R.drawable.msg_unmute);
                    this.f37748f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f37748f0.setIcon(R.drawable.msg_mute);
                    this.f37748f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.w0 w0Var = this.f37743d0;
                if (i24 == z10 && i25 == 0) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                w0Var.setVisibility(i11);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f37745e0;
                if (i25 == z10 && i24 == 0) {
                    i12 = 0;
                } else {
                    i12 = i10;
                }
                w0Var2.setVisibility(i12);
                this.f37741c0.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i28++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f22079id == 1) {
                                if (findTopic2.hidden) {
                                    i30++;
                                } else {
                                    i29++;
                                }
                            }
                            if (!findTopic2.hidden) {
                                if (findTopic2.closed) {
                                    i26++;
                                } else {
                                    i27++;
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.f37758k0;
                if (i26 == 0 && i27 > 0) {
                    i13 = 0;
                } else {
                    i13 = i10;
                }
                g1Var.setVisibility(i13);
                org.telegram.ui.ActionBar.g1 g1Var2 = this.f37758k0;
                if (i27 > 1) {
                    i14 = R.string.CloseTopics;
                } else {
                    i14 = R.string.CloseTopic;
                }
                g1Var2.setText(LocaleController.getString(i14));
                org.telegram.ui.ActionBar.g1 g1Var3 = this.f37760l0;
                if (i27 == 0 && i26 > 0) {
                    i15 = 0;
                } else {
                    i15 = i10;
                }
                g1Var3.setVisibility(i15);
                org.telegram.ui.ActionBar.g1 g1Var4 = this.f37760l0;
                if (i26 > 1) {
                    i16 = R.string.RestartTopics;
                } else {
                    i16 = R.string.RestartTopic;
                }
                g1Var4.setText(LocaleController.getString(i16));
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f37750g0;
                if (i28 == hashSet3.size()) {
                    i17 = 0;
                } else {
                    i17 = i10;
                }
                w0Var3.setVisibility(i17);
                org.telegram.ui.ActionBar.w0 w0Var4 = this.f37752h0;
                if (i29 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = i10;
                }
                w0Var4.setVisibility(i18);
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f37754i0;
                if (i30 == 1 && hashSet3.size() == 1) {
                    i19 = 0;
                } else {
                    i19 = i10;
                }
                w0Var5.setVisibility(i19);
                this.m0.l();
                R0();
                return;
            }
            this.actionBar.p();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.af1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f37763n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.Ae));
        this.h.updateColors();
        o41 o41Var = this.f37765o0;
        int i10 = org.telegram.ui.ActionBar.y6.f23356d6;
        o41Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23636s8));
        }
        this.f37771r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f37734a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) && ChatObject.canCreateTopic(chat) && !this.f37773s0 && !this.f37774t0 && !this.J0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        org.telegram.ui.ActionBar.g1 g1Var = this.Q;
        if (!z11) {
            i10 = 8;
        }
        g1Var.setVisibility(i10);
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10;
        if (ChatObject.canManageTopics(g()) && !this.f37735a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37738b0 != z10) {
            this.f37738b0 = z10;
            pe1 pe1Var = this.f37770r;
            pe1Var.q(0, pe1Var.h());
        }
    }

    public final void S0(float f7) {
        this.W = f7;
        T0();
        this.f37739b1 = true;
        float f10 = 1.0f - f7;
        this.f37747f.getTitleTextView().setAlpha(f10);
        this.f37747f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.t91 t91Var = this.f37736a1;
        if (t91Var != null) {
            t91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f37736a1.setAlpha(f7);
        }
        this.f37771r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f37771r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float z10 = c3.h0.z(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(z10);
            this.N.setScaleY(z10);
        }
    }

    @Override
    public final boolean T(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void T0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23694v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.f23750y8;
        kVar.y(i0.a.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.y(i0.a.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.x(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.y6.f23656t8), getThemedColor(org.telegram.ui.ActionBar.y6.f23769z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.y6.f23636s8), getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6)));
        }
    }

    public final void U0() {
        di.n5 n5Var = this.D0;
        if (n5Var != null && n5Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.ic_ab_other, 0);
            zqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(zqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f37734a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void V0(boolean z10, boolean z11) {
        ce1 ce1Var;
        ne1 ne1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f37772s;
        long j10 = this.f37734a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f37737b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            ne1 ne1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f37775u0) {
                arrayList.add(new re1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f22079id))) {
                    arrayList.add(new re1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.V0) {
                arrayList.add(new re1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f37779x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                re1 re1Var = (re1) arrayList.get(i11);
                if (re1Var != null && (tL_forumTopic = re1Var.f43135c) != null && tL_forumTopic.hidden) {
                    this.f37779x++;
                }
            }
            le1 le1Var = this.N;
            if (le1Var != null) {
                s4.m0 itemAnimator = le1Var.getItemAnimator();
                if (z10) {
                    ne1Var = this.I0;
                } else {
                    ne1Var = null;
                }
                if (itemAnimator != ne1Var) {
                    le1 le1Var2 = this.N;
                    if (z10) {
                        ne1Var2 = this.I0;
                    }
                    le1Var2.setItemAnimator(ne1Var2);
                }
            }
            pe1 pe1Var = this.f37770r;
            if (pe1Var != null) {
                pe1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (ce1Var = this.F) != null) {
                ce1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        U0();
    }

    @Override
    public final long a() {
        return -this.f37734a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
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
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        cy cyVar = this.M0;
        if (cyVar != null && cyVar.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f37744d1 = i10;
        cy cyVar2 = this.M0;
        if (cyVar2 != null && cyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f37746e1 = i11;
        he1 he1Var = new he1(this, context);
        this.d = he1Var;
        this.fragmentView = he1Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, he1Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if ((!AndroidUtilities.isTablet() || ((j5Var2 = this.parentLayout) != null && ((ActionBarLayout) j5Var2).f22306b)) && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.actionBar.setActionBarMenuOnItemClick(new ke1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final af1 f45743b;

            {
                this.f45743b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        af1 af1Var = this.f45743b;
                        if (!af1Var.f37773s0) {
                            af1Var.H0(false);
                            return;
                        }
                        return;
                    case 1:
                        af1 af1Var2 = this.f45743b;
                        af1Var2.getMessagesController().hidePeerSettingsBar(-af1Var2.f37734a, null, af1Var2.g());
                        af1Var2.O0(false);
                        return;
                    case 2:
                        this.f45743b.finishPreviewFragment();
                        return;
                    case 3:
                        cy cyVar3 = this.f45743b.M0;
                        if (cyVar3 != null && (w0Var = cyVar3.f38612j0) != null) {
                            w0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        af1 af1Var3 = this.f45743b;
                        af1Var3.presentFragment(wd1.b0(af1Var3.f37734a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = l4.a(0, R.drawable.outline_header_search);
            this.f37767p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final af1 f45743b;

                {
                    this.f45743b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            af1 af1Var = this.f45743b;
                            if (!af1Var.f37773s0) {
                                af1Var.H0(false);
                                return;
                            }
                            return;
                        case 1:
                            af1 af1Var2 = this.f45743b;
                            af1Var2.getMessagesController().hidePeerSettingsBar(-af1Var2.f37734a, null, af1Var2.g());
                            af1Var2.O0(false);
                            return;
                        case 2:
                            this.f45743b.finishPreviewFragment();
                            return;
                        case 3:
                            cy cyVar3 = this.f45743b.M0;
                            if (cyVar3 != null && (w0Var = cyVar3.f38612j0) != null) {
                                w0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            af1 af1Var3 = this.f45743b;
                            af1Var3.presentFragment(wd1.b0(af1Var3.f37734a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a10 = l4.a(0, R.drawable.outline_header_search);
            this.f37767p0 = a10;
            a10.N();
            a10.J(new jg.e2(this, 20));
            this.f37767p0.setSearchPaddingStart(56);
            this.f37767p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f37767p0.getSearchField();
            org.telegram.ui.ActionBar.f7.V(searchField, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Si, getResourceProvider());
            org.telegram.ui.ActionBar.f7.w(searchField, org.telegram.ui.ActionBar.y6.Wd, getResourceProvider());
        }
        org.telegram.ui.ActionBar.w0 c10 = l4.c(0, R.drawable.ic_ab_other, null);
        this.f37769q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f37769q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f37769q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.f37769q0;
        this.T = w0Var.d(14, 0, new org.telegram.ui.Components.xj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.m0);
        this.Q = this.f37769q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f37769q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f37769q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(context, this, false, this.resourceProvider);
        this.f37747f = poVar;
        poVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.po poVar2 = this.f37747f;
        if ((!AndroidUtilities.isTablet() || ((j5Var = this.parentLayout) != null && ((ActionBarLayout) j5Var).f22306b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        poVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.po poVar3 = this.f37747f;
        long j10 = -this.f37734a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        poVar3.f31641b = z12;
        poVar3.setClipChildren(false);
        this.actionBar.addView(this.f37747f, 0, org.telegram.ui.Components.gb1.h(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f37774t0) {
            this.f37747f.getAvatarImageView().setOnClickListener(new e8(this, 3));
        }
        this.N = new le1(this, context);
        jh.k kVar2 = new jh.k(this.d);
        ViewGroup viewGroup = this.d;
        ch.b bVar = this.f37759k1;
        bVar.f6301f = kVar2;
        bVar.f6302g = viewGroup;
        le1 le1Var = this.N;
        cy cyVar3 = this.M0;
        if (cyVar3 != null) {
            viewGroup = (ViewGroup) cyVar3.getFragmentView();
        }
        le1 le1Var2 = this.N;
        Objects.requireNonNull(le1Var2);
        this.l1 = new ch.j(le1Var, viewGroup, new i60(le1Var2, 2));
        this.N.D0(new yd1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        pg.c c11 = pg.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        fw fwVar = new fw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f37777w = fwVar;
        fwVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f37781y = i12;
        fw fwVar2 = this.f37777w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        fwVar2.X = z13;
        ne1 ne1Var = new ne1(this);
        this.N.setHideIfEmpty(false);
        ne1Var.f47763m = false;
        ne1Var.C = false;
        le1 le1Var3 = this.N;
        this.I0 = ne1Var;
        le1Var3.setItemAnimator(ne1Var);
        this.N.setOnScrollListener(new de1(this, 1));
        le1 le1Var4 = this.N;
        le1Var4.W1 = true;
        le1Var4.X1 = 0;
        org.telegram.ui.Components.ql0 ql0Var = new org.telegram.ui.Components.ql0(le1Var4, true);
        this.K0 = ql0Var;
        this.N.setItemsEnterAnimator(ql0Var);
        this.N.setOnItemClickListener(new m11(this, 10));
        this.N.setOnItemLongClickListener(new zd1(this));
        this.N.setOnScrollListener(new de1(this, 2));
        le1 le1Var5 = this.N;
        ce1 ce1Var = new ce1(this);
        this.F = ce1Var;
        le1Var5.setLayoutManager(ce1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f37770r);
        this.N.setClipToPadding(false);
        this.N.j(new de1(this, 0));
        ze1 ze1Var = new ze1(this);
        this.P = ze1Var;
        ee1 ee1Var = new ee1(this, ze1Var);
        this.O = ee1Var;
        ee1Var.h(this.N);
        this.d.addView(this.N, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(getParentActivity(), this.resourceProvider, false);
        this.h = j20Var;
        this.d.addView(j20Var, org.telegram.ui.Components.j20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final af1 f45743b;

            {
                this.f45743b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        af1 af1Var = this.f45743b;
                        if (!af1Var.f37773s0) {
                            af1Var.H0(false);
                            return;
                        }
                        return;
                    case 1:
                        af1 af1Var2 = this.f45743b;
                        af1Var2.getMessagesController().hidePeerSettingsBar(-af1Var2.f37734a, null, af1Var2.g());
                        af1Var2.O0(false);
                        return;
                    case 2:
                        this.f45743b.finishPreviewFragment();
                        return;
                    case 3:
                        cy cyVar32 = this.f45743b.M0;
                        if (cyVar32 != null && (w0Var2 = cyVar32.f38612j0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        af1 af1Var3 = this.f45743b;
                        af1Var3.presentFragment(wd1.b0(af1Var3.f37734a, 0L));
                        return;
                }
            }
        });
        this.h.f29457c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f29457c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f29457c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(24);
        c10Var.setVisibility(8);
        c10Var.f27031w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f42823a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23748y6, getResourceProvider());
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
        frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 81, f7, 0.0f, f10, 32.0f));
        this.f37762n = frameLayout;
        textView.setAlpha(0.0f);
        di.n5 n5Var = new di.n5(this, context, c10Var);
        this.D0 = n5Var;
        try {
            n5Var.f28015b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        U0();
        this.f37762n.addView(c10Var);
        this.f37762n.addView(this.D0);
        this.d.addView(this.f37762n);
        this.N.setEmptyView(this.f37762n);
        this.f37765o0 = new o41(context, 6);
        org.telegram.ui.Components.t71 t71Var = new org.telegram.ui.Components.t71(context);
        this.L = t71Var;
        this.f37765o0.addView(t71Var);
        this.d.addView(this.f37765o0, org.telegram.ui.Components.gb1.i(-1, 51, 80));
        this.L.setOnClickListener(new fe1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37763n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f37763n0.setVisibility(4);
        this.f37765o0.addView(this.f37763n0, org.telegram.ui.Components.gb1.i(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.y6.f23364de;
        imageView2.setBackground(org.telegram.ui.ActionBar.o6.c(null, org.telegram.ui.ActionBar.o6.b(getThemedColor(i13))));
        org.telegram.ui.ActionBar.f7.t(this.W0, i13, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f37765o0.addView(this.W0, org.telegram.ui.Components.gb1.h(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final af1 f45743b;

            {
                this.f45743b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        af1 af1Var = this.f45743b;
                        if (!af1Var.f37773s0) {
                            af1Var.H0(false);
                            return;
                        }
                        return;
                    case 1:
                        af1 af1Var2 = this.f45743b;
                        af1Var2.getMessagesController().hidePeerSettingsBar(-af1Var2.f37734a, null, af1Var2.g());
                        af1Var2.O0(false);
                        return;
                    case 2:
                        this.f45743b.finishPreviewFragment();
                        return;
                    case 3:
                        cy cyVar32 = this.f45743b.M0;
                        if (cyVar32 != null && (w0Var2 = cyVar32.f38612j0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        af1 af1Var3 = this.f45743b;
                        af1Var3.presentFragment(wd1.b0(af1Var3.f37734a, 0L));
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        k0 k0Var = new k0(this, context, 27);
        this.e = k0Var;
        if (this.M0 == null) {
            this.d.addView(k0Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        }
        we1 we1Var = new we1(this, context);
        this.f37771r0 = we1Var;
        we1Var.setVisibility(8);
        this.e.addView(this.f37771r0, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        we1 we1Var2 = this.f37771r0;
        int i14 = org.telegram.ui.ActionBar.y6.f23356d6;
        org.telegram.ui.ActionBar.f7.i(i14, we1Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f37734a, true, null, true, false, 0);
        org.telegram.ui.Components.ws wsVar = new org.telegram.ui.Components.ws(context);
        this.U0 = wsVar;
        wsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        eh.d c12 = bVar.c(this.U0, gh.c.o(this.resourceProvider), false);
        org.telegram.messenger.vh.s(c12, AndroidUtilities.dp(24.0f), 7.0f);
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new yd1(this, 0));
        this.d.addView(this.U0, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g7 = g();
        if (g7 != null) {
            yh.d dVar = new yh.d(g7, this);
            this.R0 = dVar;
            this.U0.addView(dVar.b(), org.telegram.ui.Components.gb1.r(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            yh.d dVar2 = this.R0;
            dVar2.f52591m = new zd1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f52588j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.F0 = frameLayout2;
            this.U0.addView(frameLayout2);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            c9 c9Var = new c9(this, context, this);
            this.G0 = c9Var;
            this.F0.addView(c9Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams g10 = org.telegram.ui.Components.gb1.g(-2.0f, -1);
        if (this.inPreviewMode) {
            g10.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, g10);
        }
        y0();
        z10 z10Var = new z10(this, context, 10);
        this.P0 = z10Var;
        z10Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i14), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final af1 f45743b;

            {
                this.f45743b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        af1 af1Var = this.f45743b;
                        if (!af1Var.f37773s0) {
                            af1Var.H0(false);
                            return;
                        }
                        return;
                    case 1:
                        af1 af1Var2 = this.f45743b;
                        af1Var2.getMessagesController().hidePeerSettingsBar(-af1Var2.f37734a, null, af1Var2.g());
                        af1Var2.O0(false);
                        return;
                    case 2:
                        this.f45743b.finishPreviewFragment();
                        return;
                    case 3:
                        cy cyVar32 = this.f45743b.M0;
                        if (cyVar32 != null && (w0Var2 = cyVar32.f38612j0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        af1 af1Var3 = this.f45743b;
                        af1Var3.presentFragment(wd1.b0(af1Var3.f37734a, 0L));
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
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) it.next();
                if (r2Var instanceof cy) {
                    cy cyVar4 = (cy) r2Var;
                    if (cyVar4.p4()) {
                        MessagesStorage.TopicKey topicKey = cyVar4.f38642p2;
                        if (topicKey.dialogId == j10) {
                            this.Q0 = topicKey.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            V0(false, false);
        }
        O0(false);
        P0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j10, new t3(this, 25));
        }
        View view = this.fragmentView;
        zd1 zd1Var = new zd1(this);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(view, zd1Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f37734a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f22028id == j10) {
                O0(false);
                yh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f52588j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                V0(false, true);
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
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                V0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            V0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l4 = (Long) objArr[0];
            if (j10 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                c9 c9Var = this.G0;
                if (c9Var != null) {
                    c9Var.a(!this.fragmentBeginToShow);
                }
                z0(false);
            }
        } else if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            V0(false, false);
            O0(true);
        } else if (i10 != NotificationCenter.chatSwitchedForum && i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i10 == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j10) && !booleanValue) {
                if (this.Q0 != longValue2) {
                    this.Q0 = longValue2;
                    V0(false, false);
                }
            } else if (this.Q0 != 0) {
                this.Q0 = 0L;
                V0(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat g() {
        return getMessagesController().getChat(Long.valueOf(this.f37734a));
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
        ArrayList arrayList = new ArrayList();
        we1 we1Var = this.f37771r0;
        if (we1Var != null && we1Var.W != null) {
            int i10 = org.telegram.ui.Cells.z3.h;
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
        if (this.f37773s0) {
            i10 = org.telegram.ui.ActionBar.y6.f23356d6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23636s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.q()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23713w8);
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
    public final boolean n() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.po o() {
        return this.f37747f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f37735a0.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f37773s0) {
            if (z10) {
                this.actionBar.t(this.f37767p0.T(false));
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
            kVar.g(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.f37734a;
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
        V0(false, false);
        c61.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f37733q1;
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f37734a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        cy cyVar = this.M0;
        if (cyVar != null && cyVar.G3 != null) {
            cyVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.G3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f37734a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f37734a;
        topicsController.onTopicFragmentResume(j10);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new d9(this, 10));
        if (this.inPreviewMode && !getMessagesController().isForum(-j10)) {
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
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        hh.c cVar = this.f37757j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.o6.b(getThemedColor(org.telegram.ui.ActionBar.y6.f23364de))) != this.f37768p1) {
            this.f37768p1 = b10;
            org.telegram.ui.ActionBar.y6.E1(this.W0.getBackground(), b10, true);
        }
        for (int i10 = 0; i10 < 2; i10++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.A(getThemedColor(org.telegram.ui.ActionBar.y6.G8), true);
            this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.y6.E8), false, true);
            this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.y6.F8), true, true);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.y6.I5), true);
        }
        z10 z10Var = this.P0;
        if (z10Var != null && (z10Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6), 100));
        }
        P0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
            }
            fw fwVar = this.f37777w;
            if (fwVar != null) {
                fwVar.i();
            }
            if (this.actionBar != null && this.f37739b1) {
                T0();
            }
            NumberTextView numberTextView = this.f37741c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23750y8));
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f37767p0;
            if (w0Var != null && w0Var.getSearchField() != null) {
                this.f37767p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.y6.Wd));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        tw twVar;
        z10 z10Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (z10Var = this.P0) != null) {
            if (z10Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (!z10) {
            if (this.f37774t0 && this.H) {
                removeSelfFromStack();
                cy cyVar = this.L0;
                if (cyVar != null) {
                    cyVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                cy cyVar2 = this.M0;
                if (cyVar2 != null && (twVar = cyVar2.G3) != null && twVar.c()) {
                    this.M0.G3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        z10 z10Var = this.P0;
        if (z10Var != null && z10Var.getVisibility() == 0) {
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
        this.N.y0(0);
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.po poVar = this.f37747f;
        if (poVar != null) {
            poVar.setAlpha(f7);
            this.f37769q0.setAlpha(f7);
            org.telegram.ui.ActionBar.w0 w0Var = this.f37767p0;
            if (w0Var != null) {
                w0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.po poVar = this.f37747f;
        if (poVar != null) {
            poVar.setAlpha(f7);
            this.f37747f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void x0() {
        ch.f fVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f37751g1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            cy cyVar = this.M0;
            if (cyVar != null) {
                view = cyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (cyVar != null) {
                kVar = cyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f37749f1) - AndroidUtilities.dp(8.0f);
            this.f37764n1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f37766o1;
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
            fVar.g(i10, this.f37761m1);
            fVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final hh.d y() {
        return this.f37755i1;
    }

    public final void y0() {
        ce1 ce1Var;
        TopicsController topicsController = this.f37772s;
        long j10 = this.f37734a;
        if (!topicsController.endIsReached(j10) && (ce1Var = this.F) != null) {
            int N0 = ce1Var.N0();
            if (this.f37737b.isEmpty() || N0 >= this.f37770r.h() - 5) {
                topicsController.loadTopics(j10);
            }
            A0();
        }
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f37734a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f37782y0) != null || this.f37783z0)) {
            org.telegram.ui.Components.voip.g2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f37782y0 = null;
            this.f37783z0 = false;
        } else if (this.f37782y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.t.q(R.string.LinkHashExpired, org.telegram.ui.Components.wc.b0(this), R.raw.linkbroken, 36);
            this.f37782y0 = null;
        }
    }

    @Override
    public final void D() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
