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
    public final boolean[] f34379a;
    public final int[] f34380b;
    public final ai.a1 f34381c;
    public final String[] d;
    public final fi.d f34382e;
    public final org.telegram.ui.Cells.k3 f34383f;
    public final TreeSet h;
    public final ng f34384n;
    public final org.telegram.ui.Cells.z8 f34385r;
    public final org.telegram.ui.ActionBar.f6 f34386s;
    public final int[] f34387w;
    public final Runnable[] f34388x;
    public final int[] f34389y;

    public hq(boolean[] zArr, int[] iArr, ai.a1 a1Var, String[] strArr, fi.d dVar, org.telegram.ui.Cells.k3 k3Var, TreeSet treeSet, ng ngVar, org.telegram.ui.Cells.z8 z8Var, org.telegram.ui.ActionBar.f6 f6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i7, r2 r2Var, org.telegram.ui.ActionBar.v2 v2Var) {
        this.f34379a = zArr;
        this.f34380b = iArr;
        this.f34381c = a1Var;
        this.d = strArr;
        this.f34382e = dVar;
        this.f34383f = k3Var;
        this.h = treeSet;
        this.f34384n = ngVar;
        this.f34385r = z8Var;
        this.f34386s = f6Var;
        this.f34387w = iArr2;
        this.f34388x = runnableArr;
        this.f34389y = iArr3;
        this.D = i7;
        this.E = r2Var;
        this.F = v2Var;
    }

    @Override
    public final void run() {
        int i7;
        final boolean[] zArr = this.f34379a;
        if (!zArr[0] && this.f34380b[0] < 0) {
            this.f34381c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final fi.d dVar = this.f34382e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f34383f.getText().toString();
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(charSequence);
            String str = "bot";
            boolean a10 = lq.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            m10.append((a10 || lq.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = m10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final ng ngVar = this.f34384n;
            if (isEmpty) {
                ngVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.z8 z8Var = this.f34385r;
            final org.telegram.ui.ActionBar.f6 f6Var = this.f34386s;
            if (length >= 4 && sb2.length() <= 32) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131743667, null));
                org.telegram.ui.ActionBar.r6.V(z8Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, f6Var);
                final int[] iArr = this.f34387w;
                final int i10 = iArr[0];
                final Runnable[] runnableArr = this.f34388x;
                final int[] iArr2 = this.f34389y;
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
                                final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
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
                                                org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                                                CharSequence d = lq.d(i15, str4, treeSet3, str5, r2Var3, f6Var3);
                                                if (d != null) {
                                                    M0 = d;
                                                } else {
                                                    M0 = org.telegram.messenger.hd.M0(2131751728, null);
                                                }
                                                org.telegram.ui.Cells.z8 z8Var3 = z8Var2;
                                                z8Var3.setText(M0);
                                                org.telegram.ui.ActionBar.r6.V(z8Var3.getTextView(), org.telegram.ui.ActionBar.k6.f28090q7, f6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.f1.r(v2Var2.E, f6Var3, tL_error, false);
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
                i7 = 2131743655;
            } else {
                i7 = 2131743656;
            }
            z8Var.setText(org.telegram.messenger.hd.M0(i7, null));
            org.telegram.ui.ActionBar.r6.V(z8Var.getTextView(), org.telegram.ui.ActionBar.k6.f28090q7, f6Var);
        }
    }
}
