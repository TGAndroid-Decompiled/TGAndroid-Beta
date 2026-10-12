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
public final class v10 extends db {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f31324a0;
    public final boolean f31325b0;
    public String f31326c0;
    public ArrayList f31327d0;
    public boolean f31328e0;
    public CharSequence f31329f0;
    public ArrayList f31330g0;
    public ArrayList f31331h0;
    public ArrayList f31332i0;
    public ArrayList f31333j0;
    public FrameLayout f31334k0;
    public r10 f31335l0;
    public View m0;
    public u10 f31336n0;
    public int f31337o0;
    public int f31338p0;
    public int f31339q0;
    public int f31340r0;
    public int f31341s0;
    public int f31342t0;
    public int f31343u0;
    public int f31344v0;
    public int f31345w0;
    public int f31346x0;
    public s10 f31347y0;
    public int f31348z0;

    public v10(org.telegram.ui.ActionBar.m2 m2Var, int i10, ArrayList arrayList) {
        super(m2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f31326c0 = "";
        this.f31327d0 = new ArrayList();
        this.f31329f0 = "";
        this.f31331h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f31332i0 = arrayList2;
        this.f31348z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f31325b0 = true;
        this.f31330g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = m2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f17003id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f31326c0 = dialogFilter.name;
            this.f31327d0 = dialogFilter.entities;
            this.f31328e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f31332i0.size(); i12++) {
                TLRPC.Peer peer = m2Var.getMessagesController().getPeer(((Long) this.f31332i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f31330g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f31332i0.contains(l4)) {
                    TLRPC.Peer peer2 = m2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = m2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f31330g0.add(peer2);
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
                if (arrayList.get(i11).f17003id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        bl blVar = new bl(i10, m2Var, callback, 4);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getContext());
            alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mn(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ew(blVar, 4));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
            m2Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
                return;
            }
            return;
        }
        blVar.run();
    }

    @Override
    public final CharSequence A() {
        if (this.f31325b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f31330g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }

    @Override
    public final void H(yw0 yw0Var) {
        float f7;
        wm0 wm0Var = this.d;
        wm0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f31335l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        wm0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        wm0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void R(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f31332i0.size(), new Object[0]));
        if (z10 && this.f31347y0 != null) {
            str = ", " + ((Object) this.f31347y0.f30361b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void S(s10 s10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f31330g0;
        ArrayList arrayList2 = this.f31332i0;
        arrayList2.clear();
        arrayList2.addAll(this.f31331h0);
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
        s10Var.a(LocaleController.getString(i10), new ci.x0(this, s10Var, z10, 18));
        R(true);
        while (true) {
            wm0 wm0Var = this.d;
            if (i11 < wm0Var.getChildCount()) {
                View childAt = wm0Var.getChildAt(i11);
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
        long j3;
        boolean isNotInChat;
        ArrayList arrayList = this.f31333j0;
        this.f31329f0 = AndroidUtilities.replaceCharSequence("*", this.f31326c0, "✱");
        ArrayList arrayList2 = this.f31330g0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.m2 m2Var = this.f25297n;
                        if (z11) {
                            j3 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(m2Var.getMessagesController().getChat(Long.valueOf(-j3)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j3 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(m2Var.getMessagesController().getChat(Long.valueOf(-j3)));
                        } else {
                            z10 = false;
                            j3 = 0;
                        }
                        z10 = !isNotInChat;
                    }
                    if (j3 != 0 && !this.f31325b0) {
                        if (z10) {
                            this.f31331h0.add(Long.valueOf(j3));
                        }
                        this.f31332i0.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.f31337o0 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i11 = this.f31337o0;
            int i12 = i11 + 1;
            this.f31338p0 = i11;
            int i13 = i11 + 2;
            this.f31337o0 = i13;
            this.f31339q0 = i12;
            this.f31340r0 = i13;
            int size = arrayList2.size() + i13;
            this.f31337o0 = size;
            this.f31341s0 = size;
        } else {
            this.f31338p0 = -1;
            this.f31339q0 = -1;
            this.f31340r0 = -1;
            this.f31341s0 = -1;
        }
        int i14 = this.f31337o0;
        this.f31337o0 = i14 + 1;
        this.f31342t0 = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i15 = this.f31337o0;
            int i16 = i15 + 1;
            this.f31337o0 = i16;
            this.f31343u0 = i15;
            this.f31344v0 = i16;
            int size2 = arrayList.size() + i16;
            this.f31345w0 = size2;
            this.f31337o0 = size2 + 1;
            this.f31346x0 = size2;
        } else {
            this.f31343u0 = -1;
            this.f31344v0 = -1;
            this.f31345w0 = -1;
            this.f31346x0 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        js jsVar = js.h;
        frameLayout.f29978e = new g6(350L, jsVar);
        float f7 = 0.0f;
        frameLayout.h = 0.0f;
        frameLayout.f29982s = 1.0f;
        frameLayout.f29984x = 1.0f;
        frameLayout.f29985y = true;
        View view = new View(context);
        frameLayout.f29979f = view;
        int i17 = org.telegram.ui.ActionBar.h6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.h6.x0(null, i17, false))));
        frameLayout.addView(view, w7.w5.d(-1.0f, -1));
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.x0(null, i17, false)));
        Paint paint = new Paint(1);
        frameLayout.f29975a = paint;
        int i18 = org.telegram.ui.ActionBar.h6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
        q6 q6Var = new q6(true, true, false);
        frameLayout.f29976b = q6Var;
        q6Var.n(0.3f, 250L, jsVar);
        q6Var.setCallback(frameLayout);
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.u(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
        q6Var.t("", true, true);
        q6Var.f29712b = 1;
        q6 q6Var2 = new q6(false, false, true);
        frameLayout.f29977c = q6Var2;
        q6Var2.n(0.3f, 250L, jsVar);
        q6Var2.setCallback(frameLayout);
        q6Var2.w(AndroidUtilities.dp(12.0f));
        q6Var2.x(AndroidUtilities.bold());
        q6Var2.u(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        q6Var2.t("", true, true);
        q6Var2.f29712b = 1;
        frameLayout.setWillNotDraw(false);
        this.f31335l0 = frameLayout;
        frameLayout.setOnClickListener(new f0(this, 15));
        this.containerView.addView(this.f31335l0, w7.w5.a(48.0f, 16.0f, 10.0f, 16.0f, 10.0f, -1, 87));
        View view2 = new View(getContext());
        this.m0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false));
        this.containerView.addView(this.m0, w7.w5.a(1.0f / AndroidUtilities.density, 6.0f, 0.0f, 6.0f, 68.0f, -1, 87));
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f31335l0 != null) {
            f7 = 68.0f;
        }
        this.d.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f31334k0 = frameLayout2;
        this.containerView.addView(frameLayout2, w7.w5.a(100.0f, 6.0f, 0.0f, 6.0f, 68.0f, -1, 87));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20630h5, false));
        V(false);
        this.f25295e.setTitle(A());
    }

    public final void V(boolean z10) {
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        ArrayList arrayList = this.f31332i0;
        int size = arrayList.size();
        r10 r10Var = this.f31335l0;
        if (r10Var != null) {
            if (this.f31325b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                r10Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f31330g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f31335l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f31326c0, this.f31335l0.f29976b.f29710a.getFontMetricsInt(), false), this.f31327d0, this.f31335l0.f29976b.f29710a.getFontMetricsInt())), z10);
                        r10 r10Var2 = this.f31335l0;
                        if (this.f31328e0) {
                            i12 = 26;
                        }
                        r10Var2.f29976b.f29725p = i12;
                    } else {
                        r10 r10Var3 = this.f31335l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        r10Var3.b(string, z10);
                    }
                } else {
                    this.f31335l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            r10 r10Var4 = this.f31335l0;
            q6 q6Var = r10Var4.f29977c;
            if (z10) {
                q6Var.a();
            }
            if (z10 && size != (i10 = r10Var4.f29983w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = r10Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    r10Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r10Var4.v = ofFloat;
                ofFloat.addUpdateListener(new q10(r10Var4, 1));
                r10Var4.v.addListener(new t8(r10Var4, 23));
                org.telegram.messenger.am.l(2.0f, r10Var4.v);
                r10Var4.v.setDuration(200L);
                r10Var4.v.start();
            }
            r10Var4.f29983w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            r10Var4.d = f7;
            q6Var.t("" + size, z10, true);
            r10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f31335l0.setEnabled(!arrayList.isEmpty());
            }
        }
        u10 u10Var = this.f31336n0;
        if (u10Var != null) {
            u10Var.a();
        }
    }

    public final void W() {
        int i10;
        ArrayList arrayList = this.f31331h0;
        ArrayList arrayList2 = this.f31330g0;
        s10 s10Var = this.f31347y0;
        if (s10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f31325b0) {
            s10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            s10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f31332i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            s10 s10Var2 = this.f31347y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            s10Var2.a(LocaleController.getString(i10), new bi.f(25, this, z10));
            return;
        }
        this.f31347y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f31348z0 >= 0) {
            this.f25297n.getConnectionsManager().cancelRequest(this.f31348z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        return new p10(this);
    }
}
