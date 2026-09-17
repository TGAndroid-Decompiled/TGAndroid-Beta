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
public final class ku0 extends ll0 {
    public int E;
    public final zu0 G;
    public final Context f25685c;
    public final int d;
    public boolean f25688r;
    public String f25690w;
    public zg.p0 f25691x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f25686f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f25687n = new ArrayList();
    public boolean f25689s = false;
    public int v = 0;
    public int f25692y = -1;
    public final kq0 F = new kq0(this, 6);

    public ku0(zu0 zu0Var, Context context) {
        this.G = zu0Var;
        this.f25685c = context;
        this.d = zu0Var.f30656v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(zg.p0 p0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f25690w)) {
            zg.p0 p0Var2 = this.f25691x;
            if (p0Var2 != null || p0Var != null) {
                if (p0Var2 != null && p0Var2.equals(p0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f25690w = str;
        this.f25691x = p0Var;
        int i10 = this.f25692y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f25692y, true);
            this.f25692y = -1;
        }
        this.f25687n.clear();
        this.h.clear();
        this.f25686f.clear();
        int i12 = 0;
        this.v = 0;
        this.f25689s = false;
        this.f25688r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f25691x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            st0[] st0VarArr = this.G.f30632k0;
            if (i12 >= st0VarArr.length) {
                break;
            }
            st0 st0Var = st0VarArr[i12];
            if (st0Var.F == 11) {
                st0Var.f27924w.e(true, true);
            }
            i12++;
        }
        if (this.f25691x == null) {
            l();
        }
        kq0 kq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(kq0Var);
        if (this.f25691x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(kq0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f25690w) && this.f25691x == null) {
            this.f25688r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f18230q = this.f25690w;
        zg.p0 p0Var = this.f25691x;
        if (p0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(p0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.h(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f25689s = false;
        int i11 = this.E + 1;
        this.E = i11;
        wm wmVar = new wm(this, i11, tL_messages_search, 15);
        if (this.f25691x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f25691x.g(), 0L, this.f25690w, 100, this.f25687n.size(), new ai.k3(1, this, wmVar), false);
        } else {
            wmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        st0[] st0VarArr = this.G.f30632k0;
        ArrayList arrayList2 = this.f25686f;
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
            arrayList = this.f25687n;
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
            for (int i12 = 0; i12 < st0VarArr.length; i12++) {
                if (st0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    vh.o oVar = st0VarArr[i12].f27924w.d;
                    if (this.f25691x != null && TextUtils.isEmpty(this.f25690w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.p0 p0Var = this.f25691x;
                        Paint.FontMetricsInt fontMetricsInt = st0VarArr[i12].f27924w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(p0Var.f49150f)) {
                            charSequence = p0Var.f49150f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new x5(p0Var.f49151g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f25690w);
                    }
                    oVar.setText(formatString);
                    st0VarArr[i12].f27924w.f30675f.setVisibility(8);
                    st0VarArr[i12].f27924w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f25686f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f25686f;
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
            View view = c1Var.f42697a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r2Var.f20760s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f25686f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    r2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var = new gg.a0(1, this.f25685c, true);
        zu0 zu0Var = this.G;
        a0Var.setDialogCellDelegate(zu0Var);
        a0Var.f20752r0 = true;
        a0Var.setBackgroundColor(zu0Var.h0(org.telegram.ui.ActionBar.j6.f18862d6));
        return new s4.c1(a0Var);
    }
}
