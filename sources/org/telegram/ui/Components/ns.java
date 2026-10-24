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
public final class ns extends za {
    public static final int H0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public int G0;
    public a71 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f29004a0;
    public final ArrayList f29005b0;
    public final long f29006c0;
    public final int f29007d0;
    public final int f29008e0;
    public final Runnable f29009f0;
    public boolean f29010g0;
    public final boolean f29011h0;
    public final ms f29012i0;
    public final ms f29013j0;
    public final ms f29014k0;
    public final ms f29015l0;
    public final boolean[] m0;
    public final boolean[] f29016n0;
    public final boolean f29017o0;
    public boolean f29018p0;
    public final long f29019q0;
    public TL_communities.ParticipantJoinedChats f29020r0;
    public int[] f29021s0;
    public boolean f29022t0;
    public boolean f29023u0;
    public final TLRPC.TL_chatBannedRights f29024v0;
    public final TLRPC.TL_chatBannedRights f29025w0;
    public final ArrayList f29026x0;
    public boolean f29027y0;
    public final boolean f29028z0;

    public ns(org.telegram.ui.ActionBar.o2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ns.<init>(org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(ns nsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            nsVar.f29021s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(nsVar.f29005b0).filter(new ks(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            nsVar.f29022t0 = false;
            nsVar.f29023u0 = true;
            nsVar.O();
        }
    }

    public static void Q(ns nsVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = nsVar.getContext();
        org.telegram.ui.ActionBar.g6 g6Var = nsVar.resourcesProvider;
        int i10 = nsVar.currentAccount;
        long j10 = nsVar.f29019q0;
        ArrayList<Long> arrayList = nsVar.f29020r0.joined_chat_ids;
        boolean z11 = false;
        js jsVar = new js(nsVar, 0);
        Pattern pattern = d5.f25562a;
        LinearLayout e = org.telegram.messenger.tl.e(context2, 1);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, g6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
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
                ((u9) w1Var.f2345c).e(chat, new f9(chat));
                w1Var.setBackground(org.telegram.ui.ActionBar.k6.M0(z10));
                w1Var.setOnClickListener(new ai.t3(c2VarArr, jsVar, longValue, 3));
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
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f29024v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, ms msVar) {
        boolean z10;
        boolean c10 = msVar.c();
        int i10 = msVar.f28691g;
        int i11 = msVar.f28687a;
        if (c10) {
            boolean z11 = false;
            if (!msVar.b()) {
                l61 y3 = l61.y(i11, msVar.f28688b);
                if (msVar.f28692i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = msVar.f28688b;
            int i12 = msVar.f28692i;
            if (i12 <= 0) {
                if (msVar.e != null) {
                    i12 = msVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            l61 l61Var = new l61(36);
            l61Var.d = i11;
            l61Var.f28227l = str;
            l61Var.f28230o = valueOf;
            if (msVar.f28692i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l61Var.K(z10);
            l61Var.f28222f = msVar.f28690f;
            l61Var.D = new aa(9, this, msVar);
            arrayList.add(l61Var);
            if (!msVar.f28690f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = msVar.e;
                    if (zArr == null || zArr[i13]) {
                        l61 l61Var2 = new l61(37);
                        l61Var2.d = (i11 << 24) | i13;
                        l61Var2.G = (TLObject) msVar.f28689c.get(i13);
                        l61Var2.K(msVar.d[i13]);
                        l61Var2.f28224i = 1;
                        arrayList.add(l61Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f29023u0) {
            O();
        } else if (!this.f29022t0) {
            this.f29022t0 = true;
            ms msVar = this.f29013j0;
            int i10 = msVar.f28691g;
            this.f29021s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < msVar.f28691g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f20453q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) msVar.f28689c.get(i11));
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
        boolean z12 = this.f29010g0;
        boolean z13 = false;
        ms msVar = this.f29015l0;
        if (z12 && msVar.c()) {
            if (msVar.f28692i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f29010g0 && msVar.c() && msVar.f28692i == 0) {
            msVar.d();
        } else if (!this.f29010g0 && msVar.c()) {
            boolean z14 = this.E0;
            if (msVar.f28692i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                msVar.d();
            }
        }
        if (!this.f29010g0 && msVar.c()) {
            if (msVar.f28692i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void W(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ns.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f29012i0.a());
        edit.putBoolean("delete_deleteAll", this.f29013j0.a());
        if (!this.f29010g0 && this.f29015l0.a()) {
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
        lm0 lm0Var = this.d;
        rect.set(0, 0, lm0Var.getMeasuredWidth(), lm0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        lm0Var.setClipBounds(rect);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
        if (themedColor != this.G0) {
            this.G0 = themedColor;
            setBackgroundColor(themedColor);
        }
    }

    @Override
    public final void show() {
        super.show();
        oc.e();
    }

    @Override
    public final boolean u(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(lm0Var, getContext(), this.currentAccount, this.f33212n.getClassGuid(), true, new gs(this, 0), this.resourcesProvider);
        this.X = a71Var;
        a71Var.f24646r = false;
        return a71Var;
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
        ArrayList arrayList = this.f29005b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f29021s0 != null && this.f29023u0) {
            int i11 = 0;
            while (true) {
                ms msVar = this.f29013j0;
                if (i11 >= msVar.f28691g) {
                    break;
                }
                if (msVar.d[i11] && ((zArr = msVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) msVar.f28689c.get(i11);
                    iArr[0] = iArr[0] + this.f29021s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
