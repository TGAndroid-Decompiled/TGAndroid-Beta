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
public final class vw extends tj0 {
    public int E;
    public int F;
    public final ly G;
    public ArrayList h;
    public int f41162c = -1;
    public int d = -1;
    public int f41163e = -1;
    public int f41164f = -1;
    public final ArrayList f41165n = new ArrayList();
    public final SparseIntArray f41166r = new SparseIntArray();
    public final SparseIntArray f41167s = new SparseIntArray();
    public final SparseIntArray f41168w = new SparseIntArray();
    public final SparseIntArray f41169x = new SparseIntArray();
    public final ArrayList f41170y = new ArrayList();

    public vw(ly lyVar) {
        this.G = lyVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
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
        ly lyVar = this.G;
        ArrayList arrayList = lyVar.f36983r1;
        int i10 = this.f41169x.get(i7);
        if (i10 >= 0 && i10 < arrayList.size()) {
            zw zwVar = (zw) arrayList.get(i10);
            if (!zwVar.h) {
                if (i10 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f41170y.get(i10)).intValue();
                lyVar.f36976p1.add(Long.valueOf(zwVar.f42431b.f28078id));
                if (!org.telegram.messenger.m10.i(lyVar.f36941d1).q() && !lyVar.V0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i11 = lyVar.R.J * 3;
                if ((zwVar.f42434f && !zwVar.f42435g && (zwVar.f42433e || z11)) || zwVar.h) {
                    min = zwVar.f42432c.size();
                } else {
                    min = Math.min(i11, zwVar.f42432c.size());
                }
                Integer num2 = null;
                if (zwVar.f42432c.size() > i11) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                zwVar.h = true;
                int size = zwVar.f42432c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    lyVar.f36991t2 = view;
                    lyVar.f36994u2 = num.intValue();
                    lyVar.f36997v2 = num2.intValue() + num.intValue();
                    lyVar.f37001w2 = SystemClock.elapsedRealtime();
                    o(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i11 / 2) {
                            f10 = 1.5f;
                        } else {
                            f10 = 4.0f;
                        }
                        lyVar.post(new uw(this, f10, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        ly lyVar = this.G;
        ArrayList arrayList = lyVar.f36973o1;
        if (lyVar.U2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f41165n);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(lyVar.f36941d1);
        ArrayList arrayList3 = b02.f26501t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!b02.B0(stickerSetCovered.set.f28078id, true) || lyVar.f36979q1.contains(Long.valueOf(stickerSetCovered.set.f28078id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        jy jyVar = lyVar.U;
        if (jyVar != null) {
            jyVar.f();
        }
        v4.o.c(new jg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        ly lyVar = this.G;
        ArrayList arrayList = lyVar.f36973o1;
        ArrayList arrayList2 = lyVar.f36976p1;
        int i10 = lyVar.f36941d1;
        ArrayList arrayList3 = lyVar.f36983r1;
        arrayList3.clear();
        if (lyVar.d2) {
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            if (!org.telegram.messenger.m10.i(i10).q() && !lyVar.V0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = lyVar.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                zw zwVar = new zw();
                zwVar.f42431b = lyVar.K1.emojiset;
                zwVar.f42432c = new ArrayList(Y.documents);
                zwVar.f42433e = true;
                zwVar.f42434f = true;
                zwVar.f42435g = false;
                zwVar.h = true;
                zwVar.f42436i = true;
                arrayList3.add(zwVar);
                TLRPC.StickerSet stickerSet2 = zwVar.f42431b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f28078id == stickerSet2.f28078id) {
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
                        zw zwVar2 = new zw();
                        zwVar2.f42431b = tL_messages_stickerSet2.set;
                        zwVar2.f42432c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        zwVar2.f42433e = true;
                        zwVar2.f42434f = b02.B0(tL_messages_stickerSet2.set.f28078id, true);
                        zwVar2.f42435g = false;
                        zwVar2.h = true;
                        arrayList3.add(zwVar2);
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
                    zw zwVar3 = new zw();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    zwVar3.f42431b = stickerSet3;
                    zwVar3.f42432c = tL_messages_stickerSet3.documents;
                    zwVar3.f42433e = false;
                    zwVar3.f42434f = b02.B0(stickerSet3.f28078id, true);
                    zwVar3.f42435g = false;
                    zwVar3.h = true;
                    arrayList3.add(zwVar3);
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
                        zw zwVar4 = new zw();
                        zwVar4.f42431b = tL_messages_stickerSet3.set;
                        zwVar4.f42432c = new ArrayList(arrayList5);
                        zwVar4.f42433e = true;
                        zwVar4.f42434f = b02.B0(tL_messages_stickerSet3.set.f28078id, true);
                        zwVar4.f42435g = false;
                        zwVar4.h = true;
                        arrayList3.add(zwVar4);
                    }
                    if (arrayList6.size() > 0) {
                        zw zwVar5 = new zw();
                        zwVar5.f42431b = tL_messages_stickerSet3.set;
                        zwVar5.f42432c = new ArrayList(arrayList6);
                        zwVar5.f42433e = false;
                        zwVar5.f42434f = b02.B0(tL_messages_stickerSet3.set.f28078id, true);
                        zwVar5.f42435g = false;
                        zwVar5.h = arrayList2.contains(Long.valueOf(zwVar5.f42431b.f28078id));
                        arrayList3.add(zwVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                zw zwVar6 = new zw();
                zwVar6.f42434f = b02.B0(stickerSetCovered.set.f28078id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                zwVar6.f42431b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    zwVar6.f42432c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.si.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        zwVar6.f42432c = l02.documents;
                    } else {
                        zwVar6.d = org.telegram.messenger.si.Z(stickerSetCovered.set);
                    }
                } else {
                    zwVar6.f42432c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = zwVar6.f42432c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < zwVar6.f42432c.size()) {
                            if (!org.telegram.messenger.gj.m3((TLRPC.Document) zwVar6.f42432c.get(i16))) {
                                z12 = true;
                                break;
                            }
                            i16++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    zwVar6.f42433e = !z12;
                    zwVar6.h = arrayList2.contains(Long.valueOf(zwVar6.f42431b.f28078id));
                    zwVar6.f42435g = true;
                    arrayList3.add(zwVar6);
                }
            }
            qw qwVar = lyVar.J;
            if (qwVar != null) {
                qwVar.p(lyVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vw.H():void");
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
        if (i7 == this.f41162c || i7 == this.f41164f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f41166r;
        if (sparseIntArray.indexOfKey(i7) >= 0) {
            int i10 = sparseIntArray.get(i7);
            char[] cArr = org.telegram.messenger.k6.f24639a;
            if (i10 < 8) {
                return 1;
            }
            return 5;
        } else if (this.G.f36943e0 && i7 == 0) {
            return 2;
        } else {
            if (this.f41168w.indexOfKey(i7) >= 0) {
                return 3;
            }
            if (this.f41169x.indexOfKey(i7) >= 0) {
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
        zw zwVar;
        int i11 = i7;
        ly lyVar = this.G;
        String[] strArr = lyVar.f36934b1;
        mw mwVar = lyVar.R;
        int i12 = lyVar.f36941d1;
        ArrayList arrayList = lyVar.f36983r1;
        int i13 = e1Var.f58539f;
        View view = e1Var.f58535a;
        int i14 = 8;
        boolean z10 = true;
        zw zwVar2 = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.f41166r;
            if (i13 != 1) {
                if (i13 != 5) {
                    if (i13 == 6) {
                        bx bxVar = (bx) view;
                        int i15 = this.f41169x.get(i11);
                        int i16 = mwVar.J * 3;
                        if (i15 >= 0 && i15 < arrayList.size()) {
                            zwVar2 = (zw) arrayList.get(i15);
                        }
                        if (zwVar2 != null) {
                            bxVar.f33425a.setText("+" + ((zwVar2.f42432c.size() - i16) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                dx dxVar = (dx) view;
                int length = sparseIntArray.get(i11) - strArr.length;
                zw zwVar3 = (zw) arrayList.get(length);
                int i17 = length - 1;
                if (i17 >= 0) {
                    zwVar = (zw) arrayList.get(i17);
                } else {
                    zwVar = null;
                }
                if (zwVar3 == null || !zwVar3.f42435g || (zwVar != null && !zwVar.f42433e && zwVar.f42434f && !org.telegram.messenger.m10.i(i12).q())) {
                    z10 = false;
                }
                if (zwVar3 != null && zwVar3.d != null) {
                    org.telegram.messenger.si.b0(i12).m0(zwVar3.d, false);
                    zwVar3.d = null;
                }
                ug.q0 q0Var = dxVar.f34091r;
                if (zwVar3 != null) {
                    dxVar.f34094x = zwVar3;
                    dxVar.f34095y = z10;
                    dxVar.d.l(zwVar3.f42431b.title, false);
                    TextView textView = dxVar.f34088e;
                    if (zwVar3.f42436i) {
                        i14 = 0;
                    }
                    textView.setVisibility(i14);
                    if (zwVar3.f42434f && !zwVar3.f42431b.official) {
                        q0Var.b(org.telegram.messenger.hd.M0(2131746082, null), new cx(dxVar, 5), false);
                    } else {
                        q0Var.b(org.telegram.messenger.hd.M0(2131743876, null), new cx(dxVar, 6), false);
                    }
                    dxVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
            i8Var.getClass();
            int i18 = sparseIntArray.get(i11);
            if (i11 == this.f41162c) {
                i8Var.b(org.telegram.messenger.hd.M0(2131750835, null), 2131232097, org.telegram.messenger.hd.M0(2131754899, null), 0, 0);
                return;
            } else if (i11 == this.f41164f) {
                i8Var.a(0, org.telegram.messenger.hd.M0(2131746361, null));
                return;
            } else if (i18 >= strArr.length) {
                try {
                    i8Var.a(0, ((zw) arrayList.get(i18 - strArr.length)).f42431b.title);
                    return;
                } catch (Exception unused) {
                    i8Var.a(0, "");
                    return;
                }
            } else {
                i8Var.a(0, strArr[i18]);
                return;
            }
        }
        ux uxVar = (ux) view;
        uxVar.f40179a = i11;
        uxVar.f40182e = null;
        if (lyVar.f36943e0) {
            i11--;
        }
        if (this.f41164f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = lyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = lyVar.getRecentEmoji().get(i11);
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
                String[][] strArr2 = org.telegram.messenger.k6.f24643f;
                if (i19 < 8) {
                    String[] strArr3 = strArr2[i19];
                    int length2 = strArr3.length + 1;
                    int i20 = (i11 - size) - 1;
                    if (i20 >= 0 && i11 < size + length2) {
                        String str4 = strArr3[i20];
                        String str5 = (String) org.telegram.messenger.j6.f24527j.get(str4);
                        if (str5 != null) {
                            str = ly.g(str4, str5);
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
                boolean q10 = org.telegram.messenger.m10.i(i12).q();
                int i21 = mwVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f41170y;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    zw zwVar4 = (zw) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    if ((zwVar4.f42434f && !zwVar4.f42435g && (zwVar4.f42433e || q10)) || zwVar4.h) {
                        min = zwVar4.f42432c.size();
                    } else {
                        min = Math.min(i21, zwVar4.f42432c.size());
                    }
                    int i23 = uxVar.f40179a;
                    if (i23 >= intValue && (i10 = i23 - intValue) < min) {
                        uxVar.f40182e = zwVar4;
                        TLRPC.Document document2 = (TLRPC.Document) zwVar4.f42432c.get(i10);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f28057id);
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
            uxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            uxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            uxVar.a(null, z10);
            if (uxVar.getSpan() == null || uxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    uxVar.setSpan(new p5(document, (Paint.FontMetricsInt) null));
                } else {
                    uxVar.setSpan(new p5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            uxVar.a(org.telegram.messenger.j6.f(str), z10);
            uxVar.setSpan(null);
        }
        uxVar.setTag(str2);
        uxVar.setContentDescription(str);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.i8 i8Var;
        ly lyVar = this.G;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                View view = new View(lyVar.getContext());
                                view.setLayoutParams(new v4.p0(-1, lyVar.f36938c1));
                                i8Var = view;
                            } else {
                                Context context = lyVar.getContext();
                                org.telegram.ui.ActionBar.e6 e6Var = lyVar.f36931a2;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f33425a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28849d6, e6Var);
                                int L = org.telegram.messenger.g0.L(11.0f);
                                int i10 = org.telegram.ui.ActionBar.j6.Lf;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, i0.a.o(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), 99));
                                org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i10, 99);
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.q6.j(textView, d02, g10, null, e6Var);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
                                frameLayout.addView(textView, c8.ja.e(-2, -2, 17));
                                i8Var = frameLayout;
                            }
                        } else {
                            i8Var = new dx(lyVar, lyVar.getContext());
                        }
                    } else {
                        Context context2 = lyVar.getContext();
                        jy jyVar = new jy(lyVar, true);
                        lyVar.U = jyVar;
                        di.c1 c1Var = new di.c1(lyVar, context2, jyVar);
                        c1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                        c1Var.setClipToPadding(false);
                        c1Var.i(new fi.k(6));
                        c1Var.setOnItemClickListener(new j(this, 5));
                        i8Var = c1Var;
                    }
                } else {
                    i8Var = new ax(lyVar, lyVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(lyVar.getContext(), true, false, lyVar.f36931a2, lyVar.f36961j2);
                i8Var2.setOnIconClickListener(new e0(this, 14));
                i8Var = i8Var2;
            }
        } else {
            i8Var = new ux(lyVar.getContext());
        }
        return new v4.e1(i8Var);
    }
}
