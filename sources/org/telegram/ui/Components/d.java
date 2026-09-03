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
    public final int f24067a;
    public final Object f24068b;

    public d(Object obj, int i10) {
        this.f24067a = i10;
        this.f24068b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        kz kzVar = (kz) this.f24068b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        sy syVar = kzVar.O1;
        if (syVar != null && (syVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) kzVar.O1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) kzVar.O1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                Emoji.emojiColor.remove(str2);
            } else {
                StringBuilder sb = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = CompoundEmoji.skinTones.get(num.intValue());
                }
                sb.append(str);
                sb.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = CompoundEmoji.skinTones.get(num2.intValue());
                }
                sb.append(str3);
                Emoji.emojiColor.put(str2, sb.toString());
            }
            Emoji.saveEmojiColors();
        }
    }

    private final void b(Object obj, Object obj2) {
        jy jyVar = (jy) this.f24068b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = jyVar.f26073s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ay ayVar = (ay) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ayVar.f23496b;
            boolean z4 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f19186id != jyVar.d) {
                    z4 = false;
                }
                int i11 = ly.f26893a;
                i51 J = i51.J(ly.class);
                long j10 = tL_messages_stickerSet.set.f19186id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z4;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = ayVar.f23495a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f19186id != jyVar.d) {
                        z4 = false;
                    }
                    arrayList.add(ly.a(stickerSetCovered, ayVar, z4));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z4;
        fz fzVar = (fz) this.f24068b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = fzVar.B;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i10);
            i10++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f19186id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f19186id, 1);
                if (tL_messages_stickerSet.set.f19186id != fzVar.d) {
                    z10 = false;
                }
                int i11 = ly.f26893a;
                i51 J = i51.J(ly.class);
                long j10 = tL_messages_stickerSet.set.f19186id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = fzVar.G;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            ay ayVar = (ay) obj4;
            TLRPC.StickerSet stickerSet = ayVar.f23497c;
            if (longSparseIntArray.indexOfKey(stickerSet.f19186id) < 0) {
                longSparseIntArray.append(stickerSet.f19186id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = ayVar.f23495a;
                if (stickerSet.f19186id == fzVar.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(ly.a(stickerSetCovered, ayVar, z4));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f24068b;
        float[] fArr = FragmentContextView.J0;
        fragmentContextView.f23025w0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z4 = fragmentContextView.S;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.E;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z4, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        g40 g40Var = (g40) this.f24068b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        g40Var.f25040c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(g40Var.f25038a).history);
        if (g40Var.f25040c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < g40Var.f25040c.size(); i11++) {
            String str = (String) g40Var.f25040c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(i51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(i51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z4;
        nh.f6 f6Var;
        h40 h40Var = (h40) this.f24068b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = h40Var.L;
        int i10 = 0;
        if (h40Var.M && (f6Var = h40Var.N) != null && f6Var.f15560i.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            nh.f6 f6Var2 = h40Var.N;
            int i11 = tf.w0.f44937a;
            i51 J = i51.J(tf.w0.class);
            J.G = f6Var2;
            arrayList.add(J);
        }
        h40Var.O = z4;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            i51 i51Var = new i51(33);
            i51Var.d = i12;
            i51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(i51Var);
            i10 = i12;
        }
        if (h40Var.P || !h40Var.S) {
            arrayList.add(i51.o(-2, 1));
            arrayList.add(i51.o(-3, 1));
            arrayList.add(i51.o(-4, 1));
        }
        if (!h40Var.O && z4) {
            AndroidUtilities.runOnUIThread(new up(h40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        n70 n70Var = (n70) this.f24068b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        p70 p70Var = n70Var.f27214x;
        p70Var.f27754f.setAlpha(1.0f);
        if (p70Var.f27779u) {
            n70Var.f27208c = bitmap;
        }
        sg.b bVar = p70Var.f27768n;
        if (bVar != null) {
            bVar.a(bitmap2);
            tg.c.c(p70Var.f27768n, n70Var);
            ViewGroup viewGroup = p70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        fh0 fh0Var = (fh0) this.f24068b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = fh0Var.e;
        ArrayList arrayList3 = fh0Var.f24891n;
        int i10 = 0;
        if (fh0Var.d == null) {
            arrayList.add(i51.o(-1, 7));
            arrayList.add(i51.o(-2, 7));
            arrayList.add(i51.o(-3, 7));
            fh0Var.N = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(fh0Var.f24894w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(i51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                i51 i51Var = new i51(33);
                i51Var.G = (MessageObject) obj3;
                arrayList.add(i51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(i51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                i51 i51Var2 = new i51(33);
                i51Var2.G = (MessageObject) obj4;
                arrayList.add(i51Var2);
            }
        }
        if (fh0Var.v || ((fh0Var.J && !fh0Var.K) || (!isEmpty && !arrayList3.isEmpty() && !fh0Var.f24893s))) {
            arrayList.add(i51.o(fh0Var.I * 3, 7));
            arrayList.add(i51.o((fh0Var.I * 3) + 1, 7));
            arrayList.add(i51.o((fh0Var.I * 3) + 2, 7));
        }
        fh0Var.N = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        hm0 hm0Var = (hm0) this.f24068b;
        hm0Var.f25450c = (Bitmap) obj;
        Paint paint = new Paint(1);
        hm0Var.e = paint;
        Bitmap bitmap = hm0Var.f25450c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        hm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        hm0Var.f25451f = new Matrix();
        sg.b bVar = hm0Var.h;
        bVar.a((Bitmap) obj2);
        tg.c.c(bVar, hm0Var.f25454s);
        ViewGroup viewGroup = hm0Var.f25457y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        xx0 xx0Var = (xx0) this.f24068b;
        CharSequence charSequence = (CharSequence) obj;
        xx0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(xx0Var.P.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
