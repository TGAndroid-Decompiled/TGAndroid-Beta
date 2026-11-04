package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class hq implements Runnable {
    public final int E;
    public final o2 F;
    public final org.telegram.ui.ActionBar.t2 G;
    public final boolean[] f34471a;
    public final int[] f34472b;
    public final bi.q0 f34473c;
    public final String[] d;
    public final gi.d f34474e;
    public final org.telegram.ui.Cells.k3 f34475f;
    public final TreeSet h;
    public final e7 f34476n;
    public final org.telegram.ui.Cells.y8 f34477r;
    public final org.telegram.ui.ActionBar.e6 f34478s;
    public final int[] f34479w;
    public final Runnable[] f34480x;
    public final int[] f34481y;

    public hq(boolean[] zArr, int[] iArr, bi.q0 q0Var, String[] strArr, gi.d dVar, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, e7 e7Var, org.telegram.ui.Cells.y8 y8Var, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i3, o2 o2Var, org.telegram.ui.ActionBar.t2 t2Var) {
        this.f34471a = zArr;
        this.f34472b = iArr;
        this.f34473c = q0Var;
        this.d = strArr;
        this.f34474e = dVar;
        this.f34475f = k3Var;
        this.h = treeSet;
        this.f34476n = e7Var;
        this.f34477r = y8Var;
        this.f34478s = e6Var;
        this.f34479w = iArr2;
        this.f34480x = runnableArr;
        this.f34481y = iArr3;
        this.E = i3;
        this.F = o2Var;
        this.G = t2Var;
    }

    @Override
    public final void run() {
        int i3;
        final boolean[] zArr = this.f34471a;
        if (!zArr[0] && this.f34472b[0] < 0) {
            this.f34473c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final gi.d dVar = this.f34474e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f34475f.getText().toString();
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(charSequence);
            String str = "bot";
            boolean a10 = lq.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            l10.append((a10 || lq.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = l10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final e7 e7Var = this.f34476n;
            if (isEmpty) {
                e7Var.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.y8 y8Var = this.f34477r;
            final org.telegram.ui.ActionBar.e6 e6Var = this.f34478s;
            if (length >= 4 && sb2.length() <= 32) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131743676, null));
                org.telegram.ui.ActionBar.r6.V(y8Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, e6Var);
                final int[] iArr = this.f34479w;
                final int i10 = iArr[0];
                final Runnable[] runnableArr = this.f34480x;
                final int[] iArr2 = this.f34481y;
                final int i11 = this.E;
                final o2 o2Var = this.F;
                final org.telegram.ui.ActionBar.t2 t2Var = this.G;
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
                                c3.b bVar = new c3.b(1);
                                final int[] iArr4 = iArr2;
                                final String[] strArr2 = strArr;
                                final gi.d dVar2 = dVar;
                                final e7 e7Var2 = e7Var;
                                final TreeSet treeSet2 = treeSet;
                                final o2 o2Var2 = o2Var;
                                final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                final org.telegram.ui.Cells.y8 y8Var2 = y8Var;
                                final org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.n10() {
                                    @Override
                                    public final void a(Object obj, Object obj2) {
                                        String str3;
                                        CharSequence M0;
                                        TLRPC.Bool bool = (TLRPC.Bool) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (!zArr2[0]) {
                                            if (i13 == iArr3[0]) {
                                                iArr4[0] = -1;
                                                boolean z10 = bool instanceof TLRPC.TL_boolTrue;
                                                String str4 = str2;
                                                gi.d dVar3 = dVar2;
                                                if (z10) {
                                                    strArr2[0] = str4;
                                                    dVar3.setEnabled(true);
                                                    e7Var2.run();
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
                                                o2 o2Var3 = o2Var2;
                                                org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                                CharSequence d = lq.d(i15, str4, treeSet3, str5, o2Var3, e6Var3);
                                                if (d != null) {
                                                    M0 = d;
                                                } else {
                                                    M0 = org.telegram.messenger.bd.M0(2131751728, null);
                                                }
                                                org.telegram.ui.Cells.y8 y8Var3 = y8Var2;
                                                y8Var3.setText(M0);
                                                org.telegram.ui.ActionBar.r6.V(y8Var3.getTextView(), org.telegram.ui.ActionBar.k6.f28122q7, e6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.f1.v(t2Var2.F, e6Var3, tL_error, false);
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
                i3 = 2131743664;
            } else {
                i3 = 2131743665;
            }
            y8Var.setText(org.telegram.messenger.bd.M0(i3, null));
            org.telegram.ui.ActionBar.r6.V(y8Var.getTextView(), org.telegram.ui.ActionBar.k6.f28122q7, e6Var);
        }
    }
}
