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
public final class f10 extends cb {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f26204a0;
    public final boolean f26205b0;
    public String f26206c0;
    public ArrayList f26207d0;
    public boolean f26208e0;
    public CharSequence f26209f0;
    public ArrayList f26210g0;
    public ArrayList f26211h0;
    public ArrayList f26212i0;
    public ArrayList f26213j0;
    public FrameLayout f26214k0;
    public b10 f26215l0;
    public View m0;
    public e10 f26216n0;
    public int f26217o0;
    public int f26218p0;
    public int f26219q0;
    public int f26220r0;
    public int f26221s0;
    public int f26222t0;
    public int f26223u0;
    public int f26224v0;
    public int f26225w0;
    public int f26226x0;
    public c10 f26227y0;
    public int f26228z0;

    public f10(org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList) {
        super(n2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f26206c0 = "";
        this.f26207d0 = new ArrayList();
        this.f26209f0 = "";
        this.f26211h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f26212i0 = arrayList2;
        this.f26228z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f26205b0 = true;
        this.f26210g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = n2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f17257id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f26206c0 = dialogFilter.name;
            this.f26207d0 = dialogFilter.entities;
            this.f26208e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f26212i0.size(); i12++) {
                TLRPC.Peer peer = n2Var.getMessagesController().getPeer(((Long) this.f26212i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f26210g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f26212i0.contains(l4)) {
                    TLRPC.Peer peer2 = n2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = n2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f26210g0.add(peer2);
                    }
                }
            }
        }
        Q();
    }

    public static void R(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = n2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).f17257id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        zm zmVar = new zm(i10, n2Var, callback, 3);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getContext());
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wm(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pv(zmVar, 4));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
            n2Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21059q7, false));
                return;
            }
            return;
        }
        zmVar.run();
    }

    @Override
    public final void E(lw0 lw0Var) {
        float f7;
        zl0 zl0Var = this.d;
        zl0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f26215l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        zl0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        zl0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void O(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f26212i0.size(), new Object[0]));
        if (z10 && this.f26227y0 != null) {
            str = ", " + ((Object) this.f26227y0.f25160b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void P(c10 c10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f26210g0;
        ArrayList arrayList2 = this.f26212i0;
        arrayList2.clear();
        arrayList2.addAll(this.f26211h0);
        int i11 = 0;
        if (!z10) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i12));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        S(true);
        if (z10) {
            i10 = R.string.SelectAll;
        } else {
            i10 = R.string.DeselectAll;
        }
        c10Var.a(LocaleController.getString(i10), new ci.y0(this, c10Var, z10, 19));
        O(true);
        while (true) {
            zl0 zl0Var = this.d;
            if (i11 < zl0Var.getChildCount()) {
                View childAt = zl0Var.getChildAt(i11);
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

    public final void Q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f10.Q():void");
    }

    public final void S(boolean z10) {
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        ArrayList arrayList = this.f26212i0;
        int size = arrayList.size();
        b10 b10Var = this.f26215l0;
        if (b10Var != null) {
            if (this.f26205b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                b10Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f26210g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f26215l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f26206c0, this.f26215l0.f24745b.f29239a.getFontMetricsInt(), false), this.f26207d0, this.f26215l0.f24745b.f29239a.getFontMetricsInt())), z10);
                        b10 b10Var2 = this.f26215l0;
                        if (this.f26208e0) {
                            i12 = 26;
                        }
                        b10Var2.f24745b.f29248l = i12;
                    } else {
                        b10 b10Var3 = this.f26215l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        b10Var3.b(string, z10);
                    }
                } else {
                    this.f26215l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            b10 b10Var4 = this.f26215l0;
            o6 o6Var = b10Var4.f24746c;
            if (z10) {
                o6Var.b();
            }
            if (z10 && size != (i10 = b10Var4.f24752w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = b10Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    b10Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                b10Var4.v = ofFloat;
                ofFloat.addUpdateListener(new a10(b10Var4, 1));
                b10Var4.v.addListener(new r8(b10Var4, 23));
                b10Var4.v.setInterpolator(new OvershootInterpolator(2.0f));
                b10Var4.v.setDuration(200L);
                b10Var4.v.start();
            }
            b10Var4.f24752w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            b10Var4.d = f7;
            o6Var.q("" + size, z10, true);
            b10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f26215l0.setEnabled(!arrayList.isEmpty());
            }
        }
        e10 e10Var = this.f26216n0;
        if (e10Var != null) {
            e10Var.a();
        }
    }

    public final void T() {
        int i10;
        ArrayList arrayList = this.f26211h0;
        ArrayList arrayList2 = this.f26210g0;
        c10 c10Var = this.f26227y0;
        if (c10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f26205b0) {
            c10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            c10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f26212i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            c10 c10Var2 = this.f26227y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            c10Var2.a(LocaleController.getString(i10), new bi.f(24, this, z10));
            return;
        }
        this.f26227y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f26228z0 >= 0) {
            this.f25304n.getConnectionsManager().cancelRequest(this.f26228z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        return new z00(this);
    }

    @Override
    public final CharSequence y() {
        if (this.f26205b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f26210g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
