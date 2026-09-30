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
public final class k80 extends org.telegram.ui.ActionBar.e3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public i80 F;
    public Drawable f25680b;
    public o00 f25681c;
    public g80 d;
    public TextView e;
    public TextView f25682f;
    public ArrayList h;
    public boolean f25683n;
    public int f25684r;
    public int f25685s;
    public TLRPC.Peer v;
    public TLRPC.Peer f25686w;
    public TLRPC.InputPeer f25687x;
    public boolean f25688y;

    public static void m(k80 k80Var, i80 i80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(k80Var.currentAccount).getInputPeer(MessageObject.getPeerId(k80Var.v));
        if (k80Var.f25685s == 2) {
            if (k80Var.v != k80Var.f25686w) {
                boolean z10 = true;
                if (k80Var.h.size() <= 1) {
                    z10 = false;
                }
                i80Var.a(inputPeer, z10, false, false);
            }
        } else {
            k80Var.f25687x = inputPeer;
        }
        k80Var.dismiss();
    }

    public static void n(k80 k80Var) {
        k80Var.f25687x = MessagesController.getInstance(k80Var.currentAccount).getInputPeer(MessageObject.getPeerId(k80Var.v));
        k80Var.f25688y = true;
        k80Var.dismiss();
    }

    public static void o(k80 k80Var) {
        g80 g80Var = k80Var.d;
        if (k80Var.f25685s != 0) {
            if (g80Var.getChildCount() <= 0) {
                int paddingTop = g80Var.getPaddingTop();
                k80Var.f25684r = paddingTop;
                g80Var.setTopGlowOffset(paddingTop);
                k80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = g80Var.getChildAt(0);
            jl0 jl0Var = (jl0) g80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && jl0Var != null && jl0Var.b() == 0) {
                i10 = top;
            }
            if (k80Var.f25684r != i10) {
                k80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                k80Var.f25682f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                k80Var.f25684r = i10;
                g80Var.setTopGlowOffset(i10);
                k80Var.containerView.invalidate();
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
        a2Var.setOnCancelListener(new d80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(a2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            a2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, i80 i80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    i80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j3, G, m2Var, i10, peer, i80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            a2Var.setOnCancelListener(new d80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new c80(a2Var, accountInstance, i80Var, j3, context, m2Var, i10, peer)), 0));
            try {
                a2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, i80 i80Var) {
        int i11;
        f80 f80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                jr jrVar = new jr(m2Var, arrayList, j3, i80Var);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(jrVar);
                    return;
                } else {
                    jrVar.show();
                    return;
                }
            }
            return;
        }
        ?? e3Var = new org.telegram.ui.ActionBar.e3(context, false);
        e3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        e3Var.h = arrayList2;
        e3Var.F = i80Var;
        e3Var.f25685s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        e3Var.f25680b = mutate;
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
                        e3Var.f25686w = peer2;
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
                        e3Var.f25686w = peer3;
                        e3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = e3Var.f25680b;
            i11 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19120fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19146h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        e3Var.fixNavigationBar(i11);
        if (e3Var.f25685s == 0) {
            ?? e80Var = new e80(e3Var, context);
            e80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(e80Var);
            e3Var.setCustomView(nestedScrollView);
            f80Var = e80Var;
        } else {
            f80 f80Var2 = new f80(e3Var, context);
            e3Var.containerView = f80Var2;
            f80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = e3Var.containerView;
            int i17 = e3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            f80Var = f80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(e3Var.currentAccount).getChat(Long.valueOf(-j3));
        g80 g80Var = new g80(e3Var, context);
        e3Var.d = g80Var;
        e3Var.getContext();
        if (e3Var.f25685s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        g80Var.setLayoutManager(new s4.c0(i12, false));
        g80Var.setAdapter(new j80(e3Var, context));
        g80Var.setVerticalScrollBarEnabled(false);
        g80Var.setClipToPadding(false);
        g80Var.setEnabled(true);
        g80Var.setSelectorDrawableColor(0);
        g80Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A5, false));
        g80Var.setOnScrollListener(new h80(e3Var));
        g80Var.setOnItemClickListener(new ai.n6(11, e3Var, chat));
        if (i10 != 0) {
            f80Var.addView(g80Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            g80Var.setSelectorDrawableColor(0);
            g80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            f80Var.addView(imageView, w7.y5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        e3Var.e = textView;
        org.telegram.messenger.ok.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19267ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19182j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            f80Var.addView(textView, w7.y5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            f80Var.addView(textView, w7.y5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(e3Var.getContext());
        e3Var.f25682f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19286og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19332r5, false));
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
        e3Var.f25682f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        e3Var.f25682f.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19202k5, false));
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
            e3Var.f25682f.setText(sb2);
            e3Var.f25682f.setGravity(49);
            f80Var.addView(e3Var.f25682f, w7.y5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                e3Var.f25682f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                e3Var.f25682f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = e3Var.f25682f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            f80Var.addView(e3Var.f25682f, w7.y5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            g80 g80Var2 = e3Var.d;
            if (e3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            f80Var.addView(g80Var2, w7.y5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        o00 o00Var = new o00(e3Var, context, false);
        e3Var.f25681c = o00Var;
        ((View) o00Var.f26920c).setOnClickListener(new gt(9, e3Var, i80Var));
        if (e3Var.f25685s == 0) {
            f80Var.addView(o00Var, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
            o00 o00Var2 = new o00(e3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                o00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                o00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) o00Var2.f26920c).setOnClickListener(new f0((Object) e3Var, 29));
            f80Var.addView(o00Var2, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            f80Var.addView(o00Var, w7.y5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
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
        TLRPC.InputPeer inputPeer = this.f25687x;
        if (inputPeer != null) {
            i80 i80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            i80Var.a(inputPeer, z10, this.f25688y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        String str;
        o00 o00Var = this.f25681c;
        if (this.f25685s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                o00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                o00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            o00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        o00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
