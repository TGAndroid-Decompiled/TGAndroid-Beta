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
    public final int f25499a;
    public final Object f25500b;

    public d(Object obj, int i10) {
        this.f25499a = i10;
        this.f25500b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        rz rzVar = (rz) this.f25500b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        az azVar = rzVar.R1;
        if (azVar != null && (azVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) rzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) rzVar.R1.getTag();
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
        ry ryVar = (ry) this.f25500b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        ArrayList arrayList2 = ryVar.f30294s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            iy iyVar = (iy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iyVar.f27513b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f20371id != ryVar.d) {
                    z10 = false;
                }
                int i11 = ty.f30935a;
                l61 J = l61.J(ty.class);
                long j10 = tL_messages_stickerSet.set.f20371id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = iyVar.f27512a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f20371id != ryVar.d) {
                        z10 = false;
                    }
                    arrayList.add(ty.a(stickerSetCovered, iyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        mz mzVar = (mz) this.f25500b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = mzVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f20371id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f20371id, 1);
                if (tL_messages_stickerSet.set.f20371id != mzVar.d) {
                    z11 = false;
                }
                int i11 = ty.f30935a;
                l61 J = l61.J(ty.class);
                long j10 = tL_messages_stickerSet.set.f20371id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = mzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            iy iyVar = (iy) obj4;
            TLRPC.StickerSet stickerSet = iyVar.f27514c;
            if (longSparseIntArray.indexOfKey(stickerSet.f20371id) < 0) {
                longSparseIntArray.append(stickerSet.f20371id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = iyVar.f27512a;
                if (stickerSet.f20371id == mzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(ty.a(stickerSetCovered, iyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f25500b;
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
        k40 k40Var = (k40) this.f25500b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        k40Var.f27856c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(k40Var.f27854a).history);
        if (k40Var.f27856c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < k40Var.f27856c.size(); i11++) {
            String str = (String) k40Var.f27856c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(l61.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(l61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ci.t6 t6Var;
        l40 l40Var = (l40) this.f25500b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        ArrayList arrayList2 = l40Var.Q;
        int i10 = 0;
        if (l40Var.R && (t6Var = l40Var.S) != null && t6Var.f6193i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ci.t6 t6Var2 = l40Var.S;
            int i11 = hg.l1.f11993a;
            l61 J = l61.J(hg.l1.class);
            J.G = t6Var2;
            arrayList.add(J);
        }
        l40Var.T = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            l61 l61Var = new l61(33);
            l61Var.d = i12;
            l61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(l61Var);
            i10 = i12;
        }
        if (l40Var.U || !l40Var.X) {
            arrayList.add(l61.o(-2, 1));
            arrayList.add(l61.o(-3, 1));
            arrayList.add(l61.o(-4, 1));
        }
        if (!l40Var.T && z10) {
            AndroidUtilities.runOnUIThread(new xp(l40Var, 21));
        }
    }

    private final void g(Object obj, Object obj2) {
        f80 f80Var = (f80) this.f25500b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        h80 h80Var = f80Var.f26229x;
        h80Var.f26906f.setAlpha(1.0f);
        if (h80Var.f26931u) {
            f80Var.f26223c = bitmap;
        }
        gh.b bVar = h80Var.f26920n;
        if (bVar != null) {
            bVar.a(bitmap2);
            hh.d.c(h80Var.f26920n, f80Var);
            ViewGroup viewGroup = h80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        wh0 wh0Var = (wh0) this.f25500b;
        ArrayList arrayList = (ArrayList) obj;
        a71 a71Var = (a71) obj2;
        ArrayList arrayList2 = wh0Var.e;
        ArrayList arrayList3 = wh0Var.f32242n;
        int i10 = 0;
        if (wh0Var.d == null) {
            arrayList.add(l61.o(-1, 7));
            arrayList.add(l61.o(-2, 7));
            arrayList.add(l61.o(-3, 7));
            wh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(wh0Var.f32245w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(l61.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                l61 l61Var = new l61(33);
                l61Var.G = (MessageObject) obj3;
                arrayList.add(l61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(l61.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                l61 l61Var2 = new l61(33);
                l61Var2.G = (MessageObject) obj4;
                arrayList.add(l61Var2);
            }
        }
        if (wh0Var.v || ((wh0Var.M && !wh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !wh0Var.f32244s))) {
            arrayList.add(l61.o(wh0Var.L * 3, 7));
            arrayList.add(l61.o((wh0Var.L * 3) + 1, 7));
            arrayList.add(l61.o((wh0Var.L * 3) + 2, 7));
        }
        wh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        bn0 bn0Var = (bn0) this.f25500b;
        bn0Var.f25055c = (Bitmap) obj;
        Paint paint = new Paint(1);
        bn0Var.e = paint;
        Bitmap bitmap = bn0Var.f25055c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bn0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        bn0Var.f25056f = new Matrix();
        gh.b bVar = bn0Var.h;
        bVar.a((Bitmap) obj2);
        hh.d.c(bVar, bn0Var.f25059s);
        ViewGroup viewGroup = bn0Var.f25062y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        sy0 sy0Var = (sy0) this.f25500b;
        CharSequence charSequence = (CharSequence) obj;
        sy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(sy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new x1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
