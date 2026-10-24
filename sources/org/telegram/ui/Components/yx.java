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
public final class yx extends km0 {
    public int E;
    public final rz F;
    public ArrayList h;
    public int f33077y;
    public int f33070c = -1;
    public int d = -1;
    public int e = -1;
    public int f33071f = -1;
    public final ArrayList f33072n = new ArrayList();
    public final SparseIntArray f33073r = new SparseIntArray();
    public final SparseIntArray f33074s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f33075w = new SparseIntArray();
    public final ArrayList f33076x = new ArrayList();

    public yx(rz rzVar) {
        this.F = rzVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
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
        rz rzVar = this.F;
        ArrayList arrayList = rzVar.f30352q1;
        int i11 = this.f33075w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            dy dyVar = (dy) arrayList.get(i11);
            if (!dyVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f33076x.get(i11)).intValue();
                rzVar.f30346o1.add(Long.valueOf(dyVar.f25856b.f20371id));
                if (!UserConfig.getInstance(rzVar.f30310c1).isPremium() && !rzVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = rzVar.Q.J * 3;
                if ((dyVar.f25858f && !dyVar.f25859g && (dyVar.e || z11)) || dyVar.h) {
                    min = dyVar.f25857c.size();
                } else {
                    min = Math.min(i12, dyVar.f25857c.size());
                }
                Integer num2 = null;
                if (dyVar.f25857c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                dyVar.h = true;
                int size = dyVar.f25857c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    rzVar.f30361s2 = view;
                    rzVar.f30364t2 = num.intValue();
                    rzVar.f30367u2 = num2.intValue() + num.intValue();
                    rzVar.f30370v2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        rzVar.post(new xx(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        rz rzVar = this.F;
        ArrayList arrayList = rzVar.f30343n1;
        if (rzVar.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f33072n);
        MediaDataController mediaDataController = MediaDataController.getInstance(rzVar.f30310c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20371id) || rzVar.f30349p1.contains(Long.valueOf(stickerSetCovered.set.f20371id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        pz pzVar = rzVar.T;
        if (pzVar != null) {
            pzVar.l();
        }
        s4.o.c(new hg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        rz rzVar = this.F;
        ArrayList arrayList = rzVar.f30343n1;
        ArrayList arrayList2 = rzVar.f30346o1;
        int i11 = rzVar.f30310c1;
        ArrayList arrayList3 = rzVar.f30352q1;
        arrayList3.clear();
        if (rzVar.f30311c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !rzVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = rzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                dy dyVar = new dy();
                dyVar.f25856b = rzVar.J1.emojiset;
                dyVar.f25857c = new ArrayList(groupStickerSetById.documents);
                dyVar.e = true;
                dyVar.f25858f = true;
                dyVar.f25859g = false;
                dyVar.h = true;
                dyVar.f25860i = true;
                arrayList3.add(dyVar);
                TLRPC.StickerSet stickerSet2 = dyVar.f25856b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f20371id == stickerSet2.f20371id) {
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
                        dy dyVar2 = new dy();
                        dyVar2.f25856b = tL_messages_stickerSet2.set;
                        dyVar2.f25857c = new ArrayList(tL_messages_stickerSet2.documents);
                        dyVar2.e = true;
                        dyVar2.f25858f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f20371id);
                        dyVar2.f25859g = false;
                        dyVar2.h = true;
                        arrayList3.add(dyVar2);
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
                    dy dyVar3 = new dy();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    dyVar3.f25856b = stickerSet3;
                    dyVar3.f25857c = tL_messages_stickerSet3.documents;
                    dyVar3.e = false;
                    dyVar3.f25858f = mediaDataController.isStickerPackInstalled(stickerSet3.f20371id);
                    dyVar3.f25859g = false;
                    dyVar3.h = z13;
                    arrayList3.add(dyVar3);
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
                        dy dyVar4 = new dy();
                        dyVar4.f25856b = tL_messages_stickerSet3.set;
                        dyVar4.f25857c = new ArrayList(arrayList5);
                        dyVar4.e = z13;
                        i10 = i14;
                        dyVar4.f25858f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20371id);
                        dyVar4.f25859g = false;
                        dyVar4.h = true;
                        arrayList3.add(dyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        dy dyVar5 = new dy();
                        dyVar5.f25856b = tL_messages_stickerSet3.set;
                        dyVar5.f25857c = new ArrayList(arrayList6);
                        dyVar5.e = false;
                        dyVar5.f25858f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20371id);
                        dyVar5.f25859g = false;
                        dyVar5.h = arrayList2.contains(Long.valueOf(dyVar5.f25856b.f20371id));
                        arrayList3.add(dyVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                dy dyVar6 = new dy();
                dyVar6.f25858f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20371id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                dyVar6.f25856b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    dyVar6.f25857c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        dyVar6.f25857c = stickerSet5.documents;
                    } else {
                        dyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    dyVar6.f25857c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = dyVar6.f25857c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < dyVar6.f25857c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) dyVar6.f25857c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    dyVar6.e = !z12;
                    dyVar6.h = arrayList2.contains(Long.valueOf(dyVar6.f25856b.f20371id));
                    dyVar6.f25859g = true;
                    arrayList3.add(dyVar6);
                }
            }
            tx txVar = rzVar.I;
            if (txVar != null) {
                txVar.p(rzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yx.H():void");
    }

    @Override
    public final int h() {
        return this.f33077y;
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
        if (i10 == this.f33070c || i10 == this.f33071f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f33073r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f30312d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f33075w.indexOfKey(i10) >= 0) {
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
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        dy dyVar;
        int i12;
        int i13 = i10;
        rz rzVar = this.F;
        String[] strArr = rzVar.f30303a1;
        px pxVar = rzVar.Q;
        int i14 = rzVar.f30310c1;
        ArrayList arrayList = rzVar.f30352q1;
        int i15 = b1Var.f46345f;
        View view = b1Var.f46342a;
        boolean z10 = true;
        dy dyVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f33073r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        fy fyVar = (fy) view;
                        int i16 = this.f33075w.get(i13);
                        int i17 = pxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            dyVar2 = (dy) arrayList.get(i16);
                        }
                        if (dyVar2 != null) {
                            fyVar.f26444a.setText("+" + ((dyVar2.f25857c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                hy hyVar = (hy) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                dy dyVar3 = (dy) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    dyVar = (dy) arrayList.get(i18);
                } else {
                    dyVar = null;
                }
                if (dyVar3 == null || !dyVar3.f25859g || (dyVar != null && !dyVar.e && dyVar.f25858f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (dyVar3 != null && dyVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(dyVar3.d, false);
                    dyVar3.d = null;
                }
                sg.p0 p0Var = hyVar.f27199r;
                if (dyVar3 != null) {
                    hyVar.f27201w = dyVar3;
                    hyVar.f27202x = z10;
                    hyVar.d.l(dyVar3.f25856b.title, false);
                    TextView textView = hyVar.e;
                    if (dyVar3.f25860i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (dyVar3.f25858f && !dyVar3.f25856b.official) {
                        p0Var.a(LocaleController.getString(R.string.Restore), new gy(hyVar, 5), false);
                    } else {
                        p0Var.a(LocaleController.getString(R.string.Unlock), new gy(hyVar, 6), false);
                    }
                    hyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f33070c) {
                o8Var.b(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f33071f) {
                o8Var.a(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    o8Var.a(0, ((dy) arrayList.get(i19 - strArr.length)).f25856b.title);
                    return;
                } catch (Exception unused) {
                    o8Var.a(0, "");
                    return;
                }
            } else {
                o8Var.a(0, strArr[i19]);
                return;
            }
        }
        az azVar = (az) view;
        azVar.f24846a = i13;
        azVar.e = null;
        if (rzVar.f30312d0) {
            i13--;
        }
        if (this.f33071f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = rzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = rzVar.getRecentEmoji().get(i13);
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
                            str = rz.g(str4, str5);
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
                int i22 = pxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f33076x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    dy dyVar4 = (dy) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((dyVar4.f25858f && !dyVar4.f25859g && (dyVar4.e || isPremium)) || dyVar4.h) {
                        min = dyVar4.f25857c.size();
                    } else {
                        min = Math.min(i22, dyVar4.f25857c.size());
                    }
                    int i24 = azVar.f24846a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        azVar.e = dyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) dyVar4.f25857c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f20350id);
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
            azVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            azVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            azVar.a(null, z10);
            if (azVar.getSpan() == null || azVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    azVar.setSpan(new y5(document, (Paint.FontMetricsInt) null));
                } else {
                    azVar.setSpan(new y5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            azVar.a(Emoji.getEmojiBigDrawable(str), z10);
            azVar.setSpan(null);
        }
        azVar.setTag(str2);
        azVar.setContentDescription(str);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        rz rzVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(rzVar.getContext());
                                view.setLayoutParams(new s4.o0(-1, rzVar.f30306b1));
                                o8Var = view;
                            } else {
                                Context context = rzVar.getContext();
                                org.telegram.ui.ActionBar.g6 g6Var = rzVar.Z1;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f26444a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21184d6, g6Var);
                                int dp = AndroidUtilities.dp(11.0f);
                                int i11 = org.telegram.ui.ActionBar.k6.Te;
                                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 99));
                                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 99);
                                textView.setBackground(c02);
                                org.telegram.ui.ActionBar.r6.k(textView, c02, h, null, g6Var);
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                                o8Var = frameLayout;
                            }
                        } else {
                            o8Var = new hy(rzVar, rzVar.getContext());
                        }
                    } else {
                        Context context2 = rzVar.getContext();
                        pz pzVar = new pz(rzVar, true);
                        rzVar.T = pzVar;
                        ai.u1 u1Var = new ai.u1(rzVar, context2, pzVar);
                        u1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        u1Var.setClipToPadding(false);
                        u1Var.i(new ci.l(3));
                        u1Var.setOnItemClickListener(new j(this, 5));
                        o8Var = u1Var;
                    }
                } else {
                    o8Var = new ey(rzVar, rzVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(rzVar.getContext(), true, false, rzVar.Z1, rzVar.f30330i2);
                o8Var2.setOnIconClickListener(new f0(this, 13));
                o8Var = o8Var2;
            }
        } else {
            o8Var = new az(rzVar.getContext());
        }
        return new s4.b1(o8Var);
    }
}
