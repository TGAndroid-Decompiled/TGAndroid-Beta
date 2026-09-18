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
public final class vu0 extends vl0 {
    public int E;
    public final kv0 G;
    public final Context f29768c;
    public final int d;
    public boolean f29771r;
    public String f29773w;
    public zg.o0 f29774x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f29769f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f29770n = new ArrayList();
    public boolean f29772s = false;
    public int v = 0;
    public int f29775y = -1;
    public final xq0 F = new xq0(this, 6);

    public vu0(kv0 kv0Var, Context context) {
        this.G = kv0Var;
        this.f29768c = context;
        this.d = kv0Var.f25848v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(zg.o0 o0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f29773w)) {
            zg.o0 o0Var2 = this.f29774x;
            if (o0Var2 != null || o0Var != null) {
                if (o0Var2 != null && o0Var2.equals(o0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f29773w = str;
        this.f29774x = o0Var;
        int i10 = this.f29775y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f29775y, true);
            this.f29775y = -1;
        }
        this.f29770n.clear();
        this.h.clear();
        this.f29769f.clear();
        int i12 = 0;
        this.v = 0;
        this.f29772s = false;
        this.f29771r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f29774x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            du0[] du0VarArr = this.G.f25824k0;
            if (i12 >= du0VarArr.length) {
                break;
            }
            du0 du0Var = du0VarArr[i12];
            if (du0Var.F == 11) {
                du0Var.f23687w.e(true, true);
            }
            i12++;
        }
        if (this.f29774x == null) {
            l();
        }
        xq0 xq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(xq0Var);
        if (this.f29774x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(xq0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f29773w) && this.f29774x == null) {
            this.f29771r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f18405q = this.f29773w;
        zg.o0 o0Var = this.f29774x;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f29772s = false;
        int i11 = this.E + 1;
        this.E = i11;
        wm wmVar = new wm(this, i11, tL_messages_search, 15);
        if (this.f29774x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f29774x.g(), 0L, this.f29773w, 100, this.f29770n.size(), new ai.k3(1, this, wmVar), false);
        } else {
            wmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        du0[] du0VarArr = this.G.f25824k0;
        ArrayList arrayList2 = this.f29769f;
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
            arrayList = this.f29770n;
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
            for (int i12 = 0; i12 < du0VarArr.length; i12++) {
                if (du0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    vh.o oVar = du0VarArr[i12].f23687w.d;
                    if (this.f29774x != null && TextUtils.isEmpty(this.f29773w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.o0 o0Var = this.f29774x;
                        Paint.FontMetricsInt fontMetricsInt = du0VarArr[i12].f23687w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(o0Var.f49377f)) {
                            charSequence = o0Var.f49377f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new z5(o0Var.f49378g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f29773w);
                    }
                    oVar.setText(formatString);
                    du0VarArr[i12].f23687w.f25867f.setVisibility(8);
                    du0VarArr[i12].f23687w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f29769f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f29769f;
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
            View view = c1Var.f42929a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s2Var.f20976s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f29769f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    s2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var = new gg.a0(1, this.f29768c, true);
        kv0 kv0Var = this.G;
        a0Var.setDialogCellDelegate(kv0Var);
        a0Var.f20968r0 = true;
        a0Var.setBackgroundColor(kv0Var.h0(org.telegram.ui.ActionBar.j6.f19062d6));
        return new s4.c1(a0Var);
    }
}
