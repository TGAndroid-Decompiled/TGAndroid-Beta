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
public final class dx extends dk0 {
    public int E;
    public int F;
    public final ty G;
    public ArrayList h;
    public int f34586c = -1;
    public int d = -1;
    public int f34587e = -1;
    public int f34588f = -1;
    public final ArrayList f34589n = new ArrayList();
    public final SparseIntArray f34590r = new SparseIntArray();
    public final SparseIntArray f34591s = new SparseIntArray();
    public final SparseIntArray f34592w = new SparseIntArray();
    public final SparseIntArray f34593x = new SparseIntArray();
    public final ArrayList f34594y = new ArrayList();

    public dx(ty tyVar) {
        this.G = tyVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
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
        ty tyVar = this.G;
        ArrayList arrayList = tyVar.f40116r1;
        int i10 = this.f34593x.get(i7);
        if (i10 >= 0 && i10 < arrayList.size()) {
            hx hxVar = (hx) arrayList.get(i10);
            if (!hxVar.h) {
                if (i10 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f34594y.get(i10)).intValue();
                tyVar.f40109p1.add(Long.valueOf(hxVar.f35936b.f28425id));
                if (!org.telegram.messenger.k10.i(tyVar.f40074d1).q() && !tyVar.V0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i11 = tyVar.R.J * 3;
                if ((hxVar.f35939f && !hxVar.f35940g && (hxVar.f35938e || z11)) || hxVar.h) {
                    min = hxVar.f35937c.size();
                } else {
                    min = Math.min(i11, hxVar.f35937c.size());
                }
                Integer num2 = null;
                if (hxVar.f35937c.size() > i11) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                hxVar.h = true;
                int size = hxVar.f35937c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    tyVar.f40124t2 = view;
                    tyVar.f40127u2 = num.intValue();
                    tyVar.f40130v2 = num2.intValue() + num.intValue();
                    tyVar.f40134w2 = SystemClock.elapsedRealtime();
                    o(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i11 / 2) {
                            f10 = 1.5f;
                        } else {
                            f10 = 4.0f;
                        }
                        tyVar.post(new cx(this, f10, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        ty tyVar = this.G;
        ArrayList arrayList = tyVar.f40106o1;
        if (tyVar.U2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f34589n);
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(tyVar.f40074d1);
        ArrayList arrayList3 = d02.f26817t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!d02.E0(stickerSetCovered.set.f28425id, true) || tyVar.f40112q1.contains(Long.valueOf(stickerSetCovered.set.f28425id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        ry ryVar = tyVar.U;
        if (ryVar != null) {
            ryVar.f();
        }
        v4.o.c(new jg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a02;
        ty tyVar = this.G;
        ArrayList arrayList = tyVar.f40106o1;
        ArrayList arrayList2 = tyVar.f40109p1;
        int i10 = tyVar.f40074d1;
        ArrayList arrayList3 = tyVar.f40116r1;
        arrayList3.clear();
        if (tyVar.d2) {
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(d02.u0(5));
            }
            ArrayList arrayList4 = this.h;
            if (!org.telegram.messenger.k10.i(i10).q() && !tyVar.V0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = tyVar.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a02 = d02.a0(stickerSet)) != null) {
                hx hxVar = new hx();
                hxVar.f35936b = tyVar.K1.emojiset;
                hxVar.f35937c = new ArrayList(a02.documents);
                hxVar.f35938e = true;
                hxVar.f35939f = true;
                hxVar.f35940g = false;
                hxVar.h = true;
                hxVar.f35941i = true;
                arrayList3.add(hxVar);
                TLRPC.StickerSet stickerSet2 = hxVar.f35936b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f28425id == stickerSet2.f28425id) {
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
                    if (tL_messages_stickerSet2 != null && !org.telegram.messenger.gj.V3(tL_messages_stickerSet2)) {
                        hx hxVar2 = new hx();
                        hxVar2.f35936b = tL_messages_stickerSet2.set;
                        hxVar2.f35937c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        hxVar2.f35938e = true;
                        hxVar2.f35939f = d02.E0(tL_messages_stickerSet2.set.f28425id, true);
                        hxVar2.f35940g = false;
                        hxVar2.h = true;
                        arrayList3.add(hxVar2);
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
                    hx hxVar3 = new hx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    hxVar3.f35936b = stickerSet3;
                    hxVar3.f35937c = tL_messages_stickerSet3.documents;
                    hxVar3.f35938e = false;
                    hxVar3.f35939f = d02.E0(stickerSet3.f28425id, true);
                    hxVar3.f35940g = false;
                    hxVar3.h = true;
                    arrayList3.add(hxVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (org.telegram.messenger.gj.m3(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        hx hxVar4 = new hx();
                        hxVar4.f35936b = tL_messages_stickerSet3.set;
                        hxVar4.f35937c = new ArrayList(arrayList5);
                        hxVar4.f35938e = true;
                        hxVar4.f35939f = d02.E0(tL_messages_stickerSet3.set.f28425id, true);
                        hxVar4.f35940g = false;
                        hxVar4.h = true;
                        arrayList3.add(hxVar4);
                    }
                    if (arrayList6.size() > 0) {
                        hx hxVar5 = new hx();
                        hxVar5.f35936b = tL_messages_stickerSet3.set;
                        hxVar5.f35937c = new ArrayList(arrayList6);
                        hxVar5.f35938e = false;
                        hxVar5.f35939f = d02.E0(tL_messages_stickerSet3.set.f28425id, true);
                        hxVar5.f35940g = false;
                        hxVar5.h = arrayList2.contains(Long.valueOf(hxVar5.f35936b.f28425id));
                        arrayList3.add(hxVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                hx hxVar6 = new hx();
                hxVar6.f35939f = d02.E0(stickerSetCovered.set.f28425id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                hxVar6.f35936b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    hxVar6.f35937c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet n02 = d02.n0(org.telegram.messenger.si.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (n02 != null) {
                        hxVar6.f35937c = n02.documents;
                    } else {
                        hxVar6.d = org.telegram.messenger.si.b0(stickerSetCovered.set);
                    }
                } else {
                    hxVar6.f35937c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = hxVar6.f35937c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < hxVar6.f35937c.size()) {
                            if (!org.telegram.messenger.gj.m3((TLRPC.Document) hxVar6.f35937c.get(i16))) {
                                z12 = true;
                                break;
                            }
                            i16++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    hxVar6.f35938e = !z12;
                    hxVar6.h = arrayList2.contains(Long.valueOf(hxVar6.f35936b.f28425id));
                    hxVar6.f35940g = true;
                    arrayList3.add(hxVar6);
                }
            }
            yw ywVar = tyVar.J;
            if (ywVar != null) {
                ywVar.p(tyVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dx.H():void");
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
        if (i7 == this.f34586c || i7 == this.f34588f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f34590r;
        if (sparseIntArray.indexOfKey(i7) >= 0) {
            int i10 = sparseIntArray.get(i7);
            char[] cArr = org.telegram.messenger.k6.f24981a;
            if (i10 < 8) {
                return 1;
            }
            return 5;
        } else if (this.G.f40076e0 && i7 == 0) {
            return 2;
        } else {
            if (this.f34592w.indexOfKey(i7) >= 0) {
                return 3;
            }
            if (this.f34593x.indexOfKey(i7) >= 0) {
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
    public final void t(v4.e1 e1Var, int i7) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int min;
        int i10;
        Long valueOf;
        hx hxVar;
        int i11 = i7;
        ty tyVar = this.G;
        String[] strArr = tyVar.f40067b1;
        uw uwVar = tyVar.R;
        int i12 = tyVar.f40074d1;
        ArrayList arrayList = tyVar.f40116r1;
        int i13 = e1Var.f59115f;
        View view = e1Var.f59111a;
        int i14 = 8;
        boolean z10 = true;
        hx hxVar2 = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.f34590r;
            if (i13 != 1) {
                if (i13 != 5) {
                    if (i13 == 6) {
                        jx jxVar = (jx) view;
                        int i15 = this.f34593x.get(i11);
                        int i16 = uwVar.J * 3;
                        if (i15 >= 0 && i15 < arrayList.size()) {
                            hxVar2 = (hx) arrayList.get(i15);
                        }
                        if (hxVar2 != null) {
                            jxVar.f36669a.setText("+" + ((hxVar2.f35937c.size() - i16) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                lx lxVar = (lx) view;
                int length = sparseIntArray.get(i11) - strArr.length;
                hx hxVar3 = (hx) arrayList.get(length);
                int i17 = length - 1;
                if (i17 >= 0) {
                    hxVar = (hx) arrayList.get(i17);
                } else {
                    hxVar = null;
                }
                if (hxVar3 == null || !hxVar3.f35940g || (hxVar != null && !hxVar.f35938e && hxVar.f35939f && !org.telegram.messenger.k10.i(i12).q())) {
                    z10 = false;
                }
                if (hxVar3 != null && hxVar3.d != null) {
                    org.telegram.messenger.si.d0(i12).o0(hxVar3.d, false);
                    hxVar3.d = null;
                }
                ug.r0 r0Var = lxVar.f37278r;
                if (hxVar3 != null) {
                    lxVar.f37281x = hxVar3;
                    lxVar.f37282y = z10;
                    lxVar.d.l(hxVar3.f35936b.title, false);
                    TextView textView = lxVar.f37275e;
                    if (hxVar3.f35941i) {
                        i14 = 0;
                    }
                    textView.setVisibility(i14);
                    if (hxVar3.f35939f && !hxVar3.f35936b.official) {
                        r0Var.b(org.telegram.messenger.hd.N0(2131745886, null), new kx(lxVar, 5), false);
                    } else {
                        r0Var.b(org.telegram.messenger.hd.N0(2131743633, null), new kx(lxVar, 6), false);
                    }
                    lxVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            k8Var.getClass();
            int i18 = sparseIntArray.get(i11);
            if (i11 == this.f34586c) {
                k8Var.b(org.telegram.messenger.hd.N0(2131750823, null), 2131232098, org.telegram.messenger.hd.N0(2131754899, null), 0, 0);
                return;
            } else if (i11 == this.f34588f) {
                k8Var.a(0, org.telegram.messenger.hd.N0(2131746165, null));
                return;
            } else if (i18 >= strArr.length) {
                try {
                    k8Var.a(0, ((hx) arrayList.get(i18 - strArr.length)).f35936b.title);
                    return;
                } catch (Exception unused) {
                    k8Var.a(0, "");
                    return;
                }
            } else {
                k8Var.a(0, strArr[i18]);
                return;
            }
        }
        cy cyVar = (cy) view;
        cyVar.f34287a = i11;
        cyVar.f34290e = null;
        if (tyVar.f40076e0) {
            i11--;
        }
        if (this.f34588f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = tyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = tyVar.getRecentEmoji().get(i11);
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
                String[][] strArr2 = org.telegram.messenger.k6.f24985f;
                if (i19 < 8) {
                    String[] strArr3 = strArr2[i19];
                    int length2 = strArr3.length + 1;
                    int i20 = (i11 - size) - 1;
                    if (i20 >= 0 && i11 < size + length2) {
                        String str4 = strArr3[i20];
                        String str5 = (String) org.telegram.messenger.j6.f24801j.get(str4);
                        if (str5 != null) {
                            str = ty.g(str4, str5);
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
                boolean q10 = org.telegram.messenger.k10.i(i12).q();
                int i21 = uwVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f34594y;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    hx hxVar4 = (hx) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    if ((hxVar4.f35939f && !hxVar4.f35940g && (hxVar4.f35938e || q10)) || hxVar4.h) {
                        min = hxVar4.f35937c.size();
                    } else {
                        min = Math.min(i21, hxVar4.f35937c.size());
                    }
                    int i23 = cyVar.f34287a;
                    if (i23 >= intValue && (i10 = i23 - intValue) < min) {
                        cyVar.f34290e = hxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) hxVar4.f35937c.get(i10);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f28404id);
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
            cyVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            cyVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            cyVar.a(null, z10);
            if (cyVar.getSpan() == null || cyVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    cyVar.setSpan(new y5(document, (Paint.FontMetricsInt) null));
                } else {
                    cyVar.setSpan(new y5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            cyVar.a(org.telegram.messenger.j6.f(str), z10);
            cyVar.setSpan(null);
        }
        cyVar.setTag(str2);
        cyVar.setContentDescription(str);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.k8 k8Var;
        ty tyVar = this.G;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                View view = new View(tyVar.getContext());
                                view.setLayoutParams(new v4.p0(-1, tyVar.f40071c1));
                                k8Var = view;
                            } else {
                                Context context = tyVar.getContext();
                                org.telegram.ui.ActionBar.h6 h6Var = tyVar.f40064a2;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f36669a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29347d6, h6Var);
                                int L = org.telegram.messenger.g0.L(11.0f);
                                int i10 = org.telegram.ui.ActionBar.m6.Lf;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 99));
                                org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i10, 99);
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.t6.j(textView, d02, g10, null, h6Var);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
                                frameLayout.addView(textView, c8.na.e(-2, -2, 17));
                                k8Var = frameLayout;
                            }
                        } else {
                            k8Var = new lx(tyVar, tyVar.getContext());
                        }
                    } else {
                        Context context2 = tyVar.getContext();
                        ry ryVar = new ry(tyVar, true);
                        tyVar.U = ryVar;
                        di.b1 b1Var = new di.b1(tyVar, context2, ryVar);
                        b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                        b1Var.setClipToPadding(false);
                        b1Var.i(new fi.k(6));
                        b1Var.setOnItemClickListener(new o(this, 5));
                        k8Var = b1Var;
                    }
                } else {
                    k8Var = new ix(tyVar, tyVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(tyVar.getContext(), true, false, tyVar.f40064a2, tyVar.f40094j2);
                k8Var2.setOnIconClickListener(new o0(this, 14));
                k8Var = k8Var2;
            }
        } else {
            k8Var = new cy(tyVar.getContext());
        }
        return new v4.e1(k8Var);
    }
}
