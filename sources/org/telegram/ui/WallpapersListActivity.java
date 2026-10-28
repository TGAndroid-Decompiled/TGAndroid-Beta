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
    public static final int[][] f37606g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f37607h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f37608i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f37609j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f37610k0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public ei1 E;
    public org.telegram.ui.Components.nm0 F;
    public fi1 G;
    public gi1 H;
    public ig.a0 I;
    public org.telegram.ui.ActionBar.y5 J;
    public org.telegram.ui.Components.uz K;
    public org.telegram.ui.ActionBar.e2 L;
    public org.telegram.ui.Components.ca1 M;
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
    public int f37611a;
    public final ArrayList f37612a0;
    public int f37613b;
    public final ArrayList f37614b0;
    public int f37615c;
    public ArrayList f37616c0;
    public int d;
    public final HashMap f37617d0;
    public int e;
    public final LongSparseArray f37618e0;
    public int f37619f;
    public boolean f37620f0;
    public int h;
    public int f37621n;
    public final int f37622r;
    public Paint f37623s;
    private int uploadImageRow;
    public Paint v;
    public di1 f37624w;
    public ei1 f37625x;
    public di1 f37626y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.N = 3;
        this.O = "";
        this.X = new ArrayList();
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.f37612a0 = new ArrayList();
        this.f37614b0 = new ArrayList();
        this.f37616c0 = new ArrayList();
        this.f37617d0 = new HashMap();
        this.f37618e0 = new LongSparseArray();
        this.f37622r = i10;
    }

    public static void A0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f37607h0;
        } else {
            iArr = f37606g0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new di1(iArr2[0], 0, "c", 45));
            } else {
                arrayList.add(new di1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
            }
        }
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.F.getAdapter() != wallpapersListActivity.H) {
            if (i10 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.M.b();
            } else if (i10 == wallpapersListActivity.f37613b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f37616c0 = wallpapersListActivity.f37616c0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i10 == wallpapersListActivity.e) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new wh1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                wallpapersListActivity.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                }
            }
        }
    }

    public static void W(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.simpleActionBar.o()) {
            wallpapersListActivity.f37618e0.clear();
            wallpapersListActivity.simpleActionBar.n();
            wallpapersListActivity.E0();
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.L = e2Var;
        e2Var.f22576i0 = false;
        e2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new l(wallpapersListActivity, 25));
    }

    public static void s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.hj hjVar, Object obj, int i10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        di1 di1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f37618e0;
        boolean z10 = false;
        if (wallpapersListActivity.simpleActionBar.o()) {
            if (di1Var instanceof di1) {
                obj2 = ((di1) di1Var).f38630l;
            } else {
                obj2 = di1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f22182id) >= 0) {
                longSparseArray.remove(wallPaper.f22182id);
            } else {
                longSparseArray.put(wallPaper.f22182id, di1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.simpleActionBar.n();
            } else {
                wallpapersListActivity.simpleActionBar.t(longSparseArray.size(), true);
            }
            wallpapersListActivity.f37620f0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f22182id) >= 0) {
                z10 = true;
            }
            hjVar.c(i10, z10, true);
            return;
        }
        boolean z11 = di1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) di1Var).slug;
        } else if (di1Var instanceof di1) {
            str = ((di1) di1Var).f38622a;
        } else if (di1Var instanceof ei1) {
            str = ((ei1) di1Var).f38882a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) di1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                di1 di1Var2 = new di1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                di1Var2.f38626g = tL_wallPaper;
                di1Var2.f38630l = tL_wallPaper;
                di1Var = di1Var2;
            }
        }
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(di1Var, null, true, 4);
        if (wallpapersListActivity.f37622r == 1) {
            opVar.J1 = new wh1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z12 = wallpapersListActivity.W;
            boolean z13 = wallpapersListActivity.V;
            float f7 = wallpapersListActivity.U;
            opVar.G1 = z12;
            opVar.F1 = z13;
            opVar.f44288o1 = f7;
        }
        opVar.V0 = wallpapersListActivity.f37616c0;
        if (opVar.f44249b == 1 || (opVar.C1 instanceof di1)) {
            ((di1) opVar.C1).getClass();
        }
        opVar.d1(0L);
        ?? obj3 = new Object();
        obj3.f22929a = true;
        opVar.f44246a.f43971a = wallpapersListActivity.resourceProvider;
        obj3.f22931c = new w90(15);
        obj3.e = true;
        wallpapersListActivity.showAsSheet(opVar, obj3);
    }

    public static boolean t0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.hj hjVar, Object obj, int i10) {
        Object obj2;
        int i11 = wallpapersListActivity.f37622r;
        if (i11 != 2 && i11 != 3) {
            if (obj instanceof di1) {
                obj2 = ((di1) obj).f38630l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.simpleActionBar.o() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f37618e0.put(((TLRPC.WallPaper) obj2).f22182id, obj);
                wallpapersListActivity.simpleActionBar.t(1, false);
                wallpapersListActivity.f37620f0 = false;
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
        int i15 = this.f37622r;
        if (i15 != 0 && i15 != 2) {
            return;
        }
        MessagesController.getGlobalMainSettings();
        di1 di1Var = this.f37624w;
        ArrayList arrayList = this.f37612a0;
        if (di1Var != null) {
            arrayList.remove(di1Var);
            this.f37624w = null;
        }
        ei1 ei1Var = this.f37625x;
        if (ei1Var != null) {
            arrayList.remove(ei1Var);
            this.f37625x = null;
        }
        di1 di1Var2 = this.f37626y;
        if (di1Var2 == null) {
            di1 di1Var3 = new di1("d", -2368069, -9722489, -2762611, -7817084);
            this.f37626y = di1Var3;
            di1Var3.h = 0.34f;
        } else {
            arrayList.remove(di1Var2);
        }
        ei1 ei1Var2 = this.E;
        if (ei1Var2 != null) {
            arrayList.remove(ei1Var2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            hashMap = this.Y;
            if (i16 < size) {
                Object obj3 = arrayList.get(i16);
                if (obj3 instanceof di1) {
                    r52 = (di1) obj3;
                    String str3 = r52.f38622a;
                    if (str3 != null) {
                        r52.f38626g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f38622a)) {
                        String str4 = r52.f38622a;
                        if (str4 != null && !TextUtils.equals(this.O, str4)) {
                            i16++;
                        }
                    }
                    if (this.P == r52.f38623b) {
                        int i17 = this.Q;
                        if (i17 != r52.f38624c) {
                            continue;
                        } else if (this.R != r52.d) {
                            continue;
                        } else if (this.S != r52.e) {
                            continue;
                        } else if (i17 == 0 || this.T == r52.f38625f) {
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
            org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.y6.I.f23264i0;
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
            j11 = tL_wallPaper3.f22182id;
        } else {
            String str5 = this.O;
            if ((r52 instanceof di1) && (wallPaper = r52.f38630l) != null) {
                j10 = wallPaper.f22182id;
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
                    if (obj4 instanceof di1) {
                        obj4 = ((di1) obj4).f38630l;
                    }
                    if (obj5 instanceof di1) {
                        obj5 = ((di1) obj5).f38630l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j12 = j11;
                        if (j12 != 0) {
                            if (wallPaper2.f22182id != j12) {
                                if (wallPaper3.f22182id == j12) {
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
        if (org.telegram.ui.ActionBar.y6.f1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.y6.f23423h0)) {
            if (this.E == null) {
                ?? obj4 = new Object();
                obj4.f38882a = "t";
                obj4.f38883b = -2;
                obj4.f38884c = -2;
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
                    di1 di1Var4 = new di1(this.O, this.P, i18, i13, i14);
                    this.f37624w = di1Var4;
                    di1Var4.f38625f = this.T;
                } else {
                    this.f37624w = new di1(this.P, i18, this.O, this.T);
                }
                arrayList.add(0, this.f37624w);
            }
        } else if (!"c".equals(this.O) && (i12 = this.P) != 0) {
            if (x6Var.f23264i0 != null) {
                di1 di1Var5 = new di1(this.O, i12, this.Q, this.R, this.S, this.T, this.U, this.V, new File(ApplicationLoader.getFilesDirFixed(), x6Var.f23264i0.f23051a));
                this.f37624w = di1Var5;
                di1Var5.f38626g = tL_wallPaper;
                arrayList.add(0, di1Var5);
            }
        } else {
            int i19 = this.P;
            if (i19 != 0) {
                int i20 = this.Q;
                if (i20 != 0 && (i11 = this.R) != 0) {
                    di1 di1Var6 = new di1(this.O, i19, i20, i11, this.S);
                    this.f37624w = di1Var6;
                    di1Var6.f38625f = this.T;
                } else {
                    this.f37624w = new di1(i19, i20, this.O, this.T);
                }
                arrayList.add(0, this.f37624w);
            } else if (x6Var.f23264i0 != null && !hashMap.containsKey(this.O)) {
                ei1 ei1Var3 = new ei1(new File(ApplicationLoader.getFilesDirFixed(), x6Var.f23264i0.f23051a), new File(ApplicationLoader.getFilesDirFixed(), x6Var.f23264i0.f23052b), this.O);
                this.f37625x = ei1Var3;
                if (this.E != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(i10, ei1Var3);
            }
        }
        if (!"d".equals(this.O) && !arrayList.isEmpty()) {
            arrayList.add(1, this.f37626y);
        } else {
            arrayList.add(0, this.f37626y);
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
                    long j12 = ((TLRPC.WallPaper) obj).f22182id;
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
        this.f37611a = 0;
        int i10 = this.f37622r;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f37611a = 2;
            this.f37613b = 1;
            this.h = -1;
            this.f37621n = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f37613b = -1;
            this.h = 0;
            this.f37611a = 2;
            this.f37621n = 1;
        } else {
            this.uploadImageRow = -1;
            this.f37613b = -1;
            this.h = -1;
            this.f37621n = -1;
        }
        ArrayList arrayList = this.f37612a0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.N);
            this.d = ceil;
            int i11 = this.f37611a;
            this.f37615c = i11;
            this.f37611a = i11 + ceil;
        } else {
            this.f37615c = -1;
        }
        if (i10 == 0) {
            int i12 = this.f37611a;
            this.e = i12;
            this.f37611a = i12 + 2;
            this.f37619f = i12 + 1;
        } else {
            this.e = -1;
            this.f37619f = -1;
        }
        fi1 fi1Var = this.G;
        if (fi1Var != null) {
            this.f37620f0 = true;
            fi1Var.l();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23377e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final View createView(Context context) {
        this.f37623s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.v.setStyle(Paint.Style.STROKE);
        this.v.setColor(855638016);
        this.M = new org.telegram.ui.Components.ca1(getParentActivity(), this, new yh1(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.f37622r;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai1(this));
        if (i10 == 0) {
            org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
            a2.N();
            a2.f23292z0 = new bi1(this);
            this.J = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.x5 h = this.simpleActionBar.h();
            h.c(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            h.c(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            this.f37618e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.F = nm0Var;
        nm0Var.u1();
        org.telegram.ui.Components.nm0 nm0Var2 = this.F;
        int i11 = org.telegram.ui.ActionBar.y6.f23300a7;
        org.telegram.ui.ActionBar.f7.i(i11, nm0Var2, getResourceProvider());
        this.F.setHorizontalScrollBarEnabled(false);
        this.F.setVerticalScrollBarEnabled(false);
        this.F.setItemAnimator(null);
        this.F.setLayoutAnimation(null);
        org.telegram.ui.Components.nm0 nm0Var3 = this.F;
        ig.a0 a0Var = new ig.a0(1, false, 19);
        this.I = a0Var;
        nm0Var3.setLayoutManager(a0Var);
        frameLayout.addView(this.F, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        org.telegram.ui.Components.nm0 nm0Var4 = this.F;
        fi1 fi1Var = new fi1(this, context);
        this.G = fi1Var;
        nm0Var4.setAdapter(fi1Var);
        this.H = new gi1(this, context);
        org.telegram.ui.ActionBar.f7.I(this.F, org.telegram.ui.ActionBar.y6.f23378e8, null);
        this.F.setOnItemClickListener(new o11(this, 13));
        this.F.setOnScrollListener(new z81(this, 5));
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.K = uzVar;
        uzVar.setVisibility(8);
        this.K.setShowAtCenter(true);
        org.telegram.ui.ActionBar.f7.i(i11, this.K, null);
        this.K.setText(LocaleController.getString(R.string.NoResult));
        this.F.setEmptyView(this.K);
        frameLayout.addView(this.K, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        D0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        di1 di1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f37616c0.clear();
            HashMap hashMap2 = this.f37617d0;
            hashMap2.clear();
            HashMap hashMap3 = this.Y;
            ArrayList arrayList3 = this.f37614b0;
            int i15 = this.f37622r;
            HashMap hashMap4 = this.Z;
            ArrayList arrayList4 = this.f37612a0;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f22034id))) {
                                    this.f37616c0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f22034id), wallPaper);
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
                            di1Var = new di1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            di1Var = new di1(i17, i18, null, wallPaperSettings4.rotation);
                        }
                        di1Var.f38622a = wallPaper.slug;
                        di1Var.h = wallPaperSettings4.intensity / 100.0f;
                        di1Var.f38625f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        di1Var.f38630l = wallPaper;
                        if (wallPaper.f22182id < 0) {
                            String a2 = di1Var.a();
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
                                arrayList3.add(di1Var);
                                hashMap4.put(a2, di1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.y6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(di1Var);
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
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).f22182id);
                }
            }
            this.O = org.telegram.ui.ActionBar.y6.J0();
            B0();
            C0(false);
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.nm0 nm0Var = this.F;
            if (nm0Var != null) {
                nm0Var.g1();
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
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.F;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23300a7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23339c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23429h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
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
        org.telegram.ui.Components.nm0 nm0Var = this.F;
        if (nm0Var != null) {
            nm0Var.getViewTreeObserver().addOnPreDrawListener(new i7(this, 7));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f37622r;
        if (i10 != 0 && i10 != 2) {
            A0(this.f37612a0, org.telegram.ui.ActionBar.y6.I.q());
            if (i10 == 1 && this.f37616c0.isEmpty()) {
                NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        } else {
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        int i10 = this.f37622r;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            }
        } else {
            gi1 gi1Var = this.H;
            if (gi1Var.f39632s != 0) {
                ConnectionsManager.getInstance(gi1Var.E.currentAccount).cancelRequest(gi1Var.f39632s, true);
                gi1Var.f39632s = 0;
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
        org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.y6.I.f23264i0;
        if (r6Var != null) {
            String str2 = r6Var.f23053c;
            this.O = str2;
            if (str2 == null) {
                this.O = "";
            }
            this.P = r6Var.d;
            this.Q = r6Var.e;
            this.R = r6Var.f23054f;
            this.S = r6Var.f23055g;
            this.T = r6Var.h;
            this.U = r6Var.f23058k;
            this.V = r6Var.f23057j;
            this.W = r6Var.f23056i;
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
        org.telegram.ui.Components.nm0 nm0Var = this.F;
        if (nm0Var != null) {
            nm0Var.getViewTreeObserver().addOnPreDrawListener(new i7(this, 7));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.f27113a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.M.f27113a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
