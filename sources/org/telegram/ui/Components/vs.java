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
public final class vs extends eb {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public c71 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f32429a0;
    public final ArrayList f32430b0;
    public final long f32431c0;
    public final int f32432d0;
    public final int f32433e0;
    public final Runnable f32434f0;
    public boolean f32435g0;
    public final boolean f32436h0;
    public final us f32437i0;
    public final us f32438j0;
    public final us f32439k0;
    public final us f32440l0;
    public final boolean[] m0;
    public final boolean[] f32441n0;
    public final boolean f32442o0;
    public boolean f32443p0;
    public final long f32444q0;
    public TL_communities.ParticipantJoinedChats f32445r0;
    public int[] f32446s0;
    public boolean f32447t0;
    public boolean f32448u0;
    public final TLRPC.TL_chatBannedRights f32449v0;
    public final TLRPC.TL_chatBannedRights f32450w0;
    public final ArrayList f32451x0;
    public boolean f32452y0;
    public final boolean f32453z0;

    public vs(org.telegram.ui.ActionBar.n2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vs.<init>(org.telegram.ui.ActionBar.n2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void Q(vs vsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            vsVar.f32446s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(vsVar.f32430b0).filter(new ss(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            vsVar.f32447t0 = false;
            vsVar.f32448u0 = true;
            vsVar.P();
        }
    }

    public static void R(vs vsVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = vsVar.getContext();
        org.telegram.ui.ActionBar.e6 e6Var = vsVar.resourcesProvider;
        int i10 = vsVar.currentAccount;
        long j3 = vsVar.f32444q0;
        ArrayList<Long> arrayList = vsVar.f32445r0.joined_chat_ids;
        boolean z11 = false;
        rs rsVar = new rs(vsVar, 0);
        Pattern pattern = g5.f26593a;
        LinearLayout e7 = org.telegram.messenger.bi.e(context2, 1);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, e6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
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
                x7Var.setOnClickListener(new org.telegram.ui.fo(b2VarArr, rsVar, longValue, 2));
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
        ArrayList arrayList = this.f32430b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f32446s0 != null && this.f32448u0) {
            int i11 = 0;
            while (true) {
                us usVar = this.f32438j0;
                if (i11 >= usVar.f31606g) {
                    break;
                }
                if (usVar.d[i11] && ((zArr = usVar.f31604e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) usVar.f31603c.get(i11);
                    iArr[0] = iArr[0] + this.f32446s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }

    public final boolean T() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f32449v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void U(ArrayList arrayList, us usVar) {
        boolean z10;
        boolean c10 = usVar.c();
        int i10 = usVar.f31606g;
        int i11 = usVar.f31601a;
        if (c10) {
            boolean z11 = false;
            if (!usVar.b()) {
                p61 y3 = p61.y(i11, usVar.f31602b);
                if (usVar.f31607i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = usVar.f31602b;
            int i12 = usVar.f31607i;
            if (i12 <= 0) {
                if (usVar.f31604e != null) {
                    i12 = usVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            p61 p61Var = new p61(36);
            p61Var.d = i11;
            p61Var.f29734l = str;
            p61Var.f29737o = valueOf;
            if (usVar.f31607i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p61Var.K(z10);
            p61Var.f29729f = usVar.f31605f;
            p61Var.D = new org.telegram.ui.sf(28, this, usVar);
            arrayList.add(p61Var);
            if (!usVar.f31605f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = usVar.f31604e;
                    if (zArr == null || zArr[i13]) {
                        p61 p61Var2 = new p61(37);
                        p61Var2.d = (i11 << 24) | i13;
                        p61Var2.G = (TLObject) usVar.f31603c.get(i13);
                        p61Var2.K(usVar.d[i13]);
                        p61Var2.f29731i = 1;
                        arrayList.add(p61Var2);
                    }
                }
            }
        }
    }

    public final void V() {
        if (this.f32448u0) {
            P();
        } else if (!this.f32447t0) {
            this.f32447t0 = true;
            us usVar = this.f32438j0;
            int i10 = usVar.f31606g;
            this.f32446s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < usVar.f31606g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f20147q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) usVar.f31603c.get(i11));
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
        boolean z12 = this.f32435g0;
        boolean z13 = false;
        us usVar = this.f32440l0;
        if (z12 && usVar.c()) {
            if (usVar.f31607i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f32435g0 && usVar.c() && usVar.f31607i == 0) {
            usVar.d();
        } else if (!this.f32435g0 && usVar.c()) {
            boolean z14 = this.E0;
            if (usVar.f31607i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                usVar.d();
            }
        }
        if (!this.f32435g0 && usVar.c()) {
            if (usVar.f31607i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void X(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vs.X(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f32437i0.a());
        edit.putBoolean("delete_deleteAll", this.f32438j0.a());
        if (!this.f32435g0 && this.f32440l0.a()) {
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
        qm0 qm0Var = this.d;
        rect.set(0, 0, qm0Var.getMeasuredWidth(), qm0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        qm0Var.setClipBounds(rect);
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
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(qm0Var, getContext(), this.currentAccount, this.f26025n.getClassGuid(), true, new os(this, 0), this.resourcesProvider);
        this.X = c71Var;
        c71Var.f25280r = false;
        return c71Var;
    }
}
