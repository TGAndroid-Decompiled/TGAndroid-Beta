package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class t2 {
    public final u2 f31916a;
    public int f31917b;
    public int f31918c;
    public boolean d;
    public boolean f31919e;
    public HashMap f31920f;
    public CharSequence f31921g;

    public t2(u2 u2Var) {
        this.f31916a = u2Var;
    }

    public static void a(t2 t2Var, int i7, fj fjVar, TLRPC.Chat chat) {
        int i10;
        int i11;
        long j3;
        boolean z10;
        int i12;
        boolean z11;
        t2Var.getClass();
        if (fjVar != null && chat != null) {
            i10 = fjVar.e1();
        } else {
            i10 = 0;
        }
        if (t2Var.f31917b != i10 || t2Var.f31919e) {
            t2Var.f31920f = null;
            t2Var.f31918c = 0;
            t2Var.d = false;
            t2Var.f31919e = false;
            t2Var.f31917b = i10;
            TextPaint textPaint = org.telegram.ui.ActionBar.n6.F0[0];
            if (chat != null) {
                ArrayList l10 = mp.u1(i7).f25864t7.l(chat.f28492id);
                boolean z12 = true;
                if (l10 != null && !l10.isEmpty()) {
                    ArrayList arrayList = new ArrayList(l10);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(14)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (fjVar != null && !org.telegram.messenger.v3.p0(chat)) {
                        j3 = fj.b2(i7, fjVar.f24073k, true, false);
                        TLRPC.TL_forumTopic f10 = mp.u1(i7).f25864t7.f(chat.f28492id, j3);
                        if (f10 != null) {
                            CharSequence k10 = qg.c.k(f10, textPaint, null);
                            spannableStringBuilder.append(k10);
                            if (f10.unread_count > 0) {
                                i12 = k10.length();
                            } else {
                                i12 = 0;
                            }
                            t2Var.f31918c = k10.length();
                            if (fjVar.P3()) {
                                t2Var.d = false;
                            } else {
                                if (f10.unread_count > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                t2Var.d = z11;
                            }
                        } else {
                            t2Var.d = false;
                            i12 = 0;
                        }
                        if (t2Var.d) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new s2(org.telegram.messenger.g0.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        j3 = 0;
                        z10 = false;
                        i12 = 0;
                    }
                    if (org.telegram.messenger.v3.p0(chat)) {
                        t2Var.f31920f = new HashMap();
                        for (int i13 = 0; i13 < Math.min(4, arrayList.size()); i13++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long o4 = org.telegram.messenger.n5.o(((TLRPC.TL_forumTopic) arrayList.get(i13)).from_id);
                            org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i7, t2Var.f31916a);
                            f5Var.h = false;
                            f5Var.c(o4);
                            t2Var.f31920f.put(Long.valueOf(o4), f5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.n5.l(i10.f24637t0, o4));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(f5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i14 = 0;
                        for (int i15 = 4; i14 < Math.min(i15, arrayList.size()); i15 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i14)).f28544id != j3) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z12 && z10) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(qg.c.k((TLRPC.ForumTopic) arrayList.get(i14), textPaint, null));
                                z12 = false;
                            }
                            i14++;
                        }
                    }
                    if (i12 > 0) {
                        Typeface o10 = org.telegram.messenger.g0.o();
                        int i16 = org.telegram.ui.ActionBar.n6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f36644a = o10;
                        metricAffectingSpan.f36646c = i16;
                        metricAffectingSpan.f36645b = org.telegram.ui.ActionBar.n6.v0(i16);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i12 + 2), 0);
                    }
                    t2Var.f31921g = spannableStringBuilder;
                } else if (!mp.u1(i7).f25864t7.e(chat.f28492id)) {
                    mp.u1(i7).f25864t7.n(0, chat.f28492id, true);
                    t2Var.f31921g = gd.N0(2131748586, null);
                    t2Var.f31919e = true;
                } else {
                    if (org.telegram.messenger.v3.p0(chat)) {
                        i11 = 2131747997;
                    } else {
                        i11 = 2131747944;
                    }
                    t2Var.f31921g = gd.N0(i11, null);
                }
            }
        }
    }
}
