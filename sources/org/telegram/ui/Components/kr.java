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
public final class kr implements Runnable {
    public final e2 E;
    public final org.telegram.ui.ActionBar.f3 F;
    public final boolean[] f27918a;
    public final int[] f27919b;
    public final ai.cb f27920c;
    public final String[] d;
    public final ei.d e;
    public final org.telegram.ui.Cells.i3 f27921f;
    public final TreeSet h;
    public final lg f27922n;
    public final org.telegram.ui.Cells.d9 f27923r;
    public final org.telegram.ui.ActionBar.d6 f27924s;
    public final int[] v;
    public final Runnable[] f27925w;
    public final int[] f27926x;
    public final int f27927y;

    public kr(boolean[] zArr, int[] iArr, ai.cb cbVar, String[] strArr, ei.d dVar, org.telegram.ui.Cells.i3 i3Var, TreeSet treeSet, lg lgVar, org.telegram.ui.Cells.d9 d9Var, org.telegram.ui.ActionBar.d6 d6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, e2 e2Var, org.telegram.ui.ActionBar.f3 f3Var) {
        this.f27918a = zArr;
        this.f27919b = iArr;
        this.f27920c = cbVar;
        this.d = strArr;
        this.e = dVar;
        this.f27921f = i3Var;
        this.h = treeSet;
        this.f27922n = lgVar;
        this.f27923r = d9Var;
        this.f27924s = d6Var;
        this.v = iArr2;
        this.f27925w = runnableArr;
        this.f27926x = iArr3;
        this.f27927y = i10;
        this.E = e2Var;
        this.F = f3Var;
    }

    @Override
    public final void run() {
        int i10;
        final boolean[] zArr = this.f27918a;
        if (!zArr[0] && this.f27919b[0] < 0) {
            this.f27920c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final ei.d dVar = this.e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f27921f.getText().toString();
            StringBuilder u10 = a1.g.u(charSequence);
            String str = "bot";
            boolean a2 = nr.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            u10.append((a2 || nr.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = u10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final lg lgVar = this.f27922n;
            if (isEmpty) {
                lgVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.d9 d9Var = this.f27923r;
            final org.telegram.ui.ActionBar.d6 d6Var = this.f27924s;
            if (length >= 4 && sb2.length() <= 32) {
                d9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                d9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, d6Var));
                final int[] iArr = this.v;
                final int i11 = iArr[0];
                final Runnable[] runnableArr = this.f27925w;
                final int[] iArr2 = this.f27926x;
                final int i12 = this.f27927y;
                final e2 e2Var = this.E;
                final org.telegram.ui.ActionBar.f3 f3Var = this.F;
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
                                final ei.d dVar2 = dVar;
                                final lg lgVar2 = lgVar;
                                final TreeSet treeSet2 = treeSet;
                                final e2 e2Var2 = e2Var;
                                final org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                                final org.telegram.ui.Cells.d9 d9Var2 = d9Var;
                                final org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
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
                                                ei.d dVar3 = dVar2;
                                                if (z10) {
                                                    strArr2[0] = str4;
                                                    dVar3.setEnabled(true);
                                                    lgVar2.run();
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
                                                e2 e2Var3 = e2Var2;
                                                org.telegram.ui.ActionBar.d6 d6Var3 = d6Var2;
                                                CharSequence d = nr.d(i16, str4, treeSet3, str5, e2Var3, d6Var3);
                                                if (d != null) {
                                                    string = d;
                                                } else {
                                                    string = LocaleController.getString(R.string.CreateManagedBotUsernameCheckFailed);
                                                }
                                                org.telegram.ui.Cells.d9 d9Var3 = d9Var2;
                                                d9Var3.setText(string);
                                                d9Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21231q7, d6Var3));
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.c1.t(f3Var2.topBulletinContainer, d6Var3, tL_error, false);
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
            d9Var.setText(LocaleController.getString(i10));
            d9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21231q7, d6Var));
        }
    }
}
