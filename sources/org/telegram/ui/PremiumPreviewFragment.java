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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.d implements jm7 {
    public ms0 A0;
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
    public lj8 M;
    public tk8 N;
    public int O;
    public int P;
    public wd4 Q;
    public final Paint R;
    public LinearGradient S;
    public final Matrix T;
    public final Paint U;
    public gk8 V;
    public dta W;
    public boolean X;
    public int Y;
    public int Z;
    public r59 a;
    public boolean a0;
    public final ArrayList b;
    public boolean b0;
    public final ArrayList c;
    public float c0;
    public final ArrayList d;
    public int d0;
    public int e;
    public bk8 e0;
    public ik8 f;
    public cj8 f0;
    public float g0;
    public int h;
    public final boolean h0;
    public final boolean i0;
    public final String j0;
    public boolean k0;
    public final Bitmap l0;
    public final Canvas m0;
    public boolean n;
    public final nj8 n0;
    public final nj8 o0;
    public iq5 p0;
    public boolean q0;
    public int r;
    public float r0;
    public int s;
    public w94 s0;
    int showAdsRow;
    public int t0;
    public int u0;
    public dk8 v0;
    public int w;
    public qm0 w0;
    public int x;
    public final mr3 x0;
    public int y;
    public final km0 y0;
    public final km0 z0;

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
        this.n0 = new nj8(cmb.Fk, cmb.Gk, cmb.Hk, cmb.Ik, null);
        this.p0 = iq5.e;
        nj8 nj8Var = new nj8(cmb.Bk, cmb.Ck, -1, -1, null);
        this.o0 = nj8Var;
        nj8Var.m = true;
        nj8Var.o = 0.0f;
        nj8Var.p = 0.0f;
        nj8Var.q = 1.0f;
        nj8Var.b = 0.0f;
        nj8Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.h0 = i;
        if (!cmb.I.o() && i == 1) {
            z = true;
        }
        this.i0 = z;
        this.j0 = str;
        mj4 mj4Var = new mj4(this);
        if (Build.VERSION.SDK_INT >= 31) {
            mr3 mr3Var = new mr3(true);
            this.x0 = mr3Var;
            nz4 nz4Var = new nz4(null);
            nz4Var.d = mr3Var;
            nz4Var.e = -3;
            nz4Var.f = mj4Var;
            this.y0 = new km0(nz4Var, nz4Var, nz4Var);
        } else {
            this.x0 = null;
            this.y0 = new km0(mj4Var, mj4Var, mj4Var);
        }
        this.z0 = new km0(mj4Var, mj4Var, mj4Var);
    }

    public static void o0(org.telegram.ui.ActionBar.d dVar, ik8 ik8Var, String str, ohd ohdVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z = e21.a;
        if (dVar == null) {
            currentAccount = z8c.t0;
        } else {
            currentAccount = dVar.getCurrentAccount();
        }
        int i = currentAccount;
        if (oc7.r1(i).u2()) {
            h5.b(i);
            return;
        }
        if (ik8Var == null && (tL_help_premiumPromo = hs6.d0(i).E) != null) {
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
                    ik8Var = new ik8(tL_premiumSubscriptionOption3);
                } else if (i3 == 12) {
                    ik8Var = new ik8(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        ik8 ik8Var2 = ik8Var;
        u0();
        if (e21.b()) {
            if (dVar != null) {
                activity = dVar.getParentActivity();
            } else {
                activity = LaunchActivity.H1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (ik8Var2 != null && (tL_premiumSubscriptionOption = ik8Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.X0 = true;
                    }
                    l11.u(launchActivity, ik8Var2.a.bot_url);
                    return;
                }
                oc7 r1 = oc7.r1(i);
                if (!TextUtils.isEmpty(r1.l4.E0.f)) {
                    launchActivity.X0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + r1.l4.E0.f + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(r1.l4.G0.f)) {
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + r1.l4.G0.f)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        ln8 ln8Var = cj0.l;
        if (ln8Var != null && !ln8Var.h.isEmpty()) {
            if (ik8Var2.f == null) {
                ik8Var2.f = cj0.l;
            }
            ik8Var2.a();
            if (ik8Var2.g == null) {
                return;
            }
            cj0.h().p("subs", new zn(dVar, i, ohdVar, ik8Var2, (byte) 8));
        }
    }

    public static String p0(int i) {
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

    public static void q0(int i, ArrayList arrayList, boolean z) {
        oc7 r1 = oc7.r1(i);
        SparseIntArray sparseIntArray = r1.F0;
        if (!z) {
            arrayList.add(new hk8(29, 2131231132, jb6.M0(2131746788, null), jb6.M0(2131746787, null)));
            arrayList.add(new hk8(30, 2131231151, jb6.M0(2131746786, null), jb6.M0(2131746785, null)));
            arrayList.add(new hk8(31, 2131231136, jb6.M0(2131746784, null), jb6.M0(2131746783, null)));
            arrayList.add(new hk8(32, 2131232588, jb6.M0(2131746792, null), jb6.M0(2131746791, null)));
            arrayList.add(new hk8(33, 2131231146, jb6.M0(2131746799, null), jb6.M0(2131746798, null)));
            arrayList.add(new hk8(34, 2131231147, jb6.M0(2131746794, null), jb6.M0(2131746793, null)));
            arrayList.add(new hk8(37, 2131231150, jb6.M0(2131746797, null), jb6.M0(2131746796, null)));
            arrayList.add(new hk8(36, 2131231152, jb6.M0(2131746790, null), jb6.M0(2131746789, null)));
        } else {
            arrayList.add(new hk8(12, 2131231153, jb6.M0(2131746751, null), jb6.M0(2131746750, null)));
            arrayList.add(new hk8(35, 2131232589, jb6.M0(2131746737, null), jb6.M0(2131746736, null)));
            arrayList.add(new hk8(14, 2131231149, jb6.M0(2131746749, null), jb6.M0(2131746748, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (sparseIntArray.get(((hk8) arrayList.get(i2)).a, -1) == -1) {
                    boolean z2 = e21.a;
                }
            }
        }
        Collections.sort(arrayList, new f97(r1, (byte) 3));
    }

    public static void r0(int i, ArrayList arrayList) {
        oc7 r1 = oc7.r1(i);
        String M0 = jb6.M0(2131746733, null);
        gs gsVar = r1.l4;
        arrayList.add(new hk8(0, 2131232312, M0, jb6.a0(null, null, 2131746732, Integer.valueOf(gsVar.m3.f()), Integer.valueOf(gsVar.a1.f()), Integer.valueOf(gsVar.e1.f()), Integer.valueOf(gsVar.f1.f()), 4)));
        arrayList.add(new hk8(14, 2131232160, jb6.M0(2131746709, null), jb6.a0(null, null, 2131746708, new Object[0])));
        arrayList.add(new hk8(1, 2131232321, jb6.M0(2131746699, null), jb6.M0(2131746698, null)));
        arrayList.add(new hk8(2, 2131232318, jb6.M0(2131746747, null), jb6.M0(2131746746, null)));
        arrayList.add(new hk8(8, 2131232322, jb6.M0(2131746697, null), jb6.M0(2131746696, null)));
        arrayList.add(new hk8(3, 2131232307, jb6.M0(2131746727, null), jb6.M0(2131746726, null)));
        arrayList.add(new hk8(4, 2131232317, jb6.M0(2131746717, null), jb6.M0(2131746716, null)));
        arrayList.add(new hk8(5, 2131232319, jb6.M0(2131746711, null), jb6.M0(2131746710, null)));
        arrayList.add(new hk8(11, 2131232310, jb6.M0(2131746742, null), jb6.M0(2131746741, null)));
        arrayList.add(new hk8(9, 2131231864, jb6.M0(2131746760, null), jb6.M0(2131746759, null)));
        arrayList.add(new hk8(6, 2131232309, jb6.M0(2131746722, null), jb6.M0(2131746721, null)));
        arrayList.add(new hk8(27, 2131231134, jb6.M0(2131746724, null), jb6.M0(2131746723, null)));
        arrayList.add(new hk8(7, 2131232308, jb6.M0(2131746757, null), jb6.M0(2131746756, null)));
        arrayList.add(new hk8(24, 2131232589, jb6.M0(2131746706, null), jb6.M0(2131746704, null)));
        arrayList.add(new hk8(10, 2131232311, jb6.M0(2131746755, null), jb6.M0(2131746754, null)));
        arrayList.add(new hk8(12, 2131232588, jb6.M0(2131746739, null), jb6.M0(2131746738, null)));
        arrayList.add(new hk8(13, 2131232320, jb6.M0(2131746701, null), jb6.M0(2131746700, null)));
        arrayList.add(new hk8(22, 2131232590, jb6.M0(2131746694, null), jb6.M0(2131746693, null)));
        arrayList.add(new hk8(23, 2131232586, jb6.M0(2131746720, null), jb6.M0(2131746719, null)));
        arrayList.add(new hk8(26, 2131231863, jb6.M0(2131746735, null), jb6.M0(2131746734, null)));
        arrayList.add(new hk8(28, 2131231148, jb6.M0(2131743937, null), jb6.M0(2131746752, null)));
        arrayList.add(new hk8(38, 2131231860, jb6.M0(2131746744, null), jb6.M0(2131746743, null)));
        arrayList.add(new hk8(39, 2131232311, jb6.M0(2131746703, null), jb6.M0(2131746702, null)));
        arrayList.add(new hk8(41, 2131231173, jb6.M0(2131746713, null), jb6.M0(2131746712, null)));
        arrayList.add(new hk8(42, 2131232585, jb6.M0(2131746762, null), jb6.M0(2131746761, null)));
        arrayList.add(new hk8(43, 2131232587, jb6.M0(2131746715, null), jb6.M0(2131746714, null)));
        SparseIntArray sparseIntArray = r1.E0;
        if (sparseIntArray.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (sparseIntArray.get(((hk8) arrayList.get(i2)).a, -1) == -1) {
                    boolean z = e21.a;
                }
            }
        }
        Collections.sort(arrayList, new f97(r1, (byte) 4));
    }

    public static java.lang.String s0(int r14, defpackage.ik8 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.s0(int, ik8):java.lang.String");
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(z8c.t0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_help_saveAppLog, new nf2((byte) 0));
    }

    public static void v0(int i, int i2) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String p0 = p0(i2);
        if (p0 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = p0;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i).sendRequest(tL_help_saveAppLog, new nf2((byte) 0));
    }

    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new nf2((byte) 0));
    }

    public final void A0(boolean z) {
        w94 w94Var;
        if (z != this.a0) {
            this.a0 = z;
            gk8 gk8Var = this.V;
            if (gk8Var != null && (w94Var = gk8Var.d) != null) {
                w94Var.setDialogVisible(z);
            }
            this.W.setPaused(z);
            this.e0.invalidate();
        }
    }

    public final void B0() {
        boolean z;
        ik8 ik8Var;
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
        if (getUserConfig().p() && ((ik8Var = this.f) == null || ik8Var.a.months >= ((ik8) this.d.get(this.e)).a.months || this.q0)) {
            z = false;
        } else {
            z = true;
        }
        gm.T3(frameLayout, z, 1.0f, true, false);
        if (this.K.getVisibility() == 0) {
            i6 = gm.L(64.0f);
        }
        wd4 wd4Var = this.Q;
        wd4Var.M = (this.Y + i6) - gm.L(16.0f);
        wd4Var.o1();
        this.Q.S = i6;
    }

    @Override
    public final boolean canBeginSlide() {
        w94 w94Var;
        gk8 gk8Var = this.V;
        if (gk8Var != null && (w94Var = gk8Var.d) != null && w94Var.a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.A0 = new ms0(this, (byte) 6);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.R;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w0 = cmb.w0(null, cmb.Ek, false);
        int w02 = cmb.w0(null, cmb.Dk, false);
        int i = cmb.Ck;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w0, w02, cmb.w0(null, i, false), cmb.w0(null, cmb.Bk, false), cmb.w0(null, cmb.Ak, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.S = linearGradient2;
        linearGradient2.setLocalMatrix(this.T);
        this.U.setShader(this.S);
        this.M = new lj8(context, null);
        this.N = new tk8(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i2 = this.currentAccount;
        boolean z = this.h0;
        if (!z) {
            r0(i2, arrayList);
        } else {
            q0(i2, arrayList, false);
            q0(this.currentAccount, arrayList2, true);
            pz8.f(this.currentAccount).h();
            if (getUserConfig().p()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                hs6.d0(this.currentAccount).n0(tL_inputStickerSetShortName, false);
                x41.a(this.currentAccount).c(null);
                if (getMessagesController().M0.isEmpty()) {
                    getMessagesController().h3();
                }
                q51 d = q51.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable d2 = b10.d(context, 2131232745);
        this.J = d2;
        d2.setColorFilter(new PorterDuffColorFilter(getThemedColor(cmb.g5), PorterDuff.Mode.MULTIPLY));
        this.J.getPadding(rect);
        this.Y = gm.m;
        this.e0 = new bk8(this, context);
        zgc zgcVar = new zgc(this.e0);
        bk8 bk8Var = this.e0;
        km0 km0Var = this.y0;
        km0Var.h = zgcVar;
        km0Var.i = bk8Var;
        zgc zgcVar2 = new zgc(this.e0);
        bk8 bk8Var2 = this.e0;
        km0 km0Var2 = this.z0;
        km0Var2.h = zgcVar2;
        km0Var2.i = bk8Var2;
        r59 r59Var = new r59(context, null);
        this.a = r59Var;
        r59Var.setClipToOutline(true);
        this.a.setOutlineProvider(new cm0(this, (byte) 7));
        this.a.E0(new zj8(this, (byte) 1));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setLegacySections(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        r59 r59Var2 = this.a;
        wd4 wd4Var = new wd4((gm.L(68.0f) + this.Y) - gm.L(16.0f), this.a);
        this.Q = wd4Var;
        r59Var2.setLayoutManager(wd4Var);
        this.Q.R = true;
        this.a.setAdapter(new b0(this));
        this.a.j(new so7(this, (byte) 4));
        this.V = new gk8(this, context);
        dta dtaVar = new dta(context);
        this.W = dtaVar;
        dtaVar.c();
        if (z) {
            dta dtaVar2 = this.W;
            if (this.i0) {
                cta ctaVar = dtaVar2.a;
                ctaVar.q = true;
                ctaVar.J = false;
                ctaVar.H = true;
                ctaVar.I = true;
                ctaVar.k = gm.L(-14.0f);
                cta ctaVar2 = this.W.a;
                ctaVar2.x = (short) 2000;
                ctaVar2.y = (short) 3000;
                ctaVar2.r = (byte) 16;
                ctaVar2.G = false;
                ctaVar2.N = 28;
                ctaVar2.P = i;
            } else {
                cta ctaVar3 = dtaVar2.a;
                ctaVar3.I = true;
                ctaVar3.k = gm.L(28.0f);
                cta ctaVar4 = this.W.a;
                ctaVar4.x = (short) 2000;
                ctaVar4.y = (short) 3000;
                ctaVar4.r = (byte) 16;
                ctaVar4.G = false;
                ctaVar4.N = 28;
            }
        }
        this.V.d.setStarParticlesView(this.W);
        this.e0.addView(this.W, qoe.c(-2.0f, -1));
        this.e0.addView(this.V, qoe.c(-2.0f, -1));
        this.a.setOnItemClickListener(new kg4(this, (byte) 22));
        this.e0.addView(this.a, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.L = new FrameLayout(context);
        cj8 cj8Var = new cj8(getResourceProvider(), context, false);
        this.f0 = cj8Var;
        cj8Var.L = true;
        cj8Var.setClickable(false);
        cj8Var.w.setClickable(false);
        cj8Var.setStateListAnimator(null);
        y0(false);
        this.K = new FrameLayout(context);
        this.L.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        this.L.addView(this.f0, qoe.c(-1.0f, -1));
        View view = this.L;
        im0 c = km0Var.c(view, null, false);
        c.p(qqd.j(this.resourceProvider));
        c.r(gm.L(28.0f));
        c.q(gm.L(5.0f));
        view.setBackground(c);
        rve.b(this.L, 0.02f, 1.5f);
        this.K.addView(this.L, qoe.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        qm0 qm0Var = new qm0(km0Var.c(this.K, null, false));
        qm0Var.b(gm.L(40.0f), false);
        this.w0 = new qm0(km0Var.c(this.e0, null, false));
        this.K.setBackground(qm0Var);
        if (getUserConfig().o()) {
            this.e0.addView(this.K, qoe.e(-1, -2, 80));
        }
        this.fragmentView = this.e0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.actionBar.setBackButtonImage(2131231245);
        } else {
            this.actionBar.setBackButtonImage(2131231244);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 27));
        this.actionBar.setForceSkipTouches(true);
        this.e0.addView(this.actionBar, qoe.e(-1, -2, 48));
        z0();
        B0();
        this.V.d.m(200L);
        if (this.q0) {
            gm.d3(new zj8(this, (byte) 2), 400L);
        }
        hs6.d0(this.currentAccount).p1();
        w0(this.j0);
        View view2 = this.fragmentView;
        h68 h68Var = new h68(this, (byte) 11);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(view2, h68Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.n5;
        int i4 = nm7.k5;
        if (i == i3 || i == i4) {
            y0(false);
            this.V.a();
        }
        if (i != nm7.j5 && i != i4) {
            return;
        }
        this.V.b();
        this.V.a();
        B0();
        this.a.getAdapter().f();
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final bu3 getEdgeToEdgeSupportMode() {
        return bu3.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return kwe.a(new t10(this, (byte) 14), cmb.Bk, cmb.Ck, cmb.Dk, cmb.Ek, cmb.Fk, cmb.Gk, cmb.Hk, cmb.Ik, cmb.Jk, cmb.Lk, cmb.Mk, cmb.Kk, cmb.Pk);
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

    public final void n0() {
        mr3 mr3Var;
        if (Build.VERSION.SDK_INT >= 31 && (mr3Var = this.x0) != null) {
            this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.p0.d) - gm.L(132.0f), this.fragmentView.getMeasuredWidth(), gm.L(48.0f) + this.fragmentView.getMeasuredHeight());
            mr3Var.g(1, this.B0);
            mr3Var.e(this.A0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        A0(false);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (getMessagesController().H3()) {
            return false;
        }
        nm7.e().b(this, nm7.n5);
        nm7.e().b(this, nm7.j5);
        getNotificationCenter().b(this, nm7.k5);
        if (getMediaDataController().E != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().E.videos;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Document document = arrayList.get(i);
                i++;
                bc4.G(this.currentAccount).X(document, getMediaDataController().E, 3, 0);
            }
        }
        if (this.h0) {
            xqb.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.e().n(this, nm7.n5);
        nm7.e().n(this, nm7.j5);
        getNotificationCenter().n(this, nm7.k5);
    }

    @Override
    public final void onPause() {
        w94 w94Var;
        super.onPause();
        gk8 gk8Var = this.V;
        if (gk8Var != null && (w94Var = gk8Var.d) != null) {
            w94Var.setDialogVisible(true);
        }
        dta dtaVar = this.W;
        if (dtaVar != null) {
            dtaVar.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        w94 w94Var;
        super.onResume();
        gk8 gk8Var = this.V;
        if (gk8Var != null && (w94Var = gk8Var.d) != null) {
            w94Var.setPaused(false);
            this.V.d.setDialogVisible(false);
        }
        this.W.setPaused(false);
        setBulletinDelegate(new s20(this, (byte) 15));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(cmb.g5);
        Drawable drawable = this.J;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            dta dtaVar = this.W;
            if (dtaVar != null && dtaVar.a != null && this.e0 != null) {
                z0();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
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
        A0(z);
        return showDialog;
    }

    public final void t0(int r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.t0(int, android.view.View):void");
    }

    public final void x0() {
        gk8 gk8Var;
        if (this.e0.getMeasuredWidth() != 0 && this.e0.getMeasuredHeight() != 0 && (gk8Var = this.V) != null && gk8Var.d != null) {
            if (this.i0) {
                int f = on2.f(0.5f, getThemedColor(cmb.Ck), getThemedColor(cmb.g5));
                w94 w94Var = this.s0;
                w94 w94Var2 = this.V.d;
                if (w94Var != w94Var2 || this.t0 != f) {
                    this.s0 = w94Var2;
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
            nj8 nj8Var = this.n0;
            nj8Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.m0;
            canvas.save();
            canvas.scale(100.0f / this.e0.getMeasuredWidth(), 100.0f / this.e0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.e0.getMeasuredWidth(), this.e0.getMeasuredHeight(), nj8Var.f);
            canvas.restore();
            this.V.d.setBackgroundBitmap(this.l0);
        }
    }

    public final void y0(boolean z) {
        if (this.f0 != null) {
            boolean p = getUserConfig().p();
            ArrayList arrayList = this.d;
            if (!p || this.f == null || this.e >= arrayList.size() || ((ik8) arrayList.get(this.e)).a.months >= this.f.a.months) {
                if (jb6.a0) {
                    z = false;
                }
                if (!e21.b() && (!cj0.h().j() || arrayList.isEmpty() || this.e >= arrayList.size() || ((ik8) arrayList.get(this.e)).f == null)) {
                    this.f0.b(jb6.M0(2131748536, null), null, z);
                    this.L.setOnClickListener(new x10((byte) 1));
                    this.f0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.e < arrayList.size()) {
                    this.f0.b(s0(this.currentAccount, (ik8) arrayList.get(this.e)), null, z);
                    this.L.setOnClickListener(new m67(this, (byte) 27));
                    this.f0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void z0() {
        int i;
        int i2;
        vs4 vs4Var;
        if (this.V != null && this.actionBar != null) {
            boolean z = this.i0;
            if (z) {
                i = cmb.F6;
            } else {
                i = cmb.Jk;
            }
            int w0 = cmb.w0(null, i, false);
            if (w0 != this.u0) {
                this.u0 = w0;
                this.actionBar.H(w0, true);
                this.actionBar.H(w0, false);
            }
            int i3 = cmb.Jk;
            int p = on2.p(cmb.w0(null, i3, false), 60);
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar.q0 != p) {
                aVar.G(p, false);
            }
            this.W.a.g();
            gk8 gk8Var = this.V;
            if (gk8Var != null) {
                TextView textView = gk8Var.a;
                if (z) {
                    i2 = cmb.F6;
                } else {
                    i2 = i3;
                }
                textView.setTextColor(cmb.w0(null, i2, false));
                TextView textView2 = this.V.b;
                if (z) {
                    i3 = cmb.F6;
                }
                textView2.setTextColor(cmb.w0(null, i3, false));
                w94 w94Var = this.V.d;
                if (w94Var != null && (vs4Var = w94Var.b) != null) {
                    if (z) {
                        vs4Var.z = cmb.Nk;
                        vs4Var.A = cmb.Ok;
                    }
                    vs4Var.b();
                }
            }
            x0();
        }
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
