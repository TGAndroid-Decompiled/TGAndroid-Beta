package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class vq implements Runnable {
    public final int E;
    public final org.telegram.ui.ii F;
    public final org.telegram.ui.ActionBar.x2 G;
    public final boolean[] f41388a;
    public final int[] f41389b;
    public final bi.u4 f41390c;
    public final String[] d;
    public final hi.d f41391e;
    public final org.telegram.ui.Cells.k3 f41392f;
    public final TreeSet h;
    public final k7 f41393n;
    public final org.telegram.ui.Cells.z8 f41394r;
    public final org.telegram.ui.ActionBar.i6 f41395s;
    public final int[] f41396w;
    public final Runnable[] f41397x;
    public final int[] f41398y;

    public vq(boolean[] zArr, int[] iArr, bi.u4 u4Var, String[] strArr, hi.d dVar, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, k7 k7Var, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.ActionBar.i6 i6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.x2 x2Var) {
        this.f41388a = zArr;
        this.f41389b = iArr;
        this.f41390c = u4Var;
        this.d = strArr;
        this.f41391e = dVar;
        this.f41392f = k3Var;
        this.h = treeSet;
        this.f41393n = k7Var;
        this.f41394r = z8Var;
        this.f41395s = i6Var;
        this.f41396w = iArr2;
        this.f41397x = runnableArr;
        this.f41398y = iArr3;
        this.E = i7;
        this.F = iiVar;
        this.G = x2Var;
    }

    @Override
    public final void run() {
        int i7;
        final boolean[] zArr = this.f41388a;
        if (!zArr[0] && this.f41389b[0] < 0) {
            this.f41390c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final hi.d dVar = this.f41391e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f41392f.getText().toString();
            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
            String str = "bot";
            boolean a10 = zq.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            m10.append((a10 || zq.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = m10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final k7 k7Var = this.f41393n;
            if (isEmpty) {
                k7Var.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.z8 z8Var = this.f41394r;
            final org.telegram.ui.ActionBar.i6 i6Var = this.f41395s;
            if (length >= 4 && sb2.length() <= 32) {
                z8Var.setText(org.telegram.messenger.gd.M0(2131743429, null));
                org.telegram.ui.ActionBar.u6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.n6.B6, i6Var);
                final int[] iArr = this.f41396w;
                final int i10 = iArr[0];
                final Runnable[] runnableArr = this.f41397x;
                final int[] iArr2 = this.f41398y;
                final int i11 = this.E;
                final org.telegram.ui.ii iiVar = this.F;
                final org.telegram.ui.ActionBar.x2 x2Var = this.G;
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
                                final hi.d dVar2 = dVar;
                                final k7 k7Var2 = k7Var;
                                final TreeSet treeSet2 = treeSet;
                                final org.telegram.ui.ii iiVar2 = iiVar;
                                final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                                final org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                                final org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.q10() {
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
                                                hi.d dVar3 = dVar2;
                                                if (z10) {
                                                    strArr2[0] = str4;
                                                    dVar3.setEnabled(true);
                                                    k7Var2.run();
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
                                                org.telegram.ui.ii iiVar3 = iiVar2;
                                                org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                                CharSequence d = zq.d(i15, str4, treeSet3, str5, iiVar3, i6Var3);
                                                if (d != null) {
                                                    M0 = d;
                                                } else {
                                                    M0 = org.telegram.messenger.gd.M0(2131751716, null);
                                                }
                                                org.telegram.ui.Cells.z8 z8Var3 = z8Var2;
                                                z8Var3.setText(M0);
                                                org.telegram.ui.ActionBar.u6.U(z8Var3.getTextView(), org.telegram.ui.ActionBar.n6.f29637q7, i6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.c0.t(x2Var2.F, i6Var3, tL_error, false);
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
                org.telegram.messenger.g0.h3(runnable, 300L);
                return;
            }
            if (sb2.length() < 4) {
                i7 = 2131743417;
            } else {
                i7 = 2131743418;
            }
            z8Var.setText(org.telegram.messenger.gd.M0(i7, null));
            org.telegram.ui.ActionBar.u6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.n6.f29637q7, i6Var);
        }
    }
}
