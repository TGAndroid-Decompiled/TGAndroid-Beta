package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
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

public class WallpapersListActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public static final int[][] f36299g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};

    public static final int[][] f36300h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};

    public static final int[] f36301i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};

    public static final String[] f36302j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};

    public static final int[] f36303k0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public xh1 A;
    public wh1 B;
    public xh1 C;
    public org.telegram.ui.Components.zk0 D;
    public yh1 E;
    public ai1 F;
    public j G;
    public org.telegram.ui.ActionBar.v0 H;
    public NumberTextView I;
    public org.telegram.ui.Components.az J;
    public final ArrayList K;
    public org.telegram.ui.ActionBar.b2 L;
    public org.telegram.ui.Components.w71 M;
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

    public int f36304a;

    public final ArrayList f36305a0;

    public int f36306b;

    public final ArrayList f36307b0;

    public int f36308c;

    public ArrayList f36309c0;
    public int d;

    public final HashMap f36310d0;

    public int f36311e;

    public final LongSparseArray f36312e0;

    public int f36313f;

    public boolean f36314f0;
    public int h;

    public int f36315n;

    public int f36316r;

    public int f36317s;
    private int uploadImageRow;
    public final int v;

    public Paint f36318w;

    public Paint f36319x;

    public wh1 f36320y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.K = new ArrayList();
        this.N = 3;
        this.O = "";
        this.X = new ArrayList();
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.f36305a0 = new ArrayList();
        this.f36307b0 = new ArrayList();
        this.f36309c0 = new ArrayList();
        this.f36310d0 = new HashMap();
        this.f36312e0 = new LongSparseArray();
        this.v = i10;
    }

    public static void U(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.t()) {
            wallpapersListActivity.f36312e0.clear();
            wallpapersListActivity.actionBar.s();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.L = b2Var;
        b2Var.f22747c0 = false;
        b2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new n(wallpapersListActivity, 24));
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() == null || wallpapersListActivity.D.getAdapter() == wallpapersListActivity.F) {
            return;
        }
        if (i10 == wallpapersListActivity.uploadImageRow) {
            wallpapersListActivity.M.b();
            return;
        }
        if (i10 == wallpapersListActivity.f36306b) {
            WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
            wallpapersListActivity2.f36309c0 = wallpapersListActivity.f36309c0;
            wallpapersListActivity.presentFragment(wallpapersListActivity2);
        } else if (i10 == wallpapersListActivity.h) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new qh1(wallpapersListActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            wallpapersListActivity.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.ti tiVar, Object obj, int i10) {
        String str;
        Object obj2 = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f36312e0;
        boolean z10 = true;
        if (wallpapersListActivity.actionBar.t()) {
            Object obj3 = obj2 instanceof wh1 ? ((wh1) obj2).f44129l : obj2;
            if (obj3 instanceof TLRPC.WallPaper) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj3;
                if (longSparseArray.indexOfKey(wallPaper.f22532id) >= 0) {
                    longSparseArray.remove(wallPaper.f22532id);
                } else {
                    longSparseArray.put(wallPaper.f22532id, obj2);
                }
                if (longSparseArray.size() == 0) {
                    wallpapersListActivity.actionBar.s();
                } else {
                    wallpapersListActivity.I.a(longSparseArray.size(), true);
                }
                wallpapersListActivity.f36314f0 = false;
                tiVar.c(i10, longSparseArray.indexOfKey(wallPaper.f22532id) >= 0, true);
                return;
            }
            return;
        }
        boolean z11 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) obj2).slug;
        } else if (obj2 instanceof wh1) {
            str = ((wh1) obj2).f44120a;
        } else {
            str = obj2 instanceof xh1 ? ((xh1) obj2).f44467a : null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                int i11 = wallPaperSettings.background_color;
                int i12 = wallPaperSettings.second_background_color;
                int i13 = wallPaperSettings.third_background_color;
                int i14 = wallPaperSettings.fourth_background_color;
                int wallpaperRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                wh1 wh1Var = new wh1(str2, i11, i12, i13, i14, wallpaperRotation, wallPaperSettings2.intensity / 100.0f, wallPaperSettings2.motion, null);
                wh1Var.f44125g = tL_wallPaper;
                wh1Var.f44129l = tL_wallPaper;
                obj2 = wh1Var;
            }
        }
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(obj2, bitmap, z10, 4);
        if (wallpapersListActivity.v == 1) {
            ooVar.E1 = new qh1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z12 = wallpapersListActivity.W;
            boolean z13 = wallpapersListActivity.V;
            float f10 = wallpapersListActivity.U;
            ooVar.B1 = z12;
            ooVar.A1 = z13;
            ooVar.f40764j1 = f10;
        }
        ooVar.Q0 = wallpapersListActivity.f36309c0;
        if (ooVar.f40738b == 1 || (ooVar.f40795x1 instanceof wh1)) {
            ((wh1) ooVar.f40795x1).getClass();
        }
        ooVar.c1(0L);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.f23619a = true;
        ooVar.f40735a.f40429a = wallpapersListActivity.resourceProvider;
        l2Var.f23621c = new tq0(7);
        l2Var.f23622e = true;
        wallpapersListActivity.showAsSheet(ooVar, l2Var);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.ti tiVar, Object obj, int i10) {
        ArrayList arrayList = wallpapersListActivity.K;
        int i11 = wallpapersListActivity.v;
        if (i11 != 2 && i11 != 3) {
            Object obj2 = obj instanceof wh1 ? ((wh1) obj).f44129l : obj;
            if (!wallpapersListActivity.actionBar.t() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f36312e0.put(((TLRPC.WallPaper) obj2).f22532id, obj);
                wallpapersListActivity.I.a(1, false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    View view = (View) arrayList.get(i12);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(250L);
                animatorSet.start();
                wallpapersListActivity.f36314f0 = false;
                wallpapersListActivity.actionBar.O(null, null);
                tiVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public static void z0(ArrayList arrayList, boolean z10) {
        for (int[] iArr : z10 ? f36300h0 : f36299g0) {
            if (iArr.length == 1) {
                arrayList.add(new wh1(iArr[0], 0, "c", 45));
            } else {
                arrayList.add(new wh1("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    public final void A0() {
        HashMap map;
        ?? r10;
        final String str;
        final long j10;
        ?? r12;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.WallPaper wallPaper;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper2;
        ?? r11;
        int i14;
        String str3;
        int i15 = this.v;
        if (i15 == 0 || i15 == 2) {
            MessagesController.getGlobalMainSettings();
            wh1 wh1Var = this.f36320y;
            ArrayList arrayList = this.f36305a0;
            if (wh1Var != null) {
                arrayList.remove(wh1Var);
                this.f36320y = null;
            }
            xh1 xh1Var = this.A;
            if (xh1Var != null) {
                arrayList.remove(xh1Var);
                this.A = null;
            }
            wh1 wh1Var2 = this.B;
            if (wh1Var2 == null) {
                wh1 wh1Var3 = new wh1("d", -2368069, -9722489, -2762611, -7817084);
                this.B = wh1Var3;
                wh1Var3.h = 0.34f;
            } else {
                arrayList.remove(wh1Var2);
            }
            xh1 xh1Var2 = this.C;
            if (xh1Var2 != null) {
                arrayList.remove(xh1Var2);
            }
            int size = arrayList.size();
            int i16 = 0;
            while (true) {
                map = this.Y;
                if (i16 >= size) {
                    r10 = 0;
                    break;
                }
                Object obj = arrayList.get(i16);
                if (obj instanceof wh1) {
                    r10 = (wh1) obj;
                    String str4 = r10.f44120a;
                    if (str4 != null) {
                        r10.f44125g = (TLRPC.TL_wallPaper) map.get(str4);
                    }
                    if (("c".equals(r10.f44120a) || (str3 = r10.f44120a) == null || TextUtils.equals(this.O, str3)) && this.P == r10.f44121b && (i14 = this.Q) == r10.f44122c && this.R == r10.d && this.S == r10.f44123e && (i14 == 0 || this.T == r10.f44124f)) {
                        break;
                    } else {
                        i16++;
                    }
                } else {
                    if (obj instanceof TLRPC.TL_wallPaper) {
                        r10 = (TLRPC.TL_wallPaper) obj;
                        if (r10.settings != null && TextUtils.equals(this.O, r10.slug) && this.P == org.telegram.ui.ActionBar.g6.X0(r10.settings.background_color) && this.Q == org.telegram.ui.ActionBar.g6.X0(r10.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.g6.X0(r10.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.g6.X0(r10.settings.fourth_background_color) && ((this.Q == 0 || this.T == AndroidUtilities.getWallpaperRotation(r10.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.g6.R0(r10.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i16++;
                }
            }
            if (r10 instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) r10;
                org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.f22949e0;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
                if (wallPaperSettings != null && this.P == org.telegram.ui.ActionBar.g6.X0(wallPaperSettings.background_color) && this.Q == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper3.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper3.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper3.settings.fourth_background_color) && (this.Q == 0 || this.R != 0 || this.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.g6.R0(tL_wallPaper3.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
                    str2 = this.O;
                    tL_wallPaper2 = null;
                    r11 = r10;
                } else {
                    str2 = "";
                    tL_wallPaper2 = tL_wallPaper3;
                    r11 = 0;
                }
                str = str2;
                tL_wallPaper = tL_wallPaper2;
                r12 = r11;
                j10 = tL_wallPaper3.f22532id;
            } else {
                str = this.O;
                j10 = (!(r10 instanceof wh1) || (wallPaper = ((wh1) r10).f44129l) == null) ? 0L : wallPaper.f22532id;
                r12 = r10;
                tL_wallPaper = null;
            }
            final boolean zQ = org.telegram.ui.ActionBar.g6.A0().q();
            try {
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public final int compare(Object obj2, Object obj3) {
                        ArrayList arrayList2 = this.f41363a.X;
                        if (obj2 instanceof wh1) {
                            obj2 = ((wh1) obj2).f44129l;
                        }
                        if (obj3 instanceof wh1) {
                            obj3 = ((wh1) obj3).f44129l;
                        }
                        if (!(obj2 instanceof TLRPC.WallPaper) || !(obj3 instanceof TLRPC.WallPaper)) {
                            return 0;
                        }
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj2;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj3;
                        long j11 = j10;
                        if (j11 == 0) {
                            String str5 = wallPaper2.slug;
                            String str6 = str;
                            if (str6.equals(str5)) {
                                return -1;
                            }
                            if (str6.equals(wallPaper3.slug)) {
                                return 1;
                            }
                        } else {
                            if (wallPaper2.f22532id == j11) {
                                return -1;
                            }
                            if (wallPaper3.f22532id == j11) {
                                return 1;
                            }
                        }
                        boolean z10 = zQ;
                        if (!z10) {
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper2.slug)) {
                                return -1;
                            }
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper3.slug)) {
                                return 1;
                            }
                        }
                        int iIndexOf = arrayList2.indexOf(wallPaper2);
                        int iIndexOf2 = arrayList2.indexOf(wallPaper3);
                        boolean z11 = wallPaper2.dark;
                        if ((z11 && wallPaper3.dark) || (!z11 && !wallPaper3.dark)) {
                            if (iIndexOf > iIndexOf2) {
                                return 1;
                            }
                            return iIndexOf < iIndexOf2 ? -1 : 0;
                        }
                        if (!z11 || wallPaper3.dark) {
                            return z10 ? 1 : -1;
                        }
                        return z10 ? -1 : 1;
                    }
                });
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            if (org.telegram.ui.ActionBar.g6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.g6.f23119h0)) {
                if (this.C == null) {
                    xh1 xh1Var3 = new xh1();
                    xh1Var3.f44467a = "t";
                    xh1Var3.f44468b = -2;
                    xh1Var3.f44469c = -2;
                    this.C = xh1Var3;
                }
                arrayList.add(0, this.C);
            } else {
                this.C = null;
            }
            org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
            if (TextUtils.isEmpty(this.O) || (!"d".equals(this.O) && r12 == 0)) {
                if ("c".equals(this.O) || (i11 = this.P) == 0) {
                    int i17 = this.P;
                    if (i17 != 0) {
                        int i18 = this.Q;
                        if (i18 == 0 || (i10 = this.R) == 0) {
                            this.f36320y = new wh1(i17, i18, this.O, this.T);
                        } else {
                            wh1 wh1Var4 = new wh1(this.O, i17, i18, i10, this.S);
                            this.f36320y = wh1Var4;
                            wh1Var4.f44124f = this.T;
                        }
                        arrayList.add(0, this.f36320y);
                    } else if (f6Var.f22949e0 != null && !map.containsKey(this.O)) {
                        xh1 xh1Var4 = new xh1(new File(ApplicationLoader.getFilesDirFixed(), f6Var.f22949e0.f24005a), new File(ApplicationLoader.getFilesDirFixed(), f6Var.f22949e0.f24006b), this.O);
                        this.A = xh1Var4;
                        arrayList.add(this.C != null ? 1 : 0, xh1Var4);
                    }
                } else if (f6Var.f22949e0 != null) {
                    wh1 wh1Var5 = new wh1(this.O, i11, this.Q, this.R, this.S, this.T, this.U, this.V, new File(ApplicationLoader.getFilesDirFixed(), f6Var.f22949e0.f24005a));
                    this.f36320y = wh1Var5;
                    wh1Var5.f44125g = tL_wallPaper;
                    arrayList.add(0, wh1Var5);
                }
            } else if (r12 == 0 && this.P != 0 && "c".equals(this.O)) {
                int i19 = this.Q;
                if (i19 == 0 || (i12 = this.R) == 0 || (i13 = this.S) == 0) {
                    this.f36320y = new wh1(this.P, i19, this.O, this.T);
                } else {
                    wh1 wh1Var6 = new wh1(this.O, this.P, i19, i12, i13);
                    this.f36320y = wh1Var6;
                    wh1Var6.f44124f = this.T;
                }
                arrayList.add(0, this.f36320y);
            }
            if ("d".equals(this.O) || arrayList.isEmpty()) {
                arrayList.add(0, this.B);
            } else {
                arrayList.add(1, this.B);
            }
            C0();
        }
    }

    public final void B0(boolean z10) {
        long j10 = 0;
        if (!z10) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            long jCalcHash = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.WallPaper) {
                    long j11 = ((TLRPC.WallPaper) obj).f22532id;
                    if (j11 >= 0) {
                        jCalcHash = MediaDataController.calcHash(jCalcHash, j11);
                    }
                }
            }
            j10 = jCalcHash;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new lh.n3(13, this, z10)), this.classGuid);
    }

    public final void C0() {
        this.f36304a = 0;
        int i10 = this.v;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f36306b = 1;
            this.f36304a = 3;
            this.f36308c = 2;
            this.f36316r = -1;
            this.f36317s = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f36306b = -1;
            this.f36308c = -1;
            this.f36316r = 0;
            this.f36304a = 2;
            this.f36317s = 1;
        } else {
            this.uploadImageRow = -1;
            this.f36306b = -1;
            this.f36308c = -1;
            this.f36316r = -1;
            this.f36317s = -1;
        }
        ArrayList arrayList = this.f36305a0;
        if (arrayList.isEmpty()) {
            this.d = -1;
        } else {
            int iCeil = (int) Math.ceil(arrayList.size() / this.N);
            this.f36311e = iCeil;
            int i11 = this.f36304a;
            this.d = i11;
            this.f36304a = i11 + iCeil;
        }
        if (i10 == 0) {
            int i12 = this.f36304a;
            this.f36313f = i12;
            this.h = i12 + 1;
            this.f36304a = i12 + 3;
            this.f36315n = i12 + 2;
        } else {
            this.f36313f = -1;
            this.h = -1;
            this.f36315n = -1;
        }
        yh1 yh1Var = this.E;
        if (yh1Var != null) {
            this.f36314f0 = true;
            yh1Var.l();
        }
    }

    public final void D0() {
        int childCount = this.D.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.D.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.wa) {
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    waVar.c(i11, false, true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10 = 1;
        this.f36318w = new Paint(1);
        Paint paint = new Paint(1);
        this.f36319x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f36319x.setStyle(Paint.Style.STROKE);
        this.f36319x.setColor(855638016);
        this.M = new org.telegram.ui.Components.w71(getParentActivity(), this, new rh1(this));
        this.hasOwnBackground = true;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.v;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i11 == 2) {
            this.actionBar.setTitle("Channel Wallpaper");
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new th1(this));
        boolean z10 = false;
        if (i11 == 0) {
            org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
            v0VarA.F();
            v0VarA.D = new uh1(this);
            this.H = v0VarA;
            v0VarA.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.z zVarJ = this.actionBar.j(null);
            zVarJ.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23322s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.g6.f23375v8;
            kVar.D(org.telegram.ui.ActionBar.g6.w0(null, i12, false), true);
            this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23341t8, false), true);
            NumberTextView numberTextView = new NumberTextView(zVarJ.getContext());
            this.I = numberTextView;
            numberTextView.setTextSize(18);
            this.I.setTypeface(AndroidUtilities.bold());
            this.I.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.I.setOnTouchListener(new xd1(1));
            zVarJ.addView(this.I, h7.z5.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.v0 v0VarH = zVarJ.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.K;
            arrayList.add(v0VarH);
            arrayList.add(zVarJ.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f36312e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.D = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.D);
        org.telegram.ui.Components.zk0 zk0Var2 = this.D;
        int i13 = org.telegram.ui.ActionBar.g6.f22999a7;
        zk0Var2.setBackgroundColor(getThemedColor(i13));
        this.D.setClipToPadding(false);
        this.D.setHorizontalScrollBarEnabled(false);
        this.D.setVerticalScrollBarEnabled(false);
        this.D.setItemAnimator(null);
        this.D.setLayoutAnimation(null);
        org.telegram.ui.Components.zk0 zk0Var3 = this.D;
        j jVar = new j(i10, z10, 17);
        this.G = jVar;
        zk0Var3.setLayoutManager(jVar);
        frameLayout.addView(this.D, h7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.zk0 zk0Var4 = this.D;
        yh1 yh1Var = new yh1(this, context);
        this.E = yh1Var;
        zk0Var4.setAdapter(yh1Var);
        this.F = new ai1(this, context);
        this.D.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23074e8, false));
        this.D.setOnItemClickListener(new b21(this, 11));
        this.D.setOnScrollListener(new ib1(this, 4));
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.J = azVar;
        azVar.setVisibility(8);
        this.J.setShowAtCenter(true);
        this.J.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.J.setText(LocaleController.getString(R.string.NoResult));
        this.D.setEmptyView(this.J);
        frameLayout.addView(this.J, h7.z5.c(-1.0f, -1));
        C0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        int i14;
        wh1 wh1Var;
        TLRPC.WallPaperSettings wallPaperSettings2;
        String strA;
        int i15;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.WallPaperSettings wallPaperSettings4;
        int i16 = 1;
        if (i10 != NotificationCenter.wallpapersDidLoad) {
            if (i10 != NotificationCenter.didSetNewWallpapper) {
                if (i10 == NotificationCenter.wallpapersNeedReload) {
                    getMessagesStorage().getWallpapers();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.zk0 zk0Var = this.D;
            if (zk0Var != null) {
                zk0Var.f1();
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.f36309c0.clear();
        HashMap map = this.f36310d0;
        map.clear();
        HashMap map2 = this.Y;
        ArrayList arrayList2 = this.f36307b0;
        int i17 = this.v;
        HashMap map3 = this.Z;
        ArrayList arrayList3 = this.f36305a0;
        if (i17 != 1 && i17 != 2) {
            arrayList3.clear();
            arrayList2.clear();
            map3.clear();
            ArrayList arrayList4 = this.X;
            arrayList4.clear();
            map2.clear();
            arrayList4.addAll(arrayList);
        }
        int size = arrayList.size();
        int i18 = 0;
        ArrayList arrayList5 = null;
        while (i18 < size) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i18);
            if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                i12 = i17;
            } else {
                if (wallPaper instanceof TLRPC.TL_wallPaper) {
                    TLRPC.Document document = wallPaper.document;
                    if (document instanceof TLRPC.TL_documentEmpty) {
                        i12 = i17;
                        wallPaperSettings = wallPaper.settings;
                        i13 = wallPaperSettings.background_color;
                        if (i13 != 0) {
                            i14 = wallPaperSettings.second_background_color;
                            if (i14 != 0 || (i15 = wallPaperSettings.third_background_color) == 0) {
                                wh1Var = new wh1(i13, i14, null, wallPaperSettings.rotation);
                            } else {
                                wh1Var = new wh1(null, i13, i14, i15, wallPaperSettings.fourth_background_color);
                            }
                            wh1Var.f44120a = wallPaper.slug;
                            wh1Var.h = wallPaperSettings.intensity / 100.0f;
                            wh1Var.f44124f = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                            wh1Var.f44129l = wallPaper;
                            if (wallPaper.f22532id < 0) {
                                strA = wh1Var.a();
                                if (map3.containsKey(strA)) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(wallPaper);
                                } else {
                                    arrayList2.add(wh1Var);
                                    map3.put(strA, wh1Var);
                                    if (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0) {
                                        arrayList3.add(wh1Var);
                                    }
                                }
                            } else if (org.telegram.ui.ActionBar.g6.I.q()) {
                                arrayList3.add(wh1Var);
                            } else {
                                arrayList3.add(wh1Var);
                            }
                        }
                    } else {
                        if (!wallPaper.pattern || document == null) {
                            i12 = i17;
                        } else {
                            i12 = i17;
                            if (!map.containsKey(Long.valueOf(document.f22386id))) {
                                this.f36309c0.add(wallPaper);
                                map.put(Long.valueOf(wallPaper.document.f22386id), wallPaper);
                            }
                        }
                        map2.put(wallPaper.slug, wallPaper);
                        if (i12 != i16 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings4 = wallPaper.settings) != null && wallPaperSettings4.background_color != 0)) && ((i12 != 2 || z10) && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings3 = wallPaper.settings) == null || wallPaperSettings3.intensity >= 0)))) {
                            arrayList3.add(wallPaper);
                        }
                    }
                } else {
                    i12 = i17;
                    wallPaperSettings = wallPaper.settings;
                    i13 = wallPaperSettings.background_color;
                    if (i13 != 0) {
                        i14 = wallPaperSettings.second_background_color;
                        if (i14 != 0) {
                            wh1Var = new wh1(i13, i14, null, wallPaperSettings.rotation);
                        } else {
                            wh1Var = new wh1(i13, i14, null, wallPaperSettings.rotation);
                        }
                        wh1Var.f44120a = wallPaper.slug;
                        wh1Var.h = wallPaperSettings.intensity / 100.0f;
                        wh1Var.f44124f = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                        wh1Var.f44129l = wallPaper;
                        if (wallPaper.f22532id < 0) {
                            strA = wh1Var.a();
                            if (map3.containsKey(strA)) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(wallPaper);
                            } else {
                                arrayList2.add(wh1Var);
                                map3.put(strA, wh1Var);
                                if (org.telegram.ui.ActionBar.g6.I.q()) {
                                    arrayList3.add(wh1Var);
                                } else {
                                    arrayList3.add(wh1Var);
                                }
                            }
                        } else if (org.telegram.ui.ActionBar.g6.I.q()) {
                            arrayList3.add(wh1Var);
                        } else {
                            arrayList3.add(wh1Var);
                        }
                    }
                }
                i18++;
                i17 = i12;
                map = map;
                arrayList = arrayList;
                i16 = 1;
            }
            i18++;
            i17 = i12;
            map = map;
            arrayList = arrayList;
            i16 = 1;
        }
        if (arrayList5 != null) {
            int size2 = arrayList5.size();
            for (int i19 = 0; i19 < size2; i19++) {
                getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList5.get(i19)).f22532id);
            }
        }
        this.O = org.telegram.ui.ActionBar.g6.H0();
        A0();
        B0(false);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 0, null, null, null, null, i10));
        View view2 = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.f22999a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 48, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23091f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 16, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23073e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 1, null, null, null, null, i10));
        return arrayList;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.M.a(i10, i11, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.zk0 zk0Var = this.D;
        if (zk0Var != null) {
            zk0Var.getViewTreeObserver().addOnPreDrawListener(new uh(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.v;
        if (i10 == 0 || i10 == 2) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        } else {
            z0(this.f36305a0, org.telegram.ui.ActionBar.g6.I.q());
            if (i10 == 1 && this.f36309c0.isEmpty()) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        int i10 = this.v;
        if (i10 == 0 || i10 == 2) {
            ai1 ai1Var = this.F;
            if (ai1Var.f36547s != 0) {
                ConnectionsManager.getInstance(ai1Var.A.currentAccount).cancelRequest(ai1Var.f36547s, true);
                ai1Var.f36547s = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        } else if (i10 == 1) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        this.M.getClass();
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        MessagesController.getGlobalMainSettings();
        org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.f22949e0;
        if (z5Var != null) {
            String str = z5Var.f24007c;
            this.O = str;
            if (str == null) {
                this.O = "";
            }
            this.P = z5Var.d;
            this.Q = z5Var.f24008e;
            this.R = z5Var.f24009f;
            this.S = z5Var.f24010g;
            this.T = z5Var.h;
            this.U = z5Var.f24013k;
            this.V = z5Var.f24012j;
            this.W = z5Var.f24011i;
        } else {
            this.O = org.telegram.ui.ActionBar.g6.d1() ? "t" : "d";
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 45;
            this.U = 1.0f;
            this.V = false;
            this.W = false;
        }
        A0();
        org.telegram.ui.Components.zk0 zk0Var = this.D;
        if (zk0Var != null) {
            zk0Var.getViewTreeObserver().addOnPreDrawListener(new uh(this, 6));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.f34135a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.M.f34135a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
