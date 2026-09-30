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
    public final int f23452a;
    public final Object f23453b;

    public d(Object obj, int i10) {
        this.f23452a = i10;
        this.f23453b = obj;
    }

    private final void a(Object obj, Object obj2) {
        String str;
        nz nzVar = (nz) this.f23453b;
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
        ny nyVar = (ny) this.f23453b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
        ArrayList arrayList2 = nyVar.f26803s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            gy gyVar = (gy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = gyVar.f24685b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f18379id != nyVar.d) {
                    z10 = false;
                }
                int i11 = py.f27485a;
                y51 J = y51.J(py.class);
                long j3 = tL_messages_stickerSet.set.f18379id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = gyVar.f24684a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f18379id != nyVar.d) {
                        z10 = false;
                    }
                    arrayList.add(py.a(stickerSetCovered, gyVar, z10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        iz izVar = (iz) this.f23453b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f18379id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f18379id, 1);
                if (tL_messages_stickerSet.set.f18379id != izVar.d) {
                    z11 = false;
                }
                int i11 = py.f27485a;
                y51 J = y51.J(py.class);
                long j3 = tL_messages_stickerSet.set.f18379id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z11;
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
            TLRPC.StickerSet stickerSet = gyVar.f24686c;
            if (longSparseIntArray.indexOfKey(stickerSet.f18379id) < 0) {
                longSparseIntArray.append(stickerSet.f18379id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = gyVar.f24684a;
                if (stickerSet.f18379id == izVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(py.a(stickerSetCovered, gyVar, z10));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f23453b;
        float[] fArr = FragmentContextView.P0;
        fragmentContextView.f22311z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        a1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        int i10;
        h40 h40Var = (h40) this.f23453b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        h40Var.f24736c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(h40Var.f24734a).history);
        if (h40Var.f24736c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < h40Var.f24736c.size(); i11++) {
            String str = (String) h40Var.f24736c.get(i11);
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
        i40 i40Var = (i40) this.f23453b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
        ArrayList arrayList2 = i40Var.O;
        int i10 = 0;
        if (i40Var.P && (v8Var = i40Var.Q) != null && v8Var.f725i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ai.v8 v8Var2 = i40Var.Q;
            int i11 = gg.m1.f9856a;
            y51 J = y51.J(gg.m1.class);
            J.G = v8Var2;
            arrayList.add(J);
        }
        i40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            y51 y51Var = new y51(33);
            y51Var.d = i12;
            y51Var.G = (MessageObject) arrayList2.get(i10);
            arrayList.add(y51Var);
            i10 = i12;
        }
        if (i40Var.S || !i40Var.V) {
            arrayList.add(y51.o(-2, 1));
            arrayList.add(y51.o(-3, 1));
            arrayList.add(y51.o(-4, 1));
        }
        if (!i40Var.R && z10) {
            AndroidUtilities.runOnUIThread(new aq(i40Var, 20));
        }
    }

    private final void g(Object obj, Object obj2) {
        z70 z70Var = (z70) this.f23453b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        b80 b80Var = z70Var.f30911x;
        b80Var.f22849f.setAlpha(1.0f);
        if (b80Var.f22874u) {
            z70Var.f30905c = bitmap;
        }
        fh.b bVar = b80Var.f22863n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(b80Var.f22863n, z70Var);
            ViewGroup viewGroup = b80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        mh0 mh0Var = (mh0) this.f23453b;
        ArrayList arrayList = (ArrayList) obj;
        m61 m61Var = (m61) obj2;
        ArrayList arrayList2 = mh0Var.e;
        ArrayList arrayList3 = mh0Var.f26293n;
        int i10 = 0;
        if (mh0Var.d == null) {
            arrayList.add(y51.o(-1, 7));
            arrayList.add(y51.o(-2, 7));
            arrayList.add(y51.o(-3, 7));
            mh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(mh0Var.f26296w);
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
        if (mh0Var.v || ((mh0Var.M && !mh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !mh0Var.f26295s))) {
            arrayList.add(y51.o(mh0Var.L * 3, 7));
            arrayList.add(y51.o((mh0Var.L * 3) + 1, 7));
            arrayList.add(y51.o((mh0Var.L * 3) + 2, 7));
        }
        mh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        pm0 pm0Var = (pm0) this.f23453b;
        pm0Var.f27400c = (Bitmap) obj;
        Paint paint = new Paint(1);
        pm0Var.e = paint;
        Bitmap bitmap = pm0Var.f27400c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        pm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        pm0Var.f27401f = new Matrix();
        fh.b bVar = pm0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, pm0Var.f27404s);
        ViewGroup viewGroup = pm0Var.f27407y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        iy0 iy0Var = (iy0) this.f23453b;
        CharSequence charSequence = (CharSequence) obj;
        iy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(iy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.run(java.lang.Object, java.lang.Object):void");
    }
}
