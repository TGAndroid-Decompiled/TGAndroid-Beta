package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements Utilities.Callback2 {
    public final int f27300a;
    public final Object f27301b;

    public d(Object obj, int i10) {
        this.f27300a = i10;
        this.f27301b = obj;
    }

    private final void a(Object obj, Object obj2) {
        int i10;
        int i11;
        final zo0 zo0Var = (zo0) this.f27301b;
        ArrayList arrayList = (ArrayList) obj;
        k71 k71Var = (k71) obj2;
        ArrayList arrayList2 = zo0Var.R;
        ArrayList arrayList3 = zo0Var.X;
        int i12 = zo0Var.P;
        int i13 = 0;
        if (TextUtils.isEmpty(zo0Var.f27925d0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String string = LocaleController.getString(R.string.SearchMyChannels);
                    if (zo0Var.W) {
                        i11 = R.string.ShowLess;
                    } else {
                        i11 = R.string.ShowMore;
                    }
                    arrayList.add(u61.s(string, LocaleController.getString(i11), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    zo0 zo0Var2 = zo0Var;
                                    zo0Var2.W = !zo0Var2.W;
                                    zo0Var2.O(true);
                                    if (zo0Var2.W) {
                                        AndroidUtilities.hideKeyboard(zo0Var2.f35405f0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    zo0 zo0Var3 = zo0Var;
                                    zo0Var3.V = !zo0Var3.V;
                                    zo0Var3.O(true);
                                    if (zo0Var3.V) {
                                        AndroidUtilities.hideKeyboard(zo0Var3.f35405f0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(u61.r(LocaleController.getString(R.string.SearchMyChannels)));
                }
                int size = arrayList3.size();
                if (!zo0Var.W) {
                    size = Math.min(5, size);
                }
                for (int i14 = 0; i14 < size; i14++) {
                    u61 w10 = u61.w((TLObject) arrayList3.get(i14));
                    w10.I = true;
                    arrayList.add(w10);
                }
            }
            MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i12).getCachedChannelRecommendations(0L);
            if (cachedChannelRecommendations != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList<TLObject> arrayList5 = cachedChannelRecommendations.chats;
                int size2 = arrayList5.size();
                int i15 = 0;
                while (i15 < size2) {
                    TLObject tLObject = arrayList5.get(i15);
                    i15++;
                    TLObject tLObject2 = tLObject;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(chat.f22028id));
                        if (ChatObject.isNotInChat(chat) && (chat2 == null || ChatObject.isNotInChat(chat2))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(u61.r(LocaleController.getString(R.string.SearchRecommendedChannels)));
                }
                int size3 = arrayList4.size();
                while (i13 < size3) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    arrayList.add(u61.w((TLRPC.Chat) obj3));
                }
                return;
            }
            arrayList.add(u61.p(30));
            arrayList.add(u61.p(29));
            arrayList.add(u61.p(29));
            arrayList.add(u61.p(29));
            arrayList.add(u61.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = zo0Var.S;
        int size4 = arrayList7.size();
        int i16 = 0;
        while (i16 < size4) {
            Object obj4 = arrayList7.get(i16);
            i16++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj4;
            TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(chat3.f22028id));
            if (ChatObject.isNotInChat(chat3) && (chat4 == null || ChatObject.isNotInChat(chat4))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList8 = zo0Var.T;
        int size5 = arrayList8.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj5 = arrayList8.get(i17);
            i17++;
            TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
            TLRPC.Chat chat6 = MessagesController.getInstance(i12).getChat(Long.valueOf(chat5.f22028id));
            if (ChatObject.isNotInChat(chat5) && (chat6 == null || ChatObject.isNotInChat(chat6))) {
                arrayList6.add(chat5);
            }
        }
        ArrayList arrayList9 = zo0Var.U;
        int size6 = arrayList9.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj6 = arrayList9.get(i18);
            i18++;
            TLRPC.Chat chat7 = (TLRPC.Chat) obj6;
            TLRPC.Chat chat8 = MessagesController.getInstance(i12).getChat(Long.valueOf(chat7.f22028id));
            if (ChatObject.isNotInChat(chat7) && (chat8 == null || ChatObject.isNotInChat(chat8))) {
                arrayList6.add(chat7);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String string2 = LocaleController.getString(R.string.SearchChannels);
                if (zo0Var.V) {
                    i10 = R.string.ShowLess;
                } else {
                    i10 = R.string.ShowMore;
                }
                arrayList.add(u61.s(string2, LocaleController.getString(i10), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                zo0 zo0Var2 = zo0Var;
                                zo0Var2.W = !zo0Var2.W;
                                zo0Var2.O(true);
                                if (zo0Var2.W) {
                                    AndroidUtilities.hideKeyboard(zo0Var2.f35405f0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                zo0 zo0Var3 = zo0Var;
                                zo0Var3.V = !zo0Var3.V;
                                zo0Var3.O(true);
                                if (zo0Var3.V) {
                                    AndroidUtilities.hideKeyboard(zo0Var3.f35405f0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(u61.r(LocaleController.getString(R.string.SearchChannels)));
            }
            int size7 = arrayList6.size();
            if (!zo0Var.V && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(u61.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(u61.r(LocaleController.getString(R.string.SearchMessages)));
            int size8 = arrayList2.size();
            while (i13 < size8) {
                Object obj7 = arrayList2.get(i13);
                i13++;
                u61 u61Var = new u61(33);
                u61Var.G = (MessageObject) obj7;
                arrayList.add(u61Var);
            }
            if (zo0Var.f27922a0) {
                arrayList.add(u61.p(1));
            }
        }
    }

    private final void b(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f27301b;
        float[] fArr = FragmentContextView.W0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.W;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void c(Object obj, Object obj2) {
        int i10;
        o40 o40Var = (o40) this.f27301b;
        ArrayList arrayList = (ArrayList) obj;
        k71 k71Var = (k71) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        o40Var.f31156c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(o40Var.f31154a).history);
        if (o40Var.f31156c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < o40Var.f31156c.size(); i11++) {
            String str = (String) o40Var.f31156c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(u61.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(u61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void d(Object obj, Object obj2) {
        boolean z10;
        di.t6 t6Var;
        p40 p40Var = (p40) this.f27301b;
        ArrayList arrayList = (ArrayList) obj;
        k71 k71Var = (k71) obj2;
        ArrayList arrayList2 = p40Var.Q;
        int i10 = 0;
        if (p40Var.R && (t6Var = p40Var.S) != null && t6Var.f9492i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            di.t6 t6Var2 = p40Var.S;
            int i11 = ig.l1.f14158a;
            u61 K = u61.K(ig.l1.class);
            K.G = t6Var2;
            arrayList.add(K);
        }
        p40Var.T = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            u61 u61Var = new u61(33);
            u61Var.d = i12;
            u61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(u61Var);
            i10 = i12;
        }
        if (p40Var.U || !p40Var.X) {
            arrayList.add(u61.q(-2, 1));
            arrayList.add(u61.q(-3, 1));
            arrayList.add(u61.q(-4, 1));
        }
        if (!p40Var.T && z10) {
            AndroidUtilities.runOnUIThread(new cp(p40Var, 23));
        }
    }

    private final void e(Object obj, Object obj2) {
        j80 j80Var = (j80) this.f27301b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        l80 l80Var = j80Var.f29545x;
        l80Var.f30145f.setAlpha(1.0f);
        if (l80Var.f30170u) {
            j80Var.f29539c = bitmap;
        }
        hh.b bVar = l80Var.f30159n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(l80Var.f30159n, j80Var);
            ViewGroup viewGroup = l80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void f(Object obj, Object obj2) {
        xh0 xh0Var = (xh0) this.f27301b;
        ArrayList arrayList = (ArrayList) obj;
        k71 k71Var = (k71) obj2;
        ArrayList arrayList2 = xh0Var.e;
        ArrayList arrayList3 = xh0Var.f34771n;
        int i10 = 0;
        if (xh0Var.d == null) {
            arrayList.add(u61.q(-1, 7));
            arrayList.add(u61.q(-2, 7));
            arrayList.add(u61.q(-3, 7));
            xh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(xh0Var.f34774w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(u61.r(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                u61 u61Var = new u61(33);
                u61Var.G = (MessageObject) obj3;
                arrayList.add(u61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(u61.r(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                u61 u61Var2 = new u61(33);
                u61Var2.G = (MessageObject) obj4;
                arrayList.add(u61Var2);
            }
        }
        if (xh0Var.v || ((xh0Var.M && !xh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !xh0Var.f34773s))) {
            arrayList.add(u61.q(xh0Var.L * 3, 7));
            arrayList.add(u61.q((xh0Var.L * 3) + 1, 7));
            arrayList.add(u61.q((xh0Var.L * 3) + 2, 7));
        }
        xh0Var.Q = arrayList.isEmpty();
    }

    private final void g(Object obj, Object obj2) {
        in0 in0Var = (in0) this.f27301b;
        in0Var.f29391c = (Bitmap) obj;
        Paint paint = new Paint(1);
        in0Var.e = paint;
        Bitmap bitmap = in0Var.f29391c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        in0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        in0Var.f29392f = new Matrix();
        hh.b bVar = in0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, in0Var.f29395s);
        ViewGroup viewGroup = in0Var.f29398y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void h(Object obj, Object obj2) {
        dz0 dz0Var = (dz0) this.f27301b;
        CharSequence charSequence = (CharSequence) obj;
        dz0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(dz0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new b2((Utilities.Callback) obj2, 14));
    }

    private final void i(Object obj, Object obj2) {
        g51.p((g51) this.f27301b, (String) obj, (Boolean) obj2);
    }

    private final void j(Object obj, Object obj2) {
        ((n71) this.f27301b).V((ArrayList) obj, (k71) obj2);
    }

    @Override
    public final void run(java.lang.Object r30, java.lang.Object r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
