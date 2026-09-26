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
public final class i80 extends org.telegram.ui.ActionBar.e3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public g80 F;
    public Drawable f24997b;
    public n00 f24998c;
    public e80 d;
    public TextView e;
    public TextView f24999f;
    public ArrayList h;
    public boolean f25000n;
    public int f25001r;
    public int f25002s;
    public TLRPC.Peer v;
    public TLRPC.Peer f25003w;
    public TLRPC.InputPeer f25004x;
    public boolean f25005y;

    public static void m(i80 i80Var, g80 g80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i80Var.currentAccount).getInputPeer(MessageObject.getPeerId(i80Var.v));
        if (i80Var.f25002s == 2) {
            if (i80Var.v != i80Var.f25003w) {
                boolean z10 = true;
                if (i80Var.h.size() <= 1) {
                    z10 = false;
                }
                g80Var.a(inputPeer, z10, false, false);
            }
        } else {
            i80Var.f25004x = inputPeer;
        }
        i80Var.dismiss();
    }

    public static void n(i80 i80Var) {
        i80Var.f25004x = MessagesController.getInstance(i80Var.currentAccount).getInputPeer(MessageObject.getPeerId(i80Var.v));
        i80Var.f25005y = true;
        i80Var.dismiss();
    }

    public static void o(i80 i80Var) {
        e80 e80Var = i80Var.d;
        if (i80Var.f25002s != 0) {
            if (e80Var.getChildCount() <= 0) {
                int paddingTop = e80Var.getPaddingTop();
                i80Var.f25001r = paddingTop;
                e80Var.setTopGlowOffset(paddingTop);
                i80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = e80Var.getChildAt(0);
            hl0 hl0Var = (hl0) e80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && hl0Var != null && hl0Var.b() == 0) {
                i10 = top;
            }
            if (i80Var.f25001r != i10) {
                i80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                i80Var.f24999f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                i80Var.f25001r = i10;
                e80Var.setTopGlowOffset(i10);
                i80Var.containerView.invalidate();
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
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        a2Var.setOnCancelListener(new b80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(a2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            a2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, g80 g80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    g80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j3, G, m2Var, i10, peer, g80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            a2Var.setOnCancelListener(new b80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new a80(a2Var, accountInstance, g80Var, j3, context, m2Var, i10, peer)), 0));
            try {
                a2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, g80 g80Var) {
        int i11;
        d80 d80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                ir irVar = new ir(m2Var, arrayList, j3, g80Var);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(irVar);
                    return;
                } else {
                    irVar.show();
                    return;
                }
            }
            return;
        }
        ?? e3Var = new org.telegram.ui.ActionBar.e3(context, false);
        e3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        e3Var.h = arrayList2;
        e3Var.F = g80Var;
        e3Var.f25002s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        e3Var.f24997b = mutate;
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
                        e3Var.f25003w = peer2;
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
                        e3Var.f25003w = peer3;
                        e3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = e3Var.f24997b;
            i11 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19103fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        e3Var.fixNavigationBar(i11);
        if (e3Var.f25002s == 0) {
            ?? c80Var = new c80(e3Var, context);
            c80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(c80Var);
            e3Var.setCustomView(nestedScrollView);
            d80Var = c80Var;
        } else {
            d80 d80Var2 = new d80(e3Var, context);
            e3Var.containerView = d80Var2;
            d80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = e3Var.containerView;
            int i17 = e3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            d80Var = d80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(e3Var.currentAccount).getChat(Long.valueOf(-j3));
        e80 e80Var = new e80(e3Var, context);
        e3Var.d = e80Var;
        e3Var.getContext();
        if (e3Var.f25002s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        e80Var.setLayoutManager(new s4.c0(i12, false));
        e80Var.setAdapter(new h80(e3Var, context));
        e80Var.setVerticalScrollBarEnabled(false);
        e80Var.setClipToPadding(false);
        e80Var.setEnabled(true);
        e80Var.setSelectorDrawableColor(0);
        e80Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A5, false));
        e80Var.setOnScrollListener(new f80(e3Var));
        e80Var.setOnItemClickListener(new ai.n6(11, e3Var, chat));
        if (i10 != 0) {
            d80Var.addView(e80Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            e80Var.setSelectorDrawableColor(0);
            e80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            d80Var.addView(imageView, w7.y5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        e3Var.e = textView;
        org.telegram.messenger.ok.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19250ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            d80Var.addView(textView, w7.y5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            d80Var.addView(textView, w7.y5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(e3Var.getContext());
        e3Var.f24999f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19269og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19315r5, false));
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
        e3Var.f24999f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        e3Var.f24999f.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19185k5, false));
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
            e3Var.f24999f.setText(sb2);
            e3Var.f24999f.setGravity(49);
            d80Var.addView(e3Var.f24999f, w7.y5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                e3Var.f24999f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                e3Var.f24999f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = e3Var.f24999f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            d80Var.addView(e3Var.f24999f, w7.y5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            e80 e80Var2 = e3Var.d;
            if (e3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            d80Var.addView(e80Var2, w7.y5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        n00 n00Var = new n00(e3Var, context, false);
        e3Var.f24998c = n00Var;
        ((View) n00Var.f26634c).setOnClickListener(new ft(9, e3Var, g80Var));
        if (e3Var.f25002s == 0) {
            d80Var.addView(n00Var, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
            n00 n00Var2 = new n00(e3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                n00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                n00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) n00Var2.f26634c).setOnClickListener(new f0((Object) e3Var, 29));
            d80Var.addView(n00Var2, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            d80Var.addView(n00Var, w7.y5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        e3Var.w(chat, false);
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
        TLRPC.InputPeer inputPeer = this.f25004x;
        if (inputPeer != null) {
            g80 g80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            g80Var.a(inputPeer, z10, this.f25005y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        String str;
        n00 n00Var = this.f24998c;
        if (this.f25002s == 0) {
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
