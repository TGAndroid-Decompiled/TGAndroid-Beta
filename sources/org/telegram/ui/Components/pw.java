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
public final class pw extends oj0 {
    public int D;
    public int E;
    public final gy F;
    public ArrayList h;
    public int f37077c = -1;
    public int d = -1;
    public int f37078e = -1;
    public int f37079f = -1;
    public final ArrayList f37080n = new ArrayList();
    public final SparseIntArray f37081r = new SparseIntArray();
    public final SparseIntArray f37082s = new SparseIntArray();
    public final SparseIntArray f37083w = new SparseIntArray();
    public final SparseIntArray f37084x = new SparseIntArray();
    public final ArrayList f37085y = new ArrayList();

    public pw(gy gyVar) {
        this.F = gyVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56955f;
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
        gy gyVar = this.F;
        ArrayList arrayList = gyVar.f34073q1;
        int i10 = this.f37084x.get(i7);
        if (i10 >= 0 && i10 < arrayList.size()) {
            tw twVar = (tw) arrayList.get(i10);
            if (!twVar.h) {
                if (i10 + 1 == arrayList.size()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int intValue = ((Integer) this.f37085y.get(i10)).intValue();
                gyVar.f34067o1.add(Long.valueOf(twVar.f38400b.f26980id));
                if (!org.telegram.messenger.p10.i(gyVar.f34032c1).q() && !gyVar.U0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int i11 = gyVar.Q.J * 3;
                if ((twVar.f38403f && !twVar.f38404g && (twVar.f38402e || z10)) || twVar.h) {
                    min = twVar.f38401c.size();
                } else {
                    min = Math.min(i11, twVar.f38401c.size());
                }
                Integer num2 = null;
                if (twVar.f38401c.size() > i11) {
                    num = Integer.valueOf(intValue + 1 + min);
                } else {
                    num = null;
                }
                twVar.h = true;
                int size = twVar.f38401c.size() - min;
                if (size > 0) {
                    num = Integer.valueOf(intValue + 1 + min);
                    num2 = Integer.valueOf(size);
                }
                G(false);
                H();
                if (num != null && num2 != null) {
                    gyVar.f34082s2 = view;
                    gyVar.f34085t2 = num.intValue();
                    gyVar.f34088u2 = num2.intValue() + num.intValue();
                    gyVar.f34091v2 = SystemClock.elapsedRealtime();
                    o(num.intValue(), num2.intValue());
                    g(num.intValue());
                    if (z9) {
                        int intValue2 = num.intValue();
                        if (num2.intValue() > i11 / 2) {
                            f10 = 1.5f;
                        } else {
                            f10 = 4.0f;
                        }
                        gyVar.post(new ow(this, f10, intValue2, 0));
                    }
                }
            }
        }
    }

    public final void F(boolean z9) {
        gy gyVar = this.F;
        ArrayList arrayList = gyVar.n1;
        if (gyVar.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f37080n);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(gyVar.f34032c1);
        ArrayList arrayList3 = b02.f25837s0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i7);
            if (!b02.B0(stickerSetCovered.set.f26980id, true) || gyVar.f34070p1.contains(Long.valueOf(stickerSetCovered.set.f26980id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z9);
        H();
        ey eyVar = gyVar.T;
        if (eyVar != null) {
            eyVar.f();
        }
        v4.o.c(new jg.h(this, arrayList2, 1), false).c(this);
    }

    public final void G(boolean z9) {
        boolean z10;
        boolean z11;
        int i7;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        gy gyVar = this.F;
        ArrayList arrayList = gyVar.n1;
        ArrayList arrayList2 = gyVar.f34067o1;
        int i10 = gyVar.f34032c1;
        ArrayList arrayList3 = gyVar.f34073q1;
        arrayList3.clear();
        if (gyVar.f34033c2) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
            if (z9 || this.h == null) {
                this.h = new ArrayList(b02.s0(5));
            }
            ArrayList arrayList4 = this.h;
            if (!org.telegram.messenger.p10.i(i10).q() && !gyVar.U0) {
                z10 = false;
            } else {
                z10 = true;
            }
            TLRPC.ChatFull chatFull = gyVar.J1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (Y = b02.Y(stickerSet)) != null) {
                tw twVar = new tw();
                twVar.f38400b = gyVar.J1.emojiset;
                twVar.f38401c = new ArrayList(Y.documents);
                twVar.f38402e = true;
                twVar.f38403f = true;
                twVar.f38404g = false;
                twVar.h = true;
                twVar.f38405i = true;
                arrayList3.add(twVar);
                TLRPC.StickerSet stickerSet2 = twVar.f38400b;
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList4.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList4.get(i11);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.f26980id == stickerSet2.f26980id) {
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
                        tw twVar2 = new tw();
                        twVar2.f38400b = tL_messages_stickerSet2.set;
                        twVar2.f38401c = new ArrayList(tL_messages_stickerSet2.documents);
                        i7 = 1;
                        twVar2.f38402e = true;
                        twVar2.f38403f = b02.B0(tL_messages_stickerSet2.set.f26980id, true);
                        twVar2.f38404g = false;
                        twVar2.h = true;
                        arrayList3.add(twVar2);
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
                    tw twVar3 = new tw();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    twVar3.f38400b = stickerSet3;
                    twVar3.f38401c = tL_messages_stickerSet3.documents;
                    twVar3.f38402e = false;
                    twVar3.f38403f = b02.B0(stickerSet3.f26980id, true);
                    twVar3.f38404g = false;
                    twVar3.h = true;
                    arrayList3.add(twVar3);
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
                        tw twVar4 = new tw();
                        twVar4.f38400b = tL_messages_stickerSet3.set;
                        twVar4.f38401c = new ArrayList(arrayList5);
                        twVar4.f38402e = true;
                        twVar4.f38403f = b02.B0(tL_messages_stickerSet3.set.f26980id, true);
                        twVar4.f38404g = false;
                        twVar4.h = true;
                        arrayList3.add(twVar4);
                    }
                    if (arrayList6.size() > 0) {
                        tw twVar5 = new tw();
                        twVar5.f38400b = tL_messages_stickerSet3.set;
                        twVar5.f38401c = new ArrayList(arrayList6);
                        twVar5.f38402e = false;
                        twVar5.f38403f = b02.B0(tL_messages_stickerSet3.set.f26980id, true);
                        twVar5.f38404g = false;
                        twVar5.h = arrayList2.contains(Long.valueOf(twVar5.f38400b.f26980id));
                        arrayList3.add(twVar5);
                    }
                }
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i15);
                tw twVar6 = new tw();
                twVar6.f38403f = b02.B0(stickerSetCovered.set.f26980id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                twVar6.f38400b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    twVar6.f38401c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet l02 = b02.l0(org.telegram.messenger.ui.Z(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (l02 != null) {
                        twVar6.f38401c = l02.documents;
                    } else {
                        twVar6.d = org.telegram.messenger.ui.Z(stickerSetCovered.set);
                    }
                } else {
                    twVar6.f38401c = stickerSetCovered.covers;
                }
                ArrayList arrayList7 = twVar6.f38401c;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < twVar6.f38401c.size()) {
                            if (!org.telegram.messenger.ij.n3((TLRPC.Document) twVar6.f38401c.get(i16))) {
                                z11 = true;
                                break;
                            }
                            i16++;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    twVar6.f38402e = !z11;
                    twVar6.h = arrayList2.contains(Long.valueOf(twVar6.f38400b.f26980id));
                    twVar6.f38404g = true;
                    arrayList3.add(twVar6);
                }
            }
            kw kwVar = gyVar.I;
            if (kwVar != null) {
                kwVar.p(gyVar.getEmojipacks());
            }
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pw.H():void");
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
        if (i7 == this.f37077c || i7 == this.f37079f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.f37081r;
        if (sparseIntArray.indexOfKey(i7) >= 0) {
            int i10 = sparseIntArray.get(i7);
            char[] cArr = org.telegram.messenger.j6.f23482a;
            if (i10 < 8) {
                return 1;
            }
            return 5;
        } else if (this.F.f34034d0 && i7 == 0) {
            return 2;
        } else {
            if (this.f37083w.indexOfKey(i7) >= 0) {
                return 3;
            }
            if (this.f37084x.indexOfKey(i7) >= 0) {
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
        tw twVar;
        int i11 = i7;
        gy gyVar = this.F;
        String[] strArr = gyVar.f34024a1;
        gw gwVar = gyVar.Q;
        int i12 = gyVar.f34032c1;
        ArrayList arrayList = gyVar.f34073q1;
        int i13 = d1Var.f56955f;
        View view = d1Var.f56951a;
        int i14 = 8;
        boolean z9 = true;
        tw twVar2 = null;
        if (i13 != 0) {
            SparseIntArray sparseIntArray = this.f37081r;
            if (i13 != 1) {
                if (i13 != 5) {
                    if (i13 == 6) {
                        vw vwVar = (vw) view;
                        int i15 = this.f37084x.get(i11);
                        int i16 = gwVar.J * 3;
                        if (i15 >= 0 && i15 < arrayList.size()) {
                            twVar2 = (tw) arrayList.get(i15);
                        }
                        if (twVar2 != null) {
                            vwVar.f39715a.setText("+" + ((twVar2.f38401c.size() - i16) + 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                xw xwVar = (xw) view;
                int length = sparseIntArray.get(i11) - strArr.length;
                tw twVar3 = (tw) arrayList.get(length);
                int i17 = length - 1;
                if (i17 >= 0) {
                    twVar = (tw) arrayList.get(i17);
                } else {
                    twVar = null;
                }
                if (twVar3 == null || !twVar3.f38404g || (twVar != null && !twVar.f38402e && twVar.f38403f && !org.telegram.messenger.p10.i(i12).q())) {
                    z9 = false;
                }
                if (twVar3 != null && twVar3.d != null) {
                    org.telegram.messenger.ui.b0(i12).m0(twVar3.d, false);
                    twVar3.d = null;
                }
                ug.p0 p0Var = xwVar.f40463r;
                if (twVar3 != null) {
                    xwVar.f40466x = twVar3;
                    xwVar.f40467y = z9;
                    xwVar.d.l(twVar3.f38400b.title, false);
                    TextView textView = xwVar.f40460e;
                    if (twVar3.f38405i) {
                        i14 = 0;
                    }
                    textView.setVisibility(i14);
                    if (twVar3.f38403f && !twVar3.f38400b.official) {
                        p0Var.b(org.telegram.messenger.hd.M0(2131746083, null), new ww(xwVar, 5), false);
                    } else {
                        p0Var.b(org.telegram.messenger.hd.M0(2131743877, null), new ww(xwVar, 6), false);
                    }
                    xwVar.a(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            j8Var.getClass();
            int i18 = sparseIntArray.get(i11);
            if (i11 == this.f37077c) {
                j8Var.b(org.telegram.messenger.hd.M0(2131750836, null), 2131232096, org.telegram.messenger.hd.M0(2131754899, null), 0, 0);
                return;
            } else if (i11 == this.f37079f) {
                j8Var.a(0, org.telegram.messenger.hd.M0(2131746360, null));
                return;
            } else if (i18 >= strArr.length) {
                try {
                    j8Var.a(0, ((tw) arrayList.get(i18 - strArr.length)).f38400b.title);
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
        px pxVar = (px) view;
        pxVar.f37088a = i11;
        pxVar.f37091e = null;
        if (gyVar.f34034d0) {
            i11--;
        }
        if (this.f37079f >= 0) {
            i11--;
        }
        if (this.d >= 0) {
            i11 -= 2;
        }
        int size = gyVar.getRecentEmoji().size();
        if (i11 < size) {
            String str3 = gyVar.getRecentEmoji().get(i11);
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
                String[][] strArr2 = org.telegram.messenger.j6.f23486f;
                if (i19 < 8) {
                    String[] strArr3 = strArr2[i19];
                    int length2 = strArr3.length + 1;
                    int i20 = (i11 - size) - 1;
                    if (i20 >= 0 && i11 < size + length2) {
                        String str4 = strArr3[i20];
                        String str5 = (String) org.telegram.messenger.i6.f23069j.get(str4);
                        if (str5 != null) {
                            str = gy.g(str4, str5);
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
                int i21 = gwVar.J * 3;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f37085y;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    tw twVar4 = (tw) arrayList.get(i22);
                    int intValue = ((Integer) arrayList2.get(i22)).intValue() + 1;
                    if ((twVar4.f38403f && !twVar4.f38404g && (twVar4.f38402e || q10)) || twVar4.h) {
                        min = twVar4.f38401c.size();
                    } else {
                        min = Math.min(i21, twVar4.f38401c.size());
                    }
                    int i23 = pxVar.f37088a;
                    if (i23 >= intValue && (i10 = i23 - intValue) < min) {
                        pxVar.f37091e = twVar4;
                        TLRPC.Document document2 = (TLRPC.Document) twVar4.f38401c.get(i10);
                        if (document2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(document2.f26959id);
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
            pxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        } else {
            pxVar.setPadding(0, 0, 0, 0);
        }
        if (l10 != null) {
            pxVar.a(null, z9);
            if (pxVar.getSpan() == null || pxVar.getSpan().getDocumentId() != l10.longValue()) {
                if (document != null) {
                    pxVar.setSpan(new r5(document, (Paint.FontMetricsInt) null));
                } else {
                    pxVar.setSpan(new r5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            pxVar.a(org.telegram.messenger.i6.f(str), z9);
            pxVar.setSpan(null);
        }
        pxVar.setTag(str2);
        pxVar.setContentDescription(str);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.j8 j8Var;
        gy gyVar = this.F;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                View view = new View(gyVar.getContext());
                                view.setLayoutParams(new v4.o0(-1, gyVar.f34028b1));
                                j8Var = view;
                            } else {
                                Context context = gyVar.getContext();
                                org.telegram.ui.ActionBar.f6 f6Var = gyVar.Z1;
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f39715a = textView;
                                textView.setTextSize(1, 13.0f);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27849d6, f6Var);
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
                            j8Var = new xw(gyVar, gyVar.getContext());
                        }
                    } else {
                        Context context2 = gyVar.getContext();
                        ey eyVar = new ey(gyVar, true);
                        gyVar.T = eyVar;
                        bi.q1 q1Var = new bi.q1(gyVar, context2, eyVar);
                        q1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
                        q1Var.setClipToPadding(false);
                        q1Var.i(new di.k(6));
                        q1Var.setOnItemClickListener(new k(this, 5));
                        j8Var = q1Var;
                    }
                } else {
                    j8Var = new uw(gyVar, gyVar.getContext());
                }
            } else {
                org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(gyVar.getContext(), true, false, gyVar.Z1, gyVar.f34052i2);
                j8Var2.setOnIconClickListener(new h0(this, 13));
                j8Var = j8Var2;
            }
        } else {
            j8Var = new px(gyVar.getContext());
        }
        return new v4.d1(j8Var);
    }
}
