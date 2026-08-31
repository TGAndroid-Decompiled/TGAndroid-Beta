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
public final class a80 extends org.telegram.ui.ActionBar.h3 {
    public static ArrayList D;
    public static long E;
    public static long F;
    public static int G;
    public boolean B;
    public y70 C;
    public Drawable f25195b;
    public m00 f25196c;
    public w70 d;
    public TextView f25197e;
    public TextView f25198f;
    public ArrayList h;
    public boolean f25199n;
    public int f25200r;
    public int f25201s;
    public TLRPC.Peer v;
    public TLRPC.Peer f25202w;
    public TLRPC.InputPeer f25203x;
    public boolean f25204y;

    public static void m(a80 a80Var, y70 y70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(a80Var.currentAccount).getInputPeer(MessageObject.getPeerId(a80Var.v));
        if (a80Var.f25201s == 2) {
            if (a80Var.v != a80Var.f25202w) {
                boolean z4 = true;
                if (a80Var.h.size() <= 1) {
                    z4 = false;
                }
                y70Var.a(inputPeer, z4, false, false);
            }
        } else {
            a80Var.f25203x = inputPeer;
        }
        a80Var.dismiss();
    }

    public static void n(a80 a80Var) {
        a80Var.f25203x = MessagesController.getInstance(a80Var.currentAccount).getInputPeer(MessageObject.getPeerId(a80Var.v));
        a80Var.f25204y = true;
        a80Var.dismiss();
    }

    public static void o(a80 a80Var) {
        w70 w70Var = a80Var.d;
        if (a80Var.f25201s != 0) {
            if (w70Var.getChildCount() <= 0) {
                int paddingTop = w70Var.getPaddingTop();
                a80Var.f25200r = paddingTop;
                w70Var.setTopGlowOffset(paddingTop);
                a80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = w70Var.getChildAt(0);
            fl0 fl0Var = (fl0) w70Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
                i10 = top;
            }
            if (a80Var.f25200r != i10) {
                a80Var.f25197e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                a80Var.f25198f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                a80Var.f25200r = i10;
                w70Var.setTopGlowOffset(i10);
                a80Var.containerView.invalidate();
            }
        }
    }

    public static void t(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (G == accountInstance.getCurrentAccount() && F == j10 && D != null && SystemClock.elapsedRealtime() - E < 240000) {
            boolean z4 = true;
            if (D.size() != 1) {
                z4 = false;
            }
            booleanCallback.run(z4);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        d2Var.setOnCancelListener(new s70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new mh.u(d2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            d2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, y70 y70Var) {
        if (context != null) {
            if (G == accountInstance.getCurrentAccount() && F == j10 && D != null && SystemClock.elapsedRealtime() - E < 300000) {
                if (D.size() == 1 && i10 != 0) {
                    y70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) D.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j10, D, p2Var, i10, peer, y70Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            d2Var.setOnCancelListener(new s70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new r70(d2Var, accountInstance, y70Var, j10, context, p2Var, i10, peer)), 0));
            try {
                d2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, y70 y70Var) {
        int i11;
        v70 v70Var;
        int i12;
        boolean z4;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                gr grVar = new gr(p2Var, arrayList, j10, y70Var);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(grVar);
                    return;
                } else {
                    grVar.show();
                    return;
                }
            }
            return;
        }
        ?? h3Var = new org.telegram.ui.ActionBar.h3(context, false);
        h3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        h3Var.h = arrayList2;
        h3Var.C = y70Var;
        h3Var.f25201s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        h3Var.f25195b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) h3Var.h.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        h3Var.f25202w = peer2;
                        h3Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) h3Var.h.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        h3Var.f25202w = peer3;
                        h3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                h3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = h3Var.f25195b;
            i11 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21705fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            h3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        h3Var.fixNavigationBar(i11);
        if (h3Var.f25201s == 0) {
            ?? u70Var = new u70(h3Var, context);
            u70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(u70Var);
            h3Var.setCustomView(nestedScrollView);
            v70Var = u70Var;
        } else {
            v70 v70Var2 = new v70(h3Var, context);
            h3Var.containerView = v70Var2;
            v70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = h3Var.containerView;
            int i17 = h3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            v70Var = v70Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(h3Var.currentAccount).getChat(Long.valueOf(-j10));
        w70 w70Var = new w70(h3Var, context);
        h3Var.d = w70Var;
        h3Var.getContext();
        if (h3Var.f25201s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        w70Var.setLayoutManager(new f2.j0(i12, false));
        w70Var.setAdapter(new z70(h3Var, context));
        w70Var.setVerticalScrollBarEnabled(false);
        w70Var.setClipToPadding(false);
        w70Var.setEnabled(true);
        w70Var.setSelectorDrawableColor(0);
        w70Var.setGlowColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A5, false));
        w70Var.setOnScrollListener(new x70(h3Var));
        w70Var.setOnItemClickListener(new hg.v0(11, h3Var, chat));
        if (i10 != 0) {
            v70Var.addView(w70Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            w70Var.setSelectorDrawableColor(0);
            w70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            v70Var.addView(imageView, k7.c6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        h3Var.f25197e = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21848ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            v70Var.addView(textView, k7.c6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            v70Var.addView(textView, k7.c6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(h3Var.getContext());
        h3Var.f25198f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21866og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21911r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = h3Var.h.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) h3Var.h.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(h3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        h3Var.f25198f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        h3Var.f25198f.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21784k5, false));
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (h3Var.h.size() > 1) {
                sb.append("\n\n");
                sb.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                h3Var.d.setVisibility(8);
            }
            h3Var.f25198f.setText(sb);
            h3Var.f25198f.setGravity(49);
            v70Var.addView(h3Var.f25198f, k7.c6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z4) {
                h3Var.f25198f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                h3Var.f25198f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = h3Var.f25198f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            v70Var.addView(h3Var.f25198f, k7.c6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            w70 w70Var2 = h3Var.d;
            if (h3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            v70Var.addView(w70Var2, k7.c6.t(i14, 95, 49, 0, 6, 0, 0));
        }
        m00 m00Var = new m00(h3Var, context, false);
        h3Var.f25196c = m00Var;
        ((View) m00Var.f28874c).setOnClickListener(new w2(24, h3Var, y70Var));
        if (h3Var.f25201s == 0) {
            v70Var.addView(m00Var, k7.c6.t(-1, 50, 51, 0, 0, 0, 0));
            m00 m00Var2 = new m00(h3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                m00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                m00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) m00Var2.f28874c).setOnClickListener(new g0((Object) h3Var, 29));
            v70Var.addView(m00Var2, k7.c6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            v70Var.addView(m00Var, k7.c6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        h3Var.w(chat, false);
        if (p2Var != 0) {
            if (p2Var.getParentActivity() != null) {
                p2Var.showDialog(h3Var);
                return;
            }
            return;
        }
        h3Var.show();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f25203x;
        if (inputPeer != null) {
            y70 y70Var = this.C;
            boolean z4 = true;
            if (this.h.size() <= 1) {
                z4 = false;
            }
            y70Var.a(inputPeer, z4, this.f25204y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z4) {
        String str;
        m00 m00Var = this.f25196c;
        if (this.f25201s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                m00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z4);
                return;
            } else {
                m00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z4);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            m00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z4);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        m00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z4);
    }
}
