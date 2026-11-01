package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
public final class jo implements org.telegram.messenger.m20 {
    public final int f38479a;
    public final Object f38480b;
    public final Object f38481c;

    public jo(int i10, Object obj, Object obj2) {
        this.f38479a = i10;
        this.f38480b = obj;
        this.f38481c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        float f7;
        boolean z10;
        String str;
        vh.s7 s7Var;
        switch (this.f38479a) {
            case 0:
                oo ooVar = (oo) this.f38480b;
                View view = (View) this.f38481c;
                ooVar.E0 = ((Boolean) obj).booleanValue();
                ooVar.G0 = ((Boolean) obj2).booleanValue();
                ooVar.H0 = ((Boolean) obj3).booleanValue();
                ag.d2 d2Var = ooVar.e;
                if (ooVar.E0) {
                    f7 = 16.0f;
                } else {
                    f7 = 32.0f;
                }
                int L = org.telegram.messenger.i0.L(f7);
                boolean z11 = false;
                if (d2Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = d2Var.f26366y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(d2Var.getRoundRadius()[0], L);
                    d2Var.f26366y = ofInt;
                    ofInt.addUpdateListener(new bg.o(d2Var, 6));
                    d2Var.f26366y.setDuration(200L);
                    d2Var.f26366y.start();
                }
                ((org.telegram.ui.Cells.p8) view).setChecked(ooVar.E0);
                ooVar.u0(false, true);
                if (!ooVar.N0) {
                    TLRPC.Chat chat = ooVar.f40232w0;
                    if (chat.forum != ooVar.E0 || chat.forum_tabs != ooVar.G0 || chat.forum_sidebar != ooVar.H0) {
                        if (!org.telegram.messenger.w3.T(chat) && ooVar.E0) {
                            Context parentActivity = ooVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.I1;
                            }
                            if (parentActivity == null) {
                                parentActivity = org.telegram.messenger.w0.f18945b;
                            }
                            if (parentActivity != null) {
                                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, parentActivity, null);
                                ooVar.N0 = true;
                                x1Var.r(250L);
                                ooVar.getMessagesController().T(ooVar.getParentActivity(), ooVar.f40230v0, ooVar, new ng.d(17, ooVar, x1Var), null);
                                return;
                            }
                            return;
                        }
                        TLRPC.Chat chat2 = ooVar.f40232w0;
                        if (chat2.forum_tabs != ooVar.G0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (chat2.forum_sidebar != ooVar.H0) {
                            z11 = true;
                        }
                        ooVar.getMessagesController().X4(ooVar.f40230v0, ooVar.E0, ooVar.G0, ooVar.H0);
                        TLRPC.Chat chat3 = ooVar.f40232w0;
                        chat3.forum = ooVar.E0;
                        chat3.forum_tabs = ooVar.G0;
                        chat3.forum_sidebar = ooVar.H0;
                        if (z10 || z11) {
                            ooVar.v0(z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                final org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f38480b;
                org.telegram.messenger.k20 k20Var = (org.telegram.messenger.k20) this.f38481c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    String str2 = "NULL_ERROR";
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: no secret parts: ".concat((tL_error == null || (r5 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error != null && (str = tL_error.text) != null) {
                        str2 = str;
                    }
                    k20Var.a(null, str2);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(k20Var, 2);
                ArrayList<Integer> arrayList = secretphraseparts.dcs;
                if (arrayList.size() <= 0) {
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: no secret parts, zero dcs");
                    dVar.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, org.telegram.ui.Wallet.k0.w(), null);
                x1Var2.r(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList.size()];
                final int i10 = 0;
                while (i10 < arrayList.size()) {
                    final int intValue = arrayList.get(i10).intValue();
                    org.telegram.ui.Wallet.k0.H("getSecretPhrase: requesting " + i10 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(k0Var.f34781a).sendRequestTyped(fetchencryptedsecretphrasepart, new a3.b(1), new org.telegram.messenger.k20() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            k0 k0Var2 = k0.this;
                            boolean[] zArr2 = zArr;
                            int i11 = i10;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i12 = intValue;
                            long j10 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.x1 x1Var3 = x1Var2;
                            boolean z12 = true;
                            zArr2[i11] = true;
                            encryptedsecretphrasepartArr2[i11] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i11] = (TLRPC.TL_error) obj5;
                            k0.H("getSecretPhrase: received " + i11 + " part from dc" + i12);
                            for (int i13 = 0; i13 < zArr2.length; i13++) {
                                if (!zArr2[i13]) {
                                    z12 = false;
                                }
                            }
                            if (!z12) {
                                return;
                            }
                            k0.H("getSecretPhrase: received all parts");
                            j jVar = new j((Object) k0Var2, (Object) x1Var3, (Object) dVar2, 3);
                            for (int i14 = 0; i14 < encryptedsecretphrasepartArr2.length; i14++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i14];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error2 = tL_errorArr2[i14];
                                    StringBuilder l4 = i0.a.l(i14, "getSecretPhrase: part ", ": ");
                                    String str3 = tL_error2.text;
                                    String str4 = "NULL_ERROR";
                                    if (str3 == null) {
                                        str3 = "NULL_ERROR";
                                    }
                                    l4.append(str3);
                                    k0.j(l4.toString());
                                    String str5 = tL_error2.text;
                                    if (str5 != null) {
                                        str4 = str5;
                                    }
                                    jVar.a(null, str4);
                                    return;
                                } else if (encryptedsecretphrasepart.data.length < 33) {
                                    StringBuilder l10 = i0.a.l(i14, "getSecretPhrase: part ", " length < 33 (len=");
                                    l10.append(encryptedsecretphrasepartArr2[i14].data.length);
                                    l10.append(")");
                                    k0.j(l10.toString());
                                    jVar.a(null, "WALLET_PART_" + i14 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.d.c(new ag.a3(k0Var2, encryptedsecretphrasepartArr2, j10, jVar, 12));
                        }
                    }, intValue, 0);
                    i10++;
                    arrayList = arrayList;
                }
                return;
            case 2:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.f38480b;
                d01 d01Var = (d01) this.f38481c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error2 != null) {
                    String str3 = tL_error2.text;
                    if (str3 == null) {
                        str3 = "NULL_ERROR";
                    }
                    d01Var.a(str3);
                    return;
                }
                k0Var2.l0(walletState);
                k0Var2.R();
                d01Var.a(null);
                return;
            case 3:
                org.telegram.ui.Wallet.k0 k0Var3 = (org.telegram.ui.Wallet.k0) this.f38480b;
                org.telegram.ui.Wallet.p8 p8Var = (org.telegram.ui.Wallet.p8) this.f38481c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str4 = tL_error3.text;
                    String str5 = "NULL_ERROR";
                    if (str4 == null) {
                        str4 = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.k0.j("failed to disable backup: ".concat(str4));
                    String str6 = tL_error3.text;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    p8Var.a(str5);
                    return;
                }
                k0Var3.l0(walletState2);
                p8Var.a(null);
                return;
            case 4:
                th.p1 p1Var = (th.p1) this.f38480b;
                th.h0 h0Var = (th.h0) this.f38481c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i11 = p1Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = p1Var.O;
                    deletegroupcallparticipantmessages.participant = org.telegram.messenger.wp.r1(i11).i1(h0Var.f49022c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i11).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = h0Var.f49022c;
                    ArrayList arrayList2 = p1Var.f49105r;
                    ArrayList arrayList3 = p1Var.f49106s;
                    int i12 = 0;
                    boolean z12 = false;
                    while (i12 < arrayList2.size()) {
                        if (((th.h0) arrayList2.get(i12)).f49022c == j10) {
                            th.h0 h0Var2 = (th.h0) arrayList2.get(i12);
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList3.size()) {
                                    if (((th.i0) arrayList3.get(i13)).f49068f.contains(h0Var2)) {
                                        ((th.i0) arrayList3.get(i13)).f49068f.remove(h0Var2);
                                        if (((th.i0) arrayList3.get(i13)).f49068f.isEmpty()) {
                                            arrayList3.remove(i13);
                                            z12 = true;
                                        } else {
                                            p1Var.m();
                                        }
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            arrayList2.remove(i12);
                            p1Var.e.O(true);
                            i12--;
                        }
                        i12++;
                    }
                    if (z12) {
                        ConnectionsManager.getInstance(i11).getCurrentTime();
                        Collections.sort(arrayList3, new dx0(p1Var, 21));
                        p1Var.f49104n.O(true);
                        p1Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = p1Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(h0Var.f49020a));
                    ConnectionsManager.getInstance(i11).sendRequest(deletegroupcallmessages, null);
                    p1Var.c(h0Var.f49020a);
                }
                if (bool2.booleanValue()) {
                    if (p1Var.M >= 0) {
                        org.telegram.messenger.wp.r1(i11).w(p1Var.M);
                        return;
                    } else {
                        org.telegram.messenger.wp.r1(i11).e0(-p1Var.M, org.telegram.messenger.wp.r1(i11).i1(h0Var.f49022c), true, null);
                        return;
                    }
                }
                return;
            case 5:
                vh.e8 e8Var = (vh.e8) this.f38480b;
                vh.n nVar = (vh.n) this.f38481c;
                File file = (File) obj;
                String str7 = (String) obj2;
                Long l4 = (Long) obj3;
                vh.o8 o8Var = e8Var.R1;
                vh.d8 d8Var = o8Var.X0;
                if (d8Var != null) {
                    d8Var.O = false;
                    d8Var.c();
                    vh.d8 d8Var2 = o8Var.X0;
                    d8Var2.m(0L);
                    vh.z8 z8Var = d8Var2.F;
                    if (z8Var != null) {
                        z8Var.setProgress(0L);
                    }
                }
                vh.n5 n5Var = o8Var.K1;
                if (n5Var != null) {
                    n5Var.f51559o0 = file;
                    n5Var.f51561p0 = str7;
                    n5Var.f51563q0 = l4.longValue();
                    vh.n5 n5Var2 = o8Var.K1;
                    n5Var2.f51567s0 = 0.0f;
                    n5Var2.f51569t0 = 1.0f;
                    n5Var2.f51565r0 = 0L;
                    n5Var2.f51571u0 = 1.0f;
                    o8Var.t();
                    if (o8Var.X0 != null && (s7Var = o8Var.f51687v1) != null) {
                        jg.i2 j02 = s7Var.j0(o8Var.K1.f51561p0, true);
                        e8Var.setHasRoundVideo(true);
                        o8Var.X0.s(o8Var.K1, j02, true);
                        org.telegram.messenger.i0.r(nVar.h);
                        nVar.f52058a.destroy(true, null);
                        j02.setDraw(false);
                        nVar.post(new vh.r0(10, nVar, j02));
                        return;
                    }
                    nVar.a(false);
                    return;
                }
                return;
            default:
                xh.n nVar2 = (xh.n) this.f38480b;
                org.telegram.messenger.k20 k20Var2 = (org.telegram.messenger.k20) this.f38481c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                nVar2.getClass();
                String str8 = null;
                if (tVar != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            uVar = nVar2.i(true);
                        }
                        if (uVar != null) {
                            str8 = !TextUtils.isEmpty(nVar2.f53936g) ? new String(uVar.f1120b.doFinal(Utilities.v(nVar2.f53936g)), StandardCharsets.UTF_8) : nVar2.f53936g;
                        } else if (!TextUtils.isEmpty(nVar2.f53936g)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        bool3 = Boolean.FALSE;
                    }
                }
                k20Var2.a(bool3, str8);
                return;
        }
    }
}
