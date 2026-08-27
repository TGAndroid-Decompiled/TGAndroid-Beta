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

public final class d00 extends org.telegram.ui.Components.qa {
    public final MessagesController.DialogFilter T;
    public final ArrayList U;
    public final FrameLayout V;
    public b00 W;
    public final TextView X;
    public final ArrayList Y;
    public final ArrayList Z;

    public d00(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(n2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.U = arrayList2;
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.T = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        U(false);
        this.f31853e.setTitle(R(null));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
        TextView textView = new TextView(getContext());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 22));
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i10 = layoutParamsD.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        layoutParamsD.leftMargin = i10 + i11;
        layoutParamsD.rightMargin += i11;
        this.containerView.addView(textView, layoutParamsD);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.V = frameLayout;
        this.containerView.addView(frameLayout, h7.z5.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        T();
    }

    public static void S(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, r00 r00Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19622id;
        n2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new hh.w(n2Var, dialogFilter, r00Var, jCurrentTimeMillis, 8));
    }

    @Override
    public final void G(org.telegram.ui.Components.zu0 zu0Var) {
        org.telegram.ui.Components.zk0 zk0Var = this.d;
        zk0Var.setOverScrollMode(2);
        zk0Var.setOnItemClickListener(new i(this, 10));
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.n(350L);
        zk0Var.setItemAnimator(lVar);
    }

    public final void Q() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.n2 n2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            dialogFilter = this.T;
            int size = dialogFilter.alwaysShow.size();
            n2Var = this.f31855n;
            if (i10 >= size) {
                break;
            }
            long jLongValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (jLongValue < 0 && q00.g0(n2Var.getMessagesController().getChat(Long.valueOf(-jLongValue)))) {
                arrayList.add(n2Var.getMessagesController().getInputPeer(jLongValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            n2Var.presentFragment(new oz(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19622id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        n2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new n(this, 7));
    }

    public final CharSequence R(eh.s sVar) {
        Object objReplaceAnimatedEmoji;
        MessagesController.DialogFilter dialogFilter = this.T;
        if (dialogFilter != null) {
            Paint.FontMetricsInt fontMetricsInt = sVar == null ? null : sVar.getPaint().getFontMetricsInt();
            objReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        } else {
            objReplaceAnimatedEmoji = "";
        }
        return LocaleController.formatSpannable(R.string.FolderLinkShareTitle2, objReplaceAnimatedEmoji);
    }

    public final void T() {
        ArrayList arrayList = this.U;
        this.X.setVisibility(arrayList.isEmpty() ? 0 : 8);
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), arrayList.isEmpty() ? AndroidUtilities.dp(68.0f) : 0);
    }

    public final void U(boolean z10) {
        ArrayList arrayList = this.Y;
        arrayList.clear();
        ArrayList arrayList2 = this.Z;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        h00 h00Var = new h00(0, false);
        h00Var.d = null;
        arrayList2.add(h00Var);
        ArrayList arrayList3 = this.U;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(h00.d(null));
            arrayList2.add(new h00(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                h00 h00Var2 = new h00(7, false);
                h00Var2.f38651m = tL_exportedChatlistInvite;
                arrayList2.add(h00Var2);
            }
        }
        b00 b00Var = this.W;
        if (b00Var != null) {
            if (z10) {
                b00Var.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        b00 b00Var = new b00(this);
        this.W = b00Var;
        return b00Var;
    }

    @Override
    public final CharSequence z() {
        return R(null);
    }
}
