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
public final class c10 extends za {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f22907a0;
    public final boolean f22908b0;
    public String f22909c0;
    public ArrayList f22910d0;
    public boolean f22911e0;
    public CharSequence f22912f0;
    public ArrayList f22913g0;
    public ArrayList f22914h0;
    public ArrayList f22915i0;
    public ArrayList f22916j0;
    public FrameLayout f22917k0;
    public y00 f22918l0;
    public View m0;
    public b10 f22919n0;
    public int f22920o0;
    public int f22921p0;
    public int f22922q0;
    public int f22923r0;
    public int f22924s0;
    public int f22925t0;
    public int f22926u0;
    public int f22927v0;
    public int f22928w0;
    public int f22929x0;
    public z00 f22930y0;
    public int f22931z0;

    public c10(org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList) {
        super(n2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f22909c0 = "";
        this.f22910d0 = new ArrayList();
        this.f22912f0 = "";
        this.f22914h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f22915i0 = arrayList2;
        this.f22931z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f22908b0 = true;
        this.f22913g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = n2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f15603id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f22909c0 = dialogFilter.name;
            this.f22910d0 = dialogFilter.entities;
            this.f22911e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f22915i0.size(); i12++) {
                TLRPC.Peer peer = n2Var.getMessagesController().getPeer(((Long) this.f22915i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f22913g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f22915i0.contains(l4)) {
                    TLRPC.Peer peer2 = n2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = n2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f22913g0.add(peer2);
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
                if (arrayList.get(i11).f15603id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        wm wmVar = new wm(i10, n2Var, callback, 3);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getContext());
            alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tm(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new lv(wmVar, 4));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
            n2Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false));
                return;
            }
            return;
        }
        wmVar.run();
    }

    @Override
    public final void G(pv0 pv0Var) {
        float f7;
        ll0 ll0Var = this.d;
        ll0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f22918l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        ll0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        ll0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void Q(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f22915i0.size(), new Object[0]));
        if (z10 && this.f22930y0 != null) {
            str = ", " + ((Object) this.f22930y0.f30438b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void R(z00 z00Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f22913g0;
        ArrayList arrayList2 = this.f22915i0;
        arrayList2.clear();
        arrayList2.addAll(this.f22914h0);
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
        z00Var.a(LocaleController.getString(i10), new ci.y0(this, z00Var, z10, 18));
        Q(true);
        while (true) {
            ll0 ll0Var = this.d;
            if (i11 < ll0Var.getChildCount()) {
                View childAt = ll0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((org.telegram.ui.Cells.f4) childAt).c(arrayList2.contains((Long) tag), true);
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c10.S():void");
    }

    public final void U(boolean z10) {
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        ArrayList arrayList = this.f22915i0;
        int size = arrayList.size();
        y00 y00Var = this.f22918l0;
        if (y00Var != null) {
            if (this.f22908b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                y00Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f22913g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f22918l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f22909c0, this.f22918l0.f30113b.f26085a.getFontMetricsInt(), false), this.f22910d0, this.f22918l0.f30113b.f26085a.getFontMetricsInt())), z10);
                        y00 y00Var2 = this.f22918l0;
                        if (this.f22911e0) {
                            i12 = 26;
                        }
                        y00Var2.f30113b.f26093l = i12;
                    } else {
                        y00 y00Var3 = this.f22918l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        y00Var3.b(string, z10);
                    }
                } else {
                    this.f22918l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            y00 y00Var4 = this.f22918l0;
            m6 m6Var = y00Var4.f30114c;
            if (z10) {
                m6Var.b();
            }
            if (z10 && size != (i10 = y00Var4.f30119w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = y00Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    y00Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                y00Var4.v = ofFloat;
                ofFloat.addUpdateListener(new x00(y00Var4, 1));
                y00Var4.v.addListener(new p8(y00Var4, 23));
                y00Var4.v.setInterpolator(new OvershootInterpolator(2.0f));
                y00Var4.v.setDuration(200L);
                y00Var4.v.start();
            }
            y00Var4.f30119w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            y00Var4.d = f7;
            m6Var.q("" + size, z10, true);
            y00Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f22918l0.setEnabled(!arrayList.isEmpty());
            }
        }
        b10 b10Var = this.f22919n0;
        if (b10Var != null) {
            b10Var.a();
        }
    }

    public final void V() {
        int i10;
        ArrayList arrayList = this.f22914h0;
        ArrayList arrayList2 = this.f22913g0;
        z00 z00Var = this.f22930y0;
        if (z00Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f22908b0) {
            z00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            z00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f22915i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            z00 z00Var2 = this.f22930y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            z00Var2.a(LocaleController.getString(i10), new bi.f(23, this, z10));
            return;
        }
        this.f22930y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f22931z0 >= 0) {
            this.f30528n.getConnectionsManager().cancelRequest(this.f22931z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        return new w00(this);
    }

    @Override
    public final CharSequence y() {
        if (this.f22908b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f22913g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
