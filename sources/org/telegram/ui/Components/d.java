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
    public final int f23507a;
    public final Object f23508b;

    public d(Object obj, int i10) {
        this.f23507a = i10;
        this.f23508b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        kz kzVar = (kz) this.f23508b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ty tyVar = kzVar.R1;
        if (tyVar != null && (tyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) kzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) kzVar.R1.getTag();
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
        ky kyVar = (ky) this.f23508b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
        ArrayList arrayList2 = kyVar.f25844s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            dy dyVar = (dy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dyVar.f23777b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f18370id != kyVar.d) {
                    z10 = false;
                }
                int i11 = my.f26562a;
                y51 J = y51.J(my.class);
                long j3 = tL_messages_stickerSet.set.f18370id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = dyVar.f23776a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f18370id != kyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(my.a(stickerSetCovered, dyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        fz fzVar = (fz) this.f23508b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = fzVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f18370id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f18370id, 1);
                if (tL_messages_stickerSet.set.f18370id != fzVar.d) {
                    z11 = false;
                }
                int i11 = my.f26562a;
                y51 J = y51.J(my.class);
                long j3 = tL_messages_stickerSet.set.f18370id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = fzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            dy dyVar = (dy) obj4;
            TLRPC.StickerSet stickerSet = dyVar.f23778c;
            if (longSparseIntArray.indexOfKey(stickerSet.f18370id) < 0) {
                longSparseIntArray.append(stickerSet.f18370id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = dyVar.f23776a;
                if (stickerSet.f18370id == fzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(my.a(stickerSetCovered, dyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f23508b;
        float[] fArr = FragmentContextView.O0;
        fragmentContextView.f22304z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        b1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        d40 d40Var = (d40) this.f23508b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        d40Var.f23560c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(d40Var.f23558a).history);
        if (d40Var.f23560c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < d40Var.f23560c.size(); i11++) {
            String str = (String) d40Var.f23560c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(y51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(y51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ai.v8 v8Var;
        e40 e40Var = (e40) this.f23508b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
        ArrayList arrayList2 = e40Var.O;
        int i10 = 0;
        if (e40Var.P && (v8Var = e40Var.Q) != null && v8Var.f718i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.v8 v8Var2 = e40Var.Q;
            int i11 = gg.m1.f9863a;
            y51 J = y51.J(gg.m1.class);
            J.G = v8Var2;
            arrayList.add(J);
        }
        e40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            y51 y51Var = new y51(33);
            y51Var.d = i12;
            y51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(y51Var);
            i10 = i12;
        }
        if (e40Var.S || !e40Var.V) {
            arrayList.add(y51.o(-2, 1));
            arrayList.add(y51.o(-3, 1));
            arrayList.add(y51.o(-4, 1));
        }
        if (!e40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new xp(e40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        w70 w70Var = (w70) this.f23508b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        y70 y70Var = w70Var.f29962x;
        y70Var.f30545f.setAlpha(1.0f);
        if (y70Var.f30570u) {
            w70Var.f29956c = bitmap;
        }
        fh.b bVar = y70Var.f30559n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(y70Var.f30559n, w70Var);
            ViewGroup viewGroup = y70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        lh0 lh0Var = (lh0) this.f23508b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
        ArrayList arrayList2 = lh0Var.e;
        ArrayList arrayList3 = lh0Var.f26112n;
        int i10 = 0;
        if (lh0Var.d == null) {
            arrayList.add(y51.o(-1, 7));
            arrayList.add(y51.o(-2, 7));
            arrayList.add(y51.o(-3, 7));
            lh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(lh0Var.f26115w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(y51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                y51 y51Var = new y51(33);
                y51Var.G = (MessageObject) obj3;
                arrayList.add(y51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(y51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                y51 y51Var2 = new y51(33);
                y51Var2.G = (MessageObject) obj4;
                arrayList.add(y51Var2);
            }
        }
        if (lh0Var.v || ((lh0Var.M && !lh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !lh0Var.f26114s))) {
            arrayList.add(y51.o(lh0Var.L * 3, 7));
            arrayList.add(y51.o((lh0Var.L * 3) + 1, 7));
            arrayList.add(y51.o((lh0Var.L * 3) + 2, 7));
        }
        lh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        om0 om0Var = (om0) this.f23508b;
        om0Var.f27149c = (Bitmap) obj;
        Paint paint = new Paint(1);
        om0Var.e = paint;
        Bitmap bitmap = om0Var.f27149c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        om0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        om0Var.f27150f = new Matrix();
        fh.b bVar = om0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, om0Var.f27153s);
        ViewGroup viewGroup = om0Var.f27156y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        iy0 iy0Var = (iy0) this.f23508b;
        CharSequence charSequence = (CharSequence) obj;
        iy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(iy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new x1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
