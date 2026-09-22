package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g90 implements Runnable {
    public final int f33797a;
    public final Object f33798b;
    public final Object f33799c;
    public final Object d;
    public final Object e;
    public final Object f33800f;

    public g90(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f33797a = i10;
        this.f33798b = callback;
        this.d = tLObject;
        this.f33799c = obj;
        this.f33800f = tL_error;
        this.e = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g90.run():void");
    }

    public g90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f33797a = i10;
        this.f33798b = obj;
        this.f33799c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f33800f = obj5;
    }

    public g90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.f33797a = i10;
        this.f33798b = obj;
        this.d = tLObject;
        this.f33799c = obj2;
        this.e = obj3;
        this.f33800f = tL_error;
    }

    public g90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33797a = i10;
        this.f33798b = obj;
        this.f33800f = tL_error;
        this.f33799c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public g90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f33797a = i10;
        this.f33798b = obj;
        this.f33800f = tL_error;
        this.d = tLObject;
        this.f33799c = obj2;
        this.e = obj3;
    }

    public g90(TLObject tLObject, MessagesController messagesController, ai.e4 e4Var, tg.h hVar, TLRPC.TL_error tL_error) {
        this.f33797a = 27;
        this.d = tLObject;
        this.f33798b = messagesController;
        this.f33799c = e4Var;
        this.e = hVar;
        this.f33800f = tL_error;
    }

    public g90(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f33797a = i10;
        this.f33800f = tL_error;
        this.f33798b = callback;
        this.d = tLObject;
        this.f33799c = messagesController;
        this.e = callback2;
    }

    public g90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, ma0 ma0Var, TLRPC.TL_error tL_error) {
        this.f33797a = 3;
        this.f33798b = launchActivity;
        this.d = tLObject;
        this.e = b2Var;
        this.f33799c = ma0Var;
        this.f33800f = tL_error;
    }

    public g90(ck0 ck0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f33797a = 11;
        this.f33798b = ck0Var;
        this.f33799c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f33800f = tL_error;
        this.e = tL_contacts_importContacts;
    }
}
