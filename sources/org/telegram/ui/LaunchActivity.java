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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public class LaunchActivity extends th0 implements pk5, jm7, hk3 {
    public static final String C1 = UUID.randomUUID().toString();
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static LaunchActivity H1;
    public static Pattern I1;
    public static ut J1;
    public static LaunchActivity K1;
    public qdb A1;
    public tib B0;
    public int B1;
    public rl0 C0;
    public he E0;
    public View F0;
    public he G0;
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
    public bmb S0;
    public String T;
    public TLRPC.TL_theme T0;
    public CharSequence U;
    public boolean U0;
    public ArrayList V;
    public he V0;
    public ArrayList W;
    public ArrayList X;
    public boolean X0;
    public Uri Y;
    public a3a Y0;
    public String Z;
    public o04 Z0;
    public ArrayList a0;
    public ArrayList b0;
    public Uri c0;
    public int d0;
    public s34 e1;
    public zk f1;
    public uyc g1;
    public c45 h0;
    public boolean h1;
    public ArrayList i0;
    public jr4 i1;
    public ArrayList j0;
    public x16 j1;
    public String k0;
    public y16 k1;
    public ActionMode l0;
    public boolean l1;
    public boolean m0;
    public e7a m1;
    public vob n0;
    public e7a n1;
    public c51 o0;
    public ActionBarLayout p0;
    public b16 p1;
    public ActionBarLayout q0;
    public mf2 q1;
    public ActionBarLayout r0;
    public boolean r1;
    public z16 s0;
    public ViewGroup s1;
    public FrameLayout t0;
    public final bt7 t1;
    public w91 u0;
    public he u1;
    public yd v0;
    public he v1;
    public v16 w0;
    public boolean w1;
    public fz0 x0;
    public long x1;
    public wr3 y0;
    public int[] y1;
    public dy7 z0;
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
    public final t16 d1 = new Object();
    public boolean o1 = true;

    public LaunchActivity() {
        System.identityHashCode(this);
        this.t1 = new bt7(this);
        this.B1 = 0;
    }

    public static void C0(j5 j5Var, nk3 nk3Var, CharSequence charSequence, long j, k47 k47Var, long j2, boolean z, int i, int i2) {
        boolean z2;
        bda bdaVar;
        bda bdaVar2;
        int i3 = j5Var.a;
        if (nk3Var != null && (bdaVar2 = nk3Var.I2) != null && !bdaVar2.n) {
            z2 = false;
        } else {
            z2 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z2 && nk3Var != null && (bdaVar = nk3Var.I2) != null) {
            webPage = bdaVar.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z2) {
                a6a.Z(j5Var, charSequence, j, j2, z, i, i2);
                return;
            }
            CharSequence G = a6a.G(charSequence);
            if (G != null && G.length() != 0) {
                CharSequence[] charSequenceArr = {G};
                a6a.B(i3).q0(y5a.b(charSequenceArr[0].toString(), j, k47Var, k47Var, webPage2, z2, hs6.d0(i3).Y(charSequenceArr, true, true), null, null, z, i, i2, null, false));
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
        String D12;
        org.telegram.ui.ActionBar.d Q = Q();
        if (Q != null) {
            long j = tL_attachMenuBot.bot_id;
            rwc b = rwc.b(i, j, j, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.O() != null && launchActivity.O().l(b) != null) {
                return;
            }
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(tL_attachMenuBot.bot_id));
            if (W1 == null) {
                D12 = null;
            } else {
                D12 = oc7.r1(i).D1(W1.restriction_reason);
            }
            if (!TextUtils.isEmpty(D12)) {
                oc7.r1(i);
                oc7.Z4(D12, Q);
                return;
            }
            wx0 wx0Var = new wx0(launchActivity, Q.getResourceProvider());
            wx0Var.C0 = false;
            wx0Var.B(z);
            wx0Var.m0 = launchActivity;
            wx0Var.x(Q, b);
            wx0Var.show();
        }
    }

    public static void K() {
        i34 i34Var;
        ArrayList<ah0> arrayList;
        org.telegram.ui.ActionBar.d S = S();
        if (S != null) {
            if (S.getParentLayout() instanceof ActionBarLayout) {
                i34Var = ((ActionBarLayout) S.getParentLayout()).v();
            } else {
                i34Var = null;
            }
            if (i34Var != null && (arrayList = i34Var.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i34Var.sheetsStack.get(size).a(true);
                }
            }
            ArrayList<ah0> arrayList2 = S.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    S.sheetsStack.get(size2).a(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = wx0.b1.iterator();
            while (it.hasNext()) {
                arrayList3.add((wx0) it.next());
            }
            int size3 = arrayList3.size();
            int i = 0;
            while (i < size3) {
                Object obj = arrayList3.get(i);
                i++;
                ((wx0) obj).m(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.d M() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.r();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ActionBarLayout) ((tk5) b10.f(1, H1.Q))).r();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.N() != null) {
            return ((ActionBarLayout) H1.N()).r();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.d Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((tk5) b10.f(1, H1.Q)).getLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 != null && launchActivity2.N() != null) {
            return H1.N().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.d S() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((tk5) b10.f(1, H1.Q)).getSafeLastFragment();
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
            return jb6.M0(i, str);
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
                        fc4.g(e, true);
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
        qdb qdbVar;
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((qdbVar = launchActivity.A1) == null || ((View) qdbVar.a) != decorView)) {
                launchActivity.A1 = new qdb(decorView);
            }
            qdb qdbVar2 = launchActivity.A1;
            if (qdbVar2 != null) {
                View view = (View) qdbVar2.a;
                ArrayList arrayList = qdbVar2.b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(oqe.a(0.0f, 0.0f, f, f2), oqe.a(view.getWidth(), 0.0f, f, f2)), Math.max(oqe.a(0.0f, view.getHeight(), f, f2), oqe.a(view.getWidth(), view.getHeight(), f, f2))) * 2.0f) / (gm.p * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    pdb pdbVar = new pdb(f, f2, f3);
                    ofFloat.addUpdateListener(new pl(qdbVar2, pdbVar, (byte) 28));
                    ofFloat.addListener(new ic8(qdbVar2, pdbVar, (byte) 19));
                    ofFloat.setInterpolator(d53.g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(pdbVar);
                    qdbVar2.i();
                    ofFloat.start();
                }
            }
        }
    }

    public static a26 c0() {
        LaunchActivity launchActivity = H1;
        if (launchActivity != null) {
            return new a26(launchActivity, true);
        }
        return null;
    }

    public final void A(boolean z) {
        li0 li0Var;
        int i;
        org.telegram.messenger.a.t();
        org.telegram.messenger.a.m();
        if (!z) {
            boolean z2 = e21.a;
        }
        org.telegram.messenger.a.a.getClass();
        ((ApplicationLoaderImpl) org.telegram.messenger.a.a).getClass();
        oi0 e = oi0.e();
        String str = e.a;
        if (str != null && (i = e.b) != 0) {
            li0Var = new li0(str, i, e.c);
        } else {
            li0Var = null;
        }
        boolean z3 = this.o1;
        this.o1 = false;
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        np6 np6Var = new np6(this, z3, li0Var, (byte) 29);
        ((ApplicationLoaderImpl) aVar).getClass();
        oi0.e().a(np6Var, z);
    }

    public final void A0(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.A0(android.net.Uri):void");
    }

    public final void B() {
        if (this.P == z8c.t0 && this.m1 != null) {
            return;
        }
        e7a e7aVar = this.m1;
        if (e7aVar != null) {
            e7aVar.a();
            this.m1 = null;
        }
        int i = z8c.t0;
        this.P = i;
        e7a e7aVar2 = new e7a(nm7.f(i), this);
        e7aVar2.b(nm7.p3);
        e7aVar2.b(nm7.I2);
        e7aVar2.b(nm7.j0);
        e7aVar2.b(nm7.a5);
        e7aVar2.b(nm7.T1);
        e7aVar2.b(nm7.M0);
        e7aVar2.b(nm7.R0);
        e7aVar2.b(nm7.c1);
        e7aVar2.b(nm7.P);
        e7aVar2.b(nm7.N0);
        e7aVar2.b(nm7.Y1);
        e7aVar2.b(nm7.Z1);
        e7aVar2.b(nm7.v1);
        e7aVar2.b(nm7.w2);
        e7aVar2.b(nm7.x1);
        e7aVar2.b(nm7.m5);
        e7aVar2.b(nm7.j5);
        e7aVar2.b(nm7.v5);
        e7aVar2.b(nm7.U5);
        this.m1 = e7aVar2;
    }

    public final void B0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final defpackage.k11 r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.B0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, k11, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void C() {
        if (Build.VERSION.SDK_INT >= 24) {
            jr4 jr4Var = this.i1;
            if (jr4Var == null && gda.o) {
                jr4Var = jr4.a(this, this.v0);
                this.i1 = jr4Var;
            }
            if (jr4Var != null && !gda.o) {
                jr4Var.b();
                this.i1 = null;
            }
        }
    }

    public final void D(int i) {
        K1 = this;
        Set set = s70.a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - gda.G) >= 86400) {
            gda.G = currentTimeMillis;
            Utilities.f.c(new eh(currentTimeMillis, bc4.j(4), (byte) 5));
        }
        if (e21.a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - gda.H) >= 3600) {
                gda.H = currentTimeMillis2;
                Utilities.f.c(new fx0(currentTimeMillis2, (byte) 11));
            }
        }
        if ((Build.VERSION.SDK_INT >= 26 && i == 0) || this.w1) {
            return;
        }
        Utilities.e.d(new ex1(this, i, (byte) 2), 2000L);
    }

    public final void D0(int i) {
        this.y0.setInternalNavigationBarColor(i);
        xy0 O = O();
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
        wr3 wr3Var = this.y0;
        if (indexOfChild != -1) {
            view = this.s0;
        } else {
            view = this.p0.getView();
        }
        int indexOfChild2 = wr3Var.indexOfChild(view);
        if (indexOfChild2 != -1) {
            this.y0.removeViewAt(indexOfChild2);
        }
        if (gm.O1()) {
            getWindow().setSoftInputMode(16);
            z16 z16Var = new z16(this, this);
            this.s0 = z16Var;
            wr3 wr3Var2 = this.y0;
            if (indexOfChild2 != -1) {
                wr3Var2.addView(z16Var, indexOfChild2, qoe.c(-1.0f, -1));
            } else {
                wr3Var2.addView(z16Var, qoe.c(-1.0f, -1));
            }
            w91 w91Var = new w91(this, null);
            this.u0 = w91Var;
            w91Var.setOccupyStatusBar(false);
            this.u0.U(cmb.r0());
            this.s0.addView(this.u0, qoe.w(-1, -1));
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
            this.t0.setOnTouchListener(new a7(this, (byte) 9));
            this.t0.setOnClickListener(new x10((byte) 9));
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
            wr3 wr3Var3 = this.y0;
            ActionBarLayout actionBarLayout3 = this.p0;
            if (indexOfChild2 != -1) {
                wr3Var3.addView(actionBarLayout3.getView(), indexOfChild2, new ViewGroup.LayoutParams(-1, -1));
            } else {
                wr3Var3.addView(actionBarLayout3.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        vie.a(this, gda.t1, false);
    }

    public final he F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            he o = alertDialog$Builder.o();
            o.setCanceledOnTouchOutside(true);
            o.setOnDismissListener(new dg(this, o, (byte) 10));
            this.D0.add(o);
            return o;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public final void G() {
        int i;
        boolean z;
        if (gm.O1() && this.r0 != null) {
            Boolean bool = gm.L;
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
            if (!gm.E && (!gm.N1() || getResources().getConfiguration().orientation == 2)) {
                this.N0 = false;
                List<org.telegram.ui.ActionBar.d> fragmentStack = this.p0.getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    while (1 < fragmentStack.size()) {
                        org.telegram.ui.ActionBar.d dVar = fragmentStack.get(1);
                        if (dVar instanceof yv1) {
                            yv1 yv1Var = (yv1) dVar;
                            yv1Var.m5 = true;
                            yv1Var.n5 = true;
                        }
                        dVar.onPause();
                        dVar.onFragmentDestroy();
                        dVar.setParentLayout(null);
                        fragmentStack.remove(dVar);
                        this.r0.b(-1, dVar);
                    }
                    dy7 dy7Var = this.z0;
                    if (dy7Var == null || dy7Var.b.getVisibility() != 0) {
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
                w91 w91Var = this.u0;
                if (!this.r0.getFragmentStack().isEmpty()) {
                    i2 = 8;
                }
                w91Var.setVisibility(i2);
                return;
            }
            this.N0 = true;
            List<org.telegram.ui.ActionBar.d> fragmentStack2 = this.r0.getFragmentStack();
            if (!fragmentStack2.isEmpty()) {
                while (fragmentStack2.size() > 0) {
                    org.telegram.ui.ActionBar.d dVar2 = fragmentStack2.get(0);
                    if (dVar2 instanceof yv1) {
                        yv1 yv1Var2 = (yv1) dVar2;
                        yv1Var2.m5 = true;
                        yv1Var2.n5 = true;
                    }
                    dVar2.onPause();
                    dVar2.onFragmentDestroy();
                    dVar2.setParentLayout(null);
                    fragmentStack2.remove(dVar2);
                    this.p0.b(-1, dVar2);
                }
                dy7 dy7Var2 = this.z0;
                if (dy7Var2 == null || dy7Var2.b.getVisibility() != 0) {
                    this.p0.W(true, true);
                }
            }
            this.r0.getView().setVisibility(8);
            w91 w91Var2 = this.u0;
            if (!this.p0.getFragmentStack().isEmpty()) {
                i2 = 8;
            }
            w91Var2.setVisibility(i2);
        }
    }

    public final void H(boolean z, boolean z2, boolean z3) {
        org.telegram.ui.ActionBar.d dVar;
        int w0;
        wv1 wv1Var;
        boolean z4;
        ArrayList arrayList = this.e0;
        boolean z5 = true;
        if (!arrayList.isEmpty()) {
            dVar = (org.telegram.ui.ActionBar.d) b10.f(1, arrayList);
        } else {
            dVar = null;
        }
        char c = 2;
        if (dVar != null && (dVar.isRemovingFromStack() || dVar.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                dVar = (org.telegram.ui.ActionBar.d) b10.f(2, arrayList);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            dVar.hasForceLightStatusBar();
        }
        if (z2) {
            if (dVar != null) {
                z4 = dVar.isLightStatusBar();
                if (dVar.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) dVar.getParentLayout();
                    if (actionBarLayout.v() != null && actionBarLayout.v().getLastSheet() != null) {
                        ah0 lastSheet = actionBarLayout.v().getLastSheet();
                        if (lastSheet.s()) {
                            z4 = lastSheet.f();
                        }
                    } else {
                        ArrayList<ah0> arrayList2 = dVar.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            ah0 ah0Var = (ah0) b10.f(1, dVar.sheetsStack);
                            if (ah0Var.s()) {
                                z4 = ah0Var.f();
                            }
                        }
                    }
                }
            } else {
                z4 = on2.h(cmb.w0(null, cmb.r8, true)) > 0.699999988079071d;
            }
            gm.k3(this, z4);
        }
        if (Build.VERSION.SDK_INT >= 26 && z3 && (!z || dVar == null || !dVar.isInPreviewMode())) {
            if (dVar != null && z) {
                w0 = dVar.getNavigationBarColor();
            } else {
                w0 = cmb.w0(null, cmb.Z6, true);
            }
            if (dVar instanceof yv1) {
                yv1 yv1Var = (yv1) dVar;
                if (!yv1Var.sc || (yv1Var.w.s != 1 && ((wv1Var = yv1Var.Ba) == null || !wv1Var.q))) {
                    c = 1;
                }
            } else {
                c = 0;
            }
            if (O() != null && O().I > 0) {
                c = 0;
            }
            if (this.p0.v() != null) {
                i34 v = this.p0.v();
                if (v.sheetsStack != null) {
                    for (int i = 0; i < v.sheetsStack.size(); i++) {
                        ah0 ah0Var2 = v.sheetsStack.get(i);
                        if (ah0Var2.y()) {
                            w0 = ah0Var2.e(w0);
                            c = 0;
                        }
                    }
                }
            }
            Iterator it = wx0.b1.iterator();
            while (it.hasNext()) {
                w0 = ((wx0) it.next()).e(w0);
                c = 0;
            }
            D0(w0);
            if ((c != 0 || gm.B(w0) < 0.721f) && c != 1) {
                z5 = false;
            }
            gm.h3(this, z5);
        }
        if (z2) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void H0(os4 os4Var) {
        org.telegram.ui.ActionBar.d dVar;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            dVar = (org.telegram.ui.ActionBar.d) b10.f(1, arrayList);
        } else {
            ArrayList arrayList2 = this.g0;
            if (!arrayList2.isEmpty()) {
                dVar = (org.telegram.ui.ActionBar.d) b10.f(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.e0;
                if (!arrayList3.isEmpty()) {
                    dVar = (org.telegram.ui.ActionBar.d) b10.f(1, arrayList3);
                } else {
                    dVar = null;
                }
            }
        }
        if (c41.a(dVar)) {
            os4Var.a(c41.b0(dVar)).j();
        }
    }

    public final void I(boolean z) {
        qd2 qd2Var;
        long j;
        boolean z2;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z3 = false;
        if (sharedInstance != null && (qd2Var = sharedInstance.groupCall) != null) {
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
                j = z8c.h(this.P).n;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(j);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && groupCallParticipant.raise_hand_rating != 0) {
                z3 = true;
            }
            this.m0 = z3;
            if (!z && z4 && !z3 && !z2 && g95.s5 == null) {
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
        hb6 hb6Var;
        if (z8c.h(this.P).o()) {
            try {
                if (!this.H0 && !org.telegram.messenger.a.x) {
                    String string = oc7.d1().getString("language_showed2", "");
                    final String str3 = oc7.r1(this.P).s3;
                    if (string.equals(str3)) {
                        if (e21.a) {
                            fc4.b("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final hb6[] hb6VarArr = new hb6[2];
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
                        if (i < jb6.D0().J.size()) {
                            hb6 hb6Var2 = (hb6) jb6.D0().J.get(i);
                            b = b2;
                            if (hb6Var2.c.equals("en")) {
                                hb6VarArr[b] = hb6Var2;
                            }
                            if (hb6Var2.c.replace("_", "-").equals(str3) || hb6Var2.c.equals(str) || hb6Var2.c.equals(str2)) {
                                hb6VarArr[1] = hb6Var2;
                            }
                            if (hb6VarArr[b] != null && hb6VarArr[1] != null) {
                                break;
                            }
                            i++;
                            b2 = b;
                        } else {
                            b = b2;
                            break;
                        }
                    }
                    hb6 hb6Var3 = hb6VarArr[b];
                    if (hb6Var3 != null && (hb6Var = hb6VarArr[1]) != null && hb6Var3 != hb6Var) {
                        if (e21.a) {
                            fc4.b("show lang alert for " + hb6VarArr[b].b() + " and " + hb6VarArr[1].b());
                        }
                        this.I0 = null;
                        this.J0 = null;
                        this.H0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = hb6VarArr[1].c();
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
                                        final hb6[] hb6VarArr2 = hb6VarArr;
                                        final String str5 = str3;
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b4 = r5;
                                                String str6 = str5;
                                                hb6[] hb6VarArr3 = hb6VarArr2;
                                                HashMap hashMap2 = hashMap;
                                                LaunchActivity launchActivity2 = launchActivity;
                                                switch (b4) {
                                                    case 0:
                                                        String str7 = LaunchActivity.C1;
                                                        launchActivity2.I0 = hashMap2;
                                                        if (launchActivity2.J0 != null) {
                                                            launchActivity2.J0(hb6VarArr3[1], hb6VarArr3[0], str6);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        String str8 = LaunchActivity.C1;
                                                        launchActivity2.J0 = hashMap2;
                                                        if (launchActivity2.I0 != null) {
                                                            launchActivity2.J0(hb6VarArr3[1], hb6VarArr3[0], str6);
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
                                        final hb6[] hb6VarArr3 = hb6VarArr;
                                        final String str7 = str3;
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b4 = r5;
                                                String str62 = str7;
                                                hb6[] hb6VarArr32 = hb6VarArr3;
                                                HashMap hashMap22 = hashMap2;
                                                LaunchActivity launchActivity22 = launchActivity2;
                                                switch (b4) {
                                                    case 0:
                                                        String str72 = LaunchActivity.C1;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null) {
                                                            launchActivity22.J0(hb6VarArr32[1], hb6VarArr32[0], str62);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        String str8 = LaunchActivity.C1;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.I0 != null) {
                                                            launchActivity22.J0(hb6VarArr32[1], hb6VarArr32[0], str62);
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
                        tL_langpack_getStrings2.lang_code = hb6VarArr[b3].c();
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
                                        final hb6[] hb6VarArr2 = hb6VarArr;
                                        final String str5 = str3;
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b4 = r5;
                                                String str62 = str5;
                                                hb6[] hb6VarArr32 = hb6VarArr2;
                                                HashMap hashMap22 = hashMap;
                                                LaunchActivity launchActivity22 = launchActivity;
                                                switch (b4) {
                                                    case 0:
                                                        String str72 = LaunchActivity.C1;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null) {
                                                            launchActivity22.J0(hb6VarArr32[1], hb6VarArr32[0], str62);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        String str8 = LaunchActivity.C1;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.I0 != null) {
                                                            launchActivity22.J0(hb6VarArr32[1], hb6VarArr32[0], str62);
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
                                        final hb6[] hb6VarArr3 = hb6VarArr;
                                        final String str7 = str3;
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b4 = r5;
                                                String str62 = str7;
                                                hb6[] hb6VarArr32 = hb6VarArr3;
                                                HashMap hashMap22 = hashMap2;
                                                LaunchActivity launchActivity22 = launchActivity2;
                                                switch (b4) {
                                                    case 0:
                                                        String str72 = LaunchActivity.C1;
                                                        launchActivity22.I0 = hashMap22;
                                                        if (launchActivity22.J0 != null) {
                                                            launchActivity22.J0(hb6VarArr32[1], hb6VarArr32[0], str62);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        String str8 = LaunchActivity.C1;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.I0 != null) {
                                                            launchActivity22.J0(hb6VarArr32[1], hb6VarArr32[0], str62);
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
                fc4.g(e, true);
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
            ((org.telegram.ui.ActionBar.d) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (gm.O1()) {
            ArrayList arrayList2 = this.f0;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ((org.telegram.ui.ActionBar.d) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.g0;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                ((org.telegram.ui.ActionBar.d) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void J0(defpackage.hb6 r18, defpackage.hb6 r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.J0(hb6, hb6, java.lang.String):void");
    }

    public final void K0(boolean z, boolean z2, int i, int i2, bi3 bi3Var) {
        if (this.y0 != null && !isFinishing()) {
            if (this.z0 == null) {
                this.z0 = new dy7(this);
            }
            gda.w = true;
            int i3 = 0;
            if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                SecretMediaViewer.d().c(false, false);
            } else if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
                PhotoViewer.r0().A(false, true);
            } else if (o.F() && o.u().W) {
                o.u().l(false, true);
            }
            v9b.v();
            k47 k47Var = MediaController.w().v0;
            if (k47Var != null && k47Var.g4()) {
                MediaController.w().l(true, true, false, false);
            }
            this.z0.show();
            cy7 cy7Var = this.z0.b;
            ArrayList arrayList = this.A0;
            arrayList.isEmpty();
            cy7Var.m(z2, i, i2, new fd5(this, bi3Var, (byte) 28));
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                by7 by7Var = (by7) arrayList.get(i4);
                if (z) {
                    arrayList.size();
                }
                by7Var.m(z2, i, i2, null);
            }
            gda.B = true;
            hf hfVar = new hf(this, (byte) 3);
            this.z0.b.setDelegate(hfVar);
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((by7) obj).setDelegate(hfVar);
            }
            try {
                lo7.n(z8c.t0).Y();
            } catch (Exception e) {
                fc4.g(e, true);
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
            anb.h(cmb.c6, null, frameLayout);
            int i2 = gm.m;
            if (i2 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i2));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(2131231649);
            linearLayout.addView(imageView, qoe.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i3 = cmb.F6;
            td4.x(textView, i3, null, 1, 17.0f);
            textView.setText(jb6.M0(2131746517, null));
            linearLayout.addView(textView, qoe.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.a = textView2;
            anb.X(textView2, i3, null);
            anb.G(textView2, cmb.I6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new cm((byte) 0));
            textView2.setGravity(51);
            textView2.setLineSpacing(gm.L(2.0f), 1.0f);
            linearLayout.addView(textView2, qoe.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f = 4.0f;
            scrollView.setPadding(gm.L(24.0f), i2, gm.L(24.0f), gm.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, qoe.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(jb6.M0(2131751541, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(gm.o());
            int i4 = cmb.x6;
            anb.X(textView3, i4, null);
            textView3.setTextSize(1, 14.0f);
            fg0 H0 = cmb.H0(gm.L(3.0f), cmb.w0(null, i4, false));
            wmb g = anb.g(i4, 25);
            textView3.setBackground(H0);
            anb.j(textView3, H0, null, g, null);
            textView3.setPadding(gm.L(20.0f), gm.L(10.0f), gm.L(20.0f), gm.L(10.0f));
            frameLayout.addView(textView3, qoe.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    tib tibVar = frameLayout;
                    switch (b) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = jb6.M0(2131743883, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            alertDialog$Builder.j(jb6.M0(2131751539, null), new rib(tibVar, (byte) 1));
                            alertDialog$Builder.g(jb6.M0(2131753721, null), null);
                            heVar.U = jb6.M0(2131743662, null);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (tibVar.c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = jb6.M0(2131743665, null);
                                he heVar2 = alertDialog$Builder2.a;
                                heVar2.S = M02;
                                alertDialog$Builder2.j(jb6.M0(2131754271, null), new rib(tibVar, (byte) 0));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                heVar2.U = jb6.a0("TosAgeText", null, 2131743666, jb6.G(tibVar.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            tibVar.a();
                            return;
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(jb6.M0(2131754716, null));
            textView4.setGravity(17);
            textView4.setTypeface(gm.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = gm.L(4.0f);
            textView4.setBackgroundDrawable(cmb.i0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
            frameLayout.addView(textView4, qoe.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    tib tibVar = frameLayout;
                    switch (b) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = jb6.M0(2131743883, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            alertDialog$Builder.j(jb6.M0(2131751539, null), new rib(tibVar, (byte) 1));
                            alertDialog$Builder.g(jb6.M0(2131753721, null), null);
                            heVar.U = jb6.M0(2131743662, null);
                            alertDialog$Builder.o();
                            return;
                        default:
                            if (tibVar.c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = jb6.M0(2131743665, null);
                                he heVar2 = alertDialog$Builder2.a;
                                heVar2.S = M02;
                                alertDialog$Builder2.j(jb6.M0(2131754271, null), new rib(tibVar, (byte) 0));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                heVar2.U = jb6.a0("TosAgeText", null, 2131743666, jb6.G(tibVar.c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.o();
                                return;
                            }
                            tibVar.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            anb.h(cmb.c7, null, view2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = gm.L(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.B0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.y0.addView(this.B0, qoe.c(-1.0f, -1));
            this.B0.setDelegate(new o16(this));
        } else {
            f = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = z8c.h(i).a0;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            z8c.h(i).a0 = tL_help_termsOfService;
            z8c.h(i).u(false);
        }
        tib tibVar = this.B0;
        if (tibVar.getVisibility() != 0) {
            tibVar.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        k47.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = gm.L(10.0f);
        int L3 = gm.L(f);
        int length = spannableStringBuilder.length() - 2;
        for (int i5 = 0; i5 < length; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == '-') {
                    int i7 = i5 + 2;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        g21 g21Var = new g21(L2, L3);
                        spannableStringBuilder.replace(i6, i5 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(g21Var, i6, i7, 33);
                    }
                }
            }
        }
        tibVar.a.setText(spannableStringBuilder);
        tibVar.c = tL_help_termsOfService;
        tibVar.d = i;
        this.B0.animate().alpha(1.0f).setDuration(150L).setInterpolator(gm.F).setListener(null).start();
    }

    public final void M0(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.e0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.d dVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
            if (dVar instanceof bj6) {
                dVar = ((bj6) dVar).b0();
            }
            UndoView undoView = null;
            if (dVar instanceof yv1) {
                yv1 yv1Var = (yv1) dVar;
                if (chat != null && yv1Var.a() == (-chat.id)) {
                    chat = null;
                }
                yv1Var.i6();
                undoView = yv1Var.N3;
            } else if (dVar instanceof nk3) {
                undoView = ((nk3) dVar).w3();
            } else if (dVar instanceof ProfileActivity) {
                undoView = ((ProfileActivity) dVar).M;
            }
            if (undoView != null) {
                undoView.m(chat, i, 0L);
            }
            if (i == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    public final tk5 N() {
        ActionBarLayout actionBarLayout = this.p0;
        ArrayList arrayList = this.Q;
        if (!arrayList.isEmpty()) {
            return (tk5) b10.f(1, arrayList);
        }
        return actionBarLayout;
    }

    public final void N0(int i) {
        O0(i, new zo4((byte) 28));
    }

    public final xy0 O() {
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

    public final void O0(int i, ku4 ku4Var) {
        if (i != z8c.t0 && z8c.q(i)) {
            this.l1 = true;
            ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
            z8c.t0 = i;
            z8c.h(0).u(false);
            B();
            nm7.e().k(nm7.g4, Integer.valueOf(i));
            if (gm.O1()) {
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
            this.p0.b(-3, (bj6) ku4Var.l(null));
            this.p0.W(true, true);
            if (gm.O1()) {
                this.q0.W(true, true);
                this.r0.W(true, true);
            }
            if (!org.telegram.messenger.a.x) {
                ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
            }
            if (z8c.h(i).a0 != null) {
                L0(i, z8c.h(i).a0);
            }
            P0();
            this.l1 = false;
        }
    }

    public final org.telegram.ui.ActionBar.d P() {
        if (mh6.x1(this.P, false).getInt("currentViewNum", 0) != 0) {
            return new mh6();
        }
        return new vr5();
    }

    public final void P0() {
        int i;
        String str;
        if (this.p0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.P).getConnectionState();
            this.d0 = connectionState;
            rz5 rz5Var = null;
            if (connectionState == 2) {
                str = "WaitingForNetwork";
                i = 2131742896;
            } else if (connectionState == 5) {
                str = "Updating";
                i = 2131743497;
            } else if (connectionState == 4) {
                str = "ConnectingToProxyWithDots";
                i = 2131751742;
            } else if (connectionState == 1) {
                str = "Connecting";
                i = 2131751746;
            } else {
                i = 0;
                str = null;
            }
            if (connectionState == 1 || connectionState == 4) {
                rz5Var = new rz5(this, (byte) 9);
            }
            ActionBarLayout actionBarLayout = this.p0;
            actionBarLayout.N0 = str;
            actionBarLayout.O0 = i;
            actionBarLayout.P0 = rz5Var;
            for (int i2 = 0; i2 < actionBarLayout.V0.size(); i2++) {
                ((org.telegram.ui.ActionBar.d) actionBarLayout.V0.get(i2)).setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, rz5Var);
            }
        }
    }

    public final int R() {
        return this.e0.size();
    }

    public final boolean V(android.content.Intent r129, boolean r130, boolean r131, boolean r132, defpackage.k11 r133, boolean r134, boolean r135) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.V(android.content.Intent, boolean, boolean, boolean, k11, boolean, boolean):boolean");
    }

    public final void W() {
        ActionMode actionMode = this.l0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void X(int i, TLRPC.User user, String str, k11 k11Var) {
        oc7 r1 = oc7.r1(i);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = r1.p1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new kc((byte) 0), new v35(this, k11Var, r1, i, user));
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
                u.v0[0].b.h1();
                u.v0[1].b.h1();
                u.g0.invalidate();
                u.r0.invalidate();
                if (f == 1.0f) {
                    u.v0[0].c.f();
                    u.v0[1].c.f();
                }
            }
        }
        if (PhotoViewer.C0()) {
            PhotoViewer.r0().G2();
        }
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
        if (gm.O1() && actionBarLayout == this.q0) {
            this.r0.W(z, z);
            this.p0.W(z, z);
        }
    }

    public final void b0() {
        tk5[] tk5VarArr = {this.p0, this.q0, this.r0};
        for (int i = 0; i < 3; i++) {
            tk5 tk5Var = tk5VarArr[i];
            if (tk5Var instanceof ActionBarLayout) {
                ((ActionBarLayout) tk5Var).D();
            }
        }
    }

    public final boolean d0(boolean z) {
        boolean z2;
        ll4 ll4Var = vie.a;
        if (ll4Var != null) {
            if (ll4Var.s) {
                if (z) {
                    ll4Var.c(false);
                }
            }
            return false;
        }
        dy7 dy7Var = this.z0;
        if (dy7Var != null && dy7Var.b.getVisibility() == 0) {
            if (z) {
                finish();
                return false;
            }
        } else {
            fz0 fz0Var = this.x0;
            if (fz0Var != null && (z2 = fz0Var.V)) {
                if (z && z2) {
                    fz0Var.a(false);
                    return false;
                }
            } else {
                he heVar = xu9.I;
                if (heVar != null) {
                    if (z) {
                        heVar.dismiss();
                        xu9.I = null;
                        return false;
                    }
                } else if (hx2.g0 != null && hx2.e().E) {
                    if (z) {
                        hx2.e().c();
                        return false;
                    }
                } else if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                    if (z) {
                        SecretMediaViewer.d().c(true, false);
                        return false;
                    }
                } else if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
                    if (z) {
                        PhotoViewer.r0().A(true, false);
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
        o04 o04Var = this.Z0;
        if (o04Var != null) {
            gm.r(o04Var);
            this.Z0 = null;
        }
        if (!this.R) {
            this.R = true;
            e7a e7aVar = this.m1;
            if (e7aVar != null) {
                e7aVar.a();
                this.m1 = null;
            }
            e7a e7aVar2 = this.n1;
            if (e7aVar2 != null) {
                e7aVar2.a();
                this.n1 = null;
            }
            b16 b16Var = this.p1;
            if (b16Var != null && (hashSet = e86.n) != null) {
                hashSet.remove(b16Var);
            }
        }
    }

    public final void f0(Intent intent, k11 k11Var) {
        super.onNewIntent(intent);
        Z();
        G();
        V(intent, true, false, false, k11Var, true, false);
    }

    public final void g0() {
        if (this.Z0 != null) {
            if (e21.a) {
                fc4.b("cancel lockRunnable onPasscodePause");
            }
            gm.r(this.Z0);
            this.Z0 = null;
        }
        if (gda.r.length() != 0) {
            gda.A = (int) (SystemClock.elapsedRealtime() / 1000);
            o04 o04Var = new o04(this, (byte) 19);
            this.Z0 = o04Var;
            if (gda.w) {
                gm.d3(o04Var, 1000L);
                if (e21.a) {
                    fc4.b("schedule app lock in 1000");
                }
            } else if (gda.x != 0) {
                if (e21.a) {
                    fc4.b("schedule app lock in " + ((gda.x * 1000) + 1000));
                }
                gm.d3(this.Z0, (gda.x * 1000) + 1000);
            }
        } else {
            gda.A = 0;
        }
        gda.x();
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.d dVar, ActionBarLayout actionBarLayout) {
        boolean z;
        if (gm.O1()) {
            boolean z2 = dVar instanceof nk3;
            if (!z2 && !(dVar instanceof bj6)) {
                if ((dVar instanceof yv1) && !((yv1) dVar).X7()) {
                    if (!this.N0) {
                        ActionBarLayout actionBarLayout2 = this.r0;
                        if (actionBarLayout != actionBarLayout2) {
                            actionBarLayout2.getView().setVisibility(0);
                            this.u0.setVisibility(8);
                            this.r0.Z();
                            this.r0.b(-1, dVar);
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
                            actionBarLayout4.b(-1, dVar);
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
                                if (z8c.h(i).o()) {
                                    break;
                                }
                                i++;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        if ((dVar instanceof mh6) && i == -1) {
                            this.u0.setVisibility(0);
                            this.t0.setBackgroundColor(0);
                        } else {
                            this.t0.setBackgroundColor(2130706432);
                        }
                        this.q0.b(-1, dVar);
                        return false;
                    }
                }
            } else {
                if (actionBarLayout != this.p0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && z2 && !((nk3) dVar).J3()) {
                    z = false;
                }
                if (z) {
                    this.p0.Z();
                    this.p0.b(-1, dVar);
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
            if (e21.a) {
                fc4.b("cancel lockRunnable onPasscodeResume");
            }
            gm.r(this.Z0);
            this.Z0 = null;
        }
        if (gm.n2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (gda.A != 0) {
            gda.A = 0;
            gda.x();
            if (e21.a) {
                fc4.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        he heVar = this.V0;
        if (heVar != null) {
            try {
                heVar.dismiss();
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
        } else if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
            PhotoViewer.r0().A(true, false);
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
        if (gm.O1()) {
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
        mh6 mh6Var = new mh6();
        rz5 rz5Var = new rz5(this, (byte) 0);
        mh6Var.G = (byte) 3;
        mh6Var.a = 12;
        mh6Var.e0 = rz5Var;
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
                valueOf.setSpan(new xkb(obj, 0), indexOf, i, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            he heVar = alertDialog$Builder.a;
            heVar.S = valueOf;
            heVar.U = jb6.M0(2131751138, null);
            alertDialog$Builder.j(jb6.M0(2131752501, null), new nv4(this, mh6Var, (byte) 7));
            wi8.y(null, 2131752542, alertDialog$Builder, null);
            return;
        }
        t0(mh6Var);
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, defpackage.qk5 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, qk5):boolean");
    }

    public final void l0(final long j, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i, final int i2) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            t0(sxb.G0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = oc7.r1(this.P).g1(-j);
        tL_channels_getMessages.id.add(num);
        ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.C1;
                gm.c3(new b06(LaunchActivity.this, tLObject, num, num2, bArr, j, runnable, str, i, i2));
            }
        });
    }

    public final void m0(int i, long j, TLRPC.TL_error tL_error) {
        yv1 yv1Var = new yv1(kt6.k(j, "user_id"));
        t0(yv1Var);
        gm.d3(new dt5(tL_error, yv1Var, oc7.r1(i).W1(Long.valueOf(j)), (byte) 1), 300L);
    }

    public final void n0(int i, String str, String str2, k11 k11Var) {
        if (k11Var != null) {
            k11Var.d();
        }
        oc7 r1 = oc7.r1(i);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_contacts_importContactToken, new ev0(this, k11Var, r1, i, str2, (byte) 5));
    }

    public final void o0(int i, String str, String str2, k11 k11Var) {
        if (k11Var != null) {
            k11Var.d();
        }
        oc7 r1 = oc7.r1(i);
        r1.Z1().a(str, null, new h16(this, r1, k11Var, i, str2, (byte) 0));
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
            if (gm.O1()) {
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
            if (menu != null && !this.p0.q(menu) && gm.O1() && !this.r0.q(menu)) {
                this.q0.q(menu);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.p0;
            org.telegram.ui.ActionBar.a aVar = actionBarLayout.E;
            if (aVar != null) {
                aVar.setVisibility(8);
            }
            actionBarLayout.D0 = true;
            if (gm.O1()) {
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
        a58 currentPeerView;
        sm2 sm2Var;
        VoIPService sharedInstance;
        boolean z = false;
        if (gda.r.length() != 0 && gda.A != 0) {
            gda.A = 0;
            if (e21.a) {
                fc4.b("reset lastPauseTime onActivityResult");
            }
            z8c.h(this.P).u(false);
        }
        if (i == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.a.G = canDrawOverlays;
            if (canDrawOverlays) {
                g95 g95Var = g95.s5;
                if (g95Var != null) {
                    g95Var.H();
                }
                pp9 pp9Var = pp9.Q0;
                if (pp9Var != null) {
                    pp9Var.e();
                }
                gm.d3(new rz5(this, (byte) 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
        String str = null;
        if (i >= 22336 && i <= 22399) {
            l35 l35Var = cle.b;
            if (l35Var != null && l35Var.e == this && l35Var.f && l35Var.g == i) {
                if (i2 != -1) {
                    str = "AUTH_CANCELED";
                }
                l35Var.c(str);
            }
        } else if (i == 520) {
            if (i2 == -1 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
                sharedInstance.createCaptureDevice(true);
            }
        } else if (i == 140) {
            dd6 f = dd6.f(this.P);
            if (i2 == -1) {
                z = true;
            }
            Utilities.d.c(new y8c((byte) 25, f, z));
        } else if (i == 521) {
            mf2 mf2Var = this.q1;
            if (mf2Var != null) {
                if (i2 == -1) {
                    z = true;
                }
                mf2Var.a(Boolean.valueOf(z));
                this.q1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null && (sm2Var = themeEditorView.m) != null) {
                sm2Var.E(i, i2, intent);
            }
            ActionBarLayout actionBarLayout = this.p0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.d dVar = this.p0.getFragmentStack().get(this.p0.getFragmentStack().size() - 1);
                dVar.onActivityResultFragment(i, i2, intent);
                if (dVar.getLastStoryViewer() != null && (currentPeerView = dVar.getLastStoryViewer().o0.getCurrentPeerView()) != null && i2 == -1) {
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
                                e51 e51Var = currentPeerView.y2;
                                if (e51Var != null) {
                                    e51Var.dismiss();
                                }
                                currentPeerView.a0(true);
                            }
                        }
                    } else {
                        currentPeerView.j0();
                        e51 e51Var2 = currentPeerView.y2;
                        if (e51Var2 != null) {
                            e51Var2.d2.j0(i, intent, null);
                        }
                    }
                }
            }
            if (gm.O1()) {
                ActionBarLayout actionBarLayout2 = this.r0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
                }
                ActionBarLayout actionBarLayout3 = this.q0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
                }
            }
            nm7.e().k(nm7.g5, Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (d0(true)) {
            if (gm.O1()) {
                ActionBarLayout actionBarLayout = this.q0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.q0.G();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.r0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.r0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.d dVar = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
                    if (dVar.onBackPressed(true)) {
                        dVar.finishFragment();
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
        float f;
        float f2;
        float f3;
        gm.v(this, configuration);
        this.t1.a();
        gm.r3(getWindow());
        super.onConfigurationChanged(configuration);
        yc3 c = yc3.c();
        ArrayList arrayList = (ArrayList) c.c;
        LaunchActivity launchActivity = (LaunchActivity) c.f;
        if (launchActivity == null || !gm.F1(launchActivity)) {
            for (int i = 0; i < arrayList.size(); i++) {
                tl4 tl4Var = ((ad8) arrayList.get(i)).e;
                if (tl4Var != null && tl4Var.h != null && !tl4Var.K) {
                    Activity activity = tl4Var.c;
                    gm.v(activity, activity.getResources().getConfiguration());
                    lj4.b = null;
                    Point point = gm.q;
                    tl4Var.A = (Math.min(point.x, point.y) - (tl4.m() * 2.0f)) / tl4Var.h();
                    int h = (int) (tl4Var.h() * tl4Var.z);
                    vc8 vc8Var = tl4Var.b;
                    int S = vc8Var.S();
                    int o0 = vc8Var.o0();
                    if (S > 0 && o0 > 0) {
                        f = o0 / S;
                    } else {
                        f = 0.5625f;
                    }
                    int i2 = (int) (((int) (tl4.i(f) * f)) * tl4Var.z);
                    if (tl4Var.x != h || tl4Var.y != i2) {
                        WindowManager.LayoutParams layoutParams = tl4Var.e;
                        tl4Var.x = h;
                        layoutParams.width = h;
                        tl4Var.y = i2;
                        layoutParams.height = i2;
                        tl4Var.r();
                    }
                    zna znaVar = tl4Var.D;
                    znaVar.b = tl4Var.B;
                    znaVar.c = true;
                    znaVar.m.i = tl4.n(f2, tl4Var.x);
                    tl4Var.D.h();
                    zna znaVar2 = tl4Var.E;
                    znaVar2.b = tl4Var.C;
                    znaVar2.c = true;
                    znaVar2.m.i = tl4.e(f3, tl4Var.y);
                    tl4Var.E.h();
                }
            }
        }
        gm.Y2();
        Z();
        G();
        gm.c3(new rz5(this, (byte) 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            int i3 = pipRoundVideoView.y.getInt("sidex", 1);
            int i4 = pipRoundVideoView.y.getInt("sidey", 0);
            float f4 = pipRoundVideoView.y.getFloat("px", 0.0f);
            float f5 = pipRoundVideoView.y.getFloat("py", 0.0f);
            pipRoundVideoView.w.x = PipRoundVideoView.b(f4, i3, pipRoundVideoView.h, true);
            pipRoundVideoView.w.y = PipRoundVideoView.b(f5, i4, pipRoundVideoView.n, false);
            pipRoundVideoView.x.updateViewLayout(pipRoundVideoView.a, pipRoundVideoView.w);
        }
        zv3 zv3Var = zv3.R1;
        if (zv3Var != null) {
            zv3Var.Z(configuration);
        }
        do0 do0Var = do0.o1;
        if (do0Var != null) {
            do0Var.Z(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null) {
            int i5 = themeEditorView.l.getInt("sidex", 1);
            int i6 = themeEditorView.l.getInt("sidey", 0);
            float f6 = themeEditorView.l.getFloat("px", 0.0f);
            float f7 = themeEditorView.l.getFloat("py", 0.0f);
            themeEditorView.i.x = ThemeEditorView.b(f6, i5, themeEditorView.g, true);
            themeEditorView.i.y = ThemeEditorView.b(f7, i6, themeEditorView.h, false);
            try {
                if (themeEditorView.c.getParent() != null) {
                    themeEditorView.j.updateViewLayout(themeEditorView.c, themeEditorView.i);
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        if (cmb.o == 3) {
            cmb.E(false);
        }
    }

    @Override
    public final void onCreate(android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public final void onDestroy() {
        jr4 jr4Var;
        ArrayList arrayList;
        ne6 ne6Var;
        l35 l35Var = cle.b;
        if (l35Var != null && l35Var.e == this) {
            l35Var.c("AUTH_CANCELED");
            cle.b.e();
        }
        yc3 c = yc3.c();
        ArrayList arrayList2 = (ArrayList) c.c;
        if (((LaunchActivity) c.f) == this) {
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((ad8) arrayList2.get(size)).b();
            }
            ((efb) c.e).c();
            c.f = null;
            ((ArrayList) c.d).clear();
        }
        int i = 0;
        E1 = false;
        F1--;
        zk zkVar = this.f1;
        if (zkVar != null) {
            unregisterReceiver(zkVar);
            this.f1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.k9 != null) {
                PhotoViewer.k9.L();
            }
            if (PhotoViewer.C0()) {
                PhotoViewer.r0().L();
            }
            if (SecretMediaViewer.e()) {
                SecretMediaViewer d = SecretMediaViewer.d();
                Runnable runnable = d.o1;
                if (runnable != null) {
                    runnable.run();
                    d.o1 = null;
                }
                a26 a26Var = d.k1;
                if (a26Var != null) {
                    a26Var.a();
                    d.k1 = null;
                }
                nm7.f(d.a).n(d, nm7.v);
                nm7.f(d.a).n(d, nm7.l0);
                nm7.f(d.a).n(d, nm7.i0);
                d.s = false;
                d.M = null;
                jn5 jn5Var = d.h0;
                if (jn5Var != null) {
                    jn5Var.a();
                    d.h0 = null;
                }
                d.j();
                if (d.b != null && (ne6Var = d.d) != null) {
                    try {
                        if (ne6Var.getParent() != null) {
                            ((WindowManager) d.b.getSystemService("window")).removeViewImmediate(d.d);
                        }
                        d.d = null;
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                SecretMediaViewer.w1 = null;
            }
            if (o.F()) {
                o.u().q();
            }
            if (hx2.g0 != null) {
                hx2 e2 = hx2.e();
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
                        fc4.g(e3, true);
                    }
                    hx2.g0 = null;
                    nm7.e().k(nm7.k1, 8);
                }
            }
            g95 g95Var = g95.s5;
            if (g95Var != null) {
                g95Var.H();
            }
            pp9 pp9Var = pp9.Q0;
            if (pp9Var != null) {
                pp9Var.e();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i2 = cmb.a;
            zv3 zv3Var = zv3.R1;
            if (zv3Var != null) {
                zv3Var.E0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.p;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            ll4 ll4Var = vie.a;
            if (ll4Var != null) {
                ll4Var.e.edit().putFloat("x", (float) ll4Var.c.m.i).putFloat("y", (float) ll4Var.d.m.i).commit();
            }
            vie.a = null;
            SparseArray sparseArray = vm.r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController w = MediaController.w();
        if (w.K0 == this) {
            w.K0 = null;
        }
        MediaController w2 = MediaController.w();
        if (w2.L0 == this.s1) {
            w2.L0 = null;
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
                fc4.g(e4, true);
            }
        }
        arrayList.clear();
        try {
            if (this.h0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.h0);
            }
        } catch (Exception e5) {
            fc4.g(e5, true);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            if (this.j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.j1);
            }
        } else if (i3 >= 33 && this.j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.k1);
        }
        u31.h(this.v0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        e0();
        s34 s34Var = this.e1;
        if (s34Var != null) {
            s34Var.g();
        }
        if (i3 >= 24 && (jr4Var = this.i1) != null) {
            jr4Var.b();
        }
    }

    @Override
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82 && !gda.B) {
            if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
                return super.onKeyUp(i, keyEvent);
            }
            if (o.F() && o.u().W) {
                return super.onKeyUp(i, keyEvent);
            }
            if (gm.O1()) {
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
            if (gm.O1()) {
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
        gm.E = z;
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
        tl4 tl4Var;
        bd8 bd8Var;
        super.onPause();
        G1 = false;
        wxc.q(true);
        yc3 c = yc3.c();
        ArrayList arrayList = (ArrayList) c.c;
        if (this == ((LaunchActivity) c.f)) {
            c.b = false;
            efb efbVar = (efb) c.e;
            LaunchActivity launchActivity = efbVar.b;
            if (launchActivity != null && Build.VERSION.SDK_INT >= 31 && efbVar.f == null && efbVar.e != null && gm.F1(launchActivity)) {
                efbVar.i(efbVar.e);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ad8 ad8Var = (ad8) arrayList.get(i);
                if (ad8Var.c == 1 && (tl4Var = ad8Var.e) != null && !tl4Var.f && (bd8Var = tl4Var.j) != null && tl4Var.l != null && bd8Var.isAvailable()) {
                    try {
                        Bitmap bitmap = tl4Var.j.getBitmap();
                        if (bitmap != null) {
                            tl4Var.l.setImageBitmap(bitmap);
                            tl4Var.l.setVisibility(0);
                            tl4Var.j.setFirstFrameCallback(null);
                        }
                    } catch (Throwable th) {
                        fc4.g(th, true);
                    }
                }
            }
        }
        nm7.e().k(nm7.j1, 4096);
        org.telegram.messenger.a.x = true;
        Utilities.d.c(new fx0(this.P, (byte) 5));
        g0();
        this.p0.M();
        if (gm.O1()) {
            ActionBarLayout actionBarLayout = this.r0;
            if (actionBarLayout != null) {
                actionBarLayout.M();
            }
            ActionBarLayout actionBarLayout2 = this.q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.M();
            }
        }
        dy7 dy7Var = this.z0;
        if (dy7Var != null) {
            dy7Var.b.k();
        }
        ArrayList arrayList2 = this.A0;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((by7) obj).k();
        }
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
            PhotoViewer r0 = PhotoViewer.r0();
            if (r0.k2 != null) {
                r0.A(false, false);
            } else {
                ndc ndcVar = r0.G2;
                if (ndcVar != null && r0.Z2) {
                    ndcVar.r0(gm.F1(r0.E));
                }
            }
        }
        v9b v9bVar = v9b.G2;
        if (v9bVar != null) {
            v9bVar.t(false);
            l9b l9bVar = v9bVar.d1;
            if (l9bVar != null) {
                l9bVar.f.r();
            }
            k9b k9bVar = v9bVar.Y0;
            if (k9bVar != null) {
                k9bVar.x(0, true);
            }
        }
        yic.a(this);
        iic iicVar = iic.m1;
        if (iicVar != null) {
            boolean isInteractive = ((PowerManager) iicVar.b.getSystemService("power")).isInteractive();
            boolean canDrawOverlays = Settings.canDrawOverlays(iicVar.b);
            if (!canDrawOverlays && !zse.a(iicVar.b)) {
                z = false;
            } else {
                z = true;
            }
            if (iicVar.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && canDrawOverlays) {
                int measuredHeight = iic.m1.u0.getMeasuredHeight();
                iic iicVar2 = iic.m1;
                yic.f(iicVar2.b, iicVar2.a, iicVar2.u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = iic.m1.r0;
                if (windowInsets != null) {
                    yic.W = windowInsets.getSystemWindowInsetTop();
                    iic.m1.r0.getSystemWindowInsetBottom();
                }
            }
            if (iicVar.n0 && ((!z || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (yic.d() != null) {
                yic.d().e();
            }
        } else if (yic.d() != null) {
            yic.d().e();
        }
        HashMap hashMap = qna.n;
        if (hashMap != null) {
            for (qna qnaVar : hashMap.values()) {
                pna pnaVar = qnaVar.f;
                if (pnaVar != null) {
                    pnaVar.b = true;
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
        ((efb) yc3.c().e).g();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        ((efb) yc3.c().e).f(pictureInPictureUiState);
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
        if (gm.O1()) {
            if (this.r0.getFragmentStack().size() != 0) {
                this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
            if (this.q0.getFragmentStack().size() != 0) {
                this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
        }
        iic.h(iArr, i);
        v9b v9bVar = v9b.G2;
        if (v9bVar != null) {
            r63 r63Var = v9bVar.a;
            Activity activity = v9bVar.b;
            if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i == 111) {
                v9bVar.t2 = !z;
                if (z && v9bVar.g0 == 0) {
                    v9bVar.B0.setCameraThumb(null);
                    if (CameraController.getInstance().isCameraInitied()) {
                        v9bVar.p();
                    } else {
                        CameraController.getInstance().initCamera(new f8b(v9bVar, (byte) 0));
                    }
                }
            } else if (i == 114) {
                if (z) {
                    MediaController.N(0);
                    v9bVar.c(true);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r63Var, activity);
                    int i2 = cmb.K5;
                    alertDialog$Builder.l(2131624119, 72, cmb.w0(null, i2, false), null);
                    alertDialog$Builder.m(i2, null);
                    SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747032, null));
                    he heVar = alertDialog$Builder.a;
                    heVar.U = S2;
                    alertDialog$Builder.j(jb6.M0(2131747033, null), new m8b(v9bVar, (byte) 2));
                    alertDialog$Builder.g(jb6.M0(2131751709, null), null);
                    heVar.show();
                }
            } else if (i == 112) {
                if (!z) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, r63Var, activity);
                    int i3 = cmb.K5;
                    alertDialog$Builder2.l(2131624117, 72, cmb.w0(null, i3, false), null);
                    alertDialog$Builder2.m(i3, null);
                    SpannableStringBuilder S22 = gm.S2(jb6.M0(2131747042, null));
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.U = S22;
                    alertDialog$Builder2.j(jb6.M0(2131747033, null), new m8b(v9bVar, (byte) 3));
                    alertDialog$Builder2.g(jb6.M0(2131751709, null), null);
                    heVar2.show();
                }
            } else if (i == 115) {
                if (!z) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, r63Var, activity);
                    int i4 = cmb.K5;
                    alertDialog$Builder3.l(2131624119, 72, cmb.w0(null, i4, false), null);
                    alertDialog$Builder3.m(i4, null);
                    SpannableStringBuilder S23 = gm.S2(jb6.M0(2131747046, null));
                    he heVar3 = alertDialog$Builder3.a;
                    heVar3.U = S23;
                    alertDialog$Builder3.j(jb6.M0(2131747033, null), new m8b(v9bVar, (byte) 5));
                    alertDialog$Builder3.g(jb6.M0(2131751709, null), null);
                    heVar3.show();
                } else {
                    bm3 bm3Var = v9bVar.z2;
                    if (bm3Var != null) {
                        bm3Var.run();
                    }
                }
                v9bVar.z2 = null;
            }
        }
        nm7.e().k(nm7.h5, Integer.valueOf(i), strArr, iArr);
        SparseIntArray sparseIntArray = this.b1;
        if (sparseIntArray.get(i, -1) >= 0) {
            int i5 = sparseIntArray.get(i, -1);
            sparseIntArray.delete(i);
            nm7.e().k(nm7.s5, Integer.valueOf(i5));
        }
        nm7.e().k(nm7.t5, Integer.valueOf(i), strArr, iArr);
    }

    @Override
    public final void onResume() {
        k47 k47Var;
        c99 c99Var;
        yn6 yn6Var;
        boolean z;
        LaunchActivity launchActivity;
        super.onResume();
        wxc.q(false);
        G1 = true;
        yc3 c = yc3.c();
        ArrayList arrayList = (ArrayList) c.c;
        ArrayList arrayList2 = (ArrayList) c.d;
        if (this == ((LaunchActivity) c.f)) {
            c.b = true;
            efb efbVar = (efb) c.e;
            if (efbVar.f != null && (launchActivity = efbVar.b) != null && !gm.F1(launchActivity)) {
                efbVar.d();
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ad8 ad8Var = (ad8) arrayList.get(i);
                tl4 tl4Var = ad8Var.e;
                if (tl4Var != null && ad8Var.c == 1 && tl4Var.g && !tl4Var.K) {
                    if (tl4Var.b.D() && Settings.canDrawOverlays(tl4Var.c)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != tl4Var.f) {
                        tl4Var.l();
                        tl4Var.a();
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
            c.d();
        }
        if (cmb.o == 3) {
            cmb.E(false);
        }
        dd6[] dd6VarArr = dd6.P;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            if (z8c.h(i3).o() && !dd6.f(i3).J.isEmpty()) {
                dd6.q();
                break;
            }
            i3++;
        }
        I(true);
        nm7.e().k(nm7.k1, 4096);
        MediaController w = MediaController.w();
        ViewGroup view = this.p0.getView();
        this.s1 = view;
        w.L0 = view;
        org.telegram.messenger.a.x = false;
        oc7.r1(this.P).b5(null);
        I0();
        Utilities.d.c(new bn3((byte) 19));
        D(0);
        if (Build.VERSION.SDK_INT >= 24 && (yn6Var = MediaController.b2) != null) {
            Utilities.e.d(new fx0(yn6Var.e.size(), (byte) 7), 2000L);
        }
        h0();
        dy7 dy7Var = this.z0;
        if (dy7Var != null && dy7Var.b.getVisibility() == 0) {
            this.p0.l();
            if (gm.O1()) {
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
                ((by7) obj2).l();
            }
        } else {
            this.p0.N();
            if (gm.O1()) {
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
        if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
            PhotoViewer r0 = PhotoViewer.r0();
            lb8 lb8Var = r0.f0;
            if (lb8Var != null) {
                lb8Var.invalidate();
                gm.d3(new ge7(r0, 0, (byte) 5), 100L);
            }
            ndc ndcVar = r0.G2;
            if (ndcVar != null) {
                ndcVar.o0(ndcVar.S() + 1);
                if (r0.Z2) {
                    r0.G2.r0(true);
                }
            }
            sa8 sa8Var = r0.M1;
            if (sa8Var != null && (c99Var = sa8Var.M0.d) != null) {
                c99Var.postRunnable(c99Var.x);
            }
        }
        v9b v9bVar = v9b.G2;
        if (v9bVar != null) {
            v9bVar.O();
        }
        if (PipRoundVideoView.G != null && MediaController.w().C() && (k47Var = MediaController.w().v0) != null) {
            MediaController.w().h0(k47Var, k47Var.b0);
        }
        if (z8c.h(z8c.t0).a0 != null) {
            int i5 = z8c.t0;
            L0(i5, z8c.h(i5).a0);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = gda.f1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                int i6 = z8c.t0;
                if (this.C0 == null) {
                    ?? frameLayout = new FrameLayout(this);
                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    int i7 = cmb.c6;
                    frameLayout.x = new GradientDrawable(orientation, new int[]{cmb.w0(null, i7, false), 0});
                    frameLayout.y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{cmb.w0(null, i7, false), 0});
                    anb.h(i7, null, frameLayout);
                    int i8 = (int) (gm.m / gm.p);
                    FrameLayout frameLayout2 = new FrameLayout(this);
                    frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, gm.L(176.0f) + gm.m));
                    ?? imageView = new ImageView(this);
                    imageView.f(2131624167, 108, 108, null);
                    imageView.d();
                    imageView.getAnimatedDrawable().F(1);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setPadding(0, 0, 0, gm.L(14.0f));
                    frameLayout2.addView((View) imageView, qoe.d(-2, -2.0f, 17, 0.0f, i8, 0.0f, 0.0f));
                    imageView.setOnClickListener(new ql0(frameLayout));
                    FrameLayout frameLayout3 = new FrameLayout(this);
                    ScrollView scrollView = new ScrollView(this);
                    frameLayout.f = scrollView;
                    gm.u3(scrollView, cmb.w0(null, cmb.r8, false));
                    scrollView.setPadding(0, gm.L(16.0f), 0, gm.L(16.0f));
                    scrollView.setClipToPadding(false);
                    frameLayout.addView(scrollView, qoe.d(-1, -1.0f, 51, 27.0f, i8 + 178, 27.0f, 130.0f));
                    scrollView.addView(frameLayout3);
                    TextView textView = new TextView(this);
                    int i9 = cmb.F6;
                    anb.X(textView, i9, null);
                    textView.setTextSize(1, 20.0f);
                    textView.setGravity(49);
                    textView.setTypeface(gm.o());
                    textView.setText(jb6.M0(2131743503, null));
                    frameLayout3.addView(textView, qoe.e(-2, -2, 49));
                    TextView textView2 = new TextView(this);
                    frameLayout.a = textView2;
                    anb.X(textView2, i9, null);
                    anb.G(textView2, cmb.I6, null);
                    textView2.setTextSize(1, 15.0f);
                    textView2.setMovementMethod(new cm((byte) 0));
                    textView2.setGravity(49);
                    textView2.setLineSpacing(gm.L(2.0f), 1.0f);
                    frameLayout3.addView(textView2, qoe.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                    yd ydVar = new yd(this, (byte) 3);
                    frameLayout.d = ydVar;
                    ydVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                    ydVar.setBackgroundDrawable(ulb.f(cmb.Ei, 4.0f));
                    ydVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                    frameLayout.addView(ydVar, qoe.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
                    ydVar.setOnClickListener(new ql0(frameLayout, this));
                    TextView textView3 = new TextView(this);
                    frameLayout.b = textView3;
                    textView3.setGravity(17);
                    textView3.setTypeface(gm.o());
                    textView3.setTextColor(-1);
                    textView3.setTextSize(1, 14.0f);
                    ydVar.addView(textView3, qoe.e(-2, -2, 17));
                    yd ydVar2 = new yd((byte) 4, this, (Object) frameLayout);
                    frameLayout.c = ydVar2;
                    ydVar2.setWillNotDraw(false);
                    ydVar2.setAlpha(0.0f);
                    ydVar2.setScaleX(0.1f);
                    ydVar2.setScaleY(0.1f);
                    ydVar2.setVisibility(4);
                    u09 u09Var = new u09(ydVar2);
                    frameLayout.e = u09Var;
                    u09Var.d(null, true, false);
                    u09Var.o = -1;
                    ydVar.addView(ydVar2, qoe.e(36, 36, 17));
                    this.C0 = frameLayout;
                    this.y0.addView((View) frameLayout, qoe.c(-1.0f, -1));
                }
                rl0 rl0Var = this.C0;
                rl0Var.w = 0;
                rl0Var.n = tL_help_appUpdate;
                rl0Var.s = i6;
                TLRPC.Document document = tL_help_appUpdate.document;
                if (document instanceof TLRPC.TL_document) {
                    rl0Var.r = bc4.r(null, document);
                }
                if (rl0Var.getVisibility() != 0) {
                    rl0Var.setVisibility(0);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
                k47.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
                rl0Var.a.setText(spannableStringBuilder);
                boolean z2 = tL_help_appUpdate.document instanceof TLRPC.TL_document;
                TextView textView4 = rl0Var.b;
                if (z2) {
                    textView4.setText(jb6.M0(2131743509, null).concat(String.format(Locale.US, " (%1$s)", gm.i0(tL_help_appUpdate.document.size, false, false))));
                } else {
                    textView4.setText(jb6.M0(2131743509, null));
                }
                nm7.f(rl0Var.s).b(rl0Var, nm7.Y1);
                nm7.f(rl0Var.s).b(rl0Var, nm7.Z1);
                nm7.f(rl0Var.s).b(rl0Var, nm7.X1);
                org.telegram.messenger.a.t();
            }
        }
        A(false);
        org.telegram.messenger.a.G = Settings.canDrawOverlays(this);
        yic.a(this);
        iic iicVar = iic.m1;
        if (iicVar != null) {
            if (yic.d() != null) {
                yic.b();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                iicVar.y();
            } else if (VoIPService.getSharedState() == null) {
                iicVar.u0.b();
            }
            iicVar.J0 = ((KeyguardManager) iicVar.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (yic.d() != null) {
                yic.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        } else if (yic.d() != null) {
            yic.d().getClass();
            VoIPService sharedInstance3 = VoIPService.getSharedInstance();
            if (sharedInstance3 != null && sharedInstance3.getVideoState(false) == 1) {
                sharedInstance3.setVideoState(false, 2);
            }
        }
        Z();
        HashMap hashMap = qna.n;
        if (hashMap != null) {
            for (qna qnaVar : hashMap.values()) {
                pna pnaVar = qnaVar.f;
                if (pnaVar != null) {
                    pnaVar.b = false;
                }
            }
        }
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        ut utVar = J1;
        if (utVar != null) {
            utVar.run();
            J1 = null;
        }
        oc7 r1 = oc7.r1(this.P);
        if (!r1.u3.contains("SETUP_LOGIN_EMAIL") && !r1.u3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            return;
        }
        Utilities.d.c(new ba7(oc7.r1(this.P), (byte) 10));
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
        tl4 tl4Var;
        super.onStop();
        l35 l35Var = cle.b;
        if (l35Var != null && l35Var.e == this && Build.VERSION.SDK_INT < 30) {
            l35 l35Var2 = cle.b;
            if (!l35Var2.f) {
                l35Var2.c("AUTH_CANCELED");
                cle.b.e();
            }
        }
        this.r1 = false;
        yc3 c = yc3.c();
        ArrayList arrayList = (ArrayList) c.c;
        if (this == ((LaunchActivity) c.f)) {
            c.a = false;
            ((efb) c.e).getClass();
            for (int i = 0; i < arrayList.size(); i++) {
                ad8 ad8Var = (ad8) arrayList.get(i);
                if (ad8Var.c == 1 && (tl4Var = ad8Var.e) != null && !tl4Var.f) {
                    ad8Var.a.c();
                    ad8Var.d();
                }
            }
        }
        if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
            PhotoViewer.r0().g1();
        }
        l11.z(this);
        org.telegram.messenger.a.y = true;
        oa5.k(this);
        g95 g95Var = g95.s5;
        if (g95Var != null) {
            g95Var.m1();
        }
        pp9 pp9Var = pp9.Q0;
        if (pp9Var != null) {
            pp9Var.I0 = true;
            pp9Var.v();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.h1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        ((efb) yc3.c().e).g();
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
                ((org.telegram.ui.ActionBar.d) aq1.m(1, actionBarLayout.V0)).onUserLeaveHint();
            }
            k6 k6Var = actionBarLayout.H;
            if (k6Var != null) {
                k6Var.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z) {
        boolean z2;
        ArrayList arrayList;
        q4b a;
        long[] jArr2 = jArr;
        int i = 0;
        while (true) {
            if (i < jArr2.length) {
                TLRPC.User W1 = oc7.r1(this.P).W1(Long.valueOf(jArr2[i]));
                if (W1 != null && !W1.stories_hidden) {
                    z2 = false;
                    break;
                }
                i++;
            } else {
                z2 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.d Q = Q();
        if (Q != null) {
            h4b N1 = oc7.r1(this.P).N1();
            if (z2) {
                arrayList = N1.h;
            } else {
                arrayList = N1.g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z3 = z2;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z3) {
                ArrayList arrayList5 = new ArrayList();
                for (int i2 = 0; i2 < jArr2.length; i2++) {
                    TLRPC.User W12 = oc7.r1(this.P).W1(Long.valueOf(jArr2[i2]));
                    if (W12 == null || !W12.stories_hidden) {
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
                    i4 = mle.c(i4, 1, jArr2[i4], arrayList4);
                }
            } else {
                while (i4 < jArr2.length) {
                    i4 = mle.c(i4, 1, jArr2[i4], arrayList3);
                }
            }
            if (!arrayList4.isEmpty() && z) {
                oc7 r1 = oc7.r1(this.P);
                int[] iArr = {arrayList4.size()};
                dt5 dt5Var = new dt5(this, iArr, jArr2, (byte) 5);
                for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                    long longValue = ((Long) arrayList4.get(i5)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer i1 = r1.i1(longValue);
                    tL_stories_getPeerStories.peer = i1;
                    if (i1 instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getPeerStories, new jb7(r1, longValue, dt5Var, (byte) 3));
                    }
                }
                return;
            }
            long e = z8c.h(this.P).e();
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                long n = pg3.n(((TL_stories.PeerStories) arrayList2.get(i6)).peer);
                if (n != e && !arrayList3.contains(Long.valueOf(n)) && N1.K(n)) {
                    arrayList3.add(Long.valueOf(n));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (Q instanceof nk3) {
                    try {
                        a = q4b.a(((nk3) Q).F0.h);
                    } catch (Exception unused) {
                    }
                    q4b q4bVar = a;
                    Q.getOrCreateStoryViewer().z();
                    Q.getOrCreateStoryViewer().K(this, null, arrayList3, 0, null, null, q4bVar, false);
                }
                a = null;
                q4b q4bVar2 = a;
                Q.getOrCreateStoryViewer().z();
                Q.getOrCreateStoryViewer().K(this, null, arrayList3, 0, null, null, q4bVar2, false);
            }
        }
    }

    @Override
    public final boolean q(defpackage.nk3 r49, java.util.ArrayList r50, final java.lang.CharSequence r51, boolean r52, boolean r53, int r54, final int r55, defpackage.sxb r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.q(nk3, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, sxb):boolean");
    }

    public final void q0(final int i, final long j, final boolean z) {
        TL_stories.StoryItem storyItem;
        z3b z3bVar;
        z3b z2;
        k47 f;
        k47 f2;
        TL_stories.StoryItem storyItem2;
        h4b N1 = oc7.r1(this.P).N1();
        TL_stories.PeerStories x = N1.x(j);
        q4b q4bVar = null;
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
                org.telegram.ui.ActionBar.d Q = Q();
                if (Q != null) {
                    if (Q instanceof nk3) {
                        try {
                            q4bVar = q4b.a(((nk3) Q).F0.h);
                        } catch (Exception unused) {
                        }
                    }
                    q4b q4bVar2 = q4bVar;
                    Q.getOrCreateStoryViewer().z();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z) {
                        Q.getOrCreateStoryViewer().w1 = true;
                    }
                    Q.getOrCreateStoryViewer().K(this, storyItem2, arrayList, 0, null, x, q4bVar2, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            z3b z3 = N1.z(0, -1, j, true);
            if (z3 != null && (f2 = z3.f(i)) != null) {
                storyItem = f2.l;
            } else {
                z3 = null;
            }
            if (storyItem == null && (z2 = N1.z(1, -1, j, true)) != null && (f = z2.f(i)) != null) {
                storyItem = f.l;
                z3bVar = z2;
            } else {
                z3bVar = z3;
            }
            if (storyItem != null && z3bVar != null) {
                storyItem.dialogId = j;
                org.telegram.ui.ActionBar.d Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof nk3) {
                    try {
                        q4bVar = q4b.a(((nk3) Q2).F0.h);
                    } catch (Exception unused2) {
                    }
                }
                q4b q4bVar3 = q4bVar;
                Q2.getOrCreateStoryViewer().z();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z) {
                    Q2.getOrCreateStoryViewer().w1 = true;
                }
                Q2.getOrCreateStoryViewer().K(this, storyItem, arrayList2, 0, z3bVar, null, q4bVar3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = oc7.r1(this.P).i1(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.C1;
                gm.c3(new do3(LaunchActivity.this, tLObject, i, j, z));
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, bmb bmbVar) {
        int i = bmbVar.g0;
        boolean z = false;
        amb d = bmbVar.d(tL_theme, this.P, 0);
        bmbVar.a0 = bmbVar.Z;
        bmbVar.u(d.a);
        d.s = tL_wallPaper;
        if (i != bmbVar.g0) {
            z = true;
        }
        t0(new rob(bmbVar, z, 0, false, false));
    }

    @Override
    public final boolean s(defpackage.nk3 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s(nk3):boolean");
    }

    public final void s0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void setRequestedOrientation(int i) {
        gm.g = -10;
        gm.h = -10;
        gm.i = null;
        super.setRequestedOrientation(i);
    }

    public final void t0(org.telegram.ui.ActionBar.d dVar) {
        ((ActionBarLayout) N()).S(dVar);
    }

    public final boolean u0(org.telegram.ui.ActionBar.d dVar, boolean z, boolean z2) {
        return ((ActionBarLayout) N()).U(dVar, z, z2);
    }

    public final void v0(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i < arrayList.size()) {
                if (arrayList.get(i) instanceof wx0) {
                    wx0 wx0Var = (wx0) arrayList.get(i);
                    if (wx0Var.isShowing() && wx0Var.J == j) {
                        return;
                    }
                }
                i++;
            } else {
                org.telegram.ui.ActionBar.d S = S();
                if (S != null && S.sheetsStack != null) {
                    for (int i2 = 0; i2 < S.sheetsStack.size(); i2++) {
                        if (S.sheetsStack.get(i2).s()) {
                            S.sheetsStack.get(i2);
                        }
                    }
                }
                i34 v = this.p0.v();
                if (v != null && v.sheetsStack != null) {
                    for (int i3 = 0; i3 < v.sheetsStack.size(); i3++) {
                        if (v.sheetsStack.get(i3).s()) {
                            v.sheetsStack.get(i3);
                        }
                    }
                }
                b16 b16Var = new b16(this, (byte) 1);
                TLRPC.User W1 = oc7.r1(this.P).W1(Long.valueOf(j));
                if (W1 != null) {
                    b16Var.a(W1);
                    return;
                } else {
                    cf7.Y(this.P).a.c(new of2(this, j, b16Var, (byte) 27));
                    return;
                }
            }
        }
    }

    public final void w0(Long l, k16 k16Var, k11 k11Var, rc2 rc2Var) {
        wh1 F0 = oc7.r1(this.P).F0();
        if (k11Var != null) {
            k11Var.d();
        }
        F0.a(l.longValue(), new f45(this, k11Var, k16Var, F0, l, rc2Var, (byte) 3));
    }

    public final void x0(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, String str26, final String str27, final k11 k11Var, final boolean z3, final int i4, final int i5, final int i6, final boolean z4, final String str28, final TLRPC.User user, final k16 k16Var, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final String str29, final boolean z12) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = oc7.r1(i).p1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str30 = LaunchActivity.C1;
                final k11 k11Var2 = k11Var;
                if (k11Var2 != null) {
                    k11Var2.b();
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
                    gm.c3(new Runnable() {
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
                            launchActivity2.B0(i13, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, str69, str70, z24, num5, l5, l6, num6, str71, hashMap3, str72, str73, str74, str75, tL_wallPaper3, str76, str77, str78, str79, z25, str80, z26 ? 1 : 0, i8, str53, str54, str55, null, null, k11Var2, z13, i9, false, i10, i11, null, null, z20, str56, z14, z15, z16, z21, z22, str57, null, z23, null);
                        }
                    });
                    return;
                }
                final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                final k16 k16Var2 = k16Var;
                final TLRPC.User user2 = user;
                final String str58 = str27;
                final boolean z24 = z6;
                final boolean z25 = z5;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        d dVar;
                        String str59 = LaunchActivity.C1;
                        k16Var2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.e0;
                        kg5 kg5Var = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            dVar = (d) b10.f(1, arrayList);
                        } else {
                            dVar = null;
                        }
                        int i13 = i7;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str60 = str58;
                        boolean z26 = z14;
                        boolean z27 = z15;
                        boolean z28 = z16;
                        boolean z29 = z13;
                        w06 w06Var = new w06(launchActivity2, dVar, i13, user3, tL_messages_botApp2, atomicBoolean, str60, z26, z27, z28, z29);
                        if (z24) {
                            w06Var.run();
                        } else if (tL_messages_botApp2.inactive && z25) {
                            sk3 sk3Var = new sk3(w06Var, (byte) 20);
                            k11 k11Var3 = k11Var2;
                            if (k11Var3 != null) {
                                kg5Var = new kg5(k11Var3, (byte) 14);
                            }
                            quc.a(launchActivity2, sk3Var, kg5Var);
                        } else if (!tL_messages_botApp2.request_write_access && !z29) {
                            w06Var.run();
                        } else {
                            ik.m(dVar, atomicBoolean, user3, w06Var);
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
        ofArgb.addUpdateListener(new sz5(this, (byte) 1));
        this.z1.addListener(new co(this, i, (byte) 6));
        this.z1.setInterpolator(d53.h);
        this.z1.setDuration(320L);
        this.z1.start();
    }

    public final int z0(final int i, final k16 k16Var, final Integer num, final Integer num2, final Long l, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i2, final int i3) {
        int longValue;
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = oc7.k1(chat);
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
                final k16 k16Var2 = k16Var;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.j06.run():void");
                    }
                });
            }
        });
    }

    @Override
    public final void e(int[] iArr) {
    }
}
