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
public final class m31 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.i30, ie0, te.b {
    public k0 D;
    public f31 E;
    public org.telegram.ui.Components.w8 F;
    public org.telegram.ui.Components.l9 G;
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
    public ab.b0 R;
    public int S;
    public boolean T;
    public ValueAnimator U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final te.a f47638a;
    public float f47639a0;
    public v8 f47640b;
    public final ArrayList f47641b0;
    public org.telegram.ui.Components.q41 f47642c;
    public int f47643c0;
    public org.telegram.ui.ActionBar.f5 d;
    public int f47644d0;
    public org.telegram.ui.ActionBar.f5 f47645e;
    public int f47646e0;
    public e31 f47647f;
    public boolean f47648f0;
    public org.telegram.ui.Components.j30 h;
    public AnimatorSet f47649n;
    public org.telegram.ui.Cells.b4 f47650r;
    public TLRPC.FileLocation f47651s;
    public TLRPC.FileLocation f47652w;
    public FrameLayout f47653x;
    public FrameLayout f47654y;

    public m31() {
        this(null);
    }

    public static boolean Z(m31 m31Var, org.telegram.ui.Components.x31 x31Var, View view) {
        String str;
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            hi.a3.n(m31Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new a31(m31Var, 2));
            return true;
        }
        if (x31Var.H(org.telegram.ui.Cells.t6.class)) {
            Object obj2 = x31Var.G;
            if (obj2 instanceof sw0) {
                str = ((sw0) obj2).h;
            } else if (obj2 instanceof org.telegram.messenger.cp) {
                str = ((org.telegram.messenger.cp) obj2).f21914c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(m31Var, view);
                H.c(2131232204, org.telegram.messenger.id.M0(2131751762, null), new by0(8, m31Var, str), false);
                H.W(m31Var.f47642c.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void a0(m31 m31Var) {
        boolean z9;
        TLRPC.User a22 = org.telegram.messenger.qp.s1(m31Var.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(m31Var.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.p10.i(m31Var.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.j30 j30Var = m31Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z9 = true;
        } else {
            z9 = false;
        }
        j30Var.n(z9, new a31(m31Var, 0), new fi.d1(6), 0);
    }

    public static void b0(m31 m31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.G1, m31Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(m31Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f25802b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.f25799a;
            b02.getMessagesStorage().f26719a.c(new org.telegram.messenger.hk(b02.f25810e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static void c0(m31 m31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(m31Var.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(m31Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new h50(28, m31Var, tL_attachMenuBot), 66);
    }

    public static void d0(m31 m31Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize x10;
        m31Var.f47646e0 = -1;
        if (tL_error == null) {
            TLRPC.User a22 = m31Var.getMessagesController().a2(Long.valueOf(m31Var.getUserConfig().e()));
            if (a22 == null) {
                a22 = m31Var.getUserConfig().f();
                if (a22 == null) {
                    return;
                }
                m31Var.getMessagesController().X3(a22, false, false);
            } else {
                m31Var.getUserConfig().w(a22);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f26980id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && m31Var.f47651s != null) {
                org.telegram.messenger.w7.G(m31Var.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(m31Var.currentAccount);
                org.telegram.messenger.w7.J(m31Var.f47651s, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m31Var.f47651s.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(m31Var.f47651s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@90_90", sb3), org.telegram.messenger.hc.m(m31Var.currentAccount, 1, a22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(m31Var.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && m31Var.f47652w != null) {
                org.telegram.messenger.w7.G(m31Var.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(m31Var.currentAccount);
                org.telegram.messenger.w7.J(m31Var.f47652w, null, true, true).renameTo(J2);
            }
            m31Var.getMessagesController().U0(a22.f27105id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            m31Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = m31Var.getMessagesController().b2(m31Var.getUserConfig().e());
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                m31Var.getMessagesStorage().j2(b22, false);
            }
            m31Var.m0(a22);
        }
        m31Var.f47651s = null;
        m31Var.f47652w = null;
        m31Var.n0(false, true);
        m31Var.getNotificationCenter().k(org.telegram.messenger.qs.f25063r, Integer.valueOf(org.telegram.messenger.qp.C8));
        m31Var.getNotificationCenter().k(org.telegram.messenger.qs.f25020j0, new Object[0]);
        m31Var.getUserConfig().v(true);
    }

    public static void e0(m31 m31Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            m31Var.f47651s = fileLocation;
            m31Var.f47652w = photoSize2.location;
            m31Var.G.j(org.telegram.messenger.hc.e(fileLocation), "90_90", m31Var.F, null);
            m31Var.n0(true, false);
        } else if (m31Var.f47651s == null) {
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
            m31Var.f47646e0 = m31Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new h50(29, m31Var, str));
        }
        m31Var.simpleActionBar.o().requestLayout();
    }

    public static void f0(m31 m31Var, ArrayList arrayList) {
        boolean z9;
        SpannableStringBuilder spannableStringBuilder;
        int i7;
        String str;
        int i10;
        String str2;
        int i11 = 0;
        if (m31Var.d.w()) {
            arrayList.add(org.telegram.ui.Components.x31.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            e31 e31Var = m31Var.f47647f;
            ArrayList arrayList2 = e31Var.d;
            ArrayList arrayList3 = e31Var.f50164w;
            if (e31Var.f50165x) {
                ArrayList arrayList4 = e31Var.f50162r;
                int size = arrayList4.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    int i14 = org.telegram.ui.Cells.t6.f30527b;
                    org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(org.telegram.ui.Cells.t6.class);
                    K.f40180l = (CharSequence) e31Var.f50161n.get(i12);
                    K.G = (sw0) obj;
                    arrayList.add(K);
                    i12++;
                }
                if (!e31Var.f50163s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.x31.r(org.telegram.messenger.id.M0(2131745485, null)));
                    ArrayList arrayList5 = e31Var.f50163s;
                    int size2 = arrayList5.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList5.get(i11);
                        i11++;
                        int i15 = org.telegram.ui.Cells.t6.f30527b;
                        org.telegram.ui.Components.x31 K2 = org.telegram.ui.Components.x31.K(org.telegram.ui.Cells.t6.class);
                        K2.f40180l = (CharSequence) e31Var.f50161n.get(i12);
                        K2.G = (org.telegram.messenger.cp) obj2;
                        arrayList.add(K2);
                        i12++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.x31.r(org.telegram.messenger.id.M0(2131745472, null)));
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList3.get(i16);
                    i16++;
                    if (obj3 instanceof sw0) {
                        sw0 sw0Var = (sw0) obj3;
                        String str3 = sw0Var.f49847a;
                        int i17 = org.telegram.ui.Cells.t6.f30527b;
                        org.telegram.ui.Components.x31 K3 = org.telegram.ui.Components.x31.K(org.telegram.ui.Cells.t6.class);
                        K3.f40180l = str3;
                        K3.G = sw0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.cp) {
                        org.telegram.messenger.cp cpVar = (org.telegram.messenger.cp) obj3;
                        String str4 = cpVar.f21912a;
                        int i18 = org.telegram.ui.Cells.t6.f30527b;
                        org.telegram.ui.Components.x31 K4 = org.telegram.ui.Components.x31.K(org.telegram.ui.Cells.t6.class);
                        K4.f40180l = str4;
                        K4.G = cpVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.x31.r(org.telegram.messenger.id.M0(2131745485, null)));
                int size4 = arrayList2.size();
                while (i11 < size4) {
                    Object obj4 = arrayList2.get(i11);
                    i11++;
                    org.telegram.messenger.cp cpVar2 = (org.telegram.messenger.cp) obj4;
                    String str5 = cpVar2.f21912a;
                    int i19 = org.telegram.ui.Cells.t6.f30527b;
                    org.telegram.ui.Components.x31 K5 = org.telegram.ui.Components.x31.K(org.telegram.ui.Cells.t6.class);
                    K5.f40180l = str5;
                    K5.G = cpVar2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.x31.n(m31Var.f47653x, 188));
        m31Var.f47641b0.clear();
        for (int i20 = 0; i20 < 4; i20++) {
            if (org.telegram.messenger.p10.i(i20).p() && m31Var.currentAccount != i20) {
                m31Var.f47641b0.add(Integer.valueOf(i20));
            }
        }
        Collections.sort(m31Var.f47641b0, new un0(3));
        Set set = m31Var.getMessagesController().S3;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(k31.i(org.telegram.messenger.id.M0(2131749527, null), org.telegram.messenger.id.M0(2131749528, null), null, null, org.telegram.messenger.id.M0(2131749529, null), new b31(m31Var, 0)));
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && m31Var.getUserConfig().f() != null) {
            arrayList.add(k31.i(org.telegram.messenger.id.a0(null, null, 2131752156, org.telegram.messenger.k5.i(new StringBuilder("+"), m31Var.getUserConfig().f().phone, pf.b.c())), org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752155, null), new a31(m31Var, 1)), org.telegram.messenger.id.M0(2131752153, null), new b31(m31Var, 1), bi.k7.g2(org.telegram.messenger.id.M0(2131752151, null)), new b31(m31Var, 2)));
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(k31.i(org.telegram.messenger.id.M0(2131742806, null), org.telegram.messenger.id.M0(2131742805, null), org.telegram.messenger.id.M0(2131742804, null), new b31(m31Var, 3), org.telegram.messenger.id.M0(2131742803, null), new b31(m31Var, 4)));
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        }
        if (m31Var.f47641b0.size() > 0) {
            arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131745495, null)));
            for (int i21 = 0; i21 < m31Var.f47641b0.size(); i21++) {
                int intValue = ((Integer) m31Var.f47641b0.get(i21)).intValue();
                int i22 = g31.f45775b;
                org.telegram.ui.Components.x31 K6 = org.telegram.ui.Components.x31.K(g31.class);
                K6.d = i21;
                K6.f40193z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        }
        if (m31Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && ((org.telegram.messenger.h0) m31Var.getMessagesController().f24942x7.f24446j0.f13889b).f22780c) {
            org.telegram.ui.Wallet.m0 x10 = org.telegram.ui.Wallet.m0.x(m31Var.currentAccount);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                i10 = 2131232720;
            } else {
                i10 = 2131232719;
            }
            CharSequence M0 = org.telegram.messenger.id.M0(2131743197, null);
            int i23 = org.telegram.ui.Cells.m8.V;
            if (ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).getCurrentTime() - 1790679020 <= 2419200) {
                M0 = org.telegram.ui.Cells.m8.b(M0);
            }
            CharSequence charSequence = M0;
            if (x10.v() > 0) {
                str2 = org.telegram.ui.Wallet.m0.o(x10.v(), false);
            } else {
                str2 = null;
            }
            arrayList.add(i31.i(25, 0, 0, i10, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        }
        arrayList.add(i31.i(1, -14899731, -15431455, 2131232696, org.telegram.messenger.id.M0(2131745497, null), org.telegram.messenger.id.M0(2131745496, null), null));
        arrayList.add(i31.i(2, -1007845, -1996271, 2131232702, org.telegram.messenger.id.M0(2131745493, null), org.telegram.messenger.id.M0(2131745492, null), null));
        arrayList.add(i31.i(3, -11154873, -14175180, 2131232716, org.telegram.messenger.id.M0(2131745474, null), org.telegram.messenger.id.M0(2131745473, null), null));
        arrayList.add(i31.i(5, -765355, -2148011, 2131232717, org.telegram.messenger.id.M0(2131745478, null), org.telegram.messenger.id.M0(2131745477, null), null));
        arrayList.add(i31.i(6, -11565578, -13276952, 2131232703, org.telegram.messenger.id.M0(2131745491, null), org.telegram.messenger.id.M0(2131745490, null), null));
        arrayList.add(i31.i(7, -14899731, -15497247, 2131232707, org.telegram.messenger.id.M0(2131745484, null), org.telegram.messenger.id.M0(2131745483, null), null));
        arrayList.add(i31.i(8, -13451058, -14836538, 2131232704, org.telegram.messenger.id.M0(2131745488, null), org.telegram.messenger.id.M0(2131745487, null), null));
        arrayList.add(i31.i(9, -881871, -1940716, 2131232714, org.telegram.messenger.id.M0(2131745476, null), org.telegram.messenger.id.M0(2131745475, null), null));
        arrayList.add(i31.i(10, -3903756, -6335009, 2131232712, org.telegram.messenger.id.M0(2131745481, null), org.telegram.messenger.id.j0(), null));
        arrayList.add(org.telegram.ui.Components.x31.C(null));
        if (!z9 && ((org.telegram.messenger.h0) m31Var.getMessagesController().f24942x7.f24446j0.f13889b).f22780c) {
            org.telegram.ui.Wallet.m0 x11 = org.telegram.ui.Wallet.m0.x(m31Var.currentAccount);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                i7 = 2131232720;
            } else {
                i7 = 2131232719;
            }
            CharSequence M02 = org.telegram.messenger.id.M0(2131743197, null);
            int i24 = org.telegram.ui.Cells.m8.V;
            if (ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).getCurrentTime() - 1790679020 <= 2419200) {
                M02 = org.telegram.ui.Cells.m8.b(M02);
            }
            CharSequence charSequence2 = M02;
            if (x11.v() > 0) {
                str = org.telegram.ui.Wallet.m0.o(x11.v(), false);
            } else {
                str = null;
            }
            arrayList.add(i31.i(25, 0, 0, i7, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        }
        if (!m31Var.getMessagesController().D3()) {
            arrayList.add(i31.i(11, -4826625, -10388225, 2131232715, org.telegram.messenger.id.M0(2131744234, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!m31Var.getMessagesController().f24817j7) {
            bi.ea y10 = bi.ea.y(m31Var.currentAccount, false);
            long j3 = y10.p().amount;
            String M03 = org.telegram.messenger.id.M0(2131744218, null);
            if (!y10.f3810e || j3 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = bi.dd.M0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(i31.i(12, -1071598, -1608430, 2131232718, M03, null, spannableStringBuilder));
        }
        bi.ea.y(m31Var.currentAccount, true).p();
        org.telegram.messenger.t0.n();
        bi.ea y11 = bi.ea.y(m31Var.currentAccount, true);
        long j10 = y11.p().amount;
        String M04 = org.telegram.messenger.id.M0(2131749516, null);
        if (y11.f3810e && j10 > 0) {
            charSequence3 = bi.dd.M0(y11.p(), 0.85f, ' ');
        }
        arrayList.add(i31.i(13, -14965523, -15431455, 2131231125, M04, null, charSequence3));
        if (!m31Var.getMessagesController().D3()) {
            arrayList.add(i31.i(15, -765355, -2148011, 2131232699, org.telegram.messenger.id.M0(2131744255, null), null, null));
        }
        if (!m31Var.getMessagesController().h7) {
            arrayList.add(i31.i(16, -816335, -1940716, 2131232708, org.telegram.messenger.id.M0(2131745642, null), null, null));
        }
        if (((org.telegram.ui.Components.x31) jg.g.i(1, arrayList)).f54532a != 7) {
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        }
        arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131745482, null)));
        arrayList.add(i31.i(17, -1007845, -1996271, 2131232698, org.telegram.messenger.id.M0(2131753986, null), null, null));
        arrayList.add(i31.i(18, -14965523, -15431455, 2131232705, org.telegram.messenger.id.M0(2131744245, null), null, null));
        arrayList.add(i31.i(23, -3903756, -6335009, 2131232706, org.telegram.messenger.id.M0(2131744242, null), null, null));
        arrayList.add(i31.i(19, -11154873, -14175180, 2131232713, org.telegram.messenger.id.M0(2131746784, null), null, null));
        xi.a aVar = xi.e.f58857a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.x31.C(null));
            arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131745486, null)));
            arrayList.add(i31.i(24, -765355, -2148011, 0, org.telegram.messenger.id.M0(2131745988, null), null, null));
            arrayList.add(i31.i(26, -11154873, -14175180, 0, org.telegram.messenger.id.M0(2131753919, null), null, null));
            arrayList.add(i31.i(27, -12743701, -13996071, 0, org.telegram.messenger.id.M0(2131749331, null), null, null));
        }
        if (org.telegram.messenger.r2.f25212a) {
            arrayList.add(org.telegram.ui.Components.x31.C(null));
            arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131745489, null)));
            arrayList.add(i31.i(20, -11154873, -14175180, 0, org.telegram.messenger.id.M0(2131751614, null), null, null));
            arrayList.add(i31.i(21, -11154873, -14175180, 0, org.telegram.messenger.id.M0(2131751615, null), null, null));
            arrayList.add(i31.i(22, -765355, -2148011, 0, org.telegram.messenger.id.M0(2131751651, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.x31.m(m31Var.M));
    }

    public static void h0(m31 m31Var, org.telegram.ui.Components.x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.G0(LaunchActivity.G1, m31Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                wc1.a(m31Var.getParentActivity(), new org.telegram.ui.Components.fx(25, m31Var, tL_attachMenuBot), null);
            }
        } else if (x31Var.H(g31.class)) {
            int i7 = x31Var.f40193z;
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.O0(i7);
            }
        } else if (x31Var.H(org.telegram.ui.Cells.t6.class)) {
            Object obj2 = x31Var.G;
            if (obj2 instanceof sw0) {
                sw0 sw0Var = (sw0) obj2;
                org.telegram.ui.ActionBar.q4 parentLayout = m31Var.getParentLayout();
                sw0Var.f49848b.run();
                org.telegram.messenger.g0.k3(parentLayout, sw0Var.f49849c);
            } else if (obj2 instanceof org.telegram.messenger.cp) {
                org.telegram.messenger.qs.f(m31Var.currentAccount).k(org.telegram.messenger.qs.f24980c1, m31Var.f47647f.E, ((org.telegram.messenger.cp) obj2).f21914c);
            }
            Object obj3 = x31Var.G;
            if (obj3 != null) {
                m31Var.f47647f.E(obj3);
            }
        } else {
            switch (x31Var.d) {
                case 1:
                    m31Var.k0(new UserInfoActivity());
                    return;
                case 2:
                    m31Var.k0(new ThemeActivity(0));
                    return;
                case 3:
                    m31Var.k0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    m31Var.k0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    m31Var.k0(new DataSettingsActivity());
                    return;
                case 7:
                    m31Var.k0(new FiltersSetupActivity());
                    return;
                case 8:
                    m31Var.k0(new SessionsActivity(0));
                    return;
                case 9:
                    m31Var.k0(new w90());
                    return;
                case 10:
                    m31Var.k0(new LanguageSelectActivity());
                    return;
                case 11:
                    m31Var.k0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    m31Var.k0(new bi.dd());
                    return;
                case 13:
                    m31Var.k0(new gi.f());
                    return;
                case 15:
                    m31Var.k0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    wg.f1.l1(0, org.telegram.messenger.v1.a(org.telegram.messenger.p10.f24470s0).b());
                    return;
                case 17:
                    m31Var.showDialog(org.telegram.ui.Components.v4.R(m31Var, m31Var.resourceProvider));
                    return;
                case 18:
                    vf.c.t(m31Var.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                    return;
                case 19:
                    vf.c.t(m31Var.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
                    return;
                case 20:
                    ProfileActivity.V4(m31Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.V4(m31Var.getParentActivity(), true);
                    return;
                case 22:
                    org.telegram.messenger.a8.a();
                    return;
                case 23:
                    if (org.telegram.messenger.qp.s1(m31Var.currentAccount).v2()) {
                        b.b(m31Var.currentAccount);
                        return;
                    } else {
                        vf.c.t(m31Var.getParentActivity(), org.telegram.messenger.id.M0(2131744241, null));
                        return;
                    }
                case 24:
                    m31Var.presentFragment(new xy0(0, null));
                    return;
                case 25:
                    m31Var.k0(new org.telegram.ui.Wallet.x5());
                    return;
                case 26:
                    m31Var.presentFragment(new xy0(1, null));
                    return;
                case 27:
                    ?? n41Var = new org.telegram.ui.Components.n41();
                    n41Var.f47961e = true;
                    m31Var.presentFragment((org.telegram.ui.ActionBar.f2) n41Var);
                    return;
            }
        }
    }

    @Override
    public final ri.f B() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21122a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void H(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.f47650r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        org.telegram.ui.Cells.b4 b4Var = this.f47650r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            j0();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f47640b = new v8(9, context, this);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.f47648f0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745498, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 11));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.e5 o4 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.f5 b10 = o4.b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 21);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        org.telegram.ui.ActionBar.f5 b11 = o4.b(1, 2131231244);
        this.f47645e = b11;
        b11.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        this.f47645e.e(2, 2131232195, org.telegram.messenger.id.M0(2131748744, null));
        e31 e31Var = new e31(this, this, context);
        this.f47647f = e31Var;
        e31Var.G();
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(this, new a5(this, 27), new c31(this), new c31(this));
        this.f47642c = q41Var;
        q41Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.q41 q41Var2 = this.f47642c;
        q41Var2.f37190f3.f35528r = false;
        q41Var2.r1();
        this.f47642c.setSectionsDrawBackground(true);
        oi.a.e(this.f47642c, 0, 0, org.telegram.messenger.g0.L(12.0f), this.f47644d0);
        this.f47642c.setClipToPadding(false);
        this.f47642c.j(new b21(this, 1));
        this.f47640b.addView(this.f47642c, c8.ha.e(-1, -1, 119));
        View view = new View(context);
        this.P = view;
        view.setBackground(getBaseSimpleGlass().a(this.P));
        this.f47640b.addView(this.P, c8.ha.e(-1, 0, 48));
        this.f47640b.addView(this.simpleActionBar, c8.ha.e(-1, -2, 55));
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
        this.h = j30Var;
        j30Var.H = true;
        j30Var.f34879a = this;
        j30Var.f34880b = this;
        this.f47653x = new FrameLayout(context);
        k0 k0Var = new k0(25, context, this);
        this.D = k0Var;
        this.f47653x.addView(k0Var, c8.ha.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.D.setOnClickListener(new b31(this, 5));
        c8.ka.a(this.D);
        this.f47653x.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view2, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                m31.this.p0();
            }
        });
        this.E = new org.telegram.ui.Components.wf0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47654y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.f47654y.setPivotY(0.0f);
        this.E.addView(this.f47654y, c8.ha.e(90, 90, 51));
        v8 v8Var = this.f47640b;
        v8Var.addView(this.E, v8Var.indexOfChild(this.f47642c) + 1, c8.ha.c(-1.0f, -1));
        this.F = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.G = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(90.0f));
        this.f47654y.addView(this.G, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Cells.b4 b4Var = new org.telegram.ui.Cells.b4(this, context);
        this.f47650r = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.f47650r.setProgressColor(-1);
        this.f47650r.setNoProgress(false);
        this.f47654y.addView(this.f47650r, c8.ha.c(-1.0f, -1));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        int L = org.telegram.messenger.g0.L(32.0f);
        int i7 = org.telegram.ui.ActionBar.k6.f27796a7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, getThemedColor(i7));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, resourceProvider);
        this.H.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.I = frameLayout3;
        int L3 = org.telegram.messenger.g0.L(30.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L4 = org.telegram.ui.ActionBar.k6.L(L3, getThemedColor(i10));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.f6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(L4);
        org.telegram.ui.ActionBar.r6.k(frameLayout3, L4, N2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.J.setImageResource(2131231146);
        this.I.addView(this.J, c8.ha.e(22, 22, 17));
        this.H.addView(this.I, c8.ha.c(30.0f, 30));
        this.H.setPivotX(0.0f);
        this.H.setPivotY(0.0f);
        v8 v8Var2 = this.f47640b;
        v8Var2.addView(this.H, v8Var2.indexOfChild(this.E) + 1, c8.ha.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.K = textView;
        textView.setTextSize(1, 22.0f);
        this.K.setTypeface(org.telegram.messenger.g0.o());
        this.K.setGravity(17);
        this.K.setSingleLine();
        TextView textView2 = this.K;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView i11 = org.telegram.ui.Cells.f1.i(this.f47653x, this.K, c8.ha.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.L = i11;
        i11.setTextSize(1, 13.0f);
        this.L.setGravity(17);
        this.L.setSingleLine();
        this.L.setEllipsize(truncateAt);
        TextView i12 = org.telegram.ui.Cells.f1.i(this.f47653x, this.L, c8.ha.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.M = i12;
        i12.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(this.M, org.telegram.ui.ActionBar.k6.B6, getResourceProvider());
        this.M.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
        this.M.setGravity(17);
        TextView textView3 = this.M;
        int i13 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i13), 2, -1), null, org.telegram.ui.ActionBar.r6.N(i13), getResourceProvider());
        this.M.setOnClickListener(new b31(this, 6));
        this.O = new View(context);
        o0(true, false);
        this.f47642c.f37190f3.O(false);
        m0(getUserConfig().f());
        q0();
        j0();
        this.simpleActionBar.setBackground(null);
        int i14 = this.mSystemInsets.f15121b;
        if (this.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.P.setLayoutParams(layoutParams);
            }
        }
        o0(true, false);
        v8 v8Var3 = this.f47640b;
        c31 c31Var = new c31(this);
        WeakHashMap weakHashMap = r0.i0.f54191a;
        r0.a0.i(v8Var3, c31Var);
        v8 v8Var4 = this.f47640b;
        this.fragmentView = v8Var4;
        return v8Var4;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.q41 q41Var;
        if (i7 == org.telegram.messenger.qs.f25114y3) {
            m0(getUserConfig().f());
            org.telegram.ui.Components.q41 q41Var2 = this.f47642c;
            if (q41Var2 != null) {
                q41Var2.f37190f3.O(true);
            }
        } else if (i7 == org.telegram.messenger.qs.f25063r) {
            m0(getUserConfig().f());
        } else if (i7 == org.telegram.messenger.qs.f25072s1 && (q41Var = this.f47642c) != null) {
            q41Var.f37190f3.O(true);
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
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f47642c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f47638a.f55488f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.y4 y4Var;
        boolean z9;
        int i7;
        int i10;
        if (this.N && (z9 = (y4Var = this.simpleActionBar).F) != this.f47648f0) {
            this.f47648f0 = z9;
            if (z9) {
                i7 = 2131231240;
            } else {
                i7 = 2131232485;
            }
            y4Var.setBackButtonImageAnimated(i7);
            org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
            if (z9) {
                i10 = 2131754878;
            } else {
                i10 = 2131746501;
            }
            y4Var2.setBackButtonContentDescription(org.telegram.messenger.id.M0(i10, null));
        }
    }

    @Override
    public final ri.f k() {
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (oi.q.f().f21122a) {
            return baseSimpleGlass.f21025i;
        }
        return null;
    }

    public final void k0(org.telegram.ui.ActionBar.f2 f2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (launchActivity = LaunchActivity.G1) != null && (actionBarLayout = launchActivity.f41283q0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.d0((org.telegram.ui.ActionBar.f2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.o4 o4Var = new org.telegram.ui.ActionBar.o4(f2Var);
            o4Var.f28344c = true;
            o4Var.f28347g = true;
            actionBarLayout.U(o4Var);
            return;
        }
        presentFragment(f2Var);
    }

    public final void l0(float f10) {
        this.simpleActionBar.setTitlesAlpha(f10);
        View view = this.P;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    public final void m0(TLRPC.User user) {
        String str;
        if (this.G == null || this.f47646e0 != -1) {
            return;
        }
        this.F.r(user);
        this.G.e(user, this.F);
        this.K.setText(org.telegram.messenger.t10.p(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(pf.b.c().b("+" + user.phone));
        }
        String n10 = org.telegram.messenger.t10.n(user);
        if (n10 != null) {
            sb2.append(" • @");
            sb2.append(n10);
        }
        this.L.setText(sb2);
        TextView textView = this.M;
        String str2 = null;
        try {
            PackageInfo packageInfo = org.telegram.messenger.t0.f25566b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25566b.getPackageName(), 0);
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
            str2 = org.telegram.messenger.id.a0(null, null, 2131744213, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        textView.setText(str2);
    }

    public final void n0(boolean z9, boolean z10) {
        if (this.f47650r == null) {
            return;
        }
        AnimatorSet animatorSet = this.f47649n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f47649n = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f47649n = animatorSet2;
            if (z9) {
                this.f47650r.setVisibility(0);
                this.f47649n.playTogether(ObjectAnimator.ofFloat(this.f47650r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f47650r, View.ALPHA, 0.0f));
            }
            this.f47649n.setDuration(180L);
            this.f47649n.addListener(new z40(9, this, z9));
            this.f47649n.start();
        } else if (z9) {
            this.f47650r.setAlpha(1.0f);
            this.f47650r.setVisibility(0);
        } else {
            this.f47650r.setAlpha(0.0f);
            this.f47650r.setVisibility(4);
        }
    }

    public final void o0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m31.o0(boolean, boolean):void");
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var.F) {
            if (z9) {
                y4Var.j(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        ab.b0 b0Var = this.R;
        if (b0Var != null) {
            b0Var.b();
            this.R = null;
        }
        ab.b0 b0Var2 = new ab.b0(org.telegram.messenger.qs.e(), this);
        b0Var2.c(org.telegram.messenger.qs.f25063r);
        b0Var2.c(org.telegram.messenger.qs.f25114y3);
        b0Var2.c(org.telegram.messenger.qs.f25072s1);
        this.R = b0Var2;
        Bundle bundle = this.arguments;
        int i7 = 0;
        if (bundle != null) {
            this.N = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.N) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        }
        this.f47644d0 = i7;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ab.b0 b0Var = this.R;
        if (b0Var != null) {
            b0Var.b();
            this.R = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.l41 l41Var = this.f47642c.f37190f3;
        if (l41Var != null) {
            l41Var.O(false);
        }
    }

    public final void p0() {
        if (this.E != null && this.f47654y != null) {
            float height = this.D.getHeight() / 2.0f;
            View view = this.D;
            float f10 = 1.0f;
            while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
                height += view.getY();
                f10 *= view.getAlpha();
                view = (View) view.getParent();
            }
            if (view == this.fragmentView && this.D.isAttachedToWindow() && this.D.getHeight() != 0) {
                float f11 = 0.0f;
                for (View view2 = this.f47653x; view2 != null && view2 != this.f47642c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    f11 += view2.getY();
                }
                float paddingTop = (height - f11) + this.f47642c.getPaddingTop();
                f31 f31Var = this.E;
                float f12 = -org.telegram.messenger.g0.L(16.0f);
                org.telegram.messenger.bs bsVar = f31Var.f39921n;
                if (bsVar != null && bsVar.f21727c) {
                    f12 = bsVar.f21728e.centerY();
                }
                float a10 = c8.j9.a((height - f12) / Math.max(1.0f, paddingTop - f12), 0.0f, 1.0f);
                float max = Math.max(height, f12);
                this.Y = height;
                this.Z = paddingTop;
                this.f47639a0 = f12;
                float L = org.telegram.messenger.g0.L(90.0f);
                float scaleX = this.D.getScaleX() * (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(this.E.getHiddenAvatarSizeDp()), L, a10) / L);
                float f13 = (L * scaleX) / 2.0f;
                float width = (this.E.getWidth() / 2.0f) - f13;
                if (max != this.V || scaleX != this.W || a10 != this.X || f10 != this.E.getAlpha() || width != this.f47654y.getTranslationX()) {
                    this.V = max;
                    this.W = scaleX;
                    this.X = a10;
                    this.E.setAlpha(f10);
                    this.f47654y.setScaleX(scaleX);
                    this.f47654y.setScaleY(scaleX);
                    this.f47654y.setTranslationX(width);
                    float f14 = max - f13;
                    this.f47654y.setTranslationY(f14);
                    this.H.setAlpha(c8.j9.a(org.telegram.messenger.g0.z1(a10, 0.75f, 1.0f), 0.0f, 1.0f) * f10);
                    this.H.setScaleX(scaleX);
                    this.H.setScaleY(scaleX);
                    this.H.setTranslationX((org.telegram.messenger.g0.L(60.0f) * scaleX) + width);
                    this.H.setTranslationY((org.telegram.messenger.g0.L(60.0f) * scaleX) + f14);
                    this.E.setHideProgress(1.0f - a10);
                }
            } else if (this.X != 0.0f) {
                this.X = 0.0f;
                this.E.setHideProgress(1.0f);
                this.H.setAlpha(0.0f);
            }
        }
    }

    public final void q0() {
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28244y6));
        this.d.V();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6);
        if (this.O.getBackground() == null || themedColor != this.S) {
            this.S = themedColor;
            this.O.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor}));
        }
        this.f47642c.invalidate();
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
        this.f47642c.y0(0);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public m31(Bundle bundle) {
        super(bundle);
        this.f47638a = new te.a(0, this, org.telegram.ui.Components.xq.h, 350L, false);
        this.Q = 0;
        this.X = -1.0f;
        this.f47641b0 = new ArrayList();
        this.f47646e0 = -1;
        this.f47648f0 = true;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
