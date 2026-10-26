package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class b00 extends org.telegram.ui.Components.bb {
    public int X;
    public final MessagesController.DialogFilter Y;
    public final ArrayList Z;
    public final FrameLayout f37931a0;
    public zz f37932b0;
    public final TextView f37933c0;
    public final ArrayList f37934d0;
    public final ArrayList f37935e0;

    public b00(org.telegram.ui.ActionBar.r2 r2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(r2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.Z = arrayList2;
        this.f37934d0 = new ArrayList();
        this.f37935e0 = new ArrayList();
        this.Y = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        U(false);
        this.e.setTitle(R(null));
        fixNavigationBar(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23427h5, false));
        this.X = this.navBarColor;
        TextView textView = new TextView(getContext());
        this.f37933c0 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 22));
        FrameLayout.LayoutParams h = org.telegram.ui.Components.gb1.h(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i10 = h.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        h.leftMargin = i10 + i11;
        h.rightMargin += i11;
        this.containerView.addView(textView, h);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f37931a0 = frameLayout;
        this.containerView.addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        T();
    }

    public static void S(org.telegram.ui.ActionBar.r2 r2Var, MessagesController.DialogFilter dialogFilter, p00 p00Var) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19549id;
        r2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new bi.e0(r2Var, dialogFilter, p00Var, currentTimeMillis, 4));
    }

    @Override
    public final void G(org.telegram.ui.Components.vw0 vw0Var) {
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        mm0Var.setOverScrollMode(2);
        mm0Var.setOnItemClickListener(new h(this, 11));
        s4.l lVar = new s4.l();
        lVar.f47763m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.n(350L);
        mm0Var.setItemAnimator(lVar);
    }

    public final void Q() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.r2 r2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            dialogFilter = this.Y;
            int size = dialogFilter.alwaysShow.size();
            r2Var = this.f26811n;
            if (i10 >= size) {
                break;
            }
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && o00.i0(r2Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(r2Var.getMessagesController().getInputPeer(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            r2Var.presentFragment(new lz(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19549id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        r2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new l(this, 7));
    }

    public final CharSequence R(xh.n nVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        MessagesController.DialogFilter dialogFilter = this.Y;
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

    public final void T() {
        int i10;
        int i11;
        ArrayList arrayList = this.Z;
        if (arrayList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f37933c0.setVisibility(i10);
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
        ArrayList arrayList = this.f37934d0;
        arrayList.clear();
        ArrayList arrayList2 = this.f37935e0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new qg.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.Z;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(f00.d(null));
            arrayList2.add(new qg.a(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ?? aVar2 = new qg.a(7, false);
                aVar2.f39235m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                arrayList2.add(aVar2);
            }
        }
        zz zzVar = this.f37932b0;
        if (zzVar != null) {
            if (z10) {
                zzVar.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int x02;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor == this.X && (x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23427h5, false)) != this.navBarColor) {
                fixNavigationBar(x02);
                this.X = this.navBarColor;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final org.telegram.ui.Components.lm0 v(org.telegram.ui.Components.mm0 mm0Var) {
        zz zzVar = new zz(this);
        this.f37932b0 = zzVar;
        return zzVar;
    }

    @Override
    public final CharSequence y() {
        return R(null);
    }
}
