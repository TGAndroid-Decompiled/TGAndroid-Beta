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
public final class n00 extends sa {
    public long A0;
    public String T;
    public int U;
    public TL_chatlists.chatlist_ChatlistInvite V;
    public TL_chatlists.TL_chatlists_chatlistUpdates W;
    public final boolean X;
    public String Y;
    public ArrayList Z;
    public boolean f30958a0;
    public CharSequence f30959b0;
    public ArrayList f30960c0;
    public ArrayList f30961d0;
    public ArrayList f30962e0;
    public ArrayList f30963f0;
    public FrameLayout f30964g0;
    public j00 f30965h0;
    public View f30966i0;
    public m00 f30967j0;
    public int f30968k0;
    public int f30969l0;
    public int m0;
    public int f30970n0;
    public int f30971o0;
    public int f30972p0;
    public int f30973q0;
    public int f30974r0;
    public int f30975s0;
    public int f30976t0;
    public k00 f30977u0;
    public int f30978v0;
    public boolean f30979w0;
    public Utilities.Callback f30980x0;
    public int f30981y0;
    public long f30982z0;

    public n00(org.telegram.ui.ActionBar.o2 o2Var, int i9, ArrayList arrayList) {
        super(o2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.U = -1;
        this.Y = "";
        this.Z = new ArrayList();
        this.f30959b0 = "";
        this.f30961d0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f30962e0 = arrayList2;
        this.f30978v0 = -1;
        this.f30981y0 = -5;
        this.U = i9;
        this.X = true;
        this.f30960c0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = o2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (arrayList3.get(i10).f19649id == i9) {
                    dialogFilter = arrayList3.get(i10);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.Y = dialogFilter.name;
            this.Z = dialogFilter.entities;
            this.f30958a0 = dialogFilter.title_noanimate;
            for (int i11 = 0; i11 < this.f30962e0.size(); i11++) {
                TLRPC.Peer peer = o2Var.getMessagesController().getPeer(((Long) this.f30962e0.get(i11)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f30960c0.add(peer);
                }
            }
            for (int i12 = 0; i12 < dialogFilter.alwaysShow.size(); i12++) {
                Long l10 = dialogFilter.alwaysShow.get(i12);
                long longValue = l10.longValue();
                if (!this.f30962e0.contains(l10)) {
                    TLRPC.Peer peer2 = o2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = o2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f30960c0.add(peer2);
                    }
                }
            }
        }
        R();
    }

    public static void S(org.telegram.ui.ActionBar.o2 o2Var, int i9, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = o2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).f19649id == i9) {
                    dialogFilter = arrayList.get(i10);
                    break;
                }
            }
        }
        dialogFilter = null;
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(i9, o2Var, callback, 4);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getContext());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new km(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wu(rlVar, 4));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            o2Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                return;
            }
            return;
        }
        rlVar.run();
    }

    @Override
    public final void F(xu0 xu0Var) {
        float f10;
        wk0 wk0Var = this.d;
        wk0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f30965h0 != null) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        wk0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f10));
        wk0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void P(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f30962e0.size(), new Object[0]));
        if (z10 && this.f30977u0 != null) {
            str = ", " + ((Object) this.f30977u0.f29900b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void Q(k00 k00Var, boolean z10) {
        int i9;
        ArrayList arrayList = this.f30960c0;
        ArrayList arrayList2 = this.f30962e0;
        arrayList2.clear();
        arrayList2.addAll(this.f30961d0);
        int i10 = 0;
        if (!z10) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        T(true);
        if (z10) {
            i9 = R.string.SelectAll;
        } else {
            i9 = R.string.DeselectAll;
        }
        k00Var.a(LocaleController.getString(i9), new gh.u5(this, k00Var, z10, 16));
        P(true);
        while (true) {
            wk0 wk0Var = this.d;
            if (i10 < wk0Var.getChildCount()) {
                View childAt = wk0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((org.telegram.ui.Cells.g4) childAt).c(arrayList2.contains((Long) tag), true);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n00.R():void");
    }

    public final void T(boolean z10) {
        String string;
        float f10;
        int i9;
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V;
        ArrayList arrayList = this.f30962e0;
        int size = arrayList.size();
        j00 j00Var = this.f30965h0;
        if (j00Var != null) {
            if (this.X) {
                if (size > 0) {
                    i10 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i10 = R.string.FolderLinkButtonRemove;
                }
                j00Var.b(LocaleController.getString(i10), z10);
            } else {
                ArrayList arrayList2 = this.f30960c0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i11 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f30965h0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.Y, this.f30965h0.f29564b.f29332a.getFontMetricsInt(), false), this.Z, this.f30965h0.f29564b.f29332a.getFontMetricsInt())), z10);
                        j00 j00Var2 = this.f30965h0;
                        if (this.f30958a0) {
                            i11 = 26;
                        }
                        j00Var2.f29564b.f29341l = i11;
                    } else {
                        j00 j00Var3 = this.f30965h0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        j00Var3.b(string, z10);
                    }
                } else {
                    this.f30965h0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            j00 j00Var4 = this.f30965h0;
            i6 i6Var = j00Var4.f29565c;
            if (z10) {
                i6Var.b();
            }
            if (z10 && size != (i9 = j00Var4.f29571w) && size > 0 && i9 > 0) {
                ValueAnimator valueAnimator = j00Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j00Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j00Var4.v = ofFloat;
                ofFloat.addUpdateListener(new i00(j00Var4, 1));
                j00Var4.v.addListener(new org.telegram.ui.xp(j00Var4, 29));
                j00Var4.v.setInterpolator(new OvershootInterpolator(2.0f));
                j00Var4.v.setDuration(200L);
                j00Var4.v.start();
            }
            j00Var4.f29571w = size;
            if (size != 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            j00Var4.d = f10;
            i6Var.q("" + size, z10, true);
            j00Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f30965h0.setEnabled(!arrayList.isEmpty());
            }
        }
        m00 m00Var = this.f30967j0;
        if (m00Var != null) {
            m00Var.a();
        }
    }

    public final void U() {
        int i9;
        ArrayList arrayList = this.f30961d0;
        ArrayList arrayList2 = this.f30960c0;
        k00 k00Var = this.f30977u0;
        if (k00Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.X) {
            k00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            k00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f30962e0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            k00 k00Var2 = this.f30977u0;
            if (z10) {
                i9 = R.string.DeselectAll;
            } else {
                i9 = R.string.SelectAll;
            }
            k00Var2.a(LocaleController.getString(i9), new eh.f(28, this, z10));
            return;
        }
        this.f30977u0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f30978v0 >= 0) {
            this.f32410n.getConnectionsManager().cancelRequest(this.f30978v0, true);
        }
        Utilities.Callback callback = this.f30980x0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.f30979w0));
            this.f30980x0 = null;
        }
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        return new h00(this);
    }

    @Override
    public final CharSequence y() {
        if (this.X) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.V instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f30960c0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
