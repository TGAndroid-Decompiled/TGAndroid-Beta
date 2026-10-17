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
public final class dv0 extends hm0 {
    public int E;
    public final sv0 G;
    public final Context f25712c;
    public final int d;
    public boolean f25715r;
    public String f25717w;
    public ah.i1 f25718x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f25713f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f25714n = new ArrayList();
    public boolean f25716s = false;
    public int v = 0;
    public int f25719y = -1;
    public final fr0 F = new fr0(this, 6);

    public dv0(sv0 sv0Var, Context context) {
        this.G = sv0Var;
        this.f25712c = context;
        this.d = sv0Var.f30388v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(ah.i1 i1Var, String str) {
        long j10;
        if (TextUtils.equals(str, this.f25717w)) {
            ah.i1 i1Var2 = this.f25718x;
            if (i1Var2 != null || i1Var != null) {
                if (i1Var2 != null && i1Var2.equals(i1Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f25717w = str;
        this.f25718x = i1Var;
        int i10 = this.f25719y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f25719y, true);
            this.f25719y = -1;
        }
        this.f25714n.clear();
        this.h.clear();
        this.f25713f.clear();
        int i12 = 0;
        this.v = 0;
        this.f25716s = false;
        this.f25715r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f25718x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            lu0[] lu0VarArr = this.G.f30364k0;
            if (i12 >= lu0VarArr.length) {
                break;
            }
            lu0 lu0Var = lu0VarArr[i12];
            if (lu0Var.F == 11) {
                lu0Var.f28334w.e(true, true);
            }
            i12++;
        }
        if (this.f25718x == null) {
            l();
        }
        fr0 fr0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(fr0Var);
        if (this.f25718x != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        AndroidUtilities.runOnUIThread(fr0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f25717w) && this.f25718x == null) {
            this.f25715r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f20381q = this.f25717w;
        ah.i1 i1Var = this.f25718x;
        if (i1Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(i1Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) i0.a.h(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f25716s = false;
        int i11 = this.E + 1;
        this.E = i11;
        org.telegram.ui.i4 i4Var = new org.telegram.ui.i4(this, i11, tL_messages_search, 21);
        if (this.f25718x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f25718x.g(), 0L, this.f25717w, 100, this.f25714n.size(), new ci.i2(1, this, i4Var), false);
        } else {
            i4Var.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        lu0[] lu0VarArr = this.G.f30364k0;
        ArrayList arrayList2 = this.f25713f;
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
            arrayList = this.f25714n;
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
            for (int i12 = 0; i12 < lu0VarArr.length; i12++) {
                if (lu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    wh.n nVar = lu0VarArr[i12].f28334w.d;
                    if (this.f25718x != null && TextUtils.isEmpty(this.f25717w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        ah.i1 i1Var = this.f25718x;
                        Paint.FontMetricsInt fontMetricsInt = lu0VarArr[i12].f28334w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(i1Var.f785f)) {
                            charSequence = i1Var.f785f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new a6(i1Var.f786g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f25717w);
                    }
                    nVar.setText(formatString);
                    lu0VarArr[i12].f28334w.f30073f.setVisibility(8);
                    lu0VarArr[i12].f28334w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f25713f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f25713f;
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
            View view = b1Var.f45938a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r2Var.f22896s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f25713f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    r2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar = new hg.z(1, this.f25712c, true);
        sv0 sv0Var = this.G;
        zVar.setDialogCellDelegate(sv0Var);
        zVar.f22888r0 = true;
        zVar.setBackgroundColor(sv0Var.i0(org.telegram.ui.ActionBar.h6.f20986d6));
        return new s4.b1(zVar);
    }
}
