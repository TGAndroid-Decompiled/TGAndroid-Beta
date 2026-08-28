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
public final class pt0 extends vk0 {
    public int A;
    public final eu0 C;
    public final Context f31752c;
    public final int d;
    public boolean f31756r;
    public String f31758w;
    public hg.r0 f31759x;
    public final ArrayList f31753e = new ArrayList();
    public final ArrayList f31754f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f31755n = new ArrayList();
    public boolean f31757s = false;
    public int v = 0;
    public int f31760y = -1;
    public final tp0 B = new tp0(this, 6);

    public pt0(eu0 eu0Var, Context context) {
        this.C = eu0Var;
        this.f31752c = context;
        this.d = eu0Var.f28160r1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E(hg.r0 r0Var, String str) {
        long j10;
        if (TextUtils.equals(str, this.f31758w)) {
            hg.r0 r0Var2 = this.f31759x;
            if (r0Var2 != null || r0Var != null) {
                if (r0Var2 != null && r0Var2.equals(r0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f31758w = str;
        this.f31759x = r0Var;
        int i9 = this.f31760y;
        int i10 = this.d;
        if (i9 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f31760y, true);
            this.f31760y = -1;
        }
        this.f31755n.clear();
        this.h.clear();
        this.f31754f.clear();
        int i11 = 0;
        this.v = 0;
        this.f31757s = false;
        this.f31756r = true;
        ArrayList arrayList = this.f31753e;
        arrayList.clear();
        if (this.f31759x == null) {
            arrayList.addAll(MessagesController.getInstance(i10).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            xs0[] xs0VarArr = this.C.f28137g0;
            if (i11 >= xs0VarArr.length) {
                break;
            }
            xs0 xs0Var = xs0VarArr[i11];
            if (xs0Var.B == 11) {
                xs0Var.f34763w.e(true, true);
            }
            i11++;
        }
        if (this.f31759x == null) {
            l();
        }
        tp0 tp0Var = this.B;
        AndroidUtilities.cancelRunOnUIThread(tp0Var);
        if (this.f31759x != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        AndroidUtilities.runOnUIThread(tp0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f31758w) && this.f31759x == null) {
            this.f31756r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i9 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i9).getInputPeer(UserConfig.getInstance(i9).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f22489q = this.f31758w;
        hg.r0 r0Var = this.f31759x;
        if (r0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(r0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) j3.r0.j(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f31757s = false;
        int i10 = this.A + 1;
        this.A = i10;
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, i10, tL_messages_search, 16);
        if (this.f31759x != null) {
            MessagesStorage.getInstance(i9).searchSavedByTag(this.f31759x.g(), 0L, this.f31758w, 100, this.f31755n.size(), new ih.c2(1, this, rlVar), false);
        } else {
            rlVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        xs0[] xs0VarArr = this.C.f28137g0;
        ArrayList arrayList2 = this.f31754f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i9 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i9 >= arrayList3.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList3.get(i9);
            if (messageObject != null && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                hashSet.add(Integer.valueOf(messageObject.getId()));
                arrayList2.add(messageObject);
            }
            i9++;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.f31755n;
            if (i10 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (messageObject2 != null && !hashSet.contains(Integer.valueOf(messageObject2.getId()))) {
                hashSet.add(Integer.valueOf(messageObject2.getId()));
                arrayList2.add(messageObject2);
            }
            i10++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < xs0VarArr.length; i11++) {
                if (xs0VarArr[i11].B == 11 && arrayList2.isEmpty() && this.f31753e.isEmpty()) {
                    dh.u uVar = xs0VarArr[i11].f34763w.d;
                    if (this.f31759x != null && TextUtils.isEmpty(this.f31758w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        hg.r0 r0Var = this.f31759x;
                        Paint.FontMetricsInt fontMetricsInt = xs0VarArr[i11].f34763w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(r0Var.f10717f)) {
                            charSequence = r0Var.f10717f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new t5(r0Var.f10718g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f31758w);
                    }
                    uVar.setText(formatString);
                    xs0VarArr[i11].f34763w.f28886f.setVisibility(8);
                    xs0VarArr[i11].f34763w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f31754f.size() + this.f31753e.size();
    }

    @Override
    public final long i(int i9) {
        int hash;
        if (i9 < 0) {
            return i9;
        }
        ArrayList arrayList = this.f31753e;
        if (i9 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i9)).dialogId));
        } else {
            int size = i9 - arrayList.size();
            ArrayList arrayList2 = this.f31754f;
            if (size < arrayList2.size()) {
                hash = Objects.hash(2, Long.valueOf(((MessageObject) arrayList2.get(size)).getSavedDialogId()), Integer.valueOf(((MessageObject) arrayList2.get(size)).getId()));
            } else {
                return size;
            }
        }
        return hash;
    }

    @Override
    public final int j(int i9) {
        return 23;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        if (i9 >= 0) {
            View view = q1Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (i9 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r2Var.f25024o2 = z10;
                ArrayList arrayList = this.f31753e;
                if (i9 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i9);
                    r2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i9 - arrayList.size();
                ArrayList arrayList2 = this.f31754f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    r2Var.V(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        of.x xVar = new of.x(1, this.f31752c, true);
        eu0 eu0Var = this.C;
        xVar.setDialogCellDelegate(eu0Var);
        xVar.f25017n0 = true;
        xVar.setBackgroundColor(eu0Var.h0(org.telegram.ui.ActionBar.f6.f23001d6));
        return new f2.q1(xVar);
    }
}
