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
    public TL_chatlists.TL_chatlists_chatlistUpdates f27471a0;
    public final boolean f27472b0;
    public String f27473c0;
    public ArrayList f27474d0;
    public boolean f27475e0;
    public CharSequence f27476f0;
    public ArrayList f27477g0;
    public ArrayList f27478h0;
    public ArrayList f27479i0;
    public ArrayList f27480j0;
    public FrameLayout f27481k0;
    public k10 f27482l0;
    public View m0;
    public n10 f27483n0;
    public int f27484o0;
    public int f27485p0;
    public int f27486q0;
    public int f27487r0;
    public int f27488s0;
    public int f27489t0;
    public int f27490u0;
    public int f27491v0;
    public int f27492w0;
    public int f27493x0;
    public l10 f27494y0;
    public int f27495z0;

    public o10(org.telegram.ui.ActionBar.m2 m2Var, int i10, ArrayList arrayList) {
        super(m2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f27473c0 = "";
        this.f27474d0 = new ArrayList();
        this.f27476f0 = "";
        this.f27478h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f27479i0 = arrayList2;
        this.f27495z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f27472b0 = true;
        this.f27477g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = m2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f16400id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f27473c0 = dialogFilter.name;
            this.f27474d0 = dialogFilter.entities;
            this.f27475e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f27479i0.size(); i12++) {
                TLRPC.Peer peer = m2Var.getMessagesController().getPeer(((Long) this.f27479i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f27477g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f27479i0.contains(l4)) {
                    TLRPC.Peer peer2 = m2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = m2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f27477g0.add(peer2);
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
                if (arrayList.get(i11).f16400id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        org.telegram.ui.gm gmVar = new org.telegram.ui.gm(i10, m2Var, callback, 5);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getContext());
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hn(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xv(gmVar, 4));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            m2Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                return;
            }
            return;
        }
        gmVar.run();
    }

    @Override
    public final CharSequence B() {
        if (this.f27472b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f27477g0;
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
        if (this.f27482l0 != null) {
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
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f27479i0.size(), new Object[0]));
        if (z10 && this.f27494y0 != null) {
            str = ", " + ((Object) this.f27494y0.f26579b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void S(l10 l10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f27477g0;
        ArrayList arrayList2 = this.f27479i0;
        arrayList2.clear();
        arrayList2.addAll(this.f27478h0);
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
        l10Var.a(LocaleController.getString(i10), new di.x0(this, l10Var, z10, 18));
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
        ArrayList arrayList = this.f27480j0;
        this.f27476f0 = AndroidUtilities.replaceCharSequence("*", this.f27473c0, "✱");
        ArrayList arrayList2 = this.f27477g0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.m2 m2Var = this.f24070n;
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
                    if (j10 != 0 && !this.f27472b0) {
                        if (z10) {
                            this.f27478h0.add(Long.valueOf(j10));
                        }
                        this.f27479i0.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.f27484o0 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i11 = this.f27484o0;
            int i12 = i11 + 1;
            this.f27485p0 = i11;
            int i13 = i11 + 2;
            this.f27484o0 = i13;
            this.f27486q0 = i12;
            this.f27487r0 = i13;
            int size = arrayList2.size() + i13;
            this.f27484o0 = size;
            this.f27488s0 = size;
        } else {
            this.f27485p0 = -1;
            this.f27486q0 = -1;
            this.f27487r0 = -1;
            this.f27488s0 = -1;
        }
        int i14 = this.f27484o0;
        this.f27484o0 = i14 + 1;
        this.f27489t0 = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i15 = this.f27484o0;
            int i16 = i15 + 1;
            this.f27484o0 = i16;
            this.f27490u0 = i15;
            this.f27491v0 = i16;
            int size2 = arrayList.size() + i16;
            this.f27492w0 = size2;
            this.f27484o0 = size2 + 1;
            this.f27493x0 = size2;
        } else {
            this.f27490u0 = -1;
            this.f27491v0 = -1;
            this.f27492w0 = -1;
            this.f27493x0 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        es esVar = es.h;
        frameLayout.e = new g6(350L, esVar);
        float f7 = 0.0f;
        frameLayout.h = 0.0f;
        frameLayout.f26174s = 1.0f;
        frameLayout.f26176x = 1.0f;
        frameLayout.f26177y = true;
        View view = new View(context);
        frameLayout.f26171f = view;
        int i17 = org.telegram.ui.ActionBar.g6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.g6.x0(null, i17, false))));
        frameLayout.addView(view, w7.z5.d(-1.0f, -1));
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.x0(null, i17, false)));
        Paint paint = new Paint(1);
        frameLayout.f26168a = paint;
        int i18 = org.telegram.ui.ActionBar.g6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
        r6 r6Var = new r6(true, true, false);
        frameLayout.f26169b = r6Var;
        r6Var.n(0.3f, 250L, esVar);
        r6Var.setCallback(frameLayout);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
        r6Var.t("", true, true);
        r6Var.f28435b = 1;
        r6 r6Var2 = new r6(false, false, true);
        frameLayout.f26170c = r6Var2;
        r6Var2.n(0.3f, 250L, esVar);
        r6Var2.setCallback(frameLayout);
        r6Var2.w(AndroidUtilities.dp(12.0f));
        r6Var2.x(AndroidUtilities.bold());
        r6Var2.u(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
        r6Var2.t("", true, true);
        r6Var2.f28435b = 1;
        frameLayout.setWillNotDraw(false);
        this.f27482l0 = frameLayout;
        frameLayout.setOnClickListener(new f0(this, 15));
        this.containerView.addView(this.f27482l0, w7.z5.a(48.0f, 16.0f, 10.0f, 16.0f, 10.0f, -1, 87));
        View view2 = new View(getContext());
        this.m0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        this.containerView.addView(this.m0, w7.z5.a(1.0f / AndroidUtilities.density, 6.0f, 0.0f, 6.0f, 68.0f, -1, 87));
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f27482l0 != null) {
            f7 = 68.0f;
        }
        this.d.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f27481k0 = frameLayout2;
        this.containerView.addView(frameLayout2, w7.z5.a(100.0f, 6.0f, 0.0f, 6.0f, 68.0f, -1, 87));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false));
        V(false);
        this.e.setTitle(B());
    }

    public final void V(boolean z10) {
        ArrayList arrayList;
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        int size = this.f27479i0.size();
        k10 k10Var = this.f27482l0;
        if (k10Var != null) {
            if (this.f27472b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                k10Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f27477g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f27482l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f27473c0, this.f27482l0.f26169b.f28433a.getFontMetricsInt(), false), this.f27474d0, this.f27482l0.f26169b.f28433a.getFontMetricsInt())), z10);
                        k10 k10Var2 = this.f27482l0;
                        if (this.f27475e0) {
                            i12 = 26;
                        }
                        k10Var2.f26169b.f28447p = i12;
                    } else {
                        k10 k10Var3 = this.f27482l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        k10Var3.b(string, z10);
                    }
                } else {
                    this.f27482l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            k10 k10Var4 = this.f27482l0;
            r6 r6Var = k10Var4.f26170c;
            if (z10) {
                r6Var.a();
            }
            if (z10 && size != (i10 = k10Var4.f26175w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = k10Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    k10Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                k10Var4.v = ofFloat;
                ofFloat.addUpdateListener(new j10(k10Var4, 1));
                k10Var4.v.addListener(new l6(k10Var4, 26));
                org.telegram.messenger.sk.l(2.0f, k10Var4.v);
                k10Var4.v.setDuration(200L);
                k10Var4.v.start();
            }
            k10Var4.f26175w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            k10Var4.d = f7;
            r6Var.t("" + size, z10, true);
            k10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f27482l0.setEnabled(!arrayList.isEmpty());
            }
        }
        n10 n10Var = this.f27483n0;
        if (n10Var != null) {
            n10Var.a();
        }
    }

    public final void W() {
        int i10;
        ArrayList arrayList = this.f27478h0;
        ArrayList arrayList2 = this.f27477g0;
        l10 l10Var = this.f27494y0;
        if (l10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f27472b0) {
            l10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            l10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f27479i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            l10 l10Var2 = this.f27494y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            l10Var2.a(LocaleController.getString(i10), new ah.t(25, this, z10));
            return;
        }
        this.f27494y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f27495z0 >= 0) {
            this.f24070n.getConnectionsManager().cancelRequest(this.f27495z0, true);
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
