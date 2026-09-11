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
public final class c00 extends org.telegram.ui.ActionBar.n2 {
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public org.telegram.ui.Components.z00 P;
    public tz Q;
    public final dj R;
    public ValueAnimator S;
    public float T;
    public ec1 f34953a;
    public b00 f34954b;
    public final MessagesController.DialogFilter f34955c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f34956e;
    public final ArrayList f34957f;
    public final ArrayList h;
    public org.telegram.ui.Components.or f34958n;
    public org.telegram.ui.ActionBar.v0 f34959r;
    public int f34960s;
    public long v;
    public long f34961w;
    public Utilities.Callback f34962x;
    public Utilities.Callback f34963y;

    public c00(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f34956e = new ArrayList();
        this.f34957f = new ArrayList();
        this.h = new ArrayList();
        this.f34960s = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new dj(this, 28);
        this.T = 1.0f;
        this.f34955c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(c00 c00Var, TLRPC.TL_error tL_error) {
        c00Var.e0(false);
        c00Var.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            c00Var.showDialog(new sg.k0(12, c00Var.currentAccount, c00Var.getParentActivity(), c00Var, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            c00Var.showDialog(new sg.k0(4, c00Var.currentAccount, c00Var.getParentActivity(), c00Var, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            c00Var.showDialog(new sg.k0(13, c00Var.currentAccount, c00Var.getParentActivity(), c00Var, null));
        } else {
            c00Var.finishFragment();
        }
    }

    public static void V(c00 c00Var, View view, int i10) {
        String string;
        String str;
        c00 c00Var2;
        ArrayList arrayList = c00Var.f34956e;
        if (c00Var.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
            Long l4 = (Long) c00Var.h.get(i10 - c00Var.M);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                c00Var.G = true;
                c00Var.X();
                ((org.telegram.ui.Cells.f4) view).c(false, true);
                c00Var2 = c00Var;
            } else if (c00Var.f34957f.contains(l4)) {
                if (arrayList.size() + 1 > c00Var.a0()) {
                    c00Var.showDialog(new sg.k0(4, c00Var.currentAccount, c00Var.getParentActivity(), c00Var, null));
                    return;
                }
                c00Var2 = c00Var;
                arrayList.add(l4);
                c00Var2.G = true;
                c00Var2.X();
                ((org.telegram.ui.Cells.f4) view).c(true, true);
            } else {
                int i11 = -c00Var.f34960s;
                c00Var.f34960s = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(c00Var.getMessagesController().getUser(l4));
                    TLRPC.User user = c00Var.getMessagesController().getUser(l4);
                    if (user != null && user.bot) {
                        str = LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        str = LocaleController.getString(R.string.FilterInviteUserToast);
                    }
                } else {
                    TLRPC.Chat chat = c00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
                if (c00Var.v != longValue || System.currentTimeMillis() - c00Var.f34961w > 1500) {
                    c00Var.v = longValue;
                    c00Var.f34961w = System.currentTimeMillis();
                    org.telegram.ui.Components.yc.a0(c00Var).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            c00Var2.Y();
            c00Var2.f0(true);
            c00Var2.g0();
        }
    }

    public final boolean W(boolean z10) {
        if (!this.f34956e.isEmpty() && this.G) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final c00 f40574b;

                    {
                        this.f40574b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f40574b.c0();
                                return;
                            default:
                                this.f40574b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final c00 f40574b;

                    {
                        this.f40574b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f40574b.c0();
                                return;
                            default:
                                this.f40574b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20198a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void X() {
        float f7;
        boolean z10 = this.G;
        boolean isEmpty = this.f34956e.isEmpty();
        if (z10) {
            if (!isEmpty) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
        } else {
            f7 = 0.0f;
        }
        if (Math.abs(this.T - f7) > 0.1f) {
            this.f34959r.clearAnimation();
            ViewPropertyAnimator animate = this.f34959r.animate();
            this.T = f7;
            animate.alpha(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).start();
        }
    }

    public final void Y() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.G) {
            ArrayList arrayList = this.f34956e;
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
                this.G = false;
                X();
            }
        }
    }

    public final void Z(org.telegram.ui.Components.z00 z00Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f34956e;
        arrayList.clear();
        ArrayList arrayList2 = this.f34957f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
            i10 = R.string.DeselectAll;
        } else {
            i10 = R.string.SelectAll;
        }
        z00Var.a(LocaleController.getString(i10), new di.y0(this, z00Var, z10, 26));
        this.G = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i11 = 0; i11 < this.f34953a.getChildCount(); i11++) {
            View childAt = this.f34953a.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.f4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int a0() {
        if (getUserConfig().isPremium()) {
            return getMessagesController().dialogFiltersChatsLimitPremium;
        }
        return getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public final String b0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && (str = tL_exportedChatlistInvite.url) != null) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return null;
    }

    public final void c0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.E && this.G) {
            e0(true);
            this.E = true;
            tL_exportedChatlistInvite.peers.clear();
            int i10 = 0;
            while (true) {
                arrayList = this.f34956e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i10)).longValue()));
                i10++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f34955c.f17080id;
            tL_chatlists_editExportedInvite.slug = b0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new rz(this, 1));
            Utilities.Callback callback = this.f34963y;
            if (callback != null) {
                callback.run(tL_exportedChatlistInvite);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return W(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        d0(false);
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 23));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.j6.f20992v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.sp(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.f34958n = orVar;
        this.f34959r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), orVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        ec1 ec1Var = new ec1(context, 9, null);
        this.f34953a = ec1Var;
        ec1Var.setLayoutManager(new s4.c0(1, false));
        this.f34953a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f34953a, w7.x5.c(-1.0f, -1));
        ec1 ec1Var2 = this.f34953a;
        b00 b00Var = new b00(this);
        this.f34954b = b00Var;
        ec1Var2.setAdapter(b00Var);
        this.f34953a.setOnItemClickListener(new i(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f34955c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f34957f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i11 = 0; i11 < tL_exportedChatlistInvite.peers.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i11));
                arrayList.add(Long.valueOf(peerDialogId));
                this.f34956e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i12);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f19873id) && !arrayList.contains(Long.valueOf(dialog.f19873id))) {
                int i13 = (dialog.f19873id > 0L ? 1 : (dialog.f19873id == 0L ? 0 : -1));
                if (i13 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i13 < 0) {
                    z10 = f10.g0(getMessagesController().getChat(Long.valueOf(-dialog.f19873id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.f19873id));
                    arrayList2.add(Long.valueOf(dialog.f19873id));
                }
            }
        }
        for (int i14 = 0; i14 < dialogFilter.dialogs.size(); i14++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i14);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f19873id) && !arrayList.contains(Long.valueOf(dialog2.f19873id)) && !arrayList2.contains(Long.valueOf(dialog2.f19873id))) {
                arrayList.add(Long.valueOf(dialog2.f19873id));
            }
        }
        this.H = 1;
        if (tL_exportedChatlistInvite != null) {
            this.J = 1;
            this.I = 2;
            this.H = 4;
            this.K = 3;
        } else {
            this.J = -1;
            this.I = -1;
            this.K = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
        } else {
            int i15 = this.H;
            int i16 = i15 + 1;
            this.L = i15;
            int i17 = i15 + 2;
            this.H = i17;
            this.M = i16;
            int size = (arrayList.size() - 1) + i17;
            this.N = size;
            this.H = size + 1;
            this.O = size;
        }
        b00 b00Var2 = this.f34954b;
        if (b00Var2 != null) {
            b00Var2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
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
            this.actionBar.J(str3, false, 220L, null);
        } else {
            this.actionBar.setTitle(str3);
        }
    }

    public final void e0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
        }
        if (this.f34958n != null) {
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f34958n.f29171c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 12));
            ValueAnimator valueAnimator2 = this.S;
            float f12 = this.f34958n.f29171c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.S.setInterpolator(org.telegram.ui.Components.pr.f29466f);
            this.S.start();
        }
    }

    public final void f0(boolean z10) {
        String formatPluralString;
        int i10;
        org.telegram.ui.Components.z00 z00Var = this.P;
        if (z00Var != null) {
            ArrayList arrayList = this.f34956e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            z00Var.b(formatPluralString, z10);
            ArrayList arrayList2 = this.f34957f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.z00 z00Var2 = this.P;
                if (!z11) {
                    i10 = R.string.SelectAll;
                } else {
                    i10 = R.string.DeselectAll;
                }
                z00Var2.a(LocaleController.getString(i10), new org.telegram.ui.Components.mr0(6, this, z11));
            } else {
                this.P.a("", null);
            }
            if (z10) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.P.f33038a.getText()) + ", " + ((Object) this.P.f33039b.getText()));
            }
        }
    }

    public final void g0() {
        tz tzVar = this.Q;
        if (tzVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            wh.p pVar = tzVar.f40871a;
            pVar.setText(string);
            pVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = tzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f34955c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        tz tzVar2 = this.Q;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.f34956e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        wh.p pVar2 = tzVar2.f40871a;
        pVar2.setText(replaceTags);
        if (z10) {
            i10 = 26;
        }
        pVar2.h = i10;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return W(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
            this.F = 0;
        }
    }
}
