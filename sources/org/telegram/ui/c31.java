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
public final class c31 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.e30, de0, qe.b {
    public l0 E;
    public v21 F;
    public org.telegram.ui.Components.u8 G;
    public org.telegram.ui.Components.k9 H;
    public FrameLayout I;
    public FrameLayout J;
    public ImageView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public boolean O;
    public View P;
    public View Q;
    public int R;
    public za.p S;
    public int T;
    public boolean U;
    public ValueAnimator V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final qe.a f44214a;
    public float f44215a0;
    public ai.h5 f44216b;
    public float f44217b0;
    public org.telegram.ui.Components.l41 f44218c;
    public final ArrayList f44219c0;
    public org.telegram.ui.ActionBar.f5 d;
    public int f44220d0;
    public org.telegram.ui.ActionBar.f5 f44221e;
    public int f44222e0;
    public u21 f44223f;
    public int f44224f0;
    public boolean f44225g0;
    public org.telegram.ui.Components.f30 h;
    public AnimatorSet f44226n;
    public org.telegram.ui.Cells.b4 f44227r;
    public TLRPC.FileLocation f44228s;
    public TLRPC.FileLocation f44229w;
    public FrameLayout f44230x;
    public FrameLayout f44231y;

    public c31() {
        this(null);
    }

    public static boolean Z(c31 c31Var, org.telegram.ui.Components.r31 r31Var, View view) {
        String str;
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ii.a3.n(c31Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new q21(c31Var, 2));
            return true;
        }
        if (r31Var.H(org.telegram.ui.Cells.s6.class)) {
            Object obj2 = r31Var.G;
            if (obj2 instanceof kw0) {
                str = ((kw0) obj2).h;
            } else if (obj2 instanceof org.telegram.messenger.to) {
                str = ((org.telegram.messenger.to) obj2).f25576c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(c31Var, view);
                H.c(2131232204, org.telegram.messenger.bd.M0(2131751762, null), new qv0(13, c31Var, str), false);
                H.W(c31Var.f44218c.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void a0(c31 c31Var) {
        boolean z10;
        TLRPC.User a22 = org.telegram.messenger.hp.s1(c31Var.currentAccount).a2(Long.valueOf(org.telegram.messenger.h10.i(c31Var.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.h10.i(c31Var.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.f30 f30Var = c31Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f30Var.n(z10, new q21(c31Var, 0), new gi.d1(6), 0);
    }

    public static void b0(c31 c31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.K1, c31Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(c31Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f24011b;
        if (tL_attachMenuBots != null) {
            long j10 = b02.f24008a;
            b02.getMessagesStorage().f24934a.c(new org.telegram.messenger.yj(b02.f24019e, 2, j10, b02, tL_attachMenuBots));
        }
    }

    public static void c0(c31 c31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.hp.s1(c31Var.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(c31Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new m21(1, c31Var, tL_attachMenuBot), 66);
    }

    public static void d0(c31 c31Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize x10;
        c31Var.f44224f0 = -1;
        if (tL_error == null) {
            TLRPC.User a22 = c31Var.getMessagesController().a2(Long.valueOf(c31Var.getUserConfig().e()));
            if (a22 == null) {
                a22 = c31Var.getUserConfig().f();
                if (a22 == null) {
                    return;
                }
                c31Var.getMessagesController().X3(a22, false, false);
            } else {
                c31Var.getUserConfig().w(a22);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x10 = null;
            } else {
                x10 = org.telegram.messenger.w7.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            a22.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f27025id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && c31Var.f44228s != null) {
                org.telegram.messenger.w7.G(c31Var.currentAccount);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                org.telegram.messenger.w7.G(c31Var.currentAccount);
                org.telegram.messenger.w7.K(c31Var.f44228s, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c31Var.f44228s.volume_id);
                sb2.append("_");
                String o10 = a1.g.o(c31Var.f44228s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.zb.D().S(o10, a1.g.o(w10.location.local_id, "@90_90", sb3), org.telegram.messenger.ac.m(c31Var.currentAccount, 1, a22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(c31Var.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.K(x10, "mp4", true, true));
            } else if (w11 != null && c31Var.f44229w != null) {
                org.telegram.messenger.w7.G(c31Var.currentAccount);
                File K2 = org.telegram.messenger.w7.K(w11, null, true, true);
                org.telegram.messenger.w7.G(c31Var.currentAccount);
                org.telegram.messenger.w7.K(c31Var.f44229w, null, true, true).renameTo(K2);
            }
            c31Var.getMessagesController().U0(a22.f27150id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            c31Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = c31Var.getMessagesController().b2(c31Var.getUserConfig().e());
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                c31Var.getMessagesStorage().j2(b22, false);
            }
            c31Var.m0(a22);
        }
        c31Var.f44228s = null;
        c31Var.f44229w = null;
        c31Var.n0(false, true);
        c31Var.getNotificationCenter().k(org.telegram.messenger.hs.f23292r, Integer.valueOf(org.telegram.messenger.hp.C8));
        c31Var.getNotificationCenter().k(org.telegram.messenger.hs.f23248j0, new Object[0]);
        c31Var.getUserConfig().v(true);
    }

    public static void e0(c31 c31Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            c31Var.f44228s = fileLocation;
            c31Var.f44229w = photoSize2.location;
            c31Var.H.j(org.telegram.messenger.ac.e(fileLocation), "90_90", c31Var.G, null);
            c31Var.n0(true, false);
        } else if (c31Var.f44228s == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i3 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i3 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            c31Var.f44224f0 = c31Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new m21(2, c31Var, str));
        }
        c31Var.simpleActionBar.o().requestLayout();
    }

    public static void f0(c31 c31Var, ArrayList arrayList) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i3;
        String str;
        int i10;
        String str2;
        int i11 = 0;
        if (c31Var.d.w()) {
            arrayList.add(org.telegram.ui.Components.r31.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            u21 u21Var = c31Var.f44223f;
            ArrayList arrayList2 = u21Var.d;
            ArrayList arrayList3 = u21Var.f47456w;
            if (u21Var.f47457x) {
                ArrayList arrayList4 = u21Var.f47454r;
                int size = arrayList4.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    int i14 = org.telegram.ui.Cells.s6.f30341b;
                    org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(org.telegram.ui.Cells.s6.class);
                    K.f37627l = (CharSequence) u21Var.f47453n.get(i12);
                    K.G = (kw0) obj;
                    arrayList.add(K);
                    i12++;
                }
                if (!u21Var.f47455s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(2131745492, null)));
                    ArrayList arrayList5 = u21Var.f47455s;
                    int size2 = arrayList5.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList5.get(i11);
                        i11++;
                        int i15 = org.telegram.ui.Cells.s6.f30341b;
                        org.telegram.ui.Components.r31 K2 = org.telegram.ui.Components.r31.K(org.telegram.ui.Cells.s6.class);
                        K2.f37627l = (CharSequence) u21Var.f47453n.get(i12);
                        K2.G = (org.telegram.messenger.to) obj2;
                        arrayList.add(K2);
                        i12++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(2131745479, null)));
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList3.get(i16);
                    i16++;
                    if (obj3 instanceof kw0) {
                        kw0 kw0Var = (kw0) obj3;
                        String str3 = kw0Var.f47037a;
                        int i17 = org.telegram.ui.Cells.s6.f30341b;
                        org.telegram.ui.Components.r31 K3 = org.telegram.ui.Components.r31.K(org.telegram.ui.Cells.s6.class);
                        K3.f37627l = str3;
                        K3.G = kw0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.to) {
                        org.telegram.messenger.to toVar = (org.telegram.messenger.to) obj3;
                        String str4 = toVar.f25574a;
                        int i18 = org.telegram.ui.Cells.s6.f30341b;
                        org.telegram.ui.Components.r31 K4 = org.telegram.ui.Components.r31.K(org.telegram.ui.Cells.s6.class);
                        K4.f37627l = str4;
                        K4.G = toVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(2131745492, null)));
                int size4 = arrayList2.size();
                while (i11 < size4) {
                    Object obj4 = arrayList2.get(i11);
                    i11++;
                    org.telegram.messenger.to toVar2 = (org.telegram.messenger.to) obj4;
                    String str5 = toVar2.f25574a;
                    int i19 = org.telegram.ui.Cells.s6.f30341b;
                    org.telegram.ui.Components.r31 K5 = org.telegram.ui.Components.r31.K(org.telegram.ui.Cells.s6.class);
                    K5.f37627l = str5;
                    K5.G = toVar2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.r31.n(c31Var.f44230x, 188));
        c31Var.f44219c0.clear();
        for (int i20 = 0; i20 < 4; i20++) {
            if (org.telegram.messenger.h10.i(i20).p() && c31Var.currentAccount != i20) {
                c31Var.f44219c0.add(Integer.valueOf(i20));
            }
        }
        Collections.sort(c31Var.f44219c0, new org.telegram.ui.Components.d80(20));
        Set set = c31Var.getMessagesController().T3;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(a31.i(org.telegram.messenger.bd.M0(2131749534, null), org.telegram.messenger.bd.M0(2131749535, null), null, null, org.telegram.messenger.bd.M0(2131749536, null), new r21(c31Var, 0)));
            arrayList.add(org.telegram.ui.Components.r31.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && c31Var.getUserConfig().f() != null) {
            arrayList.add(a31.i(org.telegram.messenger.bd.a0(null, null, 2131752156, org.telegram.messenger.k5.i(new StringBuilder("+"), c31Var.getUserConfig().f().phone, mf.b.c())), org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752155, null), new q21(c31Var, 1)), org.telegram.messenger.bd.M0(2131752153, null), new r21(c31Var, 1), ci.l6.g2(org.telegram.messenger.bd.M0(2131752151, null)), new r21(c31Var, 2)));
            arrayList.add(org.telegram.ui.Components.r31.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(a31.i(org.telegram.messenger.bd.M0(2131742813, null), org.telegram.messenger.bd.M0(2131742812, null), org.telegram.messenger.bd.M0(2131742811, null), new r21(c31Var, 3), org.telegram.messenger.bd.M0(2131742810, null), new r21(c31Var, 4)));
            arrayList.add(org.telegram.ui.Components.r31.C(null));
        }
        if (c31Var.f44219c0.size() > 0) {
            arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131745502, null)));
            for (int i21 = 0; i21 < c31Var.f44219c0.size(); i21++) {
                int intValue = ((Integer) c31Var.f44219c0.get(i21)).intValue();
                int i22 = w21.f50682b;
                org.telegram.ui.Components.r31 K6 = org.telegram.ui.Components.r31.K(w21.class);
                K6.d = i21;
                K6.f37640z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.r31.C(null));
        }
        if (c31Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && ((org.telegram.messenger.h0) c31Var.getMessagesController().f23167x7.f24662j0.f13688b).f22814c) {
            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(c31Var.currentAccount);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                i10 = 2131232718;
            } else {
                i10 = 2131232717;
            }
            CharSequence M0 = org.telegram.messenger.bd.M0(2131743204, null);
            int i23 = org.telegram.ui.Cells.l8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).getCurrentTime() - 1790679020 <= 2419200) {
                M0 = org.telegram.ui.Cells.l8.b(M0);
            }
            CharSequence charSequence = M0;
            if (x10.v() > 0) {
                str2 = org.telegram.ui.Wallet.k0.o(x10.v(), false);
            } else {
                str2 = null;
            }
            arrayList.add(y21.i(25, 0, 0, i10, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.r31.C(null));
        }
        arrayList.add(y21.i(1, -14899731, -15431455, 2131232694, org.telegram.messenger.bd.M0(2131745504, null), org.telegram.messenger.bd.M0(2131745503, null), null));
        arrayList.add(y21.i(2, -1007845, -1996271, 2131232700, org.telegram.messenger.bd.M0(2131745500, null), org.telegram.messenger.bd.M0(2131745499, null), null));
        arrayList.add(y21.i(3, -11154873, -14175180, 2131232714, org.telegram.messenger.bd.M0(2131745481, null), org.telegram.messenger.bd.M0(2131745480, null), null));
        arrayList.add(y21.i(5, -765355, -2148011, 2131232715, org.telegram.messenger.bd.M0(2131745485, null), org.telegram.messenger.bd.M0(2131745484, null), null));
        arrayList.add(y21.i(6, -11565578, -13276952, 2131232701, org.telegram.messenger.bd.M0(2131745498, null), org.telegram.messenger.bd.M0(2131745497, null), null));
        arrayList.add(y21.i(7, -14899731, -15497247, 2131232705, org.telegram.messenger.bd.M0(2131745491, null), org.telegram.messenger.bd.M0(2131745490, null), null));
        arrayList.add(y21.i(8, -13451058, -14836538, 2131232702, org.telegram.messenger.bd.M0(2131745495, null), org.telegram.messenger.bd.M0(2131745494, null), null));
        arrayList.add(y21.i(9, -881871, -1940716, 2131232712, org.telegram.messenger.bd.M0(2131745483, null), org.telegram.messenger.bd.M0(2131745482, null), null));
        arrayList.add(y21.i(10, -3903756, -6335009, 2131232710, org.telegram.messenger.bd.M0(2131745488, null), org.telegram.messenger.bd.j0(), null));
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        if (!z10 && ((org.telegram.messenger.h0) c31Var.getMessagesController().f23167x7.f24662j0.f13688b).f22814c) {
            org.telegram.ui.Wallet.k0 x11 = org.telegram.ui.Wallet.k0.x(c31Var.currentAccount);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                i3 = 2131232718;
            } else {
                i3 = 2131232717;
            }
            CharSequence M02 = org.telegram.messenger.bd.M0(2131743204, null);
            int i24 = org.telegram.ui.Cells.l8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).getCurrentTime() - 1790679020 <= 2419200) {
                M02 = org.telegram.ui.Cells.l8.b(M02);
            }
            CharSequence charSequence2 = M02;
            if (x11.v() > 0) {
                str = org.telegram.ui.Wallet.k0.o(x11.v(), false);
            } else {
                str = null;
            }
            arrayList.add(y21.i(25, 0, 0, i3, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.r31.C(null));
        }
        if (!c31Var.getMessagesController().D3()) {
            arrayList.add(y21.i(11, -4826625, -10388225, 2131232713, org.telegram.messenger.bd.M0(2131744241, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!c31Var.getMessagesController().f23042j7) {
            ci.e9 y9 = ci.e9.y(c31Var.currentAccount, false);
            long j10 = y9.p().amount;
            String M03 = org.telegram.messenger.bd.M0(2131744225, null);
            if (!y9.f5032e || j10 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = ci.wb.M0(y9.p(), 0.85f, ' ');
            }
            arrayList.add(y21.i(12, -1071598, -1608430, 2131232716, M03, null, spannableStringBuilder));
        }
        ci.e9.y(c31Var.currentAccount, true).p();
        org.telegram.messenger.t0.n();
        ci.e9 y10 = ci.e9.y(c31Var.currentAccount, true);
        long j11 = y10.p().amount;
        String M04 = org.telegram.messenger.bd.M0(2131749523, null);
        if (y10.f5032e && j11 > 0) {
            charSequence3 = ci.wb.M0(y10.p(), 0.85f, ' ');
        }
        arrayList.add(y21.i(13, -14965523, -15431455, 2131231125, M04, null, charSequence3));
        if (!c31Var.getMessagesController().D3()) {
            arrayList.add(y21.i(15, -765355, -2148011, 2131232697, org.telegram.messenger.bd.M0(2131744262, null), null, null));
        }
        if (!c31Var.getMessagesController().h7) {
            arrayList.add(y21.i(16, -816335, -1940716, 2131232706, org.telegram.messenger.bd.M0(2131745649, null), null, null));
        }
        if (((org.telegram.ui.Components.r31) k2.p1.h(1, arrayList)).f54715a != 7) {
            arrayList.add(org.telegram.ui.Components.r31.C(null));
        }
        arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131745489, null)));
        arrayList.add(y21.i(17, -1007845, -1996271, 2131232696, org.telegram.messenger.bd.M0(2131753986, null), null, null));
        arrayList.add(y21.i(18, -14965523, -15431455, 2131232703, org.telegram.messenger.bd.M0(2131744252, null), null, null));
        arrayList.add(y21.i(23, -3903756, -6335009, 2131232704, org.telegram.messenger.bd.M0(2131744249, null), null, null));
        arrayList.add(y21.i(19, -11154873, -14175180, 2131232711, org.telegram.messenger.bd.M0(2131746791, null), null, null));
        xi.a aVar = xi.e.f58877a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.r31.C(null));
            arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131745493, null)));
            arrayList.add(y21.i(24, -765355, -2148011, 0, org.telegram.messenger.bd.M0(2131745995, null), null, null));
            arrayList.add(y21.i(26, -11154873, -14175180, 0, org.telegram.messenger.bd.M0(2131753919, null), null, null));
            arrayList.add(y21.i(27, -12743701, -13996071, 0, org.telegram.messenger.bd.M0(2131749338, null), null, null));
        }
        if (org.telegram.messenger.r2.f25040a) {
            arrayList.add(org.telegram.ui.Components.r31.C(null));
            arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131745496, null)));
            arrayList.add(y21.i(20, -11154873, -14175180, 0, org.telegram.messenger.bd.M0(2131751614, null), null, null));
            arrayList.add(y21.i(21, -11154873, -14175180, 0, org.telegram.messenger.bd.M0(2131751615, null), null, null));
            arrayList.add(y21.i(22, -765355, -2148011, 0, org.telegram.messenger.bd.M0(2131751651, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.r31.m(c31Var.N));
    }

    public static void h0(c31 c31Var, org.telegram.ui.Components.r31 r31Var) {
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.G0(LaunchActivity.K1, c31Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                rc1.a(c31Var.getParentActivity(), new org.telegram.ui.Components.ei(28, c31Var, tL_attachMenuBot), null);
            }
        } else if (r31Var.H(w21.class)) {
            int i3 = r31Var.f37640z;
            LaunchActivity launchActivity = LaunchActivity.K1;
            if (launchActivity != null) {
                launchActivity.O0(i3);
            }
        } else if (r31Var.H(org.telegram.ui.Cells.s6.class)) {
            Object obj2 = r31Var.G;
            if (obj2 instanceof kw0) {
                kw0 kw0Var = (kw0) obj2;
                org.telegram.ui.ActionBar.q4 parentLayout = c31Var.getParentLayout();
                kw0Var.f47038b.run();
                org.telegram.messenger.g0.k3(parentLayout, kw0Var.f47039c);
            } else if (obj2 instanceof org.telegram.messenger.to) {
                org.telegram.messenger.hs.f(c31Var.currentAccount).k(org.telegram.messenger.hs.f23209c1, c31Var.f44223f.F, ((org.telegram.messenger.to) obj2).f25576c);
            }
            Object obj3 = r31Var.G;
            if (obj3 != null) {
                c31Var.f44223f.E(obj3);
            }
        } else {
            switch (r31Var.d) {
                case 1:
                    c31Var.k0(new UserInfoActivity());
                    return;
                case 2:
                    c31Var.k0(new ThemeActivity(0));
                    return;
                case 3:
                    c31Var.k0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    c31Var.k0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    c31Var.k0(new DataSettingsActivity());
                    return;
                case 7:
                    c31Var.k0(new FiltersSetupActivity());
                    return;
                case 8:
                    c31Var.k0(new SessionsActivity(0));
                    return;
                case 9:
                    c31Var.k0(new t90());
                    return;
                case 10:
                    c31Var.k0(new LanguageSelectActivity());
                    return;
                case 11:
                    c31Var.k0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    c31Var.k0(new ci.wb());
                    return;
                case 13:
                    c31Var.k0(new hi.g());
                    return;
                case 15:
                    c31Var.k0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    xg.e1.l1(0, org.telegram.messenger.v1.a(org.telegram.messenger.h10.f22829t0).b());
                    return;
                case 17:
                    c31Var.showDialog(org.telegram.ui.Components.t4.T(c31Var, c31Var.resourceProvider));
                    return;
                case 18:
                    sf.c.t(c31Var.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                    return;
                case 19:
                    sf.c.t(c31Var.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                    return;
                case 20:
                    ProfileActivity.V4(c31Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.V4(c31Var.getParentActivity(), true);
                    return;
                case 22:
                    org.telegram.messenger.a8.a();
                    return;
                case 23:
                    if (org.telegram.messenger.hp.s1(c31Var.currentAccount).v2()) {
                        b.b(c31Var.currentAccount);
                        return;
                    } else {
                        sf.c.t(c31Var.getParentActivity(), org.telegram.messenger.bd.M0(2131744248, null));
                        return;
                    }
                case 24:
                    c31Var.presentFragment(new ny0(0, null));
                    return;
                case 25:
                    c31Var.k0(new org.telegram.ui.Wallet.w5());
                    return;
                case 26:
                    c31Var.presentFragment(new ny0(1, null));
                    return;
                case 27:
                    ?? h41Var = new org.telegram.ui.Components.h41();
                    h41Var.f45819e = true;
                    c31Var.presentFragment((org.telegram.ui.ActionBar.d2) h41Var);
                    return;
            }
        }
    }

    public static pi.q i0(c31 c31Var) {
        return c31Var.glassEngine;
    }

    @Override
    public final si.f B() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().f53625a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.f44227r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.b4 b4Var = this.f44227r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            j0();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f44216b = new ai.h5(10, context, this);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.f44225g0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745505, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 12));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.e5 o10 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.f5 b10 = o10.b(0, 2131232486);
        b10.N();
        b10.C0 = new lg.w1(this, 21);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        org.telegram.ui.ActionBar.f5 b11 = o10.b(1, 2131231244);
        this.f44221e = b11;
        b11.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        this.f44221e.e(2, 2131232195, org.telegram.messenger.bd.M0(2131748751, null));
        u21 u21Var = new u21(this, this, context);
        this.f44223f = u21Var;
        u21Var.G();
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(this, new c5(this, 26), new s21(this), new s21(this));
        this.f44218c = l41Var;
        l41Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.l41 l41Var2 = this.f44218c;
        l41Var2.f35594g3.f33698r = false;
        l41Var2.r1();
        this.f44218c.setSectionsDrawBackground(true);
        pi.a.e(this.f44218c, 0, 0, org.telegram.messenger.g0.L(12.0f), this.f44222e0);
        this.f44218c.setClipToPadding(false);
        this.f44218c.j(new r11(this, 1));
        this.f44216b.addView(this.f44218c, b8.mf.e(-1, -1, 119));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.f44216b.addView(this.Q, b8.mf.e(-1, 0, 48));
        this.f44216b.addView(this.simpleActionBar, b8.mf.e(-1, -2, 55));
        org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, true, true);
        this.h = f30Var;
        f30Var.I = true;
        f30Var.f33681a = this;
        f30Var.f33682b = this;
        this.f44230x = new FrameLayout(context);
        l0 l0Var = new l0(25, context, this);
        this.E = l0Var;
        this.f44230x.addView(l0Var, b8.mf.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new r21(this, 5));
        b8.pf.a(this.E);
        this.f44230x.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view2, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                c31.this.p0();
            }
        });
        this.F = new org.telegram.ui.Components.zf0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44231y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.f44231y.setPivotY(0.0f);
        this.F.addView(this.f44231y, b8.mf.e(90, 90, 51));
        ai.h5 h5Var = this.f44216b;
        h5Var.addView(this.F, h5Var.indexOfChild(this.f44218c) + 1, b8.mf.c(-1.0f, -1));
        this.G = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.H = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(90.0f));
        this.f44231y.addView(this.H, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Cells.b4 b4Var = new org.telegram.ui.Cells.b4(this, context);
        this.f44227r = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.f44227r.setProgressColor(-1);
        this.f44227r.setNoProgress(false);
        this.f44231y.addView(this.f44227r, b8.mf.c(-1.0f, -1));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = org.telegram.messenger.g0.L(32.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f27824a7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, getThemedColor(i3));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, resourceProvider);
        this.I.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.J = frameLayout3;
        int L3 = org.telegram.messenger.g0.L(30.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L4 = org.telegram.ui.ActionBar.k6.L(L3, getThemedColor(i10));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(L4);
        org.telegram.ui.ActionBar.r6.k(frameLayout3, L4, N2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.K.setImageResource(2131231146);
        this.J.addView(this.K, b8.mf.e(22, 22, 17));
        this.I.addView(this.J, b8.mf.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        ai.h5 h5Var2 = this.f44216b;
        h5Var2.addView(this.I, h5Var2.indexOfChild(this.F) + 1, b8.mf.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(org.telegram.messenger.g0.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView m10 = org.telegram.ui.Cells.f1.m(this.f44230x, this.L, b8.mf.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = m10;
        m10.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView m11 = org.telegram.ui.Cells.f1.m(this.f44230x, this.M, b8.mf.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = m11;
        m11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(this.N, org.telegram.ui.ActionBar.k6.B6, getResourceProvider());
        this.N.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i11), 2, -1), null, org.telegram.ui.ActionBar.r6.N(i11), getResourceProvider());
        this.N.setOnClickListener(new r21(this, 6));
        this.P = new View(context);
        o0(true, false);
        this.f44218c.f35594g3.O(false);
        m0(getUserConfig().f());
        q0();
        j0();
        this.simpleActionBar.setBackground(null);
        int i12 = this.mSystemInsets.f14496b;
        if (this.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
            ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.Q.setLayoutParams(layoutParams);
            }
        }
        o0(true, false);
        ai.h5 h5Var3 = this.f44216b;
        s21 s21Var = new s21(this);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(h5Var3, s21Var);
        ai.h5 h5Var4 = this.f44216b;
        this.fragmentView = h5Var4;
        return h5Var4;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Components.l41 l41Var;
        if (i3 == org.telegram.messenger.hs.f23343y3) {
            m0(getUserConfig().f());
            org.telegram.ui.Components.l41 l41Var2 = this.f44218c;
            if (l41Var2 != null) {
                l41Var2.f35594g3.O(true);
            }
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            m0(getUserConfig().f());
        } else if (i3 == org.telegram.messenger.hs.f23300s1 && (l41Var = this.f44218c) != null) {
            l41Var.f35594g3.O(true);
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
    public final mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f44218c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f44214a.f53841f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.y4 y4Var;
        boolean z10;
        int i3;
        int i10;
        if (this.O && (z10 = (y4Var = this.simpleActionBar).G) != this.f44225g0) {
            this.f44225g0 = z10;
            if (z10) {
                i3 = 2131231240;
            } else {
                i3 = 2131232485;
            }
            y4Var.setBackButtonImageAnimated(i3);
            org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
            if (z10) {
                i10 = 2131754878;
            } else {
                i10 = 2131746508;
            }
            y4Var2.setBackButtonContentDescription(org.telegram.messenger.bd.M0(i10, null));
        }
    }

    @Override
    public final si.f k() {
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (pi.q.f().f53625a) {
            return baseSimpleGlass.f53529i;
        }
        return null;
    }

    public final void k0(org.telegram.ui.ActionBar.d2 d2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (launchActivity = LaunchActivity.K1) != null && (actionBarLayout = launchActivity.f41318t0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.d0((org.telegram.ui.ActionBar.d2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.o4 o4Var = new org.telegram.ui.ActionBar.o4(d2Var);
            o4Var.f28397c = true;
            o4Var.f28400g = true;
            actionBarLayout.U(o4Var);
            return;
        }
        presentFragment(d2Var);
    }

    public final void l0(float f10) {
        this.simpleActionBar.setTitlesAlpha(f10);
        View view = this.Q;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    public final void m0(TLRPC.User user) {
        String str;
        if (this.H == null || this.f44224f0 != -1) {
            return;
        }
        this.G.r(user);
        this.H.e(user, this.G);
        this.L.setText(org.telegram.messenger.l10.p(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(mf.b.c().b("+" + user.phone));
        }
        String n4 = org.telegram.messenger.l10.n(user);
        if (n4 != null) {
            sb2.append(" • @");
            sb2.append(n4);
        }
        this.M.setText(sb2);
        TextView textView = this.N;
        String str2 = null;
        try {
            PackageInfo packageInfo = org.telegram.messenger.t0.f25457b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25457b.getPackageName(), 0);
            int i3 = packageInfo.versionCode;
            int i10 = i3 / 10;
            int i11 = i3 % 10;
            if (i11 != 1 && i11 != 2) {
                org.telegram.messenger.t0.u();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            str2 = org.telegram.messenger.bd.a0(null, null, 2131744220, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        textView.setText(str2);
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.f44227r == null) {
            return;
        }
        AnimatorSet animatorSet = this.f44226n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f44226n = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f44226n = animatorSet2;
            if (z10) {
                this.f44227r.setVisibility(0);
                this.f44226n.playTogether(ObjectAnimator.ofFloat(this.f44227r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f44227r, View.ALPHA, 0.0f));
            }
            this.f44226n.setDuration(180L);
            this.f44226n.addListener(new u40(9, this, z10));
            this.f44226n.start();
        } else if (z10) {
            this.f44227r.setAlpha(1.0f);
            this.f44227r.setVisibility(0);
        } else {
            this.f44227r.setAlpha(0.0f);
            this.f44227r.setVisibility(4);
        }
    }

    public final void o0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c31.o0(boolean, boolean):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var.G) {
            if (z10) {
                y4Var.j(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        za.p pVar = this.S;
        if (pVar != null) {
            pVar.a();
            this.S = null;
        }
        za.p pVar2 = new za.p(org.telegram.messenger.hs.e(), this);
        pVar2.b(org.telegram.messenger.hs.f23292r);
        pVar2.b(org.telegram.messenger.hs.f23343y3);
        pVar2.b(org.telegram.messenger.hs.f23300s1);
        this.S = pVar2;
        Bundle bundle = this.arguments;
        int i3 = 0;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.O) {
            i3 = org.telegram.messenger.g0.L(72.0f);
        }
        this.f44222e0 = i3;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        za.p pVar = this.S;
        if (pVar != null) {
            pVar.a();
            this.S = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.f41 f41Var = this.f44218c.f35594g3;
        if (f41Var != null) {
            f41Var.O(false);
        }
    }

    public final void p0() {
        if (this.F != null && this.f44231y != null) {
            float height = this.E.getHeight() / 2.0f;
            View view = this.E;
            float f10 = 1.0f;
            while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
                height += view.getY();
                f10 *= view.getAlpha();
                view = (View) view.getParent();
            }
            if (view == this.fragmentView && this.E.isAttachedToWindow() && this.E.getHeight() != 0) {
                float f11 = 0.0f;
                for (View view2 = this.f44230x; view2 != null && view2 != this.f44218c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    f11 += view2.getY();
                }
                float paddingTop = (height - f11) + this.f44218c.getPaddingTop();
                v21 v21Var = this.F;
                float f12 = -org.telegram.messenger.g0.L(16.0f);
                org.telegram.messenger.tr trVar = v21Var.f41039n;
                if (trVar != null && trVar.f25585c) {
                    f12 = trVar.f25586e.centerY();
                }
                float a10 = b8.be.a((height - f12) / Math.max(1.0f, paddingTop - f12), 0.0f, 1.0f);
                float max = Math.max(height, f12);
                this.Z = height;
                this.f44215a0 = paddingTop;
                this.f44217b0 = f12;
                float L = org.telegram.messenger.g0.L(90.0f);
                float scaleX = this.E.getScaleX() * (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(this.F.getHiddenAvatarSizeDp()), L, a10) / L);
                float f13 = (L * scaleX) / 2.0f;
                float width = (this.F.getWidth() / 2.0f) - f13;
                if (max != this.W || scaleX != this.X || a10 != this.Y || f10 != this.F.getAlpha() || width != this.f44231y.getTranslationX()) {
                    this.W = max;
                    this.X = scaleX;
                    this.Y = a10;
                    this.F.setAlpha(f10);
                    this.f44231y.setScaleX(scaleX);
                    this.f44231y.setScaleY(scaleX);
                    this.f44231y.setTranslationX(width);
                    float f14 = max - f13;
                    this.f44231y.setTranslationY(f14);
                    this.I.setAlpha(b8.be.a(org.telegram.messenger.g0.z1(a10, 0.75f, 1.0f), 0.0f, 1.0f) * f10);
                    this.I.setScaleX(scaleX);
                    this.I.setScaleY(scaleX);
                    this.I.setTranslationX((org.telegram.messenger.g0.L(60.0f) * scaleX) + width);
                    this.I.setTranslationY((org.telegram.messenger.g0.L(60.0f) * scaleX) + f14);
                    this.F.setHideProgress(1.0f - a10);
                }
            } else if (this.Y != 0.0f) {
                this.Y = 0.0f;
                this.F.setHideProgress(1.0f);
                this.I.setAlpha(0.0f);
            }
        }
    }

    public final void q0() {
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        this.M.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28273y6));
        this.d.V();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor}));
        }
        this.f44218c.invalidate();
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
    public final void v() {
        this.f44218c.y0(0);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public c31(Bundle bundle) {
        super(bundle);
        this.f44214a = new qe.a(0, this, org.telegram.ui.Components.xq.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.f44219c0 = new ArrayList();
        this.f44224f0 = -1;
        this.f44225g0 = true;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
