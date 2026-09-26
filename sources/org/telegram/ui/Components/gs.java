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
public final class gs extends bb {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public j61 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f24503a0;
    public final ArrayList f24504b0;
    public final long f24505c0;
    public final int f24506d0;
    public final int f24507e0;
    public final Runnable f24508f0;
    public boolean f24509g0;
    public final boolean f24510h0;
    public final fs f24511i0;
    public final fs f24512j0;
    public final fs f24513k0;
    public final fs f24514l0;
    public final boolean[] m0;
    public final boolean[] f24515n0;
    public final boolean f24516o0;
    public boolean f24517p0;
    public final long f24518q0;
    public TL_communities.ParticipantJoinedChats f24519r0;
    public int[] f24520s0;
    public boolean f24521t0;
    public boolean f24522u0;
    public final TLRPC.TL_chatBannedRights f24523v0;
    public final TLRPC.TL_chatBannedRights f24524w0;
    public final ArrayList f24525x0;
    public boolean f24526y0;
    public final boolean f24527z0;

    public gs(org.telegram.ui.ActionBar.m2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gs.<init>(org.telegram.ui.ActionBar.m2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(gs gsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            gsVar.f24520s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(gsVar.f24504b0).filter(new ds(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            gsVar.f24521t0 = false;
            gsVar.f24522u0 = true;
            gsVar.O();
        }
    }

    public static void Q(gs gsVar) {
        Context context;
        boolean z10;
        String str;
        Context context2 = gsVar.getContext();
        org.telegram.ui.ActionBar.d6 d6Var = gsVar.resourcesProvider;
        int i10 = gsVar.currentAccount;
        long j3 = gsVar.f24518q0;
        ArrayList<Long> arrayList = gsVar.f24519r0.joined_chat_ids;
        boolean z11 = false;
        cs csVar = new cs(gsVar, 0);
        Pattern pattern = e5.f23836a;
        LinearLayout f7 = org.telegram.messenger.ok.f(context2, 1);
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, d6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j3)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(f7);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Long l4 = arrayList.get(i11);
            i11++;
            Long l10 = l4;
            long longValue = l10.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(l10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(longValue);
            if (chat != null) {
                ai.w7 w7Var = new ai.w7(context2, d6Var, z11);
                int i12 = size;
                ((TextView) w7Var.f1657b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) w7Var.f1658c;
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
                ((w9) w7Var.d).e(chat, new h9(chat));
                w7Var.setBackground(org.telegram.ui.ActionBar.h6.K0(z10));
                w7Var.setOnClickListener(new org.telegram.ui.bo(a2VarArr, csVar, longValue, 2));
                f7.addView(w7Var, w7.y5.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = false;
            }
        }
        a2VarArr[0] = a2Var;
        a2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f24523v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, fs fsVar) {
        boolean z10;
        boolean c10 = fsVar.c();
        int i10 = fsVar.f24267g;
        int i11 = fsVar.f24263a;
        if (c10) {
            boolean z11 = false;
            if (!fsVar.b()) {
                v51 y3 = v51.y(i11, fsVar.f24264b);
                if (fsVar.f24268i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = fsVar.f24264b;
            int i12 = fsVar.f24268i;
            if (i12 <= 0) {
                if (fsVar.e != null) {
                    i12 = fsVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            v51 v51Var = new v51(36);
            v51Var.d = i11;
            v51Var.f29048l = str;
            v51Var.f29051o = valueOf;
            if (fsVar.f24268i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            v51Var.K(z10);
            v51Var.f29043f = fsVar.f24266f;
            v51Var.D = new org.telegram.ui.pf(28, this, fsVar);
            arrayList.add(v51Var);
            if (!fsVar.f24266f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = fsVar.e;
                    if (zArr == null || zArr[i13]) {
                        v51 v51Var2 = new v51(37);
                        v51Var2.d = (i11 << 24) | i13;
                        v51Var2.G = (TLObject) fsVar.f24265c.get(i13);
                        v51Var2.K(fsVar.d[i13]);
                        v51Var2.f29045i = 1;
                        arrayList.add(v51Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f24522u0) {
            O();
        } else if (!this.f24521t0) {
            this.f24521t0 = true;
            fs fsVar = this.f24512j0;
            int i10 = fsVar.f24267g;
            this.f24520s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < fsVar.f24267g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f18444q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) fsVar.f24265c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new ai.za(this, inputPeer, i11, iArr, 4));
            }
        }
    }

    public final void V() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f24509g0;
        boolean z13 = false;
        fs fsVar = this.f24514l0;
        if (z12 && fsVar.c()) {
            if (fsVar.f24268i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f24509g0 && fsVar.c() && fsVar.f24268i == 0) {
            fsVar.d();
        } else if (!this.f24509g0 && fsVar.c()) {
            boolean z14 = this.E0;
            if (fsVar.f24268i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                fsVar.d();
            }
        }
        if (!this.f24509g0 && fsVar.c()) {
            if (fsVar.f24268i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void W(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gs.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f24511i0.a());
        edit.putBoolean("delete_deleteAll", this.f24512j0.a());
        if (!this.f24509g0 && this.f24514l0.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        edit.putBoolean("delete_ban", z10);
        edit.apply();
        super.dismiss();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Rect rect = AndroidUtilities.rectTmp2;
        wl0 wl0Var = this.d;
        rect.set(0, 0, wl0Var.getMeasuredWidth(), wl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        wl0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        qc.e();
    }

    @Override
    public final boolean t(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.b2);
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        j61 j61Var = new j61(wl0Var, getContext(), this.currentAccount, this.f22957n.getClassGuid(), true, new zr(this, 0), this.resourcesProvider);
        this.X = j61Var;
        j61Var.f25290r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        boolean[] zArr;
        if (this.A0) {
            if (this.C0) {
                return LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll);
            }
            if (this.D0) {
                return LocaleController.getString(R.string.DeleteReactionOptionsTitleAll);
            }
            return LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.f24504b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f24520s0 != null && this.f24522u0) {
            int i11 = 0;
            while (true) {
                fs fsVar = this.f24512j0;
                if (i11 >= fsVar.f24267g) {
                    break;
                }
                if (fsVar.d[i11] && ((zArr = fsVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) fsVar.f24265c.get(i11);
                    iArr[0] = iArr[0] + this.f24520s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
