package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class xd implements z4, org.telegram.messenger.nc {
    public final String f41985a;
    public final boolean f41986b;
    public final org.telegram.messenger.fs f41987c;
    public final Object d;
    public final Object f41988e;
    public final Object f41989f;

    public xd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10) {
        this.f41987c = chatActivityEnterView;
        this.d = document;
        this.f41985a = str;
        this.f41988e = obj;
        this.f41989f = bjVar;
        this.f41986b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f41987c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.f41989f;
        int i11 = ChatActivityEnterView.f32538n7;
        chatActivityEnterView.d(document, this.f41985a, this.f41988e, bjVar, this.f41986b, z10, i7, i10);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f41987c;
        boolean[] zArr = (boolean[]) this.f41988e;
        bi.d5 d5Var = (bi.d5) this.f41989f;
        RectF rectF = ProfileActivity.Z6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f41985a) || str.equals("und")) && ((this.f41986b && !org.telegram.ui.sy0.d0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || org.telegram.messenger.v3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        d5Var.run();
    }

    public xd(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, bi.d5 d5Var) {
        this.f41987c = profileActivity;
        this.d = strArr;
        this.f41988e = zArr;
        this.f41985a = str;
        this.f41986b = z10;
        this.f41989f = d5Var;
    }
}
