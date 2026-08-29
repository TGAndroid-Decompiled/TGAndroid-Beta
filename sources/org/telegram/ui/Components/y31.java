package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class y31 implements Runnable {
    public final int f34908a = 1;
    public final ArrayList f34909b;
    public final ArrayList f34910c;
    public final Object d;
    public final Object f34911e;
    public final Serializable f34912f;
    public final Serializable h;
    public final Object f34913n;
    public final Object f34914r;
    public final Object f34915s;

    public y31(org.telegram.ui.qk qkVar, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, org.telegram.ui.ActionBar.o1 o1Var, ArrayList arrayList2) {
        this.d = qkVar;
        this.f34911e = zArr;
        this.f34912f = str;
        this.f34913n = linearLayout;
        this.f34909b = arrayList;
        this.h = str2;
        this.f34914r = translateController;
        this.f34915s = o1Var;
        this.f34910c = arrayList2;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.ActionBar.g1 g1Var;
        String y8;
        switch (this.f34908a) {
            case 0:
                final org.telegram.ui.qk qkVar = (org.telegram.ui.qk) this.d;
                boolean[] zArr = (boolean[]) this.f34911e;
                String str = (String) this.f34912f;
                LinearLayout linearLayout = (LinearLayout) this.f34913n;
                String str2 = (String) this.h;
                final TranslateController translateController = (TranslateController) this.f34914r;
                final org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.f34915s;
                boolean z11 = false;
                if (!zArr[0]) {
                    if (str != null && (y8 = k31.y(k31.D(str, null, null))) != null) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, qkVar.getContext(), qkVar.d, false, false);
                        g1Var2.setChecked(true);
                        g1Var2.setText(y8);
                        linearLayout.addView(g1Var2);
                    }
                    ArrayList arrayList = this.f34909b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        TranslateController.Language language = (TranslateController.Language) arrayList.get(i10);
                        final String str3 = language.code;
                        if (TextUtils.equals(str3, str2)) {
                            i10 = i11;
                        } else {
                            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, qkVar.getContext(), qkVar.d, false, false);
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
                                                org.telegram.ui.qk qkVar2 = qkVar;
                                                translateController.setDialogTranslateTo(qkVar2.f26659b, str3);
                                                o1Var.d(true);
                                                qkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.qk qkVar3 = qkVar;
                                                translateController.setDialogTranslateTo(qkVar3.f26659b, str3);
                                                o1Var.d(true);
                                                qkVar3.b();
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
                    linearLayout.addView(new org.telegram.ui.ActionBar.l1(qkVar.getContext(), qkVar.d), i7.f6.n(-1, 8));
                    ArrayList arrayList2 = this.f34910c;
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
                            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(2, qkVar.getContext(), qkVar.d, false, false);
                            g1Var4.setChecked(z10);
                            g1Var4.setText(language2.displayName);
                            if (!z10) {
                                g1Var4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        switch (r5) {
                                            case 0:
                                                org.telegram.ui.qk qkVar2 = qkVar;
                                                translateController.setDialogTranslateTo(qkVar2.f26659b, str4);
                                                o1Var.d(true);
                                                qkVar2.b();
                                                return;
                                            default:
                                                org.telegram.ui.qk qkVar3 = qkVar;
                                                translateController.setDialogTranslateTo(qkVar3.f26659b, str4);
                                                o1Var.d(true);
                                                qkVar3.b();
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
                ArrayList arrayList3 = (ArrayList) this.f34912f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.f34913n;
                ArrayList arrayList6 = (ArrayList) this.f34914r;
                ArrayList arrayList7 = (ArrayList) this.f34915s;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f34909b, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f34910c, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.f34911e, true);
                int i14 = notificationsCustomSettingsActivity.f35617s;
                if (i14 == 1) {
                    notificationsCustomSettingsActivity.f35618w = arrayList3;
                } else if (i14 == 0) {
                    notificationsCustomSettingsActivity.f35618w = arrayList4;
                } else if (i14 == 3) {
                    notificationsCustomSettingsActivity.f35618w = arrayList5;
                    notificationsCustomSettingsActivity.v = arrayList6;
                } else {
                    notificationsCustomSettingsActivity.f35618w = arrayList7;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
        }
    }

    public y31(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.d = notificationsCustomSettingsActivity;
        this.f34909b = arrayList;
        this.f34910c = arrayList2;
        this.f34911e = arrayList3;
        this.f34912f = arrayList4;
        this.h = arrayList5;
        this.f34913n = arrayList6;
        this.f34914r = arrayList7;
        this.f34915s = arrayList8;
    }
}
