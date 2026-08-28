package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d implements Utilities.Callback2 {
    public final int f27600a;
    public final Object f27601b;

    public d(Object obj, int i9) {
        this.f27600a = i9;
        this.f27601b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        wy wyVar = (wy) this.f27601b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        fy fyVar = wyVar.N1;
        if (fyVar != null && (fyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) wyVar.N1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) wyVar.N1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                Emoji.emojiColor.remove(str2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = CompoundEmoji.skinTones.get(num.intValue());
                }
                sb2.append(str);
                sb2.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = CompoundEmoji.skinTones.get(num2.intValue());
                }
                sb2.append(str3);
                Emoji.emojiColor.put(str2, sb2.toString());
            }
            Emoji.saveEmojiColors();
        }
    }

    private final void b(Object obj, Object obj2) {
        vx vxVar = (vx) this.f27601b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = vxVar.f34017s;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj3 = arrayList2.get(i9);
            i9++;
            ox oxVar = (ox) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = oxVar.f31458b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f22407id != vxVar.d) {
                    z10 = false;
                }
                int i10 = xx.f34800a;
                l41 J = l41.J(xx.class);
                long j10 = tL_messages_stickerSet.set.f22407id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.f30333e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = oxVar.f31457a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f22407id != vxVar.d) {
                        z10 = false;
                    }
                    arrayList.add(xx.a(stickerSetCovered, oxVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        ry ryVar = (ry) this.f27601b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = ryVar.A;
        int size = arrayList2.size();
        int i9 = 0;
        while (true) {
            boolean z11 = true;
            if (i9 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i9);
            i9++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f22407id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f22407id, 1);
                if (tL_messages_stickerSet.set.f22407id != ryVar.d) {
                    z11 = false;
                }
                int i10 = xx.f34800a;
                l41 J = l41.J(xx.class);
                long j10 = tL_messages_stickerSet.set.f22407id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.f30333e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = ryVar.F;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            ox oxVar = (ox) obj4;
            TLRPC.StickerSet stickerSet = oxVar.f31459c;
            if (longSparseIntArray.indexOfKey(stickerSet.f22407id) < 0) {
                longSparseIntArray.append(stickerSet.f22407id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = oxVar.f31457a;
                if (stickerSet.f22407id == ryVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(xx.a(stickerSetCovered, oxVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f27601b;
        float[] fArr = FragmentContextView.I0;
        fragmentContextView.f26402v0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.R;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.D;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i9;
        n30 n30Var = (n30) this.f27601b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        n30Var.f31009c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(n30Var.f31007a).history);
        if (n30Var.f31009c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < n30Var.f31009c.size(); i10++) {
            String str = (String) n30Var.f31009c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i9 = R.drawable.menu_cashtag;
                } else {
                    i9 = R.drawable.menu_hashtag;
                }
                arrayList.add(l41.c(i10 + 1, i9, str.substring(1)));
            }
        }
        arrayList.add(l41.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ih.h6 h6Var;
        o30 o30Var = (o30) this.f27601b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = o30Var.K;
        int i9 = 0;
        if (o30Var.L && (h6Var = o30Var.M) != null && h6Var.f11851i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ih.h6 h6Var2 = o30Var.M;
            int i10 = of.h1.f19362a;
            l41 J = l41.J(of.h1.class);
            J.G = h6Var2;
            arrayList.add(J);
        }
        o30Var.N = z10;
        while (i9 < arrayList2.size()) {
            int i11 = i9 + 1;
            l41 l41Var = new l41(33);
            l41Var.d = i11;
            l41Var.G = (MessageObject) arrayList2.get(i9);
            arrayList.add(l41Var);
            i9 = i11;
        }
        if (o30Var.O || !o30Var.R) {
            arrayList.add(l41.o(-2, 1));
            arrayList.add(l41.o(-3, 1));
            arrayList.add(l41.o(-4, 1));
        }
        if (!o30Var.N && z10) {
            AndroidUtilities.runOnUIThread(new np(o30Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        v60 v60Var = (v60) this.f27601b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        x60 x60Var = v60Var.f33280x;
        x60Var.f34557f.setAlpha(1.0f);
        if (x60Var.f34582u) {
            v60Var.f33273c = bitmap;
        }
        ng.b bVar = x60Var.f34571n;
        if (bVar != null) {
            bVar.a(bitmap2);
            og.d.c(x60Var.f34571n, v60Var);
            ViewGroup viewGroup = x60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        kg0 kg0Var = (kg0) this.f27601b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = kg0Var.f30079e;
        ArrayList arrayList3 = kg0Var.f30081n;
        int i9 = 0;
        if (kg0Var.d == null) {
            arrayList.add(l41.o(-1, 7));
            arrayList.add(l41.o(-2, 7));
            arrayList.add(l41.o(-3, 7));
            kg0Var.M = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(kg0Var.f30084w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(l41.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i9 < size) {
                Object obj3 = arrayList2.get(i9);
                i9++;
                l41 l41Var = new l41(33);
                l41Var.G = (MessageObject) obj3;
                arrayList.add(l41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(l41.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i9 < size2) {
                Object obj4 = arrayList3.get(i9);
                i9++;
                l41 l41Var2 = new l41(33);
                l41Var2.G = (MessageObject) obj4;
                arrayList.add(l41Var2);
            }
        }
        if (kg0Var.v || ((kg0Var.I && !kg0Var.J) || (!isEmpty && !arrayList3.isEmpty() && !kg0Var.f30083s))) {
            arrayList.add(l41.o(kg0Var.H * 3, 7));
            arrayList.add(l41.o((kg0Var.H * 3) + 1, 7));
            arrayList.add(l41.o((kg0Var.H * 3) + 2, 7));
        }
        kg0Var.M = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        ll0 ll0Var = (ll0) this.f27601b;
        ll0Var.f30472c = (Bitmap) obj;
        Paint paint = new Paint(1);
        ll0Var.f30473e = paint;
        Bitmap bitmap = ll0Var.f30472c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        ll0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        ll0Var.f30474f = new Matrix();
        ng.b bVar = ll0Var.h;
        bVar.a((Bitmap) obj2);
        og.d.c(bVar, ll0Var.f30477s);
        ViewGroup viewGroup = ll0Var.f30480y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        cx0 cx0Var = (cx0) this.f27601b;
        CharSequence charSequence = (CharSequence) obj;
        cx0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(cx0Var.O.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new w1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
