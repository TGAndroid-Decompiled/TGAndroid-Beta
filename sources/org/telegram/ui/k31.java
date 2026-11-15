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
public final class k31 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, org.telegram.ui.Components.l30, ie0, te.b {
    public k0 E;
    public d31 F;
    public org.telegram.ui.Components.t8 G;
    public org.telegram.ui.Components.i9 H;
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
    public final te.a f48515a;
    public float f48516a0;
    public v8 f48517b;
    public float f48518b0;
    public org.telegram.ui.Components.u41 f48519c;
    public final ArrayList f48520c0;
    public org.telegram.ui.ActionBar.d5 d;
    public int f48521d0;
    public org.telegram.ui.ActionBar.d5 f48522e;
    public int f48523e0;
    public c31 f48524f;
    public int f48525f0;
    public boolean f48526g0;
    public org.telegram.ui.Components.m30 h;
    public AnimatorSet f48527n;
    public org.telegram.ui.Cells.b4 f48528r;
    public TLRPC.FileLocation f48529s;
    public TLRPC.FileLocation f48530w;
    public FrameLayout f48531x;
    public FrameLayout f48532y;

    public k31() {
        this(null);
    }

    public static boolean Z(k31 k31Var, org.telegram.ui.Components.b41 b41Var, View view) {
        String str;
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ki.x2.n(k31Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new y21(k31Var, 2));
            return true;
        }
        if (b41Var.H(org.telegram.ui.Cells.s6.class)) {
            Object obj2 = b41Var.G;
            if (obj2 instanceof rw0) {
                str = ((rw0) obj2).h;
            } else if (obj2 instanceof org.telegram.messenger.zo) {
                str = ((org.telegram.messenger.zo) obj2).f27992c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(k31Var, view);
                H.c(2131232205, org.telegram.messenger.hd.M0(2131751762, null), new fy0(5, k31Var, str), false);
                H.W(k31Var.f48519c.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void a0(k31 k31Var) {
        boolean z10;
        TLRPC.User a22 = org.telegram.messenger.np.s1(k31Var.currentAccount).a2(Long.valueOf(org.telegram.messenger.m10.i(k31Var.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.m10.i(k31Var.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.m30 m30Var = k31Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        m30Var.n(z10, new y21(k31Var, 0), new hi.f1(6), 0);
    }

    public static void b0(k31 k31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, k31Var.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(k31Var.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f26471b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.f26468a;
            b02.getMessagesStorage().f27219a.c(new org.telegram.messenger.fk(b02.f26479e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static void c0(k31 k31Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.s1(k31Var.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(k31Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new a31(0, k31Var, tL_attachMenuBot), 66);
    }

    public static void d0(k31 k31Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize x10;
        k31Var.f48525f0 = -1;
        if (tL_error == null) {
            TLRPC.User a22 = k31Var.getMessagesController().a2(Long.valueOf(k31Var.getUserConfig().e()));
            if (a22 == null) {
                a22 = k31Var.getUserConfig().f();
                if (a22 == null) {
                    return;
                }
                k31Var.getMessagesController().X3(a22, false, false);
            } else {
                k31Var.getUserConfig().w(a22);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28075id;
            if (w10 != null) {
                tL_userProfilePhoto.photo_small = w10.location;
            }
            if (w11 != null) {
                tL_userProfilePhoto.photo_big = w11.location;
            }
            if (w10 != null && k31Var.f48529s != null) {
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                org.telegram.messenger.w7.J(k31Var.f48529s, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k31Var.f48529s.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(k31Var.f48529s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.fc.D().S(n10, a8.p0.n(w10.location.local_id, "@90_90", sb3), org.telegram.messenger.gc.m(k31Var.currentAccount, 1, a22));
            }
            if (x10 != null && str != null) {
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                new File(str).renameTo(org.telegram.messenger.w7.J(x10, "mp4", true, true));
            } else if (w11 != null && k31Var.f48530w != null) {
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(k31Var.currentAccount);
                org.telegram.messenger.w7.J(k31Var.f48530w, null, true, true).renameTo(J2);
            }
            k31Var.getMessagesController().U0(a22.f28200id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            k31Var.getMessagesStorage().m1(arrayList2, null, false, true);
            TLRPC.UserFull b22 = k31Var.getMessagesController().b2(k31Var.getUserConfig().e());
            if (b22 != null) {
                b22.profile_photo = tL_photos_photo.photo;
                k31Var.getMessagesStorage().j2(b22, false);
            }
            k31Var.m0(a22);
        }
        k31Var.f48529s = null;
        k31Var.f48530w = null;
        k31Var.n0(false, true);
        k31Var.getNotificationCenter().k(org.telegram.messenger.ns.f25560r, Integer.valueOf(org.telegram.messenger.np.D8));
        k31Var.getNotificationCenter().k(org.telegram.messenger.ns.f25517j0, new Object[0]);
        k31Var.getUserConfig().v(true);
    }

    public static void e0(k31 k31Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            k31Var.f48529s = fileLocation;
            k31Var.f48530w = photoSize2.location;
            k31Var.H.j(org.telegram.messenger.gc.e(fileLocation), "90_90", k31Var.G, null);
            k31Var.n0(true, false);
        } else if (k31Var.f48529s == null) {
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
            k31Var.f48525f0 = k31Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new a31(1, k31Var, str));
        }
        k31Var.simpleActionBar.r().requestLayout();
    }

    public static void f0(k31 k31Var, ArrayList arrayList) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i7;
        String str;
        int i10;
        String str2;
        int i11 = 0;
        if (k31Var.d.x()) {
            arrayList.add(org.telegram.ui.Components.b41.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            c31 c31Var = k31Var.f48524f;
            ArrayList arrayList2 = c31Var.d;
            ArrayList arrayList3 = c31Var.f51293w;
            if (c31Var.f51294x) {
                ArrayList arrayList4 = c31Var.f51291r;
                int size = arrayList4.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    int i14 = org.telegram.ui.Cells.s6.f31417b;
                    org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                    K.f33184l = (CharSequence) c31Var.f51290n.get(i12);
                    K.G = (rw0) obj;
                    arrayList.add(K);
                    i12++;
                }
                if (!c31Var.f51292s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(2131745482, null)));
                    ArrayList arrayList5 = c31Var.f51292s;
                    int size2 = arrayList5.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList5.get(i11);
                        i11++;
                        int i15 = org.telegram.ui.Cells.s6.f31417b;
                        org.telegram.ui.Components.b41 K2 = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                        K2.f33184l = (CharSequence) c31Var.f51290n.get(i12);
                        K2.G = (org.telegram.messenger.zo) obj2;
                        arrayList.add(K2);
                        i12++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(2131745469, null)));
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList3.get(i16);
                    i16++;
                    if (obj3 instanceof rw0) {
                        rw0 rw0Var = (rw0) obj3;
                        String str3 = rw0Var.f51039a;
                        int i17 = org.telegram.ui.Cells.s6.f31417b;
                        org.telegram.ui.Components.b41 K3 = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                        K3.f33184l = str3;
                        K3.G = rw0Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof org.telegram.messenger.zo) {
                        org.telegram.messenger.zo zoVar = (org.telegram.messenger.zo) obj3;
                        String str4 = zoVar.f27990a;
                        int i18 = org.telegram.ui.Cells.s6.f31417b;
                        org.telegram.ui.Components.b41 K4 = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                        K4.f33184l = str4;
                        K4.G = zoVar;
                        arrayList.add(K4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(2131745482, null)));
                int size4 = arrayList2.size();
                while (i11 < size4) {
                    Object obj4 = arrayList2.get(i11);
                    i11++;
                    org.telegram.messenger.zo zoVar2 = (org.telegram.messenger.zo) obj4;
                    String str5 = zoVar2.f27990a;
                    int i19 = org.telegram.ui.Cells.s6.f31417b;
                    org.telegram.ui.Components.b41 K5 = org.telegram.ui.Components.b41.K(org.telegram.ui.Cells.s6.class);
                    K5.f33184l = str5;
                    K5.G = zoVar2;
                    arrayList.add(K5);
                }
                return;
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.b41.n(k31Var.f48531x, 188));
        k31Var.f48520c0.clear();
        for (int i20 = 0; i20 < 4; i20++) {
            if (org.telegram.messenger.m10.i(i20).p() && k31Var.currentAccount != i20) {
                k31Var.f48520c0.add(Integer.valueOf(i20));
            }
        }
        Collections.sort(k31Var.f48520c0, new qv0(2));
        Set set = k31Var.getMessagesController().T3;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(i31.i(org.telegram.messenger.hd.M0(2131749526, null), org.telegram.messenger.hd.M0(2131749527, null), null, null, org.telegram.messenger.hd.M0(2131749528, null), new z21(k31Var, 0)));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && k31Var.getUserConfig().f() != null) {
            arrayList.add(i31.i(org.telegram.messenger.hd.a0(null, null, 2131752156, org.telegram.messenger.k5.h(new StringBuilder("+"), k31Var.getUserConfig().f().phone, pf.b.c())), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752155, null), new y21(k31Var, 1)), org.telegram.messenger.hd.M0(2131752153, null), new z21(k31Var, 1), di.c6.h2(org.telegram.messenger.hd.M0(2131752151, null)), new z21(k31Var, 2)));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(i31.i(org.telegram.messenger.hd.M0(2131742803, null), org.telegram.messenger.hd.M0(2131742802, null), org.telegram.messenger.hd.M0(2131742801, null), new z21(k31Var, 3), org.telegram.messenger.hd.M0(2131742800, null), new z21(k31Var, 4)));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        if (k31Var.f48520c0.size() > 0) {
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745492, null)));
            for (int i21 = 0; i21 < k31Var.f48520c0.size(); i21++) {
                int intValue = ((Integer) k31Var.f48520c0.get(i21)).intValue();
                int i22 = e31.f46529b;
                org.telegram.ui.Components.b41 K6 = org.telegram.ui.Components.b41.K(e31.class);
                K6.d = i21;
                K6.f33197z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        if (k31Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && ((org.telegram.messenger.h0) k31Var.getMessagesController().f25451y7.f25854j0.f14544b).f24009c) {
            org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(k31Var.currentAccount);
            if (org.telegram.ui.ActionBar.j6.I.q()) {
                i10 = 2131232721;
            } else {
                i10 = 2131232720;
            }
            CharSequence M0 = org.telegram.messenger.hd.M0(2131743194, null);
            int i23 = org.telegram.ui.Cells.l8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0).getCurrentTime() - 1790679020 <= 2419200) {
                M0 = org.telegram.ui.Cells.l8.b(M0);
            }
            CharSequence charSequence = M0;
            if (x10.v() > 0) {
                str2 = org.telegram.ui.Wallet.l0.o(x10.v(), false);
            } else {
                str2 = null;
            }
            arrayList.add(g31.i(25, 0, 0, i10, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        arrayList.add(g31.i(1, -14899731, -15431455, 2131232697, org.telegram.messenger.hd.M0(2131745494, null), org.telegram.messenger.hd.M0(2131745493, null), null));
        arrayList.add(g31.i(2, -1007845, -1996271, 2131232703, org.telegram.messenger.hd.M0(2131745490, null), org.telegram.messenger.hd.M0(2131745489, null), null));
        arrayList.add(g31.i(3, -11154873, -14175180, 2131232717, org.telegram.messenger.hd.M0(2131745471, null), org.telegram.messenger.hd.M0(2131745470, null), null));
        arrayList.add(g31.i(5, -765355, -2148011, 2131232718, org.telegram.messenger.hd.M0(2131745475, null), org.telegram.messenger.hd.M0(2131745474, null), null));
        arrayList.add(g31.i(6, -11565578, -13276952, 2131232704, org.telegram.messenger.hd.M0(2131745488, null), org.telegram.messenger.hd.M0(2131745487, null), null));
        arrayList.add(g31.i(7, -14899731, -15497247, 2131232708, org.telegram.messenger.hd.M0(2131745481, null), org.telegram.messenger.hd.M0(2131745480, null), null));
        arrayList.add(g31.i(8, -13451058, -14836538, 2131232705, org.telegram.messenger.hd.M0(2131745485, null), org.telegram.messenger.hd.M0(2131745484, null), null));
        arrayList.add(g31.i(9, -881871, -1940716, 2131232715, org.telegram.messenger.hd.M0(2131745473, null), org.telegram.messenger.hd.M0(2131745472, null), null));
        arrayList.add(g31.i(10, -3903756, -6335009, 2131232713, org.telegram.messenger.hd.M0(2131745478, null), org.telegram.messenger.hd.j0(), null));
        arrayList.add(org.telegram.ui.Components.b41.C(null));
        if (!z10 && ((org.telegram.messenger.h0) k31Var.getMessagesController().f25451y7.f25854j0.f14544b).f24009c) {
            org.telegram.ui.Wallet.l0 x11 = org.telegram.ui.Wallet.l0.x(k31Var.currentAccount);
            if (org.telegram.ui.ActionBar.j6.I.q()) {
                i7 = 2131232721;
            } else {
                i7 = 2131232720;
            }
            CharSequence M02 = org.telegram.messenger.hd.M0(2131743194, null);
            int i24 = org.telegram.ui.Cells.l8.W;
            if (ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0).getCurrentTime() - 1790679020 <= 2419200) {
                M02 = org.telegram.ui.Cells.l8.b(M02);
            }
            CharSequence charSequence2 = M02;
            if (x11.v() > 0) {
                str = org.telegram.ui.Wallet.l0.o(x11.v(), false);
            } else {
                str = null;
            }
            arrayList.add(g31.i(25, 0, 0, i7, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        if (!k31Var.getMessagesController().D3()) {
            arrayList.add(g31.i(11, -4826625, -10388225, 2131232716, org.telegram.messenger.hd.M0(2131744231, null), null, null));
        }
        CharSequence charSequence3 = "";
        if (!k31Var.getMessagesController().f25325k7) {
            di.u8 y10 = di.u8.y(k31Var.currentAccount, false);
            long j3 = y10.p().amount;
            String M03 = org.telegram.messenger.hd.M0(2131744215, null);
            if (!y10.f9532e || j3 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = di.lb.M0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(g31.i(12, -1071598, -1608430, 2131232719, M03, null, spannableStringBuilder));
        }
        di.u8.y(k31Var.currentAccount, true).p();
        org.telegram.messenger.t0.n();
        di.u8 y11 = di.u8.y(k31Var.currentAccount, true);
        long j10 = y11.p().amount;
        String M04 = org.telegram.messenger.hd.M0(2131749515, null);
        if (y11.f9532e && j10 > 0) {
            charSequence3 = di.lb.M0(y11.p(), 0.85f, ' ');
        }
        arrayList.add(g31.i(13, -14965523, -15431455, 2131231125, M04, null, charSequence3));
        if (!k31Var.getMessagesController().D3()) {
            arrayList.add(g31.i(15, -765355, -2148011, 2131232700, org.telegram.messenger.hd.M0(2131744252, null), null, null));
        }
        if (!k31Var.getMessagesController().i7) {
            arrayList.add(g31.i(16, -816335, -1940716, 2131232709, org.telegram.messenger.hd.M0(2131745639, null), null, null));
        }
        if (((org.telegram.ui.Components.b41) i5.c.h(1, arrayList)).f56015a != 7) {
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745479, null)));
        arrayList.add(g31.i(17, -1007845, -1996271, 2131232699, org.telegram.messenger.hd.M0(2131753986, null), null, null));
        arrayList.add(g31.i(18, -14965523, -15431455, 2131232706, org.telegram.messenger.hd.M0(2131744242, null), null, null));
        arrayList.add(g31.i(23, -3903756, -6335009, 2131232707, org.telegram.messenger.hd.M0(2131744239, null), null, null));
        arrayList.add(g31.i(19, -11154873, -14175180, 2131232714, org.telegram.messenger.hd.M0(2131746783, null), null, null));
        aj.a aVar = aj.e.f1657a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.b41.C(null));
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745483, null)));
            arrayList.add(g31.i(24, -765355, -2148011, 0, org.telegram.messenger.hd.M0(2131745985, null), null, null));
            arrayList.add(g31.i(26, -11154873, -14175180, 0, org.telegram.messenger.hd.M0(2131753919, null), null, null));
            arrayList.add(g31.i(27, -12743701, -13996071, 0, org.telegram.messenger.hd.M0(2131749330, null), null, null));
        }
        if (org.telegram.messenger.r2.f26206a) {
            arrayList.add(org.telegram.ui.Components.b41.C(null));
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745486, null)));
            arrayList.add(g31.i(20, -11154873, -14175180, 0, org.telegram.messenger.hd.M0(2131751613, null), null, null));
            arrayList.add(g31.i(21, -11154873, -14175180, 0, org.telegram.messenger.hd.M0(2131751614, null), null, null));
            arrayList.add(g31.i(22, -765355, -2148011, 0, org.telegram.messenger.hd.M0(2131751650, null), null, null));
        }
        arrayList.add(org.telegram.ui.Components.b41.m(k31Var.N));
    }

    public static void h0(k31 k31Var, org.telegram.ui.Components.b41 b41Var) {
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.G0(LaunchActivity.H1, k31Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                wc1.a(k31Var.getParentActivity(), new x21(0, k31Var, tL_attachMenuBot), null);
            }
        } else if (b41Var.H(e31.class)) {
            int i7 = b41Var.f33197z;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i7);
            }
        } else if (b41Var.H(org.telegram.ui.Cells.s6.class)) {
            Object obj2 = b41Var.G;
            if (obj2 instanceof rw0) {
                rw0 rw0Var = (rw0) obj2;
                org.telegram.ui.ActionBar.o4 parentLayout = k31Var.getParentLayout();
                rw0Var.f51040b.run();
                org.telegram.messenger.g0.k3(parentLayout, rw0Var.f51041c);
            } else if (obj2 instanceof org.telegram.messenger.zo) {
                org.telegram.messenger.ns.f(k31Var.currentAccount).k(org.telegram.messenger.ns.f25477c1, k31Var.f48524f.F, ((org.telegram.messenger.zo) obj2).f27992c);
            }
            Object obj3 = b41Var.G;
            if (obj3 != null) {
                k31Var.f48524f.E(obj3);
            }
        } else {
            switch (b41Var.d) {
                case 1:
                    k31Var.k0(new UserInfoActivity());
                    return;
                case 2:
                    k31Var.k0(new ThemeActivity(0));
                    return;
                case 3:
                    k31Var.k0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    k31Var.k0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    k31Var.k0(new DataSettingsActivity());
                    return;
                case 7:
                    k31Var.k0(new FiltersSetupActivity());
                    return;
                case 8:
                    k31Var.k0(new SessionsActivity(0));
                    return;
                case 9:
                    k31Var.k0(new x90());
                    return;
                case 10:
                    k31Var.k0(new LanguageSelectActivity());
                    return;
                case 11:
                    k31Var.k0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    k31Var.k0(new di.lb());
                    return;
                case 13:
                    k31Var.k0(new ii.f());
                    return;
                case 15:
                    k31Var.k0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    wg.c1.l1(0, org.telegram.messenger.v1.a(org.telegram.messenger.m10.f24940t0).b());
                    return;
                case 17:
                    k31Var.showDialog(org.telegram.ui.Components.t4.R(k31Var, k31Var.resourceProvider));
                    return;
                case 18:
                    vf.c.t(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                    return;
                case 19:
                    vf.c.t(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                    return;
                case 20:
                    ProfileActivity.X4(k31Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.X4(k31Var.getParentActivity(), true);
                    return;
                case 22:
                    org.telegram.messenger.a8.a();
                    return;
                case 23:
                    if (org.telegram.messenger.np.s1(k31Var.currentAccount).v2()) {
                        b.b(k31Var.currentAccount);
                        return;
                    } else {
                        vf.c.t(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131744238, null));
                        return;
                    }
                case 24:
                    k31Var.presentFragment(new vy0(0, null));
                    return;
                case 25:
                    k31Var.k0(new org.telegram.ui.Wallet.y5());
                    return;
                case 26:
                    k31Var.presentFragment(new vy0(1, null));
                    return;
                case 27:
                    ?? r41Var = new org.telegram.ui.Components.r41();
                    r41Var.f49124e = true;
                    k31Var.presentFragment((org.telegram.ui.ActionBar.e2) r41Var);
                    return;
            }
        }
    }

    @Override
    public final ui.f B() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56143a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            j0();
        }
    }

    @Override
    public final void I(float f10) {
        org.telegram.ui.Cells.b4 b4Var = this.f48528r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(f10);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        org.telegram.ui.Cells.b4 b4Var = this.f48528r;
        if (b4Var == null) {
            return;
        }
        b4Var.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new li.j(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.f48517b = new v8(9, context, this);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.f48526g0 = true;
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745495, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 12));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.c5 r10 = this.simpleActionBar.r();
        org.telegram.ui.ActionBar.d5 b10 = r10.b(0, 2131232487);
        b10.O();
        b10.C0 = new kg.x1(this, 21);
        this.d = b10;
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        org.telegram.ui.ActionBar.d5 b11 = r10.b(1, 2131231244);
        this.f48522e = b11;
        b11.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        this.f48522e.e(2, 2131232196, org.telegram.messenger.hd.M0(2131748743, null));
        c31 c31Var = new c31(this, this, context);
        this.f48524f = c31Var;
        c31Var.G();
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(this, new a5(this, 27), new b31(this), new b31(this));
        this.f48519c = u41Var;
        u41Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.u41 u41Var2 = this.f48519c;
        u41Var2.f39892g3.f38199r = false;
        u41Var2.r1();
        this.f48519c.setSectionsDrawBackground(true);
        ri.a.e(this.f48519c, 0, 0, org.telegram.messenger.g0.L(12.0f), this.f48523e0);
        this.f48519c.setClipToPadding(false);
        this.f48519c.j(new y11(this, 1));
        this.f48517b.addView(this.f48519c, c8.ja.e(-1, -1, 119));
        View view = new View(context);
        this.Q = view;
        view.setBackground(getBaseSimpleGlass().a(this.Q));
        this.f48517b.addView(this.Q, c8.ja.e(-1, 0, 48));
        this.f48517b.addView(this.simpleActionBar, c8.ja.e(-1, -2, 55));
        org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, true, true);
        this.h = m30Var;
        m30Var.I = true;
        m30Var.f37040a = this;
        m30Var.f37041b = this;
        this.f48531x = new FrameLayout(context);
        k0 k0Var = new k0(25, context, this);
        this.E = k0Var;
        this.f48531x.addView(k0Var, c8.ja.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.E.setOnClickListener(new z21(this, 5));
        c8.na.a(this.E);
        this.f48531x.addOnLayoutChangeListener(new lg(this, 1));
        this.F = new org.telegram.ui.Components.zf0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48532y = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.f48532y.setPivotY(0.0f);
        this.F.addView(this.f48532y, c8.ja.e(90, 90, 51));
        v8 v8Var = this.f48517b;
        v8Var.addView(this.F, v8Var.indexOfChild(this.f48519c) + 1, c8.ja.c(-1.0f, -1));
        this.G = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.H = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(90.0f));
        this.f48532y.addView(this.H, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Cells.b4 b4Var = new org.telegram.ui.Cells.b4(this, context);
        this.f48528r = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        this.f48528r.setProgressColor(-1);
        this.f48528r.setNoProgress(false);
        this.f48532y.addView(this.f48528r, c8.ja.c(-1.0f, -1));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        int L = org.telegram.messenger.g0.L(32.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f28792a7;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, getThemedColor(i7));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, L2, M, null, resourceProvider);
        this.I.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.J = frameLayout3;
        int L3 = org.telegram.messenger.g0.L(30.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L4 = org.telegram.ui.ActionBar.j6.L(L3, getThemedColor(i10));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(L4);
        org.telegram.ui.ActionBar.q6.j(frameLayout3, L4, M2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.K.setImageResource(2131231146);
        this.J.addView(this.K, c8.ja.e(22, 22, 17));
        this.I.addView(this.J, c8.ja.c(30.0f, 30));
        this.I.setPivotX(0.0f);
        this.I.setPivotY(0.0f);
        v8 v8Var2 = this.f48517b;
        v8Var2.addView(this.I, v8Var2.indexOfChild(this.F) + 1, c8.ja.e(34, 34, 51));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 22.0f);
        this.L.setTypeface(org.telegram.messenger.g0.o());
        this.L.setGravity(17);
        this.L.setSingleLine();
        TextView textView2 = this.L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView k10 = org.telegram.ui.Cells.y0.k(this.f48531x, this.L, c8.ja.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.M = k10;
        k10.setTextSize(1, 13.0f);
        this.M.setGravity(17);
        this.M.setSingleLine();
        this.M.setEllipsize(truncateAt);
        TextView k11 = org.telegram.ui.Cells.y0.k(this.f48531x, this.M, c8.ja.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.N = k11;
        k11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(this.N, org.telegram.ui.ActionBar.j6.B6, getResourceProvider());
        this.N.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f));
        this.N.setGravity(17);
        TextView textView3 = this.N;
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.q6.Q(textView3, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i11), 2, -1), null, org.telegram.ui.ActionBar.q6.M(i11), getResourceProvider());
        this.N.setOnClickListener(new z21(this, 6));
        this.P = new View(context);
        o0(true, false);
        this.f48519c.f39892g3.O(false);
        m0(getUserConfig().f());
        q0();
        j0();
        this.simpleActionBar.setBackground(null);
        int i12 = this.mSystemInsets.f15575b;
        if (this.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
            ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.Q.setLayoutParams(layoutParams);
            }
        }
        o0(true, false);
        v8 v8Var3 = this.f48517b;
        b31 b31Var = new b31(this);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(v8Var3, b31Var);
        v8 v8Var4 = this.f48517b;
        this.fragmentView = v8Var4;
        return v8Var4;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.u41 u41Var;
        if (i7 == org.telegram.messenger.ns.f25611y3) {
            m0(getUserConfig().f());
            org.telegram.ui.Components.u41 u41Var2 = this.f48519c;
            if (u41Var2 != null) {
                u41Var2.f39892g3.O(true);
            }
        } else if (i7 == org.telegram.messenger.ns.f25560r) {
            m0(getUserConfig().f());
        } else if (i7 == org.telegram.messenger.ns.f25569s1 && (u41Var = this.f48519c) != null) {
            u41Var.f39892g3.O(true);
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
    public final uq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f48519c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f48515a.f57086f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.w4 w4Var;
        boolean z10;
        int i7;
        int i10;
        if (this.O && (z10 = (w4Var = this.simpleActionBar).G) != this.f48526g0) {
            this.f48526g0 = z10;
            if (z10) {
                i7 = 2131231240;
            } else {
                i7 = 2131232486;
            }
            w4Var.setBackButtonImageAnimated(i7);
            org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
            if (z10) {
                i10 = 2131754878;
            } else {
                i10 = 2131746500;
            }
            w4Var2.setBackButtonContentDescription(org.telegram.messenger.hd.M0(i10, null));
        }
    }

    @Override
    public final ui.f k() {
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (ri.q.f().f56143a) {
            return baseSimpleGlass.f56046i;
        }
        return null;
    }

    public final void k0(org.telegram.ui.ActionBar.e2 e2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (launchActivity = LaunchActivity.H1) != null && (actionBarLayout = launchActivity.f42653r0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.d0((org.telegram.ui.ActionBar.e2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.m4 m4Var = new org.telegram.ui.ActionBar.m4(e2Var);
            m4Var.f29385c = true;
            m4Var.f29388g = true;
            actionBarLayout.U(m4Var);
            return;
        }
        presentFragment(e2Var);
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
        if (this.H == null || this.f48525f0 != -1) {
            return;
        }
        this.G.r(user);
        this.H.f(user, this.G);
        this.L.setText(org.telegram.messenger.q10.p(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(pf.b.c().b("+" + user.phone));
        }
        String n10 = org.telegram.messenger.q10.n(user);
        if (n10 != null) {
            sb2.append(" • @");
            sb2.append(n10);
        }
        this.M.setText(sb2);
        TextView textView = this.N;
        String str2 = null;
        try {
            PackageInfo packageInfo = org.telegram.messenger.t0.f26609b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26609b.getPackageName(), 0);
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
            str2 = org.telegram.messenger.hd.a0(null, null, 2131744210, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        textView.setText(str2);
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.f48528r == null) {
            return;
        }
        AnimatorSet animatorSet = this.f48527n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f48527n = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f48527n = animatorSet2;
            if (z10) {
                this.f48528r.setVisibility(0);
                this.f48527n.playTogether(ObjectAnimator.ofFloat(this.f48528r, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f48528r, View.ALPHA, 0.0f));
            }
            this.f48527n.setDuration(180L);
            this.f48527n.addListener(new z20(10, this, z10));
            this.f48527n.start();
        } else if (z10) {
            this.f48528r.setAlpha(1.0f);
            this.f48528r.setVisibility(0);
        } else {
            this.f48528r.setAlpha(0.0f);
            this.f48528r.setVisibility(4);
        }
    }

    public final void o0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k31.o0(boolean, boolean):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (w4Var.G) {
            if (z10) {
                w4Var.m(true);
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
        xi.e eVar2 = new xi.e(org.telegram.messenger.ns.e(), this);
        eVar2.c(org.telegram.messenger.ns.f25560r);
        eVar2.c(org.telegram.messenger.ns.f25611y3);
        eVar2.c(org.telegram.messenger.ns.f25569s1);
        this.S = eVar2;
        Bundle bundle = this.arguments;
        int i7 = 0;
        if (bundle != null) {
            this.O = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.O) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        }
        this.f48523e0 = i7;
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
        org.telegram.ui.Components.p41 p41Var = this.f48519c.f39892g3;
        if (p41Var != null) {
            p41Var.O(false);
        }
    }

    public final void p0() {
        if (this.F != null && this.f48532y != null) {
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
                for (View view2 = this.f48531x; view2 != null && view2 != this.f48519c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                    f11 += view2.getY();
                }
                float paddingTop = (height - f11) + this.f48519c.getPaddingTop();
                d31 d31Var = this.F;
                float f12 = -org.telegram.messenger.g0.L(16.0f);
                org.telegram.messenger.yr yrVar = d31Var.f42357n;
                if (yrVar != null && yrVar.f27818c) {
                    f12 = yrVar.f27819e.centerY();
                }
                float a10 = c8.i9.a((height - f12) / Math.max(1.0f, paddingTop - f12), 0.0f, 1.0f);
                float max = Math.max(height, f12);
                this.Z = height;
                this.f48516a0 = paddingTop;
                this.f48518b0 = f12;
                float L = org.telegram.messenger.g0.L(90.0f);
                float scaleX = this.E.getScaleX() * (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(this.F.getHiddenAvatarSizeDp()), L, a10) / L);
                float f13 = (L * scaleX) / 2.0f;
                float width = (this.F.getWidth() / 2.0f) - f13;
                if (max != this.W || scaleX != this.X || a10 != this.Y || f10 != this.F.getAlpha() || width != this.f48532y.getTranslationX()) {
                    this.W = max;
                    this.X = scaleX;
                    this.Y = a10;
                    this.F.setAlpha(f10);
                    this.f48532y.setScaleX(scaleX);
                    this.f48532y.setScaleY(scaleX);
                    this.f48532y.setTranslationX(width);
                    float f14 = max - f13;
                    this.f48532y.setTranslationY(f14);
                    this.I.setAlpha(c8.i9.a(org.telegram.messenger.g0.z1(a10, 0.75f, 1.0f), 0.0f, 1.0f) * f10);
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
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        this.M.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f29241y6));
        this.d.W();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6);
        if (this.P.getBackground() == null || themedColor != this.T) {
            this.T = themedColor;
            this.P.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, themedColor), themedColor}));
        }
        this.f48519c.invalidate();
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
        this.f48519c.y0(0);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public k31(Bundle bundle) {
        super(bundle);
        this.f48515a = new te.a(0, this, org.telegram.ui.Components.er.h, 350L, false);
        this.R = 0;
        this.Y = -1.0f;
        this.f48520c0 = new ArrayList();
        this.f48525f0 = -1;
        this.f48526g0 = true;
    }

    @Override
    public final void U() {
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
