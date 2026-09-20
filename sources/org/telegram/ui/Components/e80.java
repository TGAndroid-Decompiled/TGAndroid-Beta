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
public final class e80 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public c80 F;
    public Drawable f23768b;
    public l00 f23769c;
    public a80 d;
    public TextView e;
    public TextView f23770f;
    public ArrayList h;
    public boolean f23771n;
    public int f23772r;
    public int f23773s;
    public TLRPC.Peer v;
    public TLRPC.Peer f23774w;
    public TLRPC.InputPeer f23775x;
    public boolean f23776y;

    public static void m(e80 e80Var, c80 c80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(e80Var.currentAccount).getInputPeer(MessageObject.getPeerId(e80Var.v));
        if (e80Var.f23773s == 2) {
            if (e80Var.v != e80Var.f23774w) {
                boolean z10 = true;
                if (e80Var.h.size() <= 1) {
                    z10 = false;
                }
                c80Var.a(inputPeer, z10, false, false);
            }
        } else {
            e80Var.f23775x = inputPeer;
        }
        e80Var.dismiss();
    }

    public static void n(e80 e80Var) {
        e80Var.f23775x = MessagesController.getInstance(e80Var.currentAccount).getInputPeer(MessageObject.getPeerId(e80Var.v));
        e80Var.f23776y = true;
        e80Var.dismiss();
    }

    public static void o(e80 e80Var) {
        a80 a80Var = e80Var.d;
        if (e80Var.f23773s != 0) {
            if (a80Var.getChildCount() <= 0) {
                int paddingTop = a80Var.getPaddingTop();
                e80Var.f23772r = paddingTop;
                a80Var.setTopGlowOffset(paddingTop);
                e80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = a80Var.getChildAt(0);
            fl0 fl0Var = (fl0) a80Var.H(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
                i10 = top;
            }
            if (e80Var.f23772r != i10) {
                e80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                e80Var.f23770f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                e80Var.f23772r = i10;
                a80Var.setTopGlowOffset(i10);
                e80Var.containerView.invalidate();
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
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        b2Var.setOnCancelListener(new x70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(b2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, c80 c80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    c80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    v(context, j3, G, n2Var, i10, peer, c80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            b2Var.setOnCancelListener(new x70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new w70(b2Var, accountInstance, c80Var, j3, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, c80 c80Var) {
        int i11;
        z70 z70Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                gr grVar = new gr(n2Var, arrayList, j3, c80Var);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(grVar);
                    return;
                } else {
                    grVar.show();
                    return;
                }
            }
            return;
        }
        ?? f3Var = new org.telegram.ui.ActionBar.f3(context, false);
        f3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        f3Var.h = arrayList2;
        f3Var.F = c80Var;
        f3Var.f23773s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        f3Var.f23768b = mutate;
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
                        f3Var.f23774w = peer2;
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
                        f3Var.f23774w = peer3;
                        f3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = f3Var.f23768b;
            i11 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19138fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19165h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        f3Var.fixNavigationBar(i11);
        if (f3Var.f23773s == 0) {
            ?? y70Var = new y70(f3Var, context);
            y70Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(y70Var);
            f3Var.setCustomView(nestedScrollView);
            z70Var = y70Var;
        } else {
            z70 z70Var2 = new z70(f3Var, context);
            f3Var.containerView = z70Var2;
            z70Var2.setWillNotDraw(false);
            ViewGroup viewGroup = f3Var.containerView;
            int i17 = f3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            z70Var = z70Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(f3Var.currentAccount).getChat(Long.valueOf(-j3));
        a80 a80Var = new a80(f3Var, context);
        f3Var.d = a80Var;
        f3Var.getContext();
        if (f3Var.f23773s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        a80Var.setLayoutManager(new s4.c0(i12, false));
        a80Var.setAdapter(new d80(f3Var, context));
        a80Var.setVerticalScrollBarEnabled(false);
        a80Var.setClipToPadding(false);
        a80Var.setEnabled(true);
        a80Var.setSelectorDrawableColor(0);
        a80Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        a80Var.setOnScrollListener(new b80(f3Var));
        a80Var.setOnItemClickListener(new ai.o6(11, f3Var, chat));
        if (i10 != 0) {
            z70Var.addView(a80Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            a80Var.setSelectorDrawableColor(0);
            a80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_schedule, 120, 120, null);
            imageView.d();
            z70Var.addView(imageView, w7.y5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        f3Var.e = textView;
        org.telegram.messenger.rk.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19286ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19201j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            z70Var.addView(textView, w7.y5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            z70Var.addView(textView, w7.y5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(f3Var.getContext());
        f3Var.f23770f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19305og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19350r5, false));
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
        f3Var.f23770f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f3Var.f23770f.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19221k5, false));
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
            f3Var.f23770f.setText(sb2);
            f3Var.f23770f.setGravity(49);
            z70Var.addView(f3Var.f23770f, w7.y5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                f3Var.f23770f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                f3Var.f23770f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = f3Var.f23770f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            z70Var.addView(f3Var.f23770f, w7.y5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            a80 a80Var2 = f3Var.d;
            if (f3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            z70Var.addView(a80Var2, w7.y5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        l00 l00Var = new l00(f3Var, context, false);
        f3Var.f23769c = l00Var;
        ((View) l00Var.f25982c).setOnClickListener(new dt(9, f3Var, c80Var));
        if (f3Var.f23773s == 0) {
            z70Var.addView(l00Var, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
            l00 l00Var2 = new l00(f3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                l00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) l00Var2.f25982c).setOnClickListener(new f0((Object) f3Var, 29));
            z70Var.addView(l00Var2, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            z70Var.addView(l00Var, w7.y5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        f3Var.w(chat, false);
        if (n2Var != 0) {
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(f3Var);
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
        TLRPC.InputPeer inputPeer = this.f23775x;
        if (inputPeer != null) {
            c80 c80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            c80Var.a(inputPeer, z10, this.f23776y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        String str;
        l00 l00Var = this.f23769c;
        if (this.f23773s == 0) {
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
