package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
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
public final class o10 extends db {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f27768a0;
    public final boolean f27769b0;
    public String f27770c0;
    public ArrayList f27771d0;
    public boolean f27772e0;
    public CharSequence f27773f0;
    public ArrayList f27774g0;
    public ArrayList f27775h0;
    public ArrayList f27776i0;
    public ArrayList f27777j0;
    public FrameLayout f27778k0;
    public k10 f27779l0;
    public View m0;
    public n10 f27780n0;
    public int f27781o0;
    public int f27782p0;
    public int f27783q0;
    public int f27784r0;
    public int f27785s0;
    public int f27786t0;
    public int f27787u0;
    public int f27788v0;
    public int f27789w0;
    public int f27790x0;
    public l10 f27791y0;
    public int f27792z0;

    public o10(org.telegram.ui.ActionBar.m2 m2Var, int i10, ArrayList arrayList) {
        super(m2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f27770c0 = "";
        this.f27771d0 = new ArrayList();
        this.f27773f0 = "";
        this.f27775h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f27776i0 = arrayList2;
        this.f27792z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f27769b0 = true;
        this.f27774g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = m2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f16708id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f27770c0 = dialogFilter.name;
            this.f27771d0 = dialogFilter.entities;
            this.f27772e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f27776i0.size(); i12++) {
                TLRPC.Peer peer = m2Var.getMessagesController().getPeer(((Long) this.f27776i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f27774g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f27776i0.contains(l4)) {
                    TLRPC.Peer peer2 = m2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = m2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f27774g0.add(peer2);
                    }
                }
            }
        }
        T();
    }

    public static void U(org.telegram.ui.ActionBar.m2 m2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = m2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).f16708id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        org.telegram.ui.gm gmVar = new org.telegram.ui.gm(i10, m2Var, callback, 5);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getContext());
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hn(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xv(gmVar, 4));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            m2Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                return;
            }
            return;
        }
        gmVar.run();
    }

    @Override
    public final CharSequence A() {
        if (this.f27769b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f27774g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }

    @Override
    public final void H(ow0 ow0Var) {
        float f7;
        mm0 mm0Var = this.d;
        mm0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f27779l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        mm0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        mm0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void R(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f27776i0.size(), new Object[0]));
        if (z10 && this.f27791y0 != null) {
            str = ", " + ((Object) this.f27791y0.f26908b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void S(l10 l10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f27774g0;
        ArrayList arrayList2 = this.f27776i0;
        arrayList2.clear();
        arrayList2.addAll(this.f27775h0);
        int i11 = 0;
        if (!z10) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i12));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        V(true);
        if (z10) {
            i10 = R.string.SelectAll;
        } else {
            i10 = R.string.DeselectAll;
        }
        l10Var.a(LocaleController.getString(i10), new di.x0(this, l10Var, z10, 20));
        R(true);
        while (true) {
            mm0 mm0Var = this.d;
            if (i11 < mm0Var.getChildCount()) {
                View childAt = mm0Var.getChildAt(i11);
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

    public final void T() {
        boolean z10;
        long j10;
        boolean isNotInChat;
        ArrayList arrayList = this.f27777j0;
        this.f27773f0 = AndroidUtilities.replaceCharSequence("*", this.f27770c0, "✱");
        ArrayList arrayList2 = this.f27774g0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.m2 m2Var = this.f24345n;
                        if (z11) {
                            j10 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(m2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(m2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else {
                            z10 = false;
                            j10 = 0;
                        }
                        z10 = !isNotInChat;
                    }
                    if (j10 != 0 && !this.f27769b0) {
                        if (z10) {
                            this.f27775h0.add(Long.valueOf(j10));
                        }
                        this.f27776i0.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.f27781o0 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i11 = this.f27781o0;
            int i12 = i11 + 1;
            this.f27782p0 = i11;
            int i13 = i11 + 2;
            this.f27781o0 = i13;
            this.f27783q0 = i12;
            this.f27784r0 = i13;
            int size = arrayList2.size() + i13;
            this.f27781o0 = size;
            this.f27785s0 = size;
        } else {
            this.f27782p0 = -1;
            this.f27783q0 = -1;
            this.f27784r0 = -1;
            this.f27785s0 = -1;
        }
        int i14 = this.f27781o0;
        this.f27781o0 = i14 + 1;
        this.f27786t0 = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i15 = this.f27781o0;
            int i16 = i15 + 1;
            this.f27781o0 = i16;
            this.f27787u0 = i15;
            this.f27788v0 = i16;
            int size2 = arrayList.size() + i16;
            this.f27789w0 = size2;
            this.f27781o0 = size2 + 1;
            this.f27790x0 = size2;
        } else {
            this.f27787u0 = -1;
            this.f27788v0 = -1;
            this.f27789w0 = -1;
            this.f27790x0 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        es esVar = es.h;
        frameLayout.e = new g6(350L, esVar);
        float f7 = 0.0f;
        frameLayout.h = 0.0f;
        frameLayout.f26539s = 1.0f;
        frameLayout.f26541x = 1.0f;
        frameLayout.f26542y = true;
        View view = new View(context);
        frameLayout.f26536f = view;
        int i17 = org.telegram.ui.ActionBar.g6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.g6.x0(null, i17, false))));
        frameLayout.addView(view, w7.a6.d(-1.0f, -1));
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.x0(null, i17, false)));
        Paint paint = new Paint(1);
        frameLayout.f26533a = paint;
        int i18 = org.telegram.ui.ActionBar.g6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
        r6 r6Var = new r6(true, true, false);
        frameLayout.f26534b = r6Var;
        r6Var.n(0.3f, 250L, esVar);
        r6Var.setCallback(frameLayout);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
        r6Var.t("", true, true);
        r6Var.f28748b = 1;
        r6 r6Var2 = new r6(false, false, true);
        frameLayout.f26535c = r6Var2;
        r6Var2.n(0.3f, 250L, esVar);
        r6Var2.setCallback(frameLayout);
        r6Var2.w(AndroidUtilities.dp(12.0f));
        r6Var2.x(AndroidUtilities.bold());
        r6Var2.u(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
        r6Var2.t("", true, true);
        r6Var2.f28748b = 1;
        frameLayout.setWillNotDraw(false);
        this.f27779l0 = frameLayout;
        frameLayout.setOnClickListener(new f0(this, 15));
        this.containerView.addView(this.f27779l0, w7.a6.a(48.0f, 16.0f, 10.0f, 16.0f, 10.0f, -1, 87));
        View view2 = new View(getContext());
        this.m0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        this.containerView.addView(this.m0, w7.a6.a(1.0f / AndroidUtilities.density, 6.0f, 0.0f, 6.0f, 68.0f, -1, 87));
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f27779l0 != null) {
            f7 = 68.0f;
        }
        this.d.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f27778k0 = frameLayout2;
        this.containerView.addView(frameLayout2, w7.a6.a(100.0f, 6.0f, 0.0f, 6.0f, 68.0f, -1, 87));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false));
        V(false);
        this.e.setTitle(A());
    }

    public final void V(boolean z10) {
        ArrayList arrayList;
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        int size = this.f27776i0.size();
        k10 k10Var = this.f27779l0;
        if (k10Var != null) {
            if (this.f27769b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                k10Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f27774g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f27779l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f27770c0, this.f27779l0.f26534b.f28746a.getFontMetricsInt(), false), this.f27771d0, this.f27779l0.f26534b.f28746a.getFontMetricsInt())), z10);
                        k10 k10Var2 = this.f27779l0;
                        if (this.f27772e0) {
                            i12 = 26;
                        }
                        k10Var2.f26534b.f28760p = i12;
                    } else {
                        k10 k10Var3 = this.f27779l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        k10Var3.b(string, z10);
                    }
                } else {
                    this.f27779l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            k10 k10Var4 = this.f27779l0;
            r6 r6Var = k10Var4.f26535c;
            if (z10) {
                r6Var.a();
            }
            if (z10 && size != (i10 = k10Var4.f26540w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = k10Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    k10Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                k10Var4.v = ofFloat;
                ofFloat.addUpdateListener(new j10(k10Var4, 1));
                k10Var4.v.addListener(new l6(k10Var4, 26));
                org.telegram.ui.Cells.d0.l(2.0f, k10Var4.v);
                k10Var4.v.setDuration(200L);
                k10Var4.v.start();
            }
            k10Var4.f26540w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            k10Var4.d = f7;
            r6Var.t("" + size, z10, true);
            k10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f27779l0.setEnabled(!arrayList.isEmpty());
            }
        }
        n10 n10Var = this.f27780n0;
        if (n10Var != null) {
            n10Var.a();
        }
    }

    public final void W() {
        int i10;
        ArrayList arrayList = this.f27775h0;
        ArrayList arrayList2 = this.f27774g0;
        l10 l10Var = this.f27791y0;
        if (l10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f27769b0) {
            l10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            l10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f27776i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            l10 l10Var2 = this.f27791y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            l10Var2.a(LocaleController.getString(i10), new ah.t(26, this, z10));
            return;
        }
        this.f27791y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f27792z0 >= 0) {
            this.f24345n.getConnectionsManager().cancelRequest(this.f27792z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        return new i10(this);
    }
}
