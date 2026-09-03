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
public final class ju0 extends rl0 {
    public int B;
    public final yu0 D;
    public final Context f28182c;
    public final int d;
    public boolean f28186r;
    public String f28188w;
    public ng.q0 f28189x;
    public final ArrayList f28183e = new ArrayList();
    public final ArrayList f28184f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28185n = new ArrayList();
    public boolean f28187s = false;
    public int v = 0;
    public int f28190y = -1;
    public final nq0 C = new nq0(this, 6);

    public ju0(yu0 yu0Var, Context context) {
        this.D = yu0Var;
        this.f28182c = context;
        this.d = yu0Var.f33649s1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final void E(ng.q0 q0Var, String str) {
        long j10;
        if (TextUtils.equals(str, this.f28188w)) {
            ng.q0 q0Var2 = this.f28189x;
            if (q0Var2 != null || q0Var != null) {
                if (q0Var2 != null && q0Var2.equals(q0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f28188w = str;
        this.f28189x = q0Var;
        int i10 = this.f28190y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f28190y, true);
            this.f28190y = -1;
        }
        this.f28185n.clear();
        this.h.clear();
        this.f28184f.clear();
        int i12 = 0;
        this.v = 0;
        this.f28187s = false;
        this.f28186r = true;
        ArrayList arrayList = this.f28183e;
        arrayList.clear();
        if (this.f28189x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            qt0[] qt0VarArr = this.D.f33625h0;
            if (i12 >= qt0VarArr.length) {
                break;
            }
            qt0 qt0Var = qt0VarArr[i12];
            if (qt0Var.C == 11) {
                qt0Var.f30524w.e(true, true);
            }
            i12++;
        }
        if (this.f28189x == null) {
            l();
        }
        nq0 nq0Var = this.C;
        AndroidUtilities.cancelRunOnUIThread(nq0Var);
        if (this.f28189x != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        AndroidUtilities.runOnUIThread(nq0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f28188w) && this.f28189x == null) {
            this.f28186r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20954q = this.f28188w;
        ng.q0 q0Var = this.f28189x;
        if (q0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(q0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) l.d.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f28187s = false;
        int i11 = this.B + 1;
        this.B = i11;
        gy gyVar = new gy(this, i11, tL_messages_search, 13);
        if (this.f28189x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f28189x.g(), 0L, this.f28188w, 100, this.f28185n.size(), new oh.c2(1, this, gyVar), false);
        } else {
            gyVar.run();
        }
    }

    public final void G(boolean z4) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        qt0[] qt0VarArr = this.D.f33625h0;
        ArrayList arrayList2 = this.f28184f;
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
            arrayList = this.f28185n;
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
            for (int i12 = 0; i12 < qt0VarArr.length; i12++) {
                if (qt0VarArr[i12].C == 11 && arrayList2.isEmpty() && this.f28183e.isEmpty()) {
                    jh.s sVar = qt0VarArr[i12].f30524w.d;
                    if (this.f28189x != null && TextUtils.isEmpty(this.f28188w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        ng.q0 q0Var = this.f28189x;
                        Paint.FontMetricsInt fontMetricsInt = qt0VarArr[i12].f30524w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(q0Var.f16180f)) {
                            charSequence = q0Var.f16180f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new u5(q0Var.f16181g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f28188w);
                    }
                    sVar.setText(formatString);
                    qt0VarArr[i12].f30524w.f34034f.setVisibility(8);
                    qt0VarArr[i12].f30524w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28184f.size() + this.f28183e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f28183e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f28184f;
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
                r2Var.f23488p2 = z4;
                ArrayList arrayList = this.f28183e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f28184f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    r2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        iu0 iu0Var = new iu0(0, this.f28182c, true);
        yu0 yu0Var = this.D;
        iu0Var.setDialogCellDelegate(yu0Var);
        iu0Var.f23481o0 = true;
        iu0Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.k6.f21661d6));
        return new f2.m1(iu0Var);
    }
}
