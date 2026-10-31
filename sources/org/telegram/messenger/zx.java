package org.telegram.messenger;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gc1;
import org.telegram.ui.jj0;
import org.telegram.ui.sm0;
public final class zx implements RequestDelegate {
    public final int f19776a = 2;
    public final qz f19777b;
    public final Object f19778c;
    public final jj d;
    public final String e;
    public final Object f19779f;
    public final boolean f19780g;
    public final Object h;
    public final Object f19781i;
    public final Object f19782j;
    public final boolean f19783k;
    public final Object f19784l;

    public zx(qz qzVar, String str, List list, boolean z10, jj jjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.un unVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f19777b = qzVar;
        this.e = str;
        this.f19784l = list;
        this.f19780g = z10;
        this.d = jjVar;
        this.f19778c = keyboardButtonProto;
        this.f19779f = unVar;
        this.h = twoStepVerificationActivity;
        this.f19781i = tLObjectArr;
        this.f19782j = inputCheckPasswordSRP;
        this.f19783k = z11;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i10;
        boolean z10;
        int i11 = this.f19776a;
        Object obj = this.f19782j;
        Object obj2 = this.h;
        Object obj3 = this.f19779f;
        Object obj4 = this.f19778c;
        Object obj5 = this.f19784l;
        switch (i11) {
            case 0:
                i0.g3(new iy(this.f19777b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.e, (cz) obj3, this.f19780g, (cz) obj2, this.f19781i, (HashMap) obj, this.f19783k));
                return;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final cz czVar = (cz) obj3;
                final cz czVar2 = (cz) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final qz qzVar = this.f19777b;
                final jj jjVar = this.d;
                final String str = this.e;
                final boolean z11 = this.f19780g;
                final Object obj6 = this.f19781i;
                final boolean z12 = this.f19783k;
                if (tL_error == null || ((!((z10 = tLObject2 instanceof TLRPC.TL_messages_sendMedia)) && !(tLObject2 instanceof TL_ephemeral.TL_sendMessage) && !(tLObject2 instanceof TLRPC.TL_messages_editMessage) && !(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) || !w8.r(tL_error.text))) {
                    i10 = 1;
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null && w8.r(str2)) {
                        i10 = 1;
                        if (str2.endsWith("COVER_EXPIRED")) {
                            if (z10) {
                                TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                                if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = (TLRPC.TL_inputMediaUploadedDocument) inputMedia;
                                    tL_inputMediaUploadedDocument.video_cover = null;
                                    tL_inputMediaUploadedDocument.flags &= -65;
                                } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                                    tL_inputMediaDocument.video_cover = null;
                                    tL_inputMediaDocument.flags &= -9;
                                } else if (inputMedia instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                    TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal = (TLRPC.TL_inputMediaDocumentExternal) inputMedia;
                                    tL_inputMediaDocumentExternal.video_cover = null;
                                    tL_inputMediaDocumentExternal.flags &= -5;
                                }
                                qzVar.O(tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
                                return;
                            } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                                TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) tLObject2).media;
                                if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia2;
                                    tL_inputMediaUploadedDocument2.video_cover = null;
                                    tL_inputMediaUploadedDocument2.flags &= -65;
                                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                                    tL_inputMediaDocument2.video_cover = null;
                                    tL_inputMediaDocument2.flags &= -9;
                                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                    TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal2 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia2;
                                    tL_inputMediaDocumentExternal2.video_cover = null;
                                    tL_inputMediaDocumentExternal2.flags &= -5;
                                }
                                qzVar.O(tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
                                return;
                            } else if (tLObject2 instanceof TLRPC.TL_messages_editMessage) {
                                TLRPC.InputMedia inputMedia3 = ((TLRPC.TL_messages_editMessage) tLObject2).media;
                                if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument3 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia3;
                                    tL_inputMediaUploadedDocument3.video_cover = null;
                                    tL_inputMediaUploadedDocument3.flags &= -65;
                                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                                    tL_inputMediaDocument3.video_cover = null;
                                    tL_inputMediaDocument3.flags &= -9;
                                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                    TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal3 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia3;
                                    tL_inputMediaDocumentExternal3.video_cover = null;
                                    tL_inputMediaDocumentExternal3.flags &= -5;
                                }
                                qzVar.O(tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
                                return;
                            } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                                TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media;
                                if (inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument4 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia4;
                                    tL_inputMediaUploadedDocument4.video_cover = null;
                                    tL_inputMediaUploadedDocument4.flags &= -65;
                                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                                    tL_inputMediaDocument4.video_cover = null;
                                    tL_inputMediaDocument4.flags &= -9;
                                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                    TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal4 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia4;
                                    tL_inputMediaDocumentExternal4.video_cover = null;
                                    tL_inputMediaDocumentExternal4.flags &= -5;
                                }
                                qzVar.O(tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
                                return;
                            }
                        }
                    } else {
                        i10 = 1;
                    }
                    if (obj6 != null) {
                        w8 fileRefController = qzVar.getFileRefController();
                        Boolean valueOf = Boolean.valueOf(z11);
                        Boolean valueOf2 = Boolean.valueOf(z12);
                        Object[] objArr = new Object[7];
                        objArr[0] = tLObject2;
                        objArr[i10] = jjVar;
                        objArr[2] = str;
                        objArr[3] = czVar;
                        objArr[4] = valueOf;
                        objArr[5] = czVar2;
                        objArr[6] = valueOf2;
                        fileRefController.u(objArr, obj6);
                        return;
                    } else if (czVar2 != null) {
                        i0.g3(new rn(qzVar, message, z12, tLObject2, czVar2, 4));
                        return;
                    }
                }
                if (tL_error != null && (tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                        if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                            qzVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new a3.b(i10), new j20() {
                                @Override
                                public final void a(Object obj7, Object obj8) {
                                    TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj8;
                                    qz qzVar2 = qz.this;
                                    qzVar2.getClass();
                                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                        String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                        TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                                        if (inputMedia5 instanceof TLRPC.TL_inputMediaStakeDice) {
                                            ((TLRPC.TL_inputMediaStakeDice) inputMedia5).game_hash = str3;
                                        }
                                        qzVar2.O(tL_messages_sendMedia2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
                                    }
                                }
                            });
                            return;
                        } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                            if (T != null) {
                                i0.g3(new iy(qzVar, T, tL_inputMediaStakeDice, tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12));
                                return;
                            }
                            z12 = z12;
                        }
                    }
                }
                if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    i0.g3(new gy(qzVar, tL_error, message, tLObject, jjVar, str, hashMap, z12, tLObject2));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messages_editMessage) {
                    i0.g3(new ly(qzVar, tL_error, message, tLObject, jjVar, str, hashMap, z12, tLObject2));
                    return;
                } else {
                    i0.g3(new ly(qzVar, z12, tL_error, message, tLObject, jjVar, hashMap, str, tLObject2));
                    return;
                }
            default:
                final List list = (List) obj5;
                final TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) obj4;
                final org.telegram.ui.un unVar = (org.telegram.ui.un) obj3;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                final TLObject[] tLObjectArr = (TLObject[]) this.f19781i;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj;
                final qz qzVar2 = this.f19777b;
                final String str3 = this.e;
                final boolean z13 = this.f19780g;
                final jj jjVar2 = this.d;
                final boolean z14 = this.f19783k;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i12;
                        int i13;
                        int L;
                        int i14;
                        int i15;
                        int L2;
                        int i16;
                        int i17;
                        int i18;
                        jj jjVar3;
                        boolean z15;
                        String str4;
                        boolean z16;
                        boolean z17;
                        org.telegram.ui.Components.hg hgVar;
                        final qz qzVar3 = qz.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z18 = z13;
                        TLObject tLObject3 = tLObject;
                        final jj jjVar4 = jjVar2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final org.telegram.ui.un unVar2 = unVar;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                        final boolean z19 = z14;
                        qzVar3.f17663r.remove(str5);
                        list2.remove(str5);
                        if (z18 && tLObject3 == null) {
                            qzVar3.n0(false, jjVar4, keyboardButtonProto2, null, null, unVar2);
                            return;
                        }
                        TLRPC.TL_game tL_game = null;
                        if (tLObject3 != null) {
                            if (twoStepVerificationActivity2 != null) {
                                twoStepVerificationActivity2.s0();
                                twoStepVerificationActivity2.finishFragment();
                            }
                            long Z0 = jjVar4.Z0();
                            long j10 = jjVar4.f16337k.via_bot_id;
                            if (j10 != 0) {
                                Z0 = j10;
                            }
                            if (Z0 > 0) {
                                TLRPC.User Z1 = qzVar3.getMessagesController().Z1(Long.valueOf(Z0));
                                if (Z1 != null) {
                                    str4 = i5.m(0, Z1.first_name, Z1.last_name);
                                } else {
                                    str4 = null;
                                }
                                jjVar3 = jjVar4;
                                z15 = z18;
                            } else {
                                jjVar3 = jjVar4;
                                z15 = z18;
                                TLRPC.Chat L0 = qzVar3.getMessagesController().L0(Long.valueOf(-Z0));
                                if (L0 != null) {
                                    str4 = L0.title;
                                } else {
                                    str4 = null;
                                }
                            }
                            if (str4 == null) {
                                str4 = "bot";
                            }
                            TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) sf.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                            if (tL_inlineButtonTypeUrlAuth != null) {
                                if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                                    jj0.b(false, qzVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                    jj0.b(false, qzVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    org.telegram.ui.Components.s4.p0(unVar2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                }
                            } else if (sf.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                    rh.e6.y(qzVar3.currentAccount, false).X(jjVar3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new kx(qzVar3, str5, list2, 0), new ag.z0(4));
                                    return;
                                }
                                jj jjVar5 = jjVar3;
                                if (tLObject3 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                    qzVar3.getMessagesController().V3(paymentForm.users, false);
                                    unVar2.presentFragment(new sm0(paymentForm, jjVar5, null, unVar2));
                                } else if (tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars) {
                                    Context context = LaunchActivity.I1;
                                    if (context == null) {
                                        context = w0.f19025b;
                                    }
                                    rh.h8.l1(context, qzVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                } else if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    unVar2.presentFragment(new sm0((TLRPC.PaymentReceipt) tLObject3));
                                }
                            } else {
                                jj jjVar6 = jjVar3;
                                TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) sf.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                if (!z15 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                                    qzVar3.getMessagesStorage().v1(str5, tL_messages_botCallbackAnswer);
                                }
                                String str6 = tL_messages_botCallbackAnswer.message;
                                if (str6 != null) {
                                    if (tL_messages_botCallbackAnswer.alert) {
                                        if (unVar2.getParentActivity() != null) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar2.getParentActivity());
                                            alertDialog$Builder.f20134a.R = str4;
                                            alertDialog$Builder.k(cd.L0(2131747847, null), null);
                                            String str7 = tL_messages_botCallbackAnswer.message;
                                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                            x1Var.T = str7;
                                            unVar2.showDialog(x1Var);
                                            return;
                                        }
                                        return;
                                    }
                                    if (unVar2.f42195b3 == null && unVar2.f42180a1 != null && unVar2.getParentActivity() != null) {
                                        FrameLayout frameLayout = new FrameLayout(unVar2.getParentActivity());
                                        unVar2.f42195b3 = frameLayout;
                                        unVar2.f42180a1.addView(frameLayout, w7.b6.o(-1, 48));
                                        unVar2.f42180a1.h(11, unVar2.f42195b3);
                                        unVar2.f42180a1.g(unVar2.f42195b3);
                                        TextView textView = new TextView(unVar2.getParentActivity());
                                        unVar2.f42222d3 = textView;
                                        textView.setTextSize(1, 14.0f);
                                        org.telegram.ui.ActionBar.a7.V(unVar2.f42222d3, org.telegram.ui.ActionBar.t6.Te, unVar2.getResourceProvider());
                                        unVar2.f42222d3.setTypeface(i0.o());
                                        unVar2.f42222d3.setSingleLine(true);
                                        TextView textView2 = unVar2.f42222d3;
                                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                        textView2.setEllipsize(truncateAt);
                                        unVar2.f42222d3.setMaxLines(1);
                                        unVar2.f42195b3.addView(unVar2.f42222d3, w7.b6.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                                        TextView textView3 = new TextView(unVar2.getParentActivity());
                                        unVar2.f42235e3 = textView3;
                                        textView3.setTextSize(1, 14.0f);
                                        org.telegram.ui.ActionBar.a7.V(unVar2.f42235e3, org.telegram.ui.ActionBar.t6.Ue, unVar2.getResourceProvider());
                                        unVar2.f42235e3.setSingleLine(true);
                                        unVar2.f42235e3.setEllipsize(truncateAt);
                                        unVar2.f42235e3.setMaxLines(1);
                                        unVar2.f42195b3.addView(unVar2.f42235e3, w7.b6.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                                    }
                                    FrameLayout frameLayout2 = unVar2.f42195b3;
                                    if (frameLayout2 != null && (hgVar = unVar2.f42180a1) != null) {
                                        hgVar.i(frameLayout2, true, true);
                                        unVar2.f42222d3.setText(str4);
                                        unVar2.f42235e3.setText(k6.m(str6.replace('\n', ' '), unVar2.f42235e3.getPaint().getFontMetricsInt(), false, null, 0));
                                        org.telegram.ui.ci ciVar = unVar2.f42209c3;
                                        if (ciVar != null) {
                                            i0.r(ciVar);
                                        }
                                        org.telegram.ui.ci ciVar2 = new org.telegram.ui.ci(unVar2, 0);
                                        unVar2.f42209c3 = ciVar2;
                                        i0.h3(ciVar2, 3000L);
                                    }
                                } else if (tL_messages_botCallbackAnswer.url != null && unVar2.getParentActivity() != null) {
                                    TLRPC.User Z12 = qzVar3.getMessagesController().Z1(Long.valueOf(Z0));
                                    if (Z12 != null && Z12.verified) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (sf.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                        TLRPC.MessageMedia messageMedia = jjVar6.f16337k.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            tL_game = messageMedia.game;
                                        }
                                        if (tL_game != null) {
                                            String str8 = tL_messages_botCallbackAnswer.url;
                                            if (!z16 && m5.w("askgame_", Z0, vp.r1(qzVar3.currentAccount).e7, true)) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            unVar2.fc(tL_game, jjVar6, str8, z17, Z0);
                                            return;
                                        }
                                        return;
                                    }
                                    org.telegram.ui.Components.s4.p0(unVar2, tL_messages_botCallbackAnswer.url, false, false);
                                }
                            }
                        } else if (tL_error2 != null && unVar2.getParentActivity() != null) {
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(unVar2.getParentActivity());
                                    alertDialog$Builder2.f20134a.R = cd.L0(2131753019, null);
                                    alertDialog$Builder2.f20134a.T = i0.W2(cd.a0("BotOwnershipTransferReadyAlertText", null, 2131753016, new Object[0]));
                                    alertDialog$Builder2.k(cd.L0(2131753017, null), new org.telegram.ui.ActionBar.u1() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i19) {
                                            final TwoStepVerificationActivity twoStepVerificationActivity3 = new TwoStepVerificationActivity();
                                            final jj jjVar7 = jjVar4;
                                            final qz qzVar4 = qz.this;
                                            final TL_keyboard.KeyboardButtonProto keyboardButtonProto3 = keyboardButtonProto2;
                                            final org.telegram.ui.un unVar3 = unVar2;
                                            final boolean z20 = z19;
                                            gc1 gc1Var = new gc1() {
                                                @Override
                                                public final void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                                                    qzVar4.n0(z20, jjVar7, keyboardButtonProto3, tL_inputCheckPasswordSRP, twoStepVerificationActivity3, unVar3);
                                                }
                                            };
                                            twoStepVerificationActivity3.Z = 0;
                                            twoStepVerificationActivity3.f34129b0 = gc1Var;
                                            unVar3.presentFragment(twoStepVerificationActivity3);
                                        }
                                    });
                                    alertDialog$Builder2.h(cd.L0(2131752589, null), null);
                                    unVar2.showDialog(alertDialog$Builder2.f20134a);
                                }
                            } else if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(qzVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            i0.g3(new yg(qzVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z19, jjVar4, keyboardButtonProto2, unVar2));
                                        }
                                    }, 8);
                                } else if (twoStepVerificationActivity2 != null) {
                                    twoStepVerificationActivity2.s0();
                                    twoStepVerificationActivity2.finishFragment();
                                }
                            } else {
                                if (twoStepVerificationActivity2 != null) {
                                    twoStepVerificationActivity2.s0();
                                }
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(unVar2.getParentActivity());
                                alertDialog$Builder3.f20134a.R = cd.L0(2131751298, null);
                                LinearLayout linearLayout = new LinearLayout(unVar2.getParentActivity());
                                linearLayout.setPadding(i0.L(24.0f), i0.L(2.0f), i0.L(24.0f), 0);
                                linearLayout.setOrientation(1);
                                alertDialog$Builder3.o(linearLayout);
                                TextView textView4 = new TextView(unVar2.getParentActivity());
                                int i19 = org.telegram.ui.ActionBar.t6.f21037j5;
                                org.telegram.ui.ActionBar.a7.V(textView4, i19, null);
                                textView4.setTextSize(1, 16.0f);
                                if (cd.X) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                textView4.setGravity(i12 | 48);
                                m5.q("BotOwnershipTransferAlertText", null, 2131753018, new Object[0], textView4);
                                linearLayout.addView(textView4, w7.b6.o(-1, -2));
                                LinearLayout linearLayout2 = new LinearLayout(unVar2.getParentActivity());
                                linearLayout2.setOrientation(0);
                                linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                ImageView imageView = new ImageView(unVar2.getParentActivity());
                                imageView.setImageResource(2131231624);
                                if (cd.X) {
                                    i13 = i0.L(11.0f);
                                } else {
                                    i13 = 0;
                                }
                                int L3 = i0.L(9.0f);
                                if (cd.X) {
                                    L = 0;
                                } else {
                                    L = i0.L(11.0f);
                                }
                                imageView.setPadding(i13, L3, L, 0);
                                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                org.telegram.ui.ActionBar.a7.t(imageView, i19, null, mode);
                                TextView textView5 = new TextView(unVar2.getParentActivity());
                                org.telegram.ui.ActionBar.a7.V(textView5, i19, null);
                                textView5.setTextSize(1, 16.0f);
                                if (cd.X) {
                                    i14 = 5;
                                } else {
                                    i14 = 3;
                                }
                                textView5.setGravity(i14 | 48);
                                textView5.setText(i0.W2(cd.L0(2131751301, null)));
                                if (cd.X) {
                                    linearLayout2.addView(textView5, w7.b6.o(-1, -2));
                                    linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
                                } else {
                                    linearLayout2.addView(imageView, w7.b6.o(-2, -2));
                                    linearLayout2.addView(textView5, w7.b6.o(-1, -2));
                                }
                                LinearLayout linearLayout3 = new LinearLayout(unVar2.getParentActivity());
                                linearLayout3.setOrientation(0);
                                linearLayout.addView(linearLayout3, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                ImageView imageView2 = new ImageView(unVar2.getParentActivity());
                                imageView2.setImageResource(2131231624);
                                if (cd.X) {
                                    i15 = i0.L(11.0f);
                                } else {
                                    i15 = 0;
                                }
                                int L4 = i0.L(9.0f);
                                if (cd.X) {
                                    L2 = 0;
                                } else {
                                    L2 = i0.L(11.0f);
                                }
                                imageView2.setPadding(i15, L4, L2, 0);
                                org.telegram.ui.ActionBar.a7.t(imageView2, i19, null, mode);
                                TextView textView6 = new TextView(unVar2.getParentActivity());
                                org.telegram.ui.ActionBar.a7.V(textView6, i19, null);
                                textView6.setTextSize(1, 16.0f);
                                if (cd.X) {
                                    i16 = 5;
                                } else {
                                    i16 = 3;
                                }
                                textView6.setGravity(i16 | 48);
                                textView6.setText(i0.W2(cd.L0(2131751300, null)));
                                if (cd.X) {
                                    linearLayout3.addView(textView6, w7.b6.o(-1, -2));
                                    i17 = 5;
                                    linearLayout3.addView(imageView2, w7.b6.r(-2, -2, 5));
                                } else {
                                    i17 = 5;
                                    linearLayout3.addView(imageView2, w7.b6.o(-2, -2));
                                    linearLayout3.addView(textView6, w7.b6.o(-1, -2));
                                }
                                if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                    alertDialog$Builder3.k(cd.L0(2131751292, null), new s1(unVar2, 15));
                                    alertDialog$Builder3.h(cd.L0(2131752589, null), null);
                                } else {
                                    TextView textView7 = new TextView(unVar2.getParentActivity());
                                    org.telegram.ui.ActionBar.a7.V(textView7, i19, null);
                                    textView7.setTextSize(1, 16.0f);
                                    if (cd.X) {
                                        i18 = i17;
                                    } else {
                                        i18 = 3;
                                    }
                                    m5.l(textView7, i18 | 48, null, 2131751299);
                                    linearLayout.addView(textView7, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                    alertDialog$Builder3.h(cd.L0(2131747847, null), null);
                                }
                                unVar2.showDialog(alertDialog$Builder3.f20134a);
                            }
                        }
                    }
                });
                return;
        }
    }

    public zx(qz qzVar, TLObject tLObject, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f19777b = qzVar;
        this.f19778c = tLObject;
        this.d = jjVar;
        this.e = str;
        this.f19779f = czVar;
        this.f19780g = z10;
        this.h = czVar2;
        this.f19781i = obj;
        this.f19782j = hashMap;
        this.f19783k = z11;
        this.f19784l = message;
    }

    public zx(qz qzVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f19777b = qzVar;
        this.f19784l = tL_messages_addPollAnswer;
        this.f19778c = tLObject;
        this.d = jjVar;
        this.e = str;
        this.f19779f = czVar;
        this.f19780g = z10;
        this.h = czVar2;
        this.f19781i = obj;
        this.f19782j = hashMap;
        this.f19783k = z11;
    }
}
