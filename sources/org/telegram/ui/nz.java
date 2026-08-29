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
public final class nz extends org.telegram.ui.ActionBar.o2 {
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
    public org.telegram.ui.Components.v00 L;
    public ez M;
    public final ui N;
    public ValueAnimator O;
    public float P;
    public wa1 f40929a;
    public mz f40930b;
    public final MessagesController.DialogFilter f40931c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f40932e;
    public final ArrayList f40933f;
    public final ArrayList h;
    public org.telegram.ui.Components.ir f40934n;
    public org.telegram.ui.ActionBar.w0 f40935r;
    public int f40936s;
    public long v;
    public long f40937w;
    public Utilities.Callback f40938x;
    public Utilities.Callback f40939y;

    public nz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f40932e = new ArrayList();
        this.f40933f = new ArrayList();
        this.h = new ArrayList();
        this.f40936s = -5;
        this.A = false;
        this.D = 0;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.N = new ui(this, 28);
        this.P = 1.0f;
        this.f40931c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(nz nzVar, TLRPC.TL_error tL_error) {
        nzVar.e0(false);
        nzVar.A = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            nzVar.showDialog(new cg.v0(12, nzVar.currentAccount, nzVar.getParentActivity(), nzVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            nzVar.showDialog(new cg.v0(4, nzVar.currentAccount, nzVar.getParentActivity(), nzVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            nzVar.showDialog(new cg.v0(13, nzVar.currentAccount, nzVar.getParentActivity(), nzVar, null));
        } else {
            nzVar.finishFragment();
        }
    }

    public static void V(nz nzVar, View view, int i10) {
        String string;
        String str;
        nz nzVar2;
        ArrayList arrayList = nzVar.f40932e;
        if (nzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.e4)) {
            Long l10 = (Long) nzVar.h.get(i10 - nzVar.I);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                nzVar.C = true;
                nzVar.X();
                ((org.telegram.ui.Cells.e4) view).c(false, true);
                nzVar2 = nzVar;
            } else if (nzVar.f40933f.contains(l10)) {
                if (arrayList.size() + 1 > nzVar.a0()) {
                    nzVar.showDialog(new cg.v0(4, nzVar.currentAccount, nzVar.getParentActivity(), nzVar, null));
                    return;
                }
                nzVar2 = nzVar;
                arrayList.add(l10);
                nzVar2.C = true;
                nzVar2.X();
                ((org.telegram.ui.Cells.e4) view).c(true, true);
            } else {
                int i11 = -nzVar.f40936s;
                nzVar.f40936s = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(nzVar.getMessagesController().getUser(l10));
                    TLRPC.User user = nzVar.getMessagesController().getUser(l10);
                    if (user != null && user.bot) {
                        str = LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        str = LocaleController.getString(R.string.FilterInviteUserToast);
                    }
                } else {
                    TLRPC.Chat chat = nzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
                if (nzVar.v != longValue || System.currentTimeMillis() - nzVar.f40937w > 1500) {
                    nzVar.v = longValue;
                    nzVar.f40937w = System.currentTimeMillis();
                    org.telegram.ui.Components.tc.a0(nzVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            nzVar2.Y();
            nzVar2.f0(true);
            nzVar2.g0();
        }
    }

    public final boolean W(boolean z10) {
        if (!this.f40932e.isEmpty() && this.C) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
                    public final nz f37653b;

                    {
                        this.f37653b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f37653b.c0();
                                return;
                            default:
                                this.f37653b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) {
                    public final nz f37653b;

                    {
                        this.f37653b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f37653b.c0();
                                return;
                            default:
                                this.f37653b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f22714a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void X() {
        float f9;
        boolean z10 = this.C;
        boolean isEmpty = this.f40932e.isEmpty();
        if (z10) {
            if (!isEmpty) {
                f9 = 1.0f;
            } else {
                f9 = 0.5f;
            }
        } else {
            f9 = 0.0f;
        }
        if (Math.abs(this.P - f9) > 0.1f) {
            this.f40935r.clearAnimation();
            ViewPropertyAnimator animate = this.f40935r.animate();
            this.P = f9;
            animate.alpha(f9).setDuration(320L).setInterpolator(org.telegram.ui.Components.jr.h).start();
        }
    }

    public final void Y() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.C) {
            ArrayList arrayList = this.f40932e;
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
                this.C = false;
                X();
            }
        }
    }

    public final void Z(org.telegram.ui.Components.v00 v00Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f40932e;
        arrayList.clear();
        ArrayList arrayList2 = this.f40933f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
            i10 = R.string.DeselectAll;
        } else {
            i10 = R.string.SelectAll;
        }
        v00Var.a(LocaleController.getString(i10), new jh.r5(this, v00Var, z10, 24));
        this.C = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i11 = 0; i11 < this.f40929a.getChildCount(); i11++) {
            View childAt = this.f40929a.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.e4) childAt).c(arrayList.contains((Long) tag), true);
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
        if (tL_exportedChatlistInvite != null && !this.A && this.C) {
            e0(true);
            this.A = true;
            tL_exportedChatlistInvite.peers.clear();
            int i10 = 0;
            while (true) {
                arrayList = this.f40932e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i10)).longValue()));
                i10++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f40931c.f19620id;
            tL_chatlists_editExportedInvite.slug = b0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new cz(this, 1));
            Utilities.Callback callback = this.f40939y;
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
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 9));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(mutate, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        this.f40934n = irVar;
        this.f40935r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), irVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        wa1 wa1Var = new wa1(context, 8, null);
        this.f40929a = wa1Var;
        wa1Var.setLayoutManager(new f2.j0(1, false));
        this.f40929a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f40929a, i7.f6.c(-1.0f, -1));
        wa1 wa1Var2 = this.f40929a;
        mz mzVar = new mz(this);
        this.f40930b = mzVar;
        wa1Var2.setAdapter(mzVar);
        this.f40929a.setOnItemClickListener(new j(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f40931c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f40933f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i11 = 0; i11 < tL_exportedChatlistInvite.peers.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i11));
                arrayList.add(Long.valueOf(peerDialogId));
                this.f40932e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i12);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f22396id) && !arrayList.contains(Long.valueOf(dialog.f22396id))) {
                int i13 = (dialog.f22396id > 0L ? 1 : (dialog.f22396id == 0L ? 0 : -1));
                if (i13 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i13 < 0) {
                    z10 = p00.g0(getMessagesController().getChat(Long.valueOf(-dialog.f22396id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.f22396id));
                    arrayList2.add(Long.valueOf(dialog.f22396id));
                }
            }
        }
        for (int i14 = 0; i14 < dialogFilter.dialogs.size(); i14++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i14);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f22396id) && !arrayList.contains(Long.valueOf(dialog2.f22396id)) && !arrayList2.contains(Long.valueOf(dialog2.f22396id))) {
                arrayList.add(Long.valueOf(dialog2.f22396id));
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
            int i15 = this.D;
            int i16 = i15 + 1;
            this.H = i15;
            int i17 = i15 + 2;
            this.D = i17;
            this.I = i16;
            int size = (arrayList.size() - 1) + i17;
            this.J = size;
            this.D = size + 1;
            this.K = size;
        }
        mz mzVar2 = this.f40930b;
        if (mzVar2 != null) {
            mzVar2.l();
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
        float f9;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.N);
        }
        if (this.f40934n != null) {
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f40934n.f29455c;
            float f11 = 0.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.O = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 12));
            ValueAnimator valueAnimator2 = this.O;
            float f12 = this.f40934n.f29455c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.O.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.O.start();
        }
    }

    public final void f0(boolean z10) {
        String formatPluralString;
        int i10;
        org.telegram.ui.Components.v00 v00Var = this.L;
        if (v00Var != null) {
            ArrayList arrayList = this.f40932e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            v00Var.b(formatPluralString, z10);
            ArrayList arrayList2 = this.f40933f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.v00 v00Var2 = this.L;
                if (!z11) {
                    i10 = R.string.SelectAll;
                } else {
                    i10 = R.string.DeselectAll;
                }
                v00Var2.a(LocaleController.getString(i10), new org.telegram.ui.Components.p90(9, this, z11));
            } else {
                this.L.a("", null);
            }
            if (z10) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.L.f33413a.getText()) + ", " + ((Object) this.L.f33414b.getText()));
            }
        }
    }

    public final void g0() {
        ez ezVar = this.M;
        if (ezVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            gh.s sVar = ezVar.f37934a;
            sVar.setText(string);
            sVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = ezVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f40931c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        ez ezVar2 = this.M;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.f40932e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        gh.s sVar2 = ezVar2.f37934a;
        sVar2.setText(replaceTags);
        if (z10) {
            i10 = 26;
        }
        sVar2.h = i10;
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
