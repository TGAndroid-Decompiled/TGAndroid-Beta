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

public final class st0 extends yk0 {
    public int A;
    public final hu0 C;

    public final Context f32558c;
    public final int d;

    public boolean f32562r;

    public String f32564w;

    public ig.q0 f32565x;

    public final ArrayList f32559e = new ArrayList();

    public final ArrayList f32560f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public final ArrayList f32561n = new ArrayList();

    public boolean f32563s = false;
    public int v = 0;

    public int f32566y = -1;
    public final up0 B = new up0(this, 6);

    public st0(hu0 hu0Var, Context context) {
        this.C = hu0Var;
        this.f32558c = context;
        this.d = hu0Var.f29145r1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    public final void E(ig.q0 q0Var, String str) {
        if (TextUtils.equals(str, this.f32564w)) {
            ig.q0 q0Var2 = this.f32565x;
            if (q0Var2 == null && q0Var == null) {
                return;
            }
            if (q0Var2 != null && q0Var2.equals(q0Var)) {
                return;
            }
        }
        this.f32564w = str;
        this.f32565x = q0Var;
        int i10 = this.f32566y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f32566y, true);
            this.f32566y = -1;
        }
        this.f32561n.clear();
        this.h.clear();
        this.f32560f.clear();
        int i12 = 0;
        this.v = 0;
        this.f32563s = false;
        this.f32562r = true;
        ArrayList arrayList = this.f32559e;
        arrayList.clear();
        if (this.f32565x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            zs0[] zs0VarArr = this.C.f29122g0;
            if (i12 >= zs0VarArr.length) {
                break;
            }
            zs0 zs0Var = zs0VarArr[i12];
            if (zs0Var.B == 11) {
                zs0Var.f35342w.e(true, true);
            }
            i12++;
        }
        if (this.f32565x == null) {
            l();
        }
        up0 up0Var = this.B;
        AndroidUtilities.cancelRunOnUIThread(up0Var);
        AndroidUtilities.runOnUIThread(up0Var, this.f32565x != null ? 60L : 600L);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f32564w) && this.f32565x == null) {
            this.f32562r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f22489q = this.f32564w;
        ig.q0 q0Var = this.f32565x;
        if (q0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(q0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) i0.a.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f32563s = false;
        int i11 = this.A + 1;
        this.A = i11;
        km kmVar = new km(this, i11, tL_messages_search, 15);
        if (this.f32565x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f32565x.g(), 0L, this.f32564w, 100, this.f32561n.size(), new jh.b2(1, this, kmVar), false);
        } else {
            kmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence string;
        CharSequence charSequence;
        zs0[] zs0VarArr = this.C.f29122g0;
        ArrayList arrayList2 = this.f32560f;
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
            arrayList = this.f32561n;
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
            for (int i12 = 0; i12 < zs0VarArr.length; i12++) {
                if (zs0VarArr[i12].B == 11 && arrayList2.isEmpty() && this.f32559e.isEmpty()) {
                    eh.s sVar = zs0VarArr[i12].f35342w.d;
                    if (this.f32565x == null || !TextUtils.isEmpty(this.f32564w)) {
                        string = LocaleController.formatString(R.string.NoResultFoundFor, this.f32564w);
                    } else {
                        String string2 = LocaleController.getString(R.string.NoResultFoundForTag);
                        ig.q0 q0Var = this.f32565x;
                        Paint.FontMetricsInt fontMetricsInt = zs0VarArr[i12].f35342w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(q0Var.f11412f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new t5(q0Var.f11413g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = q0Var.f11412f;
                        }
                        string = AndroidUtilities.replaceCharSequence("%s", string2, charSequence);
                    }
                    sVar.setText(string);
                    zs0VarArr[i12].f35342w.f29507f.setVisibility(8);
                    zs0VarArr[i12].f35342w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f32560f.size() + this.f32559e.size();
    }

    @Override
    public final long i(int i10) {
        int iHash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.f32559e;
        if (i10 < arrayList.size()) {
            iHash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f32560f;
            if (size >= arrayList2.size()) {
                return size;
            }
            iHash = Objects.hash(2, Long.valueOf(((MessageObject) arrayList2.get(size)).getSavedDialogId()), Integer.valueOf(((MessageObject) arrayList2.get(size)).getId()));
        }
        return iHash;
    }

    @Override
    public final int j(int i10) {
        return 23;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (i10 < 0) {
            return;
        }
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            p2Var.f24907o2 = i10 + 1 < h();
            ArrayList arrayList = this.f32559e;
            if (i10 < arrayList.size()) {
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                p2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                return;
            }
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f32560f;
            if (size < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(size);
                p2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        rt0 rt0Var = new rt0(0, this.f32558c, true);
        hu0 hu0Var = this.C;
        rt0Var.setDialogCellDelegate(hu0Var);
        rt0Var.f24900n0 = true;
        rt0Var.setBackgroundColor(hu0Var.h0(org.telegram.ui.ActionBar.g6.f23053d6));
        return new lk0(rt0Var);
    }
}
