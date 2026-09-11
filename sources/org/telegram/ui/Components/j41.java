package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class j41 implements Runnable {
    public final int f27343a = 1;
    public final ArrayList f27344b;
    public final ArrayList f27345c;
    public final Object d;
    public final Object f27346e;
    public final Serializable f27347f;
    public final Serializable h;
    public final Object f27348n;
    public final Object f27349r;
    public final Object f27350s;

    public j41(org.telegram.ui.zk zkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.n1 n1Var, ArrayList arrayList2) {
        this.d = zkVar;
        this.f27346e = zArr;
        this.f27347f = str;
        this.f27348n = linearLayout;
        this.f27344b = arrayList;
        this.h = str2;
        this.f27349r = translateController;
        this.f27350s = n1Var;
        this.f27345c = arrayList2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.ActionBar.f1 f1Var;
        String y3;
        switch (this.f27343a) {
            case 0:
                final org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.d;
                boolean[] zArr = (boolean[]) this.f27346e;
                String str = (String) this.f27347f;
                LinearLayout linearLayout = (LinearLayout) this.f27348n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f27349r;
                final org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.f27350s;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str != null && (y3 = u31.y(u31.D(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, zkVar.getContext(), zkVar.d, false, false);
                        f1Var2.setChecked(true);
                        f1Var2.setText(y3);
                        linearLayout.addView(f1Var2);
                    }
                    ArrayList arrayList = this.f27344b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str3 = language.code;
                        if (TextUtils.equals(str3, str2)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, zkVar.getContext(), zkVar.d, false, false);
                            if (str != null && str.equals(str3)) {
                                z11 = true;
                            }
                            f1Var3.setChecked(z11);
                            f1Var3.setText(language.displayName);
                            if (!z11) {
                                f1Var = f1Var3;
                                f1Var.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.zk zkVar2 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar2.f28051b, str3);
                                                n1Var.d(true);
                                                zkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.zk zkVar3 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar3.f28051b, str3);
                                                n1Var.d(true);
                                                zkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                f1Var = f1Var3;
                            }
                            linearLayout.addView(f1Var);
                            i10 = i11;
                            z11 = false;
                        }
                    }
                    linearLayout.addView(new org.telegram.ui.ActionBar.k1(zkVar.getContext(), zkVar.d), w7.x5.n(-1, 8));
                    ArrayList arrayList2 = this.f27345c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i12);
                        final String str4 = language2.code;
                        if (!TextUtils.equals(str4, str2)) {
                            if (str != null && str.equals(str4)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(2, zkVar.getContext(), zkVar.d, false, false);
                            f1Var4.setChecked(z10);
                            f1Var4.setText(language2.displayName);
                            if (!z10) {
                                f1Var4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.zk zkVar2 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar2.f28051b, str4);
                                                n1Var.d(true);
                                                zkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.zk zkVar3 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar3.f28051b, str4);
                                                n1Var.d(true);
                                                zkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(f1Var4);
                        }
                        i12 = i13;
                    }
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f27347f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f27348n;
                ArrayList arrayList6 = (ArrayList) this.f27349r;
                ArrayList arrayList7 = (ArrayList) this.f27350s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f27344b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f27345c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.f27346e, true);
                int i14 = notificationsCustomSettingsActivity.f33480s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f33481w = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f33481w = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f33481w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f33481w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
        }
    }

    public j41(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f27344b = arrayList;
        this.f27345c = arrayList2;
        this.f27346e = arrayList3;
        this.f27347f = arrayList4;
        this.h = arrayList5;
        this.f27348n = arrayList6;
        this.f27349r = arrayList7;
        this.f27350s = arrayList8;
    }
}
