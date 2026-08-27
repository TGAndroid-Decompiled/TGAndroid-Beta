package org.telegram.ui;

import android.animation.Animator;
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
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.OneUIUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;

public class LaunchActivity extends h5 implements org.telegram.ui.ActionBar.y4, NotificationCenter.NotificationCenterDelegate, zx, ze.a {
    public static boolean A1;
    public static org.telegram.ui.Components.xt B1;
    public static LaunchActivity C1;
    public static Pattern D1;
    public static d0 E1;
    public static LaunchActivity F1;

    public static final Pattern f35496x1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");

    public static boolean f35497y1;

    public static int f35498z1;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.b2 B0;
    public View C0;
    public org.telegram.ui.ActionBar.b2 D0;
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
    public org.telegram.ui.ActionBar.f6 O0;
    public CharSequence P;
    public TLRPC.TL_theme P0;
    public ArrayList Q;
    public boolean Q0;
    public ArrayList R;
    public org.telegram.ui.ActionBar.b2 R0;
    public ArrayList S;
    public boolean S0;
    public Uri T;
    public boolean T0;
    public String U;
    public gh.b6 U0;
    public ArrayList V;
    public w5 V0;
    public ArrayList W;
    public final ArrayList W0;
    public Uri X;
    public final SparseIntArray X0;
    public int Y;
    public int Y0;
    public final ma0 Z0;

    public FlagSecureReason f35500a1;

    public final LiteMode.BatteryReceiver f35502b1;

    public p90 f35503c0;

    public yg.e f35504c1;

    public ArrayList f35505d0;

    public boolean f35506d1;

    public ArrayList f35507e0;

    public gf.b0 f35508e1;

    public String f35509f0;

    public ra0 f35510f1;

    public ActionMode f35511g0;

    public sa0 f35512g1;

    public boolean f35513h0;

    public boolean f35514h1;

    public final m.t3 f35515i0;

    public NotificationCenter.ObserversGroup f35516i1;

    public final ye.b f35517j0;

    public NotificationCenter.ObserversGroup f35518j1;

    public ImageView f35519k0;

    public boolean f35520k1;

    public org.telegram.ui.Components.ce f35521l0;
    public o90 l1;
    public ActionBarLayout m0;

    public lh.n6 f35522m1;

    public ActionBarLayout f35523n0;

    public boolean f35524n1;

    public ActionBarLayout f35525o0;

    public ViewGroup f35526o1;

    public fa0 f35527p0;

    public org.telegram.ui.ActionBar.b2 f35528p1;

    public FrameLayout f35529q0;

    public org.telegram.ui.ActionBar.b2 f35530q1;

    public org.telegram.ui.Components.d51 f35531r0;

    public boolean f35532r1;

    public n0 f35533s0;

    public long f35534s1;

    public pa0 f35535t0;

    public int[] f35536t1;

    public org.telegram.ui.ActionBar.v3 f35537u0;

    public ValueAnimator f35538u1;

    public org.telegram.ui.ActionBar.x3 f35539v0;

    public hh.lb f35540v1;

    public org.telegram.ui.Components.fd0 f35541w0;

    public int f35542w1;

    public final ArrayList f35543x0;

    public org.telegram.ui.Components.oz0 f35544y0;

    public org.telegram.ui.Components.t9 f35545z0;
    public final ArrayList L = new ArrayList();
    public final ArrayList Z = new ArrayList();

    public final ArrayList f35499a0 = new ArrayList();

    public final ArrayList f35501b0 = new ArrayList();

    public LaunchActivity() {
        m.t3 t3Var = new m.t3();
        t3Var.f17473a = new HashMap();
        t3Var.d = this;
        t3Var.f17474b = new ye.b(this);
        this.f35515i0 = t3Var;
        this.f35517j0 = (ye.b) t3Var.f17474b;
        this.f35543x0 = new ArrayList();
        this.A0 = new ArrayList();
        this.S0 = false;
        this.W0 = new ArrayList();
        this.X0 = new SparseIntArray();
        this.Y0 = 5934;
        this.Z0 = new ma0();
        this.f35502b1 = new LiteMode.BatteryReceiver();
        this.f35520k1 = true;
        System.identityHashCode(this);
        this.f35542w1 = 0;
    }

    public static void C0(LaunchActivity launchActivity, int i10, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        org.telegram.ui.ActionBar.n2 n2VarR = R();
        if (n2VarR == null) {
            return;
        }
        long j10 = tL_attachMenuBot.bot_id;
        nh.q4 q4VarB = nh.q4.b(i10, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
        if (launchActivity.P() == null || launchActivity.P().k(q4VarB) == null) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
            String restrictionReason = user == null ? null : MessagesController.getInstance(i10).getRestrictionReason(user.restriction_reason);
            if (!TextUtils.isEmpty(restrictionReason)) {
                MessagesController.getInstance(i10);
                MessagesController.showCantOpenAlert(n2VarR, restrictionReason);
                return;
            }
            nh.b3 b3Var = new nh.b3(launchActivity, n2VarR.getResourceProvider());
            b3Var.f18598w0 = false;
            b3Var.w(z10);
            b3Var.f18579g0 = launchActivity;
            b3Var.s(n2VarR, q4VarB);
            b3Var.show();
        }
    }

    public static void E(int i10) {
        LaunchActivity launchActivity = F1;
        if (launchActivity != null) {
            launchActivity.C(i10);
        }
    }

    public static void L() {
        ArrayList<org.telegram.ui.ActionBar.j2> arrayList;
        org.telegram.ui.ActionBar.n2 n2VarU = U();
        if (n2VarU == null) {
            return;
        }
        ty tyVarW = n2VarU.getParentLayout() instanceof ActionBarLayout ? ((ActionBarLayout) n2VarU.getParentLayout()).w() : null;
        if (tyVarW != null && (arrayList = tyVarW.sheetsStack) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                tyVarW.sheetsStack.get(size).dismiss(true);
            }
        }
        ArrayList<org.telegram.ui.ActionBar.j2> arrayList2 = n2VarU.sheetsStack;
        if (arrayList2 != null) {
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                n2VarU.sheetsStack.get(size2).dismiss(true);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = nh.b3.S0.iterator();
        while (it.hasNext()) {
            arrayList3.add((nh.b3) it.next());
        }
        int size3 = arrayList3.size();
        int i10 = 0;
        while (i10 < size3) {
            Object obj = arrayList3.get(i10);
            i10++;
            ((nh.b3) obj).k(true);
        }
    }

    public static org.telegram.ui.ActionBar.n2 N() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.W;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.O) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = C1;
        if (launchActivity != null && !launchActivity.L.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.b5) i0.a.i(1, C1.L))).t();
        }
        LaunchActivity launchActivity2 = C1;
        if (launchActivity2 == null || launchActivity2.O() == null) {
            return null;
        }
        return ((ActionBarLayout) C1.O()).t();
    }

    public static org.telegram.ui.ActionBar.n2 R() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.W;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.O) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = C1;
        if (launchActivity != null && !launchActivity.L.isEmpty()) {
            return ((org.telegram.ui.ActionBar.b5) i0.a.i(1, C1.L)).getLastFragment();
        }
        LaunchActivity launchActivity2 = C1;
        if (launchActivity2 == null || launchActivity2.O() == null) {
            return null;
        }
        return C1.O().getLastFragment();
    }

    public static org.telegram.ui.ActionBar.n2 U() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.W;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.O) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = C1;
        if (launchActivity != null && !launchActivity.L.isEmpty()) {
            return ((org.telegram.ui.ActionBar.b5) i0.a.i(1, C1.L)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = C1;
        if (launchActivity2 == null || launchActivity2.O() == null) {
            return null;
        }
        return C1.O().getSafeLastFragment();
    }

    public static String V(int i10, String str, HashMap map) {
        String str2 = (String) map.get(str);
        return str2 == null ? LocaleController.getString(str, i10) : str2;
    }

    public static int W(Uri uri) {
        String queryParameter;
        if (uri.getPathSegments().contains("video")) {
            queryParameter = uri.getQuery();
        } else {
            queryParameter = uri.getQueryParameter("t") != null ? uri.getQueryParameter("t") : null;
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return -1;
        }
        if (D1 == null) {
            D1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
        }
        Matcher matcher = D1.matcher(queryParameter);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            String strGroup3 = matcher.group(3);
            String strGroup4 = matcher.group(4);
            int i10 = 0;
            int i11 = TextUtils.isEmpty(strGroup) ? 0 : Integer.parseInt(strGroup);
            int i12 = TextUtils.isEmpty(strGroup2) ? 0 : Integer.parseInt(strGroup2);
            int i13 = TextUtils.isEmpty(strGroup3) ? 0 : Integer.parseInt(strGroup3);
            if (!TextUtils.isEmpty(strGroup4)) {
                i10 = Integer.parseInt(strGroup4);
            }
            return (i11 * 86400) + (i12 * 3600) + (i13 * 60) + i10;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            if (!queryParameter.contains(":")) {
                return -1;
            }
            String[] strArrSplit = queryParameter.split(":");
            String str = strArrSplit.length - 1 < 0 ? "0" : strArrSplit[strArrSplit.length - 1];
            String str2 = strArrSplit.length - 2 < 0 ? "0" : strArrSplit[strArrSplit.length - 2];
            String str3 = strArrSplit.length - 3 < 0 ? "0" : strArrSplit[strArrSplit.length - 3];
            String str4 = strArrSplit.length - 4 >= 0 ? strArrSplit[strArrSplit.length - 4] : "0";
            try {
                int i14 = Integer.parseInt(str);
                int i15 = Integer.parseInt(str2);
                return (Integer.parseInt(str4) * 86400) + (Integer.parseInt(str3) * 3600) + (i15 * 60) + i14;
            } catch (Exception e9) {
                FileLog.e(e9);
                return -1;
            }
        }
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
        hh.lb lbVar;
        LaunchActivity launchActivity = C1;
        if (launchActivity == null || (decorView = launchActivity.getWindow().getDecorView()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && ((lbVar = launchActivity.f35540v1) == null || ((View) lbVar.f2040a) != decorView)) {
            launchActivity.f35540v1 = new hh.lb(decorView);
        }
        hh.lb lbVar2 = launchActivity.f35540v1;
        if (lbVar2 != null) {
            View view = (View) lbVar2.f2040a;
            ArrayList arrayList = lbVar2.f9693b;
            if (arrayList.size() >= 7) {
                return;
            }
            float fMax = (Math.max(Math.max(h7.y.a(0.0f, 0.0f, f10, f11), h7.y.a(view.getWidth(), 0.0f, f10, f11)), Math.max(h7.y.a(0.0f, view.getHeight(), f10, f11), h7.y.a(view.getWidth(), view.getHeight(), f10, f11))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, fMax);
            hh.kb kbVar = new hh.kb(f10, f11, f12);
            valueAnimatorOfFloat.addUpdateListener(new ag.t2(2, lbVar2, kbVar));
            valueAnimatorOfFloat.addListener(new ag.x1(3, lbVar2, kbVar));
            valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28123g);
            valueAnimatorOfFloat.setDuration((long) (fMax * 1000.0f));
            arrayList.add(kbVar);
            lbVar2.R();
            valueAnimatorOfFloat.start();
        }
    }

    public static void y0(AccountInstance accountInstance, gy gyVar, CharSequence charSequence, long j10, MessageObject messageObject, long j11, boolean z10, int i10, int i11) {
        org.telegram.ui.Components.xp0 xp0Var;
        org.telegram.ui.Components.xp0 xp0Var2;
        boolean z11 = gyVar == null || (xp0Var2 = gyVar.C2) == null || xp0Var2.f34672n;
        TLRPC.WebPage loadedWebPage = null;
        if (z11 && gyVar != null && (xp0Var = gyVar.C2) != null) {
            loadedWebPage = xp0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage = loadedWebPage;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (webPage == null && z11) {
            SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j10, j11, z10, i10, i11, 0L);
            return;
        }
        CharSequence trimmedString = SendMessagesHelper.getTrimmedString(charSequence);
        if (trimmedString == null || trimmedString.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = {trimmedString};
        accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j10, messageObject, messageObject, webPage, z11, accountInstance.getMediaDataController().getEntities(charSequenceArr, true), null, null, z10, i10, i11, null, false));
    }

    public final void A() {
        if (this.K != UserConfig.selectedAccount || this.f35516i1 == null) {
            NotificationCenter.ObserversGroup observersGroup = this.f35516i1;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.f35516i1 = null;
            }
            int i10 = UserConfig.selectedAccount;
            this.K = i10;
            this.f35516i1 = NotificationCenter.getInstance(i10).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
        }
    }

    public final void A0() {
        org.telegram.ui.ActionBar.x3 x3Var;
        ViewGroup view;
        if (this.f35539v0.indexOfChild(this.f35527p0) != -1) {
            x3Var = this.f35539v0;
            view = this.f35527p0;
        } else {
            x3Var = this.f35539v0;
            view = this.m0.getView();
        }
        int iIndexOfChild = x3Var.indexOfChild(view);
        if (iIndexOfChild != -1) {
            this.f35539v0.removeViewAt(iIndexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            fa0 fa0Var = new fa0(this, this);
            this.f35527p0 = fa0Var;
            if (iIndexOfChild != -1) {
                this.f35539v0.addView(fa0Var, iIndexOfChild, h7.z5.c(-1.0f, -1));
            } else {
                this.f35539v0.addView(fa0Var, h7.z5.c(-1.0f, -1));
            }
            org.telegram.ui.Components.d51 d51Var = new org.telegram.ui.Components.d51(this, null, 4);
            this.f35531r0 = d51Var;
            d51Var.setOccupyStatusBar(false);
            this.f35531r0.V(org.telegram.ui.ActionBar.g6.r0());
            this.f35527p0.addView(this.f35531r0, h7.z5.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.m0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.m0.getView());
            }
            this.f35527p0.addView(this.m0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f35525o0 = actionBarLayout;
            actionBarLayout.J0 = true;
            actionBarLayout.setFragmentStack(this.f35501b0);
            this.f35525o0.setDelegate(this);
            this.f35527p0.addView(this.f35525o0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f35529q0 = frameLayout;
            ArrayList arrayList = this.f35499a0;
            frameLayout.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.f35529q0.setBackgroundColor(1056964608);
            this.f35527p0.addView(this.f35529q0);
            this.f35529q0.setOnTouchListener(new g0(this, 3));
            this.f35529q0.setOnClickListener(new ag.l2(23));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f35523n0 = actionBarLayout2;
            actionBarLayout2.I0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f35523n0.setBackgroundView(this.f35529q0);
            this.f35523n0.setUseAlphaAnimations(true);
            this.f35523n0.setFragmentStack(arrayList);
            this.f35523n0.setDelegate(this);
            this.f35523n0.setDrawerLayoutContainer(this.f35539v0);
            ViewGroup view2 = this.f35523n0.getView();
            view2.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.f35527p0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.m0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.m0.getView());
            }
            this.m0.setFragmentStack(this.Z);
            if (iIndexOfChild != -1) {
                this.f35539v0.addView(this.m0.getView(), iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f35539v0.addView(this.m0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        h7.y7.a(this, SharedConfig.isFloatingDebugActive, false);
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f35508e1 == null && SharedConfig.frameMetricsEnabled) {
                this.f35508e1 = gf.b0.b(this, this.f35533s0);
            }
            gf.b0 b0Var = this.f35508e1;
            if (b0Var == null || SharedConfig.frameMetricsEnabled) {
                return;
            }
            b0Var.c();
            this.f35508e1 = null;
        }
    }

    public final org.telegram.ui.ActionBar.b2 B0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.b2 b2VarO = alertDialog$Builder.o();
            b2VarO.setCanceledOnTouchOutside(true);
            b2VarO.setOnDismissListener(new cg.g(10, this, b2VarO));
            this.A0.add(b2VarO);
            return b2VarO;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public final void C(int i10) {
        F1 = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT < 26 || i10 != 0) && !this.f35532r1) {
            Utilities.globalQueue.postRunnable(new d80(this, i10, 0), 2000L);
        }
    }

    @Override
    public final boolean D() {
        ArrayList arrayList = this.Q;
        return (arrayList != null && arrayList.size() == 1) || this.N != null;
    }

    public final void D0(p.a aVar) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ArrayList arrayList = this.f35499a0;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f35501b0;
            if (arrayList2.isEmpty()) {
                ArrayList arrayList3 = this.Z;
                n2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList3) : null;
            } else {
                n2Var = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList2);
            }
        } else {
            n2Var = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList);
        }
        if (org.telegram.ui.Components.mc.a(n2Var)) {
            aVar.c(org.telegram.ui.Components.mc.a0(n2Var)).j();
        }
    }

    public final void E0() {
        String str;
        char c10;
        LocaleController.LocaleInfo localeInfo;
        if (UserConfig.getInstance(this.K).isClientActivated()) {
            try {
                if (!this.E0 && !ApplicationLoader.mainInterfacePaused) {
                    String string = MessagesController.getGlobalMainSettings().getString("language_showed2", "");
                    final String str2 = MessagesController.getInstance(this.K).suggestedLangCode;
                    if (string.equals(str2)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final LocaleController.LocaleInfo[] localeInfoArr = new LocaleController.LocaleInfo[2];
                    String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
                    if ("in".equals(str3)) {
                        str = "id";
                    } else if ("iw".equals(str3)) {
                        str = "he";
                    } else {
                        str = "jw".equals(str3) ? "jv" : null;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= LocaleController.getInstance().languages.size()) {
                            c10 = 0;
                            break;
                        }
                        LocaleController.LocaleInfo localeInfo2 = LocaleController.getInstance().languages.get(i10);
                        c10 = 0;
                        if (localeInfo2.shortName.equals("en")) {
                            localeInfoArr[0] = localeInfo2;
                        }
                        if (localeInfo2.shortName.replace("_", "-").equals(str2) || localeInfo2.shortName.equals(str3) || localeInfo2.shortName.equals(str)) {
                            localeInfoArr[1] = localeInfo2;
                        }
                        if (localeInfoArr[0] != null && localeInfoArr[1] != null) {
                            break;
                        } else {
                            i10++;
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
                        final int i11 = 0;
                        ConnectionsManager.getInstance(this.K).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) {

                            public final LaunchActivity f41875b;

                            {
                                this.f41875b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i12 = 0;
                                switch (i11) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.f35496x1;
                                        final HashMap map = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i12 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i12);
                                                map.put(langPackString.key, langPackString.value);
                                                i12++;
                                            }
                                        }
                                        final int i13 = 0;
                                        final LaunchActivity launchActivity = this.f41875b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str2;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap map2 = map;
                                                        launchActivity2.F0 = map2;
                                                        if (launchActivity2.G0 != null && map2 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr2;
                                                            launchActivity2.F0(localeInfoArr3[1], localeInfoArr3[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap map3 = map;
                                                        launchActivity3.G0 = map3;
                                                        if (map3 != null && launchActivity3.F0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.F0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        Pattern pattern2 = LaunchActivity.f35496x1;
                                        final HashMap map2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i12 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i12);
                                                map2.put(langPackString2.key, langPackString2.value);
                                                i12++;
                                            }
                                        }
                                        final int i14 = 1;
                                        final LaunchActivity launchActivity2 = this.f41875b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str2;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i14) {
                                                    case 0:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap map3 = map2;
                                                        launchActivity3.F0 = map3;
                                                        if (launchActivity3.G0 != null && map3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.F0(localeInfoArr4[1], localeInfoArr4[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity4 = launchActivity2;
                                                        HashMap map4 = map2;
                                                        launchActivity4.G0 = map4;
                                                        if (map4 != null && launchActivity4.F0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr5 = localeInfoArr3;
                                                            launchActivity4.F0(localeInfoArr5[1], localeInfoArr5[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        }, 8);
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings2 = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings2.lang_code = localeInfoArr[c10].getLangCode();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        final int i12 = 1;
                        ConnectionsManager.getInstance(this.K).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {

                            public final LaunchActivity f41875b;

                            {
                                this.f41875b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i13 = 0;
                                switch (i12) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.f35496x1;
                                        final HashMap map = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i13 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i13);
                                                map.put(langPackString.key, langPackString.value);
                                                i13++;
                                            }
                                        }
                                        final int i14 = 0;
                                        final LaunchActivity launchActivity = this.f41875b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str2;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i14) {
                                                    case 0:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap map3 = map;
                                                        launchActivity3.F0 = map3;
                                                        if (launchActivity3.G0 != null && map3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.F0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity4 = launchActivity;
                                                        HashMap map4 = map;
                                                        launchActivity4.G0 = map4;
                                                        if (map4 != null && launchActivity4.F0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr5 = localeInfoArr2;
                                                            launchActivity4.F0(localeInfoArr5[1], localeInfoArr5[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        Pattern pattern2 = LaunchActivity.f35496x1;
                                        final HashMap map2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i13 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i13);
                                                map2.put(langPackString2.key, langPackString2.value);
                                                i13++;
                                            }
                                        }
                                        final int i15 = 1;
                                        final LaunchActivity launchActivity2 = this.f41875b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str2;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap map3 = map2;
                                                        launchActivity3.F0 = map3;
                                                        if (launchActivity3.G0 != null && map3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.F0(localeInfoArr4[1], localeInfoArr4[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity4 = launchActivity2;
                                                        HashMap map4 = map2;
                                                        launchActivity4.G0 = map4;
                                                        if (map4 != null && launchActivity4.F0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr5 = localeInfoArr3;
                                                            launchActivity4.F0(localeInfoArr5[1], localeInfoArr5[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        }, 8);
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public final void F() {
        if (!AndroidUtilities.isTablet() || this.f35525o0 == null) {
            return;
        }
        if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
            if (AndroidUtilities.isInMultiwindow || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
                this.K0 = true;
                List<org.telegram.ui.ActionBar.n2> fragmentStack = this.f35525o0.getFragmentStack();
                if (!fragmentStack.isEmpty()) {
                    while (fragmentStack.size() > 0) {
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.get(0);
                        if (n2Var instanceof rn) {
                            ((rn) n2Var).U4 = true;
                        }
                        n2Var.onPause();
                        n2Var.onFragmentDestroy();
                        n2Var.setParentLayout(null);
                        fragmentStack.remove(n2Var);
                        this.m0.c(-1, n2Var);
                    }
                    org.telegram.ui.Components.fd0 fd0Var = this.f35541w0;
                    if (fd0Var == null || fd0Var.f28378b.getVisibility() != 0) {
                        this.m0.U(true, true);
                    }
                }
                this.f35525o0.getView().setVisibility(8);
                this.f35531r0.setVisibility(this.m0.getFragmentStack().isEmpty() ? 0 : 8);
                return;
            }
            this.K0 = false;
            List<org.telegram.ui.ActionBar.n2> fragmentStack2 = this.m0.getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                while (1 < fragmentStack2.size()) {
                    org.telegram.ui.ActionBar.n2 n2Var2 = fragmentStack2.get(1);
                    if (n2Var2 instanceof rn) {
                        ((rn) n2Var2).U4 = true;
                    }
                    n2Var2.onPause();
                    n2Var2.onFragmentDestroy();
                    n2Var2.setParentLayout(null);
                    fragmentStack2.remove(n2Var2);
                    this.f35525o0.c(-1, n2Var2);
                }
                org.telegram.ui.Components.fd0 fd0Var2 = this.f35541w0;
                if (fd0Var2 == null || fd0Var2.f28378b.getVisibility() != 0) {
                    this.m0.U(true, true);
                    this.f35525o0.U(true, true);
                }
            }
            this.f35525o0.getView().setVisibility(this.f35525o0.getFragmentStack().isEmpty() ? 8 : 0);
            this.f35531r0.setVisibility(this.f35525o0.getFragmentStack().isEmpty() ? 0 : 8);
        }
    }

    public final void F0(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, String str) {
        try {
            this.E0 = false;
            LocaleController.LocaleInfo localeInfo3 = localeInfo;
            int i10 = 1;
            boolean z10 = localeInfo3.builtIn || LocaleController.getInstance().isCurrentLocalLocale();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = V(R.string.ChooseYourLanguage, "ChooseYourLanguage", this.F0);
            b2Var.O = V(R.string.ChooseYourLanguage, "ChooseYourLanguage", this.G0);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            org.telegram.ui.Cells.n4[] n4VarArr = new org.telegram.ui.Cells.n4[2];
            String strV = V(R.string.English, "English", this.F0);
            LocaleController.LocaleInfo[] localeInfoArr = {z10 ? localeInfo3 : localeInfo2, z10 ? localeInfo2 : localeInfo3};
            if (!z10) {
                localeInfo3 = localeInfo2;
            }
            LocaleController.LocaleInfo[] localeInfoArr2 = {localeInfo3};
            int i11 = 0;
            for (int i12 = 2; i11 < i12; i12 = 2) {
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this);
                n4VarArr[i11] = n4Var;
                LocaleController.LocaleInfo localeInfo4 = localeInfoArr[i11];
                String str2 = localeInfo4 == localeInfo2 ? strV : null;
                n4Var.f24719b.setText(str2 != null ? str2 : localeInfo4.name);
                n4Var.f24720c.setText(localeInfo4.nameEnglish);
                n4Var.f24721e = localeInfo4;
                n4Var.d = true;
                n4VarArr[i11].setTag(Integer.valueOf(i11));
                n4VarArr[i11].setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), 2, -1));
                n4VarArr[i11].f24718a.a(i11 == 0, false);
                linearLayout.addView(n4VarArr[i11], h7.z5.n(-1, 50));
                n4VarArr[i11].setOnClickListener(new u70(i10, localeInfoArr2, n4VarArr));
                i11++;
            }
            org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(this);
            String strV2 = V(R.string.ChooseYourLanguageOther, "ChooseYourLanguageOther", this.F0);
            String strV3 = V(R.string.ChooseYourLanguageOther, "ChooseYourLanguageOther", this.G0);
            n4Var2.f24719b.setText(strV2);
            n4Var2.f24720c.setText(strV3);
            n4Var2.f24718a.a(false, false);
            n4Var2.f24721e = null;
            n4Var2.d = false;
            n4Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), 2, -1));
            n4Var2.setOnClickListener(new u50(this, 5));
            linearLayout.addView(n4Var2, h7.z5.n(-1, 50));
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), new zr(17, this, localeInfoArr2));
            this.D0 = B0(alertDialog$Builder);
            MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str).commit();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void G(boolean z10) {
        H(z10, true, !this.S0);
    }

    public final void G0(boolean z10, boolean z11, int i10, int i11, ti tiVar) {
        if (this.f35539v0 == null || isFinishing()) {
            return;
        }
        if (this.f35541w0 == null) {
            this.f35541w0 = new org.telegram.ui.Components.fd0(this);
        }
        SharedConfig.appLocked = true;
        int i12 = 0;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36160s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (m4.I() && m4.x().R) {
            m4.x().o(false, true);
        }
        lh.sb.x();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f35541w0.show();
        org.telegram.ui.Components.ed0 ed0Var = this.f35541w0.f28378b;
        ArrayList arrayList = this.f35543x0;
        arrayList.isEmpty();
        ed0Var.j(z11, i10, i11, new a30(13, this, tiVar));
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.ui.Components.dd0 dd0Var = (org.telegram.ui.Components.dd0) arrayList.get(i13);
            if (z10) {
                int size = arrayList.size() - 1;
            }
            dd0Var.j(z11, i10, i11, null);
        }
        SharedConfig.isWaitingForPasscodeEnter = true;
        w90 w90Var = new w90(this);
        this.f35541w0.f28378b.setDelegate(w90Var);
        int size2 = arrayList.size();
        while (i12 < size2) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.Components.dd0) obj).setDelegate(w90Var);
        }
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void H(boolean z10, boolean z11, boolean z12) {
        pn pnVar;
        boolean zIsLightStatusBar;
        ArrayList arrayList = this.Z;
        boolean z13 = true;
        org.telegram.ui.ActionBar.n2 n2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList) : null;
        char c10 = 2;
        if (n2Var != null && (n2Var.isRemovingFromStack() || n2Var.isInPreviewMode())) {
            n2Var = arrayList.size() > 1 ? (org.telegram.ui.ActionBar.n2) i0.a.i(2, arrayList) : null;
        }
        if (n2Var != null) {
            n2Var.hasForceLightStatusBar();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (z11) {
                if (n2Var != null) {
                    zIsLightStatusBar = n2Var.isLightStatusBar();
                    if (n2Var.getParentLayout() instanceof ActionBarLayout) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) n2Var.getParentLayout();
                        if (actionBarLayout.w() == null || actionBarLayout.w().getLastSheet() == null) {
                            ArrayList<org.telegram.ui.ActionBar.j2> arrayList2 = n2Var.sheetsStack;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                org.telegram.ui.ActionBar.j2 j2Var = (org.telegram.ui.ActionBar.j2) i0.a.i(1, n2Var.sheetsStack);
                                if (j2Var.isShown()) {
                                    zIsLightStatusBar = j2Var.isAttachedLightStatusBar();
                                }
                            }
                        } else {
                            org.telegram.ui.ActionBar.j2 lastSheet = actionBarLayout.w().getLastSheet();
                            if (lastSheet.isShown()) {
                                zIsLightStatusBar = lastSheet.isAttachedLightStatusBar();
                            }
                        }
                    }
                } else {
                    zIsLightStatusBar = i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23322s8, true)) > 0.699999988079071d;
                }
                AndroidUtilities.setLightStatusBar(this, zIsLightStatusBar);
            }
            if (i10 >= 26 && z12 && (!z10 || n2Var == null || !n2Var.isInPreviewMode())) {
                int iW0 = (n2Var == null || !z10) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, true) : n2Var.getNavigationBarColor();
                if (n2Var instanceof rn) {
                    rn rnVar = (rn) n2Var;
                    if (!rnVar.Ab || (rnVar.v.f50161s != 1 && ((pnVar = rnVar.f41983aa) == null || !pnVar.C))) {
                        c10 = 1;
                    }
                } else {
                    c10 = 0;
                }
                if (P() != null && P().D > 0) {
                    c10 = 0;
                }
                if (this.m0.w() != null) {
                    ty tyVarW = this.m0.w();
                    if (tyVarW.sheetsStack != null) {
                        for (int i11 = 0; i11 < tyVarW.sheetsStack.size(); i11++) {
                            org.telegram.ui.ActionBar.j2 j2Var2 = tyVarW.sheetsStack.get(i11);
                            if (j2Var2.attachedToParent()) {
                                iW0 = j2Var2.getNavigationBarColor(iW0);
                                c10 = 0;
                            }
                        }
                    }
                }
                Iterator it = nh.b3.S0.iterator();
                while (it.hasNext()) {
                    iW0 = ((nh.b3) it.next()).getNavigationBarColor(iW0);
                    c10 = 0;
                }
                z0(iW0);
                if ((c10 != 0 || AndroidUtilities.computePerceivedBrightness(iW0) < 0.721f) && c10 != 1) {
                    z13 = false;
                }
                AndroidUtilities.setLightNavigationBar(this, z13);
            }
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void H0(int i10, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f10;
        float f11;
        if (this.f35544y0 == null) {
            final org.telegram.ui.Components.oz0 oz0Var = new org.telegram.ui.Components.oz0(this);
            oz0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            int i11 = AndroidUtilities.statusBarHeight;
            if (i11 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                oz0Var.addView(view, new FrameLayout.LayoutParams(-1, i11));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.logo_middle);
            linearLayout.addView(imageView, h7.z5.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.g6.G6;
            f10 = 4.0f;
            org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, 17.0f);
            textView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
            linearLayout.addView(textView, h7.z5.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            oz0Var.f31449a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(51);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView2, h7.z5.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            scrollView.setPadding(AndroidUtilities.dp(24.0f), i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            oz0Var.addView(scrollView, h7.z5.n(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(LocaleController.getString(R.string.Decline).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            int i13 = org.telegram.ui.ActionBar.g6.f23423y6;
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(null, i13, false)));
            f11 = 10.0f;
            textView3.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
            oz0Var.addView(textView3, h7.z5.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            final int i14 = 0;
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i15 = i14;
                    oz0 oz0Var2 = oz0Var;
                    switch (i15) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            b2Var.N = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new mz0(oz0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            b2Var.P = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            break;
                        default:
                            if (oz0Var2.f31451c.min_age_confirm == 0) {
                                oz0Var2.a();
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                                b2Var2.N = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new mz0(oz0Var2, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                b2Var2.P = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", oz0Var2.f31451c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                            }
                            break;
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(LocaleController.getString(R.string.Accept));
            textView4.setGravity(17);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int iDp = AndroidUtilities.dp(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, -11491093, -12346402, -12346402));
            textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            oz0Var.addView(textView4, h7.z5.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            final int i15 = 1;
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i16 = i15;
                    oz0 oz0Var2 = oz0Var;
                    switch (i16) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            b2Var.N = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new mz0(oz0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            b2Var.P = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            break;
                        default:
                            if (oz0Var2.f31451c.min_age_confirm == 0) {
                                oz0Var2.a();
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                                b2Var2.N = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new mz0(oz0Var2, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                b2Var2.P = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", oz0Var2.f31451c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                            }
                            break;
                    }
                }
            });
            View view2 = new View(this);
            view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23054d7, false));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
            layoutParams.gravity = 80;
            oz0Var.addView(view2, layoutParams);
            this.f35544y0 = oz0Var;
            oz0Var.setAlpha(0.0f);
            this.f35539v0.addView(this.f35544y0, h7.z5.c(-1.0f, -1));
            this.f35544y0.setDelegate(new ga0(this));
        } else {
            f10 = 4.0f;
            f11 = 10.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i10).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f22437id.data.equals(tL_help_termsOfService.f22437id.data))) {
            UserConfig.getInstance(i10).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i10).saveConfig(false);
        }
        org.telegram.ui.Components.oz0 oz0Var2 = this.f35544y0;
        if (oz0Var2.getVisibility() != 0) {
            oz0Var2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false);
        int iDp2 = AndroidUtilities.dp(f11);
        int iDp3 = AndroidUtilities.dp(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i16 = 0; i16 < length; i16++) {
            if (spannableStringBuilder.charAt(i16) == '\n') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '-') {
                    int i18 = i16 + 2;
                    if (spannableStringBuilder.charAt(i18) == ' ') {
                        org.telegram.ui.Components.ra raVar = new org.telegram.ui.Components.ra(iDp2, iDp3);
                        spannableStringBuilder.replace(i17, i16 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(raVar, i17, i18, 33);
                    }
                }
            }
        }
        oz0Var2.f31449a.setText(spannableStringBuilder);
        oz0Var2.f31451c = tL_help_termsOfService;
        oz0Var2.d = i10;
        this.f35544y0.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    public final void I(boolean z10) {
        ChatObject.Call call;
        long j10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = false;
        if (sharedInstance == null || (call = sharedInstance.groupCall) == null) {
            this.f35513h0 = false;
            return;
        }
        boolean z12 = this.f35513h0;
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
        boolean z13 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted) ? false : true;
        if (z13 && groupCallParticipant.raise_hand_rating != 0) {
            z11 = true;
        }
        this.f35513h0 = z11;
        if (z10 || !z12 || z11 || z13 || s50.f42409z3 != null) {
            return;
        }
        J0(38);
    }

    public final void I0(int i10, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        int i11 = 1;
        if (this.f35545z0 == null) {
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
            t9Var.f32722w = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.w0(null, i12, false), 0});
            t9Var.f32723x = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.g6.w0(null, i12, false), 0});
            t9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            int i13 = (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density);
            FrameLayout frameLayout = new FrameLayout(this);
            t9Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight));
            org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(this);
            ri0Var.f(R.raw.qr_code_logo, 108, 108, null);
            ri0Var.d();
            ri0Var.getAnimatedDrawable().I(1);
            ri0Var.setScaleType(ImageView.ScaleType.CENTER);
            ri0Var.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            frameLayout.addView(ri0Var, h7.z5.d(-2, -2.0f, 17, 0.0f, i13, 0.0f, 0.0f));
            ri0Var.setOnClickListener(new org.telegram.ui.Components.f0(t9Var, 4));
            FrameLayout frameLayout2 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            t9Var.f32718f = scrollView;
            AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23322s8, false));
            scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            scrollView.setClipToPadding(false);
            t9Var.addView(scrollView, h7.z5.d(-1, -1.0f, 51, 27.0f, i13 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout2);
            TextView textView = new TextView(this);
            int i14 = org.telegram.ui.ActionBar.g6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.UpdateTelegram));
            frameLayout2.addView(textView, h7.z5.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            t9Var.f32714a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(49);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            frameLayout2.addView(textView2, h7.z5.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            ag.p1 p1Var = new ag.p1(this, 13);
            t9Var.d = p1Var;
            p1Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            p1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
            p1Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            t9Var.addView(p1Var, h7.z5.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            p1Var.setOnClickListener(new org.telegram.ui.Components.q2(8, t9Var, this));
            TextView textView3 = new TextView(this);
            t9Var.f32715b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            p1Var.addView(textView3, h7.z5.e(-2, -2, 17));
            ag.p1 p1Var2 = new ag.p1(t9Var, this, 14);
            t9Var.f32716c = p1Var2;
            p1Var2.setWillNotDraw(false);
            p1Var2.setAlpha(0.0f);
            p1Var2.setScaleX(0.1f);
            p1Var2.setScaleY(0.1f);
            p1Var2.setVisibility(4);
            org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(p1Var2);
            t9Var.f32717e = si0Var;
            si0Var.d(null, true, false);
            si0Var.f32465o = -1;
            p1Var.addView(p1Var2, h7.z5.e(36, 36, 17));
            this.f35545z0 = t9Var;
            this.f35539v0.addView(t9Var, h7.z5.c(-1.0f, -1));
        }
        org.telegram.ui.Components.t9 t9Var2 = this.f35545z0;
        t9Var2.v = 0;
        t9Var2.f32719n = tL_help_appUpdate;
        t9Var2.f32721s = i10;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            t9Var2.f32720r = FileLoader.getAttachFileName(document);
        }
        if (t9Var2.getVisibility() != 0) {
            t9Var2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false);
        t9Var2.f32714a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            t9Var2.f32715b.setText(LocaleController.getString(R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tL_help_appUpdate.document.size)));
        } else {
            t9Var2.f32715b.setText(LocaleController.getString(R.string.Update));
        }
        NotificationCenter.getInstance(t9Var2.f32721s).addObserver(t9Var2, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(t9Var2.f32721s).addObserver(t9Var2, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(t9Var2.f32721s).addObserver(t9Var2, NotificationCenter.fileLoadProgressChanged);
        if (z10 && ApplicationLoader.isStandaloneBuild()) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(t9Var2.f32721s).sendRequest(tL_help_getAppUpdate, new org.telegram.ui.Components.w1(t9Var2, i11));
        }
    }

    public final void J() {
        ArrayList arrayList = this.Z;
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
            ArrayList arrayList2 = this.f35499a0;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((org.telegram.ui.ActionBar.n2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f35501b0;
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
        if (sharedInstance == null || this.Z.isEmpty() || sharedInstance.groupCall == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.ui.ActionBar.n2 n2VarX = this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1);
        if (n2VarX instanceof qg0) {
            n2VarX = ((qg0) n2VarX).X();
        }
        UndoView undoViewY3 = null;
        if (n2VarX instanceof rn) {
            rn rnVar = (rn) n2VarX;
            if (chat != null && rnVar.a() == (-chat.f22380id)) {
                chat = null;
            }
            rnVar.Q7();
            undoViewY3 = rnVar.f42229u3;
        } else if (n2VarX instanceof gy) {
            undoViewY3 = ((gy) n2VarX).Y3();
        } else if (n2VarX instanceof ProfileActivity) {
            undoViewY3 = ((ProfileActivity) n2VarX).I;
        }
        if (undoViewY3 != null) {
            undoViewY3.m(0L, chat, i10);
        }
        if (i10 != 38 || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().playAllowTalkSound();
    }

    @Override
    public final boolean K(gy gyVar) {
        lh.z7 z7VarL;
        FileOutputStream fileOutputStream;
        jh.l6 l6VarO;
        ArrayList arrayList = this.Q;
        if (arrayList == null || arrayList.isEmpty()) {
            String str = this.N;
            if (str != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
                try {
                    Bitmap bitmapCreateVideoThumbnail = SendMessagesHelper.createVideoThumbnail(this.N, 1);
                    File file = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            photoEntry.thumbPath = file.getAbsolutePath();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                FileLog.e(th);
                                if (fileOutputStream != null) {
                                }
                                z7VarL = lh.z7.l(photoEntry);
                                if (z7VarL == null) {
                                    return false;
                                }
                                l6VarO = MessagesController.getInstance(this.K).getStoriesController().o();
                                if (l6VarO == null) {
                                }
                                z7VarL.f17223o = true;
                                z7VarL.M = false;
                                lh.sb.E(this, this.K).S(null, z7VarL, 0L);
                                gyVar.finishFragment();
                                this.Q = null;
                                this.N = null;
                                this.O = null;
                                this.P = null;
                                this.R = null;
                                this.V = null;
                                this.W = null;
                                this.X = null;
                                this.T = null;
                                return true;
                            } catch (Throwable th2) {
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                z7VarL = lh.z7.l(photoEntry);
            } else {
                z7VarL = null;
            }
        } else {
            ArrayList arrayListH7 = rn.H7(this.Q, false, null);
            if (arrayListH7.isEmpty()) {
                z7VarL = null;
            } else {
                z7VarL = lh.z7.l((MediaController.PhotoEntry) arrayListH7.get(0));
            }
        }
        if (z7VarL == null) {
            return false;
        }
        l6VarO = MessagesController.getInstance(this.K).getStoriesController().o();
        if (l6VarO == null && l6VarO.a(this.K, 1)) {
            gyVar.showDialog(new ag.i1(l6VarO.b(), this.K, this, gyVar, null));
            return false;
        }
        z7VarL.f17223o = true;
        z7VarL.M = false;
        lh.sb.E(this, this.K).S(null, z7VarL, 0L);
        gyVar.finishFragment();
        this.Q = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.R = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.T = null;
        return true;
    }

    public final void K0(int i10) {
        L0(i10, new j70(3));
    }

    public final void L0(int i10, GenericProvider genericProvider) {
        if (i10 == UserConfig.selectedAccount || !UserConfig.isValidAccount(i10)) {
            return;
        }
        this.f35514h1 = true;
        ConnectionsManager.getInstance(this.K).setAppPaused(true, false);
        UserConfig.selectedAccount = i10;
        UserConfig.getInstance(0).saveConfig(false);
        A();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAccountChanged, Integer.valueOf(i10));
        if (AndroidUtilities.isTablet()) {
            this.f35523n0.X();
            this.f35525o0.X();
            if (!this.K0) {
                if (this.f35525o0.getFragmentStack().isEmpty()) {
                    this.f35531r0.setVisibility(0);
                }
                this.f35525o0.getView().setVisibility(8);
            }
            this.f35523n0.getView().setVisibility(8);
        }
        this.m0.X();
        this.m0.c(-3, (qg0) genericProvider.provide(null));
        this.m0.U(true, true);
        if (AndroidUtilities.isTablet()) {
            this.f35523n0.U(true, true);
            this.f35525o0.U(true, true);
        }
        if (!ApplicationLoader.mainInterfacePaused) {
            ConnectionsManager.getInstance(this.K).setAppPaused(false, false);
        }
        if (UserConfig.getInstance(i10).unacceptedTermsOfService != null) {
            H0(i10, UserConfig.getInstance(i10).unacceptedTermsOfService);
        }
        M0();
        this.f35514h1 = false;
    }

    public final ArrayList M(String str, String str2) {
        String str3;
        TLRPC.User user;
        MessagesController messagesController = MessagesController.getInstance(this.K);
        ContactsController contactsController = ContactsController.getInstance(this.K);
        ArrayList arrayList = new ArrayList(contactsController.contacts);
        ArrayList arrayList2 = new ArrayList();
        String str4 = null;
        int i10 = 0;
        if (str2 == null) {
            str3 = str;
        } else {
            String strD = oe.b.d(str2, false);
            TLRPC.TL_contact tL_contact = contactsController.contactsByPhone.get(strD);
            if (tL_contact == null) {
                tL_contact = contactsController.contactsByShortPhone.get(strD.substring(Math.max(0, strD.length() - 7)));
            }
            if (tL_contact == null) {
                str3 = str;
            } else {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(tL_contact.user_id));
                if (user2 == null || user2.self) {
                    str3 = null;
                } else {
                    arrayList2.add(tL_contact);
                    str3 = str;
                }
            }
        }
        if (arrayList2.isEmpty() && str3 != null) {
            String lowerCase = str3.trim().toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                String[] strArr = {lowerCase, translitString};
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList.get(i11);
                    if (tL_contact2 != null && (user = messagesController.getUser(Long.valueOf(tL_contact2.user_id))) != null && !user.self) {
                        int i12 = 3;
                        String[] strArr2 = new String[3];
                        strArr2[i10] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[i10]);
                        strArr2[1] = translitString2;
                        if (strArr2[i10].equals(translitString2)) {
                            strArr2[1] = str4;
                        }
                        if (UserObject.isReplyUser(user)) {
                            strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                        } else if (user.self) {
                            strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                        }
                        int i13 = 0;
                        boolean z10 = false;
                        while (i13 < 2) {
                            String str5 = strArr[i13];
                            if (str5 != null) {
                                while (i10 < i12) {
                                    String str6 = strArr2[i10];
                                    if (str6 != null && (str6.startsWith(str5) || str6.contains(" ".concat(str5)))) {
                                        z10 = true;
                                        break;
                                    }
                                    i10++;
                                    i12 = 3;
                                }
                                String publicUsername = UserObject.getPublicUsername(user);
                                if (!z10 && publicUsername != null && publicUsername.startsWith(str5)) {
                                    z10 = true;
                                }
                                if (z10) {
                                    arrayList2.add(tL_contact2);
                                    break;
                                }
                            }
                            i13++;
                            i10 = 0;
                            i12 = 3;
                        }
                    }
                    i11++;
                    str4 = null;
                    i10 = 0;
                }
            }
        }
        return arrayList2;
    }

    public final void M0() {
        String str;
        int i10;
        if (this.m0 == null) {
            return;
        }
        int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
        this.Y = connectionState;
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
        p80 p80Var = (connectionState == 1 || connectionState == 4) ? new p80(this, 5) : null;
        ActionBarLayout actionBarLayout = this.m0;
        actionBarLayout.C0 = str;
        actionBarLayout.D0 = i10;
        actionBarLayout.E0 = p80Var;
        for (int i11 = 0; i11 < actionBarLayout.K0.size(); i11++) {
            ((org.telegram.ui.ActionBar.n2) actionBarLayout.K0.get(i11)).setTitleOverlayText(actionBarLayout.C0, actionBarLayout.D0, p80Var);
        }
    }

    public final org.telegram.ui.ActionBar.b5 O() {
        ActionBarLayout actionBarLayout = this.m0;
        ArrayList arrayList = this.L;
        return !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.b5) i0.a.i(1, arrayList) : actionBarLayout;
    }

    public final org.telegram.ui.ActionBar.m3 P() {
        ActionBarLayout actionBarLayout = this.f35525o0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f35525o0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.m0;
        if (actionBarLayout2 == null || actionBarLayout2.getBottomSheetTabs() == null) {
            return null;
        }
        return this.m0.getBottomSheetTabs();
    }

    public final org.telegram.ui.ActionBar.n2 Q() {
        return ig0.j1(this.K, false).getInt("currentViewNum", 0) != 0 ? new ig0() : new l70();
    }

    public final int S() {
        return this.Z.size();
    }

    public final yg.e T() {
        return this.f35504c1;
    }

    public final boolean X(android.content.Intent r127, boolean r128, boolean r129, boolean r130, we.d r131, boolean r132, boolean r133) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.X(android.content.Intent, boolean, boolean, boolean, we.d, boolean, boolean):boolean");
    }

    public final void Y() {
        ActionMode actionMode = this.f35511g0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    @Override
    public final void a(float f10) {
        if (m4.I() && m4.x().R) {
            m4 m4VarX = m4.x();
            m4VarX.S();
            m4.g0(m4VarX);
            if (m4VarX.f40333b0 != null) {
                m4VarX.f40347q0[0].f41496b.f1();
                m4VarX.f40347q0[1].f41496b.f1();
                m4VarX.f40333b0.invalidate();
                m4VarX.m0.invalidate();
                if (f10 == 1.0f) {
                    m4VarX.f40347q0[0].f41497c.l();
                    m4VarX.f40347q0[1].f41497c.l();
                }
            }
        }
        if (PhotoViewer.C1()) {
            PhotoViewer.t1().u3();
        }
    }

    public final void a0() {
        long jB;
        long j10;
        long j11;
        rn rnVar;
        Boolean wasTablet = AndroidUtilities.getWasTablet();
        if (wasTablet == null) {
            return;
        }
        AndroidUtilities.resetWasTabletFlag();
        if (wasTablet.booleanValue() != AndroidUtilities.isTablet()) {
            boolean zBooleanValue = wasTablet.booleanValue();
            ArrayList arrayList = this.f35499a0;
            ArrayList arrayList2 = this.f35501b0;
            ArrayList arrayList3 = this.Z;
            if (zBooleanValue) {
                arrayList3.addAll(arrayList2);
                arrayList3.addAll(arrayList);
                arrayList2.clear();
                arrayList.clear();
                j10 = 0;
                jB = 0;
            } else {
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList2.clear();
                arrayList.clear();
                int size = arrayList4.size();
                long jA = 0;
                jB = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                    if (!(n2Var instanceof qg0)) {
                        if (n2Var instanceof gy) {
                            gy gyVar = (gy) n2Var;
                            if (gyVar.h4() && !gyVar.e4()) {
                                j11 = 0;
                                if (gyVar.T2 != 0) {
                                }
                            }
                            if (n2Var instanceof rn) {
                                rnVar = (rn) n2Var;
                                if (!rnVar.c()) {
                                    arrayList2.add(n2Var);
                                    if (jA == j11) {
                                        jA = rnVar.a();
                                        jB = rnVar.b();
                                    }
                                }
                            }
                            arrayList.add(n2Var);
                        }
                        j11 = 0;
                        if (n2Var instanceof rn) {
                            rnVar = (rn) n2Var;
                            if (!rnVar.c()) {
                                arrayList2.add(n2Var);
                                if (jA == j11) {
                                    jA = rnVar.a();
                                    jB = rnVar.b();
                                }
                            }
                        }
                        arrayList.add(n2Var);
                    }
                    arrayList3.add(n2Var);
                }
                j10 = jA;
            }
            A0();
            this.m0.U(true, true);
            if (AndroidUtilities.isTablet()) {
                this.f35525o0.U(true, true);
                this.f35523n0.U(true, true);
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    Object obj3 = (org.telegram.ui.ActionBar.n2) obj2;
                    if (obj3 instanceof qg0) {
                        obj3 = ((qg0) obj3).F;
                    }
                    if (obj3 instanceof gy) {
                        gy gyVar2 = (gy) obj3;
                        if (gyVar2.h4()) {
                            MessagesStorage.TopicKey topicKey = gyVar2.f38556l2;
                            topicKey.dialogId = j10;
                            topicKey.topicId = jB;
                            fy[] fyVarArr = gyVar2.f38498a0;
                            if (fyVarArr != null) {
                                for (fy fyVar : fyVarArr) {
                                    if (fyVar.p() && AndroidUtilities.isTablet()) {
                                        fyVar.d.f45858s = topicKey.dialogId;
                                    }
                                }
                                gyVar2.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.f35523n0) {
            this.f35525o0.U(z10, z10);
            this.m0.U(z10, z10);
        }
    }

    public final boolean c0(boolean z10) {
        org.telegram.ui.Components.fd0 fd0Var;
        org.telegram.ui.ActionBar.v3 v3Var;
        org.telegram.ui.ActionBar.b2 b2Var;
        boolean z11;
        vf.i iVar = h7.y7.f8587a;
        if (iVar == null) {
            fd0Var = this.f35541w0;
            if (fd0Var != null || fd0Var.f28378b.getVisibility() != 0) {
                v3Var = this.f35537u0;
                if (v3Var != null || !(z11 = v3Var.Q)) {
                    b2Var = org.telegram.ui.Components.um0.D;
                    if (b2Var != null) {
                        if (z10) {
                            b2Var.dismiss();
                            org.telegram.ui.Components.um0.D = null;
                            return false;
                        }
                    } else if (kt.f39853g0 == null && kt.q().E) {
                        if (z10) {
                            kt.q().o();
                            return false;
                        }
                    } else if (SecretMediaViewer.g() || !SecretMediaViewer.f().f36160s) {
                        if (PhotoViewer.C1() || !PhotoViewer.t1().Q1()) {
                            if (m4.I() || !m4.x().R) {
                                return true;
                            }
                            if (z10) {
                                m4.x().o(true, false);
                            }
                        } else if (z10) {
                            PhotoViewer.t1().G0(true, false);
                            return false;
                        }
                    } else if (z10) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (z10 && z11) {
                    v3Var.a(false);
                    return false;
                }
            } else if (z10) {
                finish();
                return false;
            }
        } else if (iVar.f48913s) {
            if (z10) {
                iVar.c(false);
            }
            fd0Var = this.f35541w0;
            if (fd0Var != null) {
                v3Var = this.f35537u0;
                if (v3Var != null) {
                    b2Var = org.telegram.ui.Components.um0.D;
                    if (b2Var != null) {
                        if (kt.f39853g0 == null) {
                            if (SecretMediaViewer.g()) {
                                if (PhotoViewer.C1()) {
                                    if (m4.I()) {
                                    }
                                    return true;
                                }
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (PhotoViewer.C1()) {
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (SecretMediaViewer.g()) {
                            if (PhotoViewer.C1()) {
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (PhotoViewer.C1()) {
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (m4.I()) {
                        }
                        return true;
                    }
                    if (z10) {
                        b2Var.dismiss();
                        org.telegram.ui.Components.um0.D = null;
                        return false;
                    }
                } else {
                    b2Var = org.telegram.ui.Components.um0.D;
                    if (b2Var != null) {
                        if (kt.f39853g0 == null) {
                            if (SecretMediaViewer.g()) {
                                if (PhotoViewer.C1()) {
                                    if (m4.I()) {
                                    }
                                    return true;
                                }
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (PhotoViewer.C1()) {
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (SecretMediaViewer.g()) {
                            if (PhotoViewer.C1()) {
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (PhotoViewer.C1()) {
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (m4.I()) {
                        }
                        return true;
                    }
                    if (z10) {
                        b2Var.dismiss();
                        org.telegram.ui.Components.um0.D = null;
                        return false;
                    }
                }
            } else {
                v3Var = this.f35537u0;
                if (v3Var != null) {
                    b2Var = org.telegram.ui.Components.um0.D;
                    if (b2Var != null) {
                        if (kt.f39853g0 == null) {
                            if (SecretMediaViewer.g()) {
                                if (PhotoViewer.C1()) {
                                    if (m4.I()) {
                                    }
                                    return true;
                                }
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (PhotoViewer.C1()) {
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (SecretMediaViewer.g()) {
                            if (PhotoViewer.C1()) {
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (PhotoViewer.C1()) {
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (m4.I()) {
                        }
                        return true;
                    }
                    if (z10) {
                        b2Var.dismiss();
                        org.telegram.ui.Components.um0.D = null;
                        return false;
                    }
                } else {
                    b2Var = org.telegram.ui.Components.um0.D;
                    if (b2Var != null) {
                        if (kt.f39853g0 == null) {
                            if (SecretMediaViewer.g()) {
                                if (PhotoViewer.C1()) {
                                    if (m4.I()) {
                                    }
                                    return true;
                                }
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (PhotoViewer.C1()) {
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (SecretMediaViewer.g()) {
                            if (PhotoViewer.C1()) {
                                if (m4.I()) {
                                }
                                return true;
                            }
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (PhotoViewer.C1()) {
                            if (m4.I()) {
                            }
                            return true;
                        }
                        if (m4.I()) {
                        }
                        return true;
                    }
                    if (z10) {
                        b2Var.dismiss();
                        org.telegram.ui.Components.um0.D = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void d0() {
        w5 w5Var = this.V0;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.V0 = null;
        }
        if (this.M) {
            return;
        }
        this.M = true;
        NotificationCenter.ObserversGroup observersGroup = this.f35516i1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f35516i1 = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.f35518j1;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.f35518j1 = null;
        }
        o90 o90Var = this.l1;
        if (o90Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(o90Var);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.ec ecVarQ;
        s50 s50Var;
        char c10;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean zBooleanValue;
        int iIntValue;
        Runnable runnable;
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        Runnable runnable2;
        ActionBarLayout actionBarLayout3;
        int i12 = 0;
        z = false;
        z = false;
        boolean z11 = false;
        z = false;
        boolean z12 = false;
        int i13 = 1;
        if (i10 == NotificationCenter.appDidLogout) {
            while (true) {
                if (i12 >= 4) {
                    i12 = -1;
                    break;
                } else if (UserConfig.getInstance(i12).isClientActivated()) {
                    break;
                } else {
                    i12++;
                }
            }
            org.telegram.ui.Components.oz0 oz0Var = this.f35544y0;
            if (oz0Var != null) {
                oz0Var.setVisibility(8);
            }
            if (i12 != -1) {
                K0(i12);
                return;
            }
            a31.V(true);
            J();
            this.m0.W();
            if (AndroidUtilities.isTablet()) {
                this.f35523n0.W();
                this.f35525o0.W();
            }
            l70 l70Var = new l70();
            l70Var.J = true;
            p0(l70Var);
            return;
        }
        if (i10 == NotificationCenter.openBoostForUsersDialog) {
            Long l10 = (Long) objArr[0];
            l10.getClass();
            s0(l10, null, null, objArr.length > 1 ? (org.telegram.ui.Cells.s1) objArr[1] : null);
            return;
        }
        if (i10 == NotificationCenter.closeOtherAppActivities) {
            if (objArr[0] != this) {
                d0();
                finish();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(i11).getConnectionState();
            if (this.Y != connectionState) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("switch to state " + connectionState);
                }
                this.Y = connectionState;
                M0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mainUserInfoChanged || i10 == NotificationCenter.attachMenuBotsDidLoad) {
            return;
        }
        int i14 = 9;
        if (i10 == NotificationCenter.needShowAlert) {
            Integer num = (Integer) objArr[0];
            if (num.intValue() != 6) {
                if (num.intValue() != 3 || this.B0 == null) {
                    if (num.intValue() == 4) {
                        H0(i11, (TLRPC.TL_help_termsOfService) objArr[1]);
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = !this.Z.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.i(1, this.Z) : null;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                    if (n2Var != null) {
                        HashMap map = new HashMap();
                        int i15 = org.telegram.ui.ActionBar.g6.L5;
                        map.put("info1", Integer.valueOf(n2Var.getThemedColor(i15)));
                        map.put("info2", Integer.valueOf(n2Var.getThemedColor(i15)));
                        alertDialog$Builder.m(R.raw.not_available, 52, n2Var.getThemedColor(i15), map);
                        alertDialog$Builder.f22702a.S = true;
                    }
                    if (num.intValue() != 2 && num.intValue() != 3) {
                        alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new cg.p2(this, i11, i14));
                    }
                    if (num.intValue() == 5) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.NobodyLikesSpam3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    } else if (num.intValue() == 0) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.NobodyLikesSpam1);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    } else if (num.intValue() == 1) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.NobodyLikesSpam2);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    } else if (num.intValue() == 2) {
                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf((String) objArr[1]);
                        String str = (String) objArr[2];
                        if (str.startsWith("PREMIUM_GIFT_SELF_REQUIRED_")) {
                            String str2 = (String) objArr[1];
                            int iIndexOf = str2.indexOf(42);
                            int i16 = iIndexOf + 1;
                            int iIndexOf2 = str2.indexOf(42, i16);
                            if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf != iIndexOf2) {
                                spannableStringBuilderValueOf.replace(iIndexOf, iIndexOf2 + 1, (CharSequence) str2.substring(i16, iIndexOf2));
                                spannableStringBuilderValueOf.setSpan(new ag.x0(this, 7), iIndexOf, iIndexOf2 - 1, 33);
                            }
                        }
                        alertDialog$Builder.f22702a.P = spannableStringBuilderValueOf;
                        if (str.startsWith("AUTH_KEY_DROP_")) {
                            alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.h(LocaleController.getString(R.string.LogOut), new w90(this));
                        } else if (str.startsWith("PREMIUM_")) {
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.TelegramPremium);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        } else {
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        }
                    } else if (num.intValue() == 3) {
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Proxy);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.UseProxyTelegramError);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        this.B0 = B0(alertDialog$Builder);
                        return;
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.wasUnableToFindCurrentLocation) {
            HashMap map2 = (HashMap) objArr[0];
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            alertDialog$Builder2.l(LocaleController.getString(R.string.AppName));
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder2.h(LocaleController.getString(R.string.ShareYouLocationUnableManually), new c3.d(this, map2, i11, i14));
            alertDialog$Builder2.g(LocaleController.getString(R.string.ShareYouLocationUnable));
            if (this.Z.isEmpty()) {
                return;
            }
            ((org.telegram.ui.ActionBar.n2) i0.a.i(1, this.Z)).showDialog(alertDialog$Builder2.a());
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.d51 d51Var = this.f35531r0;
            if (d51Var != null) {
                d51Var.V(org.telegram.ui.ActionBar.g6.r0());
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didSetPasscode) {
            this.f35500a1.invalidate();
            return;
        }
        if (i10 == NotificationCenter.reloadInterface) {
            boolean z13 = this.Z.size() > 1 && (i0.a.i(1, this.Z) instanceof ProfileActivity);
            u0((!z13 || ((ProfileActivity) i0.a.i(1, this.Z)).h4()) ? z13 : false);
            return;
        }
        if (i10 == NotificationCenter.suggestedLangpack) {
            E0();
            return;
        }
        if (i10 == NotificationCenter.openArticle) {
            if (this.Z.isEmpty()) {
                return;
            }
            LaunchActivity launchActivity = C1;
            if (launchActivity == null || launchActivity.P() == null || C1.P().m((TLRPC.TL_webPage) objArr[0]) == null) {
                ((org.telegram.ui.ActionBar.n2) i0.a.i(1, this.Z)).createArticleViewer(false).N(null, (TLRPC.TL_webPage) objArr[0], (String) objArr[1], null);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.hasNewContactsToImport) {
            ActionBarLayout actionBarLayout4 = this.m0;
            if (actionBarLayout4 == null || actionBarLayout4.getFragmentStack().isEmpty()) {
                return;
            }
            ((Integer) objArr[0]).getClass();
            HashMap map3 = (HashMap) objArr[1];
            boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[3]).booleanValue();
            org.telegram.ui.ActionBar.n2 n2Var2 = this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1);
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this);
            alertDialog$Builder3.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.L5), null);
            alertDialog$Builder3.l(LocaleController.getString(R.string.UpdateContactsTitle));
            alertDialog$Builder3.g(LocaleController.getString(R.string.UpdateContactsMessage));
            alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new i80(i11, map3, zBooleanValue2, zBooleanValue3, 1));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new i80(i11, map3, zBooleanValue2, zBooleanValue3, 2));
            alertDialog$Builder3.f22702a.f22767s0 = new i80(i11, map3, zBooleanValue2, zBooleanValue3, 0);
            org.telegram.ui.ActionBar.b2 b2VarA = alertDialog$Builder3.a();
            n2Var2.showDialog(b2VarA);
            b2VarA.setCanceledOnTouchOutside(false);
            return;
        }
        if (i10 == NotificationCenter.didSetNewTheme) {
            if (!((Boolean) objArr[0]).booleanValue()) {
                try {
                    setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23322s8) | (-16777216)));
                } catch (Exception unused) {
                }
            }
            boolean zBooleanValue4 = objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : true;
            boolean z14 = objArr.length > 2 && ((Boolean) objArr[2]).booleanValue();
            if (zBooleanValue4 && !this.S0 && !this.m0.A()) {
                z11 = true;
            }
            H(z14, true, z11);
            return;
        }
        if (i10 == NotificationCenter.needSetDayNightTheme) {
            if (objArr[2] != null) {
                if (this.f35519k0.getVisibility() == 0) {
                    return;
                }
                try {
                    int[] iArr = (int[]) objArr[2];
                    boolean zBooleanValue5 = ((Boolean) objArr[4]).booleanValue();
                    org.telegram.ui.Components.ri0 ri0Var = (org.telegram.ui.Components.ri0) objArr[5];
                    if (objArr.length > 8) {
                        ((Boolean) objArr[8]).getClass();
                    }
                    int measuredWidth = this.f35539v0.getMeasuredWidth();
                    int measuredHeight = this.f35539v0.getMeasuredHeight();
                    if (!zBooleanValue5 && ri0Var != null) {
                        ri0Var.setVisibility(4);
                    }
                    this.C0 = null;
                    if (objArr.length > 6) {
                        this.C0 = (View) objArr[6];
                    }
                    this.S0 = true;
                    Z(this.f35539v0);
                    View view = this.C0;
                    if (view != null && view.getBackground() != null) {
                        this.C0.getBackground().setAlpha(0);
                    }
                    Bitmap bitmapFromWindow = Build.VERSION.SDK_INT >= 26 ? AndroidUtilities.getBitmapFromWindow(getWindow()) : null;
                    if (bitmapFromWindow == null) {
                        bitmapFromWindow = AndroidUtilities.snapshotView(this.f35539v0);
                    }
                    View view2 = this.C0;
                    if (view2 == null || view2.getBackground() == null) {
                        c10 = 3;
                    } else {
                        c10 = 3;
                        try {
                            this.C0.getBackground().setAlpha(255);
                        } catch (Throwable th) {
                            th = th;
                            FileLog.e(th);
                            try {
                                this.f35519k0.setImageDrawable(null);
                                this.f35533s0.removeView(this.f35519k0);
                                gy.f38494t4 = false;
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            z10 = false;
                        }
                    }
                    this.f35533s0.removeView(this.f35519k0);
                    this.f35519k0 = new ImageView(this);
                    org.telegram.ui.Components.oi0 animatedDrawable = ri0Var != null ? ri0Var.getAnimatedDrawable() : null;
                    this.f35521l0.setImageDrawable(animatedDrawable);
                    if (zBooleanValue5) {
                        this.f35533s0.addView(this.f35519k0, 0, h7.z5.c(-1.0f, -1));
                        this.f35521l0.setVisibility(8);
                    } else {
                        this.f35533s0.addView(this.f35519k0, 1, h7.z5.c(-1.0f, -1));
                        this.f35521l0.setTranslationX(iArr[0] - AndroidUtilities.dp(24.0f));
                        this.f35521l0.setTranslationY(iArr[1] - AndroidUtilities.dp(24.0f));
                        this.f35521l0.setVisibility(0);
                        this.f35521l0.invalidate();
                    }
                    this.f35519k0.setImageBitmap(bitmapFromWindow);
                    this.f35519k0.setVisibility(0);
                    int i17 = measuredWidth - iArr[0];
                    int i18 = measuredHeight - iArr[1];
                    double dSqrt = Math.sqrt((i18 * i18) + (i17 * i17));
                    int i19 = iArr[0];
                    int i20 = measuredHeight - iArr[1];
                    float fMax = (float) Math.max(dSqrt, Math.sqrt((i20 * i20) + (i19 * i19)));
                    int i21 = measuredWidth - iArr[0];
                    int i22 = iArr[1];
                    double dSqrt2 = Math.sqrt((i22 * i22) + (i21 * i21));
                    int i23 = iArr[0];
                    int i24 = iArr[1];
                    float fMax2 = Math.max(fMax, (float) Math.max(dSqrt2, Math.sqrt((i24 * i24) + (i23 * i23))));
                    View view3 = zBooleanValue5 ? this.f35539v0 : this.f35519k0;
                    int i25 = iArr[0];
                    int i26 = iArr[1];
                    float f10 = zBooleanValue5 ? 0.0f : fMax2;
                    if (!zBooleanValue5) {
                        fMax2 = 0.0f;
                    }
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view3, i25, i26, f10, fMax2);
                    animatorCreateCircularReveal.setDuration(400L);
                    animatorCreateCircularReveal.setInterpolator(org.telegram.ui.Components.ws.f34319e);
                    animatorCreateCircularReveal.addListener(new la0(this, ri0Var, animatedDrawable, zBooleanValue5));
                    if (this.C0 != null) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new n80(this, i12));
                        valueAnimatorOfFloat.setDuration(animatorCreateCircularReveal.getDuration());
                        valueAnimatorOfFloat.start();
                    }
                    AndroidUtilities.runOnUIThread(new p80(this, i13), zBooleanValue5 ? (measuredHeight - iArr[1]) / AndroidUtilities.dp(2.25f) : 50L);
                    animatorCreateCircularReveal.start();
                    z10 = true;
                } catch (Throwable th2) {
                    th = th2;
                    c10 = 3;
                }
                f6Var = (org.telegram.ui.ActionBar.f6) objArr[0];
                zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                iIntValue = ((Integer) objArr[c10]).intValue();
                if (objArr.length > 7) {
                    runnable = (Runnable) objArr[7];
                } else {
                    runnable = null;
                }
                actionBarLayout = this.m0;
                if (actionBarLayout == null) {
                    return;
                }
                actionBarLayout.g(f6Var, iIntValue, zBooleanValue, z10, runnable);
                if (AndroidUtilities.isTablet()) {
                    actionBarLayout2 = this.f35523n0;
                    if (actionBarLayout2 != null) {
                        runnable2 = null;
                        actionBarLayout2.f(new org.telegram.ui.ActionBar.a5(f6Var, iIntValue, zBooleanValue, z10), null);
                    } else {
                        runnable2 = null;
                    }
                    actionBarLayout3 = this.f35525o0;
                    if (actionBarLayout3 != null) {
                        actionBarLayout3.f(new org.telegram.ui.ActionBar.a5(f6Var, iIntValue, zBooleanValue, z10), runnable2);
                        return;
                    }
                    return;
                }
                return;
            }
            c10 = 3;
            gy.f38494t4 = false;
            z10 = false;
            f6Var = (org.telegram.ui.ActionBar.f6) objArr[0];
            zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            iIntValue = ((Integer) objArr[c10]).intValue();
            if (objArr.length > 7) {
                runnable = (Runnable) objArr[7];
            } else {
                runnable = null;
            }
            actionBarLayout = this.m0;
            if (actionBarLayout == null) {
                return;
            }
            actionBarLayout.g(f6Var, iIntValue, zBooleanValue, z10, runnable);
            if (AndroidUtilities.isTablet()) {
                actionBarLayout2 = this.f35523n0;
                if (actionBarLayout2 != null) {
                    runnable2 = null;
                    actionBarLayout2.f(new org.telegram.ui.ActionBar.a5(f6Var, iIntValue, zBooleanValue, z10), null);
                } else {
                    runnable2 = null;
                }
                actionBarLayout3 = this.f35525o0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.f(new org.telegram.ui.ActionBar.a5(f6Var, iIntValue, zBooleanValue, z10), runnable2);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.needShowPlayServicesAlert) {
            try {
                ((Status) objArr[0]).c(this, 140);
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        if (i10 == NotificationCenter.fileLoaded) {
            String str3 = (String) objArr[0];
            String str4 = this.L0;
            if (str4 == null) {
                String str5 = this.M0;
                if (str5 == null || !str5.equals(str3)) {
                    return;
                }
                this.M0 = null;
                File file = (File) objArr[1];
                if (!this.Q0) {
                    Utilities.globalQueue.postRunnable(new lq(this, this.O0, file, 16));
                    return;
                } else {
                    n0(this.P0, this.N0, this.O0);
                    h0();
                    return;
                }
            }
            if (str4.equals(str3)) {
                this.L0 = null;
                File file2 = new File(ApplicationLoader.getFilesDirFixed(), a9.p.o(new StringBuilder("remote"), this.P0.f22517id, ".attheme"));
                TLRPC.TL_theme tL_theme = this.P0;
                org.telegram.ui.ActionBar.f6 f6VarK0 = org.telegram.ui.ActionBar.g6.k0(file2, tL_theme.title, tL_theme);
                if (f6VarK0 != null) {
                    if (f6VarK0.f22945c != null && !new File(f6VarK0.f22945c).exists()) {
                        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = f6VarK0.f22948e;
                        getwallpaper.wallpaper = tL_inputWallPaperSlug;
                        ConnectionsManager.getInstance(f6VarK0.A).sendRequest(getwallpaper, new v80(i12, this, f6VarK0));
                        return;
                    }
                    TLRPC.TL_theme tL_theme2 = this.P0;
                    org.telegram.ui.ActionBar.f6 f6VarU = org.telegram.ui.ActionBar.g6.u(file2, tL_theme2.title, tL_theme2, true);
                    if (f6VarU != null) {
                        p0(new nc1(f6VarU, true, 0, false, false));
                    }
                }
                h0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoadFailed) {
            String str6 = (String) objArr[0];
            if (str6.equals(this.L0) || str6.equals(this.M0)) {
                h0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.screenStateChanged) {
            if (ApplicationLoader.mainInterfacePaused) {
                return;
            }
            if (ApplicationLoader.isScreenOn) {
                g0();
                return;
            } else {
                f0();
                return;
            }
        }
        if (i10 == NotificationCenter.needCheckSystemBarColors) {
            if (objArr.length > 0 && ((Boolean) objArr[0]).booleanValue()) {
                z12 = true;
            }
            G(z12);
            return;
        }
        if (i10 == NotificationCenter.historyImportProgressChanged) {
            if (objArr.length <= 1 || this.Z.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.y4.f0(this.K, (TLRPC.TL_error) objArr[2], (org.telegram.ui.ActionBar.n2) i0.a.i(1, this.Z), (TLObject) objArr[1], new Object[0]);
            return;
        }
        if (i10 == NotificationCenter.billingConfirmPurchaseError) {
            org.telegram.ui.Components.y4.f0(this.K, (TLRPC.TL_error) objArr[1], (org.telegram.ui.ActionBar.n2) i0.a.i(1, this.Z), (TLObject) objArr[0], new Object[0]);
            return;
        }
        if (i10 == NotificationCenter.stickersImportComplete) {
            MediaDataController.getInstance(i11).toggleStickerSet(this, (TLObject) objArr[0], 2, !this.Z.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.i(1, this.Z) : null, false, true);
            return;
        }
        if (i10 == NotificationCenter.showBulletin) {
            if (this.Z.isEmpty()) {
                return;
            }
            int iIntValue2 = ((Integer) objArr[0]).intValue();
            org.telegram.ui.ActionBar.c3 container = (!s50.A3 || (s50Var = s50.f42409z3) == null) ? null : s50Var.getContainer();
            org.telegram.ui.ActionBar.n2 n2Var3 = container == null ? (org.telegram.ui.ActionBar.n2) i0.a.i(1, this.Z) : null;
            switch (iIntValue2) {
                case 0:
                    TLRPC.Document document = (TLRPC.Document) objArr[1];
                    int iIntValue3 = ((Integer) objArr[2]).intValue();
                    org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(this, iIntValue3, document);
                    int i27 = (iIntValue3 == 6 || iIntValue3 == 7) ? 3500 : 1500;
                    if (n2Var3 == null) {
                        org.telegram.ui.Components.ec.f(container, kw0Var, i27).j();
                    } else {
                        org.telegram.ui.Components.ec.g(n2Var3, kw0Var, i27).j();
                    }
                    break;
                case 1:
                    if (n2Var3 == null) {
                        org.telegram.ui.Components.mc.Z(container, null).t((String) objArr[1], null).j();
                    } else {
                        org.telegram.ui.Components.mc.a0(n2Var3).t((String) objArr[1], null).j();
                    }
                    break;
                case 2:
                    (container != null ? org.telegram.ui.Components.mc.Z(container, null) : org.telegram.ui.Components.mc.a0(n2Var3)).t(LocaleController.getString(((Long) objArr[1]).longValue() > 0 ? R.string.YourBioChanged : R.string.ChannelDescriptionChanged), null).j();
                    break;
                case 3:
                    (container != null ? org.telegram.ui.Components.mc.Z(container, null) : org.telegram.ui.Components.mc.a0(n2Var3)).t(LocaleController.getString(((Long) objArr[1]).longValue() > 0 ? R.string.YourNameChanged : R.string.ChannelTitleChanged), null).j();
                    break;
                case 4:
                    if (n2Var3 == null) {
                        org.telegram.ui.Components.mc.Z(container, null).u((String) objArr[1], (String) objArr[2], null).j();
                    } else {
                        org.telegram.ui.Components.mc.a0(n2Var3).u((String) objArr[1], (String) objArr[2], n2Var3.getResourceProvider()).j();
                    }
                    break;
                case 5:
                    org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(this, (ta0) objArr[1]);
                    if (n2Var3 == null) {
                        org.telegram.ui.Components.ec.f(container, n6Var, 1500).j();
                    } else {
                        org.telegram.ui.Components.ec.g(n2Var3, n6Var, 1500).j();
                    }
                    break;
                case 6:
                    if (n2Var3 == null) {
                        org.telegram.ui.Components.mc.Z(container, null).T((String) objArr[1]).j();
                    } else {
                        org.telegram.ui.Components.mc.a0(n2Var3).T((String) objArr[1]).j();
                    }
                    break;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallUpdated) {
            I(false);
            return;
        }
        if (i10 == NotificationCenter.currentUserShowLimitReachedDialog) {
            if (this.Z.isEmpty()) {
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) i0.a.i(1, this.Z);
            if (n2Var4.getParentActivity() != null) {
                n2Var4.showDialog(new ag.i1(((Integer) objArr[0]).intValue(), this.K, n2Var4.getParentActivity(), n2Var4, null));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            MessagesController.getMainSettings(this.K).edit().remove("transcribeButtonPressed").apply();
            return;
        }
        if (i10 == NotificationCenter.requestPermissions) {
            int iIntValue4 = ((Integer) objArr[0]).intValue();
            String[] strArr = (iIntValue4 != 0 || Build.VERSION.SDK_INT < 31) ? null : new String[]{"android.permission.BLUETOOTH_CONNECT"};
            if (strArr != null) {
                int i28 = this.Y0 + 1;
                this.Y0 = i28;
                this.X0.put(i28, iIntValue4);
                e0.e.g(this, strArr, this.Y0);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatSwitchedForum) {
            long jLongValue = ((Long) objArr[0]).longValue();
            if (((Boolean) objArr[1]).booleanValue()) {
                wf.c.q(jLongValue, this.m0);
                return;
            }
            return;
        }
        int i29 = 14;
        if (i10 == NotificationCenter.tlSchemeParseException) {
            if (this.f35528p1 == null) {
                TLParseException tLParseException = (TLParseException) objArr[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tLParseException.getMessage());
                sb2.append("\n\n");
                sb2.append(AndroidUtilities.getBuildVersionInfo());
                StringBuilder sb3 = new StringBuilder();
                StringWriter stringWriter = new StringWriter();
                tLParseException.printStackTrace(new PrintWriter(stringWriter));
                sb3.append(AndroidUtilities.getBuildVersionInfo());
                sb3.append("\n\n");
                sb3.append(stringWriter);
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this, null);
                alertDialog$Builder4.l("TL Error");
                alertDialog$Builder4.g(sb2);
                alertDialog$Builder4.h(getString(R.string.Copy), new zt(sb3, i29));
                alertDialog$Builder4.k(getString(R.string.OK), null);
                alertDialog$Builder4.j(new q80(this, i13));
                org.telegram.ui.ActionBar.b2 b2VarO = alertDialog$Builder4.o();
                this.f35528p1 = b2VarO;
                b2VarO.setCanceledOnTouchOutside(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.memoryLeakFoundException) {
            if (i10 == NotificationCenter.guardBotDecisionResult) {
                BotGuardHelper.GuardBotDecisionResultNotification guardBotDecisionResultNotification = (BotGuardHelper.GuardBotDecisionResultNotification) objArr[0];
                org.telegram.ui.ActionBar.n2 n2VarR = R();
                org.telegram.ui.Components.mc mcVarA0 = n2VarR instanceof rn ? org.telegram.ui.Components.mc.a0(n2VarR) : org.telegram.ui.Components.mc.X();
                String shortName = DialogObject.getShortName(this.K, guardBotDecisionResultNotification.dialogId);
                TLRPC.JoinChatBotResult joinChatBotResult = guardBotDecisionResultNotification.result;
                if (joinChatBotResult instanceof TLRPC.TL_joinChatBotResultApproved) {
                    ecVarQ = mcVarA0.H(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotJoinRequestApproved, shortName)));
                } else if (joinChatBotResult instanceof TLRPC.TL_joinChatBotResultDeclined) {
                    ecVarQ = mcVarA0.H(R.raw.e_hand_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotJoinRequestDeclined, shortName)));
                } else {
                    ecVarQ = joinChatBotResult instanceof TLRPC.TL_joinChatBotResultQueued ? mcVarA0.Q(R.raw.timer_toast, 24, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotJoinRequestQueued, shortName))) : null;
                }
                AndroidUtilities.runOnUIThread(new a30(i29, this, ecVarQ), 400L);
                return;
            }
            return;
        }
        if (this.f35530q1 == null) {
            Class cls = (Class) objArr[0];
            int iIntValue5 = ((Integer) objArr[1]).intValue();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(cls.toString());
            sb4.append('\n');
            sb4.append(iIntValue5);
            sb4.append('\n');
            sb4.append(AndroidUtilities.getBuildVersionInfo());
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(this, null);
            alertDialog$Builder5.l("Memory Leak Found");
            alertDialog$Builder5.g(sb4);
            alertDialog$Builder5.k(getString(R.string.OK), null);
            alertDialog$Builder5.j(new q80(this, 2));
            org.telegram.ui.ActionBar.b2 b2VarO2 = alertDialog$Builder5.o();
            this.f35530q1 = b2VarO2;
            b2VarO2.setCanceledOnTouchOutside(true);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void e0(Intent intent, we.d dVar) throws Throwable {
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
            w5 w5Var = new w5(this, 8);
            this.V0 = w5Var;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(w5Var, 1000L);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in 1000");
                }
            } else if (SharedConfig.autoLockIn != 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in " + ((((long) SharedConfig.autoLockIn) * 1000) + 1000));
                }
                AndroidUtilities.runOnUIThread(this.V0, (((long) SharedConfig.autoLockIn) * 1000) + 1000);
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
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (AndroidUtilities.isTablet()) {
            boolean z10 = n2Var instanceof gy;
            if (z10 || (n2Var instanceof qg0)) {
                boolean z11 = actionBarLayout != this.m0;
                if (z11 && z10 && !((gy) n2Var).h4()) {
                    z11 = false;
                }
                if (z11) {
                    this.m0.X();
                    this.m0.c(-1, n2Var);
                    this.f35523n0.X();
                    this.f35523n0.getView().setVisibility(8);
                    if (!this.K0 && this.f35525o0.getFragmentStack().isEmpty()) {
                        this.f35531r0.setVisibility(0);
                    }
                    return false;
                }
            } else {
                if ((n2Var instanceof rn) && !((rn) n2Var).c()) {
                    boolean z12 = this.K0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f35525o0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f35531r0.setVisibility(8);
                        this.f35525o0.X();
                        this.f35525o0.c(-1, n2Var);
                        if (!this.f35523n0.getFragmentStack().isEmpty()) {
                            while (this.f35523n0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f35523n0;
                                actionBarLayout4.a0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f35523n0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.m0)) {
                        actionBarLayout2.c(-1, n2Var);
                        if (!this.f35523n0.getFragmentStack().isEmpty()) {
                            while (this.f35523n0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f35523n0;
                                actionBarLayout5.a0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f35523n0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f35523n0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            i10 = -1;
                            break;
                        }
                        if (UserConfig.getInstance(i10).isClientActivated()) {
                            break;
                        }
                        i10++;
                    }
                    if ((n2Var instanceof ig0) && i10 == -1) {
                        this.f35531r0.setVisibility(0);
                        this.f35529q0.setBackgroundColor(0);
                    } else {
                        this.f35529q0.setBackgroundColor(2130706432);
                    }
                    this.f35523n0.c(-1, n2Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        org.telegram.ui.ActionBar.b2 b2Var = this.R0;
        if (b2Var != null) {
            try {
                b2Var.dismiss();
                this.R0 = null;
            } catch (Throwable th) {
                this.R0 = null;
                throw th;
            }
        }
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.L0 = null;
        this.P0 = null;
    }

    public final void i0(boolean z10) {
        ArrayList arrayList;
        String string;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("canSelectTopics", true);
        bundle.putInt("dialogsType", 3);
        bundle.putBoolean("allowSwitchAccount", true);
        ArrayList arrayList2 = this.W;
        if (arrayList2 == null) {
            bundle.putString("selectAlertString", LocaleController.getString(R.string.SendMessagesToText));
            bundle.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendMessagesToGroupText));
        } else if (arrayList2.size() != 1) {
            bundle.putString("selectAlertString", LocaleController.getString(R.string.SendMessagesToText));
            bundle.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
        }
        gy gyVar = new gy(bundle);
        gyVar.f38621y2 = this;
        if (this.N != null || ((arrayList = this.Q) != null && !arrayList.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.Q;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(rn.H7(this.Q, false, null));
            }
            String str = this.N;
            if (str != null) {
                arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L));
            }
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(this.P)) {
                    ((MediaController.PhotoEntry) arrayList3.get(0)).caption = this.P;
                }
                CharSequence charSequence = this.P;
                if (arrayList3.isEmpty()) {
                    gyVar.f38625z2 = null;
                } else {
                    gyVar.f38625z2 = arrayList3;
                    gyVar.A2 = null;
                    if (gyVar.f38615x1 != null) {
                        gyVar.l3(charSequence);
                    } else {
                        gyVar.R3 = charSequence;
                    }
                }
            }
        } else if (!TextUtils.isEmpty(this.P)) {
            CharSequence charSequence2 = this.P;
            int i10 = org.telegram.ui.Components.xp0.E;
            if (charSequence2 == null || charSequence2.length() == 0) {
                string = null;
            } else {
                try {
                    Matcher matcher = AndroidUtilities.WEB_URL.matcher(charSequence2);
                    if (matcher.find()) {
                        string = charSequence2.subSequence(matcher.start(), matcher.end()).toString();
                    } else {
                        string = null;
                    }
                } catch (Exception unused) {
                }
            }
            if (string != null) {
                gyVar.E4(this.P, string);
            } else {
                CharSequence charSequence3 = this.P;
                if (charSequence3 == null || charSequence3.length() == 0) {
                    gyVar.B2 = null;
                } else {
                    gyVar.B2 = charSequence3;
                    gyVar.A2 = null;
                    gyVar.f38625z2 = null;
                    if (gyVar.f38615x1 != null) {
                        gyVar.l3(charSequence3);
                    } else {
                        gyVar.R3 = charSequence3;
                    }
                }
            }
        }
        ((ActionBarLayout) O()).S(gyVar, !AndroidUtilities.isTablet() ? this.m0.getFragmentStack().size() <= 1 || !(this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1) instanceof qg0) : this.f35523n0.getFragmentStack().isEmpty() || !(this.f35523n0.getFragmentStack().get(this.f35523n0.getFragmentStack().size() - 1) instanceof qg0), !z10);
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36160s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (m4.I() && m4.x().R) {
            m4.x().o(false, true);
        }
        lh.sb.x();
        s50 s50Var = s50.f42409z3;
        if (s50Var != null) {
            s50Var.dismiss();
        }
        if (z10 || !AndroidUtilities.isTablet()) {
            return;
        }
        this.m0.U(true, true);
        this.f35525o0.U(true, true);
    }

    @Override
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36160s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        }
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
            return true;
        }
        if (!m4.I() || !m4.x().R) {
            return false;
        }
        m4.x().o(true, false);
        return true;
    }

    public final void j0(TL_account.Password password) {
        String str;
        ig0 ig0Var = new ig0();
        p80 p80Var = new p80(this, 0);
        ig0Var.B = 3;
        ig0Var.f39079a = 12;
        ig0Var.Z = p80Var;
        if (password == null || (str = password.login_email_pattern) == null) {
            p0(ig0Var);
            return;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
        int iIndexOf = password.login_email_pattern.indexOf(42);
        int iLastIndexOf = password.login_email_pattern.lastIndexOf(42);
        if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
            org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
            xz0Var.f34734a |= 256;
            xz0Var.f34735b = iIndexOf;
            int i10 = iLastIndexOf + 1;
            xz0Var.f34736c = i10;
            spannableStringBuilderValueOf.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), iIndexOf, i10, 0);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.f22702a.N = spannableStringBuilderValueOf;
        alertDialog$Builder.f22702a.P = getString(R.string.EmailLoginChangeMessage);
        alertDialog$Builder.k(getString(R.string.ChangeEmail), new zr(16, this, ig0Var));
        alertDialog$Builder.h(getString(R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.m0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.f35514h1) {
                d0();
                finish();
                return false;
            }
            if (actionBarLayout == this.f35525o0) {
                if (!this.K0) {
                    this.f35531r0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f35523n0 && this.m0.getFragmentStack().isEmpty() && this.f35523n0.getFragmentStack().size() == 1) {
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
        if (num != null) {
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = MessagesController.getInstance(this.K).getInputChannel(-j10);
            tL_channels_getMessages.f22418id.add(num);
            ConnectionsManager.getInstance(this.K).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    Pattern pattern = LaunchActivity.f35496x1;
                    AndroidUtilities.runOnUIThread(new t80(this.f38718a, tLObject, num, num2, bArr, j10, runnable, str, i10, i11));
                }
            });
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j10);
        p0(we1.F0(this, bundle));
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.z4 z4Var) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        ActionBarLayout actionBarLayout4;
        int i10;
        ActionBarLayout actionBarLayout5;
        ActionBarLayout actionBarLayout6;
        org.telegram.ui.ActionBar.n2 n2Var = z4Var.f23999a;
        boolean z10 = z4Var.f24000b;
        boolean z11 = z4Var.f24001c;
        if (m4.I() && m4.x().R) {
            m4.x().o(false, true);
        }
        if (AndroidUtilities.isTablet()) {
            if (!(n2Var instanceof qg0)) {
                if (n2Var instanceof gy) {
                    gy gyVar = (gy) n2Var;
                    if (gyVar.h4() && actionBarLayout != (actionBarLayout2 = this.m0)) {
                        actionBarLayout2.X();
                        org.telegram.ui.ActionBar.b5 b5VarO = O();
                        z4Var.f24000b = z10;
                        z4Var.f24001c = z11;
                        z4Var.d = false;
                        ((ActionBarLayout) b5VarO).R(z4Var);
                        this.f35523n0.X();
                        this.f35523n0.getView().setVisibility(8);
                        if (!this.K0 && this.f35525o0.getFragmentStack().isEmpty()) {
                            this.f35531r0.setVisibility(0);
                            return false;
                        }
                    } else if (actionBarLayout != this.m0 || gyVar.getArguments() == null || (gyVar.getArguments().getInt("folderId", 0) != 1 && gyVar.getArguments().getLong("community_id", 0L) == 0)) {
                    }
                    return false;
                }
                if (n2Var instanceof rn) {
                    actionBarLayout4 = this.f35523n0;
                    if (actionBarLayout4 != null) {
                        actionBarLayout4.getView().setVisibility(0);
                        i10 = 0;
                        while (true) {
                            if (i10 >= 4) {
                                i10 = -1;
                                break;
                            }
                            if (UserConfig.getInstance(i10).isClientActivated()) {
                                break;
                                break;
                            }
                            i10++;
                        }
                        if (n2Var instanceof ig0) {
                            this.f35529q0.setBackgroundColor(2130706432);
                        } else {
                            this.f35529q0.setBackgroundColor(2130706432);
                        }
                        ActionBarLayout actionBarLayout7 = this.f35523n0;
                        z4Var.f24000b = z10;
                        z4Var.f24001c = z11;
                        z4Var.d = false;
                        actionBarLayout7.R(z4Var);
                        return false;
                    }
                } else {
                    actionBarLayout4 = this.f35523n0;
                    if (actionBarLayout4 != null) {
                        actionBarLayout4.getView().setVisibility(0);
                        i10 = 0;
                        while (true) {
                            if (i10 >= 4) {
                                i10 = -1;
                                break;
                            }
                            if (UserConfig.getInstance(i10).isClientActivated()) {
                                break;
                                break;
                            }
                            i10++;
                        }
                        if (n2Var instanceof ig0) {
                            this.f35529q0.setBackgroundColor(2130706432);
                        } else {
                            this.f35529q0.setBackgroundColor(2130706432);
                        }
                        ActionBarLayout actionBarLayout8 = this.f35523n0;
                        z4Var.f24000b = z10;
                        z4Var.f24001c = z11;
                        z4Var.d = false;
                        actionBarLayout8.R(z4Var);
                        return false;
                    }
                }
                return false;
            }
            ActionBarLayout actionBarLayout9 = this.m0;
            if (actionBarLayout != actionBarLayout9) {
                actionBarLayout9.X();
                org.telegram.ui.ActionBar.b5 b5VarO2 = O();
                z4Var.f24000b = z10;
                z4Var.f24001c = z11;
                z4Var.d = false;
                ((ActionBarLayout) b5VarO2).R(z4Var);
                this.f35523n0.X();
                this.f35523n0.getView().setVisibility(8);
                if (!this.K0 && this.f35525o0.getFragmentStack().isEmpty()) {
                    this.f35531r0.setVisibility(0);
                    return false;
                }
            } else if (((n2Var instanceof rn) || ((rn) n2Var).c()) && !z4Var.f24004g && (actionBarLayout != (actionBarLayout3 = this.f35525o0) || (actionBarLayout3.getFragmentStack().size() <= 1 && (this.f35525o0.getLastFragment() instanceof rn)))) {
                actionBarLayout4 = this.f35523n0;
                if (actionBarLayout4 != null && actionBarLayout != actionBarLayout4) {
                    actionBarLayout4.getView().setVisibility(0);
                    i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            i10 = -1;
                            break;
                        }
                        if (UserConfig.getInstance(i10).isClientActivated()) {
                            break;
                        }
                        i10++;
                    }
                    if ((n2Var instanceof ig0) || i10 != -1) {
                        this.f35529q0.setBackgroundColor(2130706432);
                    } else {
                        this.f35531r0.setVisibility(0);
                        this.f35529q0.setBackgroundColor(0);
                    }
                    ActionBarLayout actionBarLayout10 = this.f35523n0;
                    z4Var.f24000b = z10;
                    z4Var.f24001c = z11;
                    z4Var.d = false;
                    actionBarLayout10.R(z4Var);
                    return false;
                }
            } else {
                boolean z12 = this.K0;
                if ((!z12 && actionBarLayout == this.f35525o0) || (z12 && actionBarLayout == this.m0)) {
                    ActionBarLayout actionBarLayout11 = this.f35525o0;
                    if (actionBarLayout == actionBarLayout11) {
                        if (actionBarLayout11.getView() != null) {
                            this.f35525o0.getView().setVisibility(0);
                        }
                        this.f35531r0.setVisibility(8);
                    }
                    boolean z13 = (this.K0 && actionBarLayout == (actionBarLayout6 = this.m0) && actionBarLayout6.getFragmentStack().size() == 1) ? false : true;
                    if (!this.f35523n0.getFragmentStack().isEmpty()) {
                        while (this.f35523n0.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout12 = this.f35523n0;
                            actionBarLayout12.a0(actionBarLayout12.getFragmentStack().get(0), false);
                        }
                        this.f35523n0.l(!z11, false);
                    }
                    if (!z13) {
                        org.telegram.ui.ActionBar.b5 b5VarO3 = O();
                        z4Var.f24001c = z11;
                        z4Var.d = false;
                        ((ActionBarLayout) b5VarO3).R(z4Var);
                    }
                    return z13;
                }
                if (!z12 && actionBarLayout != (actionBarLayout5 = this.f35525o0) && actionBarLayout5 != null) {
                    if (actionBarLayout5.getView() != null) {
                        this.f35525o0.getView().setVisibility(0);
                    }
                    this.f35531r0.setVisibility(8);
                    this.f35525o0.X();
                    ActionBarLayout actionBarLayout13 = this.f35525o0;
                    z4Var.f24001c = true;
                    z4Var.f24000b = z10;
                    z4Var.d = false;
                    actionBarLayout13.R(z4Var);
                    if (!this.f35523n0.getFragmentStack().isEmpty()) {
                        while (this.f35523n0.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout14 = this.f35523n0;
                            actionBarLayout14.a0(actionBarLayout14.getFragmentStack().get(0), false);
                        }
                        this.f35523n0.l(!z11, false);
                        return false;
                    }
                } else {
                    if (!z12 || actionBarLayout == this.m0) {
                        ActionBarLayout actionBarLayout15 = this.f35523n0;
                        if (actionBarLayout15 != null && actionBarLayout15.getFragmentStack() != null && !this.f35523n0.getFragmentStack().isEmpty()) {
                            while (this.f35523n0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout16 = this.f35523n0;
                                actionBarLayout16.a0(actionBarLayout16.getFragmentStack().get(0), false);
                            }
                            this.f35523n0.l(!z11, false);
                        }
                        org.telegram.ui.ActionBar.b5 b5VarO4 = O();
                        z4Var.f24000b = this.m0.getFragmentStack().size() > 1;
                        z4Var.f24001c = z11;
                        z4Var.d = false;
                        ((ActionBarLayout) b5VarO4).R(z4Var);
                        return false;
                    }
                    org.telegram.ui.ActionBar.b5 b5VarO5 = O();
                    z4Var.f24000b = this.m0.getFragmentStack().size() > 1;
                    z4Var.f24001c = z11;
                    z4Var.d = false;
                    ((ActionBarLayout) b5VarO5).R(z4Var);
                    if (!this.f35523n0.getFragmentStack().isEmpty()) {
                        while (this.f35523n0.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout17 = this.f35523n0;
                            actionBarLayout17.a0(actionBarLayout17.getFragmentStack().get(0), false);
                        }
                        this.f35523n0.l(!z11, false);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void l0(long[] jArr, boolean z10) {
        boolean z11;
        jh.b7 b7VarA;
        long[] jArr2 = jArr;
        int i10 = 0;
        while (true) {
            if (i10 >= jArr2.length) {
                z11 = true;
                break;
            }
            TLRPC.User user = MessagesController.getInstance(this.K).getUser(Long.valueOf(jArr2[i10]));
            if (user != null && !user.stories_hidden) {
                z11 = false;
                break;
            }
            i10++;
        }
        org.telegram.ui.ActionBar.n2 n2VarR = R();
        if (n2VarR == null) {
            return;
        }
        jh.s6 storiesController = MessagesController.getInstance(this.K).getStoriesController();
        ArrayList arrayList = new ArrayList(z11 ? storiesController.h : storiesController.f13960g);
        boolean z12 = z11;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!z12) {
            ArrayList arrayList4 = new ArrayList();
            for (int i11 = 0; i11 < jArr2.length; i11++) {
                TLRPC.User user2 = MessagesController.getInstance(this.K).getUser(Long.valueOf(jArr2[i11]));
                if (user2 == null || !user2.stories_hidden) {
                    arrayList4.add(Long.valueOf(jArr2[i11]));
                }
            }
            Object[] array = arrayList4.toArray();
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
            for (int iF = 0; iF < jArr2.length; iF = com.google.android.recaptcha.internal.a.f(jArr2[iF], arrayList3, iF, 1)) {
            }
        } else {
            for (int iF2 = 0; iF2 < jArr2.length; iF2 = com.google.android.recaptcha.internal.a.f(jArr2[iF2], arrayList2, iF2, 1)) {
            }
        }
        if (!arrayList3.isEmpty() && z10) {
            MessagesController messagesController = MessagesController.getInstance(this.K);
            int[] iArr = {arrayList3.size()};
            lq lqVar = new lq(this, iArr, jArr2, 18);
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                long jLongValue = ((Long) arrayList3.get(i13)).longValue();
                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                TLRPC.InputPeer inputPeer = messagesController.getInputPeer(jLongValue);
                tL_stories_getPeerStories.peer = inputPeer;
                if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
                    iArr[0] = iArr[0] - 1;
                } else if (inputPeer == null) {
                    iArr[0] = iArr[0] - 1;
                } else {
                    ConnectionsManager.getInstance(this.K).sendRequest(tL_stories_getPeerStories, new cg.c0(messagesController, jLongValue, lqVar, 6));
                }
            }
            return;
        }
        long clientUserId = UserConfig.getInstance(this.K).getClientUserId();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i14)).peer);
            if (peerDialogId != clientUserId && !arrayList2.contains(Long.valueOf(peerDialogId)) && storiesController.J(peerDialogId)) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (n2VarR instanceof gy) {
            try {
                b7VarA = jh.b7.a(((gy) n2VarR).A0.h);
            } catch (Exception unused) {
                b7VarA = null;
            }
        } else {
            b7VarA = null;
        }
        jh.b7 b7Var = b7VarA;
        n2VarR.getOrCreateStoryViewer().v();
        n2VarR.getOrCreateStoryViewer().F(this, null, arrayList2, 0, null, null, b7Var, false);
    }

    public final void m0(final int i10, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        jh.j6 j6Var;
        jh.j6 j6VarA;
        MessageObject messageObjectF;
        MessageObject messageObjectF2;
        TL_stories.StoryItem storyItem2;
        jh.s6 storiesController = MessagesController.getInstance(this.K).getStoriesController();
        TL_stories.PeerStories peerStoriesY = storiesController.y(j10);
        jh.b7 b7VarA = null;
        if (peerStoriesY != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= peerStoriesY.stories.size()) {
                    storyItem2 = null;
                    break;
                } else {
                    if (peerStoriesY.stories.get(i11).f22617id == i10) {
                        storyItem2 = peerStoriesY.stories.get(i11);
                        break;
                    }
                    i11++;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j10;
                org.telegram.ui.ActionBar.n2 n2VarR = R();
                if (n2VarR == null) {
                    return;
                }
                if (n2VarR instanceof gy) {
                    try {
                        b7VarA = jh.b7.a(((gy) n2VarR).A0.h);
                    } catch (Exception unused) {
                    }
                }
                n2VarR.getOrCreateStoryViewer().v();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem2.dialogId));
                if (z10) {
                    n2VarR.getOrCreateStoryViewer().f13507s1 = true;
                }
                n2VarR.getOrCreateStoryViewer().F(this, storyItem2, arrayList, 0, null, peerStoriesY, b7VarA, false);
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            jh.j6 j6VarA2 = storiesController.A(j10, 0, -1, true);
            if (j6VarA2 == null || (messageObjectF2 = j6VarA2.f(i10)) == null) {
                j6Var = null;
            } else {
                storyItem = messageObjectF2.storyItem;
                j6Var = j6VarA2;
            }
            if (storyItem == null && (j6VarA = storiesController.A(j10, 1, -1, true)) != null && (messageObjectF = j6VarA.f(i10)) != null) {
                storyItem = messageObjectF.storyItem;
                j6Var = j6VarA;
            }
            if (storyItem != null && j6Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.n2 n2VarR2 = R();
                if (n2VarR2 == null) {
                    return;
                }
                if (n2VarR2 instanceof gy) {
                    try {
                        b7VarA = jh.b7.a(((gy) n2VarR2).A0.h);
                    } catch (Exception unused2) {
                    }
                }
                jh.b7 b7Var = b7VarA;
                n2VarR2.getOrCreateStoryViewer().v();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    n2VarR2.getOrCreateStoryViewer().f13507s1 = true;
                }
                n2VarR2.getOrCreateStoryViewer().F(this, storyItem, arrayList2, 0, j6Var, null, b7Var, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.K).getInputPeer(j10);
        tL_stories_getStoriesByID.f22624id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(this.K).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.cg(this.f43168a, tLObject, i10, j10, z10));
            }
        });
    }

    public final void n0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10 = f6Var.f22944b0;
        org.telegram.ui.ActionBar.e6 e6VarF = f6Var.f(tL_theme, this.K, 0);
        f6Var.V = f6Var.U;
        f6Var.u(e6VarF.f22883a);
        e6VarF.f22899s = tL_wallPaper;
        p0(new nc1(f6Var, i10 != f6Var.f22944b0, 0, false, false));
    }

    public final void o0(final int i10, int i11, final TLRPC.Chat chat, final int i12, TLRPC.TL_forumTopic tL_forumTopic, final Runnable runnable, final String str, final Integer num, final byte[] bArr, final int i13, final ArrayList arrayList, final int i14) {
        final int i15;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        Bundle bundle;
        rn rnVar;
        ArrayList arrayList2;
        if (tL_forumTopic == null) {
            i15 = i11;
            tL_forumTopicFindTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.f22380id, i15);
        } else {
            i15 = i11;
            tL_forumTopicFindTopic = tL_forumTopic;
        }
        if (tL_forumTopicFindTopic == null) {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
            tL_messages_getForumTopicsByID.peer = MessagesController.getInstance(this.K).getInputPeer(-chat.f22380id);
            tL_messages_getForumTopicsByID.topics.add(Integer.valueOf(i15));
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    Pattern pattern = LaunchActivity.f35496x1;
                    final LaunchActivity launchActivity = this.f37675a;
                    final int i16 = i10;
                    final TLRPC.Chat chat2 = chat;
                    final int i17 = i15;
                    final int i18 = i12;
                    final Runnable runnable2 = runnable;
                    final String str2 = str;
                    final Integer num2 = num;
                    final byte[] bArr2 = bArr;
                    final int i19 = i13;
                    final ArrayList arrayList3 = arrayList;
                    final int i20 = i14;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.f35496x1;
                            LaunchActivity launchActivity2 = launchActivity;
                            launchActivity2.getClass();
                            if (tL_error == null) {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                a0.h hVar = new a0.h();
                                for (int i21 = 0; i21 < tL_messages_forumTopics.messages.size(); i21++) {
                                    hVar.k(tL_messages_forumTopics.messages.get(i21), tL_messages_forumTopics.messages.get(i21).f22401id);
                                }
                                int i22 = i16;
                                MessagesController.getInstance(i22).putUsers(tL_messages_forumTopics.users, false);
                                MessagesController.getInstance(i22).putChats(tL_messages_forumTopics.chats, false);
                                TopicsController topicsController = MessagesController.getInstance(i22).getTopicsController();
                                TLRPC.Chat chat3 = chat2;
                                topicsController.processTopics(chat3.f22380id, tL_messages_forumTopics.topics, hVar, false, 2, -1);
                                TopicsController topicsController2 = MessagesController.getInstance(i22).getTopicsController();
                                long j10 = chat3.f22380id;
                                int i23 = i17;
                                launchActivity2.o0(i22, i23, chat3, i18, topicsController2.findTopic(j10, i23), runnable2, str2, num2, bArr2, i19, arrayList3, i20);
                            }
                        }
                    });
                }
            });
            return;
        }
        ArrayList arrayList3 = this.Z;
        org.telegram.ui.ActionBar.n2 n2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList3) : null;
        if (n2Var instanceof rn) {
            rn rnVar2 = (rn) n2Var;
            if (rnVar2.a() == (-chat.f22380id) && rnVar2.f42017d4 && rnVar2.b() == tL_forumTopicFindTopic.f22432id) {
                if (str != null) {
                    rnVar2.mb(i12, i14, str);
                }
                rnVar2.M7 = num;
                rnVar2.Xa(i12, i13, true, 0, true, 0, null, null, null);
            } else {
                bundle = new Bundle();
                bundle.putLong("chat_id", chat.f22380id);
                if (i12 != tL_forumTopicFindTopic.f22432id) {
                    bundle.putInt("message_id", Math.max(1, i12));
                }
                if (num != null) {
                    bundle.putInt("task_id", num.intValue());
                }
                rnVar = new rn(bundle);
                if (arrayList.isEmpty()) {
                    TLRPC.Message message = new TLRPC.Message();
                    message.f22401id = 1;
                    message.action = new TLRPC.TL_messageActionChannelMigrateFrom();
                    arrayList2 = arrayList;
                    arrayList2.add(new MessageObject(i10, message, false, false));
                } else {
                    arrayList2 = arrayList;
                }
                rnVar.pb(arrayList2, chat, i12, tL_forumTopicFindTopic.read_inbox_max_id, tL_forumTopicFindTopic.read_outbox_max_id, tL_forumTopicFindTopic);
                if (i12 != tL_forumTopicFindTopic.f22432id) {
                    if (str != null) {
                        rnVar.mb(i12, i14, str);
                    } else {
                        rnVar.M7 = num;
                        rnVar.H7 = i12;
                    }
                    rnVar.Xa(i12, i13, true, 0, true, 0, null, null, null);
                }
                p0(rnVar);
            }
        } else {
            bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22380id);
            if (i12 != tL_forumTopicFindTopic.f22432id) {
                bundle.putInt("message_id", Math.max(1, i12));
            }
            if (num != null) {
                bundle.putInt("task_id", num.intValue());
            }
            rnVar = new rn(bundle);
            if (arrayList.isEmpty()) {
                TLRPC.Message message2 = new TLRPC.Message();
                message2.f22401id = 1;
                message2.action = new TLRPC.TL_messageActionChannelMigrateFrom();
                arrayList2 = arrayList;
                arrayList2.add(new MessageObject(i10, message2, false, false));
            } else {
                arrayList2 = arrayList;
            }
            rnVar.pb(arrayList2, chat, i12, tL_forumTopicFindTopic.read_inbox_max_id, tL_forumTopicFindTopic.read_outbox_max_id, tL_forumTopicFindTopic);
            if (i12 != tL_forumTopicFindTopic.f22432id) {
                if (str != null) {
                    rnVar.mb(i12, i14, str);
                } else {
                    rnVar.M7 = num;
                    rnVar.H7 = i12;
                }
                rnVar.Xa(i12, i13, true, 0, true, 0, null, null, null);
            }
            p0(rnVar);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f35511g0 == actionMode) {
            this.f35511g0 = null;
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.m0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f22688y;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.f22680s0 = false;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35525o0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f22688y;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.f22680s0 = false;
                ActionBarLayout actionBarLayout3 = this.f35523n0;
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
        this.f35511g0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.m0.s(menu) && AndroidUtilities.isTablet() && !this.f35525o0.s(menu)) {
                this.f35523n0.s(menu);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.m0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f22688y;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.f22680s0 = true;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35525o0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f22688y;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.f22680s0 = true;
                ActionBarLayout actionBarLayout3 = this.f35523n0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f22688y;
                if (kVar3 != null) {
                    kVar3.setVisibility(8);
                }
                actionBarLayout3.f22680s0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        jh.e4 currentPeerView;
        org.telegram.ui.Components.w71 w71Var;
        VoIPService sharedInstance;
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onActivityResult");
            }
            UserConfig.getInstance(this.K).saveConfig(false);
        }
        if (i10 == 105) {
            if (Build.VERSION.SDK_INT >= 23) {
                boolean zCanDrawOverlays = Settings.canDrawOverlays(this);
                ApplicationLoader.canDrawOverlays = zCanDrawOverlays;
                if (zCanDrawOverlays) {
                    s50 s50Var = s50.f42409z3;
                    if (s50Var != null) {
                        s50Var.dismissInternal();
                    }
                    AndroidUtilities.runOnUIThread(new p80(this, 4), 200L);
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 520) {
            if (i11 != -1 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
            sharedInstance.createCaptureDevice(true);
            return;
        }
        if (i10 == 140) {
            LocationController.getInstance(this.K).startFusedLocationRequest(i11 == -1);
            return;
        }
        if (i10 == 521) {
            lh.n6 n6Var = this.f35522m1;
            if (n6Var != null) {
                n6Var.run(Boolean.valueOf(i11 == -1));
                this.f35522m1 = null;
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.f26549n;
        if (themeEditorView != null && (w71Var = themeEditorView.f26558k) != null) {
            w71Var.a(i10, i11, intent);
        }
        ActionBarLayout actionBarLayout = this.m0;
        if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
            org.telegram.ui.ActionBar.n2 n2Var = this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1);
            n2Var.onActivityResultFragment(i10, i11, intent);
            if (n2Var.getLastStoryViewer() != null && (currentPeerView = n2Var.getLastStoryViewer().f13487j0.getCurrentPeerView()) != null && i11 == -1) {
                if (i10 == 0 || i10 == 2) {
                    currentPeerView.t0();
                    jh.t2 t2Var = currentPeerView.E2;
                    if (t2Var != null) {
                        t2Var.f28650f0.g0(i10, intent, null);
                    }
                } else if (i10 == 21) {
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
                        jh.t2 t2Var2 = currentPeerView.E2;
                        if (t2Var2 != null) {
                            t2Var2.dismiss();
                        }
                        currentPeerView.k0(true);
                    }
                }
            }
        }
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout2 = this.f35525o0;
            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                this.f35525o0.getFragmentStack().get(this.f35525o0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
            }
            ActionBarLayout actionBarLayout3 = this.f35523n0;
            if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                this.f35523n0.getFragmentStack().get(this.f35523n0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
            }
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onActivityResultReceived, Integer.valueOf(i10), Integer.valueOf(i11), intent);
    }

    @Override
    public final void onBackPressed() {
        if (c0(true)) {
            if (!AndroidUtilities.isTablet()) {
                this.m0.G();
                return;
            }
            ActionBarLayout actionBarLayout = this.f35523n0;
            if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                this.f35523n0.G();
                return;
            }
            ActionBarLayout actionBarLayout2 = this.f35525o0;
            if (actionBarLayout2 == null || actionBarLayout2.getView().getVisibility() != 0 || this.f35525o0.getFragmentStack().isEmpty()) {
                this.m0.G();
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.f35525o0.getFragmentStack().get(this.f35525o0.getFragmentStack().size() - 1);
            if (n2Var.onBackPressed(true)) {
                n2Var.finishFragment();
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        this.f35517j0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        AndroidUtilities.resetTabletFlag();
        a0();
        F();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
        if (pipRoundVideoView != null) {
            int i10 = pipRoundVideoView.f26429x.getInt("sidex", 1);
            int i11 = pipRoundVideoView.f26429x.getInt("sidey", 0);
            float f10 = pipRoundVideoView.f26429x.getFloat("px", 0.0f);
            float f11 = pipRoundVideoView.f26429x.getFloat("py", 0.0f);
            pipRoundVideoView.v.x = PipRoundVideoView.b(true, i10, f10, pipRoundVideoView.h);
            pipRoundVideoView.v.y = PipRoundVideoView.b(false, i11, f11, pipRoundVideoView.f26425n);
            pipRoundVideoView.f26428w.updateViewLayout(pipRoundVideoView.f26420a, pipRoundVideoView.v);
        }
        org.telegram.ui.Components.fu fuVar = org.telegram.ui.Components.fu.O;
        if (fuVar != null) {
            fuVar.onConfigurationChanged(configuration);
        }
        cg.x xVar = cg.x.f2850e;
        if (xVar != null) {
            xVar.onConfigurationChanged(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.P8;
        ThemeEditorView themeEditorView = ThemeEditorView.f26549n;
        if (themeEditorView != null) {
            int i12 = themeEditorView.f26557j.getInt("sidex", 1);
            int i13 = themeEditorView.f26557j.getInt("sidey", 0);
            float f12 = themeEditorView.f26557j.getFloat("px", 0.0f);
            float f13 = themeEditorView.f26557j.getFloat("py", 0.0f);
            themeEditorView.f26555g.x = ThemeEditorView.b(true, i12, f12, themeEditorView.f26553e);
            themeEditorView.f26555g.y = ThemeEditorView.b(false, i13, f13, themeEditorView.f26554f);
            try {
                if (themeEditorView.f26550a.getParent() != null) {
                    themeEditorView.h.updateViewLayout(themeEditorView.f26550a, themeEditorView.f26555g);
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        if (org.telegram.ui.ActionBar.g6.f23244o == 3) {
            org.telegram.ui.ActionBar.g6.E(false);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) throws Throwable {
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        f35497y1 = true;
        f35498z1++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        C1 = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.K = UserConfig.selectedAccount;
        registerReceiver(this.f35502b1, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (!UserConfig.getInstance(this.K).isClientActivated() && (intent = getIntent()) != null && intent.getAction() != null) {
            if ("android.intent.action.SEND".equals(intent.getAction()) || "android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                super.onCreate(bundle);
                finish();
                return;
            } else if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null) {
                String lowerCase = data.toString().toLowerCase();
                if (!lowerCase.startsWith("tg:proxy") && !lowerCase.startsWith("tg://proxy") && !lowerCase.startsWith("tg:socks")) {
                    lowerCase.startsWith("tg://socks");
                }
            }
        }
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        int i10 = 0;
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23322s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        int i11 = 2;
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        getWindow().setFormat(-1);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new j70(i11));
        this.f35500a1 = flagSecureReason;
        flagSecureReason.attach();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            AndroidUtilities.isInMultiwindow = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.g6.N();
        org.telegram.ui.ActionBar.g6.R(this);
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        this.m0 = new ActionBarLayout(this, true);
        n0 n0Var = new n0(this, this, 10);
        this.f35533s0 = n0Var;
        n0Var.setClipToPadding(false);
        this.f35533s0.setClipChildren(false);
        setContentView(this.f35533s0);
        this.f35504c1 = new yg.e(this.f35533s0);
        na0 na0Var = new na0(this);
        m.t3 t3Var = this.f35515i0;
        ((ye.b) t3Var.f17474b).f49836a.add(na0Var);
        ((ViewGroup) getWindow().getDecorView()).addView(t3Var.b());
        t3Var.b().bringToFront();
        ImageView imageView = new ImageView(this);
        this.f35519k0 = imageView;
        imageView.setVisibility(8);
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this);
        this.f35539v0 = x3Var;
        x3Var.setActionBarLayout(this.m0);
        this.f35539v0.addOnLayoutChangeListener(new oa0());
        this.f35539v0.setClipChildren(false);
        this.f35539v0.setClipToPadding(false);
        this.f35533s0.addView(this.f35539v0, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.ce ceVar = new org.telegram.ui.Components.ce(this, 3);
        this.f35521l0 = ceVar;
        ceVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f35533s0.addView(this.f35521l0, h7.z5.c(48.0f, 48));
        this.f35521l0.setVisibility(8);
        n0 n0Var2 = this.f35533s0;
        org.telegram.ui.ActionBar.v3 v3Var = new org.telegram.ui.ActionBar.v3(this);
        this.f35537u0 = v3Var;
        n0Var2.addView(v3Var);
        n0 n0Var3 = this.f35533s0;
        pa0 pa0Var = new pa0(this);
        pa0Var.setVisibility(8);
        this.f35535t0 = pa0Var;
        n0Var3.addView(pa0Var);
        A0();
        this.f35539v0.setParentActionBarLayout(this.m0);
        this.m0.setDrawerLayoutContainer(this.f35539v0);
        this.m0.setFragmentStack(this.Z);
        this.m0.setFragmentStackChangedListener(new p80(this, i11));
        this.m0.setDelegate(this);
        org.telegram.ui.ActionBar.g6.j1(true);
        A();
        M0();
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i12 = NotificationCenter.closeOtherAppActivities;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i12, this);
        this.Y = ConnectionsManager.getInstance(this.K).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.f35518j1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f35518j1 = null;
        }
        this.f35518j1 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i12).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        o90 o90Var = new o90(this, i10);
        this.l1 = o90Var;
        LiteMode.addOnPowerSaverAppliedListener(o90Var);
        if (this.m0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f35523n0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (UserConfig.getInstance(this.K).isClientActivated()) {
                this.m0.c(-1, new qg0());
            } else {
                this.m0.c(-1, Q());
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
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.m0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    rn rnVar = new rn(bundle2);
                                    if (this.m0.c(-1, rnVar)) {
                                        rnVar.R7 = bundle.getString("path");
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    u60 u60Var = new u60(bundle2);
                                    if (this.m0.c(-1, u60Var)) {
                                        u60Var.restoreSelfArgs(bundle);
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    id idVar = new id(bundle2);
                                    if (this.m0.c(-1, idVar)) {
                                        idVar.restoreSelfArgs(bundle);
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", UserConfig.getInstance(this.K).clientUserId);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.m0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.m0.c(-1, new x71(null));
                                }
                                break;
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
        F();
        H(false, true, !this.S0);
        int i13 = 3;
        X(getIntent(), false, bundle != null, false, null, true, true);
        try {
            String str = Build.DISPLAY;
            String str2 = Build.USER;
            String lowerCase2 = str != null ? str.toLowerCase() : "";
            String lowerCase3 = str2 != null ? lowerCase2.toLowerCase() : "";
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("OS name " + lowerCase2 + " " + lowerCase3);
            }
            if ((lowerCase2.contains("flyme") || lowerCase3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                AndroidUtilities.incorrectDisplaySizeFix = true;
                View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                p90 p90Var = new p90(rootView, i10);
                this.f35503c0 = p90Var;
                viewTreeObserver.addOnGlobalLayoutListener(p90Var);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23) {
            FingerprintController.checkKeyReady();
        }
        if (i14 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000 && SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
            Pattern pattern = org.telegram.ui.Components.y4.f34802a;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String string2 = LocaleController.getString(R.string.AllowBackgroundActivity);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string2;
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(OneUIUtilities.isOneUI() ? i14 >= 31 ? R.string.AllowBackgroundActivityInfoOneUIAboveS : R.string.AllowBackgroundActivityInfoOneUIBelowS : R.string.AllowBackgroundActivityInfo));
            alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new org.telegram.ui.Components.f1(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            b2Var.setOnDismissListener(new lh.e1(i13));
            b2Var.show();
            SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
        }
        if (i14 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new qa0(this));
        }
        org.telegram.ui.Components.ec.a(this.f35533s0, new cg.w(14));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        a31.V(false);
        if (i14 >= 34) {
            if (this.f35510f1 == null) {
                this.f35510f1 = new ra0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f35510f1);
        } else if (i14 >= 33) {
            if (this.f35512g1 == null) {
                this.f35512g1 = new sa0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f35512g1);
        }
        B();
    }

    @Override
    public final void onDestroy() {
        gf.b0 b0Var;
        n0 n0Var;
        f35497y1 = false;
        f35498z1--;
        unregisterReceiver(this.f35502b1);
        if (f35498z1 == 0) {
            if (PhotoViewer.W8 != null) {
                PhotoViewer.W8.P0();
            }
            if (PhotoViewer.C1()) {
                PhotoViewer.t1().P0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer secretMediaViewerF = SecretMediaViewer.f();
                Runnable runnable = secretMediaViewerF.l1;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewerF.l1 = null;
                }
                gf.t0 t0Var = secretMediaViewerF.f36139h1;
                if (t0Var != null) {
                    t0Var.destroy();
                    secretMediaViewerF.f36139h1 = null;
                }
                NotificationCenter.getInstance(secretMediaViewerF.f36119a).removeObserver(secretMediaViewerF, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(secretMediaViewerF.f36119a).removeObserver(secretMediaViewerF, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(secretMediaViewerF.f36119a).removeObserver(secretMediaViewerF, NotificationCenter.didCreatedNewDeleteTask);
                secretMediaViewerF.f36160s = false;
                secretMediaViewerF.J = null;
                ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewerF.f36131e0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    secretMediaViewerF.f36131e0 = null;
                }
                secretMediaViewerF.i();
                if (secretMediaViewerF.f36122b != null && (n0Var = secretMediaViewerF.d) != null) {
                    try {
                        if (n0Var.getParent() != null) {
                            ((WindowManager) secretMediaViewerF.f36122b.getSystemService("window")).removeViewImmediate(secretMediaViewerF.d);
                        }
                        secretMediaViewerF.d = null;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                SecretMediaViewer.f36118t1 = null;
            }
            if (m4.I()) {
                m4.x().t();
            }
            if (kt.f39853g0 != null) {
                kt ktVarQ = kt.q();
                ktVarQ.E = false;
                ktVarQ.f39868l = null;
                ktVarQ.W = null;
                ktVarQ.Y = null;
                ktVarQ.f39855a0 = null;
                if (ktVarQ.f39878w != null && ktVarQ.f39880y != null) {
                    Bitmap bitmap = ktVarQ.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        ktVarQ.v = null;
                    }
                    ktVarQ.M = 0.0f;
                    ktVarQ.K = false;
                    try {
                        if (ktVarQ.f39880y.getParent() != null) {
                            ((WindowManager) ktVarQ.f39878w.getSystemService("window")).removeViewImmediate(ktVarQ.f39880y);
                        }
                        ktVarQ.f39880y = null;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    kt.f39853g0 = null;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
                }
            }
            s50 s50Var = s50.f42409z3;
            if (s50Var != null) {
                s50Var.dismissInternal();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i10 = org.telegram.ui.ActionBar.g6.f22993a;
            org.telegram.ui.Components.fu fuVar = org.telegram.ui.Components.fu.O;
            if (fuVar != null) {
                fuVar.H();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f26549n;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            vf.i iVar = h7.y7.f8587a;
            if (iVar != null) {
                iVar.f48909e.edit().putFloat("x", (float) iVar.f48908c.f19147u.f19154i).putFloat("y", (float) iVar.d.f19147u.f19154i).commit();
            }
            h7.y7.f8587a = null;
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.f35526o1, false);
        for (int i11 = 0; i11 < this.A0.size(); i11++) {
            try {
                if (((Dialog) this.A0.get(i11)).isShowing()) {
                    ((Dialog) this.A0.get(i11)).dismiss();
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        this.A0.clear();
        try {
            if (this.f35503c0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f35503c0);
            }
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (this.f35510f1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f35510f1);
            }
        } else if (i12 >= 33 && this.f35510f1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f35512g1);
        }
        org.telegram.ui.Components.ec.h(this.f35533s0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        d0();
        FlagSecureReason flagSecureReason = this.f35500a1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i12 < 24 || (b0Var = this.f35508e1) == null) {
            return;
        }
        b0Var.c();
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 82 && !SharedConfig.isWaitingForPasscodeEnter) {
            if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (m4.I() && m4.x().R) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (!AndroidUtilities.isTablet()) {
                this.m0.getView().onKeyUp(i10, keyEvent);
            } else if (this.f35523n0.getView().getVisibility() == 0 && !this.f35523n0.getFragmentStack().isEmpty()) {
                this.f35523n0.getView().onKeyUp(i10, keyEvent);
            } else if (this.f35525o0.getView().getVisibility() != 0 || this.f35525o0.getFragmentStack().isEmpty()) {
                this.m0.getView().onKeyUp(i10, keyEvent);
            } else {
                this.f35525o0.getView().onKeyUp(i10, keyEvent);
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.m0;
        if (actionBarLayout != null) {
            actionBarLayout.J();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35525o0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.J();
                }
                ActionBarLayout actionBarLayout3 = this.f35523n0;
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
    public final void onNewIntent(Intent intent) throws Throwable {
        super.onNewIntent(intent);
        X(intent, true, false, false, null, true, true);
    }

    @Override
    public final void onPause() {
        VoIPService sharedInstance;
        super.onPause();
        A1 = false;
        ye.b bVar = this.f35517j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (AndroidUtilities.isInPictureInPictureMode(bVar.d) && bVar.e() && Build.VERSION.SDK_INT >= 31) {
            bVar.b();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        Utilities.stageQueue.postRunnable(new nh.k2(this.K, 11));
        f0();
        this.m0.L();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.f35525o0;
            if (actionBarLayout != null) {
                actionBarLayout.L();
            }
            ActionBarLayout actionBarLayout2 = this.f35523n0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.L();
            }
        }
        org.telegram.ui.Components.fd0 fd0Var = this.f35541w0;
        if (fd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fd0Var.f28378b.N);
        }
        ArrayList arrayList = this.f35543x0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            AndroidUtilities.cancelRunOnUIThread(((org.telegram.ui.Components.dd0) obj).N);
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        ConnectionsManager.getInstance(this.K).setAppPaused(!(applicationLoader != null ? applicationLoader.onPause() : false), false);
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer photoViewerT1 = PhotoViewer.t1();
            if (photoViewerT1.f35632f2 != null) {
                photoViewerT1.G0(false, false);
            } else {
                org.telegram.ui.Components.m61 m61Var = photoViewerT1.B2;
                if (m61Var != null && photoViewerT1.V2) {
                    m61Var.O(AndroidUtilities.isInPictureInPictureMode(photoViewerT1.f35800y));
                }
            }
        }
        lh.sb sbVar = lh.sb.B2;
        if (sbVar != null) {
            sbVar.v(false);
            lh.ib ibVar = sbVar.Y0;
            if (ibVar != null) {
                ibVar.f16338f.r();
            }
            lh.hb hbVar = sbVar.T0;
            if (hbVar != null) {
                hbVar.x(0, true);
            }
        }
        lh1 lh1Var = lh1.f40088j1;
        if (lh1Var != null) {
            boolean zIsInteractive = ((PowerManager) lh1Var.f40092b.getSystemService("power")).isInteractive();
            int iA = bf.d.a(lh1Var.f40092b);
            boolean z10 = iA > 0;
            if (lh1Var.f40133z0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && iA == 2) {
                int measuredHeight = lh1.f40088j1.f40119q0.getMeasuredHeight();
                lh1 lh1Var2 = lh1.f40088j1;
                org.telegram.ui.Components.voip.l2.l(lh1Var2.f40092b, lh1Var2.f40089a, lh1Var2.f40119q0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = lh1.f40088j1.f40116n0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.l2.S = windowInsets.getSystemWindowInsetTop();
                    lh1.f40088j1.f40116n0.getSystemWindowInsetBottom();
                }
            }
            if (lh1Var.f40112j0 && ((!z10 || !zIsInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.l2.k() != null) {
                org.telegram.ui.Components.voip.l2 l2VarK = org.telegram.ui.Components.voip.l2.k();
                if (l2VarK.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (l2VarK.B) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap map = eh.j.f5499n;
        if (map == null) {
            return;
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            eh.i iVar = ((eh.j) it.next()).f5504f;
            if (iVar != null) {
                iVar.f5489b = true;
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        ye.b bVar = this.f35517j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (bVar.f49840f) {
            if (z10) {
                bVar.d(1.0f);
                bVar.f49843j.a();
                ArrayList arrayList = bVar.f49837b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ze.b) obj).getClass();
                }
                if (bVar.f49847n) {
                    bVar.f49847n = false;
                    bVar.f49845l.removeFrameCallback(bVar.f49846m);
                }
                ArrayList arrayList2 = bVar.f49836a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((ze.c) obj2).f();
                }
            } else if (bVar.f49839e) {
                bVar.c(false);
            } else {
                bVar.a(true);
            }
        }
        if (z10 || this.f35524n1) {
            return;
        }
        if (org.telegram.ui.Components.voip.g1.Z.R) {
            org.telegram.ui.Components.voip.g1.j();
        }
        if (jh.i1.V.O) {
            jh.i1.j();
        }
        if (org.telegram.ui.Components.sf0.f32415l0.L) {
            org.telegram.ui.Components.sf0.j(false);
        }
        s50.t1(this, null, false, true);
        if (PhotoViewer.W8 != null) {
            PhotoViewer.W8.P0();
        }
        if (PhotoViewer.C1()) {
            PhotoViewer.t1().G0(false, false);
        }
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        ye.b bVar = this.f35517j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        bVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.f35517j0.g(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cg.w1 w1Var;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (u(i10, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader == null || !applicationLoader.checkRequestPermissionResult(i10, strArr, iArr)) {
                if (this.m0.getFragmentStack().size() != 0) {
                    this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
                if (AndroidUtilities.isTablet()) {
                    if (this.f35525o0.getFragmentStack().size() != 0) {
                        this.f35525o0.getFragmentStack().get(this.f35525o0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                    }
                    if (this.f35523n0.getFragmentStack().size() != 0) {
                        this.f35523n0.getFragmentStack().get(this.f35523n0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                    }
                }
                lh1.q(i10, iArr);
                lh.sb sbVar = lh.sb.B2;
                int i11 = 3;
                int i12 = 2;
                int i13 = 0;
                if (sbVar != null) {
                    jh.b bVar = sbVar.f16742a;
                    Activity activity = sbVar.f16745b;
                    boolean z10 = iArr != null && iArr.length == 1 && iArr[0] == 0;
                    if (i10 == 111) {
                        sbVar.f16789o2 = !z10;
                        if (z10 && sbVar.f16746b0 == 0) {
                            sbVar.f16814w0.setCameraThumb(null);
                            if (CameraController.getInstance().isCameraInitied()) {
                                sbVar.r();
                            } else {
                                CameraController.getInstance().initCamera(new lh.s9(sbVar, i13));
                            }
                        }
                    } else if (i10 == 114) {
                        if (z10) {
                            MediaController.loadGalleryPhotosAlbums(0);
                            sbVar.f(true);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint));
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            b2Var.P = spannableStringBuilderReplaceTags;
                            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new lh.ba(sbVar, i12));
                            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                            b2Var.show();
                        }
                    } else if (i10 == 112) {
                        if (!z10) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                            SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                            b2Var2.P = spannableStringBuilderReplaceTags2;
                            alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new lh.ba(sbVar, i11));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                            b2Var2.show();
                        }
                    } else if (i10 == 115) {
                        if (!z10) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                            SpannableStringBuilder spannableStringBuilderReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory));
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
                            b2Var3.P = spannableStringBuilderReplaceTags3;
                            alertDialog$Builder3.k(LocaleController.getString(R.string.PermissionOpenSettings), new lh.ba(sbVar, 5));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                            b2Var3.show();
                        }
                        if (z10 && (w1Var = sbVar.f16809u2) != null) {
                            w1Var.run();
                        }
                        sbVar.f16809u2 = null;
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i10), strArr, iArr);
                SparseIntArray sparseIntArray = this.X0;
                if (sparseIntArray.get(i10, -1) >= 0) {
                    int i14 = sparseIntArray.get(i10, -1);
                    sparseIntArray.delete(i10);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.permissionsGranted, Integer.valueOf(i14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activityPermissionsGranted, Integer.valueOf(i10), strArr, iArr);
            }
        }
    }

    @Override
    public final void onResume() {
        MessageObject playingMessageObject;
        yf.z0 z0Var;
        super.onResume();
        A1 = true;
        ye.b bVar = this.f35517j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        int i10 = 0;
        if (bVar.f49840f) {
            bVar.a(false);
        }
        org.telegram.ui.Components.xt xtVar = B1;
        if (xtVar != null) {
            xtVar.run();
            B1 = null;
        }
        if (org.telegram.ui.ActionBar.g6.f23244o == 3) {
            org.telegram.ui.ActionBar.g6.E(false);
        }
        I(true);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.m0.getView();
        this.f35526o1 = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.K).sortDialogs(null);
        E0();
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.gc(24));
        C(0);
        MediaController.checkGallery();
        g0();
        org.telegram.ui.Components.fd0 fd0Var = this.f35541w0;
        if (fd0Var == null || fd0Var.f28378b.getVisibility() != 0) {
            this.m0.M();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f35525o0;
                if (actionBarLayout != null) {
                    actionBarLayout.M();
                }
                ActionBarLayout actionBarLayout2 = this.f35523n0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.M();
                }
            }
        } else {
            this.m0.n();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.f35525o0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.n();
                }
                ActionBarLayout actionBarLayout4 = this.f35523n0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.n();
                }
            }
            this.f35541w0.f28378b.i();
            ArrayList arrayList = this.f35543x0;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((org.telegram.ui.Components.dd0) obj).i();
            }
        }
        ConnectionsManager.getInstance(this.K).setAppPaused(false, false);
        M0();
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer photoViewerT1 = PhotoViewer.t1();
            ut0 ut0Var = photoViewerT1.f35583a0;
            if (ut0Var != null) {
                ut0Var.invalidate();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xl(photoViewerT1, i10, 20), 100L);
            }
            org.telegram.ui.Components.m61 m61Var = photoViewerT1.B2;
            if (m61Var != null) {
                m61Var.L(m61Var.o() + 1);
                if (photoViewerT1.V2) {
                    photoViewerT1.B2.O(true);
                }
            }
            ys0 ys0Var = photoViewerT1.H1;
            if (ys0Var != null && (z0Var = ys0Var.S0.d) != null) {
                z0Var.postRunnable(z0Var.f50138w);
            }
        }
        lh.sb sbVar = lh.sb.B2;
        if (sbVar != null) {
            sbVar.P();
        }
        if (PipRoundVideoView.B != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            MediaController.getInstance().seekToProgress(playingMessageObject, playingMessageObject.audioProgress);
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).unacceptedTermsOfService != null) {
            int i12 = UserConfig.selectedAccount;
            H0(i12, UserConfig.getInstance(i12).unacceptedTermsOfService);
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
        lh1 lh1Var = lh1.f40088j1;
        if (lh1Var != null) {
            if (org.telegram.ui.Components.voip.l2.k() != null) {
                org.telegram.ui.Components.voip.l2.i();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                lh1Var.H();
            } else if (VoIPService.getSharedState() == null) {
                lh1Var.f40119q0.b();
            }
            lh1Var.F0 = ((KeyguardManager) lh1Var.f40092b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.l2.k() != null) {
                org.telegram.ui.Components.voip.l2.k().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        a0();
        HashMap map = eh.j.f5499n;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                eh.i iVar = ((eh.j) it.next()).f5504f;
                if (iVar != null) {
                    iVar.f5489b = false;
                }
            }
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onResume();
        }
        d0 d0Var = E1;
        if (d0Var != null) {
            d0Var.run();
            E1 = null;
        }
        if (MessagesController.getInstance(this.K).hasSetupEmailSuggestion()) {
            MessagesController.getInstance(this.K).checkPromoInfo(true);
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        org.telegram.ui.ActionBar.n2 n2Var;
        try {
            super.onSaveInstanceState(bundle);
            boolean z10 = true;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f35523n0;
                if (actionBarLayout == null || actionBarLayout.getFragmentStack().isEmpty()) {
                    ActionBarLayout actionBarLayout2 = this.f35525o0;
                    if (actionBarLayout2 != null && !actionBarLayout2.getFragmentStack().isEmpty()) {
                        n2Var = this.f35525o0.getFragmentStack().get(this.f35525o0.getFragmentStack().size() - 1);
                    } else if (this.m0.getFragmentStack().isEmpty()) {
                        n2Var = null;
                    } else {
                        n2Var = this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1);
                    }
                } else {
                    n2Var = this.f35523n0.getFragmentStack().get(this.f35523n0.getFragmentStack().size() - 1);
                }
            } else if (this.m0.getFragmentStack().isEmpty()) {
                n2Var = null;
            } else {
                n2Var = this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1);
            }
            if (n2Var != null) {
                Bundle arguments = n2Var.getArguments();
                if ((n2Var instanceof rn) && arguments != null) {
                    bundle.putBundle("args", arguments);
                    bundle.putString("fragment", "chat");
                } else if ((n2Var instanceof u60) && arguments != null) {
                    bundle.putBundle("args", arguments);
                    bundle.putString("fragment", "group");
                } else if (n2Var instanceof WallpapersListActivity) {
                    bundle.putString("fragment", "wallpapers");
                } else if (n2Var instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) n2Var;
                    if (profileActivity.h4()) {
                        bundle.putString("fragment", "settings");
                    } else {
                        if (profileActivity.f35929b1 == 0) {
                            z10 = false;
                        }
                        if (z10 && arguments != null) {
                            bundle.putBundle("args", arguments);
                            bundle.putString("fragment", "chat_profile");
                        }
                    }
                } else if ((n2Var instanceof id) && arguments != null && arguments.getInt("step") == 0) {
                    bundle.putBundle("args", arguments);
                    bundle.putString("fragment", "channel");
                } else if (n2Var instanceof x71) {
                    bundle.putString("fragment", "settings2");
                }
                n2Var.saveSelfArgs(bundle);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void onStart() {
        ef.a aVar;
        String str;
        Intent intent;
        super.onStart();
        this.f35524n1 = true;
        this.f35517j0.h();
        WeakReference weakReference = we.e.f49298e;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (activity != null && activity != this) {
            we.e.x(activity);
        }
        if (we.e.f49296b == null) {
            we.e.f49298e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(we.e.d)) {
                    String strA = g7.w6.a(this);
                    we.e.d = strA;
                    if (strA != null) {
                        we.c cVar = new we.c();
                        aVar = new ef.a();
                        aVar.f5381b = new WeakReference(cVar);
                        we.e.f49297c = aVar;
                        str = we.e.d;
                        intent = new Intent("android.support.customtabs.action.CustomTabsService");
                        if (!TextUtils.isEmpty(str)) {
                            intent.setPackage(str);
                        }
                        if (!bindService(intent, aVar, 33)) {
                            we.e.f49297c = null;
                        }
                    }
                } else {
                    we.c cVar2 = new we.c();
                    aVar = new ef.a();
                    aVar.f5381b = new WeakReference(cVar2);
                    we.e.f49297c = aVar;
                    str = we.e.d;
                    intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty(str)) {
                        intent.setPackage(str);
                    }
                    if (!bindService(intent, aVar, 33)) {
                        we.e.f49297c = null;
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        ApplicationLoader.mainInterfaceStopped = false;
        org.telegram.ui.Components.n20.j(this);
        s50 s50Var = s50.f42409z3;
        if (s50Var != null) {
            ArrayList arrayList = s50Var.V1;
            s50.E3 = false;
            s50Var.L.l();
            f30 f30Var = s50Var.f42446i2;
            if (f30Var.getVisibility() == 0) {
                s50Var.f42457l2.G(f30Var, false);
            }
            if (s50.C3) {
                s50Var.f42454k2.I(s50Var.f42450j2, false);
            }
            arrayList.clear();
            arrayList.addAll(s50Var.U1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
            }
            w40 w40Var = s50Var.H;
            org.telegram.ui.Components.s71 s71Var = w40Var.v;
            if (s71Var != null) {
                s71Var.c(true);
            }
            w40Var.B = false;
            s50Var.D.s();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        this.f35524n1 = false;
        ye.b bVar = this.f35517j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        bVar.f49839e = false;
        if (bVar.f49840f) {
            bVar.c(true);
        }
        bVar.d.unregisterReceiver(bVar.f49848o);
        we.e.x(this);
        ApplicationLoader.mainInterfaceStopped = true;
        org.telegram.ui.Components.n20.j(this);
        s50 s50Var = s50.f42409z3;
        if (s50Var != null) {
            s50.E3 = true;
            ArrayList arrayList = s50Var.V1;
            arrayList.clear();
            arrayList.addAll(s50Var.U1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(false);
            }
            w40 w40Var = s50Var.H;
            org.telegram.ui.Components.s71 s71Var = w40Var.v;
            if (s71Var != null) {
                s71Var.c(false);
            }
            w40Var.B = true;
            s50Var.D.r();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f35506d1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        ye.b bVar = this.f35517j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        bVar.f();
        ArrayList arrayList = this.W0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.m0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.K0.isEmpty()) {
                ((org.telegram.ui.ActionBar.n2) i0.a.j(1, actionBarLayout.K0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.r rVar = actionBarLayout.C;
            if (rVar != null) {
                rVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(org.telegram.ui.ActionBar.n2 n2Var) {
        ((ActionBarLayout) O()).P(n2Var);
    }

    public final boolean q0(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) O()).S(n2Var, z10, z11);
    }

    public final void r0(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.A0;
            if (i10 >= arrayList.size()) {
                org.telegram.ui.ActionBar.n2 n2VarU = U();
                if (n2VarU != null && n2VarU.sheetsStack != null) {
                    for (int i11 = 0; i11 < n2VarU.sheetsStack.size(); i11++) {
                        if (n2VarU.sheetsStack.get(i11).isShown()) {
                            n2VarU.sheetsStack.get(i11);
                        }
                    }
                }
                ty tyVarW = this.m0.w();
                if (tyVarW != null && tyVarW.sheetsStack != null) {
                    for (int i12 = 0; i12 < tyVarW.sheetsStack.size(); i12++) {
                        if (tyVarW.sheetsStack.get(i12).isShown()) {
                            tyVarW.sheetsStack.get(i12);
                        }
                    }
                }
                o90 o90Var = new o90(this, 1);
                TLRPC.User user = MessagesController.getInstance(this.K).getUser(Long.valueOf(j10));
                if (user != null) {
                    o90Var.run(user);
                    return;
                } else {
                    MessagesStorage.getInstance(this.K).getStorageQueue().postRunnable(new v90(this, j10, o90Var, 0));
                    return;
                }
            }
            if (arrayList.get(i10) instanceof nh.b3) {
                nh.b3 b3Var = (nh.b3) arrayList.get(i10);
                if (b3Var.isShowing() && b3Var.D == j10) {
                    return;
                }
            }
            i10++;
        }
    }

    public final void s0(Long l10, a30 a30Var, we.d dVar, org.telegram.ui.Cells.s1 s1Var) {
        ChannelBoostsController boostsController = MessagesController.getInstance(this.K).getBoostsController();
        if (dVar != null) {
            dVar.d();
        }
        boostsController.getBoostsStats(l10.longValue(), new o80(this, dVar, a30Var, boostsController, l10, s1Var));
    }

    @Override
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        ye.b bVar = this.f35517j0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        bVar.h = pictureInPictureParams;
    }

    public final void t0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap map, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, String str26, final String str27, final we.d dVar, final boolean z12, final int i13, final int i14, final int i15, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i10).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35496x1;
                final we.d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.b();
                }
                final LaunchActivity launchActivity = this.f43643a;
                final int i16 = i10;
                final boolean z22 = z12;
                final boolean z23 = z16;
                final boolean z24 = z17;
                final boolean z25 = z18;
                if (tL_error == null) {
                    final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                    final Runnable runnable2 = runnable;
                    final TLRPC.User user2 = user;
                    final String str30 = str27;
                    final boolean z26 = z15;
                    final boolean z27 = z14;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.f35496x1;
                            runnable2.run();
                            AtomicBoolean atomicBoolean = new AtomicBoolean();
                            LaunchActivity launchActivity2 = launchActivity;
                            ArrayList arrayList = launchActivity2.Z;
                            org.telegram.ui.ActionBar.n2 n2Var = (arrayList == null || arrayList.isEmpty()) ? null : (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList);
                            int i17 = i16;
                            TLRPC.User user3 = user2;
                            TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                            String str31 = str30;
                            boolean z28 = z23;
                            boolean z29 = z24;
                            boolean z30 = z25;
                            boolean z31 = z22;
                            j90 j90Var = new j90(launchActivity2, n2Var, i17, user3, tL_messages_botApp2, atomicBoolean, str31, z28, z29, z30, z31);
                            if (z26) {
                                j90Var.run();
                                return;
                            }
                            if (tL_messages_botApp2.inactive && z27) {
                                tb tbVar = new tb(j90Var, 2);
                                we.d dVar3 = dVar2;
                                ei1.a(launchActivity2, tbVar, dVar3 != null ? new r00(dVar3, 14) : null);
                            } else if (tL_messages_botApp2.request_write_access || z31) {
                                org.telegram.ui.Components.y4.n(n2Var, atomicBoolean, user3, j90Var);
                            } else {
                                j90Var.run();
                            }
                        }
                    });
                    return;
                }
                final String str31 = str;
                final String str32 = str2;
                final String str33 = str3;
                final String str34 = str4;
                final String str35 = str5;
                final String str36 = str6;
                final String str37 = str7;
                final String str38 = str8;
                final String str39 = str9;
                final String str40 = str10;
                final String str41 = str11;
                final String str42 = str12;
                final boolean z28 = z10;
                final Integer num3 = num;
                final Long l12 = l10;
                final Long l13 = l11;
                final Integer num4 = num2;
                final String str43 = str13;
                final HashMap map2 = map;
                final String str44 = str14;
                final String str45 = str15;
                final String str46 = str16;
                final String str47 = str17;
                final TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
                final String str48 = str18;
                final String str49 = str19;
                final String str50 = str20;
                final String str51 = str21;
                final boolean z29 = z11;
                final String str52 = str22;
                final int i17 = i11;
                final int i18 = i12;
                final String str53 = str23;
                final String str54 = str24;
                final String str55 = str25;
                final int i19 = i13;
                final int i20 = i14;
                final int i21 = i15;
                final boolean z30 = z13;
                final String str56 = str28;
                final boolean z31 = z19;
                final boolean z32 = z20;
                final String str57 = str29;
                final boolean z33 = z21;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Pattern pattern2 = LaunchActivity.f35496x1;
                        launchActivity.x0(i16, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, z28, num3, l12, l13, num4, str43, map2, str44, str45, str46, str47, tL_wallPaper2, str48, str49, str50, str51, z29, str52, i17, i18, str53, str54, str55, null, null, dVar2, z22, i19, false, i20, i21, null, null, z30, str56, z23, z24, z25, z31, z32, str57, null, z33, null);
                    }
                });
            }
        });
    }

    public final void u0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f35523n0;
        if (actionBarLayout != null) {
            actionBarLayout.U(z10, z10);
        } else {
            this.m0.U(z10, z10);
        }
    }

    public final int v0(final int i10, final a30 a30Var, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i11, final int i12) {
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = num2 != null ? num.intValue() : (int) l10.longValue();
        return ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35496x1;
                final LaunchActivity launchActivity = this.f39976a;
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
                final Runnable runnable3 = a30Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LaunchActivity launchActivity2 = launchActivity;
                        ArrayList arrayList = launchActivity2.Z;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.TL_messages_discussionMessage;
                        Runnable runnable4 = runnable2;
                        if (z10) {
                            TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            int i16 = i13;
                            MessagesController.getInstance(i16).putUsers(tL_messages_discussionMessage.users, false);
                            MessagesController.getInstance(i16).putChats(tL_messages_discussionMessage.chats, false);
                            ArrayList arrayList2 = new ArrayList();
                            int size = tL_messages_discussionMessage.messages.size();
                            for (int i17 = 0; i17 < size; i17++) {
                                arrayList2.add(new MessageObject(UserConfig.selectedAccount, tL_messages_discussionMessage.messages.get(i17), true, true));
                            }
                            boolean zIsEmpty = arrayList2.isEmpty();
                            TLRPC.Chat chat3 = chat2;
                            Long l12 = l11;
                            if (!zIsEmpty || (chat3.forum && l12 != null && l12.longValue() == 1)) {
                                boolean z11 = chat3.forum;
                                Integer num7 = num4;
                                Integer num8 = num5;
                                String str3 = str2;
                                Integer num9 = num6;
                                byte[] bArr3 = bArr2;
                                int i18 = i15;
                                if (z11) {
                                    int iLongValue = (int) l12.longValue();
                                    if (num7 == null) {
                                        num7 = num8;
                                    }
                                    launchActivity2.o0(i16, iLongValue, chat3, num7.intValue(), null, runnable4, str3, num9, bArr3, i14, arrayList2, i18);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -((MessageObject) arrayList2.get(0)).getDialogId());
                                    bundle.putInt("message_id", Math.max(1, num8.intValue()));
                                    rn rnVar = new rn(bundle);
                                    rnVar.pb(arrayList2, chat3, tL_messages_getDiscussionMessage2.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
                                    if (num7 != null) {
                                        if (bArr3 != null) {
                                            rnVar.N7 = bArr3;
                                            rnVar.H7 = num7.intValue();
                                        } else if (str3 != null) {
                                            rnVar.mb(num7.intValue(), i18, str3);
                                        } else {
                                            rnVar.M7 = num9;
                                            rnVar.H7 = num7.intValue();
                                        }
                                    } else if (l12 != null) {
                                        if (bArr3 != null) {
                                            rnVar.N7 = bArr3;
                                            rnVar.H7 = num8.intValue();
                                        } else if (str3 != null) {
                                            rnVar.mb(num8.intValue(), i18, str3);
                                        } else {
                                            rnVar.M7 = num9;
                                            rnVar.H7 = num8.intValue();
                                        }
                                    }
                                    launchActivity2.p0(rnVar);
                                }
                            } else {
                                try {
                                    if (!arrayList.isEmpty()) {
                                        org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) arrayList.get(arrayList.size() - 1)).t(LocaleController.getString(R.string.ChannelPostDeleted), null).j();
                                    }
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                            }
                        } else if (!arrayList.isEmpty()) {
                            org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) arrayList.get(arrayList.size() - 1)).t(LocaleController.getString(R.string.ChannelPostDeleted), null).j();
                        }
                        Runnable runnable5 = runnable3;
                        if (runnable5 != null) {
                            try {
                                runnable5.run();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        }
                        if (runnable4 != null) {
                            runnable4.run();
                        }
                    }
                });
            }
        });
    }

    @Override
    public final boolean w(final gy gyVar, final ArrayList arrayList, final CharSequence charSequence, final boolean z10, boolean z11, int i10, final int i11, we1 we1Var) {
        rn rnVar;
        LaunchActivity launchActivity;
        ArrayList arrayList2;
        final rn rnVar2;
        CharSequence charSequence2;
        boolean z12;
        CharSequence charSequence3;
        int i12;
        boolean z13;
        long j10;
        long j11;
        AccountInstance accountInstance;
        MessageObject messageObject;
        rn rnVar3;
        long j12;
        long j13;
        AccountInstance accountInstance2;
        boolean z14;
        boolean z15;
        CharSequence charSequence4;
        ArrayList arrayList3;
        boolean z16;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        ArrayList arrayList4;
        int size;
        ArrayList arrayList5;
        int size2;
        AccountInstance accountInstance3;
        long j14;
        CharSequence charSequence8;
        AccountInstance accountInstance4;
        long j15;
        ArrayList arrayList6;
        CharSequence charSequence9;
        int i13;
        File file;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        byte[] waveform;
        CharSequence charSequence10;
        String string;
        boolean z17;
        boolean z18;
        String str;
        ArrayList arrayList7;
        ArrayList arrayList8;
        CharSequence charSequence11;
        ArrayList arrayList9;
        boolean z19;
        boolean z20;
        CharSequence charSequence12;
        CharSequence charSequence13;
        ArrayList arrayList10;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        ArrayList arrayList11;
        ArrayList arrayList12;
        CharSequence charSequence14;
        ArrayList<TLRPC.MessageEntity> entities;
        CharSequence charSequence15;
        String string2;
        int i14;
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo;
        int size3;
        int i15;
        MediaController.PhotoEntry photoEntry;
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo2;
        boolean z21;
        String str2;
        CharSequence charSequence16;
        String string3;
        String str3;
        LaunchActivity launchActivity2;
        ?? r10;
        final int currentAccount = gyVar != null ? gyVar.getCurrentAccount() : this.K;
        final Uri uri = this.T;
        if (uri != null) {
            final ArrayList arrayList13 = this.S != null ? new ArrayList(this.S) : null;
            final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this, 3, null);
            SendMessagesHelper.getInstance(currentAccount).prepareImportHistory(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, this.T, this.S, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j16) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                    LaunchActivity launchActivity3 = this.f42554a;
                    if (j16 != 0) {
                        Pattern pattern = LaunchActivity.f35496x1;
                        Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
                        if (!AndroidUtilities.isTablet()) {
                            NotificationCenter.getInstance(currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                        }
                        if (DialogObject.isUserDialog(j16)) {
                            bundleH.putLong("user_id", j16);
                        } else {
                            bundleH.putLong("chat_id", -j16);
                        }
                        rn rnVar4 = new rn(bundleH);
                        rnVar4.f42148n9 = true;
                        org.telegram.ui.ActionBar.b5 b5VarO = launchActivity3.O();
                        gy gyVar2 = gyVar;
                        ((ActionBarLayout) b5VarO).S(rnVar4, gyVar2 != null || z10, gyVar2 == null);
                    } else {
                        ArrayList arrayList14 = arrayList13;
                        launchActivity3.S = arrayList14;
                        if (arrayList14 == null) {
                            launchActivity3.S = new ArrayList();
                        }
                        launchActivity3.S.add(0, uri);
                        launchActivity3.i0(true);
                    }
                    try {
                        b2Var2.dismiss();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
            });
            try {
                b2Var.q(300L);
            } catch (Exception unused) {
            }
            launchActivity2 = this;
            r10 = 0;
        } else {
            gy gyVar2 = gyVar;
            final boolean z22 = gyVar2 == null || gyVar2.F2 || z11;
            int i16 = i10 != 0 ? i10 : gyVar2 == null ? 0 : gyVar2.G2;
            if (arrayList.size() <= 1) {
                long j16 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
                if (!AndroidUtilities.isTablet()) {
                    NotificationCenter.getInstance(currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                }
                if (DialogObject.isEncryptedDialog(j16)) {
                    bundleH.putInt("enc_id", DialogObject.getEncryptedChatId(j16));
                } else if (DialogObject.isUserDialog(j16)) {
                    bundleH.putLong("user_id", j16);
                } else {
                    bundleH.putLong("chat_id", -j16);
                }
                if (MessagesController.getInstance(currentAccount).checkCanOpenChat(bundleH, gyVar2)) {
                    rn rnVar4 = new rn(bundleH);
                    wf.c.a(rnVar4, (MessagesStorage.TopicKey) arrayList.get(0));
                    rnVar = rnVar4;
                }
                return false;
            }
            rnVar = null;
            ArrayList arrayList14 = this.W;
            int size4 = arrayList14 != null ? arrayList14.size() : 0;
            if (this.N != null) {
                size4++;
            }
            if (this.O != null) {
                size4++;
            }
            ArrayList arrayList15 = this.Q;
            if (arrayList15 != null) {
                size4 += arrayList15.size();
            }
            ArrayList arrayList16 = this.R;
            if (arrayList16 != null) {
                size4 += arrayList16.size();
            }
            ArrayList arrayList17 = this.S;
            if (arrayList17 != null) {
                size4 += arrayList17.size();
            }
            if (this.N == null && this.O == null && this.Q == null && this.R == null && this.S == null && this.P != null) {
                size4++;
            }
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (org.telegram.ui.Components.y4.h(this, this.K, ((MessagesStorage.TopicKey) arrayList.get(i17)).dialogId, size4 > 1)) {
                    return false;
                }
            }
            if (we1Var != null) {
                we1Var.removeSelfFromStack();
            }
            ArrayList arrayList18 = this.W;
            if (arrayList18 == null || arrayList18.size() != 1) {
                launchActivity = this;
                arrayList2 = arrayList;
                rnVar2 = rnVar;
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence2 = charSequence;
                } else {
                    launchActivity.P = charSequence;
                    charSequence2 = null;
                }
                if (gyVar2 == null && gyVar2.a4()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    arrayList11 = gyVar2.f38625z2;
                    arrayList12 = new ArrayList();
                    if (arrayList11 != null) {
                        size3 = arrayList11.size();
                        i15 = 0;
                        while (i15 < size3) {
                            Object obj = arrayList11.get(i15);
                            i15++;
                            photoEntry = (MediaController.PhotoEntry) obj;
                            sendingMediaInfo2 = new SendMessagesHelper.SendingMediaInfo();
                            z21 = photoEntry.isVideo;
                            if (!z21 || (str3 = photoEntry.imagePath) == null) {
                                str2 = photoEntry.path;
                                if (str2 != null) {
                                    sendingMediaInfo2.path = str2;
                                }
                            } else {
                                sendingMediaInfo2.path = str3;
                            }
                            sendingMediaInfo2.thumbPath = photoEntry.thumbPath;
                            sendingMediaInfo2.coverPath = photoEntry.coverPath;
                            sendingMediaInfo2.isVideo = z21;
                            sendingMediaInfo2.isLivePhoto = photoEntry.isLivePhoto();
                            sendingMediaInfo2.discardLivePhoto = photoEntry.isUnalivePhoto();
                            sendingMediaInfo2.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                            sendingMediaInfo2.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                            charSequence16 = photoEntry.caption;
                            if (charSequence16 != null) {
                                string3 = charSequence16.toString();
                            } else {
                                string3 = null;
                            }
                            sendingMediaInfo2.caption = string3;
                            sendingMediaInfo2.entities = photoEntry.entities;
                            sendingMediaInfo2.masks = photoEntry.stickers;
                            sendingMediaInfo2.ttl = photoEntry.ttl;
                            sendingMediaInfo2.videoEditedInfo = photoEntry.editedInfo;
                            sendingMediaInfo2.canDeleteAfter = photoEntry.canDeleteAfter;
                            sendingMediaInfo2.highQuality = photoEntry.isHighQuality();
                            arrayList12.add(sendingMediaInfo2);
                        }
                    }
                    launchActivity.Q = arrayList12;
                    if (!arrayList12.isEmpty()) {
                        charSequence14 = launchActivity.P;
                        if (charSequence14 == null) {
                            charSequence14 = "";
                        }
                        CharSequence[] charSequenceArr = {charSequence14};
                        entities = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr, false);
                        charSequence15 = charSequenceArr[0];
                        if (charSequence15 == null) {
                            string2 = null;
                        } else {
                            string2 = charSequence15.toString();
                        }
                        for (i14 = 0; i14 < launchActivity.Q.size(); i14++) {
                            sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(i14);
                            if (i14 == 0) {
                                sendingMediaInfo.caption = string2;
                                sendingMediaInfo.entities = entities;
                            } else {
                                sendingMediaInfo.caption = null;
                                sendingMediaInfo.entities = null;
                            }
                        }
                    }
                    launchActivity.N = null;
                    launchActivity.P = null;
                }
                charSequence3 = null;
                i12 = 0;
                z13 = false;
                while (i12 < arrayList2.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList2.get(i12)).dialogId;
                    j11 = ((MessagesStorage.TopicKey) arrayList2.get(i12)).topicId;
                    accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    if (j11 != 0 || (tL_forumTopicFindTopic = accountInstance.getMessagesController().getTopicsController().findTopic(-j10, j11)) == null || tL_forumTopicFindTopic.topicStartMessage == null) {
                        messageObject = null;
                    } else {
                        MessageObject messageObject2 = new MessageObject(accountInstance.getCurrentAccount(), tL_forumTopicFindTopic.topicStartMessage, false, false);
                        messageObject2.isTopicMainMessage = true;
                        messageObject = messageObject2;
                    }
                    if (rnVar2 != null) {
                        if (gyVar2 == null && launchActivity.N == null && ((arrayList10 = launchActivity.Q) == null || arrayList10.size() <= 0)) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        org.telegram.ui.ActionBar.b5 b5VarO = launchActivity.O();
                        if (gyVar2 != null) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        ((ActionBarLayout) b5VarO).S(rnVar2, z18, z17);
                        if (gyVar2 != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        str = launchActivity.N;
                        if (str == null && j11 == 0 && !z12) {
                            rnVar2.oa(launchActivity.P, str);
                            launchActivity.P = null;
                            rnVar3 = rnVar2;
                            i12 = i12;
                            j12 = j10;
                            j13 = j11;
                            z20 = true;
                            z14 = false;
                            accountInstance2 = accountInstance;
                        } else {
                            arrayList7 = launchActivity.Q;
                            if (arrayList7 != null || arrayList7.size() <= 0 || j11 != 0 || z12) {
                                rnVar3 = rnVar2;
                                i12 = i12;
                                j13 = j11;
                                if (launchActivity.N != null) {
                                    charSequence12 = launchActivity.P;
                                    if (charSequence12 != null && charSequence12.length() <= 1024) {
                                        charSequence3 = launchActivity.P;
                                        launchActivity.P = null;
                                    }
                                    CharSequence charSequence17 = charSequence3;
                                    ArrayList arrayList19 = new ArrayList();
                                    arrayList19.add(launchActivity.N);
                                    int i18 = i16;
                                    j12 = j10;
                                    accountInstance2 = accountInstance;
                                    SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) arrayList19, (ArrayList<String>) arrayList19, (ArrayList<Uri>) null, charSequence17, (String) null, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i18, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                    charSequence3 = charSequence17;
                                    i16 = i18;
                                } else {
                                    j12 = j10;
                                    accountInstance2 = accountInstance;
                                    arrayList8 = launchActivity.Q;
                                    if (arrayList8 != null && arrayList8.size() > 0) {
                                        charSequence11 = launchActivity.P;
                                        if (charSequence11 != null && charSequence11.length() <= 1024 && launchActivity.Q.size() == 1) {
                                            CharSequence[] charSequenceArr2 = {launchActivity.P};
                                            ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).entities = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr2, false);
                                            ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).caption = charSequenceArr2[0].toString();
                                            launchActivity.P = null;
                                        }
                                        arrayList9 = launchActivity.Q;
                                        if (arrayList9.size() > 1) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        MessageObject messageObject3 = messageObject;
                                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList9, j12, messageObject3, messageObject3, null, null, false, z19, null, z22, i16, i11, 0, false, null, null, 0L, false, 0L, 0L, null);
                                        j12 = j12;
                                        messageObject = messageObject3;
                                    }
                                }
                                z20 = false;
                                z14 = false;
                            } else {
                                ArrayList arrayList20 = launchActivity.Q;
                                CharSequence charSequence18 = (charSequence2 == null || charSequence2.length() == 0) ? launchActivity.P : charSequence2;
                                ArrayList arrayListH7 = rn.H7(arrayList20, rnVar2.x(), charSequence18);
                                if (arrayListH7.isEmpty()) {
                                    rnVar3 = rnVar2;
                                    i12 = i12;
                                    j13 = j11;
                                    charSequence13 = null;
                                    z14 = false;
                                } else {
                                    if (rnVar2.getParentActivity() != null) {
                                        boolean[] zArr = new boolean[arrayListH7.size()];
                                        Arrays.fill(zArr, true);
                                        PhotoViewer.t1().K2(null, rnVar2, rnVar2.f41983aa);
                                        rn rnVar5 = rnVar2;
                                        j13 = j11;
                                        PhotoViewer.t1().f2(new ArrayList(arrayListH7), arrayListH7.size() - 1, 0, false, new ll(rnVar2, arrayListH7, zArr), rnVar5);
                                        rnVar3 = rnVar5;
                                        charSequence13 = null;
                                    } else {
                                        rnVar3 = rnVar2;
                                        j13 = j11;
                                        charSequence13 = null;
                                        rnVar3.l8(charSequence18, null);
                                        rnVar3.eb(arrayListH7, 0, false, false);
                                        rnVar3.y6();
                                    }
                                    z14 = true;
                                }
                                if (z14) {
                                    launchActivity.P = charSequence13;
                                }
                                j12 = j10;
                                accountInstance2 = accountInstance;
                                z20 = false;
                            }
                        }
                        z15 = z20;
                    } else {
                        rnVar3 = rnVar2;
                        i12 = i12;
                        j12 = j10;
                        j13 = j11;
                        accountInstance2 = accountInstance;
                        if (launchActivity.N != null) {
                            charSequence5 = launchActivity.P;
                            if (charSequence5 != null && charSequence5.length() <= 1024) {
                                charSequence3 = launchActivity.P;
                                launchActivity.P = null;
                            }
                            CharSequence charSequence19 = charSequence3;
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.add(launchActivity.N);
                            int i19 = i16;
                            SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) arrayList21, (ArrayList<String>) arrayList21, (ArrayList<Uri>) null, charSequence19, (String) null, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i19, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                            i16 = i19;
                            charSequence3 = charSequence19;
                        }
                        if (launchActivity.Q != null) {
                            charSequence4 = launchActivity.P;
                            if (charSequence4 != null && charSequence4.length() <= 1024 && launchActivity.Q.size() == 1) {
                                CharSequence[] charSequenceArr3 = {launchActivity.P};
                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).entities = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr3, false);
                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).caption = charSequenceArr3[0].toString();
                                launchActivity.P = null;
                            }
                            arrayList3 = launchActivity.Q;
                            if (arrayList3.size() > 1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            MessageObject messageObject4 = messageObject;
                            SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList3, j12, messageObject4, messageObject4, null, null, false, z16, null, z22, i16, i11, 0, false, null, null, 0L, false, 0L, 0L, null);
                            j12 = j12;
                            messageObject = messageObject4;
                        }
                        z14 = false;
                        z15 = false;
                    }
                    boolean z23 = z13;
                    if (launchActivity.R == null || launchActivity.S != null) {
                        charSequence6 = launchActivity.P;
                        if (charSequence6 != null && charSequence6.length() <= 1024) {
                            arrayList4 = launchActivity.R;
                            if (arrayList4 != null) {
                                size = arrayList4.size();
                            } else {
                                size = 0;
                            }
                            arrayList5 = launchActivity.S;
                            if (arrayList5 != null) {
                                size2 = arrayList5.size();
                            } else {
                                size2 = 0;
                            }
                            if (size + size2 == 1) {
                                charSequence3 = launchActivity.P;
                                launchActivity.P = null;
                            }
                        }
                        CharSequence charSequence20 = charSequence3;
                        int i20 = i16;
                        SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) launchActivity.R, (ArrayList<String>) launchActivity.V, (ArrayList<Uri>) launchActivity.S, charSequence20, launchActivity.U, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i20, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                        i16 = i20;
                        charSequence7 = charSequence20;
                    } else {
                        charSequence7 = charSequence3;
                    }
                    accountInstance3 = accountInstance2;
                    if (launchActivity.O != null) {
                        file = new File(launchActivity.O);
                        if (file.exists()) {
                            TLRPC.TL_document tL_document = new TLRPC.TL_document();
                            tL_document.file_reference = new byte[0];
                            tL_document.dc_id = Integer.MIN_VALUE;
                            tL_document.f22386id = SharedConfig.getLastLocalId();
                            tL_document.user_id = accountInstance3.getUserConfig().getClientUserId();
                            tL_document.mime_type = "audio/ogg";
                            tL_document.date = accountInstance3.getConnectionsManager().getCurrentTime();
                            tL_document.size = (int) file.length();
                            tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.voice = true;
                            waveform = MediaController.getWaveform(file.getAbsolutePath());
                            tL_documentAttributeAudio.waveform = waveform;
                            if (waveform != null) {
                                tL_documentAttributeAudio.flags |= 4;
                            }
                            tL_document.attributes.add(tL_documentAttributeAudio);
                            CharSequence[] charSequenceArr4 = {launchActivity.P};
                            ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr4, false);
                            SendMessagesHelper sendMessagesHelper = accountInstance3.getSendMessagesHelper();
                            String absolutePath = file.getAbsolutePath();
                            charSequence10 = charSequenceArr4[0];
                            if (charSequence10 == null) {
                                string = null;
                            } else {
                                string = charSequence10.toString();
                            }
                            long j17 = j12;
                            MessageObject messageObject5 = messageObject;
                            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(tL_document, null, absolutePath, j17, messageObject5, messageObject, string, entities2, null, null, z22, i16, i11, 0, null, null, false);
                            j12 = j17;
                            messageObject = messageObject5;
                            sendMessagesHelper.sendMessage(sendMessageParamsOf);
                            if (launchActivity.P != null) {
                                launchActivity.P = null;
                            }
                        }
                    }
                    j14 = j13;
                    charSequence8 = launchActivity.P;
                    int i21 = i12;
                    if (charSequence8 != null) {
                        accountInstance4 = accountInstance3;
                        j15 = j14;
                        y0(accountInstance4, gyVar2, charSequence8, j12, messageObject, j15, z22, i16, i11);
                    } else {
                        accountInstance4 = accountInstance3;
                        j15 = j14;
                    }
                    arrayList6 = launchActivity.W;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        i13 = 0;
                        while (i13 < launchActivity.W.size()) {
                            TLRPC.User user = (TLRPC.User) launchActivity.W.get(i13);
                            SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(currentAccount);
                            long j18 = j12;
                            MessageObject messageObject6 = messageObject;
                            SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(user, j18, messageObject6, messageObject, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z22, i16, i11);
                            j12 = j18;
                            messageObject = messageObject6;
                            sendMessagesHelper2.sendMessage(sendMessageParamsOf2);
                            i13++;
                            launchActivity = this;
                        }
                    }
                    if (!TextUtils.isEmpty(charSequence2) || z15 || z14) {
                        charSequence9 = charSequence2;
                    } else {
                        charSequence9 = charSequence2;
                        y0(accountInstance4, gyVar, charSequence9, j12, messageObject, j15, z22, i16, i11);
                    }
                    i12 = i21 + 1;
                    gyVar2 = gyVar;
                    arrayList2 = arrayList;
                    charSequence2 = charSequence9;
                    rnVar2 = rnVar3;
                    launchActivity = this;
                    charSequence3 = charSequence7;
                    z13 = z23;
                }
            } else {
                ArrayList arrayList22 = this.Z;
                if (arrayList22.isEmpty()) {
                    launchActivity = this;
                    arrayList2 = arrayList;
                    rnVar2 = rnVar;
                    if (TextUtils.isEmpty(charSequence)) {
                        launchActivity.P = charSequence;
                        charSequence2 = null;
                    } else {
                        charSequence2 = charSequence;
                    }
                    if (gyVar2 == null) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        arrayList11 = gyVar2.f38625z2;
                        arrayList12 = new ArrayList();
                        if (arrayList11 != null) {
                            size3 = arrayList11.size();
                            i15 = 0;
                            while (i15 < size3) {
                                Object obj2 = arrayList11.get(i15);
                                i15++;
                                photoEntry = (MediaController.PhotoEntry) obj2;
                                sendingMediaInfo2 = new SendMessagesHelper.SendingMediaInfo();
                                z21 = photoEntry.isVideo;
                                if (z21) {
                                    str2 = photoEntry.path;
                                    if (str2 != null) {
                                        sendingMediaInfo2.path = str2;
                                    }
                                } else {
                                    str2 = photoEntry.path;
                                    if (str2 != null) {
                                        sendingMediaInfo2.path = str2;
                                    }
                                }
                                sendingMediaInfo2.thumbPath = photoEntry.thumbPath;
                                sendingMediaInfo2.coverPath = photoEntry.coverPath;
                                sendingMediaInfo2.isVideo = z21;
                                sendingMediaInfo2.isLivePhoto = photoEntry.isLivePhoto();
                                sendingMediaInfo2.discardLivePhoto = photoEntry.isUnalivePhoto();
                                sendingMediaInfo2.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                                sendingMediaInfo2.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                                charSequence16 = photoEntry.caption;
                                if (charSequence16 != null) {
                                    string3 = charSequence16.toString();
                                } else {
                                    string3 = null;
                                }
                                sendingMediaInfo2.caption = string3;
                                sendingMediaInfo2.entities = photoEntry.entities;
                                sendingMediaInfo2.masks = photoEntry.stickers;
                                sendingMediaInfo2.ttl = photoEntry.ttl;
                                sendingMediaInfo2.videoEditedInfo = photoEntry.editedInfo;
                                sendingMediaInfo2.canDeleteAfter = photoEntry.canDeleteAfter;
                                sendingMediaInfo2.highQuality = photoEntry.isHighQuality();
                                arrayList12.add(sendingMediaInfo2);
                            }
                        }
                        launchActivity.Q = arrayList12;
                        if (!arrayList12.isEmpty()) {
                            charSequence14 = launchActivity.P;
                            if (charSequence14 == null) {
                                charSequence14 = "";
                            }
                            CharSequence[] charSequenceArr5 = {charSequence14};
                            entities = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr5, false);
                            charSequence15 = charSequenceArr5[0];
                            if (charSequence15 == null) {
                                string2 = null;
                            } else {
                                string2 = charSequence15.toString();
                            }
                            while (i14 < launchActivity.Q.size()) {
                                sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(i14);
                                if (i14 == 0) {
                                    sendingMediaInfo.caption = string2;
                                    sendingMediaInfo.entities = entities;
                                } else {
                                    sendingMediaInfo.caption = null;
                                    sendingMediaInfo.entities = null;
                                }
                            }
                        }
                        launchActivity.N = null;
                        launchActivity.P = null;
                    }
                    charSequence3 = null;
                    i12 = 0;
                    z13 = false;
                    while (i12 < arrayList2.size()) {
                        j10 = ((MessagesStorage.TopicKey) arrayList2.get(i12)).dialogId;
                        j11 = ((MessagesStorage.TopicKey) arrayList2.get(i12)).topicId;
                        accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                        if (j11 != 0) {
                            messageObject = null;
                        } else {
                            messageObject = null;
                        }
                        if (rnVar2 != null) {
                            if (gyVar2 == null) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            org.telegram.ui.ActionBar.b5 b5VarO2 = launchActivity.O();
                            if (gyVar2 != null) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            ((ActionBarLayout) b5VarO2).S(rnVar2, z18, z17);
                            if (gyVar2 != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            str = launchActivity.N;
                            if (str == null) {
                                arrayList7 = launchActivity.Q;
                                if (arrayList7 != null) {
                                    rnVar3 = rnVar2;
                                    i12 = i12;
                                    j13 = j11;
                                    if (launchActivity.N != null) {
                                        charSequence12 = launchActivity.P;
                                        if (charSequence12 != null) {
                                            charSequence3 = launchActivity.P;
                                            launchActivity.P = null;
                                        }
                                        CharSequence charSequence110 = charSequence3;
                                        ArrayList arrayList110 = new ArrayList();
                                        arrayList110.add(launchActivity.N);
                                        int i110 = i16;
                                        j12 = j10;
                                        accountInstance2 = accountInstance;
                                        SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) arrayList110, (ArrayList<String>) arrayList110, (ArrayList<Uri>) null, charSequence110, (String) null, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i110, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                        charSequence3 = charSequence110;
                                        i16 = i110;
                                    } else {
                                        j12 = j10;
                                        accountInstance2 = accountInstance;
                                        arrayList8 = launchActivity.Q;
                                        if (arrayList8 != null) {
                                            charSequence11 = launchActivity.P;
                                            if (charSequence11 != null) {
                                                CharSequence[] charSequenceArr6 = {launchActivity.P};
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).entities = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr6, false);
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).caption = charSequenceArr6[0].toString();
                                                launchActivity.P = null;
                                            }
                                            arrayList9 = launchActivity.Q;
                                            if (arrayList9.size() > 1) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            MessageObject messageObject7 = messageObject;
                                            SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList9, j12, messageObject7, messageObject7, null, null, false, z19, null, z22, i16, i11, 0, false, null, null, 0L, false, 0L, 0L, null);
                                            j12 = j12;
                                            messageObject = messageObject7;
                                        }
                                    }
                                    z20 = false;
                                    z14 = false;
                                } else {
                                    rnVar3 = rnVar2;
                                    i12 = i12;
                                    j13 = j11;
                                    if (launchActivity.N != null) {
                                        charSequence12 = launchActivity.P;
                                        if (charSequence12 != null) {
                                            charSequence3 = launchActivity.P;
                                            launchActivity.P = null;
                                        }
                                        CharSequence charSequence111 = charSequence3;
                                        ArrayList arrayList111 = new ArrayList();
                                        arrayList111.add(launchActivity.N);
                                        int i111 = i16;
                                        j12 = j10;
                                        accountInstance2 = accountInstance;
                                        SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) arrayList111, (ArrayList<String>) arrayList111, (ArrayList<Uri>) null, charSequence111, (String) null, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i111, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                        charSequence3 = charSequence111;
                                        i16 = i111;
                                    } else {
                                        j12 = j10;
                                        accountInstance2 = accountInstance;
                                        arrayList8 = launchActivity.Q;
                                        if (arrayList8 != null) {
                                            charSequence11 = launchActivity.P;
                                            if (charSequence11 != null) {
                                                CharSequence[] charSequenceArr7 = {launchActivity.P};
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).entities = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr7, false);
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).caption = charSequenceArr7[0].toString();
                                                launchActivity.P = null;
                                            }
                                            arrayList9 = launchActivity.Q;
                                            if (arrayList9.size() > 1) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            MessageObject messageObject8 = messageObject;
                                            SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList9, j12, messageObject8, messageObject8, null, null, false, z19, null, z22, i16, i11, 0, false, null, null, 0L, false, 0L, 0L, null);
                                            j12 = j12;
                                            messageObject = messageObject8;
                                        }
                                    }
                                    z20 = false;
                                    z14 = false;
                                }
                            } else {
                                arrayList7 = launchActivity.Q;
                                if (arrayList7 != null) {
                                    rnVar3 = rnVar2;
                                    i12 = i12;
                                    j13 = j11;
                                    if (launchActivity.N != null) {
                                        charSequence12 = launchActivity.P;
                                        if (charSequence12 != null) {
                                            charSequence3 = launchActivity.P;
                                            launchActivity.P = null;
                                        }
                                        CharSequence charSequence112 = charSequence3;
                                        ArrayList arrayList112 = new ArrayList();
                                        arrayList112.add(launchActivity.N);
                                        int i112 = i16;
                                        j12 = j10;
                                        accountInstance2 = accountInstance;
                                        SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) arrayList112, (ArrayList<String>) arrayList112, (ArrayList<Uri>) null, charSequence112, (String) null, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i112, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                        charSequence3 = charSequence112;
                                        i16 = i112;
                                    } else {
                                        j12 = j10;
                                        accountInstance2 = accountInstance;
                                        arrayList8 = launchActivity.Q;
                                        if (arrayList8 != null) {
                                            charSequence11 = launchActivity.P;
                                            if (charSequence11 != null) {
                                                CharSequence[] charSequenceArr8 = {launchActivity.P};
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).entities = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr8, false);
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).caption = charSequenceArr8[0].toString();
                                                launchActivity.P = null;
                                            }
                                            arrayList9 = launchActivity.Q;
                                            if (arrayList9.size() > 1) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            MessageObject messageObject9 = messageObject;
                                            SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList9, j12, messageObject9, messageObject9, null, null, false, z19, null, z22, i16, i11, 0, false, null, null, 0L, false, 0L, 0L, null);
                                            j12 = j12;
                                            messageObject = messageObject9;
                                        }
                                    }
                                    z20 = false;
                                    z14 = false;
                                } else {
                                    rnVar3 = rnVar2;
                                    i12 = i12;
                                    j13 = j11;
                                    if (launchActivity.N != null) {
                                        charSequence12 = launchActivity.P;
                                        if (charSequence12 != null) {
                                            charSequence3 = launchActivity.P;
                                            launchActivity.P = null;
                                        }
                                        CharSequence charSequence113 = charSequence3;
                                        ArrayList arrayList113 = new ArrayList();
                                        arrayList113.add(launchActivity.N);
                                        int i113 = i16;
                                        j12 = j10;
                                        accountInstance2 = accountInstance;
                                        SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) arrayList113, (ArrayList<String>) arrayList113, (ArrayList<Uri>) null, charSequence113, (String) null, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i113, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                        charSequence3 = charSequence113;
                                        i16 = i113;
                                    } else {
                                        j12 = j10;
                                        accountInstance2 = accountInstance;
                                        arrayList8 = launchActivity.Q;
                                        if (arrayList8 != null) {
                                            charSequence11 = launchActivity.P;
                                            if (charSequence11 != null) {
                                                CharSequence[] charSequenceArr9 = {launchActivity.P};
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).entities = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr9, false);
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).caption = charSequenceArr9[0].toString();
                                                launchActivity.P = null;
                                            }
                                            arrayList9 = launchActivity.Q;
                                            if (arrayList9.size() > 1) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            MessageObject messageObject10 = messageObject;
                                            SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList9, j12, messageObject10, messageObject10, null, null, false, z19, null, z22, i16, i11, 0, false, null, null, 0L, false, 0L, 0L, null);
                                            j12 = j12;
                                            messageObject = messageObject10;
                                        }
                                    }
                                    z20 = false;
                                    z14 = false;
                                }
                            }
                            z15 = z20;
                        } else {
                            rnVar3 = rnVar2;
                            i12 = i12;
                            j12 = j10;
                            j13 = j11;
                            accountInstance2 = accountInstance;
                            if (launchActivity.N != null) {
                                charSequence5 = launchActivity.P;
                                if (charSequence5 != null) {
                                    charSequence3 = launchActivity.P;
                                    launchActivity.P = null;
                                }
                                CharSequence charSequence114 = charSequence3;
                                ArrayList arrayList23 = new ArrayList();
                                arrayList23.add(launchActivity.N);
                                int i114 = i16;
                                SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) arrayList23, (ArrayList<String>) arrayList23, (ArrayList<Uri>) null, charSequence114, (String) null, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i114, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                i16 = i114;
                                charSequence3 = charSequence114;
                            }
                            if (launchActivity.Q != null) {
                                charSequence4 = launchActivity.P;
                                if (charSequence4 != null) {
                                    CharSequence[] charSequenceArr10 = {launchActivity.P};
                                    ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).entities = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr10, false);
                                    ((SendMessagesHelper.SendingMediaInfo) launchActivity.Q.get(0)).caption = charSequenceArr10[0].toString();
                                    launchActivity.P = null;
                                }
                                arrayList3 = launchActivity.Q;
                                if (arrayList3.size() > 1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                MessageObject messageObject11 = messageObject;
                                SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList3, j12, messageObject11, messageObject11, null, null, false, z16, null, z22, i16, i11, 0, false, null, null, 0L, false, 0L, 0L, null);
                                j12 = j12;
                                messageObject = messageObject11;
                            }
                            z14 = false;
                            z15 = false;
                        }
                        boolean z24 = z13;
                        if (launchActivity.R == null) {
                            charSequence6 = launchActivity.P;
                            if (charSequence6 != null) {
                                arrayList4 = launchActivity.R;
                                if (arrayList4 != null) {
                                    size = arrayList4.size();
                                } else {
                                    size = 0;
                                }
                                arrayList5 = launchActivity.S;
                                if (arrayList5 != null) {
                                    size2 = arrayList5.size();
                                } else {
                                    size2 = 0;
                                }
                                if (size + size2 == 1) {
                                    charSequence3 = launchActivity.P;
                                    launchActivity.P = null;
                                }
                            }
                            CharSequence charSequence21 = charSequence3;
                            int i22 = i16;
                            SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) launchActivity.R, (ArrayList<String>) launchActivity.V, (ArrayList<Uri>) launchActivity.S, charSequence21, launchActivity.U, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i22, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                            i16 = i22;
                            charSequence7 = charSequence21;
                        } else {
                            charSequence6 = launchActivity.P;
                            if (charSequence6 != null) {
                                arrayList4 = launchActivity.R;
                                if (arrayList4 != null) {
                                    size = arrayList4.size();
                                } else {
                                    size = 0;
                                }
                                arrayList5 = launchActivity.S;
                                if (arrayList5 != null) {
                                    size2 = arrayList5.size();
                                } else {
                                    size2 = 0;
                                }
                                if (size + size2 == 1) {
                                    charSequence3 = launchActivity.P;
                                    launchActivity.P = null;
                                }
                            }
                            CharSequence charSequence22 = charSequence3;
                            int i23 = i16;
                            SendMessagesHelper.prepareSendingDocuments(accountInstance2, (ArrayList<String>) launchActivity.R, (ArrayList<String>) launchActivity.V, (ArrayList<Uri>) launchActivity.S, charSequence22, launchActivity.U, j12, messageObject, messageObject, (TL_stories.StoryItem) null, (hn) null, (MessageObject) null, z22, i23, (t0.j) null, (SendMessageChatArguments) null, 0L, false, 0L);
                            i16 = i23;
                            charSequence7 = charSequence22;
                        }
                        accountInstance3 = accountInstance2;
                        if (launchActivity.O != null) {
                            file = new File(launchActivity.O);
                            if (file.exists()) {
                                TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
                                tL_document2.file_reference = new byte[0];
                                tL_document2.dc_id = Integer.MIN_VALUE;
                                tL_document2.f22386id = SharedConfig.getLastLocalId();
                                tL_document2.user_id = accountInstance3.getUserConfig().getClientUserId();
                                tL_document2.mime_type = "audio/ogg";
                                tL_document2.date = accountInstance3.getConnectionsManager().getCurrentTime();
                                tL_document2.size = (int) file.length();
                                tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.voice = true;
                                waveform = MediaController.getWaveform(file.getAbsolutePath());
                                tL_documentAttributeAudio.waveform = waveform;
                                if (waveform != null) {
                                    tL_documentAttributeAudio.flags |= 4;
                                }
                                tL_document2.attributes.add(tL_documentAttributeAudio);
                                CharSequence[] charSequenceArr11 = {launchActivity.P};
                                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(launchActivity.K).getEntities(charSequenceArr11, false);
                                SendMessagesHelper sendMessagesHelper3 = accountInstance3.getSendMessagesHelper();
                                String absolutePath2 = file.getAbsolutePath();
                                charSequence10 = charSequenceArr11[0];
                                if (charSequence10 == null) {
                                    string = null;
                                } else {
                                    string = charSequence10.toString();
                                }
                                long j19 = j12;
                                MessageObject messageObject12 = messageObject;
                                SendMessagesHelper.SendMessageParams sendMessageParamsOf3 = SendMessagesHelper.SendMessageParams.of(tL_document2, null, absolutePath2, j19, messageObject12, messageObject, string, entities3, null, null, z22, i16, i11, 0, null, null, false);
                                j12 = j19;
                                messageObject = messageObject12;
                                sendMessagesHelper3.sendMessage(sendMessageParamsOf3);
                                if (launchActivity.P != null) {
                                    launchActivity.P = null;
                                }
                            }
                        }
                        j14 = j13;
                        charSequence8 = launchActivity.P;
                        int i24 = i12;
                        if (charSequence8 != null) {
                            accountInstance4 = accountInstance3;
                            j15 = j14;
                            y0(accountInstance4, gyVar2, charSequence8, j12, messageObject, j15, z22, i16, i11);
                        } else {
                            accountInstance4 = accountInstance3;
                            j15 = j14;
                        }
                        arrayList6 = launchActivity.W;
                        if (arrayList6 != null) {
                            i13 = 0;
                            while (i13 < launchActivity.W.size()) {
                                TLRPC.User user2 = (TLRPC.User) launchActivity.W.get(i13);
                                SendMessagesHelper sendMessagesHelper4 = SendMessagesHelper.getInstance(currentAccount);
                                long j110 = j12;
                                MessageObject messageObject13 = messageObject;
                                SendMessagesHelper.SendMessageParams sendMessageParamsOf4 = SendMessagesHelper.SendMessageParams.of(user2, j110, messageObject13, messageObject, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z22, i16, i11);
                                j12 = j110;
                                messageObject = messageObject13;
                                sendMessagesHelper4.sendMessage(sendMessageParamsOf4);
                                i13++;
                                launchActivity = this;
                            }
                        }
                        if (TextUtils.isEmpty(charSequence2)) {
                            charSequence9 = charSequence2;
                        } else {
                            charSequence9 = charSequence2;
                        }
                        i12 = i24 + 1;
                        gyVar2 = gyVar;
                        arrayList2 = arrayList;
                        charSequence2 = charSequence9;
                        rnVar2 = rnVar3;
                        launchActivity = this;
                        charSequence3 = charSequence7;
                        z13 = z24;
                    }
                } else {
                    org.telegram.ui.Components.be0 be0Var = new org.telegram.ui.Components.be0((org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList22), null, null, this.X, null, null, null, null, null);
                    rnVar2 = rnVar;
                    final int i25 = i16;
                    launchActivity = this;
                    be0Var.G = new org.telegram.ui.Components.bj() {
                        @Override
                        public final void b(TLRPC.User user3, boolean z25, int i26, long j20) {
                            MessageObject messageObject14;
                            TLRPC.TL_forumTopic tL_forumTopicFindTopic2;
                            Pattern pattern = LaunchActivity.f35496x1;
                            rn rnVar6 = rnVar2;
                            if (rnVar6 != null) {
                                ((ActionBarLayout) this.f42830a.O()).S(rnVar6, true, false);
                            }
                            AccountInstance accountInstance5 = AccountInstance.getInstance(UserConfig.selectedAccount);
                            int i27 = 0;
                            while (true) {
                                ArrayList arrayList24 = arrayList;
                                if (i27 >= arrayList24.size()) {
                                    return;
                                }
                                long j21 = ((MessagesStorage.TopicKey) arrayList24.get(i27)).dialogId;
                                long j22 = ((MessagesStorage.TopicKey) arrayList24.get(i27)).topicId;
                                if (j22 == 0 || (tL_forumTopicFindTopic2 = accountInstance5.getMessagesController().getTopicsController().findTopic(-j21, j22)) == null || tL_forumTopicFindTopic2.topicStartMessage == null) {
                                    messageObject14 = null;
                                } else {
                                    messageObject14 = new MessageObject(accountInstance5.getCurrentAccount(), tL_forumTopicFindTopic2.topicStartMessage, false, false);
                                    messageObject14.isTopicMainMessage = true;
                                }
                                MessageObject messageObject15 = messageObject14;
                                int i28 = i25;
                                int i29 = i26 != 0 ? i26 : i28;
                                int i30 = i11;
                                SendMessagesHelper.SendMessageParams sendMessageParamsOf5 = SendMessagesHelper.SendMessageParams.of(user3, j21, messageObject15, messageObject15, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z25, i29, i30);
                                int i31 = i28;
                                CharSequence charSequence23 = charSequence;
                                if (TextUtils.isEmpty(charSequence23)) {
                                    sendMessageParamsOf5.effect_id = 0L;
                                }
                                sendMessageParamsOf5.invert_media = false;
                                SendMessagesHelper.getInstance(currentAccount).sendMessage(sendMessageParamsOf5);
                                if (!TextUtils.isEmpty(charSequence23)) {
                                    if (i26 != 0) {
                                        i31 = i26;
                                    }
                                    SendMessagesHelper.prepareSendingText(accountInstance5, charSequence23, j21, z22, i31, i30, 0L);
                                }
                                i27++;
                            }
                        }

                        @Override
                        public final void c(ArrayList arrayList24, String str4, boolean z25, int i26, long j20, boolean z26) {
                        }
                    };
                    ((org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList22)).showDialog(be0Var);
                    z13 = true;
                }
            }
            launchActivity2 = launchActivity;
            rn rnVar6 = rnVar2;
            if (gyVar != null && rnVar6 == null && !z13) {
                gyVar.finishFragment();
            }
            r10 = 0;
        }
        launchActivity2.Q = r10;
        launchActivity2.N = r10;
        launchActivity2.O = r10;
        launchActivity2.P = r10;
        launchActivity2.R = r10;
        launchActivity2.V = r10;
        launchActivity2.W = r10;
        launchActivity2.X = r10;
        launchActivity2.T = r10;
        return true;
    }

    public final void w0(Uri uri) throws Throwable {
        Throwable th;
        InputStream inputStreamOpenInputStream;
        int i10 = UserConfig.selectedAccount;
        InputStream inputStream = null;
        string = null;
        string = null;
        string = null;
        string = null;
        String string = null;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this, 3, null);
        int[] iArr = {0};
        String strFixFileName = FileLoader.fixFileName(MediaController.getFileName(uri));
        if (strFixFileName == null || !strFixFileName.endsWith(".zip")) {
            try {
                inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream));
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = 0;
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null || i11 >= 100) {
                                break;
                            }
                            sb2.append(line);
                            sb2.append('\n');
                            i11++;
                        }
                        string = sb2.toString();
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamOpenInputStream;
                        if (inputStream == null) {
                            throw th;
                        }
                        try {
                            inputStream.close();
                            throw th;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            throw th;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    FileLog.e(e);
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                }
            } catch (Exception e12) {
                e = e12;
                inputStreamOpenInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            try {
                ZipInputStream zipInputStream = new ZipInputStream(getContentResolver().openInputStream(uri));
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    while (true) {
                        if (nextEntry != null) {
                            String name = nextEntry.getName();
                            if (name == null) {
                                nextEntry = zipInputStream.getNextEntry();
                            } else {
                                int iLastIndexOf = name.lastIndexOf("/");
                                if (iLastIndexOf >= 0) {
                                    name = name.substring(iLastIndexOf + 1);
                                }
                                if (name.endsWith(".txt")) {
                                    try {
                                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(zipInputStream));
                                        StringBuilder sb3 = new StringBuilder();
                                        int i12 = 0;
                                        while (true) {
                                            String line2 = bufferedReader2.readLine();
                                            if (line2 == null || i12 >= 100) {
                                                break;
                                            }
                                            sb3.append(line2);
                                            sb3.append('\n');
                                            i12++;
                                        }
                                        string = sb3.toString();
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                } else {
                                    nextEntry = zipInputStream.getNextEntry();
                                }
                            }
                        }
                        zipInputStream.closeEntry();
                        break;
                    }
                    zipInputStream.close();
                } catch (Throwable th4) {
                    try {
                        try {
                            zipInputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        string = null;
                        try {
                            FileLog.e(e);
                        } catch (Exception e15) {
                            FileLog.e(e15);
                        }
                        if (string == null) {
                            return;
                        }
                        TLRPC.TL_messages_checkHistoryImport tL_messages_checkHistoryImport = new TLRPC.TL_messages_checkHistoryImport();
                        tL_messages_checkHistoryImport.import_head = string;
                        iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkHistoryImport, new jh.b8(this, uri, i10, b2Var, 6));
                        b2Var.setOnCancelListener(new az(i10, 1, iArr));
                        try {
                            b2Var.q(300L);
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            } catch (Exception e16) {
                e = e16;
            }
        }
        if (string == null) {
            return;
        }
        TLRPC.TL_messages_checkHistoryImport tL_messages_checkHistoryImport2 = new TLRPC.TL_messages_checkHistoryImport();
        tL_messages_checkHistoryImport2.import_head = string;
        iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkHistoryImport2, new jh.b8(this, uri, i10, b2Var, 6));
        b2Var.setOnCancelListener(new az(i10, 1, iArr));
        b2Var.q(300L);
    }

    public final void x0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap map, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, final String str26, final String str27, final we.d dVar, final boolean z12, final int i13, final boolean z13, final int i14, final int i15, final String str28, final String str29, final boolean z14, final String str30, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final String str31, final Integer num3, final boolean z20, final byte[] bArr) {
        final LaunchActivity launchActivity;
        final int[] iArr;
        org.telegram.ui.ActionBar.b2 b2Var;
        a30 a30Var;
        final int i16;
        org.telegram.ui.ActionBar.b2 b2Var2;
        int[] iArr2;
        a30 a30Var2;
        org.telegram.ui.Components.cv cvVar;
        org.telegram.ui.Components.ex0 ex0Var;
        TLRPC.Chat chat;
        if (i11 == 0 && UserConfig.getActivatedAccountsCount() >= 2 && map != null) {
            org.telegram.ui.Components.y4.i(this, new org.telegram.ui.Components.v4() {
                @Override
                public final void a(int i17) {
                    Pattern pattern = LaunchActivity.f35496x1;
                    LaunchActivity launchActivity2 = this.f44331a;
                    if (i17 != i10) {
                        launchActivity2.K0(i17);
                    }
                    launchActivity2.x0(i17, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z10, num, l10, l11, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z11, str22, 1, i12, str23, str24, str25, str26, str27, dVar, z12, i13, z13, i14, i15, str28, str29, z14, str30, z15, z16, z17, z18, z19, str31, num3, z20, bArr);
                }
            }).show();
            return;
        }
        final we.d dVar2 = dVar;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        final int i17 = 0;
        if (str16 != null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i18 = NotificationCenter.didReceiveSmsCode;
            if (globalInstance.hasObservers(i18)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i18, str16);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder.f22702a;
            b2Var3.N = string;
            b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OtherLoginCode, str16));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            B0(alertDialog$Builder);
            return;
        }
        if (str17 != null) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            String string2 = LocaleController.getString(R.string.AuthAnotherClient);
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder2.f22702a;
            b2Var4.N = string2;
            b2Var4.P = LocaleController.getString(R.string.AuthAnotherClientUrl);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
            B0(alertDialog$Builder2);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var5 = new org.telegram.ui.ActionBar.b2(this, 3, null);
        final a30 a30Var3 = new a30(17, dVar2, b2Var5);
        int[] iArr3 = {0};
        if (str10 == null) {
            if (str11 != null) {
                TL_chatlists.TL_chatlists_checkChatlistInvite tL_chatlists_checkChatlistInvite = new TL_chatlists.TL_chatlists_checkChatlistInvite();
                tL_chatlists_checkChatlistInvite.slug = str11;
                final int i19 = 1;
                launchActivity = this;
                iArr3[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_chatlists_checkChatlistInvite, new RequestDelegate(this) {

                    public final LaunchActivity f45111b;

                    {
                        this.f45111b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i19) {
                            case 0:
                                Pattern pattern = LaunchActivity.f35496x1;
                                AndroidUtilities.runOnUIThread(new j80(this.f45111b, tLObject, i10, str11, tL_error, a30Var3));
                                break;
                            case 1:
                                Pattern pattern2 = LaunchActivity.f35496x1;
                                AndroidUtilities.runOnUIThread(new gh.e1(this.f45111b, tLObject, i10, str11, a30Var3, 22));
                                break;
                            default:
                                Pattern pattern3 = LaunchActivity.f35496x1;
                                AndroidUtilities.runOnUIThread(new j80(this.f45111b, tL_error, tLObject, i10, str11, a30Var3));
                                break;
                        }
                    }
                });
            } else {
                launchActivity = this;
                if (str29 == null) {
                    if (str28 != null) {
                        GiftAuctionController giftAuctionController = GiftAuctionController.getInstance(launchActivity.K);
                        final char c13 = c12 == true ? 1 : 0;
                        iArr3[0] = giftAuctionController.requestGiftAuctionBySlug(str28, new Utilities.Callback2(launchActivity) {

                            public final LaunchActivity f36475b;

                            {
                                this.f36475b = launchActivity;
                            }

                            @Override
                            public final void run(Object obj, Object obj2) {
                                GiftAuctionController.Auction auction;
                                int i20 = c13;
                                a30 a30Var4 = a30Var3;
                                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                switch (i20) {
                                    case 0:
                                        LaunchActivity launchActivity2 = this.f36475b;
                                        if (tL_error != null) {
                                            org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity2.Z)).Q(R.raw.error, 36, launchActivity2.getString(R.string.GiftAuctionNotFound)).j();
                                        } else {
                                            Pattern pattern = LaunchActivity.f35496x1;
                                            if (tL_StarGiftAuctionState != null && (auction = GiftAuctionController.getInstance(launchActivity2.K).getAuction(tL_StarGiftAuctionState.gift.f22607id)) != null) {
                                                new hh.l1(launchActivity2, null, launchActivity2.K, auction.gift.title, auction.previewAttributes, false).show();
                                            }
                                        }
                                        try {
                                            a30Var4.run();
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                            return;
                                        }
                                        break;
                                    default:
                                        LaunchActivity launchActivity3 = this.f36475b;
                                        if (tL_error != null) {
                                            org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity3.Z)).Q(R.raw.error, 36, launchActivity3.getString(R.string.GiftAuctionNotFound)).j();
                                        } else {
                                            Pattern pattern2 = LaunchActivity.f35496x1;
                                            if (tL_StarGiftAuctionState != null) {
                                                int i21 = launchActivity3.K;
                                                long j10 = tL_StarGiftAuctionState.gift.f22607id;
                                                org.telegram.ui.Components.oc[] ocVarArr = gh.i0.f7301l0;
                                                GiftAuctionController.getInstance(i21).getOrRequestAuction(j10, new gh.w(launchActivity3, (org.telegram.ui.ActionBar.c6) null, i21, 0L, (Runnable) null));
                                            }
                                        }
                                        try {
                                            a30Var4.run();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        break;
                                }
                            }
                        });
                    } else if (str19 != null) {
                        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                        getuniquestargift.slug = str19;
                        final int i20 = 2;
                        iArr3[0] = ConnectionsManager.getInstance(i10).sendRequest(getuniquestargift, new RequestDelegate(launchActivity) {

                            public final LaunchActivity f45111b;

                            {
                                this.f45111b = launchActivity;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i20) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.f35496x1;
                                        AndroidUtilities.runOnUIThread(new j80(this.f45111b, tLObject, i10, str19, tL_error, a30Var3));
                                        break;
                                    case 1:
                                        Pattern pattern2 = LaunchActivity.f35496x1;
                                        AndroidUtilities.runOnUIThread(new gh.e1(this.f45111b, tLObject, i10, str19, a30Var3, 22));
                                        break;
                                    default:
                                        Pattern pattern3 = LaunchActivity.f35496x1;
                                        AndroidUtilities.runOnUIThread(new j80(this.f45111b, tL_error, tLObject, i10, str19, a30Var3));
                                        break;
                                }
                            }
                        });
                    } else if (str18 != null) {
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                        tL_inputInvoiceSlug.slug = str18;
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                        iArr3[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new gf.j0(this, tL_inputInvoiceSlug, a30Var3, i10, str18, 11));
                    } else {
                        if (str != null) {
                            if (dVar2 != null) {
                                dVar2.d();
                            }
                            UserNameResolver userNameResolver = MessagesController.getInstance(i10).getUserNameResolver();
                            i10 = i10;
                            iArr = iArr3;
                            b2Var = b2Var5;
                            d5.d dVar3 = new d5.d() {
                                @Override
                                public final void accept(java.lang.Object r77) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ba0.accept(java.lang.Object):void");
                                }
                            };
                            dVar2 = dVar2;
                            userNameResolver.resolve(str, str31, dVar3);
                        } else {
                            String str32 = str3;
                            iArr = iArr3;
                            b2Var = b2Var5;
                            if (str2 == null) {
                                a30Var = null;
                                ArrayList arrayList = this.Z;
                                if (str32 != null) {
                                    if (arrayList.isEmpty()) {
                                        return;
                                    }
                                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                    tL_inputStickerSetShortName.short_name = str32;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList);
                                    if (n2Var instanceof rn) {
                                        rn rnVar = (rn) n2Var;
                                        ex0Var = new org.telegram.ui.Components.ex0(this, n2Var, tL_inputStickerSetShortName, null, (rnVar.K0.getVisibility() == 0 || !((chat = rnVar.f42026e) == null || ChatObject.canSendStickers(chat))) ? null : rnVar.U, rnVar.getResourceProvider());
                                        ex0Var.setCalcMandatoryInsets(rnVar.x9());
                                    } else {
                                        ex0Var = new org.telegram.ui.Components.ex0(this, n2Var, tL_inputStickerSetShortName, null, null, null);
                                    }
                                    ex0Var.M = str4 != null;
                                    n2Var.showDialog(ex0Var);
                                    return;
                                }
                                if (str4 != null) {
                                    if (arrayList.isEmpty()) {
                                        return;
                                    }
                                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
                                    if (str32 == null) {
                                        str32 = str4;
                                    }
                                    tL_inputStickerSetShortName2.short_name = str32;
                                    ArrayList arrayList2 = new ArrayList(1);
                                    arrayList2.add(tL_inputStickerSetShortName2);
                                    org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList);
                                    if (n2Var2 instanceof rn) {
                                        rn rnVar2 = (rn) n2Var2;
                                        cvVar = new org.telegram.ui.Components.cv(n2Var2, this, rnVar2.getResourceProvider(), arrayList2);
                                        cvVar.setCalcMandatoryInsets(rnVar2.x9());
                                    } else {
                                        cvVar = new org.telegram.ui.Components.cv(n2Var2, this, null, arrayList2);
                                    }
                                    n2Var2.showDialog(cvVar);
                                    return;
                                }
                                if (str9 != null) {
                                    gy gyVar = new gy(org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true));
                                    gyVar.f38621y2 = new pg(this, z10, i10, str9);
                                    i16 = 0;
                                    q0(gyVar, false, true);
                                    i10 = i10;
                                } else {
                                    i16 = 0;
                                    if (map != null) {
                                        long jLongValue = Utilities.parseLong((String) map.get("bot_id")).longValue();
                                        if (jLongValue == 0) {
                                            return;
                                        }
                                        String str33 = (String) map.get("payload");
                                        String str34 = (String) map.get("nonce");
                                        String str35 = (String) map.get("callback_url");
                                        TL_account.getAuthorizationForm getauthorizationform = new TL_account.getAuthorizationForm();
                                        getauthorizationform.bot_id = jLongValue;
                                        getauthorizationform.scope = (String) map.get("scope");
                                        getauthorizationform.public_key = (String) map.get("public_key");
                                        iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new m80(this, iArr, i10, a30Var3, getauthorizationform, str33, str34, str35, 1));
                                    } else if (str15 != null) {
                                        TLRPC.TL_help_getDeepLinkInfo tL_help_getDeepLinkInfo = new TLRPC.TL_help_getDeepLinkInfo();
                                        tL_help_getDeepLinkInfo.path = str15;
                                        iArr[0] = ConnectionsManager.getInstance(this.K).sendRequest(tL_help_getDeepLinkInfo, new RequestDelegate(this) {

                                            public final LaunchActivity f44744b;

                                            {
                                                this.f44744b = this;
                                            }

                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                switch (i16) {
                                                    case 0:
                                                        Pattern pattern = LaunchActivity.f35496x1;
                                                        AndroidUtilities.runOnUIThread(new lq(this.f44744b, a30Var3, tLObject, 15));
                                                        break;
                                                    default:
                                                        Pattern pattern2 = LaunchActivity.f35496x1;
                                                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(this.f44744b, a30Var3, tLObject, tL_error, 8));
                                                        break;
                                                }
                                            }
                                        });
                                    } else if (str14 != null) {
                                        TLRPC.TL_langpack_getLanguage tL_langpack_getLanguage = new TLRPC.TL_langpack_getLanguage();
                                        tL_langpack_getLanguage.lang_code = str14;
                                        tL_langpack_getLanguage.lang_pack = "android";
                                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.K);
                                        final char c14 = c11 == true ? 1 : 0;
                                        iArr[0] = connectionsManager.sendRequest(tL_langpack_getLanguage, new RequestDelegate(this) {

                                            public final LaunchActivity f44744b;

                                            {
                                                this.f44744b = this;
                                            }

                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                switch (c14) {
                                                    case 0:
                                                        Pattern pattern = LaunchActivity.f35496x1;
                                                        AndroidUtilities.runOnUIThread(new lq(this.f44744b, a30Var3, tLObject, 15));
                                                        break;
                                                    default:
                                                        Pattern pattern2 = LaunchActivity.f35496x1;
                                                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(this.f44744b, a30Var3, tLObject, tL_error, 8));
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        int i21 = 16;
                                        if (tL_wallPaper != null) {
                                            if (TextUtils.isEmpty(tL_wallPaper.slug)) {
                                                try {
                                                    TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                                                    int i22 = wallPaperSettings.third_background_color;
                                                    AndroidUtilities.runOnUIThread(new a30(15, this, new nc1(i22 != 0 ? new wh1("c", wallPaperSettings.background_color, wallPaperSettings.second_background_color, i22, wallPaperSettings.fourth_background_color) : new wh1(wallPaperSettings.background_color, wallPaperSettings.second_background_color, "c", AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false)), null, true)));
                                                } catch (Exception e9) {
                                                    FileLog.e(e9);
                                                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                                    tL_inputWallPaperSlug.slug = tL_wallPaper.slug;
                                                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                                    iArr[0] = ConnectionsManager.getInstance(this.K).sendRequest(getwallpaper, new z9(this, a30Var3, tL_wallPaper, i21));
                                                }
                                            } else {
                                                TL_account.getWallPaper getwallpaper2 = new TL_account.getWallPaper();
                                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug2 = new TLRPC.TL_inputWallPaperSlug();
                                                tL_inputWallPaperSlug2.slug = tL_wallPaper.slug;
                                                getwallpaper2.wallpaper = tL_inputWallPaperSlug2;
                                                iArr[0] = ConnectionsManager.getInstance(this.K).sendRequest(getwallpaper2, new z9(this, a30Var3, tL_wallPaper, i21));
                                            }
                                        } else if (str20 != null) {
                                            a30Var2 = new a30(i21, this, dVar2);
                                            TL_account.getTheme gettheme = new TL_account.getTheme();
                                            gettheme.format = "android";
                                            TLRPC.TL_inputThemeSlug tL_inputThemeSlug = new TLRPC.TL_inputThemeSlug();
                                            tL_inputThemeSlug.slug = str20;
                                            gettheme.theme = tL_inputThemeSlug;
                                            b2Var2 = b2Var;
                                            iArr[0] = ConnectionsManager.getInstance(this.K).sendRequest(gettheme, new z9(this, b2Var2, a30Var3, 17));
                                            i10 = i10;
                                            iArr2 = iArr;
                                        } else {
                                            b2Var2 = b2Var;
                                            if (l10 == null || (num == null && !z14)) {
                                                i10 = i10;
                                                iArr2 = iArr;
                                                if (str30 != null) {
                                                    TL_account.resolveBusinessChatLink resolvebusinesschatlink = new TL_account.resolveBusinessChatLink();
                                                    resolvebusinesschatlink.slug = str30;
                                                    ConnectionsManager.getInstance(this.K).sendRequest(resolvebusinesschatlink, new q90(this, c10 == true ? 1 : 0));
                                                }
                                            } else {
                                                if (l11 != null) {
                                                    TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(l10);
                                                    if (chat2 != null) {
                                                        iArr[0] = v0(i10, a30Var3, num, num2, l11, num3, null, chat2, null, null, 0, -1);
                                                    } else {
                                                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                                                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                                                        tL_inputChannel.channel_id = l10.longValue();
                                                        tL_channels_getChannels.f22416id.add(tL_inputChannel);
                                                        iArr[0] = ConnectionsManager.getInstance(this.K).sendRequest(tL_channels_getChannels, new m80(this, iArr, i10, a30Var3, num, num2, l11, num3, 2));
                                                    }
                                                } else {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("chat_id", l10.longValue());
                                                    if (num != null) {
                                                        bundle.putInt("message_id", num.intValue());
                                                    }
                                                    if (num3 != null) {
                                                        bundle.putInt("task_id", num3.intValue());
                                                    }
                                                    if (bArr != null) {
                                                        bundle.putByteArray("poll_option_id", bArr);
                                                    }
                                                    TLRPC.Chat chat3 = MessagesController.getInstance(this.K).getChat(l10);
                                                    if (chat3 != null && ChatObject.isBoostSupported(chat3) && z14) {
                                                        s0(Long.valueOf(-l10.longValue()), a30Var3, dVar2, null);
                                                    } else if (chat3 == null || !chat3.forum) {
                                                        org.telegram.ui.ActionBar.n2 n2Var3 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList) : null;
                                                        if (n2Var3 == null || MessagesController.getInstance(i10).checkCanOpenChat(bundle, n2Var3)) {
                                                            iArr2 = iArr;
                                                            i10 = i10;
                                                            AndroidUtilities.runOnUIThread(new x80(this, bundle, l10, iArr, a30Var3, z14, dVar2, l11, num, num3, bArr, n2Var3, i10));
                                                        }
                                                    } else {
                                                        k0(-l10.longValue(), num, null, num3, bArr, new g80(a30Var3, 2), 0, -1);
                                                    }
                                                }
                                                i10 = i10;
                                                iArr2 = iArr;
                                            }
                                        }
                                    }
                                    i10 = i10;
                                }
                                iArr2 = iArr;
                                b2Var2 = b2Var;
                            } else if (i11 == 0) {
                                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                                tL_messages_checkChatInvite.hash = str2;
                                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new gf.j0(this, i10, b2Var, a30Var3, str2, 12), 2);
                                i10 = i10;
                            } else {
                                if (i11 == 1) {
                                    TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                    tL_messages_importChatInvite.hash = str2;
                                    a30Var = null;
                                    ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_importChatInvite, null, new bg(this, a30Var3, i10), 2);
                                } else {
                                    a30Var = null;
                                }
                                i10 = i10;
                                iArr2 = iArr;
                                b2Var2 = b2Var;
                                i16 = 0;
                            }
                            a30Var2 = a30Var;
                        }
                        iArr2 = iArr;
                        b2Var2 = b2Var;
                        i16 = 0;
                        a30Var = null;
                        a30Var2 = a30Var;
                    }
                    if (iArr2[i16] != 0) {
                        b2Var2.setOnCancelListener(new org.telegram.ui.Components.x1(i10, iArr2, a30Var2));
                        if (dVar2 != null) {
                            dVar2.f49293b = new org.telegram.ui.Components.y2(i10, iArr2, a30Var2);
                        }
                        try {
                            if (dVar2 != null) {
                                dVar2.d();
                            } else {
                                b2Var2.q(300L);
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                iArr3[0] = GiftAuctionController.getInstance(launchActivity.K).requestGiftAuctionBySlug(str29, new Utilities.Callback2(launchActivity) {

                    public final LaunchActivity f36475b;

                    {
                        this.f36475b = launchActivity;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        GiftAuctionController.Auction auction;
                        int i23 = i17;
                        a30 a30Var4 = a30Var3;
                        TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (i23) {
                            case 0:
                                LaunchActivity launchActivity2 = this.f36475b;
                                if (tL_error != null) {
                                    org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity2.Z)).Q(R.raw.error, 36, launchActivity2.getString(R.string.GiftAuctionNotFound)).j();
                                } else {
                                    Pattern pattern = LaunchActivity.f35496x1;
                                    if (tL_StarGiftAuctionState != null && (auction = GiftAuctionController.getInstance(launchActivity2.K).getAuction(tL_StarGiftAuctionState.gift.f22607id)) != null) {
                                        new hh.l1(launchActivity2, null, launchActivity2.K, auction.gift.title, auction.previewAttributes, false).show();
                                    }
                                }
                                try {
                                    a30Var4.run();
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                                break;
                            default:
                                LaunchActivity launchActivity3 = this.f36475b;
                                if (tL_error != null) {
                                    org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity3.Z)).Q(R.raw.error, 36, launchActivity3.getString(R.string.GiftAuctionNotFound)).j();
                                } else {
                                    Pattern pattern2 = LaunchActivity.f35496x1;
                                    if (tL_StarGiftAuctionState != null) {
                                        int i24 = launchActivity3.K;
                                        long j10 = tL_StarGiftAuctionState.gift.f22607id;
                                        org.telegram.ui.Components.oc[] ocVarArr = gh.i0.f7301l0;
                                        GiftAuctionController.getInstance(i24).getOrRequestAuction(j10, new gh.w(launchActivity3, (org.telegram.ui.ActionBar.c6) null, i24, 0L, (Runnable) null));
                                    }
                                }
                                try {
                                    a30Var4.run();
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                break;
                        }
                    }
                });
            }
            iArr2 = iArr3;
            b2Var2 = b2Var5;
            i16 = 0;
            a30Var = null;
            a30Var2 = a30Var;
            if (iArr2[i16] != 0) {
                b2Var2.setOnCancelListener(new org.telegram.ui.Components.x1(i10, iArr2, a30Var2));
                if (dVar2 != null) {
                    dVar2.f49293b = new org.telegram.ui.Components.y2(i10, iArr2, a30Var2);
                }
                if (dVar2 != null) {
                    dVar2.d();
                } else {
                    b2Var2.q(300L);
                }
            }
        }
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str10;
        final int i23 = 0;
        iArr3[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_importContactToken, new RequestDelegate(this) {

            public final LaunchActivity f45111b;

            {
                this.f45111b = this;
            }

            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i23) {
                    case 0:
                        Pattern pattern = LaunchActivity.f35496x1;
                        AndroidUtilities.runOnUIThread(new j80(this.f45111b, tLObject, i10, str10, tL_error, a30Var3));
                        break;
                    case 1:
                        Pattern pattern2 = LaunchActivity.f35496x1;
                        AndroidUtilities.runOnUIThread(new gh.e1(this.f45111b, tLObject, i10, str10, a30Var3, 22));
                        break;
                    default:
                        Pattern pattern3 = LaunchActivity.f35496x1;
                        AndroidUtilities.runOnUIThread(new j80(this.f45111b, tL_error, tLObject, i10, str10, a30Var3));
                        break;
                }
            }
        });
        iArr2 = iArr3;
        b2Var2 = b2Var5;
        i16 = 0;
        a30Var = null;
        a30Var2 = a30Var;
        if (iArr2[i16] != 0) {
            b2Var2.setOnCancelListener(new org.telegram.ui.Components.x1(i10, iArr2, a30Var2));
            if (dVar2 != null) {
                dVar2.f49293b = new org.telegram.ui.Components.y2(i10, iArr2, a30Var2);
            }
            if (dVar2 != null) {
                dVar2.d();
            } else {
                b2Var2.q(300L);
            }
        }
    }

    public final void y(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.f35538u1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35538u1 = null;
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(i11 >= 26 ? getWindow().getNavigationBarColor() : 0, i10);
        this.f35538u1 = valueAnimatorOfArgb;
        valueAnimatorOfArgb.addUpdateListener(new n80(this, 1));
        this.f35538u1.addListener(new x0(this, i10, 3));
        this.f35538u1.setInterpolator(org.telegram.ui.Components.er.h);
        this.f35538u1.setDuration(320L);
        this.f35538u1.start();
    }

    public final void z(boolean z10) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z10 || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    boolean z11 = this.f35520k1;
                    this.f35520k1 = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z10, new hh.t5(this, z11, update, 27));
                    return;
                }
                if (z10 || Math.abs(System.currentTimeMillis() - SharedConfig.lastUpdateCheckTime) >= MessagesController.getInstance(0).updateCheckDelay * 1000) {
                    TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                    try {
                        tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
                    } catch (Exception unused) {
                    }
                    if (tL_help_getAppUpdate.source == null) {
                        tL_help_getAppUpdate.source = "";
                    }
                    int i10 = this.K;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new hh.u1(this, i10, 7));
                }
            }
        }
    }

    public final void z0(int i10) {
        this.f35539v0.setInternalNavigationBarColor(i10);
        org.telegram.ui.ActionBar.m3 m3VarP = P();
        if (m3VarP != null) {
            m3VarP.setNavigationBarColor(i10);
        }
    }

    @Override
    public final void e(int[] iArr) {
    }
}
