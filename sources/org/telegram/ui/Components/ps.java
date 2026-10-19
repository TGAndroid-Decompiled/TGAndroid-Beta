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
public final class ps extends bb {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public t61 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f29376a0;
    public final ArrayList f29377b0;
    public final long f29378c0;
    public final int f29379d0;
    public final int f29380e0;
    public final Runnable f29381f0;
    public boolean f29382g0;
    public final boolean f29383h0;
    public final os f29384i0;
    public final os f29385j0;
    public final os f29386k0;
    public final os f29387l0;
    public final boolean[] m0;
    public final boolean[] f29388n0;
    public final boolean f29389o0;
    public boolean f29390p0;
    public final long f29391q0;
    public TL_communities.ParticipantJoinedChats f29392r0;
    public int[] f29393s0;
    public boolean f29394t0;
    public boolean f29395u0;
    public final TLRPC.TL_chatBannedRights f29396v0;
    public final TLRPC.TL_chatBannedRights f29397w0;
    public final ArrayList f29398x0;
    public boolean f29399y0;
    public final boolean f29400z0;

    public ps(org.telegram.ui.ActionBar.n2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps.<init>(org.telegram.ui.ActionBar.n2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void Q(ps psVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            psVar.f29393s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(psVar.f29377b0).filter(new ms(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            psVar.f29394t0 = false;
            psVar.f29395u0 = true;
            psVar.P();
        }
    }

    public static void R(ps psVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = psVar.getContext();
        org.telegram.ui.ActionBar.d6 d6Var = psVar.resourcesProvider;
        int i10 = psVar.currentAccount;
        long j10 = psVar.f29391q0;
        ArrayList<Long> arrayList = psVar.f29392r0.joined_chat_ids;
        boolean z11 = false;
        ls lsVar = new ls(psVar, 0);
        Pattern pattern = f5.f26101a;
        LinearLayout e = org.telegram.messenger.lk.e(context2, 1);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, d6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
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
                ai.w1 w1Var = new ai.w1(context2, d6Var, z11);
                int i12 = size;
                ((TextView) w1Var.f2350b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) w1Var.d;
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
                ((w9) w1Var.f2351c).e(chat, new h9(chat));
                w1Var.setBackground(org.telegram.ui.ActionBar.h6.L0(z10));
                w1Var.setOnClickListener(new ai.c4(b2VarArr, lsVar, longValue, 3));
                e.addView(w1Var, w7.z5.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = z10;
            }
        }
        b2VarArr[z11 ? 1 : 0] = b2Var;
        b2Var.show();
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
        ArrayList arrayList = this.f29377b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f29393s0 != null && this.f29395u0) {
            int i11 = 0;
            while (true) {
                os osVar = this.f29385j0;
                if (i11 >= osVar.f29087g) {
                    break;
                }
                if (osVar.d[i11] && ((zArr = osVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) osVar.f29085c.get(i11);
                    iArr[0] = iArr[0] + this.f29393s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }

    public final boolean T() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f29396v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void U(ArrayList arrayList, os osVar) {
        boolean z10;
        boolean c10 = osVar.c();
        int i10 = osVar.f29087g;
        int i11 = osVar.f29083a;
        if (c10) {
            boolean z11 = false;
            if (!osVar.b()) {
                g61 y3 = g61.y(i11, osVar.f29084b);
                if (osVar.f29088i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = osVar.f29084b;
            int i12 = osVar.f29088i;
            if (i12 <= 0) {
                if (osVar.e != null) {
                    i12 = osVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            g61 g61Var = new g61(36);
            g61Var.d = i11;
            g61Var.f26499l = str;
            g61Var.f26502o = valueOf;
            if (osVar.f29088i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g61Var.K(z10);
            g61Var.f26494f = osVar.f29086f;
            g61Var.D = new ca(8, this, osVar);
            arrayList.add(g61Var);
            if (!osVar.f29086f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = osVar.e;
                    if (zArr == null || zArr[i13]) {
                        g61 g61Var2 = new g61(37);
                        g61Var2.d = (i11 << 24) | i13;
                        g61Var2.G = (TLObject) osVar.f29085c.get(i13);
                        g61Var2.K(osVar.d[i13]);
                        g61Var2.f26496i = 1;
                        arrayList.add(g61Var2);
                    }
                }
            }
        }
    }

    public final void V() {
        if (this.f29395u0) {
            P();
        } else if (!this.f29394t0) {
            this.f29394t0 = true;
            os osVar = this.f29385j0;
            int i10 = osVar.f29087g;
            this.f29393s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < osVar.f29087g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f20384q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) osVar.f29085c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new ci.t8(this, inputPeer, i11, iArr, 4));
            }
        }
    }

    public final void W() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f29382g0;
        boolean z13 = false;
        os osVar = this.f29387l0;
        if (z12 && osVar.c()) {
            if (osVar.f29088i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f29382g0 && osVar.c() && osVar.f29088i == 0) {
            osVar.d();
        } else if (!this.f29382g0 && osVar.c()) {
            boolean z14 = this.E0;
            if (osVar.f29088i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                osVar.d();
            }
        }
        if (!this.f29382g0 && osVar.c()) {
            if (osVar.f29088i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void X(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps.X(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f29384i0.a());
        edit.putBoolean("delete_deleteAll", this.f29385j0.a());
        if (!this.f29382g0 && this.f29387l0.a()) {
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
        im0 im0Var = this.d;
        rect.set(0, 0, im0Var.getMeasuredWidth(), im0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        im0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        qc.e();
    }

    @Override
    public final boolean v(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.b2);
    }

    @Override
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(im0Var, getContext(), this.currentAccount, this.f24899n.getClassGuid(), true, new is(this, 0), this.resourcesProvider);
        this.X = t61Var;
        t61Var.f30438r = false;
        return t61Var;
    }
}
