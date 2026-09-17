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
public final class w70 extends org.telegram.ui.ActionBar.g3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public u70 F;
    public Drawable f29574b;
    public l00 f29575c;
    public s70 d;
    public TextView e;
    public TextView f29576f;
    public ArrayList h;
    public boolean f29577n;
    public int f29578r;
    public int f29579s;
    public TLRPC.Peer v;
    public TLRPC.Peer f29580w;
    public TLRPC.InputPeer f29581x;
    public boolean f29582y;

    public static void m(w70 w70Var, u70 u70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(w70Var.currentAccount).getInputPeer(MessageObject.getPeerId(w70Var.v));
        if (w70Var.f29579s == 2) {
            if (w70Var.v != w70Var.f29580w) {
                boolean z10 = true;
                if (w70Var.h.size() <= 1) {
                    z10 = false;
                }
                u70Var.a(inputPeer, z10, false, false);
            }
        } else {
            w70Var.f29581x = inputPeer;
        }
        w70Var.dismiss();
    }

    public static void n(w70 w70Var) {
        w70Var.f29581x = MessagesController.getInstance(w70Var.currentAccount).getInputPeer(MessageObject.getPeerId(w70Var.v));
        w70Var.f29582y = true;
        w70Var.dismiss();
    }

    public static void o(w70 w70Var) {
        s70 s70Var = w70Var.d;
        if (w70Var.f29579s != 0) {
            if (s70Var.getChildCount() <= 0) {
                int paddingTop = s70Var.getPaddingTop();
                w70Var.f29578r = paddingTop;
                s70Var.setTopGlowOffset(paddingTop);
                w70Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = s70Var.getChildAt(0);
            wk0 wk0Var = (wk0) s70Var.H(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && wk0Var != null && wk0Var.b() == 0) {
                i10 = top;
            }
            if (w70Var.f29578r != i10) {
                w70Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                w70Var.f29576f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                w70Var.f29578r = i10;
                s70Var.setTopGlowOffset(i10);
                w70Var.containerView.invalidate();
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
        c2Var.setOnCancelListener(new p70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(c2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            c2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, u70 u70Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    u70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j3, G, o2Var, i10, peer, u70Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            c2Var.setOnCancelListener(new p70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new o70(c2Var, accountInstance, u70Var, j3, context, o2Var, i10, peer)), 0));
            try {
                c2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, u70 u70Var) {
        int i11;
        r70 r70Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                gr grVar = new gr(o2Var, arrayList, j3, u70Var);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(grVar);
                    return;
                } else {
                    grVar.show();
                    return;
                }
            }
            return;
        }
        ?? g3Var = new org.telegram.ui.ActionBar.g3(context, false);
        g3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        g3Var.h = arrayList2;
        g3Var.F = u70Var;
        g3Var.f29579s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        g3Var.f29574b = mutate;
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
                        g3Var.f29580w = peer2;
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
                        g3Var.f29580w = peer3;
                        g3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                g3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = g3Var.f29574b;
            i11 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18906fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18933h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            g3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        g3Var.fixNavigationBar(i11);
        if (g3Var.f29579s == 0) {
            ?? q70Var = new q70(g3Var, context);
            q70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(q70Var);
            g3Var.setCustomView(nestedScrollView);
            r70Var = q70Var;
        } else {
            r70 r70Var2 = new r70(g3Var, context);
            g3Var.containerView = r70Var2;
            r70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = g3Var.containerView;
            int i17 = g3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            r70Var = r70Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(g3Var.currentAccount).getChat(Long.valueOf(-j3));
        s70 s70Var = new s70(g3Var, context);
        g3Var.d = s70Var;
        g3Var.getContext();
        if (g3Var.f29579s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        s70Var.setLayoutManager(new s4.c0(i12, false));
        s70Var.setAdapter(new v70(g3Var, context));
        s70Var.setVerticalScrollBarEnabled(false);
        s70Var.setClipToPadding(false);
        s70Var.setEnabled(true);
        s70Var.setSelectorDrawableColor(0);
        s70Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        s70Var.setOnScrollListener(new t70(g3Var));
        s70Var.setOnItemClickListener(new ai.o6(11, g3Var, chat));
        if (i10 != 0) {
            r70Var.addView(s70Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            s70Var.setSelectorDrawableColor(0);
            s70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            r70Var.addView(imageView, w7.x5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        g3Var.e = textView;
        org.telegram.messenger.wl.j(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19054ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18969j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            r70Var.addView(textView, w7.x5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            r70Var.addView(textView, w7.x5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(g3Var.getContext());
        g3Var.f29576f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19073og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19117r5, false));
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
        g3Var.f29576f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        g3Var.f29576f.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18989k5, false));
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
            g3Var.f29576f.setText(sb2);
            g3Var.f29576f.setGravity(49);
            r70Var.addView(g3Var.f29576f, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                g3Var.f29576f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                g3Var.f29576f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = g3Var.f29576f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            r70Var.addView(g3Var.f29576f, w7.x5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            s70 s70Var2 = g3Var.d;
            if (g3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            r70Var.addView(s70Var2, w7.x5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        l00 l00Var = new l00(g3Var, context, false);
        g3Var.f29575c = l00Var;
        ((View) l00Var.f25795c).setOnClickListener(new dt(9, g3Var, u70Var));
        if (g3Var.f29579s == 0) {
            r70Var.addView(l00Var, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
            l00 l00Var2 = new l00(g3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                l00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) l00Var2.f25795c).setOnClickListener(new f0((Object) g3Var, 29));
            r70Var.addView(l00Var2, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            r70Var.addView(l00Var, w7.x5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
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
        TLRPC.InputPeer inputPeer = this.f29581x;
        if (inputPeer != null) {
            u70 u70Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            u70Var.a(inputPeer, z10, this.f29582y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        String str;
        l00 l00Var = this.f29575c;
        if (this.f29579s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                l00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            l00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        l00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
