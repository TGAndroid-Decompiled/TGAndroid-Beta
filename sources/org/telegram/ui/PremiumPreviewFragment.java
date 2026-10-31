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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public st0 L;
    public kg.a2 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.az P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public du0 U;
    public kg.g2 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.tk0 f33689a;
    public boolean f33690a0;
    public final ArrayList f33691b;
    public float f33692b0;
    public final ArrayList f33693c;
    public int f33694c0;
    public final ArrayList d;
    public vt0 f33695d0;
    public int e;
    public kg.x0 f33696e0;
    public fu0 f33697f;
    public float f33698f0;
    public final int f33699g0;
    public int h;
    public final boolean f33700h0;
    public final String f33701i0;
    public boolean f33702j0;
    public final Bitmap f33703k0;
    public final Canvas f33704l0;
    public final kg.k1 m0;
    public int f33705n;
    public final kg.k1 f33706n0;
    public i0.c f33707o0;
    public boolean f33708p0;
    public float f33709q0;
    public int f33710r;
    public kg.h f33711r0;
    public int f33712s;
    public int f33713s0;
    int showAdsRow;
    public int f33714t0;
    public xt0 f33715u0;
    public tg.c f33716v0;
    public int f33717w;
    public final tg.f f33718w0;
    public int f33719x;
    public final tg.b f33720x0;
    public int f33721y;
    public final tg.b f33722y0;
    public sa f33723z0;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.f33691b = new ArrayList();
        this.f33693c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f33703k0 = createBitmap;
        this.f33704l0 = new Canvas(createBitmap);
        this.m0 = new kg.k1(org.telegram.ui.ActionBar.t6.Dk, org.telegram.ui.ActionBar.t6.Ek, org.telegram.ui.ActionBar.t6.Fk, org.telegram.ui.ActionBar.t6.Gk, null);
        this.f33707o0 = i0.c.e;
        kg.k1 k1Var = new kg.k1(org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, -1, -1, null);
        this.f33706n0 = k1Var;
        k1Var.f11148m = true;
        k1Var.f11150o = 0.0f;
        k1Var.f11151p = 0.0f;
        k1Var.f11152q = 1.0f;
        k1Var.f11140b = 0.0f;
        k1Var.f11141c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.A0 = arrayList;
        RectF rectF = new RectF();
        this.B0 = rectF;
        arrayList.add(rectF);
        this.f33699g0 = i10;
        if (!org.telegram.ui.ActionBar.t6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.f33700h0 = z10;
        this.f33701i0 = str;
        m4.c cVar = new m4.c(this);
        if (Build.VERSION.SDK_INT >= 31) {
            tg.f fVar = new tg.f(true);
            this.f33718w0 = fVar;
            hi.f fVar2 = new hi.f(null);
            fVar2.d = fVar;
            fVar2.e = -3;
            fVar2.f7719f = cVar;
            this.f33720x0 = new tg.b(fVar2);
        } else {
            this.f33718w0 = null;
            this.f33720x0 = new tg.b(cVar);
        }
        this.f33722y0 = new tg.b(cVar);
    }

    public static void Y(PremiumPreviewFragment premiumPreviewFragment, View view, int i10) {
        fu0 fu0Var;
        boolean z10;
        org.telegram.ui.Components.d5 d5Var;
        st0 st0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i15 = premiumPreviewFragment.f33699g0;
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
            } else if (view instanceof st0) {
                st0 st0Var2 = (st0) view;
                if (i15 == 1 && premiumPreviewFragment.getUserConfig().q()) {
                    int i16 = st0Var2.f41647f.f37112a;
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
                        bundle.putLong("dialog_id", org.telegram.messenger.d20.i(premiumPreviewFragment.currentAccount).e());
                        bundle.putInt("type", 1);
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.n90(bundle, null));
                        return;
                    } else if (i16 == 12) {
                        Long h = org.telegram.messenger.h20.h(premiumPreviewFragment.getUserConfig().f());
                        ih.s sVar = new ih.s(15, premiumPreviewFragment, st0Var2);
                        if (premiumPreviewFragment.f33715u0 == null) {
                            z21[] z21VarArr = new z21[1];
                            if (st0Var2.getHeight() + st0Var2.getTop() > premiumPreviewFragment.f33689a.getMeasuredHeight() / 2.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Point point = org.telegram.messenger.i0.f16026q;
                            int min = (int) Math.min(org.telegram.messenger.i0.L(330.0f), point.y * 0.75f);
                            int min2 = (int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f);
                            org.telegram.ui.Components.d5 d5Var2 = st0Var2.h;
                            if (d5Var2 != null) {
                                Drawable[] drawableArr = d5Var2.f25301f;
                                Drawable drawable = drawableArr[1];
                                if (drawable != null) {
                                    if (drawable instanceof org.telegram.ui.Components.f5) {
                                        ((org.telegram.ui.Components.f5) drawable).o(d5Var2);
                                    }
                                    drawableArr[1] = null;
                                }
                                org.telegram.ui.Components.d5 d5Var3 = st0Var2.h;
                                if (d5Var3 != null) {
                                    d5Var3.f();
                                    st0Var2.c();
                                    Rect rect = org.telegram.messenger.i0.Q;
                                    rect.set(st0Var2.h.getBounds());
                                    if (z10) {
                                        L = (org.telegram.messenger.i0.L(12.0f) + (-rect.centerY())) - min;
                                    } else {
                                        L = (-(st0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                                    }
                                    i12 = rect.centerX() - (point.x - min2);
                                    d5Var = d5Var3;
                                    i11 = L;
                                } else {
                                    d5Var = d5Var3;
                                    i11 = 0;
                                    i12 = 0;
                                }
                                st0Var = st0Var2;
                            } else {
                                d5Var = null;
                                st0Var = null;
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
                            wt0 wt0Var = new wt0(premiumPreviewFragment, premiumPreviewFragment, parentActivity, valueOf, i13, resourceProvider, i14, sVar, z21VarArr);
                            wt0Var.f38128g1 = true;
                            wt0Var.setSelected(h);
                            wt0Var.setSaveState(3);
                            wt0Var.y(d5Var, st0Var);
                            xt0 xt0Var = new xt0(premiumPreviewFragment, wt0Var);
                            premiumPreviewFragment.f33715u0 = xt0Var;
                            z21VarArr[0] = xt0Var;
                            xt0Var.showAsDropDown(st0Var2, 0, i17, 53);
                            z21VarArr[0].b();
                            return;
                        }
                        return;
                    } else if (i16 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f33334f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i16 == 36) {
                        premiumPreviewFragment.presentFragment(new ag.w());
                        return;
                    } else if (i16 == 37) {
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.r51());
                        return;
                    } else {
                        return;
                    }
                }
                u0(premiumPreviewFragment.currentAccount, st0Var2.f41647f.f37112a);
                int i18 = premiumPreviewFragment.e;
                if (i18 >= 0 && i18 < arrayList.size()) {
                    fu0Var = (fu0) arrayList.get(premiumPreviewFragment.e);
                } else {
                    fu0Var = null;
                }
                Activity parentActivity2 = premiumPreviewFragment.getParentActivity();
                int i19 = premiumPreviewFragment.currentAccount;
                if (i15 == 1) {
                    z11 = true;
                }
                premiumPreviewFragment.showDialog(new kg.i1(premiumPreviewFragment, parentActivity2, i19, z11, st0Var2.f41647f.f37112a, false, fu0Var));
            }
        }
    }

    public static org.telegram.ui.ActionBar.l i0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void o0(org.telegram.ui.ActionBar.k2 k2Var, fu0 fu0Var, String str, ba.a aVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z10 = org.telegram.messenger.v2.f18448a;
        if (k2Var == null) {
            currentAccount = org.telegram.messenger.d20.f15147s0;
        } else {
            currentAccount = k2Var.getCurrentAccount();
        }
        int i10 = currentAccount;
        if (org.telegram.messenger.vp.r1(i10).u2()) {
            b.b(i10);
            return;
        }
        if (fu0Var == null && (tL_help_premiumPromo = org.telegram.messenger.ui.b0(i10).D) != null) {
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
                    fu0Var = new fu0(tL_premiumSubscriptionOption3);
                } else if (i12 == 12) {
                    fu0Var = new fu0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        fu0 fu0Var2 = fu0Var;
        t0();
        if (org.telegram.messenger.v2.b()) {
            if (k2Var != null) {
                activity = k2Var.getParentActivity();
            } else {
                activity = LaunchActivity.I1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (fu0Var2 != null && (tL_premiumSubscriptionOption = fu0Var2.f37348a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.Y0 = true;
                    }
                    gf.f.r(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
                if (!TextUtils.isEmpty(r12.f18909t6)) {
                    launchActivity.Y0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + r12.f18909t6 + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(r12.f18918u6)) {
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + r12.f18918u6)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        c5.m mVar = org.telegram.messenger.u1.f18210l;
        if (mVar != null && !mVar.h.isEmpty()) {
            if (fu0Var2.f37351f == null) {
                fu0Var2.f37351f = org.telegram.messenger.u1.f18210l;
            }
            fu0Var2.a();
            if (fu0Var2.f37352g == null) {
                return;
            }
            org.telegram.messenger.u1.i().p("subs", new mg.i0(k2Var, i10, aVar, fu0Var2, 8));
        }
    }

    public static String p0(int i10) {
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

    public static void q0(int i10, ArrayList arrayList, boolean z10) {
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        SparseIntArray sparseIntArray = r12.O0;
        if (!z10) {
            arrayList.add(new eu0(29, 2131231129, org.telegram.messenger.cd.L0(2131747068, null), org.telegram.messenger.cd.L0(2131747067, null)));
            arrayList.add(new eu0(30, 2131231148, org.telegram.messenger.cd.L0(2131747066, null), org.telegram.messenger.cd.L0(2131747065, null)));
            arrayList.add(new eu0(31, 2131231133, org.telegram.messenger.cd.L0(2131747064, null), org.telegram.messenger.cd.L0(2131747063, null)));
            arrayList.add(new eu0(32, 2131232568, org.telegram.messenger.cd.L0(2131747072, null), org.telegram.messenger.cd.L0(2131747071, null)));
            arrayList.add(new eu0(33, 2131231143, org.telegram.messenger.cd.L0(2131747079, null), org.telegram.messenger.cd.L0(2131747078, null)));
            arrayList.add(new eu0(34, 2131231144, org.telegram.messenger.cd.L0(2131747074, null), org.telegram.messenger.cd.L0(2131747073, null)));
            arrayList.add(new eu0(37, 2131231147, org.telegram.messenger.cd.L0(2131747077, null), org.telegram.messenger.cd.L0(2131747076, null)));
            arrayList.add(new eu0(36, 2131231149, org.telegram.messenger.cd.L0(2131747070, null), org.telegram.messenger.cd.L0(2131747069, null)));
        } else {
            arrayList.add(new eu0(12, 2131231150, org.telegram.messenger.cd.L0(2131747031, null), org.telegram.messenger.cd.L0(2131747030, null)));
            arrayList.add(new eu0(35, 2131232569, org.telegram.messenger.cd.L0(2131747017, null), org.telegram.messenger.cd.L0(2131747016, null)));
            arrayList.add(new eu0(14, 2131231146, org.telegram.messenger.cd.L0(2131747029, null), org.telegram.messenger.cd.L0(2131747028, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((eu0) arrayList.get(i11)).f37112a, -1) == -1) {
                    boolean z11 = org.telegram.messenger.v2.f18448a;
                }
            }
        }
        Collections.sort(arrayList, new ut0(r12, 0));
    }

    public static void r0(int i10, ArrayList arrayList) {
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        arrayList.add(new eu0(0, 2131232305, org.telegram.messenger.cd.L0(2131747013, null), org.telegram.messenger.cd.a0(null, null, 2131747012, Integer.valueOf(r12.F4), Integer.valueOf(r12.N4), Integer.valueOf(r12.R4), Integer.valueOf(r12.T4), 4)));
        arrayList.add(new eu0(14, 2131232153, org.telegram.messenger.cd.L0(2131746989, null), org.telegram.messenger.cd.a0(null, null, 2131746988, new Object[0])));
        arrayList.add(new eu0(1, 2131232314, org.telegram.messenger.cd.L0(2131746979, null), org.telegram.messenger.cd.L0(2131746978, null)));
        arrayList.add(new eu0(2, 2131232311, org.telegram.messenger.cd.L0(2131747027, null), org.telegram.messenger.cd.L0(2131747026, null)));
        arrayList.add(new eu0(8, 2131232315, org.telegram.messenger.cd.L0(2131746977, null), org.telegram.messenger.cd.L0(2131746976, null)));
        arrayList.add(new eu0(3, 2131232300, org.telegram.messenger.cd.L0(2131747007, null), org.telegram.messenger.cd.L0(2131747006, null)));
        arrayList.add(new eu0(4, 2131232310, org.telegram.messenger.cd.L0(2131746997, null), org.telegram.messenger.cd.L0(2131746996, null)));
        arrayList.add(new eu0(5, 2131232312, org.telegram.messenger.cd.L0(2131746991, null), org.telegram.messenger.cd.L0(2131746990, null)));
        arrayList.add(new eu0(11, 2131232303, org.telegram.messenger.cd.L0(2131747022, null), org.telegram.messenger.cd.L0(2131747021, null)));
        arrayList.add(new eu0(9, 2131231858, org.telegram.messenger.cd.L0(2131747040, null), org.telegram.messenger.cd.L0(2131747039, null)));
        arrayList.add(new eu0(6, 2131232302, org.telegram.messenger.cd.L0(2131747002, null), org.telegram.messenger.cd.L0(2131747001, null)));
        arrayList.add(new eu0(27, 2131231131, org.telegram.messenger.cd.L0(2131747004, null), org.telegram.messenger.cd.L0(2131747003, null)));
        arrayList.add(new eu0(7, 2131232301, org.telegram.messenger.cd.L0(2131747037, null), org.telegram.messenger.cd.L0(2131747036, null)));
        arrayList.add(new eu0(24, 2131232569, org.telegram.messenger.cd.L0(2131746986, null), org.telegram.messenger.cd.L0(2131746984, null)));
        arrayList.add(new eu0(10, 2131232304, org.telegram.messenger.cd.L0(2131747035, null), org.telegram.messenger.cd.L0(2131747034, null)));
        arrayList.add(new eu0(12, 2131232568, org.telegram.messenger.cd.L0(2131747019, null), org.telegram.messenger.cd.L0(2131747018, null)));
        arrayList.add(new eu0(13, 2131232313, org.telegram.messenger.cd.L0(2131746981, null), org.telegram.messenger.cd.L0(2131746980, null)));
        arrayList.add(new eu0(22, 2131232570, org.telegram.messenger.cd.L0(2131746974, null), org.telegram.messenger.cd.L0(2131746973, null)));
        arrayList.add(new eu0(23, 2131232566, org.telegram.messenger.cd.L0(2131747000, null), org.telegram.messenger.cd.L0(2131746999, null)));
        arrayList.add(new eu0(26, 2131231857, org.telegram.messenger.cd.L0(2131747015, null), org.telegram.messenger.cd.L0(2131747014, null)));
        arrayList.add(new eu0(28, 2131231145, org.telegram.messenger.cd.L0(2131744277, null), org.telegram.messenger.cd.L0(2131747032, null)));
        arrayList.add(new eu0(38, 2131231854, org.telegram.messenger.cd.L0(2131747024, null), org.telegram.messenger.cd.L0(2131747023, null)));
        arrayList.add(new eu0(39, 2131232304, org.telegram.messenger.cd.L0(2131746983, null), org.telegram.messenger.cd.L0(2131746982, null)));
        arrayList.add(new eu0(41, 2131231170, org.telegram.messenger.cd.L0(2131746993, null), org.telegram.messenger.cd.L0(2131746992, null)));
        arrayList.add(new eu0(42, 2131232565, org.telegram.messenger.cd.L0(2131747042, null), org.telegram.messenger.cd.L0(2131747041, null)));
        arrayList.add(new eu0(43, 2131232567, org.telegram.messenger.cd.L0(2131746995, null), org.telegram.messenger.cd.L0(2131746994, null)));
        SparseIntArray sparseIntArray = r12.N0;
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((eu0) arrayList.get(i11)).f37112a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.v2.f18448a;
                }
            }
        }
        Collections.sort(arrayList, new ut0(r12, 1));
    }

    public static java.lang.String s0(int r17, org.telegram.ui.fu0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.s0(int, org.telegram.ui.fu0):java.lang.String");
    }

    public static void t0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.d20.f15147s0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.d20.f15147s0).sendRequest(tL_help_saveAppLog, new ag.c3(4));
    }

    public static void u0(int i10, int i11) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String p02 = p0(i11);
        if (p02 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = p02;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new ag.c3(4));
    }

    public static void v0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.d20.f15147s0);
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

    public final void A0() {
        boolean z10;
        fu0 fu0Var;
        this.f33721y = -1;
        this.E = -1;
        this.f33712s = -1;
        this.f33717w = -1;
        this.f33719x = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        this.h = 1;
        this.f33705n = 1;
        int size = this.f33691b.size() + 1;
        this.h = size;
        this.f33710r = size;
        int i10 = this.f33699g0;
        if (i10 == 1 && getUserConfig().q()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.f33721y = i11;
            int i13 = i11 + 2;
            this.h = i13;
            this.f33712s = i12;
            this.f33717w = i13;
            int size2 = this.f33693c.size() + i13;
            this.h = size2;
            this.f33719x = size2;
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
        if (getUserConfig().q() && ((fu0Var = this.f33697f) == null || fu0Var.f37348a.months >= ((fu0) this.d.get(this.e)).f37348a.months || this.f33708p0)) {
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
        du0 du0Var = this.U;
        if (du0Var != null && (hVar = du0Var.d) != null && hVar.f11917a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.f33723z0 = new sa(this, 2);
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
        this.L = new st0(context, null);
        this.M = new kg.a2(context);
        ArrayList arrayList = this.f33691b;
        arrayList.clear();
        ArrayList arrayList2 = this.f33693c;
        arrayList2.clear();
        int i11 = this.f33699g0;
        if (i11 == 0) {
            r0(this.currentAccount, arrayList);
        } else {
            q0(this.currentAccount, arrayList, false);
            q0(this.currentAccount, arrayList2, true);
            ag.i3.f(this.currentAccount).h();
            if (getUserConfig().q()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                org.telegram.messenger.ui.b0(this.currentAccount).m0(tL_inputStickerSetShortName, false);
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
        f7.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.t6.f21001h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = org.telegram.messenger.i0.f16020m;
        this.f33695d0 = new vt0(this, context);
        zg.h hVar = new zg.h(this.f33695d0);
        vt0 vt0Var = this.f33695d0;
        tg.b bVar = this.f33720x0;
        bVar.f48700f = hVar;
        bVar.f48701g = vt0Var;
        zg.h hVar2 = new zg.h(this.f33695d0);
        vt0 vt0Var2 = this.f33695d0;
        tg.b bVar2 = this.f33722y0;
        bVar2.f48700f = hVar2;
        bVar2.f48701g = vt0Var2;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f33689a = tk0Var;
        tk0Var.setClipToOutline(true);
        this.f33689a.setOutlineProvider(new ol(this, 7));
        this.f33689a.D0(new tt0(this, 1));
        this.f33689a.setCaptureSectionsDecoratorAllowed(true);
        this.f33689a.setLegacySections(true);
        this.f33689a.setSections(true);
        this.f33689a.setClipToPadding(false);
        org.telegram.ui.Components.tk0 tk0Var2 = this.f33689a;
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az((org.telegram.messenger.i0.L(68.0f) + this.X) - org.telegram.messenger.i0.L(16.0f), this.f33689a);
        this.P = azVar;
        tk0Var2.setLayoutManager(azVar);
        this.P.R = true;
        this.f33689a.setAdapter(new yt0(this));
        this.f33689a.j(new h3(this, 25));
        this.U = new du0(this, context);
        kg.g2 g2Var = new kg.g2(context);
        this.V = g2Var;
        g2Var.c();
        if (i11 == 1) {
            if (this.f33700h0) {
                kg.f2 f2Var = this.V.f11092a;
                f2Var.f11081q = true;
                f2Var.K = false;
                f2Var.H = true;
                f2Var.J = true;
                f2Var.f11075k = org.telegram.messenger.i0.L(-14.0f);
                kg.f2 f2Var2 = this.V.f11092a;
                f2Var2.f11087x = 2000L;
                f2Var2.f11088y = 3000;
                f2Var2.f11082r = 16;
                f2Var2.G = false;
                f2Var2.O = 28;
                f2Var2.Q = i10;
            } else {
                kg.f2 f2Var3 = this.V.f11092a;
                f2Var3.J = true;
                f2Var3.f11075k = org.telegram.messenger.i0.L(28.0f);
                kg.f2 f2Var4 = this.V.f11092a;
                f2Var4.f11087x = 2000L;
                f2Var4.f11088y = 3000;
                f2Var4.f11082r = 16;
                f2Var4.G = false;
                f2Var4.O = 28;
            }
        }
        this.U.d.setStarParticlesView(this.V);
        this.f33695d0.addView(this.V, w7.b6.c(-2.0f, -1));
        this.f33695d0.addView(this.U, w7.b6.c(-2.0f, -1));
        this.f33689a.setOnItemClickListener(new g(this, 24));
        this.f33695d0.addView(this.f33689a, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.K = new FrameLayout(context);
        kg.x0 x0Var = new kg.x0(context, getResourceProvider(), false);
        this.f33696e0 = x0Var;
        x0Var.K = true;
        x0Var.setClickable(false);
        x0Var.f11331w.setClickable(false);
        x0Var.setStateListAnimator(null);
        x0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.K.addView(this.f33696e0, w7.b6.c(-1.0f, -1));
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
        this.f33716v0 = new tg.c(bVar.c(this.f33695d0, null, false));
        this.J.setBackground(cVar);
        if (getUserConfig().p()) {
            this.f33695d0.addView(this.J, w7.b6.e(-1, -2, 80));
        }
        this.fragmentView = this.f33695d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.actionBar.setBackButtonImage(2131231242);
        } else {
            this.actionBar.setBackButtonImage(2131231241);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, 19));
        this.actionBar.setForceSkipTouches(true);
        this.f33695d0.addView(this.actionBar, w7.b6.e(-1, -2, 48));
        y0();
        A0();
        this.U.d.m(200L);
        if (this.f33708p0) {
            org.telegram.messenger.i0.h3(new tt0(this, 2), 400L);
        }
        org.telegram.messenger.ui.b0(this.currentAccount).o1();
        v0(this.f33701i0);
        View view2 = this.fragmentView;
        tj0 tj0Var = new tj0(this, 8);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(view2, tj0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.f19637j5;
        int i13 = org.telegram.messenger.zs.f19619g5;
        if (i10 == i12 || i10 == i13) {
            x0(false);
            this.U.a();
        }
        if (i10 != org.telegram.messenger.zs.f19613f5 && i10 != i13) {
            return;
        }
        this.U.b();
        this.U.a();
        A0();
        this.f33689a.getAdapter().f();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.t3.f20863c;
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
        return this.f33700h0;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void n0() {
        tg.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f33718w0) != null) {
            this.B0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f33707o0.d) - org.telegram.messenger.i0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.i0.L(48.0f) + this.fragmentView.getMeasuredHeight());
            fVar.g(1, this.A0);
            fVar.e(this.f33723z0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        z0(false);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (getMessagesController().A3()) {
            return false;
        }
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19637j5);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19613f5);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19619g5);
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
        if (this.f33699g0 == 1) {
            ag.n3.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19637j5);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19613f5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19619g5);
    }

    @Override
    public final void onPause() {
        kg.h hVar;
        super.onPause();
        du0 du0Var = this.U;
        if (du0Var != null && (hVar = du0Var.d) != null) {
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
        du0 du0Var = this.U;
        if (du0Var != null && (hVar = du0Var.d) != null) {
            hVar.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new z8(this, 7));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f21001h5);
        Drawable drawable = this.I;
        if (drawable != null && (drawable != this.C0 || themedColor != this.D0)) {
            this.C0 = drawable;
            this.D0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            kg.g2 g2Var = this.V;
            if (g2Var != null && g2Var.f11092a != null && this.f33695d0 != null) {
                y0();
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
        z0(z10);
        return showDialog;
    }

    public final void w0() {
        du0 du0Var;
        if (this.f33695d0.getMeasuredWidth() != 0 && this.f33695d0.getMeasuredHeight() != 0 && (du0Var = this.U) != null && du0Var.d != null) {
            if (this.f33700h0) {
                int f7 = i0.b.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.t6.Ak), getThemedColor(org.telegram.ui.ActionBar.t6.f21001h5));
                kg.h hVar = this.f33711r0;
                kg.h hVar2 = this.U.d;
                if (hVar != hVar2 || this.f33713s0 != f7) {
                    this.f33711r0 = hVar2;
                    this.f33713s0 = f7;
                    Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(f7);
                    this.U.d.setBackgroundBitmap(createBitmap);
                    return;
                }
                return;
            }
            int measuredWidth = this.f33695d0.getMeasuredWidth();
            int measuredHeight = this.f33695d0.getMeasuredHeight();
            kg.k1 k1Var = this.m0;
            k1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f33704l0;
            canvas.save();
            canvas.scale(100.0f / this.f33695d0.getMeasuredWidth(), 100.0f / this.f33695d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f33695d0.getMeasuredWidth(), this.f33695d0.getMeasuredHeight(), k1Var.f11142f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.f33703k0);
        }
    }

    public final void x0(boolean z10) {
        if (this.f33696e0 != null) {
            boolean q6 = getUserConfig().q();
            ArrayList arrayList = this.d;
            if (!q6 || this.f33697f == null || this.e >= arrayList.size() || ((fu0) arrayList.get(this.e)).f37348a.months >= this.f33697f.f37348a.months) {
                if (org.telegram.messenger.cd.X) {
                    z10 = false;
                }
                if (!org.telegram.messenger.v2.b() && (!org.telegram.messenger.u1.i().k() || arrayList.isEmpty() || this.e >= arrayList.size() || ((fu0) arrayList.get(this.e)).f37351f == null)) {
                    this.f33696e0.b(org.telegram.messenger.cd.L0(2131748789, null), null, z10);
                    this.K.setOnClickListener(new bh.c(17));
                    this.f33696e0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.e < arrayList.size()) {
                    this.f33696e0.b(s0(this.currentAccount, (fu0) arrayList.get(this.e)), null, z10);
                    this.K.setOnClickListener(new f50(this, 25));
                    this.f33696e0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void y0() {
        int i10;
        int i11;
        lg.h hVar;
        if (this.U != null && this.actionBar != null) {
            boolean z10 = this.f33700h0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.t6.G6;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Hk;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            if (x02 != this.f33714t0) {
                this.f33714t0 = x02;
                this.actionBar.D(x02, true);
                this.actionBar.D(x02, false);
            }
            int i12 = org.telegram.ui.ActionBar.t6.Hk;
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 60);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar.f20501p0 != o10) {
                lVar.C(o10, false);
            }
            this.V.f11092a.g();
            du0 du0Var = this.U;
            if (du0Var != null) {
                TextView textView = du0Var.f36832a;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.t6.G6;
                } else {
                    i11 = i12;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                TextView textView2 = this.U.f36833b;
                if (z10) {
                    i12 = org.telegram.ui.ActionBar.t6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
                kg.h hVar2 = this.U.d;
                if (hVar2 != null && (hVar = hVar2.f11919b) != null) {
                    if (z10) {
                        hVar.f11897z = org.telegram.ui.ActionBar.t6.Lk;
                        hVar.A = org.telegram.ui.ActionBar.t6.Mk;
                    }
                    hVar.b();
                }
            }
            w0();
        }
    }

    public final void z0(boolean z10) {
        kg.h hVar;
        if (z10 != this.Z) {
            this.Z = z10;
            du0 du0Var = this.U;
            if (du0Var != null && (hVar = du0Var.d) != null) {
                hVar.setDialogVisible(z10);
            }
            this.V.setPaused(z10);
            this.f33695d0.invalidate();
        }
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
