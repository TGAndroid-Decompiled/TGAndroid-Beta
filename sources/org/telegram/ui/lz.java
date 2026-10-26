package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
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
public final class lz extends org.telegram.ui.ActionBar.r2 {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public org.telegram.ui.Components.k10 O;
    public bz P;
    public final ui Q;
    public za1 f41403a;
    public kz f41404b;
    public final MessagesController.DialogFilter f41405c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f41406f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.u5 f41407n;
    public int f41408r;
    public long f41409s;
    public long v;
    public Utilities.Callback f41410w;
    public Utilities.Callback f41411x;
    public boolean f41412y;

    public lz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f41406f = new ArrayList();
        this.h = new ArrayList();
        this.f41408r = -5;
        this.f41412y = false;
        this.G = 0;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.Q = new ui(this, 28);
        this.f41405c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void V(lz lzVar, TLRPC.TL_error tL_error) {
        lzVar.f0(false);
        lzVar.f41412y = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            lzVar.showDialog(new tg.j0(12, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            lzVar.showDialog(new tg.j0(4, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            lzVar.showDialog(new tg.j0(13, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
        } else {
            lzVar.finishFragment();
        }
    }

    public static void W(lz lzVar, View view, int i10) {
        String string;
        String str;
        lz lzVar2;
        ArrayList arrayList = lzVar.e;
        if (lzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.k4)) {
            Long l4 = (Long) lzVar.h.get(i10 - lzVar.L);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                lzVar.F = true;
                lzVar.Y();
                ((org.telegram.ui.Cells.k4) view).c(false, true);
                lzVar2 = lzVar;
            } else if (lzVar.f41406f.contains(l4)) {
                if (arrayList.size() + 1 > lzVar.b0()) {
                    lzVar.showDialog(new tg.j0(4, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
                    return;
                }
                lzVar2 = lzVar;
                arrayList.add(l4);
                lzVar2.F = true;
                lzVar2.Y();
                ((org.telegram.ui.Cells.k4) view).c(true, true);
            } else {
                int i11 = -lzVar.f41408r;
                lzVar.f41408r = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(lzVar.getMessagesController().getUser(l4));
                    TLRPC.User user = lzVar.getMessagesController().getUser(l4);
                    if (user != null && user.bot) {
                        str = LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        str = LocaleController.getString(R.string.FilterInviteUserToast);
                    }
                } else {
                    TLRPC.Chat chat = lzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        if (ChatObject.isPublic(chat)) {
                            string = LocaleController.getString(R.string.FilterInviteChannelToast);
                        } else {
                            string = LocaleController.getString(R.string.FilterInvitePrivateChannelToast);
                        }
                    } else if (ChatObject.isPublic(chat)) {
                        string = LocaleController.getString(R.string.FilterInviteGroupToast);
                    } else {
                        string = LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                    }
                    arrayList2.add(chat);
                    str = string;
                }
                if (lzVar.f41409s != longValue || System.currentTimeMillis() - lzVar.v > 1500) {
                    lzVar.f41409s = longValue;
                    lzVar.v = System.currentTimeMillis();
                    org.telegram.ui.Components.wc.b0(lzVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            lzVar2.Z();
            lzVar2.g0(true);
            lzVar2.h0();
        }
    }

    public final boolean X(boolean z10) {
        if (!this.e.isEmpty() && this.F) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
                    public final lz f46387b;

                    {
                        this.f46387b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f46387b.d0();
                                return;
                            default:
                                this.f46387b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) {
                    public final lz f46387b;

                    {
                        this.f46387b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f46387b.d0();
                                return;
                            default:
                                this.f46387b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f22368a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void Y() {
        boolean z10;
        org.telegram.ui.ActionBar.u5 u5Var = this.f41407n;
        if (this.F && !this.e.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u5Var.a(z10, true);
    }

    public final void Z() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.F) {
            ArrayList arrayList = this.e;
            boolean z11 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                    if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10))))) {
                        break;
                    }
                }
            }
            z11 = z10;
            if (!z11) {
                this.F = false;
                Y();
            }
        }
    }

    public final void a0(org.telegram.ui.Components.k10 k10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f41406f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(b0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(b0(), arrayList2.size())) {
            i10 = R.string.DeselectAll;
        } else {
            i10 = R.string.SelectAll;
        }
        k10Var.a(LocaleController.getString(i10), new bi.u7(this, k10Var, z10, 29));
        this.F = true;
        Z();
        Y();
        g0(true);
        h0();
        for (int i11 = 0; i11 < this.f41403a.getChildCount(); i11++) {
            View childAt = this.f41403a.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.k4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.k4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int b0() {
        if (getUserConfig().isPremium()) {
            return getMessagesController().dialogFiltersChatsLimitPremium;
        }
        return getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public final String c0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && (str = tL_exportedChatlistInvite.url) != null) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return null;
    }

    @Override
    public final boolean canBeginSlide() {
        return X(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        e0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 27));
        this.f41407n = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        Y();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        za1 za1Var = new za1(context, 9, null);
        this.f41403a = za1Var;
        za1Var.setLayoutManager(new s4.c0(1, false));
        this.f41403a.setVerticalScrollBarEnabled(false);
        this.f41403a.u1();
        this.f41403a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f41403a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        za1 za1Var2 = this.f41403a;
        kz kzVar = new kz(this);
        this.f41404b = kzVar;
        za1Var2.setAdapter(kzVar);
        this.f41403a.setOnItemClickListener(new h(this, 9));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f41405c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f41406f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10));
                arrayList.add(Long.valueOf(peerDialogId));
                this.e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i11 = 0; i11 < dialogFilter.dialogs.size(); i11++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i11);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f22031id) && !arrayList.contains(Long.valueOf(dialog.f22031id))) {
                int i12 = (dialog.f22031id > 0L ? 1 : (dialog.f22031id == 0L ? 0 : -1));
                if (i12 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i12 < 0) {
                    z10 = o00.i0(getMessagesController().getChat(Long.valueOf(-dialog.f22031id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.f22031id));
                    arrayList2.add(Long.valueOf(dialog.f22031id));
                }
            }
        }
        for (int i13 = 0; i13 < dialogFilter.dialogs.size(); i13++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i13);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f22031id) && !arrayList.contains(Long.valueOf(dialog2.f22031id)) && !arrayList2.contains(Long.valueOf(dialog2.f22031id))) {
                arrayList.add(Long.valueOf(dialog2.f22031id));
            }
        }
        this.G = 1;
        if (tL_exportedChatlistInvite != null) {
            this.I = 1;
            this.H = 2;
            this.G = 4;
            this.J = 3;
        } else {
            this.I = -1;
            this.H = -1;
            this.J = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
        } else {
            int i14 = this.G;
            int i15 = i14 + 1;
            this.K = i14;
            int i16 = i14 + 2;
            this.G = i16;
            this.L = i15;
            int size = (arrayList.size() - 1) + i16;
            this.M = size;
            this.G = size + 1;
            this.N = size;
        }
        kz kzVar2 = this.f41404b;
        if (kzVar2 != null) {
            kzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.f41412y && this.F) {
            f0(true);
            this.f41412y = true;
            tL_exportedChatlistInvite.peers.clear();
            int i10 = 0;
            while (true) {
                arrayList = this.e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i10)).longValue()));
                i10++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f41405c.f19549id;
            tL_chatlists_editExportedInvite.slug = c0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new az(this, 0));
            Utilities.Callback callback = this.f41411x;
            if (callback != null) {
                callback.run(tL_exportedChatlistInvite);
            }
        }
    }

    public final void e0(boolean z10) {
        String str;
        String str2;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null) {
            str = null;
        } else {
            str = tL_exportedChatlistInvite.title;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = LocaleController.getString(R.string.FilterShare);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        if (z10) {
            org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
            r5Var.getClass();
            r5Var.w(str3, false, 220L, org.telegram.ui.Components.ds.h);
            return;
        }
        this.simpleActionBar.setTitle(str3);
    }

    public final void f0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.f41407n;
        if (u5Var != null) {
            u5Var.b(z10);
        }
    }

    public final void g0(boolean z10) {
        String formatPluralString;
        int i10;
        org.telegram.ui.Components.k10 k10Var = this.O;
        if (k10Var != null) {
            ArrayList arrayList = this.e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            k10Var.b(formatPluralString, z10);
            ArrayList arrayList2 = this.f41406f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(b0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.k10 k10Var2 = this.O;
                if (!z11) {
                    i10 = R.string.SelectAll;
                } else {
                    i10 = R.string.DeselectAll;
                }
                k10Var2.a(LocaleController.getString(i10), new org.telegram.ui.Components.d60(11, this, z11));
            } else {
                this.O.a("", null);
            }
            if (z10) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.O.f29774a.getText()) + ", " + ((Object) this.O.f29775b.getText()));
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f41403a;
    }

    public final void h0() {
        bz bzVar = this.P;
        if (bzVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            xh.n nVar = bzVar.f38187a;
            nVar.setText(string);
            nVar.f51914s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = bzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f41405c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        bz bzVar2 = this.P;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        xh.n nVar2 = bzVar2.f38187a;
        nVar2.setText(replaceTags);
        if (z10) {
            i10 = 26;
        }
        nVar2.f51914s = i10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return X(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.E != 0) {
            getConnectionsManager().cancelRequest(this.E, true);
            this.E = 0;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
