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
public class LaunchActivity extends m5 implements org.telegram.ui.ActionBar.a5, NotificationCenter.NotificationCenterDelegate, xx, sf.a {
    public static final Pattern C1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean D1;
    public static int E1;
    public static boolean F1;
    public static org.telegram.ui.Components.uu G1;
    public static LaunchActivity H1;
    public static Pattern I1;
    public static b0 J1;
    public static LaunchActivity K1;
    public org.telegram.ui.Components.ne0 A0;
    public ai.oe A1;
    public final ArrayList B0;
    public int B1;
    public org.telegram.ui.Components.c11 C0;
    public org.telegram.ui.Components.da D0;
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
    public org.telegram.ui.ActionBar.g6 S0;
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
    public yh.n4 Y0;
    public ArrayList Z;
    public a6 Z0;
    public ArrayList f33143a0;
    public final ArrayList f33144a1;
    public Uri f33145b0;
    public final SparseIntArray f33146b1;
    public int f33147c0;
    public int f33148c1;
    public final ia0 f33150d1;
    public FlagSecureReason f33152e1;
    public final LiteMode.BatteryReceiver f33154f1;
    public p90 f33155g0;
    public qh.e f33156g1;
    public ArrayList f33157h0;
    public boolean f33158h1;
    public ArrayList f33159i0;
    public zf.x f33160i1;
    public String f33161j0;
    public na0 f33162j1;
    public ActionMode f33163k0;
    public oa0 f33164k1;
    public boolean f33165l0;
    public boolean l1;
    public final com.google.firebase.messaging.l m0;
    public NotificationCenter.ObserversGroup f33166m1;
    public final rf.b f33167n0;
    public NotificationCenter.ObserversGroup f33168n1;
    public ImageView f33169o0;
    public boolean f33170o1;
    public ig.k f33171p0;
    public o90 f33172p1;
    public ActionBarLayout f33173q0;
    public ig.l0 f33174q1;
    public ActionBarLayout f33175r0;
    public boolean f33176r1;
    public ActionBarLayout f33177s0;
    public ViewGroup f33178s1;
    public ba0 f33179t0;
    public final xk0 f33180t1;
    public FrameLayout f33181u0;
    public org.telegram.ui.ActionBar.b2 f33182u1;
    public ig.p1 f33183v0;
    public org.telegram.ui.ActionBar.b2 f33184v1;
    public m0 f33185w0;
    public boolean f33186w1;
    public la0 f33187x0;
    public long f33188x1;
    public org.telegram.ui.ActionBar.w3 f33189y0;
    public int[] f33190y1;
    public org.telegram.ui.ActionBar.y3 f33191z0;
    public ValueAnimator f33192z1;
    public final ArrayList P = new ArrayList();
    public final ArrayList f33149d0 = new ArrayList();
    public final ArrayList f33151e0 = new ArrayList();
    public final ArrayList f33153f0 = new ArrayList();

    public LaunchActivity() {
        ?? obj = new Object();
        obj.f7646a = new HashMap();
        obj.d = this;
        obj.f7647b = new rf.b(this);
        this.m0 = obj;
        this.f33167n0 = (rf.b) obj.f7647b;
        this.B0 = new ArrayList();
        this.E0 = new ArrayList();
        this.W0 = false;
        this.f33144a1 = new ArrayList();
        this.f33146b1 = new SparseIntArray();
        this.f33148c1 = 5934;
        this.f33150d1 = new Object();
        this.f33154f1 = new LiteMode.BatteryReceiver();
        this.f33170o1 = true;
        System.identityHashCode(this);
        this.f33180t1 = new xk0(this);
        this.B1 = 0;
    }

    public static void C0(AccountInstance accountInstance, ey eyVar, CharSequence charSequence, long j10, MessageObject messageObject, long j11, boolean z10, int i10, int i11) {
        boolean z11;
        org.telegram.ui.Components.ir0 ir0Var;
        org.telegram.ui.Components.ir0 ir0Var2;
        if (eyVar != null && (ir0Var2 = eyVar.G2) != null && !ir0Var2.f27342n) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z11 && eyVar != null && (ir0Var = eyVar.G2) != null) {
            webPage = ir0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z11) {
                SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j10, j11, z10, i10, i11, 0L);
                return;
            }
            CharSequence trimmedString = SendMessagesHelper.getTrimmedString(charSequence);
            if (trimmedString != null && trimmedString.length() != 0) {
                CharSequence[] charSequenceArr = {trimmedString};
                accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j10, messageObject, messageObject, webPage2, z11, accountInstance.getMediaDataController().getEntities(charSequenceArr, true), null, null, z10, i10, i11, null, false));
            }
        }
    }

    public static void E(int i10) {
        LaunchActivity launchActivity = K1;
        if (launchActivity != null) {
            launchActivity.C(i10);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i10, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        String restrictionReason;
        org.telegram.ui.ActionBar.n2 R = R();
        if (R != null) {
            long j10 = tL_attachMenuBot.bot_id;
            gi.t4 b10 = gi.t4.b(i10, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
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
            gi.d3 d3Var = new gi.d3(launchActivity, R.getResourceProvider());
            d3Var.A0 = false;
            d3Var.x(z10);
            d3Var.f11149k0 = launchActivity;
            d3Var.t(R, b10);
            d3Var.show();
        }
    }

    public static void L() {
        ry ryVar;
        ArrayList<org.telegram.ui.ActionBar.j2> arrayList;
        org.telegram.ui.ActionBar.n2 U = U();
        if (U != null) {
            if (U.getParentLayout() instanceof ActionBarLayout) {
                ryVar = ((ActionBarLayout) U.getParentLayout()).w();
            } else {
                ryVar = null;
            }
            if (ryVar != null && (arrayList = ryVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ryVar.sheetsStack.get(size).dismiss(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.j2> arrayList2 = U.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    U.sheetsStack.get(size2).dismiss(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = gi.d3.W0.iterator();
            while (it.hasNext()) {
                arrayList3.add((gi.d3) it.next());
            }
            int size3 = arrayList3.size();
            int i10 = 0;
            while (i10 < size3) {
                Object obj = arrayList3.get(i10);
                i10++;
                ((gi.d3) obj).k(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 N() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f21934a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) i2.d.h(1, H1.P))).t();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return ((ActionBarLayout) H1.O()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.n2 R() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f21934a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.d5) i2.d.h(1, H1.P)).getLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return H1.O().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.n2 U() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f21934a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.d5) i2.d.h(1, H1.P)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return H1.O().getSafeLastFragment();
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
            if (I1 == null) {
                I1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
            }
            try {
                Matcher matcher = I1.matcher(str);
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
                        return (Integer.parseInt(str5) * 86400) + (Integer.parseInt(str4) * 3600) + (parseInt5 * 60) + parseInt4;
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

    public static void a0(View view) {
        if (view.getLayerType() != 0) {
            view.invalidate();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a0(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void c0(float f7, float f10, float f11) {
        View decorView;
        ai.oe oeVar;
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((oeVar = launchActivity.A1) == null || ((View) oeVar.f1058a) != decorView)) {
                launchActivity.A1 = new ai.oe(decorView);
            }
            ai.oe oeVar2 = launchActivity.A1;
            if (oeVar2 != null) {
                View view = (View) oeVar2.f1058a;
                ArrayList arrayList = oeVar2.f1983b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(v7.f7.a(0.0f, 0.0f, f7, f10), v7.f7.a(view.getWidth(), 0.0f, f7, f10)), Math.max(v7.f7.a(0.0f, view.getHeight(), f7, f10), v7.f7.a(view.getWidth(), view.getHeight(), f7, f10))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    ai.ne neVar = new ai.ne(f7, f10, f11);
                    ofFloat.addUpdateListener(new ah.l0(1, oeVar2, neVar));
                    ofFloat.addListener(new ai.me(0, oeVar2, neVar));
                    ofFloat.setInterpolator(org.telegram.ui.Components.bs.f25031g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(neVar);
                    oeVar2.f1();
                    ofFloat.start();
                }
            }
        }
    }

    public final void A() {
        if (this.O == UserConfig.selectedAccount && this.f33166m1 != null) {
            return;
        }
        NotificationCenter.ObserversGroup observersGroup = this.f33166m1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f33166m1 = null;
        }
        int i10 = UserConfig.selectedAccount;
        this.O = i10;
        this.f33166m1 = NotificationCenter.getInstance(i10).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
    }

    public final void A0(android.net.Uri r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.A0(android.net.Uri):void");
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f33160i1 == null && SharedConfig.frameMetricsEnabled) {
                this.f33160i1 = zf.x.b(this, this.f33185w0);
            }
            zf.x xVar = this.f33160i1;
            if (xVar != null && !SharedConfig.frameMetricsEnabled) {
                xVar.c();
                this.f33160i1 = null;
            }
        }
    }

    public final void B0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final pf.c r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.B0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, pf.c, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void C(int i10) {
        K1 = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT >= 26 && i10 == 0) || this.f33186w1) {
            return;
        }
        Utilities.globalQueue.postRunnable(new e80(this, i10, 0), 2000L);
    }

    @Override
    public final boolean D() {
        ArrayList arrayList = this.U;
        if ((arrayList != null && arrayList.size() == 1) || this.R != null) {
            return true;
        }
        return false;
    }

    public final void D0(int i10) {
        this.f33191z0.setInternalNavigationBarColor(i10);
        org.telegram.ui.ActionBar.n3 P = P();
        if (P != null) {
            P.setNavigationBarColor(i10);
        }
    }

    public final void E0() {
        org.telegram.ui.ActionBar.y3 y3Var;
        ViewGroup view;
        int i10;
        if (this.f33191z0.indexOfChild(this.f33179t0) != -1) {
            y3Var = this.f33191z0;
            view = this.f33179t0;
        } else {
            y3Var = this.f33191z0;
            view = this.f33173q0.getView();
        }
        int indexOfChild = y3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f33191z0.removeViewAt(indexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            ba0 ba0Var = new ba0(this, this);
            this.f33179t0 = ba0Var;
            if (indexOfChild != -1) {
                this.f33191z0.addView(ba0Var, indexOfChild, w7.z5.c(-1.0f, -1));
            } else {
                this.f33191z0.addView(ba0Var, w7.z5.c(-1.0f, -1));
            }
            ig.p1 p1Var = new ig.p1(this, null, 5);
            this.f33183v0 = p1Var;
            p1Var.setOccupyStatusBar(false);
            this.f33183v0.V(org.telegram.ui.ActionBar.h6.s0());
            this.f33179t0.addView(this.f33183v0, w7.z5.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.f33173q0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f33173q0.getView());
            }
            this.f33179t0.addView(this.f33173q0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f33177s0 = actionBarLayout;
            actionBarLayout.N0 = true;
            actionBarLayout.setFragmentStack(this.f33153f0);
            this.f33177s0.setDelegate(this);
            this.f33179t0.addView(this.f33177s0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f33181u0 = frameLayout;
            ArrayList arrayList = this.f33151e0;
            int i11 = 8;
            if (arrayList.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            frameLayout.setVisibility(i10);
            this.f33181u0.setBackgroundColor(1056964608);
            this.f33179t0.addView(this.f33181u0);
            this.f33181u0.setOnTouchListener(new e0(this, 3));
            this.f33181u0.setOnClickListener(new ah.f(21));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f33175r0 = actionBarLayout2;
            actionBarLayout2.M0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f33175r0.setBackgroundView(this.f33181u0);
            this.f33175r0.setUseAlphaAnimations(true);
            this.f33175r0.setFragmentStack(arrayList);
            this.f33175r0.setDelegate(this);
            this.f33175r0.setDrawerLayoutContainer(this.f33191z0);
            ViewGroup view2 = this.f33175r0.getView();
            if (!arrayList.isEmpty()) {
                i11 = 0;
            }
            view2.setVisibility(i11);
            this.f33179t0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f33173q0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f33173q0.getView());
            }
            this.f33173q0.setFragmentStack(this.f33149d0);
            if (indexOfChild != -1) {
                this.f33191z0.addView(this.f33173q0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f33191z0.addView(this.f33173q0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        w7.d0.a(this, SharedConfig.isFloatingDebugActive, false);
    }

    public final void F() {
        int i10;
        if (AndroidUtilities.isTablet() && this.f33177s0 != null) {
            if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
                int i11 = 8;
                if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                    this.O0 = false;
                    List<org.telegram.ui.ActionBar.n2> fragmentStack = this.f33173q0.getFragmentStack();
                    if (fragmentStack.size() >= 2) {
                        while (1 < fragmentStack.size()) {
                            org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.get(1);
                            if (n2Var instanceof sn) {
                                ((sn) n2Var).Y4 = true;
                            }
                            n2Var.onPause();
                            n2Var.onFragmentDestroy();
                            n2Var.setParentLayout(null);
                            fragmentStack.remove(n2Var);
                            this.f33177s0.c(-1, n2Var);
                        }
                        org.telegram.ui.Components.ne0 ne0Var = this.A0;
                        if (ne0Var == null || ne0Var.f28744b.getVisibility() != 0) {
                            this.f33173q0.U(true, true);
                            this.f33177s0.U(true, true);
                        }
                    }
                    ViewGroup view = this.f33177s0.getView();
                    if (this.f33177s0.getFragmentStack().isEmpty()) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    ig.p1 p1Var = this.f33183v0;
                    if (this.f33177s0.getFragmentStack().isEmpty()) {
                        i11 = 0;
                    }
                    p1Var.setVisibility(i11);
                    return;
                }
                this.O0 = true;
                List<org.telegram.ui.ActionBar.n2> fragmentStack2 = this.f33177s0.getFragmentStack();
                if (!fragmentStack2.isEmpty()) {
                    while (fragmentStack2.size() > 0) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentStack2.get(0);
                        if (n2Var2 instanceof sn) {
                            ((sn) n2Var2).Y4 = true;
                        }
                        n2Var2.onPause();
                        n2Var2.onFragmentDestroy();
                        n2Var2.setParentLayout(null);
                        fragmentStack2.remove(n2Var2);
                        this.f33173q0.c(-1, n2Var2);
                    }
                    org.telegram.ui.Components.ne0 ne0Var2 = this.A0;
                    if (ne0Var2 == null || ne0Var2.f28744b.getVisibility() != 0) {
                        this.f33173q0.U(true, true);
                    }
                }
                this.f33177s0.getView().setVisibility(8);
                ig.p1 p1Var2 = this.f33183v0;
                if (this.f33173q0.getFragmentStack().isEmpty()) {
                    i11 = 0;
                }
                p1Var2.setVisibility(i11);
            }
        }
    }

    public final org.telegram.ui.ActionBar.b2 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.b2 o10 = alertDialog$Builder.o();
            o10.setCanceledOnTouchOutside(true);
            o10.setOnDismissListener(new ai.x3(11, this, o10));
            this.E0.add(o10);
            return o10;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void G(boolean z10) {
        H(z10, true, !this.W0);
    }

    public final void H(boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int x02;
        qn qnVar;
        boolean z13;
        ArrayList arrayList = this.f33149d0;
        boolean z14 = true;
        if (!arrayList.isEmpty()) {
            n2Var = (org.telegram.ui.ActionBar.n2) i2.d.h(1, arrayList);
        } else {
            n2Var = null;
        }
        char c10 = 2;
        if (n2Var != null && (n2Var.isRemovingFromStack() || n2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                n2Var = (org.telegram.ui.ActionBar.n2) i2.d.h(2, arrayList);
            } else {
                n2Var = null;
            }
        }
        if (n2Var != null) {
            n2Var.hasForceLightStatusBar();
        }
        int i10 = Build.VERSION.SDK_INT;
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
                            org.telegram.ui.ActionBar.j2 j2Var = (org.telegram.ui.ActionBar.j2) i2.d.h(1, n2Var.sheetsStack);
                            if (j2Var.isShown()) {
                                z13 = j2Var.isAttachedLightStatusBar();
                            }
                        }
                    }
                }
            } else {
                z13 = i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21265s8, true)) > 0.699999988079071d;
            }
            AndroidUtilities.setLightStatusBar(this, z13);
        }
        if (i10 >= 26 && z12 && (!z10 || n2Var == null || !n2Var.isInPreviewMode())) {
            if (n2Var != null && z10) {
                x02 = n2Var.getNavigationBarColor();
            } else {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20928a7, true);
            }
            if (n2Var instanceof sn) {
                sn snVar = (sn) n2Var;
                if (!snVar.Eb || (snVar.v.f44734s != 1 && ((qnVar = snVar.f41191ea) == null || !qnVar.G))) {
                    c10 = 1;
                }
            } else {
                c10 = 0;
            }
            if (P() != null && P().H > 0) {
                c10 = 0;
            }
            if (this.f33173q0.w() != null) {
                ry w9 = this.f33173q0.w();
                if (w9.sheetsStack != null) {
                    for (int i11 = 0; i11 < w9.sheetsStack.size(); i11++) {
                        org.telegram.ui.ActionBar.j2 j2Var2 = w9.sheetsStack.get(i11);
                        if (j2Var2.attachedToParent()) {
                            x02 = j2Var2.getNavigationBarColor(x02);
                            c10 = 0;
                        }
                    }
                }
            }
            Iterator it = gi.d3.W0.iterator();
            while (it.hasNext()) {
                x02 = ((gi.d3) it.next()).getNavigationBarColor(x02);
                c10 = 0;
            }
            D0(x02);
            if ((c10 != 0 || AndroidUtilities.computePerceivedBrightness(x02) < 0.721f) && c10 != 1) {
                z14 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ArrayList arrayList = this.f33151e0;
        if (!arrayList.isEmpty()) {
            n2Var = (org.telegram.ui.ActionBar.n2) i2.d.h(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f33153f0;
            if (!arrayList2.isEmpty()) {
                n2Var = (org.telegram.ui.ActionBar.n2) i2.d.h(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.f33149d0;
                if (!arrayList3.isEmpty()) {
                    n2Var = (org.telegram.ui.ActionBar.n2) i2.d.h(1, arrayList3);
                } else {
                    n2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.xc.a(n2Var)) {
            aVar.c(org.telegram.ui.Components.xc.a0(n2Var)).j();
        }
    }

    public final void I(boolean z10) {
        ChatObject.Call call;
        long j10;
        boolean z11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z12 = false;
        if (sharedInstance != null && (call = sharedInstance.groupCall) != null) {
            boolean z13 = this.f33165l0;
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
                j10 = UserConfig.getInstance(this.O).clientUserId;
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
            this.f33165l0 = z12;
            if (!z10 && z13 && !z12 && !z11 && s50.D3 == null) {
                N0(38);
                return;
            }
            return;
        }
        this.f33165l0 = false;
    }

    public final void I0() {
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
                    char c11 = 0;
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
                            c10 = c11;
                            if (localeInfo2.shortName.equals("en")) {
                                localeInfoArr[c10] = localeInfo2;
                            }
                            if (localeInfo2.shortName.replace("_", "-").equals(str3) || localeInfo2.shortName.equals(str) || localeInfo2.shortName.equals(str2)) {
                                localeInfoArr[1] = localeInfo2;
                            }
                            if (localeInfoArr[c10] != null && localeInfoArr[1] != null) {
                                break;
                            }
                            i10++;
                            c11 = c10;
                        } else {
                            c10 = c11;
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
                            public final LaunchActivity f40626b;

                            {
                                this.f40626b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f40626b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.K0 = hashMap2;
                                                        if (hashMap2 != null && launchActivity2.J0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr2;
                                                            launchActivity2.J0(localeInfoArr3[1], localeInfoArr3[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.J0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        Pattern pattern2 = LaunchActivity.C1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f40626b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (hashMap22 != null && launchActivity22.J0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.J0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.J0(localeInfoArr4[1], localeInfoArr4[0], str5);
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
                            public final LaunchActivity f40626b;

                            {
                                this.f40626b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f40626b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (hashMap22 != null && launchActivity22.J0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr2;
                                                            launchActivity22.J0(localeInfoArr32[1], localeInfoArr32[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.J0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        Pattern pattern2 = LaunchActivity.C1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f40626b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str3;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (hashMap22 != null && launchActivity22.J0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.J0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.J0(localeInfoArr4[1], localeInfoArr4[0], str5);
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

    public final void J() {
        ArrayList arrayList = this.f33149d0;
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
            ArrayList arrayList2 = this.f33151e0;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((org.telegram.ui.ActionBar.n2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f33153f0;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                ((org.telegram.ui.ActionBar.n2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void J0(org.telegram.messenger.LocaleController.LocaleInfo r18, org.telegram.messenger.LocaleController.LocaleInfo r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.J0(org.telegram.messenger.LocaleController$LocaleInfo, org.telegram.messenger.LocaleController$LocaleInfo, java.lang.String):void");
    }

    @Override
    public final boolean K(org.telegram.ui.ey r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.K(org.telegram.ui.ey):boolean");
    }

    public final void K0(boolean z10, boolean z11, int i10, int i11, vi viVar) {
        if (this.f33191z0 != null && !isFinishing()) {
            if (this.A0 == null) {
                this.A0 = new org.telegram.ui.Components.ne0(this);
            }
            SharedConfig.appLocked = true;
            int i12 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f33809s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                PhotoViewer.t1().G0(false, true);
            } else if (l4.I() && l4.x().V) {
                l4.x().o(false, true);
            }
            ei.vb.w();
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.A0.show();
            org.telegram.ui.Components.me0 me0Var = this.A0.f28744b;
            ArrayList arrayList = this.B0;
            arrayList.isEmpty();
            me0Var.l(z11, i10, i11, new b80(6, this, viVar));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                org.telegram.ui.Components.le0 le0Var = (org.telegram.ui.Components.le0) arrayList.get(i13);
                if (z10) {
                    int size = arrayList.size() - 1;
                }
                le0Var.l(z11, i10, i11, null);
            }
            SharedConfig.isWaitingForPasscodeEnter = true;
            v90 v90Var = new v90(this);
            this.A0.f28744b.setDelegate(v90Var);
            int size2 = arrayList.size();
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((org.telegram.ui.Components.le0) obj).setDelegate(v90Var);
            }
            try {
                NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void L0(int i10, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f7;
        float f10;
        if (this.C0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
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
            linearLayout.addView(imageView, w7.z5.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.h6.G6;
            f10 = 4.0f;
            org.telegram.messenger.g0.m(17.0f, org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, textView);
            textView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
            linearLayout.addView(textView, w7.z5.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f25070a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(51);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView2, w7.z5.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            scrollView.setPadding(AndroidUtilities.dp(24.0f), i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, w7.z5.n(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(LocaleController.getString(R.string.Decline).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            int i13 = org.telegram.ui.ActionBar.h6.f21374y6;
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.x0(null, i13, false)));
            f7 = 10.0f;
            textView3.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
            frameLayout.addView(textView3, w7.z5.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    c11 c11Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                            b2Var.R = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new a11(c11Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            b2Var.T = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (c11Var.f25072c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
                                b2Var2.R = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new a11(c11Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                b2Var2.T = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", c11Var.f25072c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            c11Var.a();
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
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, -11491093, -12346402, -12346402));
            textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(textView4, w7.z5.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    c11 c11Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                            b2Var.R = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new a11(c11Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            b2Var.T = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (c11Var.f25072c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
                                b2Var2.R = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new a11(c11Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                b2Var2.T = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", c11Var.f25072c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            c11Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d7, false));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.C0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f33191z0.addView(this.C0, w7.z5.c(-1.0f, -1));
            this.C0.setDelegate(new ca0(this));
        } else {
            f7 = 10.0f;
            f10 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i10).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f20329id.data.equals(tL_help_termsOfService.f20329id.data))) {
            UserConfig.getInstance(i10).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i10).saveConfig(false);
        }
        org.telegram.ui.Components.c11 c11Var = this.C0;
        if (c11Var.getVisibility() != 0) {
            c11Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false);
        int dp2 = AndroidUtilities.dp(f7);
        int dp3 = AndroidUtilities.dp(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i14 = 0; i14 < length; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == '-') {
                    int i16 = i14 + 2;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        org.telegram.ui.Components.cb cbVar = new org.telegram.ui.Components.cb(dp2, dp3);
                        spannableStringBuilder.replace(i15, i14 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(cbVar, i15, i16, 33);
                    }
                }
            }
        }
        c11Var.f25070a.setText(spannableStringBuilder);
        c11Var.f25072c = tL_help_termsOfService;
        c11Var.d = i10;
        this.C0.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    public final java.util.ArrayList M(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.M(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void M0(int i10, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        if (this.D0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i11 = org.telegram.ui.ActionBar.h6.f20986d6;
            frameLayout.f25544w = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.h6.x0(null, i11, false), 0});
            frameLayout.f25545x = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.h6.x0(null, i11, false), 0});
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            int i12 = (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight));
            ?? imageView = new ImageView(this);
            imageView.f(R.raw.qr_code_logo, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().K(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            frameLayout2.addView((View) imageView, w7.z5.d(-2, -2.0f, 17, 0.0f, i12, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.f0((Object) frameLayout, 3));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f25540f = scrollView;
            AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21265s8, false));
            scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, w7.z5.d(-1, -1.0f, 51, 27.0f, i12 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i13 = org.telegram.ui.ActionBar.h6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.UpdateTelegram));
            frameLayout3.addView(textView, w7.z5.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f25537a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(49);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            frameLayout3.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            ah.x xVar = new ah.x(this, 11);
            frameLayout.d = xVar;
            xVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            xVar.setBackgroundDrawable(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
            xVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(xVar, w7.z5.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            xVar.setOnClickListener(new org.telegram.ui.Components.ca(0, frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f25538b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            xVar.addView(textView3, w7.z5.e(-2, -2, 17));
            ah.x xVar2 = new ah.x((Object) frameLayout, this, 12);
            frameLayout.f25539c = xVar2;
            xVar2.setWillNotDraw(false);
            xVar2.setAlpha(0.0f);
            xVar2.setScaleX(0.1f);
            xVar2.setScaleY(0.1f);
            xVar2.setVisibility(4);
            org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(xVar2);
            frameLayout.e = yj0Var;
            yj0Var.d(null, true, false);
            yj0Var.f32663o = -1;
            xVar.addView(xVar2, w7.z5.e(36, 36, 17));
            this.D0 = frameLayout;
            this.f33191z0.addView((View) frameLayout, w7.z5.c(-1.0f, -1));
        }
        org.telegram.ui.Components.da daVar = this.D0;
        daVar.v = 0;
        daVar.f25541n = tL_help_appUpdate;
        daVar.f25543s = i10;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            daVar.f25542r = FileLoader.getAttachFileName(document);
        }
        if (daVar.getVisibility() != 0) {
            daVar.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false);
        daVar.f25537a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            TextView textView4 = daVar.f25538b;
            textView4.setText(LocaleController.getString(R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tL_help_appUpdate.document.size)));
        } else {
            daVar.f25538b.setText(LocaleController.getString(R.string.Update));
        }
        NotificationCenter.getInstance(daVar.f25543s).addObserver(daVar, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(daVar.f25543s).addObserver(daVar, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(daVar.f25543s).addObserver(daVar, NotificationCenter.fileLoadProgressChanged);
        if (z10 && ApplicationLoader.isStandaloneBuild()) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(daVar.f25543s).sendRequest(tL_help_getAppUpdate, new org.telegram.ui.Components.y1(daVar, 1));
        }
    }

    public final void N0(int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.f33149d0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.n2 n2Var = this.f33173q0.getFragmentStack().get(this.f33173q0.getFragmentStack().size() - 1);
            if (n2Var instanceof og0) {
                n2Var = ((og0) n2Var).X();
            }
            UndoView undoView = null;
            if (n2Var instanceof sn) {
                sn snVar = (sn) n2Var;
                if (chat != null && snVar.a() == (-chat.f20272id)) {
                    chat = null;
                }
                snVar.T7();
                undoView = snVar.y3;
            } else if (n2Var instanceof ey) {
                undoView = ((ey) n2Var).W3();
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

    public final org.telegram.ui.ActionBar.d5 O() {
        ActionBarLayout actionBarLayout = this.f33173q0;
        ArrayList arrayList = this.P;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.d5) i2.d.h(1, arrayList);
        }
        return actionBarLayout;
    }

    public final void O0(int i10) {
        P0(i10, new org.telegram.ui.Components.tg0(29));
    }

    public final org.telegram.ui.ActionBar.n3 P() {
        ActionBarLayout actionBarLayout = this.f33177s0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f33177s0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.f33173q0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.f33173q0.getBottomSheetTabs();
        }
        return null;
    }

    public final void P0(int i10, GenericProvider genericProvider) {
        if (i10 != UserConfig.selectedAccount && UserConfig.isValidAccount(i10)) {
            this.l1 = true;
            ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
            UserConfig.selectedAccount = i10;
            UserConfig.getInstance(0).saveConfig(false);
            A();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAccountChanged, Integer.valueOf(i10));
            if (AndroidUtilities.isTablet()) {
                this.f33175r0.X();
                this.f33177s0.X();
                if (!this.O0) {
                    if (this.f33177s0.getFragmentStack().isEmpty()) {
                        this.f33183v0.setVisibility(0);
                    }
                    this.f33177s0.getView().setVisibility(8);
                }
                this.f33175r0.getView().setVisibility(8);
            }
            this.f33173q0.X();
            this.f33173q0.c(-3, (og0) genericProvider.provide(null));
            this.f33173q0.U(true, true);
            if (AndroidUtilities.isTablet()) {
                this.f33175r0.U(true, true);
                this.f33177s0.U(true, true);
            }
            if (!ApplicationLoader.mainInterfacePaused) {
                ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
            }
            if (UserConfig.getInstance(i10).unacceptedTermsOfService != null) {
                L0(i10, UserConfig.getInstance(i10).unacceptedTermsOfService);
            }
            Q0();
            this.l1 = false;
        }
    }

    public final org.telegram.ui.ActionBar.n2 Q() {
        if (eg0.j1(this.O, false).getInt("currentViewNum", 0) != 0) {
            return new eg0();
        }
        return new l70();
    }

    public final void Q0() {
        int i10;
        String str;
        if (this.f33173q0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.O).getConnectionState();
            this.f33147c0 = connectionState;
            l80 l80Var = null;
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
                i10 = 0;
                str = null;
            }
            if (connectionState == 1 || connectionState == 4) {
                l80Var = new l80(this, 5);
            }
            ActionBarLayout actionBarLayout = this.f33173q0;
            actionBarLayout.G0 = str;
            actionBarLayout.H0 = i10;
            actionBarLayout.I0 = l80Var;
            for (int i11 = 0; i11 < actionBarLayout.O0.size(); i11++) {
                ((org.telegram.ui.ActionBar.n2) actionBarLayout.O0.get(i11)).setTitleOverlayText(actionBarLayout.G0, actionBarLayout.H0, l80Var);
            }
        }
    }

    public final int S() {
        return this.f33149d0.size();
    }

    public final qh.e T() {
        return this.f33156g1;
    }

    public final boolean X(android.content.Intent r126, boolean r127, boolean r128, boolean r129, pf.c r130, boolean r131, boolean r132) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.X(android.content.Intent, boolean, boolean, boolean, pf.c, boolean, boolean):boolean");
    }

    public final void Y() {
        ActionMode actionMode = this.f33163k0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Z(int i10, TLRPC.User user, String str, pf.c cVar) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = messagesController.getInputUser(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new Object(), new org.telegram.messenger.fh(this, cVar, messagesController, i10, user));
    }

    @Override
    public final void a(float f7) {
        if (l4.I() && l4.x().V) {
            l4 x10 = l4.x();
            x10.S();
            l4.g0(x10);
            if (x10.f38711f0 != null) {
                x10.f38725u0[0].f39646b.f1();
                x10.f38725u0[1].f39646b.f1();
                x10.f38711f0.invalidate();
                x10.f38721q0.invalidate();
                if (f7 == 1.0f) {
                    x10.f38725u0[0].f39647c.l();
                    x10.f38725u0[1].f39647c.l();
                }
            }
        }
        if (PhotoViewer.D1()) {
            PhotoViewer.t1().u3();
        }
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.f33175r0) {
            this.f33177s0.U(z10, z10);
            this.f33173q0.U(z10, z10);
        }
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.b0():void");
    }

    public final boolean d0(boolean z10) {
        boolean z11;
        ng.i iVar = w7.d0.f48610a;
        if (iVar != null) {
            if (iVar.f17469s) {
                if (z10) {
                    iVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.ne0 ne0Var = this.A0;
        if (ne0Var != null && ne0Var.f28744b.getVisibility() == 0) {
            if (z10) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.w3 w3Var = this.f33189y0;
            if (w3Var != null && (z11 = w3Var.U)) {
                if (z10 && z11) {
                    w3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.fo0.H;
                if (b2Var != null) {
                    if (z10) {
                        b2Var.dismiss();
                        org.telegram.ui.Components.fo0.H = null;
                        return false;
                    }
                } else if (gt.f37289g0 != null && gt.q().E) {
                    if (z10) {
                        gt.q().o();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f33809s) {
                    if (z10) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                    if (z10) {
                        PhotoViewer.t1().G0(true, false);
                        return false;
                    }
                } else if (!l4.I() || !l4.x().V) {
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

    @Override
    public final void didReceivedNotification(int r19, int r20, java.lang.Object... r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void e0() {
        a6 a6Var = this.Z0;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.Z0 = null;
        }
        if (!this.Q) {
            this.Q = true;
            NotificationCenter.ObserversGroup observersGroup = this.f33166m1;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.f33166m1 = null;
            }
            NotificationCenter.ObserversGroup observersGroup2 = this.f33168n1;
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                this.f33168n1 = null;
            }
            o90 o90Var = this.f33172p1;
            if (o90Var != null) {
                LiteMode.removeOnPowerSaverAppliedListener(o90Var);
            }
        }
    }

    public final void f0(Intent intent, pf.c cVar) {
        super.onNewIntent(intent);
        X(intent, true, false, false, cVar, true, false);
    }

    public final void g0() {
        if (this.Z0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodePause");
            }
            AndroidUtilities.cancelRunOnUIThread(this.Z0);
            this.Z0 = null;
        }
        if (SharedConfig.passcodeHash.length() != 0) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            a6 a6Var = new a6(this, 8);
            this.Z0 = a6Var;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(a6Var, 1000L);
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

    @Override
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
        boolean z10;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (AndroidUtilities.isTablet()) {
            boolean z11 = n2Var instanceof ey;
            if (!z11 && !(n2Var instanceof og0)) {
                if ((n2Var instanceof sn) && !((sn) n2Var).c()) {
                    boolean z12 = this.O0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f33177s0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f33183v0.setVisibility(8);
                        this.f33177s0.X();
                        this.f33177s0.c(-1, n2Var);
                        if (!this.f33175r0.getFragmentStack().isEmpty()) {
                            while (this.f33175r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f33175r0;
                                actionBarLayout4.a0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f33175r0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.f33173q0)) {
                        actionBarLayout2.c(-1, n2Var);
                        if (!this.f33175r0.getFragmentStack().isEmpty()) {
                            while (this.f33175r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f33175r0;
                                actionBarLayout5.a0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f33175r0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f33175r0;
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
                    if ((n2Var instanceof eg0) && i10 == -1) {
                        this.f33183v0.setVisibility(0);
                        this.f33181u0.setBackgroundColor(0);
                    } else {
                        this.f33181u0.setBackgroundColor(2130706432);
                    }
                    this.f33175r0.c(-1, n2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.f33173q0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z11 && !((ey) n2Var).f4()) {
                    z10 = false;
                }
                if (z10) {
                    this.f33173q0.X();
                    this.f33173q0.c(-1, n2Var);
                    this.f33175r0.X();
                    this.f33175r0.getView().setVisibility(8);
                    if (!this.O0 && this.f33177s0.getFragmentStack().isEmpty()) {
                        this.f33183v0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.Z0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodeResume");
            }
            AndroidUtilities.cancelRunOnUIThread(this.Z0);
            this.Z0 = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            K0(true, false, -1, -1, null);
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
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

    @Override
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f33809s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(true, false);
            return true;
        } else if (!l4.I() || !l4.x().V) {
            return false;
        } else {
            l4.x().o(true, false);
            return true;
        }
    }

    public final void j0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.j0(boolean):void");
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f33173q0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.l1) {
                e0();
                finish();
                return false;
            } else if (actionBarLayout == this.f33177s0) {
                if (!this.O0) {
                    this.f33183v0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f33175r0 && this.f33173q0.getFragmentStack().isEmpty() && this.f33175r0.getFragmentStack().size() == 1) {
                e0();
                finish();
                return false;
            }
        } else if (actionBarLayout.getFragmentStack().size() <= 1) {
            e0();
            finish();
            return false;
        }
        return true;
    }

    public final void k0(TL_account.Password password) {
        String str;
        eg0 eg0Var = new eg0();
        l80 l80Var = new l80(this, 0);
        eg0Var.F = 3;
        eg0Var.f36489a = 12;
        eg0Var.f36495d0 = l80Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f28049a |= 256;
                obj.f28050b = indexOf;
                int i10 = lastIndexOf + 1;
                obj.f28051c = i10;
                valueOf.setSpan(new org.telegram.ui.Components.m11(obj, 0), indexOf, i10, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            alertDialog$Builder.f20601a.R = valueOf;
            alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.EmailLoginChangeMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChangeEmail), new zu(12, this, eg0Var));
            i2.d.r(R.string.Cancel, alertDialog$Builder, null);
            return;
        }
        t0(eg0Var);
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.b5 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.b5):boolean");
    }

    public final void l0(final long j10, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i10, final int i11) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            t0(te1.F0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(this.O).getInputChannel(-j10);
        tL_channels_getMessages.f20310id.add(num);
        ConnectionsManager.getInstance(this.O).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new u80(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i10, i11));
            }
        });
    }

    public final void m0(int i10, long j10, TLRPC.TL_error tL_error) {
        sn snVar = new sn(zf.d0.b(j10, "user_id"));
        t0(snVar);
        AndroidUtilities.runOnUIThread(new lq(tL_error, snVar, MessagesController.getInstance(i10).getUser(Long.valueOf(j10)), 13), 300L);
    }

    public final void n0(int i10, String str, String str2, pf.c cVar) {
        if (cVar != null) {
            cVar.d();
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_importContactToken, new ai.sb(this, cVar, messagesController, i10, str2, 11));
    }

    public final void o0(int i10, String str, String str2, pf.c cVar) {
        if (cVar != null) {
            cVar.d();
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getUserNameResolver().resolve(str, null, new ai.c5(this, messagesController, cVar, i10, str2, 1));
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f33163k0 == actionMode) {
            this.f33163k0 = null;
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f33173q0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f20588y;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.f20585w0 = false;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f33177s0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f20588y;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.f20585w0 = false;
                ActionBarLayout actionBarLayout3 = this.f33175r0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f20588y;
                if (kVar3 != null) {
                    kVar3.setVisibility(0);
                }
                actionBarLayout3.f20585w0 = false;
            }
        }
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.f33163k0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.f33173q0.s(menu) && AndroidUtilities.isTablet() && !this.f33177s0.s(menu)) {
                this.f33175r0.s(menu);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f33173q0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f20588y;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.f20585w0 = true;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f33177s0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f20588y;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.f20585w0 = true;
                ActionBarLayout actionBarLayout3 = this.f33175r0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f20588y;
                if (kVar3 != null) {
                    kVar3.setVisibility(8);
                }
                actionBarLayout3.f20585w0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        ci.p4 currentPeerView;
        org.telegram.ui.Components.j91 j91Var;
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
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            ApplicationLoader.canDrawOverlays = canDrawOverlays;
            if (canDrawOverlays) {
                s50 s50Var = s50.D3;
                if (s50Var != null) {
                    s50Var.dismissInternal();
                }
                AndroidUtilities.runOnUIThread(new l80(this, 4), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i10, i11, intent);
        String str = null;
        if (i10 >= 22336 && i10 <= 22399) {
            org.telegram.ui.Wallet.w0 w0Var = w7.h6.f48702b;
            if (w0Var != null && w0Var.e == this && w0Var.f35028f && w0Var.f35029g == i10) {
                if (i11 != -1) {
                    str = "AUTH_CANCELED";
                }
                w0Var.c(str);
            }
        } else if (i10 == 520) {
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
            ig.l0 l0Var = this.f33174q1;
            if (l0Var != null) {
                if (i11 == -1) {
                    z10 = true;
                }
                l0Var.run(Boolean.valueOf(z10));
                this.f33174q1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f24382n;
            if (themeEditorView != null && (j91Var = themeEditorView.f24390k) != null) {
                j91Var.a(i10, i11, intent);
            }
            ActionBarLayout actionBarLayout = this.f33173q0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.n2 n2Var = this.f33173q0.getFragmentStack().get(this.f33173q0.getFragmentStack().size() - 1);
                n2Var.onActivityResultFragment(i10, i11, intent);
                if (n2Var.getLastStoryViewer() != null && (currentPeerView = n2Var.getLastStoryViewer().f6238n0.getCurrentPeerView()) != null && i11 == -1) {
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
                                ci.a3 a3Var = currentPeerView.I2;
                                if (a3Var != null) {
                                    a3Var.dismiss();
                                }
                                currentPeerView.k0(true);
                            }
                        }
                    } else {
                        currentPeerView.t0();
                        ci.a3 a3Var2 = currentPeerView.I2;
                        if (a3Var2 != null) {
                            a3Var2.f30586j0.g0(i10, intent, null);
                        }
                    }
                }
            }
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f33177s0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f33177s0.getFragmentStack().get(this.f33177s0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f33175r0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f33175r0.getFragmentStack().get(this.f33175r0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onActivityResultReceived, Integer.valueOf(i10), Integer.valueOf(i11), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (d0(true)) {
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f33175r0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f33175r0.G();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f33177s0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f33177s0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.f33177s0.getFragmentStack().get(this.f33177s0.getFragmentStack().size() - 1);
                    if (n2Var.onBackPressed(true)) {
                        n2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.f33173q0.G();
                return;
            }
            this.f33173q0.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        this.f33180t1.a();
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        this.f33167n0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        AndroidUtilities.resetTabletFlag();
        b0();
        F();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            int i10 = pipRoundVideoView.f24263x.getInt("sidex", 1);
            int i11 = pipRoundVideoView.f24263x.getInt("sidey", 0);
            float f7 = pipRoundVideoView.f24263x.getFloat("px", 0.0f);
            float f10 = pipRoundVideoView.f24263x.getFloat("py", 0.0f);
            pipRoundVideoView.v.x = PipRoundVideoView.b(f7, i10, pipRoundVideoView.h, true);
            pipRoundVideoView.v.y = PipRoundVideoView.b(f10, i11, pipRoundVideoView.f24259n, false);
            pipRoundVideoView.f24262w.updateViewLayout(pipRoundVideoView.f24255a, pipRoundVideoView.v);
        }
        org.telegram.ui.Components.cv cvVar = org.telegram.ui.Components.cv.S;
        if (cvVar != null) {
            cvVar.onConfigurationChanged(configuration);
        }
        ug.m mVar = ug.m.e;
        if (mVar != null) {
            mVar.onConfigurationChanged(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        ThemeEditorView themeEditorView = ThemeEditorView.f24382n;
        if (themeEditorView != null) {
            int i12 = themeEditorView.f24389j.getInt("sidex", 1);
            int i13 = themeEditorView.f24389j.getInt("sidey", 0);
            float f11 = themeEditorView.f24389j.getFloat("px", 0.0f);
            float f12 = themeEditorView.f24389j.getFloat("py", 0.0f);
            themeEditorView.f24387g.x = ThemeEditorView.b(f11, i12, themeEditorView.e, true);
            themeEditorView.f24387g.y = ThemeEditorView.b(f12, i13, themeEditorView.f24386f, false);
            try {
                if (themeEditorView.f24383a.getParent() != null) {
                    themeEditorView.h.updateViewLayout(themeEditorView.f24383a, themeEditorView.f24387g);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (org.telegram.ui.ActionBar.h6.f21182o == 3) {
            org.telegram.ui.ActionBar.h6.E(false);
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
        D1 = true;
        E1++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        H1 = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.O = UserConfig.selectedAccount;
        registerReceiver(this.f33154f1, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
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
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21265s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        getWindow().setFormat(-1);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new org.telegram.ui.Components.tg0(28));
        this.f33152e1 = flagSecureReason;
        flagSecureReason.attach();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            AndroidUtilities.isInMultiwindow = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.h6.O();
        org.telegram.ui.ActionBar.h6.S(this);
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        this.f33173q0 = new ActionBarLayout(this, true);
        m0 m0Var = new m0(this, this, 10);
        this.f33185w0 = m0Var;
        m0Var.setClipToPadding(false);
        this.f33185w0.setClipChildren(false);
        setContentView(this.f33185w0);
        this.f33156g1 = new qh.e(this.f33185w0);
        ja0 ja0Var = new ja0(this);
        com.google.firebase.messaging.l lVar = this.m0;
        ((rf.b) lVar.f7647b).f45241a.add(ja0Var);
        ((ViewGroup) getWindow().getDecorView()).addView(lVar.v());
        lVar.v().bringToFront();
        ImageView imageView = new ImageView(this);
        this.f33169o0 = imageView;
        imageView.setVisibility(8);
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this);
        this.f33191z0 = y3Var;
        y3Var.setActionBarLayout(this.f33173q0);
        this.f33191z0.addOnLayoutChangeListener(new Object());
        this.f33191z0.setClipChildren(false);
        this.f33191z0.setClipToPadding(false);
        this.f33185w0.addView(this.f33191z0, w7.z5.c(-1.0f, -1));
        ig.k kVar = new ig.k(this, 4);
        this.f33171p0 = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f33185w0.addView(this.f33171p0, w7.z5.c(48.0f, 48));
        this.f33171p0.setVisibility(8);
        m0 m0Var2 = this.f33185w0;
        org.telegram.ui.ActionBar.w3 w3Var = new org.telegram.ui.ActionBar.w3(this);
        this.f33189y0 = w3Var;
        m0Var2.addView(w3Var);
        m0 m0Var3 = this.f33185w0;
        ?? z00Var = new org.telegram.ui.Components.z00(this);
        z00Var.setVisibility(8);
        this.f33187x0 = z00Var;
        m0Var3.addView(z00Var);
        E0();
        this.f33191z0.setParentActionBarLayout(this.f33173q0);
        this.f33173q0.setDrawerLayoutContainer(this.f33191z0);
        this.f33173q0.setFragmentStack(this.f33149d0);
        this.f33173q0.setFragmentStackChangedListener(new l80(this, 2));
        this.f33173q0.setDelegate(this);
        org.telegram.ui.ActionBar.h6.k1(true);
        A();
        Q0();
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.closeOtherAppActivities;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i11, this);
        this.f33147c0 = ConnectionsManager.getInstance(this.O).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.f33168n1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f33168n1 = null;
        }
        this.f33168n1 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i11).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        o90 o90Var = new o90(this, 0);
        this.f33172p1 = o90Var;
        LiteMode.addOnPowerSaverAppliedListener(o90Var);
        if (this.f33173q0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f33175r0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!UserConfig.getInstance(this.O).isClientActivated()) {
                this.f33173q0.c(-1, Q());
            } else {
                this.f33173q0.c(-1, new og0());
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
                                    this.f33173q0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.f33173q0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    sn snVar = new sn(bundle2);
                                    if (this.f33173q0.c(-1, snVar)) {
                                        snVar.V7 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    u60 u60Var = new u60(bundle2);
                                    if (this.f33173q0.c(-1, u60Var)) {
                                        u60Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    od odVar = new od(bundle2);
                                    if (this.f33173q0.c(-1, odVar)) {
                                        odVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", UserConfig.getInstance(this.O).clientUserId);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.f33173q0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.f33173q0.c(-1, new z71(null));
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
                p90 p90Var = new p90(rootView, 0);
                this.f33155g0 = p90Var;
                viewTreeObserver.addOnGlobalLayoutListener(p90Var);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i12 = Build.VERSION.SDK_INT;
        FingerprintController.checkKeyReady();
        if (i12 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000 && SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
            Pattern pattern = org.telegram.ui.Components.f5.f26080a;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String string2 = LocaleController.getString(R.string.AllowBackgroundActivity);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
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
            alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new org.telegram.ui.Components.h1(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            b2Var.setOnDismissListener(new ei.e1(3));
            b2Var.show();
            SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
        }
        if (i12 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new ma0(this));
        }
        org.telegram.ui.Components.qc.a(this.f33185w0, new ei.o8(10));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        t21.V(false);
        if (i12 >= 34) {
            if (this.f33162j1 == null) {
                this.f33162j1 = new na0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f33162j1);
        } else if (i12 >= 33) {
            if (this.f33164k1 == null) {
                this.f33164k1 = new oa0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f33164k1);
        }
        B();
    }

    @Override
    public final void onDestroy() {
        zf.x xVar;
        m0 m0Var;
        org.telegram.ui.Wallet.w0 w0Var = w7.h6.f48702b;
        if (w0Var != null && w0Var.e == this) {
            w0Var.c("AUTH_CANCELED");
            w7.h6.f48702b.e();
        }
        D1 = false;
        E1--;
        unregisterReceiver(this.f33154f1);
        if (E1 == 0) {
            if (PhotoViewer.f33227b9 != null) {
                PhotoViewer.f33227b9.Q0();
            }
            if (PhotoViewer.D1()) {
                PhotoViewer.t1().Q0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f7 = SecretMediaViewer.f();
                Runnable runnable = f7.f33803p1;
                if (runnable != null) {
                    runnable.run();
                    f7.f33803p1 = null;
                }
                pa0 pa0Var = f7.l1;
                if (pa0Var != null) {
                    pa0Var.destroy();
                    f7.l1 = null;
                }
                NotificationCenter.getInstance(f7.f33769a).removeObserver(f7, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f7.f33769a).removeObserver(f7, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f7.f33769a).removeObserver(f7, NotificationCenter.didCreatedNewDeleteTask);
                f7.f33809s = false;
                f7.N = null;
                ImageReceiver.BitmapHolder bitmapHolder = f7.f33789i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f7.f33789i0 = null;
                }
                f7.i();
                if (f7.f33772b != null && (m0Var = f7.d) != null) {
                    try {
                        if (m0Var.getParent() != null) {
                            ((WindowManager) f7.f33772b.getSystemService("window")).removeViewImmediate(f7.d);
                        }
                        f7.d = null;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                SecretMediaViewer.f33768x1 = null;
            }
            if (l4.I()) {
                l4.x().t();
            }
            if (gt.f37289g0 != null) {
                gt q6 = gt.q();
                q6.E = false;
                q6.f37303l = null;
                q6.W = null;
                q6.Y = null;
                q6.f37291a0 = null;
                if (q6.f37313w != null && q6.f37315y != null) {
                    Bitmap bitmap = q6.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        q6.v = null;
                    }
                    q6.M = 0.0f;
                    q6.K = false;
                    try {
                        if (q6.f37315y.getParent() != null) {
                            ((WindowManager) q6.f37313w.getSystemService("window")).removeViewImmediate(q6.f37315y);
                        }
                        q6.f37315y = null;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    gt.f37289g0 = null;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
                }
            }
            s50 s50Var = s50.D3;
            if (s50Var != null) {
                s50Var.dismissInternal();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i10 = org.telegram.ui.ActionBar.h6.f20921a;
            org.telegram.ui.Components.cv cvVar = org.telegram.ui.Components.cv.S;
            if (cvVar != null) {
                cvVar.H();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f24382n;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            ng.i iVar = w7.d0.f48610a;
            if (iVar != null) {
                iVar.e.edit().putFloat("x", (float) iVar.f17465c.f17558u.f17564i).putFloat("y", (float) iVar.d.f17558u.f17564i).commit();
            }
            w7.d0.f48610a = null;
            SparseArray sparseArray = org.telegram.ui.Components.r5.f29829q;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.f33178s1, false);
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
            if (this.f33155g0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f33155g0);
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (this.f33162j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f33162j1);
            }
        } else if (i12 >= 33 && this.f33162j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f33164k1);
        }
        org.telegram.ui.Components.qc.h(this.f33185w0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        e0();
        FlagSecureReason flagSecureReason = this.f33152e1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i12 >= 24 && (xVar = this.f33160i1) != null) {
            xVar.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 82 && !SharedConfig.isWaitingForPasscodeEnter) {
            if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (l4.I() && l4.x().V) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f33175r0.getView().getVisibility() == 0 && !this.f33175r0.getFragmentStack().isEmpty()) {
                    this.f33175r0.getView().onKeyUp(i10, keyEvent);
                } else if (this.f33177s0.getView().getVisibility() == 0 && !this.f33177s0.getFragmentStack().isEmpty()) {
                    this.f33177s0.getView().onKeyUp(i10, keyEvent);
                } else {
                    this.f33173q0.getView().onKeyUp(i10, keyEvent);
                }
            } else {
                this.f33173q0.getView().onKeyUp(i10, keyEvent);
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.f33173q0;
        if (actionBarLayout != null) {
            actionBarLayout.J();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f33177s0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.J();
                }
                ActionBarLayout actionBarLayout3 = this.f33175r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.J();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z10) {
        AndroidUtilities.isInMultiwindow = z10;
        this.f33180t1.a();
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
        F1 = false;
        rf.b bVar = this.f33167n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (AndroidUtilities.isInPictureInPictureMode(bVar.d) && bVar.e() && Build.VERSION.SDK_INT >= 31) {
            bVar.b();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        Utilities.stageQueue.postRunnable(new gi.l2(this.O, 12));
        g0();
        this.f33173q0.L();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.f33177s0;
            if (actionBarLayout != null) {
                actionBarLayout.L();
            }
            ActionBarLayout actionBarLayout2 = this.f33175r0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.L();
            }
        }
        org.telegram.ui.Components.ne0 ne0Var = this.A0;
        if (ne0Var != null) {
            ne0Var.f28744b.j();
        }
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.le0) obj).j();
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            z10 = applicationLoader.onPause();
        } else {
            z10 = false;
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(!z10, false);
        if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            if (t12.f33312j2 != null) {
                t12.G0(false, false);
            } else {
                org.telegram.ui.Components.a81 a81Var = t12.F2;
                if (a81Var != null && t12.Z2) {
                    a81Var.N(AndroidUtilities.isInPictureInPictureMode(t12.f33445y));
                }
            }
        }
        ei.vb vbVar = ei.vb.F2;
        if (vbVar != null) {
            vbVar.u(false);
            ei.lb lbVar = vbVar.f9957c1;
            if (lbVar != null) {
                lbVar.f9400f.r();
            }
            ei.jb jbVar = vbVar.X0;
            if (jbVar != null) {
                jbVar.x(0, true);
            }
        }
        jh1 jh1Var = jh1.f38171n1;
        if (jh1Var != null) {
            boolean isInteractive = ((PowerManager) jh1Var.f38175b.getSystemService("power")).isInteractive();
            int a2 = uf.b.a(jh1Var.f38175b);
            if (a2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (jh1Var.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a2 == 2) {
                int measuredHeight = jh1.f38171n1.f38210u0.getMeasuredHeight();
                jh1 jh1Var2 = jh1.f38171n1;
                org.telegram.ui.Components.voip.k2.l(jh1Var2.f38175b, jh1Var2.f38172a, jh1Var2.f38210u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = jh1.f38171n1.f38206r0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.k2.X = windowInsets.getSystemWindowInsetTop();
                    jh1.f38171n1.f38206r0.getSystemWindowInsetBottom();
                }
            }
            if (jh1Var.f38201n0 && ((!z11 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.k2.k() != null) {
                org.telegram.ui.Components.voip.k2 k10 = org.telegram.ui.Components.voip.k2.k();
                if (k10.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (k10.G) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = wh.f.f49035n;
        if (hashMap != null) {
            for (wh.f fVar : hashMap.values()) {
                wh.e eVar = fVar.f49039f;
                if (eVar != null) {
                    eVar.f49026b = true;
                }
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        rf.b bVar = this.f33167n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (bVar.f45244f) {
            if (z10) {
                bVar.d(1.0f);
                bVar.f45247j.a();
                ArrayList arrayList = bVar.f45242b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((sf.b) obj).getClass();
                }
                if (bVar.f45251n) {
                    bVar.f45251n = false;
                    bVar.f45249l.removeFrameCallback(bVar.f45250m);
                }
                ArrayList arrayList2 = bVar.f45241a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((sf.c) obj2).f();
                }
            } else if (bVar.e) {
                bVar.c(false);
            } else {
                bVar.a(true);
            }
        }
        if (!z10 && !this.f33176r1) {
            if (org.telegram.ui.Components.voip.h1.f31480d0.V) {
                org.telegram.ui.Components.voip.h1.j();
            }
            if (ci.o1.Z.S) {
                ci.o1.j();
            }
            if (org.telegram.ui.Components.zg0.f32905p0.P) {
                org.telegram.ui.Components.zg0.j(false);
            }
            s50.u1(this, null, false, true);
            if (PhotoViewer.f33227b9 != null) {
                PhotoViewer.f33227b9.Q0();
            }
            if (PhotoViewer.D1()) {
                PhotoViewer.t1().G0(false, false);
            }
        }
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        rf.b bVar = this.f33167n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        bVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.f33167n0.g(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        ah.g gVar;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (u(i10, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null && applicationLoader.checkRequestPermissionResult(i10, strArr, iArr)) {
                return;
            }
            if (this.f33173q0.getFragmentStack().size() != 0) {
                this.f33173q0.getFragmentStack().get(this.f33173q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f33177s0.getFragmentStack().size() != 0) {
                    this.f33177s0.getFragmentStack().get(this.f33177s0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
                if (this.f33175r0.getFragmentStack().size() != 0) {
                    this.f33175r0.getFragmentStack().get(this.f33175r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
            }
            jh1.p(i10, iArr);
            ei.vb vbVar = ei.vb.F2;
            if (vbVar != null) {
                ci.b bVar = vbVar.f9948a;
                Activity activity = vbVar.f9951b;
                if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 111) {
                    vbVar.f10008s2 = !z10;
                    if (z10 && vbVar.f9966f0 == 0) {
                        vbVar.A0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            vbVar.q();
                        } else {
                            CameraController.getInstance().initCamera(new ei.t9(vbVar, 0));
                        }
                    }
                } else if (i10 == 114) {
                    if (z10) {
                        MediaController.loadGalleryPhotosAlbums(0);
                        vbVar.e(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint));
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                        b2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ei.ca(vbVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        b2Var.show();
                    }
                } else if (i10 == 112) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                        SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
                        b2Var2.T = replaceTags2;
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new ei.ca(vbVar, 3));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        b2Var2.show();
                    }
                } else if (i10 == 115) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                        SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory));
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20601a;
                        b2Var3.T = replaceTags3;
                        alertDialog$Builder3.k(LocaleController.getString(R.string.PermissionOpenSettings), new ei.ca(vbVar, 5));
                        alertDialog$Builder3.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        b2Var3.show();
                    }
                    if (z10 && (gVar = vbVar.f10029y2) != null) {
                        gVar.run();
                    }
                    vbVar.f10029y2 = null;
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i10), strArr, iArr);
            SparseIntArray sparseIntArray = this.f33146b1;
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
        qg.c1 c1Var;
        super.onResume();
        F1 = true;
        rf.b bVar = this.f33167n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (bVar.f45244f) {
            bVar.a(false);
        }
        org.telegram.ui.Components.uu uuVar = G1;
        if (uuVar != null) {
            uuVar.run();
            G1 = null;
        }
        if (org.telegram.ui.ActionBar.h6.f21182o == 3) {
            org.telegram.ui.ActionBar.h6.E(false);
        }
        I(true);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.f33173q0.getView();
        this.f33178s1 = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.O).sortDialogs(null);
        I0();
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.sc(26));
        C(0);
        MediaController.checkGallery();
        h0();
        org.telegram.ui.Components.ne0 ne0Var = this.A0;
        if (ne0Var != null && ne0Var.f28744b.getVisibility() == 0) {
            this.f33173q0.n();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f33177s0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f33175r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.A0.f28744b.k();
            ArrayList arrayList = this.B0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.ui.Components.le0) obj).k();
            }
        } else {
            this.f33173q0.M();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.f33177s0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
                ActionBarLayout actionBarLayout4 = this.f33175r0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.M();
                }
            }
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
        Q0();
        if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            du0 du0Var = t12.f33266e0;
            if (du0Var != null) {
                du0Var.invalidate();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(t12, 0, 24), 100L);
            }
            org.telegram.ui.Components.a81 a81Var = t12.F2;
            if (a81Var != null) {
                a81Var.K(a81Var.n() + 1);
                if (t12.Z2) {
                    t12.F2.N(true);
                }
            }
            it0 it0Var = t12.L1;
            if (it0Var != null && (c1Var = it0Var.W0.d) != null) {
                c1Var.postRunnable(c1Var.f44485w);
            }
        }
        ei.vb vbVar = ei.vb.F2;
        if (vbVar != null) {
            vbVar.O();
        }
        if (PipRoundVideoView.F != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            MediaController.getInstance().seekToProgress(playingMessageObject, playingMessageObject.audioProgress);
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).unacceptedTermsOfService != null) {
            int i11 = UserConfig.selectedAccount;
            L0(i11, UserConfig.getInstance(i11).unacceptedTermsOfService);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = SharedConfig.pendingAppUpdate;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(UserConfig.selectedAccount, tL_help_appUpdate, true);
            }
        }
        z(false);
        ApplicationLoader.canDrawOverlays = Settings.canDrawOverlays(this);
        jh1 jh1Var = jh1.f38171n1;
        if (jh1Var != null) {
            if (org.telegram.ui.Components.voip.k2.k() != null) {
                org.telegram.ui.Components.voip.k2.i();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                jh1Var.G();
            } else if (VoIPService.getSharedState() == null) {
                jh1Var.f38210u0.b();
            }
            jh1Var.J0 = ((KeyguardManager) jh1Var.f38175b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.k2.k() != null) {
                org.telegram.ui.Components.voip.k2.k().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        b0();
        HashMap hashMap = wh.f.f49035n;
        if (hashMap != null) {
            for (wh.f fVar : hashMap.values()) {
                wh.e eVar = fVar.f49039f;
                if (eVar != null) {
                    eVar.f49026b = false;
                }
            }
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onResume();
        }
        b0 b0Var = J1;
        if (b0Var != null) {
            b0Var.run();
            J1 = null;
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
        this.f33176r1 = true;
        this.f33167n0.h();
        WeakReference weakReference = pf.d.e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            pf.d.w(activity);
        }
        if (pf.d.f44288b == null) {
            pf.d.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(pf.d.d)) {
                    String a2 = w7.z8.a(this);
                    pf.d.d = a2;
                    if (a2 == null) {
                    }
                }
                Object obj = new Object();
                a9.d dVar = new a9.d();
                dVar.f323b = new WeakReference(obj);
                pf.d.f44289c = dVar;
                String str = pf.d.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, dVar, 33)) {
                    pf.d.f44289c = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        ApplicationLoader.mainInterfaceStopped = false;
        org.telegram.ui.Components.i30.j(this);
        s50 s50Var = s50.D3;
        if (s50Var != null) {
            ArrayList arrayList = s50Var.Z1;
            s50.I3 = false;
            s50Var.P.l();
            f30 f30Var = s50Var.f40945m2;
            if (f30Var.getVisibility() == 0) {
                s50Var.f40958p2.G(f30Var, false);
            }
            if (s50.G3) {
                s50Var.f40954o2.I(s50Var.f40950n2, false);
            }
            arrayList.clear();
            arrayList.addAll(s50Var.Y1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
            }
            w40 w40Var = s50Var.L;
            org.telegram.ui.Components.f91 f91Var = w40Var.v;
            if (f91Var != null) {
                f91Var.c(true);
            }
            w40Var.F = false;
            s50Var.H.s();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        org.telegram.ui.Wallet.w0 w0Var = w7.h6.f48702b;
        if (w0Var != null && w0Var.e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.w0 w0Var2 = w7.h6.f48702b;
            if (!w0Var2.f35028f) {
                w0Var2.c("AUTH_CANCELED");
                w7.h6.f48702b.e();
            }
        }
        this.f33176r1 = false;
        rf.b bVar = this.f33167n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        bVar.e = false;
        if (bVar.f45244f) {
            bVar.c(true);
        }
        bVar.d.unregisterReceiver(bVar.f45252o);
        pf.d.w(this);
        ApplicationLoader.mainInterfaceStopped = true;
        org.telegram.ui.Components.i30.j(this);
        s50 s50Var = s50.D3;
        if (s50Var != null) {
            s50.I3 = true;
            ArrayList arrayList = s50Var.Z1;
            arrayList.clear();
            arrayList.addAll(s50Var.Y1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(false);
            }
            w40 w40Var = s50Var.L;
            org.telegram.ui.Components.f91 f91Var = w40Var.v;
            if (f91Var != null) {
                f91Var.c(false);
            }
            w40Var.F = true;
            s50Var.H.r();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f33158h1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        rf.b bVar = this.f33167n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        bVar.f();
        ArrayList arrayList = this.f33144a1;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.f33173q0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.O0.isEmpty()) {
                ((org.telegram.ui.ActionBar.n2) r4.c.f(1, actionBarLayout.O0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.r rVar = actionBarLayout.G;
            if (rVar != null) {
                rVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ci.q7 a2;
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
            ci.h7 storiesController = MessagesController.getInstance(this.O).getStoriesController();
            if (z11) {
                arrayList = storiesController.h;
            } else {
                arrayList = storiesController.f5401g;
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
                for (int i13 = 0; i13 < jArr2.length; i13 = com.google.android.gms.internal.play_billing.k3.h(jArr2[i13], arrayList4, i13, 1)) {
                }
            } else {
                for (int i14 = 0; i14 < jArr2.length; i14 = com.google.android.gms.internal.play_billing.k3.h(jArr2[i14], arrayList3, i14, 1)) {
                }
            }
            if (!arrayList4.isEmpty() && z10) {
                MessagesController messagesController = MessagesController.getInstance(this.O);
                int[] iArr = {arrayList4.size()};
                lq lqVar = new lq(this, iArr, jArr2, 17);
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
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getPeerStories, new ai.p9(messagesController, longValue, lqVar, 5));
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
                if (R instanceof ey) {
                    try {
                        a2 = ci.q7.a(((ey) R).E0.h);
                    } catch (Exception unused) {
                    }
                    ci.q7 q7Var = a2;
                    R.getOrCreateStoryViewer().v();
                    R.getOrCreateStoryViewer().G(this, null, arrayList3, 0, null, null, q7Var, false);
                }
                a2 = null;
                ci.q7 q7Var2 = a2;
                R.getOrCreateStoryViewer().v();
                R.getOrCreateStoryViewer().G(this, null, arrayList3, 0, null, null, q7Var2, false);
            }
        }
    }

    public final void q0(final int i10, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        ci.z6 z6Var;
        ci.z6 A;
        MessageObject f7;
        MessageObject f10;
        TL_stories.StoryItem storyItem2;
        ci.h7 storiesController = MessagesController.getInstance(this.O).getStoriesController();
        TL_stories.PeerStories y3 = storiesController.y(j10);
        ci.q7 q7Var = null;
        if (y3 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < y3.stories.size()) {
                    if (y3.stories.get(i11).f20506id == i10) {
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
                storyItem2.dialogId = j10;
                org.telegram.ui.ActionBar.n2 R = R();
                if (R != null) {
                    if (R instanceof ey) {
                        try {
                            q7Var = ci.q7.a(((ey) R).E0.h);
                        } catch (Exception unused) {
                        }
                    }
                    R.getOrCreateStoryViewer().v();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z10) {
                        R.getOrCreateStoryViewer().f6260w1 = true;
                    }
                    R.getOrCreateStoryViewer().G(this, storyItem2, arrayList, 0, null, y3, q7Var, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            ci.z6 A2 = storiesController.A(j10, 0, -1, true);
            if (A2 != null && (f10 = A2.f(i10)) != null) {
                storyItem = f10.storyItem;
                z6Var = A2;
            } else {
                z6Var = null;
            }
            if (storyItem == null && (A = storiesController.A(j10, 1, -1, true)) != null && (f7 = A.f(i10)) != null) {
                storyItem = f7.storyItem;
                z6Var = A;
            }
            if (storyItem != null && z6Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.n2 R2 = R();
                if (R2 == null) {
                    return;
                }
                if (R2 instanceof ey) {
                    try {
                        q7Var = ci.q7.a(((ey) R2).E0.h);
                    } catch (Exception unused2) {
                    }
                }
                ci.q7 q7Var2 = q7Var;
                R2.getOrCreateStoryViewer().v();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    R2.getOrCreateStoryViewer().f6260w1 = true;
                }
                R2.getOrCreateStoryViewer().G(this, storyItem, arrayList2, 0, z6Var, null, q7Var2, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.O).getInputPeer(j10);
        tL_stories_getStoriesByID.f20513id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.cg(LaunchActivity.this, tLObject, i10, j10, z10));
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10 = g6Var.f20886f0;
        boolean z10 = false;
        org.telegram.ui.ActionBar.f6 f7 = g6Var.f(tL_theme, this.O, 0);
        g6Var.Z = g6Var.Y;
        g6Var.u(f7.f20828a);
        f7.f20843s = tL_wallPaper;
        if (i10 != g6Var.f20886f0) {
            z10 = true;
        }
        t0(new mc1(g6Var, z10, 0, false, false));
    }

    public final void s0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        rf.b bVar = this.f33167n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        bVar.h = pictureInPictureParams;
    }

    public final void t0(org.telegram.ui.ActionBar.n2 n2Var) {
        ((ActionBarLayout) O()).P(n2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) O()).S(n2Var, z10, z11);
    }

    public final void v0(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E0;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) instanceof gi.d3) {
                    gi.d3 d3Var = (gi.d3) arrayList.get(i10);
                    if (d3Var.isShowing() && d3Var.H == j10) {
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
                ry w9 = this.f33173q0.w();
                if (w9 != null && w9.sheetsStack != null) {
                    for (int i12 = 0; i12 < w9.sheetsStack.size(); i12++) {
                        if (w9.sheetsStack.get(i12).isShown()) {
                            w9.sheetsStack.get(i12);
                        }
                    }
                }
                o90 o90Var = new o90(this, 1);
                TLRPC.User user = MessagesController.getInstance(this.O).getUser(Long.valueOf(j10));
                if (user != null) {
                    o90Var.run(user);
                    return;
                } else {
                    MessagesStorage.getInstance(this.O).getStorageQueue().postRunnable(new a3.i0(this, j10, o90Var, 29));
                    return;
                }
            }
        }
    }

    @Override
    public final boolean w(final org.telegram.ui.ey r47, java.util.ArrayList r48, final java.lang.CharSequence r49, final boolean r50, boolean r51, int r52, final int r53, org.telegram.ui.te1 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.w(org.telegram.ui.ey, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.te1):boolean");
    }

    public final void w0(Long l4, b80 b80Var, pf.c cVar, org.telegram.ui.Cells.u1 u1Var) {
        ChannelBoostsController boostsController = MessagesController.getInstance(this.O).getBoostsController();
        if (cVar != null) {
            cVar.d();
        }
        boostsController.getBoostsStats(l4.longValue(), new n80(this, cVar, b80Var, boostsController, l4, u1Var));
    }

    public final void x0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l4, final Long l10, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, String str26, final String str27, final pf.c cVar, final boolean z12, final int i13, final int i14, final int i15, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i10).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.C1;
                final pf.c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.b();
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
                            Pattern pattern2 = LaunchActivity.C1;
                            LaunchActivity.this.B0(i16, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, z26, num3, l11, l12, num4, str42, hashMap2, str43, str44, str45, str46, tL_wallPaper2, str47, str48, str49, str50, z27, str51, i17, i18, str52, str53, str54, null, null, cVar2, z22, i19, false, i20, i21, null, null, z28, str55, z23, z24, z25, z29, z30, str56, null, z31, null);
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
                        Pattern pattern2 = LaunchActivity.C1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.f33149d0;
                        fz fzVar = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            n2Var = (org.telegram.ui.ActionBar.n2) i2.d.h(1, arrayList);
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
                        l90 l90Var = new l90(launchActivity2, n2Var, i22, user3, tL_messages_botApp2, atomicBoolean, str58, z34, z35, z36, z37);
                        if (z32) {
                            l90Var.run();
                        } else if (tL_messages_botApp2.inactive && z33) {
                            v3 v3Var = new v3(l90Var, 8);
                            pf.c cVar3 = cVar2;
                            if (cVar3 != null) {
                                fzVar = new fz(cVar3, 15);
                            }
                            bi1.a(launchActivity2, v3Var, fzVar);
                        } else if (!tL_messages_botApp2.request_write_access && !z37) {
                            l90Var.run();
                        } else {
                            org.telegram.ui.Components.f5.m(n2Var, atomicBoolean, user3, l90Var);
                        }
                    }
                });
            }
        });
    }

    public final void y(int i10) {
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.f33192z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33192z1 = null;
        }
        if (i12 >= 26) {
            i11 = getWindow().getNavigationBarColor();
        } else {
            i11 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i11, i10);
        this.f33192z1 = ofArgb;
        ofArgb.addUpdateListener(new k80(this, 1));
        this.f33192z1.addListener(new w0(this, i10, 3));
        this.f33192z1.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f33192z1.setDuration(320L);
        this.f33192z1.start();
    }

    public final void y0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f33175r0;
        if (actionBarLayout != null) {
            actionBarLayout.U(z10, z10);
        } else {
            this.f33173q0.U(z10, z10);
        }
    }

    public final void z(boolean z10) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z10 || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    boolean z11 = this.f33170o1;
                    this.f33170o1 = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z10, new z70(this, z11, update, 2));
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
                    ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new ai.m2(this, i10, 7));
                }
            }
        }
    }

    public final int z0(final int i10, final b80 b80Var, final Integer num, final Integer num2, final Long l4, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i11, final int i12) {
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
                Pattern pattern = LaunchActivity.C1;
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
                final Runnable runnable3 = b80Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c90.run():void");
                    }
                });
            }
        });
    }

    @Override
    public final void e(int[] iArr) {
    }
}
