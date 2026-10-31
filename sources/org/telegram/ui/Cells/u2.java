package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
public final class u2 {
    public final v2 f23125a;
    public int f23126b;
    public int f23127c;
    public boolean d;
    public boolean e;
    public HashMap f23128f;
    public CharSequence f23129g;

    public u2(v2 v2Var) {
        this.f23125a = v2Var;
    }

    public static void a(u2 u2Var, int i10, jj jjVar, TLRPC.Chat chat) {
        int i11;
        int i12;
        long j10;
        boolean z10;
        int i13;
        boolean z11;
        u2Var.getClass();
        if (jjVar != null && chat != null) {
            i11 = jjVar.f1();
        } else {
            i11 = 0;
        }
        if (u2Var.f23126b != i11 || u2Var.e) {
            u2Var.f23128f = null;
            u2Var.f23127c = 0;
            u2Var.d = false;
            u2Var.e = false;
            u2Var.f23126b = i11;
            TextPaint textPaint = org.telegram.ui.ActionBar.t6.F0[0];
            if (chat != null) {
                ArrayList l4 = vp.r1(i10).f18891r7.l(chat.f19793id);
                boolean z12 = true;
                if (l4 != null && !l4.isEmpty()) {
                    ArrayList arrayList = new ArrayList(l4);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new bi.t6(5)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (jjVar != null && !org.telegram.messenger.w3.p0(chat)) {
                        j10 = jj.c2(i10, jjVar.f16337k, true, false);
                        TLRPC.TL_forumTopic f7 = vp.r1(i10).f18891r7.f(chat.f19793id, j10);
                        if (f7 != null) {
                            CharSequence j11 = gg.e.j(f7, textPaint, null);
                            spannableStringBuilder.append(j11);
                            if (f7.unread_count > 0) {
                                i13 = j11.length();
                            } else {
                                i13 = 0;
                            }
                            u2Var.f23127c = j11.length();
                            if (jjVar.P3()) {
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
                        u2Var.f23128f = new HashMap();
                        for (int i14 = 0; i14 < Math.min(4, arrayList.size()); i14++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long o10 = org.telegram.messenger.o5.o(((TLRPC.TL_forumTopic) arrayList.get(i14)).from_id);
                            org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(i10, u2Var.f23125a);
                            e5Var.h = false;
                            e5Var.c(o10);
                            u2Var.f23128f.put(Long.valueOf(o10), e5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.o5.l(d20.f15147s0, o10));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(e5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i15 = 0;
                        for (int i16 = 4; i15 < Math.min(i16, arrayList.size()); i16 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i15)).f19845id != j10) {
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
                        metricAffectingSpan.f32348a = o11;
                        metricAffectingSpan.f32350c = i17;
                        metricAffectingSpan.f32349b = org.telegram.ui.ActionBar.t6.v0(i17);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i13 + 2), 0);
                    }
                    u2Var.f23129g = spannableStringBuilder;
                } else if (!vp.r1(i10).f18891r7.e(chat.f19793id)) {
                    vp.r1(i10).f18891r7.n(0, chat.f19793id, true);
                    u2Var.f23129g = cd.L0(2131748789, null);
                    u2Var.e = true;
                } else {
                    if (org.telegram.messenger.w3.p0(chat)) {
                        i12 = 2131748207;
                    } else {
                        i12 = 2131748153;
                    }
                    u2Var.f23129g = cd.L0(i12, null);
                }
            }
        }
    }
}
