package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class vx extends wl0 {
    public int E;
    public final mz F;
    public ArrayList h;
    public int f29785y;
    public int f29778c = -1;
    public int d = -1;
    public int e = -1;
    public int f29779f = -1;
    public final ArrayList f29780n = new ArrayList();
    public final SparseIntArray f29781r = new SparseIntArray();
    public final SparseIntArray f29782s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f29783w = new SparseIntArray();
    public final ArrayList f29784x = new ArrayList();

    public vx(mz mzVar) {
        this.F = mzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42962f;
        if (i10 != 0 && i10 != 4 && i10 != 3 && i10 != 6) {
            return false;
        }
        return true;
    }

    public final void E(int i10, View view) {
        boolean z10;
        boolean z11;
        int min;
        Integer num;
        float f7;
        mz mzVar = this.F;
        ArrayList arrayList = mzVar.f26590q1;
        int i11 = this.f29783w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            zx zxVar = (zx) arrayList.get(i11);
            if (!zxVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f29784x.get(i11)).intValue();
                mzVar.f26584o1.add(Long.valueOf(zxVar.f30992b.f18362id));
                if (!UserConfig.getInstance(mzVar.f26548c1).isPremium() && !mzVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = mzVar.Q.J * 3;
                if ((zxVar.f30994f && !zxVar.f30995g && (zxVar.e || z11)) || zxVar.h) {
                    min = zxVar.f30993c.size();
                } else {
                    min = Math.min(i12, zxVar.f30993c.size());
                }
                Integer num2 = null;
                if (zxVar.f30993c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                zxVar.h = true;
                int size = zxVar.f30993c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    mzVar.f26595r2 = view;
                    mzVar.f26599s2 = num.intValue();
                    mzVar.f26602t2 = num2.intValue() + num.intValue();
                    mzVar.f26605u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        mzVar.post(new ux(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        mz mzVar = this.F;
        ArrayList arrayList = mzVar.f26581n1;
        if (mzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f29780n);
        MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.f26548c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18362id) || mzVar.f26587p1.contains(Long.valueOf(stickerSetCovered.set.f18362id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        kz kzVar = mzVar.T;
        if (kzVar != null) {
            kzVar.l();
        }
        s4.o.c(new gg.g(this, arrayList2, 2), false).b(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        mz mzVar = this.F;
        ArrayList arrayList = mzVar.f26581n1;
        ArrayList arrayList2 = mzVar.f26584o1;
        int i11 = mzVar.f26548c1;
        ArrayList arrayList3 = mzVar.f26590q1;
        arrayList3.clear();
        if (mzVar.f26549c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !mzVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = mzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                zx zxVar = new zx();
                zxVar.f30992b = mzVar.J1.emojiset;
                zxVar.f30993c = new ArrayList(groupStickerSetById.documents);
                zxVar.e = true;
                zxVar.f30994f = true;
                zxVar.f30995g = false;
                zxVar.h = true;
                zxVar.f30996i = true;
                arrayList3.add(zxVar);
                TLRPC.StickerSet stickerSet2 = zxVar.f30992b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f18362id == stickerSet2.f18362id) {
                        arrayList4.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (!z11) {
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                    if (tL_messages_stickerSet2 != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2)) {
                        zx zxVar2 = new zx();
                        zxVar2.f30992b = tL_messages_stickerSet2.set;
                        zxVar2.f30993c = new ArrayList(tL_messages_stickerSet2.documents);
                        zxVar2.e = true;
                        zxVar2.f30994f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f18362id);
                        zxVar2.f30995g = false;
                        zxVar2.h = true;
                        arrayList3.add(zxVar2);
                        arrayList4.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i14);
                if (z11) {
                    zx zxVar3 = new zx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    zxVar3.f30992b = stickerSet3;
                    zxVar3.f30993c = tL_messages_stickerSet3.documents;
                    zxVar3.e = false;
                    zxVar3.f30994f = mediaDataController.isStickerPackInstalled(stickerSet3.f18362id);
                    zxVar3.f30995g = false;
                    zxVar3.h = z13;
                    arrayList3.add(zxVar3);
                    i10 = i14;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i15 = 0; i15 < tL_messages_stickerSet3.documents.size(); i15++) {
                            if (MessageObject.isFreeEmoji(tL_messages_stickerSet3.documents.get(i15))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i15));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i15));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        zx zxVar4 = new zx();
                        zxVar4.f30992b = tL_messages_stickerSet3.set;
                        zxVar4.f30993c = new ArrayList(arrayList5);
                        zxVar4.e = z13;
                        i10 = i14;
                        zxVar4.f30994f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18362id);
                        zxVar4.f30995g = false;
                        zxVar4.h = true;
                        arrayList3.add(zxVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        zx zxVar5 = new zx();
                        zxVar5.f30992b = tL_messages_stickerSet3.set;
                        zxVar5.f30993c = new ArrayList(arrayList6);
                        zxVar5.e = false;
                        zxVar5.f30994f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f18362id);
                        zxVar5.f30995g = false;
                        zxVar5.h = arrayList2.contains(Long.valueOf(zxVar5.f30992b.f18362id));
                        arrayList3.add(zxVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                zx zxVar6 = new zx();
                zxVar6.f30994f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f18362id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                zxVar6.f30992b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    zxVar6.f30993c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        zxVar6.f30993c = stickerSet5.documents;
                    } else {
                        zxVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    zxVar6.f30993c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = zxVar6.f30993c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < zxVar6.f30993c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) zxVar6.f30993c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    zxVar6.e = !z12;
                    zxVar6.h = arrayList2.contains(Long.valueOf(zxVar6.f30992b.f18362id));
                    zxVar6.f30995g = true;
                    arrayList3.add(zxVar6);
                }
            }
            qx qxVar = mzVar.I;
            if (qxVar != null) {
                qxVar.p(mzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vx.H():void");
    }

    @Override
    public final int h() {
        return this.f29785y;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.d) {
            return 4;
        }
        if (i10 == this.f29778c || i10 == this.f29779f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f29781r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f26550d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f29783w.indexOfKey(i10) >= 0) {
                return 6;
            }
            return 0;
        }
    }

    @Override
    public final void l() {
        F(false);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        zx zxVar;
        int i12;
        int i13 = i10;
        mz mzVar = this.F;
        String[] strArr = mzVar.f26541a1;
        mx mxVar = mzVar.Q;
        int i14 = mzVar.f26548c1;
        ArrayList arrayList = mzVar.f26590q1;
        int i15 = c1Var.f42962f;
        View view = c1Var.f42959a;
        boolean z10 = true;
        zx zxVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f29781r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        cy cyVar = (cy) view;
                        int i16 = this.f29783w.get(i13);
                        int i17 = mxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            zxVar2 = (zx) arrayList.get(i16);
                        }
                        if (zxVar2 != null) {
                            cyVar.f23431a.setText("+" + ((zxVar2.f30993c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ey eyVar = (ey) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                zx zxVar3 = (zx) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    zxVar = (zx) arrayList.get(i18);
                } else {
                    zxVar = null;
                }
                if (zxVar3 == null || !zxVar3.f30995g || (zxVar != null && !zxVar.e && zxVar.f30994f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (zxVar3 != null && zxVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(zxVar3.d, false);
                    zxVar3.d = null;
                }
                rg.p0 p0Var = eyVar.h;
                if (zxVar3 != null) {
                    eyVar.f24081s = zxVar3;
                    eyVar.v = z10;
                    eyVar.f24076b.l(zxVar3.f30992b.title, false);
                    TextView textView = eyVar.f24077c;
                    if (zxVar3.f30996i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (zxVar3.f30994f && !zxVar3.f30992b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new dy(eyVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new dy(eyVar, 6), false);
                    }
                    eyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f29778c) {
                o8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f29779f) {
                o8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.b(0, ((zx) arrayList.get(i19 - strArr.length)).f30992b.title);
                    return;
                } catch (Exception unused) {
                    o8Var.b(0, "");
                    return;
                }
            } else {
                o8Var.b(0, strArr[i19]);
                return;
            }
        }
        vy vyVar = (vy) view;
        vyVar.f29787a = i13;
        vyVar.e = null;
        if (mzVar.f26550d0) {
            i13--;
        }
        if (this.f29779f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = mzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = mzVar.getRecentEmoji().get(i13);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l4 = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l4 = null;
            str2 = str;
            document = null;
        } else {
            int i20 = 0;
            while (true) {
                String[][] strArr2 = EmojiData.dataColored;
                if (i20 < strArr2.length) {
                    String[] strArr3 = strArr2[i20];
                    int length2 = strArr3.length + 1;
                    int i21 = (i13 - size) - 1;
                    if (i21 >= 0 && i13 < size + length2) {
                        String str4 = strArr3[i21];
                        String str5 = Emoji.emojiColor.get(str4);
                        if (str5 != null) {
                            str = mz.g(str4, str5);
                            str2 = str4;
                        } else {
                            str = str4;
                        }
                    } else {
                        size += length2;
                        i20++;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean isPremium = UserConfig.getInstance(i14).isPremium();
                int i22 = mxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f29784x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    zx zxVar4 = (zx) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((zxVar4.f30994f && !zxVar4.f30995g && (zxVar4.e || isPremium)) || zxVar4.h) {
                        min = zxVar4.f30993c.size();
                    } else {
                        min = Math.min(i22, zxVar4.f30993c.size());
                    }
                    int i24 = vyVar.f29787a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        vyVar.e = zxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) zxVar4.f30993c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f18341id);
                        }
                        Long l10 = valueOf;
                        document = document2;
                        l4 = l10;
                    } else {
                        i23++;
                    }
                }
            }
            l4 = null;
            document = null;
            z10 = false;
        }
        if (l4 != null) {
            vyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            vyVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            vyVar.a(null, z10);
            if (vyVar.getSpan() == null || vyVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    vyVar.setSpan(new z5(document, (Paint.FontMetricsInt) null));
                } else {
                    vyVar.setSpan(new z5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            vyVar.a(Emoji.getEmojiBigDrawable(str), z10);
            vyVar.setSpan(null);
        }
        vyVar.setTag(str2);
        vyVar.setContentDescription(str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ai.w0 w0Var;
        mz mzVar = this.F;
        org.telegram.ui.ActionBar.d6 d6Var = mzVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(mzVar.getContext());
                                view.setLayoutParams(new s4.p0(-1, mzVar.f26544b1));
                                w0Var = view;
                            } else {
                                Context context = mzVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f23431a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(11.0f), i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Te, d6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.y5.e(-2, -2, 17));
                                w0Var = frameLayout;
                            }
                        } else {
                            w0Var = new ey(mzVar, mzVar.getContext());
                        }
                    } else {
                        Context context2 = mzVar.getContext();
                        kz kzVar = new kz(mzVar, true);
                        mzVar.T = kzVar;
                        ai.w0 w0Var2 = new ai.w0(mzVar, context2, kzVar);
                        w0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        w0Var2.setClipToPadding(false);
                        w0Var2.i(new ai.t(3));
                        w0Var2.setOnItemClickListener(new j(this, 5));
                        w0Var = w0Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(mzVar.getContext());
                    p6 p6Var = new p6(frameLayout2.getContext(), false, false, false);
                    p6Var.b(0.3f, 250L, sr.h);
                    p6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    p6Var.setTypeface(AndroidUtilities.bold());
                    p6Var.setTextColor(mzVar.z(org.telegram.ui.ActionBar.h6.Sh));
                    p6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, mzVar.z(org.telegram.ui.ActionBar.h6.Oh)));
                    frameLayout3.addView(p6Var, w7.y5.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.y5.c(-1.0f, -1));
                    rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), d6Var, false);
                    p0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(p0Var, w7.y5.c(-1.0f, -1));
                    w0Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(mzVar.getContext(), true, false, mzVar.Z1, mzVar.f26568i2);
                o8Var.setOnIconClickListener(new f0(this, 14));
                w0Var = o8Var;
            }
        } else {
            w0Var = new vy(mzVar.getContext());
        }
        return new s4.c1(w0Var);
    }
}
