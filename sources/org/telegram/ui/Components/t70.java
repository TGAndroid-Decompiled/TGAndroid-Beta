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
public final class t70 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList C;
    public static long D;
    public static long E;
    public static int F;
    public boolean A;
    public r70 B;
    public Drawable f32886b;
    public g00 f32887c;
    public p70 d;
    public TextView f32888e;
    public TextView f32889f;
    public ArrayList h;
    public boolean f32890n;
    public int f32891r;
    public int f32892s;
    public TLRPC.Peer v;
    public TLRPC.Peer f32893w;
    public TLRPC.InputPeer f32894x;
    public boolean f32895y;

    public static void m(t70 t70Var, r70 r70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(t70Var.currentAccount).getInputPeer(MessageObject.getPeerId(t70Var.v));
        if (t70Var.f32892s == 2) {
            if (t70Var.v != t70Var.f32893w) {
                boolean z10 = true;
                if (t70Var.h.size() <= 1) {
                    z10 = false;
                }
                r70Var.a(inputPeer, z10, false, false);
            }
        } else {
            t70Var.f32894x = inputPeer;
        }
        t70Var.dismiss();
    }

    public static void n(t70 t70Var) {
        t70Var.f32894x = MessagesController.getInstance(t70Var.currentAccount).getInputPeer(MessageObject.getPeerId(t70Var.v));
        t70Var.f32895y = true;
        t70Var.dismiss();
    }

    public static void o(t70 t70Var) {
        p70 p70Var = t70Var.d;
        if (t70Var.f32892s != 0) {
            if (p70Var.getChildCount() <= 0) {
                int paddingTop = p70Var.getPaddingTop();
                t70Var.f32891r = paddingTop;
                p70Var.setTopGlowOffset(paddingTop);
                t70Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = p70Var.getChildAt(0);
            vk0 vk0Var = (vk0) p70Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
                i10 = top;
            }
            if (t70Var.f32891r != i10) {
                t70Var.f32888e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                t70Var.f32889f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                t70Var.f32891r = i10;
                p70Var.setTopGlowOffset(i10);
                t70Var.containerView.invalidate();
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
        c2Var.setOnCancelListener(new l70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new jh.v(c2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            c2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, r70 r70Var) {
        if (context != null) {
            if (F == accountInstance.getCurrentAccount() && E == j10 && C != null && SystemClock.elapsedRealtime() - D < 300000) {
                if (C.size() == 1 && i10 != 0) {
                    r70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) C.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j10, C, o2Var, i10, peer, r70Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            c2Var.setOnCancelListener(new l70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new k70(c2Var, accountInstance, r70Var, j10, context, o2Var, i10, peer)), 0));
            try {
                c2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, r70 r70Var) {
        int i11;
        o70 o70Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                ar arVar = new ar(o2Var, arrayList, j10, r70Var);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(arVar);
                    return;
                } else {
                    arVar.show();
                    return;
                }
            }
            return;
        }
        ?? f3Var = new org.telegram.ui.ActionBar.f3(context, false);
        f3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        f3Var.h = arrayList2;
        f3Var.B = r70Var;
        f3Var.f32892s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        f3Var.f32886b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) f3Var.h.get(i15);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        f3Var.f32893w = peer2;
                        f3Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) f3Var.h.get(i16);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        f3Var.f32893w = peer3;
                        f3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = f3Var.f32886b;
            i11 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23108fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        f3Var.fixNavigationBar(i11);
        if (f3Var.f32892s == 0) {
            ?? n70Var = new n70(f3Var, context);
            n70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(n70Var);
            f3Var.setCustomView(nestedScrollView);
            o70Var = n70Var;
        } else {
            o70 o70Var2 = new o70(f3Var, context);
            f3Var.containerView = o70Var2;
            o70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = f3Var.containerView;
            int i17 = f3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            o70Var = o70Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(f3Var.currentAccount).getChat(Long.valueOf(-j10));
        p70 p70Var = new p70(f3Var, context);
        f3Var.d = p70Var;
        f3Var.getContext();
        if (f3Var.f32892s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        p70Var.setLayoutManager(new f2.j0(i12, false));
        p70Var.setAdapter(new s70(f3Var, context));
        p70Var.setVerticalScrollBarEnabled(false);
        p70Var.setClipToPadding(false);
        p70Var.setEnabled(true);
        p70Var.setSelectorDrawableColor(0);
        p70Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false));
        p70Var.setOnScrollListener(new q70(f3Var));
        p70Var.setOnItemClickListener(new eg.w0(12, f3Var, chat));
        if (i10 != 0) {
            o70Var.addView(p70Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            p70Var.setSelectorDrawableColor(0);
            p70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            o70Var.addView(imageView, i7.f6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        f3Var.f32888e = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            o70Var.addView(textView, i7.f6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            o70Var.addView(textView, i7.f6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(f3Var.getContext());
        f3Var.f32889f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23310r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = f3Var.h.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) f3Var.h.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(f3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        f3Var.f32889f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f3Var.f32889f.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23188k5, false));
        if (i10 == 0) {
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
            f3Var.f32889f.setText(sb2);
            f3Var.f32889f.setGravity(49);
            o70Var.addView(f3Var.f32889f, i7.f6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                f3Var.f32889f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                f3Var.f32889f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = f3Var.f32889f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            o70Var.addView(f3Var.f32889f, i7.f6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            p70 p70Var2 = f3Var.d;
            if (f3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            o70Var.addView(p70Var2, i7.f6.t(i14, 95, 49, 0, 6, 0, 0));
        }
        g00 g00Var = new g00(f3Var, context, false);
        f3Var.f32887c = g00Var;
        ((View) g00Var.f28693c).setOnClickListener(new t2(27, f3Var, r70Var));
        if (f3Var.f32892s == 0) {
            o70Var.addView(g00Var, i7.f6.t(-1, 50, 51, 0, 0, 0, 0));
            g00 g00Var2 = new g00(f3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                g00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                g00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) g00Var2.f28693c).setOnClickListener(new h0((Object) f3Var, 29));
            o70Var.addView(g00Var2, i7.f6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            o70Var.addView(g00Var, i7.f6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
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
        TLRPC.InputPeer inputPeer = this.f32894x;
        if (inputPeer != null) {
            r70 r70Var = this.B;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            r70Var.a(inputPeer, z10, this.f32895y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        String str;
        g00 g00Var = this.f32887c;
        if (this.f32892s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                g00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                g00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            g00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        g00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
