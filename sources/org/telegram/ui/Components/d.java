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
    public final int f27599a;
    public final Object f27600b;

    public d(Object obj, int i10) {
        this.f27599a = i10;
        this.f27600b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        fz fzVar = (fz) this.f27600b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ny nyVar = fzVar.N1;
        if (nyVar != null && (nyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) fzVar.N1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) fzVar.N1.getTag();
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
        ey eyVar = (ey) this.f27600b;
        ArrayList arrayList = (ArrayList) obj;
        k51 k51Var = (k51) obj2;
        ArrayList arrayList2 = eyVar.f28200s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            wx wxVar = (wx) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = wxVar.f34504b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f22419id != eyVar.d) {
                    z10 = false;
                }
                int i11 = gy.f29010a;
                w41 J = w41.J(gy.class);
                long j10 = tL_messages_stickerSet.set.f22419id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.f34294e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = wxVar.f34503a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f22419id != eyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(gy.a(stickerSetCovered, wxVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        az azVar = (az) this.f27600b;
        ArrayList arrayList = (ArrayList) obj;
        k51 k51Var = (k51) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = azVar.A;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f22419id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f22419id, 1);
                if (tL_messages_stickerSet.set.f22419id != azVar.d) {
                    z11 = false;
                }
                int i11 = gy.f29010a;
                w41 J = w41.J(gy.class);
                long j10 = tL_messages_stickerSet.set.f22419id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.f34294e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = azVar.F;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            wx wxVar = (wx) obj4;
            TLRPC.StickerSet stickerSet = wxVar.f34505c;
            if (longSparseIntArray.indexOfKey(stickerSet.f22419id) < 0) {
                longSparseIntArray.append(stickerSet.f22419id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = wxVar.f34503a;
                if (stickerSet.f22419id == azVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(gy.a(stickerSetCovered, wxVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f27600b;
        float[] fArr = FragmentContextView.I0;
        fragmentContextView.f26413v0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.R;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.D;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        b40 b40Var = (b40) this.f27600b;
        ArrayList arrayList = (ArrayList) obj;
        k51 k51Var = (k51) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        b40Var.f26974c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(b40Var.f26972a).history);
        if (b40Var.f26974c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < b40Var.f26974c.size(); i11++) {
            String str = (String) b40Var.f26974c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(w41.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(w41.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        lh.e6 e6Var;
        c40 c40Var = (c40) this.f27600b;
        ArrayList arrayList = (ArrayList) obj;
        k51 k51Var = (k51) obj2;
        ArrayList arrayList2 = c40Var.K;
        int i10 = 0;
        if (c40Var.L && (e6Var = c40Var.M) != null && e6Var.f15838i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lh.e6 e6Var2 = c40Var.M;
            int i11 = rf.x0.f47402a;
            w41 J = w41.J(rf.x0.class);
            J.G = e6Var2;
            arrayList.add(J);
        }
        c40Var.N = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            w41 w41Var = new w41(33);
            w41Var.d = i12;
            w41Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(w41Var);
            i10 = i12;
        }
        if (c40Var.O || !c40Var.R) {
            arrayList.add(w41.o(-2, 1));
            arrayList.add(w41.o(-3, 1));
            arrayList.add(w41.o(-4, 1));
        }
        if (!c40Var.N && z10) {
            AndroidUtilities.runOnUIThread(new rp(c40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        h70 h70Var = (h70) this.f27600b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        j70 j70Var = h70Var.f29095x;
        j70Var.f29577f.setAlpha(1.0f);
        if (j70Var.f29602u) {
            h70Var.f29088c = bitmap;
        }
        qg.b bVar = j70Var.f29591n;
        if (bVar != null) {
            bVar.a(bitmap2);
            rg.c.c(j70Var.f29591n, h70Var);
            ViewGroup viewGroup = j70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        ug0 ug0Var = (ug0) this.f27600b;
        ArrayList arrayList = (ArrayList) obj;
        k51 k51Var = (k51) obj2;
        ArrayList arrayList2 = ug0Var.f33225e;
        ArrayList arrayList3 = ug0Var.f33227n;
        int i10 = 0;
        if (ug0Var.d == null) {
            arrayList.add(w41.o(-1, 7));
            arrayList.add(w41.o(-2, 7));
            arrayList.add(w41.o(-3, 7));
            ug0Var.M = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(ug0Var.f33230w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(w41.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                w41 w41Var = new w41(33);
                w41Var.G = (MessageObject) obj3;
                arrayList.add(w41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(w41.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                w41 w41Var2 = new w41(33);
                w41Var2.G = (MessageObject) obj4;
                arrayList.add(w41Var2);
            }
        }
        if (ug0Var.v || ((ug0Var.I && !ug0Var.J) || (!isEmpty && !arrayList3.isEmpty() && !ug0Var.f33229s))) {
            arrayList.add(w41.o(ug0Var.H * 3, 7));
            arrayList.add(w41.o((ug0Var.H * 3) + 1, 7));
            arrayList.add(w41.o((ug0Var.H * 3) + 2, 7));
        }
        ug0Var.M = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        yl0 yl0Var = (yl0) this.f27600b;
        yl0Var.f35092c = (Bitmap) obj;
        Paint paint = new Paint(1);
        yl0Var.f35093e = paint;
        Bitmap bitmap = yl0Var.f35092c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        yl0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        yl0Var.f35094f = new Matrix();
        qg.b bVar = yl0Var.h;
        bVar.a((Bitmap) obj2);
        rg.c.c(bVar, yl0Var.f35097s);
        ViewGroup viewGroup = yl0Var.f35100y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        nx0 nx0Var = (nx0) this.f27600b;
        CharSequence charSequence = (CharSequence) obj;
        nx0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(nx0Var.O.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new a2((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
