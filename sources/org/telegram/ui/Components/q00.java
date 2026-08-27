package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
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

public final class q00 extends qa {
    public long A0;
    public String T;
    public int U;
    public TL_chatlists.chatlist_ChatlistInvite V;
    public TL_chatlists.TL_chatlists_chatlistUpdates W;
    public final boolean X;
    public String Y;
    public ArrayList Z;

    public boolean f31722a0;

    public CharSequence f31723b0;

    public ArrayList f31724c0;

    public ArrayList f31725d0;

    public ArrayList f31726e0;

    public ArrayList f31727f0;

    public FrameLayout f31728g0;

    public m00 f31729h0;

    public View f31730i0;

    public p00 f31731j0;

    public int f31732k0;

    public int f31733l0;
    public int m0;

    public int f31734n0;

    public int f31735o0;

    public int f31736p0;

    public int f31737q0;

    public int f31738r0;

    public int f31739s0;

    public int f31740t0;

    public n00 f31741u0;

    public int f31742v0;

    public boolean f31743w0;

    public Utilities.Callback f31744x0;

    public int f31745y0;

    public long f31746z0;

    public q00(org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList) {
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        super(n2Var, false);
        this.U = -1;
        this.Y = "";
        this.Z = new ArrayList();
        this.f31723b0 = "";
        this.f31725d0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f31726e0 = arrayList2;
        this.f31742v0 = -1;
        this.f31745y0 = -5;
        this.U = i10;
        this.X = true;
        this.f31724c0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = n2Var.getMessagesController().dialogFilters;
        if (arrayList3 == null) {
            dialogFilter = null;
            break;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList3.size()) {
                dialogFilter = null;
                break;
            } else {
                if (arrayList3.get(i11).f19622id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (dialogFilter != null) {
            this.Y = dialogFilter.name;
            this.Z = dialogFilter.entities;
            this.f31722a0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f31726e0.size(); i12++) {
                TLRPC.Peer peer = n2Var.getMessagesController().getPeer(((Long) this.f31726e0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f31724c0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l10 = dialogFilter.alwaysShow.get(i13);
                long jLongValue = l10.longValue();
                if (!this.f31726e0.contains(l10)) {
                    TLRPC.Peer peer2 = n2Var.getMessagesController().getPeer(jLongValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = n2Var.getMessagesController().getChat(Long.valueOf(-jLongValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f31724c0.add(peer2);
                    }
                }
            }
        }
        S();
    }

    public static void T(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = n2Var.getMessagesController().dialogFilters;
        if (arrayList == null) {
            dialogFilter = null;
            break;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                dialogFilter = null;
                break;
            } else {
                if (arrayList.get(i11).f19622id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        km kmVar = new km(i10, n2Var, callback, 3);
        if (dialogFilter == null || !dialogFilter.isMyChatlist()) {
            kmVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getContext());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlertLinks);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hm(callback));
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vu(kmVar, 4));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        n2Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    @Override
    public final void G(zu0 zu0Var) {
        zk0 zk0Var = this.d;
        zk0Var.setOverScrollMode(2);
        zk0Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.f31729h0 != null ? 68.0f : 0.0f));
        zk0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void Q(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f31726e0.size(), new Object[0]));
        if (!z10 || this.f31741u0 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.f31741u0.f30802b.getText());
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void R(n00 n00Var, boolean z10) {
        ArrayList arrayList = this.f31724c0;
        ArrayList arrayList2 = this.f31726e0;
        arrayList2.clear();
        arrayList2.addAll(this.f31725d0);
        int i10 = 0;
        if (!z10) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList.get(i11));
                if (!arrayList2.contains(Long.valueOf(peerDialogId))) {
                    arrayList2.add(Long.valueOf(peerDialogId));
                }
            }
        }
        U(true);
        n00Var.a(LocaleController.getString(z10 ? R.string.SelectAll : R.string.DeselectAll), new hh.t5(this, n00Var, z10, 16));
        Q(true);
        while (true) {
            zk0 zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                return;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.d4) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i10++;
        }
    }

    public final void S() {
        long j10;
        boolean zIsNotInChat;
        boolean z10;
        ArrayList arrayList = this.f31727f0;
        this.f31723b0 = AndroidUtilities.replaceCharSequence("*", this.Y, "✱");
        ArrayList arrayList2 = this.f31724c0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.n2 n2Var = this.f31855n;
                        if (z11) {
                            j10 = -peer.chat_id;
                            zIsNotInChat = ChatObject.isNotInChat(n2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            zIsNotInChat = ChatObject.isNotInChat(n2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else {
                            j10 = 0;
                        }
                        z10 = !zIsNotInChat;
                        if (j10 == 0 && !this.X) {
                            if (z10) {
                                this.f31725d0.add(Long.valueOf(j10));
                            }
                            this.f31726e0.add(Long.valueOf(j10));
                        }
                    }
                    z10 = false;
                    if (j10 == 0) {
                    }
                }
            }
        }
        this.f31732k0 = 1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.f31733l0 = -1;
            this.m0 = -1;
            this.f31734n0 = -1;
            this.f31735o0 = -1;
        } else {
            int i11 = this.f31732k0;
            int i12 = i11 + 1;
            this.f31733l0 = i11;
            int i13 = i11 + 2;
            this.f31732k0 = i13;
            this.m0 = i12;
            this.f31734n0 = i13;
            int size = arrayList2.size() + i13;
            this.f31732k0 = size;
            this.f31735o0 = size;
        }
        int i14 = this.f31732k0;
        this.f31732k0 = i14 + 1;
        this.f31736p0 = i14;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f31737q0 = -1;
            this.f31738r0 = -1;
            this.f31739s0 = -1;
            this.f31740t0 = -1;
        } else {
            int i15 = this.f31732k0;
            int i16 = i15 + 1;
            this.f31732k0 = i16;
            this.f31737q0 = i15;
            this.f31738r0 = i16;
            int size2 = arrayList.size() + i16;
            this.f31739s0 = size2;
            this.f31732k0 = size2 + 1;
            this.f31740t0 = size2;
        }
        Context context = getContext();
        m00 m00Var = new m00(context);
        er erVar = er.h;
        m00Var.f30501e = new y5(350L, erVar);
        m00Var.h = 0.0f;
        m00Var.f30505s = 1.0f;
        m00Var.f30507x = 1.0f;
        m00Var.f30508y = true;
        View view = new View(context);
        m00Var.f30502f = view;
        int i17 = org.telegram.ui.ActionBar.g6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.g6.w0(null, i17, false))));
        m00Var.addView(view, h7.z5.c(-1.0f, -1));
        m00Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.g6.w0(null, i17, false)));
        Paint paint = new Paint(1);
        m00Var.f30498a = paint;
        int i18 = org.telegram.ui.ActionBar.g6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
        i6 i6Var = new i6(true, true, false, false);
        m00Var.f30499b = i6Var;
        i6Var.k(0.3f, 250L, erVar);
        i6Var.setCallback(m00Var);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.r(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
        i6Var.q("", true, true);
        i6Var.f29239b = 1;
        i6 i6Var2 = new i6(false, false, true, false);
        m00Var.f30500c = i6Var2;
        i6Var2.k(0.3f, 250L, erVar);
        i6Var2.setCallback(m00Var);
        i6Var2.t(AndroidUtilities.dp(12.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var2.r(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        i6Var2.q("", true, true);
        i6Var2.f29239b = 1;
        m00Var.setWillNotDraw(false);
        this.f31729h0 = m00Var;
        m00Var.setOnClickListener(new f0(this, 16));
        this.containerView.addView(this.f31729h0, h7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.f31730i0 = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        this.containerView.addView(this.f31730i0, h7.z5.d(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.f31729h0 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f31728g0 = frameLayout;
        this.containerView.addView(frameLayout, h7.z5.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
        U(false);
        this.f31853e.setTitle(z());
    }

    public final void U(boolean z10) {
        int i10;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.V;
        ArrayList arrayList = this.f31726e0;
        int size = arrayList.size();
        m00 m00Var = this.f31729h0;
        if (m00Var != null) {
            int i11 = 1;
            if (this.X) {
                m00Var.b(LocaleController.getString(size > 0 ? R.string.FolderLinkButtonRemoveChats : R.string.FolderLinkButtonRemove), z10);
            } else {
                ArrayList arrayList2 = this.f31724c0;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    this.f31729h0.b(LocaleController.getString(R.string.OK), z10);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f31729h0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.Y, this.f31729h0.f30499b.f29238a.getFontMetricsInt(), false), this.Z, this.f31729h0.f30499b.f29238a.getFontMetricsInt())), z10);
                        this.f31729h0.f30499b.f29247l = this.f31722a0 ? 26 : 0;
                    } else {
                        this.f31729h0.b(size > 0 ? LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]) : LocaleController.getString(R.string.FolderLinkButtonNone), z10);
                    }
                }
            }
            m00 m00Var2 = this.f31729h0;
            i6 i6Var = m00Var2.f30500c;
            if (z10) {
                i6Var.b();
            }
            if (z10 && size != (i10 = m00Var2.f30506w) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = m00Var2.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m00Var2.v = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                m00Var2.v = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new l00(m00Var2, 1));
                m00Var2.v.addListener(new sz(m00Var2, i11));
                m00Var2.v.setInterpolator(new OvershootInterpolator(2.0f));
                m00Var2.v.setDuration(200L);
                m00Var2.v.start();
            }
            m00Var2.f30506w = size;
            m00Var2.d = size != 0 ? 1.0f : 0.0f;
            i6Var.q("" + size, z10, true);
            m00Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f31729h0.setEnabled(!arrayList.isEmpty());
            }
        }
        p00 p00Var = this.f31731j0;
        if (p00Var != null) {
            p00Var.a();
        }
    }

    public final void V() {
        ArrayList arrayList = this.f31725d0;
        ArrayList arrayList2 = this.f31724c0;
        n00 n00Var = this.f31741u0;
        if (n00Var == null) {
            return;
        }
        if (this.X) {
            n00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            n00Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.f31741u0.a("", null);
        } else {
            boolean z10 = this.f31726e0.size() >= arrayList2.size() - arrayList.size();
            this.f31741u0.a(LocaleController.getString(z10 ? R.string.DeselectAll : R.string.SelectAll), new fh.f(28, this, z10));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f31742v0 >= 0) {
            this.f31855n.getConnectionsManager().cancelRequest(this.f31742v0, true);
        }
        Utilities.Callback callback = this.f31744x0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.f31743w0));
            this.f31744x0 = null;
        }
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        return new k00(this);
    }

    @Override
    public final CharSequence z() {
        if (this.X) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.V instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f31724c0;
        return (arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.FolderLinkTitleAlready) : LocaleController.getString(R.string.FolderLinkTitleAddChats);
    }
}
