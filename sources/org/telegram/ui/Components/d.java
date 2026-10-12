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
    public final int f25063a;
    public final Object f25064b;

    public d(Object obj, int i10) {
        this.f25063a = i10;
        this.f25064b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        d00 d00Var = (d00) this.f25064b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        lz lzVar = d00Var.R1;
        if (lzVar != null && (lzVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) d00Var.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) d00Var.R1.getTag();
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
        cz czVar = (cz) this.f25064b;
        ArrayList arrayList = (ArrayList) obj;
        h71 h71Var = (h71) obj2;
        ArrayList arrayList2 = czVar.f25056s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            vy vyVar = (vy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vyVar.f32209b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f19829id != czVar.d) {
                    z10 = false;
                }
                int i11 = ez.f25825a;
                u61 J = u61.J(ez.class);
                long j3 = tL_messages_stickerSet.set.f19829id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.f31070e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = vyVar.f32208a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f19829id != czVar.d) {
                        z10 = false;
                    }
                    arrayList.add(ez.a(stickerSetCovered, vyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        yz yzVar = (yz) this.f25064b;
        ArrayList arrayList = (ArrayList) obj;
        h71 h71Var = (h71) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = yzVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f19829id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f19829id, 1);
                if (tL_messages_stickerSet.set.f19829id != yzVar.d) {
                    z11 = false;
                }
                int i11 = ez.f25825a;
                u61 J = u61.J(ez.class);
                long j3 = tL_messages_stickerSet.set.f19829id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.f31070e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = yzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            vy vyVar = (vy) obj4;
            TLRPC.StickerSet stickerSet = vyVar.f32210c;
            if (longSparseIntArray.indexOfKey(stickerSet.f19829id) < 0) {
                longSparseIntArray.append(stickerSet.f19829id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = vyVar.f32208a;
                if (stickerSet.f19829id == yzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(ez.a(stickerSetCovered, vyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f25064b;
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
        x40 x40Var = (x40) this.f25064b;
        ArrayList arrayList = (ArrayList) obj;
        h71 h71Var = (h71) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        x40Var.f32647c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(x40Var.f32645a).history);
        if (x40Var.f32647c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < x40Var.f32647c.size(); i11++) {
            String str = (String) x40Var.f32647c.get(i11);
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

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ai.w8 w8Var;
        y40 y40Var = (y40) this.f25064b;
        ArrayList arrayList = (ArrayList) obj;
        h71 h71Var = (h71) obj2;
        ArrayList arrayList2 = y40Var.O;
        int i10 = 0;
        if (y40Var.P && (w8Var = y40Var.Q) != null && w8Var.f897i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.w8 w8Var2 = y40Var.Q;
            int i11 = gg.l1.f10712a;
            u61 J = u61.J(gg.l1.class);
            J.G = w8Var2;
            arrayList.add(J);
        }
        y40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            u61 u61Var = new u61(33);
            u61Var.d = i12;
            u61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(u61Var);
            i10 = i12;
        }
        if (y40Var.S || !y40Var.V) {
            arrayList.add(u61.o(-2, 1));
            arrayList.add(u61.o(-3, 1));
            arrayList.add(u61.o(-4, 1));
        }
        if (!y40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new pq(y40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        q80 q80Var = (q80) this.f25064b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        s80 s80Var = q80Var.f29774x;
        s80Var.f30449f.setAlpha(1.0f);
        if (s80Var.f30474u) {
            q80Var.f29767c = bitmap;
        }
        fh.b bVar = s80Var.f30463n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(s80Var.f30463n, q80Var);
            ViewGroup viewGroup = s80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        fi0 fi0Var = (fi0) this.f25064b;
        ArrayList arrayList = (ArrayList) obj;
        h71 h71Var = (h71) obj2;
        ArrayList arrayList2 = fi0Var.f26079e;
        ArrayList arrayList3 = fi0Var.f26081n;
        int i10 = 0;
        if (fi0Var.d == null) {
            arrayList.add(u61.o(-1, 7));
            arrayList.add(u61.o(-2, 7));
            arrayList.add(u61.o(-3, 7));
            fi0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(fi0Var.f26084w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(u61.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
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
                arrayList.add(u61.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
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
        if (fi0Var.v || ((fi0Var.M && !fi0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !fi0Var.f26083s))) {
            arrayList.add(u61.o(fi0Var.L * 3, 7));
            arrayList.add(u61.o((fi0Var.L * 3) + 1, 7));
            arrayList.add(u61.o((fi0Var.L * 3) + 2, 7));
        }
        fi0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        mn0 mn0Var = (mn0) this.f25064b;
        mn0Var.f28606c = (Bitmap) obj;
        Paint paint = new Paint(1);
        mn0Var.f28607e = paint;
        Bitmap bitmap = mn0Var.f28606c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        mn0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        mn0Var.f28608f = new Matrix();
        fh.b bVar = mn0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, mn0Var.f28611s);
        ViewGroup viewGroup = mn0Var.f28614y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        dz0 dz0Var = (dz0) this.f25064b;
        CharSequence charSequence = (CharSequence) obj;
        dz0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(dz0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
