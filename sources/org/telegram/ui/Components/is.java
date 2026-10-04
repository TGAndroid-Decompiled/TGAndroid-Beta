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
public final class is extends cb {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public u61 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f27471a0;
    public final ArrayList f27472b0;
    public final long f27473c0;
    public final int f27474d0;
    public final int f27475e0;
    public final Runnable f27476f0;
    public boolean f27477g0;
    public final boolean f27478h0;
    public final hs f27479i0;
    public final hs f27480j0;
    public final hs f27481k0;
    public final hs f27482l0;
    public final boolean[] m0;
    public final boolean[] f27483n0;
    public final boolean f27484o0;
    public boolean f27485p0;
    public final long f27486q0;
    public TL_communities.ParticipantJoinedChats f27487r0;
    public int[] f27488s0;
    public boolean f27489t0;
    public boolean f27490u0;
    public final TLRPC.TL_chatBannedRights f27491v0;
    public final TLRPC.TL_chatBannedRights f27492w0;
    public final ArrayList f27493x0;
    public boolean f27494y0;
    public final boolean f27495z0;

    public is(org.telegram.ui.ActionBar.n2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.is.<init>(org.telegram.ui.ActionBar.n2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void N(is isVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            isVar.f27488s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(isVar.f27472b0).filter(new fs(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            isVar.f27489t0 = false;
            isVar.f27490u0 = true;
            isVar.M();
        }
    }

    public static void O(is isVar) {
        Context context;
        boolean z10;
        String str;
        Context context2 = isVar.getContext();
        org.telegram.ui.ActionBar.d6 d6Var = isVar.resourcesProvider;
        int i10 = isVar.currentAccount;
        long j3 = isVar.f27486q0;
        ArrayList<Long> arrayList = isVar.f27487r0.joined_chat_ids;
        boolean z11 = false;
        es esVar = new es(isVar, 0);
        Pattern pattern = e5.f25919a;
        LinearLayout e7 = org.telegram.messenger.bi.e(context2, 1);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, d6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j3)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(e7);
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
                ((TextView) w7Var.f1805b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) w7Var.f1806c;
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
                w7Var.setBackground(org.telegram.ui.ActionBar.i6.K0(z10));
                w7Var.setOnClickListener(new org.telegram.ui.eo(b2VarArr, esVar, longValue, 2));
                e7.addView(w7Var, w7.z5.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = false;
            }
        }
        b2VarArr[0] = b2Var;
        b2Var.show();
    }

    public final boolean Q() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f27491v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void R(ArrayList arrayList, hs hsVar) {
        boolean z10;
        boolean c10 = hsVar.c();
        int i10 = hsVar.f27234g;
        int i11 = hsVar.f27229a;
        if (c10) {
            boolean z11 = false;
            if (!hsVar.b()) {
                g61 y3 = g61.y(i11, hsVar.f27230b);
                if (hsVar.f27235i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = hsVar.f27230b;
            int i12 = hsVar.f27235i;
            if (i12 <= 0) {
                if (hsVar.f27232e != null) {
                    i12 = hsVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            g61 g61Var = new g61(36);
            g61Var.d = i11;
            g61Var.f26674l = str;
            g61Var.f26677o = valueOf;
            if (hsVar.f27235i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g61Var.K(z10);
            g61Var.f26669f = hsVar.f27233f;
            g61Var.D = new org.telegram.ui.qf(28, this, hsVar);
            arrayList.add(g61Var);
            if (!hsVar.f27233f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = hsVar.f27232e;
                    if (zArr == null || zArr[i13]) {
                        g61 g61Var2 = new g61(37);
                        g61Var2.d = (i11 << 24) | i13;
                        g61Var2.G = (TLObject) hsVar.f27231c.get(i13);
                        g61Var2.K(hsVar.d[i13]);
                        g61Var2.f26671i = 1;
                        arrayList.add(g61Var2);
                    }
                }
            }
        }
    }

    public final void S() {
        if (this.f27490u0) {
            M();
        } else if (!this.f27489t0) {
            this.f27489t0 = true;
            hs hsVar = this.f27480j0;
            int i10 = hsVar.f27234g;
            this.f27488s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < hsVar.f27234g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f20151q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) hsVar.f27231c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new ai.za(this, inputPeer, i11, iArr, 4));
            }
        }
    }

    public final void T() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f27477g0;
        boolean z13 = false;
        hs hsVar = this.f27482l0;
        if (z12 && hsVar.c()) {
            if (hsVar.f27235i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f27477g0 && hsVar.c() && hsVar.f27235i == 0) {
            hsVar.d();
        } else if (!this.f27477g0 && hsVar.c()) {
            boolean z14 = this.E0;
            if (hsVar.f27235i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                hsVar.d();
            }
        }
        if (!this.f27477g0 && hsVar.c()) {
            if (hsVar.f27235i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void U(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.is.U(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f27479i0.a());
        edit.putBoolean("delete_deleteAll", this.f27480j0.a());
        if (!this.f27477g0 && this.f27482l0.a()) {
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
        zl0 zl0Var = this.d;
        rect.set(0, 0, zl0Var.getMeasuredWidth(), zl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        zl0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        rc.e();
    }

    @Override
    public final boolean t(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.b2);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(zl0Var, getContext(), this.currentAccount, this.f25309n.getClassGuid(), true, new bs(this, 0), this.resourcesProvider);
        this.X = u61Var;
        u61Var.f31313r = false;
        return u61Var;
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
        ArrayList arrayList = this.f27472b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f27488s0 != null && this.f27490u0) {
            int i11 = 0;
            while (true) {
                hs hsVar = this.f27480j0;
                if (i11 >= hsVar.f27234g) {
                    break;
                }
                if (hsVar.d[i11] && ((zArr = hsVar.f27232e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) hsVar.f27231c.get(i11);
                    iArr[0] = iArr[0] + this.f27488s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
