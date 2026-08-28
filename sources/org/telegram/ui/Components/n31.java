package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class n31 implements Runnable {
    public final int f31012a = 1;
    public final ArrayList f31013b;
    public final ArrayList f31014c;
    public final Object d;
    public final Object f31015e;
    public final Serializable f31016f;
    public final Serializable h;
    public final Object f31017n;
    public final Object f31018r;
    public final Object f31019s;

    public n31(org.telegram.ui.nk nkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.o1 o1Var, ArrayList arrayList2) {
        this.d = nkVar;
        this.f31015e = zArr;
        this.f31016f = str;
        this.f31017n = linearLayout;
        this.f31013b = arrayList;
        this.h = str2;
        this.f31018r = translateController;
        this.f31019s = o1Var;
        this.f31014c = arrayList2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.ActionBar.g1 g1Var;
        String y10;
        switch (this.f31012a) {
            case 0:
                final org.telegram.ui.nk nkVar = (org.telegram.ui.nk) this.d;
                boolean[] zArr = (boolean[]) this.f31015e;
                String str = (String) this.f31016f;
                LinearLayout linearLayout = (LinearLayout) this.f31017n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f31018r;
                final org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.f31019s;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str != null && (y10 = z21.y(z21.D(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, nkVar.getContext(), nkVar.d, false, false);
                        g1Var2.setChecked(true);
                        g1Var2.setText(y10);
                        linearLayout.addView(g1Var2);
                    }
                    ArrayList arrayList = this.f31013b;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        int i10 = i9 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i9);
                        final String str3 = language.code;
                        if (TextUtils.equals(str3, str2)) {
                            i9 = i10;
                        } else {
                            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, nkVar.getContext(), nkVar.d, false, false);
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
                                                org.telegram.ui.nk nkVar2 = nkVar;
                                                translateController.setDialogTranslateTo(nkVar2.f31533b, str3);
                                                o1Var.d(true);
                                                nkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.nk nkVar3 = nkVar;
                                                translateController.setDialogTranslateTo(nkVar3.f31533b, str3);
                                                o1Var.d(true);
                                                nkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                g1Var = g1Var3;
                            }
                            linearLayout.addView(g1Var);
                            i9 = i10;
                            z11 = false;
                        }
                    }
                    linearLayout.addView(new org.telegram.ui.ActionBar.l1(nkVar.getContext(), nkVar.d), g7.e6.n(-1, 8));
                    ArrayList arrayList2 = this.f31014c;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        int i12 = i11 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i11);
                        final String str4 = language2.code;
                        if (!TextUtils.equals(str4, str2)) {
                            if (str != null && str.equals(str4)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(2, nkVar.getContext(), nkVar.d, false, false);
                            g1Var4.setChecked(z10);
                            g1Var4.setText(language2.displayName);
                            if (!z10) {
                                g1Var4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.nk nkVar2 = nkVar;
                                                translateController.setDialogTranslateTo(nkVar2.f31533b, str4);
                                                o1Var.d(true);
                                                nkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.nk nkVar3 = nkVar;
                                                translateController.setDialogTranslateTo(nkVar3.f31533b, str4);
                                                o1Var.d(true);
                                                nkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(g1Var4);
                        }
                        i11 = i12;
                    }
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList arrayList3 = (ArrayList) this.f31016f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f31017n;
                ArrayList arrayList6 = (ArrayList) this.f31018r;
                ArrayList arrayList7 = (ArrayList) this.f31019s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f31013b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f31014c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.f31015e, true);
                int i13 = notificationsCustomSettingsActivity.f35550s;
                if (i13 == 1) {
                    notificationsCustomSettingsActivity.f35551w = arrayList3;
                } else if (i13 == 0) {
                    notificationsCustomSettingsActivity.f35551w = arrayList4;
                } else if (i13 == 3) {
                    notificationsCustomSettingsActivity.f35551w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f35551w = arrayList7;
                }
                notificationsCustomSettingsActivity.k0(true);
                return;
        }
    }

    public n31(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f31013b = arrayList;
        this.f31014c = arrayList2;
        this.f31015e = arrayList3;
        this.f31016f = arrayList4;
        this.h = arrayList5;
        this.f31017n = arrayList6;
        this.f31018r = arrayList7;
        this.f31019s = arrayList8;
    }
}
