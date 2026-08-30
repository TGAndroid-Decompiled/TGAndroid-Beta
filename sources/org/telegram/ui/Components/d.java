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
    public final int f24083a;
    public final Object f24084b;

    public d(Object obj, int i10) {
        this.f24083a = i10;
        this.f24084b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        kz kzVar = (kz) this.f24084b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        sy syVar = kzVar.O1;
        if (syVar != null && (syVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            ((CompoundEmoji.CompoundEmojiDrawable) kzVar.O1.getDrawable()).update(num.intValue(), num2.intValue());
            String str2 = (String) kzVar.O1.getTag();
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
        jy jyVar = (jy) this.f24084b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = jyVar.f26063s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ay ayVar = (ay) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ayVar.f23524b;
            boolean z4 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f19211id != jyVar.d) {
                    z4 = false;
                }
                int i11 = ly.f26895a;
                i51 J = i51.J(ly.class);
                long j10 = tL_messages_stickerSet.set.f19211id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z4;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = ayVar.f23523a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f19211id != jyVar.d) {
                        z4 = false;
                    }
                    arrayList.add(ly.a(stickerSetCovered, ayVar, z4));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z4;
        fz fzVar = (fz) this.f24084b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = fzVar.B;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f19211id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f19211id, 1);
                if (tL_messages_stickerSet.set.f19211id != fzVar.d) {
                    z10 = false;
                }
                int i11 = ly.f26895a;
                i51 J = i51.J(ly.class);
                long j10 = tL_messages_stickerSet.set.f19211id;
                J.d = (int) ((j10 >>> 32) ^ j10);
                J.B = j10;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = fzVar.G;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            ay ayVar = (ay) obj4;
            TLRPC.StickerSet stickerSet = ayVar.f23525c;
            if (longSparseIntArray.indexOfKey(stickerSet.f19211id) < 0) {
                longSparseIntArray.append(stickerSet.f19211id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = ayVar.f23523a;
                if (stickerSet.f19211id == fzVar.d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(ly.a(stickerSetCovered, ayVar, z4));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f24084b;
        float[] fArr = FragmentContextView.J0;
        fragmentContextView.f23052w0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z4 = fragmentContextView.S;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.E;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z4, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        f40 f40Var = (f40) this.f24084b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        f40Var.f24775c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(f40Var.f24773a).history);
        if (f40Var.f24775c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < f40Var.f24775c.size(); i11++) {
            String str = (String) f40Var.f24775c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(i51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(i51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z4;
        nh.f6 f6Var;
        g40 g40Var = (g40) this.f24084b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = g40Var.L;
        int i10 = 0;
        if (g40Var.M && (f6Var = g40Var.N) != null && f6Var.f15580i.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            nh.f6 f6Var2 = g40Var.N;
            int i11 = tf.w0.f44875a;
            i51 J = i51.J(tf.w0.class);
            J.G = f6Var2;
            arrayList.add(J);
        }
        g40Var.O = z4;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            i51 i51Var = new i51(33);
            i51Var.d = i12;
            i51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(i51Var);
            i10 = i12;
        }
        if (g40Var.P || !g40Var.S) {
            arrayList.add(i51.o(-2, 1));
            arrayList.add(i51.o(-3, 1));
            arrayList.add(i51.o(-4, 1));
        }
        if (!g40Var.O && z4) {
            AndroidUtilities.runOnUIThread(new vp(g40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        m70 m70Var = (m70) this.f24084b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        o70 o70Var = m70Var.f26969x;
        o70Var.f27466f.setAlpha(1.0f);
        if (o70Var.f27491u) {
            m70Var.f26963c = bitmap;
        }
        sg.b bVar = o70Var.f27480n;
        if (bVar != null) {
            bVar.a(bitmap2);
            tg.c.c(o70Var.f27480n, m70Var);
            ViewGroup viewGroup = o70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        eh0 eh0Var = (eh0) this.f24084b;
        ArrayList arrayList = (ArrayList) obj;
        w51 w51Var = (w51) obj2;
        ArrayList arrayList2 = eh0Var.e;
        ArrayList arrayList3 = eh0Var.f24580n;
        int i10 = 0;
        if (eh0Var.d == null) {
            arrayList.add(i51.o(-1, 7));
            arrayList.add(i51.o(-2, 7));
            arrayList.add(i51.o(-3, 7));
            eh0Var.N = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(eh0Var.f24583w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(i51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                i51 i51Var = new i51(33);
                i51Var.G = (MessageObject) obj3;
                arrayList.add(i51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(i51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                i51 i51Var2 = new i51(33);
                i51Var2.G = (MessageObject) obj4;
                arrayList.add(i51Var2);
            }
        }
        if (eh0Var.v || ((eh0Var.J && !eh0Var.K) || (!isEmpty && !arrayList3.isEmpty() && !eh0Var.f24582s))) {
            arrayList.add(i51.o(eh0Var.I * 3, 7));
            arrayList.add(i51.o((eh0Var.I * 3) + 1, 7));
            arrayList.add(i51.o((eh0Var.I * 3) + 2, 7));
        }
        eh0Var.N = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        im0 im0Var = (im0) this.f24084b;
        im0Var.f25748c = (Bitmap) obj;
        Paint paint = new Paint(1);
        im0Var.e = paint;
        Bitmap bitmap = im0Var.f25748c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        im0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        im0Var.f25749f = new Matrix();
        sg.b bVar = im0Var.h;
        bVar.a((Bitmap) obj2);
        tg.c.c(bVar, im0Var.f25752s);
        ViewGroup viewGroup = im0Var.f25755y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        xx0 xx0Var = (xx0) this.f24084b;
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
