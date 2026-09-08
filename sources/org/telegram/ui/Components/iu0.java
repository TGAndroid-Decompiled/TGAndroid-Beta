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
public final class iu0 extends kl0 {
    public int E;
    public final xu0 G;
    public final Context f27285c;
    public final int d;
    public boolean f27289r;
    public String f27291w;
    public ah.j1 f27292x;
    public final ArrayList f27286e = new ArrayList();
    public final ArrayList f27287f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f27288n = new ArrayList();
    public boolean f27290s = false;
    public int v = 0;
    public int f27293y = -1;
    public final jq0 F = new jq0(this, 6);

    public iu0(xu0 xu0Var, Context context) {
        this.G = xu0Var;
        this.f27285c = context;
        this.d = xu0Var.f32753v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(ah.j1 j1Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f27291w)) {
            ah.j1 j1Var2 = this.f27292x;
            if (j1Var2 != null || j1Var != null) {
                if (j1Var2 != null && j1Var2.equals(j1Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f27291w = str;
        this.f27292x = j1Var;
        int i10 = this.f27293y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f27293y, true);
            this.f27293y = -1;
        }
        this.f27288n.clear();
        this.h.clear();
        this.f27287f.clear();
        int i12 = 0;
        this.v = 0;
        this.f27290s = false;
        this.f27289r = true;
        ArrayList arrayList = this.f27286e;
        arrayList.clear();
        if (this.f27292x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            qt0[] qt0VarArr = this.G.f32729k0;
            if (i12 >= qt0VarArr.length) {
                break;
            }
            qt0 qt0Var = qt0VarArr[i12];
            if (qt0Var.F == 11) {
                qt0Var.f29850w.e(true, true);
            }
            i12++;
        }
        if (this.f27292x == null) {
            l();
        }
        jq0 jq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(jq0Var);
        if (this.f27292x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(jq0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f27291w) && this.f27292x == null) {
            this.f27289r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20005q = this.f27291w;
        ah.j1 j1Var = this.f27292x;
        if (j1Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(j1Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) i2.g.h(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f27290s = false;
        int i11 = this.E + 1;
        this.E = i11;
        org.telegram.ui.dm dmVar = new org.telegram.ui.dm(this, i11, tL_messages_search, 16);
        if (this.f27292x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f27292x.g(), 0L, this.f27291w, 100, this.f27288n.size(), new bi.x2(1, this, dmVar), false);
        } else {
            dmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        qt0[] qt0VarArr = this.G.f32729k0;
        ArrayList arrayList2 = this.f27287f;
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
            arrayList = this.f27288n;
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
            for (int i12 = 0; i12 < qt0VarArr.length; i12++) {
                if (qt0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.f27286e.isEmpty()) {
                    wh.p pVar = qt0VarArr[i12].f29850w.d;
                    if (this.f27292x != null && TextUtils.isEmpty(this.f27291w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        ah.j1 j1Var = this.f27292x;
                        Paint.FontMetricsInt fontMetricsInt = qt0VarArr[i12].f29850w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(j1Var.f609f)) {
                            charSequence = j1Var.f609f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new z5(j1Var.f610g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f27291w);
                    }
                    pVar.setText(formatString);
                    qt0VarArr[i12].f29850w.f32783f.setVisibility(8);
                    qt0VarArr[i12].f29850w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f27287f.size() + this.f27286e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f27286e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f27287f;
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
            View view = c1Var.f45766a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r2Var.f22652s2 = z10;
                ArrayList arrayList = this.f27286e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f27287f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    r2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hg.a0 a0Var = new hg.a0(1, this.f27285c, true);
        xu0 xu0Var = this.G;
        a0Var.setDialogCellDelegate(xu0Var);
        a0Var.f22644r0 = true;
        a0Var.setBackgroundColor(xu0Var.h0(org.telegram.ui.ActionBar.j6.f20690d6));
        return new s4.c1(a0Var);
    }
}
