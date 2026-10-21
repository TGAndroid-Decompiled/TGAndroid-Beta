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
public final class k10 extends bb {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f27695a0;
    public final boolean f27696b0;
    public String f27697c0;
    public ArrayList f27698d0;
    public boolean f27699e0;
    public CharSequence f27700f0;
    public ArrayList f27701g0;
    public ArrayList f27702h0;
    public ArrayList f27703i0;
    public ArrayList f27704j0;
    public FrameLayout f27705k0;
    public g10 f27706l0;
    public View m0;
    public j10 f27707n0;
    public int f27708o0;
    public int f27709p0;
    public int f27710q0;
    public int f27711r0;
    public int f27712s0;
    public int f27713t0;
    public int f27714u0;
    public int f27715v0;
    public int f27716w0;
    public int f27717x0;
    public h10 f27718y0;
    public int f27719z0;

    public k10(org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList) {
        super(n2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f27697c0 = "";
        this.f27698d0 = new ArrayList();
        this.f27700f0 = "";
        this.f27702h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f27703i0 = arrayList2;
        this.f27719z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f27696b0 = true;
        this.f27701g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = n2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f17799id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f27697c0 = dialogFilter.name;
            this.f27698d0 = dialogFilter.entities;
            this.f27699e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f27703i0.size(); i12++) {
                TLRPC.Peer peer = n2Var.getMessagesController().getPeer(((Long) this.f27703i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f27701g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f27703i0.contains(l4)) {
                    TLRPC.Peer peer2 = n2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = n2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f27701g0.add(peer2);
                    }
                }
            }
        }
        T();
    }

    public static void U(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = n2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).f17799id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        org.telegram.ui.i4 i4Var = new org.telegram.ui.i4(i10, n2Var, callback, 9);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getContext());
            alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new en(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tv(i4Var, 4));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
            n2Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
                return;
            }
            return;
        }
        i4Var.run();
    }

    @Override
    public final CharSequence A() {
        if (this.f27696b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f27701g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }

    @Override
    public final void G(lw0 lw0Var) {
        float f7;
        jm0 jm0Var = this.d;
        jm0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f27706l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        jm0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        jm0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void R(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f27703i0.size(), new Object[0]));
        if (z10 && this.f27718y0 != null) {
            str = ", " + ((Object) this.f27718y0.f26710b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void S(h10 h10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f27701g0;
        ArrayList arrayList2 = this.f27703i0;
        arrayList2.clear();
        arrayList2.addAll(this.f27702h0);
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
        h10Var.a(LocaleController.getString(i10), new ai.y7(this, h10Var, z10, 21));
        R(true);
        while (true) {
            jm0 jm0Var = this.d;
            if (i11 < jm0Var.getChildCount()) {
                View childAt = jm0Var.getChildAt(i11);
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

    public final void T() {
        boolean z10;
        long j10;
        boolean isNotInChat;
        ArrayList arrayList = this.f27704j0;
        this.f27700f0 = AndroidUtilities.replaceCharSequence("*", this.f27697c0, "✱");
        ArrayList arrayList2 = this.f27701g0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.n2 n2Var = this.f24882n;
                        if (z11) {
                            j10 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(n2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(n2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else {
                            z10 = false;
                            j10 = 0;
                        }
                        z10 = !isNotInChat;
                    }
                    if (j10 != 0 && !this.f27696b0) {
                        if (z10) {
                            this.f27702h0.add(Long.valueOf(j10));
                        }
                        this.f27703i0.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.f27708o0 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i11 = this.f27708o0;
            int i12 = i11 + 1;
            this.f27709p0 = i11;
            int i13 = i11 + 2;
            this.f27708o0 = i13;
            this.f27710q0 = i12;
            this.f27711r0 = i13;
            int size = arrayList2.size() + i13;
            this.f27708o0 = size;
            this.f27712s0 = size;
        } else {
            this.f27709p0 = -1;
            this.f27710q0 = -1;
            this.f27711r0 = -1;
            this.f27712s0 = -1;
        }
        int i14 = this.f27708o0;
        this.f27708o0 = i14 + 1;
        this.f27713t0 = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i15 = this.f27708o0;
            int i16 = i15 + 1;
            this.f27708o0 = i16;
            this.f27714u0 = i15;
            this.f27715v0 = i16;
            int size2 = arrayList.size() + i16;
            this.f27716w0 = size2;
            this.f27708o0 = size2 + 1;
            this.f27717x0 = size2;
        } else {
            this.f27714u0 = -1;
            this.f27715v0 = -1;
            this.f27716w0 = -1;
            this.f27717x0 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        bs bsVar = bs.h;
        frameLayout.e = new f6(350L, bsVar);
        float f7 = 0.0f;
        frameLayout.h = 0.0f;
        frameLayout.f26469s = 1.0f;
        frameLayout.f26471x = 1.0f;
        frameLayout.f26472y = true;
        View view = new View(context);
        frameLayout.f26466f = view;
        int i17 = org.telegram.ui.ActionBar.h6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.x5.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.x5.b(org.telegram.ui.ActionBar.h6.x0(null, i17, false))));
        frameLayout.addView(view, w7.z5.c(-1.0f, -1));
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.x0(null, i17, false)));
        Paint paint = new Paint(1);
        frameLayout.f26463a = paint;
        int i18 = org.telegram.ui.ActionBar.h6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
        p6 p6Var = new p6(true, true, false);
        frameLayout.f26464b = p6Var;
        p6Var.n(0.3f, 250L, bsVar);
        p6Var.setCallback(frameLayout);
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.u(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
        p6Var.t("", true, true);
        p6Var.f29226b = 1;
        p6 p6Var2 = new p6(false, false, true);
        frameLayout.f26465c = p6Var2;
        p6Var2.n(0.3f, 250L, bsVar);
        p6Var2.setCallback(frameLayout);
        p6Var2.w(AndroidUtilities.dp(12.0f));
        p6Var2.x(AndroidUtilities.bold());
        p6Var2.u(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        p6Var2.t("", true, true);
        p6Var2.f29226b = 1;
        frameLayout.setWillNotDraw(false);
        this.f27706l0 = frameLayout;
        frameLayout.setOnClickListener(new f0(this, 15));
        this.containerView.addView(this.f27706l0, w7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.m0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        this.containerView.addView(this.m0, w7.z5.d(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f27706l0 != null) {
            f7 = 68.0f;
        }
        this.d.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f27705k0 = frameLayout2;
        this.containerView.addView(frameLayout2, w7.z5.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false));
        V(false);
        this.e.setTitle(A());
    }

    public final void V(boolean z10) {
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        ArrayList arrayList = this.f27703i0;
        int size = arrayList.size();
        g10 g10Var = this.f27706l0;
        if (g10Var != null) {
            if (this.f27696b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                g10Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f27701g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f27706l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f27697c0, this.f27706l0.f26464b.f29224a.getFontMetricsInt(), false), this.f27698d0, this.f27706l0.f26464b.f29224a.getFontMetricsInt())), z10);
                        g10 g10Var2 = this.f27706l0;
                        if (this.f27699e0) {
                            i12 = 26;
                        }
                        g10Var2.f26464b.f29238p = i12;
                    } else {
                        g10 g10Var3 = this.f27706l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        g10Var3.b(string, z10);
                    }
                } else {
                    this.f27706l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            g10 g10Var4 = this.f27706l0;
            p6 p6Var = g10Var4.f26465c;
            if (z10) {
                p6Var.a();
            }
            if (z10 && size != (i10 = g10Var4.f26470w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = g10Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    g10Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                g10Var4.v = ofFloat;
                ofFloat.addUpdateListener(new f10(g10Var4, 1));
                g10Var4.v.addListener(new org.telegram.ui.nq(g10Var4, 28));
                org.telegram.messenger.mk.l(2.0f, g10Var4.v);
                g10Var4.v.setDuration(200L);
                g10Var4.v.start();
            }
            g10Var4.f26470w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g10Var4.d = f7;
            p6Var.t("" + size, z10, true);
            g10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f27706l0.setEnabled(!arrayList.isEmpty());
            }
        }
        j10 j10Var = this.f27707n0;
        if (j10Var != null) {
            j10Var.a();
        }
    }

    public final void W() {
        int i10;
        ArrayList arrayList = this.f27702h0;
        ArrayList arrayList2 = this.f27701g0;
        h10 h10Var = this.f27718y0;
        if (h10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f27696b0) {
            h10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            h10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f27703i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            h10 h10Var2 = this.f27718y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            h10Var2.a(LocaleController.getString(i10), new ah.t(28, this, z10));
            return;
        }
        this.f27718y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f27719z0 >= 0) {
            this.f24882n.getConnectionsManager().cancelRequest(this.f27719z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        return new e10(this);
    }
}
