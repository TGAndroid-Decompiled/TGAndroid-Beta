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
public final class bu0 extends il0 {
    public int A;
    public final qu0 C;
    public final Context f27227c;
    public final int d;
    public boolean f27231r;
    public String f27233w;
    public kg.q0 f27234x;
    public final ArrayList f27228e = new ArrayList();
    public final ArrayList f27229f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f27230n = new ArrayList();
    public boolean f27232s = false;
    public int v = 0;
    public int f27235y = -1;
    public final fq0 B = new fq0(this, 6);

    public bu0(qu0 qu0Var, Context context) {
        this.C = qu0Var;
        this.f27227c = context;
        this.d = qu0Var.f32093r1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final void E(kg.q0 q0Var, String str) {
        long j10;
        if (TextUtils.equals(str, this.f27233w)) {
            kg.q0 q0Var2 = this.f27234x;
            if (q0Var2 != null || q0Var != null) {
                if (q0Var2 != null && q0Var2.equals(q0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f27233w = str;
        this.f27234x = q0Var;
        int i10 = this.f27235y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f27235y, true);
            this.f27235y = -1;
        }
        this.f27230n.clear();
        this.h.clear();
        this.f27229f.clear();
        int i12 = 0;
        this.v = 0;
        this.f27232s = false;
        this.f27231r = true;
        ArrayList arrayList = this.f27228e;
        arrayList.clear();
        if (this.f27234x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            it0[] it0VarArr = this.C.f32070g0;
            if (i12 >= it0VarArr.length) {
                break;
            }
            it0 it0Var = it0VarArr[i12];
            if (it0Var.B == 11) {
                it0Var.f29471w.e(true, true);
            }
            i12++;
        }
        if (this.f27234x == null) {
            l();
        }
        fq0 fq0Var = this.B;
        AndroidUtilities.cancelRunOnUIThread(fq0Var);
        if (this.f27234x != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        AndroidUtilities.runOnUIThread(fq0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f27233w) && this.f27234x == null) {
            this.f27231r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f22501q = this.f27233w;
        kg.q0 q0Var = this.f27234x;
        if (q0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(q0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) j7.l1.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f27232s = false;
        int i11 = this.A + 1;
        this.A = i11;
        rm rmVar = new rm(this, i11, tL_messages_search, 15);
        if (this.f27234x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f27234x.g(), 0L, this.f27233w, 100, this.f27230n.size(), new lh.a2(1, this, rmVar), false);
        } else {
            rmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        it0[] it0VarArr = this.C.f32070g0;
        ArrayList arrayList2 = this.f27229f;
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
            arrayList = this.f27230n;
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
        if (!z10 || !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < it0VarArr.length; i12++) {
                if (it0VarArr[i12].B == 11 && arrayList2.isEmpty() && this.f27228e.isEmpty()) {
                    gh.s sVar = it0VarArr[i12].f29471w.d;
                    if (this.f27234x != null && TextUtils.isEmpty(this.f27233w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        kg.q0 q0Var = this.f27234x;
                        Paint.FontMetricsInt fontMetricsInt = it0VarArr[i12].f29471w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(q0Var.f13825f)) {
                            charSequence = q0Var.f13825f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new y5(q0Var.f13826g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f27233w);
                    }
                    sVar.setText(formatString);
                    it0VarArr[i12].f29471w.f32123f.setVisibility(8);
                    it0VarArr[i12].f29471w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f27229f.size() + this.f27228e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f27228e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f27229f;
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
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        if (i10 >= 0) {
            View view = n1Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p2Var.f24898o2 = z10;
                ArrayList arrayList = this.f27228e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    p2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f27229f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    p2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        au0 au0Var = new au0(0, this.f27227c, true);
        qu0 qu0Var = this.C;
        au0Var.setDialogCellDelegate(qu0Var);
        au0Var.f24891n0 = true;
        au0Var.setBackgroundColor(qu0Var.h0(org.telegram.ui.ActionBar.g6.f23062d6));
        return new f2.n1(au0Var);
    }
}
