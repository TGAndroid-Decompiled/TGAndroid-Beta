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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public hs0 L;
    public ug.k1 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.ly P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public ts0 U;
    public ug.q1 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.pj0 f41577a;
    public boolean f41578a0;
    public final ArrayList f41579b;
    public float f41580b0;
    public final ArrayList f41581c;
    public int f41582c0;
    public final ArrayList d;
    public ks0 f41583d0;
    public int f41584e;
    public ug.p0 f41585e0;
    public vs0 f41586f;
    public float f41587f0;
    public final int f41588g0;
    public int h;
    public final boolean f41589h0;
    public final String f41590i0;
    public boolean f41591j0;
    public final Bitmap f41592k0;
    public final Canvas f41593l0;
    public final ug.y0 m0;
    public int f41594n;
    public final ug.y0 f41595n0;
    public i0.b f41596o0;
    public boolean f41597p0;
    public float f41598q0;
    public int f41599r;
    public bi.qd f41600r0;
    public int f41601s;
    public int f41602s0;
    int showAdsRow;
    public int f41603t0;
    public ms0 f41604u0;
    public dh.d f41605v0;
    public int f41606w;
    public final dh.g f41607w0;
    public int f41608x;
    public final dh.c f41609x0;
    public int f41610y;
    public final dh.c f41611y0;
    public oa f41612z0;

    public PremiumPreviewFragment(int i7, String str) {
        super(null);
        this.f41579b = new ArrayList();
        this.f41581c = new ArrayList();
        this.d = new ArrayList();
        boolean z9 = false;
        this.f41584e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f41592k0 = createBitmap;
        this.f41593l0 = new Canvas(createBitmap);
        this.m0 = new ug.y0(org.telegram.ui.ActionBar.k6.Dk, org.telegram.ui.ActionBar.k6.Ek, org.telegram.ui.ActionBar.k6.Fk, org.telegram.ui.ActionBar.k6.Gk, null);
        this.f41596o0 = i0.b.f15116e;
        ug.y0 y0Var = new ug.y0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, null);
        this.f41595n0 = y0Var;
        y0Var.f56758m = true;
        y0Var.f56760o = 0.0f;
        y0Var.f56761p = 0.0f;
        y0Var.f56762q = 1.0f;
        y0Var.f56749b = 0.0f;
        y0Var.f56750c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.A0 = arrayList;
        RectF rectF = new RectF();
        this.B0 = rectF;
        arrayList.add(rectF);
        this.f41588g0 = i7;
        if (!org.telegram.ui.ActionBar.k6.I.q() && i7 == 1) {
            z9 = true;
        }
        this.f41589h0 = z9;
        this.f41590i0 = str;
        ?? obj = new Object();
        obj.f19609b = this;
        obj.f19608a = new Paint();
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(true);
            this.f41607w0 = gVar;
            ri.f fVar = new ri.f(null);
            fVar.d = gVar;
            fVar.f54455e = -3;
            fVar.f54456f = obj;
            this.f41609x0 = new dh.c(fVar, fVar, fVar);
        } else {
            this.f41607w0 = null;
            this.f41609x0 = new dh.c(obj, obj, obj);
        }
        this.f41611y0 = new dh.c(obj, obj, obj);
    }

    public static void Z(PremiumPreviewFragment premiumPreviewFragment, View view, int i7) {
        vs0 vs0Var;
        boolean z9;
        org.telegram.ui.Components.g5 g5Var;
        hs0 hs0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int L;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i14 = premiumPreviewFragment.f41588g0;
        if (premiumPreviewFragment.getUserConfig().p()) {
            boolean z10 = false;
            if (i7 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull b22 = premiumPreviewFragment.getMessagesController().b2(premiumPreviewFragment.getUserConfig().e());
                if (b22 != null) {
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    m8Var.setChecked(!m8Var.d());
                    b22.sponsored_enabled = m8Var.d();
                    TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                    togglesponsoredmessages.enabled = b22.sponsored_enabled;
                    premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new l(premiumPreviewFragment, 17));
                    premiumPreviewFragment.getMessagesStorage().j2(b22, false);
                }
            } else if (view instanceof hs0) {
                hs0 hs0Var2 = (hs0) view;
                if (i14 == 1 && premiumPreviewFragment.getUserConfig().q()) {
                    int i15 = hs0Var2.f46480f.f50485a;
                    if (i15 == 29) {
                        premiumPreviewFragment.presentFragment(new kg.a1());
                        return;
                    } else if (i15 == 32) {
                        premiumPreviewFragment.presentFragment(new kg.s0());
                        return;
                    } else if (i15 == 33) {
                        ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                        f2Var.f17319f = -4;
                        premiumPreviewFragment.presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
                        return;
                    } else if (i15 == 30) {
                        premiumPreviewFragment.presentFragment(new kg.c1());
                        return;
                    } else if (i15 == 34) {
                        premiumPreviewFragment.presentFragment(new kg.q0());
                        return;
                    } else if (i15 == 31) {
                        premiumPreviewFragment.presentFragment(new kg.q1());
                        return;
                    } else if (i15 == 14) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("dialog_id", org.telegram.messenger.p10.i(premiumPreviewFragment.currentAccount).e());
                        bundle.putInt("type", 1);
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.u80(bundle, null));
                        return;
                    } else if (i15 == 12) {
                        Long h = org.telegram.messenger.t10.h(premiumPreviewFragment.getUserConfig().f());
                        bi.p5 p5Var = new bi.p5(21, premiumPreviewFragment, hs0Var2);
                        if (premiumPreviewFragment.f41604u0 == null) {
                            h11[] h11VarArr = new h11[1];
                            if (hs0Var2.getHeight() + hs0Var2.getTop() > premiumPreviewFragment.f41577a.getMeasuredHeight() / 2.0f) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            Point point = org.telegram.messenger.g0.f22537q;
                            int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                            int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                            org.telegram.ui.Components.g5 g5Var2 = hs0Var2.h;
                            if (g5Var2 != null) {
                                Drawable[] drawableArr = g5Var2.f33858f;
                                Drawable drawable = drawableArr[1];
                                if (drawable != null) {
                                    if (drawable instanceof org.telegram.ui.Components.i5) {
                                        ((org.telegram.ui.Components.i5) drawable).o(g5Var2);
                                    }
                                    drawableArr[1] = null;
                                }
                                org.telegram.ui.Components.g5 g5Var3 = hs0Var2.h;
                                if (g5Var3 != null) {
                                    g5Var3.f();
                                    hs0Var2.c();
                                    Rect rect = org.telegram.messenger.g0.Q;
                                    rect.set(hs0Var2.h.getBounds());
                                    if (z9) {
                                        L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                                    } else {
                                        L = (-(hs0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                                    }
                                    i11 = rect.centerX() - (point.x - min2);
                                    g5Var = g5Var3;
                                    i10 = L;
                                } else {
                                    g5Var = g5Var3;
                                    i10 = 0;
                                    i11 = 0;
                                }
                                hs0Var = hs0Var2;
                            } else {
                                g5Var = null;
                                hs0Var = null;
                                i10 = 0;
                                i11 = 0;
                            }
                            if (z9) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            int i16 = i10;
                            Activity parentActivity = premiumPreviewFragment.getParentActivity();
                            Integer valueOf = Integer.valueOf(i11);
                            org.telegram.ui.ActionBar.f6 resourceProvider = premiumPreviewFragment.getResourceProvider();
                            if (z9) {
                                i13 = 24;
                            } else {
                                i13 = 16;
                            }
                            ls0 ls0Var = new ls0(premiumPreviewFragment, premiumPreviewFragment, parentActivity, valueOf, i12, resourceProvider, i13, p5Var, h11VarArr);
                            ls0Var.f49007g1 = true;
                            ls0Var.setSelected(h);
                            ls0Var.setSaveState(3);
                            ls0Var.y(g5Var, hs0Var);
                            ms0 ms0Var = new ms0(premiumPreviewFragment, ls0Var);
                            premiumPreviewFragment.f41604u0 = ms0Var;
                            h11VarArr[0] = ms0Var;
                            ms0Var.showAsDropDown(hs0Var2, 0, i16, 53);
                            h11VarArr[0].b();
                            return;
                        }
                        return;
                    } else if (i15 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f41212f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i15 == 36) {
                        premiumPreviewFragment.presentFragment(new kg.m());
                        return;
                    } else if (i15 == 37) {
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.h41());
                        return;
                    } else {
                        return;
                    }
                }
                v0(premiumPreviewFragment.currentAccount, hs0Var2.f46480f.f50485a);
                int i17 = premiumPreviewFragment.f41584e;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    vs0Var = (vs0) arrayList.get(premiumPreviewFragment.f41584e);
                } else {
                    vs0Var = null;
                }
                Activity parentActivity2 = premiumPreviewFragment.getParentActivity();
                int i18 = premiumPreviewFragment.currentAccount;
                if (i14 == 1) {
                    z10 = true;
                }
                premiumPreviewFragment.showDialog(new ug.w0(premiumPreviewFragment, parentActivity2, i18, z10, hs0Var2.f46480f.f50485a, false, vs0Var));
            }
        }
    }

    public static org.telegram.ui.ActionBar.k j0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void p0(org.telegram.ui.ActionBar.f2 f2Var, vs0 vs0Var, String str, com.google.android.gms.internal.clearcut.z0 z0Var) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z9 = org.telegram.messenger.r2.f25191a;
        if (f2Var == null) {
            currentAccount = org.telegram.messenger.p10.f24459s0;
        } else {
            currentAccount = f2Var.getCurrentAccount();
        }
        int i7 = currentAccount;
        if (org.telegram.messenger.qp.s1(i7).v2()) {
            b.b(i7);
            return;
        }
        if (vs0Var == null && (tL_help_premiumPromo = org.telegram.messenger.ui.b0(i7).D) != null) {
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
                    vs0Var = new vs0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    vs0Var = new vs0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        vs0 vs0Var2 = vs0Var;
        u0();
        if (org.telegram.messenger.r2.b()) {
            if (f2Var != null) {
                activity = f2Var.getParentActivity();
            } else {
                activity = LaunchActivity.G1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (vs0Var2 != null && (tL_premiumSubscriptionOption = vs0Var2.f50813a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.W0 = true;
                    }
                    vf.c.t(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                if (!TextUtils.isEmpty(s12.f24880s6)) {
                    launchActivity.W0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + s12.f24880s6 + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(s12.t6)) {
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + s12.t6)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        f5.l lVar = org.telegram.messenger.r1.f25177l;
        if (lVar != null && !lVar.h.isEmpty()) {
            if (vs0Var2.f50817f == null) {
                vs0Var2.f50817f = org.telegram.messenger.r1.f25177l;
            }
            vs0Var2.a();
            if (vs0Var2.f50818g == null) {
                return;
            }
            org.telegram.messenger.r1.i().p("subs", new bg.f0(f2Var, i7, z0Var, vs0Var2, 8));
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

    public static void r0(int i7, ArrayList arrayList, boolean z9) {
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        SparseIntArray sparseIntArray = s12.O0;
        if (!z9) {
            arrayList.add(new us0(29, 2131231129, org.telegram.messenger.hd.M0(2131747052, null), org.telegram.messenger.hd.M0(2131747051, null)));
            arrayList.add(new us0(30, 2131231148, org.telegram.messenger.hd.M0(2131747050, null), org.telegram.messenger.hd.M0(2131747049, null)));
            arrayList.add(new us0(31, 2131231133, org.telegram.messenger.hd.M0(2131747048, null), org.telegram.messenger.hd.M0(2131747047, null)));
            arrayList.add(new us0(32, 2131232571, org.telegram.messenger.hd.M0(2131747056, null), org.telegram.messenger.hd.M0(2131747055, null)));
            arrayList.add(new us0(33, 2131231143, org.telegram.messenger.hd.M0(2131747063, null), org.telegram.messenger.hd.M0(2131747062, null)));
            arrayList.add(new us0(34, 2131231144, org.telegram.messenger.hd.M0(2131747058, null), org.telegram.messenger.hd.M0(2131747057, null)));
            arrayList.add(new us0(37, 2131231147, org.telegram.messenger.hd.M0(2131747061, null), org.telegram.messenger.hd.M0(2131747060, null)));
            arrayList.add(new us0(36, 2131231149, org.telegram.messenger.hd.M0(2131747054, null), org.telegram.messenger.hd.M0(2131747053, null)));
        } else {
            arrayList.add(new us0(12, 2131231150, org.telegram.messenger.hd.M0(2131747015, null), org.telegram.messenger.hd.M0(2131747014, null)));
            arrayList.add(new us0(35, 2131232572, org.telegram.messenger.hd.M0(2131747001, null), org.telegram.messenger.hd.M0(2131747000, null)));
            arrayList.add(new us0(14, 2131231146, org.telegram.messenger.hd.M0(2131747013, null), org.telegram.messenger.hd.M0(2131747012, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((us0) arrayList.get(i10)).f50485a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.r2.f25191a;
                }
            }
        }
        Collections.sort(arrayList, new js0(s12, 0));
    }

    public static void s0(int i7, ArrayList arrayList) {
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        arrayList.add(new us0(0, 2131232306, org.telegram.messenger.hd.M0(2131746997, null), org.telegram.messenger.hd.a0(null, null, 2131746996, Integer.valueOf(s12.E4), Integer.valueOf(s12.M4), Integer.valueOf(s12.Q4), Integer.valueOf(s12.S4), 4)));
        arrayList.add(new us0(14, 2131232154, org.telegram.messenger.hd.M0(2131746973, null), org.telegram.messenger.hd.a0(null, null, 2131746972, new Object[0])));
        arrayList.add(new us0(1, 2131232315, org.telegram.messenger.hd.M0(2131746963, null), org.telegram.messenger.hd.M0(2131746962, null)));
        arrayList.add(new us0(2, 2131232312, org.telegram.messenger.hd.M0(2131747011, null), org.telegram.messenger.hd.M0(2131747010, null)));
        arrayList.add(new us0(8, 2131232316, org.telegram.messenger.hd.M0(2131746961, null), org.telegram.messenger.hd.M0(2131746960, null)));
        arrayList.add(new us0(3, 2131232301, org.telegram.messenger.hd.M0(2131746991, null), org.telegram.messenger.hd.M0(2131746990, null)));
        arrayList.add(new us0(4, 2131232311, org.telegram.messenger.hd.M0(2131746981, null), org.telegram.messenger.hd.M0(2131746980, null)));
        arrayList.add(new us0(5, 2131232313, org.telegram.messenger.hd.M0(2131746975, null), org.telegram.messenger.hd.M0(2131746974, null)));
        arrayList.add(new us0(11, 2131232304, org.telegram.messenger.hd.M0(2131747006, null), org.telegram.messenger.hd.M0(2131747005, null)));
        arrayList.add(new us0(9, 2131231859, org.telegram.messenger.hd.M0(2131747024, null), org.telegram.messenger.hd.M0(2131747023, null)));
        arrayList.add(new us0(6, 2131232303, org.telegram.messenger.hd.M0(2131746986, null), org.telegram.messenger.hd.M0(2131746985, null)));
        arrayList.add(new us0(27, 2131231131, org.telegram.messenger.hd.M0(2131746988, null), org.telegram.messenger.hd.M0(2131746987, null)));
        arrayList.add(new us0(7, 2131232302, org.telegram.messenger.hd.M0(2131747021, null), org.telegram.messenger.hd.M0(2131747020, null)));
        arrayList.add(new us0(24, 2131232572, org.telegram.messenger.hd.M0(2131746970, null), org.telegram.messenger.hd.M0(2131746968, null)));
        arrayList.add(new us0(10, 2131232305, org.telegram.messenger.hd.M0(2131747019, null), org.telegram.messenger.hd.M0(2131747018, null)));
        arrayList.add(new us0(12, 2131232571, org.telegram.messenger.hd.M0(2131747003, null), org.telegram.messenger.hd.M0(2131747002, null)));
        arrayList.add(new us0(13, 2131232314, org.telegram.messenger.hd.M0(2131746965, null), org.telegram.messenger.hd.M0(2131746964, null)));
        arrayList.add(new us0(22, 2131232573, org.telegram.messenger.hd.M0(2131746958, null), org.telegram.messenger.hd.M0(2131746957, null)));
        arrayList.add(new us0(23, 2131232569, org.telegram.messenger.hd.M0(2131746984, null), org.telegram.messenger.hd.M0(2131746983, null)));
        arrayList.add(new us0(26, 2131231858, org.telegram.messenger.hd.M0(2131746999, null), org.telegram.messenger.hd.M0(2131746998, null)));
        arrayList.add(new us0(28, 2131231145, org.telegram.messenger.hd.M0(2131744253, null), org.telegram.messenger.hd.M0(2131747016, null)));
        arrayList.add(new us0(38, 2131231855, org.telegram.messenger.hd.M0(2131747008, null), org.telegram.messenger.hd.M0(2131747007, null)));
        arrayList.add(new us0(39, 2131232305, org.telegram.messenger.hd.M0(2131746967, null), org.telegram.messenger.hd.M0(2131746966, null)));
        arrayList.add(new us0(41, 2131231170, org.telegram.messenger.hd.M0(2131746977, null), org.telegram.messenger.hd.M0(2131746976, null)));
        arrayList.add(new us0(42, 2131232568, org.telegram.messenger.hd.M0(2131747026, null), org.telegram.messenger.hd.M0(2131747025, null)));
        arrayList.add(new us0(43, 2131232570, org.telegram.messenger.hd.M0(2131746979, null), org.telegram.messenger.hd.M0(2131746978, null)));
        SparseIntArray sparseIntArray = s12.N0;
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((us0) arrayList.get(i10)).f50485a, -1) == -1) {
                    boolean z9 = org.telegram.messenger.r2.f25191a;
                }
            }
        }
        Collections.sort(arrayList, new js0(s12, 1));
    }

    public static java.lang.String t0(int r17, org.telegram.ui.vs0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.t0(int, org.telegram.ui.vs0):java.lang.String");
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0).sendRequest(tL_help_saveAppLog, new di.u5(9));
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
        ConnectionsManager.getInstance(i7).sendRequest(tL_help_saveAppLog, new di.u5(9));
    }

    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new di.u5(9));
    }

    public final void A0(boolean z9) {
        bi.qd qdVar;
        if (z9 != this.Z) {
            this.Z = z9;
            ts0 ts0Var = this.U;
            if (ts0Var != null && (qdVar = ts0Var.d) != null) {
                qdVar.setDialogVisible(z9);
            }
            this.V.setPaused(z9);
            this.f41583d0.invalidate();
        }
    }

    public final void B0() {
        boolean z9;
        vs0 vs0Var;
        this.f41610y = -1;
        this.E = -1;
        this.f41601s = -1;
        this.f41606w = -1;
        this.f41608x = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        this.h = 1;
        this.f41594n = 1;
        int size = this.f41579b.size() + 1;
        this.h = size;
        this.f41599r = size;
        int i7 = this.f41588g0;
        if (i7 == 1 && getUserConfig().q()) {
            int i10 = this.h;
            int i11 = i10 + 1;
            this.f41610y = i10;
            int i12 = i10 + 2;
            this.h = i12;
            this.f41601s = i11;
            this.f41606w = i12;
            int size2 = this.f41581c.size() + i12;
            this.h = size2;
            this.f41608x = size2;
        }
        int i13 = this.h;
        this.D = i13;
        this.h = i13 + 2;
        this.F = i13 + 1;
        if (i7 == 1 && getUserConfig().q()) {
            int i14 = this.h;
            this.G = i14;
            this.showAdsRow = i14 + 1;
            this.h = i14 + 3;
            this.H = i14 + 2;
        }
        FrameLayout frameLayout = this.J;
        int i15 = 0;
        if (getUserConfig().q() && ((vs0Var = this.f41586f) == null || vs0Var.f50813a.months >= ((vs0) this.d.get(this.f41584e)).f50813a.months || this.f41597p0)) {
            z9 = false;
        } else {
            z9 = true;
        }
        org.telegram.messenger.g0.Z3(frameLayout, z9, 1.0f, true, false);
        if (this.J.getVisibility() == 0) {
            i15 = org.telegram.messenger.g0.L(64.0f);
        }
        org.telegram.ui.Components.ly lyVar = this.P;
        lyVar.M = (this.X + i15) - org.telegram.messenger.g0.L(16.0f);
        lyVar.p1();
        this.P.S = i15;
    }

    @Override
    public final boolean canBeginSlide() {
        bi.qd qdVar;
        ts0 ts0Var = this.U;
        if (ts0Var != null && (qdVar = ts0Var.d) != null && qdVar.f57293a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.f41612z0 = new oa(this, 2);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ck, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bk, false);
        int i7 = org.telegram.ui.ActionBar.k6.Ak;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new hs0(context, null);
        this.M = new ug.k1(context);
        ArrayList arrayList = this.f41579b;
        arrayList.clear();
        ArrayList arrayList2 = this.f41581c;
        arrayList2.clear();
        int i10 = this.f41588g0;
        if (i10 == 0) {
            s0(this.currentAccount, arrayList);
        } else {
            r0(this.currentAccount, arrayList, false);
            r0(this.currentAccount, arrayList2, true);
            kg.t1.f(this.currentAccount).h();
            if (getUserConfig().q()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                org.telegram.messenger.ui.b0(this.currentAccount).m0(tL_inputStickerSetShortName, false);
                kg.f.a(this.currentAccount).c(null);
                if (getMessagesController().V0.isEmpty()) {
                    getMessagesController().d3();
                }
                kg.y d = kg.y.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable h = jg.g.h(context, 2131232728);
        this.I = h;
        h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f27921h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = org.telegram.messenger.g0.f22531m;
        this.f41583d0 = new ks0(this, context);
        jh.k kVar = new jh.k(this.f41583d0);
        ks0 ks0Var = this.f41583d0;
        dh.c cVar = this.f41609x0;
        cVar.h = kVar;
        cVar.f8708i = ks0Var;
        jh.k kVar2 = new jh.k(this.f41583d0);
        ks0 ks0Var2 = this.f41583d0;
        dh.c cVar2 = this.f41611y0;
        cVar2.h = kVar2;
        cVar2.f8708i = ks0Var2;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f41577a = pj0Var;
        pj0Var.setClipToOutline(true);
        this.f41577a.setOutlineProvider(new fh.a(this, 9));
        this.f41577a.D0(new is0(this, 1));
        this.f41577a.setCaptureSectionsDecoratorAllowed(true);
        this.f41577a.setLegacySections(true);
        this.f41577a.setSections(true);
        this.f41577a.setClipToPadding(false);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f41577a;
        org.telegram.ui.Components.ly lyVar = new org.telegram.ui.Components.ly((org.telegram.messenger.g0.L(68.0f) + this.X) - org.telegram.messenger.g0.L(16.0f), this.f41577a);
        this.P = lyVar;
        pj0Var2.setLayoutManager(lyVar);
        this.P.R = true;
        this.f41577a.setAdapter(new os0(this));
        this.f41577a.j(new g3(this, 25));
        this.U = new ts0(this, context);
        ug.q1 q1Var = new ug.q1(context);
        this.V = q1Var;
        q1Var.c();
        if (i10 == 1) {
            if (this.f41589h0) {
                ug.p1 p1Var = this.V.f56677a;
                p1Var.f56661q = true;
                p1Var.K = false;
                p1Var.H = true;
                p1Var.J = true;
                p1Var.f56655k = org.telegram.messenger.g0.L(-14.0f);
                ug.p1 p1Var2 = this.V.f56677a;
                p1Var2.f56667x = 2000L;
                p1Var2.f56668y = 3000;
                p1Var2.f56662r = 16;
                p1Var2.G = false;
                p1Var2.O = 28;
                p1Var2.Q = i7;
            } else {
                ug.p1 p1Var3 = this.V.f56677a;
                p1Var3.J = true;
                p1Var3.f56655k = org.telegram.messenger.g0.L(28.0f);
                ug.p1 p1Var4 = this.V.f56677a;
                p1Var4.f56667x = 2000L;
                p1Var4.f56668y = 3000;
                p1Var4.f56662r = 16;
                p1Var4.G = false;
                p1Var4.O = 28;
            }
        }
        this.U.d.setStarParticlesView(this.V);
        this.f41583d0.addView(this.V, c8.ha.c(-2.0f, -1));
        this.f41583d0.addView(this.U, c8.ha.c(-2.0f, -1));
        this.f41577a.setOnItemClickListener(new h(this, 24));
        this.f41583d0.addView(this.f41577a, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.K = new FrameLayout(context);
        ug.p0 p0Var = new ug.p0(context, getResourceProvider(), false);
        this.f41585e0 = p0Var;
        p0Var.K = true;
        p0Var.setClickable(false);
        p0Var.f56644w.setClickable(false);
        p0Var.setStateListAnimator(null);
        y0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.K.addView(this.f41585e0, c8.ha.c(-1.0f, -1));
        View view = this.K;
        fh.g c10 = cVar.c(view, null, false);
        c10.p(c8.g0.j(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        view.setBackground(c10);
        c8.ka.b(this.K, 0.02f, 1.5f);
        this.J.addView(this.K, c8.ha.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar = new dh.d(cVar.c(this.J, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), false);
        this.f41605v0 = new dh.d(cVar.c(this.f41583d0, null, false));
        this.J.setBackground(dVar);
        if (getUserConfig().p()) {
            this.f41583d0.addView(this.J, c8.ha.e(-1, -2, 80));
        }
        this.fragmentView = this.f41583d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.actionBar.setBackButtonImage(2131231241);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, 28));
        this.actionBar.setForceSkipTouches(true);
        this.f41583d0.addView(this.actionBar, c8.ha.e(-1, -2, 48));
        z0();
        B0();
        this.U.d.m(200L);
        if (this.f41597p0) {
            org.telegram.messenger.g0.i3(new is0(this, 2), 400L);
        }
        org.telegram.messenger.ui.b0(this.currentAccount).o1();
        w0(this.f41590i0);
        View view2 = this.fragmentView;
        li0 li0Var = new li0(this, 7);
        WeakHashMap weakHashMap = r0.i0.f54073a;
        r0.a0.i(view2, li0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25007j5;
        int i12 = org.telegram.messenger.qs.f24990g5;
        if (i7 == i11 || i7 == i12) {
            y0(false);
            this.U.a();
        }
        if (i7 != org.telegram.messenger.qs.f24984f5 && i7 != i12) {
            return;
        }
        this.U.b();
        this.U.a();
        B0();
        this.f41577a.getAdapter().f();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.o3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.o3.f28337c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(16, this), org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, org.telegram.ui.ActionBar.k6.Bk, org.telegram.ui.ActionBar.k6.Ck, org.telegram.ui.ActionBar.k6.Dk, org.telegram.ui.ActionBar.k6.Ek, org.telegram.ui.ActionBar.k6.Fk, org.telegram.ui.ActionBar.k6.Gk, org.telegram.ui.ActionBar.k6.Hk, org.telegram.ui.ActionBar.k6.Jk, org.telegram.ui.ActionBar.k6.Kk, org.telegram.ui.ActionBar.k6.Ik, org.telegram.ui.ActionBar.k6.Nk);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f41589h0;
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
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f41607w0) != null) {
            this.B0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f41596o0.d) - org.telegram.messenger.g0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f) + this.fragmentView.getMeasuredHeight());
            gVar.g(1, this.A0);
            gVar.e(this.f41612z0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
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
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25007j5);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f24984f5);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f24990g5);
        if (getMediaDataController().D != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().D.videos;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TLRPC.Document document = arrayList.get(i7);
                i7++;
                org.telegram.messenger.w7.G(this.currentAccount).X(document, getMediaDataController().D, 3, 0);
            }
        }
        if (this.f41588g0 == 1) {
            kg.x1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25007j5);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f24984f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24990g5);
    }

    @Override
    public final void onPause() {
        bi.qd qdVar;
        super.onPause();
        ts0 ts0Var = this.U;
        if (ts0Var != null && (qdVar = ts0Var.d) != null) {
            qdVar.setDialogVisible(true);
        }
        ug.q1 q1Var = this.V;
        if (q1Var != null) {
            q1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        bi.qd qdVar;
        super.onResume();
        ts0 ts0Var = this.U;
        if (ts0Var != null && (qdVar = ts0Var.d) != null) {
            qdVar.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new y8(this, 7));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27921h5);
        Drawable drawable = this.I;
        if (drawable != null && (drawable != this.C0 || themedColor != this.D0)) {
            this.C0 = drawable;
            this.D0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            ug.q1 q1Var = this.V;
            if (q1Var != null && q1Var.f56677a != null && this.f41583d0 != null) {
                z0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z9;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        A0(z9);
        return showDialog;
    }

    public final void x0() {
        ts0 ts0Var;
        if (this.f41583d0.getMeasuredWidth() != 0 && this.f41583d0.getMeasuredHeight() != 0 && (ts0Var = this.U) != null && ts0Var.d != null) {
            if (this.f41589h0) {
                int f10 = i0.a.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.k6.Ak), getThemedColor(org.telegram.ui.ActionBar.k6.f27921h5));
                bi.qd qdVar = this.f41600r0;
                bi.qd qdVar2 = this.U.d;
                if (qdVar != qdVar2 || this.f41602s0 != f10) {
                    this.f41600r0 = qdVar2;
                    this.f41602s0 = f10;
                    Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(f10);
                    this.U.d.setBackgroundBitmap(createBitmap);
                    return;
                }
                return;
            }
            int measuredWidth = this.f41583d0.getMeasuredWidth();
            int measuredHeight = this.f41583d0.getMeasuredHeight();
            ug.y0 y0Var = this.m0;
            y0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f41593l0;
            canvas.save();
            canvas.scale(100.0f / this.f41583d0.getMeasuredWidth(), 100.0f / this.f41583d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f41583d0.getMeasuredWidth(), this.f41583d0.getMeasuredHeight(), y0Var.f56752f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.f41592k0);
        }
    }

    public final void y0(boolean z9) {
        if (this.f41585e0 != null) {
            boolean q10 = getUserConfig().q();
            ArrayList arrayList = this.d;
            if (!q10 || this.f41586f == null || this.f41584e >= arrayList.size() || ((vs0) arrayList.get(this.f41584e)).f50813a.months >= this.f41586f.f50813a.months) {
                if (org.telegram.messenger.hd.f22871a0) {
                    z9 = false;
                }
                if (!org.telegram.messenger.r2.b() && (!org.telegram.messenger.r1.i().k() || arrayList.isEmpty() || this.f41584e >= arrayList.size() || ((vs0) arrayList.get(this.f41584e)).f50817f == null)) {
                    this.f41585e0.b(org.telegram.messenger.hd.M0(2131748778, null), null, z9);
                    this.K.setOnClickListener(new bi.l1(19));
                    this.f41585e0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.f41584e < arrayList.size()) {
                    this.f41585e0.b(t0(this.currentAccount, (vs0) arrayList.get(this.f41584e)), null, z9);
                    this.K.setOnClickListener(new g40(this, 25));
                    this.f41585e0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void z0() {
        int i7;
        int i10;
        vg.f fVar;
        if (this.U != null && this.actionBar != null) {
            boolean z9 = this.f41589h0;
            if (z9) {
                i7 = org.telegram.ui.ActionBar.k6.G6;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.Hk;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            if (x02 != this.f41603t0) {
                this.f41603t0 = x02;
                this.actionBar.D(x02, true);
                this.actionBar.D(x02, false);
            }
            int i11 = org.telegram.ui.ActionBar.k6.Hk;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 60);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.f27679p0 != o4) {
                kVar.C(o4, false);
            }
            this.V.f56677a.g();
            ts0 ts0Var = this.U;
            if (ts0Var != null) {
                TextView textView = ts0Var.f50104a;
                if (z9) {
                    i10 = org.telegram.ui.ActionBar.k6.G6;
                } else {
                    i10 = i11;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                TextView textView2 = this.U.f50105b;
                if (z9) {
                    i11 = org.telegram.ui.ActionBar.k6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                bi.qd qdVar = this.U.d;
                if (qdVar != null && (fVar = qdVar.f57295b) != null) {
                    if (z9) {
                        fVar.f57279z = org.telegram.ui.ActionBar.k6.Lk;
                        fVar.A = org.telegram.ui.ActionBar.k6.Mk;
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
