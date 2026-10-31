package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class rq implements Runnable {
    public final int D;
    public final qq E;
    public final org.telegram.ui.ActionBar.z2 F;
    public final boolean[] f29994a;
    public final int[] f29995b;
    public final ag.g3 f29996c;
    public final String[] d;
    public final vh.d e;
    public final org.telegram.ui.Cells.m3 f29997f;
    public final TreeSet h;
    public final jg f29998n;
    public final org.telegram.ui.Cells.b9 f29999r;
    public final org.telegram.ui.ActionBar.p6 f30000s;
    public final int[] f30001w;
    public final Runnable[] f30002x;
    public final int[] f30003y;

    public rq(boolean[] zArr, int[] iArr, ag.g3 g3Var, String[] strArr, vh.d dVar, org.telegram.ui.Cells.m3 m3Var, TreeSet treeSet, jg jgVar, org.telegram.ui.Cells.b9 b9Var, org.telegram.ui.ActionBar.p6 p6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, qq qqVar, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f29994a = zArr;
        this.f29995b = iArr;
        this.f29996c = g3Var;
        this.d = strArr;
        this.e = dVar;
        this.f29997f = m3Var;
        this.h = treeSet;
        this.f29998n = jgVar;
        this.f29999r = b9Var;
        this.f30000s = p6Var;
        this.f30001w = iArr2;
        this.f30002x = runnableArr;
        this.f30003y = iArr3;
        this.D = i10;
        this.E = qqVar;
        this.F = z2Var;
    }

    @Override
    public final void run() {
        int i10;
        final boolean[] zArr = this.f29994a;
        if (!zArr[0] && this.f29995b[0] < 0) {
            this.f29996c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final vh.d dVar = this.e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f29997f.getText().toString();
            StringBuilder t10 = a1.g.t(charSequence);
            String str = "bot";
            boolean a2 = vq.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            t10.append((a2 || vq.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = t10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final jg jgVar = this.f29998n;
            if (isEmpty) {
                jgVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.b9 b9Var = this.f29999r;
            final org.telegram.ui.ActionBar.p6 p6Var = this.f30000s;
            if (length >= 4 && sb2.length() <= 32) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131743692, null));
                org.telegram.ui.ActionBar.a7.V(b9Var.getTextView(), org.telegram.ui.ActionBar.t6.B6, p6Var);
                final int[] iArr = this.f30001w;
                final int i11 = iArr[0];
                final Runnable[] runnableArr = this.f30002x;
                final int[] iArr2 = this.f30003y;
                final int i12 = this.D;
                final qq qqVar = this.E;
                final org.telegram.ui.ActionBar.z2 z2Var = this.F;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        runnableArr[0] = null;
                        final boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            final int[] iArr3 = iArr;
                            int i13 = iArr3[0];
                            final int i14 = i11;
                            if (i14 == i13) {
                                TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                                final String str2 = sb2;
                                checkusername.username = str2;
                                final int i15 = i12;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i15);
                                a3.b bVar = new a3.b(1);
                                final int[] iArr4 = iArr2;
                                final String[] strArr2 = strArr;
                                final vh.d dVar2 = dVar;
                                final jg jgVar2 = jgVar;
                                final TreeSet treeSet2 = treeSet;
                                final qq qqVar2 = qqVar;
                                final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                final org.telegram.ui.Cells.b9 b9Var2 = b9Var;
                                final org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.j20() {
                                    @Override
                                    public final void a(Object obj, Object obj2) {
                                        String str3;
                                        CharSequence L0;
                                        TLRPC.Bool bool = (TLRPC.Bool) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (!zArr2[0]) {
                                            if (i14 == iArr3[0]) {
                                                iArr4[0] = -1;
                                                boolean z10 = bool instanceof TLRPC.TL_boolTrue;
                                                String str4 = str2;
                                                vh.d dVar3 = dVar2;
                                                if (z10) {
                                                    strArr2[0] = str4;
                                                    dVar3.setEnabled(true);
                                                    jgVar2.run();
                                                    return;
                                                }
                                                if (tL_error == null) {
                                                    str3 = "USERNAME_OCCUPIED";
                                                } else {
                                                    str3 = tL_error.text;
                                                }
                                                String str5 = str3;
                                                int i16 = i15;
                                                TreeSet treeSet3 = treeSet2;
                                                qq qqVar3 = qqVar2;
                                                org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                                                CharSequence d = vq.d(i16, str4, treeSet3, str5, qqVar3, p6Var3);
                                                if (d != null) {
                                                    L0 = d;
                                                } else {
                                                    L0 = org.telegram.messenger.cd.L0(2131751728, null);
                                                }
                                                org.telegram.ui.Cells.b9 b9Var3 = b9Var2;
                                                b9Var3.setText(L0);
                                                org.telegram.ui.ActionBar.a7.V(b9Var3.getTextView(), org.telegram.ui.ActionBar.t6.f21170q7, p6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.f1.s(z2Var2.E, p6Var3, tL_error, false);
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
                org.telegram.messenger.i0.h3(runnable, 300L);
                return;
            }
            if (sb2.length() < 4) {
                i10 = 2131743680;
            } else {
                i10 = 2131743681;
            }
            b9Var.setText(org.telegram.messenger.cd.L0(i10, null));
            org.telegram.ui.ActionBar.a7.V(b9Var.getTextView(), org.telegram.ui.ActionBar.t6.f21170q7, p6Var);
        }
    }
}
