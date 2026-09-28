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
public final class e10 extends bb {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f23799a0;
    public final boolean f23800b0;
    public String f23801c0;
    public ArrayList f23802d0;
    public boolean f23803e0;
    public CharSequence f23804f0;
    public ArrayList f23805g0;
    public ArrayList f23806h0;
    public ArrayList f23807i0;
    public ArrayList f23808j0;
    public FrameLayout f23809k0;
    public a10 f23810l0;
    public View m0;
    public d10 f23811n0;
    public int f23812o0;
    public int f23813p0;
    public int f23814q0;
    public int f23815r0;
    public int f23816s0;
    public int f23817t0;
    public int f23818u0;
    public int f23819v0;
    public int f23820w0;
    public int f23821x0;
    public b10 f23822y0;
    public int f23823z0;

    public e10(org.telegram.ui.ActionBar.m2 m2Var, int i10, ArrayList arrayList) {
        super(m2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f23801c0 = "";
        this.f23802d0 = new ArrayList();
        this.f23804f0 = "";
        this.f23806h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f23807i0 = arrayList2;
        this.f23823z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f23800b0 = true;
        this.f23805g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = m2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f15832id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f23801c0 = dialogFilter.name;
            this.f23802d0 = dialogFilter.entities;
            this.f23803e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f23807i0.size(); i12++) {
                TLRPC.Peer peer = m2Var.getMessagesController().getPeer(((Long) this.f23807i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f23805g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f23807i0.contains(l4)) {
                    TLRPC.Peer peer2 = m2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = m2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f23805g0.add(peer2);
                    }
                }
            }
        }
        S();
    }

    public static void T(org.telegram.ui.ActionBar.m2 m2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = m2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).f15832id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        ym ymVar = new ym(i10, m2Var, callback, 3);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getContext());
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vm(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nv(ymVar, 4));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
            m2Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
                return;
            }
            return;
        }
        ymVar.run();
    }

    @Override
    public final void G(cw0 cw0Var) {
        float f7;
        yl0 yl0Var = this.d;
        yl0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f23810l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        yl0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        yl0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void Q(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f23807i0.size(), new Object[0]));
        if (z10 && this.f23822y0 != null) {
            str = ", " + ((Object) this.f23822y0.f22836b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void R(b10 b10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f23805g0;
        ArrayList arrayList2 = this.f23807i0;
        arrayList2.clear();
        arrayList2.addAll(this.f23806h0);
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
        b10Var.a(LocaleController.getString(i10), new ci.y0(this, b10Var, z10, 19));
        Q(true);
        while (true) {
            yl0 yl0Var = this.d;
            if (i11 < yl0Var.getChildCount()) {
                View childAt = yl0Var.getChildAt(i11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e10.S():void");
    }

    public final void U(boolean z10) {
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        ArrayList arrayList = this.f23807i0;
        int size = arrayList.size();
        a10 a10Var = this.f23810l0;
        if (a10Var != null) {
            if (this.f23800b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                a10Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f23805g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f23810l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f23801c0, this.f23810l0.f22492b.f26947a.getFontMetricsInt(), false), this.f23802d0, this.f23810l0.f22492b.f26947a.getFontMetricsInt())), z10);
                        a10 a10Var2 = this.f23810l0;
                        if (this.f23803e0) {
                            i12 = 26;
                        }
                        a10Var2.f22492b.f26955l = i12;
                    } else {
                        a10 a10Var3 = this.f23810l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        a10Var3.b(string, z10);
                    }
                } else {
                    this.f23810l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            a10 a10Var4 = this.f23810l0;
            o6 o6Var = a10Var4.f22493c;
            if (z10) {
                o6Var.b();
            }
            if (z10 && size != (i10 = a10Var4.f22498w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = a10Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    a10Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                a10Var4.v = ofFloat;
                ofFloat.addUpdateListener(new z00(a10Var4, 1));
                a10Var4.v.addListener(new r8(a10Var4, 23));
                a10Var4.v.setInterpolator(new OvershootInterpolator(2.0f));
                a10Var4.v.setDuration(200L);
                a10Var4.v.start();
            }
            a10Var4.f22498w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            a10Var4.d = f7;
            o6Var.q("" + size, z10, true);
            a10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f23810l0.setEnabled(!arrayList.isEmpty());
            }
        }
        d10 d10Var = this.f23811n0;
        if (d10Var != null) {
            d10Var.a();
        }
    }

    public final void V() {
        int i10;
        ArrayList arrayList = this.f23806h0;
        ArrayList arrayList2 = this.f23805g0;
        b10 b10Var = this.f23822y0;
        if (b10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f23800b0) {
            b10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            b10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f23807i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            b10 b10Var2 = this.f23822y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            b10Var2.a(LocaleController.getString(i10), new bi.f(24, this, z10));
            return;
        }
        this.f23822y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f23823z0 >= 0) {
            this.f22927n.getConnectionsManager().cancelRequest(this.f23823z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        return new y00(this);
    }

    @Override
    public final CharSequence y() {
        if (this.f23800b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f23805g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
