package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class c00 extends org.telegram.ui.Components.xa {
    public final MessagesController.DialogFilter T;
    public final ArrayList U;
    public final FrameLayout V;
    public a00 W;
    public final TextView X;
    public final ArrayList Y;
    public final ArrayList Z;

    public c00(org.telegram.ui.ActionBar.o2 o2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(o2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.U = arrayList2;
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.T = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        U(false);
        this.f34660e.setTitle(R(null));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
        TextView textView = new TextView(getContext());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 22));
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i10 = d.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.containerView.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.V = frameLayout;
        this.containerView.addView(frameLayout, i7.f6.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        T();
    }

    public static void S(org.telegram.ui.ActionBar.o2 o2Var, MessagesController.DialogFilter dialogFilter, q00 q00Var) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19620id;
        o2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new jh.v(o2Var, dialogFilter, q00Var, currentTimeMillis, 8));
    }

    @Override
    public final void F(org.telegram.ui.Components.hv0 hv0Var) {
        org.telegram.ui.Components.jl0 jl0Var = this.d;
        jl0Var.setOverScrollMode(2);
        jl0Var.setOnItemClickListener(new j(this, 10));
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.n(350L);
        jl0Var.setItemAnimator(lVar);
    }

    public final void Q() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.o2 o2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            dialogFilter = this.T;
            int size = dialogFilter.alwaysShow.size();
            o2Var = this.f34662n;
            if (i10 >= size) {
                break;
            }
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && p00.g0(o2Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(o2Var.getMessagesController().getInputPeer(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            o2Var.presentFragment(new nz(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19620id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        o2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new o(this, 7));
    }

    public final CharSequence R(gh.s sVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        MessagesController.DialogFilter dialogFilter = this.T;
        if (dialogFilter != null) {
            if (sVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = sVar.getPaint().getFontMetricsInt();
            }
            obj = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        } else {
            obj = "";
        }
        return LocaleController.formatSpannable(R.string.FolderLinkShareTitle2, obj);
    }

    public final void T() {
        int i10;
        int i11;
        ArrayList arrayList = this.U;
        if (arrayList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.X.setVisibility(i10);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (arrayList.isEmpty()) {
            i11 = AndroidUtilities.dp(68.0f);
        } else {
            i11 = 0;
        }
        this.d.setPadding(dp, 0, dp2, i11);
    }

    public final void U(boolean z10) {
        ArrayList arrayList = this.Y;
        arrayList.clear();
        ArrayList arrayList2 = this.Z;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new zf.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.U;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(g00.d(null));
            arrayList2.add(new zf.a(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ?? aVar2 = new zf.a(7, false);
                aVar2.f38409m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                arrayList2.add(aVar2);
            }
        }
        a00 a00Var = this.W;
        if (a00Var != null) {
            if (z10) {
                a00Var.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        a00 a00Var = new a00(this);
        this.W = a00Var;
        return a00Var;
    }

    @Override
    public final CharSequence y() {
        return R(null);
    }
}
