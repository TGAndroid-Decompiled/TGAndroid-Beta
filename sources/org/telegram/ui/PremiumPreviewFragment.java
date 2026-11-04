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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public na A0;
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
    public yr0 M;
    public vg.n1 N;
    public int O;
    public int P;
    public org.telegram.ui.Components.jy Q;
    public final Paint R;
    public LinearGradient S;
    public final Matrix T;
    public final Paint U;
    public ks0 V;
    public vg.t1 W;
    public boolean X;
    public int Y;
    public int Z;
    public org.telegram.ui.Components.tj0 f41632a;
    public boolean f41633a0;
    public final ArrayList f41634b;
    public boolean f41635b0;
    public final ArrayList f41636c;
    public float f41637c0;
    public final ArrayList d;
    public int f41638d0;
    public int f41639e;
    public bs0 f41640e0;
    public ms0 f41641f;
    public vg.o0 f41642f0;
    public float f41643g0;
    public int h;
    public final int f41644h0;
    public final boolean f41645i0;
    public final String f41646j0;
    public boolean f41647k0;
    public final Bitmap f41648l0;
    public final Canvas m0;
    public int f41649n;
    public final vg.x0 f41650n0;
    public final vg.x0 f41651o0;
    public i0.b f41652p0;
    public boolean f41653q0;
    public int f41654r;
    public float f41655r0;
    public int f41656s;
    public ci.ic f41657s0;
    int showAdsRow;
    public int f41658t0;
    public int f41659u0;
    public ds0 f41660v0;
    public int f41661w;
    public eh.d f41662w0;
    public int f41663x;
    public final eh.g f41664x0;
    public int f41665y;
    public final eh.c f41666y0;
    public final eh.c f41667z0;

    public PremiumPreviewFragment(int i3, String str) {
        super(null);
        this.f41634b = new ArrayList();
        this.f41636c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.f41639e = 0;
        this.R = new Paint(1);
        this.T = new Matrix();
        this.U = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f41648l0 = createBitmap;
        this.m0 = new Canvas(createBitmap);
        this.f41650n0 = new vg.x0(org.telegram.ui.ActionBar.k6.Dk, org.telegram.ui.ActionBar.k6.Ek, org.telegram.ui.ActionBar.k6.Fk, org.telegram.ui.ActionBar.k6.Gk, null);
        this.f41652p0 = i0.b.f14494e;
        vg.x0 x0Var = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, null);
        this.f41651o0 = x0Var;
        x0Var.f56917m = true;
        x0Var.f56919o = 0.0f;
        x0Var.f56920p = 0.0f;
        x0Var.f56921q = 1.0f;
        x0Var.f56908b = 0.0f;
        x0Var.f56909c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.f41644h0 = i3;
        if (!org.telegram.ui.ActionBar.k6.I.q() && i3 == 1) {
            z10 = true;
        }
        this.f41645i0 = z10;
        this.f41646j0 = str;
        m2.t tVar = new m2.t(this);
        if (Build.VERSION.SDK_INT >= 31) {
            eh.g gVar = new eh.g(true);
            this.f41664x0 = gVar;
            si.f fVar = new si.f(null);
            fVar.d = gVar;
            fVar.f54755e = -3;
            fVar.f54756f = tVar;
            this.f41666y0 = new eh.c(fVar, fVar, fVar);
        } else {
            this.f41664x0 = null;
            this.f41666y0 = new eh.c(tVar, tVar, tVar);
        }
        this.f41667z0 = new eh.c(tVar, tVar, tVar);
    }

    public static void Z(PremiumPreviewFragment premiumPreviewFragment, View view, int i3) {
        ms0 ms0Var;
        boolean z10;
        org.telegram.ui.Components.e5 e5Var;
        yr0 yr0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int L;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i14 = premiumPreviewFragment.f41644h0;
        if (premiumPreviewFragment.getUserConfig().p()) {
            boolean z11 = false;
            if (i3 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull b22 = premiumPreviewFragment.getMessagesController().b2(premiumPreviewFragment.getUserConfig().e());
                if (b22 != null) {
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    l8Var.setChecked(!l8Var.d());
                    b22.sponsored_enabled = l8Var.d();
                    TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                    togglesponsoredmessages.enabled = b22.sponsored_enabled;
                    premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new l(premiumPreviewFragment, 18));
                    premiumPreviewFragment.getMessagesStorage().j2(b22, false);
                }
            } else if (view instanceof yr0) {
                yr0 yr0Var2 = (yr0) view;
                if (i14 == 1 && premiumPreviewFragment.getUserConfig().q()) {
                    int i15 = yr0Var2.f52390f.f47430a;
                    if (i15 == 29) {
                        premiumPreviewFragment.presentFragment(new lg.b1());
                        return;
                    } else if (i15 == 32) {
                        premiumPreviewFragment.presentFragment(new lg.t0());
                        return;
                    } else if (i15 == 33) {
                        ?? d2Var = new org.telegram.ui.ActionBar.d2(null);
                        d2Var.f18253f = -4;
                        premiumPreviewFragment.presentFragment((org.telegram.ui.ActionBar.d2) d2Var);
                        return;
                    } else if (i15 == 30) {
                        premiumPreviewFragment.presentFragment(new lg.d1());
                        return;
                    } else if (i15 == 34) {
                        premiumPreviewFragment.presentFragment(new lg.r0());
                        return;
                    } else if (i15 == 31) {
                        premiumPreviewFragment.presentFragment(new lg.r1());
                        return;
                    } else if (i15 == 14) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("dialog_id", org.telegram.messenger.h10.i(premiumPreviewFragment.currentAccount).e());
                        bundle.putInt("type", 1);
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.r80(bundle, null));
                        return;
                    } else if (i15 == 12) {
                        Long h = org.telegram.messenger.l10.h(premiumPreviewFragment.getUserConfig().f());
                        ai.q4 q4Var = new ai.q4(22, premiumPreviewFragment, yr0Var2);
                        if (premiumPreviewFragment.f41660v0 == null) {
                            x01[] x01VarArr = new x01[1];
                            if (yr0Var2.getHeight() + yr0Var2.getTop() > premiumPreviewFragment.f41632a.getMeasuredHeight() / 2.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Point point = org.telegram.messenger.g0.f22608q;
                            int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                            int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                            org.telegram.ui.Components.e5 e5Var2 = yr0Var2.h;
                            if (e5Var2 != null) {
                                Drawable[] drawableArr = e5Var2.f33286f;
                                Drawable drawable = drawableArr[1];
                                if (drawable != null) {
                                    if (drawable instanceof org.telegram.ui.Components.g5) {
                                        ((org.telegram.ui.Components.g5) drawable).o(e5Var2);
                                    }
                                    drawableArr[1] = null;
                                }
                                org.telegram.ui.Components.e5 e5Var3 = yr0Var2.h;
                                if (e5Var3 != null) {
                                    e5Var3.f();
                                    yr0Var2.c();
                                    Rect rect = org.telegram.messenger.g0.Q;
                                    rect.set(yr0Var2.h.getBounds());
                                    if (z10) {
                                        L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                                    } else {
                                        L = (-(yr0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                                    }
                                    i11 = rect.centerX() - (point.x - min2);
                                    e5Var = e5Var3;
                                    i10 = L;
                                } else {
                                    e5Var = e5Var3;
                                    i10 = 0;
                                    i11 = 0;
                                }
                                yr0Var = yr0Var2;
                            } else {
                                e5Var = null;
                                yr0Var = null;
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
                            cs0 cs0Var = new cs0(premiumPreviewFragment, premiumPreviewFragment, parentActivity, valueOf, i12, resourceProvider, i13, q4Var, x01VarArr);
                            cs0Var.f45455h1 = true;
                            cs0Var.setSelected(h);
                            cs0Var.setSaveState(3);
                            cs0Var.y(e5Var, yr0Var);
                            ds0 ds0Var = new ds0(premiumPreviewFragment, cs0Var);
                            premiumPreviewFragment.f41660v0 = ds0Var;
                            x01VarArr[0] = ds0Var;
                            ds0Var.showAsDropDown(yr0Var2, 0, i16, 53);
                            x01VarArr[0].b();
                            return;
                        }
                        return;
                    } else if (i15 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f41269f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i15 == 36) {
                        premiumPreviewFragment.presentFragment(new lg.m());
                        return;
                    } else if (i15 == 37) {
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.h41());
                        return;
                    } else {
                        return;
                    }
                }
                v0(premiumPreviewFragment.currentAccount, yr0Var2.f52390f.f47430a);
                int i17 = premiumPreviewFragment.f41639e;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    ms0Var = (ms0) arrayList.get(premiumPreviewFragment.f41639e);
                } else {
                    ms0Var = null;
                }
                Activity parentActivity2 = premiumPreviewFragment.getParentActivity();
                int i18 = premiumPreviewFragment.currentAccount;
                if (i14 == 1) {
                    z11 = true;
                }
                premiumPreviewFragment.showDialog(new vg.v0(premiumPreviewFragment, parentActivity2, i18, z11, yr0Var2.f52390f.f47430a, false, ms0Var));
            }
        }
    }

    public static org.telegram.ui.ActionBar.k j0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void p0(org.telegram.ui.ActionBar.d2 d2Var, ms0 ms0Var, String str, ad.b bVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z10 = org.telegram.messenger.r2.f25040a;
        if (d2Var == null) {
            currentAccount = org.telegram.messenger.h10.f22829t0;
        } else {
            currentAccount = d2Var.getCurrentAccount();
        }
        int i3 = currentAccount;
        if (org.telegram.messenger.hp.s1(i3).v2()) {
            b.b(i3);
            return;
        }
        if (ms0Var == null && (tL_help_premiumPromo = org.telegram.messenger.li.b0(i3).E) != null) {
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
                    ms0Var = new ms0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    ms0Var = new ms0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        ms0 ms0Var2 = ms0Var;
        u0();
        if (org.telegram.messenger.r2.b()) {
            if (d2Var != null) {
                activity = d2Var.getParentActivity();
            } else {
                activity = LaunchActivity.K1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (ms0Var2 != null && (tL_premiumSubscriptionOption = ms0Var2.f47776a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.Z0 = true;
                    }
                    sf.c.t(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
                if (!TextUtils.isEmpty(s12.s6)) {
                    launchActivity.Z0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + s12.s6 + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(s12.f23128t6)) {
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + s12.f23128t6)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        e5.l lVar = org.telegram.messenger.r1.f25028l;
        if (lVar != null && !lVar.h.isEmpty()) {
            if (ms0Var2.f47780f == null) {
                ms0Var2.f47780f = org.telegram.messenger.r1.f25028l;
            }
            ms0Var2.a();
            if (ms0Var2.f47781g == null) {
                return;
            }
            org.telegram.messenger.r1.i().p("subs", new cg.e0(d2Var, i3, bVar, ms0Var2, 8));
        }
    }

    public static String q0(int i3) {
        switch (i3) {
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

    public static void r0(int i3, ArrayList arrayList, boolean z10) {
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        SparseIntArray sparseIntArray = s12.P0;
        if (!z10) {
            arrayList.add(new ls0(29, 2131231129, org.telegram.messenger.bd.M0(2131747061, null), org.telegram.messenger.bd.M0(2131747060, null)));
            arrayList.add(new ls0(30, 2131231148, org.telegram.messenger.bd.M0(2131747059, null), org.telegram.messenger.bd.M0(2131747058, null)));
            arrayList.add(new ls0(31, 2131231133, org.telegram.messenger.bd.M0(2131747057, null), org.telegram.messenger.bd.M0(2131747056, null)));
            arrayList.add(new ls0(32, 2131232569, org.telegram.messenger.bd.M0(2131747065, null), org.telegram.messenger.bd.M0(2131747064, null)));
            arrayList.add(new ls0(33, 2131231143, org.telegram.messenger.bd.M0(2131747072, null), org.telegram.messenger.bd.M0(2131747071, null)));
            arrayList.add(new ls0(34, 2131231144, org.telegram.messenger.bd.M0(2131747067, null), org.telegram.messenger.bd.M0(2131747066, null)));
            arrayList.add(new ls0(37, 2131231147, org.telegram.messenger.bd.M0(2131747070, null), org.telegram.messenger.bd.M0(2131747069, null)));
            arrayList.add(new ls0(36, 2131231149, org.telegram.messenger.bd.M0(2131747063, null), org.telegram.messenger.bd.M0(2131747062, null)));
        } else {
            arrayList.add(new ls0(12, 2131231150, org.telegram.messenger.bd.M0(2131747024, null), org.telegram.messenger.bd.M0(2131747023, null)));
            arrayList.add(new ls0(35, 2131232570, org.telegram.messenger.bd.M0(2131747010, null), org.telegram.messenger.bd.M0(2131747009, null)));
            arrayList.add(new ls0(14, 2131231146, org.telegram.messenger.bd.M0(2131747022, null), org.telegram.messenger.bd.M0(2131747021, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((ls0) arrayList.get(i10)).f47430a, -1) == -1) {
                    boolean z11 = org.telegram.messenger.r2.f25040a;
                }
            }
        }
        Collections.sort(arrayList, new as0(s12, 0));
    }

    public static void s0(int i3, ArrayList arrayList) {
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        arrayList.add(new ls0(0, 2131232306, org.telegram.messenger.bd.M0(2131747006, null), org.telegram.messenger.bd.a0(null, null, 2131747005, Integer.valueOf(s12.E4), Integer.valueOf(s12.M4), Integer.valueOf(s12.Q4), Integer.valueOf(s12.S4), 4)));
        arrayList.add(new ls0(14, 2131232154, org.telegram.messenger.bd.M0(2131746982, null), org.telegram.messenger.bd.a0(null, null, 2131746981, new Object[0])));
        arrayList.add(new ls0(1, 2131232315, org.telegram.messenger.bd.M0(2131746972, null), org.telegram.messenger.bd.M0(2131746971, null)));
        arrayList.add(new ls0(2, 2131232312, org.telegram.messenger.bd.M0(2131747020, null), org.telegram.messenger.bd.M0(2131747019, null)));
        arrayList.add(new ls0(8, 2131232316, org.telegram.messenger.bd.M0(2131746970, null), org.telegram.messenger.bd.M0(2131746969, null)));
        arrayList.add(new ls0(3, 2131232301, org.telegram.messenger.bd.M0(2131747000, null), org.telegram.messenger.bd.M0(2131746999, null)));
        arrayList.add(new ls0(4, 2131232311, org.telegram.messenger.bd.M0(2131746990, null), org.telegram.messenger.bd.M0(2131746989, null)));
        arrayList.add(new ls0(5, 2131232313, org.telegram.messenger.bd.M0(2131746984, null), org.telegram.messenger.bd.M0(2131746983, null)));
        arrayList.add(new ls0(11, 2131232304, org.telegram.messenger.bd.M0(2131747015, null), org.telegram.messenger.bd.M0(2131747014, null)));
        arrayList.add(new ls0(9, 2131231859, org.telegram.messenger.bd.M0(2131747033, null), org.telegram.messenger.bd.M0(2131747032, null)));
        arrayList.add(new ls0(6, 2131232303, org.telegram.messenger.bd.M0(2131746995, null), org.telegram.messenger.bd.M0(2131746994, null)));
        arrayList.add(new ls0(27, 2131231131, org.telegram.messenger.bd.M0(2131746997, null), org.telegram.messenger.bd.M0(2131746996, null)));
        arrayList.add(new ls0(7, 2131232302, org.telegram.messenger.bd.M0(2131747030, null), org.telegram.messenger.bd.M0(2131747029, null)));
        arrayList.add(new ls0(24, 2131232570, org.telegram.messenger.bd.M0(2131746979, null), org.telegram.messenger.bd.M0(2131746977, null)));
        arrayList.add(new ls0(10, 2131232305, org.telegram.messenger.bd.M0(2131747028, null), org.telegram.messenger.bd.M0(2131747027, null)));
        arrayList.add(new ls0(12, 2131232569, org.telegram.messenger.bd.M0(2131747012, null), org.telegram.messenger.bd.M0(2131747011, null)));
        arrayList.add(new ls0(13, 2131232314, org.telegram.messenger.bd.M0(2131746974, null), org.telegram.messenger.bd.M0(2131746973, null)));
        arrayList.add(new ls0(22, 2131232571, org.telegram.messenger.bd.M0(2131746967, null), org.telegram.messenger.bd.M0(2131746966, null)));
        arrayList.add(new ls0(23, 2131232567, org.telegram.messenger.bd.M0(2131746993, null), org.telegram.messenger.bd.M0(2131746992, null)));
        arrayList.add(new ls0(26, 2131231858, org.telegram.messenger.bd.M0(2131747008, null), org.telegram.messenger.bd.M0(2131747007, null)));
        arrayList.add(new ls0(28, 2131231145, org.telegram.messenger.bd.M0(2131744262, null), org.telegram.messenger.bd.M0(2131747025, null)));
        arrayList.add(new ls0(38, 2131231855, org.telegram.messenger.bd.M0(2131747017, null), org.telegram.messenger.bd.M0(2131747016, null)));
        arrayList.add(new ls0(39, 2131232305, org.telegram.messenger.bd.M0(2131746976, null), org.telegram.messenger.bd.M0(2131746975, null)));
        arrayList.add(new ls0(41, 2131231170, org.telegram.messenger.bd.M0(2131746986, null), org.telegram.messenger.bd.M0(2131746985, null)));
        arrayList.add(new ls0(42, 2131232566, org.telegram.messenger.bd.M0(2131747035, null), org.telegram.messenger.bd.M0(2131747034, null)));
        arrayList.add(new ls0(43, 2131232568, org.telegram.messenger.bd.M0(2131746988, null), org.telegram.messenger.bd.M0(2131746987, null)));
        SparseIntArray sparseIntArray = s12.O0;
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((ls0) arrayList.get(i10)).f47430a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.r2.f25040a;
                }
            }
        }
        Collections.sort(arrayList, new as0(s12, 1));
    }

    public static java.lang.String t0(int r17, org.telegram.ui.ms0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.t0(int, org.telegram.ui.ms0):java.lang.String");
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).sendRequest(tL_help_saveAppLog, new ei.u5(9));
    }

    public static void v0(int i3, int i10) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i3).getCurrentTime();
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
        ConnectionsManager.getInstance(i3).sendRequest(tL_help_saveAppLog, new ei.u5(9));
    }

    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new ei.u5(9));
    }

    public final void A0(boolean z10) {
        ci.ic icVar;
        if (z10 != this.f41633a0) {
            this.f41633a0 = z10;
            ks0 ks0Var = this.V;
            if (ks0Var != null && (icVar = ks0Var.d) != null) {
                icVar.setDialogVisible(z10);
            }
            this.W.setPaused(z10);
            this.f41640e0.invalidate();
        }
    }

    public final void B0() {
        boolean z10;
        ms0 ms0Var;
        this.f41665y = -1;
        this.F = -1;
        this.f41656s = -1;
        this.f41661w = -1;
        this.f41663x = -1;
        this.H = -1;
        this.showAdsRow = -1;
        this.I = -1;
        this.h = 1;
        this.f41649n = 1;
        int size = this.f41634b.size() + 1;
        this.h = size;
        this.f41654r = size;
        int i3 = this.f41644h0;
        if (i3 == 1 && getUserConfig().q()) {
            int i10 = this.h;
            int i11 = i10 + 1;
            this.f41665y = i10;
            int i12 = i10 + 2;
            this.h = i12;
            this.f41656s = i11;
            this.f41661w = i12;
            int size2 = this.f41636c.size() + i12;
            this.h = size2;
            this.f41663x = size2;
        }
        int i13 = this.h;
        this.E = i13;
        this.h = i13 + 2;
        this.G = i13 + 1;
        if (i3 == 1 && getUserConfig().q()) {
            int i14 = this.h;
            this.H = i14;
            this.showAdsRow = i14 + 1;
            this.h = i14 + 3;
            this.I = i14 + 2;
        }
        FrameLayout frameLayout = this.K;
        int i15 = 0;
        if (getUserConfig().q() && ((ms0Var = this.f41641f) == null || ms0Var.f47776a.months >= ((ms0) this.d.get(this.f41639e)).f47776a.months || this.f41653q0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.messenger.g0.Z3(frameLayout, z10, 1.0f, true, false);
        if (this.K.getVisibility() == 0) {
            i15 = org.telegram.messenger.g0.L(64.0f);
        }
        org.telegram.ui.Components.jy jyVar = this.Q;
        jyVar.M = (this.Y + i15) - org.telegram.messenger.g0.L(16.0f);
        jyVar.p1();
        this.Q.S = i15;
    }

    @Override
    public final boolean canBeginSlide() {
        ci.ic icVar;
        ks0 ks0Var = this.V;
        if (ks0Var != null && (icVar = ks0Var.d) != null && icVar.f57664a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        float f10;
        this.A0 = new na(this, 2);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.R;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ck, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bk, false);
        int i3 = org.telegram.ui.ActionBar.k6.Ak;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.S = linearGradient2;
        linearGradient2.setLocalMatrix(this.T);
        this.U.setShader(this.S);
        this.M = new yr0(context, null);
        this.N = new vg.n1(context);
        ArrayList arrayList = this.f41634b;
        arrayList.clear();
        ArrayList arrayList2 = this.f41636c;
        arrayList2.clear();
        int i10 = this.f41644h0;
        if (i10 == 0) {
            s0(this.currentAccount, arrayList);
        } else {
            r0(this.currentAccount, arrayList, false);
            r0(this.currentAccount, arrayList2, true);
            lg.u1.f(this.currentAccount).h();
            if (getUserConfig().q()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                org.telegram.messenger.li.b0(this.currentAccount).m0(tL_inputStickerSetShortName, false);
                lg.f.a(this.currentAccount).c(null);
                if (getMessagesController().W0.isEmpty()) {
                    getMessagesController().d3();
                }
                lg.z d = lg.z.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable g7 = k2.p1.g(context, 2131232726);
        this.J = g7;
        g7.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f27954h5), PorterDuff.Mode.MULTIPLY));
        this.J.getPadding(rect);
        this.Y = org.telegram.messenger.g0.f22602m;
        this.f41640e0 = new bs0(this, context);
        kh.k kVar = new kh.k(this.f41640e0);
        bs0 bs0Var = this.f41640e0;
        eh.c cVar = this.f41666y0;
        cVar.h = kVar;
        cVar.f9986i = bs0Var;
        kh.k kVar2 = new kh.k(this.f41640e0);
        bs0 bs0Var2 = this.f41640e0;
        eh.c cVar2 = this.f41667z0;
        cVar2.h = kVar2;
        cVar2.f9986i = bs0Var2;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f41632a = tj0Var;
        tj0Var.setClipToOutline(true);
        this.f41632a.setOutlineProvider(new gh.a(this, 8));
        this.f41632a.D0(new zr0(this, 1));
        this.f41632a.setCaptureSectionsDecoratorAllowed(true);
        this.f41632a.setLegacySections(true);
        this.f41632a.setSections(true);
        this.f41632a.setClipToPadding(false);
        org.telegram.ui.Components.tj0 tj0Var2 = this.f41632a;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy((org.telegram.messenger.g0.L(68.0f) + this.Y) - org.telegram.messenger.g0.L(16.0f), this.f41632a);
        this.Q = jyVar;
        tj0Var2.setLayoutManager(jyVar);
        this.Q.R = true;
        this.f41632a.setAdapter(new fs0(this));
        this.f41632a.j(new h3(this, 25));
        this.V = new ks0(this, context);
        vg.t1 t1Var = new vg.t1(context);
        this.W = t1Var;
        t1Var.c();
        if (i10 == 1) {
            if (this.f41645i0) {
                vg.s1 s1Var = this.W.f56857a;
                s1Var.f56843q = true;
                s1Var.K = false;
                s1Var.H = true;
                s1Var.J = true;
                f10 = 28.0f;
                s1Var.f56837k = org.telegram.messenger.g0.L(-14.0f);
                vg.s1 s1Var2 = this.W.f56857a;
                s1Var2.f56849x = 2000L;
                s1Var2.f56850y = 3000;
                s1Var2.f56844r = 16;
                s1Var2.G = false;
                s1Var2.O = 28;
                s1Var2.Q = i3;
            } else {
                f10 = 28.0f;
                vg.s1 s1Var3 = this.W.f56857a;
                s1Var3.J = true;
                s1Var3.f56837k = org.telegram.messenger.g0.L(28.0f);
                vg.s1 s1Var4 = this.W.f56857a;
                s1Var4.f56849x = 2000L;
                s1Var4.f56850y = 3000;
                s1Var4.f56844r = 16;
                s1Var4.G = false;
                s1Var4.O = 28;
            }
        } else {
            f10 = 28.0f;
        }
        this.V.d.setStarParticlesView(this.W);
        this.f41640e0.addView(this.W, b8.mf.c(-2.0f, -1));
        this.f41640e0.addView(this.V, b8.mf.c(-2.0f, -1));
        this.f41632a.setOnItemClickListener(new h(this, 24));
        this.f41640e0.addView(this.f41632a, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.L = new FrameLayout(context);
        vg.o0 o0Var = new vg.o0(context, getResourceProvider(), false);
        this.f41642f0 = o0Var;
        o0Var.L = true;
        o0Var.setClickable(false);
        o0Var.f56767w.setClickable(false);
        o0Var.setStateListAnimator(null);
        y0(false);
        this.K = new FrameLayout(context);
        this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.L.addView(this.f41642f0, b8.mf.c(-1.0f, -1));
        View view = this.L;
        gh.g c2 = cVar.c(view, null, false);
        c2.p(b8.cd.j(this.resourceProvider));
        c2.r(org.telegram.messenger.g0.L(f10));
        c2.q(org.telegram.messenger.g0.L(5.0f));
        view.setBackground(c2);
        b8.pf.b(this.L, 0.02f, 1.5f);
        this.K.addView(this.L, b8.mf.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        eh.d dVar = new eh.d(cVar.c(this.K, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), false);
        this.f41662w0 = new eh.d(cVar.c(this.f41640e0, null, false));
        this.K.setBackground(dVar);
        if (getUserConfig().p()) {
            this.f41640e0.addView(this.K, b8.mf.e(-1, -2, 80));
        }
        this.fragmentView = this.f41640e0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.actionBar.setBackButtonImage(2131231241);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 29));
        this.actionBar.setForceSkipTouches(true);
        this.f41640e0.addView(this.actionBar, b8.mf.e(-1, -2, 48));
        z0();
        B0();
        this.V.d.m(200L);
        if (this.f41653q0) {
            org.telegram.messenger.g0.i3(new zr0(this, 2), 400L);
        }
        org.telegram.messenger.li.b0(this.currentAccount).o1();
        w0(this.f41646j0);
        View view2 = this.fragmentView;
        ci0 ci0Var = new ci0(this, 8);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(view2, ci0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23253j5;
        int i12 = org.telegram.messenger.hs.f23236g5;
        if (i3 == i11 || i3 == i12) {
            y0(false);
            this.V.a();
        }
        if (i3 != org.telegram.messenger.hs.f23230f5 && i3 != i12) {
            return;
        }
        this.V.b();
        this.V.a();
        B0();
        this.f41632a.getAdapter().f();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.f28339c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(16, this), org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, org.telegram.ui.ActionBar.k6.Bk, org.telegram.ui.ActionBar.k6.Ck, org.telegram.ui.ActionBar.k6.Dk, org.telegram.ui.ActionBar.k6.Ek, org.telegram.ui.ActionBar.k6.Fk, org.telegram.ui.ActionBar.k6.Gk, org.telegram.ui.ActionBar.k6.Hk, org.telegram.ui.ActionBar.k6.Jk, org.telegram.ui.ActionBar.k6.Kk, org.telegram.ui.ActionBar.k6.Ik, org.telegram.ui.ActionBar.k6.Nk);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f41645i0;
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
        eh.g gVar;
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f41664x0) != null) {
            this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f41652p0.d) - org.telegram.messenger.g0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f) + this.fragmentView.getMeasuredHeight());
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
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23253j5);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23230f5);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23236g5);
        if (getMediaDataController().E != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().E.videos;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.Document document = arrayList.get(i3);
                i3++;
                org.telegram.messenger.w7.G(this.currentAccount).X(document, getMediaDataController().E, 3, 0);
            }
        }
        if (this.f41644h0 == 1) {
            lg.y1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23253j5);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23230f5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23236g5);
    }

    @Override
    public final void onPause() {
        ci.ic icVar;
        super.onPause();
        ks0 ks0Var = this.V;
        if (ks0Var != null && (icVar = ks0Var.d) != null) {
            icVar.setDialogVisible(true);
        }
        vg.t1 t1Var = this.W;
        if (t1Var != null) {
            t1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        ci.ic icVar;
        super.onResume();
        ks0 ks0Var = this.V;
        if (ks0Var != null && (icVar = ks0Var.d) != null) {
            icVar.setPaused(false);
            this.V.d.setDialogVisible(false);
        }
        this.W.setPaused(false);
        setBulletinDelegate(new x8(this, 7));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27954h5);
        Drawable drawable = this.J;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            vg.t1 t1Var = this.W;
            if (t1Var != null && t1Var.f56857a != null && this.f41640e0 != null) {
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
        ks0 ks0Var;
        if (this.f41640e0.getMeasuredWidth() != 0 && this.f41640e0.getMeasuredHeight() != 0 && (ks0Var = this.V) != null && ks0Var.d != null) {
            if (this.f41645i0) {
                int f10 = i0.a.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.k6.Ak), getThemedColor(org.telegram.ui.ActionBar.k6.f27954h5));
                ci.ic icVar = this.f41657s0;
                ci.ic icVar2 = this.V.d;
                if (icVar != icVar2 || this.f41658t0 != f10) {
                    this.f41657s0 = icVar2;
                    this.f41658t0 = f10;
                    Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(f10);
                    this.V.d.setBackgroundBitmap(createBitmap);
                    return;
                }
                return;
            }
            int measuredWidth = this.f41640e0.getMeasuredWidth();
            int measuredHeight = this.f41640e0.getMeasuredHeight();
            vg.x0 x0Var = this.f41650n0;
            x0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.m0;
            canvas.save();
            canvas.scale(100.0f / this.f41640e0.getMeasuredWidth(), 100.0f / this.f41640e0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f41640e0.getMeasuredWidth(), this.f41640e0.getMeasuredHeight(), x0Var.f56911f);
            canvas.restore();
            this.V.d.setBackgroundBitmap(this.f41648l0);
        }
    }

    public final void y0(boolean z10) {
        if (this.f41642f0 != null) {
            boolean q10 = getUserConfig().q();
            ArrayList arrayList = this.d;
            if (!q10 || this.f41641f == null || this.f41639e >= arrayList.size() || ((ms0) arrayList.get(this.f41639e)).f47776a.months >= this.f41641f.f47776a.months) {
                if (org.telegram.messenger.bd.f21784a0) {
                    z10 = false;
                }
                if (!org.telegram.messenger.r2.b() && (!org.telegram.messenger.r1.i().k() || arrayList.isEmpty() || this.f41639e >= arrayList.size() || ((ms0) arrayList.get(this.f41639e)).f47780f == null)) {
                    this.f41642f0.b(org.telegram.messenger.bd.M0(2131748787, null), null, z10);
                    this.L.setOnClickListener(new ai.t(25));
                    this.f41642f0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.f41639e < arrayList.size()) {
                    this.f41642f0.b(t0(this.currentAccount, (ms0) arrayList.get(this.f41639e)), null, z10);
                    this.L.setOnClickListener(new b40(this, 25));
                    this.f41642f0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void z0() {
        int i3;
        int i10;
        wg.f fVar;
        if (this.V != null && this.actionBar != null) {
            boolean z10 = this.f41645i0;
            if (z10) {
                i3 = org.telegram.ui.ActionBar.k6.G6;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.Hk;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            if (x02 != this.f41659u0) {
                this.f41659u0 = x02;
                this.actionBar.D(x02, true);
                this.actionBar.D(x02, false);
            }
            int i11 = org.telegram.ui.ActionBar.k6.Hk;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 60);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.f27732q0 != o10) {
                kVar.C(o10, false);
            }
            this.W.f56857a.g();
            ks0 ks0Var = this.V;
            if (ks0Var != null) {
                TextView textView = ks0Var.f47007a;
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.k6.G6;
                } else {
                    i10 = i11;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                TextView textView2 = this.V.f47008b;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.k6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                ci.ic icVar = this.V.d;
                if (icVar != null && (fVar = icVar.f57666b) != null) {
                    if (z10) {
                        fVar.f57650z = org.telegram.ui.ActionBar.k6.Lk;
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
