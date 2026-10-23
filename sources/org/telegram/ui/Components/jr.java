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
public final class jr implements Runnable {
    public final d2 E;
    public final org.telegram.ui.ActionBar.h3 F;
    public final boolean[] f27742a;
    public final int[] f27743b;
    public final ai.db f27744c;
    public final String[] d;
    public final ei.d e;
    public final org.telegram.ui.Cells.h3 f27745f;
    public final TreeSet h;
    public final lg f27746n;
    public final org.telegram.ui.Cells.e9 f27747r;
    public final org.telegram.ui.ActionBar.g6 f27748s;
    public final int[] v;
    public final Runnable[] f27749w;
    public final int[] f27750x;
    public final int f27751y;

    public jr(boolean[] zArr, int[] iArr, ai.db dbVar, String[] strArr, ei.d dVar, org.telegram.ui.Cells.h3 h3Var, TreeSet treeSet, lg lgVar, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.ActionBar.g6 g6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, d2 d2Var, org.telegram.ui.ActionBar.h3 h3Var2) {
        this.f27742a = zArr;
        this.f27743b = iArr;
        this.f27744c = dbVar;
        this.d = strArr;
        this.e = dVar;
        this.f27745f = h3Var;
        this.h = treeSet;
        this.f27746n = lgVar;
        this.f27747r = e9Var;
        this.f27748s = g6Var;
        this.v = iArr2;
        this.f27749w = runnableArr;
        this.f27750x = iArr3;
        this.f27751y = i10;
        this.E = d2Var;
        this.F = h3Var2;
    }

    @Override
    public final void run() {
        int i10;
        final boolean[] zArr = this.f27742a;
        if (!zArr[0] && this.f27743b[0] < 0) {
            this.f27744c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final ei.d dVar = this.e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f27745f.getText().toString();
            StringBuilder u10 = a1.g.u(charSequence);
            String str = "bot";
            boolean a2 = nr.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            u10.append((a2 || nr.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = u10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final lg lgVar = this.f27746n;
            if (isEmpty) {
                lgVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.e9 e9Var = this.f27747r;
            final org.telegram.ui.ActionBar.g6 g6Var = this.f27748s;
            if (length >= 4 && sb2.length() <= 32) {
                e9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                org.telegram.ui.ActionBar.r6.W(e9Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, g6Var);
                final int[] iArr = this.v;
                final int i11 = iArr[0];
                final Runnable[] runnableArr = this.f27749w;
                final int[] iArr2 = this.f27750x;
                final int i12 = this.f27751y;
                final d2 d2Var = this.E;
                final org.telegram.ui.ActionBar.h3 h3Var = this.F;
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
                                final d2 d2Var2 = d2Var;
                                final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                final org.telegram.ui.Cells.e9 e9Var2 = e9Var;
                                final org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
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
                                                d2 d2Var3 = d2Var2;
                                                org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                                                CharSequence d = nr.d(i16, str4, treeSet3, str5, d2Var3, g6Var3);
                                                if (d != null) {
                                                    string = d;
                                                } else {
                                                    string = LocaleController.getString(R.string.CreateManagedBotUsernameCheckFailed);
                                                }
                                                org.telegram.ui.Cells.e9 e9Var3 = e9Var2;
                                                e9Var3.setText(string);
                                                org.telegram.ui.ActionBar.r6.W(e9Var3.getTextView(), org.telegram.ui.ActionBar.k6.f21421q7, g6Var3);
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.b1.s(h3Var2.topBulletinContainer, g6Var3, tL_error, false);
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
            e9Var.setText(LocaleController.getString(i10));
            org.telegram.ui.ActionBar.r6.W(e9Var.getTextView(), org.telegram.ui.ActionBar.k6.f21421q7, g6Var);
        }
    }
}
