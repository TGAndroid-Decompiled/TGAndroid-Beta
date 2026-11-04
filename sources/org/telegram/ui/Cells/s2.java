package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
public final class s2 {
    public final t2 f30329a;
    public int f30330b;
    public int f30331c;
    public boolean d;
    public boolean f30332e;
    public HashMap f30333f;
    public CharSequence f30334g;

    public s2(t2 t2Var) {
        this.f30329a = t2Var;
    }

    public static void a(s2 s2Var, int i3, zi ziVar, TLRPC.Chat chat) {
        int i10;
        int i11;
        long j10;
        boolean z10;
        int i12;
        boolean z11;
        s2Var.getClass();
        if (ziVar != null && chat != null) {
            i10 = ziVar.f1();
        } else {
            i10 = 0;
        }
        if (s2Var.f30330b != i10 || s2Var.f30332e) {
            s2Var.f30333f = null;
            s2Var.f30331c = 0;
            s2Var.d = false;
            s2Var.f30332e = false;
            s2Var.f30330b = i10;
            TextPaint textPaint = org.telegram.ui.ActionBar.k6.F0[0];
            if (chat != null) {
                ArrayList l10 = hp.s1(i3).f23102q7.l(chat.f27001id);
                boolean z12 = true;
                if (l10 != null && !l10.isEmpty()) {
                    ArrayList arrayList = new ArrayList(l10);
                    Collections.sort(arrayList, Comparator$CC.comparingInt(new cg.d(14)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (ziVar != null && !org.telegram.messenger.t3.p0(chat)) {
                        j10 = zi.c2(i3, ziVar.f26868k, true, false);
                        TLRPC.TL_forumTopic f10 = hp.s1(i3).f23102q7.f(chat.f27001id, j10);
                        if (f10 != null) {
                            CharSequence j11 = rg.c.j(f10, textPaint, null);
                            spannableStringBuilder.append(j11);
                            if (f10.unread_count > 0) {
                                i12 = j11.length();
                            } else {
                                i12 = 0;
                            }
                            s2Var.f30331c = j11.length();
                            if (ziVar.Q3()) {
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
                        j10 = 0;
                        z10 = false;
                        i12 = 0;
                    }
                    if (org.telegram.messenger.t3.p0(chat)) {
                        s2Var.f30333f = new HashMap();
                        for (int i13 = 0; i13 < Math.min(4, arrayList.size()); i13++) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            long o10 = org.telegram.messenger.m5.o(((TLRPC.TL_forumTopic) arrayList.get(i13)).from_id);
                            org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(i3, s2Var.f30329a);
                            h5Var.h = false;
                            h5Var.c(o10);
                            s2Var.f30333f.put(Long.valueOf(o10), h5Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.m5.l(h10.f22829t0, o10));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(h5Var, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                        }
                    } else {
                        int i14 = 0;
                        for (int i15 = 4; i14 < Math.min(i15, arrayList.size()); i15 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList.get(i14)).f27053id != j10) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z12 && z10) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(rg.c.j((TLRPC.ForumTopic) arrayList.get(i14), textPaint, null));
                                z12 = false;
                            }
                            i14++;
                        }
                    }
                    if (i12 > 0) {
                        Typeface o11 = org.telegram.messenger.g0.o();
                        int i16 = org.telegram.ui.ActionBar.k6.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.f36687a = o11;
                        metricAffectingSpan.f36689c = i16;
                        metricAffectingSpan.f36688b = org.telegram.ui.ActionBar.k6.v0(i16);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i12 + 2), 0);
                    }
                    s2Var.f30334g = spannableStringBuilder;
                } else if (!hp.s1(i3).f23102q7.e(chat.f27001id)) {
                    hp.s1(i3).f23102q7.n(0, chat.f27001id, true);
                    s2Var.f30334g = bd.M0(2131748787, null);
                    s2Var.f30332e = true;
                } else {
                    if (org.telegram.messenger.t3.p0(chat)) {
                        i11 = 2131748198;
                    } else {
                        i11 = 2131748145;
                    }
                    s2Var.f30334g = bd.M0(i11, null);
                }
            }
        }
    }
}
