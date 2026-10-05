package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class j51 implements Runnable {
    public final int f27682a = 1;
    public final ArrayList f27683b;
    public final ArrayList f27684c;
    public final Object d;
    public final Object f27685e;
    public final Serializable f27686f;
    public final Serializable h;
    public final Object f27687n;
    public final Object f27688r;
    public final Object f27689s;

    public j51(org.telegram.ui.wk wkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.n1 n1Var, ArrayList arrayList2) {
        this.d = wkVar;
        this.f27685e = zArr;
        this.f27686f = str;
        this.f27687n = linearLayout;
        this.f27683b = arrayList;
        this.h = str2;
        this.f27688r = translateController;
        this.f27689s = n1Var;
        this.f27684c = arrayList2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.ActionBar.f1 f1Var;
        String y3;
        switch (this.f27682a) {
            case 0:
                final org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.d;
                boolean[] zArr = (boolean[]) this.f27685e;
                String str = (String) this.f27686f;
                LinearLayout linearLayout = (LinearLayout) this.f27687n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f27688r;
                final org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.f27689s;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str != null && (y3 = u41.y(u41.C(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, wkVar.getContext(), wkVar.d, false, false);
                        f1Var2.setChecked(true);
                        f1Var2.setText(y3);
                        linearLayout.addView(f1Var2);
                    }
                    ArrayList arrayList = this.f27683b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str3 = language.code;
                        if (TextUtils.equals(str3, str2)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, wkVar.getContext(), wkVar.d, false, false);
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
                                                org.telegram.ui.wk wkVar2 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar2.f28370b, str3);
                                                n1Var.d(true);
                                                wkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.wk wkVar3 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar3.f28370b, str3);
                                                n1Var.d(true);
                                                wkVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.k1(wkVar.getContext(), wkVar.d), w7.z5.n(-1, 8));
                    ArrayList arrayList2 = this.f27684c;
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
                            org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(2, wkVar.getContext(), wkVar.d, false, false);
                            f1Var4.setChecked(z10);
                            f1Var4.setText(language2.displayName);
                            if (!z10) {
                                f1Var4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.wk wkVar2 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar2.f28370b, str4);
                                                n1Var.d(true);
                                                wkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.wk wkVar3 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar3.f28370b, str4);
                                                n1Var.d(true);
                                                wkVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f27686f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f27687n;
                ArrayList arrayList6 = (ArrayList) this.f27688r;
                ArrayList arrayList7 = (ArrayList) this.f27689s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f27683b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f27684c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.f27685e, true);
                int i14 = notificationsCustomSettingsActivity.f33844s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f33845w = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f33845w = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f33845w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f33845w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
        }
    }

    public j51(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f27683b = arrayList;
        this.f27684c = arrayList2;
        this.f27685e = arrayList3;
        this.f27686f = arrayList4;
        this.h = arrayList5;
        this.f27687n = arrayList6;
        this.f27688r = arrayList7;
        this.f27689s = arrayList8;
    }
}
