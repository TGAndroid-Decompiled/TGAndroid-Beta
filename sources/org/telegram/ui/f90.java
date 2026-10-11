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
public final class f90 implements Runnable {
    public final int f37608a;
    public final Object f37609b;
    public final Object f37610c;
    public final Object d;
    public final Object f37611e;
    public final Object f37612f;

    public f90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f37608a = i10;
        this.f37609b = obj;
        this.f37610c = obj2;
        this.d = obj3;
        this.f37611e = obj4;
        this.f37612f = obj5;
    }

    private final void a() {
        String h;
        String jSONObject;
        SharedPreferences.Editor edit;
        org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f37609b;
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f37610c;
        org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f37611e;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f37612f;
        try {
            jSONObject = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
            edit = MessagesController.getMainSettings(f2Var.f34890a).edit();
        } catch (Exception e7) {
            h = org.telegram.ui.Wallet.f2.h("save transfer", e7);
        }
        if (edit.putString(org.telegram.ui.Wallet.f2.j(b2Var.f34676a.f20293id, b2Var.f34677b) + ".transfer", jSONObject).commit()) {
            h = null;
            AndroidUtilities.runOnUIThread(new ai.a9(f2Var, h, callback, b2Var, i0Var, sendtransfer, 15));
            return;
        }
        throw new IllegalStateException("Could not save signed transfer");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f90.run():void");
    }

    public f90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.f37608a = i10;
        this.f37609b = obj;
        this.d = tLObject;
        this.f37610c = obj2;
        this.f37611e = obj3;
        this.f37612f = tL_error;
    }

    public f90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37608a = i10;
        this.f37609b = obj;
        this.f37612f = tL_error;
        this.f37610c = obj2;
        this.d = obj3;
        this.f37611e = obj4;
    }

    public f90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f37608a = i10;
        this.f37609b = obj;
        this.f37612f = tL_error;
        this.d = tLObject;
        this.f37610c = obj2;
        this.f37611e = obj3;
    }

    public f90(org.telegram.ui.Components.zw0 zw0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f37608a = i10;
        this.f37609b = zw0Var;
        this.d = tLObject;
        this.f37610c = bundle;
        this.f37612f = tL_error;
        this.f37611e = tLObject2;
    }

    public f90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, n70 n70Var, TLRPC.TL_error tL_error) {
        this.f37608a = 3;
        this.f37609b = launchActivity;
        this.d = tLObject;
        this.f37611e = a2Var;
        this.f37610c = n70Var;
        this.f37612f = tL_error;
    }

    public f90(ck0 ck0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f37608a = 11;
        this.f37609b = ck0Var;
        this.f37610c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f37612f = tL_error;
        this.f37611e = tL_contacts_importContacts;
    }
}
