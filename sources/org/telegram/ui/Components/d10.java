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
public final class d10 extends sa {
    public long A0;
    public long B0;
    public String U;
    public int V;
    public TL_chatlists.chatlist_ChatlistInvite W;
    public TL_chatlists.TL_chatlists_chatlistUpdates X;
    public final boolean Y;
    public String Z;
    public ArrayList f26093a0;
    public boolean f26094b0;
    public CharSequence f26095c0;
    public ArrayList f26096d0;
    public ArrayList f26097e0;
    public ArrayList f26098f0;
    public ArrayList f26099g0;
    public FrameLayout f26100h0;
    public z00 f26101i0;
    public View f26102j0;
    public c10 f26103k0;
    public int f26104l0;
    public int m0;
    public int f26105n0;
    public int f26106o0;
    public int f26107p0;
    public int f26108q0;
    public int f26109r0;
    public int f26110s0;
    public int f26111t0;
    public int f26112u0;
    public a10 f26113v0;
    public int f26114w0;
    public boolean f26115x0;
    public Utilities.Callback f26116y0;
    public int f26117z0;

    public d10(org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList) {
        super(p2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.V = -1;
        this.Z = "";
        this.f26093a0 = new ArrayList();
        this.f26095c0 = "";
        this.f26097e0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f26098f0 = arrayList2;
        this.f26114w0 = -1;
        this.f26117z0 = -5;
        this.V = i10;
        this.Y = true;
        this.f26096d0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = p2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f18057id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.Z = dialogFilter.name;
            this.f26093a0 = dialogFilter.entities;
            this.f26094b0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f26098f0.size(); i12++) {
                TLRPC.Peer peer = p2Var.getMessagesController().getPeer(((Long) this.f26098f0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f26096d0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l10 = dialogFilter.alwaysShow.get(i13);
                long longValue = l10.longValue();
                if (!this.f26098f0.contains(l10)) {
                    TLRPC.Peer peer2 = p2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = p2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f26096d0.add(peer2);
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
                if (arrayList.get(i11).f18057id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        gy gyVar = new gy(i10, p2Var, callback, 1);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getContext());
            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sm(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hv(gyVar, 4));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            p2Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                return;
            }
            return;
        }
        gyVar.run();
    }

    @Override
    public final void F(pv0 pv0Var) {
        float f10;
        sl0 sl0Var = this.d;
        sl0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f26101i0 != null) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        sl0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f10));
        sl0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void Q(boolean z4) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f26098f0.size(), new Object[0]));
        if (z4 && this.f26113v0 != null) {
            str = ", " + ((Object) this.f26113v0.f25117b.getText());
        } else {
            str = "";
        }
        sb.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
    }

    public final void R(a10 a10Var, boolean z4) {
        int i10;
        ArrayList arrayList = this.f26096d0;
        ArrayList arrayList2 = this.f26098f0;
        arrayList2.clear();
        arrayList2.addAll(this.f26097e0);
        int i11 = 0;
        if (!z4) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i12));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        U(true);
        if (z4) {
            i10 = R.string.SelectAll;
        } else {
            i10 = R.string.DeselectAll;
        }
        a10Var.a(LocaleController.getString(i10), new mh.r5(this, a10Var, z4, 14));
        Q(true);
        while (true) {
            sl0 sl0Var = this.d;
            if (i11 < sl0Var.getChildCount()) {
                View childAt = sl0Var.getChildAt(i11);
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

    public final void U(boolean z4) {
        String string;
        float f10;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.W;
        ArrayList arrayList = this.f26098f0;
        int size = arrayList.size();
        z00 z00Var = this.f26101i0;
        if (z00Var != null) {
            if (this.Y) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                z00Var.b(LocaleController.getString(i11), z4);
            } else {
                ArrayList arrayList2 = this.f26096d0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f26101i0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.Z, this.f26101i0.f33709b.f27998a.getFontMetricsInt(), false), this.f26093a0, this.f26101i0.f33709b.f27998a.getFontMetricsInt())), z4);
                        z00 z00Var2 = this.f26101i0;
                        if (this.f26094b0) {
                            i12 = 26;
                        }
                        z00Var2.f33709b.f28007l = i12;
                    } else {
                        z00 z00Var3 = this.f26101i0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        z00Var3.b(string, z4);
                    }
                } else {
                    this.f26101i0.b(LocaleController.getString(R.string.OK), z4);
                }
            }
            z00 z00Var4 = this.f26101i0;
            j6 j6Var = z00Var4.f33710c;
            if (z4) {
                j6Var.b();
            }
            if (z4 && size != (i10 = z00Var4.f33716w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = z00Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    z00Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z00Var4.v = ofFloat;
                ofFloat.addUpdateListener(new y00(z00Var4, 1));
                z00Var4.v.addListener(new a9(z00Var4, 22));
                z00Var4.v.setInterpolator(new OvershootInterpolator(2.0f));
                z00Var4.v.setDuration(200L);
                z00Var4.v.start();
            }
            z00Var4.f33716w = size;
            if (size != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            z00Var4.d = f10;
            j6Var.q("" + size, z4, true);
            z00Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f26101i0.setEnabled(!arrayList.isEmpty());
            }
        }
        c10 c10Var = this.f26103k0;
        if (c10Var != null) {
            c10Var.a();
        }
    }

    public final void V() {
        int i10;
        ArrayList arrayList = this.f26097e0;
        ArrayList arrayList2 = this.f26096d0;
        a10 a10Var = this.f26113v0;
        if (a10Var == null) {
            return;
        }
        boolean z4 = false;
        if (this.Y) {
            a10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            a10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f26098f0.size() >= arrayList2.size() - arrayList.size()) {
                z4 = true;
            }
            a10 a10Var2 = this.f26113v0;
            if (z4) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            a10Var2.a(LocaleController.getString(i10), new kh.f(21, this, z4));
            return;
        }
        this.f26113v0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f26114w0 >= 0) {
            this.f31017n.getConnectionsManager().cancelRequest(this.f26114w0, true);
        }
        Utilities.Callback callback = this.f26116y0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.f26115x0));
            this.f26116y0 = null;
        }
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        return new x00(this);
    }

    @Override
    public final CharSequence y() {
        if (this.Y) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.W instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f26096d0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
