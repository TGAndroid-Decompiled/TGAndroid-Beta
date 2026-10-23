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
    public static final int H0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public int G0;
    public b71 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f29641a0;
    public final ArrayList f29642b0;
    public final long f29643c0;
    public final int f29644d0;
    public final int f29645e0;
    public final Runnable f29646f0;
    public boolean f29647g0;
    public final boolean f29648h0;
    public final os f29649i0;
    public final os f29650j0;
    public final os f29651k0;
    public final os f29652l0;
    public final boolean[] m0;
    public final boolean[] f29653n0;
    public final boolean f29654o0;
    public boolean f29655p0;
    public final long f29656q0;
    public TL_communities.ParticipantJoinedChats f29657r0;
    public int[] f29658s0;
    public boolean f29659t0;
    public boolean f29660u0;
    public final TLRPC.TL_chatBannedRights f29661v0;
    public final TLRPC.TL_chatBannedRights f29662w0;
    public final ArrayList f29663x0;
    public boolean f29664y0;
    public final boolean f29665z0;

    public ps(org.telegram.ui.ActionBar.o2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps.<init>(org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(ps psVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            psVar.f29658s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(psVar.f29642b0).filter(new ms(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            psVar.f29659t0 = false;
            psVar.f29660u0 = true;
            psVar.O();
        }
    }

    public static void Q(ps psVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = psVar.getContext();
        org.telegram.ui.ActionBar.g6 g6Var = psVar.resourcesProvider;
        int i10 = psVar.currentAccount;
        long j10 = psVar.f29656q0;
        ArrayList<Long> arrayList = psVar.f29657r0.joined_chat_ids;
        boolean z11 = false;
        ls lsVar = new ls(psVar, 0);
        Pattern pattern = f5.f26167a;
        LinearLayout e = org.telegram.messenger.sl.e(context2, 1);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, g6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.o(e);
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
                ai.w1 w1Var = new ai.w1(context2, g6Var, z11);
                int i12 = size;
                ((TextView) w1Var.f2344b).setText(DialogObject.getName(chat));
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
                ((w9) w1Var.f2345c).e(chat, new h9(chat));
                w1Var.setBackground(org.telegram.ui.ActionBar.k6.M0(z10));
                w1Var.setOnClickListener(new ai.t3(c2VarArr, lsVar, longValue, 3));
                e.addView(w1Var, w7.z5.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = z10;
            }
        }
        c2VarArr[z11 ? 1 : 0] = c2Var;
        c2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f29661v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, os osVar) {
        boolean z10;
        boolean c10 = osVar.c();
        int i10 = osVar.f29305g;
        int i11 = osVar.f29301a;
        if (c10) {
            boolean z11 = false;
            if (!osVar.b()) {
                m61 y3 = m61.y(i11, osVar.f29302b);
                if (osVar.f29306i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = osVar.f29302b;
            int i12 = osVar.f29306i;
            if (i12 <= 0) {
                if (osVar.e != null) {
                    i12 = osVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            m61 m61Var = new m61(36);
            m61Var.d = i11;
            m61Var.f28559l = str;
            m61Var.f28562o = valueOf;
            if (osVar.f29306i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            m61Var.K(z10);
            m61Var.f28554f = osVar.f29304f;
            m61Var.D = new ca(9, this, osVar);
            arrayList.add(m61Var);
            if (!osVar.f29304f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = osVar.e;
                    if (zArr == null || zArr[i13]) {
                        m61 m61Var2 = new m61(37);
                        m61Var2.d = (i11 << 24) | i13;
                        m61Var2.G = (TLObject) osVar.f29303c.get(i13);
                        m61Var2.K(osVar.d[i13]);
                        m61Var2.f28556i = 1;
                        arrayList.add(m61Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f29660u0) {
            O();
        } else if (!this.f29659t0) {
            this.f29659t0 = true;
            os osVar = this.f29650j0;
            int i10 = osVar.f29305g;
            this.f29658s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < osVar.f29305g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f20452q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) osVar.f29303c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new ci.s8(this, inputPeer, i11, iArr, 4));
            }
        }
    }

    public final void V() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f29647g0;
        boolean z13 = false;
        os osVar = this.f29652l0;
        if (z12 && osVar.c()) {
            if (osVar.f29306i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f29647g0 && osVar.c() && osVar.f29306i == 0) {
            osVar.d();
        } else if (!this.f29647g0 && osVar.c()) {
            boolean z14 = this.E0;
            if (osVar.f29306i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                osVar.d();
            }
        }
        if (!this.f29647g0 && osVar.c()) {
            if (osVar.f29306i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void W(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f29649i0.a());
        edit.putBoolean("delete_deleteAll", this.f29650j0.a());
        if (!this.f29647g0 && this.f29652l0.a()) {
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
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7);
        if (themedColor != this.G0) {
            this.G0 = themedColor;
            setBackgroundColor(themedColor);
        }
    }

    @Override
    public final void show() {
        super.show();
        qc.e();
    }

    @Override
    public final boolean u(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, this.f25029n.getClassGuid(), true, new is(this, 0), this.resourcesProvider);
        this.X = b71Var;
        b71Var.f24972r = false;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
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
        ArrayList arrayList = this.f29642b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f29658s0 != null && this.f29660u0) {
            int i11 = 0;
            while (true) {
                os osVar = this.f29650j0;
                if (i11 >= osVar.f29305g) {
                    break;
                }
                if (osVar.d[i11] && ((zArr = osVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) osVar.f29303c.get(i11);
                    iArr[0] = iArr[0] + this.f29658s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
