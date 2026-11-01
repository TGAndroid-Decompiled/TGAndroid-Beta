package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
public final class u2 {
    public final v2 f23126a;
    public int f23127b;
    public int f23128c;
    public boolean d;
    public boolean e;
    public HashMap f23129f;
    public CharSequence f23130g;

    public u2(v2 v2Var) {
        this.f23126a = v2Var;
    }

    public static void a(u2 u2Var, int i10, kj kjVar, TLRPC.Chat chat) {
        int i11;
        int i12;
        long j10;
        boolean z10;
        int i13;
        boolean z11;
        u2Var.getClass();
        if (kjVar != null && chat != null) {
            i11 = kjVar.f1();
        } else {
            i11 = 0;
        }
        if (u2Var.f23127b != i11 || u2Var.e) {
            u2Var.f23129f = null;
            u2Var.f23128c = 0;
            u2Var.d = false;
            u2Var.e = false;
            u2Var.f23127b = i11;
            TextPaint textPaint = org.telegram.ui.ActionBar.t6.F0[0];
            if (chat != null) {
                ArrayList l4 = wp.r1(i10).f19234r7.l(chat.f19794id);
                boolean z12 = true;
                if (l4 != null && !l4.isEmpty()) {
                    ArrayList arrayList = new ArrayList(l4);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new bi.t6(5)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (kjVar != null && !org.telegram.messenger.w3.p0(chat)) {
                        j10 = kj.c2(i10, kjVar.f16690k, true, false);
                        TLRPC.TL_forumTopic f7 = wp.r1(i10).f19234r7.f(chat.f19794id, j10);
                        if (f7 != null) {
                            CharSequence j11 = gg.e.j(f7, textPaint, null);
                            spannableStringBuilder.append(j11);
                            if (f7.unread_count > 0) {
                                i13 = j11.length();
                            } else {
                                i13 = 0;
                            }
                            u2Var.f23128c = j11.length();
                            if (kjVar.P3()) {
                                u2Var.d = false;
                            } else {
                                if (f7.unread_count > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                u2Var.d = z11;
                            }
                        } else {
                            u2Var.d = false;
                            i13 = 0;
                        }
                        if (u2Var.d) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new t2(org.telegram.messenger.i0.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        j10 = 0;
                        z10 = false;
                        i13 = 0;
                    }
                    if (org.telegram.messenger.w3.p0(chat)) {
                        u2Var.f23129f = new HashMap();
                        for (int i14 = 0; i14 < Math.min(4, arrayList.size()); i14++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long o10 = org.telegram.messenger.o5.o(((TLRPC.TL_forumTopic) arrayList.get(i14)).from_id);
                            org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(i10, u2Var.f23126a);
                            e5Var.h = false;
                            e5Var.c(o10);
                            u2Var.f23129f.put(Long.valueOf(o10), e5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.o5.l(e20.f15506s0, o10));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(e5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i15 = 0;
                        for (int i16 = 4; i15 < Math.min(i16, arrayList.size()); i16 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i15)).f19846id != j10) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z12 && z10) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(gg.e.j((TLRPC.ForumTopic) arrayList.get(i15), textPaint, null));
                                z12 = false;
                            }
                            i15++;
                        }
                    }
                    if (i13 > 0) {
                        Typeface o11 = org.telegram.messenger.i0.o();
                        int i17 = org.telegram.ui.ActionBar.t6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f32720a = o11;
                        metricAffectingSpan.f32722c = i17;
                        metricAffectingSpan.f32721b = org.telegram.ui.ActionBar.t6.v0(i17);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i13 + 2), 0);
                    }
                    u2Var.f23130g = spannableStringBuilder;
                } else if (!wp.r1(i10).f19234r7.e(chat.f19794id)) {
                    wp.r1(i10).f19234r7.n(0, chat.f19794id, true);
                    u2Var.f23130g = dd.L0(2131748789, null);
                    u2Var.e = true;
                } else {
                    if (org.telegram.messenger.w3.p0(chat)) {
                        i12 = 2131748207;
                    } else {
                        i12 = 2131748153;
                    }
                    u2Var.f23130g = dd.L0(i12, null);
                }
            }
        }
    }
}
