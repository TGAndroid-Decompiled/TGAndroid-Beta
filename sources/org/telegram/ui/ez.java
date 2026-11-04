package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ez extends org.telegram.ui.ActionBar.d2 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public final LongSparseIntArray I;
    public ty J;
    public uy K;
    public zy L;
    public final ArrayList M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public float R;
    public gi.l3 S;
    public boolean T;
    public ci.c8 U;
    public int V;
    public int W;
    public int X;
    public xs f45101a;
    public bz f45102b;
    public org.telegram.ui.ActionBar.b5 f45103c;
    public int d;
    public boolean f45104e;
    public boolean f45105f;
    public boolean h;
    public boolean f45106n;
    public final org.telegram.messenger.mo f45107r;
    public boolean f45108s;
    public boolean f45109w;
    public CharSequence f45110x;
    public boolean f45111y;

    public ez(org.telegram.messenger.mo moVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f45111y = true;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = -5.0f;
        this.f45107r = moVar;
        if (moVar == null) {
            org.telegram.messenger.mo moVar2 = new org.telegram.messenger.mo();
            this.f45107r = moVar2;
            moVar2.f24237a = 2;
            while (getMessagesController().T0.get(this.f45107r.f24237a) != null) {
                this.f45107r.f24237a++;
            }
            org.telegram.messenger.mo moVar3 = this.f45107r;
            moVar3.f24238b = "";
            moVar3.f24247m = (int) (Math.random() * 8.0d);
            this.f45108s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f45107r.f24238b);
        this.f45110x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f45110x = m10;
        this.f45110x = org.telegram.messenger.zi.C5(m10, this.f45107r.f24239c, textPaint.getFontMetricsInt(), false);
        boolean z10 = !this.f45107r.f24248n;
        this.f45111y = z10;
        org.telegram.ui.Components.g5.r(this.currentAccount, z10);
        org.telegram.messenger.mo moVar4 = this.f45107r;
        this.E = moVar4.f24242g;
        this.F = moVar4.f24247m;
        ArrayList arrayList2 = new ArrayList(this.f45107r.h);
        this.G = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.H = new ArrayList(this.f45107r.f24243i);
        this.I = this.f45107r.f24244j.clone();
    }

    public static CharSequence E0(int i3, CharSequence charSequence, boolean z10) {
        Context context;
        if (i3 >= 0) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (!e12.getBoolean("n_" + i3, false) && (context = org.telegram.messenger.t0.f25457b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable g7 = k2.p1.g(context, 2131232269);
                    g7.setBounds(0, -org.telegram.messenger.g0.L(8.0f), g7.getIntrinsicWidth(), g7.getIntrinsicHeight() - org.telegram.messenger.g0.L(8.0f));
                    spannableString.setSpan(new ImageSpan(g7, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable g10 = k2.p1.g(context, 2131232267);
                    Drawable g11 = k2.p1.g(context, 2131232268);
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hi, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    g10.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    g11.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false), mode));
                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(g10, g11);
                    xpVar.setBounds(0, 0, xpVar.getIntrinsicWidth(), xpVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(xpVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static void Z(ez ezVar) {
        int i3;
        int i10;
        ezVar.f45111y = !ezVar.f45111y;
        uy uyVar = ezVar.K;
        if (uyVar != null) {
            org.telegram.ui.Cells.w3 w3Var = uyVar.f50349r;
            String str = null;
            if (q0(ezVar.f45110x)) {
                if (ezVar.f45111y) {
                    i10 = 2131750736;
                } else {
                    i10 = 2131750735;
                }
                str = org.telegram.messenger.bd.M0(i10, null);
            }
            w3Var.setText(str);
        }
        org.telegram.ui.Components.g5.r(ezVar.currentAccount, ezVar.f45111y);
        ezVar.o0(true);
        org.telegram.ui.ActionBar.y4 y4Var = ezVar.simpleActionBar;
        if (y4Var != null) {
            int i11 = 26;
            if (y4Var.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.k5 titleTextView = ezVar.simpleActionBar.getTitleTextView();
                if (ezVar.f45111y) {
                    i3 = 0;
                } else {
                    i3 = 26;
                }
                titleTextView.setEmojiCacheType(i3);
            }
            if (ezVar.simpleActionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.k5 titleTextView2 = ezVar.simpleActionBar.getTitleTextView2();
                if (ezVar.f45111y) {
                    i11 = 0;
                }
                titleTextView2.setEmojiCacheType(i11);
            }
        }
    }

    public static void a0(ez ezVar) {
        org.telegram.messenger.mo moVar = ezVar.f45107r;
        if (ezVar.f45109w) {
            ezVar.f45109w = false;
            Paint.FontMetricsInt titleFontMetricsInt = ezVar.simpleActionBar.getTitleFontMetricsInt();
            Spannable C5 = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(moVar.f24238b, titleFontMetricsInt, false, null, 0), moVar.f24239c, titleFontMetricsInt, false);
            org.telegram.ui.ActionBar.y4 y4Var = ezVar.simpleActionBar;
            y4Var.getClass();
            y4Var.A(C5, true, 220L, org.telegram.ui.Components.xq.h);
            return;
        }
        ezVar.finishFragment();
    }

    public static void b0(ez ezVar) {
        int i3;
        org.telegram.messenger.hp messagesController = ezVar.getMessagesController();
        org.telegram.messenger.mo moVar = ezVar.f45107r;
        messagesController.k5(moVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < moVar.h.size(); i10++) {
            long longValue = ((Long) moVar.h.get(i10)).longValue();
            if (longValue < 0 && m0(ezVar.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(ezVar.getMessagesController().j1(longValue));
            }
        }
        if (ezVar.getUserConfig().q()) {
            i3 = ezVar.getMessagesController().O4;
        } else {
            i3 = ezVar.getMessagesController().N4;
        }
        if (arrayList.size() > i3) {
            ezVar.showDialog(new vg.i0(4, ezVar.currentAccount, ezVar.getParentActivity(), ezVar, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = moVar.f24237a;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            ezVar.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new jy(ezVar, 1));
        } else {
            cy cyVar = new cy(moVar, null);
            cyVar.f44485y = new gy(ezVar, 1);
            cyVar.f44484x = new gy(ezVar, 2);
            ezVar.presentFragment(cyVar);
        }
    }

    public static boolean m0(TLRPC.Chat chat) {
        if (!org.telegram.messenger.t3.y(3, chat)) {
            if (!org.telegram.messenger.t3.t0(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean q0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.p5.class);
            if (p5VarArr != null && p5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(org.telegram.messenger.mo moVar, int i3, String str, ArrayList arrayList, boolean z10, int i10, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.d2 d2Var, Runnable runnable) {
        if (moVar.f24242g != i3 || z13) {
            moVar.f24240e = -1;
            if (z14) {
                moVar.d = -1;
            }
        }
        moVar.f24242g = i3;
        moVar.f24238b = str;
        moVar.f24239c = arrayList;
        moVar.f24247m = i10;
        moVar.f24243i = arrayList3;
        moVar.h = arrayList2;
        moVar.f24248n = z10;
        if (z11) {
            d2Var.getMessagesController().g(moVar, z12);
        } else {
            d2Var.getMessagesController().w3(moVar);
        }
        org.telegram.messenger.qr messagesStorage = d2Var.getMessagesStorage();
        messagesStorage.f24934a.c(new org.telegram.messenger.qf(messagesStorage, moVar, z12, 9));
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList T0 = d2Var.getMessagesController().T0();
            int size = T0.size();
            for (int i11 = 0; i11 < size; i11 = com.google.android.recaptcha.internal.a.f(((org.telegram.messenger.mo) T0.get(i11)).f24237a, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            d2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.Components.fc fcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new vg.i0(4, d2Var.getCurrentAccount(), d2Var.getContext(), d2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.k5.p(null, 2131750654, fcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.k5.p(null, 2131750653, fcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new vg.i0(5, d2Var.getCurrentAccount(), d2Var.getContext(), d2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new vg.i0(12, d2Var.getCurrentAccount(), d2Var.getContext(), d2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new vg.i0(13, d2Var.getCurrentAccount(), d2Var.getContext(), d2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.k5.p(null, 2131748217, fcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new vg.i0(4, d2Var.getCurrentAccount(), d2Var.getContext(), d2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new vg.i0(3, d2Var.getCurrentAccount(), d2Var.getContext(), d2Var, null).show();
            } else {
                org.telegram.messenger.k5.p(null, 2131743889, fcVar, null);
            }
        }
    }

    public static void z0(final org.telegram.messenger.mo moVar, final int i3, final String str, final ArrayList arrayList, final boolean z10, final int i10, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.d2 d2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (d2Var == null || d2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = null;
        int i11 = 3;
        if (z15) {
            org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, d2Var.getParentActivity(), null);
            s1Var2.f28546j0 = false;
            s1Var2.show();
            s1Var = s1Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f27126id = moVar.f24237a;
        int i12 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i13 = org.telegram.messenger.hp.C8;
        tL_dialogFilter.contacts = (i3 & 1) != 0;
        tL_dialogFilter.non_contacts = (i3 & 2) != 0;
        tL_dialogFilter.groups = (i3 & 4) != 0;
        tL_dialogFilter.broadcasts = (i3 & 8) != 0;
        tL_dialogFilter.bots = (i3 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i3 & 32) != 0;
        tL_dialogFilter.exclude_read = (i3 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i3 & 128) != 0;
        tL_dialogFilter.f27006id = moVar.f24237a;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z10;
        if (i10 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= 134217728;
            tL_dialogFilter2.color = i10;
        }
        org.telegram.messenger.hp messagesController = d2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                long keyAt = longSparseIntArray.keyAt(i14);
                if (!org.telegram.messenger.m5.C(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new ls(longSparseIntArray, 1));
        }
        int i15 = 0;
        while (i15 < i11) {
            if (i15 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i15 == i12) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            int i16 = 0;
            while (i16 < size2) {
                Long l10 = (Long) arrayList5.get(i16);
                org.telegram.ui.ActionBar.s1 s1Var3 = s1Var;
                int i17 = size2;
                long longValue = l10.longValue();
                if ((i15 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !org.telegram.messenger.m5.C(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User a22 = messagesController.a2(l10);
                        if (a22 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = a22.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j10 = -longValue;
                        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
                        if (M0 != null) {
                            if (org.telegram.messenger.t3.T(M0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j10;
                                tL_inputPeerChannel.access_hash = M0.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j10;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i16++;
                s1Var = s1Var3;
                size2 = i17;
            }
            i15++;
            i11 = 3;
            i12 = 1;
        }
        final org.telegram.ui.ActionBar.s1 s1Var4 = s1Var;
        d2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.s1 s1Var5 = s1Var4;
                final org.telegram.messenger.mo moVar2 = moVar;
                final int i18 = i3;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z17 = z10;
                final int i19 = i10;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final boolean z21 = z14;
                final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                final Runnable runnable2 = runnable;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (z22) {
                            org.telegram.ui.ActionBar.s1 s1Var6 = s1Var5;
                            if (s1Var6 != null) {
                                try {
                                    s1Var6.dismiss();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                            }
                            ez.v0(moVar2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, d2Var2, runnable3);
                        } else if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        v0(moVar, i3, str, arrayList, z10, i10, arrayList2, arrayList3, z11, z12, z13, z14, d2Var, null);
    }

    public final void A0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.G;
        } else {
            arrayList = this.H;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.E, arrayList, z10);
        usersSelectActivity.G = this.f45107r.d();
        usersSelectActivity.f42110n = new ei.f(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void B0(vy vyVar, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        if (z10) {
            s1Var.S = org.telegram.messenger.bd.M0(2131750710, null);
            if (obj instanceof String) {
                s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131750711, charSequence);
            } else if (obj instanceof TLRPC.User) {
                s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131750709, charSequence);
            } else {
                s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131750712, charSequence);
            }
        } else {
            s1Var.S = org.telegram.messenger.bd.M0(2131750715, null);
            if (obj instanceof String) {
                s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131750716, charSequence);
            } else if (obj instanceof TLRPC.User) {
                s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131750714, charSequence);
            } else {
                s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131750717, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744865, null), new ci.l3(this, vyVar, z10, 7));
        showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
        }
    }

    public final void C0() {
        String str;
        int i3;
        String M0;
        int size;
        int size2;
        int i10;
        ArrayList arrayList = this.P;
        arrayList.clear();
        ArrayList arrayList2 = this.Q;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String M02 = org.telegram.messenger.bd.M0(2131750734, null);
        if (q0(this.f45110x)) {
            if (this.f45111y) {
                i10 = 2131750736;
            } else {
                i10 = 2131750735;
            }
            str = org.telegram.messenger.bd.M0(i10, null);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final ez f44827b;

            {
                this.f44827b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                ez ezVar = this.f44827b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.mo moVar = ezVar.f45107r;
                        if (moVar != null && moVar.d()) {
                            org.telegram.ui.Components.rz.g1(ezVar, moVar.f24237a, new gy(ezVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ezVar.getParentActivity());
                        String M03 = org.telegram.messenger.bd.M0(2131750791, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M03;
                        s1Var.U = org.telegram.messenger.bd.M0(2131750790, null);
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new fy(ezVar, 1));
                        ezVar.showDialog(s1Var);
                        TextView textView = (TextView) s1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                            return;
                        }
                        return;
                    case 1:
                        ez.Z(ezVar);
                        return;
                    case 2:
                        ezVar.A0(true);
                        return;
                    case 3:
                        ezVar.f45104e = true;
                        ezVar.C0();
                        return;
                    case 4:
                        ezVar.A0(false);
                        return;
                    default:
                        ezVar.f45105f = true;
                        ezVar.C0();
                        return;
                }
            }
        };
        ?? aVar = new sg.a(11, false);
        aVar.d = M02;
        aVar.f50633e = str;
        aVar.f50632c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new sg.a(2, false));
        arrayList2.add(vy.d(null));
        String M03 = org.telegram.messenger.bd.M0(2131750774, null);
        ?? aVar2 = new sg.a(0, false);
        aVar2.d = M03;
        arrayList2.add(aVar2);
        vy b10 = vy.b(2131232022, org.telegram.messenger.bd.M0(2131750814, null), false);
        b10.f50632c = new View.OnClickListener(this) {
            public final ez f44827b;

            {
                this.f44827b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                ez ezVar = this.f44827b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.mo moVar = ezVar.f45107r;
                        if (moVar != null && moVar.d()) {
                            org.telegram.ui.Components.rz.g1(ezVar, moVar.f24237a, new gy(ezVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ezVar.getParentActivity());
                        String M032 = org.telegram.messenger.bd.M0(2131750791, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M032;
                        s1Var.U = org.telegram.messenger.bd.M0(2131750790, null);
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new fy(ezVar, 1));
                        ezVar.showDialog(s1Var);
                        TextView textView = (TextView) s1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                            return;
                        }
                        return;
                    case 1:
                        ez.Z(ezVar);
                        return;
                    case 2:
                        ezVar.A0(true);
                        return;
                    case 3:
                        ezVar.f45104e = true;
                        ezVar.C0();
                        return;
                    case 4:
                        ezVar.A0(false);
                        return;
                    default:
                        ezVar.f45105f = true;
                        ezVar.C0();
                        return;
                }
            }
        };
        arrayList2.add(b10);
        int i11 = this.E;
        int i12 = org.telegram.messenger.hp.C8;
        if ((i11 & 1) != 0) {
            arrayList2.add(vy.c(1, org.telegram.messenger.bd.M0(2131750792, null), "contacts", true));
        }
        if ((this.E & 2) != 0) {
            arrayList2.add(vy.c(2, org.telegram.messenger.bd.M0(2131750721, null), "non_contacts", true));
        }
        if ((this.E & 4) != 0) {
            arrayList2.add(vy.c(4, org.telegram.messenger.bd.M0(2131750775, null), "groups", true));
        }
        if ((this.E & 8) != 0) {
            arrayList2.add(vy.c(8, org.telegram.messenger.bd.M0(2131750801, null), "channels", true));
        }
        if ((this.E & 16) != 0) {
            arrayList2.add(vy.c(16, org.telegram.messenger.bd.M0(2131750802, null), "bots", true));
        }
        int i13 = 5;
        if (!this.G.isEmpty()) {
            if (!this.f45104e && this.G.size() >= 8) {
                size2 = Math.min(5, this.G.size());
            } else {
                size2 = this.G.size();
            }
            int i14 = 0;
            while (i14 < size2) {
                long longValue = ((Long) this.G.get(i14)).longValue();
                int i15 = i13;
                ?? aVar3 = new sg.a(1, false);
                aVar3.f50635g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
                i14++;
                i13 = i15;
            }
            i3 = i13;
            if (size2 != this.G.size()) {
                vy b11 = vy.b(2131230871, org.telegram.messenger.bd.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b11.f50632c = new View.OnClickListener(this) {
                    public final ez f44827b;

                    {
                        this.f44827b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i112 = r2;
                        ez ezVar = this.f44827b;
                        switch (i112) {
                            case 0:
                                org.telegram.messenger.mo moVar = ezVar.f45107r;
                                if (moVar != null && moVar.d()) {
                                    org.telegram.ui.Components.rz.g1(ezVar, moVar.f24237a, new gy(ezVar, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ezVar.getParentActivity());
                                String M032 = org.telegram.messenger.bd.M0(2131750791, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                s1Var.S = M032;
                                s1Var.U = org.telegram.messenger.bd.M0(2131750790, null);
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new fy(ezVar, 1));
                                ezVar.showDialog(s1Var);
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                    return;
                                }
                                return;
                            case 1:
                                ez.Z(ezVar);
                                return;
                            case 2:
                                ezVar.A0(true);
                                return;
                            case 3:
                                ezVar.f45104e = true;
                                ezVar.C0();
                                return;
                            case 4:
                                ezVar.A0(false);
                                return;
                            default:
                                ezVar.f45105f = true;
                                ezVar.C0();
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        } else {
            i3 = 5;
        }
        arrayList2.add(vy.d(org.telegram.messenger.bd.M0(2131750773, null)));
        org.telegram.messenger.mo moVar = this.f45107r;
        if (!moVar.d()) {
            String M04 = org.telegram.messenger.bd.M0(2131750779, null);
            ?? aVar4 = new sg.a(0, false);
            aVar4.d = M04;
            arrayList2.add(aVar4);
            vy b12 = vy.b(2131232022, org.telegram.messenger.bd.M0(2131750718, null), false);
            b12.f50632c = new View.OnClickListener(this) {
                public final ez f44827b;

                {
                    this.f44827b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    ez ezVar = this.f44827b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.mo moVar2 = ezVar.f45107r;
                            if (moVar2 != null && moVar2.d()) {
                                org.telegram.ui.Components.rz.g1(ezVar, moVar2.f24237a, new gy(ezVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ezVar.getParentActivity());
                            String M032 = org.telegram.messenger.bd.M0(2131750791, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M032;
                            s1Var.U = org.telegram.messenger.bd.M0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new fy(ezVar, 1));
                            ezVar.showDialog(s1Var);
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                return;
                            }
                            return;
                        case 1:
                            ez.Z(ezVar);
                            return;
                        case 2:
                            ezVar.A0(true);
                            return;
                        case 3:
                            ezVar.f45104e = true;
                            ezVar.C0();
                            return;
                        case 4:
                            ezVar.A0(false);
                            return;
                        default:
                            ezVar.f45105f = true;
                            ezVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            int i16 = this.E;
            int i17 = org.telegram.messenger.hp.C8;
            if ((i16 & 32) != 0) {
                arrayList2.add(vy.c(32, org.telegram.messenger.bd.M0(2131750737, null), "muted", false));
            }
            if ((this.E & 64) != 0) {
                arrayList2.add(vy.c(64, org.telegram.messenger.bd.M0(2131750720, null), "read", false));
            }
            if ((this.E & 128) != 0) {
                arrayList2.add(vy.c(128, org.telegram.messenger.bd.M0(2131750805, null), "archived", false));
            }
            if (!this.H.isEmpty()) {
                if (!this.f45105f && this.H.size() >= 8) {
                    size = Math.min(i3, this.H.size());
                } else {
                    size = this.H.size();
                }
                for (int i18 = 0; i18 < size; i18++) {
                    long longValue2 = ((Long) this.H.get(i18)).longValue();
                    ?? aVar5 = new sg.a(1, false);
                    aVar5.f50635g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.H.size()) {
                    vy b13 = vy.b(2131230871, org.telegram.messenger.bd.G(this.H.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.f50632c = new View.OnClickListener(this) {
                        public final ez f44827b;

                        {
                            this.f44827b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i112 = r2;
                            ez ezVar = this.f44827b;
                            switch (i112) {
                                case 0:
                                    org.telegram.messenger.mo moVar2 = ezVar.f45107r;
                                    if (moVar2 != null && moVar2.d()) {
                                        org.telegram.ui.Components.rz.g1(ezVar, moVar2.f24237a, new gy(ezVar, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ezVar.getParentActivity());
                                    String M032 = org.telegram.messenger.bd.M0(2131750791, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                    s1Var.S = M032;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131750790, null);
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new fy(ezVar, 1));
                                    ezVar.showDialog(s1Var);
                                    TextView textView = (TextView) s1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                        return;
                                    }
                                    return;
                                case 1:
                                    ez.Z(ezVar);
                                    return;
                                case 2:
                                    ezVar.A0(true);
                                    return;
                                case 3:
                                    ezVar.f45104e = true;
                                    ezVar.C0();
                                    return;
                                case 4:
                                    ezVar.A0(false);
                                    return;
                                default:
                                    ezVar.f45105f = true;
                                    ezVar.C0();
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(vy.d(org.telegram.messenger.bd.M0(2131750778, null)));
        }
        if (getMessagesController().A7 || !getUserConfig().q()) {
            arrayList2.add(new sg.a(9, false));
            arrayList2.add(new sg.a(10, false));
            arrayList2.add(vy.d(org.telegram.messenger.bd.M0(2131750622, null)));
        }
        ArrayList arrayList3 = this.M;
        if (arrayList3.isEmpty()) {
            String M05 = org.telegram.messenger.bd.M0(2131750706, null);
            ?? aVar6 = new sg.a(0, false);
            aVar6.d = M05;
            aVar6.f50634f = true;
            arrayList2.add(aVar6);
            arrayList2.add(vy.b(2131232031, org.telegram.messenger.bd.M0(2131750705, null), false));
            arrayList2.add(vy.d(org.telegram.messenger.bd.M0(2131750744, null)));
        } else {
            String M06 = org.telegram.messenger.bd.M0(2131750746, null);
            ?? aVar7 = new sg.a(0, false);
            aVar7.d = M06;
            aVar7.f50634f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new sg.a(8, false));
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ?? aVar8 = new sg.a(7, false);
                aVar8.f50640m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i19);
                arrayList2.add(aVar8);
            }
            if (moVar.d()) {
                M0 = org.telegram.messenger.bd.M0(2131750744, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131750745, null);
            }
            arrayList2.add(vy.d(M0));
        }
        if (!this.f45108s) {
            vy b14 = vy.b(0, org.telegram.messenger.bd.M0(2131750791, null), true);
            b14.f50632c = new View.OnClickListener(this) {
                public final ez f44827b;

                {
                    this.f44827b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    ez ezVar = this.f44827b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.mo moVar2 = ezVar.f45107r;
                            if (moVar2 != null && moVar2.d()) {
                                org.telegram.ui.Components.rz.g1(ezVar, moVar2.f24237a, new gy(ezVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ezVar.getParentActivity());
                            String M032 = org.telegram.messenger.bd.M0(2131750791, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M032;
                            s1Var.U = org.telegram.messenger.bd.M0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new fy(ezVar, 1));
                            ezVar.showDialog(s1Var);
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                return;
                            }
                            return;
                        case 1:
                            ez.Z(ezVar);
                            return;
                        case 2:
                            ezVar.A0(true);
                            return;
                        case 3:
                            ezVar.f45104e = true;
                            ezVar.C0();
                            return;
                        case 4:
                            ezVar.A0(false);
                            return;
                        default:
                            ezVar.f45105f = true;
                            ezVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(vy.d(null));
        }
        bz bzVar = this.f45102b;
        if (bzVar != null) {
            bzVar.E(arrayList, arrayList2);
        }
    }

    public final void D0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f45101a != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wl, false);
                if (x02 != this.W || x03 != this.X) {
                    this.W = x02;
                    this.X = x03;
                    for (int i3 = 0; i3 < 4; i3++) {
                        if (i3 == 0) {
                            attachedScrapChildCount = this.f45101a.getChildCount();
                        } else if (i3 == 1) {
                            attachedScrapChildCount = this.f45101a.getHiddenChildCount();
                        } else if (i3 == 2) {
                            attachedScrapChildCount = this.f45101a.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f45101a.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i3 == 0) {
                                O = this.f45101a.getChildAt(i10);
                            } else if (i3 == 1) {
                                O = this.f45101a.V(i10);
                            } else if (i3 == 2) {
                                O = this.f45101a.P(i10);
                            } else {
                                O = this.f45101a.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.pa) {
                                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) O;
                                paVar.f29825b0 = true;
                                paVar.R = x02;
                                paVar.S = x03;
                                if (i3 != 0) {
                                    ((org.telegram.ui.Cells.pa) O).i(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27981ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return n0(true);
    }

    @Override
    public final View createView(Context context) {
        int i3;
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        boolean z10 = this.f45108s;
        org.telegram.messenger.mo moVar = this.f45107r;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131750729, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(moVar.f24238b, titleFontMetricsInt, false, null, 0), moVar.f24239c, titleFontMetricsInt, false));
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var != null) {
                int i11 = 26;
                if (y4Var.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.k5 titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.f45111y) {
                        i3 = 0;
                    } else {
                        i3 = 26;
                    }
                    titleTextView.setEmojiCacheType(i3);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.k5 titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.f45111y) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 2));
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        if (this.f45108s) {
            i10 = 2131751753;
        } else {
            i10 = 2131745956;
        }
        this.f45103c = y4Var2.n(org.telegram.messenger.bd.M0(i10, null));
        ai.h5 h5Var = new ai.h5(5, context, this);
        this.fragmentView = h5Var;
        xs xsVar = new xs(1, context, this);
        this.f45101a = xsVar;
        xsVar.r1();
        this.f45101a.setLayoutManager(new u4.b0(1, false));
        this.f45101a.setVerticalScrollBarEnabled(false);
        this.f45101a.setSectionsDrawBackground(true);
        h5Var.addView(this.f45101a, b8.mf.c(-1.0f, -1));
        xs xsVar2 = this.f45101a;
        bz bzVar = new bz(this, context);
        this.f45102b = bzVar;
        xsVar2.setAdapter(bzVar);
        this.f45101a.setOnItemClickListener(new h(this, 10));
        this.f45101a.setOnItemLongClickListener(new fy(this, 0));
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.n(350L);
        this.f45101a.setItemAnimator(kVar);
        this.f45101a.setOnScrollListener(new h3(this, 11));
        o0(false);
        if (!this.O && moVar != null && moVar.d()) {
            this.O = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = moVar.f24237a;
            this.N = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new jy(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f45101a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45101a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.l8.class, org.telegram.ui.Cells.pa.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45101a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45101a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28121q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45101a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45101a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean n0(boolean z10) {
        if (this.f45103c.f27420x.f53841f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean z11 = this.f45108s;
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                if (z11) {
                    s1Var.S = org.telegram.messenger.bd.M0(2131750784, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131750786, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131750785, null), new fy(this, 2));
                } else {
                    s1Var.S = org.telegram.messenger.bd.M0(2131750783, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131750787, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new fy(this, 3));
                }
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, null), new fy(this, 4));
                showDialog(s1Var);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void o0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f45110x) && this.f45110x.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.E & org.telegram.messenger.hp.D8) == 0 && this.G.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f45108s) {
                this.h = false;
                org.telegram.messenger.mo moVar = this.f45107r;
                if (moVar.h.size() != this.G.size()) {
                    this.h = true;
                }
                if (moVar.f24243i.size() != this.H.size()) {
                    this.h = true;
                }
                if (moVar.f24247m != this.F) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(moVar.h);
                    Collections.sort(this.G);
                    if (!moVar.h.equals(this.G)) {
                        this.h = true;
                    }
                    Collections.sort(moVar.f24243i);
                    Collections.sort(this.H);
                    if (!moVar.f24243i.equals(this.H)) {
                        this.h = true;
                    }
                }
                if (moVar.f24248n == (!this.f45111y) && TextUtils.equals(moVar.f24238b, this.f45110x) && moVar.f24242g == this.E) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        this.f45103c.a(z11, z10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.f3 f3Var;
        zy zyVar = this.L;
        if (zyVar != null && (f3Var = zyVar.f29316b) != null && f3Var.f35191e) {
            if (z10) {
                f3Var.k(true);
                return false;
            }
            return false;
        }
        return n0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        C0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.N != 0) {
            getConnectionsManager().cancelRequest(this.N, true);
        }
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        zy zyVar;
        View view = this.fragmentView;
        if (view != null && (zyVar = this.L) != null && zyVar.f29316b.f35191e) {
            view.requestLayout();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        C0();
        ci.c8 c8Var = this.U;
        if (c8Var != null) {
            c8Var.run();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.Cells.f3 f3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            D0();
            try {
                zy zyVar = this.L;
                if (zyVar != null && (f3Var = zyVar.f29316b) != null && f3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Ci)) != this.V) {
                    this.V = themedColor;
                    this.L.f29316b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void p0() {
        String M0;
        if (this.f45108s) {
            if (TextUtils.isEmpty(this.f45110x) || !this.f45106n) {
                int i3 = this.E;
                int i10 = org.telegram.messenger.hp.D8;
                int i11 = i3 & i10;
                String str = "";
                if ((i11 & i10) == i10) {
                    if ((i3 & 64) != 0) {
                        M0 = org.telegram.messenger.bd.M0(2131750731, null);
                    } else {
                        if ((i3 & 32) != 0) {
                            M0 = org.telegram.messenger.bd.M0(2131750732, null);
                        }
                        M0 = "";
                    }
                } else if ((i11 & 1) != 0) {
                    if ((i11 & (-2)) == 0) {
                        M0 = org.telegram.messenger.bd.M0(2131750792, null);
                    }
                    M0 = "";
                } else if ((i11 & 2) != 0) {
                    if ((i11 & (-3)) == 0) {
                        M0 = org.telegram.messenger.bd.M0(2131750721, null);
                    }
                    M0 = "";
                } else if ((i11 & 4) != 0) {
                    if ((i11 & (-5)) == 0) {
                        M0 = org.telegram.messenger.bd.M0(2131750775, null);
                    }
                    M0 = "";
                } else if ((i11 & 16) != 0) {
                    if ((i11 & (-17)) == 0) {
                        M0 = org.telegram.messenger.bd.M0(2131750802, null);
                    }
                    M0 = "";
                } else {
                    if ((i11 & 8) != 0 && (i11 & (-9)) == 0) {
                        M0 = org.telegram.messenger.bd.M0(2131750801, null);
                    }
                    M0 = "";
                }
                if (M0 == null || M0.length() <= 12) {
                    str = M0;
                }
                this.f45110x = str;
                ty tyVar = this.J;
                if (tyVar != null) {
                    tyVar.e(org.telegram.ui.Components.p5.cloneSpans(str, -1, tyVar.f49918s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                u4.d1 K = this.f45101a.K(this.d);
                if (K != null) {
                    this.f45102b.y(K);
                }
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i3 = 0;
            while (true) {
                arrayList = this.M;
                if (i3 < arrayList.size()) {
                    if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i3)).url, tL_exportedChatlistInvite.url)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0) {
                arrayList.remove(i3);
                if (arrayList.isEmpty()) {
                    org.telegram.messenger.mo moVar = this.f45107r;
                    int i10 = moVar.f24242g;
                    int i11 = org.telegram.messenger.hp.C8;
                    moVar.f24242g = i10 & (-513);
                }
                C0();
            }
        }
    }

    public final void s0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            arrayList = this.M;
            if (i3 < arrayList.size()) {
                if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i3)).url, tL_exportedChatlistInvite.url)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i3, tL_exportedChatlistInvite);
        }
        C0();
    }

    public final void t0(int i3, boolean z10) {
        org.telegram.messenger.mo moVar;
        if (!this.T && (moVar = this.f45107r) != null && moVar.d() && moVar.f()) {
            this.T = true;
            this.U = new ci.c8(this, z10, i3, 7);
            if (getLayoutContainer() != null) {
                this.U.run();
                this.U = null;
            }
        }
    }

    public final void u0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i3;
        if (arrayList != null) {
            i3 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!arrayList2.contains(arrayList.get(i10))) {
                    i3++;
                }
            }
            size = 0;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (!arrayList.contains(arrayList2.get(i11))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i3 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i3 = 0;
        }
        if (z10) {
            if (size > 0 && size > i3) {
                t0(size, true);
            } else if (i3 > 0) {
                t0(i3, false);
            }
        } else if (size > 0) {
            t0(size, false);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        gi.l3 l3Var = this.S;
        if (l3Var != null) {
            l3Var.f(true);
            this.S = null;
        }
        y0(new hy(this, 0), true);
    }

    public final void y0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f45110x};
        z0(this.f45107r, this.E, charSequenceArr[0].toString(), getMediaDataController().W(charSequenceArr, false, true), true ^ this.f45111y, this.F, this.G, this.H, this.I, this.f45108s, false, this.h, true, z10, this, new org.telegram.ui.Components.p11(27, this, runnable));
    }
}
