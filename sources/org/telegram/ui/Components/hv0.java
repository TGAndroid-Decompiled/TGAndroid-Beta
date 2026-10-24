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
public final class hv0 extends km0 {
    public int E;
    public final wv0 G;
    public final Context f27177c;
    public final int d;
    public boolean f27180r;
    public String f27182w;
    public ah.i1 f27183x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f27178f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f27179n = new ArrayList();
    public boolean f27181s = false;
    public int v = 0;
    public int f27184y = -1;
    public final jr0 F = new jr0(this, 7);

    public hv0(wv0 wv0Var, Context context) {
        this.G = wv0Var;
        this.f27177c = context;
        this.d = wv0Var.f32410v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(ah.i1 i1Var, String str) {
        long j10;
        if (TextUtils.equals(str, this.f27182w)) {
            ah.i1 i1Var2 = this.f27183x;
            if (i1Var2 != null || i1Var != null) {
                if (i1Var2 != null && i1Var2.equals(i1Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f27182w = str;
        this.f27183x = i1Var;
        int i10 = this.f27184y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f27184y, true);
            this.f27184y = -1;
        }
        this.f27179n.clear();
        this.h.clear();
        this.f27178f.clear();
        int i12 = 0;
        this.v = 0;
        this.f27181s = false;
        this.f27180r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f27183x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            pu0[] pu0VarArr = this.G.f32386k0;
            if (i12 >= pu0VarArr.length) {
                break;
            }
            pu0 pu0Var = pu0VarArr[i12];
            if (pu0Var.F == 11) {
                pu0Var.f29679w.e(true, true);
            }
            i12++;
        }
        if (this.f27183x == null) {
            l();
        }
        jr0 jr0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(jr0Var);
        if (this.f27183x != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        AndroidUtilities.runOnUIThread(jr0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f27182w) && this.f27183x == null) {
            this.f27180r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20453q = this.f27182w;
        ah.i1 i1Var = this.f27183x;
        if (i1Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(i1Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) i2.o1.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f27181s = false;
        int i11 = this.E + 1;
        this.E = i11;
        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(this, i11, tL_messages_search, 21);
        if (this.f27183x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f27183x.g(), 0L, this.f27182w, 100, this.f27179n.size(), new ci.h2(1, this, h4Var), false);
        } else {
            h4Var.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        pu0[] pu0VarArr = this.G.f32386k0;
        ArrayList arrayList2 = this.f27178f;
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
            arrayList = this.f27179n;
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
            for (int i12 = 0; i12 < pu0VarArr.length; i12++) {
                if (pu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    wh.n nVar = pu0VarArr[i12].f29679w.d;
                    if (this.f27183x != null && TextUtils.isEmpty(this.f27182w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        ah.i1 i1Var = this.f27183x;
                        Paint.FontMetricsInt fontMetricsInt = pu0VarArr[i12].f29679w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(i1Var.f784f)) {
                            charSequence = i1Var.f784f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new y5(i1Var.f785g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f27182w);
                    }
                    nVar.setText(formatString);
                    pu0VarArr[i12].f29679w.f32069f.setVisibility(8);
                    pu0VarArr[i12].f29679w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f27178f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f27178f;
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
            View view = b1Var.f46342a;
            if (view instanceof org.telegram.ui.Cells.q2) {
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q2Var.f23011s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    q2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f27178f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    q2Var.V(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar = new hg.z(1, this.f27177c, true);
        wv0 wv0Var = this.G;
        zVar.setDialogCellDelegate(wv0Var);
        zVar.f23003r0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, zVar, wv0Var.F1);
        return new s4.b1(zVar);
    }
}
