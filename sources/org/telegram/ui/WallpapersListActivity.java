package org.telegram.ui;

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
public class WallpapersListActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[][] f37582g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f37583h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f37584i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f37585j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f37586k0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public ci1 E;
    public org.telegram.ui.Components.mm0 F;
    public di1 G;
    public ei1 H;
    public ig.a0 I;
    public org.telegram.ui.ActionBar.y5 J;
    public org.telegram.ui.Components.uz K;
    public org.telegram.ui.ActionBar.e2 L;
    public org.telegram.ui.Components.ba1 M;
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
    public int f37587a;
    public final ArrayList f37588a0;
    public int f37589b;
    public final ArrayList f37590b0;
    public int f37591c;
    public ArrayList f37592c0;
    public int d;
    public final HashMap f37593d0;
    public int e;
    public final LongSparseArray f37594e0;
    public int f37595f;
    public boolean f37596f0;
    public int h;
    public int f37597n;
    public final int f37598r;
    public Paint f37599s;
    private int uploadImageRow;
    public Paint v;
    public bi1 f37600w;
    public ci1 f37601x;
    public bi1 f37602y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.N = 3;
        this.O = "";
        this.X = new ArrayList();
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.f37588a0 = new ArrayList();
        this.f37590b0 = new ArrayList();
        this.f37592c0 = new ArrayList();
        this.f37593d0 = new HashMap();
        this.f37594e0 = new LongSparseArray();
        this.f37598r = i10;
    }

    public static void A0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f37583h0;
        } else {
            iArr = f37582g0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new bi1(iArr2[0], 0, "c", 45));
            } else {
                arrayList.add(new bi1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
            }
        }
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.F.getAdapter() != wallpapersListActivity.H) {
            if (i10 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.M.b();
            } else if (i10 == wallpapersListActivity.f37589b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f37592c0 = wallpapersListActivity.f37592c0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i10 == wallpapersListActivity.e) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new uh1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                wallpapersListActivity.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
                }
            }
        }
    }

    public static void W(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.simpleActionBar.o()) {
            wallpapersListActivity.f37594e0.clear();
            wallpapersListActivity.simpleActionBar.n();
            wallpapersListActivity.E0();
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.L = e2Var;
        e2Var.f22575i0 = false;
        e2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new l(wallpapersListActivity, 25));
    }

    public static void s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.hj hjVar, Object obj, int i10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        bi1 bi1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f37594e0;
        boolean z10 = false;
        if (wallpapersListActivity.simpleActionBar.o()) {
            if (bi1Var instanceof bi1) {
                obj2 = ((bi1) bi1Var).f38111l;
            } else {
                obj2 = bi1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f22181id) >= 0) {
                longSparseArray.remove(wallPaper.f22181id);
            } else {
                longSparseArray.put(wallPaper.f22181id, bi1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.simpleActionBar.n();
            } else {
                wallpapersListActivity.simpleActionBar.t(longSparseArray.size(), true);
            }
            wallpapersListActivity.f37596f0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f22181id) >= 0) {
                z10 = true;
            }
            hjVar.c(i10, z10, true);
            return;
        }
        boolean z11 = bi1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) bi1Var).slug;
        } else if (bi1Var instanceof bi1) {
            str = ((bi1) bi1Var).f38103a;
        } else if (bi1Var instanceof ci1) {
            str = ((ci1) bi1Var).f38469a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) bi1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                bi1 bi1Var2 = new bi1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                bi1Var2.f38107g = tL_wallPaper;
                bi1Var2.f38111l = tL_wallPaper;
                bi1Var = bi1Var2;
            }
        }
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(bi1Var, null, true, 4);
        if (wallpapersListActivity.f37598r == 1) {
            npVar.J1 = new uh1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z12 = wallpapersListActivity.W;
            boolean z13 = wallpapersListActivity.V;
            float f7 = wallpapersListActivity.U;
            npVar.G1 = z12;
            npVar.F1 = z13;
            npVar.f43778o1 = f7;
        }
        npVar.V0 = wallpapersListActivity.f37592c0;
        if (npVar.f43739b == 1 || (npVar.C1 instanceof bi1)) {
            ((bi1) npVar.C1).getClass();
        }
        npVar.d1(0L);
        ?? obj3 = new Object();
        obj3.f22928a = true;
        npVar.f43736a.f43455a = wallpapersListActivity.resourceProvider;
        obj3.f22930c = new u90(14);
        obj3.e = true;
        wallpapersListActivity.showAsSheet(npVar, obj3);
    }

    public static boolean t0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.hj hjVar, Object obj, int i10) {
        Object obj2;
        int i11 = wallpapersListActivity.f37598r;
        if (i11 != 2 && i11 != 3) {
            if (obj instanceof bi1) {
                obj2 = ((bi1) obj).f38111l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.simpleActionBar.o() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f37594e0.put(((TLRPC.WallPaper) obj2).f22181id, obj);
                wallpapersListActivity.simpleActionBar.t(1, false);
                wallpapersListActivity.f37596f0 = false;
                wallpapersListActivity.simpleActionBar.x();
                hjVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public final void B0() {
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
        int i15 = this.f37598r;
        if (i15 != 0 && i15 != 2) {
            return;
        }
        MessagesController.getGlobalMainSettings();
        bi1 bi1Var = this.f37600w;
        ArrayList arrayList = this.f37588a0;
        if (bi1Var != null) {
            arrayList.remove(bi1Var);
            this.f37600w = null;
        }
        ci1 ci1Var = this.f37601x;
        if (ci1Var != null) {
            arrayList.remove(ci1Var);
            this.f37601x = null;
        }
        bi1 bi1Var2 = this.f37602y;
        if (bi1Var2 == null) {
            bi1 bi1Var3 = new bi1("d", -2368069, -9722489, -2762611, -7817084);
            this.f37602y = bi1Var3;
            bi1Var3.h = 0.34f;
        } else {
            arrayList.remove(bi1Var2);
        }
        ci1 ci1Var2 = this.E;
        if (ci1Var2 != null) {
            arrayList.remove(ci1Var2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            hashMap = this.Y;
            if (i16 < size) {
                Object obj3 = arrayList.get(i16);
                if (obj3 instanceof bi1) {
                    r52 = (bi1) obj3;
                    String str3 = r52.f38103a;
                    if (str3 != null) {
                        r52.f38107g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f38103a)) {
                        String str4 = r52.f38103a;
                        if (str4 != null && !TextUtils.equals(this.O, str4)) {
                            i16++;
                        }
                    }
                    if (this.P == r52.f38104b) {
                        int i17 = this.Q;
                        if (i17 != r52.f38105c) {
                            continue;
                        } else if (this.R != r52.d) {
                            continue;
                        } else if (this.S != r52.e) {
                            continue;
                        } else if (i17 == 0 || this.T == r52.f38106f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i16++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.O, r52.slug) && this.P == org.telegram.ui.ActionBar.y6.Z0(r52.settings.background_color) && this.Q == org.telegram.ui.ActionBar.y6.Z0(r52.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.y6.Z0(r52.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.y6.Z0(r52.settings.fourth_background_color) && ((this.Q == 0 || this.T == AndroidUtilities.getWallpaperRotation(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.y6.T0(r52.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
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
            org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.y6.I.f23263i0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.P == org.telegram.ui.ActionBar.y6.Z0(wallPaperSettings.background_color) && this.Q == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper3.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper3.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper3.settings.fourth_background_color) && (this.Q == 0 || this.R != 0 || this.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.y6.T0(tL_wallPaper3.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
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
            j11 = tL_wallPaper3.f22181id;
        } else {
            String str5 = this.O;
            if ((r52 instanceof bi1) && (wallPaper = r52.f38111l) != null) {
                j10 = wallPaper.f22181id;
            } else {
                j10 = 0;
            }
            str = str5;
            j11 = j10;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q5 = org.telegram.ui.ActionBar.y6.C0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.X;
                    if (obj4 instanceof bi1) {
                        obj4 = ((bi1) obj4).f38111l;
                    }
                    if (obj5 instanceof bi1) {
                        obj5 = ((bi1) obj5).f38111l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j12 = j11;
                        if (j12 != 0) {
                            if (wallPaper2.f22181id != j12) {
                                if (wallPaper3.f22181id == j12) {
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
                        boolean z10 = q5;
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
        if (org.telegram.ui.ActionBar.y6.f1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.y6.f23422h0)) {
            if (this.E == null) {
                ?? obj4 = new Object();
                obj4.f38469a = "t";
                obj4.f38470b = -2;
                obj4.f38471c = -2;
                this.E = obj4;
            }
            arrayList.add(0, this.E);
        } else {
            this.E = null;
        }
        org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
        if (!TextUtils.isEmpty(this.O) && ("d".equals(this.O) || obj != null)) {
            if (obj == null && this.P != 0 && "c".equals(this.O)) {
                int i18 = this.Q;
                if (i18 != 0 && (i13 = this.R) != 0 && (i14 = this.S) != 0) {
                    bi1 bi1Var4 = new bi1(this.O, this.P, i18, i13, i14);
                    this.f37600w = bi1Var4;
                    bi1Var4.f38106f = this.T;
                } else {
                    this.f37600w = new bi1(this.P, i18, this.O, this.T);
                }
                arrayList.add(0, this.f37600w);
            }
        } else if (!"c".equals(this.O) && (i12 = this.P) != 0) {
            if (x6Var.f23263i0 != null) {
                bi1 bi1Var5 = new bi1(this.O, i12, this.Q, this.R, this.S, this.T, this.U, this.V, new File(ApplicationLoader.getFilesDirFixed(), x6Var.f23263i0.f23050a));
                this.f37600w = bi1Var5;
                bi1Var5.f38107g = tL_wallPaper;
                arrayList.add(0, bi1Var5);
            }
        } else {
            int i19 = this.P;
            if (i19 != 0) {
                int i20 = this.Q;
                if (i20 != 0 && (i11 = this.R) != 0) {
                    bi1 bi1Var6 = new bi1(this.O, i19, i20, i11, this.S);
                    this.f37600w = bi1Var6;
                    bi1Var6.f38106f = this.T;
                } else {
                    this.f37600w = new bi1(i19, i20, this.O, this.T);
                }
                arrayList.add(0, this.f37600w);
            } else if (x6Var.f23263i0 != null && !hashMap.containsKey(this.O)) {
                ci1 ci1Var3 = new ci1(new File(ApplicationLoader.getFilesDirFixed(), x6Var.f23263i0.f23050a), new File(ApplicationLoader.getFilesDirFixed(), x6Var.f23263i0.f23051b), this.O);
                this.f37601x = ci1Var3;
                if (this.E != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(i10, ci1Var3);
            }
        }
        if (!"d".equals(this.O) && !arrayList.isEmpty()) {
            arrayList.add(1, this.f37602y);
        } else {
            arrayList.add(0, this.f37602y);
        }
        D0();
    }

    public final void C0(boolean z10) {
        long j10 = 0;
        if (!z10) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            long j11 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.WallPaper) {
                    long j12 = ((TLRPC.WallPaper) obj).f22181id;
                    if (j12 >= 0) {
                        j11 = MediaDataController.calcHash(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new fi.m3(13, this, z10)), this.classGuid);
    }

    public final void D0() {
        this.f37587a = 0;
        int i10 = this.f37598r;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f37587a = 2;
            this.f37589b = 1;
            this.h = -1;
            this.f37597n = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f37589b = -1;
            this.h = 0;
            this.f37587a = 2;
            this.f37597n = 1;
        } else {
            this.uploadImageRow = -1;
            this.f37589b = -1;
            this.h = -1;
            this.f37597n = -1;
        }
        ArrayList arrayList = this.f37588a0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.N);
            this.d = ceil;
            int i11 = this.f37587a;
            this.f37591c = i11;
            this.f37587a = i11 + ceil;
        } else {
            this.f37591c = -1;
        }
        if (i10 == 0) {
            int i12 = this.f37587a;
            this.e = i12;
            this.f37587a = i12 + 2;
            this.f37595f = i12 + 1;
        } else {
            this.e = -1;
            this.f37595f = -1;
        }
        di1 di1Var = this.G;
        if (di1Var != null) {
            this.f37596f0 = true;
            di1Var.l();
        }
    }

    public final void E0() {
        int childCount = this.F.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.F.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.fb) {
                org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    fbVar.c(i11, false, true);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23376e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23520m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
    }

    @Override
    public final View createView(Context context) {
        this.f37599s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.v.setStyle(Paint.Style.STROKE);
        this.v.setColor(855638016);
        this.M = new org.telegram.ui.Components.ba1(getParentActivity(), this, new wh1(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f37598r;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new yh1(this));
        if (i10 == 0) {
            org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
            a2.N();
            a2.f23291z0 = new zh1(this);
            this.J = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.x5 h = this.simpleActionBar.h();
            h.c(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            h.c(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            this.f37594e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.F = mm0Var;
        mm0Var.u1();
        org.telegram.ui.Components.mm0 mm0Var2 = this.F;
        int i11 = org.telegram.ui.ActionBar.y6.f23299a7;
        org.telegram.ui.ActionBar.f7.i(i11, mm0Var2, getResourceProvider());
        this.F.setHorizontalScrollBarEnabled(false);
        this.F.setVerticalScrollBarEnabled(false);
        this.F.setItemAnimator(null);
        this.F.setLayoutAnimation(null);
        org.telegram.ui.Components.mm0 mm0Var3 = this.F;
        ig.a0 a0Var = new ig.a0(1, false, 19);
        this.I = a0Var;
        mm0Var3.setLayoutManager(a0Var);
        frameLayout.addView(this.F, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        org.telegram.ui.Components.mm0 mm0Var4 = this.F;
        di1 di1Var = new di1(this, context);
        this.G = di1Var;
        mm0Var4.setAdapter(di1Var);
        this.H = new ei1(this, context);
        org.telegram.ui.ActionBar.f7.I(this.F, org.telegram.ui.ActionBar.y6.f23377e8, null);
        this.F.setOnItemClickListener(new m11(this, 13));
        this.F.setOnScrollListener(new x81(this, 5));
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.K = uzVar;
        uzVar.setVisibility(8);
        this.K.setShowAtCenter(true);
        org.telegram.ui.ActionBar.f7.i(i11, this.K, null);
        this.K.setText(LocaleController.getString(R.string.NoResult));
        this.F.setEmptyView(this.K);
        frameLayout.addView(this.K, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        D0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        bi1 bi1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f37592c0.clear();
            HashMap hashMap2 = this.f37593d0;
            hashMap2.clear();
            HashMap hashMap3 = this.Y;
            ArrayList arrayList3 = this.f37590b0;
            int i15 = this.f37598r;
            HashMap hashMap4 = this.Z;
            ArrayList arrayList4 = this.f37588a0;
            if (i15 != 1 && i15 != 2) {
                arrayList4.clear();
                arrayList3.clear();
                hashMap4.clear();
                ArrayList arrayList5 = this.X;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f22033id))) {
                                    this.f37592c0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f22033id), wallPaper);
                                }
                            } else {
                                i12 = i15;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i12 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z10) && (org.telegram.ui.ActionBar.y6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                            bi1Var = new bi1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            bi1Var = new bi1(i17, i18, null, wallPaperSettings4.rotation);
                        }
                        bi1Var.f38103a = wallPaper.slug;
                        bi1Var.h = wallPaperSettings4.intensity / 100.0f;
                        bi1Var.f38106f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        bi1Var.f38111l = wallPaper;
                        if (wallPaper.f22181id < 0) {
                            String a2 = bi1Var.a();
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
                                arrayList3.add(bi1Var);
                                hashMap4.put(a2, bi1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.y6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(bi1Var);
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
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).f22181id);
                }
            }
            this.O = org.telegram.ui.ActionBar.y6.J0();
            B0();
            C0(false);
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.mm0 mm0Var = this.F;
            if (mm0Var != null) {
                mm0Var.g1();
            }
            org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
            if (r5Var != null) {
                r5Var.f(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            getMessagesStorage().getWallpapers();
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.F;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23299a7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23338c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23428h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23356d6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.M.a(i10, i11, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.mm0 mm0Var = this.F;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new i7(this, 8));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f37598r;
        if (i10 != 0 && i10 != 2) {
            A0(this.f37588a0, org.telegram.ui.ActionBar.y6.I.q());
            if (i10 == 1 && this.f37592c0.isEmpty()) {
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
        int i10 = this.f37598r;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            }
        } else {
            ei1 ei1Var = this.H;
            if (ei1Var.f39121s != 0) {
                ConnectionsManager.getInstance(ei1Var.E.currentAccount).cancelRequest(ei1Var.f39121s, true);
                ei1Var.f39121s = 0;
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
        org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.y6.I.f23263i0;
        if (r6Var != null) {
            String str2 = r6Var.f23052c;
            this.O = str2;
            if (str2 == null) {
                this.O = "";
            }
            this.P = r6Var.d;
            this.Q = r6Var.e;
            this.R = r6Var.f23053f;
            this.S = r6Var.f23054g;
            this.T = r6Var.h;
            this.U = r6Var.f23057k;
            this.V = r6Var.f23056j;
            this.W = r6Var.f23055i;
        } else {
            if (org.telegram.ui.ActionBar.y6.f1()) {
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
        B0();
        org.telegram.ui.Components.mm0 mm0Var = this.F;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new i7(this, 8));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.f26805a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.M.f26805a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
