package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class x41 implements Runnable {
    public final int f30245a = 1;
    public final ArrayList f30246b;
    public final ArrayList f30247c;
    public final Object d;
    public final Object e;
    public final Serializable f30248f;
    public final Serializable h;
    public final Object f30249n;
    public final Object f30250r;
    public final Object f30251s;

    public x41(org.telegram.ui.wk wkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.m1 m1Var, ArrayList arrayList2) {
        this.d = wkVar;
        this.e = zArr;
        this.f30248f = str;
        this.f30249n = linearLayout;
        this.f30246b = arrayList;
        this.h = str2;
        this.f30250r = translateController;
        this.f30251s = m1Var;
        this.f30247c = arrayList2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.ActionBar.e1 e1Var;
        String y3;
        switch (this.f30245a) {
            case 0:
                final org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f30248f;
                LinearLayout linearLayout = (LinearLayout) this.f30249n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f30250r;
                final org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f30251s;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str != null && (y3 = i41.y(i41.E(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, wkVar.getContext(), wkVar.d, false, false);
                        e1Var2.setChecked(true);
                        e1Var2.setText(y3);
                        linearLayout.addView(e1Var2);
                    }
                    ArrayList arrayList = this.f30246b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str3 = language.code;
                        if (TextUtils.equals(str3, str2)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, wkVar.getContext(), wkVar.d, false, false);
                            if (str != null && str.equals(str3)) {
                                z11 = true;
                            }
                            e1Var3.setChecked(z11);
                            e1Var3.setText(language.displayName);
                            if (!z11) {
                                e1Var = e1Var3;
                                e1Var.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.wk wkVar2 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar2.f30773b, str3);
                                                m1Var.d(true);
                                                wkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.wk wkVar3 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar3.f30773b, str3);
                                                m1Var.d(true);
                                                wkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                e1Var = e1Var3;
                            }
                            linearLayout.addView(e1Var);
                            i10 = i11;
                            z11 = false;
                        }
                    }
                    linearLayout.addView(new org.telegram.ui.ActionBar.j1(wkVar.getContext(), wkVar.d), w7.y5.n(-1, 8));
                    ArrayList arrayList2 = this.f30247c;
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
                            org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(2, wkVar.getContext(), wkVar.d, false, false);
                            e1Var4.setChecked(z10);
                            e1Var4.setText(language2.displayName);
                            if (!z10) {
                                e1Var4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.wk wkVar2 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar2.f30773b, str4);
                                                m1Var.d(true);
                                                wkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.wk wkVar3 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar3.f30773b, str4);
                                                m1Var.d(true);
                                                wkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(e1Var4);
                        }
                        i12 = i13;
                    }
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f30248f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f30249n;
                ArrayList arrayList6 = (ArrayList) this.f30250r;
                ArrayList arrayList7 = (ArrayList) this.f30251s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f30246b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f30247c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i14 = notificationsCustomSettingsActivity.f31142s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f31143w = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f31143w = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f31143w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f31143w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
        }
    }

    public x41(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f30246b = arrayList;
        this.f30247c = arrayList2;
        this.e = arrayList3;
        this.f30248f = arrayList4;
        this.h = arrayList5;
        this.f30249n = arrayList6;
        this.f30250r = arrayList7;
        this.f30251s = arrayList8;
    }
}
