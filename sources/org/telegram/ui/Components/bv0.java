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
public final class bv0 extends yl0 {
    public int E;
    public final qv0 G;
    public final Context f25107c;
    public final int d;
    public boolean f25111r;
    public String f25113w;
    public zg.m0 f25114x;
    public final ArrayList f25108e = new ArrayList();
    public final ArrayList f25109f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f25110n = new ArrayList();
    public boolean f25112s = false;
    public int v = 0;
    public int f25115y = -1;
    public final gq0 F = new gq0(this, 8);

    public bv0(qv0 qv0Var, Context context) {
        this.G = qv0Var;
        this.f25107c = context;
        this.d = qv0Var.f30263v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(zg.m0 m0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f25113w)) {
            zg.m0 m0Var2 = this.f25114x;
            if (m0Var2 != null || m0Var != null) {
                if (m0Var2 != null && m0Var2.equals(m0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f25113w = str;
        this.f25114x = m0Var;
        int i10 = this.f25115y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f25115y, true);
            this.f25115y = -1;
        }
        this.f25110n.clear();
        this.h.clear();
        this.f25109f.clear();
        int i12 = 0;
        this.v = 0;
        this.f25112s = false;
        this.f25111r = true;
        ArrayList arrayList = this.f25108e;
        arrayList.clear();
        if (this.f25114x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            ju0[] ju0VarArr = this.G.f30239k0;
            if (i12 >= ju0VarArr.length) {
                break;
            }
            ju0 ju0Var = ju0VarArr[i12];
            if (ju0Var.F == 11) {
                ju0Var.f27979w.e(true, true);
            }
            i12++;
        }
        if (this.f25114x == null) {
            l();
        }
        gq0 gq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(gq0Var);
        if (this.f25114x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(gq0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f25113w) && this.f25114x == null) {
            this.f25111r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20156q = this.f25113w;
        zg.m0 m0Var = this.f25114x;
        if (m0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(m0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f25112s = false;
        int i11 = this.E + 1;
        this.E = i11;
        zm zmVar = new zm(this, i11, tL_messages_search, 15);
        if (this.f25114x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f25114x.g(), 0L, this.f25113w, 100, this.f25110n.size(), new ai.k3(1, this, zmVar), false);
        } else {
            zmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        ju0[] ju0VarArr = this.G.f30239k0;
        ArrayList arrayList2 = this.f25109f;
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
            arrayList = this.f25110n;
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
            for (int i12 = 0; i12 < ju0VarArr.length; i12++) {
                if (ju0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.f25108e.isEmpty()) {
                    vh.n nVar = ju0VarArr[i12].f27979w.d;
                    if (this.f25114x != null && TextUtils.isEmpty(this.f25113w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.m0 m0Var = this.f25114x;
                        Paint.FontMetricsInt fontMetricsInt = ju0VarArr[i12].f27979w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(m0Var.f53471f)) {
                            charSequence = m0Var.f53471f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new z5(m0Var.f53472g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f25113w);
                    }
                    nVar.setText(formatString);
                    ju0VarArr[i12].f27979w.f31552f.setVisibility(8);
                    ju0VarArr[i12].f27979w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f25109f.size() + this.f25108e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f25108e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f25109f;
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        if (i10 >= 0) {
            View view = c1Var.f46538a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f22868s2 = z10;
                ArrayList arrayList = this.f25108e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.U(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f25109f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.U(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var = new gg.a0(1, this.f25107c, true);
        qv0 qv0Var = this.G;
        a0Var.setDialogCellDelegate(qv0Var);
        a0Var.f22860r0 = true;
        a0Var.setBackgroundColor(qv0Var.h0(org.telegram.ui.ActionBar.i6.f20827d6));
        return new s4.c1(a0Var);
    }
}
