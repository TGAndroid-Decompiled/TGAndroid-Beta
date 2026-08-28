package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class ew extends org.telegram.ui.ActionBar.j {
    public final dy f38033a;

    public ew(dy dyVar) {
        this.f38033a = dyVar;
    }

    @Override
    public final void b(int i9) {
        mx mxVar;
        int i10;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        dy dyVar = this.f38033a;
        ArrayList arrayList3 = dyVar.E2;
        if ((i9 == 201 || i9 == 200 || i9 == 202 || i9 == 203) && (mxVar = dyVar.f37750y0) != null) {
            HashMap hashMap = mxVar.f29155v0;
            dy dyVar2 = mxVar.F0;
            if (i9 == 202) {
                if (dyVar2 != null && dyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar2.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f22702a.P = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.if0(3));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.g1(23, mxVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i9 == 203) {
                if (mxVar.N()) {
                    dyVar2.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) dyVar2, 2, true));
                    return;
                }
                return;
            } else if (i9 == 200) {
                if (hashMap.size() == 1) {
                    mxVar.c((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i9 == 201) {
                dy dyVar3 = new dy(org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true));
                dyVar3.f37752y2 = new org.telegram.ui.Components.wu(mxVar, 17);
                dyVar2.presentFragment(dyVar3);
                return;
            } else {
                return;
            }
        }
        long j10 = 0;
        if (i9 == -1) {
            yw ywVar = dyVar.B3;
            if (ywVar != null && ywVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (kVar2.s()) {
                    mx mxVar2 = dyVar.f37750y0;
                    if (mxVar2 != null && mxVar2.getVisibility() == 0) {
                        mx mxVar3 = dyVar.f37750y0;
                        if (mxVar3.f29154u0) {
                            mxVar3.Q(false);
                            return;
                        }
                    }
                    dyVar.b4(true);
                    return;
                }
                dyVar.B3.a();
                mx mxVar4 = dyVar.f37750y0;
                if (mxVar4 != null) {
                    mxVar4.R();
                    return;
                }
                return;
            }
            cw cwVar = dyVar.f37735v0;
            if (cwVar == null || !cwVar.f34047n) {
                kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (kVar.s()) {
                    mx mxVar5 = dyVar.f37750y0;
                    if (mxVar5 != null && mxVar5.getVisibility() == 0) {
                        mx mxVar6 = dyVar.f37750y0;
                        if (mxVar6.f29154u0) {
                            mxVar6.Q(false);
                            return;
                        }
                    }
                    dyVar.b4(true);
                    return;
                } else if (dyVar.f37668h2 || dyVar.R2 != 0 || dyVar.T2 != 0) {
                    dyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            cwVar.setIsEditing(false);
            dyVar.I4(false);
        } else if (i9 == 1) {
            if (dyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                dyVar.f37633b0.getLocationInWindow(iArr);
                ((LaunchActivity) dyVar.getParentActivity()).G0(false, true, (dyVar.f37633b0.getMeasuredWidth() / 2) + iArr[0], (dyVar.f37633b0.getMeasuredHeight() / 2) + iArr[1], new ri(this, 24));
                dyVar.getNotificationsController().showNotifications();
                dyVar.y3();
            }
        } else if (i9 == 3) {
            dyVar.O4(true, true, true, false);
            dyVar.U.b(true);
        } else if (i9 == 11) {
            dyVar.p4(dyVar.f37755z1);
        } else if (i9 == 109) {
            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(dyVar, arrayList3);
            yzVar.f35116r = new wt(this, 4);
            dyVar.showDialog(yzVar);
        } else if (i9 == 110) {
            MessagesController.DialogFilter dialogFilter2 = dyVar.getMessagesController().getDialogFilters().get(dyVar.f37629a0[0].h);
            ArrayList H = org.telegram.ui.Components.yz.H(dyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i10 = dialogFilter2.neverShow.size();
            } else {
                i10 = 0;
            }
            if (H.size() + i10 > 100) {
                dyVar.showDialog(org.telegram.ui.Components.y4.N(dyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f22702a);
                return;
            }
            if (!H.isEmpty()) {
                dialogFilter2.neverShow.addAll(H);
                for (int i12 = 0; i12 < H.size(); i12++) {
                    Long l10 = (Long) H.get(i12);
                    dialogFilter2.alwaysShow.remove(l10);
                    dialogFilter2.pinnedDialogs.delete(l10.longValue());
                }
                if (dialogFilter2.isChatlist()) {
                    dialogFilter2.neverShow.clear();
                }
                dialogFilter = dialogFilter2;
                arrayList = H;
                i11 = 1;
                n00.s0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, dyVar, null);
            } else {
                arrayList = H;
                dialogFilter = dialogFilter2;
                i11 = 1;
            }
            if (arrayList.size() == i11) {
                arrayList2 = arrayList;
                z10 = false;
                j10 = ((Long) arrayList2.get(0)).longValue();
            } else {
                arrayList2 = arrayList;
                z10 = false;
            }
            long j11 = j10;
            UndoView Y3 = dyVar.Y3();
            if (Y3 != null) {
                Y3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            dyVar.b4(z10);
        } else if (i9 == 100 || i9 == 101 || i9 == 102 || i9 == 103 || i9 == 104 || i9 == 105 || i9 == 106 || i9 == 107 || i9 == 108) {
            dyVar.r4(dyVar.E2, i9, true, false, null);
        }
    }
}
