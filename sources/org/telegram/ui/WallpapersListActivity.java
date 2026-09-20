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
    public static final int[][] f31902i0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f31903j0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f31904k0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f31905l0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] m0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public gj1 E;
    public org.telegram.ui.Components.vl0 F;
    public hj1 G;
    public ij1 H;
    public gg.b0 I;
    public org.telegram.ui.ActionBar.v0 J;
    public NumberTextView K;
    public org.telegram.ui.Components.mz L;
    public final ArrayList M;
    public org.telegram.ui.ActionBar.b2 N;
    public org.telegram.ui.Components.e91 O;
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
    public int f31906a;
    public final HashMap f31907a0;
    public int f31908b;
    public final HashMap f31909b0;
    public int f31910c;
    public final ArrayList f31911c0;
    public int d;
    public final ArrayList f31912d0;
    public int e;
    public ArrayList f31913e0;
    public int f31914f;
    public final HashMap f31915f0;
    public final LongSparseArray f31916g0;
    public int h;
    public boolean f31917h0;
    public int f31918n;
    public final int f31919r;
    public Paint f31920s;
    private int uploadImageRow;
    public Paint v;
    public fj1 f31921w;
    public gj1 f31922x;
    public fj1 f31923y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.M = new ArrayList();
        this.P = 3;
        this.Q = "";
        this.Z = new ArrayList();
        this.f31907a0 = new HashMap();
        this.f31909b0 = new HashMap();
        this.f31911c0 = new ArrayList();
        this.f31912d0 = new ArrayList();
        this.f31913e0 = new ArrayList();
        this.f31915f0 = new HashMap();
        this.f31916g0 = new LongSparseArray();
        this.f31919r = i10;
    }

    public static void U(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.f31916g0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.N = b2Var;
        b2Var.f18690g0 = false;
        b2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new m(wallpapersListActivity, 24));
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.F.getAdapter() != wallpapersListActivity.H) {
            if (i10 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.O.b();
            } else if (i10 == wallpapersListActivity.f31908b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f31913e0 = wallpapersListActivity.f31913e0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i10 == wallpapersListActivity.e) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new yi1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                wallpapersListActivity.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19333q7, false));
                }
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.ij ijVar, Object obj, int i10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        fj1 fj1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f31916g0;
        boolean z10 = false;
        if (wallpapersListActivity.actionBar.s()) {
            if (fj1Var instanceof fj1) {
                obj2 = ((fj1) fj1Var).f33669l;
            } else {
                obj2 = fj1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f18480id) >= 0) {
                longSparseArray.remove(wallPaper.f18480id);
            } else {
                longSparseArray.put(wallPaper.f18480id, fj1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.actionBar.r();
            } else {
                wallpapersListActivity.K.a(longSparseArray.size(), true);
            }
            wallpapersListActivity.f31917h0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f18480id) >= 0) {
                z10 = true;
            }
            ijVar.c(i10, z10, true);
            return;
        }
        boolean z11 = fj1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) fj1Var).slug;
        } else if (fj1Var instanceof fj1) {
            str = ((fj1) fj1Var).f33661a;
        } else if (fj1Var instanceof gj1) {
            str = ((gj1) fj1Var).f33924a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) fj1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                fj1 fj1Var2 = new fj1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                fj1Var2.f33665g = tL_wallPaper;
                fj1Var2.f33669l = tL_wallPaper;
                fj1Var = fj1Var2;
            }
        }
        org.telegram.ui.Components.ap apVar = new org.telegram.ui.Components.ap(fj1Var, null, true, 4);
        if (wallpapersListActivity.f31919r == 1) {
            apVar.I1 = new yi1(wallpapersListActivity);
        }
        if (wallpapersListActivity.Q.equals(str)) {
            boolean z12 = wallpapersListActivity.Y;
            boolean z13 = wallpapersListActivity.X;
            float f7 = wallpapersListActivity.W;
            apVar.F1 = z12;
            apVar.E1 = z13;
            apVar.f39509n1 = f7;
        }
        apVar.U0 = wallpapersListActivity.f31913e0;
        if (apVar.f39473b == 1 || (apVar.B1 instanceof fj1)) {
            ((fj1) apVar.B1).getClass();
        }
        apVar.c1(0L);
        ?? obj3 = new Object();
        obj3.f19577a = true;
        apVar.f39470a.f39458a = wallpapersListActivity.resourceProvider;
        obj3.f19579c = new u21(5);
        obj3.e = true;
        wallpapersListActivity.showAsSheet(apVar, obj3);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.ij ijVar, Object obj, int i10) {
        Object obj2;
        ArrayList arrayList = wallpapersListActivity.M;
        int i11 = wallpapersListActivity.f31919r;
        if (i11 != 2 && i11 != 3) {
            if (obj instanceof fj1) {
                obj2 = ((fj1) obj).f33669l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f31916g0.put(((TLRPC.WallPaper) obj2).f18480id, obj);
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
                wallpapersListActivity.f31917h0 = false;
                wallpapersListActivity.actionBar.O(null, null);
                ijVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public static void z0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f31903j0;
        } else {
            iArr = f31902i0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new fj1(iArr2[0], 0, "c", 45));
            } else {
                arrayList.add(new fj1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
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
        int i15 = this.f31919r;
        if (i15 != 0 && i15 != 2) {
            return;
        }
        MessagesController.getGlobalMainSettings();
        fj1 fj1Var = this.f31921w;
        ArrayList arrayList = this.f31911c0;
        if (fj1Var != null) {
            arrayList.remove(fj1Var);
            this.f31921w = null;
        }
        gj1 gj1Var = this.f31922x;
        if (gj1Var != null) {
            arrayList.remove(gj1Var);
            this.f31922x = null;
        }
        fj1 fj1Var2 = this.f31923y;
        if (fj1Var2 == null) {
            fj1 fj1Var3 = new fj1("d", -2368069, -9722489, -2762611, -7817084);
            this.f31923y = fj1Var3;
            fj1Var3.h = 0.34f;
        } else {
            arrayList.remove(fj1Var2);
        }
        gj1 gj1Var2 = this.E;
        if (gj1Var2 != null) {
            arrayList.remove(gj1Var2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            hashMap = this.f31907a0;
            if (i16 < size) {
                Object obj3 = arrayList.get(i16);
                if (obj3 instanceof fj1) {
                    r52 = (fj1) obj3;
                    String str3 = r52.f33661a;
                    if (str3 != null) {
                        r52.f33665g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f33661a)) {
                        String str4 = r52.f33661a;
                        if (str4 != null && !TextUtils.equals(this.Q, str4)) {
                            i16++;
                        }
                    }
                    if (this.R == r52.f33662b) {
                        int i17 = this.S;
                        if (i17 != r52.f33663c) {
                            continue;
                        } else if (this.T != r52.d) {
                            continue;
                        } else if (this.U != r52.e) {
                            continue;
                        } else if (i17 == 0 || this.V == r52.f33664f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i16++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.Q, r52.slug) && this.R == org.telegram.ui.ActionBar.j6.X0(r52.settings.background_color) && this.S == org.telegram.ui.ActionBar.j6.X0(r52.settings.second_background_color) && this.T == org.telegram.ui.ActionBar.j6.X0(r52.settings.third_background_color) && this.U == org.telegram.ui.ActionBar.j6.X0(r52.settings.fourth_background_color) && ((this.S == 0 || this.V == AndroidUtilities.getWallpaperRotation(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.j6.R0(r52.settings.intensity / 100.0f) - this.W) <= 0.001f)) {
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
            org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.j6.I.f18985i0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.R == org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color) && this.S == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper3.settings.second_background_color) && this.T == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper3.settings.third_background_color) && this.U == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper3.settings.fourth_background_color) && (this.S == 0 || this.T != 0 || this.V == AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.j6.R0(tL_wallPaper3.settings.intensity / 100.0f) - this.W) <= 0.001f)) {
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
            j10 = tL_wallPaper3.f18480id;
        } else {
            String str5 = this.Q;
            if ((r52 instanceof fj1) && (wallPaper = r52.f33669l) != null) {
                j3 = wallPaper.f18480id;
            } else {
                j3 = 0;
            }
            str = str5;
            j10 = j3;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q6 = org.telegram.ui.ActionBar.j6.A0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.Z;
                    if (obj4 instanceof fj1) {
                        obj4 = ((fj1) obj4).f33669l;
                    }
                    if (obj5 instanceof fj1) {
                        obj5 = ((fj1) obj5).f33669l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j11 = j10;
                        if (j11 != 0) {
                            if (wallPaper2.f18480id != j11) {
                                if (wallPaper3.f18480id == j11) {
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
        if (org.telegram.ui.ActionBar.j6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.j6.f19160h0)) {
            if (this.E == null) {
                ?? obj4 = new Object();
                obj4.f33924a = "t";
                obj4.f33925b = -2;
                obj4.f33926c = -2;
                this.E = obj4;
            }
            arrayList.add(0, this.E);
        } else {
            this.E = null;
        }
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
        if (!TextUtils.isEmpty(this.Q) && ("d".equals(this.Q) || obj != null)) {
            if (obj == null && this.R != 0 && "c".equals(this.Q)) {
                int i18 = this.S;
                if (i18 != 0 && (i13 = this.T) != 0 && (i14 = this.U) != 0) {
                    fj1 fj1Var4 = new fj1(this.Q, this.R, i18, i13, i14);
                    this.f31921w = fj1Var4;
                    fj1Var4.f33664f = this.V;
                } else {
                    this.f31921w = new fj1(this.R, i18, this.Q, this.V);
                }
                arrayList.add(0, this.f31921w);
            }
        } else if (!"c".equals(this.Q) && (i12 = this.R) != 0) {
            if (i6Var.f18985i0 != null) {
                fj1 fj1Var5 = new fj1(this.Q, i12, this.S, this.T, this.U, this.V, this.W, this.X, new File(ApplicationLoader.getFilesDirFixed(), i6Var.f18985i0.f18725a));
                this.f31921w = fj1Var5;
                fj1Var5.f33665g = tL_wallPaper;
                arrayList.add(0, fj1Var5);
            }
        } else {
            int i19 = this.R;
            if (i19 != 0) {
                int i20 = this.S;
                if (i20 != 0 && (i11 = this.T) != 0) {
                    fj1 fj1Var6 = new fj1(this.Q, i19, i20, i11, this.U);
                    this.f31921w = fj1Var6;
                    fj1Var6.f33664f = this.V;
                } else {
                    this.f31921w = new fj1(i19, i20, this.Q, this.V);
                }
                arrayList.add(0, this.f31921w);
            } else if (i6Var.f18985i0 != null && !hashMap.containsKey(this.Q)) {
                gj1 gj1Var3 = new gj1(new File(ApplicationLoader.getFilesDirFixed(), i6Var.f18985i0.f18725a), new File(ApplicationLoader.getFilesDirFixed(), i6Var.f18985i0.f18726b), this.Q);
                this.f31922x = gj1Var3;
                if (this.E != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(i10, gj1Var3);
            }
        }
        if (!"d".equals(this.Q) && !arrayList.isEmpty()) {
            arrayList.add(1, this.f31923y);
        } else {
            arrayList.add(0, this.f31923y);
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
                    long j11 = ((TLRPC.WallPaper) obj).f18480id;
                    if (j11 >= 0) {
                        j10 = MediaDataController.calcHash(j10, j11);
                    }
                }
            }
            j3 = j10;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new ci.u3(13, this, z10)), this.classGuid);
    }

    public final void C0() {
        this.f31906a = 0;
        int i10 = this.f31919r;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f31906a = 2;
            this.f31908b = 1;
            this.h = -1;
            this.f31918n = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f31908b = -1;
            this.h = 0;
            this.f31906a = 2;
            this.f31918n = 1;
        } else {
            this.uploadImageRow = -1;
            this.f31908b = -1;
            this.h = -1;
            this.f31918n = -1;
        }
        ArrayList arrayList = this.f31911c0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.P);
            this.d = ceil;
            int i11 = this.f31906a;
            this.f31910c = i11;
            this.f31906a = i11 + ceil;
        } else {
            this.f31910c = -1;
        }
        if (i10 == 0) {
            int i12 = this.f31906a;
            this.e = i12;
            this.f31906a = i12 + 2;
            this.f31914f = i12 + 1;
        } else {
            this.e = -1;
            this.f31914f = -1;
        }
        hj1 hj1Var = this.G;
        if (hj1Var != null) {
            this.f31917h0 = true;
            hj1Var.l();
        }
    }

    public final void D0() {
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
    public final View createView(Context context) {
        this.f31920s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.v.setStyle(Paint.Style.STROKE);
        this.v.setColor(855638016);
        this.O = new org.telegram.ui.Components.e91(getParentActivity(), this, new zi1(this));
        this.hasOwnBackground = true;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f31919r;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i10 == 2) {
            this.actionBar.setTitle("Channel Wallpaper");
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cj1(this));
        if (i10 == 0) {
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new dj1(this);
            this.J = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
            j3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19372s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.j6.f19427v8;
            kVar.B(org.telegram.ui.ActionBar.j6.w0(null, i11, false), true);
            this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19391t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j3.getContext());
            this.K = numberTextView;
            numberTextView.setTextSize(18);
            this.K.setTypeface(AndroidUtilities.bold());
            this.K.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.K.setOnTouchListener(new gf1(1));
            j3.addView(this.K, w7.y5.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.v0 h = j3.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.M;
            arrayList.add(h);
            arrayList.add(j3.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f31916g0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.F = vl0Var;
        vl0Var.q1();
        org.telegram.ui.Components.vl0 vl0Var2 = this.F;
        int i12 = org.telegram.ui.ActionBar.j6.f19038a7;
        vl0Var2.setBackgroundColor(getThemedColor(i12));
        this.F.setHorizontalScrollBarEnabled(false);
        this.F.setVerticalScrollBarEnabled(false);
        this.F.setItemAnimator(null);
        this.F.setLayoutAnimation(null);
        org.telegram.ui.Components.vl0 vl0Var3 = this.F;
        gg.b0 b0Var = new gg.b0(1, false, 19);
        this.I = b0Var;
        vl0Var3.setLayoutManager(b0Var);
        frameLayout.addView(this.F, w7.y5.e(-1, -1, 51));
        org.telegram.ui.Components.vl0 vl0Var4 = this.F;
        hj1 hj1Var = new hj1(this, context);
        this.G = hj1Var;
        vl0Var4.setAdapter(hj1Var);
        this.H = new ij1(this, context);
        this.F.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19114e8, false));
        this.F.setOnItemClickListener(new a31(this, 13));
        this.F.setOnScrollListener(new pe1(this, 3));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.L = mzVar;
        mzVar.setVisibility(8);
        this.L.setShowAtCenter(true);
        this.L.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.L.setText(LocaleController.getString(R.string.NoResult));
        this.F.setEmptyView(this.L);
        frameLayout.addView(this.L, w7.y5.c(-1.0f, -1));
        C0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        fj1 fj1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f31913e0.clear();
            HashMap hashMap2 = this.f31915f0;
            hashMap2.clear();
            HashMap hashMap3 = this.f31907a0;
            ArrayList arrayList3 = this.f31912d0;
            int i15 = this.f31919r;
            HashMap hashMap4 = this.f31909b0;
            ArrayList arrayList4 = this.f31911c0;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f18334id))) {
                                    this.f31913e0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f18334id), wallPaper);
                                }
                            } else {
                                i12 = i15;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i12 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z10) && (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                            fj1Var = new fj1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            fj1Var = new fj1(i17, i18, null, wallPaperSettings4.rotation);
                        }
                        fj1Var.f33661a = wallPaper.slug;
                        fj1Var.h = wallPaperSettings4.intensity / 100.0f;
                        fj1Var.f33664f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        fj1Var.f33669l = wallPaper;
                        if (wallPaper.f18480id < 0) {
                            String a2 = fj1Var.a();
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
                                arrayList3.add(fj1Var);
                                hashMap4.put(a2, fj1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(fj1Var);
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
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).f18480id);
                }
            }
            this.Q = org.telegram.ui.ActionBar.j6.H0();
            A0();
            B0(false);
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.vl0 vl0Var = this.F;
            if (vl0Var != null) {
                vl0Var.g1();
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
    public final org.telegram.ui.Components.vl0 getListViewForSimpleGlass() {
        return this.F;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19094d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, null, null, null, null, i10));
        View view2 = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.j6.f19038a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19372s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19427v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19391t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19184i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 48, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19259m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{org.telegram.ui.Cells.w3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 16, new Class[]{org.telegram.ui.Cells.w3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19077c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19166h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 1, null, null, null, null, i10));
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
        org.telegram.ui.Components.vl0 vl0Var = this.F;
        if (vl0Var != null) {
            vl0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 7));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f31919r;
        if (i10 != 0 && i10 != 2) {
            z0(this.f31911c0, org.telegram.ui.ActionBar.j6.I.q());
            if (i10 == 1 && this.f31913e0.isEmpty()) {
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
        int i10 = this.f31919r;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            }
        } else {
            ij1 ij1Var = this.H;
            if (ij1Var.f34600s != 0) {
                ConnectionsManager.getInstance(ij1Var.E.currentAccount).cancelRequest(ij1Var.f34600s, true);
                ij1Var.f34600s = 0;
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
        org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.j6.I.f18985i0;
        if (b6Var != null) {
            String str2 = b6Var.f18727c;
            this.Q = str2;
            if (str2 == null) {
                this.Q = "";
            }
            this.R = b6Var.d;
            this.S = b6Var.e;
            this.T = b6Var.f18728f;
            this.U = b6Var.f18729g;
            this.V = b6Var.h;
            this.W = b6Var.f18732k;
            this.X = b6Var.f18731j;
            this.Y = b6Var.f18730i;
        } else {
            if (org.telegram.ui.ActionBar.j6.d1()) {
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
        org.telegram.ui.Components.vl0 vl0Var = this.F;
        if (vl0Var != null) {
            vl0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 7));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.O.f23793a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.O.f23793a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
