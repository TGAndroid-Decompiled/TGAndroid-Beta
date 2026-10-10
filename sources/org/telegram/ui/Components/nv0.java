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
public final class nv0 extends qm0 {
    public int E;
    public final cw0 G;
    public final Context f29251c;
    public final int d;
    public boolean f29255r;
    public String f29257w;
    public zg.n0 f29258x;
    public final ArrayList f29252e = new ArrayList();
    public final ArrayList f29253f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f29254n = new ArrayList();
    public boolean f29256s = false;
    public int v = 0;
    public int f29259y = -1;
    public final pr0 F = new pr0(this, 6);

    public nv0(cw0 cw0Var, Context context) {
        this.G = cw0Var;
        this.f29251c = context;
        this.d = cw0Var.f25474v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final void E(zg.n0 n0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f29257w)) {
            zg.n0 n0Var2 = this.f29258x;
            if (n0Var2 != null || n0Var != null) {
                if (n0Var2 != null && n0Var2.equals(n0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f29257w = str;
        this.f29258x = n0Var;
        int i10 = this.f29259y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f29259y, true);
            this.f29259y = -1;
        }
        this.f29254n.clear();
        this.h.clear();
        this.f29253f.clear();
        int i12 = 0;
        this.v = 0;
        this.f29256s = false;
        this.f29255r = true;
        ArrayList arrayList = this.f29252e;
        arrayList.clear();
        if (this.f29258x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            vu0[] vu0VarArr = this.G.f25450k0;
            if (i12 >= vu0VarArr.length) {
                break;
            }
            vu0 vu0Var = vu0VarArr[i12];
            if (vu0Var.F == 11) {
                vu0Var.f32521w.e(true, true);
            }
            i12++;
        }
        if (this.f29258x == null) {
            l();
        }
        pr0 pr0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(pr0Var);
        if (this.f29258x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(pr0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f29257w) && this.f29258x == null) {
            this.f29255r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20151q = this.f29257w;
        zg.n0 n0Var = this.f29258x;
        if (n0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(n0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f29256s = false;
        int i11 = this.E + 1;
        this.E = i11;
        zk zkVar = new zk(this, i11, tL_messages_search, 16);
        if (this.f29258x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f29258x.g(), 0L, this.f29257w, 100, this.f29254n.size(), new ai.l3(1, this, zkVar), false);
        } else {
            zkVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        vu0[] vu0VarArr = this.G.f25450k0;
        ArrayList arrayList2 = this.f29253f;
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
            arrayList = this.f29254n;
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
            for (int i12 = 0; i12 < vu0VarArr.length; i12++) {
                if (vu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.f29252e.isEmpty()) {
                    vh.n nVar = vu0VarArr[i12].f32521w.d;
                    if (this.f29258x != null && TextUtils.isEmpty(this.f29257w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.n0 n0Var = this.f29258x;
                        Paint.FontMetricsInt fontMetricsInt = vu0VarArr[i12].f32521w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(n0Var.f54661f)) {
                            charSequence = n0Var.f54661f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new b6(n0Var.f54662g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f29257w);
                    }
                    nVar.setText(formatString);
                    vu0VarArr[i12].f32521w.f25086f.setVisibility(8);
                    vu0VarArr[i12].f32521w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f29253f.size() + this.f29252e.size();
    }

    @Override
    public final long i(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f29252e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f29253f;
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
            View view = d1Var.f47702a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f22861s2 = z10;
                ArrayList arrayList = this.f29252e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f29253f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        gg.z zVar = new gg.z(1, this.f29251c, true);
        cw0 cw0Var = this.G;
        zVar.setDialogCellDelegate(cw0Var);
        zVar.f22853r0 = true;
        zVar.setBackgroundColor(cw0Var.h0(org.telegram.ui.ActionBar.i6.f20801d6));
        return new s4.d1(zVar);
    }
}
