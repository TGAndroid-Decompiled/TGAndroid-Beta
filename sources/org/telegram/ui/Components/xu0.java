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
public final class xu0 extends yl0 {
    public int E;
    public final mv0 G;
    public final Context f30507c;
    public final int d;
    public boolean f30510r;
    public String f30512w;
    public zg.o0 f30513x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f30508f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f30509n = new ArrayList();
    public boolean f30511s = false;
    public int v = 0;
    public int f30514y = -1;
    public final zq0 F = new zq0(this, 7);

    public xu0(mv0 mv0Var, Context context) {
        this.G = mv0Var;
        this.f30507c = context;
        this.d = mv0Var.f26449v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(zg.o0 o0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f30512w)) {
            zg.o0 o0Var2 = this.f30513x;
            if (o0Var2 != null || o0Var != null) {
                if (o0Var2 != null && o0Var2.equals(o0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f30512w = str;
        this.f30513x = o0Var;
        int i10 = this.f30514y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f30514y, true);
            this.f30514y = -1;
        }
        this.f30509n.clear();
        this.h.clear();
        this.f30508f.clear();
        int i12 = 0;
        this.v = 0;
        this.f30511s = false;
        this.f30510r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f30513x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            fu0[] fu0VarArr = this.G.f26425k0;
            if (i12 >= fu0VarArr.length) {
                break;
            }
            fu0 fu0Var = fu0VarArr[i12];
            if (fu0Var.F == 11) {
                fu0Var.f24358w.e(true, true);
            }
            i12++;
        }
        if (this.f30513x == null) {
            l();
        }
        zq0 zq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(zq0Var);
        if (this.f30513x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(zq0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f30512w) && this.f30513x == null) {
            this.f30510r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f18461q = this.f30512w;
        zg.o0 o0Var = this.f30513x;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f30511s = false;
        int i11 = this.E + 1;
        this.E = i11;
        zm zmVar = new zm(this, i11, tL_messages_search, 15);
        if (this.f30513x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f30513x.g(), 0L, this.f30512w, 100, this.f30509n.size(), new ai.k3(1, this, zmVar), false);
        } else {
            zmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        fu0[] fu0VarArr = this.G.f26425k0;
        ArrayList arrayList2 = this.f30508f;
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
            arrayList = this.f30509n;
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
            for (int i12 = 0; i12 < fu0VarArr.length; i12++) {
                if (fu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    vh.n nVar = fu0VarArr[i12].f24358w.d;
                    if (this.f30513x != null && TextUtils.isEmpty(this.f30512w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.o0 o0Var = this.f30513x;
                        Paint.FontMetricsInt fontMetricsInt = fu0VarArr[i12].f24358w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(o0Var.f49504f)) {
                            charSequence = o0Var.f49504f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new z5(o0Var.f49505g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f30512w);
                    }
                    nVar.setText(formatString);
                    fu0VarArr[i12].f24358w.f26146f.setVisibility(8);
                    fu0VarArr[i12].f24358w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f30508f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f30508f;
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
            View view = c1Var.f43068a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f21031s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f30508f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var = new gg.a0(1, this.f30507c, true);
        mv0 mv0Var = this.G;
        a0Var.setDialogCellDelegate(mv0Var);
        a0Var.f21023r0 = true;
        a0Var.setBackgroundColor(mv0Var.h0(org.telegram.ui.ActionBar.h6.f19076d6));
        return new s4.c1(a0Var);
    }
}
