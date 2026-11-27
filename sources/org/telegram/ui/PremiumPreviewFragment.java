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
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.e implements fn7 {
    public mr0 A0;
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
    public yk8 M;
    public em8 N;
    public int O;
    public int P;
    public td4 Q;
    public final Paint R;
    public LinearGradient S;
    public final Matrix T;
    public final Paint U;
    public rl8 V;
    public eva W;
    public boolean X;
    public int Y;
    public int Z;
    public d79 a;
    public boolean a0;
    public final ArrayList b;
    public boolean b0;
    public final ArrayList c;
    public float c0;
    public final ArrayList d;
    public int d0;
    public int e;
    public ml8 e0;
    public tl8 f;
    public ok8 f0;
    public float g0;
    public int h;
    public final boolean h0;
    public final boolean i0;
    public final String j0;
    public boolean k0;
    public final Bitmap l0;
    public final Canvas m0;
    public boolean n;
    public final al8 n0;
    public final al8 o0;
    public mq5 p0;
    public boolean q0;
    public int r;
    public float r0;
    public int s;
    public i94 s0;
    int showAdsRow;
    public int t0;
    public int u0;
    public ol8 v0;
    public int w;
    public rl0 w0;
    public int x;
    public final tq3 x0;
    public int y;
    public final ll0 y0;
    public final ll0 z0;

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
        this.n0 = new al8(aob.Gk, aob.Hk, aob.Ik, aob.Jk, null);
        this.p0 = mq5.e;
        al8 al8Var = new al8(aob.Ck, aob.Dk, -1, -1, null);
        this.o0 = al8Var;
        al8Var.m = true;
        al8Var.o = 0.0f;
        al8Var.p = 0.0f;
        al8Var.q = 1.0f;
        al8Var.b = 0.0f;
        al8Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.h0 = i;
        if (!aob.I.o() && i == 1) {
            z = true;
        }
        this.i0 = z;
        this.j0 = str;
        ym4 ym4Var = new ym4(this);
        if (Build.VERSION.SDK_INT >= 31) {
            tq3 tq3Var = new tq3(true);
            this.x0 = tq3Var;
            rz4 rz4Var = new rz4(null);
            rz4Var.d = tq3Var;
            rz4Var.e = -3;
            rz4Var.f = ym4Var;
            this.y0 = new ll0(rz4Var, rz4Var, rz4Var);
        } else {
            this.x0 = null;
            this.y0 = new ll0(ym4Var, ym4Var, ym4Var);
        }
        this.z0 = new ll0(ym4Var, ym4Var, ym4Var);
    }

    public static void n0(org.telegram.ui.ActionBar.e eVar, tl8 tl8Var, String str, ekd ekdVar) {
        int currentAccount;
        Activity activity;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z = f11.a;
        if (eVar == null) {
            currentAccount = yac.t0;
        } else {
            currentAccount = eVar.getCurrentAccount();
        }
        int i = currentAccount;
        if (uc7.s1(i).x2()) {
            i5.b(i);
            return;
        }
        if (tl8Var == null && (tL_help_premiumPromo = ls6.d0(i).E) != null) {
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
                    tl8Var = new tl8(tL_premiumSubscriptionOption3);
                } else if (i3 == 12) {
                    tl8Var = new tl8(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        tl8 tl8Var2 = tl8Var;
        t0();
        if (f11.b()) {
            if (eVar != null) {
                activity = eVar.getParentActivity();
            } else {
                activity = LaunchActivity.H1;
            }
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (tl8Var2 != null && (tL_premiumSubscriptionOption = tl8Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                        launchActivity.X0 = true;
                    }
                    m01.u(launchActivity, tl8Var2.a.bot_url);
                    return;
                }
                uc7 s1 = uc7.s1(i);
                if (!TextUtils.isEmpty(s1.l4.M0.f)) {
                    launchActivity.X0 = true;
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + s1.l4.M0.f + "?start=" + str)), null);
                    return;
                } else if (!TextUtils.isEmpty(s1.l4.O0.f)) {
                    launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + s1.l4.O0.f)), null);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        wo8 wo8Var = di0.l;
        if (wo8Var != null && !wo8Var.h.isEmpty()) {
            if (tl8Var2.f == null) {
                tl8Var2.f = di0.l;
            }
            tl8Var2.a();
            if (tl8Var2.g == null) {
                return;
            }
            di0.h().p("subs", new an(eVar, i, ekdVar, tl8Var2, (byte) 8));
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
        uc7 s1 = uc7.s1(i);
        SparseIntArray sparseIntArray = s1.F0;
        if (!z) {
            arrayList.add(new sl8(29, 2131231131, ob6.M0(2131746782, null), ob6.M0(2131746781, null)));
            arrayList.add(new sl8(30, 2131231150, ob6.M0(2131746780, null), ob6.M0(2131746779, null)));
            arrayList.add(new sl8(31, 2131231135, ob6.M0(2131746778, null), ob6.M0(2131746777, null)));
            arrayList.add(new sl8(32, 2131232587, ob6.M0(2131746786, null), ob6.M0(2131746785, null)));
            arrayList.add(new sl8(33, 2131231145, ob6.M0(2131746793, null), ob6.M0(2131746792, null)));
            arrayList.add(new sl8(34, 2131231146, ob6.M0(2131746788, null), ob6.M0(2131746787, null)));
            arrayList.add(new sl8(37, 2131231149, ob6.M0(2131746791, null), ob6.M0(2131746790, null)));
            arrayList.add(new sl8(36, 2131231151, ob6.M0(2131746784, null), ob6.M0(2131746783, null)));
        } else {
            arrayList.add(new sl8(12, 2131231152, ob6.M0(2131746745, null), ob6.M0(2131746744, null)));
            arrayList.add(new sl8(35, 2131232588, ob6.M0(2131746731, null), ob6.M0(2131746730, null)));
            arrayList.add(new sl8(14, 2131231148, ob6.M0(2131746743, null), ob6.M0(2131746742, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (sparseIntArray.get(((sl8) arrayList.get(i2)).a, -1) == -1) {
                    boolean z2 = f11.a;
                }
            }
        }
        Collections.sort(arrayList, new j97(s1, (byte) 3));
    }

    public static void q0(int i, ArrayList arrayList) {
        uc7 s1 = uc7.s1(i);
        String M0 = ob6.M0(2131746727, null);
        hr hrVar = s1.l4;
        arrayList.add(new sl8(0, 2131232311, M0, ob6.a0(null, null, 2131746726, Integer.valueOf(hrVar.u3.f()), Integer.valueOf(hrVar.i1.f()), Integer.valueOf(hrVar.m1.f()), Integer.valueOf(hrVar.n1.f()), 4)));
        arrayList.add(new sl8(14, 2131232159, ob6.M0(2131746703, null), ob6.a0(null, null, 2131746702, new Object[0])));
        arrayList.add(new sl8(1, 2131232320, ob6.M0(2131746693, null), ob6.M0(2131746692, null)));
        arrayList.add(new sl8(2, 2131232317, ob6.M0(2131746741, null), ob6.M0(2131746740, null)));
        arrayList.add(new sl8(8, 2131232321, ob6.M0(2131746691, null), ob6.M0(2131746690, null)));
        arrayList.add(new sl8(3, 2131232306, ob6.M0(2131746721, null), ob6.M0(2131746720, null)));
        arrayList.add(new sl8(4, 2131232316, ob6.M0(2131746711, null), ob6.M0(2131746710, null)));
        arrayList.add(new sl8(5, 2131232318, ob6.M0(2131746705, null), ob6.M0(2131746704, null)));
        arrayList.add(new sl8(11, 2131232309, ob6.M0(2131746736, null), ob6.M0(2131746735, null)));
        arrayList.add(new sl8(9, 2131231863, ob6.M0(2131746754, null), ob6.M0(2131746753, null)));
        arrayList.add(new sl8(6, 2131232308, ob6.M0(2131746716, null), ob6.M0(2131746715, null)));
        arrayList.add(new sl8(27, 2131231133, ob6.M0(2131746718, null), ob6.M0(2131746717, null)));
        arrayList.add(new sl8(7, 2131232307, ob6.M0(2131746751, null), ob6.M0(2131746750, null)));
        arrayList.add(new sl8(24, 2131232588, ob6.M0(2131746700, null), ob6.M0(2131746698, null)));
        arrayList.add(new sl8(10, 2131232310, ob6.M0(2131746749, null), ob6.M0(2131746748, null)));
        arrayList.add(new sl8(12, 2131232587, ob6.M0(2131746733, null), ob6.M0(2131746732, null)));
        arrayList.add(new sl8(13, 2131232319, ob6.M0(2131746695, null), ob6.M0(2131746694, null)));
        arrayList.add(new sl8(22, 2131232589, ob6.M0(2131746688, null), ob6.M0(2131746687, null)));
        arrayList.add(new sl8(23, 2131232585, ob6.M0(2131746714, null), ob6.M0(2131746713, null)));
        arrayList.add(new sl8(26, 2131231862, ob6.M0(2131746729, null), ob6.M0(2131746728, null)));
        arrayList.add(new sl8(28, 2131231147, ob6.M0(2131743905, null), ob6.M0(2131746746, null)));
        arrayList.add(new sl8(38, 2131231859, ob6.M0(2131746738, null), ob6.M0(2131746737, null)));
        arrayList.add(new sl8(39, 2131232310, ob6.M0(2131746697, null), ob6.M0(2131746696, null)));
        arrayList.add(new sl8(41, 2131231172, ob6.M0(2131746707, null), ob6.M0(2131746706, null)));
        arrayList.add(new sl8(42, 2131232584, ob6.M0(2131746756, null), ob6.M0(2131746755, null)));
        arrayList.add(new sl8(43, 2131232586, ob6.M0(2131746709, null), ob6.M0(2131746708, null)));
        SparseIntArray sparseIntArray = s1.E0;
        if (sparseIntArray.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (sparseIntArray.get(((sl8) arrayList.get(i2)).a, -1) == -1) {
                    boolean z = f11.a;
                }
            }
        }
        Collections.sort(arrayList, new j97(s1, (byte) 4));
    }

    public static java.lang.String r0(int r14, defpackage.tl8 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PremiumPreviewFragment.r0(int, tl8):java.lang.String");
    }

    public static void t0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(yac.t0).sendRequest(tL_help_saveAppLog, new xe2((byte) 0));
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
        ConnectionsManager.getInstance(i).sendRequest(tL_help_saveAppLog, new xe2((byte) 0));
    }

    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new xe2((byte) 0));
    }

    public final void A0(boolean z) {
        i94 i94Var;
        if (z != this.a0) {
            this.a0 = z;
            rl8 rl8Var = this.V;
            if (rl8Var != null && (i94Var = rl8Var.d) != null) {
                i94Var.setDialogVisible(z);
            }
            this.W.setPaused(z);
            this.e0.invalidate();
        }
    }

    public final void B0() {
        boolean z;
        tl8 tl8Var;
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
        if (getUserConfig().p() && ((tl8Var = this.f) == null || tl8Var.a.months >= ((tl8) this.d.get(this.e)).a.months || this.q0)) {
            z = false;
        } else {
            z = true;
        }
        hl.T3(frameLayout, z, 1.0f, true, false);
        if (this.K.getVisibility() == 0) {
            i6 = hl.L(64.0f);
        }
        td4 td4Var = this.Q;
        td4Var.M = (this.Y + i6) - hl.L(16.0f);
        td4Var.o1();
        this.Q.S = i6;
    }

    @Override
    public final boolean canBeginSlide() {
        i94 i94Var;
        rl8 rl8Var = this.V;
        if (rl8Var != null && (i94Var = rl8Var.d) != null && i94Var.a) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.A0 = new mr0(this, (byte) 6);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.R;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w0 = aob.w0(null, aob.Fk, false);
        int w02 = aob.w0(null, aob.Ek, false);
        int i = aob.Dk;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w0, w02, aob.w0(null, i, false), aob.w0(null, aob.Ck, false), aob.w0(null, aob.Bk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.S = linearGradient2;
        linearGradient2.setLocalMatrix(this.T);
        this.U.setShader(this.S);
        this.M = new yk8(context, null);
        this.N = new em8(context);
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
            b19.f(this.currentAccount).h();
            if (getUserConfig().p()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                ls6.d0(this.currentAccount).n0(tL_inputStickerSetShortName, false);
                y31.a(this.currentAccount).c(null);
                if (getMessagesController().M0.isEmpty()) {
                    getMessagesController().l3();
                }
                r41 d = r41.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable e = c00.e(context, 2131232744);
        this.J = e;
        e.setColorFilter(new PorterDuffColorFilter(getThemedColor(aob.h5), PorterDuff.Mode.MULTIPLY));
        this.J.getPadding(rect);
        this.Y = hl.m;
        this.e0 = new ml8(this, context);
        yic yicVar = new yic(this.e0);
        ml8 ml8Var = this.e0;
        ll0 ll0Var = this.y0;
        ll0Var.h = yicVar;
        ll0Var.i = ml8Var;
        yic yicVar2 = new yic(this.e0);
        ml8 ml8Var2 = this.e0;
        ll0 ll0Var2 = this.z0;
        ll0Var2.h = yicVar2;
        ll0Var2.i = ml8Var2;
        d79 d79Var = new d79(context, null);
        this.a = d79Var;
        d79Var.setClipToOutline(true);
        this.a.setOutlineProvider(new dl0(this, (byte) 7));
        this.a.F0(new ll8(this, (byte) 0));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setLegacySections(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        d79 d79Var2 = this.a;
        td4 td4Var = new td4((hl.L(68.0f) + this.Y) - hl.L(16.0f), this.a);
        this.Q = td4Var;
        d79Var2.setLayoutManager(td4Var);
        this.Q.R = true;
        this.a.setAdapter(new b0(this));
        this.a.j(new e98(this, (byte) 3));
        this.V = new rl8(this, context);
        eva evaVar = new eva(context);
        this.W = evaVar;
        evaVar.c();
        if (z) {
            eva evaVar2 = this.W;
            if (this.i0) {
                dva dvaVar = evaVar2.a;
                dvaVar.q = true;
                dvaVar.J = false;
                dvaVar.H = true;
                dvaVar.I = true;
                dvaVar.k = hl.L(-14.0f);
                dva dvaVar2 = this.W.a;
                dvaVar2.x = (short) 2000;
                dvaVar2.y = (short) 3000;
                dvaVar2.r = (byte) 16;
                dvaVar2.G = false;
                dvaVar2.N = 28;
                dvaVar2.P = i;
            } else {
                dva dvaVar3 = evaVar2.a;
                dvaVar3.I = true;
                dvaVar3.k = hl.L(28.0f);
                dva dvaVar4 = this.W.a;
                dvaVar4.x = (short) 2000;
                dvaVar4.y = (short) 3000;
                dvaVar4.r = (byte) 16;
                dvaVar4.G = false;
                dvaVar4.N = 28;
            }
        }
        this.V.d.setStarParticlesView(this.W);
        this.e0.addView(this.W, tre.c(-2.0f, -1));
        this.e0.addView(this.V, tre.c(-2.0f, -1));
        this.a.setOnItemClickListener(new zg4(this, (byte) 21));
        this.e0.addView(this.a, tre.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.L = new FrameLayout(context);
        ok8 ok8Var = new ok8(getResourceProvider(), context, false);
        this.f0 = ok8Var;
        ok8Var.L = true;
        ok8Var.setClickable(false);
        ok8Var.w.setClickable(false);
        ok8Var.setStateListAnimator(null);
        y0(false);
        this.K = new FrameLayout(context);
        this.L.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.L.addView(this.f0, tre.c(-1.0f, -1));
        View view = this.L;
        jl0 c = ll0Var.c(view, null, false);
        c.p(dtd.j(this.resourceProvider));
        c.r(hl.L(28.0f));
        c.q(hl.L(5.0f));
        view.setBackground(c);
        iye.b(this.L, 0.02f, 1.5f);
        this.K.addView(this.L, tre.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        rl0 rl0Var = new rl0(ll0Var.c(this.K, null, false));
        rl0Var.b(hl.L(40.0f), false);
        this.w0 = new rl0(ll0Var.c(this.e0, null, false));
        this.K.setBackground(rl0Var);
        if (getUserConfig().o()) {
            this.e0.addView(this.K, tre.e(-1, -2, 80));
        }
        this.fragmentView = this.e0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.actionBar.setBackButtonImage(2131231244);
        } else {
            this.actionBar.setBackButtonImage(2131231243);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 28));
        this.actionBar.setForceSkipTouches(true);
        this.e0.addView(this.actionBar, tre.e(-1, -2, 48));
        z0();
        B0();
        this.V.d.m(200L);
        if (this.q0) {
            hl.d3(new ll8(this, (byte) 1), 400L);
        }
        ls6.d0(this.currentAccount).p1();
        w0(this.j0);
        View view2 = this.fragmentView;
        jz7 jz7Var = new jz7(this, (byte) 14);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(view2, jz7Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.m5;
        int i4 = jn7.j5;
        if (i == i3 || i == i4) {
            y0(false);
            this.V.a();
        }
        if (i != jn7.i5 && i != i4) {
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
    public final jt3 getEdgeToEdgeSupportMode() {
        return jt3.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 14), aob.Ck, aob.Dk, aob.Ek, aob.Fk, aob.Gk, aob.Hk, aob.Ik, aob.Jk, aob.Kk, aob.Mk, aob.Nk, aob.Lk, aob.Qk);
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
        tq3 tq3Var;
        if (Build.VERSION.SDK_INT >= 31 && (tq3Var = this.x0) != null) {
            this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.p0.d) - hl.L(132.0f), this.fragmentView.getMeasuredWidth(), hl.L(48.0f) + this.fragmentView.getMeasuredHeight());
            tq3Var.g(1, this.B0);
            tq3Var.e(this.A0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        A0(false);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (getMessagesController().M3()) {
            return false;
        }
        jn7.e().b(this, jn7.m5);
        jn7.e().b(this, jn7.i5);
        getNotificationCenter().b(this, jn7.j5);
        if (getMediaDataController().E != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().E.videos;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Document document = arrayList.get(i);
                i++;
                xb4.G(this.currentAccount).X(document, getMediaDataController().E, 3, 0);
            }
        }
        if (this.h0) {
            wsb.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.e().n(this, jn7.m5);
        jn7.e().n(this, jn7.i5);
        getNotificationCenter().n(this, jn7.j5);
    }

    @Override
    public final void onPause() {
        i94 i94Var;
        super.onPause();
        rl8 rl8Var = this.V;
        if (rl8Var != null && (i94Var = rl8Var.d) != null) {
            i94Var.setDialogVisible(true);
        }
        eva evaVar = this.W;
        if (evaVar != null) {
            evaVar.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        i94 i94Var;
        super.onResume();
        rl8 rl8Var = this.V;
        if (rl8Var != null && (i94Var = rl8Var.d) != null) {
            i94Var.setPaused(false);
            this.V.d.setDialogVisible(false);
        }
        this.W.setPaused(false);
        setBulletinDelegate(new t10(this, (byte) 16));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(aob.h5);
        Drawable drawable = this.J;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            eva evaVar = this.W;
            if (evaVar != null && evaVar.a != null && this.e0 != null) {
                z0();
            }
        } catch (Exception e) {
            cc4.g(e, true);
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
        A0(z);
        return showDialog;
    }

    public final void x0() {
        rl8 rl8Var;
        if (this.e0.getMeasuredWidth() != 0 && this.e0.getMeasuredHeight() != 0 && (rl8Var = this.V) != null && rl8Var.d != null) {
            if (this.i0) {
                int f = vm2.f(0.5f, getThemedColor(aob.Dk), getThemedColor(aob.h5));
                i94 i94Var = this.s0;
                i94 i94Var2 = this.V.d;
                if (i94Var != i94Var2 || this.t0 != f) {
                    this.s0 = i94Var2;
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
            al8 al8Var = this.n0;
            al8Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.m0;
            canvas.save();
            canvas.scale(100.0f / this.e0.getMeasuredWidth(), 100.0f / this.e0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.e0.getMeasuredWidth(), this.e0.getMeasuredHeight(), al8Var.f);
            canvas.restore();
            this.V.d.setBackgroundBitmap(this.l0);
        }
    }

    public final void y0(boolean z) {
        if (this.f0 != null) {
            boolean p = getUserConfig().p();
            ArrayList arrayList = this.d;
            if (!p || this.f == null || this.e >= arrayList.size() || ((tl8) arrayList.get(this.e)).a.months >= this.f.a.months) {
                if (ob6.a0) {
                    z = false;
                }
                if (!f11.b() && (!di0.h().j() || arrayList.isEmpty() || this.e >= arrayList.size() || ((tl8) arrayList.get(this.e)).f == null)) {
                    this.f0.b(ob6.M0(2131748533, null), null, z);
                    this.L.setOnClickListener(new y00((byte) 1));
                    this.f0.setFlickerDisabled(true);
                } else if (!arrayList.isEmpty() && this.e < arrayList.size()) {
                    this.f0.b(r0(this.currentAccount, (tl8) arrayList.get(this.e)), null, z);
                    this.L.setOnClickListener(new am7(this, (byte) 26));
                    this.f0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void z0() {
        int i;
        int i2;
        ys4 ys4Var;
        if (this.V != null && this.actionBar != null) {
            boolean z = this.i0;
            if (z) {
                i = aob.G6;
            } else {
                i = aob.Kk;
            }
            int w0 = aob.w0(null, i, false);
            if (w0 != this.u0) {
                this.u0 = w0;
                this.actionBar.H(w0, true);
                this.actionBar.H(w0, false);
            }
            int i3 = aob.Kk;
            int o = vm2.o(aob.w0(null, i3, false), 60);
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar.q0 != o) {
                aVar.G(o, false);
            }
            this.W.a.g();
            rl8 rl8Var = this.V;
            if (rl8Var != null) {
                TextView textView = rl8Var.a;
                if (z) {
                    i2 = aob.G6;
                } else {
                    i2 = i3;
                }
                textView.setTextColor(aob.w0(null, i2, false));
                TextView textView2 = this.V.b;
                if (z) {
                    i3 = aob.G6;
                }
                textView2.setTextColor(aob.w0(null, i3, false));
                i94 i94Var = this.V.d;
                if (i94Var != null && (ys4Var = i94Var.b) != null) {
                    if (z) {
                        ys4Var.z = aob.Ok;
                        ys4Var.A = aob.Pk;
                    }
                    ys4Var.b();
                }
            }
            x0();
        }
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
