package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureUiState;
import android.content.ClipData;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
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
import org.telegram.messenger.MediaController;
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
public class LaunchActivity extends g5 implements org.telegram.ui.ActionBar.l4, org.telegram.messenger.is, sw {
    public static final String C1 = UUID.randomUUID().toString();
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static LaunchActivity H1;
    public static Pattern I1;
    public static z J1;
    public static LaunchActivity K1;
    public di.lc A1;
    public org.telegram.ui.Components.ny0 B0;
    public int B1;
    public org.telegram.ui.Components.q9 C0;
    public org.telegram.ui.ActionBar.t1 E0;
    public View F0;
    public org.telegram.ui.ActionBar.t1 G0;
    public boolean H0;
    public HashMap I0;
    public HashMap J0;
    public Intent K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public String P0;
    public String Q0;
    public boolean R;
    public TLRPC.TL_wallPaper R0;
    public String S;
    public org.telegram.ui.ActionBar.i6 S0;
    public String T;
    public TLRPC.TL_theme T0;
    public CharSequence U;
    public boolean U0;
    public ArrayList V;
    public org.telegram.ui.ActionBar.t1 V0;
    public ArrayList W;
    public ArrayList X;
    public boolean X0;
    public Uri Y;
    public bi.h6 Y0;
    public String Z;
    public m4 Z0;
    public ArrayList f42622a0;
    public ArrayList f42624b0;
    public Uri f42626c0;
    public int f42628d0;
    public org.telegram.messenger.n6 f42631e1;
    public androidx.mediarouter.app.f f42633f1;
    public rh.d f42635g1;
    public x70 f42636h0;
    public boolean f42637h1;
    public ArrayList f42638i0;
    public bg.b0 f42639i1;
    public ArrayList f42640j0;
    public t80 f42641j1;
    public String f42642k0;
    public u80 f42643k1;
    public ActionMode f42644l0;
    public boolean l1;
    public boolean m0;
    public xi.e f42645m1;
    public org.telegram.ui.Components.zz0 f42646n0;
    public xi.e n1;
    public kg.k f42647o0;
    public ActionBarLayout f42649p0;
    public w70 f42650p1;
    public ActionBarLayout f42651q0;
    public hi.g7 f42652q1;
    public ActionBarLayout f42653r0;
    public boolean f42654r1;
    public v80 f42655s0;
    public ViewGroup f42656s1;
    public FrameLayout f42657t0;
    public final ei0 f42658t1;
    public v8 f42659u0;
    public org.telegram.ui.ActionBar.t1 f42660u1;
    public k0 f42661v0;
    public org.telegram.ui.ActionBar.t1 f42662v1;
    public r80 f42663w0;
    public boolean f42664w1;
    public org.telegram.ui.ActionBar.j3 f42665x0;
    public long f42666x1;
    public org.telegram.ui.ActionBar.l3 f42667y0;
    public int[] f42668y1;
    public org.telegram.ui.Components.hc0 f42669z0;
    public ValueAnimator f42670z1;
    public final ArrayList Q = new ArrayList();
    public final ArrayList f42630e0 = new ArrayList();
    public final ArrayList f42632f0 = new ArrayList();
    public final ArrayList f42634g0 = new ArrayList();
    public final ArrayList A0 = new ArrayList();
    public final ArrayList D0 = new ArrayList();
    public boolean W0 = false;
    public final ArrayList f42623a1 = new ArrayList();
    public final SparseIntArray f42625b1 = new SparseIntArray();
    public int f42627c1 = 5934;
    public final p80 f42629d1 = new Object();
    public boolean f42648o1 = true;

    public LaunchActivity() {
        System.identityHashCode(this);
        this.f42658t1 = new ei0(this);
        this.B1 = 0;
    }

    public static void C0(org.telegram.messenger.c cVar, yw ywVar, CharSequence charSequence, long j3, org.telegram.messenger.gj gjVar, long j10, boolean z10, int i7, int i10) {
        boolean z11;
        org.telegram.ui.Components.to0 to0Var;
        org.telegram.ui.Components.to0 to0Var2;
        int i11 = cVar.f22778a;
        if (ywVar != null && (to0Var2 = ywVar.I2) != null && !to0Var2.f39761n) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z11 && ywVar != null && (to0Var = ywVar.I2) != null) {
            webPage = to0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z11) {
                org.telegram.messenger.ez.a0(cVar, charSequence, j3, j10, z10, i7, i10);
                return;
            }
            CharSequence H = org.telegram.messenger.ez.H(charSequence);
            if (H != null && H.length() != 0) {
                CharSequence[] charSequenceArr = {H};
                org.telegram.messenger.ez.C(i11).r0(org.telegram.messenger.cz.b(charSequenceArr[0].toString(), j3, gjVar, gjVar, webPage2, z11, org.telegram.messenger.si.b0(i11).W(charSequenceArr, true, true), null, null, z10, i7, i10, null, false));
            }
        }
    }

    public static void D(int i7) {
        LaunchActivity launchActivity = K1;
        if (launchActivity != null) {
            launchActivity.C(i7);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i7, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        String F12;
        org.telegram.ui.ActionBar.e2 Q = Q();
        if (Q != null) {
            long j3 = tL_attachMenuBot.bot_id;
            ki.k4 b10 = ki.k4.b(i7, j3, j3, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.N() != null && launchActivity.N().k(b10) != null) {
                return;
            }
            TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(tL_attachMenuBot.bot_id));
            if (a22 == null) {
                F12 = null;
            } else {
                F12 = org.telegram.messenger.np.s1(i7).F1(a22.restriction_reason);
            }
            if (!TextUtils.isEmpty(F12)) {
                org.telegram.messenger.np.s1(i7);
                org.telegram.messenger.np.S4(F12, Q);
                return;
            }
            ki.x2 x2Var = new ki.x2(launchActivity, Q.getResourceProvider());
            x2Var.C0 = false;
            x2Var.B(z10);
            x2Var.m0 = launchActivity;
            x2Var.x(Q, b10);
            x2Var.show();
        }
    }

    public static void J() {
        kx kxVar;
        ArrayList<org.telegram.ui.ActionBar.a2> arrayList;
        org.telegram.ui.ActionBar.e2 T = T();
        if (T != null) {
            if (T.getParentLayout() instanceof ActionBarLayout) {
                kxVar = ((ActionBarLayout) T.getParentLayout()).x();
            } else {
                kxVar = null;
            }
            if (kxVar != null && (arrayList = kxVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    kxVar.sheetsStack.get(size).a(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.a2> arrayList2 = T.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    T.sheetsStack.get(size2).a(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = ki.x2.f18648b1.iterator();
            while (it.hasNext()) {
                arrayList3.add((ki.x2) it.next());
            }
            int size3 = arrayList3.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj = arrayList3.get(i7);
                i7++;
                ((ki.x2) obj).o(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.e2 L() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f29963b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.o4) i5.c.h(1, H1.Q))).t();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return ((ActionBarLayout) H1.M()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.e2 Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f29963b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.o4) i5.c.h(1, H1.Q)).getLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return H1.M().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.e2 T() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f29963b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.o4) i5.c.h(1, H1.Q)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return H1.M().getSafeLastFragment();
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
        di.lc lcVar;
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((lcVar = launchActivity.A1) == null || ((View) lcVar.f6112a) != decorView)) {
                launchActivity.A1 = new di.lc(decorView);
            }
            di.lc lcVar2 = launchActivity.A1;
            if (lcVar2 != null) {
                View view = (View) lcVar2.f6112a;
                ArrayList arrayList = lcVar2.f9005b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(a8.t9.a(0.0f, 0.0f, f10, f11), a8.t9.a(view.getWidth(), 0.0f, f10, f11)), Math.max(a8.t9.a(0.0f, view.getHeight(), f10, f11), a8.t9.a(view.getWidth(), view.getHeight(), f10, f11))) * 2.0f) / (org.telegram.messenger.g0.f23608p * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    di.kc kcVar = new di.kc(f10, f11, f12);
                    ofFloat.addUpdateListener(new ch.v(1, lcVar2, kcVar));
                    ofFloat.addListener(new ah.l(1, lcVar2, kcVar));
                    ofFloat.setInterpolator(org.telegram.ui.Components.er.f34421g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(kcVar);
                    lcVar2.f1();
                    ofFloat.start();
                }
            }
        }
    }

    public final void A() {
        if (this.P == org.telegram.messenger.m10.f24934t0 && this.f42645m1 != null) {
            return;
        }
        xi.e eVar = this.f42645m1;
        if (eVar != null) {
            eVar.b();
            this.f42645m1 = null;
        }
        int i7 = org.telegram.messenger.m10.f24934t0;
        this.P = i7;
        xi.e eVar2 = new xi.e(org.telegram.messenger.ns.f(i7), this);
        eVar2.c(org.telegram.messenger.ns.f25539n3);
        eVar2.c(org.telegram.messenger.ns.I2);
        eVar2.c(org.telegram.messenger.ns.f25516j0);
        eVar2.c(org.telegram.messenger.ns.W4);
        eVar2.c(org.telegram.messenger.ns.T1);
        eVar2.c(org.telegram.messenger.ns.M0);
        eVar2.c(org.telegram.messenger.ns.R0);
        eVar2.c(org.telegram.messenger.ns.f25476c1);
        eVar2.c(org.telegram.messenger.ns.Q);
        eVar2.c(org.telegram.messenger.ns.N0);
        eVar2.c(org.telegram.messenger.ns.Y1);
        eVar2.c(org.telegram.messenger.ns.Z1);
        eVar2.c(org.telegram.messenger.ns.f25587v1);
        eVar2.c(org.telegram.messenger.ns.f25595w2);
        eVar2.c(org.telegram.messenger.ns.f25601x1);
        eVar2.c(org.telegram.messenger.ns.f25515i5);
        eVar2.c(org.telegram.messenger.ns.f25497f5);
        eVar2.c(org.telegram.messenger.ns.f25565r5);
        eVar2.c(org.telegram.messenger.ns.Q5);
        this.f42645m1 = eVar2;
    }

    public final void A0(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.A0(android.net.Uri):void");
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f42639i1 == null && org.telegram.messenger.gz.f23969p) {
                this.f42639i1 = bg.b0.b(this, this.f42661v0);
            }
            bg.b0 b0Var = this.f42639i1;
            if (b0Var != null && !org.telegram.messenger.gz.f23969p) {
                b0Var.c();
                this.f42639i1 = null;
            }
        }
    }

    public final void B0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final vf.b r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.B0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, vf.b, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void C(int i7) {
        K1 = this;
        Set set = org.telegram.messenger.z0.f27858a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - org.telegram.messenger.gz.H) >= 86400) {
            org.telegram.messenger.gz.H = currentTimeMillis;
            Utilities.f22417f.c(new org.telegram.messenger.x0(currentTimeMillis, org.telegram.messenger.w7.j(4), 0));
        }
        if (org.telegram.messenger.r2.f26198a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - org.telegram.messenger.gz.I) >= 3600) {
                org.telegram.messenger.gz.I = currentTimeMillis2;
                Utilities.f22417f.c(new jg.x(currentTimeMillis2, 7));
            }
        }
        if ((Build.VERSION.SDK_INT >= 26 && i7 == 0) || this.f42664w1) {
            return;
        }
        Utilities.f22416e.d(new r70(this, i7, 1), 2000L);
    }

    public final void D0(int i7) {
        this.f42667y0.setInternalNavigationBarColor(i7);
        org.telegram.ui.ActionBar.c3 N = N();
        if (N != null) {
            N.setNavigationBarColor(i7);
        }
    }

    public final void E() {
        int i7;
        boolean z10;
        if (org.telegram.messenger.g0.Q1() && this.f42653r0 != null) {
            Boolean bool = org.telegram.messenger.g0.L;
            int i10 = 0;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (org.telegram.messenger.t0.f26600b != null && org.telegram.messenger.t0.f26600b.getResources().getBoolean(2131034114)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (booleanValue != z10) {
                    return;
                }
            }
            if (!org.telegram.messenger.g0.E && (!org.telegram.messenger.g0.P1() || getResources().getConfiguration().orientation == 2)) {
                this.N0 = false;
                List<org.telegram.ui.ActionBar.e2> fragmentStack = this.f42649p0.getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    while (1 < fragmentStack.size()) {
                        org.telegram.ui.ActionBar.e2 e2Var = fragmentStack.get(1);
                        if (e2Var instanceof an) {
                            an anVar = (an) e2Var;
                            anVar.f45270l5 = true;
                            anVar.f45282m5 = true;
                        }
                        e2Var.onPause();
                        e2Var.onFragmentDestroy();
                        e2Var.setParentLayout(null);
                        fragmentStack.remove(e2Var);
                        this.f42653r0.c(-1, e2Var);
                    }
                    org.telegram.ui.Components.hc0 hc0Var = this.f42669z0;
                    if (hc0Var == null || hc0Var.f35225b.getVisibility() != 0) {
                        this.f42649p0.X(true, true);
                        this.f42653r0.X(true, true);
                    }
                }
                ViewGroup view = this.f42653r0.getView();
                if (this.f42653r0.getFragmentStack().isEmpty()) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                view.setVisibility(i7);
                v8 v8Var = this.f42659u0;
                if (!this.f42653r0.getFragmentStack().isEmpty()) {
                    i10 = 8;
                }
                v8Var.setVisibility(i10);
                return;
            }
            this.N0 = true;
            List<org.telegram.ui.ActionBar.e2> fragmentStack2 = this.f42653r0.getFragmentStack();
            if (!fragmentStack2.isEmpty()) {
                while (fragmentStack2.size() > 0) {
                    org.telegram.ui.ActionBar.e2 e2Var2 = fragmentStack2.get(0);
                    if (e2Var2 instanceof an) {
                        an anVar2 = (an) e2Var2;
                        anVar2.f45270l5 = true;
                        anVar2.f45282m5 = true;
                    }
                    e2Var2.onPause();
                    e2Var2.onFragmentDestroy();
                    e2Var2.setParentLayout(null);
                    fragmentStack2.remove(e2Var2);
                    this.f42649p0.c(-1, e2Var2);
                }
                org.telegram.ui.Components.hc0 hc0Var2 = this.f42669z0;
                if (hc0Var2 == null || hc0Var2.f35225b.getVisibility() != 0) {
                    this.f42649p0.X(true, true);
                }
            }
            this.f42653r0.getView().setVisibility(8);
            v8 v8Var2 = this.f42659u0;
            if (!this.f42649p0.getFragmentStack().isEmpty()) {
                i10 = 8;
            }
            v8Var2.setVisibility(i10);
        }
    }

    public final void E0() {
        org.telegram.ui.ActionBar.l3 l3Var;
        ViewGroup view;
        int i7;
        if (this.f42667y0.indexOfChild(this.f42655s0) != -1) {
            l3Var = this.f42667y0;
            view = this.f42655s0;
        } else {
            l3Var = this.f42667y0;
            view = this.f42649p0.getView();
        }
        int indexOfChild = l3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f42667y0.removeViewAt(indexOfChild);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            v80 v80Var = new v80(this, this);
            this.f42655s0 = v80Var;
            if (indexOfChild != -1) {
                this.f42667y0.addView(v80Var, indexOfChild, c8.ja.c(-1.0f, -1));
            } else {
                this.f42667y0.addView(v80Var, c8.ja.c(-1.0f, -1));
            }
            v8 v8Var = new v8(this, null);
            this.f42659u0 = v8Var;
            v8Var.setOccupyStatusBar(false);
            this.f42659u0.U(org.telegram.ui.ActionBar.j6.s0());
            this.f42655s0.addView(this.f42659u0, c8.ja.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.f42649p0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f42649p0.getView());
            }
            this.f42655s0.addView(this.f42649p0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f42653r0 = actionBarLayout;
            actionBarLayout.U0 = true;
            actionBarLayout.setFragmentStack(this.f42634g0);
            this.f42653r0.setDelegate(this);
            this.f42655s0.addView(this.f42653r0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f42657t0 = frameLayout;
            ArrayList arrayList = this.f42632f0;
            int i10 = 8;
            if (arrayList.isEmpty()) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            frameLayout.setVisibility(i7);
            this.f42657t0.setBackgroundColor(1056964608);
            this.f42655s0.addView(this.f42657t0);
            this.f42657t0.setOnTouchListener(new c0(this, 3));
            this.f42657t0.setOnClickListener(new bi.o(21));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f42651q0 = actionBarLayout2;
            actionBarLayout2.T0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f42651q0.setBackgroundView(this.f42657t0);
            this.f42651q0.setUseAlphaAnimations(true);
            this.f42651q0.setFragmentStack(arrayList);
            this.f42651q0.setDelegate(this);
            this.f42651q0.setDrawerLayoutContainer(this.f42667y0);
            ViewGroup view2 = this.f42651q0.getView();
            if (!arrayList.isEmpty()) {
                i10 = 0;
            }
            view2.setVisibility(i10);
            this.f42655s0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f42649p0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f42649p0.getView());
            }
            this.f42649p0.setFragmentStack(this.f42630e0);
            if (indexOfChild != -1) {
                this.f42667y0.addView(this.f42649p0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f42667y0.addView(this.f42649p0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        c8.pb.a(this, org.telegram.messenger.gz.f23994x1, false);
    }

    public final void F(boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.ActionBar.e2 e2Var;
        int x02;
        ym ymVar;
        boolean z13;
        ArrayList arrayList = this.f42630e0;
        boolean z14 = true;
        if (!arrayList.isEmpty()) {
            e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList);
        } else {
            e2Var = null;
        }
        char c10 = 2;
        if (e2Var != null && (e2Var.isRemovingFromStack() || e2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(2, arrayList);
            } else {
                e2Var = null;
            }
        }
        if (e2Var != null) {
            e2Var.hasForceLightStatusBar();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (z11) {
            if (e2Var != null) {
                z13 = e2Var.isLightStatusBar();
                if (e2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) e2Var.getParentLayout();
                    if (actionBarLayout.x() != null && actionBarLayout.x().getLastSheet() != null) {
                        org.telegram.ui.ActionBar.a2 lastSheet = actionBarLayout.x().getLastSheet();
                        if (lastSheet.s()) {
                            z13 = lastSheet.f();
                        }
                    } else {
                        ArrayList<org.telegram.ui.ActionBar.a2> arrayList2 = e2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) i5.c.h(1, e2Var.sheetsStack);
                            if (a2Var.s()) {
                                z13 = a2Var.f();
                            }
                        }
                    }
                }
            } else {
                z13 = i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29129s8, true)) > 0.699999988079071d;
            }
            org.telegram.messenger.g0.p3(this, z13);
        }
        if (i7 >= 26 && z12 && (!z10 || e2Var == null || !e2Var.isInPreviewMode())) {
            if (e2Var != null && z10) {
                x02 = e2Var.getNavigationBarColor();
            } else {
                x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, true);
            }
            if (e2Var instanceof an) {
                an anVar = (an) e2Var;
                if (!anVar.f45225hc || (anVar.f45403w.f56036s != 1 && ((ymVar = anVar.Aa) == null || !ymVar.f53555q))) {
                    c10 = 1;
                }
            } else {
                c10 = 0;
            }
            if (N() != null && N().I > 0) {
                c10 = 0;
            }
            if (this.f42649p0.x() != null) {
                kx x10 = this.f42649p0.x();
                if (x10.sheetsStack != null) {
                    for (int i10 = 0; i10 < x10.sheetsStack.size(); i10++) {
                        org.telegram.ui.ActionBar.a2 a2Var2 = x10.sheetsStack.get(i10);
                        if (a2Var2.y()) {
                            x02 = a2Var2.e(x02);
                            c10 = 0;
                        }
                    }
                }
            }
            Iterator it = ki.x2.f18648b1.iterator();
            while (it.hasNext()) {
                x02 = ((ki.x2) it.next()).e(x02);
                c10 = 0;
            }
            D0(x02);
            if ((c10 != 0 || org.telegram.messenger.g0.B(x02) < 0.721f) && c10 != 1) {
                z14 = false;
            }
            org.telegram.messenger.g0.m3(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final org.telegram.ui.ActionBar.t1 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
            p10.setCanceledOnTouchOutside(true);
            p10.setOnDismissListener(new di.a3(11, this, p10));
            this.D0.add(p10);
            return p10;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    public final void G(boolean z10) {
        org.telegram.messenger.r3 r3Var;
        long j3;
        boolean z11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z12 = false;
        if (sharedInstance != null && (r3Var = sharedInstance.groupCall) != null) {
            boolean z13 = this.m0;
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
                j3 = org.telegram.messenger.m10.i(this.P).f24953n;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j3);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && groupCallParticipant.raise_hand_rating != 0) {
                z12 = true;
            }
            this.m0 = z12;
            if (!z10 && z13 && !z12 && !z11 && c40.C5 == null) {
                N0(38);
                return;
            }
            return;
        }
        this.m0 = false;
    }

    @Override
    public final boolean H() {
        ArrayList arrayList = this.V;
        if ((arrayList != null && arrayList.size() == 1) || this.S != null) {
            return true;
        }
        return false;
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.e2 e2Var;
        ArrayList arrayList = this.f42632f0;
        if (!arrayList.isEmpty()) {
            e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f42634g0;
            if (!arrayList2.isEmpty()) {
                e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.f42630e0;
                if (!arrayList3.isEmpty()) {
                    e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList3);
                } else {
                    e2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.cc.a(e2Var)) {
            aVar.a(org.telegram.ui.Components.cc.a0(e2Var)).j();
        }
    }

    public final void I() {
        ArrayList arrayList = this.f42630e0;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.e2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (org.telegram.messenger.g0.Q1()) {
            ArrayList arrayList2 = this.f42632f0;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((org.telegram.ui.ActionBar.e2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f42634g0;
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                ((org.telegram.ui.ActionBar.e2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void I0() {
        String str;
        String str2;
        char c10;
        org.telegram.messenger.dd ddVar;
        if (org.telegram.messenger.m10.i(this.P).p()) {
            try {
                if (!this.H0 && !org.telegram.messenger.t0.f26608x) {
                    String string = org.telegram.messenger.np.e1().getString("language_showed2", "");
                    final String str3 = org.telegram.messenger.np.s1(this.P).P3;
                    if (string.equals(str3)) {
                        if (org.telegram.messenger.r2.f26198a) {
                            org.telegram.messenger.a8.b("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final org.telegram.messenger.dd[] ddVarArr = new org.telegram.messenger.dd[2];
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
                            org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) org.telegram.messenger.hd.E0().J.get(i7);
                            c10 = c11;
                            if (ddVar2.f23060c.equals("en")) {
                                ddVarArr[c10] = ddVar2;
                            }
                            if (ddVar2.f23060c.replace("_", "-").equals(str3) || ddVar2.f23060c.equals(str) || ddVar2.f23060c.equals(str2)) {
                                ddVarArr[1] = ddVar2;
                            }
                            if (ddVarArr[c10] != null && ddVarArr[1] != null) {
                                break;
                            }
                            i7++;
                            c11 = c10;
                        } else {
                            c10 = c11;
                            break;
                        }
                    }
                    org.telegram.messenger.dd ddVar3 = ddVarArr[c10];
                    if (ddVar3 != null && (ddVar = ddVarArr[1]) != null && ddVar3 != ddVar) {
                        if (org.telegram.messenger.r2.f26198a) {
                            org.telegram.messenger.a8.b("show lang alert for " + ddVarArr[c10].b() + " and " + ddVarArr[1].b());
                        }
                        this.I0 = null;
                        this.J0 = null;
                        this.H0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = ddVarArr[1].c();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) {
                            public final LaunchActivity f53902b;

                            {
                                this.f53902b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i10 = 0;
                                switch (r4) {
                                    case 0:
                                        String str4 = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i10 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i10);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f53902b;
                                        final org.telegram.messenger.dd[] ddVarArr2 = ddVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.I0 = hashMap2;
                                                        if (launchActivity2.J0 != null && hashMap2 != null) {
                                                            org.telegram.messenger.dd[] ddVarArr3 = ddVarArr2;
                                                            launchActivity2.J0(ddVarArr3[1], ddVarArr3[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.I0 != null) {
                                                            org.telegram.messenger.dd[] ddVarArr4 = ddVarArr2;
                                                            launchActivity3.J0(ddVarArr4[1], ddVarArr4[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        String str6 = LaunchActivity.C1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i10 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i10);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f53902b;
                                        final org.telegram.messenger.dd[] ddVarArr3 = ddVarArr;
                                        final String str7 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.dd[] ddVarArr32 = ddVarArr3;
                                                            launchActivity22.J0(ddVarArr32[1], ddVarArr32[0], str7);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.I0 != null) {
                                                            org.telegram.messenger.dd[] ddVarArr4 = ddVarArr3;
                                                            launchActivity3.J0(ddVarArr4[1], ddVarArr4[0], str7);
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
                        tL_langpack_getStrings2.lang_code = ddVarArr[c10].c();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {
                            public final LaunchActivity f53902b;

                            {
                                this.f53902b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i10 = 0;
                                switch (r4) {
                                    case 0:
                                        String str4 = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i10 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i10);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f53902b;
                                        final org.telegram.messenger.dd[] ddVarArr2 = ddVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.dd[] ddVarArr32 = ddVarArr2;
                                                            launchActivity22.J0(ddVarArr32[1], ddVarArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.I0 != null) {
                                                            org.telegram.messenger.dd[] ddVarArr4 = ddVarArr2;
                                                            launchActivity3.J0(ddVarArr4[1], ddVarArr4[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        String str6 = LaunchActivity.C1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i10 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i10);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f53902b;
                                        final org.telegram.messenger.dd[] ddVarArr3 = ddVarArr;
                                        final String str7 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.dd[] ddVarArr32 = ddVarArr3;
                                                            launchActivity22.J0(ddVarArr32[1], ddVarArr32[0], str7);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.I0 != null) {
                                                            org.telegram.messenger.dd[] ddVarArr4 = ddVarArr3;
                                                            launchActivity3.J0(ddVarArr4[1], ddVarArr4[0], str7);
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

    public final void J0(org.telegram.messenger.dd r18, org.telegram.messenger.dd r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.J0(org.telegram.messenger.dd, org.telegram.messenger.dd, java.lang.String):void");
    }

    public final java.util.ArrayList K(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.K(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void K0(boolean z10, boolean z11, int i7, int i10, bh bhVar) {
        if (this.f42667y0 != null && !isFinishing()) {
            if (this.f42669z0 == null) {
                this.f42669z0 = new org.telegram.ui.Components.hc0(this);
            }
            org.telegram.messenger.gz.f23992x = true;
            int i11 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f43308s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, true);
            } else if (g4.G() && g4.v().W) {
                g4.v().m(false, true);
            }
            hi.sa.w();
            org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
            if (gjVar != null && gjVar.h4()) {
                MediaController.B().q(true, true, false, false);
            }
            this.f42669z0.show();
            org.telegram.ui.Components.gc0 gc0Var = this.f42669z0.f35225b;
            ArrayList arrayList = this.A0;
            arrayList.isEmpty();
            gc0Var.m(z11, i7, i10, new g50(11, this, bhVar));
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) arrayList.get(i12);
                if (z10) {
                    int size = arrayList.size() - 1;
                }
                fc0Var.m(z11, i7, i10, null);
            }
            org.telegram.messenger.gz.C = true;
            e80 e80Var = new e80(this);
            this.f42669z0.f35225b.setDelegate(e80Var);
            int size2 = arrayList.size();
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((org.telegram.ui.Components.fc0) obj).setDelegate(e80Var);
            }
            try {
                org.telegram.messenger.at.t(org.telegram.messenger.m10.f24934t0).Y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void L0(int i7, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f10;
        if (this.B0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, frameLayout, null);
            int i10 = org.telegram.messenger.g0.f23603m;
            if (i10 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i10));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(2131231644);
            linearLayout.addView(imageView, c8.ja.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.messenger.k5.m(textView, i11, null, 1, 17.0f);
            textView.setText(org.telegram.messenger.hd.M0(2131746782, null));
            linearLayout.addView(textView, c8.ja.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f37754a = textView2;
            org.telegram.ui.ActionBar.q6.U(textView2, i11, null);
            org.telegram.ui.ActionBar.q6.G(textView2, org.telegram.ui.ActionBar.j6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(false));
            textView2.setGravity(51);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            linearLayout.addView(textView2, c8.ja.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f10 = 4.0f;
            scrollView.setPadding(org.telegram.messenger.g0.L(24.0f), i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, c8.ja.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(org.telegram.messenger.hd.M0(2131751604, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i12 = org.telegram.ui.ActionBar.j6.f29241y6;
            org.telegram.ui.ActionBar.q6.U(textView3, i12, null);
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.y J0 = org.telegram.ui.ActionBar.j6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.j6.x0(null, i12, false));
            org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i12, 25);
            textView3.setBackground(J0);
            org.telegram.ui.ActionBar.q6.j(textView3, J0, null, g10, null);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f));
            frameLayout.addView(textView3, c8.ja.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    ny0 ny0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.hd.M0(2131744198, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751602, null), new ly0(ny0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131753756, null), null);
                            t1Var.U = org.telegram.messenger.hd.M0(2131743975, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (ny0Var.f37756c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.hd.M0(2131743978, null);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                t1Var2.S = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131754306, null), new ly0(ny0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                t1Var2.U = org.telegram.messenger.hd.a0("TosAgeText", null, 2131743979, org.telegram.messenger.hd.G(ny0Var.f37756c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            ny0Var.a();
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
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            frameLayout.addView(textView4, c8.ja.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    ny0 ny0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.hd.M0(2131744198, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751602, null), new ly0(ny0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131753756, null), null);
                            t1Var.U = org.telegram.messenger.hd.M0(2131743975, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (ny0Var.f37756c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.hd.M0(2131743978, null);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                t1Var2.S = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131754306, null), new ly0(ny0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                t1Var2.U = org.telegram.messenger.hd.a0("TosAgeText", null, 2131743979, org.telegram.messenger.hd.G(ny0Var.f37756c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            ny0Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view2, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.B0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f42667y0.addView(this.B0, c8.ja.c(-1.0f, -1));
            this.B0.setDelegate(new k80(this));
        } else {
            f10 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = org.telegram.messenger.m10.i(i7).f24937a0;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f28108id.data.equals(tL_help_termsOfService.f28108id.data))) {
            org.telegram.messenger.m10.i(i7).f24937a0 = tL_help_termsOfService;
            org.telegram.messenger.m10.i(i7).v(false);
        }
        org.telegram.ui.Components.ny0 ny0Var = this.B0;
        if (ny0Var.getVisibility() != 0) {
            ny0Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        org.telegram.messenger.gj.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i13 = 0; i13 < length; i13++) {
            if (spannableStringBuilder.charAt(i13) == '\n') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == '-') {
                    int i15 = i13 + 2;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        org.telegram.ui.Components.ka kaVar = new org.telegram.ui.Components.ka(L2, L3);
                        spannableStringBuilder.replace(i14, i13 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(kaVar, i14, i15, 33);
                    }
                }
            }
        }
        ny0Var.f37754a.setText(spannableStringBuilder);
        ny0Var.f37756c = tL_help_termsOfService;
        ny0Var.d = i7;
        this.B0.animate().alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.F).setListener(null).start();
    }

    public final org.telegram.ui.ActionBar.o4 M() {
        ActionBarLayout actionBarLayout = this.f42649p0;
        ArrayList arrayList = this.Q;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.o4) i5.c.h(1, arrayList);
        }
        return actionBarLayout;
    }

    public final void M0(int i7, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        if (this.C0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
            frameLayout.f38588x = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.x0(null, i10, false), 0});
            frameLayout.f38589y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.j6.x0(null, i10, false), 0});
            org.telegram.ui.ActionBar.q6.h(i10, frameLayout, null);
            int i11 = (int) (org.telegram.messenger.g0.f23603m / org.telegram.messenger.g0.f23608p);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f23603m));
            ?? imageView = new ImageView(this);
            imageView.f(2131624168, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().K(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(14.0f));
            frameLayout2.addView((View) imageView, c8.ja.d(-2, -2.0f, 17, 0.0f, i11, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.p9(frameLayout));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f38583f = scrollView;
            org.telegram.messenger.g0.y3(scrollView, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29129s8, false));
            scrollView.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, c8.ja.d(-1, -1.0f, 51, 27.0f, i11 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.U(textView, i12, null);
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.M0(2131743816, null));
            frameLayout3.addView(textView, c8.ja.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f38579a = textView2;
            org.telegram.ui.ActionBar.q6.U(textView2, i12, null);
            org.telegram.ui.ActionBar.q6.G(textView2, org.telegram.ui.ActionBar.j6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(false));
            textView2.setGravity(49);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            frameLayout3.addView(textView2, c8.ja.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            bi.g2 g2Var = new bi.g2(this, 13);
            frameLayout.d = g2Var;
            g2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            g2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
            g2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            frameLayout.addView(g2Var, c8.ja.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            g2Var.setOnClickListener(new org.telegram.ui.Components.p9(frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f38580b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            g2Var.addView(textView3, c8.ja.e(-2, -2, 17));
            bi.g2 g2Var2 = new bi.g2(14, this, (Object) frameLayout);
            frameLayout.f38581c = g2Var2;
            g2Var2.setWillNotDraw(false);
            g2Var2.setAlpha(0.0f);
            g2Var2.setScaleX(0.1f);
            g2Var2.setScaleY(0.1f);
            g2Var2.setVisibility(4);
            org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(g2Var2);
            frameLayout.f38582e = gh0Var;
            gh0Var.d(null, true, false);
            gh0Var.f34980o = -1;
            g2Var.addView(g2Var2, c8.ja.e(36, 36, 17));
            this.C0 = frameLayout;
            this.f42667y0.addView((View) frameLayout, c8.ja.c(-1.0f, -1));
        }
        org.telegram.ui.Components.q9 q9Var = this.C0;
        TextView textView4 = q9Var.f38580b;
        q9Var.f38587w = 0;
        q9Var.f38584n = tL_help_appUpdate;
        q9Var.f38586s = i7;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            q9Var.f38585r = org.telegram.messenger.w7.r(null, document);
        }
        if (q9Var.getVisibility() != 0) {
            q9Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        org.telegram.messenger.gj.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
        q9Var.f38579a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            textView4.setText(org.telegram.messenger.hd.M0(2131743822, null) + String.format(Locale.US, " (%1$s)", org.telegram.messenger.g0.i0(tL_help_appUpdate.document.size, false, false)));
        } else {
            textView4.setText(org.telegram.messenger.hd.M0(2131743822, null));
        }
        org.telegram.messenger.ns.f(q9Var.f38586s).c(q9Var, org.telegram.messenger.ns.Y1);
        org.telegram.messenger.ns.f(q9Var.f38586s).c(q9Var, org.telegram.messenger.ns.Z1);
        org.telegram.messenger.ns.f(q9Var.f38586s).c(q9Var, org.telegram.messenger.ns.X1);
        if (z10) {
            org.telegram.messenger.t0.u();
        }
    }

    public final org.telegram.ui.ActionBar.c3 N() {
        ActionBarLayout actionBarLayout = this.f42653r0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f42653r0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.f42649p0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.f42649p0.getBottomSheetTabs();
        }
        return null;
    }

    public final void N0(int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.f42630e0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.e2 e2Var = this.f42649p0.getFragmentStack().get(this.f42649p0.getFragmentStack().size() - 1);
            if (e2Var instanceof je0) {
                e2Var = ((je0) e2Var).c0();
            }
            UndoView undoView = null;
            if (e2Var instanceof an) {
                an anVar = (an) e2Var;
                if (chat != null && anVar.a() == (-chat.f28051id)) {
                    chat = null;
                }
                anVar.h8();
                undoView = anVar.N3;
            } else if (e2Var instanceof yw) {
                undoView = ((yw) e2Var).k4();
            } else if (e2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) e2Var).M;
            }
            if (undoView != null) {
                undoView.m(0L, chat, i7);
            }
            if (i7 == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    public final org.telegram.ui.ActionBar.e2 O() {
        if (ce0.B1(this.P, false).getInt("currentViewNum", 0) != 0) {
            return new ce0();
        }
        return new t50();
    }

    public final void O0(int i7) {
        P0(i7, new t70(1));
    }

    @Override
    public final boolean P(org.telegram.ui.yw r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.P(org.telegram.ui.yw):boolean");
    }

    public final void P0(int i7, org.telegram.messenger.j9 j9Var) {
        if (i7 != org.telegram.messenger.m10.f24934t0 && org.telegram.messenger.m10.r(i7)) {
            this.l1 = true;
            ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
            org.telegram.messenger.m10.f24934t0 = i7;
            org.telegram.messenger.m10.i(0).v(false);
            A();
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25479c4, Integer.valueOf(i7));
            if (org.telegram.messenger.g0.Q1()) {
                this.f42651q0.a0();
                this.f42653r0.a0();
                if (!this.N0) {
                    if (this.f42653r0.getFragmentStack().isEmpty()) {
                        this.f42659u0.setVisibility(0);
                    }
                    this.f42653r0.getView().setVisibility(8);
                }
                this.f42651q0.getView().setVisibility(8);
            }
            this.f42649p0.a0();
            this.f42649p0.c(-3, (je0) j9Var.o(null));
            this.f42649p0.X(true, true);
            if (org.telegram.messenger.g0.Q1()) {
                this.f42651q0.X(true, true);
                this.f42653r0.X(true, true);
            }
            if (!org.telegram.messenger.t0.f26608x) {
                ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
            }
            if (org.telegram.messenger.m10.i(i7).f24937a0 != null) {
                L0(i7, org.telegram.messenger.m10.i(i7).f24937a0);
            }
            Q0();
            this.l1 = false;
        }
    }

    public final void Q0() {
        int i7;
        String str;
        if (this.f42649p0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.P).getConnectionState();
            this.f42628d0 = connectionState;
            q60 q60Var = null;
            if (connectionState == 2) {
                str = "WaitingForNetwork";
                i7 = 2131743212;
            } else if (connectionState == 5) {
                str = "Updating";
                i7 = 2131743810;
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
                q60Var = new q60(this, 9);
            }
            ActionBarLayout actionBarLayout = this.f42649p0;
            actionBarLayout.N0 = str;
            actionBarLayout.O0 = i7;
            actionBarLayout.P0 = q60Var;
            for (int i10 = 0; i10 < actionBarLayout.V0.size(); i10++) {
                ((org.telegram.ui.ActionBar.e2) actionBarLayout.V0.get(i10)).setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, q60Var);
            }
        }
    }

    public final int R() {
        return this.f42630e0.size();
    }

    public final rh.d S() {
        return this.f42635g1;
    }

    public final boolean W(android.content.Intent r123, boolean r124, boolean r125, boolean r126, vf.b r127, boolean r128, boolean r129) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.W(android.content.Intent, boolean, boolean, boolean, vf.b, boolean, boolean):boolean");
    }

    public final void X() {
        ActionMode actionMode = this.f42644l0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Y(int i7, TLRPC.User user, String str, vf.b bVar) {
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = s12.q1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new d3.b(1), new k60(this, bVar, s12, i7, user));
    }

    @Override
    public final void a(float f10) {
        if (g4.G() && g4.v().W) {
            g4 v = g4.v();
            v.Q();
            g4.e0(v);
            if (v.f47322g0 != null) {
                v.f47336v0[0].f48549b.g1();
                v.f47336v0[1].f48549b.g1();
                v.f47322g0.invalidate();
                v.f47332r0.invalidate();
                if (f10 == 1.0f) {
                    v.f47336v0[0].f48550c.f();
                    v.f47336v0[1].f48550c.f();
                }
            }
        }
        if (PhotoViewer.A1()) {
            PhotoViewer.p1().s3();
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.a0():void");
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.f42651q0) {
            this.f42653r0.X(z10, z10);
            this.f42649p0.X(z10, z10);
        }
    }

    public final void c0() {
        org.telegram.ui.ActionBar.o4[] o4VarArr = {this.f42649p0, this.f42651q0, this.f42653r0};
        for (int i7 = 0; i7 < 3; i7++) {
            org.telegram.ui.ActionBar.o4 o4Var = o4VarArr[i7];
            if (o4Var instanceof ActionBarLayout) {
                ((ActionBarLayout) o4Var).E();
            }
        }
    }

    public final boolean d0(boolean z10) {
        boolean z11;
        pg.i iVar = c8.pb.f4631a;
        if (iVar != null) {
            if (iVar.f55047s) {
                if (z10) {
                    iVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.hc0 hc0Var = this.f42669z0;
        if (hc0Var != null && hc0Var.f35225b.getVisibility() == 0) {
            if (z10) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.j3 j3Var = this.f42665x0;
            if (j3Var != null && (z11 = j3Var.V)) {
                if (z10 && z11) {
                    j3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.ul0.I;
                if (t1Var != null) {
                    if (z10) {
                        t1Var.dismiss();
                        org.telegram.ui.Components.ul0.I = null;
                        return false;
                    }
                } else if (ns.f49651g0 != null && ns.p().E) {
                    if (z10) {
                        ns.p().n();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f43308s) {
                    if (z10) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                    if (z10) {
                        PhotoViewer.p1().z0(true, false);
                        return false;
                    }
                } else if (!g4.G() || !g4.v().W) {
                    return true;
                } else {
                    if (z10) {
                        g4.v().m(true, false);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int r21, int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void e0() {
        HashSet hashSet;
        m4 m4Var = this.Z0;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Z0 = null;
        }
        if (!this.R) {
            this.R = true;
            xi.e eVar = this.f42645m1;
            if (eVar != null) {
                eVar.b();
                this.f42645m1 = null;
            }
            xi.e eVar2 = this.n1;
            if (eVar2 != null) {
                eVar2.b();
                this.n1 = null;
            }
            w70 w70Var = this.f42650p1;
            if (w70Var != null && (hashSet = org.telegram.messenger.qc.f26077n) != null) {
                hashSet.remove(w70Var);
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
        if (this.Z0 != null) {
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodePause");
            }
            org.telegram.messenger.g0.r(this.Z0);
            this.Z0 = null;
        }
        if (org.telegram.messenger.gz.f23978s.length() != 0) {
            org.telegram.messenger.gz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var = new m4(this, 10);
            this.Z0 = m4Var;
            if (org.telegram.messenger.gz.f23992x) {
                org.telegram.messenger.g0.i3(m4Var, 1000L);
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.a8.b("schedule app lock in 1000");
                }
            } else if (org.telegram.messenger.gz.f23995y != 0) {
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.a8.b("schedule app lock in " + ((org.telegram.messenger.gz.f23995y * 1000) + 1000));
                }
                org.telegram.messenger.g0.i3(this.Z0, (org.telegram.messenger.gz.f23995y * 1000) + 1000);
            }
        } else {
            org.telegram.messenger.gz.B = 0;
        }
        org.telegram.messenger.gz.y();
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.e2 e2Var, ActionBarLayout actionBarLayout) {
        boolean z10;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (org.telegram.messenger.g0.Q1()) {
            boolean z11 = e2Var instanceof yw;
            if (!z11 && !(e2Var instanceof je0)) {
                if ((e2Var instanceof an) && !((an) e2Var).c()) {
                    boolean z12 = this.N0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f42653r0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f42659u0.setVisibility(8);
                        this.f42653r0.a0();
                        this.f42653r0.c(-1, e2Var);
                        if (!this.f42651q0.getFragmentStack().isEmpty()) {
                            while (this.f42651q0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f42651q0;
                                actionBarLayout4.d0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f42651q0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.f42649p0)) {
                        actionBarLayout2.c(-1, e2Var);
                        if (!this.f42651q0.getFragmentStack().isEmpty()) {
                            while (this.f42651q0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f42651q0;
                                actionBarLayout5.d0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f42651q0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f42651q0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i7 = 0;
                    while (true) {
                        if (i7 < 4) {
                            if (org.telegram.messenger.m10.i(i7).p()) {
                                break;
                            }
                            i7++;
                        } else {
                            i7 = -1;
                            break;
                        }
                    }
                    if ((e2Var instanceof ce0) && i7 == -1) {
                        this.f42659u0.setVisibility(0);
                        this.f42657t0.setBackgroundColor(0);
                    } else {
                        this.f42657t0.setBackgroundColor(2130706432);
                    }
                    this.f42651q0.c(-1, e2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.f42649p0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z11 && !((yw) e2Var).t4()) {
                    z10 = false;
                }
                if (z10) {
                    this.f42649p0.a0();
                    this.f42649p0.c(-1, e2Var);
                    this.f42651q0.a0();
                    this.f42651q0.getView().setVisibility(8);
                    if (!this.N0 && this.f42653r0.getFragmentStack().isEmpty()) {
                        this.f42659u0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.Z0 != null) {
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodeResume");
            }
            org.telegram.messenger.g0.r(this.Z0);
            this.Z0 = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (org.telegram.messenger.gz.B != 0) {
            org.telegram.messenger.gz.B = 0;
            org.telegram.messenger.gz.y();
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        org.telegram.ui.ActionBar.t1 t1Var = this.V0;
        if (t1Var != null) {
            try {
                t1Var.dismiss();
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
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f43308s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
            return true;
        } else if (!g4.G() || !g4.v().W) {
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
            if (actionBarLayout == this.f42649p0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.l1) {
                e0();
                finish();
                return false;
            } else if (actionBarLayout == this.f42653r0) {
                if (!this.N0) {
                    this.f42659u0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f42651q0 && this.f42649p0.getFragmentStack().isEmpty() && this.f42651q0.getFragmentStack().size() == 1) {
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
        q60 q60Var = new q60(this, 0);
        ce0Var.G = 3;
        ce0Var.f46085a = 12;
        ce0Var.f46093e0 = q60Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f41484a |= 256;
                obj.f41485b = indexOf;
                int i7 = lastIndexOf + 1;
                obj.f41486c = i7;
                valueOf.setSpan(new org.telegram.ui.Components.xy0(obj, 0), indexOf, i7, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = valueOf;
            t1Var.U = org.telegram.messenger.hd.M0(2131751201, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752548, null), new tr(14, this, ce0Var));
            i5.c.x(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        t0(ce0Var);
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.m4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.m4):boolean");
    }

    public final void l0(final long j3, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i7, final int i10) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            t0(u91.J0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = org.telegram.messenger.np.s1(this.P).h1(-j3);
        tL_channels_getMessages.f28089id.add(num);
        ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new z60(LaunchActivity.this, tLObject, num, num2, bArr, j3, runnable, str, i7, i10));
            }
        });
    }

    public final void m0(int i7, long j3, TLRPC.TL_error tL_error) {
        an anVar = new an(a8.p0.j(j3, "user_id"));
        t0(anVar);
        org.telegram.messenger.g0.i3(new tp(tL_error, anVar, org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3)), 13), 300L);
    }

    public final void n0(int i7, String str, String str2, vf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_importContactToken, new bg.k0(this, bVar, s12, i7, str2, 11));
    }

    public final void o0(int i7, String str, String str2, vf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        s12.d2().a(str, null, new di.z3(this, s12, bVar, i7, str2, 1));
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f42644l0 == actionMode) {
            this.f42644l0 = null;
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f42649p0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.D0 = false;
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f42653r0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.D0 = false;
                ActionBarLayout actionBarLayout3 = this.f42651q0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.E;
                if (kVar3 != null) {
                    kVar3.setVisibility(0);
                }
                actionBarLayout3.D0 = false;
            }
        }
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.f42644l0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.f42649p0.s(menu) && org.telegram.messenger.g0.Q1() && !this.f42653r0.s(menu)) {
                this.f42651q0.s(menu);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f42649p0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.D0 = true;
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f42653r0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.D0 = true;
                ActionBarLayout actionBarLayout3 = this.f42651q0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.E;
                if (kVar3 != null) {
                    kVar3.setVisibility(8);
                }
                actionBarLayout3.D0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i7, int i10, Intent intent) {
        fi.b4 currentPeerView;
        a8.r7 r7Var;
        VoIPService sharedInstance;
        boolean z10 = false;
        if (org.telegram.messenger.gz.f23978s.length() != 0 && org.telegram.messenger.gz.B != 0) {
            org.telegram.messenger.gz.B = 0;
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onActivityResult");
            }
            org.telegram.messenger.m10.i(this.P).v(false);
        }
        if (i7 == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.t0.G = canDrawOverlays;
            if (canDrawOverlays) {
                c40 c40Var = c40.C5;
                if (c40Var != null) {
                    c40Var.L();
                }
                org.telegram.messenger.g0.i3(new q60(this, 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i7, i10, intent);
        String str = null;
        if (i7 >= 22336 && i7 <= 22399) {
            org.telegram.ui.Wallet.u0 u0Var = c8.xa.f4778b;
            if (u0Var != null && u0Var.f44540e == this && u0Var.f44541f && u0Var.f44542g == i7) {
                if (i10 != -1) {
                    str = "AUTH_CANCELED";
                }
                u0Var.c(str);
            }
        } else if (i7 == 520) {
            if (i10 == -1 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
                sharedInstance.createCaptureDevice(true);
            }
        } else if (i7 == 140) {
            org.telegram.messenger.rd f10 = org.telegram.messenger.rd.f(this.P);
            if (i10 == -1) {
                z10 = true;
            }
            Utilities.d.c(new org.telegram.messenger.l10(3, f10, z10));
        } else if (i7 == 521) {
            hi.g7 g7Var = this.f42652q1;
            if (g7Var != null) {
                if (i10 == -1) {
                    z10 = true;
                }
                g7Var.a(Boolean.valueOf(z10));
                this.f42652q1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f32747p;
            if (themeEditorView != null && (r7Var = themeEditorView.f32758m) != null) {
                r7Var.v(i7, i10, intent);
            }
            ActionBarLayout actionBarLayout = this.f42649p0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.e2 e2Var = this.f42649p0.getFragmentStack().get(this.f42649p0.getFragmentStack().size() - 1);
                e2Var.onActivityResultFragment(i7, i10, intent);
                if (e2Var.getLastStoryViewer() != null && (currentPeerView = e2Var.getLastStoryViewer().f11861o0.getCurrentPeerView()) != null && i10 == -1) {
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
                                fi.p2 p2Var = currentPeerView.f11520s2;
                                if (p2Var != null) {
                                    p2Var.dismiss();
                                }
                                currentPeerView.i0(true);
                            }
                        }
                    } else {
                        currentPeerView.r0();
                        fi.p2 p2Var2 = currentPeerView.f11520s2;
                        if (p2Var2 != null) {
                            p2Var2.f36447e2.j0(i7, intent, null);
                        }
                    }
                }
            }
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f42653r0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f42653r0.getFragmentStack().get(this.f42653r0.getFragmentStack().size() - 1).onActivityResultFragment(i7, i10, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f42651q0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f42651q0.getFragmentStack().get(this.f42651q0.getFragmentStack().size() - 1).onActivityResultFragment(i7, i10, intent);
                }
            }
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25480c5, Integer.valueOf(i7), Integer.valueOf(i10), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (d0(true)) {
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.f42651q0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f42651q0.I();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f42653r0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f42653r0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.e2 e2Var = this.f42653r0.getFragmentStack().get(this.f42653r0.getFragmentStack().size() - 1);
                    if (e2Var.onBackPressed(true)) {
                        e2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.f42649p0.I();
                return;
            }
            this.f42649p0.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        float f11;
        float f12;
        org.telegram.messenger.g0.v(this, configuration);
        this.f42658t1.a();
        org.telegram.messenger.g0.w3(getWindow());
        super.onConfigurationChanged(configuration);
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19042c;
        LaunchActivity launchActivity = (LaunchActivity) d.f19044f;
        if (launchActivity == null || !org.telegram.messenger.g0.H1(launchActivity)) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.h hVar = ((wi.n) arrayList.get(i7)).f59425e;
                if (hVar != null && hVar.h != null && !hVar.K) {
                    Activity activity = hVar.f59383c;
                    org.telegram.messenger.g0.v(activity, activity.getResources().getConfiguration());
                    u7.i.f57879b = null;
                    Point point = org.telegram.messenger.g0.f23609q;
                    hVar.A = (Math.min(point.x, point.y) - (wi.h.m() * 2.0f)) / hVar.h();
                    int h = (int) (hVar.h() * hVar.f59403z);
                    wi.l lVar = hVar.f59382b;
                    int L = lVar.L();
                    int b02 = lVar.b0();
                    if (L > 0 && b02 > 0) {
                        f10 = b02 / L;
                    } else {
                        f10 = 0.5625f;
                    }
                    int i10 = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f59403z);
                    if (hVar.f59401x != h || hVar.f59402y != i10) {
                        WindowManager.LayoutParams layoutParams = hVar.f59384e;
                        hVar.f59401x = h;
                        layoutParams.width = h;
                        hVar.f59402y = i10;
                        layoutParams.height = i10;
                        hVar.r();
                    }
                    r1.g gVar = hVar.D;
                    gVar.f55739b = hVar.B;
                    gVar.f55740c = true;
                    gVar.f55748m.f55756i = wi.h.n(f11, hVar.f59401x);
                    hVar.D.h();
                    r1.g gVar2 = hVar.E;
                    gVar2.f55739b = hVar.C;
                    gVar2.f55740c = true;
                    gVar2.f55748m.f55756i = wi.h.e(f12, hVar.f59402y);
                    hVar.E.h();
                }
            }
        }
        org.telegram.messenger.g0.d3();
        a0();
        E();
        org.telegram.messenger.g0.h3(new q60(this, 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            int i11 = pipRoundVideoView.f32614y.getInt("sidex", 1);
            int i12 = pipRoundVideoView.f32614y.getInt("sidey", 0);
            float f13 = pipRoundVideoView.f32614y.getFloat("px", 0.0f);
            float f14 = pipRoundVideoView.f32614y.getFloat("py", 0.0f);
            pipRoundVideoView.f32612w.x = PipRoundVideoView.b(f13, i11, pipRoundVideoView.h, true);
            pipRoundVideoView.f32612w.y = PipRoundVideoView.b(f14, i12, pipRoundVideoView.f32609n, false);
            pipRoundVideoView.f32613x.updateViewLayout(pipRoundVideoView.f32604a, pipRoundVideoView.f32612w);
        }
        org.telegram.ui.Components.bu buVar = org.telegram.ui.Components.bu.S1;
        if (buVar != null) {
            buVar.c0(configuration);
        }
        wg.l lVar2 = wg.l.f59202p1;
        if (lVar2 != null) {
            lVar2.c0(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.Z8;
        ThemeEditorView themeEditorView = ThemeEditorView.f32747p;
        if (themeEditorView != null) {
            int i13 = themeEditorView.f32757l.getInt("sidex", 1);
            int i14 = themeEditorView.f32757l.getInt("sidey", 0);
            float f15 = themeEditorView.f32757l.getFloat("px", 0.0f);
            float f16 = themeEditorView.f32757l.getFloat("py", 0.0f);
            themeEditorView.f32754i.x = ThemeEditorView.c(f15, i13, themeEditorView.f32753g, true);
            themeEditorView.f32754i.y = ThemeEditorView.c(f16, i14, themeEditorView.h, false);
            try {
                if (themeEditorView.f32750c.getParent() != null) {
                    themeEditorView.f32755j.updateViewLayout(themeEditorView.f32750c, themeEditorView.f32754i);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (org.telegram.ui.ActionBar.j6.f29043o == 3) {
            org.telegram.ui.ActionBar.j6.F(false);
        }
    }

    @Override
    public final void onCreate(android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public final void onDestroy() {
        bg.b0 b0Var;
        k0 k0Var;
        org.telegram.ui.Wallet.u0 u0Var = c8.xa.f4778b;
        if (u0Var != null && u0Var.f44540e == this) {
            u0Var.c("AUTH_CANCELED");
            c8.xa.f4778b.e();
        }
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19042c;
        if (((LaunchActivity) d.f19044f) == this) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((wi.n) arrayList.get(size)).b();
            }
            ((wi.p) d.f19043e).c();
            d.f19044f = null;
            ((ArrayList) d.d).clear();
        }
        E1 = false;
        F1--;
        androidx.mediarouter.app.f fVar = this.f42633f1;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.f42633f1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.f42713g9 != null) {
                PhotoViewer.f42713g9.J0();
            }
            if (PhotoViewer.A1()) {
                PhotoViewer.p1().J0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f10 = SecretMediaViewer.f();
                Runnable runnable = f10.f43300o1;
                if (runnable != null) {
                    runnable.run();
                    f10.f43300o1 = null;
                }
                bg.u0 u0Var2 = f10.f43294k1;
                if (u0Var2 != null) {
                    u0Var2.b();
                    f10.f43294k1 = null;
                }
                org.telegram.messenger.ns.f(f10.f43268a).n(f10, org.telegram.messenger.ns.f25592w);
                org.telegram.messenger.ns.f(f10.f43268a).n(f10, org.telegram.messenger.ns.f25527l0);
                org.telegram.messenger.ns.f(f10.f43268a).n(f10, org.telegram.messenger.ns.f25510i0);
                f10.f43308s = false;
                f10.M = null;
                org.telegram.messenger.ic icVar = f10.f43287h0;
                if (icVar != null) {
                    icVar.a();
                    f10.f43287h0 = null;
                }
                f10.j();
                if (f10.f43271b != null && (k0Var = f10.d) != null) {
                    try {
                        if (k0Var.getParent() != null) {
                            ((WindowManager) f10.f43271b.getSystemService("window")).removeViewImmediate(f10.d);
                        }
                        f10.d = null;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                SecretMediaViewer.f43267w1 = null;
            }
            if (g4.G()) {
                g4.v().r();
            }
            if (ns.f49651g0 != null) {
                ns p10 = ns.p();
                p10.E = false;
                p10.f49666l = null;
                p10.W = null;
                p10.Y = null;
                p10.f49653a0 = null;
                if (p10.f49676w != null && p10.f49678y != null) {
                    Bitmap bitmap = p10.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        p10.v = null;
                    }
                    p10.M = 0.0f;
                    p10.K = false;
                    try {
                        if (p10.f49678y.getParent() != null) {
                            ((WindowManager) p10.f49676w.getSystemService("window")).removeViewImmediate(p10.f49678y);
                        }
                        p10.f49678y = null;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    ns.f49651g0 = null;
                    org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25522k1, 8);
                }
            }
            c40 c40Var = c40.C5;
            if (c40Var != null) {
                c40Var.L();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i7 = org.telegram.ui.ActionBar.j6.f28784a;
            org.telegram.ui.Components.bu buVar = org.telegram.ui.Components.bu.S1;
            if (buVar != null) {
                buVar.K0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f32747p;
            if (themeEditorView != null) {
                themeEditorView.b();
            }
            pg.i iVar = c8.pb.f4631a;
            if (iVar != null) {
                iVar.f55043e.edit().putFloat("x", (float) iVar.f55042c.f55748m.f55756i).putFloat("y", (float) iVar.d.f55748m.f55756i).commit();
            }
            c8.pb.f4631a = null;
            SparseArray sparseArray = org.telegram.ui.Components.g5.f34795r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController B = MediaController.B();
        if (B.K0 == this) {
            B.K0 = null;
        }
        MediaController B2 = MediaController.B();
        if (B2.L0 == this.f42656s1) {
            B2.L0 = null;
        }
        for (int i10 = 0; i10 < this.D0.size(); i10++) {
            try {
                if (((Dialog) this.D0.get(i10)).isShowing()) {
                    ((Dialog) this.D0.get(i10)).dismiss();
                }
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        this.D0.clear();
        try {
            if (this.f42636h0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f42636h0);
            }
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (this.f42641j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f42641j1);
            }
        } else if (i11 >= 33 && this.f42641j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f42643k1);
        }
        org.telegram.ui.Components.xb.h(this.f42661v0);
        VideoAds.dropCache();
        I();
        super.onDestroy();
        e0();
        org.telegram.messenger.n6 n6Var = this.f42631e1;
        if (n6Var != null) {
            n6Var.e();
        }
        if (i11 >= 24 && (b0Var = this.f42639i1) != null) {
            b0Var.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 == 82 && !org.telegram.messenger.gz.C) {
            if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                return super.onKeyUp(i7, keyEvent);
            }
            if (g4.G() && g4.v().W) {
                return super.onKeyUp(i7, keyEvent);
            }
            if (org.telegram.messenger.g0.Q1()) {
                if (this.f42651q0.getView().getVisibility() == 0 && !this.f42651q0.getFragmentStack().isEmpty()) {
                    this.f42651q0.getView().onKeyUp(i7, keyEvent);
                } else if (this.f42653r0.getView().getVisibility() == 0 && !this.f42653r0.getFragmentStack().isEmpty()) {
                    this.f42653r0.getView().onKeyUp(i7, keyEvent);
                } else {
                    this.f42649p0.getView().onKeyUp(i7, keyEvent);
                }
            } else {
                this.f42649p0.getView().onKeyUp(i7, keyEvent);
            }
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.f42649p0;
        if (actionBarLayout != null) {
            actionBarLayout.M();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f42653r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.M();
                }
                ActionBarLayout actionBarLayout3 = this.f42651q0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z10) {
        org.telegram.messenger.g0.E = z10;
        this.f42658t1.a();
        E();
        super.onMultiWindowModeChanged(z10);
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
        boolean z10;
        VoIPService sharedInstance;
        wi.h hVar;
        wi.o oVar;
        super.onPause();
        G1 = false;
        org.telegram.utils.twidget.n0.r(true);
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19042c;
        if (this == ((LaunchActivity) d.f19044f)) {
            d.f19041b = false;
            wi.p pVar = (wi.p) d.f19043e;
            LaunchActivity launchActivity = pVar.f59432b;
            if (launchActivity != null && Build.VERSION.SDK_INT >= 31 && pVar.f59435f == null && pVar.f59434e != null && org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.i(pVar.f59434e);
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                if (nVar.f59424c == 1 && (hVar = nVar.f59425e) != null && !hVar.f59385f && (oVar = hVar.f59388j) != null && hVar.f59390l != null && oVar.isAvailable()) {
                    try {
                        Bitmap bitmap = hVar.f59388j.getBitmap();
                        if (bitmap != null) {
                            hVar.f59390l.setImageBitmap(bitmap);
                            hVar.f59390l.setVisibility(0);
                            hVar.f59388j.setFirstFrameCallback(null);
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
            }
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25517j1, 4096);
        org.telegram.messenger.t0.f26608x = true;
        Utilities.d.c(new jg.x(this.P, 12));
        g0();
        this.f42649p0.O();
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout = this.f42653r0;
            if (actionBarLayout != null) {
                actionBarLayout.O();
            }
            ActionBarLayout actionBarLayout2 = this.f42651q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.O();
            }
        }
        org.telegram.ui.Components.hc0 hc0Var = this.f42669z0;
        if (hc0Var != null) {
            hc0Var.f35225b.k();
        }
        ArrayList arrayList2 = this.A0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((org.telegram.ui.Components.fc0) obj).k();
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26599a;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer p12 = PhotoViewer.p1();
            if (p12.f42807k2 != null) {
                p12.z0(false, false);
            } else {
                org.telegram.ui.Components.u51 u51Var = p12.G2;
                if (u51Var != null && p12.Z2) {
                    u51Var.s0(org.telegram.messenger.g0.H1(p12.E));
                }
            }
        }
        hi.sa saVar = hi.sa.G2;
        if (saVar != null) {
            saVar.u(false);
            hi.ia iaVar = saVar.f15048d1;
            if (iaVar != null) {
                iaVar.f14623f.r();
            }
            hi.ga gaVar = saVar.Y0;
            if (gaVar != null) {
                gaVar.x(0, true);
            }
        }
        org.telegram.ui.Components.voip.i2.a(this);
        ec1 ec1Var = ec1.f46680m1;
        if (ec1Var != null) {
            boolean isInteractive = ((PowerManager) ec1Var.f46684b.getSystemService("power")).isInteractive();
            boolean a10 = c8.kd.a(ec1Var.f46684b);
            if (!a10 && !c8.kd.b(ec1Var.f46684b)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (ec1Var.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a10) {
                int measuredHeight = ec1.f46680m1.f46719u0.getMeasuredHeight();
                ec1 ec1Var2 = ec1.f46680m1;
                org.telegram.ui.Components.voip.i2.f(ec1Var2.f46684b, ec1Var2.f46681a, ec1Var2.f46719u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = ec1.f46680m1.f46715r0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.i2.W = windowInsets.getSystemWindowInsetTop();
                    ec1.f46680m1.f46715r0.getSystemWindowInsetBottom();
                }
            }
            if (ec1Var.f46710n0 && ((!z10 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.i2.d() != null) {
                org.telegram.ui.Components.voip.i2.d().e();
            }
        } else if (org.telegram.ui.Components.voip.i2.d() != null) {
            org.telegram.ui.Components.voip.i2.d().e();
        }
        HashMap hashMap = xh.e.f59969n;
        if (hashMap != null) {
            for (xh.e eVar : hashMap.values()) {
                xh.d dVar = eVar.f59974f;
                if (dVar != null) {
                    dVar.f59959b = true;
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
        ((wi.p) l2.i.d().f19043e).g();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        ((wi.p) l2.i.d().f19043e).f(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        ai.v0 v0Var;
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (!u(i7, strArr, iArr)) {
            return;
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26599a;
        if (this.f42649p0.getFragmentStack().size() != 0) {
            this.f42649p0.getFragmentStack().get(this.f42649p0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (this.f42653r0.getFragmentStack().size() != 0) {
                this.f42653r0.getFragmentStack().get(this.f42653r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
            }
            if (this.f42651q0.getFragmentStack().size() != 0) {
                this.f42651q0.getFragmentStack().get(this.f42651q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
            }
        }
        ec1.h(iArr, i7);
        hi.sa saVar = hi.sa.G2;
        if (saVar != null) {
            fi.b bVar = saVar.f15035a;
            Activity activity = saVar.f15039b;
            if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i7 == 111) {
                saVar.f15098t2 = !z10;
                if (z10 && saVar.f15057g0 == 0) {
                    saVar.B0.setCameraThumb(null);
                    if (CameraController.getInstance().isCameraInitied()) {
                        saVar.q();
                    } else {
                        CameraController.getInstance().initCamera(new hi.s8(saVar, 0));
                    }
                }
            } else if (i7 == 114) {
                if (z10) {
                    MediaController.O(0);
                    saVar.e(true);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                    int i10 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder.m(2131624119, 72, org.telegram.ui.ActionBar.j6.x0(null, i10, false), null);
                    alertDialog$Builder.n(i10, null);
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747299, null));
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.U = X2;
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new hi.b9(saVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                    t1Var.show();
                }
            } else if (i7 == 112) {
                if (!z10) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, activity, bVar);
                    int i11 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder2.m(2131624117, 72, org.telegram.ui.ActionBar.j6.x0(null, i11, false), null);
                    alertDialog$Builder2.n(i11, null);
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747309, null));
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.U = X22;
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747300, null), new hi.b9(saVar, 3));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                    t1Var2.show();
                }
            } else if (i7 == 115) {
                if (!z10) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, activity, bVar);
                    int i12 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder3.m(2131624119, 72, org.telegram.ui.ActionBar.j6.x0(null, i12, false), null);
                    alertDialog$Builder3.n(i12, null);
                    SpannableStringBuilder X23 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747313, null));
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28392a;
                    t1Var3.U = X23;
                    alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131747300, null), new hi.b9(saVar, 5));
                    alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                    t1Var3.show();
                }
                if (z10 && (v0Var = saVar.f15119z2) != null) {
                    v0Var.run();
                }
                saVar.f15119z2 = null;
            }
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25485d5, Integer.valueOf(i7), strArr, iArr);
        SparseIntArray sparseIntArray = this.f42625b1;
        if (sparseIntArray.get(i7, -1) >= 0) {
            int i13 = sparseIntArray.get(i7, -1);
            sparseIntArray.delete(i7);
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25546o5, Integer.valueOf(i13));
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25552p5, Integer.valueOf(i7), strArr, iArr);
    }

    @Override
    public final void onResume() {
        org.telegram.messenger.gj gjVar;
        sg.s0 s0Var;
        org.telegram.messenger.ve veVar;
        boolean z10;
        LaunchActivity launchActivity;
        super.onResume();
        org.telegram.utils.twidget.n0.r(false);
        G1 = true;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19042c;
        ArrayList arrayList2 = (ArrayList) d.d;
        if (this == ((LaunchActivity) d.f19044f)) {
            d.f19041b = true;
            wi.p pVar = (wi.p) d.f19043e;
            if (pVar.f59435f != null && (launchActivity = pVar.f59432b) != null && !org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.d();
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                wi.h hVar = nVar.f59425e;
                if (hVar != null && nVar.f59424c == 1 && hVar.f59386g && !hVar.K) {
                    if (hVar.f59382b.p() && c8.kd.a(hVar.f59383c)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != hVar.f59385f) {
                        hVar.l();
                        hVar.a();
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
        if (org.telegram.ui.ActionBar.j6.f29043o == 3) {
            org.telegram.ui.ActionBar.j6.F(false);
        }
        org.telegram.messenger.rd[] rdVarArr = org.telegram.messenger.rd.P;
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            } else if (org.telegram.messenger.m10.i(i11).p() && !org.telegram.messenger.rd.f(i11).J.isEmpty()) {
                org.telegram.messenger.rd.q();
                break;
            } else {
                i11++;
            }
        }
        G(true);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25522k1, 4096);
        MediaController B = MediaController.B();
        ViewGroup view = this.f42649p0.getView();
        this.f42656s1 = view;
        B.L0 = view;
        org.telegram.messenger.t0.f26608x = false;
        org.telegram.messenger.np.s1(this.P).U4(null);
        I0();
        Utilities.d.c(new org.telegram.ui.Components.ih(25));
        C(0);
        if (Build.VERSION.SDK_INT >= 24 && (veVar = MediaController.f22324b2) != null) {
            Utilities.f22416e.d(new jg.x(veVar.f26971e.size(), 3), 2000L);
        }
        h0();
        org.telegram.ui.Components.hc0 hc0Var = this.f42669z0;
        if (hc0Var != null && hc0Var.f35225b.getVisibility() == 0) {
            this.f42649p0.n();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.f42653r0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f42651q0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.f42669z0.f35225b.l();
            ArrayList arrayList4 = this.A0;
            int size2 = arrayList4.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList4.get(i12);
                i12++;
                ((org.telegram.ui.Components.fc0) obj2).l();
            }
        } else {
            this.f42649p0.P();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout3 = this.f42653r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.P();
                }
                ActionBarLayout actionBarLayout4 = this.f42651q0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.P();
                }
            }
        }
        ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        Q0();
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer p12 = PhotoViewer.p1();
            oq0 oq0Var = p12.f42763f0;
            if (oq0Var != null) {
                oq0Var.invalidate();
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.a2(p12, 0, 25), 100L);
            }
            org.telegram.ui.Components.u51 u51Var = p12.G2;
            if (u51Var != null) {
                u51Var.p0(u51Var.S() + 1);
                if (p12.Z2) {
                    p12.G2.s0(true);
                }
            }
            tp0 tp0Var = p12.M1;
            if (tp0Var != null && (s0Var = tp0Var.G0.d) != null) {
                s0Var.postRunnable(s0Var.f56772x);
            }
        }
        hi.sa saVar = hi.sa.G2;
        if (saVar != null) {
            saVar.O();
        }
        if (PipRoundVideoView.G != null && MediaController.B().H() && (gjVar = MediaController.B().f22377v0) != null) {
            MediaController.B().i0(gjVar, gjVar.f23777b0);
        }
        if (org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).f24937a0 != null) {
            int i13 = org.telegram.messenger.m10.f24934t0;
            L0(i13, org.telegram.messenger.m10.i(i13).f24937a0);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.gz.f23956j1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(org.telegram.messenger.m10.f24934t0, tL_help_appUpdate, true);
            }
        }
        z(false);
        org.telegram.messenger.t0.G = Settings.canDrawOverlays(this);
        org.telegram.ui.Components.voip.i2.a(this);
        ec1 ec1Var = ec1.f46680m1;
        if (ec1Var != null) {
            if (org.telegram.ui.Components.voip.i2.d() != null) {
                org.telegram.ui.Components.voip.i2.b();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                ec1Var.y();
            } else if (VoIPService.getSharedState() == null) {
                ec1Var.f46719u0.b();
            }
            ec1Var.J0 = ((KeyguardManager) ec1Var.f46684b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.i2.d() != null) {
                org.telegram.ui.Components.voip.i2.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        } else if (org.telegram.ui.Components.voip.i2.d() != null) {
            org.telegram.ui.Components.voip.i2.d().getClass();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getVideoState(false) == 1) {
                sharedInstance3.setVideoState(false, 2);
            }
        }
        a0();
        HashMap hashMap = xh.e.f59969n;
        if (hashMap != null) {
            for (xh.e eVar : hashMap.values()) {
                xh.d dVar = eVar.f59974f;
                if (dVar != null) {
                    dVar.f59959b = false;
                }
            }
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26599a;
        z zVar = J1;
        if (zVar != null) {
            zVar.run();
            J1 = null;
        }
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.P);
        if (!s12.T3.contains("SETUP_LOGIN_EMAIL") && !s12.T3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            return;
        }
        Utilities.d.c(new org.telegram.messenger.tj(org.telegram.messenger.np.s1(this.P), 27));
    }

    @Override
    public final void onSaveInstanceState(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override
    public final void onStart() {
        Activity activity;
        wi.h hVar;
        wi.o oVar;
        super.onStart();
        this.f42654r1 = true;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19042c;
        if (this == ((LaunchActivity) d.f19044f)) {
            d.f19040a = true;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                if (nVar.f59424c == 1 && (hVar = nVar.f59425e) != null && !hVar.f59385f && (oVar = hVar.f59388j) != null) {
                    oVar.post(new ug.t1(13, hVar, oVar));
                }
            }
        }
        WeakReference weakReference = vf.c.f58810e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            vf.c.y(activity);
        }
        if (vf.c.f58808b == null) {
            vf.c.f58810e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(vf.c.d)) {
                    String a10 = a8.h1.a(this);
                    vf.c.d = a10;
                    if (a10 == null) {
                    }
                }
                Object obj = new Object();
                ag.a aVar = new ag.a();
                aVar.f1053b = new WeakReference(obj);
                vf.c.f58809c = aVar;
                String str = vf.c.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, aVar, 33)) {
                    vf.c.f58809c = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.t0.f26609y = false;
        org.telegram.ui.Components.s10.k(this);
        c40 c40Var = c40.C5;
        if (c40Var != null) {
            c40Var.y1();
        }
    }

    @Override
    public final void onStop() {
        wi.h hVar;
        super.onStop();
        org.telegram.ui.Wallet.u0 u0Var = c8.xa.f4778b;
        if (u0Var != null && u0Var.f44540e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.u0 u0Var2 = c8.xa.f4778b;
            if (!u0Var2.f44541f) {
                u0Var2.c("AUTH_CANCELED");
                c8.xa.f4778b.e();
            }
        }
        this.f42654r1 = false;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19042c;
        if (this == ((LaunchActivity) d.f19044f)) {
            d.f19040a = false;
            ((wi.p) d.f19043e).getClass();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                if (nVar.f59424c == 1 && (hVar = nVar.f59425e) != null && !hVar.f59385f) {
                    nVar.f59422a.b();
                    nVar.c();
                }
            }
        }
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().Z1();
        }
        vf.c.y(this);
        org.telegram.messenger.t0.f26609y = true;
        org.telegram.ui.Components.s10.k(this);
        c40 c40Var = c40.C5;
        if (c40Var != null) {
            c40Var.x1();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f42637h1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        ((wi.p) l2.i.d().f19043e).g();
        ArrayList arrayList = this.f42623a1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.f42649p0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.V0.isEmpty()) {
                ((org.telegram.ui.ActionBar.e2) r.b.h(1, actionBarLayout.V0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.r rVar = actionBarLayout.H;
            if (rVar != null) {
                rVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        fi.b7 a10;
        long[] jArr2 = jArr;
        int i7 = 0;
        while (true) {
            if (i7 < jArr2.length) {
                TLRPC.User a22 = org.telegram.messenger.np.s1(this.P).a2(Long.valueOf(jArr2[i7]));
                if (a22 != null && !a22.stories_hidden) {
                    z11 = false;
                    break;
                }
                i7++;
            } else {
                z11 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.e2 Q = Q();
        if (Q != null) {
            fi.s6 P1 = org.telegram.messenger.np.s1(this.P).P1();
            if (z11) {
                arrayList = P1.h;
            } else {
                arrayList = P1.f12324g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z12 = z11;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z12) {
                ArrayList arrayList5 = new ArrayList();
                for (int i10 = 0; i10 < jArr2.length; i10++) {
                    TLRPC.User a23 = org.telegram.messenger.np.s1(this.P).a2(Long.valueOf(jArr2[i10]));
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
            if (z10) {
                for (int i12 = 0; i12 < jArr2.length; i12 = com.google.android.gms.internal.vision.e2.g(i12, 1, jArr2[i12], arrayList4)) {
                }
            } else {
                for (int i13 = 0; i13 < jArr2.length; i13 = com.google.android.gms.internal.vision.e2.g(i13, 1, jArr2[i13], arrayList3)) {
                }
            }
            if (!arrayList4.isEmpty() && z10) {
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.P);
                int[] iArr = {arrayList4.size()};
                tp tpVar = new tp(this, iArr, jArr2, 17);
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    long longValue = ((Long) arrayList4.get(i14)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer j12 = s12.j1(longValue);
                    tL_stories_getPeerStories.peer = j12;
                    if (j12 instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getPeerStories, new di.o2(s12, longValue, tpVar, 6));
                    }
                }
                return;
            }
            long e10 = org.telegram.messenger.m10.i(this.P).e();
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i15)).peer);
                if (o4 != e10 && !arrayList3.contains(Long.valueOf(o4)) && P1.L(o4)) {
                    arrayList3.add(Long.valueOf(o4));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (Q instanceof yw) {
                    try {
                        a10 = fi.b7.a(((yw) Q).F0.h);
                    } catch (Exception unused) {
                    }
                    fi.b7 b7Var = a10;
                    Q.getOrCreateStoryViewer().B();
                    Q.getOrCreateStoryViewer().M(this, null, arrayList3, 0, null, null, b7Var, false);
                }
                a10 = null;
                fi.b7 b7Var2 = a10;
                Q.getOrCreateStoryViewer().B();
                Q.getOrCreateStoryViewer().M(this, null, arrayList3, 0, null, null, b7Var2, false);
            }
        }
    }

    public final void q0(final int i7, final long j3, final boolean z10) {
        TL_stories.StoryItem storyItem;
        fi.k6 k6Var;
        fi.k6 A;
        org.telegram.messenger.gj f10;
        org.telegram.messenger.gj f11;
        TL_stories.StoryItem storyItem2;
        fi.s6 P1 = org.telegram.messenger.np.s1(this.P).P1();
        TL_stories.PeerStories y10 = P1.y(j3);
        fi.b7 b7Var = null;
        if (y10 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < y10.stories.size()) {
                    if (y10.stories.get(i10).f28290id == i7) {
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
                org.telegram.ui.ActionBar.e2 Q = Q();
                if (Q != null) {
                    if (Q instanceof yw) {
                        try {
                            b7Var = fi.b7.a(((yw) Q).F0.h);
                        } catch (Exception unused) {
                        }
                    }
                    fi.b7 b7Var2 = b7Var;
                    Q.getOrCreateStoryViewer().B();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z10) {
                        Q.getOrCreateStoryViewer().f11881w1 = true;
                    }
                    Q.getOrCreateStoryViewer().M(this, storyItem2, arrayList, 0, null, y10, b7Var2, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            fi.k6 A2 = P1.A(0, -1, j3, true);
            if (A2 != null && (f11 = A2.f(i7)) != null) {
                storyItem = f11.f23822l;
            } else {
                A2 = null;
            }
            if (storyItem == null && (A = P1.A(1, -1, j3, true)) != null && (f10 = A.f(i7)) != null) {
                storyItem = f10.f23822l;
                k6Var = A;
            } else {
                k6Var = A2;
            }
            if (storyItem != null && k6Var != null) {
                storyItem.dialogId = j3;
                org.telegram.ui.ActionBar.e2 Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof yw) {
                    try {
                        b7Var = fi.b7.a(((yw) Q2).F0.h);
                    } catch (Exception unused2) {
                    }
                }
                fi.b7 b7Var3 = b7Var;
                Q2.getOrCreateStoryViewer().B();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    Q2.getOrCreateStoryViewer().f11881w1 = true;
                }
                Q2.getOrCreateStoryViewer().M(this, storyItem, arrayList2, 0, k6Var, null, b7Var3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = org.telegram.messenger.np.s1(this.P).j1(j3);
        tL_stories_getStoriesByID.f28297id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new ai.w0(LaunchActivity.this, tLObject, i7, j3, z10));
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7 = i6Var.f28709g0;
        boolean z10 = false;
        org.telegram.ui.ActionBar.g6 f10 = i6Var.f(tL_theme, this.P, 0);
        i6Var.f28699a0 = i6Var.Z;
        i6Var.u(f10.f28602a);
        f10.f28618s = tL_wallPaper;
        if (i7 != i6Var.f28709g0) {
            z10 = true;
        }
        t0(new t71(i6Var, z10, 0, false, false));
    }

    public final void s0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void setRequestedOrientation(int i7) {
        org.telegram.messenger.g0.f23592g = -10;
        org.telegram.messenger.g0.h = -10;
        org.telegram.messenger.g0.f23595i = null;
        super.setRequestedOrientation(i7);
    }

    public final void t0(org.telegram.ui.ActionBar.e2 e2Var) {
        ((ActionBarLayout) M()).S(e2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) M()).V(e2Var, z10, z11);
    }

    public final void v0(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) instanceof ki.x2) {
                    ki.x2 x2Var = (ki.x2) arrayList.get(i7);
                    if (x2Var.isShowing() && x2Var.J == j3) {
                        return;
                    }
                }
                i7++;
            } else {
                org.telegram.ui.ActionBar.e2 T = T();
                if (T != null && T.sheetsStack != null) {
                    for (int i10 = 0; i10 < T.sheetsStack.size(); i10++) {
                        if (T.sheetsStack.get(i10).s()) {
                            T.sheetsStack.get(i10);
                        }
                    }
                }
                kx x10 = this.f42649p0.x();
                if (x10 != null && x10.sheetsStack != null) {
                    for (int i11 = 0; i11 < x10.sheetsStack.size(); i11++) {
                        if (x10.sheetsStack.get(i11).s()) {
                            x10.sheetsStack.get(i11);
                        }
                    }
                }
                w70 w70Var = new w70(this, 1);
                TLRPC.User a22 = org.telegram.messenger.np.s1(this.P).a2(Long.valueOf(j3));
                if (a22 != null) {
                    w70Var.a(a22);
                    return;
                } else {
                    org.telegram.messenger.vr.a0(this.P).f27220a.c(new d80(this, j3, w70Var, 0));
                    return;
                }
            }
        }
    }

    public final void w0(Long l10, g50 g50Var, vf.b bVar, org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.f3 G0 = org.telegram.messenger.np.s1(this.P).G0();
        if (bVar != null) {
            bVar.d();
        }
        G0.a(l10.longValue(), new r60(this, bVar, g50Var, G0, l10, q1Var));
    }

    public final void x(int i7) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.f42670z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42670z1 = null;
        }
        if (i11 >= 26) {
            i10 = getWindow().getNavigationBarColor();
        } else {
            i10 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10, i7);
        this.f42670z1 = ofArgb;
        ofArgb.addUpdateListener(new p60(this, 1));
        this.f42670z1.addListener(new r0(this, i7, 1));
        this.f42670z1.setInterpolator(org.telegram.ui.Components.er.h);
        this.f42670z1.setDuration(320L);
        this.f42670z1.start();
    }

    public final void x0(final int i7, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i10, final int i11, final String str23, final String str24, final String str25, String str26, final String str27, final vf.b bVar, final boolean z12, final int i12, final int i13, final int i14, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = org.telegram.messenger.np.s1(i7).q1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str30 = LaunchActivity.C1;
                final vf.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i15 = i7;
                final boolean z22 = z12;
                final boolean z23 = z16;
                final boolean z24 = z17;
                final boolean z25 = z18;
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
                    final boolean z26 = z10;
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
                    final boolean z27 = z11;
                    final String str52 = str22;
                    final int i16 = i10;
                    final int i17 = i11;
                    final String str53 = str23;
                    final String str54 = str24;
                    final String str55 = str25;
                    final int i18 = i12;
                    final int i19 = i13;
                    final int i20 = i14;
                    final boolean z28 = z13;
                    final String str56 = str28;
                    final boolean z29 = z19;
                    final boolean z30 = z20;
                    final String str57 = str29;
                    final boolean z31 = z21;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            String str58 = LaunchActivity.C1;
                            LaunchActivity.this.B0(i15, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, z26, num3, l12, l13, num4, str43, hashMap2, str44, str45, str46, str47, tL_wallPaper2, str48, str49, str50, str51, z27, str52, i16, i17, str53, str54, str55, null, null, bVar2, z22, i18, false, i19, i20, null, null, z28, str56, z23, z24, z25, z29, z30, str57, null, z31, null);
                        }
                    });
                    return;
                }
                final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                final Runnable runnable2 = runnable;
                final TLRPC.User user2 = user;
                final String str58 = str27;
                final boolean z32 = z15;
                final boolean z33 = z14;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.ActionBar.e2 e2Var;
                        String str59 = LaunchActivity.C1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.f42630e0;
                        iz izVar = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList);
                        } else {
                            e2Var = null;
                        }
                        int i21 = i15;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str60 = str58;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z25;
                        boolean z37 = z22;
                        s70 s70Var = new s70(launchActivity2, e2Var, i21, user3, tL_messages_botApp2, atomicBoolean, str60, z34, z35, z36, z37);
                        if (z32) {
                            s70Var.run();
                        } else if (tL_messages_botApp2.inactive && z33) {
                            r3 r3Var = new r3(s70Var, 9);
                            vf.b bVar3 = bVar2;
                            if (bVar3 != null) {
                                izVar = new iz(bVar3, 16);
                            }
                            wc1.a(launchActivity2, r3Var, izVar);
                        } else if (!tL_messages_botApp2.request_write_access && !z37) {
                            s70Var.run();
                        } else {
                            org.telegram.ui.Components.t4.m(e2Var, atomicBoolean, user3, s70Var);
                        }
                    }
                });
            }
        });
    }

    @Override
    public final boolean y(org.telegram.ui.yw r49, java.util.ArrayList r50, final java.lang.CharSequence r51, boolean r52, boolean r53, int r54, final int r55, org.telegram.ui.u91 r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.y(org.telegram.ui.yw, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.u91):boolean");
    }

    public final void y0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f42651q0;
        if (actionBarLayout != null) {
            actionBarLayout.X(z10, z10);
        } else {
            this.f42649p0.X(z10, z10);
        }
    }

    public final void z(boolean z10) {
        org.telegram.messenger.h1 e10;
        String str;
        int i7;
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        if (!z10) {
            boolean z11 = org.telegram.messenger.r2.f26198a;
        }
        if (org.telegram.messenger.t0.f26599a.q()) {
            org.telegram.messenger.d1 d1Var = null;
            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26599a).q() && (str = (e10 = org.telegram.messenger.h1.e()).f24014a) != null && (i7 = e10.f24015b) != 0) {
                d1Var = new org.telegram.messenger.d1(str, i7, e10.f24016c);
            }
            boolean z12 = this.f42648o1;
            this.f42648o1 = false;
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26599a;
            f60 f60Var = new f60(this, z12, d1Var, 2);
            if (((ApplicationLoaderImpl) t0Var).q()) {
                org.telegram.messenger.h1.e().a(f60Var, z10);
            }
        } else if (!z10 && Math.abs(System.currentTimeMillis() - org.telegram.messenger.gz.l1) < org.telegram.messenger.np.s1(0).f25360p3 * 1000) {
        } else {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = org.telegram.messenger.t0.f26600b.getPackageManager().getInstallerPackageName(org.telegram.messenger.t0.f26600b.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            int i10 = this.P;
            ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new di.u1(this, i10, 8));
        }
    }

    public final int z0(final int i7, final g50 g50Var, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i10, final int i11) {
        int longValue;
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.np.l1(chat);
        if (num2 != null) {
            longValue = num.intValue();
        } else {
            longValue = (int) l10.longValue();
        }
        tL_messages_getDiscussionMessage.msg_id = longValue;
        return ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.C1;
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
                final Runnable runnable3 = g50Var;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h70.run():void");
                    }
                });
            }
        });
    }

    @Override
    public final void e(int[] iArr) {
    }
}
