package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d10 extends bb {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f23179a0;
    public final boolean f23180b0;
    public String f23181c0;
    public ArrayList f23182d0;
    public boolean f23183e0;
    public CharSequence f23184f0;
    public ArrayList f23185g0;
    public ArrayList f23186h0;
    public ArrayList f23187i0;
    public ArrayList f23188j0;
    public FrameLayout f23189k0;
    public z00 f23190l0;
    public View m0;
    public c10 f23191n0;
    public int f23192o0;
    public int f23193p0;
    public int f23194q0;
    public int f23195r0;
    public int f23196s0;
    public int f23197t0;
    public int f23198u0;
    public int f23199v0;
    public int f23200w0;
    public int f23201x0;
    public a10 f23202y0;
    public int f23203z0;

    public d10(org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList) {
        super(n2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f23181c0 = "";
        this.f23182d0 = new ArrayList();
        this.f23184f0 = "";
        this.f23186h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f23187i0 = arrayList2;
        this.f23203z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f23180b0 = true;
        this.f23185g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = n2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f15577id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f23181c0 = dialogFilter.name;
            this.f23182d0 = dialogFilter.entities;
            this.f23183e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f23187i0.size(); i12++) {
                TLRPC.Peer peer = n2Var.getMessagesController().getPeer(((Long) this.f23187i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f23185g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f23187i0.contains(l4)) {
                    TLRPC.Peer peer2 = n2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = n2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f23185g0.add(peer2);
                    }
                }
            }
        }
        S();
    }

    public static void T(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = n2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).f15577id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        xm xmVar = new xm(i10, n2Var, callback, 3);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getContext());
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new um(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mv(xmVar, 4));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            n2Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                return;
            }
            return;
        }
        xmVar.run();
    }

    @Override
    public final void G(pv0 pv0Var) {
        float f7;
        ml0 ml0Var = this.d;
        ml0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f23190l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        ml0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        ml0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void Q(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f23187i0.size(), new Object[0]));
        if (z10 && this.f23202y0 != null) {
            str = ", " + ((Object) this.f23202y0.f22304b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void R(a10 a10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f23185g0;
        ArrayList arrayList2 = this.f23187i0;
        arrayList2.clear();
        arrayList2.addAll(this.f23186h0);
        int i11 = 0;
        if (!z10) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i12));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        U(true);
        if (z10) {
            i10 = R.string.SelectAll;
        } else {
            i10 = R.string.DeselectAll;
        }
        a10Var.a(LocaleController.getString(i10), new ci.y0(this, a10Var, z10, 18));
        Q(true);
        while (true) {
            ml0 ml0Var = this.d;
            if (i11 < ml0Var.getChildCount()) {
                View childAt = ml0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((org.telegram.ui.Cells.g4) childAt).c(arrayList2.contains((Long) tag), true);
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d10.S():void");
    }

    public final void U(boolean z10) {
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        ArrayList arrayList = this.f23187i0;
        int size = arrayList.size();
        z00 z00Var = this.f23190l0;
        if (z00Var != null) {
            if (this.f23180b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                z00Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f23185g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f23190l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f23181c0, this.f23190l0.f30490b.f26613a.getFontMetricsInt(), false), this.f23182d0, this.f23190l0.f30490b.f26613a.getFontMetricsInt())), z10);
                        z00 z00Var2 = this.f23190l0;
                        if (this.f23183e0) {
                            i12 = 26;
                        }
                        z00Var2.f30490b.f26621l = i12;
                    } else {
                        z00 z00Var3 = this.f23190l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        z00Var3.b(string, z10);
                    }
                } else {
                    this.f23190l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            z00 z00Var4 = this.f23190l0;
            o6 o6Var = z00Var4.f30491c;
            if (z10) {
                o6Var.b();
            }
            if (z10 && size != (i10 = z00Var4.f30496w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = z00Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    z00Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z00Var4.v = ofFloat;
                ofFloat.addUpdateListener(new y00(z00Var4, 1));
                z00Var4.v.addListener(new r8(z00Var4, 23));
                z00Var4.v.setInterpolator(new OvershootInterpolator(2.0f));
                z00Var4.v.setDuration(200L);
                z00Var4.v.start();
            }
            z00Var4.f30496w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            z00Var4.d = f7;
            o6Var.q("" + size, z10, true);
            z00Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f23190l0.setEnabled(!arrayList.isEmpty());
            }
        }
        c10 c10Var = this.f23191n0;
        if (c10Var != null) {
            c10Var.a();
        }
    }

    public final void V() {
        int i10;
        ArrayList arrayList = this.f23186h0;
        ArrayList arrayList2 = this.f23185g0;
        a10 a10Var = this.f23202y0;
        if (a10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f23180b0) {
            a10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            a10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f23187i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            a10 a10Var2 = this.f23202y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            a10Var2.a(LocaleController.getString(i10), new bi.f(23, this, z10));
            return;
        }
        this.f23202y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f23203z0 >= 0) {
            this.f22661n.getConnectionsManager().cancelRequest(this.f23203z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        return new x00(this);
    }

    @Override
    public final CharSequence y() {
        if (this.f23180b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f23185g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
