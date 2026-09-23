package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d90 implements Runnable {
    public final int f32539a;
    public final Object f32540b;
    public final Object f32541c;
    public final Object d;
    public final Object e;
    public final Object f32542f;

    public d90(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f32539a = i10;
        this.f32540b = callback;
        this.d = tLObject;
        this.f32541c = obj;
        this.f32542f = tL_error;
        this.e = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d90.run():void");
    }

    public d90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f32539a = i10;
        this.f32540b = obj;
        this.f32541c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f32542f = obj5;
    }

    public d90(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.f32539a = i10;
        this.f32540b = obj;
        this.d = tLObject;
        this.f32541c = obj2;
        this.e = obj3;
        this.f32542f = tL_error;
    }

    public d90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f32539a = i10;
        this.f32540b = obj;
        this.f32542f = tL_error;
        this.f32541c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public d90(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f32539a = i10;
        this.f32540b = obj;
        this.f32542f = tL_error;
        this.d = tLObject;
        this.f32541c = obj2;
        this.e = obj3;
    }

    public d90(TLObject tLObject, MessagesController messagesController, ai.e4 e4Var, tg.h hVar, TLRPC.TL_error tL_error) {
        this.f32539a = 27;
        this.d = tLObject;
        this.f32540b = messagesController;
        this.f32541c = e4Var;
        this.e = hVar;
        this.f32542f = tL_error;
    }

    public d90(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.f32539a = i10;
        this.f32542f = tL_error;
        this.f32540b = callback;
        this.d = tLObject;
        this.f32541c = messagesController;
        this.e = callback2;
    }

    public d90(LaunchActivity launchActivity, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, ia0 ia0Var, TLRPC.TL_error tL_error) {
        this.f32539a = 3;
        this.f32540b = launchActivity;
        this.d = tLObject;
        this.e = b2Var;
        this.f32541c = ia0Var;
        this.f32542f = tL_error;
    }

    public d90(wj0 wj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        this.f32539a = 11;
        this.f32540b = wj0Var;
        this.f32541c = tL_contacts_importedContacts;
        this.d = tL_inputPhoneContact;
        this.f32542f = tL_error;
        this.e = tL_contacts_importContacts;
    }
}
