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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
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
    public js0 M;
    public ug.o1 N;
    public int O;
    public int P;
    public org.telegram.ui.Components.wy Q;
    public final Paint R;
    public LinearGradient S;
    public final Matrix T;
    public final Paint U;
    public vs0 V;
    public ug.u1 W;
    public boolean X;
    public int Y;
    public int Z;
    public org.telegram.ui.Components.ck0 f43420a;
    public boolean f43421a0;
    public final ArrayList f43422b;
    public boolean f43423b0;
    public final ArrayList f43424c;
    public float f43425c0;
    public final ArrayList d;
    public int f43426d0;
    public int f43427e;
    public ms0 f43428e0;
    public xs0 f43429f;
    public ug.s0 f43430f0;
    public float f43431g0;
    public int h;
    public final int f43432h0;
    public final boolean f43433i0;
    public final String f43434j0;
    public boolean f43435k0;
    public final Bitmap f43436l0;
    public final Canvas m0;
    public int f43437n;
    public final ug.b1 f43438n0;
    public final ug.b1 f43439o0;
    public i0.b f43440p0;
    public boolean f43441q0;
    public int f43442r;
    public float f43443r0;
    public int f43444s;
    public di.bc f43445s0;
    int showAdsRow;
    public int f43446t0;
    public int f43447u0;
    public os0 f43448v0;
    public int f43449w;
    public dh.d f43450w0;
    public int f43451x;
    public final dh.g f43452x0;
    public int f43453y;
    public final dh.c f43454y0;
    public final dh.c f43455z0;

    public PremiumPreviewFragment(int i7, String str) {
        super(null);
        this.f43422b = new ArrayList();
        this.f43424c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.f43427e = 0;
        this.R = new Paint(1);
        this.T = new Matrix();
        this.U = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.f43436l0 = createBitmap;
        this.m0 = new Canvas(createBitmap);
        this.f43438n0 = new ug.b1(org.telegram.ui.ActionBar.n6.Gk, org.telegram.ui.ActionBar.n6.Hk, org.telegram.ui.ActionBar.n6.Ik, org.telegram.ui.ActionBar.n6.Jk, null);
        this.f43440p0 = i0.b.f15888e;
        ug.b1 b1Var = new ug.b1(org.telegram.ui.ActionBar.n6.Ck, org.telegram.ui.ActionBar.n6.Dk, -1, -1, null);
        this.f43439o0 = b1Var;
        b1Var.f58613m = true;
        b1Var.f58615o = 0.0f;
        b1Var.f58616p = 0.0f;
        b1Var.f58617q = 1.0f;
        b1Var.f58604b = 0.0f;
        b1Var.f58605c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.f43432h0 = i7;
        if (!org.telegram.ui.ActionBar.n6.I.q() && i7 == 1) {
            z10 = true;
        }
        this.f43433i0 = z10;
        this.f43434j0 = str;
        k8.a aVar = new k8.a(this);
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(true);
            this.f43452x0 = gVar;
            ui.f fVar = new ui.f(null);
            fVar.d = gVar;
            fVar.f59007e = -3;
            fVar.f59008f = aVar;
            this.f43454y0 = new dh.c(fVar, fVar, fVar);
        } else {
            this.f43452x0 = null;
            this.f43454y0 = new dh.c(aVar, aVar, aVar);
        }
        this.f43455z0 = new dh.c(aVar, aVar, aVar);
    }

    public static void Z(PremiumPreviewFragment premiumPreviewFragment, View view, int i7) {
        xs0 xs0Var;
        boolean z10;
        org.telegram.ui.Components.m5 m5Var;
        js0 js0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int L;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i14 = premiumPreviewFragment.f43432h0;
        if (premiumPreviewFragment.getUserConfig().p()) {
            boolean z11 = false;
            if (i7 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull d2 = premiumPreviewFragment.getMessagesController().d2(premiumPreviewFragment.getUserConfig().e());
                if (d2 != null) {
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    n8Var.setChecked(!n8Var.d());
                    d2.sponsored_enabled = n8Var.d();
                    TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                    togglesponsoredmessages.enabled = d2.sponsored_enabled;
                    premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new l(premiumPreviewFragment, 17));
                    premiumPreviewFragment.getMessagesStorage().j2(d2, false);
                }
            } else if (view instanceof js0) {
                js0 js0Var2 = (js0) view;
                if (i14 == 1 && premiumPreviewFragment.getUserConfig().q()) {
                    int i15 = js0Var2.f49055f.f53469a;
                    if (i15 == 29) {
                        premiumPreviewFragment.presentFragment(new kg.d1());
                        return;
                    } else if (i15 == 32) {
                        premiumPreviewFragment.presentFragment(new kg.v0());
                        return;
                    } else if (i15 == 33) {
                        ?? h2Var = new org.telegram.ui.ActionBar.h2(null);
                        h2Var.f18261f = -4;
                        premiumPreviewFragment.presentFragment((org.telegram.ui.ActionBar.h2) h2Var);
                        return;
                    } else if (i15 == 30) {
                        premiumPreviewFragment.presentFragment(new kg.f1());
                        return;
                    } else if (i15 == 34) {
                        premiumPreviewFragment.presentFragment(new kg.t0());
                        return;
                    } else if (i15 == 31) {
                        premiumPreviewFragment.presentFragment(new kg.t1());
                        return;
                    } else if (i15 == 14) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("dialog_id", org.telegram.messenger.j10.i(premiumPreviewFragment.currentAccount).e());
                        bundle.putInt("type", 1);
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.i90(bundle, null));
                        return;
                    } else if (i15 == 12) {
                        Long i16 = org.telegram.messenger.o10.i(premiumPreviewFragment.getUserConfig().f());
                        bi.l6 l6Var = new bi.l6(26, premiumPreviewFragment, js0Var2);
                        if (premiumPreviewFragment.f43448v0 == null) {
                            i11[] i11VarArr = new i11[1];
                            if (js0Var2.getHeight() + js0Var2.getTop() > premiumPreviewFragment.f43420a.getMeasuredHeight() / 2.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Point point = org.telegram.messenger.g0.f24118q;
                            int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                            int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                            org.telegram.ui.Components.m5 m5Var2 = js0Var2.h;
                            if (m5Var2 != null) {
                                Drawable[] drawableArr = m5Var2.f37361f;
                                Drawable drawable = drawableArr[1];
                                if (drawable != null) {
                                    if (drawable instanceof org.telegram.ui.Components.o5) {
                                        ((org.telegram.ui.Components.o5) drawable).o(m5Var2);
                                    }
                                    drawableArr[1] = null;
                                }
                                org.telegram.ui.Components.m5 m5Var3 = js0Var2.h;
                                if (m5Var3 != null) {
                                    m5Var3.f();
                                    js0Var2.c();
                                    Rect rect = org.telegram.messenger.g0.Q;
                                    rect.set(js0Var2.h.getBounds());
                                    if (z10) {
                                        L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                                    } else {
                                        L = (-(js0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                                    }
                                    i11 = rect.centerX() - (point.x - min2);
                                    m5Var = m5Var3;
                                    i10 = L;
                                } else {
                                    m5Var = m5Var3;
                                    i10 = 0;
                                    i11 = 0;
                                }
                                js0Var = js0Var2;
                            } else {
                                m5Var = null;
                                js0Var = null;
                                i10 = 0;
                                i11 = 0;
                            }
                            if (z10) {
                                i12 = 12;
                            } else {
                                i12 = 0;
                            }
                            int i17 = i10;
                            Activity parentActivity = premiumPreviewFragment.getParentActivity();
                            Integer valueOf = Integer.valueOf(i11);
                            org.telegram.ui.ActionBar.i6 resourceProvider = premiumPreviewFragment.getResourceProvider();
                            if (z10) {
                                i13 = 24;
                            } else {
                                i13 = 16;
                            }
                            ns0 ns0Var = new ns0(premiumPreviewFragment, premiumPreviewFragment, parentActivity, valueOf, i12, resourceProvider, i13, l6Var, i11VarArr);
                            ns0Var.f51397h1 = true;
                            ns0Var.setSelected(i16);
                            ns0Var.setSaveState(3);
                            ns0Var.y(m5Var, js0Var);
                            os0 os0Var = new os0(premiumPreviewFragment, ns0Var);
                            premiumPreviewFragment.f43448v0 = os0Var;
                            i11VarArr[0] = os0Var;
                            os0Var.showAsDropDown(js0Var2, 0, i17, 53);
                            i11VarArr[0].b();
                            return;
                        }
                        return;
                    } else if (i15 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f43053f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i15 == 36) {
                        premiumPreviewFragment.presentFragment(new kg.n());
                        return;
                    } else if (i15 == 37) {
                        premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.b51());
                        return;
                    } else {
                        return;
                    }
                }
                v0(premiumPreviewFragment.currentAccount, js0Var2.f49055f.f53469a);
                int i18 = premiumPreviewFragment.f43427e;
                if (i18 >= 0 && i18 < arrayList.size()) {
                    xs0Var = (xs0) arrayList.get(premiumPreviewFragment.f43427e);
                } else {
                    xs0Var = null;
                }
                Activity parentActivity2 = premiumPreviewFragment.getParentActivity();
                int i19 = premiumPreviewFragment.currentAccount;
                if (i14 == 1) {
                    z11 = true;
                }
                premiumPreviewFragment.showDialog(new ug.z0(premiumPreviewFragment, parentActivity2, i19, z11, js0Var2.f49055f.f53469a, false, xs0Var));
            }
        }
    }

    public static org.telegram.ui.ActionBar.k j0(PremiumPreviewFragment premiumPreviewFragment) {
        return premiumPreviewFragment.actionBar;
    }

    public static void p0(org.telegram.ui.ActionBar.h2 h2Var, xs0 xs0Var, String str, com.google.android.gms.internal.clearcut.y0 y0Var) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z10 = org.telegram.messenger.s2.f26721a;
        if (h2Var == null) {
            currentAccount = org.telegram.messenger.j10.f24770t0;
        } else {
            currentAccount = h2Var.getCurrentAccount();
        }
        int i7 = currentAccount;
        if (org.telegram.messenger.mp.u1(i7).A2()) {
            b.b(i7);
            return;
        }
        if (xs0Var == null && (tL_help_premiumPromo = org.telegram.messenger.ri.d0(i7).E) != null) {
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
                    xs0Var = new xs0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    xs0Var = new xs0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        xs0 xs0Var2 = xs0Var;
        u0();
        if (org.telegram.messenger.s2.b()) {
            if (h2Var != null) {
                activity = h2Var.getParentActivity();
            } else {
                activity = LaunchActivity.H1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (xs0Var2 != null && (tL_premiumSubscriptionOption = xs0Var2.f53894a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.X0 = true;
                    }
                    vf.c.t(launchActivity, tL_premiumSubscriptionOption.bot_url);
                    return;
                }
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                if (!TextUtils.isEmpty(u12.f25786v6)) {
                    launchActivity.X0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + u12.f25786v6 + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(u12.f25796w6)) {
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + u12.f25796w6)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        f5.m mVar = org.telegram.messenger.r1.f26524l;
        if (mVar != null && !mVar.h.isEmpty()) {
            if (xs0Var2.f53898f == null) {
                xs0Var2.f53898f = org.telegram.messenger.r1.f26524l;
            }
            xs0Var2.a();
            if (xs0Var2.f53899g == null) {
                return;
            }
            org.telegram.messenger.r1.i().p("subs", new bg.g0(h2Var, i7, y0Var, xs0Var2, 8));
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
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        SparseIntArray sparseIntArray = u12.P0;
        if (!z10) {
            arrayList.add(new ws0(29, 2131231129, org.telegram.messenger.gd.M0(2131746860, null), org.telegram.messenger.gd.M0(2131746859, null)));
            arrayList.add(new ws0(30, 2131231148, org.telegram.messenger.gd.M0(2131746858, null), org.telegram.messenger.gd.M0(2131746857, null)));
            arrayList.add(new ws0(31, 2131231133, org.telegram.messenger.gd.M0(2131746856, null), org.telegram.messenger.gd.M0(2131746855, null)));
            arrayList.add(new ws0(32, 2131232573, org.telegram.messenger.gd.M0(2131746864, null), org.telegram.messenger.gd.M0(2131746863, null)));
            arrayList.add(new ws0(33, 2131231143, org.telegram.messenger.gd.M0(2131746871, null), org.telegram.messenger.gd.M0(2131746870, null)));
            arrayList.add(new ws0(34, 2131231144, org.telegram.messenger.gd.M0(2131746866, null), org.telegram.messenger.gd.M0(2131746865, null)));
            arrayList.add(new ws0(37, 2131231147, org.telegram.messenger.gd.M0(2131746869, null), org.telegram.messenger.gd.M0(2131746868, null)));
            arrayList.add(new ws0(36, 2131231149, org.telegram.messenger.gd.M0(2131746862, null), org.telegram.messenger.gd.M0(2131746861, null)));
        } else {
            arrayList.add(new ws0(12, 2131231150, org.telegram.messenger.gd.M0(2131746823, null), org.telegram.messenger.gd.M0(2131746822, null)));
            arrayList.add(new ws0(35, 2131232574, org.telegram.messenger.gd.M0(2131746809, null), org.telegram.messenger.gd.M0(2131746808, null)));
            arrayList.add(new ws0(14, 2131231146, org.telegram.messenger.gd.M0(2131746821, null), org.telegram.messenger.gd.M0(2131746820, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((ws0) arrayList.get(i10)).f53469a, -1) == -1) {
                    boolean z11 = org.telegram.messenger.s2.f26721a;
                }
            }
        }
        Collections.sort(arrayList, new ls0(u12, 0));
    }

    public static void s0(int i7, ArrayList arrayList) {
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        arrayList.add(new ws0(0, 2131232308, org.telegram.messenger.gd.M0(2131746805, null), org.telegram.messenger.gd.a0(null, null, 2131746804, Integer.valueOf(u12.H4), Integer.valueOf(u12.P4), Integer.valueOf(u12.T4), Integer.valueOf(u12.V4), 4)));
        arrayList.add(new ws0(14, 2131232156, org.telegram.messenger.gd.M0(2131746781, null), org.telegram.messenger.gd.a0(null, null, 2131746780, new Object[0])));
        arrayList.add(new ws0(1, 2131232317, org.telegram.messenger.gd.M0(2131746771, null), org.telegram.messenger.gd.M0(2131746770, null)));
        arrayList.add(new ws0(2, 2131232314, org.telegram.messenger.gd.M0(2131746819, null), org.telegram.messenger.gd.M0(2131746818, null)));
        arrayList.add(new ws0(8, 2131232318, org.telegram.messenger.gd.M0(2131746769, null), org.telegram.messenger.gd.M0(2131746768, null)));
        arrayList.add(new ws0(3, 2131232303, org.telegram.messenger.gd.M0(2131746799, null), org.telegram.messenger.gd.M0(2131746798, null)));
        arrayList.add(new ws0(4, 2131232313, org.telegram.messenger.gd.M0(2131746789, null), org.telegram.messenger.gd.M0(2131746788, null)));
        arrayList.add(new ws0(5, 2131232315, org.telegram.messenger.gd.M0(2131746783, null), org.telegram.messenger.gd.M0(2131746782, null)));
        arrayList.add(new ws0(11, 2131232306, org.telegram.messenger.gd.M0(2131746814, null), org.telegram.messenger.gd.M0(2131746813, null)));
        arrayList.add(new ws0(9, 2131231860, org.telegram.messenger.gd.M0(2131746832, null), org.telegram.messenger.gd.M0(2131746831, null)));
        arrayList.add(new ws0(6, 2131232305, org.telegram.messenger.gd.M0(2131746794, null), org.telegram.messenger.gd.M0(2131746793, null)));
        arrayList.add(new ws0(27, 2131231131, org.telegram.messenger.gd.M0(2131746796, null), org.telegram.messenger.gd.M0(2131746795, null)));
        arrayList.add(new ws0(7, 2131232304, org.telegram.messenger.gd.M0(2131746829, null), org.telegram.messenger.gd.M0(2131746828, null)));
        arrayList.add(new ws0(24, 2131232574, org.telegram.messenger.gd.M0(2131746778, null), org.telegram.messenger.gd.M0(2131746776, null)));
        arrayList.add(new ws0(10, 2131232307, org.telegram.messenger.gd.M0(2131746827, null), org.telegram.messenger.gd.M0(2131746826, null)));
        arrayList.add(new ws0(12, 2131232573, org.telegram.messenger.gd.M0(2131746811, null), org.telegram.messenger.gd.M0(2131746810, null)));
        arrayList.add(new ws0(13, 2131232316, org.telegram.messenger.gd.M0(2131746773, null), org.telegram.messenger.gd.M0(2131746772, null)));
        arrayList.add(new ws0(22, 2131232575, org.telegram.messenger.gd.M0(2131746766, null), org.telegram.messenger.gd.M0(2131746765, null)));
        arrayList.add(new ws0(23, 2131232571, org.telegram.messenger.gd.M0(2131746792, null), org.telegram.messenger.gd.M0(2131746791, null)));
        arrayList.add(new ws0(26, 2131231859, org.telegram.messenger.gd.M0(2131746807, null), org.telegram.messenger.gd.M0(2131746806, null)));
        arrayList.add(new ws0(28, 2131231145, org.telegram.messenger.gd.M0(2131744017, null), org.telegram.messenger.gd.M0(2131746824, null)));
        arrayList.add(new ws0(38, 2131231856, org.telegram.messenger.gd.M0(2131746816, null), org.telegram.messenger.gd.M0(2131746815, null)));
        arrayList.add(new ws0(39, 2131232307, org.telegram.messenger.gd.M0(2131746775, null), org.telegram.messenger.gd.M0(2131746774, null)));
        arrayList.add(new ws0(41, 2131231170, org.telegram.messenger.gd.M0(2131746785, null), org.telegram.messenger.gd.M0(2131746784, null)));
        arrayList.add(new ws0(42, 2131232570, org.telegram.messenger.gd.M0(2131746834, null), org.telegram.messenger.gd.M0(2131746833, null)));
        arrayList.add(new ws0(43, 2131232572, org.telegram.messenger.gd.M0(2131746787, null), org.telegram.messenger.gd.M0(2131746786, null)));
        SparseIntArray sparseIntArray = u12.O0;
        if (sparseIntArray.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (sparseIntArray.get(((ws0) arrayList.get(i10)).f53469a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.s2.f26721a;
                }
            }
        }
        Collections.sort(arrayList, new ls0(u12, 1));
    }

    public static java.lang.String t0(int r17, org.telegram.ui.xs0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.t0(int, org.telegram.ui.xs0):java.lang.String");
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.j10.f24770t0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.j10.f24770t0).sendRequest(tL_help_saveAppLog, new fi.k5(9));
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
        ConnectionsManager.getInstance(i7).sendRequest(tL_help_saveAppLog, new fi.k5(9));
    }

    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.j10.f24770t0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new fi.k5(9));
    }

    public final void A0(boolean z10) {
        di.bc bcVar;
        if (z10 != this.f43421a0) {
            this.f43421a0 = z10;
            vs0 vs0Var = this.V;
            if (vs0Var != null && (bcVar = vs0Var.d) != null) {
                bcVar.setDialogVisible(z10);
            }
            this.W.setPaused(z10);
            this.f43428e0.invalidate();
        }
    }

    public final void B0() {
        boolean z10;
        xs0 xs0Var;
        this.f43453y = -1;
        this.F = -1;
        this.f43444s = -1;
        this.f43449w = -1;
        this.f43451x = -1;
        this.H = -1;
        this.showAdsRow = -1;
        this.I = -1;
        this.h = 1;
        this.f43437n = 1;
        int size = this.f43422b.size() + 1;
        this.h = size;
        this.f43442r = size;
        int i7 = this.f43432h0;
        if (i7 == 1 && getUserConfig().q()) {
            int i10 = this.h;
            int i11 = i10 + 1;
            this.f43453y = i10;
            int i12 = i10 + 2;
            this.h = i12;
            this.f43444s = i11;
            this.f43449w = i12;
            int size2 = this.f43424c.size() + i12;
            this.h = size2;
            this.f43451x = size2;
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
        if (getUserConfig().q() && ((xs0Var = this.f43429f) == null || xs0Var.f53894a.months >= ((xs0) this.d.get(this.f43427e)).f53894a.months || this.f43441q0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.messenger.g0.X3(frameLayout, z10, 1.0f, true, false);
        if (this.K.getVisibility() == 0) {
            i15 = org.telegram.messenger.g0.L(64.0f);
        }
        org.telegram.ui.Components.wy wyVar = this.Q;
        wyVar.M = (this.Y + i15) - org.telegram.messenger.g0.L(16.0f);
        wyVar.p1();
        this.Q.S = i15;
    }

    @Override
    public final boolean canBeginSlide() {
        di.bc bcVar;
        vs0 vs0Var = this.V;
        if (vs0Var != null && (bcVar = vs0Var.d) != null && bcVar.f59461a) {
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
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fk, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ek, false);
        int i7 = org.telegram.ui.ActionBar.n6.Dk;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ck, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Bk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.S = linearGradient2;
        linearGradient2.setLocalMatrix(this.T);
        this.U.setShader(this.S);
        this.M = new js0(context, null);
        this.N = new ug.o1(context);
        ArrayList arrayList = this.f43422b;
        arrayList.clear();
        ArrayList arrayList2 = this.f43424c;
        arrayList2.clear();
        int i10 = this.f43432h0;
        if (i10 == 0) {
            s0(this.currentAccount, arrayList);
        } else {
            r0(this.currentAccount, arrayList, false);
            r0(this.currentAccount, arrayList2, true);
            kg.w1.f(this.currentAccount).h();
            if (getUserConfig().q()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                org.telegram.messenger.ri.d0(this.currentAccount).o0(tL_inputStickerSetShortName, false);
                kg.f.a(this.currentAccount).c(null);
                if (getMessagesController().W0.isEmpty()) {
                    getMessagesController().j3();
                }
                kg.y d = kg.y.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable g10 = i5.c.g(context, 2131232730);
        this.J = g10;
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.n6.f29467h5), PorterDuff.Mode.MULTIPLY));
        this.J.getPadding(rect);
        this.Y = org.telegram.messenger.g0.f24112m;
        this.f43428e0 = new ms0(this, context);
        jh.k kVar = new jh.k(this.f43428e0);
        ms0 ms0Var = this.f43428e0;
        dh.c cVar = this.f43454y0;
        cVar.h = kVar;
        cVar.f8377i = ms0Var;
        jh.k kVar2 = new jh.k(this.f43428e0);
        ms0 ms0Var2 = this.f43428e0;
        dh.c cVar2 = this.f43455z0;
        cVar2.h = kVar2;
        cVar2.f8377i = ms0Var2;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f43420a = ck0Var;
        ck0Var.setClipToOutline(true);
        this.f43420a.setOutlineProvider(new fh.a(this, 9));
        this.f43420a.D0(new ks0(this, 1));
        this.f43420a.setCaptureSectionsDecoratorAllowed(true);
        this.f43420a.setLegacySections(true);
        this.f43420a.setSections(true);
        this.f43420a.setClipToPadding(false);
        org.telegram.ui.Components.ck0 ck0Var2 = this.f43420a;
        org.telegram.ui.Components.wy wyVar = new org.telegram.ui.Components.wy((org.telegram.messenger.g0.L(68.0f) + this.Y) - org.telegram.messenger.g0.L(16.0f), this.f43420a);
        this.Q = wyVar;
        ck0Var2.setLayoutManager(wyVar);
        this.Q.R = true;
        this.f43420a.setAdapter(new qs0(this));
        this.f43420a.j(new g3(this, 25));
        this.V = new vs0(this, context);
        ug.u1 u1Var = new ug.u1(context);
        this.W = u1Var;
        u1Var.c();
        if (i10 == 1) {
            if (this.f43433i0) {
                ug.t1 t1Var = this.W.f58920a;
                t1Var.f58907q = true;
                t1Var.K = false;
                t1Var.H = true;
                t1Var.J = true;
                t1Var.f58901k = org.telegram.messenger.g0.L(-14.0f);
                ug.t1 t1Var2 = this.W.f58920a;
                t1Var2.f58913x = 2000L;
                t1Var2.f58914y = 3000;
                t1Var2.f58908r = 16;
                t1Var2.G = false;
                t1Var2.O = 28;
                t1Var2.Q = i7;
            } else {
                ug.t1 t1Var3 = this.W.f58920a;
                t1Var3.J = true;
                t1Var3.f58901k = org.telegram.messenger.g0.L(28.0f);
                ug.t1 t1Var4 = this.W.f58920a;
                t1Var4.f58913x = 2000L;
                t1Var4.f58914y = 3000;
                t1Var4.f58908r = 16;
                t1Var4.G = false;
                t1Var4.O = 28;
            }
        }
        this.V.d.setStarParticlesView(this.W);
        this.f43428e0.addView(this.W, c8.ma.c(-2.0f, -1));
        this.f43428e0.addView(this.V, c8.ma.c(-2.0f, -1));
        this.f43420a.setOnItemClickListener(new h(this, 24));
        this.f43428e0.addView(this.f43420a, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.L = new FrameLayout(context);
        ug.s0 s0Var = new ug.s0(context, getResourceProvider(), false);
        this.f43430f0 = s0Var;
        s0Var.L = true;
        s0Var.setClickable(false);
        s0Var.f58868w.setClickable(false);
        s0Var.setStateListAnimator(null);
        y0(false);
        this.K = new FrameLayout(context);
        this.L.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.L.addView(this.f43430f0, c8.ma.c(-1.0f, -1));
        View view = this.L;
        fh.g c10 = cVar.c(view, null, false);
        c10.p(c8.i0.k(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        view.setBackground(c10);
        c8.ra.b(this.L, 0.02f, 1.5f);
        this.K.addView(this.L, c8.ma.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar = new dh.d(cVar.c(this.K, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), false);
        this.f43450w0 = new dh.d(cVar.c(this.f43428e0, null, false));
        this.K.setBackground(dVar);
        if (getUserConfig().p()) {
            this.f43428e0.addView(this.K, c8.ma.e(-1, -2, 80));
        }
        this.fragmentView = this.f43428e0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).U0) {
            this.actionBar.setBackButtonImage(2131231241);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new hs0(this, 1));
        this.actionBar.setForceSkipTouches(true);
        this.f43428e0.addView(this.actionBar, c8.ma.e(-1, -2, 48));
        z0();
        B0();
        this.V.d.m(200L);
        if (this.f43441q0) {
            org.telegram.messenger.g0.h3(new ks0(this, 2), 400L);
        }
        org.telegram.messenger.ri.d0(this.currentAccount).r1();
        w0(this.f43434j0);
        View view2 = this.fragmentView;
        qi0 qi0Var = new qi0(this, 7);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(view2, qi0Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25154m5;
        int i12 = org.telegram.messenger.ks.f25138j5;
        if (i7 == i11 || i7 == i12) {
            y0(false);
            this.V.a();
        }
        if (i7 != org.telegram.messenger.ks.f25133i5 && i7 != i12) {
            return;
        }
        this.V.b();
        this.V.a();
        B0();
        this.f43420a.getAdapter().f();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.q3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.q3.f29900c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(16, this), org.telegram.ui.ActionBar.n6.Ck, org.telegram.ui.ActionBar.n6.Dk, org.telegram.ui.ActionBar.n6.Ek, org.telegram.ui.ActionBar.n6.Fk, org.telegram.ui.ActionBar.n6.Gk, org.telegram.ui.ActionBar.n6.Hk, org.telegram.ui.ActionBar.n6.Ik, org.telegram.ui.ActionBar.n6.Jk, org.telegram.ui.ActionBar.n6.Kk, org.telegram.ui.ActionBar.n6.Mk, org.telegram.ui.ActionBar.n6.Nk, org.telegram.ui.ActionBar.n6.Lk, org.telegram.ui.ActionBar.n6.Qk);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.f43433i0;
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
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f43452x0) != null) {
            this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.f43440p0.d) - org.telegram.messenger.g0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f) + this.fragmentView.getMeasuredHeight());
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
        if (getMessagesController().K3()) {
            return false;
        }
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25154m5);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25133i5);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25138j5);
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
        if (this.f43432h0 == 1) {
            kg.z1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25154m5);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25133i5);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25138j5);
    }

    @Override
    public final void onPause() {
        di.bc bcVar;
        super.onPause();
        vs0 vs0Var = this.V;
        if (vs0Var != null && (bcVar = vs0Var.d) != null) {
            bcVar.setDialogVisible(true);
        }
        ug.u1 u1Var = this.W;
        if (u1Var != null) {
            u1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        di.bc bcVar;
        super.onResume();
        vs0 vs0Var = this.V;
        if (vs0Var != null && (bcVar = vs0Var.d) != null) {
            bcVar.setPaused(false);
            this.V.d.setDialogVisible(false);
        }
        this.W.setPaused(false);
        setBulletinDelegate(new y8(this, 7));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29467h5);
        Drawable drawable = this.J;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            ug.u1 u1Var = this.W;
            if (u1Var != null && u1Var.f58920a != null && this.f43428e0 != null) {
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
        vs0 vs0Var;
        if (this.f43428e0.getMeasuredWidth() != 0 && this.f43428e0.getMeasuredHeight() != 0 && (vs0Var = this.V) != null && vs0Var.d != null) {
            if (this.f43433i0) {
                int f10 = i0.a.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.n6.Dk), getThemedColor(org.telegram.ui.ActionBar.n6.f29467h5));
                di.bc bcVar = this.f43445s0;
                di.bc bcVar2 = this.V.d;
                if (bcVar != bcVar2 || this.f43446t0 != f10) {
                    this.f43445s0 = bcVar2;
                    this.f43446t0 = f10;
                    Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(f10);
                    this.V.d.setBackgroundBitmap(createBitmap);
                    return;
                }
                return;
            }
            int measuredWidth = this.f43428e0.getMeasuredWidth();
            int measuredHeight = this.f43428e0.getMeasuredHeight();
            ug.b1 b1Var = this.f43438n0;
            b1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.m0;
            canvas.save();
            canvas.scale(100.0f / this.f43428e0.getMeasuredWidth(), 100.0f / this.f43428e0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f43428e0.getMeasuredWidth(), this.f43428e0.getMeasuredHeight(), b1Var.f58607f);
            canvas.restore();
            this.V.d.setBackgroundBitmap(this.f43436l0);
        }
    }

    public final void y0(boolean z10) {
        if (this.f43430f0 != null) {
            boolean q10 = getUserConfig().q();
            ArrayList arrayList = this.d;
            if (!q10 || this.f43429f == null || this.f43427e >= arrayList.size() || ((xs0) arrayList.get(this.f43427e)).f53894a.months >= this.f43429f.f53894a.months) {
                if (org.telegram.messenger.gd.f24213a0) {
                    z10 = false;
                }
                if (!org.telegram.messenger.s2.b() && (!org.telegram.messenger.r1.i().k() || arrayList.isEmpty() || this.f43427e >= arrayList.size() || ((xs0) arrayList.get(this.f43427e)).f53898f == null)) {
                    this.f43430f0.b(org.telegram.messenger.gd.M0(2131748587, null), null, z10);
                    this.L.setOnClickListener(new bi.o(24));
                    this.f43430f0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.f43427e < arrayList.size()) {
                    this.f43430f0.b(t0(this.currentAccount, (xs0) arrayList.get(this.f43427e)), null, z10);
                    this.L.setOnClickListener(new j40(this, 25));
                    this.f43430f0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void z0() {
        int i7;
        int i10;
        vg.f fVar;
        if (this.V != null && this.actionBar != null) {
            boolean z10 = this.f43433i0;
            if (z10) {
                i7 = org.telegram.ui.ActionBar.n6.G6;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.Kk;
            }
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
            if (x02 != this.f43447u0) {
                this.f43447u0 = x02;
                this.actionBar.I(x02, true);
                this.actionBar.I(x02, false);
            }
            int i11 = org.telegram.ui.ActionBar.n6.Kk;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 60);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.f29090q0 != o4) {
                kVar.G(o4, false);
            }
            this.W.f58920a.g();
            vs0 vs0Var = this.V;
            if (vs0Var != null) {
                TextView textView = vs0Var.f52840a;
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.n6.G6;
                } else {
                    i10 = i11;
                }
                textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                TextView textView2 = this.V.f52841b;
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.n6.G6;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
                di.bc bcVar = this.V.d;
                if (bcVar != null && (fVar = bcVar.f59463b) != null) {
                    if (z10) {
                        fVar.f59447z = org.telegram.ui.ActionBar.n6.Ok;
                        fVar.A = org.telegram.ui.ActionBar.n6.Pk;
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
