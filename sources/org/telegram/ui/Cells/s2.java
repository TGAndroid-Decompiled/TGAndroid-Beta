package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
public final class s2 {
    public final t2 f31405a;
    public int f31406b;
    public int f31407c;
    public boolean d;
    public boolean f31408e;
    public HashMap f31409f;
    public CharSequence f31410g;

    public s2(t2 t2Var) {
        this.f31405a = t2Var;
    }

    public static void a(s2 s2Var, int i7, gj gjVar, TLRPC.Chat chat) {
        int i10;
        int i11;
        long j3;
        boolean z10;
        int i12;
        boolean z11;
        s2Var.getClass();
        if (gjVar != null && chat != null) {
            i10 = gjVar.e1();
        } else {
            i10 = 0;
        }
        if (s2Var.f31406b != i10 || s2Var.f31408e) {
            s2Var.f31409f = null;
            s2Var.f31407c = 0;
            s2Var.d = false;
            s2Var.f31408e = false;
            s2Var.f31406b = i10;
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.F0[0];
            if (chat != null) {
                ArrayList l10 = np.s1(i7).f25383r7.l(chat.f28051id);
                boolean z12 = true;
                if (l10 != null && !l10.isEmpty()) {
                    ArrayList arrayList = new ArrayList(l10);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(14)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (gjVar != null && !org.telegram.messenger.t3.p0(chat)) {
                        j3 = gj.b2(i7, gjVar.f23817k, true, false);
                        TLRPC.TL_forumTopic f10 = np.s1(i7).f25383r7.f(chat.f28051id, j3);
                        if (f10 != null) {
                            CharSequence j10 = qg.c.j(f10, textPaint, null);
                            spannableStringBuilder.append(j10);
                            if (f10.unread_count > 0) {
                                i12 = j10.length();
                            } else {
                                i12 = 0;
                            }
                            s2Var.f31407c = j10.length();
                            if (gjVar.P3()) {
                                s2Var.d = false;
                            } else {
                                if (f10.unread_count > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                s2Var.d = z11;
                            }
                        } else {
                            s2Var.d = false;
                            i12 = 0;
                        }
                        if (s2Var.d) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new r2(org.telegram.messenger.g0.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        j3 = 0;
                        z10 = false;
                        i12 = 0;
                    }
                    if (org.telegram.messenger.t3.p0(chat)) {
                        s2Var.f31409f = new HashMap();
                        for (int i13 = 0; i13 < Math.min(4, arrayList.size()); i13++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long o4 = org.telegram.messenger.m5.o(((TLRPC.TL_forumTopic) arrayList.get(i13)).from_id);
                            org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i7, s2Var.f31405a);
                            f5Var.h = false;
                            f5Var.c(o4);
                            s2Var.f31409f.put(Long.valueOf(o4), f5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.m5.l(m10.f24934t0, o4));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(f5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i14 = 0;
                        for (int i15 = 4; i14 < Math.min(i15, arrayList.size()); i15 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i14)).f28103id != j3) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z12 && z10) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(qg.c.j((TLRPC.ForumTopic) arrayList.get(i14), textPaint, null));
                                z12 = false;
                            }
                            i14++;
                        }
                    }
                    if (i12 > 0) {
                        Typeface o10 = org.telegram.messenger.g0.o();
                        int i16 = org.telegram.ui.ActionBar.j6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f41864a = o10;
                        metricAffectingSpan.f41866c = i16;
                        metricAffectingSpan.f41865b = org.telegram.ui.ActionBar.j6.v0(i16);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i12 + 2), 0);
                    }
                    s2Var.f31410g = spannableStringBuilder;
                } else if (!np.s1(i7).f25383r7.e(chat.f28051id)) {
                    np.s1(i7).f25383r7.n(0, chat.f28051id, true);
                    s2Var.f31410g = hd.M0(2131748779, null);
                    s2Var.f31408e = true;
                } else {
                    if (org.telegram.messenger.t3.p0(chat)) {
                        i11 = 2131748190;
                    } else {
                        i11 = 2131748137;
                    }
                    s2Var.f31410g = hd.M0(i11, null);
                }
            }
        }
    }
}
