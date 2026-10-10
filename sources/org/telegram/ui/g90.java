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
public final class g90 implements Runnable {
    public final int f37990a;
    public final Object f37991b;
    public final Object f37992c;
    public final Object d;
    public final Object f37993e;
    public final Object f37994f;

    public g90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f37990a = i10;
        this.f37991b = obj;
        this.f37992c = obj2;
        this.d = obj3;
        this.f37993e = obj4;
        this.f37994f = obj5;
    }

    private final void a() {
        String h;
        String jSONObject;
        SharedPreferences.Editor edit;
        org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f37991b;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f37992c;
        org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f37993e;
        org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f37994f;
        try {
            jSONObject = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
            edit = MessagesController.getMainSettings(e2Var.f34858a).edit();
        } catch (Exception e7) {
            h = org.telegram.ui.Wallet.e2.h("save transfer", e7);
        }
        if (edit.putString(org.telegram.ui.Wallet.e2.j(a2Var.f34648a.f20303id, a2Var.f34649b) + ".transfer", jSONObject).commit()) {
            h = null;
            AndroidUtilities.runOnUIThread(new ai.a9(e2Var, h, callback, a2Var, h0Var, sendtransfer, 15));
            return;
        }
        throw new IllegalStateException("Could not save signed transfer");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g90.run():void");
    }

    public g90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.f37990a = i10;
        this.f37991b = obj;
        this.d = tLObject;
        this.f37992c = obj2;
        this.f37993e = obj3;
        this.f37994f = tL_error;
    }

    public g90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37990a = i10;
        this.f37991b = obj;
        this.f37994f = tL_error;
        this.f37992c = obj2;
        this.d = obj3;
        this.f37993e = obj4;
    }

    public g90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f37990a = i10;
        this.f37991b = obj;
        this.f37994f = tL_error;
        this.d = tLObject;
        this.f37992c = obj2;
        this.f37993e = obj3;
    }

    public g90(org.telegram.ui.Components.yw0 yw0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f37990a = i10;
        this.f37991b = yw0Var;
        this.d = tLObject;
        this.f37992c = bundle;
        this.f37994f = tL_error;
        this.f37993e = tLObject2;
    }

    public g90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, m70 m70Var, TLRPC.TL_error tL_error) {
        this.f37990a = 3;
        this.f37991b = launchActivity;
        this.d = tLObject;
        this.f37993e = b2Var;
        this.f37992c = m70Var;
        this.f37994f = tL_error;
    }

    public g90(dk0 dk0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f37990a = 11;
        this.f37991b = dk0Var;
        this.f37992c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f37994f = tL_error;
        this.f37993e = tL_contacts_importContacts;
    }
}
