package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class xq implements Runnable {
    public final int E;
    public final org.telegram.ui.ii F;
    public final org.telegram.ui.ActionBar.w2 G;
    public final boolean[] f42167a;
    public final int[] f42168b;
    public final ai.w0 f42169c;
    public final String[] d;
    public final hi.d f42170e;
    public final org.telegram.ui.Cells.l3 f42171f;
    public final TreeSet h;
    public final g f42172n;
    public final org.telegram.ui.Cells.a9 f42173r;
    public final org.telegram.ui.ActionBar.h6 f42174s;
    public final int[] f42175w;
    public final Runnable[] f42176x;
    public final int[] f42177y;

    public xq(boolean[] zArr, int[] iArr, ai.w0 w0Var, String[] strArr, hi.d dVar, org.telegram.ui.Cells.l3 l3Var, TreeSet treeSet, g gVar, org.telegram.ui.Cells.a9 a9Var, org.telegram.ui.ActionBar.h6 h6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, org.telegram.ui.ii iiVar, org.telegram.ui.ActionBar.w2 w2Var) {
        this.f42167a = zArr;
        this.f42168b = iArr;
        this.f42169c = w0Var;
        this.d = strArr;
        this.f42170e = dVar;
        this.f42171f = l3Var;
        this.h = treeSet;
        this.f42172n = gVar;
        this.f42173r = a9Var;
        this.f42174s = h6Var;
        this.f42175w = iArr2;
        this.f42176x = runnableArr;
        this.f42177y = iArr3;
        this.E = i7;
        this.F = iiVar;
        this.G = w2Var;
    }

    @Override
    public final void run() {
        int i7;
        final boolean[] zArr = this.f42167a;
        if (!zArr[0] && this.f42168b[0] < 0) {
            this.f42169c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final hi.d dVar = this.f42170e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f42171f.getText().toString();
            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(charSequence);
            String str = "bot";
            boolean a10 = br.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            m10.append((a10 || br.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = m10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final g gVar = this.f42172n;
            if (isEmpty) {
                gVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.a9 a9Var = this.f42173r;
            final org.telegram.ui.ActionBar.h6 h6Var = this.f42174s;
            if (length >= 4 && sb2.length() <= 32) {
                a9Var.setText(org.telegram.messenger.hd.N0(2131743423, null));
                org.telegram.ui.ActionBar.t6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.m6.B6, h6Var);
                final int[] iArr = this.f42175w;
                final int i10 = iArr[0];
                final Runnable[] runnableArr = this.f42176x;
                final int[] iArr2 = this.f42177y;
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
                                final hi.d dVar2 = dVar;
                                final g gVar2 = gVar;
                                final TreeSet treeSet2 = treeSet;
                                final org.telegram.ui.ii iiVar2 = iiVar;
                                final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                final org.telegram.ui.Cells.a9 a9Var2 = a9Var;
                                final org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, bVar, new org.telegram.messenger.r10() {
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
                                                hi.d dVar3 = dVar2;
                                                if (z10) {
                                                    strArr2[0] = str4;
                                                    dVar3.setEnabled(true);
                                                    gVar2.run();
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
                                                org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                                                CharSequence d = br.d(i15, str4, treeSet3, str5, iiVar3, h6Var3);
                                                if (d != null) {
                                                    N0 = d;
                                                } else {
                                                    N0 = org.telegram.messenger.hd.N0(2131751715, null);
                                                }
                                                org.telegram.ui.Cells.a9 a9Var3 = a9Var2;
                                                a9Var3.setText(N0);
                                                org.telegram.ui.ActionBar.t6.U(a9Var3.getTextView(), org.telegram.ui.ActionBar.m6.f29588q7, h6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.c0.t(w2Var2.F, h6Var3, tL_error, false);
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
                i7 = 2131743411;
            } else {
                i7 = 2131743412;
            }
            a9Var.setText(org.telegram.messenger.hd.N0(i7, null));
            org.telegram.ui.ActionBar.t6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.m6.f29588q7, h6Var);
        }
    }
}
