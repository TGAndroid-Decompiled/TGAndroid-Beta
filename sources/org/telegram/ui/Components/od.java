package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class od implements t4, org.telegram.messenger.pc {
    public final String f36702a;
    public final boolean f36703b;
    public final org.telegram.messenger.ls f36704c;
    public final Object d;
    public final Object f36705e;
    public final Object f36706f;

    public od(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9) {
        this.f36704c = chatActivityEnterView;
        this.d = document;
        this.f36702a = str;
        this.f36705e = obj;
        this.f36706f = ejVar;
        this.f36703b = z9;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f36704c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) this.f36706f;
        int i11 = ChatActivityEnterView.s5;
        chatActivityEnterView.a(document, this.f36702a, this.f36705e, ejVar, this.f36703b, z9, i7, i10);
    }

    @Override
    public void a(String str) {
        boolean z9;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f36704c;
        boolean[] zArr = (boolean[]) this.f36705e;
        jg.c1 c1Var = (jg.c1) this.f36706f;
        RectF rectF = ProfileActivity.V6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f36702a) || str.equals("und")) && ((this.f36703b && !org.telegram.ui.ty0.d0().contains(str)) || ((chat = profileActivity.D2) != null && ((chat.has_link || org.telegram.messenger.t3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z9 = true;
        } else {
            z9 = false;
        }
        zArr[0] = z9;
        c1Var.run();
    }

    public od(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z9, jg.c1 c1Var) {
        this.f36704c = profileActivity;
        this.d = strArr;
        this.f36705e = zArr;
        this.f36702a = str;
        this.f36703b = z9;
        this.f36706f = c1Var;
    }
}
