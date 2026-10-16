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
    public final int f23916a;
    public final Object f23917b;

    public d(Object obj, int i10) {
        this.f23916a = i10;
        this.f23917b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        wz wzVar = (wz) this.f23917b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ez ezVar = wzVar.R1;
        if (ezVar != null && (ezVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) wzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) wzVar.R1.getTag();
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
        vy vyVar = (vy) this.f23917b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        ArrayList arrayList2 = vyVar.f30344s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            oy oyVar = (oy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = oyVar.f27796b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f18943id != vyVar.d) {
                    z10 = false;
                }
                int i11 = xy.f31086a;
                m61 J = m61.J(xy.class);
                long j10 = tL_messages_stickerSet.set.f18943id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = oyVar.f27795a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f18943id != vyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(xy.a(stickerSetCovered, oyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        rz rzVar = (rz) this.f23917b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = rzVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f18943id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f18943id, 1);
                if (tL_messages_stickerSet.set.f18943id != rzVar.d) {
                    z11 = false;
                }
                int i11 = xy.f31086a;
                m61 J = m61.J(xy.class);
                long j10 = tL_messages_stickerSet.set.f18943id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = rzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            oy oyVar = (oy) obj4;
            TLRPC.StickerSet stickerSet = oyVar.f27797c;
            if (longSparseIntArray.indexOfKey(stickerSet.f18943id) < 0) {
                longSparseIntArray.append(stickerSet.f18943id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = oyVar.f27795a;
                if (stickerSet.f18943id == rzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(xy.a(stickerSetCovered, oyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f23917b;
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
        q40 q40Var = (q40) this.f23917b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        q40Var.f28192c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(q40Var.f28190a).history);
        if (q40Var.f28192c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < q40Var.f28192c.size(); i11++) {
            String str = (String) q40Var.f28192c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(m61.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(m61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        bi.g8 g8Var;
        r40 r40Var = (r40) this.f23917b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        ArrayList arrayList2 = r40Var.O;
        int i10 = 0;
        if (r40Var.P && (g8Var = r40Var.Q) != null && g8Var.f3433i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bi.g8 g8Var2 = r40Var.Q;
            int i11 = hg.l1.f10661a;
            m61 J = m61.J(hg.l1.class);
            J.G = g8Var2;
            arrayList.add(J);
        }
        r40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            m61 m61Var = new m61(33);
            m61Var.d = i12;
            m61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(m61Var);
            i10 = i12;
        }
        if (r40Var.S || !r40Var.V) {
            arrayList.add(m61.o(-2, 1));
            arrayList.add(m61.o(-3, 1));
            arrayList.add(m61.o(-4, 1));
        }
        if (!r40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new kq(r40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        j80 j80Var = (j80) this.f23917b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        l80 l80Var = j80Var.f25927x;
        l80Var.f26645f.setAlpha(1.0f);
        if (l80Var.f26670u) {
            j80Var.f25921c = bitmap;
        }
        gh.b bVar = l80Var.f26659n;
        if (bVar != null) {
            bVar.a(bitmap2);
            hh.d.c(l80Var.f26659n, j80Var);
            ViewGroup viewGroup = l80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        zh0 zh0Var = (zh0) this.f23917b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        ArrayList arrayList2 = zh0Var.e;
        ArrayList arrayList3 = zh0Var.f31566n;
        int i10 = 0;
        if (zh0Var.d == null) {
            arrayList.add(m61.o(-1, 7));
            arrayList.add(m61.o(-2, 7));
            arrayList.add(m61.o(-3, 7));
            zh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(zh0Var.f31569w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(m61.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                m61 m61Var = new m61(33);
                m61Var.G = (MessageObject) obj3;
                arrayList.add(m61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(m61.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                m61 m61Var2 = new m61(33);
                m61Var2.G = (MessageObject) obj4;
                arrayList.add(m61Var2);
            }
        }
        if (zh0Var.v || ((zh0Var.M && !zh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !zh0Var.f31568s))) {
            arrayList.add(m61.o(zh0Var.L * 3, 7));
            arrayList.add(m61.o((zh0Var.L * 3) + 1, 7));
            arrayList.add(m61.o((zh0Var.L * 3) + 2, 7));
        }
        zh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        cn0 cn0Var = (cn0) this.f23917b;
        cn0Var.f23829c = (Bitmap) obj;
        Paint paint = new Paint(1);
        cn0Var.e = paint;
        Bitmap bitmap = cn0Var.f23829c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        cn0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        cn0Var.f23830f = new Matrix();
        gh.b bVar = cn0Var.h;
        bVar.a((Bitmap) obj2);
        hh.d.c(bVar, cn0Var.f23833s);
        ViewGroup viewGroup = cn0Var.f23836y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        uy0 uy0Var = (uy0) this.f23917b;
        CharSequence charSequence = (CharSequence) obj;
        uy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(uy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
