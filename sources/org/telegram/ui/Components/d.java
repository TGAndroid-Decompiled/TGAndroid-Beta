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
    public final int f25467a;
    public final Object f25468b;

    public d(Object obj, int i10) {
        this.f25467a = i10;
        this.f25468b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        tz tzVar = (tz) this.f25468b;
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
        ty tyVar = (ty) this.f25468b;
        ArrayList arrayList = (ArrayList) obj;
        b71 b71Var = (b71) obj2;
        ArrayList arrayList2 = tyVar.f30922s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ky kyVar = (ky) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kyVar.f28176b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f20370id != tyVar.d) {
                    z10 = false;
                }
                int i11 = vy.f32074a;
                m61 J = m61.J(vy.class);
                long j10 = tL_messages_stickerSet.set.f20370id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = kyVar.f28175a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f20370id != tyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(vy.a(stickerSetCovered, kyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        oz ozVar = (oz) this.f25468b;
        ArrayList arrayList = (ArrayList) obj;
        b71 b71Var = (b71) obj2;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f20370id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f20370id, 1);
                if (tL_messages_stickerSet.set.f20370id != ozVar.d) {
                    z11 = false;
                }
                int i11 = vy.f32074a;
                m61 J = m61.J(vy.class);
                long j10 = tL_messages_stickerSet.set.f20370id;
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
            TLRPC.StickerSet stickerSet = kyVar.f28177c;
            if (longSparseIntArray.indexOfKey(stickerSet.f20370id) < 0) {
                longSparseIntArray.append(stickerSet.f20370id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = kyVar.f28175a;
                if (stickerSet.f20370id == ozVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(vy.a(stickerSetCovered, kyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f25468b;
        float[] fArr = FragmentContextView.W0;
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
        m40 m40Var = (m40) this.f25468b;
        ArrayList arrayList = (ArrayList) obj;
        b71 b71Var = (b71) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        m40Var.f28502c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(m40Var.f28500a).history);
        if (m40Var.f28502c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < m40Var.f28502c.size(); i11++) {
            String str = (String) m40Var.f28502c.get(i11);
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
        ci.t6 t6Var;
        n40 n40Var = (n40) this.f25468b;
        ArrayList arrayList = (ArrayList) obj;
        b71 b71Var = (b71) obj2;
        ArrayList arrayList2 = n40Var.Q;
        int i10 = 0;
        if (n40Var.R && (t6Var = n40Var.S) != null && t6Var.f6193i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ci.t6 t6Var2 = n40Var.S;
            int i11 = hg.l1.f11993a;
            m61 J = m61.J(hg.l1.class);
            J.G = t6Var2;
            arrayList.add(J);
        }
        n40Var.T = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            m61 m61Var = new m61(33);
            m61Var.d = i12;
            m61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(m61Var);
            i10 = i12;
        }
        if (n40Var.U || !n40Var.X) {
            arrayList.add(m61.o(-2, 1));
            arrayList.add(m61.o(-3, 1));
            arrayList.add(m61.o(-4, 1));
        }
        if (!n40Var.T && z10) {
            AndroidUtilities.runOnUIThread(new zp(n40Var, 21));
        }
    }

    private final void g(Object obj, Object obj2) {
        h80 h80Var = (h80) this.f25468b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        j80 j80Var = h80Var.f26826x;
        j80Var.f27557f.setAlpha(1.0f);
        if (j80Var.f27582u) {
            h80Var.f26820c = bitmap;
        }
        gh.b bVar = j80Var.f27571n;
        if (bVar != null) {
            bVar.a(bitmap2);
            hh.d.c(j80Var.f27571n, h80Var);
            ViewGroup viewGroup = j80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        xh0 xh0Var = (xh0) this.f25468b;
        ArrayList arrayList = (ArrayList) obj;
        b71 b71Var = (b71) obj2;
        ArrayList arrayList2 = xh0Var.e;
        ArrayList arrayList3 = xh0Var.f32571n;
        int i10 = 0;
        if (xh0Var.d == null) {
            arrayList.add(m61.o(-1, 7));
            arrayList.add(m61.o(-2, 7));
            arrayList.add(m61.o(-3, 7));
            xh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(xh0Var.f32574w);
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
        if (xh0Var.v || ((xh0Var.M && !xh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !xh0Var.f32573s))) {
            arrayList.add(m61.o(xh0Var.L * 3, 7));
            arrayList.add(m61.o((xh0Var.L * 3) + 1, 7));
            arrayList.add(m61.o((xh0Var.L * 3) + 2, 7));
        }
        xh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        cn0 cn0Var = (cn0) this.f25468b;
        cn0Var.f25385c = (Bitmap) obj;
        Paint paint = new Paint(1);
        cn0Var.e = paint;
        Bitmap bitmap = cn0Var.f25385c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        cn0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        cn0Var.f25386f = new Matrix();
        gh.b bVar = cn0Var.h;
        bVar.a((Bitmap) obj2);
        hh.d.c(bVar, cn0Var.f25389s);
        ViewGroup viewGroup = cn0Var.f25392y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        ty0 ty0Var = (ty0) this.f25468b;
        CharSequence charSequence = (CharSequence) obj;
        ty0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(ty0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new x1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
