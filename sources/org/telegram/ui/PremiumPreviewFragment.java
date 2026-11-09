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
    public ks0 L;
    public ug.k1 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.my P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public ws0 U;
    public ug.q1 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.qj0 f41612a;
    public boolean f41613a0;
    public final ArrayList f41614b;
    public float f41615b0;
    public final ArrayList f41616c;
    public int f41617c0;
    public final ArrayList d;
    public ns0 f41618d0;
    public int f41619e;
    public ug.p0 f41620e0;
    public ys0 f41621f;
    public float f41622f0;
    public final int f41623g0;
    public int h;
    public final boolean f41624h0;
    public final String f41625i0;
    public boolean f41626j0;
    public final Bitmap f41627k0;
    public final Canvas f41628l0;
    public final ug.y0 m0;
    public int f41629n;
    public final ug.y0 f41630n0;
    public i0.b f41631o0;
    public boolean f41632p0;
    public float f41633q0;
    public int f41634r;
    public bi.qd f41635r0;
    public int f41636s;
    public int f41637s0;
    int showAdsRow;
    public int f41638t0;
    public ps0 f41639u0;
    public dh.d f41640v0;
    public int f41641w;
    public final dh.g f41642w0;
    public int f41643x;
    public final dh.c f41644x0;
    public int f41645y;
    public final dh.c f41646y0;
    public oa f41647z0;

    public PremiumPreviewFragment(int i7, String str) {
        super(null);
        this.f41614b = new ArrayList();
        this.f41616c = new ArrayList();
        this.d = new ArrayList();
        boolean z9 = false;
        this.f41619e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f41627k0 = createBitmap;
        this.f41628l0 = new Canvas(createBitmap);
        this.m0 = new ug.y0(org.telegram.ui.ActionBar.l6.Dk, org.telegram.ui.ActionBar.l6.Ek, org.telegram.ui.ActionBar.l6.Fk, org.telegram.ui.ActionBar.l6.Gk, null);
        this.f41631o0 = i0.b.f15119e;
        ug.y0 y0Var = new ug.y0(org.telegram.ui.ActionBar.l6.zk, org.telegram.ui.ActionBar.l6.Ak, -1, -1, null);
        this.f41630n0 = y0Var;
        y0Var.f56887m = true;
        y0Var.f56889o = 0.0f;
        y0Var.f56890p = 0.0f;
        y0Var.f56891q = 1.0f;
        y0Var.f56878b = 0.0f;
        y0Var.f56879c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.A0 = arrayList;
        RectF rectF = new RectF();
        this.B0 = rectF;
        arrayList.add(rectF);
        this.f41623g0 = i7;
        if (!org.telegram.ui.ActionBar.l6.I.q() && i7 == 1) {
            z9 = true;
        }
        this.f41624h0 = z9;
        this.f41625i0 = str;
        ?? obj = new Object();
        obj.f19612b = this;
        obj.f19611a = new Paint();
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(true);
            this.f41642w0 = gVar;
            ri.f fVar = new ri.f(null);
            fVar.d = gVar;
            fVar.f54584e = -3;
            fVar.f54585f = obj;
            this.f41644x0 = new dh.c(fVar, fVar, fVar);
        } else {
            this.f41642w0 = null;
            this.f41644x0 = new dh.c(obj, obj, obj);
        }
        this.f41646y0 = new dh.c(obj, obj, obj);
    }

    public static void Z(PremiumPreviewFragment premiumPreviewFragment, View view, int i7) {
        ys0 ys0Var;
        boolean z9;
        org.telegram.ui.Components.g5 g5Var;
        ks0 ks0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int L;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i14 = premiumPreviewFragment.f41623g0;
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
            } else if (view instanceof ks0) {
                ks0 ks0Var2 = (ks0) view;
                if (i14 == 1 && premiumPreviewFragment.getUserConfig().q()) {
                    int i15 = ks0Var2.f47362f.f51756a;
                    if (i15 == 29) {
                        premiumPreviewFragment.presentFragment(new kg.a1());
                        return;
                    } else if (i15 == 32) {
                        premiumPreviewFragment.presentFragment(new kg.s0());
                        return;
                    } else if (i15 == 33) {
                        ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                        f2Var.f17322f = -4;
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
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.v80(bundle, null));
                        return;
                    } else if (i15 == 12) {
                        Long h = org.telegram.messenger.t10.h(premiumPreviewFragment.getUserConfig().f());
                        bi.p5 p5Var = new bi.p5(21, premiumPreviewFragment, ks0Var2);
                        if (premiumPreviewFragment.f41639u0 == null) {
                            j11[] j11VarArr = new j11[1];
                            if (ks0Var2.getHeight() + ks0Var2.getTop() > premiumPreviewFragment.f41612a.getMeasuredHeight() / 2.0f) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            Point point = org.telegram.messenger.g0.f22563q;
                            int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                            int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                            org.telegram.ui.Components.g5 g5Var2 = ks0Var2.h;
                            if (g5Var2 != null) {
                                Drawable[] drawableArr = g5Var2.f33866f;
                                Drawable drawable = drawableArr[1];
                                if (drawable != null) {
                                    if (drawable instanceof org.telegram.ui.Components.i5) {
                                        ((org.telegram.ui.Components.i5) drawable).o(g5Var2);
                                    }
                                    drawableArr[1] = null;
                                }
                                org.telegram.ui.Components.g5 g5Var3 = ks0Var2.h;
                                if (g5Var3 != null) {
                                    g5Var3.f();
                                    ks0Var2.c();
                                    Rect rect = org.telegram.messenger.g0.Q;
                                    rect.set(ks0Var2.h.getBounds());
                                    if (z9) {
                                        L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                                    } else {
                                        L = (-(ks0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                                    }
                                    i11 = rect.centerX() - (point.x - min2);
                                    g5Var = g5Var3;
                                    i10 = L;
                                } else {
                                    g5Var = g5Var3;
                                    i10 = 0;
                                    i11 = 0;
                                }
                                ks0Var = ks0Var2;
                            } else {
                                g5Var = null;
                                ks0Var = null;
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
                            org.telegram.ui.ActionBar.g6 resourceProvider = premiumPreviewFragment.getResourceProvider();
                            if (z9) {
                                i13 = 24;
                            } else {
                                i13 = 16;
                            }
                            os0 os0Var = new os0(premiumPreviewFragment, premiumPreviewFragment, parentActivity, valueOf, i12, resourceProvider, i13, p5Var, j11VarArr);
                            os0Var.f49679g1 = true;
                            os0Var.setSelected(h);
                            os0Var.setSaveState(3);
                            os0Var.y(g5Var, ks0Var);
                            ps0 ps0Var = new ps0(premiumPreviewFragment, os0Var);
                            premiumPreviewFragment.f41639u0 = ps0Var;
                            j11VarArr[0] = ps0Var;
                            ps0Var.showAsDropDown(ks0Var2, 0, i16, 53);
                            j11VarArr[0].b();
                            return;
                        }
                        return;
                    } else if (i15 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f41247f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i15 == 36) {
                        premiumPreviewFragment.presentFragment(new kg.m());
                        return;
                    } else if (i15 == 37) {
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.o41());
                        return;
                    } else {
                        return;
                    }
                }
                v0(premiumPreviewFragment.currentAccount, ks0Var2.f47362f.f51756a);
                int i17 = premiumPreviewFragment.f41619e;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    ys0Var = (ys0) arrayList.get(premiumPreviewFragment.f41619e);
                } else {
                    ys0Var = null;
                }
                Activity parentActivity2 = premiumPreviewFragment.getParentActivity();
                int i18 = premiumPreviewFragment.currentAccount;
                if (i14 == 1) {
                    z10 = true;
                }
                premiumPreviewFragment.showDialog(new ug.w0(premiumPreviewFragment, parentActivity2, i18, z10, ks0Var2.f47362f.f51756a, false, ys0Var));
            }
        }
    }

    public static org.telegram.ui.ActionBar.k j0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void p0(org.telegram.ui.ActionBar.f2 f2Var, ys0 ys0Var, String str, com.google.android.gms.internal.clearcut.z0 z0Var) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z9 = org.telegram.messenger.r2.f25212a;
        if (f2Var == null) {
            currentAccount = org.telegram.messenger.p10.f24470s0;
        } else {
            currentAccount = f2Var.getCurrentAccount();
        }
        int i7 = currentAccount;
        if (org.telegram.messenger.qp.s1(i7).v2()) {
            b.b(i7);
            return;
        }
        if (ys0Var == null && (tL_help_premiumPromo = org.telegram.messenger.ui.b0(i7).D) != null) {
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
                    ys0Var = new ys0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    ys0Var = new ys0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        ys0 ys0Var2 = ys0Var;
        u0();
        if (org.telegram.messenger.r2.b()) {
            if (f2Var != null) {
                activity = f2Var.getParentActivity();
            } else {
                activity = LaunchActivity.G1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (ys0Var2 != null && (tL_premiumSubscriptionOption = ys0Var2.f52182a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.W0 = true;
                    }
                    vf.c.t(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                if (!TextUtils.isEmpty(s12.f24895s6)) {
                    launchActivity.W0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + s12.f24895s6 + "?start=" + str)), null);
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
        f5.l lVar = org.telegram.messenger.r1.f25198l;
        if (lVar != null && !lVar.h.isEmpty()) {
            if (ys0Var2.f52186f == null) {
                ys0Var2.f52186f = org.telegram.messenger.r1.f25198l;
            }
            ys0Var2.a();
            if (ys0Var2.f52187g == null) {
                return;
            }
            org.telegram.messenger.r1.i().p("subs", new bg.f0(f2Var, i7, z0Var, ys0Var2, 8));
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
            arrayList.add(new xs0(29, 2131231129, org.telegram.messenger.id.M0(2131747053, null), org.telegram.messenger.id.M0(2131747052, null)));
            arrayList.add(new xs0(30, 2131231148, org.telegram.messenger.id.M0(2131747051, null), org.telegram.messenger.id.M0(2131747050, null)));
            arrayList.add(new xs0(31, 2131231133, org.telegram.messenger.id.M0(2131747049, null), org.telegram.messenger.id.M0(2131747048, null)));
            arrayList.add(new xs0(32, 2131232571, org.telegram.messenger.id.M0(2131747057, null), org.telegram.messenger.id.M0(2131747056, null)));
            arrayList.add(new xs0(33, 2131231143, org.telegram.messenger.id.M0(2131747064, null), org.telegram.messenger.id.M0(2131747063, null)));
            arrayList.add(new xs0(34, 2131231144, org.telegram.messenger.id.M0(2131747059, null), org.telegram.messenger.id.M0(2131747058, null)));
            arrayList.add(new xs0(37, 2131231147, org.telegram.messenger.id.M0(2131747062, null), org.telegram.messenger.id.M0(2131747061, null)));
            arrayList.add(new xs0(36, 2131231149, org.telegram.messenger.id.M0(2131747055, null), org.telegram.messenger.id.M0(2131747054, null)));
        } else {
            arrayList.add(new xs0(12, 2131231150, org.telegram.messenger.id.M0(2131747016, null), org.telegram.messenger.id.M0(2131747015, null)));
            arrayList.add(new xs0(35, 2131232572, org.telegram.messenger.id.M0(2131747002, null), org.telegram.messenger.id.M0(2131747001, null)));
            arrayList.add(new xs0(14, 2131231146, org.telegram.messenger.id.M0(2131747014, null), org.telegram.messenger.id.M0(2131747013, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((xs0) arrayList.get(i10)).f51756a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.r2.f25212a;
                }
            }
        }
        Collections.sort(arrayList, new ms0(s12, 0));
    }

    public static void s0(int i7, ArrayList arrayList) {
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        arrayList.add(new xs0(0, 2131232306, org.telegram.messenger.id.M0(2131746998, null), org.telegram.messenger.id.a0(null, null, 2131746997, Integer.valueOf(s12.E4), Integer.valueOf(s12.M4), Integer.valueOf(s12.Q4), Integer.valueOf(s12.S4), 4)));
        arrayList.add(new xs0(14, 2131232154, org.telegram.messenger.id.M0(2131746974, null), org.telegram.messenger.id.a0(null, null, 2131746973, new Object[0])));
        arrayList.add(new xs0(1, 2131232315, org.telegram.messenger.id.M0(2131746964, null), org.telegram.messenger.id.M0(2131746963, null)));
        arrayList.add(new xs0(2, 2131232312, org.telegram.messenger.id.M0(2131747012, null), org.telegram.messenger.id.M0(2131747011, null)));
        arrayList.add(new xs0(8, 2131232316, org.telegram.messenger.id.M0(2131746962, null), org.telegram.messenger.id.M0(2131746961, null)));
        arrayList.add(new xs0(3, 2131232301, org.telegram.messenger.id.M0(2131746992, null), org.telegram.messenger.id.M0(2131746991, null)));
        arrayList.add(new xs0(4, 2131232311, org.telegram.messenger.id.M0(2131746982, null), org.telegram.messenger.id.M0(2131746981, null)));
        arrayList.add(new xs0(5, 2131232313, org.telegram.messenger.id.M0(2131746976, null), org.telegram.messenger.id.M0(2131746975, null)));
        arrayList.add(new xs0(11, 2131232304, org.telegram.messenger.id.M0(2131747007, null), org.telegram.messenger.id.M0(2131747006, null)));
        arrayList.add(new xs0(9, 2131231859, org.telegram.messenger.id.M0(2131747025, null), org.telegram.messenger.id.M0(2131747024, null)));
        arrayList.add(new xs0(6, 2131232303, org.telegram.messenger.id.M0(2131746987, null), org.telegram.messenger.id.M0(2131746986, null)));
        arrayList.add(new xs0(27, 2131231131, org.telegram.messenger.id.M0(2131746989, null), org.telegram.messenger.id.M0(2131746988, null)));
        arrayList.add(new xs0(7, 2131232302, org.telegram.messenger.id.M0(2131747022, null), org.telegram.messenger.id.M0(2131747021, null)));
        arrayList.add(new xs0(24, 2131232572, org.telegram.messenger.id.M0(2131746971, null), org.telegram.messenger.id.M0(2131746969, null)));
        arrayList.add(new xs0(10, 2131232305, org.telegram.messenger.id.M0(2131747020, null), org.telegram.messenger.id.M0(2131747019, null)));
        arrayList.add(new xs0(12, 2131232571, org.telegram.messenger.id.M0(2131747004, null), org.telegram.messenger.id.M0(2131747003, null)));
        arrayList.add(new xs0(13, 2131232314, org.telegram.messenger.id.M0(2131746966, null), org.telegram.messenger.id.M0(2131746965, null)));
        arrayList.add(new xs0(22, 2131232573, org.telegram.messenger.id.M0(2131746959, null), org.telegram.messenger.id.M0(2131746958, null)));
        arrayList.add(new xs0(23, 2131232569, org.telegram.messenger.id.M0(2131746985, null), org.telegram.messenger.id.M0(2131746984, null)));
        arrayList.add(new xs0(26, 2131231858, org.telegram.messenger.id.M0(2131747000, null), org.telegram.messenger.id.M0(2131746999, null)));
        arrayList.add(new xs0(28, 2131231145, org.telegram.messenger.id.M0(2131744252, null), org.telegram.messenger.id.M0(2131747017, null)));
        arrayList.add(new xs0(38, 2131231855, org.telegram.messenger.id.M0(2131747009, null), org.telegram.messenger.id.M0(2131747008, null)));
        arrayList.add(new xs0(39, 2131232305, org.telegram.messenger.id.M0(2131746968, null), org.telegram.messenger.id.M0(2131746967, null)));
        arrayList.add(new xs0(41, 2131231170, org.telegram.messenger.id.M0(2131746978, null), org.telegram.messenger.id.M0(2131746977, null)));
        arrayList.add(new xs0(42, 2131232568, org.telegram.messenger.id.M0(2131747027, null), org.telegram.messenger.id.M0(2131747026, null)));
        arrayList.add(new xs0(43, 2131232570, org.telegram.messenger.id.M0(2131746980, null), org.telegram.messenger.id.M0(2131746979, null)));
        SparseIntArray sparseIntArray = s12.N0;
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((xs0) arrayList.get(i10)).f51756a, -1) == -1) {
                    boolean z9 = org.telegram.messenger.r2.f25212a;
                }
            }
        }
        Collections.sort(arrayList, new ms0(s12, 1));
    }

    public static java.lang.String t0(int r17, org.telegram.ui.ys0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.t0(int, org.telegram.ui.ys0):java.lang.String");
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).sendRequest(tL_help_saveAppLog, new di.v5(9));
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
        ConnectionsManager.getInstance(i7).sendRequest(tL_help_saveAppLog, new di.v5(9));
    }

    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new di.v5(9));
    }

    public final void A0(boolean z9) {
        bi.qd qdVar;
        if (z9 != this.Z) {
            this.Z = z9;
            ws0 ws0Var = this.U;
            if (ws0Var != null && (qdVar = ws0Var.d) != null) {
                qdVar.setDialogVisible(z9);
            }
            this.V.setPaused(z9);
            this.f41618d0.invalidate();
        }
    }

    public final void B0() {
        boolean z9;
        ys0 ys0Var;
        this.f41645y = -1;
        this.E = -1;
        this.f41636s = -1;
        this.f41641w = -1;
        this.f41643x = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        this.h = 1;
        this.f41629n = 1;
        int size = this.f41614b.size() + 1;
        this.h = size;
        this.f41634r = size;
        int i7 = this.f41623g0;
        if (i7 == 1 && getUserConfig().q()) {
            int i10 = this.h;
            int i11 = i10 + 1;
            this.f41645y = i10;
            int i12 = i10 + 2;
            this.h = i12;
            this.f41636s = i11;
            this.f41641w = i12;
            int size2 = this.f41616c.size() + i12;
            this.h = size2;
            this.f41643x = size2;
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
        if (getUserConfig().q() && ((ys0Var = this.f41621f) == null || ys0Var.f52182a.months >= ((ys0) this.d.get(this.f41619e)).f52182a.months || this.f41632p0)) {
            z9 = false;
        } else {
            z9 = true;
        }
        org.telegram.messenger.g0.Z3(frameLayout, z9, 1.0f, true, false);
        if (this.J.getVisibility() == 0) {
            i15 = org.telegram.messenger.g0.L(64.0f);
        }
        org.telegram.ui.Components.my myVar = this.P;
        myVar.M = (this.X + i15) - org.telegram.messenger.g0.L(16.0f);
        myVar.p1();
        this.P.S = i15;
    }

    @Override
    public final boolean canBeginSlide() {
        bi.qd qdVar;
        ws0 ws0Var = this.U;
        if (ws0Var != null && (qdVar = ws0Var.d) != null && qdVar.f57422a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.f41647z0 = new oa(this, 2);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ck, false);
        int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Bk, false);
        int i7 = org.telegram.ui.ActionBar.l6.Ak;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.l6.x0(null, i7, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.zk, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.yk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new ks0(context, null);
        this.M = new ug.k1(context);
        ArrayList arrayList = this.f41614b;
        arrayList.clear();
        ArrayList arrayList2 = this.f41616c;
        arrayList2.clear();
        int i10 = this.f41623g0;
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
        h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.l6.f27938h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = org.telegram.messenger.g0.f22557m;
        this.f41618d0 = new ns0(this, context);
        jh.k kVar = new jh.k(this.f41618d0);
        ns0 ns0Var = this.f41618d0;
        dh.c cVar = this.f41644x0;
        cVar.h = kVar;
        cVar.f8706i = ns0Var;
        jh.k kVar2 = new jh.k(this.f41618d0);
        ns0 ns0Var2 = this.f41618d0;
        dh.c cVar2 = this.f41646y0;
        cVar2.h = kVar2;
        cVar2.f8706i = ns0Var2;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f41612a = qj0Var;
        qj0Var.setClipToOutline(true);
        this.f41612a.setOutlineProvider(new fh.a(this, 9));
        this.f41612a.D0(new ls0(this, 1));
        this.f41612a.setCaptureSectionsDecoratorAllowed(true);
        this.f41612a.setLegacySections(true);
        this.f41612a.setSections(true);
        this.f41612a.setClipToPadding(false);
        org.telegram.ui.Components.qj0 qj0Var2 = this.f41612a;
        org.telegram.ui.Components.my myVar = new org.telegram.ui.Components.my((org.telegram.messenger.g0.L(68.0f) + this.X) - org.telegram.messenger.g0.L(16.0f), this.f41612a);
        this.P = myVar;
        qj0Var2.setLayoutManager(myVar);
        this.P.R = true;
        this.f41612a.setAdapter(new rs0(this));
        this.f41612a.j(new g3(this, 25));
        this.U = new ws0(this, context);
        ug.q1 q1Var = new ug.q1(context);
        this.V = q1Var;
        q1Var.c();
        if (i10 == 1) {
            if (this.f41624h0) {
                ug.p1 p1Var = this.V.f56806a;
                p1Var.f56790q = true;
                p1Var.K = false;
                p1Var.H = true;
                p1Var.J = true;
                p1Var.f56784k = org.telegram.messenger.g0.L(-14.0f);
                ug.p1 p1Var2 = this.V.f56806a;
                p1Var2.f56796x = 2000L;
                p1Var2.f56797y = 3000;
                p1Var2.f56791r = 16;
                p1Var2.G = false;
                p1Var2.O = 28;
                p1Var2.Q = i7;
            } else {
                ug.p1 p1Var3 = this.V.f56806a;
                p1Var3.J = true;
                p1Var3.f56784k = org.telegram.messenger.g0.L(28.0f);
                ug.p1 p1Var4 = this.V.f56806a;
                p1Var4.f56796x = 2000L;
                p1Var4.f56797y = 3000;
                p1Var4.f56791r = 16;
                p1Var4.G = false;
                p1Var4.O = 28;
            }
        }
        this.U.d.setStarParticlesView(this.V);
        this.f41618d0.addView(this.V, c8.ha.c(-2.0f, -1));
        this.f41618d0.addView(this.U, c8.ha.c(-2.0f, -1));
        this.f41612a.setOnItemClickListener(new h(this, 24));
        this.f41618d0.addView(this.f41612a, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.K = new FrameLayout(context);
        ug.p0 p0Var = new ug.p0(context, getResourceProvider(), false);
        this.f41620e0 = p0Var;
        p0Var.K = true;
        p0Var.setClickable(false);
        p0Var.f56773w.setClickable(false);
        p0Var.setStateListAnimator(null);
        y0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.K.addView(this.f41620e0, c8.ha.c(-1.0f, -1));
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
        this.f41640v0 = new dh.d(cVar.c(this.f41618d0, null, false));
        this.J.setBackground(dVar);
        if (getUserConfig().p()) {
            this.f41618d0.addView(this.J, c8.ha.e(-1, -2, 80));
        }
        this.fragmentView = this.f41618d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.actionBar.setBackButtonImage(2131231241);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new wx(this, 28));
        this.actionBar.setForceSkipTouches(true);
        this.f41618d0.addView(this.actionBar, c8.ha.e(-1, -2, 48));
        z0();
        B0();
        this.U.d.m(200L);
        if (this.f41632p0) {
            org.telegram.messenger.g0.i3(new ls0(this, 2), 400L);
        }
        org.telegram.messenger.ui.b0(this.currentAccount).o1();
        w0(this.f41625i0);
        View view2 = this.fragmentView;
        ni0 ni0Var = new ni0(this, 7);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(view2, ni0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25024j5;
        int i12 = org.telegram.messenger.qs.f25007g5;
        if (i7 == i11 || i7 == i12) {
            y0(false);
            this.U.a();
        }
        if (i7 != org.telegram.messenger.qs.f25001f5 && i7 != i12) {
            return;
        }
        this.U.b();
        this.U.a();
        B0();
        this.f41612a.getAdapter().f();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.o3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.o3.f28341c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(16, this), org.telegram.ui.ActionBar.l6.zk, org.telegram.ui.ActionBar.l6.Ak, org.telegram.ui.ActionBar.l6.Bk, org.telegram.ui.ActionBar.l6.Ck, org.telegram.ui.ActionBar.l6.Dk, org.telegram.ui.ActionBar.l6.Ek, org.telegram.ui.ActionBar.l6.Fk, org.telegram.ui.ActionBar.l6.Gk, org.telegram.ui.ActionBar.l6.Hk, org.telegram.ui.ActionBar.l6.Jk, org.telegram.ui.ActionBar.l6.Kk, org.telegram.ui.ActionBar.l6.Ik, org.telegram.ui.ActionBar.l6.Nk);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f41624h0;
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
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f41642w0) != null) {
            this.B0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f41631o0.d) - org.telegram.messenger.g0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f) + this.fragmentView.getMeasuredHeight());
            gVar.g(1, this.A0);
            gVar.e(this.f41647z0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
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
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25024j5);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25001f5);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25007g5);
        if (getMediaDataController().D != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().D.videos;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TLRPC.Document document = arrayList.get(i7);
                i7++;
                org.telegram.messenger.w7.G(this.currentAccount).W(document, getMediaDataController().D, 3, 0);
            }
        }
        if (this.f41623g0 == 1) {
            kg.x1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25024j5);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25001f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25007g5);
    }

    @Override
    public final void onPause() {
        bi.qd qdVar;
        super.onPause();
        ws0 ws0Var = this.U;
        if (ws0Var != null && (qdVar = ws0Var.d) != null) {
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
        ws0 ws0Var = this.U;
        if (ws0Var != null && (qdVar = ws0Var.d) != null) {
            qdVar.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new y8(this, 7));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.l6.f27938h5);
        Drawable drawable = this.I;
        if (drawable != null && (drawable != this.C0 || themedColor != this.D0)) {
            this.C0 = drawable;
            this.D0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            ug.q1 q1Var = this.V;
            if (q1Var != null && q1Var.f56806a != null && this.f41618d0 != null) {
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
        ws0 ws0Var;
        if (this.f41618d0.getMeasuredWidth() != 0 && this.f41618d0.getMeasuredHeight() != 0 && (ws0Var = this.U) != null && ws0Var.d != null) {
            if (this.f41624h0) {
                int f10 = i0.a.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.l6.Ak), getThemedColor(org.telegram.ui.ActionBar.l6.f27938h5));
                bi.qd qdVar = this.f41635r0;
                bi.qd qdVar2 = this.U.d;
                if (qdVar != qdVar2 || this.f41637s0 != f10) {
                    this.f41635r0 = qdVar2;
                    this.f41637s0 = f10;
                    Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(f10);
                    this.U.d.setBackgroundBitmap(createBitmap);
                    return;
                }
                return;
            }
            int measuredWidth = this.f41618d0.getMeasuredWidth();
            int measuredHeight = this.f41618d0.getMeasuredHeight();
            ug.y0 y0Var = this.m0;
            y0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f41628l0;
            canvas.save();
            canvas.scale(100.0f / this.f41618d0.getMeasuredWidth(), 100.0f / this.f41618d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f41618d0.getMeasuredWidth(), this.f41618d0.getMeasuredHeight(), y0Var.f56881f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.f41627k0);
        }
    }

    public final void y0(boolean z9) {
        if (this.f41620e0 != null) {
            boolean q10 = getUserConfig().q();
            ArrayList arrayList = this.d;
            if (!q10 || this.f41621f == null || this.f41619e >= arrayList.size() || ((ys0) arrayList.get(this.f41619e)).f52182a.months >= this.f41621f.f52182a.months) {
                if (org.telegram.messenger.id.f23157a0) {
                    z9 = false;
                }
                if (!org.telegram.messenger.r2.b() && (!org.telegram.messenger.r1.i().k() || arrayList.isEmpty() || this.f41619e >= arrayList.size() || ((ys0) arrayList.get(this.f41619e)).f52186f == null)) {
                    this.f41620e0.b(org.telegram.messenger.id.M0(2131748779, null), null, z9);
                    this.K.setOnClickListener(new bi.l1(19));
                    this.f41620e0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.f41619e < arrayList.size()) {
                    this.f41620e0.b(t0(this.currentAccount, (ys0) arrayList.get(this.f41619e)), null, z9);
                    this.K.setOnClickListener(new i40(this, 25));
                    this.f41620e0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void z0() {
        int i7;
        int i10;
        vg.f fVar;
        if (this.U != null && this.actionBar != null) {
            boolean z9 = this.f41624h0;
            if (z9) {
                i7 = org.telegram.ui.ActionBar.l6.G6;
            } else {
                i7 = org.telegram.ui.ActionBar.l6.Hk;
            }
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
            if (x02 != this.f41638t0) {
                this.f41638t0 = x02;
                this.actionBar.E(x02, true);
                this.actionBar.E(x02, false);
            }
            int i11 = org.telegram.ui.ActionBar.l6.Hk;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i11, false), 60);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.f27667p0 != o4) {
                kVar.D(o4, false);
            }
            this.V.f56806a.g();
            ws0 ws0Var = this.U;
            if (ws0Var != null) {
                TextView textView = ws0Var.f51466a;
                if (z9) {
                    i10 = org.telegram.ui.ActionBar.l6.G6;
                } else {
                    i10 = i11;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
                TextView textView2 = this.U.f51467b;
                if (z9) {
                    i11 = org.telegram.ui.ActionBar.l6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i11, false));
                bi.qd qdVar = this.U.d;
                if (qdVar != null && (fVar = qdVar.f57424b) != null) {
                    if (z9) {
                        fVar.f57408z = org.telegram.ui.ActionBar.l6.Lk;
                        fVar.A = org.telegram.ui.ActionBar.l6.Mk;
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
