package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class c90 extends org.telegram.ui.ActionBar.e3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public a90 F;
    public Drawable f24859b;
    public e10 f24860c;
    public y80 d;
    public TextView f24861e;
    public TextView f24862f;
    public ArrayList h;
    public boolean f24863n;
    public int f24864r;
    public int f24865s;
    public TLRPC.Peer v;
    public TLRPC.Peer f24866w;
    public TLRPC.InputPeer f24867x;
    public boolean f24868y;

    public static void o(c90 c90Var, a90 a90Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(c90Var.currentAccount).getInputPeer(MessageObject.getPeerId(c90Var.v));
        if (c90Var.f24865s == 2) {
            if (c90Var.v != c90Var.f24866w) {
                boolean z10 = true;
                if (c90Var.h.size() <= 1) {
                    z10 = false;
                }
                a90Var.a(inputPeer, z10, false, false);
            }
        } else {
            c90Var.f24867x = inputPeer;
        }
        c90Var.dismiss();
    }

    public static void p(c90 c90Var) {
        c90Var.f24867x = MessagesController.getInstance(c90Var.currentAccount).getInputPeer(MessageObject.getPeerId(c90Var.v));
        c90Var.f24868y = true;
        c90Var.dismiss();
    }

    public static void q(c90 c90Var) {
        y80 y80Var = c90Var.d;
        if (c90Var.f24865s != 0) {
            if (y80Var.getChildCount() <= 0) {
                int paddingTop = y80Var.getPaddingTop();
                c90Var.f24864r = paddingTop;
                y80Var.setTopGlowOffset(paddingTop);
                c90Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = y80Var.getChildAt(0);
            gm0 gm0Var = (gm0) y80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && gm0Var != null && gm0Var.b() == 0) {
                i10 = top;
            }
            if (c90Var.f24864r != i10) {
                c90Var.f24861e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                c90Var.f24862f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                c90Var.f24864r = i10;
                y80Var.setTopGlowOffset(i10);
                c90Var.containerView.invalidate();
            }
        }
    }

    public static void v(Activity activity, long j3, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            boolean z10 = true;
            if (G.size() != 1) {
                z10 = false;
            }
            booleanCallback.run(z10);
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        a2Var.setOnCancelListener(new u80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new v80(a2Var, j3, accountInstance, booleanCallback)), 1));
        try {
            a2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, a90 a90Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    a90Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    x(context, j3, G, m2Var, i10, peer, a90Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            a2Var.setOnCancelListener(new u80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new t80(a2Var, accountInstance, a90Var, j3, context, m2Var, i10, peer)), 0));
            try {
                a2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, a90 a90Var) {
        int i11;
        x80 x80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                zr zrVar = new zr(m2Var, arrayList, j3, a90Var);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(zrVar);
                    return;
                } else {
                    zrVar.show();
                    return;
                }
            }
            return;
        }
        ?? e3Var = new org.telegram.ui.ActionBar.e3(context, false);
        e3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        e3Var.h = arrayList2;
        e3Var.F = a90Var;
        e3Var.f24865s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        e3Var.f24859b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) e3Var.h.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        e3Var.f24866w = peer2;
                        e3Var.v = peer2;
                        break;
                    }
                    i15++;
                }
            } else if (peer != null) {
                long peerId = MessageObject.getPeerId(peer);
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) e3Var.h.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        e3Var.f24866w = peer3;
                        e3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = e3Var.f24859b;
            i11 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20606fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20631h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        e3Var.fixNavigationBar(i11);
        if (e3Var.f24865s == 0) {
            ?? w80Var = new w80(e3Var, context);
            w80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(w80Var);
            e3Var.setCustomView(nestedScrollView);
            x80Var = w80Var;
        } else {
            x80 x80Var2 = new x80(e3Var, context);
            e3Var.containerView = x80Var2;
            x80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = e3Var.containerView;
            int i17 = e3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            x80Var = x80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(e3Var.currentAccount).getChat(Long.valueOf(-j3));
        y80 y80Var = new y80(e3Var, context);
        e3Var.d = y80Var;
        e3Var.getContext();
        if (e3Var.f24865s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        y80Var.setLayoutManager(new s4.d0(i12, false));
        y80Var.setAdapter(new b90(e3Var, context));
        y80Var.setVerticalScrollBarEnabled(false);
        y80Var.setClipToPadding(false);
        y80Var.setEnabled(true);
        y80Var.setSelectorDrawableColor(0);
        y80Var.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false));
        y80Var.setOnScrollListener(new z80(e3Var));
        y80Var.setOnItemClickListener(new ai.o6(11, e3Var, chat));
        if (i10 != 0) {
            x80Var.addView(y80Var, w7.w5.a(-1.0f, 0.0f, 100.0f, 0.0f, 80.0f, -1, 51));
        } else {
            y80Var.setSelectorDrawableColor(0);
            y80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            x80Var.addView(imageView, w7.w5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        e3Var.f24861e = textView;
        org.telegram.messenger.am.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20753ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20668j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            x80Var.addView(textView, w7.w5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            x80Var.addView(textView, w7.w5.a(-2.0f, 23.0f, 8.0f, 23.0f, 0.0f, -2, 51));
        }
        TextView textView2 = new TextView(e3Var.getContext());
        e3Var.f24862f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20771og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20818r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = e3Var.h.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) e3Var.h.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(e3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        e3Var.f24862f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        e3Var.f24862f.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20687k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (e3Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                e3Var.d.setVisibility(8);
            }
            e3Var.f24862f.setText(sb2);
            e3Var.f24862f.setGravity(49);
            x80Var.addView(e3Var.f24862f, w7.w5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                e3Var.f24862f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                e3Var.f24862f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = e3Var.f24862f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            x80Var.addView(e3Var.f24862f, w7.w5.a(-2.0f, 23.0f, 0.0f, 23.0f, 5.0f, -2, 51));
        }
        if (i10 == 0) {
            y80 y80Var2 = e3Var.d;
            if (e3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            x80Var.addView(y80Var2, w7.w5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        e10 e10Var = new e10(e3Var, context, false);
        e3Var.f24860c = e10Var;
        ((View) e10Var.f25543c).setOnClickListener(new xt(9, e3Var, a90Var));
        if (e3Var.f24865s == 0) {
            x80Var.addView(e10Var, w7.w5.t(-1, 50, 51, 0, 0, 0, 0));
            e10 e10Var2 = new e10(e3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                e10Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                e10Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) e10Var2.f25543c).setOnClickListener(new f0((Object) e3Var, 28));
            x80Var.addView(e10Var2, w7.w5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            x80Var.addView(e10Var, w7.w5.a(50.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        }
        e3Var.y(chat, false);
        if (m2Var != 0) {
            if (m2Var.getParentActivity() != null) {
                m2Var.showDialog(e3Var);
                return;
            }
            return;
        }
        e3Var.show();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f24867x;
        if (inputPeer != null) {
            a90 a90Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            a90Var.a(inputPeer, z10, this.f24868y, false);
        }
    }

    public final void y(TLRPC.Chat chat, boolean z10) {
        String str;
        e10 e10Var = this.f24860c;
        if (this.f24865s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                e10Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                e10Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            e10Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        e10Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
