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
    public final int f25290a;
    public final Object f25291b;

    public d(Object obj, int i10) {
        this.f25290a = i10;
        this.f25291b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        tz tzVar = (tz) this.f25291b;
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
        ty tyVar = (ty) this.f25291b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        ArrayList arrayList2 = tyVar.f30709s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ky kyVar = (ky) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kyVar.f27980b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f20303id != tyVar.d) {
                    z10 = false;
                }
                int i11 = vy.f31890a;
                h61 J = h61.J(vy.class);
                long j10 = tL_messages_stickerSet.set.f20303id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = kyVar.f27979a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f20303id != tyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(vy.a(stickerSetCovered, kyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        oz ozVar = (oz) this.f25291b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f20303id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f20303id, 1);
                if (tL_messages_stickerSet.set.f20303id != ozVar.d) {
                    z11 = false;
                }
                int i11 = vy.f31890a;
                h61 J = h61.J(vy.class);
                long j10 = tL_messages_stickerSet.set.f20303id;
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
            TLRPC.StickerSet stickerSet = kyVar.f27981c;
            if (longSparseIntArray.indexOfKey(stickerSet.f20303id) < 0) {
                longSparseIntArray.append(stickerSet.f20303id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = kyVar.f27979a;
                if (stickerSet.f20303id == ozVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(vy.a(stickerSetCovered, kyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f25291b;
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
        m40 m40Var = (m40) this.f25291b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        m40Var.f28381c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(m40Var.f28379a).history);
        if (m40Var.f28381c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < m40Var.f28381c.size(); i11++) {
            String str = (String) m40Var.f28381c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(h61.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(h61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ci.u6 u6Var;
        n40 n40Var = (n40) this.f25291b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        ArrayList arrayList2 = n40Var.O;
        int i10 = 0;
        if (n40Var.P && (u6Var = n40Var.Q) != null && u6Var.f5149i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ci.u6 u6Var2 = n40Var.Q;
            int i11 = hg.l1.f11965a;
            h61 J = h61.J(hg.l1.class);
            J.G = u6Var2;
            arrayList.add(J);
        }
        n40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            h61 h61Var = new h61(33);
            h61Var.d = i12;
            h61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(h61Var);
            i10 = i12;
        }
        if (n40Var.S || !n40Var.V) {
            arrayList.add(h61.o(-2, 1));
            arrayList.add(h61.o(-3, 1));
            arrayList.add(h61.o(-4, 1));
        }
        if (!n40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new hq(n40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        g80 g80Var = (g80) this.f25291b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        i80 i80Var = g80Var.f26532x;
        i80Var.f27162f.setAlpha(1.0f);
        if (i80Var.f27187u) {
            g80Var.f26526c = bitmap;
        }
        gh.b bVar = i80Var.f27176n;
        if (bVar != null) {
            bVar.a(bitmap2);
            hh.d.c(i80Var.f27176n, g80Var);
            ViewGroup viewGroup = i80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        uh0 uh0Var = (uh0) this.f25291b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        ArrayList arrayList2 = uh0Var.e;
        ArrayList arrayList3 = uh0Var.f30937n;
        int i10 = 0;
        if (uh0Var.d == null) {
            arrayList.add(h61.o(-1, 7));
            arrayList.add(h61.o(-2, 7));
            arrayList.add(h61.o(-3, 7));
            uh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(uh0Var.f30940w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(h61.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                h61 h61Var = new h61(33);
                h61Var.G = (MessageObject) obj3;
                arrayList.add(h61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(h61.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                h61 h61Var2 = new h61(33);
                h61Var2.G = (MessageObject) obj4;
                arrayList.add(h61Var2);
            }
        }
        if (uh0Var.v || ((uh0Var.M && !uh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !uh0Var.f30939s))) {
            arrayList.add(h61.o(uh0Var.L * 3, 7));
            arrayList.add(h61.o((uh0Var.L * 3) + 1, 7));
            arrayList.add(h61.o((uh0Var.L * 3) + 2, 7));
        }
        uh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        zm0 zm0Var = (zm0) this.f25291b;
        zm0Var.f32970c = (Bitmap) obj;
        Paint paint = new Paint(1);
        zm0Var.e = paint;
        Bitmap bitmap = zm0Var.f32970c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        zm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        zm0Var.f32971f = new Matrix();
        gh.b bVar = zm0Var.h;
        bVar.a((Bitmap) obj2);
        hh.d.c(bVar, zm0Var.f32974s);
        ViewGroup viewGroup = zm0Var.f32977y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        qy0 qy0Var = (qy0) this.f25291b;
        CharSequence charSequence = (CharSequence) obj;
        qy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(qy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
