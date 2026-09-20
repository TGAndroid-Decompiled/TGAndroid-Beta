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
public final class uu0 extends ul0 {
    public int E;
    public final jv0 G;
    public final Context f28857c;
    public final int d;
    public boolean f28860r;
    public String f28862w;
    public zg.o0 f28863x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f28858f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28859n = new ArrayList();
    public boolean f28861s = false;
    public int v = 0;
    public int f28864y = -1;
    public final wq0 F = new wq0(this, 6);

    public uu0(jv0 jv0Var, Context context) {
        this.G = jv0Var;
        this.f28857c = context;
        this.d = jv0Var.f25528v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(zg.o0 o0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f28862w)) {
            zg.o0 o0Var2 = this.f28863x;
            if (o0Var2 != null || o0Var != null) {
                if (o0Var2 != null && o0Var2.equals(o0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f28862w = str;
        this.f28863x = o0Var;
        int i10 = this.f28864y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f28864y, true);
            this.f28864y = -1;
        }
        this.f28859n.clear();
        this.h.clear();
        this.f28858f.clear();
        int i12 = 0;
        this.v = 0;
        this.f28861s = false;
        this.f28860r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f28863x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            cu0[] cu0VarArr = this.G.f25504k0;
            if (i12 >= cu0VarArr.length) {
                break;
            }
            cu0 cu0Var = cu0VarArr[i12];
            if (cu0Var.F == 11) {
                cu0Var.f23409w.e(true, true);
            }
            i12++;
        }
        if (this.f28863x == null) {
            l();
        }
        wq0 wq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(wq0Var);
        if (this.f28863x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(wq0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f28862w) && this.f28863x == null) {
            this.f28860r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f18437q = this.f28862w;
        zg.o0 o0Var = this.f28863x;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f28861s = false;
        int i11 = this.E + 1;
        this.E = i11;
        wm wmVar = new wm(this, i11, tL_messages_search, 15);
        if (this.f28863x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f28863x.g(), 0L, this.f28862w, 100, this.f28859n.size(), new ai.k3(1, this, wmVar), false);
        } else {
            wmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        cu0[] cu0VarArr = this.G.f25504k0;
        ArrayList arrayList2 = this.f28858f;
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
            arrayList = this.f28859n;
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
            for (int i12 = 0; i12 < cu0VarArr.length; i12++) {
                if (cu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    vh.o oVar = cu0VarArr[i12].f23409w.d;
                    if (this.f28863x != null && TextUtils.isEmpty(this.f28862w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.o0 o0Var = this.f28863x;
                        Paint.FontMetricsInt fontMetricsInt = cu0VarArr[i12].f23409w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(o0Var.f49423f)) {
                            charSequence = o0Var.f49423f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new y5(o0Var.f49424g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f28862w);
                    }
                    oVar.setText(formatString);
                    cu0VarArr[i12].f23409w.f25551f.setVisibility(8);
                    cu0VarArr[i12].f23409w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28858f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f28858f;
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
            View view = c1Var.f42974a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f21015s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f28858f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var = new gg.a0(1, this.f28857c, true);
        jv0 jv0Var = this.G;
        a0Var.setDialogCellDelegate(jv0Var);
        a0Var.f21007r0 = true;
        a0Var.setBackgroundColor(jv0Var.h0(org.telegram.ui.ActionBar.j6.f19094d6));
        return new s4.c1(a0Var);
    }
}
