package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class uq implements Runnable {
    public final int E;
    public final org.telegram.ui.ii F;
    public final org.telegram.ui.ActionBar.w2 G;
    public final boolean[] f40430a;
    public final int[] f40431b;
    public final ai.x0 f40432c;
    public final String[] d;
    public final hi.e f40433e;
    public final org.telegram.ui.Cells.l3 f40434f;
    public final TreeSet h;
    public final org.telegram.ui.Cells.fa f40435n;
    public final org.telegram.ui.Cells.z8 f40436r;
    public final org.telegram.ui.ActionBar.i6 f40437s;
    public final int[] f40438w;
    public final Runnable[] f40439x;
    public final int[] f40440y;

    public uq(boolean[] zArr, int[] iArr, ai.x0 x0Var, String[] strArr, hi.e eVar, org.telegram.ui.Cells.l3 l3Var, TreeSet treeSet, org.telegram.ui.Cells.fa faVar, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.ActionBar.i6 i6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.w2 w2Var) {
        this.f40430a = zArr;
        this.f40431b = iArr;
        this.f40432c = x0Var;
        this.d = strArr;
        this.f40433e = eVar;
        this.f40434f = l3Var;
        this.h = treeSet;
        this.f40435n = faVar;
        this.f40436r = z8Var;
        this.f40437s = i6Var;
        this.f40438w = iArr2;
        this.f40439x = runnableArr;
        this.f40440y = iArr3;
        this.E = i7;
        this.F = iiVar;
        this.G = w2Var;
    }

    @Override
    public final void run() {
        int i7;
        final boolean[] zArr = this.f40430a;
        if (!zArr[0] && this.f40431b[0] < 0) {
            this.f40432c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final hi.e eVar = this.f40433e;
            eVar.setLoading(false);
            eVar.setEnabled(false);
            String charSequence = this.f40434f.getText().toString();
            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
            String str = "bot";
            boolean a10 = yq.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            m10.append((a10 || yq.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = m10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final org.telegram.ui.Cells.fa faVar = this.f40435n;
            if (isEmpty) {
                faVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.z8 z8Var = this.f40436r;
            final org.telegram.ui.ActionBar.i6 i6Var = this.f40437s;
            if (length >= 4 && sb2.length() <= 32) {
                z8Var.setText(org.telegram.messenger.gd.N0(2131743419, null));
                org.telegram.ui.ActionBar.u6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.n6.B6, i6Var);
                final int[] iArr = this.f40438w;
                final int i10 = iArr[0];
                final Runnable[] runnableArr = this.f40439x;
                final int[] iArr2 = this.f40440y;
                final int i11 = this.E;
                final org.telegram.ui.ii iiVar = this.F;
                final org.telegram.ui.ActionBar.w2 w2Var = this.G;
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
                                final hi.e eVar2 = eVar;
                                final org.telegram.ui.Cells.fa faVar2 = faVar;
                                final TreeSet treeSet2 = treeSet;
                                final org.telegram.ui.ii iiVar2 = iiVar;
                                final org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                                final org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                                final org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.p10() {
                                    @Override
                                    public final void a(Object obj, Object obj2) {
                                        String str3;
                                        CharSequence N0;
                                        TLRPC.Bool bool = (TLRPC.Bool) obj;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                        if (!zArr2[0]) {
                                            if (i13 == iArr3[0]) {
                                                iArr4[0] = -1;
                                                boolean z10 = bool instanceof TLRPC.TL_boolTrue;
                                                String str4 = str2;
                                                hi.e eVar3 = eVar2;
                                                if (z10) {
                                                    strArr2[0] = str4;
                                                    eVar3.setEnabled(true);
                                                    faVar2.run();
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
                                                CharSequence d = yq.d(i15, str4, treeSet3, str5, iiVar3, i6Var3);
                                                if (d != null) {
                                                    N0 = d;
                                                } else {
                                                    N0 = org.telegram.messenger.gd.N0(2131751715, null);
                                                }
                                                org.telegram.ui.Cells.z8 z8Var3 = z8Var2;
                                                z8Var3.setText(N0);
                                                org.telegram.ui.ActionBar.u6.U(z8Var3.getTextView(), org.telegram.ui.ActionBar.n6.f29692q7, i6Var3);
                                                if (d == null && tL_error != null) {
                                                    eVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.c0.t(w2Var2.F, i6Var3, tL_error, false);
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
                i7 = 2131743407;
            } else {
                i7 = 2131743408;
            }
            z8Var.setText(org.telegram.messenger.gd.N0(i7, null));
            org.telegram.ui.ActionBar.u6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.n6.f29692q7, i6Var);
        }
    }
}
