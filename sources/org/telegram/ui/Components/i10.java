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
public final class i10 extends za {
    public boolean A0;
    public Utilities.Callback B0;
    public int C0;
    public long D0;
    public long E0;
    public String X;
    public int Y;
    public TL_chatlists.chatlist_ChatlistInvite Z;
    public TL_chatlists.TL_chatlists_chatlistUpdates f27222a0;
    public final boolean f27223b0;
    public String f27224c0;
    public ArrayList f27225d0;
    public boolean f27226e0;
    public CharSequence f27227f0;
    public ArrayList f27228g0;
    public ArrayList f27229h0;
    public ArrayList f27230i0;
    public ArrayList f27231j0;
    public FrameLayout f27232k0;
    public e10 f27233l0;
    public View m0;
    public h10 f27234n0;
    public int f27235o0;
    public int f27236p0;
    public int f27237q0;
    public int f27238r0;
    public int f27239s0;
    public int f27240t0;
    public int f27241u0;
    public int f27242v0;
    public int f27243w0;
    public int f27244x0;
    public f10 f27245y0;
    public int f27246z0;

    public i10(org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList) {
        super(o2Var, false);
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        this.Y = -1;
        this.f27224c0 = "";
        this.f27225d0 = new ArrayList();
        this.f27227f0 = "";
        this.f27229h0 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f27230i0 = arrayList2;
        this.f27246z0 = -1;
        this.C0 = -5;
        this.Y = i10;
        this.f27223b0 = true;
        this.f27228g0 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = o2Var.getMessagesController().dialogFilters;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (arrayList3.get(i11).f17862id == i10) {
                    dialogFilter = arrayList3.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        if (dialogFilter != null) {
            this.f27224c0 = dialogFilter.name;
            this.f27225d0 = dialogFilter.entities;
            this.f27226e0 = dialogFilter.title_noanimate;
            for (int i12 = 0; i12 < this.f27230i0.size(); i12++) {
                TLRPC.Peer peer = o2Var.getMessagesController().getPeer(((Long) this.f27230i0.get(i12)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.f27228g0.add(peer);
                }
            }
            for (int i13 = 0; i13 < dialogFilter.alwaysShow.size(); i13++) {
                Long l4 = dialogFilter.alwaysShow.get(i13);
                long longValue = l4.longValue();
                if (!this.f27230i0.contains(l4)) {
                    TLRPC.Peer peer2 = o2Var.getMessagesController().getPeer(longValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = o2Var.getMessagesController().getChat(Long.valueOf(-longValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.f27228g0.add(peer2);
                    }
                }
            }
        }
        T();
    }

    public static void U(org.telegram.ui.ActionBar.o2 o2Var, int i10, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = o2Var.getMessagesController().dialogFilters;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11).f17862id == i10) {
                    dialogFilter = arrayList.get(i11);
                    break;
                }
            }
        }
        dialogFilter = null;
        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(i10, o2Var, callback, 9);
        if (dialogFilter != null && dialogFilter.isMyChatlist()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getContext());
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.FilterDelete);
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.FilterDeleteAlertLinks);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cn(callback));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new rv(h4Var, 4));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            o2Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                return;
            }
            return;
        }
        h4Var.run();
    }

    @Override
    public final void F(nw0 nw0Var) {
        float f7;
        lm0 lm0Var = this.d;
        lm0Var.setOverScrollMode(2);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f27233l0 != null) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        lm0Var.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        lm0Var.setOnItemClickListener(new j(this, 8));
    }

    public final void R(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.f27230i0.size(), new Object[0]));
        if (z10 && this.f27245y0 != null) {
            str = ", " + ((Object) this.f27245y0.f26165b.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
    }

    public final void S(f10 f10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f27228g0;
        ArrayList arrayList2 = this.f27230i0;
        arrayList2.clear();
        arrayList2.addAll(this.f27229h0);
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
        f10Var.a(LocaleController.getString(i10), new ai.y7(this, f10Var, z10, 20));
        R(true);
        while (true) {
            lm0 lm0Var = this.d;
            if (i11 < lm0Var.getChildCount()) {
                View childAt = lm0Var.getChildAt(i11);
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
        ArrayList arrayList = this.f27231j0;
        this.f27227f0 = AndroidUtilities.replaceCharSequence("*", this.f27224c0, "✱");
        ArrayList arrayList2 = this.f27228g0;
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i10);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = peer.user_id;
                        z10 = false;
                    } else {
                        boolean z11 = peer instanceof TLRPC.TL_peerChat;
                        org.telegram.ui.ActionBar.o2 o2Var = this.f33212n;
                        if (z11) {
                            j10 = -peer.chat_id;
                            isNotInChat = ChatObject.isNotInChat(o2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j10 = -peer.channel_id;
                            isNotInChat = ChatObject.isNotInChat(o2Var.getMessagesController().getChat(Long.valueOf(-j10)));
                        } else {
                            z10 = false;
                            j10 = 0;
                        }
                        z10 = !isNotInChat;
                    }
                    if (j10 != 0 && !this.f27223b0) {
                        if (z10) {
                            this.f27229h0.add(Long.valueOf(j10));
                        }
                        this.f27230i0.add(Long.valueOf(j10));
                    }
                }
            }
        }
        this.f27235o0 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i11 = this.f27235o0;
            int i12 = i11 + 1;
            this.f27236p0 = i11;
            int i13 = i11 + 2;
            this.f27235o0 = i13;
            this.f27237q0 = i12;
            this.f27238r0 = i13;
            int size = arrayList2.size() + i13;
            this.f27235o0 = size;
            this.f27239s0 = size;
        } else {
            this.f27236p0 = -1;
            this.f27237q0 = -1;
            this.f27238r0 = -1;
            this.f27239s0 = -1;
        }
        int i14 = this.f27235o0;
        this.f27235o0 = i14 + 1;
        this.f27240t0 = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i15 = this.f27235o0;
            int i16 = i15 + 1;
            this.f27235o0 = i16;
            this.f27241u0 = i15;
            this.f27242v0 = i16;
            int size2 = arrayList.size() + i16;
            this.f27243w0 = size2;
            this.f27235o0 = size2 + 1;
            this.f27244x0 = size2;
        } else {
            this.f27241u0 = -1;
            this.f27242v0 = -1;
            this.f27243w0 = -1;
            this.f27244x0 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        zr zrVar = zr.h;
        frameLayout.e = new d6(350L, zrVar);
        float f7 = 0.0f;
        frameLayout.f25915n = 0.0f;
        frameLayout.v = 1.0f;
        frameLayout.f25920y = 1.0f;
        frameLayout.E = true;
        frameLayout.I = org.telegram.ui.ActionBar.k6.I.q();
        View view = new View(context);
        frameLayout.f25914f = view;
        int i17 = org.telegram.ui.ActionBar.k6.Oh;
        view.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.a6.b(org.telegram.ui.ActionBar.k6.x0(null, i17, false))));
        frameLayout.addView(view, w7.z5.c(-1.0f, -1));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        frameLayout.h = c02;
        frameLayout.setBackground(c02);
        Paint paint = new Paint(1);
        frameLayout.f25911a = paint;
        int i18 = org.telegram.ui.ActionBar.k6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i18, false));
        n6 n6Var = new n6(true, true, false);
        frameLayout.f25912b = n6Var;
        n6Var.n(0.3f, 250L, zrVar);
        n6Var.setCallback(frameLayout);
        n6Var.w(AndroidUtilities.dp(14.0f));
        n6Var.x(AndroidUtilities.bold());
        n6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i18, false));
        n6Var.t("", true, true);
        n6Var.f28797b = 1;
        n6 n6Var2 = new n6(false, false, true);
        frameLayout.f25913c = n6Var2;
        n6Var2.n(0.3f, 250L, zrVar);
        n6Var2.setCallback(frameLayout);
        n6Var2.w(AndroidUtilities.dp(12.0f));
        n6Var2.x(AndroidUtilities.bold());
        n6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
        n6Var2.t("", true, true);
        n6Var2.f28797b = 1;
        frameLayout.setWillNotDraw(false);
        this.f27233l0 = frameLayout;
        frameLayout.setOnClickListener(new f0(this, 15));
        this.containerView.addView(this.f27233l0, w7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.m0 = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, view2, null);
        this.containerView.addView(this.m0, w7.z5.d(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (this.f27233l0 != null) {
            f7 = 68.0f;
        }
        this.d.setPadding(dp, 0, dp2, AndroidUtilities.dp(f7));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f27232k0 = frameLayout2;
        this.containerView.addView(frameLayout2, w7.z5.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false));
        V(false);
        this.e.setTitle(z());
    }

    public final void V(boolean z10) {
        String string;
        float f7;
        int i10;
        int i11;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.Z;
        ArrayList arrayList = this.f27230i0;
        int size = arrayList.size();
        e10 e10Var = this.f27233l0;
        if (e10Var != null) {
            if (this.f27223b0) {
                if (size > 0) {
                    i11 = R.string.FolderLinkButtonRemoveChats;
                } else {
                    i11 = R.string.FolderLinkButtonRemove;
                }
                e10Var.b(LocaleController.getString(i11), z10);
            } else {
                ArrayList arrayList2 = this.f27228g0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i12 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.f27233l0.b(LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.f27224c0, this.f27233l0.f25912b.f28795a.getFontMetricsInt(), false), this.f27225d0, this.f27233l0.f25912b.f28795a.getFontMetricsInt())), z10);
                        e10 e10Var2 = this.f27233l0;
                        if (this.f27226e0) {
                            i12 = 26;
                        }
                        e10Var2.f25912b.f28809p = i12;
                    } else {
                        e10 e10Var3 = this.f27233l0;
                        if (size > 0) {
                            string = LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.FolderLinkButtonNone);
                        }
                        e10Var3.b(string, z10);
                    }
                } else {
                    this.f27233l0.b(LocaleController.getString(R.string.OK), z10);
                }
            }
            e10 e10Var4 = this.f27233l0;
            n6 n6Var = e10Var4.f25913c;
            if (z10) {
                n6Var.a();
            }
            if (z10 && size != (i10 = e10Var4.f25919x) && size > 0 && i10 > 0) {
                ValueAnimator valueAnimator = e10Var4.f25918w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    e10Var4.f25918w = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                e10Var4.f25918w = ofFloat;
                ofFloat.addUpdateListener(new d10(e10Var4, 1));
                e10Var4.f25918w.addListener(new org.telegram.ui.pq(e10Var4, 29));
                org.telegram.messenger.tl.l(2.0f, e10Var4.f25918w);
                e10Var4.f25918w.setDuration(200L);
                e10Var4.f25918w.start();
            }
            e10Var4.f25919x = size;
            if (size != 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            e10Var4.d = f7;
            n6Var.t("" + size, z10, true);
            e10Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.f27233l0.setEnabled(!arrayList.isEmpty());
            }
        }
        h10 h10Var = this.f27234n0;
        if (h10Var != null) {
            h10Var.a();
        }
    }

    public final void W() {
        int i10;
        ArrayList arrayList = this.f27229h0;
        ArrayList arrayList2 = this.f27228g0;
        f10 f10Var = this.f27245y0;
        if (f10Var == null) {
            return;
        }
        boolean z10 = false;
        if (this.f27223b0) {
            f10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList2.size(), new Object[0]), false);
        } else {
            f10Var.b(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList2.size(), new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.f27230i0.size() >= arrayList2.size() - arrayList.size()) {
                z10 = true;
            }
            f10 f10Var2 = this.f27245y0;
            if (z10) {
                i10 = R.string.DeselectAll;
            } else {
                i10 = R.string.SelectAll;
            }
            f10Var2.a(LocaleController.getString(i10), new ah.t(28, this, z10));
            return;
        }
        this.f27245y0.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f27246z0 >= 0) {
            this.f33212n.getConnectionsManager().cancelRequest(this.f27246z0, true);
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
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
            if (this.navBarColor != x02) {
                fixNavigationBar(x02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        return new c10(this);
    }

    @Override
    public final CharSequence z() {
        if (this.f27223b0) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.f27228g0;
        if (arrayList != null && !arrayList.isEmpty()) {
            return LocaleController.getString(R.string.FolderLinkTitleAddChats);
        }
        return LocaleController.getString(R.string.FolderLinkTitleAlready);
    }
}
