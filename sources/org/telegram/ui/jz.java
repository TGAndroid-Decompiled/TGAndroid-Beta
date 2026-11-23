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
public final class jz extends org.telegram.ui.ActionBar.g2 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public final LongSparseIntArray I;
    public zy J;
    public az K;
    public ez L;
    public final ArrayList M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public float R;
    public hi.u3 S;
    public boolean T;
    public di.x7 U;
    public int V;
    public int W;
    public int X;
    public dt f49248a;
    public gz f49249b;
    public org.telegram.ui.ActionBar.c5 f49250c;
    public int d;
    public boolean f49251e;
    public boolean f49252f;
    public boolean h;
    public boolean f49253n;
    public final org.telegram.messenger.ro f49254r;
    public boolean f49255s;
    public boolean f49256w;
    public CharSequence f49257x;
    public boolean f49258y;

    public jz(org.telegram.messenger.ro roVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f49258y = true;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = -5.0f;
        this.f49254r = roVar;
        if (roVar == null) {
            org.telegram.messenger.ro roVar2 = new org.telegram.messenger.ro();
            this.f49254r = roVar2;
            roVar2.f26773a = 2;
            while (getMessagesController().T0.get(this.f49254r.f26773a) != null) {
                this.f49254r.f26773a++;
            }
            org.telegram.messenger.ro roVar3 = this.f49254r;
            roVar3.f26774b = "";
            roVar3.f26783m = (int) (Math.random() * 8.0d);
            this.f49255s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49254r.f26774b);
        this.f49257x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f49257x = m10;
        this.f49257x = org.telegram.messenger.fj.B5(m10, this.f49254r.f26775c, textPaint.getFontMetricsInt(), false);
        boolean z10 = !this.f49254r.f26784n;
        this.f49258y = z10;
        org.telegram.ui.Components.o5.r(this.currentAccount, z10);
        org.telegram.messenger.ro roVar4 = this.f49254r;
        this.E = roVar4.f26778g;
        this.F = roVar4.f26783m;
        ArrayList arrayList2 = new ArrayList(this.f49254r.h);
        this.G = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.H = new ArrayList(this.f49254r.f26779i);
        this.I = this.f49254r.f26780j.clone();
    }

    public static CharSequence E0(int i7, CharSequence charSequence, boolean z10) {
        Context context;
        if (i7 >= 0) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("n_" + i7, false) && (context = org.telegram.messenger.t0.f27013b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable g10 = i5.c.g(context, 2131232274);
                    g10.setBounds(0, -org.telegram.messenger.g0.L(8.0f), g10.getIntrinsicWidth(), g10.getIntrinsicHeight() - org.telegram.messenger.g0.L(8.0f));
                    spannableString.setSpan(new ImageSpan(g10, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable g11 = i5.c.g(context, 2131232272);
                    Drawable g13 = i5.c.g(context, 2131232273);
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ki, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    g11.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    g13.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false), mode));
                    org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(g11, g13);
                    lqVar.setBounds(0, 0, lqVar.getIntrinsicWidth(), lqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(lqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static void Z(jz jzVar) {
        int i7;
        int i10;
        jzVar.f49258y = !jzVar.f49258y;
        az azVar = jzVar.K;
        if (azVar != null) {
            org.telegram.ui.Cells.x3 x3Var = azVar.f45837r;
            String str = null;
            if (q0(jzVar.f49257x)) {
                if (jzVar.f49258y) {
                    i10 = 2131750723;
                } else {
                    i10 = 2131750722;
                }
                str = org.telegram.messenger.gd.N0(i10, null);
            }
            x3Var.setText(str);
        }
        org.telegram.ui.Components.o5.r(jzVar.currentAccount, jzVar.f49258y);
        jzVar.o0(true);
        org.telegram.ui.ActionBar.z4 z4Var = jzVar.simpleActionBar;
        if (z4Var != null) {
            int i11 = 26;
            if (z4Var.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.n5 titleTextView = jzVar.simpleActionBar.getTitleTextView();
                if (jzVar.f49258y) {
                    i7 = 0;
                } else {
                    i7 = 26;
                }
                titleTextView.setEmojiCacheType(i7);
            }
            if (jzVar.simpleActionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.n5 titleTextView2 = jzVar.simpleActionBar.getTitleTextView2();
                if (jzVar.f49258y) {
                    i11 = 0;
                }
                titleTextView2.setEmojiCacheType(i11);
            }
        }
    }

    public static void a0(jz jzVar) {
        org.telegram.messenger.ro roVar = jzVar.f49254r;
        if (jzVar.f49256w) {
            jzVar.f49256w = false;
            Paint.FontMetricsInt titleFontMetricsInt = jzVar.simpleActionBar.getTitleFontMetricsInt();
            Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(roVar.f26774b, titleFontMetricsInt, false, null, 0), roVar.f26775c, titleFontMetricsInt, false);
            org.telegram.ui.ActionBar.z4 z4Var = jzVar.simpleActionBar;
            z4Var.getClass();
            z4Var.H(B5, true, 220L, org.telegram.ui.Components.kr.h);
            return;
        }
        jzVar.finishFragment();
    }

    public static void b0(jz jzVar) {
        int i7;
        org.telegram.messenger.mp messagesController = jzVar.getMessagesController();
        org.telegram.messenger.ro roVar = jzVar.f49254r;
        messagesController.w5(roVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < roVar.h.size(); i10++) {
            long longValue = ((Long) roVar.h.get(i10)).longValue();
            if (longValue < 0 && m0(jzVar.getMessagesController().O0(Long.valueOf(-longValue)))) {
                arrayList.add(jzVar.getMessagesController().l1(longValue));
            }
        }
        if (jzVar.getUserConfig().q()) {
            i7 = jzVar.getMessagesController().R4;
        } else {
            i7 = jzVar.getMessagesController().Q4;
        }
        if (arrayList.size() > i7) {
            jzVar.showDialog(new ug.k0(4, jzVar.currentAccount, jzVar.getParentActivity(), jzVar, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = roVar.f26773a;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            jzVar.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new qy(jzVar, 1));
        } else {
            jy jyVar = new jy(roVar, null);
            jyVar.f49243y = new ny(jzVar, 1);
            jyVar.f49242x = new ny(jzVar, 2);
            jzVar.presentFragment(jyVar);
        }
    }

    public static boolean m0(TLRPC.Chat chat) {
        if (!org.telegram.messenger.v3.y(3, chat)) {
            if (!org.telegram.messenger.v3.t0(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean q0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.x5.class);
            if (x5VarArr != null && x5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(org.telegram.messenger.ro roVar, int i7, String str, ArrayList arrayList, boolean z10, int i10, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.g2 g2Var, Runnable runnable) {
        if (roVar.f26778g != i7 || z13) {
            roVar.f26776e = -1;
            if (z14) {
                roVar.d = -1;
            }
        }
        roVar.f26778g = i7;
        roVar.f26774b = str;
        roVar.f26775c = arrayList;
        roVar.f26783m = i10;
        roVar.f26779i = arrayList3;
        roVar.h = arrayList2;
        roVar.f26784n = z10;
        if (z11) {
            g2Var.getMessagesController().g(roVar, z12);
        } else {
            g2Var.getMessagesController().D3(roVar);
        }
        org.telegram.messenger.tr messagesStorage = g2Var.getMessagesStorage();
        messagesStorage.f27149a.c(new org.telegram.messenger.xf(messagesStorage, roVar, z12, 9));
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList V0 = g2Var.getMessagesController().V0();
            int size = V0.size();
            for (int i11 = 0; i11 < size; i11 = com.google.android.gms.internal.vision.e2.f(((org.telegram.messenger.ro) V0.get(i11)).f26773a, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            g2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.Components.kc kcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(4, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.f3.o(null, 2131750636, kcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.f3.o(null, 2131750635, kcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(5, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(12, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(13, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.f3.o(null, 2131748016, kcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(4, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(3, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else {
                org.telegram.messenger.f3.o(null, 2131743632, kcVar, null);
            }
        }
    }

    public static void z0(final org.telegram.messenger.ro roVar, final int i7, final String str, final ArrayList arrayList, final boolean z10, final int i10, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.g2 g2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (g2Var == null || g2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = null;
        int i11 = 3;
        if (z15) {
            org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, g2Var.getParentActivity(), null);
            t1Var2.f30091j0 = false;
            t1Var2.show();
            t1Var = t1Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f28617id = roVar.f26773a;
        int i12 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i13 = org.telegram.messenger.mp.I8;
        tL_dialogFilter.contacts = (i7 & 1) != 0;
        tL_dialogFilter.non_contacts = (i7 & 2) != 0;
        tL_dialogFilter.groups = (i7 & 4) != 0;
        tL_dialogFilter.broadcasts = (i7 & 8) != 0;
        tL_dialogFilter.bots = (i7 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i7 & 32) != 0;
        tL_dialogFilter.exclude_read = (i7 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i7 & 128) != 0;
        tL_dialogFilter.f28497id = roVar.f26773a;
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
        org.telegram.messenger.mp messagesController = g2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                long keyAt = longSparseIntArray.keyAt(i14);
                if (!org.telegram.messenger.n5.C(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new qs(longSparseIntArray, 1));
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
                org.telegram.ui.ActionBar.t1 t1Var3 = t1Var;
                int i17 = size2;
                long longValue = l10.longValue();
                if ((i15 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !org.telegram.messenger.n5.C(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User c22 = messagesController.c2(l10);
                        if (c22 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = c22.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j3 = -longValue;
                        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
                        if (O0 != null) {
                            if (org.telegram.messenger.v3.T(O0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j3;
                                tL_inputPeerChannel.access_hash = O0.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j3;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i16++;
                t1Var = t1Var3;
                size2 = i17;
            }
            i15++;
            i11 = 3;
            i12 = 1;
        }
        final org.telegram.ui.ActionBar.t1 t1Var4 = t1Var;
        g2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.t1 t1Var5 = t1Var4;
                final org.telegram.messenger.ro roVar2 = roVar;
                final int i18 = i7;
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
                final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                final Runnable runnable2 = runnable;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (z22) {
                            org.telegram.ui.ActionBar.t1 t1Var6 = t1Var5;
                            if (t1Var6 != null) {
                                try {
                                    t1Var6.dismiss();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                            }
                            jz.v0(roVar2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, g2Var2, runnable3);
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
        v0(roVar, i7, str, arrayList, z10, i10, arrayList2, arrayList3, z11, z12, z13, z14, g2Var, null);
    }

    public final void A0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.G;
        } else {
            arrayList = this.H;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.E, arrayList, z10);
        usersSelectActivity.G = this.f49254r.c();
        usersSelectActivity.f44025n = new ab.z(7, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void B0(bz bzVar, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        if (z10) {
            t1Var.S = org.telegram.messenger.gd.N0(2131750695, null);
            if (obj instanceof String) {
                t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750696, charSequence);
            } else if (obj instanceof TLRPC.User) {
                t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750694, charSequence);
            } else {
                t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750697, charSequence);
            }
        } else {
            t1Var.S = org.telegram.messenger.gd.N0(2131750700, null);
            if (obj instanceof String) {
                t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750701, charSequence);
            } else if (obj instanceof TLRPC.User) {
                t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750699, charSequence);
            } else {
                t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750702, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131744614, null), new ab.j(this, bzVar, z10, 8));
        showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
        }
    }

    public final void C0() {
        String str;
        int i7;
        String N0;
        int size;
        int size2;
        int i10;
        ArrayList arrayList = this.P;
        arrayList.clear();
        ArrayList arrayList2 = this.Q;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String N02 = org.telegram.messenger.gd.N0(2131750721, null);
        if (q0(this.f49257x)) {
            if (this.f49258y) {
                i10 = 2131750723;
            } else {
                i10 = 2131750722;
            }
            str = org.telegram.messenger.gd.N0(i10, null);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final jz f49553b;

            {
                this.f49553b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                jz jzVar = this.f49553b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.ro roVar = jzVar.f49254r;
                        if (roVar != null && roVar.c()) {
                            org.telegram.ui.Components.g00.h1(jzVar, roVar.f26773a, new ny(jzVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                        String N03 = org.telegram.messenger.gd.N0(2131750778, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N03;
                        t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new my(jzVar, 1));
                        jzVar.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                            return;
                        }
                        return;
                    case 1:
                        jz.Z(jzVar);
                        return;
                    case 2:
                        jzVar.A0(true);
                        return;
                    case 3:
                        jzVar.f49251e = true;
                        jzVar.C0();
                        return;
                    case 4:
                        jzVar.A0(false);
                        return;
                    default:
                        jzVar.f49252f = true;
                        jzVar.C0();
                        return;
                }
            }
        };
        ?? aVar = new rg.a(11, false);
        aVar.d = N02;
        aVar.f46666e = str;
        aVar.f46665c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new rg.a(2, false));
        arrayList2.add(bz.d(null));
        String N03 = org.telegram.messenger.gd.N0(2131750761, null);
        ?? aVar2 = new rg.a(0, false);
        aVar2.d = N03;
        arrayList2.add(aVar2);
        bz b10 = bz.b(2131232026, org.telegram.messenger.gd.N0(2131750801, null), false);
        b10.f46665c = new View.OnClickListener(this) {
            public final jz f49553b;

            {
                this.f49553b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                jz jzVar = this.f49553b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.ro roVar = jzVar.f49254r;
                        if (roVar != null && roVar.c()) {
                            org.telegram.ui.Components.g00.h1(jzVar, roVar.f26773a, new ny(jzVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                        String N032 = org.telegram.messenger.gd.N0(2131750778, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N032;
                        t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new my(jzVar, 1));
                        jzVar.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                            return;
                        }
                        return;
                    case 1:
                        jz.Z(jzVar);
                        return;
                    case 2:
                        jzVar.A0(true);
                        return;
                    case 3:
                        jzVar.f49251e = true;
                        jzVar.C0();
                        return;
                    case 4:
                        jzVar.A0(false);
                        return;
                    default:
                        jzVar.f49252f = true;
                        jzVar.C0();
                        return;
                }
            }
        };
        arrayList2.add(b10);
        int i11 = this.E;
        int i12 = org.telegram.messenger.mp.I8;
        if ((i11 & 1) != 0) {
            arrayList2.add(bz.c(1, org.telegram.messenger.gd.N0(2131750779, null), "contacts", true));
        }
        if ((this.E & 2) != 0) {
            arrayList2.add(bz.c(2, org.telegram.messenger.gd.N0(2131750706, null), "non_contacts", true));
        }
        if ((this.E & 4) != 0) {
            arrayList2.add(bz.c(4, org.telegram.messenger.gd.N0(2131750762, null), "groups", true));
        }
        if ((this.E & 8) != 0) {
            arrayList2.add(bz.c(8, org.telegram.messenger.gd.N0(2131750788, null), "channels", true));
        }
        if ((this.E & 16) != 0) {
            arrayList2.add(bz.c(16, org.telegram.messenger.gd.N0(2131750789, null), "bots", true));
        }
        int i13 = 5;
        if (!this.G.isEmpty()) {
            if (!this.f49251e && this.G.size() >= 8) {
                size2 = Math.min(5, this.G.size());
            } else {
                size2 = this.G.size();
            }
            int i14 = 0;
            while (i14 < size2) {
                long longValue = ((Long) this.G.get(i14)).longValue();
                int i15 = i13;
                ?? aVar3 = new rg.a(1, false);
                aVar3.f46668g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
                i14++;
                i13 = i15;
            }
            i7 = i13;
            if (size2 != this.G.size()) {
                bz b11 = bz.b(2131230871, org.telegram.messenger.gd.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b11.f46665c = new View.OnClickListener(this) {
                    public final jz f49553b;

                    {
                        this.f49553b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i112 = r2;
                        jz jzVar = this.f49553b;
                        switch (i112) {
                            case 0:
                                org.telegram.messenger.ro roVar = jzVar.f49254r;
                                if (roVar != null && roVar.c()) {
                                    org.telegram.ui.Components.g00.h1(jzVar, roVar.f26773a, new ny(jzVar, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                                String N032 = org.telegram.messenger.gd.N0(2131750778, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                t1Var.S = N032;
                                t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new my(jzVar, 1));
                                jzVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                                    return;
                                }
                                return;
                            case 1:
                                jz.Z(jzVar);
                                return;
                            case 2:
                                jzVar.A0(true);
                                return;
                            case 3:
                                jzVar.f49251e = true;
                                jzVar.C0();
                                return;
                            case 4:
                                jzVar.A0(false);
                                return;
                            default:
                                jzVar.f49252f = true;
                                jzVar.C0();
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        } else {
            i7 = 5;
        }
        arrayList2.add(bz.d(org.telegram.messenger.gd.N0(2131750760, null)));
        org.telegram.messenger.ro roVar = this.f49254r;
        if (!roVar.c()) {
            String N04 = org.telegram.messenger.gd.N0(2131750766, null);
            ?? aVar4 = new rg.a(0, false);
            aVar4.d = N04;
            arrayList2.add(aVar4);
            bz b12 = bz.b(2131232026, org.telegram.messenger.gd.N0(2131750703, null), false);
            b12.f46665c = new View.OnClickListener(this) {
                public final jz f49553b;

                {
                    this.f49553b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    jz jzVar = this.f49553b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.ro roVar2 = jzVar.f49254r;
                            if (roVar2 != null && roVar2.c()) {
                                org.telegram.ui.Components.g00.h1(jzVar, roVar2.f26773a, new ny(jzVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                            String N032 = org.telegram.messenger.gd.N0(2131750778, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = N032;
                            t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new my(jzVar, 1));
                            jzVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                                return;
                            }
                            return;
                        case 1:
                            jz.Z(jzVar);
                            return;
                        case 2:
                            jzVar.A0(true);
                            return;
                        case 3:
                            jzVar.f49251e = true;
                            jzVar.C0();
                            return;
                        case 4:
                            jzVar.A0(false);
                            return;
                        default:
                            jzVar.f49252f = true;
                            jzVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            int i16 = this.E;
            int i17 = org.telegram.messenger.mp.I8;
            if ((i16 & 32) != 0) {
                arrayList2.add(bz.c(32, org.telegram.messenger.gd.N0(2131750724, null), "muted", false));
            }
            if ((this.E & 64) != 0) {
                arrayList2.add(bz.c(64, org.telegram.messenger.gd.N0(2131750705, null), "read", false));
            }
            if ((this.E & 128) != 0) {
                arrayList2.add(bz.c(128, org.telegram.messenger.gd.N0(2131750792, null), "archived", false));
            }
            if (!this.H.isEmpty()) {
                if (!this.f49252f && this.H.size() >= 8) {
                    size = Math.min(i7, this.H.size());
                } else {
                    size = this.H.size();
                }
                for (int i18 = 0; i18 < size; i18++) {
                    long longValue2 = ((Long) this.H.get(i18)).longValue();
                    ?? aVar5 = new rg.a(1, false);
                    aVar5.f46668g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.H.size()) {
                    bz b13 = bz.b(2131230871, org.telegram.messenger.gd.G(this.H.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.f46665c = new View.OnClickListener(this) {
                        public final jz f49553b;

                        {
                            this.f49553b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i112 = r2;
                            jz jzVar = this.f49553b;
                            switch (i112) {
                                case 0:
                                    org.telegram.messenger.ro roVar2 = jzVar.f49254r;
                                    if (roVar2 != null && roVar2.c()) {
                                        org.telegram.ui.Components.g00.h1(jzVar, roVar2.f26773a, new ny(jzVar, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                                    String N032 = org.telegram.messenger.gd.N0(2131750778, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                    t1Var.S = N032;
                                    t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
                                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new my(jzVar, 1));
                                    jzVar.showDialog(t1Var);
                                    TextView textView = (TextView) t1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                                        return;
                                    }
                                    return;
                                case 1:
                                    jz.Z(jzVar);
                                    return;
                                case 2:
                                    jzVar.A0(true);
                                    return;
                                case 3:
                                    jzVar.f49251e = true;
                                    jzVar.C0();
                                    return;
                                case 4:
                                    jzVar.A0(false);
                                    return;
                                default:
                                    jzVar.f49252f = true;
                                    jzVar.C0();
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(bz.d(org.telegram.messenger.gd.N0(2131750765, null)));
        }
        if (getMessagesController().D7 || !getUserConfig().q()) {
            arrayList2.add(new rg.a(9, false));
            arrayList2.add(new rg.a(10, false));
            arrayList2.add(bz.d(org.telegram.messenger.gd.N0(2131750604, null)));
        }
        ArrayList arrayList3 = this.M;
        if (arrayList3.isEmpty()) {
            String N05 = org.telegram.messenger.gd.N0(2131750691, null);
            ?? aVar6 = new rg.a(0, false);
            aVar6.d = N05;
            aVar6.f46667f = true;
            arrayList2.add(aVar6);
            arrayList2.add(bz.b(2131232035, org.telegram.messenger.gd.N0(2131750690, null), false));
            arrayList2.add(bz.d(org.telegram.messenger.gd.N0(2131750731, null)));
        } else {
            String N06 = org.telegram.messenger.gd.N0(2131750733, null);
            ?? aVar7 = new rg.a(0, false);
            aVar7.d = N06;
            aVar7.f46667f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new rg.a(8, false));
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ?? aVar8 = new rg.a(7, false);
                aVar8.f46673m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i19);
                arrayList2.add(aVar8);
            }
            if (roVar.c()) {
                N0 = org.telegram.messenger.gd.N0(2131750731, null);
            } else {
                N0 = org.telegram.messenger.gd.N0(2131750732, null);
            }
            arrayList2.add(bz.d(N0));
        }
        if (!this.f49255s) {
            bz b14 = bz.b(0, org.telegram.messenger.gd.N0(2131750778, null), true);
            b14.f46665c = new View.OnClickListener(this) {
                public final jz f49553b;

                {
                    this.f49553b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    jz jzVar = this.f49553b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.ro roVar2 = jzVar.f49254r;
                            if (roVar2 != null && roVar2.c()) {
                                org.telegram.ui.Components.g00.h1(jzVar, roVar2.f26773a, new ny(jzVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                            String N032 = org.telegram.messenger.gd.N0(2131750778, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = N032;
                            t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new my(jzVar, 1));
                            jzVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                                return;
                            }
                            return;
                        case 1:
                            jz.Z(jzVar);
                            return;
                        case 2:
                            jzVar.A0(true);
                            return;
                        case 3:
                            jzVar.f49251e = true;
                            jzVar.C0();
                            return;
                        case 4:
                            jzVar.A0(false);
                            return;
                        default:
                            jzVar.f49252f = true;
                            jzVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(bz.d(null));
        }
        gz gzVar = this.f49249b;
        if (gzVar != null) {
            gzVar.E(arrayList, arrayList2);
        }
    }

    public final void D0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f49248a != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zl, false);
                if (x02 != this.W || x03 != this.X) {
                    this.W = x02;
                    this.X = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f49248a.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f49248a.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f49248a.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f49248a.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f49248a.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f49248a.V(i10);
                            } else if (i7 == 2) {
                                O = this.f49248a.P(i10);
                            } else {
                                O = this.f49248a.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.sa) {
                                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) O;
                                saVar.f31877b0 = true;
                                saVar.R = x02;
                                saVar.S = x03;
                                if (i7 != 0) {
                                    ((org.telegram.ui.Cells.sa) O).i(0);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29609li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return n0(true);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        boolean z10 = this.f49255s;
        org.telegram.messenger.ro roVar = this.f49254r;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131750716, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(roVar.f26774b, titleFontMetricsInt, false, null, 0), roVar.f26775c, titleFontMetricsInt, false));
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            if (z4Var != null) {
                int i11 = 26;
                if (z4Var.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.n5 titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.f49258y) {
                        i7 = 0;
                    } else {
                        i7 = 26;
                    }
                    titleTextView.setEmojiCacheType(i7);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.n5 titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.f49258y) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 4));
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        if (this.f49255s) {
            i10 = 2131751741;
        } else {
            i10 = 2131745750;
        }
        this.f49250c = z4Var2.s(org.telegram.messenger.gd.N0(i10, null));
        w8 w8Var = new w8(4, context, this);
        this.fragmentView = w8Var;
        dt dtVar = new dt(1, context, this);
        this.f49248a = dtVar;
        dtVar.r1();
        this.f49248a.setLayoutManager(new v4.c0(1, false));
        this.f49248a.setVerticalScrollBarEnabled(false);
        this.f49248a.setSectionsDrawBackground(true);
        w8Var.addView(this.f49248a, c8.na.c(-1.0f, -1));
        dt dtVar2 = this.f49248a;
        gz gzVar = new gz(this, context);
        this.f49249b = gzVar;
        dtVar2.setAdapter(gzVar);
        this.f49248a.setOnItemClickListener(new h(this, 10));
        this.f49248a.setOnItemLongClickListener(new my(this, 0));
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.n(350L);
        this.f49248a.setItemAnimator(lVar);
        this.f49248a.setOnScrollListener(new g3(this, 11));
        o0(false);
        if (!this.O && roVar != null && roVar.c()) {
            this.O = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = roVar.f26773a;
            this.N = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new qy(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f49248a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49248a, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.m8.class, org.telegram.ui.Cells.sa.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49248a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29672p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49248a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29691q6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49248a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49248a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.f29633n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean n0(boolean z10) {
        if (this.f49250c.f28919x.f57780f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean z11 = this.f49255s;
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                if (z11) {
                    t1Var.S = org.telegram.messenger.gd.N0(2131750771, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131750773, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131750772, null), new my(this, 2));
                } else {
                    t1Var.S = org.telegram.messenger.gd.N0(2131750770, null);
                    t1Var.U = org.telegram.messenger.gd.N0(2131750774, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754213, null), new my(this, 3));
                }
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747386, null), new my(this, 4));
                showDialog(t1Var);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void o0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f49257x) && this.f49257x.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.E & org.telegram.messenger.mp.J8) == 0 && this.G.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f49255s) {
                this.h = false;
                org.telegram.messenger.ro roVar = this.f49254r;
                if (roVar.h.size() != this.G.size()) {
                    this.h = true;
                }
                if (roVar.f26779i.size() != this.H.size()) {
                    this.h = true;
                }
                if (roVar.f26783m != this.F) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(roVar.h);
                    Collections.sort(this.G);
                    if (!roVar.h.equals(this.G)) {
                        this.h = true;
                    }
                    Collections.sort(roVar.f26779i);
                    Collections.sort(this.H);
                    if (!roVar.f26779i.equals(this.H)) {
                        this.h = true;
                    }
                }
                if (roVar.f26784n == (!this.f49258y) && TextUtils.equals(roVar.f26774b, this.f49257x) && roVar.f26778g == this.E) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        this.f49250c.a(z11, z10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.g3 g3Var;
        ez ezVar = this.L;
        if (ezVar != null && (g3Var = ezVar.f30887b) != null && g3Var.f41722e) {
            if (z10) {
                g3Var.k(true);
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
    public final void onInsets(int i7, int i10, int i11, int i12) {
        ez ezVar;
        View view = this.fragmentView;
        if (view != null && (ezVar = this.L) != null && ezVar.f30887b.f41722e) {
            view.requestLayout();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        C0();
        di.x7 x7Var = this.U;
        if (x7Var != null) {
            x7Var.run();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.Cells.g3 g3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            D0();
            try {
                ez ezVar = this.L;
                if (ezVar != null && (g3Var = ezVar.f30887b) != null && g3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.Fi)) != this.V) {
                    this.V = themedColor;
                    this.L.f30887b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void p0() {
        String N0;
        if (this.f49255s) {
            if (TextUtils.isEmpty(this.f49257x) || !this.f49253n) {
                int i7 = this.E;
                int i10 = org.telegram.messenger.mp.J8;
                int i11 = i7 & i10;
                String str = "";
                if ((i11 & i10) == i10) {
                    if ((i7 & 64) != 0) {
                        N0 = org.telegram.messenger.gd.N0(2131750718, null);
                    } else {
                        if ((i7 & 32) != 0) {
                            N0 = org.telegram.messenger.gd.N0(2131750719, null);
                        }
                        N0 = "";
                    }
                } else if ((i11 & 1) != 0) {
                    if ((i11 & (-2)) == 0) {
                        N0 = org.telegram.messenger.gd.N0(2131750779, null);
                    }
                    N0 = "";
                } else if ((i11 & 2) != 0) {
                    if ((i11 & (-3)) == 0) {
                        N0 = org.telegram.messenger.gd.N0(2131750706, null);
                    }
                    N0 = "";
                } else if ((i11 & 4) != 0) {
                    if ((i11 & (-5)) == 0) {
                        N0 = org.telegram.messenger.gd.N0(2131750762, null);
                    }
                    N0 = "";
                } else if ((i11 & 16) != 0) {
                    if ((i11 & (-17)) == 0) {
                        N0 = org.telegram.messenger.gd.N0(2131750789, null);
                    }
                    N0 = "";
                } else {
                    if ((i11 & 8) != 0 && (i11 & (-9)) == 0) {
                        N0 = org.telegram.messenger.gd.N0(2131750788, null);
                    }
                    N0 = "";
                }
                if (N0 == null || N0.length() <= 12) {
                    str = N0;
                }
                this.f49257x = str;
                zy zyVar = this.J;
                if (zyVar != null) {
                    zyVar.e(org.telegram.ui.Components.x5.cloneSpans(str, -1, zyVar.f54747s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                v4.f1 K = this.f49248a.K(this.d);
                if (K != null) {
                    this.f49249b.y(K);
                }
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i7 = 0;
            while (true) {
                arrayList = this.M;
                if (i7 < arrayList.size()) {
                    if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i7)).url, tL_exportedChatlistInvite.url)) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                arrayList.remove(i7);
                if (arrayList.isEmpty()) {
                    org.telegram.messenger.ro roVar = this.f49254r;
                    int i10 = roVar.f26778g;
                    int i11 = org.telegram.messenger.mp.I8;
                    roVar.f26778g = i10 & (-513);
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
        int i7 = 0;
        while (true) {
            arrayList = this.M;
            if (i7 < arrayList.size()) {
                if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i7)).url, tL_exportedChatlistInvite.url)) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i7, tL_exportedChatlistInvite);
        }
        C0();
    }

    public final void t0(int i7, boolean z10) {
        org.telegram.messenger.ro roVar;
        if (!this.T && (roVar = this.f49254r) != null && roVar.c() && roVar.e()) {
            this.T = true;
            this.U = new di.x7(this, z10, i7, 7);
            if (getLayoutContainer() != null) {
                this.U.run();
                this.U = null;
            }
        }
    }

    public final void u0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i7;
        if (arrayList != null) {
            i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!arrayList2.contains(arrayList.get(i10))) {
                    i7++;
                }
            }
            size = 0;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (!arrayList.contains(arrayList2.get(i11))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i7 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i7 = 0;
        }
        if (z10) {
            if (size > 0 && size > i7) {
                t0(size, true);
            } else if (i7 > 0) {
                t0(i7, false);
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
        hi.u3 u3Var = this.S;
        if (u3Var != null) {
            u3Var.f(true);
            this.S = null;
        }
        y0(new oy(this, 0), true);
    }

    public final void y0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f49257x};
        z0(this.f49254r, this.E, charSequenceArr[0].toString(), getMediaDataController().Y(charSequenceArr, false, true), true ^ this.f49258y, this.F, this.G, this.H, this.I, this.f49255s, false, this.h, true, z10, this, new org.telegram.ui.Components.voip.o(19, this, runnable));
    }
}
