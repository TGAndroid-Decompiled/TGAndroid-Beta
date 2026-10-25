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
    public final int f27316a;
    public final Object f27317b;

    public d(Object obj, int i10) {
        this.f27316a = i10;
        this.f27317b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        sz szVar = (sz) this.f27317b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        bz bzVar = szVar.R1;
        if (bzVar != null && (bzVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) szVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) szVar.R1.getTag();
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
        sy syVar = (sy) this.f27317b;
        ArrayList arrayList = (ArrayList) obj;
        j71 j71Var = (j71) obj2;
        ArrayList arrayList2 = syVar.f32703s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            jy jyVar = (jy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jyVar.f29732b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f22054id != syVar.d) {
                    z10 = false;
                }
                int i11 = uy.f33505a;
                t61 K = t61.K(uy.class);
                long j10 = tL_messages_stickerSet.set.f22054id;
                K.d = (int) ((j10 >>> 32) ^ j10);
                K.B = j10;
                K.G = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = jyVar.f29731a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f22054id != syVar.d) {
                        z10 = false;
                    }
                    arrayList.add(uy.a(stickerSetCovered, jyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        nz nzVar = (nz) this.f27317b;
        ArrayList arrayList = (ArrayList) obj;
        j71 j71Var = (j71) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = nzVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f22054id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f22054id, 1);
                if (tL_messages_stickerSet.set.f22054id != nzVar.d) {
                    z11 = false;
                }
                int i11 = uy.f33505a;
                t61 K = t61.K(uy.class);
                long j10 = tL_messages_stickerSet.set.f22054id;
                K.d = (int) ((j10 >>> 32) ^ j10);
                K.B = j10;
                K.G = tL_messages_stickerSet;
                K.e = z11;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = nzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            jy jyVar = (jy) obj4;
            TLRPC.StickerSet stickerSet = jyVar.f29733c;
            if (longSparseIntArray.indexOfKey(stickerSet.f22054id) < 0) {
                longSparseIntArray.append(stickerSet.f22054id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = jyVar.f29731a;
                if (stickerSet.f22054id == nzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(uy.a(stickerSetCovered, jyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f27317b;
        float[] fArr = FragmentContextView.W0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.W;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        o40 o40Var = (o40) this.f27317b;
        ArrayList arrayList = (ArrayList) obj;
        j71 j71Var = (j71) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        o40Var.f31152c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(o40Var.f31150a).history);
        if (o40Var.f31152c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < o40Var.f31152c.size(); i11++) {
            String str = (String) o40Var.f31152c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(t61.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(t61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        di.t6 t6Var;
        p40 p40Var = (p40) this.f27317b;
        ArrayList arrayList = (ArrayList) obj;
        j71 j71Var = (j71) obj2;
        ArrayList arrayList2 = p40Var.Q;
        int i10 = 0;
        if (p40Var.R && (t6Var = p40Var.S) != null && t6Var.f9493i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            di.t6 t6Var2 = p40Var.S;
            int i11 = ig.l1.f14159a;
            t61 K = t61.K(ig.l1.class);
            K.G = t6Var2;
            arrayList.add(K);
        }
        p40Var.T = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            t61 t61Var = new t61(33);
            t61Var.d = i12;
            t61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(t61Var);
            i10 = i12;
        }
        if (p40Var.U || !p40Var.X) {
            arrayList.add(t61.q(-2, 1));
            arrayList.add(t61.q(-3, 1));
            arrayList.add(t61.q(-4, 1));
        }
        if (!p40Var.T && z10) {
            AndroidUtilities.runOnUIThread(new bq(p40Var, 22));
        }
    }

    private final void g(Object obj, Object obj2) {
        i80 i80Var = (i80) this.f27317b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        k80 k80Var = i80Var.f29216x;
        k80Var.f29843f.setAlpha(1.0f);
        if (k80Var.f29868u) {
            i80Var.f29210c = bitmap;
        }
        hh.b bVar = k80Var.f29857n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(k80Var.f29857n, i80Var);
            ViewGroup viewGroup = k80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        wh0 wh0Var = (wh0) this.f27317b;
        ArrayList arrayList = (ArrayList) obj;
        j71 j71Var = (j71) obj2;
        ArrayList arrayList2 = wh0Var.e;
        ArrayList arrayList3 = wh0Var.f34443n;
        int i10 = 0;
        if (wh0Var.d == null) {
            arrayList.add(t61.q(-1, 7));
            arrayList.add(t61.q(-2, 7));
            arrayList.add(t61.q(-3, 7));
            wh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(wh0Var.f34446w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(t61.r(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                t61 t61Var = new t61(33);
                t61Var.G = (MessageObject) obj3;
                arrayList.add(t61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(t61.r(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                t61 t61Var2 = new t61(33);
                t61Var2.G = (MessageObject) obj4;
                arrayList.add(t61Var2);
            }
        }
        if (wh0Var.v || ((wh0Var.M && !wh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !wh0Var.f34445s))) {
            arrayList.add(t61.q(wh0Var.L * 3, 7));
            arrayList.add(t61.q((wh0Var.L * 3) + 1, 7));
            arrayList.add(t61.q((wh0Var.L * 3) + 2, 7));
        }
        wh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        hn0 hn0Var = (hn0) this.f27317b;
        hn0Var.f29020c = (Bitmap) obj;
        Paint paint = new Paint(1);
        hn0Var.e = paint;
        Bitmap bitmap = hn0Var.f29020c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        hn0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        hn0Var.f29021f = new Matrix();
        hh.b bVar = hn0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, hn0Var.f29024s);
        ViewGroup viewGroup = hn0Var.f29027y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        cz0 cz0Var = (cz0) this.f27317b;
        CharSequence charSequence = (CharSequence) obj;
        cz0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(cz0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new b2((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
