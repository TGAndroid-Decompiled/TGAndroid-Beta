package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class k41 implements Runnable {
    public final int f25538a = 1;
    public final ArrayList f25539b;
    public final ArrayList f25540c;
    public final Object d;
    public final Object e;
    public final Serializable f25541f;
    public final Serializable h;
    public final Object f25542n;
    public final Object f25543r;
    public final Object f25544s;

    public k41(org.telegram.ui.zk zkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.n1 n1Var, ArrayList arrayList2) {
        this.d = zkVar;
        this.e = zArr;
        this.f25541f = str;
        this.f25542n = linearLayout;
        this.f25539b = arrayList;
        this.h = str2;
        this.f25543r = translateController;
        this.f25544s = n1Var;
        this.f25540c = arrayList2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.ActionBar.f1 f1Var;
        String y3;
        switch (this.f25538a) {
            case 0:
                final org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f25541f;
                LinearLayout linearLayout = (LinearLayout) this.f25542n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f25543r;
                final org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.f25544s;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str != null && (y3 = v31.y(v31.E(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, zkVar.getContext(), zkVar.d, false, false);
                        f1Var2.setChecked(true);
                        f1Var2.setText(y3);
                        linearLayout.addView(f1Var2);
                    }
                    ArrayList arrayList = this.f25539b;
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
                                                translateController.setDialogTranslateTo(zkVar2.f26065b, str3);
                                                n1Var.d(true);
                                                zkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.zk zkVar3 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar3.f26065b, str3);
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
                    ArrayList arrayList2 = this.f25540c;
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
                                                translateController.setDialogTranslateTo(zkVar2.f26065b, str4);
                                                n1Var.d(true);
                                                zkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.zk zkVar3 = zkVar;
                                                translateController.setDialogTranslateTo(zkVar3.f26065b, str4);
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
                ArrayList arrayList3 = (ArrayList) this.f25541f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f25542n;
                ArrayList arrayList6 = (ArrayList) this.f25543r;
                ArrayList arrayList7 = (ArrayList) this.f25544s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f25539b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f25540c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i14 = notificationsCustomSettingsActivity.f30870s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f30871w = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f30871w = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f30871w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f30871w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
        }
    }

    public k41(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f25539b = arrayList;
        this.f25540c = arrayList2;
        this.e = arrayList3;
        this.f25541f = arrayList4;
        this.h = arrayList5;
        this.f25542n = arrayList6;
        this.f25543r = arrayList7;
        this.f25544s = arrayList8;
    }
}
