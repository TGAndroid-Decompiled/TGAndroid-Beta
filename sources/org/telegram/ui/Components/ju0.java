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
public final class ju0 extends ql0 {
    public int B;
    public final yu0 D;
    public final Context f26053c;
    public final int d;
    public boolean f26056r;
    public String f26058w;
    public mg.q0 f26059x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f26054f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f26055n = new ArrayList();
    public boolean f26057s = false;
    public int v = 0;
    public int f26060y = -1;
    public final nq0 C = new nq0(this, 6);

    public ju0(yu0 yu0Var, Context context) {
        this.D = yu0Var;
        this.f26053c = context;
        this.d = yu0Var.f31155s1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final void E(mg.q0 q0Var, String str) {
        long j10;
        if (TextUtils.equals(str, this.f26058w)) {
            mg.q0 q0Var2 = this.f26059x;
            if (q0Var2 != null || q0Var != null) {
                if (q0Var2 != null && q0Var2.equals(q0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f26058w = str;
        this.f26059x = q0Var;
        int i10 = this.f26060y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f26060y, true);
            this.f26060y = -1;
        }
        this.f26055n.clear();
        this.h.clear();
        this.f26054f.clear();
        int i12 = 0;
        this.v = 0;
        this.f26057s = false;
        this.f26056r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f26059x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            qt0[] qt0VarArr = this.D.f31131h0;
            if (i12 >= qt0VarArr.length) {
                break;
            }
            qt0 qt0Var = qt0VarArr[i12];
            if (qt0Var.C == 11) {
                qt0Var.f28263w.e(true, true);
            }
            i12++;
        }
        if (this.f26059x == null) {
            l();
        }
        nq0 nq0Var = this.C;
        AndroidUtilities.cancelRunOnUIThread(nq0Var);
        if (this.f26059x != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        AndroidUtilities.runOnUIThread(nq0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f26058w) && this.f26059x == null) {
            this.f26056r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f19268q = this.f26058w;
        mg.q0 q0Var = this.f26059x;
        if (q0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(q0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) kf.k0.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f26057s = false;
        int i11 = this.B + 1;
        this.B = i11;
        ey eyVar = new ey(this, i11, tL_messages_search, 13);
        if (this.f26059x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f26059x.g(), 0L, this.f26058w, 100, this.f26055n.size(), new nh.b2(1, this, eyVar), false);
        } else {
            eyVar.run();
        }
    }

    public final void G(boolean z4) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        qt0[] qt0VarArr = this.D.f31131h0;
        ArrayList arrayList2 = this.f26054f;
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
            arrayList = this.f26055n;
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
                if (qt0VarArr[i12].C == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    ih.s sVar = qt0VarArr[i12].f28263w.d;
                    if (this.f26059x != null && TextUtils.isEmpty(this.f26058w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        mg.q0 q0Var = this.f26059x;
                        Paint.FontMetricsInt fontMetricsInt = qt0VarArr[i12].f28263w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(q0Var.f14095f)) {
                            charSequence = q0Var.f14095f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new u5(q0Var.f14096g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f26058w);
                    }
                    sVar.setText(formatString);
                    qt0VarArr[i12].f28263w.f31485f.setVisibility(8);
                    qt0VarArr[i12].f28263w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f26054f.size() + this.e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f26054f;
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
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        if (i10 >= 0) {
            View view = l1Var.f5774a;
            if (view instanceof org.telegram.ui.Cells.q2) {
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                if (i10 + 1 < h()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                q2Var.f21628p2 = z4;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    q2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f26054f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    q2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        iu0 iu0Var = new iu0(0, this.f26053c, true);
        yu0 yu0Var = this.D;
        iu0Var.setDialogCellDelegate(yu0Var);
        iu0Var.f21621o0 = true;
        iu0Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.j6.f19881d6));
        return new f2.l1(iu0Var);
    }
}
