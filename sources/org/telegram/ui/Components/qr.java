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
public final class qr implements Runnable {
    public final nd E;
    public final org.telegram.ui.ActionBar.e3 F;
    public final boolean[] f30300a;
    public final int[] f30301b;
    public final ai.d9 f30302c;
    public final String[] d;
    public final ci.d f30303e;
    public final org.telegram.ui.Cells.j3 f30304f;
    public final TreeSet h;
    public final org.telegram.messenger.video.f f30305n;
    public final org.telegram.ui.Cells.e9 f30306r;
    public final org.telegram.ui.ActionBar.d6 f30307s;
    public final int[] v;
    public final Runnable[] f30308w;
    public final int[] f30309x;
    public final int f30310y;

    public qr(boolean[] zArr, int[] iArr, ai.d9 d9Var, String[] strArr, ci.d dVar, org.telegram.ui.Cells.j3 j3Var, TreeSet treeSet, org.telegram.messenger.video.f fVar, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.ActionBar.d6 d6Var, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i10, nd ndVar, org.telegram.ui.ActionBar.e3 e3Var) {
        this.f30300a = zArr;
        this.f30301b = iArr;
        this.f30302c = d9Var;
        this.d = strArr;
        this.f30303e = dVar;
        this.f30304f = j3Var;
        this.h = treeSet;
        this.f30305n = fVar;
        this.f30306r = e9Var;
        this.f30307s = d6Var;
        this.v = iArr2;
        this.f30308w = runnableArr;
        this.f30309x = iArr3;
        this.f30310y = i10;
        this.E = ndVar;
        this.F = e3Var;
    }

    @Override
    public final void run() {
        int i10;
        final boolean[] zArr = this.f30300a;
        if (!zArr[0] && this.f30301b[0] < 0) {
            this.f30302c.run();
            final String[] strArr = this.d;
            strArr[0] = null;
            final ci.d dVar = this.f30303e;
            dVar.setLoading(false);
            dVar.setEnabled(false);
            String charSequence = this.f30304f.getText().toString();
            StringBuilder v = a1.g.v(charSequence);
            String str = "bot";
            boolean a2 = tr.a(charSequence, "bot");
            final TreeSet treeSet = this.h;
            v.append((a2 || tr.c(charSequence, treeSet) != null) ? "" : "");
            final String sb2 = v.toString();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            final org.telegram.messenger.video.f fVar = this.f30305n;
            if (isEmpty) {
                fVar.run();
                return;
            }
            int length = sb2.length();
            final org.telegram.ui.Cells.e9 e9Var = this.f30306r;
            final org.telegram.ui.ActionBar.d6 d6Var = this.f30307s;
            if (length >= 4 && sb2.length() <= 32) {
                e9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                e9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, d6Var));
                final int[] iArr = this.v;
                final int i11 = iArr[0];
                final Runnable[] runnableArr = this.f30308w;
                final int[] iArr2 = this.f30309x;
                final int i12 = this.f30310y;
                final nd ndVar = this.E;
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
                                final ci.d dVar2 = dVar;
                                final org.telegram.messenger.video.f fVar2 = fVar;
                                final TreeSet treeSet2 = treeSet;
                                final nd ndVar2 = ndVar;
                                final org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
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
                                                ci.d dVar3 = dVar2;
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
                                                nd ndVar3 = ndVar2;
                                                org.telegram.ui.ActionBar.d6 d6Var3 = d6Var2;
                                                CharSequence d = tr.d(i16, str4, treeSet3, str5, ndVar3, d6Var3);
                                                if (d != null) {
                                                    string = d;
                                                } else {
                                                    string = LocaleController.getString(R.string.CreateManagedBotUsernameCheckFailed);
                                                }
                                                org.telegram.ui.Cells.e9 e9Var3 = e9Var2;
                                                e9Var3.setText(string);
                                                e9Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, d6Var3));
                                                if (d == null && tL_error != null) {
                                                    dVar3.setEnabled(true);
                                                    org.telegram.ui.Cells.c1.p(e3Var2.topBulletinContainer, d6Var3, tL_error, false);
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
            e9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, d6Var));
        }
    }
}
