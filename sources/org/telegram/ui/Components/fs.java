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
public final class fs extends bb {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public l61 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f24204a0;
    public final ArrayList f24205b0;
    public final long f24206c0;
    public final int f24207d0;
    public final int f24208e0;
    public final Runnable f24209f0;
    public boolean f24210g0;
    public final boolean f24211h0;
    public final es f24212i0;
    public final es f24213j0;
    public final es f24214k0;
    public final es f24215l0;
    public final boolean[] m0;
    public final boolean[] f24216n0;
    public final boolean f24217o0;
    public boolean f24218p0;
    public final long f24219q0;
    public TL_communities.ParticipantJoinedChats f24220r0;
    public int[] f24221s0;
    public boolean f24222t0;
    public boolean f24223u0;
    public final TLRPC.TL_chatBannedRights f24224v0;
    public final TLRPC.TL_chatBannedRights f24225w0;
    public final ArrayList f24226x0;
    public boolean f24227y0;
    public final boolean f24228z0;

    public fs(org.telegram.ui.ActionBar.n2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fs.<init>(org.telegram.ui.ActionBar.n2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(fs fsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            fsVar.f24221s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(fsVar.f24205b0).filter(new cs(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            fsVar.f24222t0 = false;
            fsVar.f24223u0 = true;
            fsVar.O();
        }
    }

    public static void Q(fs fsVar) {
        Context context;
        boolean z10;
        String str;
        Context context2 = fsVar.getContext();
        org.telegram.ui.ActionBar.e6 e6Var = fsVar.resourcesProvider;
        int i10 = fsVar.currentAccount;
        long j3 = fsVar.f24219q0;
        ArrayList<Long> arrayList = fsVar.f24220r0.joined_chat_ids;
        boolean z11 = false;
        bs bsVar = new bs(fsVar, 0);
        Pattern pattern = e5.f23785a;
        LinearLayout e = org.telegram.messenger.wh.e(context2, 1);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, e6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j3)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(e);
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
                ai.v7 v7Var = new ai.v7(context2, e6Var, z11);
                int i12 = size;
                ((TextView) v7Var.f1614b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) v7Var.f1615c;
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
                ((w9) v7Var.d).e(chat, new h9(chat));
                v7Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z10));
                v7Var.setOnClickListener(new org.telegram.ui.fo(b2VarArr, bsVar, longValue, 2));
                e.addView(v7Var, w7.y5.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = false;
            }
        }
        b2VarArr[0] = b2Var;
        b2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f24224v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, es esVar) {
        boolean z10;
        boolean c10 = esVar.c();
        int i10 = esVar.f23960g;
        int i11 = esVar.f23956a;
        if (c10) {
            boolean z11 = false;
            if (!esVar.b()) {
                x51 y3 = x51.y(i11, esVar.f23957b);
                if (esVar.f23961i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = esVar.f23957b;
            int i12 = esVar.f23961i;
            if (i12 <= 0) {
                if (esVar.e != null) {
                    i12 = esVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            x51 x51Var = new x51(36);
            x51Var.d = i11;
            x51Var.f30248l = str;
            x51Var.f30251o = valueOf;
            if (esVar.f23961i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x51Var.K(z10);
            x51Var.f30243f = esVar.f23959f;
            x51Var.D = new org.telegram.ui.sf(28, this, esVar);
            arrayList.add(x51Var);
            if (!esVar.f23959f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = esVar.e;
                    if (zArr == null || zArr[i13]) {
                        x51 x51Var2 = new x51(37);
                        x51Var2.d = (i11 << 24) | i13;
                        x51Var2.G = (TLObject) esVar.f23958c.get(i13);
                        x51Var2.K(esVar.d[i13]);
                        x51Var2.f30245i = 1;
                        arrayList.add(x51Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f24223u0) {
            O();
        } else if (!this.f24222t0) {
            this.f24222t0 = true;
            es esVar = this.f24213j0;
            int i10 = esVar.f23960g;
            this.f24221s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < esVar.f23960g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f18405q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) esVar.f23958c.get(i11));
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
        boolean z12 = this.f24210g0;
        boolean z13 = false;
        es esVar = this.f24215l0;
        if (z12 && esVar.c()) {
            if (esVar.f23961i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f24210g0 && esVar.c() && esVar.f23961i == 0) {
            esVar.d();
        } else if (!this.f24210g0 && esVar.c()) {
            boolean z14 = this.E0;
            if (esVar.f23961i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                esVar.d();
            }
        }
        if (!this.f24210g0 && esVar.c()) {
            if (esVar.f23961i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void W(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fs.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f24212i0.a());
        edit.putBoolean("delete_deleteAll", this.f24213j0.a());
        if (!this.f24210g0 && this.f24215l0.a()) {
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
        l61 l61Var = new l61(wl0Var, getContext(), this.currentAccount, this.f22943n.getClassGuid(), true, new yr(this, 0), this.resourcesProvider);
        this.X = l61Var;
        l61Var.f26042r = false;
        return l61Var;
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
        ArrayList arrayList = this.f24205b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f24221s0 != null && this.f24223u0) {
            int i11 = 0;
            while (true) {
                es esVar = this.f24213j0;
                if (i11 >= esVar.f23960g) {
                    break;
                }
                if (esVar.d[i11] && ((zArr = esVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) esVar.f23958c.get(i11);
                    iArr[0] = iArr[0] + this.f24221s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
