package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kp implements Runnable {
    public final int f38951a;
    public final boolean f38952b;
    public final Object f38953c;
    public final Object d;
    public final Object e;

    public kp(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f38951a = i10;
        this.d = obj;
        this.f38953c = obj2;
        this.e = obj3;
        this.f38952b = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        byte[] bArr;
        byte[] bArr2;
        int i12;
        int i13;
        boolean z11;
        Bitmap.CompressFormat compressFormat;
        String str = null;
        Boolean bool = null;
        r5 = null;
        byte[] bArr3 = null;
        str = null;
        switch (this.f38951a) {
            case 0:
                mp mpVar = (mp) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f38953c;
                boolean z12 = this.f38952b;
                chat.join_request = z12;
                mpVar.f39596y.d.getMessagesController().Z4(chat.f19794id, 0L, z12, false, false, new lp(mpVar, 0), new ch(18, mpVar, (org.telegram.ui.Components.w70) this.e));
                return;
            case 1:
                boolean z13 = this.f38952b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f38953c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z13 && org.telegram.messenger.w3.T(chat2)) {
                    View d = alertDialog$Builder.f20135a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (org.telegram.messenger.w3.V(chat2)) {
                                i10 = 2131752422;
                            } else {
                                i10 = 2131751531;
                            }
                            textView.setText(org.telegram.messenger.dd.L0(i10, null));
                            return;
                        } else if (chat2.monoforum) {
                            textView.setText(org.telegram.messenger.dd.L0(2131749005, null));
                            return;
                        } else if (chat2.megagroup) {
                            textView.setText(org.telegram.messenger.dd.L0(2131749001, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.dd.L0(2131749014, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.wj wjVar = (org.telegram.ui.Components.wj) this.d;
                boolean z14 = this.f38952b;
                ArrayList arrayList = (ArrayList) this.e;
                wjVar.getClass();
                String lowerCase = ((String) this.f38953c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.cd(14, wjVar, new ArrayList()));
                    return;
                }
                String R0 = org.telegram.messenger.dd.D0().R0(lowerCase, true, false);
                if (!lowerCase.equals(R0) && R0.length() != 0) {
                    str = R0;
                }
                if (str != null) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                int i14 = i11 + 1;
                String[] strArr = new String[i14];
                strArr[0] = lowerCase;
                if (str != null) {
                    strArr[1] = str;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!z14) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        org.telegram.ui.Components.qj qjVar = (org.telegram.ui.Components.qj) arrayList.get(i15);
                        File file = qjVar.f29744f;
                        if (file != null && !file.isDirectory()) {
                            int i16 = 0;
                            while (true) {
                                if (i16 < i14) {
                                    String str2 = strArr[i16];
                                    String str3 = qjVar.f29742b;
                                    if (str3 != null) {
                                        z10 = str3.toLowerCase().contains(str2);
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList2.add(qjVar);
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.cd(14, wjVar, arrayList2));
                return;
            case 3:
                org.telegram.ui.Components.u70 u70Var = (org.telegram.ui.Components.u70) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f38953c;
                boolean z15 = this.f38952b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = u70Var.f30886k1;
                if (k2Var != null && k2Var.getParentActivity() != null) {
                    if (tL_error != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                            u70Var.setOnDismissListener(new org.telegram.ui.Components.o70(1, u70Var, z15));
                        } else {
                            org.telegram.ui.Components.s4.e0(u70Var.f21584a, tL_error, k2Var, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    u70Var.dismiss();
                    return;
                }
                return;
            case 4:
                TLObject tLObject = (TLObject) this.f38953c;
                boolean z16 = this.f38952b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.e;
                org.telegram.ui.Components.dx0 dx0Var = ((org.telegram.ui.Components.sw0) this.d).f30458a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).I1(tL_messages_stickerSet, true);
                    if (z16) {
                        org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).f2(null, tLObject, 0, null, false, false);
                    } else {
                        dx0Var.J1 = tL_messages_stickerSet;
                        dx0Var.R0();
                        dx0Var.Z0();
                    }
                }
                x1Var.dismiss();
                return;
            case 5:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f38953c;
                boolean z17 = this.f38952b;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.e;
                if (z2Var != null && !z2Var.I) {
                    z2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z17) {
                        org.telegram.messenger.i0.g3(new yg(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                } else if (x1Var2 != null && x1Var2.isShowing()) {
                    x1Var2.l(true);
                    editTextBoldCursor.requestFocus();
                    if (z17) {
                        org.telegram.messenger.i0.g3(new yg(editTextBoldCursor, 4));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                a50 a50Var = (a50) this.d;
                TLObject tLObject2 = (TLObject) this.f38953c;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.e;
                boolean z18 = this.f38952b;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                        return;
                    } else {
                        a50Var.w1(null, tL_chatInviteExported.link, true, z18);
                        return;
                    }
                }
                return;
            case 7:
                d60 d60Var = (d60) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f38953c;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z19 = this.f38952b;
                if (tL_error2 == null) {
                    d60Var.f36500f = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (z19) {
                        if (d60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(d60Var.getParentActivity());
                            alertDialog$Builder2.f20135a.T = org.telegram.messenger.dd.L0(2131746042, null);
                            alertDialog$Builder2.f20135a.R = org.telegram.messenger.dd.L0(2131746040, null);
                            alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131747847, null), null);
                            d60Var.showDialog(alertDialog$Builder2.f20135a);
                        } else {
                            return;
                        }
                    }
                }
                d60Var.e = false;
                d60Var.f36497a.f();
                return;
            case 8:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f38953c;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z20 = this.f38952b;
                jl0 jl0Var = ((wk0) this.d).e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    jl0Var.J = password;
                    TwoStepVerificationActivity.r0(password);
                    jl0Var.F1(z20);
                    return;
                }
                return;
            case 9:
                wk0 wk0Var = (wk0) this.d;
                String str4 = (String) this.e;
                boolean z21 = this.f38952b;
                jl0 jl0Var2 = wk0Var.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.f38953c);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    jl0Var2.f38417c1 = tL_secureSecretSettings.secure_secret;
                    jl0Var2.f38414b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        jl0Var2.f38421e1 = Utilities.s(bArr, org.telegram.messenger.i0.h1(str4), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        jl0Var2.f38421e1 = Utilities.m(org.telegram.messenger.i0.h1(str4), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        org.telegram.messenger.i0.g3(new kp(wk0Var, passwordsettings, z21, bArr2, 10));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        org.telegram.messenger.i0.g3(new kg0(wk0Var, 7));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = jl0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        jl0Var2.f38421e1 = Utilities.m(org.telegram.messenger.i0.h1(str4), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    jl0Var2.f38417c1 = null;
                    jl0Var2.f38414b1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.i0.g3(new kp(wk0Var, passwordsettings, z21, bArr2, 10));
                return;
            case 10:
                wk0 wk0Var2 = (wk0) this.d;
                boolean z22 = this.f38952b;
                byte[] bArr6 = (byte[]) this.e;
                jl0 jl0Var3 = wk0Var2.e;
                jl0Var3.f38419d1 = ((TL_account.passwordSettings) this.f38953c).email;
                if (z22) {
                    jl0Var3.f38421e1 = jl0Var3.P0;
                }
                byte[] bArr7 = jl0Var3.f38417c1;
                byte[] bArr8 = jl0Var3.f38421e1;
                if (bArr7 != null && bArr7.length == 32) {
                    byte[] bArr9 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr9, 0, 32);
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 32, bArr10, 0, 16);
                    byte[] bArr11 = new byte[32];
                    System.arraycopy(bArr7, 0, bArr11, 0, 32);
                    Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 0);
                    bArr3 = bArr11;
                }
                if (jl0.d1(bArr3, Long.valueOf(jl0Var3.f38414b1)) && bArr6.length != 0 && jl0Var3.f38414b1 != 0) {
                    if (jl0Var3.f38415c == 0) {
                        TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                        i13 = ((org.telegram.ui.ActionBar.k2) jl0Var3).currentAccount;
                        ConnectionsManager.getInstance(i13).sendRequest(getallsecurevalues, new uk0(wk0Var2, 0));
                        return;
                    }
                    wk0Var2.a();
                    return;
                } else if (z22) {
                    i12 = ((org.telegram.ui.ActionBar.k2) jl0Var3).currentAccount;
                    org.telegram.messenger.e20.i(i12).u();
                    jl0Var3.N0 = 0;
                    jl0Var3.W1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = jl0Var3.D;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        jl0Var3.D.errors.clear();
                    }
                    byte[] bArr12 = jl0Var3.f38417c1;
                    if (bArr12 != null && bArr12.length != 0) {
                        wk0Var2.b();
                        return;
                    } else {
                        Utilities.e.c(new pd0(wk0Var2, wk0Var2.f43126b, wk0Var2.d, 15));
                        return;
                    }
                }
            case 11:
                qm0 qm0Var = (qm0) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f38953c;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z23 = this.f38952b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject5;
                    qm0Var.f40813a0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    qm0Var.G0(z23);
                    return;
                }
                return;
            case 12:
                rc1.h0((rc1) this.d, (TLRPC.TL_error) this.f38953c, (TLObject) this.e, this.f38952b);
                return;
            case 13:
                rh.v5 v5Var = (rh.v5) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z24 = this.f38952b;
                ArrayList arrayList3 = v5Var.f47596l;
                int i17 = v5Var.f47588a;
                if (((int[]) this.f38953c)[0] == v5Var.f47597m) {
                    v5Var.f47593i = false;
                    v5Var.f47597m = -1;
                    if (tLObject6 instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject6;
                        org.telegram.messenger.wp.r1(i17).V3(tL_payments_savedStarGifts.users, false);
                        org.telegram.messenger.wp.r1(i17).P3(tL_payments_savedStarGifts.chats, false);
                        if (z24) {
                            arrayList3.clear();
                        }
                        arrayList3.addAll(tL_payments_savedStarGifts.gifts);
                        v5Var.f47595k = tL_payments_savedStarGifts.next_offset;
                        v5Var.f47598n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        v5Var.h = bool;
                        if (arrayList3.size() <= v5Var.f47598n && v5Var.f47595k != null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        v5Var.f47594j = z11;
                    } else {
                        v5Var.f47594j = true;
                    }
                    org.telegram.messenger.at.f(i17).k(230, Long.valueOf(v5Var.f47589b), v5Var);
                    return;
                }
                return;
            case 14:
                th.d2 d2Var = (th.d2) this.d;
                sg.o0 o0Var = (sg.o0) this.e;
                boolean z25 = this.f38952b;
                th.z2 z2Var2 = d2Var.f48886a;
                org.telegram.ui.Components.s4.Z(z2Var2.f49744l2, 1, z2Var2.f49740k1, new org.telegram.ui.Components.nd(d2Var, z25, o0Var, (View) this.f38953c));
                return;
            case 15:
                vh.e1 e1Var = (vh.e1) this.d;
                TLObject tLObject7 = (TLObject) this.f38953c;
                String str5 = (String) this.e;
                boolean z26 = this.f38952b;
                vh.g1 g1Var = e1Var.f51112s;
                if (e1Var.f51111r) {
                    if (tLObject7 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject7;
                        vh.u1 u1Var = g1Var.f51203r;
                        ArrayList arrayList4 = g1Var.f51202n;
                        int i18 = vh.u1.f52000y1;
                        org.telegram.messenger.is.a0(u1Var.f21584a).v1(str5, messages_botresults);
                        e1Var.h = messages_botresults.next_offset;
                        if (z26) {
                            arrayList4.clear();
                        }
                        arrayList4.size();
                        arrayList4.addAll(messages_botresults.results);
                        e1Var.f();
                    }
                    g1Var.d.c(false);
                    e1Var.f51111r = false;
                    return;
                }
                return;
            case 16:
                vh.n5 n5Var = (vh.n5) this.d;
                Bitmap bitmap = (Bitmap) this.f38953c;
                boolean z27 = this.f38952b;
                Runnable runnable = (Runnable) this.e;
                n5Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(n5Var.Z0);
                    if (z27) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, false);
                    if (z27) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(n5Var.Z0));
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, false);
                        }
                    }
                }
                bitmap.recycle();
                org.telegram.messenger.i0.g3(runnable);
                return;
            default:
                zf.z zVar = (zf.z) this.d;
                boolean z28 = this.f38952b;
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) this.f38953c;
                zf.w wVar = (zf.w) this.e;
                if (!z28) {
                    zVar.f55702c = wVar;
                    z3Var.setRightText(zVar.H(wVar));
                    z3Var.setRightTextMargin(6);
                    zVar.I.clear();
                    zVar.d = true;
                    zVar.f();
                    zVar.P();
                    return;
                }
                return;
        }
    }

    public kp(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f38951a = i10;
        this.d = obj;
        this.f38953c = obj2;
        this.f38952b = z10;
        this.e = obj3;
    }

    public kp(th.d2 d2Var, View view, sg.o0 o0Var, boolean z10, boolean z11) {
        this.f38951a = 14;
        this.d = d2Var;
        this.f38953c = view;
        this.e = o0Var;
        this.f38952b = z10;
    }

    public kp(zf.z zVar, boolean z10, org.telegram.ui.Cells.z3 z3Var, zf.w wVar) {
        this.f38951a = 17;
        this.d = zVar;
        this.f38952b = z10;
        this.f38953c = z3Var;
        this.e = wVar;
    }

    public kp(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f38951a = 1;
        this.f38952b = z10;
        this.f38953c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
