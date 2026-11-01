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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public final ArrayList A0;
    public final RectF B0;
    public Drawable C0;
    public int D;
    public int D0;
    public int E;
    public int F;
    public int G;
    public int H;
    public Drawable I;
    public FrameLayout J;
    public FrameLayout K;
    public rt0 L;
    public kg.a2 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.az P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public cu0 U;
    public kg.g2 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.uk0 f33696a;
    public boolean f33697a0;
    public final ArrayList f33698b;
    public float f33699b0;
    public final ArrayList f33700c;
    public int f33701c0;
    public final ArrayList d;
    public ut0 f33702d0;
    public int e;
    public kg.x0 f33703e0;
    public eu0 f33704f;
    public float f33705f0;
    public final int f33706g0;
    public int h;
    public final boolean f33707h0;
    public final String f33708i0;
    public boolean f33709j0;
    public final Bitmap f33710k0;
    public final Canvas f33711l0;
    public final kg.k1 m0;
    public int f33712n;
    public final kg.k1 f33713n0;
    public i0.c f33714o0;
    public boolean f33715p0;
    public float f33716q0;
    public int f33717r;
    public kg.h f33718r0;
    public int f33719s;
    public int f33720s0;
    int showAdsRow;
    public int f33721t0;
    public wt0 f33722u0;
    public tg.c f33723v0;
    public int f33724w;
    public final tg.f f33725w0;
    public int f33726x;
    public final tg.b f33727x0;
    public int f33728y;
    public final tg.b f33729y0;
    public sa f33730z0;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.f33698b = new ArrayList();
        this.f33700c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f33710k0 = createBitmap;
        this.f33711l0 = new Canvas(createBitmap);
        this.m0 = new kg.k1(org.telegram.ui.ActionBar.t6.Dk, org.telegram.ui.ActionBar.t6.Ek, org.telegram.ui.ActionBar.t6.Fk, org.telegram.ui.ActionBar.t6.Gk, null);
        this.f33714o0 = i0.c.e;
        kg.k1 k1Var = new kg.k1(org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, -1, -1, null);
        this.f33713n0 = k1Var;
        k1Var.f11149m = true;
        k1Var.f11151o = 0.0f;
        k1Var.f11152p = 0.0f;
        k1Var.f11153q = 1.0f;
        k1Var.f11141b = 0.0f;
        k1Var.f11142c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.A0 = arrayList;
        RectF rectF = new RectF();
        this.B0 = rectF;
        arrayList.add(rectF);
        this.f33706g0 = i10;
        if (!org.telegram.ui.ActionBar.t6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.f33707h0 = z10;
        this.f33708i0 = str;
        m4.c cVar = new m4.c(this);
        if (Build.VERSION.SDK_INT >= 31) {
            tg.f fVar = new tg.f(true);
            this.f33725w0 = fVar;
            hi.f fVar2 = new hi.f(null);
            fVar2.d = fVar;
            fVar2.e = -3;
            fVar2.f7720f = cVar;
            this.f33727x0 = new tg.b(fVar2, fVar2, fVar2);
        } else {
            this.f33725w0 = null;
            this.f33727x0 = new tg.b(cVar, cVar, cVar);
        }
        this.f33729y0 = new tg.b(cVar, cVar, cVar);
    }

    public static void Z(PremiumPreviewFragment premiumPreviewFragment, View view, int i10) {
        eu0 eu0Var;
        boolean z10;
        org.telegram.ui.Components.d5 d5Var;
        rt0 rt0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i15 = premiumPreviewFragment.f33706g0;
        if (premiumPreviewFragment.getUserConfig().p()) {
            boolean z11 = false;
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull a2 = premiumPreviewFragment.getMessagesController().a2(premiumPreviewFragment.getUserConfig().e());
                if (a2 != null) {
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    p8Var.setChecked(!p8Var.d());
                    a2.sponsored_enabled = p8Var.d();
                    TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                    togglesponsoredmessages.enabled = a2.sponsored_enabled;
                    premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new k(premiumPreviewFragment, 18));
                    premiumPreviewFragment.getMessagesStorage().j2(a2, false);
                }
            } else if (view instanceof rt0) {
                rt0 rt0Var2 = (rt0) view;
                if (i15 == 1 && premiumPreviewFragment.getUserConfig().q()) {
                    int i16 = rt0Var2.f41152f.f36680a;
                    if (i16 == 29) {
                        premiumPreviewFragment.presentFragment(new ag.f2());
                        return;
                    } else if (i16 == 32) {
                        premiumPreviewFragment.presentFragment(new ag.v1());
                        return;
                    } else if (i16 == 33) {
                        ?? k2Var = new org.telegram.ui.ActionBar.k2(null);
                        k2Var.f506f = -4;
                        premiumPreviewFragment.presentFragment((org.telegram.ui.ActionBar.k2) k2Var);
                        return;
                    } else if (i16 == 30) {
                        premiumPreviewFragment.presentFragment(new ag.h2());
                        return;
                    } else if (i16 == 34) {
                        premiumPreviewFragment.presentFragment(new ag.t1());
                        return;
                    } else if (i16 == 31) {
                        premiumPreviewFragment.presentFragment(new ag.z2());
                        return;
                    } else if (i16 == 14) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("dialog_id", org.telegram.messenger.e20.i(premiumPreviewFragment.currentAccount).e());
                        bundle.putInt("type", 1);
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.n90(bundle, null));
                        return;
                    } else if (i16 == 12) {
                        Long h = org.telegram.messenger.i20.h(premiumPreviewFragment.getUserConfig().f());
                        ih.s sVar = new ih.s(15, premiumPreviewFragment, rt0Var2);
                        if (premiumPreviewFragment.f33722u0 == null) {
                            x21[] x21VarArr = new x21[1];
                            if (rt0Var2.getHeight() + rt0Var2.getTop() > premiumPreviewFragment.f33696a.getMeasuredHeight() / 2.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Point point = org.telegram.messenger.i0.f16172q;
                            int min = (int) Math.min(org.telegram.messenger.i0.L(330.0f), point.y * 0.75f);
                            int min2 = (int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f);
                            org.telegram.ui.Components.d5 d5Var2 = rt0Var2.h;
                            if (d5Var2 != null) {
                                Drawable[] drawableArr = d5Var2.f25372f;
                                Drawable drawable = drawableArr[1];
                                if (drawable != null) {
                                    if (drawable instanceof org.telegram.ui.Components.f5) {
                                        ((org.telegram.ui.Components.f5) drawable).o(d5Var2);
                                    }
                                    drawableArr[1] = null;
                                }
                                org.telegram.ui.Components.d5 d5Var3 = rt0Var2.h;
                                if (d5Var3 != null) {
                                    d5Var3.f();
                                    rt0Var2.c();
                                    Rect rect = org.telegram.messenger.i0.Q;
                                    rect.set(rt0Var2.h.getBounds());
                                    if (z10) {
                                        L = (org.telegram.messenger.i0.L(12.0f) + (-rect.centerY())) - min;
                                    } else {
                                        L = (-(rt0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                                    }
                                    i12 = rect.centerX() - (point.x - min2);
                                    d5Var = d5Var3;
                                    i11 = L;
                                } else {
                                    d5Var = d5Var3;
                                    i11 = 0;
                                    i12 = 0;
                                }
                                rt0Var = rt0Var2;
                            } else {
                                d5Var = null;
                                rt0Var = null;
                                i11 = 0;
                                i12 = 0;
                            }
                            if (z10) {
                                i13 = 12;
                            } else {
                                i13 = 0;
                            }
                            int i17 = i11;
                            Activity parentActivity = premiumPreviewFragment.getParentActivity();
                            Integer valueOf = Integer.valueOf(i12);
                            org.telegram.ui.ActionBar.p6 resourceProvider = premiumPreviewFragment.getResourceProvider();
                            if (z10) {
                                i14 = 24;
                            } else {
                                i14 = 16;
                            }
                            vt0 vt0Var = new vt0(premiumPreviewFragment, premiumPreviewFragment, parentActivity, valueOf, i13, resourceProvider, i14, sVar, x21VarArr);
                            vt0Var.f37304g1 = true;
                            vt0Var.setSelected(h);
                            vt0Var.setSaveState(3);
                            vt0Var.y(d5Var, rt0Var);
                            wt0 wt0Var = new wt0(premiumPreviewFragment, vt0Var);
                            premiumPreviewFragment.f33722u0 = wt0Var;
                            x21VarArr[0] = wt0Var;
                            wt0Var.showAsDropDown(rt0Var2, 0, i17, 53);
                            x21VarArr[0].b();
                            return;
                        }
                        return;
                    } else if (i16 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f33341f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i16 == 36) {
                        premiumPreviewFragment.presentFragment(new ag.w());
                        return;
                    } else if (i16 == 37) {
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.s51());
                        return;
                    } else {
                        return;
                    }
                }
                v0(premiumPreviewFragment.currentAccount, rt0Var2.f41152f.f36680a);
                int i18 = premiumPreviewFragment.e;
                if (i18 >= 0 && i18 < arrayList.size()) {
                    eu0Var = (eu0) arrayList.get(premiumPreviewFragment.e);
                } else {
                    eu0Var = null;
                }
                Activity parentActivity2 = premiumPreviewFragment.getParentActivity();
                int i19 = premiumPreviewFragment.currentAccount;
                if (i15 == 1) {
                    z11 = true;
                }
                premiumPreviewFragment.showDialog(new kg.i1(premiumPreviewFragment, parentActivity2, i19, z11, rt0Var2.f41152f.f36680a, false, eu0Var));
            }
        }
    }

    public static org.telegram.ui.ActionBar.l j0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void p0(org.telegram.ui.ActionBar.k2 k2Var, eu0 eu0Var, String str, ba.a aVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z10 = org.telegram.messenger.v2.f18578a;
        if (k2Var == null) {
            currentAccount = org.telegram.messenger.e20.f15506s0;
        } else {
            currentAccount = k2Var.getCurrentAccount();
        }
        int i10 = currentAccount;
        if (org.telegram.messenger.wp.r1(i10).u2()) {
            b.b(i10);
            return;
        }
        if (eu0Var == null && (tL_help_premiumPromo = org.telegram.messenger.vi.b0(i10).D) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i11);
                i11++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i12 = tL_premiumSubscriptionOption3.months;
                if (i12 == 1) {
                    eu0Var = new eu0(tL_premiumSubscriptionOption3);
                } else if (i12 == 12) {
                    eu0Var = new eu0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        eu0 eu0Var2 = eu0Var;
        u0();
        if (org.telegram.messenger.v2.b()) {
            if (k2Var != null) {
                activity = k2Var.getParentActivity();
            } else {
                activity = LaunchActivity.I1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (eu0Var2 != null && (tL_premiumSubscriptionOption = eu0Var2.f36910a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.Y0 = true;
                    }
                    gf.f.r(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
                if (!TextUtils.isEmpty(r12.f19252t6)) {
                    launchActivity.Y0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + r12.f19252t6 + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(r12.f19261u6)) {
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + r12.f19261u6)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        c5.m mVar = org.telegram.messenger.u1.f18338l;
        if (mVar != null && !mVar.h.isEmpty()) {
            if (eu0Var2.f36913f == null) {
                eu0Var2.f36913f = org.telegram.messenger.u1.f18338l;
            }
            eu0Var2.a();
            if (eu0Var2.f36914g == null) {
                return;
            }
            org.telegram.messenger.u1.i().p("subs", new mg.i0(k2Var, i10, aVar, eu0Var2, 8));
        }
    }

    public static String q0(int i10) {
        switch (i10) {
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

    public static void r0(int i10, ArrayList arrayList, boolean z10) {
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        SparseIntArray sparseIntArray = r12.O0;
        if (!z10) {
            arrayList.add(new du0(29, 2131231129, org.telegram.messenger.dd.L0(2131747068, null), org.telegram.messenger.dd.L0(2131747067, null)));
            arrayList.add(new du0(30, 2131231148, org.telegram.messenger.dd.L0(2131747066, null), org.telegram.messenger.dd.L0(2131747065, null)));
            arrayList.add(new du0(31, 2131231133, org.telegram.messenger.dd.L0(2131747064, null), org.telegram.messenger.dd.L0(2131747063, null)));
            arrayList.add(new du0(32, 2131232568, org.telegram.messenger.dd.L0(2131747072, null), org.telegram.messenger.dd.L0(2131747071, null)));
            arrayList.add(new du0(33, 2131231143, org.telegram.messenger.dd.L0(2131747079, null), org.telegram.messenger.dd.L0(2131747078, null)));
            arrayList.add(new du0(34, 2131231144, org.telegram.messenger.dd.L0(2131747074, null), org.telegram.messenger.dd.L0(2131747073, null)));
            arrayList.add(new du0(37, 2131231147, org.telegram.messenger.dd.L0(2131747077, null), org.telegram.messenger.dd.L0(2131747076, null)));
            arrayList.add(new du0(36, 2131231149, org.telegram.messenger.dd.L0(2131747070, null), org.telegram.messenger.dd.L0(2131747069, null)));
        } else {
            arrayList.add(new du0(12, 2131231150, org.telegram.messenger.dd.L0(2131747031, null), org.telegram.messenger.dd.L0(2131747030, null)));
            arrayList.add(new du0(35, 2131232569, org.telegram.messenger.dd.L0(2131747017, null), org.telegram.messenger.dd.L0(2131747016, null)));
            arrayList.add(new du0(14, 2131231146, org.telegram.messenger.dd.L0(2131747029, null), org.telegram.messenger.dd.L0(2131747028, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((du0) arrayList.get(i11)).f36680a, -1) == -1) {
                    boolean z11 = org.telegram.messenger.v2.f18578a;
                }
            }
        }
        Collections.sort(arrayList, new tt0(r12, 0));
    }

    public static void s0(int i10, ArrayList arrayList) {
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        arrayList.add(new du0(0, 2131232305, org.telegram.messenger.dd.L0(2131747013, null), org.telegram.messenger.dd.a0(null, null, 2131747012, Integer.valueOf(r12.F4), Integer.valueOf(r12.N4), Integer.valueOf(r12.R4), Integer.valueOf(r12.T4), 4)));
        arrayList.add(new du0(14, 2131232153, org.telegram.messenger.dd.L0(2131746989, null), org.telegram.messenger.dd.a0(null, null, 2131746988, new Object[0])));
        arrayList.add(new du0(1, 2131232314, org.telegram.messenger.dd.L0(2131746979, null), org.telegram.messenger.dd.L0(2131746978, null)));
        arrayList.add(new du0(2, 2131232311, org.telegram.messenger.dd.L0(2131747027, null), org.telegram.messenger.dd.L0(2131747026, null)));
        arrayList.add(new du0(8, 2131232315, org.telegram.messenger.dd.L0(2131746977, null), org.telegram.messenger.dd.L0(2131746976, null)));
        arrayList.add(new du0(3, 2131232300, org.telegram.messenger.dd.L0(2131747007, null), org.telegram.messenger.dd.L0(2131747006, null)));
        arrayList.add(new du0(4, 2131232310, org.telegram.messenger.dd.L0(2131746997, null), org.telegram.messenger.dd.L0(2131746996, null)));
        arrayList.add(new du0(5, 2131232312, org.telegram.messenger.dd.L0(2131746991, null), org.telegram.messenger.dd.L0(2131746990, null)));
        arrayList.add(new du0(11, 2131232303, org.telegram.messenger.dd.L0(2131747022, null), org.telegram.messenger.dd.L0(2131747021, null)));
        arrayList.add(new du0(9, 2131231858, org.telegram.messenger.dd.L0(2131747040, null), org.telegram.messenger.dd.L0(2131747039, null)));
        arrayList.add(new du0(6, 2131232302, org.telegram.messenger.dd.L0(2131747002, null), org.telegram.messenger.dd.L0(2131747001, null)));
        arrayList.add(new du0(27, 2131231131, org.telegram.messenger.dd.L0(2131747004, null), org.telegram.messenger.dd.L0(2131747003, null)));
        arrayList.add(new du0(7, 2131232301, org.telegram.messenger.dd.L0(2131747037, null), org.telegram.messenger.dd.L0(2131747036, null)));
        arrayList.add(new du0(24, 2131232569, org.telegram.messenger.dd.L0(2131746986, null), org.telegram.messenger.dd.L0(2131746984, null)));
        arrayList.add(new du0(10, 2131232304, org.telegram.messenger.dd.L0(2131747035, null), org.telegram.messenger.dd.L0(2131747034, null)));
        arrayList.add(new du0(12, 2131232568, org.telegram.messenger.dd.L0(2131747019, null), org.telegram.messenger.dd.L0(2131747018, null)));
        arrayList.add(new du0(13, 2131232313, org.telegram.messenger.dd.L0(2131746981, null), org.telegram.messenger.dd.L0(2131746980, null)));
        arrayList.add(new du0(22, 2131232570, org.telegram.messenger.dd.L0(2131746974, null), org.telegram.messenger.dd.L0(2131746973, null)));
        arrayList.add(new du0(23, 2131232566, org.telegram.messenger.dd.L0(2131747000, null), org.telegram.messenger.dd.L0(2131746999, null)));
        arrayList.add(new du0(26, 2131231857, org.telegram.messenger.dd.L0(2131747015, null), org.telegram.messenger.dd.L0(2131747014, null)));
        arrayList.add(new du0(28, 2131231145, org.telegram.messenger.dd.L0(2131744277, null), org.telegram.messenger.dd.L0(2131747032, null)));
        arrayList.add(new du0(38, 2131231854, org.telegram.messenger.dd.L0(2131747024, null), org.telegram.messenger.dd.L0(2131747023, null)));
        arrayList.add(new du0(39, 2131232304, org.telegram.messenger.dd.L0(2131746983, null), org.telegram.messenger.dd.L0(2131746982, null)));
        arrayList.add(new du0(41, 2131231170, org.telegram.messenger.dd.L0(2131746993, null), org.telegram.messenger.dd.L0(2131746992, null)));
        arrayList.add(new du0(42, 2131232565, org.telegram.messenger.dd.L0(2131747042, null), org.telegram.messenger.dd.L0(2131747041, null)));
        arrayList.add(new du0(43, 2131232567, org.telegram.messenger.dd.L0(2131746995, null), org.telegram.messenger.dd.L0(2131746994, null)));
        SparseIntArray sparseIntArray = r12.N0;
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((du0) arrayList.get(i11)).f36680a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.v2.f18578a;
                }
            }
        }
        Collections.sort(arrayList, new tt0(r12, 1));
    }

    public static java.lang.String t0(int r17, org.telegram.ui.eu0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.t0(int, org.telegram.ui.eu0):java.lang.String");
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0).sendRequest(tL_help_saveAppLog, new ag.c3(4));
    }

    public static void v0(int i10, int i11) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String q02 = q0(i11);
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new ag.c3(4));
    }

    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new ag.c3(4));
    }

    public final void A0(boolean z10) {
        kg.h hVar;
        if (z10 != this.Z) {
            this.Z = z10;
            cu0 cu0Var = this.U;
            if (cu0Var != null && (hVar = cu0Var.d) != null) {
                hVar.setDialogVisible(z10);
            }
            this.V.setPaused(z10);
            this.f33702d0.invalidate();
        }
    }

    public final void B0() {
        boolean z10;
        eu0 eu0Var;
        this.f33728y = -1;
        this.E = -1;
        this.f33719s = -1;
        this.f33724w = -1;
        this.f33726x = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        this.h = 1;
        this.f33712n = 1;
        int size = this.f33698b.size() + 1;
        this.h = size;
        this.f33717r = size;
        int i10 = this.f33706g0;
        if (i10 == 1 && getUserConfig().q()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.f33728y = i11;
            int i13 = i11 + 2;
            this.h = i13;
            this.f33719s = i12;
            this.f33724w = i13;
            int size2 = this.f33700c.size() + i13;
            this.h = size2;
            this.f33726x = size2;
        }
        int i14 = this.h;
        this.D = i14;
        this.h = i14 + 2;
        this.F = i14 + 1;
        if (i10 == 1 && getUserConfig().q()) {
            int i15 = this.h;
            this.G = i15;
            this.showAdsRow = i15 + 1;
            this.h = i15 + 3;
            this.H = i15 + 2;
        }
        FrameLayout frameLayout = this.J;
        int i16 = 0;
        if (getUserConfig().q() && ((eu0Var = this.f33704f) == null || eu0Var.f36910a.months >= ((eu0) this.d.get(this.e)).f36910a.months || this.f33715p0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.messenger.i0.Y3(frameLayout, z10, 1.0f, true, false);
        if (this.J.getVisibility() == 0) {
            i16 = org.telegram.messenger.i0.L(64.0f);
        }
        org.telegram.ui.Components.az azVar = this.P;
        azVar.M = (this.X + i16) - org.telegram.messenger.i0.L(16.0f);
        azVar.p1();
        this.P.S = i16;
    }

    @Override
    public final boolean canBeginSlide() {
        kg.h hVar;
        cu0 cu0Var = this.U;
        if (cu0Var != null && (hVar = cu0Var.d) != null && hVar.f11918a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.f33730z0 = new sa(this, 2);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ck, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bk, false);
        int i10 = org.telegram.ui.ActionBar.t6.Ak;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.yk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new rt0(context, null);
        this.M = new kg.a2(context);
        ArrayList arrayList = this.f33698b;
        arrayList.clear();
        ArrayList arrayList2 = this.f33700c;
        arrayList2.clear();
        int i11 = this.f33706g0;
        if (i11 == 0) {
            s0(this.currentAccount, arrayList);
        } else {
            r0(this.currentAccount, arrayList, false);
            r0(this.currentAccount, arrayList2, true);
            ag.i3.f(this.currentAccount).h();
            if (getUserConfig().q()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                org.telegram.messenger.vi.b0(this.currentAccount).m0(tL_inputStickerSetShortName, false);
                ag.k.a(this.currentAccount).c(null);
                if (getMessagesController().V0.isEmpty()) {
                    getMessagesController().b3();
                }
                ag.s0 d = ag.s0.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable f7 = i0.a.f(context, 2131232725);
        this.I = f7;
        f7.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.t6.f21002h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = org.telegram.messenger.i0.f16166m;
        this.f33702d0 = new ut0(this, context);
        zg.h hVar = new zg.h(this.f33702d0);
        ut0 ut0Var = this.f33702d0;
        tg.b bVar = this.f33727x0;
        bVar.h = hVar;
        bVar.f48713i = ut0Var;
        zg.h hVar2 = new zg.h(this.f33702d0);
        ut0 ut0Var2 = this.f33702d0;
        tg.b bVar2 = this.f33729y0;
        bVar2.h = hVar2;
        bVar2.f48713i = ut0Var2;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f33696a = uk0Var;
        uk0Var.setClipToOutline(true);
        this.f33696a.setOutlineProvider(new ol(this, 7));
        this.f33696a.D0(new st0(this, 1));
        this.f33696a.setCaptureSectionsDecoratorAllowed(true);
        this.f33696a.setLegacySections(true);
        this.f33696a.setSections(true);
        this.f33696a.setClipToPadding(false);
        org.telegram.ui.Components.uk0 uk0Var2 = this.f33696a;
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az((org.telegram.messenger.i0.L(68.0f) + this.X) - org.telegram.messenger.i0.L(16.0f), this.f33696a);
        this.P = azVar;
        uk0Var2.setLayoutManager(azVar);
        this.P.R = true;
        this.f33696a.setAdapter(new xt0(this));
        this.f33696a.j(new h3(this, 25));
        this.U = new cu0(this, context);
        kg.g2 g2Var = new kg.g2(context);
        this.V = g2Var;
        g2Var.c();
        if (i11 == 1) {
            if (this.f33707h0) {
                kg.f2 f2Var = this.V.f11093a;
                f2Var.f11082q = true;
                f2Var.K = false;
                f2Var.H = true;
                f2Var.J = true;
                f2Var.f11076k = org.telegram.messenger.i0.L(-14.0f);
                kg.f2 f2Var2 = this.V.f11093a;
                f2Var2.f11088x = 2000L;
                f2Var2.f11089y = 3000;
                f2Var2.f11083r = 16;
                f2Var2.G = false;
                f2Var2.O = 28;
                f2Var2.Q = i10;
            } else {
                kg.f2 f2Var3 = this.V.f11093a;
                f2Var3.J = true;
                f2Var3.f11076k = org.telegram.messenger.i0.L(28.0f);
                kg.f2 f2Var4 = this.V.f11093a;
                f2Var4.f11088x = 2000L;
                f2Var4.f11089y = 3000;
                f2Var4.f11083r = 16;
                f2Var4.G = false;
                f2Var4.O = 28;
            }
        }
        this.U.d.setStarParticlesView(this.V);
        this.f33702d0.addView(this.V, w7.b6.c(-2.0f, -1));
        this.f33702d0.addView(this.U, w7.b6.c(-2.0f, -1));
        this.f33696a.setOnItemClickListener(new g(this, 24));
        this.f33702d0.addView(this.f33696a, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.K = new FrameLayout(context);
        kg.x0 x0Var = new kg.x0(context, getResourceProvider(), false);
        this.f33703e0 = x0Var;
        x0Var.K = true;
        x0Var.setClickable(false);
        x0Var.f11332w.setClickable(false);
        x0Var.setStateListAnimator(null);
        y0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.K.addView(this.f33703e0, w7.b6.c(-1.0f, -1));
        View view = this.K;
        vg.f c10 = bVar.c(view, null, false);
        c10.o(w7.b9.j(this.resourceProvider));
        c10.q(org.telegram.messenger.i0.L(28.0f));
        c10.p(org.telegram.messenger.i0.L(5.0f));
        view.setBackground(c10);
        w7.e6.b(this.K, 0.02f, 1.5f);
        this.J.addView(this.K, w7.b6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        tg.c cVar = new tg.c(bVar.c(this.J, null, false));
        cVar.b(org.telegram.messenger.i0.L(40.0f), false);
        this.f33723v0 = new tg.c(bVar.c(this.f33702d0, null, false));
        this.J.setBackground(cVar);
        if (getUserConfig().p()) {
            this.f33702d0.addView(this.J, w7.b6.e(-1, -2, 80));
        }
        this.fragmentView = this.f33702d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.actionBar.setBackButtonImage(2131231242);
        } else {
            this.actionBar.setBackButtonImage(2131231241);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 19));
        this.actionBar.setForceSkipTouches(true);
        this.f33702d0.addView(this.actionBar, w7.b6.e(-1, -2, 48));
        z0();
        B0();
        this.U.d.m(200L);
        if (this.f33715p0) {
            org.telegram.messenger.i0.h3(new st0(this, 2), 400L);
        }
        org.telegram.messenger.vi.b0(this.currentAccount).o1();
        w0(this.f33708i0);
        View view2 = this.fragmentView;
        rj0 rj0Var = new rj0(this, 8);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(view2, rj0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.f14733j5;
        int i13 = org.telegram.messenger.at.f14715g5;
        if (i10 == i12 || i10 == i13) {
            y0(false);
            this.U.a();
        }
        if (i10 != org.telegram.messenger.at.f14709f5 && i10 != i13) {
            return;
        }
        this.U.b();
        this.U.a();
        B0();
        this.f33696a.getAdapter().f();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.t3.f20864c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(16, this), org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, org.telegram.ui.ActionBar.t6.Bk, org.telegram.ui.ActionBar.t6.Ck, org.telegram.ui.ActionBar.t6.Dk, org.telegram.ui.ActionBar.t6.Ek, org.telegram.ui.ActionBar.t6.Fk, org.telegram.ui.ActionBar.t6.Gk, org.telegram.ui.ActionBar.t6.Hk, org.telegram.ui.ActionBar.t6.Jk, org.telegram.ui.ActionBar.t6.Kk, org.telegram.ui.ActionBar.t6.Ik, org.telegram.ui.ActionBar.t6.Nk);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f33707h0;
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
        tg.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f33725w0) != null) {
            this.B0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f33714o0.d) - org.telegram.messenger.i0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.i0.L(48.0f) + this.fragmentView.getMeasuredHeight());
            fVar.g(1, this.A0);
            fVar.e(this.f33730z0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        A0(false);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (getMessagesController().A3()) {
            return false;
        }
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14733j5);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14709f5);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14715g5);
        if (getMediaDataController().D != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().D.videos;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Document document = arrayList.get(i10);
                i10++;
                org.telegram.messenger.b8.G(this.currentAccount).X(document, getMediaDataController().D, 3, 0);
            }
        }
        if (this.f33706g0 == 1) {
            ag.n3.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14733j5);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14709f5);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14715g5);
    }

    @Override
    public final void onPause() {
        kg.h hVar;
        super.onPause();
        cu0 cu0Var = this.U;
        if (cu0Var != null && (hVar = cu0Var.d) != null) {
            hVar.setDialogVisible(true);
        }
        kg.g2 g2Var = this.V;
        if (g2Var != null) {
            g2Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        kg.h hVar;
        super.onResume();
        cu0 cu0Var = this.U;
        if (cu0Var != null && (hVar = cu0Var.d) != null) {
            hVar.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new z8(this, 7));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f21002h5);
        Drawable drawable = this.I;
        if (drawable != null && (drawable != this.C0 || themedColor != this.D0)) {
            this.C0 = drawable;
            this.D0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            kg.g2 g2Var = this.V;
            if (g2Var != null && g2Var.f11093a != null && this.f33702d0 != null) {
                z0();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
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
        cu0 cu0Var;
        if (this.f33702d0.getMeasuredWidth() != 0 && this.f33702d0.getMeasuredHeight() != 0 && (cu0Var = this.U) != null && cu0Var.d != null) {
            if (this.f33707h0) {
                int f7 = i0.b.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.t6.Ak), getThemedColor(org.telegram.ui.ActionBar.t6.f21002h5));
                kg.h hVar = this.f33718r0;
                kg.h hVar2 = this.U.d;
                if (hVar != hVar2 || this.f33720s0 != f7) {
                    this.f33718r0 = hVar2;
                    this.f33720s0 = f7;
                    Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(f7);
                    this.U.d.setBackgroundBitmap(createBitmap);
                    return;
                }
                return;
            }
            int measuredWidth = this.f33702d0.getMeasuredWidth();
            int measuredHeight = this.f33702d0.getMeasuredHeight();
            kg.k1 k1Var = this.m0;
            k1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f33711l0;
            canvas.save();
            canvas.scale(100.0f / this.f33702d0.getMeasuredWidth(), 100.0f / this.f33702d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f33702d0.getMeasuredWidth(), this.f33702d0.getMeasuredHeight(), k1Var.f11143f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.f33710k0);
        }
    }

    public final void y0(boolean z10) {
        if (this.f33703e0 != null) {
            boolean q6 = getUserConfig().q();
            ArrayList arrayList = this.d;
            if (!q6 || this.f33704f == null || this.e >= arrayList.size() || ((eu0) arrayList.get(this.e)).f36910a.months >= this.f33704f.f36910a.months) {
                if (org.telegram.messenger.dd.X) {
                    z10 = false;
                }
                if (!org.telegram.messenger.v2.b() && (!org.telegram.messenger.u1.i().k() || arrayList.isEmpty() || this.e >= arrayList.size() || ((eu0) arrayList.get(this.e)).f36913f == null)) {
                    this.f33703e0.b(org.telegram.messenger.dd.L0(2131748789, null), null, z10);
                    this.K.setOnClickListener(new bh.c(17));
                    this.f33703e0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.e < arrayList.size()) {
                    this.f33703e0.b(t0(this.currentAccount, (eu0) arrayList.get(this.e)), null, z10);
                    this.K.setOnClickListener(new e50(this, 25));
                    this.f33703e0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void z0() {
        int i10;
        int i11;
        lg.h hVar;
        if (this.U != null && this.actionBar != null) {
            boolean z10 = this.f33707h0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.t6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Hk;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            if (x02 != this.f33721t0) {
                this.f33721t0 = x02;
                this.actionBar.D(x02, true);
                this.actionBar.D(x02, false);
            }
            int i12 = org.telegram.ui.ActionBar.t6.Hk;
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 60);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar.f20502p0 != o10) {
                lVar.C(o10, false);
            }
            this.V.f11093a.g();
            cu0 cu0Var = this.U;
            if (cu0Var != null) {
                TextView textView = cu0Var.f36409a;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.t6.G6;
                } else {
                    i11 = i12;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                TextView textView2 = this.U.f36410b;
                if (z10) {
                    i12 = org.telegram.ui.ActionBar.t6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
                kg.h hVar2 = this.U.d;
                if (hVar2 != null && (hVar = hVar2.f11920b) != null) {
                    if (z10) {
                        hVar.f11898z = org.telegram.ui.ActionBar.t6.Lk;
                        hVar.A = org.telegram.ui.ActionBar.t6.Mk;
                    }
                    hVar.b();
                }
            }
            x0();
        }
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
