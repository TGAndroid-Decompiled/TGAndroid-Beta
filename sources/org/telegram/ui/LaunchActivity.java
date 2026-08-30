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
public class LaunchActivity extends j5 implements org.telegram.ui.ActionBar.b5, NotificationCenter.NotificationCenterDelegate, iy, df.a {
    public static int A1;
    public static boolean B1;
    public static org.telegram.ui.Components.hu C1;
    public static LaunchActivity D1;
    public static Pattern E1;
    public static c0 F1;
    public static LaunchActivity G1;
    public static final Pattern f31612y1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean f31613z1;
    public org.telegram.ui.Components.v9 A0;
    public final ArrayList B0;
    public org.telegram.ui.ActionBar.d2 C0;
    public View D0;
    public org.telegram.ui.ActionBar.d2 E0;
    public boolean F0;
    public HashMap G0;
    public HashMap H0;
    public Intent I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public String M0;
    public boolean N;
    public String N0;
    public String O;
    public TLRPC.TL_wallPaper O0;
    public String P;
    public org.telegram.ui.ActionBar.i6 P0;
    public CharSequence Q;
    public TLRPC.TL_theme Q0;
    public ArrayList R;
    public boolean R0;
    public ArrayList S;
    public org.telegram.ui.ActionBar.d2 S0;
    public ArrayList T;
    public boolean T0;
    public Uri U;
    public boolean U0;
    public String V;
    public kh.u5 V0;
    public ArrayList W;
    public z5 W0;
    public ArrayList X;
    public final ArrayList X0;
    public Uri Y;
    public final SparseIntArray Y0;
    public int Z;
    public int Z0;
    public final ta0 f31615a1;
    public FlagSecureReason f31617b1;
    public final LiteMode.BatteryReceiver f31619c1;
    public x90 f31620d0;
    public ch.e f31621d1;
    public ArrayList f31622e0;
    public boolean f31623e1;
    public ArrayList f31624f0;
    public lf.a0 f31625f1;
    public String f31626g0;
    public ya0 f31627g1;
    public ActionMode f31628h0;
    public za0 f31629h1;
    public boolean f31630i0;
    public boolean f31631i1;
    public final m.s3 f31632j0;
    public NotificationCenter.ObserversGroup f31633j1;
    public final cf.c f31634k0;
    public NotificationCenter.ObserversGroup f31635k1;
    public ImageView f31636l0;
    public boolean l1;
    public org.telegram.ui.Components.ge m0;
    public w90 f31637m1;
    public ActionBarLayout f31638n0;
    public org.telegram.ui.web.y0 f31639n1;
    public ActionBarLayout f31640o0;
    public boolean f31641o1;
    public ActionBarLayout f31642p0;
    public ViewGroup f31643p1;
    public ma0 f31644q0;
    public org.telegram.ui.ActionBar.d2 f31645q1;
    public FrameLayout f31646r0;
    public org.telegram.ui.ActionBar.d2 f31647r1;
    public org.telegram.ui.Components.z51 f31648s0;
    public boolean f31649s1;
    public l0 f31650t0;
    public long f31651t1;
    public wa0 f31652u0;
    public int[] f31653u1;
    public org.telegram.ui.ActionBar.w3 f31654v0;
    public ValueAnimator f31655v1;
    public org.telegram.ui.ActionBar.y3 f31656w0;
    public lh.gb f31657w1;
    public org.telegram.ui.Components.xd0 f31658x0;
    public int f31659x1;
    public final ArrayList f31660y0;
    public org.telegram.ui.Components.j01 f31661z0;
    public final ArrayList M = new ArrayList();
    public final ArrayList f31614a0 = new ArrayList();
    public final ArrayList f31616b0 = new ArrayList();
    public final ArrayList f31618c0 = new ArrayList();

    public LaunchActivity() {
        ?? obj = new Object();
        obj.f13641a = new HashMap();
        obj.d = this;
        obj.f13642b = new cf.c(this);
        this.f31632j0 = obj;
        this.f31634k0 = (cf.c) obj.f13642b;
        this.f31660y0 = new ArrayList();
        this.B0 = new ArrayList();
        this.T0 = false;
        this.X0 = new ArrayList();
        this.Y0 = new SparseIntArray();
        this.Z0 = 5934;
        this.f31615a1 = new Object();
        this.f31619c1 = new LiteMode.BatteryReceiver();
        this.l1 = true;
        System.identityHashCode(this);
        this.f31659x1 = 0;
    }

    public static void C0(LaunchActivity launchActivity, int i10, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z4) {
        String restrictionReason;
        org.telegram.ui.ActionBar.p2 R = R();
        if (R != null) {
            long j10 = tL_attachMenuBot.bot_id;
            rh.z3 b10 = rh.z3.b(i10, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.P() != null && launchActivity.P().m(b10) != null) {
                return;
            }
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
            if (user == null) {
                restrictionReason = null;
            } else {
                restrictionReason = MessagesController.getInstance(i10).getRestrictionReason(user.restriction_reason);
            }
            if (!TextUtils.isEmpty(restrictionReason)) {
                MessagesController.getInstance(i10);
                MessagesController.showCantOpenAlert(R, restrictionReason);
                return;
            }
            rh.q2 q2Var = new rh.q2(launchActivity, R.getResourceProvider());
            q2Var.f43709x0 = false;
            q2Var.w(z4);
            q2Var.f43689h0 = launchActivity;
            q2Var.s(R, b10);
            q2Var.show();
        }
    }

    public static void E(int i10) {
        LaunchActivity launchActivity = G1;
        if (launchActivity != null) {
            launchActivity.D(i10);
        }
    }

    public static void L() {
        cz czVar;
        ArrayList<org.telegram.ui.ActionBar.l2> arrayList;
        org.telegram.ui.ActionBar.p2 U = U();
        if (U != null) {
            if (U.getParentLayout() instanceof ActionBarLayout) {
                czVar = ((ActionBarLayout) U.getParentLayout()).w();
            } else {
                czVar = null;
            }
            if (czVar != null && (arrayList = czVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    czVar.sheetsStack.get(size).dismiss(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.l2> arrayList2 = U.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    U.sheetsStack.get(size2).dismiss(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = rh.q2.T0.iterator();
            while (it.hasNext()) {
                arrayList3.add((rh.q2) it.next());
            }
            int size3 = arrayList3.size();
            int i10 = 0;
            while (i10 < size3) {
                Object obj = arrayList3.get(i10);
                i10++;
                ((rh.q2) obj).k(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.p2 N() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.X;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.P) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = D1;
        if (launchActivity != null && !launchActivity.M.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.e5) kh.a2.i(1, D1.M))).t();
        }
        LaunchActivity launchActivity2 = D1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return ((ActionBarLayout) D1.O()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.p2 R() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.X;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.P) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = D1;
        if (launchActivity != null && !launchActivity.M.isEmpty()) {
            return ((org.telegram.ui.ActionBar.e5) kh.a2.i(1, D1.M)).getLastFragment();
        }
        LaunchActivity launchActivity2 = D1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return D1.O().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.p2 U() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.X;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.P) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = D1;
        if (launchActivity != null && !launchActivity.M.isEmpty()) {
            return ((org.telegram.ui.ActionBar.e5) kh.a2.i(1, D1.M)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = D1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return D1.O().getSafeLastFragment();
        }
        return null;
    }

    public static String V(int i10, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null) {
            return LocaleController.getString(str, i10);
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
            if (E1 == null) {
                E1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
            }
            try {
                Matcher matcher = E1.matcher(str);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    String group3 = matcher.group(3);
                    String group4 = matcher.group(4);
                    int i10 = 0;
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
                        i10 = Integer.parseInt(group4);
                    }
                    return (parseInt * 86400) + (parseInt2 * 3600) + (parseInt3 * 60) + i10;
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
                    } catch (Exception e) {
                        FileLog.e(e);
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
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                Z(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void b0(float f10, float f11, float f12) {
        View decorView;
        lh.gb gbVar;
        LaunchActivity launchActivity = D1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((gbVar = launchActivity.f31657w1) == null || ((View) gbVar.f2215a) != decorView)) {
                launchActivity.f31657w1 = new lh.gb(decorView);
            }
            lh.gb gbVar2 = launchActivity.f31657w1;
            if (gbVar2 != null) {
                View view = (View) gbVar2.f2215a;
                ArrayList arrayList = gbVar2.f12516b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(k7.n6.a(0.0f, 0.0f, f10, f11), k7.n6.a(view.getWidth(), 0.0f, f10, f11)), Math.max(k7.n6.a(0.0f, view.getHeight(), f10, f11), k7.n6.a(view.getWidth(), view.getHeight(), f10, f11))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    lh.fb fbVar = new lh.fb(f10, f11, f12);
                    ofFloat.addUpdateListener(new ag.a(4, gbVar2, fbVar));
                    ofFloat.addListener(new dg.y2(4, gbVar2, fbVar));
                    ofFloat.setInterpolator(org.telegram.ui.Components.nr.f27347g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(fbVar);
                    gbVar2.M();
                    ofFloat.start();
                }
            }
        }
    }

    public static void y0(AccountInstance accountInstance, oy oyVar, CharSequence charSequence, long j10, MessageObject messageObject, long j11, boolean z4, int i10, int i11) {
        boolean z10;
        org.telegram.ui.Components.qq0 qq0Var;
        org.telegram.ui.Components.qq0 qq0Var2;
        if (oyVar != null && (qq0Var2 = oyVar.D2) != null && !qq0Var2.f28219n) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z10 && oyVar != null && (qq0Var = oyVar.D2) != null) {
            webPage = qq0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z10) {
                SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j10, j11, z4, i10, i11, 0L);
                return;
            }
            CharSequence trimmedString = SendMessagesHelper.getTrimmedString(charSequence);
            if (trimmedString != null && trimmedString.length() != 0) {
                CharSequence[] charSequenceArr = {trimmedString};
                accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j10, messageObject, messageObject, webPage2, z10, accountInstance.getMediaDataController().getEntities(charSequenceArr, true), null, null, z4, i10, i11, null, false));
            }
        }
    }

    public final void A() {
        if (this.L == UserConfig.selectedAccount && this.f31633j1 != null) {
            return;
        }
        NotificationCenter.ObserversGroup observersGroup = this.f31633j1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f31633j1 = null;
        }
        int i10 = UserConfig.selectedAccount;
        this.L = i10;
        this.f31633j1 = NotificationCenter.getInstance(i10).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
    }

    public final void A0() {
        org.telegram.ui.ActionBar.y3 y3Var;
        ViewGroup view;
        int i10;
        if (this.f31656w0.indexOfChild(this.f31644q0) != -1) {
            y3Var = this.f31656w0;
            view = this.f31644q0;
        } else {
            y3Var = this.f31656w0;
            view = this.f31638n0.getView();
        }
        int indexOfChild = y3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f31656w0.removeViewAt(indexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            ma0 ma0Var = new ma0(this, this);
            this.f31644q0 = ma0Var;
            if (indexOfChild != -1) {
                this.f31656w0.addView(ma0Var, indexOfChild, k7.b6.c(-1.0f, -1));
            } else {
                this.f31656w0.addView(ma0Var, k7.b6.c(-1.0f, -1));
            }
            org.telegram.ui.Components.z51 z51Var = new org.telegram.ui.Components.z51(this, null, 4);
            this.f31648s0 = z51Var;
            z51Var.setOccupyStatusBar(false);
            this.f31648s0.V(org.telegram.ui.ActionBar.j6.r0());
            this.f31644q0.addView(this.f31648s0, k7.b6.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.f31638n0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f31638n0.getView());
            }
            this.f31644q0.addView(this.f31638n0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f31642p0 = actionBarLayout;
            actionBarLayout.K0 = true;
            actionBarLayout.setFragmentStack(this.f31618c0);
            this.f31642p0.setDelegate(this);
            this.f31644q0.addView(this.f31642p0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f31646r0 = frameLayout;
            ArrayList arrayList = this.f31616b0;
            int i11 = 8;
            if (arrayList.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            frameLayout.setVisibility(i10);
            this.f31646r0.setBackgroundColor(1056964608);
            this.f31644q0.addView(this.f31646r0);
            this.f31646r0.setOnTouchListener(new f0(this, 3));
            this.f31646r0.setOnClickListener(new dg.m(21));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f31640o0 = actionBarLayout2;
            actionBarLayout2.J0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f31640o0.setBackgroundView(this.f31646r0);
            this.f31640o0.setUseAlphaAnimations(true);
            this.f31640o0.setFragmentStack(arrayList);
            this.f31640o0.setDelegate(this);
            this.f31640o0.setDrawerLayoutContainer(this.f31656w0);
            ViewGroup view2 = this.f31640o0.getView();
            if (!arrayList.isEmpty()) {
                i11 = 0;
            }
            view2.setVisibility(i11);
            this.f31644q0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f31638n0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f31638n0.getView());
            }
            this.f31638n0.setFragmentStack(this.f31614a0);
            if (indexOfChild != -1) {
                this.f31656w0.addView(this.f31638n0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f31656w0.addView(this.f31638n0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        k7.x8.a(this, SharedConfig.isFloatingDebugActive, false);
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f31625f1 == null && SharedConfig.frameMetricsEnabled) {
                this.f31625f1 = lf.a0.b(this, this.f31650t0);
            }
            lf.a0 a0Var = this.f31625f1;
            if (a0Var != null && !SharedConfig.frameMetricsEnabled) {
                a0Var.c();
                this.f31625f1 = null;
            }
        }
    }

    public final org.telegram.ui.ActionBar.d2 B0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.d2 o10 = alertDialog$Builder.o();
            o10.setCanceledOnTouchOutside(true);
            o10.setOnDismissListener(new gg.g(8, this, o10));
            this.B0.add(o10);
            return o10;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    @Override
    public final boolean C() {
        ArrayList arrayList = this.R;
        if ((arrayList != null && arrayList.size() == 1) || this.O != null) {
            return true;
        }
        return false;
    }

    public final void D(int i10) {
        G1 = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT >= 26 && i10 == 0) || this.f31649s1) {
            return;
        }
        Utilities.globalQueue.postRunnable(new l80(this, i10, 0), 2000L);
    }

    public final void D0(p.a aVar) {
        org.telegram.ui.ActionBar.p2 p2Var;
        ArrayList arrayList = this.f31616b0;
        if (!arrayList.isEmpty()) {
            p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f31618c0;
            if (!arrayList2.isEmpty()) {
                p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.f31614a0;
                if (!arrayList3.isEmpty()) {
                    p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList3);
                } else {
                    p2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.qc.a(p2Var)) {
            aVar.c(org.telegram.ui.Components.qc.a0(p2Var)).j();
        }
    }

    public final void E0() {
        String str;
        String str2;
        char c3;
        LocaleController.LocaleInfo localeInfo;
        if (UserConfig.getInstance(this.L).isClientActivated()) {
            try {
                if (!this.F0 && !ApplicationLoader.mainInterfacePaused) {
                    String string = MessagesController.getGlobalMainSettings().getString("language_showed2", "");
                    final String str3 = MessagesController.getInstance(this.L).suggestedLangCode;
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
                    int i10 = 0;
                    while (true) {
                        if (i10 < LocaleController.getInstance().languages.size()) {
                            LocaleController.LocaleInfo localeInfo2 = LocaleController.getInstance().languages.get(i10);
                            c3 = 0;
                            if (localeInfo2.shortName.equals("en")) {
                                localeInfoArr[0] = localeInfo2;
                            }
                            if (localeInfo2.shortName.replace("_", "-").equals(str3) || localeInfo2.shortName.equals(str) || localeInfo2.shortName.equals(str2)) {
                                localeInfoArr[1] = localeInfo2;
                            }
                            if (localeInfoArr[0] != null && localeInfoArr[1] != null) {
                                break;
                            }
                            i10++;
                        } else {
                            c3 = 0;
                            break;
                        }
                    }
                    LocaleController.LocaleInfo localeInfo3 = localeInfoArr[c3];
                    if (localeInfo3 != null && (localeInfo = localeInfoArr[1]) != null && localeInfo3 != localeInfo) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("show lang alert for " + localeInfoArr[c3].getKey() + " and " + localeInfoArr[1].getKey());
                        }
                        this.G0 = null;
                        this.H0 = null;
                        this.F0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = localeInfoArr[1].getLangCode();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.L).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) {
                            public final LaunchActivity f40740b;

                            {
                                this.f40740b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.f31612y1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f40740b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.G0 = hashMap2;
                                                        if (launchActivity2.H0 != null && hashMap2 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr2;
                                                            launchActivity2.F0(localeInfoArr3[1], localeInfoArr3[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.H0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.G0 != null) {
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
                                        Pattern pattern2 = LaunchActivity.f31612y1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f40740b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.G0 = hashMap22;
                                                        if (launchActivity22.H0 != null && hashMap22 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.F0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.H0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.G0 != null) {
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
                        tL_langpack_getStrings2.lang_code = localeInfoArr[c3].getLangCode();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.L).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {
                            public final LaunchActivity f40740b;

                            {
                                this.f40740b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.f31612y1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f40740b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.G0 = hashMap22;
                                                        if (launchActivity22.H0 != null && hashMap22 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr2;
                                                            launchActivity22.F0(localeInfoArr32[1], localeInfoArr32[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.H0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.G0 != null) {
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
                                        Pattern pattern2 = LaunchActivity.f31612y1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f40740b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.G0 = hashMap22;
                                                        if (launchActivity22.H0 != null && hashMap22 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.F0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.H0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.G0 != null) {
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void F() {
        int i10;
        if (AndroidUtilities.isTablet() && this.f31642p0 != null) {
            if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
                int i11 = 8;
                if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                    this.L0 = false;
                    List<org.telegram.ui.ActionBar.p2> fragmentStack = this.f31638n0.getFragmentStack();
                    if (fragmentStack.size() >= 2) {
                        while (1 < fragmentStack.size()) {
                            org.telegram.ui.ActionBar.p2 p2Var = fragmentStack.get(1);
                            if (p2Var instanceof xn) {
                                ((xn) p2Var).V4 = true;
                            }
                            p2Var.onPause();
                            p2Var.onFragmentDestroy();
                            p2Var.setParentLayout(null);
                            fragmentStack.remove(p2Var);
                            this.f31642p0.c(-1, p2Var);
                        }
                        org.telegram.ui.Components.xd0 xd0Var = this.f31658x0;
                        if (xd0Var == null || xd0Var.f30664b.getVisibility() != 0) {
                            this.f31638n0.U(true, true);
                            this.f31642p0.U(true, true);
                        }
                    }
                    ViewGroup view = this.f31642p0.getView();
                    if (this.f31642p0.getFragmentStack().isEmpty()) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    org.telegram.ui.Components.z51 z51Var = this.f31648s0;
                    if (this.f31642p0.getFragmentStack().isEmpty()) {
                        i11 = 0;
                    }
                    z51Var.setVisibility(i11);
                    return;
                }
                this.L0 = true;
                List<org.telegram.ui.ActionBar.p2> fragmentStack2 = this.f31642p0.getFragmentStack();
                if (!fragmentStack2.isEmpty()) {
                    while (fragmentStack2.size() > 0) {
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentStack2.get(0);
                        if (p2Var2 instanceof xn) {
                            ((xn) p2Var2).V4 = true;
                        }
                        p2Var2.onPause();
                        p2Var2.onFragmentDestroy();
                        p2Var2.setParentLayout(null);
                        fragmentStack2.remove(p2Var2);
                        this.f31638n0.c(-1, p2Var2);
                    }
                    org.telegram.ui.Components.xd0 xd0Var2 = this.f31658x0;
                    if (xd0Var2 == null || xd0Var2.f30664b.getVisibility() != 0) {
                        this.f31638n0.U(true, true);
                    }
                }
                this.f31642p0.getView().setVisibility(8);
                org.telegram.ui.Components.z51 z51Var2 = this.f31648s0;
                if (this.f31638n0.getFragmentStack().isEmpty()) {
                    i11 = 0;
                }
                z51Var2.setVisibility(i11);
            }
        }
    }

    public final void F0(org.telegram.messenger.LocaleController.LocaleInfo r18, org.telegram.messenger.LocaleController.LocaleInfo r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.F0(org.telegram.messenger.LocaleController$LocaleInfo, org.telegram.messenger.LocaleController$LocaleInfo, java.lang.String):void");
    }

    public final void G(boolean z4) {
        H(z4, true, !this.T0);
    }

    public final void G0(boolean z4, boolean z10, int i10, int i11, zi ziVar) {
        if (this.f31656w0 != null && !isFinishing()) {
            if (this.f31658x0 == null) {
                this.f31658x0 = new org.telegram.ui.Components.xd0(this);
            }
            SharedConfig.appLocked = true;
            int i12 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f32264s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                PhotoViewer.t1().G0(false, true);
            } else if (l4.I() && l4.x().S) {
                l4.x().o(false, true);
            }
            ph.da.x();
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.f31658x0.show();
            org.telegram.ui.Components.wd0 wd0Var = this.f31658x0.f30664b;
            ArrayList arrayList = this.f31660y0;
            arrayList.isEmpty();
            wd0Var.j(z10, i10, i11, new g00(19, this, ziVar));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                org.telegram.ui.Components.vd0 vd0Var = (org.telegram.ui.Components.vd0) arrayList.get(i13);
                if (z4) {
                    int size = arrayList.size() - 1;
                }
                vd0Var.j(z10, i10, i11, null);
            }
            SharedConfig.isWaitingForPasscodeEnter = true;
            da0 da0Var = new da0(this);
            this.f31658x0.f30664b.setDelegate(da0Var);
            int size2 = arrayList.size();
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((org.telegram.ui.Components.vd0) obj).setDelegate(da0Var);
            }
            try {
                NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void H(boolean z4, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.p2 p2Var;
        int w02;
        vn vnVar;
        boolean z12;
        ArrayList arrayList = this.f31614a0;
        boolean z13 = true;
        if (!arrayList.isEmpty()) {
            p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList);
        } else {
            p2Var = null;
        }
        char c3 = 2;
        if (p2Var != null && (p2Var.isRemovingFromStack() || p2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(2, arrayList);
            } else {
                p2Var = null;
            }
        }
        if (p2Var != null) {
            p2Var.hasForceLightStatusBar();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (z10) {
                if (p2Var != null) {
                    z12 = p2Var.isLightStatusBar();
                    if (p2Var.getParentLayout() instanceof ActionBarLayout) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) p2Var.getParentLayout();
                        if (actionBarLayout.w() != null && actionBarLayout.w().getLastSheet() != null) {
                            org.telegram.ui.ActionBar.l2 lastSheet = actionBarLayout.w().getLastSheet();
                            if (lastSheet.isShown()) {
                                z12 = lastSheet.isAttachedLightStatusBar();
                            }
                        } else {
                            ArrayList<org.telegram.ui.ActionBar.l2> arrayList2 = p2Var.sheetsStack;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                org.telegram.ui.ActionBar.l2 l2Var = (org.telegram.ui.ActionBar.l2) kh.a2.i(1, p2Var.sheetsStack);
                                if (l2Var.isShown()) {
                                    z12 = l2Var.isAttachedLightStatusBar();
                                }
                            }
                        }
                    }
                } else {
                    z12 = i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20176s8, true)) > 0.699999988079071d;
                }
                AndroidUtilities.setLightStatusBar(this, z12);
            }
            if (i10 >= 26 && z11 && (!z4 || p2Var == null || !p2Var.isInPreviewMode())) {
                if (p2Var != null && z4) {
                    w02 = p2Var.getNavigationBarColor();
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, true);
                }
                if (p2Var instanceof xn) {
                    xn xnVar = (xn) p2Var;
                    if (!xnVar.Bb || (xnVar.v.f2612s != 1 && ((vnVar = xnVar.f39968ba) == null || !vnVar.D))) {
                        c3 = 1;
                    }
                } else {
                    c3 = 0;
                }
                if (P() != null && P().E > 0) {
                    c3 = 0;
                }
                if (this.f31638n0.w() != null) {
                    cz w10 = this.f31638n0.w();
                    if (w10.sheetsStack != null) {
                        for (int i11 = 0; i11 < w10.sheetsStack.size(); i11++) {
                            org.telegram.ui.ActionBar.l2 l2Var2 = w10.sheetsStack.get(i11);
                            if (l2Var2.attachedToParent()) {
                                w02 = l2Var2.getNavigationBarColor(w02);
                                c3 = 0;
                            }
                        }
                    }
                }
                Iterator it = rh.q2.T0.iterator();
                while (it.hasNext()) {
                    w02 = ((rh.q2) it.next()).getNavigationBarColor(w02);
                    c3 = 0;
                }
                z0(w02);
                if ((c3 != 0 || AndroidUtilities.computePerceivedBrightness(w02) < 0.721f) && c3 != 1) {
                    z13 = false;
                }
                AndroidUtilities.setLightNavigationBar(this, z13);
            }
        }
        if (z10) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void H0(int i10, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f10;
        float f11;
        if (this.f31661z0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            int i11 = AndroidUtilities.statusBarHeight;
            if (i11 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i11));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.logo_middle);
            linearLayout.addView(imageView, k7.b6.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.j6.G6;
            f10 = 4.0f;
            org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, 17.0f);
            textView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
            linearLayout.addView(textView, k7.b6.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f25846a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(51);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView2, k7.b6.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            scrollView.setPadding(AndroidUtilities.dp(24.0f), i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, k7.b6.n(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(LocaleController.getString(R.string.Decline).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            int i13 = org.telegram.ui.ActionBar.j6.f20281y6;
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
            f11 = 10.0f;
            textView3.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
            frameLayout.addView(textView3, k7.b6.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    j01 j01Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                            d2Var.O = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new h01(j01Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            d2Var.Q = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (j01Var.f25848c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                                d2Var2.O = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new h01(j01Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                d2Var2.Q = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", j01Var.f25848c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            j01Var.a();
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
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, -11491093, -12346402, -12346402));
            textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(textView4, k7.b6.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    j01 j01Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                            d2Var.O = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new h01(j01Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            d2Var.Q = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (j01Var.f25848c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                                d2Var2.O = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new h01(j01Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                d2Var2.Q = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", j01Var.f25848c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            j01Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19907d7, false));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.f31661z0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f31656w0.addView(this.f31661z0, k7.b6.c(-1.0f, -1));
            this.f31661z0.setDelegate(new na0(this));
        } else {
            f10 = 4.0f;
            f11 = 10.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i10).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f19241id.data.equals(tL_help_termsOfService.f19241id.data))) {
            UserConfig.getInstance(i10).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i10).saveConfig(false);
        }
        org.telegram.ui.Components.j01 j01Var = this.f31661z0;
        if (j01Var.getVisibility() != 0) {
            j01Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false);
        int dp2 = AndroidUtilities.dp(f11);
        int dp3 = AndroidUtilities.dp(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i14 = 0; i14 < length; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == '-') {
                    int i16 = i14 + 2;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        org.telegram.ui.Components.ta taVar = new org.telegram.ui.Components.ta(dp2, dp3);
                        spannableStringBuilder.replace(i15, i14 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(taVar, i15, i16, 33);
                    }
                }
            }
        }
        j01Var.f25846a.setText(spannableStringBuilder);
        j01Var.f25848c = tL_help_termsOfService;
        j01Var.d = i10;
        this.f31661z0.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    public final void I(boolean z4) {
        ChatObject.Call call;
        long j10;
        boolean z10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = false;
        if (sharedInstance != null && (call = sharedInstance.groupCall) != null) {
            boolean z12 = this.f31630i0;
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
                j10 = UserConfig.getInstance(this.L).clientUserId;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && groupCallParticipant.raise_hand_rating != 0) {
                z11 = true;
            }
            this.f31630i0 = z11;
            if (!z4 && z12 && !z11 && !z10 && c60.A3 == null) {
                J0(38);
                return;
            }
            return;
        }
        this.f31630i0 = false;
    }

    public final void I0(int i10, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z4) {
        if (this.A0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i11 = org.telegram.ui.ActionBar.j6.f19906d6;
            frameLayout.f29398w = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.w0(null, i11, false), 0});
            frameLayout.f29399x = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.j6.w0(null, i11, false), 0});
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            int i12 = (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight));
            ?? imageView = new ImageView(this);
            imageView.f(R.raw.qr_code_logo, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().I(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            frameLayout2.addView((View) imageView, k7.b6.d(-2, -2.0f, 17, 0.0f, i12, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.g0((Object) frameLayout, 4));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f29394f = scrollView;
            AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20176s8, false));
            scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, k7.b6.d(-1, -1.0f, 51, 27.0f, i12 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.UpdateTelegram));
            frameLayout3.addView(textView, k7.b6.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f29391a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(49);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            frameLayout3.addView(textView2, k7.b6.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            dg.u2 u2Var = new dg.u2(this, 13);
            frameLayout.d = u2Var;
            u2Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            u2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
            u2Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(u2Var, k7.b6.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            u2Var.setOnClickListener(new org.telegram.ui.Components.w2(5, frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f29392b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            u2Var.addView(textView3, k7.b6.e(-2, -2, 17));
            dg.u2 u2Var2 = new dg.u2((Object) frameLayout, this, 14);
            frameLayout.f29393c = u2Var2;
            u2Var2.setWillNotDraw(false);
            u2Var2.setAlpha(0.0f);
            u2Var2.setScaleX(0.1f);
            u2Var2.setScaleY(0.1f);
            u2Var2.setVisibility(4);
            org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(u2Var2);
            frameLayout.e = kj0Var;
            kj0Var.d(null, true, false);
            kj0Var.f26294o = -1;
            u2Var.addView(u2Var2, k7.b6.e(36, 36, 17));
            this.A0 = frameLayout;
            this.f31656w0.addView((View) frameLayout, k7.b6.c(-1.0f, -1));
        }
        org.telegram.ui.Components.v9 v9Var = this.A0;
        v9Var.v = 0;
        v9Var.f29395n = tL_help_appUpdate;
        v9Var.f29397s = i10;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            v9Var.f29396r = FileLoader.getAttachFileName(document);
        }
        if (v9Var.getVisibility() != 0) {
            v9Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false);
        v9Var.f29391a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            TextView textView4 = v9Var.f29392b;
            textView4.setText(LocaleController.getString(R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tL_help_appUpdate.document.size)));
        } else {
            v9Var.f29392b.setText(LocaleController.getString(R.string.Update));
        }
        NotificationCenter.getInstance(v9Var.f29397s).addObserver(v9Var, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(v9Var.f29397s).addObserver(v9Var, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(v9Var.f29397s).addObserver(v9Var, NotificationCenter.fileLoadProgressChanged);
        if (z4 && ApplicationLoader.isStandaloneBuild()) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(v9Var.f29397s).sendRequest(tL_help_getAppUpdate, new org.telegram.ui.Components.y1(v9Var, 1));
        }
    }

    public final void J() {
        ArrayList arrayList = this.f31614a0;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.p2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (AndroidUtilities.isTablet()) {
            ArrayList arrayList2 = this.f31616b0;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((org.telegram.ui.ActionBar.p2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f31618c0;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                ((org.telegram.ui.ActionBar.p2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void J0(int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.f31614a0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.p2 p2Var = this.f31638n0.getFragmentStack().get(this.f31638n0.getFragmentStack().size() - 1);
            if (p2Var instanceof vg0) {
                p2Var = ((vg0) p2Var).X();
            }
            UndoView undoView = null;
            if (p2Var instanceof xn) {
                xn xnVar = (xn) p2Var;
                if (chat != null && xnVar.a() == (-chat.f19184id)) {
                    chat = null;
                }
                xnVar.Q7();
                undoView = xnVar.f40209v3;
            } else if (p2Var instanceof oy) {
                undoView = ((oy) p2Var).Y3();
            } else if (p2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) p2Var).J;
            }
            if (undoView != null) {
                undoView.m(0L, chat, i10);
            }
            if (i10 == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    @Override
    public final boolean K(org.telegram.ui.oy r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.K(org.telegram.ui.oy):boolean");
    }

    public final void K0(int i10) {
        L0(i10, new org.telegram.ui.Components.kh0(27));
    }

    public final void L0(int i10, GenericProvider genericProvider) {
        if (i10 != UserConfig.selectedAccount && UserConfig.isValidAccount(i10)) {
            this.f31631i1 = true;
            ConnectionsManager.getInstance(this.L).setAppPaused(true, false);
            UserConfig.selectedAccount = i10;
            UserConfig.getInstance(0).saveConfig(false);
            A();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAccountChanged, Integer.valueOf(i10));
            if (AndroidUtilities.isTablet()) {
                this.f31640o0.X();
                this.f31642p0.X();
                if (!this.L0) {
                    if (this.f31642p0.getFragmentStack().isEmpty()) {
                        this.f31648s0.setVisibility(0);
                    }
                    this.f31642p0.getView().setVisibility(8);
                }
                this.f31640o0.getView().setVisibility(8);
            }
            this.f31638n0.X();
            this.f31638n0.c(-3, (vg0) genericProvider.provide(null));
            this.f31638n0.U(true, true);
            if (AndroidUtilities.isTablet()) {
                this.f31640o0.U(true, true);
                this.f31642p0.U(true, true);
            }
            if (!ApplicationLoader.mainInterfacePaused) {
                ConnectionsManager.getInstance(this.L).setAppPaused(false, false);
            }
            if (UserConfig.getInstance(i10).unacceptedTermsOfService != null) {
                H0(i10, UserConfig.getInstance(i10).unacceptedTermsOfService);
            }
            M0();
            this.f31631i1 = false;
        }
    }

    public final java.util.ArrayList M(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.M(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void M0() {
        String str;
        int i10;
        if (this.f31638n0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.L).getConnectionState();
            this.Z = connectionState;
            x80 x80Var = null;
            if (connectionState == 2) {
                i10 = R.string.WaitingForNetwork;
                str = "WaitingForNetwork";
            } else if (connectionState == 5) {
                i10 = R.string.Updating;
                str = "Updating";
            } else if (connectionState == 4) {
                i10 = R.string.ConnectingToProxyWithDots;
                str = "ConnectingToProxyWithDots";
            } else if (connectionState == 1) {
                i10 = R.string.Connecting;
                str = "Connecting";
            } else {
                str = null;
                i10 = 0;
            }
            if (connectionState == 1 || connectionState == 4) {
                x80Var = new x80(this, 5);
            }
            ActionBarLayout actionBarLayout = this.f31638n0;
            actionBarLayout.D0 = str;
            actionBarLayout.E0 = i10;
            actionBarLayout.F0 = x80Var;
            for (int i11 = 0; i11 < actionBarLayout.L0.size(); i11++) {
                ((org.telegram.ui.ActionBar.p2) actionBarLayout.L0.get(i11)).setTitleOverlayText(actionBarLayout.D0, actionBarLayout.E0, x80Var);
            }
        }
    }

    public final org.telegram.ui.ActionBar.e5 O() {
        ActionBarLayout actionBarLayout = this.f31638n0;
        ArrayList arrayList = this.M;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.e5) kh.a2.i(1, arrayList);
        }
        return actionBarLayout;
    }

    public final org.telegram.ui.ActionBar.n3 P() {
        ActionBarLayout actionBarLayout = this.f31642p0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f31642p0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.f31638n0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.f31638n0.getBottomSheetTabs();
        }
        return null;
    }

    public final org.telegram.ui.ActionBar.p2 Q() {
        if (ng0.j1(this.L, false).getInt("currentViewNum", 0) != 0) {
            return new ng0();
        }
        return new u70();
    }

    public final int S() {
        return this.f31614a0.size();
    }

    public final ch.e T() {
        return this.f31621d1;
    }

    public final boolean X(android.content.Intent r121, boolean r122, boolean r123, boolean r124, af.f r125, boolean r126, boolean r127) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.X(android.content.Intent, boolean, boolean, boolean, af.f, boolean, boolean):boolean");
    }

    public final void Y() {
        ActionMode actionMode = this.f31628h0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    @Override
    public final void a(float f10) {
        if (l4.I() && l4.x().S) {
            l4 x10 = l4.x();
            x10.S();
            l4.g0(x10);
            if (x10.f35931c0 != null) {
                x10.f35945r0[0].f37159b.f1();
                x10.f35945r0[1].f37159b.f1();
                x10.f35931c0.invalidate();
                x10.f35941n0.invalidate();
                if (f10 == 1.0f) {
                    x10.f35945r0[0].f37160c.l();
                    x10.f35945r0[1].f37160c.l();
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
    public final void b(ActionBarLayout actionBarLayout, boolean z4) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.f31640o0) {
            this.f31642p0.U(z4, z4);
            this.f31638n0.U(z4, z4);
        }
    }

    public final boolean c0(boolean z4) {
        boolean z10;
        zf.i iVar = k7.x8.f10028a;
        if (iVar != null) {
            if (iVar.f47429s) {
                if (z4) {
                    iVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.xd0 xd0Var = this.f31658x0;
        if (xd0Var != null && xd0Var.f30664b.getVisibility() == 0) {
            if (z4) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.w3 w3Var = this.f31654v0;
            if (w3Var != null && (z10 = w3Var.R)) {
                if (z4 && z10) {
                    w3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.on0.E;
                if (d2Var != null) {
                    if (z4) {
                        d2Var.dismiss();
                        org.telegram.ui.Components.on0.E = null;
                        return false;
                    }
                } else if (pt.f37510g0 != null && pt.q().E) {
                    if (z4) {
                        pt.q().o();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f32264s) {
                    if (z4) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                    if (z4) {
                        PhotoViewer.t1().G0(true, false);
                        return false;
                    }
                } else if (!l4.I() || !l4.x().S) {
                    return true;
                } else {
                    if (z4) {
                        l4.x().o(true, false);
                    }
                }
            }
        }
        return false;
    }

    public final void d0() {
        z5 z5Var = this.W0;
        if (z5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            this.W0 = null;
        }
        if (!this.N) {
            this.N = true;
            NotificationCenter.ObserversGroup observersGroup = this.f31633j1;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.f31633j1 = null;
            }
            NotificationCenter.ObserversGroup observersGroup2 = this.f31635k1;
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                this.f31635k1 = null;
            }
            w90 w90Var = this.f31637m1;
            if (w90Var != null) {
                LiteMode.removeOnPowerSaverAppliedListener(w90Var);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r20, int r21, java.lang.Object... r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void e0(Intent intent, af.f fVar) {
        super.onNewIntent(intent);
        X(intent, true, false, false, fVar, true, false);
    }

    public final void f0() {
        if (this.W0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodePause");
            }
            AndroidUtilities.cancelRunOnUIThread(this.W0);
            this.W0 = null;
        }
        if (SharedConfig.passcodeHash.length() != 0) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            z5 z5Var = new z5(this, 8);
            this.W0 = z5Var;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(z5Var, 1000L);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in 1000");
                }
            } else if (SharedConfig.autoLockIn != 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in " + ((SharedConfig.autoLockIn * 1000) + 1000));
                }
                AndroidUtilities.runOnUIThread(this.W0, (SharedConfig.autoLockIn * 1000) + 1000);
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
    }

    public final void g0() {
        if (this.W0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodeResume");
            }
            AndroidUtilities.cancelRunOnUIThread(this.W0);
            this.W0 = null;
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
    public final boolean h(org.telegram.ui.ActionBar.p2 p2Var, ActionBarLayout actionBarLayout) {
        boolean z4;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (AndroidUtilities.isTablet()) {
            boolean z10 = p2Var instanceof oy;
            if (!z10 && !(p2Var instanceof vg0)) {
                if ((p2Var instanceof xn) && !((xn) p2Var).c()) {
                    boolean z11 = this.L0;
                    if (!z11 && actionBarLayout != (actionBarLayout3 = this.f31642p0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f31648s0.setVisibility(8);
                        this.f31642p0.X();
                        this.f31642p0.c(-1, p2Var);
                        if (!this.f31640o0.getFragmentStack().isEmpty()) {
                            while (this.f31640o0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f31640o0;
                                actionBarLayout4.a0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f31640o0.l(true, false);
                            return false;
                        }
                    } else if (z11 && actionBarLayout != (actionBarLayout2 = this.f31638n0)) {
                        actionBarLayout2.c(-1, p2Var);
                        if (!this.f31640o0.getFragmentStack().isEmpty()) {
                            while (this.f31640o0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f31640o0;
                                actionBarLayout5.a0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f31640o0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f31640o0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            if (UserConfig.getInstance(i10).isClientActivated()) {
                                break;
                            }
                            i10++;
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    if ((p2Var instanceof ng0) && i10 == -1) {
                        this.f31648s0.setVisibility(0);
                        this.f31646r0.setBackgroundColor(0);
                    } else {
                        this.f31646r0.setBackgroundColor(2130706432);
                    }
                    this.f31640o0.c(-1, p2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.f31638n0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && z10 && !((oy) p2Var).h4()) {
                    z4 = false;
                }
                if (z4) {
                    this.f31638n0.X();
                    this.f31638n0.c(-1, p2Var);
                    this.f31640o0.X();
                    this.f31640o0.getView().setVisibility(8);
                    if (!this.L0 && this.f31642p0.getFragmentStack().isEmpty()) {
                        this.f31648s0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        org.telegram.ui.ActionBar.d2 d2Var = this.S0;
        if (d2Var != null) {
            try {
                d2Var.dismiss();
            } finally {
                this.S0 = null;
            }
        }
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.M0 = null;
        this.Q0 = null;
    }

    public final void i0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.i0(boolean):void");
    }

    @Override
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f32264s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
            return true;
        } else if (!l4.I() || !l4.x().S) {
            return false;
        } else {
            l4.x().o(true, false);
            return true;
        }
    }

    public final void j0(TL_account.Password password) {
        String str;
        ng0 ng0Var = new ng0();
        x80 x80Var = new x80(this, 0);
        ng0Var.C = 3;
        ng0Var.f36622a = 12;
        ng0Var.f36623a0 = x80Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f28583a |= 256;
                obj.f28584b = indexOf;
                int i10 = lastIndexOf + 1;
                obj.f28585c = i10;
                valueOf.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i10, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            alertDialog$Builder.f19503a.O = valueOf;
            alertDialog$Builder.f19503a.Q = getString(R.string.EmailLoginChangeMessage);
            alertDialog$Builder.k(getString(R.string.ChangeEmail), new qs(15, this, ng0Var));
            alertDialog$Builder.h(getString(R.string.Cancel), null);
            alertDialog$Builder.o();
            return;
        }
        p0(ng0Var);
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f31638n0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.f31631i1) {
                d0();
                finish();
                return false;
            } else if (actionBarLayout == this.f31642p0) {
                if (!this.L0) {
                    this.f31648s0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f31640o0 && this.f31638n0.getFragmentStack().isEmpty() && this.f31640o0.getFragmentStack().size() == 1) {
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

    public final void k0(final long j10, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i10, final int i11) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            p0(kf1.F0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(this.L).getInputChannel(-j10);
        tL_channels_getMessages.f19222id.add(num);
        ConnectionsManager.getInstance(this.L).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new b90(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i10, i11));
            }
        });
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.c5 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.c5):boolean");
    }

    public final void l0(long[] jArr, boolean z4) {
        boolean z10;
        ArrayList arrayList;
        nh.c7 a2;
        long[] jArr2 = jArr;
        int i10 = 0;
        while (true) {
            if (i10 < jArr2.length) {
                TLRPC.User user = MessagesController.getInstance(this.L).getUser(Long.valueOf(jArr2[i10]));
                if (user != null && !user.stories_hidden) {
                    z10 = false;
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.p2 R = R();
        if (R != null) {
            nh.t6 storiesController = MessagesController.getInstance(this.L).getStoriesController();
            if (z10) {
                arrayList = storiesController.h;
            } else {
                arrayList = storiesController.f15921g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z11 = z10;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z11) {
                ArrayList arrayList5 = new ArrayList();
                for (int i11 = 0; i11 < jArr2.length; i11++) {
                    TLRPC.User user2 = MessagesController.getInstance(this.L).getUser(Long.valueOf(jArr2[i11]));
                    if (user2 == null || !user2.stories_hidden) {
                        arrayList5.add(Long.valueOf(jArr2[i11]));
                    }
                }
                Object[] array = arrayList5.toArray();
                int length = array.length;
                long[] jArr3 = new long[length];
                for (int i12 = 0; i12 < length; i12++) {
                    Object obj = array[i12];
                    obj.getClass();
                    jArr3[i12] = ((Number) obj).longValue();
                }
                jArr2 = jArr3;
            }
            if (z4) {
                for (int i13 = 0; i13 < jArr2.length; i13 = android.support.v4.media.a.g(jArr2[i13], arrayList4, i13, 1)) {
                }
            } else {
                for (int i14 = 0; i14 < jArr2.length; i14 = android.support.v4.media.a.g(jArr2[i14], arrayList3, i14, 1)) {
                }
            }
            if (!arrayList4.isEmpty() && z4) {
                MessagesController messagesController = MessagesController.getInstance(this.L);
                int[] iArr = {arrayList4.size()};
                rq rqVar = new rq(this, iArr, jArr2, 18);
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    long longValue = ((Long) arrayList4.get(i15)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer inputPeer = messagesController.getInputPeer(longValue);
                    tL_stories_getPeerStories.peer = inputPeer;
                    if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else if (inputPeer == null) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.L).sendRequest(tL_stories_getPeerStories, new gg.c0(messagesController, longValue, rqVar, 6));
                    }
                }
                return;
            }
            long clientUserId = UserConfig.getInstance(this.L).getClientUserId();
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i16)).peer);
                if (peerDialogId != clientUserId && !arrayList3.contains(Long.valueOf(peerDialogId)) && storiesController.J(peerDialogId)) {
                    arrayList3.add(Long.valueOf(peerDialogId));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (R instanceof oy) {
                    try {
                        a2 = nh.c7.a(((oy) R).B0.h);
                    } catch (Exception unused) {
                    }
                    nh.c7 c7Var = a2;
                    R.getOrCreateStoryViewer().v();
                    R.getOrCreateStoryViewer().F(this, null, arrayList3, 0, null, null, c7Var, false);
                }
                a2 = null;
                nh.c7 c7Var2 = a2;
                R.getOrCreateStoryViewer().v();
                R.getOrCreateStoryViewer().F(this, null, arrayList3, 0, null, null, c7Var2, false);
            }
        }
    }

    public final void m0(final int i10, final long j10, final boolean z4) {
        TL_stories.StoryItem storyItem;
        nh.l6 l6Var;
        nh.l6 A;
        MessageObject f10;
        MessageObject f11;
        TL_stories.StoryItem storyItem2;
        nh.t6 storiesController = MessagesController.getInstance(this.L).getStoriesController();
        TL_stories.PeerStories y10 = storiesController.y(j10);
        nh.c7 c7Var = null;
        if (y10 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < y10.stories.size()) {
                    if (y10.stories.get(i11).f19419id == i10) {
                        storyItem2 = y10.stories.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    storyItem2 = null;
                    break;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j10;
                org.telegram.ui.ActionBar.p2 R = R();
                if (R != null) {
                    if (R instanceof oy) {
                        try {
                            c7Var = nh.c7.a(((oy) R).B0.h);
                        } catch (Exception unused) {
                        }
                    }
                    R.getOrCreateStoryViewer().v();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z4) {
                        R.getOrCreateStoryViewer().f15492t1 = true;
                    }
                    R.getOrCreateStoryViewer().F(this, storyItem2, arrayList, 0, null, y10, c7Var, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            nh.l6 A2 = storiesController.A(j10, 0, -1, true);
            if (A2 != null && (f11 = A2.f(i10)) != null) {
                storyItem = f11.storyItem;
                l6Var = A2;
            } else {
                l6Var = null;
            }
            if (storyItem == null && (A = storiesController.A(j10, 1, -1, true)) != null && (f10 = A.f(i10)) != null) {
                storyItem = f10.storyItem;
                l6Var = A;
            }
            if (storyItem != null && l6Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.p2 R2 = R();
                if (R2 == null) {
                    return;
                }
                if (R2 instanceof oy) {
                    try {
                        c7Var = nh.c7.a(((oy) R2).B0.h);
                    } catch (Exception unused2) {
                    }
                }
                nh.c7 c7Var2 = c7Var;
                R2.getOrCreateStoryViewer().v();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z4) {
                    R2.getOrCreateStoryViewer().f15492t1 = true;
                }
                R2.getOrCreateStoryViewer().F(this, storyItem, arrayList2, 0, l6Var, null, c7Var2, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.L).getInputPeer(j10);
        tL_stories_getStoriesByID.f19426id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(this.L).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.hg(LaunchActivity.this, tLObject, i10, j10, z4));
            }
        });
    }

    public final void n0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z4;
        int i10 = i6Var.f19810c0;
        org.telegram.ui.ActionBar.h6 f10 = i6Var.f(tL_theme, this.L, 0);
        i6Var.W = i6Var.V;
        i6Var.u(f10.f19761a);
        f10.f19776s = tL_wallPaper;
        if (i10 != i6Var.f19810c0) {
            z4 = true;
        } else {
            z4 = false;
        }
        p0(new cd1(i6Var, z4, 0, false, false));
    }

    public final void o0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.o0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f31628h0 == actionMode) {
            this.f31628h0 = null;
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f31638n0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f19490y;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.f19483t0 = false;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f31642p0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f19490y;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.f19483t0 = false;
                ActionBarLayout actionBarLayout3 = this.f31640o0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f19490y;
                if (kVar3 != null) {
                    kVar3.setVisibility(0);
                }
                actionBarLayout3.f19483t0 = false;
            }
        }
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.f31628h0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.f31638n0.s(menu) && AndroidUtilities.isTablet() && !this.f31642p0.s(menu)) {
                this.f31640o0.s(menu);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f31638n0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f19490y;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.f19483t0 = true;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f31642p0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f19490y;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.f19483t0 = true;
                ActionBarLayout actionBarLayout3 = this.f31640o0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f19490y;
                if (kVar3 != null) {
                    kVar3.setVisibility(8);
                }
                actionBarLayout3.f19483t0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        nh.d4 currentPeerView;
        org.telegram.ui.Components.s81 s81Var;
        VoIPService sharedInstance;
        boolean z4 = false;
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onActivityResult");
            }
            UserConfig.getInstance(this.L).saveConfig(false);
        }
        if (i10 == 105) {
            if (Build.VERSION.SDK_INT >= 23) {
                boolean canDrawOverlays = Settings.canDrawOverlays(this);
                ApplicationLoader.canDrawOverlays = canDrawOverlays;
                if (canDrawOverlays) {
                    c60 c60Var = c60.A3;
                    if (c60Var != null) {
                        c60Var.dismissInternal();
                    }
                    AndroidUtilities.runOnUIThread(new x80(this, 4), 200L);
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 520) {
            if (i11 == -1 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
                sharedInstance.createCaptureDevice(true);
            }
        } else if (i10 == 140) {
            LocationController locationController = LocationController.getInstance(this.L);
            if (i11 == -1) {
                z4 = true;
            }
            locationController.startFusedLocationRequest(z4);
        } else if (i10 == 521) {
            org.telegram.ui.web.y0 y0Var = this.f31639n1;
            if (y0Var != null) {
                if (i11 == -1) {
                    z4 = true;
                }
                y0Var.run(Boolean.valueOf(z4));
                this.f31639n1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f23192n;
            if (themeEditorView != null && (s81Var = themeEditorView.f23200k) != null) {
                s81Var.a(i10, i11, intent);
            }
            ActionBarLayout actionBarLayout = this.f31638n0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.p2 p2Var = this.f31638n0.getFragmentStack().get(this.f31638n0.getFragmentStack().size() - 1);
                p2Var.onActivityResultFragment(i10, i11, intent);
                if (p2Var.getLastStoryViewer() != null && (currentPeerView = p2Var.getLastStoryViewer().f15472k0.getCurrentPeerView()) != null && i11 == -1) {
                    if (i10 != 0 && i10 != 2) {
                        if (i10 == 21) {
                            if (intent == null) {
                                currentPeerView.Z0();
                            } else {
                                if (intent.getData() != null) {
                                    currentPeerView.S0(intent.getData());
                                } else if (intent.getClipData() != null) {
                                    ClipData clipData = intent.getClipData();
                                    for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                        currentPeerView.S0(clipData.getItemAt(i12).getUri());
                                    }
                                } else {
                                    currentPeerView.Z0();
                                }
                                nh.t2 t2Var = currentPeerView.F2;
                                if (t2Var != null) {
                                    t2Var.dismiss();
                                }
                                currentPeerView.k0(true);
                            }
                        }
                    } else {
                        currentPeerView.t0();
                        nh.t2 t2Var2 = currentPeerView.F2;
                        if (t2Var2 != null) {
                            t2Var2.f26702g0.g0(i10, intent, null);
                        }
                    }
                }
            }
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f31642p0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f31642p0.getFragmentStack().get(this.f31642p0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f31640o0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f31640o0.getFragmentStack().get(this.f31640o0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onActivityResultReceived, Integer.valueOf(i10), Integer.valueOf(i11), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (c0(true)) {
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f31640o0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f31640o0.G();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f31642p0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f31642p0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.p2 p2Var = this.f31642p0.getFragmentStack().get(this.f31642p0.getFragmentStack().size() - 1);
                    if (p2Var.onBackPressed(true)) {
                        p2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.f31638n0.G();
                return;
            }
            this.f31638n0.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        this.f31634k0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        AndroidUtilities.resetTabletFlag();
        a0();
        F();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.C;
        if (pipRoundVideoView != null) {
            int i10 = pipRoundVideoView.f23078x.getInt("sidex", 1);
            int i11 = pipRoundVideoView.f23078x.getInt("sidey", 0);
            float f10 = pipRoundVideoView.f23078x.getFloat("px", 0.0f);
            float f11 = pipRoundVideoView.f23078x.getFloat("py", 0.0f);
            pipRoundVideoView.v.x = PipRoundVideoView.b(true, i10, f10, pipRoundVideoView.h);
            pipRoundVideoView.v.y = PipRoundVideoView.b(false, i11, f11, pipRoundVideoView.f23074n);
            pipRoundVideoView.f23077w.updateViewLayout(pipRoundVideoView.f23070a, pipRoundVideoView.v);
        }
        org.telegram.ui.Components.pu puVar = org.telegram.ui.Components.pu.P;
        if (puVar != null) {
            puVar.onConfigurationChanged(configuration);
        }
        gg.x xVar = gg.x.e;
        if (xVar != null) {
            xVar.onConfigurationChanged(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.Q8;
        ThemeEditorView themeEditorView = ThemeEditorView.f23192n;
        if (themeEditorView != null) {
            int i12 = themeEditorView.f23199j.getInt("sidex", 1);
            int i13 = themeEditorView.f23199j.getInt("sidey", 0);
            float f12 = themeEditorView.f23199j.getFloat("px", 0.0f);
            float f13 = themeEditorView.f23199j.getFloat("py", 0.0f);
            themeEditorView.f23197g.x = ThemeEditorView.b(true, i12, f12, themeEditorView.e);
            themeEditorView.f23197g.y = ThemeEditorView.b(false, i13, f13, themeEditorView.f23196f);
            try {
                if (themeEditorView.f23193a.getParent() != null) {
                    themeEditorView.h.updateViewLayout(themeEditorView.f23193a, themeEditorView.f23197g);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (org.telegram.ui.ActionBar.j6.f20096o == 3) {
            org.telegram.ui.ActionBar.j6.E(false);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z4;
        int i10;
        String str;
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        f31613z1 = true;
        A1++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        D1 = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.L = UserConfig.selectedAccount;
        registerReceiver(this.f31619c1, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (!UserConfig.getInstance(this.L).isClientActivated() && (intent = getIntent()) != null && intent.getAction() != null) {
            if (!"android.intent.action.SEND".equals(intent.getAction()) && !"android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null) {
                    String lowerCase = data.toString().toLowerCase();
                    if (!lowerCase.startsWith("tg:proxy") && !lowerCase.startsWith("tg://proxy") && !lowerCase.startsWith("tg:webproxy") && !lowerCase.startsWith("tg://webproxy") && !lowerCase.startsWith("tg:socks")) {
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
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20176s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        getWindow().setFormat(-1);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new org.telegram.ui.Components.kh0(26));
        this.f31617b1 = flagSecureReason;
        flagSecureReason.attach();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            AndroidUtilities.isInMultiwindow = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.j6.N();
        org.telegram.ui.ActionBar.j6.R(this);
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        this.f31638n0 = new ActionBarLayout(this, true);
        l0 l0Var = new l0(this, this, 10);
        this.f31650t0 = l0Var;
        l0Var.setClipToPadding(false);
        this.f31650t0.setClipChildren(false);
        setContentView(this.f31650t0);
        this.f31621d1 = new ch.e(this.f31650t0);
        ua0 ua0Var = new ua0(this);
        m.s3 s3Var = this.f31632j0;
        ((cf.c) s3Var.f13642b).f2271a.add(ua0Var);
        ((ViewGroup) getWindow().getDecorView()).addView(s3Var.b());
        s3Var.b().bringToFront();
        ImageView imageView = new ImageView(this);
        this.f31636l0 = imageView;
        imageView.setVisibility(8);
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this);
        this.f31656w0 = y3Var;
        y3Var.setActionBarLayout(this.f31638n0);
        this.f31656w0.addOnLayoutChangeListener(new Object());
        this.f31656w0.setClipChildren(false);
        this.f31656w0.setClipToPadding(false);
        this.f31650t0.addView(this.f31656w0, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.ge geVar = new org.telegram.ui.Components.ge(this, 3);
        this.m0 = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f31650t0.addView(this.m0, k7.b6.c(48.0f, 48));
        this.m0.setVisibility(8);
        l0 l0Var2 = this.f31650t0;
        org.telegram.ui.ActionBar.w3 w3Var = new org.telegram.ui.ActionBar.w3(this);
        this.f31654v0 = w3Var;
        l0Var2.addView(w3Var);
        l0 l0Var3 = this.f31650t0;
        ?? r00Var = new org.telegram.ui.Components.r00(this);
        r00Var.setVisibility(8);
        this.f31652u0 = r00Var;
        l0Var3.addView(r00Var);
        A0();
        this.f31656w0.setParentActionBarLayout(this.f31638n0);
        this.f31638n0.setDrawerLayoutContainer(this.f31656w0);
        this.f31638n0.setFragmentStack(this.f31614a0);
        this.f31638n0.setFragmentStackChangedListener(new x80(this, 2));
        this.f31638n0.setDelegate(this);
        org.telegram.ui.ActionBar.j6.j1(true);
        A();
        M0();
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.closeOtherAppActivities;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i11, this);
        this.Z = ConnectionsManager.getInstance(this.L).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.f31635k1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f31635k1 = null;
        }
        this.f31635k1 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i11).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        w90 w90Var = new w90(this, 0);
        this.f31637m1 = w90Var;
        LiteMode.addOnPowerSaverAppliedListener(w90Var);
        if (this.f31638n0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f31640o0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!UserConfig.getInstance(this.L).isClientActivated()) {
                this.f31638n0.c(-1, Q());
            } else {
                this.f31638n0.c(-1, new vg0());
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
                                    this.f31638n0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.f31638n0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    xn xnVar = new xn(bundle2);
                                    if (this.f31638n0.c(-1, xnVar)) {
                                        xnVar.S7 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    e70 e70Var = new e70(bundle2);
                                    if (this.f31638n0.c(-1, e70Var)) {
                                        e70Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    nd ndVar = new nd(bundle2);
                                    if (this.f31638n0.c(-1, ndVar)) {
                                        ndVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", UserConfig.getInstance(this.L).clientUserId);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.f31638n0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.f31638n0.c(-1, new o81(null));
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        F();
        H(false, true, !this.T0);
        Intent intent2 = getIntent();
        if (bundle != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        X(intent2, false, z4, false, null, true, true);
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
                x90 x90Var = new x90(rootView, 0);
                this.f31620d0 = x90Var;
                viewTreeObserver.addOnGlobalLayoutListener(x90Var);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            FingerprintController.checkKeyReady();
        }
        if (i12 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000 && SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
            Pattern pattern = org.telegram.ui.Components.z4.f31230a;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String string2 = LocaleController.getString(R.string.AllowBackgroundActivity);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.O = string2;
            if (OneUIUtilities.isOneUI()) {
                if (i12 >= 31) {
                    i10 = R.string.AllowBackgroundActivityInfoOneUIAboveS;
                } else {
                    i10 = R.string.AllowBackgroundActivityInfoOneUIBelowS;
                }
            } else {
                i10 = R.string.AllowBackgroundActivityInfo;
            }
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.getString(i10));
            alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new org.telegram.ui.Components.g1(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            d2Var.setOnDismissListener(new dg.e0(3));
            d2Var.show();
            SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
        }
        if (i12 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new xa0(this));
        }
        org.telegram.ui.Components.ic.a(this.f31650t0, new gg.w(9));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        n31.V(false);
        if (i12 >= 34) {
            if (this.f31627g1 == null) {
                this.f31627g1 = new ya0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f31627g1);
        } else if (i12 >= 33) {
            if (this.f31629h1 == null) {
                this.f31629h1 = new za0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f31629h1);
        }
        B();
    }

    @Override
    public final void onDestroy() {
        lf.a0 a0Var;
        l0 l0Var;
        f31613z1 = false;
        A1--;
        unregisterReceiver(this.f31619c1);
        if (A1 == 0) {
            if (PhotoViewer.X8 != null) {
                PhotoViewer.X8.P0();
            }
            if (PhotoViewer.C1()) {
                PhotoViewer.t1().P0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f10 = SecretMediaViewer.f();
                Runnable runnable = f10.f32251m1;
                if (runnable != null) {
                    runnable.run();
                    f10.f32251m1 = null;
                }
                lf.s0 s0Var = f10.f32245i1;
                if (s0Var != null) {
                    s0Var.destroy();
                    f10.f32245i1 = null;
                }
                NotificationCenter.getInstance(f10.f32224a).removeObserver(f10, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f10.f32224a).removeObserver(f10, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f10.f32224a).removeObserver(f10, NotificationCenter.didCreatedNewDeleteTask);
                f10.f32264s = false;
                f10.K = null;
                ImageReceiver.BitmapHolder bitmapHolder = f10.f32238f0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f10.f32238f0 = null;
                }
                f10.i();
                if (f10.f32227b != null && (l0Var = f10.d) != null) {
                    try {
                        if (l0Var.getParent() != null) {
                            ((WindowManager) f10.f32227b.getSystemService("window")).removeViewImmediate(f10.d);
                        }
                        f10.d = null;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                SecretMediaViewer.f32223u1 = null;
            }
            if (l4.I()) {
                l4.x().t();
            }
            if (pt.f37510g0 != null) {
                pt q10 = pt.q();
                q10.E = false;
                q10.f37524l = null;
                q10.W = null;
                q10.Y = null;
                q10.f37512a0 = null;
                if (q10.f37534w != null && q10.f37536y != null) {
                    Bitmap bitmap = q10.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        q10.v = null;
                    }
                    q10.M = 0.0f;
                    q10.K = false;
                    try {
                        if (q10.f37536y.getParent() != null) {
                            ((WindowManager) q10.f37534w.getSystemService("window")).removeViewImmediate(q10.f37536y);
                        }
                        q10.f37536y = null;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    pt.f37510g0 = null;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
                }
            }
            c60 c60Var = c60.A3;
            if (c60Var != null) {
                c60Var.dismissInternal();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.C;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i10 = org.telegram.ui.ActionBar.j6.f19845a;
            org.telegram.ui.Components.pu puVar = org.telegram.ui.Components.pu.P;
            if (puVar != null) {
                puVar.G();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f23192n;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            zf.i iVar = k7.x8.f10028a;
            if (iVar != null) {
                iVar.e.edit().putFloat("x", (float) iVar.f47425c.f16198u.f16204i).putFloat("y", (float) iVar.d.f16198u.f16204i).commit();
            }
            k7.x8.f10028a = null;
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.f31643p1, false);
        for (int i11 = 0; i11 < this.B0.size(); i11++) {
            try {
                if (((Dialog) this.B0.get(i11)).isShowing()) {
                    ((Dialog) this.B0.get(i11)).dismiss();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.B0.clear();
        try {
            if (this.f31620d0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f31620d0);
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (this.f31627g1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f31627g1);
            }
        } else if (i12 >= 33 && this.f31627g1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f31629h1);
        }
        org.telegram.ui.Components.ic.h(this.f31650t0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        d0();
        FlagSecureReason flagSecureReason = this.f31617b1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i12 >= 24 && (a0Var = this.f31625f1) != null) {
            a0Var.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 82 && !SharedConfig.isWaitingForPasscodeEnter) {
            if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (l4.I() && l4.x().S) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f31640o0.getView().getVisibility() == 0 && !this.f31640o0.getFragmentStack().isEmpty()) {
                    this.f31640o0.getView().onKeyUp(i10, keyEvent);
                } else if (this.f31642p0.getView().getVisibility() == 0 && !this.f31642p0.getFragmentStack().isEmpty()) {
                    this.f31642p0.getView().onKeyUp(i10, keyEvent);
                } else {
                    this.f31638n0.getView().onKeyUp(i10, keyEvent);
                }
            } else {
                this.f31638n0.getView().onKeyUp(i10, keyEvent);
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.f31638n0;
        if (actionBarLayout != null) {
            actionBarLayout.J();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f31642p0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.J();
                }
                ActionBarLayout actionBarLayout3 = this.f31640o0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.J();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z4) {
        AndroidUtilities.isInMultiwindow = z4;
        F();
        super.onMultiWindowModeChanged(z4);
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        X(intent, true, false, false, null, true, true);
    }

    @Override
    public final void onPause() {
        boolean z4;
        boolean z10;
        VoIPService sharedInstance;
        super.onPause();
        B1 = false;
        cf.c cVar = this.f31634k0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (AndroidUtilities.isInPictureInPictureMode(cVar.d) && cVar.e() && Build.VERSION.SDK_INT >= 31) {
            cVar.b();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        Utilities.stageQueue.postRunnable(new org.telegram.messenger.e6(this.L, 10));
        f0();
        this.f31638n0.L();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.f31642p0;
            if (actionBarLayout != null) {
                actionBarLayout.L();
            }
            ActionBarLayout actionBarLayout2 = this.f31640o0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.L();
            }
        }
        org.telegram.ui.Components.xd0 xd0Var = this.f31658x0;
        if (xd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xd0Var.f30664b.O);
        }
        ArrayList arrayList = this.f31660y0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            AndroidUtilities.cancelRunOnUIThread(((org.telegram.ui.Components.vd0) obj).O);
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            z4 = applicationLoader.onPause();
        } else {
            z4 = false;
        }
        ConnectionsManager.getInstance(this.L).setAppPaused(!z4, false);
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            if (t12.f31752g2 != null) {
                t12.G0(false, false);
            } else {
                org.telegram.ui.Components.i71 i71Var = t12.C2;
                if (i71Var != null && t12.W2) {
                    i71Var.N(AndroidUtilities.isInPictureInPictureMode(t12.f31913y));
                }
            }
        }
        ph.da daVar = ph.da.C2;
        if (daVar != null) {
            daVar.v(false);
            ph.t9 t9Var = daVar.Z0;
            if (t9Var != null) {
                t9Var.f41809f.r();
            }
            ph.s9 s9Var = daVar.U0;
            if (s9Var != null) {
                s9Var.x(0, true);
            }
        }
        ai1 ai1Var = ai1.f32597k1;
        if (ai1Var != null) {
            boolean isInteractive = ((PowerManager) ai1Var.f32601b.getSystemService("power")).isInteractive();
            int a2 = ff.d.a(ai1Var.f32601b);
            if (a2 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ai1Var.A0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a2 == 2) {
                int measuredHeight = ai1.f32597k1.f32630r0.getMeasuredHeight();
                ai1 ai1Var2 = ai1.f32597k1;
                org.telegram.ui.Components.voip.m2.l(ai1Var2.f32601b, ai1Var2.f32598a, ai1Var2.f32630r0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = ai1.f32597k1.f32626o0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.m2.T = windowInsets.getSystemWindowInsetTop();
                    ai1.f32597k1.f32626o0.getSystemWindowInsetBottom();
                }
            }
            if (ai1Var.f32622k0 && ((!z10 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                org.telegram.ui.Components.voip.m2 k10 = org.telegram.ui.Components.voip.m2.k();
                if (k10.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (k10.C) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = ih.j.f7592n;
        if (hashMap != null) {
            for (ih.j jVar : hashMap.values()) {
                ih.i iVar = jVar.f7596f;
                if (iVar != null) {
                    iVar.f7583b = true;
                }
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        super.onPictureInPictureModeChanged(z4, configuration);
        cf.c cVar = this.f31634k0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z4);
        if (cVar.f2274f) {
            if (z4) {
                cVar.d(1.0f);
                cVar.f2277j.a();
                ArrayList arrayList = cVar.f2272b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((df.b) obj).getClass();
                }
                if (cVar.f2281n) {
                    cVar.f2281n = false;
                    cVar.f2279l.removeFrameCallback(cVar.f2280m);
                }
                ArrayList arrayList2 = cVar.f2271a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((df.c) obj2).f();
                }
            } else if (cVar.e) {
                cVar.c(false);
            } else {
                cVar.a(true);
            }
        }
        if (!z4 && !this.f31641o1) {
            if (org.telegram.ui.Components.voip.g1.f29636a0.S) {
                org.telegram.ui.Components.voip.g1.j();
            }
            if (nh.j1.W.P) {
                nh.j1.j();
            }
            if (org.telegram.ui.Components.lg0.m0.M) {
                org.telegram.ui.Components.lg0.j(false);
            }
            c60.t1(this, null, false, true);
            if (PhotoViewer.X8 != null) {
                PhotoViewer.X8.P0();
            }
            if (PhotoViewer.C1()) {
                PhotoViewer.t1().G0(false, false);
            }
        }
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        cf.c cVar = this.f31634k0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        cVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.f31634k0.g(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z4;
        org.telegram.ui.Components.hm hmVar;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (u(i10, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null && applicationLoader.checkRequestPermissionResult(i10, strArr, iArr)) {
                return;
            }
            if (this.f31638n0.getFragmentStack().size() != 0) {
                this.f31638n0.getFragmentStack().get(this.f31638n0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f31642p0.getFragmentStack().size() != 0) {
                    this.f31642p0.getFragmentStack().get(this.f31642p0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
                if (this.f31640o0.getFragmentStack().size() != 0) {
                    this.f31640o0.getFragmentStack().get(this.f31640o0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
            }
            ai1.q(i10, iArr);
            ph.da daVar = ph.da.C2;
            if (daVar != null) {
                nh.b bVar = daVar.f41472a;
                Activity activity = daVar.f41475b;
                if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i10 == 111) {
                    daVar.f41521p2 = !z4;
                    if (z4 && daVar.f41480c0 == 0) {
                        daVar.f41547x0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            daVar.r();
                        } else {
                            CameraController.getInstance().initCamera(new ph.h8(daVar, 0));
                        }
                    }
                } else if (i10 == 114) {
                    if (z4) {
                        MediaController.loadGalleryPhotosAlbums(0);
                        daVar.f(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint));
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                        d2Var.Q = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ph.q8(daVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        d2Var.show();
                    }
                } else if (i10 == 112) {
                    if (!z4) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                        d2Var2.Q = replaceTags2;
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new ph.q8(daVar, 3));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        d2Var2.show();
                    }
                } else if (i10 == 115) {
                    if (!z4) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory));
                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f19503a;
                        d2Var3.Q = replaceTags3;
                        alertDialog$Builder3.k(LocaleController.getString(R.string.PermissionOpenSettings), new ph.q8(daVar, 5));
                        alertDialog$Builder3.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        d2Var3.show();
                    }
                    if (z4 && (hmVar = daVar.f41541v2) != null) {
                        hmVar.run();
                    }
                    daVar.f41541v2 = null;
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i10), strArr, iArr);
            SparseIntArray sparseIntArray = this.Y0;
            if (sparseIntArray.get(i10, -1) >= 0) {
                int i11 = sparseIntArray.get(i10, -1);
                sparseIntArray.delete(i10);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.permissionsGranted, Integer.valueOf(i11));
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activityPermissionsGranted, Integer.valueOf(i10), strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        MessageObject playingMessageObject;
        cg.n1 n1Var;
        super.onResume();
        B1 = true;
        cf.c cVar = this.f31634k0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (cVar.f2274f) {
            cVar.a(false);
        }
        org.telegram.ui.Components.hu huVar = C1;
        if (huVar != null) {
            huVar.run();
            C1 = null;
        }
        if (org.telegram.ui.ActionBar.j6.f20096o == 3) {
            org.telegram.ui.ActionBar.j6.E(false);
        }
        I(true);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.f31638n0.getView();
        this.f31643p1 = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.L).sortDialogs(null);
        E0();
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.mc(23));
        D(0);
        MediaController.checkGallery();
        g0();
        org.telegram.ui.Components.xd0 xd0Var = this.f31658x0;
        if (xd0Var != null && xd0Var.f30664b.getVisibility() == 0) {
            this.f31638n0.n();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f31642p0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f31640o0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.f31658x0.f30664b.i();
            ArrayList arrayList = this.f31660y0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.ui.Components.vd0) obj).i();
            }
        } else {
            this.f31638n0.M();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.f31642p0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
                ActionBarLayout actionBarLayout4 = this.f31640o0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.M();
                }
            }
        }
        ConnectionsManager.getInstance(this.L).setAppPaused(false, false);
        M0();
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            bu0 bu0Var = t12.f31705b0;
            if (bu0Var != null) {
                bu0Var.invalidate();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hm(t12, 0, 20), 100L);
            }
            org.telegram.ui.Components.i71 i71Var = t12.C2;
            if (i71Var != null) {
                i71Var.K(i71Var.n() + 1);
                if (t12.W2) {
                    t12.C2.N(true);
                }
            }
            ft0 ft0Var = t12.I1;
            if (ft0Var != null && (n1Var = ft0Var.T0.d) != null) {
                n1Var.postRunnable(n1Var.f2483w);
            }
        }
        ph.da daVar = ph.da.C2;
        if (daVar != null) {
            daVar.P();
        }
        if (PipRoundVideoView.C != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            MediaController.getInstance().seekToProgress(playingMessageObject, playingMessageObject.audioProgress);
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).unacceptedTermsOfService != null) {
            int i11 = UserConfig.selectedAccount;
            H0(i11, UserConfig.getInstance(i11).unacceptedTermsOfService);
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
        ai1 ai1Var = ai1.f32597k1;
        if (ai1Var != null) {
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                org.telegram.ui.Components.voip.m2.i();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                ai1Var.H();
            } else if (VoIPService.getSharedState() == null) {
                ai1Var.f32630r0.b();
            }
            ai1Var.G0 = ((KeyguardManager) ai1Var.f32601b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                org.telegram.ui.Components.voip.m2.k().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        a0();
        HashMap hashMap = ih.j.f7592n;
        if (hashMap != null) {
            for (ih.j jVar : hashMap.values()) {
                ih.i iVar = jVar.f7596f;
                if (iVar != null) {
                    iVar.f7583b = false;
                }
            }
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onResume();
        }
        c0 c0Var = F1;
        if (c0Var != null) {
            c0Var.run();
            F1 = null;
        }
        if (MessagesController.getInstance(this.L).hasSetupEmailSuggestion()) {
            MessagesController.getInstance(this.L).checkPromoInfo(true);
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
        this.f31641o1 = true;
        this.f31634k0.h();
        WeakReference weakReference = af.g.e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            af.g.x(activity);
        }
        if (af.g.f168b == null) {
            af.g.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(af.g.d)) {
                    String a2 = j7.r8.a(this);
                    af.g.d = a2;
                    if (a2 == null) {
                    }
                }
                Object obj = new Object();
                jf.a aVar = new jf.a();
                aVar.f9369b = new WeakReference(obj);
                af.g.f169c = aVar;
                String str = af.g.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, aVar, 33)) {
                    af.g.f169c = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        ApplicationLoader.mainInterfaceStopped = false;
        org.telegram.ui.Components.a30.j(this);
        c60 c60Var = c60.A3;
        if (c60Var != null) {
            ArrayList arrayList = c60Var.W1;
            c60.F3 = false;
            c60Var.M.l();
            r30 r30Var = c60Var.f33137j2;
            if (r30Var.getVisibility() == 0) {
                c60Var.f33147m2.G(r30Var, false);
            }
            if (c60.D3) {
                c60Var.f33144l2.I(c60Var.f33141k2, false);
            }
            arrayList.clear();
            arrayList.addAll(c60Var.V1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
            }
            h50 h50Var = c60Var.I;
            org.telegram.ui.Components.o81 o81Var = h50Var.v;
            if (o81Var != null) {
                o81Var.c(true);
            }
            h50Var.C = false;
            c60Var.E.s();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        this.f31641o1 = false;
        cf.c cVar = this.f31634k0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        cVar.e = false;
        if (cVar.f2274f) {
            cVar.c(true);
        }
        cVar.d.unregisterReceiver(cVar.f2282o);
        af.g.x(this);
        ApplicationLoader.mainInterfaceStopped = true;
        org.telegram.ui.Components.a30.j(this);
        c60 c60Var = c60.A3;
        if (c60Var != null) {
            c60.F3 = true;
            ArrayList arrayList = c60Var.W1;
            arrayList.clear();
            arrayList.addAll(c60Var.V1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(false);
            }
            h50 h50Var = c60Var.I;
            org.telegram.ui.Components.o81 o81Var = h50Var.v;
            if (o81Var != null) {
                o81Var.c(false);
            }
            h50Var.C = true;
            c60Var.E.r();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f31623e1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        cf.c cVar = this.f31634k0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        cVar.f();
        ArrayList arrayList = this.X0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.f31638n0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.L0.isEmpty()) {
                ((org.telegram.ui.ActionBar.p2) yh.k(1, actionBarLayout.L0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.r rVar = actionBarLayout.D;
            if (rVar != null) {
                rVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(org.telegram.ui.ActionBar.p2 p2Var) {
        ((ActionBarLayout) O()).P(p2Var);
    }

    public final boolean q0(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10) {
        return ((ActionBarLayout) O()).S(p2Var, z4, z10);
    }

    public final void r0(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B0;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) instanceof rh.q2) {
                    rh.q2 q2Var = (rh.q2) arrayList.get(i10);
                    if (q2Var.isShowing() && q2Var.E == j10) {
                        return;
                    }
                }
                i10++;
            } else {
                org.telegram.ui.ActionBar.p2 U = U();
                if (U != null && U.sheetsStack != null) {
                    for (int i11 = 0; i11 < U.sheetsStack.size(); i11++) {
                        if (U.sheetsStack.get(i11).isShown()) {
                            U.sheetsStack.get(i11);
                        }
                    }
                }
                cz w10 = this.f31638n0.w();
                if (w10 != null && w10.sheetsStack != null) {
                    for (int i12 = 0; i12 < w10.sheetsStack.size(); i12++) {
                        if (w10.sheetsStack.get(i12).isShown()) {
                            w10.sheetsStack.get(i12);
                        }
                    }
                }
                w90 w90Var = new w90(this, 1);
                TLRPC.User user = MessagesController.getInstance(this.L).getUser(Long.valueOf(j10));
                if (user != null) {
                    w90Var.run(user);
                    return;
                } else {
                    MessagesStorage.getInstance(this.L).getStorageQueue().postRunnable(new i5.v(this, j10, w90Var, 28));
                    return;
                }
            }
        }
    }

    public final void s0(Long l10, g00 g00Var, af.f fVar, org.telegram.ui.Cells.t1 t1Var) {
        ChannelBoostsController boostsController = MessagesController.getInstance(this.L).getBoostsController();
        if (fVar != null) {
            fVar.d();
        }
        boostsController.getBoostsStats(l10.longValue(), new w80(this, fVar, g00Var, boostsController, l10, t1Var));
    }

    @Override
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        cf.c cVar = this.f31634k0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        cVar.h = pictureInPictureParams;
    }

    public final void t0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z4, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z10, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, String str26, final String str27, final af.f fVar, final boolean z11, final int i13, final int i14, final int i15, final boolean z12, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final String str29, final boolean z20) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i10).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f31612y1;
                final af.f fVar2 = fVar;
                if (fVar2 != null) {
                    fVar2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i16 = i10;
                final boolean z21 = z11;
                final boolean z22 = z15;
                final boolean z23 = z16;
                final boolean z24 = z17;
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
                    final boolean z25 = z4;
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
                    final boolean z26 = z10;
                    final String str51 = str22;
                    final int i17 = i11;
                    final int i18 = i12;
                    final String str52 = str23;
                    final String str53 = str24;
                    final String str54 = str25;
                    final int i19 = i13;
                    final int i20 = i14;
                    final int i21 = i15;
                    final boolean z27 = z12;
                    final String str55 = str28;
                    final boolean z28 = z18;
                    final boolean z29 = z19;
                    final String str56 = str29;
                    final boolean z30 = z20;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.f31612y1;
                            LaunchActivity.this.x0(i16, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, z25, num3, l12, l13, num4, str42, hashMap2, str43, str44, str45, str46, tL_wallPaper2, str47, str48, str49, str50, z26, str51, i17, i18, str52, str53, str54, null, null, fVar2, z21, i19, false, i20, i21, null, null, z27, str55, z22, z23, z24, z28, z29, str56, null, z30, null);
                        }
                    });
                    return;
                }
                final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                final Runnable runnable2 = runnable;
                final TLRPC.User user2 = user;
                final String str57 = str27;
                final boolean z31 = z14;
                final boolean z32 = z13;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.ActionBar.p2 p2Var;
                        Pattern pattern2 = LaunchActivity.f31612y1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.f31614a0;
                        c10 c10Var = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList);
                        } else {
                            p2Var = null;
                        }
                        int i22 = i16;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str58 = str57;
                        boolean z33 = z22;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z21;
                        r90 r90Var = new r90(launchActivity2, p2Var, i22, user3, tL_messages_botApp2, atomicBoolean, str58, z33, z34, z35, z36);
                        if (z31) {
                            r90Var.run();
                        } else if (tL_messages_botApp2.inactive && z32) {
                            vb vbVar = new vb(r90Var, 2);
                            af.f fVar3 = fVar2;
                            if (fVar3 != null) {
                                c10Var = new c10(fVar3, 14);
                            }
                            si1.a(launchActivity2, vbVar, c10Var);
                        } else if (!tL_messages_botApp2.request_write_access && !z36) {
                            r90Var.run();
                        } else {
                            org.telegram.ui.Components.z4.n(p2Var, atomicBoolean, user3, r90Var);
                        }
                    }
                });
            }
        });
    }

    public final void u0(boolean z4) {
        ActionBarLayout actionBarLayout = this.f31640o0;
        if (actionBarLayout != null) {
            actionBarLayout.U(z4, z4);
        } else {
            this.f31638n0.U(z4, z4);
        }
    }

    public final int v0(final int i10, final g00 g00Var, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i11, final int i12) {
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
        return ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f31612y1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i13 = i10;
                final TLRPC.Chat chat2 = chat;
                final Long l11 = l10;
                final Integer num4 = num2;
                final Integer num5 = num;
                final Runnable runnable2 = runnable;
                final String str2 = str;
                final Integer num6 = num3;
                final byte[] bArr2 = bArr;
                final int i14 = i11;
                final int i15 = i12;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final Runnable runnable3 = g00Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f90.run():void");
                    }
                });
            }
        });
    }

    @Override
    public final boolean w(final org.telegram.ui.oy r47, final java.util.ArrayList r48, final java.lang.CharSequence r49, final boolean r50, boolean r51, int r52, final int r53, org.telegram.ui.kf1 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.w(org.telegram.ui.oy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.kf1):boolean");
    }

    public final void w0(android.net.Uri r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.w0(android.net.Uri):void");
    }

    public final void x0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final af.f r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.x0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, af.f, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void y(int i10) {
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.f31655v1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31655v1 = null;
        }
        if (i12 >= 26) {
            i11 = getWindow().getNavigationBarColor();
        } else {
            i11 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i11, i10);
        this.f31655v1 = ofArgb;
        ofArgb.addUpdateListener(new v80(this, 1));
        this.f31655v1.addListener(new v0(this, i10, 3));
        this.f31655v1.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f31655v1.setDuration(320L);
        this.f31655v1.start();
    }

    public final void z(boolean z4) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z4 || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    boolean z10 = this.l1;
                    this.l1 = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z4, new lh.r5(this, z10, update, 25));
                } else if (!z4 && Math.abs(System.currentTimeMillis() - SharedConfig.lastUpdateCheckTime) < MessagesController.getInstance(0).updateCheckDelay * 1000) {
                } else {
                    TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                    try {
                        tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
                    } catch (Exception unused) {
                    }
                    if (tL_help_getAppUpdate.source == null) {
                        tL_help_getAppUpdate.source = "";
                    }
                    int i10 = this.L;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new lh.s1(this, i10, 6));
                }
            }
        }
    }

    public final void z0(int i10) {
        this.f31656w0.setInternalNavigationBarColor(i10);
        org.telegram.ui.ActionBar.n3 P = P();
        if (P != null) {
            P.setNavigationBarColor(i10);
        }
    }

    @Override
    public final void e(int[] iArr) {
    }
}
