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
public final class l90 implements Runnable {
    public final int f37895a;
    public final Object f37896b;
    public final Object f37897c;
    public final Object d;
    public final Object e;
    public final Object f37898f;

    public l90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f37895a = i10;
        this.f37896b = obj;
        this.f37897c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f37898f = obj5;
    }

    private final void a() {
        String h;
        String jSONObject;
        SharedPreferences.Editor edit;
        org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.f37896b;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f37897c;
        org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) this.f37898f;
        try {
            jSONObject = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
            edit = MessagesController.getMainSettings(d2Var.f33040a).edit();
        } catch (Exception e) {
            h = org.telegram.ui.Wallet.d2.h("save transfer", e);
        }
        if (edit.putString(org.telegram.ui.Wallet.d2.j(z1Var.f33900a.f19475id, z1Var.f33901b) + ".transfer", jSONObject).commit()) {
            h = null;
            AndroidUtilities.runOnUIThread(new bi.k8(d2Var, h, callback, z1Var, g0Var, sendtransfer, 15));
            return;
        }
        throw new IllegalStateException("Could not save signed transfer");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l90.run():void");
    }

    public l90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.f37895a = i10;
        this.f37896b = obj;
        this.d = tLObject;
        this.f37897c = obj2;
        this.e = obj3;
        this.f37898f = tL_error;
    }

    public l90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37895a = i10;
        this.f37896b = obj;
        this.f37898f = tL_error;
        this.f37897c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public l90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f37895a = i10;
        this.f37896b = obj;
        this.f37898f = tL_error;
        this.d = tLObject;
        this.f37897c = obj2;
        this.e = obj3;
    }

    public l90(org.telegram.ui.Components.tw0 tw0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f37895a = i10;
        this.f37896b = tw0Var;
        this.d = tLObject;
        this.f37897c = bundle;
        this.f37898f = tL_error;
        this.e = tLObject2;
    }

    public l90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, o00 o00Var, TLRPC.TL_error tL_error) {
        this.f37895a = 3;
        this.f37896b = launchActivity;
        this.d = tLObject;
        this.e = a2Var;
        this.f37897c = o00Var;
        this.f37898f = tL_error;
    }

    public l90(ik0 ik0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f37895a = 11;
        this.f37896b = ik0Var;
        this.f37897c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f37898f = tL_error;
        this.e = tL_contacts_importContacts;
    }
}
