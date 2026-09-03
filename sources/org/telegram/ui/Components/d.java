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
    public final int f26077a;
    public final Object f26078b;

    public d(Object obj, int i10) {
        this.f26077a = i10;
        this.f26078b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        mz mzVar = (mz) this.f26078b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        uy uyVar = mzVar.O1;
        if (uyVar != null && (uyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) mzVar.O1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) mzVar.O1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                Emoji.emojiColor.remove(str2);
            } else {
                StringBuilder sb = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = CompoundEmoji.skinTones.get(num.intValue());
                }
                sb.append(str);
                sb.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = CompoundEmoji.skinTones.get(num2.intValue());
                }
                sb.append(str3);
                Emoji.emojiColor.put(str2, sb.toString());
            }
            Emoji.saveEmojiColors();
        }
    }

    private final void b(Object obj, Object obj2) {
        ly lyVar = (ly) this.f26078b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = lyVar.f28899s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            dy dyVar = (dy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dyVar.f26372b;
            boolean z4 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f20872id != lyVar.d) {
                    z4 = false;
                }
                int i11 = ny.f29603a;
                h51 J = h51.J(ny.class);
                long j10 = tL_messages_stickerSet.set.f20872id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.f27369e = z4;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = dyVar.f26371a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f20872id != lyVar.d) {
                        z4 = false;
                    }
                    arrayList.add(ny.a(stickerSetCovered, dyVar, z4));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z4;
        hz hzVar = (hz) this.f26078b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = hzVar.B;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i10);
            i10++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f20872id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f20872id, 1);
                if (tL_messages_stickerSet.set.f20872id != hzVar.d) {
                    z10 = false;
                }
                int i11 = ny.f29603a;
                h51 J = h51.J(ny.class);
                long j10 = tL_messages_stickerSet.set.f20872id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.f27369e = z10;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = hzVar.G;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            dy dyVar = (dy) obj4;
            TLRPC.StickerSet stickerSet = dyVar.f26373c;
            if (longSparseIntArray.indexOfKey(stickerSet.f20872id) < 0) {
                longSparseIntArray.append(stickerSet.f20872id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = dyVar.f26371a;
                if (stickerSet.f20872id == hzVar.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(ny.a(stickerSetCovered, dyVar, z4));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f26078b;
        float[] fArr = FragmentContextView.J0;
        fragmentContextView.f24903w0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z4 = fragmentContextView.S;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.E;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z4, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        h40 h40Var = (h40) this.f26078b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        h40Var.f27355c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(h40Var.f27353a).history);
        if (h40Var.f27355c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < h40Var.f27355c.size(); i11++) {
            String str = (String) h40Var.f27355c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(h51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(h51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z4;
        oh.f6 f6Var;
        i40 i40Var = (i40) this.f26078b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = i40Var.L;
        int i10 = 0;
        if (i40Var.M && (f6Var = i40Var.N) != null && f6Var.f17404i.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            oh.f6 f6Var2 = i40Var.N;
            int i11 = uf.w0.f48769a;
            h51 J = h51.J(uf.w0.class);
            J.G = f6Var2;
            arrayList.add(J);
        }
        i40Var.O = z4;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            h51 h51Var = new h51(33);
            h51Var.d = i12;
            h51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(h51Var);
            i10 = i12;
        }
        if (i40Var.P || !i40Var.S) {
            arrayList.add(h51.o(-2, 1));
            arrayList.add(h51.o(-3, 1));
            arrayList.add(h51.o(-4, 1));
        }
        if (!i40Var.O && z4) {
            AndroidUtilities.runOnUIThread(new xp(i40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        o70 o70Var = (o70) this.f26078b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        q70 q70Var = o70Var.f29687x;
        q70Var.f30310f.setAlpha(1.0f);
        if (q70Var.f30335u) {
            o70Var.f29680c = bitmap;
        }
        tg.b bVar = q70Var.f30324n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ug.c.c(q70Var.f30324n, o70Var);
            ViewGroup viewGroup = q70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        gh0 gh0Var = (gh0) this.f26078b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = gh0Var.f27173e;
        ArrayList arrayList3 = gh0Var.f27175n;
        int i10 = 0;
        if (gh0Var.d == null) {
            arrayList.add(h51.o(-1, 7));
            arrayList.add(h51.o(-2, 7));
            arrayList.add(h51.o(-3, 7));
            gh0Var.N = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(gh0Var.f27178w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(h51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                h51 h51Var = new h51(33);
                h51Var.G = (MessageObject) obj3;
                arrayList.add(h51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(h51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                h51 h51Var2 = new h51(33);
                h51Var2.G = (MessageObject) obj4;
                arrayList.add(h51Var2);
            }
        }
        if (gh0Var.v || ((gh0Var.J && !gh0Var.K) || (!isEmpty && !arrayList3.isEmpty() && !gh0Var.f27177s))) {
            arrayList.add(h51.o(gh0Var.I * 3, 7));
            arrayList.add(h51.o((gh0Var.I * 3) + 1, 7));
            arrayList.add(h51.o((gh0Var.I * 3) + 2, 7));
        }
        gh0Var.N = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        im0 im0Var = (im0) this.f26078b;
        im0Var.f27859c = (Bitmap) obj;
        Paint paint = new Paint(1);
        im0Var.f27860e = paint;
        Bitmap bitmap = im0Var.f27859c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        im0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        im0Var.f27861f = new Matrix();
        tg.b bVar = im0Var.h;
        bVar.a((Bitmap) obj2);
        ug.c.c(bVar, im0Var.f27864s);
        ViewGroup viewGroup = im0Var.f27867y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        xx0 xx0Var = (xx0) this.f26078b;
        CharSequence charSequence = (CharSequence) obj;
        xx0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(xx0Var.P.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
