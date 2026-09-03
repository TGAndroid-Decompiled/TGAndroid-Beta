package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class c30 implements Runnable {
    public final int f33008a;
    public final Object f33009b;
    public final Object f33010c;
    public final Object d;
    public final Object e;

    public c30(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33008a = i10;
        this.f33009b = obj;
        this.f33010c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.f33010c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        int[] iArr = (int[]) this.e;
        if (!(((TLObject) this.f33009b) instanceof TLRPC.TL_boolTrue)) {
            profileActivity.getClass();
            org.telegram.ui.Components.qc.a0(profileActivity).d0(tL_error, false);
        }
        if (profileActivity.f32083l4 == iArr[0]) {
            profileActivity.f32083l4 = 0;
        }
    }

    private final void b() {
        TLObject chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f33010c;
        TLObject tLObject = (TLObject) this.f33009b;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            if (profileActivity.f32011b1 != 0) {
                chat = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32011b1));
            } else {
                chat = profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f32019c1));
            }
            f20.a(profileActivity.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.f32155w0);
            return;
        }
        org.telegram.ui.Components.qc.b0(tL_error);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c30.run():void");
    }

    public c30(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f33008a = i10;
        this.f33010c = obj;
        this.d = obj2;
        this.f33009b = tLObject;
        this.e = obj3;
    }

    public c30(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f33008a = i10;
        this.f33010c = obj;
        this.f33009b = tLObject;
        this.d = obj2;
        this.e = obj3;
    }

    public c30(tf0 tf0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f33008a = 11;
        this.f33010c = tf0Var;
        this.d = tL_error;
        this.e = bundle;
        this.f33009b = tLObject;
    }
}
