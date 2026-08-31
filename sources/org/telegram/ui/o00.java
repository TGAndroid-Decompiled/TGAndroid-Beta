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
public final class o00 extends org.telegram.ui.Components.sa {
    public final MessagesController.DialogFilter U;
    public final ArrayList V;
    public final FrameLayout W;
    public m00 X;
    public final TextView Y;
    public final ArrayList Z;
    public final ArrayList f39553a0;

    public o00(org.telegram.ui.ActionBar.p2 p2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(p2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.V = arrayList2;
        this.Z = new ArrayList();
        this.f39553a0 = new ArrayList();
        this.U = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        U(false);
        this.f31015e.setTitle(R(null));
        fixNavigationBar(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false));
        TextView textView = new TextView(getContext());
        this.Y = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 22));
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i10 = d.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.containerView.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.W = frameLayout;
        this.containerView.addView(frameLayout, k7.c6.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        T();
    }

    public static void S(org.telegram.ui.ActionBar.p2 p2Var, MessagesController.DialogFilter dialogFilter, c10 c10Var) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f18055id;
        p2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new mh.u(p2Var, dialogFilter, c10Var, currentTimeMillis, 8));
    }

    @Override
    public final void F(org.telegram.ui.Components.qv0 qv0Var) {
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        tl0Var.setOverScrollMode(2);
        tl0Var.setOnItemClickListener(new j(this, 10));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.n(350L);
        tl0Var.setItemAnimator(lVar);
    }

    public final void Q() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.p2 p2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            dialogFilter = this.U;
            int size = dialogFilter.alwaysShow.size();
            p2Var = this.f31017n;
            if (i10 >= size) {
                break;
            }
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && b10.g0(p2Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(p2Var.getMessagesController().getInputPeer(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            p2Var.presentFragment(new zz(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f18055id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        p2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new o(this, 7));
    }

    public final CharSequence R(jh.s sVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        MessagesController.DialogFilter dialogFilter = this.U;
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
        ArrayList arrayList = this.V;
        if (arrayList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.Y.setVisibility(i10);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (arrayList.isEmpty()) {
            i11 = AndroidUtilities.dp(68.0f);
        } else {
            i11 = 0;
        }
        this.d.setPadding(dp, 0, dp2, i11);
    }

    public final void U(boolean z4) {
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.f39553a0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? bVar = new cg.b(0, false);
        bVar.d = null;
        arrayList2.add(bVar);
        ArrayList arrayList3 = this.V;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(s00.d(null));
            arrayList2.add(new cg.b(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ?? bVar2 = new cg.b(7, false);
                bVar2.f41093m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                arrayList2.add(bVar2);
            }
        }
        m00 m00Var = this.X;
        if (m00Var != null) {
            if (z4) {
                m00Var.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.sl0 v(org.telegram.ui.Components.tl0 tl0Var) {
        m00 m00Var = new m00(this);
        this.X = m00Var;
        return m00Var;
    }

    @Override
    public final CharSequence y() {
        return R(null);
    }
}
