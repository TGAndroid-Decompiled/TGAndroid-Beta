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
public final class fs extends za {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public x51 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f23987a0;
    public final ArrayList f23988b0;
    public final long f23989c0;
    public final int f23990d0;
    public final int f23991e0;
    public final Runnable f23992f0;
    public boolean f23993g0;
    public final boolean f23994h0;
    public final es f23995i0;
    public final es f23996j0;
    public final es f23997k0;
    public final es f23998l0;
    public final boolean[] m0;
    public final boolean[] f23999n0;
    public final boolean f24000o0;
    public boolean f24001p0;
    public final long f24002q0;
    public TL_communities.ParticipantJoinedChats f24003r0;
    public int[] f24004s0;
    public boolean f24005t0;
    public boolean f24006u0;
    public final TLRPC.TL_chatBannedRights f24007v0;
    public final TLRPC.TL_chatBannedRights f24008w0;
    public final ArrayList f24009x0;
    public boolean f24010y0;
    public final boolean f24011z0;

    public fs(org.telegram.ui.ActionBar.o2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fs.<init>(org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(fs fsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            fsVar.f24004s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(fsVar.f23988b0).filter(new cs(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            fsVar.f24005t0 = false;
            fsVar.f24006u0 = true;
            fsVar.O();
        }
    }

    public static void Q(fs fsVar) {
        Context context;
        boolean z10;
        String str;
        Context context2 = fsVar.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = fsVar.resourcesProvider;
        int i10 = fsVar.currentAccount;
        long j3 = fsVar.f24002q0;
        ArrayList<Long> arrayList = fsVar.f24003r0.joined_chat_ids;
        boolean z11 = false;
        bs bsVar = new bs(fsVar, 0);
        Pattern pattern = c5.f22934a;
        LinearLayout f7 = org.telegram.messenger.wl.f(context2, 1);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j3)));
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
                ai.v7 v7Var = new ai.v7(context2, f6Var, z11);
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
                ((u9) v7Var.d).e(chat, new f9(chat));
                v7Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z10));
                v7Var.setOnClickListener(new org.telegram.ui.ho(c2VarArr, bsVar, longValue, 2));
                f7.addView(v7Var, w7.x5.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = false;
            }
        }
        c2VarArr[0] = c2Var;
        c2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f24007v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, es esVar) {
        boolean z10;
        boolean c10 = esVar.c();
        int i10 = esVar.f23667g;
        int i11 = esVar.f23663a;
        if (c10) {
            boolean z11 = false;
            if (!esVar.b()) {
                j51 y3 = j51.y(i11, esVar.f23664b);
                if (esVar.f23668i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = esVar.f23664b;
            int i12 = esVar.f23668i;
            if (i12 <= 0) {
                if (esVar.e != null) {
                    i12 = esVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            j51 j51Var = new j51(36);
            j51Var.d = i11;
            j51Var.f25127l = str;
            j51Var.f25130o = valueOf;
            if (esVar.f23668i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j51Var.K(z10);
            j51Var.f25122f = esVar.f23666f;
            j51Var.D = new org.telegram.ui.tf(28, this, esVar);
            arrayList.add(j51Var);
            if (!esVar.f23666f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = esVar.e;
                    if (zArr == null || zArr[i13]) {
                        j51 j51Var2 = new j51(37);
                        j51Var2.d = (i11 << 24) | i13;
                        j51Var2.G = (TLObject) esVar.f23665c.get(i13);
                        j51Var2.K(esVar.d[i13]);
                        j51Var2.f25124i = 1;
                        arrayList.add(j51Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f24006u0) {
            O();
        } else if (!this.f24005t0) {
            this.f24005t0 = true;
            es esVar = this.f23996j0;
            int i10 = esVar.f23667g;
            this.f24004s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < esVar.f23667g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f18230q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) esVar.f23665c.get(i11));
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
        boolean z12 = this.f23993g0;
        boolean z13 = false;
        es esVar = this.f23998l0;
        if (z12 && esVar.c()) {
            if (esVar.f23668i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f23993g0 && esVar.c() && esVar.f23668i == 0) {
            esVar.d();
        } else if (!this.f23993g0 && esVar.c()) {
            boolean z14 = this.E0;
            if (esVar.f23668i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                esVar.d();
            }
        }
        if (!this.f23993g0 && esVar.c()) {
            if (esVar.f23668i > 0) {
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
        edit.putBoolean("delete_report", this.f23995i0.a());
        edit.putBoolean("delete_deleteAll", this.f23996j0.a());
        if (!this.f23993g0 && this.f23998l0.a()) {
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
        ml0 ml0Var = this.d;
        rect.set(0, 0, ml0Var.getMeasuredWidth(), ml0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        ml0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        oc.e();
    }

    @Override
    public final boolean t(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(ml0Var, getContext(), this.currentAccount, this.f30454n.getClassGuid(), true, new yr(this, 0), this.resourcesProvider);
        this.X = x51Var;
        x51Var.f29854r = false;
        return x51Var;
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
        ArrayList arrayList = this.f23988b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f24004s0 != null && this.f24006u0) {
            int i11 = 0;
            while (true) {
                es esVar = this.f23996j0;
                if (i11 >= esVar.f23667g) {
                    break;
                }
                if (esVar.d[i11] && ((zArr = esVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) esVar.f23665c.get(i11);
                    iArr[0] = iArr[0] + this.f24004s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
