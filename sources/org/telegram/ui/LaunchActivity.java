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
import java.util.UUID;
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
public class LaunchActivity extends i5 implements org.telegram.ui.ActionBar.n4, org.telegram.messenger.cs, nw, vf.a {
    public static final String E1 = UUID.randomUUID().toString();
    public static final Pattern F1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean G1;
    public static int H1;
    public static boolean I1;
    public static org.telegram.ui.Components.nt J1;
    public static LaunchActivity K1;
    public static Pattern L1;
    public static b0 M1;
    public static LaunchActivity N1;
    public org.telegram.ui.ActionBar.l3 A0;
    public int[] A1;
    public org.telegram.ui.Components.bc0 B0;
    public ValueAnimator B1;
    public final ArrayList C0;
    public ci.wc C1;
    public org.telegram.ui.Components.ky0 D0;
    public int D1;
    public org.telegram.ui.Components.t9 E0;
    public final ArrayList F0;
    public org.telegram.ui.ActionBar.s1 G0;
    public View H0;
    public org.telegram.ui.ActionBar.s1 I0;
    public boolean J0;
    public HashMap K0;
    public HashMap L0;
    public Intent M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R;
    public String R0;
    public String S;
    public String S0;
    public String T;
    public TLRPC.TL_wallPaper T0;
    public CharSequence U;
    public org.telegram.ui.ActionBar.j6 U0;
    public ArrayList V;
    public TLRPC.TL_theme V0;
    public ArrayList W;
    public boolean W0;
    public ArrayList X;
    public org.telegram.ui.ActionBar.s1 X0;
    public Uri Y;
    public boolean Y0;
    public String Z;
    public boolean Z0;
    public ArrayList f41283a0;
    public ai.p6 f41284a1;
    public ArrayList f41285b0;
    public o4 f41286b1;
    public Uri f41287c0;
    public final ArrayList f41288c1;
    public int f41289d0;
    public final SparseIntArray f41290d1;
    public int f41292e1;
    public final m80 f41294f1;
    public org.telegram.messenger.n6 f41296g1;
    public s70 f41297h0;
    public androidx.mediarouter.app.f f41298h1;
    public ArrayList f41299i0;
    public sh.d f41300i1;
    public ArrayList f41301j0;
    public boolean f41302j1;
    public String f41303k0;
    public cg.a0 k1;
    public ActionMode f41304l0;
    public r80 f41305l1;
    public boolean m0;
    public s80 m1;
    public final l2.e f41306n0;
    public boolean f41307n1;
    public final uf.b f41308o0;
    public za.p f41309o1;
    public org.telegram.ui.Components.wz0 f41310p0;
    public za.p f41311p1;
    public lg.k f41312q0;
    public boolean f41313q1;
    public ActionBarLayout f41314r0;
    public p70 f41315r1;
    public ActionBarLayout f41316s0;
    public gi.j8 f41317s1;
    public ActionBarLayout f41318t0;
    public boolean f41319t1;
    public g80 f41320u0;
    public ViewGroup f41321u1;
    public FrameLayout f41322v0;
    public final zh0 f41323v1;
    public ai.h5 f41324w0;
    public org.telegram.ui.ActionBar.s1 f41325w1;
    public l0 f41326x0;
    public org.telegram.ui.ActionBar.s1 f41327x1;
    public p80 f41328y0;
    public boolean f41329y1;
    public org.telegram.ui.ActionBar.j3 f41330z0;
    public long f41331z1;
    public final ArrayList Q = new ArrayList();
    public final ArrayList f41291e0 = new ArrayList();
    public final ArrayList f41293f0 = new ArrayList();
    public final ArrayList f41295g0 = new ArrayList();

    public LaunchActivity() {
        ?? obj = new Object();
        obj.f17689a = new HashMap();
        obj.d = this;
        obj.f17690b = new uf.b(this);
        this.f41306n0 = obj;
        this.f41308o0 = (uf.b) obj.f17690b;
        this.C0 = new ArrayList();
        this.F0 = new ArrayList();
        this.Y0 = false;
        this.f41288c1 = new ArrayList();
        this.f41290d1 = new SparseIntArray();
        this.f41292e1 = 5934;
        this.f41294f1 = new Object();
        this.f41313q1 = true;
        System.identityHashCode(this);
        this.f41323v1 = new zh0(this);
        this.D1 = 0;
    }

    public static void C0(org.telegram.messenger.c cVar, uw uwVar, CharSequence charSequence, long j10, org.telegram.messenger.zi ziVar, long j11, boolean z10, int i3, int i10) {
        boolean z11;
        org.telegram.ui.Components.ro0 ro0Var;
        org.telegram.ui.Components.ro0 ro0Var2;
        int i11 = cVar.f21919a;
        if (uwVar != null && (ro0Var2 = uwVar.H2) != null && !ro0Var2.f37768n) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.WebPage webPage = null;
        if (z11 && uwVar != null && (ro0Var = uwVar.H2) != null) {
            webPage = ro0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (!TextUtils.isEmpty(charSequence)) {
            if (webPage2 == null && z11) {
                org.telegram.messenger.yy.a0(cVar, charSequence, j10, j11, z10, i3, i10);
                return;
            }
            CharSequence H = org.telegram.messenger.yy.H(charSequence);
            if (H != null && H.length() != 0) {
                CharSequence[] charSequenceArr = {H};
                org.telegram.messenger.yy.C(i11).r0(org.telegram.messenger.wy.b(charSequenceArr[0].toString(), j10, ziVar, ziVar, webPage2, z11, org.telegram.messenger.li.b0(i11).W(charSequenceArr, true, true), null, null, z10, i3, i10, null, false));
            }
        }
    }

    public static void D(int i3) {
        LaunchActivity launchActivity = N1;
        if (launchActivity != null) {
            launchActivity.C(i3);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i3, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        String F12;
        org.telegram.ui.ActionBar.d2 Q = Q();
        if (Q != null) {
            long j10 = tL_attachMenuBot.bot_id;
            ii.q4 b10 = ii.q4.b(i3, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
            if (launchActivity.O() != null && launchActivity.O().k(b10) != null) {
                return;
            }
            TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(tL_attachMenuBot.bot_id));
            if (a22 == null) {
                F12 = null;
            } else {
                F12 = org.telegram.messenger.hp.s1(i3).F1(a22.restriction_reason);
            }
            if (!TextUtils.isEmpty(F12)) {
                org.telegram.messenger.hp.s1(i3);
                org.telegram.messenger.hp.R4(F12, Q);
                return;
            }
            ii.a3 a3Var = new ii.a3(launchActivity, Q.getResourceProvider());
            a3Var.C0 = false;
            a3Var.B(z10);
            a3Var.m0 = launchActivity;
            a3Var.x(Q, b10);
            a3Var.show();
        }
    }

    public static void J() {
        gx gxVar;
        ArrayList<org.telegram.ui.ActionBar.z1> arrayList;
        org.telegram.ui.ActionBar.d2 T = T();
        if (T != null) {
            if (T.getParentLayout() instanceof ActionBarLayout) {
                gxVar = ((ActionBarLayout) T.getParentLayout()).x();
            } else {
                gxVar = null;
            }
            if (gxVar != null && (arrayList = gxVar.sheetsStack) != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    gxVar.sheetsStack.get(size).a(true);
                }
            }
            ArrayList<org.telegram.ui.ActionBar.z1> arrayList2 = T.sheetsStack;
            if (arrayList2 != null) {
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    T.sheetsStack.get(size2).a(true);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = ii.a3.f14789b1.iterator();
            while (it.hasNext()) {
                arrayList3.add((ii.a3) it.next());
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList3.get(i3);
                i3++;
                ((ii.a3) obj).o(true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.d2 L() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f28907b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = K1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.q4) k2.p1.h(1, K1.Q))).t();
        }
        LaunchActivity launchActivity2 = K1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return ((ActionBarLayout) K1.M()).t();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.d2 Q() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f28907b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = K1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.q4) k2.p1.h(1, K1.Q)).getLastFragment();
        }
        LaunchActivity launchActivity2 = K1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return K1.M().getLastFragment();
        }
        return null;
    }

    public static org.telegram.ui.ActionBar.d2 T() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.f28907b0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.T) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = K1;
        if (launchActivity != null && !launchActivity.Q.isEmpty()) {
            return ((org.telegram.ui.ActionBar.q4) k2.p1.h(1, K1.Q)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = K1;
        if (launchActivity2 != null && launchActivity2.M() != null) {
            return K1.M().getSafeLastFragment();
        }
        return null;
    }

    public static String U(int i3, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null) {
            return org.telegram.messenger.bd.M0(i3, str);
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
            if (L1 == null) {
                L1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
            }
            try {
                Matcher matcher = L1.matcher(str);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    String group3 = matcher.group(3);
                    String group4 = matcher.group(4);
                    int i3 = 0;
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
                        i3 = Integer.parseInt(group4);
                    }
                    return (parseInt * 86400) + (parseInt2 * 3600) + (parseInt3 * 60) + i3;
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
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                Z(viewGroup.getChildAt(i3));
            }
        }
    }

    public static void b0(float f10, float f11, float f12) {
        View decorView;
        ci.wc wcVar;
        LaunchActivity launchActivity = K1;
        if (launchActivity != null && (decorView = launchActivity.getWindow().getDecorView()) != null) {
            if (Build.VERSION.SDK_INT >= 33 && ((wcVar = launchActivity.C1) == null || ((View) wcVar.f6076a) != decorView)) {
                launchActivity.C1 = new ci.wc(decorView);
            }
            ci.wc wcVar2 = launchActivity.C1;
            if (wcVar2 != null) {
                View view = (View) wcVar2.f6076a;
                ArrayList arrayList = wcVar2.f6297b;
                if (arrayList.size() < 7) {
                    float max = (Math.max(Math.max(a7.h.a(0.0f, 0.0f, f10, f11), a7.h.a(view.getWidth(), 0.0f, f10, f11)), Math.max(a7.h.a(0.0f, view.getHeight(), f10, f11), a7.h.a(view.getWidth(), view.getHeight(), f10, f11))) * 2.0f) / (org.telegram.messenger.g0.f22607p * 1200.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
                    ci.vc vcVar = new ci.vc(f10, f11, f12);
                    ofFloat.addUpdateListener(new ci.uc(0, wcVar2, vcVar));
                    ofFloat.addListener(new bh.j(1, wcVar2, vcVar));
                    ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40453g);
                    ofFloat.setDuration(max * 1000.0f);
                    arrayList.add(vcVar);
                    wcVar2.f1();
                    ofFloat.start();
                }
            }
        }
    }

    public final void A() {
        if (this.P == org.telegram.messenger.h10.f22829t0 && this.f41309o1 != null) {
            return;
        }
        za.p pVar = this.f41309o1;
        if (pVar != null) {
            pVar.a();
            this.f41309o1 = null;
        }
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.P = i3;
        za.p pVar2 = new za.p(org.telegram.messenger.hs.f(i3), this);
        pVar2.b(org.telegram.messenger.hs.f23272n3);
        pVar2.b(org.telegram.messenger.hs.I2);
        pVar2.b(org.telegram.messenger.hs.f23248j0);
        pVar2.b(org.telegram.messenger.hs.W4);
        pVar2.b(org.telegram.messenger.hs.T1);
        pVar2.b(org.telegram.messenger.hs.M0);
        pVar2.b(org.telegram.messenger.hs.R0);
        pVar2.b(org.telegram.messenger.hs.f23209c1);
        pVar2.b(org.telegram.messenger.hs.Q);
        pVar2.b(org.telegram.messenger.hs.N0);
        pVar2.b(org.telegram.messenger.hs.Y1);
        pVar2.b(org.telegram.messenger.hs.Z1);
        pVar2.b(org.telegram.messenger.hs.f23320v1);
        pVar2.b(org.telegram.messenger.hs.f23328w2);
        pVar2.b(org.telegram.messenger.hs.f23334x1);
        pVar2.b(org.telegram.messenger.hs.f23247i5);
        pVar2.b(org.telegram.messenger.hs.f23230f5);
        pVar2.b(org.telegram.messenger.hs.r5);
        pVar2.b(org.telegram.messenger.hs.Q5);
        this.f41309o1 = pVar2;
    }

    public final void A0(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.A0(android.net.Uri):void");
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.k1 == null && org.telegram.messenger.az.f21652p) {
                this.k1 = cg.a0.b(this, this.f41326x0);
            }
            cg.a0 a0Var = this.k1;
            if (a0Var != null && !org.telegram.messenger.az.f21652p) {
                a0Var.c();
                this.k1 = null;
            }
        }
    }

    public final void B0(final int r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final java.lang.String r77, final java.lang.String r78, final boolean r79, final java.lang.Integer r80, final java.lang.Long r81, final java.lang.Long r82, final java.lang.Integer r83, final java.lang.String r84, final java.util.HashMap r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final org.telegram.tgnet.TLRPC.TL_wallPaper r90, final java.lang.String r91, final java.lang.String r92, final java.lang.String r93, final java.lang.String r94, final boolean r95, final java.lang.String r96, final int r97, final int r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final sf.b r104, final boolean r105, final int r106, final boolean r107, final int r108, final int r109, final java.lang.String r110, final java.lang.String r111, final boolean r112, final java.lang.String r113, final boolean r114, final boolean r115, final boolean r116, final boolean r117, final boolean r118, final java.lang.String r119, final java.lang.Integer r120, final boolean r121, final byte[] r122) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.B0(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, sf.b, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public final void C(int i3) {
        N1 = this;
        Set set = org.telegram.messenger.z0.f26694a;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - org.telegram.messenger.az.H) >= 86400) {
            org.telegram.messenger.az.H = currentTimeMillis;
            Utilities.f21388f.c(new org.telegram.messenger.x0(currentTimeMillis, org.telegram.messenger.w7.j(4), 0));
        }
        if (org.telegram.messenger.r2.f25040a) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis2 - org.telegram.messenger.az.I) >= 3600) {
                org.telegram.messenger.az.I = currentTimeMillis2;
                Utilities.f21388f.c(new ii.i2(currentTimeMillis2, 7));
            }
        }
        if ((Build.VERSION.SDK_INT >= 26 && i3 == 0) || this.f41329y1) {
            return;
        }
        Utilities.f21387e.e(new n70(this, i3, 1), 2000L);
    }

    public final void D0(int i3) {
        this.A0.setInternalNavigationBarColor(i3);
        org.telegram.ui.ActionBar.b3 O = O();
        if (O != null) {
            O.setNavigationBarColor(i3);
        }
    }

    public final void E() {
        int i3;
        boolean z10;
        if (org.telegram.messenger.g0.Q1() && this.f41318t0 != null) {
            Boolean bool = org.telegram.messenger.g0.L;
            int i10 = 0;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (org.telegram.messenger.t0.f25457b != null && org.telegram.messenger.t0.f25457b.getResources().getBoolean(2131034114)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (booleanValue != z10) {
                    return;
                }
            }
            if (!org.telegram.messenger.g0.E && (!org.telegram.messenger.g0.P1() || getResources().getConfiguration().orientation == 2)) {
                this.P0 = false;
                List<org.telegram.ui.ActionBar.d2> fragmentStack = this.f41314r0.getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    while (1 < fragmentStack.size()) {
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentStack.get(1);
                        if (d2Var instanceof wm) {
                            wm wmVar = (wm) d2Var;
                            wmVar.f51388l5 = true;
                            wmVar.f51398m5 = true;
                        }
                        d2Var.onPause();
                        d2Var.onFragmentDestroy();
                        d2Var.setParentLayout(null);
                        fragmentStack.remove(d2Var);
                        this.f41318t0.c(-1, d2Var);
                    }
                    org.telegram.ui.Components.bc0 bc0Var = this.B0;
                    if (bc0Var == null || bc0Var.f32159b.getVisibility() != 0) {
                        this.f41314r0.X(true, true);
                        this.f41318t0.X(true, true);
                    }
                }
                ViewGroup view = this.f41318t0.getView();
                if (this.f41318t0.getFragmentStack().isEmpty()) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                view.setVisibility(i3);
                ai.h5 h5Var = this.f41324w0;
                if (!this.f41318t0.getFragmentStack().isEmpty()) {
                    i10 = 8;
                }
                h5Var.setVisibility(i10);
                return;
            }
            this.P0 = true;
            List<org.telegram.ui.ActionBar.d2> fragmentStack2 = this.f41318t0.getFragmentStack();
            if (!fragmentStack2.isEmpty()) {
                while (fragmentStack2.size() > 0) {
                    org.telegram.ui.ActionBar.d2 d2Var2 = fragmentStack2.get(0);
                    if (d2Var2 instanceof wm) {
                        wm wmVar2 = (wm) d2Var2;
                        wmVar2.f51388l5 = true;
                        wmVar2.f51398m5 = true;
                    }
                    d2Var2.onPause();
                    d2Var2.onFragmentDestroy();
                    d2Var2.setParentLayout(null);
                    fragmentStack2.remove(d2Var2);
                    this.f41314r0.c(-1, d2Var2);
                }
                org.telegram.ui.Components.bc0 bc0Var2 = this.B0;
                if (bc0Var2 == null || bc0Var2.f32159b.getVisibility() != 0) {
                    this.f41314r0.X(true, true);
                }
            }
            this.f41318t0.getView().setVisibility(8);
            ai.h5 h5Var2 = this.f41324w0;
            if (!this.f41314r0.getFragmentStack().isEmpty()) {
                i10 = 8;
            }
            h5Var2.setVisibility(i10);
        }
    }

    public final void E0() {
        org.telegram.ui.ActionBar.l3 l3Var;
        ViewGroup view;
        int i3;
        if (this.A0.indexOfChild(this.f41320u0) != -1) {
            l3Var = this.A0;
            view = this.f41320u0;
        } else {
            l3Var = this.A0;
            view = this.f41314r0.getView();
        }
        int indexOfChild = l3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.A0.removeViewAt(indexOfChild);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            g80 g80Var = new g80(this, this);
            this.f41320u0 = g80Var;
            if (indexOfChild != -1) {
                this.A0.addView(g80Var, indexOfChild, b8.mf.c(-1.0f, -1));
            } else {
                this.A0.addView(g80Var, b8.mf.c(-1.0f, -1));
            }
            ai.h5 h5Var = new ai.h5(this, null);
            this.f41324w0 = h5Var;
            h5Var.setOccupyStatusBar(false);
            this.f41324w0.U(org.telegram.ui.ActionBar.k6.s0());
            this.f41320u0.addView(this.f41324w0, b8.mf.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.f41314r0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f41314r0.getView());
            }
            this.f41320u0.addView(this.f41314r0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.f41318t0 = actionBarLayout;
            actionBarLayout.U0 = true;
            actionBarLayout.setFragmentStack(this.f41295g0);
            this.f41318t0.setDelegate(this);
            this.f41320u0.addView(this.f41318t0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.f41322v0 = frameLayout;
            ArrayList arrayList = this.f41293f0;
            int i10 = 8;
            if (arrayList.isEmpty()) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            frameLayout.setVisibility(i3);
            this.f41322v0.setBackgroundColor(1056964608);
            this.f41320u0.addView(this.f41322v0);
            this.f41322v0.setOnTouchListener(new e0(this, 3));
            this.f41322v0.setOnClickListener(new ai.t(24));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.f41316s0 = actionBarLayout2;
            actionBarLayout2.T0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.f41316s0.setBackgroundView(this.f41322v0);
            this.f41316s0.setUseAlphaAnimations(true);
            this.f41316s0.setFragmentStack(arrayList);
            this.f41316s0.setDelegate(this);
            this.f41316s0.setDrawerLayoutContainer(this.A0);
            ViewGroup view2 = this.f41316s0.getView();
            if (!arrayList.isEmpty()) {
                i10 = 0;
            }
            view2.setVisibility(i10);
            this.f41320u0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f41314r0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f41314r0.getView());
            }
            this.f41314r0.setFragmentStack(this.f41291e0);
            if (indexOfChild != -1) {
                this.A0.addView(this.f41314r0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.A0.addView(this.f41314r0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        n9.b.a(this, org.telegram.messenger.az.f21677x1, false);
    }

    public final void F(boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.ActionBar.d2 d2Var;
        int x02;
        um umVar;
        boolean z13;
        ArrayList arrayList = this.f41291e0;
        boolean z14 = true;
        if (!arrayList.isEmpty()) {
            d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
        } else {
            d2Var = null;
        }
        char c2 = 2;
        if (d2Var != null && (d2Var.isRemovingFromStack() || d2Var.isInPreviewMode())) {
            if (arrayList.size() > 1) {
                d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(2, arrayList);
            } else {
                d2Var = null;
            }
        }
        if (d2Var != null) {
            d2Var.hasForceLightStatusBar();
        }
        int i3 = Build.VERSION.SDK_INT;
        if (z11) {
            if (d2Var != null) {
                z13 = d2Var.isLightStatusBar();
                if (d2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) d2Var.getParentLayout();
                    if (actionBarLayout.x() != null && actionBarLayout.x().getLastSheet() != null) {
                        org.telegram.ui.ActionBar.z1 lastSheet = actionBarLayout.x().getLastSheet();
                        if (lastSheet.s()) {
                            z13 = lastSheet.f();
                        }
                    } else {
                        ArrayList<org.telegram.ui.ActionBar.z1> arrayList2 = d2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.z1 z1Var = (org.telegram.ui.ActionBar.z1) k2.p1.h(1, d2Var.sheetsStack);
                            if (z1Var.s()) {
                                z13 = z1Var.f();
                            }
                        }
                    }
                }
            } else {
                z13 = i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28160s8, true)) > 0.699999988079071d;
            }
            org.telegram.messenger.g0.p3(this, z13);
        }
        if (i3 >= 26 && z12 && (!z10 || d2Var == null || !d2Var.isInPreviewMode())) {
            if (d2Var != null && z10) {
                x02 = d2Var.getNavigationBarColor();
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, true);
            }
            if (d2Var instanceof wm) {
                wm wmVar = (wm) d2Var;
                if (!wmVar.f51319fc || (wmVar.f51520w.f54736s != 1 && ((umVar = wmVar.f51557ya) == null || !umVar.f50134q))) {
                    c2 = 1;
                }
            } else {
                c2 = 0;
            }
            if (O() != null && O().I > 0) {
                c2 = 0;
            }
            if (this.f41314r0.x() != null) {
                gx x10 = this.f41314r0.x();
                if (x10.sheetsStack != null) {
                    for (int i10 = 0; i10 < x10.sheetsStack.size(); i10++) {
                        org.telegram.ui.ActionBar.z1 z1Var2 = x10.sheetsStack.get(i10);
                        if (z1Var2.y()) {
                            x02 = z1Var2.e(x02);
                            c2 = 0;
                        }
                    }
                }
            }
            Iterator it = ii.a3.f14789b1.iterator();
            while (it.hasNext()) {
                x02 = ((ii.a3) it.next()).e(x02);
                c2 = 0;
            }
            D0(x02);
            if ((c2 != 0 || org.telegram.messenger.g0.B(x02) < 0.721f) && c2 != 1) {
                z14 = false;
            }
            org.telegram.messenger.g0.m3(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final org.telegram.ui.ActionBar.s1 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.s1 p10 = alertDialog$Builder.p();
            p10.setCanceledOnTouchOutside(true);
            p10.setOnDismissListener(new ci.h3(11, this, p10));
            this.F0.add(p10);
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
        org.telegram.messenger.r3 r3Var;
        long j10;
        boolean z11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z12 = false;
        if (sharedInstance != null && (r3Var = sharedInstance.groupCall) != null) {
            boolean z13 = this.m0;
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
                j10 = org.telegram.messenger.h10.i(this.P).f22848n;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j10);
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && groupCallParticipant.raise_hand_rating != 0) {
                z12 = true;
            }
            this.m0 = z12;
            if (!z10 && z13 && !z12 && !z11 && x30.f51711v5 == null) {
                N0(38);
                return;
            }
            return;
        }
        this.m0 = false;
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.d2 d2Var;
        ArrayList arrayList = this.f41293f0;
        if (!arrayList.isEmpty()) {
            d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
        } else {
            ArrayList arrayList2 = this.f41295g0;
            if (!arrayList2.isEmpty()) {
                d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList2);
            } else {
                ArrayList arrayList3 = this.f41291e0;
                if (!arrayList3.isEmpty()) {
                    d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList3);
                } else {
                    d2Var = null;
                }
            }
        }
        if (org.telegram.ui.Components.fc.a(d2Var)) {
            aVar.a(org.telegram.ui.Components.fc.a0(d2Var)).j();
        }
    }

    public final void I() {
        ArrayList arrayList = this.f41291e0;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.d2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (org.telegram.messenger.g0.Q1()) {
            ArrayList arrayList2 = this.f41293f0;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((org.telegram.ui.ActionBar.d2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f41295g0;
            int size3 = arrayList3.size();
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                ((org.telegram.ui.ActionBar.d2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    public final void I0() {
        String str;
        String str2;
        char c2;
        org.telegram.messenger.yc ycVar;
        if (org.telegram.messenger.h10.i(this.P).p()) {
            try {
                if (!this.J0 && !org.telegram.messenger.t0.f25465x) {
                    String string = org.telegram.messenger.hp.e1().getString("language_showed2", "");
                    final String str3 = org.telegram.messenger.hp.s1(this.P).P3;
                    if (string.equals(str3)) {
                        if (org.telegram.messenger.r2.f25040a) {
                            org.telegram.messenger.a8.b("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final org.telegram.messenger.yc[] ycVarArr = new org.telegram.messenger.yc[2];
                    char c10 = 0;
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
                    int i3 = 0;
                    while (true) {
                        if (i3 < org.telegram.messenger.bd.E0().J.size()) {
                            org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) org.telegram.messenger.bd.E0().J.get(i3);
                            c2 = c10;
                            if (ycVar2.f26563c.equals("en")) {
                                ycVarArr[c2] = ycVar2;
                            }
                            if (ycVar2.f26563c.replace("_", "-").equals(str3) || ycVar2.f26563c.equals(str) || ycVar2.f26563c.equals(str2)) {
                                ycVarArr[1] = ycVar2;
                            }
                            if (ycVarArr[c2] != null && ycVarArr[1] != null) {
                                break;
                            }
                            i3++;
                            c10 = c2;
                        } else {
                            c2 = c10;
                            break;
                        }
                    }
                    org.telegram.messenger.yc ycVar3 = ycVarArr[c2];
                    if (ycVar3 != null && (ycVar = ycVarArr[1]) != null && ycVar3 != ycVar) {
                        if (org.telegram.messenger.r2.f25040a) {
                            org.telegram.messenger.a8.b("show lang alert for " + ycVarArr[c2].b() + " and " + ycVarArr[1].b());
                        }
                        this.K0 = null;
                        this.L0 = null;
                        this.J0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = ycVarArr[1].c();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) {
                            public final LaunchActivity f50419b;

                            {
                                this.f50419b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i10 = 0;
                                switch (r4) {
                                    case 0:
                                        String str4 = LaunchActivity.E1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i10 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i10);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f50419b;
                                        final org.telegram.messenger.yc[] ycVarArr2 = ycVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.K0 = hashMap2;
                                                        if (launchActivity2.L0 != null && hashMap2 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr3 = ycVarArr2;
                                                            launchActivity2.J0(ycVarArr3[1], ycVarArr3[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.L0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.K0 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr4 = ycVarArr2;
                                                            launchActivity3.J0(ycVarArr4[1], ycVarArr4[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        String str6 = LaunchActivity.E1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i10 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i10);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f50419b;
                                        final org.telegram.messenger.yc[] ycVarArr3 = ycVarArr;
                                        final String str7 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (launchActivity22.L0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr32 = ycVarArr3;
                                                            launchActivity22.J0(ycVarArr32[1], ycVarArr32[0], str7);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.L0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.K0 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr4 = ycVarArr3;
                                                            launchActivity3.J0(ycVarArr4[1], ycVarArr4[0], str7);
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
                        tL_langpack_getStrings2.lang_code = ycVarArr[c2].c();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) {
                            public final LaunchActivity f50419b;

                            {
                                this.f50419b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i10 = 0;
                                switch (r4) {
                                    case 0:
                                        String str4 = LaunchActivity.E1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i10 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i10);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity = this.f50419b;
                                        final org.telegram.messenger.yc[] ycVarArr2 = ycVarArr;
                                        final String str5 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (launchActivity22.L0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr32 = ycVarArr2;
                                                            launchActivity22.J0(ycVarArr32[1], ycVarArr32[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.L0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.K0 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr4 = ycVarArr2;
                                                            launchActivity3.J0(ycVarArr4[1], ycVarArr4[0], str5);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        String str6 = LaunchActivity.E1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i10 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i10);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i10++;
                                            }
                                        }
                                        final LaunchActivity launchActivity2 = this.f50419b;
                                        final org.telegram.messenger.yc[] ycVarArr3 = ycVarArr;
                                        final String str7 = str3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r5) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (launchActivity22.L0 != null && hashMap22 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr32 = ycVarArr3;
                                                            launchActivity22.J0(ycVarArr32[1], ycVarArr32[0], str7);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.L0 = hashMap3;
                                                        if (hashMap3 != null && launchActivity3.K0 != null) {
                                                            org.telegram.messenger.yc[] ycVarArr4 = ycVarArr3;
                                                            launchActivity3.J0(ycVarArr4[1], ycVarArr4[0], str7);
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

    public final void J0(org.telegram.messenger.yc r18, org.telegram.messenger.yc r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.J0(org.telegram.messenger.yc, org.telegram.messenger.yc, java.lang.String):void");
    }

    public final java.util.ArrayList K(java.lang.String r19, java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.K(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final void K0(boolean z10, boolean z11, int i3, int i10, xg xgVar) {
        if (this.A0 != null && !isFinishing()) {
            if (this.B0 == null) {
                this.B0 = new org.telegram.ui.Components.bc0(this);
            }
            org.telegram.messenger.az.f21675x = true;
            int i11 = 0;
            if (SecretMediaViewer.g() && SecretMediaViewer.f().f41965s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                PhotoViewer.v1().H0(false, true);
            } else if (i4.G() && i4.v().W) {
                i4.v().m(false, true);
            }
            gi.va.w();
            org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
            if (ziVar != null && ziVar.i4()) {
                MediaController.B().q(true, true, false, false);
            }
            this.B0.show();
            org.telegram.ui.Components.ac0 ac0Var = this.B0.f32159b;
            ArrayList arrayList = this.C0;
            arrayList.isEmpty();
            ac0Var.m(z11, i3, i10, new ly(20, this, xgVar));
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Components.zb0 zb0Var = (org.telegram.ui.Components.zb0) arrayList.get(i12);
                if (z10) {
                    int size = arrayList.size() - 1;
                }
                zb0Var.m(z11, i3, i10, null);
            }
            org.telegram.messenger.az.C = true;
            a80 a80Var = new a80(this);
            this.B0.f32159b.setDelegate(a80Var);
            int size2 = arrayList.size();
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((org.telegram.ui.Components.zb0) obj).setDelegate(a80Var);
            }
            try {
                org.telegram.messenger.us.t(org.telegram.messenger.h10.f22829t0).Y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void L0(int i3, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f10;
        if (this.D0 == null) {
            final ?? frameLayout = new FrameLayout(this);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, frameLayout, null);
            int i10 = org.telegram.messenger.g0.f22602m;
            if (i10 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i10));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(2131231644);
            linearLayout.addView(imageView, b8.mf.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.messenger.k5.n(textView, i11, null, 1, 17.0f);
            textView.setText(org.telegram.messenger.bd.M0(2131746790, null));
            linearLayout.addView(textView, b8.mf.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            frameLayout.f35510a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
            org.telegram.ui.ActionBar.r6.H(textView2, org.telegram.ui.ActionBar.k6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(false));
            textView2.setGravity(51);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            linearLayout.addView(textView2, b8.mf.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            f10 = 4.0f;
            scrollView.setPadding(org.telegram.messenger.g0.L(24.0f), i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(scrollView, b8.mf.o(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(org.telegram.messenger.bd.M0(2131751605, null).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i12 = org.telegram.ui.ActionBar.k6.f28273y6;
            org.telegram.ui.ActionBar.r6.V(textView3, i12, null);
            textView3.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.y J0 = org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 25);
            textView3.setBackground(J0);
            org.telegram.ui.ActionBar.r6.k(textView3, J0, null, h, null);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(10.0f));
            frameLayout.addView(textView3, b8.mf.d(-2, -2.0f, 83, 16.0f, 0.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    ky0 ky0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.bd.M0(2131744208, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751603, null), new iy0(ky0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131753756, null), null);
                            s1Var.U = org.telegram.messenger.bd.M0(2131743985, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (ky0Var.f35512c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.bd.M0(2131743988, null);
                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                                s1Var2.S = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754306, null), new iy0(ky0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                s1Var2.U = org.telegram.messenger.bd.a0("TosAgeText", null, 2131743989, org.telegram.messenger.bd.G(ky0Var.f35512c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            ky0Var.a();
                            return;
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(org.telegram.messenger.bd.M0(2131754717, null));
            textView4.setGravity(17);
            textView4.setTypeface(org.telegram.messenger.g0.o());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int L = org.telegram.messenger.g0.L(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, -11491093, -12346402, -12346402));
            textView4.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            frameLayout.addView(textView4, b8.mf.d(-2, 42.0f, 85, 16.0f, 0.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    ky0 ky0Var = frameLayout;
                    switch (i13) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String M0 = org.telegram.messenger.bd.M0(2131744208, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751603, null), new iy0(ky0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131753756, null), null);
                            s1Var.U = org.telegram.messenger.bd.M0(2131743985, null);
                            alertDialog$Builder.p();
                            return;
                        default:
                            if (ky0Var.f35512c.min_age_confirm != 0) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String M02 = org.telegram.messenger.bd.M0(2131743988, null);
                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                                s1Var2.S = M02;
                                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754306, null), new iy0(ky0Var, 0));
                                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                s1Var2.U = org.telegram.messenger.bd.a0("TosAgeText", null, 2131743989, org.telegram.messenger.bd.G(ky0Var.f35512c.min_age_confirm, "Years", new Object[0]));
                                alertDialog$Builder2.p();
                                return;
                            }
                            ky0Var.a();
                            return;
                    }
                }
            });
            View view2 = new View(this);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view2, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(75.0f);
            layoutParams.gravity = 80;
            frameLayout.addView(view2, layoutParams);
            this.D0 = frameLayout;
            frameLayout.setAlpha(0.0f);
            this.A0.addView(this.D0, b8.mf.c(-1.0f, -1));
            this.D0.setDelegate(new h80(this));
        } else {
            f10 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = org.telegram.messenger.h10.i(i3).f22832a0;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.f27058id.data.equals(tL_help_termsOfService.f27058id.data))) {
            org.telegram.messenger.h10.i(i3).f22832a0 = tL_help_termsOfService;
            org.telegram.messenger.h10.i(i3).v(false);
        }
        org.telegram.ui.Components.ky0 ky0Var = this.D0;
        if (ky0Var.getVisibility() != 0) {
            ky0Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        org.telegram.messenger.zi.b(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false, 0);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i13 = 0; i13 < length; i13++) {
            if (spannableStringBuilder.charAt(i13) == '\n') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == '-') {
                    int i15 = i13 + 2;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        org.telegram.ui.Components.na naVar = new org.telegram.ui.Components.na(L2, L3);
                        spannableStringBuilder.replace(i14, i13 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(naVar, i14, i15, 33);
                    }
                }
            }
        }
        ky0Var.f35510a.setText(spannableStringBuilder);
        ky0Var.f35512c = tL_help_termsOfService;
        ky0Var.d = i3;
        this.D0.animate().alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.F).setListener(null).start();
    }

    public final org.telegram.ui.ActionBar.q4 M() {
        ActionBarLayout actionBarLayout = this.f41314r0;
        ArrayList arrayList = this.Q;
        if (!arrayList.isEmpty()) {
            return (org.telegram.ui.ActionBar.q4) k2.p1.h(1, arrayList);
        }
        return actionBarLayout;
    }

    public final void M0(int i3, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        if (this.E0 == null) {
            ?? frameLayout = new FrameLayout(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
            frameLayout.f38362x = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0});
            frameLayout.f38363y = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0});
            org.telegram.ui.ActionBar.r6.i(i10, frameLayout, null);
            int i11 = (int) (org.telegram.messenger.g0.f22602m / org.telegram.messenger.g0.f22607p);
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f22602m));
            ?? imageView = new ImageView(this);
            imageView.f(2131624167, 108, 108, null);
            imageView.d();
            imageView.getAnimatedDrawable().K(1);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(14.0f));
            frameLayout2.addView((View) imageView, b8.mf.d(-2, -2.0f, 17, 0.0f, i11, 0.0f, 0.0f));
            imageView.setOnClickListener(new org.telegram.ui.Components.r9(frameLayout));
            FrameLayout frameLayout3 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            frameLayout.f38357f = scrollView;
            org.telegram.messenger.g0.z3(scrollView, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28160s8, false));
            scrollView.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
            scrollView.setClipToPadding(false);
            frameLayout.addView(scrollView, b8.mf.d(-1, -1.0f, 51, 27.0f, i11 + 178, 27.0f, 130.0f));
            scrollView.addView(frameLayout3);
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(textView, i12, null);
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.bd.M0(2131743826, null));
            frameLayout3.addView(textView, b8.mf.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            frameLayout.f38353a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
            org.telegram.ui.ActionBar.r6.H(textView2, org.telegram.ui.ActionBar.k6.J6, null);
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new org.telegram.messenger.c0(false));
            textView2.setGravity(49);
            textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            frameLayout3.addView(textView2, b8.mf.d(-2, -2.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
            ai.o2 o2Var = new ai.o2(this, 14);
            frameLayout.d = o2Var;
            o2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            o2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
            o2Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            frameLayout.addView(o2Var, b8.mf.d(-2, 46.0f, 81, 0.0f, 0.0f, 0.0f, 45.0f));
            o2Var.setOnClickListener(new org.telegram.ui.Components.r9(frameLayout, this));
            TextView textView3 = new TextView(this);
            frameLayout.f38354b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            o2Var.addView(textView3, b8.mf.e(-2, -2, 17));
            ai.o2 o2Var2 = new ai.o2(15, this, (Object) frameLayout);
            frameLayout.f38355c = o2Var2;
            o2Var2.setWillNotDraw(false);
            o2Var2.setAlpha(0.0f);
            o2Var2.setScaleX(0.1f);
            o2Var2.setScaleY(0.1f);
            o2Var2.setVisibility(4);
            org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(o2Var2);
            frameLayout.f38356e = gh0Var;
            gh0Var.d(null, true, false);
            gh0Var.f34108o = -1;
            o2Var.addView(o2Var2, b8.mf.e(36, 36, 17));
            this.E0 = frameLayout;
            this.A0.addView((View) frameLayout, b8.mf.c(-1.0f, -1));
        }
        org.telegram.ui.Components.t9 t9Var = this.E0;
        TextView textView4 = t9Var.f38354b;
        t9Var.f38361w = 0;
        t9Var.f38358n = tL_help_appUpdate;
        t9Var.f38360s = i3;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            t9Var.f38359r = org.telegram.messenger.w7.r(null, document);
        }
        if (t9Var.getVisibility() != 0) {
            t9Var.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        org.telegram.messenger.zi.b(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false, 0);
        t9Var.f38353a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            textView4.setText(org.telegram.messenger.bd.M0(2131743832, null) + String.format(Locale.US, " (%1$s)", org.telegram.messenger.g0.i0(tL_help_appUpdate.document.size, false, false)));
        } else {
            textView4.setText(org.telegram.messenger.bd.M0(2131743832, null));
        }
        org.telegram.messenger.hs.f(t9Var.f38360s).c(t9Var, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(t9Var.f38360s).c(t9Var, org.telegram.messenger.hs.Z1);
        org.telegram.messenger.hs.f(t9Var.f38360s).c(t9Var, org.telegram.messenger.hs.X1);
        if (z10) {
            org.telegram.messenger.t0.u();
        }
    }

    @Override
    public final boolean N(org.telegram.ui.uw r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.N(org.telegram.ui.uw):boolean");
    }

    public final void N0(int i3) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !this.f41291e0.isEmpty() && sharedInstance.groupCall != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.ui.ActionBar.d2 d2Var = this.f41314r0.getFragmentStack().get(this.f41314r0.getFragmentStack().size() - 1);
            if (d2Var instanceof ee0) {
                d2Var = ((ee0) d2Var).c0();
            }
            UndoView undoView = null;
            if (d2Var instanceof wm) {
                wm wmVar = (wm) d2Var;
                if (chat != null && wmVar.a() == (-chat.f27001id)) {
                    chat = null;
                }
                wmVar.f8();
                undoView = wmVar.N3;
            } else if (d2Var instanceof uw) {
                undoView = ((uw) d2Var).k4();
            } else if (d2Var instanceof ProfileActivity) {
                undoView = ((ProfileActivity) d2Var).M;
            }
            if (undoView != null) {
                undoView.m(0L, chat, i3);
            }
            if (i3 == 38 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().playAllowTalkSound();
            }
        }
    }

    public final org.telegram.ui.ActionBar.b3 O() {
        ActionBarLayout actionBarLayout = this.f41318t0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.f41318t0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.f41314r0;
        if (actionBarLayout2 != null && actionBarLayout2.getBottomSheetTabs() != null) {
            return this.f41314r0.getBottomSheetTabs();
        }
        return null;
    }

    public final void O0(int i3) {
        P0(i3, new u70(0));
    }

    public final org.telegram.ui.ActionBar.d2 P() {
        if (xd0.s1(this.P, false).getInt("currentViewNum", 0) != 0) {
            return new xd0();
        }
        return new o50();
    }

    public final void P0(int i3, org.telegram.messenger.e9 e9Var) {
        if (i3 != org.telegram.messenger.h10.f22829t0 && org.telegram.messenger.h10.r(i3)) {
            this.f41307n1 = true;
            ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
            org.telegram.messenger.h10.f22829t0 = i3;
            org.telegram.messenger.h10.i(0).v(false);
            A();
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23211c4, Integer.valueOf(i3));
            if (org.telegram.messenger.g0.Q1()) {
                this.f41316s0.a0();
                this.f41318t0.a0();
                if (!this.P0) {
                    if (this.f41318t0.getFragmentStack().isEmpty()) {
                        this.f41324w0.setVisibility(0);
                    }
                    this.f41318t0.getView().setVisibility(8);
                }
                this.f41316s0.getView().setVisibility(8);
            }
            this.f41314r0.a0();
            this.f41314r0.c(-3, (ee0) e9Var.k(null));
            this.f41314r0.X(true, true);
            if (org.telegram.messenger.g0.Q1()) {
                this.f41316s0.X(true, true);
                this.f41318t0.X(true, true);
            }
            if (!org.telegram.messenger.t0.f25465x) {
                ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
            }
            if (org.telegram.messenger.h10.i(i3).f22832a0 != null) {
                L0(i3, org.telegram.messenger.h10.i(i3).f22832a0);
            }
            Q0();
            this.f41307n1 = false;
        }
    }

    public final void Q0() {
        int i3;
        String str;
        if (this.f41314r0 != null) {
            int connectionState = ConnectionsManager.getInstance(this.P).getConnectionState();
            this.f41289d0 = connectionState;
            m60 m60Var = null;
            if (connectionState == 2) {
                str = "WaitingForNetwork";
                i3 = 2131743222;
            } else if (connectionState == 5) {
                str = "Updating";
                i3 = 2131743820;
            } else if (connectionState == 4) {
                str = "ConnectingToProxyWithDots";
                i3 = 2131751805;
            } else if (connectionState == 1) {
                str = "Connecting";
                i3 = 2131751809;
            } else {
                i3 = 0;
                str = null;
            }
            if (connectionState == 1 || connectionState == 4) {
                m60Var = new m60(this, 9);
            }
            ActionBarLayout actionBarLayout = this.f41314r0;
            actionBarLayout.N0 = str;
            actionBarLayout.O0 = i3;
            actionBarLayout.P0 = m60Var;
            for (int i10 = 0; i10 < actionBarLayout.V0.size(); i10++) {
                ((org.telegram.ui.ActionBar.d2) actionBarLayout.V0.get(i10)).setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, m60Var);
            }
        }
    }

    public final int R() {
        return this.f41291e0.size();
    }

    public final sh.d S() {
        return this.f41300i1;
    }

    public final boolean W(android.content.Intent r126, boolean r127, boolean r128, boolean r129, sf.b r130, boolean r131, boolean r132) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.W(android.content.Intent, boolean, boolean, boolean, sf.b, boolean, boolean):boolean");
    }

    public final void X() {
        ActionMode actionMode = this.f41304l0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Y(int i3, TLRPC.User user, String str, sf.b bVar) {
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = s12.q1(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new c3.b(1), new f60(this, bVar, s12, i3, user));
    }

    @Override
    public final void a(float f10) {
        if (i4.G() && i4.v().W) {
            i4 v = i4.v();
            v.Q();
            i4.e0(v);
            if (v.f46086g0 != null) {
                v.f46100v0[0].f47083b.g1();
                v.f46100v0[1].f47083b.g1();
                v.f46086g0.invalidate();
                v.f46096r0.invalidate();
                if (f10 == 1.0f) {
                    v.f46100v0[0].f47084c.f();
                    v.f46100v0[1].f47084c.f();
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
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.f41316s0) {
            this.f41318t0.X(z10, z10);
            this.f41314r0.X(z10, z10);
        }
    }

    public final void c0() {
        org.telegram.ui.ActionBar.q4[] q4VarArr = {this.f41314r0, this.f41316s0, this.f41318t0};
        for (int i3 = 0; i3 < 3; i3++) {
            org.telegram.ui.ActionBar.q4 q4Var = q4VarArr[i3];
            if (q4Var instanceof ActionBarLayout) {
                ((ActionBarLayout) q4Var).F();
            }
        }
    }

    public final boolean d0(boolean z10) {
        boolean z11;
        qg.h hVar = n9.b.f20286a;
        if (hVar != null) {
            if (hVar.f53937s) {
                if (z10) {
                    hVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.bc0 bc0Var = this.B0;
        if (bc0Var != null && bc0Var.f32159b.getVisibility() == 0) {
            if (z10) {
                finish();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.j3 j3Var = this.f41330z0;
            if (j3Var != null && (z11 = j3Var.V)) {
                if (z10 && z11) {
                    j3Var.a(false);
                    return false;
                }
            } else {
                org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.tl0.I;
                if (s1Var != null) {
                    if (z10) {
                        s1Var.dismiss();
                        org.telegram.ui.Components.tl0.I = null;
                        return false;
                    }
                } else if (is.f46381g0 != null && is.p().E) {
                    if (z10) {
                        is.p().n();
                        return false;
                    }
                } else if (SecretMediaViewer.g() && SecretMediaViewer.f().f41965s) {
                    if (z10) {
                        SecretMediaViewer.f().e(true, false);
                        return false;
                    }
                } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                    if (z10) {
                        PhotoViewer.v1().H0(true, false);
                        return false;
                    }
                } else if (!i4.G() || !i4.v().W) {
                    return true;
                } else {
                    if (z10) {
                        i4.v().m(true, false);
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
        o4 o4Var = this.f41286b1;
        if (o4Var != null) {
            org.telegram.messenger.g0.r(o4Var);
            this.f41286b1 = null;
        }
        if (!this.R) {
            this.R = true;
            za.p pVar = this.f41309o1;
            if (pVar != null) {
                pVar.a();
                this.f41309o1 = null;
            }
            za.p pVar2 = this.f41311p1;
            if (pVar2 != null) {
                pVar2.a();
                this.f41311p1 = null;
            }
            p70 p70Var = this.f41315r1;
            if (p70Var != null && (hashSet = org.telegram.messenger.lc.f23973n) != null) {
                hashSet.remove(p70Var);
            }
        }
    }

    public final void f0(Intent intent, sf.b bVar) {
        super.onNewIntent(intent);
        W(intent, true, false, false, bVar, true, false);
    }

    public final void g0() {
        if (this.f41286b1 != null) {
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodePause");
            }
            org.telegram.messenger.g0.r(this.f41286b1);
            this.f41286b1 = null;
        }
        if (org.telegram.messenger.az.f21661s.length() != 0) {
            org.telegram.messenger.az.B = (int) (SystemClock.elapsedRealtime() / 1000);
            o4 o4Var = new o4(this, 10);
            this.f41286b1 = o4Var;
            if (org.telegram.messenger.az.f21675x) {
                org.telegram.messenger.g0.i3(o4Var, 1000L);
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.b("schedule app lock in 1000");
                }
            } else if (org.telegram.messenger.az.f21678y != 0) {
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.b("schedule app lock in " + ((org.telegram.messenger.az.f21678y * 1000) + 1000));
                }
                org.telegram.messenger.g0.i3(this.f41286b1, (org.telegram.messenger.az.f21678y * 1000) + 1000);
            }
        } else {
            org.telegram.messenger.az.B = 0;
        }
        org.telegram.messenger.az.y();
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.d2 d2Var, ActionBarLayout actionBarLayout) {
        boolean z10;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (org.telegram.messenger.g0.Q1()) {
            boolean z11 = d2Var instanceof uw;
            if (!z11 && !(d2Var instanceof ee0)) {
                if ((d2Var instanceof wm) && !((wm) d2Var).c()) {
                    boolean z12 = this.P0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.f41318t0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.f41324w0.setVisibility(8);
                        this.f41318t0.a0();
                        this.f41318t0.c(-1, d2Var);
                        if (!this.f41316s0.getFragmentStack().isEmpty()) {
                            while (this.f41316s0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.f41316s0;
                                actionBarLayout4.d0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.f41316s0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.f41314r0)) {
                        actionBarLayout2.c(-1, d2Var);
                        if (!this.f41316s0.getFragmentStack().isEmpty()) {
                            while (this.f41316s0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.f41316s0;
                                actionBarLayout5.d0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.f41316s0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.f41316s0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i3 = 0;
                    while (true) {
                        if (i3 < 4) {
                            if (org.telegram.messenger.h10.i(i3).p()) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if ((d2Var instanceof xd0) && i3 == -1) {
                        this.f41324w0.setVisibility(0);
                        this.f41322v0.setBackgroundColor(0);
                    } else {
                        this.f41322v0.setBackgroundColor(2130706432);
                    }
                    this.f41316s0.c(-1, d2Var);
                    return false;
                }
            } else {
                if (actionBarLayout != this.f41314r0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z11 && !((uw) d2Var).t4()) {
                    z10 = false;
                }
                if (z10) {
                    this.f41314r0.a0();
                    this.f41314r0.c(-1, d2Var);
                    this.f41316s0.a0();
                    this.f41316s0.getView().setVisibility(8);
                    if (!this.P0 && this.f41318t0.getFragmentStack().isEmpty()) {
                        this.f41324w0.setVisibility(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.f41286b1 != null) {
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.a8.b("cancel lockRunnable onPasscodeResume");
            }
            org.telegram.messenger.g0.r(this.f41286b1);
            this.f41286b1 = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            K0(true, false, -1, -1, null);
        }
        if (org.telegram.messenger.az.B != 0) {
            org.telegram.messenger.az.B = 0;
            org.telegram.messenger.az.y();
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        org.telegram.ui.ActionBar.s1 s1Var = this.X0;
        if (s1Var != null) {
            try {
                s1Var.dismiss();
            } finally {
                this.X0 = null;
            }
        }
        this.S0 = null;
        this.T0 = null;
        this.U0 = null;
        this.R0 = null;
        this.V0 = null;
    }

    @Override
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f41965s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
            return true;
        } else if (!i4.G() || !i4.v().W) {
            return false;
        } else {
            i4.v().m(true, false);
            return true;
        }
    }

    public final void j0(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.j0(boolean):void");
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
            if (actionBarLayout == this.f41314r0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.f41307n1) {
                e0();
                finish();
                return false;
            } else if (actionBarLayout == this.f41318t0) {
                if (!this.P0) {
                    this.f41324w0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.f41316s0 && this.f41314r0.getFragmentStack().isEmpty() && this.f41316s0.getFragmentStack().size() == 1) {
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
        xd0 xd0Var = new xd0();
        m60 m60Var = new m60(this, 0);
        xd0Var.G = 3;
        xd0Var.f51946a = 12;
        xd0Var.f51954e0 = m60Var;
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            int indexOf = password.login_email_pattern.indexOf(42);
            int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                ?? obj = new Object();
                obj.f38578a |= 256;
                obj.f38579b = indexOf;
                int i3 = lastIndexOf + 1;
                obj.f38580c = i3;
                valueOf.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i3, 0);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = valueOf;
            s1Var.U = org.telegram.messenger.bd.M0(2131751202, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752548, null), new org.telegram.ui.Components.i41(20, this, xd0Var));
            k2.p1.v(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        t0(xd0Var);
    }

    @Override
    public final boolean l(org.telegram.ui.ActionBar.ActionBarLayout r13, org.telegram.ui.ActionBar.o4 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.l(org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.o4):boolean");
    }

    public final void l0(final long j10, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i3, final int i10) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            t0(m91.J0(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = org.telegram.messenger.hp.s1(this.P).h1(-j10);
        tL_channels_getMessages.f27039id.add(num);
        ConnectionsManager.getInstance(this.P).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new v60(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i3, i10));
            }
        });
    }

    public final void m0(int i3, long j10, TLRPC.TL_error tL_error) {
        wm wmVar = new wm(a1.g.j(j10, "user_id"));
        t0(wmVar);
        org.telegram.messenger.g0.i3(new pp(tL_error, wmVar, org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10)), 13), 300L);
    }

    public final void n0(int i3, String str, String str2, sf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i3).sendRequest(tL_contacts_importContactToken, new cg.j0(this, bVar, s12, i3, str2, 11));
    }

    public final void o0(int i3, String str, String str2, sf.b bVar) {
        if (bVar != null) {
            bVar.d();
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        s12.d2().a(str, null, new ci.i4(this, s12, bVar, i3, str2, 1));
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.f41304l0 == actionMode) {
            this.f41304l0 = null;
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f41314r0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
            if (kVar != null) {
                kVar.setVisibility(0);
            }
            actionBarLayout.D0 = false;
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f41318t0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
                if (kVar2 != null) {
                    kVar2.setVisibility(0);
                }
                actionBarLayout2.D0 = false;
                ActionBarLayout actionBarLayout3 = this.f41316s0;
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
        this.f41304l0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.f41314r0.s(menu) && org.telegram.messenger.g0.Q1() && !this.f41318t0.s(menu)) {
                this.f41316s0.s(menu);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (actionMode.getType() != 1) {
            ActionBarLayout actionBarLayout = this.f41314r0;
            org.telegram.ui.ActionBar.k kVar = actionBarLayout.E;
            if (kVar != null) {
                kVar.setVisibility(8);
            }
            actionBarLayout.D0 = true;
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f41318t0;
                org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.E;
                if (kVar2 != null) {
                    kVar2.setVisibility(8);
                }
                actionBarLayout2.D0 = true;
                ActionBarLayout actionBarLayout3 = this.f41316s0;
                org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.E;
                if (kVar3 != null) {
                    kVar3.setVisibility(8);
                }
                actionBarLayout3.D0 = true;
            }
        }
    }

    @Override
    public final void onActivityResult(int i3, int i10, Intent intent) {
        ei.j4 currentPeerView;
        b8.ke keVar;
        VoIPService sharedInstance;
        boolean z10 = false;
        if (org.telegram.messenger.az.f21661s.length() != 0 && org.telegram.messenger.az.B != 0) {
            org.telegram.messenger.az.B = 0;
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.a8.b("reset lastPauseTime onActivityResult");
            }
            org.telegram.messenger.h10.i(this.P).v(false);
        }
        if (i3 == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            org.telegram.messenger.t0.G = canDrawOverlays;
            if (canDrawOverlays) {
                x30 x30Var = x30.f51711v5;
                if (x30Var != null) {
                    x30Var.K();
                }
                org.telegram.messenger.g0.i3(new m60(this, 5), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i3, i10, intent);
        String str = null;
        if (i3 >= 22336 && i3 <= 22399) {
            org.telegram.ui.Wallet.t0 t0Var = b8.vf.f3099b;
            if (t0Var != null && t0Var.f43187e == this && t0Var.f43188f && t0Var.f43189g == i3) {
                if (i10 != -1) {
                    str = "AUTH_CANCELED";
                }
                t0Var.c(str);
            }
        } else if (i3 == 520) {
            if (i10 == -1 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
                sharedInstance.createCaptureDevice(true);
            }
        } else if (i3 == 140) {
            org.telegram.messenger.ld f10 = org.telegram.messenger.ld.f(this.P);
            if (i10 == -1) {
                z10 = true;
            }
            Utilities.d.c(new org.telegram.messenger.g10(3, f10, z10));
        } else if (i3 == 521) {
            gi.j8 j8Var = this.f41317s1;
            if (j8Var != null) {
                if (i10 == -1) {
                    z10 = true;
                }
                j8Var.a(Boolean.valueOf(z10));
                this.f41317s1 = null;
            }
        } else {
            ThemeEditorView themeEditorView = ThemeEditorView.f31640p;
            if (themeEditorView != null && (keVar = themeEditorView.f31651m) != null) {
                keVar.u(i3, i10, intent);
            }
            ActionBarLayout actionBarLayout = this.f41314r0;
            if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
                org.telegram.ui.ActionBar.d2 d2Var = this.f41314r0.getFragmentStack().get(this.f41314r0.getFragmentStack().size() - 1);
                d2Var.onActivityResultFragment(i3, i10, intent);
                if (d2Var.getLastStoryViewer() != null && (currentPeerView = d2Var.getLastStoryViewer().f10939o0.getCurrentPeerView()) != null && i10 == -1) {
                    if (i3 != 0 && i3 != 2) {
                        if (i3 == 21) {
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
                                ei.x2 x2Var = currentPeerView.f10504s2;
                                if (x2Var != null) {
                                    x2Var.dismiss();
                                }
                                currentPeerView.i0(true);
                            }
                        }
                    } else {
                        currentPeerView.r0();
                        ei.x2 x2Var2 = currentPeerView.f10504s2;
                        if (x2Var2 != null) {
                            x2Var2.f32215b2.j0(i3, intent, null);
                        }
                    }
                }
            }
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f41318t0;
                if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                    this.f41318t0.getFragmentStack().get(this.f41318t0.getFragmentStack().size() - 1).onActivityResultFragment(i3, i10, intent);
                }
                ActionBarLayout actionBarLayout3 = this.f41316s0;
                if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                    this.f41316s0.getFragmentStack().get(this.f41316s0.getFragmentStack().size() - 1).onActivityResultFragment(i3, i10, intent);
                }
            }
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23212c5, Integer.valueOf(i3), Integer.valueOf(i10), intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (d0(true)) {
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.f41316s0;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.f41316s0.I();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.f41318t0;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.f41318t0.getFragmentStack().isEmpty()) {
                    org.telegram.ui.ActionBar.d2 d2Var = this.f41318t0.getFragmentStack().get(this.f41318t0.getFragmentStack().size() - 1);
                    if (d2Var.onBackPressed(true)) {
                        d2Var.finishFragment();
                        return;
                    }
                    return;
                }
                this.f41314r0.I();
                return;
            }
            this.f41314r0.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.g0.v(this, configuration);
        this.f41323v1.a();
        org.telegram.messenger.g0.x3(getWindow());
        super.onConfigurationChanged(configuration);
        this.f41308o0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        org.telegram.messenger.g0.d3();
        a0();
        E();
        org.telegram.messenger.g0.h3(new m60(this, 6));
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            int i3 = pipRoundVideoView.f31507y.getInt("sidex", 1);
            int i10 = pipRoundVideoView.f31507y.getInt("sidey", 0);
            float f10 = pipRoundVideoView.f31507y.getFloat("px", 0.0f);
            float f11 = pipRoundVideoView.f31507y.getFloat("py", 0.0f);
            pipRoundVideoView.f31505w.x = PipRoundVideoView.b(f10, i3, pipRoundVideoView.h, true);
            pipRoundVideoView.f31505w.y = PipRoundVideoView.b(f11, i10, pipRoundVideoView.f31502n, false);
            pipRoundVideoView.f31506x.updateViewLayout(pipRoundVideoView.f31497a, pipRoundVideoView.f31505w);
        }
        org.telegram.ui.Components.ut utVar = org.telegram.ui.Components.ut.K1;
        if (utVar != null) {
            utVar.c0(configuration);
        }
        xg.n nVar = xg.n.m1;
        if (nVar != null) {
            nVar.c0(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.V8;
        ThemeEditorView themeEditorView = ThemeEditorView.f31640p;
        if (themeEditorView != null) {
            int i11 = themeEditorView.f31650l.getInt("sidex", 1);
            int i12 = themeEditorView.f31650l.getInt("sidey", 0);
            float f12 = themeEditorView.f31650l.getFloat("px", 0.0f);
            float f13 = themeEditorView.f31650l.getFloat("py", 0.0f);
            themeEditorView.f31647i.x = ThemeEditorView.c(f12, i11, themeEditorView.f31646g, true);
            themeEditorView.f31647i.y = ThemeEditorView.c(f13, i12, themeEditorView.h, false);
            try {
                if (themeEditorView.f31643c.getParent() != null) {
                    themeEditorView.f31648j.updateViewLayout(themeEditorView.f31643c, themeEditorView.f31647i);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (org.telegram.ui.ActionBar.k6.f28074o == 3) {
            org.telegram.ui.ActionBar.k6.F(false);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int i3;
        String str;
        v9.b bVar;
        String str2;
        String str3;
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        G1 = true;
        H1++;
        boolean z10 = org.telegram.messenger.r2.f25040a;
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        K1 = this;
        org.telegram.messenger.t0.w();
        org.telegram.messenger.g0.v(this, getResources().getConfiguration());
        this.P = org.telegram.messenger.h10.f22829t0;
        this.f41298h1 = new androidx.mediarouter.app.f(this, 11);
        IntentFilter intentFilter = new IntentFilter("org.telegram.messenger.DEBUG_THEME");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.f41298h1, intentFilter, 2);
        } else {
            registerReceiver(this.f41298h1, intentFilter);
        }
        if (!org.telegram.messenger.h10.i(this.P).p() && (intent = getIntent()) != null && intent.getAction() != null) {
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
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28160s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.q6(1));
        getWindow().setFormat(-1);
        org.telegram.messenger.n6 n6Var = new org.telegram.messenger.n6(getWindow(), new org.telegram.ui.Components.lf0(29));
        this.f41296g1 = n6Var;
        n6Var.a();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            org.telegram.messenger.g0.E = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.k6.P();
        org.telegram.ui.ActionBar.k6.T(this);
        if (org.telegram.messenger.az.f21661s.length() != 0 && org.telegram.messenger.az.f21675x) {
            org.telegram.messenger.az.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        this.f41314r0 = new ActionBarLayout(this, true);
        l0 l0Var = new l0(12, this, this);
        this.f41326x0 = l0Var;
        l0Var.setClipToPadding(false);
        this.f41326x0.setClipChildren(false);
        setContentView(this.f41326x0);
        this.f41300i1 = new sh.d(this.f41326x0);
        n80 n80Var = new n80(this);
        l2.e eVar = this.f41306n0;
        ((uf.b) eVar.f17690b).f55825a.add(n80Var);
        ((ViewGroup) getWindow().getDecorView()).addView(eVar.h());
        eVar.h().bringToFront();
        org.telegram.ui.Components.wz0 wz0Var = new org.telegram.ui.Components.wz0(this);
        this.f41310p0 = wz0Var;
        wz0Var.setVisibility(8);
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3(this);
        this.A0 = l3Var;
        l3Var.setActionBarLayout(this.f41314r0);
        this.A0.addOnLayoutChangeListener(new Object());
        this.A0.setClipChildren(false);
        this.A0.setClipToPadding(false);
        this.f41326x0.addView(this.A0, b8.mf.c(-1.0f, -1));
        lg.k kVar = new lg.k(this, 5);
        this.f41312q0 = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f41326x0.addView(this.f41312q0, b8.mf.c(48.0f, 48));
        this.f41312q0.setVisibility(8);
        l0 l0Var2 = this.f41326x0;
        org.telegram.ui.ActionBar.j3 j3Var = new org.telegram.ui.ActionBar.j3(this);
        this.f41330z0 = j3Var;
        l0Var2.addView(j3Var);
        l0 l0Var3 = this.f41326x0;
        ?? gzVar = new org.telegram.ui.Components.gz(this);
        gzVar.setVisibility(8);
        this.f41328y0 = gzVar;
        l0Var3.addView(gzVar);
        E0();
        this.A0.setParentActionBarLayout(this.f41314r0);
        this.f41314r0.setDrawerLayoutContainer(this.A0);
        this.f41314r0.setFragmentStack(this.f41291e0);
        this.f41314r0.setFragmentStackChangedListener(new m60(this, 3));
        this.f41314r0.setDelegate(this);
        org.telegram.ui.ActionBar.k6.o1(true);
        A();
        Q0();
        int i10 = org.telegram.messenger.hs.f23257k4;
        org.telegram.messenger.hs.e().k(i10, this);
        this.f41289d0 = ConnectionsManager.getInstance(this.P).getConnectionState();
        za.p pVar = this.f41311p1;
        if (pVar != null) {
            pVar.a();
            this.f41311p1 = null;
        }
        za.p pVar2 = new za.p(org.telegram.messenger.hs.e(), this);
        pVar2.b(org.telegram.messenger.hs.M0);
        pVar2.b(org.telegram.messenger.hs.f23337x4);
        pVar2.b(org.telegram.messenger.hs.f23344y4);
        pVar2.b(org.telegram.messenger.hs.n4);
        pVar2.b(org.telegram.messenger.hs.f23310t4);
        pVar2.b(org.telegram.messenger.hs.f23297r4);
        pVar2.b(i10);
        pVar2.b(org.telegram.messenger.hs.f23269n0);
        pVar2.b(org.telegram.messenger.hs.f23351z4);
        pVar2.b(org.telegram.messenger.hs.K4);
        pVar2.b(org.telegram.messenger.hs.P4);
        pVar2.b(org.telegram.messenger.hs.f23273n5);
        pVar2.b(org.telegram.messenger.hs.f23258k5);
        pVar2.b(org.telegram.messenger.hs.M5);
        pVar2.b(org.telegram.messenger.hs.N5);
        this.f41311p1 = pVar2;
        p70 p70Var = new p70(this, 0);
        this.f41315r1 = p70Var;
        org.telegram.messenger.lc.a(p70Var);
        if (this.f41314r0.getFragmentStack().isEmpty() && ((actionBarLayout = this.f41316s0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!org.telegram.messenger.h10.i(this.P).p()) {
                this.f41314r0.c(-1, P());
            } else {
                this.f41314r0.c(-1, new ee0());
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
                                    this.f41314r0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.f41314r0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    wm wmVar = new wm(bundle2);
                                    if (this.f41314r0.c(-1, wmVar)) {
                                        wmVar.f51401m8 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    y40 y40Var = new y40(bundle2);
                                    if (this.f41314r0.c(-1, y40Var)) {
                                        y40Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    ad adVar = new ad(bundle2);
                                    if (this.f41314r0.c(-1, adVar)) {
                                        adVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", org.telegram.messenger.h10.i(this.P).f22848n);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.f41314r0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.f41314r0.c(-1, new c31(null));
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        E();
        F(false, true, !this.Y0);
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
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.a8.b("OS name " + str2 + " " + str3);
            }
            if ((str2.contains("flyme") || str3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                org.telegram.messenger.g0.f22615y = true;
                View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                s70 s70Var = new s70(rootView, 0);
                this.f41297h0 = s70Var;
                viewTreeObserver.addOnGlobalLayoutListener(s70Var);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        MediaController.B().K0 = this;
        ((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).getClass();
        try {
            boolean z12 = org.telegram.messenger.r2.f25040a;
            str = "" + org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f22848n;
            if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f() != null) {
                String n4 = org.telegram.messenger.l10.n(org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f());
                if (!TextUtils.isEmpty(n4)) {
                    str = "@" + n4;
                }
            }
            if (ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).isTestBackend()) {
                str = str + " [TEST SERVER]";
            }
            bVar = (v9.b) n9.h.c().b(v9.b.class);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        if (bVar != null) {
            z9.p pVar3 = bVar.f56485a;
            pVar3.f60227n.f286a.a(new xh.i(2, pVar3, str));
            bVar.b("version", "public");
            bVar.b("model", Build.MODEL);
            bVar.b("manufacturer", Build.MANUFACTURER);
            if (Build.VERSION.SDK_INT >= 31) {
                bVar.b("soc_model", org.telegram.messenger.go.f());
                bVar.b("soc_manufacturer", Build.SOC_MANUFACTURER);
            }
            bVar.b("device", Build.DEVICE);
            bVar.b("product", Build.PRODUCT);
            bVar.b("hardware", Build.HARDWARE);
            bVar.b("user", Build.USER);
            bVar.a();
            int i11 = Build.VERSION.SDK_INT;
            org.telegram.messenger.sr.b(true);
            if (i11 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - org.telegram.messenger.sr.f25410j.getLong("last_checked", 0L) >= 86400000 && org.telegram.messenger.sr.f25410j.getInt("dismissed_count", 0) < 3) {
                Pattern pattern = org.telegram.ui.Components.t4.f38241a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                String M0 = org.telegram.messenger.bd.M0(2131754283, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                if (org.telegram.messenger.sr.j()) {
                    if (i11 >= 31) {
                        i3 = 2131754281;
                    } else {
                        i3 = 2131754280;
                    }
                } else {
                    i3 = 2131754282;
                }
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i3, null));
                int i12 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder.m(2131624115, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
                alertDialog$Builder.n(i12, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new org.telegram.ui.Components.x0(this, 2));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                s1Var.setOnDismissListener(new gi.d1(3));
                s1Var.show();
                org.telegram.messenger.sr.f25410j.edit().putLong("last_checked", System.currentTimeMillis()).apply();
            }
            if (i11 >= 31) {
                getWindow().getDecorView().addOnAttachStateChangeListener(new q80(this));
            }
            org.telegram.ui.Components.ac.a(this.f41326x0, new ai.y(11));
            getWindow().getDecorView().setSystemUiVisibility(1792);
            Window window = getWindow();
            try {
                org.telegram.messenger.g0.S(window);
                if (i11 >= 28) {
                    window.setNavigationBarDividerColor(0);
                }
            } catch (Throwable th3) {
                org.telegram.messenger.a8.g(th3, true);
            }
            BackupAgent.a();
            gy0.a0(false);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 34) {
                if (this.f41305l1 == null) {
                    this.f41305l1 = new r80(this);
                }
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f41305l1);
            } else if (i13 >= 33) {
                if (this.m1 == null) {
                    this.m1 = new s80(this);
                }
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.m1);
            }
            B();
            return;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @Override
    public final void onDestroy() {
        cg.a0 a0Var;
        l0 l0Var;
        org.telegram.ui.Wallet.t0 t0Var = b8.vf.f3099b;
        if (t0Var != null && t0Var.f43187e == this) {
            t0Var.c("AUTH_CANCELED");
            b8.vf.f3099b.e();
        }
        G1 = false;
        H1--;
        androidx.mediarouter.app.f fVar = this.f41298h1;
        if (fVar != null) {
            unregisterReceiver(fVar);
            this.f41298h1 = null;
        }
        if (H1 == 0) {
            if (PhotoViewer.f41370c9 != null) {
                PhotoViewer.f41370c9.Q0();
            }
            if (PhotoViewer.F1()) {
                PhotoViewer.v1().Q0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f10 = SecretMediaViewer.f();
                Runnable runnable = f10.f41957o1;
                if (runnable != null) {
                    runnable.run();
                    f10.f41957o1 = null;
                }
                cg.u0 u0Var = f10.k1;
                if (u0Var != null) {
                    u0Var.b();
                    f10.k1 = null;
                }
                org.telegram.messenger.hs.f(f10.f41925a).n(f10, org.telegram.messenger.hs.f23325w);
                org.telegram.messenger.hs.f(f10.f41925a).n(f10, org.telegram.messenger.hs.f23259l0);
                org.telegram.messenger.hs.f(f10.f41925a).n(f10, org.telegram.messenger.hs.f23243i0);
                f10.f41965s = false;
                f10.M = null;
                org.telegram.messenger.cc ccVar = f10.f41944h0;
                if (ccVar != null) {
                    ccVar.a();
                    f10.f41944h0 = null;
                }
                f10.j();
                if (f10.f41928b != null && (l0Var = f10.d) != null) {
                    try {
                        if (l0Var.getParent() != null) {
                            ((WindowManager) f10.f41928b.getSystemService("window")).removeViewImmediate(f10.d);
                        }
                        f10.d = null;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                SecretMediaViewer.f41924w1 = null;
            }
            if (i4.G()) {
                i4.v().r();
            }
            if (is.f46381g0 != null) {
                is p10 = is.p();
                p10.E = false;
                p10.f46396l = null;
                p10.W = null;
                p10.Y = null;
                p10.f46383a0 = null;
                if (p10.f46406w != null && p10.f46408y != null) {
                    Bitmap bitmap = p10.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        p10.v = null;
                    }
                    p10.M = 0.0f;
                    p10.K = false;
                    try {
                        if (p10.f46408y.getParent() != null) {
                            ((WindowManager) p10.f46406w.getSystemService("window")).removeViewImmediate(p10.f46408y);
                        }
                        p10.f46408y = null;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                    is.f46381g0 = null;
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 8);
                }
            }
            x30 x30Var = x30.f51711v5;
            if (x30Var != null) {
                x30Var.K();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i3 = org.telegram.ui.ActionBar.k6.f27816a;
            org.telegram.ui.Components.ut utVar = org.telegram.ui.Components.ut.K1;
            if (utVar != null) {
                utVar.I0();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.f31640p;
            if (themeEditorView != null) {
                themeEditorView.b();
            }
            qg.h hVar = n9.b.f20286a;
            if (hVar != null) {
                hVar.f53933e.edit().putFloat("x", (float) hVar.f53932c.f53653m.f53661i).putFloat("y", (float) hVar.d.f53653m.f53661i).commit();
            }
            n9.b.f20286a = null;
            SparseArray sparseArray = org.telegram.ui.Components.g5.f33957r;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController B = MediaController.B();
        if (B.K0 == this) {
            B.K0 = null;
        }
        MediaController B2 = MediaController.B();
        if (B2.L0 == this.f41321u1) {
            B2.L0 = null;
        }
        for (int i10 = 0; i10 < this.F0.size(); i10++) {
            try {
                if (((Dialog) this.F0.get(i10)).isShowing()) {
                    ((Dialog) this.F0.get(i10)).dismiss();
                }
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        this.F0.clear();
        try {
            if (this.f41297h0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f41297h0);
            }
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (this.f41305l1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f41305l1);
            }
        } else if (i11 >= 33 && this.f41305l1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.m1);
        }
        org.telegram.ui.Components.ac.h(this.f41326x0);
        VideoAds.dropCache();
        I();
        super.onDestroy();
        e0();
        org.telegram.messenger.n6 n6Var = this.f41296g1;
        if (n6Var != null) {
            n6Var.e();
        }
        if (i11 >= 24 && (a0Var = this.k1) != null) {
            a0Var.c();
        }
    }

    @Override
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (i3 == 82 && !org.telegram.messenger.az.C) {
            if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                return super.onKeyUp(i3, keyEvent);
            }
            if (i4.G() && i4.v().W) {
                return super.onKeyUp(i3, keyEvent);
            }
            if (org.telegram.messenger.g0.Q1()) {
                if (this.f41316s0.getView().getVisibility() == 0 && !this.f41316s0.getFragmentStack().isEmpty()) {
                    this.f41316s0.getView().onKeyUp(i3, keyEvent);
                } else if (this.f41318t0.getView().getVisibility() == 0 && !this.f41318t0.getFragmentStack().isEmpty()) {
                    this.f41318t0.getView().onKeyUp(i3, keyEvent);
                } else {
                    this.f41314r0.getView().onKeyUp(i3, keyEvent);
                }
            } else {
                this.f41314r0.getView().onKeyUp(i3, keyEvent);
            }
        }
        return super.onKeyUp(i3, keyEvent);
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.f41314r0;
        if (actionBarLayout != null) {
            actionBarLayout.M();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout2 = this.f41318t0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.M();
                }
                ActionBarLayout actionBarLayout3 = this.f41316s0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.M();
                }
            }
        }
    }

    @Override
    public final void onMultiWindowModeChanged(boolean z10) {
        org.telegram.messenger.g0.E = z10;
        this.f41323v1.a();
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
        I1 = false;
        org.telegram.utils.twidget.p.q(true);
        uf.b bVar = this.f41308o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (org.telegram.messenger.g0.H1(bVar.d) && bVar.e() && Build.VERSION.SDK_INT >= 31) {
            bVar.b();
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23249j1, 4096);
        org.telegram.messenger.t0.f25465x = true;
        Utilities.d.c(new ii.i2(this.P, 12));
        g0();
        this.f41314r0.O();
        if (org.telegram.messenger.g0.Q1()) {
            ActionBarLayout actionBarLayout = this.f41318t0;
            if (actionBarLayout != null) {
                actionBarLayout.O();
            }
            ActionBarLayout actionBarLayout2 = this.f41316s0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.O();
            }
        }
        org.telegram.ui.Components.bc0 bc0Var = this.B0;
        if (bc0Var != null) {
            bc0Var.f32159b.k();
        }
        ArrayList arrayList = this.C0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((org.telegram.ui.Components.zb0) obj).k();
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25456a;
        ConnectionsManager.getInstance(this.P).setAppPaused(true, false);
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            if (v12.f41463k2 != null) {
                v12.H0(false, false);
            } else {
                org.telegram.ui.Components.m51 m51Var = v12.G2;
                if (m51Var != null && v12.f41375a3) {
                    m51Var.s0(org.telegram.messenger.g0.H1(v12.E));
                }
            }
        }
        gi.va vaVar = gi.va.G2;
        if (vaVar != null) {
            vaVar.u(false);
            gi.la laVar = vaVar.f13710d1;
            if (laVar != null) {
                laVar.f13144f.r();
            }
            gi.ja jaVar = vaVar.Y0;
            if (jaVar != null) {
                jaVar.x(0, true);
            }
        }
        zb1 zb1Var = zb1.f52603o1;
        if (zb1Var != null) {
            boolean isInteractive = ((PowerManager) zb1Var.f52607b.getSystemService("power")).isInteractive();
            int a10 = xf.b.a(zb1Var.f52607b);
            if (a10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zb1Var.E0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a10 == 2) {
                int measuredHeight = zb1.f52603o1.f52644v0.getMeasuredHeight();
                zb1 zb1Var2 = zb1.f52603o1;
                org.telegram.ui.Components.voip.u1.e(zb1Var2.f52607b, zb1Var2.f52604a, zb1Var2.f52644v0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = zb1.f52603o1.f52641s0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.u1.Y = windowInsets.getSystemWindowInsetTop();
                    zb1.f52603o1.f52641s0.getSystemWindowInsetBottom();
                }
            }
            if (zb1Var.f52635o0 && ((!z10 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                org.telegram.ui.Components.voip.u1 d = org.telegram.ui.Components.voip.u1.d();
                if (d.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (d.H) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = yh.e.f59495n;
        if (hashMap != null) {
            for (yh.e eVar : hashMap.values()) {
                yh.d dVar = eVar.f59500f;
                if (dVar != null) {
                    dVar.f59485b = true;
                }
            }
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        uf.b bVar = this.f41308o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (bVar.f55829f) {
            if (z10) {
                bVar.d(1.0f);
                bVar.f55832j.a();
                ArrayList arrayList = bVar.f55826b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((wf.e) obj).getClass();
                }
                if (bVar.f55836n) {
                    bVar.f55836n = false;
                    bVar.f55834l.removeFrameCallback(bVar.f55835m);
                }
                ArrayList arrayList2 = bVar.f55825a;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    ((vf.b) obj2).f();
                }
            } else if (bVar.f55828e) {
                bVar.c(false);
            } else {
                bVar.a(true);
            }
        }
        if (!z10 && !this.f41319t1) {
            if (org.telegram.ui.Components.voip.s0.f39589e0.W) {
                org.telegram.ui.Components.voip.s0.b();
            }
            if (ei.n1.f10647a0.T) {
                ei.n1.b();
            }
            if (org.telegram.ui.Components.ie0.f34683q0.Q) {
                org.telegram.ui.Components.ie0.b(false);
            }
            x30.v1(this, null, false, true);
            if (PhotoViewer.f41370c9 != null) {
                PhotoViewer.f41370c9.Q0();
            }
            if (PhotoViewer.F1()) {
                PhotoViewer.v1().H0(false, false);
            }
        }
    }

    @Override
    public final boolean onPictureInPictureRequested() {
        uf.b bVar = this.f41308o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        bVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.f41308o0.g(pictureInPictureUiState);
    }

    @Override
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        boolean z10;
        cg.l0 l0Var;
        super.onRequestPermissionsResult(i3, strArr, iArr);
        if (!u(i3, strArr, iArr)) {
            return;
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25456a;
        if (this.f41314r0.getFragmentStack().size() != 0) {
            this.f41314r0.getFragmentStack().get(this.f41314r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i3, strArr, iArr);
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (this.f41318t0.getFragmentStack().size() != 0) {
                this.f41318t0.getFragmentStack().get(this.f41318t0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i3, strArr, iArr);
            }
            if (this.f41316s0.getFragmentStack().size() != 0) {
                this.f41316s0.getFragmentStack().get(this.f41316s0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i3, strArr, iArr);
            }
        }
        zb1.k(iArr, i3);
        gi.va vaVar = gi.va.G2;
        if (vaVar != null) {
            ei.b bVar = vaVar.f13698a;
            Activity activity = vaVar.f13702b;
            if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i3 == 111) {
                vaVar.f13761t2 = !z10;
                if (z10 && vaVar.f13720g0 == 0) {
                    vaVar.B0.setCameraThumb(null);
                    if (CameraController.getInstance().isCameraInitied()) {
                        vaVar.q();
                    } else {
                        CameraController.getInstance().initCamera(new gi.v8(vaVar, 0));
                    }
                }
            } else if (i3 == 114) {
                if (z10) {
                    MediaController.O(0);
                    vaVar.e(true);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, bVar);
                    int i10 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(2131624118, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
                    alertDialog$Builder.n(i10, null);
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747307, null));
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.U = X2;
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new gi.e9(vaVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                    s1Var.show();
                }
            } else if (i3 == 112) {
                if (!z10) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, activity, bVar);
                    int i11 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder2.m(2131624116, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                    alertDialog$Builder2.n(i11, null);
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747317, null));
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.U = X22;
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747308, null), new gi.e9(vaVar, 3));
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                    s1Var2.show();
                }
            } else if (i3 == 115) {
                if (!z10) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, activity, bVar);
                    int i12 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder3.m(2131624118, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
                    alertDialog$Builder3.n(i12, null);
                    SpannableStringBuilder X23 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747321, null));
                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.f27343a;
                    s1Var3.U = X23;
                    alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131747308, null), new gi.e9(vaVar, 5));
                    alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                    s1Var3.show();
                }
                if (z10 && (l0Var = vaVar.f13782z2) != null) {
                    l0Var.run();
                }
                vaVar.f13782z2 = null;
            }
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23218d5, Integer.valueOf(i3), strArr, iArr);
        SparseIntArray sparseIntArray = this.f41290d1;
        if (sparseIntArray.get(i3, -1) >= 0) {
            int i13 = sparseIntArray.get(i3, -1);
            sparseIntArray.delete(i3);
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23279o5, Integer.valueOf(i13));
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23285p5, Integer.valueOf(i3), strArr, iArr);
    }

    @Override
    public final void onResume() {
        org.telegram.messenger.zi ziVar;
        tg.s0 s0Var;
        org.telegram.messenger.pe peVar;
        super.onResume();
        org.telegram.utils.twidget.p.q(false);
        I1 = true;
        uf.b bVar = this.f41308o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (bVar.f55829f) {
            bVar.a(false);
        }
        org.telegram.ui.Components.nt ntVar = J1;
        if (ntVar != null) {
            ntVar.run();
            J1 = null;
        }
        if (org.telegram.ui.ActionBar.k6.f28074o == 3) {
            org.telegram.ui.ActionBar.k6.F(false);
        }
        org.telegram.messenger.ld[] ldVarArr = org.telegram.messenger.ld.P;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            } else if (org.telegram.messenger.h10.i(i3).p() && !org.telegram.messenger.ld.f(i3).J.isEmpty()) {
                org.telegram.messenger.ld.q();
                break;
            } else {
                i3++;
            }
        }
        H(true);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 4096);
        MediaController B = MediaController.B();
        ViewGroup view = this.f41314r0.getView();
        this.f41321u1 = view;
        B.L0 = view;
        org.telegram.messenger.t0.f25465x = false;
        org.telegram.messenger.hp.s1(this.P).T4(null);
        I0();
        Utilities.d.c(new org.telegram.ui.Components.go(20));
        C(0);
        if (Build.VERSION.SDK_INT >= 24 && (peVar = MediaController.f21295b2) != null) {
            Utilities.f21387e.e(new ii.i2(peVar.f24738e.size(), 3), 2000L);
        }
        h0();
        org.telegram.ui.Components.bc0 bc0Var = this.B0;
        if (bc0Var != null && bc0Var.f32159b.getVisibility() == 0) {
            this.f41314r0.n();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout = this.f41318t0;
                if (actionBarLayout != null) {
                    actionBarLayout.n();
                }
                ActionBarLayout actionBarLayout2 = this.f41316s0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.n();
                }
            }
            this.B0.f32159b.l();
            ArrayList arrayList = this.C0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.ui.Components.zb0) obj).l();
            }
        } else {
            this.f41314r0.P();
            if (org.telegram.messenger.g0.Q1()) {
                ActionBarLayout actionBarLayout3 = this.f41318t0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.P();
                }
                ActionBarLayout actionBarLayout4 = this.f41316s0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.P();
                }
            }
        }
        ConnectionsManager.getInstance(this.P).setAppPaused(false, false);
        Q0();
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            gq0 gq0Var = v12.f41420f0;
            if (gq0Var != null) {
                gq0Var.invalidate();
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.o2(v12, 0, 22), 100L);
            }
            org.telegram.ui.Components.m51 m51Var = v12.G2;
            if (m51Var != null) {
                m51Var.p0(m51Var.S() + 1);
                if (v12.f41375a3) {
                    v12.G2.s0(true);
                }
            }
            lp0 lp0Var = v12.M1;
            if (lp0Var != null && (s0Var = lp0Var.G0.d) != null) {
                s0Var.postRunnable(s0Var.f55313x);
            }
        }
        gi.va vaVar = gi.va.G2;
        if (vaVar != null) {
            vaVar.O();
        }
        if (PipRoundVideoView.G != null && MediaController.B().H() && (ziVar = MediaController.B().f21348v0) != null) {
            MediaController.B().i0(ziVar, ziVar.f26828b0);
        }
        if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f22832a0 != null) {
            int i11 = org.telegram.messenger.h10.f22829t0;
            L0(i11, org.telegram.messenger.h10.i(i11).f22832a0);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.az.f21639j1;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(org.telegram.messenger.h10.f22829t0, tL_help_appUpdate, true);
            }
        }
        z(false);
        org.telegram.messenger.t0.G = Settings.canDrawOverlays(this);
        zb1 zb1Var = zb1.f52603o1;
        if (zb1Var != null) {
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                org.telegram.ui.Components.voip.u1.a();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                zb1Var.G();
            } else if (VoIPService.getSharedState() == null) {
                zb1Var.f52644v0.b();
            }
            zb1Var.K0 = ((KeyguardManager) zb1Var.f52607b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                org.telegram.ui.Components.voip.u1.d().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        a0();
        HashMap hashMap = yh.e.f59495n;
        if (hashMap != null) {
            for (yh.e eVar : hashMap.values()) {
                yh.d dVar = eVar.f59500f;
                if (dVar != null) {
                    dVar.f59485b = false;
                }
            }
        }
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25456a;
        b0 b0Var = M1;
        if (b0Var != null) {
            b0Var.run();
            M1 = null;
        }
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.P);
        if (!s12.T3.contains("SETUP_LOGIN_EMAIL") && !s12.T3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            return;
        }
        Utilities.d.c(new org.telegram.messenger.mj(org.telegram.messenger.hp.s1(this.P), 26));
    }

    @Override
    public final void onSaveInstanceState(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override
    public final void onStart() {
        Activity activity;
        super.onStart();
        this.f41319t1 = true;
        this.f41308o0.h();
        WeakReference weakReference = sf.c.f54713e;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = (Activity) weakReference.get();
        }
        if (activity != null && activity != this) {
            sf.c.y(activity);
        }
        if (sf.c.f54711b == null) {
            sf.c.f54713e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(sf.c.d)) {
                    String a10 = b8.t1.a(this);
                    sf.c.d = a10;
                    if (a10 == null) {
                    }
                }
                Object obj = new Object();
                bg.a aVar = new bg.a();
                aVar.f3297b = new WeakReference(obj);
                sf.c.f54712c = aVar;
                String str = sf.c.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, aVar, 33)) {
                    sf.c.f54712c = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.t0.f25466y = false;
        org.telegram.ui.Components.l10.j(this);
        x30 x30Var = x30.f51711v5;
        if (x30Var != null) {
            ArrayList arrayList = x30Var.R3;
            x30.A5 = false;
            x30Var.H1.f();
            q10 q10Var = x30Var.f51733e4;
            if (q10Var.getVisibility() == 0) {
                x30Var.f51745h4.G(q10Var, false);
            }
            if (x30.f51714y5) {
                x30Var.f51741g4.I(x30Var.f51737f4, false);
            }
            arrayList.clear();
            arrayList.addAll(x30Var.Q3);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(true);
            }
            d30 d30Var = x30Var.D1;
            org.telegram.ui.Components.q61 q61Var = d30Var.f37539w;
            if (q61Var != null) {
                q61Var.c(true);
            }
            d30Var.G = false;
            x30Var.f51822z1.s();
        }
    }

    @Override
    public final void onStop() {
        tp0 tp0Var;
        super.onStop();
        org.telegram.ui.Wallet.t0 t0Var = b8.vf.f3099b;
        if (t0Var != null && t0Var.f43187e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.t0 t0Var2 = b8.vf.f3099b;
            if (!t0Var2.f43188f) {
                t0Var2.c("AUTH_CANCELED");
                b8.vf.f3099b.e();
            }
        }
        this.f41319t1 = false;
        uf.b bVar = this.f41308o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        bVar.f55828e = false;
        if (bVar.f55829f) {
            bVar.c(true);
        }
        bVar.d.unregisterReceiver(bVar.f55837o);
        if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer v12 = PhotoViewer.v1();
            if (!org.telegram.messenger.g0.H1(v12.E) && (v12.G2 == null ? !((tp0Var = v12.f41429g0) == null || !tp0Var.f38729y || !tp0Var.H) : v12.Q3)) {
                v12.k2();
            }
        }
        sf.c.y(this);
        org.telegram.messenger.t0.f25466y = true;
        org.telegram.ui.Components.l10.j(this);
        x30 x30Var = x30.f51711v5;
        if (x30Var != null) {
            x30.A5 = true;
            ArrayList arrayList = x30Var.R3;
            arrayList.clear();
            arrayList.addAll(x30Var.Q3);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(false);
            }
            d30 d30Var = x30Var.D1;
            org.telegram.ui.Components.q61 q61Var = d30Var.f37539w;
            if (q61Var != null) {
                q61Var.c(false);
            }
            d30Var.G = true;
            x30Var.f51822z1.r();
        }
    }

    @Override
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f41302j1 = false;
    }

    @Override
    public final void onUserLeaveHint() {
        uf.b bVar = this.f41308o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        bVar.f();
        ArrayList arrayList = this.f41288c1;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.f41314r0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.V0.isEmpty()) {
                ((org.telegram.ui.ActionBar.d2) t4.c.d(1, actionBarLayout.V0)).onUserLeaveHint();
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
        ei.i7 a10;
        long[] jArr2 = jArr;
        int i3 = 0;
        while (true) {
            if (i3 < jArr2.length) {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(this.P).a2(Long.valueOf(jArr2[i3]));
                if (a22 != null && !a22.stories_hidden) {
                    z11 = false;
                    break;
                }
                i3++;
            } else {
                z11 = true;
                break;
            }
        }
        org.telegram.ui.ActionBar.d2 Q = Q();
        if (Q != null) {
            ei.z6 P1 = org.telegram.messenger.hp.s1(this.P).P1();
            if (z11) {
                arrayList = P1.h;
            } else {
                arrayList = P1.f11279g;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            boolean z12 = z11;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z12) {
                ArrayList arrayList5 = new ArrayList();
                for (int i10 = 0; i10 < jArr2.length; i10++) {
                    TLRPC.User a23 = org.telegram.messenger.hp.s1(this.P).a2(Long.valueOf(jArr2[i10]));
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
                for (int i12 = 0; i12 < jArr2.length; i12 = a1.g.h(i12, 1, jArr2[i12], arrayList4)) {
                }
            } else {
                for (int i13 = 0; i13 < jArr2.length; i13 = a1.g.h(i13, 1, jArr2[i13], arrayList3)) {
                }
            }
            if (!arrayList4.isEmpty() && z10) {
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.P);
                int[] iArr = {arrayList4.size()};
                pp ppVar = new pp(this, iArr, jArr2, 17);
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    long longValue = ((Long) arrayList4.get(i14)).longValue();
                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                    TLRPC.InputPeer j12 = s12.j1(longValue);
                    tL_stories_getPeerStories.peer = j12;
                    if (j12 instanceof TLRPC.TL_inputPeerEmpty) {
                        iArr[0] = iArr[0] - 1;
                    } else {
                        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getPeerStories, new ci.u2(s12, longValue, ppVar, 6));
                    }
                }
                return;
            }
            long e10 = org.telegram.messenger.h10.i(this.P).e();
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                long o10 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i15)).peer);
                if (o10 != e10 && !arrayList3.contains(Long.valueOf(o10)) && P1.L(o10)) {
                    arrayList3.add(Long.valueOf(o10));
                }
            }
            if (!arrayList3.isEmpty()) {
                if (Q instanceof uw) {
                    try {
                        a10 = ei.i7.a(((uw) Q).F0.h);
                    } catch (Exception unused) {
                    }
                    ei.i7 i7Var = a10;
                    Q.getOrCreateStoryViewer().J();
                    Q.getOrCreateStoryViewer().U(this, null, arrayList3, 0, null, null, i7Var, false);
                }
                a10 = null;
                ei.i7 i7Var2 = a10;
                Q.getOrCreateStoryViewer().J();
                Q.getOrCreateStoryViewer().U(this, null, arrayList3, 0, null, null, i7Var2, false);
            }
        }
    }

    public final void q0(final int i3, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        ei.r6 r6Var;
        ei.r6 A;
        org.telegram.messenger.zi f10;
        org.telegram.messenger.zi f11;
        TL_stories.StoryItem storyItem2;
        ei.z6 P1 = org.telegram.messenger.hp.s1(this.P).P1();
        TL_stories.PeerStories y9 = P1.y(j10);
        ei.i7 i7Var = null;
        if (y9 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < y9.stories.size()) {
                    if (y9.stories.get(i10).f27240id == i3) {
                        storyItem2 = y9.stories.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    storyItem2 = null;
                    break;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j10;
                org.telegram.ui.ActionBar.d2 Q = Q();
                if (Q != null) {
                    if (Q instanceof uw) {
                        try {
                            i7Var = ei.i7.a(((uw) Q).F0.h);
                        } catch (Exception unused) {
                        }
                    }
                    ei.i7 i7Var2 = i7Var;
                    Q.getOrCreateStoryViewer().J();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(storyItem2.dialogId));
                    if (z10) {
                        Q.getOrCreateStoryViewer().f10962x1 = true;
                    }
                    Q.getOrCreateStoryViewer().U(this, storyItem2, arrayList, 0, null, y9, i7Var2, false);
                    return;
                }
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            ei.r6 A2 = P1.A(0, -1, j10, true);
            if (A2 != null && (f11 = A2.f(i3)) != null) {
                storyItem = f11.f26871l;
            } else {
                A2 = null;
            }
            if (storyItem == null && (A = P1.A(1, -1, j10, true)) != null && (f10 = A.f(i3)) != null) {
                storyItem = f10.f26871l;
                r6Var = A;
            } else {
                r6Var = A2;
            }
            if (storyItem != null && r6Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.d2 Q2 = Q();
                if (Q2 == null) {
                    return;
                }
                if (Q2 instanceof uw) {
                    try {
                        i7Var = ei.i7.a(((uw) Q2).F0.h);
                    } catch (Exception unused2) {
                    }
                }
                ei.i7 i7Var3 = i7Var;
                Q2.getOrCreateStoryViewer().J();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    Q2.getOrCreateStoryViewer().f10962x1 = true;
                }
                Q2.getOrCreateStoryViewer().U(this, storyItem, arrayList2, 0, r6Var, null, i7Var3, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = org.telegram.messenger.hp.s1(this.P).j1(j10);
        tL_stories_getStoriesByID.f27247id.add(Integer.valueOf(i3));
        ConnectionsManager.getInstance(this.P).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str = LaunchActivity.E1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i11 = i3;
                final long j11 = j10;
                final boolean z11 = z10;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        TL_stories.StoryItem storyItem3;
                        String str2 = LaunchActivity.E1;
                        TLObject tLObject2 = tLObject;
                        ei.i7 i7Var4 = null;
                        if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                            int i12 = 0;
                            while (true) {
                                if (i12 < tL_stories_stories.stories.size()) {
                                    if (tL_stories_stories.stories.get(i12).f27240id == i11) {
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
                                long j12 = j11;
                                storyItem3.dialogId = j12;
                                org.telegram.ui.ActionBar.d2 Q3 = LaunchActivity.Q();
                                if (Q3 == null) {
                                    return;
                                }
                                if (Q3 instanceof uw) {
                                    try {
                                        i7Var4 = ei.i7.a(((uw) Q3).F0.h);
                                    } catch (Exception unused3) {
                                    }
                                }
                                ei.i7 i7Var5 = i7Var4;
                                Q3.getOrCreateStoryViewer().J();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(Long.valueOf(j12));
                                if (z11) {
                                    Q3.getOrCreateStoryViewer().f10962x1 = true;
                                }
                                Q3.getOrCreateStoryViewer().U(LaunchActivity.this, storyItem3, arrayList3, 0, null, null, i7Var5, false);
                                return;
                            }
                        }
                        org.telegram.ui.Components.fc.X().Q(2131624011, 36, org.telegram.messenger.bd.M0(2131744616, null)).k(false);
                    }
                });
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.j6 j6Var) {
        int i3 = j6Var.f27686g0;
        boolean z10 = false;
        org.telegram.ui.ActionBar.g6 f10 = j6Var.f(tL_theme, this.P, 0);
        j6Var.f27676a0 = j6Var.Z;
        j6Var.u(f10.f27525a);
        f10.f27541s = tL_wallPaper;
        if (i3 != j6Var.f27686g0) {
            z10 = true;
        }
        t0(new l71(j6Var, z10, 0, false, false));
    }

    public final void s0(final int r16, int r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, org.telegram.tgnet.TLRPC.TL_forumTopic r20, final java.lang.Runnable r21, final java.lang.String r22, final java.lang.Integer r23, final byte[] r24, final int r25, final java.util.ArrayList r26, final int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.s0(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    @Override
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        uf.b bVar = this.f41308o0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        bVar.h = pictureInPictureParams;
    }

    @Override
    public final void setRequestedOrientation(int i3) {
        org.telegram.messenger.g0.f22591g = -10;
        org.telegram.messenger.g0.h = -10;
        org.telegram.messenger.g0.f22594i = null;
        super.setRequestedOrientation(i3);
    }

    public final void t0(org.telegram.ui.ActionBar.d2 d2Var) {
        ((ActionBarLayout) M()).S(d2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) M()).V(d2Var, z10, z11);
    }

    public final void v0(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.F0;
            if (i3 < arrayList.size()) {
                if (arrayList.get(i3) instanceof ii.a3) {
                    ii.a3 a3Var = (ii.a3) arrayList.get(i3);
                    if (a3Var.isShowing() && a3Var.J == j10) {
                        return;
                    }
                }
                i3++;
            } else {
                org.telegram.ui.ActionBar.d2 T = T();
                if (T != null && T.sheetsStack != null) {
                    for (int i10 = 0; i10 < T.sheetsStack.size(); i10++) {
                        if (T.sheetsStack.get(i10).s()) {
                            T.sheetsStack.get(i10);
                        }
                    }
                }
                gx x10 = this.f41314r0.x();
                if (x10 != null && x10.sheetsStack != null) {
                    for (int i11 = 0; i11 < x10.sheetsStack.size(); i11++) {
                        if (x10.sheetsStack.get(i11).s()) {
                            x10.sheetsStack.get(i11);
                        }
                    }
                }
                p70 p70Var = new p70(this, 1);
                TLRPC.User a22 = org.telegram.messenger.hp.s1(this.P).a2(Long.valueOf(j10));
                if (a22 != null) {
                    p70Var.a(a22);
                    return;
                } else {
                    org.telegram.messenger.qr.a0(this.P).f24934a.c(new z70(this, j10, p70Var, 0));
                    return;
                }
            }
        }
    }

    public final void w0(Long l10, ly lyVar, sf.b bVar, org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.f3 G0 = org.telegram.messenger.hp.s1(this.P).G0();
        if (bVar != null) {
            bVar.d();
        }
        G0.a(l10.longValue(), new n60(this, bVar, lyVar, G0, l10, q1Var));
    }

    public final void x(int i3) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.B1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B1 = null;
        }
        if (i11 >= 26) {
            i10 = getWindow().getNavigationBarColor();
        } else {
            i10 = 0;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10, i3);
        this.B1 = ofArgb;
        ofArgb.addUpdateListener(new l60(this, 1));
        this.B1.addListener(new s0(this, i3, 2));
        this.B1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.B1.setDuration(320L);
        this.B1.start();
    }

    public final void x0(final int i3, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l10, final Long l11, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i10, final int i11, final String str23, final String str24, final String str25, String str26, final String str27, final sf.b bVar, final boolean z12, final int i12, final int i13, final int i14, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = org.telegram.messenger.hp.s1(i3).q1(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                String str30 = LaunchActivity.E1;
                final sf.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i15 = i3;
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
                            String str58 = LaunchActivity.E1;
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
                        org.telegram.ui.ActionBar.d2 d2Var;
                        String str59 = LaunchActivity.E1;
                        runnable2.run();
                        AtomicBoolean atomicBoolean = new AtomicBoolean();
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.f41291e0;
                        fz fzVar = null;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList);
                        } else {
                            d2Var = null;
                        }
                        int i21 = i15;
                        TLRPC.User user3 = user2;
                        TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                        String str60 = str58;
                        boolean z34 = z23;
                        boolean z35 = z24;
                        boolean z36 = z25;
                        boolean z37 = z22;
                        o70 o70Var = new o70(launchActivity2, d2Var, i21, user3, tL_messages_botApp2, atomicBoolean, str60, z34, z35, z36, z37);
                        if (z32) {
                            o70Var.run();
                        } else if (tL_messages_botApp2.inactive && z33) {
                            s3 s3Var = new s3(o70Var, 9);
                            sf.b bVar3 = bVar2;
                            if (bVar3 != null) {
                                fzVar = new fz(bVar3, 15);
                            }
                            rc1.a(launchActivity2, s3Var, fzVar);
                        } else if (!tL_messages_botApp2.request_write_access && !z37) {
                            o70Var.run();
                        } else {
                            org.telegram.ui.Components.t4.m(d2Var, atomicBoolean, user3, o70Var);
                        }
                    }
                });
            }
        });
    }

    @Override
    public final boolean y(org.telegram.ui.uw r49, java.util.ArrayList r50, final java.lang.CharSequence r51, boolean r52, boolean r53, int r54, final int r55, org.telegram.ui.m91 r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.y(org.telegram.ui.uw, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.m91):boolean");
    }

    public final void y0(boolean z10) {
        ActionBarLayout actionBarLayout = this.f41316s0;
        if (actionBarLayout != null) {
            actionBarLayout.X(z10, z10);
        } else {
            this.f41314r0.X(z10, z10);
        }
    }

    public final void z(boolean z10) {
        org.telegram.messenger.h1 e10;
        String str;
        int i3;
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        if (!z10) {
            boolean z11 = org.telegram.messenger.r2.f25040a;
        }
        if (org.telegram.messenger.t0.f25456a.q()) {
            org.telegram.messenger.d1 d1Var = null;
            if (((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q() && (str = (e10 = org.telegram.messenger.h1.e()).f22819a) != null && (i3 = e10.f22820b) != 0) {
                d1Var = new org.telegram.messenger.d1(str, i3, e10.f22821c);
            }
            boolean z12 = this.f41313q1;
            this.f41313q1 = false;
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25456a;
            a60 a60Var = new a60(this, z12, d1Var, 2);
            if (((ApplicationLoaderImpl) t0Var).q()) {
                org.telegram.messenger.h1.e().a(a60Var, z10);
            }
        } else if (!z10 && Math.abs(System.currentTimeMillis() - org.telegram.messenger.az.f21644l1) < org.telegram.messenger.hp.s1(0).f23089p3 * 1000) {
        } else {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = org.telegram.messenger.t0.f25457b.getPackageManager().getInstallerPackageName(org.telegram.messenger.t0.f25457b.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            int i10 = this.P;
            ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new ci.a2(this, i10, 7));
        }
    }

    public final int z0(final int i3, final ly lyVar, final Integer num, final Integer num2, final Long l10, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i10, final int i11) {
        int longValue;
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.hp.l1(chat);
        if (num2 != null) {
            longValue = num.intValue();
        } else {
            longValue = (int) l10.longValue();
        }
        tL_messages_getDiscussionMessage.msg_id = longValue;
        return ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                String str2 = LaunchActivity.E1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i12 = i3;
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
                final Runnable runnable3 = lyVar;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d70.run():void");
                    }
                });
            }
        });
    }

    @Override
    public final void e(int[] iArr) {
    }
}
