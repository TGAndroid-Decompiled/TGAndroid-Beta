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
    public final int f25360a;
    public final Object f25361b;

    public d(Object obj, int i10) {
        this.f25360a = i10;
        this.f25361b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        b00 b00Var = (b00) this.f25361b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        jz jzVar = b00Var.R1;
        if (jzVar != null && (jzVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) b00Var.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) b00Var.R1.getTag();
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
        az azVar = (az) this.f25361b;
        ArrayList arrayList = (ArrayList) obj;
        e71 e71Var = (e71) obj2;
        ArrayList arrayList2 = azVar.f24641s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ty tyVar = (ty) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tyVar.f31182b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f20059id != azVar.d) {
                    z10 = false;
                }
                int i11 = cz.f25359a;
                r61 J = r61.J(cz.class);
                long j3 = tL_messages_stickerSet.set.f20059id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.f30355e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = tyVar.f31181a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f20059id != azVar.d) {
                        z10 = false;
                    }
                    arrayList.add(cz.a(stickerSetCovered, tyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        wz wzVar = (wz) this.f25361b;
        ArrayList arrayList = (ArrayList) obj;
        e71 e71Var = (e71) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = wzVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f20059id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f20059id, 1);
                if (tL_messages_stickerSet.set.f20059id != wzVar.d) {
                    z11 = false;
                }
                int i11 = cz.f25359a;
                r61 J = r61.J(cz.class);
                long j3 = tL_messages_stickerSet.set.f20059id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.f30355e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = wzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            ty tyVar = (ty) obj4;
            TLRPC.StickerSet stickerSet = tyVar.f31183c;
            if (longSparseIntArray.indexOfKey(stickerSet.f20059id) < 0) {
                longSparseIntArray.append(stickerSet.f20059id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = tyVar.f31181a;
                if (stickerSet.f20059id == wzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(cz.a(stickerSetCovered, tyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f25361b;
        float[] fArr = FragmentContextView.Q0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.W;
        org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        a1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        v40 v40Var = (v40) this.f25361b;
        ArrayList arrayList = (ArrayList) obj;
        e71 e71Var = (e71) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        v40Var.f31674c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(v40Var.f31672a).history);
        if (v40Var.f31674c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < v40Var.f31674c.size(); i11++) {
            String str = (String) v40Var.f31674c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(r61.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(r61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ai.w8 w8Var;
        w40 w40Var = (w40) this.f25361b;
        ArrayList arrayList = (ArrayList) obj;
        e71 e71Var = (e71) obj2;
        ArrayList arrayList2 = w40Var.O;
        int i10 = 0;
        if (w40Var.P && (w8Var = w40Var.Q) != null && w8Var.f899i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.w8 w8Var2 = w40Var.Q;
            int i11 = gg.l1.f10713a;
            r61 J = r61.J(gg.l1.class);
            J.G = w8Var2;
            arrayList.add(J);
        }
        w40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            r61 r61Var = new r61(33);
            r61Var.d = i12;
            r61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(r61Var);
            i10 = i12;
        }
        if (w40Var.S || !w40Var.V) {
            arrayList.add(r61.o(-2, 1));
            arrayList.add(r61.o(-3, 1));
            arrayList.add(r61.o(-4, 1));
        }
        if (!w40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new nq(w40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        o80 o80Var = (o80) this.f25361b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        q80 q80Var = o80Var.f29314x;
        q80Var.f30060f.setAlpha(1.0f);
        if (q80Var.f30085u) {
            o80Var.f29307c = bitmap;
        }
        fh.b bVar = q80Var.f30074n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(q80Var.f30074n, o80Var);
            ViewGroup viewGroup = q80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        ei0 ei0Var = (ei0) this.f25361b;
        ArrayList arrayList = (ArrayList) obj;
        e71 e71Var = (e71) obj2;
        ArrayList arrayList2 = ei0Var.f26019e;
        ArrayList arrayList3 = ei0Var.f26021n;
        int i10 = 0;
        if (ei0Var.d == null) {
            arrayList.add(r61.o(-1, 7));
            arrayList.add(r61.o(-2, 7));
            arrayList.add(r61.o(-3, 7));
            ei0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(ei0Var.f26024w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(r61.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                r61 r61Var = new r61(33);
                r61Var.G = (MessageObject) obj3;
                arrayList.add(r61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(r61.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                r61 r61Var2 = new r61(33);
                r61Var2.G = (MessageObject) obj4;
                arrayList.add(r61Var2);
            }
        }
        if (ei0Var.v || ((ei0Var.M && !ei0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !ei0Var.f26023s))) {
            arrayList.add(r61.o(ei0Var.L * 3, 7));
            arrayList.add(r61.o((ei0Var.L * 3) + 1, 7));
            arrayList.add(r61.o((ei0Var.L * 3) + 2, 7));
        }
        ei0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        in0 in0Var = (in0) this.f25361b;
        in0Var.f27400c = (Bitmap) obj;
        Paint paint = new Paint(1);
        in0Var.f27401e = paint;
        Bitmap bitmap = in0Var.f27400c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        in0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        in0Var.f27402f = new Matrix();
        fh.b bVar = in0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, in0Var.f27405s);
        ViewGroup viewGroup = in0Var.f27408y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        zy0 zy0Var = (zy0) this.f25361b;
        CharSequence charSequence = (CharSequence) obj;
        zy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(zy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
