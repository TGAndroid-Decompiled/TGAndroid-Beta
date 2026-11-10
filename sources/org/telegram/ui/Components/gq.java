package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class gq implements Runnable {
    public final int D;
    public final q2 E;
    public final org.telegram.ui.ActionBar.w2 F;
    public final boolean[] f33955a;
    public final int[] f33956b;
    public final ai.a1 f33957c;
    public final String[] d;
    public final fi.d f33958e;
    public final org.telegram.ui.Cells.k3 f33959f;
    public final TreeSet h;
    public final mg f33960n;
    public final org.telegram.ui.Cells.z8 f33961r;
    public final org.telegram.ui.ActionBar.h6 f33962s;
    public final int[] f33963w;
    public final Runnable[] f33964x;
    public final int[] f33965y;

    public gq(boolean[] zArr, int[] iArr, ai.a1 a1Var, String[] strArr, fi.d dVar, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, mg mgVar, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.ActionBar.h6 h6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, q2 q2Var, org.telegram.ui.ActionBar.w2 w2Var) {
        this.f33955a = zArr;
        this.f33956b = iArr;
        this.f33957c = a1Var;
        this.d = strArr;
        this.f33958e = dVar;
        this.f33959f = k3Var;
        this.h = treeSet;
        this.f33960n = mgVar;
        this.f33961r = z8Var;
        this.f33962s = h6Var;
        this.f33963w = iArr2;
        this.f33964x = runnableArr;
        this.f33965y = iArr3;
        this.D = i7;
        this.E = q2Var;
        this.F = w2Var;
    }

    @Override
    public final void run() {
        int i7;
        final boolean[] zArr = this.f33955a;
        if (!zArr[0] && this.f33956b[0] < 0) {
            this.f33957c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final fi.d dVar = this.f33958e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f33959f.getText().toString();
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(charSequence);
            String str = "bot";
            boolean a10 = kq.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            m10.append((a10 || kq.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = m10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final mg mgVar = this.f33960n;
            if (isEmpty) {
                mgVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.z8 z8Var = this.f33961r;
            final org.telegram.ui.ActionBar.h6 h6Var = this.f33962s;
            if (length >= 4 && sb2.length() <= 32) {
                z8Var.setText(org.telegram.messenger.id.M0(2131743666, null));
                org.telegram.ui.ActionBar.t6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.m6.B6, h6Var);
                final int[] iArr = this.f33963w;
                final int i10 = iArr[0];
                final Runnable[] runnableArr = this.f33964x;
                final int[] iArr2 = this.f33965y;
                final int i11 = this.D;
                final q2 q2Var = this.E;
                final org.telegram.ui.ActionBar.w2 w2Var = this.F;
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
                                final mg mgVar2 = mgVar;
                                final TreeSet treeSet2 = treeSet;
                                final q2 q2Var2 = q2Var;
                                final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                final org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                                final org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
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
                                                    mgVar2.run();
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
                                                q2 q2Var3 = q2Var2;
                                                org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                                                CharSequence d = kq.d(i15, str4, treeSet3, str5, q2Var3, h6Var3);
                                                if (d != null) {
                                                    M0 = d;
                                                } else {
                                                    M0 = org.telegram.messenger.id.M0(2131751727, null);
                                                }
                                                org.telegram.ui.Cells.z8 z8Var3 = z8Var2;
                                                z8Var3.setText(M0);
                                                org.telegram.ui.ActionBar.t6.U(z8Var3.getTextView(), org.telegram.ui.ActionBar.m6.f28131q7, h6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.f1.r(w2Var2.E, h6Var3, tL_error, false);
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
            org.telegram.ui.ActionBar.t6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.m6.f28131q7, h6Var);
        }
    }
}
