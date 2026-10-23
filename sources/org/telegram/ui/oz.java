package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oz extends org.telegram.ui.ActionBar.o2 {
    public Utilities.Callback E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public org.telegram.ui.Components.h10 Q;
    public dz R;
    public final ti S;
    public ValueAnimator T;
    public float U;
    public xa1 f40303a;
    public nz f40304b;
    public final MessagesController.DialogFilter f40305c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f40306f;
    public final ArrayList h;
    public org.telegram.ui.Components.as f40307n;
    public org.telegram.ui.Components.eq f40308r;
    public org.telegram.ui.ActionBar.u0 f40309s;
    public int v;
    public long f40310w;
    public long f40311x;
    public Utilities.Callback f40312y;

    public oz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f40306f = new ArrayList();
        this.h = new ArrayList();
        this.v = -5;
        this.F = false;
        this.I = 0;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.S = new ti(this, 29);
        this.U = 1.0f;
        this.f40305c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(oz ozVar, TLRPC.TL_error tL_error) {
        ozVar.e0(false);
        ozVar.F = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new sg.j0(12, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new sg.j0(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            ozVar.showDialog(new sg.j0(13, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
        } else {
            ozVar.finishFragment();
        }
    }

    public static void V(oz ozVar, View view, int i10) {
        String string;
        String str;
        oz ozVar2;
        ArrayList arrayList = ozVar.e;
        if (ozVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
            Long l4 = (Long) ozVar.h.get(i10 - ozVar.N);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                ozVar.H = true;
                ozVar.X();
                ((org.telegram.ui.Cells.f4) view).c(false, true);
                ozVar2 = ozVar;
            } else if (ozVar.f40306f.contains(l4)) {
                if (arrayList.size() + 1 > ozVar.a0()) {
                    ozVar.showDialog(new sg.j0(4, ozVar.currentAccount, ozVar.getParentActivity(), ozVar, null));
                    return;
                }
                ozVar2 = ozVar;
                arrayList.add(l4);
                ozVar2.H = true;
                ozVar2.X();
                ((org.telegram.ui.Cells.f4) view).c(true, true);
            } else {
                int i11 = -ozVar.v;
                ozVar.v = i11;
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
                if (ozVar.f40310w != longValue || System.currentTimeMillis() - ozVar.f40311x > 1500) {
                    ozVar.f40310w = longValue;
                    ozVar.f40311x = System.currentTimeMillis();
                    org.telegram.ui.Components.xc.a0(ozVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            ozVar2.Y();
            ozVar2.f0(true);
            ozVar2.g0();
        }
    }

    public final boolean W(boolean z10) {
        if (!this.e.isEmpty() && this.H) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
                    public final oz f36453b;

                    {
                        this.f36453b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f36453b.c0();
                                return;
                            default:
                                this.f36453b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) {
                    public final oz f36453b;

                    {
                        this.f36453b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f36453b.c0();
                                return;
                            default:
                                this.f36453b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20678a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void X() {
        float f7;
        boolean z10 = this.H;
        boolean isEmpty = this.e.isEmpty();
        if (z10) {
            if (!isEmpty) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
        } else {
            f7 = 0.0f;
        }
        if (Math.abs(this.U - f7) > 0.1f) {
            this.f40309s.clearAnimation();
            ViewPropertyAnimator animate = this.f40309s.animate();
            this.U = f7;
            animate.alpha(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).start();
        }
    }

    public final void Y() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.H) {
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
                this.H = false;
                X();
            }
        }
    }

    public final void Z(org.telegram.ui.Components.h10 h10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f40306f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
            i10 = R.string.DeselectAll;
        } else {
            i10 = R.string.SelectAll;
        }
        h10Var.a(LocaleController.getString(i10), new ai.y7(this, h10Var, z10, 28));
        this.H = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i11 = 0; i11 < this.f40303a.getChildCount(); i11++) {
            View childAt = this.f40303a.getChildAt(i11);
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
        if (tL_exportedChatlistInvite != null && !this.F && this.H) {
            e0(true);
            this.F = true;
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
            tL_inputChatlistDialogFilter.filter_id = this.f40305c.f17862id;
            tL_chatlists_editExportedInvite.slug = b0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new bz(this, 1));
            Utilities.Callback callback = this.E;
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
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 25));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21518v8;
        org.telegram.ui.ActionBar.r6.z(kVar, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f40308r = eqVar;
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(mutate, eqVar);
        this.f40307n = asVar;
        this.f40309s = m10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), asVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        xa1 xa1Var = new xa1(context, 9, null);
        this.f40303a = xa1Var;
        xa1Var.setLayoutManager(new s4.b0(1, false));
        this.f40303a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f40303a, w7.z5.c(-1.0f, -1));
        xa1 xa1Var2 = this.f40303a;
        nz nzVar = new nz(this);
        this.f40304b = nzVar;
        xa1Var2.setAdapter(nzVar);
        this.f40303a.setOnItemClickListener(new h(this, 9));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f40305c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f40306f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i11 = 0; i11 < tL_exportedChatlistInvite.peers.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i11));
                arrayList.add(Long.valueOf(peerDialogId));
                this.e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i12);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f20347id) && !arrayList.contains(Long.valueOf(dialog.f20347id))) {
                int i13 = (dialog.f20347id > 0L ? 1 : (dialog.f20347id == 0L ? 0 : -1));
                if (i13 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i13 < 0) {
                    z10 = q00.g0(getMessagesController().getChat(Long.valueOf(-dialog.f20347id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.f20347id));
                    arrayList2.add(Long.valueOf(dialog.f20347id));
                }
            }
        }
        for (int i14 = 0; i14 < dialogFilter.dialogs.size(); i14++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i14);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f20347id) && !arrayList.contains(Long.valueOf(dialog2.f20347id)) && !arrayList2.contains(Long.valueOf(dialog2.f20347id))) {
                arrayList.add(Long.valueOf(dialog2.f20347id));
            }
        }
        this.I = 1;
        if (tL_exportedChatlistInvite != null) {
            this.K = 1;
            this.J = 2;
            this.I = 4;
            this.L = 3;
        } else {
            this.K = -1;
            this.J = -1;
            this.L = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
        } else {
            int i15 = this.I;
            int i16 = i15 + 1;
            this.M = i15;
            int i17 = i15 + 2;
            this.I = i17;
            this.N = i16;
            int size = (arrayList.size() - 1) + i17;
            this.O = size;
            this.I = size + 1;
            this.P = size;
        }
        nz nzVar2 = this.f40304b;
        if (nzVar2 != null) {
            nzVar2.l();
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
            this.actionBar.I(str3, false, 220L, null);
        } else {
            this.actionBar.setTitle(str3);
        }
    }

    public final void e0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.S);
        }
        if (this.f40307n != null) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f40307n.f24834c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 12));
            ValueAnimator valueAnimator2 = this.T;
            float f12 = this.f40307n.f24834c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.T.setInterpolator(org.telegram.ui.Components.bs.f25133f);
            this.T.start();
        }
    }

    public final void f0(boolean z10) {
        String formatPluralString;
        int i10;
        org.telegram.ui.Components.h10 h10Var = this.Q;
        if (h10Var != null) {
            ArrayList arrayList = this.e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            h10Var.b(formatPluralString, z10);
            ArrayList arrayList2 = this.f40306f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.h10 h10Var2 = this.Q;
                if (!z11) {
                    i10 = R.string.SelectAll;
                } else {
                    i10 = R.string.DeselectAll;
                }
                h10Var2.a(LocaleController.getString(i10), new org.telegram.ui.Components.b60(11, this, z11));
            } else {
                this.Q.a("", null);
            }
            if (z10) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.Q.f26758a.getText()) + ", " + ((Object) this.Q.f26759b.getText()));
            }
        }
    }

    public final void g0() {
        dz dzVar = this.R;
        if (dzVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            wh.n nVar = dzVar.f36762a;
            nVar.setText(string);
            nVar.f49552s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = dzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f40305c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        dz dzVar2 = this.R;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        wh.n nVar2 = dzVar2.f36762a;
        nVar2.setText(replaceTags);
        if (z10) {
            i10 = 26;
        }
        nVar2.f49552s = i10;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return W(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.G != 0) {
            getConnectionsManager().cancelRequest(this.G, true);
            this.G = 0;
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.eq eqVar = this.f40308r;
            if (eqVar != null) {
                eqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21518v8, false));
                org.telegram.ui.Components.as asVar = this.f40307n;
                if (asVar != null) {
                    asVar.invalidateSelf();
                }
                org.telegram.ui.ActionBar.u0 u0Var = this.f40309s;
                if (u0Var != null) {
                    u0Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
