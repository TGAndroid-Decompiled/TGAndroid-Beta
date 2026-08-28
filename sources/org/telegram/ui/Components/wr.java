package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wr extends sa {
    public static final int C0 = 0;
    public boolean A0;
    public float B0;
    public z41 T;
    public final TLRPC.Chat U;
    public final TLRPC.Chat V;
    public final boolean W;
    public final ArrayList X;
    public final long Y;
    public final int Z;
    public final int f34322a0;
    public final Runnable f34323b0;
    public boolean f34324c0;
    public final boolean f34325d0;
    public final vr f34326e0;
    public final vr f34327f0;
    public final vr f34328g0;
    public final vr f34329h0;
    public final boolean[] f34330i0;
    public final boolean[] f34331j0;
    public final boolean f34332k0;
    public boolean f34333l0;
    public final long m0;
    public TL_communities.ParticipantJoinedChats f34334n0;
    public int[] f34335o0;
    public boolean f34336p0;
    public boolean f34337q0;
    public final TLRPC.TL_chatBannedRights f34338r0;
    public final TLRPC.TL_chatBannedRights f34339s0;
    public final ArrayList f34340t0;
    public boolean f34341u0;
    public final boolean f34342v0;
    public final boolean f34343w0;
    public boolean f34344x0;
    public boolean f34345y0;
    public boolean f34346z0;

    public wr(org.telegram.ui.ActionBar.o2 r20, org.telegram.tgnet.TLRPC.Chat r21, java.util.ArrayList r22, java.util.ArrayList r23, org.telegram.tgnet.TLRPC.ChannelParticipant[] r24, long r25, int r27, int r28, boolean r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wr.<init>(org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void O(wr wrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i9, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            wrVar.f34335o0[i9] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(wrVar.X).filter(new tr(0, inputPeer)).count());
        }
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            wrVar.f34336p0 = false;
            wrVar.f34337q0 = true;
            wrVar.N();
        }
    }

    public static void P(wr wrVar) {
        Context context;
        boolean z10;
        String str;
        Context context2 = wrVar.getContext();
        org.telegram.ui.ActionBar.b6 b6Var = wrVar.resourcesProvider;
        int i9 = wrVar.currentAccount;
        long j10 = wrVar.m0;
        ArrayList<Long> arrayList = wrVar.f34334n0.joined_chat_ids;
        boolean z11 = false;
        sr srVar = new sr(wrVar, 0);
        Pattern pattern = y4.f34847a;
        LinearLayout f10 = org.telegram.messenger.ll.f(context2, 1);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, b6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i9, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(f10);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Long l10 = arrayList.get(i10);
            i10++;
            Long l11 = l10;
            long longValue = l11.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(l11);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(longValue);
            if (chat != null) {
                gh.h1 h1Var = new gh.h1(context2, b6Var, z11);
                int i11 = size;
                ((TextView) h1Var.f8192b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) h1Var.d;
                if (chatFull != null) {
                    context = context2;
                    z10 = false;
                    str = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]);
                } else {
                    context = context2;
                    z10 = false;
                    str = null;
                }
                textView.setText(str);
                ((o9) h1Var.f8193c).e(chat, new z8(chat));
                h1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(z10));
                h1Var.setOnClickListener(new gh.s2(c2VarArr, srVar, longValue, 3));
                f10.addView(h1Var, g7.e6.n(-1, -2));
                context2 = context;
                size = i11;
                z11 = false;
            }
        }
        c2VarArr[0] = c2Var;
        c2Var.show();
    }

    public final boolean R() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f34338r0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void S(ArrayList arrayList, vr vrVar) {
        boolean z10;
        boolean c10 = vrVar.c();
        int i9 = vrVar.f33982g;
        int i10 = vrVar.f33977a;
        if (c10) {
            boolean z11 = false;
            if (!vrVar.b()) {
                l41 y10 = l41.y(i10, vrVar.f33978b);
                if (vrVar.f33983i > 0) {
                    z11 = true;
                }
                y10.K(z11);
                arrayList.add(y10);
                return;
            }
            String str = vrVar.f33978b;
            int i11 = vrVar.f33983i;
            if (i11 <= 0) {
                if (vrVar.f33980e != null) {
                    i11 = vrVar.h;
                } else {
                    i11 = i9;
                }
            }
            String valueOf = String.valueOf(i11);
            l41 l41Var = new l41(36);
            l41Var.d = i10;
            l41Var.f30339l = str;
            l41Var.f30342o = valueOf;
            if (vrVar.f33983i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l41Var.K(z10);
            l41Var.f30334f = vrVar.f33981f;
            l41Var.D = new s2(15, this, vrVar);
            arrayList.add(l41Var);
            if (!vrVar.f33981f) {
                for (int i12 = 0; i12 < i9; i12++) {
                    boolean[] zArr = vrVar.f33980e;
                    if (zArr == null || zArr[i12]) {
                        l41 l41Var2 = new l41(37);
                        l41Var2.d = (i10 << 24) | i12;
                        l41Var2.G = (TLObject) vrVar.f33979c.get(i12);
                        l41Var2.K(vrVar.d[i12]);
                        l41Var2.f30336i = 1;
                        arrayList.add(l41Var2);
                    }
                }
            }
        }
    }

    public final void T() {
        if (this.f34337q0) {
            N();
        } else if (!this.f34336p0) {
            this.f34336p0 = true;
            vr vrVar = this.f34327f0;
            int i9 = vrVar.f33982g;
            this.f34335o0 = new int[i9];
            int[] iArr = {i9};
            for (int i10 = 0; i10 < vrVar.f33982g; i10++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.U);
                tL_messages_search.f22489q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) vrVar.f33979c.get(i10));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new ih.f8(this, inputPeer, i10, iArr, 4));
            }
        }
    }

    public final void U() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f34324c0;
        boolean z13 = false;
        vr vrVar = this.f34329h0;
        if (z12 && vrVar.c()) {
            if (vrVar.f33983i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.A0 = z11;
        }
        if (this.f34324c0 && vrVar.c() && vrVar.f33983i == 0) {
            vrVar.d();
        } else if (!this.f34324c0 && vrVar.c()) {
            boolean z14 = this.A0;
            if (vrVar.f33983i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                vrVar.d();
            }
        }
        if (!this.f34324c0 && vrVar.c()) {
            if (vrVar.f33983i > 0) {
                z13 = true;
            }
            this.A0 = z13;
        }
    }

    public final void V(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wr.V(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f34326e0.a());
        edit.putBoolean("delete_deleteAll", this.f34327f0.a());
        if (!this.f34324c0 && this.f34329h0.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        edit.putBoolean("delete_ban", z10);
        edit.apply();
        super.dismiss();
    }

    @Override
    public final void onContainerLayout(int i9, int i10, int i11, int i12) {
        super.onContainerLayout(i9, i10, i11, i12);
        Rect rect = AndroidUtilities.rectTmp2;
        wk0 wk0Var = this.d;
        rect.set(0, 0, wk0Var.getMeasuredWidth(), wk0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        wk0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        gc.e();
    }

    @Override
    public final boolean t(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, this.f32410n.getClassGuid(), true, new or(this, 0), this.resourcesProvider);
        this.T = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        int i9;
        boolean[] zArr;
        if (this.f34343w0) {
            if (this.f34345y0) {
                return LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll);
            }
            if (this.f34346z0) {
                return LocaleController.getString(R.string.DeleteReactionOptionsTitleAll);
            }
            return LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            i9 = arrayList.size();
        } else {
            i9 = 0;
        }
        int[] iArr = {i9};
        if (this.f34335o0 != null && this.f34337q0) {
            int i10 = 0;
            while (true) {
                vr vrVar = this.f34327f0;
                if (i10 >= vrVar.f33982g) {
                    break;
                }
                if (vrVar.d[i10] && ((zArr = vrVar.f33980e) == null || zArr[i10])) {
                    TLObject tLObject = (TLObject) vrVar.f33979c.get(i10);
                    iArr[0] = iArr[0] + this.f34335o0[i10];
                }
                i10++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
