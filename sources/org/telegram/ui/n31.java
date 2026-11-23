package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.RectF;
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
public final class n31 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, org.telegram.ui.Components.t30, ke0, te.b {
    public k0 E;
    public g31 F;
    public org.telegram.ui.Components.a9 G;
    public org.telegram.ui.Components.p9 H;
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
    public xi.e S;
    public int T;
    public boolean U;
    public ValueAnimator V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final te.a f50188a;
    public float f50189a0;
    public w8 f50190b;
    public float f50191b0;
    public org.telegram.ui.Components.g51 f50192c;
    public final ArrayList f50193c0;
    public org.telegram.ui.ActionBar.g5 d;
    public int f50194d0;
    public org.telegram.ui.ActionBar.g5 f50195e;
    public int f50196e0;
    public f31 f50197f;
    public int f50198f0;
    public boolean f50199g0;
    public org.telegram.ui.Components.u30 h;
    public AnimatorSet f50200n;
    public org.telegram.ui.Cells.c4 f50201r;
    public TLRPC.FileLocation f50202s;
    public TLRPC.FileLocation f50203w;
    public FrameLayout f50204x;
    public FrameLayout f50205y;

    public n31() {
        this(null);
    }

    public static boolean Z(n31 n31Var, org.telegram.ui.Components.n41 n41Var, View view) {
        String str;
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ki.t2.n(n31Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new b31(n31Var, 2));
            return true;
        }
        if (n41Var.H(org.telegram.ui.Cells.t6.class)) {
            Object obj2 = n41Var.H;
            if (obj2 instanceof tw0) {
                str = ((tw0) obj2).h;
            } else if (obj2 instanceof org.telegram.messenger.yo) {
                str = ((org.telegram.messenger.yo) obj2).f28271c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(n31Var, view);
                I.c(2131232209, org.telegram.messenger.gd.N0(2131751750, null), new iy0(6, n31Var, str), false);
                I.X(n31Var.f50192c.U0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    public static void a0(n31 n31Var) {
        boolean z10;
        TLRPC.User c22 = org.telegram.messenger.mp.u1(n31Var.currentAccount).c2(Long.valueOf(org.telegram.messenger.i10.i(n31Var.currentAccount).e()));
        if (c22 == null) {
            c22 = org.telegram.messenger.i10.i(n31Var.currentAccount).f();
        }
        if (c22 == null) {
            return;
        }
        org.telegram.ui.Components.u30 u30Var = n31Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        u30Var.n(z10, new b31(n31Var, 0), new hi.n1(6), 0);
    }

    public static void b0(n31 n31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, n31Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(n31Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.f26700b;
        if (tL_attachMenuBots != null) {
            long j3 = d02.f26697a;
            d02.getMessagesStorage().f27149a.c(new org.telegram.messenger.ek(d02.f26708e, 2, j3, d02, tL_attachMenuBots));
        }
    }

    public static void c0(n31 n31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(n31Var.currentAccount).q1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(n31Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new d31(0, n31Var, tL_attachMenuBot), 66);
    }

    public static void d0(n31 n31Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize x10;
        n31Var.f50198f0 = -1;
        if (tL_error == null) {
            TLRPC.User c22 = n31Var.getMessagesController().c2(Long.valueOf(n31Var.getUserConfig().e()));
            if (c22 == null) {
                c22 = n31Var.getUserConfig().f();
                if (c22 == null) {
                    return;
                }
                n31Var.getMessagesController().e4(c22, false, false);
            } else {
                n31Var.getUserConfig().w(c22);
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
            c22.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28516id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && n31Var.f50202s != null) {
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                org.telegram.messenger.w7.J(n31Var.f50202s, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(n31Var.f50202s.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(n31Var.f50202s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.ec.D().S(n10, a8.p0.n(w10.location.local_id, "@90_90", sb3), org.telegram.messenger.fc.m(n31Var.currentAccount, 1, c22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && n31Var.f50203w != null) {
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(n31Var.currentAccount);
                org.telegram.messenger.w7.J(n31Var.f50203w, null, true, true).renameTo(J2);
            }
            n31Var.getMessagesController().W0(c22.f28641id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c22);
            n31Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull d2 = n31Var.getMessagesController().d2(n31Var.getUserConfig().e());
            if (d2 != null) {
                d2.profile_photo = tL_photos_photo.photo;
                n31Var.getMessagesStorage().j2(d2, false);
            }
            n31Var.m0(c22);
        }
        n31Var.f50202s = null;
        n31Var.f50203w = null;
        n31Var.n0(false, true);
        n31Var.getNotificationCenter().k(org.telegram.messenger.ks.f25276r, Integer.valueOf(org.telegram.messenger.mp.I8));
        n31Var.getNotificationCenter().k(org.telegram.messenger.ks.f25233j0, new Object[0]);
        n31Var.getUserConfig().v(true);
    }

    public static void e0(n31 n31Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            n31Var.f50202s = fileLocation;
            n31Var.f50203w = photoSize2.location;
            n31Var.H.j(org.telegram.messenger.fc.e(fileLocation), "90_90", n31Var.G, null);
            n31Var.n0(true, false);
        } else if (n31Var.f50202s == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i7 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i7 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            n31Var.f50198f0 = n31Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new d31(1, n31Var, str));
        }
        n31Var.simpleActionBar.t().requestLayout();
    }

    public static void f0(n31 n31Var, ArrayList arrayList) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i7;
        String str;
        int i10;
        String str2;
        int i11 = 0;
        if (n31Var.d.x()) {
            arrayList.add(org.telegram.ui.Components.n41.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            f31 f31Var = n31Var.f50197f;
            ArrayList arrayList2 = f31Var.d;
            ArrayList arrayList3 = f31Var.f52748w;
            if (f31Var.f52749x) {
                ArrayList arrayList4 = f31Var.f52746r;
                int size = arrayList4.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    int i14 = org.telegram.ui.Cells.t6.f31928b;
                    org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                    K.f37655m = (CharSequence) f31Var.f52745n.get(i12);
                    K.H = (tw0) obj;
                    arrayList.add(K);
                    i12++;
                }
                if (!f31Var.f52747s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(2131745286, null)));
                    ArrayList arrayList5 = f31Var.f52747s;
                    int size2 = arrayList5.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList5.get(i11);
                        i11++;
                        int i15 = org.telegram.ui.Cells.t6.f31928b;
                        org.telegram.ui.Components.n41 K2 = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                        K2.f37655m = (CharSequence) f31Var.f52745n.get(i12);
                        K2.H = (org.telegram.messenger.yo) obj2;
                        arrayList.add(K2);
                        i12++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(2131745273, null)));
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList3.get(i16);
                    i16++;
                    if (obj3 instanceof tw0) {
                        tw0 tw0Var = (tw0) obj3;
                        String str3 = tw0Var.f52489a;
                        int i17 = org.telegram.ui.Cells.t6.f31928b;
                        org.telegram.ui.Components.n41 K3 = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                        K3.f37655m = str3;
                        K3.H = tw0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.yo) {
                        org.telegram.messenger.yo yoVar = (org.telegram.messenger.yo) obj3;
                        String str4 = yoVar.f28269a;
                        int i18 = org.telegram.ui.Cells.t6.f31928b;
                        org.telegram.ui.Components.n41 K4 = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                        K4.f37655m = str4;
                        K4.H = yoVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(2131745286, null)));
                int size4 = arrayList2.size();
                while (i11 < size4) {
                    Object obj4 = arrayList2.get(i11);
                    i11++;
                    org.telegram.messenger.yo yoVar2 = (org.telegram.messenger.yo) obj4;
                    String str5 = yoVar2.f28269a;
                    int i19 = org.telegram.ui.Cells.t6.f31928b;
                    org.telegram.ui.Components.n41 K5 = org.telegram.ui.Components.n41.K(org.telegram.ui.Cells.t6.class);
                    K5.f37655m = str5;
                    K5.H = yoVar2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.n41.n(n31Var.f50204x, 188));
        n31Var.f50193c0.clear();
        for (int i20 = 0; i20 < 4; i20++) {
            if (org.telegram.messenger.i10.i(i20).p() && n31Var.currentAccount != i20) {
                n31Var.f50193c0.add(Integer.valueOf(i20));
            }
        }
        Collections.sort(n31Var.f50193c0, new ow0(1));
        Set set = n31Var.getMessagesController().V3;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(l31.i(org.telegram.messenger.gd.N0(2131749350, null), org.telegram.messenger.gd.N0(2131749351, null), null, null, org.telegram.messenger.gd.N0(2131749352, null), new c31(n31Var, 0)));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && n31Var.getUserConfig().f() != null) {
            arrayList.add(l31.i(org.telegram.messenger.gd.a0(null, null, 2131752144, org.telegram.messenger.m10.h(new StringBuilder("+"), n31Var.getUserConfig().f().phone, pf.b.c())), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752143, null), new b31(n31Var, 1)), org.telegram.messenger.gd.N0(2131752141, null), new c31(n31Var, 1), di.f6.t2(org.telegram.messenger.gd.N0(2131752139, null)), new c31(n31Var, 2)));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(l31.i(org.telegram.messenger.gd.N0(2131742532, null), org.telegram.messenger.gd.N0(2131742531, null), org.telegram.messenger.gd.N0(2131742530, null), new c31(n31Var, 3), org.telegram.messenger.gd.N0(2131742529, null), new c31(n31Var, 4)));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        if (n31Var.f50193c0.size() > 0) {
            i5.c.s(2131745296, null, arrayList);
            for (int i21 = 0; i21 < n31Var.f50193c0.size(); i21++) {
                int intValue = ((Integer) n31Var.f50193c0.get(i21)).intValue();
                int i22 = h31.f48420b;
                org.telegram.ui.Components.n41 K6 = org.telegram.ui.Components.n41.K(h31.class);
                K6.d = i21;
                K6.A = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        if (n31Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && ((org.telegram.messenger.h0) n31Var.getMessagesController().A7.f26254p0.f17372b).f24439c) {
            org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(n31Var.currentAccount);
            if (org.telegram.ui.ActionBar.n6.I.q()) {
                i10 = 2131232725;
            } else {
                i10 = 2131232724;
            }
            CharSequence N0 = org.telegram.messenger.gd.N0(2131742943, null);
            int i23 = org.telegram.ui.Cells.m8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0).getCurrentTime() - 1790679020 <= 2419200) {
                N0 = org.telegram.ui.Cells.m8.b(N0);
            }
            CharSequence charSequence = N0;
            if (D.A() > 0) {
                str2 = org.telegram.ui.Wallet.v0.t(D.A(), false);
            } else {
                str2 = null;
            }
            arrayList.add(j31.i(25, 0, 0, i10, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        arrayList.add(j31.i(1, -14899731, -15431455, 2131232701, org.telegram.messenger.gd.N0(2131745298, null), org.telegram.messenger.gd.N0(2131745297, null), null));
        arrayList.add(j31.i(2, -1007845, -1996271, 2131232707, org.telegram.messenger.gd.N0(2131745294, null), org.telegram.messenger.gd.N0(2131745293, null), null));
        arrayList.add(j31.i(3, -11154873, -14175180, 2131232721, org.telegram.messenger.gd.N0(2131745275, null), org.telegram.messenger.gd.N0(2131745274, null), null));
        arrayList.add(j31.i(5, -765355, -2148011, 2131232722, org.telegram.messenger.gd.N0(2131745279, null), org.telegram.messenger.gd.N0(2131745278, null), null));
        arrayList.add(j31.i(6, -11565578, -13276952, 2131232708, org.telegram.messenger.gd.N0(2131745292, null), org.telegram.messenger.gd.N0(2131745291, null), null));
        arrayList.add(j31.i(7, -14899731, -15497247, 2131232712, org.telegram.messenger.gd.N0(2131745285, null), org.telegram.messenger.gd.N0(2131745284, null), null));
        arrayList.add(j31.i(8, -13451058, -14836538, 2131232709, org.telegram.messenger.gd.N0(2131745289, null), org.telegram.messenger.gd.N0(2131745288, null), null));
        arrayList.add(j31.i(9, -881871, -1940716, 2131232719, org.telegram.messenger.gd.N0(2131745277, null), org.telegram.messenger.gd.N0(2131745276, null), null));
        arrayList.add(j31.i(10, -3903756, -6335009, 2131232717, org.telegram.messenger.gd.N0(2131745282, null), org.telegram.messenger.gd.j0(), null));
        arrayList.add(org.telegram.ui.Components.n41.C(null));
        if (!z10 && ((org.telegram.messenger.h0) n31Var.getMessagesController().A7.f26254p0.f17372b).f24439c) {
            org.telegram.ui.Wallet.v0 D2 = org.telegram.ui.Wallet.v0.D(n31Var.currentAccount);
            if (org.telegram.ui.ActionBar.n6.I.q()) {
                i7 = 2131232725;
            } else {
                i7 = 2131232724;
            }
            CharSequence N02 = org.telegram.messenger.gd.N0(2131742943, null);
            int i24 = org.telegram.ui.Cells.m8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0).getCurrentTime() - 1790679020 <= 2419200) {
                N02 = org.telegram.ui.Cells.m8.b(N02);
            }
            CharSequence charSequence2 = N02;
            if (D2.A() > 0) {
                str = org.telegram.ui.Wallet.v0.t(D2.A(), false);
            } else {
                str = null;
            }
            arrayList.add(j31.i(25, 0, 0, i7, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        if (!n31Var.getMessagesController().K3()) {
            arrayList.add(j31.i(11, -4826625, -10388225, 2131232720, org.telegram.messenger.gd.N0(2131743986, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!n31Var.getMessagesController().f25802m7) {
            di.y8 y10 = di.y8.y(n31Var.currentAccount, false);
            long j3 = y10.p().amount;
            String N03 = org.telegram.messenger.gd.N0(2131743970, null);
            if (!y10.f10049e || j3 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = di.pb.M0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(j31.i(12, -1071598, -1608430, 2131232723, N03, null, spannableStringBuilder));
        }
        di.y8.y(n31Var.currentAccount, true).p();
        org.telegram.messenger.t0.n();
        di.y8 y11 = di.y8.y(n31Var.currentAccount, true);
        long j10 = y11.p().amount;
        String N04 = org.telegram.messenger.gd.N0(2131749339, null);
        if (y11.f10049e && j10 > 0) {
            charSequence3 = di.pb.M0(y11.p(), 0.85f, ' ');
        }
        arrayList.add(j31.i(13, -14965523, -15431455, 2131231127, N04, null, charSequence3));
        if (!n31Var.getMessagesController().K3()) {
            arrayList.add(j31.i(15, -765355, -2148011, 2131232704, org.telegram.messenger.gd.N0(2131744007, null), null, null));
        }
        if (!n31Var.getMessagesController().f25786k7) {
            arrayList.add(j31.i(16, -816335, -1940716, 2131232713, org.telegram.messenger.gd.N0(2131745443, null), null, null));
        }
        if (((org.telegram.ui.Components.n41) i5.c.h(1, arrayList)).f56712a != 7) {
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        arrayList.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131745283, null)));
        arrayList.add(j31.i(17, -1007845, -1996271, 2131232703, org.telegram.messenger.gd.N0(2131753983, null), null, null));
        arrayList.add(j31.i(18, -14965523, -15431455, 2131232710, org.telegram.messenger.gd.N0(2131743997, null), null, null));
        arrayList.add(j31.i(23, -3903756, -6335009, 2131232711, org.telegram.messenger.gd.N0(2131743994, null), null, null));
        arrayList.add(j31.i(19, -11154873, -14175180, 2131232718, org.telegram.messenger.gd.N0(2131746589, null), null, null));
        aj.a aVar = aj.e.f1620a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.n41.C(null));
            arrayList.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131745287, null)));
            arrayList.add(j31.i(24, -765355, -2148011, 0, org.telegram.messenger.gd.N0(2131745789, null), null, null));
            arrayList.add(j31.i(26, -11154873, -14175180, 0, org.telegram.messenger.gd.N0(2131753916, null), null, null));
            arrayList.add(j31.i(27, -12743701, -13996071, 0, org.telegram.messenger.gd.N0(2131749137, null), null, null));
        }
        if (org.telegram.messenger.s2.f26829a) {
            arrayList.add(org.telegram.ui.Components.n41.C(null));
            arrayList.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131745290, null)));
            arrayList.add(j31.i(20, -11154873, -14175180, 0, org.telegram.messenger.gd.N0(2131751601, null), null, null));
            arrayList.add(j31.i(21, -11154873, -14175180, 0, org.telegram.messenger.gd.N0(2131751602, null), null, null));
            arrayList.add(j31.i(22, -765355, -2148011, 0, org.telegram.messenger.gd.N0(2131751638, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.n41.m(n31Var.N));
    }

    public static void h0(n31 n31Var, org.telegram.ui.Components.n41 n41Var) {
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.G0(LaunchActivity.H1, n31Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                xc1.a(n31Var.getParentActivity(), new a31(0, n31Var, tL_attachMenuBot), null);
            }
        } else if (n41Var.H(h31.class)) {
            int i7 = n41Var.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i7);
            }
        } else if (n41Var.H(org.telegram.ui.Cells.t6.class)) {
            Object obj2 = n41Var.H;
            if (obj2 instanceof tw0) {
                tw0 tw0Var = (tw0) obj2;
                org.telegram.ui.ActionBar.r4 parentLayout = n31Var.getParentLayout();
                tw0Var.f52490b.run();
                org.telegram.messenger.g0.j3(parentLayout, tw0Var.f52491c);
            } else if (obj2 instanceof org.telegram.messenger.yo) {
                org.telegram.messenger.ks.f(n31Var.currentAccount).k(org.telegram.messenger.ks.f25193c1, n31Var.f50197f.F, ((org.telegram.messenger.yo) obj2).f28271c);
            }
            Object obj3 = n41Var.H;
            if (obj3 != null) {
                n31Var.f50197f.E(obj3);
            }
        } else {
            switch (n41Var.d) {
                case 1:
                    n31Var.k0(new UserInfoActivity());
                    return;
                case 2:
                    n31Var.k0(new ThemeActivity(0));
                    return;
                case 3:
                    n31Var.k0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    n31Var.k0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    n31Var.k0(new DataSettingsActivity());
                    return;
                case 7:
                    n31Var.k0(new FiltersSetupActivity());
                    return;
                case 8:
                    n31Var.k0(new SessionsActivity(0));
                    return;
                case 9:
                    n31Var.k0(new y90());
                    return;
                case 10:
                    n31Var.k0(new LanguageSelectActivity());
                    return;
                case 11:
                    n31Var.k0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    n31Var.k0(new di.pb());
                    return;
                case 13:
                    n31Var.k0(new ii.t());
                    return;
                case 15:
                    n31Var.k0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    bi.f2.l1(false, org.telegram.messenger.v1.a(org.telegram.messenger.i10.f24637t0).b());
                    return;
                case 17:
                    n31Var.showDialog(org.telegram.ui.Components.b5.R(n31Var, n31Var.resourceProvider));
                    return;
                case 18:
                    vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                    return;
                case 19:
                    vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                    return;
                case 20:
                    ProfileActivity.Y4(n31Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.Y4(n31Var.getParentActivity(), true);
                    return;
                case 22:
                    org.telegram.messenger.a8.a();
                    return;
                case 23:
                    if (org.telegram.messenger.mp.u1(n31Var.currentAccount).A2()) {
                        b.b(n31Var.currentAccount);
                        return;
                    } else {
                        vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743993, null));
                        return;
                    }
                case 24:
                    n31Var.presentFragment(new yy0(0, null));
                    return;
                case 25:
                    n31Var.k0(new org.telegram.ui.Wallet.o6());
                    return;
                case 26:
                    n31Var.presentFragment(new yy0(1, null));
                    return;
                case 27:
                    ?? d51Var = new org.telegram.ui.Components.d51();
                    d51Var.f50543e = true;
                    n31Var.presentFragment((org.telegram.ui.ActionBar.g2) d51Var);
                    return;
            }
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56840a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Cells.c4 c4Var = this.f50201r;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(f10);
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            j0();
        }
    }

    @Override
    public final void P(boolean z10, boolean z11) {
        org.telegram.ui.Cells.c4 c4Var = this.f50201r;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f50190b = new w8(9, context, this);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.f50199g0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745299, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 14));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(0, 2131232491);
        b10.O();
        b10.C0 = new bi.x1(this, 22);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        org.telegram.ui.ActionBar.g5 b11 = t6.b(1, 2131231247);
        this.f50195e = b11;
        b11.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        this.f50195e.e(2, 2131232200, org.telegram.messenger.gd.N0(2131748550, null));
        f31 f31Var = new f31(this, this, context);
        this.f50197f = f31Var;
        f31Var.G();
        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(this, new a5(this, 27), new e31(this), new e31(this));
        this.f50192c = g51Var;
        g51Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.g51 g51Var2 = this.f50192c;
        g51Var2.f35323g3.f33631r = false;
        g51Var2.r1();
        this.f50192c.setSectionsDrawBackground(true);
        ri.a.e(this.f50192c, 0, 0, org.telegram.messenger.g0.L(12.0f), this.f50196e0);
        this.f50192c.setClipToPadding(false);
        this.f50192c.j(new b21(this, 1));
        this.f50190b.addView(this.f50192c, c8.na.e(-1, -1, 119));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.f50190b.addView(this.Q, c8.na.e(-1, 0, 48));
        this.f50190b.addView(this.simpleActionBar, c8.na.e(-1, -2, 55));
        org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
        this.h = u30Var;
        u30Var.I = true;
        u30Var.f40250a = this;
        u30Var.f40251b = this;
        this.f50204x = new FrameLayout(context);
        k0 k0Var = new k0(25, context, this);
        this.E = k0Var;
        this.f50204x.addView(k0Var, c8.na.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new c31(this, 5));
        c8.sa.a(this.E);
        this.f50204x.addOnLayoutChangeListener(new ng(this, 1));
        this.F = new org.telegram.ui.Components.kg0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50205y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.f50205y.setPivotY(0.0f);
        this.F.addView(this.f50205y, c8.na.e(90, 90, 51));
        w8 w8Var = this.f50190b;
        w8Var.addView(this.F, w8Var.indexOfChild(this.f50192c) + 1, c8.na.c(-1.0f, -1));
        this.G = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.H = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(90.0f));
        this.f50205y.addView(this.H, c8.na.c(-1.0f, -1));
        org.telegram.ui.Cells.c4 c4Var = new org.telegram.ui.Cells.c4(this, context);
        this.f50201r = c4Var;
        c4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.f50201r.setProgressColor(-1);
        this.f50201r.setNoProgress(false);
        this.f50205y.addView(this.f50201r, c8.na.c(-1.0f, -1));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = org.telegram.messenger.g0.L(32.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29394a7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, getThemedColor(i7));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, resourceProvider);
        this.I.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.J = frameLayout3;
        int L3 = org.telegram.messenger.g0.L(30.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L4 = org.telegram.ui.ActionBar.n6.L(L3, getThemedColor(i10));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(L4);
        org.telegram.ui.ActionBar.u6.j(frameLayout3, L4, M2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.K.setImageResource(2131231148);
        this.J.addView(this.K, c8.na.e(22, 22, 17));
        this.I.addView(this.J, c8.na.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        w8 w8Var2 = this.f50190b;
        w8Var2.addView(this.I, w8Var2.indexOfChild(this.F) + 1, c8.na.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(org.telegram.messenger.g0.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView m10 = org.telegram.ui.Cells.c0.m(this.f50204x, this.L, c8.na.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = m10;
        m10.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView m11 = org.telegram.ui.Cells.c0.m(this.f50204x, this.M, c8.na.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = m11;
        m11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(this.N, org.telegram.ui.ActionBar.n6.B6, getResourceProvider());
        this.N.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i11), 2, -1), null, org.telegram.ui.ActionBar.u6.M(i11), getResourceProvider());
        this.N.setOnClickListener(new c31(this, 6));
        this.P = new View(context);
        o0(true, false);
        this.f50192c.f35323g3.O(false);
        m0(getUserConfig().f());
        q0();
        j0();
        this.simpleActionBar.setBackground(null);
        int i12 = this.mSystemInsets.f15979b;
        if (this.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
            ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.Q.setLayoutParams(layoutParams);
            }
        }
        o0(true, false);
        w8 w8Var3 = this.f50190b;
        e31 e31Var = new e31(this);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(w8Var3, e31Var);
        w8 w8Var4 = this.f50190b;
        this.fragmentView = w8Var4;
        return w8Var4;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.g51 g51Var;
        if (i7 == org.telegram.messenger.ks.A3) {
            m0(getUserConfig().f());
            org.telegram.ui.Components.g51 g51Var2 = this.f50192c;
            if (g51Var2 != null) {
                g51Var2.f35323g3.O(true);
            }
        } else if (i7 == org.telegram.messenger.ks.f25276r) {
            m0(getUserConfig().f());
        } else if (i7 == org.telegram.messenger.ks.f25285s1 && (g51Var = this.f50192c) != null) {
            g51Var.f35323g3.O(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f50192c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f50188a.f57780f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.z4 z4Var;
        boolean z10;
        int i7;
        int i10;
        if (this.O && (z10 = (z4Var = this.simpleActionBar).G) != this.f50199g0) {
            this.f50199g0 = z10;
            if (z10) {
                i7 = 2131231243;
            } else {
                i7 = 2131232490;
            }
            z4Var.setBackButtonImageAnimated(i7);
            org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
            if (z10) {
                i10 = 2131754878;
            } else {
                i10 = 2131746304;
            }
            z4Var2.setBackButtonContentDescription(org.telegram.messenger.gd.N0(i10, null));
        }
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56840a) {
            return baseSimpleGlass.f56743i;
        }
        return null;
    }

    public final void k0(org.telegram.ui.ActionBar.g2 g2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (launchActivity = LaunchActivity.H1) != null && (actionBarLayout = launchActivity.f43218r0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.d0((org.telegram.ui.ActionBar.g2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.p4 p4Var = new org.telegram.ui.ActionBar.p4(g2Var);
            p4Var.f29943c = true;
            p4Var.f29946g = true;
            actionBarLayout.U(p4Var);
            return;
        }
        presentFragment(g2Var);
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
        if (this.H == null || this.f50198f0 != -1) {
            return;
        }
        this.G.r(user);
        this.H.f(user, this.G);
        this.L.setText(org.telegram.messenger.n10.q(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(pf.b.c().b("+" + user.phone));
        }
        String o4 = org.telegram.messenger.n10.o(user);
        if (o4 != null) {
            sb2.append(" • @");
            sb2.append(o4);
        }
        this.M.setText(sb2);
        TextView textView = this.N;
        String str2 = null;
        try {
            PackageInfo packageInfo = org.telegram.messenger.t0.f27013b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f27013b.getPackageName(), 0);
            int i7 = packageInfo.versionCode;
            int i10 = i7 / 10;
            int i11 = i7 % 10;
            if (i11 != 1 && i11 != 2) {
                org.telegram.messenger.t0.u();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            str2 = org.telegram.messenger.gd.a0(null, null, 2131743965, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        textView.setText(str2);
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.f50201r == null) {
            return;
        }
        AnimatorSet animatorSet = this.f50200n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f50200n = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f50200n = animatorSet2;
            if (z10) {
                this.f50201r.setVisibility(0);
                this.f50200n.playTogether(ObjectAnimator.ofFloat(this.f50201r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f50201r, View.ALPHA, 0.0f));
            }
            this.f50200n.setDuration(180L);
            this.f50200n.addListener(new b30(10, this, z10));
            this.f50200n.start();
        } else if (z10) {
            this.f50201r.setAlpha(1.0f);
            this.f50201r.setVisibility(0);
        } else {
            this.f50201r.setAlpha(0.0f);
            this.f50201r.setVisibility(4);
        }
    }

    public final void o0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n31.o0(boolean, boolean):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var.G) {
            if (z10) {
                z4Var.o(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        xi.e eVar = this.S;
        if (eVar != null) {
            eVar.b();
            this.S = null;
        }
        xi.e eVar2 = new xi.e(org.telegram.messenger.ks.e(), this);
        eVar2.c(org.telegram.messenger.ks.f25276r);
        eVar2.c(org.telegram.messenger.ks.A3);
        eVar2.c(org.telegram.messenger.ks.f25285s1);
        this.S = eVar2;
        Bundle bundle = this.arguments;
        int i7 = 0;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.O) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        }
        this.f50196e0 = i7;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xi.e eVar = this.S;
        if (eVar != null) {
            eVar.b();
            this.S = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.b51 b51Var = this.f50192c.f35323g3;
        if (b51Var != null) {
            b51Var.O(false);
        }
    }

    public final void p0() {
        if (this.F != null && this.f50205y != null) {
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
                for (View view2 = this.f50204x; view2 != null && view2 != this.f50192c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    f11 += view2.getY();
                }
                float paddingTop = (height - f11) + this.f50192c.getPaddingTop();
                g31 g31Var = this.F;
                float f12 = -org.telegram.messenger.g0.L(16.0f);
                bi.d2 d2Var = g31Var.f36746n;
                if (d2Var != null && d2Var.f3457c) {
                    f12 = ((RectF) d2Var.f3458e).centerY();
                }
                float a10 = c8.m9.a((height - f12) / Math.max(1.0f, paddingTop - f12), 0.0f, 1.0f);
                float max = Math.max(height, f12);
                this.Z = height;
                this.f50189a0 = paddingTop;
                this.f50191b0 = f12;
                float L = org.telegram.messenger.g0.L(90.0f);
                float scaleX = this.E.getScaleX() * (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(this.F.getHiddenAvatarSizeDp()), L, a10) / L);
                float f13 = (L * scaleX) / 2.0f;
                float width = (this.F.getWidth() / 2.0f) - f13;
                if (max != this.W || scaleX != this.X || a10 != this.Y || f10 != this.F.getAlpha() || width != this.f50205y.getTranslationX()) {
                    this.W = max;
                    this.X = scaleX;
                    this.Y = a10;
                    this.F.setAlpha(f10);
                    this.f50205y.setScaleX(scaleX);
                    this.f50205y.setScaleY(scaleX);
                    this.f50205y.setTranslationX(width);
                    float f14 = max - f13;
                    this.f50205y.setTranslationY(f14);
                    this.I.setAlpha(c8.m9.a(org.telegram.messenger.g0.z1(a10, 0.75f, 1.0f), 0.0f, 1.0f) * f10);
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
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.G6));
        this.M.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29843y6));
        this.d.W();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, themedColor), themedColor}));
        }
        this.f50192c.invalidate();
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
        this.f50192c.y0(0);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public n31(Bundle bundle) {
        super(bundle);
        this.f50188a = new te.a(0, this, org.telegram.ui.Components.kr.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.f50193c0 = new ArrayList();
        this.f50198f0 = -1;
        this.f50199g0 = true;
    }

    @Override
    public final void U() {
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
