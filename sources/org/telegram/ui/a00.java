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
public final class a00 extends org.telegram.ui.Components.bb {
    public final MessagesController.DialogFilter X;
    public final ArrayList Y;
    public final FrameLayout Z;
    public yz f35229a0;
    public final TextView f35230b0;
    public final ArrayList f35231c0;
    public final ArrayList f35232d0;

    public a00(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(n2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.Y = arrayList2;
        this.f35231c0 = new ArrayList();
        this.f35232d0 = new ArrayList();
        this.X = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        V(false);
        this.e.setTitle(S(null));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21058h5, false));
        TextView textView = new TextView(getContext());
        this.f35230b0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 22));
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i10 = d.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.containerView.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Z = frameLayout;
        this.containerView.addView(frameLayout, w7.z5.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        U();
    }

    public static void T(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, dz dzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f17799id;
        n2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new ai.d0(n2Var, dialogFilter, dzVar, currentTimeMillis, 4));
    }

    @Override
    public final CharSequence A() {
        return S(null);
    }

    @Override
    public final void G(org.telegram.ui.Components.kw0 kw0Var) {
        org.telegram.ui.Components.im0 im0Var = this.d;
        im0Var.setOverScrollMode(2);
        im0Var.setOnItemClickListener(new i(this, 11));
        s4.k kVar = new s4.k();
        kVar.f45946m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.n(350L);
        im0Var.setItemAnimator(kVar);
    }

    public final void R() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.n2 n2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            dialogFilter = this.X;
            int size = dialogFilter.alwaysShow.size();
            n2Var = this.f24897n;
            if (i10 >= size) {
                break;
            }
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && n00.g0(n2Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(n2Var.getMessagesController().getInputPeer(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            n2Var.presentFragment(new lz(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f17799id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        n2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new m(this, 7));
    }

    public final CharSequence S(wh.n nVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        MessagesController.DialogFilter dialogFilter = this.X;
        if (dialogFilter != null) {
            if (nVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = nVar.getPaint().getFontMetricsInt();
            }
            obj = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        } else {
            obj = "";
        }
        return LocaleController.formatSpannable(R.string.FolderLinkShareTitle2, obj);
    }

    public final void U() {
        int i10;
        int i11;
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f35230b0.setVisibility(i10);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (arrayList.isEmpty()) {
            i11 = AndroidUtilities.dp(68.0f);
        } else {
            i11 = 0;
        }
        this.d.setPadding(dp, 0, dp2, i11);
    }

    public final void V(boolean z10) {
        ArrayList arrayList = this.f35231c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f35232d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new pg.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.Y;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(e00.d(null));
            arrayList2.add(new pg.a(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ?? aVar2 = new pg.a(7, false);
                aVar2.f36473m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                arrayList2.add(aVar2);
            }
        }
        yz yzVar = this.f35229a0;
        if (yzVar != null) {
            if (z10) {
                yzVar.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.hm0 x(org.telegram.ui.Components.im0 im0Var) {
        yz yzVar = new yz(this);
        this.f35229a0 = yzVar;
        return yzVar;
    }
}
