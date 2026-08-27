package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;

public final class p31 implements Runnable {

    public final int f31489a = 1;

    public final ArrayList f31490b;

    public final ArrayList f31491c;
    public final Object d;

    public final Object f31492e;

    public final Serializable f31493f;
    public final Serializable h;

    public final Object f31494n;

    public final Object f31495r;

    public final Object f31496s;

    public p31(org.telegram.ui.pk pkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.n1 n1Var, ArrayList arrayList2) {
        this.d = pkVar;
        this.f31492e = zArr;
        this.f31493f = str;
        this.f31494n = linearLayout;
        this.f31490b = arrayList;
        this.h = str2;
        this.f31495r = translateController;
        this.f31496s = n1Var;
        this.f31491c = arrayList2;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        String strZ;
        switch (this.f31489a) {
            case 0:
                final org.telegram.ui.pk pkVar = (org.telegram.ui.pk) this.d;
                boolean[] zArr = (boolean[]) this.f31492e;
                String str = (String) this.f31493f;
                LinearLayout linearLayout = (LinearLayout) this.f31494n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f31495r;
                final org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.f31496s;
                boolean z10 = false;
                if (!zArr[0]) {
                    if (str != null && (strZ = b31.z(b31.E(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, pkVar.getContext(), pkVar.d, false, false);
                        f1Var2.setChecked(true);
                        f1Var2.setText(strZ);
                        linearLayout.addView(f1Var2);
                    }
                    ArrayList arrayList = this.f31490b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        i10++;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str3 = language.code;
                        if (!TextUtils.equals(str3, str2)) {
                            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, pkVar.getContext(), pkVar.d, false, false);
                            if (str != null && str.equals(str3)) {
                                z10 = true;
                            }
                            f1Var3.setChecked(z10);
                            f1Var3.setText(language.displayName);
                            if (z10) {
                                f1Var = f1Var3;
                            } else {
                                f1Var = f1Var3;
                                final int i11 = 0;
                                f1Var.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (i11) {
                                            case 0:
                                                org.telegram.ui.pk pkVar2 = pkVar;
                                                translateController.setDialogTranslateTo(pkVar2.f32072b, str3);
                                                n1Var.d(true);
                                                pkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.pk pkVar3 = pkVar;
                                                translateController.setDialogTranslateTo(pkVar3.f32072b, str3);
                                                n1Var.d(true);
                                                pkVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(f1Var);
                            z10 = false;
                        }
                    }
                    linearLayout.addView(new org.telegram.ui.ActionBar.k1(pkVar.getContext(), pkVar.d), h7.z5.n(-1, 8));
                    ArrayList arrayList2 = this.f31491c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i12);
                        final String str4 = language2.code;
                        if (!TextUtils.equals(str4, str2)) {
                            boolean z11 = str != null && str.equals(str4);
                            org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(2, pkVar.getContext(), pkVar.d, false, false);
                            f1Var4.setChecked(z11);
                            f1Var4.setText(language2.displayName);
                            if (!z11) {
                                final int i14 = 1;
                                f1Var4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (i14) {
                                            case 0:
                                                org.telegram.ui.pk pkVar2 = pkVar;
                                                translateController.setDialogTranslateTo(pkVar2.f32072b, str4);
                                                n1Var.d(true);
                                                pkVar2.b();
                                                break;
                                            default:
                                                org.telegram.ui.pk pkVar3 = pkVar;
                                                translateController.setDialogTranslateTo(pkVar3.f32072b, str4);
                                                n1Var.d(true);
                                                pkVar3.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(f1Var4);
                        }
                        i12 = i13;
                    }
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.d;
                ArrayList<TLRPC.EncryptedChat> arrayList3 = (ArrayList) this.f31492e;
                ArrayList arrayList4 = (ArrayList) this.f31493f;
                ArrayList arrayList5 = (ArrayList) this.h;
                ArrayList arrayList6 = (ArrayList) this.f31494n;
                ArrayList arrayList7 = (ArrayList) this.f31495r;
                ArrayList arrayList8 = (ArrayList) this.f31496s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f31490b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f31491c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats(arrayList3, true);
                int i15 = notificationsCustomSettingsActivity.f35553s;
                if (i15 == 1) {
                    notificationsCustomSettingsActivity.f35554w = arrayList4;
                } else if (i15 == 0) {
                    notificationsCustomSettingsActivity.f35554w = arrayList5;
                } else if (i15 == 3) {
                    notificationsCustomSettingsActivity.f35554w = arrayList6;
                    notificationsCustomSettingsActivity.v = arrayList7;
                } else {
                    notificationsCustomSettingsActivity.f35554w = arrayList8;
                }
                notificationsCustomSettingsActivity.l0(true);
                break;
        }
    }

    public p31(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f31490b = arrayList;
        this.f31491c = arrayList2;
        this.f31492e = arrayList3;
        this.f31493f = arrayList4;
        this.h = arrayList5;
        this.f31494n = arrayList6;
        this.f31495r = arrayList7;
        this.f31496s = arrayList8;
    }
}
