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
    public final int f23161a;
    public final Object f23162b;

    public d(Object obj, int i10) {
        this.f23161a = i10;
        this.f23162b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        kz kzVar = (kz) this.f23162b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ty tyVar = kzVar.R1;
        if (tyVar != null && (tyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) kzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) kzVar.R1.getTag();
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
        jy jyVar = (jy) this.f23162b;
        ArrayList arrayList = (ArrayList) obj;
        x51 x51Var = (x51) obj2;
        ArrayList arrayList2 = jyVar.f25462s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            cy cyVar = (cy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cyVar.f23154b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f18148id != jyVar.d) {
                    z10 = false;
                }
                int i11 = ly.f25984a;
                j51 J = j51.J(ly.class);
                long j3 = tL_messages_stickerSet.set.f18148id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = cyVar.f23153a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f18148id != jyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(ly.a(stickerSetCovered, cyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        fz fzVar = (fz) this.f23162b;
        ArrayList arrayList = (ArrayList) obj;
        x51 x51Var = (x51) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = fzVar.E;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i10);
            i10++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f18148id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f18148id, 1);
                if (tL_messages_stickerSet.set.f18148id != fzVar.d) {
                    z11 = false;
                }
                int i11 = ly.f25984a;
                j51 J = j51.J(ly.class);
                long j3 = tL_messages_stickerSet.set.f18148id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = fzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            cy cyVar = (cy) obj4;
            TLRPC.StickerSet stickerSet = cyVar.f23155c;
            if (longSparseIntArray.indexOfKey(stickerSet.f18148id) < 0) {
                longSparseIntArray.append(stickerSet.f18148id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = cyVar.f23153a;
                if (stickerSet.f18148id == fzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(ly.a(stickerSetCovered, cyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f23162b;
        float[] fArr = FragmentContextView.M0;
        fragmentContextView.f22077z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        d40 d40Var = (d40) this.f23162b;
        ArrayList arrayList = (ArrayList) obj;
        x51 x51Var = (x51) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        d40Var.f23206c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(d40Var.f23204a).history);
        if (d40Var.f23206c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < d40Var.f23206c.size(); i11++) {
            String str = (String) d40Var.f23206c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(j51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(j51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ai.v8 v8Var;
        e40 e40Var = (e40) this.f23162b;
        ArrayList arrayList = (ArrayList) obj;
        x51 x51Var = (x51) obj2;
        ArrayList arrayList2 = e40Var.O;
        int i10 = 0;
        if (e40Var.P && (v8Var = e40Var.Q) != null && v8Var.f721i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.v8 v8Var2 = e40Var.Q;
            int i11 = gg.m1.f9863a;
            j51 J = j51.J(gg.m1.class);
            J.G = v8Var2;
            arrayList.add(J);
        }
        e40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            j51 j51Var = new j51(33);
            j51Var.d = i12;
            j51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(j51Var);
            i10 = i12;
        }
        if (e40Var.S || !e40Var.V) {
            arrayList.add(j51.o(-2, 1));
            arrayList.add(j51.o(-3, 1));
            arrayList.add(j51.o(-4, 1));
        }
        if (!e40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new xp(e40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        l70 l70Var = (l70) this.f23162b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        n70 n70Var = l70Var.f25847x;
        n70Var.f26361f.setAlpha(1.0f);
        if (n70Var.f26386u) {
            l70Var.f25841c = bitmap;
        }
        fh.b bVar = n70Var.f26375n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(n70Var.f26375n, l70Var);
            ViewGroup viewGroup = n70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        zg0 zg0Var = (zg0) this.f23162b;
        ArrayList arrayList = (ArrayList) obj;
        x51 x51Var = (x51) obj2;
        ArrayList arrayList2 = zg0Var.e;
        ArrayList arrayList3 = zg0Var.f30519n;
        int i10 = 0;
        if (zg0Var.d == null) {
            arrayList.add(j51.o(-1, 7));
            arrayList.add(j51.o(-2, 7));
            arrayList.add(j51.o(-3, 7));
            zg0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(zg0Var.f30522w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(j51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                j51 j51Var = new j51(33);
                j51Var.G = (MessageObject) obj3;
                arrayList.add(j51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(j51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                j51 j51Var2 = new j51(33);
                j51Var2.G = (MessageObject) obj4;
                arrayList.add(j51Var2);
            }
        }
        if (zg0Var.v || ((zg0Var.M && !zg0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !zg0Var.f30521s))) {
            arrayList.add(j51.o(zg0Var.L * 3, 7));
            arrayList.add(j51.o((zg0Var.L * 3) + 1, 7));
            arrayList.add(j51.o((zg0Var.L * 3) + 2, 7));
        }
        zg0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        bm0 bm0Var = (bm0) this.f23162b;
        bm0Var.f22767c = (Bitmap) obj;
        Paint paint = new Paint(1);
        bm0Var.e = paint;
        Bitmap bitmap = bm0Var.f22767c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        bm0Var.f22768f = new Matrix();
        fh.b bVar = bm0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, bm0Var.f22771s);
        ViewGroup viewGroup = bm0Var.f22774y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        wx0 wx0Var = (wx0) this.f23162b;
        CharSequence charSequence = (CharSequence) obj;
        wx0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(wx0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new x1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
