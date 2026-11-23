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
public final class ax extends dk0 {
    public int E;
    public int F;
    public final qy G;
    public ArrayList h;
    public int f33566c = -1;
    public int d = -1;
    public int f33567e = -1;
    public int f33568f = -1;
    public final ArrayList f33569n = new ArrayList();
    public final SparseIntArray f33570r = new SparseIntArray();
    public final SparseIntArray f33571s = new SparseIntArray();
    public final SparseIntArray f33572w = new SparseIntArray();
    public final SparseIntArray f33573x = new SparseIntArray();
    public final ArrayList f33574y = new ArrayList();

    public ax(qy qyVar) {
        this.G = qyVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 0 && i7 != 4 && i7 != 3 && i7 != 6) {
            return false;
        }
        return true;
    }

    public final void E(int i7, View view) {
        boolean z10;
        boolean z11;
        int min;
        Integer num;
        float f10;
        qy qyVar = this.G;
        ArrayList arrayList = qyVar.f39089r1;
        int i10 = this.f33573x.get(i7);
        if (i10 >= 0 && i10 < arrayList.size()) {
            ex exVar = (ex) arrayList.get(i10);
            if (!exVar.h) {
                if (i10 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f33574y.get(i10)).intValue();
                qyVar.f39082p1.add(Long.valueOf(exVar.f34856b.f28519id));
                if (!org.telegram.messenger.i10.i(qyVar.f39047d1).q() && !qyVar.V0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i11 = qyVar.R.J * 3;
                if ((exVar.f34859f && !exVar.f34860g && (exVar.f34858e || z11)) || exVar.h) {
                    min = exVar.f34857c.size();
                } else {
                    min = Math.min(i11, exVar.f34857c.size());
                }
                Integer num2 = null;
                if (exVar.f34857c.size() > i11) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                exVar.h = true;
                int size = exVar.f34857c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    qyVar.f39097t2 = view;
                    qyVar.f39100u2 = num.intValue();
                    qyVar.f39103v2 = num2.intValue() + num.intValue();
                    qyVar.f39107w2 = SystemClock.elapsedRealtime();
                    o(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i11 / 2) {
                            f10 = 1.5f;
                        } else {
                            f10 = 4.0f;
                        }
                        qyVar.post(new zw(this, f10, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        qy qyVar = this.G;
        ArrayList arrayList = qyVar.f39079o1;
        if (qyVar.U2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f33569n);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(qyVar.f39047d1);
        ArrayList arrayList3 = d02.f26740t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!d02.E0(stickerSetCovered.set.f28519id, true) || qyVar.f39085q1.contains(Long.valueOf(stickerSetCovered.set.f28519id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        oy oyVar = qyVar.U;
        if (oyVar != null) {
            oyVar.f();
        }
        v4.p.c(new jg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a02;
        qy qyVar = this.G;
        ArrayList arrayList = qyVar.f39079o1;
        ArrayList arrayList2 = qyVar.f39082p1;
        int i10 = qyVar.f39047d1;
        ArrayList arrayList3 = qyVar.f39089r1;
        arrayList3.clear();
        if (qyVar.d2) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(d02.u0(5));
            }
            ArrayList arrayList4 = this.h;
            if (!org.telegram.messenger.i10.i(i10).q() && !qyVar.V0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = qyVar.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a02 = d02.a0(stickerSet)) != null) {
                ex exVar = new ex();
                exVar.f34856b = qyVar.K1.emojiset;
                exVar.f34857c = new ArrayList(a02.documents);
                exVar.f34858e = true;
                exVar.f34859f = true;
                exVar.f34860g = false;
                exVar.h = true;
                exVar.f34861i = true;
                arrayList3.add(exVar);
                TLRPC.StickerSet stickerSet2 = exVar.f34856b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f28519id == stickerSet2.f28519id) {
                        arrayList4.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
            if (!z11) {
                int i12 = 0;
                while (i12 < arrayList4.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet2 != null && !org.telegram.messenger.fj.V3(tL_messages_stickerSet2)) {
                        ex exVar2 = new ex();
                        exVar2.f34856b = tL_messages_stickerSet2.set;
                        exVar2.f34857c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        exVar2.f34858e = true;
                        exVar2.f34859f = d02.E0(tL_messages_stickerSet2.set.f28519id, true);
                        exVar2.f34860g = false;
                        exVar2.h = true;
                        arrayList3.add(exVar2);
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
                if (z11) {
                    ex exVar3 = new ex();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    exVar3.f34856b = stickerSet3;
                    exVar3.f34857c = tL_messages_stickerSet3.documents;
                    exVar3.f34858e = false;
                    exVar3.f34859f = d02.E0(stickerSet3.f28519id, true);
                    exVar3.f34860g = false;
                    exVar3.h = true;
                    arrayList3.add(exVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (org.telegram.messenger.fj.m3(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        ex exVar4 = new ex();
                        exVar4.f34856b = tL_messages_stickerSet3.set;
                        exVar4.f34857c = new ArrayList(arrayList5);
                        exVar4.f34858e = true;
                        exVar4.f34859f = d02.E0(tL_messages_stickerSet3.set.f28519id, true);
                        exVar4.f34860g = false;
                        exVar4.h = true;
                        arrayList3.add(exVar4);
                    }
                    if (arrayList6.size() > 0) {
                        ex exVar5 = new ex();
                        exVar5.f34856b = tL_messages_stickerSet3.set;
                        exVar5.f34857c = new ArrayList(arrayList6);
                        exVar5.f34858e = false;
                        exVar5.f34859f = d02.E0(tL_messages_stickerSet3.set.f28519id, true);
                        exVar5.f34860g = false;
                        exVar5.h = arrayList2.contains(Long.valueOf(exVar5.f34856b.f28519id));
                        arrayList3.add(exVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                ex exVar6 = new ex();
                exVar6.f34859f = d02.E0(stickerSetCovered.set.f28519id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                exVar6.f34856b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    exVar6.f34857c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet n02 = d02.n0(org.telegram.messenger.ri.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (n02 != null) {
                        exVar6.f34857c = n02.documents;
                    } else {
                        exVar6.d = org.telegram.messenger.ri.b0(stickerSetCovered.set);
                    }
                } else {
                    exVar6.f34857c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = exVar6.f34857c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < exVar6.f34857c.size()) {
                            if (!org.telegram.messenger.fj.m3((TLRPC.Document) exVar6.f34857c.get(i16))) {
                                z12 = true;
                                break;
                            }
                            i16++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    exVar6.f34858e = !z12;
                    exVar6.h = arrayList2.contains(Long.valueOf(exVar6.f34856b.f28519id));
                    exVar6.f34860g = true;
                    arrayList3.add(exVar6);
                }
            }
            vw vwVar = qyVar.J;
            if (vwVar != null) {
                vwVar.p(qyVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ax.H():void");
    }

    @Override
    public final int b() {
        return this.E;
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
        if (i7 == this.f33566c || i7 == this.f33568f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f33570r;
        if (sparseIntArray.indexOfKey(i7) >= 0) {
            int i10 = sparseIntArray.get(i7);
            char[] cArr = org.telegram.messenger.k6.f25086a;
            if (i10 < 8) {
                return 1;
            }
            return 5;
        } else if (this.G.f39049e0 && i7 == 0) {
            return 2;
        } else {
            if (this.f33572w.indexOfKey(i7) >= 0) {
                return 3;
            }
            if (this.f33573x.indexOfKey(i7) >= 0) {
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
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int min;
        int i10;
        Long valueOf;
        ex exVar;
        int i11 = i7;
        qy qyVar = this.G;
        String[] strArr = qyVar.f39040b1;
        rw rwVar = qyVar.R;
        int i12 = qyVar.f39047d1;
        ArrayList arrayList = qyVar.f39089r1;
        int i13 = f1Var.f59249f;
        View view = f1Var.f59245a;
        int i14 = 8;
        boolean z10 = true;
        ex exVar2 = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.f33570r;
            if (i13 != 1) {
                if (i13 != 5) {
                    if (i13 == 6) {
                        gx gxVar = (gx) view;
                        int i15 = this.f33573x.get(i11);
                        int i16 = rwVar.J * 3;
                        if (i15 >= 0 && i15 < arrayList.size()) {
                            exVar2 = (ex) arrayList.get(i15);
                        }
                        if (exVar2 != null) {
                            gxVar.f35564a.setText("+" + ((exVar2.f34857c.size() - i16) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ix ixVar = (ix) view;
                int length = sparseIntArray.get(i11) - strArr.length;
                ex exVar3 = (ex) arrayList.get(length);
                int i17 = length - 1;
                if (i17 >= 0) {
                    exVar = (ex) arrayList.get(i17);
                } else {
                    exVar = null;
                }
                if (exVar3 == null || !exVar3.f34860g || (exVar != null && !exVar.f34858e && exVar.f34859f && !org.telegram.messenger.i10.i(i12).q())) {
                    z10 = false;
                }
                if (exVar3 != null && exVar3.d != null) {
                    org.telegram.messenger.ri.d0(i12).o0(exVar3.d, false);
                    exVar3.d = null;
                }
                ug.r0 r0Var = ixVar.f36186r;
                if (exVar3 != null) {
                    ixVar.f36189x = exVar3;
                    ixVar.f36190y = z10;
                    ixVar.d.l(exVar3.f34856b.title, false);
                    TextView textView = ixVar.f36183e;
                    if (exVar3.f34861i) {
                        i14 = 0;
                    }
                    textView.setVisibility(i14);
                    if (exVar3.f34859f && !exVar3.f34856b.official) {
                        r0Var.b(org.telegram.messenger.gd.N0(2131745886, null), new hx(ixVar, 5), false);
                    } else {
                        r0Var.b(org.telegram.messenger.gd.N0(2131743629, null), new hx(ixVar, 6), false);
                    }
                    ixVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            j8Var.getClass();
            int i18 = sparseIntArray.get(i11);
            if (i11 == this.f33566c) {
                j8Var.b(org.telegram.messenger.gd.N0(2131750823, null), 2131232101, org.telegram.messenger.gd.N0(2131754899, null), 0, 0);
                return;
            } else if (i11 == this.f33568f) {
                j8Var.a(0, org.telegram.messenger.gd.N0(2131746165, null));
                return;
            } else if (i18 >= strArr.length) {
                try {
                    j8Var.a(0, ((ex) arrayList.get(i18 - strArr.length)).f34856b.title);
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
        yx yxVar = (yx) view;
        yxVar.f42578a = i11;
        yxVar.f42581e = null;
        if (qyVar.f39049e0) {
            i11--;
        }
        if (this.f33568f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = qyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = qyVar.getRecentEmoji().get(i11);
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
                String[][] strArr2 = org.telegram.messenger.k6.f25090f;
                if (i19 < 8) {
                    String[] strArr3 = strArr2[i19];
                    int length2 = strArr3.length + 1;
                    int i20 = (i11 - size) - 1;
                    if (i20 >= 0 && i11 < size + length2) {
                        String str4 = strArr3[i20];
                        String str5 = (String) org.telegram.messenger.j6.f24927j.get(str4);
                        if (str5 != null) {
                            str = qy.g(str4, str5);
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
                boolean q10 = org.telegram.messenger.i10.i(i12).q();
                int i21 = rwVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f33574y;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    ex exVar4 = (ex) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    if ((exVar4.f34859f && !exVar4.f34860g && (exVar4.f34858e || q10)) || exVar4.h) {
                        min = exVar4.f34857c.size();
                    } else {
                        min = Math.min(i21, exVar4.f34857c.size());
                    }
                    int i23 = yxVar.f42578a;
                    if (i23 >= intValue && (i10 = i23 - intValue) < min) {
                        yxVar.f42581e = exVar4;
                        TLRPC.Document document2 = (TLRPC.Document) exVar4.f34857c.get(i10);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f28498id);
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
            z10 = false;
        }
        if (l10 != null) {
            yxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            yxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            yxVar.a(null, z10);
            if (yxVar.getSpan() == null || yxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    yxVar.setSpan(new x5(document, (Paint.FontMetricsInt) null));
                } else {
                    yxVar.setSpan(new x5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            yxVar.a(org.telegram.messenger.j6.f(str), z10);
            yxVar.setSpan(null);
        }
        yxVar.setTag(str2);
        yxVar.setContentDescription(str);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.j8 j8Var;
        qy qyVar = this.G;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                View view = new View(qyVar.getContext());
                                view.setLayoutParams(new v4.q0(-1, qyVar.f39044c1));
                                j8Var = view;
                            } else {
                                Context context = qyVar.getContext();
                                org.telegram.ui.ActionBar.i6 i6Var = qyVar.f39037a2;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f35564a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29451d6, i6Var);
                                int L = org.telegram.messenger.g0.L(11.0f);
                                int i10 = org.telegram.ui.ActionBar.n6.Lf;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 99));
                                org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 99);
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.u6.j(textView, d02, g10, null, i6Var);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
                                frameLayout.addView(textView, c8.na.e(-2, -2, 17));
                                j8Var = frameLayout;
                            }
                        } else {
                            j8Var = new ix(qyVar, qyVar.getContext());
                        }
                    } else {
                        Context context2 = qyVar.getContext();
                        oy oyVar = new oy(qyVar, true);
                        qyVar.U = oyVar;
                        di.b1 b1Var = new di.b1(qyVar, context2, oyVar);
                        b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                        b1Var.setClipToPadding(false);
                        b1Var.i(new fi.k(6));
                        b1Var.setOnItemClickListener(new n(this, 5));
                        j8Var = b1Var;
                    }
                } else {
                    j8Var = new fx(qyVar, qyVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(qyVar.getContext(), true, false, qyVar.f39037a2, qyVar.f39067j2);
                j8Var2.setOnIconClickListener(new n0(this, 14));
                j8Var = j8Var2;
            }
        } else {
            j8Var = new yx(qyVar.getContext());
        }
        return new v4.f1(j8Var);
    }
}
