package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
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
public final class zx extends lm0 {
    public int E;
    public final sz F;
    public ArrayList h;
    public int f35431y;
    public int f35424c = -1;
    public int d = -1;
    public int e = -1;
    public int f35425f = -1;
    public final ArrayList f35426n = new ArrayList();
    public final SparseIntArray f35427r = new SparseIntArray();
    public final SparseIntArray f35428s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f35429w = new SparseIntArray();
    public final ArrayList f35430x = new ArrayList();

    public zx(sz szVar) {
        this.F = szVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
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
        sz szVar = this.F;
        ArrayList arrayList = szVar.f32758q1;
        int i11 = this.f35429w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            ey eyVar = (ey) arrayList.get(i11);
            if (!eyVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f35430x.get(i11)).intValue();
                szVar.f32752o1.add(Long.valueOf(eyVar.f28006b.f22054id));
                if (!UserConfig.getInstance(szVar.f32716c1).isPremium() && !szVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = szVar.Q.J * 3;
                if ((eyVar.f28008f && !eyVar.f28009g && (eyVar.e || z11)) || eyVar.h) {
                    min = eyVar.f28007c.size();
                } else {
                    min = Math.min(i12, eyVar.f28007c.size());
                }
                Integer num2 = null;
                if (eyVar.f28007c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                eyVar.h = true;
                int size = eyVar.f28007c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    szVar.f32767s2 = view;
                    szVar.f32770t2 = num.intValue();
                    szVar.f32773u2 = num2.intValue() + num.intValue();
                    szVar.f32776v2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        szVar.post(new yx(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        sz szVar = this.F;
        ArrayList arrayList = szVar.f32749n1;
        if (szVar.R2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f35426n);
        MediaDataController mediaDataController = MediaDataController.getInstance(szVar.f32716c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f22054id) || szVar.f32755p1.contains(Long.valueOf(stickerSetCovered.set.f22054id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        qz qzVar = szVar.T;
        if (qzVar != null) {
            qzVar.l();
        }
        s4.p.c(new ig.h(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        sz szVar = this.F;
        ArrayList arrayList = szVar.f32749n1;
        ArrayList arrayList2 = szVar.f32752o1;
        int i11 = szVar.f32716c1;
        ArrayList arrayList3 = szVar.f32758q1;
        arrayList3.clear();
        if (szVar.f32717c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !szVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = szVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                ey eyVar = new ey();
                eyVar.f28006b = szVar.J1.emojiset;
                eyVar.f28007c = new ArrayList(groupStickerSetById.documents);
                eyVar.e = true;
                eyVar.f28008f = true;
                eyVar.f28009g = false;
                eyVar.h = true;
                eyVar.f28010i = true;
                arrayList3.add(eyVar);
                TLRPC.StickerSet stickerSet2 = eyVar.f28006b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f22054id == stickerSet2.f22054id) {
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
                        ey eyVar2 = new ey();
                        eyVar2.f28006b = tL_messages_stickerSet2.set;
                        eyVar2.f28007c = new ArrayList(tL_messages_stickerSet2.documents);
                        eyVar2.e = true;
                        eyVar2.f28008f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f22054id);
                        eyVar2.f28009g = false;
                        eyVar2.h = true;
                        arrayList3.add(eyVar2);
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
                    ey eyVar3 = new ey();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    eyVar3.f28006b = stickerSet3;
                    eyVar3.f28007c = tL_messages_stickerSet3.documents;
                    eyVar3.e = false;
                    eyVar3.f28008f = mediaDataController.isStickerPackInstalled(stickerSet3.f22054id);
                    eyVar3.f28009g = false;
                    eyVar3.h = z13;
                    arrayList3.add(eyVar3);
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
                        ey eyVar4 = new ey();
                        eyVar4.f28006b = tL_messages_stickerSet3.set;
                        eyVar4.f28007c = new ArrayList(arrayList5);
                        eyVar4.e = z13;
                        i10 = i14;
                        eyVar4.f28008f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f22054id);
                        eyVar4.f28009g = false;
                        eyVar4.h = true;
                        arrayList3.add(eyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        ey eyVar5 = new ey();
                        eyVar5.f28006b = tL_messages_stickerSet3.set;
                        eyVar5.f28007c = new ArrayList(arrayList6);
                        eyVar5.e = false;
                        eyVar5.f28008f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f22054id);
                        eyVar5.f28009g = false;
                        eyVar5.h = arrayList2.contains(Long.valueOf(eyVar5.f28006b.f22054id));
                        arrayList3.add(eyVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                ey eyVar6 = new ey();
                eyVar6.f28008f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f22054id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                eyVar6.f28006b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    eyVar6.f28007c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        eyVar6.f28007c = stickerSet5.documents;
                    } else {
                        eyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    eyVar6.f28007c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = eyVar6.f28007c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < eyVar6.f28007c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) eyVar6.f28007c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    eyVar6.e = !z12;
                    eyVar6.h = arrayList2.contains(Long.valueOf(eyVar6.f28006b.f22054id));
                    eyVar6.f28009g = true;
                    arrayList3.add(eyVar6);
                }
            }
            ux uxVar = szVar.I;
            if (uxVar != null) {
                uxVar.p(szVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zx.H():void");
    }

    @Override
    public final int h() {
        return this.f35431y;
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
        if (i10 == this.f35424c || i10 == this.f35425f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f35427r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f32718d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f35429w.indexOfKey(i10) >= 0) {
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
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        ey eyVar;
        int i12;
        int i13 = i10;
        sz szVar = this.F;
        String[] strArr = szVar.f32709a1;
        qx qxVar = szVar.Q;
        int i14 = szVar.f32716c1;
        ArrayList arrayList = szVar.f32758q1;
        int i15 = e1Var.f47738f;
        View view = e1Var.f47735a;
        boolean z10 = true;
        ey eyVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f35427r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        gy gyVar = (gy) view;
                        int i16 = this.f35429w.get(i13);
                        int i17 = qxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            eyVar2 = (ey) arrayList.get(i16);
                        }
                        if (eyVar2 != null) {
                            gyVar.f28746a.setText("+" + ((eyVar2.f28007c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                iy iyVar = (iy) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                ey eyVar3 = (ey) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    eyVar = (ey) arrayList.get(i18);
                } else {
                    eyVar = null;
                }
                if (eyVar3 == null || !eyVar3.f28009g || (eyVar != null && !eyVar.e && eyVar.f28008f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (eyVar3 != null && eyVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(eyVar3.d, false);
                    eyVar3.d = null;
                }
                tg.p0 p0Var = iyVar.f29397r;
                if (eyVar3 != null) {
                    iyVar.f29399w = eyVar3;
                    iyVar.f29400x = z10;
                    iyVar.d.l(eyVar3.f28006b.title, false);
                    TextView textView = iyVar.e;
                    if (eyVar3.f28010i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (eyVar3.f28008f && !eyVar3.f28006b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new hy(iyVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new hy(iyVar, 6), false);
                    }
                    iyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f35424c) {
                s8Var.b(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f35425f) {
                s8Var.a(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    s8Var.a(0, ((ey) arrayList.get(i19 - strArr.length)).f28006b.title);
                    return;
                } catch (Exception unused) {
                    s8Var.a(0, "");
                    return;
                }
            } else {
                s8Var.a(0, strArr[i19]);
                return;
            }
        }
        bz bzVar = (bz) view;
        bzVar.f26998a = i13;
        bzVar.e = null;
        if (szVar.f32718d0) {
            i13--;
        }
        if (this.f35425f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = szVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = szVar.getRecentEmoji().get(i13);
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
                            str = sz.g(str4, str5);
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
                int i22 = qxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f35430x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    ey eyVar4 = (ey) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((eyVar4.f28008f && !eyVar4.f28009g && (eyVar4.e || isPremium)) || eyVar4.h) {
                        min = eyVar4.f28007c.size();
                    } else {
                        min = Math.min(i22, eyVar4.f28007c.size());
                    }
                    int i24 = bzVar.f26998a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        bzVar.e = eyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) eyVar4.f28007c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f22033id);
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
            bzVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            bzVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            bzVar.a(null, z10);
            if (bzVar.getSpan() == null || bzVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    bzVar.setSpan(new c6(document, (Paint.FontMetricsInt) null));
                } else {
                    bzVar.setSpan(new c6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            bzVar.a(Emoji.getEmojiBigDrawable(str), z10);
            bzVar.setSpan(null);
        }
        bzVar.setTag(str2);
        bzVar.setContentDescription(str);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s8 s8Var;
        sz szVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(szVar.getContext());
                                view.setLayoutParams(new s4.q0(-1, szVar.f32712b1));
                                s8Var = view;
                            } else {
                                Context context = szVar.getContext();
                                org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f28746a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23354d6, u6Var);
                                int dp = AndroidUtilities.dp(11.0f);
                                int i11 = org.telegram.ui.ActionBar.y6.Te;
                                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, i0.a.o(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 99));
                                org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 99);
                                textView.setBackground(c02);
                                org.telegram.ui.ActionBar.f7.k(textView, c02, h, null, u6Var);
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, gb1.i(-2, -2, 17));
                                s8Var = frameLayout;
                            }
                        } else {
                            s8Var = new iy(szVar, szVar.getContext());
                        }
                    } else {
                        Context context2 = szVar.getContext();
                        qz qzVar = new qz(szVar, true);
                        szVar.T = qzVar;
                        bi.r1 r1Var = new bi.r1(szVar, context2, qzVar);
                        r1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        r1Var.setClipToPadding(false);
                        r1Var.i(new di.l(3));
                        r1Var.setOnItemClickListener(new j(this, 5));
                        s8Var = r1Var;
                    }
                } else {
                    s8Var = new fy(szVar, szVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(szVar.getContext(), true, false, szVar.Z1, szVar.f32736i2);
                s8Var2.setOnIconClickListener(new f0(this, 13));
                s8Var = s8Var2;
            }
        } else {
            s8Var = new bz(szVar.getContext());
        }
        return new s4.e1(s8Var);
    }
}
