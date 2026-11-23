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
public final class kz extends org.telegram.ui.ActionBar.g2 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public final LongSparseIntArray I;
    public az J;
    public bz K;
    public fz L;
    public final ArrayList M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public float R;
    public hi.l3 S;
    public boolean T;
    public di.x7 U;
    public int V;
    public int W;
    public int X;
    public et f49426a;
    public hz f49427b;
    public org.telegram.ui.ActionBar.c5 f49428c;
    public int d;
    public boolean f49429e;
    public boolean f49430f;
    public boolean h;
    public boolean f49431n;
    public final org.telegram.messenger.so f49432r;
    public boolean f49433s;
    public boolean f49434w;
    public CharSequence f49435x;
    public boolean f49436y;

    public kz(org.telegram.messenger.so soVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f49436y = true;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = -5.0f;
        this.f49432r = soVar;
        if (soVar == null) {
            org.telegram.messenger.so soVar2 = new org.telegram.messenger.so();
            this.f49432r = soVar2;
            soVar2.f26886a = 2;
            while (getMessagesController().T0.get(this.f49432r.f26886a) != null) {
                this.f49432r.f26886a++;
            }
            org.telegram.messenger.so soVar3 = this.f49432r;
            soVar3.f26887b = "";
            soVar3.f26896m = (int) (Math.random() * 8.0d);
            this.f49433s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49432r.f26887b);
        this.f49435x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f49435x = m10;
        this.f49435x = org.telegram.messenger.gj.B5(m10, this.f49432r.f26888c, textPaint.getFontMetricsInt(), false);
        boolean z10 = !this.f49432r.f26897n;
        this.f49436y = z10;
        org.telegram.ui.Components.p5.r(this.currentAccount, z10);
        org.telegram.messenger.so soVar4 = this.f49432r;
        this.E = soVar4.f26891g;
        this.F = soVar4.f26896m;
        ArrayList arrayList2 = new ArrayList(this.f49432r.h);
        this.G = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.H = new ArrayList(this.f49432r.f26892i);
        this.I = this.f49432r.f26893j.clone();
    }

    public static CharSequence E0(int i7, CharSequence charSequence, boolean z10) {
        Context context;
        if (i7 >= 0) {
            SharedPreferences g12 = org.telegram.messenger.np.g1();
            if (!g12.getBoolean("n_" + i7, false) && (context = org.telegram.messenger.t0.f26931b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable g10 = i5.c.g(context, 2131232271);
                    g10.setBounds(0, -org.telegram.messenger.g0.L(8.0f), g10.getIntrinsicWidth(), g10.getIntrinsicHeight() - org.telegram.messenger.g0.L(8.0f));
                    spannableString.setSpan(new ImageSpan(g10, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable g11 = i5.c.g(context, 2131232269);
                    Drawable g13 = i5.c.g(context, 2131232270);
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ki, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    g11.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    g13.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false), mode));
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(g11, g13);
                    oqVar.setBounds(0, 0, oqVar.getIntrinsicWidth(), oqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(oqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static void Z(kz kzVar) {
        int i7;
        int i10;
        kzVar.f49436y = !kzVar.f49436y;
        bz bzVar = kzVar.K;
        if (bzVar != null) {
            org.telegram.ui.Cells.x3 x3Var = bzVar.f46340r;
            String str = null;
            if (q0(kzVar.f49435x)) {
                if (kzVar.f49436y) {
                    i10 = 2131750723;
                } else {
                    i10 = 2131750722;
                }
                str = org.telegram.messenger.hd.N0(i10, null);
            }
            x3Var.setText(str);
        }
        org.telegram.ui.Components.p5.r(kzVar.currentAccount, kzVar.f49436y);
        kzVar.o0(true);
        org.telegram.ui.ActionBar.z4 z4Var = kzVar.simpleActionBar;
        if (z4Var != null) {
            int i11 = 26;
            if (z4Var.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.m5 titleTextView = kzVar.simpleActionBar.getTitleTextView();
                if (kzVar.f49436y) {
                    i7 = 0;
                } else {
                    i7 = 26;
                }
                titleTextView.setEmojiCacheType(i7);
            }
            if (kzVar.simpleActionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.m5 titleTextView2 = kzVar.simpleActionBar.getTitleTextView2();
                if (kzVar.f49436y) {
                    i11 = 0;
                }
                titleTextView2.setEmojiCacheType(i11);
            }
        }
    }

    public static void a0(kz kzVar) {
        org.telegram.messenger.so soVar = kzVar.f49432r;
        if (kzVar.f49434w) {
            kzVar.f49434w = false;
            Paint.FontMetricsInt titleFontMetricsInt = kzVar.simpleActionBar.getTitleFontMetricsInt();
            Spannable B5 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(soVar.f26887b, titleFontMetricsInt, false, null, 0), soVar.f26888c, titleFontMetricsInt, false);
            org.telegram.ui.ActionBar.z4 z4Var = kzVar.simpleActionBar;
            z4Var.getClass();
            z4Var.I(B5, true, 220L, org.telegram.ui.Components.nr.h);
            return;
        }
        kzVar.finishFragment();
    }

    public static void b0(kz kzVar) {
        int i7;
        org.telegram.messenger.np messagesController = kzVar.getMessagesController();
        org.telegram.messenger.so soVar = kzVar.f49432r;
        messagesController.w5(soVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < soVar.h.size(); i10++) {
            long longValue = ((Long) soVar.h.get(i10)).longValue();
            if (longValue < 0 && m0(kzVar.getMessagesController().O0(Long.valueOf(-longValue)))) {
                arrayList.add(kzVar.getMessagesController().l1(longValue));
            }
        }
        if (kzVar.getUserConfig().q()) {
            i7 = kzVar.getMessagesController().R4;
        } else {
            i7 = kzVar.getMessagesController().Q4;
        }
        if (arrayList.size() > i7) {
            kzVar.showDialog(new ug.k0(4, kzVar.currentAccount, kzVar.getParentActivity(), kzVar, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = soVar.f26886a;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            kzVar.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new ry(kzVar, 1));
        } else {
            ky kyVar = new ky(soVar, null);
            kyVar.f49421y = new oy(kzVar, 1);
            kyVar.f49420x = new oy(kzVar, 2);
            kzVar.presentFragment(kyVar);
        }
    }

    public static org.telegram.ui.ActionBar.h6 i0(kz kzVar) {
        return kzVar.resourceProvider;
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
            org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.y5.class);
            if (y5VarArr != null && y5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(org.telegram.messenger.so soVar, int i7, String str, ArrayList arrayList, boolean z10, int i10, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.g2 g2Var, Runnable runnable) {
        if (soVar.f26891g != i7 || z13) {
            soVar.f26889e = -1;
            if (z14) {
                soVar.d = -1;
            }
        }
        soVar.f26891g = i7;
        soVar.f26887b = str;
        soVar.f26888c = arrayList;
        soVar.f26896m = i10;
        soVar.f26892i = arrayList3;
        soVar.h = arrayList2;
        soVar.f26897n = z10;
        if (z11) {
            g2Var.getMessagesController().g(soVar, z12);
        } else {
            g2Var.getMessagesController().D3(soVar);
        }
        org.telegram.messenger.ur messagesStorage = g2Var.getMessagesStorage();
        messagesStorage.f27250a.c(new org.telegram.messenger.yf(messagesStorage, soVar, z12, 9));
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList V0 = g2Var.getMessagesController().V0();
            int size = V0.size();
            for (int i11 = 0; i11 < size; i11 = com.google.android.gms.internal.vision.e2.f(((org.telegram.messenger.so) V0.get(i11)).f26886a, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            g2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.Components.lc lcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(4, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.f3.o(null, 2131750636, lcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.f3.o(null, 2131750635, lcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(5, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(12, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(13, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.f3.o(null, 2131748016, lcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(4, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new ug.k0(3, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, null).show();
            } else {
                org.telegram.messenger.f3.o(null, 2131743634, lcVar, null);
            }
        }
    }

    public static void z0(final org.telegram.messenger.so soVar, final int i7, final String str, final ArrayList arrayList, final boolean z10, final int i10, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.g2 g2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (g2Var == null || g2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = null;
        int i11 = 3;
        if (z15) {
            org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, g2Var.getParentActivity(), null);
            t1Var2.f30033j0 = false;
            t1Var2.show();
            t1Var = t1Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f28559id = soVar.f26886a;
        int i12 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i13 = org.telegram.messenger.np.I8;
        tL_dialogFilter.contacts = (i7 & 1) != 0;
        tL_dialogFilter.non_contacts = (i7 & 2) != 0;
        tL_dialogFilter.groups = (i7 & 4) != 0;
        tL_dialogFilter.broadcasts = (i7 & 8) != 0;
        tL_dialogFilter.bots = (i7 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i7 & 32) != 0;
        tL_dialogFilter.exclude_read = (i7 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i7 & 128) != 0;
        tL_dialogFilter.f28439id = soVar.f26886a;
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
        org.telegram.messenger.np messagesController = g2Var.getMessagesController();
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
                final org.telegram.messenger.so soVar2 = soVar;
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
                            kz.v0(soVar2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, g2Var2, runnable3);
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
        v0(soVar, i7, str, arrayList, z10, i10, arrayList2, arrayList3, z11, z12, z13, z14, g2Var, null);
    }

    public final void A0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.G;
        } else {
            arrayList = this.H;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.E, arrayList, z10);
        usersSelectActivity.G = this.f49432r.c();
        usersSelectActivity.f43944n = new ab.z(7, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void B0(cz czVar, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        if (z10) {
            t1Var.S = org.telegram.messenger.hd.N0(2131750695, null);
            if (obj instanceof String) {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750696, charSequence);
            } else if (obj instanceof TLRPC.User) {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750694, charSequence);
            } else {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750697, charSequence);
            }
        } else {
            t1Var.S = org.telegram.messenger.hd.N0(2131750700, null);
            if (obj instanceof String) {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750701, charSequence);
            } else if (obj instanceof TLRPC.User) {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750699, charSequence);
            } else {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750702, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744612, null), new ab.j(this, czVar, z10, 8));
        showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
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
        String N02 = org.telegram.messenger.hd.N0(2131750721, null);
        if (q0(this.f49435x)) {
            if (this.f49436y) {
                i10 = 2131750723;
            } else {
                i10 = 2131750722;
            }
            str = org.telegram.messenger.hd.N0(i10, null);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final kz f49726b;

            {
                this.f49726b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                kz kzVar = this.f49726b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.so soVar = kzVar.f49432r;
                        if (soVar != null && soVar.c()) {
                            org.telegram.ui.Components.i00.h1(kzVar, soVar.f26886a, new oy(kzVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                        String N03 = org.telegram.messenger.hd.N0(2131750778, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                        t1Var.S = N03;
                        t1Var.U = org.telegram.messenger.hd.N0(2131750777, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ny(kzVar, 1));
                        kzVar.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                            return;
                        }
                        return;
                    case 1:
                        kz.Z(kzVar);
                        return;
                    case 2:
                        kzVar.A0(true);
                        return;
                    case 3:
                        kzVar.f49429e = true;
                        kzVar.C0();
                        return;
                    case 4:
                        kzVar.A0(false);
                        return;
                    default:
                        kzVar.f49430f = true;
                        kzVar.C0();
                        return;
                }
            }
        };
        ?? aVar = new rg.a(11, false);
        aVar.d = N02;
        aVar.f46833e = str;
        aVar.f46832c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new rg.a(2, false));
        arrayList2.add(cz.d(null));
        String N03 = org.telegram.messenger.hd.N0(2131750761, null);
        ?? aVar2 = new rg.a(0, false);
        aVar2.d = N03;
        arrayList2.add(aVar2);
        cz b10 = cz.b(2131232023, org.telegram.messenger.hd.N0(2131750801, null), false);
        b10.f46832c = new View.OnClickListener(this) {
            public final kz f49726b;

            {
                this.f49726b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                kz kzVar = this.f49726b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.so soVar = kzVar.f49432r;
                        if (soVar != null && soVar.c()) {
                            org.telegram.ui.Components.i00.h1(kzVar, soVar.f26886a, new oy(kzVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                        String N032 = org.telegram.messenger.hd.N0(2131750778, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                        t1Var.S = N032;
                        t1Var.U = org.telegram.messenger.hd.N0(2131750777, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ny(kzVar, 1));
                        kzVar.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                            return;
                        }
                        return;
                    case 1:
                        kz.Z(kzVar);
                        return;
                    case 2:
                        kzVar.A0(true);
                        return;
                    case 3:
                        kzVar.f49429e = true;
                        kzVar.C0();
                        return;
                    case 4:
                        kzVar.A0(false);
                        return;
                    default:
                        kzVar.f49430f = true;
                        kzVar.C0();
                        return;
                }
            }
        };
        arrayList2.add(b10);
        int i11 = this.E;
        int i12 = org.telegram.messenger.np.I8;
        if ((i11 & 1) != 0) {
            arrayList2.add(cz.c(1, org.telegram.messenger.hd.N0(2131750779, null), "contacts", true));
        }
        if ((this.E & 2) != 0) {
            arrayList2.add(cz.c(2, org.telegram.messenger.hd.N0(2131750706, null), "non_contacts", true));
        }
        if ((this.E & 4) != 0) {
            arrayList2.add(cz.c(4, org.telegram.messenger.hd.N0(2131750762, null), "groups", true));
        }
        if ((this.E & 8) != 0) {
            arrayList2.add(cz.c(8, org.telegram.messenger.hd.N0(2131750788, null), "channels", true));
        }
        if ((this.E & 16) != 0) {
            arrayList2.add(cz.c(16, org.telegram.messenger.hd.N0(2131750789, null), "bots", true));
        }
        int i13 = 5;
        if (!this.G.isEmpty()) {
            if (!this.f49429e && this.G.size() >= 8) {
                size2 = Math.min(5, this.G.size());
            } else {
                size2 = this.G.size();
            }
            int i14 = 0;
            while (i14 < size2) {
                long longValue = ((Long) this.G.get(i14)).longValue();
                int i15 = i13;
                ?? aVar3 = new rg.a(1, false);
                aVar3.f46835g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
                i14++;
                i13 = i15;
            }
            i7 = i13;
            if (size2 != this.G.size()) {
                cz b11 = cz.b(2131230871, org.telegram.messenger.hd.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b11.f46832c = new View.OnClickListener(this) {
                    public final kz f49726b;

                    {
                        this.f49726b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i112 = r2;
                        kz kzVar = this.f49726b;
                        switch (i112) {
                            case 0:
                                org.telegram.messenger.so soVar = kzVar.f49432r;
                                if (soVar != null && soVar.c()) {
                                    org.telegram.ui.Components.i00.h1(kzVar, soVar.f26886a, new oy(kzVar, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                                String N032 = org.telegram.messenger.hd.N0(2131750778, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                t1Var.S = N032;
                                t1Var.U = org.telegram.messenger.hd.N0(2131750777, null);
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ny(kzVar, 1));
                                kzVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                                    return;
                                }
                                return;
                            case 1:
                                kz.Z(kzVar);
                                return;
                            case 2:
                                kzVar.A0(true);
                                return;
                            case 3:
                                kzVar.f49429e = true;
                                kzVar.C0();
                                return;
                            case 4:
                                kzVar.A0(false);
                                return;
                            default:
                                kzVar.f49430f = true;
                                kzVar.C0();
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        } else {
            i7 = 5;
        }
        arrayList2.add(cz.d(org.telegram.messenger.hd.N0(2131750760, null)));
        org.telegram.messenger.so soVar = this.f49432r;
        if (!soVar.c()) {
            String N04 = org.telegram.messenger.hd.N0(2131750766, null);
            ?? aVar4 = new rg.a(0, false);
            aVar4.d = N04;
            arrayList2.add(aVar4);
            cz b12 = cz.b(2131232023, org.telegram.messenger.hd.N0(2131750703, null), false);
            b12.f46832c = new View.OnClickListener(this) {
                public final kz f49726b;

                {
                    this.f49726b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    kz kzVar = this.f49726b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.so soVar2 = kzVar.f49432r;
                            if (soVar2 != null && soVar2.c()) {
                                org.telegram.ui.Components.i00.h1(kzVar, soVar2.f26886a, new oy(kzVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                            String N032 = org.telegram.messenger.hd.N0(2131750778, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                            t1Var.S = N032;
                            t1Var.U = org.telegram.messenger.hd.N0(2131750777, null);
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ny(kzVar, 1));
                            kzVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                                return;
                            }
                            return;
                        case 1:
                            kz.Z(kzVar);
                            return;
                        case 2:
                            kzVar.A0(true);
                            return;
                        case 3:
                            kzVar.f49429e = true;
                            kzVar.C0();
                            return;
                        case 4:
                            kzVar.A0(false);
                            return;
                        default:
                            kzVar.f49430f = true;
                            kzVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            int i16 = this.E;
            int i17 = org.telegram.messenger.np.I8;
            if ((i16 & 32) != 0) {
                arrayList2.add(cz.c(32, org.telegram.messenger.hd.N0(2131750724, null), "muted", false));
            }
            if ((this.E & 64) != 0) {
                arrayList2.add(cz.c(64, org.telegram.messenger.hd.N0(2131750705, null), "read", false));
            }
            if ((this.E & 128) != 0) {
                arrayList2.add(cz.c(128, org.telegram.messenger.hd.N0(2131750792, null), "archived", false));
            }
            if (!this.H.isEmpty()) {
                if (!this.f49430f && this.H.size() >= 8) {
                    size = Math.min(i7, this.H.size());
                } else {
                    size = this.H.size();
                }
                for (int i18 = 0; i18 < size; i18++) {
                    long longValue2 = ((Long) this.H.get(i18)).longValue();
                    ?? aVar5 = new rg.a(1, false);
                    aVar5.f46835g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.H.size()) {
                    cz b13 = cz.b(2131230871, org.telegram.messenger.hd.G(this.H.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.f46832c = new View.OnClickListener(this) {
                        public final kz f49726b;

                        {
                            this.f49726b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i112 = r2;
                            kz kzVar = this.f49726b;
                            switch (i112) {
                                case 0:
                                    org.telegram.messenger.so soVar2 = kzVar.f49432r;
                                    if (soVar2 != null && soVar2.c()) {
                                        org.telegram.ui.Components.i00.h1(kzVar, soVar2.f26886a, new oy(kzVar, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                                    String N032 = org.telegram.messenger.hd.N0(2131750778, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                    t1Var.S = N032;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131750777, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ny(kzVar, 1));
                                    kzVar.showDialog(t1Var);
                                    TextView textView = (TextView) t1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                                        return;
                                    }
                                    return;
                                case 1:
                                    kz.Z(kzVar);
                                    return;
                                case 2:
                                    kzVar.A0(true);
                                    return;
                                case 3:
                                    kzVar.f49429e = true;
                                    kzVar.C0();
                                    return;
                                case 4:
                                    kzVar.A0(false);
                                    return;
                                default:
                                    kzVar.f49430f = true;
                                    kzVar.C0();
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(cz.d(org.telegram.messenger.hd.N0(2131750765, null)));
        }
        if (getMessagesController().D7 || !getUserConfig().q()) {
            arrayList2.add(new rg.a(9, false));
            arrayList2.add(new rg.a(10, false));
            arrayList2.add(cz.d(org.telegram.messenger.hd.N0(2131750604, null)));
        }
        ArrayList arrayList3 = this.M;
        if (arrayList3.isEmpty()) {
            String N05 = org.telegram.messenger.hd.N0(2131750691, null);
            ?? aVar6 = new rg.a(0, false);
            aVar6.d = N05;
            aVar6.f46834f = true;
            arrayList2.add(aVar6);
            arrayList2.add(cz.b(2131232032, org.telegram.messenger.hd.N0(2131750690, null), false));
            arrayList2.add(cz.d(org.telegram.messenger.hd.N0(2131750731, null)));
        } else {
            String N06 = org.telegram.messenger.hd.N0(2131750733, null);
            ?? aVar7 = new rg.a(0, false);
            aVar7.d = N06;
            aVar7.f46834f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new rg.a(8, false));
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ?? aVar8 = new rg.a(7, false);
                aVar8.f46840m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i19);
                arrayList2.add(aVar8);
            }
            if (soVar.c()) {
                N0 = org.telegram.messenger.hd.N0(2131750731, null);
            } else {
                N0 = org.telegram.messenger.hd.N0(2131750732, null);
            }
            arrayList2.add(cz.d(N0));
        }
        if (!this.f49433s) {
            cz b14 = cz.b(0, org.telegram.messenger.hd.N0(2131750778, null), true);
            b14.f46832c = new View.OnClickListener(this) {
                public final kz f49726b;

                {
                    this.f49726b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    kz kzVar = this.f49726b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.so soVar2 = kzVar.f49432r;
                            if (soVar2 != null && soVar2.c()) {
                                org.telegram.ui.Components.i00.h1(kzVar, soVar2.f26886a, new oy(kzVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                            String N032 = org.telegram.messenger.hd.N0(2131750778, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                            t1Var.S = N032;
                            t1Var.U = org.telegram.messenger.hd.N0(2131750777, null);
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ny(kzVar, 1));
                            kzVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                                return;
                            }
                            return;
                        case 1:
                            kz.Z(kzVar);
                            return;
                        case 2:
                            kzVar.A0(true);
                            return;
                        case 3:
                            kzVar.f49429e = true;
                            kzVar.C0();
                            return;
                        case 4:
                            kzVar.A0(false);
                            return;
                        default:
                            kzVar.f49430f = true;
                            kzVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(cz.d(null));
        }
        hz hzVar = this.f49427b;
        if (hzVar != null) {
            hzVar.E(arrayList, arrayList2);
        }
    }

    public final void D0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f49426a != null) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zl, false);
                if (x02 != this.W || x03 != this.X) {
                    this.W = x02;
                    this.X = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f49426a.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f49426a.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f49426a.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f49426a.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f49426a.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f49426a.V(i10);
                            } else if (i7 == 2) {
                                O = this.f49426a.P(i10);
                            } else {
                                O = this.f49426a.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.ra) {
                                org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) O;
                                raVar.f31756b0 = true;
                                raVar.R = x02;
                                raVar.S = x03;
                                if (i7 != 0) {
                                    ((org.telegram.ui.Cells.ra) O).i(0);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29773y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29539li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
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
        this.simpleActionBar.setBackButtonImage(2131231240);
        boolean z10 = this.f49433s;
        org.telegram.messenger.so soVar = this.f49432r;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131750716, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(soVar.f26887b, titleFontMetricsInt, false, null, 0), soVar.f26888c, titleFontMetricsInt, false));
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            if (z4Var != null) {
                int i11 = 26;
                if (z4Var.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.m5 titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.f49436y) {
                        i7 = 0;
                    } else {
                        i7 = 26;
                    }
                    titleTextView.setEmojiCacheType(i7);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.m5 titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.f49436y) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 4));
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        if (this.f49433s) {
            i10 = 2131751741;
        } else {
            i10 = 2131745750;
        }
        this.f49428c = z4Var2.s(org.telegram.messenger.hd.N0(i10, null));
        w8 w8Var = new w8(4, context, this);
        this.fragmentView = w8Var;
        et etVar = new et(1, context, this);
        this.f49426a = etVar;
        etVar.r1();
        this.f49426a.setLayoutManager(new v4.c0(1, false));
        this.f49426a.setVerticalScrollBarEnabled(false);
        this.f49426a.setSectionsDrawBackground(true);
        w8Var.addView(this.f49426a, c8.ma.c(-1.0f, -1));
        et etVar2 = this.f49426a;
        hz hzVar = new hz(this, context);
        this.f49427b = hzVar;
        etVar2.setAdapter(hzVar);
        this.f49426a.setOnItemClickListener(new h(this, 10));
        this.f49426a.setOnItemLongClickListener(new ny(this, 0));
        v4.k kVar = new v4.k();
        kVar.f59194m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.n(350L);
        this.f49426a.setItemAnimator(kVar);
        this.f49426a.setOnScrollListener(new g3(this, 11));
        o0(false);
        if (!this.O && soVar != null && soVar.c()) {
            this.O = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = soVar.f26886a;
            this.N = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new ry(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f49426a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49426a, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.n8.class, org.telegram.ui.Cells.ra.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29381d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49426a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29602p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49426a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29621q6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49426a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49426a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29563n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean n0(boolean z10) {
        if (this.f49428c.f28858x.f57701f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean z11 = this.f49433s;
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                if (z11) {
                    t1Var.S = org.telegram.messenger.hd.N0(2131750771, null);
                    t1Var.U = org.telegram.messenger.hd.N0(2131750773, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131750772, null), new ny(this, 2));
                } else {
                    t1Var.S = org.telegram.messenger.hd.N0(2131750770, null);
                    t1Var.U = org.telegram.messenger.hd.N0(2131750774, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754213, null), new ny(this, 3));
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131747386, null), new ny(this, 4));
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
        if (!TextUtils.isEmpty(this.f49435x) && this.f49435x.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.E & org.telegram.messenger.np.J8) == 0 && this.G.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f49433s) {
                this.h = false;
                org.telegram.messenger.so soVar = this.f49432r;
                if (soVar.h.size() != this.G.size()) {
                    this.h = true;
                }
                if (soVar.f26892i.size() != this.H.size()) {
                    this.h = true;
                }
                if (soVar.f26896m != this.F) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(soVar.h);
                    Collections.sort(this.G);
                    if (!soVar.h.equals(this.G)) {
                        this.h = true;
                    }
                    Collections.sort(soVar.f26892i);
                    Collections.sort(this.H);
                    if (!soVar.f26892i.equals(this.H)) {
                        this.h = true;
                    }
                }
                if (soVar.f26897n == (!this.f49436y) && TextUtils.equals(soVar.f26887b, this.f49435x) && soVar.f26891g == this.E) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        this.f49428c.a(z11, z10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.g3 g3Var;
        fz fzVar = this.L;
        if (fzVar != null && (g3Var = fzVar.f30831b) != null && g3Var.f42537e) {
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
        fz fzVar;
        View view = this.fragmentView;
        if (view != null && (fzVar = this.L) != null && fzVar.f30831b.f42537e) {
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
                fz fzVar = this.L;
                if (fzVar != null && (g3Var = fzVar.f30831b) != null && g3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.Fi)) != this.V) {
                    this.V = themedColor;
                    this.L.f30831b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
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
        if (this.f49433s) {
            if (TextUtils.isEmpty(this.f49435x) || !this.f49431n) {
                int i7 = this.E;
                int i10 = org.telegram.messenger.np.J8;
                int i11 = i7 & i10;
                String str = "";
                if ((i11 & i10) == i10) {
                    if ((i7 & 64) != 0) {
                        N0 = org.telegram.messenger.hd.N0(2131750718, null);
                    } else {
                        if ((i7 & 32) != 0) {
                            N0 = org.telegram.messenger.hd.N0(2131750719, null);
                        }
                        N0 = "";
                    }
                } else if ((i11 & 1) != 0) {
                    if ((i11 & (-2)) == 0) {
                        N0 = org.telegram.messenger.hd.N0(2131750779, null);
                    }
                    N0 = "";
                } else if ((i11 & 2) != 0) {
                    if ((i11 & (-3)) == 0) {
                        N0 = org.telegram.messenger.hd.N0(2131750706, null);
                    }
                    N0 = "";
                } else if ((i11 & 4) != 0) {
                    if ((i11 & (-5)) == 0) {
                        N0 = org.telegram.messenger.hd.N0(2131750762, null);
                    }
                    N0 = "";
                } else if ((i11 & 16) != 0) {
                    if ((i11 & (-17)) == 0) {
                        N0 = org.telegram.messenger.hd.N0(2131750789, null);
                    }
                    N0 = "";
                } else {
                    if ((i11 & 8) != 0 && (i11 & (-9)) == 0) {
                        N0 = org.telegram.messenger.hd.N0(2131750788, null);
                    }
                    N0 = "";
                }
                if (N0 == null || N0.length() <= 12) {
                    str = N0;
                }
                this.f49435x = str;
                az azVar = this.J;
                if (azVar != null) {
                    azVar.e(org.telegram.ui.Components.y5.cloneSpans(str, -1, azVar.f45735s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                v4.f1 K = this.f49426a.K(this.d);
                if (K != null) {
                    this.f49427b.y(K);
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
                    org.telegram.messenger.so soVar = this.f49432r;
                    int i10 = soVar.f26891g;
                    int i11 = org.telegram.messenger.np.I8;
                    soVar.f26891g = i10 & (-513);
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
        org.telegram.messenger.so soVar;
        if (!this.T && (soVar = this.f49432r) != null && soVar.c() && soVar.e()) {
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
        hi.l3 l3Var = this.S;
        if (l3Var != null) {
            l3Var.f(true);
            this.S = null;
        }
        y0(new py(this, 0), true);
    }

    public final void y0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f49435x};
        z0(this.f49432r, this.E, charSequenceArr[0].toString(), getMediaDataController().Y(charSequenceArr, false, true), true ^ this.f49436y, this.F, this.G, this.H, this.I, this.f49433s, false, this.h, true, z10, this, new ss(15, this, runnable));
    }
}
