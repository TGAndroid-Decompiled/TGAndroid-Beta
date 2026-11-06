package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class od implements t4, org.telegram.messenger.pc {
    public final String f36701a;
    public final boolean f36702b;
    public final org.telegram.messenger.ls f36703c;
    public final Object d;
    public final Object f36704e;
    public final Object f36705f;

    public od(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9) {
        this.f36703c = chatActivityEnterView;
        this.d = document;
        this.f36701a = str;
        this.f36704e = obj;
        this.f36705f = ejVar;
        this.f36702b = z9;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f36703c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) this.f36705f;
        int i11 = ChatActivityEnterView.s5;
        chatActivityEnterView.a(document, this.f36701a, this.f36704e, ejVar, this.f36702b, z9, i7, i10);
    }

    @Override
    public void a(String str) {
        boolean z9;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f36703c;
        boolean[] zArr = (boolean[]) this.f36704e;
        jg.c1 c1Var = (jg.c1) this.f36705f;
        RectF rectF = ProfileActivity.S6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f36701a) || str.equals("und")) && ((this.f36702b && !org.telegram.ui.qy0.d0().contains(str)) || ((chat = profileActivity.D2) != null && ((chat.has_link || org.telegram.messenger.t3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z9 = true;
        } else {
            z9 = false;
        }
        zArr[0] = z9;
        c1Var.run();
    }

    public od(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z9, jg.c1 c1Var) {
        this.f36703c = profileActivity;
        this.d = strArr;
        this.f36704e = zArr;
        this.f36701a = str;
        this.f36702b = z9;
        this.f36705f = c1Var;
    }
}
