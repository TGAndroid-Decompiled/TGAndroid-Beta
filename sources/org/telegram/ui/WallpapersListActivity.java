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
public class WallpapersListActivity extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[][] f33971k0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f33972l0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] m0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f33973n0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f33974o0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public qj1 E;
    public pj1 F;
    public qj1 G;
    public org.telegram.ui.Components.mm0 H;
    public rj1 I;
    public sj1 J;
    public hg.a0 K;
    public org.telegram.ui.ActionBar.u0 L;
    public NumberTextView M;
    public org.telegram.ui.Components.yz N;
    public final ArrayList O;
    public org.telegram.ui.ActionBar.a2 P;
    public org.telegram.ui.Components.r91 Q;
    public int R;
    public String S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public float Y;
    public boolean Z;
    public int f33975a;
    public boolean f33976a0;
    public int f33977b;
    public final ArrayList f33978b0;
    public int f33979c;
    public final HashMap f33980c0;
    public int d;
    public final HashMap f33981d0;
    public int e;
    public final ArrayList f33982e0;
    public int f33983f;
    public final ArrayList f33984f0;
    public ArrayList f33985g0;
    public int h;
    public final HashMap f33986h0;
    public final LongSparseArray f33987i0;
    public boolean f33988j0;
    public int f33989n;
    public int f33990r;
    public int f33991s;
    private int uploadImageRow;
    public final int v;
    public Paint f33992w;
    public Paint f33993x;
    public pj1 f33994y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.O = new ArrayList();
        this.R = 3;
        this.S = "";
        this.f33978b0 = new ArrayList();
        this.f33980c0 = new HashMap();
        this.f33981d0 = new HashMap();
        this.f33982e0 = new ArrayList();
        this.f33984f0 = new ArrayList();
        this.f33985g0 = new ArrayList();
        this.f33986h0 = new HashMap();
        this.f33987i0 = new LongSparseArray();
        this.v = i10;
    }

    public static void U(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.t()) {
            wallpapersListActivity.f33987i0.clear();
            wallpapersListActivity.actionBar.s();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.P = a2Var;
        a2Var.f19569g0 = false;
        a2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new m(wallpapersListActivity, 24));
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.H.getAdapter() != wallpapersListActivity.J) {
            if (i10 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.Q.b();
            } else if (i10 == wallpapersListActivity.f33977b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f33985g0 = wallpapersListActivity.f33985g0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i10 == wallpapersListActivity.h) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new ij1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                wallpapersListActivity.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                }
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.jj jjVar, Object obj, int i10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        pj1 pj1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f33987i0;
        boolean z10 = false;
        if (wallpapersListActivity.actionBar.t()) {
            if (pj1Var instanceof pj1) {
                obj2 = ((pj1) pj1Var).f39254l;
            } else {
                obj2 = pj1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f19368id) >= 0) {
                longSparseArray.remove(wallPaper.f19368id);
            } else {
                longSparseArray.put(wallPaper.f19368id, pj1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.actionBar.s();
            } else {
                wallpapersListActivity.M.a(longSparseArray.size(), true);
            }
            wallpapersListActivity.f33988j0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f19368id) >= 0) {
                z10 = true;
            }
            jjVar.c(i10, z10, true);
            return;
        }
        boolean z11 = pj1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) pj1Var).slug;
        } else if (pj1Var instanceof pj1) {
            str = ((pj1) pj1Var).f39246a;
        } else if (pj1Var instanceof qj1) {
            str = ((qj1) pj1Var).f39484a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) pj1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                pj1 pj1Var2 = new pj1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                pj1Var2.f39250g = tL_wallPaper;
                pj1Var2.f39254l = tL_wallPaper;
                pj1Var = pj1Var2;
            }
        }
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(pj1Var, null, true, 4);
        if (wallpapersListActivity.v == 1) {
            npVar.I1 = new ij1(wallpapersListActivity);
        }
        if (wallpapersListActivity.S.equals(str)) {
            boolean z12 = wallpapersListActivity.f33976a0;
            boolean z13 = wallpapersListActivity.Z;
            float f7 = wallpapersListActivity.Y;
            npVar.F1 = z12;
            npVar.E1 = z13;
            npVar.f34892n1 = f7;
        }
        npVar.U0 = wallpapersListActivity.f33985g0;
        if (npVar.f34856b == 1 || (npVar.B1 instanceof pj1)) {
            ((pj1) npVar.B1).getClass();
        }
        npVar.c1(0L);
        ?? obj3 = new Object();
        obj3.f20469a = true;
        npVar.f34853a.f34838a = wallpapersListActivity.resourceProvider;
        obj3.f20471c = new b31(8);
        obj3.e = true;
        wallpapersListActivity.showAsSheet(npVar, obj3);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.jj jjVar, Object obj, int i10) {
        Object obj2;
        ArrayList arrayList = wallpapersListActivity.O;
        int i11 = wallpapersListActivity.v;
        if (i11 != 2 && i11 != 3) {
            if (obj instanceof pj1) {
                obj2 = ((pj1) obj).f39254l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.actionBar.t() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f33987i0.put(((TLRPC.WallPaper) obj2).f19368id, obj);
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
                wallpapersListActivity.f33988j0 = false;
                wallpapersListActivity.actionBar.O(null, null);
                jjVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public static void z0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f33972l0;
        } else {
            iArr = f33971k0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new pj1(iArr2[0], 0, "c", 45));
            } else {
                arrayList.add(new pj1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
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
        pj1 pj1Var = this.f33994y;
        ArrayList arrayList = this.f33982e0;
        if (pj1Var != null) {
            arrayList.remove(pj1Var);
            this.f33994y = null;
        }
        qj1 qj1Var = this.E;
        if (qj1Var != null) {
            arrayList.remove(qj1Var);
            this.E = null;
        }
        pj1 pj1Var2 = this.F;
        if (pj1Var2 == null) {
            pj1 pj1Var3 = new pj1("d", -2368069, -9722489, -2762611, -7817084);
            this.F = pj1Var3;
            pj1Var3.h = 0.34f;
        } else {
            arrayList.remove(pj1Var2);
        }
        qj1 qj1Var2 = this.G;
        if (qj1Var2 != null) {
            arrayList.remove(qj1Var2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            hashMap = this.f33980c0;
            if (i16 < size) {
                Object obj3 = arrayList.get(i16);
                if (obj3 instanceof pj1) {
                    r52 = (pj1) obj3;
                    String str3 = r52.f39246a;
                    if (str3 != null) {
                        r52.f39250g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f39246a)) {
                        String str4 = r52.f39246a;
                        if (str4 != null && !TextUtils.equals(this.S, str4)) {
                            i16++;
                        }
                    }
                    if (this.T == r52.f39247b) {
                        int i17 = this.U;
                        if (i17 != r52.f39248c) {
                            continue;
                        } else if (this.V != r52.d) {
                            continue;
                        } else if (this.W != r52.e) {
                            continue;
                        } else if (i17 == 0 || this.X == r52.f39249f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i16++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.S, r52.slug) && this.T == org.telegram.ui.ActionBar.g6.Y0(r52.settings.background_color) && this.U == org.telegram.ui.ActionBar.g6.Y0(r52.settings.second_background_color) && this.V == org.telegram.ui.ActionBar.g6.Y0(r52.settings.third_background_color) && this.W == org.telegram.ui.ActionBar.g6.Y0(r52.settings.fourth_background_color) && ((this.U == 0 || this.X == AndroidUtilities.getWallpaperRotation(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.g6.S0(r52.settings.intensity / 100.0f) - this.Y) <= 0.001f)) {
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
            org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.f19803i0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.T == org.telegram.ui.ActionBar.g6.Y0(wallPaperSettings.background_color) && this.U == org.telegram.ui.ActionBar.g6.Y0(tL_wallPaper3.settings.second_background_color) && this.V == org.telegram.ui.ActionBar.g6.Y0(tL_wallPaper3.settings.third_background_color) && this.W == org.telegram.ui.ActionBar.g6.Y0(tL_wallPaper3.settings.fourth_background_color) && (this.U == 0 || this.V != 0 || this.X == AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.g6.S0(tL_wallPaper3.settings.intensity / 100.0f) - this.Y) <= 0.001f)) {
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
            j11 = tL_wallPaper3.f19368id;
        } else {
            String str5 = this.S;
            if ((r52 instanceof pj1) && (wallPaper = r52.f39254l) != null) {
                j10 = wallPaper.f19368id;
            } else {
                j10 = 0;
            }
            str = str5;
            j11 = j10;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q6 = org.telegram.ui.ActionBar.g6.B0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.f33978b0;
                    if (obj4 instanceof pj1) {
                        obj4 = ((pj1) obj4).f39254l;
                    }
                    if (obj5 instanceof pj1) {
                        obj5 = ((pj1) obj5).f39254l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j12 = j11;
                        if (j12 != 0) {
                            if (wallPaper2.f19368id != j12) {
                                if (wallPaper3.f19368id == j12) {
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
        if (org.telegram.ui.ActionBar.g6.e1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.g6.f19967h0)) {
            if (this.G == null) {
                ?? obj4 = new Object();
                obj4.f39484a = "t";
                obj4.f39485b = -2;
                obj4.f39486c = -2;
                this.G = obj4;
            }
            arrayList.add(0, this.G);
        } else {
            this.G = null;
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        if (!TextUtils.isEmpty(this.S) && ("d".equals(this.S) || obj != null)) {
            if (obj == null && this.T != 0 && "c".equals(this.S)) {
                int i18 = this.U;
                if (i18 != 0 && (i13 = this.V) != 0 && (i14 = this.W) != 0) {
                    pj1 pj1Var4 = new pj1(this.S, this.T, i18, i13, i14);
                    this.f33994y = pj1Var4;
                    pj1Var4.f39249f = this.X;
                } else {
                    this.f33994y = new pj1(this.T, i18, this.S, this.X);
                }
                arrayList.add(0, this.f33994y);
            }
        } else if (!"c".equals(this.S) && (i12 = this.T) != 0) {
            if (f6Var.f19803i0 != null) {
                pj1 pj1Var5 = new pj1(this.S, i12, this.U, this.V, this.W, this.X, this.Y, this.Z, new File(ApplicationLoader.getFilesDirFixed(), f6Var.f19803i0.f20847a));
                this.f33994y = pj1Var5;
                pj1Var5.f39250g = tL_wallPaper;
                arrayList.add(0, pj1Var5);
            }
        } else {
            int i19 = this.T;
            if (i19 != 0) {
                int i20 = this.U;
                if (i20 != 0 && (i11 = this.V) != 0) {
                    pj1 pj1Var6 = new pj1(this.S, i19, i20, i11, this.W);
                    this.f33994y = pj1Var6;
                    pj1Var6.f39249f = this.X;
                } else {
                    this.f33994y = new pj1(i19, i20, this.S, this.X);
                }
                arrayList.add(0, this.f33994y);
            } else if (f6Var.f19803i0 != null && !hashMap.containsKey(this.S)) {
                qj1 qj1Var3 = new qj1(new File(ApplicationLoader.getFilesDirFixed(), f6Var.f19803i0.f20847a), new File(ApplicationLoader.getFilesDirFixed(), f6Var.f19803i0.f20848b), this.S);
                this.E = qj1Var3;
                if (this.G != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(i10, qj1Var3);
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
            ArrayList arrayList = this.f33978b0;
            int size = arrayList.size();
            long j11 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.WallPaper) {
                    long j12 = ((TLRPC.WallPaper) obj).f19368id;
                    if (j12 >= 0) {
                        j11 = MediaDataController.calcHash(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new di.s3(13, this, z10)), this.classGuid);
    }

    public final void C0() {
        this.f33975a = 0;
        int i10 = this.v;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f33977b = 1;
            this.f33975a = 3;
            this.f33979c = 2;
            this.f33990r = -1;
            this.f33991s = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f33977b = -1;
            this.f33979c = -1;
            this.f33990r = 0;
            this.f33975a = 2;
            this.f33991s = 1;
        } else {
            this.uploadImageRow = -1;
            this.f33977b = -1;
            this.f33979c = -1;
            this.f33990r = -1;
            this.f33991s = -1;
        }
        ArrayList arrayList = this.f33982e0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.R);
            this.e = ceil;
            int i11 = this.f33975a;
            this.d = i11;
            this.f33975a = i11 + ceil;
        } else {
            this.d = -1;
        }
        if (i10 == 0) {
            int i12 = this.f33975a;
            this.f33983f = i12;
            this.h = i12 + 1;
            this.f33975a = i12 + 3;
            this.f33989n = i12 + 2;
        } else {
            this.f33983f = -1;
            this.h = -1;
            this.f33989n = -1;
        }
        rj1 rj1Var = this.I;
        if (rj1Var != null) {
            this.f33988j0 = true;
            rj1Var.l();
        }
    }

    public final void D0() {
        int childCount = this.H.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.H.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.cb) {
                org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    cbVar.c(i11, false, true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.f33992w = new Paint(1);
        Paint paint = new Paint(1);
        this.f33993x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f33993x.setStyle(Paint.Style.STROKE);
        this.f33993x.setColor(855638016);
        this.Q = new org.telegram.ui.Components.r91(getParentActivity(), this, new jj1(this));
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
        this.actionBar.setActionBarMenuOnItemClick(new mj1(this));
        if (i10 == 0) {
            org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new nj1(this);
            this.L = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
            j10.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20180s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.g6.f20235v8;
            kVar.D(org.telegram.ui.ActionBar.g6.x0(null, i11, false), true);
            this.actionBar.B(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20199t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j10.getContext());
            this.M = numberTextView;
            numberTextView.setTextSize(18);
            this.M.setTypeface(AndroidUtilities.bold());
            this.M.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            this.M.setOnTouchListener(new mf1(1));
            j10.addView(this.M, w7.a6.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.u0 h = j10.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.O;
            arrayList.add(h);
            arrayList.add(j10.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f33987i0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.H = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.H);
        org.telegram.ui.Components.mm0 mm0Var2 = this.H;
        int i12 = org.telegram.ui.ActionBar.g6.f19843a7;
        mm0Var2.setBackgroundColor(getThemedColor(i12));
        this.H.setClipToPadding(false);
        this.H.setHorizontalScrollBarEnabled(false);
        this.H.setVerticalScrollBarEnabled(false);
        this.H.setItemAnimator(null);
        this.H.setLayoutAnimation(null);
        org.telegram.ui.Components.mm0 mm0Var3 = this.H;
        hg.a0 a0Var = new hg.a0(1, false, 19);
        this.K = a0Var;
        mm0Var3.setLayoutManager(a0Var);
        frameLayout.addView(this.H, w7.a6.e(-1, -1, 51));
        org.telegram.ui.Components.mm0 mm0Var4 = this.H;
        rj1 rj1Var = new rj1(this, context);
        this.I = rj1Var;
        mm0Var4.setAdapter(rj1Var);
        this.J = new sj1(this, context);
        this.H.setGlowColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19919e8, false));
        this.H.setOnItemClickListener(new i21(this, 14));
        this.H.setOnScrollListener(new ve1(this, 3));
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.N = yzVar;
        yzVar.setVisibility(8);
        this.N.setShowAtCenter(true);
        this.N.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.N.setText(LocaleController.getString(R.string.NoResult));
        this.H.setEmptyView(this.N);
        frameLayout.addView(this.N, w7.a6.d(-1.0f, -1));
        C0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        pj1 pj1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f33985g0.clear();
            HashMap hashMap2 = this.f33986h0;
            hashMap2.clear();
            HashMap hashMap3 = this.f33980c0;
            ArrayList arrayList3 = this.f33984f0;
            int i15 = this.v;
            HashMap hashMap4 = this.f33981d0;
            ArrayList arrayList4 = this.f33982e0;
            if (i15 != 1 && i15 != 2) {
                arrayList4.clear();
                arrayList3.clear();
                hashMap4.clear();
                ArrayList arrayList5 = this.f33978b0;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f19222id))) {
                                    this.f33985g0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f19222id), wallPaper);
                                }
                            } else {
                                i12 = i15;
                            }
                            hashMap3.put(wallPaper.slug, wallPaper);
                            if (i12 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z10) && (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                            pj1Var = new pj1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            pj1Var = new pj1(i17, i18, null, wallPaperSettings4.rotation);
                        }
                        pj1Var.f39246a = wallPaper.slug;
                        pj1Var.h = wallPaperSettings4.intensity / 100.0f;
                        pj1Var.f39249f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        pj1Var.f39254l = wallPaper;
                        if (wallPaper.f19368id < 0) {
                            String a2 = pj1Var.a();
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
                                arrayList3.add(pj1Var);
                                hashMap4.put(a2, pj1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(pj1Var);
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
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).f19368id);
                }
            }
            this.S = org.telegram.ui.ActionBar.g6.I0();
            A0();
            B0(false);
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.mm0 mm0Var = this.H;
            if (mm0Var != null) {
                mm0Var.f1();
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
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 0, null, null, null, null, i10));
        View view2 = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.f19843a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 48, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20064m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f19883c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f19973h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 1, null, null, null, null, i10));
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
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new ii(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.v;
        if (i10 != 0 && i10 != 2) {
            z0(this.f33982e0, org.telegram.ui.ActionBar.g6.I.q());
            if (i10 == 1 && this.f33985g0.isEmpty()) {
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
            sj1 sj1Var = this.J;
            if (sj1Var.f40164s != 0) {
                ConnectionsManager.getInstance(sj1Var.E.currentAccount).cancelRequest(sj1Var.f40164s, true);
                sj1Var.f40164s = 0;
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
        org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.f19803i0;
        if (z5Var != null) {
            String str2 = z5Var.f20849c;
            this.S = str2;
            if (str2 == null) {
                this.S = "";
            }
            this.T = z5Var.d;
            this.U = z5Var.e;
            this.V = z5Var.f20850f;
            this.W = z5Var.f20851g;
            this.X = z5Var.h;
            this.Y = z5Var.f20854k;
            this.Z = z5Var.f20853j;
            this.f33976a0 = z5Var.f20852i;
        } else {
            if (org.telegram.ui.ActionBar.g6.e1()) {
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
            this.f33976a0 = false;
        }
        A0();
        org.telegram.ui.Components.mm0 mm0Var = this.H;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new ii(this, 6));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.Q.f28778a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.Q.f28778a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
