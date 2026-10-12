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
public final class iv0 extends lm0 {
    public int E;
    public final xv0 G;
    public final Context f26108c;
    public final int d;
    public boolean f26111r;
    public String f26113w;
    public ah.i1 f26114x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f26109f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f26110n = new ArrayList();
    public boolean f26112s = false;
    public int v = 0;
    public int f26115y = -1;
    public final lr0 F = new lr0(this, 7);

    public iv0(xv0 xv0Var, Context context) {
        this.G = xv0Var;
        this.f26108c = context;
        this.d = xv0Var.f31388v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(ah.i1 i1Var, String str) {
        long j10;
        if (TextUtils.equals(str, this.f26113w)) {
            ah.i1 i1Var2 = this.f26114x;
            if (i1Var2 != null || i1Var != null) {
                if (i1Var2 != null && i1Var2.equals(i1Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f26113w = str;
        this.f26114x = i1Var;
        int i10 = this.f26115y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f26115y, true);
            this.f26115y = -1;
        }
        this.f26110n.clear();
        this.h.clear();
        this.f26109f.clear();
        int i12 = 0;
        this.v = 0;
        this.f26112s = false;
        this.f26111r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f26114x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            qu0[] qu0VarArr = this.G.f31364k0;
            if (i12 >= qu0VarArr.length) {
                break;
            }
            qu0 qu0Var = qu0VarArr[i12];
            if (qu0Var.F == 11) {
                qu0Var.f28682w.e(true, true);
            }
            i12++;
        }
        if (this.f26114x == null) {
            l();
        }
        lr0 lr0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(lr0Var);
        if (this.f26114x != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        AndroidUtilities.runOnUIThread(lr0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f26113w) && this.f26114x == null) {
            this.f26111r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f19325q = this.f26113w;
        ah.i1 i1Var = this.f26114x;
        if (i1Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(i1Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) i2.d.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f26112s = false;
        int i11 = this.E + 1;
        this.E = i11;
        org.telegram.ui.gm gmVar = new org.telegram.ui.gm(this, i11, tL_messages_search, 17);
        if (this.f26114x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f26114x.g(), 0L, this.f26113w, 100, this.f26110n.size(), new bi.a3(1, this, gmVar), false);
        } else {
            gmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        qu0[] qu0VarArr = this.G.f31364k0;
        ArrayList arrayList2 = this.f26109f;
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
            arrayList = this.f26110n;
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
            for (int i12 = 0; i12 < qu0VarArr.length; i12++) {
                if (qu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    wh.n nVar = qu0VarArr[i12].f28682w.d;
                    if (this.f26114x != null && TextUtils.isEmpty(this.f26113w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        ah.i1 i1Var = this.f26114x;
                        Paint.FontMetricsInt fontMetricsInt = qu0VarArr[i12].f28682w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(i1Var.f779f)) {
                            charSequence = i1Var.f779f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new b6(i1Var.f780g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f26113w);
                    }
                    nVar.setText(formatString);
                    qu0VarArr[i12].f28682w.f30998f.setVisibility(8);
                    qu0VarArr[i12].f28682w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f26109f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f26109f;
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
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        if (i10 >= 0) {
            View view = b1Var.f44838a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f21895s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f26109f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar = new hg.z(1, this.f26108c, true);
        xv0 xv0Var = this.G;
        zVar.setDialogCellDelegate(xv0Var);
        zVar.f21887r0 = true;
        zVar.setBackgroundColor(xv0Var.h0(org.telegram.ui.ActionBar.g6.f19901d6));
        return new s4.b1(zVar);
    }
}
