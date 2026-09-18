package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class l41 implements Runnable {
    public final int f25822a = 1;
    public final ArrayList f25823b;
    public final ArrayList f25824c;
    public final Object d;
    public final Object e;
    public final Serializable f25825f;
    public final Serializable h;
    public final Object f25826n;
    public final Object f25827r;
    public final Object f25828s;

    public l41(org.telegram.ui.al alVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.o1 o1Var, ArrayList arrayList2) {
        this.d = alVar;
        this.e = zArr;
        this.f25825f = str;
        this.f25826n = linearLayout;
        this.f25823b = arrayList;
        this.h = str2;
        this.f25827r = translateController;
        this.f25828s = o1Var;
        this.f25824c = arrayList2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.ActionBar.g1 g1Var;
        String y3;
        switch (this.f25822a) {
            case 0:
                final org.telegram.ui.al alVar = (org.telegram.ui.al) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f25825f;
                LinearLayout linearLayout = (LinearLayout) this.f25826n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f25827r;
                final org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.f25828s;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str != null && (y3 = w31.y(w31.E(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, alVar.getContext(), alVar.d, false, false);
                        g1Var2.setChecked(true);
                        g1Var2.setText(y3);
                        linearLayout.addView(g1Var2);
                    }
                    ArrayList arrayList = this.f25823b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str3 = language.code;
                        if (TextUtils.equals(str3, str2)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, alVar.getContext(), alVar.d, false, false);
                            if (str != null && str.equals(str3)) {
                                z11 = true;
                            }
                            g1Var3.setChecked(z11);
                            g1Var3.setText(language.displayName);
                            if (!z11) {
                                g1Var = g1Var3;
                                g1Var.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.al alVar2 = alVar;
                                                translateController.setDialogTranslateTo(alVar2.f26323b, str3);
                                                o1Var.d(true);
                                                alVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.al alVar3 = alVar;
                                                translateController.setDialogTranslateTo(alVar3.f26323b, str3);
                                                o1Var.d(true);
                                                alVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                g1Var = g1Var3;
                            }
                            linearLayout.addView(g1Var);
                            i10 = i11;
                            z11 = false;
                        }
                    }
                    linearLayout.addView(new org.telegram.ui.ActionBar.l1(alVar.getContext(), alVar.d), w7.x5.n(-1, 8));
                    ArrayList arrayList2 = this.f25824c;
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
                            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(2, alVar.getContext(), alVar.d, false, false);
                            g1Var4.setChecked(z10);
                            g1Var4.setText(language2.displayName);
                            if (!z10) {
                                g1Var4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.al alVar2 = alVar;
                                                translateController.setDialogTranslateTo(alVar2.f26323b, str4);
                                                o1Var.d(true);
                                                alVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.al alVar3 = alVar;
                                                translateController.setDialogTranslateTo(alVar3.f26323b, str4);
                                                o1Var.d(true);
                                                alVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(g1Var4);
                        }
                        i12 = i13;
                    }
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f25825f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f25826n;
                ArrayList arrayList6 = (ArrayList) this.f25827r;
                ArrayList arrayList7 = (ArrayList) this.f25828s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f25823b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f25824c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i14 = notificationsCustomSettingsActivity.f30887s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f30888w = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f30888w = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f30888w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f30888w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
        }
    }

    public l41(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f25823b = arrayList;
        this.f25824c = arrayList2;
        this.e = arrayList3;
        this.f25825f = arrayList4;
        this.h = arrayList5;
        this.f25826n = arrayList6;
        this.f25827r = arrayList7;
        this.f25828s = arrayList8;
    }
}
