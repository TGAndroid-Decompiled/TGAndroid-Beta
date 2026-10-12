package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class i90 implements Runnable {
    public final int f38811a;
    public final Object f38812b;
    public final Object f38813c;
    public final Object d;
    public final Object f38814e;
    public final Object f38815f;

    public i90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f38811a = i10;
        this.f38812b = obj;
        this.f38813c = obj2;
        this.d = obj3;
        this.f38814e = obj4;
        this.f38815f = obj5;
    }

    private final void a() {
        String h;
        String jSONObject;
        SharedPreferences.Editor edit;
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f38812b;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f38813c;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f38814e;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f38815f;
        try {
            jSONObject = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
            edit = MessagesController.getMainSettings(f2Var.f34701a).edit();
        } catch (Exception e7) {
            h = org.telegram.ui.Wallet.f2.h("save transfer", e7);
        }
        if (edit.putString(org.telegram.ui.Wallet.f2.j(b2Var.f34487a.f20066id, b2Var.f34488b) + ".transfer", jSONObject).commit()) {
            h = null;
            AndroidUtilities.runOnUIThread(new ai.a9(f2Var, h, callback, b2Var, i0Var, sendtransfer, 15));
            return;
        }
        throw new IllegalStateException("Could not save signed transfer");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i90.run():void");
    }

    public i90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.f38811a = i10;
        this.f38812b = obj;
        this.d = tLObject;
        this.f38813c = obj2;
        this.f38814e = obj3;
        this.f38815f = tL_error;
    }

    public i90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38811a = i10;
        this.f38812b = obj;
        this.f38815f = tL_error;
        this.f38813c = obj2;
        this.d = obj3;
        this.f38814e = obj4;
    }

    public i90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f38811a = i10;
        this.f38812b = obj;
        this.f38815f = tL_error;
        this.d = tLObject;
        this.f38813c = obj2;
        this.f38814e = obj3;
    }

    public i90(org.telegram.ui.Components.dx0 dx0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f38811a = i10;
        this.f38812b = dx0Var;
        this.d = tLObject;
        this.f38813c = bundle;
        this.f38815f = tL_error;
        this.f38814e = tLObject2;
    }

    public i90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, q70 q70Var, TLRPC.TL_error tL_error) {
        this.f38811a = 3;
        this.f38812b = launchActivity;
        this.d = tLObject;
        this.f38814e = a2Var;
        this.f38813c = q70Var;
        this.f38815f = tL_error;
    }

    public i90(ek0 ek0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f38811a = 11;
        this.f38812b = ek0Var;
        this.f38813c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f38815f = tL_error;
        this.f38814e = tL_contacts_importContacts;
    }
}
