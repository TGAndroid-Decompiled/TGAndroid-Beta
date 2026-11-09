package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
public final class s2 {
    public final t2 f30260a;
    public int f30261b;
    public int f30262c;
    public boolean d;
    public boolean f30263e;
    public HashMap f30264f;
    public CharSequence f30265g;

    public s2(t2 t2Var) {
        this.f30260a = t2Var;
    }

    public static void a(s2 s2Var, int i7, ij ijVar, TLRPC.Chat chat) {
        int i10;
        int i11;
        long j3;
        boolean z9;
        int i12;
        boolean z10;
        s2Var.getClass();
        if (ijVar != null && chat != null) {
            i10 = ijVar.e1();
        } else {
            i10 = 0;
        }
        if (s2Var.f30261b != i10 || s2Var.f30263e) {
            s2Var.f30264f = null;
            s2Var.f30262c = 0;
            s2Var.d = false;
            s2Var.f30263e = false;
            s2Var.f30261b = i10;
            TextPaint textPaint = org.telegram.ui.ActionBar.l6.F0[0];
            if (chat != null) {
                ArrayList l10 = qp.s1(i7).f24877q7.l(chat.f26956id);
                boolean z11 = true;
                if (l10 != null && !l10.isEmpty()) {
                    ArrayList arrayList = new ArrayList(l10);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(14)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (ijVar != null && !org.telegram.messenger.t3.p0(chat)) {
                        j3 = ij.b2(i7, ijVar.f23262k, true, false);
                        TLRPC.TL_forumTopic f10 = qp.s1(i7).f24877q7.f(chat.f26956id, j3);
                        if (f10 != null) {
                            CharSequence j10 = qg.d.j(f10, textPaint, null);
                            spannableStringBuilder.append(j10);
                            if (f10.unread_count > 0) {
                                i12 = j10.length();
                            } else {
                                i12 = 0;
                            }
                            s2Var.f30262c = j10.length();
                            if (ijVar.P3()) {
                                s2Var.d = false;
                            } else {
                                if (f10.unread_count > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                s2Var.d = z10;
                            }
                        } else {
                            s2Var.d = false;
                            i12 = 0;
                        }
                        if (s2Var.d) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new r2(org.telegram.messenger.g0.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else {
                        j3 = 0;
                        z9 = false;
                        i12 = 0;
                    }
                    if (org.telegram.messenger.t3.p0(chat)) {
                        s2Var.f30264f = new HashMap();
                        for (int i13 = 0; i13 < Math.min(4, arrayList.size()); i13++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long o4 = org.telegram.messenger.m5.o(((TLRPC.TL_forumTopic) arrayList.get(i13)).from_id);
                            org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i7, s2Var.f30260a);
                            f5Var.h = false;
                            f5Var.c(o4);
                            s2Var.f30264f.put(Long.valueOf(o4), f5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.m5.l(p10.f24470s0, o4));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(f5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i14 = 0;
                        for (int i15 = 4; i14 < Math.min(i15, arrayList.size()); i15 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i14)).f27008id != j3) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z11 && z9) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(qg.d.j((TLRPC.ForumTopic) arrayList.get(i14), textPaint, null));
                                z11 = false;
                            }
                            i14++;
                        }
                    }
                    if (i12 > 0) {
                        Typeface o10 = org.telegram.messenger.g0.o();
                        int i16 = org.telegram.ui.ActionBar.l6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f38910a = o10;
                        metricAffectingSpan.f38912c = i16;
                        metricAffectingSpan.f38911b = org.telegram.ui.ActionBar.l6.v0(i16);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i12 + 2), 0);
                    }
                    s2Var.f30265g = spannableStringBuilder;
                } else if (!qp.s1(i7).f24877q7.e(chat.f26956id)) {
                    qp.s1(i7).f24877q7.n(0, chat.f26956id, true);
                    s2Var.f30265g = id.M0(2131748779, null);
                    s2Var.f30263e = true;
                } else {
                    if (org.telegram.messenger.t3.p0(chat)) {
                        i11 = 2131748190;
                    } else {
                        i11 = 2131748137;
                    }
                    s2Var.f30265g = id.M0(i11, null);
                }
            }
        }
    }
}
