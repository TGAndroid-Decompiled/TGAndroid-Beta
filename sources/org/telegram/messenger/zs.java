package org.telegram.messenger;

import android.content.Context;
import android.util.Base64;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
public final class zs implements n10 {
    public final int f26970a = 0;
    public final int f26971b;
    public final Object f26972c;
    public final Object d;

    public zs(int i3, Context context, n10 n10Var) {
        this.f26972c = n10Var;
        this.d = context;
        this.f26971b = i3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        org.telegram.ui.ActionBar.d2 T;
        int i3 = this.f26970a;
        Object obj3 = this.d;
        Object obj4 = this.f26972c;
        switch (i3) {
            case 0:
                final n10 n10Var = (n10) obj4;
                Context context = (Context) obj3;
                v0.c cVar = (v0.c) obj;
                Throwable th2 = (Throwable) obj2;
                if (!(th2 instanceof w0.b) && !(th2 instanceof w0.e)) {
                    if (th2 instanceof w0.f) {
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        n10Var.a(null, "CANCELLED");
                                        return;
                                    default:
                                        n10Var.a(null, "EMPTY");
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (th2 != null) {
                        a8.g(th2, true);
                        g0.h3(new pq(15, n10Var, th2));
                        return;
                    } else {
                        TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                        try {
                            JSONObject jSONObject = new JSONObject(cVar.f56425a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                            TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
                            registerpasskey.credential = inputpasskeycredentialpublickey;
                            inputpasskeycredentialpublickey.f27212id = jSONObject.getString("id");
                            registerpasskey.credential.raw_id = jSONObject.getString("rawId");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                            TL_account.inputPasskeyResponseRegister inputpasskeyresponseregister = new TL_account.inputPasskeyResponseRegister();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            inputpasskeyresponseregister.client_data = tL_dataJSON;
                            tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
                            inputpasskeyresponseregister.attestation_object = Base64.decode(jSONObject2.getString("attestationObject"), 8);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("AAGUID: ");
                            byte[] copyOfRange = Arrays.copyOfRange(inputpasskeyresponseregister.attestation_object, 67, 83);
                            StringBuilder sb3 = new StringBuilder(copyOfRange.length * 2);
                            int length = copyOfRange.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                sb3.append(String.format("%02x", Byte.valueOf(copyOfRange[i10])));
                            }
                            sb2.append(sb3.toString());
                            a8.b(sb2.toString());
                            registerpasskey.credential.response = inputpasskeyresponseregister;
                            g0.h3(new vf(context, this.f26971b, registerpasskey, n10Var, 16));
                            return;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            g0.h3(new at(n10Var, e10, 1));
                            return;
                        }
                    }
                }
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                n10Var.a(null, "CANCELLED");
                                return;
                            default:
                                n10Var.a(null, "EMPTY");
                                return;
                        }
                    }
                });
                return;
            default:
                u10 u10Var = (u10) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((x00) obj4).G;
                int i11 = this.f26971b;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i11));
                    u10Var.a(tL_textWithEntities);
                    return;
                } else if (tL_error != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (T = LaunchActivity.T()) != null) {
                        org.telegram.ui.Components.ac K = org.telegram.ui.Components.fc.a0(T).K(2131624216, bd.M0(2131744341, null), bd.M0(2131744340, null), new hn(3, T));
                        K.f31792j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i11));
                    u10Var.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    public zs(x00 x00Var, int i3, u10 u10Var) {
        this.f26972c = x00Var;
        this.f26971b = i3;
        this.d = u10Var;
    }
}
