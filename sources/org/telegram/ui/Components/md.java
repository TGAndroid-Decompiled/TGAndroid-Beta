package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class md implements r4, org.telegram.messenger.jc {
    public final String f36124a;
    public final boolean f36125b;
    public final org.telegram.messenger.cs f36126c;
    public final Object d;
    public final Object f36127e;
    public final Object f36128f;

    public md(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.vi viVar, boolean z10) {
        this.f36126c = chatActivityEnterView;
        this.d = document;
        this.f36124a = str;
        this.f36127e = obj;
        this.f36128f = viVar;
        this.f36125b = z10;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f36126c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.vi viVar = (org.telegram.messenger.vi) this.f36128f;
        int i11 = ChatActivityEnterView.f31082t5;
        chatActivityEnterView.a(document, this.f36124a, this.f36127e, viVar, this.f36125b, z10, i3, i10);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f36126c;
        boolean[] zArr = (boolean[]) this.f36127e;
        ai.d3 d3Var = (ai.d3) this.f36128f;
        RectF rectF = ProfileActivity.T6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f36124a) || str.equals("und")) && ((this.f36125b && !org.telegram.ui.gy0.d0().contains(str)) || ((chat = profileActivity.E2) != null && ((chat.has_link || org.telegram.messenger.t3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d3Var.run();
    }

    public md(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, ai.d3 d3Var) {
        this.f36126c = profileActivity;
        this.d = strArr;
        this.f36127e = zArr;
        this.f36124a = str;
        this.f36125b = z10;
        this.f36128f = d3Var;
    }
}
