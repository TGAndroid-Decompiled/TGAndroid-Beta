package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cb implements View.OnClickListener {
    public final int f31596a;
    public final int f31597b;
    public final Object f31598c;
    public final Object d;
    public final Object e;

    public cb(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f31596a = i11;
        this.f31598c = callback;
        this.d = obj;
        this.f31597b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31596a) {
            case 0:
                wb.W((wb) this.f31598c, this.f31597b, (ArrayList) this.d, (Integer) this.e);
                return;
            case 1:
                int[] iArr = (int[]) this.f31598c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                kk0 kk0Var = (kk0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f31597b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f17528a.L0.run();
                kk0Var.run();
                return;
            case 2:
                j60 j60Var = (j60) this.f31598c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.f31597b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) j60Var.f33936a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    j60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    j50 j50Var = j60Var.f33960f3;
                    if (j50Var != null) {
                        j50Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        j60Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                bi.d dVar = (bi.d) this.f31598c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f31597b;
                    PasskeysController.create(context, i12, new di.k1(dVar, context, h3Var, i12, 6));
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) this.f31598c;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.p1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f31597b == profileActivity.O3) {
                        org.telegram.ui.Components.wc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        org.telegram.ui.Components.wc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ig1 ig1Var = (ig1) this.f31598c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = ig1Var.getMessagesController();
                long j3 = -ig1Var.f33681a;
                if (messagesController.isDialogMuted(j3, tL_forumTopic.f17247id)) {
                    ig1Var.getNotificationsController().muteDialog(j3, tL_forumTopic.f17247id, false);
                    ig1Var.finishPreviewFragment();
                    if (org.telegram.ui.Components.wc.a(ig1Var)) {
                        org.telegram.ui.Components.wc.z(ig1Var, 4, 0, ig1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f31597b);
                return;
            default:
                zh.i4.m((zh.i4) this.f31598c, (TLRPC.User) this.d, this.f31597b, (org.telegram.ui.ActionBar.f6) this.e);
                return;
        }
    }

    public cb(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f31596a = i11;
        this.f31598c = obj;
        this.f31597b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public cb(org.telegram.ui.ActionBar.p2 p2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f31596a = i11;
        this.f31598c = p2Var;
        this.d = obj;
        this.e = serializable;
        this.f31597b = i10;
    }
}
