package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.gs;
import org.telegram.messenger.jj;
import org.telegram.messenger.o5;
import org.telegram.messenger.oz;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
public final class oe0 implements View.OnClickListener {
    public final int f40247a = 0;
    public final int f40248b;
    public final long f40249c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f40250f;
    public final Object h;

    public oe0(se0 se0Var, String str, long j10, String str2, String str3, int i10) {
        this.d = se0Var;
        this.e = str;
        this.f40249c = j10;
        this.f40250f = str2;
        this.h = str3;
        this.f40248b = i10;
    }

    @Override
    public final void onClick(View view) {
        sf.a aVar;
        TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage;
        boolean z10;
        switch (this.f40247a) {
            case 0:
                se0 se0Var = (se0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f40250f;
                String str3 = (String) this.h;
                vh.d dVar = se0Var.f41485b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.f40249c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.f40248b;
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
                    se0Var.f41491w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new aa(se0Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 23), 74);
                    return;
                }
                return;
            case 1:
                rh.e0 e0Var = (rh.e0) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f40250f;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.h;
                if (e0Var.f46779q1.f51052c0) {
                    int i10 = this.f40248b;
                    if (org.telegram.messenger.vp.r1(i10).u2()) {
                        b.b(i10);
                        return;
                    }
                    rh.e6 x10 = rh.e6.x(i10, e0Var.f46787y1.f48254a);
                    if (x10.e) {
                        aVar = sf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (!e0Var.f46773j1 && (aVar == null || aVar.f48255b < e0Var.f46787y1.f48255b)) {
                        sf.a aVar2 = e0Var.f46787y1;
                        sf.b bVar = aVar2.f48254a;
                        if (bVar == sf.b.f48256a) {
                            long a2 = aVar2.a();
                            long j10 = this.f40249c;
                            new rh.x7(context, p6Var, a2, 13, gg.e.h(i10, j10), null, j10).show();
                            return;
                        } else if (bVar == sf.b.f48257b) {
                            new wh.f(context, p6Var, aVar2, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    q20Var.a(new org.telegram.messenger.oj(e0Var.f46787y1, e0Var.f46788z1));
                    e0Var.dismiss();
                    return;
                }
                return;
            default:
                final xh.c1 c1Var = (xh.c1) this.d;
                TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = (TLRPC.TL_messages_preparedInlineMessage) this.e;
                final org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) this.f40250f;
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
                    final int i12 = this.f40248b;
                    final long j11 = this.f40249c;
                    a1Var.C2 = new ux() {
                        @Override
                        public final boolean G() {
                            return false;
                        }

                        @Override
                        public final boolean N(ay ayVar) {
                            return false;
                        }

                        @Override
                        public final boolean y(ay ayVar, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i13, int i14, pb1 pb1Var) {
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
                                jj jjVar = null;
                                if (i15 >= size2) {
                                    break;
                                }
                                Object obj = arrayList2.get(i15);
                                i15++;
                                gs gsVar = (gs) obj;
                                long j12 = gsVar.f15760a;
                                long j13 = gsVar.f15761b;
                                if (!o5.C(j12)) {
                                    int i16 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                                    int i17 = i12;
                                    if (i16 != 0 && (f7 = vp.r1(i17).f18891r7.f(-j12, j13)) != null && (message = f7.topicStartMessage) != null) {
                                        jjVar = new jj(i17, message, false, false);
                                        jjVar.f16355p = true;
                                    }
                                    jj jjVar2 = jjVar;
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder("");
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage4 = tL_messages_preparedInlineMessage3;
                                    sb2.append(tL_messages_preparedInlineMessage4.query_id);
                                    hashMap.put("query_id", sb2.toString());
                                    hashMap.put("id", "" + tL_messages_preparedInlineMessage4.result.f19791id);
                                    hashMap.put("bot", "" + j11);
                                    qz.S(i13, j12, 0L, 0L, hashMap, org.telegram.messenger.c.a(i17), jjVar2, jjVar2, null, tL_messages_preparedInlineMessage4.result, null, T, null, z12);
                                    if (charSequence != null) {
                                        qz.C(i17).r0(oz.b(charSequence.toString(), j12, jjVar2, jjVar2, null, true, null, null, null, true, 0, 0, null, false));
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
                            if (pb1Var != null) {
                                pb1Var.finishFragment();
                                ayVar.removeSelfFromStack();
                                return true;
                            }
                            ayVar.finishFragment();
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

    public oe0(rh.e0 e0Var, un unVar, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, org.telegram.messenger.q20 q20Var) {
        this.d = e0Var;
        this.f40248b = i10;
        this.e = context;
        this.f40250f = p6Var;
        this.f40249c = j10;
        this.h = q20Var;
    }

    public oe0(xh.c1 c1Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, org.telegram.tgnet.e eVar, int i10, long j10, org.telegram.ui.web.q qVar) {
        this.d = c1Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f40250f = eVar;
        this.f40248b = i10;
        this.f40249c = j10;
        this.h = qVar;
    }
}
