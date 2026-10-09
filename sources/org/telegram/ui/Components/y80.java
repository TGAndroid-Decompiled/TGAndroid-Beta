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
public final class y80 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public w80 F;
    public Drawable f33140b;
    public b10 f33141c;
    public u80 d;
    public TextView f33142e;
    public TextView f33143f;
    public ArrayList h;
    public boolean f33144n;
    public int f33145r;
    public int f33146s;
    public TLRPC.Peer v;
    public TLRPC.Peer f33147w;
    public TLRPC.InputPeer f33148x;
    public boolean f33149y;

    public static void o(y80 y80Var, w80 w80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(y80Var.currentAccount).getInputPeer(MessageObject.getPeerId(y80Var.v));
        if (y80Var.f33146s == 2) {
            if (y80Var.v != y80Var.f33147w) {
                boolean z10 = true;
                if (y80Var.h.size() <= 1) {
                    z10 = false;
                }
                w80Var.a(inputPeer, z10, false, false);
            }
        } else {
            y80Var.f33148x = inputPeer;
        }
        y80Var.dismiss();
    }

    public static void p(y80 y80Var) {
        y80Var.f33148x = MessagesController.getInstance(y80Var.currentAccount).getInputPeer(MessageObject.getPeerId(y80Var.v));
        y80Var.f33149y = true;
        y80Var.dismiss();
    }

    public static void q(y80 y80Var) {
        u80 u80Var = y80Var.d;
        if (y80Var.f33146s != 0) {
            if (u80Var.getChildCount() <= 0) {
                int paddingTop = u80Var.getPaddingTop();
                y80Var.f33145r = paddingTop;
                u80Var.setTopGlowOffset(paddingTop);
                y80Var.containerView.invalidate();
                return;
            }
            int i10 = 0;
            View childAt = u80Var.getChildAt(0);
            am0 am0Var = (am0) u80Var.G(childAt);
            int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
            if (top > 0 && am0Var != null && am0Var.b() == 0) {
                i10 = top;
            }
            if (y80Var.f33145r != i10) {
                y80Var.f33142e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
                y80Var.f33143f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
                y80Var.f33145r = i10;
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
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        b2Var.setOnCancelListener(new r80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ma(b2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, w80 w80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() == 1 && i10 != 0) {
                    w80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                } else {
                    x(context, j3, G, n2Var, i10, peer, w80Var);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            b2Var.setOnCancelListener(new r80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new q80(b2Var, accountInstance, w80Var, j3, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, w80 w80Var) {
        int i11;
        t80 t80Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        if (i10 == 0) {
            if (!arrayList.isEmpty()) {
                wr wrVar = new wr(n2Var, arrayList, j3, w80Var);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(wrVar);
                    return;
                } else {
                    wrVar.show();
                    return;
                }
            }
            return;
        }
        ?? f3Var = new org.telegram.ui.ActionBar.f3(context, false);
        f3Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        f3Var.h = arrayList2;
        f3Var.F = w80Var;
        f3Var.f33146s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        f3Var.f33140b = mutate;
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
                        f3Var.f33147w = peer2;
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
                        f3Var.f33147w = peer3;
                        f3Var.v = peer3;
                        break;
                    }
                    i16++;
                }
            } else {
                f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = f3Var.f33140b;
            i11 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20843fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            f3Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        f3Var.fixNavigationBar(i11);
        if (f3Var.f33146s == 0) {
            ?? s80Var = new s80(f3Var, context);
            s80Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(s80Var);
            f3Var.setCustomView(nestedScrollView);
            t80Var = s80Var;
        } else {
            t80 t80Var2 = new t80(f3Var, context);
            f3Var.containerView = t80Var2;
            t80Var2.setWillNotDraw(false);
            ViewGroup viewGroup = f3Var.containerView;
            int i17 = f3Var.backgroundPaddingLeft;
            viewGroup.setPadding(i17, 0, i17, 0);
            t80Var = t80Var2;
        }
        TLRPC.Chat chat = MessagesController.getInstance(f3Var.currentAccount).getChat(Long.valueOf(-j3));
        u80 u80Var = new u80(f3Var, context);
        f3Var.d = u80Var;
        f3Var.getContext();
        if (f3Var.f33146s == 0) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        u80Var.setLayoutManager(new s4.d0(i12, false));
        u80Var.setAdapter(new x80(f3Var, context));
        u80Var.setVerticalScrollBarEnabled(false);
        u80Var.setClipToPadding(false);
        u80Var.setEnabled(true);
        u80Var.setSelectorDrawableColor(0);
        u80Var.setGlowColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A5, false));
        u80Var.setOnScrollListener(new v80(f3Var));
        u80Var.setOnItemClickListener(new ai.o6(11, f3Var, chat));
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
        f3Var.f33142e = textView;
        org.telegram.messenger.bi.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20990ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false));
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
        TextView textView2 = new TextView(f3Var.getContext());
        f3Var.f33143f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21008og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21054r5, false));
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
        f3Var.f33143f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        f3Var.f33143f.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20924k5, false));
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
            f3Var.f33143f.setText(sb2);
            f3Var.f33143f.setGravity(49);
            t80Var.addView(f3Var.f33143f, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                f3Var.f33143f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                f3Var.f33143f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            TextView textView3 = f3Var.f33143f;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            t80Var.addView(f3Var.f33143f, w7.x5.a(-2.0f, 23.0f, 0.0f, 23.0f, 5.0f, -2, 51));
        }
        if (i10 == 0) {
            u80 u80Var2 = f3Var.d;
            if (f3Var.h.size() < 5) {
                i14 = -2;
            } else {
                i14 = -1;
            }
            t80Var.addView(u80Var2, w7.x5.t(i14, 95, 49, 0, 6, 0, 0));
        }
        b10 b10Var = new b10(f3Var, context, false);
        f3Var.f33141c = b10Var;
        ((View) b10Var.f24843c).setOnClickListener(new ut(9, f3Var, w80Var));
        if (f3Var.f33146s == 0) {
            t80Var.addView(b10Var, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
            b10 b10Var2 = new b10(f3Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                b10Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                b10Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) b10Var2.f24843c).setOnClickListener(new f0((Object) f3Var, 28));
            t80Var.addView(b10Var2, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            t80Var.addView(b10Var, w7.x5.a(50.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        }
        f3Var.y(chat, false);
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
        TLRPC.InputPeer inputPeer = this.f33148x;
        if (inputPeer != null) {
            w80 w80Var = this.F;
            boolean z10 = true;
            if (this.h.size() <= 1) {
                z10 = false;
            }
            w80Var.a(inputPeer, z10, this.f33149y, false);
        }
    }

    public final void y(TLRPC.Chat chat, boolean z10) {
        String str;
        b10 b10Var = this.f33141c;
        if (this.f33146s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                b10Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                b10Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            b10Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
        int i10 = R.string.VoipGroupContinueAs;
        if (chat2 != null) {
            str = chat2.title;
        } else {
            str = "";
        }
        b10Var.a(LocaleController.formatString("VoipGroupContinueAs", i10, str), z10);
    }
}
