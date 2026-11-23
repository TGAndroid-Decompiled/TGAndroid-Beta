package org.telegram.ui.Components;

import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class yd implements z4, org.telegram.messenger.nc {
    public final String f42429a;
    public final boolean f42430b;
    public final org.telegram.messenger.fs f42431c;
    public final Object d;
    public final Object f42432e;
    public final Object f42433f;

    public yd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10) {
        this.f42431c = chatActivityEnterView;
        this.d = document;
        this.f42429a = str;
        this.f42432e = obj;
        this.f42433f = bjVar;
        this.f42430b = z10;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f42431c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.f42433f;
        int i11 = ChatActivityEnterView.f32633s7;
        chatActivityEnterView.d(document, this.f42429a, this.f42432e, bjVar, this.f42430b, z10, i7, i10);
    }

    @Override
    public void a(String str) {
        boolean z10;
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f42431c;
        boolean[] zArr = (boolean[]) this.f42432e;
        bi.i5 i5Var = (bi.i5) this.f42433f;
        RectF rectF = ProfileActivity.Z6;
        ((String[]) this.d)[0] = str;
        if (str != null && ((!str.equals(this.f42429a) || str.equals("und")) && ((this.f42430b && !org.telegram.ui.ry0.d0().contains(str)) || ((chat = profileActivity.F2) != null && ((chat.has_link || org.telegram.messenger.v3.t0(chat)) && ("uk".equals(str) || "ru".equals(str))))))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        i5Var.run();
    }

    public yd(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z10, bi.i5 i5Var) {
        this.f42431c = profileActivity;
        this.d = strArr;
        this.f42432e = zArr;
        this.f42429a = str;
        this.f42430b = z10;
        this.f42433f = i5Var;
    }
}
