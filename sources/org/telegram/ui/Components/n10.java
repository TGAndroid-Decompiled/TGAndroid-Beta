package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n10 extends bb {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f30698a0;
    public final boolean f30699b0;
    public String f30700c0;
    public ArrayList f30701d0;
    public boolean f30702e0;
    public CharSequence f30703f0;
    public ArrayList f30704g0;
    public ArrayList f30705h0;
    public ArrayList f30706i0;
    public ArrayList f30707j0;
    public FrameLayout f30708k0;
    public j10 f30709l0;
    public View m0;
    public m10 f30710n0;
    public int f30711o0;
    public int f30712p0;
    public int f30713q0;
    public int f30714r0;
    public int f30715s0;
    public int f30716t0;
    public int f30717u0;
    public int f30718v0;
    public int f30719w0;
    public int f30720x0;
    public k10 f30721y0;
    public int f30722z0;

    public n10(org.telegram.ui.ActionBar.r2 r2Var, int i10, ArrayList arrayList) {
        super(r2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f30700c0 = "";
        this.f30701d0 = new ArrayList();
        this.f30703f0 = "";
        this.f30705h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f30706i0 = arrayList2;
        this.f30722z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f30699b0 = true;
        this.f30704g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = r2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f19548id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f30700c0 = dialogFilter.name;
            this.f30701d0 = dialogFilter.entities;
            this.f30702e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f30706i0.size(); i12++) {
                TLRPC.Peer peer = r2Var.getMessagesController().getPeer(((Long) this.f30706i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f30704g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f30706i0.contains(l4)) {
                    TLRPC.Peer peer2 = r2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = r2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f30704g0.add(peer2);
                    }
                }
            }
        }
        T();
    }

    public static void U(org.telegram.ui.ActionBar.r2 r2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = r2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).f19548id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(i10, r2Var, callback, 9);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getContext());
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fn(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tv(g4Var, 4));
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            r2Var.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                return;
            }
            return;
        }
        g4Var.run();
    }

    @Override
    public final void G(ww0 ww0Var) {
        float f7;
        nm0 nm0Var = this.d;
        nm0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f30709l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        nm0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        nm0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void R(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f30706i0.size(), new Object[0]));
        if (z10 && this.f30721y0 != null) {
            str = ", " + ((Object) this.f30721y0.f29821b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void S(k10 k10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f30704g0;
        ArrayList arrayList2 = this.f30706i0;
        arrayList2.clear();
        arrayList2.addAll(this.f30705h0);
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
        k10Var.a(LocaleController.getString(i10), new bi.u7(this, k10Var, z10, 20));
        R(true);
        while (true) {
            nm0 nm0Var = this.d;
            if (i11 < nm0Var.getChildCount()) {
                View childAt = nm0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.k4) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((org.telegram.ui.Cells.k4) childAt).c(arrayList2.contains((Long) tag), true);
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
        ArrayList arrayList = this.f30707j0;
        this.f30703f0 = AndroidUtilities.replaceCharSequence("*", this.f30700c0, "✱");
        ArrayList arrayList2 = this.f30704g0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.r2 r2Var = this.f26793n;
                        if (z11) {
                            j10 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(r2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(r2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else {
                            z10 = false;
                            j10 = 0;
                        }
                        z10 = !isNotInChat;
                    }
                    if (j10 != 0 && !this.f30699b0) {
                        if (z10) {
                            this.f30705h0.add(Long.valueOf(j10));
                        }
                        this.f30706i0.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.f30711o0 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i11 = this.f30711o0;
            int i12 = i11 + 1;
            this.f30712p0 = i11;
            int i13 = i11 + 2;
            this.f30711o0 = i13;
            this.f30713q0 = i12;
            this.f30714r0 = i13;
            int size = arrayList2.size() + i13;
            this.f30711o0 = size;
            this.f30715s0 = size;
        } else {
            this.f30712p0 = -1;
            this.f30713q0 = -1;
            this.f30714r0 = -1;
            this.f30715s0 = -1;
        }
        int i14 = this.f30711o0;
        this.f30711o0 = i14 + 1;
        this.f30716t0 = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i15 = this.f30711o0;
            int i16 = i15 + 1;
            this.f30711o0 = i16;
            this.f30717u0 = i15;
            this.f30718v0 = i16;
            int size2 = arrayList.size() + i16;
            this.f30719w0 = size2;
            this.f30711o0 = size2 + 1;
            this.f30720x0 = size2;
        } else {
            this.f30717u0 = -1;
            this.f30718v0 = -1;
            this.f30719w0 = -1;
            this.f30720x0 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        ds dsVar = ds.h;
        frameLayout.e = new h6(350L, dsVar);
        float f7 = 0.0f;
        frameLayout.f29464n = 0.0f;
        frameLayout.v = 1.0f;
        frameLayout.f29469y = 1.0f;
        frameLayout.E = true;
        frameLayout.I = org.telegram.ui.ActionBar.y6.I.q();
        View view = new View(context);
        frameLayout.f29463f = view;
        int i17 = org.telegram.ui.ActionBar.y6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.o6.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.o6.b(org.telegram.ui.ActionBar.y6.x0(null, i17, false))));
        frameLayout.addView(view, kb1.g(-1.0f, -1));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.y6.x0(null, i17, false));
        frameLayout.h = c02;
        frameLayout.setBackground(c02);
        Paint paint = new Paint(1);
        frameLayout.f29460a = paint;
        int i18 = org.telegram.ui.ActionBar.y6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i18, false));
        r6 r6Var = new r6(true, true, false);
        frameLayout.f29461b = r6Var;
        r6Var.n(0.3f, 250L, dsVar);
        r6Var.setCallback(frameLayout);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, i18, false));
        r6Var.t("", true, true);
        r6Var.f32142b = 1;
        r6 r6Var2 = new r6(false, false, true);
        frameLayout.f29462c = r6Var2;
        r6Var2.n(0.3f, 250L, dsVar);
        r6Var2.setCallback(frameLayout);
        r6Var2.w(AndroidUtilities.dp(12.0f));
        r6Var2.x(AndroidUtilities.bold());
        r6Var2.u(org.telegram.ui.ActionBar.y6.x0(null, i17, false));
        r6Var2.t("", true, true);
        r6Var2.f32142b = 1;
        frameLayout.setWillNotDraw(false);
        this.f30709l0 = frameLayout;
        frameLayout.setOnClickListener(new f0(this, 15));
        this.containerView.addView(this.f30709l0, kb1.h(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.m0 = view2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, view2, null);
        this.containerView.addView(this.m0, kb1.h(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f30709l0 != null) {
            f7 = 68.0f;
        }
        this.d.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f30708k0 = frameLayout2;
        this.containerView.addView(frameLayout2, kb1.h(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false));
        V(false);
        this.e.setTitle(y());
    }

    public final void V(boolean z10) {
        ArrayList arrayList;
        String string;
        int i10;
        float f7;
        int i11;
        int i12;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        int size = this.f30706i0.size();
        j10 j10Var = this.f30709l0;
        if (j10Var != null) {
            if (this.f30699b0) {
                if (size > 0) {
                    i12 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i12 = R.string.FolderLinkButtonRemove;
                }
                j10Var.b(LocaleController.getString(i12), z10);
            } else {
                ArrayList arrayList2 = this.f30704g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f30709l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f30700c0, this.f30709l0.f29461b.f32140a.getFontMetricsInt(), false), this.f30701d0, this.f30709l0.f29461b.f32140a.getFontMetricsInt())), z10);
                        j10 j10Var2 = this.f30709l0;
                        if (this.f30702e0) {
                            i10 = 26;
                        } else {
                            i10 = 0;
                        }
                        j10Var2.f29461b.f32154p = i10;
                    } else {
                        j10 j10Var3 = this.f30709l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        j10Var3.b(string, z10);
                    }
                } else {
                    this.f30709l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            j10 j10Var4 = this.f30709l0;
            r6 r6Var = j10Var4.f29462c;
            if (z10) {
                r6Var.a();
            }
            if (z10 && size != (i11 = j10Var4.f29468x) && size > 0 && i11 > 0) {
                ValueAnimator valueAnimator = j10Var4.f29467w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j10Var4.f29467w = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j10Var4.f29467w = ofFloat;
                ofFloat.addUpdateListener(new h10(j10Var4, 1));
                j10Var4.f29467w.addListener(new i10(j10Var4, 0));
                org.telegram.ui.d3.m(2.0f, j10Var4.f29467w);
                j10Var4.f29467w.setDuration(200L);
                j10Var4.f29467w.start();
            }
            j10Var4.f29468x = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            j10Var4.d = f7;
            r6Var.t("" + size, z10, true);
            j10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f30709l0.setEnabled(!arrayList.isEmpty());
            }
        }
        m10 m10Var = this.f30710n0;
        if (m10Var != null) {
            m10Var.a();
        }
    }

    public final void W() {
        int i10;
        ArrayList arrayList = this.f30705h0;
        ArrayList arrayList2 = this.f30704g0;
        k10 k10Var = this.f30721y0;
        if (k10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f30699b0) {
            k10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            k10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f30706i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            k10 k10Var2 = this.f30721y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            k10Var2.a(LocaleController.getString(i10), new bh.n(28, this, z10));
            return;
        }
        this.f30721y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f30722z0 >= 0) {
            this.f26793n.getConnectionsManager().cancelRequest(this.f30722z0, true);
        }
        Utilities.Callback callback = this.B0;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.A0));
            this.B0 = null;
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
            if (this.navBarColor != x02) {
                fixNavigationBar(x02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        return new g10(this);
    }

    @Override
    public final CharSequence y() {
        if (this.f30699b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f30704g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
