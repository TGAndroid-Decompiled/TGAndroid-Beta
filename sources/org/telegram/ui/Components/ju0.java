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
public final class ju0 extends ll0 {
    public int E;
    public final yu0 G;
    public final Context f25410c;
    public final int d;
    public boolean f25413r;
    public String f25415w;
    public zg.p0 f25416x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f25411f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f25412n = new ArrayList();
    public boolean f25414s = false;
    public int v = 0;
    public int f25417y = -1;
    public final jq0 F = new jq0(this, 6);

    public ju0(yu0 yu0Var, Context context) {
        this.G = yu0Var;
        this.f25410c = context;
        this.d = yu0Var.f30450v1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(zg.p0 p0Var, String str) {
        long j3;
        if (TextUtils.equals(str, this.f25415w)) {
            zg.p0 p0Var2 = this.f25416x;
            if (p0Var2 != null || p0Var != null) {
                if (p0Var2 != null && p0Var2.equals(p0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f25415w = str;
        this.f25416x = p0Var;
        int i10 = this.f25417y;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.f25417y, true);
            this.f25417y = -1;
        }
        this.f25412n.clear();
        this.h.clear();
        this.f25411f.clear();
        int i12 = 0;
        this.v = 0;
        this.f25414s = false;
        this.f25413r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f25416x == null) {
            arrayList.addAll(MessagesController.getInstance(i11).getSavedMessagesController().searchDialogs(str));
        }
        while (true) {
            rt0[] rt0VarArr = this.G.f30426k0;
            if (i12 >= rt0VarArr.length) {
                break;
            }
            rt0 rt0Var = rt0VarArr[i12];
            if (rt0Var.F == 11) {
                rt0Var.f27730w.e(true, true);
            }
            i12++;
        }
        if (this.f25416x == null) {
            l();
        }
        jq0 jq0Var = this.F;
        AndroidUtilities.cancelRunOnUIThread(jq0Var);
        if (this.f25416x != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        AndroidUtilities.runOnUIThread(jq0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f25415w) && this.f25416x == null) {
            this.f25413r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f18192q = this.f25415w;
        zg.p0 p0Var = this.f25416x;
        if (p0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(p0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.h(1, arrayList)).getId();
        }
        tL_messages_search.limit = 10;
        this.f25414s = false;
        int i11 = this.E + 1;
        this.E = i11;
        xm xmVar = new xm(this, i11, tL_messages_search, 15);
        if (this.f25416x != null) {
            MessagesStorage.getInstance(i10).searchSavedByTag(this.f25416x.g(), 0L, this.f25415w, 100, this.f25412n.size(), new ai.k3(1, this, xmVar), false);
        } else {
            xmVar.run();
        }
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence formatString;
        CharSequence charSequence;
        rt0[] rt0VarArr = this.G.f30426k0;
        ArrayList arrayList2 = this.f25411f;
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
            arrayList = this.f25412n;
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
            for (int i12 = 0; i12 < rt0VarArr.length; i12++) {
                if (rt0VarArr[i12].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    vh.o oVar = rt0VarArr[i12].f27730w.d;
                    if (this.f25416x != null && TextUtils.isEmpty(this.f25415w)) {
                        String string = LocaleController.getString(R.string.NoResultFoundForTag);
                        zg.p0 p0Var = this.f25416x;
                        Paint.FontMetricsInt fontMetricsInt = rt0VarArr[i12].f27730w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(p0Var.f49071f)) {
                            charSequence = p0Var.f49071f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new z5(p0Var.f49072g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        formatString = AndroidUtilities.replaceCharSequence("%s", string, charSequence);
                    } else {
                        formatString = LocaleController.formatString(R.string.NoResultFoundFor, this.f25415w);
                    }
                    oVar.setText(formatString);
                    rt0VarArr[i12].f27730w.f30080f.setVisibility(8);
                    rt0VarArr[i12].f27730w.e(false, true);
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f25411f.size() + this.e.size();
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
            ArrayList arrayList2 = this.f25411f;
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
            View view = c1Var.f42627a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (i10 + 1 < h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r2Var.f20724s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                    r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f25411f;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    r2Var.W(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var = new gg.a0(1, this.f25410c, true);
        yu0 yu0Var = this.G;
        a0Var.setDialogCellDelegate(yu0Var);
        a0Var.f20716r0 = true;
        a0Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.h6.f18789d6));
        return new s4.c1(a0Var);
    }
}
