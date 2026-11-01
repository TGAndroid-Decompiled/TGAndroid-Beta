package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class id implements q4, org.telegram.messenger.rc {
    public final String f27081a;
    public final boolean f27082b;
    public final org.telegram.messenger.vs f27083c;
    public final Object d;
    public final Object e;
    public final Object f27084f;

    public id(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.gj gjVar, boolean z10) {
        this.f27083c = chatActivityEnterView;
        this.d = document;
        this.f27081a = str;
        this.e = obj;
        this.f27084f = gjVar;
        this.f27082b = z10;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27083c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f27084f;
        int i12 = ChatActivityEnterView.f23673s5;
        chatActivityEnterView.a(document, this.f27081a, this.e, gjVar, this.f27082b, z10, i10, i11);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f27083c;
        boolean[] zArr = (boolean[]) this.e;
        org.telegram.messenger.ge geVar = (org.telegram.messenger.ge) this.f27084f;
        RectF rectF = ProfileActivity.S6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f27081a) || str.equals("und")) && ((this.f27082b && !org.telegram.ui.e01.d0().contains(str)) || ((chat = profileActivity.D2) != null && ((chat.has_link || org.telegram.messenger.w3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        geVar.run();
    }

    public id(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, org.telegram.messenger.ge geVar) {
        this.f27083c = profileActivity;
        this.d = strArr;
        this.e = zArr;
        this.f27081a = str;
        this.f27082b = z10;
        this.f27084f = geVar;
    }
}
