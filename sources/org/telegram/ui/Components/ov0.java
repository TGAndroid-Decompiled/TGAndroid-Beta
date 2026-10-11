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
public final class ov0 extends rm0 {
    public int E;
    public final dw0 G;
    public final Context f29532c;
    public final int d;
    public boolean f29536r;
    public String f29538w;
    public zg.n0 f29539x;
    public final ArrayList f29533e = new ArrayList();
    public final ArrayList f29534f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f29535n = new ArrayList();
    public boolean f29537s = false;
    public int v = 0;
    public int f29540y = -1;
    public final qr0 F = new qr0(this, 6);

    public ov0(dw0 dw0Var, Context context) {
        this.G = dw0Var;
        this.f29532c = context;
        this.d = dw0Var.f25735v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final void E(zg.n0 n0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f29538w)) {
            zg.n0 n0Var2 = this.f29539x;
            if (n0Var2 != null || n0Var != null) {
                if (n0Var2 != null && n0Var2.equals(n0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f29538w = str;
        this.f29539x = n0Var;
        int i10 = this.f29540y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f29540y, true);
            this.f29540y = -1;
        }
        this.f29535n.clear();
        this.h.clear();
        this.f29534f.clear();
        int i12 = 0;
        this.v = 0;
        this.f29537s = false;
        this.f29536r = true;
        ArrayList arrayList = this.f29533e;
        arrayList.clear();
        if (this.f29539x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            wu0[] wu0VarArr = this.G.f25711k0;
            if (i12 >= wu0VarArr.length) {
                break;
            }
            wu0 wu0Var = wu0VarArr[i12];
            if (wu0Var.F == 11) {
                wu0Var.f32746w.e(true, true);
            }
            i12++;
        }
        if (this.f29539x == null) {
            l();
        }
        qr0 qr0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(qr0Var);
        if (this.f29539x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(qr0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f29538w) && this.f29539x == null) {
            this.f29536r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20141q = this.f29538w;
        zg.n0 n0Var = this.f29539x;
        if (n0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(n0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f29537s = false;
        int i11 = this.E + 1;
        this.E = i11;
        zk zkVar = new zk(this, i11, tL_messages_search, 16);
        if (this.f29539x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f29539x.g(), 0L, this.f29538w, 100, this.f29535n.size(), new ai.l3(1, this, zkVar), false);
        } else {
            zkVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        wu0[] wu0VarArr = this.G.f25711k0;
        ArrayList arrayList2 = this.f29534f;
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
            arrayList = this.f29535n;
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
            for (int i12 = 0; i12 < wu0VarArr.length; i12++) {
                if (wu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.f29533e.isEmpty()) {
                    vh.n nVar = wu0VarArr[i12].f32746w.d;
                    if (this.f29539x != null && TextUtils.isEmpty(this.f29538w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.n0 n0Var = this.f29539x;
                        Paint.FontMetricsInt fontMetricsInt = wu0VarArr[i12].f32746w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(n0Var.f54704f)) {
                            charSequence = n0Var.f54704f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new b6(n0Var.f54705g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f29538w);
                    }
                    nVar.setText(formatString);
                    wu0VarArr[i12].f32746w.f25352f.setVisibility(8);
                    wu0VarArr[i12].f32746w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f29534f.size() + this.f29533e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f29533e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f29534f;
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        if (i10 >= 0) {
            View view = d1Var.f47748a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f22849s2 = z10;
                ArrayList arrayList = this.f29533e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f29534f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        gg.z zVar = new gg.z(1, this.f29532c, true);
        dw0 dw0Var = this.G;
        zVar.setDialogCellDelegate(dw0Var);
        zVar.f22841r0 = true;
        zVar.setBackgroundColor(dw0Var.h0(org.telegram.ui.ActionBar.h6.f20786d6));
        return new s4.d1(zVar);
    }
}
