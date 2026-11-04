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
public final class ow extends sj0 {
    public int E;
    public int F;
    public final ey G;
    public ArrayList h;
    public int f36949c = -1;
    public int d = -1;
    public int f36950e = -1;
    public int f36951f = -1;
    public final ArrayList f36952n = new ArrayList();
    public final SparseIntArray f36953r = new SparseIntArray();
    public final SparseIntArray f36954s = new SparseIntArray();
    public final SparseIntArray f36955w = new SparseIntArray();
    public final SparseIntArray f36956x = new SparseIntArray();
    public final ArrayList f36957y = new ArrayList();

    public ow(ey eyVar) {
        this.G = eyVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 0 && i3 != 4 && i3 != 3 && i3 != 6) {
            return false;
        }
        return true;
    }

    public final void E(int i3, View view) {
        boolean z10;
        boolean z11;
        int min;
        Integer num;
        float f10;
        ey eyVar = this.G;
        ArrayList arrayList = eyVar.f33572r1;
        int i10 = this.f36956x.get(i3);
        if (i10 >= 0 && i10 < arrayList.size()) {
            sw swVar = (sw) arrayList.get(i10);
            if (!swVar.h) {
                if (i10 + 1 == arrayList.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int intValue = ((Integer) this.f36957y.get(i10)).intValue();
                eyVar.f33565p1.add(Long.valueOf(swVar.f38125b.f27028id));
                if (!org.telegram.messenger.h10.i(eyVar.f33529d1).q() && !eyVar.V0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                int i11 = eyVar.R.J * 3;
                if ((swVar.f38128f && !swVar.f38129g && (swVar.f38127e || z11)) || swVar.h) {
                    min = swVar.f38126c.size();
                } else {
                    min = Math.min(i11, swVar.f38126c.size());
                }
                Integer num2 = null;
                if (swVar.f38126c.size() > i11) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                swVar.h = true;
                int size = swVar.f38126c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    eyVar.f33580t2 = view;
                    eyVar.f33583u2 = num.intValue();
                    eyVar.f33586v2 = num2.intValue() + num.intValue();
                    eyVar.f33590w2 = SystemClock.elapsedRealtime();
                    o(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z10) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i11 / 2) {
                            f10 = 1.5f;
                        } else {
                            f10 = 4.0f;
                        }
                        eyVar.post(new nw(this, f10, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z10) {
        ey eyVar = this.G;
        ArrayList arrayList = eyVar.f33562o1;
        if (eyVar.U2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f36952n);
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(eyVar.f33529d1);
        ArrayList arrayList3 = b02.f24051t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i3);
            if (!b02.B0(stickerSetCovered.set.f27028id, true) || eyVar.f33568q1.contains(Long.valueOf(stickerSetCovered.set.f27028id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z10);
        H();
        cy cyVar = eyVar.U;
        if (cyVar != null) {
            cyVar.f();
        }
        u4.o.c(new kg.g(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        int i3;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        ey eyVar = this.G;
        ArrayList arrayList = eyVar.f33562o1;
        ArrayList arrayList2 = eyVar.f33565p1;
        int i10 = eyVar.f33529d1;
        ArrayList arrayList3 = eyVar.f33572r1;
        arrayList3.clear();
        if (eyVar.f33530d2) {
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i10);
            if (z10 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            if (!org.telegram.messenger.h10.i(i10).q() && !eyVar.V0) {
                z11 = false;
            } else {
                z11 = true;
            }
            TLRPC.ChatFull chatFull = eyVar.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                sw swVar = new sw();
                swVar.f38125b = eyVar.K1.emojiset;
                swVar.f38126c = new ArrayList(Y.documents);
                swVar.f38127e = true;
                swVar.f38128f = true;
                swVar.f38129g = false;
                swVar.h = true;
                swVar.f38130i = true;
                arrayList3.add(swVar);
                TLRPC.StickerSet stickerSet2 = swVar.f38125b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f27028id == stickerSet2.f27028id) {
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
                    if (tL_messages_stickerSet2 != null && !org.telegram.messenger.zi.W3(tL_messages_stickerSet2)) {
                        sw swVar2 = new sw();
                        swVar2.f38125b = tL_messages_stickerSet2.set;
                        swVar2.f38126c = new ArrayList(tL_messages_stickerSet2.documents);
                        i3 = 1;
                        swVar2.f38127e = true;
                        swVar2.f38128f = b02.B0(tL_messages_stickerSet2.set.f27028id, true);
                        swVar2.f38129g = false;
                        swVar2.h = true;
                        arrayList3.add(swVar2);
                        arrayList4.remove(i12);
                        i12--;
                    } else {
                        i3 = 1;
                    }
                    i12 += i3;
                }
            }
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList4.get(i13);
                if (z11) {
                    sw swVar3 = new sw();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    swVar3.f38125b = stickerSet3;
                    swVar3.f38126c = tL_messages_stickerSet3.documents;
                    swVar3.f38127e = false;
                    swVar3.f38128f = b02.B0(stickerSet3.f27028id, true);
                    swVar3.f38129g = false;
                    swVar3.h = true;
                    arrayList3.add(swVar3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i14 = 0; i14 < tL_messages_stickerSet3.documents.size(); i14++) {
                            if (org.telegram.messenger.zi.n3(tL_messages_stickerSet3.documents.get(i14))) {
                                arrayList5.add(tL_messages_stickerSet3.documents.get(i14));
                            } else {
                                arrayList6.add(tL_messages_stickerSet3.documents.get(i14));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        sw swVar4 = new sw();
                        swVar4.f38125b = tL_messages_stickerSet3.set;
                        swVar4.f38126c = new ArrayList(arrayList5);
                        swVar4.f38127e = true;
                        swVar4.f38128f = b02.B0(tL_messages_stickerSet3.set.f27028id, true);
                        swVar4.f38129g = false;
                        swVar4.h = true;
                        arrayList3.add(swVar4);
                    }
                    if (arrayList6.size() > 0) {
                        sw swVar5 = new sw();
                        swVar5.f38125b = tL_messages_stickerSet3.set;
                        swVar5.f38126c = new ArrayList(arrayList6);
                        swVar5.f38127e = false;
                        swVar5.f38128f = b02.B0(tL_messages_stickerSet3.set.f27028id, true);
                        swVar5.f38129g = false;
                        swVar5.h = arrayList2.contains(Long.valueOf(swVar5.f38125b.f27028id));
                        arrayList3.add(swVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                sw swVar6 = new sw();
                swVar6.f38128f = b02.B0(stickerSetCovered.set.f27028id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                swVar6.f38125b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    swVar6.f38126c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.li.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        swVar6.f38126c = l02.documents;
                    } else {
                        swVar6.d = org.telegram.messenger.li.Z(stickerSetCovered.set);
                    }
                } else {
                    swVar6.f38126c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = swVar6.f38126c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < swVar6.f38126c.size()) {
                            if (!org.telegram.messenger.zi.n3((TLRPC.Document) swVar6.f38126c.get(i16))) {
                                z12 = true;
                                break;
                            }
                            i16++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    swVar6.f38127e = !z12;
                    swVar6.h = arrayList2.contains(Long.valueOf(swVar6.f38125b.f27028id));
                    swVar6.f38129g = true;
                    arrayList3.add(swVar6);
                }
            }
            jw jwVar = eyVar.J;
            if (jwVar != null) {
                jwVar.p(eyVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ow.H():void");
    }

    @Override
    public final int b() {
        return this.E;
    }

    @Override
    public final long c(int i3) {
        return i3;
    }

    @Override
    public final int d(int i3) {
        if (i3 == this.d) {
            return 4;
        }
        if (i3 == this.f36949c || i3 == this.f36951f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f36953r;
        if (sparseIntArray.indexOfKey(i3) >= 0) {
            int i10 = sparseIntArray.get(i3);
            char[] cArr = org.telegram.messenger.j6.f23640a;
            if (i10 < 8) {
                return 1;
            }
            return 5;
        } else if (this.G.f33532e0 && i3 == 0) {
            return 2;
        } else {
            if (this.f36955w.indexOfKey(i3) >= 0) {
                return 3;
            }
            if (this.f36956x.indexOfKey(i3) >= 0) {
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
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        String str2;
        Long l10;
        TLRPC.Document document;
        int min;
        int i10;
        Long valueOf;
        sw swVar;
        int i11 = i3;
        ey eyVar = this.G;
        String[] strArr = eyVar.f33523b1;
        fw fwVar = eyVar.R;
        int i12 = eyVar.f33529d1;
        ArrayList arrayList = eyVar.f33572r1;
        int i13 = d1Var.f55544f;
        View view = d1Var.f55540a;
        int i14 = 8;
        boolean z10 = true;
        sw swVar2 = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.f36953r;
            if (i13 != 1) {
                if (i13 != 5) {
                    if (i13 == 6) {
                        uw uwVar = (uw) view;
                        int i15 = this.f36956x.get(i11);
                        int i16 = fwVar.J * 3;
                        if (i15 >= 0 && i15 < arrayList.size()) {
                            swVar2 = (sw) arrayList.get(i15);
                        }
                        if (swVar2 != null) {
                            uwVar.f38891a.setText("+" + ((swVar2.f38126c.size() - i16) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ww wwVar = (ww) view;
                int length = sparseIntArray.get(i11) - strArr.length;
                sw swVar3 = (sw) arrayList.get(length);
                int i17 = length - 1;
                if (i17 >= 0) {
                    swVar = (sw) arrayList.get(i17);
                } else {
                    swVar = null;
                }
                if (swVar3 == null || !swVar3.f38129g || (swVar != null && !swVar.f38127e && swVar.f38128f && !org.telegram.messenger.h10.i(i12).q())) {
                    z10 = false;
                }
                if (swVar3 != null && swVar3.d != null) {
                    org.telegram.messenger.li.b0(i12).m0(swVar3.d, false);
                    swVar3.d = null;
                }
                vg.o0 o0Var = wwVar.f40162r;
                if (swVar3 != null) {
                    wwVar.f40165x = swVar3;
                    wwVar.f40166y = z10;
                    wwVar.d.l(swVar3.f38125b.title, false);
                    TextView textView = wwVar.f40159e;
                    if (swVar3.f38130i) {
                        i14 = 0;
                    }
                    textView.setVisibility(i14);
                    if (swVar3.f38128f && !swVar3.f38125b.official) {
                        o0Var.b(org.telegram.messenger.bd.M0(2131746092, null), new vw(wwVar, 5), false);
                    } else {
                        o0Var.b(org.telegram.messenger.bd.M0(2131743886, null), new vw(wwVar, 6), false);
                    }
                    wwVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
            i8Var.getClass();
            int i18 = sparseIntArray.get(i11);
            if (i11 == this.f36949c) {
                i8Var.b(org.telegram.messenger.bd.M0(2131750836, null), 2131232096, org.telegram.messenger.bd.M0(2131754899, null), 0, 0);
                return;
            } else if (i11 == this.f36951f) {
                i8Var.a(0, org.telegram.messenger.bd.M0(2131746369, null));
                return;
            } else if (i18 >= strArr.length) {
                try {
                    i8Var.a(0, ((sw) arrayList.get(i18 - strArr.length)).f38125b.title);
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
        nx nxVar = (nx) view;
        nxVar.f36636a = i11;
        nxVar.f36639e = null;
        if (eyVar.f33532e0) {
            i11--;
        }
        if (this.f36951f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = eyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = eyVar.getRecentEmoji().get(i11);
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
                String[][] strArr2 = org.telegram.messenger.j6.f23644f;
                if (i19 < 8) {
                    String[] strArr3 = strArr2[i19];
                    int length2 = strArr3.length + 1;
                    int i20 = (i11 - size) - 1;
                    if (i20 >= 0 && i11 < size + length2) {
                        String str4 = strArr3[i20];
                        String str5 = (String) org.telegram.messenger.i6.f23453j.get(str4);
                        if (str5 != null) {
                            str = ey.g(str4, str5);
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
                boolean q10 = org.telegram.messenger.h10.i(i12).q();
                int i21 = fwVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f36957y;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    sw swVar4 = (sw) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    if ((swVar4.f38128f && !swVar4.f38129g && (swVar4.f38127e || q10)) || swVar4.h) {
                        min = swVar4.f38126c.size();
                    } else {
                        min = Math.min(i21, swVar4.f38126c.size());
                    }
                    int i23 = nxVar.f36636a;
                    if (i23 >= intValue && (i10 = i23 - intValue) < min) {
                        nxVar.f36639e = swVar4;
                        TLRPC.Document document2 = (TLRPC.Document) swVar4.f38126c.get(i10);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f27007id);
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
            nxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            nxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            nxVar.a(null, z10);
            if (nxVar.getSpan() == null || nxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    nxVar.setSpan(new p5(document, (Paint.FontMetricsInt) null));
                } else {
                    nxVar.setSpan(new p5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            nxVar.a(org.telegram.messenger.i6.f(str), z10);
            nxVar.setSpan(null);
        }
        nxVar.setTag(str2);
        nxVar.setContentDescription(str);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.i8 i8Var;
        ey eyVar = this.G;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                View view = new View(eyVar.getContext());
                                view.setLayoutParams(new u4.p0(-1, eyVar.f33527c1));
                                i8Var = view;
                            } else {
                                Context context = eyVar.getContext();
                                org.telegram.ui.ActionBar.e6 e6Var = eyVar.f33520a2;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f38891a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27878d6, e6Var);
                                int L = org.telegram.messenger.g0.L(11.0f);
                                int i10 = org.telegram.ui.ActionBar.k6.If;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 99));
                                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 99);
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.r6.k(textView, d02, h, null, e6Var);
                                textView.setTypeface(org.telegram.messenger.g0.o());
                                textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f));
                                frameLayout.addView(textView, b8.mf.e(-2, -2, 17));
                                i8Var = frameLayout;
                            }
                        } else {
                            i8Var = new ww(eyVar, eyVar.getContext());
                        }
                    } else {
                        Context context2 = eyVar.getContext();
                        cy cyVar = new cy(eyVar, true);
                        eyVar.U = cyVar;
                        ci.j1 j1Var = new ci.j1(eyVar, context2, cyVar);
                        j1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                        j1Var.setClipToPadding(false);
                        j1Var.i(new ei.l(6));
                        j1Var.setOnItemClickListener(new k(this, 5));
                        i8Var = j1Var;
                    }
                } else {
                    i8Var = new tw(eyVar, eyVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(eyVar.getContext(), true, false, eyVar.f33520a2, eyVar.f33550j2);
                i8Var2.setOnIconClickListener(new f0(this, 13));
                i8Var = i8Var2;
            }
        } else {
            i8Var = new nx(eyVar.getContext());
        }
        return new u4.d1(i8Var);
    }
}
