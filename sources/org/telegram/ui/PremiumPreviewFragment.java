package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public oa A0;
    public final ArrayList B0;
    public final RectF C0;
    public Drawable D0;
    public int E;
    public int E0;
    public int F;
    public int G;
    public int H;
    public int I;
    public Drawable J;
    public FrameLayout K;
    public FrameLayout L;
    public fs0 M;
    public ug.l1 N;
    public int O;
    public int P;
    public org.telegram.ui.Components.qy Q;
    public final Paint R;
    public LinearGradient S;
    public final Matrix T;
    public final Paint U;
    public rs0 V;
    public ug.s1 W;
    public boolean X;
    public int Y;
    public int Z;
    public org.telegram.ui.Components.uj0 f42975a;
    public boolean f42976a0;
    public final ArrayList f42977b;
    public boolean f42978b0;
    public final ArrayList f42979c;
    public float f42980c0;
    public final ArrayList d;
    public int f42981d0;
    public int f42982e;
    public is0 f42983e0;
    public ts0 f42984f;
    public ug.q0 f42985f0;
    public float f42986g0;
    public int h;
    public final int f42987h0;
    public final boolean f42988i0;
    public final String f42989j0;
    public boolean f42990k0;
    public final Bitmap f42991l0;
    public final Canvas m0;
    public int f42992n;
    public final ug.z0 f42993n0;
    public final ug.z0 f42994o0;
    public i0.c f42995p0;
    public boolean f42996q0;
    public int f42997r;
    public float f42998r0;
    public int f42999s;
    public di.xb f43000s0;
    int showAdsRow;
    public int f43001t0;
    public int f43002u0;
    public ks0 f43003v0;
    public int f43004w;
    public dh.d f43005w0;
    public int f43006x;
    public final dh.g f43007x0;
    public int f43008y;
    public final dh.c f43009y0;
    public final dh.c f43010z0;

    public PremiumPreviewFragment(int i7, String str) {
        super(null);
        this.f42977b = new ArrayList();
        this.f42979c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.f42982e = 0;
        this.R = new Paint(1);
        this.T = new Matrix();
        this.U = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f42991l0 = createBitmap;
        this.m0 = new Canvas(createBitmap);
        this.f42993n0 = new ug.z0(org.telegram.ui.ActionBar.j6.Gk, org.telegram.ui.ActionBar.j6.Hk, org.telegram.ui.ActionBar.j6.Ik, org.telegram.ui.ActionBar.j6.Jk, null);
        this.f42995p0 = i0.c.f15573e;
        ug.z0 z0Var = new ug.z0(org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, -1, -1, null);
        this.f42994o0 = z0Var;
        z0Var.f58398m = true;
        z0Var.f58400o = 0.0f;
        z0Var.f58401p = 0.0f;
        z0Var.f58402q = 1.0f;
        z0Var.f58389b = 0.0f;
        z0Var.f58390c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.f42987h0 = i7;
        if (!org.telegram.ui.ActionBar.j6.I.q() && i7 == 1) {
            z10 = true;
        }
        this.f42988i0 = z10;
        this.f42989j0 = str;
        k8.a aVar = new k8.a(this);
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(true);
            this.f43007x0 = gVar;
            ui.f fVar = new ui.f(null);
            fVar.d = gVar;
            fVar.f58439e = -3;
            fVar.f58440f = aVar;
            this.f43009y0 = new dh.c(fVar, fVar, fVar);
        } else {
            this.f43007x0 = null;
            this.f43009y0 = new dh.c(aVar, aVar, aVar);
        }
        this.f43010z0 = new dh.c(aVar, aVar, aVar);
    }

    public static void Z(PremiumPreviewFragment premiumPreviewFragment, View view, int i7) {
        ts0 ts0Var;
        boolean z10;
        org.telegram.ui.Components.e5 e5Var;
        fs0 fs0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int L;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i14 = premiumPreviewFragment.f42987h0;
        if (premiumPreviewFragment.getUserConfig().p()) {
            boolean z11 = false;
            if (i7 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull b22 = premiumPreviewFragment.getMessagesController().b2(premiumPreviewFragment.getUserConfig().e());
                if (b22 != null) {
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    l8Var.setChecked(!l8Var.d());
                    b22.sponsored_enabled = l8Var.d();
                    TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                    togglesponsoredmessages.enabled = b22.sponsored_enabled;
                    premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new l(premiumPreviewFragment, 17));
                    premiumPreviewFragment.getMessagesStorage().j2(b22, false);
                }
            } else if (view instanceof fs0) {
                fs0 fs0Var2 = (fs0) view;
                if (i14 == 1 && premiumPreviewFragment.getUserConfig().q()) {
                    int i15 = fs0Var2.f47180f.f51269a;
                    if (i15 == 29) {
                        premiumPreviewFragment.presentFragment(new kg.a1());
                        return;
                    } else if (i15 == 32) {
                        premiumPreviewFragment.presentFragment(new kg.s0());
                        return;
                    } else if (i15 == 33) {
                        ?? e2Var = new org.telegram.ui.ActionBar.e2(null);
                        e2Var.f17881f = -4;
                        premiumPreviewFragment.presentFragment((org.telegram.ui.ActionBar.e2) e2Var);
                        return;
                    } else if (i15 == 30) {
                        premiumPreviewFragment.presentFragment(new kg.c1());
                        return;
                    } else if (i15 == 34) {
                        premiumPreviewFragment.presentFragment(new kg.q0());
                        return;
                    } else if (i15 == 31) {
                        premiumPreviewFragment.presentFragment(new kg.r1());
                        return;
                    } else if (i15 == 14) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("dialog_id", org.telegram.messenger.m10.i(premiumPreviewFragment.currentAccount).e());
                        bundle.putInt("type", 1);
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.y80(bundle, null));
                        return;
                    } else if (i15 == 12) {
                        Long h = org.telegram.messenger.q10.h(premiumPreviewFragment.getUserConfig().f());
                        bi.e4 e4Var = new bi.e4(22, premiumPreviewFragment, fs0Var2);
                        if (premiumPreviewFragment.f43003v0 == null) {
                            e11[] e11VarArr = new e11[1];
                            if (fs0Var2.getHeight() + fs0Var2.getTop() > premiumPreviewFragment.f42975a.getMeasuredHeight() / 2.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Point point = org.telegram.messenger.g0.f23611q;
                            int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                            int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                            org.telegram.ui.Components.e5 e5Var2 = fs0Var2.h;
                            if (e5Var2 != null) {
                                Drawable[] drawableArr = e5Var2.f34181f;
                                Drawable drawable = drawableArr[1];
                                if (drawable != null) {
                                    if (drawable instanceof org.telegram.ui.Components.g5) {
                                        ((org.telegram.ui.Components.g5) drawable).o(e5Var2);
                                    }
                                    drawableArr[1] = null;
                                }
                                org.telegram.ui.Components.e5 e5Var3 = fs0Var2.h;
                                if (e5Var3 != null) {
                                    e5Var3.f();
                                    fs0Var2.c();
                                    Rect rect = org.telegram.messenger.g0.Q;
                                    rect.set(fs0Var2.h.getBounds());
                                    if (z10) {
                                        L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                                    } else {
                                        L = (-(fs0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                                    }
                                    i11 = rect.centerX() - (point.x - min2);
                                    e5Var = e5Var3;
                                    i10 = L;
                                } else {
                                    e5Var = e5Var3;
                                    i10 = 0;
                                    i11 = 0;
                                }
                                fs0Var = fs0Var2;
                            } else {
                                e5Var = null;
                                fs0Var = null;
                                i10 = 0;
                                i11 = 0;
                            }
                            if (z10) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            int i16 = i10;
                            Activity parentActivity = premiumPreviewFragment.getParentActivity();
                            Integer valueOf = Integer.valueOf(i11);
                            org.telegram.ui.ActionBar.e6 resourceProvider = premiumPreviewFragment.getResourceProvider();
                            if (z10) {
                                i13 = 24;
                            } else {
                                i13 = 16;
                            }
                            js0 js0Var = new js0(premiumPreviewFragment, premiumPreviewFragment, parentActivity, valueOf, i12, resourceProvider, i13, e4Var, e11VarArr);
                            js0Var.f49384h1 = true;
                            js0Var.setSelected(h);
                            js0Var.setSaveState(3);
                            js0Var.y(e5Var, fs0Var);
                            ks0 ks0Var = new ks0(premiumPreviewFragment, js0Var);
                            premiumPreviewFragment.f43003v0 = ks0Var;
                            e11VarArr[0] = ks0Var;
                            ks0Var.showAsDropDown(fs0Var2, 0, i16, 53);
                            e11VarArr[0].b();
                            return;
                        }
                        return;
                    } else if (i15 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f42608f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i15 == 36) {
                        premiumPreviewFragment.presentFragment(new kg.n());
                        return;
                    } else if (i15 == 37) {
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.r41());
                        return;
                    } else {
                        return;
                    }
                }
                v0(premiumPreviewFragment.currentAccount, fs0Var2.f47180f.f51269a);
                int i17 = premiumPreviewFragment.f42982e;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    ts0Var = (ts0) arrayList.get(premiumPreviewFragment.f42982e);
                } else {
                    ts0Var = null;
                }
                Activity parentActivity2 = premiumPreviewFragment.getParentActivity();
                int i18 = premiumPreviewFragment.currentAccount;
                if (i14 == 1) {
                    z11 = true;
                }
                premiumPreviewFragment.showDialog(new ug.x0(premiumPreviewFragment, parentActivity2, i18, z11, fs0Var2.f47180f.f51269a, false, ts0Var));
            }
        }
    }

    public static org.telegram.ui.ActionBar.k j0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void p0(org.telegram.ui.ActionBar.e2 e2Var, ts0 ts0Var, String str, com.google.android.gms.internal.clearcut.y0 y0Var) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z10 = org.telegram.messenger.r2.f26206a;
        if (e2Var == null) {
            currentAccount = org.telegram.messenger.m10.f24940t0;
        } else {
            currentAccount = e2Var.getCurrentAccount();
        }
        int i7 = currentAccount;
        if (org.telegram.messenger.np.s1(i7).v2()) {
            b.b(i7);
            return;
        }
        if (ts0Var == null && (tL_help_premiumPromo = org.telegram.messenger.si.b0(i7).E) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i10);
                i10++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i11 = tL_premiumSubscriptionOption3.months;
                if (i11 == 1) {
                    ts0Var = new ts0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    ts0Var = new ts0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        ts0 ts0Var2 = ts0Var;
        u0();
        if (org.telegram.messenger.r2.b()) {
            if (e2Var != null) {
                activity = e2Var.getParentActivity();
            } else {
                activity = LaunchActivity.H1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (ts0Var2 != null && (tL_premiumSubscriptionOption = ts0Var2.f51666a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.X0 = true;
                    }
                    vf.c.t(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
                if (!TextUtils.isEmpty(s12.t6)) {
                    launchActivity.X0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + s12.t6 + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(s12.f25411u6)) {
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + s12.f25411u6)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        f5.m mVar = org.telegram.messenger.r1.f26194l;
        if (mVar != null && !mVar.h.isEmpty()) {
            if (ts0Var2.f51670f == null) {
                ts0Var2.f51670f = org.telegram.messenger.r1.f26194l;
            }
            ts0Var2.a();
            if (ts0Var2.f51671g == null) {
                return;
            }
            org.telegram.messenger.r1.i().p("subs", new bg.f0(e2Var, i7, y0Var, ts0Var2, 8));
        }
    }

    public static String q0(int i7) {
        switch (i7) {
            case 0:
                return "double_limits";
            case 1:
                return "more_upload";
            case 2:
                return "faster_download";
            case 3:
                return "no_ads";
            case 4:
                return "infinite_reactions";
            case 5:
                return "premium_stickers";
            case 6:
                return "profile_badge";
            case 7:
                return "animated_userpics";
            case 8:
                return "voice_to_text";
            case 9:
                return "advanced_chat_management";
            case 10:
                return "app_icons";
            case 11:
                return "animated_emoji";
            case 12:
                return "emoji_status";
            case 13:
                return "translations";
            case 14:
                return "stories";
            case 15:
                return "stories__stealth_mode";
            case 16:
                return "stories__permanent_views_history";
            case 17:
                return "stories__expiration_durations";
            case 18:
                return "stories__save_stories_to_gallery";
            case 19:
                return "stories__links_and_formatting";
            case 20:
                return "stories__priority_order";
            case 21:
                return "stories__caption";
            case 22:
                return "wallpapers";
            case 23:
                return "peer_colors";
            case 24:
                return "saved_tags";
            case 25:
                return "stories__quality";
            case 26:
                return "last_seen";
            case 27:
                return "message_privacy";
            case 28:
                return "business";
            case 29:
                return "business_location";
            case 30:
                return "business_hours";
            case 31:
                return "quick_replies";
            case 32:
                return "greeting_message";
            case 33:
                return "away_message";
            case 34:
                return "business_bots";
            case 35:
                return "folder_tags";
            case 36:
                return "business_intro";
            case 37:
                return "business_links";
            case 38:
                return "effects";
            case 39:
                return "todo";
            case 40:
                return "gifts";
            case 41:
                return "pm_noforwards";
            case 42:
                return "ai_compose";
            case 43:
                return "rich_formatting";
            default:
                return null;
        }
    }

    public static void r0(int i7, ArrayList arrayList, boolean z10) {
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        SparseIntArray sparseIntArray = s12.P0;
        if (!z10) {
            arrayList.add(new ss0(29, 2131231129, org.telegram.messenger.hd.M0(2131747053, null), org.telegram.messenger.hd.M0(2131747052, null)));
            arrayList.add(new ss0(30, 2131231148, org.telegram.messenger.hd.M0(2131747051, null), org.telegram.messenger.hd.M0(2131747050, null)));
            arrayList.add(new ss0(31, 2131231133, org.telegram.messenger.hd.M0(2131747049, null), org.telegram.messenger.hd.M0(2131747048, null)));
            arrayList.add(new ss0(32, 2131232572, org.telegram.messenger.hd.M0(2131747057, null), org.telegram.messenger.hd.M0(2131747056, null)));
            arrayList.add(new ss0(33, 2131231143, org.telegram.messenger.hd.M0(2131747064, null), org.telegram.messenger.hd.M0(2131747063, null)));
            arrayList.add(new ss0(34, 2131231144, org.telegram.messenger.hd.M0(2131747059, null), org.telegram.messenger.hd.M0(2131747058, null)));
            arrayList.add(new ss0(37, 2131231147, org.telegram.messenger.hd.M0(2131747062, null), org.telegram.messenger.hd.M0(2131747061, null)));
            arrayList.add(new ss0(36, 2131231149, org.telegram.messenger.hd.M0(2131747055, null), org.telegram.messenger.hd.M0(2131747054, null)));
        } else {
            arrayList.add(new ss0(12, 2131231150, org.telegram.messenger.hd.M0(2131747016, null), org.telegram.messenger.hd.M0(2131747015, null)));
            arrayList.add(new ss0(35, 2131232573, org.telegram.messenger.hd.M0(2131747002, null), org.telegram.messenger.hd.M0(2131747001, null)));
            arrayList.add(new ss0(14, 2131231146, org.telegram.messenger.hd.M0(2131747014, null), org.telegram.messenger.hd.M0(2131747013, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((ss0) arrayList.get(i10)).f51269a, -1) == -1) {
                    boolean z11 = org.telegram.messenger.r2.f26206a;
                }
            }
        }
        Collections.sort(arrayList, new hs0(s12, 0));
    }

    public static void s0(int i7, ArrayList arrayList) {
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        arrayList.add(new ss0(0, 2131232307, org.telegram.messenger.hd.M0(2131746998, null), org.telegram.messenger.hd.a0(null, null, 2131746997, Integer.valueOf(s12.F4), Integer.valueOf(s12.N4), Integer.valueOf(s12.R4), Integer.valueOf(s12.T4), 4)));
        arrayList.add(new ss0(14, 2131232155, org.telegram.messenger.hd.M0(2131746974, null), org.telegram.messenger.hd.a0(null, null, 2131746973, new Object[0])));
        arrayList.add(new ss0(1, 2131232316, org.telegram.messenger.hd.M0(2131746964, null), org.telegram.messenger.hd.M0(2131746963, null)));
        arrayList.add(new ss0(2, 2131232313, org.telegram.messenger.hd.M0(2131747012, null), org.telegram.messenger.hd.M0(2131747011, null)));
        arrayList.add(new ss0(8, 2131232317, org.telegram.messenger.hd.M0(2131746962, null), org.telegram.messenger.hd.M0(2131746961, null)));
        arrayList.add(new ss0(3, 2131232302, org.telegram.messenger.hd.M0(2131746992, null), org.telegram.messenger.hd.M0(2131746991, null)));
        arrayList.add(new ss0(4, 2131232312, org.telegram.messenger.hd.M0(2131746982, null), org.telegram.messenger.hd.M0(2131746981, null)));
        arrayList.add(new ss0(5, 2131232314, org.telegram.messenger.hd.M0(2131746976, null), org.telegram.messenger.hd.M0(2131746975, null)));
        arrayList.add(new ss0(11, 2131232305, org.telegram.messenger.hd.M0(2131747007, null), org.telegram.messenger.hd.M0(2131747006, null)));
        arrayList.add(new ss0(9, 2131231859, org.telegram.messenger.hd.M0(2131747025, null), org.telegram.messenger.hd.M0(2131747024, null)));
        arrayList.add(new ss0(6, 2131232304, org.telegram.messenger.hd.M0(2131746987, null), org.telegram.messenger.hd.M0(2131746986, null)));
        arrayList.add(new ss0(27, 2131231131, org.telegram.messenger.hd.M0(2131746989, null), org.telegram.messenger.hd.M0(2131746988, null)));
        arrayList.add(new ss0(7, 2131232303, org.telegram.messenger.hd.M0(2131747022, null), org.telegram.messenger.hd.M0(2131747021, null)));
        arrayList.add(new ss0(24, 2131232573, org.telegram.messenger.hd.M0(2131746971, null), org.telegram.messenger.hd.M0(2131746969, null)));
        arrayList.add(new ss0(10, 2131232306, org.telegram.messenger.hd.M0(2131747020, null), org.telegram.messenger.hd.M0(2131747019, null)));
        arrayList.add(new ss0(12, 2131232572, org.telegram.messenger.hd.M0(2131747004, null), org.telegram.messenger.hd.M0(2131747003, null)));
        arrayList.add(new ss0(13, 2131232315, org.telegram.messenger.hd.M0(2131746966, null), org.telegram.messenger.hd.M0(2131746965, null)));
        arrayList.add(new ss0(22, 2131232574, org.telegram.messenger.hd.M0(2131746959, null), org.telegram.messenger.hd.M0(2131746958, null)));
        arrayList.add(new ss0(23, 2131232570, org.telegram.messenger.hd.M0(2131746985, null), org.telegram.messenger.hd.M0(2131746984, null)));
        arrayList.add(new ss0(26, 2131231858, org.telegram.messenger.hd.M0(2131747000, null), org.telegram.messenger.hd.M0(2131746999, null)));
        arrayList.add(new ss0(28, 2131231145, org.telegram.messenger.hd.M0(2131744252, null), org.telegram.messenger.hd.M0(2131747017, null)));
        arrayList.add(new ss0(38, 2131231855, org.telegram.messenger.hd.M0(2131747009, null), org.telegram.messenger.hd.M0(2131747008, null)));
        arrayList.add(new ss0(39, 2131232306, org.telegram.messenger.hd.M0(2131746968, null), org.telegram.messenger.hd.M0(2131746967, null)));
        arrayList.add(new ss0(41, 2131231170, org.telegram.messenger.hd.M0(2131746978, null), org.telegram.messenger.hd.M0(2131746977, null)));
        arrayList.add(new ss0(42, 2131232569, org.telegram.messenger.hd.M0(2131747027, null), org.telegram.messenger.hd.M0(2131747026, null)));
        arrayList.add(new ss0(43, 2131232571, org.telegram.messenger.hd.M0(2131746980, null), org.telegram.messenger.hd.M0(2131746979, null)));
        SparseIntArray sparseIntArray = s12.O0;
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((ss0) arrayList.get(i10)).f51269a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.r2.f26206a;
                }
            }
        }
        Collections.sort(arrayList, new hs0(s12, 1));
    }

    public static java.lang.String t0(int r17, org.telegram.ui.ts0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.t0(int, org.telegram.ui.ts0):java.lang.String");
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0).sendRequest(tL_help_saveAppLog, new fi.m5(9));
    }

    public static void v0(int i7, int i10) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i7).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String q02 = q0(i10);
        if (q02 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = q02;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i7).sendRequest(tL_help_saveAppLog, new fi.m5(9));
    }

    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0);
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = connectionsManager.getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_show";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        if (str != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = str;
            tL_jsonNull = tL_jsonString;
        } else {
            tL_jsonNull = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "source";
        tL_jsonObjectValue.value = tL_jsonNull;
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        connectionsManager.sendRequest(tL_help_saveAppLog, new fi.m5(9));
    }

    public final void A0(boolean z10) {
        di.xb xbVar;
        if (z10 != this.f42976a0) {
            this.f42976a0 = z10;
            rs0 rs0Var = this.V;
            if (rs0Var != null && (xbVar = rs0Var.d) != null) {
                xbVar.setDialogVisible(z10);
            }
            this.W.setPaused(z10);
            this.f42983e0.invalidate();
        }
    }

    public final void B0() {
        boolean z10;
        ts0 ts0Var;
        this.f43008y = -1;
        this.F = -1;
        this.f42999s = -1;
        this.f43004w = -1;
        this.f43006x = -1;
        this.H = -1;
        this.showAdsRow = -1;
        this.I = -1;
        this.h = 1;
        this.f42992n = 1;
        int size = this.f42977b.size() + 1;
        this.h = size;
        this.f42997r = size;
        int i7 = this.f42987h0;
        if (i7 == 1 && getUserConfig().q()) {
            int i10 = this.h;
            int i11 = i10 + 1;
            this.f43008y = i10;
            int i12 = i10 + 2;
            this.h = i12;
            this.f42999s = i11;
            this.f43004w = i12;
            int size2 = this.f42979c.size() + i12;
            this.h = size2;
            this.f43006x = size2;
        }
        int i13 = this.h;
        this.E = i13;
        this.h = i13 + 2;
        this.G = i13 + 1;
        if (i7 == 1 && getUserConfig().q()) {
            int i14 = this.h;
            this.H = i14;
            this.showAdsRow = i14 + 1;
            this.h = i14 + 3;
            this.I = i14 + 2;
        }
        FrameLayout frameLayout = this.K;
        int i15 = 0;
        if (getUserConfig().q() && ((ts0Var = this.f42984f) == null || ts0Var.f51666a.months >= ((ts0) this.d.get(this.f42982e)).f51666a.months || this.f42996q0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.messenger.g0.Y3(frameLayout, z10, 1.0f, true, false);
        if (this.K.getVisibility() == 0) {
            i15 = org.telegram.messenger.g0.L(64.0f);
        }
        org.telegram.ui.Components.qy qyVar = this.Q;
        qyVar.M = (this.Y + i15) - org.telegram.messenger.g0.L(16.0f);
        qyVar.p1();
        this.Q.S = i15;
    }

    @Override
    public final boolean canBeginSlide() {
        di.xb xbVar;
        rs0 rs0Var = this.V;
        if (rs0Var != null && (xbVar = rs0Var.d) != null && xbVar.f58891a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.A0 = new oa(this, 2);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.R;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fk, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ek, false);
        int i7 = org.telegram.ui.ActionBar.j6.Dk;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.j6.x0(null, i7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ck, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Bk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.S = linearGradient2;
        linearGradient2.setLocalMatrix(this.T);
        this.U.setShader(this.S);
        this.M = new fs0(context, null);
        this.N = new ug.l1(context);
        ArrayList arrayList = this.f42977b;
        arrayList.clear();
        ArrayList arrayList2 = this.f42979c;
        arrayList2.clear();
        int i10 = this.f42987h0;
        if (i10 == 0) {
            s0(this.currentAccount, arrayList);
        } else {
            r0(this.currentAccount, arrayList, false);
            r0(this.currentAccount, arrayList2, true);
            kg.v1.f(this.currentAccount).h();
            if (getUserConfig().q()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                org.telegram.messenger.si.b0(this.currentAccount).m0(tL_inputStickerSetShortName, false);
                kg.f.a(this.currentAccount).c(null);
                if (getMessagesController().W0.isEmpty()) {
                    getMessagesController().d3();
                }
                kg.y d = kg.y.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable g10 = i5.c.g(context, 2131232729);
        this.J = g10;
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f28922h5), PorterDuff.Mode.MULTIPLY));
        this.J.getPadding(rect);
        this.Y = org.telegram.messenger.g0.f23605m;
        this.f42983e0 = new is0(this, context);
        jh.k kVar = new jh.k(this.f42983e0);
        is0 is0Var = this.f42983e0;
        dh.c cVar = this.f43009y0;
        cVar.h = kVar;
        cVar.f8098i = is0Var;
        jh.k kVar2 = new jh.k(this.f42983e0);
        is0 is0Var2 = this.f42983e0;
        dh.c cVar2 = this.f43010z0;
        cVar2.h = kVar2;
        cVar2.f8098i = is0Var2;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f42975a = uj0Var;
        uj0Var.setClipToOutline(true);
        this.f42975a.setOutlineProvider(new fh.a(this, 9));
        this.f42975a.D0(new gs0(this, 1));
        this.f42975a.setCaptureSectionsDecoratorAllowed(true);
        this.f42975a.setLegacySections(true);
        this.f42975a.setSections(true);
        this.f42975a.setClipToPadding(false);
        org.telegram.ui.Components.uj0 uj0Var2 = this.f42975a;
        org.telegram.ui.Components.qy qyVar = new org.telegram.ui.Components.qy((org.telegram.messenger.g0.L(68.0f) + this.Y) - org.telegram.messenger.g0.L(16.0f), this.f42975a);
        this.Q = qyVar;
        uj0Var2.setLayoutManager(qyVar);
        this.Q.R = true;
        this.f42975a.setAdapter(new ms0(this));
        this.f42975a.j(new g3(this, 25));
        this.V = new rs0(this, context);
        ug.s1 s1Var = new ug.s1(context);
        this.W = s1Var;
        s1Var.c();
        if (i10 == 1) {
            if (this.f42988i0) {
                ug.r1 r1Var = this.W.f58330a;
                r1Var.f58319q = true;
                r1Var.K = false;
                r1Var.H = true;
                r1Var.J = true;
                r1Var.f58313k = org.telegram.messenger.g0.L(-14.0f);
                ug.r1 r1Var2 = this.W.f58330a;
                r1Var2.f58325x = 2000L;
                r1Var2.f58326y = 3000;
                r1Var2.f58320r = 16;
                r1Var2.G = false;
                r1Var2.O = 28;
                r1Var2.Q = i7;
            } else {
                ug.r1 r1Var3 = this.W.f58330a;
                r1Var3.J = true;
                r1Var3.f58313k = org.telegram.messenger.g0.L(28.0f);
                ug.r1 r1Var4 = this.W.f58330a;
                r1Var4.f58325x = 2000L;
                r1Var4.f58326y = 3000;
                r1Var4.f58320r = 16;
                r1Var4.G = false;
                r1Var4.O = 28;
            }
        }
        this.V.d.setStarParticlesView(this.W);
        this.f42983e0.addView(this.W, c8.ja.c(-2.0f, -1));
        this.f42983e0.addView(this.V, c8.ja.c(-2.0f, -1));
        this.f42975a.setOnItemClickListener(new h(this, 24));
        this.f42983e0.addView(this.f42975a, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.L = new FrameLayout(context);
        ug.q0 q0Var = new ug.q0(context, getResourceProvider(), false);
        this.f42985f0 = q0Var;
        q0Var.L = true;
        q0Var.setClickable(false);
        q0Var.f58271w.setClickable(false);
        q0Var.setStateListAnimator(null);
        y0(false);
        this.K = new FrameLayout(context);
        this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.L.addView(this.f42985f0, c8.ja.c(-1.0f, -1));
        View view = this.L;
        fh.g c10 = cVar.c(view, null, false);
        c10.p(c8.g0.j(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        view.setBackground(c10);
        c8.na.b(this.L, 0.02f, 1.5f);
        this.K.addView(this.L, c8.ja.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar = new dh.d(cVar.c(this.K, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), false);
        this.f43005w0 = new dh.d(cVar.c(this.f42983e0, null, false));
        this.K.setBackground(dVar);
        if (getUserConfig().p()) {
            this.f42983e0.addView(this.K, c8.ja.e(-1, -2, 80));
        }
        this.fragmentView = this.f42983e0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.actionBar.setBackButtonImage(2131231241);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 29));
        this.actionBar.setForceSkipTouches(true);
        this.f42983e0.addView(this.actionBar, c8.ja.e(-1, -2, 48));
        z0();
        B0();
        this.V.d.m(200L);
        if (this.f42996q0) {
            org.telegram.messenger.g0.i3(new gs0(this, 2), 400L);
        }
        org.telegram.messenger.si.b0(this.currentAccount).o1();
        w0(this.f42989j0);
        View view2 = this.fragmentView;
        ni0 ni0Var = new ni0(this, 7);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(view2, ni0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25521j5;
        int i12 = org.telegram.messenger.ns.f25504g5;
        if (i7 == i11 || i7 == i12) {
            y0(false);
            this.V.a();
        }
        if (i7 != org.telegram.messenger.ns.f25498f5 && i7 != i12) {
            return;
        }
        this.V.b();
        this.V.a();
        B0();
        this.f42975a.getAdapter().f();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.f29382c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.oa.a(new g6(16, this), org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, org.telegram.ui.ActionBar.j6.Ek, org.telegram.ui.ActionBar.j6.Fk, org.telegram.ui.ActionBar.j6.Gk, org.telegram.ui.ActionBar.j6.Hk, org.telegram.ui.ActionBar.j6.Ik, org.telegram.ui.ActionBar.j6.Jk, org.telegram.ui.ActionBar.j6.Kk, org.telegram.ui.ActionBar.j6.Mk, org.telegram.ui.ActionBar.j6.Nk, org.telegram.ui.ActionBar.j6.Lk, org.telegram.ui.ActionBar.j6.Qk);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f42988i0;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void o0() {
        dh.g gVar;
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f43007x0) != null) {
            this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f42995p0.d) - org.telegram.messenger.g0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f) + this.fragmentView.getMeasuredHeight());
            gVar.g(1, this.B0);
            gVar.e(this.A0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        A0(false);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (getMessagesController().D3()) {
            return false;
        }
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25521j5);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25498f5);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25504g5);
        if (getMediaDataController().E != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().E.videos;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TLRPC.Document document = arrayList.get(i7);
                i7++;
                org.telegram.messenger.w7.G(this.currentAccount).W(document, getMediaDataController().E, 3, 0);
            }
        }
        if (this.f42987h0 == 1) {
            kg.z1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25521j5);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25498f5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25504g5);
    }

    @Override
    public final void onPause() {
        di.xb xbVar;
        super.onPause();
        rs0 rs0Var = this.V;
        if (rs0Var != null && (xbVar = rs0Var.d) != null) {
            xbVar.setDialogVisible(true);
        }
        ug.s1 s1Var = this.W;
        if (s1Var != null) {
            s1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        di.xb xbVar;
        super.onResume();
        rs0 rs0Var = this.V;
        if (rs0Var != null && (xbVar = rs0Var.d) != null) {
            xbVar.setPaused(false);
            this.V.d.setDialogVisible(false);
        }
        this.W.setPaused(false);
        setBulletinDelegate(new y8(this, 7));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28922h5);
        Drawable drawable = this.J;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            ug.s1 s1Var = this.W;
            if (s1Var != null && s1Var.f58330a != null && this.f42983e0 != null) {
                z0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z10;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        A0(z10);
        return showDialog;
    }

    public final void x0() {
        rs0 rs0Var;
        if (this.f42983e0.getMeasuredWidth() != 0 && this.f42983e0.getMeasuredHeight() != 0 && (rs0Var = this.V) != null && rs0Var.d != null) {
            if (this.f42988i0) {
                int f10 = i0.a.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.j6.Dk), getThemedColor(org.telegram.ui.ActionBar.j6.f28922h5));
                di.xb xbVar = this.f43000s0;
                di.xb xbVar2 = this.V.d;
                if (xbVar != xbVar2 || this.f43001t0 != f10) {
                    this.f43000s0 = xbVar2;
                    this.f43001t0 = f10;
                    Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(f10);
                    this.V.d.setBackgroundBitmap(createBitmap);
                    return;
                }
                return;
            }
            int measuredWidth = this.f42983e0.getMeasuredWidth();
            int measuredHeight = this.f42983e0.getMeasuredHeight();
            ug.z0 z0Var = this.f42993n0;
            z0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.m0;
            canvas.save();
            canvas.scale(100.0f / this.f42983e0.getMeasuredWidth(), 100.0f / this.f42983e0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f42983e0.getMeasuredWidth(), this.f42983e0.getMeasuredHeight(), z0Var.f58392f);
            canvas.restore();
            this.V.d.setBackgroundBitmap(this.f42991l0);
        }
    }

    public final void y0(boolean z10) {
        if (this.f42985f0 != null) {
            boolean q10 = getUserConfig().q();
            ArrayList arrayList = this.d;
            if (!q10 || this.f42984f == null || this.f42982e >= arrayList.size() || ((ts0) arrayList.get(this.f42982e)).f51666a.months >= this.f42984f.f51666a.months) {
                if (org.telegram.messenger.hd.f24104a0) {
                    z10 = false;
                }
                if (!org.telegram.messenger.r2.b() && (!org.telegram.messenger.r1.i().k() || arrayList.isEmpty() || this.f42982e >= arrayList.size() || ((ts0) arrayList.get(this.f42982e)).f51670f == null)) {
                    this.f42985f0.b(org.telegram.messenger.hd.M0(2131748779, null), null, z10);
                    this.L.setOnClickListener(new bi.o(22));
                    this.f42985f0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.f42982e < arrayList.size()) {
                    this.f42985f0.b(t0(this.currentAccount, (ts0) arrayList.get(this.f42982e)), null, z10);
                    this.L.setOnClickListener(new g40(this, 25));
                    this.f42985f0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void z0() {
        int i7;
        int i10;
        vg.f fVar;
        if (this.V != null && this.actionBar != null) {
            boolean z10 = this.f42988i0;
            if (z10) {
                i7 = org.telegram.ui.ActionBar.j6.G6;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.Kk;
            }
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
            if (x02 != this.f43002u0) {
                this.f43002u0 = x02;
                this.actionBar.H(x02, true);
                this.actionBar.H(x02, false);
            }
            int i11 = org.telegram.ui.ActionBar.j6.Kk;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 60);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.f29308q0 != o4) {
                kVar.F(o4, false);
            }
            this.W.f58330a.g();
            rs0 rs0Var = this.V;
            if (rs0Var != null) {
                TextView textView = rs0Var.f51011a;
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.j6.G6;
                } else {
                    i10 = i11;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
                TextView textView2 = this.V.f51012b;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.j6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i11, false));
                di.xb xbVar = this.V.d;
                if (xbVar != null && (fVar = xbVar.f58893b) != null) {
                    if (z10) {
                        fVar.f58877z = org.telegram.ui.ActionBar.j6.Ok;
                        fVar.A = org.telegram.ui.ActionBar.j6.Pk;
                    }
                    fVar.b();
                }
            }
            x0();
        }
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
