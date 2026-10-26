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
public class LaunchActivity extends k5 implements org.telegram.ui.ActionBar.f5, NotificationCenter.NotificationCenterDelegate, ux, tf.a {
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static org.telegram.ui.Components.vu H1;
    public static LaunchActivity I1;
    public static Pattern J1;
    public static a0 K1;
    public static LaunchActivity L1;
    public org.telegram.ui.Components.ne0 A0;
    public ValueAnimator A1;
    public final ArrayList B0;
    public bi.ee B1;
    public org.telegram.ui.Components.p11 C0;
    public int C1;
    public org.telegram.ui.Components.ha D0;
    public final ArrayList E0;
    public org.telegram.ui.ActionBar.e2 F0;
    public View G0;
    public org.telegram.ui.ActionBar.e2 H0;
    public boolean I0;
    public HashMap J0;
    public HashMap K0;
    public Intent L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q;
    public String Q0;
    public String R;
    public String R0;
    public String S;
    public TLRPC.TL_wallPaper S0;
    public CharSequence T;
    public org.telegram.ui.ActionBar.x6 T0;
    public ArrayList U;
    public TLRPC.TL_theme U0;
    public ArrayList V;
    public boolean V0;
    public ArrayList W;
    public org.telegram.ui.ActionBar.e2 W0;
    public Uri X;
    public boolean X0;
    public String Y;
    public boolean Y0;
    public ArrayList Z;
    public zh.o4 Z0;
    public ArrayList f35523a0;
    public y5 f35524a1;
    public Uri f35525b0;
    public final ArrayList f35526b1;
    public int f35527c0;
    public final SparseIntArray f35528c1;
    public int f35530d1;
    public final la0 f35532e1;
    public FlagSecureReason f35534f1;
    public s90 f35535g0;
    public androidx.mediarouter.app.g f35536g1;
    public ArrayList f35537h0;
    public rh.e f35538h1;
    public ArrayList f35539i0;
    public boolean f35540i1;
    public String f35541j0;
    public ag.g0 f35542j1;
    public ActionMode f35543k0;
    public qa0 f35544k1;
    public boolean f35545l0;
    public ra0 l1;
    public final aa.m0 m0;
    public boolean f35546m1;
    public final sf.b f35547n0;
    public NotificationCenter.ObserversGroup f35548n1;
    public org.telegram.ui.Components.b31 f35549o0;
    public NotificationCenter.ObserversGroup f35550o1;
    public jg.l f35551p0;
    public boolean f35552p1;
    public ActionBarLayout f35553q0;
    public r90 f35554q1;
    public ActionBarLayout f35555r0;
    public ig.o f35556r1;
    public ActionBarLayout f35557s0;
    public boolean f35558s1;
    public fa0 f35559t0;
    public ViewGroup f35560t1;
    public FrameLayout f35561u0;
    public final el0 f35562u1;
    public jg.r1 f35563v0;
    public org.telegram.ui.ActionBar.e2 f35564v1;
    public k0 f35565w0;
    public org.telegram.ui.ActionBar.e2 f35566w1;
    public oa0 f35567x0;
    public boolean f35568x1;
    public org.telegram.ui.ActionBar.b4 f35569y0;
    public long f35570y1;
    public org.telegram.ui.ActionBar.d4 f35571z0;
    public int[] f35572z1;
    public final ArrayList P = new ArrayList();
    public final ArrayList f35529d0 = new ArrayList();
    public final ArrayList f35531e0 = new ArrayList();
    public final ArrayList f35533f0 = new ArrayList();

    public LaunchActivity() {
        ?? obj = new Object();
        obj.f1150a = new HashMap();
        obj.d = this;
        obj.f1151b = new sf.b(this);
        this.m0 = obj;
        this.f35547n0 = (sf.b) obj.f1151b;
        this.B0 = new ArrayList();
        this.E0 = new ArrayList();
        this.X0 = false;
        this.f35526b1 = new ArrayList();
        this.f35528c1 = new SparseIntArray();
        this.f35530d1 = 5934;
        this.f35532e1 = new Object();
        this.f35552p1 = true;
        System.identityHashCode(this);
        this.f35562u1 = new el0(this);
        this.C1 = 0;
    }

    public static void D0(AccountInstance accountInstance, cy cyVar, CharSequence charSequence, long j10, MessageObject messageObject, long j11, boolean z10, int i10, int i11) {
        boolean z11;
        org.telegram.ui.Components.qr0 qr0Var;
        org.telegram.ui.Components.qr0 qr0Var2;
        if (cyVar != null && (qr0Var2 = cyVar.G2) != null && !qr0Var2.f32009n) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z11 && cyVar != null && (qr0Var = cyVar.G2) != null) {
            webPage = qr0Var.getLoadedWebPage();
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
        LaunchActivity launchActivity = L1;
        if (launchActivity != null) {
            launchActivity.D(i10);
        }
    }

    public static void H0(LaunchActivity launchActivity, int i10, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        String restrictionReason;
        org.telegram.ui.ActionBar.r2 R = R();
        if (R != null) {
            long j10 = tL_attachMenuBot.bot_id;
            hi.c5 b10 = hi.c5.b(i10, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
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
            hi.m3 m3Var = new hi.m3(launchActivity, R.getResourceProvider());
            m3Var.B0 = false;
            m3Var.x(z10);
            m3Var.f13116l0 = launchActivity;
            m3Var.t(R, b10);
            m3Var.show();
        }
    }

    public static void L() {
        py pyVar;
        ArrayList<org.telegram.ui.ActionBar.n2> arrayList;
        org.telegram.ui.ActionBar.r2 U = U();
        if (U != null) {
            if (U.getParentLayout() instanceof ActionBarLayout) {
                pyVar = ((ActionBarLayout) U.getParentLayout()).w();
            } else {
                pyVar = null;
            }
            if (pyVar != null && (arrayList = pyVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    pyVar.sheetsStack.get(size).dismiss(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.n2> arrayList2 = U.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    U.sheetsStack.get(size2).dismiss(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = hi.m3.f13098a1.iterator();
            while (it.hasNext()) {
                arrayList3.add((hi.m3) it.next());
            }
            int size3 = arrayList3.size();
            int i10 = 0;
            while (i10 < size3) {
                Object obj = arrayList3.get(i10);
                i10++;
                ((hi.m3) obj).k(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.r2 N() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f23822a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.j5) ic.a.g(1, I1.P))).t();
        }
        LaunchActivity launchActivity2 = I1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return ((ActionBarLayout) I1.O()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.r2 R() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f23822a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.j5) ic.a.g(1, I1.P)).getLastFragment();
        }
        LaunchActivity launchActivity2 = I1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return I1.O().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.r2 U() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f23822a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.j5) ic.a.g(1, I1.P)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = I1;
        if (launchActivity2 != null && launchActivity2.O() != null) {
            return I1.O().getSafeLastFragment();
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
            if (J1 == null) {
                J1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
            }
            try {
                Matcher matcher = J1.matcher(str);
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
        bi.ee eeVar;
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((eeVar = launchActivity.B1) == null || ((View) eeVar.f3212a) != decorView)) {
                launchActivity.B1 = new bi.ee(decorView);
            }
            bi.ee eeVar2 = launchActivity.B1;
            if (eeVar2 != null) {
                View view = (View) eeVar2.f3212a;
                ArrayList arrayList = eeVar2.f4580b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(a8.ic.a(0.0f, 0.0f, f7, f10), a8.ic.a(view.getWidth(), 0.0f, f7, f10)), Math.max(a8.ic.a(0.0f, view.getHeight(), f7, f10), a8.ic.a(view.getWidth(), view.getHeight(), f7, f10))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    bi.de deVar = new bi.de(f7, f10, f11);
                    ofFloat.addUpdateListener(new bh.b0(1, eeVar2, deVar));
                    ofFloat.addListener(new bi.ce(0, eeVar2, deVar));
                    ofFloat.setInterpolator(org.telegram.ui.Components.ds.f27587g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(deVar);
                    eeVar2.f1();
                    ofFloat.start();
                }
            }
        }
    }

    public final void A() {
        if (this.O == UserConfig.selectedAccount && this.f35548n1 != null) {
            return;
        }
        NotificationCenter.ObserversGroup observersGroup = this.f35548n1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f35548n1 = null;
        }
        int i10 = UserConfig.selectedAccount;
        this.O = i10;
        this.f35548n1 = NotificationCenter.getInstance(i10).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
    }

    public final int A0(final int i10, final sz szVar, final Integer num, final Integer num2, final Long l4, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i11, final int i12) {
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
                Pattern pattern = LaunchActivity.D1;
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
                final Runnable runnable3 = szVar;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f90.run():void");
                    }
                });
            }
        });
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f35542j1 == null && SharedConfig.frameMetricsEnabled) {
                this.f35542j1 = ag.g0.b(this, this.f35565w0);
            }
            ag.g0 g0Var = this.f35542j1;
            if (g0Var != null && !SharedConfig.frameMetricsEnabled) {
                g0Var.c();
                this.f35542j1 = null;
            }
        }
    }

    public final void B0(android.net.Uri r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.B0(android.net.Uri):void");
    }

    @Override
    public final boolean C() {
        ArrayList arrayList = this.U;
        if ((arrayList != null && arrayList.size() == 1) || this.R != null) {
            return true;
        }
        return false;
    }

    public final void C0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final qf.c r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.C0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, qf.c, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void D(int i10) {
        L1 = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT >= 26 && i10 == 0) || this.f35568x1) {
            return;
        }
        Utilities.globalQueue.postRunnable(new h80(this, i10, 0), 2000L);
    }

    public final void E0(int i10) {
        this.f35571z0.setInternalNavigationBarColor(i10);
        org.telegram.ui.ActionBar.s3 P = P();
        if (P != null) {
            P.setNavigationBarColor(i10);
        }
    }

    public final void F() {
        int i10;
        if (AndroidUtilities.isTablet() && this.f35557s0 != null) {
            if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
                int i11 = 8;
                if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                    this.O0 = false;
                    List<org.telegram.ui.ActionBar.r2> fragmentStack = this.f35553q0.getFragmentStack();
                    if (fragmentStack.size() >= 2) {
                        while (1 < fragmentStack.size()) {
                            org.telegram.ui.ActionBar.r2 r2Var = fragmentStack.get(1);
                            if (r2Var instanceof un) {
                                ((un) r2Var).f44311k5 = true;
                            }
                            r2Var.onPause();
                            r2Var.onFragmentDestroy();
                            r2Var.setParentLayout(null);
                            fragmentStack.remove(r2Var);
                            this.f35557s0.c(-1, r2Var);
                        }
                        org.telegram.ui.Components.ne0 ne0Var = this.A0;
                        if (ne0Var == null || ne0Var.f30969b.getVisibility() != 0) {
                            this.f35553q0.W(true, true);
                            this.f35557s0.W(true, true);
                        }
                    }
                    ViewGroup view = this.f35557s0.getView();
                    if (this.f35557s0.getFragmentStack().isEmpty()) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    view.setVisibility(i10);
                    jg.r1 r1Var = this.f35563v0;
                    if (this.f35557s0.getFragmentStack().isEmpty()) {
                        i11 = 0;
                    }
                    r1Var.setVisibility(i11);
                    return;
                }
                this.O0 = true;
                List<org.telegram.ui.ActionBar.r2> fragmentStack2 = this.f35557s0.getFragmentStack();
                if (!fragmentStack2.isEmpty()) {
                    while (fragmentStack2.size() > 0) {
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentStack2.get(0);
                        if (r2Var2 instanceof un) {
                            ((un) r2Var2).f44311k5 = true;
                        }
                        r2Var2.onPause();
                        r2Var2.onFragmentDestroy();
                        r2Var2.setParentLayout(null);
                        fragmentStack2.remove(r2Var2);
                        this.f35553q0.c(-1, r2Var2);
                    }
                    org.telegram.ui.Components.ne0 ne0Var2 = this.A0;
                    if (ne0Var2 == null || ne0Var2.f30969b.getVisibility() != 0) {
                        this.f35553q0.W(true, true);
                    }
                }
                this.f35557s0.getView().setVisibility(8);
                jg.r1 r1Var2 = this.f35563v0;
                if (this.f35553q0.getFragmentStack().isEmpty()) {
                    i11 = 0;
                }
                r1Var2.setVisibility(i11);
            }
        }
    }

    public final void F0() {
        org.telegram.ui.ActionBar.d4 d4Var;
        ViewGroup view;
        int i10;
        if (this.f35571z0.indexOfChild(this.f35559t0) != -1) {
            d4Var = this.f35571z0;
            view = this.f35559t0;
        } else {
            d4Var = this.f35571z0;
            view = this.f35553q0.getView();
        }
        int indexOfChild = d4Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f35571z0.removeViewAt(indexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            fa0 fa0Var = new fa0(this, this);
            this.f35559t0 = fa0Var;
            if (indexOfChild != -1) {
                this.f35571z0.addView(fa0Var, indexOfChild, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            } else {
                this.f35571z0.addView(fa0Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            }
            jg.r1 r1Var = new jg.r1(this, null, 5);
            this.f35563v0 = r1Var;
            r1Var.setOccupyStatusBar(false);
            this.f35563v0.U(org.telegram.ui.ActionBar.y6.s0());
            this.f35559t0.addView(this.f35563v0, org.telegram.ui.Components.gb1.A(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.f35553q0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f35553q0.getView());
            }
            this.f35559t0.addView(this.f35553q0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f35557s0 = actionBarLayout;
            actionBarLayout.T0 = true;
            actionBarLayout.setFragmentStack(this.f35533f0);
            this.f35557s0.setDelegate(this);
            this.f35559t0.addView(this.f35557s0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f35561u0 = frameLayout;
            ArrayList arrayList = this.f35531e0;
            int i11 = 8;
            if (arrayList.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            frameLayout.setVisibility(i10);
            this.f35561u0.setBackgroundColor(1056964608);
            this.f35559t0.addView(this.f35561u0);
            this.f35561u0.setOnTouchListener(new d0(this, 3));
            this.f35561u0.setOnClickListener(new bh.f(21));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f35555r0 = actionBarLayout2;
            actionBarLayout2.S0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f35555r0.setBackgroundView(this.f35561u0);
            this.f35555r0.setUseAlphaAnimations(true);
            this.f35555r0.setFragmentStack(arrayList);
            this.f35555r0.setDelegate(this);
            this.f35555r0.setDrawerLayoutContainer(this.f35571z0);
            ViewGroup view2 = this.f35555r0.getView();
            if (!arrayList.isEmpty()) {
                i11 = 0;
            }
            view2.setVisibility(i11);
            this.f35559t0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f35553q0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f35553q0.getView());
            }
            this.f35553q0.setFragmentStack(this.f35529d0);
            if (indexOfChild != -1) {
                this.f35571z0.addView(this.f35553q0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f35571z0.addView(this.f35553q0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        a8.xe.a(this, SharedConfig.isFloatingDebugActive, false);
    }

    public final void G(boolean z10) {
        H(z10, true, !this.X0);
    }

    public final org.telegram.ui.ActionBar.e2 G0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.e2 p10 = alertDialog$Builder.p();
            p10.setCanceledOnTouchOutside(true);
            p10.setOnDismissListener(new bi.u3(11, this, p10));
            this.E0.add(p10);
            return p10;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void H(boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.ActionBar.r2 r2Var;
        int x02;
        sn snVar;
        boolean z13;
        ArrayList arrayList = this.f35529d0;
        boolean z14 = true;
        if (!arrayList.isEmpty()) {
            r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList);
        } else {
            r2Var = null;
        }
        char c10 = 2;
        if (r2Var != null && (r2Var.isRemovingFromStack() || r2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(2, arrayList);
            } else {
                r2Var = null;
            }
        }
        if (r2Var != null) {
            r2Var.hasForceLightStatusBar();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (z11) {
            if (r2Var != null) {
                z13 = r2Var.isLightStatusBar();
                if (r2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) r2Var.getParentLayout();
                    if (actionBarLayout.w() != null && actionBarLayout.w().getLastSheet() != null) {
                        org.telegram.ui.ActionBar.n2 lastSheet = actionBarLayout.w().getLastSheet();
                        if (lastSheet.isShown()) {
                            z13 = lastSheet.isAttachedLightStatusBar();
                        }
                    } else {
                        ArrayList<org.telegram.ui.ActionBar.n2> arrayList2 = r2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ic.a.g(1, r2Var.sheetsStack);
                            if (n2Var.isShown()) {
                                z13 = n2Var.isAttachedLightStatusBar();
                            }
                        }
                    }
                }
            } else {
                z13 = i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23636s8, true)) > 0.699999988079071d;
            }
            AndroidUtilities.setLightStatusBar(this, z13);
        }
        if (i10 >= 26 && z12 && (!z10 || r2Var == null || !r2Var.isInPreviewMode())) {
            if (r2Var != null && z10) {
                x02 = r2Var.getNavigationBarColor();
            } else {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23299a7, true);
            }
            if (r2Var instanceof un) {
                un unVar = (un) r2Var;
                if (!unVar.f44191ac || (unVar.v.f47625s != 1 && ((snVar = unVar.f44388qa) == null || !snVar.f43555q))) {
                    c10 = 1;
                }
            } else {
                c10 = 0;
            }
            if (P() != null && P().H > 0) {
                c10 = 0;
            }
            if (this.f35553q0.w() != null) {
                py w10 = this.f35553q0.w();
                if (w10.sheetsStack != null) {
                    for (int i11 = 0; i11 < w10.sheetsStack.size(); i11++) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = w10.sheetsStack.get(i11);
                        if (n2Var2.attachedToParent()) {
                            x02 = n2Var2.getNavigationBarColor(x02);
                            c10 = 0;
                        }
                    }
                }
            }
            Iterator it = hi.m3.f13098a1.iterator();
            while (it.hasNext()) {
                x02 = ((hi.m3) it.next()).getNavigationBarColor(x02);
                c10 = 0;
            }
            E0(x02);
            if ((c10 != 0 || AndroidUtilities.computePerceivedBrightness(x02) < 0.721f) && c10 != 1) {
                z14 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void I(boolean z10) {
        ChatObject.Call call;
        long j10;
        boolean z11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z12 = false;
        if (sharedInstance != null && (call = sharedInstance.groupCall) != null) {
            boolean z13 = this.f35545l0;
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
            this.f35545l0 = z12;
            if (!z10 && z13 && !z12 && !z11 && v50.D3 == null) {
                O0(38);
                return;
            }
            return;
        }
        this.f35545l0 = false;
    }

    public final void I0(p.a aVar) {
        org.telegram.ui.ActionBar.r2 r2Var;
        ArrayList arrayList = this.f35531e0;
        if (!arrayList.isEmpty()) {
            r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f35533f0;
            if (!arrayList2.isEmpty()) {
                r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.f35529d0;
                if (!arrayList3.isEmpty()) {
                    r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList3);
                } else {
                    r2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.wc.a(r2Var)) {
            aVar.c(org.telegram.ui.Components.wc.b0(r2Var)).j();
        }
    }

    public final void J() {
        ArrayList arrayList = this.f35529d0;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.r2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (AndroidUtilities.isTablet()) {
            ArrayList arrayList2 = this.f35531e0;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((org.telegram.ui.ActionBar.r2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f35533f0;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                ((org.telegram.ui.ActionBar.r2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void J0() {
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
                            public final LaunchActivity f44747b;

                            {
                                this.f44747b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.D1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f44747b;
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
                                                            launchActivity2.K0(localeInfoArr3[1], localeInfoArr3[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.K0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        Pattern pattern2 = LaunchActivity.D1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f44747b;
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
                                                            launchActivity22.K0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.K0(localeInfoArr4[1], localeInfoArr4[0], str5);
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
                            public final LaunchActivity f44747b;

                            {
                                this.f44747b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i11 = 0;
                                switch (r4) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.D1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i11 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i11);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f44747b;
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
                                                            launchActivity22.K0(localeInfoArr32[1], localeInfoArr32[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.K0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        Pattern pattern2 = LaunchActivity.D1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i11 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i11);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i11++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f44747b;
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
                                                            launchActivity22.K0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.K0(localeInfoArr4[1], localeInfoArr4[0], str5);
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

    @Override
    public final boolean K(org.telegram.ui.cy r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.K(org.telegram.ui.cy):boolean");
    }

    public final void K0(org.telegram.messenger.LocaleController.LocaleInfo r18, org.telegram.messenger.LocaleController.LocaleInfo r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.K0(org.telegram.messenger.LocaleController$LocaleInfo, org.telegram.messenger.LocaleController$LocaleInfo, java.lang.String):void");
    }

    public final void L0(boolean z10, boolean z11, int i10, int i11, ui uiVar) {
        if (this.f35571z0 != null && !isFinishing()) {
            if (this.A0 == null) {
                this.A0 = new org.telegram.ui.Components.ne0(this);
            }
            SharedConfig.appLocked = true;
            int i12 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f36191s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
                PhotoViewer.u1().H0(false, true);
            } else if (j4.I() && j4.x().V) {
                j4.x().o(false, true);
            }
            fi.sb.w();
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.A0.show();
            org.telegram.ui.Components.me0 me0Var = this.A0.f30969b;
            ArrayList arrayList = this.B0;
            arrayList.isEmpty();
            me0Var.m(z11, i10, i11, new sz(23, this, uiVar));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                org.telegram.ui.Components.le0 le0Var = (org.telegram.ui.Components.le0) arrayList.get(i13);
                if (z10) {
                    int size = arrayList.size() - 1;
                }
                le0Var.m(z11, i10, i11, null);
            }
            SharedConfig.isWaitingForPasscodeEnter = true;
            z90 z90Var = new z90(this);
            this.A0.f30969b.setDelegate(z90Var);
            int size2 = arrayList.size();
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((org.telegram.ui.Components.le0) obj).setDelegate(z90Var);
            }
            try {
                NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final java.util.ArrayList M(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.M(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void M0(int i10, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f7;
        if (this.C0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, frameLayout, null);
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
            linearLayout.addView(imageView, org.telegram.ui.Components.gb1.x(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.messenger.t.r(textView, i12, null, 1, 17.0f);
            textView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
            linearLayout.addView(textView, org.telegram.ui.Components.gb1.x(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f31412a = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, i12, null);
            org.telegram.ui.ActionBar.f7.H(textView2, org.telegram.ui.ActionBar.y6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(51);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f7 = 4.0f;
            scrollView.setPadding(AndroidUtilities.dp(24.0f), i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, org.telegram.ui.Components.gb1.r(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(LocaleController.getString(R.string.Decline).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            int i13 = org.telegram.ui.ActionBar.y6.f23748y6;
            org.telegram.ui.ActionBar.f7.V(textView3, i13, null);
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.y I0 = org.telegram.ui.ActionBar.y6.I0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i13, 25);
            textView3.setBackground(I0);
            org.telegram.ui.ActionBar.f7.k(textView3, I0, null, h, null);
            textView3.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
            frameLayout.addView(textView3, org.telegram.ui.Components.gb1.h(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    p11 p11Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                            e2Var.R = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new n11(p11Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            e2Var.T = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (p11Var.f31414c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                                e2Var2.R = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new n11(p11Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                e2Var2.T = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", p11Var.f31414c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            p11Var.a();
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
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, -11491093, -12346402, -12346402));
            textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(textView4, org.telegram.ui.Components.gb1.h(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    p11 p11Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                            e2Var.R = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new n11(p11Var, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            e2Var.T = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (p11Var.f31414c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                                e2Var2.R = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new n11(p11Var, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                e2Var2.T = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", p11Var.f31414c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            p11Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d7, view2, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.C0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f35571z0.addView(this.C0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            this.C0.setDelegate(new ga0(this));
        } else {
            f7 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i10).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f22084id.data.equals(tL_help_termsOfService.f22084id.data))) {
            UserConfig.getInstance(i10).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i10).saveConfig(false);
        }
        org.telegram.ui.Components.p11 p11Var = this.C0;
        if (p11Var.getVisibility() != 0) {
            p11Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(f7);
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
        p11Var.f31412a.setText(spannableStringBuilder);
        p11Var.f31414c = tL_help_termsOfService;
        p11Var.d = i10;
        this.C0.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    public final void N0(int i10, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        if (this.D0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
            frameLayout.f28897w = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.y6.x0(null, i11, false), 0});
            frameLayout.f28898x = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.y6.x0(null, i11, false), 0});
            org.telegram.ui.ActionBar.f7.i(i11, frameLayout, null);
            int i12 = (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight));
            ?? imageView = new ImageView(this);
            imageView.f(R.raw.qr_code_logo, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().K(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            frameLayout2.addView((View) imageView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 17, 0.0f, i12, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.f0((Object) frameLayout, 3));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f28893f = scrollView;
            AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23636s8, false));
            scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 27.0f, i12 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i13 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(textView, i13, null);
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.UpdateTelegram));
            frameLayout3.addView(textView, org.telegram.ui.Components.gb1.i(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f28890a = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, i13, null);
            org.telegram.ui.ActionBar.f7.H(textView2, org.telegram.ui.ActionBar.y6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(49);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            frameLayout3.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            bh.r rVar = new bh.r(this, 10);
            frameLayout.d = rVar;
            rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            rVar.setBackgroundDrawable(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
            rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            frameLayout.addView(rVar, org.telegram.ui.Components.gb1.h(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            rVar.setOnClickListener(new org.telegram.ui.Components.ga(0, frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f28891b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            rVar.addView(textView3, org.telegram.ui.Components.gb1.i(-2, -2, 17));
            bh.r rVar2 = new bh.r((Object) frameLayout, this, 11);
            frameLayout.f28892c = rVar2;
            rVar2.setWillNotDraw(false);
            rVar2.setAlpha(0.0f);
            rVar2.setScaleX(0.1f);
            rVar2.setScaleY(0.1f);
            rVar2.setVisibility(4);
            org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(rVar2);
            frameLayout.e = bk0Var;
            bk0Var.d(null, true, false);
            bk0Var.f26889o = -1;
            rVar.addView(rVar2, org.telegram.ui.Components.gb1.i(36, 36, 17));
            this.D0 = frameLayout;
            this.f35571z0.addView((View) frameLayout, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        }
        org.telegram.ui.Components.ha haVar = this.D0;
        haVar.v = 0;
        haVar.f28894n = tL_help_appUpdate;
        haVar.f28896s = i10;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            haVar.f28895r = FileLoader.getAttachFileName(document);
        }
        if (haVar.getVisibility() != 0) {
            haVar.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false);
        haVar.f28890a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            TextView textView4 = haVar.f28891b;
            textView4.setText(LocaleController.getString(R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tL_help_appUpdate.document.size)));
        } else {
            haVar.f28891b.setText(LocaleController.getString(R.string.Update));
        }
        NotificationCenter.getInstance(haVar.f28896s).addObserver(haVar, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(haVar.f28896s).addObserver(haVar, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(haVar.f28896s).addObserver(haVar, NotificationCenter.fileLoadProgressChanged);
        if (z10 && ApplicationLoader.isStandaloneBuild()) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(haVar.f28896s).sendRequest(tL_help_getAppUpdate, new org.telegram.ui.Components.b2(haVar, 1));
        }
    }

    public final org.telegram.ui.ActionBar.j5 O() {
        ActionBarLayout actionBarLayout = this.f35553q0;
        ArrayList arrayList = this.P;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.j5) ic.a.g(1, arrayList);
        }
        return actionBarLayout;
    }

    public final void O0(int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.f35529d0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.r2 r2Var = this.f35553q0.getFragmentStack().get(this.f35553q0.getFragmentStack().size() - 1);
            if (r2Var instanceof pg0) {
                r2Var = ((pg0) r2Var).X();
            }
            UndoView undoView = null;
            if (r2Var instanceof un) {
                un unVar = (un) r2Var;
                if (chat != null && unVar.a() == (-chat.f22027id)) {
                    chat = null;
                }
                unVar.X7();
                undoView = unVar.K3;
            } else if (r2Var instanceof cy) {
                undoView = ((cy) r2Var).g4();
            } else if (r2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) r2Var).L;
            }
            if (undoView != null) {
                undoView.m(0L, chat, i10);
            }
            if (i10 == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    public final org.telegram.ui.ActionBar.s3 P() {
        ActionBarLayout actionBarLayout = this.f35557s0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f35557s0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.f35553q0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.f35553q0.getBottomSheetTabs();
        }
        return null;
    }

    public final void P0(int i10) {
        Q0(i10, new org.telegram.ui.Components.voip.c1(12));
    }

    public final org.telegram.ui.ActionBar.r2 Q() {
        if (gg0.o1(this.O, false).getInt("currentViewNum", 0) != 0) {
            return new gg0();
        }
        return new p70();
    }

    public final void Q0(int i10, GenericProvider genericProvider) {
        if (i10 != UserConfig.selectedAccount && UserConfig.isValidAccount(i10)) {
            this.f35546m1 = true;
            ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
            UserConfig.selectedAccount = i10;
            UserConfig.getInstance(0).saveConfig(false);
            A();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAccountChanged, Integer.valueOf(i10));
            if (AndroidUtilities.isTablet()) {
                this.f35555r0.Z();
                this.f35557s0.Z();
                if (!this.O0) {
                    if (this.f35557s0.getFragmentStack().isEmpty()) {
                        this.f35563v0.setVisibility(0);
                    }
                    this.f35557s0.getView().setVisibility(8);
                }
                this.f35555r0.getView().setVisibility(8);
            }
            this.f35553q0.Z();
            this.f35553q0.c(-3, (pg0) genericProvider.provide(null));
            this.f35553q0.W(true, true);
            if (AndroidUtilities.isTablet()) {
                this.f35555r0.W(true, true);
                this.f35557s0.W(true, true);
            }
            if (!ApplicationLoader.mainInterfacePaused) {
                ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
            }
            if (UserConfig.getInstance(i10).unacceptedTermsOfService != null) {
                M0(i10, UserConfig.getInstance(i10).unacceptedTermsOfService);
            }
            R0();
            this.f35546m1 = false;
        }
    }

    public final void R0() {
        int i10;
        String str;
        if (this.f35553q0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.O).getConnectionState();
            this.f35527c0 = connectionState;
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
                i10 = 0;
                str = null;
            }
            if (connectionState == 1 || connectionState == 4) {
                o80Var = new o80(this, 5);
            }
            ActionBarLayout actionBarLayout = this.f35553q0;
            actionBarLayout.M0 = str;
            actionBarLayout.N0 = i10;
            actionBarLayout.O0 = o80Var;
            for (int i11 = 0; i11 < actionBarLayout.U0.size(); i11++) {
                ((org.telegram.ui.ActionBar.r2) actionBarLayout.U0.get(i11)).setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, o80Var);
            }
        }
    }

    public final int S() {
        return this.f35529d0.size();
    }

    public final rh.e T() {
        return this.f35538h1;
    }

    public final boolean X(android.content.Intent r122, boolean r123, boolean r124, boolean r125, qf.c r126, boolean r127, boolean r128) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.X(android.content.Intent, boolean, boolean, boolean, qf.c, boolean, boolean):boolean");
    }

    public final void Y() {
        ActionMode actionMode = this.f35543k0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Z(int i10, TLRPC.User user, String str, qf.c cVar) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = messagesController.getInputUser(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new Object(), new org.telegram.messenger.kh(this, cVar, messagesController, i10, user));
    }

    @Override
    public final void a(float f7) {
        if (j4.I() && j4.x().V) {
            j4 x9 = j4.x();
            x9.S();
            j4.g0(x9);
            if (x9.f40435f0 != null) {
                x9.f40449u0[0].f41443b.g1();
                x9.f40449u0[1].f41443b.g1();
                x9.f40435f0.invalidate();
                x9.f40445q0.invalidate();
                if (f7 == 1.0f) {
                    x9.f40449u0[0].f41444c.l();
                    x9.f40449u0[1].f41444c.l();
                }
            }
        }
        if (PhotoViewer.E1()) {
            PhotoViewer.u1().w3();
        }
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.f35555r0) {
            this.f35557s0.W(z10, z10);
            this.f35553q0.W(z10, z10);
        }
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.b0():void");
    }

    public final void d0() {
        org.telegram.ui.ActionBar.j5[] j5VarArr = {this.f35553q0, this.f35555r0, this.f35557s0};
        for (int i10 = 0; i10 < 3; i10++) {
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[i10];
            if (j5Var instanceof ActionBarLayout) {
                ((ActionBarLayout) j5Var).E();
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

    public final boolean e0(boolean z10) {
        boolean z11;
        og.i iVar = a8.xe.f986a;
        if (iVar != null) {
            if (iVar.f19414s) {
                if (z10) {
                    iVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.ne0 ne0Var = this.A0;
        if (ne0Var != null && ne0Var.f30969b.getVisibility() == 0) {
            if (z10) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.b4 b4Var = this.f35569y0;
            if (b4Var != null && (z11 = b4Var.U)) {
                if (z10 && z11) {
                    b4Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.oo0.H;
                if (e2Var != null) {
                    if (z10) {
                        e2Var.dismiss();
                        org.telegram.ui.Components.oo0.H = null;
                        return false;
                    }
                } else if (ft.f39445g0 != null && ft.o().E) {
                    if (z10) {
                        ft.o().m();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f36191s) {
                    if (z10) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
                    if (z10) {
                        PhotoViewer.u1().H0(true, false);
                        return false;
                    }
                } else if (!j4.I() || !j4.x().V) {
                    return true;
                } else {
                    if (z10) {
                        j4.x().o(true, false);
                    }
                }
            }
        }
        return false;
    }

    public final void f0() {
        y5 y5Var = this.f35524a1;
        if (y5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            this.f35524a1 = null;
        }
        if (!this.Q) {
            this.Q = true;
            NotificationCenter.ObserversGroup observersGroup = this.f35548n1;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.f35548n1 = null;
            }
            NotificationCenter.ObserversGroup observersGroup2 = this.f35550o1;
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                this.f35550o1 = null;
            }
            r90 r90Var = this.f35554q1;
            if (r90Var != null) {
                LiteMode.removeOnPowerSaverAppliedListener(r90Var);
            }
        }
    }

    public final void g0(Intent intent, qf.c cVar) {
        super.onNewIntent(intent);
        X(intent, true, false, false, cVar, true, false);
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.r2 r2Var, ActionBarLayout actionBarLayout) {
        boolean z10;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (AndroidUtilities.isTablet()) {
            boolean z11 = r2Var instanceof cy;
            if (!z11 && !(r2Var instanceof pg0)) {
                if ((r2Var instanceof un) && !((un) r2Var).c()) {
                    boolean z12 = this.O0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f35557s0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f35563v0.setVisibility(8);
                        this.f35557s0.Z();
                        this.f35557s0.c(-1, r2Var);
                        if (!this.f35555r0.getFragmentStack().isEmpty()) {
                            while (this.f35555r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f35555r0;
                                actionBarLayout4.c0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f35555r0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.f35553q0)) {
                        actionBarLayout2.c(-1, r2Var);
                        if (!this.f35555r0.getFragmentStack().isEmpty()) {
                            while (this.f35555r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f35555r0;
                                actionBarLayout5.c0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f35555r0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f35555r0;
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
                    if ((r2Var instanceof gg0) && i10 == -1) {
                        this.f35563v0.setVisibility(0);
                        this.f35561u0.setBackgroundColor(0);
                    } else {
                        this.f35561u0.setBackgroundColor(2130706432);
                    }
                    this.f35555r0.c(-1, r2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.f35553q0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z11 && !((cy) r2Var).p4()) {
                    z10 = false;
                }
                if (z10) {
                    this.f35553q0.Z();
                    this.f35553q0.c(-1, r2Var);
                    this.f35555r0.Z();
                    this.f35555r0.getView().setVisibility(8);
                    if (!this.O0 && this.f35557s0.getFragmentStack().isEmpty()) {
                        this.f35563v0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.f35524a1 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodePause");
            }
            AndroidUtilities.cancelRunOnUIThread(this.f35524a1);
            this.f35524a1 = null;
        }
        if (SharedConfig.passcodeHash.length() != 0) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            y5 y5Var = new y5(this, 9);
            this.f35524a1 = y5Var;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(y5Var, 1000L);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in 1000");
                }
            } else if (SharedConfig.autoLockIn != 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in " + ((SharedConfig.autoLockIn * 1000) + 1000));
                }
                AndroidUtilities.runOnUIThread(this.f35524a1, (SharedConfig.autoLockIn * 1000) + 1000);
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
    }

    public final void i0() {
        if (this.f35524a1 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodeResume");
            }
            AndroidUtilities.cancelRunOnUIThread(this.f35524a1);
            this.f35524a1 = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            L0(true, false, -1, -1, null);
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
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36191s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
            PhotoViewer.u1().H0(true, false);
            return true;
        } else if (!j4.I() || !j4.x().V) {
            return false;
        } else {
            j4.x().o(true, false);
            return true;
        }
    }

    public final void j0() {
        org.telegram.ui.ActionBar.e2 e2Var = this.W0;
        if (e2Var != null) {
            try {
                e2Var.dismiss();
            } finally {
                this.W0 = null;
            }
        }
        this.R0 = null;
        this.S0 = null;
        this.T0 = null;
        this.Q0 = null;
        this.U0 = null;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f35553q0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.f35546m1) {
                f0();
                finish();
                return false;
            } else if (actionBarLayout == this.f35557s0) {
                if (!this.O0) {
                    this.f35563v0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f35555r0 && this.f35553q0.getFragmentStack().isEmpty() && this.f35555r0.getFragmentStack().size() == 1) {
                f0();
                finish();
                return false;
            }
        } else if (actionBarLayout.getFragmentStack().size() <= 1) {
            f0();
            finish();
            return false;
        }
        return true;
    }

    public final void k0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.k0(boolean):void");
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.g5 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.g5):boolean");
    }

    public final void l0(TL_account.Password password) {
        String str;
        gg0 gg0Var = new gg0();
        o80 o80Var = new o80(this, 0);
        gg0Var.F = 3;
        gg0Var.f39651a = 12;
        gg0Var.f39657d0 = o80Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f34907a |= 256;
                obj.f34908b = indexOf;
                int i10 = lastIndexOf + 1;
                obj.f34909c = i10;
                valueOf.setSpan(new org.telegram.ui.Components.z11(obj, 0), indexOf, i10, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            alertDialog$Builder.f22368a.R = valueOf;
            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.EmailLoginChangeMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChangeEmail), new org.telegram.ui.Components.voip.k1(18, this, gg0Var));
            ic.a.r(R.string.Cancel, alertDialog$Builder, null);
            return;
        }
        u0(gg0Var);
    }

    public final void m0(final long j10, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i10, final int i11) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            u0(af1.F0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(this.O).getInputChannel(-j10);
        tL_channels_getMessages.f22065id.add(num);
        ConnectionsManager.getInstance(this.O).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new x80(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i10, i11));
            }
        });
    }

    public final void n0(int i10, long j10, TLRPC.TL_error tL_error) {
        un unVar = new un(a1.g.h(j10, "user_id"));
        u0(unVar);
        AndroidUtilities.runOnUIThread(new nq(tL_error, unVar, MessagesController.getInstance(i10).getUser(Long.valueOf(j10)), 13), 300L);
    }

    public final void o0(int i10, String str, String str2, qf.c cVar) {
        if (cVar != null) {
            cVar.d();
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_importContactToken, new ag.p0(this, cVar, messagesController, i10, str2, 12));
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f35543k0 == actionMode) {
            this.f35543k0 = null;
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f35553q0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f22355y;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.C0 = false;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35557s0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f22355y;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.C0 = false;
                ActionBarLayout actionBarLayout3 = this.f35555r0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f22355y;
                if (kVar3 != null) {
                    kVar3.setVisibility(0);
                }
                actionBarLayout3.C0 = false;
            }
        }
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.f35543k0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.f35553q0.s(menu) && AndroidUtilities.isTablet() && !this.f35557s0.s(menu)) {
                this.f35555r0.s(menu);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f35553q0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.f22355y;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.C0 = true;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35557s0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.f22355y;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.C0 = true;
                ActionBarLayout actionBarLayout3 = this.f35555r0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.f22355y;
                if (kVar3 != null) {
                    kVar3.setVisibility(8);
                }
                actionBarLayout3.C0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        di.q4 currentPeerView;
        org.telegram.ui.Components.ba1 ba1Var;
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
                v50 v50Var = v50.D3;
                if (v50Var != null) {
                    v50Var.dismissInternal();
                }
                AndroidUtilities.runOnUIThread(new o80(this, 4), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i10, i11, intent);
        String str = null;
        if (i10 >= 22336 && i10 <= 22399) {
            org.telegram.ui.Wallet.v0 v0Var = a8.af.f360b;
            if (v0Var != null && v0Var.e == this && v0Var.f37367f && v0Var.f37368g == i10) {
                if (i11 != -1) {
                    str = "AUTH_CANCELED";
                }
                v0Var.c(str);
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
            ig.o oVar = this.f35556r1;
            if (oVar != null) {
                if (i11 == -1) {
                    z10 = true;
                }
                oVar.run(Boolean.valueOf(z10));
                this.f35556r1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f26325p;
            if (themeEditorView != null && (ba1Var = themeEditorView.f26335m) != null) {
                ba1Var.a(i10, i11, intent);
            }
            ActionBarLayout actionBarLayout = this.f35553q0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.r2 r2Var = this.f35553q0.getFragmentStack().get(this.f35553q0.getFragmentStack().size() - 1);
                r2Var.onActivityResultFragment(i10, i11, intent);
                if (r2Var.getLastStoryViewer() != null && (currentPeerView = r2Var.getLastStoryViewer().f9445n0.getCurrentPeerView()) != null && i11 == -1) {
                    if (i10 != 0 && i10 != 2) {
                        if (i10 == 21) {
                            if (intent == null) {
                                currentPeerView.X0();
                            } else {
                                if (intent.getData() != null) {
                                    currentPeerView.Q0(intent.getData());
                                } else if (intent.getClipData() != null) {
                                    ClipData clipData = intent.getClipData();
                                    for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                        currentPeerView.Q0(clipData.getItemAt(i12).getUri());
                                    }
                                } else {
                                    currentPeerView.X0();
                                }
                                di.a3 a3Var = currentPeerView.f9045x2;
                                if (a3Var != null) {
                                    a3Var.dismiss();
                                }
                                currentPeerView.i0(true);
                            }
                        }
                    } else {
                        currentPeerView.r0();
                        di.a3 a3Var2 = currentPeerView.f9045x2;
                        if (a3Var2 != null) {
                            a3Var2.f33033j0.g0(i10, intent, null);
                        }
                    }
                }
            }
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35557s0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f35557s0.getFragmentStack().get(this.f35557s0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f35555r0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f35555r0.getFragmentStack().get(this.f35555r0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onActivityResultReceived, Integer.valueOf(i10), Integer.valueOf(i11), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (e0(true)) {
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f35555r0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f35555r0.H();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f35557s0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f35557s0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.r2 r2Var = this.f35557s0.getFragmentStack().get(this.f35557s0.getFragmentStack().size() - 1);
                    if (r2Var.onBackPressed(true)) {
                        r2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.f35553q0.H();
                return;
            }
            this.f35553q0.H();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        this.f35562u1.a();
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        this.f35547n0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        AndroidUtilities.resetTabletFlag();
        b0();
        F();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            int i10 = pipRoundVideoView.f26204x.getInt("sidex", 1);
            int i11 = pipRoundVideoView.f26204x.getInt("sidey", 0);
            float f7 = pipRoundVideoView.f26204x.getFloat("px", 0.0f);
            float f10 = pipRoundVideoView.f26204x.getFloat("py", 0.0f);
            pipRoundVideoView.v.x = PipRoundVideoView.b(f7, i10, pipRoundVideoView.h, true);
            pipRoundVideoView.v.y = PipRoundVideoView.b(f10, i11, pipRoundVideoView.f26200n, false);
            pipRoundVideoView.f26203w.updateViewLayout(pipRoundVideoView.f26196a, pipRoundVideoView.v);
        }
        org.telegram.ui.Components.dv dvVar = org.telegram.ui.Components.dv.S;
        if (dvVar != null) {
            dvVar.onConfigurationChanged(configuration);
        }
        vg.n nVar = vg.n.e;
        if (nVar != null) {
            nVar.onConfigurationChanged(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        ThemeEditorView themeEditorView = ThemeEditorView.f26325p;
        if (themeEditorView != null) {
            int i12 = themeEditorView.f26334l.getInt("sidex", 1);
            int i13 = themeEditorView.f26334l.getInt("sidey", 0);
            float f11 = themeEditorView.f26334l.getFloat("px", 0.0f);
            float f12 = themeEditorView.f26334l.getFloat("py", 0.0f);
            themeEditorView.f26331i.x = ThemeEditorView.c(f11, i12, themeEditorView.f26330g, true);
            themeEditorView.f26331i.y = ThemeEditorView.c(f12, i13, themeEditorView.h, false);
            try {
                if (themeEditorView.f26328c.getParent() != null) {
                    themeEditorView.f26332j.updateViewLayout(themeEditorView.f26328c, themeEditorView.f26331i);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (org.telegram.ui.ActionBar.y6.f23553o == 3) {
            org.telegram.ui.ActionBar.y6.E(false);
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
        E1 = true;
        F1++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        I1 = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.O = UserConfig.selectedAccount;
        if (BuildVars.DEBUG_VERSION || BuildVars.DEBUG_PRIVATE_VERSION) {
            this.f35536g1 = new androidx.mediarouter.app.g(this, 9);
            IntentFilter intentFilter = new IntentFilter("org.telegram.messenger.DEBUG_THEME");
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(this.f35536g1, intentFilter, 2);
            } else {
                registerReceiver(this.f35536g1, intentFilter);
            }
        }
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
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23636s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.y6(1));
        getWindow().setFormat(-1);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new org.telegram.ui.Components.voip.c1(11));
        this.f35534f1 = flagSecureReason;
        flagSecureReason.attach();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            AndroidUtilities.isInMultiwindow = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.y6.O();
        org.telegram.ui.ActionBar.y6.S(this);
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        this.f35553q0 = new ActionBarLayout(this, true);
        k0 k0Var = new k0(this, this, 10);
        this.f35565w0 = k0Var;
        k0Var.setClipToPadding(false);
        this.f35565w0.setClipChildren(false);
        setContentView(this.f35565w0);
        this.f35538h1 = new rh.e(this.f35565w0);
        ma0 ma0Var = new ma0(this);
        aa.m0 m0Var = this.m0;
        ((sf.b) m0Var.f1151b).f48106a.add(ma0Var);
        ((ViewGroup) getWindow().getDecorView()).addView(m0Var.o());
        m0Var.o().bringToFront();
        org.telegram.ui.Components.b31 b31Var = new org.telegram.ui.Components.b31(this);
        this.f35549o0 = b31Var;
        b31Var.setVisibility(8);
        org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(this);
        this.f35571z0 = d4Var;
        d4Var.setActionBarLayout(this.f35553q0);
        this.f35571z0.addOnLayoutChangeListener(new Object());
        this.f35571z0.setClipChildren(false);
        this.f35571z0.setClipToPadding(false);
        this.f35565w0.addView(this.f35571z0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        jg.l lVar = new jg.l(this, 4);
        this.f35551p0 = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f35565w0.addView(this.f35551p0, org.telegram.ui.Components.gb1.g(48.0f, 48));
        this.f35551p0.setVisibility(8);
        k0 k0Var2 = this.f35565w0;
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this);
        this.f35569y0 = b4Var;
        k0Var2.addView(b4Var);
        k0 k0Var3 = this.f35565w0;
        ?? z00Var = new org.telegram.ui.Components.z00(this);
        z00Var.setVisibility(8);
        this.f35567x0 = z00Var;
        k0Var3.addView(z00Var);
        F0();
        this.f35571z0.setParentActionBarLayout(this.f35553q0);
        this.f35553q0.setDrawerLayoutContainer(this.f35571z0);
        this.f35553q0.setFragmentStack(this.f35529d0);
        this.f35553q0.setFragmentStackChangedListener(new o80(this, 2));
        this.f35553q0.setDelegate(this);
        org.telegram.ui.ActionBar.y6.m1(true);
        A();
        R0();
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.closeOtherAppActivities;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i11, this);
        this.f35527c0 = ConnectionsManager.getInstance(this.O).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.f35550o1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f35550o1 = null;
        }
        this.f35550o1 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i11).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        r90 r90Var = new r90(this, 0);
        this.f35554q1 = r90Var;
        LiteMode.addOnPowerSaverAppliedListener(r90Var);
        if (this.f35553q0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f35555r0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!UserConfig.getInstance(this.O).isClientActivated()) {
                this.f35553q0.c(-1, Q());
            } else {
                this.f35553q0.c(-1, new pg0());
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
                                    this.f35553q0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.f35553q0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    un unVar = new un(bundle2);
                                    if (this.f35553q0.c(-1, unVar)) {
                                        unVar.f44277h8 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    x60 x60Var = new x60(bundle2);
                                    if (this.f35553q0.c(-1, x60Var)) {
                                        x60Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    nd ndVar = new nd(bundle2);
                                    if (this.f35553q0.c(-1, ndVar)) {
                                        ndVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", UserConfig.getInstance(this.O).clientUserId);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.f35553q0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.f35553q0.c(-1, new d81(null));
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
        H(false, true, !this.X0);
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
                s90 s90Var = new s90(rootView, 0);
                this.f35535g0 = s90Var;
                viewTreeObserver.addOnGlobalLayoutListener(s90Var);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i12 = Build.VERSION.SDK_INT;
        FingerprintController.checkKeyReady();
        if (i12 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000 && SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
            Pattern pattern = org.telegram.ui.Components.g5.f28420a;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String string2 = LocaleController.getString(R.string.AllowBackgroundActivity);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
            e2Var.R = string2;
            if (OneUIUtilities.isOneUI()) {
                if (i12 >= 31) {
                    i10 = R.string.AllowBackgroundActivityInfoOneUIAboveS;
                } else {
                    i10 = R.string.AllowBackgroundActivityInfoOneUIBelowS;
                }
            } else {
                i10 = R.string.AllowBackgroundActivityInfo;
            }
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(i10));
            int i13 = R.raw.permission_request_apk;
            int i14 = org.telegram.ui.ActionBar.y6.L5;
            alertDialog$Builder.m(i13, 72, org.telegram.ui.ActionBar.y6.x0(null, i14, false), null);
            alertDialog$Builder.n(i14, null);
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new org.telegram.ui.Components.g1(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            e2Var.setOnDismissListener(new fi.e1(3));
            e2Var.show();
            SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
        }
        if (i12 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new pa0(this));
        }
        org.telegram.ui.Components.qc.a(this.f35565w0, new fi.k8(9));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        y21.W(false);
        if (i12 >= 34) {
            if (this.f35544k1 == null) {
                this.f35544k1 = new qa0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f35544k1);
        } else if (i12 >= 33) {
            if (this.l1 == null) {
                this.l1 = new ra0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.l1);
        }
        B();
    }

    @Override
    public final void onDestroy() {
        ag.g0 g0Var;
        k0 k0Var;
        org.telegram.ui.Wallet.v0 v0Var = a8.af.f360b;
        if (v0Var != null && v0Var.e == this) {
            v0Var.c("AUTH_CANCELED");
            a8.af.f360b.e();
        }
        E1 = false;
        F1--;
        androidx.mediarouter.app.g gVar = this.f35536g1;
        if (gVar != null) {
            unregisterReceiver(gVar);
            this.f35536g1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.f35607b9 != null) {
                PhotoViewer.f35607b9.Q0();
            }
            if (PhotoViewer.E1()) {
                PhotoViewer.u1().Q0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f7 = SecretMediaViewer.f();
                Runnable runnable = f7.f36185p1;
                if (runnable != null) {
                    runnable.run();
                    f7.f36185p1 = null;
                }
                ag.b1 b1Var = f7.l1;
                if (b1Var != null) {
                    b1Var.destroy();
                    f7.l1 = null;
                }
                NotificationCenter.getInstance(f7.f36151a).removeObserver(f7, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f7.f36151a).removeObserver(f7, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f7.f36151a).removeObserver(f7, NotificationCenter.didCreatedNewDeleteTask);
                f7.f36191s = false;
                f7.N = null;
                ImageReceiver.BitmapHolder bitmapHolder = f7.f36171i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f7.f36171i0 = null;
                }
                f7.i();
                if (f7.f36154b != null && (k0Var = f7.d) != null) {
                    try {
                        if (k0Var.getParent() != null) {
                            ((WindowManager) f7.f36154b.getSystemService("window")).removeViewImmediate(f7.d);
                        }
                        f7.d = null;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                SecretMediaViewer.f36150x1 = null;
            }
            if (j4.I()) {
                j4.x().t();
            }
            if (ft.f39445g0 != null) {
                ft o10 = ft.o();
                o10.E = false;
                o10.f39459l = null;
                o10.W = null;
                o10.Y = null;
                o10.f39447a0 = null;
                if (o10.f39469w != null && o10.f39471y != null) {
                    Bitmap bitmap = o10.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        o10.v = null;
                    }
                    o10.M = 0.0f;
                    o10.K = false;
                    try {
                        if (o10.f39471y.getParent() != null) {
                            ((WindowManager) o10.f39469w.getSystemService("window")).removeViewImmediate(o10.f39471y);
                        }
                        o10.f39471y = null;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    ft.f39445g0 = null;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
                }
            }
            v50 v50Var = v50.D3;
            if (v50Var != null) {
                v50Var.dismissInternal();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i10 = org.telegram.ui.ActionBar.y6.f23292a;
            org.telegram.ui.Components.dv dvVar = org.telegram.ui.Components.dv.S;
            if (dvVar != null) {
                dvVar.G();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f26325p;
            if (themeEditorView != null) {
                themeEditorView.b();
            }
            og.i iVar = a8.xe.f986a;
            if (iVar != null) {
                iVar.e.edit().putFloat("x", (float) iVar.f19410c.f18969u.f18975i).putFloat("y", (float) iVar.d.f18969u.f18975i).commit();
            }
            a8.xe.f986a = null;
            SparseArray sparseArray = org.telegram.ui.Components.t5.f32839r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.f35560t1, false);
        for (int i11 = 0; i11 < this.E0.size(); i11++) {
            try {
                if (((Dialog) this.E0.get(i11)).isShowing()) {
                    ((Dialog) this.E0.get(i11)).dismiss();
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        this.E0.clear();
        try {
            if (this.f35535g0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f35535g0);
            }
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (this.f35544k1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f35544k1);
            }
        } else if (i12 >= 33 && this.f35544k1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.l1);
        }
        org.telegram.ui.Components.qc.h(this.f35565w0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        f0();
        FlagSecureReason flagSecureReason = this.f35534f1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i12 >= 24 && (g0Var = this.f35542j1) != null) {
            g0Var.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 82 && !SharedConfig.isWaitingForPasscodeEnter) {
            if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (j4.I() && j4.x().V) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f35555r0.getView().getVisibility() == 0 && !this.f35555r0.getFragmentStack().isEmpty()) {
                    this.f35555r0.getView().onKeyUp(i10, keyEvent);
                } else if (this.f35557s0.getView().getVisibility() == 0 && !this.f35557s0.getFragmentStack().isEmpty()) {
                    this.f35557s0.getView().onKeyUp(i10, keyEvent);
                } else {
                    this.f35553q0.getView().onKeyUp(i10, keyEvent);
                }
            } else {
                this.f35553q0.getView().onKeyUp(i10, keyEvent);
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.f35553q0;
        if (actionBarLayout != null) {
            actionBarLayout.L();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.f35557s0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.L();
                }
                ActionBarLayout actionBarLayout3 = this.f35555r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.L();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z10) {
        AndroidUtilities.isInMultiwindow = z10;
        this.f35562u1.a();
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
        G1 = false;
        org.telegram.ui.Components.fb1.l(true);
        sf.b bVar = this.f35547n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (AndroidUtilities.isInPictureInPictureMode(bVar.d) && bVar.e() && Build.VERSION.SDK_INT >= 31) {
            bVar.b();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        Utilities.stageQueue.postRunnable(new hi.t2(this.O, 14));
        h0();
        this.f35553q0.N();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.f35557s0;
            if (actionBarLayout != null) {
                actionBarLayout.N();
            }
            ActionBarLayout actionBarLayout2 = this.f35555r0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.N();
            }
        }
        org.telegram.ui.Components.ne0 ne0Var = this.A0;
        if (ne0Var != null) {
            ne0Var.f30969b.k();
        }
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.le0) obj).k();
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            z10 = applicationLoader.onPause();
        } else {
            z10 = false;
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(!z10, false);
        if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
            PhotoViewer u12 = PhotoViewer.u1();
            if (u12.f35692j2 != null) {
                u12.H0(false, false);
            } else {
                org.telegram.ui.Components.s81 s81Var = u12.F2;
                if (s81Var != null && u12.Z2) {
                    s81Var.N(AndroidUtilities.isInPictureInPictureMode(u12.f35825y));
                }
            }
        }
        fi.sb sbVar = fi.sb.F2;
        if (sbVar != null) {
            sbVar.u(false);
            fi.ib ibVar = sbVar.f11614c1;
            if (ibVar != null) {
                ibVar.f11199f.r();
            }
            fi.gb gbVar = sbVar.X0;
            if (gbVar != null) {
                gbVar.x(0, true);
            }
        }
        ph1 ph1Var = ph1.f42509n1;
        if (ph1Var != null) {
            boolean isInteractive = ((PowerManager) ph1Var.f42513b.getSystemService("power")).isInteractive();
            int a2 = vf.b.a(ph1Var.f42513b);
            if (a2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (ph1Var.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a2 == 2) {
                int measuredHeight = ph1.f42509n1.f42548u0.getMeasuredHeight();
                ph1 ph1Var2 = ph1.f42509n1;
                org.telegram.ui.Components.voip.n2.l(ph1Var2.f42513b, ph1Var2.f42510a, ph1Var2.f42548u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = ph1.f42509n1.f42544r0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.n2.X = windowInsets.getSystemWindowInsetTop();
                    ph1.f42509n1.f42544r0.getSystemWindowInsetBottom();
                }
            }
            if (ph1Var.f42539n0 && ((!z11 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.n2.k() != null) {
                org.telegram.ui.Components.voip.n2 k10 = org.telegram.ui.Components.voip.n2.k();
                if (k10.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (k10.G) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = xh.f.f51849n;
        if (hashMap != null) {
            for (xh.f fVar : hashMap.values()) {
                xh.e eVar = fVar.f51853f;
                if (eVar != null) {
                    eVar.f51840b = true;
                }
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        sf.b bVar = this.f35547n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (bVar.f48109f) {
            if (z10) {
                bVar.d(1.0f);
                bVar.f48112j.a();
                ArrayList arrayList = bVar.f48107b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((tf.b) obj).getClass();
                }
                if (bVar.f48116n) {
                    bVar.f48116n = false;
                    bVar.f48114l.removeFrameCallback(bVar.f48115m);
                }
                ArrayList arrayList2 = bVar.f48106a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((tf.c) obj2).f();
                }
            } else if (bVar.e) {
                bVar.c(false);
            } else {
                bVar.a(true);
            }
        }
        if (!z10 && !this.f35558s1) {
            if (org.telegram.ui.Components.voip.i1.f33844d0.V) {
                org.telegram.ui.Components.voip.i1.j();
            }
            if (di.o1.Z.S) {
                di.o1.j();
            }
            if (org.telegram.ui.Components.ch0.f27159p0.P) {
                org.telegram.ui.Components.ch0.j(false);
            }
            v50.t1(this, null, false, true);
            if (PhotoViewer.f35607b9 != null) {
                PhotoViewer.f35607b9.Q0();
            }
            if (PhotoViewer.E1()) {
                PhotoViewer.u1().H0(false, false);
            }
        }
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        sf.b bVar = this.f35547n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        bVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.f35547n0.g(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        ag.r0 r0Var;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (u(i10, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null && applicationLoader.checkRequestPermissionResult(i10, strArr, iArr)) {
                return;
            }
            if (this.f35553q0.getFragmentStack().size() != 0) {
                this.f35553q0.getFragmentStack().get(this.f35553q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.f35557s0.getFragmentStack().size() != 0) {
                    this.f35557s0.getFragmentStack().get(this.f35557s0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
                if (this.f35555r0.getFragmentStack().size() != 0) {
                    this.f35555r0.getFragmentStack().get(this.f35555r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
            }
            ph1.p(i10, iArr);
            fi.sb sbVar = fi.sb.F2;
            if (sbVar != null) {
                di.b bVar = sbVar.f11605a;
                Activity activity = sbVar.f11608b;
                if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 111) {
                    sbVar.f11665s2 = !z10;
                    if (z10 && sbVar.f11623f0 == 0) {
                        sbVar.A0.setCameraThumb(null);
                        if (CameraController.getInstance().isCameraInitied()) {
                            sbVar.q();
                        } else {
                            CameraController.getInstance().initCamera(new fi.p9(sbVar, 0));
                        }
                    }
                } else if (i10 == 114) {
                    if (z10) {
                        MediaController.loadGalleryPhotosAlbums(0);
                        sbVar.e(true);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                        int i11 = R.raw.permission_request_folder;
                        int i12 = org.telegram.ui.ActionBar.y6.L5;
                        alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.y6.x0(null, i12, false), null);
                        alertDialog$Builder.n(i12, null);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint));
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new fi.y9(sbVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        e2Var.show();
                    }
                } else if (i10 == 112) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity, 0, bVar);
                        int i13 = R.raw.permission_request_camera;
                        int i14 = org.telegram.ui.ActionBar.y6.L5;
                        alertDialog$Builder2.m(i13, 72, org.telegram.ui.ActionBar.y6.x0(null, i14, false), null);
                        alertDialog$Builder2.n(i14, null);
                        SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                        e2Var2.T = replaceTags2;
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new fi.y9(sbVar, 3));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        e2Var2.show();
                    }
                } else if (i10 == 115) {
                    if (!z10) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity, 0, bVar);
                        int i15 = R.raw.permission_request_folder;
                        int i16 = org.telegram.ui.ActionBar.y6.L5;
                        alertDialog$Builder3.m(i15, 72, org.telegram.ui.ActionBar.y6.x0(null, i16, false), null);
                        alertDialog$Builder3.n(i16, null);
                        SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory));
                        org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.f22368a;
                        e2Var3.T = replaceTags3;
                        alertDialog$Builder3.k(LocaleController.getString(R.string.PermissionOpenSettings), new fi.y9(sbVar, 5));
                        alertDialog$Builder3.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        e2Var3.show();
                    }
                    if (z10 && (r0Var = sbVar.f11686y2) != null) {
                        r0Var.run();
                    }
                    sbVar.f11686y2 = null;
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i10), strArr, iArr);
            SparseIntArray sparseIntArray = this.f35528c1;
            if (sparseIntArray.get(i10, -1) >= 0) {
                int i17 = sparseIntArray.get(i10, -1);
                sparseIntArray.delete(i10);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.permissionsGranted, Integer.valueOf(i17));
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activityPermissionsGranted, Integer.valueOf(i10), strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        MessageObject playingMessageObject;
        rg.a1 a1Var;
        super.onResume();
        org.telegram.ui.Components.fb1.l(false);
        G1 = true;
        sf.b bVar = this.f35547n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (bVar.f48109f) {
            bVar.a(false);
        }
        org.telegram.ui.Components.vu vuVar = H1;
        if (vuVar != null) {
            vuVar.run();
            H1 = null;
        }
        if (org.telegram.ui.ActionBar.y6.f23553o == 3) {
            org.telegram.ui.ActionBar.y6.E(false);
        }
        LocationController.onAppResumed();
        I(true);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.f35553q0.getView();
        this.f35560t1 = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.O).sortDialogs(null);
        J0();
        Utilities.stageQueue.postRunnable(new u90(0));
        D(0);
        MediaController.checkGallery();
        i0();
        org.telegram.ui.Components.ne0 ne0Var = this.A0;
        if (ne0Var != null && ne0Var.f30969b.getVisibility() == 0) {
            this.f35553q0.n();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.f35557s0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f35555r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.A0.f30969b.l();
            ArrayList arrayList = this.B0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.ui.Components.le0) obj).l();
            }
        } else {
            this.f35553q0.O();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.f35557s0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.O();
                }
                ActionBarLayout actionBarLayout4 = this.f35555r0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.O();
                }
            }
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
        R0();
        if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
            PhotoViewer u12 = PhotoViewer.u1();
            iu0 iu0Var = u12.f35646e0;
            if (iu0Var != null) {
                iu0Var.invalidate();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h2(u12, 0, 25), 100L);
            }
            org.telegram.ui.Components.s81 s81Var = u12.F2;
            if (s81Var != null) {
                s81Var.K(s81Var.n() + 1);
                if (u12.Z2) {
                    u12.F2.N(true);
                }
            }
            nt0 nt0Var = u12.L1;
            if (nt0Var != null && (a1Var = nt0Var.L0.d) != null) {
                a1Var.postRunnable(a1Var.f47366w);
            }
        }
        fi.sb sbVar = fi.sb.F2;
        if (sbVar != null) {
            sbVar.O();
        }
        if (PipRoundVideoView.F != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            MediaController.getInstance().seekToProgress(playingMessageObject, playingMessageObject.audioProgress);
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).unacceptedTermsOfService != null) {
            int i11 = UserConfig.selectedAccount;
            M0(i11, UserConfig.getInstance(i11).unacceptedTermsOfService);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = SharedConfig.pendingAppUpdate;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                N0(UserConfig.selectedAccount, tL_help_appUpdate, true);
            }
        }
        z(false);
        ApplicationLoader.canDrawOverlays = Settings.canDrawOverlays(this);
        ph1 ph1Var = ph1.f42509n1;
        if (ph1Var != null) {
            if (org.telegram.ui.Components.voip.n2.k() != null) {
                org.telegram.ui.Components.voip.n2.i();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                ph1Var.G();
            } else if (VoIPService.getSharedState() == null) {
                ph1Var.f42548u0.b();
            }
            ph1Var.J0 = ((KeyguardManager) ph1Var.f42513b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.n2.k() != null) {
                org.telegram.ui.Components.voip.n2.k().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        b0();
        HashMap hashMap = xh.f.f51849n;
        if (hashMap != null) {
            for (xh.f fVar : hashMap.values()) {
                xh.e eVar = fVar.f51853f;
                if (eVar != null) {
                    eVar.f51840b = false;
                }
            }
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onResume();
        }
        a0 a0Var = K1;
        if (a0Var != null) {
            a0Var.run();
            K1 = null;
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
        this.f35558s1 = true;
        this.f35547n0.h();
        WeakReference weakReference = qf.d.e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            qf.d.w(activity);
        }
        if (qf.d.f47037b == null) {
            qf.d.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(qf.d.d)) {
                    String a2 = w7.q5.a(this);
                    qf.d.d = a2;
                    if (a2 == null) {
                    }
                }
                Object obj = new Object();
                b9.c cVar = new b9.c();
                cVar.f3683b = new WeakReference(obj);
                qf.d.f47038c = cVar;
                String str = qf.d.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, cVar, 33)) {
                    qf.d.f47038c = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        ApplicationLoader.mainInterfaceStopped = false;
        org.telegram.ui.Components.k30.j(this);
        v50 v50Var = v50.D3;
        if (v50Var != null) {
            ArrayList arrayList = v50Var.Z1;
            v50.I3 = false;
            v50Var.P.l();
            i30 i30Var = v50Var.f44659m2;
            if (i30Var.getVisibility() == 0) {
                v50Var.f44672p2.G(i30Var, false);
            }
            if (v50.G3) {
                v50Var.f44668o2.I(v50Var.f44664n2, false);
            }
            arrayList.clear();
            arrayList.addAll(v50Var.Y1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
            }
            z40 z40Var = v50Var.L;
            org.telegram.ui.Components.x91 x91Var = z40Var.v;
            if (x91Var != null) {
                x91Var.c(true);
            }
            z40Var.F = false;
            v50Var.H.s();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        org.telegram.ui.Wallet.v0 v0Var = a8.af.f360b;
        if (v0Var != null && v0Var.e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.v0 v0Var2 = a8.af.f360b;
            if (!v0Var2.f37367f) {
                v0Var2.c("AUTH_CANCELED");
                a8.af.f360b.e();
            }
        }
        this.f35558s1 = false;
        sf.b bVar = this.f35547n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        bVar.e = false;
        if (bVar.f48109f) {
            bVar.c(true);
        }
        bVar.d.unregisterReceiver(bVar.f48117o);
        qf.d.w(this);
        ApplicationLoader.mainInterfaceStopped = true;
        org.telegram.ui.Components.k30.j(this);
        v50 v50Var = v50.D3;
        if (v50Var != null) {
            v50.I3 = true;
            ArrayList arrayList = v50Var.Z1;
            arrayList.clear();
            arrayList.addAll(v50Var.Y1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(false);
            }
            z40 z40Var = v50Var.L;
            org.telegram.ui.Components.x91 x91Var = z40Var.v;
            if (x91Var != null) {
                x91Var.c(false);
            }
            z40Var.F = true;
            v50Var.H.r();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f35540i1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        sf.b bVar = this.f35547n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        bVar.f();
        ArrayList arrayList = this.f35526b1;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.f35553q0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.U0.isEmpty()) {
                ((org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(1, actionBarLayout.U0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.s sVar = actionBarLayout.G;
            if (sVar != null) {
                sVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(int i10, String str, String str2, qf.c cVar) {
        if (cVar != null) {
            cVar.d();
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getUserNameResolver().resolve(str, null, new bi.y4(this, messagesController, cVar, i10, str2, 1));
    }

    public final void q0(long[] jArr, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        di.q7 a2;
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
        org.telegram.ui.ActionBar.r2 R = R();
        if (R != null) {
            di.h7 storiesController = MessagesController.getInstance(this.O).getStoriesController();
            if (z11) {
                arrayList = storiesController.h;
            } else {
                arrayList = storiesController.f8634g;
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
                for (int i13 = 0; i13 < jArr2.length; i13 = c3.h0.j(jArr2[i13], arrayList4, i13, 1)) {
                }
            } else {
                for (int i14 = 0; i14 < jArr2.length; i14 = c3.h0.j(jArr2[i14], arrayList3, i14, 1)) {
                }
            }
            if (!arrayList4.isEmpty() && z10) {
                MessagesController messagesController = MessagesController.getInstance(this.O);
                int[] iArr = {arrayList4.size()};
                nq nqVar = new nq(this, iArr, jArr2, 17);
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
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getPeerStories, new bi.i3(messagesController, longValue, nqVar, 6));
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
                if (R instanceof cy) {
                    try {
                        a2 = di.q7.a(((cy) R).E0.h);
                    } catch (Exception unused) {
                    }
                    di.q7 q7Var = a2;
                    R.getOrCreateStoryViewer().v();
                    R.getOrCreateStoryViewer().G(this, null, arrayList3, 0, null, null, q7Var, false);
                }
                a2 = null;
                di.q7 q7Var2 = a2;
                R.getOrCreateStoryViewer().v();
                R.getOrCreateStoryViewer().G(this, null, arrayList3, 0, null, null, q7Var2, false);
            }
        }
    }

    public final void r0(final int i10, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        di.z6 z6Var;
        di.z6 A;
        MessageObject f7;
        MessageObject f10;
        TL_stories.StoryItem storyItem2;
        di.h7 storiesController = MessagesController.getInstance(this.O).getStoriesController();
        TL_stories.PeerStories y3 = storiesController.y(j10);
        di.q7 q7Var = null;
        if (y3 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < y3.stories.size()) {
                    if (y3.stories.get(i11).f22266id == i10) {
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
                org.telegram.ui.ActionBar.r2 R = R();
                if (R != null) {
                    if (R instanceof cy) {
                        try {
                            q7Var = di.q7.a(((cy) R).E0.h);
                        } catch (Exception unused) {
                        }
                    }
                    R.getOrCreateStoryViewer().v();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z10) {
                        R.getOrCreateStoryViewer().f9467w1 = true;
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
            di.z6 A2 = storiesController.A(j10, 0, -1, true);
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
                org.telegram.ui.ActionBar.r2 R2 = R();
                if (R2 == null) {
                    return;
                }
                if (R2 instanceof cy) {
                    try {
                        q7Var = di.q7.a(((cy) R2).E0.h);
                    } catch (Exception unused2) {
                    }
                }
                di.q7 q7Var2 = q7Var;
                R2.getOrCreateStoryViewer().v();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    R2.getOrCreateStoryViewer().f9467w1 = true;
                }
                R2.getOrCreateStoryViewer().G(this, storyItem, arrayList2, 0, z6Var, null, q7Var2, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.O).getInputPeer(j10);
        tL_stories_getStoriesByID.f22273id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.eg(LaunchActivity.this, tLObject, i10, j10, z10));
            }
        });
    }

    public final void s0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.x6 x6Var) {
        int i10 = x6Var.f23260f0;
        boolean z10 = false;
        org.telegram.ui.ActionBar.w6 f7 = x6Var.f(tL_theme, this.O, 0);
        x6Var.Z = x6Var.Y;
        x6Var.u(f7.f23215a);
        f7.f23230s = tL_wallPaper;
        if (i10 != x6Var.f23260f0) {
            z10 = true;
        }
        u0(new tc1(x6Var, z10, 0, false, false));
    }

    @Override
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        sf.b bVar = this.f35547n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        bVar.h = pictureInPictureParams;
    }

    public final void t0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.t0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    public final void u0(org.telegram.ui.ActionBar.r2 r2Var) {
        ((ActionBarLayout) O()).R(r2Var);
    }

    @Override
    public final boolean v(final org.telegram.ui.cy r47, java.util.ArrayList r48, final java.lang.CharSequence r49, final boolean r50, boolean r51, int r52, final int r53, org.telegram.ui.af1 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.v(org.telegram.ui.cy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.af1):boolean");
    }

    public final boolean v0(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) O()).U(r2Var, z10, z11);
    }

    public final void w0(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E0;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) instanceof hi.m3) {
                    hi.m3 m3Var = (hi.m3) arrayList.get(i10);
                    if (m3Var.isShowing() && m3Var.I == j10) {
                        return;
                    }
                }
                i10++;
            } else {
                org.telegram.ui.ActionBar.r2 U = U();
                if (U != null && U.sheetsStack != null) {
                    for (int i11 = 0; i11 < U.sheetsStack.size(); i11++) {
                        if (U.sheetsStack.get(i11).isShown()) {
                            U.sheetsStack.get(i11);
                        }
                    }
                }
                py w10 = this.f35553q0.w();
                if (w10 != null && w10.sheetsStack != null) {
                    for (int i12 = 0; i12 < w10.sheetsStack.size(); i12++) {
                        if (w10.sheetsStack.get(i12).isShown()) {
                            w10.sheetsStack.get(i12);
                        }
                    }
                }
                r90 r90Var = new r90(this, 1);
                TLRPC.User user = MessagesController.getInstance(this.O).getUser(Long.valueOf(j10));
                if (user != null) {
                    r90Var.run(user);
                    return;
                } else {
                    MessagesStorage.getInstance(this.O).getStorageQueue().postRunnable(new a3.i0(this, j10, r90Var, 29));
                    return;
                }
            }
        }
    }

    public final void x0(Long l4, sz szVar, qf.c cVar, org.telegram.ui.Cells.s1 s1Var) {
        ChannelBoostsController boostsController = MessagesController.getInstance(this.O).getBoostsController();
        if (cVar != null) {
            cVar.d();
        }
        boostsController.getBoostsStats(l4.longValue(), new q80(this, cVar, szVar, boostsController, l4, s1Var));
    }

    public final void y(int i10) {
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.A1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A1 = null;
        }
        if (i12 >= 26) {
            i11 = getWindow().getNavigationBarColor();
        } else {
            i11 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i11, i10);
        this.A1 = ofArgb;
        ofArgb.addUpdateListener(new n80(this, 1));
        this.A1.addListener(new t0(this, i10, 2));
        this.A1.setInterpolator(org.telegram.ui.Components.ds.h);
        this.A1.setDuration(320L);
        this.A1.start();
    }

    public final void y0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l4, final Long l10, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, String str26, final String str27, final qf.c cVar, final boolean z12, final int i13, final int i14, final int i15, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i10).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.D1;
                final qf.c cVar2 = cVar;
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
                            Pattern pattern2 = LaunchActivity.D1;
                            LaunchActivity.this.C0(i16, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, z26, num3, l11, l12, num4, str42, hashMap2, str43, str44, str45, str46, tL_wallPaper2, str47, str48, str49, str50, z27, str51, i17, i18, str52, str53, str54, null, null, cVar2, z22, i19, false, i20, i21, null, null, z28, str55, z23, z24, z25, z29, z30, str56, null, z31, null);
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
                        org.telegram.ui.ActionBar.r2 r2Var;
                        Pattern pattern2 = LaunchActivity.D1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.f35529d0;
                        p00 p00Var = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            r2Var = (org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList);
                        } else {
                            r2Var = null;
                        }
                        int i22 = i16;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str58 = str57;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z25;
                        boolean z37 = z22;
                        o90 o90Var = new o90(launchActivity2, r2Var, i22, user3, tL_messages_botApp2, atomicBoolean, str58, z34, z35, z36, z37);
                        if (z32) {
                            o90Var.run();
                        } else if (tL_messages_botApp2.inactive && z33) {
                            t3 t3Var = new t3(o90Var, 8);
                            qf.c cVar3 = cVar2;
                            if (cVar3 != null) {
                                p00Var = new p00(cVar3, 15);
                            }
                            ki1.a(launchActivity2, t3Var, p00Var);
                        } else if (!tL_messages_botApp2.request_write_access && !z37) {
                            o90Var.run();
                        } else {
                            org.telegram.ui.Components.g5.m(r2Var, atomicBoolean, user3, o90Var);
                        }
                    }
                });
            }
        });
    }

    public final void z(boolean z10) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z10 || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    boolean z11 = this.f35552p1;
                    this.f35552p1 = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z10, new d80(this, z11, update, 2));
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
                    ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new bi.l2(this, i10, 7));
                }
            }
        }
    }

    public final void z0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f35555r0;
        if (actionBarLayout != null) {
            actionBarLayout.W(z10, z10);
        } else {
            this.f35553q0.W(z10, z10);
        }
    }

    @Override
    public final void e(int[] iArr) {
    }
}
