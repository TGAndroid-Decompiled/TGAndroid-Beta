package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class hq implements Runnable {
    public final int D;
    public final r2 E;
    public final org.telegram.ui.ActionBar.v2 F;
    public final boolean[] f34354a;
    public final int[] f34355b;
    public final ai.a1 f34356c;
    public final String[] d;
    public final fi.d f34357e;
    public final org.telegram.ui.Cells.k3 f34358f;
    public final TreeSet h;
    public final ng f34359n;
    public final org.telegram.ui.Cells.z8 f34360r;
    public final org.telegram.ui.ActionBar.g6 f34361s;
    public final int[] f34362w;
    public final Runnable[] f34363x;
    public final int[] f34364y;

    public hq(boolean[] zArr, int[] iArr, ai.a1 a1Var, String[] strArr, fi.d dVar, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, ng ngVar, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.ActionBar.g6 g6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, r2 r2Var, org.telegram.ui.ActionBar.v2 v2Var) {
        this.f34354a = zArr;
        this.f34355b = iArr;
        this.f34356c = a1Var;
        this.d = strArr;
        this.f34357e = dVar;
        this.f34358f = k3Var;
        this.h = treeSet;
        this.f34359n = ngVar;
        this.f34360r = z8Var;
        this.f34361s = g6Var;
        this.f34362w = iArr2;
        this.f34363x = runnableArr;
        this.f34364y = iArr3;
        this.D = i7;
        this.E = r2Var;
        this.F = v2Var;
    }

    @Override
    public final void run() {
        int i7;
        final boolean[] zArr = this.f34354a;
        if (!zArr[0] && this.f34355b[0] < 0) {
            this.f34356c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final fi.d dVar = this.f34357e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f34358f.getText().toString();
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(charSequence);
            String str = "bot";
            boolean a10 = lq.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            m10.append((a10 || lq.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = m10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final ng ngVar = this.f34359n;
            if (isEmpty) {
                ngVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.z8 z8Var = this.f34360r;
            final org.telegram.ui.ActionBar.g6 g6Var = this.f34361s;
            if (length >= 4 && sb2.length() <= 32) {
                z8Var.setText(org.telegram.messenger.id.M0(2131743666, null));
                org.telegram.ui.ActionBar.s6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.l6.B6, g6Var);
                final int[] iArr = this.f34362w;
                final int i10 = iArr[0];
                final Runnable[] runnableArr = this.f34363x;
                final int[] iArr2 = this.f34364y;
                final int i11 = this.D;
                final r2 r2Var = this.E;
                final org.telegram.ui.ActionBar.v2 v2Var = this.F;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        runnableArr[0] = null;
                        final boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            final int[] iArr3 = iArr;
                            int i12 = iArr3[0];
                            final int i13 = i10;
                            if (i13 == i12) {
                                TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                                final String str2 = sb2;
                                checkusername.username = str2;
                                final int i14 = i11;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
                                d3.b bVar = new d3.b(1);
                                final int[] iArr4 = iArr2;
                                final String[] strArr2 = strArr;
                                final fi.d dVar2 = dVar;
                                final ng ngVar2 = ngVar;
                                final TreeSet treeSet2 = treeSet;
                                final r2 r2Var2 = r2Var;
                                final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                final org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                                final org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.v10() {
                                    @Override
                                    public final void a(Object obj, Object obj2) {
                                        String str3;
                                        CharSequence M0;
                                        TLRPC.Bool bool = (TLRPC.Bool) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (!zArr2[0]) {
                                            if (i13 == iArr3[0]) {
                                                iArr4[0] = -1;
                                                boolean z9 = bool instanceof TLRPC.TL_boolTrue;
                                                String str4 = str2;
                                                fi.d dVar3 = dVar2;
                                                if (z9) {
                                                    strArr2[0] = str4;
                                                    dVar3.setEnabled(true);
                                                    ngVar2.run();
                                                    return;
                                                }
                                                if (tL_error == null) {
                                                    str3 = "USERNAME_OCCUPIED";
                                                } else {
                                                    str3 = tL_error.text;
                                                }
                                                String str5 = str3;
                                                int i15 = i14;
                                                TreeSet treeSet3 = treeSet2;
                                                r2 r2Var3 = r2Var2;
                                                org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                                                CharSequence d = lq.d(i15, str4, treeSet3, str5, r2Var3, g6Var3);
                                                if (d != null) {
                                                    M0 = d;
                                                } else {
                                                    M0 = org.telegram.messenger.id.M0(2131751727, null);
                                                }
                                                org.telegram.ui.Cells.z8 z8Var3 = z8Var2;
                                                z8Var3.setText(M0);
                                                org.telegram.ui.ActionBar.s6.U(z8Var3.getTextView(), org.telegram.ui.ActionBar.l6.f28106q7, g6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.f1.r(v2Var2.E, g6Var3, tL_error, false);
                                                }
                                            }
                                        }
                                    }
                                });
                            }
                        }
                    }
                };
                runnableArr[0] = runnable;
                org.telegram.messenger.g0.i3(runnable, 300L);
                return;
            }
            if (sb2.length() < 4) {
                i7 = 2131743654;
            } else {
                i7 = 2131743655;
            }
            z8Var.setText(org.telegram.messenger.id.M0(i7, null));
            org.telegram.ui.ActionBar.s6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.l6.f28106q7, g6Var);
        }
    }
}
