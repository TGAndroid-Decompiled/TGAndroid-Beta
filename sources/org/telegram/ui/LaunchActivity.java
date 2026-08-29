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
public class LaunchActivity extends h5 implements org.telegram.ui.ActionBar.y4, NotificationCenter.NotificationCenterDelegate, yx, bf.a {
    public static boolean A1;
    public static org.telegram.ui.Components.eu B1;
    public static LaunchActivity C1;
    public static Pattern D1;
    public static d0 E1;
    public static LaunchActivity F1;
    public static final Pattern f35560x1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean f35561y1;
    public static int f35562z1;
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
    public org.telegram.ui.ActionBar.f6 O0;
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
    public ih.u5 U0;
    public ArrayList V;
    public w5 V0;
    public ArrayList W;
    public final ArrayList W0;
    public Uri X;
    public final SparseIntArray X0;
    public int Y;
    public int Y0;
    public final la0 Z0;
    public FlagSecureReason f35564a1;
    public final LiteMode.BatteryReceiver f35566b1;
    public p90 f35567c0;
    public ah.e f35568c1;
    public ArrayList f35569d0;
    public boolean f35570d1;
    public ArrayList f35571e0;
    public jf.a0 f35572e1;
    public String f35573f0;
    public qa0 f35574f1;
    public ActionMode f35575g0;
    public ra0 f35576g1;
    public boolean f35577h0;
    public boolean f35578h1;
    public final m.s3 f35579i0;
    public NotificationCenter.ObserversGroup f35580i1;
    public final af.d f35581j0;
    public NotificationCenter.ObserversGroup f35582j1;
    public ImageView f35583k0;
    public boolean f35584k1;
    public org.telegram.ui.Components.je f35585l0;
    public o90 l1;
    public ActionBarLayout m0;
    public nh.b0 f35586m1;
    public ActionBarLayout f35587n0;
    public boolean f35588n1;
    public ActionBarLayout f35589o0;
    public ViewGroup f35590o1;
    public ea0 f35591p0;
    public org.telegram.ui.ActionBar.c2 f35592p1;
    public FrameLayout f35593q0;
    public org.telegram.ui.ActionBar.c2 f35594q1;
    public org.telegram.ui.Components.n51 f35595r0;
    public boolean f35596r1;
    public n0 f35597s0;
    public long f35598s1;
    public oa0 f35599t0;
    public int[] f35600t1;
    public org.telegram.ui.ActionBar.v3 f35601u0;
    public ValueAnimator f35602u1;
    public org.telegram.ui.ActionBar.x3 f35603v0;
    public jh.fb f35604v1;
    public org.telegram.ui.Components.pd0 f35605w0;
    public int f35606w1;
    public final ArrayList f35607x0;
    public org.telegram.ui.Components.yz0 f35608y0;
    public org.telegram.ui.Components.aa f35609z0;
    public final ArrayList L = new ArrayList();
    public final ArrayList Z = new ArrayList();
    public final ArrayList f35563a0 = new ArrayList();
    public final ArrayList f35565b0 = new ArrayList();

    public LaunchActivity() {
        ?? obj = new Object();
        obj.f16688a = new HashMap();
        obj.d = this;
        obj.f16689b = new af.d(this);
        this.f35579i0 = obj;
        this.f35581j0 = (af.d) obj.f16689b;
        this.f35607x0 = new ArrayList();
        this.A0 = new ArrayList();
        this.S0 = false;
        this.W0 = new ArrayList();
        this.X0 = new SparseIntArray();
        this.Y0 = 5934;
        this.Z0 = new Object();
        this.f35566b1 = new LiteMode.BatteryReceiver();
        this.f35584k1 = true;
        System.identityHashCode(this);
        this.f35606w1 = 0;
    }

    public static void C0(LaunchActivity launchActivity, int i10, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        String restrictionReason;
        org.telegram.ui.ActionBar.o2 R = R();
        if (R != null) {
            long j10 = tL_attachMenuBot.bot_id;
            ph.y3 b10 = ph.y3.b(i10, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
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
            ph.p2 p2Var = new ph.p2(launchActivity, R.getResourceProvider());
            p2Var.f45986w0 = false;
            p2Var.w(z10);
            p2Var.f45967g0 = launchActivity;
            p2Var.s(R, b10);
            p2Var.show();
        }
    }

    public static void E(int i10) {
        LaunchActivity launchActivity = F1;
        if (launchActivity != null) {
            launchActivity.D(i10);
        }
    }

    public static void L() {
        sy syVar;
        ArrayList<org.telegram.ui.ActionBar.k2> arrayList;
        org.telegram.ui.ActionBar.o2 U = U();
        if (U != null) {
            if (U.getParentLayout() instanceof ActionBarLayout) {
                syVar = ((ActionBarLayout) U.getParentLayout()).w();
            } else {
                syVar = null;
            }
            if (syVar != null && (arrayList = syVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    syVar.sheetsStack.get(size).dismiss(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.k2> arrayList2 = U.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    U.sheetsStack.get(size2).dismiss(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = ph.p2.S0.iterator();
            while (it.hasNext()) {
                arrayList3.add((ph.p2) it.next());
            }
            int size3 = arrayList3.size();
            int i10 = 0;
            while (i10 < size3) {
                Object obj = arrayList3.get(i10);
                i10++;
                ((ph.p2) obj).k(true);
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
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.b5) j7.l1.i(1, C1.L))).t();
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
            return ((org.telegram.ui.ActionBar.b5) j7.l1.i(1, C1.L)).getLastFragment();
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
            return ((org.telegram.ui.ActionBar.b5) j7.l1.i(1, C1.L)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = C1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return C1.O().getSafeLastFragment();
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
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                Z(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void b0(float f9, float f10, float f11) {
        View decorView;
        jh.fb fbVar;
        LaunchActivity launchActivity = C1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((fbVar = launchActivity.f35604v1) == null || ((View) fbVar.f306a) != decorView)) {
                launchActivity.f35604v1 = new jh.fb(decorView);
            }
            jh.fb fbVar2 = launchActivity.f35604v1;
            if (fbVar2 != null) {
                View view = (View) fbVar2.f306a;
                ArrayList arrayList = fbVar2.f12078b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(i7.z5.a(0.0f, 0.0f, f9, f10), i7.z5.a(view.getWidth(), 0.0f, f9, f10)), Math.max(i7.z5.a(0.0f, view.getHeight(), f9, f10), i7.z5.a(view.getWidth(), view.getHeight(), f9, f10))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    jh.eb ebVar = new jh.eb(f9, f10, f11);
                    ofFloat.addUpdateListener(new bg.b3(3, fbVar2, ebVar));
                    ofFloat.addListener(new bg.c3(4, fbVar2, ebVar));
                    ofFloat.setInterpolator(org.telegram.ui.Components.jr.f29801g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(ebVar);
                    fbVar2.R();
                    ofFloat.start();
                }
            }
        }
    }

    public static void y0(AccountInstance accountInstance, fy fyVar, CharSequence charSequence, long j10, MessageObject messageObject, long j11, boolean z10, int i10, int i11) {
        boolean z11;
        org.telegram.ui.Components.iq0 iq0Var;
        org.telegram.ui.Components.iq0 iq0Var2;
        if (fyVar != null && (iq0Var2 = fyVar.C2) != null && !iq0Var2.f29447n) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z11 && fyVar != null && (iq0Var = fyVar.C2) != null) {
            webPage = iq0Var.getLoadedWebPage();
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

    public final void A() {
        if (this.K == UserConfig.selectedAccount && this.f35580i1 != null) {
            return;
        }
        NotificationCenter.ObserversGroup observersGroup = this.f35580i1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f35580i1 = null;
        }
        int i10 = UserConfig.selectedAccount;
        this.K = i10;
        this.f35580i1 = NotificationCenter.getInstance(i10).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
    }

    public final void A0() {
        org.telegram.ui.ActionBar.x3 x3Var;
        ViewGroup view;
        int i10;
        if (this.f35603v0.indexOfChild(this.f35591p0) != -1) {
            x3Var = this.f35603v0;
            view = this.f35591p0;
        } else {
            x3Var = this.f35603v0;
            view = this.m0.getView();
        }
        int indexOfChild = x3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f35603v0.removeViewAt(indexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            ea0 ea0Var = new ea0(this, this);
            this.f35591p0 = ea0Var;
            if (indexOfChild != -1) {
                this.f35603v0.addView(ea0Var, indexOfChild, i7.f6.c(-1.0f, -1));
            } else {
                this.f35603v0.addView(ea0Var, i7.f6.c(-1.0f, -1));
            }
            org.telegram.ui.Components.n51 n51Var = new org.telegram.ui.Components.n51(this, null, 4);
            this.f35595r0 = n51Var;
            n51Var.setOccupyStatusBar(false);
            this.f35595r0.V(org.telegram.ui.ActionBar.g6.r0());
            this.f35591p0.addView(this.f35595r0, i7.f6.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.m0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.m0.getView());
            }
            this.f35591p0.addView(this.m0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f35589o0 = actionBarLayout;
            actionBarLayout.J0 = true;
            actionBarLayout.setFragmentStack(this.f35565b0);
            this.f35589o0.setDelegate(this);
            this.f35591p0.addView(this.f35589o0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f35593q0 = frameLayout;
            ArrayList arrayList = this.f35563a0;
            int i11 = 8;
            if (arrayList.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            frameLayout.setVisibility(i10);
            this.f35593q0.setBackgroundColor(1056964608);
            this.f35591p0.addView(this.f35593q0);
            this.f35593q0.setOnTouchListener(new g0(this, 3));
            this.f35593q0.setOnClickListener(new bg.n(23));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f35587n0 = actionBarLayout2;
            actionBarLayout2.I0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f35587n0.setBackgroundView(this.f35593q0);
            this.f35587n0.setUseAlphaAnimations(true);
            this.f35587n0.setFragmentStack(arrayList);
            this.f35587n0.setDelegate(this);
            this.f35587n0.setDrawerLayoutContainer(this.f35603v0);
            ViewGroup view2 = this.f35587n0.getView();
            if (!arrayList.isEmpty()) {
                i11 = 0;
            }
            view2.setVisibility(i11);
            this.f35591p0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.m0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.m0.getView());
            }
            this.m0.setFragmentStack(this.Z);
            if (indexOfChild != -1) {
                this.f35603v0.addView(this.m0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f35603v0.addView(this.m0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        i7.o8.a(this, SharedConfig.isFloatingDebugActive, false);
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f35572e1 == null && SharedConfig.frameMetricsEnabled) {
                this.f35572e1 = jf.a0.b(this, this.f35597s0);
            }
            jf.a0 a0Var = this.f35572e1;
            if (a0Var != null && !SharedConfig.frameMetricsEnabled) {
                a0Var.c();
                this.f35572e1 = null;
            }
        }
    }

    public final org.telegram.ui.ActionBar.c2 B0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.c2 o10 = alertDialog$Builder.o();
            o10.setCanceledOnTouchOutside(true);
            o10.setOnDismissListener(new eg.g(8, this, o10));
            this.A0.add(o10);
            return o10;
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

    public final void D(int i10) {
        F1 = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT >= 26 && i10 == 0) || this.f35596r1) {
            return;
        }
        Utilities.globalQueue.postRunnable(new c80(this, i10, 0), 2000L);
    }

    public final void D0(p.a aVar) {
        org.telegram.ui.ActionBar.o2 o2Var;
        ArrayList arrayList = this.f35563a0;
        if (!arrayList.isEmpty()) {
            o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f35565b0;
            if (!arrayList2.isEmpty()) {
                o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.Z;
                if (!arrayList3.isEmpty()) {
                    o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList3);
                } else {
                    o2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.tc.a(o2Var)) {
            aVar.c(org.telegram.ui.Components.tc.a0(o2Var)).j();
        }
    }

    public final void E0() {
        String str;
        String str2;
        char c3;
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
                            public final LaunchActivity f42013b;

                            {
                                this.f42013b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.f35560x1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f42013b;
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
                                        Pattern pattern2 = LaunchActivity.f35560x1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f42013b;
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
                        tL_langpack_getStrings2.lang_code = localeInfoArr[c3].getLangCode();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.K).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {
                            public final LaunchActivity f42013b;

                            {
                                this.f42013b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.f35560x1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f42013b;
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
                                        Pattern pattern2 = LaunchActivity.f35560x1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f42013b;
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
        int i10;
        if (AndroidUtilities.isTablet() && this.f35589o0 != null) {
            if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
                int i11 = 8;
                if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                    this.K0 = false;
                    List<org.telegram.ui.ActionBar.o2> fragmentStack = this.m0.getFragmentStack();
                    if (fragmentStack.size() >= 2) {
                        while (1 < fragmentStack.size()) {
                            org.telegram.ui.ActionBar.o2 o2Var = fragmentStack.get(1);
                            if (o2Var instanceof tn) {
                                ((tn) o2Var).U4 = true;
                            }
                            o2Var.onPause();
                            o2Var.onFragmentDestroy();
                            o2Var.setParentLayout(null);
                            fragmentStack.remove(o2Var);
                            this.f35589o0.c(-1, o2Var);
                        }
                        org.telegram.ui.Components.pd0 pd0Var = this.f35605w0;
                        if (pd0Var == null || pd0Var.f31653b.getVisibility() != 0) {
                            this.m0.U(true, true);
                            this.f35589o0.U(true, true);
                        }
                    }
                    ViewGroup view = this.f35589o0.getView();
                    if (this.f35589o0.getFragmentStack().isEmpty()) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    org.telegram.ui.Components.n51 n51Var = this.f35595r0;
                    if (this.f35589o0.getFragmentStack().isEmpty()) {
                        i11 = 0;
                    }
                    n51Var.setVisibility(i11);
                    return;
                }
                this.K0 = true;
                List<org.telegram.ui.ActionBar.o2> fragmentStack2 = this.f35589o0.getFragmentStack();
                if (!fragmentStack2.isEmpty()) {
                    while (fragmentStack2.size() > 0) {
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentStack2.get(0);
                        if (o2Var2 instanceof tn) {
                            ((tn) o2Var2).U4 = true;
                        }
                        o2Var2.onPause();
                        o2Var2.onFragmentDestroy();
                        o2Var2.setParentLayout(null);
                        fragmentStack2.remove(o2Var2);
                        this.m0.c(-1, o2Var2);
                    }
                    org.telegram.ui.Components.pd0 pd0Var2 = this.f35605w0;
                    if (pd0Var2 == null || pd0Var2.f31653b.getVisibility() != 0) {
                        this.m0.U(true, true);
                    }
                }
                this.f35589o0.getView().setVisibility(8);
                org.telegram.ui.Components.n51 n51Var2 = this.f35595r0;
                if (this.m0.getFragmentStack().isEmpty()) {
                    i11 = 0;
                }
                n51Var2.setVisibility(i11);
            }
        }
    }

    public final void F0(org.telegram.messenger.LocaleController.LocaleInfo r18, org.telegram.messenger.LocaleController.LocaleInfo r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.F0(org.telegram.messenger.LocaleController$LocaleInfo, org.telegram.messenger.LocaleController$LocaleInfo, java.lang.String):void");
    }

    public final void G(boolean z10) {
        H(z10, true, !this.S0);
    }

    public final void G0(boolean z10, boolean z11, int i10, int i11, ui uiVar) {
        if (this.f35603v0 != null && !isFinishing()) {
            if (this.f35605w0 == null) {
                this.f35605w0 = new org.telegram.ui.Components.pd0(this);
            }
            SharedConfig.appLocked = true;
            int i12 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f36222s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                PhotoViewer.t1().G0(false, true);
            } else if (m4.I() && m4.x().R) {
                m4.x().o(false, true);
            }
            nh.gb.x();
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.f35605w0.show();
            org.telegram.ui.Components.od0 od0Var = this.f35605w0.f31653b;
            ArrayList arrayList = this.f35607x0;
            arrayList.isEmpty();
            od0Var.j(z11, i10, i11, new x60(10, this, uiVar));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                org.telegram.ui.Components.nd0 nd0Var = (org.telegram.ui.Components.nd0) arrayList.get(i13);
                if (z10) {
                    int size = arrayList.size() - 1;
                }
                nd0Var.j(z11, i10, i11, null);
            }
            SharedConfig.isWaitingForPasscodeEnter = true;
            v90 v90Var = new v90(this);
            this.f35605w0.f31653b.setDelegate(v90Var);
            int size2 = arrayList.size();
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((org.telegram.ui.Components.nd0) obj).setDelegate(v90Var);
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
        rn rnVar;
        boolean z13;
        ArrayList arrayList = this.Z;
        boolean z14 = true;
        if (!arrayList.isEmpty()) {
            o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList);
        } else {
            o2Var = null;
        }
        char c3 = 2;
        if (o2Var != null && (o2Var.isRemovingFromStack() || o2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(2, arrayList);
            } else {
                o2Var = null;
            }
        }
        if (o2Var != null) {
            o2Var.hasForceLightStatusBar();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
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
                                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) j7.l1.i(1, o2Var.sheetsStack);
                                if (k2Var.isShown()) {
                                    z13 = k2Var.isAttachedLightStatusBar();
                                }
                            }
                        }
                    }
                } else {
                    z13 = i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23329s8, true)) > 0.699999988079071d;
                }
                AndroidUtilities.setLightStatusBar(this, z13);
            }
            if (i10 >= 26 && z12 && (!z10 || o2Var == null || !o2Var.isInPreviewMode())) {
                if (o2Var != null && z10) {
                    w02 = o2Var.getNavigationBarColor();
                } else {
                    w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, true);
                }
                if (o2Var instanceof tn) {
                    tn tnVar = (tn) o2Var;
                    if (!tnVar.Ab || (tnVar.v.f756s != 1 && ((rnVar = tnVar.f42746aa) == null || !rnVar.C))) {
                        c3 = 1;
                    }
                } else {
                    c3 = 0;
                }
                if (P() != null && P().D > 0) {
                    c3 = 0;
                }
                if (this.m0.w() != null) {
                    sy w10 = this.m0.w();
                    if (w10.sheetsStack != null) {
                        for (int i11 = 0; i11 < w10.sheetsStack.size(); i11++) {
                            org.telegram.ui.ActionBar.k2 k2Var2 = w10.sheetsStack.get(i11);
                            if (k2Var2.attachedToParent()) {
                                w02 = k2Var2.getNavigationBarColor(w02);
                                c3 = 0;
                            }
                        }
                    }
                }
                Iterator it = ph.p2.S0.iterator();
                while (it.hasNext()) {
                    w02 = ((ph.p2) it.next()).getNavigationBarColor(w02);
                    c3 = 0;
                }
                z0(w02);
                if ((c3 != 0 || AndroidUtilities.computePerceivedBrightness(w02) < 0.721f) && c3 != 1) {
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
        float f9;
        float f10;
        if (this.f35608y0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
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
            linearLayout.addView(imageView, i7.f6.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.g6.G6;
            f9 = 4.0f;
            org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, 17.0f);
            textView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
            linearLayout.addView(textView, i7.f6.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f35161a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(51);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView2, i7.f6.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            scrollView.setPadding(AndroidUtilities.dp(24.0f), i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, i7.f6.n(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(LocaleController.getString(R.string.Decline).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            int i13 = org.telegram.ui.ActionBar.g6.f23433y6;
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(null, i13, false)));
            f10 = 10.0f;
            textView3.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
            frameLayout.addView(textView3, i7.f6.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    yz0 yz0Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            c2Var.N = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new wz0(yz0Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            c2Var.P = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (yz0Var.f35163c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                                c2Var2.N = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new wz0(yz0Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                c2Var2.P = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", yz0Var.f35163c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            yz0Var.a();
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
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, -11491093, -12346402, -12346402));
            textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(textView4, i7.f6.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    yz0 yz0Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            c2Var.N = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new wz0(yz0Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            c2Var.P = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (yz0Var.f35163c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                                c2Var2.N = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new wz0(yz0Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                c2Var2.P = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", yz0Var.f35163c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            yz0Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23063d7, false));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.f35608y0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f35603v0.addView(this.f35608y0, i7.f6.c(-1.0f, -1));
            this.f35608y0.setDelegate(new fa0(this));
        } else {
            f9 = 4.0f;
            f10 = 10.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i10).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f22449id.data.equals(tL_help_termsOfService.f22449id.data))) {
            UserConfig.getInstance(i10).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i10).saveConfig(false);
        }
        org.telegram.ui.Components.yz0 yz0Var = this.f35608y0;
        if (yz0Var.getVisibility() != 0) {
            yz0Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false);
        int dp2 = AndroidUtilities.dp(f10);
        int dp3 = AndroidUtilities.dp(f9);
        int length = spannableStringBuilder.length() - 2;
        for (int i14 = 0; i14 < length; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == '-') {
                    int i16 = i14 + 2;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        org.telegram.ui.Components.ya yaVar = new org.telegram.ui.Components.ya(dp2, dp3);
                        spannableStringBuilder.replace(i15, i14 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(yaVar, i15, i16, 33);
                    }
                }
            }
        }
        yz0Var.f35161a.setText(spannableStringBuilder);
        yz0Var.f35163c = tL_help_termsOfService;
        yz0Var.d = i10;
        this.f35608y0.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    public final void I(boolean z10) {
        ChatObject.Call call;
        long j10;
        boolean z11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z12 = false;
        if (sharedInstance != null && (call = sharedInstance.groupCall) != null) {
            boolean z13 = this.f35577h0;
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
            this.f35577h0 = z12;
            if (!z10 && z13 && !z12 && !z11 && r50.f41867z3 == null) {
                J0(38);
                return;
            }
            return;
        }
        this.f35577h0 = false;
    }

    public final void I0(int i10, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        if (this.f35609z0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
            frameLayout.f26730w = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.w0(null, i11, false), 0});
            frameLayout.f26731x = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.g6.w0(null, i11, false), 0});
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            int i12 = (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight));
            ?? imageView = new ImageView(this);
            imageView.f(R.raw.qr_code_logo, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().I(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            frameLayout2.addView((View) imageView, i7.f6.d(-2, -2.0f, 17, 0.0f, i12, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.h0((Object) frameLayout, 4));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f26726f = scrollView;
            AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23329s8, false));
            scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, i7.f6.d(-1, -1.0f, 51, 27.0f, i12 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.UpdateTelegram));
            frameLayout3.addView(textView, i7.f6.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f26722a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(49);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            frameLayout3.addView(textView2, i7.f6.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            bg.x2 x2Var = new bg.x2(this, 15);
            frameLayout.d = x2Var;
            x2Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            x2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
            x2Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(x2Var, i7.f6.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            x2Var.setOnClickListener(new org.telegram.ui.Components.t2(8, frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f26723b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            x2Var.addView(textView3, i7.f6.e(-2, -2, 17));
            bg.x2 x2Var2 = new bg.x2((Object) frameLayout, this, 16);
            frameLayout.f26724c = x2Var2;
            x2Var2.setWillNotDraw(false);
            x2Var2.setAlpha(0.0f);
            x2Var2.setScaleX(0.1f);
            x2Var2.setScaleY(0.1f);
            x2Var2.setVisibility(4);
            org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(x2Var2);
            frameLayout.f26725e = bj0Var;
            bj0Var.d(null, true, false);
            bj0Var.f27137o = -1;
            x2Var.addView(x2Var2, i7.f6.e(36, 36, 17));
            this.f35609z0 = frameLayout;
            this.f35603v0.addView((View) frameLayout, i7.f6.c(-1.0f, -1));
        }
        org.telegram.ui.Components.aa aaVar = this.f35609z0;
        aaVar.v = 0;
        aaVar.f26727n = tL_help_appUpdate;
        aaVar.f26729s = i10;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            aaVar.f26728r = FileLoader.getAttachFileName(document);
        }
        if (aaVar.getVisibility() != 0) {
            aaVar.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false);
        aaVar.f26722a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            TextView textView4 = aaVar.f26723b;
            textView4.setText(LocaleController.getString(R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tL_help_appUpdate.document.size)));
        } else {
            aaVar.f26723b.setText(LocaleController.getString(R.string.Update));
        }
        NotificationCenter.getInstance(aaVar.f26729s).addObserver(aaVar, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(aaVar.f26729s).addObserver(aaVar, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(aaVar.f26729s).addObserver(aaVar, NotificationCenter.fileLoadProgressChanged);
        if (z10 && ApplicationLoader.isStandaloneBuild()) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(aaVar.f26729s).sendRequest(tL_help_getAppUpdate, new org.telegram.ui.Components.a2(aaVar, 1));
        }
    }

    @Override
    public final boolean J(org.telegram.ui.fy r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.J(org.telegram.ui.fy):boolean");
    }

    public final void J0(int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.Z.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.o2 o2Var = this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1);
            if (o2Var instanceof ng0) {
                o2Var = ((ng0) o2Var).X();
            }
            UndoView undoView = null;
            if (o2Var instanceof tn) {
                tn tnVar = (tn) o2Var;
                if (chat != null && tnVar.a() == (-chat.f22392id)) {
                    chat = null;
                }
                tnVar.Q7();
                undoView = tnVar.f42989u3;
            } else if (o2Var instanceof fy) {
                undoView = ((fy) o2Var).Y3();
            } else if (o2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) o2Var).I;
            }
            if (undoView != null) {
                undoView.m(0L, chat, i10);
            }
            if (i10 == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    public final void K() {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.o2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (AndroidUtilities.isTablet()) {
            ArrayList arrayList2 = this.f35563a0;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((org.telegram.ui.ActionBar.o2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f35565b0;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                ((org.telegram.ui.ActionBar.o2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void K0(int i10) {
        L0(i10, new org.telegram.ui.Components.xo0(22));
    }

    public final void L0(int i10, GenericProvider genericProvider) {
        if (i10 != UserConfig.selectedAccount && UserConfig.isValidAccount(i10)) {
            this.f35578h1 = true;
            ConnectionsManager.getInstance(this.K).setAppPaused(true, false);
            UserConfig.selectedAccount = i10;
            UserConfig.getInstance(0).saveConfig(false);
            A();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAccountChanged, Integer.valueOf(i10));
            if (AndroidUtilities.isTablet()) {
                this.f35587n0.X();
                this.f35589o0.X();
                if (!this.K0) {
                    if (this.f35589o0.getFragmentStack().isEmpty()) {
                        this.f35595r0.setVisibility(0);
                    }
                    this.f35589o0.getView().setVisibility(8);
                }
                this.f35587n0.getView().setVisibility(8);
            }
            this.m0.X();
            this.m0.c(-3, (ng0) genericProvider.provide(null));
            this.m0.U(true, true);
            if (AndroidUtilities.isTablet()) {
                this.f35587n0.U(true, true);
                this.f35589o0.U(true, true);
            }
            if (!ApplicationLoader.mainInterfacePaused) {
                ConnectionsManager.getInstance(this.K).setAppPaused(false, false);
            }
            if (UserConfig.getInstance(i10).unacceptedTermsOfService != null) {
                H0(i10, UserConfig.getInstance(i10).unacceptedTermsOfService);
            }
            M0();
            this.f35578h1 = false;
        }
    }

    public final java.util.ArrayList M(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.M(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void M0() {
        String str;
        int i10;
        if (this.m0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            this.Y = connectionState;
            o80 o80Var = null;
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
                o80Var = new o80(this, 5);
            }
            ActionBarLayout actionBarLayout = this.m0;
            actionBarLayout.C0 = str;
            actionBarLayout.D0 = i10;
            actionBarLayout.E0 = o80Var;
            for (int i11 = 0; i11 < actionBarLayout.K0.size(); i11++) {
                ((org.telegram.ui.ActionBar.o2) actionBarLayout.K0.get(i11)).setTitleOverlayText(actionBarLayout.C0, actionBarLayout.D0, o80Var);
            }
        }
    }

    public final org.telegram.ui.ActionBar.b5 O() {
        ActionBarLayout actionBarLayout = this.m0;
        ArrayList arrayList = this.L;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.b5) j7.l1.i(1, arrayList);
        }
        return actionBarLayout;
    }

    public final org.telegram.ui.ActionBar.m3 P() {
        ActionBarLayout actionBarLayout = this.f35589o0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f35589o0.getBottomSheetTabs();
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
        return new k70();
    }

    public final int S() {
        return this.Z.size();
    }

    public final ah.e T() {
        return this.f35568c1;
    }

    public final boolean X(android.content.Intent r128, boolean r129, boolean r130, boolean r131, ye.c r132, boolean r133, boolean r134) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.X(android.content.Intent, boolean, boolean, boolean, ye.c, boolean, boolean):boolean");
    }

    public final void Y() {
        ActionMode actionMode = this.f35575g0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    @Override
    public final void a(float f9) {
        if (m4.I() && m4.x().R) {
            m4 x4 = m4.x();
            x4.S();
            m4.g0(x4);
            if (x4.f40390b0 != null) {
                x4.f40404q0[0].f41513b.f1();
                x4.f40404q0[1].f41513b.f1();
                x4.f40390b0.invalidate();
                x4.m0.invalidate();
                if (f9 == 1.0f) {
                    x4.f40404q0[0].f41514c.l();
                    x4.f40404q0[1].f41514c.l();
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
        if (AndroidUtilities.isTablet() && actionBarLayout == this.f35587n0) {
            this.f35589o0.U(z10, z10);
            this.m0.U(z10, z10);
        }
    }

    public final boolean c0(boolean z10) {
        boolean z11;
        xf.j jVar = i7.o8.f8470a;
        if (jVar != null) {
            if (jVar.f50148s) {
                if (z10) {
                    jVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.pd0 pd0Var = this.f35605w0;
        if (pd0Var != null && pd0Var.f31653b.getVisibility() == 0) {
            if (z10) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.v3 v3Var = this.f35601u0;
            if (v3Var != null && (z11 = v3Var.Q)) {
                if (z10 && z11) {
                    v3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.en0.D;
                if (c2Var != null) {
                    if (z10) {
                        c2Var.dismiss();
                        org.telegram.ui.Components.en0.D = null;
                        return false;
                    }
                } else if (ht.f39017g0 != null && ht.q().E) {
                    if (z10) {
                        ht.q().o();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f36222s) {
                    if (z10) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                    if (z10) {
                        PhotoViewer.t1().G0(true, false);
                        return false;
                    }
                } else if (!m4.I() || !m4.x().R) {
                    return true;
                } else {
                    if (z10) {
                        m4.x().o(true, false);
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
        if (!this.M) {
            this.M = true;
            NotificationCenter.ObserversGroup observersGroup = this.f35580i1;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.f35580i1 = null;
            }
            NotificationCenter.ObserversGroup observersGroup2 = this.f35582j1;
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                this.f35582j1 = null;
            }
            o90 o90Var = this.l1;
            if (o90Var != null) {
                LiteMode.removeOnPowerSaverAppliedListener(o90Var);
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

    public final void e0(Intent intent, ye.c cVar) {
        super.onNewIntent(intent);
        X(intent, true, false, false, cVar, true, false);
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
            boolean z11 = o2Var instanceof fy;
            if (!z11 && !(o2Var instanceof ng0)) {
                if ((o2Var instanceof tn) && !((tn) o2Var).c()) {
                    boolean z12 = this.K0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f35589o0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f35595r0.setVisibility(8);
                        this.f35589o0.X();
                        this.f35589o0.c(-1, o2Var);
                        if (!this.f35587n0.getFragmentStack().isEmpty()) {
                            while (this.f35587n0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f35587n0;
                                actionBarLayout4.a0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f35587n0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.m0)) {
                        actionBarLayout2.c(-1, o2Var);
                        if (!this.f35587n0.getFragmentStack().isEmpty()) {
                            while (this.f35587n0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f35587n0;
                                actionBarLayout5.a0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f35587n0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f35587n0;
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
                    if ((o2Var instanceof fg0) && i10 == -1) {
                        this.f35595r0.setVisibility(0);
                        this.f35593q0.setBackgroundColor(0);
                    } else {
                        this.f35593q0.setBackgroundColor(2130706432);
                    }
                    this.f35587n0.c(-1, o2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.m0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z11 && !((fy) o2Var).h4()) {
                    z10 = false;
                }
                if (z10) {
                    this.m0.X();
                    this.m0.c(-1, o2Var);
                    this.f35587n0.X();
                    this.f35587n0.getView().setVisibility(8);
                    if (!this.K0 && this.f35589o0.getFragmentStack().isEmpty()) {
                        this.f35595r0.setVisibility(0);
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
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36222s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
            return true;
        } else if (!m4.I() || !m4.x().R) {
            return false;
        } else {
            m4.x().o(true, false);
            return true;
        }
    }

    public final void j0(TL_account.Password password) {
        String str;
        fg0 fg0Var = new fg0();
        o80 o80Var = new o80(this, 0);
        fg0Var.B = 3;
        fg0Var.f38151a = 12;
        fg0Var.Z = o80Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f29024a |= 256;
                obj.f29025b = indexOf;
                int i10 = lastIndexOf + 1;
                obj.f29026c = i10;
                valueOf.setSpan(new org.telegram.ui.Components.i01(obj, 0), indexOf, i10, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            alertDialog$Builder.f22714a.N = valueOf;
            alertDialog$Builder.f22714a.P = getString(R.string.EmailLoginChangeMessage);
            alertDialog$Builder.k(getString(R.string.ChangeEmail), new xr(16, this, fg0Var));
            alertDialog$Builder.h(getString(R.string.Cancel), null);
            alertDialog$Builder.o();
            return;
        }
        p0(fg0Var);
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.m0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.f35578h1) {
                d0();
                finish();
                return false;
            } else if (actionBarLayout == this.f35589o0) {
                if (!this.K0) {
                    this.f35595r0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f35587n0 && this.m0.getFragmentStack().isEmpty() && this.f35587n0.getFragmentStack().size() == 1) {
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
            p0(ze1.F0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(this.K).getInputChannel(-j10);
        tL_channels_getMessages.f22430id.add(num);
        ConnectionsManager.getInstance(this.K).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new s80(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i10, i11));
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
        lh.b7 a2;
        long[] jArr2 = jArr;
        int i10 = 0;
        while (true) {
            if (i10 < jArr2.length) {
                TLRPC.User user = MessagesController.getInstance(this.K).getUser(Long.valueOf(jArr2[i10]));
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
        org.telegram.ui.ActionBar.o2 R = R();
        if (R != null) {
            lh.s6 storiesController = MessagesController.getInstance(this.K).getStoriesController();
            if (z11) {
                arrayList = storiesController.h;
            } else {
                arrayList = storiesController.f16223g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z12 = z11;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z12) {
                ArrayList arrayList5 = new ArrayList();
                for (int i11 = 0; i11 < jArr2.length; i11++) {
                    TLRPC.User user2 = MessagesController.getInstance(this.K).getUser(Long.valueOf(jArr2[i11]));
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
                for (int i13 = 0; i13 < jArr2.length; i13 = a4.w.g(jArr2[i13], arrayList4, i13, 1)) {
                }
            } else {
                for (int i14 = 0; i14 < jArr2.length; i14 = a4.w.g(jArr2[i14], arrayList3, i14, 1)) {
                }
            }
            if (!arrayList4.isEmpty() && z10) {
                MessagesController messagesController = MessagesController.getInstance(this.K);
                int[] iArr = {arrayList4.size()};
                lq lqVar = new lq(this, iArr, jArr2, 18);
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
                        ConnectionsManager.getInstance(this.K).sendRequest(tL_stories_getPeerStories, new eg.d0(messagesController, longValue, lqVar, 6));
                    }
                }
                return;
            }
            long clientUserId = UserConfig.getInstance(this.K).getClientUserId();
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i16)).peer);
                if (peerDialogId != clientUserId && !arrayList3.contains(Long.valueOf(peerDialogId)) && storiesController.J(peerDialogId)) {
                    arrayList3.add(Long.valueOf(peerDialogId));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (R instanceof fy) {
                    try {
                        a2 = lh.b7.a(((fy) R).A0.h);
                    } catch (Exception unused) {
                    }
                    lh.b7 b7Var = a2;
                    R.getOrCreateStoryViewer().v();
                    R.getOrCreateStoryViewer().F(this, null, arrayList3, 0, null, null, b7Var, false);
                }
                a2 = null;
                lh.b7 b7Var2 = a2;
                R.getOrCreateStoryViewer().v();
                R.getOrCreateStoryViewer().F(this, null, arrayList3, 0, null, null, b7Var2, false);
            }
        }
    }

    public final void m0(final int i10, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        lh.k6 k6Var;
        lh.k6 A;
        MessageObject f9;
        MessageObject f10;
        TL_stories.StoryItem storyItem2;
        lh.s6 storiesController = MessagesController.getInstance(this.K).getStoriesController();
        TL_stories.PeerStories y8 = storiesController.y(j10);
        lh.b7 b7Var = null;
        if (y8 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < y8.stories.size()) {
                    if (y8.stories.get(i11).f22629id == i10) {
                        storyItem2 = y8.stories.get(i11);
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
                org.telegram.ui.ActionBar.o2 R = R();
                if (R != null) {
                    if (R instanceof fy) {
                        try {
                            b7Var = lh.b7.a(((fy) R).A0.h);
                        } catch (Exception unused) {
                        }
                    }
                    R.getOrCreateStoryViewer().v();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z10) {
                        R.getOrCreateStoryViewer().f15785s1 = true;
                    }
                    R.getOrCreateStoryViewer().F(this, storyItem2, arrayList, 0, null, y8, b7Var, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            lh.k6 A2 = storiesController.A(j10, 0, -1, true);
            if (A2 != null && (f10 = A2.f(i10)) != null) {
                storyItem = f10.storyItem;
                k6Var = A2;
            } else {
                k6Var = null;
            }
            if (storyItem == null && (A = storiesController.A(j10, 1, -1, true)) != null && (f9 = A.f(i10)) != null) {
                storyItem = f9.storyItem;
                k6Var = A;
            }
            if (storyItem != null && k6Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.o2 R2 = R();
                if (R2 == null) {
                    return;
                }
                if (R2 instanceof fy) {
                    try {
                        b7Var = lh.b7.a(((fy) R2).A0.h);
                    } catch (Exception unused2) {
                    }
                }
                lh.b7 b7Var2 = b7Var;
                R2.getOrCreateStoryViewer().v();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    R2.getOrCreateStoryViewer().f15785s1 = true;
                }
                R2.getOrCreateStoryViewer().F(this, storyItem, arrayList2, 0, k6Var, null, b7Var2, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.K).getInputPeer(j10);
        tL_stories_getStoriesByID.f22636id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(this.K).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.fg(LaunchActivity.this, tLObject, i10, j10, z10));
            }
        });
    }

    public final void n0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean z10;
        int i10 = f6Var.f22944b0;
        org.telegram.ui.ActionBar.e6 f9 = f6Var.f(tL_theme, this.K, 0);
        f6Var.V = f6Var.U;
        f6Var.u(f9.f22902a);
        f9.f22918s = tL_wallPaper;
        if (i10 != f6Var.f22944b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0(new qc1(f6Var, z10, 0, false, false));
    }

    public final void o0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.o0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f35575g0 == actionMode) {
            this.f35575g0 = null;
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.m0;
            org.telegram.ui.ActionBar.l lVar = actionBarLayout.f22700y;
            if (lVar != null) {
                lVar.setVisibility(0);
            }
            actionBarLayout.f22692s0 = false;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35589o0;
                org.telegram.ui.ActionBar.l lVar2 = actionBarLayout2.f22700y;
                if (lVar2 != null) {
                    lVar2.setVisibility(0);
                }
                actionBarLayout2.f22692s0 = false;
                ActionBarLayout actionBarLayout3 = this.f35587n0;
                org.telegram.ui.ActionBar.l lVar3 = actionBarLayout3.f22700y;
                if (lVar3 != null) {
                    lVar3.setVisibility(0);
                }
                actionBarLayout3.f22692s0 = false;
            }
        }
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.f35575g0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.m0.s(menu) && AndroidUtilities.isTablet() && !this.f35589o0.s(menu)) {
                this.f35587n0.s(menu);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.m0;
            org.telegram.ui.ActionBar.l lVar = actionBarLayout.f22700y;
            if (lVar != null) {
                lVar.setVisibility(8);
            }
            actionBarLayout.f22692s0 = true;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35589o0;
                org.telegram.ui.ActionBar.l lVar2 = actionBarLayout2.f22700y;
                if (lVar2 != null) {
                    lVar2.setVisibility(8);
                }
                actionBarLayout2.f22692s0 = true;
                ActionBarLayout actionBarLayout3 = this.f35587n0;
                org.telegram.ui.ActionBar.l lVar3 = actionBarLayout3.f22700y;
                if (lVar3 != null) {
                    lVar3.setVisibility(8);
                }
                actionBarLayout3.f22692s0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        lh.d4 currentPeerView;
        org.telegram.ui.Components.g81 g81Var;
        VoIPService sharedInstance;
        boolean z10 = false;
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onActivityResult");
            }
            UserConfig.getInstance(this.K).saveConfig(false);
        }
        if (i10 == 105) {
            if (Build.VERSION.SDK_INT >= 23) {
                boolean canDrawOverlays = Settings.canDrawOverlays(this);
                ApplicationLoader.canDrawOverlays = canDrawOverlays;
                if (canDrawOverlays) {
                    r50 r50Var = r50.f41867z3;
                    if (r50Var != null) {
                        r50Var.dismissInternal();
                    }
                    AndroidUtilities.runOnUIThread(new o80(this, 4), 200L);
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
            LocationController locationController = LocationController.getInstance(this.K);
            if (i11 == -1) {
                z10 = true;
            }
            locationController.startFusedLocationRequest(z10);
        } else if (i10 == 521) {
            nh.b0 b0Var = this.f35586m1;
            if (b0Var != null) {
                if (i11 == -1) {
                    z10 = true;
                }
                b0Var.run(Boolean.valueOf(z10));
                this.f35586m1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f26564n;
            if (themeEditorView != null && (g81Var = themeEditorView.f26573k) != null) {
                g81Var.a(i10, i11, intent);
            }
            ActionBarLayout actionBarLayout = this.m0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.o2 o2Var = this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1);
                o2Var.onActivityResultFragment(i10, i11, intent);
                if (o2Var.getLastStoryViewer() != null && (currentPeerView = o2Var.getLastStoryViewer().f15765j0.getCurrentPeerView()) != null && i11 == -1) {
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
                                lh.s2 s2Var = currentPeerView.E2;
                                if (s2Var != null) {
                                    s2Var.dismiss();
                                }
                                currentPeerView.k0(true);
                            }
                        }
                    } else {
                        currentPeerView.t0();
                        lh.s2 s2Var2 = currentPeerView.E2;
                        if (s2Var2 != null) {
                            s2Var2.f31005f0.g0(i10, intent, null);
                        }
                    }
                }
            }
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35589o0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f35589o0.getFragmentStack().get(this.f35589o0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f35587n0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f35587n0.getFragmentStack().get(this.f35587n0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onActivityResultReceived, Integer.valueOf(i10), Integer.valueOf(i11), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (c0(true)) {
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f35587n0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f35587n0.G();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f35589o0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f35589o0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.f35589o0.getFragmentStack().get(this.f35589o0.getFragmentStack().size() - 1);
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
        this.f35581j0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        AndroidUtilities.resetTabletFlag();
        a0();
        F();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
        if (pipRoundVideoView != null) {
            int i10 = pipRoundVideoView.f26444x.getInt("sidex", 1);
            int i11 = pipRoundVideoView.f26444x.getInt("sidey", 0);
            float f9 = pipRoundVideoView.f26444x.getFloat("px", 0.0f);
            float f10 = pipRoundVideoView.f26444x.getFloat("py", 0.0f);
            pipRoundVideoView.v.x = PipRoundVideoView.b(true, i10, f9, pipRoundVideoView.h);
            pipRoundVideoView.v.y = PipRoundVideoView.b(false, i11, f10, pipRoundVideoView.f26440n);
            pipRoundVideoView.f26443w.updateViewLayout(pipRoundVideoView.f26435a, pipRoundVideoView.v);
        }
        org.telegram.ui.Components.mu muVar = org.telegram.ui.Components.mu.O;
        if (muVar != null) {
            muVar.onConfigurationChanged(configuration);
        }
        eg.y yVar = eg.y.f6190e;
        if (yVar != null) {
            yVar.onConfigurationChanged(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.P8;
        ThemeEditorView themeEditorView = ThemeEditorView.f26564n;
        if (themeEditorView != null) {
            int i12 = themeEditorView.f26572j.getInt("sidex", 1);
            int i13 = themeEditorView.f26572j.getInt("sidey", 0);
            float f11 = themeEditorView.f26572j.getFloat("px", 0.0f);
            float f12 = themeEditorView.f26572j.getFloat("py", 0.0f);
            themeEditorView.f26570g.x = ThemeEditorView.b(true, i12, f11, themeEditorView.f26568e);
            themeEditorView.f26570g.y = ThemeEditorView.b(false, i13, f12, themeEditorView.f26569f);
            try {
                if (themeEditorView.f26565a.getParent() != null) {
                    themeEditorView.h.updateViewLayout(themeEditorView.f26565a, themeEditorView.f26570g);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (org.telegram.ui.ActionBar.g6.f23253o == 3) {
            org.telegram.ui.ActionBar.g6.E(false);
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
        f35561y1 = true;
        f35562z1++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        C1 = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.K = UserConfig.selectedAccount;
        registerReceiver(this.f35566b1, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (!UserConfig.getInstance(this.K).isClientActivated() && (intent = getIntent()) != null && intent.getAction() != null) {
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
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23329s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        getWindow().setFormat(-1);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new org.telegram.ui.Components.xo0(21));
        this.f35564a1 = flagSecureReason;
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
        this.f35597s0 = n0Var;
        n0Var.setClipToPadding(false);
        this.f35597s0.setClipChildren(false);
        setContentView(this.f35597s0);
        this.f35568c1 = new ah.e(this.f35597s0);
        ma0 ma0Var = new ma0(this);
        m.s3 s3Var = this.f35579i0;
        ((af.d) s3Var.f16689b).f371a.add(ma0Var);
        ((ViewGroup) getWindow().getDecorView()).addView(s3Var.b());
        s3Var.b().bringToFront();
        ImageView imageView = new ImageView(this);
        this.f35583k0 = imageView;
        imageView.setVisibility(8);
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this);
        this.f35603v0 = x3Var;
        x3Var.setActionBarLayout(this.m0);
        this.f35603v0.addOnLayoutChangeListener(new Object());
        this.f35603v0.setClipChildren(false);
        this.f35603v0.setClipToPadding(false);
        this.f35597s0.addView(this.f35603v0, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.je jeVar = new org.telegram.ui.Components.je(this, 3);
        this.f35585l0 = jeVar;
        jeVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f35597s0.addView(this.f35585l0, i7.f6.c(48.0f, 48));
        this.f35585l0.setVisibility(8);
        n0 n0Var2 = this.f35597s0;
        org.telegram.ui.ActionBar.v3 v3Var = new org.telegram.ui.ActionBar.v3(this);
        this.f35601u0 = v3Var;
        n0Var2.addView(v3Var);
        n0 n0Var3 = this.f35597s0;
        ?? n00Var = new org.telegram.ui.Components.n00(this);
        n00Var.setVisibility(8);
        this.f35599t0 = n00Var;
        n0Var3.addView(n00Var);
        A0();
        this.f35603v0.setParentActionBarLayout(this.m0);
        this.m0.setDrawerLayoutContainer(this.f35603v0);
        this.m0.setFragmentStack(this.Z);
        this.m0.setFragmentStackChangedListener(new o80(this, 2));
        this.m0.setDelegate(this);
        org.telegram.ui.ActionBar.g6.j1(true);
        A();
        M0();
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.closeOtherAppActivities;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i11, this);
        this.Y = ConnectionsManager.getInstance(this.K).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.f35582j1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f35582j1 = null;
        }
        this.f35582j1 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i11).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        o90 o90Var = new o90(this, 0);
        this.l1 = o90Var;
        LiteMode.addOnPowerSaverAppliedListener(o90Var);
        if (this.m0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f35587n0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
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
                                    tn tnVar = new tn(bundle2);
                                    if (this.m0.c(-1, tnVar)) {
                                        tnVar.R7 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    t60 t60Var = new t60(bundle2);
                                    if (this.m0.c(-1, t60Var)) {
                                        t60Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    hd hdVar = new hd(bundle2);
                                    if (this.m0.c(-1, hdVar)) {
                                        hdVar.restoreSelfArgs(bundle);
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
                                    this.m0.c(-1, new b81(null));
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
                p90 p90Var = new p90(rootView, 0);
                this.f35567c0 = p90Var;
                viewTreeObserver.addOnGlobalLayoutListener(p90Var);
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            FingerprintController.checkKeyReady();
        }
        if (i12 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000 && SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
            Pattern pattern = org.telegram.ui.Components.c5.f27308a;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String string2 = LocaleController.getString(R.string.AllowBackgroundActivity);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string2;
            if (OneUIUtilities.isOneUI()) {
                if (i12 >= 31) {
                    i10 = R.string.AllowBackgroundActivityInfoOneUIAboveS;
                } else {
                    i10 = R.string.AllowBackgroundActivityInfoOneUIBelowS;
                }
            } else {
                i10 = R.string.AllowBackgroundActivityInfo;
            }
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(i10));
            alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new org.telegram.ui.Components.i1(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            c2Var.setOnDismissListener(new bg.f0(4));
            c2Var.show();
            SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
        }
        if (i12 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new pa0(this));
        }
        org.telegram.ui.Components.mc.a(this.f35597s0, new eg.x(12));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        b31.V(false);
        if (i12 >= 34) {
            if (this.f35574f1 == null) {
                this.f35574f1 = new qa0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f35574f1);
        } else if (i12 >= 33) {
            if (this.f35576g1 == null) {
                this.f35576g1 = new ra0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f35576g1);
        }
        B();
    }

    @Override
    public final void onDestroy() {
        jf.a0 a0Var;
        n0 n0Var;
        f35561y1 = false;
        f35562z1--;
        unregisterReceiver(this.f35566b1);
        if (f35562z1 == 0) {
            if (PhotoViewer.W8 != null) {
                PhotoViewer.W8.P0();
            }
            if (PhotoViewer.C1()) {
                PhotoViewer.t1().P0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f9 = SecretMediaViewer.f();
                Runnable runnable = f9.l1;
                if (runnable != null) {
                    runnable.run();
                    f9.l1 = null;
                }
                jf.s0 s0Var = f9.f36201h1;
                if (s0Var != null) {
                    s0Var.destroy();
                    f9.f36201h1 = null;
                }
                NotificationCenter.getInstance(f9.f36181a).removeObserver(f9, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f9.f36181a).removeObserver(f9, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f9.f36181a).removeObserver(f9, NotificationCenter.didCreatedNewDeleteTask);
                f9.f36222s = false;
                f9.J = null;
                ImageReceiver.BitmapHolder bitmapHolder = f9.f36193e0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f9.f36193e0 = null;
                }
                f9.i();
                if (f9.f36184b != null && (n0Var = f9.d) != null) {
                    try {
                        if (n0Var.getParent() != null) {
                            ((WindowManager) f9.f36184b.getSystemService("window")).removeViewImmediate(f9.d);
                        }
                        f9.d = null;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                SecretMediaViewer.f36180t1 = null;
            }
            if (m4.I()) {
                m4.x().t();
            }
            if (ht.f39017g0 != null) {
                ht q6 = ht.q();
                q6.E = false;
                q6.f39032l = null;
                q6.W = null;
                q6.Y = null;
                q6.f39019a0 = null;
                if (q6.f39042w != null && q6.f39044y != null) {
                    Bitmap bitmap = q6.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        q6.v = null;
                    }
                    q6.M = 0.0f;
                    q6.K = false;
                    try {
                        if (q6.f39044y.getParent() != null) {
                            ((WindowManager) q6.f39042w.getSystemService("window")).removeViewImmediate(q6.f39044y);
                        }
                        q6.f39044y = null;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    ht.f39017g0 = null;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
                }
            }
            r50 r50Var = r50.f41867z3;
            if (r50Var != null) {
                r50Var.dismissInternal();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i10 = org.telegram.ui.ActionBar.g6.f23002a;
            org.telegram.ui.Components.mu muVar = org.telegram.ui.Components.mu.O;
            if (muVar != null) {
                muVar.G();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f26564n;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            xf.j jVar = i7.o8.f8470a;
            if (jVar != null) {
                jVar.f50144e.edit().putFloat("x", (float) jVar.f50143c.f19045u.f19052i).putFloat("y", (float) jVar.d.f19045u.f19052i).commit();
            }
            i7.o8.f8470a = null;
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.f35590o1, false);
        for (int i11 = 0; i11 < this.A0.size(); i11++) {
            try {
                if (((Dialog) this.A0.get(i11)).isShowing()) {
                    ((Dialog) this.A0.get(i11)).dismiss();
                }
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        this.A0.clear();
        try {
            if (this.f35567c0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f35567c0);
            }
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (this.f35574f1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f35574f1);
            }
        } else if (i12 >= 33 && this.f35574f1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f35576g1);
        }
        org.telegram.ui.Components.mc.h(this.f35597s0);
        VideoAds.dropCache();
        K();
        super.onDestroy();
        d0();
        FlagSecureReason flagSecureReason = this.f35564a1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i12 >= 24 && (a0Var = this.f35572e1) != null) {
            a0Var.c();
        }
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
            if (AndroidUtilities.isTablet()) {
                if (this.f35587n0.getView().getVisibility() == 0 && !this.f35587n0.getFragmentStack().isEmpty()) {
                    this.f35587n0.getView().onKeyUp(i10, keyEvent);
                } else if (this.f35589o0.getView().getVisibility() == 0 && !this.f35589o0.getFragmentStack().isEmpty()) {
                    this.f35589o0.getView().onKeyUp(i10, keyEvent);
                } else {
                    this.m0.getView().onKeyUp(i10, keyEvent);
                }
            } else {
                this.m0.getView().onKeyUp(i10, keyEvent);
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
                ActionBarLayout actionBarLayout2 = this.f35589o0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.J();
                }
                ActionBarLayout actionBarLayout3 = this.f35587n0;
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
        af.d dVar = this.f35581j0;
        dVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (AndroidUtilities.isInPictureInPictureMode(dVar.d) && dVar.e() && Build.VERSION.SDK_INT >= 31) {
            dVar.b();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        Utilities.stageQueue.postRunnable(new org.telegram.messenger.d6(this.K, 10));
        f0();
        this.m0.L();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.f35589o0;
            if (actionBarLayout != null) {
                actionBarLayout.L();
            }
            ActionBarLayout actionBarLayout2 = this.f35587n0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.L();
            }
        }
        org.telegram.ui.Components.pd0 pd0Var = this.f35605w0;
        if (pd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(pd0Var.f31653b.N);
        }
        ArrayList arrayList = this.f35607x0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            AndroidUtilities.cancelRunOnUIThread(((org.telegram.ui.Components.nd0) obj).N);
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
            if (t12.f35695f2 != null) {
                t12.G0(false, false);
            } else {
                org.telegram.ui.Components.x61 x61Var = t12.B2;
                if (x61Var != null && t12.V2) {
                    x61Var.O(AndroidUtilities.isInPictureInPictureMode(t12.f35864y));
                }
            }
        }
        nh.gb gbVar = nh.gb.B2;
        if (gbVar != null) {
            gbVar.v(false);
            nh.wa waVar = gbVar.Y0;
            if (waVar != null) {
                waVar.f18076f.r();
            }
            nh.va vaVar = gbVar.T0;
            if (vaVar != null) {
                vaVar.x(0, true);
            }
        }
        oh1 oh1Var = oh1.f41135j1;
        if (oh1Var != null) {
            boolean isInteractive = ((PowerManager) oh1Var.f41139b.getSystemService("power")).isInteractive();
            int a2 = df.d.a(oh1Var.f41139b);
            if (a2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (oh1Var.f41180z0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a2 == 2) {
                int measuredHeight = oh1.f41135j1.f41166q0.getMeasuredHeight();
                oh1 oh1Var2 = oh1.f41135j1;
                org.telegram.ui.Components.voip.o2.l(oh1Var2.f41139b, oh1Var2.f41136a, oh1Var2.f41166q0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = oh1.f41135j1.f41163n0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.o2.S = windowInsets.getSystemWindowInsetTop();
                    oh1.f41135j1.f41163n0.getSystemWindowInsetBottom();
                }
            }
            if (oh1Var.f41159j0 && ((!z11 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.o2.k() != null) {
                org.telegram.ui.Components.voip.o2 k9 = org.telegram.ui.Components.voip.o2.k();
                if (k9.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (k9.B) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = gh.j.f7391n;
        if (hashMap != null) {
            for (gh.j jVar : hashMap.values()) {
                gh.i iVar = jVar.f7396f;
                if (iVar != null) {
                    iVar.f7381b = true;
                }
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        af.d dVar = this.f35581j0;
        dVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (dVar.f375f) {
            if (z10) {
                dVar.d(1.0f);
                dVar.f378j.a();
                ArrayList arrayList = dVar.f372b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((bf.b) obj).getClass();
                }
                if (dVar.f382n) {
                    dVar.f382n = false;
                    dVar.f380l.removeFrameCallback(dVar.f381m);
                }
                ArrayList arrayList2 = dVar.f371a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((bf.c) obj2).f();
                }
            } else if (dVar.f374e) {
                dVar.c(false);
            } else {
                dVar.a(true);
            }
        }
        if (!z10 && !this.f35588n1) {
            if (org.telegram.ui.Components.voip.h1.Z.R) {
                org.telegram.ui.Components.voip.h1.j();
            }
            if (lh.i1.V.O) {
                lh.i1.j();
            }
            if (org.telegram.ui.Components.bg0.f27076l0.L) {
                org.telegram.ui.Components.bg0.j(false);
            }
            r50.t1(this, null, false, true);
            if (PhotoViewer.W8 != null) {
                PhotoViewer.W8.P0();
            }
            if (PhotoViewer.C1()) {
                PhotoViewer.t1().G0(false, false);
            }
        }
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        af.d dVar = this.f35581j0;
        dVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        dVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.f35581j0.g(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        bg.f fVar;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (u(i10, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null && applicationLoader.checkRequestPermissionResult(i10, strArr, iArr)) {
                return;
            }
            if (this.m0.getFragmentStack().size() != 0) {
                this.m0.getFragmentStack().get(this.m0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f35589o0.getFragmentStack().size() != 0) {
                    this.f35589o0.getFragmentStack().get(this.f35589o0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
                if (this.f35587n0.getFragmentStack().size() != 0) {
                    this.f35587n0.getFragmentStack().get(this.f35587n0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
            }
            oh1.q(i10, iArr);
            nh.gb gbVar = nh.gb.B2;
            if (gbVar != null) {
                lh.b bVar = gbVar.f17736a;
                Activity activity = gbVar.f17739b;
                if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 111) {
                    gbVar.f17783o2 = !z10;
                    if (z10 && gbVar.f17740b0 == 0) {
                        gbVar.f17808w0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            gbVar.r();
                        } else {
                            CameraController.getInstance().initCamera(new nh.g9(gbVar, 0));
                        }
                    }
                } else if (i10 == 114) {
                    if (z10) {
                        MediaController.loadGalleryPhotosAlbums(0);
                        gbVar.f(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint));
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.P = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new nh.p9(gbVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        c2Var.show();
                    }
                } else if (i10 == 112) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                        c2Var2.P = replaceTags2;
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new nh.p9(gbVar, 3));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        c2Var2.show();
                    }
                } else if (i10 == 115) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity, 0, bVar);
                        alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory));
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22714a;
                        c2Var3.P = replaceTags3;
                        alertDialog$Builder3.k(LocaleController.getString(R.string.PermissionOpenSettings), new nh.p9(gbVar, 5));
                        alertDialog$Builder3.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        c2Var3.show();
                    }
                    if (z10 && (fVar = gbVar.f17803u2) != null) {
                        fVar.run();
                    }
                    gbVar.f17803u2 = null;
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i10), strArr, iArr);
            SparseIntArray sparseIntArray = this.X0;
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
        ag.r1 r1Var;
        super.onResume();
        A1 = true;
        af.d dVar = this.f35581j0;
        dVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (dVar.f375f) {
            dVar.a(false);
        }
        org.telegram.ui.Components.eu euVar = B1;
        if (euVar != null) {
            euVar.run();
            B1 = null;
        }
        if (org.telegram.ui.ActionBar.g6.f23253o == 3) {
            org.telegram.ui.ActionBar.g6.E(false);
        }
        I(true);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.m0.getView();
        this.f35590o1 = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.K).sortDialogs(null);
        E0();
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.g5(27));
        D(0);
        MediaController.checkGallery();
        g0();
        org.telegram.ui.Components.pd0 pd0Var = this.f35605w0;
        if (pd0Var != null && pd0Var.f31653b.getVisibility() == 0) {
            this.m0.n();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f35589o0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f35587n0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.f35605w0.f31653b.i();
            ArrayList arrayList = this.f35607x0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.ui.Components.nd0) obj).i();
            }
        } else {
            this.m0.M();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.f35589o0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
                ActionBarLayout actionBarLayout4 = this.f35587n0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.M();
                }
            }
        }
        ConnectionsManager.getInstance(this.K).setAppPaused(false, false);
        M0();
        if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            rt0 rt0Var = t12.f35647a0;
            if (rt0Var != null) {
                rt0Var.invalidate();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i8(t12, 0, 23), 100L);
            }
            org.telegram.ui.Components.x61 x61Var = t12.B2;
            if (x61Var != null) {
                x61Var.L(x61Var.o() + 1);
                if (t12.V2) {
                    t12.B2.O(true);
                }
            }
            ws0 ws0Var = t12.H1;
            if (ws0Var != null && (r1Var = ws0Var.S0.d) != null) {
                r1Var.postRunnable(r1Var.f648w);
            }
        }
        nh.gb gbVar = nh.gb.B2;
        if (gbVar != null) {
            gbVar.P();
        }
        if (PipRoundVideoView.B != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
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
        oh1 oh1Var = oh1.f41135j1;
        if (oh1Var != null) {
            if (org.telegram.ui.Components.voip.o2.k() != null) {
                org.telegram.ui.Components.voip.o2.i();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                oh1Var.H();
            } else if (VoIPService.getSharedState() == null) {
                oh1Var.f41166q0.b();
            }
            oh1Var.F0 = ((KeyguardManager) oh1Var.f41139b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.o2.k() != null) {
                org.telegram.ui.Components.voip.o2.k().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        a0();
        HashMap hashMap = gh.j.f7391n;
        if (hashMap != null) {
            for (gh.j jVar : hashMap.values()) {
                gh.i iVar = jVar.f7396f;
                if (iVar != null) {
                    iVar.f7381b = false;
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
    public final void onSaveInstanceState(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override
    public final void onStart() {
        Activity activity;
        super.onStart();
        this.f35588n1 = true;
        this.f35581j0.h();
        WeakReference weakReference = ye.d.f50520e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            ye.d.x(activity);
        }
        if (ye.d.f50518b == null) {
            ye.d.f50520e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(ye.d.d)) {
                    String a2 = h7.r7.a(this);
                    ye.d.d = a2;
                    if (a2 == null) {
                    }
                }
                Object obj = new Object();
                gf.a aVar = new gf.a();
                aVar.f7275b = new WeakReference(obj);
                ye.d.f50519c = aVar;
                String str = ye.d.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, aVar, 33)) {
                    ye.d.f50519c = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        ApplicationLoader.mainInterfaceStopped = false;
        org.telegram.ui.Components.w20.j(this);
        r50 r50Var = r50.f41867z3;
        if (r50Var != null) {
            ArrayList arrayList = r50Var.V1;
            r50.E3 = false;
            r50Var.L.l();
            f30 f30Var = r50Var.f41904i2;
            if (f30Var.getVisibility() == 0) {
                r50Var.f41915l2.G(f30Var, false);
            }
            if (r50.C3) {
                r50Var.f41912k2.I(r50Var.f41908j2, false);
            }
            arrayList.clear();
            arrayList.addAll(r50Var.U1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
            }
            v40 v40Var = r50Var.H;
            org.telegram.ui.Components.c81 c81Var = v40Var.v;
            if (c81Var != null) {
                c81Var.c(true);
            }
            v40Var.B = false;
            r50Var.D.s();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        this.f35588n1 = false;
        af.d dVar = this.f35581j0;
        dVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        dVar.f374e = false;
        if (dVar.f375f) {
            dVar.c(true);
        }
        dVar.d.unregisterReceiver(dVar.f383o);
        ye.d.x(this);
        ApplicationLoader.mainInterfaceStopped = true;
        org.telegram.ui.Components.w20.j(this);
        r50 r50Var = r50.f41867z3;
        if (r50Var != null) {
            r50.E3 = true;
            ArrayList arrayList = r50Var.V1;
            arrayList.clear();
            arrayList.addAll(r50Var.U1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(false);
            }
            v40 v40Var = r50Var.H;
            org.telegram.ui.Components.c81 c81Var = v40Var.v;
            if (c81Var != null) {
                c81Var.c(false);
            }
            v40Var.B = true;
            r50Var.D.r();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f35570d1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        af.d dVar = this.f35581j0;
        dVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        dVar.f();
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
                ((org.telegram.ui.ActionBar.o2) j7.l1.j(1, actionBarLayout.K0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.s sVar = actionBarLayout.C;
            if (sVar != null) {
                sVar.onUserLeaveHint();
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.A0;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) instanceof ph.p2) {
                    ph.p2 p2Var = (ph.p2) arrayList.get(i10);
                    if (p2Var.isShowing() && p2Var.D == j10) {
                        return;
                    }
                }
                i10++;
            } else {
                org.telegram.ui.ActionBar.o2 U = U();
                if (U != null && U.sheetsStack != null) {
                    for (int i11 = 0; i11 < U.sheetsStack.size(); i11++) {
                        if (U.sheetsStack.get(i11).isShown()) {
                            U.sheetsStack.get(i11);
                        }
                    }
                }
                sy w10 = this.m0.w();
                if (w10 != null && w10.sheetsStack != null) {
                    for (int i12 = 0; i12 < w10.sheetsStack.size(); i12++) {
                        if (w10.sheetsStack.get(i12).isShown()) {
                            w10.sheetsStack.get(i12);
                        }
                    }
                }
                o90 o90Var = new o90(this, 1);
                TLRPC.User user = MessagesController.getInstance(this.K).getUser(Long.valueOf(j10));
                if (user != null) {
                    o90Var.run(user);
                    return;
                } else {
                    MessagesStorage.getInstance(this.K).getStorageQueue().postRunnable(new g5.v(this, j10, o90Var, 29));
                    return;
                }
            }
        }
    }

    public final void s0(Long l10, x60 x60Var, ye.c cVar, org.telegram.ui.Cells.s1 s1Var) {
        ChannelBoostsController boostsController = MessagesController.getInstance(this.K).getBoostsController();
        if (cVar != null) {
            cVar.d();
        }
        boostsController.getBoostsStats(l10.longValue(), new n80(this, cVar, x60Var, boostsController, l10, s1Var));
    }

    @Override
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        af.d dVar = this.f35581j0;
        dVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        dVar.h = pictureInPictureParams;
    }

    public final void t0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, String str26, final String str27, final ye.c cVar, final boolean z12, final int i13, final int i14, final int i15, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i10).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.f35560x1;
                final ye.c cVar2 = cVar;
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
                            Pattern pattern2 = LaunchActivity.f35560x1;
                            LaunchActivity.this.x0(i16, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, z26, num3, l12, l13, num4, str42, hashMap2, str43, str44, str45, str46, tL_wallPaper2, str47, str48, str49, str50, z27, str51, i17, i18, str52, str53, str54, null, null, cVar2, z22, i19, false, i20, i21, null, null, z28, str55, z23, z24, z25, z29, z30, str56, null, z31, null);
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
                        Pattern pattern2 = LaunchActivity.f35560x1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.Z;
                        q00 q00Var = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList);
                        } else {
                            o2Var = null;
                        }
                        int i22 = i16;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str58 = str57;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z25;
                        boolean z37 = z22;
                        j90 j90Var = new j90(launchActivity2, o2Var, i22, user3, tL_messages_botApp2, atomicBoolean, str58, z34, z35, z36, z37);
                        if (z32) {
                            j90Var.run();
                        } else if (tL_messages_botApp2.inactive && z33) {
                            rb rbVar = new rb(j90Var, 2);
                            ye.c cVar3 = cVar2;
                            if (cVar3 != null) {
                                q00Var = new q00(cVar3, 14);
                            }
                            gi1.a(launchActivity2, rbVar, q00Var);
                        } else if (!tL_messages_botApp2.request_write_access && !z37) {
                            j90Var.run();
                        } else {
                            org.telegram.ui.Components.c5.n(o2Var, atomicBoolean, user3, j90Var);
                        }
                    }
                });
            }
        });
    }

    public final void u0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f35587n0;
        if (actionBarLayout != null) {
            actionBarLayout.U(z10, z10);
        } else {
            this.m0.U(z10, z10);
        }
    }

    @Override
    public final boolean v(final org.telegram.ui.fy r47, final java.util.ArrayList r48, final java.lang.CharSequence r49, final boolean r50, boolean r51, int r52, final int r53, org.telegram.ui.ze1 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.v(org.telegram.ui.fy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.ze1):boolean");
    }

    public final int v0(final int i10, final x60 x60Var, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i11, final int i12) {
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
                Pattern pattern = LaunchActivity.f35560x1;
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
                final Runnable runnable3 = x60Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x80.run():void");
                    }
                });
            }
        });
    }

    public final void w0(android.net.Uri r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.w0(android.net.Uri):void");
    }

    public final void x0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final ye.c r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.x0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ye.c, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void y(int i10) {
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.f35602u1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35602u1 = null;
        }
        if (i12 >= 26) {
            i11 = getWindow().getNavigationBarColor();
        } else {
            i11 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i11, i10);
        this.f35602u1 = ofArgb;
        ofArgb.addUpdateListener(new m80(this, 1));
        this.f35602u1.addListener(new x0(this, i10, 3));
        this.f35602u1.setInterpolator(org.telegram.ui.Components.jr.h);
        this.f35602u1.setDuration(320L);
        this.f35602u1.start();
    }

    public final void z(boolean z10) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z10 || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    boolean z11 = this.f35584k1;
                    this.f35584k1 = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z10, new jh.r5(this, z11, update, 27));
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
                    int i10 = this.K;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new jh.s1(this, i10, 6));
                }
            }
        }
    }

    public final void z0(int i10) {
        this.f35603v0.setInternalNavigationBarColor(i10);
        org.telegram.ui.ActionBar.m3 P = P();
        if (P != null) {
            P.setNavigationBarColor(i10);
        }
    }

    @Override
    public final void e(int[] iArr) {
    }
}
