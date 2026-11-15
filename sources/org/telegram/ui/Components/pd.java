package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class pd implements r4, org.telegram.messenger.oc {
    public final String f38284a;
    public final boolean f38285b;
    public final org.telegram.messenger.is f38286c;
    public final Object d;
    public final Object f38287e;
    public final Object f38288f;

    public pd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10) {
        this.f38286c = chatActivityEnterView;
        this.d = document;
        this.f38284a = str;
        this.f38287e = obj;
        this.f38288f = cjVar;
        this.f38285b = z10;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f38286c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) this.f38288f;
        int i11 = ChatActivityEnterView.N6;
        chatActivityEnterView.d(document, this.f38284a, this.f38287e, cjVar, this.f38285b, z10, i7, i10);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f38286c;
        boolean[] zArr = (boolean[]) this.f38287e;
        bi.u2 u2Var = (bi.u2) this.f38288f;
        RectF rectF = ProfileActivity.X6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f38284a) || str.equals("und")) && ((this.f38285b && !org.telegram.ui.oy0.d0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || org.telegram.messenger.t3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        u2Var.run();
    }

    public pd(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, bi.u2 u2Var) {
        this.f38286c = profileActivity;
        this.d = strArr;
        this.f38287e = zArr;
        this.f38284a = str;
        this.f38285b = z10;
        this.f38288f = u2Var;
    }
}
