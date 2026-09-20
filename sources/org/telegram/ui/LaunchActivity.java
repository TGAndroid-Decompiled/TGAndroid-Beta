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
import android.util.SparseArray;
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
public class LaunchActivity extends h5 implements org.telegram.ui.ActionBar.a5, NotificationCenter.NotificationCenterDelegate, oy, qf.a {
    public static final Pattern B1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean C1;
    public static int D1;
    public static boolean E1;
    public static org.telegram.ui.Components.nu F1;
    public static LaunchActivity G1;
    public static Pattern H1;
    public static a0 I1;
    public static LaunchActivity J1;
    public org.telegram.ui.Components.ce0 A0;
    public int A1;
    public final ArrayList B0;
    public org.telegram.ui.Components.t01 C0;
    public org.telegram.ui.Components.ca D0;
    public final ArrayList E0;
    public org.telegram.ui.ActionBar.b2 F0;
    public View G0;
    public org.telegram.ui.ActionBar.b2 H0;
    public boolean I0;
    public HashMap J0;
    public HashMap K0;
    public Intent L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public String P0;
    public boolean Q;
    public String Q0;
    public String R;
    public TLRPC.TL_wallPaper R0;
    public String S;
    public org.telegram.ui.ActionBar.i6 S0;
    public CharSequence T;
    public TLRPC.TL_theme T0;
    public ArrayList U;
    public boolean U0;
    public ArrayList V;
    public org.telegram.ui.ActionBar.b2 V0;
    public ArrayList W;
    public boolean W0;
    public Uri X;
    public boolean X0;
    public String Y;
    public xh.p4 Y0;
    public ArrayList Z;
    public w5 Z0;
    public ArrayList f31098a0;
    public final ArrayList f31099a1;
    public Uri f31100b0;
    public final SparseIntArray f31101b1;
    public int f31102c0;
    public int f31103c1;
    public final fb0 f31105d1;
    public FlagSecureReason f31107e1;
    public final LiteMode.BatteryReceiver f31109f1;
    public ha0 f31110g0;
    public ph.e f31111g1;
    public ArrayList f31112h0;
    public boolean f31113h1;
    public ArrayList f31114i0;
    public yf.x f31115i1;
    public String f31116j0;
    public kb0 f31117j1;
    public ActionMode f31118k0;
    public lb0 f31119k1;
    public boolean f31120l0;
    public boolean l1;
    public final com.google.firebase.messaging.n m0;
    public NotificationCenter.ObserversGroup f31121m1;
    public final pf.c f31122n0;
    public NotificationCenter.ObserversGroup f31123n1;
    public ImageView f31124o0;
    public boolean f31125o1;
    public hg.k f31126p0;
    public ga0 f31127p1;
    public ActionBarLayout f31128q0;
    public org.telegram.ui.web.b1 f31129q1;
    public ActionBarLayout f31130r0;
    public boolean f31131r1;
    public ActionBarLayout f31132s0;
    public ViewGroup f31133s1;
    public ya0 f31134t0;
    public org.telegram.ui.ActionBar.b2 f31135t1;
    public FrameLayout f31136u0;
    public org.telegram.ui.ActionBar.b2 f31137u1;
    public hg.q1 f31138v0;
    public boolean f31139v1;
    public j0 f31140w0;
    public long f31141w1;
    public ib0 f31142x0;
    public int[] f31143x1;
    public org.telegram.ui.ActionBar.x3 f31144y0;
    public ValueAnimator f31145y1;
    public org.telegram.ui.ActionBar.z3 f31146z0;
    public yh.q8 f31147z1;
    public final ArrayList P = new ArrayList();
    public final ArrayList f31104d0 = new ArrayList();
    public final ArrayList f31106e0 = new ArrayList();
    public final ArrayList f31108f0 = new ArrayList();

    public LaunchActivity() {
        ?? obj = new Object();
        obj.f7330a = new HashMap();
        obj.d = this;
        obj.f7331b = new pf.c(this);
        this.m0 = obj;
        this.f31122n0 = (pf.c) obj.f7331b;
        this.B0 = new ArrayList();
        this.E0 = new ArrayList();
        this.W0 = false;
        this.f31099a1 = new ArrayList();
        this.f31101b1 = new SparseIntArray();
        this.f31103c1 = 5934;
        this.f31105d1 = new Object();
        this.f31109f1 = new LiteMode.BatteryReceiver();
        this.f31125o1 = true;
        System.identityHashCode(this);
        this.A1 = 0;
    }

    public static void C0(LaunchActivity launchActivity, int i10, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        String restrictionReason;
        org.telegram.ui.ActionBar.n2 R = R();
        if (R != null) {
            long j3 = tL_attachMenuBot.bot_id;
            ei.f5 b10 = ei.f5.b(i10, j3, j3, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.P() != null && launchActivity.P().k(b10) != null) {
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
            ei.k3 k3Var = new ei.k3(launchActivity, R.getResourceProvider());
            k3Var.A0 = false;
            k3Var.w(z10);
            k3Var.f8440k0 = launchActivity;
            k3Var.s(R, b10);
            k3Var.show();
        }
    }

    public static void E(int i10) {
        LaunchActivity launchActivity = J1;
        if (launchActivity != null) {
            launchActivity.D(i10);
        }
    }

    public static void L() {
        hz hzVar;
        ArrayList<org.telegram.ui.ActionBar.j2> arrayList;
        org.telegram.ui.ActionBar.n2 U = U();
        if (U != null) {
            if (U.getParentLayout() instanceof ActionBarLayout) {
                hzVar = ((ActionBarLayout) U.getParentLayout()).w();
            } else {
                hzVar = null;
            }
            if (hzVar != null && (arrayList = hzVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    hzVar.sheetsStack.get(size).dismiss(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.j2> arrayList2 = U.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    U.sheetsStack.get(size2).dismiss(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = ei.k3.W0.iterator();
            while (it.hasNext()) {
                arrayList3.add((ei.k3) it.next());
            }
            int size3 = arrayList3.size();
            int i10 = 0;
            while (i10 < size3) {
                Object obj = arrayList3.get(i10);
                i10++;
                ((ei.k3) obj).k(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 N() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f19982a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = G1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) hg.k0.g(1, G1.P))).t();
        }
        LaunchActivity launchActivity2 = G1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return ((ActionBarLayout) G1.O()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.n2 R() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f19982a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = G1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.d5) hg.k0.g(1, G1.P)).getLastFragment();
        }
        LaunchActivity launchActivity2 = G1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return G1.O().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.n2 U() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f19982a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = G1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.d5) hg.k0.g(1, G1.P)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = G1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return G1.O().getSafeLastFragment();
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
            if (H1 == null) {
                H1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
            }
            try {
                Matcher matcher = H1.matcher(str);
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

    public static void b0(float f7, float f10, float f11) {
        View decorView;
        yh.q8 q8Var;
        LaunchActivity launchActivity = G1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((q8Var = launchActivity.f31147z1) == null || ((View) q8Var.f3000a) != decorView)) {
                launchActivity.f31147z1 = new yh.q8(decorView);
            }
            yh.q8 q8Var2 = launchActivity.f31147z1;
            if (q8Var2 != null) {
                View view = (View) q8Var2.f3000a;
                ArrayList arrayList = q8Var2.f47969b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(v7.a7.a(0.0f, 0.0f, f7, f10), v7.a7.a(view.getWidth(), 0.0f, f7, f10)), Math.max(v7.a7.a(0.0f, view.getHeight(), f7, f10), v7.a7.a(view.getWidth(), view.getHeight(), f7, f10))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    yh.p8 p8Var = new yh.p8(f7, f10, f11);
                    ofFloat.addUpdateListener(new zg.w(1, q8Var2, p8Var));
                    ofFloat.addListener(new org.telegram.ui.Components.zk0(23, q8Var2, p8Var));
                    ofFloat.setInterpolator(org.telegram.ui.Components.qr.f27643g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(p8Var);
                    q8Var2.a1();
                    ofFloat.start();
                }
            }
        }
    }

    public static void y0(AccountInstance accountInstance, uy uyVar, CharSequence charSequence, long j3, MessageObject messageObject, long j10, boolean z10, int i10, int i11) {
        boolean z11;
        org.telegram.ui.Components.zq0 zq0Var;
        org.telegram.ui.Components.zq0 zq0Var2;
        if (uyVar != null && (zq0Var2 = uyVar.G2) != null && !zq0Var2.f30905n) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z11 && uyVar != null && (zq0Var = uyVar.G2) != null) {
            webPage = zq0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z11) {
                SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j3, j10, z10, i10, i11, 0L);
                return;
            }
            CharSequence trimmedString = SendMessagesHelper.getTrimmedString(charSequence);
            if (trimmedString != null && trimmedString.length() != 0) {
                CharSequence[] charSequenceArr = {trimmedString};
                accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j3, messageObject, messageObject, webPage2, z11, accountInstance.getMediaDataController().getEntities(charSequenceArr, true), null, null, z10, i10, i11, null, false));
            }
        }
    }

    @Override
    public final boolean A() {
        ArrayList arrayList = this.U;
        if ((arrayList != null && arrayList.size() == 1) || this.R != null) {
            return true;
        }
        return false;
    }

    public final void A0() {
        org.telegram.ui.ActionBar.z3 z3Var;
        ViewGroup view;
        int i10;
        if (this.f31146z0.indexOfChild(this.f31134t0) != -1) {
            z3Var = this.f31146z0;
            view = this.f31134t0;
        } else {
            z3Var = this.f31146z0;
            view = this.f31128q0.getView();
        }
        int indexOfChild = z3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f31146z0.removeViewAt(indexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            ya0 ya0Var = new ya0(this, this);
            this.f31134t0 = ya0Var;
            if (indexOfChild != -1) {
                this.f31146z0.addView(ya0Var, indexOfChild, w7.y5.c(-1.0f, -1));
            } else {
                this.f31146z0.addView(ya0Var, w7.y5.c(-1.0f, -1));
            }
            hg.q1 q1Var = new hg.q1(this, null, 5);
            this.f31138v0 = q1Var;
            q1Var.setOccupyStatusBar(false);
            this.f31138v0.V(org.telegram.ui.ActionBar.j6.r0());
            this.f31134t0.addView(this.f31138v0, w7.y5.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.f31128q0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f31128q0.getView());
            }
            this.f31134t0.addView(this.f31128q0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f31132s0 = actionBarLayout;
            actionBarLayout.N0 = true;
            actionBarLayout.setFragmentStack(this.f31108f0);
            this.f31132s0.setDelegate(this);
            this.f31134t0.addView(this.f31132s0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f31136u0 = frameLayout;
            ArrayList arrayList = this.f31106e0;
            int i11 = 8;
            if (arrayList.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            frameLayout.setVisibility(i10);
            this.f31136u0.setBackgroundColor(1056964608);
            this.f31134t0.addView(this.f31136u0);
            this.f31136u0.setOnTouchListener(new d0(this, 3));
            this.f31136u0.setOnClickListener(new ai.e2(19));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f31130r0 = actionBarLayout2;
            actionBarLayout2.M0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f31130r0.setBackgroundView(this.f31136u0);
            this.f31130r0.setUseAlphaAnimations(true);
            this.f31130r0.setFragmentStack(arrayList);
            this.f31130r0.setDelegate(this);
            this.f31130r0.setDrawerLayoutContainer(this.f31146z0);
            ViewGroup view2 = this.f31130r0.getView();
            if (!arrayList.isEmpty()) {
                i11 = 0;
            }
            view2.setVisibility(i11);
            this.f31134t0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f31128q0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f31128q0.getView());
            }
            this.f31128q0.setFragmentStack(this.f31104d0);
            if (indexOfChild != -1) {
                this.f31146z0.addView(this.f31128q0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f31146z0.addView(this.f31128q0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        w7.y.a(this, SharedConfig.isFloatingDebugActive, false);
    }

    public final void B() {
        if (this.O == UserConfig.selectedAccount && this.f31121m1 != null) {
            return;
        }
        NotificationCenter.ObserversGroup observersGroup = this.f31121m1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f31121m1 = null;
        }
        int i10 = UserConfig.selectedAccount;
        this.O = i10;
        this.f31121m1 = NotificationCenter.getInstance(i10).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
    }

    public final org.telegram.ui.ActionBar.b2 B0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
            o9.setCanceledOnTouchOutside(true);
            o9.setOnDismissListener(new ei.e0(9, this, o9));
            this.E0.add(o9);
            return o9;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void C() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f31115i1 == null && SharedConfig.frameMetricsEnabled) {
                this.f31115i1 = yf.x.b(this, this.f31140w0);
            }
            yf.x xVar = this.f31115i1;
            if (xVar != null && !SharedConfig.frameMetricsEnabled) {
                xVar.c();
                this.f31115i1 = null;
            }
        }
    }

    public final void D(int i10) {
        J1 = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT >= 26 && i10 == 0) || this.f31139v1) {
            return;
        }
        Utilities.globalQueue.postRunnable(new v80(this, i10, 0), 2000L);
    }

    public final void D0(p.a aVar) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ArrayList arrayList = this.f31106e0;
        if (!arrayList.isEmpty()) {
            n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f31108f0;
            if (!arrayList2.isEmpty()) {
                n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.f31104d0;
                if (!arrayList3.isEmpty()) {
                    n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList3);
                } else {
                    n2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.xc.a(n2Var)) {
            aVar.c(org.telegram.ui.Components.xc.a0(n2Var)).j();
        }
    }

    public final void E0() {
        String str;
        String str2;
        char c10;
        LocaleController.LocaleInfo localeInfo;
        if (UserConfig.getInstance(this.O).isClientActivated()) {
            try {
                if (!this.I0 && !ApplicationLoader.mainInterfacePaused) {
                    String string = MessagesController.getGlobalMainSettings().getString("language_showed2", "");
                    final String str3 = MessagesController.getInstance(this.O).suggestedLangCode;
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
                            i10++;
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
                        this.J0 = null;
                        this.K0 = null;
                        this.I0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = localeInfoArr[1].getLangCode();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) {
                            public final LaunchActivity f35387b;

                            {
                                this.f35387b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.B1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f35387b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.J0 = hashMap2;
                                                        if (launchActivity2.K0 != null && hashMap2 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr2;
                                                            launchActivity2.F0(localeInfoArr3[1], localeInfoArr3[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
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
                                        Pattern pattern2 = LaunchActivity.B1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f35387b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.K0 != null && hashMap22 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.F0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
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
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {
                            public final LaunchActivity f35387b;

                            {
                                this.f35387b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.B1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f35387b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.K0 != null && hashMap22 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr2;
                                                            launchActivity22.F0(localeInfoArr32[1], localeInfoArr32[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
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
                                        Pattern pattern2 = LaunchActivity.B1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f35387b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.K0 != null && hashMap22 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.F0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
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
        if (AndroidUtilities.isTablet() && this.f31132s0 != null) {
            if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
                int i11 = 8;
                if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                    this.O0 = false;
                    List<org.telegram.ui.ActionBar.n2> fragmentStack = this.f31128q0.getFragmentStack();
                    if (fragmentStack.size() >= 2) {
                        while (1 < fragmentStack.size()) {
                            org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.get(1);
                            if (n2Var instanceof zn) {
                                ((zn) n2Var).Y4 = true;
                            }
                            n2Var.onPause();
                            n2Var.onFragmentDestroy();
                            n2Var.setParentLayout(null);
                            fragmentStack.remove(n2Var);
                            this.f31132s0.c(-1, n2Var);
                        }
                        org.telegram.ui.Components.ce0 ce0Var = this.A0;
                        if (ce0Var == null || ce0Var.f23273b.getVisibility() != 0) {
                            this.f31128q0.U(true, true);
                            this.f31132s0.U(true, true);
                        }
                    }
                    ViewGroup view = this.f31132s0.getView();
                    if (this.f31132s0.getFragmentStack().isEmpty()) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    hg.q1 q1Var = this.f31138v0;
                    if (this.f31132s0.getFragmentStack().isEmpty()) {
                        i11 = 0;
                    }
                    q1Var.setVisibility(i11);
                    return;
                }
                this.O0 = true;
                List<org.telegram.ui.ActionBar.n2> fragmentStack2 = this.f31132s0.getFragmentStack();
                if (!fragmentStack2.isEmpty()) {
                    while (fragmentStack2.size() > 0) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentStack2.get(0);
                        if (n2Var2 instanceof zn) {
                            ((zn) n2Var2).Y4 = true;
                        }
                        n2Var2.onPause();
                        n2Var2.onFragmentDestroy();
                        n2Var2.setParentLayout(null);
                        fragmentStack2.remove(n2Var2);
                        this.f31128q0.c(-1, n2Var2);
                    }
                    org.telegram.ui.Components.ce0 ce0Var2 = this.A0;
                    if (ce0Var2 == null || ce0Var2.f23273b.getVisibility() != 0) {
                        this.f31128q0.U(true, true);
                    }
                }
                this.f31132s0.getView().setVisibility(8);
                hg.q1 q1Var2 = this.f31138v0;
                if (this.f31128q0.getFragmentStack().isEmpty()) {
                    i11 = 0;
                }
                q1Var2.setVisibility(i11);
            }
        }
    }

    public final void F0(org.telegram.messenger.LocaleController.LocaleInfo r18, org.telegram.messenger.LocaleController.LocaleInfo r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.F0(org.telegram.messenger.LocaleController$LocaleInfo, org.telegram.messenger.LocaleController$LocaleInfo, java.lang.String):void");
    }

    public final void G(boolean z10) {
        H(z10, true, !this.W0);
    }

    public final void G0(boolean z10, boolean z11, int i10, int i11, cj cjVar) {
        if (this.f31146z0 != null && !isFinishing()) {
            if (this.A0 == null) {
                this.A0 = new org.telegram.ui.Components.ce0(this);
            }
            SharedConfig.appLocked = true;
            int i12 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f31760s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                PhotoViewer.t1().G0(false, true);
            } else if (h4.I() && h4.x().V) {
                h4.x().o(false, true);
            }
            ci.oc.x();
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.A0.show();
            org.telegram.ui.Components.be0 be0Var = this.A0.f23273b;
            ArrayList arrayList = this.B0;
            arrayList.isEmpty();
            be0Var.j(z11, i10, i11, new r80(7, this, cjVar));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                org.telegram.ui.Components.ae0 ae0Var = (org.telegram.ui.Components.ae0) arrayList.get(i13);
                if (z10) {
                    int size = arrayList.size() - 1;
                }
                ae0Var.j(z11, i10, i11, null);
            }
            SharedConfig.isWaitingForPasscodeEnter = true;
            pa0 pa0Var = new pa0(this);
            this.A0.f23273b.setDelegate(pa0Var);
            int size2 = arrayList.size();
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((org.telegram.ui.Components.ae0) obj).setDelegate(pa0Var);
            }
            try {
                NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void H(boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int w02;
        xn xnVar;
        boolean z13;
        ArrayList arrayList = this.f31104d0;
        boolean z14 = true;
        if (!arrayList.isEmpty()) {
            n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList);
        } else {
            n2Var = null;
        }
        char c10 = 2;
        if (n2Var != null && (n2Var.isRemovingFromStack() || n2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(2, arrayList);
            } else {
                n2Var = null;
            }
        }
        if (n2Var != null) {
            n2Var.hasForceLightStatusBar();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (z11) {
                if (n2Var != null) {
                    z13 = n2Var.isLightStatusBar();
                    if (n2Var.getParentLayout() instanceof ActionBarLayout) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) n2Var.getParentLayout();
                        if (actionBarLayout.w() != null && actionBarLayout.w().getLastSheet() != null) {
                            org.telegram.ui.ActionBar.j2 lastSheet = actionBarLayout.w().getLastSheet();
                            if (lastSheet.isShown()) {
                                z13 = lastSheet.isAttachedLightStatusBar();
                            }
                        } else {
                            ArrayList<org.telegram.ui.ActionBar.j2> arrayList2 = n2Var.sheetsStack;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                org.telegram.ui.ActionBar.j2 j2Var = (org.telegram.ui.ActionBar.j2) hg.k0.g(1, n2Var.sheetsStack);
                                if (j2Var.isShown()) {
                                    z13 = j2Var.isAttachedLightStatusBar();
                                }
                            }
                        }
                    }
                } else {
                    z13 = i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19372s8, true)) > 0.699999988079071d;
                }
                AndroidUtilities.setLightStatusBar(this, z13);
            }
            if (i10 >= 26 && z12 && (!z10 || n2Var == null || !n2Var.isInPreviewMode())) {
                if (n2Var != null && z10) {
                    w02 = n2Var.getNavigationBarColor();
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, true);
                }
                if (n2Var instanceof zn) {
                    zn znVar = (zn) n2Var;
                    if (!znVar.Db || (znVar.v.f41372s != 1 && ((xnVar = znVar.f40303ea) == null || !xnVar.G))) {
                        c10 = 1;
                    }
                } else {
                    c10 = 0;
                }
                if (P() != null && P().H > 0) {
                    c10 = 0;
                }
                if (this.f31128q0.w() != null) {
                    hz w10 = this.f31128q0.w();
                    if (w10.sheetsStack != null) {
                        for (int i11 = 0; i11 < w10.sheetsStack.size(); i11++) {
                            org.telegram.ui.ActionBar.j2 j2Var2 = w10.sheetsStack.get(i11);
                            if (j2Var2.attachedToParent()) {
                                w02 = j2Var2.getNavigationBarColor(w02);
                                c10 = 0;
                            }
                        }
                    }
                }
                Iterator it = ei.k3.W0.iterator();
                while (it.hasNext()) {
                    w02 = ((ei.k3) it.next()).getNavigationBarColor(w02);
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

    public final void H0(int i10, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f7;
        float f10;
        if (this.C0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
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
            linearLayout.addView(imageView, w7.y5.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.j6.G6;
            f7 = 4.0f;
            org.telegram.messenger.l0.p(textView, org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, 17.0f);
            textView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
            linearLayout.addView(textView, w7.y5.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f28255a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(51);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView2, w7.y5.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            scrollView.setPadding(AndroidUtilities.dp(24.0f), i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, w7.y5.n(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(LocaleController.getString(R.string.Decline).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            int i13 = org.telegram.ui.ActionBar.j6.f19477y6;
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
            f10 = 10.0f;
            textView3.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
            frameLayout.addView(textView3, w7.y5.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    t01 t01Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                            b2Var.R = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new r01(t01Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            b2Var.T = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (t01Var.f28257c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18654a;
                                b2Var2.R = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new r01(t01Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                b2Var2.T = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", t01Var.f28257c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            t01Var.a();
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
            frameLayout.addView(textView4, w7.y5.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    t01 t01Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                            b2Var.R = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new r01(t01Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            b2Var.T = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (t01Var.f28257c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18654a;
                                b2Var2.R = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new r01(t01Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                b2Var2.T = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", t01Var.f28257c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            t01Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19095d7, false));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.C0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f31146z0.addView(this.C0, w7.y5.c(-1.0f, -1));
            this.C0.setDelegate(new za0(this));
        } else {
            f7 = 4.0f;
            f10 = 10.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i10).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f18385id.data.equals(tL_help_termsOfService.f18385id.data))) {
            UserConfig.getInstance(i10).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i10).saveConfig(false);
        }
        org.telegram.ui.Components.t01 t01Var = this.C0;
        if (t01Var.getVisibility() != 0) {
            t01Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false);
        int dp2 = AndroidUtilities.dp(f10);
        int dp3 = AndroidUtilities.dp(f7);
        int length = spannableStringBuilder.length() - 2;
        for (int i14 = 0; i14 < length; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == '-') {
                    int i16 = i14 + 2;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        org.telegram.ui.Components.bb bbVar = new org.telegram.ui.Components.bb(dp2, dp3);
                        spannableStringBuilder.replace(i15, i14 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(bbVar, i15, i16, 33);
                    }
                }
            }
        }
        t01Var.f28255a.setText(spannableStringBuilder);
        t01Var.f28257c = tL_help_termsOfService;
        t01Var.d = i10;
        this.C0.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    public final void I(boolean z10) {
        ChatObject.Call call;
        long j3;
        boolean z11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z12 = false;
        if (sharedInstance != null && (call = sharedInstance.groupCall) != null) {
            boolean z13 = this.f31120l0;
            TLRPC.InputPeer groupCallPeer = sharedInstance.getGroupCallPeer();
            if (groupCallPeer != null) {
                j3 = groupCallPeer.user_id;
                if (j3 == 0) {
                    long j10 = groupCallPeer.chat_id;
                    if (j10 == 0) {
                        j10 = groupCallPeer.channel_id;
                    }
                    j3 = -j10;
                }
            } else {
                j3 = UserConfig.getInstance(this.O).clientUserId;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j3);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && groupCallParticipant.raise_hand_rating != 0) {
                z12 = true;
            }
            this.f31120l0 = z12;
            if (!z10 && z13 && !z12 && !z11 && i60.D3 == null) {
                J0(38);
                return;
            }
            return;
        }
        this.f31120l0 = false;
    }

    public final void I0(int i10, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        if (this.D0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i11 = org.telegram.ui.ActionBar.j6.f19094d6;
            frameLayout.f23223w = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.w0(null, i11, false), 0});
            frameLayout.f23224x = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.j6.w0(null, i11, false), 0});
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            int i12 = (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight));
            ?? imageView = new ImageView(this);
            imageView.f(R.raw.qr_code_logo, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().K(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            frameLayout2.addView((View) imageView, w7.y5.d(-2, -2.0f, 17, 0.0f, i12, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.f0((Object) frameLayout, 4));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f23219f = scrollView;
            AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19372s8, false));
            scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, w7.y5.d(-1, -1.0f, 51, 27.0f, i12 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.UpdateTelegram));
            frameLayout3.addView(textView, w7.y5.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f23216a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(49);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            frameLayout3.addView(textView2, w7.y5.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            ai.f0 f0Var = new ai.f0(this, 7);
            frameLayout.d = f0Var;
            f0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            f0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
            f0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(f0Var, w7.y5.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            f0Var.setOnClickListener(new sf(20, frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f23217b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            f0Var.addView(textView3, w7.y5.e(-2, -2, 17));
            ai.f0 f0Var2 = new ai.f0((Object) frameLayout, this, 8);
            frameLayout.f23218c = f0Var2;
            f0Var2.setWillNotDraw(false);
            f0Var2.setAlpha(0.0f);
            f0Var2.setScaleX(0.1f);
            f0Var2.setScaleY(0.1f);
            f0Var2.setVisibility(4);
            org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(f0Var2);
            frameLayout.e = lj0Var;
            lj0Var.d(null, true, false);
            lj0Var.f26162o = -1;
            f0Var.addView(f0Var2, w7.y5.e(36, 36, 17));
            this.D0 = frameLayout;
            this.f31146z0.addView((View) frameLayout, w7.y5.c(-1.0f, -1));
        }
        org.telegram.ui.Components.ca caVar = this.D0;
        caVar.v = 0;
        caVar.f23220n = tL_help_appUpdate;
        caVar.f23222s = i10;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            caVar.f23221r = FileLoader.getAttachFileName(document);
        }
        if (caVar.getVisibility() != 0) {
            caVar.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false);
        caVar.f23216a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            TextView textView4 = caVar.f23217b;
            textView4.setText(LocaleController.getString(R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tL_help_appUpdate.document.size)));
        } else {
            caVar.f23217b.setText(LocaleController.getString(R.string.Update));
        }
        NotificationCenter.getInstance(caVar.f23222s).addObserver(caVar, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(caVar.f23222s).addObserver(caVar, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(caVar.f23222s).addObserver(caVar, NotificationCenter.fileLoadProgressChanged);
        if (z10 && ApplicationLoader.isStandaloneBuild()) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(caVar.f23222s).sendRequest(tL_help_getAppUpdate, new org.telegram.ui.Components.x1(caVar, 1));
        }
    }

    public final void J() {
        ArrayList arrayList = this.f31104d0;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.n2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (AndroidUtilities.isTablet()) {
            ArrayList arrayList2 = this.f31106e0;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((org.telegram.ui.ActionBar.n2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f31108f0;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                ((org.telegram.ui.ActionBar.n2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void J0(int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.f31104d0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.n2 n2Var = this.f31128q0.getFragmentStack().get(this.f31128q0.getFragmentStack().size() - 1);
            if (n2Var instanceof gh0) {
                n2Var = ((gh0) n2Var).X();
            }
            UndoView undoView = null;
            if (n2Var instanceof zn) {
                zn znVar = (zn) n2Var;
                if (chat != null && znVar.a() == (-chat.f18328id)) {
                    chat = null;
                }
                znVar.Q7();
                undoView = znVar.y3;
            } else if (n2Var instanceof uy) {
                undoView = ((uy) n2Var).Y3();
            } else if (n2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) n2Var).M;
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
    public final boolean K(org.telegram.ui.uy r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.K(org.telegram.ui.uy):boolean");
    }

    public final void K0(int i10) {
        L0(i10, new ja0(0));
    }

    public final void L0(int i10, GenericProvider genericProvider) {
        if (i10 != UserConfig.selectedAccount && UserConfig.isValidAccount(i10)) {
            this.l1 = true;
            ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
            UserConfig.selectedAccount = i10;
            UserConfig.getInstance(0).saveConfig(false);
            B();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAccountChanged, Integer.valueOf(i10));
            if (AndroidUtilities.isTablet()) {
                this.f31130r0.X();
                this.f31132s0.X();
                if (!this.O0) {
                    if (this.f31132s0.getFragmentStack().isEmpty()) {
                        this.f31138v0.setVisibility(0);
                    }
                    this.f31132s0.getView().setVisibility(8);
                }
                this.f31130r0.getView().setVisibility(8);
            }
            this.f31128q0.X();
            this.f31128q0.c(-3, (gh0) genericProvider.provide(null));
            this.f31128q0.U(true, true);
            if (AndroidUtilities.isTablet()) {
                this.f31130r0.U(true, true);
                this.f31132s0.U(true, true);
            }
            if (!ApplicationLoader.mainInterfacePaused) {
                ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
            }
            if (UserConfig.getInstance(i10).unacceptedTermsOfService != null) {
                H0(i10, UserConfig.getInstance(i10).unacceptedTermsOfService);
            }
            M0();
            this.l1 = false;
        }
    }

    public final java.util.ArrayList M(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.M(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void M0() {
        String str;
        int i10;
        if (this.f31128q0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.O).getConnectionState();
            this.f31102c0 = connectionState;
            g90 g90Var = null;
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
                g90Var = new g90(this, 5);
            }
            ActionBarLayout actionBarLayout = this.f31128q0;
            actionBarLayout.G0 = str;
            actionBarLayout.H0 = i10;
            actionBarLayout.I0 = g90Var;
            for (int i11 = 0; i11 < actionBarLayout.O0.size(); i11++) {
                ((org.telegram.ui.ActionBar.n2) actionBarLayout.O0.get(i11)).setTitleOverlayText(actionBarLayout.G0, actionBarLayout.H0, g90Var);
            }
        }
    }

    public final org.telegram.ui.ActionBar.d5 O() {
        ActionBarLayout actionBarLayout = this.f31128q0;
        ArrayList arrayList = this.P;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.d5) hg.k0.g(1, arrayList);
        }
        return actionBarLayout;
    }

    public final org.telegram.ui.ActionBar.o3 P() {
        ActionBarLayout actionBarLayout = this.f31132s0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f31132s0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.f31128q0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.f31128q0.getBottomSheetTabs();
        }
        return null;
    }

    public final org.telegram.ui.ActionBar.n2 Q() {
        if (yg0.j1(this.O, false).getInt("currentViewNum", 0) != 0) {
            return new yg0();
        }
        return new d80();
    }

    public final int S() {
        return this.f31104d0.size();
    }

    public final ph.e T() {
        return this.f31111g1;
    }

    public final boolean X(android.content.Intent r126, boolean r127, boolean r128, boolean r129, nf.e r130, boolean r131, boolean r132) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.X(android.content.Intent, boolean, boolean, boolean, nf.e, boolean, boolean):boolean");
    }

    public final void Y() {
        ActionMode actionMode = this.f31118k0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    @Override
    public final void a(float f7) {
        if (h4.I() && h4.x().V) {
            h4 x10 = h4.x();
            x10.S();
            h4.g0(x10);
            if (x10.f34100f0 != null) {
                x10.f34114u0[0].f35287b.g1();
                x10.f34114u0[1].f35287b.g1();
                x10.f34100f0.invalidate();
                x10.f34110q0.invalidate();
                if (f7 == 1.0f) {
                    x10.f34114u0[0].f35288c.l();
                    x10.f34114u0[1].f35288c.l();
                }
            }
        }
        if (PhotoViewer.C1()) {
            PhotoViewer.t1().t3();
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.a0():void");
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.f31130r0) {
            this.f31132s0.U(z10, z10);
            this.f31128q0.U(z10, z10);
        }
    }

    public final boolean c0(boolean z10) {
        boolean z11;
        mg.i iVar = w7.y.f45168a;
        if (iVar != null) {
            if (iVar.f15051s) {
                if (z10) {
                    iVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.ce0 ce0Var = this.A0;
        if (ce0Var != null && ce0Var.f23273b.getVisibility() == 0) {
            if (z10) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.x3 x3Var = this.f31144y0;
            if (x3Var != null && (z11 = x3Var.U)) {
                if (z10 && z11) {
                    x3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.un0.H;
                if (b2Var != null) {
                    if (z10) {
                        b2Var.dismiss();
                        org.telegram.ui.Components.un0.H = null;
                        return false;
                    }
                } else if (st.f37523g0 != null && st.q().E) {
                    if (z10) {
                        st.q().o();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f31760s) {
                    if (z10) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                    if (z10) {
                        PhotoViewer.t1().G0(true, false);
                        return false;
                    }
                } else if (!h4.I() || !h4.x().V) {
                    return true;
                } else {
                    if (z10) {
                        h4.x().o(true, false);
                    }
                }
            }
        }
        return false;
    }

    public final void d0() {
        w5 w5Var = this.Z0;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.Z0 = null;
        }
        if (!this.Q) {
            this.Q = true;
            NotificationCenter.ObserversGroup observersGroup = this.f31121m1;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.f31121m1 = null;
            }
            NotificationCenter.ObserversGroup observersGroup2 = this.f31123n1;
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                this.f31123n1 = null;
            }
            ga0 ga0Var = this.f31127p1;
            if (ga0Var != null) {
                LiteMode.removeOnPowerSaverAppliedListener(ga0Var);
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

    public final void e0(Intent intent, nf.e eVar) {
        super.onNewIntent(intent);
        X(intent, true, false, false, eVar, true, false);
    }

    public final void f0() {
        if (this.Z0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodePause");
            }
            AndroidUtilities.cancelRunOnUIThread(this.Z0);
            this.Z0 = null;
        }
        if (SharedConfig.passcodeHash.length() != 0) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            w5 w5Var = new w5(this, 8);
            this.Z0 = w5Var;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(w5Var, 1000L);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in 1000");
                }
            } else if (SharedConfig.autoLockIn != 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in " + ((SharedConfig.autoLockIn * 1000) + 1000));
                }
                AndroidUtilities.runOnUIThread(this.Z0, (SharedConfig.autoLockIn * 1000) + 1000);
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
    }

    public final void g0() {
        if (this.Z0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodeResume");
            }
            AndroidUtilities.cancelRunOnUIThread(this.Z0);
            this.Z0 = null;
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
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
        boolean z10;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (AndroidUtilities.isTablet()) {
            boolean z11 = n2Var instanceof uy;
            if (!z11 && !(n2Var instanceof gh0)) {
                if ((n2Var instanceof zn) && !((zn) n2Var).c()) {
                    boolean z12 = this.O0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f31132s0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f31138v0.setVisibility(8);
                        this.f31132s0.X();
                        this.f31132s0.c(-1, n2Var);
                        if (!this.f31130r0.getFragmentStack().isEmpty()) {
                            while (this.f31130r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f31130r0;
                                actionBarLayout4.a0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f31130r0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.f31128q0)) {
                        actionBarLayout2.c(-1, n2Var);
                        if (!this.f31130r0.getFragmentStack().isEmpty()) {
                            while (this.f31130r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f31130r0;
                                actionBarLayout5.a0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f31130r0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f31130r0;
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
                    if ((n2Var instanceof yg0) && i10 == -1) {
                        this.f31138v0.setVisibility(0);
                        this.f31136u0.setBackgroundColor(0);
                    } else {
                        this.f31136u0.setBackgroundColor(2130706432);
                    }
                    this.f31130r0.c(-1, n2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.f31128q0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z11 && !((uy) n2Var).h4()) {
                    z10 = false;
                }
                if (z10) {
                    this.f31128q0.X();
                    this.f31128q0.c(-1, n2Var);
                    this.f31130r0.X();
                    this.f31130r0.getView().setVisibility(8);
                    if (!this.O0 && this.f31132s0.getFragmentStack().isEmpty()) {
                        this.f31138v0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        org.telegram.ui.ActionBar.b2 b2Var = this.V0;
        if (b2Var != null) {
            try {
                b2Var.dismiss();
            } finally {
                this.V0 = null;
            }
        }
        this.Q0 = null;
        this.R0 = null;
        this.S0 = null;
        this.P0 = null;
        this.T0 = null;
    }

    public final void i0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.i0(boolean):void");
    }

    @Override
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f31760s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
            return true;
        } else if (!h4.I() || !h4.x().V) {
            return false;
        } else {
            h4.x().o(true, false);
            return true;
        }
    }

    public final void j0(TL_account.Password password) {
        String str;
        yg0 yg0Var = new yg0();
        g90 g90Var = new g90(this, 0);
        yg0Var.F = 3;
        yg0Var.f39909a = 12;
        yg0Var.f39915d0 = g90Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f23124a |= 256;
                obj.f23125b = indexOf;
                int i10 = lastIndexOf + 1;
                obj.f23126c = i10;
                valueOf.setSpan(new org.telegram.ui.Components.d11(obj, 0), indexOf, i10, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            alertDialog$Builder.f18654a.R = valueOf;
            alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.EmailLoginChangeMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChangeEmail), new z10(7, this, yg0Var));
            hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
            return;
        }
        p0(yg0Var);
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f31128q0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.l1) {
                d0();
                finish();
                return false;
            } else if (actionBarLayout == this.f31132s0) {
                if (!this.O0) {
                    this.f31138v0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f31130r0 && this.f31128q0.getFragmentStack().isEmpty() && this.f31130r0.getFragmentStack().size() == 1) {
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

    public final void k0(final long j3, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i10, final int i11) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            p0(fg1.F0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(this.O).getInputChannel(-j3);
        tL_channels_getMessages.f18366id.add(num);
        ConnectionsManager.getInstance(this.O).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new l90(LaunchActivity.this, tLObject, num, num2, bArr, j3, runnable, str, i10, i11));
            }
        });
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.b5 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.b5):boolean");
    }

    public final void l0(long[] jArr, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ai.u9 a2;
        long[] jArr2 = jArr;
        int i10 = 0;
        while (true) {
            if (i10 < jArr2.length) {
                TLRPC.User user = MessagesController.getInstance(this.O).getUser(Long.valueOf(jArr2[i10]));
                if (user != null && !user.stories_hidden) {
                    z11 = false;
                    break;
                }
                i10++;
            } else {
                z11 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.n2 R = R();
        if (R != null) {
            ai.l9 storiesController = MessagesController.getInstance(this.O).getStoriesController();
            if (z11) {
                arrayList = storiesController.h;
            } else {
                arrayList = storiesController.f1197g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z12 = z11;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z12) {
                ArrayList arrayList5 = new ArrayList();
                for (int i11 = 0; i11 < jArr2.length; i11++) {
                    TLRPC.User user2 = MessagesController.getInstance(this.O).getUser(Long.valueOf(jArr2[i11]));
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
            if (z10) {
                for (int i13 = 0; i13 < jArr2.length; i13 = com.google.android.gms.internal.vision.e2.g(jArr2[i13], arrayList4, i13, 1)) {
                }
            } else {
                for (int i14 = 0; i14 < jArr2.length; i14 = com.google.android.gms.internal.vision.e2.g(jArr2[i14], arrayList3, i14, 1)) {
                }
            }
            if (!arrayList4.isEmpty() && z10) {
                MessagesController messagesController = MessagesController.getInstance(this.O);
                int[] iArr = {arrayList4.size()};
                vq vqVar = new vq(this, iArr, jArr2, 18);
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
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getPeerStories, new ai.u1(messagesController, longValue, vqVar, 3));
                    }
                }
                return;
            }
            long clientUserId = UserConfig.getInstance(this.O).getClientUserId();
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i16)).peer);
                if (peerDialogId != clientUserId && !arrayList3.contains(Long.valueOf(peerDialogId)) && storiesController.J(peerDialogId)) {
                    arrayList3.add(Long.valueOf(peerDialogId));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (R instanceof uy) {
                    try {
                        a2 = ai.u9.a(((uy) R).E0.h);
                    } catch (Exception unused) {
                    }
                    ai.u9 u9Var = a2;
                    R.getOrCreateStoryViewer().v();
                    R.getOrCreateStoryViewer().G(this, null, arrayList3, 0, null, null, u9Var, false);
                }
                a2 = null;
                ai.u9 u9Var2 = a2;
                R.getOrCreateStoryViewer().v();
                R.getOrCreateStoryViewer().G(this, null, arrayList3, 0, null, null, u9Var2, false);
            }
        }
    }

    public final void m0(final int i10, final long j3, final boolean z10) {
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var;
        ai.d9 A;
        MessageObject f7;
        MessageObject f10;
        TL_stories.StoryItem storyItem2;
        ai.l9 storiesController = MessagesController.getInstance(this.O).getStoriesController();
        TL_stories.PeerStories y3 = storiesController.y(j3);
        ai.u9 u9Var = null;
        if (y3 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < y3.stories.size()) {
                    if (y3.stories.get(i11).f18563id == i10) {
                        storyItem2 = y3.stories.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    storyItem2 = null;
                    break;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j3;
                org.telegram.ui.ActionBar.n2 R = R();
                if (R != null) {
                    if (R instanceof uy) {
                        try {
                            u9Var = ai.u9.a(((uy) R).E0.h);
                        } catch (Exception unused) {
                        }
                    }
                    R.getOrCreateStoryViewer().v();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z10) {
                        R.getOrCreateStoryViewer().f1118w1 = true;
                    }
                    R.getOrCreateStoryViewer().G(this, storyItem2, arrayList, 0, null, y3, u9Var, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            ai.d9 A2 = storiesController.A(j3, 0, -1, true);
            if (A2 != null && (f10 = A2.f(i10)) != null) {
                storyItem = f10.storyItem;
                d9Var = A2;
            } else {
                d9Var = null;
            }
            if (storyItem == null && (A = storiesController.A(j3, 1, -1, true)) != null && (f7 = A.f(i10)) != null) {
                storyItem = f7.storyItem;
                d9Var = A;
            }
            if (storyItem != null && d9Var != null) {
                storyItem.dialogId = j3;
                org.telegram.ui.ActionBar.n2 R2 = R();
                if (R2 == null) {
                    return;
                }
                if (R2 instanceof uy) {
                    try {
                        u9Var = ai.u9.a(((uy) R2).E0.h);
                    } catch (Exception unused2) {
                    }
                }
                ai.u9 u9Var2 = u9Var;
                R2.getOrCreateStoryViewer().v();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    R2.getOrCreateStoryViewer().f1118w1 = true;
                }
                R2.getOrCreateStoryViewer().G(this, storyItem, arrayList2, 0, d9Var, null, u9Var2, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.O).getInputPeer(j3);
        tL_stories_getStoriesByID.f18570id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.gg(LaunchActivity.this, tLObject, i10, j3, z10));
            }
        });
    }

    public final void n0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z10;
        int i10 = i6Var.f18982f0;
        org.telegram.ui.ActionBar.h6 f7 = i6Var.f(tL_theme, this.O, 0);
        i6Var.Z = i6Var.Y;
        i6Var.u(f7.f18927a);
        f7.f18942s = tL_wallPaper;
        if (i10 != i6Var.f18982f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0(new xd1(i6Var, z10, 0, false, false));
    }

    public final void o0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.o0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f31118k0 == actionMode) {
            this.f31118k0 = null;
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f31128q0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f18641y;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.f18638w0 = false;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f31132s0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f18641y;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.f18638w0 = false;
                ActionBarLayout actionBarLayout3 = this.f31130r0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f18641y;
                if (kVar3 != null) {
                    kVar3.setVisibility(0);
                }
                actionBarLayout3.f18638w0 = false;
            }
        }
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.f31118k0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.f31128q0.s(menu) && AndroidUtilities.isTablet() && !this.f31132s0.s(menu)) {
                this.f31130r0.s(menu);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f31128q0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f18641y;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.f18638w0 = true;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f31132s0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f18641y;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.f18638w0 = true;
                ActionBarLayout actionBarLayout3 = this.f31130r0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f18641y;
                if (kVar3 != null) {
                    kVar3.setVisibility(8);
                }
                actionBarLayout3.f18638w0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        ai.f6 currentPeerView;
        org.telegram.ui.Components.e91 e91Var;
        VoIPService sharedInstance;
        boolean z10 = false;
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onActivityResult");
            }
            UserConfig.getInstance(this.O).saveConfig(false);
        }
        if (i10 == 105) {
            if (Build.VERSION.SDK_INT >= 23) {
                boolean canDrawOverlays = Settings.canDrawOverlays(this);
                ApplicationLoader.canDrawOverlays = canDrawOverlays;
                if (canDrawOverlays) {
                    i60 i60Var = i60.D3;
                    if (i60Var != null) {
                        i60Var.dismissInternal();
                    }
                    AndroidUtilities.runOnUIThread(new g90(this, 4), 200L);
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
            LocationController locationController = LocationController.getInstance(this.O);
            if (i11 == -1) {
                z10 = true;
            }
            locationController.startFusedLocationRequest(z10);
        } else if (i10 == 521) {
            org.telegram.ui.web.b1 b1Var = this.f31129q1;
            if (b1Var != null) {
                if (i11 == -1) {
                    z10 = true;
                }
                b1Var.run(Boolean.valueOf(z10));
                this.f31129q1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f22429n;
            if (themeEditorView != null && (e91Var = themeEditorView.f22437k) != null) {
                e91Var.a(i10, i11, intent);
            }
            ActionBarLayout actionBarLayout = this.f31128q0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.n2 n2Var = this.f31128q0.getFragmentStack().get(this.f31128q0.getFragmentStack().size() - 1);
                n2Var.onActivityResultFragment(i10, i11, intent);
                if (n2Var.getLastStoryViewer() != null && (currentPeerView = n2Var.getLastStoryViewer().f1096n0.getCurrentPeerView()) != null && i11 == -1) {
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
                                ai.g4 g4Var = currentPeerView.I2;
                                if (g4Var != null) {
                                    g4Var.dismiss();
                                }
                                currentPeerView.k0(true);
                            }
                        }
                    } else {
                        currentPeerView.t0();
                        ai.g4 g4Var2 = currentPeerView.I2;
                        if (g4Var2 != null) {
                            g4Var2.f29110j0.g0(i10, intent, null);
                        }
                    }
                }
            }
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f31132s0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f31132s0.getFragmentStack().get(this.f31132s0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f31130r0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f31130r0.getFragmentStack().get(this.f31130r0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onActivityResultReceived, Integer.valueOf(i10), Integer.valueOf(i11), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (c0(true)) {
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f31130r0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f31130r0.G();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f31132s0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f31132s0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.f31132s0.getFragmentStack().get(this.f31132s0.getFragmentStack().size() - 1);
                    if (n2Var.onBackPressed(true)) {
                        n2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.f31128q0.G();
                return;
            }
            this.f31128q0.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        this.f31122n0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        AndroidUtilities.resetTabletFlag();
        a0();
        F();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            int i10 = pipRoundVideoView.f22309x.getInt("sidex", 1);
            int i11 = pipRoundVideoView.f22309x.getInt("sidey", 0);
            float f7 = pipRoundVideoView.f22309x.getFloat("px", 0.0f);
            float f10 = pipRoundVideoView.f22309x.getFloat("py", 0.0f);
            pipRoundVideoView.v.x = PipRoundVideoView.b(true, i10, f7, pipRoundVideoView.h);
            pipRoundVideoView.v.y = PipRoundVideoView.b(false, i11, f10, pipRoundVideoView.f22305n);
            pipRoundVideoView.f22308w.updateViewLayout(pipRoundVideoView.f22301a, pipRoundVideoView.v);
        }
        org.telegram.ui.Components.vu vuVar = org.telegram.ui.Components.vu.S;
        if (vuVar != null) {
            vuVar.onConfigurationChanged(configuration);
        }
        tg.m mVar = tg.m.e;
        if (mVar != null) {
            mVar.onConfigurationChanged(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        ThemeEditorView themeEditorView = ThemeEditorView.f22429n;
        if (themeEditorView != null) {
            int i12 = themeEditorView.f22436j.getInt("sidex", 1);
            int i13 = themeEditorView.f22436j.getInt("sidey", 0);
            float f11 = themeEditorView.f22436j.getFloat("px", 0.0f);
            float f12 = themeEditorView.f22436j.getFloat("py", 0.0f);
            themeEditorView.f22434g.x = ThemeEditorView.b(true, i12, f11, themeEditorView.e);
            themeEditorView.f22434g.y = ThemeEditorView.b(false, i13, f12, themeEditorView.f22433f);
            try {
                if (themeEditorView.f22430a.getParent() != null) {
                    themeEditorView.h.updateViewLayout(themeEditorView.f22430a, themeEditorView.f22434g);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (org.telegram.ui.ActionBar.j6.f19289o == 3) {
            org.telegram.ui.ActionBar.j6.E(false);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i10;
        String str;
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        C1 = true;
        D1++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        G1 = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.O = UserConfig.selectedAccount;
        registerReceiver(this.f31109f1, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (!UserConfig.getInstance(this.O).isClientActivated() && (intent = getIntent()) != null && intent.getAction() != null) {
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
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19372s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        getWindow().setFormat(-1);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new org.telegram.ui.Components.ig0(29));
        this.f31107e1 = flagSecureReason;
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
        this.f31128q0 = new ActionBarLayout(this, true);
        j0 j0Var = new j0(this, this, 9);
        this.f31140w0 = j0Var;
        j0Var.setClipToPadding(false);
        this.f31140w0.setClipChildren(false);
        setContentView(this.f31140w0);
        this.f31111g1 = new ph.e(this.f31140w0);
        gb0 gb0Var = new gb0(this);
        com.google.firebase.messaging.n nVar = this.m0;
        ((pf.c) nVar.f7331b).f41067a.add(gb0Var);
        ((ViewGroup) getWindow().getDecorView()).addView(nVar.q());
        nVar.q().bringToFront();
        ImageView imageView = new ImageView(this);
        this.f31124o0 = imageView;
        imageView.setVisibility(8);
        org.telegram.ui.ActionBar.z3 z3Var = new org.telegram.ui.ActionBar.z3(this);
        this.f31146z0 = z3Var;
        z3Var.setActionBarLayout(this.f31128q0);
        this.f31146z0.addOnLayoutChangeListener(new Object());
        this.f31146z0.setClipChildren(false);
        this.f31146z0.setClipToPadding(false);
        this.f31140w0.addView(this.f31146z0, w7.y5.c(-1.0f, -1));
        hg.k kVar = new hg.k(this, 4);
        this.f31126p0 = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f31140w0.addView(this.f31126p0, w7.y5.c(48.0f, 48));
        this.f31126p0.setVisibility(8);
        j0 j0Var2 = this.f31140w0;
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this);
        this.f31144y0 = x3Var;
        j0Var2.addView(x3Var);
        j0 j0Var3 = this.f31140w0;
        ?? r00Var = new org.telegram.ui.Components.r00(this);
        r00Var.setVisibility(8);
        this.f31142x0 = r00Var;
        j0Var3.addView(r00Var);
        A0();
        this.f31146z0.setParentActionBarLayout(this.f31128q0);
        this.f31128q0.setDrawerLayoutContainer(this.f31146z0);
        this.f31128q0.setFragmentStack(this.f31104d0);
        this.f31128q0.setFragmentStackChangedListener(new g90(this, 2));
        this.f31128q0.setDelegate(this);
        org.telegram.ui.ActionBar.j6.j1(true);
        B();
        M0();
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.closeOtherAppActivities;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i11, this);
        this.f31102c0 = ConnectionsManager.getInstance(this.O).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.f31123n1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f31123n1 = null;
        }
        this.f31123n1 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i11).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        ga0 ga0Var = new ga0(this, 0);
        this.f31127p1 = ga0Var;
        LiteMode.addOnPowerSaverAppliedListener(ga0Var);
        if (this.f31128q0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f31130r0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!UserConfig.getInstance(this.O).isClientActivated()) {
                this.f31128q0.c(-1, Q());
            } else {
                this.f31128q0.c(-1, new gh0());
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
                                    this.f31128q0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.f31128q0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    zn znVar = new zn(bundle2);
                                    if (this.f31128q0.c(-1, znVar)) {
                                        znVar.V7 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    l70 l70Var = new l70(bundle2);
                                    if (this.f31128q0.c(-1, l70Var)) {
                                        l70Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    md mdVar = new md(bundle2);
                                    if (this.f31128q0.c(-1, mdVar)) {
                                        mdVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", UserConfig.getInstance(this.O).clientUserId);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.f31128q0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.f31128q0.c(-1, new i91(null));
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
        H(false, true, !this.W0);
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
                ha0 ha0Var = new ha0(rootView, 0);
                this.f31110g0 = ha0Var;
                viewTreeObserver.addOnGlobalLayoutListener(ha0Var);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            FingerprintController.checkKeyReady();
        }
        if (i12 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000 && SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
            Pattern pattern = org.telegram.ui.Components.d5.f23492a;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String string2 = LocaleController.getString(R.string.AllowBackgroundActivity);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
            b2Var.R = string2;
            if (OneUIUtilities.isOneUI()) {
                if (i12 >= 31) {
                    i10 = R.string.AllowBackgroundActivityInfoOneUIAboveS;
                } else {
                    i10 = R.string.AllowBackgroundActivityInfoOneUIBelowS;
                }
            } else {
                i10 = R.string.AllowBackgroundActivityInfo;
            }
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(i10));
            alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new org.telegram.ui.Components.h1(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            b2Var.setOnDismissListener(new ci.f1(3));
            b2Var.show();
            SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
        }
        if (i12 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new jb0(this));
        }
        org.telegram.ui.Components.pc.a(this.f31140w0, new ci.d9(10));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        f41.V(false);
        if (i12 >= 34) {
            if (this.f31117j1 == null) {
                this.f31117j1 = new kb0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f31117j1);
        } else if (i12 >= 33) {
            if (this.f31119k1 == null) {
                this.f31119k1 = new lb0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f31119k1);
        }
        C();
    }

    @Override
    public final void onDestroy() {
        yf.x xVar;
        j0 j0Var;
        C1 = false;
        D1--;
        unregisterReceiver(this.f31109f1);
        if (D1 == 0) {
            if (PhotoViewer.f31182b9 != null) {
                PhotoViewer.f31182b9.P0();
            }
            if (PhotoViewer.C1()) {
                PhotoViewer.t1().P0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f7 = SecretMediaViewer.f();
                Runnable runnable = f7.f31754p1;
                if (runnable != null) {
                    runnable.run();
                    f7.f31754p1 = null;
                }
                mb0 mb0Var = f7.l1;
                if (mb0Var != null) {
                    mb0Var.destroy();
                    f7.l1 = null;
                }
                NotificationCenter.getInstance(f7.f31720a).removeObserver(f7, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f7.f31720a).removeObserver(f7, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f7.f31720a).removeObserver(f7, NotificationCenter.didCreatedNewDeleteTask);
                f7.f31760s = false;
                f7.N = null;
                ImageReceiver.BitmapHolder bitmapHolder = f7.f31740i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f7.f31740i0 = null;
                }
                f7.i();
                if (f7.f31723b != null && (j0Var = f7.d) != null) {
                    try {
                        if (j0Var.getParent() != null) {
                            ((WindowManager) f7.f31723b.getSystemService("window")).removeViewImmediate(f7.d);
                        }
                        f7.d = null;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                SecretMediaViewer.f31719x1 = null;
            }
            if (h4.I()) {
                h4.x().t();
            }
            if (st.f37523g0 != null) {
                st q6 = st.q();
                q6.E = false;
                q6.f37537l = null;
                q6.W = null;
                q6.Y = null;
                q6.f37525a0 = null;
                if (q6.f37547w != null && q6.f37549y != null) {
                    Bitmap bitmap = q6.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        q6.v = null;
                    }
                    q6.M = 0.0f;
                    q6.K = false;
                    try {
                        if (q6.f37549y.getParent() != null) {
                            ((WindowManager) q6.f37547w.getSystemService("window")).removeViewImmediate(q6.f37549y);
                        }
                        q6.f37549y = null;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    st.f37523g0 = null;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
                }
            }
            i60 i60Var = i60.D3;
            if (i60Var != null) {
                i60Var.dismissInternal();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i10 = org.telegram.ui.ActionBar.j6.f19031a;
            org.telegram.ui.Components.vu vuVar = org.telegram.ui.Components.vu.S;
            if (vuVar != null) {
                vuVar.H();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f22429n;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            mg.i iVar = w7.y.f45168a;
            if (iVar != null) {
                iVar.e.edit().putFloat("x", (float) iVar.f15047c.f15522u.f15528i).putFloat("y", (float) iVar.d.f15522u.f15528i).commit();
            }
            w7.y.f45168a = null;
            SparseArray sparseArray = org.telegram.ui.Components.p5.f27149q;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.f31133s1, false);
        for (int i11 = 0; i11 < this.E0.size(); i11++) {
            try {
                if (((Dialog) this.E0.get(i11)).isShowing()) {
                    ((Dialog) this.E0.get(i11)).dismiss();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.E0.clear();
        try {
            if (this.f31110g0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f31110g0);
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (this.f31117j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f31117j1);
            }
        } else if (i12 >= 33 && this.f31117j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f31119k1);
        }
        org.telegram.ui.Components.pc.h(this.f31140w0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        d0();
        FlagSecureReason flagSecureReason = this.f31107e1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i12 >= 24 && (xVar = this.f31115i1) != null) {
            xVar.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 82 && !SharedConfig.isWaitingForPasscodeEnter) {
            if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (h4.I() && h4.x().V) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f31130r0.getView().getVisibility() == 0 && !this.f31130r0.getFragmentStack().isEmpty()) {
                    this.f31130r0.getView().onKeyUp(i10, keyEvent);
                } else if (this.f31132s0.getView().getVisibility() == 0 && !this.f31132s0.getFragmentStack().isEmpty()) {
                    this.f31132s0.getView().onKeyUp(i10, keyEvent);
                } else {
                    this.f31128q0.getView().onKeyUp(i10, keyEvent);
                }
            } else {
                this.f31128q0.getView().onKeyUp(i10, keyEvent);
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.f31128q0;
        if (actionBarLayout != null) {
            actionBarLayout.J();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f31132s0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.J();
                }
                ActionBarLayout actionBarLayout3 = this.f31130r0;
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
        E1 = false;
        pf.c cVar = this.f31122n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (AndroidUtilities.isInPictureInPictureMode(cVar.d) && cVar.e() && Build.VERSION.SDK_INT >= 31) {
            cVar.b();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        Utilities.stageQueue.postRunnable(new ei.r2(this.O, 11));
        f0();
        this.f31128q0.L();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.f31132s0;
            if (actionBarLayout != null) {
                actionBarLayout.L();
            }
            ActionBarLayout actionBarLayout2 = this.f31130r0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.L();
            }
        }
        org.telegram.ui.Components.ce0 ce0Var = this.A0;
        if (ce0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ce0Var.f23273b.R);
        }
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            AndroidUtilities.cancelRunOnUIThread(((org.telegram.ui.Components.ae0) obj).R);
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            z10 = applicationLoader.onPause();
        } else {
            z10 = false;
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(!z10, false);
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            if (t12.f31267j2 != null) {
                t12.G0(false, false);
            } else {
                org.telegram.ui.Components.t71 t71Var = t12.F2;
                if (t71Var != null && t12.Z2) {
                    t71Var.N(AndroidUtilities.isInPictureInPictureMode(t12.f31399y));
                }
            }
        }
        ci.oc ocVar = ci.oc.F2;
        if (ocVar != null) {
            ocVar.v(false);
            ci.ec ecVar = ocVar.f5214c1;
            if (ecVar != null) {
                ecVar.f4996f.r();
            }
            ci.cc ccVar = ocVar.X0;
            if (ccVar != null) {
                ccVar.x(0, true);
            }
        }
        ti1 ti1Var = ti1.f37768n1;
        if (ti1Var != null) {
            boolean isInteractive = ((PowerManager) ti1Var.f37772b.getSystemService("power")).isInteractive();
            int a2 = sf.c.a(ti1Var.f37772b);
            if (a2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (ti1Var.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a2 == 2) {
                int measuredHeight = ti1.f37768n1.f37807u0.getMeasuredHeight();
                ti1 ti1Var2 = ti1.f37768n1;
                org.telegram.ui.Components.voip.m2.l(ti1Var2.f37772b, ti1Var2.f37769a, ti1Var2.f37807u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = ti1.f37768n1.f37803r0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.m2.W = windowInsets.getSystemWindowInsetTop();
                    ti1.f37768n1.f37803r0.getSystemWindowInsetBottom();
                }
            }
            if (ti1Var.f37798n0 && ((!z11 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                org.telegram.ui.Components.voip.m2 k10 = org.telegram.ui.Components.voip.m2.k();
                if (k10.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (k10.F) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = vh.g.f44690n;
        if (hashMap != null) {
            for (vh.g gVar : hashMap.values()) {
                vh.f fVar = gVar.f44694f;
                if (fVar != null) {
                    fVar.f44681b = true;
                }
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        pf.c cVar = this.f31122n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (cVar.f41070f) {
            if (z10) {
                cVar.d(1.0f);
                cVar.f41073j.a();
                ArrayList arrayList = cVar.f41068b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((qf.b) obj).getClass();
                }
                if (cVar.f41077n) {
                    cVar.f41077n = false;
                    cVar.f41075l.removeFrameCallback(cVar.f41076m);
                }
                ArrayList arrayList2 = cVar.f41067a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((qf.c) obj2).f();
                }
            } else if (cVar.e) {
                cVar.c(false);
            } else {
                cVar.a(true);
            }
        }
        if (!z10 && !this.f31131r1) {
            if (org.telegram.ui.Components.voip.j1.f29408d0.V) {
                org.telegram.ui.Components.voip.j1.j();
            }
            if (ai.m2.Z.S) {
                ai.m2.j();
            }
            if (org.telegram.ui.Components.og0.f26912p0.P) {
                org.telegram.ui.Components.og0.j(false);
            }
            i60.t1(this, null, false, true);
            if (PhotoViewer.f31182b9 != null) {
                PhotoViewer.f31182b9.P0();
            }
            if (PhotoViewer.C1()) {
                PhotoViewer.t1().G0(false, false);
            }
        }
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        pf.c cVar = this.f31122n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        cVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.f31122n0.g(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        ai.n8 n8Var;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (v(i10, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null && applicationLoader.checkRequestPermissionResult(i10, strArr, iArr)) {
                return;
            }
            if (this.f31128q0.getFragmentStack().size() != 0) {
                this.f31128q0.getFragmentStack().get(this.f31128q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f31132s0.getFragmentStack().size() != 0) {
                    this.f31132s0.getFragmentStack().get(this.f31132s0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
                if (this.f31130r0.getFragmentStack().size() != 0) {
                    this.f31130r0.getFragmentStack().get(this.f31130r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
            }
            ti1.q(i10, iArr);
            ci.oc ocVar = ci.oc.F2;
            if (ocVar != null) {
                ai.d dVar = ocVar.f5205a;
                Activity activity = ocVar.f5208b;
                if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 111) {
                    ocVar.f5265s2 = !z10;
                    if (z10 && ocVar.f5223f0 == 0) {
                        ocVar.A0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            ocVar.r();
                        } else {
                            CameraController.getInstance().initCamera(new ci.ka(ocVar, 0));
                        }
                    }
                } else if (i10 == 114) {
                    if (z10) {
                        MediaController.loadGalleryPhotosAlbums(0);
                        ocVar.f(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, dVar);
                        alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint));
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                        b2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ci.ta(ocVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        b2Var.show();
                    }
                } else if (i10 == 112) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity, 0, dVar);
                        alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18654a;
                        b2Var2.T = replaceTags2;
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new ci.ta(ocVar, 3));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        b2Var2.show();
                    }
                } else if (i10 == 115) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity, 0, dVar);
                        alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory));
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f18654a;
                        b2Var3.T = replaceTags3;
                        alertDialog$Builder3.k(LocaleController.getString(R.string.PermissionOpenSettings), new ci.ta(ocVar, 5));
                        alertDialog$Builder3.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        b2Var3.show();
                    }
                    if (z10 && (n8Var = ocVar.f5286y2) != null) {
                        n8Var.run();
                    }
                    ocVar.f5286y2 = null;
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i10), strArr, iArr);
            SparseIntArray sparseIntArray = this.f31101b1;
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
        pg.c1 c1Var;
        super.onResume();
        E1 = true;
        pf.c cVar = this.f31122n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (cVar.f41070f) {
            cVar.a(false);
        }
        org.telegram.ui.Components.nu nuVar = F1;
        if (nuVar != null) {
            nuVar.run();
            F1 = null;
        }
        if (org.telegram.ui.ActionBar.j6.f19289o == 3) {
            org.telegram.ui.ActionBar.j6.E(false);
        }
        I(true);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.f31128q0.getView();
        this.f31133s1 = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.O).sortDialogs(null);
        E0();
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.sh(22));
        D(0);
        MediaController.checkGallery();
        g0();
        org.telegram.ui.Components.ce0 ce0Var = this.A0;
        if (ce0Var != null && ce0Var.f23273b.getVisibility() == 0) {
            this.f31128q0.n();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f31132s0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f31130r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.A0.f23273b.i();
            ArrayList arrayList = this.B0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.ui.Components.ae0) obj).i();
            }
        } else {
            this.f31128q0.M();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.f31132s0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
                ActionBarLayout actionBarLayout4 = this.f31130r0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.M();
                }
            }
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
        M0();
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            vu0 vu0Var = t12.f31221e0;
            if (vu0Var != null) {
                vu0Var.invalidate();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kd(t12, 0, 22), 100L);
            }
            org.telegram.ui.Components.t71 t71Var = t12.F2;
            if (t71Var != null) {
                t71Var.K(t71Var.n() + 1);
                if (t12.Z2) {
                    t12.F2.N(true);
                }
            }
            au0 au0Var = t12.L1;
            if (au0Var != null && (c1Var = au0Var.W0.d) != null) {
                c1Var.postRunnable(c1Var.f41121w);
            }
        }
        ci.oc ocVar = ci.oc.F2;
        if (ocVar != null) {
            ocVar.P();
        }
        if (PipRoundVideoView.F != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
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
        ti1 ti1Var = ti1.f37768n1;
        if (ti1Var != null) {
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                org.telegram.ui.Components.voip.m2.i();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                ti1Var.H();
            } else if (VoIPService.getSharedState() == null) {
                ti1Var.f37807u0.b();
            }
            ti1Var.J0 = ((KeyguardManager) ti1Var.f37772b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                org.telegram.ui.Components.voip.m2.k().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        a0();
        HashMap hashMap = vh.g.f44690n;
        if (hashMap != null) {
            for (vh.g gVar : hashMap.values()) {
                vh.f fVar = gVar.f44694f;
                if (fVar != null) {
                    fVar.f44681b = false;
                }
            }
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onResume();
        }
        a0 a0Var = I1;
        if (a0Var != null) {
            a0Var.run();
            I1 = null;
        }
        if (MessagesController.getInstance(this.O).hasSetupEmailSuggestion()) {
            MessagesController.getInstance(this.O).checkPromoInfo(true);
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
        this.f31131r1 = true;
        this.f31122n0.h();
        WeakReference weakReference = nf.f.e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            nf.f.x(activity);
        }
        if (nf.f.f15432b == null) {
            nf.f.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(nf.f.d)) {
                    String a2 = w7.g8.a(this);
                    nf.f.d = a2;
                    if (a2 == null) {
                    }
                }
                Object obj = new Object();
                a9.d dVar = new a9.d();
                dVar.f320b = new WeakReference(obj);
                nf.f.f15433c = dVar;
                String str = nf.f.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, dVar, 33)) {
                    nf.f.f15433c = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        ApplicationLoader.mainInterfaceStopped = false;
        org.telegram.ui.Components.z20.j(this);
        i60 i60Var = i60.D3;
        if (i60Var != null) {
            ArrayList arrayList = i60Var.Z1;
            i60.I3 = false;
            i60Var.P.l();
            w30 w30Var = i60Var.f34408m2;
            if (w30Var.getVisibility() == 0) {
                i60Var.f34421p2.G(w30Var, false);
            }
            if (i60.G3) {
                i60Var.f34417o2.I(i60Var.f34413n2, false);
            }
            arrayList.clear();
            arrayList.addAll(i60Var.Y1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
            }
            m50 m50Var = i60Var.L;
            org.telegram.ui.Components.a91 a91Var = m50Var.v;
            if (a91Var != null) {
                a91Var.c(true);
            }
            m50Var.F = false;
            i60Var.H.s();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        this.f31131r1 = false;
        pf.c cVar = this.f31122n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        cVar.e = false;
        if (cVar.f41070f) {
            cVar.c(true);
        }
        cVar.d.unregisterReceiver(cVar.f41078o);
        nf.f.x(this);
        ApplicationLoader.mainInterfaceStopped = true;
        org.telegram.ui.Components.z20.j(this);
        i60 i60Var = i60.D3;
        if (i60Var != null) {
            i60.I3 = true;
            ArrayList arrayList = i60Var.Z1;
            arrayList.clear();
            arrayList.addAll(i60Var.Y1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(false);
            }
            m50 m50Var = i60Var.L;
            org.telegram.ui.Components.a91 a91Var = m50Var.v;
            if (a91Var != null) {
                a91Var.c(false);
            }
            m50Var.F = true;
            i60Var.H.r();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f31113h1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        pf.c cVar = this.f31122n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        cVar.f();
        ArrayList arrayList = this.f31099a1;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.f31128q0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.O0.isEmpty()) {
                ((org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.c1.i(1, actionBarLayout.O0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.s sVar = actionBarLayout.G;
            if (sVar != null) {
                sVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(org.telegram.ui.ActionBar.n2 n2Var) {
        ((ActionBarLayout) O()).P(n2Var);
    }

    public final boolean q0(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) O()).S(n2Var, z10, z11);
    }

    public final void r0(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E0;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) instanceof ei.k3) {
                    ei.k3 k3Var = (ei.k3) arrayList.get(i10);
                    if (k3Var.isShowing() && k3Var.H == j3) {
                        return;
                    }
                }
                i10++;
            } else {
                org.telegram.ui.ActionBar.n2 U = U();
                if (U != null && U.sheetsStack != null) {
                    for (int i11 = 0; i11 < U.sheetsStack.size(); i11++) {
                        if (U.sheetsStack.get(i11).isShown()) {
                            U.sheetsStack.get(i11);
                        }
                    }
                }
                hz w10 = this.f31128q0.w();
                if (w10 != null && w10.sheetsStack != null) {
                    for (int i12 = 0; i12 < w10.sheetsStack.size(); i12++) {
                        if (w10.sheetsStack.get(i12).isShown()) {
                            w10.sheetsStack.get(i12);
                        }
                    }
                }
                ga0 ga0Var = new ga0(this, 1);
                TLRPC.User user = MessagesController.getInstance(this.O).getUser(Long.valueOf(j3));
                if (user != null) {
                    ga0Var.run(user);
                    return;
                } else {
                    MessagesStorage.getInstance(this.O).getStorageQueue().postRunnable(new a3.h0(this, j3, ga0Var, 27));
                    return;
                }
            }
        }
    }

    public final void s0(Long l4, r80 r80Var, nf.e eVar, org.telegram.ui.Cells.u1 u1Var) {
        ChannelBoostsController boostsController = MessagesController.getInstance(this.O).getBoostsController();
        if (eVar != null) {
            eVar.d();
        }
        boostsController.getBoostsStats(l4.longValue(), new f90(this, eVar, r80Var, boostsController, l4, u1Var));
    }

    @Override
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        pf.c cVar = this.f31122n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        cVar.h = pictureInPictureParams;
    }

    public final void t0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l4, final Long l10, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, String str26, final String str27, final nf.e eVar, final boolean z12, final int i13, final int i14, final int i15, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i10).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.B1;
                final nf.e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i16 = i10;
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
                    final Long l11 = l4;
                    final Long l12 = l10;
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
                    final int i17 = i11;
                    final int i18 = i12;
                    final String str52 = str23;
                    final String str53 = str24;
                    final String str54 = str25;
                    final int i19 = i13;
                    final int i20 = i14;
                    final int i21 = i15;
                    final boolean z28 = z13;
                    final String str55 = str28;
                    final boolean z29 = z19;
                    final boolean z30 = z20;
                    final String str56 = str29;
                    final boolean z31 = z21;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.B1;
                            LaunchActivity.this.x0(i16, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, z26, num3, l11, l12, num4, str42, hashMap2, str43, str44, str45, str46, tL_wallPaper2, str47, str48, str49, str50, z27, str51, i17, i18, str52, str53, str54, null, null, eVar2, z22, i19, false, i20, i21, null, null, z28, str55, z23, z24, z25, z29, z30, str56, null, z31, null);
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
                        org.telegram.ui.ActionBar.n2 n2Var;
                        Pattern pattern2 = LaunchActivity.B1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.f31104d0;
                        g10 g10Var = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            n2Var = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList);
                        } else {
                            n2Var = null;
                        }
                        int i22 = i16;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str58 = str57;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z25;
                        boolean z37 = z22;
                        ba0 ba0Var = new ba0(launchActivity2, n2Var, i22, user3, tL_messages_botApp2, atomicBoolean, str58, z34, z35, z36, z37);
                        if (z32) {
                            ba0Var.run();
                        } else if (tL_messages_botApp2.inactive && z33) {
                            yb ybVar = new yb(ba0Var, 2);
                            nf.e eVar3 = eVar2;
                            if (eVar3 != null) {
                                g10Var = new g10(eVar3, 14);
                            }
                            lj1.a(launchActivity2, ybVar, g10Var);
                        } else if (!tL_messages_botApp2.request_write_access && !z37) {
                            ba0Var.run();
                        } else {
                            org.telegram.ui.Components.d5.n(n2Var, atomicBoolean, user3, ba0Var);
                        }
                    }
                });
            }
        });
    }

    @Override
    public final boolean u(final org.telegram.ui.uy r47, final java.util.ArrayList r48, final java.lang.CharSequence r49, final boolean r50, boolean r51, int r52, final int r53, org.telegram.ui.fg1 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.u(org.telegram.ui.uy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.fg1):boolean");
    }

    public final void u0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f31130r0;
        if (actionBarLayout != null) {
            actionBarLayout.U(z10, z10);
        } else {
            this.f31128q0.U(z10, z10);
        }
    }

    public final int v0(final int i10, final r80 r80Var, final Integer num, final Integer num2, final Long l4, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i11, final int i12) {
        int longValue;
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        if (num2 != null) {
            longValue = num.intValue();
        } else {
            longValue = (int) l4.longValue();
        }
        tL_messages_getDiscussionMessage.msg_id = longValue;
        return ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.B1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i13 = i10;
                final TLRPC.Chat chat2 = chat;
                final Long l10 = l4;
                final Integer num4 = num2;
                final Integer num5 = num;
                final Runnable runnable2 = runnable;
                final String str2 = str;
                final Integer num6 = num3;
                final byte[] bArr2 = bArr;
                final int i14 = i11;
                final int i15 = i12;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final Runnable runnable3 = r80Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p90.run():void");
                    }
                });
            }
        });
    }

    public final void w0(android.net.Uri r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.w0(android.net.Uri):void");
    }

    public final void x0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final nf.e r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.x0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, nf.e, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void y(int i10) {
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.f31145y1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31145y1 = null;
        }
        if (i12 >= 26) {
            i11 = getWindow().getNavigationBarColor();
        } else {
            i11 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i11, i10);
        this.f31145y1 = ofArgb;
        ofArgb.addUpdateListener(new e90(this, 1));
        this.f31145y1.addListener(new t0(this, i10, 3));
        this.f31145y1.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f31145y1.setDuration(320L);
        this.f31145y1.start();
    }

    public final void z(boolean z10) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z10 || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    boolean z11 = this.f31125o1;
                    this.f31125o1 = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z10, new ka0(this, z11, update, 0));
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
                    int i10 = this.O;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new ai.g8(this, i10, 5));
                }
            }
        }
    }

    public final void z0(int i10) {
        this.f31146z0.setInternalNavigationBarColor(i10);
        org.telegram.ui.ActionBar.o3 P = P();
        if (P != null) {
            P.setNavigationBarColor(i10);
        }
    }

    @Override
    public final void e(int[] iArr) {
    }
}
