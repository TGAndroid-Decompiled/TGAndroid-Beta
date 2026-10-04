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
public final class av0 extends yl0 {
    public int E;
    public final pv0 G;
    public final Context f24680c;
    public final int d;
    public boolean f24684r;
    public String f24686w;
    public zg.o0 f24687x;
    public final ArrayList f24681e = new ArrayList();
    public final ArrayList f24682f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f24683n = new ArrayList();
    public boolean f24685s = false;
    public int v = 0;
    public int f24688y = -1;
    public final br0 F = new br0(this, 7);

    public av0(pv0 pv0Var, Context context) {
        this.G = pv0Var;
        this.f24680c = context;
        this.d = pv0Var.f29806v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(zg.o0 o0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f24686w)) {
            zg.o0 o0Var2 = this.f24687x;
            if (o0Var2 != null || o0Var != null) {
                if (o0Var2 != null && o0Var2.equals(o0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f24686w = str;
        this.f24687x = o0Var;
        int i10 = this.f24688y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f24688y, true);
            this.f24688y = -1;
        }
        this.f24683n.clear();
        this.h.clear();
        this.f24682f.clear();
        int i12 = 0;
        this.v = 0;
        this.f24685s = false;
        this.f24684r = true;
        ArrayList arrayList = this.f24681e;
        arrayList.clear();
        if (this.f24687x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            iu0[] iu0VarArr = this.G.f29782k0;
            if (i12 >= iu0VarArr.length) {
                break;
            }
            iu0 iu0Var = iu0VarArr[i12];
            if (iu0Var.F == 11) {
                iu0Var.f27509w.e(true, true);
            }
            i12++;
        }
        if (this.f24687x == null) {
            l();
        }
        br0 br0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(br0Var);
        if (this.f24687x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(br0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f24686w) && this.f24687x == null) {
            this.f24684r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20151q = this.f24686w;
        zg.o0 o0Var = this.f24687x;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f24685s = false;
        int i11 = this.E + 1;
        this.E = i11;
        zm zmVar = new zm(this, i11, tL_messages_search, 15);
        if (this.f24687x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f24687x.g(), 0L, this.f24686w, 100, this.f24683n.size(), new ai.k3(1, this, zmVar), false);
        } else {
            zmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        iu0[] iu0VarArr = this.G.f29782k0;
        ArrayList arrayList2 = this.f24682f;
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
            arrayList = this.f24683n;
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
            for (int i12 = 0; i12 < iu0VarArr.length; i12++) {
                if (iu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.f24681e.isEmpty()) {
                    vh.n nVar = iu0VarArr[i12].f27509w.d;
                    if (this.f24687x != null && TextUtils.isEmpty(this.f24686w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.o0 o0Var = this.f24687x;
                        Paint.FontMetricsInt fontMetricsInt = iu0VarArr[i12].f27509w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(o0Var.f53485f)) {
                            charSequence = o0Var.f53485f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new z5(o0Var.f53486g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f24686w);
                    }
                    nVar.setText(formatString);
                    iu0VarArr[i12].f27509w.f31202f.setVisibility(8);
                    iu0VarArr[i12].f27509w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f24682f.size() + this.f24681e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f24681e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f24682f;
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
            View view = c1Var.f46531a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f22865s2 = z10;
                ArrayList arrayList = this.f24681e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.U(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f24682f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.U(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var = new gg.a0(1, this.f24680c, true);
        pv0 pv0Var = this.G;
        a0Var.setDialogCellDelegate(pv0Var);
        a0Var.f22857r0 = true;
        a0Var.setBackgroundColor(pv0Var.h0(org.telegram.ui.ActionBar.i6.f20822d6));
        return new s4.c1(a0Var);
    }
}
