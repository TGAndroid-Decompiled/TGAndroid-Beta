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
public final class ss extends db {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public z61 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f29185a0;
    public final ArrayList f29186b0;
    public final long f29187c0;
    public final int f29188d0;
    public final int f29189e0;
    public final Runnable f29190f0;
    public boolean f29191g0;
    public final boolean f29192h0;
    public final rs f29193i0;
    public final rs f29194j0;
    public final rs f29195k0;
    public final rs f29196l0;
    public final boolean[] m0;
    public final boolean[] f29197n0;
    public final boolean f29198o0;
    public boolean f29199p0;
    public final long f29200q0;
    public TL_communities.ParticipantJoinedChats f29201r0;
    public int[] f29202s0;
    public boolean f29203t0;
    public boolean f29204u0;
    public final TLRPC.TL_chatBannedRights f29205v0;
    public final TLRPC.TL_chatBannedRights f29206w0;
    public final ArrayList f29207x0;
    public boolean f29208y0;
    public final boolean f29209z0;

    public ss(org.telegram.ui.ActionBar.m2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ss.<init>(org.telegram.ui.ActionBar.m2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void Q(ss ssVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            ssVar.f29202s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(ssVar.f29186b0).filter(new ps(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            ssVar.f29203t0 = false;
            ssVar.f29204u0 = true;
            ssVar.P();
        }
    }

    public static void R(ss ssVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = ssVar.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = ssVar.resourcesProvider;
        int i10 = ssVar.currentAccount;
        long j10 = ssVar.f29200q0;
        ArrayList<Long> arrayList = ssVar.f29201r0.joined_chat_ids;
        boolean z11 = false;
        os osVar = new os(ssVar, 0);
        Pattern pattern = g5.f25184a;
        LinearLayout e = org.telegram.messenger.yh.e(context2, 1);
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, c6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
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
                bi.i7 i7Var = new bi.i7(context2, c6Var, z11);
                int i12 = size;
                ((TextView) i7Var.f3174b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) i7Var.f3175c;
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
                ((z9) i7Var.d).e(chat, new k9(chat));
                i7Var.setBackground(org.telegram.ui.ActionBar.g6.L0(z10));
                i7Var.setOnClickListener(new org.telegram.ui.ko(a2VarArr, osVar, longValue, 2));
                e.addView(i7Var, w7.a6.n(-1, -2));
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
        ArrayList arrayList = this.f29186b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f29202s0 != null && this.f29204u0) {
            int i11 = 0;
            while (true) {
                rs rsVar = this.f29194j0;
                if (i11 >= rsVar.f28936g) {
                    break;
                }
                if (rsVar.d[i11] && ((zArr = rsVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) rsVar.f28934c.get(i11);
                    iArr[0] = iArr[0] + this.f29202s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }

    public final boolean T() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f29205v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void U(ArrayList arrayList, rs rsVar) {
        boolean z10;
        boolean c10 = rsVar.c();
        int i10 = rsVar.f28936g;
        int i11 = rsVar.f28932a;
        if (c10) {
            boolean z11 = false;
            if (!rsVar.b()) {
                l61 y3 = l61.y(i11, rsVar.f28933b);
                if (rsVar.f28937i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = rsVar.f28933b;
            int i12 = rsVar.f28937i;
            if (i12 <= 0) {
                if (rsVar.e != null) {
                    i12 = rsVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            l61 l61Var = new l61(36);
            l61Var.d = i11;
            l61Var.f26954l = str;
            l61Var.f26957o = valueOf;
            if (rsVar.f28937i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l61Var.K(z10);
            l61Var.f26949f = rsVar.f28935f;
            l61Var.D = new org.telegram.ui.xf(28, this, rsVar);
            arrayList.add(l61Var);
            if (!rsVar.f28935f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = rsVar.e;
                    if (zArr == null || zArr[i13]) {
                        l61 l61Var2 = new l61(37);
                        l61Var2.d = (i11 << 24) | i13;
                        l61Var2.G = (TLObject) rsVar.f28934c.get(i13);
                        l61Var2.K(rsVar.d[i13]);
                        l61Var2.f26951i = 1;
                        arrayList.add(l61Var2);
                    }
                }
            }
        }
    }

    public final void V() {
        if (this.f29204u0) {
            P();
        } else if (!this.f29203t0) {
            this.f29203t0 = true;
            rs rsVar = this.f29194j0;
            int i10 = rsVar.f28936g;
            this.f29202s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < rsVar.f28936g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f19325q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) rsVar.f28934c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new bi.ja(this, inputPeer, i11, iArr, 4));
            }
        }
    }

    public final void W() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f29191g0;
        boolean z13 = false;
        rs rsVar = this.f29196l0;
        if (z12 && rsVar.c()) {
            if (rsVar.f28937i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f29191g0 && rsVar.c() && rsVar.f28937i == 0) {
            rsVar.d();
        } else if (!this.f29191g0 && rsVar.c()) {
            boolean z14 = this.E0;
            if (rsVar.f28937i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                rsVar.d();
            }
        }
        if (!this.f29191g0 && rsVar.c()) {
            if (rsVar.f28937i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void X(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ss.X(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f29193i0.a());
        edit.putBoolean("delete_deleteAll", this.f29194j0.a());
        if (!this.f29191g0 && this.f29196l0.a()) {
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
        mm0 mm0Var = this.d;
        rect.set(0, 0, mm0Var.getMeasuredWidth(), mm0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        mm0Var.setClipBounds(rect);
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
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.currentAccount, this.f24345n.getClassGuid(), true, new ls(this, 0), this.resourcesProvider);
        this.X = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
