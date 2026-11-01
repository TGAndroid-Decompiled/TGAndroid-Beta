package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ze0;
public final class zt implements v0.h {
    public final ze0 f19761a;
    public final Context f19762b;
    public final int f19763c;

    public zt(ze0 ze0Var, Context context, int i10) {
        this.f19761a = ze0Var;
        this.f19762b = context;
        this.f19763c = i10;
    }

    @Override
    public final void g(Object obj) {
        w0.i iVar = (w0.i) obj;
        boolean z10 = iVar instanceof w0.k;
        ze0 ze0Var = this.f19761a;
        if (z10) {
            ze0Var.a(0L, null, "EMPTY");
        } else if (iVar instanceof w0.g) {
            ze0Var.a(0L, null, "CANCELLED");
        } else if (iVar instanceof w0.j) {
            ze0Var.a(0L, null, "CANCELLED");
        } else if (iVar != null) {
            ze0Var.a(0L, null, iVar.getMessage());
        }
    }

    @Override
    public final void onResult(Object obj) {
        final ze0 ze0Var = this.f19761a;
        b2.h hVar = ((v0.n) obj).f50293a;
        TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
        finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
        try {
            JSONObject jSONObject = new JSONObject(((Bundle) hVar.f2047a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
            finishpasskeylogin.credential.f20004id = jSONObject.getString("id");
            finishpasskeylogin.credential.raw_id = jSONObject.getString("rawId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            TL_account.inputPasskeyResponseLogin inputpasskeyresponselogin = new TL_account.inputPasskeyResponseLogin();
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            inputpasskeyresponselogin.client_data = tL_dataJSON;
            tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
            inputpasskeyresponselogin.authenticator_data = Base64.decode(jSONObject2.getString("authenticatorData"), 8);
            inputpasskeyresponselogin.signature = Base64.decode(jSONObject2.getString("signature"), 8);
            String str = new String(Base64.decode(jSONObject2.getString("userHandle"), 8));
            inputpasskeyresponselogin.user_handle = str;
            int parseInt = Integer.parseInt(str.split(":")[0]);
            final long parseLong = Long.parseLong(inputpasskeyresponselogin.user_handle.split(":")[1]);
            finishpasskeylogin.credential.response = inputpasskeyresponselogin;
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, this.f19762b, null);
            x1Var.r(500L);
            int i10 = this.f19763c;
            if (parseInt != ConnectionsManager.getInstance(i10).getCurrentDatacenterId()) {
                int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                long currentAuthKeyId = ConnectionsManager.getInstance(i10).getCurrentAuthKeyId();
                ConnectionsManager.getInstance(i10).setDefaultDatacenterId(parseInt);
                finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                finishpasskeylogin.from_dc_id = currentDatacenterId;
                finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
            }
            final int sendRequestTyped = ConnectionsManager.getInstance(i10).sendRequestTyped(finishpasskeylogin, new a3.b(1), new s9(x1Var, ze0Var, parseLong, 3), parseInt, 72);
            final int i11 = this.f19763c;
            x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(i11).cancelRequest(sendRequestTyped, true);
                    ze0Var.a(Long.valueOf(parseLong), null, "CANCELLED");
                }
            });
        } catch (Exception e) {
            f8.g(e, true);
            ze0Var.a(0L, null, e.getMessage());
        }
    }
}
