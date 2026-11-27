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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public class LaunchActivity extends ug0 implements sk5, fn7, oj3 {
    public static final String C1 = UUID.randomUUID().toString();
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static LaunchActivity H1;
    public static Pattern I1;
    public static ys J1;
    public static LaunchActivity K1;
    public kfb A1;
    public okb B0;
    public int B1;
    public sk0 C0;
    public id E0;
    public View F0;
    public id G0;
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
    public znb S0;
    public String T;
    public TLRPC.TL_theme T0;
    public CharSequence U;
    public boolean U0;
    public ArrayList V;
    public id V0;
    public ArrayList W;
    public ArrayList X;
    public boolean X0;
    public Uri Y;
    public r4a Y0;
    public String Z;
    public zz3 Z0;
    public ArrayList a0;
    public ArrayList b0;
    public Uri c0;
    public int d0;
    public c34 e1;
    public ak f1;
    public j1d g1;
    public l45 h0;
    public boolean h1;
    public ArrayList i0;
    public mr4 i1;
    public ArrayList j0;
    public a26 j1;
    public String k0;
    public b26 k1;
    public ActionMode l0;
    public boolean l1;
    public boolean m0;
    public u8a m1;
    public tqb n0;
    public u8a n1;
    public d41 o0;
    public ActionBarLayout p0;
    public j16 p1;
    public ActionBarLayout q0;
    public te2 q1;
    public ActionBarLayout r0;
    public boolean r1;
    public c26 s0;
    public ViewGroup s1;
    public FrameLayout t0;
    public final fu7 t1;
    public w81 u0;
    public id u1;
    public d26 v0;
    public id v1;
    public y16 w0;
    public boolean w1;
    public gy0 x0;
    public long x1;
    public dr3 y0;
    public int[] y1;
    public hz7 z0;
    public ValueAnimator z1;
    public final ArrayList Q = new ArrayList();
    public final ArrayList e0 = new ArrayList();
    public final ArrayList f0 = new ArrayList();
    public final ArrayList g0 = new ArrayList();
    public final ArrayList A0 = new ArrayList();
    public final ArrayList D0 = new ArrayList();
    public boolean W0 = false;
    public final ArrayList a1 = new ArrayList();
    public final SparseIntArray b1 = new SparseIntArray();
    public int c1 = 5934;
    public final w16 d1 = new Object();
    public boolean o1 = true;

    public LaunchActivity() {
        System.identityHashCode(this);
        this.t1 = new fu7(this);
        this.B1 = 0;
    }

    public static void C0(k5 k5Var, uj3 uj3Var, CharSequence charSequence, long j, r47 r47Var, long j2, boolean z, int i, int i2) {
        boolean z2;
        sea seaVar;
        sea seaVar2;
        int i3 = k5Var.a;
        if (uj3Var != null && (seaVar2 = uj3Var.I2) != null && !seaVar2.n) {
            z2 = false;
        } else {
            z2 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z2 && uj3Var != null && (seaVar = uj3Var.I2) != null) {
            webPage = seaVar.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z2) {
                r7a.Z(k5Var, charSequence, j, j2, z, i, i2);
                return;
            }
            CharSequence G = r7a.G(charSequence);
            if (G != null && G.length() != 0) {
                CharSequence[] charSequenceArr = {G};
                r7a.B(i3).q0(p7a.b(charSequenceArr[0].toString(), j, r47Var, r47Var, webPage2, z2, ls6.d0(i3).Y(charSequenceArr, true, true), null, null, z, i, i2, null, false));
            }
        }
    }

    public static void F(int i) {
        LaunchActivity launchActivity = K1;
        if (launchActivity != null) {
            launchActivity.D(i);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z) {
        String E12;
        org.telegram.ui.ActionBar.e Q = Q();
        if (Q != null) {
            long j = tL_attachMenuBot.bot_id;
            gzc b = gzc.b(i, j, j, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.O() != null && launchActivity.O().l(b) != null) {
                return;
            }
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(tL_attachMenuBot.bot_id));
            if (X1 == null) {
                E12 = null;
            } else {
                E12 = uc7.s1(i).E1(X1.restriction_reason);
            }
            if (!TextUtils.isEmpty(E12)) {
                uc7.s1(i);
                uc7.f5(E12, Q);
                return;
            }
            xw0 xw0Var = new xw0(launchActivity, Q.getResourceProvider());
            xw0Var.C0 = false;
            xw0Var.B(z);
            xw0Var.m0 = launchActivity;
            xw0Var.x(Q, b);
            xw0Var.show();
        }
    }

    public static void K() {
        s24 s24Var;
        ArrayList<ag0> arrayList;
        org.telegram.ui.ActionBar.e S = S();
        if (S != null) {
            if (S.getParentLayout() instanceof ActionBarLayout) {
                s24Var = ((ActionBarLayout) S.getParentLayout()).v();
            } else {
                s24Var = null;
            }
            if (s24Var != null && (arrayList = s24Var.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    s24Var.sheetsStack.get(size).a(true);
                }
            }
            ArrayList<ag0> arrayList2 = S.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    S.sheetsStack.get(size2).a(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = xw0.b1.iterator();
            while (it.hasNext()) {
                arrayList3.add((xw0) it.next());
            }
            int size3 = arrayList3.size();
            int i = 0;
            while (i < size3) {
                Object obj = arrayList3.get(i);
                i++;
                ((xw0) obj).m(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.e M() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.r();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ActionBarLayout) ((wk5) c00.g(1, H1.Q))).r();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.N() != null) {
            return ((ActionBarLayout) H1.N()).r();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.e Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((wk5) c00.g(1, H1.Q)).getLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.N() != null) {
            return H1.N().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.e S() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((wk5) c00.g(1, H1.Q)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.N() != null) {
            return H1.N().getSafeLastFragment();
        }
        return null;
    }

    public static String T(int i, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null) {
            return ob6.M0(i, str);
        }
        return str2;
    }

    public static int U(Uri uri) {
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
            Pattern pattern = I1;
            if (pattern == null) {
                pattern = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
                I1 = pattern;
            }
            try {
                Matcher matcher = pattern.matcher(str);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    String group3 = matcher.group(3);
                    String group4 = matcher.group(4);
                    int i = 0;
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
                        i = Integer.parseInt(group4);
                    }
                    return (parseInt * 86400) + (parseInt2 * 3600) + (parseInt3 * 60) + i;
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
                        cc4.g(e, true);
                        return -1;
                    }
                }
                return -1;
            }
        }
        return -1;
    }

    public static void Y(View view) {
        if (view.getLayerType() != 0) {
            view.invalidate();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                Y(viewGroup.getChildAt(i));
            }
        }
    }

    public static void a0(float f, float f2, float f3) {
        View decorView;
        kfb kfbVar;
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((kfbVar = launchActivity.A1) == null || ((View) kfbVar.a) != decorView)) {
                launchActivity.A1 = new kfb(decorView);
            }
            kfb kfbVar2 = launchActivity.A1;
            if (kfbVar2 != null) {
                View view = (View) kfbVar2.a;
                ArrayList arrayList = kfbVar2.b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(dte.a(0.0f, 0.0f, f, f2), dte.a(view.getWidth(), 0.0f, f, f2)), Math.max(dte.a(0.0f, view.getHeight(), f, f2), dte.a(view.getWidth(), view.getHeight(), f, f2))) * 2.0f) / (hl.p * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    jfb jfbVar = new jfb(f, f2, f3);
                    ofFloat.addUpdateListener(new lk(kfbVar2, jfbVar, (byte) 28));
                    ofFloat.addListener(new wd8(kfbVar2, jfbVar, (byte) 19));
                    ofFloat.setInterpolator(k43.g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(jfbVar);
                    kfbVar2.i();
                    ofFloat.start();
                }
            }
        }
    }

    public static e26 c0() {
        LaunchActivity launchActivity = H1;
        if (launchActivity != null) {
            return new e26(launchActivity, true);
        }
        return null;
    }

    public final void A(boolean z) {
        mh0 mh0Var;
        int i;
        org.telegram.messenger.a.t();
        org.telegram.messenger.a.m();
        if (!z) {
            boolean z2 = f11.a;
        }
        org.telegram.messenger.a.a.getClass();
        ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
        ph0 e = ph0.e();
        String str = e.a;
        if (str != null && (i = e.b) != 0) {
            mh0Var = new mh0(str, i, e.c);
        } else {
            mh0Var = null;
        }
        boolean z3 = this.o1;
        this.o1 = false;
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ds6 ds6Var = new ds6(this, z3, mh0Var, (byte) 28);
        ((ApplicationLoaderImpl) aVar).getClass();
        ph0.e().a(ds6Var, z);
    }

    public final void A0(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.A0(android.net.Uri):void");
    }

    public final void B() {
        if (this.P == yac.t0 && this.m1 != null) {
            return;
        }
        u8a u8aVar = this.m1;
        if (u8aVar != null) {
            u8aVar.a();
            this.m1 = null;
        }
        int i = yac.t0;
        this.P = i;
        u8a u8aVar2 = new u8a(jn7.f(i), this);
        u8aVar2.b(jn7.p3);
        u8aVar2.b(jn7.I2);
        u8aVar2.b(jn7.j0);
        u8aVar2.b(jn7.Z4);
        u8aVar2.b(jn7.T1);
        u8aVar2.b(jn7.M0);
        u8aVar2.b(jn7.R0);
        u8aVar2.b(jn7.c1);
        u8aVar2.b(jn7.P);
        u8aVar2.b(jn7.N0);
        u8aVar2.b(jn7.Y1);
        u8aVar2.b(jn7.Z1);
        u8aVar2.b(jn7.v1);
        u8aVar2.b(jn7.w2);
        u8aVar2.b(jn7.x1);
        u8aVar2.b(jn7.l5);
        u8aVar2.b(jn7.i5);
        u8aVar2.b(jn7.u5);
        u8aVar2.b(jn7.T5);
        this.m1 = u8aVar2;
    }

    public final void B0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final defpackage.l01 r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.B0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, l01, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void C() {
        if (Build.VERSION.SDK_INT >= 24) {
            mr4 mr4Var = this.i1;
            if (mr4Var == null && xea.o) {
                mr4Var = mr4.a(this, this.v0);
                this.i1 = mr4Var;
            }
            if (mr4Var != null && !xea.o) {
                mr4Var.b();
                this.i1 = null;
            }
        }
    }

    public final void D(int i) {
        K1 = this;
        Set set = u60.a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - xea.G) >= 86400) {
            xea.G = currentTimeMillis;
            Utilities.f.c(new zd(currentTimeMillis, xb4.j(4), (byte) 5));
        }
        if (f11.a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - xea.H) >= 3600) {
                xea.H = currentTimeMillis2;
                Utilities.f.c(new gw0(currentTimeMillis2, (byte) 15));
            }
        }
        if ((Build.VERSION.SDK_INT >= 26 && i == 0) || this.w1) {
            return;
        }
        Utilities.e.d(new gw1(this, i, (byte) 2), 2000L);
    }

    public final void D0(int i) {
        this.y0.setInternalNavigationBarColor(i);
        yx0 O = O();
        if (O != null) {
            O.setNavigationBarColor(i);
        }
    }

    @Override
    public final boolean E() {
        ArrayList arrayList = this.V;
        if ((arrayList != null && arrayList.size() == 1) || this.S != null) {
            return true;
        }
        return false;
    }

    public final void E0() {
        ViewGroup view;
        int i;
        int indexOfChild = this.y0.indexOfChild(this.s0);
        dr3 dr3Var = this.y0;
        if (indexOfChild != -1) {
            view = this.s0;
        } else {
            view = this.p0.getView();
        }
        int indexOfChild2 = dr3Var.indexOfChild(view);
        if (indexOfChild2 != -1) {
            this.y0.removeViewAt(indexOfChild2);
        }
        if (hl.O1()) {
            getWindow().setSoftInputMode(16);
            c26 c26Var = new c26(this, this);
            this.s0 = c26Var;
            dr3 dr3Var2 = this.y0;
            if (indexOfChild2 != -1) {
                dr3Var2.addView(c26Var, indexOfChild2, tre.c(-1.0f, -1));
            } else {
                dr3Var2.addView(c26Var, tre.c(-1.0f, -1));
            }
            w81 w81Var = new w81(this, null);
            this.u0 = w81Var;
            w81Var.setOccupyStatusBar(false);
            this.u0.U(aob.r0());
            this.s0.addView(this.u0, tre.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.p0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.p0.getView());
            }
            this.s0.addView(this.p0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.r0 = actionBarLayout;
            actionBarLayout.U0 = true;
            actionBarLayout.setFragmentStack(this.g0);
            this.r0.setDelegate(this);
            this.s0.addView(this.r0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.t0 = frameLayout;
            ArrayList arrayList = this.f0;
            int i2 = 8;
            if (arrayList.isEmpty()) {
                i = 8;
            } else {
                i = 0;
            }
            frameLayout.setVisibility(i);
            this.t0.setBackgroundColor(1056964608);
            this.s0.addView(this.t0);
            this.t0.setOnTouchListener(new b7(this, (byte) 9));
            this.t0.setOnClickListener(new y00((byte) 9));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.q0 = actionBarLayout2;
            actionBarLayout2.T0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.q0.setBackgroundView(this.t0);
            this.q0.setUseAlphaAnimations(true);
            this.q0.setFragmentStack(arrayList);
            this.q0.setDelegate(this);
            this.q0.setDrawerLayoutContainer(this.y0);
            ViewGroup view2 = this.q0.getView();
            if (!arrayList.isEmpty()) {
                i2 = 0;
            }
            view2.setVisibility(i2);
            this.s0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.p0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.p0.getView());
            }
            this.p0.setFragmentStack(this.e0);
            dr3 dr3Var3 = this.y0;
            ActionBarLayout actionBarLayout3 = this.p0;
            if (indexOfChild2 != -1) {
                dr3Var3.addView(actionBarLayout3.getView(), indexOfChild2, new ViewGroup.LayoutParams(-1, -1));
            } else {
                dr3Var3.addView(actionBarLayout3.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        nle.a(this, xea.t1, false);
    }

    public final id F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            id o = alertDialog$Builder.o();
            o.setCanceledOnTouchOutside(true);
            o.setOnDismissListener(new gf(this, o, (byte) 10));
            this.D0.add(o);
            return o;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final void G() {
        int i;
        boolean z;
        if (hl.O1() && this.r0 != null) {
            Boolean bool = hl.L;
            int i2 = 0;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (org.telegram.messenger.a.b != null && org.telegram.messenger.a.b.getResources().getBoolean(2131034114)) {
                    z = true;
                } else {
                    z = false;
                }
                if (booleanValue != z) {
                    return;
                }
            }
            if (!hl.E && (!hl.N1() || getResources().getConfiguration().orientation == 2)) {
                this.N0 = false;
                List<org.telegram.ui.ActionBar.e> fragmentStack = this.p0.getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    while (1 < fragmentStack.size()) {
                        org.telegram.ui.ActionBar.e eVar = fragmentStack.get(1);
                        if (eVar instanceof zu1) {
                            zu1 zu1Var = (zu1) eVar;
                            zu1Var.m5 = true;
                            zu1Var.n5 = true;
                        }
                        eVar.onPause();
                        eVar.onFragmentDestroy();
                        eVar.setParentLayout(null);
                        fragmentStack.remove(eVar);
                        this.r0.b(-1, eVar);
                    }
                    hz7 hz7Var = this.z0;
                    if (hz7Var == null || hz7Var.b.getVisibility() != 0) {
                        this.p0.W(true, true);
                        this.r0.W(true, true);
                    }
                }
                ViewGroup view = this.r0.getView();
                if (this.r0.getFragmentStack().isEmpty()) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                w81 w81Var = this.u0;
                if (!this.r0.getFragmentStack().isEmpty()) {
                    i2 = 8;
                }
                w81Var.setVisibility(i2);
                return;
            }
            this.N0 = true;
            List<org.telegram.ui.ActionBar.e> fragmentStack2 = this.r0.getFragmentStack();
            if (!fragmentStack2.isEmpty()) {
                while (fragmentStack2.size() > 0) {
                    org.telegram.ui.ActionBar.e eVar2 = fragmentStack2.get(0);
                    if (eVar2 instanceof zu1) {
                        zu1 zu1Var2 = (zu1) eVar2;
                        zu1Var2.m5 = true;
                        zu1Var2.n5 = true;
                    }
                    eVar2.onPause();
                    eVar2.onFragmentDestroy();
                    eVar2.setParentLayout(null);
                    fragmentStack2.remove(eVar2);
                    this.p0.b(-1, eVar2);
                }
                hz7 hz7Var2 = this.z0;
                if (hz7Var2 == null || hz7Var2.b.getVisibility() != 0) {
                    this.p0.W(true, true);
                }
            }
            this.r0.getView().setVisibility(8);
            w81 w81Var2 = this.u0;
            if (!this.p0.getFragmentStack().isEmpty()) {
                i2 = 8;
            }
            w81Var2.setVisibility(i2);
        }
    }

    public final void H(boolean z, boolean z2, boolean z3) {
        org.telegram.ui.ActionBar.e eVar;
        int w0;
        xu1 xu1Var;
        boolean z4;
        ArrayList arrayList = this.e0;
        boolean z5 = true;
        if (!arrayList.isEmpty()) {
            eVar = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList);
        } else {
            eVar = null;
        }
        char c = 2;
        if (eVar != null && (eVar.isRemovingFromStack() || eVar.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                eVar = (org.telegram.ui.ActionBar.e) c00.g(2, arrayList);
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            eVar.hasForceLightStatusBar();
        }
        if (z2) {
            if (eVar != null) {
                z4 = eVar.isLightStatusBar();
                if (eVar.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) eVar.getParentLayout();
                    if (actionBarLayout.v() != null && actionBarLayout.v().getLastSheet() != null) {
                        ag0 lastSheet = actionBarLayout.v().getLastSheet();
                        if (lastSheet.s()) {
                            z4 = lastSheet.f();
                        }
                    } else {
                        ArrayList<ag0> arrayList2 = eVar.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            ag0 ag0Var = (ag0) c00.g(1, eVar.sheetsStack);
                            if (ag0Var.s()) {
                                z4 = ag0Var.f();
                            }
                        }
                    }
                }
            } else {
                z4 = vm2.h(aob.w0(null, aob.s8, true)) > 0.699999988079071d;
            }
            hl.k3(this, z4);
        }
        if (Build.VERSION.SDK_INT >= 26 && z3 && (!z || eVar == null || !eVar.isInPreviewMode())) {
            if (eVar != null && z) {
                w0 = eVar.getNavigationBarColor();
            } else {
                w0 = aob.w0(null, aob.a7, true);
            }
            if (eVar instanceof zu1) {
                zu1 zu1Var = (zu1) eVar;
                if (!zu1Var.tc || (zu1Var.w.s != 1 && ((xu1Var = zu1Var.Ba) == null || !xu1Var.q))) {
                    c = 1;
                }
            } else {
                c = 0;
            }
            if (O() != null && O().I > 0) {
                c = 0;
            }
            if (this.p0.v() != null) {
                s24 v = this.p0.v();
                if (v.sheetsStack != null) {
                    for (int i = 0; i < v.sheetsStack.size(); i++) {
                        ag0 ag0Var2 = v.sheetsStack.get(i);
                        if (ag0Var2.z()) {
                            w0 = ag0Var2.e(w0);
                            c = 0;
                        }
                    }
                }
            }
            Iterator it = xw0.b1.iterator();
            while (it.hasNext()) {
                w0 = ((xw0) it.next()).e(w0);
                c = 0;
            }
            D0(w0);
            if ((c != 0 || hl.B(w0) < 0.721f) && c != 1) {
                z5 = false;
            }
            hl.h3(this, z5);
        }
        if (z2) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void H0(rs4 rs4Var) {
        org.telegram.ui.ActionBar.e eVar;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            eVar = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList);
        } else {
            ArrayList arrayList2 = this.g0;
            if (!arrayList2.isEmpty()) {
                eVar = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.e0;
                if (!arrayList3.isEmpty()) {
                    eVar = (org.telegram.ui.ActionBar.e) c00.g(1, arrayList3);
                } else {
                    eVar = null;
                }
            }
        }
        if (d31.a(eVar)) {
            rs4Var.b(d31.b0(eVar)).j();
        }
    }

    public final void I(boolean z) {
        vc2 vc2Var;
        long j;
        boolean z2;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z3 = false;
        if (sharedInstance != null && (vc2Var = sharedInstance.groupCall) != null) {
            boolean z4 = this.m0;
            TLRPC.InputPeer groupCallPeer = sharedInstance.getGroupCallPeer();
            if (groupCallPeer != null) {
                j = groupCallPeer.user_id;
                if (j == 0) {
                    long j2 = groupCallPeer.chat_id;
                    if (j2 == 0) {
                        j2 = groupCallPeer.channel_id;
                    }
                    j = -j2;
                }
            } else {
                j = yac.h(this.P).n;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(j);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && groupCallParticipant.raise_hand_rating != 0) {
                z3 = true;
            }
            this.m0 = z3;
            if (!z && z4 && !z3 && !z2 && j95.s5 == null) {
                M0(38);
                return;
            }
            return;
        }
        this.m0 = false;
    }

    public final void I0() {
        String str;
        String str2;
        byte b;
        mb6 mb6Var;
        if (yac.h(this.P).o()) {
            try {
                if (!this.H0 && !org.telegram.messenger.a.x) {
                    String string = uc7.e1().getString("language_showed2", "");
                    final String str3 = uc7.s1(this.P).t3;
                    if (string.equals(str3)) {
                        if (f11.a) {
                            cc4.b("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final mb6[] mb6VarArr = new mb6[2];
                    byte b2 = 0;
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
                    int i = 0;
                    while (true) {
                        if (i < ob6.D0().J.size()) {
                            mb6 mb6Var2 = (mb6) ob6.D0().J.get(i);
                            b = b2;
                            if (mb6Var2.c.equals("en")) {
                                mb6VarArr[b] = mb6Var2;
                            }
                            if (mb6Var2.c.replace("_", "-").equals(str3) || mb6Var2.c.equals(str) || mb6Var2.c.equals(str2)) {
                                mb6VarArr[1] = mb6Var2;
                            }
                            if (mb6VarArr[b] != null && mb6VarArr[1] != null) {
                                break;
                            }
                            i++;
                            b2 = b;
                        } else {
                            b = b2;
                            break;
                        }
                    }
                    mb6 mb6Var3 = mb6VarArr[b];
                    if (mb6Var3 != null && (mb6Var = mb6VarArr[1]) != null && mb6Var3 != mb6Var) {
                        if (f11.a) {
                            cc4.b("show lang alert for " + mb6VarArr[b].b() + " and " + mb6VarArr[1].b());
                        }
                        this.I0 = null;
                        this.J0 = null;
                        this.H0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = mb6VarArr[1].c();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        final byte b3 = b;
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) {
                            public final LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i2 = 0;
                                switch (b3) {
                                    case 0:
                                        String str4 = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i2 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i2);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i2++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.b;
                                        final mb6[] mb6VarArr2 = mb6VarArr;
                                        final String str5 = str3;
                                        hl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b4 = r5;
                                                String str6 = str5;
                                                mb6[] mb6VarArr3 = mb6VarArr2;
                                                HashMap hashMap2 = hashMap;
                                                LaunchActivity launchActivity2 = launchActivity;
                                                switch (b4) {
                                                    case 0:
                                                        String str7 = LaunchActivity.C1;
                                                        launchActivity2.I0 = hashMap2;
                                                        if (launchActivity2.J0 != null) {
                                                            launchActivity2.J0(mb6VarArr3[1], mb6VarArr3[0], str6);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        String str8 = LaunchActivity.C1;
                                                        launchActivity2.J0 = hashMap2;
                                                        if (launchActivity2.I0 != null) {
                                                            launchActivity2.J0(mb6VarArr3[1], mb6VarArr3[0], str6);
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
                                            while (i2 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i2);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i2++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.b;
                                        final mb6[] mb6VarArr3 = mb6VarArr;
                                        final String str7 = str3;
                                        hl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b4 = r5;
                                                String str62 = str7;
                                                mb6[] mb6VarArr32 = mb6VarArr3;
                                                HashMap hashMap22 = hashMap2;
                                                LaunchActivity launchActivity22 = launchActivity2;
                                                switch (b4) {
                                                    case 0:
                                                        String str72 = LaunchActivity.C1;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null) {
                                                            launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        String str8 = LaunchActivity.C1;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.I0 != null) {
                                                            launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
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
                        tL_langpack_getStrings2.lang_code = mb6VarArr[b3].c();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {
                            public final LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i2 = 0;
                                switch (b3) {
                                    case 0:
                                        String str4 = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i2 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i2);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i2++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.b;
                                        final mb6[] mb6VarArr2 = mb6VarArr;
                                        final String str5 = str3;
                                        hl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b4 = r5;
                                                String str62 = str5;
                                                mb6[] mb6VarArr32 = mb6VarArr2;
                                                HashMap hashMap22 = hashMap;
                                                LaunchActivity launchActivity22 = launchActivity;
                                                switch (b4) {
                                                    case 0:
                                                        String str72 = LaunchActivity.C1;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null) {
                                                            launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        String str8 = LaunchActivity.C1;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.I0 != null) {
                                                            launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
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
                                            while (i2 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i2);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i2++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.b;
                                        final mb6[] mb6VarArr3 = mb6VarArr;
                                        final String str7 = str3;
                                        hl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b4 = r5;
                                                String str62 = str7;
                                                mb6[] mb6VarArr32 = mb6VarArr3;
                                                HashMap hashMap22 = hashMap2;
                                                LaunchActivity launchActivity22 = launchActivity2;
                                                switch (b4) {
                                                    case 0:
                                                        String str72 = LaunchActivity.C1;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null) {
                                                            launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        String str8 = LaunchActivity.C1;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.I0 != null) {
                                                            launchActivity22.J0(mb6VarArr32[1], mb6VarArr32[0], str62);
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
                cc4.g(e, true);
            }
        }
    }

    public final void J() {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((org.telegram.ui.ActionBar.e) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (hl.O1()) {
            ArrayList arrayList2 = this.f0;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ((org.telegram.ui.ActionBar.e) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.g0;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                ((org.telegram.ui.ActionBar.e) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void J0(defpackage.mb6 r18, defpackage.mb6 r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.J0(mb6, mb6, java.lang.String):void");
    }

    public final void K0(boolean z, boolean z2, int i, int i2, zg3 zg3Var) {
        if (this.y0 != null && !isFinishing()) {
            if (this.z0 == null) {
                this.z0 = new hz7(this);
            }
            xea.w = true;
            int i3 = 0;
            if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                SecretMediaViewer.d().c(false, false);
            } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
                PhotoViewer.q0().A(false, true);
            } else if (o.F() && o.u().W) {
                o.u().l(false, true);
            }
            sbb.v();
            r47 r47Var = MediaController.z().v0;
            if (r47Var != null && r47Var.g4()) {
                MediaController.z().m(true, true, false, false);
            }
            this.z0.show();
            gz7 gz7Var = this.z0.b;
            ArrayList arrayList = this.A0;
            arrayList.isEmpty();
            gz7Var.m(z2, i, i2, new tg5(this, zg3Var, (byte) 22));
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                fz7 fz7Var = (fz7) arrayList.get(i4);
                if (z) {
                    arrayList.size();
                }
                fz7Var.m(z2, i, i2, null);
            }
            xea.B = true;
            pd pdVar = new pd(this, (byte) 4);
            this.z0.b.setDelegate(pdVar);
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((fz7) obj).setDelegate(pdVar);
            }
            try {
                ip7.n(yac.t0).Y();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final java.util.ArrayList L(java.lang.String r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.L(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void L0(int i, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f;
        if (this.B0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            yob.h(aob.d6, null, frameLayout);
            int i2 = hl.m;
            if (i2 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i2));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(2131231648);
            linearLayout.addView(imageView, tre.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i3 = aob.G6;
            qd4.w(textView, i3, null, 1, 17.0f);
            textView.setText(ob6.M0(2131746511, null));
            linearLayout.addView(textView, tre.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.a = textView2;
            yob.X(textView2, i3, null);
            yob.G(textView2, aob.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new dl((byte) 0));
            textView2.setGravity(51);
            textView2.setLineSpacing(hl.L(2.0f), 1.0f);
            linearLayout.addView(textView2, tre.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f = 4.0f;
            scrollView.setPadding(hl.L(24.0f), i2, hl.L(24.0f), hl.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, tre.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(ob6.M0(2131751569, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(hl.o());
            int i4 = aob.y6;
            yob.X(textView3, i4, null);
            textView3.setTextSize(1, 14.0f);
            hf0 H0 = aob.H0(hl.L(3.0f), aob.w0(null, i4, false));
            uob g = yob.g(i4, 25);
            textView3.setBackground(H0);
            yob.j(textView3, H0, null, g, null);
            textView3.setPadding(hl.L(20.0f), hl.L(10.0f), hl.L(20.0f), hl.L(10.0f));
            frameLayout.addView(textView3, tre.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    okb okbVar = frameLayout;
                    switch (b) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = ob6.M0(2131743851, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            alertDialog$Builder.j(ob6.M0(2131751567, null), new mkb(okbVar, (byte) 1));
                            alertDialog$Builder.g(ob6.M0(2131753749, null), null);
                            idVar.U = ob6.M0(2131743630, null);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (okbVar.c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = ob6.M0(2131743633, null);
                                id idVar2 = alertDialog$Builder2.a;
                                idVar2.S = M02;
                                alertDialog$Builder2.j(ob6.M0(2131754299, null), new mkb(okbVar, (byte) 0));
                                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                idVar2.U = ob6.a0("TosAgeText", null, 2131743634, ob6.G(okbVar.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            okbVar.a();
                            return;
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(ob6.M0(2131754712, null));
            textView4.setGravity(17);
            textView4.setTypeface(hl.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = hl.L(4.0f);
            textView4.setBackgroundDrawable(aob.i0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
            frameLayout.addView(textView4, tre.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    okb okbVar = frameLayout;
                    switch (b) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = ob6.M0(2131743851, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            alertDialog$Builder.j(ob6.M0(2131751567, null), new mkb(okbVar, (byte) 1));
                            alertDialog$Builder.g(ob6.M0(2131753749, null), null);
                            idVar.U = ob6.M0(2131743630, null);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (okbVar.c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = ob6.M0(2131743633, null);
                                id idVar2 = alertDialog$Builder2.a;
                                idVar2.S = M02;
                                alertDialog$Builder2.j(ob6.M0(2131754299, null), new mkb(okbVar, (byte) 0));
                                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                                idVar2.U = ob6.a0("TosAgeText", null, 2131743634, ob6.G(okbVar.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            okbVar.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            yob.h(aob.d7, null, view2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = hl.L(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.B0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.y0.addView(this.B0, tre.c(-1.0f, -1));
            this.B0.setDelegate(new r16(this));
        } else {
            f = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = yac.h(i).a0;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            yac.h(i).a0 = tL_help_termsOfService;
            yac.h(i).u(false);
        }
        okb okbVar = this.B0;
        if (okbVar.getVisibility() != 0) {
            okbVar.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        r47.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = hl.L(10.0f);
        int L3 = hl.L(f);
        int length = spannableStringBuilder.length() - 2;
        for (int i5 = 0; i5 < length; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == '-') {
                    int i7 = i5 + 2;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        h11 h11Var = new h11(L2, L3);
                        spannableStringBuilder.replace(i6, i5 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(h11Var, i6, i7, 33);
                    }
                }
            }
        }
        okbVar.a.setText(spannableStringBuilder);
        okbVar.c = tL_help_termsOfService;
        okbVar.d = i;
        this.B0.animate().alpha(1.0f).setDuration(150L).setInterpolator(hl.F).setListener(null).start();
    }

    public final void M0(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.e0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.e eVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
            if (eVar instanceof fj6) {
                eVar = ((fj6) eVar).b0();
            }
            UndoView undoView = null;
            if (eVar instanceof zu1) {
                zu1 zu1Var = (zu1) eVar;
                if (chat != null && zu1Var.a() == (-chat.id)) {
                    chat = null;
                }
                zu1Var.i6();
                undoView = zu1Var.N3;
            } else if (eVar instanceof uj3) {
                undoView = ((uj3) eVar).w3();
            } else if (eVar instanceof ProfileActivity) {
                undoView = ((ProfileActivity) eVar).M;
            }
            if (undoView != null) {
                undoView.m(0L, chat, i);
            }
            if (i == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    public final wk5 N() {
        ActionBarLayout actionBarLayout = this.p0;
        ArrayList arrayList = this.Q;
        if (!arrayList.isEmpty()) {
            return (wk5) c00.g(1, arrayList);
        }
        return actionBarLayout;
    }

    public final void N0(int i) {
        O0(i, new lq5((byte) 7));
    }

    public final yx0 O() {
        ActionBarLayout actionBarLayout = this.r0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.r0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.p0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.p0.getBottomSheetTabs();
        }
        return null;
    }

    public final void O0(int i, nu4 nu4Var) {
        if (i != yac.t0 && yac.q(i)) {
            this.l1 = true;
            ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
            yac.t0 = i;
            yac.h(0).u(false);
            B();
            jn7.e().k(jn7.f4, Integer.valueOf(i));
            if (hl.O1()) {
                this.q0.Z();
                this.r0.Z();
                if (!this.N0) {
                    if (this.r0.getFragmentStack().isEmpty()) {
                        this.u0.setVisibility(0);
                    }
                    this.r0.getView().setVisibility(8);
                }
                this.q0.getView().setVisibility(8);
            }
            this.p0.Z();
            this.p0.b(-3, (fj6) nu4Var.h(null));
            this.p0.W(true, true);
            if (hl.O1()) {
                this.q0.W(true, true);
                this.r0.W(true, true);
            }
            if (!org.telegram.messenger.a.x) {
                ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
            }
            if (yac.h(i).a0 != null) {
                L0(i, yac.h(i).a0);
            }
            P0();
            this.l1 = false;
        }
    }

    public final org.telegram.ui.ActionBar.e P() {
        if (qh6.x1(this.P, false).getInt("currentViewNum", 0) != 0) {
            return new qh6();
        }
        return new yr5();
    }

    public final void P0() {
        int i;
        String str;
        if (this.p0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.P).getConnectionState();
            this.d0 = connectionState;
            sz5 sz5Var = null;
            if (connectionState == 2) {
                str = "WaitingForNetwork";
                i = 2131742864;
            } else if (connectionState == 5) {
                str = "Updating";
                i = 2131743465;
            } else if (connectionState == 4) {
                str = "ConnectingToProxyWithDots";
                i = 2131751770;
            } else if (connectionState == 1) {
                str = "Connecting";
                i = 2131751774;
            } else {
                i = 0;
                str = null;
            }
            if (connectionState == 1 || connectionState == 4) {
                sz5Var = new sz5(this, (byte) 7);
            }
            ActionBarLayout actionBarLayout = this.p0;
            actionBarLayout.N0 = str;
            actionBarLayout.O0 = i;
            actionBarLayout.P0 = sz5Var;
            for (int i2 = 0; i2 < actionBarLayout.V0.size(); i2++) {
                ((org.telegram.ui.ActionBar.e) actionBarLayout.V0.get(i2)).setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, sz5Var);
            }
        }
    }

    public final int R() {
        return this.e0.size();
    }

    public final boolean V(android.content.Intent r128, boolean r129, boolean r130, boolean r131, defpackage.l01 r132, boolean r133, boolean r134) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.V(android.content.Intent, boolean, boolean, boolean, l01, boolean, boolean):boolean");
    }

    public final void W() {
        ActionMode actionMode = this.l0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void X(int i, TLRPC.User user, String str, l01 l01Var) {
        uc7 s1 = uc7.s1(i);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = s1.q1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new ic((byte) 0), new g45(this, l01Var, s1, i, user));
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.Z():void");
    }

    @Override
    public final void a(float f) {
        if (o.F() && o.u().W) {
            o u = o.u();
            u.Q();
            o.e0(u);
            if (u.g0 != null) {
                u.v0[0].b.i1();
                u.v0[1].b.i1();
                u.g0.invalidate();
                u.r0.invalidate();
                if (f == 1.0f) {
                    u.v0[0].c.f();
                    u.v0[1].c.f();
                }
            }
        }
        if (PhotoViewer.C0()) {
            PhotoViewer.q0().G2();
        }
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
        if (hl.O1() && actionBarLayout == this.q0) {
            this.r0.W(z, z);
            this.p0.W(z, z);
        }
    }

    public final void b0() {
        wk5[] wk5VarArr = {this.p0, this.q0, this.r0};
        for (int i = 0; i < 3; i++) {
            wk5 wk5Var = wk5VarArr[i];
            if (wk5Var instanceof ActionBarLayout) {
                ((ActionBarLayout) wk5Var).C();
            }
        }
    }

    public final boolean d0(boolean z) {
        boolean z2;
        ll4 ll4Var = nle.a;
        if (ll4Var != null) {
            if (ll4Var.s) {
                if (z) {
                    ll4Var.c(false);
                }
            }
            return false;
        }
        hz7 hz7Var = this.z0;
        if (hz7Var != null && hz7Var.b.getVisibility() == 0) {
            if (z) {
                finish();
                return false;
            }
        } else {
            gy0 gy0Var = this.x0;
            if (gy0Var != null && (z2 = gy0Var.V)) {
                if (z && z2) {
                    gy0Var.a(false);
                    return false;
                }
            } else {
                id idVar = ow9.I;
                if (idVar != null) {
                    if (z) {
                        idVar.dismiss();
                        ow9.I = null;
                        return false;
                    }
                } else if (rw2.g0 != null && rw2.e().E) {
                    if (z) {
                        rw2.e().c();
                        return false;
                    }
                } else if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                    if (z) {
                        SecretMediaViewer.d().c(true, false);
                        return false;
                    }
                } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
                    if (z) {
                        PhotoViewer.q0().A(true, false);
                        return false;
                    }
                } else if (!o.F() || !o.u().W) {
                    return true;
                } else {
                    if (z) {
                        o.u().l(true, false);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void e0() {
        HashSet hashSet;
        zz3 zz3Var = this.Z0;
        if (zz3Var != null) {
            hl.r(zz3Var);
            this.Z0 = null;
        }
        if (!this.R) {
            this.R = true;
            u8a u8aVar = this.m1;
            if (u8aVar != null) {
                u8aVar.a();
                this.m1 = null;
            }
            u8a u8aVar2 = this.n1;
            if (u8aVar2 != null) {
                u8aVar2.a();
                this.n1 = null;
            }
            j16 j16Var = this.p1;
            if (j16Var != null && (hashSet = i86.n) != null) {
                hashSet.remove(j16Var);
            }
        }
    }

    public final void f0(Intent intent, l01 l01Var) {
        super.onNewIntent(intent);
        Z();
        G();
        V(intent, true, false, false, l01Var, true, false);
    }

    public final void g0() {
        if (this.Z0 != null) {
            if (f11.a) {
                cc4.b("cancel lockRunnable onPasscodePause");
            }
            hl.r(this.Z0);
            this.Z0 = null;
        }
        if (xea.r.length() != 0) {
            xea.A = (int) (SystemClock.elapsedRealtime() / 1000);
            zz3 zz3Var = new zz3(this, (byte) 19);
            this.Z0 = zz3Var;
            if (xea.w) {
                hl.d3(zz3Var, 1000L);
                if (f11.a) {
                    cc4.b("schedule app lock in 1000");
                }
            } else if (xea.x != 0) {
                if (f11.a) {
                    cc4.b("schedule app lock in " + ((xea.x * 1000) + 1000));
                }
                hl.d3(this.Z0, (xea.x * 1000) + 1000);
            }
        } else {
            xea.A = 0;
        }
        xea.x();
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.e eVar, ActionBarLayout actionBarLayout) {
        boolean z;
        if (hl.O1()) {
            boolean z2 = eVar instanceof uj3;
            if (!z2 && !(eVar instanceof fj6)) {
                if ((eVar instanceof zu1) && !((zu1) eVar).X7()) {
                    if (!this.N0) {
                        ActionBarLayout actionBarLayout2 = this.r0;
                        if (actionBarLayout != actionBarLayout2) {
                            actionBarLayout2.getView().setVisibility(0);
                            this.u0.setVisibility(8);
                            this.r0.Z();
                            this.r0.b(-1, eVar);
                            if (!this.q0.getFragmentStack().isEmpty()) {
                                while (true) {
                                    int size = this.q0.getFragmentStack().size() - 1;
                                    ActionBarLayout actionBarLayout3 = this.q0;
                                    if (size > 0) {
                                        actionBarLayout3.c0(actionBarLayout3.getFragmentStack().get(0), false);
                                    } else {
                                        actionBarLayout3.j(true, false);
                                        return false;
                                    }
                                }
                            }
                            return false;
                        }
                    } else {
                        ActionBarLayout actionBarLayout4 = this.p0;
                        if (actionBarLayout != actionBarLayout4) {
                            actionBarLayout4.b(-1, eVar);
                            if (!this.q0.getFragmentStack().isEmpty()) {
                                while (true) {
                                    int size2 = this.q0.getFragmentStack().size() - 1;
                                    ActionBarLayout actionBarLayout5 = this.q0;
                                    if (size2 > 0) {
                                        actionBarLayout5.c0(actionBarLayout5.getFragmentStack().get(0), false);
                                    } else {
                                        actionBarLayout5.j(true, false);
                                        return false;
                                    }
                                }
                            }
                            return false;
                        }
                    }
                } else {
                    ActionBarLayout actionBarLayout6 = this.q0;
                    if (actionBarLayout != actionBarLayout6) {
                        actionBarLayout6.getView().setVisibility(0);
                        int i = 0;
                        while (true) {
                            if (i < 4) {
                                if (yac.h(i).o()) {
                                    break;
                                }
                                i++;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        if ((eVar instanceof qh6) && i == -1) {
                            this.u0.setVisibility(0);
                            this.t0.setBackgroundColor(0);
                        } else {
                            this.t0.setBackgroundColor(2130706432);
                        }
                        this.q0.b(-1, eVar);
                        return false;
                    }
                }
            } else {
                if (actionBarLayout != this.p0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && z2 && !((uj3) eVar).J3()) {
                    z = false;
                }
                if (z) {
                    this.p0.Z();
                    this.p0.b(-1, eVar);
                    this.q0.Z();
                    this.q0.getView().setVisibility(8);
                    if (!this.N0 && this.r0.getFragmentStack().isEmpty()) {
                        this.u0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.Z0 != null) {
            if (f11.a) {
                cc4.b("cancel lockRunnable onPasscodeResume");
            }
            hl.r(this.Z0);
            this.Z0 = null;
        }
        if (hl.n2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (xea.A != 0) {
            xea.A = 0;
            xea.x();
            if (f11.a) {
                cc4.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        id idVar = this.V0;
        if (idVar != null) {
            try {
                idVar.dismiss();
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
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(true, false);
            return true;
        } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer.q0().A(true, false);
            return true;
        } else if (!o.F() || !o.u().W) {
            return false;
        } else {
            o.u().l(true, false);
            return true;
        }
    }

    public final void j0(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.j0(boolean):void");
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (hl.O1()) {
            if (actionBarLayout == this.p0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.l1) {
                e0();
                finish();
                return false;
            } else if (actionBarLayout == this.r0) {
                if (!this.N0) {
                    this.u0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.q0 && this.p0.getFragmentStack().isEmpty() && this.q0.getFragmentStack().size() == 1) {
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
        qh6 qh6Var = new qh6();
        sz5 sz5Var = new sz5(this, (byte) 1);
        qh6Var.G = (byte) 3;
        qh6Var.a = 12;
        qh6Var.e0 = sz5Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.a |= 256;
                obj.b = indexOf;
                int i = lastIndexOf + 1;
                obj.c = i;
                valueOf.setSpan(new smb(obj, 0), indexOf, i, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            id idVar = alertDialog$Builder.a;
            idVar.S = valueOf;
            idVar.U = ob6.M0(2131751166, null);
            alertDialog$Builder.j(ob6.M0(2131752529, null), new u34(this, qh6Var, (byte) 11));
            ik8.y(null, 2131752570, alertDialog$Builder, null);
            return;
        }
        t0(qh6Var);
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, defpackage.tk5 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, tk5):boolean");
    }

    public final void l0(final long j, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i, final int i2) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            t0(tzb.G0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = uc7.s1(this.P).h1(-j);
        tL_channels_getMessages.id.add(num);
        ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.C1;
                hl.c3(new d06(LaunchActivity.this, tLObject, num, num2, bArr, j, runnable, str, i, i2));
            }
        });
    }

    public final void m0(int i, long j, TLRPC.TL_error tL_error) {
        zu1 zu1Var = new zu1(qu6.k(j, "user_id"));
        t0(zu1Var);
        hl.d3(new ls5((Object) tL_error, (Object) zu1Var, uc7.s1(i).X1(Long.valueOf(j)), (byte) 4), 300L);
    }

    public final void n0(int i, String str, String str2, l01 l01Var) {
        if (l01Var != null) {
            l01Var.d();
        }
        uc7 s1 = uc7.s1(i);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_contacts_importContactToken, new eu0(this, l01Var, s1, i, str2, (byte) 5));
    }

    public final void o0(int i, String str, String str2, l01 l01Var) {
        if (l01Var != null) {
            l01Var.d();
        }
        uc7 s1 = uc7.s1(i);
        s1.a2().a(str, null, new k16(this, s1, l01Var, i, str2, (byte) 0));
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.l0 == actionMode) {
            this.l0 = null;
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.p0;
            org.telegram.ui.ActionBar.a aVar = actionBarLayout.E;
            if (aVar != null) {
                aVar.setVisibility(0);
            }
            actionBarLayout.D0 = false;
            if (hl.O1()) {
                ActionBarLayout actionBarLayout2 = this.r0;
                org.telegram.ui.ActionBar.a aVar2 = actionBarLayout2.E;
                if (aVar2 != null) {
                    aVar2.setVisibility(0);
                }
                actionBarLayout2.D0 = false;
                ActionBarLayout actionBarLayout3 = this.q0;
                org.telegram.ui.ActionBar.a aVar3 = actionBarLayout3.E;
                if (aVar3 != null) {
                    aVar3.setVisibility(0);
                }
                actionBarLayout3.D0 = false;
            }
        }
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.l0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.p0.q(menu) && hl.O1() && !this.r0.q(menu)) {
                this.q0.q(menu);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.p0;
            org.telegram.ui.ActionBar.a aVar = actionBarLayout.E;
            if (aVar != null) {
                aVar.setVisibility(8);
            }
            actionBarLayout.D0 = true;
            if (hl.O1()) {
                ActionBarLayout actionBarLayout2 = this.r0;
                org.telegram.ui.ActionBar.a aVar2 = actionBarLayout2.E;
                if (aVar2 != null) {
                    aVar2.setVisibility(8);
                }
                actionBarLayout2.D0 = true;
                ActionBarLayout actionBarLayout3 = this.q0;
                org.telegram.ui.ActionBar.a aVar3 = actionBarLayout3.E;
                if (aVar3 != null) {
                    aVar3.setVisibility(8);
                }
                actionBarLayout3.D0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i, int i2, Intent intent) {
        o68 currentPeerView;
        am2 am2Var;
        VoIPService sharedInstance;
        boolean z = false;
        if (xea.r.length() != 0 && xea.A != 0) {
            xea.A = 0;
            if (f11.a) {
                cc4.b("reset lastPauseTime onActivityResult");
            }
            yac.h(this.P).u(false);
        }
        if (i == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.a.G = canDrawOverlays;
            if (canDrawOverlays) {
                j95 j95Var = j95.s5;
                if (j95Var != null) {
                    j95Var.H();
                }
                er9 er9Var = er9.Q0;
                if (er9Var != null) {
                    er9Var.e();
                }
                hl.d3(new sz5(this, (byte) 4), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
        String str = null;
        if (i >= 22336 && i <= 22399) {
            p35 p35Var = tne.b;
            if (p35Var != null && p35Var.e == this && p35Var.f && p35Var.g == i) {
                if (i2 != -1) {
                    str = "AUTH_CANCELED";
                }
                p35Var.c(str);
            }
        } else if (i == 520) {
            if (i2 == -1 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
                sharedInstance.createCaptureDevice(true);
            }
        } else if (i == 140) {
            id6 f = id6.f(this.P);
            if (i2 == -1) {
                z = true;
            }
            Utilities.d.c(new xac((byte) 25, f, z));
        } else if (i == 521) {
            te2 te2Var = this.q1;
            if (te2Var != null) {
                if (i2 == -1) {
                    z = true;
                }
                te2Var.a(Boolean.valueOf(z));
                this.q1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null && (am2Var = themeEditorView.m) != null) {
                am2Var.E(i, i2, intent);
            }
            ActionBarLayout actionBarLayout = this.p0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.e eVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
                eVar.onActivityResultFragment(i, i2, intent);
                if (eVar.getLastStoryViewer() != null && (currentPeerView = eVar.getLastStoryViewer().o0.getCurrentPeerView()) != null && i2 == -1) {
                    if (i != 0 && i != 2) {
                        if (i == 21) {
                            if (intent == null) {
                                currentPeerView.U0();
                            } else {
                                if (intent.getData() != null) {
                                    currentPeerView.N0(intent.getData());
                                } else if (intent.getClipData() != null) {
                                    ClipData clipData = intent.getClipData();
                                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                                        currentPeerView.N0(clipData.getItemAt(i3).getUri());
                                    }
                                } else {
                                    currentPeerView.U0();
                                }
                                f41 f41Var = currentPeerView.s2;
                                if (f41Var != null) {
                                    f41Var.dismiss();
                                }
                                currentPeerView.a0(true);
                            }
                        }
                    } else {
                        currentPeerView.j0();
                        f41 f41Var2 = currentPeerView.s2;
                        if (f41Var2 != null) {
                            f41Var2.d2.i0(i, intent, null);
                        }
                    }
                }
            }
            if (hl.O1()) {
                ActionBarLayout actionBarLayout2 = this.r0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
                }
                ActionBarLayout actionBarLayout3 = this.q0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
                }
            }
            jn7.e().k(jn7.f5, Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (d0(true)) {
            if (hl.O1()) {
                ActionBarLayout actionBarLayout = this.q0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.q0.G();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.r0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.r0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.e eVar = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
                    if (eVar.onBackPressed(true)) {
                        eVar.finishFragment();
                        return;
                    }
                    return;
                }
                this.p0.G();
                return;
            }
            this.p0.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        float f;
        int j;
        float f2;
        float f3;
        hl.v(this, configuration);
        this.t1.a();
        hl.r3(getWindow());
        super.onConfigurationChanged(configuration);
        fc3 b = fc3.b();
        ArrayList arrayList = (ArrayList) b.c;
        LaunchActivity launchActivity = (LaunchActivity) b.f;
        if (launchActivity == null || !hl.F1(launchActivity)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                xl4 xl4Var = ((me8) arrayList.get(i2)).e;
                if (xl4Var != null) {
                    boolean z = xl4Var.d;
                    if (xl4Var.j != null && !xl4Var.N) {
                        Activity activity = xl4Var.c;
                        hl.v(activity, activity.getResources().getConfiguration());
                        kj4.c = null;
                        kj4.d = null;
                        if (z) {
                            xl4Var.D = 1.0f;
                            i = xl4Var.A;
                            j = xl4Var.B;
                        } else {
                            Point point = hl.q;
                            xl4Var.D = (Math.min(point.x, point.y) - (xl4.n() * 2.0f)) / xl4Var.i();
                            i = (int) (xl4Var.i() * xl4Var.C);
                            je8 je8Var = xl4Var.b;
                            int U = je8Var.U();
                            int q0 = je8Var.q0();
                            if (U > 0 && q0 > 0) {
                                f = q0 / U;
                            } else {
                                f = 0.5625f;
                            }
                            j = (int) (((int) (xl4.j(f) * f)) * xl4Var.C);
                        }
                        if (xl4Var.A != i || xl4Var.B != j) {
                            WindowManager.LayoutParams layoutParams = xl4Var.f;
                            xl4Var.A = i;
                            layoutParams.width = i;
                            xl4Var.B = j;
                            layoutParams.height = j;
                            xl4Var.v();
                        }
                        vpa vpaVar = xl4Var.G;
                        vpaVar.b = xl4Var.E;
                        vpaVar.c = true;
                        vpaVar.m.i = xl4.p(f2, xl4Var.A);
                        xl4Var.G.h();
                        vpa vpaVar2 = xl4Var.H;
                        vpaVar2.b = xl4Var.F;
                        vpaVar2.c = true;
                        vpaVar2.m.i = xl4.e(f3, xl4Var.B);
                        xl4Var.H.h();
                    }
                }
            }
        }
        hl.Y2();
        Z();
        G();
        hl.c3(new sz5(this, (byte) 5));
        iv3 iv3Var = iv3.R1;
        if (iv3Var != null) {
            iv3Var.Z(configuration);
        }
        dn0 dn0Var = dn0.o1;
        if (dn0Var != null) {
            dn0Var.Z(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            int i3 = themeEditorView.l.getInt("sidex", 1);
            int i4 = themeEditorView.l.getInt("sidey", 0);
            float f4 = themeEditorView.l.getFloat("px", 0.0f);
            float f5 = themeEditorView.l.getFloat("py", 0.0f);
            themeEditorView.i.x = ThemeEditorView.b(f4, i3, themeEditorView.g, true);
            themeEditorView.i.y = ThemeEditorView.b(f5, i4, themeEditorView.h, false);
            try {
                if (themeEditorView.c.getParent() != null) {
                    themeEditorView.j.updateViewLayout(themeEditorView.c, themeEditorView.i);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (aob.o == 3) {
            aob.E(false);
        }
    }

    @Override
    public final void onCreate(android.os.Bundle r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public final void onDestroy() {
        mr4 mr4Var;
        ArrayList arrayList;
        d26 d26Var;
        p35 p35Var = tne.b;
        if (p35Var != null && p35Var.e == this) {
            p35Var.c("AUTH_CANCELED");
            tne.b.e();
        }
        fc3 b = fc3.b();
        ArrayList arrayList2 = (ArrayList) b.c;
        if (((LaunchActivity) b.f) == this) {
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((me8) arrayList2.get(size)).b();
            }
            ((ygb) b.e).c();
            b.f = null;
            ((ArrayList) b.d).clear();
        }
        int i = 0;
        E1 = false;
        F1--;
        ak akVar = this.f1;
        if (akVar != null) {
            unregisterReceiver(akVar);
            this.f1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.k9 != null) {
                PhotoViewer.k9.L();
            }
            if (PhotoViewer.C0()) {
                PhotoViewer.q0().L();
            }
            if (SecretMediaViewer.e()) {
                SecretMediaViewer d = SecretMediaViewer.d();
                Runnable runnable = d.o1;
                if (runnable != null) {
                    runnable.run();
                    d.o1 = null;
                }
                e26 e26Var = d.k1;
                if (e26Var != null) {
                    e26Var.a();
                    d.k1 = null;
                }
                jn7.f(d.a).n(d, jn7.v);
                jn7.f(d.a).n(d, jn7.l0);
                jn7.f(d.a).n(d, jn7.i0);
                d.s = false;
                d.M = null;
                mn5 mn5Var = d.h0;
                if (mn5Var != null) {
                    mn5Var.a();
                    d.h0 = null;
                }
                d.j();
                if (d.b != null && (d26Var = d.d) != null) {
                    try {
                        if (d26Var.getParent() != null) {
                            ((WindowManager) d.b.getSystemService("window")).removeViewImmediate(d.d);
                        }
                        d.d = null;
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                SecretMediaViewer.w1 = null;
            }
            if (o.F()) {
                o.u().q();
            }
            if (rw2.g0 != null) {
                rw2 e2 = rw2.e();
                e2.E = false;
                e2.l = null;
                e2.W = null;
                e2.Y = null;
                e2.a0 = null;
                if (e2.w != null && e2.y != null) {
                    Bitmap bitmap = e2.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        e2.v = null;
                    }
                    e2.M = 0.0f;
                    e2.K = false;
                    try {
                        if (e2.y.getParent() != null) {
                            ((WindowManager) e2.w.getSystemService("window")).removeViewImmediate(e2.y);
                        }
                        e2.y = null;
                    } catch (Exception e3) {
                        cc4.g(e3, true);
                    }
                    rw2.g0 = null;
                    jn7.e().k(jn7.k1, 8);
                }
            }
            j95 j95Var = j95.s5;
            if (j95Var != null) {
                j95Var.H();
            }
            er9 er9Var = er9.Q0;
            if (er9Var != null) {
                er9Var.e();
            }
            int i2 = aob.a;
            iv3 iv3Var = iv3.R1;
            if (iv3Var != null) {
                iv3Var.F0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            ll4 ll4Var = nle.a;
            if (ll4Var != null) {
                ll4Var.e.edit().putFloat("x", (float) ll4Var.c.m.i).putFloat("y", (float) ll4Var.d.m.i).commit();
            }
            nle.a = null;
            SparseArray sparseArray = wl.r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController z = MediaController.z();
        if (z.K0 == this) {
            z.K0 = null;
        }
        MediaController z2 = MediaController.z();
        if (z2.L0 == this.s1) {
            z2.L0 = null;
        }
        while (true) {
            try {
                int size2 = this.D0.size();
                arrayList = this.D0;
                if (i >= size2) {
                    break;
                }
                if (((Dialog) arrayList.get(i)).isShowing()) {
                    ((Dialog) this.D0.get(i)).dismiss();
                }
                i++;
            } catch (Exception e4) {
                cc4.g(e4, true);
            }
        }
        arrayList.clear();
        try {
            if (this.h0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.h0);
            }
        } catch (Exception e5) {
            cc4.g(e5, true);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            if (this.j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.j1);
            }
        } else if (i3 >= 33 && this.j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.k1);
        }
        v21.h(this.v0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        e0();
        c34 c34Var = this.e1;
        if (c34Var != null) {
            c34Var.g();
        }
        if (i3 >= 24 && (mr4Var = this.i1) != null) {
            mr4Var.b();
        }
    }

    @Override
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82 && !xea.B) {
            if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
                return super.onKeyUp(i, keyEvent);
            }
            if (o.F() && o.u().W) {
                return super.onKeyUp(i, keyEvent);
            }
            if (hl.O1()) {
                if (this.q0.getView().getVisibility() == 0 && !this.q0.getFragmentStack().isEmpty()) {
                    this.q0.getView().onKeyUp(i, keyEvent);
                } else if (this.r0.getView().getVisibility() == 0 && !this.r0.getFragmentStack().isEmpty()) {
                    this.r0.getView().onKeyUp(i, keyEvent);
                } else {
                    this.p0.getView().onKeyUp(i, keyEvent);
                }
            } else {
                this.p0.getView().onKeyUp(i, keyEvent);
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.p0;
        if (actionBarLayout != null) {
            actionBarLayout.K();
            if (hl.O1()) {
                ActionBarLayout actionBarLayout2 = this.r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.K();
                }
                ActionBarLayout actionBarLayout3 = this.q0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.K();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z) {
        hl.E = z;
        this.t1.a();
        G();
        super.onMultiWindowModeChanged(z);
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Z();
        G();
        V(intent, true, false, false, null, true, true);
    }

    @Override
    public final void onPause() {
        boolean z;
        VoIPService sharedInstance;
        xl4 xl4Var;
        ne8 ne8Var;
        super.onPause();
        G1 = false;
        k0d.q(true);
        fc3 b = fc3.b();
        ArrayList arrayList = (ArrayList) b.c;
        if (this == ((LaunchActivity) b.f)) {
            b.b = false;
            ygb ygbVar = (ygb) b.e;
            LaunchActivity launchActivity = ygbVar.b;
            if (launchActivity != null && Build.VERSION.SDK_INT >= 31 && ygbVar.f == null && ygbVar.e != null && hl.F1(launchActivity)) {
                ygbVar.i(ygbVar.e);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                me8 me8Var = (me8) arrayList.get(i);
                if (me8Var.c == 1 && (xl4Var = me8Var.e) != null && !xl4Var.g && (ne8Var = xl4Var.l) != null && xl4Var.n != null && ne8Var.isAvailable()) {
                    try {
                        Bitmap bitmap = xl4Var.l.getBitmap();
                        if (bitmap != null) {
                            xl4Var.n.setImageBitmap(bitmap);
                            xl4Var.n.setVisibility(0);
                            xl4Var.l.setFirstFrameCallback(null);
                        }
                    } catch (Throwable th) {
                        cc4.g(th, true);
                    }
                }
            }
        }
        jn7.e().k(jn7.j1, 4096);
        org.telegram.messenger.a.x = true;
        Utilities.d.c(new gw0(this.P, (byte) 5));
        g0();
        this.p0.M();
        if (hl.O1()) {
            ActionBarLayout actionBarLayout = this.r0;
            if (actionBarLayout != null) {
                actionBarLayout.M();
            }
            ActionBarLayout actionBarLayout2 = this.q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.M();
            }
        }
        hz7 hz7Var = this.z0;
        if (hz7Var != null) {
            hz7Var.b.k();
        }
        ArrayList arrayList2 = this.A0;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((fz7) obj).k();
        }
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer q0 = PhotoViewer.q0();
            if (q0.k2 != null) {
                q0.A(false, false);
            } else {
                kfc kfcVar = q0.G2;
                if (kfcVar != null && q0.Z2) {
                    kfcVar.r0(hl.F1(q0.E));
                }
            }
        }
        sbb sbbVar = sbb.G2;
        if (sbbVar != null) {
            sbbVar.t(false);
            ibb ibbVar = sbbVar.d1;
            if (ibbVar != null) {
                ibbVar.f.r();
            }
            hbb hbbVar = sbbVar.Y0;
            if (hbbVar != null) {
                hbbVar.x(0, true);
            }
        }
        dlc.a(this);
        mkc mkcVar = mkc.m1;
        if (mkcVar != null) {
            boolean isInteractive = ((PowerManager) mkcVar.b.getSystemService("power")).isInteractive();
            boolean canDrawOverlays = Settings.canDrawOverlays(mkcVar.b);
            if (!canDrawOverlays && !ove.a(mkcVar.b)) {
                z = false;
            } else {
                z = true;
            }
            if (mkcVar.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && canDrawOverlays) {
                int measuredHeight = mkc.m1.u0.getMeasuredHeight();
                mkc mkcVar2 = mkc.m1;
                dlc.f(mkcVar2.b, mkcVar2.a, mkcVar2.u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = mkc.m1.r0;
                if (windowInsets != null) {
                    dlc.W = windowInsets.getSystemWindowInsetTop();
                    mkc.m1.r0.getSystemWindowInsetBottom();
                }
            }
            if (mkcVar.n0 && ((!z || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (dlc.d() != null) {
                dlc.d().e();
            }
        } else if (dlc.d() != null) {
            dlc.d().e();
        }
        HashMap hashMap = mpa.n;
        if (hashMap != null) {
            for (mpa mpaVar : hashMap.values()) {
                lpa lpaVar = mpaVar.f;
                if (lpaVar != null) {
                    lpaVar.b = true;
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
        ((ygb) fc3.b().e).g();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        ((ygb) fc3.b().e).f(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (!w(i, strArr, iArr)) {
            return;
        }
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        if (this.p0.getFragmentStack().size() != 0) {
            this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
        }
        if (hl.O1()) {
            if (this.r0.getFragmentStack().size() != 0) {
                this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
            if (this.q0.getFragmentStack().size() != 0) {
                this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
        }
        mkc.h(iArr, i);
        sbb sbbVar = sbb.G2;
        if (sbbVar != null) {
            x53 x53Var = sbbVar.a;
            Activity activity = sbbVar.b;
            if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i == 111) {
                sbbVar.t2 = !z;
                if (z && sbbVar.g0 == 0) {
                    sbbVar.B0.setCameraThumb(null);
                    if (CameraController.getInstance().isCameraInitied()) {
                        sbbVar.p();
                    } else {
                        CameraController.getInstance().initCamera(new bab(sbbVar, (byte) 0));
                    }
                }
            } else if (i == 114) {
                if (z) {
                    MediaController.R(0);
                    sbbVar.c(true);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, x53Var, activity);
                    int i2 = aob.L5;
                    alertDialog$Builder.l(2131624119, 72, aob.w0(null, i2, false), null);
                    alertDialog$Builder.m(i2, null);
                    SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747026, null));
                    id idVar = alertDialog$Builder.a;
                    idVar.U = S2;
                    alertDialog$Builder.j(ob6.M0(2131747027, null), new kab(sbbVar, (byte) 2));
                    alertDialog$Builder.g(ob6.M0(2131751737, null), null);
                    idVar.show();
                }
            } else if (i == 112) {
                if (!z) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, x53Var, activity);
                    int i3 = aob.L5;
                    alertDialog$Builder2.l(2131624117, 72, aob.w0(null, i3, false), null);
                    alertDialog$Builder2.m(i3, null);
                    SpannableStringBuilder S22 = hl.S2(ob6.M0(2131747036, null));
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.U = S22;
                    alertDialog$Builder2.j(ob6.M0(2131747027, null), new kab(sbbVar, (byte) 3));
                    alertDialog$Builder2.g(ob6.M0(2131751737, null), null);
                    idVar2.show();
                }
            } else if (i == 115) {
                if (!z) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, x53Var, activity);
                    int i4 = aob.L5;
                    alertDialog$Builder3.l(2131624119, 72, aob.w0(null, i4, false), null);
                    alertDialog$Builder3.m(i4, null);
                    SpannableStringBuilder S23 = hl.S2(ob6.M0(2131747040, null));
                    id idVar3 = alertDialog$Builder3.a;
                    idVar3.U = S23;
                    alertDialog$Builder3.j(ob6.M0(2131747027, null), new kab(sbbVar, (byte) 5));
                    alertDialog$Builder3.g(ob6.M0(2131751737, null), null);
                    idVar3.show();
                } else {
                    hl3 hl3Var = sbbVar.z2;
                    if (hl3Var != null) {
                        hl3Var.run();
                    }
                }
                sbbVar.z2 = null;
            }
        }
        jn7.e().k(jn7.g5, Integer.valueOf(i), strArr, iArr);
        SparseIntArray sparseIntArray = this.b1;
        if (sparseIntArray.get(i, -1) >= 0) {
            int i5 = sparseIntArray.get(i, -1);
            sparseIntArray.delete(i);
            jn7.e().k(jn7.r5, Integer.valueOf(i5));
        }
        jn7.e().k(jn7.s5, Integer.valueOf(i), strArr, iArr);
    }

    @Override
    public final void onResume() {
        na9 na9Var;
        do6 do6Var;
        boolean z;
        LaunchActivity launchActivity;
        super.onResume();
        k0d.q(false);
        G1 = true;
        fc3 b = fc3.b();
        ArrayList arrayList = (ArrayList) b.c;
        ArrayList arrayList2 = (ArrayList) b.d;
        if (this == ((LaunchActivity) b.f)) {
            b.b = true;
            ygb ygbVar = (ygb) b.e;
            if (ygbVar.f != null && (launchActivity = ygbVar.b) != null && !hl.F1(launchActivity)) {
                ygbVar.d();
            }
            for (int i = 0; i < arrayList.size(); i++) {
                me8 me8Var = (me8) arrayList.get(i);
                xl4 xl4Var = me8Var.e;
                if (xl4Var != null && me8Var.c == 1 && xl4Var.h && !xl4Var.N) {
                    if (!xl4Var.d && xl4Var.b.E() && Settings.canDrawOverlays(xl4Var.c)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != xl4Var.g) {
                        xl4Var.m();
                        xl4Var.a();
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList2.clear();
                int size = arrayList3.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList3.get(i2);
                    i2++;
                    ((Runnable) obj).run();
                }
            }
            b.d();
        }
        if (aob.o == 3) {
            aob.E(false);
        }
        id6[] id6VarArr = id6.P;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            if (yac.h(i3).o() && !id6.f(i3).J.isEmpty()) {
                id6.q();
                break;
            }
            i3++;
        }
        I(true);
        jn7.e().k(jn7.k1, 4096);
        MediaController z2 = MediaController.z();
        ViewGroup view = this.p0.getView();
        this.s1 = view;
        z2.L0 = view;
        org.telegram.messenger.a.x = false;
        uc7.s1(this.P).h5(null);
        I0();
        Utilities.d.c(new jm3((byte) 21));
        D(0);
        if (Build.VERSION.SDK_INT >= 24 && (do6Var = MediaController.b2) != null) {
            Utilities.e.d(new gw0(do6Var.e.size(), (byte) 7), 2000L);
        }
        h0();
        hz7 hz7Var = this.z0;
        if (hz7Var != null && hz7Var.b.getVisibility() == 0) {
            this.p0.l();
            if (hl.O1()) {
                ActionBarLayout actionBarLayout = this.r0;
                if (actionBarLayout != null) {
                    actionBarLayout.l();
                }
                ActionBarLayout actionBarLayout2 = this.q0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.l();
                }
            }
            this.z0.b.l();
            ArrayList arrayList4 = this.A0;
            int size2 = arrayList4.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList4.get(i4);
                i4++;
                ((fz7) obj2).l();
            }
        } else {
            this.p0.N();
            if (hl.O1()) {
                ActionBarLayout actionBarLayout3 = this.r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.N();
                }
                ActionBarLayout actionBarLayout4 = this.q0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.N();
                }
            }
        }
        ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        P0();
        if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer q0 = PhotoViewer.q0();
            ad8 ad8Var = q0.f0;
            if (ad8Var != null) {
                ad8Var.invalidate();
                hl.d3(new oe7(q0, 0, (byte) 6), 100L);
            }
            kfc kfcVar = q0.G2;
            if (kfcVar != null) {
                kfcVar.o0(kfcVar.S() + 1);
                if (q0.Z2) {
                    q0.G2.r0(true);
                }
            }
            hc8 hc8Var = q0.M1;
            if (hc8Var != null && (na9Var = hc8Var.G0.d) != null) {
                na9Var.postRunnable(na9Var.x);
            }
        }
        sbb sbbVar = sbb.G2;
        if (sbbVar != null) {
            sbbVar.O();
        }
        if (yac.h(yac.t0).a0 != null) {
            int i5 = yac.t0;
            L0(i5, yac.h(i5).a0);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = xea.f1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                int i6 = yac.t0;
                if (this.C0 == null) {
                    ?? frameLayout = new FrameLayout(this);
                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    int i7 = aob.d6;
                    frameLayout.x = new GradientDrawable(orientation, new int[]{aob.w0(null, i7, false), 0});
                    frameLayout.y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{aob.w0(null, i7, false), 0});
                    yob.h(i7, null, frameLayout);
                    int i8 = (int) (hl.m / hl.p);
                    FrameLayout frameLayout2 = new FrameLayout(this);
                    frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, hl.L(176.0f) + hl.m));
                    ?? imageView = new ImageView(this);
                    imageView.f(2131624167, 108, 108, null);
                    imageView.d();
                    imageView.getAnimatedDrawable().F(1);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setPadding(0, 0, 0, hl.L(14.0f));
                    frameLayout2.addView((View) imageView, tre.d(-2, -2.0f, 17, 0.0f, i8, 0.0f, 0.0f));
                    imageView.setOnClickListener(new rk0(frameLayout));
                    FrameLayout frameLayout3 = new FrameLayout(this);
                    ScrollView scrollView = new ScrollView(this);
                    frameLayout.f = scrollView;
                    hl.u3(scrollView, aob.w0(null, aob.s8, false));
                    scrollView.setPadding(0, hl.L(16.0f), 0, hl.L(16.0f));
                    scrollView.setClipToPadding(false);
                    frameLayout.addView(scrollView, tre.d(-1, -1.0f, 51, 27.0f, i8 + 178, 27.0f, 130.0f));
                    scrollView.addView(frameLayout3);
                    TextView textView = new TextView(this);
                    int i9 = aob.G6;
                    yob.X(textView, i9, null);
                    textView.setTextSize(1, 20.0f);
                    textView.setGravity(49);
                    textView.setTypeface(hl.o());
                    textView.setText(ob6.M0(2131743471, null));
                    frameLayout3.addView(textView, tre.e(-2, -2, 49));
                    TextView textView2 = new TextView(this);
                    frameLayout.a = textView2;
                    yob.X(textView2, i9, null);
                    yob.G(textView2, aob.J6, null);
                    textView2.setTextSize(1, 15.0f);
                    textView2.setMovementMethod(new dl((byte) 0));
                    textView2.setGravity(49);
                    textView2.setLineSpacing(hl.L(2.0f), 1.0f);
                    frameLayout3.addView(textView2, tre.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                    zc zcVar = new zc(this, (byte) 3);
                    frameLayout.d = zcVar;
                    zcVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                    zcVar.setBackgroundDrawable(rnb.f(aob.Fi, 4.0f));
                    zcVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                    frameLayout.addView(zcVar, tre.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
                    zcVar.setOnClickListener(new rk0(frameLayout, this));
                    TextView textView3 = new TextView(this);
                    frameLayout.b = textView3;
                    textView3.setGravity(17);
                    textView3.setTypeface(hl.o());
                    textView3.setTextColor(-1);
                    textView3.setTextSize(1, 14.0f);
                    zcVar.addView(textView3, tre.e(-2, -2, 17));
                    zc zcVar2 = new zc((byte) 4, this, (Object) frameLayout);
                    frameLayout.c = zcVar2;
                    zcVar2.setWillNotDraw(false);
                    zcVar2.setAlpha(0.0f);
                    zcVar2.setScaleX(0.1f);
                    zcVar2.setScaleY(0.1f);
                    zcVar2.setVisibility(4);
                    g29 g29Var = new g29(zcVar2);
                    frameLayout.e = g29Var;
                    g29Var.d(null, true, false);
                    g29Var.o = -1;
                    zcVar.addView(zcVar2, tre.e(36, 36, 17));
                    this.C0 = frameLayout;
                    this.y0.addView((View) frameLayout, tre.c(-1.0f, -1));
                }
                sk0 sk0Var = this.C0;
                sk0Var.w = 0;
                sk0Var.n = tL_help_appUpdate;
                sk0Var.s = i6;
                TLRPC.Document document = tL_help_appUpdate.document;
                if (document instanceof TLRPC.TL_document) {
                    sk0Var.r = xb4.r(null, document);
                }
                if (sk0Var.getVisibility() != 0) {
                    sk0Var.setVisibility(0);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
                r47.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
                sk0Var.a.setText(spannableStringBuilder);
                boolean z3 = tL_help_appUpdate.document instanceof TLRPC.TL_document;
                TextView textView4 = sk0Var.b;
                if (z3) {
                    textView4.setText(ob6.M0(2131743477, null).concat(String.format(Locale.US, " (%1$s)", hl.i0(tL_help_appUpdate.document.size, false, false))));
                } else {
                    textView4.setText(ob6.M0(2131743477, null));
                }
                jn7.f(sk0Var.s).b(sk0Var, jn7.Y1);
                jn7.f(sk0Var.s).b(sk0Var, jn7.Z1);
                jn7.f(sk0Var.s).b(sk0Var, jn7.X1);
                org.telegram.messenger.a.t();
            }
        }
        A(false);
        org.telegram.messenger.a.G = Settings.canDrawOverlays(this);
        dlc.a(this);
        mkc mkcVar = mkc.m1;
        if (mkcVar != null) {
            if (dlc.d() != null) {
                dlc.b();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                mkcVar.y();
            } else if (VoIPService.getSharedState() == null) {
                mkcVar.u0.b();
            }
            mkcVar.J0 = ((KeyguardManager) mkcVar.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (dlc.d() != null) {
                dlc.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        } else if (dlc.d() != null) {
            dlc.d().getClass();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getVideoState(false) == 1) {
                sharedInstance3.setVideoState(false, 2);
            }
        }
        Z();
        HashMap hashMap = mpa.n;
        if (hashMap != null) {
            for (mpa mpaVar : hashMap.values()) {
                lpa lpaVar = mpaVar.f;
                if (lpaVar != null) {
                    lpaVar.b = false;
                }
            }
        }
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ys ysVar = J1;
        if (ysVar != null) {
            ysVar.run();
            J1 = null;
        }
        uc7 s1 = uc7.s1(this.P);
        if (!s1.v3.contains("SETUP_LOGIN_EMAIL") && !s1.v3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            return;
        }
        Utilities.d.c(new pa7(uc7.s1(this.P), (byte) 9));
    }

    @Override
    public final void onSaveInstanceState(android.os.Bundle r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override
    public final void onStart() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onStart():void");
    }

    @Override
    public final void onStop() {
        xl4 xl4Var;
        super.onStop();
        p35 p35Var = tne.b;
        if (p35Var != null && p35Var.e == this && Build.VERSION.SDK_INT < 30) {
            p35 p35Var2 = tne.b;
            if (!p35Var2.f) {
                p35Var2.c("AUTH_CANCELED");
                tne.b.e();
            }
        }
        this.r1 = false;
        fc3 b = fc3.b();
        ArrayList arrayList = (ArrayList) b.c;
        if (this == ((LaunchActivity) b.f)) {
            b.a = false;
            ((ygb) b.e).getClass();
            for (int i = 0; i < arrayList.size(); i++) {
                me8 me8Var = (me8) arrayList.get(i);
                byte b2 = me8Var.c;
                je8 je8Var = me8Var.a;
                if (b2 == 1 && (xl4Var = me8Var.e) != null && !xl4Var.g && je8Var.A0()) {
                    je8Var.b();
                    me8Var.e();
                }
            }
        }
        if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer.q0().g1();
        }
        m01.z(this);
        org.telegram.messenger.a.y = true;
        ra5.k(this);
        j95 j95Var = j95.s5;
        if (j95Var != null) {
            j95Var.n1();
        }
        er9 er9Var = er9.Q0;
        if (er9Var != null) {
            er9Var.I0 = true;
            er9Var.v();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.h1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        ((ygb) fc3.b().e).g();
        ArrayList arrayList = this.a1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.p0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.V0.isEmpty()) {
                ((org.telegram.ui.ActionBar.e) bp1.m(1, actionBarLayout.V0)).onUserLeaveHint();
            }
            l6 l6Var = actionBarLayout.H;
            if (l6Var != null) {
                l6Var.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z) {
        boolean z2;
        ArrayList arrayList;
        l6b a;
        long[] jArr2 = jArr;
        int i = 0;
        while (true) {
            if (i < jArr2.length) {
                TLRPC.User X1 = uc7.s1(this.P).X1(Long.valueOf(jArr2[i]));
                if (X1 != null && !X1.stories_hidden) {
                    z2 = false;
                    break;
                }
                i++;
            } else {
                z2 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.e Q = Q();
        if (Q != null) {
            c6b O1 = uc7.s1(this.P).O1();
            if (z2) {
                arrayList = O1.h;
            } else {
                arrayList = O1.g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z3 = z2;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z3) {
                ArrayList arrayList5 = new ArrayList();
                for (int i2 = 0; i2 < jArr2.length; i2++) {
                    TLRPC.User X12 = uc7.s1(this.P).X1(Long.valueOf(jArr2[i2]));
                    if (X12 == null || !X12.stories_hidden) {
                        arrayList5.add(Long.valueOf(jArr2[i2]));
                    }
                }
                Object[] array = arrayList5.toArray();
                int length = array.length;
                long[] jArr3 = new long[length];
                for (int i3 = 0; i3 < length; i3++) {
                    Object obj = array[i3];
                    obj.getClass();
                    jArr3[i3] = ((Number) obj).longValue();
                }
                jArr2 = jArr3;
            }
            int i4 = 0;
            if (z) {
                while (i4 < jArr2.length) {
                    i4 = dze.c(i4, 1, jArr2[i4], arrayList4);
                }
            } else {
                while (i4 < jArr2.length) {
                    i4 = dze.c(i4, 1, jArr2[i4], arrayList3);
                }
            }
            if (!arrayList4.isEmpty() && z) {
                uc7 s1 = uc7.s1(this.P);
                int[] iArr = {arrayList4.size()};
                ls5 ls5Var = new ls5(this, iArr, jArr2, (byte) 8);
                for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                    long longValue = ((Long) arrayList4.get(i5)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer j1 = s1.j1(longValue);
                    tL_stories_getPeerStories.peer = j1;
                    if (j1 instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getPeerStories, new p87(s1, longValue, ls5Var, (byte) 3));
                    }
                }
                return;
            }
            long e = yac.h(this.P).e();
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                long n = wf3.n(((TL_stories.PeerStories) arrayList2.get(i6)).peer);
                if (n != e && !arrayList3.contains(Long.valueOf(n)) && O1.K(n)) {
                    arrayList3.add(Long.valueOf(n));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (Q instanceof uj3) {
                    try {
                        a = l6b.a(((uj3) Q).F0.h);
                    } catch (Exception unused) {
                    }
                    l6b l6bVar = a;
                    Q.getOrCreateStoryViewer().y();
                    Q.getOrCreateStoryViewer().K(this, null, arrayList3, 0, null, null, l6bVar, false);
                }
                a = null;
                l6b l6bVar2 = a;
                Q.getOrCreateStoryViewer().y();
                Q.getOrCreateStoryViewer().K(this, null, arrayList3, 0, null, null, l6bVar2, false);
            }
        }
    }

    @Override
    public final boolean q(defpackage.uj3 r49, java.util.ArrayList r50, final java.lang.CharSequence r51, boolean r52, boolean r53, int r54, final int r55, defpackage.tzb r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.q(uj3, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, tzb):boolean");
    }

    public final void q0(final int i, final long j, final boolean z) {
        TL_stories.StoryItem storyItem;
        v5b v5bVar;
        v5b z2;
        r47 f;
        r47 f2;
        TL_stories.StoryItem storyItem2;
        c6b O1 = uc7.s1(this.P).O1();
        TL_stories.PeerStories x = O1.x(j);
        l6b l6bVar = null;
        if (x != null) {
            int i2 = 0;
            while (true) {
                if (i2 < x.stories.size()) {
                    if (x.stories.get(i2).id == i) {
                        storyItem2 = x.stories.get(i2);
                        break;
                    }
                    i2++;
                } else {
                    storyItem2 = null;
                    break;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j;
                org.telegram.ui.ActionBar.e Q = Q();
                if (Q != null) {
                    if (Q instanceof uj3) {
                        try {
                            l6bVar = l6b.a(((uj3) Q).F0.h);
                        } catch (Exception unused) {
                        }
                    }
                    l6b l6bVar2 = l6bVar;
                    Q.getOrCreateStoryViewer().y();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z) {
                        Q.getOrCreateStoryViewer().w1 = true;
                    }
                    Q.getOrCreateStoryViewer().K(this, storyItem2, arrayList, 0, null, x, l6bVar2, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            v5b z3 = O1.z(0, -1, j, true);
            if (z3 != null && (f2 = z3.f(i)) != null) {
                storyItem = f2.l;
            } else {
                z3 = null;
            }
            if (storyItem == null && (z2 = O1.z(1, -1, j, true)) != null && (f = z2.f(i)) != null) {
                storyItem = f.l;
                v5bVar = z2;
            } else {
                v5bVar = z3;
            }
            if (storyItem != null && v5bVar != null) {
                storyItem.dialogId = j;
                org.telegram.ui.ActionBar.e Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof uj3) {
                    try {
                        l6bVar = l6b.a(((uj3) Q2).F0.h);
                    } catch (Exception unused2) {
                    }
                }
                l6b l6bVar3 = l6bVar;
                Q2.getOrCreateStoryViewer().y();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z) {
                    Q2.getOrCreateStoryViewer().w1 = true;
                }
                Q2.getOrCreateStoryViewer().K(this, storyItem, arrayList2, 0, v5bVar, null, l6bVar3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = uc7.s1(this.P).j1(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.C1;
                hl.c3(new kn3(LaunchActivity.this, tLObject, i, j, z));
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, znb znbVar) {
        int i = znbVar.g0;
        boolean z = false;
        ynb d = znbVar.d(tL_theme, this.P, 0);
        znbVar.a0 = znbVar.Z;
        znbVar.u(d.a);
        d.s = tL_wallPaper;
        if (i != znbVar.g0) {
            z = true;
        }
        t0(new pqb(znbVar, z, 0, false, false));
    }

    @Override
    public final boolean s(defpackage.uj3 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s(uj3):boolean");
    }

    public final void s0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void setRequestedOrientation(int i) {
        hl.g = -10;
        hl.h = -10;
        hl.i = null;
        super.setRequestedOrientation(i);
    }

    public final void t0(org.telegram.ui.ActionBar.e eVar) {
        ((ActionBarLayout) N()).S(eVar);
    }

    public final boolean u0(org.telegram.ui.ActionBar.e eVar, boolean z, boolean z2) {
        return ((ActionBarLayout) N()).U(eVar, z, z2);
    }

    public final void v0(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i < arrayList.size()) {
                if (arrayList.get(i) instanceof xw0) {
                    xw0 xw0Var = (xw0) arrayList.get(i);
                    if (xw0Var.isShowing() && xw0Var.J == j) {
                        return;
                    }
                }
                i++;
            } else {
                org.telegram.ui.ActionBar.e S = S();
                if (S != null && S.sheetsStack != null) {
                    for (int i2 = 0; i2 < S.sheetsStack.size(); i2++) {
                        if (S.sheetsStack.get(i2).s()) {
                            S.sheetsStack.get(i2);
                        }
                    }
                }
                s24 v = this.p0.v();
                if (v != null && v.sheetsStack != null) {
                    for (int i3 = 0; i3 < v.sheetsStack.size(); i3++) {
                        if (v.sheetsStack.get(i3).s()) {
                            v.sheetsStack.get(i3);
                        }
                    }
                }
                j16 j16Var = new j16(this, (byte) 0);
                TLRPC.User X1 = uc7.s1(this.P).X1(Long.valueOf(j));
                if (X1 != null) {
                    j16Var.a(X1);
                    return;
                } else {
                    kf7.a0(this.P).a.c(new ue2(this, j, j16Var, (byte) 27));
                    return;
                }
            }
        }
    }

    public final void w0(Long l, tg5 tg5Var, l01 l01Var, wb2 wb2Var) {
        xg1 G0 = uc7.s1(this.P).G0();
        if (l01Var != null) {
            l01Var.d();
        }
        G0.a(l.longValue(), new o45(this, l01Var, tg5Var, G0, l, wb2Var, (byte) 2));
    }

    public final void x0(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, String str26, final String str27, final l01 l01Var, final boolean z3, final int i4, final int i5, final int i6, final boolean z4, final String str28, final TLRPC.User user, final tg5 tg5Var, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final String str29, final boolean z12) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = uc7.s1(i).q1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str30 = LaunchActivity.C1;
                final l01 l01Var2 = l01Var;
                if (l01Var2 != null) {
                    l01Var2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i7 = i;
                final boolean z13 = z3;
                final boolean z14 = z7;
                final boolean z15 = z8;
                final boolean z16 = z9;
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
                    final boolean z17 = z;
                    final Integer num3 = num;
                    final Long l3 = l;
                    final Long l4 = l2;
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
                    final boolean z18 = z2;
                    final String str52 = str22;
                    boolean z19 = i2;
                    final int i8 = i3;
                    final String str53 = str23;
                    final String str54 = str24;
                    final String str55 = str25;
                    final int i9 = i4;
                    final int i10 = i5;
                    final int i11 = i6;
                    final boolean z20 = z4;
                    final String str56 = str28;
                    final boolean z21 = z10;
                    final boolean z22 = z11;
                    final String str57 = str29;
                    final boolean z23 = z12;
                    final int i12 = z19 ? 1 : 0;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            String str58 = LaunchActivity.C1;
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            int i13 = i7;
                            String str59 = str31;
                            String str60 = str32;
                            String str61 = str33;
                            String str62 = str34;
                            String str63 = str35;
                            String str64 = str36;
                            String str65 = str37;
                            String str66 = str38;
                            String str67 = str39;
                            String str68 = str40;
                            String str69 = str41;
                            String str70 = str42;
                            boolean z24 = z17;
                            Integer num5 = num3;
                            Long l5 = l3;
                            Long l6 = l4;
                            Integer num6 = num4;
                            String str71 = str43;
                            HashMap hashMap3 = hashMap2;
                            String str72 = str44;
                            String str73 = str45;
                            String str74 = str46;
                            String str75 = str47;
                            TLRPC.TL_wallPaper tL_wallPaper3 = tL_wallPaper2;
                            String str76 = str48;
                            String str77 = str49;
                            String str78 = str50;
                            String str79 = str51;
                            boolean z25 = z18;
                            String str80 = str52;
                            boolean z26 = i12;
                            launchActivity2.B0(i13, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, z24, num5, l5, l6, num6, str71, hashMap3, str72, str73, str74, str75, tL_wallPaper3, str76, str77, str78, str79, z25, str80, z26 ? 1 : 0, i8, str53, str54, str55, null, null, l01Var2, z13, i9, false, i10, i11, null, null, z20, str56, z14, z15, z16, z21, z22, str57, null, z23, null);
                        }
                    });
                    return;
                }
                final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                final tg5 tg5Var2 = tg5Var;
                final TLRPC.User user2 = user;
                final String str58 = str27;
                final boolean z24 = z6;
                final boolean z25 = z5;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        e eVar;
                        String str59 = LaunchActivity.C1;
                        tg5Var2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.e0;
                        ea5 ea5Var = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            eVar = (e) c00.g(1, arrayList);
                        } else {
                            eVar = null;
                        }
                        int i13 = i7;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str60 = str58;
                        boolean z26 = z14;
                        boolean z27 = z15;
                        boolean z28 = z16;
                        boolean z29 = z13;
                        w06 w06Var = new w06(launchActivity2, eVar, i13, user3, tL_messages_botApp2, atomicBoolean, str60, z26, z27, z28, z29);
                        if (z24) {
                            w06Var.run();
                        } else if (tL_messages_botApp2.inactive && z25) {
                            zj3 zj3Var = new zj3(w06Var, (byte) 20);
                            l01 l01Var3 = l01Var2;
                            if (l01Var3 != null) {
                                ea5Var = new ea5(l01Var3, (byte) 22);
                            }
                            exc.a(launchActivity2, zj3Var, ea5Var);
                        } else if (!tL_messages_botApp2.request_write_access && !z29) {
                            w06Var.run();
                        } else {
                            jj.m(eVar, atomicBoolean, user3, w06Var);
                        }
                    }
                });
            }
        });
    }

    public final void y0(boolean z) {
        ActionBarLayout actionBarLayout = this.q0;
        if (actionBarLayout != null) {
            actionBarLayout.W(z, z);
        } else {
            this.p0.W(z, z);
        }
    }

    public final void z(int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.z1 = null;
        }
        if (i3 >= 26) {
            i2 = getWindow().getNavigationBarColor();
        } else {
            i2 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i2, i);
        this.z1 = ofArgb;
        ofArgb.addUpdateListener(new h16(this, (byte) 1));
        this.z1.addListener(new dn(this, i, (byte) 6));
        this.z1.setInterpolator(k43.h);
        this.z1.setDuration(320L);
        this.z1.start();
    }

    public final int z0(final int i, final tg5 tg5Var, final Integer num, final Integer num2, final Long l, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i2, final int i3) {
        int longValue;
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = uc7.l1(chat);
        if (num2 != null) {
            longValue = num.intValue();
        } else {
            longValue = (int) l.longValue();
        }
        tL_messages_getDiscussionMessage.msg_id = longValue;
        return ConnectionsManager.getInstance(i).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.C1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i4 = i;
                final TLRPC.Chat chat2 = chat;
                final Long l2 = l;
                final Integer num4 = num2;
                final Integer num5 = num;
                final Runnable runnable2 = runnable;
                final String str3 = str;
                final Integer num6 = num3;
                final byte[] bArr2 = bArr;
                final int i5 = i2;
                final int i6 = i3;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final tg5 tg5Var2 = tg5Var;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.k06.run():void");
                    }
                });
            }
        });
    }

    @Override
    public final void e(int[] iArr) {
    }
}
