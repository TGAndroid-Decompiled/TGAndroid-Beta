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
public class LaunchActivity extends g5 implements org.telegram.ui.ActionBar.o4, org.telegram.messenger.gs, ww {
    public static final String C1 = UUID.randomUUID().toString();
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static LaunchActivity H1;
    public static Pattern I1;
    public static z J1;
    public static LaunchActivity K1;
    public di.oc A1;
    public org.telegram.ui.Components.wy0 B0;
    public int B1;
    public org.telegram.ui.Components.y9 C0;
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
    public org.telegram.ui.ActionBar.l6 S0;
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
    public bi.q8 Y0;
    public String Z;
    public m4 Z0;
    public ArrayList f43112a0;
    public ArrayList f43114b0;
    public Uri f43116c0;
    public int f43118d0;
    public org.telegram.messenger.n6 f43121e1;
    public androidx.mediarouter.app.f f43123f1;
    public rh.d f43125g1;
    public z70 f43126h0;
    public boolean f43127h1;
    public ArrayList f43128i0;
    public bg.c0 f43129i1;
    public ArrayList f43130j0;
    public w80 f43131j1;
    public String f43132k0;
    public x80 f43133k1;
    public ActionMode f43134l0;
    public boolean l1;
    public boolean m0;
    public xi.e f43135m1;
    public org.telegram.ui.Components.i01 f43136n0;
    public xi.e n1;
    public kg.k f43137o0;
    public ActionBarLayout f43139p0;
    public y70 f43140p1;
    public ActionBarLayout f43141q0;
    public hi.s6 f43142q1;
    public ActionBarLayout f43143r0;
    public boolean f43144r1;
    public y80 f43145s0;
    public ViewGroup f43146s1;
    public FrameLayout f43147t0;
    public final hi0 f43148t1;
    public w8 f43149u0;
    public org.telegram.ui.ActionBar.t1 f43150u1;
    public k0 f43151v0;
    public org.telegram.ui.ActionBar.t1 f43152v1;
    public u80 f43153w0;
    public boolean f43154w1;
    public org.telegram.ui.ActionBar.m3 f43155x0;
    public long f43156x1;
    public org.telegram.ui.ActionBar.o3 f43157y0;
    public int[] f43158y1;
    public org.telegram.ui.Components.sc0 f43159z0;
    public ValueAnimator f43160z1;
    public final ArrayList Q = new ArrayList();
    public final ArrayList f43120e0 = new ArrayList();
    public final ArrayList f43122f0 = new ArrayList();
    public final ArrayList f43124g0 = new ArrayList();
    public final ArrayList A0 = new ArrayList();
    public final ArrayList D0 = new ArrayList();
    public boolean W0 = false;
    public final ArrayList f43113a1 = new ArrayList();
    public final SparseIntArray f43115b1 = new SparseIntArray();
    public int f43117c1 = 5934;
    public final s80 f43119d1 = new Object();
    public boolean f43138o1 = true;

    public LaunchActivity() {
        System.identityHashCode(this);
        this.f43148t1 = new hi0(this);
        this.B1 = 0;
    }

    public static void C0(org.telegram.messenger.c cVar, cx cxVar, CharSequence charSequence, long j3, org.telegram.messenger.gj gjVar, long j10, boolean z10, int i7, int i10) {
        boolean z11;
        org.telegram.ui.Components.ep0 ep0Var;
        org.telegram.ui.Components.ep0 ep0Var2;
        int i11 = cVar.f23202a;
        if (cxVar != null && (ep0Var2 = cxVar.I2) != null && !ep0Var2.f34954n) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z11 && cxVar != null && (ep0Var = cxVar.I2) != null) {
            webPage = ep0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z11) {
                org.telegram.messenger.az.a0(cVar, charSequence, j3, j10, z10, i7, i10);
                return;
            }
            CharSequence H = org.telegram.messenger.az.H(charSequence);
            if (H != null && H.length() != 0) {
                CharSequence[] charSequenceArr = {H};
                org.telegram.messenger.az.C(i11).r0(org.telegram.messenger.yy.b(charSequenceArr[0].toString(), j3, gjVar, gjVar, webPage2, z11, org.telegram.messenger.si.d0(i11).Y(charSequenceArr, true, true), null, null, z10, i7, i10, null, false));
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
        String H12;
        org.telegram.ui.ActionBar.g2 Q = Q();
        if (Q != null) {
            long j3 = tL_attachMenuBot.bot_id;
            ki.e4 b10 = ki.e4.b(i7, j3, j3, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.N() != null && launchActivity.N().k(b10) != null) {
                return;
            }
            TLRPC.User c22 = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(tL_attachMenuBot.bot_id));
            if (c22 == null) {
                H12 = null;
            } else {
                H12 = org.telegram.messenger.np.u1(i7).H1(c22.restriction_reason);
            }
            if (!TextUtils.isEmpty(H12)) {
                org.telegram.messenger.np.u1(i7);
                org.telegram.messenger.np.d5(H12, Q);
                return;
            }
            ki.s2 s2Var = new ki.s2(launchActivity, Q.getResourceProvider());
            s2Var.C0 = false;
            s2Var.B(z10);
            s2Var.m0 = launchActivity;
            s2Var.x(Q, b10);
            s2Var.show();
        }
    }

    public static void J() {
        ox oxVar;
        ArrayList<org.telegram.ui.ActionBar.c2> arrayList;
        org.telegram.ui.ActionBar.g2 T = T();
        if (T != null) {
            if (T.getParentLayout() instanceof ActionBarLayout) {
                oxVar = ((ActionBarLayout) T.getParentLayout()).x();
            } else {
                oxVar = null;
            }
            if (oxVar != null && (arrayList = oxVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    oxVar.sheetsStack.get(size).a(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.c2> arrayList2 = T.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    T.sheetsStack.get(size2).a(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = ki.s2.f18927b1.iterator();
            while (it.hasNext()) {
                arrayList3.add((ki.s2) it.next());
            }
            int size3 = arrayList3.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj = arrayList3.get(i7);
                i7++;
                ((ki.s2) obj).o(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.g2 L() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f30369b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.r4) i5.c.h(1, H1.Q))).t();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return ((ActionBarLayout) H1.M()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.g2 Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f30369b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.r4) i5.c.h(1, H1.Q)).getLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return H1.M().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.g2 T() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f30369b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.r4) i5.c.h(1, H1.Q)).getSafeLastFragment();
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
            return org.telegram.messenger.hd.N0(i7, str);
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
        di.oc ocVar;
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((ocVar = launchActivity.A1) == null || ((View) ocVar.f6427a) != decorView)) {
                launchActivity.A1 = new di.oc(decorView);
            }
            di.oc ocVar2 = launchActivity.A1;
            if (ocVar2 != null) {
                View view = (View) ocVar2.f6427a;
                ArrayList arrayList = ocVar2.f9503b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(a8.w9.a(0.0f, 0.0f, f10, f11), a8.w9.a(view.getWidth(), 0.0f, f10, f11)), Math.max(a8.w9.a(0.0f, view.getHeight(), f10, f11), a8.w9.a(view.getWidth(), view.getHeight(), f10, f11))) * 2.0f) / (org.telegram.messenger.g0.f24045p * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    di.nc ncVar = new di.nc(f10, f11, f12);
                    ofFloat.addUpdateListener(new ch.w(1, ocVar2, ncVar));
                    ofFloat.addListener(new ah.l(1, ocVar2, ncVar));
                    ofFloat.setInterpolator(org.telegram.ui.Components.nr.f37962g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(ncVar);
                    ocVar2.f1();
                    ofFloat.start();
                }
            }
        }
    }

    public final void A() {
        if (this.P == org.telegram.messenger.k10.f24968t0 && this.f43135m1 != null) {
            return;
        }
        xi.e eVar = this.f43135m1;
        if (eVar != null) {
            eVar.b();
            this.f43135m1 = null;
        }
        int i7 = org.telegram.messenger.k10.f24968t0;
        this.P = i7;
        xi.e eVar2 = new xi.e(org.telegram.messenger.ls.f(i7), this);
        eVar2.c(org.telegram.messenger.ls.f25362p3);
        eVar2.c(org.telegram.messenger.ls.I2);
        eVar2.c(org.telegram.messenger.ls.f25328j0);
        eVar2.c(org.telegram.messenger.ls.Z4);
        eVar2.c(org.telegram.messenger.ls.T1);
        eVar2.c(org.telegram.messenger.ls.M0);
        eVar2.c(org.telegram.messenger.ls.R0);
        eVar2.c(org.telegram.messenger.ls.f25288c1);
        eVar2.c(org.telegram.messenger.ls.Q);
        eVar2.c(org.telegram.messenger.ls.N0);
        eVar2.c(org.telegram.messenger.ls.Y1);
        eVar2.c(org.telegram.messenger.ls.Z1);
        eVar2.c(org.telegram.messenger.ls.f25399v1);
        eVar2.c(org.telegram.messenger.ls.f25407w2);
        eVar2.c(org.telegram.messenger.ls.f25413x1);
        eVar2.c(org.telegram.messenger.ls.f25343l5);
        eVar2.c(org.telegram.messenger.ls.f25327i5);
        eVar2.c(org.telegram.messenger.ls.f25397u5);
        eVar2.c(org.telegram.messenger.ls.T5);
        this.f43135m1 = eVar2;
    }

    public final void A0(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.A0(android.net.Uri):void");
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f43129i1 == null && org.telegram.messenger.cz.f23430p) {
                this.f43129i1 = bg.c0.b(this, this.f43151v0);
            }
            bg.c0 c0Var = this.f43129i1;
            if (c0Var != null && !org.telegram.messenger.cz.f23430p) {
                c0Var.c();
                this.f43129i1 = null;
            }
        }
    }

    public final void B0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final vf.b r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.B0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, vf.b, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void C(int i7) {
        K1 = this;
        Set set = org.telegram.messenger.z0.f28275a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - org.telegram.messenger.cz.H) >= 86400) {
            org.telegram.messenger.cz.H = currentTimeMillis;
            Utilities.f22811f.c(new org.telegram.messenger.x0(currentTimeMillis, org.telegram.messenger.w7.j(4), 0));
        }
        if (org.telegram.messenger.s2.f26730a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - org.telegram.messenger.cz.I) >= 3600) {
                org.telegram.messenger.cz.I = currentTimeMillis2;
                Utilities.f22811f.c(new jg.x(currentTimeMillis2, 7));
            }
        }
        if ((Build.VERSION.SDK_INT >= 26 && i7 == 0) || this.f43154w1) {
            return;
        }
        Utilities.f22810e.d(new u70(this, i7, 1), 2000L);
    }

    public final void D0(int i7) {
        this.f43157y0.setInternalNavigationBarColor(i7);
        org.telegram.ui.ActionBar.f3 N = N();
        if (N != null) {
            N.setNavigationBarColor(i7);
        }
    }

    public final void E() {
        int i7;
        boolean z10;
        if (org.telegram.messenger.g0.Q1() && this.f43143r0 != null) {
            Boolean bool = org.telegram.messenger.g0.L;
            int i10 = 0;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (org.telegram.messenger.t0.f26931b != null && org.telegram.messenger.t0.f26931b.getResources().getBoolean(2131034114)) {
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
                List<org.telegram.ui.ActionBar.g2> fragmentStack = this.f43139p0.getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    while (1 < fragmentStack.size()) {
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentStack.get(1);
                        if (g2Var instanceof bn) {
                            bn bnVar = (bn) g2Var;
                            bnVar.f46115m5 = true;
                            bnVar.f46126n5 = true;
                        }
                        g2Var.onPause();
                        g2Var.onFragmentDestroy();
                        g2Var.setParentLayout(null);
                        fragmentStack.remove(g2Var);
                        this.f43143r0.c(-1, g2Var);
                    }
                    org.telegram.ui.Components.sc0 sc0Var = this.f43159z0;
                    if (sc0Var == null || sc0Var.f39553b.getVisibility() != 0) {
                        this.f43139p0.X(true, true);
                        this.f43143r0.X(true, true);
                    }
                }
                ViewGroup view = this.f43143r0.getView();
                if (this.f43143r0.getFragmentStack().isEmpty()) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                view.setVisibility(i7);
                w8 w8Var = this.f43149u0;
                if (!this.f43143r0.getFragmentStack().isEmpty()) {
                    i10 = 8;
                }
                w8Var.setVisibility(i10);
                return;
            }
            this.N0 = true;
            List<org.telegram.ui.ActionBar.g2> fragmentStack2 = this.f43143r0.getFragmentStack();
            if (!fragmentStack2.isEmpty()) {
                while (fragmentStack2.size() > 0) {
                    org.telegram.ui.ActionBar.g2 g2Var2 = fragmentStack2.get(0);
                    if (g2Var2 instanceof bn) {
                        bn bnVar2 = (bn) g2Var2;
                        bnVar2.f46115m5 = true;
                        bnVar2.f46126n5 = true;
                    }
                    g2Var2.onPause();
                    g2Var2.onFragmentDestroy();
                    g2Var2.setParentLayout(null);
                    fragmentStack2.remove(g2Var2);
                    this.f43139p0.c(-1, g2Var2);
                }
                org.telegram.ui.Components.sc0 sc0Var2 = this.f43159z0;
                if (sc0Var2 == null || sc0Var2.f39553b.getVisibility() != 0) {
                    this.f43139p0.X(true, true);
                }
            }
            this.f43143r0.getView().setVisibility(8);
            w8 w8Var2 = this.f43149u0;
            if (!this.f43139p0.getFragmentStack().isEmpty()) {
                i10 = 8;
            }
            w8Var2.setVisibility(i10);
        }
    }

    public final void E0() {
        org.telegram.ui.ActionBar.o3 o3Var;
        ViewGroup view;
        int i7;
        if (this.f43157y0.indexOfChild(this.f43145s0) != -1) {
            o3Var = this.f43157y0;
            view = this.f43145s0;
        } else {
            o3Var = this.f43157y0;
            view = this.f43139p0.getView();
        }
        int indexOfChild = o3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f43157y0.removeViewAt(indexOfChild);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            y80 y80Var = new y80(this, this);
            this.f43145s0 = y80Var;
            if (indexOfChild != -1) {
                this.f43157y0.addView(y80Var, indexOfChild, c8.ma.c(-1.0f, -1));
            } else {
                this.f43157y0.addView(y80Var, c8.ma.c(-1.0f, -1));
            }
            w8 w8Var = new w8(this, null);
            this.f43149u0 = w8Var;
            w8Var.setOccupyStatusBar(false);
            this.f43149u0.U(org.telegram.ui.ActionBar.m6.s0());
            this.f43145s0.addView(this.f43149u0, c8.ma.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.f43139p0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f43139p0.getView());
            }
            this.f43145s0.addView(this.f43139p0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f43143r0 = actionBarLayout;
            actionBarLayout.U0 = true;
            actionBarLayout.setFragmentStack(this.f43124g0);
            this.f43143r0.setDelegate(this);
            this.f43145s0.addView(this.f43143r0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f43147t0 = frameLayout;
            ArrayList arrayList = this.f43122f0;
            int i10 = 8;
            if (arrayList.isEmpty()) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            frameLayout.setVisibility(i7);
            this.f43147t0.setBackgroundColor(1056964608);
            this.f43145s0.addView(this.f43147t0);
            this.f43147t0.setOnTouchListener(new c0(this, 3));
            this.f43147t0.setOnClickListener(new bi.o(23));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f43141q0 = actionBarLayout2;
            actionBarLayout2.T0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f43141q0.setBackgroundView(this.f43147t0);
            this.f43141q0.setUseAlphaAnimations(true);
            this.f43141q0.setFragmentStack(arrayList);
            this.f43141q0.setDelegate(this);
            this.f43141q0.setDrawerLayoutContainer(this.f43157y0);
            ViewGroup view2 = this.f43141q0.getView();
            if (!arrayList.isEmpty()) {
                i10 = 0;
            }
            view2.setVisibility(i10);
            this.f43145s0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f43139p0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f43139p0.getView());
            }
            this.f43139p0.setFragmentStack(this.f43120e0);
            if (indexOfChild != -1) {
                this.f43157y0.addView(this.f43139p0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f43157y0.addView(this.f43139p0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        c8.sb.a(this, org.telegram.messenger.cz.f23455x1, false);
    }

    public final void F(boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.ActionBar.g2 g2Var;
        int x02;
        zm zmVar;
        boolean z13;
        ArrayList arrayList = this.f43120e0;
        boolean z14 = true;
        if (!arrayList.isEmpty()) {
            g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList);
        } else {
            g2Var = null;
        }
        char c10 = 2;
        if (g2Var != null && (g2Var.isRemovingFromStack() || g2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(2, arrayList);
            } else {
                g2Var = null;
            }
        }
        if (g2Var != null) {
            g2Var.hasForceLightStatusBar();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (z11) {
            if (g2Var != null) {
                z13 = g2Var.isLightStatusBar();
                if (g2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) g2Var.getParentLayout();
                    if (actionBarLayout.x() != null && actionBarLayout.x().getLastSheet() != null) {
                        org.telegram.ui.ActionBar.c2 lastSheet = actionBarLayout.x().getLastSheet();
                        if (lastSheet.s()) {
                            z13 = lastSheet.f();
                        }
                    } else {
                        ArrayList<org.telegram.ui.ActionBar.c2> arrayList2 = g2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) i5.c.h(1, g2Var.sheetsStack);
                            if (c2Var.s()) {
                                z13 = c2Var.f();
                            }
                        }
                    }
                }
            } else {
                z13 = i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29661s8, true)) > 0.699999988079071d;
            }
            org.telegram.messenger.g0.o3(this, z13);
        }
        if (i7 >= 26 && z12 && (!z10 || g2Var == null || !g2Var.isInPreviewMode())) {
            if (g2Var != null && z10) {
                x02 = g2Var.getNavigationBarColor();
            } else {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29324a7, true);
            }
            if (g2Var instanceof bn) {
                bn bnVar = (bn) g2Var;
                if (!bnVar.f46070ic || (bnVar.f46236w.f56655s != 1 && ((zmVar = bnVar.Ba) == null || !zmVar.f54599q))) {
                    c10 = 1;
                }
            } else {
                c10 = 0;
            }
            if (N() != null && N().I > 0) {
                c10 = 0;
            }
            if (this.f43139p0.x() != null) {
                ox x10 = this.f43139p0.x();
                if (x10.sheetsStack != null) {
                    for (int i10 = 0; i10 < x10.sheetsStack.size(); i10++) {
                        org.telegram.ui.ActionBar.c2 c2Var2 = x10.sheetsStack.get(i10);
                        if (c2Var2.y()) {
                            x02 = c2Var2.e(x02);
                            c10 = 0;
                        }
                    }
                }
            }
            Iterator it = ki.s2.f18927b1.iterator();
            while (it.hasNext()) {
                x02 = ((ki.s2) it.next()).e(x02);
                c10 = 0;
            }
            D0(x02);
            if ((c10 != 0 || org.telegram.messenger.g0.B(x02) < 0.721f) && c10 != 1) {
                z14 = false;
            }
            org.telegram.messenger.g0.l3(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final org.telegram.ui.ActionBar.t1 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.t1 p10 = alertDialog$Builder.p();
            p10.setCanceledOnTouchOutside(true);
            p10.setOnDismissListener(new di.u1(9, this, p10));
            this.D0.add(p10);
            return p10;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    @Override
    public final boolean G() {
        ArrayList arrayList = this.V;
        if ((arrayList != null && arrayList.size() == 1) || this.S != null) {
            return true;
        }
        return false;
    }

    public final void H(boolean z10) {
        org.telegram.messenger.t3 t3Var;
        long j3;
        boolean z11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z12 = false;
        if (sharedInstance != null && (t3Var = sharedInstance.groupCall) != null) {
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
                j3 = org.telegram.messenger.k10.i(this.P).f24987n;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(j3);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && groupCallParticipant.raise_hand_rating != 0) {
                z12 = true;
            }
            this.m0 = z12;
            if (!z10 && z13 && !z12 && !z11 && f40.C5 == null) {
                N0(38);
                return;
            }
            return;
        }
        this.m0 = false;
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.g2 g2Var;
        ArrayList arrayList = this.f43122f0;
        if (!arrayList.isEmpty()) {
            g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f43124g0;
            if (!arrayList2.isEmpty()) {
                g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.f43120e0;
                if (!arrayList3.isEmpty()) {
                    g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList3);
                } else {
                    g2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.lc.a(g2Var)) {
            aVar.a(org.telegram.ui.Components.lc.b0(g2Var)).j();
        }
    }

    public final void I() {
        ArrayList arrayList = this.f43120e0;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.g2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (org.telegram.messenger.g0.Q1()) {
            ArrayList arrayList2 = this.f43122f0;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((org.telegram.ui.ActionBar.g2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f43124g0;
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                ((org.telegram.ui.ActionBar.g2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void I0() {
        String str;
        String str2;
        char c10;
        org.telegram.messenger.dd ddVar;
        if (org.telegram.messenger.k10.i(this.P).p()) {
            try {
                if (!this.H0 && !org.telegram.messenger.t0.f26939x) {
                    String string = org.telegram.messenger.np.g1().getString("language_showed2", "");
                    final String str3 = org.telegram.messenger.np.u1(this.P).R3;
                    if (string.equals(str3)) {
                        if (org.telegram.messenger.s2.f26730a) {
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
                            if (ddVar2.f23531c.equals("en")) {
                                ddVarArr[c10] = ddVar2;
                            }
                            if (ddVar2.f23531c.replace("_", "-").equals(str3) || ddVar2.f23531c.equals(str) || ddVar2.f23531c.equals(str2)) {
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
                        if (org.telegram.messenger.s2.f26730a) {
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
                            public final LaunchActivity f46490b;

                            {
                                this.f46490b = this;
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
                                        final LaunchActivity launchActivity = this.f46490b;
                                        final org.telegram.messenger.dd[] ddVarArr2 = ddVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.g0.g3(new Runnable() {
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
                                        final LaunchActivity launchActivity2 = this.f46490b;
                                        final org.telegram.messenger.dd[] ddVarArr3 = ddVarArr;
                                        final String str7 = str3;
                                        org.telegram.messenger.g0.g3(new Runnable() {
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
                            public final LaunchActivity f46490b;

                            {
                                this.f46490b = this;
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
                                        final LaunchActivity launchActivity = this.f46490b;
                                        final org.telegram.messenger.dd[] ddVarArr2 = ddVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.g0.g3(new Runnable() {
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
                                        final LaunchActivity launchActivity2 = this.f46490b;
                                        final org.telegram.messenger.dd[] ddVarArr3 = ddVarArr;
                                        final String str7 = str3;
                                        org.telegram.messenger.g0.g3(new Runnable() {
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
        if (this.f43157y0 != null && !isFinishing()) {
            if (this.f43159z0 == null) {
                this.f43159z0 = new org.telegram.ui.Components.sc0(this);
            }
            org.telegram.messenger.cz.f23453x = true;
            int i11 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f43799s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, true);
            } else if (g4.G() && g4.v().W) {
                g4.v().m(false, true);
            }
            hi.sa.w();
            org.telegram.messenger.gj gjVar = MediaController.B().f22771v0;
            if (gjVar != null && gjVar.h4()) {
                MediaController.B().q(true, true, false, false);
            }
            this.f43159z0.show();
            org.telegram.ui.Components.rc0 rc0Var = this.f43159z0.f39553b;
            ArrayList arrayList = this.A0;
            arrayList.isEmpty();
            rc0Var.m(z11, i7, i10, new h60(8, this, bhVar));
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Components.qc0 qc0Var = (org.telegram.ui.Components.qc0) arrayList.get(i12);
                if (z10) {
                    int size = arrayList.size() - 1;
                }
                qc0Var.m(z11, i7, i10, null);
            }
            org.telegram.messenger.cz.C = true;
            h80 h80Var = new h80(this);
            this.f43159z0.f39553b.setDelegate(h80Var);
            int size2 = arrayList.size();
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((org.telegram.ui.Components.qc0) obj).setDelegate(h80Var);
            }
            try {
                org.telegram.messenger.ys.t(org.telegram.messenger.k10.f24968t0).Y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void L0(int i7, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f10;
        if (this.B0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, frameLayout, null);
            int i10 = org.telegram.messenger.g0.f24040m;
            if (i10 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i10));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(2131231645);
            linearLayout.addView(imageView, c8.ma.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i11 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.messenger.f3.l(textView, i11, null, 1, 17.0f);
            textView.setText(org.telegram.messenger.hd.N0(2131746588, null));
            linearLayout.addView(textView, c8.ma.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f41916a = textView2;
            org.telegram.ui.ActionBar.t6.U(textView2, i11, null);
            org.telegram.ui.ActionBar.t6.G(textView2, org.telegram.ui.ActionBar.m6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(false));
            textView2.setGravity(51);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            linearLayout.addView(textView2, c8.ma.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f10 = 4.0f;
            scrollView.setPadding(org.telegram.messenger.g0.L(24.0f), i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, c8.ma.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(org.telegram.messenger.hd.N0(2131751592, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i12 = org.telegram.ui.ActionBar.m6.f29773y6;
            org.telegram.ui.ActionBar.t6.U(textView3, i12, null);
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.y J0 = org.telegram.ui.ActionBar.m6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.x0(null, i12, false));
            org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i12, 25);
            textView3.setBackground(J0);
            org.telegram.ui.ActionBar.t6.j(textView3, J0, null, g10, null);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f));
            frameLayout.addView(textView3, c8.ma.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    wy0 wy0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String N0 = org.telegram.messenger.hd.N0(2131743955, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                            t1Var.S = N0;
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751590, null), new uy0(wy0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131753753, null), null);
                            t1Var.U = org.telegram.messenger.hd.N0(2131743730, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (wy0Var.f41918c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String N02 = org.telegram.messenger.hd.N0(2131743733, null);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                                t1Var2.S = N02;
                                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131754303, null), new uy0(wy0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                t1Var2.U = org.telegram.messenger.hd.a0("TosAgeText", null, 2131743734, org.telegram.messenger.hd.G(wy0Var.f41918c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            wy0Var.a();
                            return;
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(org.telegram.messenger.hd.N0(2131754716, null));
            textView4.setGravity(17);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = org.telegram.messenger.g0.L(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            frameLayout.addView(textView4, c8.ma.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    wy0 wy0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String N0 = org.telegram.messenger.hd.N0(2131743955, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                            t1Var.S = N0;
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751590, null), new uy0(wy0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131753753, null), null);
                            t1Var.U = org.telegram.messenger.hd.N0(2131743730, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (wy0Var.f41918c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String N02 = org.telegram.messenger.hd.N0(2131743733, null);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                                t1Var2.S = N02;
                                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131754303, null), new uy0(wy0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                t1Var2.U = org.telegram.messenger.hd.a0("TosAgeText", null, 2131743734, org.telegram.messenger.hd.G(wy0Var.f41918c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            wy0Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29382d7, view2, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.B0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f43157y0.addView(this.B0, c8.ma.c(-1.0f, -1));
            this.B0.setDelegate(new n80(this));
        } else {
            f10 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = org.telegram.messenger.k10.i(i7).f24971a0;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f28491id.data.equals(tL_help_termsOfService.f28491id.data))) {
            org.telegram.messenger.k10.i(i7).f24971a0 = tL_help_termsOfService;
            org.telegram.messenger.k10.i(i7).v(false);
        }
        org.telegram.ui.Components.wy0 wy0Var = this.B0;
        if (wy0Var.getVisibility() != 0) {
            wy0Var.setVisibility(0);
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
                        org.telegram.ui.Components.ta taVar = new org.telegram.ui.Components.ta(L2, L3);
                        spannableStringBuilder.replace(i14, i13 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(taVar, i14, i15, 33);
                    }
                }
            }
        }
        wy0Var.f41916a.setText(spannableStringBuilder);
        wy0Var.f41918c = tL_help_termsOfService;
        wy0Var.d = i7;
        this.B0.animate().alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.F).setListener(null).start();
    }

    public final org.telegram.ui.ActionBar.r4 M() {
        ActionBarLayout actionBarLayout = this.f43139p0;
        ArrayList arrayList = this.Q;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.r4) i5.c.h(1, arrayList);
        }
        return actionBarLayout;
    }

    public final void M0(int i7, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        if (this.C0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
            frameLayout.f42369x = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.m6.x0(null, i10, false), 0});
            frameLayout.f42370y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.m6.x0(null, i10, false), 0});
            org.telegram.ui.ActionBar.t6.h(i10, frameLayout, null);
            int i11 = (int) (org.telegram.messenger.g0.f24040m / org.telegram.messenger.g0.f24045p);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f24040m));
            ?? imageView = new ImageView(this);
            imageView.f(2131624168, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().K(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(14.0f));
            frameLayout2.addView((View) imageView, c8.ma.d(-2, -2.0f, 17, 0.0f, i11, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.x9(frameLayout));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f42364f = scrollView;
            org.telegram.messenger.g0.x3(scrollView, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29661s8, false));
            scrollView.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, c8.ma.d(-1, -1.0f, 51, 27.0f, i11 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(textView, i12, null);
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.N0(2131743571, null));
            frameLayout3.addView(textView, c8.ma.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f42360a = textView2;
            org.telegram.ui.ActionBar.t6.U(textView2, i12, null);
            org.telegram.ui.ActionBar.t6.G(textView2, org.telegram.ui.ActionBar.m6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(false));
            textView2.setGravity(49);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            frameLayout3.addView(textView2, c8.ma.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            bi.e3 e3Var = new bi.e3(this, 13);
            frameLayout.d = e3Var;
            e3Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            e3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
            e3Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            frameLayout.addView(e3Var, c8.ma.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            e3Var.setOnClickListener(new org.telegram.ui.Components.x9(frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f42361b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            e3Var.addView(textView3, c8.ma.e(-2, -2, 17));
            bi.e3 e3Var2 = new bi.e3(14, this, (Object) frameLayout);
            frameLayout.f42362c = e3Var2;
            e3Var2.setWillNotDraw(false);
            e3Var2.setAlpha(0.0f);
            e3Var2.setScaleX(0.1f);
            e3Var2.setScaleY(0.1f);
            e3Var2.setVisibility(4);
            org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(e3Var2);
            frameLayout.f42363e = sh0Var;
            sh0Var.d(null, true, false);
            sh0Var.f39592o = -1;
            e3Var.addView(e3Var2, c8.ma.e(36, 36, 17));
            this.C0 = frameLayout;
            this.f43157y0.addView((View) frameLayout, c8.ma.c(-1.0f, -1));
        }
        org.telegram.ui.Components.y9 y9Var = this.C0;
        TextView textView4 = y9Var.f42361b;
        y9Var.f42368w = 0;
        y9Var.f42365n = tL_help_appUpdate;
        y9Var.f42367s = i7;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            y9Var.f42366r = org.telegram.messenger.w7.r(null, document);
        }
        if (y9Var.getVisibility() != 0) {
            y9Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        org.telegram.messenger.gj.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
        y9Var.f42360a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            textView4.setText(org.telegram.messenger.hd.N0(2131743577, null) + String.format(Locale.US, " (%1$s)", org.telegram.messenger.g0.i0(tL_help_appUpdate.document.size, false, false)));
        } else {
            textView4.setText(org.telegram.messenger.hd.N0(2131743577, null));
        }
        org.telegram.messenger.ls.f(y9Var.f42367s).c(y9Var, org.telegram.messenger.ls.Y1);
        org.telegram.messenger.ls.f(y9Var.f42367s).c(y9Var, org.telegram.messenger.ls.Z1);
        org.telegram.messenger.ls.f(y9Var.f42367s).c(y9Var, org.telegram.messenger.ls.X1);
        if (z10) {
            org.telegram.messenger.t0.u();
        }
    }

    public final org.telegram.ui.ActionBar.f3 N() {
        ActionBarLayout actionBarLayout = this.f43143r0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f43143r0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.f43139p0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.f43139p0.getBottomSheetTabs();
        }
        return null;
    }

    public final void N0(int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.f43120e0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.g2 g2Var = this.f43139p0.getFragmentStack().get(this.f43139p0.getFragmentStack().size() - 1);
            if (g2Var instanceof me0) {
                g2Var = ((me0) g2Var).c0();
            }
            UndoView undoView = null;
            if (g2Var instanceof bn) {
                bn bnVar = (bn) g2Var;
                if (chat != null && bnVar.a() == (-chat.f28434id)) {
                    chat = null;
                }
                bnVar.h8();
                undoView = bnVar.N3;
            } else if (g2Var instanceof cx) {
                undoView = ((cx) g2Var).l4();
            } else if (g2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) g2Var).M;
            }
            if (undoView != null) {
                undoView.m(0L, chat, i7);
            }
            if (i7 == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    public final org.telegram.ui.ActionBar.g2 O() {
        if (de0.B1(this.P, false).getInt("currentViewNum", 0) != 0) {
            return new de0();
        }
        return new v50();
    }

    public final void O0(int i7) {
        P0(i7, new m60(2));
    }

    @Override
    public final boolean P(org.telegram.ui.cx r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.P(org.telegram.ui.cx):boolean");
    }

    public final void P0(int i7, org.telegram.messenger.j9 j9Var) {
        if (i7 != org.telegram.messenger.k10.f24968t0 && org.telegram.messenger.k10.r(i7)) {
            this.l1 = true;
            ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
            org.telegram.messenger.k10.f24968t0 = i7;
            org.telegram.messenger.k10.i(0).v(false);
            A();
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25308f4, Integer.valueOf(i7));
            if (org.telegram.messenger.g0.Q1()) {
                this.f43141q0.a0();
                this.f43143r0.a0();
                if (!this.N0) {
                    if (this.f43143r0.getFragmentStack().isEmpty()) {
                        this.f43149u0.setVisibility(0);
                    }
                    this.f43143r0.getView().setVisibility(8);
                }
                this.f43141q0.getView().setVisibility(8);
            }
            this.f43139p0.a0();
            this.f43139p0.c(-3, (me0) j9Var.m(null));
            this.f43139p0.X(true, true);
            if (org.telegram.messenger.g0.Q1()) {
                this.f43141q0.X(true, true);
                this.f43143r0.X(true, true);
            }
            if (!org.telegram.messenger.t0.f26939x) {
                ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
            }
            if (org.telegram.messenger.k10.i(i7).f24971a0 != null) {
                L0(i7, org.telegram.messenger.k10.i(i7).f24971a0);
            }
            Q0();
            this.l1 = false;
        }
    }

    public final void Q0() {
        int i7;
        String str;
        if (this.f43139p0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.P).getConnectionState();
            this.f43118d0 = connectionState;
            t60 t60Var = null;
            if (connectionState == 2) {
                str = "WaitingForNetwork";
                i7 = 2131742967;
            } else if (connectionState == 5) {
                str = "Updating";
                i7 = 2131743565;
            } else if (connectionState == 4) {
                str = "ConnectingToProxyWithDots";
                i7 = 2131751793;
            } else if (connectionState == 1) {
                str = "Connecting";
                i7 = 2131751797;
            } else {
                i7 = 0;
                str = null;
            }
            if (connectionState == 1 || connectionState == 4) {
                t60Var = new t60(this, 9);
            }
            ActionBarLayout actionBarLayout = this.f43139p0;
            actionBarLayout.N0 = str;
            actionBarLayout.O0 = i7;
            actionBarLayout.P0 = t60Var;
            for (int i10 = 0; i10 < actionBarLayout.V0.size(); i10++) {
                ((org.telegram.ui.ActionBar.g2) actionBarLayout.V0.get(i10)).setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, t60Var);
            }
        }
    }

    public final int R() {
        return this.f43120e0.size();
    }

    public final rh.d S() {
        return this.f43125g1;
    }

    public final boolean W(android.content.Intent r122, boolean r123, boolean r124, boolean r125, vf.b r126, boolean r127, boolean r128) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.W(android.content.Intent, boolean, boolean, boolean, vf.b, boolean, boolean):boolean");
    }

    public final void X() {
        ActionMode actionMode = this.f43134l0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Y(int i7, TLRPC.User user, String str, vf.b bVar) {
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = u12.s1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new d3.b(1), new n60(this, bVar, u12, i7, user));
    }

    @Override
    public final void a(float f10) {
        if (g4.G() && g4.v().W) {
            g4 v = g4.v();
            v.Q();
            g4.e0(v);
            if (v.f47959g0 != null) {
                v.f47973v0[0].f49182b.g1();
                v.f47973v0[1].f49182b.g1();
                v.f47959g0.invalidate();
                v.f47969r0.invalidate();
                if (f10 == 1.0f) {
                    v.f47973v0[0].f49183c.f();
                    v.f47973v0[1].f49183c.f();
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
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.f43141q0) {
            this.f43143r0.X(z10, z10);
            this.f43139p0.X(z10, z10);
        }
    }

    @Override
    public final boolean c(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.g2 g2Var) {
        boolean z10;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (org.telegram.messenger.g0.Q1()) {
            boolean z11 = g2Var instanceof cx;
            if (!z11 && !(g2Var instanceof me0)) {
                if ((g2Var instanceof bn) && !((bn) g2Var).c()) {
                    boolean z12 = this.N0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f43143r0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f43149u0.setVisibility(8);
                        this.f43143r0.a0();
                        this.f43143r0.c(-1, g2Var);
                        if (!this.f43141q0.getFragmentStack().isEmpty()) {
                            while (this.f43141q0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f43141q0;
                                actionBarLayout4.d0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f43141q0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.f43139p0)) {
                        actionBarLayout2.c(-1, g2Var);
                        if (!this.f43141q0.getFragmentStack().isEmpty()) {
                            while (this.f43141q0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f43141q0;
                                actionBarLayout5.d0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f43141q0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f43141q0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i7 = 0;
                    while (true) {
                        if (i7 < 4) {
                            if (org.telegram.messenger.k10.i(i7).p()) {
                                break;
                            }
                            i7++;
                        } else {
                            i7 = -1;
                            break;
                        }
                    }
                    if ((g2Var instanceof de0) && i7 == -1) {
                        this.f43149u0.setVisibility(0);
                        this.f43147t0.setBackgroundColor(0);
                    } else {
                        this.f43147t0.setBackgroundColor(2130706432);
                    }
                    this.f43141q0.c(-1, g2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.f43139p0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z11 && !((cx) g2Var).x4()) {
                    z10 = false;
                }
                if (z10) {
                    this.f43139p0.a0();
                    this.f43139p0.c(-1, g2Var);
                    this.f43141q0.a0();
                    this.f43141q0.getView().setVisibility(8);
                    if (!this.N0 && this.f43143r0.getFragmentStack().isEmpty()) {
                        this.f43149u0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void c0() {
        org.telegram.ui.ActionBar.r4[] r4VarArr = {this.f43139p0, this.f43141q0, this.f43143r0};
        for (int i7 = 0; i7 < 3; i7++) {
            org.telegram.ui.ActionBar.r4 r4Var = r4VarArr[i7];
            if (r4Var instanceof ActionBarLayout) {
                ((ActionBarLayout) r4Var).E();
            }
        }
    }

    public final boolean d0(boolean z10) {
        boolean z11;
        pg.i iVar = c8.sb.f4986a;
        if (iVar != null) {
            if (iVar.f55668s) {
                if (z10) {
                    iVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.sc0 sc0Var = this.f43159z0;
        if (sc0Var != null && sc0Var.f39553b.getVisibility() == 0) {
            if (z10) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.m3 m3Var = this.f43155x0;
            if (m3Var != null && (z11 = m3Var.V)) {
                if (z10 && z11) {
                    m3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.em0.I;
                if (t1Var != null) {
                    if (z10) {
                        t1Var.dismiss();
                        org.telegram.ui.Components.em0.I = null;
                        return false;
                    }
                } else if (ns.f50283g0 != null && ns.p().E) {
                    if (z10) {
                        ns.p().n();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f43799s) {
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
            xi.e eVar = this.f43135m1;
            if (eVar != null) {
                eVar.b();
                this.f43135m1 = null;
            }
            xi.e eVar2 = this.n1;
            if (eVar2 != null) {
                eVar2.b();
                this.n1 = null;
            }
            y70 y70Var = this.f43140p1;
            if (y70Var != null && (hashSet = org.telegram.messenger.qc.f26433n) != null) {
                hashSet.remove(y70Var);
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
            if (org.telegram.messenger.s2.f26730a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodePause");
            }
            org.telegram.messenger.g0.r(this.Z0);
            this.Z0 = null;
        }
        if (org.telegram.messenger.cz.f23439s.length() != 0) {
            org.telegram.messenger.cz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var = new m4(this, 10);
            this.Z0 = m4Var;
            if (org.telegram.messenger.cz.f23453x) {
                org.telegram.messenger.g0.h3(m4Var, 1000L);
                if (org.telegram.messenger.s2.f26730a) {
                    org.telegram.messenger.a8.b("schedule app lock in 1000");
                }
            } else if (org.telegram.messenger.cz.f23456y != 0) {
                if (org.telegram.messenger.s2.f26730a) {
                    org.telegram.messenger.a8.b("schedule app lock in " + ((org.telegram.messenger.cz.f23456y * 1000) + 1000));
                }
                org.telegram.messenger.g0.h3(this.Z0, (org.telegram.messenger.cz.f23456y * 1000) + 1000);
            }
        } else {
            org.telegram.messenger.cz.B = 0;
        }
        org.telegram.messenger.cz.y();
    }

    public final void h0() {
        if (this.Z0 != null) {
            if (org.telegram.messenger.s2.f26730a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodeResume");
            }
            org.telegram.messenger.g0.r(this.Z0);
            this.Z0 = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (org.telegram.messenger.cz.B != 0) {
            org.telegram.messenger.cz.B = 0;
            org.telegram.messenger.cz.y();
            if (org.telegram.messenger.s2.f26730a) {
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
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f43799s) {
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
            if (actionBarLayout == this.f43139p0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.l1) {
                e0();
                finish();
                return false;
            } else if (actionBarLayout == this.f43143r0) {
                if (!this.N0) {
                    this.f43149u0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f43141q0 && this.f43139p0.getFragmentStack().isEmpty() && this.f43141q0.getFragmentStack().size() == 1) {
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
        de0 de0Var = new de0();
        t60 t60Var = new t60(this, 0);
        de0Var.G = 3;
        de0Var.f46926a = 12;
        de0Var.f46934e0 = t60Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f35337a |= 256;
                obj.f35338b = indexOf;
                int i7 = lastIndexOf + 1;
                obj.f35339c = i7;
                valueOf.setSpan(new org.telegram.ui.Components.gz0(obj, 0), indexOf, i7, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = valueOf;
            t1Var.U = org.telegram.messenger.hd.N0(2131751189, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752536, null), new at(13, this, de0Var));
            i5.c.y(null, 2131752577, alertDialog$Builder, null);
            return;
        }
        t0(de0Var);
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.p4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.p4):boolean");
    }

    public final void l0(final long j3, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i7, final int i10) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            t0(y91.J0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = org.telegram.messenger.np.u1(this.P).j1(-j3);
        tL_channels_getMessages.f28472id.add(num);
        ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new c70(LaunchActivity.this, tLObject, num, num2, bArr, j3, runnable, str, i7, i10));
            }
        });
    }

    public final void m0(int i7, long j3, TLRPC.TL_error tL_error) {
        bn bnVar = new bn(a8.p0.j(j3, "user_id"));
        t0(bnVar);
        org.telegram.messenger.g0.h3(new up(tL_error, bnVar, org.telegram.messenger.np.u1(i7).c2(Long.valueOf(j3)), 13), 300L);
    }

    public final void n0(int i7, String str, String str2, vf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_importContactToken, new bg.l0(this, bVar, u12, i7, str2, 11));
    }

    public final void o0(int i7, String str, String str2, vf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        u12.f2().a(str, null, new di.b4(this, u12, bVar, i7, str2, 1));
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f43134l0 == actionMode) {
            this.f43134l0 = null;
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f43139p0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.D0 = false;
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f43143r0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.D0 = false;
                ActionBarLayout actionBarLayout3 = this.f43141q0;
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
        this.f43134l0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.f43139p0.s(menu) && org.telegram.messenger.g0.Q1() && !this.f43143r0.s(menu)) {
                this.f43141q0.s(menu);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f43139p0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.D0 = true;
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f43143r0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.D0 = true;
                ActionBarLayout actionBarLayout3 = this.f43141q0;
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
        fi.z3 currentPeerView;
        a8.r7 r7Var;
        VoIPService sharedInstance;
        boolean z10 = false;
        if (org.telegram.messenger.cz.f23439s.length() != 0 && org.telegram.messenger.cz.B != 0) {
            org.telegram.messenger.cz.B = 0;
            if (org.telegram.messenger.s2.f26730a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onActivityResult");
            }
            org.telegram.messenger.k10.i(this.P).v(false);
        }
        if (i7 == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.t0.G = canDrawOverlays;
            if (canDrawOverlays) {
                f40 f40Var = f40.C5;
                if (f40Var != null) {
                    f40Var.L();
                }
                org.telegram.messenger.g0.h3(new t60(this, 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i7, i10, intent);
        String str = null;
        if (i7 >= 22336 && i7 <= 22399) {
            org.telegram.ui.Wallet.e1 e1Var = c8.za.f5131b;
            if (e1Var != null && e1Var.f44147e == this && e1Var.f44148f && e1Var.f44149g == i7) {
                if (i10 != -1) {
                    str = "AUTH_CANCELED";
                }
                e1Var.c(str);
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
            Utilities.d.c(new org.telegram.messenger.j10(3, f10, z10));
        } else if (i7 == 521) {
            hi.s6 s6Var = this.f43142q1;
            if (s6Var != null) {
                if (i10 == -1) {
                    z10 = true;
                }
                s6Var.a(Boolean.valueOf(z10));
                this.f43142q1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f33180p;
            if (themeEditorView != null && (r7Var = themeEditorView.f33191m) != null) {
                r7Var.w(i7, i10, intent);
            }
            ActionBarLayout actionBarLayout = this.f43139p0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.g2 g2Var = this.f43139p0.getFragmentStack().get(this.f43139p0.getFragmentStack().size() - 1);
                g2Var.onActivityResultFragment(i7, i10, intent);
                if (g2Var.getLastStoryViewer() != null && (currentPeerView = g2Var.getLastStoryViewer().f12027o0.getCurrentPeerView()) != null && i10 == -1) {
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
                                fi.n2 n2Var = currentPeerView.f12914s2;
                                if (n2Var != null) {
                                    n2Var.dismiss();
                                }
                                currentPeerView.i0(true);
                            }
                        }
                    } else {
                        currentPeerView.r0();
                        fi.n2 n2Var2 = currentPeerView.f12914s2;
                        if (n2Var2 != null) {
                            n2Var2.f40379e2.j0(i7, intent, null);
                        }
                    }
                }
            }
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f43143r0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f43143r0.getFragmentStack().get(this.f43143r0.getFragmentStack().size() - 1).onActivityResultFragment(i7, i10, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f43141q0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f43141q0.getFragmentStack().get(this.f43141q0.getFragmentStack().size() - 1).onActivityResultFragment(i7, i10, intent);
                }
            }
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25309f5, Integer.valueOf(i7), Integer.valueOf(i10), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (d0(true)) {
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.f43141q0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f43141q0.I();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f43143r0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f43143r0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.g2 g2Var = this.f43143r0.getFragmentStack().get(this.f43143r0.getFragmentStack().size() - 1);
                    if (g2Var.onBackPressed(true)) {
                        g2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.f43139p0.I();
                return;
            }
            this.f43139p0.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        float f11;
        float f12;
        org.telegram.messenger.g0.v(this, configuration);
        this.f43148t1.a();
        org.telegram.messenger.g0.v3(getWindow());
        super.onConfigurationChanged(configuration);
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19437c;
        LaunchActivity launchActivity = (LaunchActivity) d.f19439f;
        if (launchActivity == null || !org.telegram.messenger.g0.H1(launchActivity)) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.h hVar = ((wi.n) arrayList.get(i7)).f60035e;
                if (hVar != null && hVar.h != null && !hVar.K) {
                    Activity activity = hVar.f59993c;
                    org.telegram.messenger.g0.v(activity, activity.getResources().getConfiguration());
                    org.telegram.ui.Components.jn.f36565c = null;
                    Point point = org.telegram.messenger.g0.f24046q;
                    hVar.A = (Math.min(point.x, point.y) - (wi.h.m() * 2.0f)) / hVar.h();
                    int h = (int) (hVar.h() * hVar.f60013z);
                    wi.l lVar = hVar.f59992b;
                    int J = lVar.J();
                    int a02 = lVar.a0();
                    if (J > 0 && a02 > 0) {
                        f10 = a02 / J;
                    } else {
                        f10 = 0.5625f;
                    }
                    int i10 = (int) (((int) (wi.h.i(f10) * f10)) * hVar.f60013z);
                    if (hVar.f60011x != h || hVar.f60012y != i10) {
                        WindowManager.LayoutParams layoutParams = hVar.f59994e;
                        hVar.f60011x = h;
                        layoutParams.width = h;
                        hVar.f60012y = i10;
                        layoutParams.height = i10;
                        hVar.r();
                    }
                    r1.g gVar = hVar.D;
                    gVar.f56359b = hVar.B;
                    gVar.f56360c = true;
                    gVar.f56368m.f56376i = wi.h.n(f11, hVar.f60011x);
                    hVar.D.h();
                    r1.g gVar2 = hVar.E;
                    gVar2.f56359b = hVar.C;
                    gVar2.f56360c = true;
                    gVar2.f56368m.f56376i = wi.h.e(f12, hVar.f60012y);
                    hVar.E.h();
                }
            }
        }
        org.telegram.messenger.g0.c3();
        a0();
        E();
        org.telegram.messenger.g0.g3(new t60(this, 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            int i11 = pipRoundVideoView.f33047y.getInt("sidex", 1);
            int i12 = pipRoundVideoView.f33047y.getInt("sidey", 0);
            float f13 = pipRoundVideoView.f33047y.getFloat("px", 0.0f);
            float f14 = pipRoundVideoView.f33047y.getFloat("py", 0.0f);
            pipRoundVideoView.f33045w.x = PipRoundVideoView.b(f13, i11, pipRoundVideoView.h, true);
            pipRoundVideoView.f33045w.y = PipRoundVideoView.b(f14, i12, pipRoundVideoView.f33042n, false);
            pipRoundVideoView.f33046x.updateViewLayout(pipRoundVideoView.f33037a, pipRoundVideoView.f33045w);
        }
        org.telegram.ui.Components.iu iuVar = org.telegram.ui.Components.iu.S1;
        if (iuVar != null) {
            iuVar.c0(configuration);
        }
        wg.l lVar2 = wg.l.f59830p1;
        if (lVar2 != null) {
            lVar2.c0(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.Z8;
        ThemeEditorView themeEditorView = ThemeEditorView.f33180p;
        if (themeEditorView != null) {
            int i13 = themeEditorView.f33190l.getInt("sidex", 1);
            int i14 = themeEditorView.f33190l.getInt("sidey", 0);
            float f15 = themeEditorView.f33190l.getFloat("px", 0.0f);
            float f16 = themeEditorView.f33190l.getFloat("py", 0.0f);
            themeEditorView.f33187i.x = ThemeEditorView.c(f15, i13, themeEditorView.f33186g, true);
            themeEditorView.f33187i.y = ThemeEditorView.c(f16, i14, themeEditorView.h, false);
            try {
                if (themeEditorView.f33183c.getParent() != null) {
                    themeEditorView.f33188j.updateViewLayout(themeEditorView.f33183c, themeEditorView.f33187i);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (org.telegram.ui.ActionBar.m6.f29575o == 3) {
            org.telegram.ui.ActionBar.m6.F(false);
        }
    }

    @Override
    public final void onCreate(android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public final void onDestroy() {
        bg.c0 c0Var;
        k0 k0Var;
        org.telegram.ui.Wallet.e1 e1Var = c8.za.f5131b;
        if (e1Var != null && e1Var.f44147e == this) {
            e1Var.c("AUTH_CANCELED");
            c8.za.f5131b.e();
        }
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19437c;
        if (((LaunchActivity) d.f19439f) == this) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((wi.n) arrayList.get(size)).b();
            }
            ((wi.p) d.f19438e).c();
            d.f19439f = null;
            ((ArrayList) d.d).clear();
        }
        E1 = false;
        F1--;
        androidx.mediarouter.app.f fVar = this.f43123f1;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.f43123f1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.f43203g9 != null) {
                PhotoViewer.f43203g9.J0();
            }
            if (PhotoViewer.A1()) {
                PhotoViewer.p1().J0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f10 = SecretMediaViewer.f();
                Runnable runnable = f10.f43791o1;
                if (runnable != null) {
                    runnable.run();
                    f10.f43791o1 = null;
                }
                bg.v0 v0Var = f10.f43785k1;
                if (v0Var != null) {
                    v0Var.a();
                    f10.f43785k1 = null;
                }
                org.telegram.messenger.ls.f(f10.f43759a).n(f10, org.telegram.messenger.ls.f25404w);
                org.telegram.messenger.ls.f(f10.f43759a).n(f10, org.telegram.messenger.ls.f25339l0);
                org.telegram.messenger.ls.f(f10.f43759a).n(f10, org.telegram.messenger.ls.f25322i0);
                f10.f43799s = false;
                f10.M = null;
                org.telegram.messenger.ic icVar = f10.f43778h0;
                if (icVar != null) {
                    icVar.a();
                    f10.f43778h0 = null;
                }
                f10.j();
                if (f10.f43762b != null && (k0Var = f10.d) != null) {
                    try {
                        if (k0Var.getParent() != null) {
                            ((WindowManager) f10.f43762b.getSystemService("window")).removeViewImmediate(f10.d);
                        }
                        f10.d = null;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                SecretMediaViewer.f43758w1 = null;
            }
            if (g4.G()) {
                g4.v().r();
            }
            if (ns.f50283g0 != null) {
                ns p10 = ns.p();
                p10.E = false;
                p10.f50298l = null;
                p10.W = null;
                p10.Y = null;
                p10.f50285a0 = null;
                if (p10.f50308w != null && p10.f50310y != null) {
                    Bitmap bitmap = p10.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        p10.v = null;
                    }
                    p10.M = 0.0f;
                    p10.K = false;
                    try {
                        if (p10.f50310y.getParent() != null) {
                            ((WindowManager) p10.f50308w.getSystemService("window")).removeViewImmediate(p10.f50310y);
                        }
                        p10.f50310y = null;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    ns.f50283g0 = null;
                    org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25334k1, 8);
                }
            }
            f40 f40Var = f40.C5;
            if (f40Var != null) {
                f40Var.L();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i7 = org.telegram.ui.ActionBar.m6.f29316a;
            org.telegram.ui.Components.iu iuVar = org.telegram.ui.Components.iu.S1;
            if (iuVar != null) {
                iuVar.L0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f33180p;
            if (themeEditorView != null) {
                themeEditorView.b();
            }
            pg.i iVar = c8.sb.f4986a;
            if (iVar != null) {
                iVar.f55664e.edit().putFloat("x", (float) iVar.f55663c.f56368m.f56376i).putFloat("y", (float) iVar.d.f56368m.f56376i).commit();
            }
            c8.sb.f4986a = null;
            SparseArray sparseArray = org.telegram.ui.Components.p5.f38486r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController B = MediaController.B();
        if (B.K0 == this) {
            B.K0 = null;
        }
        MediaController B2 = MediaController.B();
        if (B2.L0 == this.f43146s1) {
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
            if (this.f43126h0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f43126h0);
            }
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (this.f43131j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f43131j1);
            }
        } else if (i11 >= 33 && this.f43131j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f43133k1);
        }
        org.telegram.ui.Components.gc.h(this.f43151v0);
        VideoAds.dropCache();
        I();
        super.onDestroy();
        e0();
        org.telegram.messenger.n6 n6Var = this.f43121e1;
        if (n6Var != null) {
            n6Var.e();
        }
        if (i11 >= 24 && (c0Var = this.f43129i1) != null) {
            c0Var.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 == 82 && !org.telegram.messenger.cz.C) {
            if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                return super.onKeyUp(i7, keyEvent);
            }
            if (g4.G() && g4.v().W) {
                return super.onKeyUp(i7, keyEvent);
            }
            if (org.telegram.messenger.g0.Q1()) {
                if (this.f43141q0.getView().getVisibility() == 0 && !this.f43141q0.getFragmentStack().isEmpty()) {
                    this.f43141q0.getView().onKeyUp(i7, keyEvent);
                } else if (this.f43143r0.getView().getVisibility() == 0 && !this.f43143r0.getFragmentStack().isEmpty()) {
                    this.f43143r0.getView().onKeyUp(i7, keyEvent);
                } else {
                    this.f43139p0.getView().onKeyUp(i7, keyEvent);
                }
            } else {
                this.f43139p0.getView().onKeyUp(i7, keyEvent);
            }
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.f43139p0;
        if (actionBarLayout != null) {
            actionBarLayout.M();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f43143r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.M();
                }
                ActionBarLayout actionBarLayout3 = this.f43141q0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z10) {
        org.telegram.messenger.g0.E = z10;
        this.f43148t1.a();
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
        ArrayList arrayList = (ArrayList) d.f19437c;
        if (this == ((LaunchActivity) d.f19439f)) {
            d.f19436b = false;
            wi.p pVar = (wi.p) d.f19438e;
            LaunchActivity launchActivity = pVar.f60042b;
            if (launchActivity != null && Build.VERSION.SDK_INT >= 31 && pVar.f60045f == null && pVar.f60044e != null && org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.i(pVar.f60044e);
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                if (nVar.f60034c == 1 && (hVar = nVar.f60035e) != null && !hVar.f59995f && (oVar = hVar.f59998j) != null && hVar.f60000l != null && oVar.isAvailable()) {
                    try {
                        Bitmap bitmap = hVar.f59998j.getBitmap();
                        if (bitmap != null) {
                            hVar.f60000l.setImageBitmap(bitmap);
                            hVar.f60000l.setVisibility(0);
                            hVar.f59998j.setFirstFrameCallback(null);
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
            }
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25329j1, 4096);
        org.telegram.messenger.t0.f26939x = true;
        Utilities.d.c(new jg.x(this.P, 12));
        g0();
        this.f43139p0.O();
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout = this.f43143r0;
            if (actionBarLayout != null) {
                actionBarLayout.O();
            }
            ActionBarLayout actionBarLayout2 = this.f43141q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.O();
            }
        }
        org.telegram.ui.Components.sc0 sc0Var = this.f43159z0;
        if (sc0Var != null) {
            sc0Var.f39553b.k();
        }
        ArrayList arrayList2 = this.A0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((org.telegram.ui.Components.qc0) obj).k();
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26930a;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer p12 = PhotoViewer.p1();
            if (p12.f43297k2 != null) {
                p12.z0(false, false);
            } else {
                org.telegram.ui.Components.i61 i61Var = p12.G2;
                if (i61Var != null && p12.Z2) {
                    i61Var.s0(org.telegram.messenger.g0.H1(p12.E));
                }
            }
        }
        hi.sa saVar = hi.sa.G2;
        if (saVar != null) {
            saVar.u(false);
            hi.ia iaVar = saVar.f15397d1;
            if (iaVar != null) {
                iaVar.f15151f.r();
            }
            hi.ga gaVar = saVar.Y0;
            if (gaVar != null) {
                gaVar.x(0, true);
            }
        }
        org.telegram.ui.Components.voip.h2.a(this);
        hc1 hc1Var = hc1.f48329m1;
        if (hc1Var != null) {
            boolean isInteractive = ((PowerManager) hc1Var.f48333b.getSystemService("power")).isInteractive();
            boolean a10 = c8.nd.a(hc1Var.f48333b);
            if (!a10 && !c8.nd.b(hc1Var.f48333b)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (hc1Var.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a10) {
                int measuredHeight = hc1.f48329m1.f48368u0.getMeasuredHeight();
                hc1 hc1Var2 = hc1.f48329m1;
                org.telegram.ui.Components.voip.h2.f(hc1Var2.f48333b, hc1Var2.f48330a, hc1Var2.f48368u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = hc1.f48329m1.f48364r0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.h2.W = windowInsets.getSystemWindowInsetTop();
                    hc1.f48329m1.f48364r0.getSystemWindowInsetBottom();
                }
            }
            if (hc1Var.f48359n0 && ((!z10 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.h2.d() != null) {
                org.telegram.ui.Components.voip.h2.d().e();
            }
        } else if (org.telegram.ui.Components.voip.h2.d() != null) {
            org.telegram.ui.Components.voip.h2.d().e();
        }
        HashMap hashMap = xh.e.f60580n;
        if (hashMap != null) {
            for (xh.e eVar : hashMap.values()) {
                xh.d dVar = eVar.f60585f;
                if (dVar != null) {
                    dVar.f60570b = true;
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
        ((wi.p) l2.i.d().f19438e).g();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        ((wi.p) l2.i.d().f19438e).f(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        ai.c1 c1Var;
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (!u(i7, strArr, iArr)) {
            return;
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26930a;
        if (this.f43139p0.getFragmentStack().size() != 0) {
            this.f43139p0.getFragmentStack().get(this.f43139p0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (this.f43143r0.getFragmentStack().size() != 0) {
                this.f43143r0.getFragmentStack().get(this.f43143r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
            }
            if (this.f43141q0.getFragmentStack().size() != 0) {
                this.f43141q0.getFragmentStack().get(this.f43141q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i7, strArr, iArr);
            }
        }
        hc1.h(iArr, i7);
        hi.sa saVar = hi.sa.G2;
        if (saVar != null) {
            fi.b bVar = saVar.f15384a;
            Activity activity = saVar.f15388b;
            if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i7 == 111) {
                saVar.f15447t2 = !z10;
                if (z10 && saVar.f15406g0 == 0) {
                    saVar.B0.setCameraThumb(null);
                    if (CameraController.getInstance().isCameraInitied()) {
                        saVar.q();
                    } else {
                        CameraController.getInstance().initCamera(new hi.r8(saVar, 0));
                    }
                }
            } else if (i7 == 114) {
                if (z10) {
                    MediaController.O(0);
                    saVar.e(true);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                    int i10 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder.m(2131624119, 72, org.telegram.ui.ActionBar.m6.x0(null, i10, false), null);
                    alertDialog$Builder.n(i10, null);
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131747105, null));
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.U = W2;
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747106, null), new hi.a9(saVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751760, null), null);
                    t1Var.show();
                }
            } else if (i7 == 112) {
                if (!z10) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, activity, bVar);
                    int i11 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder2.m(2131624117, 72, org.telegram.ui.ActionBar.m6.x0(null, i11, false), null);
                    alertDialog$Builder2.n(i11, null);
                    SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131747115, null));
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                    t1Var2.U = W22;
                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747106, null), new hi.a9(saVar, 3));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131751760, null), null);
                    t1Var2.show();
                }
            } else if (i7 == 115) {
                if (!z10) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, activity, bVar);
                    int i12 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder3.m(2131624119, 72, org.telegram.ui.ActionBar.m6.x0(null, i12, false), null);
                    alertDialog$Builder3.n(i12, null);
                    SpannableStringBuilder W23 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131747119, null));
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28777a;
                    t1Var3.U = W23;
                    alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131747106, null), new hi.a9(saVar, 5));
                    alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131751760, null), null);
                    t1Var3.show();
                }
                if (z10 && (c1Var = saVar.f15468z2) != null) {
                    c1Var.run();
                }
                saVar.f15468z2 = null;
            }
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25315g5, Integer.valueOf(i7), strArr, iArr);
        SparseIntArray sparseIntArray = this.f43115b1;
        if (sparseIntArray.get(i7, -1) >= 0) {
            int i13 = sparseIntArray.get(i7, -1);
            sparseIntArray.delete(i7);
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25377r5, Integer.valueOf(i13));
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.s5, Integer.valueOf(i7), strArr, iArr);
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
        ArrayList arrayList = (ArrayList) d.f19437c;
        ArrayList arrayList2 = (ArrayList) d.d;
        if (this == ((LaunchActivity) d.f19439f)) {
            d.f19436b = true;
            wi.p pVar = (wi.p) d.f19438e;
            if (pVar.f60045f != null && (launchActivity = pVar.f60042b) != null && !org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.d();
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                wi.h hVar = nVar.f60035e;
                if (hVar != null && nVar.f60034c == 1 && hVar.f59996g && !hVar.K) {
                    if (hVar.f59992b.p() && c8.nd.a(hVar.f59993c)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != hVar.f59995f) {
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
        if (org.telegram.ui.ActionBar.m6.f29575o == 3) {
            org.telegram.ui.ActionBar.m6.F(false);
        }
        org.telegram.messenger.rd[] rdVarArr = org.telegram.messenger.rd.P;
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            } else if (org.telegram.messenger.k10.i(i11).p() && !org.telegram.messenger.rd.f(i11).J.isEmpty()) {
                org.telegram.messenger.rd.q();
                break;
            } else {
                i11++;
            }
        }
        H(true);
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25334k1, 4096);
        MediaController B = MediaController.B();
        ViewGroup view = this.f43139p0.getView();
        this.f43146s1 = view;
        B.L0 = view;
        org.telegram.messenger.t0.f26939x = false;
        org.telegram.messenger.np.u1(this.P).f5(null);
        I0();
        Utilities.d.c(new org.telegram.ui.Components.me(27));
        C(0);
        if (Build.VERSION.SDK_INT >= 24 && (veVar = MediaController.f22718b2) != null) {
            Utilities.f22810e.d(new jg.x(veVar.f27357e.size(), 3), 2000L);
        }
        h0();
        org.telegram.ui.Components.sc0 sc0Var = this.f43159z0;
        if (sc0Var != null && sc0Var.f39553b.getVisibility() == 0) {
            this.f43139p0.n();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.f43143r0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f43141q0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.f43159z0.f39553b.l();
            ArrayList arrayList4 = this.A0;
            int size2 = arrayList4.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList4.get(i12);
                i12++;
                ((org.telegram.ui.Components.qc0) obj2).l();
            }
        } else {
            this.f43139p0.P();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout3 = this.f43143r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.P();
                }
                ActionBarLayout actionBarLayout4 = this.f43141q0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.P();
                }
            }
        }
        ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        Q0();
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer p12 = PhotoViewer.p1();
            qq0 qq0Var = p12.f43253f0;
            if (qq0Var != null) {
                qq0Var.invalidate();
                org.telegram.messenger.g0.h3(new ii(p12, 0, 28), 100L);
            }
            org.telegram.ui.Components.i61 i61Var = p12.G2;
            if (i61Var != null) {
                i61Var.p0(i61Var.S() + 1);
                if (p12.Z2) {
                    p12.G2.s0(true);
                }
            }
            vp0 vp0Var = p12.M1;
            if (vp0Var != null && (s0Var = vp0Var.G0.d) != null) {
                s0Var.postRunnable(s0Var.f57391x);
            }
        }
        hi.sa saVar = hi.sa.G2;
        if (saVar != null) {
            saVar.O();
        }
        if (PipRoundVideoView.G != null && MediaController.B().H() && (gjVar = MediaController.B().f22771v0) != null) {
            MediaController.B().i0(gjVar, gjVar.f24173b0);
        }
        if (org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).f24971a0 != null) {
            int i13 = org.telegram.messenger.k10.f24968t0;
            L0(i13, org.telegram.messenger.k10.i(i13).f24971a0);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.cz.f23417j1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(org.telegram.messenger.k10.f24968t0, tL_help_appUpdate, true);
            }
        }
        z(false);
        org.telegram.messenger.t0.G = Settings.canDrawOverlays(this);
        org.telegram.ui.Components.voip.h2.a(this);
        hc1 hc1Var = hc1.f48329m1;
        if (hc1Var != null) {
            if (org.telegram.ui.Components.voip.h2.d() != null) {
                org.telegram.ui.Components.voip.h2.b();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                hc1Var.y();
            } else if (VoIPService.getSharedState() == null) {
                hc1Var.f48368u0.b();
            }
            hc1Var.J0 = ((KeyguardManager) hc1Var.f48333b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.h2.d() != null) {
                org.telegram.ui.Components.voip.h2.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        } else if (org.telegram.ui.Components.voip.h2.d() != null) {
            org.telegram.ui.Components.voip.h2.d().getClass();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getVideoState(false) == 1) {
                sharedInstance3.setVideoState(false, 2);
            }
        }
        a0();
        HashMap hashMap = xh.e.f60580n;
        if (hashMap != null) {
            for (xh.e eVar : hashMap.values()) {
                xh.d dVar = eVar.f60585f;
                if (dVar != null) {
                    dVar.f60570b = false;
                }
            }
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26930a;
        z zVar = J1;
        if (zVar != null) {
            zVar.run();
            J1 = null;
        }
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.P);
        if (!u12.V3.contains("SETUP_LOGIN_EMAIL") && !u12.V3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            return;
        }
        Utilities.d.c(new org.telegram.messenger.sj(org.telegram.messenger.np.u1(this.P), 28));
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
        this.f43144r1 = true;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19437c;
        if (this == ((LaunchActivity) d.f19439f)) {
            d.f19435a = true;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                if (nVar.f60034c == 1 && (hVar = nVar.f60035e) != null && !hVar.f59995f && (oVar = hVar.f59998j) != null) {
                    oVar.post(new wg.q(7, hVar, oVar));
                }
            }
        }
        WeakReference weakReference = vf.c.f59422e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            vf.c.y(activity);
        }
        if (vf.c.f59420b == null) {
            vf.c.f59422e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(vf.c.d)) {
                    String a10 = a8.h1.a(this);
                    vf.c.d = a10;
                    if (a10 == null) {
                    }
                }
                Object obj = new Object();
                ag.a aVar = new ag.a();
                aVar.f1052b = new WeakReference(obj);
                vf.c.f59421c = aVar;
                String str = vf.c.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, aVar, 33)) {
                    vf.c.f59421c = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.t0.f26940y = false;
        org.telegram.ui.Components.c20.k(this);
        f40 f40Var = f40.C5;
        if (f40Var != null) {
            f40Var.z1();
        }
    }

    @Override
    public final void onStop() {
        wi.h hVar;
        super.onStop();
        org.telegram.ui.Wallet.e1 e1Var = c8.za.f5131b;
        if (e1Var != null && e1Var.f44147e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.e1 e1Var2 = c8.za.f5131b;
            if (!e1Var2.f44148f) {
                e1Var2.c("AUTH_CANCELED");
                c8.za.f5131b.e();
            }
        }
        this.f43144r1 = false;
        l2.i d = l2.i.d();
        ArrayList arrayList = (ArrayList) d.f19437c;
        if (this == ((LaunchActivity) d.f19439f)) {
            d.f19435a = false;
            ((wi.p) d.f19438e).getClass();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                wi.n nVar = (wi.n) arrayList.get(i7);
                if (nVar.f60034c == 1 && (hVar = nVar.f60035e) != null && !hVar.f59995f) {
                    nVar.f60032a.b();
                    nVar.c();
                }
            }
        }
        if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().Z1();
        }
        vf.c.y(this);
        org.telegram.messenger.t0.f26940y = true;
        org.telegram.ui.Components.c20.k(this);
        f40 f40Var = f40.C5;
        if (f40Var != null) {
            f40Var.y1();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f43127h1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        ((wi.p) l2.i.d().f19438e).g();
        ArrayList arrayList = this.f43113a1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.f43139p0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.V0.isEmpty()) {
                ((org.telegram.ui.ActionBar.g2) p5.c.h(1, actionBarLayout.V0)).onUserLeaveHint();
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
        fi.y6 a10;
        long[] jArr2 = jArr;
        int i7 = 0;
        while (true) {
            if (i7 < jArr2.length) {
                TLRPC.User c22 = org.telegram.messenger.np.u1(this.P).c2(Long.valueOf(jArr2[i7]));
                if (c22 != null && !c22.stories_hidden) {
                    z11 = false;
                    break;
                }
                i7++;
            } else {
                z11 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.g2 Q = Q();
        if (Q != null) {
            fi.p6 R1 = org.telegram.messenger.np.u1(this.P).R1();
            if (z11) {
                arrayList = R1.h;
            } else {
                arrayList = R1.f12430g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z12 = z11;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z12) {
                ArrayList arrayList5 = new ArrayList();
                for (int i10 = 0; i10 < jArr2.length; i10++) {
                    TLRPC.User c23 = org.telegram.messenger.np.u1(this.P).c2(Long.valueOf(jArr2[i10]));
                    if (c23 == null || !c23.stories_hidden) {
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
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.P);
                int[] iArr = {arrayList4.size()};
                up upVar = new up(this, iArr, jArr2, 17);
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    long longValue = ((Long) arrayList4.get(i14)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer l1 = u12.l1(longValue);
                    tL_stories_getPeerStories.peer = l1;
                    if (l1 instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getPeerStories, new di.q2(u12, longValue, upVar, 6));
                    }
                }
                return;
            }
            long e10 = org.telegram.messenger.k10.i(this.P).e();
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                long o4 = org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList2.get(i15)).peer);
                if (o4 != e10 && !arrayList3.contains(Long.valueOf(o4)) && R1.L(o4)) {
                    arrayList3.add(Long.valueOf(o4));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (Q instanceof cx) {
                    try {
                        a10 = fi.y6.a(((cx) Q).F0.h);
                    } catch (Exception unused) {
                    }
                    fi.y6 y6Var = a10;
                    Q.getOrCreateStoryViewer().B();
                    Q.getOrCreateStoryViewer().M(this, null, arrayList3, 0, null, null, y6Var, false);
                }
                a10 = null;
                fi.y6 y6Var2 = a10;
                Q.getOrCreateStoryViewer().B();
                Q.getOrCreateStoryViewer().M(this, null, arrayList3, 0, null, null, y6Var2, false);
            }
        }
    }

    public final void q0(final int i7, final long j3, final boolean z10) {
        TL_stories.StoryItem storyItem;
        fi.h6 h6Var;
        fi.h6 A;
        org.telegram.messenger.gj f10;
        org.telegram.messenger.gj f11;
        TL_stories.StoryItem storyItem2;
        fi.p6 R1 = org.telegram.messenger.np.u1(this.P).R1();
        TL_stories.PeerStories y10 = R1.y(j3);
        fi.y6 y6Var = null;
        if (y10 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < y10.stories.size()) {
                    if (y10.stories.get(i10).f28673id == i7) {
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
                org.telegram.ui.ActionBar.g2 Q = Q();
                if (Q != null) {
                    if (Q instanceof cx) {
                        try {
                            y6Var = fi.y6.a(((cx) Q).F0.h);
                        } catch (Exception unused) {
                        }
                    }
                    fi.y6 y6Var2 = y6Var;
                    Q.getOrCreateStoryViewer().B();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z10) {
                        Q.getOrCreateStoryViewer().f12047w1 = true;
                    }
                    Q.getOrCreateStoryViewer().M(this, storyItem2, arrayList, 0, null, y10, y6Var2, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            fi.h6 A2 = R1.A(0, -1, j3, true);
            if (A2 != null && (f11 = A2.f(i7)) != null) {
                storyItem = f11.f24218l;
            } else {
                A2 = null;
            }
            if (storyItem == null && (A = R1.A(1, -1, j3, true)) != null && (f10 = A.f(i7)) != null) {
                storyItem = f10.f24218l;
                h6Var = A;
            } else {
                h6Var = A2;
            }
            if (storyItem != null && h6Var != null) {
                storyItem.dialogId = j3;
                org.telegram.ui.ActionBar.g2 Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof cx) {
                    try {
                        y6Var = fi.y6.a(((cx) Q2).F0.h);
                    } catch (Exception unused2) {
                    }
                }
                fi.y6 y6Var3 = y6Var;
                Q2.getOrCreateStoryViewer().B();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    Q2.getOrCreateStoryViewer().f12047w1 = true;
                }
                Q2.getOrCreateStoryViewer().M(this, storyItem, arrayList2, 0, h6Var, null, y6Var3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = org.telegram.messenger.np.u1(this.P).l1(j3);
        tL_stories_getStoriesByID.f28680id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new ai.d1(LaunchActivity.this, tLObject, i7, j3, z10));
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.l6 l6Var) {
        int i7 = l6Var.f29243g0;
        boolean z10 = false;
        org.telegram.ui.ActionBar.j6 f10 = l6Var.f(tL_theme, this.P, 0);
        l6Var.f29233a0 = l6Var.Z;
        l6Var.u(f10.f29096a);
        f10.f29112s = tL_wallPaper;
        if (i7 != l6Var.f29243g0) {
            z10 = true;
        }
        t0(new x71(l6Var, z10, 0, false, false));
    }

    public final void s0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void setRequestedOrientation(int i7) {
        org.telegram.messenger.g0.f24029g = -10;
        org.telegram.messenger.g0.h = -10;
        org.telegram.messenger.g0.f24032i = null;
        super.setRequestedOrientation(i7);
    }

    public final void t0(org.telegram.ui.ActionBar.g2 g2Var) {
        ((ActionBarLayout) M()).S(g2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) M()).V(g2Var, z10, z11);
    }

    public final void v0(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) instanceof ki.s2) {
                    ki.s2 s2Var = (ki.s2) arrayList.get(i7);
                    if (s2Var.isShowing() && s2Var.J == j3) {
                        return;
                    }
                }
                i7++;
            } else {
                org.telegram.ui.ActionBar.g2 T = T();
                if (T != null && T.sheetsStack != null) {
                    for (int i10 = 0; i10 < T.sheetsStack.size(); i10++) {
                        if (T.sheetsStack.get(i10).s()) {
                            T.sheetsStack.get(i10);
                        }
                    }
                }
                ox x10 = this.f43139p0.x();
                if (x10 != null && x10.sheetsStack != null) {
                    for (int i11 = 0; i11 < x10.sheetsStack.size(); i11++) {
                        if (x10.sheetsStack.get(i11).s()) {
                            x10.sheetsStack.get(i11);
                        }
                    }
                }
                y70 y70Var = new y70(this, 1);
                TLRPC.User c22 = org.telegram.messenger.np.u1(this.P).c2(Long.valueOf(j3));
                if (c22 != null) {
                    y70Var.a(c22);
                    return;
                } else {
                    org.telegram.messenger.ur.a0(this.P).f27250a.c(new g80(this, j3, y70Var, 0));
                    return;
                }
            }
        }
    }

    public final void w0(Long l10, h60 h60Var, vf.b bVar, org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.h3 I0 = org.telegram.messenger.np.u1(this.P).I0();
        if (bVar != null) {
            bVar.d();
        }
        I0.a(l10.longValue(), new u60(this, bVar, h60Var, I0, l10, r1Var));
    }

    public final void x(int i7) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.f43160z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f43160z1 = null;
        }
        if (i11 >= 26) {
            i10 = getWindow().getNavigationBarColor();
        } else {
            i10 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10, i7);
        this.f43160z1 = ofArgb;
        ofArgb.addUpdateListener(new s60(this, 1));
        this.f43160z1.addListener(new r0(this, i7, 1));
        this.f43160z1.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f43160z1.setDuration(320L);
        this.f43160z1.start();
    }

    public final void x0(final int i7, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i10, final int i11, final String str23, final String str24, final String str25, String str26, final String str27, final vf.b bVar, final boolean z12, final int i12, final int i13, final int i14, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = org.telegram.messenger.np.u1(i7).s1(user);
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
                    org.telegram.messenger.g0.g3(new Runnable() {
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
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.ActionBar.g2 g2Var;
                        String str59 = LaunchActivity.C1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.f43120e0;
                        lz lzVar = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList);
                        } else {
                            g2Var = null;
                        }
                        int i21 = i15;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str60 = str58;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z25;
                        boolean z37 = z22;
                        v70 v70Var = new v70(launchActivity2, g2Var, i21, user3, tL_messages_botApp2, atomicBoolean, str60, z34, z35, z36, z37);
                        if (z32) {
                            v70Var.run();
                        } else if (tL_messages_botApp2.inactive && z33) {
                            r3 r3Var = new r3(v70Var, 9);
                            vf.b bVar3 = bVar2;
                            if (bVar3 != null) {
                                lzVar = new lz(bVar3, 16);
                            }
                            zc1.a(launchActivity2, r3Var, lzVar);
                        } else if (!tL_messages_botApp2.request_write_access && !z37) {
                            v70Var.run();
                        } else {
                            org.telegram.ui.Components.c5.m(g2Var, atomicBoolean, user3, v70Var);
                        }
                    }
                });
            }
        });
    }

    @Override
    public final boolean y(org.telegram.ui.cx r49, java.util.ArrayList r50, final java.lang.CharSequence r51, boolean r52, boolean r53, int r54, final int r55, org.telegram.ui.y91 r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.y(org.telegram.ui.cx, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.y91):boolean");
    }

    public final void y0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f43141q0;
        if (actionBarLayout != null) {
            actionBarLayout.X(z10, z10);
        } else {
            this.f43139p0.X(z10, z10);
        }
    }

    public final void z(boolean z10) {
        org.telegram.messenger.h1 e10;
        String str;
        int i7;
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        if (!z10) {
            boolean z11 = org.telegram.messenger.s2.f26730a;
        }
        if (org.telegram.messenger.t0.f26930a.q()) {
            org.telegram.messenger.d1 d1Var = null;
            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q() && (str = (e10 = org.telegram.messenger.h1.e()).f24348a) != null && (i7 = e10.f24349b) != 0) {
                d1Var = new org.telegram.messenger.d1(str, i7, e10.f24350c);
            }
            boolean z12 = this.f43138o1;
            this.f43138o1 = false;
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26930a;
            b80 b80Var = new b80(this, z12, d1Var, 1);
            if (((ApplicationLoaderImpl) t0Var).q()) {
                org.telegram.messenger.h1.e().a(b80Var, z10);
            }
        } else if (!z10 && Math.abs(System.currentTimeMillis() - org.telegram.messenger.cz.l1) < org.telegram.messenger.np.u1(0).f25947r3 * 1000) {
        } else {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = org.telegram.messenger.t0.f26931b.getPackageManager().getInstallerPackageName(org.telegram.messenger.t0.f26931b.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            int i10 = this.P;
            ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new di.w1(this, i10, 8));
        }
    }

    public final int z0(final int i7, final h60 h60Var, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i10, final int i11) {
        int longValue;
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.np.n1(chat);
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
                final Runnable runnable3 = h60Var;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k70.run():void");
                    }
                });
            }
        });
    }

    @Override
    public final void f(int[] iArr) {
    }
}
