package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ku0 extends sl0 {
    public int B;
    public final zu0 D;
    public final Context f28452c;
    public final int d;
    public boolean f28456r;
    public String f28458w;
    public ng.q0 f28459x;
    public final ArrayList f28453e = new ArrayList();
    public final ArrayList f28454f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28455n = new ArrayList();
    public boolean f28457s = false;
    public int v = 0;
    public int f28460y = -1;
    public final oq0 C = new oq0(this, 6);

    public ku0(zu0 zu0Var, Context context) {
        this.D = zu0Var;
        this.f28452c = context;
        this.d = zu0Var.f34004s1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final void E(ng.q0 q0Var, String str) {
        long j10;
        if (TextUtils.equals(str, this.f28458w)) {
            ng.q0 q0Var2 = this.f28459x;
            if (q0Var2 != null || q0Var != null) {
                if (q0Var2 != null && q0Var2.equals(q0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f28458w = str;
        this.f28459x = q0Var;
        int i10 = this.f28460y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f28460y, true);
            this.f28460y = -1;
        }
        this.f28455n.clear();
        this.h.clear();
        this.f28454f.clear();
        int i12 = 0;
        this.v = 0;
        this.f28457s = false;
        this.f28456r = true;
        ArrayList arrayList = this.f28453e;
        arrayList.clear();
        if (this.f28459x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            rt0[] rt0VarArr = this.D.f33980h0;
            if (i12 >= rt0VarArr.length) {
                break;
            }
            rt0 rt0Var = rt0VarArr[i12];
            if (rt0Var.C == 11) {
                rt0Var.f30852w.e(true, true);
            }
            i12++;
        }
        if (this.f28459x == null) {
            l();
        }
        oq0 oq0Var = this.C;
        AndroidUtilities.cancelRunOnUIThread(oq0Var);
        if (this.f28459x != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        AndroidUtilities.runOnUIThread(oq0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f28458w) && this.f28459x == null) {
            this.f28456r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20952q = this.f28458w;
        ng.q0 q0Var = this.f28459x;
        if (q0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(q0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) l.d.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f28457s = false;
        int i11 = this.B + 1;
        this.B = i11;
        gy gyVar = new gy(this, i11, tL_messages_search, 13);
        if (this.f28459x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f28459x.g(), 0L, this.f28458w, 100, this.f28455n.size(), new oh.c2(1, this, gyVar), false);
        } else {
            gyVar.run();
        }
    }

    public final void G(boolean z4) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        rt0[] rt0VarArr = this.D.f33980h0;
        ArrayList arrayList2 = this.f28454f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i10 >= arrayList3.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList3.get(i10);
            if (messageObject != null && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                hashSet.add(Integer.valueOf(messageObject.getId()));
                arrayList2.add(messageObject);
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            arrayList = this.f28455n;
            if (i11 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(i11);
            if (messageObject2 != null && !hashSet.contains(Integer.valueOf(messageObject2.getId()))) {
                hashSet.add(Integer.valueOf(messageObject2.getId()));
                arrayList2.add(messageObject2);
            }
            i11++;
        }
        if (!z4 || !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < rt0VarArr.length; i12++) {
                if (rt0VarArr[i12].C == 11 && arrayList2.isEmpty() && this.f28453e.isEmpty()) {
                    jh.s sVar = rt0VarArr[i12].f30852w.d;
                    if (this.f28459x != null && TextUtils.isEmpty(this.f28458w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        ng.q0 q0Var = this.f28459x;
                        Paint.FontMetricsInt fontMetricsInt = rt0VarArr[i12].f30852w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(q0Var.f16178f)) {
                            charSequence = q0Var.f16178f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new u5(q0Var.f16179g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f28458w);
                    }
                    sVar.setText(formatString);
                    rt0VarArr[i12].f30852w.f25365f.setVisibility(8);
                    rt0VarArr[i12].f30852w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28454f.size() + this.f28453e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f28453e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f28454f;
            if (size < arrayList2.size()) {
                hash = Objects.hash(2, Long.valueOf(((MessageObject) arrayList2.get(size)).getSavedDialogId()), Integer.valueOf(((MessageObject) arrayList2.get(size)).getId()));
            } else {
                return size;
            }
        }
        return hash;
    }

    @Override
    public final int j(int i10) {
        return 23;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        if (i10 >= 0) {
            View view = m1Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (i10 + 1 < h()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                r2Var.f23486p2 = z4;
                ArrayList arrayList = this.f28453e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f28454f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    r2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ju0 ju0Var = new ju0(0, this.f28452c, true);
        zu0 zu0Var = this.D;
        ju0Var.setDialogCellDelegate(zu0Var);
        ju0Var.f23479o0 = true;
        ju0Var.setBackgroundColor(zu0Var.h0(org.telegram.ui.ActionBar.k6.f21659d6));
        return new f2.m1(ju0Var);
    }
}
