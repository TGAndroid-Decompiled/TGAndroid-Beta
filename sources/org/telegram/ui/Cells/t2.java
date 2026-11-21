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
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class t2 {
    public final u2 f31851a;
    public int f31852b;
    public int f31853c;
    public boolean d;
    public boolean f31854e;
    public HashMap f31855f;
    public CharSequence f31856g;

    public t2(u2 u2Var) {
        this.f31851a = u2Var;
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
        if (t2Var.f31852b != i10 || t2Var.f31854e) {
            t2Var.f31855f = null;
            t2Var.f31853c = 0;
            t2Var.d = false;
            t2Var.f31854e = false;
            t2Var.f31852b = i10;
            TextPaint textPaint = org.telegram.ui.ActionBar.m6.F0[0];
            if (chat != null) {
                ArrayList l10 = mp.u1(i7).f25797t7.l(chat.f28431id);
                boolean z12 = true;
                if (l10 != null && !l10.isEmpty()) {
                    ArrayList arrayList = new ArrayList(l10);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(14)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (fjVar != null && !org.telegram.messenger.v3.p0(chat)) {
                        j3 = fj.b2(i7, fjVar.f23993k, true, false);
                        TLRPC.TL_forumTopic f10 = mp.u1(i7).f25797t7.f(chat.f28431id, j3);
                        if (f10 != null) {
                            CharSequence k10 = qg.c.k(f10, textPaint, null);
                            spannableStringBuilder.append(k10);
                            if (f10.unread_count > 0) {
                                i12 = k10.length();
                            } else {
                                i12 = 0;
                            }
                            t2Var.f31853c = k10.length();
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
                        t2Var.f31855f = new HashMap();
                        for (int i13 = 0; i13 < Math.min(4, arrayList.size()); i13++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long o4 = org.telegram.messenger.n5.o(((TLRPC.TL_forumTopic) arrayList.get(i13)).from_id);
                            org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i7, t2Var.f31851a);
                            f5Var.h = false;
                            f5Var.c(o4);
                            t2Var.f31855f.put(Long.valueOf(o4), f5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.n5.l(j10.f24798t0, o4));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(f5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i14 = 0;
                        for (int i15 = 4; i14 < Math.min(i15, arrayList.size()); i15 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i14)).f28483id != j3) {
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
                        int i16 = org.telegram.ui.ActionBar.m6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f37099a = o10;
                        metricAffectingSpan.f37101c = i16;
                        metricAffectingSpan.f37100b = org.telegram.ui.ActionBar.m6.v0(i16);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i12 + 2), 0);
                    }
                    t2Var.f31856g = spannableStringBuilder;
                } else if (!mp.u1(i7).f25797t7.e(chat.f28431id)) {
                    mp.u1(i7).f25797t7.n(0, chat.f28431id, true);
                    t2Var.f31856g = gd.N0(2131748586, null);
                    t2Var.f31854e = true;
                } else {
                    if (org.telegram.messenger.v3.p0(chat)) {
                        i11 = 2131747997;
                    } else {
                        i11 = 2131747944;
                    }
                    t2Var.f31856g = gd.N0(i11, null);
                }
            }
        }
    }
}
