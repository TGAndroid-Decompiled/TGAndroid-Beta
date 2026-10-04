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
    public org.telegram.ui.Components.c10 P;
    public tz Q;
    public final bj R;
    public ValueAnimator S;
    public float T;
    public zb1 f35224a;
    public b00 f35225b;
    public final MessagesController.DialogFilter f35226c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f35227e;
    public final ArrayList f35228f;
    public final ArrayList h;
    public org.telegram.ui.Components.sr f35229n;
    public org.telegram.ui.ActionBar.v0 f35230r;
    public int f35231s;
    public long v;
    public long f35232w;
    public Utilities.Callback f35233x;
    public Utilities.Callback f35234y;

    public c00(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f35227e = new ArrayList();
        this.f35228f = new ArrayList();
        this.h = new ArrayList();
        this.f35231s = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new bj(this, 28);
        this.T = 1.0f;
        this.f35226c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void S(c00 c00Var, TLRPC.TL_error tL_error) {
        c00Var.e0(false);
        c00Var.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            c00Var.showDialog(new rg.k0(12, c00Var.currentAccount, c00Var.getParentActivity(), c00Var, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            c00Var.showDialog(new rg.k0(4, c00Var.currentAccount, c00Var.getParentActivity(), c00Var, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            c00Var.showDialog(new rg.k0(13, c00Var.currentAccount, c00Var.getParentActivity(), c00Var, null));
        } else {
            c00Var.finishFragment();
        }
    }

    public static void T(c00 c00Var, View view, int i10) {
        String string;
        String str;
        c00 c00Var2;
        ArrayList arrayList = c00Var.f35227e;
        if (c00Var.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Long l4 = (Long) c00Var.h.get(i10 - c00Var.M);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                c00Var.G = true;
                c00Var.W();
                ((org.telegram.ui.Cells.g4) view).c(false, true);
                c00Var2 = c00Var;
            } else if (c00Var.f35228f.contains(l4)) {
                if (arrayList.size() + 1 > c00Var.Z()) {
                    c00Var.showDialog(new rg.k0(4, c00Var.currentAccount, c00Var.getParentActivity(), c00Var, null));
                    return;
                }
                c00Var2 = c00Var;
                arrayList.add(l4);
                c00Var2.G = true;
                c00Var2.W();
                ((org.telegram.ui.Cells.g4) view).c(true, true);
            } else {
                int i11 = -c00Var.f35231s;
                c00Var.f35231s = i11;
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
                if (c00Var.v != longValue || System.currentTimeMillis() - c00Var.f35232w > 1500) {
                    c00Var.v = longValue;
                    c00Var.f35232w = System.currentTimeMillis();
                    org.telegram.ui.Components.yc.a0(c00Var).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            c00Var2.X();
            c00Var2.f0(true);
            c00Var2.g0();
        }
    }

    public final boolean U(boolean z10) {
        if (!this.f35227e.isEmpty() && this.G) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {
                    public final c00 f40637b;

                    {
                        this.f40637b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f40637b.c0();
                                return;
                            default:
                                this.f40637b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) {
                    public final c00 f40637b;

                    {
                        this.f40637b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f40637b.c0();
                                return;
                            default:
                                this.f40637b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f20368a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void W() {
        float f7;
        boolean z10 = this.G;
        boolean isEmpty = this.f35227e.isEmpty();
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
            this.f35230r.clearAnimation();
            ViewPropertyAnimator animate = this.f35230r.animate();
            this.T = f7;
            animate.alpha(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.tr.h).start();
        }
    }

    public final void X() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.G) {
            ArrayList arrayList = this.f35227e;
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
                W();
            }
        }
    }

    public final void Y(org.telegram.ui.Components.c10 c10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.f35227e;
        arrayList.clear();
        ArrayList arrayList2 = this.f35228f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(Z(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(Z(), arrayList2.size())) {
            i10 = R.string.DeselectAll;
        } else {
            i10 = R.string.SelectAll;
        }
        c10Var.a(LocaleController.getString(i10), new ci.y0(this, c10Var, z10, 27));
        this.G = true;
        X();
        W();
        f0(true);
        g0();
        for (int i11 = 0; i11 < this.f35224a.getChildCount(); i11++) {
            View childAt = this.f35224a.getChildAt(i11);
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
                arrayList = this.f35227e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i10)).longValue()));
                i10++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f35226c.f17257id;
            tL_chatlists_editExportedInvite.slug = b0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new rz(this, 1));
            Utilities.Callback callback = this.f35234y;
            if (callback != null) {
                callback.run(tL_exportedChatlistInvite);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return U(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        d0(false);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 22));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.i6.f21155v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.sr srVar = new org.telegram.ui.Components.sr(mutate, new org.telegram.ui.Components.wp(org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
        this.f35229n = srVar;
        this.f35230r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), srVar);
        W();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20762a7, false));
        zb1 zb1Var = new zb1(context, 9, null);
        this.f35224a = zb1Var;
        zb1Var.setLayoutManager(new s4.c0(1, false));
        this.f35224a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35224a, w7.z5.c(-1.0f, -1));
        zb1 zb1Var2 = this.f35224a;
        b00 b00Var = new b00(this);
        this.f35225b = b00Var;
        zb1Var2.setAdapter(b00Var);
        this.f35224a.setOnItemClickListener(new i(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f35226c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f35228f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i11 = 0; i11 < tL_exportedChatlistInvite.peers.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i11));
                arrayList.add(Long.valueOf(peerDialogId));
                this.f35227e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i12);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f20042id) && !arrayList.contains(Long.valueOf(dialog.f20042id))) {
                int i13 = (dialog.f20042id > 0L ? 1 : (dialog.f20042id == 0L ? 0 : -1));
                if (i13 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i13 < 0) {
                    z10 = f10.g0(getMessagesController().getChat(Long.valueOf(-dialog.f20042id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.f20042id));
                    arrayList2.add(Long.valueOf(dialog.f20042id));
                }
            }
        }
        for (int i14 = 0; i14 < dialogFilter.dialogs.size(); i14++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i14);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f20042id) && !arrayList.contains(Long.valueOf(dialog2.f20042id)) && !arrayList2.contains(Long.valueOf(dialog2.f20042id))) {
                arrayList.add(Long.valueOf(dialog2.f20042id));
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
        b00 b00Var2 = this.f35225b;
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
            this.actionBar.H(str3, false, 220L, null);
        } else {
            this.actionBar.setTitle(str3);
        }
    }

    public final void e0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
        }
        if (this.f35229n != null) {
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f35229n.f30864c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 11));
            ValueAnimator valueAnimator2 = this.S;
            float f12 = this.f35229n.f30864c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.S.setInterpolator(org.telegram.ui.Components.tr.f31141f);
            this.S.start();
        }
    }

    public final void f0(boolean z10) {
        String formatPluralString;
        int i10;
        org.telegram.ui.Components.c10 c10Var = this.P;
        if (c10Var != null) {
            ArrayList arrayList = this.f35227e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            c10Var.b(formatPluralString, z10);
            ArrayList arrayList2 = this.f35228f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(Z(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.c10 c10Var2 = this.P;
                if (!z11) {
                    i10 = R.string.SelectAll;
                } else {
                    i10 = R.string.DeselectAll;
                }
                c10Var2.a(LocaleController.getString(i10), new org.telegram.ui.Components.es0(6, this, z11));
            } else {
                this.P.a("", null);
            }
            if (z10) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.P.f25159a.getText()) + ", " + ((Object) this.P.f25160b.getText()));
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
            vh.n nVar = tzVar.f40998a;
            nVar.setText(string);
            nVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = tzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f35226c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        tz tzVar2 = this.Q;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.f35227e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        vh.n nVar2 = tzVar2.f40998a;
        nVar2.setText(replaceTags);
        if (z10) {
            i10 = 26;
        }
        nVar2.h = i10;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return U(z10);
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
