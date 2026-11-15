package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class oq implements Runnable {
    public final int E;
    public final a2 F;
    public final org.telegram.ui.ActionBar.u2 G;
    public final boolean[] f38038a;
    public final int[] f38039b;
    public final ci.p0 f38040c;
    public final String[] d;
    public final hi.d f38041e;
    public final org.telegram.ui.Cells.k3 f38042f;
    public final TreeSet h;
    public final yf f38043n;
    public final org.telegram.ui.Cells.y8 f38044r;
    public final org.telegram.ui.ActionBar.e6 f38045s;
    public final int[] f38046w;
    public final Runnable[] f38047x;
    public final int[] f38048y;

    public oq(boolean[] zArr, int[] iArr, ci.p0 p0Var, String[] strArr, hi.d dVar, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, yf yfVar, org.telegram.ui.Cells.y8 y8Var, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, a2 a2Var, org.telegram.ui.ActionBar.u2 u2Var) {
        this.f38038a = zArr;
        this.f38039b = iArr;
        this.f38040c = p0Var;
        this.d = strArr;
        this.f38041e = dVar;
        this.f38042f = k3Var;
        this.h = treeSet;
        this.f38043n = yfVar;
        this.f38044r = y8Var;
        this.f38045s = e6Var;
        this.f38046w = iArr2;
        this.f38047x = runnableArr;
        this.f38048y = iArr3;
        this.E = i7;
        this.F = a2Var;
        this.G = u2Var;
    }

    @Override
    public final void run() {
        int i7;
        final boolean[] zArr = this.f38038a;
        if (!zArr[0] && this.f38039b[0] < 0) {
            this.f38040c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final hi.d dVar = this.f38041e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f38042f.getText().toString();
            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
            String str = "bot";
            boolean a10 = sq.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            m10.append((a10 || sq.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = m10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final yf yfVar = this.f38043n;
            if (isEmpty) {
                yfVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.y8 y8Var = this.f38044r;
            final org.telegram.ui.ActionBar.e6 e6Var = this.f38045s;
            if (length >= 4 && sb2.length() <= 32) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131743666, null));
                org.telegram.ui.ActionBar.q6.U(y8Var.getTextView(), org.telegram.ui.ActionBar.j6.B6, e6Var);
                final int[] iArr = this.f38046w;
                final int i10 = iArr[0];
                final Runnable[] runnableArr = this.f38047x;
                final int[] iArr2 = this.f38048y;
                final int i11 = this.E;
                final a2 a2Var = this.F;
                final org.telegram.ui.ActionBar.u2 u2Var = this.G;
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
                                final yf yfVar2 = yfVar;
                                final TreeSet treeSet2 = treeSet;
                                final a2 a2Var2 = a2Var;
                                final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                final org.telegram.ui.Cells.y8 y8Var2 = y8Var;
                                final org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.s10() {
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
                                                    yfVar2.run();
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
                                                a2 a2Var3 = a2Var2;
                                                org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                                CharSequence d = sq.d(i15, str4, treeSet3, str5, a2Var3, e6Var3);
                                                if (d != null) {
                                                    M0 = d;
                                                } else {
                                                    M0 = org.telegram.messenger.hd.M0(2131751727, null);
                                                }
                                                org.telegram.ui.Cells.y8 y8Var3 = y8Var2;
                                                y8Var3.setText(M0);
                                                org.telegram.ui.ActionBar.q6.U(y8Var3.getTextView(), org.telegram.ui.ActionBar.j6.f29090q7, e6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.y0.q(u2Var2.F, e6Var3, tL_error, false);
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
            y8Var.setText(org.telegram.messenger.hd.M0(i7, null));
            org.telegram.ui.ActionBar.q6.U(y8Var.getTextView(), org.telegram.ui.ActionBar.j6.f29090q7, e6Var);
        }
    }
}
