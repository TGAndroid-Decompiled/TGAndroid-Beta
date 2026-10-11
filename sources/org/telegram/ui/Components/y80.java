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
public final class y80 extends org.telegram.ui.ActionBar.e3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public w80 F;
    public Drawable f33176b;
    public c10 f33177c;
    public u80 d;
    public TextView f33178e;
    public TextView f33179f;
    public ArrayList h;
    public boolean f33180n;
    public int f33181r;
    public int f33182s;
    public TLRPC.Peer v;
    public TLRPC.Peer f33183w;
    public TLRPC.InputPeer f33184x;
    public boolean f33185y;

    public static void o(y80 y80Var, w80 w80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(y80Var.currentAccount).getInputPeer(MessageObject.getPeerId(y80Var.v));
        if (y80Var.f33182s == 2) {
            if (y80Var.v != y80Var.f33183w) {
                boolean z10 = true;
                if (y80Var.h.size() <= 1) {
                    z10 = false;
                }
                w80Var.a(inputPeer, z10, false, false);
            }
        } else {
            y80Var.f33184x = inputPeer;
        }
        y80Var.dismiss();
    }

    public static void p(y80 y80Var) {
        y80Var.f33184x = MessagesController.getInstance(y80Var.currentAccount).getInputPeer(MessageObject.getPeerId(y80Var.v));
        y80Var.f33185y = true;
        y80Var.dismiss();
    }

    public static void q(y80 y80Var) {
        u80 u80Var = y80Var.d;
        if (y80Var.f33182s != 0) {
            if (u80Var.getChildCount() <= 0) {
                int paddingTop = u80Var.getPaddingTop();
                y80Var.f33181r = paddingTop;
                u80Var.setTopGlowOffset(paddingTop);
                y80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = u80Var.getChildAt(0);
            bm0 bm0Var = (bm0) u80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && bm0Var != null && bm0Var.b() == 0) {
                i10 = top;
            }
            if (y80Var.f33181r != i10) {
                y80Var.f33178e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                y80Var.f33179f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                y80Var.f33181r = i10;
                u80Var.setTopGlowOffset(i10);
                y80Var.containerView.invalidate();
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
        a2Var.setOnCancelListener(new r80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ma(a2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            a2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, w80 w80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    w80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    x(context, j3, G, m2Var, i10, peer, w80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            a2Var.setOnCancelListener(new r80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new q80(a2Var, accountInstance, w80Var, j3, context, m2Var, i10, peer)), 0));
            try {
                a2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, w80 w80Var) {
        int i11;
        t80 t80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                xr xrVar = new xr(m2Var, arrayList, j3, w80Var);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(xrVar);
                    return;
                } else {
                    xrVar.show();
                    return;
                }
            }
            return;
        }
        ?? e3Var = new org.telegram.ui.ActionBar.e3(context, false);
        e3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        e3Var.h = arrayList2;
        e3Var.F = w80Var;
        e3Var.f33182s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        e3Var.f33176b = mutate;
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
                        e3Var.f33183w = peer2;
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
                        e3Var.f33183w = peer3;
                        e3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = e3Var.f33176b;
            i11 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20868fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20893h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            e3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        e3Var.fixNavigationBar(i11);
        if (e3Var.f33182s == 0) {
            ?? s80Var = new s80(e3Var, context);
            s80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(s80Var);
            e3Var.setCustomView(nestedScrollView);
            t80Var = s80Var;
        } else {
            t80 t80Var2 = new t80(e3Var, context);
            e3Var.containerView = t80Var2;
            t80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = e3Var.containerView;
            int i17 = e3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            t80Var = t80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(e3Var.currentAccount).getChat(Long.valueOf(-j3));
        u80 u80Var = new u80(e3Var, context);
        e3Var.d = u80Var;
        e3Var.getContext();
        if (e3Var.f33182s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        u80Var.setLayoutManager(new s4.d0(i12, false));
        u80Var.setAdapter(new x80(e3Var, context));
        u80Var.setVerticalScrollBarEnabled(false);
        u80Var.setClipToPadding(false);
        u80Var.setEnabled(true);
        u80Var.setSelectorDrawableColor(0);
        u80Var.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false));
        u80Var.setOnScrollListener(new v80(e3Var));
        u80Var.setOnItemClickListener(new ai.o6(11, e3Var, chat));
        if (i10 != 0) {
            t80Var.addView(u80Var, w7.x5.a(-1.0f, 0.0f, 100.0f, 0.0f, 80.0f, -1, 51));
        } else {
            u80Var.setSelectorDrawableColor(0);
            u80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            t80Var.addView(imageView, w7.x5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        e3Var.f33178e = textView;
        org.telegram.messenger.ai.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21015ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20930j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            t80Var.addView(textView, w7.x5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            t80Var.addView(textView, w7.x5.a(-2.0f, 23.0f, 8.0f, 23.0f, 0.0f, -2, 51));
        }
        TextView textView2 = new TextView(e3Var.getContext());
        e3Var.f33179f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21033og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21080r5, false));
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
        e3Var.f33179f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        e3Var.f33179f.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20949k5, false));
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
            e3Var.f33179f.setText(sb2);
            e3Var.f33179f.setGravity(49);
            t80Var.addView(e3Var.f33179f, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                e3Var.f33179f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                e3Var.f33179f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = e3Var.f33179f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            t80Var.addView(e3Var.f33179f, w7.x5.a(-2.0f, 23.0f, 0.0f, 23.0f, 5.0f, -2, 51));
        }
        if (i10 == 0) {
            u80 u80Var2 = e3Var.d;
            if (e3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            t80Var.addView(u80Var2, w7.x5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        c10 c10Var = new c10(e3Var, context, false);
        e3Var.f33177c = c10Var;
        ((View) c10Var.f25166c).setOnClickListener(new vt(9, e3Var, w80Var));
        if (e3Var.f33182s == 0) {
            t80Var.addView(c10Var, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
            c10 c10Var2 = new c10(e3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                c10Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                c10Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) c10Var2.f25166c).setOnClickListener(new f0((Object) e3Var, 28));
            t80Var.addView(c10Var2, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            t80Var.addView(c10Var, w7.x5.a(50.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
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
        TLRPC.InputPeer inputPeer = this.f33184x;
        if (inputPeer != null) {
            w80 w80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            w80Var.a(inputPeer, z10, this.f33185y, false);
        }
    }

    public final void y(TLRPC.Chat chat, boolean z10) {
        String str;
        c10 c10Var = this.f33177c;
        if (this.f33182s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                c10Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                c10Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            c10Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        c10Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
