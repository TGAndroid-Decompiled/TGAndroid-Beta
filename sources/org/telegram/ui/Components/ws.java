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
public final class ws extends eb {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public d71 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f32733a0;
    public final ArrayList f32734b0;
    public final long f32735c0;
    public final int f32736d0;
    public final int f32737e0;
    public final Runnable f32738f0;
    public boolean f32739g0;
    public final boolean f32740h0;
    public final vs f32741i0;
    public final vs f32742j0;
    public final vs f32743k0;
    public final vs f32744l0;
    public final boolean[] m0;
    public final boolean[] f32745n0;
    public final boolean f32746o0;
    public boolean f32747p0;
    public final long f32748q0;
    public TL_communities.ParticipantJoinedChats f32749r0;
    public int[] f32750s0;
    public boolean f32751t0;
    public boolean f32752u0;
    public final TLRPC.TL_chatBannedRights f32753v0;
    public final TLRPC.TL_chatBannedRights f32754w0;
    public final ArrayList f32755x0;
    public boolean f32756y0;
    public final boolean f32757z0;

    public ws(org.telegram.ui.ActionBar.n2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws.<init>(org.telegram.ui.ActionBar.n2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void Q(ws wsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            wsVar.f32750s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(wsVar.f32734b0).filter(new ts(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            wsVar.f32751t0 = false;
            wsVar.f32752u0 = true;
            wsVar.P();
        }
    }

    public static void R(ws wsVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = wsVar.getContext();
        org.telegram.ui.ActionBar.e6 e6Var = wsVar.resourcesProvider;
        int i10 = wsVar.currentAccount;
        long j3 = wsVar.f32748q0;
        ArrayList<Long> arrayList = wsVar.f32749r0.joined_chat_ids;
        boolean z11 = false;
        ss ssVar = new ss(wsVar, 0);
        Pattern pattern = g5.f26609a;
        LinearLayout e7 = org.telegram.messenger.bi.e(context2, 1);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, e6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
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
                ai.x7 x7Var = new ai.x7(context2, e6Var, z11);
                int i12 = size;
                ((TextView) x7Var.f1911b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) x7Var.f1912c;
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
                x7Var.setBackground(org.telegram.ui.ActionBar.i6.L0(z10));
                x7Var.setOnClickListener(new org.telegram.ui.fo(b2VarArr, ssVar, longValue, 2));
                e7.addView(x7Var, w7.x5.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = z10;
            }
        }
        b2VarArr[z11 ? 1 : 0] = b2Var;
        b2Var.show();
    }

    @Override
    public final CharSequence B() {
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
        ArrayList arrayList = this.f32734b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f32750s0 != null && this.f32752u0) {
            int i11 = 0;
            while (true) {
                vs vsVar = this.f32742j0;
                if (i11 >= vsVar.f32500g) {
                    break;
                }
                if (vsVar.d[i11] && ((zArr = vsVar.f32498e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) vsVar.f32497c.get(i11);
                    iArr[0] = iArr[0] + this.f32750s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }

    public final boolean T() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f32753v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void U(ArrayList arrayList, vs vsVar) {
        boolean z10;
        boolean c10 = vsVar.c();
        int i10 = vsVar.f32500g;
        int i11 = vsVar.f32495a;
        if (c10) {
            boolean z11 = false;
            if (!vsVar.b()) {
                q61 y3 = q61.y(i11, vsVar.f32496b);
                if (vsVar.f32501i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = vsVar.f32496b;
            int i12 = vsVar.f32501i;
            if (i12 <= 0) {
                if (vsVar.f32498e != null) {
                    i12 = vsVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            q61 q61Var = new q61(36);
            q61Var.d = i11;
            q61Var.f30063l = str;
            q61Var.f30066o = valueOf;
            if (vsVar.f32501i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q61Var.K(z10);
            q61Var.f30058f = vsVar.f32499f;
            q61Var.D = new org.telegram.ui.sf(28, this, vsVar);
            arrayList.add(q61Var);
            if (!vsVar.f32499f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = vsVar.f32498e;
                    if (zArr == null || zArr[i13]) {
                        q61 q61Var2 = new q61(37);
                        q61Var2.d = (i11 << 24) | i13;
                        q61Var2.G = (TLObject) vsVar.f32497c.get(i13);
                        q61Var2.K(vsVar.d[i13]);
                        q61Var2.f30060i = 1;
                        arrayList.add(q61Var2);
                    }
                }
            }
        }
    }

    public final void V() {
        if (this.f32752u0) {
            P();
        } else if (!this.f32751t0) {
            this.f32751t0 = true;
            vs vsVar = this.f32742j0;
            int i10 = vsVar.f32500g;
            this.f32750s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < vsVar.f32500g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f20151q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) vsVar.f32497c.get(i11));
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
        boolean z12 = this.f32739g0;
        boolean z13 = false;
        vs vsVar = this.f32744l0;
        if (z12 && vsVar.c()) {
            if (vsVar.f32501i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f32739g0 && vsVar.c() && vsVar.f32501i == 0) {
            vsVar.d();
        } else if (!this.f32739g0 && vsVar.c()) {
            boolean z14 = this.E0;
            if (vsVar.f32501i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                vsVar.d();
            }
        }
        if (!this.f32739g0 && vsVar.c()) {
            if (vsVar.f32501i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void X(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws.X(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f32741i0.a());
        edit.putBoolean("delete_deleteAll", this.f32742j0.a());
        if (!this.f32739g0 && this.f32744l0.a()) {
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
        rm0 rm0Var = this.d;
        rect.set(0, 0, rm0Var.getMeasuredWidth(), rm0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        rm0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        tc.e();
    }

    @Override
    public final boolean v(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.b2);
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        d71 d71Var = new d71(rm0Var, getContext(), this.currentAccount, this.f25985n.getClassGuid(), true, new ps(this, 0), this.resourcesProvider);
        this.X = d71Var;
        d71Var.f25587r = false;
        return d71Var;
    }
}
