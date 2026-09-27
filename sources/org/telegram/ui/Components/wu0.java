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
public final class wu0 extends xl0 {
    public int E;
    public final lv0 G;
    public final Context f30182c;
    public final int d;
    public boolean f30185r;
    public String f30187w;
    public zg.p0 f30188x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f30183f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f30184n = new ArrayList();
    public boolean f30186s = false;
    public int v = 0;
    public int f30189y = -1;
    public final xq0 F = new xq0(this, 7);

    public wu0(lv0 lv0Var, Context context) {
        this.G = lv0Var;
        this.f30182c = context;
        this.d = lv0Var.f26212v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(zg.p0 p0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f30187w)) {
            zg.p0 p0Var2 = this.f30188x;
            if (p0Var2 != null || p0Var != null) {
                if (p0Var2 != null && p0Var2.equals(p0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f30187w = str;
        this.f30188x = p0Var;
        int i10 = this.f30189y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f30189y, true);
            this.f30189y = -1;
        }
        this.f30184n.clear();
        this.h.clear();
        this.f30183f.clear();
        int i12 = 0;
        this.v = 0;
        this.f30186s = false;
        this.f30185r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f30188x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            eu0[] eu0VarArr = this.G.f26188k0;
            if (i12 >= eu0VarArr.length) {
                break;
            }
            eu0 eu0Var = eu0VarArr[i12];
            if (eu0Var.F == 11) {
                eu0Var.f24131w.e(true, true);
            }
            i12++;
        }
        if (this.f30188x == null) {
            l();
        }
        xq0 xq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(xq0Var);
        if (this.f30188x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(xq0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f30187w) && this.f30188x == null) {
            this.f30185r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f18438q = this.f30187w;
        zg.p0 p0Var = this.f30188x;
        if (p0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(p0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f30186s = false;
        int i11 = this.E + 1;
        this.E = i11;
        ym ymVar = new ym(this, i11, tL_messages_search, 15);
        if (this.f30188x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f30188x.g(), 0L, this.f30187w, 100, this.f30184n.size(), new ai.k3(1, this, ymVar), false);
        } else {
            ymVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        eu0[] eu0VarArr = this.G.f26188k0;
        ArrayList arrayList2 = this.f30183f;
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
            arrayList = this.f30184n;
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
            for (int i12 = 0; i12 < eu0VarArr.length; i12++) {
                if (eu0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    vh.n nVar = eu0VarArr[i12].f24131w.d;
                    if (this.f30188x != null && TextUtils.isEmpty(this.f30187w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.p0 p0Var = this.f30188x;
                        Paint.FontMetricsInt fontMetricsInt = eu0VarArr[i12].f24131w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(p0Var.f49444f)) {
                            charSequence = p0Var.f49444f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new z5(p0Var.f49445g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f30187w);
                    }
                    nVar.setText(formatString);
                    eu0VarArr[i12].f24131w.f25881f.setVisibility(8);
                    eu0VarArr[i12].f24131w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f30183f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f30183f;
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
            View view = c1Var.f43005a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f21014s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f30183f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var = new gg.a0(1, this.f30182c, true);
        lv0 lv0Var = this.G;
        a0Var.setDialogCellDelegate(lv0Var);
        a0Var.f21006r0 = true;
        a0Var.setBackgroundColor(lv0Var.h0(org.telegram.ui.ActionBar.i6.f19057d6));
        return new s4.c1(a0Var);
    }
}
