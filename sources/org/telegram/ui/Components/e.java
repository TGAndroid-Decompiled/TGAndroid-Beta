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
public final class e implements Utilities.Callback2 {
    public final int f22511a;
    public final Object f22512b;

    public e(Object obj, int i10) {
        this.f22511a = i10;
        this.f22512b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        rz rzVar = (rz) this.f22512b;
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
        ry ryVar = (ry) this.f22512b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
        ArrayList arrayList2 = ryVar.f26782s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            jy jyVar = (jy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jyVar.f24520b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f17222id != ryVar.d) {
                    z10 = false;
                }
                int i11 = ty.f27510a;
                v51 J = v51.J(ty.class);
                long j3 = tL_messages_stickerSet.set.f17222id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = jyVar.f24519a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f17222id != ryVar.d) {
                        z10 = false;
                    }
                    arrayList.add(ty.a(stickerSetCovered, jyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        mz mzVar = (mz) this.f22512b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f17222id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f17222id, 1);
                if (tL_messages_stickerSet.set.f17222id != mzVar.d) {
                    z11 = false;
                }
                int i11 = ty.f27510a;
                v51 J = v51.J(ty.class);
                long j3 = tL_messages_stickerSet.set.f17222id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
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
            jy jyVar = (jy) obj4;
            TLRPC.StickerSet stickerSet = jyVar.f24521c;
            if (longSparseIntArray.indexOfKey(stickerSet.f17222id) < 0) {
                longSparseIntArray.append(stickerSet.f17222id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = jyVar.f24519a;
                if (stickerSet.f17222id == mzVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(ty.a(stickerSetCovered, jyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f22512b;
        float[] fArr = FragmentContextView.M0;
        fragmentContextView.f21152z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.c1 c1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        c1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        n40 n40Var = (n40) this.f22512b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        n40Var.f25407c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(n40Var.f25405a).history);
        if (n40Var.f25407c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < n40Var.f25407c.size(); i11++) {
            String str = (String) n40Var.f25407c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = R.drawable.menu_cashtag;
                } else {
                    i10 = R.drawable.menu_hashtag;
                }
                arrayList.add(v51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(v51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        zh.u4 u4Var;
        o40 o40Var = (o40) this.f22512b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
        ArrayList arrayList2 = o40Var.O;
        int i10 = 0;
        if (o40Var.P && (u4Var = o40Var.Q) != null && u4Var.f48240i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            zh.u4 u4Var2 = o40Var.Q;
            int i11 = fg.n1.f8152a;
            v51 J = v51.J(fg.n1.class);
            J.G = u4Var2;
            arrayList.add(J);
        }
        o40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            v51 v51Var = new v51(33);
            v51Var.d = i12;
            v51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(v51Var);
            i10 = i12;
        }
        if (o40Var.S || !o40Var.V) {
            arrayList.add(v51.o(-2, 1));
            arrayList.add(v51.o(-3, 1));
            arrayList.add(v51.o(-4, 1));
        }
        if (!o40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new dq(o40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        u70 u70Var = (u70) this.f22512b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        w70 w70Var = u70Var.f27603x;
        w70Var.f28678f.setAlpha(1.0f);
        if (w70Var.f28703u) {
            u70Var.f27597c = bitmap;
        }
        eh.b bVar = w70Var.f28692n;
        if (bVar != null) {
            bVar.a(bitmap2);
            fh.d.c(w70Var.f28692n, u70Var);
            ViewGroup viewGroup = w70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        ih0 ih0Var = (ih0) this.f22512b;
        ArrayList arrayList = (ArrayList) obj;
        j61 j61Var = (j61) obj2;
        ArrayList arrayList2 = ih0Var.e;
        ArrayList arrayList3 = ih0Var.f24024n;
        int i10 = 0;
        if (ih0Var.d == null) {
            arrayList.add(v51.o(-1, 7));
            arrayList.add(v51.o(-2, 7));
            arrayList.add(v51.o(-3, 7));
            ih0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(ih0Var.f24027w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(v51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                v51 v51Var = new v51(33);
                v51Var.G = (MessageObject) obj3;
                arrayList.add(v51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(v51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                v51 v51Var2 = new v51(33);
                v51Var2.G = (MessageObject) obj4;
                arrayList.add(v51Var2);
            }
        }
        if (ih0Var.v || ((ih0Var.M && !ih0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !ih0Var.f24026s))) {
            arrayList.add(v51.o(ih0Var.L * 3, 7));
            arrayList.add(v51.o((ih0Var.L * 3) + 1, 7));
            arrayList.add(v51.o((ih0Var.L * 3) + 2, 7));
        }
        ih0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        km0 km0Var = (km0) this.f22512b;
        km0Var.f24753c = (Bitmap) obj;
        Paint paint = new Paint(1);
        km0Var.e = paint;
        Bitmap bitmap = km0Var.f24753c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        km0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        km0Var.f24754f = new Matrix();
        eh.b bVar = km0Var.h;
        bVar.a((Bitmap) obj2);
        fh.d.c(bVar, km0Var.f24757s);
        ViewGroup viewGroup = km0Var.f24760y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        hy0 hy0Var = (hy0) this.f22512b;
        CharSequence charSequence = (CharSequence) obj;
        hy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(hy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new z1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e.run(java.lang.Object, java.lang.Object):void");
    }
}
