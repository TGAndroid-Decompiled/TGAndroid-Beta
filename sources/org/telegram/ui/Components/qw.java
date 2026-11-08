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
import org.telegram.tgnet.TLRPC;
public final class qw extends oj0 {
    public int D;
    public int E;
    public final hy F;
    public ArrayList h;
    public int f37427c = -1;
    public int d = -1;
    public int f37428e = -1;
    public int f37429f = -1;
    public final ArrayList f37430n = new ArrayList();
    public final SparseIntArray f37431r = new SparseIntArray();
    public final SparseIntArray f37432s = new SparseIntArray();
    public final SparseIntArray f37433w = new SparseIntArray();
    public final SparseIntArray f37434x = new SparseIntArray();
    public final ArrayList f37435y = new ArrayList();

    public qw(hy hyVar) {
        this.F = hyVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        if (i7 != 0 && i7 != 4 && i7 != 3 && i7 != 6) {
            return false;
        }
        return true;
    }

    public final void E(int i7, View view) {
        boolean z9;
        boolean z10;
        int min;
        Integer num;
        float f10;
        hy hyVar = this.F;
        ArrayList arrayList = hyVar.f34441q1;
        int i10 = this.f37434x.get(i7);
        if (i10 >= 0 && i10 < arrayList.size()) {
            uw uwVar = (uw) arrayList.get(i10);
            if (!uwVar.h) {
                if (i10 + 1 == arrayList.size()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int intValue = ((Integer) this.f37435y.get(i10)).intValue();
                hyVar.f34435o1.add(Long.valueOf(uwVar.f38747b.f26983id));
                if (!org.telegram.messenger.p10.i(hyVar.f34400c1).q() && !hyVar.U0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int i11 = hyVar.Q.J * 3;
                if ((uwVar.f38750f && !uwVar.f38751g && (uwVar.f38749e || z10)) || uwVar.h) {
                    min = uwVar.f38748c.size();
                } else {
                    min = Math.min(i11, uwVar.f38748c.size());
                }
                Integer num2 = null;
                if (uwVar.f38748c.size() > i11) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                uwVar.h = true;
                int size = uwVar.f38748c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    hyVar.f34450s2 = view;
                    hyVar.f34453t2 = num.intValue();
                    hyVar.f34456u2 = num2.intValue() + num.intValue();
                    hyVar.f34459v2 = SystemClock.elapsedRealtime();
                    o(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z9) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i11 / 2) {
                            f10 = 1.5f;
                        } else {
                            f10 = 4.0f;
                        }
                        hyVar.post(new pw(this, f10, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z9) {
        hy hyVar = this.F;
        ArrayList arrayList = hyVar.n1;
        if (hyVar.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f37430n);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(hyVar.f34400c1);
        ArrayList arrayList3 = b02.f25840s0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!b02.B0(stickerSetCovered.set.f26983id, true) || hyVar.f34438p1.contains(Long.valueOf(stickerSetCovered.set.f26983id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z9);
        H();
        fy fyVar = hyVar.T;
        if (fyVar != null) {
            fyVar.f();
        }
        v4.o.c(new jg.h(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z9) {
        boolean z10;
        boolean z11;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        hy hyVar = this.F;
        ArrayList arrayList = hyVar.n1;
        ArrayList arrayList2 = hyVar.f34435o1;
        int i10 = hyVar.f34400c1;
        ArrayList arrayList3 = hyVar.f34441q1;
        arrayList3.clear();
        if (hyVar.f34401c2) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
            if (z9 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            if (!org.telegram.messenger.p10.i(i10).q() && !hyVar.U0) {
                z10 = false;
            } else {
                z10 = true;
            }
            TLRPC.ChatFull chatFull = hyVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                uw uwVar = new uw();
                uwVar.f38747b = hyVar.J1.emojiset;
                uwVar.f38748c = new ArrayList(Y.documents);
                uwVar.f38749e = true;
                uwVar.f38750f = true;
                uwVar.f38751g = false;
                uwVar.h = true;
                uwVar.f38752i = true;
                arrayList3.add(uwVar);
                TLRPC.StickerSet stickerSet2 = uwVar.f38747b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f26983id == stickerSet2.f26983id) {
                        arrayList4.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
            if (!z10) {
                int i12 = 0;
                while (i12 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet2 != null && !org.telegram.messenger.ij.W3(tL_messages_stickerSet2)) {
                        uw uwVar2 = new uw();
                        uwVar2.f38747b = tL_messages_stickerSet2.set;
                        uwVar2.f38748c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        uwVar2.f38749e = true;
                        uwVar2.f38750f = b02.B0(tL_messages_stickerSet2.set.f26983id, true);
                        uwVar2.f38751g = false;
                        uwVar2.h = true;
                        arrayList3.add(uwVar2);
                        arrayList4.remove(i12);
                        i12--;
                    } else {
                        i7 = 1;
                    }
                    i12 += i7;
                }
            }
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                if (z10) {
                    uw uwVar3 = new uw();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    uwVar3.f38747b = stickerSet3;
                    uwVar3.f38748c = tL_messages_stickerSet3.documents;
                    uwVar3.f38749e = false;
                    uwVar3.f38750f = b02.B0(stickerSet3.f26983id, true);
                    uwVar3.f38751g = false;
                    uwVar3.h = true;
                    arrayList3.add(uwVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (org.telegram.messenger.ij.n3(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        uw uwVar4 = new uw();
                        uwVar4.f38747b = tL_messages_stickerSet3.set;
                        uwVar4.f38748c = new ArrayList(arrayList5);
                        uwVar4.f38749e = true;
                        uwVar4.f38750f = b02.B0(tL_messages_stickerSet3.set.f26983id, true);
                        uwVar4.f38751g = false;
                        uwVar4.h = true;
                        arrayList3.add(uwVar4);
                    }
                    if (arrayList6.size() > 0) {
                        uw uwVar5 = new uw();
                        uwVar5.f38747b = tL_messages_stickerSet3.set;
                        uwVar5.f38748c = new ArrayList(arrayList6);
                        uwVar5.f38749e = false;
                        uwVar5.f38750f = b02.B0(tL_messages_stickerSet3.set.f26983id, true);
                        uwVar5.f38751g = false;
                        uwVar5.h = arrayList2.contains(Long.valueOf(uwVar5.f38747b.f26983id));
                        arrayList3.add(uwVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                uw uwVar6 = new uw();
                uwVar6.f38750f = b02.B0(stickerSetCovered.set.f26983id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                uwVar6.f38747b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    uwVar6.f38748c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.ui.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        uwVar6.f38748c = l02.documents;
                    } else {
                        uwVar6.d = org.telegram.messenger.ui.Z(stickerSetCovered.set);
                    }
                } else {
                    uwVar6.f38748c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = uwVar6.f38748c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < uwVar6.f38748c.size()) {
                            if (!org.telegram.messenger.ij.n3((TLRPC.Document) uwVar6.f38748c.get(i16))) {
                                z11 = true;
                                break;
                            }
                            i16++;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    uwVar6.f38749e = !z11;
                    uwVar6.h = arrayList2.contains(Long.valueOf(uwVar6.f38747b.f26983id));
                    uwVar6.f38751g = true;
                    arrayList3.add(uwVar6);
                }
            }
            lw lwVar = hyVar.I;
            if (lwVar != null) {
                lwVar.p(hyVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qw.H():void");
    }

    @Override
    public final int b() {
        return this.D;
    }

    @Override
    public final long c(int i7) {
        return i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.d) {
            return 4;
        }
        if (i7 == this.f37427c || i7 == this.f37429f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f37431r;
        if (sparseIntArray.indexOfKey(i7) >= 0) {
            int i10 = sparseIntArray.get(i7);
            char[] cArr = org.telegram.messenger.j6.f23501a;
            if (i10 < 8) {
                return 1;
            }
            return 5;
        } else if (this.F.f34402d0 && i7 == 0) {
            return 2;
        } else {
            if (this.f37433w.indexOfKey(i7) >= 0) {
                return 3;
            }
            if (this.f37434x.indexOfKey(i7) >= 0) {
                return 6;
            }
            return 0;
        }
    }

    @Override
    public final void f() {
        F(false);
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int min;
        int i10;
        Long valueOf;
        uw uwVar;
        int i11 = i7;
        hy hyVar = this.F;
        String[] strArr = hyVar.f34392a1;
        hw hwVar = hyVar.Q;
        int i12 = hyVar.f34400c1;
        ArrayList arrayList = hyVar.f34441q1;
        int i13 = d1Var.f57048f;
        View view = d1Var.f57044a;
        int i14 = 8;
        boolean z9 = true;
        uw uwVar2 = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.f37431r;
            if (i13 != 1) {
                if (i13 != 5) {
                    if (i13 == 6) {
                        ww wwVar = (ww) view;
                        int i15 = this.f37434x.get(i11);
                        int i16 = hwVar.J * 3;
                        if (i15 >= 0 && i15 < arrayList.size()) {
                            uwVar2 = (uw) arrayList.get(i15);
                        }
                        if (uwVar2 != null) {
                            wwVar.f40058a.setText("+" + ((uwVar2.f38748c.size() - i16) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                yw ywVar = (yw) view;
                int length = sparseIntArray.get(i11) - strArr.length;
                uw uwVar3 = (uw) arrayList.get(length);
                int i17 = length - 1;
                if (i17 >= 0) {
                    uwVar = (uw) arrayList.get(i17);
                } else {
                    uwVar = null;
                }
                if (uwVar3 == null || !uwVar3.f38751g || (uwVar != null && !uwVar.f38749e && uwVar.f38750f && !org.telegram.messenger.p10.i(i12).q())) {
                    z9 = false;
                }
                if (uwVar3 != null && uwVar3.d != null) {
                    org.telegram.messenger.ui.b0(i12).m0(uwVar3.d, false);
                    uwVar3.d = null;
                }
                ug.p0 p0Var = ywVar.f40810r;
                if (uwVar3 != null) {
                    ywVar.f40813x = uwVar3;
                    ywVar.f40814y = z9;
                    ywVar.d.l(uwVar3.f38747b.title, false);
                    TextView textView = ywVar.f40807e;
                    if (uwVar3.f38752i) {
                        i14 = 0;
                    }
                    textView.setVisibility(i14);
                    if (uwVar3.f38750f && !uwVar3.f38747b.official) {
                        p0Var.b(org.telegram.messenger.id.M0(2131746085, null), new xw(ywVar, 5), false);
                    } else {
                        p0Var.b(org.telegram.messenger.id.M0(2131743879, null), new xw(ywVar, 6), false);
                    }
                    ywVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            j8Var.getClass();
            int i18 = sparseIntArray.get(i11);
            if (i11 == this.f37427c) {
                j8Var.b(org.telegram.messenger.id.M0(2131750836, null), 2131232096, org.telegram.messenger.id.M0(2131754899, null), 0, 0);
                return;
            } else if (i11 == this.f37429f) {
                j8Var.a(0, org.telegram.messenger.id.M0(2131746362, null));
                return;
            } else if (i18 >= strArr.length) {
                try {
                    j8Var.a(0, ((uw) arrayList.get(i18 - strArr.length)).f38747b.title);
                    return;
                } catch (Exception unused) {
                    j8Var.a(0, "");
                    return;
                }
            } else {
                j8Var.a(0, strArr[i18]);
                return;
            }
        }
        qx qxVar = (qx) view;
        qxVar.f37442a = i11;
        qxVar.f37445e = null;
        if (hyVar.f34402d0) {
            i11--;
        }
        if (this.f37429f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = hyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = hyVar.getRecentEmoji().get(i11);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l10 = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l10 = null;
            str2 = str;
            document = null;
        } else {
            int i19 = 0;
            while (true) {
                String[][] strArr2 = org.telegram.messenger.j6.f23505f;
                if (i19 < 8) {
                    String[] strArr3 = strArr2[i19];
                    int length2 = strArr3.length + 1;
                    int i20 = (i11 - size) - 1;
                    if (i20 >= 0 && i11 < size + length2) {
                        String str4 = strArr3[i20];
                        String str5 = (String) org.telegram.messenger.i6.f23059j.get(str4);
                        if (str5 != null) {
                            str = hy.g(str4, str5);
                            str2 = str4;
                        } else {
                            str = str4;
                        }
                    } else {
                        size += length2;
                        i19++;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean q10 = org.telegram.messenger.p10.i(i12).q();
                int i21 = hwVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f37435y;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    uw uwVar4 = (uw) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    if ((uwVar4.f38750f && !uwVar4.f38751g && (uwVar4.f38749e || q10)) || uwVar4.h) {
                        min = uwVar4.f38748c.size();
                    } else {
                        min = Math.min(i21, uwVar4.f38748c.size());
                    }
                    int i23 = qxVar.f37442a;
                    if (i23 >= intValue && (i10 = i23 - intValue) < min) {
                        qxVar.f37445e = uwVar4;
                        TLRPC.Document document2 = (TLRPC.Document) uwVar4.f38748c.get(i10);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f26962id);
                        }
                        Long l11 = valueOf;
                        document = document2;
                        l10 = l11;
                    } else {
                        i22++;
                    }
                }
            }
            l10 = null;
            document = null;
            z9 = false;
        }
        if (l10 != null) {
            qxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            qxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            qxVar.a(null, z9);
            if (qxVar.getSpan() == null || qxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    qxVar.setSpan(new r5(document, (Paint.FontMetricsInt) null));
                } else {
                    qxVar.setSpan(new r5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            qxVar.a(org.telegram.messenger.i6.f(str), z9);
            qxVar.setSpan(null);
        }
        qxVar.setTag(str2);
        qxVar.setContentDescription(str);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.j8 j8Var;
        hy hyVar = this.F;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                View view = new View(hyVar.getContext());
                                view.setLayoutParams(new v4.o0(-1, hyVar.f34396b1));
                                j8Var = view;
                            } else {
                                Context context = hyVar.getContext();
                                org.telegram.ui.ActionBar.f6 f6Var = hyVar.Z1;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f40058a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27852d6, f6Var);
                                int L = org.telegram.messenger.g0.L(11.0f);
                                int i10 = org.telegram.ui.ActionBar.k6.If;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 99));
                                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 99);
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.r6.k(textView, d02, h, null, f6Var);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
                                frameLayout.addView(textView, c8.ha.e(-2, -2, 17));
                                j8Var = frameLayout;
                            }
                        } else {
                            j8Var = new yw(hyVar, hyVar.getContext());
                        }
                    } else {
                        Context context2 = hyVar.getContext();
                        fy fyVar = new fy(hyVar, true);
                        hyVar.T = fyVar;
                        bi.q1 q1Var = new bi.q1(hyVar, context2, fyVar);
                        q1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                        q1Var.setClipToPadding(false);
                        q1Var.i(new di.k(6));
                        q1Var.setOnItemClickListener(new k(this, 5));
                        j8Var = q1Var;
                    }
                } else {
                    j8Var = new vw(hyVar, hyVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(hyVar.getContext(), true, false, hyVar.Z1, hyVar.f34420i2);
                j8Var2.setOnIconClickListener(new h0(this, 13));
                j8Var = j8Var2;
            }
        } else {
            j8Var = new qx(hyVar.getContext());
        }
        return new v4.d1(j8Var);
    }
}
