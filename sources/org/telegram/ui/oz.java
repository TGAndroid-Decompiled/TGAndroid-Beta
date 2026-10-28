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
public final class oz extends org.telegram.ui.ActionBar.r2 {
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
    public dz P;
    public final xi Q;
    public bb1 f42253a;
    public nz f42254b;
    public final MessagesController.DialogFilter f42255c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f42256f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.u5 f42257n;
    public int f42258r;
    public long f42259s;
    public long v;
    public Utilities.Callback f42260w;
    public Utilities.Callback f42261x;
    public boolean f42262y;

    public oz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f42256f = new ArrayList();
        this.h = new ArrayList();
        this.f42258r = -5;
        this.f42262y = false;
        this.G = 0;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.Q = new xi(this, 28);
        this.f42255c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void V(oz ozVar, TLRPC.TL_error tL_error) {
        ozVar.f0(false);
        ozVar.f42262y = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new tg.j0(12, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new tg.j0(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new tg.j0(13, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        } else {
            ozVar.finishFragment();
        }
    }

    public static void W(oz ozVar, View view, int i10) {
        String string;
        String str;
        oz ozVar2;
        ArrayList arrayList = ozVar.e;
        if (ozVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.k4)) {
            Long l4 = (Long) ozVar.h.get(i10 - ozVar.L);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                ozVar.F = true;
                ozVar.Y();
                ((org.telegram.ui.Cells.k4) view).c(false, true);
                ozVar2 = ozVar;
            } else if (ozVar.f42256f.contains(l4)) {
                if (arrayList.size() + 1 > ozVar.b0()) {
                    ozVar.showDialog(new tg.j0(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
                    return;
                }
                ozVar2 = ozVar;
                arrayList.add(l4);
                ozVar2.F = true;
                ozVar2.Y();
                ((org.telegram.ui.Cells.k4) view).c(true, true);
            } else {
                int i11 = -ozVar.f42258r;
                ozVar.f42258r = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(ozVar.getMessagesController().getUser(l4));
                    TLRPC.User user = ozVar.getMessagesController().getUser(l4);
                    if (user != null && user.bot) {
                        str = LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        str = LocaleController.getString(R.string.FilterInviteUserToast);
                    }
                } else {
                    TLRPC.Chat chat = ozVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
                if (ozVar.f42259s != longValue || System.currentTimeMillis() - ozVar.v > 1500) {
                    ozVar.f42259s = longValue;
                    ozVar.v = System.currentTimeMillis();
                    org.telegram.ui.Components.wc.b0(ozVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            ozVar2.Z();
            ozVar2.g0(true);
            ozVar2.h0();
        }
    }

    public final boolean X(boolean z10) {
        if (!this.e.isEmpty() && this.F) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
                    public final oz f38127b;

                    {
                        this.f38127b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f38127b.d0();
                                return;
                            default:
                                this.f38127b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) {
                    public final oz f38127b;

                    {
                        this.f38127b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f38127b.d0();
                                return;
                            default:
                                this.f38127b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f22369a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void Y() {
        boolean z10;
        org.telegram.ui.ActionBar.u5 u5Var = this.f42257n;
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
        ArrayList arrayList2 = this.f42256f;
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
        for (int i11 = 0; i11 < this.f42253a.getChildCount(); i11++) {
            View childAt = this.f42253a.getChildAt(i11);
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
        this.f42257n = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        Y();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        bb1 bb1Var = new bb1(context, 9, null);
        this.f42253a = bb1Var;
        bb1Var.setLayoutManager(new s4.c0(1, false));
        this.f42253a.setVerticalScrollBarEnabled(false);
        this.f42253a.u1();
        this.f42253a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f42253a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        bb1 bb1Var2 = this.f42253a;
        nz nzVar = new nz(this);
        this.f42254b = nzVar;
        bb1Var2.setAdapter(nzVar);
        this.f42253a.setOnItemClickListener(new h(this, 9));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f42255c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f42256f;
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
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f22032id) && !arrayList.contains(Long.valueOf(dialog.f22032id))) {
                int i12 = (dialog.f22032id > 0L ? 1 : (dialog.f22032id == 0L ? 0 : -1));
                if (i12 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i12 < 0) {
                    z10 = q00.i0(getMessagesController().getChat(Long.valueOf(-dialog.f22032id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.f22032id));
                    arrayList2.add(Long.valueOf(dialog.f22032id));
                }
            }
        }
        for (int i13 = 0; i13 < dialogFilter.dialogs.size(); i13++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i13);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f22032id) && !arrayList.contains(Long.valueOf(dialog2.f22032id)) && !arrayList2.contains(Long.valueOf(dialog2.f22032id))) {
                arrayList.add(Long.valueOf(dialog2.f22032id));
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
        nz nzVar2 = this.f42254b;
        if (nzVar2 != null) {
            nzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.f42262y && this.F) {
            f0(true);
            this.f42262y = true;
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
            tL_inputChatlistDialogFilter.filter_id = this.f42255c.f19548id;
            tL_chatlists_editExportedInvite.slug = c0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new cz(this, 0));
            Utilities.Callback callback = this.f42261x;
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
        org.telegram.ui.ActionBar.u5 u5Var = this.f42257n;
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
            ArrayList arrayList2 = this.f42256f;
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
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.O.f29820a.getText()) + ", " + ((Object) this.O.f29821b.getText()));
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f42253a;
    }

    public final void h0() {
        dz dzVar = this.P;
        if (dzVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            xh.n nVar = dzVar.f38714a;
            nVar.setText(string);
            nVar.f51972s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = dzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f42255c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        dz dzVar2 = this.P;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        xh.n nVar2 = dzVar2.f38714a;
        nVar2.setText(replaceTags);
        if (z10) {
            i10 = 26;
        }
        nVar2.f51972s = i10;
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
