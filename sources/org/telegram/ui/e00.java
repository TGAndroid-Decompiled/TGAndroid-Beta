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
public final class e00 extends org.telegram.ui.ActionBar.p2 {
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
    public org.telegram.ui.Components.h10 P;
    public vz Q;
    public final fj R;
    public ValueAnimator S;
    public float T;
    public ic1 f32002a;
    public d00 f32003b;
    public final MessagesController.DialogFilter f32004c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f32005f;
    public final ArrayList h;
    public org.telegram.ui.Components.vr f32006n;
    public org.telegram.ui.ActionBar.w0 f32007r;
    public int f32008s;
    public long v;
    public long f32009w;
    public Utilities.Callback f32010x;
    public Utilities.Callback f32011y;

    public e00(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f32005f = new ArrayList();
        this.h = new ArrayList();
        this.f32008s = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new fj(this, 28);
        this.T = 1.0f;
        this.f32004c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(e00 e00Var, TLRPC.TL_error tL_error) {
        e00Var.e0(false);
        e00Var.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            e00Var.showDialog(new qg.k0(12, e00Var.currentAccount, e00Var.getParentActivity(), e00Var, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            e00Var.showDialog(new qg.k0(4, e00Var.currentAccount, e00Var.getParentActivity(), e00Var, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            e00Var.showDialog(new qg.k0(13, e00Var.currentAccount, e00Var.getParentActivity(), e00Var, null));
        } else {
            e00Var.finishFragment();
        }
    }

    public static void V(e00 e00Var, View view, int i10) {
        String string;
        String str;
        e00 e00Var2;
        ArrayList arrayList = e00Var.e;
        if (e00Var.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Long l4 = (Long) e00Var.h.get(i10 - e00Var.M);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                e00Var.G = true;
                e00Var.X();
                ((org.telegram.ui.Cells.g4) view).c(false, true);
                e00Var2 = e00Var;
            } else if (e00Var.f32005f.contains(l4)) {
                if (arrayList.size() + 1 > e00Var.a0()) {
                    e00Var.showDialog(new qg.k0(4, e00Var.currentAccount, e00Var.getParentActivity(), e00Var, null));
                    return;
                }
                e00Var2 = e00Var;
                arrayList.add(l4);
                e00Var2.G = true;
                e00Var2.X();
                ((org.telegram.ui.Cells.g4) view).c(true, true);
            } else {
                int i11 = -e00Var.f32008s;
                e00Var.f32008s = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(e00Var.getMessagesController().getUser(l4));
                    TLRPC.User user = e00Var.getMessagesController().getUser(l4);
                    if (user != null && user.bot) {
                        str = LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        str = LocaleController.getString(R.string.FilterInviteUserToast);
                    }
                } else {
                    TLRPC.Chat chat = e00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
                if (e00Var.v != longValue || System.currentTimeMillis() - e00Var.f32009w > 1500) {
                    e00Var.v = longValue;
                    e00Var.f32009w = System.currentTimeMillis();
                    org.telegram.ui.Components.wc.a0(e00Var).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            e00Var2.Y();
            e00Var2.f0(true);
            e00Var2.g0();
        }
    }

    public final boolean W(boolean z10) {
        if (!this.e.isEmpty() && this.G) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
                    public final e00 f37366b;

                    {
                        this.f37366b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f37366b.c0();
                                return;
                            default:
                                this.f37366b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.c2(this) {
                    public final e00 f37366b;

                    {
                        this.f37366b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f37366b.c0();
                                return;
                            default:
                                this.f37366b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f17528a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void X() {
        float f7;
        boolean z10 = this.G;
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
        if (Math.abs(this.T - f7) > 0.1f) {
            this.f32007r.clearAnimation();
            ViewPropertyAnimator animate = this.f32007r.animate();
            this.T = f7;
            animate.alpha(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.wr.h).start();
        }
    }

    public final void Y() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.G) {
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
                this.G = false;
                X();
            }
        }
    }

    public final void Z(org.telegram.ui.Components.h10 h10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f32005f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
            i10 = R.string.DeselectAll;
        } else {
            i10 = R.string.SelectAll;
        }
        h10Var.a(LocaleController.getString(i10), new bi.c1(this, h10Var, z10, 26));
        this.G = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i11 = 0; i11 < this.f32002a.getChildCount(); i11++) {
            View childAt = this.f32002a.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.g4) childAt).c(arrayList.contains((Long) tag), true);
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
            tL_inputChatlistDialogFilter.filter_id = this.f32004c.f14645id;
            tL_chatlists_editExportedInvite.slug = b0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new tz(this, 1));
            Utilities.Callback callback = this.f32011y;
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
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 22));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.j6.f18256v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.vr vrVar = new org.telegram.ui.Components.vr(mutate, new org.telegram.ui.Components.zp(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.f32006n = vrVar;
        this.f32007r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), vrVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        ic1 ic1Var = new ic1(context, 8, null);
        this.f32002a = ic1Var;
        ic1Var.setLayoutManager(new s4.c0(1, false));
        this.f32002a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f32002a, w7.a6.c(-1.0f, -1));
        ic1 ic1Var2 = this.f32002a;
        d00 d00Var = new d00(this);
        this.f32003b = d00Var;
        ic1Var2.setAdapter(d00Var);
        this.f32002a.setOnItemClickListener(new i(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f32004c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f32005f;
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
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f17199id) && !arrayList.contains(Long.valueOf(dialog.f17199id))) {
                int i13 = (dialog.f17199id > 0L ? 1 : (dialog.f17199id == 0L ? 0 : -1));
                if (i13 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i13 < 0) {
                    z10 = h10.g0(getMessagesController().getChat(Long.valueOf(-dialog.f17199id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.f17199id));
                    arrayList2.add(Long.valueOf(dialog.f17199id));
                }
            }
        }
        for (int i14 = 0; i14 < dialogFilter.dialogs.size(); i14++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i14);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f17199id) && !arrayList.contains(Long.valueOf(dialog2.f17199id)) && !arrayList2.contains(Long.valueOf(dialog2.f17199id))) {
                arrayList.add(Long.valueOf(dialog2.f17199id));
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
        d00 d00Var2 = this.f32003b;
        if (d00Var2 != null) {
            d00Var2.l();
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
        if (this.f32006n != null) {
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f32006n.f28591c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 12));
            ValueAnimator valueAnimator2 = this.S;
            float f12 = this.f32006n.f28591c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.S.setInterpolator(org.telegram.ui.Components.wr.f28819f);
            this.S.start();
        }
    }

    public final void f0(boolean z10) {
        String formatPluralString;
        int i10;
        org.telegram.ui.Components.h10 h10Var = this.P;
        if (h10Var != null) {
            ArrayList arrayList = this.e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            h10Var.b(formatPluralString, z10);
            ArrayList arrayList2 = this.f32005f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.h10 h10Var2 = this.P;
                if (!z11) {
                    i10 = R.string.SelectAll;
                } else {
                    i10 = R.string.DeselectAll;
                }
                h10Var2.a(LocaleController.getString(i10), new org.telegram.ui.Components.bs0(5, this, z11));
            } else {
                this.P.a("", null);
            }
            if (z10) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.P.f23468a.getText()) + ", " + ((Object) this.P.f23469b.getText()));
            }
        }
    }

    public final void g0() {
        vz vzVar = this.Q;
        if (vzVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            uh.o oVar = vzVar.f37657a;
            oVar.setText(string);
            oVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = vzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f32004c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        vz vzVar2 = this.Q;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        uh.o oVar2 = vzVar2.f37657a;
        oVar2.setText(replaceTags);
        if (z10) {
            i10 = 26;
        }
        oVar2.h = i10;
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
