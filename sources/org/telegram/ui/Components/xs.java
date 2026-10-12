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
public final class xs extends db {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public h71 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f32835a0;
    public final ArrayList f32836b0;
    public final long f32837c0;
    public final int f32838d0;
    public final int f32839e0;
    public final Runnable f32840f0;
    public boolean f32841g0;
    public final boolean f32842h0;
    public final ws f32843i0;
    public final ws f32844j0;
    public final ws f32845k0;
    public final ws f32846l0;
    public final boolean[] m0;
    public final boolean[] f32847n0;
    public final boolean f32848o0;
    public boolean f32849p0;
    public final long f32850q0;
    public TL_communities.ParticipantJoinedChats f32851r0;
    public int[] f32852s0;
    public boolean f32853t0;
    public boolean f32854u0;
    public final TLRPC.TL_chatBannedRights f32855v0;
    public final TLRPC.TL_chatBannedRights f32856w0;
    public final ArrayList f32857x0;
    public boolean f32858y0;
    public final boolean f32859z0;

    public xs(org.telegram.ui.ActionBar.m2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs.<init>(org.telegram.ui.ActionBar.m2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void Q(xs xsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            xsVar.f32852s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(xsVar.f32836b0).filter(new us(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            xsVar.f32853t0 = false;
            xsVar.f32854u0 = true;
            xsVar.P();
        }
    }

    public static void R(xs xsVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = xsVar.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = xsVar.resourcesProvider;
        int i10 = xsVar.currentAccount;
        long j3 = xsVar.f32850q0;
        ArrayList<Long> arrayList = xsVar.f32851r0.joined_chat_ids;
        boolean z11 = false;
        ts tsVar = new ts(xsVar, 0);
        Pattern pattern = g5.f26278a;
        LinearLayout e7 = org.telegram.messenger.am.e(context2, 1);
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, c6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j3)));
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
                ai.x7 x7Var = new ai.x7(context2, c6Var, z11);
                int i12 = size;
                ((TextView) x7Var.f1909b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) x7Var.f1910c;
                if (chatFull != null) {
                    context = context2;
                    z10 = false;
                    charSequence = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]);
                } else {
                    context = context2;
                    z10 = false;
                    charSequence = null;
                }
                textView.setText(charSequence);
                ((y9) x7Var.d).e(chat, new j9(chat));
                x7Var.setBackground(org.telegram.ui.ActionBar.h6.L0(z10));
                x7Var.setOnClickListener(new org.telegram.ui.jo(a2VarArr, tsVar, longValue, 2));
                e7.addView(x7Var, w7.w5.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = z10;
            }
        }
        a2VarArr[z11 ? 1 : 0] = a2Var;
        a2Var.show();
    }

    @Override
    public final CharSequence A() {
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
        ArrayList arrayList = this.f32836b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f32852s0 != null && this.f32854u0) {
            int i11 = 0;
            while (true) {
                ws wsVar = this.f32844j0;
                if (i11 >= wsVar.f32543g) {
                    break;
                }
                if (wsVar.d[i11] && ((zArr = wsVar.f32541e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) wsVar.f32540c.get(i11);
                    iArr[0] = iArr[0] + this.f32852s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }

    public final boolean T() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f32855v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void U(ArrayList arrayList, ws wsVar) {
        boolean z10;
        boolean c10 = wsVar.c();
        int i10 = wsVar.f32543g;
        int i11 = wsVar.f32538a;
        if (c10) {
            boolean z11 = false;
            if (!wsVar.b()) {
                u61 y3 = u61.y(i11, wsVar.f32539b);
                if (wsVar.f32544i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = wsVar.f32539b;
            int i12 = wsVar.f32544i;
            if (i12 <= 0) {
                if (wsVar.f32541e != null) {
                    i12 = wsVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            u61 u61Var = new u61(36);
            u61Var.d = i11;
            u61Var.f31071l = str;
            u61Var.f31074o = valueOf;
            if (wsVar.f32544i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u61Var.K(z10);
            u61Var.f31066f = wsVar.f32542f;
            u61Var.D = new org.telegram.ui.wf(28, this, wsVar);
            arrayList.add(u61Var);
            if (!wsVar.f32542f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = wsVar.f32541e;
                    if (zArr == null || zArr[i13]) {
                        u61 u61Var2 = new u61(37);
                        u61Var2.d = (i11 << 24) | i13;
                        u61Var2.G = (TLObject) wsVar.f32540c.get(i13);
                        u61Var2.K(wsVar.d[i13]);
                        u61Var2.f31068i = 1;
                        arrayList.add(u61Var2);
                    }
                }
            }
        }
    }

    public final void V() {
        if (this.f32854u0) {
            P();
        } else if (!this.f32853t0) {
            this.f32853t0 = true;
            ws wsVar = this.f32844j0;
            int i10 = wsVar.f32543g;
            this.f32852s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < wsVar.f32543g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f19912q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) wsVar.f32540c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new ai.ab(this, inputPeer, i11, iArr, 4));
            }
        }
    }

    public final void W() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f32841g0;
        boolean z13 = false;
        ws wsVar = this.f32846l0;
        if (z12 && wsVar.c()) {
            if (wsVar.f32544i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f32841g0 && wsVar.c() && wsVar.f32544i == 0) {
            wsVar.d();
        } else if (!this.f32841g0 && wsVar.c()) {
            boolean z14 = this.E0;
            if (wsVar.f32544i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                wsVar.d();
            }
        }
        if (!this.f32841g0 && wsVar.c()) {
            if (wsVar.f32544i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void X(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs.X(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f32843i0.a());
        edit.putBoolean("delete_deleteAll", this.f32844j0.a());
        if (!this.f32841g0 && this.f32846l0.a()) {
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
        wm0 wm0Var = this.d;
        rect.set(0, 0, wm0Var.getMeasuredWidth(), wm0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        wm0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        sc.e();
    }

    @Override
    public final boolean v(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.b2);
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(wm0Var, getContext(), this.currentAccount, this.f25289n.getClassGuid(), true, new qs(this, 0), this.resourcesProvider);
        this.X = h71Var;
        h71Var.f26679r = false;
        return h71Var;
    }
}
