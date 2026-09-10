package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class x41 implements Runnable {
    public final int f28933a = 1;
    public final ArrayList f28934b;
    public final ArrayList f28935c;
    public final Object d;
    public final Object e;
    public final Serializable f28936f;
    public final Serializable h;
    public final Object f28937n;
    public final Object f28938r;
    public final Object f28939s;

    public x41(org.telegram.ui.bl blVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.p1 p1Var, ArrayList arrayList2) {
        this.d = blVar;
        this.e = zArr;
        this.f28936f = str;
        this.f28937n = linearLayout;
        this.f28934b = arrayList;
        this.h = str2;
        this.f28938r = translateController;
        this.f28939s = p1Var;
        this.f28935c = arrayList2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.ActionBar.g1 g1Var;
        String y3;
        switch (this.f28933a) {
            case 0:
                final org.telegram.ui.bl blVar = (org.telegram.ui.bl) this.d;
                boolean[] zArr = (boolean[]) this.e;
                String str = (String) this.f28936f;
                LinearLayout linearLayout = (LinearLayout) this.f28937n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f28938r;
                final org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.f28939s;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str != null && (y3 = i41.y(i41.D(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, blVar.getContext(), blVar.d, false, false);
                        g1Var2.setChecked(true);
                        g1Var2.setText(y3);
                        linearLayout.addView(g1Var2);
                    }
                    ArrayList arrayList = this.f28934b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str3 = language.code;
                        if (TextUtils.equals(str3, str2)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, blVar.getContext(), blVar.d, false, false);
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
                                                org.telegram.ui.bl blVar2 = blVar;
                                                translateController.setDialogTranslateTo(blVar2.f29586b, str3);
                                                p1Var.d(true);
                                                blVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.bl blVar3 = blVar;
                                                translateController.setDialogTranslateTo(blVar3.f29586b, str3);
                                                p1Var.d(true);
                                                blVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.m1(blVar.getContext(), blVar.d), w7.a6.n(-1, 8));
                    ArrayList arrayList2 = this.f28935c;
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
                            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(2, blVar.getContext(), blVar.d, false, false);
                            g1Var4.setChecked(z10);
                            g1Var4.setText(language2.displayName);
                            if (!z10) {
                                g1Var4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.bl blVar2 = blVar;
                                                translateController.setDialogTranslateTo(blVar2.f29586b, str4);
                                                p1Var.d(true);
                                                blVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.bl blVar3 = blVar;
                                                translateController.setDialogTranslateTo(blVar3.f29586b, str4);
                                                p1Var.d(true);
                                                blVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f28936f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f28937n;
                ArrayList arrayList6 = (ArrayList) this.f28938r;
                ArrayList arrayList7 = (ArrayList) this.f28939s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f28934b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f28935c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.e, true);
                int i14 = notificationsCustomSettingsActivity.f29983s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f29984w = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f29984w = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f29984w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f29984w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
        }
    }

    public x41(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f28934b = arrayList;
        this.f28935c = arrayList2;
        this.e = arrayList3;
        this.f28936f = arrayList4;
        this.h = arrayList5;
        this.f28937n = arrayList6;
        this.f28938r = arrayList7;
        this.f28939s = arrayList8;
    }
}
