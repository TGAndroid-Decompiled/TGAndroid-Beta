package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
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
    public static final int[][] f35515k0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f35516l0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] m0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f35517n0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f35518o0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public ai1 E;
    public zh1 F;
    public ai1 G;
    public org.telegram.ui.Components.mm0 H;
    public bi1 I;
    public ci1 J;
    public hg.a0 K;
    public org.telegram.ui.ActionBar.u0 L;
    public NumberTextView M;
    public org.telegram.ui.Components.vz N;
    public final ArrayList O;
    public org.telegram.ui.ActionBar.c2 P;
    public org.telegram.ui.Components.s91 Q;
    public int R;
    public String S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public float Y;
    public boolean Z;
    public int f35519a;
    public boolean f35520a0;
    public int f35521b;
    public final ArrayList f35522b0;
    public int f35523c;
    public final HashMap f35524c0;
    public int d;
    public final HashMap f35525d0;
    public int e;
    public final ArrayList f35526e0;
    public int f35527f;
    public final ArrayList f35528f0;
    public ArrayList f35529g0;
    public int h;
    public final HashMap f35530h0;
    public final LongSparseArray f35531i0;
    public boolean f35532j0;
    public int f35533n;
    public int f35534r;
    public int f35535s;
    private int uploadImageRow;
    public final int v;
    public Paint f35536w;
    public Paint f35537x;
    public zh1 f35538y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.O = new ArrayList();
        this.R = 3;
        this.S = "";
        this.f35522b0 = new ArrayList();
        this.f35524c0 = new HashMap();
        this.f35525d0 = new HashMap();
        this.f35526e0 = new ArrayList();
        this.f35528f0 = new ArrayList();
        this.f35529g0 = new ArrayList();
        this.f35530h0 = new HashMap();
        this.f35531i0 = new LongSparseArray();
        this.v = i10;
    }

    public static void U(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.f35531i0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.P = c2Var;
        c2Var.f20762i0 = false;
        c2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new l(wallpapersListActivity, 25));
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.H.getAdapter() != wallpapersListActivity.J) {
            if (i10 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.Q.b();
            } else if (i10 == wallpapersListActivity.f35521b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f35529g0 = wallpapersListActivity.f35529g0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i10 == wallpapersListActivity.h) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new th1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                wallpapersListActivity.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                }
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.hj hjVar, Object obj, int i10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        zh1 zh1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f35531i0;
        boolean z10 = false;
        if (wallpapersListActivity.actionBar.s()) {
            if (zh1Var instanceof zh1) {
                obj2 = ((zh1) zh1Var).f44159l;
            } else {
                obj2 = zh1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f20495id) >= 0) {
                longSparseArray.remove(wallPaper.f20495id);
            } else {
                longSparseArray.put(wallPaper.f20495id, zh1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.actionBar.r();
            } else {
                wallpapersListActivity.M.a(longSparseArray.size(), true);
            }
            wallpapersListActivity.f35532j0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f20495id) >= 0) {
                z10 = true;
            }
            hjVar.c(i10, z10, true);
            return;
        }
        boolean z11 = zh1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) zh1Var).slug;
        } else if (zh1Var instanceof zh1) {
            str = ((zh1) zh1Var).f44151a;
        } else if (zh1Var instanceof ai1) {
            str = ((ai1) zh1Var).f35687a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) zh1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                zh1 zh1Var2 = new zh1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                zh1Var2.f44155g = tL_wallPaper;
                zh1Var2.f44159l = tL_wallPaper;
                zh1Var = zh1Var2;
            }
        }
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(zh1Var, null, true, 4);
        if (wallpapersListActivity.v == 1) {
            lpVar.J1 = new th1(wallpapersListActivity);
        }
        if (wallpapersListActivity.S.equals(str)) {
            boolean z12 = wallpapersListActivity.f35520a0;
            boolean z13 = wallpapersListActivity.Z;
            float f7 = wallpapersListActivity.Y;
            lpVar.G1 = z12;
            lpVar.F1 = z13;
            lpVar.f40755o1 = f7;
        }
        lpVar.V0 = wallpapersListActivity.f35529g0;
        if (lpVar.f40716b == 1 || (lpVar.C1 instanceof zh1)) {
            ((zh1) lpVar.C1).getClass();
        }
        lpVar.c1(0L);
        ?? obj3 = new Object();
        obj3.f21636a = true;
        lpVar.f40713a.f40691a = wallpapersListActivity.resourceProvider;
        obj3.f21638c = new if0(11);
        obj3.e = true;
        wallpapersListActivity.showAsSheet(lpVar, obj3);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.hj hjVar, Object obj, int i10) {
        Object obj2;
        ArrayList arrayList = wallpapersListActivity.O;
        int i11 = wallpapersListActivity.v;
        if (i11 != 2 && i11 != 3) {
            if (obj instanceof zh1) {
                obj2 = ((zh1) obj).f44159l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f35531i0.put(((TLRPC.WallPaper) obj2).f20495id, obj);
                wallpapersListActivity.M.a(1, false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    View view = (View) arrayList.get(i12);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(250L);
                animatorSet.start();
                wallpapersListActivity.f35532j0 = false;
                wallpapersListActivity.actionBar.N(null, null);
                hjVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public static void z0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f35516l0;
        } else {
            iArr = f35515k0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new zh1(iArr2[0], 0, "c", 45));
            } else {
                arrayList.add(new zh1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
            }
        }
    }

    public final void A0() {
        HashMap hashMap;
        ?? r52;
        long j10;
        final String str;
        final long j11;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.WallPaper wallPaper;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper2;
        Object obj2;
        int i15 = this.v;
        if (i15 != 0 && i15 != 2) {
            return;
        }
        MessagesController.getGlobalMainSettings();
        zh1 zh1Var = this.f35538y;
        ArrayList arrayList = this.f35526e0;
        if (zh1Var != null) {
            arrayList.remove(zh1Var);
            this.f35538y = null;
        }
        ai1 ai1Var = this.E;
        if (ai1Var != null) {
            arrayList.remove(ai1Var);
            this.E = null;
        }
        zh1 zh1Var2 = this.F;
        if (zh1Var2 == null) {
            zh1 zh1Var3 = new zh1("d", -2368069, -9722489, -2762611, -7817084);
            this.F = zh1Var3;
            zh1Var3.h = 0.34f;
        } else {
            arrayList.remove(zh1Var2);
        }
        ai1 ai1Var2 = this.G;
        if (ai1Var2 != null) {
            arrayList.remove(ai1Var2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            hashMap = this.f35524c0;
            if (i16 < size) {
                Object obj3 = arrayList.get(i16);
                if (obj3 instanceof zh1) {
                    r52 = (zh1) obj3;
                    String str3 = r52.f44151a;
                    if (str3 != null) {
                        r52.f44155g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f44151a)) {
                        String str4 = r52.f44151a;
                        if (str4 != null && !TextUtils.equals(this.S, str4)) {
                            i16++;
                        }
                    }
                    if (this.T == r52.f44152b) {
                        int i17 = this.U;
                        if (i17 != r52.f44153c) {
                            continue;
                        } else if (this.V != r52.d) {
                            continue;
                        } else if (this.W != r52.e) {
                            continue;
                        } else if (i17 == 0 || this.X == r52.f44154f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i16++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.S, r52.slug) && this.T == org.telegram.ui.ActionBar.k6.Z0(r52.settings.background_color) && this.U == org.telegram.ui.ActionBar.k6.Z0(r52.settings.second_background_color) && this.V == org.telegram.ui.ActionBar.k6.Z0(r52.settings.third_background_color) && this.W == org.telegram.ui.ActionBar.k6.Z0(r52.settings.fourth_background_color) && ((this.U == 0 || this.X == AndroidUtilities.getWallpaperRotation(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.k6.T0(r52.settings.intensity / 100.0f) - this.Y) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i16++;
                }
            } else {
                r52 = 0;
                break;
            }
        }
        if (r52 instanceof TLRPC.WallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper3 = r52;
            org.telegram.ui.ActionBar.d6 d6Var = org.telegram.ui.ActionBar.k6.I.f21031i0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.T == org.telegram.ui.ActionBar.k6.Z0(wallPaperSettings.background_color) && this.U == org.telegram.ui.ActionBar.k6.Z0(tL_wallPaper3.settings.second_background_color) && this.V == org.telegram.ui.ActionBar.k6.Z0(tL_wallPaper3.settings.third_background_color) && this.W == org.telegram.ui.ActionBar.k6.Z0(tL_wallPaper3.settings.fourth_background_color) && (this.U == 0 || this.V != 0 || this.X == AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.k6.T0(tL_wallPaper3.settings.intensity / 100.0f) - this.Y) <= 0.001f)) {
                str2 = this.S;
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
            j11 = tL_wallPaper3.f20495id;
        } else {
            String str5 = this.S;
            if ((r52 instanceof zh1) && (wallPaper = r52.f44159l) != null) {
                j10 = wallPaper.f20495id;
            } else {
                j10 = 0;
            }
            str = str5;
            j11 = j10;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q6 = org.telegram.ui.ActionBar.k6.C0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.f35522b0;
                    if (obj4 instanceof zh1) {
                        obj4 = ((zh1) obj4).f44159l;
                    }
                    if (obj5 instanceof zh1) {
                        obj5 = ((zh1) obj5).f44159l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j12 = j11;
                        if (j12 != 0) {
                            if (wallPaper2.f20495id != j12) {
                                if (wallPaper3.f20495id == j12) {
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
                        boolean z10 = q6;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (org.telegram.ui.ActionBar.k6.f1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.k6.f21249h0)) {
            if (this.G == null) {
                ?? obj4 = new Object();
                obj4.f35687a = "t";
                obj4.f35688b = -2;
                obj4.f35689c = -2;
                this.G = obj4;
            }
            arrayList.add(0, this.G);
        } else {
            this.G = null;
        }
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
        if (!TextUtils.isEmpty(this.S) && ("d".equals(this.S) || obj != null)) {
            if (obj == null && this.T != 0 && "c".equals(this.S)) {
                int i18 = this.U;
                if (i18 != 0 && (i13 = this.V) != 0 && (i14 = this.W) != 0) {
                    zh1 zh1Var4 = new zh1(this.S, this.T, i18, i13, i14);
                    this.f35538y = zh1Var4;
                    zh1Var4.f44154f = this.X;
                } else {
                    this.f35538y = new zh1(this.T, i18, this.S, this.X);
                }
                arrayList.add(0, this.f35538y);
            }
        } else if (!"c".equals(this.S) && (i12 = this.T) != 0) {
            if (j6Var.f21031i0 != null) {
                zh1 zh1Var5 = new zh1(this.S, i12, this.U, this.V, this.W, this.X, this.Y, this.Z, new File(ApplicationLoader.getFilesDirFixed(), j6Var.f21031i0.f20815a));
                this.f35538y = zh1Var5;
                zh1Var5.f44155g = tL_wallPaper;
                arrayList.add(0, zh1Var5);
            }
        } else {
            int i19 = this.T;
            if (i19 != 0) {
                int i20 = this.U;
                if (i20 != 0 && (i11 = this.V) != 0) {
                    zh1 zh1Var6 = new zh1(this.S, i19, i20, i11, this.W);
                    this.f35538y = zh1Var6;
                    zh1Var6.f44154f = this.X;
                } else {
                    this.f35538y = new zh1(i19, i20, this.S, this.X);
                }
                arrayList.add(0, this.f35538y);
            } else if (j6Var.f21031i0 != null && !hashMap.containsKey(this.S)) {
                ai1 ai1Var3 = new ai1(new File(ApplicationLoader.getFilesDirFixed(), j6Var.f21031i0.f20815a), new File(ApplicationLoader.getFilesDirFixed(), j6Var.f21031i0.f20816b), this.S);
                this.E = ai1Var3;
                if (this.G != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(i10, ai1Var3);
            }
        }
        if (!"d".equals(this.S) && !arrayList.isEmpty()) {
            arrayList.add(1, this.F);
        } else {
            arrayList.add(0, this.F);
        }
        C0();
    }

    public final void B0(boolean z10) {
        long j10 = 0;
        if (!z10) {
            ArrayList arrayList = this.f35522b0;
            int size = arrayList.size();
            long j11 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.WallPaper) {
                    long j12 = ((TLRPC.WallPaper) obj).f20495id;
                    if (j12 >= 0) {
                        j11 = MediaDataController.calcHash(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new ei.o3(13, this, z10)), this.classGuid);
    }

    public final void C0() {
        this.f35519a = 0;
        int i10 = this.v;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f35521b = 1;
            this.f35519a = 3;
            this.f35523c = 2;
            this.f35534r = -1;
            this.f35535s = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f35521b = -1;
            this.f35523c = -1;
            this.f35534r = 0;
            this.f35519a = 2;
            this.f35535s = 1;
        } else {
            this.uploadImageRow = -1;
            this.f35521b = -1;
            this.f35523c = -1;
            this.f35534r = -1;
            this.f35535s = -1;
        }
        ArrayList arrayList = this.f35526e0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.R);
            this.e = ceil;
            int i11 = this.f35519a;
            this.d = i11;
            this.f35519a = i11 + ceil;
        } else {
            this.d = -1;
        }
        if (i10 == 0) {
            int i12 = this.f35519a;
            this.f35527f = i12;
            this.h = i12 + 1;
            this.f35519a = i12 + 3;
            this.f35533n = i12 + 2;
        } else {
            this.f35527f = -1;
            this.h = -1;
            this.f35533n = -1;
        }
        bi1 bi1Var = this.I;
        if (bi1Var != null) {
            this.f35532j0 = true;
            bi1Var.l();
        }
    }

    public final void D0() {
        int childCount = this.H.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.H.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.bb) {
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    bbVar.c(i11, false, true);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21346m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
    }

    @Override
    public final View createView(Context context) {
        this.f35536w = new Paint(1);
        Paint paint = new Paint(1);
        this.f35537x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f35537x.setStyle(Paint.Style.STROKE);
        this.f35537x.setColor(855638016);
        this.Q = new org.telegram.ui.Components.s91(getParentActivity(), this, new uh1(this));
        this.hasOwnBackground = true;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.v;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i10 == 2) {
            this.actionBar.setTitle("Channel Wallpaper");
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new wh1(this));
        if (i10 == 0) {
            org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new xh1(this);
            this.L = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.y i11 = this.actionBar.i(null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21462s8, i11, null);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.k6.f21518v8;
            org.telegram.ui.ActionBar.r6.b(kVar, i12, null, true);
            org.telegram.ui.ActionBar.r6.a(this.actionBar, org.telegram.ui.ActionBar.k6.f21481t8, null, true);
            NumberTextView numberTextView = new NumberTextView(i11.getContext());
            this.M = numberTextView;
            numberTextView.setTextSize(18);
            this.M.setTypeface(AndroidUtilities.bold());
            this.M.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            this.M.setOnTouchListener(new yd1(1));
            i11.addView(this.M, w7.z5.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.u0 h = i11.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.O;
            arrayList.add(h);
            arrayList.add(i11.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f35531i0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.H = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.H);
        org.telegram.ui.Components.mm0 mm0Var2 = this.H;
        int i13 = org.telegram.ui.ActionBar.k6.f21125a7;
        org.telegram.ui.ActionBar.r6.i(i13, mm0Var2, getResourceProvider());
        this.H.setClipToPadding(false);
        this.H.setHorizontalScrollBarEnabled(false);
        this.H.setVerticalScrollBarEnabled(false);
        this.H.setItemAnimator(null);
        this.H.setLayoutAnimation(null);
        org.telegram.ui.Components.mm0 mm0Var3 = this.H;
        hg.a0 a0Var = new hg.a0(1, false, 19);
        this.K = a0Var;
        mm0Var3.setLayoutManager(a0Var);
        frameLayout.addView(this.H, w7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.mm0 mm0Var4 = this.H;
        bi1 bi1Var = new bi1(this, context);
        this.I = bi1Var;
        mm0Var4.setAdapter(bi1Var);
        this.J = new ci1(this, context);
        org.telegram.ui.ActionBar.r6.J(this.H, org.telegram.ui.ActionBar.k6.f21201e8, null);
        this.H.setOnItemClickListener(new j11(this, 13));
        this.H.setOnScrollListener(new hd1(this, 3));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.N = vzVar;
        vzVar.setVisibility(8);
        this.N.setShowAtCenter(true);
        org.telegram.ui.ActionBar.r6.i(i13, this.N, null);
        this.N.setText(LocaleController.getString(R.string.NoResult));
        this.H.setEmptyView(this.N);
        frameLayout.addView(this.N, w7.z5.c(-1.0f, -1));
        C0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        zh1 zh1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f35529g0.clear();
            HashMap hashMap2 = this.f35530h0;
            hashMap2.clear();
            HashMap hashMap3 = this.f35524c0;
            ArrayList arrayList3 = this.f35528f0;
            int i15 = this.v;
            HashMap hashMap4 = this.f35525d0;
            ArrayList arrayList4 = this.f35526e0;
            if (i15 != 1 && i15 != 2) {
                arrayList4.clear();
                arrayList3.clear();
                hashMap4.clear();
                ArrayList arrayList5 = this.f35522b0;
                arrayList5.clear();
                hashMap3.clear();
                arrayList5.addAll(arrayList2);
            }
            int size = arrayList2.size();
            int i16 = 0;
            ArrayList arrayList6 = null;
            while (i16 < size) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList2.get(i16);
                if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                    arrayList = arrayList2;
                    hashMap = hashMap2;
                    i12 = i15;
                } else {
                    if (wallPaper instanceof TLRPC.TL_wallPaper) {
                        TLRPC.Document document = wallPaper.document;
                        if (!(document instanceof TLRPC.TL_documentEmpty)) {
                            if (wallPaper.pattern && document != null) {
                                i12 = i15;
                                if (!hashMap2.containsKey(Long.valueOf(document.f20349id))) {
                                    this.f35529g0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f20349id), wallPaper);
                                }
                            } else {
                                i12 = i15;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i12 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z10) && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                arrayList4.add(wallPaper);
                            }
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                        }
                    }
                    i12 = i15;
                    TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                    int i17 = wallPaperSettings4.background_color;
                    if (i17 != 0) {
                        int i18 = wallPaperSettings4.second_background_color;
                        if (i18 != 0 && (i13 = wallPaperSettings4.third_background_color) != 0) {
                            arrayList = arrayList2;
                            zh1Var = new zh1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            zh1Var = new zh1(i17, i18, null, wallPaperSettings4.rotation);
                        }
                        zh1Var.f44151a = wallPaper.slug;
                        zh1Var.h = wallPaperSettings4.intensity / 100.0f;
                        zh1Var.f44154f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        zh1Var.f44159l = wallPaper;
                        if (wallPaper.f20495id < 0) {
                            String a2 = zh1Var.a();
                            if (hashMap4.containsKey(a2)) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(wallPaper);
                                i16++;
                                i15 = i12;
                                hashMap2 = hashMap;
                                arrayList2 = arrayList;
                                i14 = 1;
                            } else {
                                arrayList3.add(zh1Var);
                                hashMap4.put(a2, zh1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(zh1Var);
                        }
                        i16++;
                        i15 = i12;
                        hashMap2 = hashMap;
                        arrayList2 = arrayList;
                        i14 = 1;
                    }
                    arrayList = arrayList2;
                    hashMap = hashMap2;
                }
                i16++;
                i15 = i12;
                hashMap2 = hashMap;
                arrayList2 = arrayList;
                i14 = 1;
            }
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).f20495id);
                }
            }
            this.S = org.telegram.ui.ActionBar.k6.J0();
            A0();
            B0(false);
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.mm0 mm0Var = this.H;
            if (mm0Var != null) {
                mm0Var.g1();
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.g(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            getMessagesStorage().getWallpapers();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21125a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21165c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.N, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21255h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.N, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
        return arrayList;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.Q.a(i10, i11, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.mm0 mm0Var = this.H;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.v;
        if (i10 != 0 && i10 != 2) {
            z0(this.f35526e0, org.telegram.ui.ActionBar.k6.I.q());
            if (i10 == 1 && this.f35529g0.isEmpty()) {
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
        int i10 = this.v;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            }
        } else {
            ci1 ci1Var = this.J;
            if (ci1Var.f36376s != 0) {
                ConnectionsManager.getInstance(ci1Var.E.currentAccount).cancelRequest(ci1Var.f36376s, true);
                ci1Var.f36376s = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        }
        this.Q.getClass();
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        MessagesController.getGlobalMainSettings();
        org.telegram.ui.ActionBar.d6 d6Var = org.telegram.ui.ActionBar.k6.I.f21031i0;
        if (d6Var != null) {
            String str2 = d6Var.f20817c;
            this.S = str2;
            if (str2 == null) {
                this.S = "";
            }
            this.T = d6Var.d;
            this.U = d6Var.e;
            this.V = d6Var.f20818f;
            this.W = d6Var.f20819g;
            this.X = d6Var.h;
            this.Y = d6Var.f20822k;
            this.Z = d6Var.f20821j;
            this.f35520a0 = d6Var.f20820i;
        } else {
            if (org.telegram.ui.ActionBar.k6.f1()) {
                str = "t";
            } else {
                str = "d";
            }
            this.S = str;
            this.T = 0;
            this.U = 0;
            this.V = 0;
            this.W = 0;
            this.X = 45;
            this.Y = 1.0f;
            this.Z = false;
            this.f35520a0 = false;
        }
        A0();
        org.telegram.ui.Components.mm0 mm0Var = this.H;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 6));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            NumberTextView numberTextView = this.M;
            if (numberTextView != null) {
                numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21518v8, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.Q.f30440a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.Q.f30440a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
