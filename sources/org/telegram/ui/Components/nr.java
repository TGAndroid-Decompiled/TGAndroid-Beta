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
public final class nr implements Runnable {
    public final o8 E;
    public final org.telegram.ui.ActionBar.e3 F;
    public final boolean[] f27388a;
    public final int[] f27389b;
    public final bi.n8 f27390c;
    public final String[] d;
    public final di.d e;
    public final org.telegram.ui.Cells.j3 f27391f;
    public final TreeSet h;
    public final org.telegram.messenger.video.f f27392n;
    public final org.telegram.ui.Cells.e9 f27393r;
    public final org.telegram.ui.ActionBar.c6 f27394s;
    public final int[] v;
    public final Runnable[] f27395w;
    public final int[] f27396x;
    public final int f27397y;

    public nr(boolean[] zArr, int[] iArr, bi.n8 n8Var, String[] strArr, di.d dVar, org.telegram.ui.Cells.j3 j3Var, TreeSet treeSet, org.telegram.messenger.video.f fVar, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.ActionBar.c6 c6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, o8 o8Var, org.telegram.ui.ActionBar.e3 e3Var) {
        this.f27388a = zArr;
        this.f27389b = iArr;
        this.f27390c = n8Var;
        this.d = strArr;
        this.e = dVar;
        this.f27391f = j3Var;
        this.h = treeSet;
        this.f27392n = fVar;
        this.f27393r = e9Var;
        this.f27394s = c6Var;
        this.v = iArr2;
        this.f27395w = runnableArr;
        this.f27396x = iArr3;
        this.f27397y = i10;
        this.E = o8Var;
        this.F = e3Var;
    }

    @Override
    public final void run() {
        int i10;
        final boolean[] zArr = this.f27388a;
        if (!zArr[0] && this.f27389b[0] < 0) {
            this.f27390c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final di.d dVar = this.e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f27391f.getText().toString();
            StringBuilder u10 = a1.g.u(charSequence);
            String str = "bot";
            boolean a2 = qr.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            u10.append((a2 || qr.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = u10.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final org.telegram.messenger.video.f fVar = this.f27392n;
            if (isEmpty) {
                fVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.e9 e9Var = this.f27393r;
            final org.telegram.ui.ActionBar.c6 c6Var = this.f27394s;
            if (length >= 4 && sb2.length() <= 32) {
                e9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                e9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B6, c6Var));
                final int[] iArr = this.v;
                final int i11 = iArr[0];
                final Runnable[] runnableArr = this.f27395w;
                final int[] iArr2 = this.f27396x;
                final int i12 = this.f27397y;
                final o8 o8Var = this.E;
                final org.telegram.ui.ActionBar.e3 e3Var = this.F;
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
                                final di.d dVar2 = dVar;
                                final org.telegram.messenger.video.f fVar2 = fVar;
                                final TreeSet treeSet2 = treeSet;
                                final o8 o8Var2 = o8Var;
                                final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                final org.telegram.ui.Cells.e9 e9Var2 = e9Var;
                                final org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
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
                                                di.d dVar3 = dVar2;
                                                if (z10) {
                                                    strArr2[0] = str4;
                                                    dVar3.setEnabled(true);
                                                    fVar2.run();
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
                                                o8 o8Var3 = o8Var2;
                                                org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
                                                CharSequence d = qr.d(i16, str4, treeSet3, str5, o8Var3, c6Var3);
                                                if (d != null) {
                                                    string = d;
                                                } else {
                                                    string = LocaleController.getString(R.string.CreateManagedBotUsernameCheckFailed);
                                                }
                                                org.telegram.ui.Cells.e9 e9Var3 = e9Var2;
                                                e9Var3.setText(string);
                                                e9Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19839q7, c6Var3));
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.c1.p(e3Var2.topBulletinContainer, c6Var3, tL_error, false);
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
            e9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19839q7, c6Var));
        }
    }
}
