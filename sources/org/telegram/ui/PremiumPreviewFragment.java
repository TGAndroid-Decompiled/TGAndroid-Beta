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
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
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
import org.telegram.ui.ActionBar.ActionBarLayout;
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.d implements gk7 {
    public vw0 A0;
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
    public kh8 M;
    public ri8 N;
    public int O;
    public int P;
    public wb4 Q;
    public final Paint R;
    public LinearGradient S;
    public final Matrix T;
    public final Paint U;
    public ei8 V;
    public cra W;
    public boolean X;
    public int Y;
    public int Z;
    public o39 a;
    public boolean a0;
    public final ArrayList b;
    public boolean b0;
    public final ArrayList c;
    public float c0;
    public final ArrayList d;
    public int d0;
    public int e;
    public zh8 e0;
    public gi8 f;
    public ah8 f0;
    public float g0;
    public int h;
    public final boolean h0;
    public final boolean i0;
    public final String j0;
    public boolean k0;
    public final Bitmap l0;
    public final Canvas m0;
    public boolean n;
    public final mh8 n0;
    public final mh8 o0;
    public io5 p0;
    public boolean q0;
    public int r;
    public float r0;
    public int s;
    public n84 s0;
    int showAdsRow;
    public int t0;
    public int u0;
    public bi8 v0;
    public int w;
    public ql0 w0;
    public int x;
    public final cq3 x0;
    public int y;
    public final kl0 y0;
    public final kl0 z0;

    public PremiumPreviewFragment(int i, String str) {
        super(null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        boolean z = false;
        this.e = 0;
        this.R = new Paint(1);
        this.T = new Matrix();
        this.U = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.l0 = createBitmap;
        this.m0 = new Canvas(createBitmap);
        this.n0 = new mh8(bkb.Fk, bkb.Gk, bkb.Hk, bkb.Ik, null);
        this.p0 = io5.e;
        mh8 mh8Var = new mh8(bkb.Bk, bkb.Ck, -1, -1, null);
        this.o0 = mh8Var;
        mh8Var.m = true;
        mh8Var.o = 0.0f;
        mh8Var.p = 0.0f;
        mh8Var.q = 1.0f;
        mh8Var.b = 0.0f;
        mh8Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.h0 = i;
        if (!bkb.I.o() && i == 1) {
            z = true;
        }
        this.i0 = z;
        this.j0 = str;
        sk4 sk4Var = new sk4(this);
        if (Build.VERSION.SDK_INT >= 31) {
            cq3 cq3Var = new cq3(true);
            this.x0 = cq3Var;
            lx4 lx4Var = new lx4(null);
            lx4Var.d = cq3Var;
            lx4Var.e = -3;
            lx4Var.f = sk4Var;
            this.y0 = new kl0(lx4Var, lx4Var, lx4Var);
        } else {
            this.x0 = null;
            this.y0 = new kl0(sk4Var, sk4Var, sk4Var);
        }
        this.z0 = new kl0(sk4Var, sk4Var, sk4Var);
    }

    public static void n0(org.telegram.ui.ActionBar.d dVar, gi8 gi8Var, String str, nfd nfdVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z = w01.a;
        if (dVar == null) {
            currentAccount = y6c.t0;
        } else {
            currentAccount = dVar.getCurrentAccount();
        }
        int i = currentAccount;
        if (na7.q1(i).t2()) {
            h5.b(i);
            return;
        }
        if (gi8Var == null && (tL_help_premiumPromo = hq6.d0(i).E) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i2);
                i2++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i3 = tL_premiumSubscriptionOption3.months;
                if (i3 == 1) {
                    gi8Var = new gi8(tL_premiumSubscriptionOption3);
                } else if (i3 == 12) {
                    gi8Var = new gi8(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        gi8 gi8Var2 = gi8Var;
        t0();
        if (w01.b()) {
            if (dVar != null) {
                activity = dVar.getParentActivity();
            } else {
                activity = LaunchActivity.H1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (gi8Var2 != null && (tL_premiumSubscriptionOption = gi8Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.X0 = true;
                    }
                    d01.t(launchActivity, gi8Var2.a.bot_url);
                    return;
                }
                na7 q1 = na7.q1(i);
                if (!TextUtils.isEmpty(q1.k4.E0.f)) {
                    launchActivity.X0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + q1.k4.E0.f + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(q1.k4.G0.f)) {
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + q1.k4.G0.f)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        kl8 kl8Var = ci0.l;
        if (kl8Var != null && !kl8Var.h.isEmpty()) {
            if (gi8Var2.f == null) {
                gi8Var2.f = ci0.l;
            }
            gi8Var2.a();
            if (gi8Var2.g == null) {
                return;
            }
            ci0.h().p("subs", new zm(dVar, i, nfdVar, gi8Var2, (byte) 8));
        }
    }

    public static String o0(int i) {
        switch (i) {
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

    public static void p0(int i, ArrayList arrayList, boolean z) {
        na7 q1 = na7.q1(i);
        SparseIntArray sparseIntArray = q1.F0;
        if (!z) {
            arrayList.add(new fi8(29, 2131231131, k96.M0(2131746862, null), k96.M0(2131746861, null)));
            arrayList.add(new fi8(30, 2131231150, k96.M0(2131746860, null), k96.M0(2131746859, null)));
            arrayList.add(new fi8(31, 2131231135, k96.M0(2131746858, null), k96.M0(2131746857, null)));
            arrayList.add(new fi8(32, 2131232576, k96.M0(2131746866, null), k96.M0(2131746865, null)));
            arrayList.add(new fi8(33, 2131231145, k96.M0(2131746873, null), k96.M0(2131746872, null)));
            arrayList.add(new fi8(34, 2131231146, k96.M0(2131746868, null), k96.M0(2131746867, null)));
            arrayList.add(new fi8(37, 2131231149, k96.M0(2131746871, null), k96.M0(2131746870, null)));
            arrayList.add(new fi8(36, 2131231151, k96.M0(2131746864, null), k96.M0(2131746863, null)));
        } else {
            arrayList.add(new fi8(12, 2131231152, k96.M0(2131746825, null), k96.M0(2131746824, null)));
            arrayList.add(new fi8(35, 2131232577, k96.M0(2131746811, null), k96.M0(2131746810, null)));
            arrayList.add(new fi8(14, 2131231148, k96.M0(2131746823, null), k96.M0(2131746822, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (sparseIntArray.get(((fi8) arrayList.get(i2)).a, -1) == -1) {
                    boolean z2 = w01.a;
                }
            }
        }
        Collections.sort(arrayList, new c77(q1, (byte) 3));
    }

    public static void q0(int i, ArrayList arrayList) {
        na7 q1 = na7.q1(i);
        String M0 = k96.M0(2131746807, null);
        gr grVar = q1.k4;
        arrayList.add(new fi8(0, 2131232311, M0, k96.a0(null, null, 2131746806, Integer.valueOf(grVar.m3.f()), Integer.valueOf(grVar.a1.f()), Integer.valueOf(grVar.e1.f()), Integer.valueOf(grVar.f1.f()), 4)));
        arrayList.add(new fi8(14, 2131232159, k96.M0(2131746783, null), k96.a0(null, null, 2131746782, new Object[0])));
        arrayList.add(new fi8(1, 2131232320, k96.M0(2131746773, null), k96.M0(2131746772, null)));
        arrayList.add(new fi8(2, 2131232317, k96.M0(2131746821, null), k96.M0(2131746820, null)));
        arrayList.add(new fi8(8, 2131232321, k96.M0(2131746771, null), k96.M0(2131746770, null)));
        arrayList.add(new fi8(3, 2131232306, k96.M0(2131746801, null), k96.M0(2131746800, null)));
        arrayList.add(new fi8(4, 2131232316, k96.M0(2131746791, null), k96.M0(2131746790, null)));
        arrayList.add(new fi8(5, 2131232318, k96.M0(2131746785, null), k96.M0(2131746784, null)));
        arrayList.add(new fi8(11, 2131232309, k96.M0(2131746816, null), k96.M0(2131746815, null)));
        arrayList.add(new fi8(9, 2131231863, k96.M0(2131746834, null), k96.M0(2131746833, null)));
        arrayList.add(new fi8(6, 2131232308, k96.M0(2131746796, null), k96.M0(2131746795, null)));
        arrayList.add(new fi8(27, 2131231133, k96.M0(2131746798, null), k96.M0(2131746797, null)));
        arrayList.add(new fi8(7, 2131232307, k96.M0(2131746831, null), k96.M0(2131746830, null)));
        arrayList.add(new fi8(24, 2131232577, k96.M0(2131746780, null), k96.M0(2131746778, null)));
        arrayList.add(new fi8(10, 2131232310, k96.M0(2131746829, null), k96.M0(2131746828, null)));
        arrayList.add(new fi8(12, 2131232576, k96.M0(2131746813, null), k96.M0(2131746812, null)));
        arrayList.add(new fi8(13, 2131232319, k96.M0(2131746775, null), k96.M0(2131746774, null)));
        arrayList.add(new fi8(22, 2131232578, k96.M0(2131746768, null), k96.M0(2131746767, null)));
        arrayList.add(new fi8(23, 2131232574, k96.M0(2131746794, null), k96.M0(2131746793, null)));
        arrayList.add(new fi8(26, 2131231862, k96.M0(2131746809, null), k96.M0(2131746808, null)));
        arrayList.add(new fi8(28, 2131231147, k96.M0(2131744011, null), k96.M0(2131746826, null)));
        arrayList.add(new fi8(38, 2131231859, k96.M0(2131746818, null), k96.M0(2131746817, null)));
        arrayList.add(new fi8(39, 2131232310, k96.M0(2131746777, null), k96.M0(2131746776, null)));
        arrayList.add(new fi8(41, 2131231172, k96.M0(2131746787, null), k96.M0(2131746786, null)));
        arrayList.add(new fi8(42, 2131232573, k96.M0(2131746836, null), k96.M0(2131746835, null)));
        arrayList.add(new fi8(43, 2131232575, k96.M0(2131746789, null), k96.M0(2131746788, null)));
        SparseIntArray sparseIntArray = q1.E0;
        if (sparseIntArray.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (sparseIntArray.get(((fi8) arrayList.get(i2)).a, -1) == -1) {
                    boolean z = w01.a;
                }
            }
        }
        Collections.sort(arrayList, new c77(q1, (byte) 4));
    }

    public static java.lang.String r0(int r14, defpackage.gi8 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.r0(int, gi8):java.lang.String");
    }

    public static void t0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(y6c.t0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_help_saveAppLog, new ce2((byte) 0));
    }

    public static void u0(int i, int i2) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String o0 = o0(i2);
        if (o0 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = o0;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i).sendRequest(tL_help_saveAppLog, new ce2((byte) 0));
    }

    public static void v0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new ce2((byte) 0));
    }

    public final void A0() {
        boolean z;
        gi8 gi8Var;
        this.y = -1;
        this.F = -1;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.H = -1;
        this.showAdsRow = -1;
        this.I = -1;
        this.h = 1;
        this.n = true;
        int size = this.b.size() + 1;
        this.h = size;
        this.r = size;
        boolean z2 = this.h0;
        if (z2 && getUserConfig().p()) {
            int i = this.h;
            int i2 = i + 1;
            this.y = i;
            int i3 = i + 2;
            this.h = i3;
            this.s = i2;
            this.w = i3;
            int size2 = this.c.size() + i3;
            this.h = size2;
            this.x = size2;
        }
        int i4 = this.h;
        this.E = i4;
        this.h = i4 + 2;
        this.G = i4 + 1;
        if (z2 && getUserConfig().p()) {
            int i5 = this.h;
            this.H = i5;
            this.showAdsRow = i5 + 1;
            this.h = i5 + 3;
            this.I = i5 + 2;
        }
        FrameLayout frameLayout = this.K;
        int i6 = 0;
        if (getUserConfig().p() && ((gi8Var = this.f) == null || gi8Var.a.months >= ((gi8) this.d.get(this.e)).a.months || this.q0)) {
            z = false;
        } else {
            z = true;
        }
        gl.U3(frameLayout, z, 1.0f, true, false);
        if (this.K.getVisibility() == 0) {
            i6 = gl.L(64.0f);
        }
        wb4 wb4Var = this.Q;
        wb4Var.M = (this.Y + i6) - gl.L(16.0f);
        wb4Var.o1();
        this.Q.S = i6;
    }

    @Override
    public final boolean canBeginSlide() {
        n84 n84Var;
        ei8 ei8Var = this.V;
        if (ei8Var != null && (n84Var = ei8Var.d) != null && n84Var.a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.A0 = new vw0(this, (byte) 5);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.R;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w0 = bkb.w0(null, bkb.Ek, false);
        int w02 = bkb.w0(null, bkb.Dk, false);
        int i = bkb.Ck;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w0, w02, bkb.w0(null, i, false), bkb.w0(null, bkb.Bk, false), bkb.w0(null, bkb.Ak, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.S = linearGradient2;
        linearGradient2.setLocalMatrix(this.T);
        this.U.setShader(this.S);
        this.M = new kh8(context, null);
        this.N = new ri8(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i2 = this.currentAccount;
        boolean z = this.h0;
        if (!z) {
            q0(i2, arrayList);
        } else {
            p0(i2, arrayList, false);
            p0(this.currentAccount, arrayList2, true);
            ox8.f(this.currentAccount).h();
            if (getUserConfig().p()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                hq6.d0(this.currentAccount).n0(tL_inputStickerSetShortName, false);
                p31.a(this.currentAccount).c(null);
                if (getMessagesController().M0.isEmpty()) {
                    getMessagesController().e3();
                }
                j41 d = j41.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable d2 = b00.d(context, 2131232733);
        this.J = d2;
        d2.setColorFilter(new PorterDuffColorFilter(getThemedColor(bkb.g5), PorterDuff.Mode.MULTIPLY));
        this.J.getPadding(rect);
        this.Y = gl.m;
        this.e0 = new zh8(this, context);
        zec zecVar = new zec(this.e0);
        zh8 zh8Var = this.e0;
        kl0 kl0Var = this.y0;
        kl0Var.h = zecVar;
        kl0Var.i = zh8Var;
        zec zecVar2 = new zec(this.e0);
        zh8 zh8Var2 = this.e0;
        kl0 kl0Var2 = this.z0;
        kl0Var2.h = zecVar2;
        kl0Var2.i = zh8Var2;
        o39 o39Var = new o39(context, null);
        this.a = o39Var;
        o39Var.setClipToOutline(true);
        this.a.setOutlineProvider(new cl0(this, (byte) 6));
        this.a.E0(new yh8(this, (byte) 1));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setLegacySections(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        o39 o39Var2 = this.a;
        wb4 wb4Var = new wb4((gl.L(68.0f) + this.Y) - gl.L(16.0f), this.a);
        this.Q = wb4Var;
        o39Var2.setLayoutManager(wb4Var);
        this.Q.R = true;
        this.a.setAdapter(new b0(this));
        this.a.j(new n58(this, (byte) 3));
        this.V = new ei8(this, context);
        cra craVar = new cra(context);
        this.W = craVar;
        craVar.c();
        if (z) {
            cra craVar2 = this.W;
            if (this.i0) {
                bra braVar = craVar2.a;
                braVar.q = true;
                braVar.J = false;
                braVar.H = true;
                braVar.I = true;
                braVar.k = gl.L(-14.0f);
                bra braVar2 = this.W.a;
                braVar2.x = (short) 2000;
                braVar2.y = (short) 3000;
                braVar2.r = (byte) 16;
                braVar2.G = false;
                braVar2.N = 28;
                braVar2.P = i;
            } else {
                bra braVar3 = craVar2.a;
                braVar3.I = true;
                braVar3.k = gl.L(28.0f);
                bra braVar4 = this.W.a;
                braVar4.x = (short) 2000;
                braVar4.y = (short) 3000;
                braVar4.r = (byte) 16;
                braVar4.G = false;
                braVar4.N = 28;
            }
        }
        this.V.d.setStarParticlesView(this.W);
        this.e0.addView(this.W, nme.c(-2.0f, -1));
        this.e0.addView(this.V, nme.c(-2.0f, -1));
        this.a.setOnItemClickListener(new bf4(this, (byte) 21));
        this.e0.addView(this.a, nme.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.L = new FrameLayout(context);
        ah8 ah8Var = new ah8(getResourceProvider(), context, false);
        this.f0 = ah8Var;
        ah8Var.L = true;
        ah8Var.setClickable(false);
        ah8Var.w.setClickable(false);
        ah8Var.setStateListAnimator(null);
        x0(false);
        this.K = new FrameLayout(context);
        this.L.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        this.L.addView(this.f0, nme.c(-1.0f, -1));
        View view = this.L;
        il0 c = kl0Var.c(view, null, false);
        c.p(nod.j(this.resourceProvider));
        c.r(gl.L(28.0f));
        c.q(gl.L(5.0f));
        view.setBackground(c);
        ote.b(this.L, 0.02f, 1.5f);
        this.K.addView(this.L, nme.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ql0 ql0Var = new ql0(kl0Var.c(this.K, null, false));
        ql0Var.b(gl.L(40.0f), false);
        this.w0 = new ql0(kl0Var.c(this.e0, null, false));
        this.K.setBackground(ql0Var);
        if (getUserConfig().o()) {
            this.e0.addView(this.K, nme.e(-1, -2, 80));
        }
        this.fragmentView = this.e0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.actionBar.setBackButtonImage(2131231244);
        } else {
            this.actionBar.setBackButtonImage(2131231243);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 26));
        this.actionBar.setForceSkipTouches(true);
        this.e0.addView(this.actionBar, nme.e(-1, -2, 48));
        y0();
        A0();
        this.V.d.m(200L);
        if (this.q0) {
            gl.e3(new yh8(this, (byte) 2), 400L);
        }
        hq6.d0(this.currentAccount).p1();
        v0(this.j0);
        View view2 = this.fragmentView;
        k88 k88Var = new k88(this, (byte) 7);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(view2, k88Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.l5;
        int i4 = kk7.i5;
        if (i == i3 || i == i4) {
            x0(false);
            this.V.a();
        }
        if (i != kk7.h5 && i != i4) {
            return;
        }
        this.V.b();
        this.V.a();
        A0();
        this.a.getAdapter().f();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final rs3 getEdgeToEdgeSupportMode() {
        return rs3.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return hue.a(new t00(this, (byte) 14), bkb.Bk, bkb.Ck, bkb.Dk, bkb.Ek, bkb.Fk, bkb.Gk, bkb.Hk, bkb.Ik, bkb.Jk, bkb.Lk, bkb.Mk, bkb.Kk, bkb.Pk);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        return this.i0;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void m0() {
        cq3 cq3Var;
        if (Build.VERSION.SDK_INT >= 31 && (cq3Var = this.x0) != null) {
            this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.p0.d) - gl.L(132.0f), this.fragmentView.getMeasuredWidth(), gl.L(48.0f) + this.fragmentView.getMeasuredHeight());
            cq3Var.g(1, this.B0);
            cq3Var.e(this.A0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        z0(false);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (getMessagesController().E3()) {
            return false;
        }
        kk7.e().b(this, kk7.l5);
        kk7.e().b(this, kk7.h5);
        getNotificationCenter().b(this, kk7.i5);
        if (getMediaDataController().E != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().E.videos;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Document document = arrayList.get(i);
                i++;
                ba4.G(this.currentAccount).X(document, getMediaDataController().E, 3, 0);
            }
        }
        if (this.h0) {
            wob.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.e().n(this, kk7.l5);
        kk7.e().n(this, kk7.h5);
        getNotificationCenter().n(this, kk7.i5);
    }

    @Override
    public final void onPause() {
        n84 n84Var;
        super.onPause();
        ei8 ei8Var = this.V;
        if (ei8Var != null && (n84Var = ei8Var.d) != null) {
            n84Var.setDialogVisible(true);
        }
        cra craVar = this.W;
        if (craVar != null) {
            craVar.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        n84 n84Var;
        super.onResume();
        ei8 ei8Var = this.V;
        if (ei8Var != null && (n84Var = ei8Var.d) != null) {
            n84Var.setPaused(false);
            this.V.d.setDialogVisible(false);
        }
        this.W.setPaused(false);
        setBulletinDelegate(new s10(this, (byte) 15));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(bkb.g5);
        Drawable drawable = this.J;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            cra craVar = this.W;
            if (craVar != null && craVar.a != null && this.e0 != null) {
                y0();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void s0(int r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.s0(int, android.view.View):void");
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z = true;
        } else {
            z = false;
        }
        z0(z);
        return showDialog;
    }

    public final void w0() {
        ei8 ei8Var;
        if (this.e0.getMeasuredWidth() != 0 && this.e0.getMeasuredHeight() != 0 && (ei8Var = this.V) != null && ei8Var.d != null) {
            if (this.i0) {
                int f = bm2.f(0.5f, getThemedColor(bkb.Ck), getThemedColor(bkb.g5));
                n84 n84Var = this.s0;
                n84 n84Var2 = this.V.d;
                if (n84Var != n84Var2 || this.t0 != f) {
                    this.s0 = n84Var2;
                    this.t0 = f;
                    Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(f);
                    this.V.d.setBackgroundBitmap(createBitmap);
                    return;
                }
                return;
            }
            int measuredWidth = this.e0.getMeasuredWidth();
            int measuredHeight = this.e0.getMeasuredHeight();
            mh8 mh8Var = this.n0;
            mh8Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.m0;
            canvas.save();
            canvas.scale(100.0f / this.e0.getMeasuredWidth(), 100.0f / this.e0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.e0.getMeasuredWidth(), this.e0.getMeasuredHeight(), mh8Var.f);
            canvas.restore();
            this.V.d.setBackgroundBitmap(this.l0);
        }
    }

    public final void x0(boolean z) {
        if (this.f0 != null) {
            boolean p = getUserConfig().p();
            ArrayList arrayList = this.d;
            if (!p || this.f == null || this.e >= arrayList.size() || ((gi8) arrayList.get(this.e)).a.months >= this.f.a.months) {
                if (k96.a0) {
                    z = false;
                }
                if (!w01.b() && (!ci0.h().j() || arrayList.isEmpty() || this.e >= arrayList.size() || ((gi8) arrayList.get(this.e)).f == null)) {
                    this.f0.b(k96.M0(2131748587, null), null, z);
                    this.L.setOnClickListener(new x00((byte) 1));
                    this.f0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.e < arrayList.size()) {
                    this.f0.b(r0(this.currentAccount, (gi8) arrayList.get(this.e)), null, z);
                    this.L.setOnClickListener(new fr7(this, (byte) 24));
                    this.f0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void y0() {
        int i;
        int i2;
        uq4 uq4Var;
        if (this.V != null && this.actionBar != null) {
            boolean z = this.i0;
            if (z) {
                i = bkb.F6;
            } else {
                i = bkb.Jk;
            }
            int w0 = bkb.w0(null, i, false);
            if (w0 != this.u0) {
                this.u0 = w0;
                this.actionBar.H(w0, true);
                this.actionBar.H(w0, false);
            }
            int i3 = bkb.Jk;
            int o = bm2.o(bkb.w0(null, i3, false), 60);
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar.q0 != o) {
                aVar.G(o, false);
            }
            this.W.a.g();
            ei8 ei8Var = this.V;
            if (ei8Var != null) {
                TextView textView = ei8Var.a;
                if (z) {
                    i2 = bkb.F6;
                } else {
                    i2 = i3;
                }
                textView.setTextColor(bkb.w0(null, i2, false));
                TextView textView2 = this.V.b;
                if (z) {
                    i3 = bkb.F6;
                }
                textView2.setTextColor(bkb.w0(null, i3, false));
                n84 n84Var = this.V.d;
                if (n84Var != null && (uq4Var = n84Var.b) != null) {
                    if (z) {
                        uq4Var.z = bkb.Nk;
                        uq4Var.A = bkb.Ok;
                    }
                    uq4Var.b();
                }
            }
            w0();
        }
    }

    public final void z0(boolean z) {
        n84 n84Var;
        if (z != this.a0) {
            this.a0 = z;
            ei8 ei8Var = this.V;
            if (ei8Var != null && (n84Var = ei8Var.d) != null) {
                n84Var.setDialogVisible(z);
            }
            this.W.setPaused(z);
            this.e0.invalidate();
        }
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
