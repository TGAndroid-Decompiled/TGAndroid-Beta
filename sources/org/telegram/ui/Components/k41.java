package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class k41 implements Runnable {
    public final int f28260a = 1;
    public final ArrayList f28261b;
    public final ArrayList f28262c;
    public final Object d;
    public final Object f28263e;
    public final Serializable f28264f;
    public final Serializable h;
    public final Object f28265n;
    public final Object f28266r;
    public final Object f28267s;

    public k41(org.telegram.ui.wk wkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.p1 p1Var, ArrayList arrayList2) {
        this.d = wkVar;
        this.f28263e = zArr;
        this.f28264f = str;
        this.f28265n = linearLayout;
        this.f28261b = arrayList;
        this.h = str2;
        this.f28266r = translateController;
        this.f28267s = p1Var;
        this.f28262c = arrayList2;
    }

    @Override
    public final void run() {
        boolean z4;
        org.telegram.ui.ActionBar.g1 g1Var;
        String y10;
        switch (this.f28260a) {
            case 0:
                final org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.d;
                boolean[] zArr = (boolean[]) this.f28263e;
                String str = (String) this.f28264f;
                LinearLayout linearLayout = (LinearLayout) this.f28265n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f28266r;
                final org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.f28267s;
                boolean z10 = false;
                if (!zArr[0]) {
                    if (str != null && (y10 = w31.y(w31.D(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, wkVar.getContext(), wkVar.d, false, false);
                        g1Var2.setChecked(true);
                        g1Var2.setText(y10);
                        linearLayout.addView(g1Var2);
                    }
                    ArrayList arrayList = this.f28261b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str3 = language.code;
                        if (TextUtils.equals(str3, str2)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, wkVar.getContext(), wkVar.d, false, false);
                            if (str != null && str.equals(str3)) {
                                z10 = true;
                            }
                            g1Var3.setChecked(z10);
                            g1Var3.setText(language.displayName);
                            if (!z10) {
                                g1Var = g1Var3;
                                g1Var.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.wk wkVar2 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar2.f29397b, str3);
                                                p1Var.d(true);
                                                wkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.wk wkVar3 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar3.f29397b, str3);
                                                p1Var.d(true);
                                                wkVar3.b();
                                                return;
                                        }
                                    }
                                });
                            } else {
                                g1Var = g1Var3;
                            }
                            linearLayout.addView(g1Var);
                            i10 = i11;
                            z10 = false;
                        }
                    }
                    linearLayout.addView(new org.telegram.ui.ActionBar.m1(wkVar.getContext(), wkVar.d), k7.c6.n(-1, 8));
                    ArrayList arrayList2 = this.f28262c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        int i13 = i12 + 1;
                        TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i12);
                        final String str4 = language2.code;
                        if (!TextUtils.equals(str4, str2)) {
                            if (str != null && str.equals(str4)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(2, wkVar.getContext(), wkVar.d, false, false);
                            g1Var4.setChecked(z4);
                            g1Var4.setText(language2.displayName);
                            if (!z4) {
                                g1Var4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.wk wkVar2 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar2.f29397b, str4);
                                                p1Var.d(true);
                                                wkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.wk wkVar3 = wkVar;
                                                translateController.setDialogTranslateTo(wkVar3.f29397b, str4);
                                                p1Var.d(true);
                                                wkVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f28264f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f28265n;
                ArrayList arrayList6 = (ArrayList) this.f28266r;
                ArrayList arrayList7 = (ArrayList) this.f28267s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f28261b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f28262c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.f28263e, true);
                int i14 = notificationsCustomSettingsActivity.f34191s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f34192w = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f34192w = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f34192w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f34192w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
        }
    }

    public k41(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f28261b = arrayList;
        this.f28262c = arrayList2;
        this.f28263e = arrayList3;
        this.f28264f = arrayList4;
        this.h = arrayList5;
        this.f28265n = arrayList6;
        this.f28266r = arrayList7;
        this.f28267s = arrayList8;
    }
}
