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
    public final int f25488a;
    public final Object f25489b;

    public d(Object obj, int i10) {
        this.f25488a = i10;
        this.f25489b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        nz nzVar = (nz) this.f25489b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        wy wyVar = nzVar.R1;
        if (wyVar != null && (wyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) nzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) nzVar.R1.getTag();
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
        ny nyVar = (ny) this.f25489b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        ArrayList arrayList2 = nyVar.f29078s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            gy gyVar = (gy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = gyVar.f26945b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f20064id != nyVar.d) {
                    z10 = false;
                }
                int i11 = py.f29825a;
                g61 J = g61.J(py.class);
                long j3 = tL_messages_stickerSet.set.f20064id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.f26662e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = gyVar.f26944a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f20064id != nyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(py.a(stickerSetCovered, gyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        iz izVar = (iz) this.f25489b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = izVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f20064id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f20064id, 1);
                if (tL_messages_stickerSet.set.f20064id != izVar.d) {
                    z11 = false;
                }
                int i11 = py.f29825a;
                g61 J = g61.J(py.class);
                long j3 = tL_messages_stickerSet.set.f20064id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.f26662e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = izVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            gy gyVar = (gy) obj4;
            TLRPC.StickerSet stickerSet = gyVar.f26946c;
            if (longSparseIntArray.indexOfKey(stickerSet.f20064id) < 0) {
                longSparseIntArray.append(stickerSet.f20064id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = gyVar.f26944a;
                if (stickerSet.f20064id == izVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(py.a(stickerSetCovered, gyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f25489b;
        float[] fArr = FragmentContextView.P0;
        fragmentContextView.f24193z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        b1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        h40 h40Var = (h40) this.f25489b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        h40Var.f27005c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(h40Var.f27003a).history);
        if (h40Var.f27005c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < h40Var.f27005c.size(); i11++) {
            String str = (String) h40Var.f27005c.get(i11);
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
        ai.v8 v8Var;
        i40 i40Var = (i40) this.f25489b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        ArrayList arrayList2 = i40Var.O;
        int i10 = 0;
        if (i40Var.P && (v8Var = i40Var.Q) != null && v8Var.f789i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.v8 v8Var2 = i40Var.Q;
            int i11 = gg.m1.f10717a;
            g61 J = g61.J(gg.m1.class);
            J.G = v8Var2;
            arrayList.add(J);
        }
        i40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            g61 g61Var = new g61(33);
            g61Var.d = i12;
            g61Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(g61Var);
            i10 = i12;
        }
        if (i40Var.S || !i40Var.V) {
            arrayList.add(g61.p(-2, 1));
            arrayList.add(g61.p(-3, 1));
            arrayList.add(g61.p(-4, 1));
        }
        if (!i40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new aq(i40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        z70 z70Var = (z70) this.f25489b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        b80 b80Var = z70Var.f33403x;
        b80Var.f24821f.setAlpha(1.0f);
        if (b80Var.f24846u) {
            z70Var.f33396c = bitmap;
        }
        fh.b bVar = b80Var.f24835n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(b80Var.f24835n, z70Var);
            ViewGroup viewGroup = b80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        lh0 lh0Var = (lh0) this.f25489b;
        ArrayList arrayList = (ArrayList) obj;
        u61 u61Var = (u61) obj2;
        ArrayList arrayList2 = lh0Var.f28367e;
        ArrayList arrayList3 = lh0Var.f28369n;
        int i10 = 0;
        if (lh0Var.d == null) {
            arrayList.add(g61.p(-1, 7));
            arrayList.add(g61.p(-2, 7));
            arrayList.add(g61.p(-3, 7));
            lh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(lh0Var.f28372w);
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
        if (lh0Var.v || ((lh0Var.M && !lh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !lh0Var.f28371s))) {
            arrayList.add(g61.p(lh0Var.L * 3, 7));
            arrayList.add(g61.p((lh0Var.L * 3) + 1, 7));
            arrayList.add(g61.p((lh0Var.L * 3) + 2, 7));
        }
        lh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        sm0 sm0Var = (sm0) this.f25489b;
        sm0Var.f30818c = (Bitmap) obj;
        Paint paint = new Paint(1);
        sm0Var.f30819e = paint;
        Bitmap bitmap = sm0Var.f30818c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        sm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        sm0Var.f30820f = new Matrix();
        fh.b bVar = sm0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, sm0Var.f30823s);
        ViewGroup viewGroup = sm0Var.f30826y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        qy0 qy0Var = (qy0) this.f25489b;
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
