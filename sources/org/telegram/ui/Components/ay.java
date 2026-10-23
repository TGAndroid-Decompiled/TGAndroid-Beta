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
public final class ay extends im0 {
    public int E;
    public final tz F;
    public ArrayList h;
    public int f24748y;
    public int f24741c = -1;
    public int d = -1;
    public int e = -1;
    public int f24742f = -1;
    public final ArrayList f24743n = new ArrayList();
    public final SparseIntArray f24744r = new SparseIntArray();
    public final SparseIntArray f24745s = new SparseIntArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseIntArray f24746w = new SparseIntArray();
    public final ArrayList f24747x = new ArrayList();

    public ay(tz tzVar) {
        this.F = tzVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45924f;
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
        tz tzVar = this.F;
        ArrayList arrayList = tzVar.f30769q1;
        int i11 = this.f24746w.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            fy fyVar = (fy) arrayList.get(i11);
            if (!fyVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f24747x.get(i11)).intValue();
                tzVar.f30763o1.add(Long.valueOf(fyVar.f26439b.f20307id));
                if (!UserConfig.getInstance(tzVar.f30727c1).isPremium() && !tzVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = tzVar.Q.J * 3;
                if ((fyVar.f26441f && !fyVar.f26442g && (fyVar.e || z11)) || fyVar.h) {
                    min = fyVar.f26440c.size();
                } else {
                    min = Math.min(i12, fyVar.f26440c.size());
                }
                Integer num2 = null;
                if (fyVar.f26440c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                fyVar.h = true;
                int size = fyVar.f26440c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    tzVar.f30774r2 = view;
                    tzVar.f30778s2 = num.intValue();
                    tzVar.f30781t2 = num2.intValue() + num.intValue();
                    tzVar.f30784u2 = SystemClock.elapsedRealtime();
                    s(num.intValue(), num2.intValue());
                    m(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        tzVar.post(new zx(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        tz tzVar = this.F;
        ArrayList arrayList = tzVar.f30760n1;
        if (tzVar.N2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f24743n);
        MediaDataController mediaDataController = MediaDataController.getInstance(tzVar.f30727c1);
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        arrayList.clear();
        int size = featuredEmojiSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20307id) || tzVar.f30766p1.contains(Long.valueOf(stickerSetCovered.set.f20307id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        rz rzVar = tzVar.T;
        if (rzVar != null) {
            rzVar.l();
        }
        s4.o.c(new hg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        tz tzVar = this.F;
        ArrayList arrayList = tzVar.f30760n1;
        ArrayList arrayList2 = tzVar.f30763o1;
        int i11 = tzVar.f30727c1;
        ArrayList arrayList3 = tzVar.f30769q1;
        arrayList3.clear();
        if (tzVar.f30728c2) {
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(mediaDataController.getStickerSets(5));
            }
            ArrayList arrayList4 = this.h;
            boolean z13 = true;
            if (!UserConfig.getInstance(i11).isPremium() && !tzVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = tzVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet)) != null) {
                fy fyVar = new fy();
                fyVar.f26439b = tzVar.J1.emojiset;
                fyVar.f26440c = new ArrayList(groupStickerSetById.documents);
                fyVar.e = true;
                fyVar.f26441f = true;
                fyVar.f26442g = false;
                fyVar.h = true;
                fyVar.f26443i = true;
                arrayList3.add(fyVar);
                TLRPC.StickerSet stickerSet2 = fyVar.f26439b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f20307id == stickerSet2.f20307id) {
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
                        fy fyVar2 = new fy();
                        fyVar2.f26439b = tL_messages_stickerSet2.set;
                        fyVar2.f26440c = new ArrayList(tL_messages_stickerSet2.documents);
                        fyVar2.e = true;
                        fyVar2.f26441f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.f20307id);
                        fyVar2.f26442g = false;
                        fyVar2.h = true;
                        arrayList3.add(fyVar2);
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
                    fy fyVar3 = new fy();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    fyVar3.f26439b = stickerSet3;
                    fyVar3.f26440c = tL_messages_stickerSet3.documents;
                    fyVar3.e = false;
                    fyVar3.f26441f = mediaDataController.isStickerPackInstalled(stickerSet3.f20307id);
                    fyVar3.f26442g = false;
                    fyVar3.h = z13;
                    arrayList3.add(fyVar3);
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
                        fy fyVar4 = new fy();
                        fyVar4.f26439b = tL_messages_stickerSet3.set;
                        fyVar4.f26440c = new ArrayList(arrayList5);
                        fyVar4.e = z13;
                        i10 = i14;
                        fyVar4.f26441f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20307id);
                        fyVar4.f26442g = false;
                        fyVar4.h = true;
                        arrayList3.add(fyVar4);
                    } else {
                        i10 = i14;
                    }
                    if (arrayList6.size() > 0) {
                        fy fyVar5 = new fy();
                        fyVar5.f26439b = tL_messages_stickerSet3.set;
                        fyVar5.f26440c = new ArrayList(arrayList6);
                        fyVar5.e = false;
                        fyVar5.f26441f = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet3.set.f20307id);
                        fyVar5.f26442g = false;
                        fyVar5.h = arrayList2.contains(Long.valueOf(fyVar5.f26439b.f20307id));
                        arrayList3.add(fyVar5);
                    }
                }
                i14 = i10 + 1;
                z13 = true;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                fy fyVar6 = new fy();
                fyVar6.f26441f = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.f20307id);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                fyVar6.f26439b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    fyVar6.f26440c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet stickerSet5 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true);
                    if (stickerSet5 != null) {
                        fyVar6.f26440c = stickerSet5.documents;
                    } else {
                        fyVar6.d = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                    }
                } else {
                    fyVar6.f26440c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = fyVar6.f26440c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < fyVar6.f26440c.size()) {
                            if (!MessageObject.isFreeEmoji((TLRPC.Document) fyVar6.f26440c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    fyVar6.e = !z12;
                    fyVar6.h = arrayList2.contains(Long.valueOf(fyVar6.f26439b.f20307id));
                    fyVar6.f26442g = true;
                    arrayList3.add(fyVar6);
                }
            }
            vx vxVar = tzVar.I;
            if (vxVar != null) {
                vxVar.p(tzVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ay.H():void");
    }

    @Override
    public final int h() {
        return this.f24748y;
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
        if (i10 == this.f24741c || i10 == this.f24742f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f24744r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            if (sparseIntArray.get(i10) < EmojiData.dataColored.length) {
                return 1;
            }
            return 5;
        } else if (this.F.f30729d0 && i10 == 0) {
            return 2;
        } else {
            if (this.v.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f24746w.indexOfKey(i10) >= 0) {
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
        fy fyVar;
        int i12;
        int i13 = i10;
        tz tzVar = this.F;
        String[] strArr = tzVar.f30720a1;
        rx rxVar = tzVar.Q;
        int i14 = tzVar.f30727c1;
        ArrayList arrayList = tzVar.f30769q1;
        int i15 = b1Var.f45924f;
        View view = b1Var.f45921a;
        boolean z10 = true;
        fy fyVar2 = null;
        if (i15 != 0) {
            SparseIntArray sparseIntArray = this.f24744r;
            if (i15 != 1) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        hy hyVar = (hy) view;
                        int i16 = this.f24746w.get(i13);
                        int i17 = rxVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            fyVar2 = (fy) arrayList.get(i16);
                        }
                        if (fyVar2 != null) {
                            hyVar.f27016a.setText("+" + ((fyVar2.f26440c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                jy jyVar = (jy) view;
                int length = sparseIntArray.get(i13) - strArr.length;
                fy fyVar3 = (fy) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    fyVar = (fy) arrayList.get(i18);
                } else {
                    fyVar = null;
                }
                if (fyVar3 == null || !fyVar3.f26442g || (fyVar != null && !fyVar.e && fyVar.f26441f && !UserConfig.getInstance(i14).isPremium())) {
                    z10 = false;
                }
                if (fyVar3 != null && fyVar3.d != null) {
                    MediaDataController.getInstance(i14).getStickerSet(fyVar3.d, false);
                    fyVar3.d = null;
                }
                sg.q0 q0Var = jyVar.h;
                if (fyVar3 != null) {
                    jyVar.f27678s = fyVar3;
                    jyVar.v = z10;
                    jyVar.f27673b.l(fyVar3.f26439b.title, false);
                    TextView textView = jyVar.f27674c;
                    if (fyVar3.f26443i) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView.setVisibility(i12);
                    if (fyVar3.f26441f && !fyVar3.f26439b.official) {
                        q0Var.a(LocaleController.getString(R.string.Restore), new iy(jyVar, 5), false);
                    } else {
                        q0Var.a(LocaleController.getString(R.string.Unlock), new iy(jyVar, 6), false);
                    }
                    jyVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.getClass();
            int i19 = sparseIntArray.get(i13);
            if (i13 == this.f24741c) {
                n8Var.c(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji), 0, 0);
                return;
            } else if (i13 == this.f24742f) {
                n8Var.b(0, LocaleController.getString(R.string.RecentlyUsed));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    n8Var.b(0, ((fy) arrayList.get(i19 - strArr.length)).f26439b.title);
                    return;
                } catch (Exception unused) {
                    n8Var.b(0, "");
                    return;
                }
            } else {
                n8Var.b(0, strArr[i19]);
                return;
            }
        }
        cz czVar = (cz) view;
        czVar.f25286a = i13;
        czVar.e = null;
        if (tzVar.f30729d0) {
            i13--;
        }
        if (this.f24742f >= 0) {
            i13--;
        }
        if (this.d >= 0) {
            i13 -= 2;
        }
        int size = tzVar.getRecentEmoji().size();
        if (i13 < size) {
            String str3 = tzVar.getRecentEmoji().get(i13);
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
                            str = tz.g(str4, str5);
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
                int i22 = rxVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f24747x;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    fy fyVar4 = (fy) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((fyVar4.f26441f && !fyVar4.f26442g && (fyVar4.e || isPremium)) || fyVar4.h) {
                        min = fyVar4.f26440c.size();
                    } else {
                        min = Math.min(i22, fyVar4.f26440c.size());
                    }
                    int i24 = czVar.f25286a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        czVar.e = fyVar4;
                        TLRPC.Document document2 = (TLRPC.Document) fyVar4.f26440c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f20286id);
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
            czVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        } else {
            czVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            czVar.a(null, z10);
            if (czVar.getSpan() == null || czVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    czVar.setSpan(new a6(document, (Paint.FontMetricsInt) null));
                } else {
                    czVar.setSpan(new a6(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            czVar.a(Emoji.getEmojiBigDrawable(str), z10);
            czVar.setSpan(null);
        }
        czVar.setTag(str2);
        czVar.setContentDescription(str);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ai.u1 u1Var;
        tz tzVar = this.F;
        org.telegram.ui.ActionBar.d6 d6Var = tzVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(tzVar.getContext());
                                view.setLayoutParams(new s4.o0(-1, tzVar.f30723b1));
                                u1Var = view;
                            } else {
                                Context context = tzVar.getContext();
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f27016a = textView;
                                textView.setTextSize(1, 13.0f);
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, d6Var));
                                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), i0.a.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Te, d6Var), 99)));
                                textView.setTypeface(AndroidUtilities.bold());
                                textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
                                frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                                u1Var = frameLayout;
                            }
                        } else {
                            u1Var = new jy(tzVar, tzVar.getContext());
                        }
                    } else {
                        Context context2 = tzVar.getContext();
                        rz rzVar = new rz(tzVar, true);
                        tzVar.T = rzVar;
                        ai.u1 u1Var2 = new ai.u1(tzVar, context2, rzVar);
                        u1Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                        u1Var2.setClipToPadding(false);
                        u1Var2.i(new ci.l(3));
                        u1Var2.setOnItemClickListener(new j(this, 5));
                        u1Var = u1Var2;
                    }
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(tzVar.getContext());
                    q6 q6Var = new q6(frameLayout2.getContext(), false, false, false);
                    q6Var.b(0.3f, 250L, bs.h);
                    q6Var.setTextSize(AndroidUtilities.dp(14.0f));
                    q6Var.setTypeface(AndroidUtilities.bold());
                    q6Var.setTextColor(tzVar.A(org.telegram.ui.ActionBar.h6.Sh));
                    q6Var.setGravity(17);
                    FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                    frameLayout3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{8.0f}, tzVar.A(org.telegram.ui.ActionBar.h6.Oh)));
                    frameLayout3.addView(q6Var, w7.z5.e(-1, -2, 17));
                    frameLayout2.addView(frameLayout3, w7.z5.c(-1.0f, -1));
                    sg.q0 q0Var = new sg.q0(frameLayout2.getContext(), d6Var, false);
                    q0Var.setIcon(R.raw.unlock_icon);
                    frameLayout2.addView(q0Var, w7.z5.c(-1.0f, -1));
                    u1Var = frameLayout2;
                }
            } else {
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(tzVar.getContext(), true, false, tzVar.Z1, tzVar.f30747i2);
                n8Var.setOnIconClickListener(new f0(this, 13));
                u1Var = n8Var;
            }
        } else {
            u1Var = new cz(tzVar.getContext());
        }
        return new s4.b1(u1Var);
    }
}
