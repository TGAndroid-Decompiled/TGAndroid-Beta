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
public final class g70 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList C;
    public static long D;
    public static long E;
    public static int F;
    public boolean A;
    public e70 B;
    public Drawable f28666b;
    public wz f28667c;
    public c70 d;
    public TextView f28668e;
    public TextView f28669f;
    public ArrayList h;
    public boolean f28670n;
    public int f28671r;
    public int f28672s;
    public TLRPC.Peer v;
    public TLRPC.Peer f28673w;
    public TLRPC.InputPeer f28674x;
    public boolean f28675y;

    public static void m(g70 g70Var, e70 e70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(g70Var.currentAccount).getInputPeer(MessageObject.getPeerId(g70Var.v));
        if (g70Var.f28672s == 2) {
            if (g70Var.v != g70Var.f28673w) {
                boolean z10 = true;
                if (g70Var.h.size() <= 1) {
                    z10 = false;
                }
                e70Var.a(inputPeer, z10, false, false);
            }
        } else {
            g70Var.f28674x = inputPeer;
        }
        g70Var.dismiss();
    }

    public static void n(g70 g70Var) {
        g70Var.f28674x = MessagesController.getInstance(g70Var.currentAccount).getInputPeer(MessageObject.getPeerId(g70Var.v));
        g70Var.f28675y = true;
        g70Var.dismiss();
    }

    public static void o(g70 g70Var) {
        c70 c70Var = g70Var.d;
        if (g70Var.f28672s != 0) {
            if (c70Var.getChildCount() <= 0) {
                int paddingTop = c70Var.getPaddingTop();
                g70Var.f28671r = paddingTop;
                c70Var.setTopGlowOffset(paddingTop);
                g70Var.containerView.invalidate();
                return;
            }
            int i9 = 0;
            View childAt = c70Var.getChildAt(0);
            ik0 ik0Var = (ik0) c70Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && ik0Var != null && ik0Var.b() == 0) {
                i9 = top;
            }
            if (g70Var.f28671r != i9) {
                g70Var.f28668e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                g70Var.f28669f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                g70Var.f28671r = i9;
                c70Var.setTopGlowOffset(i9);
                g70Var.containerView.invalidate();
            }
        }
    }

    public static void t(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (F == accountInstance.getCurrentAccount() && E == j10 && C != null && SystemClock.elapsedRealtime() - D < 240000) {
            boolean z10 = true;
            if (C.size() != 1) {
                z10 = false;
            }
            booleanCallback.run(z10);
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        c2Var.setOnCancelListener(new z60(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new gh.w(c2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            c2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.Peer peer, e70 e70Var) {
        if (context != null) {
            if (F == accountInstance.getCurrentAccount() && E == j10 && C != null && SystemClock.elapsedRealtime() - D < 300000) {
                if (C.size() == 1 && i9 != 0) {
                    e70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) C.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j10, C, o2Var, i9, peer, e70Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            c2Var.setOnCancelListener(new z60(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new y60(c2Var, accountInstance, e70Var, j10, context, o2Var, i9, peer)), 0));
            try {
                c2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.Peer peer, e70 e70Var) {
        int i10;
        b70 b70Var;
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (i9 == 0) {
            if (!arrayList.isEmpty()) {
                wq wqVar = new wq(o2Var, arrayList, j10, e70Var);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(wqVar);
                    return;
                } else {
                    wqVar.show();
                    return;
                }
            }
            return;
        }
        ?? f3Var = new org.telegram.ui.ActionBar.f3(context, false);
        f3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        f3Var.h = arrayList2;
        f3Var.B = e70Var;
        f3Var.f28672s = i9;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        f3Var.f28666b = mutate;
        if (i9 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) f3Var.h.get(i14);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        f3Var.f28673w = peer2;
                        f3Var.v = peer2;
                        break;
                    }
                    i14++;
                }
            } else if (peer != null) {
                long peerId = MessageObject.getPeerId(peer);
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) f3Var.h.get(i15);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        f3Var.f28673w = peer3;
                        f3Var.v = peer3;
                        break;
                    }
                    i15++;
                }
            } else {
                f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = f3Var.f28666b;
            i10 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23046fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i10 = w02;
        }
        f3Var.fixNavigationBar(i10);
        if (f3Var.f28672s == 0) {
            ?? a70Var = new a70(f3Var, context);
            a70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(a70Var);
            f3Var.setCustomView(nestedScrollView);
            b70Var = a70Var;
        } else {
            b70 b70Var2 = new b70(f3Var, context);
            f3Var.containerView = b70Var2;
            b70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = f3Var.containerView;
            int i16 = f3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i16, 0, i16, 0);
            b70Var = b70Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(f3Var.currentAccount).getChat(Long.valueOf(-j10));
        c70 c70Var = new c70(f3Var, context);
        f3Var.d = c70Var;
        f3Var.getContext();
        if (f3Var.f28672s == 0) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        c70Var.setLayoutManager(new f2.m0(i11, false));
        c70Var.setAdapter(new f70(f3Var, context));
        c70Var.setVerticalScrollBarEnabled(false);
        c70Var.setClipToPadding(false);
        c70Var.setEnabled(true);
        c70Var.setSelectorDrawableColor(0);
        c70Var.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A5, false));
        c70Var.setOnScrollListener(new d70(f3Var));
        c70Var.setOnItemClickListener(new bg.b1(13, f3Var, chat));
        if (i9 != 0) {
            b70Var.addView(c70Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            c70Var.setSelectorDrawableColor(0);
            c70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i9 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            b70Var.addView(imageView, g7.e6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        f3Var.f28668e = textView;
        org.telegram.messenger.ll.k(20.0f, 1, textView);
        if (i9 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23188ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i9 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            b70Var.addView(textView, g7.e6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i9 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            b70Var.addView(textView, g7.e6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(f3Var.getContext());
        f3Var.f28669f = textView2;
        if (i9 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23203og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23247r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = f3Var.h.size();
        for (int i17 = 0; i17 < size3; i17++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) f3Var.h.get(i17));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(f3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        f3Var.f28669f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f3Var.f28669f.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23126k5, false));
        if (i9 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (f3Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                f3Var.d.setVisibility(8);
            }
            f3Var.f28669f.setText(sb2);
            f3Var.f28669f.setGravity(49);
            b70Var.addView(f3Var.f28669f, g7.e6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                f3Var.f28669f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                f3Var.f28669f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = f3Var.f28669f;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView3.setGravity(i12 | 48);
            b70Var.addView(f3Var.f28669f, g7.e6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i9 == 0) {
            c70 c70Var2 = f3Var.d;
            if (f3Var.h.size() < 5) {
                i13 = -2;
            } else {
                i13 = -1;
            }
            b70Var.addView(c70Var2, g7.e6.t(i13, 95, 49, 0, 6, 0, 0));
        }
        wz wzVar = new wz(f3Var, context, false);
        f3Var.f28667c = wzVar;
        ((View) wzVar.f34476c).setOnClickListener(new s2(26, f3Var, e70Var));
        if (f3Var.f28672s == 0) {
            b70Var.addView(wzVar, g7.e6.t(-1, 50, 51, 0, 0, 0, 0));
            wz wzVar2 = new wz(f3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                wzVar2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                wzVar2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) wzVar2.f34476c).setOnClickListener(new f0((Object) f3Var, 29));
            b70Var.addView(wzVar2, g7.e6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            b70Var.addView(wzVar, g7.e6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        f3Var.w(chat, false);
        if (o2Var != 0) {
            if (o2Var.getParentActivity() != null) {
                o2Var.showDialog(f3Var);
                return;
            }
            return;
        }
        f3Var.show();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f28674x;
        if (inputPeer != null) {
            e70 e70Var = this.B;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            e70Var.a(inputPeer, z10, this.f28675y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        String str;
        wz wzVar = this.f28667c;
        if (this.f28672s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                wzVar.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                wzVar.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            wzVar.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i9 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        wzVar.a(LocaleController.formatString("VoipGroupContinueAs", i9, str), z10);
    }
}
