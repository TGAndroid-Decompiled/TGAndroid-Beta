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
    public final int f25371a;
    public final Object f25372b;

    public d(Object obj, int i10) {
        this.f25371a = i10;
        this.f25372b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        tz tzVar = (tz) this.f25372b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        cz czVar = tzVar.R1;
        if (czVar != null && (czVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) tzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) tzVar.R1.getTag();
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
        ty tyVar = (ty) this.f25372b;
        ArrayList arrayList = (ArrayList) obj;
        t61 t61Var = (t61) obj2;
        ArrayList arrayList2 = tyVar.f30755s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ky kyVar = (ky) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kyVar.f28027b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f20302id != tyVar.d) {
                    z10 = false;
                }
                int i11 = vy.f31948a;
                g61 J = g61.J(vy.class);
                long j10 = tL_messages_stickerSet.set.f20302id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = kyVar.f28026a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f20302id != tyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(vy.a(stickerSetCovered, kyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        oz ozVar = (oz) this.f25372b;
        ArrayList arrayList = (ArrayList) obj;
        t61 t61Var = (t61) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = ozVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f20302id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f20302id, 1);
                if (tL_messages_stickerSet.set.f20302id != ozVar.d) {
                    z11 = false;
                }
                int i11 = vy.f31948a;
                g61 J = g61.J(vy.class);
                long j10 = tL_messages_stickerSet.set.f20302id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = ozVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            ky kyVar = (ky) obj4;
            TLRPC.StickerSet stickerSet = kyVar.f28028c;
            if (longSparseIntArray.indexOfKey(stickerSet.f20302id) < 0) {
                longSparseIntArray.append(stickerSet.f20302id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = kyVar.f28026a;
                if (stickerSet.f20302id == ozVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(vy.a(stickerSetCovered, kyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f25372b;
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
        m40 m40Var = (m40) this.f25372b;
        ArrayList arrayList = (ArrayList) obj;
        t61 t61Var = (t61) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        m40Var.f28386c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(m40Var.f28384a).history);
        if (m40Var.f28386c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < m40Var.f28386c.size(); i11++) {
            String str = (String) m40Var.f28386c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(g61.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(g61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ci.u6 u6Var;
        n40 n40Var = (n40) this.f25372b;
        ArrayList arrayList = (ArrayList) obj;
        t61 t61Var = (t61) obj2;
        ArrayList arrayList2 = n40Var.O;
        int i10 = 0;
        if (n40Var.P && (u6Var = n40Var.Q) != null && u6Var.f5151i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ci.u6 u6Var2 = n40Var.Q;
            int i11 = hg.l1.f11967a;
            g61 J = g61.J(hg.l1.class);
            J.G = u6Var2;
            arrayList.add(J);
        }
        n40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            g61 g61Var = new g61(33);
            g61Var.d = i12;
            g61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(g61Var);
            i10 = i12;
        }
        if (n40Var.S || !n40Var.V) {
            arrayList.add(g61.o(-2, 1));
            arrayList.add(g61.o(-3, 1));
            arrayList.add(g61.o(-4, 1));
        }
        if (!n40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new hq(n40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        g80 g80Var = (g80) this.f25372b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        i80 i80Var = g80Var.f26531x;
        i80Var.f27113f.setAlpha(1.0f);
        if (i80Var.f27138u) {
            g80Var.f26525c = bitmap;
        }
        gh.b bVar = i80Var.f27127n;
        if (bVar != null) {
            bVar.a(bitmap2);
            hh.d.c(i80Var.f27127n, g80Var);
            ViewGroup viewGroup = i80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        th0 th0Var = (th0) this.f25372b;
        ArrayList arrayList = (ArrayList) obj;
        t61 t61Var = (t61) obj2;
        ArrayList arrayList2 = th0Var.e;
        ArrayList arrayList3 = th0Var.f30513n;
        int i10 = 0;
        if (th0Var.d == null) {
            arrayList.add(g61.o(-1, 7));
            arrayList.add(g61.o(-2, 7));
            arrayList.add(g61.o(-3, 7));
            th0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(th0Var.f30516w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(g61.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                g61 g61Var = new g61(33);
                g61Var.G = (MessageObject) obj3;
                arrayList.add(g61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(g61.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                g61 g61Var2 = new g61(33);
                g61Var2.G = (MessageObject) obj4;
                arrayList.add(g61Var2);
            }
        }
        if (th0Var.v || ((th0Var.M && !th0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !th0Var.f30515s))) {
            arrayList.add(g61.o(th0Var.L * 3, 7));
            arrayList.add(g61.o((th0Var.L * 3) + 1, 7));
            arrayList.add(g61.o((th0Var.L * 3) + 2, 7));
        }
        th0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        ym0 ym0Var = (ym0) this.f25372b;
        ym0Var.f32697c = (Bitmap) obj;
        Paint paint = new Paint(1);
        ym0Var.e = paint;
        Bitmap bitmap = ym0Var.f32697c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        ym0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        ym0Var.f32698f = new Matrix();
        gh.b bVar = ym0Var.h;
        bVar.a((Bitmap) obj2);
        hh.d.c(bVar, ym0Var.f32701s);
        ViewGroup viewGroup = ym0Var.f32704y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        py0 py0Var = (py0) this.f25372b;
        CharSequence charSequence = (CharSequence) obj;
        py0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(py0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
