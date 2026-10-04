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
public class WallpapersListActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[][] f34594i0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f34595j0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f34596k0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f34597l0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] m0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public zi1 E;
    public org.telegram.ui.Components.zl0 F;
    public aj1 G;
    public bj1 H;
    public gg.b0 I;
    public org.telegram.ui.ActionBar.v0 J;
    public NumberTextView K;
    public org.telegram.ui.Components.pz L;
    public final ArrayList M;
    public org.telegram.ui.ActionBar.b2 N;
    public org.telegram.ui.Components.n91 O;
    public int P;
    public String Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;
    public boolean X;
    public boolean Y;
    public final ArrayList Z;
    public int f34598a;
    public final HashMap f34599a0;
    public int f34600b;
    public final HashMap f34601b0;
    public int f34602c;
    public final ArrayList f34603c0;
    public int d;
    public final ArrayList f34604d0;
    public int f34605e;
    public ArrayList f34606e0;
    public int f34607f;
    public final HashMap f34608f0;
    public final LongSparseArray f34609g0;
    public int h;
    public boolean f34610h0;
    public int f34611n;
    public final int f34612r;
    public Paint f34613s;
    private int uploadImageRow;
    public Paint v;
    public yi1 f34614w;
    public zi1 f34615x;
    public yi1 f34616y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.M = new ArrayList();
        this.P = 3;
        this.Q = "";
        this.Z = new ArrayList();
        this.f34599a0 = new HashMap();
        this.f34601b0 = new HashMap();
        this.f34603c0 = new ArrayList();
        this.f34604d0 = new ArrayList();
        this.f34606e0 = new ArrayList();
        this.f34608f0 = new HashMap();
        this.f34609g0 = new LongSparseArray();
        this.f34612r = i10;
    }

    public static void S(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.f34609g0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.N = b2Var;
        b2Var.f20423g0 = false;
        b2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new m(wallpapersListActivity, 24));
    }

    public static void T(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.F.getAdapter() != wallpapersListActivity.H) {
            if (i10 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.O.b();
            } else if (i10 == wallpapersListActivity.f34600b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f34606e0 = wallpapersListActivity.f34606e0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i10 == wallpapersListActivity.f34605e) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new ri1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
                wallpapersListActivity.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21059q7, false));
                }
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.lj ljVar, Object obj, int i10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        yi1 yi1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f34609g0;
        boolean z10 = false;
        if (wallpapersListActivity.actionBar.s()) {
            if (yi1Var instanceof yi1) {
                obj2 = ((yi1) yi1Var).f43241l;
            } else {
                obj2 = yi1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f20190id) >= 0) {
                longSparseArray.remove(wallPaper.f20190id);
            } else {
                longSparseArray.put(wallPaper.f20190id, yi1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.actionBar.r();
            } else {
                wallpapersListActivity.K.a(longSparseArray.size(), true);
            }
            wallpapersListActivity.f34610h0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f20190id) >= 0) {
                z10 = true;
            }
            ljVar.c(i10, z10, true);
            return;
        }
        boolean z11 = yi1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) yi1Var).slug;
        } else if (yi1Var instanceof yi1) {
            str = ((yi1) yi1Var).f43232a;
        } else if (yi1Var instanceof zi1) {
            str = ((zi1) yi1Var).f43828a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) yi1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                yi1 yi1Var2 = new yi1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                yi1Var2.f43237g = tL_wallPaper;
                yi1Var2.f43241l = tL_wallPaper;
                yi1Var = yi1Var2;
            }
        }
        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(yi1Var, null, true, 4);
        if (wallpapersListActivity.f34612r == 1) {
            dpVar.I1 = new ri1(wallpapersListActivity);
        }
        if (wallpapersListActivity.Q.equals(str)) {
            boolean z12 = wallpapersListActivity.Y;
            boolean z13 = wallpapersListActivity.X;
            float f7 = wallpapersListActivity.W;
            dpVar.F1 = z12;
            dpVar.E1 = z13;
            dpVar.f40072n1 = f7;
        }
        dpVar.U0 = wallpapersListActivity.f34606e0;
        if (dpVar.f40035b == 1 || (dpVar.B1 instanceof yi1)) {
            ((yi1) dpVar.B1).getClass();
        }
        dpVar.c1(0L);
        ?? obj3 = new Object();
        obj3.f21350a = true;
        dpVar.f40032a.f40018a = wallpapersListActivity.resourceProvider;
        obj3.f21352c = new n21(5);
        obj3.f21353e = true;
        wallpapersListActivity.showAsSheet(dpVar, obj3);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.lj ljVar, Object obj, int i10) {
        Object obj2;
        ArrayList arrayList = wallpapersListActivity.M;
        int i11 = wallpapersListActivity.f34612r;
        if (i11 != 2 && i11 != 3) {
            if (obj instanceof yi1) {
                obj2 = ((yi1) obj).f43241l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f34609g0.put(((TLRPC.WallPaper) obj2).f20190id, obj);
                wallpapersListActivity.K.a(1, false);
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
                wallpapersListActivity.f34610h0 = false;
                wallpapersListActivity.actionBar.M(null, null);
                ljVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public static void z0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f34595j0;
        } else {
            iArr = f34594i0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new yi1(iArr2[0], 0, "c", 45));
            } else {
                arrayList.add(new yi1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
            }
        }
    }

    public final void A0() {
        HashMap hashMap;
        ?? r52;
        long j3;
        final String str;
        final long j10;
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
        int i15 = this.f34612r;
        if (i15 != 0 && i15 != 2) {
            return;
        }
        MessagesController.getGlobalMainSettings();
        yi1 yi1Var = this.f34614w;
        ArrayList arrayList = this.f34603c0;
        if (yi1Var != null) {
            arrayList.remove(yi1Var);
            this.f34614w = null;
        }
        zi1 zi1Var = this.f34615x;
        if (zi1Var != null) {
            arrayList.remove(zi1Var);
            this.f34615x = null;
        }
        yi1 yi1Var2 = this.f34616y;
        if (yi1Var2 == null) {
            yi1 yi1Var3 = new yi1("d", -2368069, -9722489, -2762611, -7817084);
            this.f34616y = yi1Var3;
            yi1Var3.h = 0.34f;
        } else {
            arrayList.remove(yi1Var2);
        }
        zi1 zi1Var2 = this.E;
        if (zi1Var2 != null) {
            arrayList.remove(zi1Var2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            hashMap = this.f34599a0;
            if (i16 < size) {
                Object obj3 = arrayList.get(i16);
                if (obj3 instanceof yi1) {
                    r52 = (yi1) obj3;
                    String str3 = r52.f43232a;
                    if (str3 != null) {
                        r52.f43237g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f43232a)) {
                        String str4 = r52.f43232a;
                        if (str4 != null && !TextUtils.equals(this.Q, str4)) {
                            i16++;
                        }
                    }
                    if (this.R == r52.f43233b) {
                        int i17 = this.S;
                        if (i17 != r52.f43234c) {
                            continue;
                        } else if (this.T != r52.d) {
                            continue;
                        } else if (this.U != r52.f43235e) {
                            continue;
                        } else if (i17 == 0 || this.V == r52.f43236f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i16++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.Q, r52.slug) && this.R == org.telegram.ui.ActionBar.i6.X0(r52.settings.background_color) && this.S == org.telegram.ui.ActionBar.i6.X0(r52.settings.second_background_color) && this.T == org.telegram.ui.ActionBar.i6.X0(r52.settings.third_background_color) && this.U == org.telegram.ui.ActionBar.i6.X0(r52.settings.fourth_background_color) && ((this.S == 0 || this.V == AndroidUtilities.getWallpaperRotation(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.i6.R0(r52.settings.intensity / 100.0f) - this.W) <= 0.001f)) {
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
            org.telegram.ui.ActionBar.a6 a6Var = org.telegram.ui.ActionBar.i6.I.f20701i0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.R == org.telegram.ui.ActionBar.i6.X0(wallPaperSettings.background_color) && this.S == org.telegram.ui.ActionBar.i6.X0(tL_wallPaper3.settings.second_background_color) && this.T == org.telegram.ui.ActionBar.i6.X0(tL_wallPaper3.settings.third_background_color) && this.U == org.telegram.ui.ActionBar.i6.X0(tL_wallPaper3.settings.fourth_background_color) && (this.S == 0 || this.T != 0 || this.V == AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.i6.R0(tL_wallPaper3.settings.intensity / 100.0f) - this.W) <= 0.001f)) {
                str2 = this.Q;
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
            j10 = tL_wallPaper3.f20190id;
        } else {
            String str5 = this.Q;
            if ((r52 instanceof yi1) && (wallPaper = r52.f43241l) != null) {
                j3 = wallPaper.f20190id;
            } else {
                j3 = 0;
            }
            str = str5;
            j10 = j3;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q6 = org.telegram.ui.ActionBar.i6.A0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.Z;
                    if (obj4 instanceof yi1) {
                        obj4 = ((yi1) obj4).f43241l;
                    }
                    if (obj5 instanceof yi1) {
                        obj5 = ((yi1) obj5).f43241l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j11 = j10;
                        if (j11 != 0) {
                            if (wallPaper2.f20190id != j11) {
                                if (wallPaper3.f20190id == j11) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (org.telegram.ui.ActionBar.i6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.i6.f20885h0)) {
            if (this.E == null) {
                ?? obj4 = new Object();
                obj4.f43828a = "t";
                obj4.f43829b = -2;
                obj4.f43830c = -2;
                this.E = obj4;
            }
            arrayList.add(0, this.E);
        } else {
            this.E = null;
        }
        org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.I;
        if (!TextUtils.isEmpty(this.Q) && ("d".equals(this.Q) || obj != null)) {
            if (obj == null && this.R != 0 && "c".equals(this.Q)) {
                int i18 = this.S;
                if (i18 != 0 && (i13 = this.T) != 0 && (i14 = this.U) != 0) {
                    yi1 yi1Var4 = new yi1(this.Q, this.R, i18, i13, i14);
                    this.f34614w = yi1Var4;
                    yi1Var4.f43236f = this.V;
                } else {
                    this.f34614w = new yi1(this.R, i18, this.Q, this.V);
                }
                arrayList.add(0, this.f34614w);
            }
        } else if (!"c".equals(this.Q) && (i12 = this.R) != 0) {
            if (h6Var.f20701i0 != null) {
                yi1 yi1Var5 = new yi1(this.Q, i12, this.S, this.T, this.U, this.V, this.W, this.X, new File(ApplicationLoader.getFilesDirFixed(), h6Var.f20701i0.f20385a));
                this.f34614w = yi1Var5;
                yi1Var5.f43237g = tL_wallPaper;
                arrayList.add(0, yi1Var5);
            }
        } else {
            int i19 = this.R;
            if (i19 != 0) {
                int i20 = this.S;
                if (i20 != 0 && (i11 = this.T) != 0) {
                    yi1 yi1Var6 = new yi1(this.Q, i19, i20, i11, this.U);
                    this.f34614w = yi1Var6;
                    yi1Var6.f43236f = this.V;
                } else {
                    this.f34614w = new yi1(i19, i20, this.Q, this.V);
                }
                arrayList.add(0, this.f34614w);
            } else if (h6Var.f20701i0 != null && !hashMap.containsKey(this.Q)) {
                zi1 zi1Var3 = new zi1(new File(ApplicationLoader.getFilesDirFixed(), h6Var.f20701i0.f20385a), new File(ApplicationLoader.getFilesDirFixed(), h6Var.f20701i0.f20386b), this.Q);
                this.f34615x = zi1Var3;
                if (this.E != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(i10, zi1Var3);
            }
        }
        if (!"d".equals(this.Q) && !arrayList.isEmpty()) {
            arrayList.add(1, this.f34616y);
        } else {
            arrayList.add(0, this.f34616y);
        }
        C0();
    }

    public final void B0(boolean z10) {
        long j3 = 0;
        if (!z10) {
            ArrayList arrayList = this.Z;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.WallPaper) {
                    long j11 = ((TLRPC.WallPaper) obj).f20190id;
                    if (j11 >= 0) {
                        j10 = MediaDataController.calcHash(j10, j11);
                    }
                }
            }
            j3 = j10;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new ci.t3(13, this, z10)), this.classGuid);
    }

    public final void C0() {
        this.f34598a = 0;
        int i10 = this.f34612r;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f34598a = 2;
            this.f34600b = 1;
            this.h = -1;
            this.f34611n = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f34600b = -1;
            this.h = 0;
            this.f34598a = 2;
            this.f34611n = 1;
        } else {
            this.uploadImageRow = -1;
            this.f34600b = -1;
            this.h = -1;
            this.f34611n = -1;
        }
        ArrayList arrayList = this.f34603c0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.P);
            this.d = ceil;
            int i11 = this.f34598a;
            this.f34602c = i11;
            this.f34598a = i11 + ceil;
        } else {
            this.f34602c = -1;
        }
        if (i10 == 0) {
            int i12 = this.f34598a;
            this.f34605e = i12;
            this.f34598a = i12 + 2;
            this.f34607f = i12 + 1;
        } else {
            this.f34605e = -1;
            this.f34607f = -1;
        }
        aj1 aj1Var = this.G;
        if (aj1Var != null) {
            this.f34610h0 = true;
            aj1Var.l();
        }
    }

    public final void D0() {
        int childCount = this.F.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.F.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.eb) {
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    ebVar.c(i11, false, true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.f34613s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.v.setStyle(Paint.Style.STROKE);
        this.v.setColor(855638016);
        this.O = new org.telegram.ui.Components.n91(getParentActivity(), this, new si1(this));
        this.hasOwnBackground = true;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f34612r;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i10 == 2) {
            this.actionBar.setTitle("Channel Wallpaper");
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new vi1(this));
        if (i10 == 0) {
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new wi1(this);
            this.J = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
            j3.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21100s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.i6.f21155v8;
            kVar.B(org.telegram.ui.ActionBar.i6.w0(null, i11, false), true);
            this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21119t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j3.getContext());
            this.K = numberTextView;
            numberTextView.setTextSize(18);
            this.K.setTypeface(AndroidUtilities.bold());
            this.K.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            this.K.setOnTouchListener(new ze1(1));
            j3.addView(this.K, w7.z5.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.v0 h = j3.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.M;
            arrayList.add(h);
            arrayList.add(j3.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f34609g0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.F = zl0Var;
        zl0Var.s1();
        org.telegram.ui.Components.zl0 zl0Var2 = this.F;
        int i12 = org.telegram.ui.ActionBar.i6.f20762a7;
        zl0Var2.setBackgroundColor(getThemedColor(i12));
        this.F.setHorizontalScrollBarEnabled(false);
        this.F.setVerticalScrollBarEnabled(false);
        this.F.setItemAnimator(null);
        this.F.setLayoutAnimation(null);
        org.telegram.ui.Components.zl0 zl0Var3 = this.F;
        gg.b0 b0Var = new gg.b0(1, false, 19);
        this.I = b0Var;
        zl0Var3.setLayoutManager(b0Var);
        frameLayout.addView(this.F, w7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.zl0 zl0Var4 = this.F;
        aj1 aj1Var = new aj1(this, context);
        this.G = aj1Var;
        zl0Var4.setAdapter(aj1Var);
        this.H = new bj1(this, context);
        this.F.setGlowColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20839e8, false));
        this.F.setOnItemClickListener(new t21(this, 13));
        this.F.setOnScrollListener(new w91(this, 5));
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.L = pzVar;
        pzVar.setVisibility(8);
        this.L.setShowAtCenter(true);
        this.L.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.L.setText(LocaleController.getString(R.string.NoResult));
        this.F.setEmptyView(this.L);
        frameLayout.addView(this.L, w7.z5.c(-1.0f, -1));
        C0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        yi1 yi1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f34606e0.clear();
            HashMap hashMap2 = this.f34608f0;
            hashMap2.clear();
            HashMap hashMap3 = this.f34599a0;
            ArrayList arrayList3 = this.f34604d0;
            int i15 = this.f34612r;
            HashMap hashMap4 = this.f34601b0;
            ArrayList arrayList4 = this.f34603c0;
            if (i15 != 1 && i15 != 2) {
                arrayList4.clear();
                arrayList3.clear();
                hashMap4.clear();
                ArrayList arrayList5 = this.Z;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f20044id))) {
                                    this.f34606e0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f20044id), wallPaper);
                                }
                            } else {
                                i12 = i15;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i12 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z10) && (org.telegram.ui.ActionBar.i6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                            yi1Var = new yi1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            yi1Var = new yi1(i17, i18, null, wallPaperSettings4.rotation);
                        }
                        yi1Var.f43232a = wallPaper.slug;
                        yi1Var.h = wallPaperSettings4.intensity / 100.0f;
                        yi1Var.f43236f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        yi1Var.f43241l = wallPaper;
                        if (wallPaper.f20190id < 0) {
                            String a2 = yi1Var.a();
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
                                arrayList3.add(yi1Var);
                                hashMap4.put(a2, yi1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.i6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(yi1Var);
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
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).f20190id);
                }
            }
            this.Q = org.telegram.ui.ActionBar.i6.H0();
            A0();
            B0(false);
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.zl0 zl0Var = this.F;
            if (zl0Var != null) {
                zl0Var.h1();
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
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.F;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20818d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 0, null, null, null, null, i10));
        View view2 = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.i6.f20762a7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21100s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21155v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21119t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20909i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 48, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20984m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20801c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20891h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 1, null, null, null, null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.O.a(i10, i11, intent);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.zl0 zl0Var = this.F;
        if (zl0Var != null) {
            zl0Var.getViewTreeObserver().addOnPreDrawListener(new g7(this, 7));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f34612r;
        if (i10 != 0 && i10 != 2) {
            z0(this.f34603c0, org.telegram.ui.ActionBar.i6.I.q());
            if (i10 == 1 && this.f34606e0.isEmpty()) {
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
        int i10 = this.f34612r;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            }
        } else {
            bj1 bj1Var = this.H;
            if (bj1Var.f35129s != 0) {
                ConnectionsManager.getInstance(bj1Var.E.currentAccount).cancelRequest(bj1Var.f35129s, true);
                bj1Var.f35129s = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        }
        this.O.getClass();
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        MessagesController.getGlobalMainSettings();
        org.telegram.ui.ActionBar.a6 a6Var = org.telegram.ui.ActionBar.i6.I.f20701i0;
        if (a6Var != null) {
            String str2 = a6Var.f20387c;
            this.Q = str2;
            if (str2 == null) {
                this.Q = "";
            }
            this.R = a6Var.d;
            this.S = a6Var.f20388e;
            this.T = a6Var.f20389f;
            this.U = a6Var.f20390g;
            this.V = a6Var.h;
            this.W = a6Var.f20393k;
            this.X = a6Var.f20392j;
            this.Y = a6Var.f20391i;
        } else {
            if (org.telegram.ui.ActionBar.i6.d1()) {
                str = "t";
            } else {
                str = "d";
            }
            this.Q = str;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 45;
            this.W = 1.0f;
            this.X = false;
            this.Y = false;
        }
        A0();
        org.telegram.ui.Components.zl0 zl0Var = this.F;
        if (zl0Var != null) {
            zl0Var.getViewTreeObserver().addOnPreDrawListener(new g7(this, 7));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.O.f28910a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.O.f28910a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
