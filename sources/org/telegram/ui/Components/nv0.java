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
public final class nv0 extends mm0 {
    public int E;
    public final bw0 G;
    public final Context f31076c;
    public final int d;
    public boolean f31079r;
    public String f31081w;
    public bh.x0 f31082x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f31077f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f31078n = new ArrayList();
    public boolean f31080s = false;
    public int v = 0;
    public int f31083y = -1;
    public final np0 F = new np0(this, 10);

    public nv0(bw0 bw0Var, Context context) {
        this.G = bw0Var;
        this.f31076c = context;
        this.d = bw0Var.f26992x1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final void E(bh.x0 x0Var, String str) {
        long j10;
        if (TextUtils.equals(str, this.f31081w)) {
            bh.x0 x0Var2 = this.f31082x;
            if (x0Var2 != null || x0Var != null) {
                if (x0Var2 != null && x0Var2.equals(x0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f31081w = str;
        this.f31082x = x0Var;
        int i10 = this.f31083y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f31083y, true);
            this.f31083y = -1;
        }
        this.f31078n.clear();
        this.h.clear();
        this.f31077f.clear();
        int i12 = 0;
        this.v = 0;
        this.f31080s = false;
        this.f31079r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f31082x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            uu0[] uu0VarArr = this.G.m0;
            if (i12 >= uu0VarArr.length) {
                break;
            }
            uu0 uu0Var = uu0VarArr[i12];
            if (uu0Var.E == 11) {
                uu0Var.v.e(true, true);
            }
            i12++;
        }
        if (this.f31082x == null) {
            l();
        }
        np0 np0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(np0Var);
        if (this.f31082x != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        AndroidUtilities.runOnUIThread(np0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f31081w) && this.f31082x == null) {
            this.f31079r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f22139q = this.f31081w;
        bh.x0 x0Var = this.f31082x;
        if (x0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(x0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) ic.a.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f31080s = false;
        int i11 = this.E + 1;
        this.E = i11;
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(this, i11, tL_messages_search, 19);
        if (this.f31082x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f31082x.g(), 0L, this.f31081w, 100, this.f31078n.size(), new di.h2(1, this, g4Var), false);
        } else {
            g4Var.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        uu0[] uu0VarArr = this.G.m0;
        ArrayList arrayList2 = this.f31077f;
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
            arrayList = this.f31078n;
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
            for (int i12 = 0; i12 < uu0VarArr.length; i12++) {
                if (uu0VarArr[i12].E == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    xh.n nVar = uu0VarArr[i12].v.d;
                    if (this.f31082x != null && TextUtils.isEmpty(this.f31081w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        bh.x0 x0Var = this.f31082x;
                        Paint.FontMetricsInt fontMetricsInt = uu0VarArr[i12].v.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(x0Var.f4208f)) {
                            charSequence = x0Var.f4208f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new c6(x0Var.f4209g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f31081w);
                    }
                    nVar.setText(formatString);
                    uu0VarArr[i12].v.f28315f.setVisibility(8);
                    uu0VarArr[i12].v.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f31077f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f31077f;
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        if (i10 >= 0) {
            View view = e1Var.f47773a;
            if (view instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p2Var.f24723s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    p2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f31077f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    p2Var.V(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ig.z zVar = new ig.z(1, this.f31076c, true);
        bw0 bw0Var = this.G;
        zVar.setDialogCellDelegate(bw0Var);
        zVar.f24715r0 = true;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, zVar, bw0Var.H1);
        return new s4.e1(zVar);
    }
}
