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
    public final int f38808a;
    public final Object f38809b;
    public final Object f38810c;
    public final Object d;
    public final Object f38811e;
    public final Object f38812f;

    public i90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f38808a = i10;
        this.f38809b = obj;
        this.f38810c = obj2;
        this.d = obj3;
        this.f38811e = obj4;
        this.f38812f = obj5;
    }

    private final void a() {
        String h;
        String jSONObject;
        SharedPreferences.Editor edit;
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f38809b;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f38810c;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f38811e;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f38812f;
        try {
            jSONObject = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
            edit = MessagesController.getMainSettings(f2Var.f34699a).edit();
        } catch (Exception e7) {
            h = org.telegram.ui.Wallet.f2.h("save transfer", e7);
        }
        if (edit.putString(org.telegram.ui.Wallet.f2.j(b2Var.f34485a.f20065id, b2Var.f34486b) + ".transfer", jSONObject).commit()) {
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
        this.f38808a = i10;
        this.f38809b = obj;
        this.d = tLObject;
        this.f38810c = obj2;
        this.f38811e = obj3;
        this.f38812f = tL_error;
    }

    public i90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f38808a = i10;
        this.f38809b = obj;
        this.f38812f = tL_error;
        this.f38810c = obj2;
        this.d = obj3;
        this.f38811e = obj4;
    }

    public i90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f38808a = i10;
        this.f38809b = obj;
        this.f38812f = tL_error;
        this.d = tLObject;
        this.f38810c = obj2;
        this.f38811e = obj3;
    }

    public i90(org.telegram.ui.Components.dx0 dx0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f38808a = i10;
        this.f38809b = dx0Var;
        this.d = tLObject;
        this.f38810c = bundle;
        this.f38812f = tL_error;
        this.f38811e = tLObject2;
    }

    public i90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, t70 t70Var, TLRPC.TL_error tL_error) {
        this.f38808a = 3;
        this.f38809b = launchActivity;
        this.d = tLObject;
        this.f38811e = a2Var;
        this.f38810c = t70Var;
        this.f38812f = tL_error;
    }

    public i90(ek0 ek0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f38808a = 11;
        this.f38809b = ek0Var;
        this.f38810c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f38812f = tL_error;
        this.f38811e = tL_contacts_importContacts;
    }
}
