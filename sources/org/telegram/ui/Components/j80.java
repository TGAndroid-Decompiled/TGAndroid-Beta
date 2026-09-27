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
public final class j80 extends org.telegram.ui.ActionBar.g3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public h80 F;
    public Drawable f25378b;
    public n00 f25379c;
    public f80 d;
    public TextView e;
    public TextView f25380f;
    public ArrayList h;
    public boolean f25381n;
    public int f25382r;
    public int f25383s;
    public TLRPC.Peer v;
    public TLRPC.Peer f25384w;
    public TLRPC.InputPeer f25385x;
    public boolean f25386y;

    public static void m(j80 j80Var, h80 h80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(j80Var.currentAccount).getInputPeer(MessageObject.getPeerId(j80Var.v));
        if (j80Var.f25383s == 2) {
            if (j80Var.v != j80Var.f25384w) {
                boolean z10 = true;
                if (j80Var.h.size() <= 1) {
                    z10 = false;
                }
                h80Var.a(inputPeer, z10, false, false);
            }
        } else {
            j80Var.f25385x = inputPeer;
        }
        j80Var.dismiss();
    }

    public static void n(j80 j80Var) {
        j80Var.f25385x = MessagesController.getInstance(j80Var.currentAccount).getInputPeer(MessageObject.getPeerId(j80Var.v));
        j80Var.f25386y = true;
        j80Var.dismiss();
    }

    public static void o(j80 j80Var) {
        f80 f80Var = j80Var.d;
        if (j80Var.f25383s != 0) {
            if (f80Var.getChildCount() <= 0) {
                int paddingTop = f80Var.getPaddingTop();
                j80Var.f25382r = paddingTop;
                f80Var.setTopGlowOffset(paddingTop);
                j80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = f80Var.getChildAt(0);
            il0 il0Var = (il0) f80Var.H(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && il0Var != null && il0Var.b() == 0) {
                i10 = top;
            }
            if (j80Var.f25382r != i10) {
                j80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                j80Var.f25380f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                j80Var.f25382r = i10;
                f80Var.setTopGlowOffset(i10);
                j80Var.containerView.invalidate();
            }
        }
    }

    public static void t(Activity activity, long j3, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            boolean z10 = true;
            if (G.size() != 1) {
                z10 = false;
            }
            booleanCallback.run(z10);
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        c2Var.setOnCancelListener(new c80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(c2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            c2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, h80 h80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    h80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j3, G, o2Var, i10, peer, h80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            c2Var.setOnCancelListener(new c80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new b80(c2Var, accountInstance, h80Var, j3, context, o2Var, i10, peer)), 0));
            try {
                c2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, h80 h80Var) {
        int i11;
        e80 e80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                ir irVar = new ir(o2Var, arrayList, j3, h80Var);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(irVar);
                    return;
                } else {
                    irVar.show();
                    return;
                }
            }
            return;
        }
        ?? g3Var = new org.telegram.ui.ActionBar.g3(context, false);
        g3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        g3Var.h = arrayList2;
        g3Var.F = h80Var;
        g3Var.f25383s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        g3Var.f25378b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) g3Var.h.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        g3Var.f25384w = peer2;
                        g3Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) g3Var.h.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        g3Var.f25384w = peer3;
                        g3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                g3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = g3Var.f25378b;
            i11 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19101fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19128h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            g3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        g3Var.fixNavigationBar(i11);
        if (g3Var.f25383s == 0) {
            ?? d80Var = new d80(g3Var, context);
            d80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(d80Var);
            g3Var.setCustomView(nestedScrollView);
            e80Var = d80Var;
        } else {
            e80 e80Var2 = new e80(g3Var, context);
            g3Var.containerView = e80Var2;
            e80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = g3Var.containerView;
            int i17 = g3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            e80Var = e80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(g3Var.currentAccount).getChat(Long.valueOf(-j3));
        f80 f80Var = new f80(g3Var, context);
        g3Var.d = f80Var;
        g3Var.getContext();
        if (g3Var.f25383s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        f80Var.setLayoutManager(new s4.c0(i12, false));
        f80Var.setAdapter(new i80(g3Var, context));
        f80Var.setVerticalScrollBarEnabled(false);
        f80Var.setClipToPadding(false);
        f80Var.setEnabled(true);
        f80Var.setSelectorDrawableColor(0);
        f80Var.setGlowColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.A5, false));
        f80Var.setOnScrollListener(new g80(g3Var));
        f80Var.setOnItemClickListener(new ai.n6(11, g3Var, chat));
        if (i10 != 0) {
            e80Var.addView(f80Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            f80Var.setSelectorDrawableColor(0);
            f80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            e80Var.addView(imageView, w7.y5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        g3Var.e = textView;
        org.telegram.messenger.qk.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19249ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19164j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            e80Var.addView(textView, w7.y5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            e80Var.addView(textView, w7.y5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(g3Var.getContext());
        g3Var.f25380f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19268og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19315r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = g3Var.h.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) g3Var.h.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(g3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        g3Var.f25380f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        g3Var.f25380f.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19184k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (g3Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                g3Var.d.setVisibility(8);
            }
            g3Var.f25380f.setText(sb2);
            g3Var.f25380f.setGravity(49);
            e80Var.addView(g3Var.f25380f, w7.y5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                g3Var.f25380f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                g3Var.f25380f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = g3Var.f25380f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            e80Var.addView(g3Var.f25380f, w7.y5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            f80 f80Var2 = g3Var.d;
            if (g3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            e80Var.addView(f80Var2, w7.y5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        n00 n00Var = new n00(g3Var, context, false);
        g3Var.f25379c = n00Var;
        ((View) n00Var.f26677c).setOnClickListener(new ft(9, g3Var, h80Var));
        if (g3Var.f25383s == 0) {
            e80Var.addView(n00Var, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
            n00 n00Var2 = new n00(g3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                n00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                n00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) n00Var2.f26677c).setOnClickListener(new f0((Object) g3Var, 29));
            e80Var.addView(n00Var2, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            e80Var.addView(n00Var, w7.y5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        g3Var.w(chat, false);
        if (o2Var != 0) {
            if (o2Var.getParentActivity() != null) {
                o2Var.showDialog(g3Var);
                return;
            }
            return;
        }
        g3Var.show();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f25385x;
        if (inputPeer != null) {
            h80 h80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            h80Var.a(inputPeer, z10, this.f25386y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        String str;
        n00 n00Var = this.f25379c;
        if (this.f25383s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                n00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                n00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            n00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        n00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
