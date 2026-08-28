package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
public class WallpapersListActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[][] f36296g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f36297h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f36298i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f36299j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f36300k0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public yh1 A;
    public xh1 B;
    public yh1 C;
    public org.telegram.ui.Components.wk0 D;
    public zh1 E;
    public bi1 F;
    public of.y G;
    public org.telegram.ui.ActionBar.w0 H;
    public NumberTextView I;
    public org.telegram.ui.Components.yy J;
    public final ArrayList K;
    public org.telegram.ui.ActionBar.c2 L;
    public org.telegram.ui.Components.u71 M;
    public int N;
    public String O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public boolean V;
    public boolean W;
    public final ArrayList X;
    public final HashMap Y;
    public final HashMap Z;
    public int f36301a;
    public final ArrayList f36302a0;
    public int f36303b;
    public final ArrayList f36304b0;
    public int f36305c;
    public ArrayList f36306c0;
    public int d;
    public final HashMap f36307d0;
    public int f36308e;
    public final LongSparseArray f36309e0;
    public int f36310f;
    public boolean f36311f0;
    public int h;
    public int f36312n;
    public int f36313r;
    public int f36314s;
    private int uploadImageRow;
    public final int v;
    public Paint f36315w;
    public Paint f36316x;
    public xh1 f36317y;

    public WallpapersListActivity(int i9) {
        super(null);
        this.K = new ArrayList();
        this.N = 3;
        this.O = "";
        this.X = new ArrayList();
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.f36302a0 = new ArrayList();
        this.f36304b0 = new ArrayList();
        this.f36306c0 = new ArrayList();
        this.f36307d0 = new HashMap();
        this.f36309e0 = new LongSparseArray();
        this.v = i9;
    }

    public static void T(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.f36309e0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.C0();
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.L = c2Var;
        c2Var.f22766c0 = false;
        c2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new m(wallpapersListActivity, 24));
    }

    public static void U(WallpapersListActivity wallpapersListActivity, int i9) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.D.getAdapter() != wallpapersListActivity.F) {
            if (i9 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.M.b();
            } else if (i9 == wallpapersListActivity.f36303b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f36306c0 = wallpapersListActivity.f36306c0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i9 == wallpapersListActivity.h) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rh1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                wallpapersListActivity.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                }
            }
        }
    }

    public static void q0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.xi xiVar, Object obj, int i9) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        xh1 xh1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f36309e0;
        boolean z10 = false;
        if (wallpapersListActivity.actionBar.s()) {
            if (xh1Var instanceof xh1) {
                obj2 = ((xh1) xh1Var).f44529l;
            } else {
                obj2 = xh1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f22532id) >= 0) {
                longSparseArray.remove(wallPaper.f22532id);
            } else {
                longSparseArray.put(wallPaper.f22532id, xh1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.actionBar.r();
            } else {
                wallpapersListActivity.I.a(longSparseArray.size(), true);
            }
            wallpapersListActivity.f36311f0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f22532id) >= 0) {
                z10 = true;
            }
            xiVar.c(i9, z10, true);
            return;
        }
        boolean z11 = xh1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) xh1Var).slug;
        } else if (xh1Var instanceof xh1) {
            str = ((xh1) xh1Var).f44520a;
        } else if (xh1Var instanceof yh1) {
            str = ((yh1) xh1Var).f44877a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) xh1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                xh1 xh1Var2 = new xh1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                xh1Var2.f44525g = tL_wallPaper;
                xh1Var2.f44529l = tL_wallPaper;
                xh1Var = xh1Var2;
            }
        }
        org.telegram.ui.Components.qo qoVar = new org.telegram.ui.Components.qo(xh1Var, null, true, 4);
        if (wallpapersListActivity.v == 1) {
            qoVar.E1 = new rh1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z12 = wallpapersListActivity.W;
            boolean z13 = wallpapersListActivity.V;
            float f10 = wallpapersListActivity.U;
            qoVar.B1 = z12;
            qoVar.A1 = z13;
            qoVar.f41085j1 = f10;
        }
        qoVar.Q0 = wallpapersListActivity.f36306c0;
        if (qoVar.f41059b == 1 || (qoVar.f41116x1 instanceof xh1)) {
            ((xh1) qoVar.f41116x1).getClass();
        }
        qoVar.c1(0L);
        ?? obj3 = new Object();
        obj3.f23653a = true;
        qoVar.f41056a.f41043a = wallpapersListActivity.resourceProvider;
        obj3.f23655c = new lj0(8);
        obj3.f23656e = true;
        wallpapersListActivity.showAsSheet(qoVar, obj3);
    }

    public static boolean r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.xi xiVar, Object obj, int i9) {
        Object obj2;
        ArrayList arrayList = wallpapersListActivity.K;
        int i10 = wallpapersListActivity.v;
        if (i10 != 2 && i10 != 3) {
            if (obj instanceof xh1) {
                obj2 = ((xh1) obj).f44529l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f36309e0.put(((TLRPC.WallPaper) obj2).f22532id, obj);
                wallpapersListActivity.I.a(1, false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view = (View) arrayList.get(i11);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(250L);
                animatorSet.start();
                wallpapersListActivity.f36311f0 = false;
                wallpapersListActivity.actionBar.N(null, null);
                xiVar.c(i9, true, true);
                return true;
            }
        }
        return false;
    }

    public static void y0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f36297h0;
        } else {
            iArr = f36296g0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new xh1(iArr2[0], 0, "c", 45));
            } else {
                arrayList.add(new xh1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
            }
        }
    }

    public final void A0(boolean z10) {
        long j10 = 0;
        if (!z10) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            long j11 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Object obj = arrayList.get(i9);
                if (obj instanceof TLRPC.WallPaper) {
                    long j12 = ((TLRPC.WallPaper) obj).f22532id;
                    if (j12 >= 0) {
                        j11 = MediaDataController.calcHash(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new kh.o3(13, this, z10)), this.classGuid);
    }

    public final void B0() {
        this.f36301a = 0;
        int i9 = this.v;
        if (i9 == 0) {
            this.uploadImageRow = 0;
            this.f36303b = 1;
            this.f36301a = 3;
            this.f36305c = 2;
            this.f36313r = -1;
            this.f36314s = -1;
        } else if (i9 == 2) {
            this.uploadImageRow = -1;
            this.f36303b = -1;
            this.f36305c = -1;
            this.f36313r = 0;
            this.f36301a = 2;
            this.f36314s = 1;
        } else {
            this.uploadImageRow = -1;
            this.f36303b = -1;
            this.f36305c = -1;
            this.f36313r = -1;
            this.f36314s = -1;
        }
        ArrayList arrayList = this.f36302a0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.N);
            this.f36308e = ceil;
            int i10 = this.f36301a;
            this.d = i10;
            this.f36301a = i10 + ceil;
        } else {
            this.d = -1;
        }
        if (i9 == 0) {
            int i11 = this.f36301a;
            this.f36310f = i11;
            this.h = i11 + 1;
            this.f36301a = i11 + 3;
            this.f36312n = i11 + 2;
        } else {
            this.f36310f = -1;
            this.h = -1;
            this.f36312n = -1;
        }
        zh1 zh1Var = this.E;
        if (zh1Var != null) {
            this.f36311f0 = true;
            zh1Var.l();
        }
    }

    public final void C0() {
        int childCount = this.D.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.D.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.za) {
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                for (int i10 = 0; i10 < 5; i10++) {
                    zaVar.c(i10, false, true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.f36315w = new Paint(1);
        Paint paint = new Paint(1);
        this.f36316x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f36316x.setStyle(Paint.Style.STROKE);
        this.f36316x.setColor(855638016);
        this.M = new org.telegram.ui.Components.u71(getParentActivity(), this, new sh1(this));
        this.hasOwnBackground = true;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i9 = this.v;
        if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i9 == 2) {
            this.actionBar.setTitle("Channel Wallpaper");
        } else if (i9 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new uh1(this));
        if (i9 == 0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new vh1(this);
            this.H = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
            j10.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23269s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.f6.f23321v8;
            kVar.C(org.telegram.ui.ActionBar.f6.w0(null, i10, false), true);
            this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23287t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j10.getContext());
            this.I = numberTextView;
            numberTextView.setTextSize(18);
            this.I.setTypeface(AndroidUtilities.bold());
            this.I.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            this.I.setOnTouchListener(new wd1(1));
            j10.addView(this.I, g7.e6.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.w0 h = j10.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.K;
            arrayList.add(h);
            arrayList.add(j10.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f36309e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.D = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.D);
        org.telegram.ui.Components.wk0 wk0Var2 = this.D;
        int i11 = org.telegram.ui.ActionBar.f6.f22947a7;
        wk0Var2.setBackgroundColor(getThemedColor(i11));
        this.D.setClipToPadding(false);
        this.D.setHorizontalScrollBarEnabled(false);
        this.D.setVerticalScrollBarEnabled(false);
        this.D.setItemAnimator(null);
        this.D.setLayoutAnimation(null);
        org.telegram.ui.Components.wk0 wk0Var3 = this.D;
        of.y yVar = new of.y(1, false, 18);
        this.G = yVar;
        wk0Var3.setLayoutManager(yVar);
        frameLayout.addView(this.D, g7.e6.e(-1, -1, 51));
        org.telegram.ui.Components.wk0 wk0Var4 = this.D;
        zh1 zh1Var = new zh1(this, context);
        this.E = zh1Var;
        wk0Var4.setAdapter(zh1Var);
        this.F = new bi1(this, context);
        this.D.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23021e8, false));
        this.D.setOnItemClickListener(new c21(this, 11));
        this.D.setOnScrollListener(new kb1(this, 4));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.J = yyVar;
        yyVar.setVisibility(8);
        this.J.setShowAtCenter(true);
        this.J.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.J.setText(LocaleController.getString(R.string.NoResult));
        this.D.setEmptyView(this.J);
        frameLayout.addView(this.J, g7.e6.c(-1.0f, -1));
        B0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        ArrayList arrayList;
        xh1 xh1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i12;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i13 = 1;
        if (i9 == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f36306c0.clear();
            HashMap hashMap2 = this.f36307d0;
            hashMap2.clear();
            HashMap hashMap3 = this.Y;
            ArrayList arrayList3 = this.f36304b0;
            int i14 = this.v;
            HashMap hashMap4 = this.Z;
            ArrayList arrayList4 = this.f36302a0;
            if (i14 != 1 && i14 != 2) {
                arrayList4.clear();
                arrayList3.clear();
                hashMap4.clear();
                ArrayList arrayList5 = this.X;
                arrayList5.clear();
                hashMap3.clear();
                arrayList5.addAll(arrayList2);
            }
            int size = arrayList2.size();
            int i15 = 0;
            ArrayList arrayList6 = null;
            while (i15 < size) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList2.get(i15);
                if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                    arrayList = arrayList2;
                    hashMap = hashMap2;
                    i11 = i14;
                } else {
                    if (wallPaper instanceof TLRPC.TL_wallPaper) {
                        TLRPC.Document document = wallPaper.document;
                        if (!(document instanceof TLRPC.TL_documentEmpty)) {
                            if (wallPaper.pattern && document != null) {
                                i11 = i14;
                                if (!hashMap2.containsKey(Long.valueOf(document.f22386id))) {
                                    this.f36306c0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f22386id), wallPaper);
                                }
                            } else {
                                i11 = i14;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i11 != i13 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i11 != 2 || z10) && (org.telegram.ui.ActionBar.f6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList4.add(wallPaper);
                            }
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                        }
                    }
                    i11 = i14;
                    TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                    int i16 = wallPaperSettings4.background_color;
                    if (i16 != 0) {
                        int i17 = wallPaperSettings4.second_background_color;
                        if (i17 != 0 && (i12 = wallPaperSettings4.third_background_color) != 0) {
                            arrayList = arrayList2;
                            xh1Var = new xh1(null, i16, i17, i12, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            xh1Var = new xh1(i16, i17, null, wallPaperSettings4.rotation);
                        }
                        xh1Var.f44520a = wallPaper.slug;
                        xh1Var.h = wallPaperSettings4.intensity / 100.0f;
                        xh1Var.f44524f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        xh1Var.f44529l = wallPaper;
                        if (wallPaper.f22532id < 0) {
                            String a2 = xh1Var.a();
                            if (hashMap4.containsKey(a2)) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(wallPaper);
                                i15++;
                                i14 = i11;
                                hashMap2 = hashMap;
                                arrayList2 = arrayList;
                                i13 = 1;
                            } else {
                                arrayList3.add(xh1Var);
                                hashMap4.put(a2, xh1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.f6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(xh1Var);
                        }
                        i15++;
                        i14 = i11;
                        hashMap2 = hashMap;
                        arrayList2 = arrayList;
                        i13 = 1;
                    }
                    arrayList = arrayList2;
                    hashMap = hashMap2;
                }
                i15++;
                i14 = i11;
                hashMap2 = hashMap;
                arrayList2 = arrayList;
                i13 = 1;
            }
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i18)).f22532id);
                }
            }
            this.O = org.telegram.ui.ActionBar.f6.H0();
            z0();
            A0(false);
        } else if (i9 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.wk0 wk0Var = this.D;
            if (wk0Var != null) {
                wk0Var.f1();
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
        } else if (i9 == NotificationCenter.wallpapersNeedReload) {
            getMessagesStorage().getWallpapers();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 0, null, null, null, null, i9));
        View view2 = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view2, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 48, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23038f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23020e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 1, null, null, null, null, i9));
        return arrayList;
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        this.M.a(i9, i10, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.wk0 wk0Var = this.D;
        if (wk0Var != null) {
            wk0Var.getViewTreeObserver().addOnPreDrawListener(new sh(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i9 = this.v;
        if (i9 != 0 && i9 != 2) {
            y0(this.f36302a0, org.telegram.ui.ActionBar.f6.I.q());
            if (i9 == 1 && this.f36306c0.isEmpty()) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        } else {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        int i9 = this.v;
        if (i9 != 0 && i9 != 2) {
            if (i9 == 1) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            }
        } else {
            bi1 bi1Var = this.F;
            if (bi1Var.f36872s != 0) {
                ConnectionsManager.getInstance(bi1Var.A.currentAccount).cancelRequest(bi1Var.f36872s, true);
                bi1Var.f36872s = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        }
        this.M.getClass();
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        MessagesController.getGlobalMainSettings();
        org.telegram.ui.ActionBar.y5 y5Var = org.telegram.ui.ActionBar.f6.I.f22914e0;
        if (y5Var != null) {
            String str2 = y5Var.f23982c;
            this.O = str2;
            if (str2 == null) {
                this.O = "";
            }
            this.P = y5Var.d;
            this.Q = y5Var.f23983e;
            this.R = y5Var.f23984f;
            this.S = y5Var.f23985g;
            this.T = y5Var.h;
            this.U = y5Var.f23988k;
            this.V = y5Var.f23987j;
            this.W = y5Var.f23986i;
        } else {
            if (org.telegram.ui.ActionBar.f6.d1()) {
                str = "t";
            } else {
                str = "d";
            }
            this.O = str;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 45;
            this.U = 1.0f;
            this.V = false;
            this.W = false;
        }
        z0();
        org.telegram.ui.Components.wk0 wk0Var = this.D;
        if (wk0Var != null) {
            wk0Var.getViewTreeObserver().addOnPreDrawListener(new sh(this, 6));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.f32948a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.M.f32948a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void z0() {
        HashMap hashMap;
        ?? r52;
        long j10;
        final String str;
        final long j11;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.WallPaper wallPaper;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper2;
        Object obj2;
        int i14 = this.v;
        if (i14 != 0 && i14 != 2) {
            return;
        }
        MessagesController.getGlobalMainSettings();
        xh1 xh1Var = this.f36317y;
        ArrayList arrayList = this.f36302a0;
        if (xh1Var != null) {
            arrayList.remove(xh1Var);
            this.f36317y = null;
        }
        yh1 yh1Var = this.A;
        if (yh1Var != null) {
            arrayList.remove(yh1Var);
            this.A = null;
        }
        xh1 xh1Var2 = this.B;
        if (xh1Var2 == null) {
            xh1 xh1Var3 = new xh1("d", -2368069, -9722489, -2762611, -7817084);
            this.B = xh1Var3;
            xh1Var3.h = 0.34f;
        } else {
            arrayList.remove(xh1Var2);
        }
        yh1 yh1Var2 = this.C;
        if (yh1Var2 != null) {
            arrayList.remove(yh1Var2);
        }
        int size = arrayList.size();
        int i15 = 0;
        while (true) {
            hashMap = this.Y;
            if (i15 < size) {
                Object obj3 = arrayList.get(i15);
                if (obj3 instanceof xh1) {
                    r52 = (xh1) obj3;
                    String str3 = r52.f44520a;
                    if (str3 != null) {
                        r52.f44525g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f44520a)) {
                        String str4 = r52.f44520a;
                        if (str4 != null && !TextUtils.equals(this.O, str4)) {
                            i15++;
                        }
                    }
                    if (this.P == r52.f44521b) {
                        int i16 = this.Q;
                        if (i16 != r52.f44522c) {
                            continue;
                        } else if (this.R != r52.d) {
                            continue;
                        } else if (this.S != r52.f44523e) {
                            continue;
                        } else if (i16 == 0 || this.T == r52.f44524f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.O, r52.slug) && this.P == org.telegram.ui.ActionBar.f6.X0(r52.settings.background_color) && this.Q == org.telegram.ui.ActionBar.f6.X0(r52.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.f6.X0(r52.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.f6.X0(r52.settings.fourth_background_color) && ((this.Q == 0 || this.T == AndroidUtilities.getWallpaperRotation(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.f6.R0(r52.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                }
            } else {
                r52 = 0;
                break;
            }
        }
        if (r52 instanceof TLRPC.WallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper3 = r52;
            org.telegram.ui.ActionBar.y5 y5Var = org.telegram.ui.ActionBar.f6.I.f22914e0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.P == org.telegram.ui.ActionBar.f6.X0(wallPaperSettings.background_color) && this.Q == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper3.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper3.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper3.settings.fourth_background_color) && (this.Q == 0 || this.R != 0 || this.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.f6.R0(tL_wallPaper3.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
                str2 = this.O;
                tL_wallPaper2 = null;
                obj2 = r52;
            } else {
                str2 = "";
                tL_wallPaper2 = tL_wallPaper3;
                obj2 = null;
            }
            str = str2;
            tL_wallPaper = tL_wallPaper2;
            obj = obj2;
            j11 = tL_wallPaper3.f22532id;
        } else {
            String str5 = this.O;
            if ((r52 instanceof xh1) && (wallPaper = r52.f44529l) != null) {
                j10 = wallPaper.f22532id;
            } else {
                j10 = 0;
            }
            str = str5;
            j11 = j10;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q10 = org.telegram.ui.ActionBar.f6.A0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.X;
                    if (obj4 instanceof xh1) {
                        obj4 = ((xh1) obj4).f44529l;
                    }
                    if (obj5 instanceof xh1) {
                        obj5 = ((xh1) obj5).f44529l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j12 = j11;
                        if (j12 != 0) {
                            if (wallPaper2.f22532id != j12) {
                                if (wallPaper3.f22532id == j12) {
                                    return 1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            String str6 = wallPaper2.slug;
                            String str7 = str;
                            if (!str7.equals(str6)) {
                                if (str7.equals(wallPaper3.slug)) {
                                    return 1;
                                }
                            } else {
                                return -1;
                            }
                        }
                        boolean z10 = q10;
                        if (!z10) {
                            if (!"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper2.slug)) {
                                if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper3.slug)) {
                                    return 1;
                                }
                            } else {
                                return -1;
                            }
                        }
                        int indexOf = arrayList2.indexOf(wallPaper2);
                        int indexOf2 = arrayList2.indexOf(wallPaper3);
                        boolean z11 = wallPaper2.dark;
                        if ((z11 && wallPaper3.dark) || (!z11 && !wallPaper3.dark)) {
                            if (indexOf <= indexOf2) {
                                if (indexOf < indexOf2) {
                                    return -1;
                                }
                                return 0;
                            }
                            return 1;
                        } else if (z11 && !wallPaper3.dark) {
                            if (!z10) {
                                return 1;
                            }
                            return -1;
                        } else if (z10) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                    return 0;
                }
            });
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (org.telegram.ui.ActionBar.f6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.f6.f23067h0)) {
            if (this.C == null) {
                ?? obj4 = new Object();
                obj4.f44877a = "t";
                obj4.f44878b = -2;
                obj4.f44879c = -2;
                this.C = obj4;
            }
            arrayList.add(0, this.C);
        } else {
            this.C = null;
        }
        org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
        if (!TextUtils.isEmpty(this.O) && ("d".equals(this.O) || obj != null)) {
            if (obj == null && this.P != 0 && "c".equals(this.O)) {
                int i17 = this.Q;
                if (i17 != 0 && (i12 = this.R) != 0 && (i13 = this.S) != 0) {
                    xh1 xh1Var4 = new xh1(this.O, this.P, i17, i12, i13);
                    this.f36317y = xh1Var4;
                    xh1Var4.f44524f = this.T;
                } else {
                    this.f36317y = new xh1(this.P, i17, this.O, this.T);
                }
                arrayList.add(0, this.f36317y);
            }
        } else if (!"c".equals(this.O) && (i11 = this.P) != 0) {
            if (e6Var.f22914e0 != null) {
                xh1 xh1Var5 = new xh1(this.O, i11, this.Q, this.R, this.S, this.T, this.U, this.V, new File(ApplicationLoader.getFilesDirFixed(), e6Var.f22914e0.f23980a));
                this.f36317y = xh1Var5;
                xh1Var5.f44525g = tL_wallPaper;
                arrayList.add(0, xh1Var5);
            }
        } else {
            int i18 = this.P;
            if (i18 != 0) {
                int i19 = this.Q;
                if (i19 != 0 && (i10 = this.R) != 0) {
                    xh1 xh1Var6 = new xh1(this.O, i18, i19, i10, this.S);
                    this.f36317y = xh1Var6;
                    xh1Var6.f44524f = this.T;
                } else {
                    this.f36317y = new xh1(i18, i19, this.O, this.T);
                }
                arrayList.add(0, this.f36317y);
            } else if (e6Var.f22914e0 != null && !hashMap.containsKey(this.O)) {
                yh1 yh1Var3 = new yh1(new File(ApplicationLoader.getFilesDirFixed(), e6Var.f22914e0.f23980a), new File(ApplicationLoader.getFilesDirFixed(), e6Var.f22914e0.f23981b), this.O);
                this.A = yh1Var3;
                if (this.C != null) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                arrayList.add(i9, yh1Var3);
            }
        }
        if (!"d".equals(this.O) && !arrayList.isEmpty()) {
            arrayList.add(1, this.B);
        } else {
            arrayList.add(0, this.B);
        }
        B0();
    }
}
