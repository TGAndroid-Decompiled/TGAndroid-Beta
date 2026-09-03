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
public final class a00 extends org.telegram.ui.ActionBar.p2 {
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.Components.a10 M;
    public qz N;
    public final bj O;
    public ValueAnimator P;
    public float Q;
    public rb1 f32398a;
    public zz f32399b;
    public final MessagesController.DialogFilter f32400c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f32401f;
    public final ArrayList h;
    public org.telegram.ui.Components.lr f32402n;
    public org.telegram.ui.ActionBar.w0 f32403r;
    public int f32404s;
    public long v;
    public long f32405w;
    public Utilities.Callback f32406x;
    public Utilities.Callback f32407y;

    public a00(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f32401f = new ArrayList();
        this.h = new ArrayList();
        this.f32404s = -5;
        this.B = false;
        this.E = 0;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.O = new bj(this, 28);
        this.Q = 1.0f;
        this.f32400c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(a00 a00Var, TLRPC.TL_error tL_error) {
        a00Var.e0(false);
        a00Var.B = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            a00Var.showDialog(new eg.v0(12, a00Var.currentAccount, a00Var.getParentActivity(), a00Var, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            a00Var.showDialog(new eg.v0(4, a00Var.currentAccount, a00Var.getParentActivity(), a00Var, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            a00Var.showDialog(new eg.v0(13, a00Var.currentAccount, a00Var.getParentActivity(), a00Var, null));
        } else {
            a00Var.finishFragment();
        }
    }

    public static void V(a00 a00Var, View view, int i10) {
        String string;
        String str;
        a00 a00Var2;
        ArrayList arrayList = a00Var.e;
        if (a00Var.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
            Long l10 = (Long) a00Var.h.get(i10 - a00Var.J);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                a00Var.D = true;
                a00Var.X();
                ((org.telegram.ui.Cells.f4) view).c(false, true);
                a00Var2 = a00Var;
            } else if (a00Var.f32401f.contains(l10)) {
                if (arrayList.size() + 1 > a00Var.a0()) {
                    a00Var.showDialog(new eg.v0(4, a00Var.currentAccount, a00Var.getParentActivity(), a00Var, null));
                    return;
                }
                a00Var2 = a00Var;
                arrayList.add(l10);
                a00Var2.D = true;
                a00Var2.X();
                ((org.telegram.ui.Cells.f4) view).c(true, true);
            } else {
                int i11 = -a00Var.f32404s;
                a00Var.f32404s = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(a00Var.getMessagesController().getUser(l10));
                    TLRPC.User user = a00Var.getMessagesController().getUser(l10);
                    if (user != null && user.bot) {
                        str = LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        str = LocaleController.getString(R.string.FilterInviteUserToast);
                    }
                } else {
                    TLRPC.Chat chat = a00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
                if (a00Var.v != longValue || System.currentTimeMillis() - a00Var.f32405w > 1500) {
                    a00Var.v = longValue;
                    a00Var.f32405w = System.currentTimeMillis();
                    org.telegram.ui.Components.qc.a0(a00Var).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            a00Var2.Y();
            a00Var2.f0(true);
            a00Var2.g0();
        }
    }

    public final boolean W(boolean z4) {
        if (!this.e.isEmpty() && this.D) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
                    public final a00 f37258b;

                    {
                        this.f37258b = this;
                    }

                    @Override
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f37258b.c0();
                                return;
                            default:
                                this.f37258b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.c2(this) {
                    public final a00 f37258b;

                    {
                        this.f37258b = this;
                    }

                    @Override
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f37258b.c0();
                                return;
                            default:
                                this.f37258b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f19478a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void X() {
        float f10;
        boolean z4 = this.D;
        boolean isEmpty = this.e.isEmpty();
        if (z4) {
            if (!isEmpty) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(this.Q - f10) > 0.1f) {
            this.f32403r.clearAnimation();
            ViewPropertyAnimator animate = this.f32403r.animate();
            this.Q = f10;
            animate.alpha(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.mr.h).start();
        }
    }

    public final void Y() {
        boolean z4;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.D) {
            ArrayList arrayList = this.e;
            boolean z10 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                    if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10))))) {
                        break;
                    }
                }
            }
            z10 = z4;
            if (!z10) {
                this.D = false;
                X();
            }
        }
    }

    public final void Z(org.telegram.ui.Components.a10 a10Var, boolean z4) {
        int i10;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f32401f;
        if (!z4) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
            i10 = R.string.DeselectAll;
        } else {
            i10 = R.string.SelectAll;
        }
        a10Var.a(LocaleController.getString(i10), new lh.r5(this, a10Var, z4, 22));
        this.D = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i11 = 0; i11 < this.f32398a.getChildCount(); i11++) {
            View childAt = this.f32398a.getChildAt(i11);
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
        if (tL_exportedChatlistInvite != null && !this.B && this.D) {
            e0(true);
            this.B = true;
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
            tL_inputChatlistDialogFilter.filter_id = this.f32400c.f16649id;
            tL_chatlists_editExportedInvite.slug = b0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new oz(this, 1));
            Utilities.Callback callback = this.f32407y;
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
        boolean z4;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        d0(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 9));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.j6.f20202v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.lr lrVar = new org.telegram.ui.Components.lr(mutate, new org.telegram.ui.Components.qp(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.f32402n = lrVar;
        this.f32403r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), lrVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        rb1 rb1Var = new rb1(context, 8, null);
        this.f32398a = rb1Var;
        rb1Var.setLayoutManager(new f2.i0(1, false));
        this.f32398a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f32398a, k7.b6.c(-1.0f, -1));
        rb1 rb1Var2 = this.f32398a;
        zz zzVar = new zz(this);
        this.f32399b = zzVar;
        rb1Var2.setAdapter(zzVar);
        this.f32398a.setOnItemClickListener(new j(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f32400c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f32401f;
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
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f19163id) && !arrayList.contains(Long.valueOf(dialog.f19163id))) {
                int i13 = (dialog.f19163id > 0L ? 1 : (dialog.f19163id == 0L ? 0 : -1));
                if (i13 < 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i13 < 0) {
                    z4 = c10.g0(getMessagesController().getChat(Long.valueOf(-dialog.f19163id)));
                }
                if (z4) {
                    arrayList.add(Long.valueOf(dialog.f19163id));
                    arrayList2.add(Long.valueOf(dialog.f19163id));
                }
            }
        }
        for (int i14 = 0; i14 < dialogFilter.dialogs.size(); i14++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i14);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f19163id) && !arrayList.contains(Long.valueOf(dialog2.f19163id)) && !arrayList2.contains(Long.valueOf(dialog2.f19163id))) {
                arrayList.add(Long.valueOf(dialog2.f19163id));
            }
        }
        this.E = 1;
        if (tL_exportedChatlistInvite != null) {
            this.G = 1;
            this.F = 2;
            this.E = 4;
            this.H = 3;
        } else {
            this.G = -1;
            this.F = -1;
            this.H = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
        } else {
            int i15 = this.E;
            int i16 = i15 + 1;
            this.I = i15;
            int i17 = i15 + 2;
            this.E = i17;
            this.J = i16;
            int size = (arrayList.size() - 1) + i17;
            this.K = size;
            this.E = size + 1;
            this.L = size;
        }
        zz zzVar2 = this.f32399b;
        if (zzVar2 != null) {
            zzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z4) {
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
        if (z4) {
            this.actionBar.I(str3, false, 220L, null);
        } else {
            this.actionBar.setTitle(str3);
        }
    }

    public final void e0(boolean z4) {
        float f10;
        if (!z4) {
            AndroidUtilities.cancelRunOnUIThread(this.O);
        }
        if (this.f32402n != null) {
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f32402n.f26868c;
            float f12 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 12));
            ValueAnimator valueAnimator2 = this.P;
            float f13 = this.f32402n.f26868c;
            if (z4) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.P.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            this.P.start();
        }
    }

    public final void f0(boolean z4) {
        String formatPluralString;
        int i10;
        org.telegram.ui.Components.a10 a10Var = this.M;
        if (a10Var != null) {
            ArrayList arrayList = this.e;
            boolean z10 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            a10Var.b(formatPluralString, z4);
            ArrayList arrayList2 = this.f32401f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
                    z10 = true;
                }
                org.telegram.ui.Components.a10 a10Var2 = this.M;
                if (!z10) {
                    i10 = R.string.SelectAll;
                } else {
                    i10 = R.string.DeselectAll;
                }
                a10Var2.a(LocaleController.getString(i10), new org.telegram.ui.Components.kv0(4, this, z10));
            } else {
                this.M.a("", null);
            }
            if (z4) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.M.f23279a.getText()) + ", " + ((Object) this.M.f23280b.getText()));
            }
        }
    }

    public final void g0() {
        qz qzVar = this.N;
        if (qzVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            ih.s sVar = qzVar.f37654a;
            sVar.setText(string);
            sVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = qzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f32400c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        qz qzVar2 = this.N;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z4 = dialogFilter.title_noanimate;
        ih.s sVar2 = qzVar2.f37654a;
        sVar2.setText(replaceTags);
        if (z4) {
            i10 = 26;
        }
        sVar2.h = i10;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        return W(z4);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.C != 0) {
            getConnectionsManager().cancelRequest(this.C, true);
            this.C = 0;
        }
    }
}
