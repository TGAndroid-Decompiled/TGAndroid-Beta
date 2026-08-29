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
    public static final int[][] f36361g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] f36362h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] f36363i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] f36364j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] f36365k0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public ai1 A;
    public zh1 B;
    public ai1 C;
    public org.telegram.ui.Components.jl0 D;
    public bi1 E;
    public ci1 F;
    public k G;
    public org.telegram.ui.ActionBar.w0 H;
    public NumberTextView I;
    public org.telegram.ui.Components.hz J;
    public final ArrayList K;
    public org.telegram.ui.ActionBar.c2 L;
    public org.telegram.ui.Components.g81 M;
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
    public int f36366a;
    public final ArrayList f36367a0;
    public int f36368b;
    public final ArrayList f36369b0;
    public int f36370c;
    public ArrayList f36371c0;
    public int d;
    public final HashMap f36372d0;
    public int f36373e;
    public final LongSparseArray f36374e0;
    public int f36375f;
    public boolean f36376f0;
    public int h;
    public int f36377n;
    public int f36378r;
    public int f36379s;
    private int uploadImageRow;
    public final int v;
    public Paint f36380w;
    public Paint f36381x;
    public zh1 f36382y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.K = new ArrayList();
        this.N = 3;
        this.O = "";
        this.X = new ArrayList();
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.f36367a0 = new ArrayList();
        this.f36369b0 = new ArrayList();
        this.f36371c0 = new ArrayList();
        this.f36372d0 = new HashMap();
        this.f36374e0 = new LongSparseArray();
        this.v = i10;
    }

    public static void U(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.f36374e0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.L = c2Var;
        c2Var.f22783c0 = false;
        c2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new o(wallpapersListActivity, 24));
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() != null && wallpapersListActivity.D.getAdapter() != wallpapersListActivity.F) {
            if (i10 == wallpapersListActivity.uploadImageRow) {
                wallpapersListActivity.M.b();
            } else if (i10 == wallpapersListActivity.f36368b) {
                WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
                wallpapersListActivity2.f36371c0 = wallpapersListActivity.f36371c0;
                wallpapersListActivity.presentFragment(wallpapersListActivity2);
            } else if (i10 == wallpapersListActivity.h) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new th1(wallpapersListActivity));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                wallpapersListActivity.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                }
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.aj ajVar, Object obj, int i10) {
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj2;
        zh1 zh1Var = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f36374e0;
        boolean z10 = false;
        if (wallpapersListActivity.actionBar.s()) {
            if (zh1Var instanceof zh1) {
                obj2 = ((zh1) zh1Var).f45234l;
            } else {
                obj2 = zh1Var;
            }
            if (!(obj2 instanceof TLRPC.WallPaper)) {
                return;
            }
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
            if (longSparseArray.indexOfKey(wallPaper.f22544id) >= 0) {
                longSparseArray.remove(wallPaper.f22544id);
            } else {
                longSparseArray.put(wallPaper.f22544id, zh1Var);
            }
            if (longSparseArray.size() == 0) {
                wallpapersListActivity.actionBar.r();
            } else {
                wallpapersListActivity.I.a(longSparseArray.size(), true);
            }
            wallpapersListActivity.f36376f0 = false;
            if (longSparseArray.indexOfKey(wallPaper.f22544id) >= 0) {
                z10 = true;
            }
            ajVar.c(i10, z10, true);
            return;
        }
        boolean z11 = zh1Var instanceof TLRPC.TL_wallPaper;
        if (z11) {
            str = ((TLRPC.TL_wallPaper) zh1Var).slug;
        } else if (zh1Var instanceof zh1) {
            str = ((zh1) zh1Var).f45225a;
        } else if (zh1Var instanceof ai1) {
            str = ((ai1) zh1Var).f36557a;
        } else {
            str = null;
        }
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) zh1Var;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                zh1 zh1Var2 = new zh1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                zh1Var2.f45230g = tL_wallPaper;
                zh1Var2.f45234l = tL_wallPaper;
                zh1Var = zh1Var2;
            }
        }
        org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(zh1Var, null, true, 4);
        if (wallpapersListActivity.v == 1) {
            uoVar.E1 = new th1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z12 = wallpapersListActivity.W;
            boolean z13 = wallpapersListActivity.V;
            float f9 = wallpapersListActivity.U;
            uoVar.B1 = z12;
            uoVar.A1 = z13;
            uoVar.f41652j1 = f9;
        }
        uoVar.Q0 = wallpapersListActivity.f36371c0;
        if (uoVar.f41626b == 1 || (uoVar.f41683x1 instanceof zh1)) {
            ((zh1) uoVar.f41683x1).getClass();
        }
        uoVar.c1(0L);
        ?? obj3 = new Object();
        obj3.f23673a = true;
        uoVar.f41623a.f41354a = wallpapersListActivity.resourceProvider;
        obj3.f23675c = new ef0(10);
        obj3.f23676e = true;
        wallpapersListActivity.showAsSheet(uoVar, obj3);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.aj ajVar, Object obj, int i10) {
        Object obj2;
        ArrayList arrayList = wallpapersListActivity.K;
        int i11 = wallpapersListActivity.v;
        if (i11 != 2 && i11 != 3) {
            if (obj instanceof zh1) {
                obj2 = ((zh1) obj).f45234l;
            } else {
                obj2 = obj;
            }
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f36374e0.put(((TLRPC.WallPaper) obj2).f22544id, obj);
                wallpapersListActivity.I.a(1, false);
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
                wallpapersListActivity.f36376f0 = false;
                wallpapersListActivity.actionBar.O(null, null);
                ajVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public static void z0(ArrayList arrayList, boolean z10) {
        int[][] iArr;
        if (z10) {
            iArr = f36362h0;
        } else {
            iArr = f36361g0;
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
        zh1 zh1Var = this.f36382y;
        ArrayList arrayList = this.f36367a0;
        if (zh1Var != null) {
            arrayList.remove(zh1Var);
            this.f36382y = null;
        }
        ai1 ai1Var = this.A;
        if (ai1Var != null) {
            arrayList.remove(ai1Var);
            this.A = null;
        }
        zh1 zh1Var2 = this.B;
        if (zh1Var2 == null) {
            zh1 zh1Var3 = new zh1("d", -2368069, -9722489, -2762611, -7817084);
            this.B = zh1Var3;
            zh1Var3.h = 0.34f;
        } else {
            arrayList.remove(zh1Var2);
        }
        ai1 ai1Var2 = this.C;
        if (ai1Var2 != null) {
            arrayList.remove(ai1Var2);
        }
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            hashMap = this.Y;
            if (i16 < size) {
                Object obj3 = arrayList.get(i16);
                if (obj3 instanceof zh1) {
                    r52 = (zh1) obj3;
                    String str3 = r52.f45225a;
                    if (str3 != null) {
                        r52.f45230g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(r52.f45225a)) {
                        String str4 = r52.f45225a;
                        if (str4 != null && !TextUtils.equals(this.O, str4)) {
                            i16++;
                        }
                    }
                    if (this.P == r52.f45226b) {
                        int i17 = this.Q;
                        if (i17 != r52.f45227c) {
                            continue;
                        } else if (this.R != r52.d) {
                            continue;
                        } else if (this.S != r52.f45228e) {
                            continue;
                        } else if (i17 == 0 || this.T == r52.f45229f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i16++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        r52 = (TLRPC.TL_wallPaper) obj3;
                        if (r52.settings != null && TextUtils.equals(this.O, r52.slug) && this.P == org.telegram.ui.ActionBar.g6.X0(r52.settings.background_color) && this.Q == org.telegram.ui.ActionBar.g6.X0(r52.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.g6.X0(r52.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.g6.X0(r52.settings.fourth_background_color) && ((this.Q == 0 || this.T == AndroidUtilities.getWallpaperRotation(r52.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.g6.R0(r52.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
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
            org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.f22949e0;
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
            if (wallPaperSettings != null && this.P == org.telegram.ui.ActionBar.g6.X0(wallPaperSettings.background_color) && this.Q == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper3.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper3.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper3.settings.fourth_background_color) && (this.Q == 0 || this.R != 0 || this.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper3.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.g6.R0(tL_wallPaper3.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
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
            j11 = tL_wallPaper3.f22544id;
        } else {
            String str5 = this.O;
            if ((r52 instanceof zh1) && (wallPaper = r52.f45234l) != null) {
                j10 = wallPaper.f22544id;
            } else {
                j10 = 0;
            }
            str = str5;
            j11 = j10;
            obj = r52;
            tL_wallPaper = null;
        }
        final boolean q6 = org.telegram.ui.ActionBar.g6.A0().q();
        try {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj4, Object obj5) {
                    ArrayList arrayList2 = WallpapersListActivity.this.X;
                    if (obj4 instanceof zh1) {
                        obj4 = ((zh1) obj4).f45234l;
                    }
                    if (obj5 instanceof zh1) {
                        obj5 = ((zh1) obj5).f45234l;
                    }
                    if ((obj4 instanceof TLRPC.WallPaper) && (obj5 instanceof TLRPC.WallPaper)) {
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j12 = j11;
                        if (j12 != 0) {
                            if (wallPaper2.f22544id != j12) {
                                if (wallPaper3.f22544id == j12) {
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (org.telegram.ui.ActionBar.g6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.g6.f23128h0)) {
            if (this.C == null) {
                ?? obj4 = new Object();
                obj4.f36557a = "t";
                obj4.f36558b = -2;
                obj4.f36559c = -2;
                this.C = obj4;
            }
            arrayList.add(0, this.C);
        } else {
            this.C = null;
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        if (!TextUtils.isEmpty(this.O) && ("d".equals(this.O) || obj != null)) {
            if (obj == null && this.P != 0 && "c".equals(this.O)) {
                int i18 = this.Q;
                if (i18 != 0 && (i13 = this.R) != 0 && (i14 = this.S) != 0) {
                    zh1 zh1Var4 = new zh1(this.O, this.P, i18, i13, i14);
                    this.f36382y = zh1Var4;
                    zh1Var4.f45229f = this.T;
                } else {
                    this.f36382y = new zh1(this.P, i18, this.O, this.T);
                }
                arrayList.add(0, this.f36382y);
            }
        } else if (!"c".equals(this.O) && (i12 = this.P) != 0) {
            if (f6Var.f22949e0 != null) {
                zh1 zh1Var5 = new zh1(this.O, i12, this.Q, this.R, this.S, this.T, this.U, this.V, new File(ApplicationLoader.getFilesDirFixed(), f6Var.f22949e0.f24018a));
                this.f36382y = zh1Var5;
                zh1Var5.f45230g = tL_wallPaper;
                arrayList.add(0, zh1Var5);
            }
        } else {
            int i19 = this.P;
            if (i19 != 0) {
                int i20 = this.Q;
                if (i20 != 0 && (i11 = this.R) != 0) {
                    zh1 zh1Var6 = new zh1(this.O, i19, i20, i11, this.S);
                    this.f36382y = zh1Var6;
                    zh1Var6.f45229f = this.T;
                } else {
                    this.f36382y = new zh1(i19, i20, this.O, this.T);
                }
                arrayList.add(0, this.f36382y);
            } else if (f6Var.f22949e0 != null && !hashMap.containsKey(this.O)) {
                ai1 ai1Var3 = new ai1(new File(ApplicationLoader.getFilesDirFixed(), f6Var.f22949e0.f24018a), new File(ApplicationLoader.getFilesDirFixed(), f6Var.f22949e0.f24019b), this.O);
                this.A = ai1Var3;
                if (this.C != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(i10, ai1Var3);
            }
        }
        if (!"d".equals(this.O) && !arrayList.isEmpty()) {
            arrayList.add(1, this.B);
        } else {
            arrayList.add(0, this.B);
        }
        C0();
    }

    public final void B0(boolean z10) {
        long j10 = 0;
        if (!z10) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            long j11 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.WallPaper) {
                    long j12 = ((TLRPC.WallPaper) obj).f22544id;
                    if (j12 >= 0) {
                        j11 = MediaDataController.calcHash(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new nh.l3(13, this, z10)), this.classGuid);
    }

    public final void C0() {
        this.f36366a = 0;
        int i10 = this.v;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.f36368b = 1;
            this.f36366a = 3;
            this.f36370c = 2;
            this.f36378r = -1;
            this.f36379s = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.f36368b = -1;
            this.f36370c = -1;
            this.f36378r = 0;
            this.f36366a = 2;
            this.f36379s = 1;
        } else {
            this.uploadImageRow = -1;
            this.f36368b = -1;
            this.f36370c = -1;
            this.f36378r = -1;
            this.f36379s = -1;
        }
        ArrayList arrayList = this.f36367a0;
        if (!arrayList.isEmpty()) {
            int ceil = (int) Math.ceil(arrayList.size() / this.N);
            this.f36373e = ceil;
            int i11 = this.f36366a;
            this.d = i11;
            this.f36366a = i11 + ceil;
        } else {
            this.d = -1;
        }
        if (i10 == 0) {
            int i12 = this.f36366a;
            this.f36375f = i12;
            this.h = i12 + 1;
            this.f36366a = i12 + 3;
            this.f36377n = i12 + 2;
        } else {
            this.f36375f = -1;
            this.h = -1;
            this.f36377n = -1;
        }
        bi1 bi1Var = this.E;
        if (bi1Var != null) {
            this.f36376f0 = true;
            bi1Var.l();
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
        this.f36380w = new Paint(1);
        Paint paint = new Paint(1);
        this.f36381x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f36381x.setStyle(Paint.Style.STROKE);
        this.f36381x.setColor(855638016);
        this.M = new org.telegram.ui.Components.g81(getParentActivity(), this, new uh1(this));
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
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new xh1(this);
            this.H = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
            j10.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23329s8, false));
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.g6.f23385v8;
            lVar.C(org.telegram.ui.ActionBar.g6.w0(null, i11, false), true);
            this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23348t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j10.getContext());
            this.I = numberTextView;
            numberTextView.setTextSize(18);
            this.I.setTypeface(AndroidUtilities.bold());
            this.I.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.I.setOnTouchListener(new yd1(1));
            j10.addView(this.I, i7.f6.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.w0 h = j10.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.K;
            arrayList.add(h);
            arrayList.add(j10.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f36374e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.D = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.D);
        org.telegram.ui.Components.jl0 jl0Var2 = this.D;
        int i12 = org.telegram.ui.ActionBar.g6.f23009a7;
        jl0Var2.setBackgroundColor(getThemedColor(i12));
        this.D.setClipToPadding(false);
        this.D.setHorizontalScrollBarEnabled(false);
        this.D.setVerticalScrollBarEnabled(false);
        this.D.setItemAnimator(null);
        this.D.setLayoutAnimation(null);
        org.telegram.ui.Components.jl0 jl0Var3 = this.D;
        k kVar = new k(1, false, 17);
        this.G = kVar;
        jl0Var3.setLayoutManager(kVar);
        frameLayout.addView(this.D, i7.f6.e(-1, -1, 51));
        org.telegram.ui.Components.jl0 jl0Var4 = this.D;
        bi1 bi1Var = new bi1(this, context);
        this.E = bi1Var;
        jl0Var4.setAdapter(bi1Var);
        this.F = new ci1(this, context);
        this.D.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23082e8, false));
        this.D.setOnItemClickListener(new d21(this, 11));
        this.D.setOnScrollListener(new lb1(this, 4));
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(context, null);
        this.J = hzVar;
        hzVar.setVisibility(8);
        this.J.setShowAtCenter(true);
        this.J.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.J.setText(LocaleController.getString(R.string.NoResult));
        this.D.setEmptyView(this.J);
        frameLayout.addView(this.J, i7.f6.c(-1.0f, -1));
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
            this.f36371c0.clear();
            HashMap hashMap2 = this.f36372d0;
            hashMap2.clear();
            HashMap hashMap3 = this.Y;
            ArrayList arrayList3 = this.f36369b0;
            int i15 = this.v;
            HashMap hashMap4 = this.Z;
            ArrayList arrayList4 = this.f36367a0;
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
                                if (!hashMap2.containsKey(Long.valueOf(document.f22398id))) {
                                    this.f36371c0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.f22398id), wallPaper);
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
                            zh1Var = new zh1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                            hashMap = hashMap2;
                        } else {
                            arrayList = arrayList2;
                            hashMap = hashMap2;
                            zh1Var = new zh1(i17, i18, null, wallPaperSettings4.rotation);
                        }
                        zh1Var.f45225a = wallPaper.slug;
                        zh1Var.h = wallPaperSettings4.intensity / 100.0f;
                        zh1Var.f45229f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                        zh1Var.f45234l = wallPaper;
                        if (wallPaper.f22544id < 0) {
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
                        if (org.telegram.ui.ActionBar.g6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
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
                    getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).f22544id);
                }
            }
            this.O = org.telegram.ui.ActionBar.g6.H0();
            A0();
            B0(false);
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            org.telegram.ui.Components.jl0 jl0Var = this.D;
            if (jl0Var != null) {
                jl0Var.f1();
            }
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.h(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            getMessagesStorage().getWallpapers();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 0, null, null, null, null, i10));
        View view2 = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 48, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23100f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 16, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23081e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23134h6));
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
        org.telegram.ui.Components.jl0 jl0Var = this.D;
        if (jl0Var != null) {
            jl0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 6));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.v;
        if (i10 != 0 && i10 != 2) {
            z0(this.f36367a0, org.telegram.ui.ActionBar.g6.I.q());
            if (i10 == 1 && this.f36371c0.isEmpty()) {
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
            ci1 ci1Var = this.F;
            if (ci1Var.f37148s != 0) {
                ConnectionsManager.getInstance(ci1Var.A.currentAccount).cancelRequest(ci1Var.f37148s, true);
                ci1Var.f37148s = 0;
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
        org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.f22949e0;
        if (z5Var != null) {
            String str2 = z5Var.f24020c;
            this.O = str2;
            if (str2 == null) {
                this.O = "";
            }
            this.P = z5Var.d;
            this.Q = z5Var.f24021e;
            this.R = z5Var.f24022f;
            this.S = z5Var.f24023g;
            this.T = z5Var.h;
            this.U = z5Var.f24026k;
            this.V = z5Var.f24025j;
            this.W = z5Var.f24024i;
        } else {
            if (org.telegram.ui.ActionBar.g6.d1()) {
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
        A0();
        org.telegram.ui.Components.jl0 jl0Var = this.D;
        if (jl0Var != null) {
            jl0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 6));
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.f28819a = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.M.f28819a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
