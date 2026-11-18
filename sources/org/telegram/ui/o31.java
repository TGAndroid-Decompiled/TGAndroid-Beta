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
public final class o31 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, org.telegram.ui.Components.t30, le0, te.b {
    public k0 E;
    public h31 F;
    public org.telegram.ui.Components.b9 G;
    public org.telegram.ui.Components.q9 H;
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
    public final te.a f50426a;
    public float f50427a0;
    public v8 f50428b;
    public float f50429b0;
    public org.telegram.ui.Components.e51 f50430c;
    public final ArrayList f50431c0;
    public org.telegram.ui.ActionBar.h5 d;
    public int f50432d0;
    public org.telegram.ui.ActionBar.h5 f50433e;
    public int f50434e0;
    public g31 f50435f;
    public int f50436f0;
    public boolean f50437g0;
    public org.telegram.ui.Components.u30 h;
    public AnimatorSet f50438n;
    public org.telegram.ui.Cells.c4 f50439r;
    public TLRPC.FileLocation f50440s;
    public TLRPC.FileLocation f50441w;
    public FrameLayout f50442x;
    public FrameLayout f50443y;

    public o31() {
        this(null);
    }

    public static boolean Z(o31 o31Var, org.telegram.ui.Components.l41 l41Var, View view) {
        String str;
        Object obj = l41Var.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ki.t2.n(o31Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new c31(o31Var, 2));
            return true;
        }
        if (l41Var.H(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = l41Var.H;
            if (obj2 instanceof vw0) {
                str = ((vw0) obj2).h;
            } else if (obj2 instanceof org.telegram.messenger.yo) {
                str = ((org.telegram.messenger.yo) obj2).f28171c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(o31Var, view);
                I.c(2131232206, org.telegram.messenger.gd.M0(2131751751, null), new b31(0, o31Var, str), false);
                I.X(o31Var.f50430c.U0(view, false));
                I.a0();
                return true;
            }
        }
        return false;
    }

    public static void a0(o31 o31Var) {
        boolean z10;
        TLRPC.User c22 = org.telegram.messenger.mp.u1(o31Var.currentAccount).c2(Long.valueOf(org.telegram.messenger.j10.i(o31Var.currentAccount).e()));
        if (c22 == null) {
            c22 = org.telegram.messenger.j10.i(o31Var.currentAccount).f();
        }
        if (c22 == null) {
            return;
        }
        org.telegram.ui.Components.u30 u30Var = o31Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        u30Var.n(z10, new c31(o31Var, 0), new hi.f1(6), 0);
    }

    public static void b0(o31 o31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, o31Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(o31Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.f26599b;
        if (tL_attachMenuBots != null) {
            long j3 = d02.f26596a;
            d02.getMessagesStorage().f27052a.c(new org.telegram.messenger.ek(d02.f26607e, 2, j3, d02, tL_attachMenuBots));
        }
    }

    public static void c0(o31 o31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.mp.u1(o31Var.currentAccount).q1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(o31Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new e31(0, o31Var, tL_attachMenuBot), 66);
    }

    public static void d0(o31 o31Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize x10;
        o31Var.f50436f0 = -1;
        if (tL_error == null) {
            TLRPC.User c22 = o31Var.getMessagesController().c2(Long.valueOf(o31Var.getUserConfig().e()));
            if (c22 == null) {
                c22 = o31Var.getUserConfig().f();
                if (c22 == null) {
                    return;
                }
                o31Var.getMessagesController().e4(c22, false, false);
            } else {
                o31Var.getUserConfig().w(c22);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28427id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && o31Var.f50440s != null) {
                org.telegram.messenger.w7.G(o31Var.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(o31Var.currentAccount);
                org.telegram.messenger.w7.J(o31Var.f50440s, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(o31Var.f50440s.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(o31Var.f50440s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.ec.D().S(n10, a8.p0.n(w10.location.local_id, "@90_90", sb3), org.telegram.messenger.fc.m(o31Var.currentAccount, 1, c22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(o31Var.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && o31Var.f50441w != null) {
                org.telegram.messenger.w7.G(o31Var.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(o31Var.currentAccount);
                org.telegram.messenger.w7.J(o31Var.f50441w, null, true, true).renameTo(J2);
            }
            o31Var.getMessagesController().W0(c22.f28552id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c22);
            o31Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull d2 = o31Var.getMessagesController().d2(o31Var.getUserConfig().e());
            if (d2 != null) {
                d2.profile_photo = tL_photos_photo.photo;
                o31Var.getMessagesStorage().j2(d2, false);
            }
            o31Var.m0(c22);
        }
        o31Var.f50440s = null;
        o31Var.f50441w = null;
        o31Var.n0(false, true);
        o31Var.getNotificationCenter().k(org.telegram.messenger.ks.f25177r, Integer.valueOf(org.telegram.messenger.mp.I8));
        o31Var.getNotificationCenter().k(org.telegram.messenger.ks.f25134j0, new Object[0]);
        o31Var.getUserConfig().v(true);
    }

    public static void e0(o31 o31Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            o31Var.f50440s = fileLocation;
            o31Var.f50441w = photoSize2.location;
            o31Var.H.j(org.telegram.messenger.fc.e(fileLocation), "90_90", o31Var.G, null);
            o31Var.n0(true, false);
        } else if (o31Var.f50440s == null) {
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
            o31Var.f50436f0 = o31Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new e31(1, o31Var, str));
        }
        o31Var.simpleActionBar.t().requestLayout();
    }

    public static void f0(o31 o31Var, ArrayList arrayList) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i7;
        String str;
        int i10;
        String str2;
        int i11 = 0;
        if (o31Var.d.x()) {
            arrayList.add(org.telegram.ui.Components.l41.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            g31 g31Var = o31Var.f50435f;
            ArrayList arrayList2 = g31Var.d;
            ArrayList arrayList3 = g31Var.f53499w;
            if (g31Var.f53500x) {
                ArrayList arrayList4 = g31Var.f53497r;
                int size = arrayList4.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    int i14 = org.telegram.ui.Cells.u6.f32028b;
                    org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(org.telegram.ui.Cells.u6.class);
                    K.f37018m = (CharSequence) g31Var.f53496n.get(i12);
                    K.H = (vw0) obj;
                    arrayList.add(K);
                    i12++;
                }
                if (!g31Var.f53498s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(2131745287, null)));
                    ArrayList arrayList5 = g31Var.f53498s;
                    int size2 = arrayList5.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList5.get(i11);
                        i11++;
                        int i15 = org.telegram.ui.Cells.u6.f32028b;
                        org.telegram.ui.Components.l41 K2 = org.telegram.ui.Components.l41.K(org.telegram.ui.Cells.u6.class);
                        K2.f37018m = (CharSequence) g31Var.f53496n.get(i12);
                        K2.H = (org.telegram.messenger.yo) obj2;
                        arrayList.add(K2);
                        i12++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(2131745274, null)));
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList3.get(i16);
                    i16++;
                    if (obj3 instanceof vw0) {
                        vw0 vw0Var = (vw0) obj3;
                        String str3 = vw0Var.f52862a;
                        int i17 = org.telegram.ui.Cells.u6.f32028b;
                        org.telegram.ui.Components.l41 K3 = org.telegram.ui.Components.l41.K(org.telegram.ui.Cells.u6.class);
                        K3.f37018m = str3;
                        K3.H = vw0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.yo) {
                        org.telegram.messenger.yo yoVar = (org.telegram.messenger.yo) obj3;
                        String str4 = yoVar.f28169a;
                        int i18 = org.telegram.ui.Cells.u6.f32028b;
                        org.telegram.ui.Components.l41 K4 = org.telegram.ui.Components.l41.K(org.telegram.ui.Cells.u6.class);
                        K4.f37018m = str4;
                        K4.H = yoVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(2131745287, null)));
                int size4 = arrayList2.size();
                while (i11 < size4) {
                    Object obj4 = arrayList2.get(i11);
                    i11++;
                    org.telegram.messenger.yo yoVar2 = (org.telegram.messenger.yo) obj4;
                    String str5 = yoVar2.f28169a;
                    int i19 = org.telegram.ui.Cells.u6.f32028b;
                    org.telegram.ui.Components.l41 K5 = org.telegram.ui.Components.l41.K(org.telegram.ui.Cells.u6.class);
                    K5.f37018m = str5;
                    K5.H = yoVar2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.l41.n(o31Var.f50442x, 188));
        o31Var.f50431c0.clear();
        for (int i20 = 0; i20 < 4; i20++) {
            if (org.telegram.messenger.j10.i(i20).p() && o31Var.currentAccount != i20) {
                o31Var.f50431c0.add(Integer.valueOf(i20));
            }
        }
        Collections.sort(o31Var.f50431c0, new qw0(1));
        Set set = o31Var.getMessagesController().V3;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(m31.i(org.telegram.messenger.gd.M0(2131749351, null), org.telegram.messenger.gd.M0(2131749352, null), null, null, org.telegram.messenger.gd.M0(2131749353, null), new d31(o31Var, 0)));
            arrayList.add(org.telegram.ui.Components.l41.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && o31Var.getUserConfig().f() != null) {
            arrayList.add(m31.i(org.telegram.messenger.gd.a0(null, null, 2131752145, org.telegram.messenger.n10.h(new StringBuilder("+"), o31Var.getUserConfig().f().phone, pf.b.c())), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752144, null), new c31(o31Var, 1)), org.telegram.messenger.gd.M0(2131752142, null), new d31(o31Var, 1), di.f6.t2(org.telegram.messenger.gd.M0(2131752140, null)), new d31(o31Var, 2)));
            arrayList.add(org.telegram.ui.Components.l41.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(m31.i(org.telegram.messenger.gd.M0(2131742545, null), org.telegram.messenger.gd.M0(2131742544, null), org.telegram.messenger.gd.M0(2131742543, null), new d31(o31Var, 3), org.telegram.messenger.gd.M0(2131742542, null), new d31(o31Var, 4)));
            arrayList.add(org.telegram.ui.Components.l41.C(null));
        }
        if (o31Var.f50431c0.size() > 0) {
            i5.c.s(2131745297, null, arrayList);
            for (int i21 = 0; i21 < o31Var.f50431c0.size(); i21++) {
                int intValue = ((Integer) o31Var.f50431c0.get(i21)).intValue();
                int i22 = i31.f48526b;
                org.telegram.ui.Components.l41 K6 = org.telegram.ui.Components.l41.K(i31.class);
                K6.d = i21;
                K6.A = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.l41.C(null));
        }
        if (o31Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && ((org.telegram.messenger.h0) o31Var.getMessagesController().A7.f26159p0.f13998b).f24336c) {
            org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(o31Var.currentAccount);
            if (org.telegram.ui.ActionBar.n6.I.q()) {
                i10 = 2131232722;
            } else {
                i10 = 2131232721;
            }
            CharSequence M0 = org.telegram.messenger.gd.M0(2131742956, null);
            int i23 = org.telegram.ui.Cells.n8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.j10.f24770t0).getCurrentTime() - 1790679020 <= 2419200) {
                M0 = org.telegram.ui.Cells.n8.b(M0);
            }
            CharSequence charSequence = M0;
            if (D.A() > 0) {
                str2 = org.telegram.ui.Wallet.u0.t(D.A(), false);
            } else {
                str2 = null;
            }
            arrayList.add(k31.i(25, 0, 0, i10, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.l41.C(null));
        }
        arrayList.add(k31.i(1, -14899731, -15431455, 2131232698, org.telegram.messenger.gd.M0(2131745299, null), org.telegram.messenger.gd.M0(2131745298, null), null));
        arrayList.add(k31.i(2, -1007845, -1996271, 2131232704, org.telegram.messenger.gd.M0(2131745295, null), org.telegram.messenger.gd.M0(2131745294, null), null));
        arrayList.add(k31.i(3, -11154873, -14175180, 2131232718, org.telegram.messenger.gd.M0(2131745276, null), org.telegram.messenger.gd.M0(2131745275, null), null));
        arrayList.add(k31.i(5, -765355, -2148011, 2131232719, org.telegram.messenger.gd.M0(2131745280, null), org.telegram.messenger.gd.M0(2131745279, null), null));
        arrayList.add(k31.i(6, -11565578, -13276952, 2131232705, org.telegram.messenger.gd.M0(2131745293, null), org.telegram.messenger.gd.M0(2131745292, null), null));
        arrayList.add(k31.i(7, -14899731, -15497247, 2131232709, org.telegram.messenger.gd.M0(2131745286, null), org.telegram.messenger.gd.M0(2131745285, null), null));
        arrayList.add(k31.i(8, -13451058, -14836538, 2131232706, org.telegram.messenger.gd.M0(2131745290, null), org.telegram.messenger.gd.M0(2131745289, null), null));
        arrayList.add(k31.i(9, -881871, -1940716, 2131232716, org.telegram.messenger.gd.M0(2131745278, null), org.telegram.messenger.gd.M0(2131745277, null), null));
        arrayList.add(k31.i(10, -3903756, -6335009, 2131232714, org.telegram.messenger.gd.M0(2131745283, null), org.telegram.messenger.gd.j0(), null));
        arrayList.add(org.telegram.ui.Components.l41.C(null));
        if (!z10 && ((org.telegram.messenger.h0) o31Var.getMessagesController().A7.f26159p0.f13998b).f24336c) {
            org.telegram.ui.Wallet.u0 D2 = org.telegram.ui.Wallet.u0.D(o31Var.currentAccount);
            if (org.telegram.ui.ActionBar.n6.I.q()) {
                i7 = 2131232722;
            } else {
                i7 = 2131232721;
            }
            CharSequence M02 = org.telegram.messenger.gd.M0(2131742956, null);
            int i24 = org.telegram.ui.Cells.n8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.j10.f24770t0).getCurrentTime() - 1790679020 <= 2419200) {
                M02 = org.telegram.ui.Cells.n8.b(M02);
            }
            CharSequence charSequence2 = M02;
            if (D2.A() > 0) {
                str = org.telegram.ui.Wallet.u0.t(D2.A(), false);
            } else {
                str = null;
            }
            arrayList.add(k31.i(25, 0, 0, i7, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.l41.C(null));
        }
        if (!o31Var.getMessagesController().K3()) {
            arrayList.add(k31.i(11, -4826625, -10388225, 2131232717, org.telegram.messenger.gd.M0(2131743996, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!o31Var.getMessagesController().f25707m7) {
            di.x8 y10 = di.x8.y(o31Var.currentAccount, false);
            long j3 = y10.p().amount;
            String M03 = org.telegram.messenger.gd.M0(2131743980, null);
            if (!y10.f10018e || j3 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = di.pb.M0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(k31.i(12, -1071598, -1608430, 2131232720, M03, null, spannableStringBuilder));
        }
        di.x8.y(o31Var.currentAccount, true).p();
        org.telegram.messenger.t0.n();
        di.x8 y11 = di.x8.y(o31Var.currentAccount, true);
        long j10 = y11.p().amount;
        String M04 = org.telegram.messenger.gd.M0(2131749340, null);
        if (y11.f10018e && j10 > 0) {
            charSequence3 = di.pb.M0(y11.p(), 0.85f, ' ');
        }
        arrayList.add(k31.i(13, -14965523, -15431455, 2131231125, M04, null, charSequence3));
        if (!o31Var.getMessagesController().K3()) {
            arrayList.add(k31.i(15, -765355, -2148011, 2131232701, org.telegram.messenger.gd.M0(2131744017, null), null, null));
        }
        if (!o31Var.getMessagesController().f25691k7) {
            arrayList.add(k31.i(16, -816335, -1940716, 2131232710, org.telegram.messenger.gd.M0(2131745444, null), null, null));
        }
        if (((org.telegram.ui.Components.l41) i5.c.h(1, arrayList)).f56589a != 7) {
            arrayList.add(org.telegram.ui.Components.l41.C(null));
        }
        arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131745284, null)));
        arrayList.add(k31.i(17, -1007845, -1996271, 2131232700, org.telegram.messenger.gd.M0(2131753984, null), null, null));
        arrayList.add(k31.i(18, -14965523, -15431455, 2131232707, org.telegram.messenger.gd.M0(2131744007, null), null, null));
        arrayList.add(k31.i(23, -3903756, -6335009, 2131232708, org.telegram.messenger.gd.M0(2131744004, null), null, null));
        arrayList.add(k31.i(19, -11154873, -14175180, 2131232715, org.telegram.messenger.gd.M0(2131746590, null), null, null));
        aj.a aVar = aj.e.f1649a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.l41.C(null));
            arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131745288, null)));
            arrayList.add(k31.i(24, -765355, -2148011, 0, org.telegram.messenger.gd.M0(2131745790, null), null, null));
            arrayList.add(k31.i(26, -11154873, -14175180, 0, org.telegram.messenger.gd.M0(2131753917, null), null, null));
            arrayList.add(k31.i(27, -12743701, -13996071, 0, org.telegram.messenger.gd.M0(2131749138, null), null, null));
        }
        if (org.telegram.messenger.s2.f26721a) {
            arrayList.add(org.telegram.ui.Components.l41.C(null));
            arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131745291, null)));
            arrayList.add(k31.i(20, -11154873, -14175180, 0, org.telegram.messenger.gd.M0(2131751602, null), null, null));
            arrayList.add(k31.i(21, -11154873, -14175180, 0, org.telegram.messenger.gd.M0(2131751603, null), null, null));
            arrayList.add(k31.i(22, -765355, -2148011, 0, org.telegram.messenger.gd.M0(2131751639, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.l41.m(o31Var.N));
    }

    public static void h0(o31 o31Var, org.telegram.ui.Components.l41 l41Var) {
        Object obj = l41Var.H;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.G0(LaunchActivity.H1, o31Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                zc1.a(o31Var.getParentActivity(), new org.telegram.ui.Components.ph(29, o31Var, tL_attachMenuBot), null);
            }
        } else if (l41Var.H(i31.class)) {
            int i7 = l41Var.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i7);
            }
        } else if (l41Var.H(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = l41Var.H;
            if (obj2 instanceof vw0) {
                vw0 vw0Var = (vw0) obj2;
                org.telegram.ui.ActionBar.s4 parentLayout = o31Var.getParentLayout();
                vw0Var.f52863b.run();
                org.telegram.messenger.g0.j3(parentLayout, vw0Var.f52864c);
            } else if (obj2 instanceof org.telegram.messenger.yo) {
                org.telegram.messenger.ks.f(o31Var.currentAccount).k(org.telegram.messenger.ks.f25094c1, o31Var.f50435f.F, ((org.telegram.messenger.yo) obj2).f28171c);
            }
            Object obj3 = l41Var.H;
            if (obj3 != null) {
                o31Var.f50435f.E(obj3);
            }
        } else {
            switch (l41Var.d) {
                case 1:
                    o31Var.k0(new UserInfoActivity());
                    return;
                case 2:
                    o31Var.k0(new ThemeActivity(0));
                    return;
                case 3:
                    o31Var.k0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    o31Var.k0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    o31Var.k0(new DataSettingsActivity());
                    return;
                case 7:
                    o31Var.k0(new FiltersSetupActivity());
                    return;
                case 8:
                    o31Var.k0(new SessionsActivity(0));
                    return;
                case 9:
                    o31Var.k0(new z90());
                    return;
                case 10:
                    o31Var.k0(new LanguageSelectActivity());
                    return;
                case 11:
                    o31Var.k0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    o31Var.k0(new di.pb());
                    return;
                case 13:
                    o31Var.k0(new ii.t());
                    return;
                case 15:
                    o31Var.k0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    bi.a2.l1(false, org.telegram.messenger.v1.a(org.telegram.messenger.j10.f24770t0).b());
                    return;
                case 17:
                    o31Var.showDialog(org.telegram.ui.Components.b5.R(o31Var, o31Var.resourceProvider));
                    return;
                case 18:
                    vf.c.t(o31Var.getParentActivity(), org.telegram.messenger.gd.M0(2131744005, null));
                    return;
                case 19:
                    vf.c.t(o31Var.getParentActivity(), org.telegram.messenger.gd.M0(2131746588, null));
                    return;
                case 20:
                    ProfileActivity.Y4(o31Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.Y4(o31Var.getParentActivity(), true);
                    return;
                case 22:
                    org.telegram.messenger.a8.a();
                    return;
                case 23:
                    if (org.telegram.messenger.mp.u1(o31Var.currentAccount).A2()) {
                        b.b(o31Var.currentAccount);
                        return;
                    } else {
                        vf.c.t(o31Var.getParentActivity(), org.telegram.messenger.gd.M0(2131744003, null));
                        return;
                    }
                case 24:
                    o31Var.presentFragment(new zy0(0, null));
                    return;
                case 25:
                    o31Var.k0(new org.telegram.ui.Wallet.n6());
                    return;
                case 26:
                    o31Var.presentFragment(new zy0(1, null));
                    return;
                case 27:
                    ?? b51Var = new org.telegram.ui.Components.b51();
                    b51Var.f50460e = true;
                    o31Var.presentFragment((org.telegram.ui.ActionBar.h2) b51Var);
                    return;
            }
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56717a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            j0();
        }
    }

    @Override
    public final void I(float f10) {
        org.telegram.ui.Cells.c4 c4Var = this.f50439r;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(f10);
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
        org.telegram.ui.Cells.c4 c4Var = this.f50439r;
        if (c4Var == null) {
            return;
        }
        c4Var.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f50428b = new v8(9, context, this);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.f50437g0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131745300, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 14));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.g5 t6 = this.simpleActionBar.t();
        org.telegram.ui.ActionBar.h5 b10 = t6.b(0, 2131232488);
        b10.O();
        b10.C0 = new bi.s1(this, 22);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        org.telegram.ui.ActionBar.h5 b11 = t6.b(1, 2131231244);
        this.f50433e = b11;
        b11.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        this.f50433e.e(2, 2131232197, org.telegram.messenger.gd.M0(2131748551, null));
        g31 g31Var = new g31(this, this, context);
        this.f50435f = g31Var;
        g31Var.G();
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(this, new a5(this, 27), new f31(this), new f31(this));
        this.f50430c = e51Var;
        e51Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.e51 e51Var2 = this.f50430c;
        e51Var2.f34607g3.f42809r = false;
        e51Var2.r1();
        this.f50430c.setSectionsDrawBackground(true);
        ri.a.e(this.f50430c, 0, 0, org.telegram.messenger.g0.L(12.0f), this.f50434e0);
        this.f50430c.setClipToPadding(false);
        this.f50430c.j(new c21(this, 1));
        this.f50428b.addView(this.f50430c, c8.ma.e(-1, -1, 119));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.f50428b.addView(this.Q, c8.ma.e(-1, 0, 48));
        this.f50428b.addView(this.simpleActionBar, c8.ma.e(-1, -2, 55));
        org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
        this.h = u30Var;
        u30Var.I = true;
        u30Var.f40195a = this;
        u30Var.f40196b = this;
        this.f50442x = new FrameLayout(context);
        k0 k0Var = new k0(25, context, this);
        this.E = k0Var;
        this.f50442x.addView(k0Var, c8.ma.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new d31(this, 5));
        c8.ra.a(this.E);
        this.f50442x.addOnLayoutChangeListener(new ng(this, 1));
        this.F = new org.telegram.ui.Components.jg0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50443y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.f50443y.setPivotY(0.0f);
        this.F.addView(this.f50443y, c8.ma.e(90, 90, 51));
        v8 v8Var = this.f50428b;
        v8Var.addView(this.F, v8Var.indexOfChild(this.f50430c) + 1, c8.ma.c(-1.0f, -1));
        this.G = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.H = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(90.0f));
        this.f50443y.addView(this.H, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Cells.c4 c4Var = new org.telegram.ui.Cells.c4(this, context);
        this.f50439r = c4Var;
        c4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.f50439r.setProgressColor(-1);
        this.f50439r.setNoProgress(false);
        this.f50443y.addView(this.f50439r, c8.ma.c(-1.0f, -1));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = org.telegram.messenger.g0.L(32.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29337a7;
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
        this.K.setImageResource(2131231146);
        this.J.addView(this.K, c8.ma.e(22, 22, 17));
        this.I.addView(this.J, c8.ma.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        v8 v8Var2 = this.f50428b;
        v8Var2.addView(this.I, v8Var2.indexOfChild(this.F) + 1, c8.ma.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(org.telegram.messenger.g0.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView m10 = org.telegram.ui.Cells.c0.m(this.f50442x, this.L, c8.ma.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = m10;
        m10.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView m11 = org.telegram.ui.Cells.c0.m(this.f50442x, this.M, c8.ma.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = m11;
        m11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(this.N, org.telegram.ui.ActionBar.n6.B6, getResourceProvider());
        this.N.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i11 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.h0(getThemedColor(i11), 2, -1), null, org.telegram.ui.ActionBar.u6.M(i11), getResourceProvider());
        this.N.setOnClickListener(new d31(this, 6));
        this.P = new View(context);
        o0(true, false);
        this.f50430c.f34607g3.O(false);
        m0(getUserConfig().f());
        q0();
        j0();
        this.simpleActionBar.setBackground(null);
        int i12 = this.mSystemInsets.f15890b;
        if (this.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
            ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.Q.setLayoutParams(layoutParams);
            }
        }
        o0(true, false);
        v8 v8Var3 = this.f50428b;
        f31 f31Var = new f31(this);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(v8Var3, f31Var);
        v8 v8Var4 = this.f50428b;
        this.fragmentView = v8Var4;
        return v8Var4;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.e51 e51Var;
        if (i7 == org.telegram.messenger.ks.A3) {
            m0(getUserConfig().f());
            org.telegram.ui.Components.e51 e51Var2 = this.f50430c;
            if (e51Var2 != null) {
                e51Var2.f34607g3.O(true);
            }
        } else if (i7 == org.telegram.messenger.ks.f25177r) {
            m0(getUserConfig().f());
        } else if (i7 == org.telegram.messenger.ks.f25186s1 && (e51Var = this.f50430c) != null) {
            e51Var.f34607g3.O(true);
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
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f50430c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f50426a.f57658f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.a5 a5Var;
        boolean z10;
        int i7;
        int i10;
        if (this.O && (z10 = (a5Var = this.simpleActionBar).G) != this.f50437g0) {
            this.f50437g0 = z10;
            if (z10) {
                i7 = 2131231240;
            } else {
                i7 = 2131232487;
            }
            a5Var.setBackButtonImageAnimated(i7);
            org.telegram.ui.ActionBar.a5 a5Var2 = this.simpleActionBar;
            if (z10) {
                i10 = 2131754878;
            } else {
                i10 = 2131746305;
            }
            a5Var2.setBackButtonContentDescription(org.telegram.messenger.gd.M0(i10, null));
        }
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56717a) {
            return baseSimpleGlass.f56620i;
        }
        return null;
    }

    public final void k0(org.telegram.ui.ActionBar.h2 h2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (launchActivity = LaunchActivity.H1) != null && (actionBarLayout = launchActivity.f43098r0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.d0((org.telegram.ui.ActionBar.h2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.q4 q4Var = new org.telegram.ui.ActionBar.q4(h2Var);
            q4Var.f29903c = true;
            q4Var.f29906g = true;
            actionBarLayout.U(q4Var);
            return;
        }
        presentFragment(h2Var);
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
        if (this.H == null || this.f50436f0 != -1) {
            return;
        }
        this.G.r(user);
        this.H.f(user, this.G);
        this.L.setText(org.telegram.messenger.o10.q(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(pf.b.c().b("+" + user.phone));
        }
        String o4 = org.telegram.messenger.o10.o(user);
        if (o4 != null) {
            sb2.append(" • @");
            sb2.append(o4);
        }
        this.M.setText(sb2);
        TextView textView = this.N;
        String str2 = null;
        try {
            PackageInfo packageInfo = org.telegram.messenger.t0.f26913b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26913b.getPackageName(), 0);
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
            str2 = org.telegram.messenger.gd.a0(null, null, 2131743975, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        textView.setText(str2);
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.f50439r == null) {
            return;
        }
        AnimatorSet animatorSet = this.f50438n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f50438n = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f50438n = animatorSet2;
            if (z10) {
                this.f50439r.setVisibility(0);
                this.f50438n.playTogether(ObjectAnimator.ofFloat(this.f50439r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f50439r, View.ALPHA, 0.0f));
            }
            this.f50438n.setDuration(180L);
            this.f50438n.addListener(new c30(10, this, z10));
            this.f50438n.start();
        } else if (z10) {
            this.f50439r.setAlpha(1.0f);
            this.f50439r.setVisibility(0);
        } else {
            this.f50439r.setAlpha(0.0f);
            this.f50439r.setVisibility(4);
        }
    }

    public final void o0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o31.o0(boolean, boolean):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var.G) {
            if (z10) {
                a5Var.o(true);
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
        eVar2.c(org.telegram.messenger.ks.f25177r);
        eVar2.c(org.telegram.messenger.ks.A3);
        eVar2.c(org.telegram.messenger.ks.f25186s1);
        this.S = eVar2;
        Bundle bundle = this.arguments;
        int i7 = 0;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.O) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        }
        this.f50434e0 = i7;
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
        org.telegram.ui.Components.z41 z41Var = this.f50430c.f34607g3;
        if (z41Var != null) {
            z41Var.O(false);
        }
    }

    public final void p0() {
        if (this.F != null && this.f50443y != null) {
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
                for (View view2 = this.f50442x; view2 != null && view2 != this.f50430c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    f11 += view2.getY();
                }
                float paddingTop = (height - f11) + this.f50430c.getPaddingTop();
                h31 h31Var = this.F;
                float f12 = -org.telegram.messenger.g0.L(16.0f);
                bi.y1 y1Var = h31Var.f36437n;
                if (y1Var != null && y1Var.f4218c) {
                    f12 = ((RectF) y1Var.f4219e).centerY();
                }
                float a10 = c8.l9.a((height - f12) / Math.max(1.0f, paddingTop - f12), 0.0f, 1.0f);
                float max = Math.max(height, f12);
                this.Z = height;
                this.f50427a0 = paddingTop;
                this.f50429b0 = f12;
                float L = org.telegram.messenger.g0.L(90.0f);
                float scaleX = this.E.getScaleX() * (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(this.F.getHiddenAvatarSizeDp()), L, a10) / L);
                float f13 = (L * scaleX) / 2.0f;
                float width = (this.F.getWidth() / 2.0f) - f13;
                if (max != this.W || scaleX != this.X || a10 != this.Y || f10 != this.F.getAlpha() || width != this.f50443y.getTranslationX()) {
                    this.W = max;
                    this.X = scaleX;
                    this.Y = a10;
                    this.F.setAlpha(f10);
                    this.f50443y.setScaleX(scaleX);
                    this.f50443y.setScaleY(scaleX);
                    this.f50443y.setTranslationX(width);
                    float f14 = max - f13;
                    this.f50443y.setTranslationY(f14);
                    this.I.setAlpha(c8.l9.a(org.telegram.messenger.g0.z1(a10, 0.75f, 1.0f), 0.0f, 1.0f) * f10);
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
        this.M.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29786y6));
        this.d.W();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, themedColor), themedColor}));
        }
        this.f50430c.invalidate();
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
        this.f50430c.y0(0);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public o31(Bundle bundle) {
        super(bundle);
        this.f50426a = new te.a(0, this, org.telegram.ui.Components.lr.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.f50431c0 = new ArrayList();
        this.f50436f0 = -1;
        this.f50437g0 = true;
    }

    @Override
    public final void U() {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
