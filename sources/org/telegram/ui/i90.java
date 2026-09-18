package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i90 implements Runnable {
    public final int f34518a;
    public final Object f34519b;
    public final Object f34520c;
    public final Object d;
    public final Object e;
    public final Object f34521f;

    public i90(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f34518a = i10;
        this.f34519b = callback;
        this.d = tLObject;
        this.f34520c = obj;
        this.f34521f = tL_error;
        this.e = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i90.run():void");
    }

    public i90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f34518a = i10;
        this.f34519b = obj;
        this.f34520c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f34521f = obj5;
    }

    public i90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.f34518a = i10;
        this.f34519b = obj;
        this.d = tLObject;
        this.f34520c = obj2;
        this.e = obj3;
        this.f34521f = tL_error;
    }

    public i90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f34518a = i10;
        this.f34519b = obj;
        this.f34521f = tL_error;
        this.f34520c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public i90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f34518a = i10;
        this.f34519b = obj;
        this.f34521f = tL_error;
        this.d = tLObject;
        this.f34520c = obj2;
        this.e = obj3;
    }

    public i90(TLObject tLObject, MessagesController messagesController, ai.e4 e4Var, tg.h hVar, TLRPC.TL_error tL_error) {
        this.f34518a = 27;
        this.d = tLObject;
        this.f34519b = messagesController;
        this.f34520c = e4Var;
        this.e = hVar;
        this.f34521f = tL_error;
    }

    public i90(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f34518a = i10;
        this.f34521f = tL_error;
        this.f34519b = callback;
        this.d = tLObject;
        this.f34520c = messagesController;
        this.e = callback2;
    }

    public i90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var, oa0 oa0Var, TLRPC.TL_error tL_error) {
        this.f34518a = 3;
        this.f34519b = launchActivity;
        this.d = tLObject;
        this.e = c2Var;
        this.f34520c = oa0Var;
        this.f34521f = tL_error;
    }

    public i90(ek0 ek0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f34518a = 11;
        this.f34519b = ek0Var;
        this.f34520c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f34521f = tL_error;
        this.e = tL_contacts_importContacts;
    }
}
