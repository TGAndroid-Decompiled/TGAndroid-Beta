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
    public final int f23419a;
    public final Object f23420b;

    public d(Object obj, int i10) {
        this.f23419a = i10;
        this.f23420b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        lz lzVar = (lz) this.f23420b;
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
        ly lyVar = (ly) this.f23420b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
        ArrayList arrayList2 = lyVar.f26223s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ey eyVar = (ey) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = eyVar.f24009b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f18362id != lyVar.d) {
                    z10 = false;
                }
                int i11 = ny.f26823a;
                v51 J = v51.J(ny.class);
                long j3 = tL_messages_stickerSet.set.f18362id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = eyVar.f24008a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f18362id != lyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(ny.a(stickerSetCovered, eyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        gz gzVar = (gz) this.f23420b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f18362id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f18362id, 1);
                if (tL_messages_stickerSet.set.f18362id != gzVar.d) {
                    z11 = false;
                }
                int i11 = ny.f26823a;
                v51 J = v51.J(ny.class);
                long j3 = tL_messages_stickerSet.set.f18362id;
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
            ey eyVar = (ey) obj4;
            TLRPC.StickerSet stickerSet = eyVar.f24010c;
            if (longSparseIntArray.indexOfKey(stickerSet.f18362id) < 0) {
                longSparseIntArray.append(stickerSet.f18362id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = eyVar.f24008a;
                if (stickerSet.f18362id == gzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(ny.a(stickerSetCovered, eyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f23420b;
        float[] fArr = FragmentContextView.O0;
        fragmentContextView.f22289z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        a1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        e40 e40Var = (e40) this.f23420b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        e40Var.f23832c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(e40Var.f23830a).history);
        if (e40Var.f23832c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < e40Var.f23832c.size(); i11++) {
            String str = (String) e40Var.f23832c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(v51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(v51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ai.v8 v8Var;
        f40 f40Var = (f40) this.f23420b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
        ArrayList arrayList2 = f40Var.O;
        int i10 = 0;
        if (f40Var.P && (v8Var = f40Var.Q) != null && v8Var.f725i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.v8 v8Var2 = f40Var.Q;
            int i11 = gg.m1.f9844a;
            v51 J = v51.J(gg.m1.class);
            J.G = v8Var2;
            arrayList.add(J);
        }
        f40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            v51 v51Var = new v51(33);
            v51Var.d = i12;
            v51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(v51Var);
            i10 = i12;
        }
        if (f40Var.S || !f40Var.V) {
            arrayList.add(v51.o(-2, 1));
            arrayList.add(v51.o(-3, 1));
            arrayList.add(v51.o(-4, 1));
        }
        if (!f40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new yp(f40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        w70 w70Var = (w70) this.f23420b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        y70 y70Var = w70Var.f29916x;
        y70Var.f30531f.setAlpha(1.0f);
        if (y70Var.f30556u) {
            w70Var.f29910c = bitmap;
        }
        fh.b bVar = y70Var.f30545n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(y70Var.f30545n, w70Var);
            ViewGroup viewGroup = y70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        jh0 jh0Var = (jh0) this.f23420b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
        ArrayList arrayList2 = jh0Var.e;
        ArrayList arrayList3 = jh0Var.f25424n;
        int i10 = 0;
        if (jh0Var.d == null) {
            arrayList.add(v51.o(-1, 7));
            arrayList.add(v51.o(-2, 7));
            arrayList.add(v51.o(-3, 7));
            jh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(jh0Var.f25427w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(v51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                v51 v51Var = new v51(33);
                v51Var.G = (MessageObject) obj3;
                arrayList.add(v51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(v51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                v51 v51Var2 = new v51(33);
                v51Var2.G = (MessageObject) obj4;
                arrayList.add(v51Var2);
            }
        }
        if (jh0Var.v || ((jh0Var.M && !jh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !jh0Var.f25426s))) {
            arrayList.add(v51.o(jh0Var.L * 3, 7));
            arrayList.add(v51.o((jh0Var.L * 3) + 1, 7));
            arrayList.add(v51.o((jh0Var.L * 3) + 2, 7));
        }
        jh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        mm0 mm0Var = (mm0) this.f23420b;
        mm0Var.f26543c = (Bitmap) obj;
        Paint paint = new Paint(1);
        mm0Var.e = paint;
        Bitmap bitmap = mm0Var.f26543c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        mm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        mm0Var.f26544f = new Matrix();
        fh.b bVar = mm0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, mm0Var.f26547s);
        ViewGroup viewGroup = mm0Var.f26550y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        fy0 fy0Var = (fy0) this.f23420b;
        CharSequence charSequence = (CharSequence) obj;
        fy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(fy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
