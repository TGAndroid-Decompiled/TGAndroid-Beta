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
    public static final int[][] f32397h0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f32398i0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f32399j0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f32400k0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f32401l0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public ni1 B;
    public mi1 C;
    public ni1 D;
    public org.telegram.ui.Components.sl0 E;
    public oi1 F;
    public pi1 G;
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
    public int f32402a;
    public final HashMap f32403a0;
    public int f32404b;
    public final ArrayList f32405b0;
    public int f32406c;
    public final ArrayList f32407c0;
    public int d;
    public ArrayList f32408d0;
    public int e;
    public final HashMap f32409e0;
    public int f32410f;
    public final LongSparseArray f32411f0;
    public boolean f32412g0;
    public int h;
    public int f32413n;
    public int f32414r;
    public int f32415s;
    private int uploadImageRow;
    public final int v;
    public Paint f32416w;
    public Paint f32417x;
    public mi1 f32418y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.L = new ArrayList();
        this.O = 3;
        this.P = "";
        this.Y = new ArrayList();
        this.Z = new HashMap();
        this.f32403a0 = new HashMap();
        this.f32405b0 = new ArrayList();
        this.f32407c0 = new ArrayList();
        this.f32408d0 = new ArrayList();
        this.f32409e0 = new HashMap();
        this.f32411f0 = new LongSparseArray();
        this.v = i10;
    }

    public static void U(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.f32411f0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.M = d2Var;
        d2Var.f19590d0 = false;
        d2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new o(wallpapersListActivity, 24));
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.E.getAdapter() != wallpapersListActivity.G) {
            if (i10 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.N.b();
            } else if (i10 == wallpapersListActivity.f32404b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f32408d0 = wallpapersListActivity.f32408d0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i10 == wallpapersListActivity.h) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fi1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                wallpapersListActivity.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                }
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.yi yiVar, Object obj, int i10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        mi1 mi1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f32411f0;
        boolean z4 = false;
        if (wallpapersListActivity.actionBar.s()) {
            if (mi1Var instanceof mi1) {
                obj2 = ((mi1) mi1Var).f36333l;
            } else {
                obj2 = mi1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f19336id) >= 0) {
                longSparseArray.remove(wallPaper.f19336id);
            } else {
                longSparseArray.put(wallPaper.f19336id, mi1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.actionBar.r();
            } else {
                wallpapersListActivity.J.a(longSparseArray.size(), true);
            }
            wallpapersListActivity.f32412g0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f19336id) >= 0) {
                z4 = true;
            }
            yiVar.c(i10, z4, true);
            return;
        }
        boolean z10 = mi1Var instanceof TLRPC.TL_wallPaper;
        if (z10) {
            str = ((TLRPC.TL_wallPaper) mi1Var).slug;
        } else if (mi1Var instanceof mi1) {
            str = ((mi1) mi1Var).f36325a;
        } else if (mi1Var instanceof ni1) {
            str = ((ni1) mi1Var).f36672a;
        } else {
            str = null;
        }
        if (z10) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) mi1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                mi1 mi1Var2 = new mi1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                mi1Var2.f36329g = tL_wallPaper;
                mi1Var2.f36333l = tL_wallPaper;
                mi1Var = mi1Var2;
            }
        }
        org.telegram.ui.Components.xo xoVar = new org.telegram.ui.Components.xo(mi1Var, null, true, 4);
        if (wallpapersListActivity.v == 1) {
            xoVar.F1 = new fi1(wallpapersListActivity);
        }
        if (wallpapersListActivity.P.equals(str)) {
            boolean z11 = wallpapersListActivity.X;
            boolean z12 = wallpapersListActivity.W;
            float f10 = wallpapersListActivity.V;
            xoVar.C1 = z11;
            xoVar.B1 = z12;
            xoVar.f33318k1 = f10;
        }
        xoVar.R0 = wallpapersListActivity.f32408d0;
        if (xoVar.f33290b == 1 || (xoVar.f33350y1 instanceof mi1)) {
            ((mi1) xoVar.f33350y1).getClass();
        }
        xoVar.c1(0L);
        ?? obj3 = new Object();
        obj3.f20478a = true;
        xoVar.f33287a.f33270a = wallpapersListActivity.resourceProvider;
        obj3.f20480c = new c21(6);
        obj3.e = true;
        wallpapersListActivity.showAsSheet(xoVar, obj3);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.yi yiVar, Object obj, int i10) {
        Object obj2;
        ArrayList arrayList = wallpapersListActivity.L;
        int i11 = wallpapersListActivity.v;
        if (i11 != 2 && i11 != 3) {
            if (obj instanceof mi1) {
                obj2 = ((mi1) obj).f36333l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f32411f0.put(((TLRPC.WallPaper) obj2).f19336id, obj);
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
                wallpapersListActivity.f32412g0 = false;
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
            iArr = f32398i0;
        } else {
            iArr = f32397h0;
        }
        for (int[] iArr2 : iArr) {
            if (iArr2.length == 1) {
                arrayList.add(new mi1(iArr2[0], 0, "c", 45));
            } else {
                arrayList.add(new mi1("c", iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
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
        mi1 mi1Var = this.f32418y;
        ArrayList arrayList = this.f32405b0;
        if (mi1Var != null) {
            arrayList.remove(mi1Var);
            this.f32418y = null;
        }
        ni1 ni1Var = this.B;
        if (ni1Var != null) {
            arrayList.remove(ni1Var);
            this.B = null;
        }
        mi1 mi1Var2 = this.C;
        if (mi1Var2 == null) {
            mi1 mi1Var3 = new mi1("d", -2368069, -9722489, -2762611, -7817084);
            this.C = mi1Var3;
            mi1Var3.h = 0.34f;
        } else {
            arrayList.remove(mi1Var2);
        }
        ni1 ni1Var2 = this.D;
        if (ni1Var2 != null) {
            arrayList.remove(ni1Var2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            hashMap = this.Z;
            if (i16 < size) {
                Object obj3 = arrayList.get(i16);
                if (obj3 instanceof mi1) {
                    r52 = (mi1) obj3;
                    String str3 = r52.f36325a;
                    if (str3 != null) {
                        r52.f36329g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f36325a)) {
                        String str4 = r52.f36325a;
                        if (str4 != null && !TextUtils.equals(this.P, str4)) {
                            i16++;
                        }
                    }
                    if (this.Q == r52.f36326b) {
                        int i17 = this.R;
                        if (i17 != r52.f36327c) {
                            continue;
                        } else if (this.S != r52.d) {
                            continue;
                        } else if (this.T != r52.e) {
                            continue;
                        } else if (i17 == 0 || this.U == r52.f36328f) {
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
            org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.j6.I.f19814f0;
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
            j11 = tL_wallPaper3.f19336id;
        } else {
            String str5 = this.P;
            if ((r52 instanceof mi1) && (wallPaper = r52.f36333l) != null) {
                j10 = wallPaper.f19336id;
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
                    if (obj4 instanceof mi1) {
                        obj4 = ((mi1) obj4).f36333l;
                    }
                    if (obj5 instanceof mi1) {
                        obj5 = ((mi1) obj5).f36333l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j12 = j11;
                        if (j12 != 0) {
                            if (wallPaper2.f19336id != j12) {
                                if (wallPaper3.f19336id == j12) {
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
        if (org.telegram.ui.ActionBar.j6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.j6.f19972h0)) {
            if (this.D == null) {
                ?? obj4 = new Object();
                obj4.f36672a = "t";
                obj4.f36673b = -2;
                obj4.f36674c = -2;
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
                    mi1 mi1Var4 = new mi1(this.P, this.Q, i18, i13, i14);
                    this.f32418y = mi1Var4;
                    mi1Var4.f36328f = this.U;
                } else {
                    this.f32418y = new mi1(this.Q, i18, this.P, this.U);
                }
                arrayList.add(0, this.f32418y);
            }
        } else if (!"c".equals(this.P) && (i12 = this.Q) != 0) {
            if (i6Var.f19814f0 != null) {
                mi1 mi1Var5 = new mi1(this.P, i12, this.R, this.S, this.T, this.U, this.V, this.W, new File(ApplicationLoader.getFilesDirFixed(), i6Var.f19814f0.f19554a));
                this.f32418y = mi1Var5;
                mi1Var5.f36329g = tL_wallPaper;
                arrayList.add(0, mi1Var5);
            }
        } else {
            int i19 = this.Q;
            if (i19 != 0) {
                int i20 = this.R;
                if (i20 != 0 && (i11 = this.S) != 0) {
                    mi1 mi1Var6 = new mi1(this.P, i19, i20, i11, this.T);
                    this.f32418y = mi1Var6;
                    mi1Var6.f36328f = this.U;
                } else {
                    this.f32418y = new mi1(i19, i20, this.P, this.U);
                }
                arrayList.add(0, this.f32418y);
            } else if (i6Var.f19814f0 != null && !hashMap.containsKey(this.P)) {
                ni1 ni1Var3 = new ni1(new File(ApplicationLoader.getFilesDirFixed(), i6Var.f19814f0.f19554a), new File(ApplicationLoader.getFilesDirFixed(), i6Var.f19814f0.f19555b), this.P);
                this.B = ni1Var3;
                if (this.D != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(i10, ni1Var3);
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
                    long j12 = ((TLRPC.WallPaper) obj).f19336id;
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
        this.f32402a = 0;
        int i10 = this.v;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f32404b = 1;
            this.f32402a = 3;
            this.f32406c = 2;
            this.f32414r = -1;
            this.f32415s = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f32404b = -1;
            this.f32406c = -1;
            this.f32414r = 0;
            this.f32402a = 2;
            this.f32415s = 1;
        } else {
            this.uploadImageRow = -1;
            this.f32404b = -1;
            this.f32406c = -1;
            this.f32414r = -1;
            this.f32415s = -1;
        }
        ArrayList arrayList = this.f32405b0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.O);
            this.e = ceil;
            int i11 = this.f32402a;
            this.d = i11;
            this.f32402a = i11 + ceil;
        } else {
            this.d = -1;
        }
        if (i10 == 0) {
            int i12 = this.f32402a;
            this.f32410f = i12;
            this.h = i12 + 1;
            this.f32402a = i12 + 3;
            this.f32413n = i12 + 2;
        } else {
            this.f32410f = -1;
            this.h = -1;
            this.f32413n = -1;
        }
        oi1 oi1Var = this.F;
        if (oi1Var != null) {
            this.f32412g0 = true;
            oi1Var.l();
        }
    }

    public final void D0() {
        int childCount = this.E.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.E.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.za) {
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    zaVar.c(i11, false, true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.f32416w = new Paint(1);
        Paint paint = new Paint(1);
        this.f32417x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f32417x.setStyle(Paint.Style.STROKE);
        this.f32417x.setColor(855638016);
        this.N = new org.telegram.ui.Components.s81(getParentActivity(), this, new gi1(this));
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
        this.actionBar.setActionBarMenuOnItemClick(new ji1(this));
        if (i10 == 0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new ki1(this);
            this.I = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
            j10.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20176s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.j6.f20227v8;
            kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), true);
            this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20192t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j10.getContext());
            this.J = numberTextView;
            numberTextView.setTextSize(18);
            this.J.setTypeface(AndroidUtilities.bold());
            this.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.J.setOnTouchListener(new ke1(1));
            j10.addView(this.J, k7.b6.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.w0 h = j10.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.L;
            arrayList.add(h);
            arrayList.add(j10.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f32411f0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.E = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.E);
        org.telegram.ui.Components.sl0 sl0Var2 = this.E;
        int i12 = org.telegram.ui.ActionBar.j6.f19852a7;
        sl0Var2.setBackgroundColor(getThemedColor(i12));
        this.E.setClipToPadding(false);
        this.E.setHorizontalScrollBarEnabled(false);
        this.E.setVerticalScrollBarEnabled(false);
        this.E.setItemAnimator(null);
        this.E.setLayoutAnimation(null);
        org.telegram.ui.Components.sl0 sl0Var3 = this.E;
        k kVar2 = new k(1, false, 17);
        this.H = kVar2;
        sl0Var3.setLayoutManager(kVar2);
        frameLayout.addView(this.E, k7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.sl0 sl0Var4 = this.E;
        oi1 oi1Var = new oi1(this, context);
        this.F = oi1Var;
        sl0Var4.setAdapter(oi1Var);
        this.G = new pi1(this, context);
        this.E.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19925e8, false));
        this.E.setOnItemClickListener(new p21(this, 11));
        this.E.setOnScrollListener(new yb1(this, 4));
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
        mi1 mi1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z4;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList2 = (ArrayList) objArr[0];
            this.f32408d0.clear();
            HashMap hashMap2 = this.f32409e0;
            hashMap2.clear();
            HashMap hashMap3 = this.Z;
            ArrayList arrayList3 = this.f32407c0;
            int i15 = this.v;
            HashMap hashMap4 = this.f32403a0;
            ArrayList arrayList4 = this.f32405b0;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f19190id))) {
                                    this.f32408d0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f19190id), wallPaper);
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
                            mi1Var = new mi1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            mi1Var = new mi1(i17, i18, null, wallPaperSettings4.rotation);
                        }
                        mi1Var.f36325a = wallPaper.slug;
                        mi1Var.h = wallPaperSettings4.intensity / 100.0f;
                        mi1Var.f36328f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        mi1Var.f36333l = wallPaper;
                        if (wallPaper.f19336id < 0) {
                            String a2 = mi1Var.a();
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
                                arrayList3.add(mi1Var);
                                hashMap4.put(a2, mi1Var);
                            }
                        }
                        if (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                            arrayList4.add(mi1Var);
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
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).f19336id);
                }
            }
            this.P = org.telegram.ui.ActionBar.j6.H0();
            A0();
            B0(false);
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.sl0 sl0Var = this.E;
            if (sl0Var != null) {
                sl0Var.f1();
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
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, null, null, null, null, i10));
        View view2 = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.j6.f19852a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 48, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20067m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19943f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19924e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19889c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19978h6));
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
        org.telegram.ui.Components.sl0 sl0Var = this.E;
        if (sl0Var != null) {
            sl0Var.getViewTreeObserver().addOnPreDrawListener(new ai(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.v;
        if (i10 != 0 && i10 != 2) {
            z0(this.f32405b0, org.telegram.ui.ActionBar.j6.I.q());
            if (i10 == 1 && this.f32408d0.isEmpty()) {
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
            pi1 pi1Var = this.G;
            if (pi1Var.f37349s != 0) {
                ConnectionsManager.getInstance(pi1Var.B.currentAccount).cancelRequest(pi1Var.f37349s, true);
                pi1Var.f37349s = 0;
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
        org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.j6.I.f19814f0;
        if (c6Var != null) {
            String str2 = c6Var.f19556c;
            this.P = str2;
            if (str2 == null) {
                this.P = "";
            }
            this.Q = c6Var.d;
            this.R = c6Var.e;
            this.S = c6Var.f19557f;
            this.T = c6Var.f19558g;
            this.U = c6Var.h;
            this.V = c6Var.f19561k;
            this.W = c6Var.f19560j;
            this.X = c6Var.f19559i;
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
        org.telegram.ui.Components.sl0 sl0Var = this.E;
        if (sl0Var != null) {
            sl0Var.getViewTreeObserver().addOnPreDrawListener(new ai(this, 6));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.N.f28669a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.N.f28669a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
