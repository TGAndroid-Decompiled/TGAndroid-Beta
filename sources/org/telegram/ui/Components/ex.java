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
public final class ex extends tk0 {
    public int D;
    public int E;
    public final vy F;
    public ArrayList h;
    public int f25956c = -1;
    public int d = -1;
    public int e = -1;
    public int f25957f = -1;
    public final ArrayList f25958n = new ArrayList();
    public final SparseIntArray f25959r = new SparseIntArray();
    public final SparseIntArray f25960s = new SparseIntArray();
    public final SparseIntArray f25961w = new SparseIntArray();
    public final SparseIntArray f25962x = new SparseIntArray();
    public final ArrayList f25963y = new ArrayList();

    public ex(vy vyVar) {
        this.F = vyVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
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
        vy vyVar = this.F;
        ArrayList arrayList = vyVar.f31985q1;
        int i11 = this.f25962x.get(i10);
        if (i11 >= 0 && i11 < arrayList.size()) {
            ix ixVar = (ix) arrayList.get(i11);
            if (!ixVar.h) {
                if (i11 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f25963y.get(i11)).intValue();
                vyVar.f31979o1.add(Long.valueOf(ixVar.f27193b.f19821id));
                if (!org.telegram.messenger.e20.i(vyVar.f31943c1).q() && !vyVar.U0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i12 = vyVar.Q.J * 3;
                if ((ixVar.f27195f && !ixVar.f27196g && (ixVar.e || z11)) || ixVar.h) {
                    min = ixVar.f27194c.size();
                } else {
                    min = Math.min(i12, ixVar.f27194c.size());
                }
                Integer num2 = null;
                if (ixVar.f27194c.size() > i12) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                ixVar.h = true;
                int size = ixVar.f27194c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    vyVar.f31994s2 = view;
                    vyVar.f31997t2 = num.intValue();
                    vyVar.f32000u2 = num2.intValue() + num.intValue();
                    vyVar.f32003v2 = SystemClock.elapsedRealtime();
                    o(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i12 / 2) {
                            f7 = 1.5f;
                        } else {
                            f7 = 4.0f;
                        }
                        vyVar.post(new dx(this, f7, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        vy vyVar = this.F;
        ArrayList arrayList = vyVar.f31976n1;
        if (vyVar.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f25958n);
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(vyVar.f31943c1);
        ArrayList arrayList3 = b02.f18674s0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i10);
            if (!b02.B0(stickerSetCovered.set.f19821id, true) || vyVar.f31982p1.contains(Long.valueOf(stickerSetCovered.set.f19821id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        ty tyVar = vyVar.T;
        if (tyVar != null) {
            tyVar.f();
        }
        s4.n.c(new hg.a(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        vy vyVar = this.F;
        ArrayList arrayList = vyVar.f31976n1;
        ArrayList arrayList2 = vyVar.f31979o1;
        int i11 = vyVar.f31943c1;
        ArrayList arrayList3 = vyVar.f31985q1;
        arrayList3.clear();
        if (vyVar.f31944c2) {
            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i11);
            if (z10 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            if (!org.telegram.messenger.e20.i(i11).q() && !vyVar.U0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = vyVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                ix ixVar = new ix();
                ixVar.f27193b = vyVar.J1.emojiset;
                ixVar.f27194c = new ArrayList(Y.documents);
                ixVar.e = true;
                ixVar.f27195f = true;
                ixVar.f27196g = false;
                ixVar.h = true;
                ixVar.f27197i = true;
                arrayList3.add(ixVar);
                TLRPC.StickerSet stickerSet2 = ixVar.f27193b;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i12);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f19821id == stickerSet2.f19821id) {
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
                    if (tL_messages_stickerSet2 != null && !org.telegram.messenger.kj.V3(tL_messages_stickerSet2)) {
                        ix ixVar2 = new ix();
                        ixVar2.f27193b = tL_messages_stickerSet2.set;
                        ixVar2.f27194c = new ArrayList(tL_messages_stickerSet2.documents);
                        i10 = 1;
                        ixVar2.e = true;
                        ixVar2.f27195f = b02.B0(tL_messages_stickerSet2.set.f19821id, true);
                        ixVar2.f27196g = false;
                        ixVar2.h = true;
                        arrayList3.add(ixVar2);
                        arrayList4.remove(i13);
                        i13--;
                    } else {
                        i10 = 1;
                    }
                    i13 += i10;
                }
            }
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i14);
                if (z11) {
                    ix ixVar3 = new ix();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    ixVar3.f27193b = stickerSet3;
                    ixVar3.f27194c = tL_messages_stickerSet3.documents;
                    ixVar3.e = false;
                    ixVar3.f27195f = b02.B0(stickerSet3.f19821id, true);
                    ixVar3.f27196g = false;
                    ixVar3.h = true;
                    arrayList3.add(ixVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i15 = 0; i15 < tL_messages_stickerSet3.documents.size(); i15++) {
                            if (org.telegram.messenger.kj.m3(tL_messages_stickerSet3.documents.get(i15))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i15));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i15));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        ix ixVar4 = new ix();
                        ixVar4.f27193b = tL_messages_stickerSet3.set;
                        ixVar4.f27194c = new ArrayList(arrayList5);
                        ixVar4.e = true;
                        ixVar4.f27195f = b02.B0(tL_messages_stickerSet3.set.f19821id, true);
                        ixVar4.f27196g = false;
                        ixVar4.h = true;
                        arrayList3.add(ixVar4);
                    }
                    if (arrayList6.size() > 0) {
                        ix ixVar5 = new ix();
                        ixVar5.f27193b = tL_messages_stickerSet3.set;
                        ixVar5.f27194c = new ArrayList(arrayList6);
                        ixVar5.e = false;
                        ixVar5.f27195f = b02.B0(tL_messages_stickerSet3.set.f19821id, true);
                        ixVar5.f27196g = false;
                        ixVar5.h = arrayList2.contains(Long.valueOf(ixVar5.f27193b.f19821id));
                        arrayList3.add(ixVar5);
                    }
                }
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i16);
                ix ixVar6 = new ix();
                ixVar6.f27195f = b02.B0(stickerSetCovered.set.f19821id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                ixVar6.f27193b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    ixVar6.f27194c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.vi.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        ixVar6.f27194c = l02.documents;
                    } else {
                        ixVar6.d = org.telegram.messenger.vi.Z(stickerSetCovered.set);
                    }
                } else {
                    ixVar6.f27194c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = ixVar6.f27194c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < ixVar6.f27194c.size()) {
                            if (!org.telegram.messenger.kj.m3((TLRPC.Document) ixVar6.f27194c.get(i17))) {
                                z12 = true;
                                break;
                            }
                            i17++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    ixVar6.e = !z12;
                    ixVar6.h = arrayList2.contains(Long.valueOf(ixVar6.f27193b.f19821id));
                    ixVar6.f27196g = true;
                    arrayList3.add(ixVar6);
                }
            }
            zw zwVar = vyVar.I;
            if (zwVar != null) {
                zwVar.p(vyVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ex.H():void");
    }

    @Override
    public final int b() {
        return this.D;
    }

    @Override
    public final long c(int i10) {
        return i10;
    }

    @Override
    public final int d(int i10) {
        if (i10 == this.d) {
            return 4;
        }
        if (i10 == this.f25956c || i10 == this.f25957f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f25959r;
        if (sparseIntArray.indexOfKey(i10) >= 0) {
            int i11 = sparseIntArray.get(i10);
            char[] cArr = org.telegram.messenger.l6.f16891a;
            if (i11 < 8) {
                return 1;
            }
            return 5;
        } else if (this.F.f31945d0 && i10 == 0) {
            return 2;
        } else {
            if (this.f25961w.indexOfKey(i10) >= 0) {
                return 3;
            }
            if (this.f25962x.indexOfKey(i10) >= 0) {
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
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        Long l4;
        TLRPC.Document document;
        int min;
        int i11;
        Long valueOf;
        ix ixVar;
        int i12 = i10;
        vy vyVar = this.F;
        String[] strArr = vyVar.f31936a1;
        vw vwVar = vyVar.Q;
        int i13 = vyVar.f31943c1;
        ArrayList arrayList = vyVar.f31985q1;
        int i14 = c1Var.f47912f;
        View view = c1Var.f47909a;
        int i15 = 8;
        boolean z10 = true;
        ix ixVar2 = null;
        if (i14 != 0) {
            SparseIntArray sparseIntArray = this.f25959r;
            if (i14 != 1) {
                if (i14 != 5) {
                    if (i14 == 6) {
                        kx kxVar = (kx) view;
                        int i16 = this.f25962x.get(i12);
                        int i17 = vwVar.J * 3;
                        if (i16 >= 0 && i16 < arrayList.size()) {
                            ixVar2 = (ix) arrayList.get(i16);
                        }
                        if (ixVar2 != null) {
                            kxVar.f27974a.setText("+" + ((ixVar2.f27194c.size() - i17) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                mx mxVar = (mx) view;
                int length = sparseIntArray.get(i12) - strArr.length;
                ix ixVar3 = (ix) arrayList.get(length);
                int i18 = length - 1;
                if (i18 >= 0) {
                    ixVar = (ix) arrayList.get(i18);
                } else {
                    ixVar = null;
                }
                if (ixVar3 == null || !ixVar3.f27196g || (ixVar != null && !ixVar.e && ixVar.f27195f && !org.telegram.messenger.e20.i(i13).q())) {
                    z10 = false;
                }
                if (ixVar3 != null && ixVar3.d != null) {
                    org.telegram.messenger.vi.b0(i13).m0(ixVar3.d, false);
                    ixVar3.d = null;
                }
                kg.x0 x0Var = mxVar.f28599r;
                if (ixVar3 != null) {
                    mxVar.f28602x = ixVar3;
                    mxVar.f28603y = z10;
                    mxVar.d.l(ixVar3.f27193b.title, false);
                    TextView textView = mxVar.e;
                    if (ixVar3.f27197i) {
                        i15 = 0;
                    }
                    textView.setVisibility(i15);
                    if (ixVar3.f27195f && !ixVar3.f27193b.official) {
                        x0Var.b(org.telegram.messenger.dd.L0(2131746099, null), new lx(mxVar, 5), false);
                    } else {
                        x0Var.b(org.telegram.messenger.dd.L0(2131743901, null), new lx(mxVar, 6), false);
                    }
                    mxVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.getClass();
            int i19 = sparseIntArray.get(i12);
            if (i12 == this.f25956c) {
                n8Var.b(org.telegram.messenger.dd.L0(2131750836, null), 2131232095, org.telegram.messenger.dd.L0(2131754899, null), 0, 0);
                return;
            } else if (i12 == this.f25957f) {
                n8Var.a(0, org.telegram.messenger.dd.L0(2131746376, null));
                return;
            } else if (i19 >= strArr.length) {
                try {
                    n8Var.a(0, ((ix) arrayList.get(i19 - strArr.length)).f27193b.title);
                    return;
                } catch (Exception unused) {
                    n8Var.a(0, "");
                    return;
                }
            } else {
                n8Var.a(0, strArr[i19]);
                return;
            }
        }
        ey eyVar = (ey) view;
        eyVar.f25965a = i12;
        eyVar.e = null;
        if (vyVar.f31945d0) {
            i12--;
        }
        if (this.f25957f >= 0) {
            i12--;
        }
        if (this.d >= 0) {
            i12 -= 2;
        }
        int size = vyVar.getRecentEmoji().size();
        if (i12 < size) {
            String str3 = vyVar.getRecentEmoji().get(i12);
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
                String[][] strArr2 = org.telegram.messenger.l6.f16894f;
                if (i20 < 8) {
                    String[] strArr3 = strArr2[i20];
                    int length2 = strArr3.length + 1;
                    int i21 = (i12 - size) - 1;
                    if (i21 >= 0 && i12 < size + length2) {
                        String str4 = strArr3[i21];
                        String str5 = (String) org.telegram.messenger.k6.f16570j.get(str4);
                        if (str5 != null) {
                            str = vy.g(str4, str5);
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
                boolean q6 = org.telegram.messenger.e20.i(i13).q();
                int i22 = vwVar.J * 3;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f25963y;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    ix ixVar4 = (ix) arrayList.get(i23);
                    int intValue = ((Integer) arrayList2.get(i23)).intValue() + 1;
                    if ((ixVar4.f27195f && !ixVar4.f27196g && (ixVar4.e || q6)) || ixVar4.h) {
                        min = ixVar4.f27194c.size();
                    } else {
                        min = Math.min(i22, ixVar4.f27194c.size());
                    }
                    int i24 = eyVar.f25965a;
                    if (i24 >= intValue && (i11 = i24 - intValue) < min) {
                        eyVar.e = ixVar4;
                        TLRPC.Document document2 = (TLRPC.Document) ixVar4.f27194c.get(i11);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f19800id);
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
            eyVar.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        } else {
            eyVar.setPadding(0, 0, 0, 0);
        }
        if (l4 != null) {
            eyVar.a(null, z10);
            if (eyVar.getSpan() == null || eyVar.getSpan().getDocumentId() != l4.longValue()) {
                if (document != null) {
                    eyVar.setSpan(new o5(document, (Paint.FontMetricsInt) null));
                } else {
                    eyVar.setSpan(new o5(l4.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            eyVar.a(org.telegram.messenger.k6.f(str), z10);
            eyVar.setSpan(null);
        }
        eyVar.setTag(str2);
        eyVar.setContentDescription(str);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        vy vyVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                View view = new View(vyVar.getContext());
                                view.setLayoutParams(new s4.o0(-1, vyVar.f31939b1));
                                n8Var = view;
                            } else {
                                Context context = vyVar.getContext();
                                org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f27974a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20930d6, p6Var);
                                int L = org.telegram.messenger.i0.L(11.0f);
                                int i11 = org.telegram.ui.ActionBar.t6.If;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, i0.b.o(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 99));
                                org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i11, 99);
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.a7.k(textView, d02, h, null, p6Var);
                                textView.setTypeface(org.telegram.messenger.i0.o());
                                textView.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f));
                                frameLayout.addView(textView, w7.b6.e(-2, -2, 17));
                                n8Var = frameLayout;
                            }
                        } else {
                            n8Var = new mx(vyVar, vyVar.getContext());
                        }
                    } else {
                        Context context2 = vyVar.getContext();
                        ty tyVar = new ty(vyVar, true);
                        vyVar.T = tyVar;
                        ag.b1 b1Var = new ag.b1(vyVar, context2, tyVar);
                        b1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), 0);
                        b1Var.setClipToPadding(false);
                        b1Var.i(new dh.g(3));
                        b1Var.setOnItemClickListener(new k(this, 5));
                        n8Var = b1Var;
                    }
                } else {
                    n8Var = new jx(vyVar, vyVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(vyVar.getContext(), true, false, vyVar.Z1, vyVar.f31963i2);
                n8Var2.setOnIconClickListener(new h0(this, 12));
                n8Var = n8Var2;
            }
        } else {
            n8Var = new ey(vyVar.getContext());
        }
        return new s4.c1(n8Var);
    }
}
