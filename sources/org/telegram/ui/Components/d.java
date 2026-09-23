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
    public final int f23168a;
    public final Object f23169b;

    public d(Object obj, int i10) {
        this.f23168a = i10;
        this.f23169b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        lz lzVar = (lz) this.f23169b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        uy uyVar = lzVar.R1;
        if (uyVar != null && (uyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) lzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) lzVar.R1.getTag();
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
        ky kyVar = (ky) this.f23169b;
        ArrayList arrayList = (ArrayList) obj;
        v51 v51Var = (v51) obj2;
        ArrayList arrayList2 = kyVar.f25718s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            dy dyVar = (dy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dyVar.f23485b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f18110id != kyVar.d) {
                    z10 = false;
                }
                int i11 = my.f26287a;
                h51 J = h51.J(my.class);
                long j3 = tL_messages_stickerSet.set.f18110id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = dyVar.f23484a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f18110id != kyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(my.a(stickerSetCovered, dyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        gz gzVar = (gz) this.f23169b;
        ArrayList arrayList = (ArrayList) obj;
        v51 v51Var = (v51) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = gzVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f18110id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f18110id, 1);
                if (tL_messages_stickerSet.set.f18110id != gzVar.d) {
                    z11 = false;
                }
                int i11 = my.f26287a;
                h51 J = h51.J(my.class);
                long j3 = tL_messages_stickerSet.set.f18110id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = gzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            dy dyVar = (dy) obj4;
            TLRPC.StickerSet stickerSet = dyVar.f23486c;
            if (longSparseIntArray.indexOfKey(stickerSet.f18110id) < 0) {
                longSparseIntArray.append(stickerSet.f18110id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = dyVar.f23484a;
                if (stickerSet.f18110id == gzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(my.a(stickerSetCovered, dyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f23169b;
        float[] fArr = FragmentContextView.O0;
        fragmentContextView.f22038z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        b1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        e40 e40Var = (e40) this.f23169b;
        ArrayList arrayList = (ArrayList) obj;
        v51 v51Var = (v51) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        e40Var.f23558c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(e40Var.f23556a).history);
        if (e40Var.f23558c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < e40Var.f23558c.size(); i11++) {
            String str = (String) e40Var.f23558c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(h51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(h51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ai.v8 v8Var;
        f40 f40Var = (f40) this.f23169b;
        ArrayList arrayList = (ArrayList) obj;
        v51 v51Var = (v51) obj2;
        ArrayList arrayList2 = f40Var.O;
        int i10 = 0;
        if (f40Var.P && (v8Var = f40Var.Q) != null && v8Var.f725i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.v8 v8Var2 = f40Var.Q;
            int i11 = gg.m1.f9845a;
            h51 J = h51.J(gg.m1.class);
            J.G = v8Var2;
            arrayList.add(J);
        }
        f40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            h51 h51Var = new h51(33);
            h51Var.d = i12;
            h51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(h51Var);
            i10 = i12;
        }
        if (f40Var.S || !f40Var.V) {
            arrayList.add(h51.o(-2, 1));
            arrayList.add(h51.o(-3, 1));
            arrayList.add(h51.o(-4, 1));
        }
        if (!f40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new yp(f40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        m70 m70Var = (m70) this.f23169b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        o70 o70Var = m70Var.f26110x;
        o70Var.f26646f.setAlpha(1.0f);
        if (o70Var.f26671u) {
            m70Var.f26104c = bitmap;
        }
        fh.b bVar = o70Var.f26660n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(o70Var.f26660n, m70Var);
            ViewGroup viewGroup = o70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        zg0 zg0Var = (zg0) this.f23169b;
        ArrayList arrayList = (ArrayList) obj;
        v51 v51Var = (v51) obj2;
        ArrayList arrayList2 = zg0Var.e;
        ArrayList arrayList3 = zg0Var.f30589n;
        int i10 = 0;
        if (zg0Var.d == null) {
            arrayList.add(h51.o(-1, 7));
            arrayList.add(h51.o(-2, 7));
            arrayList.add(h51.o(-3, 7));
            zg0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(zg0Var.f30592w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(h51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                h51 h51Var = new h51(33);
                h51Var.G = (MessageObject) obj3;
                arrayList.add(h51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(h51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                h51 h51Var2 = new h51(33);
                h51Var2.G = (MessageObject) obj4;
                arrayList.add(h51Var2);
            }
        }
        if (zg0Var.v || ((zg0Var.M && !zg0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !zg0Var.f30591s))) {
            arrayList.add(h51.o(zg0Var.L * 3, 7));
            arrayList.add(h51.o((zg0Var.L * 3) + 1, 7));
            arrayList.add(h51.o((zg0Var.L * 3) + 2, 7));
        }
        zg0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        bm0 bm0Var = (bm0) this.f23169b;
        bm0Var.f22782c = (Bitmap) obj;
        Paint paint = new Paint(1);
        bm0Var.e = paint;
        Bitmap bitmap = bm0Var.f22782c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        bm0Var.f22783f = new Matrix();
        fh.b bVar = bm0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, bm0Var.f22786s);
        ViewGroup viewGroup = bm0Var.f22789y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        ux0 ux0Var = (ux0) this.f23169b;
        CharSequence charSequence = (CharSequence) obj;
        ux0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(ux0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
