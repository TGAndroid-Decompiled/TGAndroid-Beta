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
public class WallpapersListActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[][] f32371h0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f32372i0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f32373j0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f32374k0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f32375l0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public vi1 B;
    public ui1 C;
    public vi1 D;
    public org.telegram.ui.Components.rl0 E;
    public wi1 F;
    public xi1 G;
    public k H;
    public org.telegram.ui.ActionBar.w0 I;
    public NumberTextView J;
    public org.telegram.ui.Components.mz K;
    public final ArrayList L;
    public org.telegram.ui.ActionBar.d2 M;
    public org.telegram.ui.Components.s81 N;
    public int O;
    public String P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public boolean W;
    public boolean X;
    public final ArrayList Y;
    public final HashMap Z;
    public int f32376a;
    public final HashMap f32377a0;
    public int f32378b;
    public final ArrayList f32379b0;
    public int f32380c;
    public final ArrayList f32381c0;
    public int d;
    public ArrayList f32382d0;
    public int e;
    public final HashMap f32383e0;
    public int f32384f;
    public final LongSparseArray f32385f0;
    public boolean f32386g0;
    public int h;
    public int f32387n;
    public int f32388r;
    public int f32389s;
    private int uploadImageRow;
    public final int v;
    public Paint f32390w;
    public Paint f32391x;
    public ui1 f32392y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.L = new ArrayList();
        this.O = 3;
        this.P = "";
        this.Y = new ArrayList();
        this.Z = new HashMap();
        this.f32377a0 = new HashMap();
        this.f32379b0 = new ArrayList();
        this.f32381c0 = new ArrayList();
        this.f32382d0 = new ArrayList();
        this.f32383e0 = new HashMap();
        this.f32385f0 = new LongSparseArray();
        this.v = i10;
    }

    public static void U(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.f32385f0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.M = d2Var;
        d2Var.f19565d0 = false;
        d2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new o(wallpapersListActivity, 24));
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.E.getAdapter() != wallpapersListActivity.G) {
            if (i10 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.N.b();
            } else if (i10 == wallpapersListActivity.f32378b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f32382d0 = wallpapersListActivity.f32382d0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i10 == wallpapersListActivity.h) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new ni1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                wallpapersListActivity.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                }
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.yi yiVar, Object obj, int i10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        ui1 ui1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f32385f0;
        boolean z4 = false;
        if (wallpapersListActivity.actionBar.s()) {
            if (ui1Var instanceof ui1) {
                obj2 = ((ui1) ui1Var).f38865l;
            } else {
                obj2 = ui1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f19311id) >= 0) {
                longSparseArray.remove(wallPaper.f19311id);
            } else {
                longSparseArray.put(wallPaper.f19311id, ui1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.actionBar.r();
            } else {
                wallpapersListActivity.J.a(longSparseArray.size(), true);
            }
            wallpapersListActivity.f32386g0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f19311id) >= 0) {
                z4 = true;
            }
            yiVar.c(i10, z4, true);
            return;
        }
        boolean z10 = ui1Var instanceof TLRPC.TL_wallPaper;
        if (z10) {
            str = ((TLRPC.TL_wallPaper) ui1Var).slug;
        } else if (ui1Var instanceof ui1) {
            str = ((ui1) ui1Var).f38857a;
        } else if (ui1Var instanceof vi1) {
            str = ((vi1) ui1Var).f39120a;
        } else {
            str = null;
        }
        if (z10) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) ui1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                ui1 ui1Var2 = new ui1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                ui1Var2.f38861g = tL_wallPaper;
                ui1Var2.f38865l = tL_wallPaper;
                ui1Var = ui1Var2;
            }
        }
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(ui1Var, null, true, 4);
        if (wallpapersListActivity.v == 1) {
            woVar.F1 = new ni1(wallpapersListActivity);
        }
        if (wallpapersListActivity.P.equals(str)) {
            boolean z11 = wallpapersListActivity.X;
            boolean z12 = wallpapersListActivity.W;
            float f10 = wallpapersListActivity.V;
            woVar.C1 = z11;
            woVar.B1 = z12;
            woVar.f35210k1 = f10;
        }
        woVar.R0 = wallpapersListActivity.f32382d0;
        if (woVar.f35182b == 1 || (woVar.f35242y1 instanceof ui1)) {
            ((ui1) woVar.f35242y1).getClass();
        }
        woVar.c1(0L);
        ?? obj3 = new Object();
        obj3.f20453a = true;
        woVar.f35179a.f35166a = wallpapersListActivity.resourceProvider;
        obj3.f20455c = new j21(6);
        obj3.e = true;
        wallpapersListActivity.showAsSheet(woVar, obj3);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.yi yiVar, Object obj, int i10) {
        Object obj2;
        ArrayList arrayList = wallpapersListActivity.L;
        int i11 = wallpapersListActivity.v;
        if (i11 != 2 && i11 != 3) {
            if (obj instanceof ui1) {
                obj2 = ((ui1) obj).f38865l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f32385f0.put(((TLRPC.WallPaper) obj2).f19311id, obj);
                wallpapersListActivity.J.a(1, false);
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
                wallpapersListActivity.f32386g0 = false;
                wallpapersListActivity.actionBar.O(null, null);
                yiVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public static void z0(ArrayList arrayList, boolean z4) {
        int[][] iArr;
        if (z4) {
            iArr = f32372i0;
        } else {
            iArr = f32371h0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new ui1(iArr2[0], 0, "c", 45));
            } else {
                arrayList.add(new ui1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
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
        ui1 ui1Var = this.f32392y;
        ArrayList arrayList = this.f32379b0;
        if (ui1Var != null) {
            arrayList.remove(ui1Var);
            this.f32392y = null;
        }
        vi1 vi1Var = this.B;
        if (vi1Var != null) {
            arrayList.remove(vi1Var);
            this.B = null;
        }
        ui1 ui1Var2 = this.C;
        if (ui1Var2 == null) {
            ui1 ui1Var3 = new ui1("d", -2368069, -9722489, -2762611, -7817084);
            this.C = ui1Var3;
            ui1Var3.h = 0.34f;
        } else {
            arrayList.remove(ui1Var2);
        }
        vi1 vi1Var2 = this.D;
        if (vi1Var2 != null) {
            arrayList.remove(vi1Var2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            hashMap = this.Z;
            if (i16 < size) {
                Object obj3 = arrayList.get(i16);
                if (obj3 instanceof ui1) {
                    r52 = (ui1) obj3;
                    String str3 = r52.f38857a;
                    if (str3 != null) {
                        r52.f38861g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f38857a)) {
                        String str4 = r52.f38857a;
                        if (str4 != null && !TextUtils.equals(this.P, str4)) {
                            i16++;
                        }
                    }
                    if (this.Q == r52.f38858b) {
                        int i17 = this.R;
                        if (i17 != r52.f38859c) {
                            continue;
                        } else if (this.S != r52.d) {
                            continue;
                        } else if (this.T != r52.e) {
                            continue;
                        } else if (i17 == 0 || this.U == r52.f38860f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i16++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.P, r52.slug) && this.Q == org.telegram.ui.ActionBar.j6.X0(r52.settings.background_color) && this.R == org.telegram.ui.ActionBar.j6.X0(r52.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.j6.X0(r52.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.j6.X0(r52.settings.fourth_background_color) && ((this.R == 0 || this.U == AndroidUtilities.getWallpaperRotation(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.j6.R0(r52.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
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
            org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.j6.I.f19789f0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.Q == org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color) && this.R == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper3.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper3.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper3.settings.fourth_background_color) && (this.R == 0 || this.S != 0 || this.U == AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.j6.R0(tL_wallPaper3.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                str2 = this.P;
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
            j11 = tL_wallPaper3.f19311id;
        } else {
            String str5 = this.P;
            if ((r52 instanceof ui1) && (wallPaper = r52.f38865l) != null) {
                j10 = wallPaper.f19311id;
            } else {
                j10 = 0;
            }
            str = str5;
            j11 = j10;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q10 = org.telegram.ui.ActionBar.j6.A0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.Y;
                    if (obj4 instanceof ui1) {
                        obj4 = ((ui1) obj4).f38865l;
                    }
                    if (obj5 instanceof ui1) {
                        obj5 = ((ui1) obj5).f38865l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j12 = j11;
                        if (j12 != 0) {
                            if (wallPaper2.f19311id != j12) {
                                if (wallPaper3.f19311id == j12) {
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
                        boolean z4 = q10;
                        if (!z4) {
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
                        boolean z10 = wallPaper2.dark;
                        if ((z10 && wallPaper3.dark) || (!z10 && !wallPaper3.dark)) {
                            if (indexOf <= indexOf2) {
                                if (indexOf < indexOf2) {
                                    return -1;
                                }
                                return 0;
                            }
                            return 1;
                        } else if (z10 && !wallPaper3.dark) {
                            if (!z4) {
                                return 1;
                            }
                            return -1;
                        } else if (z4) {
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
        if (org.telegram.ui.ActionBar.j6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.j6.f19947h0)) {
            if (this.D == null) {
                ?? obj4 = new Object();
                obj4.f39120a = "t";
                obj4.f39121b = -2;
                obj4.f39122c = -2;
                this.D = obj4;
            }
            arrayList.add(0, this.D);
        } else {
            this.D = null;
        }
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
        if (!TextUtils.isEmpty(this.P) && ("d".equals(this.P) || obj != null)) {
            if (obj == null && this.Q != 0 && "c".equals(this.P)) {
                int i18 = this.R;
                if (i18 != 0 && (i13 = this.S) != 0 && (i14 = this.T) != 0) {
                    ui1 ui1Var4 = new ui1(this.P, this.Q, i18, i13, i14);
                    this.f32392y = ui1Var4;
                    ui1Var4.f38860f = this.U;
                } else {
                    this.f32392y = new ui1(this.Q, i18, this.P, this.U);
                }
                arrayList.add(0, this.f32392y);
            }
        } else if (!"c".equals(this.P) && (i12 = this.Q) != 0) {
            if (i6Var.f19789f0 != null) {
                ui1 ui1Var5 = new ui1(this.P, i12, this.R, this.S, this.T, this.U, this.V, this.W, new File(ApplicationLoader.getFilesDirFixed(), i6Var.f19789f0.f19529a));
                this.f32392y = ui1Var5;
                ui1Var5.f38861g = tL_wallPaper;
                arrayList.add(0, ui1Var5);
            }
        } else {
            int i19 = this.Q;
            if (i19 != 0) {
                int i20 = this.R;
                if (i20 != 0 && (i11 = this.S) != 0) {
                    ui1 ui1Var6 = new ui1(this.P, i19, i20, i11, this.T);
                    this.f32392y = ui1Var6;
                    ui1Var6.f38860f = this.U;
                } else {
                    this.f32392y = new ui1(i19, i20, this.P, this.U);
                }
                arrayList.add(0, this.f32392y);
            } else if (i6Var.f19789f0 != null && !hashMap.containsKey(this.P)) {
                vi1 vi1Var3 = new vi1(new File(ApplicationLoader.getFilesDirFixed(), i6Var.f19789f0.f19529a), new File(ApplicationLoader.getFilesDirFixed(), i6Var.f19789f0.f19530b), this.P);
                this.B = vi1Var3;
                if (this.D != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(i10, vi1Var3);
            }
        }
        if (!"d".equals(this.P) && !arrayList.isEmpty()) {
            arrayList.add(1, this.C);
        } else {
            arrayList.add(0, this.C);
        }
        C0();
    }

    public final void B0(boolean z4) {
        long j10 = 0;
        if (!z4) {
            ArrayList arrayList = this.Y;
            int size = arrayList.size();
            long j11 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.WallPaper) {
                    long j12 = ((TLRPC.WallPaper) obj).f19311id;
                    if (j12 >= 0) {
                        j11 = MediaDataController.calcHash(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new org.telegram.messenger.zd(12, this, z4)), this.classGuid);
    }

    public final void C0() {
        this.f32376a = 0;
        int i10 = this.v;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f32378b = 1;
            this.f32376a = 3;
            this.f32380c = 2;
            this.f32388r = -1;
            this.f32389s = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f32378b = -1;
            this.f32380c = -1;
            this.f32388r = 0;
            this.f32376a = 2;
            this.f32389s = 1;
        } else {
            this.uploadImageRow = -1;
            this.f32378b = -1;
            this.f32380c = -1;
            this.f32388r = -1;
            this.f32389s = -1;
        }
        ArrayList arrayList = this.f32379b0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.O);
            this.e = ceil;
            int i11 = this.f32376a;
            this.d = i11;
            this.f32376a = i11 + ceil;
        } else {
            this.d = -1;
        }
        if (i10 == 0) {
            int i12 = this.f32376a;
            this.f32384f = i12;
            this.h = i12 + 1;
            this.f32376a = i12 + 3;
            this.f32387n = i12 + 2;
        } else {
            this.f32384f = -1;
            this.h = -1;
            this.f32387n = -1;
        }
        wi1 wi1Var = this.F;
        if (wi1Var != null) {
            this.f32386g0 = true;
            wi1Var.l();
        }
    }

    public final void D0() {
        int childCount = this.E.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.E.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.ya) {
                org.telegram.ui.Cells.ya yaVar = (org.telegram.ui.Cells.ya) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    yaVar.c(i11, false, true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.f32390w = new Paint(1);
        Paint paint = new Paint(1);
        this.f32391x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f32391x.setStyle(Paint.Style.STROKE);
        this.f32391x.setColor(855638016);
        this.N = new org.telegram.ui.Components.s81(getParentActivity(), this, new oi1(this));
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
        this.actionBar.setActionBarMenuOnItemClick(new ri1(this));
        if (i10 == 0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new si1(this);
            this.I = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
            j10.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20151s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.j6.f20202v8;
            kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), true);
            this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20167t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j10.getContext());
            this.J = numberTextView;
            numberTextView.setTextSize(18);
            this.J.setTypeface(AndroidUtilities.bold());
            this.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.J.setOnTouchListener(new se1(1));
            j10.addView(this.J, k7.b6.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.w0 h = j10.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.L;
            arrayList.add(h);
            arrayList.add(j10.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f32385f0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.E = rl0Var;
        rl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.E);
        org.telegram.ui.Components.rl0 rl0Var2 = this.E;
        int i12 = org.telegram.ui.ActionBar.j6.f19827a7;
        rl0Var2.setBackgroundColor(getThemedColor(i12));
        this.E.setClipToPadding(false);
        this.E.setHorizontalScrollBarEnabled(false);
        this.E.setVerticalScrollBarEnabled(false);
        this.E.setItemAnimator(null);
        this.E.setLayoutAnimation(null);
        org.telegram.ui.Components.rl0 rl0Var3 = this.E;
        k kVar2 = new k(1, false, 17);
        this.H = kVar2;
        rl0Var3.setLayoutManager(kVar2);
        frameLayout.addView(this.E, k7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.rl0 rl0Var4 = this.E;
        wi1 wi1Var = new wi1(this, context);
        this.F = wi1Var;
        rl0Var4.setAdapter(wi1Var);
        this.G = new xi1(this, context);
        this.E.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19900e8, false));
        this.E.setOnItemClickListener(new p21(this, 12));
        this.E.setOnScrollListener(new be1(this, 3));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.K = mzVar;
        mzVar.setVisibility(8);
        this.K.setShowAtCenter(true);
        this.K.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.K.setText(LocaleController.getString(R.string.NoResult));
        this.E.setEmptyView(this.K);
        frameLayout.addView(this.K, k7.b6.c(-1.0f, -1));
        C0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        ui1 ui1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z4;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f32382d0.clear();
            HashMap hashMap2 = this.f32383e0;
            hashMap2.clear();
            HashMap hashMap3 = this.Z;
            ArrayList arrayList3 = this.f32381c0;
            int i15 = this.v;
            HashMap hashMap4 = this.f32377a0;
            ArrayList arrayList4 = this.f32379b0;
            if (i15 != 1 && i15 != 2) {
                arrayList4.clear();
                arrayList3.clear();
                hashMap4.clear();
                ArrayList arrayList5 = this.Y;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f19165id))) {
                                    this.f32382d0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f19165id), wallPaper);
                                }
                            } else {
                                i12 = i15;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i12 != i14 && ((!(z4 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z4) && (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                            ui1Var = new ui1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            ui1Var = new ui1(i17, i18, null, wallPaperSettings4.rotation);
                        }
                        ui1Var.f38857a = wallPaper.slug;
                        ui1Var.h = wallPaperSettings4.intensity / 100.0f;
                        ui1Var.f38860f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        ui1Var.f38865l = wallPaper;
                        if (wallPaper.f19311id < 0) {
                            String a2 = ui1Var.a();
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
                                arrayList3.add(ui1Var);
                                hashMap4.put(a2, ui1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(ui1Var);
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
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).f19311id);
                }
            }
            this.P = org.telegram.ui.ActionBar.j6.H0();
            A0();
            B0(false);
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.rl0 rl0Var = this.E;
            if (rl0Var != null) {
                rl0Var.e1();
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            getMessagesStorage().getWallpapers();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, null, null, null, null, i10));
        View view2 = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.j6.f19827a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 48, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 48, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20042m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.t3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19918f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 16, new Class[]{org.telegram.ui.Cells.t3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19899e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19864c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19953h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 1, null, null, null, null, i10));
        return arrayList;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.N.a(i10, i11, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.rl0 rl0Var = this.E;
        if (rl0Var != null) {
            rl0Var.getViewTreeObserver().addOnPreDrawListener(new ci(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.v;
        if (i10 != 0 && i10 != 2) {
            z0(this.f32379b0, org.telegram.ui.ActionBar.j6.I.q());
            if (i10 == 1 && this.f32382d0.isEmpty()) {
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
            xi1 xi1Var = this.G;
            if (xi1Var.f40001s != 0) {
                ConnectionsManager.getInstance(xi1Var.B.currentAccount).cancelRequest(xi1Var.f40001s, true);
                xi1Var.f40001s = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        }
        this.N.getClass();
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        MessagesController.getGlobalMainSettings();
        org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.j6.I.f19789f0;
        if (c6Var != null) {
            String str2 = c6Var.f19531c;
            this.P = str2;
            if (str2 == null) {
                this.P = "";
            }
            this.Q = c6Var.d;
            this.R = c6Var.e;
            this.S = c6Var.f19532f;
            this.T = c6Var.f19533g;
            this.U = c6Var.h;
            this.V = c6Var.f19536k;
            this.W = c6Var.f19535j;
            this.X = c6Var.f19534i;
        } else {
            if (org.telegram.ui.ActionBar.j6.d1()) {
                str = "t";
            } else {
                str = "d";
            }
            this.P = str;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 45;
            this.V = 1.0f;
            this.W = false;
            this.X = false;
        }
        A0();
        org.telegram.ui.Components.rl0 rl0Var = this.E;
        if (rl0Var != null) {
            rl0Var.getViewTreeObserver().addOnPreDrawListener(new ci(this, 6));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.N.f28694a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.N.f28694a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
