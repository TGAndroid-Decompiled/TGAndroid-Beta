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
public final class mv0 extends pm0 {
    public int E;
    public final bw0 G;
    public final Context f28954c;
    public final int d;
    public boolean f28958r;
    public String f28960w;
    public zg.n0 f28961x;
    public final ArrayList f28955e = new ArrayList();
    public final ArrayList f28956f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28957n = new ArrayList();
    public boolean f28959s = false;
    public int v = 0;
    public int f28962y = -1;
    public final or0 F = new or0(this, 6);

    public mv0(bw0 bw0Var, Context context) {
        this.G = bw0Var;
        this.f28954c = context;
        this.d = bw0Var.f25166v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final void E(zg.n0 n0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f28960w)) {
            zg.n0 n0Var2 = this.f28961x;
            if (n0Var2 != null || n0Var != null) {
                if (n0Var2 != null && n0Var2.equals(n0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f28960w = str;
        this.f28961x = n0Var;
        int i10 = this.f28962y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f28962y, true);
            this.f28962y = -1;
        }
        this.f28957n.clear();
        this.h.clear();
        this.f28956f.clear();
        int i12 = 0;
        this.v = 0;
        this.f28959s = false;
        this.f28958r = true;
        ArrayList arrayList = this.f28955e;
        arrayList.clear();
        if (this.f28961x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            uu0[] uu0VarArr = this.G.f25142k0;
            if (i12 >= uu0VarArr.length) {
                break;
            }
            uu0 uu0Var = uu0VarArr[i12];
            if (uu0Var.F == 11) {
                uu0Var.f31627w.e(true, true);
            }
            i12++;
        }
        if (this.f28961x == null) {
            l();
        }
        or0 or0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(or0Var);
        if (this.f28961x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(or0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f28960w) && this.f28961x == null) {
            this.f28958r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20147q = this.f28960w;
        zg.n0 n0Var = this.f28961x;
        if (n0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(n0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f28959s = false;
        int i11 = this.E + 1;
        this.E = i11;
        zk zkVar = new zk(this, i11, tL_messages_search, 16);
        if (this.f28961x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f28961x.g(), 0L, this.f28960w, 100, this.f28957n.size(), new ai.l3(1, this, zkVar), false);
        } else {
            zkVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        uu0[] uu0VarArr = this.G.f25142k0;
        ArrayList arrayList2 = this.f28956f;
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
            arrayList = this.f28957n;
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
                if (uu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.f28955e.isEmpty()) {
                    vh.n nVar = uu0VarArr[i12].f31627w.d;
                    if (this.f28961x != null && TextUtils.isEmpty(this.f28960w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.n0 n0Var = this.f28961x;
                        Paint.FontMetricsInt fontMetricsInt = uu0VarArr[i12].f31627w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(n0Var.f54617f)) {
                            charSequence = n0Var.f54617f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new b6(n0Var.f54618g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f28960w);
                    }
                    nVar.setText(formatString);
                    uu0VarArr[i12].f31627w.f24803f.setVisibility(8);
                    uu0VarArr[i12].f31627w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28956f.size() + this.f28955e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f28955e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f28956f;
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
            View view = d1Var.f47658a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f22857s2 = z10;
                ArrayList arrayList = this.f28955e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f28956f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        gg.z zVar = new gg.z(1, this.f28954c, true);
        bw0 bw0Var = this.G;
        zVar.setDialogCellDelegate(bw0Var);
        zVar.f22849r0 = true;
        zVar.setBackgroundColor(bw0Var.h0(org.telegram.ui.ActionBar.i6.f20797d6));
        return new s4.d1(zVar);
    }
}
