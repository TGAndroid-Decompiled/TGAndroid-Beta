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
public final class tu0 extends ul0 {
    public int E;
    public final iv0 G;
    public final Context f27487c;
    public final int d;
    public boolean f27490r;
    public String f27492w;
    public yg.p0 f27493x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f27488f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f27489n = new ArrayList();
    public boolean f27491s = false;
    public int v = 0;
    public int f27494y = -1;
    public final uq0 F = new uq0(this, 6);

    public tu0(iv0 iv0Var, Context context) {
        this.G = iv0Var;
        this.f27487c = context;
        this.d = iv0Var.f24131v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(yg.p0 p0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f27492w)) {
            yg.p0 p0Var2 = this.f27493x;
            if (p0Var2 != null || p0Var != null) {
                if (p0Var2 != null && p0Var2.equals(p0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f27492w = str;
        this.f27493x = p0Var;
        int i10 = this.f27494y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f27494y, true);
            this.f27494y = -1;
        }
        this.f27489n.clear();
        this.h.clear();
        this.f27488f.clear();
        int i12 = 0;
        this.v = 0;
        this.f27491s = false;
        this.f27490r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f27493x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            au0[] au0VarArr = this.G.f24107k0;
            if (i12 >= au0VarArr.length) {
                break;
            }
            au0 au0Var = au0VarArr[i12];
            if (au0Var.F == 11) {
                au0Var.f21597w.e(true, true);
            }
            i12++;
        }
        if (this.f27493x == null) {
            l();
        }
        uq0 uq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(uq0Var);
        if (this.f27493x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(uq0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f27492w) && this.f27493x == null) {
            this.f27490r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f17304q = this.f27492w;
        yg.p0 p0Var = this.f27493x;
        if (p0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(p0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hc.b.i(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f27491s = false;
        int i11 = this.E + 1;
        this.E = i11;
        my myVar = new my(this, i11, tL_messages_search, 13);
        if (this.f27493x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f27493x.g(), 0L, this.f27492w, 100, this.f27489n.size(), new su0(0, this, myVar), false);
        } else {
            myVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        au0[] au0VarArr = this.G.f24107k0;
        ArrayList arrayList2 = this.f27488f;
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
            arrayList = this.f27489n;
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
            for (int i12 = 0; i12 < au0VarArr.length; i12++) {
                if (au0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    uh.o oVar = au0VarArr[i12].f21597w.d;
                    if (this.f27493x != null && TextUtils.isEmpty(this.f27492w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        yg.p0 p0Var = this.f27493x;
                        Paint.FontMetricsInt fontMetricsInt = au0VarArr[i12].f21597w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(p0Var.f47101f)) {
                            charSequence = p0Var.f47101f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new y5(p0Var.f47102g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f27492w);
                    }
                    oVar.setText(formatString);
                    au0VarArr[i12].f21597w.f24512f.setVisibility(8);
                    au0VarArr[i12].f21597w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f27488f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f27488f;
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
            View view = c1Var.f41610a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r2Var.f19844s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f27488f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    r2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        fg.z zVar = new fg.z(1, this.f27487c, true);
        iv0 iv0Var = this.G;
        zVar.setDialogCellDelegate(iv0Var);
        zVar.f19836r0 = true;
        zVar.setBackgroundColor(iv0Var.h0(org.telegram.ui.ActionBar.j6.f17928d6));
        return new s4.c1(zVar);
    }
}
