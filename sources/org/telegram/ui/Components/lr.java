package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class lr implements Runnable {
    public final h2 E;
    public final org.telegram.ui.ActionBar.k3 F;
    public final boolean[] f30284a;
    public final int[] f30285b;
    public final ai.h1 f30286c;
    public final String[] d;
    public final fi.d e;
    public final org.telegram.ui.Cells.g3 f30287f;
    public final TreeSet h;
    public final kg f30288n;
    public final org.telegram.ui.Cells.i9 f30289r;
    public final org.telegram.ui.ActionBar.u6 f30290s;
    public final int[] v;
    public final Runnable[] f30291w;
    public final int[] f30292x;
    public final int f30293y;

    public lr(boolean[] zArr, int[] iArr, ai.h1 h1Var, String[] strArr, fi.d dVar, org.telegram.ui.Cells.g3 g3Var, TreeSet treeSet, kg kgVar, org.telegram.ui.Cells.i9 i9Var, org.telegram.ui.ActionBar.u6 u6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, h2 h2Var, org.telegram.ui.ActionBar.k3 k3Var) {
        this.f30284a = zArr;
        this.f30285b = iArr;
        this.f30286c = h1Var;
        this.d = strArr;
        this.e = dVar;
        this.f30287f = g3Var;
        this.h = treeSet;
        this.f30288n = kgVar;
        this.f30289r = i9Var;
        this.f30290s = u6Var;
        this.v = iArr2;
        this.f30291w = runnableArr;
        this.f30292x = iArr3;
        this.f30293y = i10;
        this.E = h2Var;
        this.F = k3Var;
    }

    @Override
    public final void run() {
        int i10;
        final boolean[] zArr = this.f30284a;
        if (!zArr[0] && this.f30285b[0] < 0) {
            this.f30286c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final fi.d dVar = this.e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f30287f.getText().toString();
            StringBuilder u10 = a1.g.u(charSequence);
            String str = "bot";
            boolean a2 = pr.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            u10.append((a2 || pr.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = u10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final kg kgVar = this.f30288n;
            if (isEmpty) {
                kgVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.i9 i9Var = this.f30289r;
            final org.telegram.ui.ActionBar.u6 u6Var = this.f30290s;
            if (length >= 4 && sb2.length() <= 32) {
                i9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                org.telegram.ui.ActionBar.f7.V(i9Var.getTextView(), org.telegram.ui.ActionBar.y6.B6, u6Var);
                final int[] iArr = this.v;
                final int i11 = iArr[0];
                final Runnable[] runnableArr = this.f30291w;
                final int[] iArr2 = this.f30292x;
                final int i12 = this.f30293y;
                final h2 h2Var = this.E;
                final org.telegram.ui.ActionBar.k3 k3Var = this.F;
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
                                ?? obj = new Object();
                                final int[] iArr4 = iArr2;
                                final String[] strArr2 = strArr;
                                final fi.d dVar2 = dVar;
                                final kg kgVar2 = kgVar;
                                final TreeSet treeSet2 = treeSet;
                                final h2 h2Var2 = h2Var;
                                final org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
                                final org.telegram.ui.Cells.i9 i9Var2 = i9Var;
                                final org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
                                iArr4[0] = connectionsManager.sendRequestTyped(checkusername, obj, new Utilities.Callback2() {
                                    @Override
                                    public final void run(Object obj2, Object obj3) {
                                        String str3;
                                        CharSequence string;
                                        TLRPC.Bool bool = (TLRPC.Bool) obj2;
                                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                        if (!zArr2[0]) {
                                            if (i14 == iArr3[0]) {
                                                iArr4[0] = -1;
                                                boolean z10 = bool instanceof TLRPC.TL_boolTrue;
                                                String str4 = str2;
                                                fi.d dVar3 = dVar2;
                                                if (z10) {
                                                    strArr2[0] = str4;
                                                    dVar3.setEnabled(true);
                                                    kgVar2.run();
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
                                                h2 h2Var3 = h2Var2;
                                                org.telegram.ui.ActionBar.u6 u6Var3 = u6Var2;
                                                CharSequence d = pr.d(i16, str4, treeSet3, str5, h2Var3, u6Var3);
                                                if (d != null) {
                                                    string = d;
                                                } else {
                                                    string = LocaleController.getString(R.string.CreateManagedBotUsernameCheckFailed);
                                                }
                                                org.telegram.ui.Cells.i9 i9Var3 = i9Var2;
                                                i9Var3.setText(string);
                                                org.telegram.ui.ActionBar.f7.V(i9Var3.getTextView(), org.telegram.ui.ActionBar.y6.f23599q7, u6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.d3.t(k3Var2.topBulletinContainer, u6Var3, tL_error, false);
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
                AndroidUtilities.runOnUIThread(runnable, 300L);
                return;
            }
            if (sb2.length() < 4) {
                i10 = R.string.UsernameInvalidShort;
            } else {
                i10 = R.string.UsernameInvalidLong;
            }
            i9Var.setText(LocaleController.getString(i10));
            org.telegram.ui.ActionBar.f7.V(i9Var.getTextView(), org.telegram.ui.ActionBar.y6.f23599q7, u6Var);
        }
    }
}
