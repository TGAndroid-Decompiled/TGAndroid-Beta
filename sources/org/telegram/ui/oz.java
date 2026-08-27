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

public final class oz extends org.telegram.ui.ActionBar.n2 {
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
    public org.telegram.ui.Components.n00 L;
    public fz M;
    public final ti N;
    public ValueAnimator O;
    public float P;

    public ta1 f41216a;

    public nz f41217b;

    public final MessagesController.DialogFilter f41218c;
    public final TL_chatlists.TL_exportedChatlistInvite d;

    public final ArrayList f41219e;

    public final ArrayList f41220f;
    public final ArrayList h;

    public org.telegram.ui.Components.dr f41221n;

    public org.telegram.ui.ActionBar.v0 f41222r;

    public int f41223s;
    public long v;

    public long f41224w;

    public Utilities.Callback f41225x;

    public Utilities.Callback f41226y;

    public oz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f41219e = new ArrayList();
        this.f41220f = new ArrayList();
        this.h = new ArrayList();
        this.f41223s = -5;
        this.A = false;
        this.D = 0;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.N = new ti(this, 28);
        this.P = 1.0f;
        this.f41218c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(oz ozVar, TLRPC.TL_error tL_error) {
        ozVar.e0(false);
        ozVar.A = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new ag.i1(12, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new ag.i1(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.finishFragment();
        } else {
            ozVar.showDialog(new ag.i1(13, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        }
    }

    public static void V(oz ozVar, View view, int i10) {
        String string;
        String string2;
        oz ozVar2;
        ArrayList arrayList = ozVar.f41219e;
        if (ozVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.d4)) {
            Long l10 = (Long) ozVar.h.get(i10 - ozVar.I);
            long jLongValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                ozVar.C = true;
                ozVar.X();
                ((org.telegram.ui.Cells.d4) view).c(false, true);
                ozVar2 = ozVar;
            } else {
                if (!ozVar.f41220f.contains(l10)) {
                    int i11 = -ozVar.f41223s;
                    ozVar.f41223s = i11;
                    AndroidUtilities.shakeViewSpring(view, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ArrayList arrayList2 = new ArrayList();
                    if (jLongValue >= 0) {
                        arrayList2.add(ozVar.getMessagesController().getUser(l10));
                        TLRPC.User user = ozVar.getMessagesController().getUser(l10);
                        string2 = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUserToast) : LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        TLRPC.Chat chat = ozVar.getMessagesController().getChat(Long.valueOf(-jLongValue));
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            string = ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteChannelToast) : LocaleController.getString(R.string.FilterInvitePrivateChannelToast);
                        } else {
                            string = ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteGroupToast) : LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                        }
                        arrayList2.add(chat);
                        string2 = string;
                    }
                    if (ozVar.v != jLongValue || System.currentTimeMillis() - ozVar.f41224w > 1500) {
                        ozVar.v = jLongValue;
                        ozVar.f41224w = System.currentTimeMillis();
                        org.telegram.ui.Components.mc.a0(ozVar).g(string2, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > ozVar.a0()) {
                    ozVar.showDialog(new ag.i1(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
                    return;
                }
                ozVar2 = ozVar;
                arrayList.add(l10);
                ozVar2.C = true;
                ozVar2.X();
                ((org.telegram.ui.Cells.d4) view).c(true, true);
            }
            ozVar2.Y();
            ozVar2.f0(true);
            ozVar2.g0();
        }
    }

    public final boolean W(boolean z10) {
        if (this.f41219e.isEmpty() || !this.C) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.UnsavedChangesMessage);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {

            public final oz f37882b;

            {
                this.f37882b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.f37882b.c0();
                        break;
                    default:
                        this.f37882b.finishFragment();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {

            public final oz f37882b;

            {
                this.f37882b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        this.f37882b.c0();
                        break;
                    default:
                        this.f37882b.finishFragment();
                        break;
                }
            }
        });
        showDialog(alertDialog$Builder.f22702a);
        return false;
    }

    public final void X() {
        float f10;
        boolean z10 = this.C;
        boolean zIsEmpty = this.f41219e.isEmpty();
        if (z10) {
            f10 = !zIsEmpty ? 1.0f : 0.5f;
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(this.P - f10) > 0.1f) {
            this.f41222r.clearAnimation();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f41222r.animate();
            this.P = f10;
            viewPropertyAnimatorAnimate.alpha(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.er.h).start();
        }
    }

    public final void Y() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.C) {
            return;
        }
        ArrayList arrayList = this.f41219e;
        boolean z10 = true;
        boolean z11 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z11) {
            int i10 = 0;
            while (true) {
                if (i10 >= tL_exportedChatlistInvite.peers.size()) {
                    z10 = z11;
                    break;
                } else if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10))))) {
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            z10 = z11;
            break;
        }
        if (z10) {
            return;
        }
        this.C = false;
        X();
    }

    public final void Z(org.telegram.ui.Components.n00 n00Var, boolean z10) {
        ArrayList arrayList = this.f41219e;
        arrayList.clear();
        ArrayList arrayList2 = this.f41220f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        n00Var.a(LocaleController.getString(arrayList.size() >= Math.min(a0(), arrayList2.size()) ? R.string.DeselectAll : R.string.SelectAll), new hh.t5(this, n00Var, z10, 24));
        this.C = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i10 = 0; i10 < this.f41216a.getChildCount(); i10++) {
            View childAt = this.f41216a.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.d4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int a0() {
        return getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public final String b0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    public final void c0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || this.A || !this.C) {
            return;
        }
        e0(true);
        this.A = true;
        tL_exportedChatlistInvite.peers.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.f41219e;
            if (i10 >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i10)).longValue()));
            i10++;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.f41218c.f19622id;
        tL_chatlists_editExportedInvite.slug = b0();
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new dz(this, 1));
        Utilities.Callback callback = this.f41226y;
        if (callback != null) {
            callback.run(tL_exportedChatlistInvite);
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return W(true);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        d0(false);
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 18));
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.f23375v8;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.dr drVar = new org.telegram.ui.Components.dr(drawableMutate, new org.telegram.ui.Components.hp(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        this.f41221n = drVar;
        this.f41222r = zVarN.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), drVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        ta1 ta1Var = new ta1(context, 8, null);
        this.f41216a = ta1Var;
        ta1Var.setLayoutManager(new f2.k0(1, false));
        this.f41216a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f41216a, h7.z5.c(-1.0f, -1));
        ta1 ta1Var2 = this.f41216a;
        nz nzVar = new nz(this);
        this.f41217b = nzVar;
        ta1Var2.setAdapter(nzVar);
        this.f41216a.setOnItemClickListener(new i(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f41218c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f41220f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i11 = 0; i11 < tL_exportedChatlistInvite.peers.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i11));
                arrayList.add(Long.valueOf(peerDialogId));
                this.f41219e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i12);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f22384id) && !arrayList.contains(Long.valueOf(dialog.f22384id))) {
                long j10 = dialog.f22384id;
                boolean zG0 = j10 < 0;
                if (j10 < 0) {
                    zG0 = q00.g0(getMessagesController().getChat(Long.valueOf(-dialog.f22384id)));
                }
                if (zG0) {
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
        nz nzVar2 = this.f41217b;
        if (nzVar2 != null) {
            nzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String string = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? LocaleController.getString(R.string.FilterShare) : tL_exportedChatlistInvite.title;
        if (z10) {
            this.actionBar.J(string, false, 220L, null);
        } else {
            this.actionBar.setTitle(string);
        }
    }

    public final void e0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.N);
        }
        if (this.f41221n != null) {
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f41221n.f27834c, z10 ? 1.0f : 0.0f);
            this.O = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(this, 12));
            this.O.setDuration((long) (Math.abs(this.f41221n.f27834c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.O.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.O.start();
        }
    }

    public final void f0(boolean z10) {
        org.telegram.ui.Components.n00 n00Var = this.L;
        if (n00Var == null) {
            return;
        }
        ArrayList arrayList = this.f41219e;
        n00Var.b(arrayList.size() <= 0 ? LocaleController.getString("FilterInviteHeaderChatsEmpty") : LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]), z10);
        ArrayList arrayList2 = this.f41220f;
        if (arrayList2.size() > 1) {
            boolean z11 = arrayList.size() >= Math.min(a0(), arrayList2.size());
            this.L.a(LocaleController.getString(!z11 ? R.string.SelectAll : R.string.DeselectAll), new org.telegram.ui.Components.f50(10, this, z11));
        } else {
            this.L.a("", null);
        }
        if (z10) {
            AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.L.f30801a.getText()) + ", " + ((Object) this.L.f30802b.getText()));
        }
    }

    public final void g0() {
        fz fzVar = this.M;
        if (fzVar == null) {
            return;
        }
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            eh.s sVar = fzVar.f38238a;
            sVar.setText(string);
            sVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = fzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f41218c;
        Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        fz fzVar2 = this.M;
        CharSequence charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.f41219e.size(), spannableReplaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        eh.s sVar2 = fzVar2.f38238a;
        sVar2.setText(charSequenceReplaceTags);
        sVar2.h = z10 ? 26 : 0;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return W(z10);
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
