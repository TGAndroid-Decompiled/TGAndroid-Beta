package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.ClipData;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.StrictMode;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.OneUIUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
public class LaunchActivity extends g5 implements org.telegram.ui.ActionBar.y4, NotificationCenter.NotificationCenterDelegate, wx, ye.a {
    public static boolean A1;
    public static org.telegram.ui.Components.yt B1;
    public static LaunchActivity C1;
    public static Pattern D1;
    public static c0 E1;
    public static LaunchActivity F1;
    public static final Pattern f35493x1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean f35494y1;
    public static int f35495z1;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.c2 B0;
    public View C0;
    public org.telegram.ui.ActionBar.c2 D0;
    public boolean E0;
    public HashMap F0;
    public HashMap G0;
    public Intent H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public String L0;
    public boolean M;
    public String M0;
    public String N;
    public TLRPC.TL_wallPaper N0;
    public String O;
    public org.telegram.ui.ActionBar.e6 O0;
    public CharSequence P;
    public TLRPC.TL_theme P0;
    public ArrayList Q;
    public boolean Q0;
    public ArrayList R;
    public org.telegram.ui.ActionBar.c2 R0;
    public ArrayList S;
    public boolean S0;
    public Uri T;
    public boolean T0;
    public String U;
    public fh.j6 U0;
    public ArrayList V;
    public v5 V0;
    public ArrayList W;
    public final ArrayList W0;
    public Uri X;
    public final SparseIntArray X0;
    public int Y;
    public int Y0;
    public final ia0 Z0;
    public FlagSecureReason f35497a1;
    public final LiteMode.BatteryReceiver f35499b1;
    public l90 f35500c0;
    public xg.e f35501c1;
    public ArrayList f35502d0;
    public boolean f35503d1;
    public ArrayList f35504e0;
    public ff.b0 f35505e1;
    public String f35506f0;
    public na0 f35507f1;
    public ActionMode f35508g0;
    public oa0 f35509g1;
    public boolean f35510h0;
    public boolean f35511h1;
    public final m.t3 f35512i0;
    public NotificationCenter.ObserversGroup f35513i1;
    public final xe.b f35514j0;
    public NotificationCenter.ObserversGroup f35515j1;
    public ImageView f35516k0;
    public boolean f35517k1;
    public org.telegram.ui.Components.ge f35518l0;
    public k90 l1;
    public ActionBarLayout m0;
    public kh.i9 f35519m1;
    public ActionBarLayout f35520n0;
    public boolean f35521n1;
    public ActionBarLayout f35522o0;
    public ViewGroup f35523o1;
    public ba0 f35524p0;
    public org.telegram.ui.ActionBar.c2 f35525p1;
    public FrameLayout f35526q0;
    public org.telegram.ui.ActionBar.c2 f35527q1;
    public org.telegram.ui.Components.b51 f35528r0;
    public boolean f35529r1;
    public m0 f35530s0;
    public long f35531s1;
    public la0 f35532t0;
    public int[] f35533t1;
    public org.telegram.ui.ActionBar.v3 f35534u0;
    public ValueAnimator f35535u1;
    public org.telegram.ui.ActionBar.x3 f35536v0;
    public gh.lb f35537v1;
    public org.telegram.ui.Components.ad0 f35538w0;
    public int f35539w1;
    public final ArrayList f35540x0;
    public org.telegram.ui.Components.mz0 f35541y0;
    public org.telegram.ui.Components.v9 f35542z0;
    public final ArrayList L = new ArrayList();
    public final ArrayList Z = new ArrayList();
    public final ArrayList f35496a0 = new ArrayList();
    public final ArrayList f35498b0 = new ArrayList();

    public LaunchActivity() {
        ?? obj = new Object();
        obj.f17098a = new HashMap();
        obj.d = this;
        obj.f17099b = new xe.b(this);
        this.f35512i0 = obj;
        this.f35514j0 = (xe.b) obj.f17099b;
        this.f35540x0 = new ArrayList();
        this.A0 = new ArrayList();
        this.S0 = false;
        this.W0 = new ArrayList();
        this.X0 = new SparseIntArray();
        this.Y0 = 5934;
        this.Z0 = new Object();
        this.f35499b1 = new LiteMode.BatteryReceiver();
        this.f35517k1 = true;
        System.identityHashCode(this);
        this.f35539w1 = 0;
    }

    public static void C0(LaunchActivity launchActivity, int i9, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        String restrictionReason;
        org.telegram.ui.ActionBar.o2 R = R();
        if (R != null) {
            long j10 = tL_attachMenuBot.bot_id;
            mh.s4 b10 = mh.s4.b(i9, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.P() != null && launchActivity.P().k(b10) != null) {
                return;
            }
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
            if (user == null) {
                restrictionReason = null;
            } else {
                restrictionReason = MessagesController.getInstance(i9).getRestrictionReason(user.restriction_reason);
            }
            if (!TextUtils.isEmpty(restrictionReason)) {
                MessagesController.getInstance(i9);
                MessagesController.showCantOpenAlert(R, restrictionReason);
                return;
            }
            mh.c3 c3Var = new mh.c3(launchActivity, R.getResourceProvider());
            c3Var.f17777w0 = false;
            c3Var.w(z10);
            c3Var.f17758g0 = launchActivity;
            c3Var.s(R, b10);
            c3Var.show();
        }
    }

    public static void E(int i9) {
        LaunchActivity launchActivity = F1;
        if (launchActivity != null) {
            launchActivity.D(i9);
        }
    }

    public static void L() {
        qy qyVar;
        ArrayList<org.telegram.ui.ActionBar.k2> arrayList;
        org.telegram.ui.ActionBar.o2 U = U();
        if (U != null) {
            if (U.getParentLayout() instanceof ActionBarLayout) {
                qyVar = ((ActionBarLayout) U.getParentLayout()).w();
            } else {
                qyVar = null;
            }
            if (qyVar != null && (arrayList = qyVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    qyVar.sheetsStack.get(size).dismiss(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.k2> arrayList2 = U.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    U.sheetsStack.get(size2).dismiss(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = mh.c3.S0.iterator();
            while (it.hasNext()) {
                arrayList3.add((mh.c3) it.next());
            }
            int size3 = arrayList3.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj = arrayList3.get(i9);
                i9++;
                ((mh.c3) obj).k(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 N() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.W;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.O) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = C1;
        if (launchActivity != null && !launchActivity.L.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.b5) j3.r0.j(1, C1.L))).t();
        }
        LaunchActivity launchActivity2 = C1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return ((ActionBarLayout) C1.O()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.o2 R() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.W;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.O) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = C1;
        if (launchActivity != null && !launchActivity.L.isEmpty()) {
            return ((org.telegram.ui.ActionBar.b5) j3.r0.j(1, C1.L)).getLastFragment();
        }
        LaunchActivity launchActivity2 = C1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return C1.O().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.o2 U() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.W;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.O) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = C1;
        if (launchActivity != null && !launchActivity.L.isEmpty()) {
            return ((org.telegram.ui.ActionBar.b5) j3.r0.j(1, C1.L)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = C1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return C1.O().getSafeLastFragment();
        }
        return null;
    }

    public static String V(int i9, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null) {
            return LocaleController.getString(str, i9);
        }
        return str2;
    }

    public static int W(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        int parseInt;
        int parseInt2;
        int parseInt3;
        if (uri.getPathSegments().contains("video")) {
            str = uri.getQuery();
        } else if (uri.getQueryParameter("t") != null) {
            str = uri.getQueryParameter("t");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (D1 == null) {
                D1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
            }
            try {
                Matcher matcher = D1.matcher(str);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    String group3 = matcher.group(3);
                    String group4 = matcher.group(4);
                    int i9 = 0;
                    if (TextUtils.isEmpty(group)) {
                        parseInt = 0;
                    } else {
                        parseInt = Integer.parseInt(group);
                    }
                    if (TextUtils.isEmpty(group2)) {
                        parseInt2 = 0;
                    } else {
                        parseInt2 = Integer.parseInt(group2);
                    }
                    if (TextUtils.isEmpty(group3)) {
                        parseInt3 = 0;
                    } else {
                        parseInt3 = Integer.parseInt(group3);
                    }
                    if (!TextUtils.isEmpty(group4)) {
                        i9 = Integer.parseInt(group4);
                    }
                    return (parseInt * 86400) + (parseInt2 * 3600) + (parseInt3 * 60) + i9;
                }
            } catch (Throwable unused) {
            }
            try {
                return Integer.parseInt(str);
            } catch (Throwable unused2) {
                if (str.contains(":")) {
                    String[] split = str.split(":");
                    String str5 = "0";
                    if (split.length - 1 < 0) {
                        str2 = "0";
                    } else {
                        str2 = split[split.length - 1];
                    }
                    if (split.length - 2 < 0) {
                        str3 = "0";
                    } else {
                        str3 = split[split.length - 2];
                    }
                    if (split.length - 3 < 0) {
                        str4 = "0";
                    } else {
                        str4 = split[split.length - 3];
                    }
                    if (split.length - 4 >= 0) {
                        str5 = split[split.length - 4];
                    }
                    try {
                        int parseInt4 = Integer.parseInt(str2);
                        int parseInt5 = Integer.parseInt(str3);
                        int parseInt6 = Integer.parseInt(str4) * 3600;
                        return (Integer.parseInt(str5) * 86400) + parseInt6 + (parseInt5 * 60) + parseInt4;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return -1;
                    }
                }
                return -1;
            }
        }
        return -1;
    }

    public static void Z(View view) {
        if (view.getLayerType() != 0) {
            view.invalidate();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                Z(viewGroup.getChildAt(i9));
            }
        }
    }

    public static void b0(float f10, float f11, float f12) {
        View decorView;
        gh.lb lbVar;
        LaunchActivity launchActivity = C1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((lbVar = launchActivity.f35537v1) == null || ((View) lbVar.f108a) != decorView)) {
                launchActivity.f35537v1 = new gh.lb(decorView);
            }
            gh.lb lbVar2 = launchActivity.f35537v1;
            if (lbVar2 != null) {
                View view = (View) lbVar2.f108a;
                ArrayList arrayList = lbVar2.f8520b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(g7.w.a(0.0f, 0.0f, f10, f11), g7.w.a(view.getWidth(), 0.0f, f10, f11)), Math.max(g7.w.a(0.0f, view.getHeight(), f10, f11), g7.w.a(view.getWidth(), view.getHeight(), f10, f11))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    gh.kb kbVar = new gh.kb(f10, f11, f12);
                    ofFloat.addUpdateListener(new f2.g(1, lbVar2, kbVar));
                    ofFloat.addListener(new fg.j(1, lbVar2, kbVar));
                    ofFloat.setInterpolator(org.telegram.ui.Components.gr.f28845g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(kbVar);
                    lbVar2.R();
                    ofFloat.start();
                }
            }
        }
    }

    public static void y0(AccountInstance accountInstance, dy dyVar, CharSequence charSequence, long j10, MessageObject messageObject, long j11, boolean z10, int i9, int i10) {
        boolean z11;
        org.telegram.ui.Components.wp0 wp0Var;
        org.telegram.ui.Components.wp0 wp0Var2;
        if (dyVar != null && (wp0Var2 = dyVar.C2) != null && !wp0Var2.f34310n) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z11 && dyVar != null && (wp0Var = dyVar.C2) != null) {
            webPage = wp0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z11) {
                SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j10, j11, z10, i9, i10, 0L);
                return;
            }
            CharSequence trimmedString = SendMessagesHelper.getTrimmedString(charSequence);
            if (trimmedString != null && trimmedString.length() != 0) {
                CharSequence[] charSequenceArr = {trimmedString};
                accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j10, messageObject, messageObject, webPage2, z11, accountInstance.getMediaDataController().getEntities(charSequenceArr, true), null, null, z10, i9, i10, null, false));
            }
        }
    }

    public final void A() {
        if (this.K == UserConfig.selectedAccount && this.f35513i1 != null) {
            return;
        }
        NotificationCenter.ObserversGroup observersGroup = this.f35513i1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f35513i1 = null;
        }
        int i9 = UserConfig.selectedAccount;
        this.K = i9;
        this.f35513i1 = NotificationCenter.getInstance(i9).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
    }

    public final void A0() {
        org.telegram.ui.ActionBar.x3 x3Var;
        ViewGroup view;
        int i9;
        if (this.f35536v0.indexOfChild(this.f35524p0) != -1) {
            x3Var = this.f35536v0;
            view = this.f35524p0;
        } else {
            x3Var = this.f35536v0;
            view = this.m0.getView();
        }
        int indexOfChild = x3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f35536v0.removeViewAt(indexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            ba0 ba0Var = new ba0(this, this);
            this.f35524p0 = ba0Var;
            if (indexOfChild != -1) {
                this.f35536v0.addView(ba0Var, indexOfChild, g7.e6.c(-1.0f, -1));
            } else {
                this.f35536v0.addView(ba0Var, g7.e6.c(-1.0f, -1));
            }
            org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(this, null, 4);
            this.f35528r0 = b51Var;
            b51Var.setOccupyStatusBar(false);
            this.f35528r0.V(org.telegram.ui.ActionBar.f6.r0());
            this.f35524p0.addView(this.f35528r0, g7.e6.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.m0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.m0.getView());
            }
            this.f35524p0.addView(this.m0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f35522o0 = actionBarLayout;
            actionBarLayout.J0 = true;
            actionBarLayout.setFragmentStack(this.f35498b0);
            this.f35522o0.setDelegate(this);
            this.f35524p0.addView(this.f35522o0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f35526q0 = frameLayout;
            ArrayList arrayList = this.f35496a0;
            int i10 = 8;
            if (arrayList.isEmpty()) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            frameLayout.setVisibility(i9);
            this.f35526q0.setBackgroundColor(1056964608);
            this.f35524p0.addView(this.f35526q0);
            this.f35526q0.setOnTouchListener(new f0(this, 3));
            this.f35526q0.setOnClickListener(new fh.n(22));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f35520n0 = actionBarLayout2;
            actionBarLayout2.I0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f35520n0.setBackgroundView(this.f35526q0);
            this.f35520n0.setUseAlphaAnimations(true);
            this.f35520n0.setFragmentStack(arrayList);
            this.f35520n0.setDelegate(this);
            this.f35520n0.setDrawerLayoutContainer(this.f35536v0);
            ViewGroup view2 = this.f35520n0.getView();
            if (!arrayList.isEmpty()) {
                i10 = 0;
            }
            view2.setVisibility(i10);
            this.f35524p0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.m0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.m0.getView());
            }
            this.m0.setFragmentStack(this.Z);
            if (indexOfChild != -1) {
                this.f35536v0.addView(this.m0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f35536v0.addView(this.m0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        g7.v7.a(this, SharedConfig.isFloatingDebugActive, false);
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f35505e1 == null && SharedConfig.frameMetricsEnabled) {
                this.f35505e1 = ff.b0.b(this, this.f35530s0);
            }
            ff.b0 b0Var = this.f35505e1;
            if (b0Var != null && !SharedConfig.frameMetricsEnabled) {
                b0Var.c();
                this.f35505e1 = null;
            }
        }
    }

    public final org.telegram.ui.ActionBar.c2 B0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.c2 o6 = alertDialog$Builder.o();
            o6.setCanceledOnTouchOutside(true);
            o6.setOnDismissListener(new bg.j(11, this, o6));
            this.A0.add(o6);
            return o6;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override
    public final boolean C() {
        ArrayList arrayList = this.Q;
        if ((arrayList != null && arrayList.size() == 1) || this.N != null) {
            return true;
        }
        return false;
    }

    public final void D(int i9) {
        F1 = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT >= 26 && i9 == 0) || this.f35529r1) {
            return;
        }
        Utilities.globalQueue.postRunnable(new z70(this, i9, 0), 2000L);
    }

    public final void D0(p.a aVar) {
        org.telegram.ui.ActionBar.o2 o2Var;
        ArrayList arrayList = this.f35496a0;
        if (!arrayList.isEmpty()) {
            o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f35498b0;
            if (!arrayList2.isEmpty()) {
                o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.Z;
                if (!arrayList3.isEmpty()) {
                    o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList3);
                } else {
                    o2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.oc.a(o2Var)) {
            aVar.c(org.telegram.ui.Components.oc.a0(o2Var)).j();
        }
    }

    public final void E0() {
        String str;
        String str2;
        char c10;
        LocaleController.LocaleInfo localeInfo;
        if (UserConfig.getInstance(this.K).isClientActivated()) {
            try {
                if (!this.E0 && !ApplicationLoader.mainInterfacePaused) {
                    String string = MessagesController.getGlobalMainSettings().getString("language_showed2", "");
                    final String str3 = MessagesController.getInstance(this.K).suggestedLangCode;
                    if (string.equals(str3)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final LocaleController.LocaleInfo[] localeInfoArr = new LocaleController.LocaleInfo[2];
                    if (str3.contains("-")) {
                        str = str3.split("-")[0];
                    } else {
                        str = str3;
                    }
                    if ("in".equals(str)) {
                        str2 = "id";
                    } else if ("iw".equals(str)) {
                        str2 = "he";
                    } else if ("jw".equals(str)) {
                        str2 = "jv";
                    } else {
                        str2 = null;
                    }
                    int i9 = 0;
                    while (true) {
                        if (i9 < LocaleController.getInstance().languages.size()) {
                            LocaleController.LocaleInfo localeInfo2 = LocaleController.getInstance().languages.get(i9);
                            c10 = 0;
                            if (localeInfo2.shortName.equals("en")) {
                                localeInfoArr[0] = localeInfo2;
                            }
                            if (localeInfo2.shortName.replace("_", "-").equals(str3) || localeInfo2.shortName.equals(str) || localeInfo2.shortName.equals(str2)) {
                                localeInfoArr[1] = localeInfo2;
                            }
                            if (localeInfoArr[0] != null && localeInfoArr[1] != null) {
                                break;
                            }
                            i9++;
                        } else {
                            c10 = 0;
                            break;
                        }
                    }
                    LocaleController.LocaleInfo localeInfo3 = localeInfoArr[c10];
                    if (localeInfo3 != null && (localeInfo = localeInfoArr[1]) != null && localeInfo3 != localeInfo) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("show lang alert for " + localeInfoArr[c10].getKey() + " and " + localeInfoArr[1].getKey());
                        }
                        this.F0 = null;
                        this.G0 = null;
                        this.E0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = localeInfoArr[1].getLangCode();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.K).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) {
                            public final LaunchActivity f40652b;

                            {
                                this.f40652b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i10 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.f35493x1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i10 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i10);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f40652b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.F0 = hashMap2;
                                                        if (launchActivity2.G0 != null && hashMap2 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr2;
                                                            launchActivity2.F0(localeInfoArr3[1], localeInfoArr3[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.G0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.F0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.F0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        Pattern pattern2 = LaunchActivity.f35493x1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i10 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i10);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f40652b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.F0 = hashMap22;
                                                        if (launchActivity22.G0 != null && hashMap22 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.F0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.G0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.F0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.F0(localeInfoArr4[1], localeInfoArr4[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        }, 8);
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings2 = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings2.lang_code = localeInfoArr[c10].getLangCode();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.K).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {
                            public final LaunchActivity f40652b;

                            {
                                this.f40652b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i10 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.f35493x1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i10 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i10);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f40652b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.F0 = hashMap22;
                                                        if (launchActivity22.G0 != null && hashMap22 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr2;
                                                            launchActivity22.F0(localeInfoArr32[1], localeInfoArr32[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.G0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.F0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.F0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        Pattern pattern2 = LaunchActivity.f35493x1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i10 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i10);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f40652b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.F0 = hashMap22;
                                                        if (launchActivity22.G0 != null && hashMap22 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.F0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.G0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.F0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.F0(localeInfoArr4[1], localeInfoArr4[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        }, 8);
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void F() {
        int i9;
        if (AndroidUtilities.isTablet() && this.f35522o0 != null) {
            if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
                int i10 = 8;
                if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                    this.K0 = false;
                    List<org.telegram.ui.ActionBar.o2> fragmentStack = this.m0.getFragmentStack();
                    if (fragmentStack.size() >= 2) {
                        while (1 < fragmentStack.size()) {
                            org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.get(1);
                            if (o2Var instanceof qn) {
                                ((qn) o2Var).U4 = true;
                            }
                            o2Var.onPause();
                            o2Var.onFragmentDestroy();
                            o2Var.setParentLayout(null);
                            fragmentStack.remove(o2Var);
                            this.f35522o0.c(-1, o2Var);
                        }
                        org.telegram.ui.Components.ad0 ad0Var = this.f35538w0;
                        if (ad0Var == null || ad0Var.f26775b.getVisibility() != 0) {
                            this.m0.U(true, true);
                            this.f35522o0.U(true, true);
                        }
                    }
                    ViewGroup view = this.f35522o0.getView();
                    if (this.f35522o0.getFragmentStack().isEmpty()) {
                        i9 = 8;
                    } else {
                        i9 = 0;
                    }
                    view.setVisibility(i9);
                    org.telegram.ui.Components.b51 b51Var = this.f35528r0;
                    if (this.f35522o0.getFragmentStack().isEmpty()) {
                        i10 = 0;
                    }
                    b51Var.setVisibility(i10);
                    return;
                }
                this.K0 = true;
                List<org.telegram.ui.ActionBar.o2> fragmentStack2 = this.f35522o0.getFragmentStack();
                if (!fragmentStack2.isEmpty()) {
                    while (fragmentStack2.size() > 0) {
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentStack2.get(0);
                        if (o2Var2 instanceof qn) {
                            ((qn) o2Var2).U4 = true;
                        }
                        o2Var2.onPause();
                        o2Var2.onFragmentDestroy();
                        o2Var2.setParentLayout(null);
                        fragmentStack2.remove(o2Var2);
                        this.m0.c(-1, o2Var2);
                    }
                    org.telegram.ui.Components.ad0 ad0Var2 = this.f35538w0;
                    if (ad0Var2 == null || ad0Var2.f26775b.getVisibility() != 0) {
                        this.m0.U(true, true);
                    }
                }
                this.f35522o0.getView().setVisibility(8);
                org.telegram.ui.Components.b51 b51Var2 = this.f35528r0;
                if (this.m0.getFragmentStack().isEmpty()) {
                    i10 = 0;
                }
                b51Var2.setVisibility(i10);
            }
        }
    }

    public final void F0(org.telegram.messenger.LocaleController.LocaleInfo r18, org.telegram.messenger.LocaleController.LocaleInfo r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.F0(org.telegram.messenger.LocaleController$LocaleInfo, org.telegram.messenger.LocaleController$LocaleInfo, java.lang.String):void");
    }

    public final void G(boolean z10) {
        H(z10, true, !this.S0);
    }

    public final void G0(boolean z10, boolean z11, int i9, int i10, ri riVar) {
        if (this.f35536v0 != null && !isFinishing()) {
            if (this.f35538w0 == null) {
                this.f35538w0 = new org.telegram.ui.Components.ad0(this);
            }
            SharedConfig.appLocked = true;
            int i11 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f36157s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                PhotoViewer.t1().F0(false, true);
            } else if (l4.I() && l4.x().R) {
                l4.x().o(false, true);
            }
            kh.wb.x();
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.f35538w0.show();
            org.telegram.ui.Components.zc0 zc0Var = this.f35538w0.f26775b;
            ArrayList arrayList = this.f35540x0;
            arrayList.isEmpty();
            zc0Var.j(z11, i9, i10, new x20(13, this, riVar));
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Components.yc0 yc0Var = (org.telegram.ui.Components.yc0) arrayList.get(i12);
                if (z10) {
                    int size = arrayList.size() - 1;
                }
                yc0Var.j(z11, i9, i10, null);
            }
            SharedConfig.isWaitingForPasscodeEnter = true;
            s90 s90Var = new s90(this);
            this.f35538w0.f26775b.setDelegate(s90Var);
            int size2 = arrayList.size();
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((org.telegram.ui.Components.yc0) obj).setDelegate(s90Var);
            }
            try {
                NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void H(boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int w02;
        on onVar;
        boolean z13;
        ArrayList arrayList = this.Z;
        boolean z14 = true;
        if (!arrayList.isEmpty()) {
            o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList);
        } else {
            o2Var = null;
        }
        char c10 = 2;
        if (o2Var != null && (o2Var.isRemovingFromStack() || o2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(2, arrayList);
            } else {
                o2Var = null;
            }
        }
        if (o2Var != null) {
            o2Var.hasForceLightStatusBar();
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23) {
            if (z11) {
                if (o2Var != null) {
                    z13 = o2Var.isLightStatusBar();
                    if (o2Var.getParentLayout() instanceof ActionBarLayout) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) o2Var.getParentLayout();
                        if (actionBarLayout.w() != null && actionBarLayout.w().getLastSheet() != null) {
                            org.telegram.ui.ActionBar.k2 lastSheet = actionBarLayout.w().getLastSheet();
                            if (lastSheet.isShown()) {
                                z13 = lastSheet.isAttachedLightStatusBar();
                            }
                        } else {
                            ArrayList<org.telegram.ui.ActionBar.k2> arrayList2 = o2Var.sheetsStack;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) j3.r0.j(1, o2Var.sheetsStack);
                                if (k2Var.isShown()) {
                                    z13 = k2Var.isAttachedLightStatusBar();
                                }
                            }
                        }
                    }
                } else {
                    z13 = i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23269s8, true)) > 0.699999988079071d;
                }
                AndroidUtilities.setLightStatusBar(this, z13);
            }
            if (i9 >= 26 && z12 && (!z10 || o2Var == null || !o2Var.isInPreviewMode())) {
                if (o2Var != null && z10) {
                    w02 = o2Var.getNavigationBarColor();
                } else {
                    w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, true);
                }
                if (o2Var instanceof qn) {
                    qn qnVar = (qn) o2Var;
                    if (!qnVar.Ab || (qnVar.v.f49448s != 1 && ((onVar = qnVar.f41848aa) == null || !onVar.C))) {
                        c10 = 1;
                    }
                } else {
                    c10 = 0;
                }
                if (P() != null && P().D > 0) {
                    c10 = 0;
                }
                if (this.m0.w() != null) {
                    qy w8 = this.m0.w();
                    if (w8.sheetsStack != null) {
                        for (int i10 = 0; i10 < w8.sheetsStack.size(); i10++) {
                            org.telegram.ui.ActionBar.k2 k2Var2 = w8.sheetsStack.get(i10);
                            if (k2Var2.attachedToParent()) {
                                w02 = k2Var2.getNavigationBarColor(w02);
                                c10 = 0;
                            }
                        }
                    }
                }
                Iterator it = mh.c3.S0.iterator();
                while (it.hasNext()) {
                    w02 = ((mh.c3) it.next()).getNavigationBarColor(w02);
                    c10 = 0;
                }
                z0(w02);
                if ((c10 != 0 || AndroidUtilities.computePerceivedBrightness(w02) < 0.721f) && c10 != 1) {
                    z14 = false;
                }
                AndroidUtilities.setLightNavigationBar(this, z14);
            }
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void H0(int i9, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f10;
        float f11;
        if (this.f35541y0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            int i10 = AndroidUtilities.statusBarHeight;
            if (i10 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i10));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.logo_middle);
            linearLayout.addView(imageView, g7.e6.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i11 = org.telegram.ui.ActionBar.f6.G6;
            f10 = 4.0f;
            org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, i11, false), 1, 17.0f);
            textView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
            linearLayout.addView(textView, g7.e6.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f30951a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(51);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView2, g7.e6.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            scrollView.setPadding(AndroidUtilities.dp(24.0f), i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, g7.e6.n(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(LocaleController.getString(R.string.Decline).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            int i12 = org.telegram.ui.ActionBar.f6.f23369y6;
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setBackground(org.telegram.ui.ActionBar.f6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.f6.w0(null, i12, false)));
            f11 = 10.0f;
            textView3.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
            frameLayout.addView(textView3, g7.e6.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    mz0 mz0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            c2Var.N = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new kz0(mz0Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            c2Var.P = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (mz0Var.f30953c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                c2Var2.N = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new kz0(mz0Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                c2Var2.P = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", mz0Var.f30953c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            mz0Var.a();
                            return;
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(LocaleController.getString(R.string.Accept));
            textView4.setGravity(17);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int dp = AndroidUtilities.dp(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, -11491093, -12346402, -12346402));
            textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(textView4, g7.e6.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    mz0 mz0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            c2Var.N = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new kz0(mz0Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            c2Var.P = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (mz0Var.f30953c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                c2Var2.N = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new kz0(mz0Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                c2Var2.P = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", mz0Var.f30953c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            mz0Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            view2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23002d7, false));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.f35541y0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f35536v0.addView(this.f35541y0, g7.e6.c(-1.0f, -1));
            this.f35541y0.setDelegate(new ca0(this));
        } else {
            f10 = 4.0f;
            f11 = 10.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i9).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f22437id.data.equals(tL_help_termsOfService.f22437id.data))) {
            UserConfig.getInstance(i9).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i9).saveConfig(false);
        }
        org.telegram.ui.Components.mz0 mz0Var = this.f35541y0;
        if (mz0Var.getVisibility() != 0) {
            mz0Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false);
        int dp2 = AndroidUtilities.dp(f11);
        int dp3 = AndroidUtilities.dp(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i13 = 0; i13 < length; i13++) {
            if (spannableStringBuilder.charAt(i13) == '\n') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == '-') {
                    int i15 = i13 + 2;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        org.telegram.ui.Components.ta taVar = new org.telegram.ui.Components.ta(dp2, dp3);
                        spannableStringBuilder.replace(i14, i13 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(taVar, i14, i15, 33);
                    }
                }
            }
        }
        mz0Var.f30951a.setText(spannableStringBuilder);
        mz0Var.f30953c = tL_help_termsOfService;
        mz0Var.d = i9;
        this.f35541y0.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    @Override
    public final boolean I(org.telegram.ui.dy r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.I(org.telegram.ui.dy):boolean");
    }

    public final void I0(int i9, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        if (this.f35542z0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
            frameLayout.f33335w = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.f6.w0(null, i10, false), 0});
            frameLayout.f33336x = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.f6.w0(null, i10, false), 0});
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            int i11 = (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight));
            ?? imageView = new ImageView(this);
            imageView.f(R.raw.qr_code_logo, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().I(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            frameLayout2.addView((View) imageView, g7.e6.d(-2, -2.0f, 17, 0.0f, i11, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.f0((Object) frameLayout, 4));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f33331f = scrollView;
            AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23269s8, false));
            scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, g7.e6.d(-1, -1.0f, 51, 27.0f, i11 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.f6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.UpdateTelegram));
            frameLayout3.addView(textView, g7.e6.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f33327a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(49);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            frameLayout3.addView(textView2, g7.e6.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            fh.d2 d2Var = new fh.d2(this, 10);
            frameLayout.d = d2Var;
            d2Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            d2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
            d2Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(d2Var, g7.e6.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            d2Var.setOnClickListener(new org.telegram.ui.Components.s2(7, frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f33328b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            d2Var.addView(textView3, g7.e6.e(-2, -2, 17));
            fh.d2 d2Var2 = new fh.d2((Object) frameLayout, this, 11);
            frameLayout.f33329c = d2Var2;
            d2Var2.setWillNotDraw(false);
            d2Var2.setAlpha(0.0f);
            d2Var2.setScaleX(0.1f);
            d2Var2.setScaleY(0.1f);
            d2Var2.setVisibility(4);
            org.telegram.ui.Components.qi0 qi0Var = new org.telegram.ui.Components.qi0(d2Var2);
            frameLayout.f33330e = qi0Var;
            qi0Var.d(null, true, false);
            qi0Var.f31966o = -1;
            d2Var.addView(d2Var2, g7.e6.e(36, 36, 17));
            this.f35542z0 = frameLayout;
            this.f35536v0.addView((View) frameLayout, g7.e6.c(-1.0f, -1));
        }
        org.telegram.ui.Components.v9 v9Var = this.f35542z0;
        v9Var.v = 0;
        v9Var.f33332n = tL_help_appUpdate;
        v9Var.f33334s = i9;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            v9Var.f33333r = FileLoader.getAttachFileName(document);
        }
        if (v9Var.getVisibility() != 0) {
            v9Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false);
        v9Var.f33327a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            TextView textView4 = v9Var.f33328b;
            textView4.setText(LocaleController.getString(R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tL_help_appUpdate.document.size)));
        } else {
            v9Var.f33328b.setText(LocaleController.getString(R.string.Update));
        }
        NotificationCenter.getInstance(v9Var.f33334s).addObserver(v9Var, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(v9Var.f33334s).addObserver(v9Var, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(v9Var.f33334s).addObserver(v9Var, NotificationCenter.fileLoadProgressChanged);
        if (z10 && ApplicationLoader.isStandaloneBuild()) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(v9Var.f33334s).sendRequest(tL_help_getAppUpdate, new org.telegram.ui.Components.w1(v9Var, 1));
        }
    }

    public final void J(boolean z10) {
        ChatObject.Call call;
        long j10;
        boolean z11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z12 = false;
        if (sharedInstance != null && (call = sharedInstance.groupCall) != null) {
            boolean z13 = this.f35510h0;
            TLRPC.InputPeer groupCallPeer = sharedInstance.getGroupCallPeer();
            if (groupCallPeer != null) {
                j10 = groupCallPeer.user_id;
                if (j10 == 0) {
                    long j11 = groupCallPeer.chat_id;
                    if (j11 == 0) {
                        j11 = groupCallPeer.channel_id;
                    }
                    j10 = -j11;
                }
            } else {
                j10 = UserConfig.getInstance(this.K).clientUserId;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && groupCallParticipant.raise_hand_rating != 0) {
                z12 = true;
            }
            this.f35510h0 = z12;
            if (!z10 && z13 && !z12 && !z11 && o50.f40880z3 == null) {
                J0(38);
                return;
            }
            return;
        }
        this.f35510h0 = false;
    }

    public final void J0(int i9) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.Z.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.o2 o2Var = this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1);
            if (o2Var instanceof ng0) {
                o2Var = ((ng0) o2Var).W();
            }
            UndoView undoView = null;
            if (o2Var instanceof qn) {
                qn qnVar = (qn) o2Var;
                if (chat != null && qnVar.a() == (-chat.f22380id)) {
                    chat = null;
                }
                qnVar.Q7();
                undoView = qnVar.f42093u3;
            } else if (o2Var instanceof dy) {
                undoView = ((dy) o2Var).Y3();
            } else if (o2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) o2Var).I;
            }
            if (undoView != null) {
                undoView.m(0L, chat, i9);
            }
            if (i9 == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    public final void K() {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.o2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (AndroidUtilities.isTablet()) {
            ArrayList arrayList2 = this.f35496a0;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((org.telegram.ui.ActionBar.o2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f35498b0;
            int size3 = arrayList3.size();
            while (i9 < size3) {
                Object obj3 = arrayList3.get(i9);
                i9++;
                ((org.telegram.ui.ActionBar.o2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void K0(int i9) {
        L0(i9, new org.telegram.ui.Components.if0(28));
    }

    public final void L0(int i9, GenericProvider genericProvider) {
        if (i9 != UserConfig.selectedAccount && UserConfig.isValidAccount(i9)) {
            this.f35511h1 = true;
            ConnectionsManager.getInstance(this.K).setAppPaused(true, false);
            UserConfig.selectedAccount = i9;
            UserConfig.getInstance(0).saveConfig(false);
            A();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAccountChanged, Integer.valueOf(i9));
            if (AndroidUtilities.isTablet()) {
                this.f35520n0.X();
                this.f35522o0.X();
                if (!this.K0) {
                    if (this.f35522o0.getFragmentStack().isEmpty()) {
                        this.f35528r0.setVisibility(0);
                    }
                    this.f35522o0.getView().setVisibility(8);
                }
                this.f35520n0.getView().setVisibility(8);
            }
            this.m0.X();
            this.m0.c(-3, (ng0) genericProvider.provide(null));
            this.m0.U(true, true);
            if (AndroidUtilities.isTablet()) {
                this.f35520n0.U(true, true);
                this.f35522o0.U(true, true);
            }
            if (!ApplicationLoader.mainInterfacePaused) {
                ConnectionsManager.getInstance(this.K).setAppPaused(false, false);
            }
            if (UserConfig.getInstance(i9).unacceptedTermsOfService != null) {
                H0(i9, UserConfig.getInstance(i9).unacceptedTermsOfService);
            }
            M0();
            this.f35511h1 = false;
        }
    }

    public final java.util.ArrayList M(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.M(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void M0() {
        String str;
        int i9;
        if (this.m0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            this.Y = connectionState;
            l80 l80Var = null;
            if (connectionState == 2) {
                i9 = R.string.WaitingForNetwork;
                str = "WaitingForNetwork";
            } else if (connectionState == 5) {
                i9 = R.string.Updating;
                str = "Updating";
            } else if (connectionState == 4) {
                i9 = R.string.ConnectingToProxyWithDots;
                str = "ConnectingToProxyWithDots";
            } else if (connectionState == 1) {
                i9 = R.string.Connecting;
                str = "Connecting";
            } else {
                str = null;
                i9 = 0;
            }
            if (connectionState == 1 || connectionState == 4) {
                l80Var = new l80(this, 5);
            }
            ActionBarLayout actionBarLayout = this.m0;
            actionBarLayout.C0 = str;
            actionBarLayout.D0 = i9;
            actionBarLayout.E0 = l80Var;
            for (int i10 = 0; i10 < actionBarLayout.K0.size(); i10++) {
                ((org.telegram.ui.ActionBar.o2) actionBarLayout.K0.get(i10)).setTitleOverlayText(actionBarLayout.C0, actionBarLayout.D0, l80Var);
            }
        }
    }

    public final org.telegram.ui.ActionBar.b5 O() {
        ActionBarLayout actionBarLayout = this.m0;
        ArrayList arrayList = this.L;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.b5) j3.r0.j(1, arrayList);
        }
        return actionBarLayout;
    }

    public final org.telegram.ui.ActionBar.m3 P() {
        ActionBarLayout actionBarLayout = this.f35522o0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f35522o0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.m0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.m0.getBottomSheetTabs();
        }
        return null;
    }

    public final org.telegram.ui.ActionBar.o2 Q() {
        if (fg0.j1(this.K, false).getInt("currentViewNum", 0) != 0) {
            return new fg0();
        }
        return new i70();
    }

    public final int S() {
        return this.Z.size();
    }

    public final xg.e T() {
        return this.f35501c1;
    }

    public final boolean X(android.content.Intent r127, boolean r128, boolean r129, boolean r130, ve.d r131, boolean r132, boolean r133) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.X(android.content.Intent, boolean, boolean, boolean, ve.d, boolean, boolean):boolean");
    }

    public final void Y() {
        ActionMode actionMode = this.f35508g0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    @Override
    public final void a(float f10) {
        if (l4.I() && l4.x().R) {
            l4 x10 = l4.x();
            x10.S();
            l4.g0(x10);
            if (x10.f40012b0 != null) {
                x10.f40026q0[0].f41320b.f1();
                x10.f40026q0[1].f41320b.f1();
                x10.f40012b0.invalidate();
                x10.m0.invalidate();
                if (f10 == 1.0f) {
                    x10.f40026q0[0].f41321c.l();
                    x10.f40026q0[1].f41321c.l();
                }
            }
        }
        if (PhotoViewer.C1()) {
            PhotoViewer.t1().u3();
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.a0():void");
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.f35520n0) {
            this.f35522o0.U(z10, z10);
            this.m0.U(z10, z10);
        }
    }

    public final boolean c0(boolean z10) {
        boolean z11;
        uf.h hVar = g7.v7.f7389a;
        if (hVar != null) {
            if (hVar.f48225s) {
                if (z10) {
                    hVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.ad0 ad0Var = this.f35538w0;
        if (ad0Var != null && ad0Var.f26775b.getVisibility() == 0) {
            if (z10) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.v3 v3Var = this.f35534u0;
            if (v3Var != null && (z11 = v3Var.Q)) {
                if (z10 && z11) {
                    v3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.sm0.D;
                if (c2Var != null) {
                    if (z10) {
                        c2Var.dismiss();
                        org.telegram.ui.Components.sm0.D = null;
                        return false;
                    }
                } else if (ht.f38908g0 != null && ht.q().E) {
                    if (z10) {
                        ht.q().o();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f36157s) {
                    if (z10) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                    if (z10) {
                        PhotoViewer.t1().F0(true, false);
                        return false;
                    }
                } else if (!l4.I() || !l4.x().R) {
                    return true;
                } else {
                    if (z10) {
                        l4.x().o(true, false);
                    }
                }
            }
        }
        return false;
    }

    public final void d0() {
        v5 v5Var = this.V0;
        if (v5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            this.V0 = null;
        }
        if (!this.M) {
            this.M = true;
            NotificationCenter.ObserversGroup observersGroup = this.f35513i1;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.f35513i1 = null;
            }
            NotificationCenter.ObserversGroup observersGroup2 = this.f35515j1;
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                this.f35515j1 = null;
            }
            k90 k90Var = this.l1;
            if (k90Var != null) {
                LiteMode.removeOnPowerSaverAppliedListener(k90Var);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r19, int r20, java.lang.Object... r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void e0(Intent intent, ve.d dVar) {
        super.onNewIntent(intent);
        X(intent, true, false, false, dVar, true, false);
    }

    public final void f0() {
        if (this.V0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodePause");
            }
            AndroidUtilities.cancelRunOnUIThread(this.V0);
            this.V0 = null;
        }
        if (SharedConfig.passcodeHash.length() != 0) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            v5 v5Var = new v5(this, 8);
            this.V0 = v5Var;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(v5Var, 1000L);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in 1000");
                }
            } else if (SharedConfig.autoLockIn != 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in " + ((SharedConfig.autoLockIn * 1000) + 1000));
                }
                AndroidUtilities.runOnUIThread(this.V0, (SharedConfig.autoLockIn * 1000) + 1000);
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
    }

    public final void g0() {
        if (this.V0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodeResume");
            }
            AndroidUtilities.cancelRunOnUIThread(this.V0);
            this.V0 = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            G0(true, false, -1, -1, null);
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.o2 o2Var, ActionBarLayout actionBarLayout) {
        boolean z10;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (AndroidUtilities.isTablet()) {
            boolean z11 = o2Var instanceof dy;
            if (!z11 && !(o2Var instanceof ng0)) {
                if ((o2Var instanceof qn) && !((qn) o2Var).c()) {
                    boolean z12 = this.K0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f35522o0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f35528r0.setVisibility(8);
                        this.f35522o0.X();
                        this.f35522o0.c(-1, o2Var);
                        if (!this.f35520n0.getFragmentStack().isEmpty()) {
                            while (this.f35520n0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f35520n0;
                                actionBarLayout4.a0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f35520n0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.m0)) {
                        actionBarLayout2.c(-1, o2Var);
                        if (!this.f35520n0.getFragmentStack().isEmpty()) {
                            while (this.f35520n0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f35520n0;
                                actionBarLayout5.a0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f35520n0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f35520n0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i9 = 0;
                    while (true) {
                        if (i9 < 4) {
                            if (UserConfig.getInstance(i9).isClientActivated()) {
                                break;
                            }
                            i9++;
                        } else {
                            i9 = -1;
                            break;
                        }
                    }
                    if ((o2Var instanceof fg0) && i9 == -1) {
                        this.f35528r0.setVisibility(0);
                        this.f35526q0.setBackgroundColor(0);
                    } else {
                        this.f35526q0.setBackgroundColor(2130706432);
                    }
                    this.f35520n0.c(-1, o2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.m0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z11 && !((dy) o2Var).h4()) {
                    z10 = false;
                }
                if (z10) {
                    this.m0.X();
                    this.m0.c(-1, o2Var);
                    this.f35520n0.X();
                    this.f35520n0.getView().setVisibility(8);
                    if (!this.K0 && this.f35522o0.getFragmentStack().isEmpty()) {
                        this.f35528r0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        org.telegram.ui.ActionBar.c2 c2Var = this.R0;
        if (c2Var != null) {
            try {
                c2Var.dismiss();
            } finally {
                this.R0 = null;
            }
        }
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.L0 = null;
        this.P0 = null;
    }

    public final void i0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.i0(boolean):void");
    }

    @Override
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36157s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().F0(true, false);
            return true;
        } else if (!l4.I() || !l4.x().R) {
            return false;
        } else {
            l4.x().o(true, false);
            return true;
        }
    }

    public final void j0(TL_account.Password password) {
        String str;
        fg0 fg0Var = new fg0();
        l80 l80Var = new l80(this, 0);
        fg0Var.B = 3;
        fg0Var.f38259a = 12;
        fg0Var.Z = l80Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f34062a |= 256;
                obj.f34063b = indexOf;
                int i9 = lastIndexOf + 1;
                obj.f34064c = i9;
                valueOf.setSpan(new org.telegram.ui.Components.wz0(obj, 0), indexOf, i9, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            alertDialog$Builder.f22702a.N = valueOf;
            alertDialog$Builder.f22702a.P = getString(R.string.EmailLoginChangeMessage);
            alertDialog$Builder.k(getString(R.string.ChangeEmail), new yr(16, this, fg0Var));
            alertDialog$Builder.h(getString(R.string.Cancel), null);
            alertDialog$Builder.o();
            return;
        }
        p0(fg0Var);
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.m0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.f35511h1) {
                d0();
                finish();
                return false;
            } else if (actionBarLayout == this.f35522o0) {
                if (!this.K0) {
                    this.f35528r0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f35520n0 && this.m0.getFragmentStack().isEmpty() && this.f35520n0.getFragmentStack().size() == 1) {
                d0();
                finish();
                return false;
            }
        } else if (actionBarLayout.getFragmentStack().size() <= 1) {
            d0();
            finish();
            return false;
        }
        return true;
    }

    public final void k0(final long j10, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i9, final int i10) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            p0(we1.E0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(this.K).getInputChannel(-j10);
        tL_channels_getMessages.f22418id.add(num);
        ConnectionsManager.getInstance(this.K).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new p80(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i9, i10));
            }
        });
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.z4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.z4):boolean");
    }

    public final void l0(long[] jArr, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ih.e7 a2;
        long[] jArr2 = jArr;
        int i9 = 0;
        while (true) {
            if (i9 < jArr2.length) {
                TLRPC.User user = MessagesController.getInstance(this.K).getUser(Long.valueOf(jArr2[i9]));
                if (user != null && !user.stories_hidden) {
                    z11 = false;
                    break;
                }
                i9++;
            } else {
                z11 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.o2 R = R();
        if (R != null) {
            ih.v6 storiesController = MessagesController.getInstance(this.K).getStoriesController();
            if (z11) {
                arrayList = storiesController.h;
            } else {
                arrayList = storiesController.f12241g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z12 = z11;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z12) {
                ArrayList arrayList5 = new ArrayList();
                for (int i10 = 0; i10 < jArr2.length; i10++) {
                    TLRPC.User user2 = MessagesController.getInstance(this.K).getUser(Long.valueOf(jArr2[i10]));
                    if (user2 == null || !user2.stories_hidden) {
                        arrayList5.add(Long.valueOf(jArr2[i10]));
                    }
                }
                Object[] array = arrayList5.toArray();
                int length = array.length;
                long[] jArr3 = new long[length];
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = array[i11];
                    obj.getClass();
                    jArr3[i11] = ((Number) obj).longValue();
                }
                jArr2 = jArr3;
            }
            if (z10) {
                for (int i12 = 0; i12 < jArr2.length; i12 = aa.d.g(jArr2[i12], arrayList4, i12, 1)) {
                }
            } else {
                for (int i13 = 0; i13 < jArr2.length; i13 = aa.d.g(jArr2[i13], arrayList3, i13, 1)) {
                }
            }
            if (!arrayList4.isEmpty() && z10) {
                MessagesController messagesController = MessagesController.getInstance(this.K);
                int[] iArr = {arrayList4.size()};
                jq jqVar = new jq(this, iArr, jArr2, 18);
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    long longValue = ((Long) arrayList4.get(i14)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer inputPeer = messagesController.getInputPeer(longValue);
                    tL_stories_getPeerStories.peer = inputPeer;
                    if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else if (inputPeer == null) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.K).sendRequest(tL_stories_getPeerStories, new bg.f0(messagesController, longValue, jqVar, 6));
                    }
                }
                return;
            }
            long clientUserId = UserConfig.getInstance(this.K).getClientUserId();
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i15)).peer);
                if (peerDialogId != clientUserId && !arrayList3.contains(Long.valueOf(peerDialogId)) && storiesController.J(peerDialogId)) {
                    arrayList3.add(Long.valueOf(peerDialogId));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (R instanceof dy) {
                    try {
                        a2 = ih.e7.a(((dy) R).A0.h);
                    } catch (Exception unused) {
                    }
                    ih.e7 e7Var = a2;
                    R.getOrCreateStoryViewer().v();
                    R.getOrCreateStoryViewer().G(this, null, arrayList3, 0, null, null, e7Var, false);
                }
                a2 = null;
                ih.e7 e7Var2 = a2;
                R.getOrCreateStoryViewer().v();
                R.getOrCreateStoryViewer().G(this, null, arrayList3, 0, null, null, e7Var2, false);
            }
        }
    }

    public final void m0(final int i9, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        ih.n6 n6Var;
        ih.n6 A;
        MessageObject f10;
        MessageObject f11;
        TL_stories.StoryItem storyItem2;
        ih.v6 storiesController = MessagesController.getInstance(this.K).getStoriesController();
        TL_stories.PeerStories y10 = storiesController.y(j10);
        ih.e7 e7Var = null;
        if (y10 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < y10.stories.size()) {
                    if (y10.stories.get(i10).f22617id == i9) {
                        storyItem2 = y10.stories.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    storyItem2 = null;
                    break;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j10;
                org.telegram.ui.ActionBar.o2 R = R();
                if (R != null) {
                    if (R instanceof dy) {
                        try {
                            e7Var = ih.e7.a(((dy) R).A0.h);
                        } catch (Exception unused) {
                        }
                    }
                    R.getOrCreateStoryViewer().v();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z10) {
                        R.getOrCreateStoryViewer().f11826s1 = true;
                    }
                    R.getOrCreateStoryViewer().G(this, storyItem2, arrayList, 0, null, y10, e7Var, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            ih.n6 A2 = storiesController.A(j10, 0, -1, true);
            if (A2 != null && (f11 = A2.f(i9)) != null) {
                storyItem = f11.storyItem;
                n6Var = A2;
            } else {
                n6Var = null;
            }
            if (storyItem == null && (A = storiesController.A(j10, 1, -1, true)) != null && (f10 = A.f(i9)) != null) {
                storyItem = f10.storyItem;
                n6Var = A;
            }
            if (storyItem != null && n6Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.o2 R2 = R();
                if (R2 == null) {
                    return;
                }
                if (R2 instanceof dy) {
                    try {
                        e7Var = ih.e7.a(((dy) R2).A0.h);
                    } catch (Exception unused2) {
                    }
                }
                ih.e7 e7Var2 = e7Var;
                R2.getOrCreateStoryViewer().v();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    R2.getOrCreateStoryViewer().f11826s1 = true;
                }
                R2.getOrCreateStoryViewer().G(this, storyItem, arrayList2, 0, n6Var, null, e7Var2, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.K).getInputPeer(j10);
        tL_stories_getStoriesByID.f22624id.add(Integer.valueOf(i9));
        ConnectionsManager.getInstance(this.K).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.yf(LaunchActivity.this, tLObject, i9, j10, z10));
            }
        });
    }

    public final void n0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z10;
        int i9 = e6Var.f22909b0;
        org.telegram.ui.ActionBar.d6 f10 = e6Var.f(tL_theme, this.K, 0);
        e6Var.V = e6Var.U;
        e6Var.u(f10.f22866a);
        f10.f22882s = tL_wallPaper;
        if (i9 != e6Var.f22909b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0(new oc1(e6Var, z10, 0, false, false));
    }

    public final void o0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.o0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f35508g0 == actionMode) {
            this.f35508g0 = null;
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.m0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f22688y;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.f22680s0 = false;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35522o0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f22688y;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.f22680s0 = false;
                ActionBarLayout actionBarLayout3 = this.f35520n0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f22688y;
                if (kVar3 != null) {
                    kVar3.setVisibility(0);
                }
                actionBarLayout3.f22680s0 = false;
            }
        }
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.f35508g0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.m0.s(menu) && AndroidUtilities.isTablet() && !this.f35522o0.s(menu)) {
                this.f35520n0.s(menu);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.m0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f22688y;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.f22680s0 = true;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35522o0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f22688y;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.f22680s0 = true;
                ActionBarLayout actionBarLayout3 = this.f35520n0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f22688y;
                if (kVar3 != null) {
                    kVar3.setVisibility(8);
                }
                actionBarLayout3.f22680s0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i9, int i10, Intent intent) {
        ih.i4 currentPeerView;
        org.telegram.ui.Components.u71 u71Var;
        VoIPService sharedInstance;
        boolean z10 = false;
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onActivityResult");
            }
            UserConfig.getInstance(this.K).saveConfig(false);
        }
        if (i9 == 105) {
            if (Build.VERSION.SDK_INT >= 23) {
                boolean canDrawOverlays = Settings.canDrawOverlays(this);
                ApplicationLoader.canDrawOverlays = canDrawOverlays;
                if (canDrawOverlays) {
                    o50 o50Var = o50.f40880z3;
                    if (o50Var != null) {
                        o50Var.dismissInternal();
                    }
                    AndroidUtilities.runOnUIThread(new l80(this, 4), 200L);
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i9, i10, intent);
        if (i9 == 520) {
            if (i10 == -1 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
                sharedInstance.createCaptureDevice(true);
            }
        } else if (i9 == 140) {
            LocationController locationController = LocationController.getInstance(this.K);
            if (i10 == -1) {
                z10 = true;
            }
            locationController.startFusedLocationRequest(z10);
        } else if (i9 == 521) {
            kh.i9 i9Var = this.f35519m1;
            if (i9Var != null) {
                if (i10 == -1) {
                    z10 = true;
                }
                i9Var.run(Boolean.valueOf(z10));
                this.f35519m1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f26553n;
            if (themeEditorView != null && (u71Var = themeEditorView.f26562k) != null) {
                u71Var.a(i9, i10, intent);
            }
            ActionBarLayout actionBarLayout = this.m0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.o2 o2Var = this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1);
                o2Var.onActivityResultFragment(i9, i10, intent);
                if (o2Var.getLastStoryViewer() != null && (currentPeerView = o2Var.getLastStoryViewer().f11806j0.getCurrentPeerView()) != null && i10 == -1) {
                    if (i9 != 0 && i9 != 2) {
                        if (i9 == 21) {
                            if (intent == null) {
                                currentPeerView.Z0();
                            } else {
                                if (intent.getData() != null) {
                                    currentPeerView.S0(intent.getData());
                                } else if (intent.getClipData() != null) {
                                    ClipData clipData = intent.getClipData();
                                    for (int i11 = 0; i11 < clipData.getItemCount(); i11++) {
                                        currentPeerView.S0(clipData.getItemAt(i11).getUri());
                                    }
                                } else {
                                    currentPeerView.Z0();
                                }
                                ih.u2 u2Var = currentPeerView.E2;
                                if (u2Var != null) {
                                    u2Var.dismiss();
                                }
                                currentPeerView.k0(true);
                            }
                        }
                    } else {
                        currentPeerView.t0();
                        ih.u2 u2Var2 = currentPeerView.E2;
                        if (u2Var2 != null) {
                            u2Var2.f30114f0.f0(i9, intent, null);
                        }
                    }
                }
            }
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35522o0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f35522o0.getFragmentStack().get(this.f35522o0.getFragmentStack().size() - 1).onActivityResultFragment(i9, i10, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f35520n0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f35520n0.getFragmentStack().get(this.f35520n0.getFragmentStack().size() - 1).onActivityResultFragment(i9, i10, intent);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onActivityResultReceived, Integer.valueOf(i9), Integer.valueOf(i10), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (c0(true)) {
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f35520n0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f35520n0.G();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f35522o0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f35522o0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.f35522o0.getFragmentStack().get(this.f35522o0.getFragmentStack().size() - 1);
                    if (o2Var.onBackPressed(true)) {
                        o2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.m0.G();
                return;
            }
            this.m0.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        this.f35514j0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        AndroidUtilities.resetTabletFlag();
        a0();
        F();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
        if (pipRoundVideoView != null) {
            int i9 = pipRoundVideoView.f26433x.getInt("sidex", 1);
            int i10 = pipRoundVideoView.f26433x.getInt("sidey", 0);
            float f10 = pipRoundVideoView.f26433x.getFloat("px", 0.0f);
            float f11 = pipRoundVideoView.f26433x.getFloat("py", 0.0f);
            pipRoundVideoView.v.x = PipRoundVideoView.b(true, i9, f10, pipRoundVideoView.h);
            pipRoundVideoView.v.y = PipRoundVideoView.b(false, i10, f11, pipRoundVideoView.f26429n);
            pipRoundVideoView.f26432w.updateViewLayout(pipRoundVideoView.f26424a, pipRoundVideoView.v);
        }
        org.telegram.ui.Components.gu guVar = org.telegram.ui.Components.gu.O;
        if (guVar != null) {
            guVar.onConfigurationChanged(configuration);
        }
        bg.a0 a0Var = bg.a0.f1690e;
        if (a0Var != null) {
            a0Var.onConfigurationChanged(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.P8;
        ThemeEditorView themeEditorView = ThemeEditorView.f26553n;
        if (themeEditorView != null) {
            int i11 = themeEditorView.f26561j.getInt("sidex", 1);
            int i12 = themeEditorView.f26561j.getInt("sidey", 0);
            float f12 = themeEditorView.f26561j.getFloat("px", 0.0f);
            float f13 = themeEditorView.f26561j.getFloat("py", 0.0f);
            themeEditorView.f26559g.x = ThemeEditorView.b(true, i11, f12, themeEditorView.f26557e);
            themeEditorView.f26559g.y = ThemeEditorView.b(false, i12, f13, themeEditorView.f26558f);
            try {
                if (themeEditorView.f26554a.getParent() != null) {
                    themeEditorView.h.updateViewLayout(themeEditorView.f26554a, themeEditorView.f26559g);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (org.telegram.ui.ActionBar.f6.f23190o == 3) {
            org.telegram.ui.ActionBar.f6.E(false);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i9;
        String str;
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        f35494y1 = true;
        f35495z1++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        C1 = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.K = UserConfig.selectedAccount;
        registerReceiver(this.f35499b1, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (!UserConfig.getInstance(this.K).isClientActivated() && (intent = getIntent()) != null && intent.getAction() != null) {
            if (!"android.intent.action.SEND".equals(intent.getAction()) && !"android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null) {
                    String lowerCase = data.toString().toLowerCase();
                    if (!lowerCase.startsWith("tg:proxy") && !lowerCase.startsWith("tg://proxy") && !lowerCase.startsWith("tg:socks")) {
                        lowerCase.startsWith("tg://socks");
                    }
                }
            } else {
                super.onCreate(bundle);
                finish();
                return;
            }
        }
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23269s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        getWindow().setFormat(-1);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new org.telegram.ui.Components.if0(27));
        this.f35497a1 = flagSecureReason;
        flagSecureReason.attach();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            AndroidUtilities.isInMultiwindow = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.f6.N();
        org.telegram.ui.ActionBar.f6.R(this);
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        this.m0 = new ActionBarLayout(this, true);
        m0 m0Var = new m0(this, this, 10);
        this.f35530s0 = m0Var;
        m0Var.setClipToPadding(false);
        this.f35530s0.setClipChildren(false);
        setContentView(this.f35530s0);
        this.f35501c1 = new xg.e(this.f35530s0);
        ja0 ja0Var = new ja0(this);
        m.t3 t3Var = this.f35512i0;
        ((xe.b) t3Var.f17099b).f49120a.add(ja0Var);
        ((ViewGroup) getWindow().getDecorView()).addView(t3Var.b());
        t3Var.b().bringToFront();
        ImageView imageView = new ImageView(this);
        this.f35516k0 = imageView;
        imageView.setVisibility(8);
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this);
        this.f35536v0 = x3Var;
        x3Var.setActionBarLayout(this.m0);
        this.f35536v0.addOnLayoutChangeListener(new Object());
        this.f35536v0.setClipChildren(false);
        this.f35536v0.setClipToPadding(false);
        this.f35530s0.addView(this.f35536v0, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.ge geVar = new org.telegram.ui.Components.ge(this, 3);
        this.f35518l0 = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f35530s0.addView(this.f35518l0, g7.e6.c(48.0f, 48));
        this.f35518l0.setVisibility(8);
        m0 m0Var2 = this.f35530s0;
        org.telegram.ui.ActionBar.v3 v3Var = new org.telegram.ui.ActionBar.v3(this);
        this.f35534u0 = v3Var;
        m0Var2.addView(v3Var);
        m0 m0Var3 = this.f35530s0;
        ?? c00Var = new org.telegram.ui.Components.c00(this);
        c00Var.setVisibility(8);
        this.f35532t0 = c00Var;
        m0Var3.addView(c00Var);
        A0();
        this.f35536v0.setParentActionBarLayout(this.m0);
        this.m0.setDrawerLayoutContainer(this.f35536v0);
        this.m0.setFragmentStack(this.Z);
        this.m0.setFragmentStackChangedListener(new l80(this, 2));
        this.m0.setDelegate(this);
        org.telegram.ui.ActionBar.f6.j1(true);
        A();
        M0();
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i10 = NotificationCenter.closeOtherAppActivities;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i10, this);
        this.Y = ConnectionsManager.getInstance(this.K).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.f35515j1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f35515j1 = null;
        }
        this.f35515j1 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i10).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        k90 k90Var = new k90(this, 0);
        this.l1 = k90Var;
        LiteMode.addOnPowerSaverAppliedListener(k90Var);
        if (this.m0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f35520n0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!UserConfig.getInstance(this.K).isClientActivated()) {
                this.m0.c(-1, Q());
            } else {
                this.m0.c(-1, new ng0());
            }
            if (bundle != null) {
                try {
                    String string = bundle.getString("fragment");
                    if (string != null) {
                        Bundle bundle2 = bundle.getBundle("args");
                        switch (string.hashCode()) {
                            case -1529105743:
                                if (string.equals("wallpapers")) {
                                    WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(0);
                                    this.m0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.m0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    qn qnVar = new qn(bundle2);
                                    if (this.m0.c(-1, qnVar)) {
                                        qnVar.R7 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    r60 r60Var = new r60(bundle2);
                                    if (this.m0.c(-1, r60Var)) {
                                        r60Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    id idVar = new id(bundle2);
                                    if (this.m0.c(-1, idVar)) {
                                        idVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", UserConfig.getInstance(this.K).clientUserId);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.m0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.m0.c(-1, new z71(null));
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        F();
        H(false, true, !this.S0);
        Intent intent2 = getIntent();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        X(intent2, false, z10, false, null, true, true);
        try {
            String str2 = Build.DISPLAY;
            String str3 = Build.USER;
            String str4 = "";
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase();
            }
            if (str3 != null) {
                str4 = str.toLowerCase();
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("OS name " + str + " " + str4);
            }
            if ((str.contains("flyme") || str4.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                AndroidUtilities.incorrectDisplaySizeFix = true;
                View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                l90 l90Var = new l90(rootView, 0);
                this.f35500c0 = l90Var;
                viewTreeObserver.addOnGlobalLayoutListener(l90Var);
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            FingerprintController.checkKeyReady();
        }
        if (i11 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000 && SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
            Pattern pattern = org.telegram.ui.Components.y4.f34847a;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String string2 = LocaleController.getString(R.string.AllowBackgroundActivity);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string2;
            if (OneUIUtilities.isOneUI()) {
                if (i11 >= 31) {
                    i9 = R.string.AllowBackgroundActivityInfoOneUIAboveS;
                } else {
                    i9 = R.string.AllowBackgroundActivityInfoOneUIBelowS;
                }
            } else {
                i9 = R.string.AllowBackgroundActivityInfo;
            }
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(i9));
            alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new org.telegram.ui.Components.f1(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            c2Var.setOnDismissListener(new kh.g1(3));
            c2Var.show();
            SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
        }
        if (i11 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new ma0(this));
        }
        org.telegram.ui.Components.gc.a(this.f35530s0, new bg.z(14));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        b31.U(false);
        if (i11 >= 34) {
            if (this.f35507f1 == null) {
                this.f35507f1 = new na0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f35507f1);
        } else if (i11 >= 33) {
            if (this.f35509g1 == null) {
                this.f35509g1 = new oa0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f35509g1);
        }
        B();
    }

    @Override
    public final void onDestroy() {
        ff.b0 b0Var;
        m0 m0Var;
        f35494y1 = false;
        f35495z1--;
        unregisterReceiver(this.f35499b1);
        if (f35495z1 == 0) {
            if (PhotoViewer.W8 != null) {
                PhotoViewer.W8.P0();
            }
            if (PhotoViewer.C1()) {
                PhotoViewer.t1().P0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f10 = SecretMediaViewer.f();
                Runnable runnable = f10.l1;
                if (runnable != null) {
                    runnable.run();
                    f10.l1 = null;
                }
                ff.t0 t0Var = f10.f36136h1;
                if (t0Var != null) {
                    t0Var.destroy();
                    f10.f36136h1 = null;
                }
                NotificationCenter.getInstance(f10.f36116a).removeObserver(f10, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f10.f36116a).removeObserver(f10, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f10.f36116a).removeObserver(f10, NotificationCenter.didCreatedNewDeleteTask);
                f10.f36157s = false;
                f10.J = null;
                ImageReceiver.BitmapHolder bitmapHolder = f10.f36128e0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f10.f36128e0 = null;
                }
                f10.i();
                if (f10.f36119b != null && (m0Var = f10.d) != null) {
                    try {
                        if (m0Var.getParent() != null) {
                            ((WindowManager) f10.f36119b.getSystemService("window")).removeViewImmediate(f10.d);
                        }
                        f10.d = null;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                SecretMediaViewer.f36115t1 = null;
            }
            if (l4.I()) {
                l4.x().t();
            }
            if (ht.f38908g0 != null) {
                ht q10 = ht.q();
                q10.E = false;
                q10.f38923l = null;
                q10.W = null;
                q10.Y = null;
                q10.f38910a0 = null;
                if (q10.f38933w != null && q10.f38935y != null) {
                    Bitmap bitmap = q10.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        q10.v = null;
                    }
                    q10.M = 0.0f;
                    q10.K = false;
                    try {
                        if (q10.f38935y.getParent() != null) {
                            ((WindowManager) q10.f38933w.getSystemService("window")).removeViewImmediate(q10.f38935y);
                        }
                        q10.f38935y = null;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    ht.f38908g0 = null;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
                }
            }
            o50 o50Var = o50.f40880z3;
            if (o50Var != null) {
                o50Var.dismissInternal();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i9 = org.telegram.ui.ActionBar.f6.f22941a;
            org.telegram.ui.Components.gu guVar = org.telegram.ui.Components.gu.O;
            if (guVar != null) {
                guVar.G();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f26553n;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            uf.h hVar = g7.v7.f7389a;
            if (hVar != null) {
                hVar.f48221e.edit().putFloat("x", (float) hVar.f48220c.f18800u.f18807i).putFloat("y", (float) hVar.d.f18800u.f18807i).commit();
            }
            g7.v7.f7389a = null;
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.f35523o1, false);
        for (int i10 = 0; i10 < this.A0.size(); i10++) {
            try {
                if (((Dialog) this.A0.get(i10)).isShowing()) {
                    ((Dialog) this.A0.get(i10)).dismiss();
                }
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        this.A0.clear();
        try {
            if (this.f35500c0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f35500c0);
            }
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (this.f35507f1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f35507f1);
            }
        } else if (i11 >= 33 && this.f35507f1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f35509g1);
        }
        org.telegram.ui.Components.gc.h(this.f35530s0);
        VideoAds.dropCache();
        K();
        super.onDestroy();
        d0();
        FlagSecureReason flagSecureReason = this.f35497a1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i11 >= 24 && (b0Var = this.f35505e1) != null) {
            b0Var.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 == 82 && !SharedConfig.isWaitingForPasscodeEnter) {
            if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                return super.onKeyUp(i9, keyEvent);
            }
            if (l4.I() && l4.x().R) {
                return super.onKeyUp(i9, keyEvent);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f35520n0.getView().getVisibility() == 0 && !this.f35520n0.getFragmentStack().isEmpty()) {
                    this.f35520n0.getView().onKeyUp(i9, keyEvent);
                } else if (this.f35522o0.getView().getVisibility() == 0 && !this.f35522o0.getFragmentStack().isEmpty()) {
                    this.f35522o0.getView().onKeyUp(i9, keyEvent);
                } else {
                    this.m0.getView().onKeyUp(i9, keyEvent);
                }
            } else {
                this.m0.getView().onKeyUp(i9, keyEvent);
            }
        }
        return super.onKeyUp(i9, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.m0;
        if (actionBarLayout != null) {
            actionBarLayout.J();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35522o0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.J();
                }
                ActionBarLayout actionBarLayout3 = this.f35520n0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.J();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z10) {
        AndroidUtilities.isInMultiwindow = z10;
        F();
        super.onMultiWindowModeChanged(z10);
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        X(intent, true, false, false, null, true, true);
    }

    @Override
    public final void onPause() {
        boolean z10;
        boolean z11;
        VoIPService sharedInstance;
        super.onPause();
        A1 = false;
        xe.b bVar = this.f35514j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (AndroidUtilities.isInPictureInPictureMode(bVar.d) && bVar.e() && Build.VERSION.SDK_INT >= 31) {
            bVar.b();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        Utilities.stageQueue.postRunnable(new mh.k2(this.K, 11));
        f0();
        this.m0.L();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.f35522o0;
            if (actionBarLayout != null) {
                actionBarLayout.L();
            }
            ActionBarLayout actionBarLayout2 = this.f35520n0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.L();
            }
        }
        org.telegram.ui.Components.ad0 ad0Var = this.f35538w0;
        if (ad0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ad0Var.f26775b.N);
        }
        ArrayList arrayList = this.f35540x0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            AndroidUtilities.cancelRunOnUIThread(((org.telegram.ui.Components.yc0) obj).N);
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            z10 = applicationLoader.onPause();
        } else {
            z10 = false;
        }
        ConnectionsManager.getInstance(this.K).setAppPaused(!z10, false);
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            if (t12.f35629f2 != null) {
                t12.F0(false, false);
            } else {
                org.telegram.ui.Components.k61 k61Var = t12.B2;
                if (k61Var != null && t12.V2) {
                    k61Var.O(AndroidUtilities.isInPictureInPictureMode(t12.f35797y));
                }
            }
        }
        kh.wb wbVar = kh.wb.B2;
        if (wbVar != null) {
            wbVar.v(false);
            kh.mb mbVar = wbVar.Y0;
            if (mbVar != null) {
                mbVar.f15632f.r();
            }
            kh.kb kbVar = wbVar.T0;
            if (kbVar != null) {
                kbVar.x(0, true);
            }
        }
        mh1 mh1Var = mh1.f40427j1;
        if (mh1Var != null) {
            boolean isInteractive = ((PowerManager) mh1Var.f40431b.getSystemService("power")).isInteractive();
            int a2 = af.d.a(mh1Var.f40431b);
            if (a2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (mh1Var.f40472z0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a2 == 2) {
                int measuredHeight = mh1.f40427j1.f40458q0.getMeasuredHeight();
                mh1 mh1Var2 = mh1.f40427j1;
                org.telegram.ui.Components.voip.l2.l(mh1Var2.f40431b, mh1Var2.f40428a, mh1Var2.f40458q0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = mh1.f40427j1.f40455n0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.l2.S = windowInsets.getSystemWindowInsetTop();
                    mh1.f40427j1.f40455n0.getSystemWindowInsetBottom();
                }
            }
            if (mh1Var.f40451j0 && ((!z11 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.l2.k() != null) {
                org.telegram.ui.Components.voip.l2 k10 = org.telegram.ui.Components.voip.l2.k();
                if (k10.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (k10.B) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = dh.k.f4601n;
        if (hashMap != null) {
            for (dh.k kVar : hashMap.values()) {
                dh.j jVar = kVar.f4606f;
                if (jVar != null) {
                    jVar.f4591b = true;
                }
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        xe.b bVar = this.f35514j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (bVar.f49124f) {
            if (z10) {
                bVar.d(1.0f);
                bVar.f49127j.a();
                ArrayList arrayList = bVar.f49121b;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((ye.b) obj).getClass();
                }
                if (bVar.f49131n) {
                    bVar.f49131n = false;
                    bVar.f49129l.removeFrameCallback(bVar.f49130m);
                }
                ArrayList arrayList2 = bVar.f49120a;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    ((ye.c) obj2).f();
                }
            } else if (bVar.f49123e) {
                bVar.c(false);
            } else {
                bVar.a(true);
            }
        }
        if (!z10 && !this.f35521n1) {
            if (org.telegram.ui.Components.voip.g1.Z.R) {
                org.telegram.ui.Components.voip.g1.j();
            }
            if (ih.k1.V.O) {
                ih.k1.j();
            }
            if (org.telegram.ui.Components.pf0.f31622l0.L) {
                org.telegram.ui.Components.pf0.j(false);
            }
            o50.t1(this, null, false, true);
            if (PhotoViewer.W8 != null) {
                PhotoViewer.W8.P0();
            }
            if (PhotoViewer.C1()) {
                PhotoViewer.t1().F0(false, false);
            }
        }
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        xe.b bVar = this.f35514j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        bVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.f35514j0.g(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        boolean z10;
        bg.c2 c2Var;
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (u(i9, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null && applicationLoader.checkRequestPermissionResult(i9, strArr, iArr)) {
                return;
            }
            if (this.m0.getFragmentStack().size() != 0) {
                this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i9, strArr, iArr);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f35522o0.getFragmentStack().size() != 0) {
                    this.f35522o0.getFragmentStack().get(this.f35522o0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i9, strArr, iArr);
                }
                if (this.f35520n0.getFragmentStack().size() != 0) {
                    this.f35520n0.getFragmentStack().get(this.f35520n0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i9, strArr, iArr);
                }
            }
            mh1.q(i9, iArr);
            kh.wb wbVar = kh.wb.B2;
            if (wbVar != null) {
                ih.b bVar = wbVar.f16246a;
                Activity activity = wbVar.f16249b;
                if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i9 == 111) {
                    wbVar.f16293o2 = !z10;
                    if (z10 && wbVar.f16250b0 == 0) {
                        wbVar.f16318w0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            wbVar.r();
                        } else {
                            CameraController.getInstance().initCamera(new kh.v9(wbVar, 0));
                        }
                    }
                } else if (i9 == 114) {
                    if (z10) {
                        MediaController.loadGalleryPhotosAlbums(0);
                        wbVar.f(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint));
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
                        c2Var2.P = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new kh.ea(wbVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        c2Var2.show();
                    }
                } else if (i9 == 112) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                        SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.f22702a;
                        c2Var3.P = replaceTags2;
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new kh.ea(wbVar, 3));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        c2Var3.show();
                    }
                } else if (i9 == 115) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                        SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory));
                        org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder3.f22702a;
                        c2Var4.P = replaceTags3;
                        alertDialog$Builder3.k(LocaleController.getString(R.string.PermissionOpenSettings), new kh.ea(wbVar, 5));
                        alertDialog$Builder3.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        c2Var4.show();
                    }
                    if (z10 && (c2Var = wbVar.f16313u2) != null) {
                        c2Var.run();
                    }
                    wbVar.f16313u2 = null;
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i9), strArr, iArr);
            SparseIntArray sparseIntArray = this.X0;
            if (sparseIntArray.get(i9, -1) >= 0) {
                int i10 = sparseIntArray.get(i9, -1);
                sparseIntArray.delete(i9);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.permissionsGranted, Integer.valueOf(i10));
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activityPermissionsGranted, Integer.valueOf(i9), strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        MessageObject playingMessageObject;
        xf.a1 a1Var;
        super.onResume();
        A1 = true;
        xe.b bVar = this.f35514j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (bVar.f49124f) {
            bVar.a(false);
        }
        org.telegram.ui.Components.yt ytVar = B1;
        if (ytVar != null) {
            ytVar.run();
            B1 = null;
        }
        if (org.telegram.ui.ActionBar.f6.f23190o == 3) {
            org.telegram.ui.ActionBar.f6.E(false);
        }
        J(true);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.m0.getView();
        this.f35523o1 = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.K).sortDialogs(null);
        E0();
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.hc(25));
        D(0);
        MediaController.checkGallery();
        g0();
        org.telegram.ui.Components.ad0 ad0Var = this.f35538w0;
        if (ad0Var != null && ad0Var.f26775b.getVisibility() == 0) {
            this.m0.n();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f35522o0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f35520n0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.f35538w0.f26775b.i();
            ArrayList arrayList = this.f35540x0;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((org.telegram.ui.Components.yc0) obj).i();
            }
        } else {
            this.m0.M();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.f35522o0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
                ActionBarLayout actionBarLayout4 = this.f35520n0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.M();
                }
            }
        }
        ConnectionsManager.getInstance(this.K).setAppPaused(false, false);
        M0();
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            tt0 tt0Var = t12.f35580a0;
            if (tt0Var != null) {
                tt0Var.invalidate();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qd(t12, 0, 21), 100L);
            }
            org.telegram.ui.Components.k61 k61Var = t12.B2;
            if (k61Var != null) {
                k61Var.L(k61Var.o() + 1);
                if (t12.V2) {
                    t12.B2.O(true);
                }
            }
            xs0 xs0Var = t12.H1;
            if (xs0Var != null && (a1Var = xs0Var.S0.d) != null) {
                a1Var.postRunnable(a1Var.f49167w);
            }
        }
        kh.wb wbVar = kh.wb.B2;
        if (wbVar != null) {
            wbVar.P();
        }
        if (PipRoundVideoView.B != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            MediaController.getInstance().seekToProgress(playingMessageObject, playingMessageObject.audioProgress);
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).unacceptedTermsOfService != null) {
            int i10 = UserConfig.selectedAccount;
            H0(i10, UserConfig.getInstance(i10).unacceptedTermsOfService);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = SharedConfig.pendingAppUpdate;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                I0(UserConfig.selectedAccount, tL_help_appUpdate, true);
            }
        }
        z(false);
        if (Build.VERSION.SDK_INT >= 23) {
            ApplicationLoader.canDrawOverlays = Settings.canDrawOverlays(this);
        }
        mh1 mh1Var = mh1.f40427j1;
        if (mh1Var != null) {
            if (org.telegram.ui.Components.voip.l2.k() != null) {
                org.telegram.ui.Components.voip.l2.i();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                mh1Var.H();
            } else if (VoIPService.getSharedState() == null) {
                mh1Var.f40458q0.b();
            }
            mh1Var.F0 = ((KeyguardManager) mh1Var.f40431b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.l2.k() != null) {
                org.telegram.ui.Components.voip.l2.k().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        a0();
        HashMap hashMap = dh.k.f4601n;
        if (hashMap != null) {
            for (dh.k kVar : hashMap.values()) {
                dh.j jVar = kVar.f4606f;
                if (jVar != null) {
                    jVar.f4591b = false;
                }
            }
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onResume();
        }
        c0 c0Var = E1;
        if (c0Var != null) {
            c0Var.run();
            E1 = null;
        }
        if (MessagesController.getInstance(this.K).hasSetupEmailSuggestion()) {
            MessagesController.getInstance(this.K).checkPromoInfo(true);
        }
    }

    @Override
    public final void onSaveInstanceState(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override
    public final void onStart() {
        Activity activity;
        super.onStart();
        this.f35521n1 = true;
        this.f35514j0.h();
        WeakReference weakReference = ve.e.f48387e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            ve.e.x(activity);
        }
        if (ve.e.f48385b == null) {
            ve.e.f48387e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(ve.e.d)) {
                    String a2 = f7.v6.a(this);
                    ve.e.d = a2;
                    if (a2 == null) {
                    }
                }
                Object obj = new Object();
                df.a aVar = new df.a();
                aVar.f4482b = new WeakReference(obj);
                ve.e.f48386c = aVar;
                String str = ve.e.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, aVar, 33)) {
                    ve.e.f48386c = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        ApplicationLoader.mainInterfaceStopped = false;
        org.telegram.ui.Components.j20.j(this);
        o50 o50Var = o50.f40880z3;
        if (o50Var != null) {
            ArrayList arrayList = o50Var.V1;
            o50.E3 = false;
            o50Var.L.l();
            c30 c30Var = o50Var.f40917i2;
            if (c30Var.getVisibility() == 0) {
                o50Var.f40928l2.G(c30Var, false);
            }
            if (o50.C3) {
                o50Var.f40925k2.I(o50Var.f40921j2, false);
            }
            arrayList.clear();
            arrayList.addAll(o50Var.U1);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).j(true);
            }
            s40 s40Var = o50Var.H;
            org.telegram.ui.Components.q71 q71Var = s40Var.v;
            if (q71Var != null) {
                q71Var.c(true);
            }
            s40Var.B = false;
            o50Var.D.s();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        this.f35521n1 = false;
        xe.b bVar = this.f35514j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        bVar.f49123e = false;
        if (bVar.f49124f) {
            bVar.c(true);
        }
        bVar.d.unregisterReceiver(bVar.f49132o);
        ve.e.x(this);
        ApplicationLoader.mainInterfaceStopped = true;
        org.telegram.ui.Components.j20.j(this);
        o50 o50Var = o50.f40880z3;
        if (o50Var != null) {
            o50.E3 = true;
            ArrayList arrayList = o50Var.V1;
            arrayList.clear();
            arrayList.addAll(o50Var.U1);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).j(false);
            }
            s40 s40Var = o50Var.H;
            org.telegram.ui.Components.q71 q71Var = s40Var.v;
            if (q71Var != null) {
                q71Var.c(false);
            }
            s40Var.B = true;
            o50Var.D.r();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f35503d1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        xe.b bVar = this.f35514j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        bVar.f();
        ArrayList arrayList = this.W0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.m0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.K0.isEmpty()) {
                ((org.telegram.ui.ActionBar.o2) j3.r0.k(1, actionBarLayout.K0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.r rVar = actionBarLayout.C;
            if (rVar != null) {
                rVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(org.telegram.ui.ActionBar.o2 o2Var) {
        ((ActionBarLayout) O()).P(o2Var);
    }

    public final boolean q0(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) O()).S(o2Var, z10, z11);
    }

    public final void r0(long j10) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.A0;
            if (i9 < arrayList.size()) {
                if (arrayList.get(i9) instanceof mh.c3) {
                    mh.c3 c3Var = (mh.c3) arrayList.get(i9);
                    if (c3Var.isShowing() && c3Var.D == j10) {
                        return;
                    }
                }
                i9++;
            } else {
                org.telegram.ui.ActionBar.o2 U = U();
                if (U != null && U.sheetsStack != null) {
                    for (int i10 = 0; i10 < U.sheetsStack.size(); i10++) {
                        if (U.sheetsStack.get(i10).isShown()) {
                            U.sheetsStack.get(i10);
                        }
                    }
                }
                qy w8 = this.m0.w();
                if (w8 != null && w8.sheetsStack != null) {
                    for (int i11 = 0; i11 < w8.sheetsStack.size(); i11++) {
                        if (w8.sheetsStack.get(i11).isShown()) {
                            w8.sheetsStack.get(i11);
                        }
                    }
                }
                k90 k90Var = new k90(this, 1);
                TLRPC.User user = MessagesController.getInstance(this.K).getUser(Long.valueOf(j10));
                if (user != null) {
                    k90Var.run(user);
                    return;
                } else {
                    MessagesStorage.getInstance(this.K).getStorageQueue().postRunnable(new r90(this, j10, k90Var, 0));
                    return;
                }
            }
        }
    }

    public final void s0(Long l10, x20 x20Var, ve.d dVar, org.telegram.ui.Cells.t1 t1Var) {
        ChannelBoostsController boostsController = MessagesController.getInstance(this.K).getBoostsController();
        if (dVar != null) {
            dVar.d();
        }
        boostsController.getBoostsStats(l10.longValue(), new k80(this, dVar, x20Var, boostsController, l10, t1Var));
    }

    @Override
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        xe.b bVar = this.f35514j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        bVar.h = pictureInPictureParams;
    }

    public final void t0(final int i9, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i10, final int i11, final String str23, final String str24, final String str25, String str26, final String str27, final ve.d dVar, final boolean z12, final int i12, final int i13, final int i14, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i9).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35493x1;
                final ve.d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i15 = i9;
                final boolean z22 = z12;
                final boolean z23 = z16;
                final boolean z24 = z17;
                final boolean z25 = z18;
                if (tL_error != null) {
                    final String str30 = str;
                    final String str31 = str2;
                    final String str32 = str3;
                    final String str33 = str4;
                    final String str34 = str5;
                    final String str35 = str6;
                    final String str36 = str7;
                    final String str37 = str8;
                    final String str38 = str9;
                    final String str39 = str10;
                    final String str40 = str11;
                    final String str41 = str12;
                    final boolean z26 = z10;
                    final Integer num3 = num;
                    final Long l12 = l10;
                    final Long l13 = l11;
                    final Integer num4 = num2;
                    final String str42 = str13;
                    final HashMap hashMap2 = hashMap;
                    final String str43 = str14;
                    final String str44 = str15;
                    final String str45 = str16;
                    final String str46 = str17;
                    final TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
                    final String str47 = str18;
                    final String str48 = str19;
                    final String str49 = str20;
                    final String str50 = str21;
                    final boolean z27 = z11;
                    final String str51 = str22;
                    final int i16 = i10;
                    final int i17 = i11;
                    final String str52 = str23;
                    final String str53 = str24;
                    final String str54 = str25;
                    final int i18 = i12;
                    final int i19 = i13;
                    final int i20 = i14;
                    final boolean z28 = z13;
                    final String str55 = str28;
                    final boolean z29 = z19;
                    final boolean z30 = z20;
                    final String str56 = str29;
                    final boolean z31 = z21;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.f35493x1;
                            LaunchActivity.this.x0(i15, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, z26, num3, l12, l13, num4, str42, hashMap2, str43, str44, str45, str46, tL_wallPaper2, str47, str48, str49, str50, z27, str51, i16, i17, str52, str53, str54, null, null, dVar2, z22, i18, false, i19, i20, null, null, z28, str55, z23, z24, z25, z29, z30, str56, null, z31, null);
                        }
                    });
                    return;
                }
                final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                final Runnable runnable2 = runnable;
                final TLRPC.User user2 = user;
                final String str57 = str27;
                final boolean z32 = z15;
                final boolean z33 = z14;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.ActionBar.o2 o2Var;
                        Pattern pattern2 = LaunchActivity.f35493x1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.Z;
                        o00 o00Var = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList);
                        } else {
                            o2Var = null;
                        }
                        int i21 = i15;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str58 = str57;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z25;
                        boolean z37 = z22;
                        f90 f90Var = new f90(launchActivity2, o2Var, i21, user3, tL_messages_botApp2, atomicBoolean, str58, z34, z35, z36, z37);
                        if (z32) {
                            f90Var.run();
                        } else if (tL_messages_botApp2.inactive && z33) {
                            sb sbVar = new sb(f90Var, 2);
                            ve.d dVar3 = dVar2;
                            if (dVar3 != null) {
                                o00Var = new o00(dVar3, 14);
                            }
                            fi1.a(launchActivity2, sbVar, o00Var);
                        } else if (!tL_messages_botApp2.request_write_access && !z37) {
                            f90Var.run();
                        } else {
                            org.telegram.ui.Components.y4.n(o2Var, atomicBoolean, user3, f90Var);
                        }
                    }
                });
            }
        });
    }

    public final void u0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f35520n0;
        if (actionBarLayout != null) {
            actionBarLayout.U(z10, z10);
        } else {
            this.m0.U(z10, z10);
        }
    }

    @Override
    public final boolean v(final org.telegram.ui.dy r47, final java.util.ArrayList r48, final java.lang.CharSequence r49, final boolean r50, boolean r51, int r52, final int r53, org.telegram.ui.we1 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.v(org.telegram.ui.dy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.we1):boolean");
    }

    public final int v0(final int i9, final x20 x20Var, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i10, final int i11) {
        int longValue;
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        if (num2 != null) {
            longValue = num.intValue();
        } else {
            longValue = (int) l10.longValue();
        }
        tL_messages_getDiscussionMessage.msg_id = longValue;
        return ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35493x1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i12 = i9;
                final TLRPC.Chat chat2 = chat;
                final Long l11 = l10;
                final Integer num4 = num2;
                final Integer num5 = num;
                final Runnable runnable2 = runnable;
                final String str2 = str;
                final Integer num6 = num3;
                final byte[] bArr2 = bArr;
                final int i13 = i10;
                final int i14 = i11;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final Runnable runnable3 = x20Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t80.run():void");
                    }
                });
            }
        });
    }

    public final void w0(android.net.Uri r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.w0(android.net.Uri):void");
    }

    public final void x0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final ve.d r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.x0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ve.d, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void y(int i9) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.f35535u1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35535u1 = null;
        }
        if (i11 >= 26) {
            i10 = getWindow().getNavigationBarColor();
        } else {
            i10 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10, i9);
        this.f35535u1 = ofArgb;
        ofArgb.addUpdateListener(new j80(this, 1));
        this.f35535u1.addListener(new w0(this, i9, 3));
        this.f35535u1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f35535u1.setDuration(320L);
        this.f35535u1.start();
    }

    public final void z(boolean z10) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z10 || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    boolean z11 = this.f35517k1;
                    this.f35517k1 = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z10, new gh.u5(this, z11, update, 27));
                } else if (!z10 && Math.abs(System.currentTimeMillis() - SharedConfig.lastUpdateCheckTime) < MessagesController.getInstance(0).updateCheckDelay * 1000) {
                } else {
                    TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                    try {
                        tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
                    } catch (Exception unused) {
                    }
                    if (tL_help_getAppUpdate.source == null) {
                        tL_help_getAppUpdate.source = "";
                    }
                    int i9 = this.K;
                    ConnectionsManager.getInstance(i9).sendRequest(tL_help_getAppUpdate, new gh.u1(this, i9, 7));
                }
            }
        }
    }

    public final void z0(int i9) {
        this.f35536v0.setInternalNavigationBarColor(i9);
        org.telegram.ui.ActionBar.m3 P = P();
        if (P != null) {
            P.setNavigationBarColor(i9);
        }
    }

    @Override
    public final void e(int[] iArr) {
    }
}
