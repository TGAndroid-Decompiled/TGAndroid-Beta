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
public final class k10 extends ab {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f24536a0;
    public final boolean f24537b0;
    public String f24538c0;
    public ArrayList f24539d0;
    public boolean f24540e0;
    public CharSequence f24541f0;
    public ArrayList f24542g0;
    public ArrayList f24543h0;
    public ArrayList f24544i0;
    public ArrayList f24545j0;
    public FrameLayout f24546k0;
    public g10 f24547l0;
    public View m0;
    public j10 f24548n0;
    public int f24549o0;
    public int f24550p0;
    public int f24551q0;
    public int f24552r0;
    public int f24553s0;
    public int f24554t0;
    public int f24555u0;
    public int f24556v0;
    public int f24557w0;
    public int f24558x0;
    public h10 f24559y0;
    public int f24560z0;

    public k10(org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList) {
        super(p2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f24538c0 = "";
        this.f24539d0 = new ArrayList();
        this.f24541f0 = "";
        this.f24543h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f24544i0 = arrayList2;
        this.f24560z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f24537b0 = true;
        this.f24542g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = p2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f14645id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f24538c0 = dialogFilter.name;
            this.f24539d0 = dialogFilter.entities;
            this.f24540e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f24544i0.size(); i12++) {
                TLRPC.Peer peer = p2Var.getMessagesController().getPeer(((Long) this.f24544i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f24542g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f24544i0.contains(l4)) {
                    TLRPC.Peer peer2 = p2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = p2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f24542g0.add(peer2);
                    }
                }
            }
        }
        S();
    }

    public static void T(org.telegram.ui.ActionBar.p2 p2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = p2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).f14645id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        my myVar = new my(i10, p2Var, callback, 1);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getContext());
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new an(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pv(myVar, 4));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            p2Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                return;
            }
            return;
        }
        myVar.run();
    }

    @Override
    public final void F(aw0 aw0Var) {
        float f7;
        vl0 vl0Var = this.d;
        vl0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f24547l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        vl0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        vl0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void Q(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f24544i0.size(), new Object[0]));
        if (z10 && this.f24559y0 != null) {
            str = ", " + ((Object) this.f24559y0.f23469b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void R(h10 h10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f24542g0;
        ArrayList arrayList2 = this.f24544i0;
        arrayList2.clear();
        arrayList2.addAll(this.f24543h0);
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
        h10Var.a(LocaleController.getString(i10), new bi.c1(this, h10Var, z10, 18));
        Q(true);
        while (true) {
            vl0 vl0Var = this.d;
            if (i11 < vl0Var.getChildCount()) {
                View childAt = vl0Var.getChildAt(i11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k10.S():void");
    }

    public final void U(boolean z10) {
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        ArrayList arrayList = this.f24544i0;
        int size = arrayList.size();
        g10 g10Var = this.f24547l0;
        if (g10Var != null) {
            if (this.f24537b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                g10Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f24542g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f24547l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f24538c0, this.f24547l0.f23196b.f25424a.getFontMetricsInt(), false), this.f24539d0, this.f24547l0.f23196b.f25424a.getFontMetricsInt())), z10);
                        g10 g10Var2 = this.f24547l0;
                        if (this.f24540e0) {
                            i12 = 26;
                        }
                        g10Var2.f23196b.f25432l = i12;
                    } else {
                        g10 g10Var3 = this.f24547l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        g10Var3.b(string, z10);
                    }
                } else {
                    this.f24547l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            g10 g10Var4 = this.f24547l0;
            n6 n6Var = g10Var4.f23197c;
            if (z10) {
                n6Var.b();
            }
            if (z10 && size != (i10 = g10Var4.f23202w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = g10Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    g10Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                g10Var4.v = ofFloat;
                ofFloat.addUpdateListener(new e10(g10Var4, 1));
                g10Var4.v.addListener(new rm(g10Var4, 13));
                g10Var4.v.setInterpolator(new OvershootInterpolator(2.0f));
                g10Var4.v.setDuration(200L);
                g10Var4.v.start();
            }
            g10Var4.f23202w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g10Var4.d = f7;
            n6Var.q("" + size, z10, true);
            g10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f24547l0.setEnabled(!arrayList.isEmpty());
            }
        }
        j10 j10Var = this.f24548n0;
        if (j10Var != null) {
            j10Var.a();
        }
    }

    public final void V() {
        int i10;
        ArrayList arrayList = this.f24543h0;
        ArrayList arrayList2 = this.f24542g0;
        h10 h10Var = this.f24559y0;
        if (h10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f24537b0) {
            h10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            h10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f24544i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            h10 h10Var2 = this.f24559y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            h10Var2.a(LocaleController.getString(i10), new ai.j(23, this, z10));
            return;
        }
        this.f24559y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f24560z0 >= 0) {
            this.f21452n.getConnectionsManager().cancelRequest(this.f24560z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        return new d10(this);
    }

    @Override
    public final CharSequence y() {
        if (this.f24537b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f24542g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
