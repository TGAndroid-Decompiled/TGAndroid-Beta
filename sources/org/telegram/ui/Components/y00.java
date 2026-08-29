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
public final class y00 extends xa {
    public long A0;
    public String T;
    public int U;
    public TL_chatlists.chatlist_ChatlistInvite V;
    public TL_chatlists.TL_chatlists_chatlistUpdates W;
    public final boolean X;
    public String Y;
    public ArrayList Z;
    public boolean f34864a0;
    public CharSequence f34865b0;
    public ArrayList f34866c0;
    public ArrayList f34867d0;
    public ArrayList f34868e0;
    public ArrayList f34869f0;
    public FrameLayout f34870g0;
    public u00 f34871h0;
    public View f34872i0;
    public x00 f34873j0;
    public int f34874k0;
    public int f34875l0;
    public int m0;
    public int f34876n0;
    public int f34877o0;
    public int f34878p0;
    public int f34879q0;
    public int f34880r0;
    public int f34881s0;
    public int f34882t0;
    public v00 f34883u0;
    public int f34884v0;
    public boolean f34885w0;
    public Utilities.Callback f34886x0;
    public int f34887y0;
    public long f34888z0;

    public y00(org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList) {
        super(o2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.U = -1;
        this.Y = "";
        this.Z = new ArrayList();
        this.f34865b0 = "";
        this.f34867d0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f34868e0 = arrayList2;
        this.f34884v0 = -1;
        this.f34887y0 = -5;
        this.U = i10;
        this.X = true;
        this.f34866c0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = o2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f19620id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.Y = dialogFilter.name;
            this.Z = dialogFilter.entities;
            this.f34864a0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f34868e0.size(); i12++) {
                TLRPC.Peer peer = o2Var.getMessagesController().getPeer(((Long) this.f34868e0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f34866c0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l10 = dialogFilter.alwaysShow.get(i13);
                long longValue = l10.longValue();
                if (!this.f34868e0.contains(l10)) {
                    TLRPC.Peer peer2 = o2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = o2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f34866c0.add(peer2);
                    }
                }
            }
        }
        S();
    }

    public static void T(org.telegram.ui.ActionBar.o2 o2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = o2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).f19620id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        rm rmVar = new rm(i10, o2Var, callback, 3);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getContext());
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new om(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cv(rmVar, 4));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            o2Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                return;
            }
            return;
        }
        rmVar.run();
    }

    @Override
    public final void F(hv0 hv0Var) {
        float f9;
        jl0 jl0Var = this.d;
        jl0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f34871h0 != null) {
            f9 = 68.0f;
        } else {
            f9 = 0.0f;
        }
        jl0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f9));
        jl0Var.setOnItemClickListener(new k(this, 8));
    }

    public final void Q(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f34868e0.size(), new Object[0]));
        if (z10 && this.f34883u0 != null) {
            str = ", " + ((Object) this.f34883u0.f33414b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void R(v00 v00Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f34866c0;
        ArrayList arrayList2 = this.f34868e0;
        arrayList2.clear();
        arrayList2.addAll(this.f34867d0);
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
        v00Var.a(LocaleController.getString(i10), new jh.r5(this, v00Var, z10, 16));
        Q(true);
        while (true) {
            jl0 jl0Var = this.d;
            if (i11 < jl0Var.getChildCount()) {
                View childAt = jl0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.e4) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((org.telegram.ui.Cells.e4) childAt).c(arrayList2.contains((Long) tag), true);
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y00.S():void");
    }

    public final void U(boolean z10) {
        String string;
        float f9;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V;
        ArrayList arrayList = this.f34868e0;
        int size = arrayList.size();
        u00 u00Var = this.f34871h0;
        if (u00Var != null) {
            if (this.X) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                u00Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f34866c0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f34871h0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.Y, this.f34871h0.f33071b.f30861a.getFontMetricsInt(), false), this.Z, this.f34871h0.f33071b.f30861a.getFontMetricsInt())), z10);
                        u00 u00Var2 = this.f34871h0;
                        if (this.f34864a0) {
                            i12 = 26;
                        }
                        u00Var2.f33071b.f30870l = i12;
                    } else {
                        u00 u00Var3 = this.f34871h0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        u00Var3.b(string, z10);
                    }
                } else {
                    this.f34871h0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            u00 u00Var4 = this.f34871h0;
            n6 n6Var = u00Var4.f33072c;
            if (z10) {
                n6Var.b();
            }
            if (z10 && size != (i10 = u00Var4.f33078w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = u00Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    u00Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                u00Var4.v = ofFloat;
                ofFloat.addUpdateListener(new t00(u00Var4, 1));
                u00Var4.v.addListener(new zz(u00Var4, 1));
                u00Var4.v.setInterpolator(new OvershootInterpolator(2.0f));
                u00Var4.v.setDuration(200L);
                u00Var4.v.start();
            }
            u00Var4.f33078w = size;
            if (size != 0) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            u00Var4.d = f9;
            n6Var.q("" + size, z10, true);
            u00Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f34871h0.setEnabled(!arrayList.isEmpty());
            }
        }
        x00 x00Var = this.f34873j0;
        if (x00Var != null) {
            x00Var.a();
        }
    }

    public final void V() {
        int i10;
        ArrayList arrayList = this.f34867d0;
        ArrayList arrayList2 = this.f34866c0;
        v00 v00Var = this.f34883u0;
        if (v00Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.X) {
            v00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            v00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f34868e0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            v00 v00Var2 = this.f34883u0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            v00Var2.a(LocaleController.getString(i10), new hh.f(27, this, z10));
            return;
        }
        this.f34883u0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f34884v0 >= 0) {
            this.f34662n.getConnectionsManager().cancelRequest(this.f34884v0, true);
        }
        Utilities.Callback callback = this.f34886x0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.f34885w0));
            this.f34886x0 = null;
        }
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        return new s00(this);
    }

    @Override
    public final CharSequence y() {
        if (this.X) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.V instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f34866c0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
