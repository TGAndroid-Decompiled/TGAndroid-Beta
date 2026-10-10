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
public final class t10 extends eb {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f30915a0;
    public final boolean f30916b0;
    public String f30917c0;
    public ArrayList f30918d0;
    public boolean f30919e0;
    public CharSequence f30920f0;
    public ArrayList f30921g0;
    public ArrayList f30922h0;
    public ArrayList f30923i0;
    public ArrayList f30924j0;
    public FrameLayout f30925k0;
    public p10 f30926l0;
    public View m0;
    public s10 f30927n0;
    public int f30928o0;
    public int f30929p0;
    public int f30930q0;
    public int f30931r0;
    public int f30932s0;
    public int f30933t0;
    public int f30934u0;
    public int f30935v0;
    public int f30936w0;
    public int f30937x0;
    public q10 f30938y0;
    public int f30939z0;

    public t10(org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList) {
        super(n2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f30917c0 = "";
        this.f30918d0 = new ArrayList();
        this.f30920f0 = "";
        this.f30922h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f30923i0 = arrayList2;
        this.f30939z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f30916b0 = true;
        this.f30921g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = n2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f17256id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f30917c0 = dialogFilter.name;
            this.f30918d0 = dialogFilter.entities;
            this.f30919e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f30923i0.size(); i12++) {
                TLRPC.Peer peer = n2Var.getMessagesController().getPeer(((Long) this.f30923i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f30921g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f30923i0.contains(l4)) {
                    TLRPC.Peer peer2 = n2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = n2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f30921g0.add(peer2);
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
                if (arrayList.get(i11).f17256id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        zk zkVar = new zk(i10, n2Var, callback, 4);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getContext());
            alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new kn(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cw(zkVar, 4));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
            n2Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
                return;
            }
            return;
        }
        zkVar.run();
    }

    @Override
    public final CharSequence B() {
        if (this.f30916b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f30921g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }

    @Override
    public final void H(tw0 tw0Var) {
        float f7;
        rm0 rm0Var = this.d;
        rm0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f30926l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        rm0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        rm0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void R(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f30923i0.size(), new Object[0]));
        if (z10 && this.f30938y0 != null) {
            str = ", " + ((Object) this.f30938y0.f29977b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void S(q10 q10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f30921g0;
        ArrayList arrayList2 = this.f30923i0;
        arrayList2.clear();
        arrayList2.addAll(this.f30922h0);
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
        q10Var.a(LocaleController.getString(i10), new ci.x0(this, q10Var, z10, 19));
        R(true);
        while (true) {
            rm0 rm0Var = this.d;
            if (i11 < rm0Var.getChildCount()) {
                View childAt = rm0Var.getChildAt(i11);
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
        ArrayList arrayList = this.f30924j0;
        this.f30920f0 = AndroidUtilities.replaceCharSequence("*", this.f30917c0, "✱");
        ArrayList arrayList2 = this.f30921g0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.n2 n2Var = this.f25985n;
                        if (z11) {
                            j3 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(n2Var.getMessagesController().getChat(Long.valueOf(-j3)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j3 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(n2Var.getMessagesController().getChat(Long.valueOf(-j3)));
                        } else {
                            z10 = false;
                            j3 = 0;
                        }
                        z10 = !isNotInChat;
                    }
                    if (j3 != 0 && !this.f30916b0) {
                        if (z10) {
                            this.f30922h0.add(Long.valueOf(j3));
                        }
                        this.f30923i0.add(Long.valueOf(j3));
                    }
                }
            }
        }
        this.f30928o0 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i11 = this.f30928o0;
            int i12 = i11 + 1;
            this.f30929p0 = i11;
            int i13 = i11 + 2;
            this.f30928o0 = i13;
            this.f30930q0 = i12;
            this.f30931r0 = i13;
            int size = arrayList2.size() + i13;
            this.f30928o0 = size;
            this.f30932s0 = size;
        } else {
            this.f30929p0 = -1;
            this.f30930q0 = -1;
            this.f30931r0 = -1;
            this.f30932s0 = -1;
        }
        int i14 = this.f30928o0;
        this.f30928o0 = i14 + 1;
        this.f30933t0 = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i15 = this.f30928o0;
            int i16 = i15 + 1;
            this.f30928o0 = i16;
            this.f30934u0 = i15;
            this.f30935v0 = i16;
            int size2 = arrayList.size() + i16;
            this.f30936w0 = size2;
            this.f30928o0 = size2 + 1;
            this.f30937x0 = size2;
        } else {
            this.f30934u0 = -1;
            this.f30935v0 = -1;
            this.f30936w0 = -1;
            this.f30937x0 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        is isVar = is.h;
        frameLayout.f29648e = new g6(350L, isVar);
        float f7 = 0.0f;
        frameLayout.h = 0.0f;
        frameLayout.f29652s = 1.0f;
        frameLayout.f29654x = 1.0f;
        frameLayout.f29655y = true;
        View view = new View(context);
        frameLayout.f29649f = view;
        int i17 = org.telegram.ui.ActionBar.i6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.i6.x0(null, i17, false))));
        frameLayout.addView(view, w7.x5.d(-1.0f, -1));
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.i6.x0(null, i17, false)));
        Paint paint = new Paint(1);
        frameLayout.f29645a = paint;
        int i18 = org.telegram.ui.ActionBar.i6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i18, false));
        q6 q6Var = new q6(true, true, false);
        frameLayout.f29646b = q6Var;
        q6Var.n(0.3f, 250L, isVar);
        q6Var.setCallback(frameLayout);
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.u(org.telegram.ui.ActionBar.i6.x0(null, i18, false));
        q6Var.t("", true, true);
        q6Var.f30031b = 1;
        q6 q6Var2 = new q6(false, false, true);
        frameLayout.f29647c = q6Var2;
        q6Var2.n(0.3f, 250L, isVar);
        q6Var2.setCallback(frameLayout);
        q6Var2.w(AndroidUtilities.dp(12.0f));
        q6Var2.x(AndroidUtilities.bold());
        q6Var2.u(org.telegram.ui.ActionBar.i6.x0(null, i17, false));
        q6Var2.t("", true, true);
        q6Var2.f30031b = 1;
        frameLayout.setWillNotDraw(false);
        this.f30926l0 = frameLayout;
        frameLayout.setOnClickListener(new f0(this, 15));
        this.containerView.addView(this.f30926l0, w7.x5.a(48.0f, 16.0f, 10.0f, 16.0f, 10.0f, -1, 87));
        View view2 = new View(getContext());
        this.m0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false));
        this.containerView.addView(this.m0, w7.x5.a(1.0f / AndroidUtilities.density, 6.0f, 0.0f, 6.0f, 68.0f, -1, 87));
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f30926l0 != null) {
            f7 = 68.0f;
        }
        this.d.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f30925k0 = frameLayout2;
        this.containerView.addView(frameLayout2, w7.x5.a(100.0f, 6.0f, 0.0f, 6.0f, 68.0f, -1, 87));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false));
        V(false);
        this.f25983e.setTitle(B());
    }

    public final void V(boolean z10) {
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        ArrayList arrayList = this.f30923i0;
        int size = arrayList.size();
        p10 p10Var = this.f30926l0;
        if (p10Var != null) {
            if (this.f30916b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                p10Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f30921g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f30926l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f30917c0, this.f30926l0.f29646b.f30029a.getFontMetricsInt(), false), this.f30918d0, this.f30926l0.f29646b.f30029a.getFontMetricsInt())), z10);
                        p10 p10Var2 = this.f30926l0;
                        if (this.f30919e0) {
                            i12 = 26;
                        }
                        p10Var2.f29646b.f30044p = i12;
                    } else {
                        p10 p10Var3 = this.f30926l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        p10Var3.b(string, z10);
                    }
                } else {
                    this.f30926l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            p10 p10Var4 = this.f30926l0;
            q6 q6Var = p10Var4.f29647c;
            if (z10) {
                q6Var.a();
            }
            if (z10 && size != (i10 = p10Var4.f29653w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = p10Var4.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    p10Var4.v = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                p10Var4.v = ofFloat;
                ofFloat.addUpdateListener(new o10(p10Var4, 1));
                p10Var4.v.addListener(new t8(p10Var4, 23));
                org.telegram.messenger.bi.l(2.0f, p10Var4.v);
                p10Var4.v.setDuration(200L);
                p10Var4.v.start();
            }
            p10Var4.f29653w = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            p10Var4.d = f7;
            q6Var.t("" + size, z10, true);
            p10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f30926l0.setEnabled(!arrayList.isEmpty());
            }
        }
        s10 s10Var = this.f30927n0;
        if (s10Var != null) {
            s10Var.a();
        }
    }

    public final void W() {
        int i10;
        ArrayList arrayList = this.f30922h0;
        ArrayList arrayList2 = this.f30921g0;
        q10 q10Var = this.f30938y0;
        if (q10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f30916b0) {
            q10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            q10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f30923i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            q10 q10Var2 = this.f30938y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            q10Var2.a(LocaleController.getString(i10), new bi.f(25, this, z10));
            return;
        }
        this.f30938y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f30939z0 >= 0) {
            this.f25985n.getConnectionsManager().cancelRequest(this.f30939z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        return new n10(this);
    }
}
