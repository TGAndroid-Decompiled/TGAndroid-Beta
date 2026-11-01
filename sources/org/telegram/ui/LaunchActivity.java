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
import android.util.Log;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.BackupAgent;
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
public class LaunchActivity extends f5 implements org.telegram.ui.ActionBar.v4, org.telegram.messenger.vs, tx, kf.a {
    public static final Pattern D1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean E1;
    public static int F1;
    public static boolean G1;
    public static org.telegram.ui.Components.zt H1;
    public static LaunchActivity I1;
    public static Pattern J1;
    public static y K1;
    public static LaunchActivity L1;
    public org.telegram.ui.Components.bd0 A0;
    public ValueAnimator A1;
    public final ArrayList B0;
    public rh.a9 B1;
    public org.telegram.ui.Components.qz0 C0;
    public int C1;
    public org.telegram.ui.Components.o9 D0;
    public final ArrayList E0;
    public org.telegram.ui.ActionBar.x1 F0;
    public View G0;
    public org.telegram.ui.ActionBar.x1 H0;
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
    public org.telegram.ui.ActionBar.s6 T0;
    public ArrayList U;
    public TLRPC.TL_theme U0;
    public ArrayList V;
    public boolean V0;
    public ArrayList W;
    public org.telegram.ui.ActionBar.x1 W0;
    public Uri X;
    public boolean X0;
    public String Y;
    public boolean Y0;
    public ArrayList Z;
    public ph.w3 Z0;
    public ArrayList f33354a0;
    public m4 f33355a1;
    public Uri f33356b0;
    public final ArrayList f33357b1;
    public int f33358c0;
    public final SparseIntArray f33359c1;
    public int f33361d1;
    public final s90 f33363e1;
    public org.telegram.messenger.o6 f33365f1;
    public y80 f33366g0;
    public androidx.mediarouter.app.f f33367g1;
    public ArrayList f33368h0;
    public hh.e f33369h1;
    public ArrayList f33370i0;
    public boolean f33371i1;
    public String f33372j0;
    public rf.v f33373j1;
    public ActionMode f33374k0;
    public x90 f33375k1;
    public boolean f33376l0;
    public y90 l1;
    public final j2.f m0;
    public boolean f33377m1;
    public final jf.c f33378n0;
    public xa.n f33379n1;
    public org.telegram.ui.Components.c11 f33380o0;
    public xa.n f33381o1;
    public ag.r f33382p0;
    public boolean f33383p1;
    public ActionBarLayout f33384q0;
    public u80 f33385q1;
    public ActionBarLayout f33386r0;
    public ag.l f33387r1;
    public ActionBarLayout f33388s0;
    public boolean f33389s1;
    public m90 f33390t0;
    public ViewGroup f33391t1;
    public FrameLayout f33392u0;
    public final ij0 f33393u1;
    public w8 f33394v0;
    public org.telegram.ui.ActionBar.x1 f33395v1;
    public l0 f33396w0;
    public org.telegram.ui.ActionBar.x1 f33397w1;
    public v90 f33398x0;
    public boolean f33399x1;
    public org.telegram.ui.ActionBar.q3 f33400y0;
    public long f33401y1;
    public org.telegram.ui.ActionBar.s3 f33402z0;
    public int[] f33403z1;
    public final ArrayList P = new ArrayList();
    public final ArrayList f33360d0 = new ArrayList();
    public final ArrayList f33362e0 = new ArrayList();
    public final ArrayList f33364f0 = new ArrayList();

    public LaunchActivity() {
        ?? obj = new Object();
        obj.f9348a = new HashMap();
        obj.d = this;
        obj.f9349b = new jf.c(this);
        this.m0 = obj;
        this.f33378n0 = (jf.c) obj.f9349b;
        this.B0 = new ArrayList();
        this.E0 = new ArrayList();
        this.X0 = false;
        this.f33357b1 = new ArrayList();
        this.f33359c1 = new SparseIntArray();
        this.f33361d1 = 5934;
        this.f33363e1 = new Object();
        this.f33383p1 = true;
        System.identityHashCode(this);
        this.f33393u1 = new ij0(this);
        this.C1 = 0;
    }

    public static void C0(org.telegram.messenger.c cVar, zx zxVar, CharSequence charSequence, long j10, org.telegram.messenger.kj kjVar, long j11, boolean z10, int i10, int i11) {
        boolean z11;
        org.telegram.ui.Components.tp0 tp0Var;
        org.telegram.ui.Components.tp0 tp0Var2;
        int i12 = cVar.f15043a;
        if (zxVar != null && (tp0Var2 = zxVar.G2) != null && !tp0Var2.f30694n) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z11 && zxVar != null && (tp0Var = zxVar.G2) != null) {
            webPage = tp0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z11) {
                org.telegram.messenger.rz.a0(cVar, charSequence, j10, j11, z10, i10, i11);
                return;
            }
            CharSequence H = org.telegram.messenger.rz.H(charSequence);
            if (H != null && H.length() != 0) {
                CharSequence[] charSequenceArr = {H};
                org.telegram.messenger.rz.C(i12).r0(org.telegram.messenger.pz.b(charSequenceArr[0].toString(), j10, kjVar, kjVar, webPage2, z11, org.telegram.messenger.vi.b0(i12).W(charSequenceArr, true, true), null, null, z10, i10, i11, null, false));
            }
        }
    }

    public static void D(int i10) {
        LaunchActivity launchActivity = L1;
        if (launchActivity != null) {
            launchActivity.C(i10);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i10, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        String E12;
        org.telegram.ui.ActionBar.k2 Q = Q();
        if (Q != null) {
            long j10 = tL_attachMenuBot.bot_id;
            xh.t3 b10 = xh.t3.b(i10, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.N() != null && launchActivity.N().m(b10) != null) {
                return;
            }
            TLRPC.User Z1 = org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(tL_attachMenuBot.bot_id));
            if (Z1 == null) {
                E12 = null;
            } else {
                E12 = org.telegram.messenger.wp.r1(i10).E1(Z1.restriction_reason);
            }
            if (!TextUtils.isEmpty(E12)) {
                org.telegram.messenger.wp.r1(i10);
                org.telegram.messenger.wp.O4(E12, Q);
                return;
            }
            xh.m2 m2Var = new xh.m2(launchActivity, Q.getResourceProvider());
            m2Var.B0 = false;
            m2Var.B(z10);
            m2Var.f53906l0 = launchActivity;
            m2Var.x(Q, b10);
            m2Var.show();
        }
    }

    public static void J() {
        ly lyVar;
        ArrayList<org.telegram.ui.ActionBar.g2> arrayList;
        org.telegram.ui.ActionBar.k2 T = T();
        if (T != null) {
            if (T.getParentLayout() instanceof ActionBarLayout) {
                lyVar = ((ActionBarLayout) T.getParentLayout()).w();
            } else {
                lyVar = null;
            }
            if (lyVar != null && (arrayList = lyVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    lyVar.sheetsStack.get(size).a(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.g2> arrayList2 = T.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    T.sheetsStack.get(size2).a(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = xh.m2.f53888a1.iterator();
            while (it.hasNext()) {
                arrayList3.add((xh.m2) it.next());
            }
            int size3 = arrayList3.size();
            int i10 = 0;
            while (i10 < size3) {
                Object obj = arrayList3.get(i10);
                i10++;
                ((xh.m2) obj).o(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.k2 L() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f21641a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.z4) i0.a.g(1, I1.P))).t();
        }
        LaunchActivity launchActivity2 = I1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return ((ActionBarLayout) I1.M()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.k2 Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f21641a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.z4) i0.a.g(1, I1.P)).getLastFragment();
        }
        LaunchActivity launchActivity2 = I1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return I1.M().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.k2 T() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f21641a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.z4) i0.a.g(1, I1.P)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = I1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return I1.M().getSafeLastFragment();
        }
        return null;
    }

    public static String U(int i10, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null) {
            return org.telegram.messenger.dd.L0(i10, str);
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
                        org.telegram.messenger.f8.g(e, true);
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
        rh.a9 a9Var;
        LaunchActivity launchActivity = I1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((a9Var = launchActivity.B1) == null || ((View) a9Var.f2047a) != decorView)) {
                launchActivity.B1 = new rh.a9(decorView);
            }
            rh.a9 a9Var2 = launchActivity.B1;
            if (a9Var2 != null) {
                View view = (View) a9Var2.f2047a;
                ArrayList arrayList = a9Var2.f46642b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(w7.z8.a(0.0f, 0.0f, f7, f10), w7.z8.a(view.getWidth(), 0.0f, f7, f10)), Math.max(w7.z8.a(0.0f, view.getHeight(), f7, f10), w7.z8.a(view.getWidth(), view.getHeight(), f7, f10))) * 2.0f) / (org.telegram.messenger.i0.f16171p * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    rh.z8 z8Var = new rh.z8(f7, f10, f11);
                    ofFloat.addUpdateListener(new ag.p2(26, a9Var2, z8Var));
                    ofFloat.addListener(new org.telegram.ui.Components.jw0(16, a9Var2, z8Var));
                    ofFloat.setInterpolator(org.telegram.ui.Components.gr.f26524g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(z8Var);
                    a9Var2.f1();
                    ofFloat.start();
                }
            }
        }
    }

    public final void A() {
        if (this.O == org.telegram.messenger.e20.f15506s0 && this.f33379n1 != null) {
            return;
        }
        xa.n nVar = this.f33379n1;
        if (nVar != null) {
            nVar.a();
            this.f33379n1 = null;
        }
        int i10 = org.telegram.messenger.e20.f15506s0;
        this.O = i10;
        xa.n nVar2 = new xa.n(org.telegram.messenger.at.f(i10), this);
        nVar2.e(org.telegram.messenger.at.f14752n3);
        nVar2.e(org.telegram.messenger.at.I2);
        nVar2.e(org.telegram.messenger.at.f14728j0);
        nVar2.e(org.telegram.messenger.at.W4);
        nVar2.e(org.telegram.messenger.at.T1);
        nVar2.e(org.telegram.messenger.at.M0);
        nVar2.e(org.telegram.messenger.at.R0);
        nVar2.e(org.telegram.messenger.at.f14687c1);
        nVar2.e(org.telegram.messenger.at.Q);
        nVar2.e(org.telegram.messenger.at.N0);
        nVar2.e(org.telegram.messenger.at.Y1);
        nVar2.e(org.telegram.messenger.at.Z1);
        nVar2.e(org.telegram.messenger.at.f14801v1);
        nVar2.e(org.telegram.messenger.at.f14809w2);
        nVar2.e(org.telegram.messenger.at.f14815x1);
        nVar2.e(org.telegram.messenger.at.f14727i5);
        nVar2.e(org.telegram.messenger.at.f14709f5);
        nVar2.e(org.telegram.messenger.at.f14778r5);
        nVar2.e(org.telegram.messenger.at.Q5);
        this.f33379n1 = nVar2;
    }

    public final void A0(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.A0(android.net.Uri):void");
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.f33373j1 == null && org.telegram.messenger.uz.f18540p) {
                this.f33373j1 = rf.v.b(this, this.f33396w0);
            }
            rf.v vVar = this.f33373j1;
            if (vVar != null && !org.telegram.messenger.uz.f18540p) {
                vVar.c();
                this.f33373j1 = null;
            }
        }
    }

    public final void B0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final gf.e r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.B0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, gf.e, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void C(int i10) {
        L1 = this;
        Set set = org.telegram.messenger.c1.f15048a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - org.telegram.messenger.uz.H) >= 86400) {
            org.telegram.messenger.uz.H = currentTimeMillis;
            Utilities.f14522f.c(new org.telegram.messenger.a1(currentTimeMillis, org.telegram.messenger.b8.j(4), 0));
        }
        if (org.telegram.messenger.v2.f18578a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - org.telegram.messenger.uz.I) >= 3600) {
                org.telegram.messenger.uz.I = currentTimeMillis2;
                Utilities.f14522f.c(new org.telegram.messenger.xd(currentTimeMillis2, 5));
            }
        }
        if ((Build.VERSION.SDK_INT >= 26 && i10 == 0) || this.f33399x1) {
            return;
        }
        Utilities.e.d(new s80(this, i10, 1), 2000L);
    }

    public final void D0(int i10) {
        this.f33402z0.setInternalNavigationBarColor(i10);
        org.telegram.ui.ActionBar.i3 N = N();
        if (N != null) {
            N.setNavigationBarColor(i10);
        }
    }

    public final void E() {
        int i10;
        boolean z10;
        if (org.telegram.messenger.i0.Q1() && this.f33388s0 != null) {
            Boolean bool = org.telegram.messenger.i0.L;
            int i11 = 0;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (org.telegram.messenger.w0.f18945b != null && org.telegram.messenger.w0.f18945b.getResources().getBoolean(2131034114)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (booleanValue != z10) {
                    return;
                }
            }
            if (!org.telegram.messenger.i0.E && (!org.telegram.messenger.i0.P1() || getResources().getConfiguration().orientation == 2)) {
                this.O0 = false;
                List<org.telegram.ui.ActionBar.k2> fragmentStack = this.f33384q0.getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    while (1 < fragmentStack.size()) {
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentStack.get(1);
                        if (k2Var instanceof un) {
                            un unVar = (un) k2Var;
                            unVar.f42120k5 = true;
                            unVar.f42131l5 = true;
                        }
                        k2Var.onPause();
                        k2Var.onFragmentDestroy();
                        k2Var.setParentLayout(null);
                        fragmentStack.remove(k2Var);
                        this.f33388s0.c(-1, k2Var);
                    }
                    org.telegram.ui.Components.bd0 bd0Var = this.A0;
                    if (bd0Var == null || bd0Var.f24711b.getVisibility() != 0) {
                        this.f33384q0.W(true, true);
                        this.f33388s0.W(true, true);
                    }
                }
                ViewGroup view = this.f33388s0.getView();
                if (this.f33388s0.getFragmentStack().isEmpty()) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                view.setVisibility(i10);
                w8 w8Var = this.f33394v0;
                if (!this.f33388s0.getFragmentStack().isEmpty()) {
                    i11 = 8;
                }
                w8Var.setVisibility(i11);
                return;
            }
            this.O0 = true;
            List<org.telegram.ui.ActionBar.k2> fragmentStack2 = this.f33388s0.getFragmentStack();
            if (!fragmentStack2.isEmpty()) {
                while (fragmentStack2.size() > 0) {
                    org.telegram.ui.ActionBar.k2 k2Var2 = fragmentStack2.get(0);
                    if (k2Var2 instanceof un) {
                        un unVar2 = (un) k2Var2;
                        unVar2.f42120k5 = true;
                        unVar2.f42131l5 = true;
                    }
                    k2Var2.onPause();
                    k2Var2.onFragmentDestroy();
                    k2Var2.setParentLayout(null);
                    fragmentStack2.remove(k2Var2);
                    this.f33384q0.c(-1, k2Var2);
                }
                org.telegram.ui.Components.bd0 bd0Var2 = this.A0;
                if (bd0Var2 == null || bd0Var2.f24711b.getVisibility() != 0) {
                    this.f33384q0.W(true, true);
                }
            }
            this.f33388s0.getView().setVisibility(8);
            w8 w8Var2 = this.f33394v0;
            if (!this.f33384q0.getFragmentStack().isEmpty()) {
                i11 = 8;
            }
            w8Var2.setVisibility(i11);
        }
    }

    public final void E0() {
        org.telegram.ui.ActionBar.s3 s3Var;
        ViewGroup view;
        int i10;
        if (this.f33402z0.indexOfChild(this.f33390t0) != -1) {
            s3Var = this.f33402z0;
            view = this.f33390t0;
        } else {
            s3Var = this.f33402z0;
            view = this.f33384q0.getView();
        }
        int indexOfChild = s3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.f33402z0.removeViewAt(indexOfChild);
        }
        if (org.telegram.messenger.i0.Q1()) {
            getWindow().setSoftInputMode(16);
            m90 m90Var = new m90(this, this);
            this.f33390t0 = m90Var;
            if (indexOfChild != -1) {
                this.f33402z0.addView(m90Var, indexOfChild, w7.b6.c(-1.0f, -1));
            } else {
                this.f33402z0.addView(m90Var, w7.b6.c(-1.0f, -1));
            }
            w8 w8Var = new w8(this, null);
            this.f33394v0 = w8Var;
            w8Var.setOccupyStatusBar(false);
            this.f33394v0.U(org.telegram.ui.ActionBar.t6.s0());
            this.f33390t0.addView(this.f33394v0, w7.b6.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.f33384q0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f33384q0.getView());
            }
            this.f33390t0.addView(this.f33384q0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f33388s0 = actionBarLayout;
            actionBarLayout.T0 = true;
            actionBarLayout.setFragmentStack(this.f33364f0);
            this.f33388s0.setDelegate(this);
            this.f33390t0.addView(this.f33388s0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f33392u0 = frameLayout;
            ArrayList arrayList = this.f33362e0;
            int i11 = 8;
            if (arrayList.isEmpty()) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            frameLayout.setVisibility(i10);
            this.f33392u0.setBackgroundColor(1056964608);
            this.f33390t0.addView(this.f33392u0);
            this.f33392u0.setOnTouchListener(new d0(this, 3));
            this.f33392u0.setOnClickListener(new bh.c(16));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f33386r0 = actionBarLayout2;
            actionBarLayout2.S0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f33386r0.setBackgroundView(this.f33392u0);
            this.f33386r0.setUseAlphaAnimations(true);
            this.f33386r0.setFragmentStack(arrayList);
            this.f33386r0.setDelegate(this);
            this.f33386r0.setDrawerLayoutContainer(this.f33402z0);
            ViewGroup view2 = this.f33386r0.getView();
            if (!arrayList.isEmpty()) {
                i11 = 0;
            }
            view2.setVisibility(i11);
            this.f33390t0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f33384q0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f33384q0.getView());
            }
            this.f33384q0.setFragmentStack(this.f33360d0);
            if (indexOfChild != -1) {
                this.f33402z0.addView(this.f33384q0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.f33402z0.addView(this.f33384q0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        v7.h7.a(this, org.telegram.messenger.uz.f18565x1, false);
    }

    public final void F(boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.ActionBar.k2 k2Var;
        int x02;
        sn snVar;
        boolean z13;
        ArrayList arrayList = this.f33360d0;
        boolean z14 = true;
        if (!arrayList.isEmpty()) {
            k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
        } else {
            k2Var = null;
        }
        char c10 = 2;
        if (k2Var != null && (k2Var.isRemovingFromStack() || k2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(2, arrayList);
            } else {
                k2Var = null;
            }
        }
        if (k2Var != null) {
            k2Var.hasForceLightStatusBar();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (z11) {
            if (k2Var != null) {
                z13 = k2Var.isLightStatusBar();
                if (k2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) k2Var.getParentLayout();
                    if (actionBarLayout.w() != null && actionBarLayout.w().getLastSheet() != null) {
                        org.telegram.ui.ActionBar.g2 lastSheet = actionBarLayout.w().getLastSheet();
                        if (lastSheet.s()) {
                            z13 = lastSheet.f();
                        }
                    } else {
                        ArrayList<org.telegram.ui.ActionBar.g2> arrayList2 = k2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) i0.a.g(1, k2Var.sheetsStack);
                            if (g2Var.s()) {
                                z13 = g2Var.f();
                            }
                        }
                    }
                }
            } else {
                z13 = i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21207s8, true)) > 0.699999988079071d;
            }
            org.telegram.messenger.i0.o3(this, z13);
        }
        if (i10 >= 26 && z12 && (!z10 || k2Var == null || !k2Var.isInPreviewMode())) {
            if (k2Var != null && z10) {
                x02 = k2Var.getNavigationBarColor();
            } else {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, true);
            }
            if (k2Var instanceof un) {
                un unVar = (un) k2Var;
                if (!unVar.f42000ac || (unVar.f42264w.f7702s != 1 && ((snVar = unVar.f42288xa) == null || !snVar.f41411q))) {
                    c10 = 1;
                }
            } else {
                c10 = 0;
            }
            if (N() != null && N().H > 0) {
                c10 = 0;
            }
            if (this.f33384q0.w() != null) {
                ly w9 = this.f33384q0.w();
                if (w9.sheetsStack != null) {
                    for (int i11 = 0; i11 < w9.sheetsStack.size(); i11++) {
                        org.telegram.ui.ActionBar.g2 g2Var2 = w9.sheetsStack.get(i11);
                        if (g2Var2.z()) {
                            x02 = g2Var2.e(x02);
                            c10 = 0;
                        }
                    }
                }
            }
            Iterator it = xh.m2.f53888a1.iterator();
            while (it.hasNext()) {
                x02 = ((xh.m2) it.next()).e(x02);
                c10 = 0;
            }
            D0(x02);
            if ((c10 != 0 || org.telegram.messenger.i0.B(x02) < 0.721f) && c10 != 1) {
                z14 = false;
            }
            org.telegram.messenger.i0.l3(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final org.telegram.ui.ActionBar.x1 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.x1 p5 = alertDialog$Builder.p();
            p5.setCanceledOnTouchOutside(true);
            p5.setOnDismissListener(new mg.g(7, this, p5));
            this.E0.add(p5);
            return p5;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }

    public final void G(boolean z10) {
        org.telegram.messenger.u3 u3Var;
        long j10;
        boolean z11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z12 = false;
        if (sharedInstance != null && (u3Var = sharedInstance.groupCall) != null) {
            boolean z13 = this.f33376l0;
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
                j10 = org.telegram.messenger.e20.i(this.O).f15524n;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(j10);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && groupCallParticipant.raise_hand_rating != 0) {
                z12 = true;
            }
            this.f33376l0 = z12;
            if (!z10 && z13 && !z12 && !z11 && a50.f35573u5 == null) {
                N0(38);
                return;
            }
            return;
        }
        this.f33376l0 = false;
    }

    @Override
    public final boolean H() {
        ArrayList arrayList = this.U;
        if ((arrayList != null && arrayList.size() == 1) || this.R != null) {
            return true;
        }
        return false;
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.k2 k2Var;
        ArrayList arrayList = this.f33362e0;
        if (!arrayList.isEmpty()) {
            k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f33364f0;
            if (!arrayList2.isEmpty()) {
                k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.f33360d0;
                if (!arrayList3.isEmpty()) {
                    k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList3);
                } else {
                    k2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.cc.a(k2Var)) {
            aVar.c(org.telegram.ui.Components.cc.a0(k2Var)).j();
        }
    }

    public final void I() {
        ArrayList arrayList = this.f33360d0;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.k2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (org.telegram.messenger.i0.Q1()) {
            ArrayList arrayList2 = this.f33362e0;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((org.telegram.ui.ActionBar.k2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f33364f0;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                ((org.telegram.ui.ActionBar.k2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void I0() {
        String str;
        String str2;
        char c10;
        org.telegram.messenger.ad adVar;
        if (org.telegram.messenger.e20.i(this.O).p()) {
            try {
                if (!this.I0 && !org.telegram.messenger.w0.f18952x) {
                    String string = org.telegram.messenger.wp.d1().getString("language_showed2", "");
                    final String str3 = org.telegram.messenger.wp.r1(this.O).Q3;
                    if (string.equals(str3)) {
                        if (org.telegram.messenger.v2.f18578a) {
                            org.telegram.messenger.f8.b("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final org.telegram.messenger.ad[] adVarArr = new org.telegram.messenger.ad[2];
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
                        if (i10 < org.telegram.messenger.dd.D0().J.size()) {
                            org.telegram.messenger.ad adVar2 = (org.telegram.messenger.ad) org.telegram.messenger.dd.D0().J.get(i10);
                            c10 = c11;
                            if (adVar2.f14593c.equals("en")) {
                                adVarArr[c10] = adVar2;
                            }
                            if (adVar2.f14593c.replace("_", "-").equals(str3) || adVar2.f14593c.equals(str) || adVar2.f14593c.equals(str2)) {
                                adVarArr[1] = adVar2;
                            }
                            if (adVarArr[c10] != null && adVarArr[1] != null) {
                                break;
                            }
                            i10++;
                            c11 = c10;
                        } else {
                            c10 = c11;
                            break;
                        }
                    }
                    org.telegram.messenger.ad adVar3 = adVarArr[c10];
                    if (adVar3 != null && (adVar = adVarArr[1]) != null && adVar3 != adVar) {
                        if (org.telegram.messenger.v2.f18578a) {
                            org.telegram.messenger.f8.b("show lang alert for " + adVarArr[c10].b() + " and " + adVarArr[1].b());
                        }
                        this.J0 = null;
                        this.K0 = null;
                        this.I0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = adVarArr[1].c();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) {
                            public final LaunchActivity f35718b;

                            {
                                this.f35718b = this;
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
                                        final LaunchActivity launchActivity = this.f35718b;
                                        final org.telegram.messenger.ad[] adVarArr2 = adVarArr;
                                        final String str4 = str3;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.J0 = hashMap2;
                                                        if (launchActivity2.K0 != null && hashMap2 != null) {
                                                            org.telegram.messenger.ad[] adVarArr3 = adVarArr2;
                                                            launchActivity2.J0(adVarArr3[1], adVarArr3[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
                                                            org.telegram.messenger.ad[] adVarArr4 = adVarArr2;
                                                            launchActivity3.J0(adVarArr4[1], adVarArr4[0], str4);
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
                                        final LaunchActivity launchActivity2 = this.f35718b;
                                        final org.telegram.messenger.ad[] adVarArr3 = adVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.K0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.ad[] adVarArr32 = adVarArr3;
                                                            launchActivity22.J0(adVarArr32[1], adVarArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
                                                            org.telegram.messenger.ad[] adVarArr4 = adVarArr3;
                                                            launchActivity3.J0(adVarArr4[1], adVarArr4[0], str5);
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
                        tL_langpack_getStrings2.lang_code = adVarArr[c10].c();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {
                            public final LaunchActivity f35718b;

                            {
                                this.f35718b = this;
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
                                        final LaunchActivity launchActivity = this.f35718b;
                                        final org.telegram.messenger.ad[] adVarArr2 = adVarArr;
                                        final String str4 = str3;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.K0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.ad[] adVarArr32 = adVarArr2;
                                                            launchActivity22.J0(adVarArr32[1], adVarArr32[0], str4);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
                                                            org.telegram.messenger.ad[] adVarArr4 = adVarArr2;
                                                            launchActivity3.J0(adVarArr4[1], adVarArr4[0], str4);
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
                                        final LaunchActivity launchActivity2 = this.f35718b;
                                        final org.telegram.messenger.ad[] adVarArr3 = adVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.J0 = hashMap22;
                                                        if (launchActivity22.K0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.ad[] adVarArr32 = adVarArr3;
                                                            launchActivity22.J0(adVarArr32[1], adVarArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.K0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.J0 != null) {
                                                            org.telegram.messenger.ad[] adVarArr4 = adVarArr3;
                                                            launchActivity3.J0(adVarArr4[1], adVarArr4[0], str5);
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
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void J0(org.telegram.messenger.ad r18, org.telegram.messenger.ad r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.J0(org.telegram.messenger.ad, org.telegram.messenger.ad, java.lang.String):void");
    }

    public final java.util.ArrayList K(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.K(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void K0(boolean z10, boolean z11, int i10, int i11, rh rhVar) {
        if (this.f33402z0 != null && !isFinishing()) {
            if (this.A0 == null) {
                this.A0 = new org.telegram.ui.Components.bd0(this);
            }
            org.telegram.messenger.uz.f18563x = true;
            int i12 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f34023s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                PhotoViewer.v1().H0(false, true);
            } else if (h4.G() && h4.v().V) {
                h4.v().m(false, true);
            }
            vh.o8.w();
            org.telegram.messenger.kj kjVar = MediaController.B().f14483u0;
            if (kjVar != null && kjVar.h4()) {
                MediaController.B().q(true, true, false, false);
            }
            this.A0.show();
            org.telegram.ui.Components.ad0 ad0Var = this.A0.f24711b;
            ArrayList arrayList = this.B0;
            arrayList.isEmpty();
            ad0Var.m(z11, i10, i11, new y60(9, this, rhVar));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                org.telegram.ui.Components.zc0 zc0Var = (org.telegram.ui.Components.zc0) arrayList.get(i13);
                if (z10) {
                    int size = arrayList.size() - 1;
                }
                zc0Var.m(z11, i10, i11, null);
            }
            org.telegram.messenger.uz.C = true;
            e90 e90Var = new e90(this);
            this.A0.f24711b.setDelegate(e90Var);
            int size2 = arrayList.size();
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((org.telegram.ui.Components.zc0) obj).setDelegate(e90Var);
            }
            try {
                org.telegram.messenger.pt.t(org.telegram.messenger.e20.f15506s0).Y();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void L0(int i10, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f7;
        if (this.C0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, frameLayout, null);
            int i11 = org.telegram.messenger.i0.f16166m;
            if (i11 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i11));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(2131231643);
            linearLayout.addView(imageView, w7.b6.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.messenger.m5.m(textView, i12, null, 1, 17.0f);
            textView.setText(org.telegram.messenger.dd.L0(2131746797, null));
            linearLayout.addView(textView, w7.b6.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f29844a = textView2;
            org.telegram.ui.ActionBar.a7.V(textView2, i12, null);
            org.telegram.ui.ActionBar.a7.H(textView2, org.telegram.ui.ActionBar.t6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.e0(false));
            textView2.setGravity(51);
            textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
            linearLayout.addView(textView2, w7.b6.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f7 = 4.0f;
            scrollView.setPadding(org.telegram.messenger.i0.L(24.0f), i11, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, w7.b6.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(org.telegram.messenger.dd.L0(2131751605, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            int i13 = org.telegram.ui.ActionBar.t6.f21312y6;
            org.telegram.ui.ActionBar.a7.V(textView3, i13, null);
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.y J0 = org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i13, 25);
            textView3.setBackground(J0);
            org.telegram.ui.ActionBar.a7.k(textView3, J0, null, h, null);
            textView3.setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(10.0f));
            frameLayout.addView(textView3, w7.b6.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    qz0 qz0Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String L0 = org.telegram.messenger.dd.L0(2131744223, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.R = L0;
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751603, null), new oz0(qz0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131753756, null), null);
                            x1Var.T = org.telegram.messenger.dd.L0(2131744000, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (qz0Var.f29846c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String L02 = org.telegram.messenger.dd.L0(2131744003, null);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                                x1Var2.R = L02;
                                alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131754306, null), new oz0(qz0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                x1Var2.T = org.telegram.messenger.dd.a0("TosAgeText", null, 2131744004, org.telegram.messenger.dd.G(qz0Var.f29846c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            qz0Var.a();
                            return;
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(org.telegram.messenger.dd.L0(2131754717, null));
            textView4.setGravity(17);
            textView4.setTypeface(org.telegram.messenger.i0.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = org.telegram.messenger.i0.L(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            frameLayout.addView(textView4, w7.b6.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    qz0 qz0Var = frameLayout;
                    switch (i14) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String L0 = org.telegram.messenger.dd.L0(2131744223, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.R = L0;
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751603, null), new oz0(qz0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131753756, null), null);
                            x1Var.T = org.telegram.messenger.dd.L0(2131744000, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (qz0Var.f29846c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String L02 = org.telegram.messenger.dd.L0(2131744003, null);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                                x1Var2.R = L02;
                                alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131754306, null), new oz0(qz0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                x1Var2.T = org.telegram.messenger.dd.a0("TosAgeText", null, 2131744004, org.telegram.messenger.dd.G(qz0Var.f29846c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            qz0Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view2, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.C0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.f33402z0.addView(this.C0, w7.b6.c(-1.0f, -1));
            this.C0.setDelegate(new n90(this));
        } else {
            f7 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = org.telegram.messenger.e20.i(i10).Z;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f19851id.data.equals(tL_help_termsOfService.f19851id.data))) {
            org.telegram.messenger.e20.i(i10).Z = tL_help_termsOfService;
            org.telegram.messenger.e20.i(i10).v(false);
        }
        org.telegram.ui.Components.qz0 qz0Var = this.C0;
        if (qz0Var.getVisibility() != 0) {
            qz0Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        org.telegram.messenger.kj.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = org.telegram.messenger.i0.L(10.0f);
        int L3 = org.telegram.messenger.i0.L(f7);
        int length = spannableStringBuilder.length() - 2;
        for (int i14 = 0; i14 < length; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == '-') {
                    int i16 = i14 + 2;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        org.telegram.ui.Components.ia iaVar = new org.telegram.ui.Components.ia(L2, L3);
                        spannableStringBuilder.replace(i15, i14 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(iaVar, i15, i16, 33);
                    }
                }
            }
        }
        qz0Var.f29844a.setText(spannableStringBuilder);
        qz0Var.f29846c = tL_help_termsOfService;
        qz0Var.d = i10;
        this.C0.animate().alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.messenger.i0.F).setListener(null).start();
    }

    public final org.telegram.ui.ActionBar.z4 M() {
        ActionBarLayout actionBarLayout = this.f33384q0;
        ArrayList arrayList = this.P;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.z4) i0.a.g(1, arrayList);
        }
        return actionBarLayout;
    }

    public final void M0(int i10, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        if (this.D0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
            frameLayout.f29070x = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.x0(null, i11, false), 0});
            frameLayout.f29071y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.t6.x0(null, i11, false), 0});
            org.telegram.ui.ActionBar.a7.i(i11, frameLayout, null);
            int i12 = (int) (org.telegram.messenger.i0.f16166m / org.telegram.messenger.i0.f16171p);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.L(176.0f) + org.telegram.messenger.i0.f16166m));
            ?? imageView = new ImageView(this);
            imageView.f(2131624165, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().K(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, org.telegram.messenger.i0.L(14.0f));
            frameLayout2.addView((View) imageView, w7.b6.d(-2, -2.0f, 17, 0.0f, i12, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.n9(frameLayout));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f29065f = scrollView;
            org.telegram.messenger.i0.y3(scrollView, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21207s8, false));
            scrollView.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, w7.b6.d(-1, -1.0f, 51, 27.0f, i12 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i13 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(textView, i13, null);
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(org.telegram.messenger.dd.L0(2131743842, null));
            frameLayout3.addView(textView, w7.b6.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f29062a = textView2;
            org.telegram.ui.ActionBar.a7.V(textView2, i13, null);
            org.telegram.ui.ActionBar.a7.H(textView2, org.telegram.ui.ActionBar.t6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.e0(false));
            textView2.setGravity(49);
            textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
            frameLayout3.addView(textView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            jg.l0 l0Var = new jg.l0(this, 11);
            frameLayout.d = l0Var;
            l0Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            l0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
            l0Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            frameLayout.addView(l0Var, w7.b6.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            l0Var.setOnClickListener(new org.telegram.ui.Components.n9(frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f29063b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            l0Var.addView(textView3, w7.b6.e(-2, -2, 17));
            jg.l0 l0Var2 = new jg.l0(frameLayout, this, 12);
            frameLayout.f29064c = l0Var2;
            l0Var2.setWillNotDraw(false);
            l0Var2.setAlpha(0.0f);
            l0Var2.setScaleX(0.1f);
            l0Var2.setScaleY(0.1f);
            l0Var2.setVisibility(4);
            org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(l0Var2);
            frameLayout.e = gi0Var;
            gi0Var.d(null, true, false);
            gi0Var.f26452o = -1;
            l0Var.addView(l0Var2, w7.b6.e(36, 36, 17));
            this.D0 = frameLayout;
            this.f33402z0.addView((View) frameLayout, w7.b6.c(-1.0f, -1));
        }
        org.telegram.ui.Components.o9 o9Var = this.D0;
        TextView textView4 = o9Var.f29063b;
        o9Var.f29069w = 0;
        o9Var.f29066n = tL_help_appUpdate;
        o9Var.f29068s = i10;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            o9Var.f29067r = org.telegram.messenger.b8.r(null, document);
        }
        if (o9Var.getVisibility() != 0) {
            o9Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        org.telegram.messenger.kj.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
        o9Var.f29062a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            textView4.setText(org.telegram.messenger.dd.L0(2131743848, null) + String.format(Locale.US, " (%1$s)", org.telegram.messenger.i0.i0(tL_help_appUpdate.document.size, false, false)));
        } else {
            textView4.setText(org.telegram.messenger.dd.L0(2131743848, null));
        }
        org.telegram.messenger.at.f(o9Var.f29068s).c(o9Var, org.telegram.messenger.at.Y1);
        org.telegram.messenger.at.f(o9Var.f29068s).c(o9Var, org.telegram.messenger.at.Z1);
        org.telegram.messenger.at.f(o9Var.f29068s).c(o9Var, org.telegram.messenger.at.X1);
        if (z10) {
            org.telegram.messenger.w0.u();
        }
    }

    public final org.telegram.ui.ActionBar.i3 N() {
        ActionBarLayout actionBarLayout = this.f33388s0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f33388s0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.f33384q0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.f33384q0.getBottomSheetTabs();
        }
        return null;
    }

    public final void N0(int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.f33360d0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.k2 k2Var = this.f33384q0.getFragmentStack().get(this.f33384q0.getFragmentStack().size() - 1);
            if (k2Var instanceof of0) {
                k2Var = ((of0) k2Var).c0();
            }
            UndoView undoView = null;
            if (k2Var instanceof un) {
                un unVar = (un) k2Var;
                if (chat != null && unVar.a() == (-chat.f19794id)) {
                    chat = null;
                }
                unVar.c8();
                undoView = unVar.M3;
            } else if (k2Var instanceof zx) {
                undoView = ((zx) k2Var).k4();
            } else if (k2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) k2Var).L;
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
    public final boolean O(org.telegram.ui.zx r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.O(org.telegram.ui.zx):boolean");
    }

    public final void O0(int i10) {
        P0(i10, new org.telegram.ui.Components.a21(16));
    }

    public final org.telegram.ui.ActionBar.k2 P() {
        if (gf0.s1(this.O, false).getInt("currentViewNum", 0) != 0) {
            return new gf0();
        }
        return new r60();
    }

    public final void P0(int i10, org.telegram.messenger.m9 m9Var) {
        if (i10 != org.telegram.messenger.e20.f15506s0 && org.telegram.messenger.e20.r(i10)) {
            this.f33377m1 = true;
            ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
            org.telegram.messenger.e20.f15506s0 = i10;
            org.telegram.messenger.e20.i(0).v(false);
            A();
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14690c4, Integer.valueOf(i10));
            if (org.telegram.messenger.i0.Q1()) {
                this.f33386r0.Z();
                this.f33388s0.Z();
                if (!this.O0) {
                    if (this.f33388s0.getFragmentStack().isEmpty()) {
                        this.f33394v0.setVisibility(0);
                    }
                    this.f33388s0.getView().setVisibility(8);
                }
                this.f33386r0.getView().setVisibility(8);
            }
            this.f33384q0.Z();
            this.f33384q0.c(-3, (of0) m9Var.l(null));
            this.f33384q0.W(true, true);
            if (org.telegram.messenger.i0.Q1()) {
                this.f33386r0.W(true, true);
                this.f33388s0.W(true, true);
            }
            if (!org.telegram.messenger.w0.f18952x) {
                ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
            }
            if (org.telegram.messenger.e20.i(i10).Z != null) {
                L0(i10, org.telegram.messenger.e20.i(i10).Z);
            }
            Q0();
            this.f33377m1 = false;
        }
    }

    public final void Q0() {
        int i10;
        String str;
        if (this.f33384q0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.O).getConnectionState();
            this.f33358c0 = connectionState;
            p70 p70Var = null;
            if (connectionState == 2) {
                str = "WaitingForNetwork";
                i10 = 2131743238;
            } else if (connectionState == 5) {
                str = "Updating";
                i10 = 2131743836;
            } else if (connectionState == 4) {
                str = "ConnectingToProxyWithDots";
                i10 = 2131751805;
            } else if (connectionState == 1) {
                str = "Connecting";
                i10 = 2131751809;
            } else {
                i10 = 0;
                str = null;
            }
            if (connectionState == 1 || connectionState == 4) {
                p70Var = new p70(this, 9);
            }
            ActionBarLayout actionBarLayout = this.f33384q0;
            actionBarLayout.M0 = str;
            actionBarLayout.N0 = i10;
            actionBarLayout.O0 = p70Var;
            for (int i11 = 0; i11 < actionBarLayout.U0.size(); i11++) {
                ((org.telegram.ui.ActionBar.k2) actionBarLayout.U0.get(i11)).setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, p70Var);
            }
        }
    }

    public final int R() {
        return this.f33360d0.size();
    }

    public final hh.e S() {
        return this.f33369h1;
    }

    public final boolean W(android.content.Intent r123, boolean r124, boolean r125, boolean r126, gf.e r127, boolean r128, boolean r129) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.W(android.content.Intent, boolean, boolean, boolean, gf.e, boolean, boolean):boolean");
    }

    public final void X() {
        ActionMode actionMode = this.f33374k0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Y(int i10, TLRPC.User user, String str, gf.e eVar) {
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = r12.p1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new a3.b(1), new i70(this, eVar, r12, i10, user));
    }

    @Override
    public final void a(float f7) {
        if (h4.G() && h4.v().V) {
            h4 v = h4.v();
            v.Q();
            h4.e0(v);
            if (v.f37677f0 != null) {
                v.f37691u0[0].f39061b.g1();
                v.f37691u0[1].f39061b.g1();
                v.f37677f0.invalidate();
                v.f37687q0.invalidate();
                if (f7 == 1.0f) {
                    v.f37691u0[0].f39062c.f();
                    v.f37691u0[1].f39062c.f();
                }
            }
        }
        if (PhotoViewer.F1()) {
            PhotoViewer.v1().x3();
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.a0():void");
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.i0.Q1() && actionBarLayout == this.f33386r0) {
            this.f33388s0.W(z10, z10);
            this.f33384q0.W(z10, z10);
        }
    }

    public final void c0() {
        org.telegram.ui.ActionBar.z4[] z4VarArr = {this.f33384q0, this.f33386r0, this.f33388s0};
        for (int i10 = 0; i10 < 3; i10++) {
            org.telegram.ui.ActionBar.z4 z4Var = z4VarArr[i10];
            if (z4Var instanceof ActionBarLayout) {
                ((ActionBarLayout) z4Var).D();
            }
        }
    }

    public final boolean d0(boolean z10) {
        boolean z11;
        fg.l lVar = v7.h7.f50479a;
        if (lVar != null) {
            if (lVar.f7092s) {
                if (z10) {
                    lVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.bd0 bd0Var = this.A0;
        if (bd0Var != null && bd0Var.f24711b.getVisibility() == 0) {
            if (z10) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.q3 q3Var = this.f33400y0;
            if (q3Var != null && (z11 = q3Var.U)) {
                if (z10 && z11) {
                    q3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.sm0.H;
                if (x1Var != null) {
                    if (z10) {
                        x1Var.dismiss();
                        org.telegram.ui.Components.sm0.H = null;
                        return false;
                    }
                } else if (kt.f38972g0 != null && kt.p().E) {
                    if (z10) {
                        kt.p().n();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f34023s) {
                    if (z10) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                    if (z10) {
                        PhotoViewer.v1().H0(true, false);
                        return false;
                    }
                } else if (!h4.G() || !h4.v().V) {
                    return true;
                } else {
                    if (z10) {
                        h4.v().m(true, false);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int r20, int r21, java.lang.Object... r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void e0() {
        HashSet hashSet;
        m4 m4Var = this.f33355a1;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.f33355a1 = null;
        }
        if (!this.Q) {
            this.Q = true;
            xa.n nVar = this.f33379n1;
            if (nVar != null) {
                nVar.a();
                this.f33379n1 = null;
            }
            xa.n nVar2 = this.f33381o1;
            if (nVar2 != null) {
                nVar2.a();
                this.f33381o1 = null;
            }
            u80 u80Var = this.f33385q1;
            if (u80Var != null && (hashSet = org.telegram.messenger.tc.f18247n) != null) {
                hashSet.remove(u80Var);
            }
        }
    }

    public final void f0(Intent intent, gf.e eVar) {
        super.onNewIntent(intent);
        W(intent, true, false, false, eVar, true, false);
    }

    public final void g0() {
        if (this.f33355a1 != null) {
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.f8.b("cancel lockRunnable onPasscodePause");
            }
            org.telegram.messenger.i0.r(this.f33355a1);
            this.f33355a1 = null;
        }
        if (org.telegram.messenger.uz.f18549s.length() != 0) {
            org.telegram.messenger.uz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var = new m4(this, 10);
            this.f33355a1 = m4Var;
            if (org.telegram.messenger.uz.f18563x) {
                org.telegram.messenger.i0.h3(m4Var, 1000L);
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.f8.b("schedule app lock in 1000");
                }
            } else if (org.telegram.messenger.uz.f18566y != 0) {
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.f8.b("schedule app lock in " + ((org.telegram.messenger.uz.f18566y * 1000) + 1000));
                }
                org.telegram.messenger.i0.h3(this.f33355a1, (org.telegram.messenger.uz.f18566y * 1000) + 1000);
            }
        } else {
            org.telegram.messenger.uz.B = 0;
        }
        org.telegram.messenger.uz.y();
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.k2 k2Var, ActionBarLayout actionBarLayout) {
        boolean z10;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (org.telegram.messenger.i0.Q1()) {
            boolean z11 = k2Var instanceof zx;
            if (!z11 && !(k2Var instanceof of0)) {
                if ((k2Var instanceof un) && !((un) k2Var).c()) {
                    boolean z12 = this.O0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f33388s0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f33394v0.setVisibility(8);
                        this.f33388s0.Z();
                        this.f33388s0.c(-1, k2Var);
                        if (!this.f33386r0.getFragmentStack().isEmpty()) {
                            while (this.f33386r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f33386r0;
                                actionBarLayout4.c0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f33386r0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.f33384q0)) {
                        actionBarLayout2.c(-1, k2Var);
                        if (!this.f33386r0.getFragmentStack().isEmpty()) {
                            while (this.f33386r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f33386r0;
                                actionBarLayout5.c0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f33386r0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f33386r0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            if (org.telegram.messenger.e20.i(i10).p()) {
                                break;
                            }
                            i10++;
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    if ((k2Var instanceof gf0) && i10 == -1) {
                        this.f33394v0.setVisibility(0);
                        this.f33392u0.setBackgroundColor(0);
                    } else {
                        this.f33392u0.setBackgroundColor(2130706432);
                    }
                    this.f33386r0.c(-1, k2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.f33384q0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z11 && !((zx) k2Var).t4()) {
                    z10 = false;
                }
                if (z10) {
                    this.f33384q0.Z();
                    this.f33384q0.c(-1, k2Var);
                    this.f33386r0.Z();
                    this.f33386r0.getView().setVisibility(8);
                    if (!this.O0 && this.f33388s0.getFragmentStack().isEmpty()) {
                        this.f33394v0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.f33355a1 != null) {
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.f8.b("cancel lockRunnable onPasscodeResume");
            }
            org.telegram.messenger.i0.r(this.f33355a1);
            this.f33355a1 = null;
        }
        if (org.telegram.messenger.i0.p2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (org.telegram.messenger.uz.B != 0) {
            org.telegram.messenger.uz.B = 0;
            org.telegram.messenger.uz.y();
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.f8.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        org.telegram.ui.ActionBar.x1 x1Var = this.W0;
        if (x1Var != null) {
            try {
                x1Var.dismiss();
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
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34023s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
            return true;
        } else if (!h4.G() || !h4.v().V) {
            return false;
        } else {
            h4.v().m(true, false);
            return true;
        }
    }

    public final void j0(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.j0(boolean):void");
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.i0.Q1()) {
            if (actionBarLayout == this.f33384q0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.f33377m1) {
                e0();
                finish();
                return false;
            } else if (actionBarLayout == this.f33388s0) {
                if (!this.O0) {
                    this.f33394v0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f33386r0 && this.f33384q0.getFragmentStack().isEmpty() && this.f33386r0.getFragmentStack().size() == 1) {
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
        gf0 gf0Var = new gf0();
        p70 p70Var = new p70(this, 0);
        gf0Var.F = 3;
        gf0Var.f37471a = 12;
        gf0Var.f37477d0 = p70Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f33282a |= 256;
                obj.f33283b = indexOf;
                int i10 = lastIndexOf + 1;
                obj.f33284c = i10;
                valueOf.setSpan(new org.telegram.ui.Components.a01(obj, 0), indexOf, i10, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = valueOf;
            x1Var.T = org.telegram.messenger.dd.L0(2131751202, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752548, null), new qv(11, this, gf0Var));
            i0.a.s(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        t0(gf0Var);
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.w4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.w4):boolean");
    }

    public final void l0(final long j10, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i10, final int i11) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            t0(nb1.J0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = org.telegram.messenger.wp.r1(this.O).g1(-j10);
        tL_channels_getMessages.f19832id.add(num);
        ConnectionsManager.getInstance(this.O).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new a80(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i10, i11));
            }
        });
    }

    public final void m0(int i10, long j10, TLRPC.TL_error tL_error) {
        un unVar = new un(org.telegram.ui.Cells.f1.k(j10, "user_id"));
        t0(unVar);
        org.telegram.messenger.i0.h3(new qq(tL_error, unVar, org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(j10)), 13), 300L);
    }

    public final void n0(int i10, String str, String str2, gf.e eVar) {
        if (eVar != null) {
            eVar.d();
        }
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_importContactToken, new q8(this, eVar, r12, i10, str2, 6));
    }

    public final void o0(int i10, String str, String str2, gf.e eVar) {
        if (eVar != null) {
            eVar.d();
        }
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        r12.c2().a(str, null, new f90(this, r12, eVar, i10, str2, 0));
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f33374k0 == actionMode) {
            this.f33374k0 = null;
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f33384q0;
            org.telegram.ui.ActionBar.l lVar = actionBarLayout.D;
            if (lVar != null) {
                lVar.setVisibility(0);
            }
            actionBarLayout.C0 = false;
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f33388s0;
                org.telegram.ui.ActionBar.l lVar2 = actionBarLayout2.D;
                if (lVar2 != null) {
                    lVar2.setVisibility(0);
                }
                actionBarLayout2.C0 = false;
                ActionBarLayout actionBarLayout3 = this.f33386r0;
                org.telegram.ui.ActionBar.l lVar3 = actionBarLayout3.D;
                if (lVar3 != null) {
                    lVar3.setVisibility(0);
                }
                actionBarLayout3.C0 = false;
            }
        }
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.f33374k0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.f33384q0.s(menu) && org.telegram.messenger.i0.Q1() && !this.f33388s0.s(menu)) {
                this.f33386r0.s(menu);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f33384q0;
            org.telegram.ui.ActionBar.l lVar = actionBarLayout.D;
            if (lVar != null) {
                lVar.setVisibility(8);
            }
            actionBarLayout.C0 = true;
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f33388s0;
                org.telegram.ui.ActionBar.l lVar2 = actionBarLayout2.D;
                if (lVar2 != null) {
                    lVar2.setVisibility(8);
                }
                actionBarLayout2.C0 = true;
                ActionBarLayout actionBarLayout3 = this.f33386r0;
                org.telegram.ui.ActionBar.l lVar3 = actionBarLayout3.D;
                if (lVar3 != null) {
                    lVar3.setVisibility(8);
                }
                actionBarLayout3.C0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        th.z2 currentPeerView;
        bh.d dVar;
        VoIPService sharedInstance;
        boolean z10 = false;
        if (org.telegram.messenger.uz.f18549s.length() != 0 && org.telegram.messenger.uz.B != 0) {
            org.telegram.messenger.uz.B = 0;
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.f8.b("reset lastPauseTime onActivityResult");
            }
            org.telegram.messenger.e20.i(this.O).v(false);
        }
        if (i10 == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.w0.F = canDrawOverlays;
            if (canDrawOverlays) {
                a50 a50Var = a50.f35573u5;
                if (a50Var != null) {
                    a50Var.L();
                }
                org.telegram.messenger.i0.h3(new p70(this, 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i10, i11, intent);
        String str = null;
        if (i10 >= 22336 && i10 <= 22399) {
            org.telegram.ui.Wallet.u0 u0Var = w7.k6.f52636b;
            if (u0Var != null && u0Var.e == this && u0Var.f35263f && u0Var.f35264g == i10) {
                if (i11 != -1) {
                    str = "AUTH_CANCELED";
                }
                u0Var.c(str);
            }
        } else if (i10 == 520) {
            if (i11 == -1 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
                sharedInstance.createCaptureDevice(true);
            }
        } else if (i10 == 140) {
            org.telegram.messenger.od f7 = org.telegram.messenger.od.f(this.O);
            if (i11 == -1) {
                z10 = true;
            }
            Utilities.d.c(new org.telegram.messenger.d20(3, f7, z10));
        } else if (i10 == 521) {
            ag.l lVar = this.f33387r1;
            if (lVar != null) {
                if (i11 == -1) {
                    z10 = true;
                }
                lVar.a(Boolean.valueOf(z10));
                this.f33387r1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f24208p;
            if (themeEditorView != null && (dVar = themeEditorView.f24218m) != null) {
                dVar.y(i10, i11, intent);
            }
            ActionBarLayout actionBarLayout = this.f33384q0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.k2 k2Var = this.f33384q0.getFragmentStack().get(this.f33384q0.getFragmentStack().size() - 1);
                k2Var.onActivityResultFragment(i10, i11, intent);
                if (k2Var.getLastStoryViewer() != null && (currentPeerView = k2Var.getLastStoryViewer().f49333n0.getCurrentPeerView()) != null && i11 == -1) {
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
                                ag.v vVar = currentPeerView.f49767r2;
                                if (vVar != null) {
                                    vVar.dismiss();
                                }
                                currentPeerView.i0(true);
                            }
                        }
                    } else {
                        currentPeerView.r0();
                        ag.v vVar2 = currentPeerView.f49767r2;
                        if (vVar2 != null) {
                            vVar2.a2.h0(i10, intent, null);
                        }
                    }
                }
            }
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f33388s0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f33388s0.getFragmentStack().get(this.f33388s0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f33386r0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f33386r0.getFragmentStack().get(this.f33386r0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
                }
            }
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14691c5, Integer.valueOf(i10), Integer.valueOf(i11), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (d0(true)) {
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout = this.f33386r0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f33386r0.H();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f33388s0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f33388s0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.k2 k2Var = this.f33388s0.getFragmentStack().get(this.f33388s0.getFragmentStack().size() - 1);
                    if (k2Var.onBackPressed(true)) {
                        k2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.f33384q0.H();
                return;
            }
            this.f33384q0.H();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.i0.v(this, configuration);
        this.f33393u1.a();
        org.telegram.messenger.i0.w3(getWindow());
        super.onConfigurationChanged(configuration);
        this.f33378n0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        org.telegram.messenger.i0.c3();
        a0();
        E();
        org.telegram.messenger.i0.g3(new p70(this, 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            int i10 = pipRoundVideoView.f24086y.getInt("sidex", 1);
            int i11 = pipRoundVideoView.f24086y.getInt("sidey", 0);
            float f7 = pipRoundVideoView.f24086y.getFloat("px", 0.0f);
            float f10 = pipRoundVideoView.f24086y.getFloat("py", 0.0f);
            pipRoundVideoView.f24084w.x = PipRoundVideoView.b(f7, i10, pipRoundVideoView.h, true);
            pipRoundVideoView.f24084w.y = PipRoundVideoView.b(f10, i11, pipRoundVideoView.f24081n, false);
            pipRoundVideoView.f24085x.updateViewLayout(pipRoundVideoView.f24077a, pipRoundVideoView.f24084w);
        }
        org.telegram.ui.Components.hu huVar = org.telegram.ui.Components.hu.J1;
        if (huVar != null) {
            huVar.c0(configuration);
        }
        mg.v vVar = mg.v.l1;
        if (vVar != null) {
            vVar.c0(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        ThemeEditorView themeEditorView = ThemeEditorView.f24208p;
        if (themeEditorView != null) {
            int i12 = themeEditorView.f24217l.getInt("sidex", 1);
            int i13 = themeEditorView.f24217l.getInt("sidey", 0);
            float f11 = themeEditorView.f24217l.getFloat("px", 0.0f);
            float f12 = themeEditorView.f24217l.getFloat("py", 0.0f);
            themeEditorView.f24214i.x = ThemeEditorView.c(f11, i12, themeEditorView.f24213g, true);
            themeEditorView.f24214i.y = ThemeEditorView.c(f12, i13, themeEditorView.h, false);
            try {
                if (themeEditorView.f24211c.getParent() != null) {
                    themeEditorView.f24215j.updateViewLayout(themeEditorView.f24211c, themeEditorView.f24214i);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        if (org.telegram.ui.ActionBar.t6.f21128o == 3) {
            org.telegram.ui.ActionBar.t6.F(false);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int i10;
        String str;
        t9.c cVar;
        String str2;
        String str3;
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        E1 = true;
        F1++;
        boolean z10 = org.telegram.messenger.v2.f18578a;
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        I1 = this;
        org.telegram.messenger.w0.w();
        org.telegram.messenger.i0.v(this, getResources().getConfiguration());
        this.O = org.telegram.messenger.e20.f15506s0;
        this.f33367g1 = new androidx.mediarouter.app.f(this, 12);
        IntentFilter intentFilter = new IntentFilter("org.telegram.messenger.DEBUG_THEME");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.f33367g1, intentFilter, 2);
        } else {
            registerReceiver(this.f33367g1, intentFilter);
        }
        if (!org.telegram.messenger.e20.i(this.O).p() && (intent = getIntent()) != null && intent.getAction() != null) {
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
        boolean z11 = false;
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21207s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.v6(1));
        getWindow().setFormat(-1);
        org.telegram.messenger.o6 o6Var = new org.telegram.messenger.o6(getWindow(), new org.telegram.ui.Components.a21(15));
        this.f33365f1 = o6Var;
        o6Var.a();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            org.telegram.messenger.i0.E = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.t6.P();
        org.telegram.ui.ActionBar.t6.T(this);
        if (org.telegram.messenger.uz.f18549s.length() != 0 && org.telegram.messenger.uz.f18563x) {
            org.telegram.messenger.uz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.i0.f16145a;
        this.f33384q0 = new ActionBarLayout(this, true);
        l0 l0Var = new l0(this, this, 12);
        this.f33396w0 = l0Var;
        l0Var.setClipToPadding(false);
        this.f33396w0.setClipChildren(false);
        setContentView(this.f33396w0);
        this.f33369h1 = new hh.e(this.f33396w0);
        t90 t90Var = new t90(this);
        j2.f fVar = this.m0;
        ((jf.c) fVar.f9349b).f9839a.add(t90Var);
        ((ViewGroup) getWindow().getDecorView()).addView(fVar.p());
        fVar.p().bringToFront();
        org.telegram.ui.Components.c11 c11Var = new org.telegram.ui.Components.c11(this);
        this.f33380o0 = c11Var;
        c11Var.setVisibility(8);
        org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(this);
        this.f33402z0 = s3Var;
        s3Var.setActionBarLayout(this.f33384q0);
        this.f33402z0.addOnLayoutChangeListener(new Object());
        this.f33402z0.setClipChildren(false);
        this.f33402z0.setClipToPadding(false);
        this.f33396w0.addView(this.f33402z0, w7.b6.c(-1.0f, -1));
        ag.r rVar = new ag.r(this, 5);
        this.f33382p0 = rVar;
        rVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f33396w0.addView(this.f33382p0, w7.b6.c(48.0f, 48));
        this.f33382p0.setVisibility(8);
        l0 l0Var2 = this.f33396w0;
        org.telegram.ui.ActionBar.q3 q3Var = new org.telegram.ui.ActionBar.q3(this);
        this.f33400y0 = q3Var;
        l0Var2.addView(q3Var);
        l0 l0Var3 = this.f33396w0;
        ?? xzVar = new org.telegram.ui.Components.xz(this);
        xzVar.setVisibility(8);
        this.f33398x0 = xzVar;
        l0Var3.addView(xzVar);
        E0();
        this.f33402z0.setParentActionBarLayout(this.f33384q0);
        this.f33384q0.setDrawerLayoutContainer(this.f33402z0);
        this.f33384q0.setFragmentStack(this.f33360d0);
        this.f33384q0.setFragmentStackChangedListener(new p70(this, 3));
        this.f33384q0.setDelegate(this);
        org.telegram.ui.ActionBar.t6.o1(true);
        A();
        Q0();
        int i11 = org.telegram.messenger.at.f14738k4;
        org.telegram.messenger.at.e().k(i11, this);
        this.f33358c0 = ConnectionsManager.getInstance(this.O).getConnectionState();
        xa.n nVar = this.f33381o1;
        if (nVar != null) {
            nVar.a();
            this.f33381o1 = null;
        }
        xa.n nVar2 = new xa.n(org.telegram.messenger.at.e(), this);
        nVar2.e(org.telegram.messenger.at.M0);
        nVar2.e(org.telegram.messenger.at.f14818x4);
        nVar2.e(org.telegram.messenger.at.f14824y4);
        nVar2.e(org.telegram.messenger.at.f14753n4);
        nVar2.e(org.telegram.messenger.at.f14791t4);
        nVar2.e(org.telegram.messenger.at.f14777r4);
        nVar2.e(i11);
        nVar2.e(org.telegram.messenger.at.f14749n0);
        nVar2.e(org.telegram.messenger.at.f14831z4);
        nVar2.e(org.telegram.messenger.at.K4);
        nVar2.e(org.telegram.messenger.at.P4);
        nVar2.e(org.telegram.messenger.at.f14754n5);
        nVar2.e(org.telegram.messenger.at.f14739k5);
        nVar2.e(org.telegram.messenger.at.M5);
        nVar2.e(org.telegram.messenger.at.N5);
        this.f33381o1 = nVar2;
        u80 u80Var = new u80(this, 0);
        this.f33385q1 = u80Var;
        org.telegram.messenger.tc.a(u80Var);
        if (this.f33384q0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f33386r0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!org.telegram.messenger.e20.i(this.O).p()) {
                this.f33384q0.c(-1, P());
            } else {
                this.f33384q0.c(-1, new of0());
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
                                    this.f33384q0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.f33384q0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    un unVar = new un(bundle2);
                                    if (this.f33384q0.c(-1, unVar)) {
                                        unVar.f42134l8 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    b60 b60Var = new b60(bundle2);
                                    if (this.f33384q0.c(-1, b60Var)) {
                                        b60Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    kd kdVar = new kd(bundle2);
                                    if (this.f33384q0.c(-1, kdVar)) {
                                        kdVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", org.telegram.messenger.e20.i(this.O).f15524n);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.f33384q0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.f33384q0.c(-1, new c51(null));
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        E();
        F(false, true, !this.X0);
        Intent intent2 = getIntent();
        if (bundle != null) {
            z11 = true;
        }
        W(intent2, false, z11, false, null, true, true);
        try {
            String str4 = Build.DISPLAY;
            String str5 = Build.USER;
            if (str4 == null) {
                str2 = "";
            } else {
                str2 = str4.toLowerCase();
            }
            if (str5 == null) {
                str3 = "";
            } else {
                str3 = str2.toLowerCase();
            }
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.f8.b("OS name " + str2 + " " + str3);
            }
            if ((str2.contains("flyme") || str3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                org.telegram.messenger.i0.f16179y = true;
                View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                y80 y80Var = new y80(rootView, 0);
                this.f33366g0 = y80Var;
                viewTreeObserver.addOnGlobalLayoutListener(y80Var);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        MediaController.B().J0 = this;
        ((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).getClass();
        try {
            boolean z12 = org.telegram.messenger.v2.f18578a;
            str = "" + org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).f15524n;
            if (org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).f() != null) {
                String n10 = org.telegram.messenger.i20.n(org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).f());
                if (!TextUtils.isEmpty(n10)) {
                    str = "@" + n10;
                }
            }
            if (ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0).isTestBackend()) {
                str = str + " [TEST SERVER]";
            }
            cVar = (t9.c) l9.h.c().b(t9.c.class);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        if (cVar != null) {
            cVar.d(str);
            cVar.c("version", "public");
            cVar.c("model", Build.MODEL);
            cVar.c("manufacturer", Build.MANUFACTURER);
            if (Build.VERSION.SDK_INT >= 31) {
                cVar.c("soc_model", org.telegram.messenger.e9.f());
                cVar.c("soc_manufacturer", Build.SOC_MANUFACTURER);
            }
            cVar.c("device", Build.DEVICE);
            cVar.c("product", Build.PRODUCT);
            cVar.c("hardware", Build.HARDWARE);
            cVar.c("user", Build.USER);
            cVar.b();
            int i12 = Build.VERSION.SDK_INT;
            org.telegram.messenger.d6.b(true);
            if (i12 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - org.telegram.messenger.d6.f15304i.getLong("last_checked", 0L) >= 86400000 && org.telegram.messenger.d6.f15304i.getInt("dismissed_count", 0) < 3) {
                Pattern pattern = org.telegram.ui.Components.s4.f30174a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                String L0 = org.telegram.messenger.dd.L0(2131754283, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                if (org.telegram.messenger.d6.j()) {
                    if (i12 >= 31) {
                        i10 = 2131754281;
                    } else {
                        i10 = 2131754280;
                    }
                } else {
                    i10 = 2131754282;
                }
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(i10, null));
                int i13 = org.telegram.ui.ActionBar.t6.L5;
                alertDialog$Builder.m(2131624113, 72, org.telegram.ui.ActionBar.t6.x0(null, i13, false), null);
                alertDialog$Builder.n(i13, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747316, null), new org.telegram.ui.Components.y0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751772, null), null);
                x1Var.setOnDismissListener(new jg.z(3));
                x1Var.show();
                org.telegram.messenger.d6.f15304i.edit().putLong("last_checked", System.currentTimeMillis()).apply();
            }
            if (i12 >= 31) {
                getWindow().getDecorView().addOnAttachStateChangeListener(new w90(this));
            }
            org.telegram.ui.Components.wb.a(this.f33396w0, new mg.u(7));
            getWindow().getDecorView().setSystemUiVisibility(1792);
            Window window = getWindow();
            try {
                org.telegram.messenger.i0.S(window);
                if (i12 >= 28) {
                    window.setNavigationBarDividerColor(0);
                }
            } catch (Throwable th3) {
                org.telegram.messenger.f8.g(th3, true);
            }
            BackupAgent.a();
            e01.a0(false);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 34) {
                if (this.f33375k1 == null) {
                    this.f33375k1 = new x90(this);
                }
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f33375k1);
            } else if (i14 >= 33) {
                if (this.l1 == null) {
                    this.l1 = new y90(this);
                }
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.l1);
            }
            B();
            return;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @Override
    public final void onDestroy() {
        rf.v vVar;
        l0 l0Var;
        org.telegram.ui.Wallet.u0 u0Var = w7.k6.f52636b;
        if (u0Var != null && u0Var.e == this) {
            u0Var.c("AUTH_CANCELED");
            w7.k6.f52636b.e();
        }
        E1 = false;
        F1--;
        androidx.mediarouter.app.f fVar = this.f33367g1;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.f33367g1 = null;
        }
        if (F1 == 0) {
            if (PhotoViewer.f33438b9 != null) {
                PhotoViewer.f33438b9.Q0();
            }
            if (PhotoViewer.F1()) {
                PhotoViewer.v1().Q0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f7 = SecretMediaViewer.f();
                Runnable runnable = f7.f34013n1;
                if (runnable != null) {
                    runnable.run();
                    f7.f34013n1 = null;
                }
                z90 z90Var = f7.f34006j1;
                if (z90Var != null) {
                    z90Var.b();
                    f7.f34006j1 = null;
                }
                org.telegram.messenger.at.f(f7.f33983a).n(f7, org.telegram.messenger.at.f14806w);
                org.telegram.messenger.at.f(f7.f33983a).n(f7, org.telegram.messenger.at.f14740l0);
                org.telegram.messenger.at.f(f7.f33983a).n(f7, org.telegram.messenger.at.f14722i0);
                f7.f34023s = false;
                f7.L = null;
                org.telegram.messenger.lc lcVar = f7.f33999g0;
                if (lcVar != null) {
                    lcVar.a();
                    f7.f33999g0 = null;
                }
                f7.j();
                if (f7.f33986b != null && (l0Var = f7.d) != null) {
                    try {
                        if (l0Var.getParent() != null) {
                            ((WindowManager) f7.f33986b.getSystemService("window")).removeViewImmediate(f7.d);
                        }
                        f7.d = null;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                SecretMediaViewer.f33982v1 = null;
            }
            if (h4.G()) {
                h4.v().r();
            }
            if (kt.f38972g0 != null) {
                kt p5 = kt.p();
                p5.E = false;
                p5.f38986l = null;
                p5.W = null;
                p5.Y = null;
                p5.f38974a0 = null;
                if (p5.f38996w != null && p5.f38998y != null) {
                    Bitmap bitmap = p5.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        p5.v = null;
                    }
                    p5.M = 0.0f;
                    p5.K = false;
                    try {
                        if (p5.f38998y.getParent() != null) {
                            ((WindowManager) p5.f38996w.getSystemService("window")).removeViewImmediate(p5.f38998y);
                        }
                        p5.f38998y = null;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                    kt.f38972g0 = null;
                    org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14735k1, 8);
                }
            }
            a50 a50Var = a50.f35573u5;
            if (a50Var != null) {
                a50Var.L();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i10 = org.telegram.ui.ActionBar.t6.f20866a;
            org.telegram.ui.Components.hu huVar = org.telegram.ui.Components.hu.J1;
            if (huVar != null) {
                huVar.I0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f24208p;
            if (themeEditorView != null) {
                themeEditorView.b();
            }
            fg.l lVar = v7.h7.f50479a;
            if (lVar != null) {
                lVar.e.edit().putFloat("x", (float) lVar.f7088c.f13958m.f13965i).putFloat("y", (float) lVar.d.f13958m.f13965i).commit();
            }
            v7.h7.f50479a = null;
            SparseArray sparseArray = org.telegram.ui.Components.f5.f26057r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController B = MediaController.B();
        if (B.J0 == this) {
            B.J0 = null;
        }
        MediaController B2 = MediaController.B();
        if (B2.K0 == this.f33391t1) {
            B2.K0 = null;
        }
        for (int i11 = 0; i11 < this.E0.size(); i11++) {
            try {
                if (((Dialog) this.E0.get(i11)).isShowing()) {
                    ((Dialog) this.E0.get(i11)).dismiss();
                }
            } catch (Exception e10) {
                org.telegram.messenger.f8.g(e10, true);
            }
        }
        this.E0.clear();
        try {
            if (this.f33366g0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f33366g0);
            }
        } catch (Exception e11) {
            org.telegram.messenger.f8.g(e11, true);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (this.f33375k1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f33375k1);
            }
        } else if (i12 >= 33 && this.f33375k1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.l1);
        }
        org.telegram.ui.Components.wb.h(this.f33396w0);
        VideoAds.dropCache();
        I();
        super.onDestroy();
        e0();
        org.telegram.messenger.o6 o6Var = this.f33365f1;
        if (o6Var != null) {
            o6Var.e();
        }
        if (i12 >= 24 && (vVar = this.f33373j1) != null) {
            vVar.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 82 && !org.telegram.messenger.uz.C) {
            if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (h4.G() && h4.v().V) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (org.telegram.messenger.i0.Q1()) {
                if (this.f33386r0.getView().getVisibility() == 0 && !this.f33386r0.getFragmentStack().isEmpty()) {
                    this.f33386r0.getView().onKeyUp(i10, keyEvent);
                } else if (this.f33388s0.getView().getVisibility() == 0 && !this.f33388s0.getFragmentStack().isEmpty()) {
                    this.f33388s0.getView().onKeyUp(i10, keyEvent);
                } else {
                    this.f33384q0.getView().onKeyUp(i10, keyEvent);
                }
            } else {
                this.f33384q0.getView().onKeyUp(i10, keyEvent);
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.f33384q0;
        if (actionBarLayout != null) {
            actionBarLayout.L();
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f33388s0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.L();
                }
                ActionBarLayout actionBarLayout3 = this.f33386r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.L();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z10) {
        org.telegram.messenger.i0.E = z10;
        this.f33393u1.a();
        E();
        super.onMultiWindowModeChanged(z10);
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        W(intent, true, false, false, null, true, true);
    }

    @Override
    public final void onPause() {
        boolean z10;
        VoIPService sharedInstance;
        super.onPause();
        G1 = false;
        org.telegram.utils.twidget.p.q(true);
        jf.c cVar = this.f33378n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (org.telegram.messenger.i0.H1(cVar.d) && cVar.e() && Build.VERSION.SDK_INT >= 31) {
            cVar.b();
        }
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14729j1, 4096);
        org.telegram.messenger.w0.f18952x = true;
        Utilities.d.c(new org.telegram.messenger.xd(this.O, 10));
        g0();
        this.f33384q0.N();
        if (org.telegram.messenger.i0.Q1()) {
            ActionBarLayout actionBarLayout = this.f33388s0;
            if (actionBarLayout != null) {
                actionBarLayout.N();
            }
            ActionBarLayout actionBarLayout2 = this.f33386r0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.N();
            }
        }
        org.telegram.ui.Components.bd0 bd0Var = this.A0;
        if (bd0Var != null) {
            bd0Var.f24711b.k();
        }
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.zc0) obj).k();
        }
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.f18944a;
        ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            if (v12.f33523j2 != null) {
                v12.H0(false, false);
            } else {
                org.telegram.ui.Components.v61 v61Var = v12.F2;
                if (v61Var != null && v12.Z2) {
                    v61Var.s0(org.telegram.messenger.i0.H1(v12.D));
                }
            }
        }
        vh.o8 o8Var = vh.o8.F2;
        if (o8Var != null) {
            o8Var.u(false);
            vh.e8 e8Var = o8Var.f51628c1;
            if (e8Var != null) {
                e8Var.f51355f.r();
            }
            vh.d8 d8Var = o8Var.X0;
            if (d8Var != null) {
                d8Var.x(0, true);
            }
        }
        zd1 zd1Var = zd1.f43934n1;
        if (zd1Var != null) {
            boolean isInteractive = ((PowerManager) zd1Var.f43938b.getSystemService("power")).isInteractive();
            int a2 = mf.b.a(zd1Var.f43938b);
            if (a2 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zd1Var.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a2 == 2) {
                int measuredHeight = zd1.f43934n1.f43973u0.getMeasuredHeight();
                zd1 zd1Var2 = zd1.f43934n1;
                org.telegram.ui.Components.voip.u1.e(zd1Var2.f43938b, zd1Var2.f43935a, zd1Var2.f43973u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = zd1.f43934n1.f43969r0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.u1.X = windowInsets.getSystemWindowInsetTop();
                    zd1.f43934n1.f43969r0.getSystemWindowInsetBottom();
                }
            }
            if (zd1Var.f43964n0 && ((!z10 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                org.telegram.ui.Components.voip.u1 d = org.telegram.ui.Components.voip.u1.d();
                if (d.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (d.G) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = nh.h.f13829n;
        if (hashMap != null) {
            for (nh.h hVar : hashMap.values()) {
                nh.g gVar = hVar.f13833f;
                if (gVar != null) {
                    gVar.f13820b = true;
                }
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        jf.c cVar = this.f33378n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (cVar.f9842f) {
            if (z10) {
                cVar.d(1.0f);
                cVar.f9845j.a();
                ArrayList arrayList = cVar.f9840b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((lf.e) obj).getClass();
                }
                if (cVar.f9849n) {
                    cVar.f9849n = false;
                    cVar.f9847l.removeFrameCallback(cVar.f9848m);
                }
                ArrayList arrayList2 = cVar.f9839a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((kf.b) obj2).f();
                }
            } else if (cVar.e) {
                cVar.c(false);
            } else {
                cVar.a(true);
            }
        }
        if (!z10 && !this.f33389s1) {
            if (org.telegram.ui.Components.voip.t0.f31724d0.V) {
                org.telegram.ui.Components.voip.t0.b();
            }
            if (th.w0.Z.S) {
                th.w0.b();
            }
            if (org.telegram.ui.Components.jf0.f27400p0.P) {
                org.telegram.ui.Components.jf0.b(false);
            }
            a50.v1(this, null, false, true);
            if (PhotoViewer.f33438b9 != null) {
                PhotoViewer.f33438b9.Q0();
            }
            if (PhotoViewer.F1()) {
                PhotoViewer.v1().H0(false, false);
            }
        }
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        jf.c cVar = this.f33378n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        cVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.f33378n0.g(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        org.telegram.utils.twidget.v vVar;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (!u(i10, strArr, iArr)) {
            return;
        }
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.f18944a;
        if (this.f33384q0.getFragmentStack().size() != 0) {
            this.f33384q0.getFragmentStack().get(this.f33384q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
        if (org.telegram.messenger.i0.Q1()) {
            if (this.f33388s0.getFragmentStack().size() != 0) {
                this.f33388s0.getFragmentStack().get(this.f33388s0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
            }
            if (this.f33386r0.getFragmentStack().size() != 0) {
                this.f33386r0.getFragmentStack().get(this.f33386r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
            }
        }
        zd1.k(iArr, i10);
        vh.o8 o8Var = vh.o8.F2;
        if (o8Var != null) {
            th.b bVar = o8Var.f51619a;
            Activity activity = o8Var.f51622b;
            if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 == 111) {
                o8Var.f51679s2 = !z10;
                if (z10 && o8Var.f51637f0 == 0) {
                    o8Var.A0.setCameraThumb(null);
                    if (CameraController.getInstance().isCameraInitied()) {
                        o8Var.q();
                    } else {
                        CameraController.getInstance().initCamera(new vh.y6(o8Var, 0));
                    }
                }
            } else if (i10 == 114) {
                if (z10) {
                    MediaController.O(0);
                    o8Var.e(true);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                    int i11 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131747315, null));
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.T = W2;
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747316, null), new vh.f7(o8Var, 2));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751772, null), null);
                    x1Var.show();
                }
            } else if (i10 == 112) {
                if (!z10) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, activity, bVar);
                    int i12 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder2.m(2131624114, 72, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
                    alertDialog$Builder2.n(i12, null);
                    SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131747325, null));
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    x1Var2.T = W22;
                    alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747316, null), new vh.f7(o8Var, 3));
                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131751772, null), null);
                    x1Var2.show();
                }
            } else if (i10 == 115) {
                if (!z10) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, activity, bVar);
                    int i13 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder3.m(2131624116, 72, org.telegram.ui.ActionBar.t6.x0(null, i13, false), null);
                    alertDialog$Builder3.n(i13, null);
                    SpannableStringBuilder W23 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131747329, null));
                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20135a;
                    x1Var3.T = W23;
                    alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131747316, null), new vh.f7(o8Var, 5));
                    alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131751772, null), null);
                    x1Var3.show();
                }
                if (z10 && (vVar = o8Var.f51700y2) != null) {
                    vVar.run();
                }
                o8Var.f51700y2 = null;
            }
        }
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14697d5, Integer.valueOf(i10), strArr, iArr);
        SparseIntArray sparseIntArray = this.f33359c1;
        if (sparseIntArray.get(i10, -1) >= 0) {
            int i14 = sparseIntArray.get(i10, -1);
            sparseIntArray.delete(i10);
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14760o5, Integer.valueOf(i14));
        }
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.p5, Integer.valueOf(i10), strArr, iArr);
    }

    @Override
    public final void onResume() {
        org.telegram.messenger.kj kjVar;
        ig.a1 a1Var;
        org.telegram.messenger.xe xeVar;
        super.onResume();
        org.telegram.utils.twidget.p.q(false);
        G1 = true;
        jf.c cVar = this.f33378n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (cVar.f9842f) {
            cVar.a(false);
        }
        org.telegram.ui.Components.zt ztVar = H1;
        if (ztVar != null) {
            ztVar.run();
            H1 = null;
        }
        if (org.telegram.ui.ActionBar.t6.f21128o == 3) {
            org.telegram.ui.ActionBar.t6.F(false);
        }
        org.telegram.messenger.od[] odVarArr = org.telegram.messenger.od.O;
        int i10 = 0;
        while (true) {
            if (i10 >= 4) {
                break;
            } else if (org.telegram.messenger.e20.i(i10).p() && !org.telegram.messenger.od.f(i10).I.isEmpty()) {
                org.telegram.messenger.od.q();
                break;
            } else {
                i10++;
            }
        }
        G(true);
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14735k1, 4096);
        MediaController B = MediaController.B();
        ViewGroup view = this.f33384q0.getView();
        this.f33391t1 = view;
        B.K0 = view;
        org.telegram.messenger.w0.f18952x = false;
        org.telegram.messenger.wp.r1(this.O).Q4(null);
        I0();
        Utilities.d.c(new org.telegram.ui.Components.voip.n0(7));
        C(0);
        if (Build.VERSION.SDK_INT >= 24 && (xeVar = MediaController.Z1) != null) {
            Utilities.e.d(new org.telegram.messenger.xd(xeVar.e.size(), 1), 2000L);
        }
        h0();
        org.telegram.ui.Components.bd0 bd0Var = this.A0;
        if (bd0Var != null && bd0Var.f24711b.getVisibility() == 0) {
            this.f33384q0.n();
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout = this.f33388s0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f33386r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.A0.f24711b.l();
            ArrayList arrayList = this.B0;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((org.telegram.ui.Components.zc0) obj).l();
            }
        } else {
            this.f33384q0.O();
            if (org.telegram.messenger.i0.Q1()) {
                ActionBarLayout actionBarLayout3 = this.f33388s0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.O();
                }
                ActionBarLayout actionBarLayout4 = this.f33386r0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.O();
                }
            }
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
        Q0();
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            zr0 zr0Var = v12.f33477e0;
            if (zr0Var != null) {
                zr0Var.invalidate();
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.qq(v12, 0, 17), 100L);
            }
            org.telegram.ui.Components.v61 v61Var = v12.F2;
            if (v61Var != null) {
                v61Var.p0(v61Var.S() + 1);
                if (v12.Z2) {
                    v12.F2.s0(true);
                }
            }
            cr0 cr0Var = v12.L1;
            if (cr0Var != null && (a1Var = cr0Var.F0.d) != null) {
                a1Var.postRunnable(a1Var.f8277x);
            }
        }
        vh.o8 o8Var = vh.o8.F2;
        if (o8Var != null) {
            o8Var.O();
        }
        if (PipRoundVideoView.F != null && MediaController.B().H() && (kjVar = MediaController.B().f14483u0) != null) {
            MediaController.B().i0(kjVar, kjVar.f16652b0);
        }
        if (org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).Z != null) {
            int i12 = org.telegram.messenger.e20.f15506s0;
            L0(i12, org.telegram.messenger.e20.i(i12).Z);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.uz.f18526j1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(org.telegram.messenger.e20.f15506s0, tL_help_appUpdate, true);
            }
        }
        y(false);
        org.telegram.messenger.w0.F = Settings.canDrawOverlays(this);
        zd1 zd1Var = zd1.f43934n1;
        if (zd1Var != null) {
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                org.telegram.ui.Components.voip.u1.a();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                zd1Var.G();
            } else if (VoIPService.getSharedState() == null) {
                zd1Var.f43973u0.b();
            }
            zd1Var.J0 = ((KeyguardManager) zd1Var.f43938b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                org.telegram.ui.Components.voip.u1.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        a0();
        HashMap hashMap = nh.h.f13829n;
        if (hashMap != null) {
            for (nh.h hVar : hashMap.values()) {
                nh.g gVar = hVar.f13833f;
                if (gVar != null) {
                    gVar.f13820b = false;
                }
            }
        }
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.f18944a;
        y yVar = K1;
        if (yVar != null) {
            yVar.run();
            K1 = null;
        }
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.O);
        if (!r12.U3.contains("SETUP_LOGIN_EMAIL") && !r12.U3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            return;
        }
        Utilities.d.c(new org.telegram.messenger.ak(org.telegram.messenger.wp.r1(this.O), 25));
    }

    @Override
    public final void onSaveInstanceState(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override
    public final void onStart() {
        Activity activity;
        super.onStart();
        this.f33389s1 = true;
        this.f33378n0.h();
        WeakReference weakReference = gf.f.e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            gf.f.w(activity);
        }
        if (gf.f.f7489b == null) {
            gf.f.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(gf.f.d)) {
                    String a2 = w7.u6.a(this);
                    gf.f.d = a2;
                    if (a2 == null) {
                    }
                }
                Object obj = new Object();
                a9.d dVar = new a9.d();
                dVar.f322b = new WeakReference(obj);
                gf.f.f7490c = dVar;
                String str = gf.f.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, dVar, 33)) {
                    gf.f.f7490c = null;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        org.telegram.messenger.w0.f18953y = false;
        org.telegram.ui.Components.g20.j(this);
        a50 a50Var = a50.f35573u5;
        if (a50Var != null) {
            ArrayList arrayList = a50Var.Q3;
            a50.f35578z5 = false;
            a50Var.G1.f();
            t20 t20Var = a50Var.f35592d4;
            if (t20Var.getVisibility() == 0) {
                a50Var.f35604g4.G(t20Var, false);
            }
            if (a50.f35576x5) {
                a50Var.f35600f4.I(a50Var.f35596e4, false);
            }
            arrayList.clear();
            arrayList.addAll(a50Var.P3);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
            }
            f40 f40Var = a50Var.C1;
            org.telegram.ui.Components.a81 a81Var = f40Var.f31920w;
            if (a81Var != null) {
                a81Var.c(true);
            }
            f40Var.F = false;
            a50Var.f35683y1.s();
        }
    }

    @Override
    public final void onStop() {
        lr0 lr0Var;
        super.onStop();
        org.telegram.ui.Wallet.u0 u0Var = w7.k6.f52636b;
        if (u0Var != null && u0Var.e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.u0 u0Var2 = w7.k6.f52636b;
            if (!u0Var2.f35263f) {
                u0Var2.c("AUTH_CANCELED");
                w7.k6.f52636b.e();
            }
        }
        this.f33389s1 = false;
        jf.c cVar = this.f33378n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        cVar.e = false;
        if (cVar.f9842f) {
            cVar.c(true);
        }
        cVar.d.unregisterReceiver(cVar.f9850o);
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            if (!org.telegram.messenger.i0.H1(v12.D) && (v12.F2 == null ? !((lr0Var = v12.f33486f0) == null || !lr0Var.f31278y || !lr0Var.G) : v12.P3)) {
                v12.k2();
            }
        }
        gf.f.w(this);
        org.telegram.messenger.w0.f18953y = true;
        org.telegram.ui.Components.g20.j(this);
        a50 a50Var = a50.f35573u5;
        if (a50Var != null) {
            a50.f35578z5 = true;
            ArrayList arrayList = a50Var.Q3;
            arrayList.clear();
            arrayList.addAll(a50Var.P3);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(false);
            }
            f40 f40Var = a50Var.C1;
            org.telegram.ui.Components.a81 a81Var = f40Var.f31920w;
            if (a81Var != null) {
                a81Var.c(false);
            }
            f40Var.F = true;
            a50Var.f35683y1.r();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f33371i1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        jf.c cVar = this.f33378n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        cVar.f();
        ArrayList arrayList = this.f33357b1;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.f33384q0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.U0.isEmpty()) {
                ((org.telegram.ui.ActionBar.k2) sc.e.g(1, actionBarLayout.U0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.s sVar = actionBarLayout.G;
            if (sVar != null) {
                sVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        th.n5 a2;
        long[] jArr2 = jArr;
        int i10 = 0;
        while (true) {
            if (i10 < jArr2.length) {
                TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.O).Z1(Long.valueOf(jArr2[i10]));
                if (Z1 != null && !Z1.stories_hidden) {
                    z11 = false;
                    break;
                }
                i10++;
            } else {
                z11 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.k2 Q = Q();
        if (Q != null) {
            th.e5 O1 = org.telegram.messenger.wp.r1(this.O).O1();
            if (z11) {
                arrayList = O1.h;
            } else {
                arrayList = O1.f48922g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z12 = z11;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z12) {
                ArrayList arrayList5 = new ArrayList();
                for (int i11 = 0; i11 < jArr2.length; i11++) {
                    TLRPC.User Z12 = org.telegram.messenger.wp.r1(this.O).Z1(Long.valueOf(jArr2[i11]));
                    if (Z12 == null || !Z12.stories_hidden) {
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
                for (int i13 = 0; i13 < jArr2.length; i13 = c3.i0.k(i13, 1, jArr2[i13], arrayList4)) {
                }
            } else {
                for (int i14 = 0; i14 < jArr2.length; i14 = c3.i0.k(i14, 1, jArr2[i14], arrayList3)) {
                }
            }
            if (!arrayList4.isEmpty() && z10) {
                org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.O);
                int[] iArr = {arrayList4.size()};
                qq qqVar = new qq(this, iArr, jArr2, 17);
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    long longValue = ((Long) arrayList4.get(i15)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer i16 = r12.i1(longValue);
                    tL_stories_getPeerStories.peer = i16;
                    if (i16 instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getPeerStories, new mg.x(r12, longValue, qqVar, 3));
                    }
                }
                return;
            }
            long e = org.telegram.messenger.e20.i(this.O).e();
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                long o10 = org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList2.get(i17)).peer);
                if (o10 != e && !arrayList3.contains(Long.valueOf(o10)) && O1.L(o10)) {
                    arrayList3.add(Long.valueOf(o10));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (Q instanceof zx) {
                    try {
                        a2 = th.n5.a(((zx) Q).E0.h);
                    } catch (Exception unused) {
                    }
                    th.n5 n5Var = a2;
                    Q.getOrCreateStoryViewer().J();
                    Q.getOrCreateStoryViewer().T(this, null, arrayList3, 0, null, null, n5Var, false);
                }
                a2 = null;
                th.n5 n5Var2 = a2;
                Q.getOrCreateStoryViewer().J();
                Q.getOrCreateStoryViewer().T(this, null, arrayList3, 0, null, null, n5Var2, false);
            }
        }
    }

    public final void q0(final int i10, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        th.x4 x4Var;
        th.x4 A;
        org.telegram.messenger.kj f7;
        org.telegram.messenger.kj f10;
        TL_stories.StoryItem storyItem2;
        th.e5 O1 = org.telegram.messenger.wp.r1(this.O).O1();
        TL_stories.PeerStories y3 = O1.y(j10);
        th.n5 n5Var = null;
        if (y3 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < y3.stories.size()) {
                    if (y3.stories.get(i11).f20032id == i10) {
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
                org.telegram.ui.ActionBar.k2 Q = Q();
                if (Q != null) {
                    if (Q instanceof zx) {
                        try {
                            n5Var = th.n5.a(((zx) Q).E0.h);
                        } catch (Exception unused) {
                        }
                    }
                    th.n5 n5Var2 = n5Var;
                    Q.getOrCreateStoryViewer().J();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z10) {
                        Q.getOrCreateStoryViewer().f49355w1 = true;
                    }
                    Q.getOrCreateStoryViewer().T(this, storyItem2, arrayList, 0, null, y3, n5Var2, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            th.x4 A2 = O1.A(0, -1, j10, true);
            if (A2 != null && (f10 = A2.f(i10)) != null) {
                storyItem = f10.f16694l;
            } else {
                A2 = null;
            }
            if (storyItem == null && (A = O1.A(1, -1, j10, true)) != null && (f7 = A.f(i10)) != null) {
                storyItem = f7.f16694l;
                x4Var = A;
            } else {
                x4Var = A2;
            }
            if (storyItem != null && x4Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.k2 Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof zx) {
                    try {
                        n5Var = th.n5.a(((zx) Q2).E0.h);
                    } catch (Exception unused2) {
                    }
                }
                th.n5 n5Var3 = n5Var;
                Q2.getOrCreateStoryViewer().J();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    Q2.getOrCreateStoryViewer().f49355w1 = true;
                }
                Q2.getOrCreateStoryViewer().T(this, storyItem, arrayList2, 0, x4Var, null, n5Var3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = org.telegram.messenger.wp.r1(this.O).i1(j10);
        tL_stories_getStoriesByID.f20039id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.D1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i12 = i10;
                final long j11 = j10;
                final boolean z11 = z10;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        TL_stories.StoryItem storyItem3;
                        Pattern pattern2 = LaunchActivity.D1;
                        TLObject tLObject2 = tLObject;
                        th.n5 n5Var4 = null;
                        if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                            int i13 = 0;
                            while (true) {
                                if (i13 < tL_stories_stories.stories.size()) {
                                    if (tL_stories_stories.stories.get(i13).f20032id == i12) {
                                        storyItem3 = tL_stories_stories.stories.get(i13);
                                        break;
                                    }
                                    i13++;
                                } else {
                                    storyItem3 = null;
                                    break;
                                }
                            }
                            if (storyItem3 != null) {
                                long j12 = j11;
                                storyItem3.dialogId = j12;
                                org.telegram.ui.ActionBar.k2 Q3 = LaunchActivity.Q();
                                if (Q3 == null) {
                                    return;
                                }
                                if (Q3 instanceof zx) {
                                    try {
                                        n5Var4 = th.n5.a(((zx) Q3).E0.h);
                                    } catch (Exception unused3) {
                                    }
                                }
                                th.n5 n5Var5 = n5Var4;
                                Q3.getOrCreateStoryViewer().J();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(Long.valueOf(j12));
                                if (z11) {
                                    Q3.getOrCreateStoryViewer().f49355w1 = true;
                                }
                                Q3.getOrCreateStoryViewer().T(LaunchActivity.this, storyItem3, arrayList3, 0, null, null, n5Var5, false);
                                return;
                            }
                        }
                        org.telegram.ui.Components.cc.X().Q(2131624011, 36, org.telegram.messenger.dd.L0(2131744625, null)).k(false);
                    }
                });
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.s6 s6Var) {
        int i10 = s6Var.f20811f0;
        boolean z10 = false;
        org.telegram.ui.ActionBar.r6 f7 = s6Var.f(tL_theme, this.O, 0);
        s6Var.Z = s6Var.Y;
        s6Var.u(f7.f20731a);
        f7.f20746s = tL_wallPaper;
        if (i10 != s6Var.f20811f0) {
            z10 = true;
        }
        t0(new k91(s6Var, z10, 0, false, false));
    }

    public final void s0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        jf.c cVar = this.f33378n0;
        cVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        cVar.h = pictureInPictureParams;
    }

    @Override
    public final void setRequestedOrientation(int i10) {
        org.telegram.messenger.i0.f16155g = -10;
        org.telegram.messenger.i0.h = -10;
        org.telegram.messenger.i0.f16158i = null;
        super.setRequestedOrientation(i10);
    }

    public final void t0(org.telegram.ui.ActionBar.k2 k2Var) {
        ((ActionBarLayout) M()).R(k2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) M()).U(k2Var, z10, z11);
    }

    public final void v0(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E0;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) instanceof xh.m2) {
                    xh.m2 m2Var = (xh.m2) arrayList.get(i10);
                    if (m2Var.isShowing() && m2Var.I == j10) {
                        return;
                    }
                }
                i10++;
            } else {
                org.telegram.ui.ActionBar.k2 T = T();
                if (T != null && T.sheetsStack != null) {
                    for (int i11 = 0; i11 < T.sheetsStack.size(); i11++) {
                        if (T.sheetsStack.get(i11).s()) {
                            T.sheetsStack.get(i11);
                        }
                    }
                }
                ly w9 = this.f33384q0.w();
                if (w9 != null && w9.sheetsStack != null) {
                    for (int i12 = 0; i12 < w9.sheetsStack.size(); i12++) {
                        if (w9.sheetsStack.get(i12).s()) {
                            w9.sheetsStack.get(i12);
                        }
                    }
                }
                u80 u80Var = new u80(this, 1);
                TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.O).Z1(Long.valueOf(j10));
                if (Z1 != null) {
                    u80Var.a(Z1);
                    return;
                } else {
                    org.telegram.messenger.is.a0(this.O).f16331a.c(new a3.i0(this, j10, u80Var, 20));
                    return;
                }
            }
        }
    }

    public final void w0(Long l4, y60 y60Var, gf.e eVar, org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.i3 G0 = org.telegram.messenger.wp.r1(this.O).G0();
        if (eVar != null) {
            eVar.d();
        }
        G0.a(l4.longValue(), new q70(this, eVar, y60Var, G0, l4, q1Var));
    }

    public final void x(int i10) {
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
        ofArgb.addUpdateListener(new o70(this, 1));
        this.A1.addListener(new t0(this, i10, 2));
        this.A1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.A1.setDuration(320L);
        this.A1.start();
    }

    public final void x0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l4, final Long l10, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, String str26, final String str27, final gf.e eVar, final boolean z12, final int i13, final int i14, final int i15, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = org.telegram.messenger.wp.r1(i10).p1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.D1;
                final gf.e eVar2 = eVar;
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
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.D1;
                            LaunchActivity.this.B0(i16, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, z26, num3, l11, l12, num4, str42, hashMap2, str43, str44, str45, str46, tL_wallPaper2, str47, str48, str49, str50, z27, str51, i17, i18, str52, str53, str54, null, null, eVar2, z22, i19, false, i20, i21, null, null, z28, str55, z23, z24, z25, z29, z30, str56, null, z31, null);
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
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.ActionBar.k2 k2Var;
                        Pattern pattern2 = LaunchActivity.D1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.f33360d0;
                        yy yyVar = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
                        } else {
                            k2Var = null;
                        }
                        int i22 = i16;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str58 = str57;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z25;
                        boolean z37 = z22;
                        t80 t80Var = new t80(launchActivity2, k2Var, i22, user3, tL_messages_botApp2, atomicBoolean, str58, z34, z35, z36, z37);
                        if (z32) {
                            t80Var.run();
                        } else if (tL_messages_botApp2.inactive && z33) {
                            s3 s3Var = new s3(t80Var, 9);
                            gf.e eVar3 = eVar2;
                            if (eVar3 != null) {
                                yyVar = new yy(eVar3, 16);
                            }
                            re1.a(launchActivity2, s3Var, yyVar);
                        } else if (!tL_messages_botApp2.request_write_access && !z37) {
                            t80Var.run();
                        } else {
                            org.telegram.ui.Components.s4.m(k2Var, atomicBoolean, user3, t80Var);
                        }
                    }
                });
            }
        });
    }

    public final void y(boolean z10) {
        org.telegram.messenger.k1 e;
        String str;
        int i10;
        org.telegram.messenger.w0.u();
        org.telegram.messenger.w0.n();
        if (!z10) {
            boolean z11 = org.telegram.messenger.v2.f18578a;
        }
        if (org.telegram.messenger.w0.f18944a.q()) {
            org.telegram.messenger.g1 g1Var = null;
            if (((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).q() && (str = (e = org.telegram.messenger.k1.e()).f16538a) != null && (i10 = e.f16539b) != 0) {
                g1Var = new org.telegram.messenger.g1(str, i10, e.f16540c);
            }
            boolean z12 = this.f33383p1;
            this.f33383p1 = false;
            org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.f18944a;
            ag.j0 j0Var = new ag.j0(this, z12, g1Var, 29);
            if (((ApplicationLoaderImpl) w0Var).q()) {
                org.telegram.messenger.k1.e().a(j0Var, z10);
            }
        } else if (!z10 && Math.abs(System.currentTimeMillis() - org.telegram.messenger.uz.l1) < org.telegram.messenger.wp.r1(0).f19204o3 * 1000) {
        } else {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = org.telegram.messenger.w0.f18945b.getPackageManager().getInstallerPackageName(org.telegram.messenger.w0.f18945b.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            int i11 = this.O;
            ConnectionsManager.getInstance(i11).sendRequest(tL_help_getAppUpdate, new org.telegram.messenger.voip.g0(this, i11, 2));
        }
    }

    public final void y0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f33386r0;
        if (actionBarLayout != null) {
            actionBarLayout.W(z10, z10);
        } else {
            this.f33384q0.W(z10, z10);
        }
    }

    @Override
    public final boolean z(org.telegram.ui.zx r49, java.util.ArrayList r50, final java.lang.CharSequence r51, boolean r52, boolean r53, int r54, final int r55, org.telegram.ui.nb1 r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.z(org.telegram.ui.zx, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.nb1):boolean");
    }

    public final int z0(final int i10, final y60 y60Var, final Integer num, final Integer num2, final Long l4, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i11, final int i12) {
        int longValue;
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.wp.k1(chat);
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
                final Runnable runnable3 = y60Var;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i80.run():void");
                    }
                });
            }
        });
    }

    @Override
    public final void e(int[] iArr) {
    }
}
