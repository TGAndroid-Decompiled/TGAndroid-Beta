package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class e51 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.a40, of0, fe.e {
    public l0 D;
    public x41 E;
    public org.telegram.ui.Components.r8 F;
    public org.telegram.ui.Components.g9 G;
    public FrameLayout H;
    public FrameLayout I;
    public ImageView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public boolean N;
    public View O;
    public View P;
    public int Q;
    public xa.n R;
    public int S;
    public boolean T;
    public ValueAnimator U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final fe.b f36931a;
    public float f36932a0;
    public w8 f36933b;
    public final ArrayList f36934b0;
    public org.telegram.ui.Components.u51 f36935c;
    public int f36936c0;
    public org.telegram.ui.ActionBar.p5 d;
    public int f36937d0;
    public org.telegram.ui.ActionBar.p5 e;
    public int f36938e0;
    public v41 f36939f;
    public boolean f36940f0;
    public org.telegram.ui.Components.b40 h;
    public AnimatorSet f36941n;
    public org.telegram.ui.Cells.d4 f36942r;
    public TLRPC.FileLocation f36943s;
    public TLRPC.FileLocation f36944w;
    public FrameLayout f36945x;
    public FrameLayout f36946y;

    public e51() {
        this(null);
    }

    public static boolean Y(e51 e51Var, org.telegram.ui.Components.a51 a51Var, View view) {
        String str;
        Object obj = a51Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            xh.m2.n(e51Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new r41(e51Var, 2));
            return true;
        }
        if (a51Var.H(org.telegram.ui.Cells.x6.class)) {
            Object obj2 = a51Var.G;
            if (obj2 instanceof gy0) {
                str = ((gy0) obj2).h;
            } else if (obj2 instanceof org.telegram.messenger.hp) {
                str = ((org.telegram.messenger.hp) obj2).f15928c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(e51Var, view);
                H.c(2131232203, org.telegram.messenger.cd.L0(2131751762, null), new t11(1, e51Var, str), false);
                H.W(e51Var.f36935c.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void Z(e51 e51Var) {
        boolean z10;
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(e51Var.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(e51Var.currentAccount).e()));
        if (Z1 == null) {
            Z1 = org.telegram.messenger.d20.i(e51Var.currentAccount).f();
        }
        if (Z1 == null) {
            return;
        }
        org.telegram.ui.Components.b40 b40Var = e51Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        b40Var.n(z10, new r41(e51Var, 0), new jg.z(6), 0);
    }

    public static void a0(e51 e51Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.I1, e51Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(e51Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f18307b;
        if (tL_attachMenuBots != null) {
            long j10 = b02.f18304a;
            b02.getMessagesStorage().f15938a.c(new org.telegram.messenger.rk(b02.e, 2, j10, b02, tL_attachMenuBots));
        }
    }

    public static void b0(e51 e51Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.vp.r1(e51Var.currentAccount).n1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(e51Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ul0(12, e51Var, tL_attachMenuBot), 66);
    }

    public static void c0(e51 e51Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize x10;
        e51Var.f36938e0 = -1;
        if (tL_error == null) {
            TLRPC.User Z1 = e51Var.getMessagesController().Z1(Long.valueOf(e51Var.getUserConfig().e()));
            if (Z1 == null) {
                Z1 = e51Var.getUserConfig().f();
                if (Z1 == null) {
                    return;
                }
                e51Var.getMessagesController().U3(Z1, false, false);
            } else {
                e51Var.getUserConfig().w(Z1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x10 = null;
            } else {
                x10 = org.telegram.messenger.b8.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            Z1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19817id;
            if (w9 != null) {
                tL_userProfilePhoto.photo_small = w9.location;
            }
            if (w10 != null) {
                tL_userProfilePhoto.photo_big = w10.location;
            }
            if (w9 != null && e51Var.f36943s != null) {
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                File K = org.telegram.messenger.b8.K(w9, null, true, true);
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                org.telegram.messenger.b8.K(e51Var.f36943s, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e51Var.f36943s.volume_id);
                sb2.append("_");
                String p5 = a1.g.p(sb2, e51Var.f36943s.local_id, "@90_90");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w9.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.hc.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@90_90"), org.telegram.messenger.ic.m(e51Var.currentAccount, 1, Z1));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                new File(str).renameTo(org.telegram.messenger.b8.K(x10, "mp4", true, true));
            } else if (w10 != null && e51Var.f36944w != null) {
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                File K2 = org.telegram.messenger.b8.K(w10, null, true, true);
                org.telegram.messenger.b8.G(e51Var.currentAccount);
                org.telegram.messenger.b8.K(e51Var.f36944w, null, true, true).renameTo(K2);
            }
            e51Var.getMessagesController().T0(Z1.f19942id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Z1);
            e51Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull a2 = e51Var.getMessagesController().a2(e51Var.getUserConfig().e());
            if (a2 != null) {
                a2.profile_photo = tL_photos_photo.photo;
                e51Var.getMessagesStorage().j2(a2, false);
            }
            e51Var.l0(Z1);
        }
        e51Var.f36943s = null;
        e51Var.f36944w = null;
        e51Var.m0(false, true);
        e51Var.getNotificationCenter().k(org.telegram.messenger.zs.f19676r, Integer.valueOf(org.telegram.messenger.vp.D8));
        e51Var.getNotificationCenter().k(org.telegram.messenger.zs.f19632j0, new Object[0]);
        e51Var.getUserConfig().v(true);
    }

    public static void d0(e51 e51Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            e51Var.f36943s = fileLocation;
            e51Var.f36944w = photoSize2.location;
            e51Var.G.j(org.telegram.messenger.ic.e(fileLocation), "90_90", e51Var.F, null);
            e51Var.m0(true, false);
        } else if (e51Var.f36943s == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            e51Var.f36938e0 = e51Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ul0(13, e51Var, str));
        }
        e51Var.simpleActionBar.o().requestLayout();
    }

    public static void e0(e51 e51Var, ArrayList arrayList) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i10;
        String str;
        int i11;
        String str2;
        int i12 = 0;
        if (e51Var.d.w()) {
            arrayList.add(org.telegram.ui.Components.a51.D(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
            v41 v41Var = e51Var.f36939f;
            ArrayList arrayList2 = v41Var.d;
            ArrayList arrayList3 = v41Var.f38058w;
            if (v41Var.f38059x) {
                ArrayList arrayList4 = v41Var.f38056r;
                int size = arrayList4.size();
                int i13 = 0;
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int i15 = org.telegram.ui.Cells.x6.f23584b;
                    org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                    K.f24292l = (CharSequence) v41Var.f38055n.get(i13);
                    K.G = (gy0) obj;
                    arrayList.add(K);
                    i13++;
                }
                if (!v41Var.f38057s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(2131745500, null)));
                    ArrayList arrayList5 = v41Var.f38057s;
                    int size2 = arrayList5.size();
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        i12++;
                        int i16 = org.telegram.ui.Cells.x6.f23584b;
                        org.telegram.ui.Components.a51 K2 = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                        K2.f24292l = (CharSequence) v41Var.f38055n.get(i13);
                        K2.G = (org.telegram.messenger.hp) obj2;
                        arrayList.add(K2);
                        i13++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(2131745487, null)));
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    if (obj3 instanceof gy0) {
                        gy0 gy0Var = (gy0) obj3;
                        String str3 = gy0Var.f37669a;
                        int i18 = org.telegram.ui.Cells.x6.f23584b;
                        org.telegram.ui.Components.a51 K3 = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                        K3.f24292l = str3;
                        K3.G = gy0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.hp) {
                        org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) obj3;
                        String str4 = hpVar.f15926a;
                        int i19 = org.telegram.ui.Cells.x6.f23584b;
                        org.telegram.ui.Components.a51 K4 = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                        K4.f24292l = str4;
                        K4.G = hpVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(2131745500, null)));
                int size4 = arrayList2.size();
                while (i12 < size4) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    org.telegram.messenger.hp hpVar2 = (org.telegram.messenger.hp) obj4;
                    String str5 = hpVar2.f15926a;
                    int i20 = org.telegram.ui.Cells.x6.f23584b;
                    org.telegram.ui.Components.a51 K5 = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.x6.class);
                    K5.f24292l = str5;
                    K5.G = hpVar2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.a51.n(e51Var.f36945x, 188));
        e51Var.f36934b0.clear();
        for (int i21 = 0; i21 < 4; i21++) {
            if (org.telegram.messenger.d20.i(i21).p() && e51Var.currentAccount != i21) {
                e51Var.f36934b0.add(Integer.valueOf(i21));
            }
        }
        Collections.sort(e51Var.f36934b0, new ex0(2));
        Set set = e51Var.getMessagesController().U3;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(c51.i(org.telegram.messenger.cd.L0(2131749535, null), org.telegram.messenger.cd.L0(2131749536, null), null, null, org.telegram.messenger.cd.L0(2131749537, null), new s41(e51Var, 0)));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && e51Var.getUserConfig().f() != null) {
            arrayList.add(c51.i(org.telegram.messenger.cd.a0(null, null, 2131752156, org.telegram.messenger.m5.h(new StringBuilder("+"), e51Var.getUserConfig().f().phone, af.b.c())), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752155, null), new r41(e51Var, 1)), org.telegram.messenger.cd.L0(2131752153, null), new s41(e51Var, 1), rh.e4.g2(org.telegram.messenger.cd.L0(2131752151, null)), new s41(e51Var, 2)));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(c51.i(org.telegram.messenger.cd.L0(2131742828, null), org.telegram.messenger.cd.L0(2131742827, null), org.telegram.messenger.cd.L0(2131742826, null), new s41(e51Var, 3), org.telegram.messenger.cd.L0(2131742825, null), new s41(e51Var, 4)));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        if (e51Var.f36934b0.size() > 0) {
            arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131745509, null)));
            for (int i22 = 0; i22 < e51Var.f36934b0.size(); i22++) {
                int intValue = ((Integer) e51Var.f36934b0.get(i22)).intValue();
                int i23 = y41.f43706b;
                org.telegram.ui.Components.a51 K6 = org.telegram.ui.Components.a51.K(y41.class);
                K6.d = i22;
                K6.f24305z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        if (e51Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && ((org.telegram.messenger.j0) e51Var.getMessagesController().f18957y7.f17841j0.f11587b).f16204c) {
            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(e51Var.currentAccount);
            if (org.telegram.ui.ActionBar.t6.I.q()) {
                i11 = 2131232717;
            } else {
                i11 = 2131232716;
            }
            CharSequence L0 = org.telegram.messenger.cd.L0(2131743220, null);
            int i24 = org.telegram.ui.Cells.p8.V;
            if (ConnectionsManager.getInstance(org.telegram.messenger.d20.f15147s0).getCurrentTime() - 1790679020 <= 2419200) {
                L0 = org.telegram.ui.Cells.p8.b(L0);
            }
            CharSequence charSequence = L0;
            if (x10.v() > 0) {
                str2 = org.telegram.ui.Wallet.k0.o(x10.v(), false);
            } else {
                str2 = null;
            }
            arrayList.add(a51.i(25, 0, 0, i11, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        arrayList.add(a51.i(1, -14899731, -15431455, 2131232693, org.telegram.messenger.cd.L0(2131745511, null), org.telegram.messenger.cd.L0(2131745510, null), null));
        arrayList.add(a51.i(2, -1007845, -1996271, 2131232699, org.telegram.messenger.cd.L0(2131745507, null), org.telegram.messenger.cd.L0(2131745506, null), null));
        arrayList.add(a51.i(3, -11154873, -14175180, 2131232713, org.telegram.messenger.cd.L0(2131745489, null), org.telegram.messenger.cd.L0(2131745488, null), null));
        arrayList.add(a51.i(5, -765355, -2148011, 2131232714, org.telegram.messenger.cd.L0(2131745493, null), org.telegram.messenger.cd.L0(2131745492, null), null));
        arrayList.add(a51.i(6, -11565578, -13276952, 2131232700, org.telegram.messenger.cd.L0(2131745505, null), org.telegram.messenger.cd.L0(2131745504, null), null));
        arrayList.add(a51.i(7, -14899731, -15497247, 2131232704, org.telegram.messenger.cd.L0(2131745499, null), org.telegram.messenger.cd.L0(2131745498, null), null));
        arrayList.add(a51.i(8, -13451058, -14836538, 2131232701, org.telegram.messenger.cd.L0(2131745502, null), org.telegram.messenger.cd.L0(2131745501, null), null));
        arrayList.add(a51.i(9, -881871, -1940716, 2131232711, org.telegram.messenger.cd.L0(2131745491, null), org.telegram.messenger.cd.L0(2131745490, null), null));
        arrayList.add(a51.i(10, -3903756, -6335009, 2131232709, org.telegram.messenger.cd.L0(2131745496, null), org.telegram.messenger.cd.j0(), null));
        arrayList.add(org.telegram.ui.Components.a51.C(null));
        if (!z10 && ((org.telegram.messenger.j0) e51Var.getMessagesController().f18957y7.f17841j0.f11587b).f16204c) {
            org.telegram.ui.Wallet.k0 x11 = org.telegram.ui.Wallet.k0.x(e51Var.currentAccount);
            if (org.telegram.ui.ActionBar.t6.I.q()) {
                i10 = 2131232717;
            } else {
                i10 = 2131232716;
            }
            CharSequence L02 = org.telegram.messenger.cd.L0(2131743220, null);
            int i25 = org.telegram.ui.Cells.p8.V;
            if (ConnectionsManager.getInstance(org.telegram.messenger.d20.f15147s0).getCurrentTime() - 1790679020 <= 2419200) {
                L02 = org.telegram.ui.Cells.p8.b(L02);
            }
            CharSequence charSequence2 = L02;
            if (x11.v() > 0) {
                str = org.telegram.ui.Wallet.k0.o(x11.v(), false);
            } else {
                str = null;
            }
            arrayList.add(a51.i(25, 0, 0, i10, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        if (!e51Var.getMessagesController().A3()) {
            arrayList.add(a51.i(11, -4826625, -10388225, 2131232712, org.telegram.messenger.cd.L0(2131744256, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!e51Var.getMessagesController().f18831k7) {
            rh.e6 y3 = rh.e6.y(e51Var.currentAccount, false);
            long j10 = y3.p().amount;
            String L03 = org.telegram.messenger.cd.L0(2131744240, null);
            if (!y3.e || j10 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = rh.h8.L0(y3.p(), 0.85f, ' ');
            }
            arrayList.add(a51.i(12, -1071598, -1608430, 2131232715, L03, null, spannableStringBuilder));
        }
        rh.e6.y(e51Var.currentAccount, true).p();
        org.telegram.messenger.w0.n();
        rh.e6 y10 = rh.e6.y(e51Var.currentAccount, true);
        long j11 = y10.p().amount;
        String L04 = org.telegram.messenger.cd.L0(2131749524, null);
        if (y10.e && j11 > 0) {
            charSequence3 = rh.h8.L0(y10.p(), 0.85f, ' ');
        }
        arrayList.add(a51.i(13, -14965523, -15431455, 2131231125, L04, null, charSequence3));
        if (!e51Var.getMessagesController().A3()) {
            arrayList.add(a51.i(15, -765355, -2148011, 2131232696, org.telegram.messenger.cd.L0(2131744277, null), null, null));
        }
        if (!e51Var.getMessagesController().f18813i7) {
            arrayList.add(a51.i(16, -816335, -1940716, 2131232705, org.telegram.messenger.cd.L0(2131745656, null), null, null));
        }
        if (((org.telegram.ui.Components.a51) i0.a.g(1, arrayList)).f7680a != 7) {
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131745497, null)));
        arrayList.add(a51.i(17, -1007845, -1996271, 2131232695, org.telegram.messenger.cd.L0(2131753986, null), null, null));
        arrayList.add(a51.i(18, -14965523, -15431455, 2131232702, org.telegram.messenger.cd.L0(2131744267, null), null, null));
        arrayList.add(a51.i(23, -3903756, -6335009, 2131232703, org.telegram.messenger.cd.L0(2131744264, null), null, null));
        arrayList.add(a51.i(19, -11154873, -14175180, 2131232710, org.telegram.messenger.cd.L0(2131746798, null), null, null));
        mi.a aVar = mi.e.f13384a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.a51.C(null));
            arrayList.add(org.telegram.ui.Components.a51.u("Experimental"));
            arrayList.add(a51.i(24, -765355, -2148011, 0, org.telegram.messenger.cd.L0(2131746002, null), null, null));
            arrayList.add(a51.i(26, -11154873, -14175180, 0, org.telegram.messenger.cd.L0(2131753919, null), null, null));
            arrayList.add(a51.i(27, -12743701, -13996071, 0, org.telegram.messenger.cd.L0(2131749339, null), null, null));
        }
        if (org.telegram.messenger.v2.f18448a) {
            arrayList.add(org.telegram.ui.Components.a51.C(null));
            arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131745503, null)));
            arrayList.add(a51.i(20, -11154873, -14175180, 0, org.telegram.messenger.cd.L0(2131751614, null), null, null));
            arrayList.add(a51.i(21, -11154873, -14175180, 0, org.telegram.messenger.cd.L0(2131751615, null), null, null));
            arrayList.add(a51.i(22, -765355, -2148011, 0, org.telegram.messenger.cd.L0(2131751651, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.a51.m(e51Var.M));
    }

    public static void g0(e51 e51Var, org.telegram.ui.Components.a51 a51Var) {
        Object obj = a51Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.G0(LaunchActivity.I1, e51Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                te1.a(e51Var.getParentActivity(), new f11(1, e51Var, tL_attachMenuBot), null);
            }
        } else if (a51Var.H(y41.class)) {
            int i10 = a51Var.f24305z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.O0(i10);
            }
        } else if (a51Var.H(org.telegram.ui.Cells.x6.class)) {
            Object obj2 = a51Var.G;
            if (obj2 instanceof gy0) {
                gy0 gy0Var = (gy0) obj2;
                org.telegram.ui.ActionBar.z4 parentLayout = e51Var.getParentLayout();
                gy0Var.f37670b.run();
                org.telegram.messenger.i0.j3(parentLayout, gy0Var.f37671c);
            } else if (obj2 instanceof org.telegram.messenger.hp) {
                org.telegram.messenger.zs.f(e51Var.currentAccount).k(org.telegram.messenger.zs.f19591c1, e51Var.f36939f.E, ((org.telegram.messenger.hp) obj2).f15928c);
            }
            Object obj3 = a51Var.G;
            if (obj3 != null) {
                e51Var.f36939f.E(obj3);
            }
        } else {
            switch (a51Var.d) {
                case 1:
                    e51Var.j0(new UserInfoActivity());
                    return;
                case 2:
                    e51Var.j0(new ThemeActivity(0));
                    return;
                case 3:
                    e51Var.j0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    e51Var.j0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    e51Var.j0(new DataSettingsActivity());
                    return;
                case 7:
                    e51Var.j0(new FiltersSetupActivity());
                    return;
                case 8:
                    e51Var.j0(new SessionsActivity(0));
                    return;
                case 9:
                    e51Var.j0(new bb0());
                    return;
                case 10:
                    e51Var.j0(new LanguageSelectActivity());
                    return;
                case 11:
                    e51Var.j0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    e51Var.j0(new rh.h8());
                    return;
                case 13:
                    e51Var.j0(new wh.g());
                    return;
                case 15:
                    e51Var.j0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    mg.i2.l1(0, org.telegram.messenger.y1.a(org.telegram.messenger.d20.f15147s0).b());
                    return;
                case 17:
                    e51Var.showDialog(org.telegram.ui.Components.s4.T(e51Var, e51Var.resourceProvider));
                    return;
                case 18:
                    gf.f.r(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                    return;
                case 19:
                    gf.f.r(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
                    return;
                case 20:
                    ProfileActivity.U4(e51Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.U4(e51Var.getParentActivity(), true);
                    return;
                case 22:
                    org.telegram.messenger.f8.a();
                    return;
                case 23:
                    if (org.telegram.messenger.vp.r1(e51Var.currentAccount).u2()) {
                        b.b(e51Var.currentAccount);
                        return;
                    } else {
                        gf.f.r(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131744263, null));
                        return;
                    }
                case 24:
                    e51Var.presentFragment(new l01(0, null));
                    return;
                case 25:
                    e51Var.j0(new org.telegram.ui.Wallet.b6());
                    return;
                case 26:
                    e51Var.presentFragment(new l01(1, null));
                    return;
                case 27:
                    ?? r51Var = new org.telegram.ui.Components.r51();
                    r51Var.e = true;
                    e51Var.presentFragment((org.telegram.ui.ActionBar.k2) r51Var);
                    return;
            }
        }
    }

    public static ei.r h0(e51 e51Var) {
        return e51Var.glassEngine;
    }

    @Override
    public final hi.f B() {
        return getBaseSimpleGlass().h;
    }

    @Override
    public final void H(float f7) {
        org.telegram.ui.Cells.d4 d4Var = this.f36942r;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.f36942r;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f36933b = new w8(this, context, 9);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.f36940f0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745512, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, 2));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.p5 b10 = o10.b(0, 2131232485);
        b10.N();
        b10.B0 = new ag.l3(this, 21);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        org.telegram.ui.ActionBar.p5 b11 = o10.b(1, 2131231245);
        this.e = b11;
        b11.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        this.e.e(2, 2131232194, org.telegram.messenger.cd.L0(2131748754, null));
        v41 v41Var = new v41(this, this, context);
        this.f36939f = v41Var;
        v41Var.G();
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new z4(this, 26), new t41(this), new t41(this));
        this.f36935c = u51Var;
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.u51 u51Var2 = this.f36935c;
        u51Var2.f30819f3.f29295r = false;
        u51Var2.r1();
        this.f36935c.setSectionsDrawBackground(true);
        ei.b.e(this.f36935c, 0, 0, org.telegram.messenger.i0.L(12.0f), this.f36937d0);
        this.f36935c.setClipToPadding(false);
        this.f36935c.j(new w41(this, 0));
        this.f36933b.addView(this.f36935c, w7.b6.e(-1, -1, 119));
        View view = new View(context);
        this.P = view;
        view.setBackground(getBaseSimpleGlass().a(this.P));
        this.f36933b.addView(this.P, w7.b6.e(-1, 0, 48));
        this.f36933b.addView(this.simpleActionBar, w7.b6.e(-1, -2, 55));
        org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
        this.h = b40Var;
        b40Var.H = true;
        b40Var.f24523a = this;
        b40Var.f24524b = this;
        this.f36945x = new FrameLayout(context);
        l0 l0Var = new l0(this, context, 26);
        this.D = l0Var;
        this.f36945x.addView(l0Var, w7.b6.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.D.setOnClickListener(new s41(this, 5));
        w7.e6.a(this.D);
        this.f36945x.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                e51.this.o0();
            }
        });
        this.E = new org.telegram.ui.Components.yg0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36946y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.f36946y.setPivotY(0.0f);
        this.E.addView(this.f36946y, w7.b6.e(90, 90, 51));
        w8 w8Var = this.f36933b;
        w8Var.addView(this.E, w8Var.indexOfChild(this.f36935c) + 1, w7.b6.c(-1.0f, -1));
        this.F = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.G = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(90.0f));
        this.f36946y.addView(this.G, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(this, context);
        this.f36942r = d4Var;
        d4Var.setSize(org.telegram.messenger.i0.L(26.0f));
        this.f36942r.setProgressColor(-1);
        this.f36942r.setNoProgress(false);
        this.f36946y.addView(this.f36942r, w7.b6.c(-1.0f, -1));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        int L = org.telegram.messenger.i0.L(32.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f20872a7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, getThemedColor(i10));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, L2, N, null, resourceProvider);
        this.H.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.I = frameLayout3;
        int L3 = org.telegram.messenger.i0.L(30.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L4 = org.telegram.ui.ActionBar.t6.L(L3, getThemedColor(i11));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.p6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(L4);
        org.telegram.ui.ActionBar.a7.k(frameLayout3, L4, N2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.J.setImageResource(2131231146);
        this.I.addView(this.J, w7.b6.e(22, 22, 17));
        this.H.addView(this.I, w7.b6.c(30.0f, 30));
        this.H.setPivotX(0.0f);
        this.H.setPivotY(0.0f);
        w8 w8Var2 = this.f36933b;
        w8Var2.addView(this.H, w8Var2.indexOfChild(this.E) + 1, w7.b6.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.K = textView;
        textView.setTextSize(1, 22.0f);
        this.K.setTypeface(org.telegram.messenger.i0.o());
        this.K.setGravity(17);
        this.K.setSingleLine();
        TextView textView2 = this.K;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView l4 = org.telegram.ui.Cells.f1.l(this.f36945x, this.K, w7.b6.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.L = l4;
        l4.setTextSize(1, 13.0f);
        this.L.setGravity(17);
        this.L.setSingleLine();
        this.L.setEllipsize(truncateAt);
        TextView l10 = org.telegram.ui.Cells.f1.l(this.f36945x, this.L, w7.b6.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.M = l10;
        l10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(this.M, org.telegram.ui.ActionBar.t6.B6, getResourceProvider());
        this.M.setPadding(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(10.0f));
        this.M.setGravity(17);
        TextView textView3 = this.M;
        int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.ActionBar.a7.R(textView3, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i12), 2, -1), null, org.telegram.ui.ActionBar.a7.N(i12), getResourceProvider());
        this.M.setOnClickListener(new s41(this, 6));
        this.O = new View(context);
        n0(true, false);
        this.f36935c.f30819f3.O(false);
        l0(getUserConfig().f());
        p0();
        i0();
        this.simpleActionBar.setBackground(null);
        int i13 = this.mSystemInsets.f7766b;
        if (this.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i13;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.P.setLayoutParams(layoutParams);
            }
        }
        n0(true, false);
        w8 w8Var3 = this.f36933b;
        t41 t41Var = new t41(this);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(w8Var3, t41Var);
        w8 w8Var4 = this.f36933b;
        this.fragmentView = w8Var4;
        return w8Var4;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.u51 u51Var;
        if (i10 == org.telegram.messenger.zs.y3) {
            l0(getUserConfig().f());
            org.telegram.ui.Components.u51 u51Var2 = this.f36935c;
            if (u51Var2 != null) {
                u51Var2.f30819f3.O(true);
            }
        } else if (i10 == org.telegram.messenger.zs.f19676r) {
            l0(getUserConfig().f());
        } else if (i10 == org.telegram.messenger.zs.f19685s1 && (u51Var = this.f36935c) != null) {
            u51Var.f30819f3.O(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final gs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f36935c;
    }

    public final void i0() {
        org.telegram.ui.ActionBar.i5 i5Var;
        boolean z10;
        int i10;
        int i11;
        if (this.N && (z10 = (i5Var = this.simpleActionBar).F) != this.f36940f0) {
            this.f36940f0 = z10;
            if (z10) {
                i10 = 2131231241;
            } else {
                i10 = 2131232484;
            }
            i5Var.setBackButtonImageAnimated(i10);
            org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
            if (z10) {
                i11 = 2131754878;
            } else {
                i11 = 2131746515;
            }
            i5Var2.setBackButtonContentDescription(org.telegram.messenger.cd.L0(i11, null));
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f36931a.f7021f;
    }

    public final void j0(org.telegram.ui.ActionBar.k2 k2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.i0.Q1() && (launchActivity = LaunchActivity.I1) != null && (actionBarLayout = launchActivity.f33381s0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.c0((org.telegram.ui.ActionBar.k2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.w4 w4Var = new org.telegram.ui.ActionBar.w4(k2Var);
            w4Var.f21447c = true;
            w4Var.f21449g = true;
            actionBarLayout.T(w4Var);
            return;
        }
        presentFragment(k2Var);
    }

    public final void k0(float f7) {
        this.simpleActionBar.setTitlesAlpha(f7);
        View view = this.P;
        if (view != null) {
            view.setAlpha(f7);
        }
    }

    public final void l0(TLRPC.User user) {
        String str;
        if (this.G == null || this.f36938e0 != -1) {
            return;
        }
        this.F.r(user);
        this.G.e(user, this.F);
        this.K.setText(org.telegram.messenger.h20.p(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(af.b.c().b("+" + user.phone));
        }
        String n10 = org.telegram.messenger.h20.n(user);
        if (n10 != null) {
            sb2.append(" • @");
            sb2.append(n10);
        }
        this.L.setText(sb2);
        TextView textView = this.M;
        String str2 = null;
        try {
            PackageInfo packageInfo = org.telegram.messenger.w0.f19025b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.f19025b.getPackageName(), 0);
            int i10 = packageInfo.versionCode;
            int i11 = i10 / 10;
            int i12 = i10 % 10;
            if (i12 != 1 && i12 != 2) {
                org.telegram.messenger.w0.u();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            str2 = org.telegram.messenger.cd.a0(null, null, 2131744235, "v" + packageInfo.versionName + " (" + i11 + ")\n" + str);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        textView.setText(str2);
    }

    public final void m0(boolean z10, boolean z11) {
        if (this.f36942r == null) {
            return;
        }
        AnimatorSet animatorSet = this.f36941n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f36941n = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f36941n = animatorSet2;
            if (z10) {
                this.f36942r.setVisibility(0);
                this.f36941n.playTogether(ObjectAnimator.ofFloat(this.f36942r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36942r, View.ALPHA, 0.0f));
            }
            this.f36941n.setDuration(180L);
            this.f36941n.addListener(new org.telegram.ui.Components.ha0(25, this, z10));
            this.f36941n.start();
        } else if (z10) {
            this.f36942r.setAlpha(1.0f);
            this.f36942r.setVisibility(0);
        } else {
            this.f36942r.setAlpha(0.0f);
            this.f36942r.setVisibility(4);
        }
    }

    public final void n0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e51.n0(boolean, boolean):void");
    }

    public final void o0() {
        if (this.E != null && this.f36946y != null) {
            float height = this.D.getHeight() / 2.0f;
            View view = this.D;
            float f7 = 1.0f;
            while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
                height += view.getY();
                f7 *= view.getAlpha();
                view = (View) view.getParent();
            }
            if (view == this.fragmentView && this.D.isAttachedToWindow() && this.D.getHeight() != 0) {
                float f10 = 0.0f;
                for (View view2 = this.f36945x; view2 != null && view2 != this.f36935c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    f10 += view2.getY();
                }
                float paddingTop = (height - f10) + this.f36935c.getPaddingTop();
                x41 x41Var = this.E;
                float f11 = -org.telegram.messenger.i0.L(16.0f);
                org.telegram.messenger.ks ksVar = x41Var.f32735n;
                if (ksVar != null && ksVar.f16632c) {
                    f11 = ksVar.e.centerY();
                }
                float a2 = w7.u.a((height - f11) / Math.max(1.0f, paddingTop - f11), 0.0f, 1.0f);
                float max = Math.max(height, f11);
                this.Y = height;
                this.Z = paddingTop;
                this.f36932a0 = f11;
                float L = org.telegram.messenger.i0.L(90.0f);
                float scaleX = this.D.getScaleX() * (org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(this.E.getHiddenAvatarSizeDp()), L, a2) / L);
                float f12 = (L * scaleX) / 2.0f;
                float width = (this.E.getWidth() / 2.0f) - f12;
                if (max != this.V || scaleX != this.W || a2 != this.X || f7 != this.E.getAlpha() || width != this.f36946y.getTranslationX()) {
                    this.V = max;
                    this.W = scaleX;
                    this.X = a2;
                    this.E.setAlpha(f7);
                    this.f36946y.setScaleX(scaleX);
                    this.f36946y.setScaleY(scaleX);
                    this.f36946y.setTranslationX(width);
                    float f13 = max - f12;
                    this.f36946y.setTranslationY(f13);
                    this.H.setAlpha(w7.u.a(org.telegram.messenger.i0.z1(a2, 0.75f, 1.0f), 0.0f, 1.0f) * f7);
                    this.H.setScaleX(scaleX);
                    this.H.setScaleY(scaleX);
                    this.H.setTranslationX((org.telegram.messenger.i0.L(60.0f) * scaleX) + width);
                    this.H.setTranslationY((org.telegram.messenger.i0.L(60.0f) * scaleX) + f13);
                    this.E.setHideProgress(1.0f - a2);
                }
            } else if (this.X != 0.0f) {
                this.X = 0.0f;
                this.E.setHideProgress(1.0f);
                this.H.setAlpha(0.0f);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var.F) {
            if (z10) {
                i5Var.j(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        xa.n nVar = this.R;
        if (nVar != null) {
            nVar.a();
            this.R = null;
        }
        xa.n nVar2 = new xa.n(org.telegram.messenger.zs.e(), this);
        nVar2.e(org.telegram.messenger.zs.f19676r);
        nVar2.e(org.telegram.messenger.zs.y3);
        nVar2.e(org.telegram.messenger.zs.f19685s1);
        this.R = nVar2;
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.N = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.N) {
            i10 = org.telegram.messenger.i0.L(72.0f);
        }
        this.f36937d0 = i10;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xa.n nVar = this.R;
        if (nVar != null) {
            nVar.a();
            this.R = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.p51 p51Var = this.f36935c.f30819f3;
        if (p51Var != null) {
            p51Var.O(false);
        }
    }

    public final void p0() {
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.G6));
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21311y6));
        this.d.V();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6);
        if (this.O.getBackground() == null || themedColor != this.S) {
            this.S = themedColor;
            this.O.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, themedColor), themedColor}));
        }
        this.f36935c.invalidate();
    }

    @Override
    public final void u() {
        this.f36935c.y0(0);
    }

    @Override
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            i0();
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    public e51(Bundle bundle) {
        super(bundle);
        this.f36931a = new fe.b(0, this, org.telegram.ui.Components.gr.h, 350L, false);
        this.Q = 0;
        this.X = -1.0f;
        this.f36934b0 = new ArrayList();
        this.f36938e0 = -1;
        this.f36940f0 = true;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
