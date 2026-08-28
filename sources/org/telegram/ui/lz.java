package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
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
public final class lz extends org.telegram.ui.ActionBar.o2 {
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.Components.k00 L;
    public cz M;
    public final ri N;
    public ValueAnimator O;
    public float P;
    public va1 f40253a;
    public kz f40254b;
    public final MessagesController.DialogFilter f40255c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f40256e;
    public final ArrayList f40257f;
    public final ArrayList h;
    public org.telegram.ui.Components.fr f40258n;
    public org.telegram.ui.ActionBar.w0 f40259r;
    public int f40260s;
    public long v;
    public long f40261w;
    public Utilities.Callback f40262x;
    public Utilities.Callback f40263y;

    public lz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f40256e = new ArrayList();
        this.f40257f = new ArrayList();
        this.h = new ArrayList();
        this.f40260s = -5;
        this.A = false;
        this.D = 0;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.N = new ri(this, 28);
        this.P = 1.0f;
        this.f40255c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void T(lz lzVar, TLRPC.TL_error tL_error) {
        lzVar.d0(false);
        lzVar.A = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            lzVar.showDialog(new zf.j0(12, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            lzVar.showDialog(new zf.j0(4, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            lzVar.showDialog(new zf.j0(13, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
        } else {
            lzVar.finishFragment();
        }
    }

    public static void U(lz lzVar, View view, int i9) {
        String string;
        String str;
        lz lzVar2;
        ArrayList arrayList = lzVar.f40256e;
        if (lzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Long l10 = (Long) lzVar.h.get(i9 - lzVar.I);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                lzVar.C = true;
                lzVar.W();
                ((org.telegram.ui.Cells.g4) view).c(false, true);
                lzVar2 = lzVar;
            } else if (lzVar.f40257f.contains(l10)) {
                if (arrayList.size() + 1 > lzVar.Z()) {
                    lzVar.showDialog(new zf.j0(4, lzVar.currentAccount, lzVar.getParentActivity(), lzVar, null));
                    return;
                }
                lzVar2 = lzVar;
                arrayList.add(l10);
                lzVar2.C = true;
                lzVar2.W();
                ((org.telegram.ui.Cells.g4) view).c(true, true);
            } else {
                int i10 = -lzVar.f40260s;
                lzVar.f40260s = i10;
                AndroidUtilities.shakeViewSpring(view, i10);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(lzVar.getMessagesController().getUser(l10));
                    TLRPC.User user = lzVar.getMessagesController().getUser(l10);
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
                if (lzVar.v != longValue || System.currentTimeMillis() - lzVar.f40261w > 1500) {
                    lzVar.v = longValue;
                    lzVar.f40261w = System.currentTimeMillis();
                    org.telegram.ui.Components.oc.a0(lzVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            lzVar2.X();
            lzVar2.e0(true);
            lzVar2.f0();
        }
    }

    public final boolean V(boolean z10) {
        if (!this.f40256e.isEmpty() && this.C) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
                    public final lz f37014b;

                    {
                        this.f37014b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
                        switch (r2) {
                            case 0:
                                this.f37014b.b0();
                                return;
                            default:
                                this.f37014b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) {
                    public final lz f37014b;

                    {
                        this.f37014b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
                        switch (r2) {
                            case 0:
                                this.f37014b.b0();
                                return;
                            default:
                                this.f37014b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f22702a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void W() {
        float f10;
        boolean z10 = this.C;
        boolean isEmpty = this.f40256e.isEmpty();
        if (z10) {
            if (!isEmpty) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(this.P - f10) > 0.1f) {
            this.f40259r.clearAnimation();
            ViewPropertyAnimator animate = this.f40259r.animate();
            this.P = f10;
            animate.alpha(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
        }
    }

    public final void X() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.C) {
            ArrayList arrayList = this.f40256e;
            boolean z11 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                for (int i9 = 0; i9 < tL_exportedChatlistInvite.peers.size(); i9++) {
                    if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i9))))) {
                        break;
                    }
                }
            }
            z11 = z10;
            if (!z11) {
                this.C = false;
                W();
            }
        }
    }

    public final void Y(org.telegram.ui.Components.k00 k00Var, boolean z10) {
        int i9;
        ArrayList arrayList = this.f40256e;
        arrayList.clear();
        ArrayList arrayList2 = this.f40257f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(Z(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(Z(), arrayList2.size())) {
            i9 = R.string.DeselectAll;
        } else {
            i9 = R.string.SelectAll;
        }
        k00Var.a(LocaleController.getString(i9), new gh.u5(this, k00Var, z10, 24));
        this.C = true;
        X();
        W();
        e0(true);
        f0();
        for (int i10 = 0; i10 < this.f40253a.getChildCount(); i10++) {
            View childAt = this.f40253a.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.g4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int Z() {
        if (getUserConfig().isPremium()) {
            return getMessagesController().dialogFiltersChatsLimitPremium;
        }
        return getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public final String a0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && (str = tL_exportedChatlistInvite.url) != null) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return null;
    }

    public final void b0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.A && this.C) {
            d0(true);
            this.A = true;
            tL_exportedChatlistInvite.peers.clear();
            int i9 = 0;
            while (true) {
                arrayList = this.f40256e;
                if (i9 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i9)).longValue()));
                i9++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f40255c.f19649id;
            tL_chatlists_editExportedInvite.slug = a0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i10)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new az(this, 1));
            Utilities.Callback callback = this.f40263y;
            if (callback != null) {
                callback.run(tL_exportedChatlistInvite);
            }
        }
    }

    public final void c0(boolean z10) {
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
            this.actionBar.I(str3, false, 220L, null);
        } else {
            this.actionBar.setTitle(str3);
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return V(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        c0(false);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 17));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = org.telegram.ui.ActionBar.f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
        this.f40258n = frVar;
        this.f40259r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), frVar);
        W();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        va1 va1Var = new va1(context, 9, null);
        this.f40253a = va1Var;
        va1Var.setLayoutManager(new f2.m0(1, false));
        this.f40253a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f40253a, g7.e6.c(-1.0f, -1));
        va1 va1Var2 = this.f40253a;
        kz kzVar = new kz(this);
        this.f40254b = kzVar;
        va1Var2.setAdapter(kzVar);
        this.f40253a.setOnItemClickListener(new i(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f40255c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f40257f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10));
                arrayList.add(Long.valueOf(peerDialogId));
                this.f40256e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i11 = 0; i11 < dialogFilter.dialogs.size(); i11++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i11);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f22384id) && !arrayList.contains(Long.valueOf(dialog.f22384id))) {
                int i12 = (dialog.f22384id > 0L ? 1 : (dialog.f22384id == 0L ? 0 : -1));
                if (i12 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i12 < 0) {
                    z10 = n00.f0(getMessagesController().getChat(Long.valueOf(-dialog.f22384id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.f22384id));
                    arrayList2.add(Long.valueOf(dialog.f22384id));
                }
            }
        }
        for (int i13 = 0; i13 < dialogFilter.dialogs.size(); i13++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i13);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f22384id) && !arrayList.contains(Long.valueOf(dialog2.f22384id)) && !arrayList2.contains(Long.valueOf(dialog2.f22384id))) {
                arrayList.add(Long.valueOf(dialog2.f22384id));
            }
        }
        this.D = 1;
        if (tL_exportedChatlistInvite != null) {
            this.F = 1;
            this.E = 2;
            this.D = 4;
            this.G = 3;
        } else {
            this.F = -1;
            this.E = -1;
            this.G = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
        } else {
            int i14 = this.D;
            int i15 = i14 + 1;
            this.H = i14;
            int i16 = i14 + 2;
            this.D = i16;
            this.I = i15;
            int size = (arrayList.size() - 1) + i16;
            this.J = size;
            this.D = size + 1;
            this.K = size;
        }
        kz kzVar2 = this.f40254b;
        if (kzVar2 != null) {
            kzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        float f10;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.N);
        }
        if (this.f40258n != null) {
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f40258n.f28558c;
            float f12 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.O = ofFloat;
            ofFloat.addUpdateListener(new f3(this, 12));
            ValueAnimator valueAnimator2 = this.O;
            float f13 = this.f40258n.f28558c;
            if (z10) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.O.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.O.start();
        }
    }

    public final void e0(boolean z10) {
        String formatPluralString;
        int i9;
        org.telegram.ui.Components.k00 k00Var = this.L;
        if (k00Var != null) {
            ArrayList arrayList = this.f40256e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            k00Var.b(formatPluralString, z10);
            ArrayList arrayList2 = this.f40257f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(Z(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.k00 k00Var2 = this.L;
                if (!z11) {
                    i9 = R.string.SelectAll;
                } else {
                    i9 = R.string.DeselectAll;
                }
                k00Var2.a(LocaleController.getString(i9), new org.telegram.ui.Components.a50(10, this, z11));
            } else {
                this.L.a("", null);
            }
            if (z10) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.L.f29899a.getText()) + ", " + ((Object) this.L.f29900b.getText()));
            }
        }
    }

    public final void f0() {
        cz czVar = this.M;
        if (czVar == null) {
            return;
        }
        int i9 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            dh.u uVar = czVar.f37361a;
            uVar.setText(string);
            uVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = czVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f40255c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        cz czVar2 = this.M;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.f40256e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        dh.u uVar2 = czVar2.f37361a;
        uVar2.setText(replaceTags);
        if (z10) {
            i9 = 26;
        }
        uVar2.h = i9;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return V(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.B != 0) {
            getConnectionsManager().cancelRequest(this.B, true);
            this.B = 0;
        }
    }
}
