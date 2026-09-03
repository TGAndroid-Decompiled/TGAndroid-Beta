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
public final class z70 extends org.telegram.ui.ActionBar.g3 {
    public static ArrayList D;
    public static long E;
    public static long F;
    public static int G;
    public boolean B;
    public x70 C;
    public Drawable f31270b;
    public l00 f31271c;
    public v70 d;
    public TextView e;
    public TextView f31272f;
    public ArrayList h;
    public boolean f31273n;
    public int f31274r;
    public int f31275s;
    public TLRPC.Peer v;
    public TLRPC.Peer f31276w;
    public TLRPC.InputPeer f31277x;
    public boolean f31278y;

    public static void m(z70 z70Var, x70 x70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(z70Var.currentAccount).getInputPeer(MessageObject.getPeerId(z70Var.v));
        if (z70Var.f31275s == 2) {
            if (z70Var.v != z70Var.f31276w) {
                boolean z4 = true;
                if (z70Var.h.size() <= 1) {
                    z4 = false;
                }
                x70Var.a(inputPeer, z4, false, false);
            }
        } else {
            z70Var.f31277x = inputPeer;
        }
        z70Var.dismiss();
    }

    public static void n(z70 z70Var) {
        z70Var.f31277x = MessagesController.getInstance(z70Var.currentAccount).getInputPeer(MessageObject.getPeerId(z70Var.v));
        z70Var.f31278y = true;
        z70Var.dismiss();
    }

    public static void o(z70 z70Var) {
        v70 v70Var = z70Var.d;
        if (z70Var.f31275s != 0) {
            if (v70Var.getChildCount() <= 0) {
                int paddingTop = v70Var.getPaddingTop();
                z70Var.f31274r = paddingTop;
                v70Var.setTopGlowOffset(paddingTop);
                z70Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = v70Var.getChildAt(0);
            dl0 dl0Var = (dl0) v70Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && dl0Var != null && dl0Var.b() == 0) {
                i10 = top;
            }
            if (z70Var.f31274r != i10) {
                z70Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                z70Var.f31272f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                z70Var.f31274r = i10;
                v70Var.setTopGlowOffset(i10);
                z70Var.containerView.invalidate();
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
        d2Var.setOnCancelListener(new r70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new lh.v(d2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            d2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, x70 x70Var) {
        if (context != null) {
            if (G == accountInstance.getCurrentAccount() && F == j10 && D != null && SystemClock.elapsedRealtime() - E < 300000) {
                if (D.size() == 1 && i10 != 0) {
                    x70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) D.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j10, D, p2Var, i10, peer, x70Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            d2Var.setOnCancelListener(new r70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new q70(d2Var, accountInstance, x70Var, j10, context, p2Var, i10, peer)), 0));
            try {
                d2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, x70 x70Var) {
        int i11;
        u70 u70Var;
        int i12;
        boolean z4;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                dr drVar = new dr(p2Var, arrayList, j10, x70Var);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(drVar);
                    return;
                } else {
                    drVar.show();
                    return;
                }
            }
            return;
        }
        ?? g3Var = new org.telegram.ui.ActionBar.g3(context, false);
        g3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        g3Var.h = arrayList2;
        g3Var.C = x70Var;
        g3Var.f31275s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        g3Var.f31270b = mutate;
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
                        g3Var.f31276w = peer2;
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
                        g3Var.f31276w = peer3;
                        g3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                g3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = g3Var.f31270b;
            i11 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19926fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            g3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        g3Var.fixNavigationBar(i11);
        if (g3Var.f31275s == 0) {
            ?? t70Var = new t70(g3Var, context);
            t70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(t70Var);
            g3Var.setCustomView(nestedScrollView);
            u70Var = t70Var;
        } else {
            u70 u70Var2 = new u70(g3Var, context);
            g3Var.containerView = u70Var2;
            u70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = g3Var.containerView;
            int i17 = g3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            u70Var = u70Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(g3Var.currentAccount).getChat(Long.valueOf(-j10));
        v70 v70Var = new v70(g3Var, context);
        g3Var.d = v70Var;
        g3Var.getContext();
        if (g3Var.f31275s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        v70Var.setLayoutManager(new f2.i0(i12, false));
        v70Var.setAdapter(new y70(g3Var, context));
        v70Var.setVerticalScrollBarEnabled(false);
        v70Var.setClipToPadding(false);
        v70Var.setEnabled(true);
        v70Var.setSelectorDrawableColor(0);
        v70Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        v70Var.setOnScrollListener(new w70(g3Var));
        v70Var.setOnItemClickListener(new gg.v0(12, g3Var, chat));
        if (i10 != 0) {
            u70Var.addView(v70Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            v70Var.setSelectorDrawableColor(0);
            v70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            u70Var.addView(imageView, k7.b6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        g3Var.e = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20069ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            u70Var.addView(textView, k7.b6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            u70Var.addView(textView, k7.b6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(g3Var.getContext());
        g3Var.f31272f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20087og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20131r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = g3Var.h.size();
        for (int i18 = 0; i18 < size3; i18++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) g3Var.h.get(i18));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(g3Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        g3Var.f31272f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        g3Var.f31272f.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20005k5, false));
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder();
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                sb.append(LocaleController.getString(R.string.VoipChannelStart2));
            } else {
                sb.append(LocaleController.getString(R.string.VoipGroupStart2));
            }
            if (g3Var.h.size() > 1) {
                sb.append("\n\n");
                sb.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                g3Var.d.setVisibility(8);
            }
            g3Var.f31272f.setText(sb);
            g3Var.f31272f.setGravity(49);
            u70Var.addView(g3Var.f31272f, k7.b6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z4) {
                g3Var.f31272f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                g3Var.f31272f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = g3Var.f31272f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            u70Var.addView(g3Var.f31272f, k7.b6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            v70 v70Var2 = g3Var.d;
            if (g3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            u70Var.addView(v70Var2, k7.b6.t(i14, 95, 49, 0, 6, 0, 0));
        }
        l00 l00Var = new l00(g3Var, context, false);
        g3Var.f31271c = l00Var;
        ((View) l00Var.f26515c).setOnClickListener(new w2(24, g3Var, x70Var));
        if (g3Var.f31275s == 0) {
            u70Var.addView(l00Var, k7.b6.t(-1, 50, 51, 0, 0, 0, 0));
            l00 l00Var2 = new l00(g3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                l00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) l00Var2.f26515c).setOnClickListener(new g0((Object) g3Var, 29));
            u70Var.addView(l00Var2, k7.b6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            u70Var.addView(l00Var, k7.b6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        g3Var.w(chat, false);
        if (p2Var != 0) {
            if (p2Var.getParentActivity() != null) {
                p2Var.showDialog(g3Var);
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
        TLRPC.InputPeer inputPeer = this.f31277x;
        if (inputPeer != null) {
            x70 x70Var = this.C;
            boolean z4 = true;
            if (this.h.size() <= 1) {
                z4 = false;
            }
            x70Var.a(inputPeer, z4, this.f31278y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z4) {
        String str;
        l00 l00Var = this.f31271c;
        if (this.f31275s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z4);
                return;
            } else {
                l00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z4);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            l00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z4);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        l00Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z4);
    }
}
