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
    public final int f25531a;
    public final Object f25532b;

    public d(Object obj, int i10) {
        this.f25531a = i10;
        this.f25532b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        a00 a00Var = (a00) this.f25532b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        iz izVar = a00Var.R1;
        if (izVar != null && (izVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) a00Var.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) a00Var.R1.getTag();
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
        zy zyVar = (zy) this.f25532b;
        ArrayList arrayList = (ArrayList) obj;
        c71 c71Var = (c71) obj2;
        ArrayList arrayList2 = zyVar.f33679s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            sy syVar = (sy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = syVar.f30949b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f20065id != zyVar.d) {
                    z10 = false;
                }
                int i11 = bz.f25182a;
                p61 J = p61.J(bz.class);
                long j3 = tL_messages_stickerSet.set.f20065id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.f29728e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = syVar.f30948a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f20065id != zyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(bz.a(stickerSetCovered, syVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        vz vzVar = (vz) this.f25532b;
        ArrayList arrayList = (ArrayList) obj;
        c71 c71Var = (c71) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = vzVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f20065id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f20065id, 1);
                if (tL_messages_stickerSet.set.f20065id != vzVar.d) {
                    z11 = false;
                }
                int i11 = bz.f25182a;
                p61 J = p61.J(bz.class);
                long j3 = tL_messages_stickerSet.set.f20065id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.f29728e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = vzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            sy syVar = (sy) obj4;
            TLRPC.StickerSet stickerSet = syVar.f30950c;
            if (longSparseIntArray.indexOfKey(stickerSet.f20065id) < 0) {
                longSparseIntArray.append(stickerSet.f20065id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = syVar.f30948a;
                if (stickerSet.f20065id == vzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(bz.a(stickerSetCovered, syVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f25532b;
        float[] fArr = FragmentContextView.Q0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.W;
        org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        b1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        u40 u40Var = (u40) this.f25532b;
        ArrayList arrayList = (ArrayList) obj;
        c71 c71Var = (c71) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        u40Var.f31366c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(u40Var.f31364a).history);
        if (u40Var.f31366c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < u40Var.f31366c.size(); i11++) {
            String str = (String) u40Var.f31366c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(p61.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(p61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ai.w8 w8Var;
        v40 v40Var = (v40) this.f25532b;
        ArrayList arrayList = (ArrayList) obj;
        c71 c71Var = (c71) obj2;
        ArrayList arrayList2 = v40Var.O;
        int i10 = 0;
        if (v40Var.P && (w8Var = v40Var.Q) != null && w8Var.f899i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.w8 w8Var2 = v40Var.Q;
            int i11 = gg.l1.f10714a;
            p61 J = p61.J(gg.l1.class);
            J.G = w8Var2;
            arrayList.add(J);
        }
        v40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            p61 p61Var = new p61(33);
            p61Var.d = i12;
            p61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(p61Var);
            i10 = i12;
        }
        if (v40Var.S || !v40Var.V) {
            arrayList.add(p61.o(-2, 1));
            arrayList.add(p61.o(-3, 1));
            arrayList.add(p61.o(-4, 1));
        }
        if (!v40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new nq(v40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        n80 n80Var = (n80) this.f25532b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        p80 p80Var = n80Var.f29076x;
        p80Var.f29766f.setAlpha(1.0f);
        if (p80Var.f29791u) {
            n80Var.f29069c = bitmap;
        }
        fh.b bVar = p80Var.f29780n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(p80Var.f29780n, n80Var);
            ViewGroup viewGroup = p80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        di0 di0Var = (di0) this.f25532b;
        ArrayList arrayList = (ArrayList) obj;
        c71 c71Var = (c71) obj2;
        ArrayList arrayList2 = di0Var.f25715e;
        ArrayList arrayList3 = di0Var.f25717n;
        int i10 = 0;
        if (di0Var.d == null) {
            arrayList.add(p61.o(-1, 7));
            arrayList.add(p61.o(-2, 7));
            arrayList.add(p61.o(-3, 7));
            di0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(di0Var.f25720w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(p61.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                p61 p61Var = new p61(33);
                p61Var.G = (MessageObject) obj3;
                arrayList.add(p61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(p61.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                p61 p61Var2 = new p61(33);
                p61Var2.G = (MessageObject) obj4;
                arrayList.add(p61Var2);
            }
        }
        if (di0Var.v || ((di0Var.M && !di0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !di0Var.f25719s))) {
            arrayList.add(p61.o(di0Var.L * 3, 7));
            arrayList.add(p61.o((di0Var.L * 3) + 1, 7));
            arrayList.add(p61.o((di0Var.L * 3) + 2, 7));
        }
        di0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        gn0 gn0Var = (gn0) this.f25532b;
        gn0Var.f26817c = (Bitmap) obj;
        Paint paint = new Paint(1);
        gn0Var.f26818e = paint;
        Bitmap bitmap = gn0Var.f26817c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        gn0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        gn0Var.f26819f = new Matrix();
        fh.b bVar = gn0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, gn0Var.f26822s);
        ViewGroup viewGroup = gn0Var.f26825y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        xy0 xy0Var = (xy0) this.f25532b;
        CharSequence charSequence = (CharSequence) obj;
        xy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(xy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
