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
    public final int f23451a;
    public final Object f23452b;

    public d(Object obj, int i10) {
        this.f23451a = i10;
        this.f23452b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        mz mzVar = (mz) this.f23452b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        vy vyVar = mzVar.R1;
        if (vyVar != null && (vyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) mzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) mzVar.R1.getTag();
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
        my myVar = (my) this.f23452b;
        ArrayList arrayList = (ArrayList) obj;
        l61 l61Var = (l61) obj2;
        ArrayList arrayList2 = myVar.f26518s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            fy fyVar = (fy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = fyVar.f24361b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f18363id != myVar.d) {
                    z10 = false;
                }
                int i11 = oy.f27197a;
                x51 J = x51.J(oy.class);
                long j3 = tL_messages_stickerSet.set.f18363id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = fyVar.f24360a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f18363id != myVar.d) {
                        z10 = false;
                    }
                    arrayList.add(oy.a(stickerSetCovered, fyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        hz hzVar = (hz) this.f23452b;
        ArrayList arrayList = (ArrayList) obj;
        l61 l61Var = (l61) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = hzVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f18363id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f18363id, 1);
                if (tL_messages_stickerSet.set.f18363id != hzVar.d) {
                    z11 = false;
                }
                int i11 = oy.f27197a;
                x51 J = x51.J(oy.class);
                long j3 = tL_messages_stickerSet.set.f18363id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z11;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = hzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            fy fyVar = (fy) obj4;
            TLRPC.StickerSet stickerSet = fyVar.f24362c;
            if (longSparseIntArray.indexOfKey(stickerSet.f18363id) < 0) {
                longSparseIntArray.append(stickerSet.f18363id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = fyVar.f24360a;
                if (stickerSet.f18363id == hzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(oy.a(stickerSetCovered, fyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f23452b;
        float[] fArr = FragmentContextView.P0;
        fragmentContextView.f22290z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        a1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        g40 g40Var = (g40) this.f23452b;
        ArrayList arrayList = (ArrayList) obj;
        l61 l61Var = (l61) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        g40Var.f24421c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(g40Var.f24419a).history);
        if (g40Var.f24421c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < g40Var.f24421c.size(); i11++) {
            String str = (String) g40Var.f24421c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(x51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(x51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        ai.v8 v8Var;
        h40 h40Var = (h40) this.f23452b;
        ArrayList arrayList = (ArrayList) obj;
        l61 l61Var = (l61) obj2;
        ArrayList arrayList2 = h40Var.O;
        int i10 = 0;
        if (h40Var.P && (v8Var = h40Var.Q) != null && v8Var.f725i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.v8 v8Var2 = h40Var.Q;
            int i11 = gg.m1.f9844a;
            x51 J = x51.J(gg.m1.class);
            J.G = v8Var2;
            arrayList.add(J);
        }
        h40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            x51 x51Var = new x51(33);
            x51Var.d = i12;
            x51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(x51Var);
            i10 = i12;
        }
        if (h40Var.S || !h40Var.V) {
            arrayList.add(x51.o(-2, 1));
            arrayList.add(x51.o(-3, 1));
            arrayList.add(x51.o(-4, 1));
        }
        if (!h40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new zp(h40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        y70 y70Var = (y70) this.f23452b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        a80 a80Var = y70Var.f30600x;
        a80Var.f22580f.setAlpha(1.0f);
        if (a80Var.f22605u) {
            y70Var.f30594c = bitmap;
        }
        fh.b bVar = a80Var.f22594n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(a80Var.f22594n, y70Var);
            ViewGroup viewGroup = a80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        lh0 lh0Var = (lh0) this.f23452b;
        ArrayList arrayList = (ArrayList) obj;
        l61 l61Var = (l61) obj2;
        ArrayList arrayList2 = lh0Var.e;
        ArrayList arrayList3 = lh0Var.f26004n;
        int i10 = 0;
        if (lh0Var.d == null) {
            arrayList.add(x51.o(-1, 7));
            arrayList.add(x51.o(-2, 7));
            arrayList.add(x51.o(-3, 7));
            lh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(lh0Var.f26007w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(x51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                x51 x51Var = new x51(33);
                x51Var.G = (MessageObject) obj3;
                arrayList.add(x51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(x51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                x51 x51Var2 = new x51(33);
                x51Var2.G = (MessageObject) obj4;
                arrayList.add(x51Var2);
            }
        }
        if (lh0Var.v || ((lh0Var.M && !lh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !lh0Var.f26006s))) {
            arrayList.add(x51.o(lh0Var.L * 3, 7));
            arrayList.add(x51.o((lh0Var.L * 3) + 1, 7));
            arrayList.add(x51.o((lh0Var.L * 3) + 2, 7));
        }
        lh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        om0 om0Var = (om0) this.f23452b;
        om0Var.f27115c = (Bitmap) obj;
        Paint paint = new Paint(1);
        om0Var.e = paint;
        Bitmap bitmap = om0Var.f27115c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        om0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        om0Var.f27116f = new Matrix();
        fh.b bVar = om0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, om0Var.f27119s);
        ViewGroup viewGroup = om0Var.f27122y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        hy0 hy0Var = (hy0) this.f23452b;
        CharSequence charSequence = (CharSequence) obj;
        hy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(hy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
