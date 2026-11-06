package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureUiState;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
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
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.g0;
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
public class LaunchActivity extends g5 implements org.telegram.ui.ActionBar.n4, org.telegram.messenger.ls, qw {
    public static final String B1 = UUID.randomUUID().toString();
    public static final Pattern C1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean D1;
    public static int E1;
    public static boolean F1;
    public static LaunchActivity G1;
    public static Pattern H1;
    public static a0 I1;
    public static LaunchActivity J1;
    public org.telegram.ui.Components.ly0 A0;
    public int A1;
    public org.telegram.ui.Components.u9 B0;
    public org.telegram.ui.ActionBar.u1 D0;
    public View E0;
    public org.telegram.ui.ActionBar.u1 F0;
    public boolean G0;
    public HashMap H0;
    public HashMap I0;
    public Intent J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public String O0;
    public String P0;
    public boolean Q;
    public TLRPC.TL_wallPaper Q0;
    public String R;
    public org.telegram.ui.ActionBar.j6 R0;
    public String S;
    public TLRPC.TL_theme S0;
    public CharSequence T;
    public boolean T0;
    public ArrayList U;
    public org.telegram.ui.ActionBar.u1 U0;
    public ArrayList V;
    public ArrayList W;
    public boolean W0;
    public Uri X;
    public zh.r3 X0;
    public String Y;
    public m4 Y0;
    public ArrayList Z;
    public ArrayList f41250a0;
    public Uri f41252b0;
    public int f41254c0;
    public org.telegram.messenger.n6 f41257d1;
    public androidx.mediarouter.app.f f41259e1;
    public rh.d f41261f1;
    public y70 f41262g0;
    public boolean f41263g1;
    public ArrayList f41264h0;
    public bg.b0 f41265h1;
    public ArrayList f41266i0;
    public t80 f41267i1;
    public String f41268j0;
    public u80 f41269j1;
    public ActionMode f41270k0;
    public boolean f41271k1;
    public boolean f41272l0;
    public ab.b0 l1;
    public org.telegram.ui.Components.xz0 m0;
    public ab.b0 f41273m1;
    public kg.k f41274n0;
    public ActionBarLayout f41275o0;
    public x70 f41276o1;
    public ActionBarLayout f41277p0;
    public ii.c f41278p1;
    public ActionBarLayout f41279q0;
    public boolean f41280q1;
    public v80 f41281r0;
    public ViewGroup f41282r1;
    public FrameLayout f41283s0;
    public final ci0 f41284s1;
    public v8 f41285t0;
    public org.telegram.ui.ActionBar.u1 f41286t1;
    public k0 f41287u0;
    public org.telegram.ui.ActionBar.u1 f41288u1;
    public r80 f41289v0;
    public boolean f41290v1;
    public org.telegram.ui.ActionBar.k3 f41291w0;
    public long f41292w1;
    public org.telegram.ui.ActionBar.n3 f41293x0;
    public int[] f41294x1;
    public org.telegram.ui.Components.gc0 f41295y0;
    public ValueAnimator f41296y1;
    public bi.fe f41298z1;
    public final ArrayList P = new ArrayList();
    public final ArrayList f41256d0 = new ArrayList();
    public final ArrayList f41258e0 = new ArrayList();
    public final ArrayList f41260f0 = new ArrayList();
    public final ArrayList f41297z0 = new ArrayList();
    public final ArrayList C0 = new ArrayList();
    public boolean V0 = false;
    public final ArrayList Z0 = new ArrayList();
    public final SparseIntArray f41251a1 = new SparseIntArray();
    public int f41253b1 = 5934;
    public final p80 f41255c1 = new Object();
    public boolean n1 = true;

    public LaunchActivity() {
        System.identityHashCode(this);
        this.f41284s1 = new ci0(this);
        this.A1 = 0;
    }

    public static void C0(org.telegram.messenger.c cVar, ww wwVar, CharSequence charSequence, long j3, org.telegram.messenger.ij ijVar, long j10, boolean z9, int i7, int i10) {
        boolean z10;
        org.telegram.ui.Components.po0 po0Var;
        org.telegram.ui.Components.po0 po0Var2;
        int i11 = cVar.f21729a;
        if (wwVar != null && (po0Var2 = wwVar.G2) != null && !po0Var2.f37035n) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z10 && wwVar != null && (po0Var = wwVar.G2) != null) {
            webPage = po0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z10) {
                org.telegram.messenger.gz.a0(cVar, charSequence, j3, j10, z9, i7, i10);
                return;
            }
            CharSequence H = org.telegram.messenger.gz.H(charSequence);
            if (H != null && H.length() != 0) {
                CharSequence[] charSequenceArr = {H};
                org.telegram.messenger.gz.C(i11).r0(org.telegram.messenger.ez.b(charSequenceArr[0].toString(), j3, ijVar, ijVar, webPage2, z10, org.telegram.messenger.ui.b0(i11).W(charSequenceArr, true, true), null, null, z9, i7, i10, null, false));
            }
        }
    }

    public static void D(int i7) {
        LaunchActivity launchActivity = J1;
        if (launchActivity != null) {
            launchActivity.C(i7);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i7, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z9) {
        String F12;
        org.telegram.ui.ActionBar.f2 Q = Q();
        if (Q != null) {
            long j3 = tL_attachMenuBot.bot_id;
            hi.q4 b10 = hi.q4.b(i7, j3, j3, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.O() != null && launchActivity.O().k(b10) != null) {
                return;
            }
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(tL_attachMenuBot.bot_id));
            if (a22 == null) {
                F12 = null;
            } else {
                F12 = org.telegram.messenger.qp.s1(i7).F1(a22.restriction_reason);
            }
            if (!TextUtils.isEmpty(F12)) {
                org.telegram.messenger.qp.s1(i7);
                org.telegram.messenger.qp.R4(F12, Q);
                return;
            }
            hi.a3 a3Var = new hi.a3(launchActivity, Q.getResourceProvider());
            a3Var.B0 = false;
            a3Var.B(z9);
            a3Var.f14526l0 = launchActivity;
            a3Var.x(Q, b10);
            a3Var.show();
        }
    }

    public static void J() {
        jx jxVar;
        ArrayList<org.telegram.ui.ActionBar.b2> arrayList;
        org.telegram.ui.ActionBar.f2 T = T();
        if (T != null) {
            if (T.getParentLayout() instanceof ActionBarLayout) {
                jxVar = ((ActionBarLayout) T.getParentLayout()).x();
            } else {
                jxVar = null;
            }
            if (jxVar != null && (arrayList = jxVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    jxVar.sheetsStack.get(size).a(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.b2> arrayList2 = T.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    T.sheetsStack.get(size2).a(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = hi.a3.f14507a1.iterator();
            while (it.hasNext()) {
                arrayList3.add((hi.a3) it.next());
            }
            int size3 = arrayList3.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj = arrayList3.get(i7);
                i7++;
                ((hi.a3) obj).o(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.f2 L() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f28847a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = G1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.q4) jg.g.i(1, G1.P))).t();
        }
        LaunchActivity launchActivity2 = G1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return ((ActionBarLayout) G1.M()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.f2 Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f28847a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = G1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.q4) jg.g.i(1, G1.P)).getLastFragment();
        }
        LaunchActivity launchActivity2 = G1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return G1.M().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.f2 T() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f28847a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = G1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.q4) jg.g.i(1, G1.P)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = G1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return G1.M().getSafeLastFragment();
        }
        return null;
    }

    public static String U(int i7, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null) {
            return org.telegram.messenger.hd.M0(i7, str);
        }
        return str2;
    }

    public static int V(Uri uri) {
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
                    int i7 = 0;
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
                        i7 = Integer.parseInt(group4);
                    }
                    return (parseInt * 86400) + (parseInt2 * 3600) + (parseInt3 * 60) + i7;
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
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
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
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                Z(viewGroup.getChildAt(i7));
            }
        }
    }

    public static void b0(float f10, float f11, float f12) {
        View decorView;
        bi.fe feVar;
        LaunchActivity launchActivity = G1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((feVar = launchActivity.f41298z1) == null || ((View) feVar.f3500a) != decorView)) {
                launchActivity.f41298z1 = new bi.fe(decorView);
            }
            bi.fe feVar2 = launchActivity.f41298z1;
            if (feVar2 != null) {
                View view = (View) feVar2.f3500a;
                ArrayList arrayList = feVar2.f3898b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(a8.r9.a(0.0f, 0.0f, f10, f11), a8.r9.a(view.getWidth(), 0.0f, f10, f11)), Math.max(a8.r9.a(0.0f, view.getHeight(), f10, f11), a8.r9.a(view.getWidth(), view.getHeight(), f10, f11))) * 2.0f) / (org.telegram.messenger.g0.f22543p * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    bi.ee eeVar = new bi.ee(f10, f11, f12);
                    ofFloat.addUpdateListener(new bi.de(0, feVar2, eeVar));
                    ofFloat.addListener(new ah.l(1, feVar2, eeVar));
                    ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40346g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(eeVar);
                    feVar2.f1();
                    ofFloat.start();
                }
            }
        }
    }

    public final void A() {
        if (this.O == org.telegram.messenger.p10.f24467s0 && this.l1 != null) {
            return;
        }
        ab.b0 b0Var = this.l1;
        if (b0Var != null) {
            b0Var.b();
            this.l1 = null;
        }
        int i7 = org.telegram.messenger.p10.f24467s0;
        this.O = i7;
        ab.b0 b0Var2 = new ab.b0(org.telegram.messenger.qs.f(i7), this);
        b0Var2.c(org.telegram.messenger.qs.f25034n3);
        b0Var2.c(org.telegram.messenger.qs.I2);
        b0Var2.c(org.telegram.messenger.qs.f25011j0);
        b0Var2.c(org.telegram.messenger.qs.W4);
        b0Var2.c(org.telegram.messenger.qs.T1);
        b0Var2.c(org.telegram.messenger.qs.M0);
        b0Var2.c(org.telegram.messenger.qs.R0);
        b0Var2.c(org.telegram.messenger.qs.f24971c1);
        b0Var2.c(org.telegram.messenger.qs.Q);
        b0Var2.c(org.telegram.messenger.qs.N0);
        b0Var2.c(org.telegram.messenger.qs.Y1);
        b0Var2.c(org.telegram.messenger.qs.Z1);
        b0Var2.c(org.telegram.messenger.qs.f25082v1);
        b0Var2.c(org.telegram.messenger.qs.f25090w2);
        b0Var2.c(org.telegram.messenger.qs.f25096x1);
        b0Var2.c(org.telegram.messenger.qs.f25010i5);
        b0Var2.c(org.telegram.messenger.qs.f24992f5);
        b0Var2.c(org.telegram.messenger.qs.f25060r5);
        b0Var2.c(org.telegram.messenger.qs.Q5);
        this.l1 = b0Var2;
    }

    public final void A0(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.A0(android.net.Uri):void");
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f41265h1 == null && org.telegram.messenger.iz.f23404p) {
                this.f41265h1 = bg.b0.b(this, this.f41287u0);
            }
            bg.b0 b0Var = this.f41265h1;
            if (b0Var != null && !org.telegram.messenger.iz.f23404p) {
                b0Var.c();
                this.f41265h1 = null;
            }
        }
    }

    public final void B0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final vf.b r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.B0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, vf.b, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void C(int i7) {
        J1 = this;
        Set set = org.telegram.messenger.z0.f26769a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - org.telegram.messenger.iz.H) >= 86400) {
            org.telegram.messenger.iz.H = currentTimeMillis;
            Utilities.f21334f.c(new org.telegram.messenger.x0(currentTimeMillis, org.telegram.messenger.w7.j(4), 0));
        }
        if (org.telegram.messenger.r2.f25199a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - org.telegram.messenger.iz.I) >= 3600) {
                org.telegram.messenger.iz.I = currentTimeMillis2;
                Utilities.f21334f.c(new hi.j2(currentTimeMillis2, 7));
            }
        }
        if ((Build.VERSION.SDK_INT >= 26 && i7 == 0) || this.f41290v1) {
            return;
        }
        Utilities.f21333e.d(new t70(this, i7, 1), 2000L);
    }

    public final void D0(int i7) {
        this.f41293x0.setInternalNavigationBarColor(i7);
        org.telegram.ui.ActionBar.d3 O = O();
        if (O != null) {
            O.setNavigationBarColor(i7);
        }
    }

    public final void E() {
        int i7;
        boolean z9;
        if (org.telegram.messenger.g0.Q1() && this.f41279q0 != null) {
            Boolean bool = org.telegram.messenger.g0.L;
            int i10 = 0;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (org.telegram.messenger.t0.f25563b != null && org.telegram.messenger.t0.f25563b.getResources().getBoolean(2131034114)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (booleanValue != z9) {
                    return;
                }
            }
            if (!org.telegram.messenger.g0.E && (!org.telegram.messenger.g0.P1() || getResources().getConfiguration().orientation == 2)) {
                this.M0 = false;
                List<org.telegram.ui.ActionBar.f2> fragmentStack = this.f41275o0.getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    while (1 < fragmentStack.size()) {
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentStack.get(1);
                        if (f2Var instanceof an) {
                            an anVar = (an) f2Var;
                            anVar.f43854k5 = true;
                            anVar.f43865l5 = true;
                        }
                        f2Var.onPause();
                        f2Var.onFragmentDestroy();
                        f2Var.setParentLayout(null);
                        fragmentStack.remove(f2Var);
                        this.f41279q0.c(-1, f2Var);
                    }
                    org.telegram.ui.Components.gc0 gc0Var = this.f41295y0;
                    if (gc0Var == null || gc0Var.f33902b.getVisibility() != 0) {
                        this.f41275o0.X(true, true);
                        this.f41279q0.X(true, true);
                    }
                }
                ViewGroup view = this.f41279q0.getView();
                if (this.f41279q0.getFragmentStack().isEmpty()) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                view.setVisibility(i7);
                v8 v8Var = this.f41285t0;
                if (!this.f41279q0.getFragmentStack().isEmpty()) {
                    i10 = 8;
                }
                v8Var.setVisibility(i10);
                return;
            }
            this.M0 = true;
            List<org.telegram.ui.ActionBar.f2> fragmentStack2 = this.f41279q0.getFragmentStack();
            if (!fragmentStack2.isEmpty()) {
                while (fragmentStack2.size() > 0) {
                    org.telegram.ui.ActionBar.f2 f2Var2 = fragmentStack2.get(0);
                    if (f2Var2 instanceof an) {
                        an anVar2 = (an) f2Var2;
                        anVar2.f43854k5 = true;
                        anVar2.f43865l5 = true;
                    }
                    f2Var2.onPause();
                    f2Var2.onFragmentDestroy();
                    f2Var2.setParentLayout(null);
                    fragmentStack2.remove(f2Var2);
                    this.f41275o0.c(-1, f2Var2);
                }
                org.telegram.ui.Components.gc0 gc0Var2 = this.f41295y0;
                if (gc0Var2 == null || gc0Var2.f33902b.getVisibility() != 0) {
                    this.f41275o0.X(true, true);
                }
            }
            this.f41279q0.getView().setVisibility(8);
            v8 v8Var2 = this.f41285t0;
            if (!this.f41275o0.getFragmentStack().isEmpty()) {
                i10 = 8;
            }
            v8Var2.setVisibility(i10);
        }
    }

    public final void E0() {
        org.telegram.ui.ActionBar.n3 n3Var;
        ViewGroup view;
        int i7;
        if (this.f41293x0.indexOfChild(this.f41281r0) != -1) {
            n3Var = this.f41293x0;
            view = this.f41281r0;
        } else {
            n3Var = this.f41293x0;
            view = this.f41275o0.getView();
        }
        int indexOfChild = n3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f41293x0.removeViewAt(indexOfChild);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            v80 v80Var = new v80(this, this);
            this.f41281r0 = v80Var;
            if (indexOfChild != -1) {
                this.f41293x0.addView(v80Var, indexOfChild, c8.ha.c(-1.0f, -1));
            } else {
                this.f41293x0.addView(v80Var, c8.ha.c(-1.0f, -1));
            }
            v8 v8Var = new v8(this, null);
            this.f41285t0 = v8Var;
            v8Var.setOccupyStatusBar(false);
            this.f41285t0.U(org.telegram.ui.ActionBar.k6.s0());
            this.f41281r0.addView(this.f41285t0, c8.ha.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.f41275o0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f41275o0.getView());
            }
            this.f41281r0.addView(this.f41275o0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f41279q0 = actionBarLayout;
            actionBarLayout.T0 = true;
            actionBarLayout.setFragmentStack(this.f41260f0);
            this.f41279q0.setDelegate(this);
            this.f41281r0.addView(this.f41279q0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f41283s0 = frameLayout;
            ArrayList arrayList = this.f41258e0;
            int i10 = 8;
            if (arrayList.isEmpty()) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            frameLayout.setVisibility(i7);
            this.f41283s0.setBackgroundColor(1056964608);
            this.f41281r0.addView(this.f41283s0);
            this.f41283s0.setOnTouchListener(new d0(this, 3));
            this.f41283s0.setOnClickListener(new bi.l1(18));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f41277p0 = actionBarLayout2;
            actionBarLayout2.S0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f41277p0.setBackgroundView(this.f41283s0);
            this.f41277p0.setUseAlphaAnimations(true);
            this.f41277p0.setFragmentStack(arrayList);
            this.f41277p0.setDelegate(this);
            this.f41277p0.setDrawerLayoutContainer(this.f41293x0);
            ViewGroup view2 = this.f41277p0.getView();
            if (!arrayList.isEmpty()) {
                i10 = 0;
            }
            view2.setVisibility(i10);
            this.f41281r0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f41275o0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f41275o0.getView());
            }
            this.f41275o0.setFragmentStack(this.f41256d0);
            if (indexOfChild != -1) {
                this.f41293x0.addView(this.f41275o0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f41293x0.addView(this.f41275o0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        c8.nb.a(this, org.telegram.messenger.iz.f23429x1, false);
    }

    public final void F(boolean z9, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.f2 f2Var;
        int x02;
        ym ymVar;
        boolean z12;
        ArrayList arrayList = this.f41256d0;
        boolean z13 = true;
        if (!arrayList.isEmpty()) {
            f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList);
        } else {
            f2Var = null;
        }
        char c10 = 2;
        if (f2Var != null && (f2Var.isRemovingFromStack() || f2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(2, arrayList);
            } else {
                f2Var = null;
            }
        }
        if (f2Var != null) {
            f2Var.hasForceLightStatusBar();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (z10) {
            if (f2Var != null) {
                z12 = f2Var.isLightStatusBar();
                if (f2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) f2Var.getParentLayout();
                    if (actionBarLayout.x() != null && actionBarLayout.x().getLastSheet() != null) {
                        org.telegram.ui.ActionBar.b2 lastSheet = actionBarLayout.x().getLastSheet();
                        if (lastSheet.s()) {
                            z12 = lastSheet.f();
                        }
                    } else {
                        ArrayList<org.telegram.ui.ActionBar.b2> arrayList2 = f2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) jg.g.i(1, f2Var.sheetsStack);
                            if (b2Var.s()) {
                                z12 = b2Var.f();
                            }
                        }
                    }
                }
            } else {
                z12 = i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28129s8, true)) > 0.699999988079071d;
            }
            org.telegram.messenger.g0.p3(this, z12);
        }
        if (i7 >= 26 && z11 && (!z9 || f2Var == null || !f2Var.isInPreviewMode())) {
            if (f2Var != null && z9) {
                x02 = f2Var.getNavigationBarColor();
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27793a7, true);
            }
            if (f2Var instanceof an) {
                an anVar = (an) f2Var;
                if (!anVar.f43783ec || (anVar.f43998w.f54460s != 1 && ((ymVar = anVar.f44022xa) == null || !ymVar.f52280q))) {
                    c10 = 1;
                }
            } else {
                c10 = 0;
            }
            if (O() != null && O().H > 0) {
                c10 = 0;
            }
            if (this.f41275o0.x() != null) {
                jx x10 = this.f41275o0.x();
                if (x10.sheetsStack != null) {
                    for (int i10 = 0; i10 < x10.sheetsStack.size(); i10++) {
                        org.telegram.ui.ActionBar.b2 b2Var2 = x10.sheetsStack.get(i10);
                        if (b2Var2.y()) {
                            x02 = b2Var2.e(x02);
                            c10 = 0;
                        }
                    }
                }
            }
            Iterator it = hi.a3.f14507a1.iterator();
            while (it.hasNext()) {
                x02 = ((hi.a3) it.next()).e(x02);
                c10 = 0;
            }
            D0(x02);
            if ((c10 != 0 || org.telegram.messenger.g0.B(x02) < 0.721f) && c10 != 1) {
                z13 = false;
            }
            org.telegram.messenger.g0.m3(this, z13);
        }
        if (z10) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final org.telegram.ui.ActionBar.u1 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
            p10.setCanceledOnTouchOutside(true);
            p10.setOnDismissListener(new bi.u3(11, this, p10));
            this.C0.add(p10);
            return p10;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    @Override
    public final boolean G() {
        ArrayList arrayList = this.U;
        if ((arrayList != null && arrayList.size() == 1) || this.R != null) {
            return true;
        }
        return false;
    }

    public final void H(boolean z9) {
        org.telegram.messenger.r3 r3Var;
        long j3;
        boolean z10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = false;
        if (sharedInstance != null && (r3Var = sharedInstance.groupCall) != null) {
            boolean z12 = this.f41272l0;
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
                j3 = org.telegram.messenger.p10.i(this.O).f24486n;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j3);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && groupCallParticipant.raise_hand_rating != 0) {
                z11 = true;
            }
            this.f41272l0 = z11;
            if (!z9 && z12 && !z11 && !z10 && c40.f44539u5 == null) {
                N0(38);
                return;
            }
            return;
        }
        this.f41272l0 = false;
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.f2 f2Var;
        ArrayList arrayList = this.f41258e0;
        if (!arrayList.isEmpty()) {
            f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f41260f0;
            if (!arrayList2.isEmpty()) {
                f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.f41256d0;
                if (!arrayList3.isEmpty()) {
                    f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList3);
                } else {
                    f2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.hc.a(f2Var)) {
            aVar.a(org.telegram.ui.Components.hc.a0(f2Var)).j();
        }
    }

    public final void I() {
        ArrayList arrayList = this.f41256d0;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.f2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (org.telegram.messenger.g0.Q1()) {
            ArrayList arrayList2 = this.f41258e0;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((org.telegram.ui.ActionBar.f2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f41260f0;
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                ((org.telegram.ui.ActionBar.f2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void I0() {
        String str;
        String str2;
        char c10;
        org.telegram.messenger.ed edVar;
        if (org.telegram.messenger.p10.i(this.O).p()) {
            try {
                if (!this.G0 && !org.telegram.messenger.t0.f25571x) {
                    String string = org.telegram.messenger.qp.e1().getString("language_showed2", "");
                    final String str3 = org.telegram.messenger.qp.s1(this.O).O3;
                    if (string.equals(str3)) {
                        if (org.telegram.messenger.r2.f25199a) {
                            org.telegram.messenger.a8.b("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final org.telegram.messenger.ed[] edVarArr = new org.telegram.messenger.ed[2];
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
                    int i7 = 0;
                    while (true) {
                        if (i7 < org.telegram.messenger.hd.E0().J.size()) {
                            org.telegram.messenger.ed edVar2 = (org.telegram.messenger.ed) org.telegram.messenger.hd.E0().J.get(i7);
                            c10 = c11;
                            if (edVar2.f22183c.equals("en")) {
                                edVarArr[c10] = edVar2;
                            }
                            if (edVar2.f22183c.replace("_", "-").equals(str3) || edVar2.f22183c.equals(str) || edVar2.f22183c.equals(str2)) {
                                edVarArr[1] = edVar2;
                            }
                            if (edVarArr[c10] != null && edVarArr[1] != null) {
                                break;
                            }
                            i7++;
                            c11 = c10;
                        } else {
                            c10 = c11;
                            break;
                        }
                    }
                    org.telegram.messenger.ed edVar3 = edVarArr[c10];
                    if (edVar3 != null && (edVar = edVarArr[1]) != null && edVar3 != edVar) {
                        if (org.telegram.messenger.r2.f25199a) {
                            org.telegram.messenger.a8.b("show lang alert for " + edVarArr[c10].b() + " and " + edVarArr[1].b());
                        }
                        this.H0 = null;
                        this.I0 = null;
                        this.G0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = edVarArr[1].c();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) {
                            public final LaunchActivity f43595b;

                            {
                                this.f43595b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i10 = 0;
                                switch (r4) {
                                    case 0:
                                        String str4 = LaunchActivity.B1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i10 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i10);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f43595b;
                                        final org.telegram.messenger.ed[] edVarArr2 = edVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.H0 = hashMap2;
                                                        if (launchActivity2.I0 != null && hashMap2 != null) {
                                                            org.telegram.messenger.ed[] edVarArr3 = edVarArr2;
                                                            launchActivity2.J0(edVarArr3[1], edVarArr3[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.I0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.H0 != null) {
                                                            org.telegram.messenger.ed[] edVarArr4 = edVarArr2;
                                                            launchActivity3.J0(edVarArr4[1], edVarArr4[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        String str6 = LaunchActivity.B1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i10 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i10);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f43595b;
                                        final org.telegram.messenger.ed[] edVarArr3 = edVarArr;
                                        final String str7 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.H0 = hashMap22;
                                                        if (launchActivity22.I0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.ed[] edVarArr32 = edVarArr3;
                                                            launchActivity22.J0(edVarArr32[1], edVarArr32[0], str7);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.I0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.H0 != null) {
                                                            org.telegram.messenger.ed[] edVarArr4 = edVarArr3;
                                                            launchActivity3.J0(edVarArr4[1], edVarArr4[0], str7);
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
                        tL_langpack_getStrings2.lang_code = edVarArr[c10].c();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {
                            public final LaunchActivity f43595b;

                            {
                                this.f43595b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i10 = 0;
                                switch (r4) {
                                    case 0:
                                        String str4 = LaunchActivity.B1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i10 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i10);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f43595b;
                                        final org.telegram.messenger.ed[] edVarArr2 = edVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.H0 = hashMap22;
                                                        if (launchActivity22.I0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.ed[] edVarArr32 = edVarArr2;
                                                            launchActivity22.J0(edVarArr32[1], edVarArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.I0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.H0 != null) {
                                                            org.telegram.messenger.ed[] edVarArr4 = edVarArr2;
                                                            launchActivity3.J0(edVarArr4[1], edVarArr4[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        String str6 = LaunchActivity.B1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i10 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i10);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f43595b;
                                        final org.telegram.messenger.ed[] edVarArr3 = edVarArr;
                                        final String str7 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.H0 = hashMap22;
                                                        if (launchActivity22.I0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.ed[] edVarArr32 = edVarArr3;
                                                            launchActivity22.J0(edVarArr32[1], edVarArr32[0], str7);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.I0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.H0 != null) {
                                                            org.telegram.messenger.ed[] edVarArr4 = edVarArr3;
                                                            launchActivity3.J0(edVarArr4[1], edVarArr4[0], str7);
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
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void J0(org.telegram.messenger.ed r18, org.telegram.messenger.ed r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.J0(org.telegram.messenger.ed, org.telegram.messenger.ed, java.lang.String):void");
    }

    public final java.util.ArrayList K(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.K(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void K0(boolean z9, boolean z10, int i7, int i10, bh bhVar) {
        if (this.f41293x0 != null && !isFinishing()) {
            if (this.f41295y0 == null) {
                this.f41295y0 = new org.telegram.ui.Components.gc0(this);
            }
            org.telegram.messenger.iz.f23427x = true;
            int i11 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f41933s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, true);
            } else if (g4.G() && g4.v().V) {
                g4.v().m(false, true);
            }
            fi.va.w();
            org.telegram.messenger.ij ijVar = MediaController.B().f21292u0;
            if (ijVar != null && ijVar.i4()) {
                MediaController.B().q(true, true, false, false);
            }
            this.f41295y0.show();
            org.telegram.ui.Components.fc0 fc0Var = this.f41295y0.f33902b;
            ArrayList arrayList = this.f41297z0;
            arrayList.isEmpty();
            fc0Var.m(z10, i7, i10, new q10(15, this, bhVar));
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Components.ec0 ec0Var = (org.telegram.ui.Components.ec0) arrayList.get(i12);
                if (z9) {
                    int size = arrayList.size() - 1;
                }
                ec0Var.m(z10, i7, i10, null);
            }
            org.telegram.messenger.iz.C = true;
            e80 e80Var = new e80(this);
            this.f41295y0.f33902b.setDelegate(e80Var);
            int size2 = arrayList.size();
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((org.telegram.ui.Components.ec0) obj).setDelegate(e80Var);
            }
            try {
                org.telegram.messenger.dt.t(org.telegram.messenger.p10.f24467s0).Y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void L0(int i7, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f10;
        if (this.A0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, frameLayout, null);
            int i10 = org.telegram.messenger.g0.f22538m;
            if (i10 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i10));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(2131231644);
            linearLayout.addView(imageView, c8.ha.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.messenger.k5.n(textView, i11, null, 1, 17.0f);
            textView.setText(org.telegram.messenger.hd.M0(2131746781, null));
            linearLayout.addView(textView, c8.ha.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f35790a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
            org.telegram.ui.ActionBar.r6.H(textView2, org.telegram.ui.ActionBar.k6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(false));
            textView2.setGravity(51);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            linearLayout.addView(textView2, c8.ha.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f10 = 4.0f;
            scrollView.setPadding(org.telegram.messenger.g0.L(24.0f), i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, c8.ha.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(org.telegram.messenger.hd.M0(2131751605, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i12 = org.telegram.ui.ActionBar.k6.f28241y6;
            org.telegram.ui.ActionBar.r6.V(textView3, i12, null);
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.y J0 = org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 25);
            textView3.setBackground(J0);
            org.telegram.ui.ActionBar.r6.k(textView3, J0, null, h, null);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f));
            frameLayout.addView(textView3, c8.ha.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    ly0 ly0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.hd.M0(2131744199, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                            u1Var.R = M0;
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751603, null), new jy0(ly0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131753756, null), null);
                            u1Var.T = org.telegram.messenger.hd.M0(2131743976, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (ly0Var.f35792c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.hd.M0(2131743979, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
                                u1Var2.R = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131754306, null), new jy0(ly0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                u1Var2.T = org.telegram.messenger.hd.a0("TosAgeText", null, 2131743980, org.telegram.messenger.hd.G(ly0Var.f35792c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            ly0Var.a();
                            return;
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(org.telegram.messenger.hd.M0(2131754717, null));
            textView4.setGravity(17);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = org.telegram.messenger.g0.L(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            frameLayout.addView(textView4, c8.ha.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    ly0 ly0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.hd.M0(2131744199, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                            u1Var.R = M0;
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751603, null), new jy0(ly0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131753756, null), null);
                            u1Var.T = org.telegram.messenger.hd.M0(2131743976, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (ly0Var.f35792c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.hd.M0(2131743979, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
                                u1Var2.R = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131754306, null), new jy0(ly0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                u1Var2.T = org.telegram.messenger.hd.a0("TosAgeText", null, 2131743980, org.telegram.messenger.hd.G(ly0Var.f35792c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            ly0Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27850d7, view2, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.A0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f41293x0.addView(this.A0, c8.ha.c(-1.0f, -1));
            this.A0.setDelegate(new k80(this));
        } else {
            f10 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = org.telegram.messenger.p10.i(i7).Z;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f27010id.data.equals(tL_help_termsOfService.f27010id.data))) {
            org.telegram.messenger.p10.i(i7).Z = tL_help_termsOfService;
            org.telegram.messenger.p10.i(i7).v(false);
        }
        org.telegram.ui.Components.ly0 ly0Var = this.A0;
        if (ly0Var.getVisibility() != 0) {
            ly0Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        org.telegram.messenger.ij.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i13 = 0; i13 < length; i13++) {
            if (spannableStringBuilder.charAt(i13) == '\n') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == '-') {
                    int i15 = i13 + 2;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        org.telegram.ui.Components.oa oaVar = new org.telegram.ui.Components.oa(L2, L3);
                        spannableStringBuilder.replace(i14, i13 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(oaVar, i14, i15, 33);
                    }
                }
            }
        }
        ly0Var.f35790a.setText(spannableStringBuilder);
        ly0Var.f35792c = tL_help_termsOfService;
        ly0Var.d = i7;
        this.A0.animate().alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.F).setListener(null).start();
    }

    public final org.telegram.ui.ActionBar.q4 M() {
        ActionBarLayout actionBarLayout = this.f41275o0;
        ArrayList arrayList = this.P;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.q4) jg.g.i(1, arrayList);
        }
        return actionBarLayout;
    }

    public final void M0(int i7, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z9) {
        if (this.B0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i10 = org.telegram.ui.ActionBar.k6.f27849d6;
            frameLayout.f38559x = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0});
            frameLayout.f38560y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0});
            org.telegram.ui.ActionBar.r6.i(i10, frameLayout, null);
            int i11 = (int) (org.telegram.messenger.g0.f22538m / org.telegram.messenger.g0.f22543p);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f22538m));
            ?? imageView = new ImageView(this);
            imageView.f(2131624167, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().K(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(14.0f));
            frameLayout2.addView((View) imageView, c8.ha.d(-2, -2.0f, 17, 0.0f, i11, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.s9(frameLayout));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f38554f = scrollView;
            org.telegram.messenger.g0.z3(scrollView, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28129s8, false));
            scrollView.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, c8.ha.d(-1, -1.0f, 51, 27.0f, i11 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(textView, i12, null);
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.M0(2131743817, null));
            frameLayout3.addView(textView, c8.ha.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f38550a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
            org.telegram.ui.ActionBar.r6.H(textView2, org.telegram.ui.ActionBar.k6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(false));
            textView2.setGravity(49);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            frameLayout3.addView(textView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            bi.e5 e5Var = new bi.e5(12, (Context) this, false);
            frameLayout.d = e5Var;
            e5Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            e5Var.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
            e5Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            frameLayout.addView(e5Var, c8.ha.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            e5Var.setOnClickListener(new org.telegram.ui.Components.s9(frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f38551b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            e5Var.addView(textView3, c8.ha.e(-2, -2, 17));
            bi.e5 e5Var2 = new bi.e5(13, this, (Object) frameLayout);
            frameLayout.f38552c = e5Var2;
            e5Var2.setWillNotDraw(false);
            e5Var2.setAlpha(0.0f);
            e5Var2.setScaleX(0.1f);
            e5Var2.setScaleY(0.1f);
            e5Var2.setVisibility(4);
            org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(e5Var2);
            frameLayout.f38553e = dh0Var;
            dh0Var.d(null, true, false);
            dh0Var.f32913o = -1;
            e5Var.addView(e5Var2, c8.ha.e(36, 36, 17));
            this.B0 = frameLayout;
            this.f41293x0.addView((View) frameLayout, c8.ha.c(-1.0f, -1));
        }
        org.telegram.ui.Components.u9 u9Var = this.B0;
        TextView textView4 = u9Var.f38551b;
        u9Var.f38558w = 0;
        u9Var.f38555n = tL_help_appUpdate;
        u9Var.f38557s = i7;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            u9Var.f38556r = org.telegram.messenger.w7.r(null, document);
        }
        if (u9Var.getVisibility() != 0) {
            u9Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        org.telegram.messenger.ij.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
        u9Var.f38550a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            textView4.setText(org.telegram.messenger.hd.M0(2131743823, null) + String.format(Locale.US, " (%1$s)", org.telegram.messenger.g0.i0(tL_help_appUpdate.document.size, false, false)));
        } else {
            textView4.setText(org.telegram.messenger.hd.M0(2131743823, null));
        }
        org.telegram.messenger.qs.f(u9Var.f38557s).c(u9Var, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(u9Var.f38557s).c(u9Var, org.telegram.messenger.qs.Z1);
        org.telegram.messenger.qs.f(u9Var.f38557s).c(u9Var, org.telegram.messenger.qs.X1);
        if (z9) {
            org.telegram.messenger.t0.u();
        }
    }

    @Override
    public final boolean N(org.telegram.ui.ww r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.N(org.telegram.ui.ww):boolean");
    }

    public final void N0(int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.f41256d0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.f2 f2Var = this.f41275o0.getFragmentStack().get(this.f41275o0.getFragmentStack().size() - 1);
            if (f2Var instanceof je0) {
                f2Var = ((je0) f2Var).c0();
            }
            UndoView undoView = null;
            if (f2Var instanceof an) {
                an anVar = (an) f2Var;
                if (chat != null && anVar.a() == (-chat.f26953id)) {
                    chat = null;
                }
                anVar.f8();
                undoView = anVar.M3;
            } else if (f2Var instanceof ww) {
                undoView = ((ww) f2Var).k4();
            } else if (f2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) f2Var).L;
            }
            if (undoView != null) {
                undoView.m(0L, chat, i7);
            }
            if (i7 == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    public final org.telegram.ui.ActionBar.d3 O() {
        ActionBarLayout actionBarLayout = this.f41279q0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f41279q0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.f41275o0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.f41275o0.getBottomSheetTabs();
        }
        return null;
    }

    public final void O0(int i7) {
        P0(i7, new org.telegram.ui.Components.il0(25));
    }

    public final org.telegram.ui.ActionBar.f2 P() {
        if (ce0.B1(this.O, false).getInt("currentViewNum", 0) != 0) {
            return new ce0();
        }
        return new u50();
    }

    public final void P0(int i7, org.telegram.messenger.k9 k9Var) {
        if (i7 != org.telegram.messenger.p10.f24467s0 && org.telegram.messenger.p10.r(i7)) {
            this.f41271k1 = true;
            ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
            org.telegram.messenger.p10.f24467s0 = i7;
            org.telegram.messenger.p10.i(0).v(false);
            A();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f24974c4, Integer.valueOf(i7));
            if (org.telegram.messenger.g0.Q1()) {
                this.f41277p0.a0();
                this.f41279q0.a0();
                if (!this.M0) {
                    if (this.f41279q0.getFragmentStack().isEmpty()) {
                        this.f41285t0.setVisibility(0);
                    }
                    this.f41279q0.getView().setVisibility(8);
                }
                this.f41277p0.getView().setVisibility(8);
            }
            this.f41275o0.a0();
            this.f41275o0.c(-3, (je0) k9Var.j(null));
            this.f41275o0.X(true, true);
            if (org.telegram.messenger.g0.Q1()) {
                this.f41277p0.X(true, true);
                this.f41279q0.X(true, true);
            }
            if (!org.telegram.messenger.t0.f25571x) {
                ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
            }
            if (org.telegram.messenger.p10.i(i7).Z != null) {
                L0(i7, org.telegram.messenger.p10.i(i7).Z);
            }
            Q0();
            this.f41271k1 = false;
        }
    }

    public final void Q0() {
        int i7;
        String str;
        if (this.f41275o0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.O).getConnectionState();
            this.f41254c0 = connectionState;
            s60 s60Var = null;
            if (connectionState == 2) {
                str = "WaitingForNetwork";
                i7 = 2131743213;
            } else if (connectionState == 5) {
                str = "Updating";
                i7 = 2131743811;
            } else if (connectionState == 4) {
                str = "ConnectingToProxyWithDots";
                i7 = 2131751805;
            } else if (connectionState == 1) {
                str = "Connecting";
                i7 = 2131751809;
            } else {
                i7 = 0;
                str = null;
            }
            if (connectionState == 1 || connectionState == 4) {
                s60Var = new s60(this, 9);
            }
            ActionBarLayout actionBarLayout = this.f41275o0;
            actionBarLayout.M0 = str;
            actionBarLayout.N0 = i7;
            actionBarLayout.O0 = s60Var;
            for (int i10 = 0; i10 < actionBarLayout.U0.size(); i10++) {
                ((org.telegram.ui.ActionBar.f2) actionBarLayout.U0.get(i10)).setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, s60Var);
            }
        }
    }

    public final int R() {
        return this.f41256d0.size();
    }

    public final rh.d S() {
        return this.f41261f1;
    }

    public final boolean W(android.content.Intent r123, boolean r124, boolean r125, boolean r126, vf.b r127, boolean r128, boolean r129) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.W(android.content.Intent, boolean, boolean, boolean, vf.b, boolean, boolean):boolean");
    }

    public final void X() {
        ActionMode actionMode = this.f41270k0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Y(int i7, TLRPC.User user, String str, vf.b bVar) {
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = s12.q1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new d3.b(1), new l60(this, bVar, s12, i7, user));
    }

    @Override
    public final void a(float f10) {
        if (g4.G() && g4.v().V) {
            g4 v = g4.v();
            v.Q();
            g4.e0(v);
            if (v.f45828f0 != null) {
                v.f45842u0[0].f47087b.g1();
                v.f45842u0[1].f47087b.g1();
                v.f45828f0.invalidate();
                v.f45838q0.invalidate();
                if (f10 == 1.0f) {
                    v.f45842u0[0].f47088c.f();
                    v.f45842u0[1].f47088c.f();
                }
            }
        }
        if (PhotoViewer.A1()) {
            PhotoViewer.p1().r3();
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.a0():void");
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z9) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.f41277p0) {
            this.f41279q0.X(z9, z9);
            this.f41275o0.X(z9, z9);
        }
    }

    public final void c0() {
        org.telegram.ui.ActionBar.q4[] q4VarArr = {this.f41275o0, this.f41277p0, this.f41279q0};
        for (int i7 = 0; i7 < 3; i7++) {
            org.telegram.ui.ActionBar.q4 q4Var = q4VarArr[i7];
            if (q4Var instanceof ActionBarLayout) {
                ((ActionBarLayout) q4Var).F();
            }
        }
    }

    public final boolean d0(boolean z9) {
        boolean z10;
        pg.j jVar = c8.nb.f5778a;
        if (jVar != null) {
            if (jVar.f53537s) {
                if (z9) {
                    jVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.gc0 gc0Var = this.f41295y0;
        if (gc0Var != null && gc0Var.f33902b.getVisibility() == 0) {
            if (z9) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.k3 k3Var = this.f41291w0;
            if (k3Var != null && (z10 = k3Var.U)) {
                if (z9 && z10) {
                    k3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.ql0.H;
                if (u1Var != null) {
                    if (z9) {
                        u1Var.dismiss();
                        org.telegram.ui.Components.ql0.H = null;
                        return false;
                    }
                } else if (ks.f47266g0 != null && ks.p().E) {
                    if (z9) {
                        ks.p().n();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f41933s) {
                    if (z9) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                    if (z9) {
                        PhotoViewer.p1().z0(true, false);
                        return false;
                    }
                } else if (!g4.G() || !g4.v().V) {
                    return true;
                } else {
                    if (z9) {
                        g4.v().m(true, false);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int r22, int r23, java.lang.Object... r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void e0() {
        HashSet hashSet;
        m4 m4Var = this.Y0;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Y0 = null;
        }
        if (!this.Q) {
            this.Q = true;
            ab.b0 b0Var = this.l1;
            if (b0Var != null) {
                b0Var.b();
                this.l1 = null;
            }
            ab.b0 b0Var2 = this.f41273m1;
            if (b0Var2 != null) {
                b0Var2.b();
                this.f41273m1 = null;
            }
            x70 x70Var = this.f41276o1;
            if (x70Var != null && (hashSet = org.telegram.messenger.rc.f25272n) != null) {
                hashSet.remove(x70Var);
            }
        }
    }

    public final void f0(Intent intent, vf.b bVar) {
        super.onNewIntent(intent);
        a0();
        E();
        W(intent, true, false, false, bVar, true, false);
    }

    public final void g0() {
        if (this.Y0 != null) {
            if (org.telegram.messenger.r2.f25199a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodePause");
            }
            org.telegram.messenger.g0.r(this.Y0);
            this.Y0 = null;
        }
        if (org.telegram.messenger.iz.f23413s.length() != 0) {
            org.telegram.messenger.iz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var = new m4(this, 10);
            this.Y0 = m4Var;
            if (org.telegram.messenger.iz.f23427x) {
                org.telegram.messenger.g0.i3(m4Var, 1000L);
                if (org.telegram.messenger.r2.f25199a) {
                    org.telegram.messenger.a8.b("schedule app lock in 1000");
                }
            } else if (org.telegram.messenger.iz.f23430y != 0) {
                if (org.telegram.messenger.r2.f25199a) {
                    org.telegram.messenger.a8.b("schedule app lock in " + ((org.telegram.messenger.iz.f23430y * 1000) + 1000));
                }
                org.telegram.messenger.g0.i3(this.Y0, (org.telegram.messenger.iz.f23430y * 1000) + 1000);
            }
        } else {
            org.telegram.messenger.iz.B = 0;
        }
        org.telegram.messenger.iz.y();
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.f2 f2Var, ActionBarLayout actionBarLayout) {
        boolean z9;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (org.telegram.messenger.g0.Q1()) {
            boolean z10 = f2Var instanceof ww;
            if (!z10 && !(f2Var instanceof je0)) {
                if ((f2Var instanceof an) && !((an) f2Var).c()) {
                    boolean z11 = this.M0;
                    if (!z11 && actionBarLayout != (actionBarLayout3 = this.f41279q0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f41285t0.setVisibility(8);
                        this.f41279q0.a0();
                        this.f41279q0.c(-1, f2Var);
                        if (!this.f41277p0.getFragmentStack().isEmpty()) {
                            while (this.f41277p0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f41277p0;
                                actionBarLayout4.d0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f41277p0.l(true, false);
                            return false;
                        }
                    } else if (z11 && actionBarLayout != (actionBarLayout2 = this.f41275o0)) {
                        actionBarLayout2.c(-1, f2Var);
                        if (!this.f41277p0.getFragmentStack().isEmpty()) {
                            while (this.f41277p0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f41277p0;
                                actionBarLayout5.d0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f41277p0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f41277p0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i7 = 0;
                    while (true) {
                        if (i7 < 4) {
                            if (org.telegram.messenger.p10.i(i7).p()) {
                                break;
                            }
                            i7++;
                        } else {
                            i7 = -1;
                            break;
                        }
                    }
                    if ((f2Var instanceof ce0) && i7 == -1) {
                        this.f41285t0.setVisibility(0);
                        this.f41283s0.setBackgroundColor(0);
                    } else {
                        this.f41283s0.setBackgroundColor(2130706432);
                    }
                    this.f41277p0.c(-1, f2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.f41275o0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && z10 && !((ww) f2Var).t4()) {
                    z9 = false;
                }
                if (z9) {
                    this.f41275o0.a0();
                    this.f41275o0.c(-1, f2Var);
                    this.f41277p0.a0();
                    this.f41277p0.getView().setVisibility(8);
                    if (!this.M0 && this.f41279q0.getFragmentStack().isEmpty()) {
                        this.f41285t0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.Y0 != null) {
            if (org.telegram.messenger.r2.f25199a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodeResume");
            }
            org.telegram.messenger.g0.r(this.Y0);
            this.Y0 = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (org.telegram.messenger.iz.B != 0) {
            org.telegram.messenger.iz.B = 0;
            org.telegram.messenger.iz.y();
            if (org.telegram.messenger.r2.f25199a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        org.telegram.ui.ActionBar.u1 u1Var = this.U0;
        if (u1Var != null) {
            try {
                u1Var.dismiss();
            } finally {
                this.U0 = null;
            }
        }
        this.P0 = null;
        this.Q0 = null;
        this.R0 = null;
        this.O0 = null;
        this.S0 = null;
    }

    @Override
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f41933s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
            return true;
        } else if (!g4.G() || !g4.v().V) {
            return false;
        } else {
            g4.v().m(true, false);
            return true;
        }
    }

    public final void j0(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.j0(boolean):void");
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
            if (actionBarLayout == this.f41275o0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.f41271k1) {
                e0();
                finish();
                return false;
            } else if (actionBarLayout == this.f41279q0) {
                if (!this.M0) {
                    this.f41285t0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f41277p0 && this.f41275o0.getFragmentStack().isEmpty() && this.f41277p0.getFragmentStack().size() == 1) {
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
        ce0 ce0Var = new ce0();
        s60 s60Var = new s60(this, 0);
        ce0Var.F = 3;
        ce0Var.f44756a = 12;
        ce0Var.f44762d0 = s60Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f38751a |= 256;
                obj.f38752b = indexOf;
                int i7 = lastIndexOf + 1;
                obj.f38753c = i7;
                valueOf.setSpan(new org.telegram.ui.Components.vy0(obj, 0), indexOf, i7, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = valueOf;
            u1Var.T = org.telegram.messenger.hd.M0(2131751202, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752548, null), new pu(10, this, ce0Var));
            jg.g.w(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        t0(ce0Var);
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.o4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.o4):boolean");
    }

    public final void l0(final long j3, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i7, final int i10) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            t0(v91.J0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = org.telegram.messenger.qp.s1(this.O).h1(-j3);
        tL_channels_getMessages.f26991id.add(num);
        ConnectionsManager.getInstance(this.O).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new b70(LaunchActivity.this, tLObject, num, num2, bArr, j3, runnable, str, i7, i10));
            }
        });
    }

    public final void m0(int i7, long j3, TLRPC.TL_error tL_error) {
        an anVar = new an(a8.p0.j(j3, "user_id"));
        t0(anVar);
        org.telegram.messenger.g0.i3(new rp(tL_error, anVar, org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3)), 13), 300L);
    }

    public final void n0(int i7, String str, String str2, vf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_importContactToken, new bg.k0(this, bVar, s12, i7, str2, 11));
    }

    public final void o0(int i7, String str, String str2, vf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        s12.d2().a(str, null, new bi.z4(this, s12, bVar, i7, str2, 1));
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f41270k0 == actionMode) {
            this.f41270k0 = null;
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f41275o0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.D;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.C0 = false;
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f41279q0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.D;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.C0 = false;
                ActionBarLayout actionBarLayout3 = this.f41277p0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.D;
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
        this.f41270k0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.f41275o0.s(menu) && org.telegram.messenger.g0.Q1() && !this.f41279q0.s(menu)) {
                this.f41277p0.s(menu);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f41275o0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.D;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.C0 = true;
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f41279q0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.D;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.C0 = true;
                ActionBarLayout actionBarLayout3 = this.f41277p0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.D;
                if (kVar3 != null) {
                    kVar3.setVisibility(8);
                }
                actionBarLayout3.C0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i7, int i10, Intent intent) {
        di.i4 currentPeerView;
        a8.r7 r7Var;
        VoIPService sharedInstance;
        boolean z9 = false;
        if (org.telegram.messenger.iz.f23413s.length() != 0 && org.telegram.messenger.iz.B != 0) {
            org.telegram.messenger.iz.B = 0;
            if (org.telegram.messenger.r2.f25199a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onActivityResult");
            }
            org.telegram.messenger.p10.i(this.O).v(false);
        }
        if (i7 == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.t0.F = canDrawOverlays;
            if (canDrawOverlays) {
                c40 c40Var = c40.f44539u5;
                if (c40Var != null) {
                    c40Var.K();
                }
                org.telegram.messenger.g0.i3(new s60(this, 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i7, i10, intent);
        String str = null;
        if (i7 >= 22336 && i7 <= 22399) {
            org.telegram.ui.Wallet.w0 w0Var = c8.va.f5912b;
            if (w0Var != null && w0Var.f43249e == this && w0Var.f43250f && w0Var.f43251g == i7) {
                if (i10 != -1) {
                    str = "AUTH_CANCELED";
                }
                w0Var.c(str);
            }
        } else if (i7 == 520) {
            if (i10 == -1 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
                sharedInstance.createCaptureDevice(true);
            }
        } else if (i7 == 140) {
            org.telegram.messenger.sd f10 = org.telegram.messenger.sd.f(this.O);
            if (i10 == -1) {
                z9 = true;
            }
            Utilities.d.c(new org.telegram.messenger.o10(3, f10, z9));
        } else if (i7 == 521) {
            ii.c cVar = this.f41278p1;
            if (cVar != null) {
                if (i10 == -1) {
                    z9 = true;
                }
                cVar.a(Boolean.valueOf(z9));
                this.f41278p1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f31562p;
            if (themeEditorView != null && (r7Var = themeEditorView.f31573m) != null) {
                r7Var.t(i7, i10, intent);
            }
            ActionBarLayout actionBarLayout = this.f41275o0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.f2 f2Var = this.f41275o0.getFragmentStack().get(this.f41275o0.getFragmentStack().size() - 1);
                f2Var.onActivityResultFragment(i7, i10, intent);
                if (f2Var.getLastStoryViewer() != null && (currentPeerView = f2Var.getLastStoryViewer().f9559n0.getCurrentPeerView()) != null && i10 == -1) {
                    if (i7 != 0 && i7 != 2) {
                        if (i7 == 21) {
                            if (intent == null) {
                                currentPeerView.X0();
                            } else {
                                if (intent.getData() != null) {
                                    currentPeerView.Q0(intent.getData());
                                } else if (intent.getClipData() != null) {
                                    ClipData clipData = intent.getClipData();
                                    for (int i11 = 0; i11 < clipData.getItemCount(); i11++) {
                                        currentPeerView.Q0(clipData.getItemAt(i11).getUri());
                                    }
                                } else {
                                    currentPeerView.X0();
                                }
                                di.u2 u2Var = currentPeerView.f9190r2;
                                if (u2Var != null) {
                                    u2Var.dismiss();
                                }
                                currentPeerView.i0(true);
                            }
                        }
                    } else {
                        currentPeerView.r0();
                        di.u2 u2Var2 = currentPeerView.f9190r2;
                        if (u2Var2 != null) {
                            u2Var2.f32924a2.j0(i7, intent, null);
                        }
                    }
                }
            }
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f41279q0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f41279q0.getFragmentStack().get(this.f41279q0.getFragmentStack().size() - 1).onActivityResultFragment(i7, i10, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f41277p0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f41277p0.getFragmentStack().get(this.f41277p0.getFragmentStack().size() - 1).onActivityResultFragment(i7, i10, intent);
                }
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f24975c5, Integer.valueOf(i7), Integer.valueOf(i10), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (d0(true)) {
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.f41277p0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f41277p0.I();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f41279q0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f41279q0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.f2 f2Var = this.f41279q0.getFragmentStack().get(this.f41279q0.getFragmentStack().size() - 1);
                    if (f2Var.onBackPressed(true)) {
                        f2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.f41275o0.I();
                return;
            }
            this.f41275o0.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        float f11;
        float f12;
        org.telegram.messenger.g0.v(this, configuration);
        this.f41284s1.a();
        org.telegram.messenger.g0.x3(getWindow());
        super.onConfigurationChanged(configuration);
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f17846c;
        LaunchActivity launchActivity = (LaunchActivity) d.f17848f;
        if (launchActivity == null || !org.telegram.messenger.g0.H1(launchActivity)) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ti.i iVar = ((ti.o) arrayList.get(i7)).f56033e;
                if (iVar != null && iVar.h != null && !iVar.K) {
                    Activity activity = iVar.f55991c;
                    org.telegram.messenger.g0.v(activity, activity.getResources().getConfiguration());
                    ab.d0.f917b = null;
                    Point point = org.telegram.messenger.g0.f22544q;
                    iVar.A = (Math.min(point.x, point.y) - (ti.i.m() * 2.0f)) / iVar.h();
                    int h = (int) (iVar.h() * iVar.f56011z);
                    ti.m mVar = iVar.f55990b;
                    int I = mVar.I();
                    int U = mVar.U();
                    if (I > 0 && U > 0) {
                        f10 = U / I;
                    } else {
                        f10 = 0.5625f;
                    }
                    int i10 = (int) (((int) (ti.i.i(f10) * f10)) * iVar.f56011z);
                    if (iVar.f56009x != h || iVar.f56010y != i10) {
                        WindowManager.LayoutParams layoutParams = iVar.f55992e;
                        iVar.f56009x = h;
                        layoutParams.width = h;
                        iVar.f56010y = i10;
                        layoutParams.height = i10;
                        iVar.r();
                    }
                    r1.g gVar = iVar.D;
                    gVar.f54165b = iVar.B;
                    gVar.f54166c = true;
                    gVar.f54174m.f54182i = ti.i.n(f11, iVar.f56009x);
                    iVar.D.h();
                    r1.g gVar2 = iVar.E;
                    gVar2.f54165b = iVar.C;
                    gVar2.f54166c = true;
                    gVar2.f54174m.f54182i = ti.i.e(f12, iVar.f56010y);
                    iVar.E.h();
                }
            }
        }
        org.telegram.messenger.g0.d3();
        a0();
        E();
        org.telegram.messenger.g0.h3(new s60(this, 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            int i11 = pipRoundVideoView.f31432y.getInt("sidex", 1);
            int i12 = pipRoundVideoView.f31432y.getInt("sidey", 0);
            float f13 = pipRoundVideoView.f31432y.getFloat("px", 0.0f);
            float f14 = pipRoundVideoView.f31432y.getFloat("py", 0.0f);
            pipRoundVideoView.f31430w.x = PipRoundVideoView.b(f13, i11, pipRoundVideoView.h, true);
            pipRoundVideoView.f31430w.y = PipRoundVideoView.b(f14, i12, pipRoundVideoView.f31427n, false);
            pipRoundVideoView.f31431x.updateViewLayout(pipRoundVideoView.f31422a, pipRoundVideoView.f31430w);
        }
        org.telegram.ui.Components.vt vtVar = org.telegram.ui.Components.vt.O1;
        if (vtVar != null) {
            vtVar.c0(configuration);
        }
        wg.l lVar = wg.l.l1;
        if (lVar != null) {
            lVar.c0(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.Y8;
        ThemeEditorView themeEditorView = ThemeEditorView.f31562p;
        if (themeEditorView != null) {
            int i13 = themeEditorView.f31572l.getInt("sidex", 1);
            int i14 = themeEditorView.f31572l.getInt("sidey", 0);
            float f15 = themeEditorView.f31572l.getFloat("px", 0.0f);
            float f16 = themeEditorView.f31572l.getFloat("py", 0.0f);
            themeEditorView.f31569i.x = ThemeEditorView.c(f15, i13, themeEditorView.f31568g, true);
            themeEditorView.f31569i.y = ThemeEditorView.c(f16, i14, themeEditorView.h, false);
            try {
                if (themeEditorView.f31565c.getParent() != null) {
                    themeEditorView.f31570j.updateViewLayout(themeEditorView.f31565c, themeEditorView.f31569i);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (org.telegram.ui.ActionBar.k6.f28043o == 3) {
            org.telegram.ui.ActionBar.k6.F(false);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z9;
        int i7;
        String str;
        w9.b bVar;
        String str2;
        String str3;
        String str4;
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        D1 = true;
        E1++;
        boolean z10 = org.telegram.messenger.r2.f25199a;
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        G1 = this;
        org.telegram.messenger.t0.w();
        org.telegram.messenger.g0.v(this, getResources().getConfiguration());
        this.O = org.telegram.messenger.p10.f24467s0;
        this.f41259e1 = new androidx.mediarouter.app.f(this, 9);
        IntentFilter intentFilter = new IntentFilter("org.telegram.messenger.DEBUG_THEME");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.f41259e1, intentFilter, 2);
        } else {
            registerReceiver(this.f41259e1, intentFilter);
        }
        if (!org.telegram.messenger.p10.i(this.O).p() && (intent = getIntent()) != null && intent.getAction() != null) {
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
        setTheme(2131755318);
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28129s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.r6(1));
        getWindow().setFormat(-1);
        org.telegram.messenger.n6 n6Var = new org.telegram.messenger.n6(getWindow(), new org.telegram.ui.Components.il0(24));
        this.f41257d1 = n6Var;
        n6Var.a();
        super.onCreate(bundle);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            org.telegram.messenger.g0.E = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.k6.P();
        org.telegram.ui.ActionBar.k6.T(this);
        if (org.telegram.messenger.iz.f23413s.length() != 0 && org.telegram.messenger.iz.f23427x) {
            org.telegram.messenger.iz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.f22516a;
        this.f41275o0 = new ActionBarLayout(this, true);
        k0 k0Var = new k0(12, this, this);
        this.f41287u0 = k0Var;
        k0Var.setClipToPadding(false);
        this.f41287u0.setClipChildren(false);
        setContentView(this.f41287u0);
        this.f41261f1 = new rh.d(this.f41287u0);
        l2.i d = l2.i.d();
        bg.v0 v0Var = new bg.v0(this, false);
        LaunchActivity launchActivity = (LaunchActivity) d.f17848f;
        if (launchActivity != null && launchActivity != this) {
            ((ti.r) d.f17847e).c();
        }
        d.f17848f = this;
        d.f17844a = false;
        d.f17845b = false;
        ti.r rVar = (ti.r) d.f17847e;
        rVar.f56043b = this;
        rVar.d = v0Var;
        rVar.f56053n = null;
        rVar.f56044c = new ti.s(this);
        ((ViewGroup) getWindow().getDecorView()).addView(rVar.f56044c);
        Context context = org.telegram.messenger.t0.f25563b;
        final sg.t0 t0Var = new sg.t0(d, 11);
        if (c8.kc.f5747a == null) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            final String packageName = context.getPackageName();
            ?? r72 = new AppOpsManager.OnOpChangedListener() {
                @Override
                public final void onOpChanged(String str5, String str6) {
                    if (packageName.equals(str6)) {
                        g0.h3(t0Var);
                    }
                }
            };
            c8.kc.f5747a = r72;
            try {
                appOpsManager.startWatchingMode("android:system_alert_window", packageName, r72);
                if (i10 >= 26) {
                    appOpsManager.startWatchingMode("android:picture_in_picture", packageName, c8.kc.f5747a);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0(this);
        this.m0 = xz0Var;
        xz0Var.setVisibility(8);
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3(this);
        this.f41293x0 = n3Var;
        n3Var.setActionBarLayout(this.f41275o0);
        this.f41293x0.addOnLayoutChangeListener(new Object());
        this.f41293x0.setClipChildren(false);
        this.f41293x0.setClipToPadding(false);
        this.f41287u0.addView(this.f41293x0, c8.ha.c(-1.0f, -1));
        kg.k kVar = new kg.k(this, 5);
        this.f41274n0 = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f41287u0.addView(this.f41274n0, c8.ha.c(48.0f, 48));
        this.f41274n0.setVisibility(8);
        k0 k0Var2 = this.f41287u0;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(this);
        this.f41291w0 = k3Var;
        k0Var2.addView(k3Var);
        k0 k0Var3 = this.f41287u0;
        ?? jzVar = new org.telegram.ui.Components.jz(this);
        jzVar.setVisibility(8);
        this.f41289v0 = jzVar;
        k0Var3.addView(jzVar);
        E0();
        this.f41293x0.setParentActionBarLayout(this.f41275o0);
        this.f41275o0.setDrawerLayoutContainer(this.f41293x0);
        this.f41275o0.setFragmentStack(this.f41256d0);
        this.f41275o0.setFragmentStackChangedListener(new s60(this, 3));
        this.f41275o0.setDelegate(this);
        org.telegram.ui.ActionBar.k6.o1(true);
        A();
        Q0();
        org.telegram.messenger.qs e11 = org.telegram.messenger.qs.e();
        int i11 = org.telegram.messenger.qs.f25020k4;
        e11.k(i11, this);
        this.f41254c0 = ConnectionsManager.getInstance(this.O).getConnectionState();
        ab.b0 b0Var = this.f41273m1;
        if (b0Var != null) {
            b0Var.b();
            this.f41273m1 = null;
        }
        ab.b0 b0Var2 = new ab.b0(org.telegram.messenger.qs.e(), this);
        b0Var2.c(org.telegram.messenger.qs.M0);
        b0Var2.c(org.telegram.messenger.qs.f25099x4);
        b0Var2.c(org.telegram.messenger.qs.f25106y4);
        b0Var2.c(org.telegram.messenger.qs.f25035n4);
        b0Var2.c(org.telegram.messenger.qs.f25072t4);
        b0Var2.c(org.telegram.messenger.qs.f25059r4);
        b0Var2.c(i11);
        b0Var2.c(org.telegram.messenger.qs.f25032n0);
        b0Var2.c(org.telegram.messenger.qs.f25113z4);
        b0Var2.c(org.telegram.messenger.qs.K4);
        b0Var2.c(org.telegram.messenger.qs.P4);
        b0Var2.c(org.telegram.messenger.qs.f25036n5);
        b0Var2.c(org.telegram.messenger.qs.f25021k5);
        b0Var2.c(org.telegram.messenger.qs.M5);
        b0Var2.c(org.telegram.messenger.qs.N5);
        this.f41273m1 = b0Var2;
        x70 x70Var = new x70(this, 0);
        this.f41276o1 = x70Var;
        org.telegram.messenger.rc.a(x70Var);
        if (this.f41275o0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f41277p0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!org.telegram.messenger.p10.i(this.O).p()) {
                this.f41275o0.c(-1, P());
            } else {
                this.f41275o0.c(-1, new je0());
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
                                    this.f41275o0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.f41275o0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    an anVar = new an(bundle2);
                                    if (this.f41275o0.c(-1, anVar)) {
                                        anVar.f43868l8 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    d50 d50Var = new d50(bundle2);
                                    if (this.f41275o0.c(-1, d50Var)) {
                                        d50Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    bd bdVar = new bd(bundle2);
                                    if (this.f41275o0.c(-1, bdVar)) {
                                        bdVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", org.telegram.messenger.p10.i(this.O).f24486n);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.f41275o0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.f41275o0.c(-1, new m31(null));
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
            }
        }
        E();
        F(false, true, !this.V0);
        Intent intent2 = getIntent();
        if (bundle != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        W(intent2, false, z9, false, null, true, true);
        try {
            String str5 = Build.DISPLAY;
            String str6 = Build.USER;
            if (str5 == null) {
                str3 = "";
            } else {
                str3 = str5.toLowerCase();
            }
            if (str6 == null) {
                str4 = "";
            } else {
                str4 = str3.toLowerCase();
            }
            if (org.telegram.messenger.r2.f25199a) {
                org.telegram.messenger.a8.b("OS name " + str3 + " " + str4);
            }
            if ((str3.contains("flyme") || str4.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                org.telegram.messenger.g0.f22551y = true;
                View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                y70 y70Var = new y70(rootView, 0);
                this.f41262g0 = y70Var;
                viewTreeObserver.addOnGlobalLayoutListener(y70Var);
            }
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        MediaController.B().J0 = this;
        ((ApplicationLoaderImpl) org.telegram.messenger.t0.f25562a).getClass();
        try {
            boolean z11 = org.telegram.messenger.r2.f25199a;
            str = "" + org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24467s0).f24486n;
            if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24467s0).f() != null) {
                String n10 = org.telegram.messenger.t10.n(org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24467s0).f());
                if (!TextUtils.isEmpty(n10)) {
                    str = "@" + n10;
                }
            }
            if (ConnectionsManager.getInstance(org.telegram.messenger.p10.f24467s0).isTestBackend()) {
                str = str + " [TEST SERVER]";
            }
            bVar = (w9.b) o9.g.c().b(w9.b.class);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        if (bVar != null) {
            aa.u uVar = bVar.f57528a;
            uVar.f868n.f3135a.a(new a1.e(3, uVar, str));
            bVar.b("version", "public");
            bVar.b("model", Build.MODEL);
            bVar.b("manufacturer", Build.MANUFACTURER);
            if (Build.VERSION.SDK_INT >= 31) {
                str2 = Build.SOC_MODEL;
                bVar.b("soc_model", str2);
                bVar.b("soc_manufacturer", Build.SOC_MANUFACTURER);
            }
            bVar.b("device", Build.DEVICE);
            bVar.b("product", Build.PRODUCT);
            bVar.b("hardware", Build.HARDWARE);
            bVar.b("user", Build.USER);
            bVar.a();
            int i12 = Build.VERSION.SDK_INT;
            org.telegram.messenger.as.b(true);
            if (i12 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - org.telegram.messenger.as.f21499j.getLong("last_checked", 0L) >= 86400000 && org.telegram.messenger.as.f21499j.getInt("dismissed_count", 0) < 3) {
                Pattern pattern = org.telegram.ui.Components.v4.f38813a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(2131754283, null);
                if (org.telegram.messenger.as.j()) {
                    if (i12 >= 31) {
                        i7 = 2131754281;
                    } else {
                        i7 = 2131754280;
                    }
                } else {
                    i7 = 2131754282;
                }
                alertDialog$Builder.f27293a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i7, null));
                int i13 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder.m(2131624115, 72, org.telegram.ui.ActionBar.k6.x0(null, i13, false), null);
                alertDialog$Builder.n(i13, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new org.telegram.ui.Components.y0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                alertDialog$Builder.f27293a.setOnDismissListener(new fi.d1(3));
                alertDialog$Builder.f27293a.show();
                org.telegram.messenger.as.f21499j.edit().putLong("last_checked", System.currentTimeMillis()).apply();
            }
            if (i12 >= 31) {
                getWindow().getDecorView().addOnAttachStateChangeListener(new s80(this));
            }
            org.telegram.ui.Components.cc.a(this.f41287u0, new fi.r7(10));
            getWindow().getDecorView().setSystemUiVisibility(1792);
            Window window = getWindow();
            try {
                org.telegram.messenger.g0.S(window);
                if (i12 >= 28) {
                    window.setNavigationBarDividerColor(0);
                }
            } catch (Throwable th3) {
                org.telegram.messenger.a8.g(th3, true);
            }
            BackupAgent.a();
            qy0.a0(false);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 34) {
                if (this.f41267i1 == null) {
                    this.f41267i1 = new t80(this);
                }
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f41267i1);
            } else if (i14 >= 33) {
                if (this.f41269j1 == null) {
                    this.f41269j1 = new u80(this);
                }
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f41269j1);
            }
            B();
            return;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @Override
    public final void onDestroy() {
        bg.b0 b0Var;
        k0 k0Var;
        org.telegram.ui.Wallet.w0 w0Var = c8.va.f5912b;
        if (w0Var != null && w0Var.f43249e == this) {
            w0Var.c("AUTH_CANCELED");
            c8.va.f5912b.e();
        }
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f17846c;
        if (((LaunchActivity) d.f17848f) == this) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ti.o) arrayList.get(size)).b();
            }
            ((ti.r) d.f17847e).c();
            d.f17848f = null;
            ((ArrayList) d.d).clear();
        }
        D1 = false;
        E1--;
        androidx.mediarouter.app.f fVar = this.f41259e1;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.f41259e1 = null;
        }
        if (E1 == 0) {
            if (PhotoViewer.f41340f9 != null) {
                PhotoViewer.f41340f9.J0();
            }
            if (PhotoViewer.A1()) {
                PhotoViewer.p1().J0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f10 = SecretMediaViewer.f();
                Runnable runnable = f10.n1;
                if (runnable != null) {
                    runnable.run();
                    f10.n1 = null;
                }
                bg.v0 v0Var = f10.f41917j1;
                if (v0Var != null) {
                    v0Var.b();
                    f10.f41917j1 = null;
                }
                org.telegram.messenger.qs.f(f10.f41893a).n(f10, org.telegram.messenger.qs.f25087w);
                org.telegram.messenger.qs.f(f10.f41893a).n(f10, org.telegram.messenger.qs.f25022l0);
                org.telegram.messenger.qs.f(f10.f41893a).n(f10, org.telegram.messenger.qs.f25005i0);
                f10.f41933s = false;
                f10.L = null;
                org.telegram.messenger.jc jcVar = f10.f41910g0;
                if (jcVar != null) {
                    jcVar.a();
                    f10.f41910g0 = null;
                }
                f10.j();
                if (f10.f41896b != null && (k0Var = f10.d) != null) {
                    try {
                        if (k0Var.getParent() != null) {
                            ((WindowManager) f10.f41896b.getSystemService("window")).removeViewImmediate(f10.d);
                        }
                        f10.d = null;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                SecretMediaViewer.f41892v1 = null;
            }
            if (g4.G()) {
                g4.v().r();
            }
            if (ks.f47266g0 != null) {
                ks p10 = ks.p();
                p10.E = false;
                p10.f47281l = null;
                p10.W = null;
                p10.Y = null;
                p10.f47268a0 = null;
                if (p10.f47291w != null && p10.f47293y != null) {
                    Bitmap bitmap = p10.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        p10.v = null;
                    }
                    p10.M = 0.0f;
                    p10.K = false;
                    try {
                        if (p10.f47293y.getParent() != null) {
                            ((WindowManager) p10.f47291w.getSystemService("window")).removeViewImmediate(p10.f47293y);
                        }
                        p10.f47293y = null;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    ks.f47266g0 = null;
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25017k1, 8);
                }
            }
            c40 c40Var = c40.f44539u5;
            if (c40Var != null) {
                c40Var.K();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i7 = org.telegram.ui.ActionBar.k6.f27785a;
            org.telegram.ui.Components.vt vtVar = org.telegram.ui.Components.vt.O1;
            if (vtVar != null) {
                vtVar.K0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f31562p;
            if (themeEditorView != null) {
                themeEditorView.b();
            }
            pg.j jVar = c8.nb.f5778a;
            if (jVar != null) {
                jVar.f53533e.edit().putFloat("x", (float) jVar.f53532c.f54174m.f54182i).putFloat("y", (float) jVar.d.f54174m.f54182i).commit();
            }
            c8.nb.f5778a = null;
            SparseArray sparseArray = org.telegram.ui.Components.i5.f34483r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController B = MediaController.B();
        if (B.J0 == this) {
            B.J0 = null;
        }
        MediaController B2 = MediaController.B();
        if (B2.K0 == this.f41282r1) {
            B2.K0 = null;
        }
        for (int i10 = 0; i10 < this.C0.size(); i10++) {
            try {
                if (((Dialog) this.C0.get(i10)).isShowing()) {
                    ((Dialog) this.C0.get(i10)).dismiss();
                }
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        this.C0.clear();
        try {
            if (this.f41262g0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f41262g0);
            }
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (this.f41267i1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f41267i1);
            }
        } else if (i11 >= 33 && this.f41267i1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f41269j1);
        }
        org.telegram.ui.Components.cc.h(this.f41287u0);
        VideoAds.dropCache();
        I();
        super.onDestroy();
        e0();
        org.telegram.messenger.n6 n6Var = this.f41257d1;
        if (n6Var != null) {
            n6Var.e();
        }
        if (i11 >= 24 && (b0Var = this.f41265h1) != null) {
            b0Var.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 == 82 && !org.telegram.messenger.iz.C) {
            if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                return super.onKeyUp(i7, keyEvent);
            }
            if (g4.G() && g4.v().V) {
                return super.onKeyUp(i7, keyEvent);
            }
            if (org.telegram.messenger.g0.Q1()) {
                if (this.f41277p0.getView().getVisibility() == 0 && !this.f41277p0.getFragmentStack().isEmpty()) {
                    this.f41277p0.getView().onKeyUp(i7, keyEvent);
                } else if (this.f41279q0.getView().getVisibility() == 0 && !this.f41279q0.getFragmentStack().isEmpty()) {
                    this.f41279q0.getView().onKeyUp(i7, keyEvent);
                } else {
                    this.f41275o0.getView().onKeyUp(i7, keyEvent);
                }
            } else {
                this.f41275o0.getView().onKeyUp(i7, keyEvent);
            }
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.f41275o0;
        if (actionBarLayout != null) {
            actionBarLayout.M();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f41279q0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.M();
                }
                ActionBarLayout actionBarLayout3 = this.f41277p0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z9) {
        org.telegram.messenger.g0.E = z9;
        this.f41284s1.a();
        E();
        super.onMultiWindowModeChanged(z9);
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a0();
        E();
        W(intent, true, false, false, null, true, true);
    }

    @Override
    public final void onPause() {
        boolean z9;
        VoIPService sharedInstance;
        ti.i iVar;
        ti.q qVar;
        super.onPause();
        F1 = false;
        org.telegram.utils.twidget.p.q(true);
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f17846c;
        if (this == ((LaunchActivity) d.f17848f)) {
            d.f17845b = false;
            ti.r rVar = (ti.r) d.f17847e;
            LaunchActivity launchActivity = rVar.f56043b;
            if (launchActivity != null && Build.VERSION.SDK_INT >= 31 && rVar.f56046f == null && rVar.f56045e != null && org.telegram.messenger.g0.H1(launchActivity)) {
                rVar.i(rVar.f56045e);
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ti.o oVar = (ti.o) arrayList.get(i7);
                if (oVar.f56032c == 1 && (iVar = oVar.f56033e) != null && !iVar.f55993f && (qVar = iVar.f55996j) != null && iVar.f55998l != null && qVar.isAvailable()) {
                    try {
                        Bitmap bitmap = iVar.f55996j.getBitmap();
                        if (bitmap != null) {
                            iVar.f55998l.setImageBitmap(bitmap);
                            iVar.f55998l.setVisibility(0);
                            iVar.f55996j.setFirstFrameCallback(null);
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
            }
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25012j1, 4096);
        org.telegram.messenger.t0.f25571x = true;
        Utilities.d.c(new hi.j2(this.O, 12));
        g0();
        this.f41275o0.O();
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout = this.f41279q0;
            if (actionBarLayout != null) {
                actionBarLayout.O();
            }
            ActionBarLayout actionBarLayout2 = this.f41277p0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.O();
            }
        }
        org.telegram.ui.Components.gc0 gc0Var = this.f41295y0;
        if (gc0Var != null) {
            gc0Var.f33902b.k();
        }
        ArrayList arrayList2 = this.f41297z0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((org.telegram.ui.Components.ec0) obj).k();
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25562a;
        ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer p12 = PhotoViewer.p1();
            if (p12.f41426j2 != null) {
                p12.z0(false, false);
            } else {
                org.telegram.ui.Components.t51 t51Var = p12.F2;
                if (t51Var != null && p12.Y2) {
                    t51Var.s0(org.telegram.messenger.g0.H1(p12.D));
                }
            }
        }
        fi.va vaVar = fi.va.F2;
        if (vaVar != null) {
            vaVar.u(false);
            fi.la laVar = vaVar.f12944c1;
            if (laVar != null) {
                laVar.f12365f.r();
            }
            fi.ja jaVar = vaVar.X0;
            if (jaVar != null) {
                jaVar.x(0, true);
            }
        }
        org.telegram.ui.Components.voip.e2.a(this);
        ec1 ec1Var = ec1.l1;
        if (ec1Var != null) {
            boolean isInteractive = ((PowerManager) ec1Var.f45274b.getSystemService("power")).isInteractive();
            boolean a10 = c8.kc.a(ec1Var.f45274b);
            if (!a10 && !c8.kc.b(ec1Var.f45274b)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (ec1Var.C0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a10) {
                int measuredHeight = ec1.l1.f45308t0.getMeasuredHeight();
                ec1 ec1Var2 = ec1.l1;
                org.telegram.ui.Components.voip.e2.f(ec1Var2.f45274b, ec1Var2.f45271a, ec1Var2.f45308t0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = ec1.l1.f45303q0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.e2.V = windowInsets.getSystemWindowInsetTop();
                    ec1.l1.f45303q0.getSystemWindowInsetBottom();
                }
            }
            if (ec1Var.m0 && ((!z9 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.e2.d() != null) {
                org.telegram.ui.Components.voip.e2.d().e();
            }
        } else if (org.telegram.ui.Components.voip.e2.d() != null) {
            org.telegram.ui.Components.voip.e2.d().e();
        }
        HashMap hashMap = xh.e.f58682n;
        if (hashMap != null) {
            for (xh.e eVar : hashMap.values()) {
                xh.d dVar = eVar.f58687f;
                if (dVar != null) {
                    dVar.f58672b = true;
                }
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean r6, android.content.res.Configuration r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onPictureInPictureModeChanged(boolean, android.content.res.Configuration):void");
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        ((ti.r) l2.i.d().f17847e).g();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        ((ti.r) l2.i.d().f17847e).f(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        boolean z9;
        bg.m0 m0Var;
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (!u(i7, strArr, iArr)) {
            return;
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25562a;
        if (this.f41275o0.getFragmentStack().size() != 0) {
            this.f41275o0.getFragmentStack().get(this.f41275o0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (this.f41279q0.getFragmentStack().size() != 0) {
                this.f41279q0.getFragmentStack().get(this.f41279q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
            }
            if (this.f41277p0.getFragmentStack().size() != 0) {
                this.f41277p0.getFragmentStack().get(this.f41277p0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
            }
        }
        ec1.h(iArr, i7);
        fi.va vaVar = fi.va.F2;
        if (vaVar != null) {
            di.b bVar = vaVar.f12934a;
            Activity activity = vaVar.f12938b;
            if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i7 == 111) {
                vaVar.f12994s2 = !z9;
                if (z9 && vaVar.f12953f0 == 0) {
                    vaVar.A0.setCameraThumb(null);
                    if (CameraController.getInstance().isCameraInitied()) {
                        vaVar.q();
                    } else {
                        CameraController.getInstance().initCamera(new fi.u8(vaVar, 0));
                    }
                }
            } else if (i7 == 114) {
                if (z9) {
                    MediaController.O(0);
                    vaVar.e(true);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                    int i10 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(2131624118, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
                    alertDialog$Builder.n(i10, null);
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747298, null));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                    u1Var.T = X2;
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new fi.d9(vaVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                    u1Var.show();
                }
            } else if (i7 == 112) {
                if (!z9) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, activity, bVar);
                    int i11 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder2.m(2131624116, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                    alertDialog$Builder2.n(i11, null);
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747308, null));
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
                    u1Var2.T = X22;
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747299, null), new fi.d9(vaVar, 3));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                    u1Var2.show();
                }
            } else if (i7 == 115) {
                if (!z9) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, activity, bVar);
                    int i12 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder3.m(2131624118, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
                    alertDialog$Builder3.n(i12, null);
                    SpannableStringBuilder X23 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747312, null));
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27293a;
                    u1Var3.T = X23;
                    alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131747299, null), new fi.d9(vaVar, 5));
                    alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                    u1Var3.show();
                }
                if (z9 && (m0Var = vaVar.f13015y2) != null) {
                    m0Var.run();
                }
                vaVar.f13015y2 = null;
            }
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f24980d5, Integer.valueOf(i7), strArr, iArr);
        SparseIntArray sparseIntArray = this.f41251a1;
        if (sparseIntArray.get(i7, -1) >= 0) {
            int i13 = sparseIntArray.get(i7, -1);
            sparseIntArray.delete(i7);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25041o5, Integer.valueOf(i13));
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25047p5, Integer.valueOf(i7), strArr, iArr);
    }

    @Override
    public final void onResume() {
        org.telegram.messenger.ij ijVar;
        sg.u0 u0Var;
        org.telegram.messenger.we weVar;
        boolean z9;
        LaunchActivity launchActivity;
        super.onResume();
        org.telegram.utils.twidget.p.q(false);
        F1 = true;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f17846c;
        ArrayList arrayList2 = (ArrayList) d.d;
        if (this == ((LaunchActivity) d.f17848f)) {
            d.f17845b = true;
            ti.r rVar = (ti.r) d.f17847e;
            if (rVar.f56046f != null && (launchActivity = rVar.f56043b) != null && !org.telegram.messenger.g0.H1(launchActivity)) {
                rVar.d();
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ti.o oVar = (ti.o) arrayList.get(i7);
                ti.i iVar = oVar.f56033e;
                if (iVar != null && oVar.f56032c == 1 && iVar.f55994g && !iVar.K) {
                    if (iVar.f55990b.r() && c8.kc.a(iVar.f55991c)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 != iVar.f55993f) {
                        iVar.l();
                        iVar.a();
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList2.clear();
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    ((Runnable) obj).run();
                }
            }
            d.f();
        }
        if (org.telegram.ui.ActionBar.k6.f28043o == 3) {
            org.telegram.ui.ActionBar.k6.F(false);
        }
        org.telegram.messenger.sd[] sdVarArr = org.telegram.messenger.sd.O;
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            } else if (org.telegram.messenger.p10.i(i11).p() && !org.telegram.messenger.sd.f(i11).I.isEmpty()) {
                org.telegram.messenger.sd.q();
                break;
            } else {
                i11++;
            }
        }
        H(true);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25017k1, 4096);
        MediaController B = MediaController.B();
        ViewGroup view = this.f41275o0.getView();
        this.f41282r1 = view;
        B.K0 = view;
        org.telegram.messenger.t0.f25571x = false;
        org.telegram.messenger.qp.s1(this.O).T4(null);
        I0();
        Utilities.d.c(new org.telegram.ui.Components.l10(19));
        C(0);
        if (Build.VERSION.SDK_INT >= 24 && (weVar = MediaController.f21241a2) != null) {
            Utilities.f21333e.d(new hi.j2(weVar.f26297e.size(), 3), 2000L);
        }
        h0();
        org.telegram.ui.Components.gc0 gc0Var = this.f41295y0;
        if (gc0Var != null && gc0Var.f33902b.getVisibility() == 0) {
            this.f41275o0.n();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.f41279q0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f41277p0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.f41295y0.f33902b.l();
            ArrayList arrayList4 = this.f41297z0;
            int size2 = arrayList4.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList4.get(i12);
                i12++;
                ((org.telegram.ui.Components.ec0) obj2).l();
            }
        } else {
            this.f41275o0.P();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout3 = this.f41279q0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.P();
                }
                ActionBarLayout actionBarLayout4 = this.f41277p0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.P();
                }
            }
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
        Q0();
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer p12 = PhotoViewer.p1();
            pq0 pq0Var = p12.f41380e0;
            if (pq0Var != null) {
                pq0Var.invalidate();
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.r2(p12, 0, 22), 100L);
            }
            org.telegram.ui.Components.t51 t51Var = p12.F2;
            if (t51Var != null) {
                t51Var.p0(t51Var.S() + 1);
                if (p12.Y2) {
                    p12.F2.s0(true);
                }
            }
            up0 up0Var = p12.L1;
            if (up0Var != null && (u0Var = up0Var.F0.d) != null) {
                u0Var.postRunnable(u0Var.f55126x);
            }
        }
        fi.va vaVar = fi.va.F2;
        if (vaVar != null) {
            vaVar.O();
        }
        if (PipRoundVideoView.F != null && MediaController.B().H() && (ijVar = MediaController.B().f21292u0) != null) {
            MediaController.B().i0(ijVar, ijVar.f23204b0);
        }
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24467s0).Z != null) {
            int i13 = org.telegram.messenger.p10.f24467s0;
            L0(i13, org.telegram.messenger.p10.i(i13).Z);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.iz.f23391j1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(org.telegram.messenger.p10.f24467s0, tL_help_appUpdate, true);
            }
        }
        z(false);
        org.telegram.messenger.t0.F = Settings.canDrawOverlays(this);
        org.telegram.ui.Components.voip.e2.a(this);
        ec1 ec1Var = ec1.l1;
        if (ec1Var != null) {
            if (org.telegram.ui.Components.voip.e2.d() != null) {
                org.telegram.ui.Components.voip.e2.b();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                ec1Var.y();
            } else if (VoIPService.getSharedState() == null) {
                ec1Var.f45308t0.b();
            }
            ec1Var.I0 = ((KeyguardManager) ec1Var.f45274b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.e2.d() != null) {
                org.telegram.ui.Components.voip.e2.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        } else if (org.telegram.ui.Components.voip.e2.d() != null) {
            org.telegram.ui.Components.voip.e2.d().getClass();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getVideoState(false) == 1) {
                sharedInstance3.setVideoState(false, 2);
            }
        }
        a0();
        HashMap hashMap = xh.e.f58682n;
        if (hashMap != null) {
            for (xh.e eVar : hashMap.values()) {
                xh.d dVar = eVar.f58687f;
                if (dVar != null) {
                    dVar.f58672b = false;
                }
            }
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25562a;
        a0 a0Var = I1;
        if (a0Var != null) {
            a0Var.run();
            I1 = null;
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.O);
        if (!s12.S3.contains("SETUP_LOGIN_EMAIL") && !s12.S3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            return;
        }
        Utilities.d.c(new org.telegram.messenger.wj(org.telegram.messenger.qp.s1(this.O), 26));
    }

    @Override
    public final void onSaveInstanceState(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override
    public final void onStart() {
        Activity activity;
        ti.i iVar;
        ti.q qVar;
        super.onStart();
        this.f41280q1 = true;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f17846c;
        if (this == ((LaunchActivity) d.f17848f)) {
            d.f17844a = true;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ti.o oVar = (ti.o) arrayList.get(i7);
                if (oVar.f56032c == 1 && (iVar = oVar.f56033e) != null && !iVar.f55993f && (qVar = iVar.f55996j) != null) {
                    qVar.post(new org.telegram.ui.web.w(28, iVar, qVar));
                }
            }
        }
        WeakReference weakReference = vf.c.f57236e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            vf.c.y(activity);
        }
        if (vf.c.f57234b == null) {
            vf.c.f57236e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(vf.c.d)) {
                    String a10 = a8.h1.a(this);
                    vf.c.d = a10;
                    if (a10 == null) {
                    }
                }
                Object obj = new Object();
                ag.a aVar = new ag.a();
                aVar.f1055b = new WeakReference(obj);
                vf.c.f57235c = aVar;
                String str = vf.c.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, aVar, 33)) {
                    vf.c.f57235c = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.t0.f25572y = false;
        org.telegram.ui.Components.p10.k(this);
        c40 c40Var = c40.f44539u5;
        if (c40Var != null) {
            c40Var.y1();
        }
    }

    @Override
    public final void onStop() {
        cq0 cq0Var;
        ti.i iVar;
        super.onStop();
        org.telegram.ui.Wallet.w0 w0Var = c8.va.f5912b;
        if (w0Var != null && w0Var.f43249e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.w0 w0Var2 = c8.va.f5912b;
            if (!w0Var2.f43250f) {
                w0Var2.c("AUTH_CANCELED");
                c8.va.f5912b.e();
            }
        }
        this.f41280q1 = false;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f17846c;
        if (this == ((LaunchActivity) d.f17848f)) {
            d.f17844a = false;
            ((ti.r) d.f17847e).getClass();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ti.o oVar = (ti.o) arrayList.get(i7);
                if (oVar.f56032c == 1 && (iVar = oVar.f56033e) != null && !iVar.f55993f) {
                    oVar.f56030a.b();
                    oVar.c();
                }
            }
        }
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer p12 = PhotoViewer.p1();
            if (!org.telegram.messenger.g0.H1(p12.D) && (p12.F2 == null ? !((cq0Var = p12.f41390f0) == null || !cq0Var.f31793y || !cq0Var.G) : p12.O3)) {
                p12.f2();
            }
        }
        vf.c.y(this);
        org.telegram.messenger.t0.f25572y = true;
        org.telegram.ui.Components.p10.k(this);
        c40 c40Var = c40.f44539u5;
        if (c40Var != null) {
            c40Var.x1();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f41263g1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        ((ti.r) l2.i.d().f17847e).g();
        ArrayList arrayList = this.Z0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.f41275o0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.U0.isEmpty()) {
                ((org.telegram.ui.ActionBar.f2) rf.b.g(1, actionBarLayout.U0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.s sVar = actionBarLayout.G;
            if (sVar != null) {
                sVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z9) {
        boolean z10;
        ArrayList arrayList;
        di.h7 a10;
        long[] jArr2 = jArr;
        int i7 = 0;
        while (true) {
            if (i7 < jArr2.length) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(this.O).a2(Long.valueOf(jArr2[i7]));
                if (a22 != null && !a22.stories_hidden) {
                    z10 = false;
                    break;
                }
                i7++;
            } else {
                z10 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.f2 Q = Q();
        if (Q != null) {
            di.y6 P1 = org.telegram.messenger.qp.s1(this.O).P1();
            if (z10) {
                arrayList = P1.h;
            } else {
                arrayList = P1.f9968g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z11 = z10;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z11) {
                ArrayList arrayList5 = new ArrayList();
                for (int i10 = 0; i10 < jArr2.length; i10++) {
                    TLRPC.User a23 = org.telegram.messenger.qp.s1(this.O).a2(Long.valueOf(jArr2[i10]));
                    if (a23 == null || !a23.stories_hidden) {
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
            if (z9) {
                for (int i12 = 0; i12 < jArr2.length; i12 = com.google.android.recaptcha.internal.a.g(i12, 1, jArr2[i12], arrayList4)) {
                }
            } else {
                for (int i13 = 0; i13 < jArr2.length; i13 = com.google.android.recaptcha.internal.a.g(i13, 1, jArr2[i13], arrayList3)) {
                }
            }
            if (!arrayList4.isEmpty() && z9) {
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.O);
                int[] iArr = {arrayList4.size()};
                rp rpVar = new rp(this, iArr, jArr2, 17);
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    long longValue = ((Long) arrayList4.get(i14)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer j12 = s12.j1(longValue);
                    tL_stories_getPeerStories.peer = j12;
                    if (j12 instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getPeerStories, new bi.h3(s12, longValue, rpVar, 6));
                    }
                }
                return;
            }
            long e10 = org.telegram.messenger.p10.i(this.O).e();
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i15)).peer);
                if (o4 != e10 && !arrayList3.contains(Long.valueOf(o4)) && P1.L(o4)) {
                    arrayList3.add(Long.valueOf(o4));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (Q instanceof ww) {
                    try {
                        a10 = di.h7.a(((ww) Q).E0.h);
                    } catch (Exception unused) {
                    }
                    di.h7 h7Var = a10;
                    Q.getOrCreateStoryViewer().B();
                    Q.getOrCreateStoryViewer().M(this, null, arrayList3, 0, null, null, h7Var, false);
                }
                a10 = null;
                di.h7 h7Var2 = a10;
                Q.getOrCreateStoryViewer().B();
                Q.getOrCreateStoryViewer().M(this, null, arrayList3, 0, null, null, h7Var2, false);
            }
        }
    }

    public final void q0(final int i7, final long j3, final boolean z9) {
        TL_stories.StoryItem storyItem;
        di.q6 q6Var;
        di.q6 A;
        org.telegram.messenger.ij f10;
        org.telegram.messenger.ij f11;
        TL_stories.StoryItem storyItem2;
        di.y6 P1 = org.telegram.messenger.qp.s1(this.O).P1();
        TL_stories.PeerStories y10 = P1.y(j3);
        di.h7 h7Var = null;
        if (y10 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < y10.stories.size()) {
                    if (y10.stories.get(i10).f27192id == i7) {
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
                storyItem2.dialogId = j3;
                org.telegram.ui.ActionBar.f2 Q = Q();
                if (Q != null) {
                    if (Q instanceof ww) {
                        try {
                            h7Var = di.h7.a(((ww) Q).E0.h);
                        } catch (Exception unused) {
                        }
                    }
                    di.h7 h7Var2 = h7Var;
                    Q.getOrCreateStoryViewer().B();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z9) {
                        Q.getOrCreateStoryViewer().f9577v1 = true;
                    }
                    Q.getOrCreateStoryViewer().M(this, storyItem2, arrayList, 0, null, y10, h7Var2, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            di.q6 A2 = P1.A(0, -1, j3, true);
            if (A2 != null && (f11 = A2.f(i7)) != null) {
                storyItem = f11.f23248l;
            } else {
                A2 = null;
            }
            if (storyItem == null && (A = P1.A(1, -1, j3, true)) != null && (f10 = A.f(i7)) != null) {
                storyItem = f10.f23248l;
                q6Var = A;
            } else {
                q6Var = A2;
            }
            if (storyItem != null && q6Var != null) {
                storyItem.dialogId = j3;
                org.telegram.ui.ActionBar.f2 Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof ww) {
                    try {
                        h7Var = di.h7.a(((ww) Q2).E0.h);
                    } catch (Exception unused2) {
                    }
                }
                di.h7 h7Var3 = h7Var;
                Q2.getOrCreateStoryViewer().B();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z9) {
                    Q2.getOrCreateStoryViewer().f9577v1 = true;
                }
                Q2.getOrCreateStoryViewer().M(this, storyItem, arrayList2, 0, q6Var, null, h7Var3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = org.telegram.messenger.qp.s1(this.O).j1(j3);
        tL_stories_getStoriesByID.f27199id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.B1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i11 = i7;
                final long j10 = j3;
                final boolean z10 = z9;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        TL_stories.StoryItem storyItem3;
                        String str2 = LaunchActivity.B1;
                        TLObject tLObject2 = tLObject;
                        di.h7 h7Var4 = null;
                        if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                            int i12 = 0;
                            while (true) {
                                if (i12 < tL_stories_stories.stories.size()) {
                                    if (tL_stories_stories.stories.get(i12).f27192id == i11) {
                                        storyItem3 = tL_stories_stories.stories.get(i12);
                                        break;
                                    }
                                    i12++;
                                } else {
                                    storyItem3 = null;
                                    break;
                                }
                            }
                            if (storyItem3 != null) {
                                long j11 = j10;
                                storyItem3.dialogId = j11;
                                org.telegram.ui.ActionBar.f2 Q3 = LaunchActivity.Q();
                                if (Q3 == null) {
                                    return;
                                }
                                if (Q3 instanceof ww) {
                                    try {
                                        h7Var4 = di.h7.a(((ww) Q3).E0.h);
                                    } catch (Exception unused3) {
                                    }
                                }
                                di.h7 h7Var5 = h7Var4;
                                Q3.getOrCreateStoryViewer().B();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(Long.valueOf(j11));
                                if (z10) {
                                    Q3.getOrCreateStoryViewer().f9577v1 = true;
                                }
                                Q3.getOrCreateStoryViewer().M(LaunchActivity.this, storyItem3, arrayList3, 0, null, null, h7Var5, false);
                                return;
                            }
                        }
                        org.telegram.ui.Components.hc.X().Q(2131624011, 36, org.telegram.messenger.hd.M0(2131744607, null)).k(false);
                    }
                });
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.j6 j6Var) {
        int i7 = j6Var.f27636f0;
        boolean z9 = false;
        org.telegram.ui.ActionBar.h6 f10 = j6Var.f(tL_theme, this.O, 0);
        j6Var.Z = j6Var.Y;
        j6Var.u(f10.f27516a);
        f10.f27532s = tL_wallPaper;
        if (i7 != j6Var.f27636f0) {
            z9 = true;
        }
        t0(new u71(j6Var, z9, 0, false, false));
    }

    public final void s0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void setRequestedOrientation(int i7) {
        org.telegram.messenger.g0.f22527g = -10;
        org.telegram.messenger.g0.h = -10;
        org.telegram.messenger.g0.f22530i = null;
        super.setRequestedOrientation(i7);
    }

    public final void t0(org.telegram.ui.ActionBar.f2 f2Var) {
        ((ActionBarLayout) M()).S(f2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, boolean z10) {
        return ((ActionBarLayout) M()).V(f2Var, z9, z10);
    }

    public final void v0(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.C0;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) instanceof hi.a3) {
                    hi.a3 a3Var = (hi.a3) arrayList.get(i7);
                    if (a3Var.isShowing() && a3Var.I == j3) {
                        return;
                    }
                }
                i7++;
            } else {
                org.telegram.ui.ActionBar.f2 T = T();
                if (T != null && T.sheetsStack != null) {
                    for (int i10 = 0; i10 < T.sheetsStack.size(); i10++) {
                        if (T.sheetsStack.get(i10).s()) {
                            T.sheetsStack.get(i10);
                        }
                    }
                }
                jx x10 = this.f41275o0.x();
                if (x10 != null && x10.sheetsStack != null) {
                    for (int i11 = 0; i11 < x10.sheetsStack.size(); i11++) {
                        if (x10.sheetsStack.get(i11).s()) {
                            x10.sheetsStack.get(i11);
                        }
                    }
                }
                x70 x70Var = new x70(this, 1);
                TLRPC.User a22 = org.telegram.messenger.qp.s1(this.O).a2(Long.valueOf(j3));
                if (a22 != null) {
                    x70Var.a(a22);
                    return;
                } else {
                    org.telegram.messenger.yr.a0(this.O).f26696a.c(new bi.d3(this, j3, x70Var, 29));
                    return;
                }
            }
        }
    }

    public final void w0(Long l10, q10 q10Var, vf.b bVar, org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.f3 G0 = org.telegram.messenger.qp.s1(this.O).G0();
        if (bVar != null) {
            bVar.d();
        }
        G0.a(l10.longValue(), new t60(this, bVar, q10Var, G0, l10, q1Var));
    }

    public final void x(int i7) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.f41296y1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f41296y1 = null;
        }
        if (i11 >= 26) {
            i10 = getWindow().getNavigationBarColor();
        } else {
            i10 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10, i7);
        this.f41296y1 = ofArgb;
        ofArgb.addUpdateListener(new r60(this, 1));
        this.f41296y1.addListener(new r0(this, i7, 2));
        this.f41296y1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f41296y1.setDuration(320L);
        this.f41296y1.start();
    }

    public final void x0(final int i7, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z9, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z10, final String str22, final int i10, final int i11, final String str23, final String str24, final String str25, String str26, final String str27, final vf.b bVar, final boolean z11, final int i12, final int i13, final int i14, final boolean z12, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final String str29, final boolean z20) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = org.telegram.messenger.qp.s1(i7).q1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str30 = LaunchActivity.B1;
                final vf.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i15 = i7;
                final boolean z21 = z11;
                final boolean z22 = z15;
                final boolean z23 = z16;
                final boolean z24 = z17;
                if (tL_error != null) {
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
                    final boolean z25 = z9;
                    final Integer num3 = num;
                    final Long l12 = l10;
                    final Long l13 = l11;
                    final Integer num4 = num2;
                    final String str43 = str13;
                    final HashMap hashMap2 = hashMap;
                    final String str44 = str14;
                    final String str45 = str15;
                    final String str46 = str16;
                    final String str47 = str17;
                    final TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
                    final String str48 = str18;
                    final String str49 = str19;
                    final String str50 = str20;
                    final String str51 = str21;
                    final boolean z26 = z10;
                    final String str52 = str22;
                    final int i16 = i10;
                    final int i17 = i11;
                    final String str53 = str23;
                    final String str54 = str24;
                    final String str55 = str25;
                    final int i18 = i12;
                    final int i19 = i13;
                    final int i20 = i14;
                    final boolean z27 = z12;
                    final String str56 = str28;
                    final boolean z28 = z18;
                    final boolean z29 = z19;
                    final String str57 = str29;
                    final boolean z30 = z20;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            String str58 = LaunchActivity.B1;
                            LaunchActivity.this.B0(i15, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, z25, num3, l12, l13, num4, str43, hashMap2, str44, str45, str46, str47, tL_wallPaper2, str48, str49, str50, str51, z26, str52, i16, i17, str53, str54, str55, null, null, bVar2, z21, i18, false, i19, i20, null, null, z27, str56, z22, z23, z24, z28, z29, str57, null, z30, null);
                        }
                    });
                    return;
                }
                final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                final Runnable runnable2 = runnable;
                final TLRPC.User user2 = user;
                final String str58 = str27;
                final boolean z31 = z14;
                final boolean z32 = z13;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.ActionBar.f2 f2Var;
                        String str59 = LaunchActivity.B1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.f41256d0;
                        hz hzVar = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList);
                        } else {
                            f2Var = null;
                        }
                        int i21 = i15;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str60 = str58;
                        boolean z33 = z22;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z21;
                        u70 u70Var = new u70(launchActivity2, f2Var, i21, user3, tL_messages_botApp2, atomicBoolean, str60, z33, z34, z35, z36);
                        if (z31) {
                            u70Var.run();
                        } else if (tL_messages_botApp2.inactive && z32) {
                            r3 r3Var = new r3(u70Var, 9);
                            vf.b bVar3 = bVar2;
                            if (bVar3 != null) {
                                hzVar = new hz(bVar3, 16);
                            }
                            vc1.a(launchActivity2, r3Var, hzVar);
                        } else if (!tL_messages_botApp2.request_write_access && !z36) {
                            u70Var.run();
                        } else {
                            org.telegram.ui.Components.v4.m(f2Var, atomicBoolean, user3, u70Var);
                        }
                    }
                });
            }
        });
    }

    @Override
    public final boolean y(org.telegram.ui.ww r49, java.util.ArrayList r50, final java.lang.CharSequence r51, boolean r52, boolean r53, int r54, final int r55, org.telegram.ui.v91 r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.y(org.telegram.ui.ww, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.v91):boolean");
    }

    public final void y0(boolean z9) {
        ActionBarLayout actionBarLayout = this.f41277p0;
        if (actionBarLayout != null) {
            actionBarLayout.X(z9, z9);
        } else {
            this.f41275o0.X(z9, z9);
        }
    }

    public final void z(boolean z9) {
        org.telegram.messenger.h1 e10;
        String str;
        int i7;
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        if (!z9) {
            boolean z10 = org.telegram.messenger.r2.f25199a;
        }
        if (org.telegram.messenger.t0.f25562a.q()) {
            org.telegram.messenger.d1 d1Var = null;
            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25562a).q() && (str = (e10 = org.telegram.messenger.h1.e()).f22776a) != null && (i7 = e10.f22777b) != 0) {
                d1Var = new org.telegram.messenger.d1(str, i7, e10.f22778c);
            }
            boolean z11 = this.n1;
            this.n1 = false;
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25562a;
            g60 g60Var = new g60(this, z11, d1Var, 2);
            if (((ApplicationLoaderImpl) t0Var).q()) {
                org.telegram.messenger.h1.e().a(g60Var, z9);
            }
        } else if (!z9 && Math.abs(System.currentTimeMillis() - org.telegram.messenger.iz.l1) < org.telegram.messenger.qp.s1(0).f24849o3 * 1000) {
        } else {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = org.telegram.messenger.t0.f25563b.getPackageManager().getInstallerPackageName(org.telegram.messenger.t0.f25563b.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            int i10 = this.O;
            ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new bi.j2(this, i10, 8));
        }
    }

    public final int z0(final int i7, final q10 q10Var, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i10, final int i11) {
        int longValue;
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.qp.l1(chat);
        if (num2 != null) {
            longValue = num.intValue();
        } else {
            longValue = (int) l10.longValue();
        }
        tL_messages_getDiscussionMessage.msg_id = longValue;
        return ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.B1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i12 = i7;
                final TLRPC.Chat chat2 = chat;
                final Long l11 = l10;
                final Integer num4 = num2;
                final Integer num5 = num;
                final Runnable runnable2 = runnable;
                final String str3 = str;
                final Integer num6 = num3;
                final byte[] bArr2 = bArr;
                final int i13 = i10;
                final int i14 = i11;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final Runnable runnable3 = q10Var;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j70.run():void");
                    }
                });
            }
        });
    }

    @Override
    public final void e(int[] iArr) {
    }
}
