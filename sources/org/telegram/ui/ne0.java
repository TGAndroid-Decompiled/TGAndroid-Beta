package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.hs;
import org.telegram.messenger.kj;
import org.telegram.messenger.o5;
import org.telegram.messenger.pz;
import org.telegram.messenger.rz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nb1;
import org.telegram.ui.zx;
public final class ne0 implements View.OnClickListener {
    public final int f39883a = 0;
    public final int f39884b;
    public final long f39885c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f39886f;
    public final Object h;

    public ne0(re0 re0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = re0Var;
        this.e = str;
        this.f39885c = j10;
        this.f39886f = str2;
        this.h = str3;
        this.f39884b = i10;
    }

    @Override
    public final void onClick(View view) {
        sf.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.f39883a) {
            case 0:
                re0 re0Var = (re0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f39886f;
                String str3 = (String) this.h;
                vh.d dVar = re0Var.f41068b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f39885c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f39884b;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject u10 = xh.m2.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    re0Var.f41074w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new aa(re0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
            case 1:
                rh.e0 e0Var = (rh.e0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f39886f;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.h;
                if (e0Var.f46793q1.f51070c0) {
                    int i10 = this.f39884b;
                    if (org.telegram.messenger.wp.r1(i10).u2()) {
                        b.b(i10);
                        return;
                    }
                    rh.e6 x10 = rh.e6.x(i10, e0Var.f46801y1.f48265a);
                    if (x10.e) {
                        aVar = sf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!e0Var.f46787j1 && (aVar == null || aVar.f48266b < e0Var.f46801y1.f48266b)) {
                        sf.a aVar2 = e0Var.f46801y1;
                        sf.b bVar = aVar2.f48265a;
                        if (bVar == sf.b.f48267a) {
                            long a2 = aVar2.a();
                            long j10 = this.f39885c;
                            new rh.x7(context, p6Var, a2, 13, gg.e.h(i10, j10), null, j10).show();
                            return;
                        } else if (bVar == sf.b.f48268b) {
                            new wh.f(context, p6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    r20Var.a(new org.telegram.messenger.pj(e0Var.f46801y1, e0Var.f46802z1));
                    e0Var.dismiss();
                    return;
                }
                return;
            default:
                final xh.c1 c1Var = (xh.c1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f39886f;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.h;
                final org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    c1Var.T1 = true;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 1);
                    if (!tL_messages_preparedInlineMessage2.peer_types.isEmpty()) {
                        int i11 = 0;
                        bundle.putBoolean("allowGroups", false);
                        bundle.putBoolean("allowMegagroups", false);
                        bundle.putBoolean("allowLegacyGroups", false);
                        bundle.putBoolean("allowUsers", false);
                        bundle.putBoolean("allowChannels", false);
                        bundle.putBoolean("allowBots", false);
                        ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_messages_preparedInlineMessage2.peer_types;
                        int size = arrayList.size();
                        while (i11 < size) {
                            TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                            i11++;
                            TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                            org.telegram.ui.web.q qVar2 = qVar;
                            if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                z10 = true;
                                bundle.putBoolean("allowUsers", true);
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                            } else {
                                tL_messages_preparedInlineMessage = tL_messages_preparedInlineMessage2;
                                z10 = true;
                                if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                    bundle.putBoolean("allowBots", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                    bundle.putBoolean("allowChannels", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                    bundle.putBoolean("allowLegacyGroups", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                    bundle.putBoolean("allowMegagroups", true);
                                }
                            }
                            tL_messages_preparedInlineMessage2 = tL_messages_preparedInlineMessage;
                            qVar = qVar2;
                        }
                    }
                    org.telegram.ui.web.q qVar3 = qVar;
                    final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage3 = tL_messages_preparedInlineMessage2;
                    xh.a1 a1Var = new xh.a1(c1Var, bundle, eVar);
                    final int i12 = this.f39884b;
                    final long j11 = this.f39885c;
                    a1Var.C2 = new tx() {
                        @Override
                        public final boolean H() {
                            return false;
                        }

                        @Override
                        public final boolean O(zx zxVar) {
                            return false;
                        }

                        @Override
                        public final boolean z(zx zxVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i13, int i14, nb1 nb1Var) {
                            String str4;
                            TLRPC.TL_forumTopic f7;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i15 = 0;
                            while (true) {
                                str4 = null;
                                r5 = null;
                                r5 = null;
                                kj kjVar = null;
                                if (i15 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i15);
                                i15++;
                                hs hsVar = (hs) obj;
                                long j12 = hsVar.f16109a;
                                long j13 = hsVar.f16110b;
                                if (!o5.C(j12)) {
                                    int i16 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                                    int i17 = i12;
                                    if (i16 != 0 && (f7 = wp.r1(i17).f19234r7.f(-j12, j13)) != null && (message = f7.topicStartMessage) != null) {
                                        kjVar = new kj(i17, message, false, false);
                                        kjVar.f16708p = true;
                                    }
                                    kj kjVar2 = kjVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f19792id);
                                    hashMap.put("bot", "" + j11);
                                    rz.S(i13, j12, 0L, 0L, hashMap, org.telegram.messenger.c.a(i17), kjVar2, kjVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z12);
                                    if (charSequence != null) {
                                        rz.C(i17).r0(pz.b(charSequence.toString(), j12, kjVar2, kjVar2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j12));
                                }
                            }
                            c1 c1Var2 = c1.this;
                            if (!c1Var2.U1) {
                                c1Var2.U1 = true;
                                if (arrayList3.size() <= 0) {
                                    str4 = "USER_DECLINED";
                                }
                                eVar.a(str4, arrayList3);
                            }
                            if (nb1Var != null) {
                                nb1Var.finishFragment();
                                zxVar.removeSelfFromStack();
                                return true;
                            }
                            zxVar.finishFragment();
                            return true;
                        }
                    };
                    T.presentFragment(a1Var);
                    c1Var.dismiss();
                    qVar3.run();
                    return;
                }
                return;
        }
    }

    public ne0(rh.e0 e0Var, un unVar, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, org.telegram.messenger.r20 r20Var) {
        this.d = e0Var;
        this.f39884b = i10;
        this.e = context;
        this.f39886f = p6Var;
        this.f39885c = j10;
        this.h = r20Var;
    }

    public ne0(xh.c1 c1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, org.telegram.tgnet.e eVar, int i10, long j10, org.telegram.ui.web.q qVar) {
        this.d = c1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f39886f = eVar;
        this.f39884b = i10;
        this.f39885c = j10;
        this.h = qVar;
    }
}
