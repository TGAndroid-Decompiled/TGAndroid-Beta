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
public final class bx extends bk0 {
    public int E;
    public int F;
    public final ry G;
    public ArrayList h;
    public int f33801c = -1;
    public int d = -1;
    public int f33802e = -1;
    public int f33803f = -1;
    public final ArrayList f33804n = new ArrayList();
    public final SparseIntArray f33805r = new SparseIntArray();
    public final SparseIntArray f33806s = new SparseIntArray();
    public final SparseIntArray f33807w = new SparseIntArray();
    public final SparseIntArray f33808x = new SparseIntArray();
    public final ArrayList f33809y = new ArrayList();

    public bx(ry ryVar) {
        this.G = ryVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
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
        ry ryVar = this.G;
        ArrayList arrayList = ryVar.f39387r1;
        int i10 = this.f33808x.get(i7);
        if (i10 >= 0 && i10 < arrayList.size()) {
            fx fxVar = (fx) arrayList.get(i10);
            if (!fxVar.h) {
                if (i10 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f33809y.get(i10)).intValue();
                ryVar.f39380p1.add(Long.valueOf(fxVar.f35172b.f28432id));
                if (!org.telegram.messenger.j10.i(ryVar.f39345d1).q() && !ryVar.V0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i11 = ryVar.R.J * 3;
                if ((fxVar.f35175f && !fxVar.f35176g && (fxVar.f35174e || z11)) || fxVar.h) {
                    min = fxVar.f35173c.size();
                } else {
                    min = Math.min(i11, fxVar.f35173c.size());
                }
                Integer num2 = null;
                if (fxVar.f35173c.size() > i11) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                fxVar.h = true;
                int size = fxVar.f35173c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    ryVar.f39395t2 = view;
                    ryVar.f39398u2 = num.intValue();
                    ryVar.f39401v2 = num2.intValue() + num.intValue();
                    ryVar.f39405w2 = SystemClock.elapsedRealtime();
                    o(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i11 / 2) {
                            f10 = 1.5f;
                        } else {
                            f10 = 4.0f;
                        }
                        ryVar.post(new ax(this, f10, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        ry ryVar = this.G;
        ArrayList arrayList = ryVar.f39377o1;
        if (ryVar.U2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f33804n);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(ryVar.f39345d1);
        ArrayList arrayList3 = d02.f26641t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!d02.E0(stickerSetCovered.set.f28432id, true) || ryVar.f39383q1.contains(Long.valueOf(stickerSetCovered.set.f28432id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        py pyVar = ryVar.U;
        if (pyVar != null) {
            pyVar.f();
        }
        v4.o.c(new jg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a02;
        ry ryVar = this.G;
        ArrayList arrayList = ryVar.f39377o1;
        ArrayList arrayList2 = ryVar.f39380p1;
        int i10 = ryVar.f39345d1;
        ArrayList arrayList3 = ryVar.f39387r1;
        arrayList3.clear();
        if (ryVar.d2) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(d02.u0(5));
            }
            ArrayList arrayList4 = this.h;
            if (!org.telegram.messenger.j10.i(i10).q() && !ryVar.V0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = ryVar.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a02 = d02.a0(stickerSet)) != null) {
                fx fxVar = new fx();
                fxVar.f35172b = ryVar.K1.emojiset;
                fxVar.f35173c = new ArrayList(a02.documents);
                fxVar.f35174e = true;
                fxVar.f35175f = true;
                fxVar.f35176g = false;
                fxVar.h = true;
                fxVar.f35177i = true;
                arrayList3.add(fxVar);
                TLRPC.StickerSet stickerSet2 = fxVar.f35172b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f28432id == stickerSet2.f28432id) {
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
                        fx fxVar2 = new fx();
                        fxVar2.f35172b = tL_messages_stickerSet2.set;
                        fxVar2.f35173c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        fxVar2.f35174e = true;
                        fxVar2.f35175f = d02.E0(tL_messages_stickerSet2.set.f28432id, true);
                        fxVar2.f35176g = false;
                        fxVar2.h = true;
                        arrayList3.add(fxVar2);
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
                    fx fxVar3 = new fx();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    fxVar3.f35172b = stickerSet3;
                    fxVar3.f35173c = tL_messages_stickerSet3.documents;
                    fxVar3.f35174e = false;
                    fxVar3.f35175f = d02.E0(stickerSet3.f28432id, true);
                    fxVar3.f35176g = false;
                    fxVar3.h = true;
                    arrayList3.add(fxVar3);
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
                        fx fxVar4 = new fx();
                        fxVar4.f35172b = tL_messages_stickerSet3.set;
                        fxVar4.f35173c = new ArrayList(arrayList5);
                        fxVar4.f35174e = true;
                        fxVar4.f35175f = d02.E0(tL_messages_stickerSet3.set.f28432id, true);
                        fxVar4.f35176g = false;
                        fxVar4.h = true;
                        arrayList3.add(fxVar4);
                    }
                    if (arrayList6.size() > 0) {
                        fx fxVar5 = new fx();
                        fxVar5.f35172b = tL_messages_stickerSet3.set;
                        fxVar5.f35173c = new ArrayList(arrayList6);
                        fxVar5.f35174e = false;
                        fxVar5.f35175f = d02.E0(tL_messages_stickerSet3.set.f28432id, true);
                        fxVar5.f35176g = false;
                        fxVar5.h = arrayList2.contains(Long.valueOf(fxVar5.f35172b.f28432id));
                        arrayList3.add(fxVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                fx fxVar6 = new fx();
                fxVar6.f35175f = d02.E0(stickerSetCovered.set.f28432id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                fxVar6.f35172b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    fxVar6.f35173c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet n02 = d02.n0(org.telegram.messenger.ri.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (n02 != null) {
                        fxVar6.f35173c = n02.documents;
                    } else {
                        fxVar6.d = org.telegram.messenger.ri.b0(stickerSetCovered.set);
                    }
                } else {
                    fxVar6.f35173c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = fxVar6.f35173c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < fxVar6.f35173c.size()) {
                            if (!org.telegram.messenger.fj.m3((TLRPC.Document) fxVar6.f35173c.get(i16))) {
                                z12 = true;
                                break;
                            }
                            i16++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    fxVar6.f35174e = !z12;
                    fxVar6.h = arrayList2.contains(Long.valueOf(fxVar6.f35172b.f28432id));
                    fxVar6.f35176g = true;
                    arrayList3.add(fxVar6);
                }
            }
            ww wwVar = ryVar.J;
            if (wwVar != null) {
                wwVar.p(ryVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bx.H():void");
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
        if (i7 == this.f33801c || i7 == this.f33803f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f33805r;
        if (sparseIntArray.indexOfKey(i7) >= 0) {
            int i10 = sparseIntArray.get(i7);
            char[] cArr = org.telegram.messenger.k6.f24990a;
            if (i10 < 8) {
                return 1;
            }
            return 5;
        } else if (this.G.f39347e0 && i7 == 0) {
            return 2;
        } else {
            if (this.f33807w.indexOfKey(i7) >= 0) {
                return 3;
            }
            if (this.f33808x.indexOfKey(i7) >= 0) {
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
        fx fxVar;
        int i11 = i7;
        ry ryVar = this.G;
        String[] strArr = ryVar.f39338b1;
        sw swVar = ryVar.R;
        int i12 = ryVar.f39345d1;
        ArrayList arrayList = ryVar.f39387r1;
        int i13 = f1Var.f59126f;
        View view = f1Var.f59122a;
        int i14 = 8;
        boolean z10 = true;
        fx fxVar2 = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.f33805r;
            if (i13 != 1) {
                if (i13 != 5) {
                    if (i13 == 6) {
                        hx hxVar = (hx) view;
                        int i15 = this.f33808x.get(i11);
                        int i16 = swVar.J * 3;
                        if (i15 >= 0 && i15 < arrayList.size()) {
                            fxVar2 = (fx) arrayList.get(i15);
                        }
                        if (fxVar2 != null) {
                            hxVar.f36000a.setText("+" + ((fxVar2.f35173c.size() - i16) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                jx jxVar = (jx) view;
                int length = sparseIntArray.get(i11) - strArr.length;
                fx fxVar3 = (fx) arrayList.get(length);
                int i17 = length - 1;
                if (i17 >= 0) {
                    fxVar = (fx) arrayList.get(i17);
                } else {
                    fxVar = null;
                }
                if (fxVar3 == null || !fxVar3.f35176g || (fxVar != null && !fxVar.f35174e && fxVar.f35175f && !org.telegram.messenger.j10.i(i12).q())) {
                    z10 = false;
                }
                if (fxVar3 != null && fxVar3.d != null) {
                    org.telegram.messenger.ri.d0(i12).o0(fxVar3.d, false);
                    fxVar3.d = null;
                }
                ug.s0 s0Var = jxVar.f36549r;
                if (fxVar3 != null) {
                    jxVar.f36552x = fxVar3;
                    jxVar.f36553y = z10;
                    jxVar.d.l(fxVar3.f35172b.title, false);
                    TextView textView = jxVar.f36546e;
                    if (fxVar3.f35177i) {
                        i14 = 0;
                    }
                    textView.setVisibility(i14);
                    if (fxVar3.f35175f && !fxVar3.f35172b.official) {
                        s0Var.b(org.telegram.messenger.gd.M0(2131745887, null), new ix(jxVar, 5), false);
                    } else {
                        s0Var.b(org.telegram.messenger.gd.M0(2131743639, null), new ix(jxVar, 6), false);
                    }
                    jxVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            j8Var.getClass();
            int i18 = sparseIntArray.get(i11);
            if (i11 == this.f33801c) {
                j8Var.b(org.telegram.messenger.gd.M0(2131750824, null), 2131232098, org.telegram.messenger.gd.M0(2131754899, null), 0, 0);
                return;
            } else if (i11 == this.f33803f) {
                j8Var.a(0, org.telegram.messenger.gd.M0(2131746166, null));
                return;
            } else if (i18 >= strArr.length) {
                try {
                    j8Var.a(0, ((fx) arrayList.get(i18 - strArr.length)).f35172b.title);
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
        zx zxVar = (zx) view;
        zxVar.f42960a = i11;
        zxVar.f42963e = null;
        if (ryVar.f39347e0) {
            i11--;
        }
        if (this.f33803f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = ryVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = ryVar.getRecentEmoji().get(i11);
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
                String[][] strArr2 = org.telegram.messenger.k6.f24994f;
                if (i19 < 8) {
                    String[] strArr3 = strArr2[i19];
                    int length2 = strArr3.length + 1;
                    int i20 = (i11 - size) - 1;
                    if (i20 >= 0 && i11 < size + length2) {
                        String str4 = strArr3[i20];
                        String str5 = (String) org.telegram.messenger.j6.f24820j.get(str4);
                        if (str5 != null) {
                            str = ry.g(str4, str5);
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
                boolean q10 = org.telegram.messenger.j10.i(i12).q();
                int i21 = swVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f33809y;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    fx fxVar4 = (fx) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    if ((fxVar4.f35175f && !fxVar4.f35176g && (fxVar4.f35174e || q10)) || fxVar4.h) {
                        min = fxVar4.f35173c.size();
                    } else {
                        min = Math.min(i21, fxVar4.f35173c.size());
                    }
                    int i23 = zxVar.f42960a;
                    if (i23 >= intValue && (i10 = i23 - intValue) < min) {
                        zxVar.f42963e = fxVar4;
                        TLRPC.Document document2 = (TLRPC.Document) fxVar4.f35173c.get(i10);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f28411id);
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
            zxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            zxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            zxVar.a(null, z10);
            if (zxVar.getSpan() == null || zxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    zxVar.setSpan(new x5(document, (Paint.FontMetricsInt) null));
                } else {
                    zxVar.setSpan(new x5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            zxVar.a(org.telegram.messenger.j6.f(str), z10);
            zxVar.setSpan(null);
        }
        zxVar.setTag(str2);
        zxVar.setContentDescription(str);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.j8 j8Var;
        ry ryVar = this.G;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                View view = new View(ryVar.getContext());
                                view.setLayoutParams(new v4.q0(-1, ryVar.f39342c1));
                                j8Var = view;
                            } else {
                                Context context = ryVar.getContext();
                                org.telegram.ui.ActionBar.i6 i6Var = ryVar.f39335a2;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f36000a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29396d6, i6Var);
                                int L = org.telegram.messenger.g0.L(11.0f);
                                int i10 = org.telegram.ui.ActionBar.n6.Lf;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 99));
                                org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 99);
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.u6.j(textView, d02, g10, null, i6Var);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
                                frameLayout.addView(textView, c8.ma.e(-2, -2, 17));
                                j8Var = frameLayout;
                            }
                        } else {
                            j8Var = new jx(ryVar, ryVar.getContext());
                        }
                    } else {
                        Context context2 = ryVar.getContext();
                        py pyVar = new py(ryVar, true);
                        ryVar.U = pyVar;
                        di.b1 b1Var = new di.b1(ryVar, context2, pyVar);
                        b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                        b1Var.setClipToPadding(false);
                        b1Var.i(new fi.k(6));
                        b1Var.setOnItemClickListener(new n(this, 5));
                        j8Var = b1Var;
                    }
                } else {
                    j8Var = new gx(ryVar, ryVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(ryVar.getContext(), true, false, ryVar.f39335a2, ryVar.f39365j2);
                j8Var2.setOnIconClickListener(new n0(this, 14));
                j8Var = j8Var2;
            }
        } else {
            j8Var = new zx(ryVar.getContext());
        }
        return new v4.f1(j8Var);
    }
}
